package mDiyo.inficraft.infiblocks.tech;

import mDiyo.api.machines.BlockLogicMachine;
import mDiyo.inficraft.infiblocks.InfiBlocks;
import net.minecraft.src.Container;
import net.minecraft.src.EntityPlayer;
import net.minecraft.src.IInventory;
import net.minecraft.src.InventoryPlayer;
import net.minecraft.src.ItemStack;
import net.minecraft.src.NBTTagCompound;
import net.minecraft.src.NBTTagList;

public class ChestLogic extends BlockLogicMachine
{
    public int containerType = 1;
    public int metadata = 0;
    public boolean adjacentChestChecked = false;
    public ChestLogic adjacentChestZNeg;
    public ChestLogic adjacentChestXPos;
    public ChestLogic adjacentChestXNeg;
    public ChestLogic adjacentChestZPosition;
    public float lidAngle;
    public float prevLidAngle;
    public int numUsingPlayers;
    private int ticksSinceSync;

    public ChestLogic()
    {
        super(27);
    }

    /**
     * Returns the number of slots in the inventory.
     */
    public int getSizeInventory()
    {
        return 27;
    }

    /**
     * Returns the stack in slot i
     */
    public ItemStack getStackInSlot(int var1)
    {
        return this.inventory[var1];
    }

    /**
     * Decrease the size of the stack in slot (first int arg) by the amount of the second int arg. Returns the new
     * stack.
     */
    public ItemStack decrStackSize(int var1, int var2)
    {
        if (this.inventory[var1] != null)
        {
            ItemStack var3;

            if (this.inventory[var1].stackSize <= var2)
            {
                var3 = this.inventory[var1];
                this.inventory[var1] = null;
                this.onInventoryChanged();
                return var3;
            }
            else
            {
                var3 = this.inventory[var1].splitStack(var2);

                if (this.inventory[var1].stackSize == 0)
                {
                    this.inventory[var1] = null;
                }

                this.onInventoryChanged();
                return var3;
            }
        }
        else
        {
            return null;
        }
    }

    /**
     * When some containers are closed they call this on each slot, then drop whatever it returns as an EntityItem -
     * like when you close a workbench GUI.
     */
    public ItemStack getStackInSlotOnClosing(int var1)
    {
        if (this.inventory[var1] != null)
        {
            ItemStack var2 = this.inventory[var1];
            this.inventory[var1] = null;
            return var2;
        }
        else
        {
            return null;
        }
    }

    /**
     * Sets the given item stack to the specified slot in the inventory (can be crafting or armor sections).
     */
    public void setInventorySlotContents(int var1, ItemStack var2)
    {
        this.inventory[var1] = var2;

        if (var2 != null && var2.stackSize > this.getInventoryStackLimit())
        {
            var2.stackSize = this.getInventoryStackLimit();
        }

        this.onInventoryChanged();
    }

    /**
     * Returns the name of the inventory.
     */
    public String getInvName()
    {
        return "container.chest";
    }

