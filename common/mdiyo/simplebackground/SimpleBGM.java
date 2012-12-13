package mDiyo.simplebackground;

import java.io.File;

import net.minecraft.src.SoundManager;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = "SimpleBGM", name = "Simple Background Music", version = "1.4.5_2012.12.2")
public class SimpleBGM
{
	int dimension;
	int height;
	boolean dayNight;
	boolean musicDisk;

	@Instance("SimpleBGM")
	public static SimpleBGM instance;

	@PreInit
	public void preInit(FMLPreInitializationEvent evt)
	{
		MinecraftForge.EVENT_BUS.register(new SoundHandler());
	}
	
	public static void playBackgroundMusic(String music)
	{
		SoundManager.sndSystem.backgroundMusic(music, SoundHandler.music.soundUrl, SoundHandler.music.soundName, false);
		SoundManager.sndSystem.setVolume(music, 1f);
		SoundManager.sndSystem.play(music);
	}

	private static final String location = "bgm/";
	private static final String prefix = "bgm.";

	public static String[] soundFiles = { location + "cash.ogg" };
	public static String[] musicFiles = { location + "AlaFlair.ogg" };

	public static final String jar = prefix + "cash";
	public static final String alaflair = prefix + "AlaFlair";
}
