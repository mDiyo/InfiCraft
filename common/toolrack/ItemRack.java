package net.minecraft.src;

public class ItemRack extends ItemBlock
{
    public ItemRack(int var1)
    {
        super(var1);
        this.setMaxDamage(0);
        this.setHasSubtypes(true);
    }

    /**
     * Gets an icon index based on an item's damage value
     */
    public int getIconFromDamage(int var1)
    {
        return mod_ToolRack.rack.getBlockTextureFromSideAndMetadata(2, var1);
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
        return super.getItemNameIS(var1) + "." + mod_ToolRack.skins[var1.getItemDamage() >> 2];
    }
}
