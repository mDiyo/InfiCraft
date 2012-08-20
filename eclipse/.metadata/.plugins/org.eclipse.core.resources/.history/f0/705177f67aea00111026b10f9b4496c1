package mdiyo.inficraft.infiblocks.glass;

import java.util.ArrayList;
import java.util.Random;

import net.minecraft.src.ItemStack;
import net.minecraft.src.Material;
import mdiyo.inficraft.infiblocks.InfiBlocks;
import mdiyo.inficraft.infiblocks.blocks.PaneBase;

public class InfiGlassPane extends PaneBase
{

    public InfiGlassPane(int i, int j, int k, Material material)
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
    
    public void addCreativeItems(ArrayList arraylist)
    {
        arraylist.add(new ItemStack(InfiBlocks.getContentInstance().infiGlassPane, 1, 0));
        arraylist.add(new ItemStack(InfiBlocks.getContentInstance().infiGlassPane, 1, 1));
        arraylist.add(new ItemStack(InfiBlocks.getContentInstance().infiGlassPane, 1, 2));
    }
}
