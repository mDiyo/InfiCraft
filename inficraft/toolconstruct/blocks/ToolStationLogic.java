package inficraft.toolconstruct.blocks;

import inficraft.api.machines.BlockLogicMachine;
import inficraft.toolconstruct.crafting.ToolBuilder;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;

/* Simple class for storing items in the block
 */

public class ToolStationLogic extends BlockLogicMachine
{
	ToolStationContainer container;
	ItemStack previousTool;
	String toolName;

	public ToolStationLogic()
	{
		super(5);
	}

	@Override
	public ItemStack getStackInSlotOnClosing (int var1)
	{
		return null;
	}

	@Override
	public String getInvName ()
	{
		return "toolstation.crafting";
	}

	@Override
	public Container getGuiContainer (InventoryPlayer inventoryplayer)
	{
		container = new ToolStationContainer(inventoryplayer, this);
		return container;
	}

	public void onInventoryChanged ()
	{
		buildTool("");
		if (this.worldObj != null)
		{
			this.blockMetadata = this.worldObj.getBlockMetadata(this.xCoord, this.yCoord, this.zCoord);
			this.worldObj.updateTileEntityChunkAndDoNothing(this.xCoord, this.yCoord, this.zCoord, this);
		}
	}

	void buildTool (String name)
	{
		ItemStack tool = ToolBuilder.instance.buildTool(inventory[1], inventory[2], inventory[3], name);
		if (inventory[0] == null)
			inventory[0] = tool;
		else
		{
			NBTTagCompound tags = inventory[0].getTagCompound();
			if (!tags.getCompoundTag("InfiTool").hasKey("Built"))
			{
				inventory[0] = tool;
			}
		}
		if (container != null)
			container.updateCraftingResults();
	}

	void consumeItems ()
	{
		for (int i = 1; i <= 3; i++)
			super.decrStackSize(i, 1);

		if (container != null)
			container.updateCraftingResults();
	}

	public void dumpExtraItems (int usedSlots, EntityPlayer player)
	{
		if (!worldObj.isRemote)
		{
			for (int iter = 0; iter < inventory.length; iter++)
			{
				if (iter > usedSlots && inventory[iter] != null)
				{
					EntityItem entityitem = new EntityItem(worldObj, player.posX, player.posY - 1.0D, player.posZ, inventory[iter]);
					worldObj.spawnEntityInWorld(entityitem);
					entityitem.onCollideWithPlayer(player);
				}
			}
		}
	}
}
