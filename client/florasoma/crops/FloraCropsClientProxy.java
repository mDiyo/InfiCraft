package florasoma.crops;

import florasoma.crops.FloraCrops;
import florasoma.crops.FloraCropsCommonProxy;

import java.io.File;

import cpw.mods.fml.common.registry.LanguageRegistry;

import net.minecraft.client.Minecraft;
import net.minecraft.src.ModLoader;
import net.minecraftforge.client.MinecraftForgeClient;

public class FloraCropsClientProxy extends FloraCropsCommonProxy
{
	public void registerRenderer()
	{
		MinecraftForgeClient.preloadTexture(FloraCrops.seedTexture);
		MinecraftForgeClient.preloadTexture(FloraCrops.cropTexture);
		//TODO: Saguaro Cactus
		//FloraCrops.getInstance().saguaroModel = ModLoader.getUniqueBlockModelID(this, true);
	}
	
	public void addNames()
	{
		LanguageRegistry.instance().addStringLocalization("item.wheatBag.name", "en_US", "Wheat Seed Bag");
		LanguageRegistry.instance().addStringLocalization("item.barleyBag.name", "en_US", "Barley Seed Bag");
		LanguageRegistry.instance().addStringLocalization("item.barleySeed.name", "en_US", "Barley Seeds");
		LanguageRegistry.instance().addStringLocalization("item.itemBarley.name", "en_US", "Barley");
		LanguageRegistry.instance().addStringLocalization("item.flourBarley.name", "en_US", "Barley Flour");
		LanguageRegistry.instance().addStringLocalization("item.doughBarley.name", "en_US", "Barley dough");
		LanguageRegistry.instance().addStringLocalization("item.waterDrop.name", "en_US", "Drop of Water");
	}
	
	public File getMinecraftDir()
	{
		return Minecraft.getMinecraftDir();
	}
}
