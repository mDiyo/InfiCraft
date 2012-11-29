package mDiyo.inficraft.infiblocks;

import mDiyo.shared.detailing.DetailManager;
import net.minecraft.src.*;

import java.util.*;

import cpw.mods.fml.common.registry.GameRegistry;

public class InfiBlockRecipes
{	
	static ItemStack[] workbenchArray = {
		new ItemStack(Block.cobblestone),
		new ItemStack(Item.ingotIron),
		new ItemStack(Item.redstone),
		new ItemStack(Item.bone),
		new ItemStack(Block.sandStone, 1, 2),
		new ItemStack(Item.dyePowder, 1, 4),
		new ItemStack(Block.obsidian),
		new ItemStack(Block.cactus),
		new ItemStack(Block.netherrack),
		new ItemStack(Block.ice),
		new ItemStack(Block.stoneBrick)
	};
	
	static ItemStack[] furnaceArray = {
		//new ItemStack(mod_InfiTools.ironChunks),
		new ItemStack(Item.brick),
		new ItemStack(Block.sandStone),
		new ItemStack(Block.obsidian),
		new ItemStack(Item.redstone),
		new ItemStack(Block.netherrack),
		new ItemStack(Block.stoneBrick),
		new ItemStack(Block.whiteStone),
		new ItemStack(Block.glowStone)
	};
	
	static ItemStack[] magicSlabStoneArray = {
		new ItemStack(Block.stone),
		new ItemStack(Block.stoneSingleSlab, 1, 0),
		new ItemStack(Block.cobblestone),
		new ItemStack(Block.stoneBrick, 1, 0),
		new ItemStack(Block.stoneBrick, 1, 1),
		new ItemStack(Block.stoneBrick, 1, 2),
		new ItemStack(Block.brick),
		new ItemStack(Block.cobblestoneMossy),
		new ItemStack(Block.obsidian),
		new ItemStack(Block.netherrack),
		new ItemStack(Block.sandStone),
		new ItemStack(Item.ingotIron),
		new ItemStack(Item.ingotGold),
		new ItemStack(Item.diamond),
		new ItemStack(Block.whiteStone),
		new ItemStack(Block.netherBrick)
	};
	
	static ItemStack[] magicSlabSoilArray = {
		new ItemStack(Block.dirt),
		new ItemStack(Block.grass),
		new ItemStack(Block.mycelium),
		new ItemStack(Block.sand),
		new ItemStack(Block.gravel),
		new ItemStack(Block.wood, 1, 0),
		new ItemStack(Block.wood, 1, 1),
		new ItemStack(Block.wood, 1, 2),
		new ItemStack(Block.planks),
		new ItemStack(Block.blockSnow),
		new ItemStack(Block.slowSand),
		new ItemStack(Block.mushroomBrown),
		new ItemStack(Block.mushroomRed),
		new ItemStack(Block.glowStone),
		new ItemStack(Block.glass),
		new ItemStack(Block.leaves, 1, -1)
	};
	
	static ItemStack[] chestArray = {
		new ItemStack(Block.planks, 1, 0),
		new ItemStack(Block.planks, 1, 1),
		new ItemStack(Block.planks, 1, 2),
		new ItemStack(Block.planks, 1, 3),
		new ItemStack(Block.cactus),
		new ItemStack(Block.wood, 1, -1),
		new ItemStack(Block.stoneBrick, 1, 1),
		new ItemStack(Block.stone),
		new ItemStack(Block.stoneBrick, 1, 0),
		new ItemStack(Block.obsidian),
		new ItemStack(Block.ice),
		new ItemStack(Item.ingotIron),
		new ItemStack(Item.ingotGold),
		new ItemStack(Item.slimeBall),
		new ItemStack(Block.whiteStone)
	};
	
    public static String[] chestRecipe = new String[] {"mmm", "mbm", "mmm"};
	
	public InfiBlockRecipes()
	{
	}

