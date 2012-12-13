package mDiyo.simplebackground;

import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Level;

import net.minecraft.src.SoundPoolEntry;
import net.minecraftforge.client.event.sound.SoundLoadEvent;
import net.minecraftforge.event.ForgeSubscribe;
import cpw.mods.fml.common.FMLCommonHandler;

public class SoundHandler
{
	@ForgeSubscribe
	public void onSoundLoad(SoundLoadEvent event)
	{
		for (String soundFile : this.musicFiles)
		{
			// Try to add the custom sound file to the pool of sounds
			try
			{
				URL path = SimpleBGM.instance.getClass().getResource("/" + location + soundFile);
				System.out.println("Path: "+path);
				music.put(soundFile, event.manager.soundPoolStreaming.addSound(soundFile, path));
			}
			// If we cannot add the custom sound file to the pool, log the
			// exception
			catch (Exception e)
			{
				FMLCommonHandler.instance().getFMLLogger().log(Level.WARNING, "SimpleBGM Failed loading sound file: " + soundFile);
			}
		}
	}
	
	//public static SoundPoolEntry[] music;
	public static HashMap music = new HashMap<String, SoundPoolEntry>();
	
	private static final String location = "bgm/";
	//public static String[] musicFiles = { "AlaFlair.ogg", "Windswept.ogg" };

	//public static final String windswept ="Windswept.ogg";
	
	public static String[] musicFiles = { "Windswept.ogg", "Golden Wings.ogg", "Dragon and Toast.ogg", "Lightless Dawn.ogg",
		"Oppressive Gloom.ogg", "The Other Side of the Door.ogg", "Autumn Day.ogg", "Danse Morialta.ogg" };
	/* Menu: Windswept
	 * Day: Golden Wings
	 * Night: Dragon and Toast
	 * Dawn: Autumn Day
	 * Dusk: Danse Morialta
	 * Underground: Lightless Dawn
	 * Nether: Oppressive Gloom
	 * Twilight Forest: The Other Side of the Door
	 */
}
