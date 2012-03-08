package net.minecraft.src.blocks;

import net.minecraft.src.*;

public class BrickIceMagicSlabItem extends CustomItemBlockInfi
{
	public static final String blockType[] =
		{
		    "ice", "smallIce", "fancyIce"
		};

    public BrickIceMagicSlabItem(int i)
    {
        super(i);
        setMaxDamage(0);
        setHasSubtypes(true);
    }

    public int getIconFromDamage(int i)
    {
        return mod_InfiBlocks.iceBrickMagicSlab.getBlockTextureFromSideAndMetadata(0, i);
    }

    public String getItemNameIS(ItemStack itemstack)
    {
        return (new StringBuilder()).append(blockType[itemstack.getItemDamage()]).append("BrickMagicSlab").toString();
    }
}
