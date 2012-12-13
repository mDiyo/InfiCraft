package mDiyo.simplebackground;

import java.util.EnumSet;

import net.minecraft.client.Minecraft;
import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.common.ITickHandler;
import cpw.mods.fml.common.TickType;

public class TickHandler implements ITickHandler
{
	Minecraft mc;
	int count;
	
	long time;
	boolean underground;
	int dimension;

	@Override
	public void tickStart(EnumSet<TickType> type, Object... tickData)
	{
		count++;
		if (count > 20)
			decideMusic();
	}

	@Override
	public void tickEnd(EnumSet<TickType> type, Object... tickData)
	{
		
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

	void decideMusic()
	{
		if (mc == null)
			mc = FMLClientHandler.instance().getClient();
		
		dimension = mc.thePlayer.dimension;
		if (dimension == -1) //Nether
			SimpleBGM.instance.playBackgroundMusic("Oppressive Gloom.ogg");
		
		else if (dimension == 0 || dimension == 7)
		{
			if (!checkUnderground())
			{
				if (dimension == 7) //Twilight Forest
					SimpleBGM.instance.playBackgroundMusic("The Other Side of the Door.ogg");
				else //Overworld
				{
					time = mc.theWorld.getWorldTime();
					
					if (time > 500 && time < 11500)
						SimpleBGM.instance.playBackgroundMusic("Golden Wings.ogg"); //Day
					else if (time > 11500 && time < 12500)
						SimpleBGM.instance.playBackgroundMusic("Danse Morialta.ogg"); //Dusk
					else if (time > 12500 && time < 23500)
						SimpleBGM.instance.playBackgroundMusic("Dragon and Toast.ogg"); //Night
					else
						SimpleBGM.instance.playBackgroundMusic("Autumn Day.ogg"); //Dawn
				}
			}
		}
	}
	
	boolean checkUnderground()
	{
		underground = mc.thePlayer.posY < 60 ? true : false;
		if (underground)
		{
			SimpleBGM.instance.playBackgroundMusic("Lightless Dawn.ogg");
			return true;
		}
		return false;
	}
}
