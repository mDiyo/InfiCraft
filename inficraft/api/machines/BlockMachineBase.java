package inficraft.api.machines;

import java.util.ArrayList;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public abstract class BlockMachineBase extends BlockContainer
{
	//Should only be called by supertypes
    protected BlockMachineBase(int i, Material material)
    {
        super(i, material);
    }

    @Override
    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int par6, float par7, float par8, float par9)
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
        	player.openGui(getModInstance(), integer, world, x, y, z);
            return true;
        }
    }
    
    public abstract Integer getGui(World world, int x, int y, int z, EntityPlayer entityplayer);
    
    public abstract Object getModInstance();

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
                ItemStack itemstack = iinventory.getStackInSlot(iter);
                if (itemstack != null)
                {
                    arraylist.add(itemstack);
                    iinventory.setInventorySlotContents(iter, null);
                }
            }
        }
        return arraylist;
    }


    /* Set the default facing of the block
     * Only respects horizontal placement by default
     */
    @Override
    public void onBlockPlacedBy(World world, int x, int y, int z, EntityLiving entityliving)
    {
        BlockLogicBase blocklogicbase = (BlockLogicBase)world.getBlockTileEntity(x, y, z);
        if (entityliving == null)
        {
            blocklogicbase.setFacing((byte)2);
        }
        else
        {
            int facing = MathHelper.floor_double((double)((entityliving.rotationYaw * 4F) / 360F) + 0.5D) & 3;
            switch (facing)
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
