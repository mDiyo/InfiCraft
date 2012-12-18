package inficraft.simplebackground;

import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;

import net.minecraft.client.Minecraft;
import net.minecraft.client.audio.SoundPoolEntry;
import net.minecraftforge.client.event.sound.PlayBackgroundMusicEvent;
import net.minecraftforge.client.event.sound.SoundLoadEvent;
import net.minecraftforge.event.ForgeSubscribe;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Side;
import cpw.mods.fml.common.asm.SideOnly;

@SideOnly(Side.CLIENT)
public class SoundHandler
{
	@ForgeSubscribe
	public void onSoundLoad(SoundLoadEvent event)
	{
		for (int i = 0; i < folderLocations.length; i++)
		{
			ArrayList<SoundPoolEntry> soundFiles = new ArrayList<SoundPoolEntry>();
			
			String basePath = Minecraft.getMinecraftDir() + "/bgm/" + folderLocations[i] + "/";
			File folder = new File(basePath);
			
			//Do some error checking
			if (!folder.exists())
			{
				FMLCommonHandler.instance().getFMLLogger().log(Level.SEVERE, "The /bgm/"+folderLocations[i]+" folder was missing, creating a new one.");
				folder.mkdirs();
			}
			if (folder.isFile())
			{
				FMLCommonHandler.instance().getFMLLogger().log(Level.SEVERE, "/bgm/"+folderLocations[i]+" is a file! Error error crashy crashy 1011010011101001");
				throw new RuntimeException("/bgm/"+folderLocations[i]+" is a file!");
			}
			if (!folder.canRead())
			{
				FMLCommonHandler.instance().getFMLLogger().log(Level.SEVERE, "The /bgm/"+folderLocations[i]+" folder is not readable, skipping.");
				continue;
			}
			
			File[] listOfFiles = folder.listFiles();
			String soundFile;
			
			for (int fileNum = 0; fileNum < listOfFiles.length; fileNum++)
			{
				if (listOfFiles[fileNum].isFile() && isValidFile(listOfFiles[fileNum]))
				{
					soundFile = listOfFiles[fileNum].getName();
					
					// Try to add the custom sound file to the pool of sounds
					try
					{
						URL path = listOfFiles[fileNum].toURI().toURL();
						soundFiles.add(event.manager.soundPoolStreaming.addSound(soundFile, path));
						System.out.println("Loaded sound at: "+path);
					}
					// If we cannot add the custom sound file to the pool, log the exception
					catch (Exception e)
					{
						FMLCommonHandler.instance().getFMLLogger().log(Level.WARNING, "SimpleBGM Failed loading sound file: " + soundFile);
					}
				}
			}
			
			String key = "bgm."+folderLocations[i];
			music.put(key, soundFiles);
		}
	}
	
	boolean isValidFile(File file)
	{
		String filename = file.getName();
		if (filename.toLowerCase().endsWith(".midi") || filename.toLowerCase().endsWith(".ogg")
				|| filename.toLowerCase().endsWith(".mus") || filename.toLowerCase().endsWith(".wav"))
			return true;
		return false;
	}
	
	public static ArrayList<SoundPoolEntry> getMusicList(String key)
	{
		return (ArrayList<SoundPoolEntry>) music.get(key);
	}
	
	@ForgeSubscribe
	public Void onBackgroundMusicPlayed(PlayBackgroundMusicEvent evt)
	{
		return null;
	}
	
	private static HashMap music = new HashMap<String,  ArrayList<SoundPoolEntry>>();
	private static final String[] folderLocations = { "battle", "dawn", "day", "death", "dusk", "menu", "nether", "night", "other", "sleep", "twilightforest", "underground" };
	
	/* Default music
	 * Menu: Windswept
	 * Day: Golden Wings
	 * Night: Dragon and Toast
	 * Dawn: Autumn Day
	 * Dusk: Danse Morialta
	 * Underground: Lightless Dawn
	 * Nether: Oppressive Gloom
	 * Twilight Forest: The Other Side of the Door
	 */
}
