package mDiyo.inficraft.orizon.client;

import java.io.File;

import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.client.Minecraft;
import net.minecraftforge.client.MinecraftForgeClient;
import mDiyo.inficraft.flora.clouds.FloraClouds;
import mDiyo.inficraft.orizon.slimepools.OrizonSlime;
import mDiyo.inficraft.orizon.slimepools.SlimeProxyCommon;

public class SlimeProxyClient extends SlimeProxyCommon
{
	public void registerRenderer() 
	{
		MinecraftForgeClient.preloadTexture(OrizonSlime.texture);
	}
	
	public void addNames() 
	{
		LanguageRegistry.instance().addStringLocalization(OrizonSlime.instance.slimeGelBlock.getBlockName(), "en_US", "Congealed Slime");
	}
	
	public File getMinecraftDir()
	{
		return Minecraft.getMinecraftDir();
	}
}
