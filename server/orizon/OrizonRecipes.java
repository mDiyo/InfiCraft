package net.minecraft.src.orizon;
import net.minecraft.src.*;
public class OrizonRecipes {

	public static void addNames() {
    	
    }
	
	public static void addRecipes()
	{
		ModLoader.addRecipe(new ItemStack(Block.stairSingle, 6, 3), new Object[] 
				{"###", '#', new ItemStack(mod_Orizon.cCobble, 1, -1)});
		ModLoader.addRecipe(new ItemStack(Block.stairSingle, 6, 0), new Object[] 
				{"###", '#', new ItemStack(mod_Orizon.cStone, 1, -1)});
		ModLoader.addRecipe(new ItemStack(Block.stairSingle, 6, 5), new Object[] 
				{"###", '#', new ItemStack(mod_Orizon.cBrick, 1, -1)});
		ModLoader.addRecipe(new ItemStack(Item.brewingStand, 1), new Object[] 
				{" B ", "###", '#', new ItemStack(mod_Orizon.cCobble, 1, -1), 'B', Item.blazeRod});
		ModLoader.addRecipe(new ItemStack(Block.stairCompactCobblestone, 4), new Object[] 
				{"#  ", "## ", "###", '#', new ItemStack(mod_Orizon.cCobble, 1, -1)});
		ModLoader.addRecipe(new ItemStack(Block.stairsStoneBrickSmooth, 4), new Object[] 
				{"#  ", "## ", "###", '#', new ItemStack(mod_Orizon.cBrick, 1, -1)});
		ModLoader.addRecipe(new ItemStack(Block.lever, 1), new Object[] 
				{"X", "#", '#', new ItemStack(mod_Orizon.cCobble, 1, -1), 'X', Item.stick});
		ModLoader.addRecipe(new ItemStack(Item.redstoneRepeater, 1), new Object[] 
				{"#X#", "III", '#', Block.torchRedstoneActive, 'X', Item.redstone, 'I', new ItemStack(mod_Orizon.cStone, 1, -1)});
		ModLoader.addRecipe(new ItemStack(Block.pressurePlateStone, 1), new Object[] 
				{"##", '#', new ItemStack(mod_Orizon.cStone, 1, -1)});
        ModLoader.addRecipe(new ItemStack(Block.dispenser, 1), new Object[] 
        		{"###", "#X#", "#R#", '#', new ItemStack(mod_Orizon.cCobble, 1, -1), 'X', Item.bow, 'R', Item.redstone});
        ModLoader.addRecipe(new ItemStack(Block.pistonBase, 1), new Object[] 
        		{"TTT", "#X#", "#R#", '#', new ItemStack(mod_Orizon.cCobble, 1, -1), 'X', Item.ingotIron, 'R', Item.redstone, 'T', Block.planks});
	
        ModLoader.addRecipe(new ItemStack(Item.pickaxeStone), new Object[] 
				{"###", " | ", " | ", '#', new ItemStack(mod_Orizon.cCobble, 1, -1), '|', Item.stick});
        ModLoader.addRecipe(new ItemStack(Item.shovelStone), new Object[] 
				{"#", "|", "|", '#', new ItemStack(mod_Orizon.cCobble, 1, -1), '|', Item.stick});
        ModLoader.addRecipe(new ItemStack(Item.axeStone), new Object[] 
				{"##", "#|", " |", '#', new ItemStack(mod_Orizon.cCobble, 1, -1), '|', Item.stick});
        ModLoader.addRecipe(new ItemStack(Item.swordStone), new Object[] 
				{"#", "#", "|", '#', new ItemStack(mod_Orizon.cCobble, 1, -1), '|', Item.stick});
        ModLoader.addRecipe(new ItemStack(Item.hoeStone), new Object[] 
				{"##", " |", " |", '#', new ItemStack(mod_Orizon.cCobble, 1, -1), '|', Item.stick});
        
        ModLoader.addRecipe(new ItemStack(Block.stoneOvenIdle), new Object[] 
        		{"###", "# #", "###", '#', new ItemStack(mod_Orizon.cCobble, 1, -1)});
        for(int i = 0; i < 16; i++) {
        	ModLoader.addRecipe(new ItemStack(mod_Orizon.cBrick, 4, i), new Object[] 
        		{"##", "##", '#', new ItemStack(mod_Orizon.cStone, 1, i)});
        }
        for(int i = 0; i < 16; i++) {
        	FurnaceRecipes.smelting().addSmelting(mod_Orizon.cCobbleID, i, new ItemStack(mod_Orizon.cStone, 1, i));
        }
        
        FurnaceRecipes.smelting().addSmelting(mod_Orizon.mineralOre.blockID, 0, new ItemStack(mod_Orizon.ingots, 1, 0));
        FurnaceRecipes.smelting().addSmelting(mod_Orizon.mineralOre.blockID, 4, new ItemStack(mod_Orizon.ingots, 1, 1));
        FurnaceRecipes.smelting().addSmelting(mod_Orizon.mineralOre.blockID, 5, new ItemStack(mod_Orizon.ingots, 1, 2));
        FurnaceRecipes.smelting().addSmelting(mod_Orizon.mineralOre.blockID, 8, new ItemStack(mod_Orizon.ingots, 1, 3));
        FurnaceRecipes.smelting().addSmelting(mod_Orizon.mineralOre.blockID, 9, new ItemStack(mod_Orizon.ingots, 1, 4));
        FurnaceRecipes.smelting().addSmelting(mod_Orizon.mineralOre.blockID, 12, new ItemStack(mod_Orizon.ingots, 1, 5));
        
        FurnaceRecipes.smelting().addSmelting(mod_Orizon.mineralOreAlt.blockID, 0, new ItemStack(mod_Orizon.ingots, 1, 0));
        FurnaceRecipes.smelting().addSmelting(mod_Orizon.mineralOreAlt.blockID, 4, new ItemStack(mod_Orizon.ingots, 1, 1));
        FurnaceRecipes.smelting().addSmelting(mod_Orizon.mineralOreAlt.blockID, 5, new ItemStack(mod_Orizon.ingots, 1, 2));
        FurnaceRecipes.smelting().addSmelting(mod_Orizon.mineralOreAlt.blockID, 8, new ItemStack(mod_Orizon.ingots, 1, 3));
        FurnaceRecipes.smelting().addSmelting(mod_Orizon.mineralOreAlt.blockID, 9, new ItemStack(mod_Orizon.ingots, 1, 4));
        FurnaceRecipes.smelting().addSmelting(mod_Orizon.mineralOreAlt.blockID, 12, new ItemStack(mod_Orizon.ingots, 1, 5));
	}
	
