package florasoma.crops.client;

import java.util.EnumSet;

import net.minecraft.client.Minecraft;
import net.minecraft.src.ModLoader;
import cpw.mods.fml.common.ITickHandler;
import cpw.mods.fml.common.TickType;
import florasoma.crops.FloraCrops;

/* Tick handler, used for rendering berry bushes between fast/fancy graphics */

public class FloraCropsTickHandler implements ITickHandler
{
	private Minecraft mc;
	
	/* Grabs the minecraft instance */
	public FloraCropsTickHandler()
	{
		mc = ModLoader.getMinecraftInstance();
	}

	@Override
	public void tickStart(EnumSet<TickType> type, Object... tickData) 
	{
		FloraCrops.instance.berryBush.setGraphicsLevel(mc.gameSettings.fancyGraphics);
	}

	@Override
	public void tickEnd(EnumSet<TickType> type, Object... tickData) 
	{
	}

	@Override
	public EnumSet<TickType> ticks() 
	{
		return EnumSet.of(TickType.RENDER);
	}

	@Override
	public String getLabel() 
	{
		return null;
	}

}
