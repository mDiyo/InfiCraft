package florasoma.corruptor;

import java.io.File;

import net.minecraft.item.ItemStack;
import net.minecraft.src.ModLoader;

public class FloraCorruptorCommonProxy 
{	
	/* Registers any rendering code. Does nothing server-side */
	public void registerRenderer() {}
	
	/* Ties an internal name to a visible one. Does nothing server-side */
	public void addNames() {}
	
	public void addRecipes()
	{
		for (int i = 0; i <= 7; i++)
		{
			ModLoader.addRecipe(new ItemStack(FloraCorruptor.instance.corruptor, 1, i), new Object[]
			{
				"c", 'c', new ItemStack(FloraCorruptor.instance.corruptBrick, 1, i)
			});
		}

		for (int j = 0; j <= 7; j++)
		{
			ModLoader.addRecipe(new ItemStack(FloraCorruptor.instance.corruptBrick, 4, j + 8), new Object[]
			{
				"cc", "cc", 'c', new ItemStack(FloraCorruptor.instance.corruptBrick, 1, j)
			});
		}
	}
	
	public File getMinecraftDir()
	{
		return new File(".");
	}
}
