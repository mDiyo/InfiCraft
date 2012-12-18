package mDiyo.bastion.blocks;

import net.minecraft.src.Block;
import net.minecraft.src.BlockDeadBush;
import net.minecraft.src.BlockTallGrass;
import net.minecraft.src.EntityPlayer;
import net.minecraft.src.ItemBlock;
import net.minecraft.src.ItemStack;
import net.minecraft.src.MathHelper;
import net.minecraft.src.StepSound;
import net.minecraft.src.World;

public class BarricadeItem extends ItemBlock
{
	private int brID;

	public BarricadeItem(int id)
	{
		super(id);
		this.brID = (id + 256);
	}

	/*public boolean onItemUse(ItemStack stack, EntityPlayer player, World world, int x, int y, int z, int side)
	{
		int facing = MathHelper.floor_double(player.rotationYaw * 4.0F / 360.0F + 0.5D) & 0x3;

		int blockID = world.getBlockId(x, y, z);

		if (blockID == Block.snow.blockID)
		{
			side = 1;
		} else {
			if ((!player.isSneaking()) && (blockID == this.brID))
			{
				return false;
			}

			if ((blockID != Block.vine.blockID) && (blockID != Block.tallGrass.blockID) && (blockID != Block.deadBush.blockID))
			{
				if (side == 0)
				{
					y--;
				}

				if (side == 1)
				{
					y++;
				}

				if (side == 2)
				{
					z--;
				}

				if (side == 3)
				{
					z++;
				}

				if (side == 4)
				{
					x--;
				}

				if (side == 5)
				{
					x++;
				}
			}
		}
		if (stack.stackSize == 0)
		{
			return false;
		}
		if (!player.canPlayerEdit(x, y, z, side, stack))
		{
			return false;
		}

		if (world.canBlockBePlacedAt(this.brID, x, y, z, false, side))
		{
			Block var9 = Block.blocksList[this.brID];

			if (world.setBlockAndMetadataWithNotify(x, y, z, this.brID, facing * 4))
			{
				if (world.getBlockId(x, y, z) == this.brID)
				{
					Block.blocksList[this.brID].onBlockPlaced(world, x, y, z, side);
					Block.blocksList[this.brID].onBlockPlacedBy(world, x, y, z, player);
				}

				world.playSoundEffect(x + 0.5F, y + 0.5F, z + 0.5F, var9.stepSound.getStepSound(), (var9.stepSound.getVolume() + 1.0F) / 2.0F, var9.stepSound.getPitch() * 0.8F);
				stack.stackSize -= 1;
			}

			return true;
		}

		return false;
	}*/
}