	public static void recipeStorm()
	{
		redoVanillaRecipes();
		
		/*for (int iter = 0; iter < chestArray.length; ++iter)
        	{ GameRegistry.addRecipe(new ItemStack(InfiBlockContent.chest, 1, iter), new Object[] 
        		{chestRecipe, 'm', chestArray[iter], 'b', Block.stoneButton}); }*/
		
		for (int iter = 0; iter < workbenchArray.length; iter++)
		{
		GameRegistry.addRecipe(new ItemStack(InfiBlockContent.workbench, 1, iter), new Object[]
				{
					"bb", "bb", 'b', workbenchArray[iter]
				});
		}
		
		for (int iter = 0; iter < furnaceArray.length; iter++)
		{
			GameRegistry.addRecipe(new ItemStack(InfiBlockContent.furnace, 1, iter+1), new Object[]
			{
				"bbb", "b b", "bbb", 'b', furnaceArray[iter]
			});
		}
		
		GameRegistry.addRecipe(new ItemStack(InfiBlockContent.furnace, 1, 0), new Object[]
		{
			"bxb", "x x", "bxb", 'b', Item.ingotIron, 'x', Block.cobblestone
		});
		
		GameRegistry.addRecipe(new ItemStack(InfiBlockContent.furnace, 1, 0), new Object[]
		{
			"bxb", "x x", "bxb", 'b', Item.ingotIron, 'x', Block.stone
		});
		
		
		//Create carpet
		for (int i = 0; i <= 15; i++)
		{
			GameRegistry.addRecipe(new ItemStack(InfiBlockContent.woolCarpet, 4, i), new Object[]
					{
						"b", 'b', new ItemStack(Block.cloth, 1, i)
					});
		}

		//Carpet dye
		for (int j = 0; j <= 15; j++)
		{
			GameRegistry.addShapelessRecipe(new ItemStack(InfiBlockContent.woolCarpet, 1, j), new Object[]
					{
						new ItemStack(InfiBlockContent.woolCarpet, 1, -1), new ItemStack(Item.dyePowder, 1, 15-j)
					});
		}

		//Cheap carpet dye
		for (int k = 0; k <= 15; k++)
		{
			GameRegistry.addRecipe(new ItemStack(InfiBlockContent.woolCarpet, 8, k), new Object[]
					{
						"ccc", "cdc", "ccc", 'c', new ItemStack(InfiBlockContent.woolCarpet, 1, -1), 
						'd', new ItemStack(Item.dyePowder, 1, 15-k)
					});
		}
		
		//Stained Glass
		for (int j = 0; j <= 15; j++)
		{
			GameRegistry.addShapelessRecipe(new ItemStack(InfiBlockContent.stainedGlass, 1, j), new Object[]
			{
				new ItemStack(Block.glass), new ItemStack(Item.dyePowder, 1, 15-j)
			});
		}

		//Cheap Stained Glass
		for (int k = 0; k <= 15; k++)
		{
			GameRegistry.addRecipe(new ItemStack(InfiBlockContent.stainedGlass, 8, k), new Object[]
			{
				"ccc", "cdc", "ccc", 'c', new ItemStack(Block.glass), 
				'd', new ItemStack(Item.dyePowder, 1, 15-k)
			});
		}
		
		//Stained Glass Pane
		for (int k = 0; k <= 15; k++)
		{
			GameRegistry.addRecipe(new ItemStack(InfiBlockContent.stainedGlassPane, 16, k), new Object[]
			{
				"ccc", "ccc", 'c', new ItemStack(InfiBlockContent.stainedGlass, 1, k)
			});
		}
		
		ItemStack[] glassArray = {
			new ItemStack(InfiBlockContent.infiGlass, 1, 0),
			new ItemStack(InfiBlockContent.infiGlass, 1, 1),
			new ItemStack(InfiBlockContent.infiGlass, 1, 2)
		};
		
		//InfiGlass Pane
		for (int k = 0; k < glassArray.length; k++)
		{
			GameRegistry.addRecipe(new ItemStack(InfiBlockContent.infiGlassPane, 16, k), new Object[]
			{
				"ccc", "ccc", 'c', new ItemStack(InfiBlockContent.infiGlass, 1, k)
			});
		}

		GameRegistry.addRecipe(new ItemStack(Item.doorWood, 1), new Object[]
		{
			"PP", "PP", "PP", 'P', Block.cactus
		});
		GameRegistry.addRecipe(new ItemStack(Block.trapdoor, 2), new Object[]
		{
			"PPP", "PPP", 'P', Block.cactus
		});
		GameRegistry.addRecipe(new ItemStack(Block.chest, 1), new Object[]
		{
			"PPP", "P P", "PPP", 'P', Block.cactus
		});
		GameRegistry.addRecipe(new ItemStack(Item.bed, 1), new Object[]
		{
			"www", "ccc", 'w', new ItemStack(Block.cloth, 1, -1), 'c', Block.cactus
		});
		GameRegistry.addRecipe(new ItemStack(InfiBlockContent.chiselIron, 1), new Object[]
		{
			"i ", " w", 'w', Block.planks, 'i', Item.ingotIron
		});
		GameRegistry.addRecipe(new ItemStack(InfiBlockContent.chiselDiamond, 1), new Object[]
		{
			"i ", " w", 'w', Block.planks, 'i', Item.diamond
		});
		
		ItemStack[] storageArray = {
			new ItemStack(Item.coal, 1, 0), new ItemStack(Item.coal, 1, 1),
			new ItemStack(Item.redstone), new ItemStack(Item.slimeBall), 
			new ItemStack(Item.bone), new ItemStack(Item.wheat)
		};
		
		ItemStack[] storageArrayReverse = {
				new ItemStack(Item.coal, 9, 0), new ItemStack(Item.coal, 9, 1),
				new ItemStack(Item.redstone, 9), new ItemStack(Item.slimeBall, 9), 
				new ItemStack(Item.bone, 9), new ItemStack(Item.wheat, 9)
			};
		
		//Storage block recipes
		for (int iter = 0; iter < storageArray.length; iter++)
		{
			GameRegistry.addRecipe(new ItemStack(InfiBlockContent.storageBlock, 1, iter), new Object[]
			{
				"xxx", "xxx", "xxx", 'x', storageArray[iter]
			});
		}
		
		for (int iter = 0; iter < storageArray.length; iter++)
		{
			GameRegistry.addRecipe(storageArrayReverse[iter], new Object[]
			{
				"x", 'x', new ItemStack(InfiBlockContent.storageBlock, 1, iter)
			});
		}
		
		/* Chisel Recipes */
		
		DetailManager.getInstance().addDetailingItem(InfiBlockContent.chiselIron);
		DetailManager.getInstance().addDetailingItem(InfiBlockContent.chiselDiamond);
		
		//Diamond
		GameRegistry.addShapelessRecipe(new ItemStack(InfiBlockContent.brick, 1, 5), new Object[] {
			new ItemStack(InfiBlockContent.chiselIron, 1, -1), Item.diamond
		});
		GameRegistry.addShapelessRecipe(new ItemStack(InfiBlockContent.brick, 1, 5), new Object[] {
			new ItemStack(InfiBlockContent.chiselDiamond, 1, -1), Item.diamond
		});
		
		//Gold
		GameRegistry.addShapelessRecipe(new ItemStack(InfiBlockContent.brick, 1, 6), new Object[] {
			new ItemStack(InfiBlockContent.chiselIron, 1, -1), Item.ingotGold
		});
		GameRegistry.addShapelessRecipe(new ItemStack(InfiBlockContent.brick, 1, 6), new Object[] {
			new ItemStack(InfiBlockContent.chiselDiamond, 1, -1), Item.ingotGold
		});
		
		//Lapis
		GameRegistry.addShapelessRecipe(new ItemStack(InfiBlockContent.brick, 1, 7), new Object[] {
			new ItemStack(InfiBlockContent.chiselIron, 1, -1), new ItemStack(Item.dyePowder, 1, 4),
			new ItemStack(Item.dyePowder, 1, 4), new ItemStack(Item.dyePowder, 1, 4)
		});
		GameRegistry.addShapelessRecipe(new ItemStack(InfiBlockContent.brick, 1, 7), new Object[] {
			new ItemStack(InfiBlockContent.chiselDiamond, 1, -1), new ItemStack(Item.dyePowder, 1, 4),
			new ItemStack(Item.dyePowder, 1, 4), new ItemStack(Item.dyePowder, 1, 4)
		});
		
		//Iron
		GameRegistry.addShapelessRecipe(new ItemStack(InfiBlockContent.brick, 1, 12), new Object[] {
			new ItemStack(InfiBlockContent.chiselIron, 1, -1), Item.ingotIron
		});
		GameRegistry.addShapelessRecipe(new ItemStack(InfiBlockContent.brick, 1, 12), new Object[] {
			new ItemStack(InfiBlockContent.chiselDiamond, 1, -1), Item.ingotIron
		});

		//Redstone
		GameRegistry.addShapelessRecipe(new ItemStack(InfiBlockContent.brick, 1, 13), new Object[] {
			new ItemStack(InfiBlockContent.chiselIron, 1, -1), Item.redstone, Item.redstone,
			Item.redstone
		});
		GameRegistry.addShapelessRecipe(new ItemStack(InfiBlockContent.brick, 1, 13), new Object[] {
			new ItemStack(InfiBlockContent.chiselDiamond, 1, -1), Item.redstone, Item.redstone,
			Item.redstone
		});
		
		//Slime
		GameRegistry.addShapelessRecipe(new ItemStack(InfiBlockContent.brick, 1, 14), new Object[] {
			new ItemStack(InfiBlockContent.chiselIron, 1, -1), Item.slimeBall, Item.slimeBall, Item.slimeBall
		});
		GameRegistry.addShapelessRecipe(new ItemStack(InfiBlockContent.brick, 1, 14), new Object[] {
			new ItemStack(InfiBlockContent.chiselDiamond, 1, -1), Item.slimeBall, Item.slimeBall, Item.slimeBall
		});
		
		//Bone
		GameRegistry.addShapelessRecipe(new ItemStack(InfiBlockContent.brick, 1, 15), new Object[] {
			new ItemStack(InfiBlockContent.chiselIron, 1, -1), Item.bone, Item.bone, Item.bone
		});
		GameRegistry.addShapelessRecipe(new ItemStack(InfiBlockContent.brick, 1, 15), new Object[] {
			new ItemStack(InfiBlockContent.chiselDiamond, 1, -1), Item.bone, Item.bone, Item.bone
		});
	}
	
