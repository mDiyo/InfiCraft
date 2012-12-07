package mDiyo.inficraft.armory;

import net.minecraft.src.EntityPlayer;
import net.minecraft.src.IInventory;
import net.minecraft.src.INetworkManager;
import net.minecraft.src.ItemStack;
import net.minecraft.src.NBTTagCompound;
import net.minecraft.src.NBTTagList;
import net.minecraft.src.Packet;
import net.minecraft.src.Packet132TileEntityData;
import net.minecraft.src.TileEntity;

public class ArmorStandLogic extends TileEntity
	implements IInventory
{
	ItemStack[] armor;
	boolean changed;
	
	public ArmorStandLogic()
	{
		armor = new ItemStack[4];
	}

	@Override
	public int getSizeInventory() 
	{
		return armor.length;
	}

	@Override
	public ItemStack getStackInSlot(int slot) 
	{
		return armor[slot];
	}

	@Override
	public ItemStack decrStackSize(int slot, int quantity) 
	{
		if (this.armor[slot] == null)
            return null;
        
        else
        {
            ItemStack stack;

            if (this.armor[slot].stackSize <= quantity)
            {
                stack = this.armor[slot];
                this.armor[slot] = null;
            }
            else
            {
                stack = this.armor[slot].splitStack(quantity);

                if (this.armor[slot].stackSize == 0)
                {
                    this.armor[slot] = null;
                }
            }

            this.onInventoryChanged();
            return stack;
        }
	}

	@Override
	public void setInventorySlotContents(int slot, ItemStack stack) 
	{
		updateItem(slot, stack);

        if (stack != null && stack.stackSize > this.getInventoryStackLimit())
        {
            stack.stackSize = this.getInventoryStackLimit();
        }

        onInventoryChanged();
	}
	
	void updateItem(int slot, ItemStack stack)
    {
		this.armor[slot] = stack.copy();
		changed = true;
    }
	
	public boolean canHoldItem(ItemStack stack)
    {
		return stack.getMaxStackSize() == 1;
    }

    public boolean isItemInColumn(int slot)
    {
        return this.armor[slot] != null;
    }

    public ItemStack takeItemInColumn(int slot)
    {
        return this.armor[slot] != null ? this.decrStackSize(slot, 1) : null;
    }

	@Override
	public String getInvName() 
	{
		return "Armor Stand";
	}

	@Override
	public int getInventoryStackLimit() 
	{
		return 1;
	}

	@Override
	public boolean isUseableByPlayer(EntityPlayer player) 
	{
		return true;
	}

	public ItemStack getStackInSlotOnClosing(int var1) { return null; }
	public void openChest() {}
	public void closeChest() {}
	
	@Override
    public void readFromNBT(NBTTagCompound var1)
    {
        super.readFromNBT(var1);
        NBTTagList tagList = var1.getTagList("Items");
        this.armor = new ItemStack[this.getSizeInventory()];

        for (int iter = 0; iter < tagList.tagCount(); ++iter)
        {
            NBTTagCompound tagCompund = (NBTTagCompound)tagList.tagAt(iter);
            int slot = tagCompund.getByte("Slot");

            if (slot >= 0 && slot < this.armor.length)
            {
                this.updateItem(slot, ItemStack.loadItemStackFromNBT(tagCompund));
            }
        }
    }

    @Override
    public void writeToNBT(NBTTagCompound var1)
    {
        super.writeToNBT(var1);
        NBTTagList tagList = new NBTTagList();

        for (byte iter = 0; iter < this.armor.length; ++iter)
        {
            if (this.armor[iter] != null)
            {
                NBTTagCompound tagCompound = new NBTTagCompound();
                tagCompound.setByte("Slot", iter);
                this.armor[iter].writeToNBT(tagCompound);
                tagList.appendTag(tagCompound);
            }
        }

        var1.setTag("Items", tagList);
    }

    @Override
	public Packet getDescriptionPacket()
    {
    	NBTTagCompound compound = new NBTTagCompound();
        this.writeToNBT(compound);
        return new Packet132TileEntityData(this.xCoord, this.yCoord, this.zCoord, 1, compound);
    }
    
    @Override
	public void onDataPacket(INetworkManager net, Packet132TileEntityData pkt)
	{
    	readFromNBT(pkt.customParam1);
	}
    
    public boolean hasChanged()
    {
    	return changed;
    }
    
    public ItemStack[] getItems()
    {
    	changed = false;
    	return armor;
    }
}
