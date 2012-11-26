package mDiyo.inficraft.flora.trees;

import java.io.File;

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
		int[] woodmeta = { 2, 4, 6, 8 }; //Full range of planks
		int[] shortwoodmeta = { 2, 6, 8 }; //No bloodwood
		for(int iter = 0; iter < woodmeta.length; iter++)
		{
			ModLoader.addRecipe(new ItemStack(FloraTrees.instance.redwood, 4, woodmeta[iter]), new Object[]
				{ "w", 'w', new ItemStack(FloraTrees.instance.redwood, 1, woodmeta[iter] - 1) });
			ModLoader.addRecipe(new ItemStack(Block.workbench), new Object[]
				{ "ww", "ww", 'w', new ItemStack(FloraTrees.instance.redwood, 1, woodmeta[iter]) });
			ModLoader.addRecipe(new ItemStack(Block.fenceGate, 1), new Object[]
				{ "#W#", "#W#", '#', Item.stick, Character.valueOf('W'), new ItemStack(FloraTrees.instance.redwood, 1, woodmeta[iter]) });
			ModLoader.addRecipe(new ItemStack(Block.jukebox, 1), new Object[]
			    { "###", "#X#", "###", '#', new ItemStack(FloraTrees.instance.redwood, 1, woodmeta[iter]), 'X', Item.diamond });
			ModLoader.addRecipe(new ItemStack(Block.music, 1), new Object[]
			    { "###", "#X#", "###", '#', new ItemStack(FloraTrees.instance.redwood, 1, woodmeta[iter]), 'X', Item.redstone });
			ModLoader.addRecipe(new ItemStack(Block.stoneSingleSlab, 3, 2), new Object[]
			    { "###", '#', new ItemStack(FloraTrees.instance.redwood, 1, woodmeta[iter]) });
			/*ModLoader.addRecipe(new ItemStack(Item.doorWood, 1), new Object[]
			    { "##", "##", "##", '#', new ItemStack(FloraTrees.instance.redwood, 1, woodmeta[iter]) });*/
			ModLoader.addRecipe(new ItemStack(Block.trapdoor, 2), new Object[]
			    { "###", "###", '#', new ItemStack(FloraTrees.instance.redwood, 1, woodmeta[iter]) });
			ModLoader.addRecipe(new ItemStack(Item.sign, 1), new Object[]
			    { "###", "###", " X ", '#', new ItemStack(FloraTrees.instance.redwood, 1, woodmeta[iter]), 'X', Item.stick });
			ModLoader.addRecipe(new ItemStack(Item.bowlEmpty, 4), new Object[]
			    { "# #", " # ", '#', new ItemStack(FloraTrees.instance.redwood, 1, woodmeta[iter]) });
			ModLoader.addRecipe(new ItemStack(Block.stairCompactPlanks, 4), new Object[]
			    { "#  ", "## ", "###", '#', new ItemStack(FloraTrees.instance.redwood, 1, woodmeta[iter]) });
			ModLoader.addRecipe(new ItemStack(Block.chest), new Object[]
					{ "###", "# #", "###", '#', new ItemStack(FloraTrees.instance.redwood, 1, woodmeta[iter]) });
			ModLoader.addRecipe(new ItemStack(Block.pressurePlatePlanks, 1), new Object[]
			    { "##", '#', new ItemStack(FloraTrees.instance.redwood, 1, woodmeta[iter]) });
			ModLoader.addRecipe(new ItemStack(Block.pistonBase, 1), new Object[]
			{ "TTT", "#X#", "#R#", '#', Block.cobblestone, 'X', Item.ingotIron, 'R', Item.redstone, 'T',
				new ItemStack(FloraTrees.instance.redwood, 1, woodmeta[iter]) });
			ModLoader.addRecipe(new ItemStack(Item.bed, 1), new Object[]
			{ "###", "XXX", '#', Block.cloth, 'X', new ItemStack(FloraTrees.instance.redwood, 1, woodmeta[iter]) });
			ModLoader.addRecipe(new ItemStack(FloraTrees.instance.floraBoat, 1, iter), new Object[]
			{ "# #", "###", '#', new ItemStack(FloraTrees.instance.redwood, 1, woodmeta[iter]) });
		}
		for(int iter = 0; iter < shortwoodmeta.length; iter++)
		{
			ModLoader.addRecipe(new ItemStack(Item.stick, 4, 0), new Object[]
			{ "w", "w", 'w', new ItemStack(FloraTrees.instance.redwood, 8, shortwoodmeta[iter]) });
			ModLoader.addRecipe(new ItemStack(Item.pickaxeWood), new Object[]
			{ "www", " | ", " | ", 'w', new ItemStack(FloraTrees.instance.redwood, 1, woodmeta[iter]), '|', Item.stick });
			ModLoader.addRecipe(new ItemStack(Item.shovelWood), new Object[]
			{ "w", "|", "|", 'w', new ItemStack(FloraTrees.instance.redwood, 1, woodmeta[iter]), '|', Item.stick });
			ModLoader.addRecipe(new ItemStack(Item.axeWood), new Object[]
			{ "ww ", "w| ", " | ", 'w', new ItemStack(FloraTrees.instance.redwood, 1, woodmeta[iter]), '|', Item.stick });
			ModLoader.addRecipe(new ItemStack(Item.swordWood), new Object[]
			{ "w", "w", "|", 'w', new ItemStack(FloraTrees.instance.redwood, 1, woodmeta[iter]), '|', Item.stick });
			ModLoader.addRecipe(new ItemStack(Item.hoeWood), new Object[]
			{ "ww", "| ", "| ", 'w', new ItemStack(FloraTrees.instance.redwood, 1, woodmeta[iter]), '|', Item.stick });
		}
		ModLoader.addRecipe(new ItemStack(FloraTrees.instance.redwoodDoorItem, 1), new Object[]
		{ "##", "##", "##", '#', new ItemStack(FloraTrees.instance.redwood, 1, woodmeta[0]) });
		ModLoader.addRecipe(new ItemStack(Item.doorWood, 1), new Object[]
		{ "##", "##", "##", '#', new ItemStack(FloraTrees.instance.redwood, 1, woodmeta[1]) });
		ModLoader.addRecipe(new ItemStack(Item.doorWood, 1), new Object[]
		{ "##", "##", "##", '#', new ItemStack(FloraTrees.instance.redwood, 1, woodmeta[2]) });
		ModLoader.addRecipe(new ItemStack(Item.doorWood, 1), new Object[]
		{ "##", "##", "##", '#', new ItemStack(FloraTrees.instance.redwood, 1, woodmeta[3]) });
		
		//Turn logs into charcoal
		FurnaceRecipes.smelting().addSmelting(FloraTrees.instance.redwood.blockID, 0, new ItemStack(Item.coal, 1, 1), 0.15f);
		FurnaceRecipes.smelting().addSmelting(FloraTrees.instance.redwood.blockID, 1, new ItemStack(Item.coal, 1, 1), 0.15f);
		FurnaceRecipes.smelting().addSmelting(FloraTrees.instance.redwood.blockID, 5, new ItemStack(Item.coal, 1, 1), 0.15f);
		FurnaceRecipes.smelting().addSmelting(FloraTrees.instance.redwood.blockID, 7, new ItemStack(Item.coal, 1, 1), 0.15f);
	}
	
	public File getMinecraftDir()
	{
		return new File(".");
	}
	
}
