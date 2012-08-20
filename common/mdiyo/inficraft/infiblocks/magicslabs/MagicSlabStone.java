package mdiyo.inficraft.infiblocks.magicslabs;

import java.util.ArrayList;

import mdiyo.inficraft.infiblocks.InfiBlocks;
import net.minecraft.src.Block;
import net.minecraft.src.ItemStack;
import net.minecraft.src.Material;

public class MagicSlabStone extends MagicSlabBase
{
    public MagicSlabStone(int i, int j)
    {
        super(i, j, Material.rock);
    }
    
    public float getHardness(int md) {
    	switch(md) {
    	case 0: return Block.stone.getBlockHardness(null, 0, 0, 0);
        case 1: return Block.stoneSingleSlab.getBlockHardness(null, 0, 0, 0);
        case 2: return Block.cobblestone.getBlockHardness(null, 0, 0, 0);
        case 3: return Block.stoneBrick.getBlockHardness(null, 0, 0, 0); //Meta 0
        case 4: return Block.stoneBrick.getBlockHardness(null, 0, 0, 0); //Meta 1
        case 5: return Block.stoneBrick.getBlockHardness(null, 0, 0, 0); //Meta 2
        case 6: return Block.brick.getBlockHardness(null, 0, 0, 0);
        case 7: return Block.cobblestoneMossy.getBlockHardness(null, 0, 0, 0);
        case 8: return Block.obsidian.getBlockHardness(null, 0, 0, 0);
        case 9: return Block.netherrack.getBlockHardness(null, 0, 0, 0);
        case 10: return Block.sandStone.getBlockHardness(null, 0, 0, 0);
        case 11: return Block.blockSteel.getBlockHardness(null, 0, 0, 0);
        case 12: return Block.blockGold.getBlockHardness(null, 0, 0, 0);
        case 13: return Block.blockDiamond.getBlockHardness(null, 0, 0, 0);
        case 14: return Block.whiteStone.getBlockHardness(null, 0, 0, 0);
        case 15: return Block.netherBrick.getBlockHardness(null, 0, 0, 0);
        default: return 0;
    	}
    }
    
    public int getBlockTextureFromSideAndMetadata(int side, int md)
    {
        switch(md)
        {
        case 0: return Block.stone.getBlockTextureFromSideAndMetadata(side, 0);
        case 1: return Block.stoneSingleSlab.getBlockTextureFromSideAndMetadata(side, 0);
        case 2: return Block.cobblestone.getBlockTextureFromSideAndMetadata(side, 0);
        case 3: return Block.stoneBrick.getBlockTextureFromSideAndMetadata(side, 0);
        case 4: return Block.stoneBrick.getBlockTextureFromSideAndMetadata(side, 1);
        case 5: return Block.stoneBrick.getBlockTextureFromSideAndMetadata(side, 2);
        case 6: return Block.brick.getBlockTextureFromSideAndMetadata(side, 0);
        case 7: return Block.cobblestoneMossy.getBlockTextureFromSideAndMetadata(side, 0);
        case 8: return Block.obsidian.getBlockTextureFromSideAndMetadata(side, 0);
        case 9: return Block.netherrack.getBlockTextureFromSideAndMetadata(side, 0);
        case 10: return Block.sandStone.getBlockTextureFromSideAndMetadata(side, 0);
        case 11: return Block.blockSteel.getBlockTextureFromSideAndMetadata(side, 0);
        case 12: return Block.blockGold.getBlockTextureFromSideAndMetadata(side, 0);
        case 13: return Block.blockDiamond.getBlockTextureFromSideAndMetadata(side, 0);
        case 14: return Block.whiteStone.getBlockTextureFromSideAndMetadata(side, 0);
        case 15: return Block.netherBrick.getBlockTextureFromSideAndMetadata(side, 0);
        default: return 0;
        }
    }
    
    public void addCreativeItems(ArrayList arraylist)
    {
    	for (int iter = 0; iter < 16; iter++)
    	{
    		arraylist.add(new ItemStack(InfiBlocks.getContentInstance().magicSlabStone, 1, 0));
    	}
    }
}
