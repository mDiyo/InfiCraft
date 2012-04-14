package net.minecraft.src.zipline;
import net.minecraft.src.*;

import java.util.Random;

public class BlockLeather extends BlockTensile
{
    public BlockLeather(int var1, int var2, Material var3, int var4)
    {
        super(var1, var2, var3, var4);
    }

    public int idDropped(int var1, Random var2)
    {
        return Item.leather.shiftedIndex;
    }

    /**
     * Returns the quantity of items to drop on block destruction.
     */
    public int quantityDropped(Random var1)
    {
        return 1;
    }

    /**
     * Determines the damage on the item the block drops. Used in cloth and wood.
     */
    protected int damageDropped(int var1)
    {
        return 0;
    }
}
