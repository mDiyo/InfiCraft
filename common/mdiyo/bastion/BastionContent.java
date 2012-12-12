package mDiyo.bastion;

import mDiyo.api.InfiUtil;
import mDiyo.bastion.blocks.*;
import mDiyo.bastion.items.DrillBase;
import net.minecraft.src.Block;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.registry.GameRegistry;

public class BastionContent
{
	public BastionContent()
	{
		barricadeOak = new BarricadeBlock(PHBastion.barricadeOak, "Oak", 20);
		barricadeBirch = new BarricadeBlock(PHBastion.barricadeBirch, "Birch", 117);
		barricadeSpruce = new BarricadeBlock(PHBastion.barricadePine, "Spruce", 116);
		barricadeJungle = new BarricadeBlock(PHBastion.barricadeCecropia, "Jungle", 153);
		
		drill = new DrillBase(4500, 3).setIconCoord(3, 6);
		MinecraftForge.setToolClass(drill, "pickaxe", 3);
		
		GameRegistry.registerBlock(barricadeOak, BarricadeItem.class);
		GameRegistry.registerBlock(barricadeBirch, BarricadeItem.class);
		GameRegistry.registerBlock(barricadeSpruce, BarricadeItem.class);
		GameRegistry.registerBlock(barricadeJungle, BarricadeItem.class);
	}
	
	public void redoRecipes()
	{
		for (int i = 0; i < 4; i++)
		{
			InfiUtil.removeRecipe(new ItemStack(Block.planks, 4, i));
			GameRegistry.addRecipe(new ItemStack(Block.planks, 2, i), "s", 's', new ItemStack(Block.wood, 1, i) );
		}

		InfiUtil.removeRecipe(new ItemStack(Item.stick, 4));
		GameRegistry.addRecipe(new ItemStack(Item.stick, 8, 0), "s", "s", 's', Block.planks );

		InfiUtil.removeRecipe(new ItemStack(Block.torchWood, 4));
		GameRegistry.addRecipe(new ItemStack(Block.torchWood, 2), "c", "s", 'c', new ItemStack(Item.coal, 1, 0), 's', Item.stick );
		GameRegistry.addRecipe(new ItemStack(Block.torchWood, 1), "c", "s", 'c', new ItemStack(Item.coal, 1, 1), 's', Item.stick );
	}

	public void addRecipes()
	{
		//Barricades
		GameRegistry.addRecipe(new ItemStack(this.barricadeOak, 2), "s", "s", 's', new ItemStack(Block.wood, 1, 0) );
		GameRegistry.addRecipe(new ItemStack(this.barricadeSpruce, 2), "s", "s", 's', new ItemStack(Block.wood, 1, 1) );
		GameRegistry.addRecipe(new ItemStack(this.barricadeBirch, 2), "s", "s", 's', new ItemStack(Block.wood, 1, 2) );
		GameRegistry.addRecipe(new ItemStack(this.barricadeJungle, 2), "s", "s", 's', new ItemStack(Block.wood, 1, 3) );
	}
	
	public static Block barricadeOak;
	public static Block barricadeBirch;
	public static Block barricadeSpruce;
	public static Block barricadeJungle;
	
	public static Item drill;
}
