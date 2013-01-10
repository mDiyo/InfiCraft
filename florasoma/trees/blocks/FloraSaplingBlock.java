package florasoma.trees.blocks;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockFlower;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;
import florasoma.trees.FloraTrees;
import florasoma.trees.PHTrees;
import florasoma.trees.worldgen.BloodTreeGen;
import florasoma.trees.worldgen.BushTreeGen;
import florasoma.trees.worldgen.EucalyptusTreeGenShort;
import florasoma.trees.worldgen.RedwoodTreeGen;
import florasoma.trees.worldgen.SakuraTreeGen;
import florasoma.trees.worldgen.WhiteTreeGen;

public class FloraSaplingBlock extends BlockFlower
{
	protected FloraSaplingBlock(int i, int j)
	{
		super(i, j);
		float f = 0.4F;
		setBlockBounds(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, f * 2.0F, 0.5F + f);
		this.setHardness(0.0F);
		this.setStepSound(Block.soundGrassFootstep);
		this.setBlockName("floraSapling");
		this.setRequiresSelfNotify();
	}

	public boolean canPlaceBlockAt (World world, int i, int j, int k)
	{
		return super.canPlaceBlockAt(world, i, j, k) && canThisPlantGrowOnThisBlockID(world.getBlockId(i, j - 1, k));
	}

	protected boolean canThisPlantGrowOnThisBlockID (int i)
	{
		return i == Block.grass.blockID || i == Block.dirt.blockID || i == Block.slowSand.blockID || i == Block.netherrack.blockID;
	}

	public FloraSaplingBlock(int i)
	{
		this(i, 128);
	}

	public void updateTick (World world, int x, int y, int z, Random random)
	{
		if (world.isRemote)
		{
			return;
		}
		super.updateTick(world, x, y, z, random);
		int md = world.getBlockMetadata(x, y, z);
		if (md % 8 == 0)
		{
			if (world.getBlockLightValue(x, y + 1, z) >= 9 && random.nextInt(120) == 0)
			{
				if ((md & 8) == 0)
				{
					world.setBlockMetadataWithNotify(x, y, z, md | 8);
				}
				else
				{
					growTree(world, x, y, z, random);
				}
			}
		}
		else if (md % 8 == 2 && random.nextInt(10) == 0)
		{
			if ((md & 8) == 0)
			{
				world.setBlockMetadataWithNotify(x, y, z, md | 8);
				int i1 = world.getBlockMetadata(x, y, z);
			}
			else
			{
				growTree(world, x, y, z, random);
			}
		}
		else
		{
			if ((md & 8) == 0)
			{
				world.setBlockMetadataWithNotify(x, y, z, md | 8);
				int i1 = world.getBlockMetadata(x, y, z);
			}
			else
			{
				growTree(world, x, y, z, random);
			}
		}
		/*else if (md % 8 == 2 && random.nextInt(10) == 0)
		{
			if ((md & 8) == 0)
			{
				world.setBlockMetadataWithNotify(x, y, z, md | 8);
				int i1 = world.getBlockMetadata(x, y, z);
			}
			else
			{
				growTree(world, x, y, z, random);
			}
		}
		else if (md % 8 == 3 && random.nextInt(7) == 0)
		{
			if ((md & 8) == 0)
			{
				world.setBlockMetadataWithNotify(x, y, z, md | 8);
				int i1 = world.getBlockMetadata(x, y, z);
			}
			else
			{
				growTree(world, x, y, z, random);
			}
		}
		else if (md % 8 == 4 && random.nextInt(7) == 0)
		{
			if ((md & 8) == 0)
			{
				world.setBlockMetadataWithNotify(x, y, z, md | 8);
				int i1 = world.getBlockMetadata(x, y, z);
			}
			else
			{
				growTree(world, x, y, z, random);
			}
		}*/
	}

	public int getBlockTextureFromSideAndMetadata (int side, int md)
	{
		//j &= 8;

		return blockIndexInTexture + md % 8;
		/*if (md == 1)
		{
		    return 53;
		} else
		if (md == 2)
		{
			return 54;
		}
		else
		{
		    return super.getBlockTextureFromSideAndMetadata(side, md);
		}*/
	}

	public void growTree (World world, int x, int y, int z, Random random)
	{
		int md = world.getBlockMetadata(x, y, z) % 8;
		world.setBlock(x, y, z, 0);
		WorldGenerator obj = null;
		
		if (md == 1)
			obj = new EucalyptusTreeGenShort(0, 2);
		
		else if (md == 2)
			obj = new BushTreeGen(true, 2, 1, 0);
		
		else if (md == 3)
			obj = new SakuraTreeGen(true, 1, 0);
		
		else if (md == 4)
			obj = new WhiteTreeGen(true, FloraTrees.tree.blockID, 1);

		else if (md == 5)
			obj = new BloodTreeGen(3, 1);
		
		else
			obj = new RedwoodTreeGen(true, PHTrees.redwoodID, 0);
		
		if (!(obj.generate(world, random, x, y, z)))
			world.setBlockAndMetadata(x, y, z, blockID, md);
	}

	public int damageDropped (int i)
	{
		return i % 8;
	}

	public String getTextureFile ()
	{
		return FloraTrees.texture;
	}
	
	public void getSubBlocks(int par1, CreativeTabs par2CreativeTabs, List par3List)
    {
        par3List.add(new ItemStack(par1, 1, 0));
        par3List.add(new ItemStack(par1, 1, 1));
        par3List.add(new ItemStack(par1, 1, 2));
        par3List.add(new ItemStack(par1, 1, 3));
        par3List.add(new ItemStack(par1, 1, 4));
        par3List.add(new ItemStack(par1, 1, 5));
    }
}
