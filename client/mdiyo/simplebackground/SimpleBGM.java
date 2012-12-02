package mDiyo.simplebackground;

import java.io.File;
import java.net.URL;

import net.minecraft.src.GameSettings;
import net.minecraft.src.SoundManager;
import net.minecraft.src.SoundPool;
import net.minecraft.src.SoundPoolEntry;
import net.minecraftforge.client.ModCompatibilityClient;
import net.minecraftforge.client.event.sound.PlayBackgroundMusicEvent;
import net.minecraftforge.client.event.sound.SoundEvent;
import net.minecraftforge.client.event.sound.SoundLoadEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.ForgeSubscribe;
import mDiyo.inficraft.flora.trees.FloraTrees;
import cpw.mods.fml.client.FMLClientHandler;
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
	
	/** Sound pool containing music. */
    public SoundPool music = new SoundPool();
    GameSettings options;
	
	@Instance("SimpleBGM")
	public static SimpleBGM instance;
	
	@PreInit
	public void preInit(FMLPreInitializationEvent evt)
	{
		MinecraftForge.EVENT_BUS.register(instance);
		options =  FMLClientHandler.instance().getClient().gameSettings;
	}
	
	@ForgeSubscribe
    public void onSound(SoundLoadEvent event)
    {
        try
        {
            event.manager.soundPoolSounds.addSound("day.bgm", SimpleBGM.class.getResource("/bgm/day/Ala Flair.ogg"));            
            //this.addMusic("bgm/day.wav", SimpleBGM.class.getResource("/bgm/day/Earth Prelude.mp3"));
            System.out.println("Sounds registered successfully");
        }
        catch (Exception e)
        {
            System.out.println("Failed to register one or more sounds. Exception: "+e);
        }
    }
	
	public void addMusic(String par1Str, URL url)
    {
        this.music.addSound(par1Str, url);
    }
	
	public void playBGM()
    {
		System.out.println("playBGM called");
        if (options.musicVolume != 0.0F)
        {
        	System.out.println("Music level is fine");
            if (!SoundManager.sndSystem.playing("streaming"))
            {
            	System.out.println("Sound system playing");
            	SoundPoolEntry song = music.getRandomSoundFromSoundPool("day.bgm");
                if (song != null)
                {
                	System.out.println("Song isn't null");
                    SoundManager.sndSystem.backgroundMusic("BgMusic", song.soundUrl, song.soundName, false);
                    SoundManager.sndSystem.setVolume("BgMusic", this.options.musicVolume);
                    SoundManager.sndSystem.play("BgMusic");
                }
            }
        }
    }
}
