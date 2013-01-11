package inficraft.microblocks.core.net;

import inficraft.microblocks.core.ImmibisCore;
import inficraft.microblocks.core.api.net.IPacket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

import net.minecraft.entity.player.EntityPlayer;

public class PacketFragment implements IPacket {
	
	public int senderSeqID;
	public int fragmentIndex;
	public int numFragments;
	public byte[] data;
	public String channel;

	@Override
	public byte getID() {
		return (byte)ImmibisCore.PACKET_TYPE_FRAGMENT;
	}

	@Override
	public void read(DataInputStream in) throws IOException {
		senderSeqID = in.readShort();
		fragmentIndex = in.readShort();
		numFragments = in.readShort();
		channel = in.readUTF();
		
		int len = in.readShort();
		if(len < 0 || len > 32767)
			throw new IOException("invalid data length in packet fragment");
		data = new byte[len];
		if(in.read(data) < len)
			throw new IOException("truncated data in packet fragment");
	}

	@Override
	public void write(DataOutputStream out) throws IOException {
		out.writeShort(senderSeqID);
		out.writeShort(fragmentIndex);
		out.writeShort(numFragments);
		out.writeUTF(channel);
		out.writeShort(data.length);
		out.write(data);
	}

	@Override
	public void onReceived(EntityPlayer source) {
		FragmentSequence.add(source, this);
	}
	
	@Override
	public String getChannel() {
		return ImmibisCore.CHANNEL;
	}

}
