package inficraft.api.machines;

import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;

/*
 * Basic logic block that knows its direction and whether it's active
 */

public abstract class BlockLogicBase extends TileEntity
{
	protected boolean active;
	protected byte facing;

	public BlockLogicBase()
	{
		active = false;
		facing = 0;
	}

	public void readFromNBT (NBTTagCompound nbttagcompound)
	{
		super.readFromNBT(nbttagcompound);
		facing = nbttagcompound.getByte("facing");
		active = nbttagcompound.getBoolean("active");
	}

	public void writeToNBT (NBTTagCompound nbttagcompound)
	{
		super.writeToNBT(nbttagcompound);
		nbttagcompound.setByte("facing", facing);
		nbttagcompound.setBoolean("active", active);
	}

	public boolean getActive ()
	{
		return active;
	}

	public void setActive (boolean flag)
	{
		active = flag;
	}

	public short getFacing ()
	{
		return facing;
	}

	public void setFacing (byte num)
	{
		facing = num;
	}

	public abstract Container getGuiContainer (InventoryPlayer inventoryplayer);
}
