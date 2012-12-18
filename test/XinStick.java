package test;

import inficraft.infitools.InfiTools;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;

/*
 * mDiyo's development testing mod
 * Does everything on right-click!
 */

public class XinStick extends Item
{
	public XinStick(int id)
	{
		super(id);
		setCreativeTab(CreativeTabs.tabMisc);
	}

	@Override
	public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player)
	{
		// System.out.println("Click2");
		// spawnEntity(player.posX, player.posY, player.posZ, new ArmorStandEntity(world), world, player);
		// removeChunk(world, player.posX, player.posZ);
		ItemStack tool = new ItemStack(InfiTools.instance.theOneTool);

		NBTTagCompound compound = new NBTTagCompound();
		compound.setCompoundTag("InfiTool", new NBTTagCompound());
		compound.getCompoundTag("InfiTool").setInteger("Head", 12);
		compound.getCompoundTag("InfiTool").setInteger("Handle", 1);
		compound.getCompoundTag("InfiTool").setInteger("Accessory", 5);
		/*compound.getCompoundTag("InfiTool").setInteger("Effect", 0);
		compound.getCompoundTag("InfiTool").setInteger("Effect2", 0);*/
		
		compound.getCompoundTag("InfiTool").setInteger("Damage", 0);
		compound.getCompoundTag("InfiTool").setInteger("MaxDamage", 20);
		compound.getCompoundTag("InfiTool").setBoolean("Broken", false);
		
		compound.getCompoundTag("display").setString("Name", "Sword of Testing");
		tool.setTagCompound(compound);
		spawnItem(player.posX, player.posY, player.posZ, tool, world);
		return stack;
	}

	public static void spawnItem(double x, double y, double z, ItemStack stack, World world)
	{
		if (!world.isRemote)
		{
			EntityItem entityitem = new EntityItem(world, x + 0.5D, y + 0.5D, z + 0.5D, stack);
			//entityitem.delayBeforeCanPickup = 10;
			world.spawnEntityInWorld(entityitem);
		}
	}

	public static void spawnEntity(double x, double y, double z, Entity entity, World world, EntityPlayer player)
	{
		if (!world.isRemote)
		{
			entity.setPosition(x, y, z);
			entity.setAngles(player.cameraYaw, player.cameraYaw);
			world.spawnEntityInWorld(entity);
		}
	}

	public void removeChunk(World world, double dx, double dz)
	{
		for (int x = 0; x < 16; x++)
		{
			for (int z = 0; z < 16; z++)
			{
				for (int y = 0; y < 128; y++)
				{
					world.setBlockWithNotify((int) (x + dx), y, (int) (z + dz), 0);
				}
			}
		}
	}
}
