package tinker.common;

import java.util.ArrayList;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public abstract class InventoryBlock extends BlockContainer
{
	protected InventoryBlock(int id, Material material)
	{
		super(id, material);
	}

	/* Logic backend */
	public TileEntity createNewTileEntity (World var1) { return null; }	
	public abstract TileEntity createNewTileEntity(World world, int metadata);
	public abstract Integer getGui(World world, int x, int y, int z, EntityPlayer entityplayer);    
    public abstract Object getModInstance();

	@Override
	public boolean onBlockActivated (World world, int x, int y, int z, EntityPlayer player, int side, float clickX, float clickY, float clickZ)
	{
		if (player.isSneaking())
			return false;
		
		Integer integer = getGui(world, x, y, z, player);
		if (integer == null || integer == -1)
		{
			return false;
		}
		else
		{
			player.openGui(getModInstance(), integer, world, x, y, z);
			return true;
		}
	}

	/* Inventory */
	//Nonfunctional
	/*@Override
	public ArrayList getBlockDropped(World world, int x, int y, int z, int metadata, int fortune)
    {
		System.out.println("Dropping block contents");
        ArrayList arraylist = super.getBlockDropped(world, x, y, z, metadata, fortune);
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
    }*/
	
	@Override
    public void onBlockPlacedBy(World world, int x, int y, int z, EntityLiving entityliving)
    {
		TileEntity logic = world.getBlockTileEntity(x, y, z);
		if (logic instanceof IFacingLogic)
		{
			IFacingLogic facing = (IFacingLogic) logic;
			//Set facing here
		}
    }
	
	public static boolean isActive(IBlockAccess world, int x, int y, int z)
    {
		TileEntity logic = world.getBlockTileEntity(x, y, z);
		if (logic instanceof IActiveLogic)
		{
			return ((IActiveLogic)logic).getActive();
		}
		return false;
    }
}
