package net.minecraft.src.zipline;
import net.minecraft.src.*;

import java.util.HashMap;
import java.util.Map;

public class ModHooks
{
    public static Map modList = new HashMap();

    public static void registerModifier(String var0, Object var1, Object var2)
    {
        if (!modList.containsKey(var0))
        {
            modList.put(var0, new HashMap());
        }

        HashMap var3 = (HashMap)modList.get(var0);
        var3.put(var1, var2);
    }
}
