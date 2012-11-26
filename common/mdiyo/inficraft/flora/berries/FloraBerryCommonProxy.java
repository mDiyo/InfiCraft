package mDiyo.inficraft.flora.berries;

import java.io.File;

/**
 * Common proxy class for Flora & Soma: Berries
 */

public class FloraBerryCommonProxy 
{
	/* Registers any rendering code. Does nothing server-side */
	public void registerRenderer() {}
	
	/* Ties an internal name to a visible one. Does nothing server-side */
	public void addNames() {}
	
	/* Server-side config location */
	
	public File getMinecraftDir()
	{
		return new File(".");
	}
}
