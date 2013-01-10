package tinker.toolconstruct.blocks;

import java.util.ArrayList;
import java.util.Random;

import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import tinker.common.InventoryBlock;
import tinker.common.InventoryLogic;
import tinker.toolconstruct.ToolConstruct;

public class EquipBlock extends InventoryBlock
{

	public EquipBlock(int id, Material material)
	{
		super(id, material);
		this.setHardness(2f);
		this.setBlockBounds(0, 0, 0, 1, 0.25f, 1);
		//this.setCreativeTab(ToolConstruct.materialTab);
	}

    /*public String getTextureFile()
    {
        return "/tinkertextures/ConstructBlocks.png";
    }*/
	
	public int getBlockTextureFromSideAndMetadata(int side, int meta)
    {
		//return 22 + meta*6 + side;
		return 22;
    }
	
	@Override
	public int idDropped(int par1, Random par2Random, int par3)
    {
        return 0;
    }	
	
	public TileEntity createNewTileEntity(World world, int metadata)
    {
		return new FrypanLogic();
    }
	
	//Nonfunctional
	//@Override
	/*public ArrayList getBlockDropped(World world, int x, int y, int z, int metadata, int fortune)
    {
		System.out.println("Dropping block contents");
        ArrayList arraylist = super.getBlockDropped(world, x, y, z, metadata, fortune);
        TileEntity tileentity = world.getBlockTileEntity(x, y, z);
        
        if (tileentity instanceof HeldItemLogic)
        {
        	ItemStack equip = ((HeldItemLogic)tileentity).getEquipmentItem();
        	if (equip != null)
        		arraylist.add(equip);
        }
        
        return arraylist;
    }*/

	@Override
	public Integer getGui(World world, int x, int y, int z, EntityPlayer entityplayer)
	{
		int md = world.getBlockMetadata(x, y, z);
		return 3;
	}

	@Override
	public Object getModInstance()
	{
		return ToolConstruct.instance;
	}
}
