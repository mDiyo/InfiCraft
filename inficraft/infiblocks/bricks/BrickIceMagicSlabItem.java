package inficraft.infiblocks.bricks;

import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class BrickIceMagicSlabItem extends ItemBlock
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

    @Override
    public int getMetadata(int md)
    {
        return md;
    }

    public String getItemNameIS(ItemStack itemstack)
    {
        return (new StringBuilder()).append(blockType[itemstack.getItemDamage()]).append("BrickMagicSlab").toString();
    }
}
