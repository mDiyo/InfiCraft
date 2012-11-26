package mDiyo.inficraft.flora.berries.client;

import java.io.File;

import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.Side;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.common.registry.TickRegistry;

import net.minecraft.client.Minecraft;
import net.minecraft.src.ModLoader;
import net.minecraftforge.client.MinecraftForgeClient;
import mDiyo.inficraft.flora.berries.FloraBerries;
import mDiyo.inficraft.flora.berries.FloraBerryCommonProxy;

public class FloraBerryClientProxy extends FloraBerryCommonProxy 
{
	/* Registers any rendering code. */
	@Override
	public void registerRenderer()
	{
		FloraBerries.instance.berryModelID = RenderingRegistry.getNextAvailableRenderId();
		RenderingRegistry.registerBlockHandler(new BerryRender());
		TickRegistry.registerTickHandler(new FloraBerryTickHandler(), Side.CLIENT);
		MinecraftForgeClient.preloadTexture("/floratex/plantblocks.png");
	}
	
	/* Ties an internal name to a visible one */
	@Override
	public void addNames()
	{
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
