package inficraft.infitools.crafting;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.InventoryCraftResult;
import net.minecraft.inventory.InventoryCrafting;
import net.minecraft.inventory.Slot;
import net.minecraft.inventory.SlotCrafting;
import net.minecraft.inventory.SlotFurnace;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;

public class ToolStationContainer extends Container
{
	InventoryPlayer player;
	ToolStationLogic logic;
	
	public ToolStationContainer(InventoryPlayer inventoryplayer, ToolStationLogic builderlogic)
	{
		player = inventoryplayer;
		logic = builderlogic;
		
		for (int iter = 0; iter < 2; iter ++)
			this.addSlotToContainer(new Slot(builderlogic, (iter*2) + 1, 57, 29+(iter*18)));
		this.addSlotToContainer(new Slot(builderlogic, 2, 39, 38));
		
        this.addSlotToContainer(new SlotTool(inventoryplayer.player, builderlogic, 0, 115, 38));
		
		/* Player inventory */
		for (int column = 0; column < 3; column++)
        {
            for (int row = 0; row < 9; row++)
            {
            	this.addSlotToContainer(new Slot(inventoryplayer, row + column * 9 + 9, 8 + row * 18, 84 + column * 18));
            }
        }

        for (int column = 0; column < 9; column++)
        {
        	this.addSlotToContainer(new Slot(inventoryplayer, column, 8 + column * 18, 142));
        }
	}
	
	@Override
	public boolean canInteractWith(EntityPlayer var1)
	{
		return true;
	}

	public void onCraftMatrixChanged(IInventory inv)
	{
    }
	
	@Override
    public ItemStack transferStackInSlot(EntityPlayer entityplayer, int i)
    {
		return null;
    }
}
