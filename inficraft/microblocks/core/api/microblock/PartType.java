package inficraft.microblocks.core.api.microblock;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;

/**
 * This class may incompatibly change in the future.
 * Mods are not recommended to use it.
 */
public class PartType {
	public final EnumPartClass clazz;
	public final double size;
	public final String name;
	public int[] textures;
	public int id;
	public float hardness;
	public String texfile = "/terrain.png";
	
	private static final int[] DEFAULT_TEXTURES = new int[] {0, 1, 2, 3, 4, 5};
	
	public boolean canHarvestCover(EntityPlayer ply) {
		return modelBlock.canHarvestBlock(ply, modelMeta);
	}
	
	public PartType(EnumPartClass clazz, double size, String name, float strength, Block modelBlock, int modelMeta) {
		this.clazz = clazz;
		this.size = size;
		this.name = name;
		this.hardness = strength;
		this.modelBlock = modelBlock;
		this.modelMeta = modelMeta;
		textures = DEFAULT_TEXTURES;
	}
	
	public Block modelBlock;
	public int modelMeta;
	
}
