package net.minecraft.src.mechvent;

import java.util.List;
import net.minecraft.src.*;

public class GrinderContainer extends Container
{
	public InventoryCrafting craftMatrix;
    public GrinderLogic logic;
    public short progress;
    public short fuel;
    public short fuelGague;
    /** the width of the crafting inventory */
    private int craftingSize;

    public GrinderContainer(InventoryPlayer inventoryplayer, GrinderLogic crusherLogic)
    {
        progress = 0;
        fuel = 0;
        fuelGague = 0;
        logic = crusherLogic;
        craftMatrix = new InventoryCrafting(this, 3, 3);
        craftingSize = 3;
        
        addSlot(new Slot(crusherLogic, 0, 80, 61));
        
        for (int inputY = 0; inputY < 3; inputY++)
        {
        	for (int inputX = 0; inputX < 3; inputX++)
        	{
        		addSlot(new Slot(crusherLogic, 1 + inputX + inputY * 3, 8 + 18 * inputX, 9 + 18 * inputY));
        	}
        }
        for (int outputY = 0; outputY < 3; outputY++)
        {
        	for (int outputX = 0; outputX < 3; outputX++)
        	{
        		addSlot(new Slot(crusherLogic, 10 + outputX + outputY * 3, 115 + 18 * outputX, 9 + 18 * outputY));
        	}
        }
        
        for (int invY = 0; invY < 3; invY++)
        {
            for (int invX = 0; invX < 9; invX++)
            {
                addSlot(new Slot(inventoryplayer, invX + invY * 9 + 9, 8 + invX * 18, 84 + invY * 18));
            }
        }

        for (int hotbar = 0; hotbar < 9; hotbar++)
        {
            addSlot(new Slot(inventoryplayer, hotbar, 8 + hotbar * 18, 142));
        }
    }
    
    public ItemStack getStackInRowAndColumn(int width, int height)
    {
        if (width >= 0 && width < this.craftingSize && height < this.craftingSize)
        {
            int var3 = width + height * this.craftingSize;
            return logic.getStackInSlot(var3);
        }
        else
        {
            return null;
        }
    }
    
    public List getResultFor(ItemStack itemstack)
    {
        return CrushingManager.getInstance().findMatchingCrusherRecipe(itemstack);
    }

    public void updateCraftingResults()
    {
        super.updateCraftingResults();
        for (int i = 0; i < crafters.size(); i++)
        {
            ICrafting icrafting = (ICrafting)crafters.get(i);
            if (progress != logic.progress)
            {
                icrafting.updateCraftingInventoryInfo(this, 0, logic.progress);
            }
            if (fuel != logic.fuel)
            {
                icrafting.updateCraftingInventoryInfo(this, 1, logic.fuel);
            }
            if (fuelGague != logic.fuelGague)
            {
                icrafting.updateCraftingInventoryInfo(this, 2, logic.fuelGague);
            }
        }

        progress = logic.progress;
        fuel = logic.fuel;
        fuelGague = logic.fuelGague;
    }

    public void updateProgressBar(int i, int j)
    {
        if (i == 0)
        {
            logic.progress = (short)j;
        }
        if (i == 1)
        {
            logic.fuel = (short)j;
        }
        if (i == 2)
        {
            logic.fuelGague = (short)j;
        }
    }

    public boolean canInteractWith(EntityPlayer entityplayer)
    {
        return logic.isUseableByPlayer(entityplayer);
    }

    public int guiInventorySize()
    {
        return 19;
    }

    public int getInput()
    {
        return 0;
    }

    public ItemStack transferStackInSlot(int slotID)
    {
        ItemStack itemstack = null;
        Slot slot = (Slot)inventorySlots.get(slotID);
        if (slot != null && slot.getHasStack())
        {
            ItemStack itemstack1 = slot.getStack();
            itemstack = itemstack1.copy();
            if (slotID == 2)
            {
            	//stack, # of slots, # of total slots, ?
                if (!mergeItemStack(itemstack1, 3, 39, false))
                {
                    return null;
                }
            }
            else if (slotID >= 3 && slotID < 30)
            {
                if (!mergeItemStack(itemstack1, 30, 39, false))
                {
                    return null;
                }
            }
            else if (slotID >= 30 && slotID < 39)
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
