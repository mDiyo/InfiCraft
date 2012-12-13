package mDiyo.simplebackground;

import java.util.EnumSet;

import net.minecraft.src.EntityPlayer;
import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.common.ITickHandler;
import cpw.mods.fml.common.TickType;

public class TickHandler implements ITickHandler
{
	EntityPlayer player;
	int count;

	@Override
	public void tickStart(EnumSet<TickType> type, Object... tickData)
	{
		count++;
		if (count > 20)
			doStuff();
	}

	@Override
	public void tickEnd(EnumSet<TickType> type, Object... tickData)
	{
		//player = FMLClientHandler.instance().getClient().thePlayer;
		//if (player != null)
		System.out.println("Playing music!");
		SimpleBGM.instance.playBackgroundMusic(SoundHandler.alaflair);
	}

	@Override
	public EnumSet<TickType> ticks()
	{
		return EnumSet.of(TickType.PLAYER);
	}

	@Override
	public String getLabel()
	{
		return null;
	}

	void doStuff()
	{
		
	}
}
