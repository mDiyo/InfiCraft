package inficraft.infitools.client;

import inficraft.infitools.InfiTools;
import inficraft.infitools.TProxyCommon;

import java.io.File;

import net.minecraft.client.Minecraft;
import net.minecraftforge.client.MinecraftForgeClient;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class TProxyClient extends TProxyCommon
{
	/* Registers any rendering code. */
	public void registerRenderer() 
	{
		MinecraftForgeClient.preloadTexture(InfiTools.craftingTexture);
		MinecraftForgeClient.preloadTexture(InfiTools.pickaxeTexture);
		MinecraftForgeClient.preloadTexture(InfiTools.swordTexture);
		MinecraftForgeClient.preloadTexture(InfiTools.shovelTexture);
		MinecraftForgeClient.preloadTexture(InfiTools.axeTexture);
	}
	
	
	/* Ties an internal name to a visible one. */
	public void addNames() 
	{
		LanguageRegistry.instance().addStringLocalization("itemGroup.InfiTools", "InfiTools");
		
	}
	
	@Override
	public File getLocation()
	{
		return Minecraft.getMinecraftDir();
	}
}
