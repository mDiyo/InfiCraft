package florasoma.clouds;

import florasoma.clouds.FloraClouds;
import florasoma.clouds.FloraCloudsCommonProxy;

import java.io.File;

import cpw.mods.fml.common.registry.LanguageRegistry;

import net.minecraft.client.Minecraft;
import net.minecraftforge.client.MinecraftForgeClient;

public class FloraCloudsClientProxy extends FloraCloudsCommonProxy
{
	public void registerRenderer() 
	{
		MinecraftForgeClient.preloadTexture(FloraClouds.texture);
	}
	
	public void addNames()
	{
		LanguageRegistry.instance().addStringLocalization("normalcloud.name", "en_US", "Cloud");
		LanguageRegistry.instance().addStringLocalization("darkcloud.name", "en_US", "Dark Cloud");
		LanguageRegistry.instance().addStringLocalization("ashcloud.name", "en_US", "Ash Cloud");
		LanguageRegistry.instance().addStringLocalization("sulfurcloud.name", "en_US", "Sulfur Cloud");
	}
	
	public File getMinecraftDir()
	{
		return Minecraft.getMinecraftDir();
	}
}
