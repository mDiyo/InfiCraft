package florasoma.crops;

import inficraft.infitools.base.Items;

import java.io.File;

import cpw.mods.fml.common.registry.GameRegistry;

import net.minecraft.src.Block;
import net.minecraft.src.FurnaceRecipes;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;

public class FloraCropsCommonProxy 
{
	/* Registers any rendering code. Does nothing server-side */
	public void registerRenderer() {}
	
	/* Ties an internal name to a visible one. Does nothing server-side */
	public void addNames() {}
	
	public void addRecipes()
	{
		GameRegistry.addRecipe(new ItemStack(FloraCrops.instance.wheatBag, 1, 0), "sss", "sss", "sss", 's', Item.seeds );
		GameRegistry.addRecipe(new ItemStack(FloraCrops.instance.barleyBag, 1, 0), "sss", "sss", "sss", 's', FloraCrops.instance.barleySeed );
		GameRegistry.addRecipe(new ItemStack(FloraCrops.instance.potatoBag, 1, 0), "sss", "sss", "sss", 's', Item.potato );
		GameRegistry.addRecipe(new ItemStack(FloraCrops.instance.carrotBag, 1, 0), "sss", "sss", "sss", 's', Item.carrot );
		GameRegistry.addRecipe(new ItemStack(FloraCrops.instance.netherWartBag, 1, 0), "sss", "sss", "sss", 's', Item.netherStalkSeeds );
		
		GameRegistry.addRecipe(new ItemStack(Item.seeds, 9, 0), "s", 's', FloraCrops.instance.wheatBag );
		GameRegistry.addRecipe(new ItemStack(FloraCrops.instance.barleySeed, 0, 9), "s", 's', FloraCrops.instance.barleyBag );
		GameRegistry.addRecipe(new ItemStack(Item.potato, 9, 0), "s", 's', FloraCrops.instance.potatoBag );
		GameRegistry.addRecipe(new ItemStack(Item.carrot, 9, 0), "s", 's', FloraCrops.instance.carrotBag );
		GameRegistry.addRecipe(new ItemStack(Item.netherStalkSeeds, 9, 0), "s", 's', FloraCrops.instance.netherWartBag );
		
		GameRegistry.addRecipe(new ItemStack(FloraCrops.instance.waterDrop, 1), "X", 'X', Block.cactus );
		GameRegistry.addRecipe(new ItemStack(Item.bucketWater, 1), "www", "wBw", "www", 'w', FloraCrops.instance.waterDrop, 'B', Item.bucketEmpty );
		
		GameRegistry.addRecipe(new ItemStack(FloraCrops.instance.wheatFlour, 1), "X", 'X', Item.wheat ); //Wheat
		GameRegistry.addShapelessRecipe(new ItemStack(FloraCrops.instance.wheatDough, 1), FloraCrops.instance.wheatFlour, Item.bucketWater );
		GameRegistry.addShapelessRecipe(new ItemStack(FloraCrops.instance.wheatDough, 2), FloraCrops.instance.wheatFlour, Item.egg );
		GameRegistry.addSmelting(FloraCrops.instance.wheatDough.shiftedIndex, new ItemStack(Item.bread, 1), 1f);
		
		GameRegistry.addRecipe(new ItemStack(Item.bread), "bbb", 'b', new ItemStack(FloraCrops.instance.barleyItem, 1, 0) );
		GameRegistry.addRecipe(new ItemStack(FloraCrops.instance.barleyItem, 1, 1), "X", 'X', new ItemStack(FloraCrops.instance.barleyItem, 1, 0) );
		GameRegistry.addShapelessRecipe(new ItemStack(FloraCrops.instance.barleyItem, 1, 2), FloraCrops.instance.barleyItem, Item.bucketWater );
		GameRegistry.addShapelessRecipe(new ItemStack(FloraCrops.instance.barleyItem, 2, 2), FloraCrops.instance.barleyItem, Item.egg );
		FurnaceRecipes.smelting().addSmelting(FloraCrops.instance.barleyItem.shiftedIndex, 2, new ItemStack(Item.bread, 1), 1f);
		
		GameRegistry.addRecipe(new ItemStack(Item.cake, 1), "AAA", "BEB", " C ", 'A', Item.bucketMilk, 'B', Item.sugar, 
				'C', FloraCrops.instance.wheatFlour, 'E', Item.egg );
		
		try
		{
			Class class1 = Class.forName("mDiyo.inficraft.infitools.core.Items");
			
			Item[] item = new Item[] { Items.getInstance().woodBucketWater, Items.getInstance().cactusBucketWater, 
					Items.getInstance().goldBucketWater, Items.getInstance().obsidianBucketWater };
			for (int i = 0; i < item.length; i++)
			{
				GameRegistry.addShapelessRecipe(new ItemStack(FloraCrops.instance.wheatDough, 1), FloraCrops.instance.wheatFlour, item );
				GameRegistry.addShapelessRecipe(new ItemStack(FloraCrops.instance.wheatDough, 1), new ItemStack(FloraCrops.instance.wheatFlour, 1, 1), item );
			}
		}
		catch (Exception e)	
		{
			System.out.println("Flora & Soma: Crops had a problem finding InfiTools Base. "+e);
		}
	}
	
	public File getMinecraftDir()
	{
		return new File(".");
	}
}
