package florasoma.crops.client;

import java.io.File;

import net.minecraft.client.Minecraft;
import net.minecraftforge.client.MinecraftForgeClient;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.common.registry.TickRegistry;
import cpw.mods.fml.relauncher.Side;
import florasoma.crops.FloraCrops;
import florasoma.crops.FloraCropsCommonProxy;

public class FloraCropsClientProxy extends FloraCropsCommonProxy
{
	public void registerRenderer()
	{
		MinecraftForgeClient.preloadTexture(FloraCrops.cropTexture);
		//FloraBerries.instance.berryModelID = RenderingRegistry.getNextAvailableRenderId();
		RenderingRegistry.registerBlockHandler(new BerryRender());
		TickRegistry.registerTickHandler(new FloraCropsTickHandler(), Side.CLIENT);
		MinecraftForgeClient.preloadTexture(FloraCrops.bushTexture);
		//TODO: Saguaro Cactus
		//FloraCrops.getInstance().saguaroModel = ModLoader.getUniqueBlockModelID(this, true);
	}
	
	public void addNames()
	{
		LanguageRegistry.instance().addStringLocalization("item.wheatBag.name", "en_US", "Wheat Seed Bag");
		LanguageRegistry.instance().addStringLocalization("item.barleyBag.name", "en_US", "Barley Seed Bag");
		LanguageRegistry.instance().addStringLocalization("item.potatoBag.name", "en_US", "Potato Bag");
		LanguageRegistry.instance().addStringLocalization("item.carrotBag.name", "en_US", "Carrot Bag");
		LanguageRegistry.instance().addStringLocalization("item.wartBag.name", "en_US", "Nether Wart Bag");
		LanguageRegistry.instance().addStringLocalization("item.barleySeed.name", "en_US", "Barley Seeds");
		LanguageRegistry.instance().addStringLocalization("item.itemBarley.name", "en_US", "Barley");
		LanguageRegistry.instance().addStringLocalization("item.flourBarley.name", "en_US", "Barley Flour");
		LanguageRegistry.instance().addStringLocalization("item.doughBarley.name", "en_US", "Barley dough");
		LanguageRegistry.instance().addStringLocalization("item.waterDrop.name", "en_US", "Drop of Water");
		
		LanguageRegistry.instance().addStringLocalization("item.raspberry.name", "en_US", "Raspberry");
		LanguageRegistry.instance().addStringLocalization("item.blueberry.name", "en_US", "Blueberry");
		LanguageRegistry.instance().addStringLocalization("item.blackberry.name", "en_US", "Blackberry");
		LanguageRegistry.instance().addStringLocalization("item.geoberry.name", "en_US", "Geoberry");
		LanguageRegistry.instance().addStringLocalization("block.raspberryBush.name", "en_US", "Raspberry Bush");
		LanguageRegistry.instance().addStringLocalization("block.blueberryBush.name", "en_US", "Blueberry Bush");
		LanguageRegistry.instance().addStringLocalization("block.blackberryBush.name", "en_US", "Blackberry Bush");
		LanguageRegistry.instance().addStringLocalization("block.geoberryBush.name", "en_US", "Geoberry Bush");
	}
	
	public File getMinecraftDir()
	{
		return Minecraft.getMinecraftDir();
	}
}
