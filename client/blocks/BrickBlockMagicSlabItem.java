package net.minecraft.src.blocks;

import net.minecraft.src.*;
import net.minecraft.src.forge.MinecraftForgeClient;

public class BrickBlockMagicSlabItem extends CustomItemBlockInfi
{
	public static final String blockType[] =
		{
		    "obsidian", "snow", "sandstone", "brick", "netherrack", "diamond", "gold", "lapis", 
		    "slab", "stoneSmall", "slabSmall", "brickTile", "iron", "redstone", "slime", "bone"
		};

    public BrickBlockMagicSlabItem(int i)
    {
        super(i);
        setMaxDamage(0);
        setHasSubtypes(true);
        MinecraftForgeClient.registerCustomItemRenderer(mod_InfiBlocks.brickMagicSlab.blockID, this);
    }

    public int getIconFromDamage(int i)
    {
        return mod_InfiBlocks.brickMagicSlab.getBlockTextureFromSideAndMetadata(0, i);
    }

    public String getItemNameIS(ItemStack itemstack)
    {
        return (new StringBuilder()).append(blockType[itemstack.getItemDamage()]).append("BrickMagicSlab").toString();
    }
}
