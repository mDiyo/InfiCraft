package inficraft.tweaks.hunger;

import java.io.*;
import java.util.*;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.relauncher.IFMLCallHook;
import cpw.mods.fml.relauncher.IFMLLoadingPlugin;
import cpw.mods.fml.relauncher.IFMLLoadingPlugin.TransformerExclusions;

/* Hunger Tweaks
 * @author: mDiyo
 */

@TransformerExclusions("inficraft.tweaks.hunger")
public class HungerTweaks 
	implements IFMLLoadingPlugin
{
	@Override
	public String[] getLibraryRequestClass() 
	{
		return null;
	}

	@Override
	public String[] getASMTransformerClass() 
	{
		return new String[] {"inficraft.tweaks.hunger.HTClassOverride"};
	}

	@Override
	public String getModContainerClass()
	{
		return "inficraft.tweaks.hunger.HTContainer";
	}

	@Override
	public String getSetupClass() 
	{
		return null;
	}

	@Override
	public void injectData(Map<String, Object> data) 
	{
		if (data.containsKey("coremodLocation"))
			coreLocation = (File) data.get("coremodLocation");
	}
	
	public static File coreLocation;
}
