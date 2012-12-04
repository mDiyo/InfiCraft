package bastion.blocks;

import java.util.ArrayList;
import net.minecraft.src.AxisAlignedBB;
import net.minecraft.src.Block;
import net.minecraft.src.EntityPlayer;
import net.minecraft.src.IBlockAccess;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;
import net.minecraft.src.Material;
import net.minecraft.src.ModLoader;
import net.minecraft.src.World;

public class ShrinkPrototype extends Block
{
	public ShrinkPrototype(int blockID)
	{
		super(blockID, Material.wood);
		setHardness(0.2F);
		this.blockIndexInTexture = 20;
		setBlockName("barrier");
		ModLoader.addName(this, "Barrier");
	}

	public void setBlockBoundsBasedOnState(IBlockAccess par1IBlockAccess, int x, int y, int z)
	{
		float height = 1.0F - par1IBlockAccess.getBlockMetadata(x, y, z) / 16.0F;
		setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, height, 1.0F);
	}

	public boolean renderAsNormalBlock()
	{
		return false;
	}

	public boolean isOpaqueCube()
	{
		return false;
	}

	public void setBlockBoundsForItemRender()
	{
		setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
	}

	public void harvestBlock(World world, EntityPlayer player, int x, int y, int z, int meta)
	{
		if (meta == 0)
		{
			world.setBlockAndMetadataWithNotify(x, y, z, this.blockID, meta);

			int height = 0;
			while (world.getBlockId(x, y + height + 1, z) == this.blockID)
			{
				height++;
			}

			int heightMeta = world.getBlockMetadata(x, y + height, z);
			if (heightMeta < 15)
			{
				world.setBlockAndMetadataWithNotify(x, y + height, z, this.blockID, heightMeta + 1);
				dropBlockAsItem_do(world, x, y, z, new ItemStack(Item.stick));
			}
			else
			{
				world.setBlockWithNotify(x, y + height, z, 0);
				dropBlockAsItem_do(world, x, y, z, new ItemStack(Item.stick));
			}

		}
		else if (meta < 15)
		{
			world.setBlockAndMetadataWithNotify(x, y, z, this.blockID, meta + 1);
			dropBlockAsItem_do(world, x, y, z, new ItemStack(Item.stick));
		}
		else
		{
			dropBlockAsItem_do(world, x, y, z, new ItemStack(Item.stick));
		}
	}

	/*public void getCollidingBoundingBoxes(World par1World, int par2, int par3, int par4, AxisAlignedBB par5AxisAlignedBB, ArrayList par6ArrayList)
	{
		setBlockBoundsBasedOnState(par1World, par2, par3, par4);
		super.getCollidingBoundingBoxes(par1World, par2, par3, par4, par5AxisAlignedBB, par6ArrayList);
	}*/

	public boolean shouldSideBeRendered(IBlockAccess par1IBlockAccess, int par2, int par3, int par4, int par5)
	{
		return par5 == 1 ? true : super.shouldSideBeRendered(par1IBlockAccess, par2, par3, par4, par5);
	}
}