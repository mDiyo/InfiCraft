package inficraft.infiblocks.glass;

import inficraft.infiblocks.InfiBlocks;
import inficraft.infiblocks.blocks.PaneBase;

import java.util.ArrayList;
import java.util.Random;

import net.minecraft.src.ItemStack;
import net.minecraft.src.Material;

public class StainedGlassPane extends PaneBase
{

    public StainedGlassPane(int i, int j, int k, Material material)
    {
        super(i, j, k, material);
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
    
    public int getBlockTextureFromSideAndMetadata(int side, int md)
    {
        return blockIndexInTexture + md;
    }
}
