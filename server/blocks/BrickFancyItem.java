package net.minecraft.src.blocks;

import net.minecraft.src.*;
import net.minecraft.src.forge.*;

public class BrickFancyItem extends CustomItemBlockInfi
{
	public static final String blockType[] =
	{
	    "obsidian", "snow", "sandstone", "brick", "netherrack", "diamond", "gold", "lapis", 
	    "slab", "stone", "", "brickTile", "iron", "redstone", "slime", "bone"
	};

    public BrickFancyItem(int i)
    {
        super(i);
        setMaxDamage(0);
        setHasSubtypes(true);
    }

    public int getIconFromDamage(int i)
    {
        return mod_InfiBlocks.fancyBrick.getBlockTextureFromSideAndMetadata(0, i);
    }

    public String getItemNameIS(ItemStack itemstack)
    {
        return (new StringBuilder()).append(blockType[itemstack.getItemDamage()]).append("FancyBrick").toString();
    }
}
