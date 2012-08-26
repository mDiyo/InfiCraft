package mdiyo.inficraft.flora.corruptor;

import java.io.File;

import net.minecraft.src.ItemStack;
import net.minecraft.src.ModLoader;

public class FloraCorruptorCommonProxy 
{	
	/* Registers any rendering code. Does nothing server-side */
	public void registerRenderer() {}
	
	/* Ties an internal name to a visible one. Does nothing server-side */
	public void addNames() {}
	
	/* Equivalent Exchange support, direct plug-in 
	 * Temporarily disabled
	 */
	public void addEESupport()
	{
		
	}
	
	public void addRecipes()
	{
		for (int i = 0; i <= 7; i++)
		{
			ModLoader.addRecipe(new ItemStack(FloraCorruptor.getInstance().corruptor, 1, i), new Object[]
			{
				"c", 'c', new ItemStack(FloraCorruptor.getInstance().corruptBrick, 1, i)
			});
		}

		for (int j = 0; j <= 7; j++)
		{
			ModLoader.addRecipe(new ItemStack(FloraCorruptor.getInstance().corruptBrick, 4, j + 8), new Object[]
			{
				"cc", "cc", 'c', new ItemStack(FloraCorruptor.getInstance().corruptBrick, 1, j)
			});
		}
	}
	
	public File getMinecraftDir()
	{
		return new File(".");
	}
}
