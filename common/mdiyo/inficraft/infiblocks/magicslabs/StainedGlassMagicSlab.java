package mDiyo.inficraft.infiblocks.magicslabs;

import java.util.ArrayList;
import java.util.Random;

import mDiyo.inficraft.infiblocks.InfiBlocks;
import net.minecraft.src.ItemStack;
import net.minecraft.src.Material;

public class StainedGlassMagicSlab extends MagicSlabBase
{
    public StainedGlassMagicSlab(int i, int j)
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
    
    public int getRenderBlockPass()
    {
        return 1;
    }
    
    public String getTextureFile()
    {
        return InfiBlocks.blocksImage;
    }
    
    public void addCreativeItems(ArrayList arraylist)
    {
    	for (int iter = 0; iter < 16; iter++)
    	{
    		arraylist.add(new ItemStack(InfiBlocks.getContentInstance().stainedGlassMagicSlab, 1, 0));
    	}
    }
}
