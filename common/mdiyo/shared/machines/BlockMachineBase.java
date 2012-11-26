package mDiyo.shared.machines;

import java.util.ArrayList;
import net.minecraft.src.*;

public abstract class BlockMachineBase extends BlockContainer
{
	//Should only be called by supertypes
    protected BlockMachineBase(int i, Material material)
    {
        super(i, material);
    }

    /*public boolean blockActivated(World world, int x, int y, int z, EntityPlayer player)
    {
        if (player.isSneaking())
        {
            return false;
        }
        Integer integer = getGui(world, x, y, z, player);
        if (integer == null)
        {
            return false;
        }
        else
        {
        	player.openGui(mod_InfiBlocks.getInstance(), integer, world, x, y, z);
            return true;
        }
    }*/
    
    public abstract Integer getGui(World world, int x, int y, int z, EntityPlayer entityplayer);

    /* Drop the block and all contents */
    public ArrayList getBlockDropped(World world, int x, int y, int z, int l, int i1)
    {
        ArrayList arraylist = super.getBlockDropped(world, x, y, z, l, i1);
        TileEntity tileentity = world.getBlockTileEntity(x, y, z);
        if (tileentity instanceof IInventory)
        {
            IInventory iinventory = (IInventory)tileentity;
            for (int iter = 0; iter < iinventory.getSizeInventory(); iter++)
            {
                net.minecraft.src.ItemStack itemstack = iinventory.getStackInSlot(iter);
                if (itemstack != null)
                {
                    arraylist.add(itemstack);
                    iinventory.setInventorySlotContents(iter, null);
                }
            }
        }
        return arraylist;
    }

    /*public void onBlockAdded(World world, int i, int j, int k)
    {
    }*/

    /* Set the default facing of the block
     * Only respects horizontal placement by default
     */
    public void onBlockPlacedBy(World world, int i, int j, int k, EntityLiving entityliving)
    {
        BlockLogicBase blocklogicbase = (BlockLogicBase)world.getBlockTileEntity(i, j, k);
        if (entityliving == null)
        {
            blocklogicbase.setFacing((byte)2);
        }
        else
        {
            int l = MathHelper.floor_double((double)((entityliving.rotationYaw * 4F) / 360F) + 0.5D) & 3;
            switch (l)
            {
                case 0:
                    blocklogicbase.setFacing((byte)2);
                    break;

                case 1:
                    blocklogicbase.setFacing((byte)5);
                    break;

                case 2:
                    blocklogicbase.setFacing((byte)3);
                    break;

                case 3:
                    blocklogicbase.setFacing((byte)4);
                    break;
            }
        }
    }

    public static boolean isActive(IBlockAccess iblockaccess, int i, int j, int k)
    {
        TileEntity tileentity = iblockaccess.getBlockTileEntity(i, j, k);
        if (tileentity instanceof BlockLogicBase)
        {
            return ((BlockLogicBase)tileentity).getActive();
        }
        else
        {
            return false;
        }
    }
}
