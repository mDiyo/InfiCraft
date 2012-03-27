package net.minecraft.src.orizon;
import net.minecraft.src.*;
public class OrizonRecipes {
	
	public static void addNames() {
    	ModLoader.addLocalization("mineralCopper.name", "Copper Ore");
    	ModLoader.addLocalization("mineralTurquoise.name", "Turquoise Ore");
    	ModLoader.addLocalization("mineralChalcocte.name", "Chalcocite Ore");
    	ModLoader.addLocalization("mineralCassiterite.name", "Cassiterite Ore");
    	ModLoader.addLocalization("mineralTeallite.name", "Teallite Ore");
    	ModLoader.addLocalization("mineralZincBloom.name", "Zinc Bloom Ore");
    	ModLoader.addLocalization("mineralSphalerite.name", "Sphalerite Ore");
    	ModLoader.addLocalization("mineralCerussite.name", "Cerussite Ore");
    	ModLoader.addLocalization("mineralCobalt.name", "Cobalt Ore");
    	ModLoader.addLocalization("mineralArdite.name", "Ardite Ore");
    	ModLoader.addLocalization("mineralMyuvil.name", "Myuvil Ore");
    	ModLoader.addLocalization("mineralGalena.name", "Galena Ore");
    	ModLoader.addLocalization("mineralChrysocolla.name", "Chrysocolla Ore");
    	ModLoader.addLocalization("mineralIvymetal.name", "Ivymetal Ore");
    	ModLoader.addLocalization("mineralAggregate.name", "Aggregate Ore");
    	
    	ModLoader.addLocalization("gemRubyOre.name", "Ruby Ore");
    	ModLoader.addLocalization("gemEmeraldOre.name", "Emerald Ore");
    	ModLoader.addLocalization("gemSapphireOre.name", "Sapphire Ore");
    	ModLoader.addLocalization("gemTopazOre.name", "Topaz Ore");
    	ModLoader.addLocalization("gemAmethystOre.name", "Amethyst Ore");
    	ModLoader.addLocalization("gemQuartzOre.name", "Quartz Ore");
    	ModLoader.addLocalization("gemRoseQuartzOre.name", "Rose Quartz Ore");
    	ModLoader.addLocalization("gemRockCrystalOre.name", "Rock Crystal Ore");
    	
    	ModLoader.addLocalization("gemRuby.name", "Ruby");
    	ModLoader.addLocalization("gemEmerald.name", "Emerald");
    	ModLoader.addLocalization("gemSapphire.name", "Sapphire");
    	ModLoader.addLocalization("gemTopaz.name", "Topaz");
    	ModLoader.addLocalization("gemAmethyst.name", "Amethyst");
    	ModLoader.addLocalization("gemQuartz.name", "Quartz");
    	ModLoader.addLocalization("gemRoseQuartz.name", "Rose Quartz");
    	ModLoader.addLocalization("gemRockCrystal.name", "Rock Crystal");
    	
    	ModLoader.addLocalization("copperIngot.name", "Copper Ingot");
    	ModLoader.addLocalization("tinIngot.name", "Tin Ingot");
    	ModLoader.addLocalization("zincIngot.name", "Zinc Ingot");
    	ModLoader.addLocalization("cobaltIngot.name", "Cobalt Ingot");
    	ModLoader.addLocalization("arditeIngot.name", "Ardite Ingot");
    	ModLoader.addLocalization("ivymetalIngot.name", "Ivymetal Ingot");
    	ModLoader.addLocalization("bronzeIngot.name", "Bronze Ingot");
    	ModLoader.addLocalization("brassIngot.name", "Brass Ingot");
    	ModLoader.addLocalization("corditeIngot.name", "Cordite Ingot");
    	ModLoader.addLocalization("rootedCobaltIngot.name", "Rooted Cobalt Ingot");
    	ModLoader.addLocalization("manyullynIngot.name", "Manyullyn Ingot");
    	ModLoader.addLocalization("refinedIronIngot.name", "Worked Iron Ingot");
    	ModLoader.addLocalization("steelIngot.name", "Carbon Steel Ingot");
    	
    	ModLoader.addLocalization("calciteCalcite.name", "Calcite");
    	ModLoader.addLocalization("calciteGalena.name", "Galena Ore");
    	ModLoader.addLocalization("calciteCassiterite.name", "Cassiterite Ore");
    	ModLoader.addLocalization("calciteZincBloom.name", "Zinc Bloom Ore");
    	ModLoader.addLocalization("calciteSphalerite.name", "Sphalerite Ore");
    	ModLoader.addLocalization("calciteChalcocite.name", "Chalcocite Ore");    	
    	ModLoader.addLocalization("calciteSulphur.name", "Sulfur");
    	
    	ModLoader.addLocalization("netherBloodbiteOre.name", "Bloodbite Ore");
    	ModLoader.addLocalization("netherGrudgeOre.name", "Grudge-filled Ore");
    	ModLoader.addLocalization("netherWistfulOre.name", "Wistful Ore");
    	ModLoader.addLocalization("netherFlamelashOre.name", "Flamelash Ore");
    	ModLoader.addLocalization("netherTearsOre.name", "Buried Teardrop Remains");
    	ModLoader.addLocalization("netherGoldOre.name", "Gold Ore");
    	ModLoader.addLocalization("netherOnyxOre.name", "Onyx Ore");
    	
    	ModLoader.addLocalization("netherBloodbite.name", "Bloodbite Ingot");
    	ModLoader.addLocalization("netherGrudge.name", "Cursed Metal Ingot");
    	ModLoader.addLocalization("netherWistful.name", "Ingot of Longing");
    	ModLoader.addLocalization("netherFlamelash.name", "Flamelash Ingot");
    	ModLoader.addLocalization("netherTears.name", "Teardrop Remains");
    	ModLoader.addLocalization("netherOnyx.name", "Onyx Ingot");
    	
    	ModLoader.addLocalization("whiteMarble.name", "White Marble");
    	ModLoader.addLocalization("blackMarble.name", "Black Marble");
    	ModLoader.addLocalization("roseMarble.name", "Rose Marble");
    	ModLoader.addLocalization("emeraldMarble.name", "Emerald Marble");
    	ModLoader.addLocalization("azureMarble.name", "Azure Marble");
    	
    	ModLoader.addName(mod_Orizon.slimeGelBlock, "Congealed Slime");
    	
    	String namePrefixArray[] = { "high", "medium", "low", "dark", "red", "blue", "yellow", "purple",
    		"aqua", "darkgreen", "orange", "pink", "blueGray", "mint", "violet", "cyan"	
    	};
    	
    	String nameSuffixArray[] = { "Stone", "Cobblestone", "Brick", 
    			"Mossy", "Cracked", "Tile", "Fancy", "Square"    			
    	};
    	
    	String prefixArray[] = { "High", "Tinged", "Low", "Dark", "Roman", "Seawashed", "Sunny", "Lilac",
    			"Aqua", "Emerald", "Bronzed", "Rose", "Bluegrass", "Mint", "Violet", "Cyan"    			
    	};
    	
    	String suffixArray[] = { "Stone", "Cobblestone", "Stone Brick", "Mossy Brick", 
    			"Cracked Brick", "Brick Tile", "Fancy Brick", "Square Brick"    			
    	};
    	
    	for (int i = 0; i < namePrefixArray.length; i++) {
    		for (int j = 0; j < nameSuffixArray.length; j++) {
    			ModLoader.addLocalization(
    					new StringBuilder().append(namePrefixArray[i]).append(nameSuffixArray[j])
    					.append(".name").toString(), 
    					new StringBuilder().append(prefixArray[i]).append(" ")
    					.append(suffixArray[j]).toString());
    		}
    	}
    	
    	ModLoader.addName(mod_Orizon.copperSword, "Copper Sword");
    	ModLoader.addName(mod_Orizon.copperPickaxe, "Copper Pickaxe");
    	ModLoader.addName(mod_Orizon.copperShovel, "Copper Shovel");
    	ModLoader.addName(mod_Orizon.copperAxe, "Copper Axe");
    	ModLoader.addName(mod_Orizon.copperHoe, "Copper Hoe");
    	
    	ModLoader.addName(mod_Orizon.bronzeSword, "Bronze Sword");
    	ModLoader.addName(mod_Orizon.bronzePickaxe, "Bronze Pickaxe");
    	ModLoader.addName(mod_Orizon.bronzeShovel, "Bronze Shovel");
    	ModLoader.addName(mod_Orizon.bronzeAxe, "Bronze Axe");
    	ModLoader.addName(mod_Orizon.bronzeHoe, "Bronze Hoe");
    	
    	ModLoader.addName(mod_Orizon.refinedIronSword, "Refined Iron Sword");
    	ModLoader.addName(mod_Orizon.refinedIronPickaxe, "Refined Iron Pickaxe");
    	ModLoader.addName(mod_Orizon.refinedIronShovel, "Refined Iron Shovel");
    	ModLoader.addName(mod_Orizon.refinedIronAxe, "Refined Iron Axe");
    	ModLoader.addName(mod_Orizon.refinedIronHoe, "Refined Iron Hoe");
    	
    	ModLoader.addName(mod_Orizon.steelSword, "Steel Sword");
    	ModLoader.addName(mod_Orizon.steelPickaxe, "Steel Pickaxe");
    	ModLoader.addName(mod_Orizon.steelShovel, "Steel Shovel");
    	ModLoader.addName(mod_Orizon.steelAxe, "Steel Axe");
    	ModLoader.addName(mod_Orizon.steelHoe, "Steel Hoe");
    	
    	ModLoader.addName(mod_Orizon.cobaltSword, "Cobalt Sword");
    	ModLoader.addName(mod_Orizon.cobaltPickaxe, "Cobalt Pickaxe");
    	ModLoader.addName(mod_Orizon.cobaltShovel, "Cobalt Shovel");
    	ModLoader.addName(mod_Orizon.cobaltAxe, "Cobalt Axe");
    	ModLoader.addName(mod_Orizon.cobaltHoe, "Cobalt Hoe");
    	
    	ModLoader.addName(mod_Orizon.arditeSword, "Ardite Sword");
    	ModLoader.addName(mod_Orizon.arditePickaxe, "Ardite Pickaxe");
    	ModLoader.addName(mod_Orizon.arditeShovel, "Ardite Shovel");
    	ModLoader.addName(mod_Orizon.arditeAxe, "Ardite Axe");
    	ModLoader.addName(mod_Orizon.arditeHoe, "Ardite Hoe");
    	
    	ModLoader.addName(mod_Orizon.manyullynSword, "Manyullyn Sword");
    	ModLoader.addName(mod_Orizon.manyullynPickaxe, "Manyullyn Pickaxe");
    	ModLoader.addName(mod_Orizon.manyullynShovel, "Manyullyn Shovel");
    	ModLoader.addName(mod_Orizon.manyullynAxe, "Manyullyn Axe");
    	ModLoader.addName(mod_Orizon.manyullynHoe, "Manyullyn Hoe");
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
