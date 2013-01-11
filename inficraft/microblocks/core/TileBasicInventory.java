package inficraft.microblocks.core;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;

public class TileBasicInventory extends TileCombined implements IInventory {
	
	public BasicInventory inv;
	public String invname;
	
	protected void dropStack(int slot, List<ItemStack> drops) {
		if(inv.contents[slot] != null)
		{
			if(inv.contents[slot].stackSize > 0)
				drops.add(inv.contents[slot]);
			
			inv.contents[slot] = null;
		}
	}
	
	@Override
	public List<ItemStack> getInventoryDrops() {
		List<ItemStack> list = new ArrayList<ItemStack>();
		for(int k = 0; k < inv.contents.length; k++)
			dropStack(k, list);
		return list;
	}
	
	public TileBasicInventory(int size, String invname) {
		inv = new BasicInventory(size);
		this.invname = invname;
	}

	@Override
	public int getSizeInventory() {
		return inv.contents.length;
	}

	@Override
	public ItemStack getStackInSlot(int i) {
		return inv.contents[i];
	}

	@Override
	public ItemStack decrStackSize(int i, int j) {
		return inv.decrStackSize(i, j);
	}

	@Override
	public void setInventorySlotContents(int i, ItemStack itemstack) {
		inv.contents[i] = itemstack;
		onInventoryChanged();
	}

	@Override
	public String getInvName() {
		return invname;
	}

	@Override
	public int getInventoryStackLimit() {
		return 64;
	}

	@Override
	public boolean isUseableByPlayer(EntityPlayer entityplayer) {
		if (worldObj.getBlockTileEntity(xCoord, yCoord, zCoord) != this)
            return false;
        double distance = entityplayer.getDistanceSq((double)xCoord + 0.5D, (double)yCoord + 0.5D, (double)zCoord + 0.5D);
		return distance <= 64;
	}

	@Override
	public void openChest() {
	}

	@Override
	public void closeChest() {
	}
	
	@Override
	public void readFromNBT(NBTTagCompound nbttagcompound)
    {
        super.readFromNBT(nbttagcompound);
        inv.readFromNBT(nbttagcompound.getTagList("Items"));
    }

	@Override
    public void writeToNBT(NBTTagCompound nbttagcompound)
    {
        super.writeToNBT(nbttagcompound);
        nbttagcompound.setTag("Items", inv.writeToNBT());
    }

	@Override
	public ItemStack getStackInSlotOnClosing(int var1) {
		ItemStack is = getStackInSlot(var1);
		setInventorySlotContents(var1, null);
		return is;
	}


}
