package inficraft.infiblocks.blocks;
import inficraft.infiblocks.InfiBlocks;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class Brownstone extends Block
{

    public Brownstone(int id, int tex)
    {
        super(id, tex, Material.rock);
        setCreativeTab(InfiBlocks.infiBlockTab);
    }

    public void onEntityWalking(World world, int i, int j, int k, Entity entity)
    {
        double boost = 2.2D;
        if(world.getBlockMetadata(i, j, k) == 2)
            boost = 2.65D;
        double mX = Math.abs(entity.motionX);
        double mZ = Math.abs(entity.motionZ);
        if(mX < 0.3D)
        {
            entity.motionX *= boost;
        }
        if(mZ < 0.3D)
        {
            entity.motionZ *= boost;
        }
    }
    
    public int damageDropped(int md)
    {
        return md;
    }
    
    public int getBlockTextureFromSideAndMetadata(int side, int md)
    {
        if (md == 3)
            return blockIndexInTexture - 32;
        else
            return blockIndexInTexture + md;
    }

    @Override
    public int getRenderType()
    {
        return InfiBlocks.getContentInstance().brickModelID;
    }
    
    @Override
    public void getSubBlocks(int id, CreativeTabs tab, List list)
    {
    	for (int iter = 0; iter < 6; iter++)
    	{
    		list.add(new ItemStack(id, 1, iter));
    	}
    }
    
    public String getTextureFile()
    {
        return InfiBlocks.bricksImage;
    }
}
