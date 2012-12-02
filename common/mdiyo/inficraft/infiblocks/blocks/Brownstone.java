package mDiyo.inficraft.infiblocks.blocks;
import java.util.ArrayList;
import java.util.List;

import mDiyo.inficraft.infiblocks.InfiBlocks;
import net.minecraft.src.Block;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Entity;
import net.minecraft.src.ItemStack;
import net.minecraft.src.Material;
import net.minecraft.src.World;

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
