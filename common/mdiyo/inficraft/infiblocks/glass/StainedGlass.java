package mDiyo.inficraft.infiblocks.glass;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import mDiyo.inficraft.infiblocks.InfiBlocks;
import net.minecraft.src.BlockBreakable;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.ItemStack;
import net.minecraft.src.Material;

public class StainedGlass extends BlockBreakable
{
    public StainedGlass(int i, int j, Material material, boolean flag)
    {
        super(i, j, material, flag);
        setCreativeTab(InfiBlocks.infiBlockTab);
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
    
    @Override
    public void getSubBlocks(int id, CreativeTabs tab, List list)
    {
    	for (int iter = 0; iter < 16; iter++)
    	{
    		list.add(new ItemStack(id, 1, iter));
    	}
    }
}
