package net.minecraft.src.blocks;

import net.minecraft.src.*;

public class FurnaceItem extends CustomItemBlockInfi
{
    public static final String blockType[] =
    {
        "iron", "brick", "sandstone", "obsidian", "redstone", "netherrack", 
        "stonebrick", "endstone", "glowstone"
    };

    public FurnaceItem(int i)
    {
        super(i);
        setMaxDamage(0);
        setHasSubtypes(true);
    }

    public String getItemNameIS(ItemStack itemstack)
    {
        return (new StringBuilder()).append(blockType[itemstack.getItemDamage()]).append("FurnaceInfi").toString();
    }
}
