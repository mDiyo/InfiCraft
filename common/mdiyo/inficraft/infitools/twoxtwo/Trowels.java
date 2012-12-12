package mDiyo.inficraft.infitools.twoxtwo;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import mDiyo.inficraft.infitools.core.PHInfiTools;
import mDiyo.inficraft.infitools.library.InfiLibrary;
import mDiyo.inficraft.infitools.library.InfiMaterialEnum;
import net.minecraft.src.Block;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;

public class Trowels
{
	public static Trowels instance = new Trowels();

	private static String[] recipe = { "#", "|" };

	public static Trowels getInstance()
	{
		return instance;
	}

	public static void init()
	{
		if (Infi2x2.infitoolsPresent)
		{
			createTools();
			addNames();
			registerInfiToolsRecipes();
			oreDictionarySupport();
		} else
		{
			createVanillaTools();
			registerVanillaRecipes();
		}
	}

	private static void oreDictionarySupport()
	{
		if (PHInfiTools.enableCopperTools)
		{
			addCopperTools("ingotCopper");
		}
		if (PHInfiTools.enableBronzeTools)
		{
			addBronzeTools("ingotBronze");
		}
		if (PHInfiTools.enableWorkedIronTools)
		{
			addWorkedIronTools("ingotRefinedIron");
		}
		if (PHInfiTools.enableSteelTools)
		{
			addSteelTools("ingotSteel");
		}
		if (PHInfiTools.enableCobaltTools)
		{
			addCobaltTools("ingotSteel");
		}
		if (PHInfiTools.enableArditeTools)
		{
			addArditeTools("ingotArdite");
		}
		if (PHInfiTools.enableManyullynTools)
		{
			addManyullynTools("ingotManyullyn");
		}
		if (PHInfiTools.enableUraniumTools)
		{
			addUraniumTools("ingotUranium");
		}
		if (PHInfiTools.enableStoneTools)
		{
			addStoneTools("customCobblestone");
			addStoneTools("customStone");
		}
	}

	private static void createVanillaTools()
	{
		woodWoodTrowel = new InfiToolTrowel(PropsHelperInfi2x2.woodTrowelID + 0, InfiMaterialEnum.Wood, InfiMaterialEnum.Wood, "woodWoodTrowel");
		woodStoneTrowel = new InfiToolTrowel(PropsHelperInfi2x2.stoneTrowelID + 0, InfiMaterialEnum.Stone, InfiMaterialEnum.Wood, "woodStoneTrowel");
		woodIronTrowel = new InfiToolTrowel(PropsHelperInfi2x2.ironTrowelID + 0, InfiMaterialEnum.Iron, InfiMaterialEnum.Wood, "woodIronTrowel");
		woodDiamondTrowel = new InfiToolTrowel(PropsHelperInfi2x2.diamondTrowelID + 0, InfiMaterialEnum.Diamond, InfiMaterialEnum.Wood, "woodDiamondTrowel");

		LanguageRegistry.instance().addName(woodWoodTrowel, "Wooden Trowel");
	}

	private static void registerVanillaRecipes()
	{
		GameRegistry.addRecipe(new ItemStack(woodWoodTrowel), recipe, '#', Block.planks, '|', Item.stick);
		GameRegistry.addRecipe(new ItemStack(woodStoneTrowel), recipe, '#', Block.cobblestone, '|', Item.stick);
		GameRegistry.addRecipe(new ItemStack(woodIronTrowel), recipe, '#', Item.ingotIron, '|', Item.stick);
		GameRegistry.addRecipe(new ItemStack(woodDiamondTrowel), recipe, '#', Item.diamond, '|', Item.stick);
	}

