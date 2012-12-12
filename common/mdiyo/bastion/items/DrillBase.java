package mDiyo.bastion.items;

import mDiyo.api.detailing.DetailManager;
import net.minecraft.src.Block;
import net.minecraft.src.Entity;
import net.minecraft.src.EntityItem;
import net.minecraft.src.EntityLiving;
import net.minecraft.src.EntityPlayer;
import net.minecraft.src.EnumToolMaterial;
import net.minecraft.src.ItemPickaxe;
import net.minecraft.src.ItemStack;
import net.minecraft.src.ItemTool;
import net.minecraft.src.Material;
import net.minecraft.src.World;
import net.minecraftforge.common.ForgeHooks;

/* A drill to pound the earth
 * Scar it with raw power!
 */

public class DrillBase extends ItemPickaxe
{
	protected static Material materialEffectiveAgainst[];

	public DrillBase(int itemID, int damageBase)
	{
		super(itemID, EnumToolMaterial.IRON);
		setItemName("drill");
		this.setMaxDamage(10);

		materialEffectiveAgainst = (new Material[] { Material.rock, Material.iron, Material.ice, Material.glass, Material.piston });
	}

	public boolean onBlockStartBreak(ItemStack stack, int x, int y, int z, EntityPlayer entityplayer)
	{
		if (stack.getItemDamage() >= getMaxDamage())
			return true;
		return false;
	}

	public float getStrVsBlock(ItemStack stack, Block block, int meta)
	{
		for (int i = 0; i < materialEffectiveAgainst.length; i++)
		{
			if (materialEffectiveAgainst[i] == block.blockMaterial)
			{
				if (stack.getItemDamage() >= getMaxDamage())
					return 1f;
				return efficiencyOnProperMaterial;
			}
		}
		return 1.0F;
	}

	// Charge the drill
	public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player)
	{
		if (stack.getItemDamage() > 0)
		{
			stack.damageItem(-1, player);
			return stack.copy();
		}
		return stack;
	}

	@Override
	public boolean onBlockDestroyed(ItemStack stack, World world, int bID, int x, int y, int z, EntityLiving living)
	{
		if ((double) Block.blocksList[bID].getBlockHardness(world, x, y, z) != 0.0D)
		{
			stack.damageItem(1, living);
		}

		if (living instanceof EntityPlayer)
			crackSurroundingBlocks(stack, world, x, y, z, (EntityPlayer) living);

		return true;
	}

	protected void crackSurroundingBlocks(ItemStack stack, World world, int x, int y, int z, EntityPlayer living)
	{
		crackBlock(stack, world, x + 1, y, z, living);
		crackBlock(stack, world, x - 1, y, z, living);
		crackBlock(stack, world, x, y + 1, z, living);
		crackBlock(stack, world, x, y - 1, z, living);
		crackBlock(stack, world, x, y, z + 1, living);
		crackBlock(stack, world, x, y, z - 1, living);
	}

	protected void crackBlock(ItemStack stack, World world, int x, int y, int z, EntityPlayer living)
	{
		int bID = world.getBlockId(x, y, z);
		int meta = world.getBlockMetadata(x, y, z);
		if (bID != 0 || Block.blocksList[bID] != null && ForgeHooks.isToolEffective(stack, Block.blocksList[bID], meta))
		{
			Block block = Block.blocksList[bID];
			for (int i = 0; i < materialEffectiveAgainst.length; i++)
			{
				if (materialEffectiveAgainst[i] == block.blockMaterial)
				{
					if (!(DetailManager.getInstance().drill(world, x, y, z, bID, meta)))
					{
						world.setBlockWithNotify(x, y, z, 0);
						block.harvestBlock(world, living, x, y, z, meta);
						break;
					}
				}
			}
		}
	}
}
