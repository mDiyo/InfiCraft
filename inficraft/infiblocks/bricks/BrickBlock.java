package inficraft.infiblocks.bricks;
import inficraft.infiblocks.InfiBlocks;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class BrickBlock extends Block
{
    public BrickBlock(int i, int j)
    {
        super(i, j, Material.rock);
        setCreativeTab(InfiBlocks.infiBlockTab);
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
    
    @Override
    public void getSubBlocks(int id, CreativeTabs tab, List list)
    {
    	for (int iter = 0; iter < 16; iter++)
    	{
    		list.add(new ItemStack(id, 1, iter));
    	}
    }
    
    public String getTextureFile()
    {
        return InfiBlocks.bricksImage;
    }
}
