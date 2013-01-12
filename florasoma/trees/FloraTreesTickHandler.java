package florasoma.trees;

import java.util.EnumSet;

import net.minecraft.client.Minecraft;
import net.minecraft.src.ModLoader;
import cpw.mods.fml.common.ITickHandler;
import cpw.mods.fml.common.TickType;

/* Tick handler, used for rendering berry bushes between fast/fancy graphics */

public class FloraTreesTickHandler implements ITickHandler
{
	private Minecraft mc;
	
	/* Grabs the minecraft instance */
	public FloraTreesTickHandler()
	{
		mc = ModLoader.getMinecraftInstance();
	}

	@Override
	public void tickStart(EnumSet<TickType> type, Object... tickData) 
	{
		FloraTrees.floraLeaves.setGraphicsLevel(mc.gameSettings.fancyGraphics);
		FloraTrees.floraLeavesNoColor.setGraphicsLevel(mc.gameSettings.fancyGraphics);
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
