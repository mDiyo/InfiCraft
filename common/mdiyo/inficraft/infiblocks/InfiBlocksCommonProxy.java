package mDiyo.inficraft.infiblocks;

import java.io.File;

import mDiyo.inficraft.infiblocks.tech.FurnaceLogic;
import mDiyo.inficraft.infiblocks.tech.WorkbenchContainer;
import net.minecraft.client.Minecraft;
import net.minecraft.src.EntityPlayer;
import net.minecraft.src.Packet;
import net.minecraft.src.TileEntity;
import net.minecraft.src.World;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.network.IGuiHandler;

/**
 * Common proxy class for InfiBlocks
 */

public class InfiBlocksCommonProxy implements IGuiHandler
{
	/* Registers any rendering code. Does nothing server-side */
	public void registerRenderer() {}
	
	/* Ties an internal name to a visible one. Does nothing server-side */
	public void addNames() {}
	
	public File getMinecraftDir()
	{
		return new File(".");
	}

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world,
			int x, int y, int z) {
		if (ID == craftingGuiID)
		{
			return new WorkbenchContainer(player.inventory, world);
		}
		if (ID == furnaceGuiID)
		{
			TileEntity tile = world.getBlockTileEntity(x, y, z);
			if (tile instanceof FurnaceLogic)
				return ((FurnaceLogic)tile).getGuiContainer(player.inventory);
		}
		return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world,
			int x, int y, int z) 
	{
		return null;
	}
	
	public static int craftingGuiID = 1;
	public static int furnaceGuiID = 2;
	
	/*
	 * Methods provided by Bioxx
	 */
	
	public void sendCustomPacket(Packet packet)
	{
		FMLCommonHandler.instance().getMinecraftServerInstance().getConfigurationManager().sendPacketToAllPlayers(packet);
	}
	
	public void sendCustomPacketToPlayersInRange(double X, double Y, double Z, Packet packet, double range)
	{ 
		FMLCommonHandler.instance().getMinecraftServerInstance().getConfigurationManager().sendToAllNear(X, Y, Z, range, 0, packet);
	}
}
