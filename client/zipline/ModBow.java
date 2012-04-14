package net.minecraft.src.zipline;
import net.minecraft.src.*;

import java.util.HashMap;
import java.util.Iterator;

public class ModBow extends ModHooks
{
    public static void registerModifier(IBowMod var0)
    {
        registerModifier("bow", var0, var0);
    }

    public static boolean onItemRightClick(ItemStack[] var0, World var1, EntityPlayer var2)
    {
        HashMap var3 = (HashMap)modList.get("bow");

        if (var3 != null)
        {
            Iterator var4 = var3.values().iterator();

            while (var4.hasNext())
            {
                Object var5 = var4.next();

                if (((IBowMod)var5).onBowRightClick(var0, var1, var2))
                {
                    return true;
                }
            }
        }

        return false;
    }
}
