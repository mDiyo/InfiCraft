package mDiyo.inficraft.infiblocks.bricks;
import java.util.ArrayList;

import mDiyo.inficraft.infiblocks.InfiBlocks;
import net.minecraft.src.Block;
import net.minecraft.src.ItemStack;
import net.minecraft.src.Material;

public class BrickBlock extends Block
{
    public BrickBlock(int i, int j)
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
    
    @Override
    public int getRenderType()
    {
        return InfiBlocks.getContentInstance().brickModelID;
    }
    
    public int damageDropped(int meta)
    {
        return meta;
    }
    
    public int getBlockTextureFromSideAndMetadata(int side, int md)
    {
    	if(md >= 9 && md < 12)
    		return 176 + md + 1;
    	else
    		return blockIndexInTexture + md * 16;
    }
    
    public void addCreativeItems(ArrayList arraylist)
    {
    	for (int iter = 0; iter < 16; iter++)
    	{
    		arraylist.add(new ItemStack(InfiBlocks.getContentInstance().brick, 1, 0));
    	}
    }
    
    public String getTextureFile()
    {
        return InfiBlocks.bricksImage;
    }
}
