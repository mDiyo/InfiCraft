package mDiyo.bastion;

import java.io.File;

import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

import net.minecraft.client.Minecraft;

public class BastionProxyClient extends BastionProxyCommon
{
	@Override
	public void registerRenderer()
	{
		RenderingRegistry.registerBlockHandler(new BarricadeRender());
	}

	@Override
	public void addNames()
	{
		LanguageRegistry.instance().addStringLocalization("item.drill.name", "en_US", "Drill");
	}

	@Override
	public File getLocation()
	{
		return Minecraft.getMinecraftDir();
	}
}
