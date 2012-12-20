package inficraft.infitools.crafting;

import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.item.ItemStack;
import inficraft.api.machines.BlockLogicMachine;
/* Simple class for storing items in the block
 */

public class ToolStationLogic extends BlockLogicMachine
{

	public ToolStationLogic()
	{
		super(4);
	}

	@Override
	public ItemStack getStackInSlotOnClosing(int var1)
	{
		return null;
	}

	@Override
	public String getInvName()
	{
		return "Tool Crafting";
	}

	@Override
	public Container getGuiContainer(InventoryPlayer inventoryplayer)
	{
		return new ToolStationContainer(inventoryplayer, this);
	}
	
	@Override
	public void setInventorySlotContents(int i, ItemStack itemstack)
    {
        inventory[i] = itemstack;
        if (itemstack != null && itemstack.stackSize > getInventoryStackLimit())
        {
            itemstack.stackSize = getInventoryStackLimit();
        }
        ItemStack tool = ToolBuilder.instance.buildTool(inventory[1], inventory[2], inventory[3]);
        inventory[0] = tool;
    }

}
