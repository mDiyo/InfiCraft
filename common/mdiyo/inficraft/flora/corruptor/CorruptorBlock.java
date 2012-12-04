package mDiyo.inficraft.flora.corruptor;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import cpw.mods.fml.common.Side;
import cpw.mods.fml.common.asm.SideOnly;

import net.minecraft.src.Block;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.ItemStack;
import net.minecraft.src.Material;
import net.minecraft.src.World;

public class CorruptorBlock extends Block
{
    public CorruptorBlock(int i)
    {
        super(i, 64, Material.rock);
        blockIndexInTexture = 96;
        this.setTickRandomly(true);
        this.setHardness(1.0F);
        this.setBlockName("corruptor");
        setCreativeTab(CreativeTabs.tabBlock);
    }

    public void updateTick(World world, int i, int j, int k, Random random)
    {
        if (world.isRemote || !PHCorruptor.corruptionSpread)
        {
            return;
        }
        int meta = world.getBlockMetadata(i, j, k);
        int blockID = world.getBlockId(i, j + 1, k);
        if (blockID != 0 && meta >= 8)
        {
            world.setBlockMetadataWithNotify(i, j, k, meta - 8);
        }
        if (meta >= 8 && blockID == 0 && random.nextInt(15) == 0)
        {
            if (random.nextInt(2) == 0)
            {
                world.setBlock(i, j + 1, k, Block.mushroomBrown.blockID);
            }
            else
            {
                world.setBlock(i, j + 1, k, Block.mushroomRed.blockID);
            }
        }
        if (random.nextInt(PHCorruptor.corruptionSpeed) == 0)
        {
            int posX = (i + random.nextInt(3)) - 1;
            int posY = (j + random.nextInt(3)) - 1;
            int posZ = (k + random.nextInt(3)) - 1;
            int bID = world.getBlockId(posX, posY, posZ);
            int md = world.getBlockMetadata(posX, posY, posZ);
            Material material = world.getBlockMaterial(posX, posY, posZ);
            Block block = Block.blocksList[bID];
            if (bID == 0 || block == null)
            	return;
            if (bID == Block.netherrack.blockID)
            {
                if (meta >= 8)
                {
                    int j1 = world.getBlockId(posX, posY + 1, posZ);
                    if (j1 == 0)
                    {
                        world.setBlockAndMetadataWithNotify(posX, posY, posZ, FloraCorruptor.corruptor.blockID, meta);
                    }
                    else
                    {
                        world.setBlockAndMetadataWithNotify(posX, posY, posZ, FloraCorruptor.corruptor.blockID, meta - 8);
                    }
                }
                else
                {
                    world.setBlockAndMetadataWithNotify(posX, posY, posZ, FloraCorruptor.corruptor.blockID, meta);
                }
            }
            else if (bID == FloraCorruptor.corruptor.blockID && (md % 8 == meta) && random.nextInt(4) == 0)
            {
                world.setBlockAndMetadataWithNotify(posX, posY, posZ, FloraCorruptor.corruptBrick.blockID, md % 8);
            }
            else if (bID == Block.stone.blockID)
            {
                world.setBlockAndMetadataWithNotify(posX, posY, posZ, FloraCorruptor.corruptor.blockID, 7);
            }
            else if (bID == Block.grass.blockID)
            {
                world.setBlockAndMetadataWithNotify(posX, posY, posZ, FloraCorruptor.corruptor.blockID, meta % 8 + 8);
            }
            else if (material == Material.ground)
            {
                world.setBlockAndMetadataWithNotify(posX, posY, posZ, FloraCorruptor.corruptor.blockID, 3);
            }
            else if (material == Material.sand && bID != Block.slowSand.blockID)
            {
                world.setBlockAndMetadataWithNotify(posX, posY, posZ, FloraCorruptor.corruptor.blockID, 6);
            }
            else if (material == Material.water) //Water blocks
            {
                world.setBlockAndMetadataWithNotify(posX, posY, posZ, FloraCorruptor.corruptor.blockID, 1);
            }
            else if (block.isWood(world, posX, posY, posZ)) //Wood blocks
            {
                world.setBlockAndMetadataWithNotify(posX, posY, posZ, FloraCorruptor.corruptor.blockID, 5);
            }
            else if (material == Material.leaves) //Leaf blocks
            {
                world.setBlockAndMetadataWithNotify(posX, posY, posZ, FloraCorruptor.corruptor.blockID, 2);
            }
        }
    }

    public boolean isFireSource(World world, int i, int j, int k, int l, int i1)
    {
        return true;
    }

    public int tickRate()
    {
        return 5;
    }

    public int getBlockTextureFromSideAndMetadata(int i, int j)
    {
        if (j < 8)
        {
            return blockIndexInTexture + j;
        }
        int k = blockIndexInTexture - 8;
        if (i == 0)
        {
            return k + j;
        }
        if (i == 1)
        {
            return (k - 32) + j;
        }
        else
        {
            return (k - 16) + j;
        }
    }

    public int damageDropped(int i)
    {
        if (i > 8)
        {
            return i - 8;
        }
        else
        {
            return i;
        }
    }

    public String getTextureFile()
    {
        return FloraCorruptor.texture;
    }

    @SideOnly(Side.CLIENT)
    @Override
    public void getSubBlocks(int id, CreativeTabs tab, List list)
    {
        for (int iter = 0; iter < 16; ++iter)
        {
            list.add(new ItemStack(id, 1, iter));
        }
    }
}
