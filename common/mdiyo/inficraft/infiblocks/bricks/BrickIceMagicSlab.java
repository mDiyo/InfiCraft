package mDiyo.inficraft.infiblocks.bricks;

import java.util.ArrayList;

import net.minecraft.src.ItemStack;
import net.minecraft.src.Material;
import mDiyo.inficraft.infiblocks.InfiBlocks;
import mDiyo.inficraft.infiblocks.magicslabs.MagicSlabBase;

public class BrickIceMagicSlab extends MagicSlabBase
{
    public BrickIceMagicSlab(int i, int j)
    {
        super(i, j, Material.ice);
    }
    
    public int getRenderBlockPass()
    {
        return 1;
    }
    
    public int getMobilityFlag()
    {
        return 0;
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
        arraylist.add(new ItemStack(InfiBlocks.getContentInstance().iceBrickMagicSlab, 1, 0));
        arraylist.add(new ItemStack(InfiBlocks.getContentInstance().iceBrickMagicSlab, 1, 1));
        arraylist.add(new ItemStack(InfiBlocks.getContentInstance().iceBrickMagicSlab, 1, 2));
    }
}
