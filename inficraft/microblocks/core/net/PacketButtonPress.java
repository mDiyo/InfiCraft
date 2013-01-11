package inficraft.microblocks.core.net;

import inficraft.microblocks.core.ImmibisCore;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class PacketButtonPress extends AbstractContainerSyncPacket {
	
	public int buttonID;
	
	public PacketButtonPress(int button) {
		buttonID = button;
	}

	@Override
	public byte getID() {
		return ImmibisCore.PACKET_TYPE_C2S_BUTTON_PRESS;
	}

	@Override
	public void read(DataInputStream in) throws IOException {
		buttonID = in.readInt();
	}

	@Override
	public void write(DataOutputStream out) throws IOException {
		out.writeInt(buttonID);
	}
	
	@Override
	public String getChannel() {
		return ImmibisCore.CHANNEL;
	}
	
}
