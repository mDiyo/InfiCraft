package net.minecraft.src;

public class TileEntityRack extends TileEntity implements IInventory
{
    private ItemStack[] items = new ItemStack[3];
    private float[] rotations = new float[3];

    /**
     * Returns the number of slots in the inventory.
     */
    public int getSizeInventory()
    {
        return this.items.length;
    }

    /**
     * Returns the stack in slot i
     */
    public ItemStack getStackInSlot(int var1)
    {
        return this.items[var1];
    }

    /**
     * Removes from an inventory slot (first arg) up to a specified number (second arg) of items and returns them in a
     * new stack.
     */
    public ItemStack decrStackSize(int var1, int var2)
    {
        if (this.items[var1] == null)
        {
            return null;
        }
        else
        {
            ItemStack var3;

            if (this.items[var1].stackSize <= var2)
            {
                var3 = this.items[var1];
                this.items[var1] = null;
            }
            else
            {
                var3 = this.items[var1].splitStack(var2);

                if (this.items[var1].stackSize == 0)
                {
                    this.items[var1] = null;
                }
            }

            this.onInventoryChanged();
            return var3;
        }
    }

    /**
     * Sets the given item stack to the specified slot in the inventory (can be crafting or armor sections).
     */
    public void setInventorySlotContents(int var1, ItemStack var2)
    {
        this.updateItem(var1, var2);

        if (var2 != null && var2.stackSize > this.getInventoryStackLimit())
        {
            var2.stackSize = this.getInventoryStackLimit();
        }

        this.onInventoryChanged();
    }

    /**
     * When some containers are closed they call this on each slot, then drop whatever it returns as an EntityItem -
     * like when you close a workbench GUI.
     */
    public ItemStack getStackInSlotOnClosing(int var1)
    {
        if (this.items[var1] != null)
        {
            ItemStack var2 = this.items[var1];
            this.items[var1] = null;
            return var2;
        }
        else
        {
            return null;
        }
    }

    /**
     * Returns the name of the inventory.
     */
    public String getInvName()
    {
        return "Rack";
    }

    /**
     * Reads a tile entity from NBT.
     */
    public void readFromNBT(NBTTagCompound var1)
    {
        super.readFromNBT(var1);
        NBTTagList var2 = var1.getTagList("Items");
        this.items = new ItemStack[this.getSizeInventory()];

        for (int var3 = 0; var3 < var2.tagCount(); ++var3)
        {
            NBTTagCompound var4 = (NBTTagCompound)var2.tagAt(var3);
            int var5 = var4.getByte("Slot") & 255;

            if (var5 >= 0 && var5 < this.items.length)
            {
                this.updateItem(var5, ItemStack.loadItemStackFromNBT(var4));
            }
        }
    }

    /**
     * Writes a tile entity to NBT.
     */
    public void writeToNBT(NBTTagCompound var1)
    {
        super.writeToNBT(var1);
        NBTTagList var2 = new NBTTagList();

        for (byte var3 = 0; var3 < this.items.length; ++var3)
        {
            if (this.items[var3] != null)
            {
                NBTTagCompound var4 = new NBTTagCompound();
                var4.setByte("Slot", var3);
                this.items[var3].writeToNBT(var4);
                var2.appendTag(var4);
            }
        }

        var1.setTag("Items", var2);
    }

    /**
     * Returns the maximum stack size for a inventory slot. Seems to always be 64, possibly will be extended. *Isn't
     * this more of a set than a get?*
     */
    public int getInventoryStackLimit()
    {
        return 1;
    }

    /**
     * Do not make give this method the name canInteractWith because it clashes with Container
     */
    public boolean isUseableByPlayer(EntityPlayer var1)
    {
        return this.worldObj.getBlockTileEntity(this.xCoord, this.yCoord, this.zCoord) != this ? false : var1.getDistanceSq((double)this.xCoord + 0.5D, (double)this.yCoord + 0.5D, (double)this.zCoord + 0.5D) <= 64.0D;
    }

    public void closeChest() {}

    public void openChest() {}

    public boolean canHoldItem(ItemStack var1)
    {
        return var1.getMaxStackSize() == 1 || mod_ToolRack.additionalTools.contains(Integer.valueOf(var1.itemID));
    }

    public boolean isItemInColumn(int var1)
    {
        return this.items[var1] != null;
    }

    public ItemStack takeItemInColumn(int var1)
    {
        return this.items[var1] != null ? this.decrStackSize(var1, 1) : null;
    }

    private void updateItem(int var1, ItemStack var2)
    {
        float var3 = 45.0F;

        if (mod_ToolRack.reversedItems.contains(Integer.valueOf(var2.itemID)))
        {
            var3 = -45.0F;
        }
        else if (mod_ToolRack.straightItems.contains(Integer.valueOf(var2.itemID)))
        {
            var3 = 0.0F;
        }

        this.items[var1] = var2;
        this.rotations[var1] = var3;
    }

    public float getAngle(int var1)
    {
        return this.rotations[var1];
    }

    public Packet132TileEntityData e()
    {
        NBTTagCompound var1 = new NBTTagCompound();
        this.writeToNBT(var1);
        return new Packet132TileEntityData(this.xCoord, this.yCoord, this.zCoord, 1, var1);
    }

    public void onDataPacket(NetworkManager var1, Packet132TileEntityData var2)
    {
        this.readFromNBT(var2.customParam1);
    }

    /**
     * signs and mobSpawners use this to send text and meta-data
     */
    public Packet getAuxillaryInfoPacket()
    {
        return this.e();
    }
}
