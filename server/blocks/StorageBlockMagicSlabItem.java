package net.minecraft.src.blocks;

import net.minecraft.src.*;
import net.minecraft.src.forge.*;

public class StorageBlockMagicSlabItem extends CustomItemBlockInfi
{
	public static final String blockType[] =
	{
	    "coal", "charcoal", "redstone", "slime", "bone", "wheat", "dirt", "", "", "", "", "",
	    "netherrack", "sandstone", "slab", "brick"
	};

    public StorageBlockMagicSlabItem(int i)
    {
        super(i);
        setMaxDamage(0);
        setHasSubtypes(true);
    }

    public int getIconFromDamage(int i)
    {
        return mod_InfiBlocks.storageBlockMagicSlab.getBlockTextureFromSideAndMetadata(0, i);
    }

    public String getItemNameIS(ItemStack itemstack)
    {
        return (new StringBuilder()).append(blockType[itemstack.getItemDamage()]).append("StorageMagicSlab").toString();
    }
}
