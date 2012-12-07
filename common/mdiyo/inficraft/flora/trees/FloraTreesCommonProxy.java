package mDiyo.inficraft.flora.trees;

import java.io.File;

import cpw.mods.fml.common.registry.GameRegistry;

import net.minecraft.src.Block;
import net.minecraft.src.FurnaceRecipes;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;
import net.minecraft.src.ModLoader;

public class FloraTreesCommonProxy 
{
	/* Registers any rendering code. Does nothing server-side */
	public void registerRenderer() {}
	
	/* Ties an internal name to a visible one. Does nothing server-side */
	public void addNames() {}
	
	public void addRecipes()
	{
		for (int i = 0; i < 3; i++) //Planks
			GameRegistry.addRecipe(new ItemStack(FloraTrees.instance.planks, 4, i), "w", 'w', new ItemStack(FloraTrees.instance.tree, 1, i) );
		GameRegistry.addRecipe(new ItemStack(FloraTrees.instance.planks, 4, 3), "w", 'w', new ItemStack(FloraTrees.instance.redwood, 1, 1) );
		GameRegistry.addRecipe(new ItemStack(FloraTrees.instance.planks, 4, 4), "w", 'w', new ItemStack(FloraTrees.instance.bloodwood, 1, -1) );
		
		ItemStack[] planks = new ItemStack[] { new ItemStack(FloraTrees.instance.planks, 1, 0), new ItemStack(FloraTrees.instance.planks, 1, 1),
			 new ItemStack(FloraTrees.instance.planks, 1, 2), new ItemStack(FloraTrees.instance.planks, 1, 3)};
		
		for (int i = 0; i < 4; i++)
		{
		
			GameRegistry.addRecipe(new ItemStack(Block.workbench), "ww", "ww", 'w', planks[i] );
			GameRegistry.addRecipe(new ItemStack(Block.fenceGate), "#W#", "#W#", '#', Item.stick, 'W', planks[i] );
			GameRegistry.addRecipe(new ItemStack(Block.jukebox), "www", "w#w", "www", '#', Item.diamond, 'w', planks[i] );
			GameRegistry.addRecipe(new ItemStack(Block.music), "www", "w#w", "www", '#', Item.redstone, 'w', planks[i] );
			GameRegistry.addRecipe(new ItemStack(Block.trapdoor, 2), "www", "www", 'w', planks[i] );
			GameRegistry.addRecipe(new ItemStack(Item.sign, 3), "www", "www", " s ", 's', Item.stick, 'w', planks[i] );
			GameRegistry.addRecipe(new ItemStack(Item.bowlEmpty, 3), "w w", " w ", 'w', planks[i] );
			GameRegistry.addRecipe(new ItemStack(Block.stairCompactPlanks, 6), "w  ", "ww ", "www", 'w', planks[i] );
			GameRegistry.addRecipe(new ItemStack(Block.chest), "www", "w w", "www", 'w', planks[i] );
			GameRegistry.addRecipe(new ItemStack(Block.pressurePlatePlanks), "ww", 'w', planks[i] );
			GameRegistry.addRecipe(new ItemStack(Block.pistonBase), "TTT", "#X#", "#R#", '#', Block.cobblestone, 'X', Item.ingotIron, 'R', Item.redstone, 'T', planks[i] );
			GameRegistry.addRecipe(new ItemStack(Item.bed), "ccc", "www", 'c', Item.stick, 'w', planks[i] );
			GameRegistry.addRecipe(new ItemStack(Item.stick, 4), "w", "w", 'w', planks[i] );
			
			GameRegistry.addRecipe(new ItemStack(Item.pickaxeWood), "www", " | ", " | ", '|', Item.stick, 'w', planks[i] );
			GameRegistry.addRecipe(new ItemStack(Item.shovelWood), "w", "|", "|", '|', Item.stick, 'w', planks[i] );
			GameRegistry.addRecipe(new ItemStack(Item.axeWood), "ww", "w|", " |", '|', Item.stick, 'w', planks[i] );
			GameRegistry.addRecipe(new ItemStack(Item.swordWood), "w", "w", "|", '|', Item.stick, 'w', planks[i] );
			GameRegistry.addRecipe(new ItemStack(Item.hoeWood), "ww", "| ", "| ", '|', Item.stick, 'w', planks[i] );
		}
		
		//Turn logs into charcoal
		FurnaceRecipes.smelting().addSmelting(FloraTrees.instance.tree.blockID, 0, new ItemStack(Item.coal, 1, 1), 0.15f);
		FurnaceRecipes.smelting().addSmelting(FloraTrees.instance.tree.blockID, 1, new ItemStack(Item.coal, 1, 1), 0.15f);
		FurnaceRecipes.smelting().addSmelting(FloraTrees.instance.tree.blockID, 2, new ItemStack(Item.coal, 1, 1), 0.15f);
		FurnaceRecipes.smelting().addSmelting(FloraTrees.instance.redwood.blockID, 0, new ItemStack(Item.coal, 1, 1), 0.15f);
		FurnaceRecipes.smelting().addSmelting(FloraTrees.instance.redwood.blockID, 1, new ItemStack(Item.coal, 1, 1), 0.15f);
		FurnaceRecipes.smelting().addSmelting(FloraTrees.instance.redwood.blockID, 2, new ItemStack(Item.coal, 1, 1), 0.15f);
	}
	
	public File getMinecraftDir()
	{
		return new File(".");
	}
	
}
