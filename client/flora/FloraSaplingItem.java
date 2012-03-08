package net.minecraft.src.flora;

import net.minecraft.src.*;
import net.minecraft.src.forge.MinecraftForgeClient;

public class FloraSaplingItem extends CustomItemBlockFlora
{
    public FloraSaplingItem(int i)
    {
        super(i);
        setMaxDamage(0);
        setHasSubtypes(true);
        MinecraftForgeClient.registerCustomItemRenderer(mod_FloraSoma.floraSapling.blockID, this);
    }

    public int getMetadata(int i)
    {
        return i;
    }

    public int getIconFromDamage(int i)
    {
        return mod_FloraSoma.floraSapling.getBlockTextureFromSideAndMetadata(0, i);
    }
}
