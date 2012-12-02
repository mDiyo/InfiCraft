package mDiyo.inficraft.infiblocks.glass;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import mDiyo.inficraft.infiblocks.InfiBlocks;
import mDiyo.inficraft.infiblocks.magicslabs.MagicSlabBase;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.ItemStack;
import net.minecraft.src.Material;

public class InfiGlassMagicSlab extends MagicSlabBase
{
    public InfiGlassMagicSlab(int i, int j)
    {
        super(i, j, Material.rock);
    }
    
    public int getBlockTextureFromSideAndMetadata(int side, int md)
    {
        return blockIndexInTexture + md;
    }
    
    public int idDropped(int i, Random random, int j)
    {
    	return 0;
    }
    
    public String getTextureFile()
    {
        return InfiBlocks.blocksImage;
    }
    
    @Override
    public void getSubBlocks(int id, CreativeTabs tab, List list)
    {
    	for (int iter = 0; iter < 3; iter++)
    	{
    		list.add(new ItemStack(id, 1, iter));
    	}
    }
}
