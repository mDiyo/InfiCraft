package inficraft.microblocks.core;

import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class SlotFake extends Slot {

	protected int slotIndex;
	
	public SlotFake(IInventory inv, int index, int x, int y) {
		super(inv, index, x, y);
		slotIndex = index;
	}
	
	/**
     * Check if the stack is a valid item for this slot. Always true beside for the armor slots.
     */
    public boolean isItemValid(ItemStack par1ItemStack)
    {
        return true;
    }

	public void onClickByItem(ItemStack itemStack, int button, boolean shift) {
		if(itemStack != null) {
			itemStack = itemStack.copy();
			itemStack.stackSize = 0;
		}
		inventory.setInventorySlotContents(slotIndex, itemStack);
	}

}
