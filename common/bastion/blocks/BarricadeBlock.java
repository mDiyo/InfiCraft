package bastion.blocks;

import bastion.Bastion;
import net.minecraft.src.AxisAlignedBB;
import net.minecraft.src.Block;
import net.minecraft.src.EntityPlayer;
import net.minecraft.src.IBlockAccess;
import net.minecraft.src.ItemStack;
import net.minecraft.src.Material;
import net.minecraft.src.ModLoader;
import net.minecraft.src.World;

public class BarricadeBlock extends Block
{
	public BarricadeBlock(int blockID, String name, int texture)
	{
		super(blockID, Material.wood);
		setHardness(4.0F);
		this.blockIndexInTexture = texture;
		setBlockName("barricade" + name);
		ModLoader.addName(this, name + " Barricade");
	}

	public boolean renderAsNormalBlock()
	{
		return false;
	}

	public boolean isOpaqueCube()
	{
		return false;
	}

	public int getRenderType()
	{
		return Bastion.contentInstance.barrierModel;
	}

	public AxisAlignedBB getCollisionBoundingBoxFromPool(World par1World, int x, int y, int z)
	{
		return AxisAlignedBB.getBoundingBox(x, y, z, x + 1, y + 1, z + 1);
	}

	public void setBlockBoundsBasedOnState(IBlockAccess par1IBlockAccess, int x, int y, int z)
	{
		setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
	}

	public void harvestBlock(World world, EntityPlayer player, int x, int y, int z, int meta)
	{
		if (meta % 4 > 0)
		{
			world.setBlockAndMetadataWithNotify(x, y, z, this.blockID, meta - 1);
			dropBlockAsItem_do(world, x, y, z, new ItemStack(this));
		}
		else
		{
			dropBlockAsItem_do(world, x, y, z, new ItemStack(this));
		}
	}

	public boolean blockActivated(World world, int x, int y, int z, EntityPlayer player)
	{
		ItemStack stack = player.getCurrentEquippedItem();
		if ((stack != null) && (stack.itemID == this.blockID) && (!player.isSneaking()))
		{
			int meta = world.getBlockMetadata(x, y, z);
			if (meta % 4 != 3)
			{
				world.setBlockAndMetadataWithNotify(x, y, z, this.blockID, meta + 1);				
				Block.blocksList[this.blockID].onBlockPlacedBy(world, x, y, z, player);
				Block.blocksList[this.blockID].func_85105_g(world, x, y, z, 1);

				Block var9 = Block.blocksList[this.blockID];
				world.playSoundEffect(x + 0.5F, y + 0.5F, z + 0.5F, var9.stepSound.getStepSound(), (var9.stepSound.getVolume() + 1.0F) / 2.0F, var9.stepSound.getPitch() * 0.8F);
				player.swingItem();
				stack.stackSize -= 1;
			}
		}
		return false;
	}
}