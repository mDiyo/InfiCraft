package mDiyo.inficraft.infitools.library;

import java.io.File;

import net.minecraft.client.Minecraft;

public class InfiLibraryProxyClient extends InfiLibraryProxyCommon
{
	@Override
	public File getMinecraftDir()
	{
		return Minecraft.getMinecraftDir();
	}
}