	private static void createTools()
	{
		if (PropsHelperInfi2x2.enableWoodTools)
		{
			woodWoodTrowel = new InfiToolTrowel(PropsHelperInfi2x2.woodTrowelID + 0, InfiMaterialEnum.Wood, InfiMaterialEnum.Wood, "woodWoodTrowel");
			sandstoneWoodTrowel = new InfiToolTrowel(PropsHelperInfi2x2.woodTrowelID + 1, InfiMaterialEnum.Wood, InfiMaterialEnum.Sandstone, "sandstoneWoodTrowel");
			boneWoodTrowel = new InfiToolTrowel(PropsHelperInfi2x2.woodTrowelID + 2, InfiMaterialEnum.Wood, InfiMaterialEnum.Bone, "boneWoodTrowel");
			paperWoodTrowel = new InfiToolTrowel(PropsHelperInfi2x2.woodTrowelID + 3, InfiMaterialEnum.Wood, InfiMaterialEnum.Paper, "paperWoodTrowel");
			iceWoodTrowel = new InfiToolTrowel(PropsHelperInfi2x2.woodTrowelID + 4, InfiMaterialEnum.Wood, InfiMaterialEnum.Ice, "iceWoodTrowel");
			slimeWoodTrowel = new InfiToolTrowel(PropsHelperInfi2x2.woodTrowelID + 5, InfiMaterialEnum.Wood, InfiMaterialEnum.Slime, "slimeWoodTrowel");
			cactusWoodTrowel = new InfiToolTrowel(PropsHelperInfi2x2.woodTrowelID + 6, InfiMaterialEnum.Wood, InfiMaterialEnum.Cactus, "cactusWoodTrowel");
		}

		if (PropsHelperInfi2x2.enableStoneTools)
		{
			woodStoneTrowel = new InfiToolTrowel(PropsHelperInfi2x2.stoneTrowelID + 0, InfiMaterialEnum.Stone, InfiMaterialEnum.Wood, "woodStoneTrowel");
			stoneStoneTrowel = new InfiToolTrowel(PropsHelperInfi2x2.stoneTrowelID + 1, InfiMaterialEnum.Stone, InfiMaterialEnum.Stone, "stoneStoneTrowel");
			sandstoneStoneTrowel = new InfiToolTrowel(PropsHelperInfi2x2.stoneTrowelID + 2, InfiMaterialEnum.Stone, InfiMaterialEnum.Sandstone, "sandstoneStoneTrowel");
			boneStoneTrowel = new InfiToolTrowel(PropsHelperInfi2x2.stoneTrowelID + 3, InfiMaterialEnum.Stone, InfiMaterialEnum.Bone, "boneStoneTrowel");
			netherrackStoneTrowel = new InfiToolTrowel(PropsHelperInfi2x2.stoneTrowelID + 4, InfiMaterialEnum.Stone, InfiMaterialEnum.Netherrack, "netherrackStoneTrowel");
			iceStoneTrowel = new InfiToolTrowel(PropsHelperInfi2x2.stoneTrowelID + 5, InfiMaterialEnum.Stone, InfiMaterialEnum.Ice, "iceStoneTrowel");
			slimeStoneTrowel = new InfiToolTrowel(PropsHelperInfi2x2.stoneTrowelID + 6, InfiMaterialEnum.Stone, InfiMaterialEnum.Slime, "slimeStoneTrowel");
			cactusStoneTrowel = new InfiToolTrowel(PropsHelperInfi2x2.stoneTrowelID + 7, InfiMaterialEnum.Stone, InfiMaterialEnum.Cactus, "cactusStoneTrowel");
			flintStoneTrowel = new InfiToolTrowel(PropsHelperInfi2x2.stoneTrowelID + 8, InfiMaterialEnum.Stone, InfiMaterialEnum.Flint, "flintStoneTrowel");
		}

		if (PropsHelperInfi2x2.enableIronTools)
		{
			woodIronTrowel = new InfiToolTrowel(PropsHelperInfi2x2.ironTrowelID + 0, InfiMaterialEnum.Iron, InfiMaterialEnum.Wood, "woodIronTrowel");
			stoneIronTrowel = new InfiToolTrowel(PropsHelperInfi2x2.ironTrowelID + 1, InfiMaterialEnum.Iron, InfiMaterialEnum.Stone, "stoneIronTrowel");
			ironIronTrowel = new InfiToolTrowel(PropsHelperInfi2x2.ironTrowelID + 2, InfiMaterialEnum.Iron, InfiMaterialEnum.Iron, "ironIronTrowel");
			boneIronTrowel = new InfiToolTrowel(PropsHelperInfi2x2.ironTrowelID + 3, InfiMaterialEnum.Iron, InfiMaterialEnum.Bone, "boneIronTrowel");
			netherrackIronTrowel = new InfiToolTrowel(PropsHelperInfi2x2.ironTrowelID + 4, InfiMaterialEnum.Iron, InfiMaterialEnum.Netherrack, "netherrackIronTrowel");
			glowstoneIronTrowel = new InfiToolTrowel(PropsHelperInfi2x2.ironTrowelID + 5, InfiMaterialEnum.Iron, InfiMaterialEnum.Glowstone, "glowstoneIronTrowel");
			cactusIronTrowel = new InfiToolTrowel(PropsHelperInfi2x2.ironTrowelID + 6, InfiMaterialEnum.Iron, InfiMaterialEnum.Cactus, "cactusIronTrowel");
			copperIronTrowel = new InfiToolTrowel(PropsHelperInfi2x2.ironTrowelID + 7, InfiMaterialEnum.Iron, InfiMaterialEnum.Copper, "copperIronTrowel");
			bronzeIronTrowel = new InfiToolTrowel(PropsHelperInfi2x2.ironTrowelID + 8, InfiMaterialEnum.Iron, InfiMaterialEnum.Bronze, "bronzeIronTrowel");
		}

		if (PropsHelperInfi2x2.enableDiamondTools)
		{
			woodDiamondTrowel = new InfiToolTrowel(PropsHelperInfi2x2.diamondTrowelID + 0, InfiMaterialEnum.Diamond, InfiMaterialEnum.Wood, "woodDiamondTrowel");
			stoneDiamondTrowel = new InfiToolTrowel(PropsHelperInfi2x2.diamondTrowelID + 1, InfiMaterialEnum.Diamond, InfiMaterialEnum.Stone, "stoneDiamondTrowel");
			ironDiamondTrowel = new InfiToolTrowel(PropsHelperInfi2x2.diamondTrowelID + 2, InfiMaterialEnum.Diamond, InfiMaterialEnum.Iron, "ironDiamondTrowel");
			diamondDiamondTrowel = new InfiToolTrowel(PropsHelperInfi2x2.diamondTrowelID + 3, InfiMaterialEnum.Diamond, InfiMaterialEnum.Diamond, "diamondDiamondTrowel");
			redstoneDiamondTrowel = new InfiToolTrowel(PropsHelperInfi2x2.diamondTrowelID + 4, InfiMaterialEnum.Diamond, InfiMaterialEnum.Redstone, "redstoneDiamondTrowel");
			obsidianDiamondTrowel = new InfiToolTrowel(PropsHelperInfi2x2.diamondTrowelID + 5, InfiMaterialEnum.Diamond, InfiMaterialEnum.Obsidian, "obsidianDiamondTrowel");
			boneDiamondTrowel = new InfiToolTrowel(PropsHelperInfi2x2.diamondTrowelID + 6, InfiMaterialEnum.Diamond, InfiMaterialEnum.Bone, "boneDiamondTrowel");
			mossyDiamondTrowel = new InfiToolTrowel(PropsHelperInfi2x2.diamondTrowelID + 7, InfiMaterialEnum.Diamond, InfiMaterialEnum.Mossy, "mossyDiamondTrowel");
			netherrackDiamondTrowel = new InfiToolTrowel(PropsHelperInfi2x2.diamondTrowelID + 8, InfiMaterialEnum.Diamond, InfiMaterialEnum.Netherrack, "netherrackDiamondTrowel");
			glowstoneDiamondTrowel = new InfiToolTrowel(PropsHelperInfi2x2.diamondTrowelID + 9, InfiMaterialEnum.Diamond, InfiMaterialEnum.Glowstone, "glowstoneDiamondTrowel");
			lavaDiamondTrowel = new InfiToolTrowel(PropsHelperInfi2x2.diamondTrowelID + 10, InfiMaterialEnum.Diamond, InfiMaterialEnum.Lava, "lavaDiamondTrowel");
			cactusDiamondTrowel = new InfiToolTrowel(PropsHelperInfi2x2.diamondTrowelID + 11, InfiMaterialEnum.Diamond, InfiMaterialEnum.Cactus, "cactusDiamondTrowel");
			flintDiamondTrowel = new InfiToolTrowel(PropsHelperInfi2x2.diamondTrowelID + 12, InfiMaterialEnum.Diamond, InfiMaterialEnum.Flint, "flintDiamondTrowel");
			blazeDiamondTrowel = new InfiToolTrowel(PropsHelperInfi2x2.diamondTrowelID + 13, InfiMaterialEnum.Diamond, InfiMaterialEnum.Blaze, "blazeDiamondTrowel");
			copperDiamondTrowel = new InfiToolTrowel(PropsHelperInfi2x2.diamondTrowelID + 14, InfiMaterialEnum.Diamond, InfiMaterialEnum.Copper, "copperDiamondTrowel");
			bronzeDiamondTrowel = new InfiToolTrowel(PropsHelperInfi2x2.diamondTrowelID + 15, InfiMaterialEnum.Diamond, InfiMaterialEnum.Bronze, "bronzeDiamondTrowel");
			workedDiamondTrowel = new InfiToolTrowel(PropsHelperInfi2x2.diamondTrowelID + 16, InfiMaterialEnum.Diamond, InfiMaterialEnum.WorkedIron, "workedDiamondTrowel");
			steelDiamondTrowel = new InfiToolTrowel(PropsHelperInfi2x2.diamondTrowelID + 17, InfiMaterialEnum.Diamond, InfiMaterialEnum.Steel, "steelDiamondTrowel");
			cobaltDiamondTrowel = new InfiToolTrowel(PropsHelperInfi2x2.diamondTrowelID + 18, InfiMaterialEnum.Diamond, InfiMaterialEnum.Cobalt, "cobaltDiamondTrowel");
			arditeDiamondTrowel = new InfiToolTrowel(PropsHelperInfi2x2.diamondTrowelID + 19, InfiMaterialEnum.Diamond, InfiMaterialEnum.Ardite, "arditeDiamondTrowel");
			manyullynDiamondTrowel = new InfiToolTrowel(PropsHelperInfi2x2.diamondTrowelID + 20, InfiMaterialEnum.Diamond, InfiMaterialEnum.Manyullyn, "manyullynDiamondTrowel");
			uraniumDiamondTrowel = new InfiToolTrowel(PropsHelperInfi2x2.diamondTrowelID + 21, InfiMaterialEnum.Diamond, InfiMaterialEnum.Uranium, "uraniumDiamondTrowel");
		}

		if (PropsHelperInfi2x2.enableRedstoneTools)
		{
			woodRedstoneTrowel = new InfiToolTrowel(PropsHelperInfi2x2.redstoneTrowelID + 0, InfiMaterialEnum.Redstone, InfiMaterialEnum.Wood, "woodRedstoneTrowel");
			stoneRedstoneTrowel = new InfiToolTrowel(PropsHelperInfi2x2.redstoneTrowelID + 1, InfiMaterialEnum.Redstone, InfiMaterialEnum.Stone, "stoneRedstoneTrowel");
			ironRedstoneTrowel = new InfiToolTrowel(PropsHelperInfi2x2.redstoneTrowelID + 2, InfiMaterialEnum.Redstone, InfiMaterialEnum.Iron, "ironRedstoneTrowel");
			redstoneRedstoneTrowel = new InfiToolTrowel(PropsHelperInfi2x2.redstoneTrowelID + 3, InfiMaterialEnum.Redstone, InfiMaterialEnum.Redstone, "redstoneRedstoneTrowel");
			obsidianRedstoneTrowel = new InfiToolTrowel(PropsHelperInfi2x2.redstoneTrowelID + 4, InfiMaterialEnum.Redstone, InfiMaterialEnum.Obsidian, "obsidianRedstoneTrowel");
			sandstoneRedstoneTrowel = new InfiToolTrowel(PropsHelperInfi2x2.redstoneTrowelID + 5, InfiMaterialEnum.Redstone, InfiMaterialEnum.Sandstone, "sandstoneRedstoneTrowel");
			boneRedstoneTrowel = new InfiToolTrowel(PropsHelperInfi2x2.redstoneTrowelID + 6, InfiMaterialEnum.Redstone, InfiMaterialEnum.Bone, "boneRedstoneTrowel");
			paperRedstoneTrowel = new InfiToolTrowel(PropsHelperInfi2x2.redstoneTrowelID + 7, InfiMaterialEnum.Redstone, InfiMaterialEnum.Paper, "paperRedstoneTrowel");
			mossyRedstoneTrowel = new InfiToolTrowel(PropsHelperInfi2x2.redstoneTrowelID + 8, InfiMaterialEnum.Redstone, InfiMaterialEnum.Mossy, "mossyRedstoneTrowel");
			netherrackRedstoneTrowel = new InfiToolTrowel(PropsHelperInfi2x2.redstoneTrowelID + 9, InfiMaterialEnum.Redstone, InfiMaterialEnum.Netherrack, "netherrackRedstoneTrowel");
			glowstoneRedstoneTrowel = new InfiToolTrowel(PropsHelperInfi2x2.redstoneTrowelID + 10, InfiMaterialEnum.Redstone, InfiMaterialEnum.Glowstone, "glowstoneRedstoneTrowel");
			iceRedstoneTrowel = new InfiToolTrowel(PropsHelperInfi2x2.redstoneTrowelID + 11, InfiMaterialEnum.Redstone, InfiMaterialEnum.Ice, "iceRedstoneTrowel");
			lavaRedstoneTrowel = new InfiToolTrowel(PropsHelperInfi2x2.redstoneTrowelID + 12, InfiMaterialEnum.Redstone, InfiMaterialEnum.Lava, "lavaRedstoneTrowel");
			slimeRedstoneTrowel = new InfiToolTrowel(PropsHelperInfi2x2.redstoneTrowelID + 13, InfiMaterialEnum.Redstone, InfiMaterialEnum.Slime, "slimeRedstoneTrowel");
			cactusRedstoneTrowel = new InfiToolTrowel(PropsHelperInfi2x2.redstoneTrowelID + 14, InfiMaterialEnum.Redstone, InfiMaterialEnum.Cactus, "cactusRedstoneTrowel");
			flintRedstoneTrowel = new InfiToolTrowel(PropsHelperInfi2x2.redstoneTrowelID + 15, InfiMaterialEnum.Redstone, InfiMaterialEnum.Flint, "flintRedstoneTrowel");
			copperRedstoneTrowel = new InfiToolTrowel(PropsHelperInfi2x2.redstoneTrowelID + 16, InfiMaterialEnum.Redstone, InfiMaterialEnum.Copper, "copperRedstoneTrowel");
			bronzeRedstoneTrowel = new InfiToolTrowel(PropsHelperInfi2x2.redstoneTrowelID + 17, InfiMaterialEnum.Redstone, InfiMaterialEnum.Bronze, "bronzeRedstoneTrowel");
			workedRedstoneTrowel = new InfiToolTrowel(PropsHelperInfi2x2.redstoneTrowelID + 18, InfiMaterialEnum.Redstone, InfiMaterialEnum.WorkedIron, "workedRedstoneTrowel");
			uraniumRedstoneTrowel = new InfiToolTrowel(PropsHelperInfi2x2.redstoneTrowelID + 19, InfiMaterialEnum.Redstone, InfiMaterialEnum.Uranium, "uraniumRedstoneTrowel");
		}

		if (PropsHelperInfi2x2.enableObsidianTools)
		{
			woodObsidianTrowel = new InfiToolTrowel(PropsHelperInfi2x2.obsidianTrowelID + 0, InfiMaterialEnum.Obsidian, InfiMaterialEnum.Wood, "woodObsidianTrowel");
			stoneObsidianTrowel = new InfiToolTrowel(PropsHelperInfi2x2.obsidianTrowelID + 1, InfiMaterialEnum.Obsidian, InfiMaterialEnum.Stone, "stoneObsidianTrowel");
			redstoneObsidianTrowel = new InfiToolTrowel(PropsHelperInfi2x2.obsidianTrowelID + 2, InfiMaterialEnum.Obsidian, InfiMaterialEnum.Redstone, "redstoneObsidianTrowel");
			obsidianObsidianTrowel = new InfiToolTrowel(PropsHelperInfi2x2.obsidianTrowelID + 3, InfiMaterialEnum.Obsidian, InfiMaterialEnum.Obsidian, "obsidianObsidianTrowel");
			;
			boneObsidianTrowel = new InfiToolTrowel(PropsHelperInfi2x2.obsidianTrowelID + 4, InfiMaterialEnum.Obsidian, InfiMaterialEnum.Bone, "boneObsidianTrowel");
			netherrackObsidianTrowel = new InfiToolTrowel(PropsHelperInfi2x2.obsidianTrowelID + 5, InfiMaterialEnum.Obsidian, InfiMaterialEnum.Netherrack, "netherrackObsidianTrowel");
			glowstoneObsidianTrowel = new InfiToolTrowel(PropsHelperInfi2x2.obsidianTrowelID + 6, InfiMaterialEnum.Obsidian, InfiMaterialEnum.Glowstone, "glowstoneObsidianTrowel");
			iceObsidianTrowel = new InfiToolTrowel(PropsHelperInfi2x2.obsidianTrowelID + 7, InfiMaterialEnum.Obsidian, InfiMaterialEnum.Ice, "iceObsidianTrowel");
			lavaObsidianTrowel = new InfiToolTrowel(PropsHelperInfi2x2.obsidianTrowelID + 8, InfiMaterialEnum.Obsidian, InfiMaterialEnum.Lava, "lavaObsidianTrowel");
			cactusObsidianTrowel = new InfiToolTrowel(PropsHelperInfi2x2.obsidianTrowelID + 9, InfiMaterialEnum.Obsidian, InfiMaterialEnum.Cactus, "cactusObsidianTrowel");
		}

		if (PropsHelperInfi2x2.enableSandstoneTools)
		{
			woodSandstoneTrowel = new InfiToolTrowel(PropsHelperInfi2x2.sandstoneTrowelID + 0, InfiMaterialEnum.Sandstone, InfiMaterialEnum.Wood, "woodSandstoneTrowel");
			sandstoneSandstoneTrowel = new InfiToolTrowel(PropsHelperInfi2x2.sandstoneTrowelID + 1, InfiMaterialEnum.Sandstone, InfiMaterialEnum.Sandstone, "sandstoneSandstoneTrowel");
			boneSandstoneTrowel = new InfiToolTrowel(PropsHelperInfi2x2.sandstoneTrowelID + 2, InfiMaterialEnum.Sandstone, InfiMaterialEnum.Bone, "boneSandstoneTrowel");
			netherrackSandstoneTrowel = new InfiToolTrowel(PropsHelperInfi2x2.sandstoneTrowelID + 3, InfiMaterialEnum.Sandstone, InfiMaterialEnum.Netherrack, "netherrackSandstoneTrowel");
			iceSandstoneTrowel = new InfiToolTrowel(PropsHelperInfi2x2.sandstoneTrowelID + 4, InfiMaterialEnum.Sandstone, InfiMaterialEnum.Ice, "iceSandstoneTrowel");
			slimeSandstoneTrowel = new InfiToolTrowel(PropsHelperInfi2x2.sandstoneTrowelID + 5, InfiMaterialEnum.Sandstone, InfiMaterialEnum.Slime, "slimeSandstoneTrowel");
			cactusSandstoneTrowel = new InfiToolTrowel(PropsHelperInfi2x2.sandstoneTrowelID + 6, InfiMaterialEnum.Sandstone, InfiMaterialEnum.Cactus, "cactusSandstoneTrowel");
			flintSandstoneTrowel = new InfiToolTrowel(PropsHelperInfi2x2.sandstoneTrowelID + 7, InfiMaterialEnum.Sandstone, InfiMaterialEnum.Flint, "flintSandstoneTrowel");
		}

		if (PropsHelperInfi2x2.enableBoneTools)
		{
			woodBoneTrowel = new InfiToolTrowel(PropsHelperInfi2x2.boneTrowelID + 0, InfiMaterialEnum.Bone, InfiMaterialEnum.Bone, "woodBoneTrowel");
			stoneBoneTrowel = new InfiToolTrowel(PropsHelperInfi2x2.boneTrowelID + 1, InfiMaterialEnum.Bone, InfiMaterialEnum.Stone, "stoneBoneTrowel");
			sandstoneBoneTrowel = new InfiToolTrowel(PropsHelperInfi2x2.boneTrowelID + 2, InfiMaterialEnum.Bone, InfiMaterialEnum.Sandstone, "sandstoneBoneTrowel");
			boneBoneTrowel = new InfiToolTrowel(PropsHelperInfi2x2.boneTrowelID + 3, InfiMaterialEnum.Bone, InfiMaterialEnum.Bone, "boneBoneTrowel");
			paperBoneTrowel = new InfiToolTrowel(PropsHelperInfi2x2.boneTrowelID + 4, InfiMaterialEnum.Bone, InfiMaterialEnum.Paper, "paperBoneTrowel");
			netherrackBoneTrowel = new InfiToolTrowel(PropsHelperInfi2x2.boneTrowelID + 5, InfiMaterialEnum.Bone, InfiMaterialEnum.Netherrack, "netherrackBoneTrowel");
			iceBoneTrowel = new InfiToolTrowel(PropsHelperInfi2x2.boneTrowelID + 6, InfiMaterialEnum.Bone, InfiMaterialEnum.Ice, "iceBoneTrowel");
			cactusBoneTrowel = new InfiToolTrowel(PropsHelperInfi2x2.boneTrowelID + 7, InfiMaterialEnum.Bone, InfiMaterialEnum.Cactus, "cactusBoneTrowel");
			flintBoneTrowel = new InfiToolTrowel(PropsHelperInfi2x2.boneTrowelID + 8, InfiMaterialEnum.Bone, InfiMaterialEnum.Flint, "flintBoneTrowel");
		}

		if (PropsHelperInfi2x2.enablePaperTools)
		{
			woodPaperTrowel = new InfiToolTrowel(PropsHelperInfi2x2.paperTrowelID + 0, InfiMaterialEnum.Paper, InfiMaterialEnum.Wood, "woodPaperTrowel");
			bonePaperTrowel = new InfiToolTrowel(PropsHelperInfi2x2.paperTrowelID + 1, InfiMaterialEnum.Paper, InfiMaterialEnum.Bone, "bonePaperTrowel");
			paperPaperTrowel = new InfiToolTrowel(PropsHelperInfi2x2.paperTrowelID + 2, InfiMaterialEnum.Paper, InfiMaterialEnum.Paper, "paperPaperTrowel");
			slimePaperTrowel = new InfiToolTrowel(PropsHelperInfi2x2.paperTrowelID + 3, InfiMaterialEnum.Paper, InfiMaterialEnum.Slime, "slimePaperTrowel");
			cactusPaperTrowel = new InfiToolTrowel(PropsHelperInfi2x2.paperTrowelID + 4, InfiMaterialEnum.Paper, InfiMaterialEnum.Cactus, "cactusPaperTrowel");
		}

		if (PropsHelperInfi2x2.enableMossyTools)
		{
			woodMossyTrowel = new InfiToolTrowel(PropsHelperInfi2x2.mossyTrowelID + 0, InfiMaterialEnum.Mossy, InfiMaterialEnum.Wood, "woodMossyTrowel");
			stoneMossyTrowel = new InfiToolTrowel(PropsHelperInfi2x2.mossyTrowelID + 1, InfiMaterialEnum.Mossy, InfiMaterialEnum.Stone, "stoneMossyTrowel");
			diamondMossyTrowel = new InfiToolTrowel(PropsHelperInfi2x2.mossyTrowelID + 2, InfiMaterialEnum.Mossy, InfiMaterialEnum.Diamond, "diamondMossyTrowel");
			redstoneMossyTrowel = new InfiToolTrowel(PropsHelperInfi2x2.mossyTrowelID + 3, InfiMaterialEnum.Mossy, InfiMaterialEnum.Redstone, "redstoneMossyTrowel");
			boneMossyTrowel = new InfiToolTrowel(PropsHelperInfi2x2.mossyTrowelID + 4, InfiMaterialEnum.Mossy, InfiMaterialEnum.Bone, "boneMossyTrowel");
			mossyMossyTrowel = new InfiToolTrowel(PropsHelperInfi2x2.mossyTrowelID + 5, InfiMaterialEnum.Mossy, InfiMaterialEnum.Mossy, "mossyMossyTrowel");
			netherrackMossyTrowel = new InfiToolTrowel(PropsHelperInfi2x2.mossyTrowelID + 6, InfiMaterialEnum.Mossy, InfiMaterialEnum.Netherrack, "netherrackMossyTrowel");
			glowstoneMossyTrowel = new InfiToolTrowel(PropsHelperInfi2x2.mossyTrowelID + 7, InfiMaterialEnum.Mossy, InfiMaterialEnum.Glowstone, "glowstoneMossyTrowel");
			cactusMossyTrowel = new InfiToolTrowel(PropsHelperInfi2x2.mossyTrowelID + 8, InfiMaterialEnum.Mossy, InfiMaterialEnum.Cactus, "cactusMossyTrowel");
			blazeMossyTrowel = new InfiToolTrowel(PropsHelperInfi2x2.mossyTrowelID + 9, InfiMaterialEnum.Mossy, InfiMaterialEnum.Blaze, "blazeMossyTrowel");
			manyullynMossyTrowel = new InfiToolTrowel(PropsHelperInfi2x2.mossyTrowelID + 10, InfiMaterialEnum.Mossy, InfiMaterialEnum.Manyullyn, "manyullynMossyTrowel");
			uraniumMossyTrowel = new InfiToolTrowel(PropsHelperInfi2x2.mossyTrowelID + 11, InfiMaterialEnum.Mossy, InfiMaterialEnum.Uranium, "uraniumMossyTrowel");
		}

		if (PropsHelperInfi2x2.enableNetherrackTools)
		{
			woodNetherrackTrowel = new InfiToolTrowel(PropsHelperInfi2x2.netherrackTrowelID + 0, InfiMaterialEnum.Netherrack, InfiMaterialEnum.Wood, "woodNetherrackTrowel");
			stoneNetherrackTrowel = new InfiToolTrowel(PropsHelperInfi2x2.netherrackTrowelID + 1, InfiMaterialEnum.Netherrack, InfiMaterialEnum.Stone, "stoneNetherrackTrowel");
			sandstoneNetherrackTrowel = new InfiToolTrowel(PropsHelperInfi2x2.netherrackTrowelID + 2, InfiMaterialEnum.Netherrack, InfiMaterialEnum.Sandstone, "sandstoneNetherrackTrowel");
			boneNetherrackTrowel = new InfiToolTrowel(PropsHelperInfi2x2.netherrackTrowelID + 3, InfiMaterialEnum.Netherrack, InfiMaterialEnum.Bone, "boneNetherrackTrowel");
			paperNetherrackTrowel = new InfiToolTrowel(PropsHelperInfi2x2.netherrackTrowelID + 4, InfiMaterialEnum.Netherrack, InfiMaterialEnum.Paper, "paperNetherrackTrowel");
			mossyNetherrackTrowel = new InfiToolTrowel(PropsHelperInfi2x2.netherrackTrowelID + 5, InfiMaterialEnum.Netherrack, InfiMaterialEnum.Mossy, "mossyNetherrackTrowel");
			netherrackNetherrackTrowel = new InfiToolTrowel(PropsHelperInfi2x2.netherrackTrowelID + 6, InfiMaterialEnum.Netherrack, InfiMaterialEnum.Netherrack, "netherrackNetherrackTrowel");
			iceNetherrackTrowel = new InfiToolTrowel(PropsHelperInfi2x2.netherrackTrowelID + 7, InfiMaterialEnum.Netherrack, InfiMaterialEnum.Ice, "iceNetherrackTrowel");
			slimeNetherrackTrowel = new InfiToolTrowel(PropsHelperInfi2x2.netherrackTrowelID + 8, InfiMaterialEnum.Netherrack, InfiMaterialEnum.Slime, "slimeNetherrackTrowel");
			cactusNetherrackTrowel = new InfiToolTrowel(PropsHelperInfi2x2.netherrackTrowelID + 9, InfiMaterialEnum.Netherrack, InfiMaterialEnum.Cactus, "cactusNetherrackTrowel");
			flintNetherrackTrowel = new InfiToolTrowel(PropsHelperInfi2x2.netherrackTrowelID + 10, InfiMaterialEnum.Netherrack, InfiMaterialEnum.Flint, "flintNetherrackTrowel");
			copperNetherrackTrowel = new InfiToolTrowel(PropsHelperInfi2x2.netherrackTrowelID + 11, InfiMaterialEnum.Netherrack, InfiMaterialEnum.Copper, "copperNetherrackTrowel");
			bronzeNetherrackTrowel = new InfiToolTrowel(PropsHelperInfi2x2.netherrackTrowelID + 12, InfiMaterialEnum.Netherrack, InfiMaterialEnum.Bronze, "bronzeNetherrackTrowel");

		}

		if (PropsHelperInfi2x2.enableGlowstoneTools)
		{
			woodGlowstoneTrowel = new InfiToolTrowel(PropsHelperInfi2x2.glowstoneTrowelID + 0, InfiMaterialEnum.Glowstone, InfiMaterialEnum.Wood, "woodGlowstoneTrowel");
			redstoneGlowstoneTrowel = new InfiToolTrowel(PropsHelperInfi2x2.glowstoneTrowelID + 1, InfiMaterialEnum.Glowstone, InfiMaterialEnum.Redstone, "redstoneGlowstoneTrowel");
			obsidianGlowstoneTrowel = new InfiToolTrowel(PropsHelperInfi2x2.glowstoneTrowelID + 2, InfiMaterialEnum.Glowstone, InfiMaterialEnum.Obsidian, "obsidianGlowstoneTrowel");
			boneGlowstoneTrowel = new InfiToolTrowel(PropsHelperInfi2x2.glowstoneTrowelID + 3, InfiMaterialEnum.Glowstone, InfiMaterialEnum.Bone, "boneGlowstoneTrowel");
			netherrackGlowstoneTrowel = new InfiToolTrowel(PropsHelperInfi2x2.glowstoneTrowelID + 4, InfiMaterialEnum.Glowstone, InfiMaterialEnum.Netherrack, "netherrackGlowstoneTrowel");
			glowstoneGlowstoneTrowel = new InfiToolTrowel(PropsHelperInfi2x2.glowstoneTrowelID + 5, InfiMaterialEnum.Glowstone, InfiMaterialEnum.Glowstone, "glowstoneGlowstoneTrowel");
			iceGlowstoneTrowel = new InfiToolTrowel(PropsHelperInfi2x2.glowstoneTrowelID + 6, InfiMaterialEnum.Glowstone, InfiMaterialEnum.Ice, "iceGlowstoneTrowel");
			slimeGlowstoneTrowel = new InfiToolTrowel(PropsHelperInfi2x2.glowstoneTrowelID + 7, InfiMaterialEnum.Glowstone, InfiMaterialEnum.Slime, "slimeGlowstoneTrowel");
			cactusGlowstoneTrowel = new InfiToolTrowel(PropsHelperInfi2x2.glowstoneTrowelID + 8, InfiMaterialEnum.Glowstone, InfiMaterialEnum.Cactus, "cactusGlowstoneTrowel");

		}

		if (PropsHelperInfi2x2.enableIceTools)
		{
			woodIceTrowel = new InfiToolTrowel(PropsHelperInfi2x2.iceTrowelID + 0, InfiMaterialEnum.Ice, InfiMaterialEnum.Wood, "woodIceTrowel");
			boneIceTrowel = new InfiToolTrowel(PropsHelperInfi2x2.iceTrowelID + 1, InfiMaterialEnum.Ice, InfiMaterialEnum.Bone, "boneIceTrowel");
			paperIceTrowel = new InfiToolTrowel(PropsHelperInfi2x2.iceTrowelID + 2, InfiMaterialEnum.Ice, InfiMaterialEnum.Paper, "paperIceTrowel");
			iceIceTrowel = new InfiToolTrowel(PropsHelperInfi2x2.iceTrowelID + 3, InfiMaterialEnum.Ice, InfiMaterialEnum.Ice, "iceIceTrowel");
			slimeIceTrowel = new InfiToolTrowel(PropsHelperInfi2x2.iceTrowelID + 4, InfiMaterialEnum.Ice, InfiMaterialEnum.Slime, "slimeIceTrowel");
			cactusIceTrowel = new InfiToolTrowel(PropsHelperInfi2x2.iceTrowelID + 5, InfiMaterialEnum.Ice, InfiMaterialEnum.Cactus, "cactusIceTrowel");

		}

		if (PropsHelperInfi2x2.enableLavaTools)
		{
			diamondLavaTrowel = new InfiToolTrowel(PropsHelperInfi2x2.lavaTrowelID + 0, InfiMaterialEnum.Lava, InfiMaterialEnum.Diamond, "diamondLavaTrowel");
			obsidianLavaTrowel = new InfiToolTrowel(PropsHelperInfi2x2.lavaTrowelID + 1, InfiMaterialEnum.Lava, InfiMaterialEnum.Obsidian, "obsidianLavaTrowel");
			netherrackLavaTrowel = new InfiToolTrowel(PropsHelperInfi2x2.lavaTrowelID + 2, InfiMaterialEnum.Lava, InfiMaterialEnum.Netherrack, "netherrackLavaTrowel");
			lavaLavaTrowel = new InfiToolTrowel(PropsHelperInfi2x2.lavaTrowelID + 3, InfiMaterialEnum.Lava, InfiMaterialEnum.Lava, "lavaLavaTrowel");
			flintLavaTrowel = new InfiToolTrowel(PropsHelperInfi2x2.lavaTrowelID + 4, InfiMaterialEnum.Lava, InfiMaterialEnum.Flint, "flintLavaTrowel");
			blazeLavaTrowel = new InfiToolTrowel(PropsHelperInfi2x2.lavaTrowelID + 5, InfiMaterialEnum.Lava, InfiMaterialEnum.Blaze, "blazeLavaTrowel");
			manyullynLavaTrowel = new InfiToolTrowel(PropsHelperInfi2x2.lavaTrowelID + 6, InfiMaterialEnum.Lava, InfiMaterialEnum.Manyullyn, "manyullynLavaTrowel");
			uraniumLavaTrowel = new InfiToolTrowel(PropsHelperInfi2x2.lavaTrowelID + 7, InfiMaterialEnum.Lava, InfiMaterialEnum.Uranium, "uraniumLavaTrowel");

		}

		if (PropsHelperInfi2x2.enableSlimeTools)
		{
			woodSlimeTrowel = new InfiToolTrowel(PropsHelperInfi2x2.slimeTrowelID + 0, InfiMaterialEnum.Slime, InfiMaterialEnum.Wood, "woodSlimeTrowel");
			sandstoneSlimeTrowel = new InfiToolTrowel(PropsHelperInfi2x2.slimeTrowelID + 1, InfiMaterialEnum.Slime, InfiMaterialEnum.Sandstone, "sandstoneSlimeTrowel");
			boneSlimeTrowel = new InfiToolTrowel(PropsHelperInfi2x2.slimeTrowelID + 2, InfiMaterialEnum.Slime, InfiMaterialEnum.Bone, "boneSlimeTrowel");
			paperSlimeTrowel = new InfiToolTrowel(PropsHelperInfi2x2.slimeTrowelID + 3, InfiMaterialEnum.Slime, InfiMaterialEnum.Paper, "paperSlimeTrowel");
			slimeSlimeTrowel = new InfiToolTrowel(PropsHelperInfi2x2.slimeTrowelID + 4, InfiMaterialEnum.Slime, InfiMaterialEnum.Slime, "slimeSlimeTrowel");
			cactusSlimeTrowel = new InfiToolTrowel(PropsHelperInfi2x2.slimeTrowelID + 5, InfiMaterialEnum.Slime, InfiMaterialEnum.Cactus, "cactusSlimeTrowel");

		}

		if (PropsHelperInfi2x2.enableCactusTools)
		{
			woodCactusTrowel = new InfiToolTrowel(PropsHelperInfi2x2.cactusTrowelID + 0, InfiMaterialEnum.Cactus, InfiMaterialEnum.Wood, "woodCactusTrowel");
			sandstoneCactusTrowel = new InfiToolTrowel(PropsHelperInfi2x2.cactusTrowelID + 1, InfiMaterialEnum.Cactus, InfiMaterialEnum.Sandstone, "sandstoneCactusTrowel");
			boneCactusTrowel = new InfiToolTrowel(PropsHelperInfi2x2.cactusTrowelID + 2, InfiMaterialEnum.Cactus, InfiMaterialEnum.Bone, "boneCactusTrowel");
			netherrackCactusTrowel = new InfiToolTrowel(PropsHelperInfi2x2.cactusTrowelID + 3, InfiMaterialEnum.Cactus, InfiMaterialEnum.Netherrack, "netherrackCactusTrowel");
			iceCactusTrowel = new InfiToolTrowel(PropsHelperInfi2x2.cactusTrowelID + 4, InfiMaterialEnum.Cactus, InfiMaterialEnum.Ice, "iceCactusTrowel");
			slimeCactusTrowel = new InfiToolTrowel(PropsHelperInfi2x2.cactusTrowelID + 5, InfiMaterialEnum.Cactus, InfiMaterialEnum.Slime, "slimeCactusTrowel");
			cactusCactusTrowel = new InfiToolTrowel(PropsHelperInfi2x2.cactusTrowelID + 6, InfiMaterialEnum.Cactus, InfiMaterialEnum.Cactus, "cactusCactusTrowel");

		}

		if (PropsHelperInfi2x2.enableFlintTools)
		{
			woodFlintTrowel = new InfiToolTrowel(PropsHelperInfi2x2.flintTrowelID + 0, InfiMaterialEnum.Flint, InfiMaterialEnum.Wood, "woodFlintTrowel");
			stoneFlintTrowel = new InfiToolTrowel(PropsHelperInfi2x2.flintTrowelID + 1, InfiMaterialEnum.Flint, InfiMaterialEnum.Stone, "stoneFlintTrowel");
			sandstoneFlintTrowel = new InfiToolTrowel(PropsHelperInfi2x2.flintTrowelID + 2, InfiMaterialEnum.Flint, InfiMaterialEnum.Sandstone, "sandstoneFlintTrowel");
			boneFlintTrowel = new InfiToolTrowel(PropsHelperInfi2x2.flintTrowelID + 3, InfiMaterialEnum.Flint, InfiMaterialEnum.Bone, "boneFlintTrowel");
			netherrackFlintTrowel = new InfiToolTrowel(PropsHelperInfi2x2.flintTrowelID + 4, InfiMaterialEnum.Flint, InfiMaterialEnum.Flint, "netherrackFlintTrowel");
			slimeFlintTrowel = new InfiToolTrowel(PropsHelperInfi2x2.flintTrowelID + 5, InfiMaterialEnum.Flint, InfiMaterialEnum.Slime, "slimeFlintTrowel");
			cactusFlintTrowel = new InfiToolTrowel(PropsHelperInfi2x2.flintTrowelID + 6, InfiMaterialEnum.Flint, InfiMaterialEnum.Cactus, "cactusFlintTrowel");
			flintFlintTrowel = new InfiToolTrowel(PropsHelperInfi2x2.flintTrowelID + 7, InfiMaterialEnum.Flint, InfiMaterialEnum.Flint, "flintFlintTrowel");
			copperFlintTrowel = new InfiToolTrowel(PropsHelperInfi2x2.flintTrowelID + 8, InfiMaterialEnum.Flint, InfiMaterialEnum.Copper, "copperFlintTrowel");
			bronzeFlintTrowel = new InfiToolTrowel(PropsHelperInfi2x2.flintTrowelID + 9, InfiMaterialEnum.Flint, InfiMaterialEnum.Bronze, "bronzeFlintTrowel");

		}

		if (PropsHelperInfi2x2.enableBlazeTools)
		{
			diamondBlazeTrowel = new InfiToolTrowel(PropsHelperInfi2x2.blazeTrowelID + 0, InfiMaterialEnum.Blaze, InfiMaterialEnum.Diamond, "diamondBlazeTrowel");
			obsidianBlazeTrowel = new InfiToolTrowel(PropsHelperInfi2x2.blazeTrowelID + 1, InfiMaterialEnum.Blaze, InfiMaterialEnum.Obsidian, "obsidianBlazeTrowel");
			netherrackBlazeTrowel = new InfiToolTrowel(PropsHelperInfi2x2.blazeTrowelID + 2, InfiMaterialEnum.Blaze, InfiMaterialEnum.Netherrack, "netherrackBlazeTrowel");
			lavaBlazeTrowel = new InfiToolTrowel(PropsHelperInfi2x2.blazeTrowelID + 3, InfiMaterialEnum.Blaze, InfiMaterialEnum.Lava, "lavaBlazeTrowel");
			flintBlazeTrowel = new InfiToolTrowel(PropsHelperInfi2x2.blazeTrowelID + 4, InfiMaterialEnum.Blaze, InfiMaterialEnum.Flint, "flintBlazeTrowel");
			blazeBlazeTrowel = new InfiToolTrowel(PropsHelperInfi2x2.blazeTrowelID + 5, InfiMaterialEnum.Blaze, InfiMaterialEnum.Blaze, "blazeBlazeTrowel");
			manyullynBlazeTrowel = new InfiToolTrowel(PropsHelperInfi2x2.blazeTrowelID + 6, InfiMaterialEnum.Blaze, InfiMaterialEnum.Manyullyn, "manyullynBlazeTrowel");
			uraniumBlazeTrowel = new InfiToolTrowel(PropsHelperInfi2x2.blazeTrowelID + 7, InfiMaterialEnum.Blaze, InfiMaterialEnum.Uranium, "uraniumBlazeTrowel");

		}

		if (PropsHelperInfi2x2.enableCopperTools)
		{
			woodCopperTrowel = new InfiToolTrowel(PropsHelperInfi2x2.copperTrowelID + 0, InfiMaterialEnum.Copper, InfiMaterialEnum.Wood, "woodCopperTrowel");
			stoneCopperTrowel = new InfiToolTrowel(PropsHelperInfi2x2.copperTrowelID + 1, InfiMaterialEnum.Copper, InfiMaterialEnum.Stone, "stoneCopperTrowel");
			boneCopperTrowel = new InfiToolTrowel(PropsHelperInfi2x2.copperTrowelID + 2, InfiMaterialEnum.Copper, InfiMaterialEnum.Bone, "boneCopperTrowel");
			netherrackCopperTrowel = new InfiToolTrowel(PropsHelperInfi2x2.copperTrowelID + 3, InfiMaterialEnum.Copper, InfiMaterialEnum.Netherrack, "netherrackCopperTrowel");
			slimeCopperTrowel = new InfiToolTrowel(PropsHelperInfi2x2.copperTrowelID + 4, InfiMaterialEnum.Copper, InfiMaterialEnum.Slime, "slimeCopperTrowel");
			cactusCopperTrowel = new InfiToolTrowel(PropsHelperInfi2x2.copperTrowelID + 5, InfiMaterialEnum.Copper, InfiMaterialEnum.Cactus, "cactusCopperTrowel");
			flintCopperTrowel = new InfiToolTrowel(PropsHelperInfi2x2.copperTrowelID + 6, InfiMaterialEnum.Copper, InfiMaterialEnum.Flint, "flintCopperTrowel");
			copperCopperTrowel = new InfiToolTrowel(PropsHelperInfi2x2.copperTrowelID + 7, InfiMaterialEnum.Copper, InfiMaterialEnum.Copper, "copperCopperTrowel");

		}

		if (PropsHelperInfi2x2.enableBronzeTools)
		{
			woodBronzeTrowel = new InfiToolTrowel(PropsHelperInfi2x2.bronzeTrowelID + 0, InfiMaterialEnum.Bronze, InfiMaterialEnum.Wood, "woodBronzeTrowel");
			stoneBronzeTrowel = new InfiToolTrowel(PropsHelperInfi2x2.bronzeTrowelID + 1, InfiMaterialEnum.Bronze, InfiMaterialEnum.Stone, "stoneBronzeTrowel");
			boneBronzeTrowel = new InfiToolTrowel(PropsHelperInfi2x2.bronzeTrowelID + 2, InfiMaterialEnum.Bronze, InfiMaterialEnum.Bone, "boneBronzeTrowel");
			netherrackBronzeTrowel = new InfiToolTrowel(PropsHelperInfi2x2.bronzeTrowelID + 3, InfiMaterialEnum.Bronze, InfiMaterialEnum.Netherrack, "netherrackBronzeTrowel");
			slimeBronzeTrowel = new InfiToolTrowel(PropsHelperInfi2x2.bronzeTrowelID + 4, InfiMaterialEnum.Bronze, InfiMaterialEnum.Slime, "slimeBronzeTrowel");
			cactusBronzeTrowel = new InfiToolTrowel(PropsHelperInfi2x2.bronzeTrowelID + 5, InfiMaterialEnum.Bronze, InfiMaterialEnum.Cactus, "cactusBronzeTrowel");
			flintBronzeTrowel = new InfiToolTrowel(PropsHelperInfi2x2.bronzeTrowelID + 6, InfiMaterialEnum.Bronze, InfiMaterialEnum.Flint, "flintBronzeTrowel");
			copperBronzeTrowel = new InfiToolTrowel(PropsHelperInfi2x2.bronzeTrowelID + 7, InfiMaterialEnum.Bronze, InfiMaterialEnum.Copper, "copperBronzeTrowel");
			bronzeBronzeTrowel = new InfiToolTrowel(PropsHelperInfi2x2.bronzeTrowelID + 8, InfiMaterialEnum.Bronze, InfiMaterialEnum.Bronze, "bronzeBronzeTrowel");
		}

		if (PropsHelperInfi2x2.enableWorkedIronTools)
		{
			woodWorkedIronTrowel = new InfiToolTrowel(PropsHelperInfi2x2.workedIronTrowelID + 0, InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Wood, "woodWorkedIronTrowel");
			stoneWorkedIronTrowel = new InfiToolTrowel(PropsHelperInfi2x2.workedIronTrowelID + 1, InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Stone, "stoneWorkedIronTrowel");
			ironWorkedIronTrowel = new InfiToolTrowel(PropsHelperInfi2x2.workedIronTrowelID + 2, InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Iron, "ironWorkedIronTrowel");
			diamondWorkedIronTrowel = new InfiToolTrowel(PropsHelperInfi2x2.workedIronTrowelID + 3, InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Diamond, "diamondWorkedIronTrowel");
			redstoneWorkedIronTrowel = new InfiToolTrowel(PropsHelperInfi2x2.workedIronTrowelID + 4, InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Redstone, "redstoneWorkedIronTrowel");
			obsidianWorkedIronTrowel = new InfiToolTrowel(PropsHelperInfi2x2.workedIronTrowelID + 5, InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Obsidian, "obsidianWorkedIronTrowel");
			boneWorkedIronTrowel = new InfiToolTrowel(PropsHelperInfi2x2.workedIronTrowelID + 6, InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Bone, "boneWorkedIronTrowel");
			netherrackWorkedIronTrowel = new InfiToolTrowel(PropsHelperInfi2x2.workedIronTrowelID + 7, InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Netherrack, "netherrackWorkedIronTrowel");
			glowstoneWorkedIronTrowel = new InfiToolTrowel(PropsHelperInfi2x2.workedIronTrowelID + 8, InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Glowstone, "glowstoneWorkedIronTrowel");
			iceWorkedIronTrowel = new InfiToolTrowel(PropsHelperInfi2x2.workedIronTrowelID + 9, InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Ice, "iceWorkedIronTrowel");
			slimeWorkedIronTrowel = new InfiToolTrowel(PropsHelperInfi2x2.workedIronTrowelID + 10, InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Slime, "slimeWorkedIronTrowel");
			cactusWorkedIronTrowel = new InfiToolTrowel(PropsHelperInfi2x2.workedIronTrowelID + 11, InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Cactus, "cactusWorkedIronTrowel");
			blazeWorkedIronTrowel = new InfiToolTrowel(PropsHelperInfi2x2.workedIronTrowelID + 12, InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Blaze, "blazeWorkedIronTrowel");
			copperWorkedIronTrowel = new InfiToolTrowel(PropsHelperInfi2x2.workedIronTrowelID + 13, InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Copper, "copperWorkedIronTrowel");
			bronzeWorkedIronTrowel = new InfiToolTrowel(PropsHelperInfi2x2.workedIronTrowelID + 14, InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Bronze, "bronzeWorkedIronTrowel");
			workedWorkedIronTrowel = new InfiToolTrowel(PropsHelperInfi2x2.workedIronTrowelID + 15, InfiMaterialEnum.WorkedIron, InfiMaterialEnum.WorkedIron, "workedWorkedIronTrowel");
			steelWorkedIronTrowel = new InfiToolTrowel(PropsHelperInfi2x2.workedIronTrowelID + 16, InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Steel, "steelWorkedIronTrowel");
			uraniumWorkedIronTrowel = new InfiToolTrowel(PropsHelperInfi2x2.workedIronTrowelID + 17, InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Bronze, "uraniumWorkedIronTrowel");

		}

		if (PropsHelperInfi2x2.enableSteelTools)
		{
			woodSteelTrowel = new InfiToolTrowel(PropsHelperInfi2x2.steelTrowelID + 0, InfiMaterialEnum.Steel, InfiMaterialEnum.Wood, "woodSteelTrowel");
			stoneSteelTrowel = new InfiToolTrowel(PropsHelperInfi2x2.steelTrowelID + 1, InfiMaterialEnum.Steel, InfiMaterialEnum.Stone, "stoneSteelTrowel");
			ironSteelTrowel = new InfiToolTrowel(PropsHelperInfi2x2.steelTrowelID + 2, InfiMaterialEnum.Steel, InfiMaterialEnum.Iron, "ironSteelTrowel");
			diamondSteelTrowel = new InfiToolTrowel(PropsHelperInfi2x2.steelTrowelID + 3, InfiMaterialEnum.Steel, InfiMaterialEnum.Diamond, "diamondSteelTrowel");
			redstoneSteelTrowel = new InfiToolTrowel(PropsHelperInfi2x2.steelTrowelID + 4, InfiMaterialEnum.Steel, InfiMaterialEnum.Redstone, "redstoneSteelTrowel");
			obsidianSteelTrowel = new InfiToolTrowel(PropsHelperInfi2x2.steelTrowelID + 5, InfiMaterialEnum.Steel, InfiMaterialEnum.Obsidian, "obsidianSteelTrowel");
			boneSteelTrowel = new InfiToolTrowel(PropsHelperInfi2x2.steelTrowelID + 6, InfiMaterialEnum.Steel, InfiMaterialEnum.Bone, "boneSteelTrowel");
			netherrackSteelTrowel = new InfiToolTrowel(PropsHelperInfi2x2.steelTrowelID + 7, InfiMaterialEnum.Steel, InfiMaterialEnum.Netherrack, "netherrackSteelTrowel");
			glowstoneSteelTrowel = new InfiToolTrowel(PropsHelperInfi2x2.steelTrowelID + 8, InfiMaterialEnum.Steel, InfiMaterialEnum.Glowstone, "glowstoneSteelTrowel");
			iceSteelTrowel = new InfiToolTrowel(PropsHelperInfi2x2.steelTrowelID + 9, InfiMaterialEnum.Steel, InfiMaterialEnum.Ice, "iceSteelTrowel");
			slimeSteelTrowel = new InfiToolTrowel(PropsHelperInfi2x2.steelTrowelID + 10, InfiMaterialEnum.Steel, InfiMaterialEnum.Slime, "slimeSteelTrowel");
			cactusSteelTrowel = new InfiToolTrowel(PropsHelperInfi2x2.steelTrowelID + 11, InfiMaterialEnum.Steel, InfiMaterialEnum.Cactus, "cactusSteelTrowel");
			blazeSteelTrowel = new InfiToolTrowel(PropsHelperInfi2x2.steelTrowelID + 12, InfiMaterialEnum.Steel, InfiMaterialEnum.Blaze, "blazeSteelTrowel");
			copperSteelTrowel = new InfiToolTrowel(PropsHelperInfi2x2.steelTrowelID + 13, InfiMaterialEnum.Steel, InfiMaterialEnum.Copper, "copperSteelTrowel");
			bronzeSteelTrowel = new InfiToolTrowel(PropsHelperInfi2x2.steelTrowelID + 14, InfiMaterialEnum.Steel, InfiMaterialEnum.Bronze, "bronzeSteelTrowel");
			workedSteelTrowel = new InfiToolTrowel(PropsHelperInfi2x2.steelTrowelID + 15, InfiMaterialEnum.Steel, InfiMaterialEnum.WorkedIron, "workedSteelTrowel");
			steelSteelTrowel = new InfiToolTrowel(PropsHelperInfi2x2.steelTrowelID + 16, InfiMaterialEnum.Steel, InfiMaterialEnum.Steel, "steelSteelTrowel");
			cobaltSteelTrowel = new InfiToolTrowel(PropsHelperInfi2x2.steelTrowelID + 17, InfiMaterialEnum.Steel, InfiMaterialEnum.Cobalt, "cobaltSteelTrowel");
			arditeSteelTrowel = new InfiToolTrowel(PropsHelperInfi2x2.steelTrowelID + 18, InfiMaterialEnum.Steel, InfiMaterialEnum.Ardite, "arditeSteelTrowel");
			uraniumSteelTrowel = new InfiToolTrowel(PropsHelperInfi2x2.steelTrowelID + 19, InfiMaterialEnum.Steel, InfiMaterialEnum.Bronze, "uraniumSteelTrowel");

		}

		if (PropsHelperInfi2x2.enableCobaltTools)
		{
			woodCobaltTrowel = new InfiToolTrowel(PropsHelperInfi2x2.cobaltTrowelID + 0, InfiMaterialEnum.Cobalt, InfiMaterialEnum.Wood, "woodCobaltTrowel");
			stoneCobaltTrowel = new InfiToolTrowel(PropsHelperInfi2x2.cobaltTrowelID + 1, InfiMaterialEnum.Cobalt, InfiMaterialEnum.Stone, "stoneCobaltTrowel");
			ironCobaltTrowel = new InfiToolTrowel(PropsHelperInfi2x2.cobaltTrowelID + 2, InfiMaterialEnum.Cobalt, InfiMaterialEnum.Iron, "ironCobaltTrowel");
			diamondCobaltTrowel = new InfiToolTrowel(PropsHelperInfi2x2.cobaltTrowelID + 3, InfiMaterialEnum.Cobalt, InfiMaterialEnum.Diamond, "diamondCobaltTrowel");
			redstoneCobaltTrowel = new InfiToolTrowel(PropsHelperInfi2x2.cobaltTrowelID + 4, InfiMaterialEnum.Cobalt, InfiMaterialEnum.Redstone, "redstoneCobaltTrowel");
			obsidianCobaltTrowel = new InfiToolTrowel(PropsHelperInfi2x2.cobaltTrowelID + 5, InfiMaterialEnum.Cobalt, InfiMaterialEnum.Obsidian, "obsidianCobaltTrowel");
			boneCobaltTrowel = new InfiToolTrowel(PropsHelperInfi2x2.cobaltTrowelID + 6, InfiMaterialEnum.Cobalt, InfiMaterialEnum.Bone, "boneCobaltTrowel");
			slimeCobaltTrowel = new InfiToolTrowel(PropsHelperInfi2x2.cobaltTrowelID + 7, InfiMaterialEnum.Cobalt, InfiMaterialEnum.Slime, "slimeCobaltTrowel");
			cactusCobaltTrowel = new InfiToolTrowel(PropsHelperInfi2x2.cobaltTrowelID + 8, InfiMaterialEnum.Cobalt, InfiMaterialEnum.Cactus, "cactusCobaltTrowel");
			blazeCobaltTrowel = new InfiToolTrowel(PropsHelperInfi2x2.cobaltTrowelID + 9, InfiMaterialEnum.Cobalt, InfiMaterialEnum.Blaze, "blazeCobaltTrowel");
			copperCobaltTrowel = new InfiToolTrowel(PropsHelperInfi2x2.cobaltTrowelID + 10, InfiMaterialEnum.Cobalt, InfiMaterialEnum.Copper, "copperCobaltTrowel");
			bronzeCobaltTrowel = new InfiToolTrowel(PropsHelperInfi2x2.cobaltTrowelID + 11, InfiMaterialEnum.Cobalt, InfiMaterialEnum.Bronze, "bronzeCobaltTrowel");
			workedCobaltTrowel = new InfiToolTrowel(PropsHelperInfi2x2.cobaltTrowelID + 12, InfiMaterialEnum.Cobalt, InfiMaterialEnum.WorkedIron, "workedCobaltTrowel");
			steelCobaltTrowel = new InfiToolTrowel(PropsHelperInfi2x2.cobaltTrowelID + 13, InfiMaterialEnum.Cobalt, InfiMaterialEnum.Steel, "steelCobaltTrowel");
			cobaltCobaltTrowel = new InfiToolTrowel(PropsHelperInfi2x2.cobaltTrowelID + 14, InfiMaterialEnum.Cobalt, InfiMaterialEnum.Cobalt, "cobaltCobaltTrowel");
			arditeCobaltTrowel = new InfiToolTrowel(PropsHelperInfi2x2.cobaltTrowelID + 15, InfiMaterialEnum.Cobalt, InfiMaterialEnum.Ardite, "arditeCobaltTrowel");
			manyullynCobaltTrowel = new InfiToolTrowel(PropsHelperInfi2x2.cobaltTrowelID + 16, InfiMaterialEnum.Cobalt, InfiMaterialEnum.Manyullyn, "manyullynCobaltTrowel");
			uraniumCobaltTrowel = new InfiToolTrowel(PropsHelperInfi2x2.cobaltTrowelID + 17, InfiMaterialEnum.Cobalt, InfiMaterialEnum.Bronze, "uraniumCobaltTrowel");
		}

		if (PropsHelperInfi2x2.enableArditeTools)
		{
			woodArditeTrowel = new InfiToolTrowel(PropsHelperInfi2x2.arditeTrowelID + 0, InfiMaterialEnum.Ardite, InfiMaterialEnum.Wood, "woodArditeTrowel");
			stoneArditeTrowel = new InfiToolTrowel(PropsHelperInfi2x2.arditeTrowelID + 1, InfiMaterialEnum.Ardite, InfiMaterialEnum.Stone, "stoneArditeTrowel");
			ironArditeTrowel = new InfiToolTrowel(PropsHelperInfi2x2.arditeTrowelID + 2, InfiMaterialEnum.Ardite, InfiMaterialEnum.Iron, "ironArditeTrowel");
			diamondArditeTrowel = new InfiToolTrowel(PropsHelperInfi2x2.arditeTrowelID + 3, InfiMaterialEnum.Ardite, InfiMaterialEnum.Diamond, "diamondArditeTrowel");
			redstoneArditeTrowel = new InfiToolTrowel(PropsHelperInfi2x2.arditeTrowelID + 4, InfiMaterialEnum.Ardite, InfiMaterialEnum.Redstone, "redstoneArditeTrowel");
			obsidianArditeTrowel = new InfiToolTrowel(PropsHelperInfi2x2.arditeTrowelID + 5, InfiMaterialEnum.Ardite, InfiMaterialEnum.Obsidian, "obsidianArditeTrowel");
			boneArditeTrowel = new InfiToolTrowel(PropsHelperInfi2x2.arditeTrowelID + 6, InfiMaterialEnum.Ardite, InfiMaterialEnum.Bone, "boneArditeTrowel");
			slimeArditeTrowel = new InfiToolTrowel(PropsHelperInfi2x2.arditeTrowelID + 7, InfiMaterialEnum.Ardite, InfiMaterialEnum.Slime, "slimeArditeTrowel");
			cactusArditeTrowel = new InfiToolTrowel(PropsHelperInfi2x2.arditeTrowelID + 8, InfiMaterialEnum.Ardite, InfiMaterialEnum.Cactus, "cactusArditeTrowel");
			blazeArditeTrowel = new InfiToolTrowel(PropsHelperInfi2x2.arditeTrowelID + 9, InfiMaterialEnum.Ardite, InfiMaterialEnum.Blaze, "blazeArditeTrowel");
			copperArditeTrowel = new InfiToolTrowel(PropsHelperInfi2x2.arditeTrowelID + 10, InfiMaterialEnum.Ardite, InfiMaterialEnum.Copper, "copperArditeTrowel");
			bronzeArditeTrowel = new InfiToolTrowel(PropsHelperInfi2x2.arditeTrowelID + 11, InfiMaterialEnum.Ardite, InfiMaterialEnum.Bronze, "bronzeArditeTrowel");
			workedArditeTrowel = new InfiToolTrowel(PropsHelperInfi2x2.arditeTrowelID + 12, InfiMaterialEnum.Ardite, InfiMaterialEnum.WorkedIron, "workedArditeTrowel");
			steelArditeTrowel = new InfiToolTrowel(PropsHelperInfi2x2.arditeTrowelID + 13, InfiMaterialEnum.Ardite, InfiMaterialEnum.Steel, "steelArditeTrowel");
			cobaltArditeTrowel = new InfiToolTrowel(PropsHelperInfi2x2.arditeTrowelID + 14, InfiMaterialEnum.Ardite, InfiMaterialEnum.Cobalt, "cobaltArditeTrowel");
			arditeArditeTrowel = new InfiToolTrowel(PropsHelperInfi2x2.arditeTrowelID + 15, InfiMaterialEnum.Ardite, InfiMaterialEnum.Ardite, "arditeArditeTrowel");
			manyullynArditeTrowel = new InfiToolTrowel(PropsHelperInfi2x2.arditeTrowelID + 16, InfiMaterialEnum.Ardite, InfiMaterialEnum.Manyullyn, "manyullynArditeTrowel");
			uraniumArditeTrowel = new InfiToolTrowel(PropsHelperInfi2x2.arditeTrowelID + 17, InfiMaterialEnum.Ardite, InfiMaterialEnum.Bronze, "uraniumArditeTrowel");
		}

		if (PropsHelperInfi2x2.enableManyullynTools)
		{
			woodManyullynTrowel = new InfiToolTrowel(PropsHelperInfi2x2.manyullynTrowelID + 0, InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Stone, "woodManyullynTrowel");
			stoneManyullynTrowel = new InfiToolTrowel(PropsHelperInfi2x2.manyullynTrowelID + 1, InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Stone, "stoneManyullynTrowel");
			ironManyullynTrowel = new InfiToolTrowel(PropsHelperInfi2x2.manyullynTrowelID + 2, InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Iron, "ironManyullynTrowel");
			diamondManyullynTrowel = new InfiToolTrowel(PropsHelperInfi2x2.manyullynTrowelID + 3, InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Diamond, "diamondManyullynTrowel");
			redstoneManyullynTrowel = new InfiToolTrowel(PropsHelperInfi2x2.manyullynTrowelID + 4, InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Redstone, "redstoneManyullynTrowel");
			obsidianManyullynTrowel = new InfiToolTrowel(PropsHelperInfi2x2.manyullynTrowelID + 5, InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Obsidian, "obsidianManyullynTrowel");
			boneManyullynTrowel = new InfiToolTrowel(PropsHelperInfi2x2.manyullynTrowelID + 6, InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Bone, "boneManyullynTrowel");
			slimeManyullynTrowel = new InfiToolTrowel(PropsHelperInfi2x2.manyullynTrowelID + 7, InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Slime, "slimeManyullynTrowel");
			cactusManyullynTrowel = new InfiToolTrowel(PropsHelperInfi2x2.manyullynTrowelID + 8, InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Cactus, "cactusManyullynTrowel");
			blazeManyullynTrowel = new InfiToolTrowel(PropsHelperInfi2x2.manyullynTrowelID + 9, InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Blaze, "blazeManyullynTrowel");
			copperManyullynTrowel = new InfiToolTrowel(PropsHelperInfi2x2.manyullynTrowelID + 10, InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Copper, "copperManyullynTrowel");
			bronzeManyullynTrowel = new InfiToolTrowel(PropsHelperInfi2x2.manyullynTrowelID + 11, InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Bronze, "bronzeManyullynTrowel");
			workedManyullynTrowel = new InfiToolTrowel(PropsHelperInfi2x2.manyullynTrowelID + 12, InfiMaterialEnum.Manyullyn, InfiMaterialEnum.WorkedIron, "workedManyullynTrowel");
			steelManyullynTrowel = new InfiToolTrowel(PropsHelperInfi2x2.manyullynTrowelID + 13, InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Steel, "steelManyullynTrowel");
			cobaltManyullynTrowel = new InfiToolTrowel(PropsHelperInfi2x2.manyullynTrowelID + 14, InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Cobalt, "cobaltManyullynTrowel");
			arditeManyullynTrowel = new InfiToolTrowel(PropsHelperInfi2x2.manyullynTrowelID + 15, InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Ardite, "arditeManyullynTrowel");
			manyullynManyullynTrowel = new InfiToolTrowel(PropsHelperInfi2x2.manyullynTrowelID + 16, InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Manyullyn, "manyullynManyullynTrowel");
			uraniumManyullynTrowel = new InfiToolTrowel(PropsHelperInfi2x2.manyullynTrowelID + 17, InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Bronze, "uraniumManyullynTrowel");
		}

		if (PropsHelperInfi2x2.enableUraniumTools)
		{
			diamondUraniumTrowel = new InfiToolTrowel(PropsHelperInfi2x2.uraniumTrowelID + 0, InfiMaterialEnum.Uranium, InfiMaterialEnum.Diamond, "diamondUraniumTrowel");
			redstoneUraniumTrowel = new InfiToolTrowel(PropsHelperInfi2x2.uraniumTrowelID + 1, InfiMaterialEnum.Uranium, InfiMaterialEnum.Redstone, "redstoneUraniumTrowel");
			boneUraniumTrowel = new InfiToolTrowel(PropsHelperInfi2x2.uraniumTrowelID + 2, InfiMaterialEnum.Uranium, InfiMaterialEnum.Bone, "boneUraniumTrowel");
			netherrackUraniumTrowel = new InfiToolTrowel(PropsHelperInfi2x2.uraniumTrowelID + 3, InfiMaterialEnum.Uranium, InfiMaterialEnum.Netherrack, "netherrackUraniumTrowel");
			glowstoneUraniumTrowel = new InfiToolTrowel(PropsHelperInfi2x2.uraniumTrowelID + 4, InfiMaterialEnum.Uranium, InfiMaterialEnum.Glowstone, "glowstoneUraniumTrowel");
			lavaUraniumTrowel = new InfiToolTrowel(PropsHelperInfi2x2.uraniumTrowelID + 5, InfiMaterialEnum.Uranium, InfiMaterialEnum.Lava, "lavaUraniumTrowel");
			blazeUraniumTrowel = new InfiToolTrowel(PropsHelperInfi2x2.uraniumTrowelID + 6, InfiMaterialEnum.Uranium, InfiMaterialEnum.Blaze, "blazeUraniumTrowel");
			cobaltUraniumTrowel = new InfiToolTrowel(PropsHelperInfi2x2.uraniumTrowelID + 7, InfiMaterialEnum.Uranium, InfiMaterialEnum.Cobalt, "cobaltUraniumTrowel");
			arditeUraniumTrowel = new InfiToolTrowel(PropsHelperInfi2x2.uraniumTrowelID + 8, InfiMaterialEnum.Uranium, InfiMaterialEnum.Ardite, "arditeUraniumTrowel");
			uraniumUraniumTrowel = new InfiToolTrowel(PropsHelperInfi2x2.uraniumTrowelID + 9, InfiMaterialEnum.Uranium, InfiMaterialEnum.Uranium, "uraniumUraniumTrowel");
		}
	}

