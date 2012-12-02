package mDiyo.inficraft.infiblocks.blocks;
import java.util.ArrayList;
import java.util.List;

import mDiyo.inficraft.infiblocks.InfiBlocks;
import net.minecraft.src.Block;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.ItemStack;
import net.minecraft.src.Material;

public class StorageBlock extends Block
{
    public StorageBlock(int i, int j)
    {
        super(i, j, Material.rock);
        setCreativeTab(InfiBlocks.infiBlockTab);
    }
    
    public float getHardness(int md) {
    	switch(md) {
    	case 0: return 3F;
        case 1: return 3F; 
        case 2: return 3F;
        case 3: return 3F;
        case 4: return 3F;
        case 5: return 0.5F;
        case 12: return 1.5F; //Netherrack
        case 13: return Block.sandStone.getBlockHardness(null, 0, 0, 0) * 2F;
        case 14: return Block.stoneBrick.getBlockHardness(null, 0, 0, 0);
        case 15: return Block.brick.getBlockHardness(null, 0, 0, 0);
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
    	for (int iter = 0; iter < 5; iter++)
    	{
    		list.add(new ItemStack(id, 1, iter));
    	}
    	for (int iter = 12; iter < 16; iter++)
    	{
    		list.add(new ItemStack(id, 1, iter));
    	}
    }
    
    public String getTextureFile()
    {
        return InfiBlocks.blocksImage;
    }
}
