package inficraft.infitools.hybrids;

import inficraft.infitools.hybrids.InfiHybridProxyCommon;

import java.io.File;

import net.minecraft.client.Minecraft;

public class InfiHybridProxyClient extends InfiHybridProxyCommon
{
	public File getMinecraftDir()
	{
		return Minecraft.getMinecraftDir();
	}
}