	public static void magicSlabFrenzy()
	{
		for (int iter = 0; iter < magicSlabStoneArray.length; iter++)
		{
			GameRegistry.addRecipe(new ItemStack(InfiBlockContent.magicSlabStone, 8, iter), new Object[]
			{
				" b ", "b b", " b ", 'b', magicSlabStoneArray[iter]
			});
		}
		
		for (int iter = 0; iter < magicSlabSoilArray.length; iter++)
		{
			GameRegistry.addRecipe(new ItemStack(InfiBlockContent.magicSlabSoil, 8, iter), new Object[]
			{
				" b ", "b b", " b ", 'b', magicSlabSoilArray[iter]
			});
		}
		
		for (int iter = 0; iter < 16; iter++)
		{
			GameRegistry.addRecipe(new ItemStack(InfiBlockContent.magicSlabWool, 8, iter), new Object[]
			{
				" b ", "b b", " b ", 'b', new ItemStack(Block.cloth, 1, iter)
			});
		}
		
		for (int k = 0; k <= 15; k++)
		{
			GameRegistry.addRecipe(new ItemStack(InfiBlockContent.stainedGlassMagicSlab, 8, k), new Object[]
			{
				" c ", "c c", " c ", 'c', new ItemStack(InfiBlockContent.stainedGlass, 1, k)
			});
		}
		
		for(int i = 0; i < 16; i++) {
			GameRegistry.addRecipe(new ItemStack(InfiBlockContent.brickMagicSlab, 8, i), new Object[]
			{
				" b ", "b b", " b ", 'b', new ItemStack(InfiBlockContent.brick, 1, i)
			});
		}
		
		for(int i = 0; i < 10; i++) {
			GameRegistry.addRecipe(new ItemStack(InfiBlockContent.fancyBrickMagicSlab, 8, i), new Object[]
			{
				" b ", "b b", " b ", 'b', new ItemStack(InfiBlockContent.fancyBrick, 1, i)
			});
		}
		
		for(int i = 11; i < 15; i++) {
			GameRegistry.addRecipe(new ItemStack(InfiBlockContent.fancyBrickMagicSlab, 8, i), new Object[]
			{
				" b ", "b b", " b ", 'b', new ItemStack(InfiBlockContent.fancyBrick, 1, i)
			});
		}
		
		for(int i = 0; i < 3; i++) {
			GameRegistry.addRecipe(new ItemStack(InfiBlockContent.infiGlassMagicSlab, 8, i), new Object[]
			{
				" b ", "b b", " b ", 'b', new ItemStack(InfiBlockContent.infiGlass, 1, i)
			});
		}
		
		for(int i = 0; i < 6; i++) {
			GameRegistry.addRecipe(new ItemStack(InfiBlockContent.brownstoneMagicSlab, 8, i), new Object[]
			{
				" b ", "b b", " b ", 'b', new ItemStack(InfiBlockContent.brownstone, 1, i)
			});
		}
		
		for(int i = 0; i < 3; i++) {
			GameRegistry.addRecipe(new ItemStack(InfiBlockContent.iceBrickMagicSlab, 8, i), new Object[]
			{
				" b ", "b b", " b ", 'b', new ItemStack(InfiBlockContent.iceBrick, 1, i)
			});
		}
		
		//Magic Slab Reversal
		for (int iter = 0; iter < magicSlabStoneArray.length; iter++)
		{
			GameRegistry.addRecipe(magicSlabStoneArray[iter], new Object[]
			{
				"c", "c", 'c', new ItemStack(InfiBlockContent.magicSlabStone, 1, iter)
			});
		}
		
		for (int iter = 0; iter < magicSlabSoilArray.length; iter++)
		{
			GameRegistry.addRecipe(magicSlabSoilArray[iter], new Object[]
			{
				"c", "c", 'c', new ItemStack(InfiBlockContent.magicSlabSoil, 1, iter)
			});
		}
		
		for (int iter = 0; iter < 16; iter++)
		{
			GameRegistry.addRecipe( new ItemStack(Block.cloth, 1, iter), new Object[]
			{
				"c", "c", 'c', new ItemStack(InfiBlockContent.magicSlabWool, 1, iter)
			});
		}
		
		for (int k = 0; k <= 15; k++)
		{
			GameRegistry.addRecipe(new ItemStack(InfiBlockContent.stainedGlass, 1, k), new Object[]
			{
				"c", "c", 'c', new ItemStack(InfiBlockContent.stainedGlassMagicSlab, 1, k)
			});
		}
			
		for(int i = 0; i < 16; i++) {
			GameRegistry.addRecipe(new ItemStack(InfiBlockContent.brick, 1, i), new Object[]
			{
				"c", "c", 'c', new ItemStack(InfiBlockContent.brickMagicSlab, 1, i)
			});
		}
		
		for(int i = 0; i < 10; i++) {
			GameRegistry.addRecipe(new ItemStack(InfiBlockContent.fancyBrick, 1, i), new Object[]
			{
				"c", "c", 'c', new ItemStack(InfiBlockContent.fancyBrickMagicSlab, 1, i)
			});
		}
		
		for(int i = 11; i < 15; i++) {
			GameRegistry.addRecipe(new ItemStack(InfiBlockContent.fancyBrick, 1, i), new Object[]
			{
				"c", "c", 'c', new ItemStack(InfiBlockContent.fancyBrickMagicSlab, 1, i)
			});
		}
		
		for(int i = 0; i < 3; i++) {
			GameRegistry.addRecipe(new ItemStack(InfiBlockContent.infiGlass, 1, i), new Object[]
			{
				"c", "c", 'c', new ItemStack(InfiBlockContent.infiGlassMagicSlab, 1, i)
			});
		}
		
		for(int i = 0; i < 6; i++) {
			GameRegistry.addRecipe(new ItemStack(InfiBlockContent.brownstone, 1, i), new Object[]
			{
				"c", "c", 'c', new ItemStack(InfiBlockContent.brownstoneMagicSlab, 1, i)
			});
		}
		
		for(int i = 0; i < 3; i++) {
			GameRegistry.addRecipe(new ItemStack(InfiBlockContent.iceBrickMagicSlab, 1, i), new Object[]
			{
				"c", "c", 'c', new ItemStack(InfiBlockContent.iceBrick, 1, i)
			});
		}
		
		//Slab dye
		for (int i = 0; i < 16; i++)
		{
			GameRegistry.addRecipe(new ItemStack(InfiBlockContent.magicSlabWool, 8, i), new Object[]
			{
				"bbb", "bxb", "bbb", 'b', new ItemStack(InfiBlockContent.magicSlabWool, 1, -1),
					'x', new ItemStack(Item.dyePowder, 1, 15-i)
			});
		}
		
		for (int i = 0; i <= 15; i++)
		{
			GameRegistry.addShapelessRecipe(new ItemStack(InfiBlockContent.magicSlabWool, 1, i), new Object[]
			{
				new ItemStack(InfiBlockContent.magicSlabWool, 1, -1), 
					new ItemStack(Item.dyePowder, 1, 15-i)
			});
		}
		
		for (int i = 0; i < 16; i++)
		{
			GameRegistry.addRecipe(new ItemStack(InfiBlockContent.stainedGlassMagicSlab, 8, i), new Object[]
			{
				"bbb", "bxb", "bbb", 'b', new ItemStack(InfiBlockContent.stainedGlassMagicSlab, 1, -1),
					'd', new ItemStack(Item.dyePowder, 1, 15-i)
			});
		}
		
		for (int i = 0; i <= 15; i++)
		{
			GameRegistry.addShapelessRecipe(new ItemStack(InfiBlockContent.stainedGlassMagicSlab, 1, i), new Object[]
			{
				new ItemStack(InfiBlockContent.stainedGlassMagicSlab, 1, -1), 
					new ItemStack(Item.dyePowder, 1, 15-i)
			});
		}
	}
	
