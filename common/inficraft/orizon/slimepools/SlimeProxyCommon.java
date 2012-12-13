package inficraft.orizon.slimepools;

import java.io.File;

public class SlimeProxyCommon {
	/* Registers any rendering code. Does nothing server-side */
	public void registerRenderer() {}
	
	/* Ties an internal name to a visible one. Does nothing server-side */
	public void addNames() {}
	
	public File getMinecraftDir()
	{
		return new File(".");
	}

}
