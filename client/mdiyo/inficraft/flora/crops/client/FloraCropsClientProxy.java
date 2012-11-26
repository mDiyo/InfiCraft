package mDiyo.inficraft.flora.crops.client;

import java.io.File;

import cpw.mods.fml.common.registry.LanguageRegistry;

import mDiyo.inficraft.flora.crops.FloraCrops;
import mDiyo.inficraft.flora.crops.FloraCropsCommonProxy;
import net.minecraft.client.Minecraft;
import net.minecraft.src.ModLoader;
import net.minecraftforge.client.MinecraftForgeClient;

public class FloraCropsClientProxy extends FloraCropsCommonProxy
{
	public void registerRenderer()
	{
		MinecraftForgeClient.preloadTexture("/floratex/plantblocks.png");
		//TODO: Saguaro Cactus
		//FloraCrops.getInstance().saguaroModel = ModLoader.getUniqueBlockModelID(this, true);
	}
	
	public void addNames()
	{
		LanguageRegistry.instance().addStringLocalization("item.seedBag.name", "en_US", "Seed Bag");
		LanguageRegistry.instance().addStringLocalization("item.barleySeed.name", "en_US", "Barley Seeds");
		LanguageRegistry.instance().addStringLocalization("barleyFlora.name", "en_US", "Barley");
		LanguageRegistry.instance().addStringLocalization("barleyflourFlora.namee", "en_US", "Barley Flour");
		LanguageRegistry.instance().addStringLocalization("item.waterDrop.name", "en_US", "Drop of Water");
	}
	
	public File getMinecraftDir()
	{
		return Minecraft.getMinecraftDir();
	}
}
