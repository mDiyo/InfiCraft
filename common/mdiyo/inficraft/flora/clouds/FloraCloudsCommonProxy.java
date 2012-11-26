package mDiyo.inficraft.flora.clouds;

import java.io.File;

import cpw.mods.fml.common.registry.GameRegistry;

import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;

/**
 * Common proxy class for Flora & Soma: Clouds
 */

public class FloraCloudsCommonProxy 
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
