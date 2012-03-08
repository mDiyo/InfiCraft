package net.minecraft.src.blocks;

import net.minecraft.src.*;
import net.minecraft.src.forge.*;

public class CustomItemBlockInfi extends ItemBlock
{
    public CustomItemBlockInfi(int i)
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
