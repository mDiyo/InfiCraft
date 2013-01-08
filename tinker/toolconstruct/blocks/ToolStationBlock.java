package tinker.toolconstruct.blocks;

import java.util.List;

import tinker.toolconstruct.ToolConstruct;

import inficraft.api.machines.BlockMachineBase;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class ToolStationBlock extends BlockMachineBase
{

	public ToolStationBlock(int id, Material material)
	{
		super(id, material);
	}

    /*public String getTextureFile()
    {
        return InfiBlocks.techImage;
    }*/
	
	public int getBlockTextureFromSideAndMetadata(int side, int meta)
    {
		return 43 + meta;
    }
	
	public int damageDropped(int meta)
    {
        return meta;
    }	
	
	public TileEntity createNewTileEntity(World world, int metadata)
    {
		switch (metadata)
		{
		case 0: return new ToolStationLogic();
		case 1: return new PartCrafterLogic();
		default: return null;
		}
        
    }

	@Override
	public Integer getGui(World world, int x, int y, int z, EntityPlayer entityplayer)
	{
		return world.getBlockMetadata(x, y, z);
	}

	@Override
	public Object getModInstance()
	{
		return ToolConstruct.instance;
	}
	
	@Override
    public void getSubBlocks(int id, CreativeTabs tab, List list)
    {
    	for (int iter = 0; iter < 2; iter++)
    	{
    		list.add(new ItemStack(id, 1, iter));
    	}
    }
}
