package net.minecraft.src.zipline;
import net.minecraft.src.*;

import java.util.HashMap;

public class ModCamera extends ModHooks
{
    public static void registerModifier(ICameraMod var0, int var1)
    {
        registerModifier("camera", Integer.valueOf(var1), var0);
    }

    public static void modifyCamera(EntityPlayer var0, float var1)
    {
        HashMap var2 = (HashMap)modList.get("camera");

        if (var2 != null)
        {
            World var3 = var0.worldObj;
            int var4 = MathHelper.floor_double(var0.posX);
            int var5 = MathHelper.floor_double(var0.boundingBox.minY);
            int var6 = var5;
            int var7 = MathHelper.floor_double(var0.posZ);
            int var8 = var3.getBlockId(var4, var5, var7);
            ICameraMod var9 = (ICameraMod)var2.get(Integer.valueOf(var8));

            if (var9 == null)
            {
                var8 = var3.getBlockId(var4, var6 = var5 + 1, var7);
                var9 = (ICameraMod)var2.get(Integer.valueOf(var8));

                if (var9 == null)
                {
                    var8 = var3.getBlockId(var4, var6 = var5 - 1, var7);
                    var9 = (ICameraMod)var2.get(Integer.valueOf(var8));
                }
            }

            if (var9 != null)
            {
                var9.modifyCamera(var0, var8, var4, var6, var7, var1);
            }
        }
    }
}
