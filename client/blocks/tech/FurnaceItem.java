package net.minecraft.src.blocks.tech;

import net.minecraft.src.*;

public class FurnaceItem extends ItemBlock
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

    @Override
    public int getMetadata(int md)
    {
        return md;
    }
    
    public String getItemNameIS(ItemStack itemstack)
    {
        return (new StringBuilder()).append(blockType[itemstack.getItemDamage()]).append("FurnaceInfi").toString();
    }
}
