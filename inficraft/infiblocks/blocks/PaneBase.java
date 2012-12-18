package inficraft.infiblocks.blocks;
import inficraft.infiblocks.InfiBlocks;
import inficraft.infiblocks.magicslabs.MagicSlabBase;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.BlockPane;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class PaneBase extends Block
{
    private int sideTextureIndex;

    public PaneBase(int i, int j, int k, Material material)
    {
        super(i, j, material);
        sideTextureIndex = k;
        setCreativeTab(InfiBlocks.infiBlockTab);
    }

    public boolean isOpaqueCube()
    {
        return false;
    }

    public boolean renderAsNormalBlock()
    {
        return false;
    }

    public int getRenderType()
    {
        return InfiBlocks.getContentInstance().paneModelID;
    }

    public boolean shouldSideBeRendered(IBlockAccess iblockaccess, int i, int j, int k, int l)
    {
        int bID = iblockaccess.getBlockId(i, j, k);
        if (Block.blocksList[bID] instanceof PaneBase || Block.blocksList[bID] instanceof BlockPane)
        {
            return false;
        }
        else
        {
            return super.shouldSideBeRendered(iblockaccess, i, j, k, l);
        }
    }

    @Override
    public void addCollidingBlockToList(World world, int x, int y, int z, AxisAlignedBB axisalignedbb, List arraylist, Entity entity)
    {
        boolean south = canConnectTo(world.getBlockId(x, y, z - 1));
        boolean north = canConnectTo(world.getBlockId(x, y, z + 1));
        boolean east = canConnectTo(world.getBlockId(x - 1, y, z));
        boolean west = canConnectTo(world.getBlockId(x + 1, y, z));
        if (east && west || !east && !west && !south && !north)
        {
            setBlockBounds(0.0F, 0.0F, 0.4375F, 1.0F, 1.0F, 0.5625F);
            super.addCollidingBlockToList(world, x, y, z, axisalignedbb, arraylist, entity);
        }
        else if (east && !west)
        {
            setBlockBounds(0.0F, 0.0F, 0.4375F, 0.5F, 1.0F, 0.5625F);
            super.addCollidingBlockToList(world, x, y, z, axisalignedbb, arraylist, entity);
        }
        else if (!east && west)
        {
            setBlockBounds(0.5F, 0.0F, 0.4375F, 1.0F, 1.0F, 0.5625F);
            super.addCollidingBlockToList(world, x, y, z, axisalignedbb, arraylist, entity);
        }
        if (south && north || !east && !west && !south && !north)
        {
            setBlockBounds(0.4375F, 0.0F, 0.0F, 0.5625F, 1.0F, 1.0F);
            super.addCollidingBlockToList(world, x, y, z, axisalignedbb, arraylist, entity);
        }
        else if (south && !north)
        {
            setBlockBounds(0.4375F, 0.0F, 0.0F, 0.5625F, 1.0F, 0.5F);
            super.addCollidingBlockToList(world, x, y, z, axisalignedbb, arraylist, entity);
        }
        else if (!south && north)
        {
            setBlockBounds(0.4375F, 0.0F, 0.5F, 0.5625F, 1.0F, 1.0F);
            super.addCollidingBlockToList(world, x, y, z, axisalignedbb, arraylist, entity);
        }
    }

    public void setBlockBoundsForItemRender()
    {
        setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
    }

    public void setBlockBoundsBasedOnState(IBlockAccess iblockaccess, int i, int j, int k)
    {
        float f = 0.4375F;
        float f1 = 0.5625F;
        float f2 = 0.4375F;
        float f3 = 0.5625F;
        boolean flag = canConnectTo(iblockaccess.getBlockId(i, j, k - 1));
        boolean flag1 = canConnectTo(iblockaccess.getBlockId(i, j, k + 1));
        boolean flag2 = canConnectTo(iblockaccess.getBlockId(i - 1, j, k));
        boolean flag3 = canConnectTo(iblockaccess.getBlockId(i + 1, j, k));
        if (flag2 && flag3 || !flag2 && !flag3 && !flag && !flag1)
        {
            f = 0.0F;
            f1 = 1.0F;
        }
        else if (flag2 && !flag3)
        {
            f = 0.0F;
        }
        else if (!flag2 && flag3)
        {
            f1 = 1.0F;
        }
        if (flag && flag1 || !flag2 && !flag3 && !flag && !flag1)
        {
            f2 = 0.0F;
            f3 = 1.0F;
        }
        else if (flag && !flag1)
        {
            f2 = 0.0F;
        }
        else if (!flag && flag1)
        {
            f3 = 1.0F;
        }
        setBlockBounds(f, 0.0F, f2, f1, 1.0F, f3);
    }

    public int getSideTextureIndex(int md)
    {
        return sideTextureIndex + md;
    }

    public final boolean canConnectTo(int bID)
    {
        return Block.opaqueCubeLookup[bID] || Block.blocksList[bID] instanceof PaneBase 
        		|| Block.blocksList[bID] instanceof MagicSlabBase || bID == Block.glass.blockID
        		|| bID == InfiBlocks.getContentInstance().stainedGlass.blockID;
    }
    
    @Override
    public void getSubBlocks(int id, CreativeTabs tab, List list)
    {
    	for (int iter = 0; iter < 16; iter++)
    	{
    		list.add(new ItemStack(id, 1, iter));
    	}
    }
}
