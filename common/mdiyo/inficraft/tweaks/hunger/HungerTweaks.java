package mDiyo.inficraft.tweaks.hunger;

import java.io.*;
import java.util.*;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.relauncher.IFMLCallHook;
import cpw.mods.fml.relauncher.IFMLLoadingPlugin;
import cpw.mods.fml.relauncher.IFMLLoadingPlugin.TransformerExclusions;

/* Hunger Tweaks
 * Put on hold until I figure out why classes with subclasses don't load properly.
 * @author: mDiyo
 */

@TransformerExclusions("mDiyo.inficraft.tweaks.hunger")
public class HungerTweaks 
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
		return new String[] {"mDiyo.inficraft.tweaks.hunger.HTClassOverride"};
	}

	@Override
	public String getModContainerClass()
	{
		return "mDiyo.inficraft.tweaks.hunger.HTContainer";
	}

	@Override
	public String getSetupClass() 
	{
		return "mDiyo.inficraft.tweaks.hunger.HungerTweaks";
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
		HTClassOverride.addClassOverride("qx", "EntityPlayer, Sprinting drains less hunger");
		HTClassOverride.addClassOverride("ro", "FoodStats, full hunger no longer required");
		return null;
	}
}