	private static void addNames()
	{
		if (PropsHelperInfi2x2.enableWoodTools)
			LanguageRegistry.instance().addName(woodWoodTrowel, "Wooden Trowel");
		if (PropsHelperInfi2x2.enableStoneTools)
			LanguageRegistry.instance().addName(stoneStoneTrowel, "Heavy Trowel");
		if (PropsHelperInfi2x2.enableIronTools)
			LanguageRegistry.instance().addName(ironIronTrowel, "Ironic Trowel");
		if (PropsHelperInfi2x2.enableDiamondTools)
			LanguageRegistry.instance().addName(diamondDiamondTrowel, "Diamondium Trowel");
		if (PropsHelperInfi2x2.enableRedstoneTools)
			LanguageRegistry.instance().addName(redstoneRedstoneTrowel, "Redredred Trowel");
		if (PropsHelperInfi2x2.enableObsidianTools)
			LanguageRegistry.instance().addName(obsidianObsidianTrowel, "Ebony Trowel");
		if (PropsHelperInfi2x2.enableSandstoneTools)
			LanguageRegistry.instance().addName(sandstoneSandstoneTrowel, "Fragile Trowel");
		if (PropsHelperInfi2x2.enableNetherrackTools)
			LanguageRegistry.instance().addName(boneBoneTrowel, "Necrotic Trowel");
		if (PropsHelperInfi2x2.enablePaperTools)
			LanguageRegistry.instance().addName(paperPaperTrowel, "Soft Trowel");
		if (PropsHelperInfi2x2.enableMossyTools)
			LanguageRegistry.instance().addName(mossyMossyTrowel, "Living Trowel");
		if (PropsHelperInfi2x2.enableNetherrackTools)
			LanguageRegistry.instance().addName(netherrackNetherrackTrowel, "Bloodsoaked Trowel");
		if (PropsHelperInfi2x2.enableGlowstoneTools)
			LanguageRegistry.instance().addName(glowstoneGlowstoneTrowel, "Bright Trowel");
		if (PropsHelperInfi2x2.enableIceTools)
			LanguageRegistry.instance().addName(iceIceTrowel, "Freezing Trowel");
		if (PropsHelperInfi2x2.enableLavaTools)
			LanguageRegistry.instance().addName(lavaLavaTrowel, "Burning Trowel");
		if (PropsHelperInfi2x2.enableSlimeTools)
			LanguageRegistry.instance().addName(slimeSlimeTrowel, "Toy Trowel");
		if (PropsHelperInfi2x2.enableCactusTools)
			LanguageRegistry.instance().addName(cactusCactusTrowel, "Thorned Trowel");
		if (PropsHelperInfi2x2.enableFlintTools)
			LanguageRegistry.instance().addName(flintFlintTrowel, "Rough-hewn Trowel");
		if (PropsHelperInfi2x2.enableBlazeTools)
			LanguageRegistry.instance().addName(blazeBlazeTrowel, "Netherite Trowel");
		if (PropsHelperInfi2x2.enableCopperTools)
			LanguageRegistry.instance().addName(copperCopperTrowel, "Orange-Tang Trowel");
		if (PropsHelperInfi2x2.enableBronzeTools)
			LanguageRegistry.instance().addName(bronzeBronzeTrowel, "Polished Trowel");
		if (PropsHelperInfi2x2.enableWorkedIronTools)
			LanguageRegistry.instance().addName(workedWorkedIronTrowel, "Reworked Iron Trowel");
		if (PropsHelperInfi2x2.enableSteelTools)
			LanguageRegistry.instance().addName(steelSteelTrowel, "Forge-Wrought Trowel");
		if (PropsHelperInfi2x2.enableCobaltTools)
			LanguageRegistry.instance().addName(cobaltCobaltTrowel, "Beautiful Trowel");
		if (PropsHelperInfi2x2.enableArditeTools)
			LanguageRegistry.instance().addName(arditeArditeTrowel, "Rustic Trowel");
		if (PropsHelperInfi2x2.enableManyullynTools)
			LanguageRegistry.instance().addName(manyullynManyullynTrowel, "False-Prophetic Trowel");
		if (PropsHelperInfi2x2.enableUraniumTools)
			LanguageRegistry.instance().addName(uraniumUraniumTrowel, "Cancerous Trowel");
	}

