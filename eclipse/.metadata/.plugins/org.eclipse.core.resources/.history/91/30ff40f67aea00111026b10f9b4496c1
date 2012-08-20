package mdiyo.inficraft.infiblocks.tech;

import net.minecraft.src.Container;
import net.minecraft.src.EntityPlayer;
import net.minecraft.src.ICrafting;
import net.minecraft.src.InventoryPlayer;
import net.minecraft.src.ItemStack;
import net.minecraft.src.Slot;
import net.minecraft.src.SlotFurnace;

public class FurnaceContainer extends Container
{
    public FurnaceLogic tileentity;
    public short progress = 0;
    public short fuel = 0;
    public short fuelGague = 0;

    public FurnaceContainer(InventoryPlayer inventoryplayer, FurnaceLogic infifurnacelogic)
    {
        tileentity = infifurnacelogic;
        this.addSlotToContainer(new Slot(infifurnacelogic, 0, 56, 17));
        this.addSlotToContainer(new Slot(infifurnacelogic, 1, 56, 53));
        this.addSlotToContainer(new SlotFurnace(inventoryplayer.player, infifurnacelogic, 2, 116, 35));
        for (int i = 0; i < 3; i++)
        {
            for (int k = 0; k < 9; k++)
            {
            	this.addSlotToContainer(new Slot(inventoryplayer, k + i * 9 + 9, 8 + k * 18, 84 + i * 18));
            }
        }

        for (int j = 0; j < 9; j++)
        {
        	this.addSlotToContainer(new Slot(inventoryplayer, j, 8 + j * 18, 142));
        }
    }

    public void updateCraftingResults()
    {
        super.updateCraftingResults();
        for (int i = 0; i < crafters.size(); i++)
        {
            ICrafting icrafting = (ICrafting)crafters.get(i);
            if (progress != tileentity.progress)
            {
                icrafting.updateCraftingInventoryInfo(this, 0, tileentity.progress);
            }
            if (fuel != tileentity.fuel)
            {
                icrafting.updateCraftingInventoryInfo(this, 1, tileentity.fuel);
            }
            if (fuelGague != tileentity.fuelGague)
            {
                icrafting.updateCraftingInventoryInfo(this, 2, tileentity.fuelGague);
            }
        }

        progress = tileentity.progress;
        fuel = tileentity.fuel;
        fuelGague = tileentity.fuelGague;
    }

    public void updateProgressBar(int i, int j)
    {
        if (i == 0)
        {
            tileentity.progress = (short)j;
        }
        if (i == 1)
        {
            tileentity.fuel = (short)j;
        }
        if (i == 2)
        {
            tileentity.fuelGague = (short)j;
        }
    }

    public boolean canInteractWith(EntityPlayer entityplayer)
    {
        return tileentity.isUseableByPlayer(entityplayer);
    }

    public int guiInventorySize()
    {
        return 3;
    }

    public int getInput()
    {
        return 0;
    }

    public ItemStack transferStackInSlot(int i)
    {
        ItemStack itemstack = null;
        Slot slot = (Slot)inventorySlots.get(i);
        if (slot != null && slot.getHasStack())
        {
            ItemStack itemstack1 = slot.getStack();
            itemstack = itemstack1.copy();
            if (i == 2)
            {
                if (!mergeItemStack(itemstack1, 3, 39, true))
                {
                    return null;
                }
            }
            else if (i >= 3 && i < 30)
            {
                if (!mergeItemStack(itemstack1, 30, 39, false))
                {
                    return null;
                }
            }
            else if (i >= 30 && i < 39)
            {
                if (!mergeItemStack(itemstack1, 3, 30, false))
                {
                    return null;
                }
            }
            else if (!mergeItemStack(itemstack1, 3, 39, false))
            {
                return null;
            }
            if (itemstack1.stackSize == 0)
            {
                slot.putStack(null);
            }
            else
            {
                slot.onSlotChanged();
            }
            if (itemstack1.stackSize != itemstack.stackSize)
            {
                slot.onPickupFromSlot(itemstack1);
            }
            else
            {
                return null;
            }
        }
        return itemstack;
    }
}
