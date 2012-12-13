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
	
	boolean day;
	boolean prevDay;
	boolean underground;
	boolean prevUnderground;
	int dimension;
	int prevDimension;

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
		if (mc == null)
		{
			mc = FMLClientHandler.instance().getClient();
			
			underground = mc.thePlayer.posY < 58 ? true : false;			
			if (underground)
			{
				SimpleBGM.instance.playBackgroundMusic("Lightless Dawn.ogg");
				return;
			}
			else
			{
				day = mc.theWorld.getWorldTime() < 12000 ? true : false;
				
				if (day)
					SimpleBGM.instance.playBackgroundMusic("Golden Wings.ogg");
				
				else
					SimpleBGM.instance.playBackgroundMusic("Dragon and Toast.ogg");
				
				return;
			}
		}
		
		/*dimension = mc.thePlayer.dimension;
		if (dimension == 1) //End
		{
			
		}
		else if (dimension == -1) //Nether
		{
			
		}
		else if (dimension == 7) //Twilight Forest
		{
			
		}
		else if (dimension == 0) //Overworld
		{
			
		}*/
		
		underground = mc.thePlayer.posY < 58 ? true : false;
		if (underground && !prevUnderground)
		{
			SimpleBGM.instance.playBackgroundMusic("Lightless Dawn.ogg");
			prevUnderground = underground;
			return;
		}
		else
		{
			day = mc.theWorld.getWorldTime() < 12000 ? true : false;
			
			if (day && !prevDay)
			{
				SimpleBGM.instance.playBackgroundMusic("Golden Wings.ogg");
			}
			else if (!day && prevDay)
			{
				SimpleBGM.instance.playBackgroundMusic("Dragon and Toast.ogg");
			}
			
			prevDay = day;
		}
		
		
		
		//prevDimension = dimension;
	}
}
