package mDiyo.inficraft.infiblocks.bricks;
import java.util.ArrayList;

import mDiyo.inficraft.infiblocks.InfiBlocks;
import mDiyo.inficraft.infiblocks.magicslabs.MagicSlabBase;
import net.minecraft.src.Block;
import net.minecraft.src.ItemStack;
import net.minecraft.src.Material;

public class BrickBlockMagicSlab extends MagicSlabBase
{
    public BrickBlockMagicSlab(int i, int j)
    {
        super(i, j, Material.rock);
    }
    
    public float getHardness(int md) {
    	switch(md) {
    	case 0: return Block.obsidian.getBlockHardness(null, 0, 0, 0);
        case 1: return 0.5F; //Snow
        case 2: return 1.2F; //Sandstone
        case 3: return Block.brick.getBlockHardness(null, 0, 0, 0);
        case 4: return 1.5F; //Netherrack
        case 5: return Block.blockDiamond.getBlockHardness(null, 0, 0, 0);
        case 6: return Block.blockGold.getBlockHardness(null, 0, 0, 0);
        case 7: return Block.blockLapis.getBlockHardness(null, 0, 0, 0);
        case 8: return Block.stone.getBlockHardness(null, 0, 0, 0);
        case 9: return Block.stone.getBlockHardness(null, 0, 0, 0);
        case 10: return Block.stone.getBlockHardness(null, 0, 0, 0);
        case 11: return Block.brick.getBlockHardness(null, 0, 0, 0);
        case 12: return Block.blockSteel.getBlockHardness(null, 0, 0, 0);
        case 13: return 3F;
        case 14: return 3F;
        case 15: return 3F;
        default: return 0;
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
    	for (int iter = 0; iter < 16; iter++)
    	{
    		arraylist.add(new ItemStack(InfiBlocks.getContentInstance().brickMagicSlab, 1, 0));
    	}
    }
}
