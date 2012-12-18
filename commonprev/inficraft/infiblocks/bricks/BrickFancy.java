package inficraft.infiblocks.bricks;
import inficraft.infiblocks.InfiBlocks;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.src.Block;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.ItemStack;
import net.minecraft.src.Material;

public class BrickFancy extends Block
{
    public BrickFancy(int i, int j)
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
        case 10: return 3F;
        case 11: return Block.brick.getBlockHardness(null, 0, 0, 0);
        case 12: return Block.blockSteel.getBlockHardness(null, 0, 0, 0);
        case 13: return 3F;
        case 14: return 3F;
        case 15: return 3F;
        default: return 0;
    	}
    }
    
    public int damageDropped(int md)
    {
        return md;
    }
    
    public int getBlockTextureFromSideAndMetadata(int side, int md)
    {
        return blockIndexInTexture + md;
    }
    
    @Override
    public void getSubBlocks(int id, CreativeTabs tab, List list)
    {
    	for (int iter = 0; iter < 10; iter++)
    	{
    		list.add(new ItemStack(id, 1, iter));
    	}
    	for (int iter = 11; iter < 15; iter++)
    	{
    		list.add(new ItemStack(id, 1, iter));
    	}
    }
    
    public String getTextureFile()
    {
        return InfiBlocks.blocksImage;
    }
}
