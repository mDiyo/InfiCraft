package inficraft.microblocks.core;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;

public class BasicInventory implements IInventory {
	public ItemStack[] contents;
	
	public BasicInventory(int size) {
		contents = new ItemStack[size];
	}
	
	public ItemStack decrStackSize(int slot, int amount) {
		if(contents[slot] == null || contents[slot].stackSize == 0)
			return null;
		if(contents[slot].stackSize <= amount)
		{
			ItemStack old = contents[slot];
			contents[slot] = null;
			return old;
		}
		return contents[slot].splitStack(amount);
	}
	
	// returns true if inventory changes were made
	public boolean mergeStackIntoRange(int inslot, int start, int end)
	{
		return mergeStackIntoRange(this, this, inslot, start, end);
	}
	
	// returns remaining items
	public ItemStack mergeStackIntoRange(ItemStack input, int start, int end)
	{
		return mergeStackIntoRange(input, this, start, end);
	}
	
	// returns remaining items
	public static ItemStack mergeStackIntoRange(ItemStack input, IInventory inv, int start, int end)
	{
		if(input == null || input.stackSize == 0)
			return null;
		for(int i = start; i < end; i++)
		{
			ItemStack ov = inv.getStackInSlot(i);
			if(ov == null || ov.itemID != input.itemID || ov.getItemDamage() != input.getItemDamage())
				continue;
			int max = ov.getMaxStackSize();
			if(ov.stackSize + input.stackSize <= max)
			{
				ov.stackSize += input.stackSize;
				inv.setInventorySlotContents(i, ov);
				return null;
			}
			int move = max - ov.stackSize;
			if(move > 0)
			{
				ov.stackSize += move;
				input.stackSize -= move;
				inv.setInventorySlotContents(i, ov);
			}
		}
		if(input.stackSize == 0)
			return null;
		for(int i = start; i < end; i++)
		{
			if(inv.getStackInSlot(i) != null)
				continue;
			inv.setInventorySlotContents(i, input);
			return null;
		}
		return input;
	}
	
	// returns true if inventory changed
	public static boolean mergeStackIntoRange(IInventory source, IInventory dest, int inslot, int start, int end)
	{
		ItemStack input = source.getStackInSlot(inslot);
		if(input == null || input.stackSize == 0)
			return false;
		boolean changesMade = false;
		for(int i = start; i < end; i++)
		{
			ItemStack ov = dest.getStackInSlot(i);
			if(ov == null || ov.itemID != input.itemID || ov.getItemDamage() != input.getItemDamage())
				continue;
			int max = ov.getMaxStackSize();
			if(ov.stackSize + input.stackSize <= max)
			{
				ov.stackSize += input.stackSize;
				source.setInventorySlotContents(inslot, null);
				dest.setInventorySlotContents(i, ov);
				return true;
			}
			int move = max - ov.stackSize;
			if(move > 0)
			{
				ov.stackSize += move;
				dest.setInventorySlotContents(i, ov);
				input.stackSize -= move;
				changesMade = true;
			}
		}
		if(input.stackSize == 0) {
			source.setInventorySlotContents(inslot, null);
			return changesMade;
		}
		for(int i = start; i < end; i++)
		{
			ItemStack ov = dest.getStackInSlot(i);
			if(ov != null)
				continue;
			dest.setInventorySlotContents(i, input);
			source.setInventorySlotContents(inslot, null);
			return true;
		}
		source.setInventorySlotContents(inslot, input);
		return changesMade;
	}
	
	public void readFromNBT(NBTTagList tag) {
		for(int i = 0; i < contents.length; i++)
			contents[i] = null;
        
		for(int i = 0; i < tag.tagCount(); i++)
        {
            NBTTagCompound item = (NBTTagCompound)tag.tagAt(i);
            int slot = item.getByte("Slot") & 0xff;
            if (slot >= 0 && slot < contents.length)
            	contents[slot] = ItemStack.loadItemStackFromNBT(item);
        }
	}
	
	public NBTTagList writeToNBT() {
		NBTTagList tag = new NBTTagList("Items");
		for(int i = 0; i < contents.length; i++)
		{
			if(contents[i] == null)
				continue;
			NBTTagCompound item = new NBTTagCompound();
			contents[i].writeToNBT(item);
			item.setByte("Slot", (byte)i);
			tag.appendTag(item);
		}
		return tag;
	}

	@Override
	public int getSizeInventory() {
		return contents.length;
	}

	@Override
	public ItemStack getStackInSlot(int var1) {
		return contents[var1];
	}

	@Override
	public ItemStack getStackInSlotOnClosing(int var1) {
		return null;
	}

	@Override
	public void setInventorySlotContents(int var1, ItemStack var2) {
		contents[var1] = var2;
	}

	@Override
	public String getInvName() {
		return "BasicInventory";
	}

	@Override
	public int getInventoryStackLimit() {
		return 64;
	}

	@Override
	public void onInventoryChanged() {
	}

	@Override
	public boolean isUseableByPlayer(EntityPlayer var1) {
		return false;
	}

	@Override
	public void openChest() {
	}

	@Override
	public void closeChest() {
	}
}
