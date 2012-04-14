package net.minecraft.src.zipline;
import net.minecraft.src.*;

public class ItemHandlebar extends Item
{
    public ItemHandlebar(int var1, int var2)
    {
        super(var1);
        this.maxStackSize = 1;
        this.iconIndex = var2;
    }

    /**
     * Callback for item usage. If the item does something special on right clicking, he will have one of those. Return
     * True if something happen and false if it don't. This is for ITEMS, not BLOCKS !
     */
    public boolean onItemUse(ItemStack var1, EntityPlayer var2, World var3, int var4, int var5, int var6, int var7)
    {
        Block var8 = Block.blocksList[var3.getBlockId(var4, var5, var6)];
        var2.swingItem();
        return var8 instanceof IZipline && ((IZipline)var8).mountZipline(var1, var2, var3, var4, var5, var6, var7);
    }
}
