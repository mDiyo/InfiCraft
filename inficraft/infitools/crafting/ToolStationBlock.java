package inficraft.infitools.crafting;

import inficraft.api.machines.BlockMachineBase;
import inficraft.infitools.InfiTools;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
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
		return 43;
    }
	
	public int damageDropped(int meta)
    {
        return meta;
    }	
	
	public TileEntity createNewTileEntity(World world, int metadata)
    {
        return new ToolStationLogic();
    }

	@Override
	public Integer getGui(World world, int x, int y, int z, EntityPlayer entityplayer)
	{
		return 1;
	}

	@Override
	public Object getModInstance()
	{
		return InfiTools.instance;
	}
}
