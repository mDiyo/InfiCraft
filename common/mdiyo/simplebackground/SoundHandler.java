package mDiyo.simplebackground;

import java.net.URL;
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
		// For each custom sound file we have defined in Sounds
		for (String soundFile : SimpleBGM.soundFiles)
		{
			// Try to add the custom sound file to the pool of sounds
			try
			{
				URL path = SimpleBGM.instance.getClass().getResource("/" + soundFile);
				event.manager.soundPoolSounds.addSound(soundFile, path);
			}
			// If we cannot add the custom sound file to the pool, log the
			// exception
			catch (Exception e)
			{
				FMLCommonHandler.instance().getFMLLogger().log(Level.WARNING, "SimpleBGM Failed loading sound file: " + soundFile);
			}
		}
		
		for (String soundFile : SimpleBGM.musicFiles)
		{
			// Try to add the custom sound file to the pool of sounds
			try
			{
				URL path = SimpleBGM.instance.getClass().getResource("/" + soundFile);
				music = event.manager.soundPoolStreaming.addSound(soundFile, path);
			}
			// If we cannot add the custom sound file to the pool, log the
			// exception
			catch (Exception e)
			{
				FMLCommonHandler.instance().getFMLLogger().log(Level.WARNING, "SimpleBGM Failed loading sound file: " + soundFile);
			}
		}
	}
	
	public static SoundPoolEntry music;
}
