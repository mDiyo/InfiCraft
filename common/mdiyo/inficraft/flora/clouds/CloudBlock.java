package mdiyo.inficraft.flora.clouds;

import net.minecraft.src.AxisAlignedBB;
import net.minecraft.src.Block;
import net.minecraft.src.Entity;
import net.minecraft.src.IBlockAccess;
import net.minecraft.src.Material;
import net.minecraft.src.World;

public class CloudBlock extends Block
{
    public CloudBlock(int i)
    {
        super(i, 96, Material.cloth);
        this.setHardness(0.3F);
        this.setStepSound(Block.soundClothFootstep);
        this.setBlockName("cloud");
    }

    @Override
    public void onEntityCollidedWithBlock(World world, int x, int y, int z, Entity entity)
    {
        if (entity.motionY < 0.0D)
        {
            entity.motionY *= 0.0050000000000000001D;
        }
        entity.fallDistance = 0.0F;
    }

    @Override
    public int getRenderBlockPass()
    {
        return 1;
    }

    @Override
    public boolean shouldSideBeRendered(IBlockAccess iblockaccess, int i, int j, int k, int l)
    {
        int i1 = iblockaccess.getBlockId(i, j, k);
        if (i1 == FloraClouds.cloud.blockID)
        {
            return false;
        }
        else
        {
            return super.shouldSideBeRendered(iblockaccess, i, j, k, l);
        }
    }

    @Override
    public boolean renderAsNormalBlock()
    {
        return false;
    }

    @Override
    protected int damageDropped(int i)
    {
        return i;
    }

    @Override
    public boolean isOpaqueCube()
    {
        return false;
    }

    @Override
    public String getTextureFile()
    {
        return "/floratex/plantblocks.png";
    }

    @Override
    public boolean isBlockSolid(IBlockAccess iblockaccess, int i, int j, int k, int l)
    {
        int i1 = iblockaccess.getBlockId(i, j, k);
        if (i1 == FloraClouds.cloud.blockID)
        {
            return false;
        }
        else
        {
            return super.isBlockSolid(iblockaccess, i, j, k, l);
        }
    }

    @Override
    public AxisAlignedBB getCollisionBoundingBoxFromPool(World world, int i, int j, int k)
    {
        if (world.getBlockId(i, j - 1, k) == FloraClouds.cloud.blockID)
        {
            return null;
        }
        else
        {
            return AxisAlignedBB.getBoundingBox(i, j, k, (double)i + 1.0D, (double)j + 0.0625D, (double)k + 1.0D);
        }
    }

    @Override
    public int getBlockTextureFromSideAndMetadata(int i, int j)
    {
        return blockIndexInTexture + j;
    }
}
