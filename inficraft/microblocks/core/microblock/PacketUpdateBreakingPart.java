package inficraft.microblocks.core.microblock;

import inficraft.microblocks.core.ImmibisCore;
import inficraft.microblocks.core.api.net.IPacket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

import net.minecraft.entity.player.EntityPlayer;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class PacketUpdateBreakingPart implements IPacket {
	
	public int x, y, z, part;
	
	public PacketUpdateBreakingPart() {}
	
	public PacketUpdateBreakingPart(int x, int y, int z, int part) {
		this.x = x;
		this.y = y;
		this.z = z;
		this.part = part;
	}

	@Override
	public byte getID() {
		return ImmibisCore.PACKET_TYPE_S2C_UPDATE_BREAKING_PART;
	}

	@Override
	public void read(DataInputStream in) throws IOException {
		x = in.readInt();
		y = in.readInt();
		z = in.readInt();
		part = in.readShort();
	}

	@Override
	public void write(DataOutputStream out) throws IOException {
		out.writeInt(x);
		out.writeInt(y);
		out.writeInt(z);
		out.writeShort(part);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void onReceived(EntityPlayer source) {
		if(source == null) {
			//TileEntity te = Minecraft.getMinecraft().theWorld.getBlockTileEntity(x, y, z);
			//if(te instanceof IMultipartTile)
				//((IMultipartTile)te).setPartiallyDamagedPart(part);
		}
	}
	
	@Override
	public String getChannel() {
		return ImmibisCore.CHANNEL;
	}

}
