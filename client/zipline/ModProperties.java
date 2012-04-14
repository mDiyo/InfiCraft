package net.minecraft.src.zipline;
import net.minecraft.src.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.HashMap;
import net.minecraft.client.Minecraft;

public class ModProperties
{
    public HashMap properties = new HashMap();

    public String getProp(String var1, String var2)
    {
        return var2;
    }

    public HashMap getProp(String var1, HashMap var2)
    {
        return var2;
    }

    public Object getProp(String var1, Object var2)
    {
        String[] var3 = getPath(var1);
        HashMap var4 = this.properties;

        for (int var5 = 0; var5 < var3.length - 1; ++var5)
        {
            if (!var4.containsKey(var3[var5]) || !(var4.get(var3[var5]) instanceof HashMap))
            {
                return var2;
            }

            var4 = (HashMap)var4.get(var3[var5]);
        }

        Object var6 = var4.get(var3[var3.length - 1]);

        if (var6 == null)
        {
            return var2;
        }
        else
        {
            return var6;
        }
    }

    private static String[] getPath(String var0)
    {
        String[] var1;

        if (var0.contains("."))
        {
            var1 = var0.split("\\.");
        }
        else
        {
            var1 = new String[] {var0};
        }

        return var1;
    }

    public static ModProperties getProperties(String var0, String var1)
    {
        ModProperties var2 = new ModProperties();

        try
        {
            File var3 = new File(Minecraft.getMinecraftDir(), var0);
            Object var4;

            if (var3.canRead())
            {
                var4 = new FileReader(var3);
            }
            else
            {
                var4 = new StringReader(var1);
            }

            BufferedReader var5 = new BufferedReader((Reader)var4);

            for (String var6 = var5.readLine().trim(); var6 != null; var6 = var5.readLine())
            {
                if (var6.length() > 0)
                {
                    String[] var7;

                    if (var6.contains("="))
                    {
                        var7 = var6.split("=", 2);
                    }
                    else
                    {
                        var7 = new String[] {var6, "true"};
                    }

                    String[] var8 = getPath(var7[0]);
                    String var9 = var7[1];
                    HashMap var10 = var2.properties;

                    for (int var11 = 0; var11 < var8.length - 1; ++var11)
                    {
                        if (!var10.containsKey(var8[var11]) || !(var10.get(var8[var11]) instanceof HashMap))
                        {
                            var10.put(var8[var11], new HashMap());
                        }

                        var10 = (HashMap)var10.get(var8[var11]);
                    }

                    String var14 = var8[var8.length - 1];
                    var10.put(var14, var9);
                }
            }

            var5.close();
        }
        catch (FileNotFoundException var12)
        {
            ;
        }
        catch (IOException var13)
        {
            ;
        }

        return var2;
    }
}
