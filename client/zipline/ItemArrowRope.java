package net.minecraft.src.zipline;
import net.minecraft.src.*;

public class ItemArrowRope extends Item implements IItemArrow
{
    public static int minDamage = 4;

    public ItemArrowRope(int var1, int var2)
    {
        super(var1);
        this.maxStackSize = 8;
        this.setMaxDamage(8 + minDamage);
        this.iconIndex = var2;
    }

    /**
     * Gets an icon index based on an item's damage value
     */
    public int getIconFromDamage(int var1)
    {
        return this.iconIndex;
    }

    public Item getItemArrow()
    {
        return this;
    }

    public static int damageToCount(int var0)
    {
        if (var0 == 0)
        {
            var0 = 8;
        }

        return (9 - var0) * 8;
    }

    public static int countToDamage(int var0)
    {
        int var1 = 9 - var0 / 8;

        if (var1 == 8)
        {
            var1 = 0;
        }

        return var1;
    }

    public EntityZiplineArrow getEntityArrow(World var1, EntityLiving var2, Item var3, ItemStack var4)
    {
        EntityZiplineArrow var5 = new EntityZiplineArrow(var1, var2, 0.0F);
        var5.ropeCount = damageToCount(var4.getItemDamage());
        EntityZiplineArrow.ropeCountTemp = var5.ropeCount;
        return var5;
    }

    public EntityZiplineArrow getEntityArrow(World var1, double var2, double var4, double var6, ItemStack var8)
    {
        EntityZiplineArrow var9 = new EntityZiplineArrow(var1, var2, var4, var6);
        var9.ropeCount = damageToCount(var8.getItemDamage());
        EntityZiplineArrow.ropeCountTemp = var9.ropeCount;
        return var9;
    }

    public static void playSound(World var0, EntityPlayer var1)
    {
        var0.playSoundAtEntity(var1, "random.bow", 1.0F, 1.0F / (itemRand.nextFloat() * 0.4F + 0.8F));
    }
}
