package mDiyo.inficraft.infitools.library;

import net.minecraft.src.Enchantment;
import net.minecraft.src.EnumEnchantmentType;

public class InfiEnchantPoison extends Enchantment
{
    public InfiEnchantPoison(int i, int j)
    {
        super(i, j, EnumEnchantmentType.weapon);
        setName("poison");
    }

    public int getMinEnchantability(int i)
    {
        return 0;
    }

    public int getMaxEnchantability(int i)
    {
        return 0;
    }

    public int getMaxLevel()
    {
        return 10;
    }
}
