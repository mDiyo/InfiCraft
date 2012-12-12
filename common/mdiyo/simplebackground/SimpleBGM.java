package mDiyo.simplebackground;

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

	private static final String location = "bgm/";
	private static final String prefix = "bgm.";

	public static String[] soundFiles = { location + "jar1.ogg" };

	public static final String jar = prefix + "jar1";
}