	public static void redoVanillaRecipes()
	{
		//Override vanilla slab and stairs recipes
				/*removeRecipe(new ItemStack(Block.stairSingle, 3, 3));
				removeRecipe(new ItemStack(Block.stairSingle, 3, 0));
				removeRecipe(new ItemStack(Block.stairSingle, 3, 1));
				removeRecipe(new ItemStack(Block.stairSingle, 3, 2));
				removeRecipe(new ItemStack(Block.stairSingle, 3, 4));
				removeRecipe(new ItemStack(Block.stairSingle, 3, 5));*/
				
				removeRecipe(new ItemStack(Block.stairCompactPlanks, 4));
				removeRecipe(new ItemStack(Block.stairCompactCobblestone, 4));
				removeRecipe(new ItemStack(Block.stairsBrick, 4));
				removeRecipe(new ItemStack(Block.stairsStoneBrickSmooth, 4));
				removeRecipe(new ItemStack(Block.stairsNetherBrick, 4));
				
				removeRecipe(new ItemStack(Block.sandStone, 4, 2));
				GameRegistry.addRecipe(new ItemStack(Block.sandStone, 4, 2), new Object[]
				    { "##", "##", '#', new ItemStack(Block.sandStone, 4, 0) });
				
				/*GameRegistry.addRecipe(new ItemStack(Block.stairSingle, 6, 3), new Object[]
				{	
					"###", '#', Block.cobblestone
				});
				GameRegistry.addRecipe(new ItemStack(Block.stairSingle, 6, 0), new Object[]
				{
					"###", '#', Block.stone
				});
				GameRegistry.addRecipe(new ItemStack(Block.stairSingle, 6, 1), new Object[]
				{
					"###", '#', Block.sandStone
				});
				GameRegistry.addRecipe(new ItemStack(Block.stairSingle, 6, 2), new Object[]
				{
					"###", '#', Block.planks
				});
				GameRegistry.addRecipe(new ItemStack(Block.stairSingle, 6, 4), new Object[]
				{
					"###", '#', Block.brick
				});
				GameRegistry.addRecipe(new ItemStack(Block.stairSingle, 6, 5), new Object[]
				{
					"###", '#', Block.stoneBrick
				});*/
					
				GameRegistry.addRecipe(new ItemStack(Block.stairCompactPlanks, 6), new Object[]
				{
					"#  ", "## ", "###", '#', Block.planks
				});
				GameRegistry.addRecipe(new ItemStack(Block.stairCompactCobblestone, 6), new Object[]
				{
					"#  ", "## ", "###", '#', Block.cobblestone
				});
				GameRegistry.addRecipe(new ItemStack(Block.stairsBrick, 6), new Object[]
				{
					"#  ", "## ", "###", '#', Block.brick
				});
				GameRegistry.addRecipe(new ItemStack(Block.stairsStoneBrickSmooth, 6), new Object[]
				{
					"#  ", "## ", "###", '#', Block.stoneBrick
				});
				GameRegistry.addRecipe(new ItemStack(Block.stairsNetherBrick, 6), new Object[]
				{
					"#  ", "## ", "###", '#', Block.netherBrick
				});
	}
	
