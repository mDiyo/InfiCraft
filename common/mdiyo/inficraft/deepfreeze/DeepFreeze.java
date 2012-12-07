package mDiyo.inficraft.deepfreeze;

import java.io.*;
import java.util.*;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.relauncher.IFMLCallHook;
import cpw.mods.fml.relauncher.IFMLLoadingPlugin;
import cpw.mods.fml.relauncher.IFMLLoadingPlugin.TransformerExclusions;

/* World Tweaks
 * A little change here, a little flavor there, a few huge trees everywhere...
 * @author: mDiyo
 */

@TransformerExclusions("mDiyo.inficraft.worldtweaks")
public class DeepFreeze 
	implements IFMLLoadingPlugin, IFMLCallHook
{
	@Override
	public String[] getLibraryRequestClass() 
	{
		return null;
	}

	@Override
	public String[] getASMTransformerClass() 
	{
		return new String[] {"mDiyo.inficraft.deepfreeze.DFClassOverride"};
	}

	@Override
	public String getModContainerClass()
	{
		return "mDiyo.inficraft.deepfreeze.DFContainer";
	}

	@Override
	public String getSetupClass() 
	{
		return "mDiyo.inficraft.deepfreeze.DeepFreeze";
	}

	@Override
	public void injectData(Map<String, Object> data) 
	{
		if (data.containsKey("coremodLocation"))
			coreLocation = (File) data.get("coremodLocation");
	}
	
	public static File coreLocation;

	@Override
	public Void call() throws Exception 
	{
		DFClassOverride.addClassOverride("md", "EntityLiving, Freezing powers mass edit");
		DFClassOverride.addClassOverride("mi", "EntityCreature, AI override");
		DFClassOverride.addClassOverride("ma", "EntityFlying, Movement override");
		DFClassOverride.addClassOverride("qn", "EntitySkeleton, prevent burning in sunlight while frozen");
		DFClassOverride.addClassOverride("qc", "EntityCreeper, prevent explosions while frozen");
		DFClassOverride.addClassOverride("qr", "EntityZombie, Texture override");
		DFClassOverride.addClassOverride("qk", "EntityPigZombie, Texture override");
		DFClassOverride.addClassOverride("qu", "EntityVillager, Texture override");
		return null;
	}
}
