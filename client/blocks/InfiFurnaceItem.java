package net.minecraft.src.blocks;

import net.minecraft.src.ItemBlock;
import net.minecraft.src.ItemStack;

public class InfiFurnaceItem extends ItemBlock
{
    public static final String blockType[] =
    {
        "iron", "brick", "sandstone", "obsidian", "redstone", "netherrack", 
        "stonebrick", "endstone", "glowstone"
    };

    public InfiFurnaceItem(int i)
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
        return (new StringBuilder()).append(blockType[itemstack.getItemDamage()]).append("FurnaceInfi").toString();
    }
}
