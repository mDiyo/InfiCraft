package mdiyo.inficraft.infiblocks.glass;

import java.util.ArrayList;
import java.util.Random;

import mdiyo.inficraft.infiblocks.InfiBlocks;
import net.minecraft.src.BlockBreakable;
import net.minecraft.src.ItemStack;
import net.minecraft.src.Material;

public class InfiGlass extends BlockBreakable
{
    public InfiGlass(int i, int j, Material material, boolean flag)
    {
        super(i, j, material, flag);
    }
    
    public int idDropped(int i, Random random, int j)
    {
    	return 0;
    }

    public int getRenderBlockPass()
    {
        return 1;
    }
    
    public int getBlockTextureFromSideAndMetadata(int side, int md)
    {
        return blockIndexInTexture + md;
    }
    
    public String getTextureFile()
    {
        return InfiBlocks.blocksImage;
    }
    
    public void addCreativeItems(ArrayList arraylist)
    {
        arraylist.add(new ItemStack(InfiBlocks.getContentInstance().infiGlass, 1, 0));
        arraylist.add(new ItemStack(InfiBlocks.getContentInstance().infiGlass, 1, 1));
        arraylist.add(new ItemStack(InfiBlocks.getContentInstance().infiGlass, 1, 2));
    }
}
