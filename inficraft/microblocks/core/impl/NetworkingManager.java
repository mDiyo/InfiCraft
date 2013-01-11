package inficraft.microblocks.core.impl;

import inficraft.microblocks.core.api.net.INetworkingManager;
import inficraft.microblocks.core.api.net.IPacket;
import inficraft.microblocks.core.api.net.IPacketMap;
import inficraft.microblocks.core.api.porting.SidedProxy;
import inficraft.microblocks.core.net.PacketFragment;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Level;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.network.INetworkManager;
import net.minecraft.network.packet.Packet250CustomPayload;
import net.minecraft.src.ModLoader;
import cpw.mods.fml.common.network.IPacketHandler;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.network.PacketDispatcher;
import cpw.mods.fml.common.network.Player;
import cpw.mods.fml.relauncher.Side;

public class NetworkingManager implements INetworkingManager {

	// Sends a packet to a player on a channel.
	// If player is null, packet is sent to the server.
	
	private static final AtomicInteger nextFragmentSequenceID = new AtomicInteger(0);
	
	private static final int MAX_PACKET_SIZE = 32767;
	private static final int FRAGMENT_SIZE = 32500;
	
	private void send250(Packet250CustomPayload p250, EntityPlayer target) {
		if(p250.data.length <= MAX_PACKET_SIZE) {
			if(target == null)
				PacketDispatcher.sendPacketToServer(p250);
			else if(target instanceof Player)
				PacketDispatcher.sendPacketToPlayer(p250, (Player)target);
			else
				System.err.println("[Immibis Core] Can't send packet (channel "+p250.channel+") to non-player "+target);
			return;
		}
		int seqID = nextFragmentSequenceID.incrementAndGet();
		
		int numFragments = (p250.data.length + FRAGMENT_SIZE - 1) / FRAGMENT_SIZE;
		int start = 0;
		
		//System.out.println("Splitting "+p250.data.length+"-size packet into "+numFragments+" fragments");
		
		for(int k = 0; k < numFragments; k++) {
			int fragmentLen = Math.min(FRAGMENT_SIZE, p250.data.length - start);
			
			PacketFragment fragment = new PacketFragment();
			fragment.fragmentIndex = k;
			fragment.numFragments = numFragments;
			fragment.senderSeqID = seqID;
			fragment.channel = p250.channel;
			fragment.data = new byte[fragmentLen];
			
			System.arraycopy(p250.data, start, fragment.data, 0, fragmentLen);
			start += fragmentLen;
			
			send250(wrap(fragment), target);
		}
	}
	
	// Always closes "in"
	private static void onReceivePacket(String channel, DataInputStream in, EntityPlayer source, IPacketMap mod) {
		
		try {
			byte id = in.readByte();
			IPacket packet = source == null ? mod.createS2CPacket(id) : mod.createC2SPacket(id);
			if(packet == null) {
				System.err.println("[Immibis Core] Received packet with invalid ID "+id+" (on channel "+channel+", mod "+mod+")");
				return;
			}
			packet.read(in);
			packet.onReceived(source);
		} catch(IOException e) {
			ModLoader.getLogger().log(Level.SEVERE, "While trying to receive packet on channel " + channel, e);
		} finally {
			try {
				in.close();
			} catch(Exception e) {e.printStackTrace();}
		}
	}
	
	public static void onReceivePacket(String channel, DataInputStream in, EntityPlayer source) {
		IPacketMap mod = channels.get(channel);
		if(mod == null) {
			System.err.println("Received fragmented packet on unknown channel '"+channel+"' from "+(source == null ? "server" : "client '"+source.username+"'"));
			try {
				in.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
			return;
		}
		onReceivePacket(channel, in, source, mod);
	}
	
	static Map<String, IPacketMap> channels = new HashMap<String, IPacketMap>();

	@Override
	public Packet250CustomPayload wrap(IPacket packet) {
		Packet250CustomPayload p = new Packet250CustomPayload();
		p.channel = packet.getChannel();
		ByteArrayOutputStream bytes = new ByteArrayOutputStream();
		DataOutputStream out = new DataOutputStream(bytes);
		try {
			out.writeByte(packet.getID());
			packet.write(out);
			
			p.data = bytes.toByteArray();
			p.length = p.data.length;
			
			return p;
			
		} catch(IOException e) {
			ModLoader.getLogger().log(Level.SEVERE, "While trying to send packet of type "+packet.getClass().getName(), e);
			return null;
		} finally {
			try {
				out.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public void sendToServer(IPacket packet) {
		if(SidedProxy.instance.isDedicatedServer())
			throw new IllegalStateException("can't send packets to the server on the server.");
		send250(wrap(packet), null);
	}

	@Override
	public void sendToClient(IPacket packet, EntityPlayer target) {
		send250(wrap(packet), target);
	}

	@Override
	public void listen(final IPacketMap handler) {
		channels.put(handler.getChannel(), handler);
		NetworkRegistry.instance().registerChannel(new IPacketHandler() {
			@Override
			public void onPacketData(INetworkManager manager, Packet250CustomPayload packet, Player player) {
				onReceivePacket(packet.channel, new DataInputStream(new ByteArrayInputStream(packet.data)), null, handler);
			}
		}, handler.getChannel(), Side.CLIENT);
		NetworkRegistry.instance().registerChannel(new IPacketHandler() {
			@Override
			public void onPacketData(INetworkManager manager, Packet250CustomPayload packet, Player player) {
				onReceivePacket(packet.channel, new DataInputStream(new ByteArrayInputStream(packet.data)), (EntityPlayer)player, handler);
			}
		}, handler.getChannel(), Side.SERVER);
	}
	
	
}
