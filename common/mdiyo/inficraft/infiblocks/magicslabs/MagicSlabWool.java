package mdiyo.inficraft.infiblocks.magicslabs;

import java.util.ArrayList;

import mdiyo.inficraft.infiblocks.InfiBlocks;
import net.minecraft.src.ItemStack;
import net.minecraft.src.Material;

public class MagicSlabWool extends MagicSlabBase
{
    public MagicSlabWool(int i, int j)
    {
        super(i, j, Material.cloth);
    }
    
    public int getBlockTextureFromSideAndMetadata(int i, int j)
    {
        if (j == 0)
        {
            return blockIndexInTexture;
        }
        else
        {
            j = ~(j & 0xf);
            return 113 + ((j & 8) >> 3) + (j & 7) * 16;
        }
    }
    
    public static int getBlockFromDye(int i)
    {
        return ~i & 0xf;
    }

    public static int getDyeFromBlock(int i)
    {
        return ~i & 0xf;
    }
    
    public void addCreativeItems(ArrayList arraylist)
    {
    	for (int iter = 0; iter < 16; iter++)
    	{
    		arraylist.add(new ItemStack(InfiBlocks.getContentInstance().magicSlabWool, 1, 0));
    	}
    }
}
