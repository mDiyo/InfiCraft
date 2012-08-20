package mdiyo.inficraft.infiblocks.magicslabs;

import java.util.ArrayList;

import mdiyo.inficraft.infiblocks.InfiBlocks;
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
    
    public void addCreativeItems(ArrayList arraylist)
    {
    	for (int iter = 0; iter < 6; iter++)
    	{
    		arraylist.add(new ItemStack(InfiBlocks.getContentInstance().brownstoneMagicSlab, 1, 0));
    	}
    }
}
