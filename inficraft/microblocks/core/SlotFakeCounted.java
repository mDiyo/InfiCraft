package inficraft.microblocks.core;

import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;

public class SlotFakeCounted extends SlotFake {

	public SlotFakeCounted(IInventory inv, int index, int x, int y) {
		super(inv, index, x, y);
	}
	
	public void onClickByItem(ItemStack is, int button, boolean shift) {
		if(is != null) is = is.copy();
		ItemStack cur = getStack();
		if(cur == null) {
			putStack(is);
		} else {
			int amt = shift ? 10 : 1;
			if(button == 0)
				cur.stackSize -= amt;
			else if(button == 1)
				cur.stackSize += amt;
			else
				return;
			
			if(cur.stackSize > 127)
				cur.stackSize = 127;
			
			if(cur.stackSize <= 0)
				putStack(null);
			else
				putStack(cur);
		}
	}

}