    /**
     * Reads a tile entity from NBT.
     */
    public void readFromNBT(NBTTagCompound var1)
    {
        super.readFromNBT(var1);
        NBTTagList var2 = var1.getTagList("Items");
        this.inventory = new ItemStack[this.getSizeInventory()];

        for (int var3 = 0; var3 < var2.tagCount(); ++var3)
        {
            NBTTagCompound var4 = (NBTTagCompound)var2.tagAt(var3);
            int var5 = var4.getByte("Slot") & 255;

            if (var5 >= 0 && var5 < this.inventory.length)
            {
                this.inventory[var5] = ItemStack.loadItemStackFromNBT(var4);
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

        for (int var3 = 0; var3 < this.inventory.length; ++var3)
        {
            if (this.inventory[var3] != null)
            {
                NBTTagCompound var4 = new NBTTagCompound();
                var4.setByte("Slot", (byte)var3);
                this.inventory[var3].writeToNBT(var4);
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
        return 64;
    }

    /**
     * Do not make give this method the name canInteractWith because it clashes with Container
     */
    public boolean isUseableByPlayer(EntityPlayer var1)
    {
        return this.worldObj.getBlockTileEntity(this.xCoord, this.yCoord, this.zCoord) != this ? false : var1.getDistanceSq((double)this.xCoord + 0.5D, (double)this.yCoord + 0.5D, (double)this.zCoord + 0.5D) <= 64.0D;
    }

    /**
     * Causes the TileEntity to reset all it's cached values for it's container block, blockID, metaData and in the case
     * of chests, the adjcacent chest check
     */
    public void updateContainingBlockInfo()
    {
        super.updateContainingBlockInfo();
        this.adjacentChestChecked = false;
    }

    public void checkForAdjacentChests()
    {
        if (!this.adjacentChestChecked)
        {
            this.adjacentChestChecked = true;
            this.adjacentChestZNeg = null;
            this.adjacentChestXPos = null;
            this.adjacentChestXNeg = null;
            this.adjacentChestZPosition = null;
            int var1 = this.worldObj.getBlockMetadata(this.xCoord, this.yCoord, this.zCoord);

            if (this.worldObj.getBlockId(this.xCoord - 1, this.yCoord, this.zCoord) == InfiBlocks.getContentInstance().chest.blockID && this.worldObj.getBlockMetadata(this.xCoord - 1, this.yCoord, this.zCoord) == var1)
            {
                this.adjacentChestXNeg = (ChestLogic)this.worldObj.getBlockTileEntity(this.xCoord - 1, this.yCoord, this.zCoord);
            }

            if (this.worldObj.getBlockId(this.xCoord + 1, this.yCoord, this.zCoord) == InfiBlocks.getContentInstance().chest.blockID && this.worldObj.getBlockMetadata(this.xCoord + 1, this.yCoord, this.zCoord) == var1)
            {
                this.adjacentChestXPos = (ChestLogic)this.worldObj.getBlockTileEntity(this.xCoord + 1, this.yCoord, this.zCoord);
            }

            if (this.worldObj.getBlockId(this.xCoord, this.yCoord, this.zCoord - 1) == InfiBlocks.getContentInstance().chest.blockID && this.worldObj.getBlockMetadata(this.xCoord, this.yCoord, this.zCoord - 1) == var1)
            {
                this.adjacentChestZNeg = (ChestLogic)this.worldObj.getBlockTileEntity(this.xCoord, this.yCoord, this.zCoord - 1);
            }

            if (this.worldObj.getBlockId(this.xCoord, this.yCoord, this.zCoord + 1) == InfiBlocks.getContentInstance().chest.blockID && this.worldObj.getBlockMetadata(this.xCoord, this.yCoord, this.zCoord + 1) == var1)
            {
                this.adjacentChestZPosition = (ChestLogic)this.worldObj.getBlockTileEntity(this.xCoord, this.yCoord, this.zCoord + 1);
            }

            if (this.adjacentChestZNeg != null)
            {
                this.adjacentChestZNeg.updateContainingBlockInfo();
            }

            if (this.adjacentChestZPosition != null)
            {
                this.adjacentChestZPosition.updateContainingBlockInfo();
            }

            if (this.adjacentChestXPos != null)
            {
                this.adjacentChestXPos.updateContainingBlockInfo();
            }

            if (this.adjacentChestXNeg != null)
            {
                this.adjacentChestXNeg.updateContainingBlockInfo();
            }
        }
    }

    /**
     * Allows the entity to update its state. Overridden in most subclasses, e.g. the mob spawner uses this to count
     * ticks and creates a new spawn inside its implementation.
     */
    public void updateEntity()
    {
        super.updateEntity();
        this.checkForAdjacentChests();

        if (++this.ticksSinceSync % 20 * 4 == 0)
        {
            this.worldObj.addBlockEvent(this.xCoord, this.yCoord, this.zCoord, InfiBlocks.getContentInstance().chest.blockID, 1, this.numUsingPlayers);
        }

        this.prevLidAngle = this.lidAngle;
        float var1 = 0.1F;
        double var2;

        if (this.numUsingPlayers > 0 && this.lidAngle == 0.0F && this.adjacentChestZNeg == null && this.adjacentChestXNeg == null)
        {
            double var4 = (double)this.xCoord + 0.5D;
            var2 = (double)this.zCoord + 0.5D;

            if (this.adjacentChestZPosition != null)
            {
                var2 += 0.5D;
            }

            if (this.adjacentChestXPos != null)
            {
                var4 += 0.5D;
            }

            this.worldObj.playSoundEffect(var4, (double)this.yCoord + 0.5D, var2, "random.chestopen", 0.5F, this.worldObj.rand.nextFloat() * 0.1F + 0.9F);
        }

        if (this.numUsingPlayers == 0 && this.lidAngle > 0.0F || this.numUsingPlayers > 0 && this.lidAngle < 1.0F)
        {
            float var8 = this.lidAngle;

            if (this.numUsingPlayers > 0)
            {
                this.lidAngle += var1;
            }
            else
            {
                this.lidAngle -= var1;
            }

            if (this.lidAngle > 1.0F)
            {
                this.lidAngle = 1.0F;
            }

            float var5 = 0.5F;

            if (this.lidAngle < var5 && var8 >= var5 && this.adjacentChestZNeg == null && this.adjacentChestXNeg == null)
            {
                var2 = (double)this.xCoord + 0.5D;
                double var6 = (double)this.zCoord + 0.5D;

                if (this.adjacentChestZPosition != null)
                {
                    var6 += 0.5D;
                }

                if (this.adjacentChestXPos != null)
                {
                    var2 += 0.5D;
                }

                this.worldObj.playSoundEffect(var2, (double)this.yCoord + 0.5D, var6, "random.chestclosed", 0.5F, this.worldObj.rand.nextFloat() * 0.1F + 0.9F);
            }

            if (this.lidAngle < 0.0F)
            {
                this.lidAngle = 0.0F;
            }
        }
    }

    /**
     * Called when a client event is received with the event number and argument, see World.addBlockEvent
     */
    public void receiveClientEvent(int var1, int var2)
    {
        if (var1 == 1)
        {
            this.numUsingPlayers = var2;
        }
    }

    public void openChest()
    {
        ++this.numUsingPlayers;
        this.worldObj.addBlockEvent(this.xCoord, this.yCoord, this.zCoord, InfiBlocks.getContentInstance().chest.blockID, 1, this.numUsingPlayers);
    }

    public void closeChest()
    {
        --this.numUsingPlayers;
        this.worldObj.addBlockEvent(this.xCoord, this.yCoord, this.zCoord, InfiBlocks.getContentInstance().chest.blockID, 1, this.numUsingPlayers);
    }

    /**
     * invalidates a tile entity
     */
    public void invalidate()
    {
        this.updateContainingBlockInfo();
        this.checkForAdjacentChests();
        super.invalidate();
    }

	@Override
	public Container getGuiContainer(InventoryPlayer inventoryplayer) {
		// TODO Auto-generated method stub
		return null;
	}
}
