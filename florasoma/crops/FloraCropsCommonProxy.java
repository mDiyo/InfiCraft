package florasoma.crops;

import java.io.File;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import cpw.mods.fml.common.registry.GameRegistry;

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
		GameRegistry.addSmelting(FloraCrops.instance.wheatDough.itemID, new ItemStack(Item.bread, 1), 1f);
		
		GameRegistry.addRecipe(new ItemStack(Item.bread), "bbb", 'b', new ItemStack(FloraCrops.instance.barleyItem, 1, 0) );
		GameRegistry.addRecipe(new ItemStack(FloraCrops.instance.barleyItem, 1, 1), "X", 'X', new ItemStack(FloraCrops.instance.barleyItem, 1, 0) );
		GameRegistry.addShapelessRecipe(new ItemStack(FloraCrops.instance.barleyItem, 1, 2), new ItemStack(FloraCrops.instance.barleyItem, 1, 1), Item.bucketWater );
		GameRegistry.addShapelessRecipe(new ItemStack(FloraCrops.instance.barleyItem, 2, 2), new ItemStack(FloraCrops.instance.barleyItem, 1, 1), Item.egg );
		FurnaceRecipes.smelting().addSmelting(FloraCrops.instance.barleyItem.itemID, 2, new ItemStack(Item.bread, 1), 1f);
		
		GameRegistry.addRecipe(new ItemStack(Item.cake, 1), "AAA", "BEB", " C ", 'A', Item.bucketMilk, 'B', Item.sugar, 
				'C', FloraCrops.instance.wheatFlour, 'E', Item.egg );
		
		/*try
		{
			Class class1 = Class.forName("inficraft.infitools.base.Items");
			
			Item[] emptyBucket = new Item[] { Items.getInstance().woodBucketEmpty, Items.getInstance().cactusBucketEmpty, 
					Items.getInstance().goldBucketEmpty, Items.getInstance().obsidianBucketEmpty };
			Item[] waterBucket = new Item[] { Items.getInstance().woodBucketWater, Items.getInstance().cactusBucketWater, 
					Items.getInstance().goldBucketWater, Items.getInstance().obsidianBucketWater };
			for (int i = 0; i < waterBucket.length; i++)
			{
				GameRegistry.addShapelessRecipe(new ItemStack(FloraCrops.instance.barleyItem, 1, 1), waterBucket[i] );
				GameRegistry.addRecipe(new ItemStack(Item.bucketWater, 1), "www", "wBw", "www", 'w', FloraCrops.instance.waterDrop, 'B',  emptyBucket[i] );
			}
		}
		catch (Exception e)	
		{
			System.out.println("Flora & Soma: Crops had a problem finding InfiTools Base. "+e);
		}*/
	}
	
	public File getMinecraftDir()
	{
		return new File(".");
	}
}
