package mdiyo.shared.machines;

import net.minecraft.src.Container;
import net.minecraft.src.InventoryPlayer;
import net.minecraft.src.NBTTagCompound;
import net.minecraft.src.TileEntity;

public abstract class BlockLogicBase extends TileEntity
{
    //protected boolean created;
    private boolean active;
    private byte facing;
    //public boolean prevActive;
    //public short prevFacing;

    public BlockLogicBase()
    {
        //created = false;
        active = false;
        facing = 0;
        //prevActive = false;
        //prevFacing = 0;
    }

    public void readFromNBT(NBTTagCompound nbttagcompound)
    {
        super.readFromNBT(nbttagcompound);
        facing = nbttagcompound.getByte("facing");
    }

    public void writeToNBT(NBTTagCompound nbttagcompound)
    {
        super.writeToNBT(nbttagcompound);
        nbttagcompound.setShort("facing", facing);
    }

    public boolean getActive()
    {
        return active;
    }

    public void setActive(boolean flag)
    {
        active = flag;
    }

    /*public void setActiveWithoutNotify(boolean flag)
    {
        active = flag;
        prevActive = flag;
    }*/

    public short getFacing()
    {
        return facing;
    }

    public void setFacing(byte word0)
    {
        facing = word0;
    }
    
    public abstract Container getGuiContainer(InventoryPlayer inventoryplayer);
}
