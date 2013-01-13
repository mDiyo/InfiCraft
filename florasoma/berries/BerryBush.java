package florasoma.berries;

import java.util.List;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockLeavesBase;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.EnumPlantType;
import net.minecraftforge.common.ForgeDirection;
import net.minecraftforge.common.IPlantable;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import florasoma.common.FloraSomaTab;

public class BerryBush extends BlockLeavesBase implements IPlantable
{
	private int icon;
	Random random;

	public BerryBush(int id, int texture)
	{
		super(id, texture, Material.leaves, false);
		icon = texture;
		this.setTickRandomly(true);
		random = new Random();
		this.setHardness(0.3F);
		this.setStepSound(Block.soundGrassFootstep);
		this.setBlockName("berrybush");
		this.setCreativeTab(FloraSomaTab.tab);
	}

	/* Berries show up at meta 12-15 */
	@Override
	public int getBlockTextureFromSideAndMetadata (int side, int metadata)
	{
		if (metadata < 12)
		{
			return blockIndexInTexture + metadata % 4;
		} else
		{
			return blockIndexInTexture + 16 + metadata % 4;
		}
	}

	/* Bushes are stored by size then type */
	@Override
	public int damageDropped (int metadata)
	{
		return metadata % 4;
	}

	/* The following methods define a berry bush's size depending on metadata */
	@Override
	public AxisAlignedBB getCollisionBoundingBoxFromPool (World world, int x, int y, int z)
	{
		int l = world.getBlockMetadata(x, y, z);
		if (l < 4)
		{
			return AxisAlignedBB.getBoundingBox((double) x + 0.25D, y, (double) z + 0.25D, (double) x + 0.75D, (double) y + 0.5D, (double) z + 0.75D);
		} else if (l < 8)
		{
			return AxisAlignedBB.getBoundingBox((double) x + 0.125D, y, (double) z + 0.125D, (double) x + 0.875D, (double) y + 0.75D, (double) z + 0.875D);
		} else
		{
			return AxisAlignedBB.getBoundingBox(x, y, z, (double) x + 1.0D, (double) y + 1.0D, (double) z + 1.0D);
		}
	}

	public AxisAlignedBB getSelectedBoundingBoxFromPool (World world, int x, int y, int z)
	{
		int l = world.getBlockMetadata(x, y, z);
		if (l < 4)
		{
			return AxisAlignedBB.getBoundingBox((double) x + 0.25D, y, (double) z + 0.25D, (double) x + 0.75D, (double) y + 0.5D, (double) z + 0.75D);
		} else if (l < 8)
		{
			return AxisAlignedBB.getBoundingBox((double) x + 0.125D, y, (double) z + 0.125D, (double) x + 0.875D, (double) y + 0.75D, (double) z + 0.875D);
		} else
		{
			return AxisAlignedBB.getBoundingBox(x, y, z, (double) x + 1.0D, (double) y + 1.0D, (double) z + 1.0D);
		}
	}

	@Override
	public void setBlockBoundsBasedOnState (IBlockAccess iblockaccess, int x, int y, int z)
	{
		int md = iblockaccess.getBlockMetadata(x, y, z);

		float minX;
		float minY = 0F;
		float minZ;
		float maxX;
		float maxY;
		float maxZ;

		if (md < 4)
		{
			minX = minZ = 0.25F;
			maxX = maxZ = 0.75F;
			maxY = 0.5F;
		} else

		if (md < 8)
		{
			minX = minZ = 0.125F;
			maxX = maxZ = 0.875F;
			maxY = 0.75F;
		}

		else
		{
			minX = minZ = 0.0F;
			maxX = maxZ = 1.0F;
			maxY = 1.0F;
		}
		setBlockBounds(minX, minY, minZ, maxX, maxY, maxZ);
	}

	/* Left-click harvests berries */
	@Override
	public void onBlockClicked (World world, int x, int y, int z, EntityPlayer player)
	{
		if (!world.isRemote)
		{
			int meta = world.getBlockMetadata(x, y, z);
			if (meta >= 12)
			{
				world.setBlockAndMetadataWithNotify(x, y, z, blockID, meta - 4);
				EntityItem entityitem = new EntityItem(world, player.posX, player.posY - 1.0D, player.posZ, new ItemStack(FloraBerries.berryItem.itemID, 1, meta - 12));
				world.spawnEntityInWorld(entityitem);
				entityitem.onCollideWithPlayer(player);
			}
		}
	}

