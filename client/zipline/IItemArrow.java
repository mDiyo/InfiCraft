package net.minecraft.src.zipline;
import net.minecraft.src.*;

public interface IItemArrow
{
    Item getItemArrow();

    EntityZiplineArrow getEntityArrow(World var1, EntityLiving var2, Item var3, ItemStack var4);
}
