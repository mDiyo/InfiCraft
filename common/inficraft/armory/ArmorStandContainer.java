package inficraft.armory;

import net.minecraft.src.Container;
import net.minecraft.src.EntityPlayer;
import net.minecraft.src.IInventory;
import net.minecraft.src.ItemStack;
import net.minecraft.src.Slot;

public class ArmorStandContainer extends Container
{
	EntityEquipment stand;
	
	public ArmorStandContainer(EntityEquipment equipment, IInventory inventoryplayer)
	{
		stand = equipment;
		/*this.addSlotToContainer(new Slot(equipment, 0, 62, 26));
		
		for (int slot = 0; slot < 4; ++slot)
        {
            this.addSlotToContainer(new SlotArmorCopy(this, equipment, slot + 1, 80, 8 + slot * 18, slot));
        }*/
		int var4, var5;

		//Slot: inventory, slot index, xDisplay, yDisplay
		for (int row = 0; row < 3; row++)
        {
            for (int col = 0; col < 9; col++)
            {
            	this.addSlotToContainer(new Slot(inventoryplayer, col + row * 9, 8 + col * 18, 84 + row * 18));
            }
        }

        for (int column = 0; column < 9; column++)
        {
        	this.addSlotToContainer(new Slot(inventoryplayer, column, 8 + column * 18, 142));
        }
	}

	@Override
	public boolean canInteractWith(EntityPlayer player)
	{
		return true;
	}

	@Override
    public ItemStack transferStackInSlot(EntityPlayer entityplayer, int slot)
    {
		ItemStack var3 = null;
        Slot var4 = (Slot)this.inventorySlots.get(slot);

        if (var4 != null && var4.getHasStack())
        {
            ItemStack var5 = var4.getStack();
            var3 = var5.copy();

            if (slot < 5)
            {
                if (!this.mergeItemStack(var5, 5, this.inventorySlots.size(), true))
                {
                    return null;
                }
            }
            else if (!this.mergeItemStack(var5, 0, 5, false))
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
        }

        return var3;
    }
}
