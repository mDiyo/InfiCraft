package inficraft.infiblocks.glass;

import inficraft.infiblocks.InfiBlocks;

import java.util.List;
import java.util.Random;

import net.minecraft.block.BlockBreakable;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class InfiGlass extends BlockBreakable
{
    public InfiGlass(int i, int j, Material material, boolean flag)
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
    	for (int iter = 0; iter < 3; iter++)
    	{
    		list.add(new ItemStack(id, 1, iter));
    	}
    }
}