	public static void addCopperTools(ItemStack stack) {
		ModLoader.addRecipe(new ItemStack(mod_Orizon.copperSword), new Object[] 
				{ "#", "#", "|", '#', stack, '|', Item.stick });
		ModLoader.addRecipe(new ItemStack(mod_Orizon.copperPickaxe), new Object[] 
				{ "###", " | ", " | ", '#', stack, '|', Item.stick });
		ModLoader.addRecipe(new ItemStack(mod_Orizon.copperShovel), new Object[] 
	        	{ "#", "|", "|", '#', stack, '|', Item.stick });
		ModLoader.addRecipe(new ItemStack(mod_Orizon.copperAxe), new Object[] 
	        	{ "##", "#|", " |", '#', stack, '|', Item.stick });
		ModLoader.addRecipe(new ItemStack(mod_Orizon.copperHoe), new Object[] 
	        	{ "##", " |", " |", '#', stack, '|', Item.stick });
	}
	
	public static void addBronzeTools(ItemStack stack) {
		ModLoader.addRecipe(new ItemStack(mod_Orizon.bronzeSword), new Object[] 
				{ "#", "#", "|", '#', stack, '|', Item.stick });
		ModLoader.addRecipe(new ItemStack(mod_Orizon.bronzePickaxe), new Object[] 
				{ "###", " | ", " | ", '#', stack, '|', Item.stick });
		ModLoader.addRecipe(new ItemStack(mod_Orizon.bronzeShovel), new Object[] 
	        	{ "#", "|", "|", '#', stack, '|', Item.stick });
		ModLoader.addRecipe(new ItemStack(mod_Orizon.bronzeAxe), new Object[] 
	        	{ "##", "#|", " |", '#', stack, '|', Item.stick });
		ModLoader.addRecipe(new ItemStack(mod_Orizon.bronzeHoe), new Object[] 
	        	{ "##", " |", " |", '#', stack, '|', Item.stick });
	}
	