	public static void registerInfiToolsRecipes()
	{
		if (PropsHelperInfi2x2.enableWoodTools)
		{
			GameRegistry.addRecipe(new ItemStack(woodWoodTrowel), recipe, '#', Block.planks, '|', Item.stick);
			GameRegistry.addRecipe(new ItemStack(sandstoneWoodTrowel), recipe, '#', Block.planks, '|', InfiLibrary.sandstoneRod);
			GameRegistry.addRecipe(new ItemStack(boneWoodTrowel), recipe, '#', Block.planks, '|', Item.bone);
			GameRegistry.addRecipe(new ItemStack(boneWoodTrowel), recipe, '#', Block.planks, '|', InfiLibrary.boneRod);
			GameRegistry.addRecipe(new ItemStack(paperWoodTrowel), recipe, '#', Block.planks, '|', InfiLibrary.paperRod);
			GameRegistry.addRecipe(new ItemStack(iceWoodTrowel), recipe, '#', Block.planks, '|', InfiLibrary.iceRod);
			GameRegistry.addRecipe(new ItemStack(slimeWoodTrowel), recipe, '#', Block.planks, '|', InfiLibrary.slimeRod);
			GameRegistry.addRecipe(new ItemStack(cactusWoodTrowel), recipe, '#', Block.planks, '|', InfiLibrary.cactusRod);
		}

		if (PropsHelperInfi2x2.enableStoneTools)
		{
			GameRegistry.addRecipe(new ItemStack(woodStoneTrowel), recipe, '#', Block.cobblestone, '|', Item.stick);
			GameRegistry.addRecipe(new ItemStack(stoneStoneTrowel), recipe, '#', Block.cobblestone, '|', InfiLibrary.stoneRod);
			GameRegistry.addRecipe(new ItemStack(sandstoneStoneTrowel), recipe, '#', Block.cobblestone, '|', InfiLibrary.sandstoneRod);
			GameRegistry.addRecipe(new ItemStack(boneStoneTrowel), recipe, '#', Block.cobblestone, '|', Item.bone);
			GameRegistry.addRecipe(new ItemStack(boneStoneTrowel), recipe, '#', Block.cobblestone, '|', InfiLibrary.boneRod);
			GameRegistry.addRecipe(new ItemStack(netherrackStoneTrowel), recipe, '#', Block.cobblestone, '|', InfiLibrary.netherrackRod);
			GameRegistry.addRecipe(new ItemStack(iceStoneTrowel), recipe, '#', Block.cobblestone, '|', InfiLibrary.iceRod);
			GameRegistry.addRecipe(new ItemStack(slimeStoneTrowel), recipe, '#', Block.cobblestone, '|', InfiLibrary.slimeRod);
			GameRegistry.addRecipe(new ItemStack(cactusStoneTrowel), recipe, '#', Block.cobblestone, '|', InfiLibrary.cactusRod);
			GameRegistry.addRecipe(new ItemStack(flintStoneTrowel), recipe, '#', Block.cobblestone, '|', InfiLibrary.flintRod);

			GameRegistry.addRecipe(new ItemStack(woodStoneTrowel), recipe, '#', Block.stone, '|', Item.stick);
			GameRegistry.addRecipe(new ItemStack(stoneStoneTrowel), recipe, '#', Block.stone, '|', InfiLibrary.stoneRod);
			GameRegistry.addRecipe(new ItemStack(sandstoneStoneTrowel), recipe, '#', Block.stone, '|', InfiLibrary.sandstoneRod);
			GameRegistry.addRecipe(new ItemStack(boneStoneTrowel), recipe, '#', Block.stone, '|', Item.bone);
			GameRegistry.addRecipe(new ItemStack(boneStoneTrowel), recipe, '#', Block.stone, '|', InfiLibrary.boneRod);
			GameRegistry.addRecipe(new ItemStack(netherrackStoneTrowel), recipe, '#', Block.stone, '|', InfiLibrary.netherrackRod);
			GameRegistry.addRecipe(new ItemStack(iceStoneTrowel), recipe, '#', Block.stone, '|', InfiLibrary.iceRod);
			GameRegistry.addRecipe(new ItemStack(slimeStoneTrowel), recipe, '#', Block.stone, '|', InfiLibrary.slimeRod);
			GameRegistry.addRecipe(new ItemStack(cactusStoneTrowel), recipe, '#', Block.stone, '|', InfiLibrary.cactusRod);
			GameRegistry.addRecipe(new ItemStack(flintStoneTrowel), recipe, '#', Block.stone, '|', InfiLibrary.flintRod);
		}

		if (PropsHelperInfi2x2.enableIronTools)
		{
			GameRegistry.addRecipe(new ItemStack(woodIronTrowel), recipe, '#', Item.ingotIron, '|', Item.stick);
			GameRegistry.addRecipe(new ItemStack(stoneIronTrowel), recipe, '#', Item.ingotIron, '|', InfiLibrary.stoneRod);
			GameRegistry.addRecipe(new ItemStack(ironIronTrowel), recipe, '#', Item.ingotIron, '|', InfiLibrary.ironRod);
			GameRegistry.addRecipe(new ItemStack(boneIronTrowel), recipe, '#', Item.ingotIron, '|', Item.bone);
			GameRegistry.addRecipe(new ItemStack(boneIronTrowel), recipe, '#', Item.ingotIron, '|', InfiLibrary.boneRod);
			GameRegistry.addRecipe(new ItemStack(netherrackIronTrowel), recipe, '#', Item.ingotIron, '|', InfiLibrary.netherrackRod);
			GameRegistry.addRecipe(new ItemStack(glowstoneIronTrowel), recipe, '#', Item.ingotIron, '|', InfiLibrary.glowstoneRod);
			GameRegistry.addRecipe(new ItemStack(cactusIronTrowel), recipe, '#', Item.ingotIron, '|', InfiLibrary.cactusRod);
			GameRegistry.addRecipe(new ItemStack(copperIronTrowel), recipe, '#', Item.ingotIron, '|', InfiLibrary.copperRod);
			GameRegistry.addRecipe(new ItemStack(bronzeIronTrowel), recipe, '#', Item.ingotIron, '|', InfiLibrary.bronzeRod);
		}

		if (PropsHelperInfi2x2.enableDiamondTools)
		{
			GameRegistry.addRecipe(new ItemStack(woodDiamondTrowel), recipe, '#', Item.diamond, '|', Item.stick);
			GameRegistry.addRecipe(new ItemStack(stoneDiamondTrowel), recipe, '#', Item.diamond, '|', InfiLibrary.stoneRod);
			GameRegistry.addRecipe(new ItemStack(ironDiamondTrowel), recipe, '#', Item.diamond, '|', InfiLibrary.ironRod);
			GameRegistry.addRecipe(new ItemStack(diamondDiamondTrowel), recipe, '#', Item.diamond, '|', InfiLibrary.diamondRod);
			GameRegistry.addRecipe(new ItemStack(redstoneDiamondTrowel), recipe, '#', Item.diamond, '|', InfiLibrary.redstoneRod);
			GameRegistry.addRecipe(new ItemStack(obsidianDiamondTrowel), recipe, '#', Item.diamond, '|', InfiLibrary.obsidianRod);
			GameRegistry.addRecipe(new ItemStack(boneDiamondTrowel), recipe, '#', Item.diamond, '|', Item.bone);
			GameRegistry.addRecipe(new ItemStack(boneDiamondTrowel), recipe, '#', Item.diamond, '|', InfiLibrary.boneRod);
			GameRegistry.addRecipe(new ItemStack(mossyDiamondTrowel), recipe, '#', Item.diamond, '|', InfiLibrary.mossyRod);
			GameRegistry.addRecipe(new ItemStack(netherrackDiamondTrowel), recipe, '#', Item.diamond, '|', InfiLibrary.netherrackRod);
			GameRegistry.addRecipe(new ItemStack(glowstoneDiamondTrowel), recipe, '#', Item.diamond, '|', InfiLibrary.glowstoneRod);
			GameRegistry.addRecipe(new ItemStack(lavaDiamondTrowel), recipe, '#', Item.diamond, '|', InfiLibrary.lavaRod);
			GameRegistry.addRecipe(new ItemStack(cactusDiamondTrowel), recipe, '#', Item.diamond, '|', InfiLibrary.cactusRod);
			GameRegistry.addRecipe(new ItemStack(flintDiamondTrowel), recipe, '#', Item.diamond, '|', InfiLibrary.flintRod);
			GameRegistry.addRecipe(new ItemStack(blazeDiamondTrowel), recipe, '#', Item.diamond, '|', Item.blazeRod);
			GameRegistry.addRecipe(new ItemStack(copperDiamondTrowel), recipe, '#', Item.diamond, '|', InfiLibrary.copperRod);
			GameRegistry.addRecipe(new ItemStack(bronzeDiamondTrowel), recipe, '#', Item.diamond, '|', InfiLibrary.bronzeRod);
			GameRegistry.addRecipe(new ItemStack(workedDiamondTrowel), recipe, '#', Item.diamond, '|', InfiLibrary.workedIronRod);
			GameRegistry.addRecipe(new ItemStack(steelDiamondTrowel), recipe, '#', Item.diamond, '|', InfiLibrary.steelRod);
			GameRegistry.addRecipe(new ItemStack(cobaltDiamondTrowel), recipe, '#', Item.diamond, '|', InfiLibrary.cobaltRod);
			GameRegistry.addRecipe(new ItemStack(arditeDiamondTrowel), recipe, '#', Item.diamond, '|', InfiLibrary.arditeRod);
			GameRegistry.addRecipe(new ItemStack(manyullynDiamondTrowel), recipe, '#', Item.diamond, '|', InfiLibrary.manyullynRod);
			GameRegistry.addRecipe(new ItemStack(uraniumDiamondTrowel), recipe, '#', Item.diamond, '|', InfiLibrary.uraniumRod);
		}

		if (PropsHelperInfi2x2.enableRedstoneTools)
		{
			GameRegistry.addRecipe(new ItemStack(woodRedstoneTrowel), recipe, '#', InfiLibrary.redstoneCrystal, '|', Item.stick);
			GameRegistry.addRecipe(new ItemStack(stoneRedstoneTrowel), recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.stoneRod);
			GameRegistry.addRecipe(new ItemStack(ironRedstoneTrowel), recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.ironRod);
			GameRegistry.addRecipe(new ItemStack(redstoneRedstoneTrowel), recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.redstoneRod);
			GameRegistry.addRecipe(new ItemStack(obsidianRedstoneTrowel), recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.obsidianRod);
			GameRegistry.addRecipe(new ItemStack(sandstoneRedstoneTrowel), recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.sandstoneRod);
			GameRegistry.addRecipe(new ItemStack(boneRedstoneTrowel), recipe, '#', InfiLibrary.redstoneCrystal, '|', Item.bone);
			GameRegistry.addRecipe(new ItemStack(boneRedstoneTrowel), recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.boneRod);
			GameRegistry.addRecipe(new ItemStack(paperRedstoneTrowel), recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.paperRod);
			GameRegistry.addRecipe(new ItemStack(mossyRedstoneTrowel), recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.mossyRod);
			GameRegistry.addRecipe(new ItemStack(netherrackRedstoneTrowel), recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.netherrackRod);
			GameRegistry.addRecipe(new ItemStack(glowstoneRedstoneTrowel), recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.glowstoneRod);
			GameRegistry.addRecipe(new ItemStack(iceRedstoneTrowel), recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.iceRod);
			GameRegistry.addRecipe(new ItemStack(lavaRedstoneTrowel), recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.lavaRod);
			GameRegistry.addRecipe(new ItemStack(slimeRedstoneTrowel), recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.slimeRod);
			GameRegistry.addRecipe(new ItemStack(cactusRedstoneTrowel), recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.cactusRod);
			GameRegistry.addRecipe(new ItemStack(flintRedstoneTrowel), recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.flintRod);
			GameRegistry.addRecipe(new ItemStack(copperRedstoneTrowel), recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.copperRod);
			GameRegistry.addRecipe(new ItemStack(bronzeRedstoneTrowel), recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.bronzeRod);
			GameRegistry.addRecipe(new ItemStack(workedRedstoneTrowel), recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.workedIronRod);
			GameRegistry.addRecipe(new ItemStack(uraniumRedstoneTrowel), recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.uraniumRod);
		}

		if (PropsHelperInfi2x2.enableObsidianTools)
		{
			GameRegistry.addRecipe(new ItemStack(woodObsidianTrowel), recipe, '#', Block.obsidian, '|', Item.stick);
			GameRegistry.addRecipe(new ItemStack(stoneObsidianTrowel), recipe, '#', Block.obsidian, '|', InfiLibrary.stoneRod);
			GameRegistry.addRecipe(new ItemStack(redstoneObsidianTrowel), recipe, '#', Block.obsidian, '|', InfiLibrary.redstoneRod);
			GameRegistry.addRecipe(new ItemStack(obsidianObsidianTrowel), recipe, '#', Block.obsidian, '|', InfiLibrary.obsidianRod);
			GameRegistry.addRecipe(new ItemStack(boneObsidianTrowel), recipe, '#', Block.obsidian, '|', Item.bone);
			GameRegistry.addRecipe(new ItemStack(boneObsidianTrowel), recipe, '#', Block.obsidian, '|', InfiLibrary.boneRod);
			GameRegistry.addRecipe(new ItemStack(netherrackObsidianTrowel), recipe, '#', Block.obsidian, '|', InfiLibrary.netherrackRod);
			GameRegistry.addRecipe(new ItemStack(glowstoneObsidianTrowel), recipe, '#', Block.obsidian, '|', InfiLibrary.glowstoneRod);
			GameRegistry.addRecipe(new ItemStack(iceObsidianTrowel), recipe, '#', Block.obsidian, '|', InfiLibrary.iceRod);
			GameRegistry.addRecipe(new ItemStack(lavaObsidianTrowel), recipe, '#', Block.obsidian, '|', InfiLibrary.lavaRod);
			GameRegistry.addRecipe(new ItemStack(cactusObsidianTrowel), recipe, '#', Block.obsidian, '|', InfiLibrary.cactusRod);
		}

		if (PropsHelperInfi2x2.enableSandstoneTools)
		{
			GameRegistry.addRecipe(new ItemStack(woodSandstoneTrowel), recipe, '#', Block.sandStone, '|', Item.stick);
			GameRegistry.addRecipe(new ItemStack(sandstoneSandstoneTrowel), recipe, '#', Block.sandStone, '|', InfiLibrary.sandstoneRod);
			GameRegistry.addRecipe(new ItemStack(boneSandstoneTrowel), recipe, '#', Block.sandStone, '|', Item.bone);
			GameRegistry.addRecipe(new ItemStack(boneSandstoneTrowel), recipe, '#', Block.sandStone, '|', InfiLibrary.boneRod);
			GameRegistry.addRecipe(new ItemStack(netherrackSandstoneTrowel), recipe, '#', Block.sandStone, '|', InfiLibrary.netherrackRod);
			GameRegistry.addRecipe(new ItemStack(iceSandstoneTrowel), recipe, '#', Block.sandStone, '|', InfiLibrary.iceRod);
			GameRegistry.addRecipe(new ItemStack(slimeSandstoneTrowel), recipe, '#', Block.sandStone, '|', InfiLibrary.slimeRod);
			GameRegistry.addRecipe(new ItemStack(cactusSandstoneTrowel), recipe, '#', Block.sandStone, '|', InfiLibrary.cactusRod);
			GameRegistry.addRecipe(new ItemStack(flintSandstoneTrowel), recipe, '#', Block.sandStone, '|', InfiLibrary.flintRod);
		}

		if (PropsHelperInfi2x2.enableBoneTools)
		{
			GameRegistry.addRecipe(new ItemStack(woodBoneTrowel), recipe, '#', Item.bone, '|', Item.stick);
			GameRegistry.addRecipe(new ItemStack(stoneBoneTrowel), recipe, '#', Item.bone, '|', InfiLibrary.stoneRod);
			GameRegistry.addRecipe(new ItemStack(sandstoneBoneTrowel), recipe, '#', Item.bone, '|', InfiLibrary.sandstoneRod);
			GameRegistry.addRecipe(new ItemStack(boneBoneTrowel), recipe, '#', Item.bone, '|', Item.bone);
			GameRegistry.addRecipe(new ItemStack(boneBoneTrowel), recipe, '#', Item.bone, '|', InfiLibrary.boneRod);
			GameRegistry.addRecipe(new ItemStack(paperBoneTrowel), recipe, '#', Item.bone, '|', InfiLibrary.paperRod);
			GameRegistry.addRecipe(new ItemStack(netherrackBoneTrowel), recipe, '#', Item.bone, '|', InfiLibrary.netherrackRod);
			GameRegistry.addRecipe(new ItemStack(iceBoneTrowel), recipe, '#', Item.bone, '|', InfiLibrary.iceRod);
			GameRegistry.addRecipe(new ItemStack(cactusBoneTrowel), recipe, '#', Item.bone, '|', InfiLibrary.cactusRod);
			GameRegistry.addRecipe(new ItemStack(flintBoneTrowel), recipe, '#', Item.bone, '|', InfiLibrary.flintRod);
		}

		if (PropsHelperInfi2x2.enablePaperTools)
		{
			GameRegistry.addRecipe(new ItemStack(woodPaperTrowel), recipe, '#', InfiLibrary.paperStack, '|', Item.stick);
			GameRegistry.addRecipe(new ItemStack(bonePaperTrowel), recipe, '#', InfiLibrary.paperStack, '|', Item.bone);
			GameRegistry.addRecipe(new ItemStack(bonePaperTrowel), recipe, '#', InfiLibrary.paperStack, '|', InfiLibrary.boneRod);
			GameRegistry.addRecipe(new ItemStack(paperPaperTrowel), recipe, '#', InfiLibrary.paperStack, '|', InfiLibrary.paperRod);
			GameRegistry.addRecipe(new ItemStack(slimePaperTrowel), recipe, '#', InfiLibrary.paperStack, '|', InfiLibrary.slimeRod);
			GameRegistry.addRecipe(new ItemStack(cactusPaperTrowel), recipe, '#', InfiLibrary.paperStack, '|', InfiLibrary.cactusRod);
		}

		if (PropsHelperInfi2x2.enableMossyTools)
		{
			GameRegistry.addRecipe(new ItemStack(woodMossyTrowel), recipe, '#', InfiLibrary.mossyStone, '|', Item.stick);
			GameRegistry.addRecipe(new ItemStack(stoneMossyTrowel), recipe, '#', InfiLibrary.mossyStone, '|', InfiLibrary.stoneRod);
			GameRegistry.addRecipe(new ItemStack(diamondMossyTrowel), recipe, '#', InfiLibrary.mossyStone, '|', InfiLibrary.diamondRod);
			GameRegistry.addRecipe(new ItemStack(redstoneMossyTrowel), recipe, '#', InfiLibrary.mossyStone, '|', InfiLibrary.redstoneRod);
			GameRegistry.addRecipe(new ItemStack(boneMossyTrowel), recipe, '#', InfiLibrary.mossyStone, '|', Item.bone);
			GameRegistry.addRecipe(new ItemStack(boneMossyTrowel), recipe, '#', InfiLibrary.mossyStone, '|', InfiLibrary.boneRod);
			GameRegistry.addRecipe(new ItemStack(mossyMossyTrowel), recipe, '#', InfiLibrary.mossyStone, '|', InfiLibrary.mossyRod);
			GameRegistry.addRecipe(new ItemStack(netherrackMossyTrowel), recipe, '#', InfiLibrary.mossyStone, '|', InfiLibrary.netherrackRod);
			GameRegistry.addRecipe(new ItemStack(glowstoneMossyTrowel), recipe, '#', InfiLibrary.mossyStone, '|', InfiLibrary.glowstoneRod);
			GameRegistry.addRecipe(new ItemStack(cactusMossyTrowel), recipe, '#', InfiLibrary.mossyStone, '|', InfiLibrary.cactusRod);
			GameRegistry.addRecipe(new ItemStack(blazeMossyTrowel), recipe, '#', InfiLibrary.mossyStone, '|', Item.blazeRod);
			GameRegistry.addRecipe(new ItemStack(manyullynMossyTrowel), recipe, '#', InfiLibrary.mossyStone, '|', InfiLibrary.manyullynRod);
			GameRegistry.addRecipe(new ItemStack(uraniumMossyTrowel), recipe, '#', InfiLibrary.mossyStone, '|', InfiLibrary.uraniumRod);
		}

		if (PropsHelperInfi2x2.enableNetherrackTools)
		{
			GameRegistry.addRecipe(new ItemStack(woodNetherrackTrowel), recipe, '#', Block.netherrack, '|', Item.stick);
			GameRegistry.addRecipe(new ItemStack(stoneNetherrackTrowel), recipe, '#', Block.netherrack, '|', InfiLibrary.stoneRod);
			GameRegistry.addRecipe(new ItemStack(sandstoneNetherrackTrowel), recipe, '#', Block.netherrack, '|', InfiLibrary.sandstoneRod);
			GameRegistry.addRecipe(new ItemStack(boneNetherrackTrowel), recipe, '#', Block.netherrack, '|', Item.bone);
			GameRegistry.addRecipe(new ItemStack(boneNetherrackTrowel), recipe, '#', Block.netherrack, '|', InfiLibrary.boneRod);
			GameRegistry.addRecipe(new ItemStack(paperNetherrackTrowel), recipe, '#', Block.netherrack, '|', InfiLibrary.paperRod);
			GameRegistry.addRecipe(new ItemStack(mossyNetherrackTrowel), recipe, '#', Block.netherrack, '|', InfiLibrary.mossyRod);
			GameRegistry.addRecipe(new ItemStack(netherrackNetherrackTrowel), recipe, '#', Block.netherrack, '|', InfiLibrary.netherrackRod);
			GameRegistry.addRecipe(new ItemStack(iceNetherrackTrowel), recipe, '#', Block.netherrack, '|', InfiLibrary.iceRod);
			GameRegistry.addRecipe(new ItemStack(slimeNetherrackTrowel), recipe, '#', Block.netherrack, '|', InfiLibrary.slimeRod);
			GameRegistry.addRecipe(new ItemStack(cactusNetherrackTrowel), recipe, '#', Block.netherrack, '|', InfiLibrary.cactusRod);
			GameRegistry.addRecipe(new ItemStack(flintNetherrackTrowel), recipe, '#', Block.netherrack, '|', InfiLibrary.flintRod);
			GameRegistry.addRecipe(new ItemStack(copperNetherrackTrowel), recipe, '#', Block.netherrack, '|', InfiLibrary.copperRod);
			GameRegistry.addRecipe(new ItemStack(bronzeNetherrackTrowel), recipe, '#', Block.netherrack, '|', InfiLibrary.bronzeRod);
		}

		if (PropsHelperInfi2x2.enableGlowstoneTools)
		{
			GameRegistry.addRecipe(new ItemStack(woodGlowstoneTrowel), recipe, '#', InfiLibrary.glowstoneCrystal, '|', Item.stick);
			GameRegistry.addRecipe(new ItemStack(redstoneGlowstoneTrowel), recipe, '#', InfiLibrary.glowstoneCrystal, '|', InfiLibrary.redstoneRod);
			GameRegistry.addRecipe(new ItemStack(obsidianGlowstoneTrowel), recipe, '#', InfiLibrary.glowstoneCrystal, '|', InfiLibrary.obsidianRod);
			GameRegistry.addRecipe(new ItemStack(boneGlowstoneTrowel), recipe, '#', InfiLibrary.glowstoneCrystal, '|', Item.bone);
			GameRegistry.addRecipe(new ItemStack(boneGlowstoneTrowel), recipe, '#', InfiLibrary.glowstoneCrystal, '|', InfiLibrary.boneRod);
			GameRegistry.addRecipe(new ItemStack(netherrackGlowstoneTrowel), recipe, '#', InfiLibrary.glowstoneCrystal, '|', InfiLibrary.netherrackRod);
			GameRegistry.addRecipe(new ItemStack(glowstoneGlowstoneTrowel), recipe, '#', InfiLibrary.glowstoneCrystal, '|', InfiLibrary.glowstoneRod);
			GameRegistry.addRecipe(new ItemStack(iceGlowstoneTrowel), recipe, '#', InfiLibrary.glowstoneCrystal, '|', InfiLibrary.iceRod);
			GameRegistry.addRecipe(new ItemStack(slimeGlowstoneTrowel), recipe, '#', InfiLibrary.glowstoneCrystal, '|', InfiLibrary.slimeRod);
			GameRegistry.addRecipe(new ItemStack(cactusGlowstoneTrowel), recipe, '#', InfiLibrary.glowstoneCrystal, '|', InfiLibrary.cactusRod);
		}

		if (PropsHelperInfi2x2.enableIceTools)
		{
			GameRegistry.addRecipe(new ItemStack(woodIceTrowel), recipe, '#', Block.ice, '|', Item.stick);
			GameRegistry.addRecipe(new ItemStack(boneIceTrowel), recipe, '#', Block.ice, '|', Item.bone);
			GameRegistry.addRecipe(new ItemStack(boneIceTrowel), recipe, '#', Block.ice, '|', InfiLibrary.boneRod);
			GameRegistry.addRecipe(new ItemStack(paperIceTrowel), recipe, '#', Block.ice, '|', InfiLibrary.paperRod);
			GameRegistry.addRecipe(new ItemStack(iceIceTrowel), recipe, '#', Block.ice, '|', InfiLibrary.iceRod);
			GameRegistry.addRecipe(new ItemStack(slimeIceTrowel), recipe, '#', Block.ice, '|', InfiLibrary.slimeRod);
			GameRegistry.addRecipe(new ItemStack(cactusIceTrowel), recipe, '#', Block.ice, '|', InfiLibrary.cactusRod);
		}

		if (PropsHelperInfi2x2.enableLavaTools)
		{
			GameRegistry.addRecipe(new ItemStack(diamondLavaTrowel), recipe, '#', InfiLibrary.lavaCrystal, '|', InfiLibrary.diamondRod);
			GameRegistry.addRecipe(new ItemStack(obsidianLavaTrowel), recipe, '#', InfiLibrary.lavaCrystal, '|', InfiLibrary.obsidianRod);
			GameRegistry.addRecipe(new ItemStack(netherrackLavaTrowel), recipe, '#', InfiLibrary.lavaCrystal, '|', InfiLibrary.netherrackRod);
			GameRegistry.addRecipe(new ItemStack(lavaLavaTrowel), recipe, '#', InfiLibrary.lavaCrystal, '|', InfiLibrary.lavaRod);
			GameRegistry.addRecipe(new ItemStack(flintLavaTrowel), recipe, '#', InfiLibrary.lavaCrystal, '|', InfiLibrary.flintRod);
			GameRegistry.addRecipe(new ItemStack(blazeLavaTrowel), recipe, '#', InfiLibrary.lavaCrystal, '|', Item.blazeRod);
			GameRegistry.addRecipe(new ItemStack(manyullynLavaTrowel), recipe, '#', InfiLibrary.lavaCrystal, '|', InfiLibrary.manyullynRod);
			GameRegistry.addRecipe(new ItemStack(uraniumLavaTrowel), recipe, '#', InfiLibrary.lavaCrystal, '|', InfiLibrary.uraniumRod);
		}

		if (PropsHelperInfi2x2.enableSlimeTools)
		{
			GameRegistry.addRecipe(new ItemStack(woodSlimeTrowel), recipe, '#', InfiLibrary.slimeCrystal, '|', Item.stick);
			GameRegistry.addRecipe(new ItemStack(sandstoneSlimeTrowel), recipe, '#', InfiLibrary.slimeCrystal, '|', InfiLibrary.sandstoneRod);
			GameRegistry.addRecipe(new ItemStack(boneSlimeTrowel), recipe, '#', InfiLibrary.slimeCrystal, '|', Item.bone);
			GameRegistry.addRecipe(new ItemStack(boneSlimeTrowel), recipe, '#', InfiLibrary.slimeCrystal, '|', InfiLibrary.boneRod);
			GameRegistry.addRecipe(new ItemStack(paperSlimeTrowel), recipe, '#', InfiLibrary.slimeCrystal, '|', InfiLibrary.paperRod);
			GameRegistry.addRecipe(new ItemStack(slimeSlimeTrowel), recipe, '#', InfiLibrary.slimeCrystal, '|', InfiLibrary.slimeRod);
			GameRegistry.addRecipe(new ItemStack(cactusSlimeTrowel), recipe, '#', InfiLibrary.slimeCrystal, '|', InfiLibrary.cactusRod);
		}

		if (PropsHelperInfi2x2.enableCactusTools)
		{
			GameRegistry.addRecipe(new ItemStack(woodCactusTrowel), recipe, '#', Block.cactus, '|', Item.stick);
			GameRegistry.addRecipe(new ItemStack(sandstoneCactusTrowel), recipe, '#', Block.cactus, '|', InfiLibrary.sandstoneRod);
			GameRegistry.addRecipe(new ItemStack(boneCactusTrowel), recipe, '#', Block.cactus, '|', Item.bone);
			GameRegistry.addRecipe(new ItemStack(boneCactusTrowel), recipe, '#', Block.cactus, '|', InfiLibrary.boneRod);
			GameRegistry.addRecipe(new ItemStack(netherrackCactusTrowel), recipe, '#', Block.cactus, '|', InfiLibrary.netherrackRod);
			GameRegistry.addRecipe(new ItemStack(iceCactusTrowel), recipe, '#', Block.cactus, '|', InfiLibrary.iceRod);
			GameRegistry.addRecipe(new ItemStack(slimeCactusTrowel), recipe, '#', Block.cactus, '|', InfiLibrary.slimeRod);
			GameRegistry.addRecipe(new ItemStack(cactusCactusTrowel), recipe, '#', Block.cactus, '|', InfiLibrary.cactusRod);
		}

		if (PropsHelperInfi2x2.enableFlintTools)
		{
			GameRegistry.addRecipe(new ItemStack(woodFlintTrowel), recipe, '#', Item.flint, '|', Item.stick);
			GameRegistry.addRecipe(new ItemStack(stoneFlintTrowel), recipe, '#', Item.flint, '|', InfiLibrary.stoneRod);
			GameRegistry.addRecipe(new ItemStack(sandstoneFlintTrowel), recipe, '#', Item.flint, '|', InfiLibrary.sandstoneRod);
			GameRegistry.addRecipe(new ItemStack(boneFlintTrowel), recipe, '#', Item.flint, '|', Item.bone);
			GameRegistry.addRecipe(new ItemStack(boneFlintTrowel), recipe, '#', Item.flint, '|', InfiLibrary.boneRod);
			GameRegistry.addRecipe(new ItemStack(netherrackFlintTrowel), recipe, '#', Item.flint, '|', InfiLibrary.netherrackRod);
			GameRegistry.addRecipe(new ItemStack(slimeFlintTrowel), recipe, '#', Item.flint, '|', InfiLibrary.slimeRod);
			GameRegistry.addRecipe(new ItemStack(cactusFlintTrowel), recipe, '#', Item.flint, '|', InfiLibrary.cactusRod);
			GameRegistry.addRecipe(new ItemStack(flintFlintTrowel), recipe, '#', Item.flint, '|', InfiLibrary.flintRod);
			GameRegistry.addRecipe(new ItemStack(copperFlintTrowel), recipe, '#', Item.flint, '|', InfiLibrary.copperRod);
			GameRegistry.addRecipe(new ItemStack(bronzeFlintTrowel), recipe, '#', Item.flint, '|', InfiLibrary.bronzeRod);
		}

		if (PropsHelperInfi2x2.enableBlazeTools)
		{
			GameRegistry.addRecipe(new ItemStack(diamondBlazeTrowel), recipe, '#', InfiLibrary.blazeCrystal, '|', InfiLibrary.diamondRod);
			GameRegistry.addRecipe(new ItemStack(obsidianBlazeTrowel), recipe, '#', InfiLibrary.blazeCrystal, '|', InfiLibrary.obsidianRod);
			GameRegistry.addRecipe(new ItemStack(netherrackBlazeTrowel), recipe, '#', InfiLibrary.blazeCrystal, '|', InfiLibrary.netherrackRod);
			GameRegistry.addRecipe(new ItemStack(lavaBlazeTrowel), recipe, '#', InfiLibrary.blazeCrystal, '|', InfiLibrary.lavaRod);
			GameRegistry.addRecipe(new ItemStack(flintBlazeTrowel), recipe, '#', InfiLibrary.blazeCrystal, '|', InfiLibrary.flintRod);
			GameRegistry.addRecipe(new ItemStack(blazeBlazeTrowel), recipe, '#', InfiLibrary.blazeCrystal, '|', Item.blazeRod);
			GameRegistry.addRecipe(new ItemStack(manyullynBlazeTrowel), recipe, '#', InfiLibrary.blazeCrystal, '|', InfiLibrary.manyullynRod);
			GameRegistry.addRecipe(new ItemStack(uraniumBlazeTrowel), recipe, '#', InfiLibrary.blazeCrystal, '|', InfiLibrary.uraniumRod);
		}
	}

