package net.minecraft.src.blocks;

import net.minecraft.src.*;

public class MagicSlabStoneItem extends ItemBlock
{
    public static final String blockType[] =
    {
        "stone", "slabstone", "cobblestone", "stonebrick", "crackedstonebrick", "mossystonebrick",
        "brick", "mossy", "obsidian", "netherrack", "sandstone", "iron", "gold", "diamond",
        "endstone", "netherBrick"
    };

    public MagicSlabStoneItem(int i)
    {
        super(i);
        setMaxDamage(0);
        setHasSubtypes(true);
    }

    public int getIconFromDamage(int i)
    {
        return mod_InfiBlocks.magicSlabStone.getBlockTextureFromSideAndMetadata(0, i);
    }

    public int getMetadata(int i)
    {
        return i;
    }

    public String getItemNameIS(ItemStack itemstack)
    {
        return (new StringBuilder()).append(blockType[itemstack.getItemDamage()]).append("MagicSlab").toString();
    }
}
