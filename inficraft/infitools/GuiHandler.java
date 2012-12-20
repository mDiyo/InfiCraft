package inficraft.infitools;

import inficraft.api.machines.BlockLogicBase;
import inficraft.infitools.client.ToolStationGui;
import inficraft.infitools.crafting.ToolStationLogic;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler
{
	int stationID = 1;
	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) 
	{
		if (ID == stationID)
		{
			TileEntity tile = world.getBlockTileEntity(x, y, z);
			if (tile instanceof BlockLogicBase)
				return ((BlockLogicBase)tile).getGuiContainer(player.inventory);
		}
		return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
	{
		if (ID == stationID)
			return new ToolStationGui(player.inventory, (ToolStationLogic) world.getBlockTileEntity(x, y, z));
		return null;
	}

}
