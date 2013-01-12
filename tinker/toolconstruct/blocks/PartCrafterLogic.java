package tinker.toolconstruct.blocks;

import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import tinker.common.InventoryLogic;
import tinker.toolconstruct.crafting.PatternBuilder;

public class PartCrafterLogic extends InventoryLogic
{
	boolean craftedTop;
	boolean craftedBottom;

	public PartCrafterLogic()
	{
		super(10);
		craftedTop = false;
		craftedBottom = false;
	}

	@Override
	public String getInvName ()
	{
		return "toolstation.parts";
	}

	@Override
	public Container getGuiContainer (InventoryPlayer inventoryplayer)
	{
		return new PartCrafterContainer(inventoryplayer, this);
	}

	//Called when emptying a slot, not when another item is placed in it
	public ItemStack decrStackSize (int slot, int quantity)
	{
		ItemStack returnStack = super.decrStackSize(slot, quantity);

		if (slot == 4 || slot == 5)
		{
			if (!craftedTop)
				super.decrStackSize(1, 1); //Call super to avoid crafting again
			
			if (inventory[4] != null || inventory[5] != null)
				craftedTop = true;
			else
				craftedTop = false;
		}

		if (!craftedTop)
			buildTopPart();
		
		if (slot == 6 || slot == 7)
		{
			if (!craftedBottom)
				super.decrStackSize(3, 1);
			
			if (inventory[6] != null || inventory[7] != null)
				craftedBottom = true;
			else
				craftedBottom = false;
		}

		if (!craftedBottom)
			buildBottomPart();

		return returnStack;
	}

	//Called when a slot has something placed into it.
	public void setInventorySlotContents (int slot, ItemStack itemstack)
	{
		super.setInventorySlotContents(slot, itemstack);
		if ((slot == 0 || slot == 1) && !craftedTop)
			buildTopPart();
		if ((slot == 2 || slot == 3) && !craftedBottom)
			buildBottomPart();
	}

	void buildTopPart ()
	{
		ItemStack[] parts = PatternBuilder.instance.getToolPart(inventory[1], inventory[0], inventory[2]);
		if (parts != null)
		{
			inventory[4] = parts[0];
			inventory[5] = parts[1];
		}
		else
		{
			inventory[4] = inventory[5] = null;
		}
	}

	void buildBottomPart ()
	{
		ItemStack[] parts = PatternBuilder.instance.getToolPart(inventory[3], inventory[2], inventory[0]);
		if (parts != null)
		{
			inventory[6] = parts[0];
			inventory[7] = parts[1];
		}
		else
		{
			inventory[6] = inventory[7] = null;
		}
	}

	public boolean shouldRemoveItemsForCrafting (int slot)
	{
		if ((slot == 4 || slot == 5) && craftedTop)
			return false;
		if ((slot == 6 || slot == 7) && craftedBottom)
			return false;

		return true;
	}

	/* NBT */
	public void readFromNBT (NBTTagCompound tags)
	{
		super.readFromNBT(tags);
		craftedTop = tags.getBoolean("CraftedTop");
		craftedBottom = tags.getBoolean("CraftedBottom");
	}

	public void writeToNBT (NBTTagCompound tags)
	{
		super.writeToNBT(tags);
		tags.setBoolean("CraftedTop", craftedTop);
		tags.setBoolean("CraftedBottom", craftedBottom);
	}
}
