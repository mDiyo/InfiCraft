package mDiyo.inficraft.flora.crops;

import java.io.File;

import net.minecraft.src.Block;
import net.minecraft.src.FurnaceRecipes;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;
import net.minecraft.src.ModLoader;

public class FloraCropsCommonProxy 
{
	/* Registers any rendering code. Does nothing server-side */
	public void registerRenderer() {}
	
	/* Ties an internal name to a visible one. Does nothing server-side */
	public void addNames() {}
	
	/* Equivalent Exchange support, direct plug-in 
	 * Temporarily disabled
	 */
	public static void addEESupport()
    {
        /*try
        {
            Class class1 = Class.forName("mod_EE");
            Class class2 = Class.forName("EEProxy");
            System.out.println("Equivalent Exchange integration for Flora & Soma activated");

	        EEProxy.setEMC(new ItemStack(barleySeed, 1, 0), 16);
	        EEProxy.setEMC(new ItemStack(food, 1, 0), 24);
	        EEProxy.setEMC(new ItemStack(food, 1, 1), 24);
            
            //EEProxy.setEMC(saguaro.blockID, 8);
            

            System.out.println("EMC values set!");
        }
        catch (Throwable throwable)
        {
            System.out.println("Equivalent Exchange integration failed! Reason:");
            System.out.println(throwable);
        }*/
    }
	
	public void addRecipes()
	{
		ModLoader.addRecipe(new ItemStack(FloraCrops.getInstance().seedBag, 1, 0), new Object[]
		{
			"sss", "sss", "sss", 's', Item.seeds
		});
		
		ModLoader.addRecipe(new ItemStack(Item.bread), new Object[]
		{
			"bbb", Character.valueOf('b'), new ItemStack(FloraCrops.getInstance().food, 1, 0)
		});
		ModLoader.addRecipe(new ItemStack(FloraCrops.getInstance().food, 1, 1), new Object[]
		{
			"b", Character.valueOf('b'), new ItemStack(FloraCrops.getInstance().food, 1, 0)
		});
		FurnaceRecipes.smelting().addSmelting(FloraCrops.getInstance().food.shiftedIndex, 1, new ItemStack(Item.bread, 1));
		
		ModLoader.addRecipe(new ItemStack(FloraCrops.getInstance().waterDrop, 1), new Object[]
				{
					"X", 'X', Block.cactus
				});
		
		/*ModLoader.addName(wheatFlour, "Flour");
		ModLoader.addRecipe(new ItemStack(wheatFlour, 1), new Object[]
				{
					"X", 'X', Item.wheat
				});
		ModLoader.addName(wheatDough, "Dough");
		ModLoader.addShapelessRecipe(new ItemStack(wheatDough, 1), new Object[]
				{
					wheatFlour, Item.bucketWater
				});
		ModLoader.addShapelessRecipe(new ItemStack(wheatDough, 2), new Object[]
				{
					wheatFlour, Item.egg
				});
		ModLoader.addSmelting(wheatDough.shiftedIndex, new ItemStack(Item.bread, 1));
		ModLoader.addSmelting(wheatFlour.shiftedIndex, new ItemStack(Item.bread, 1));
		ModLoader.addRecipe(new ItemStack(Item.cake, 1), new Object[]
				{
					"AAA", "BEB", " C ", Character.valueOf('A'), Item.bucketMilk, Character.valueOf('B'), Item.sugar, Character.valueOf('C'), wheatFlour, Character.valueOf('E'),
					Item.egg
				});
		ModLoader.addRecipe(new ItemStack(Item.bucketWater, 1), new Object[]
				{
					"www", "wBw", "www", 'w', waterDrop, Character.valueOf('B'), Item.bucketEmpty
				});*/
		
	}
	
	public File getMinecraftDir()
	{
		return new File(".");
	}
}
