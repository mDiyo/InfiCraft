package inficraft.infiblocks.tech;

import net.minecraft.src.Container;
import net.minecraft.src.EntityPlayer;
import net.minecraft.src.FurnaceRecipes;
import net.minecraft.src.ICrafting;
import net.minecraft.src.InventoryPlayer;
import net.minecraft.src.ItemStack;
import net.minecraft.src.Slot;
import net.minecraft.src.SlotFurnace;
import net.minecraft.src.TileEntityFurnace;

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
                icrafting.sendProgressBarUpdate(this, 0, tileentity.progress);
            }
            if (fuel != tileentity.fuel)
            {
                icrafting.sendProgressBarUpdate(this, 1, tileentity.fuel);
            }
            if (fuelGague != tileentity.fuelGague)
            {
                icrafting.sendProgressBarUpdate(this, 2, tileentity.fuelGague);
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

    public ItemStack transferStackInSlot(EntityPlayer par1EntityPlayer, int par2)
    {
        ItemStack var3 = null;
        Slot var4 = (Slot)this.inventorySlots.get(par2);

        if (var4 != null && var4.getHasStack())
        {
            ItemStack var5 = var4.getStack();
            var3 = var5.copy();

            if (par2 == 2)
            {
                if (!this.mergeItemStack(var5, 3, 39, true))
                {
                    return null;
                }

                var4.onSlotChange(var5, var3);
            }
            else if (par2 != 1 && par2 != 0)
            {
                if (FurnaceRecipes.smelting().getSmeltingResult(var5) != null)
                {
                    if (!this.mergeItemStack(var5, 0, 1, false))
                    {
                        return null;
                    }
                }
                else if (TileEntityFurnace.isItemFuel(var5))
                {
                    if (!this.mergeItemStack(var5, 1, 2, false))
                    {
                        return null;
                    }
                }
                else if (par2 >= 3 && par2 < 30)
                {
                    if (!this.mergeItemStack(var5, 30, 39, false))
                    {
                        return null;
                    }
                }
                else if (par2 >= 30 && par2 < 39 && !this.mergeItemStack(var5, 3, 30, false))
                {
                    return null;
                }
            }
            else if (!this.mergeItemStack(var5, 3, 39, false))
            {
                return null;
            }

            if (var5.stackSize == 0)
            {
                var4.putStack((ItemStack)null);
            }
            else
            {
                var4.onSlotChanged();
            }

            if (var5.stackSize == var3.stackSize)
            {
                return null;
            }

            var4.onPickupFromSlot(par1EntityPlayer, var5);
        }

        return var3;
    }
}
