package net.minecraft.src.blocks;

import net.minecraft.src.*;

public class BrownstoneMagicSlabItem extends CustomItemBlockInfi
{
	public static final String blockType[] =
		{
		    "raw", "smelted", "road", "brick", "brickSmall", "fancy"
		};

    public BrownstoneMagicSlabItem(int i)
    {
        super(i);
        setMaxDamage(0);
        setHasSubtypes(true);
    }

    public int getIconFromDamage(int i)
    {
        return mod_InfiBlocks.brownstoneMagicSlab.getBlockTextureFromSideAndMetadata(0, i);
    }

    public String getItemNameIS(ItemStack itemstack)
    {
        return (new StringBuilder()).append(blockType[itemstack.getItemDamage()]).append("BrownstoneMagicSlab").toString();
    }
}
