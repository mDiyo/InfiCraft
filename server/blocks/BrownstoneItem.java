package net.minecraft.src.blocks;

import net.minecraft.src.*;
import net.minecraft.src.forge.*;

public class BrownstoneItem extends CustomItemBlockInfi
{
	public static final String blockType[] =
	{
	    "raw", "smelted", "road", "brick", "brickSmall", "fancy"
	};

    public BrownstoneItem(int i)
    {
        super(i);
        setMaxDamage(0);
        setHasSubtypes(true);
    }

    public int getIconFromDamage(int i)
    {
        return mod_InfiBlocks.brownstone.getBlockTextureFromSideAndMetadata(0, i);
    }

    public String getItemNameIS(ItemStack itemstack)
    {
        return (new StringBuilder()).append(blockType[itemstack.getItemDamage()]).append("Brownstone").toString();
    }
}
