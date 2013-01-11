package inficraft.microblocks.core.microblock;

import inficraft.microblocks.core.api.multipart.ICoverSystem;
import inficraft.microblocks.core.api.multipart.IMultipartTile;
import inficraft.microblocks.core.api.net.IPacket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class PacketMicroblockContainerDescription implements IPacket {
	
	public int x, y, z;
	public byte[] data;

	@Override
	public byte getID() {
		return MicroblockSystem.PKT_S2C_MICROBLOCK_CONTAINER_DESCRIPTION;
	}

	@Override
	public String getChannel() {
		return MicroblockSystem.CHANNEL;
	}

	@Override
	public void read(DataInputStream in) throws IOException {
		x = in.readInt();
		y = in.readInt();
		z = in.readInt();
		int len = in.readShort();
		data = new byte[len];
		in.read(data);
	}

	@Override
	public void write(DataOutputStream out) throws IOException {
		out.writeInt(x);
		out.writeInt(y);
		out.writeInt(z);
		out.writeShort(data.length);
		out.write(data);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void onReceived(EntityPlayer source) {
		World w = Minecraft.getMinecraft().theWorld;
		IMultipartTile te = ((IMultipartTile)w.getBlockTileEntity(x, y, z));
		ICoverSystem ci = te.getCoverSystem();
		if(ci instanceof MicroblockCoverSystem)
			((MicroblockCoverSystem)ci).readDescriptionBytes(data, 0);
	}

}
