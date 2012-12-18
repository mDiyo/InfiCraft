package inficraft.infiblocks.blocks;

import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class StorageBlockItem extends ItemBlock
{
	public static final String blockType[] =
	{
	    "coal", "charcoal", "redstone", "slime", "bone", "wheat", "dirt", "", "", "", "", "",
	    "netherrack", "sandstone", "slab", "brick"
	};

    public StorageBlockItem(int i)
    {
        super(i);
        setMaxDamage(0);
        setHasSubtypes(true);
    }

    public int getMetadata(int i)
    {
        return i;
    }

    public String getItemNameIS(ItemStack itemstack)
    {
        return (new StringBuilder()).append(blockType[itemstack.getItemDamage()]).append("Storage").toString();
    }
}