	public static void furnaceBlaze()
	{
		//FurnaceRecipes.smelting().addSmelting(Item.dyePowder.shiftedIndex, 2, new ItemStack(Item.coal, 1, 1));
		FurnaceRecipes.smelting().addSmelting(Block.netherrack.blockID, 
				new ItemStack(InfiBlockContent.storageBlock, 1, 12), 0.1F);
		FurnaceRecipes.smelting().addSmelting(Block.sandStone.blockID, 
				new ItemStack(InfiBlockContent.storageBlock, 1, 13), 0.5F);
		FurnaceRecipes.smelting().addSmelting(Block.stone.blockID, 
				new ItemStack(InfiBlockContent.storageBlock, 1, 14), 0.1F);
		FurnaceRecipes.smelting().addSmelting(Block.blockClay.blockID, 
				new ItemStack(InfiBlockContent.storageBlock, 1, 15), 0.8F);
		FurnaceRecipes.smelting().addSmelting(Block.gravel.blockID, 
				new ItemStack(InfiBlockContent.brownstone, 1, 0), 0.3F);
		FurnaceRecipes.smelting().addSmelting(InfiBlockContent.brownstone.blockID, 0,
				new ItemStack(InfiBlockContent.brownstone, 1, 1)); //TODO: 0.3F
		
		FurnaceRecipes.smelting().addSmelting(Block.glass.blockID,
				new ItemStack(InfiBlockContent.infiGlass, 1, 0), 0.1F);
		FurnaceRecipes.smelting().addSmelting(Block.slowSand.blockID,
				new ItemStack(InfiBlockContent.infiGlass, 1, 1), 0.8F);
		FurnaceRecipes.smelting().addSmelting(InfiBlockContent.infiGlass.blockID, 1,
				new ItemStack(InfiBlockContent.infiGlass, 1, 2)); //TODO: 0.8F
	}
	
