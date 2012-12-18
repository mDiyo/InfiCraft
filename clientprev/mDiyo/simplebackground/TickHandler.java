package mDiyo.simplebackground;

import java.util.EnumSet;

import net.minecraft.client.Minecraft;
import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.common.ITickHandler;
import cpw.mods.fml.common.Side;
import cpw.mods.fml.common.TickType;
import cpw.mods.fml.common.asm.SideOnly;

@SideOnly(Side.CLIENT)
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
		return EnumSet.of(TickType.CLIENT);
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
		
		if (mc.thePlayer != null)
		{
			dimension = mc.thePlayer.dimension;
			if (dimension == -1) //Nether
				SimpleBGM.instance.playBackgroundMusic("bgm.nether");
			
			else if (dimension == 0 || dimension == 7)
			{
				if (!checkUnderground())
				{
					if (dimension == 7) //Twilight Forest
						SimpleBGM.instance.playBackgroundMusic("bgm.twilightforest");
					else //Overworld
					{
						time = mc.theWorld.getWorldTime();
						
						if (time > 500 && time < 11500)
							SimpleBGM.instance.playBackgroundMusic("bgm.day"); //Day
						else if (time > 11500 && time < 12500)
							SimpleBGM.instance.playBackgroundMusic("bgm.dusk"); //Dusk
						else if (time > 12500 && time < 23500)
							SimpleBGM.instance.playBackgroundMusic("bgm.night"); //Night
						else
							SimpleBGM.instance.playBackgroundMusic("bgm.dawn"); //Dawn
					}
				}
			}
		}
	}
	
	boolean checkUnderground()
	{
		underground = mc.thePlayer.posY < 60 ? true : false;
		if (underground)
		{
			SimpleBGM.instance.playBackgroundMusic("bgm.underground");
			return true;
		}
		return false;
	}
}
