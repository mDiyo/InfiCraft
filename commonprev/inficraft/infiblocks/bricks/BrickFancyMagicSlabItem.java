package inficraft.infiblocks.bricks;

import net.minecraft.src.ItemBlock;
import net.minecraft.src.ItemStack;

public class BrickFancyMagicSlabItem extends ItemBlock
{
	public static final String blockType[] =
		{
		    "obsidian", "snow", "sandstone", "brick", "netherrack", "diamond", "gold", "lapis", 
		    "slab", "stone", "", "brickTile", "iron", "redstone", "slime", "bone"
		};

    public BrickFancyMagicSlabItem(int i)
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
        return (new StringBuilder()).append(blockType[itemstack.getItemDamage()]).append("FancyBrickMagicSlab").toString();
    }
}
