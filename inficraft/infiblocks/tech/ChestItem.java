package inficraft.infiblocks.tech;

import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ChestItem extends ItemBlock
{
    public static final String[] blockType = new String[] {"oak", "birch", "pine", "jungle", "cactus", "weathered", "ruinedstone", "stone", "stonebrick", "obsidian", "ice", "iron", "jeweled", "slime", "endstone"};

    public ChestItem(int var1)
    {
        super(var1);
        this.setMaxDamage(0);
        this.setHasSubtypes(true);
    }

    /**
     * Returns the metadata of the block which this Item (ItemBlock) can place
     */
    public int getMetadata(int var1)
    {
        return var1;
    }

    public String getItemNameIS(ItemStack var1)
    {
        return blockType[var1.getItemDamage()] + "ChestInfi";
    }
}