	public static void initDetails()
	{
		DetailManager.getInstance().addDetailing(Block.stone, Block.stoneBrick); //Stone
		DetailManager.getInstance().addDetailing(Block.stoneBrick, InfiBlocks.getContentInstance().brick, 9);
		DetailManager.getInstance().addDetailing(InfiBlocks.getContentInstance().brick, 9, InfiBlocks.getContentInstance().fancyBrick, 9);
		DetailManager.getInstance().addDetailing(InfiBlocks.getContentInstance().fancyBrick, 9, Block.stoneBrick, 3);
		
		DetailManager.getInstance().addDetailing(Block.obsidian, InfiBlocks.getContentInstance().brick, 0); //Obsidian
		DetailManager.getInstance().addDetailing(InfiBlocks.getContentInstance().brick, 0, InfiBlocks.getContentInstance().fancyBrick, 0);
		
		DetailManager.getInstance().addDetailing(Block.blockSnow, InfiBlocks.getContentInstance().brick, 1); //Snow
		DetailManager.getInstance().addDetailing(InfiBlocks.getContentInstance().brick, 1, InfiBlocks.getContentInstance().fancyBrick, 1);
		
		DetailManager.getInstance().addDetailing(InfiBlocks.getContentInstance().storageBlock, 13, InfiBlocks.getContentInstance().brick, 2); //Sandstone
		DetailManager.getInstance().addDetailing(InfiBlocks.getContentInstance().brick, 2, InfiBlocks.getContentInstance().fancyBrick, 2);
		
		DetailManager.getInstance().addDetailing(InfiBlocks.getContentInstance().storageBlock, 15, InfiBlocks.getContentInstance().brick, 11); //Brick
		DetailManager.getInstance().addDetailing(InfiBlocks.getContentInstance().brick, 11, InfiBlocks.getContentInstance().brick, 3);
		DetailManager.getInstance().addDetailing(InfiBlocks.getContentInstance().brick, 3, InfiBlocks.getContentInstance().fancyBrick, 3);
		DetailManager.getInstance().addDetailing(InfiBlocks.getContentInstance().fancyBrick, 3, InfiBlocks.getContentInstance().fancyBrick, 11);
		
		DetailManager.getInstance().addDetailing(InfiBlocks.getContentInstance().storageBlock, 12, InfiBlocks.getContentInstance().brick, 4); //Netherrack
		DetailManager.getInstance().addDetailing(InfiBlocks.getContentInstance().brick, 4, InfiBlocks.getContentInstance().fancyBrick, 4);
		
		DetailManager.getInstance().addDetailing(InfiBlocks.getContentInstance().brick, 5, InfiBlocks.getContentInstance().fancyBrick, 5); //Diamond
		DetailManager.getInstance().addDetailing(InfiBlocks.getContentInstance().brick, 6, InfiBlocks.getContentInstance().fancyBrick, 6); //Gold
		DetailManager.getInstance().addDetailing(InfiBlocks.getContentInstance().brick, 7, InfiBlocks.getContentInstance().fancyBrick, 7); //Lapis
		
		DetailManager.getInstance().addDetailing(InfiBlocks.getContentInstance().storageBlock, 14, InfiBlocks.getContentInstance().brick, 8); //Refined Stone
		DetailManager.getInstance().addDetailing(InfiBlocks.getContentInstance().brick, 8, InfiBlocks.getContentInstance().brick, 10);
		DetailManager.getInstance().addDetailing(InfiBlocks.getContentInstance().brick, 10, InfiBlocks.getContentInstance().fancyBrick, 8);
		
		DetailManager.getInstance().addDetailing(Block.ice, 0, InfiBlocks.getContentInstance().iceBrick, 0); //Ice
		DetailManager.getInstance().addDetailing(InfiBlocks.getContentInstance().iceBrick, 0, InfiBlocks.getContentInstance().iceBrick, 1);
		DetailManager.getInstance().addDetailing(InfiBlocks.getContentInstance().iceBrick, 1, InfiBlocks.getContentInstance().iceBrick, 2);
		
		DetailManager.getInstance().addDetailing(InfiBlocks.getContentInstance().brownstone, 0, InfiBlocks.getContentInstance().brownstone, 2); //Brownstone
		DetailManager.getInstance().addDetailing(InfiBlocks.getContentInstance().brownstone, 1, InfiBlocks.getContentInstance().brownstone, 3);
		DetailManager.getInstance().addDetailing(InfiBlocks.getContentInstance().brownstone, 3, InfiBlocks.getContentInstance().brownstone, 4);
		DetailManager.getInstance().addDetailing(InfiBlocks.getContentInstance().brownstone, 4, InfiBlocks.getContentInstance().brownstone, 5);
	}
	
	//Code by yope_fried inspired by pigalot
	private static void removeRecipe(ItemStack resultItem) {
		List<IRecipe> recipes = CraftingManager.getInstance().getRecipeList();
		for (int i = 0; i < recipes.size(); i++) 
		{
			IRecipe tmpRecipe = recipes.get(i);
			if (tmpRecipe instanceof ShapedRecipes) {
				ShapedRecipes recipe = (ShapedRecipes)tmpRecipe;
				ItemStack recipeResult = recipe.getRecipeOutput();
			
				if (ItemStack.areItemStacksEqual(resultItem, recipeResult)) {
					recipes.remove(i--);
				}
			}
		}
	}
}
