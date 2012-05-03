package net.minecraft.src.blocks.magicslabs;

import net.minecraft.src.*;

public class BrownstoneMagicSlabItem extends ItemBlock
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

    @Override
    public int getMetadata(int md)
    {
        return md;
    }

    public String getItemNameIS(ItemStack itemstack)
    {
        return (new StringBuilder()).append(blockType[itemstack.getItemDamage()]).append("BrownstoneMagicSlab").toString();
    }
}
