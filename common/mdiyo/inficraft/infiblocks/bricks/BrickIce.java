package mdiyo.inficraft.infiblocks.bricks;

import java.util.ArrayList;
import java.util.Random;

import mdiyo.inficraft.infiblocks.InfiBlocks;
import net.minecraft.src.Block;
import net.minecraft.src.BlockBreakable;
import net.minecraft.src.EntityPlayer;
import net.minecraft.src.EnumSkyBlock;
import net.minecraft.src.IBlockAccess;
import net.minecraft.src.ItemStack;
import net.minecraft.src.Material;
import net.minecraft.src.World;

public class BrickIce extends BlockBreakable
{
    public BrickIce(int i, int j)
    {
        super(i, j, Material.ice, false);
    }
    
    public int getRenderBlockPass()
    {
        return 1;
    }

    @Override
    public int getRenderType()
    {
        return InfiBlocks.getContentInstance().brickModelID;
    }
    
    public boolean shouldSideBeRendered(IBlockAccess iblockaccess, int i, int j, int k, int l)
    {
        return super.shouldSideBeRendered(iblockaccess, i, j, k, 1 - l);
    }
    
    public void harvestBlock(World world, EntityPlayer entityplayer, int i, int j, int k, int l)
    {
        super.harvestBlock(world, entityplayer, i, j, k, l);
        Material material = world.getBlockMaterial(i, j - 1, k);
        if (material.blocksMovement() || material.isLiquid())
        {
            world.setBlockWithNotify(i, j, k, Block.waterMoving.blockID);
        }
    }
    
    public int quantityDropped(Random random)
    {
        return 0;
    }
    
    public void updateTick(World world, int i, int j, int k, Random random)
    {
        if (world.getSavedLightValue(EnumSkyBlock.Block, i, j, k) > 11 - Block.lightOpacity[blockID])
        {
            dropBlockAsItem(world, i, j, k, world.getBlockMetadata(i, j, k), 0);
            world.setBlockWithNotify(i, j, k, Block.waterStill.blockID);
        }
    }

    public int getMobilityFlag()
    {
        return 0;
    }

    protected ItemStack createStackedBlock(int i)
    {
        return null;
    }
    
    public int getBlockTextureFromSideAndMetadata(int side, int md)
    {
        if (md == 0)
            return blockIndexInTexture;
        else
            return blockIndexInTexture + md + 23;
    }
    
    public void addCreativeItems(ArrayList arraylist)
    {
        arraylist.add(new ItemStack(InfiBlocks.getContentInstance().iceBrick, 1, 0));
        arraylist.add(new ItemStack(InfiBlocks.getContentInstance().iceBrick, 1, 1));
        arraylist.add(new ItemStack(InfiBlocks.getContentInstance().iceBrick, 1, 2));
    }
    
    public String getTextureFile()
    {
        return InfiBlocks.bricksImage;
    }
}
