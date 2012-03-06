package net.minecraft.src.flora;

import net.minecraft.src.*;

public class FloraSaplingItem extends ItemBlock
{
    public FloraSaplingItem(int i)
    {
        super(i);
        setMaxDamage(0);
        setHasSubtypes(true);
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
