package net.minecraft.src.blocks;

import net.minecraft.src.*;
import net.minecraft.src.forge.*;

public class StainedGlassItem extends CustomItemBlockInfi
{
	public static final String blockType[] =
	    {
	        "white", "orange", "magenta", "lightblue", "yellow", "lime", "pink", "gray", "lightgray", "cyan",
	        "purple", "blue", "brown", "green", "red", "black"
	    };

    public StainedGlassItem(int i)
    {
        super(i);
        setMaxDamage(0);
        setHasSubtypes(true);
    }

    public int getIconFromDamage(int i)
    {
        return mod_InfiBlocks.stainedGlass.getBlockTextureFromSideAndMetadata(0, i);
    }

    public String getItemNameIS(ItemStack itemstack)
    {
        return (new StringBuilder()).append(blockType[itemstack.getItemDamage()]).append("Glass").toString();
    }
}