	public static void addStoneTools(String stack)
	{
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(woodStoneTrowel), recipe, '#', stack, '|', Item.stick));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(stoneStoneTrowel), recipe, '#', stack, '|', InfiLibrary.stoneRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(sandstoneStoneTrowel), recipe, '#', stack, '|', InfiLibrary.sandstoneRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(boneStoneTrowel), recipe, '#', stack, '|', Item.bone));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(boneStoneTrowel), recipe, '#', stack, '|', InfiLibrary.boneRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(netherrackStoneTrowel), recipe, '#', stack, '|', InfiLibrary.netherrackRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(iceStoneTrowel), recipe, '#', stack, '|', InfiLibrary.iceRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(slimeStoneTrowel), recipe, '#', stack, '|', InfiLibrary.slimeRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(cactusStoneTrowel), recipe, '#', stack, '|', InfiLibrary.cactusRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(flintStoneTrowel), recipe, '#', stack, '|', InfiLibrary.flintRod));
	}

	public static void addCopperTools(String stack)
	{
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(woodCopperTrowel), recipe, '#', stack, '|', Item.stick));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(stoneCopperTrowel), recipe, '#', stack, '|', InfiLibrary.stoneRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(boneCopperTrowel), recipe, '#', stack, '|', Item.bone));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(boneCopperTrowel), recipe, '#', stack, '|', InfiLibrary.boneRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(netherrackCopperTrowel), recipe, '#', stack, '|', InfiLibrary.netherrackRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(slimeCopperTrowel), recipe, '#', stack, '|', InfiLibrary.slimeRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(cactusCopperTrowel), recipe, '#', stack, '|', InfiLibrary.cactusRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(flintCopperTrowel), recipe, '#', stack, '|', InfiLibrary.flintRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(copperCopperTrowel), recipe, '#', stack, '|', InfiLibrary.copperRod));
	}

	public static void addBronzeTools(String stack)
	{
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(woodBronzeTrowel), recipe, '#', stack, '|', Item.stick));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(stoneBronzeTrowel), recipe, '#', stack, '|', InfiLibrary.stoneRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(boneBronzeTrowel), recipe, '#', stack, '|', Item.bone));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(boneBronzeTrowel), recipe, '#', stack, '|', InfiLibrary.boneRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(netherrackBronzeTrowel), recipe, '#', stack, '|', InfiLibrary.netherrackRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(slimeBronzeTrowel), recipe, '#', stack, '|', InfiLibrary.slimeRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(cactusBronzeTrowel), recipe, '#', stack, '|', InfiLibrary.cactusRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(flintBronzeTrowel), recipe, '#', stack, '|', InfiLibrary.flintRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(copperBronzeTrowel), recipe, '#', stack, '|', InfiLibrary.copperRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(bronzeBronzeTrowel), recipe, '#', stack, '|', InfiLibrary.bronzeRod));
	}

	public static void addWorkedIronTools(String stack)
	{
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(woodWorkedIronTrowel), recipe, '#', stack, '|', Item.stick));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(stoneWorkedIronTrowel), recipe, '#', stack, '|', InfiLibrary.stoneRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ironWorkedIronTrowel), recipe, '#', stack, '|', InfiLibrary.ironRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(diamondWorkedIronTrowel), recipe, '#', stack, '|', InfiLibrary.diamondRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(redstoneWorkedIronTrowel), recipe, '#', stack, '|', InfiLibrary.redstoneRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(obsidianWorkedIronTrowel), recipe, '#', stack, '|', InfiLibrary.obsidianRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(boneWorkedIronTrowel), recipe, '#', stack, '|', Item.bone));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(boneWorkedIronTrowel), recipe, '#', stack, '|', InfiLibrary.boneRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(netherrackWorkedIronTrowel), recipe, '#', stack, '|', InfiLibrary.netherrackRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(glowstoneWorkedIronTrowel), recipe, '#', stack, '|', InfiLibrary.glowstoneRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(iceWorkedIronTrowel), recipe, '#', stack, '|', InfiLibrary.iceRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(slimeWorkedIronTrowel), recipe, '#', stack, '|', InfiLibrary.slimeRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(cactusWorkedIronTrowel), recipe, '#', stack, '|', InfiLibrary.cactusRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(blazeWorkedIronTrowel), recipe, '#', stack, '|', Item.blazeRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(copperWorkedIronTrowel), recipe, '#', stack, '|', InfiLibrary.copperRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(bronzeWorkedIronTrowel), recipe, '#', stack, '|', InfiLibrary.bronzeRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(workedWorkedIronTrowel), recipe, '#', stack, '|', InfiLibrary.workedIronRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(steelWorkedIronTrowel), recipe, '#', stack, '|', InfiLibrary.steelRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(uraniumWorkedIronTrowel), recipe, '#', stack, '|', InfiLibrary.uraniumRod));
	}

	public static void addSteelTools(String stack)
	{
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(woodSteelTrowel), recipe, '#', stack, '|', Item.stick));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(stoneSteelTrowel), recipe, '#', stack, '|', InfiLibrary.stoneRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ironSteelTrowel), recipe, '#', stack, '|', InfiLibrary.ironRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(diamondSteelTrowel), recipe, '#', stack, '|', InfiLibrary.diamondRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(redstoneSteelTrowel), recipe, '#', stack, '|', InfiLibrary.redstoneRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(obsidianSteelTrowel), recipe, '#', stack, '|', InfiLibrary.obsidianRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(boneSteelTrowel), recipe, '#', stack, '|', Item.bone));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(boneSteelTrowel), recipe, '#', stack, '|', InfiLibrary.boneRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(netherrackSteelTrowel), recipe, '#', stack, '|', InfiLibrary.netherrackRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(glowstoneSteelTrowel), recipe, '#', stack, '|', InfiLibrary.glowstoneRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(iceSteelTrowel), recipe, '#', stack, '|', InfiLibrary.iceRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(slimeSteelTrowel), recipe, '#', stack, '|', InfiLibrary.slimeRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(cactusSteelTrowel), recipe, '#', stack, '|', InfiLibrary.cactusRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(blazeSteelTrowel), recipe, '#', stack, '|', Item.blazeRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(copperSteelTrowel), recipe, '#', stack, '|', InfiLibrary.copperRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(bronzeSteelTrowel), recipe, '#', stack, '|', InfiLibrary.bronzeRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(workedSteelTrowel), recipe, '#', stack, '|', InfiLibrary.workedIronRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(steelSteelTrowel), recipe, '#', stack, '|', InfiLibrary.steelRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(cobaltSteelTrowel), recipe, '#', stack, '|', InfiLibrary.cobaltRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(arditeSteelTrowel), recipe, '#', stack, '|', InfiLibrary.arditeRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(uraniumSteelTrowel), recipe, '#', stack, '|', InfiLibrary.uraniumRod));
	}

	public static void addCobaltTools(String stack)
	{
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(woodCobaltTrowel), recipe, '#', stack, '|', Item.stick));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(stoneCobaltTrowel), recipe, '#', stack, '|', InfiLibrary.stoneRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ironCobaltTrowel), recipe, '#', stack, '|', InfiLibrary.ironRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(diamondCobaltTrowel), recipe, '#', stack, '|', InfiLibrary.diamondRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(redstoneCobaltTrowel), recipe, '#', stack, '|', InfiLibrary.redstoneRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(obsidianCobaltTrowel), recipe, '#', stack, '|', InfiLibrary.obsidianRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(boneCobaltTrowel), recipe, '#', stack, '|', Item.bone));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(boneCobaltTrowel), recipe, '#', stack, '|', InfiLibrary.boneRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(slimeCobaltTrowel), recipe, '#', stack, '|', InfiLibrary.slimeRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(cactusCobaltTrowel), recipe, '#', stack, '|', InfiLibrary.cactusRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(blazeCobaltTrowel), recipe, '#', stack, '|', Item.blazeRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(copperCobaltTrowel), recipe, '#', stack, '|', InfiLibrary.copperRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(bronzeCobaltTrowel), recipe, '#', stack, '|', InfiLibrary.bronzeRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(workedCobaltTrowel), recipe, '#', stack, '|', InfiLibrary.workedIronRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(steelCobaltTrowel), recipe, '#', stack, '|', InfiLibrary.steelRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(cobaltCobaltTrowel), recipe, '#', stack, '|', InfiLibrary.cobaltRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(arditeCobaltTrowel), recipe, '#', stack, '|', InfiLibrary.arditeRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(manyullynCobaltTrowel), recipe, '#', stack, '|', InfiLibrary.manyullynRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(uraniumCobaltTrowel), recipe, '#', stack, '|', InfiLibrary.uraniumRod));
	}

	public static void addArditeTools(String stack)
	{
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(woodArditeTrowel), recipe, '#', stack, '|', Item.stick));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(stoneArditeTrowel), recipe, '#', stack, '|', InfiLibrary.stoneRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ironArditeTrowel), recipe, '#', stack, '|', InfiLibrary.ironRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(diamondArditeTrowel), recipe, '#', stack, '|', InfiLibrary.diamondRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(redstoneArditeTrowel), recipe, '#', stack, '|', InfiLibrary.redstoneRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(obsidianArditeTrowel), recipe, '#', stack, '|', InfiLibrary.obsidianRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(boneArditeTrowel), recipe, '#', stack, '|', Item.bone));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(boneArditeTrowel), recipe, '#', stack, '|', InfiLibrary.boneRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(slimeArditeTrowel), recipe, '#', stack, '|', InfiLibrary.slimeRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(cactusArditeTrowel), recipe, '#', stack, '|', InfiLibrary.cactusRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(blazeArditeTrowel), recipe, '#', stack, '|', Item.blazeRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(copperArditeTrowel), recipe, '#', stack, '|', InfiLibrary.copperRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(bronzeArditeTrowel), recipe, '#', stack, '|', InfiLibrary.bronzeRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(workedArditeTrowel), recipe, '#', stack, '|', InfiLibrary.workedIronRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(steelArditeTrowel), recipe, '#', stack, '|', InfiLibrary.steelRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(cobaltArditeTrowel), recipe, '#', stack, '|', InfiLibrary.cobaltRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(arditeArditeTrowel), recipe, '#', stack, '|', InfiLibrary.arditeRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(manyullynArditeTrowel), recipe, '#', stack, '|', InfiLibrary.manyullynRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(uraniumArditeTrowel), recipe, '#', stack, '|', InfiLibrary.uraniumRod));
	}

	public static void addManyullynTools(String stack)
	{
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(woodManyullynTrowel), recipe, '#', stack, '|', Item.stick));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(stoneManyullynTrowel), recipe, '#', stack, '|', InfiLibrary.stoneRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ironManyullynTrowel), recipe, '#', stack, '|', InfiLibrary.ironRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(diamondManyullynTrowel), recipe, '#', stack, '|', InfiLibrary.diamondRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(redstoneManyullynTrowel), recipe, '#', stack, '|', InfiLibrary.redstoneRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(obsidianManyullynTrowel), recipe, '#', stack, '|', InfiLibrary.obsidianRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(boneManyullynTrowel), recipe, '#', stack, '|', Item.bone));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(boneManyullynTrowel), recipe, '#', stack, '|', InfiLibrary.boneRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(slimeManyullynTrowel), recipe, '#', stack, '|', InfiLibrary.slimeRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(cactusManyullynTrowel), recipe, '#', stack, '|', InfiLibrary.cactusRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(blazeManyullynTrowel), recipe, '#', stack, '|', Item.blazeRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(copperManyullynTrowel), recipe, '#', stack, '|', InfiLibrary.copperRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(bronzeManyullynTrowel), recipe, '#', stack, '|', InfiLibrary.bronzeRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(workedManyullynTrowel), recipe, '#', stack, '|', InfiLibrary.workedIronRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(steelManyullynTrowel), recipe, '#', stack, '|', InfiLibrary.steelRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(cobaltManyullynTrowel), recipe, '#', stack, '|', InfiLibrary.cobaltRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(arditeManyullynTrowel), recipe, '#', stack, '|', InfiLibrary.arditeRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(manyullynManyullynTrowel), recipe, '#', stack, '|', InfiLibrary.manyullynRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(uraniumManyullynTrowel), recipe, '#', stack, '|', InfiLibrary.uraniumRod));
	}

	public static void addUraniumTools(String stack)
	{
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(diamondUraniumTrowel), recipe, '#', stack, '|', InfiLibrary.diamondRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(redstoneUraniumTrowel), recipe, '#', stack, '|', InfiLibrary.redstoneRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(boneUraniumTrowel), recipe, '#', stack, '|', Item.bone));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(boneUraniumTrowel), recipe, '#', stack, '|', InfiLibrary.boneRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(netherrackUraniumTrowel), recipe, '#', stack, '|', InfiLibrary.netherrackRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(glowstoneUraniumTrowel), recipe, '#', stack, '|', InfiLibrary.glowstoneRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(lavaUraniumTrowel), recipe, '#', stack, '|', InfiLibrary.lavaRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(blazeUraniumTrowel), recipe, '#', stack, '|', Item.blazeRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(cobaltUraniumTrowel), recipe, '#', stack, '|', InfiLibrary.cobaltRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(arditeUraniumTrowel), recipe, '#', stack, '|', InfiLibrary.arditeRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(uraniumUraniumTrowel), recipe, '#', stack, '|', InfiLibrary.uraniumRod));
	}

	public static Item woodWoodTrowel;
	public static Item sandstoneWoodTrowel;
	public static Item boneWoodTrowel;
	public static Item paperWoodTrowel;
	public static Item iceWoodTrowel;
	public static Item slimeWoodTrowel;
	public static Item cactusWoodTrowel;

	public static Item woodStoneTrowel;
	public static Item stoneStoneTrowel;
	public static Item sandstoneStoneTrowel;
	public static Item boneStoneTrowel;
	public static Item netherrackStoneTrowel;
	public static Item iceStoneTrowel;
	public static Item slimeStoneTrowel;
	public static Item cactusStoneTrowel;
	public static Item flintStoneTrowel;

	public static Item woodIronTrowel;
	public static Item stoneIronTrowel;
	public static Item ironIronTrowel;
	public static Item boneIronTrowel;
	public static Item netherrackIronTrowel;
	public static Item glowstoneIronTrowel;
	public static Item cactusIronTrowel;
	public static Item copperIronTrowel;
	public static Item bronzeIronTrowel;

	public static Item woodDiamondTrowel;
	public static Item stoneDiamondTrowel;
	public static Item ironDiamondTrowel;
	public static Item diamondDiamondTrowel;
	public static Item redstoneDiamondTrowel;
	public static Item obsidianDiamondTrowel;
	public static Item boneDiamondTrowel;
	public static Item mossyDiamondTrowel;
	public static Item netherrackDiamondTrowel;
	public static Item glowstoneDiamondTrowel;
	public static Item lavaDiamondTrowel;
	public static Item cactusDiamondTrowel;
	public static Item flintDiamondTrowel;
	public static Item blazeDiamondTrowel;
	public static Item copperDiamondTrowel;
	public static Item bronzeDiamondTrowel;
	public static Item workedDiamondTrowel;
	public static Item steelDiamondTrowel;
	public static Item cobaltDiamondTrowel;
	public static Item arditeDiamondTrowel;
	public static Item manyullynDiamondTrowel;
	public static Item uraniumDiamondTrowel;

	public static Item woodRedstoneTrowel;
	public static Item stoneRedstoneTrowel;
	public static Item ironRedstoneTrowel;
	public static Item redstoneRedstoneTrowel;
	public static Item obsidianRedstoneTrowel;
	public static Item sandstoneRedstoneTrowel;
	public static Item boneRedstoneTrowel;
	public static Item paperRedstoneTrowel;
	public static Item mossyRedstoneTrowel;
	public static Item netherrackRedstoneTrowel;
	public static Item glowstoneRedstoneTrowel;
	public static Item iceRedstoneTrowel;
	public static Item lavaRedstoneTrowel;
	public static Item slimeRedstoneTrowel;
	public static Item cactusRedstoneTrowel;
	public static Item flintRedstoneTrowel;
	public static Item copperRedstoneTrowel;
	public static Item bronzeRedstoneTrowel;
	public static Item workedRedstoneTrowel;
	public static Item uraniumRedstoneTrowel;

	public static Item woodObsidianTrowel;
	public static Item stoneObsidianTrowel;
	public static Item redstoneObsidianTrowel;
	public static Item obsidianObsidianTrowel;
	public static Item boneObsidianTrowel;
	public static Item netherrackObsidianTrowel;
	public static Item glowstoneObsidianTrowel;
	public static Item iceObsidianTrowel;
	public static Item lavaObsidianTrowel;
	public static Item cactusObsidianTrowel;

	public static Item woodSandstoneTrowel;
	public static Item sandstoneSandstoneTrowel;
	public static Item boneSandstoneTrowel;
	public static Item netherrackSandstoneTrowel;
	public static Item iceSandstoneTrowel;
	public static Item slimeSandstoneTrowel;
	public static Item cactusSandstoneTrowel;
	public static Item flintSandstoneTrowel;

	public static Item woodBoneTrowel;
	public static Item stoneBoneTrowel;
	public static Item sandstoneBoneTrowel;
	public static Item boneBoneTrowel;
	public static Item paperBoneTrowel;
	public static Item netherrackBoneTrowel;
	public static Item iceBoneTrowel;
	public static Item cactusBoneTrowel;
	public static Item flintBoneTrowel;

	public static Item woodPaperTrowel;
	public static Item bonePaperTrowel;
	public static Item paperPaperTrowel;
	public static Item slimePaperTrowel;
	public static Item cactusPaperTrowel;

	public static Item woodMossyTrowel;
	public static Item stoneMossyTrowel;
	public static Item diamondMossyTrowel;
	public static Item redstoneMossyTrowel;
	public static Item boneMossyTrowel;
	public static Item mossyMossyTrowel;
	public static Item netherrackMossyTrowel;
	public static Item glowstoneMossyTrowel;
	public static Item cactusMossyTrowel;
	public static Item blazeMossyTrowel;
	public static Item manyullynMossyTrowel;
	public static Item uraniumMossyTrowel;

	public static Item woodNetherrackTrowel;
	public static Item stoneNetherrackTrowel;
	public static Item sandstoneNetherrackTrowel;
	public static Item boneNetherrackTrowel;
	public static Item paperNetherrackTrowel;
	public static Item mossyNetherrackTrowel;
	public static Item netherrackNetherrackTrowel;
	public static Item iceNetherrackTrowel;
	public static Item slimeNetherrackTrowel;
	public static Item cactusNetherrackTrowel;
	public static Item flintNetherrackTrowel;
	public static Item copperNetherrackTrowel;
	public static Item bronzeNetherrackTrowel;

	public static Item woodGlowstoneTrowel;
	public static Item redstoneGlowstoneTrowel;
	public static Item obsidianGlowstoneTrowel;
	public static Item boneGlowstoneTrowel;
	public static Item netherrackGlowstoneTrowel;
	public static Item glowstoneGlowstoneTrowel;
	public static Item iceGlowstoneTrowel;
	public static Item slimeGlowstoneTrowel;
	public static Item cactusGlowstoneTrowel;

	public static Item woodIceTrowel;
	public static Item boneIceTrowel;
	public static Item paperIceTrowel;
	public static Item iceIceTrowel;
	public static Item slimeIceTrowel;
	public static Item cactusIceTrowel;

	public static Item diamondLavaTrowel;
	public static Item obsidianLavaTrowel;
	public static Item netherrackLavaTrowel;
	public static Item lavaLavaTrowel;
	public static Item flintLavaTrowel;
	public static Item blazeLavaTrowel;
	public static Item manyullynLavaTrowel;
	public static Item uraniumLavaTrowel;

	public static Item woodSlimeTrowel;
	public static Item sandstoneSlimeTrowel;
	public static Item boneSlimeTrowel;
	public static Item paperSlimeTrowel;
	public static Item slimeSlimeTrowel;
	public static Item cactusSlimeTrowel;

	public static Item woodCactusTrowel;
	public static Item sandstoneCactusTrowel;
	public static Item boneCactusTrowel;
	public static Item netherrackCactusTrowel;
	public static Item iceCactusTrowel;
	public static Item slimeCactusTrowel;
	public static Item cactusCactusTrowel;

	public static Item woodFlintTrowel;
	public static Item stoneFlintTrowel;
	public static Item sandstoneFlintTrowel;
	public static Item boneFlintTrowel;
	public static Item netherrackFlintTrowel;
	public static Item slimeFlintTrowel;
	public static Item cactusFlintTrowel;
	public static Item flintFlintTrowel;
	public static Item copperFlintTrowel;
	public static Item bronzeFlintTrowel;

	public static Item diamondBlazeTrowel;
	public static Item obsidianBlazeTrowel;
	public static Item netherrackBlazeTrowel;
	public static Item lavaBlazeTrowel;
	public static Item flintBlazeTrowel;
	public static Item blazeBlazeTrowel;
	public static Item manyullynBlazeTrowel;
	public static Item uraniumBlazeTrowel;

	public static Item woodCopperTrowel;
	public static Item stoneCopperTrowel;
	public static Item boneCopperTrowel;
	public static Item netherrackCopperTrowel;
	public static Item slimeCopperTrowel;
	public static Item cactusCopperTrowel;
	public static Item flintCopperTrowel;
	public static Item copperCopperTrowel;

	public static Item woodBronzeTrowel;
	public static Item stoneBronzeTrowel;
	public static Item boneBronzeTrowel;
	public static Item netherrackBronzeTrowel;
	public static Item slimeBronzeTrowel;
	public static Item cactusBronzeTrowel;
	public static Item flintBronzeTrowel;
	public static Item copperBronzeTrowel;
	public static Item bronzeBronzeTrowel;

	public static Item woodWorkedIronTrowel;
	public static Item stoneWorkedIronTrowel;
	public static Item ironWorkedIronTrowel;
	public static Item diamondWorkedIronTrowel;
	public static Item redstoneWorkedIronTrowel;
	public static Item obsidianWorkedIronTrowel;
	public static Item boneWorkedIronTrowel;
	public static Item netherrackWorkedIronTrowel;
	public static Item glowstoneWorkedIronTrowel;
	public static Item iceWorkedIronTrowel;
	public static Item slimeWorkedIronTrowel;
	public static Item cactusWorkedIronTrowel;
	public static Item blazeWorkedIronTrowel;
	public static Item copperWorkedIronTrowel;
	public static Item bronzeWorkedIronTrowel;
	public static Item workedWorkedIronTrowel;
	public static Item steelWorkedIronTrowel;
	public static Item uraniumWorkedIronTrowel;

	public static Item woodSteelTrowel;
	public static Item stoneSteelTrowel;
	public static Item ironSteelTrowel;
	public static Item diamondSteelTrowel;
	public static Item redstoneSteelTrowel;
	public static Item obsidianSteelTrowel;
	public static Item boneSteelTrowel;
	public static Item netherrackSteelTrowel;
	public static Item glowstoneSteelTrowel;
	public static Item iceSteelTrowel;
	public static Item slimeSteelTrowel;
	public static Item cactusSteelTrowel;
	public static Item blazeSteelTrowel;
	public static Item copperSteelTrowel;
	public static Item bronzeSteelTrowel;
	public static Item workedSteelTrowel;
	public static Item steelSteelTrowel;
	public static Item cobaltSteelTrowel;
	public static Item arditeSteelTrowel;
	public static Item uraniumSteelTrowel;

	public static Item woodCobaltTrowel;
	public static Item stoneCobaltTrowel;
	public static Item ironCobaltTrowel;
	public static Item diamondCobaltTrowel;
	public static Item redstoneCobaltTrowel;
	public static Item obsidianCobaltTrowel;
	public static Item boneCobaltTrowel;
	public static Item slimeCobaltTrowel;
	public static Item cactusCobaltTrowel;
	public static Item blazeCobaltTrowel;
	public static Item copperCobaltTrowel;
	public static Item bronzeCobaltTrowel;
	public static Item workedCobaltTrowel;
	public static Item steelCobaltTrowel;
	public static Item cobaltCobaltTrowel;
	public static Item arditeCobaltTrowel;
	public static Item manyullynCobaltTrowel;
	public static Item uraniumCobaltTrowel;

	public static Item woodArditeTrowel;
	public static Item stoneArditeTrowel;
	public static Item ironArditeTrowel;
	public static Item diamondArditeTrowel;
	public static Item redstoneArditeTrowel;
	public static Item obsidianArditeTrowel;
	public static Item boneArditeTrowel;
	public static Item slimeArditeTrowel;
	public static Item cactusArditeTrowel;
	public static Item blazeArditeTrowel;
	public static Item copperArditeTrowel;
	public static Item bronzeArditeTrowel;
	public static Item workedArditeTrowel;
	public static Item steelArditeTrowel;
	public static Item cobaltArditeTrowel;
	public static Item arditeArditeTrowel;
	public static Item manyullynArditeTrowel;
	public static Item uraniumArditeTrowel;

	public static Item woodManyullynTrowel;
	public static Item stoneManyullynTrowel;
	public static Item ironManyullynTrowel;
	public static Item diamondManyullynTrowel;
	public static Item redstoneManyullynTrowel;
	public static Item obsidianManyullynTrowel;
	public static Item boneManyullynTrowel;
	public static Item slimeManyullynTrowel;
	public static Item cactusManyullynTrowel;
	public static Item blazeManyullynTrowel;
	public static Item copperManyullynTrowel;
	public static Item bronzeManyullynTrowel;
	public static Item workedManyullynTrowel;
	public static Item steelManyullynTrowel;
	public static Item cobaltManyullynTrowel;
	public static Item arditeManyullynTrowel;
	public static Item manyullynManyullynTrowel;
	public static Item uraniumManyullynTrowel;

	public static Item diamondUraniumTrowel;
	public static Item redstoneUraniumTrowel;
	public static Item boneUraniumTrowel;
	public static Item netherrackUraniumTrowel;
	public static Item glowstoneUraniumTrowel;
	public static Item lavaUraniumTrowel;
	public static Item blazeUraniumTrowel;
	public static Item cobaltUraniumTrowel;
	public static Item arditeUraniumTrowel;
	public static Item uraniumUraniumTrowel;
}
