package inficraft.api.machines;

import inficraft.toolconstruct.crafting.ToolBuilder;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;

public abstract class BlockLogicMachine extends BlockLogicBase
    implements IInventory
{
    public ItemStack inventory[];

    public BlockLogicMachine(int slots)
    {
        inventory = new ItemStack[slots];
    }

    /* Inventory management */
    public int getSizeInventory()
    {
        return inventory.length;
    }
    
    //Default to full-size itemstacks
    public int getInventoryStackLimit()
    {
        return 64;
    }

    public ItemStack getStackInSlot(int i)
    {
        return inventory[i];
    }
    
    public boolean isStackInSlot(int slot)
    {
    	return inventory[slot] != null;
    }

    public ItemStack decrStackSize(int slot, int quantity)
    {
        if (inventory[slot] != null)
        {
            if (inventory[slot].stackSize <= quantity)
            {
                ItemStack itemstack = inventory[slot];
                inventory[slot] = null;
                return itemstack;
            }
            ItemStack itemstack1 = inventory[slot].splitStack(quantity);
            if (inventory[slot].stackSize == 0)
            {
                inventory[slot] = null;
            }
            return itemstack1;
        }
        else
        {
            return null;
        }
    }

    public void setInventorySlotContents(int slot, ItemStack itemstack)
    {
        inventory[slot] = itemstack;
        if (itemstack != null && itemstack.stackSize > getInventoryStackLimit())
        {
            itemstack.stackSize = getInventoryStackLimit();
        }
    }

    /* NBT */
    public void readFromNBT(NBTTagCompound nbttagcompound)
    {
        super.readFromNBT(nbttagcompound);
        NBTTagList nbttaglist = nbttagcompound.getTagList("Items");
        inventory = new ItemStack[getSizeInventory()];
        for (int i = 0; i < nbttaglist.tagCount(); i++)
        {
            NBTTagCompound nbttagcompound1 = (NBTTagCompound)nbttaglist.tagAt(i);
            byte byte0 = nbttagcompound1.getByte("Slot");
            if (byte0 >= 0 && byte0 < inventory.length)
            {
                inventory[byte0] = ItemStack.loadItemStackFromNBT(nbttagcompound1);
            }
        }
    }

    public void writeToNBT(NBTTagCompound nbttagcompound)
    {
        super.writeToNBT(nbttagcompound);
        NBTTagList nbttaglist = new NBTTagList();
        for (int i = 0; i < inventory.length; i++)
        {
            if (inventory[i] != null)
            {
                NBTTagCompound nbttagcompound1 = new NBTTagCompound();
                nbttagcompound1.setByte("Slot", (byte)i);
                inventory[i].writeToNBT(nbttagcompound1);
                nbttaglist.appendTag(nbttagcompound1);
            }
        }

        nbttagcompound.setTag("Items", nbttaglist);
    }
    
    public boolean isUseableByPlayer(EntityPlayer entityplayer)
    {
        if (worldObj.getBlockTileEntity(xCoord, yCoord, zCoord) != this)
        {
            return false;
        }
        else
        {
            return entityplayer.getDistance((double)xCoord + 0.5D, (double)yCoord + 0.5D, (double)zCoord + 0.5D) <= 64D;
        }
    }

    /* Default implementation for hardly-used code */
    public void updateEntity()
    {
        super.updateEntity();
    }

    public void openChest()
    {
    }

    public void closeChest()
    {
    }
    
	public ItemStack getStackInSlotOnClosing (int var1)
	{
		return null;
	}
}
