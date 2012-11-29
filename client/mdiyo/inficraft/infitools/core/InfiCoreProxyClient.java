package mDiyo.inficraft.infitools.core;

import java.io.File;

import net.minecraft.client.Minecraft;

public class InfiCoreProxyClient extends InfiCoreProxyCommon
{
	public File getMinecraftDir()
	{
		return Minecraft.getMinecraftDir();
	}
}
