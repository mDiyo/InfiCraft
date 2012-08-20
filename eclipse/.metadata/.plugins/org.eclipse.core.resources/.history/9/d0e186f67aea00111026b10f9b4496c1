package mdiyo.inficraft.infiblocks.bricks;

import net.minecraft.src.*;

public class BrickBlockMagicSlabItem extends ItemBlock
{
	public static final String blockType[] =
		{
		    "obsidian", "snow", "sandstone", "brick", "netherrack", "diamond", "gold", "lapis", 
		    "slab", "stoneSmall", "slabSmall", "brickTile", "iron", "redstone", "slime", "bone"
		};

    public BrickBlockMagicSlabItem(int i)
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
