package bastion;

import java.util.List;
import java.util.Random;

import skillapi.mod_SkillsAPI;
import bastion.blocks.BarricadeBlock;
import bastion.blocks.BarricadeItem;
import bastion.items.LeviWing;
import bastion.skills.BridgeBuilding;
import bastion.skills.Levitation;
import bastion.skills.WallBuilding;

import net.minecraft.src.Block;
import net.minecraft.src.CraftingManager;
import net.minecraft.src.IRecipe;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;
import net.minecraft.src.ModLoader;
import net.minecraft.src.ShapedRecipes;

public class BastionContent
{
	public BastionContent()
	{
		//barrierModel = ModLoader.getUniqueBlockModelID(this, true);

		barricadeOak = new BarricadeBlock(PHBastion.barricadeOak, "Oak", 20);
		ModLoader.registerBlock(barricadeOak, BarricadeItem.class);
		barricadeBirch = new BarricadeBlock(PHBastion.barricadeBirch, "Birch", 117);
		ModLoader.registerBlock(barricadeBirch, BarricadeItem.class);
		barricadePine = new BarricadeBlock(PHBastion.barricadePine, "Pine", 116);
		ModLoader.registerBlock(barricadePine, BarricadeItem.class);
		barricadeCecropia = new BarricadeBlock(PHBastion.barricadeCecropia, "Cecropia", 153);
		ModLoader.registerBlock(barricadeCecropia, BarricadeItem.class);
		//ropeModel = ModLoader.getUniqueBlockModelID(this, false);

		leviwing = new LeviWing(PHBastion.leviwing);
		mod_SkillsAPI.registerSkill(new Levitation());
		mod_SkillsAPI.registerSkill(new WallBuilding());
		mod_SkillsAPI.registerSkill(new BridgeBuilding());
				
		if (PHBastion.redoRecipes) {
			redoRecipes();
		}
		barricadeRecipes();
		skillItemRecipes();
	}

	public static void removeRecipe(ItemStack resultItem) {
		List recipes = CraftingManager.getInstance().getRecipeList();
		for (int i = 0; i < recipes.size(); i++)
		{
			IRecipe tmpRecipe = (IRecipe)recipes.get(i);
			if ((tmpRecipe instanceof ShapedRecipes)) {
				ShapedRecipes recipe = (ShapedRecipes)tmpRecipe;
				ItemStack recipeResult = recipe.getRecipeOutput();

				if (ItemStack.areItemStacksEqual(resultItem, recipeResult))
					recipes.remove(i--);
			}
		}
	}

	public void redoRecipes()
	{
		for (int i = 0; i < 4; i++)
		{
		removeRecipe(new ItemStack(Block.planks, 4, i));
		ModLoader.addRecipe(new ItemStack(Block.planks, 2, 0), "s", 's', new ItemStack(Block.wood, 1, 0) );
		}

		removeRecipe(new ItemStack(Item.stick, 4));
		ModLoader.addRecipe(new ItemStack(Item.stick, 8, 0), "s", "s", 's', Block.planks );

		removeRecipe(new ItemStack(Block.torchWood, 4));
		ModLoader.addRecipe(new ItemStack(Block.torchWood, 2), "c", "s", 'c', new ItemStack(Item.coal, 1, 0), 's', Item.stick );
		ModLoader.addRecipe(new ItemStack(Block.torchWood, 1), "c", "s", 'c', new ItemStack(Item.coal, 1, 1), 's', Item.stick );
	}

	public void barricadeRecipes()
	{
		ModLoader.addRecipe(new ItemStack(this.barricadeOak, 2), "s", "s", 's', new ItemStack(Block.wood, 1, 0) );
		ModLoader.addRecipe(new ItemStack(this.barricadePine, 2), "s", "s", 's', new ItemStack(Block.wood, 1, 1) );
		ModLoader.addRecipe(new ItemStack(this.barricadeBirch, 2), "s", "s", 's', new ItemStack(Block.wood, 1, 2) );
		ModLoader.addRecipe(new ItemStack(this.barricadeCecropia, 2), "s", "s", 's', new ItemStack(Block.wood, 1, 3) );
	}

	public void skillItemRecipes()
	{
		ModLoader.addShapelessRecipe(new ItemStack(this.leviwing), Item.enderPearl, Item.feather, Item.redstone );
	}
	
	public static Block barricadeOak;
	public static Block barricadeBirch;
	public static Block barricadePine;
	public static Block barricadeCecropia;
	public static int barrierModel;
	public static Block rope;
	public static Block ropeBridge;
	public static int ropeModel;
	
	public static Item leviwing;
}