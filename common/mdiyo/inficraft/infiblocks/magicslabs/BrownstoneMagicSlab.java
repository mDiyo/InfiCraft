package mDiyo.inficraft.infiblocks.magicslabs;

import java.util.ArrayList;
import java.util.List;

import mDiyo.inficraft.infiblocks.InfiBlocks;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Entity;
import net.minecraft.src.ItemStack;
import net.minecraft.src.Material;
import net.minecraft.src.World;

public class BrownstoneMagicSlab extends MagicSlabBase
{
    public BrownstoneMagicSlab(int i, int j)
    {
        super(i, j, Material.rock);
    }
    
    public void onEntityWalking(World world, int i, int j, int k, Entity entity)
    {
        double d = Math.abs(entity.motionX);
        double d1 = Math.abs(entity.motionZ);
        if(d < 0.3D)
        {
            entity.motionX *= 2.2D;
        }
        if(d1 < 0.3D)
        {
            entity.motionZ *= 2.2D;
        }
    }
    
    public int getBlockTextureFromSideAndMetadata(int side, int md)
    {
        return blockIndexInTexture+md;
    }
    
    public String getTextureFile()
    {
        return InfiBlocks.blocksImage;
    }
    
    @Override
    public void getSubBlocks(int id, CreativeTabs tab, List list)
    {
    	for (int iter = 0; iter < 6; iter++)
    	{
    		list.add(new ItemStack(id, 1, iter));
    	}
    }
}
