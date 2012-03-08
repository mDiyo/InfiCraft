package net.minecraft.src.flora;

import net.minecraft.src.*;
import net.minecraft.src.forge.*;

public class CustomItemBlockFlora extends ItemBlock
{

    public CustomItemBlockFlora(int i)
    {
        super(i);
        setMaxDamage(0);
        setHasSubtypes(true);
    }

    public int getMetadata(int i)
    {
        return i;
    }
}
