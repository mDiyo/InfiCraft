package inficraft.armory;

import net.minecraft.src.Container;
import net.minecraft.src.EntityLiving;
import net.minecraft.src.EntityPlayer;
import net.minecraft.src.EntityZombie;
import net.minecraft.src.ItemStack;
import net.minecraft.src.World;

public class ArmorStandEntity extends EntityEquipment
{
	Container inventory;
	public ArmorStandEntity(World world) 
	{
		super(world);
		this.texture = "/infitextures/icedover.png";
		inventory = new ArmorStandContainer(this);
	}
	
	public boolean interact(EntityPlayer player)
    {
		player.openGui(InfiArmory.instance, entityId, worldObj, (int)posX, (int)posY, (int)posZ);
		return true;
    }

	@Override
	public Container getContainer()
	{
		return inventory;
	}

	@Override
	public int getSizeInventory()
	{
		return 5;
	}

	@Override
	public ItemStack getStackInSlot(int slot)
	{
		return getCurrentItemOrArmor(slot);
	}

	@Override
	public ItemStack decrStackSize(int var1, int var2)
	{
		return null;
	}

	@Override
	public ItemStack getStackInSlotOnClosing(int var1)
	{
		return null;
	}

	@Override
	public void setInventorySlotContents(int var1, ItemStack var2)
	{
		
	}

	@Override
	public String getInvName()
	{
		return "Inventory";
	}

	@Override
	public int getInventoryStackLimit()
	{
		return 1;
	}

	@Override
	public void onInventoryChanged()
	{
		
	}

	@Override
	public boolean isUseableByPlayer(EntityPlayer var1)
	{
		return true;
	}

	public void openChest() {}
	public void closeChest() {}
}
