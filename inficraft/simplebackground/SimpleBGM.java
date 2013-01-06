package inficraft.simplebackground;

import java.util.ArrayList;
import java.util.Random;

import net.minecraft.client.audio.SoundManager;
import net.minecraft.client.audio.SoundPoolEntry;
import net.minecraft.client.settings.GameSettings;
import net.minecraftforge.common.MinecraftForge;
import paulscode.sound.SoundSystem;
import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.TickRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

/* Constant background music
 * Flavorlicious!
 */

@Mod(modid = "SimpleBGM", name = "Simple Background Music", version = "A3")
public class SimpleBGM
{
	@SideOnly(Side.CLIENT)
	SoundSystem bgm;
	@SideOnly(Side.CLIENT)
	GameSettings options;
	String currentMusic;
	Random musicRand = new Random();

	@Instance("SimpleBGM")
	public static SimpleBGM instance;

	@PreInit
	@SideOnly(Side.CLIENT)
	public void preInit(FMLPreInitializationEvent evt)
	{
		MinecraftForge.EVENT_BUS.register(new SoundHandler());
		currentMusic = "";
	}

	@PostInit
	@SideOnly(Side.CLIENT)
	public void postInit(FMLPostInitializationEvent evt)
	{
		bgm = SoundManager.sndSystem;
		options = FMLClientHandler.instance().getClient().gameSettings;
		playMenuMusic("bgm.menu");
		TickRegistry.registerTickHandler(new TickHandler(), Side.CLIENT);
	}
	
	@SideOnly(Side.CLIENT)
	public void playBackgroundMusic(String sound)
	{
		if (options.musicVolume == 0f)
		{
			if (bgm.playing(sound))
				bgm.stop(sound);
			if (bgm.playing(currentMusic))
				bgm.stop(currentMusic);
			currentMusic = "";
		}
		else
		{
			//System.out.println("Playing1 "+sound+": "+bgm.playing(sound)+" equal "+sound.equals(currentMusic));
			if (sound.equals(currentMusic) && bgm.playing(currentMusic))
			{
				bgm.setVolume(sound, options.musicVolume);
			}
			
			else //if (sound != currentMusic || !bgm.playing(currentMusic))
			{
				if (bgm.playing(currentMusic))
					bgm.stop(currentMusic);
				
				ArrayList<SoundPoolEntry> songList = SoundHandler.getMusicList(sound);
				if (songList.size() == 0)
					return;
				int songNum = musicRand.nextInt(songList.size());
				
				bgm.backgroundMusic(sound, songList.get(songNum).soundUrl, songList.get(songNum).soundName, false);
				bgm.setVolume(sound, options.musicVolume);
				bgm.play(sound);
				currentMusic = sound;
				
				System.out.println("Playing background music: "+songList.get(songNum).soundName);
			}
		}
	}
	
	public void playMenuMusic(String sound)
	{
		ArrayList<SoundPoolEntry> songList = SoundHandler.getMusicList(sound);
		if (songList.size() == 0)
			return;
		int songNum = musicRand.nextInt(songList.size());
		
		bgm.backgroundMusic(sound, songList.get(songNum).soundUrl, songList.get(songNum).soundName, true);
		bgm.setVolume(sound, 0.3f);
		bgm.play(sound);
		currentMusic = sound;
		
		System.out.println("Playing menu music: "+songList.get(songNum).soundName);
	}

	public void stopMusic()
	{
		bgm.stop(currentMusic);
	}
	
	public void stopMusic(String sound)
	{
		bgm.stop(sound);
	}

}
