package mDiyo.inficraft.infitools.library;

import java.io.File;

import cpw.mods.fml.common.registry.LanguageRegistry;

import net.minecraft.client.Minecraft;

public class InfiLibraryProxyClient extends InfiLibraryProxyCommon
{
	@Override
	public void addNames()
	{
		LanguageRegistry.instance().addStringLocalization("itemGroup.InfiTools", "InfiTools");
		LanguageRegistry.instance().addStringLocalization("enchantment.frost", "Frost");
		LanguageRegistry.instance().addStringLocalization("enchantment.poison", "Poison");
	}
	
	@Override
	public File getMinecraftDir()
	{
		return Minecraft.getMinecraftDir();
	}
}
