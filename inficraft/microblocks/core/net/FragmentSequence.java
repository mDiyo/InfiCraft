package inficraft.microblocks.core.net;

import inficraft.microblocks.core.ImmibisCore;
import inficraft.microblocks.core.MainThreadTaskQueue;
import inficraft.microblocks.core.impl.NetworkingManager;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.util.ArrayList;
import java.util.Map;
import java.util.TimerTask;
import java.util.WeakHashMap;

import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityClientPlayerMP;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.network.NetServerHandler;
import net.minecraft.network.packet.Packet255KickDisconnect;
import net.minecraft.server.MinecraftServer;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

/*
 * An instance of FragmentSequence stores all fragments that make up a particular high-level packet.
 * 
 * This class is accessed from various network threads, and also from a timer thread to clean up
 * timed out sequences.
 *
 * Since it's accessed relatively infrequently (packets big enough to be fragmented are rare),
 * all code that accesses FragmentSequence instances or static fields is synchronized on FragmentSequence.class.
 * 
 * The only exception is processing of completed fragment sequences, which requires access to the completed sequence.
 * At that point, that code holds the only reference to the completed sequence, so concurrent access is impossible. 
 */
public class FragmentSequence {
	
	private static int TIMEOUT = 3000; // milliseconds
	private static int TIMEOUT_CHECK_INTERVAL = 1000; // milliseconds
	
	private final int senderSequenceID;
	private final int totalFragments;
	private final EntityPlayer sender;
	private final String channel;
	private long timeout; // when System.currentTimeMillis() > timeout, discard sequence
	private PacketFragment[] fragments;
	private int receivedFragments;
	
	// While a sequence is stored in this hashmap, all access to it must be synchronized on FragmentSequence.class
	private static WeakHashMap<EntityPlayer, FragmentSequence> bySenderID = new WeakHashMap<EntityPlayer, FragmentSequence>();

	private static boolean initialized = false;
	public synchronized static void init() {
		if(initialized)
			throw new IllegalStateException("Already initialized");
		initialized = true;
		ImmibisCore.TIMER.schedule(new TimerTask() {
			ArrayList<FragmentSequence> toRemove = new ArrayList<FragmentSequence>();
			@Override
			public void run() {
				synchronized(FragmentSequence.class) {
					long time = System.currentTimeMillis();
					for(Map.Entry<EntityPlayer, FragmentSequence> e : bySenderID.entrySet())
						if(time > e.getValue().timeout)
							toRemove.add(e.getValue());
					for(FragmentSequence seq : toRemove)
						seq.abort("Timed out waiting for packet fragment");
				}
				toRemove.clear();
			}
		}, TIMEOUT_CHECK_INTERVAL, TIMEOUT_CHECK_INTERVAL);
	}
	
	private static void kickPlayer(FragmentSequence sequence, final EntityPlayer ply,  String reason_) {
		final String reason = reason_ + " (channel: "+sequence.channel+")";
		
		if(ply instanceof EntityPlayerMP) {
			MainThreadTaskQueue.enqueue(new Runnable() {
				@Override
				public void run() {
					NetServerHandler nsh = ((EntityPlayerMP)ply).playerNetServerHandler;
					if(nsh != null)
						nsh.kickPlayerFromServer("Server: "+reason);
				}
			}, Side.SERVER);
		}
		if(ply == null) {
			MainThreadTaskQueue.enqueue(new Runnable() {
				@Override
				@SideOnly(Side.CLIENT)
				public void run() {
					EntityClientPlayerMP ply = Minecraft.getMinecraft().thePlayer;
					if(ply != null && ply.sendQueue != null)
						ply.sendQueue.handleKickDisconnect(new Packet255KickDisconnect("Client: "+reason));
				}
			}, Side.CLIENT);
		}
	}
	
	
	
	/**
	 * Removes the sequence from {@link #bySenderID}, and then kicks the player for the given reason.
	 * @see #finish()
	 */
	private void abort(String reason) {
		synchronized(FragmentSequence.class) {
			if(bySenderID.get(sender) == this)
				bySenderID.remove(sender);
			kickPlayer(this, sender, reason);
		}
	}
	
	/**
	 * Removes the sequence from {@link #bySenderID}.
	 */
	private void finish() {
		synchronized(FragmentSequence.class) {
			if(bySenderID.get(sender) == this)
				bySenderID.remove(sender);
		}
	}
	
	
	
	
	public FragmentSequence(EntityPlayer sender, int senderSeqID, int totalFragments, String channel) {
		this.sender = sender;
		this.senderSequenceID = senderSeqID;
		this.timeout = System.currentTimeMillis() + TIMEOUT;
		this.totalFragments = totalFragments;
		this.channel = channel;
		this.fragments = new PacketFragment[totalFragments];
	}
	
	public static void add(final EntityPlayer sender, PacketFragment fragment) {
		FragmentSequence sequence;
		synchronized(FragmentSequence.class) {
			sequence = bySenderID.get(sender);
			if(sequence == null)
				bySenderID.put(sender, sequence = new FragmentSequence(sender, fragment.senderSeqID, fragment.numFragments, fragment.channel));
				
			if(fragment.numFragments != sequence.totalFragments || fragment.senderSeqID != sequence.senderSequenceID || !fragment.channel.equals(sequence.channel)) {
				sequence.abort("Cannot handle interleaved fragment sequences");
				return;
			}
			if(fragment.fragmentIndex != sequence.receivedFragments) {
				sequence.abort("Cannot handle out-of-order fragments");
				return;
			}
			
			sequence.timeout = System.currentTimeMillis() + TIMEOUT;
			
			//System.out.println("Received segment "+sequence.receivedFragments+"/"+sequence.totalFragments+" of sequence");
			
			sequence.fragments[sequence.receivedFragments++] = fragment;
			if(sequence.receivedFragments == sequence.totalFragments)
				sequence.finish();
			else
				return;
		}
		
		// At this point, sequence holds the only reference to the now-completed sequence, so unsynchronized access is fine
		// (as noted in the class comment)
		
		// The fragments are combined on whatever thread is processing packets (this one),
		// then handed to the main thread for processing.
		
		int totalLength = 0;
		// Assumes no integer overflow - the maximum that can be sent is 32767 packets of 32767 bytes each.
		for(PacketFragment f : sequence.fragments)
			totalLength += f.data.length;
		
		byte[] allData = new byte[totalLength];
		totalLength = 0;
		for(PacketFragment f : sequence.fragments) {
			System.arraycopy(f.data, 0, allData, totalLength, f.data.length);
			totalLength += f.data.length;
		}
		
		final String channel = sequence.channel;
		final DataInputStream in = new DataInputStream(new ByteArrayInputStream(allData));
		
		MainThreadTaskQueue.enqueue(new Runnable() {
			@Override
			public void run() {
				//System.out.println("Processing completed sequence on "+channel+" (1)");
				if(sender == null)
					if(Minecraft.getMinecraft().thePlayer == null)
						return;
				if(sender != null)
					if(MinecraftServer.getServer() == null || MinecraftServer.getServer().getConfigurationManager().getPlayerForUsername(sender.username) != sender)
						return;
				//System.out.println("Processing completed sequence on "+channel+" (2)");
				NetworkingManager.onReceivePacket(channel, in, sender);
			}
		}, sender == null ? Side.CLIENT : Side.SERVER);
	}

}