	/* Right-click harvests berries */
	@Override
	public boolean onBlockActivated (World world, int x, int y, int z, EntityPlayer player, int par6, float par7, float par8, float par9)
	{
		if (world.isRemote)
			return false;

		int meta = world.getBlockMetadata(x, y, z);
		if (meta >= 12)
		{
			world.setBlockAndMetadataWithNotify(x, y, z, blockID, meta - 4);
			EntityItem entityitem = new EntityItem(world, player.posX, player.posY - 1.0D, player.posZ, new ItemStack(FloraBerries.berryItem.itemID, 1, meta - 12));
			world.spawnEntityInWorld(entityitem);
			entityitem.onCollideWithPlayer(player);
		}
		return true;
	}

	/* Render logic */

	@Override
	public boolean isOpaqueCube ()
	{
		return false;
	}

	public void setGraphicsLevel (boolean flag)
	{
		graphicsLevel = flag;
		this.blockIndexInTexture = this.icon + (flag ? 0 : 32);
	}

	@Override
	public boolean renderAsNormalBlock ()
	{
		return false;
	}

	public int getRenderType ()
	{
		return FloraBerries.instance.berryModelID;
	}

	public boolean shouldSideBeRendered (IBlockAccess iblockaccess, int i, int j, int k, int l)
	{
		if (l > 7)
		{
			return super.shouldSideBeRendered(iblockaccess, i, j, k, l);
		} else if (graphicsLevel)
		{
			return super.shouldSideBeRendered(iblockaccess, i, j, k, l);
		} else
		{
			return true;
		}
	}

	@Override
	public String getTextureFile ()
	{
		return FloraBerries.bushTexture;
	}

	/* Bush growth */

	@Override
	public void updateTick (World world, int x, int y, int z, Random random1)
	{
		if (world.isRemote)
		{
			return;
		}

		int height;

		for (height = 1; world.getBlockId(x, y - height, z) == this.blockID; ++height)
		{
			;
		}

		if (random1.nextInt(20) == 0 && world.getBlockLightValue(x, y, z) >= 8)
		{
			int md = world.getBlockMetadata(x, y, z);
			if (md < 12)
			{
				world.setBlockAndMetadataWithNotify(x, y, z, blockID, md + 4);
			}
			if (random1.nextInt(3) == 0 && height < 3 && world.getBlockId(x, y + 1, z) == 0 && md >= 8)
			{
				world.setBlockAndMetadataWithNotify(x, y + 1, z, blockID, md % 4);
			}
		}
	}

	/* Resistance to fire */

	@Override
	public int getFlammability (IBlockAccess world, int x, int y, int z, int metadata, ForgeDirection face)
	{
		return 25;
	}

	@Override
	public boolean isFlammable (IBlockAccess world, int x, int y, int z, int metadata, ForgeDirection face)
	{
		return true;
	}

	@Override
	public int getFireSpreadSpeed (World world, int x, int y, int z, int metadata, ForgeDirection face)
	{
		return 4;
	}

	/**
	 * returns a list of items with the same ID, but different meta (eg: dye returns 16 items)
	 */
	@SideOnly(Side.CLIENT)
	@Override
	public void getSubBlocks (int par1, CreativeTabs par2CreativeTabs, List par3List)
	{
		for (int var4 = 0; var4 < 16; ++var4)
		{
			par3List.add(new ItemStack(par1, 1, var4));
		}
	}

	@Override
	public EnumPlantType getPlantType (World world, int x, int y, int z)
	{
		return EnumPlantType.Plains;
	}

	@Override
	public int getPlantID (World world, int x, int y, int z)
	{
		return this.blockID;
	}

	@Override
	public int getPlantMetadata (World world, int x, int y, int z)
	{
		return world.getBlockMetadata(x, y, z);
	}
}
