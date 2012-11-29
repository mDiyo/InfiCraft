package mDiyo.inficraft.infitools.library;

import net.minecraft.src.Enchantment;
import net.minecraft.src.EnumEnchantmentType;

public class InfiEnchantFreezing extends Enchantment
{
    public InfiEnchantFreezing(int i, int j)
    {
        super(i, j, EnumEnchantmentType.weapon);
        setName("frost");
    }

    public int getMinEnchantability(int i)
    {
        return 5 + 8 * (i - 1);
    }

    public int getMaxEnchantability(int i)
    {
        return super.getMinEnchantability(i) + 30;
    }

    public int getMaxLevel()
    {
        return 3;
    }
}
