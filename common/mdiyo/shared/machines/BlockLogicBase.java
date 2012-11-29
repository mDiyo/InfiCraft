package mDiyo.shared.machines;

import net.minecraft.src.Container;
import net.minecraft.src.InventoryPlayer;
import net.minecraft.src.NBTTagCompound;
import net.minecraft.src.TileEntity;

public abstract class BlockLogicBase extends TileEntity
{
    private boolean active;
    private byte facing;

    public BlockLogicBase()
    {
        active = false;
        facing = 0;
    }

    public void readFromNBT(NBTTagCompound nbttagcompound)
    {
        super.readFromNBT(nbttagcompound);
        facing = nbttagcompound.getByte("facing");
    }

    public void writeToNBT(NBTTagCompound nbttagcompound)
    {
        super.writeToNBT(nbttagcompound);
        nbttagcompound.setByte("facing", facing);
    }

    public boolean getActive()
    {
        return active;
    }

    public void setActive(boolean flag)
    {
        active = flag;
    }

    public short getFacing()
    {
        return facing;
    }

    public void setFacing(byte num)
    {
        facing = num;
    }
    
    public abstract Container getGuiContainer(InventoryPlayer inventoryplayer);
}