	public static void addRefinedIronTools(ItemStack stack) {
		ModLoader.addRecipe(new ItemStack(mod_Orizon.refinedIronSword), new Object[] 
				{ "#", "#", "|", '#', stack, '|', Item.stick });
		ModLoader.addRecipe(new ItemStack(mod_Orizon.refinedIronPickaxe), new Object[] 
				{ "###", " | ", " | ", '#', stack, '|', Item.stick });
		ModLoader.addRecipe(new ItemStack(mod_Orizon.refinedIronShovel), new Object[] 
	        	{ "#", "|", "|", '#', stack, '|', Item.stick });
		ModLoader.addRecipe(new ItemStack(mod_Orizon.refinedIronAxe), new Object[] 
	        	{ "##", "#|", " |", '#', stack, '|', Item.stick });
		ModLoader.addRecipe(new ItemStack(mod_Orizon.refinedIronHoe), new Object[] 
	        	{ "##", " |", " |", '#', stack, '|', Item.stick });
	}
	
	public static void addSteelTools(ItemStack stack) {
		ModLoader.addRecipe(new ItemStack(mod_Orizon.steelSword), new Object[] 
				{ "#", "#", "|", '#', stack, '|', Item.stick });
		ModLoader.addRecipe(new ItemStack(mod_Orizon.steelPickaxe), new Object[] 
				{ "###", " | ", " | ", '#', stack, '|', Item.stick });
		ModLoader.addRecipe(new ItemStack(mod_Orizon.steelShovel), new Object[] 
	        	{ "#", "|", "|", '#', stack, '|', Item.stick });
		ModLoader.addRecipe(new ItemStack(mod_Orizon.steelAxe), new Object[] 
	        	{ "##", "#|", " |", '#', stack, '|', Item.stick });
		ModLoader.addRecipe(new ItemStack(mod_Orizon.steelHoe), new Object[] 
	        	{ "##", " |", " |", '#', stack, '|', Item.stick });
	}
	
	public static void addCobaltTools(ItemStack stack) {
		ModLoader.addRecipe(new ItemStack(mod_Orizon.cobaltSword), new Object[] 
				{ "#", "#", "|", '#', stack, '|', Item.stick });
		ModLoader.addRecipe(new ItemStack(mod_Orizon.cobaltPickaxe), new Object[] 
				{ "###", " | ", " | ", '#', stack, '|', Item.stick });
		ModLoader.addRecipe(new ItemStack(mod_Orizon.cobaltShovel), new Object[] 
	        	{ "#", "|", "|", '#', stack, '|', Item.stick });
		ModLoader.addRecipe(new ItemStack(mod_Orizon.cobaltAxe), new Object[] 
	        	{ "##", "#|", " |", '#', stack, '|', Item.stick });
		ModLoader.addRecipe(new ItemStack(mod_Orizon.cobaltHoe), new Object[] 
	        	{ "##", " |", " |", '#', stack, '|', Item.stick });
	}
	
	public static void addArditeTools(ItemStack stack) {
		ModLoader.addRecipe(new ItemStack(mod_Orizon.arditeSword), new Object[] 
				{ "#", "#", "|", '#', stack, '|', Item.stick });
		ModLoader.addRecipe(new ItemStack(mod_Orizon.arditePickaxe), new Object[] 
				{ "###", " | ", " | ", '#', stack, '|', Item.stick });
		ModLoader.addRecipe(new ItemStack(mod_Orizon.arditeShovel), new Object[] 
	        	{ "#", "|", "|", '#', stack, '|', Item.stick });
		ModLoader.addRecipe(new ItemStack(mod_Orizon.arditeAxe), new Object[] 
	        	{ "##", "#|", " |", '#', stack, '|', Item.stick });
		ModLoader.addRecipe(new ItemStack(mod_Orizon.arditeHoe), new Object[] 
	        	{ "##", " |", " |", '#', stack, '|', Item.stick });
	}
	
	public static void addManyullynTools(ItemStack stack) {
		ModLoader.addRecipe(new ItemStack(mod_Orizon.manyullynSword), new Object[] 
				{ "#", "#", "|", '#', stack, '|', Item.stick });
		ModLoader.addRecipe(new ItemStack(mod_Orizon.manyullynPickaxe), new Object[] 
				{ "###", " | ", " | ", '#', stack, '|', Item.stick });
		ModLoader.addRecipe(new ItemStack(mod_Orizon.manyullynShovel), new Object[] 
	        	{ "#", "|", "|", '#', stack, '|', Item.stick });
		ModLoader.addRecipe(new ItemStack(mod_Orizon.manyullynAxe), new Object[] 
	        	{ "##", "#|", " |", '#', stack, '|', Item.stick });
		ModLoader.addRecipe(new ItemStack(mod_Orizon.manyullynHoe), new Object[] 
	        	{ "##", " |", " |", '#', stack, '|', Item.stick });
	}
}
