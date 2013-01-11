package inficraft.microblocks.core.api.microblock;

import inficraft.microblocks.core.microblock.MicroblockSystem;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.AxisAlignedBB;

public class Part {
	public final PartType type;
	public final EnumPosition pos;
	
	public Part(PartType type, EnumPosition pos) {
		this.type = type;
		this.pos = pos;
	}
	
	private static double getMinFromAxisPosition(EnumAxisPosition ap, double size) {
		switch(ap) {
		case Span:
		case Negative:
			return 0;
		case Positive:
			return 1 - size;
		case Centre:
			return (1 - size) / 2;
		default:
			throw new IllegalArgumentException("ap");
		}
	}
	private static double getMaxFromAxisPosition(EnumAxisPosition ap, double size) {
		switch(ap) {
		case Span:
		case Positive:
			return 1;
		case Negative:
			return size;
		case Centre:
			return (1 + size) / 2;
		default:
			throw new IllegalArgumentException("ap");
		}
	}
	
	public AxisAlignedBB getBoundingBoxFromPool() {
		return getBoundingBoxFromPool(pos, type.size);
	}
	
	public static AxisAlignedBB getBoundingBoxFromPool(EnumPosition pos, double size) {
		double minx = getMinFromAxisPosition(pos.x, size);
		double miny = getMinFromAxisPosition(pos.y, size);
		double minz = getMinFromAxisPosition(pos.z, size);
		double maxx = getMaxFromAxisPosition(pos.x, size);
		double maxy = getMaxFromAxisPosition(pos.y, size);
		double maxz = getMaxFromAxisPosition(pos.z, size);
		return AxisAlignedBB.getAABBPool().addOrModifyAABBInPool(minx, miny, minz, maxx, maxy, maxz);
	}

	public NBTBase writeToNBT() {
		NBTTagCompound c = new NBTTagCompound();
		c.setInteger("type", type.id);
		c.setByte("pos", (byte)pos.ordinal());
		return c;
	}

	public static Part readFromNBT(NBTBase tag) {
		NBTTagCompound c = (NBTTagCompound)tag;
		PartType type = MicroblockSystem.parts.get(c.getInteger("type"));
		if(type == null)
			return null;
		EnumPosition pos = EnumPosition.values()[c.getByte("pos")];
		Part p = new Part(type, pos);
		return p;
	}
}
