package mdiyo.inficraft.flora.clouds;

import java.io.File;

import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;
import net.minecraft.src.ModLoader;

/**
 * Common proxy class for Flora & Soma: Clouds
 */

public class FloraCloudsCommonProxy 
{
	/* Registers any rendering code. Does nothing server-side */
	public void registerRenderer() {}
	
	/* Ties an internal name to a visible one. Does nothing server-side */
	public void addNames() {}
	
	/* Equivalent Exchange support, direct plug-in 
	 * Temporarily disabled
	 */
	public void addEESupport() {}
	
	/* Recipes, no better place to put them */
	
	public void addRecipes()
	{
		ModLoader.addRecipe(new ItemStack(Item.coal, 1, 1), new Object[]
		    { "cc", "cc", 'c', new ItemStack(FloraClouds.getInstance().cloud, 1, 2) });
		ModLoader.addRecipe(new ItemStack(Item.gunpowder, 1, 0), new Object[]
		    { "cc", "cc", 'c', new ItemStack(FloraClouds.getInstance().cloud, 1, 3) });
	}
	
	/* Server-side config location */
	
	public File getMinecraftDir()
	{
		return new File(".");
	}
}
