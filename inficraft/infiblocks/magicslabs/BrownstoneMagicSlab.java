package inficraft.infiblocks.magicslabs;

import inficraft.infiblocks.InfiBlocks;

import java.util.List;

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

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
