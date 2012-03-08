package net.minecraft.src.blocks;

import net.minecraft.src.*;
import net.minecraft.src.forge.*;

public class WorkbenchItem extends CustomItemBlockInfi
{
    public static final String blockType[] =
    {
        "cobblestone", "iron", "redstone", "bone", "sandstone", "lapis", "obsidian",
        "cactus", "netherrack", "ice", "stoneBrick"
    };

    public WorkbenchItem(int i)
    {
        super(i);
        setMaxDamage(0);
        setHasSubtypes(true);
    }

    public int getIconFromDamage(int i)
    {
        return mod_InfiBlocks.workbench.getBlockTextureFromSideAndMetadata(0, i);
    }

    public String getItemNameIS(ItemStack itemstack)
    {
        return (new StringBuilder()).append(blockType[itemstack.getItemDamage()]).append("Workbench").toString();
    }
}
