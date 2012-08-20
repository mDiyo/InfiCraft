package mdiyo.inficraft.infiblocks.tech;

import net.minecraft.src.*;

public class WorkbenchItem extends ItemBlock
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
    
    public int getMetadata(int i)
    {
        return i;
    }

    public String getItemNameIS(ItemStack itemstack)
    {
        return (new StringBuilder()).append(blockType[itemstack.getItemDamage()]).append("Workbench").toString();
    }
}
