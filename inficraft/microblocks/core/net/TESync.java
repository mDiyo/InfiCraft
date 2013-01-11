package inficraft.microblocks.core.net;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.packet.Packet132TileEntityData;

public class TESync {
	public static Packet132TileEntityData make132(int x, int y, int z, int a, int b, int c) {
		Packet132TileEntityData p = new Packet132TileEntityData();
		p.xPosition = x;
		p.yPosition = y;
		p.zPosition = z;
		p.isChunkDataPacket = true;
		p.customParam1 = new NBTTagCompound();
		p.customParam1.setInteger("a", a);
		p.customParam1.setInteger("b", b);
		p.customParam1.setInteger("c", c);
		return p;
	}
	
	public static int getFirst(Packet132TileEntityData p) {return p.customParam1.getInteger("a");}
	public static int getSecond(Packet132TileEntityData p) {return p.customParam1.getInteger("b");}
	public static int getThird(Packet132TileEntityData p) {return p.customParam1.getInteger("c");}
}
