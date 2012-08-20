package mdiyo.inficraft.infiblocks.magicslabs;

import java.util.ArrayList;
import java.util.Random;

import mdiyo.inficraft.infiblocks.InfiBlocks;
import net.minecraft.src.ItemStack;
import net.minecraft.src.Material;

public class InfiGlassMagicSlab extends MagicSlabBase
{
    public InfiGlassMagicSlab(int i, int j)
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
    
    /*public int getRenderBlockPass()
    {
        return 1;
    }*/
    
    public String getTextureFile()
    {
        return InfiBlocks.blocksImage;
    }
    
    public void addCreativeItems(ArrayList arraylist)
    {
        arraylist.add(new ItemStack(InfiBlocks.getContentInstance().infiGlassMagicSlab, 1, 0));
        arraylist.add(new ItemStack(InfiBlocks.getContentInstance().infiGlassMagicSlab, 1, 1));
        arraylist.add(new ItemStack(InfiBlocks.getContentInstance().infiGlassMagicSlab, 1, 2));
    }
}
