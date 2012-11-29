package mDiyo.inficraft.infitools.hybrids;

import java.io.File;

import net.minecraft.client.Minecraft;

public class InfiHybridProxyClient extends InfiHybridProxyCommon
{
	public File getMinecraftDir()
	{
		return Minecraft.getMinecraftDir();
	}
}
