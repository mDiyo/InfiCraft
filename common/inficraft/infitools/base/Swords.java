package inficraft.infitools.base;

import inficraft.infitools.library.InfiLibrary;
import inficraft.infitools.library.InfiMaterialEnum;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.src.Block;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.oredict.ShapedOreRecipe;

public class Swords
{
	public static Swords instance = new Swords();

	private static String[] recipe = { "#", "#", "|" };

	public static Swords getInstance()
	{
		return instance;
	}

	public static void init()
	{
		if (PHInfiTools.addInfiTools)
		{
			createTools();
			addNames();
			registerInfiToolsRecipes();
			oreDictionarySupport();
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
			addCobaltTools("ingotCobalt");
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

	private static void createTools()
	{
		if (PHInfiTools.enableWoodTools)
		{
			sandstoneWoodSword = new InfiToolSword(PHInfiTools.woodSwordID + 1, InfiMaterialEnum.Wood, InfiMaterialEnum.Sandstone, "sandstoneWoodSword");
			boneWoodSword = new InfiToolSword(PHInfiTools.woodSwordID + 2, InfiMaterialEnum.Wood, InfiMaterialEnum.Bone, "boneWoodSword");
			paperWoodSword = new InfiToolSword(PHInfiTools.woodSwordID + 3, InfiMaterialEnum.Wood, InfiMaterialEnum.Paper, "paperWoodSword");
			iceWoodSword = new InfiToolSword(PHInfiTools.woodSwordID + 4, InfiMaterialEnum.Wood, InfiMaterialEnum.Ice, "iceWoodSword");
			slimeWoodSword = new InfiToolSword(PHInfiTools.woodSwordID + 5, InfiMaterialEnum.Wood, InfiMaterialEnum.Slime, "slimeWoodSword");
			cactusWoodSword = new InfiToolSword(PHInfiTools.woodSwordID + 6, InfiMaterialEnum.Wood, InfiMaterialEnum.Cactus, "cactusWoodSword");

			MinecraftForge.setToolClass(sandstoneWoodSword, "Sword", InfiMaterialEnum.Wood.getHarvestLevel());
			MinecraftForge.setToolClass(boneWoodSword, "Sword", InfiMaterialEnum.Wood.getHarvestLevel());
			MinecraftForge.setToolClass(paperWoodSword, "Sword", InfiMaterialEnum.Wood.getHarvestLevel());
			MinecraftForge.setToolClass(iceWoodSword, "Sword", InfiMaterialEnum.Wood.getHarvestLevel());
			MinecraftForge.setToolClass(slimeWoodSword, "Sword", InfiMaterialEnum.Wood.getHarvestLevel());
			MinecraftForge.setToolClass(cactusWoodSword, "Sword", InfiMaterialEnum.Wood.getHarvestLevel());
		}

		if (PHInfiTools.enableStoneTools)
		{
			stoneStoneSword = new InfiToolSword(PHInfiTools.stoneSwordID + 1, InfiMaterialEnum.Stone, InfiMaterialEnum.Stone, "stoneStoneSword");
			sandstoneStoneSword = new InfiToolSword(PHInfiTools.stoneSwordID + 2, InfiMaterialEnum.Stone, InfiMaterialEnum.Sandstone, "sandstoneStoneSword");
			boneStoneSword = new InfiToolSword(PHInfiTools.stoneSwordID + 3, InfiMaterialEnum.Stone, InfiMaterialEnum.Bone, "boneStoneSword");
			netherrackStoneSword = new InfiToolSword(PHInfiTools.stoneSwordID + 4, InfiMaterialEnum.Stone, InfiMaterialEnum.Netherrack, "netherrackStoneSword");
			iceStoneSword = new InfiToolSword(PHInfiTools.stoneSwordID + 5, InfiMaterialEnum.Stone, InfiMaterialEnum.Ice, "iceStoneSword");
			slimeStoneSword = new InfiToolSword(PHInfiTools.stoneSwordID + 6, InfiMaterialEnum.Stone, InfiMaterialEnum.Slime, "slimeStoneSword");
			cactusStoneSword = new InfiToolSword(PHInfiTools.stoneSwordID + 7, InfiMaterialEnum.Stone, InfiMaterialEnum.Cactus, "cactusStoneSword");
			flintStoneSword = new InfiToolSword(PHInfiTools.stoneSwordID + 8, InfiMaterialEnum.Stone, InfiMaterialEnum.Flint, "flintStoneSword");

			MinecraftForge.setToolClass(stoneStoneSword, "Sword", InfiMaterialEnum.Stone.getHarvestLevel());
			MinecraftForge.setToolClass(sandstoneStoneSword, "Sword", InfiMaterialEnum.Stone.getHarvestLevel());
			MinecraftForge.setToolClass(boneStoneSword, "Sword", InfiMaterialEnum.Stone.getHarvestLevel());
			MinecraftForge.setToolClass(netherrackStoneSword, "Sword", InfiMaterialEnum.Stone.getHarvestLevel());
			MinecraftForge.setToolClass(iceStoneSword, "Sword", InfiMaterialEnum.Stone.getHarvestLevel());
			MinecraftForge.setToolClass(slimeStoneSword, "Sword", InfiMaterialEnum.Stone.getHarvestLevel());
			MinecraftForge.setToolClass(cactusStoneSword, "Sword", InfiMaterialEnum.Stone.getHarvestLevel());
			MinecraftForge.setToolClass(flintStoneSword, "Sword", InfiMaterialEnum.Stone.getHarvestLevel());
		}

		if (PHInfiTools.enableIronTools)
		{
			stoneIronSword = new InfiToolSword(PHInfiTools.ironSwordID + 1, InfiMaterialEnum.Iron, InfiMaterialEnum.Stone, "stoneIronSword");
			ironIronSword = new InfiToolSword(PHInfiTools.ironSwordID + 2, InfiMaterialEnum.Iron, InfiMaterialEnum.Iron, "ironIronSword");
			boneIronSword = new InfiToolSword(PHInfiTools.ironSwordID + 3, InfiMaterialEnum.Iron, InfiMaterialEnum.Bone, "boneIronSword");
			netherrackIronSword = new InfiToolSword(PHInfiTools.ironSwordID + 4, InfiMaterialEnum.Iron, InfiMaterialEnum.Netherrack, "netherrackIronSword");
			glowstoneIronSword = new InfiToolSword(PHInfiTools.ironSwordID + 5, InfiMaterialEnum.Iron, InfiMaterialEnum.Glowstone, "glowstoneIronSword");
			cactusIronSword = new InfiToolSword(PHInfiTools.ironSwordID + 6, InfiMaterialEnum.Iron, InfiMaterialEnum.Cactus, "cactusIronSword");
			copperIronSword = new InfiToolSword(PHInfiTools.ironSwordID + 7, InfiMaterialEnum.Iron, InfiMaterialEnum.Copper, "copperIronSword");
			bronzeIronSword = new InfiToolSword(PHInfiTools.ironSwordID + 8, InfiMaterialEnum.Iron, InfiMaterialEnum.Bronze, "bronzeIronSword");

			MinecraftForge.setToolClass(stoneIronSword, "Sword", InfiMaterialEnum.Iron.getHarvestLevel());
			MinecraftForge.setToolClass(ironIronSword, "Sword", InfiMaterialEnum.Iron.getHarvestLevel());
			MinecraftForge.setToolClass(boneIronSword, "Sword", InfiMaterialEnum.Iron.getHarvestLevel());
			MinecraftForge.setToolClass(netherrackIronSword, "Sword", InfiMaterialEnum.Iron.getHarvestLevel());
			MinecraftForge.setToolClass(glowstoneIronSword, "Sword", InfiMaterialEnum.Iron.getHarvestLevel());
			MinecraftForge.setToolClass(cactusIronSword, "Sword", InfiMaterialEnum.Iron.getHarvestLevel());
			MinecraftForge.setToolClass(copperIronSword, "Sword", InfiMaterialEnum.Iron.getHarvestLevel());
			MinecraftForge.setToolClass(bronzeIronSword, "Sword", InfiMaterialEnum.Iron.getHarvestLevel());
		}

		if (PHInfiTools.enableDiamondTools)
		{
			stoneDiamondSword = new InfiToolSword(PHInfiTools.diamondSwordID + 1, InfiMaterialEnum.Diamond, InfiMaterialEnum.Stone, "stoneDiamondSword");
			ironDiamondSword = new InfiToolSword(PHInfiTools.diamondSwordID + 2, InfiMaterialEnum.Diamond, InfiMaterialEnum.Iron, "ironDiamondSword");
			diamondDiamondSword = new InfiToolSword(PHInfiTools.diamondSwordID + 3, InfiMaterialEnum.Diamond, InfiMaterialEnum.Diamond, "diamondDiamondSword");
			redstoneDiamondSword = new InfiToolSword(PHInfiTools.diamondSwordID + 4, InfiMaterialEnum.Diamond, InfiMaterialEnum.Redstone, "redstoneDiamondSword");
			obsidianDiamondSword = new InfiToolSword(PHInfiTools.diamondSwordID + 5, InfiMaterialEnum.Diamond, InfiMaterialEnum.Obsidian, "obsidianDiamondSword");
			boneDiamondSword = new InfiToolSword(PHInfiTools.diamondSwordID + 6, InfiMaterialEnum.Diamond, InfiMaterialEnum.Bone, "boneDiamondSword");
			mossyDiamondSword = new InfiToolSword(PHInfiTools.diamondSwordID + 7, InfiMaterialEnum.Diamond, InfiMaterialEnum.Mossy, "mossyDiamondSword");
			netherrackDiamondSword = new InfiToolSword(PHInfiTools.diamondSwordID + 8, InfiMaterialEnum.Diamond, InfiMaterialEnum.Netherrack, "netherrackDiamondSword");
			glowstoneDiamondSword = new InfiToolSword(PHInfiTools.diamondSwordID + 9, InfiMaterialEnum.Diamond, InfiMaterialEnum.Glowstone, "glowstoneDiamondSword");
			lavaDiamondSword = new InfiToolSword(PHInfiTools.diamondSwordID + 10, InfiMaterialEnum.Diamond, InfiMaterialEnum.Lava, "lavaDiamondSword");
			cactusDiamondSword = new InfiToolSword(PHInfiTools.diamondSwordID + 11, InfiMaterialEnum.Diamond, InfiMaterialEnum.Cactus, "cactusDiamondSword");
			flintDiamondSword = new InfiToolSword(PHInfiTools.diamondSwordID + 12, InfiMaterialEnum.Diamond, InfiMaterialEnum.Flint, "flintDiamondSword");
			blazeDiamondSword = new InfiToolSword(PHInfiTools.diamondSwordID + 13, InfiMaterialEnum.Diamond, InfiMaterialEnum.Blaze, "blazeDiamondSword");
			copperDiamondSword = new InfiToolSword(PHInfiTools.diamondSwordID + 14, InfiMaterialEnum.Diamond, InfiMaterialEnum.Copper, "copperDiamondSword");
			bronzeDiamondSword = new InfiToolSword(PHInfiTools.diamondSwordID + 15, InfiMaterialEnum.Diamond, InfiMaterialEnum.Bronze, "bronzeDiamondSword");
			workedDiamondSword = new InfiToolSword(PHInfiTools.diamondSwordID + 16, InfiMaterialEnum.Diamond, InfiMaterialEnum.WorkedIron, "workedDiamondSword");
			steelDiamondSword = new InfiToolSword(PHInfiTools.diamondSwordID + 17, InfiMaterialEnum.Diamond, InfiMaterialEnum.Steel, "steelDiamondSword");
			cobaltDiamondSword = new InfiToolSword(PHInfiTools.diamondSwordID + 18, InfiMaterialEnum.Diamond, InfiMaterialEnum.Cobalt, "cobaltDiamondSword");
			arditeDiamondSword = new InfiToolSword(PHInfiTools.diamondSwordID + 19, InfiMaterialEnum.Diamond, InfiMaterialEnum.Ardite, "arditeDiamondSword");
			manyullynDiamondSword = new InfiToolSword(PHInfiTools.diamondSwordID + 20, InfiMaterialEnum.Diamond, InfiMaterialEnum.Manyullyn, "manyullynDiamondSword");
			uraniumDiamondSword = new InfiToolSword(PHInfiTools.diamondSwordID + 21, InfiMaterialEnum.Diamond, InfiMaterialEnum.Uranium, "uraniumDiamondSword");

			MinecraftForge.setToolClass(stoneDiamondSword, "Sword", InfiMaterialEnum.Diamond.getHarvestLevel());
			MinecraftForge.setToolClass(ironDiamondSword, "Sword", InfiMaterialEnum.Diamond.getHarvestLevel());
			MinecraftForge.setToolClass(diamondDiamondSword, "Sword", InfiMaterialEnum.Diamond.getHarvestLevel());
			MinecraftForge.setToolClass(redstoneDiamondSword, "Sword", InfiMaterialEnum.Diamond.getHarvestLevel());
			MinecraftForge.setToolClass(obsidianDiamondSword, "Sword", InfiMaterialEnum.Diamond.getHarvestLevel());
			MinecraftForge.setToolClass(boneDiamondSword, "Sword", InfiMaterialEnum.Diamond.getHarvestLevel());
			MinecraftForge.setToolClass(mossyDiamondSword, "Sword", InfiMaterialEnum.Diamond.getHarvestLevel());
			MinecraftForge.setToolClass(netherrackDiamondSword, "Sword", InfiMaterialEnum.Diamond.getHarvestLevel());
			MinecraftForge.setToolClass(glowstoneDiamondSword, "Sword", InfiMaterialEnum.Diamond.getHarvestLevel());
			MinecraftForge.setToolClass(lavaDiamondSword, "Sword", InfiMaterialEnum.Diamond.getHarvestLevel());
			MinecraftForge.setToolClass(cactusDiamondSword, "Sword", InfiMaterialEnum.Diamond.getHarvestLevel());
			MinecraftForge.setToolClass(flintDiamondSword, "Sword", InfiMaterialEnum.Diamond.getHarvestLevel());
			MinecraftForge.setToolClass(blazeDiamondSword, "Sword", InfiMaterialEnum.Diamond.getHarvestLevel());
			MinecraftForge.setToolClass(copperDiamondSword, "Sword", InfiMaterialEnum.Diamond.getHarvestLevel());
			MinecraftForge.setToolClass(bronzeDiamondSword, "Sword", InfiMaterialEnum.Diamond.getHarvestLevel());
			MinecraftForge.setToolClass(workedDiamondSword, "Sword", InfiMaterialEnum.Diamond.getHarvestLevel());
			MinecraftForge.setToolClass(steelDiamondSword, "Sword", InfiMaterialEnum.Diamond.getHarvestLevel());
			MinecraftForge.setToolClass(cobaltDiamondSword, "Sword", InfiMaterialEnum.Diamond.getHarvestLevel());
			MinecraftForge.setToolClass(arditeDiamondSword, "Sword", InfiMaterialEnum.Diamond.getHarvestLevel());
			MinecraftForge.setToolClass(manyullynDiamondSword, "Sword", InfiMaterialEnum.Diamond.getHarvestLevel());
			MinecraftForge.setToolClass(uraniumDiamondSword, "Sword", InfiMaterialEnum.Diamond.getHarvestLevel());
		}

		if (PHInfiTools.enableRedstoneTools)
		{
			woodRedstoneSword = new InfiToolSword(PHInfiTools.redstoneSwordID + 0, InfiMaterialEnum.Redstone, InfiMaterialEnum.Wood, "woodRedstoneSword");
			stoneRedstoneSword = new InfiToolSword(PHInfiTools.redstoneSwordID + 1, InfiMaterialEnum.Redstone, InfiMaterialEnum.Stone, "stoneRedstoneSword");
			ironRedstoneSword = new InfiToolSword(PHInfiTools.redstoneSwordID + 2, InfiMaterialEnum.Redstone, InfiMaterialEnum.Iron, "ironRedstoneSword");
			redstoneRedstoneSword = new InfiToolSword(PHInfiTools.redstoneSwordID + 3, InfiMaterialEnum.Redstone, InfiMaterialEnum.Redstone, "redstoneRedstoneSword");
			obsidianRedstoneSword = new InfiToolSword(PHInfiTools.redstoneSwordID + 4, InfiMaterialEnum.Redstone, InfiMaterialEnum.Obsidian, "obsidianRedstoneSword");
			sandstoneRedstoneSword = new InfiToolSword(PHInfiTools.redstoneSwordID + 5, InfiMaterialEnum.Redstone, InfiMaterialEnum.Sandstone, "sandstoneRedstoneSword");
			boneRedstoneSword = new InfiToolSword(PHInfiTools.redstoneSwordID + 6, InfiMaterialEnum.Redstone, InfiMaterialEnum.Bone, "boneRedstoneSword");
			paperRedstoneSword = new InfiToolSword(PHInfiTools.redstoneSwordID + 7, InfiMaterialEnum.Redstone, InfiMaterialEnum.Paper, "paperRedstoneSword");
			mossyRedstoneSword = new InfiToolSword(PHInfiTools.redstoneSwordID + 8, InfiMaterialEnum.Redstone, InfiMaterialEnum.Mossy, "mossyRedstoneSword");
			netherrackRedstoneSword = new InfiToolSword(PHInfiTools.redstoneSwordID + 9, InfiMaterialEnum.Redstone, InfiMaterialEnum.Netherrack, "netherrackRedstoneSword");
			glowstoneRedstoneSword = new InfiToolSword(PHInfiTools.redstoneSwordID + 10, InfiMaterialEnum.Redstone, InfiMaterialEnum.Glowstone, "glowstoneRedstoneSword");
			iceRedstoneSword = new InfiToolSword(PHInfiTools.redstoneSwordID + 11, InfiMaterialEnum.Redstone, InfiMaterialEnum.Ice, "iceRedstoneSword");
			lavaRedstoneSword = new InfiToolSword(PHInfiTools.redstoneSwordID + 12, InfiMaterialEnum.Redstone, InfiMaterialEnum.Lava, "lavaRedstoneSword");
			slimeRedstoneSword = new InfiToolSword(PHInfiTools.redstoneSwordID + 13, InfiMaterialEnum.Redstone, InfiMaterialEnum.Slime, "slimeRedstoneSword");
			cactusRedstoneSword = new InfiToolSword(PHInfiTools.redstoneSwordID + 14, InfiMaterialEnum.Redstone, InfiMaterialEnum.Cactus, "cactusRedstoneSword");
			flintRedstoneSword = new InfiToolSword(PHInfiTools.redstoneSwordID + 15, InfiMaterialEnum.Redstone, InfiMaterialEnum.Flint, "flintRedstoneSword");
			copperRedstoneSword = new InfiToolSword(PHInfiTools.redstoneSwordID + 16, InfiMaterialEnum.Redstone, InfiMaterialEnum.Copper, "copperRedstoneSword");
			bronzeRedstoneSword = new InfiToolSword(PHInfiTools.redstoneSwordID + 17, InfiMaterialEnum.Redstone, InfiMaterialEnum.Bronze, "bronzeRedstoneSword");
			workedRedstoneSword = new InfiToolSword(PHInfiTools.redstoneSwordID + 18, InfiMaterialEnum.Redstone, InfiMaterialEnum.WorkedIron, "workedRedstoneSword");
			uraniumRedstoneSword = new InfiToolSword(PHInfiTools.redstoneSwordID + 19, InfiMaterialEnum.Redstone, InfiMaterialEnum.Uranium, "uraniumRedstoneSword");

			MinecraftForge.setToolClass(woodRedstoneSword, "Sword", InfiMaterialEnum.Redstone.getHarvestLevel());
			MinecraftForge.setToolClass(stoneRedstoneSword, "Sword", InfiMaterialEnum.Redstone.getHarvestLevel());
			MinecraftForge.setToolClass(ironRedstoneSword, "Sword", InfiMaterialEnum.Redstone.getHarvestLevel());
			MinecraftForge.setToolClass(redstoneRedstoneSword, "Sword", InfiMaterialEnum.Redstone.getHarvestLevel());
			MinecraftForge.setToolClass(obsidianRedstoneSword, "Sword", InfiMaterialEnum.Redstone.getHarvestLevel());
			MinecraftForge.setToolClass(sandstoneRedstoneSword, "Sword", InfiMaterialEnum.Redstone.getHarvestLevel());
			MinecraftForge.setToolClass(boneRedstoneSword, "Sword", InfiMaterialEnum.Redstone.getHarvestLevel());
			MinecraftForge.setToolClass(paperRedstoneSword, "Sword", InfiMaterialEnum.Redstone.getHarvestLevel());
			MinecraftForge.setToolClass(mossyRedstoneSword, "Sword", InfiMaterialEnum.Redstone.getHarvestLevel());
			MinecraftForge.setToolClass(netherrackRedstoneSword, "Sword", InfiMaterialEnum.Redstone.getHarvestLevel());
			MinecraftForge.setToolClass(glowstoneRedstoneSword, "Sword", InfiMaterialEnum.Redstone.getHarvestLevel());
			MinecraftForge.setToolClass(iceRedstoneSword, "Sword", InfiMaterialEnum.Redstone.getHarvestLevel());
			MinecraftForge.setToolClass(lavaRedstoneSword, "Sword", InfiMaterialEnum.Redstone.getHarvestLevel());
			MinecraftForge.setToolClass(slimeRedstoneSword, "Sword", InfiMaterialEnum.Redstone.getHarvestLevel());
			MinecraftForge.setToolClass(cactusRedstoneSword, "Sword", InfiMaterialEnum.Redstone.getHarvestLevel());
			MinecraftForge.setToolClass(flintRedstoneSword, "Sword", InfiMaterialEnum.Redstone.getHarvestLevel());
			MinecraftForge.setToolClass(copperRedstoneSword, "Sword", InfiMaterialEnum.Redstone.getHarvestLevel());
			MinecraftForge.setToolClass(bronzeRedstoneSword, "Sword", InfiMaterialEnum.Redstone.getHarvestLevel());
			MinecraftForge.setToolClass(workedRedstoneSword, "Sword", InfiMaterialEnum.Redstone.getHarvestLevel());
			MinecraftForge.setToolClass(uraniumRedstoneSword, "Sword", InfiMaterialEnum.Redstone.getHarvestLevel());
		}

		if (PHInfiTools.enableObsidianTools)
		{
			woodObsidianSword = new InfiToolSword(PHInfiTools.obsidianSwordID + 0, InfiMaterialEnum.Obsidian, InfiMaterialEnum.Wood, "woodObsidianSword");
			stoneObsidianSword = new InfiToolSword(PHInfiTools.obsidianSwordID + 1, InfiMaterialEnum.Obsidian, InfiMaterialEnum.Stone, "stoneObsidianSword");
			redstoneObsidianSword = new InfiToolSword(PHInfiTools.obsidianSwordID + 2, InfiMaterialEnum.Obsidian, InfiMaterialEnum.Redstone, "redstoneObsidianSword");
			obsidianObsidianSword = new InfiToolSword(PHInfiTools.obsidianSwordID + 3, InfiMaterialEnum.Obsidian, InfiMaterialEnum.Obsidian, "obsidianObsidianSword");
			;
			boneObsidianSword = new InfiToolSword(PHInfiTools.obsidianSwordID + 4, InfiMaterialEnum.Obsidian, InfiMaterialEnum.Bone, "boneObsidianSword");
			netherrackObsidianSword = new InfiToolSword(PHInfiTools.obsidianSwordID + 5, InfiMaterialEnum.Obsidian, InfiMaterialEnum.Netherrack, "netherrackObsidianSword");
			glowstoneObsidianSword = new InfiToolSword(PHInfiTools.obsidianSwordID + 6, InfiMaterialEnum.Obsidian, InfiMaterialEnum.Glowstone, "glowstoneObsidianSword");
			iceObsidianSword = new InfiToolSword(PHInfiTools.obsidianSwordID + 7, InfiMaterialEnum.Obsidian, InfiMaterialEnum.Ice, "iceObsidianSword");
			lavaObsidianSword = new InfiToolSword(PHInfiTools.obsidianSwordID + 8, InfiMaterialEnum.Obsidian, InfiMaterialEnum.Lava, "lavaObsidianSword");
			cactusObsidianSword = new InfiToolSword(PHInfiTools.obsidianSwordID + 9, InfiMaterialEnum.Obsidian, InfiMaterialEnum.Cactus, "cactusObsidianSword");

			MinecraftForge.setToolClass(woodObsidianSword, "Sword", InfiMaterialEnum.Obsidian.getHarvestLevel());
			MinecraftForge.setToolClass(stoneObsidianSword, "Sword", InfiMaterialEnum.Obsidian.getHarvestLevel());
			MinecraftForge.setToolClass(redstoneObsidianSword, "Sword", InfiMaterialEnum.Obsidian.getHarvestLevel());
			MinecraftForge.setToolClass(obsidianObsidianSword, "Sword", InfiMaterialEnum.Obsidian.getHarvestLevel());
			MinecraftForge.setToolClass(boneObsidianSword, "Sword", InfiMaterialEnum.Obsidian.getHarvestLevel());
			MinecraftForge.setToolClass(netherrackObsidianSword, "Sword", InfiMaterialEnum.Obsidian.getHarvestLevel());
			MinecraftForge.setToolClass(glowstoneObsidianSword, "Sword", InfiMaterialEnum.Obsidian.getHarvestLevel());
			MinecraftForge.setToolClass(iceObsidianSword, "Sword", InfiMaterialEnum.Obsidian.getHarvestLevel());
			MinecraftForge.setToolClass(lavaObsidianSword, "Sword", InfiMaterialEnum.Obsidian.getHarvestLevel());
			MinecraftForge.setToolClass(cactusObsidianSword, "Sword", InfiMaterialEnum.Obsidian.getHarvestLevel());
		}

		if (PHInfiTools.enableSandstoneTools)
		{
			woodSandstoneSword = new InfiToolSword(PHInfiTools.sandstoneSwordID + 0, InfiMaterialEnum.Sandstone, InfiMaterialEnum.Wood, "woodSandstoneSword");
			sandstoneSandstoneSword = new InfiToolSword(PHInfiTools.sandstoneSwordID + 1, InfiMaterialEnum.Sandstone, InfiMaterialEnum.Sandstone, "sandstoneSandstoneSword");
			boneSandstoneSword = new InfiToolSword(PHInfiTools.sandstoneSwordID + 2, InfiMaterialEnum.Sandstone, InfiMaterialEnum.Bone, "boneSandstoneSword");
			netherrackSandstoneSword = new InfiToolSword(PHInfiTools.sandstoneSwordID + 3, InfiMaterialEnum.Sandstone, InfiMaterialEnum.Netherrack, "netherrackSandstoneSword");
			iceSandstoneSword = new InfiToolSword(PHInfiTools.sandstoneSwordID + 4, InfiMaterialEnum.Sandstone, InfiMaterialEnum.Ice, "iceSandstoneSword");
			slimeSandstoneSword = new InfiToolSword(PHInfiTools.sandstoneSwordID + 5, InfiMaterialEnum.Sandstone, InfiMaterialEnum.Slime, "slimeSandstoneSword");
			cactusSandstoneSword = new InfiToolSword(PHInfiTools.sandstoneSwordID + 6, InfiMaterialEnum.Sandstone, InfiMaterialEnum.Cactus, "cactusSandstoneSword");
			flintSandstoneSword = new InfiToolSword(PHInfiTools.sandstoneSwordID + 7, InfiMaterialEnum.Sandstone, InfiMaterialEnum.Flint, "flintSandstoneSword");

			MinecraftForge.setToolClass(woodSandstoneSword, "Sword", InfiMaterialEnum.Sandstone.getHarvestLevel());
			MinecraftForge.setToolClass(sandstoneSandstoneSword, "Sword", InfiMaterialEnum.Sandstone.getHarvestLevel());
			MinecraftForge.setToolClass(boneSandstoneSword, "Sword", InfiMaterialEnum.Sandstone.getHarvestLevel());
			MinecraftForge.setToolClass(netherrackSandstoneSword, "Sword", InfiMaterialEnum.Sandstone.getHarvestLevel());
			MinecraftForge.setToolClass(iceSandstoneSword, "Sword", InfiMaterialEnum.Sandstone.getHarvestLevel());
			MinecraftForge.setToolClass(slimeSandstoneSword, "Sword", InfiMaterialEnum.Sandstone.getHarvestLevel());
			MinecraftForge.setToolClass(cactusSandstoneSword, "Sword", InfiMaterialEnum.Sandstone.getHarvestLevel());
			MinecraftForge.setToolClass(flintSandstoneSword, "Sword", InfiMaterialEnum.Sandstone.getHarvestLevel());
		}

		if (PHInfiTools.enableBoneTools)
		{
			woodBoneSword = new InfiToolSword(PHInfiTools.boneSwordID + 0, InfiMaterialEnum.Bone, InfiMaterialEnum.Wood, "woodBoneSword");
			stoneBoneSword = new InfiToolSword(PHInfiTools.boneSwordID + 1, InfiMaterialEnum.Bone, InfiMaterialEnum.Stone, "stoneBoneSword");
			sandstoneBoneSword = new InfiToolSword(PHInfiTools.boneSwordID + 2, InfiMaterialEnum.Bone, InfiMaterialEnum.Sandstone, "sandstoneBoneSword");
			boneBoneSword = new InfiToolSword(PHInfiTools.boneSwordID + 3, InfiMaterialEnum.Bone, InfiMaterialEnum.Bone, "boneBoneSword");
			paperBoneSword = new InfiToolSword(PHInfiTools.boneSwordID + 4, InfiMaterialEnum.Bone, InfiMaterialEnum.Paper, "paperBoneSword");
			netherrackBoneSword = new InfiToolSword(PHInfiTools.boneSwordID + 5, InfiMaterialEnum.Bone, InfiMaterialEnum.Netherrack, "netherrackBoneSword");
			iceBoneSword = new InfiToolSword(PHInfiTools.boneSwordID + 6, InfiMaterialEnum.Bone, InfiMaterialEnum.Ice, "iceBoneSword");
			cactusBoneSword = new InfiToolSword(PHInfiTools.boneSwordID + 7, InfiMaterialEnum.Bone, InfiMaterialEnum.Cactus, "cactusBoneSword");
			flintBoneSword = new InfiToolSword(PHInfiTools.boneSwordID + 8, InfiMaterialEnum.Bone, InfiMaterialEnum.Flint, "flintBoneSword");

			MinecraftForge.setToolClass(woodBoneSword, "Sword", InfiMaterialEnum.Bone.getHarvestLevel());
			MinecraftForge.setToolClass(stoneBoneSword, "Sword", InfiMaterialEnum.Bone.getHarvestLevel());
			MinecraftForge.setToolClass(sandstoneBoneSword, "Sword", InfiMaterialEnum.Bone.getHarvestLevel());
			MinecraftForge.setToolClass(boneBoneSword, "Sword", InfiMaterialEnum.Bone.getHarvestLevel());
			MinecraftForge.setToolClass(paperBoneSword, "Sword", InfiMaterialEnum.Bone.getHarvestLevel());
			MinecraftForge.setToolClass(netherrackBoneSword, "Sword", InfiMaterialEnum.Bone.getHarvestLevel());
			MinecraftForge.setToolClass(iceBoneSword, "Sword", InfiMaterialEnum.Bone.getHarvestLevel());
			MinecraftForge.setToolClass(cactusBoneSword, "Sword", InfiMaterialEnum.Bone.getHarvestLevel());
			MinecraftForge.setToolClass(flintBoneSword, "Sword", InfiMaterialEnum.Bone.getHarvestLevel());
		}

		if (PHInfiTools.enablePaperTools)
		{
			woodPaperSword = new InfiToolSword(PHInfiTools.paperSwordID + 0, InfiMaterialEnum.Paper, InfiMaterialEnum.Wood, "woodPaperSword");
			bonePaperSword = new InfiToolSword(PHInfiTools.paperSwordID + 1, InfiMaterialEnum.Paper, InfiMaterialEnum.Bone, "bonePaperSword");
			paperPaperSword = new InfiToolSword(PHInfiTools.paperSwordID + 2, InfiMaterialEnum.Paper, InfiMaterialEnum.Paper, "paperPaperSword");
			slimePaperSword = new InfiToolSword(PHInfiTools.paperSwordID + 3, InfiMaterialEnum.Paper, InfiMaterialEnum.Slime, "slimePaperSword");
			cactusPaperSword = new InfiToolSword(PHInfiTools.paperSwordID + 4, InfiMaterialEnum.Paper, InfiMaterialEnum.Cactus, "cactusPaperSword");

			MinecraftForge.setToolClass(woodPaperSword, "Sword", InfiMaterialEnum.Paper.getHarvestLevel());
			MinecraftForge.setToolClass(bonePaperSword, "Sword", InfiMaterialEnum.Paper.getHarvestLevel());
			MinecraftForge.setToolClass(paperPaperSword, "Sword", InfiMaterialEnum.Paper.getHarvestLevel());
			MinecraftForge.setToolClass(slimePaperSword, "Sword", InfiMaterialEnum.Paper.getHarvestLevel());
			MinecraftForge.setToolClass(cactusPaperSword, "Sword", InfiMaterialEnum.Paper.getHarvestLevel());
		}

		if (PHInfiTools.enableMossyTools)
		{
			woodMossySword = new InfiToolSword(PHInfiTools.mossySwordID + 0, InfiMaterialEnum.Mossy, InfiMaterialEnum.Wood, "woodMossySword");
			stoneMossySword = new InfiToolSword(PHInfiTools.mossySwordID + 1, InfiMaterialEnum.Mossy, InfiMaterialEnum.Stone, "stoneMossySword");
			diamondMossySword = new InfiToolSword(PHInfiTools.mossySwordID + 2, InfiMaterialEnum.Mossy, InfiMaterialEnum.Diamond, "diamondMossySword");
			redstoneMossySword = new InfiToolSword(PHInfiTools.mossySwordID + 3, InfiMaterialEnum.Mossy, InfiMaterialEnum.Redstone, "redstoneMossySword");
			boneMossySword = new InfiToolSword(PHInfiTools.mossySwordID + 4, InfiMaterialEnum.Mossy, InfiMaterialEnum.Bone, "boneMossySword");
			mossyMossySword = new InfiToolSword(PHInfiTools.mossySwordID + 5, InfiMaterialEnum.Mossy, InfiMaterialEnum.Mossy, "mossyMossySword");
			netherrackMossySword = new InfiToolSword(PHInfiTools.mossySwordID + 6, InfiMaterialEnum.Mossy, InfiMaterialEnum.Netherrack, "netherrackMossySword");
			glowstoneMossySword = new InfiToolSword(PHInfiTools.mossySwordID + 7, InfiMaterialEnum.Mossy, InfiMaterialEnum.Glowstone, "glowstoneMossySword");
			cactusMossySword = new InfiToolSword(PHInfiTools.mossySwordID + 8, InfiMaterialEnum.Mossy, InfiMaterialEnum.Cactus, "cactusMossySword");
			blazeMossySword = new InfiToolSword(PHInfiTools.mossySwordID + 9, InfiMaterialEnum.Mossy, InfiMaterialEnum.Blaze, "blazeMossySword");
			manyullynMossySword = new InfiToolSword(PHInfiTools.mossySwordID + 10, InfiMaterialEnum.Mossy, InfiMaterialEnum.Manyullyn, "manyullynMossySword");
			uraniumMossySword = new InfiToolSword(PHInfiTools.mossySwordID + 11, InfiMaterialEnum.Mossy, InfiMaterialEnum.Uranium, "uraniumMossySword");

			MinecraftForge.setToolClass(woodMossySword, "Sword", InfiMaterialEnum.Mossy.getHarvestLevel());
			MinecraftForge.setToolClass(stoneMossySword, "Sword", InfiMaterialEnum.Mossy.getHarvestLevel());
			MinecraftForge.setToolClass(diamondMossySword, "Sword", InfiMaterialEnum.Mossy.getHarvestLevel());
			MinecraftForge.setToolClass(redstoneMossySword, "Sword", InfiMaterialEnum.Mossy.getHarvestLevel());
			MinecraftForge.setToolClass(boneMossySword, "Sword", InfiMaterialEnum.Mossy.getHarvestLevel());
			MinecraftForge.setToolClass(mossyMossySword, "Sword", InfiMaterialEnum.Mossy.getHarvestLevel());
			MinecraftForge.setToolClass(netherrackMossySword, "Sword", InfiMaterialEnum.Mossy.getHarvestLevel());
			MinecraftForge.setToolClass(glowstoneMossySword, "Sword", InfiMaterialEnum.Mossy.getHarvestLevel());
			MinecraftForge.setToolClass(cactusMossySword, "Sword", InfiMaterialEnum.Mossy.getHarvestLevel());
			MinecraftForge.setToolClass(blazeMossySword, "Sword", InfiMaterialEnum.Mossy.getHarvestLevel());
			MinecraftForge.setToolClass(manyullynMossySword, "Sword", InfiMaterialEnum.Mossy.getHarvestLevel());
			MinecraftForge.setToolClass(uraniumMossySword, "Sword", InfiMaterialEnum.Mossy.getHarvestLevel());
		}

		if (PHInfiTools.enableNetherrackTools)
		{
			woodNetherrackSword = new InfiToolSword(PHInfiTools.netherrackSwordID + 0, InfiMaterialEnum.Netherrack, InfiMaterialEnum.Wood, "woodNetherrackSword");
			stoneNetherrackSword = new InfiToolSword(PHInfiTools.netherrackSwordID + 1, InfiMaterialEnum.Netherrack, InfiMaterialEnum.Stone, "stoneNetherrackSword");
			sandstoneNetherrackSword = new InfiToolSword(PHInfiTools.netherrackSwordID + 2, InfiMaterialEnum.Netherrack, InfiMaterialEnum.Sandstone, "sandstoneNetherrackSword");
			boneNetherrackSword = new InfiToolSword(PHInfiTools.netherrackSwordID + 3, InfiMaterialEnum.Netherrack, InfiMaterialEnum.Bone, "boneNetherrackSword");
			paperNetherrackSword = new InfiToolSword(PHInfiTools.netherrackSwordID + 4, InfiMaterialEnum.Netherrack, InfiMaterialEnum.Paper, "paperNetherrackSword");
			mossyNetherrackSword = new InfiToolSword(PHInfiTools.netherrackSwordID + 5, InfiMaterialEnum.Netherrack, InfiMaterialEnum.Mossy, "mossyNetherrackSword");
			netherrackNetherrackSword = new InfiToolSword(PHInfiTools.netherrackSwordID + 6, InfiMaterialEnum.Netherrack, InfiMaterialEnum.Netherrack, "netherrackNetherrackSword");
			iceNetherrackSword = new InfiToolSword(PHInfiTools.netherrackSwordID + 7, InfiMaterialEnum.Netherrack, InfiMaterialEnum.Ice, "iceNetherrackSword");
			slimeNetherrackSword = new InfiToolSword(PHInfiTools.netherrackSwordID + 8, InfiMaterialEnum.Netherrack, InfiMaterialEnum.Slime, "slimeNetherrackSword");
			cactusNetherrackSword = new InfiToolSword(PHInfiTools.netherrackSwordID + 9, InfiMaterialEnum.Netherrack, InfiMaterialEnum.Cactus, "cactusNetherrackSword");
			flintNetherrackSword = new InfiToolSword(PHInfiTools.netherrackSwordID + 10, InfiMaterialEnum.Netherrack, InfiMaterialEnum.Flint, "flintNetherrackSword");
			copperNetherrackSword = new InfiToolSword(PHInfiTools.netherrackSwordID + 11, InfiMaterialEnum.Netherrack, InfiMaterialEnum.Copper, "copperNetherrackSword");
			bronzeNetherrackSword = new InfiToolSword(PHInfiTools.netherrackSwordID + 12, InfiMaterialEnum.Netherrack, InfiMaterialEnum.Bronze, "bronzeNetherrackSword");

			MinecraftForge.setToolClass(woodNetherrackSword, "Sword", InfiMaterialEnum.Netherrack.getHarvestLevel());
			MinecraftForge.setToolClass(stoneNetherrackSword, "Sword", InfiMaterialEnum.Netherrack.getHarvestLevel());
			MinecraftForge.setToolClass(sandstoneNetherrackSword, "Sword", InfiMaterialEnum.Netherrack.getHarvestLevel());
			MinecraftForge.setToolClass(boneNetherrackSword, "Sword", InfiMaterialEnum.Netherrack.getHarvestLevel());
			MinecraftForge.setToolClass(paperNetherrackSword, "Sword", InfiMaterialEnum.Netherrack.getHarvestLevel());
			MinecraftForge.setToolClass(mossyNetherrackSword, "Sword", InfiMaterialEnum.Netherrack.getHarvestLevel());
			MinecraftForge.setToolClass(netherrackNetherrackSword, "Sword", InfiMaterialEnum.Netherrack.getHarvestLevel());
			MinecraftForge.setToolClass(iceNetherrackSword, "Sword", InfiMaterialEnum.Netherrack.getHarvestLevel());
			MinecraftForge.setToolClass(slimeNetherrackSword, "Sword", InfiMaterialEnum.Netherrack.getHarvestLevel());
			MinecraftForge.setToolClass(cactusNetherrackSword, "Sword", InfiMaterialEnum.Netherrack.getHarvestLevel());
			MinecraftForge.setToolClass(flintNetherrackSword, "Sword", InfiMaterialEnum.Netherrack.getHarvestLevel());
			MinecraftForge.setToolClass(copperNetherrackSword, "Sword", InfiMaterialEnum.Netherrack.getHarvestLevel());
			MinecraftForge.setToolClass(bronzeNetherrackSword, "Sword", InfiMaterialEnum.Netherrack.getHarvestLevel());
		}

		if (PHInfiTools.enableGlowstoneTools)
		{
			woodGlowstoneSword = new InfiToolSword(PHInfiTools.glowstoneSwordID + 0, InfiMaterialEnum.Glowstone, InfiMaterialEnum.Wood, "woodGlowstoneSword");
			redstoneGlowstoneSword = new InfiToolSword(PHInfiTools.glowstoneSwordID + 1, InfiMaterialEnum.Glowstone, InfiMaterialEnum.Redstone, "redstoneGlowstoneSword");
			obsidianGlowstoneSword = new InfiToolSword(PHInfiTools.glowstoneSwordID + 2, InfiMaterialEnum.Glowstone, InfiMaterialEnum.Obsidian, "obsidianGlowstoneSword");
			boneGlowstoneSword = new InfiToolSword(PHInfiTools.glowstoneSwordID + 3, InfiMaterialEnum.Glowstone, InfiMaterialEnum.Bone, "boneGlowstoneSword");
			netherrackGlowstoneSword = new InfiToolSword(PHInfiTools.glowstoneSwordID + 4, InfiMaterialEnum.Glowstone, InfiMaterialEnum.Netherrack, "netherrackGlowstoneSword");
			glowstoneGlowstoneSword = new InfiToolSword(PHInfiTools.glowstoneSwordID + 5, InfiMaterialEnum.Glowstone, InfiMaterialEnum.Glowstone, "glowstoneGlowstoneSword");
			iceGlowstoneSword = new InfiToolSword(PHInfiTools.glowstoneSwordID + 6, InfiMaterialEnum.Glowstone, InfiMaterialEnum.Ice, "iceGlowstoneSword");
			slimeGlowstoneSword = new InfiToolSword(PHInfiTools.glowstoneSwordID + 7, InfiMaterialEnum.Glowstone, InfiMaterialEnum.Slime, "slimeGlowstoneSword");
			cactusGlowstoneSword = new InfiToolSword(PHInfiTools.glowstoneSwordID + 8, InfiMaterialEnum.Glowstone, InfiMaterialEnum.Cactus, "cactusGlowstoneSword");

			MinecraftForge.setToolClass(woodGlowstoneSword, "Sword", InfiMaterialEnum.Glowstone.getHarvestLevel());
			MinecraftForge.setToolClass(redstoneGlowstoneSword, "Sword", InfiMaterialEnum.Glowstone.getHarvestLevel());
			MinecraftForge.setToolClass(obsidianGlowstoneSword, "Sword", InfiMaterialEnum.Glowstone.getHarvestLevel());
			MinecraftForge.setToolClass(boneGlowstoneSword, "Sword", InfiMaterialEnum.Glowstone.getHarvestLevel());
			MinecraftForge.setToolClass(netherrackGlowstoneSword, "Sword", InfiMaterialEnum.Glowstone.getHarvestLevel());
			MinecraftForge.setToolClass(glowstoneGlowstoneSword, "Sword", InfiMaterialEnum.Glowstone.getHarvestLevel());
			MinecraftForge.setToolClass(iceGlowstoneSword, "Sword", InfiMaterialEnum.Glowstone.getHarvestLevel());
			MinecraftForge.setToolClass(slimeGlowstoneSword, "Sword", InfiMaterialEnum.Glowstone.getHarvestLevel());
			MinecraftForge.setToolClass(cactusGlowstoneSword, "Sword", InfiMaterialEnum.Glowstone.getHarvestLevel());
		}

		if (PHInfiTools.enableIceTools)
		{
			woodIceSword = new InfiToolSword(PHInfiTools.iceSwordID + 0, InfiMaterialEnum.Ice, InfiMaterialEnum.Wood, "woodIceSword");
			boneIceSword = new InfiToolSword(PHInfiTools.iceSwordID + 1, InfiMaterialEnum.Ice, InfiMaterialEnum.Bone, "boneIceSword");
			paperIceSword = new InfiToolSword(PHInfiTools.iceSwordID + 2, InfiMaterialEnum.Ice, InfiMaterialEnum.Paper, "paperIceSword");
			iceIceSword = new InfiToolSword(PHInfiTools.iceSwordID + 3, InfiMaterialEnum.Ice, InfiMaterialEnum.Ice, "iceIceSword");
			slimeIceSword = new InfiToolSword(PHInfiTools.iceSwordID + 4, InfiMaterialEnum.Ice, InfiMaterialEnum.Slime, "slimeIceSword");
			cactusIceSword = new InfiToolSword(PHInfiTools.iceSwordID + 5, InfiMaterialEnum.Ice, InfiMaterialEnum.Cactus, "cactusIceSword");

			MinecraftForge.setToolClass(woodIceSword, "Sword", InfiMaterialEnum.Ice.getHarvestLevel());
			MinecraftForge.setToolClass(boneIceSword, "Sword", InfiMaterialEnum.Ice.getHarvestLevel());
			MinecraftForge.setToolClass(paperIceSword, "Sword", InfiMaterialEnum.Ice.getHarvestLevel());
			MinecraftForge.setToolClass(iceIceSword, "Sword", InfiMaterialEnum.Ice.getHarvestLevel());
			MinecraftForge.setToolClass(slimeIceSword, "Sword", InfiMaterialEnum.Ice.getHarvestLevel());
			MinecraftForge.setToolClass(cactusIceSword, "Sword", InfiMaterialEnum.Ice.getHarvestLevel());
		}

		if (PHInfiTools.enableLavaTools)
		{
			diamondLavaSword = new InfiToolSword(PHInfiTools.lavaSwordID + 0, InfiMaterialEnum.Lava, InfiMaterialEnum.Diamond, "diamondLavaSword");
			obsidianLavaSword = new InfiToolSword(PHInfiTools.lavaSwordID + 1, InfiMaterialEnum.Lava, InfiMaterialEnum.Obsidian, "obsidianLavaSword");
			netherrackLavaSword = new InfiToolSword(PHInfiTools.lavaSwordID + 2, InfiMaterialEnum.Lava, InfiMaterialEnum.Netherrack, "netherrackLavaSword");
			lavaLavaSword = new InfiToolSword(PHInfiTools.lavaSwordID + 3, InfiMaterialEnum.Lava, InfiMaterialEnum.Lava, "lavaLavaSword");
			flintLavaSword = new InfiToolSword(PHInfiTools.lavaSwordID + 4, InfiMaterialEnum.Lava, InfiMaterialEnum.Flint, "flintLavaSword");
			blazeLavaSword = new InfiToolSword(PHInfiTools.lavaSwordID + 5, InfiMaterialEnum.Lava, InfiMaterialEnum.Blaze, "blazeLavaSword");
			manyullynLavaSword = new InfiToolSword(PHInfiTools.lavaSwordID + 6, InfiMaterialEnum.Lava, InfiMaterialEnum.Manyullyn, "manyullynLavaSword");
			uraniumLavaSword = new InfiToolSword(PHInfiTools.lavaSwordID + 7, InfiMaterialEnum.Lava, InfiMaterialEnum.Uranium, "uraniumLavaSword");

			MinecraftForge.setToolClass(diamondLavaSword, "Sword", InfiMaterialEnum.Lava.getHarvestLevel());
			MinecraftForge.setToolClass(obsidianLavaSword, "Sword", InfiMaterialEnum.Lava.getHarvestLevel());
			MinecraftForge.setToolClass(netherrackLavaSword, "Sword", InfiMaterialEnum.Lava.getHarvestLevel());
			MinecraftForge.setToolClass(lavaLavaSword, "Sword", InfiMaterialEnum.Lava.getHarvestLevel());
			MinecraftForge.setToolClass(flintLavaSword, "Sword", InfiMaterialEnum.Lava.getHarvestLevel());
			MinecraftForge.setToolClass(blazeLavaSword, "Sword", InfiMaterialEnum.Lava.getHarvestLevel());
			MinecraftForge.setToolClass(manyullynLavaSword, "Sword", InfiMaterialEnum.Lava.getHarvestLevel());
			MinecraftForge.setToolClass(uraniumLavaSword, "Sword", InfiMaterialEnum.Lava.getHarvestLevel());
		}

		if (PHInfiTools.enableSlimeTools)
		{
			woodSlimeSword = new InfiToolSword(PHInfiTools.slimeSwordID + 0, InfiMaterialEnum.Slime, InfiMaterialEnum.Wood, "woodSlimeSword");
			sandstoneSlimeSword = new InfiToolSword(PHInfiTools.slimeSwordID + 1, InfiMaterialEnum.Slime, InfiMaterialEnum.Sandstone, "sandstoneSlimeSword");
			boneSlimeSword = new InfiToolSword(PHInfiTools.slimeSwordID + 2, InfiMaterialEnum.Slime, InfiMaterialEnum.Bone, "boneSlimeSword");
			paperSlimeSword = new InfiToolSword(PHInfiTools.slimeSwordID + 3, InfiMaterialEnum.Slime, InfiMaterialEnum.Paper, "paperSlimeSword");
			slimeSlimeSword = new InfiToolSword(PHInfiTools.slimeSwordID + 4, InfiMaterialEnum.Slime, InfiMaterialEnum.Slime, "slimeSlimeSword");
			cactusSlimeSword = new InfiToolSword(PHInfiTools.slimeSwordID + 5, InfiMaterialEnum.Slime, InfiMaterialEnum.Cactus, "cactusSlimeSword");

			MinecraftForge.setToolClass(woodSlimeSword, "Sword", InfiMaterialEnum.Slime.getHarvestLevel());
			MinecraftForge.setToolClass(sandstoneSlimeSword, "Sword", InfiMaterialEnum.Slime.getHarvestLevel());
			MinecraftForge.setToolClass(boneSlimeSword, "Sword", InfiMaterialEnum.Slime.getHarvestLevel());
			MinecraftForge.setToolClass(paperSlimeSword, "Sword", InfiMaterialEnum.Slime.getHarvestLevel());
			MinecraftForge.setToolClass(slimeSlimeSword, "Sword", InfiMaterialEnum.Slime.getHarvestLevel());
			MinecraftForge.setToolClass(cactusSlimeSword, "Sword", InfiMaterialEnum.Slime.getHarvestLevel());
		}

		if (PHInfiTools.enableCactusTools)
		{
			woodCactusSword = new InfiToolSword(PHInfiTools.cactusSwordID + 0, InfiMaterialEnum.Cactus, InfiMaterialEnum.Wood, "woodCactusSword");
			sandstoneCactusSword = new InfiToolSword(PHInfiTools.cactusSwordID + 1, InfiMaterialEnum.Cactus, InfiMaterialEnum.Sandstone, "sandstoneCactusSword");
			boneCactusSword = new InfiToolSword(PHInfiTools.cactusSwordID + 2, InfiMaterialEnum.Cactus, InfiMaterialEnum.Bone, "boneCactusSword");
			netherrackCactusSword = new InfiToolSword(PHInfiTools.cactusSwordID + 3, InfiMaterialEnum.Cactus, InfiMaterialEnum.Netherrack, "netherrackCactusSword");
			iceCactusSword = new InfiToolSword(PHInfiTools.cactusSwordID + 4, InfiMaterialEnum.Cactus, InfiMaterialEnum.Ice, "iceCactusSword");
			slimeCactusSword = new InfiToolSword(PHInfiTools.cactusSwordID + 5, InfiMaterialEnum.Cactus, InfiMaterialEnum.Slime, "slimeCactusSword");
			cactusCactusSword = new InfiToolSword(PHInfiTools.cactusSwordID + 6, InfiMaterialEnum.Cactus, InfiMaterialEnum.Cactus, "cactusCactusSword");

			MinecraftForge.setToolClass(woodCactusSword, "Sword", InfiMaterialEnum.Cactus.getHarvestLevel());
			MinecraftForge.setToolClass(sandstoneCactusSword, "Sword", InfiMaterialEnum.Cactus.getHarvestLevel());
			MinecraftForge.setToolClass(boneCactusSword, "Sword", InfiMaterialEnum.Cactus.getHarvestLevel());
			MinecraftForge.setToolClass(netherrackCactusSword, "Sword", InfiMaterialEnum.Cactus.getHarvestLevel());
			MinecraftForge.setToolClass(iceCactusSword, "Sword", InfiMaterialEnum.Cactus.getHarvestLevel());
			MinecraftForge.setToolClass(slimeCactusSword, "Sword", InfiMaterialEnum.Cactus.getHarvestLevel());
			MinecraftForge.setToolClass(cactusCactusSword, "Sword", InfiMaterialEnum.Cactus.getHarvestLevel());
		}

		if (PHInfiTools.enableFlintTools)
		{
			woodFlintSword = new InfiToolSword(PHInfiTools.flintSwordID + 0, InfiMaterialEnum.Flint, InfiMaterialEnum.Wood, "woodFlintSword");
			stoneFlintSword = new InfiToolSword(PHInfiTools.flintSwordID + 1, InfiMaterialEnum.Flint, InfiMaterialEnum.Stone, "stoneFlintSword");
			sandstoneFlintSword = new InfiToolSword(PHInfiTools.flintSwordID + 2, InfiMaterialEnum.Flint, InfiMaterialEnum.Sandstone, "sandstoneFlintSword");
			boneFlintSword = new InfiToolSword(PHInfiTools.flintSwordID + 3, InfiMaterialEnum.Flint, InfiMaterialEnum.Bone, "boneFlintSword");
			netherrackFlintSword = new InfiToolSword(PHInfiTools.flintSwordID + 4, InfiMaterialEnum.Flint, InfiMaterialEnum.Netherrack, "netherrackFlintSword");
			slimeFlintSword = new InfiToolSword(PHInfiTools.flintSwordID + 5, InfiMaterialEnum.Flint, InfiMaterialEnum.Slime, "slimeFlintSword");
			cactusFlintSword = new InfiToolSword(PHInfiTools.flintSwordID + 6, InfiMaterialEnum.Flint, InfiMaterialEnum.Cactus, "cactusFlintSword");
			flintFlintSword = new InfiToolSword(PHInfiTools.flintSwordID + 7, InfiMaterialEnum.Flint, InfiMaterialEnum.Flint, "flintFlintSword");
			copperFlintSword = new InfiToolSword(PHInfiTools.flintSwordID + 8, InfiMaterialEnum.Flint, InfiMaterialEnum.Copper, "copperFlintSword");
			bronzeFlintSword = new InfiToolSword(PHInfiTools.flintSwordID + 9, InfiMaterialEnum.Flint, InfiMaterialEnum.Bronze, "bronzeFlintSword");

			MinecraftForge.setToolClass(woodFlintSword, "Sword", InfiMaterialEnum.Flint.getHarvestLevel());
			MinecraftForge.setToolClass(stoneFlintSword, "Sword", InfiMaterialEnum.Flint.getHarvestLevel());
			MinecraftForge.setToolClass(sandstoneFlintSword, "Sword", InfiMaterialEnum.Flint.getHarvestLevel());
			MinecraftForge.setToolClass(boneFlintSword, "Sword", InfiMaterialEnum.Flint.getHarvestLevel());
			MinecraftForge.setToolClass(netherrackFlintSword, "Sword", InfiMaterialEnum.Flint.getHarvestLevel());
			MinecraftForge.setToolClass(slimeFlintSword, "Sword", InfiMaterialEnum.Flint.getHarvestLevel());
			MinecraftForge.setToolClass(cactusFlintSword, "Sword", InfiMaterialEnum.Flint.getHarvestLevel());
			MinecraftForge.setToolClass(flintFlintSword, "Sword", InfiMaterialEnum.Flint.getHarvestLevel());
			MinecraftForge.setToolClass(copperFlintSword, "Sword", InfiMaterialEnum.Flint.getHarvestLevel());
			MinecraftForge.setToolClass(bronzeFlintSword, "Sword", InfiMaterialEnum.Flint.getHarvestLevel());
		}

		if (PHInfiTools.enableBlazeTools)
		{
			diamondBlazeSword = new InfiToolSword(PHInfiTools.blazeSwordID + 0, InfiMaterialEnum.Blaze, InfiMaterialEnum.Diamond, "diamondBlazeSword");
			obsidianBlazeSword = new InfiToolSword(PHInfiTools.blazeSwordID + 1, InfiMaterialEnum.Blaze, InfiMaterialEnum.Obsidian, "obsidianBlazeSword");
			netherrackBlazeSword = new InfiToolSword(PHInfiTools.blazeSwordID + 2, InfiMaterialEnum.Blaze, InfiMaterialEnum.Netherrack, "netherrackBlazeSword");
			lavaBlazeSword = new InfiToolSword(PHInfiTools.blazeSwordID + 3, InfiMaterialEnum.Blaze, InfiMaterialEnum.Lava, "lavaBlazeSword");
			flintBlazeSword = new InfiToolSword(PHInfiTools.blazeSwordID + 4, InfiMaterialEnum.Blaze, InfiMaterialEnum.Flint, "flintBlazeSword");
			blazeBlazeSword = new InfiToolSword(PHInfiTools.blazeSwordID + 5, InfiMaterialEnum.Blaze, InfiMaterialEnum.Blaze, "blazeBlazeSword");
			manyullynBlazeSword = new InfiToolSword(PHInfiTools.blazeSwordID + 6, InfiMaterialEnum.Blaze, InfiMaterialEnum.Manyullyn, "manyullynBlazeSword");
			uraniumBlazeSword = new InfiToolSword(PHInfiTools.blazeSwordID + 7, InfiMaterialEnum.Blaze, InfiMaterialEnum.Uranium, "uraniumBlazeSword");

			MinecraftForge.setToolClass(diamondBlazeSword, "Sword", InfiMaterialEnum.Blaze.getHarvestLevel());
			MinecraftForge.setToolClass(obsidianBlazeSword, "Sword", InfiMaterialEnum.Blaze.getHarvestLevel());
			MinecraftForge.setToolClass(netherrackBlazeSword, "Sword", InfiMaterialEnum.Blaze.getHarvestLevel());
			MinecraftForge.setToolClass(blazeBlazeSword, "Sword", InfiMaterialEnum.Blaze.getHarvestLevel());
			MinecraftForge.setToolClass(flintBlazeSword, "Sword", InfiMaterialEnum.Blaze.getHarvestLevel());
			MinecraftForge.setToolClass(blazeBlazeSword, "Sword", InfiMaterialEnum.Blaze.getHarvestLevel());
			MinecraftForge.setToolClass(manyullynBlazeSword, "Sword", InfiMaterialEnum.Blaze.getHarvestLevel());
			MinecraftForge.setToolClass(uraniumBlazeSword, "Sword", InfiMaterialEnum.Blaze.getHarvestLevel());
		}

		if (PHInfiTools.enableCopperTools)
		{
			woodCopperSword = new InfiToolSword(PHInfiTools.copperSwordID + 0, InfiMaterialEnum.Copper, InfiMaterialEnum.Wood, "woodCopperSword");
			stoneCopperSword = new InfiToolSword(PHInfiTools.copperSwordID + 1, InfiMaterialEnum.Copper, InfiMaterialEnum.Stone, "stoneCopperSword");
			boneCopperSword = new InfiToolSword(PHInfiTools.copperSwordID + 2, InfiMaterialEnum.Copper, InfiMaterialEnum.Bone, "boneCopperSword");
			netherrackCopperSword = new InfiToolSword(PHInfiTools.copperSwordID + 3, InfiMaterialEnum.Copper, InfiMaterialEnum.Netherrack, "netherrackCopperSword");
			slimeCopperSword = new InfiToolSword(PHInfiTools.copperSwordID + 4, InfiMaterialEnum.Copper, InfiMaterialEnum.Slime, "slimeCopperSword");
			cactusCopperSword = new InfiToolSword(PHInfiTools.copperSwordID + 5, InfiMaterialEnum.Copper, InfiMaterialEnum.Cactus, "cactusCopperSword");
			flintCopperSword = new InfiToolSword(PHInfiTools.copperSwordID + 6, InfiMaterialEnum.Copper, InfiMaterialEnum.Flint, "flintCopperSword");
			copperCopperSword = new InfiToolSword(PHInfiTools.copperSwordID + 7, InfiMaterialEnum.Copper, InfiMaterialEnum.Copper, "copperCopperSword");

			MinecraftForge.setToolClass(woodCopperSword, "Sword", InfiMaterialEnum.Copper.getHarvestLevel());
			MinecraftForge.setToolClass(stoneCopperSword, "Sword", InfiMaterialEnum.Copper.getHarvestLevel());
			MinecraftForge.setToolClass(boneCopperSword, "Sword", InfiMaterialEnum.Copper.getHarvestLevel());
			MinecraftForge.setToolClass(netherrackCopperSword, "Sword", InfiMaterialEnum.Copper.getHarvestLevel());
			MinecraftForge.setToolClass(slimeCopperSword, "Sword", InfiMaterialEnum.Copper.getHarvestLevel());
			MinecraftForge.setToolClass(cactusCopperSword, "Sword", InfiMaterialEnum.Copper.getHarvestLevel());
			MinecraftForge.setToolClass(flintCopperSword, "Sword", InfiMaterialEnum.Copper.getHarvestLevel());
			MinecraftForge.setToolClass(copperCopperSword, "Sword", InfiMaterialEnum.Copper.getHarvestLevel());
		}

		if (PHInfiTools.enableBronzeTools)
		{
			woodBronzeSword = new InfiToolSword(PHInfiTools.bronzeSwordID + 0, InfiMaterialEnum.Bronze, InfiMaterialEnum.Wood, "woodBronzeSword");
			stoneBronzeSword = new InfiToolSword(PHInfiTools.bronzeSwordID + 1, InfiMaterialEnum.Bronze, InfiMaterialEnum.Stone, "stoneBronzeSword");
			boneBronzeSword = new InfiToolSword(PHInfiTools.bronzeSwordID + 2, InfiMaterialEnum.Bronze, InfiMaterialEnum.Bone, "boneBronzeSword");
			netherrackBronzeSword = new InfiToolSword(PHInfiTools.bronzeSwordID + 3, InfiMaterialEnum.Bronze, InfiMaterialEnum.Netherrack, "netherrackBronzeSword");
			slimeBronzeSword = new InfiToolSword(PHInfiTools.bronzeSwordID + 4, InfiMaterialEnum.Bronze, InfiMaterialEnum.Slime, "slimeBronzeSword");
			cactusBronzeSword = new InfiToolSword(PHInfiTools.bronzeSwordID + 5, InfiMaterialEnum.Bronze, InfiMaterialEnum.Cactus, "cactusBronzeSword");
			flintBronzeSword = new InfiToolSword(PHInfiTools.bronzeSwordID + 6, InfiMaterialEnum.Bronze, InfiMaterialEnum.Flint, "flintBronzeSword");
			copperBronzeSword = new InfiToolSword(PHInfiTools.bronzeSwordID + 7, InfiMaterialEnum.Bronze, InfiMaterialEnum.Copper, "copperBronzeSword");
			bronzeBronzeSword = new InfiToolSword(PHInfiTools.bronzeSwordID + 8, InfiMaterialEnum.Bronze, InfiMaterialEnum.Bronze, "bronzeBronzeSword");

			MinecraftForge.setToolClass(woodBronzeSword, "Sword", InfiMaterialEnum.Bronze.getHarvestLevel());
			MinecraftForge.setToolClass(stoneBronzeSword, "Sword", InfiMaterialEnum.Bronze.getHarvestLevel());
			MinecraftForge.setToolClass(boneBronzeSword, "Sword", InfiMaterialEnum.Bronze.getHarvestLevel());
			MinecraftForge.setToolClass(netherrackBronzeSword, "Sword", InfiMaterialEnum.Bronze.getHarvestLevel());
			MinecraftForge.setToolClass(slimeBronzeSword, "Sword", InfiMaterialEnum.Bronze.getHarvestLevel());
			MinecraftForge.setToolClass(cactusBronzeSword, "Sword", InfiMaterialEnum.Bronze.getHarvestLevel());
			MinecraftForge.setToolClass(flintBronzeSword, "Sword", InfiMaterialEnum.Bronze.getHarvestLevel());
			MinecraftForge.setToolClass(copperBronzeSword, "Sword", InfiMaterialEnum.Bronze.getHarvestLevel());
			MinecraftForge.setToolClass(bronzeBronzeSword, "Sword", InfiMaterialEnum.Bronze.getHarvestLevel());
		}

		if (PHInfiTools.enableWorkedIronTools)
		{
			woodWorkedIronSword = new InfiToolSword(PHInfiTools.workedIronSwordID + 0, InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Wood, "woodWorkedIronSword");
			stoneWorkedIronSword = new InfiToolSword(PHInfiTools.workedIronSwordID + 1, InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Stone, "stoneWorkedIronSword");
			ironWorkedIronSword = new InfiToolSword(PHInfiTools.workedIronSwordID + 2, InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Iron, "ironWorkedIronSword");
			diamondWorkedIronSword = new InfiToolSword(PHInfiTools.workedIronSwordID + 3, InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Diamond, "diamondWorkedIronSword");
			redstoneWorkedIronSword = new InfiToolSword(PHInfiTools.workedIronSwordID + 4, InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Redstone, "redstoneWorkedIronSword");
			obsidianWorkedIronSword = new InfiToolSword(PHInfiTools.workedIronSwordID + 5, InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Obsidian, "obsidianWorkedIronSword");
			boneWorkedIronSword = new InfiToolSword(PHInfiTools.workedIronSwordID + 6, InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Bone, "boneWorkedIronSword");
			netherrackWorkedIronSword = new InfiToolSword(PHInfiTools.workedIronSwordID + 7, InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Netherrack, "netherrackWorkedIronSword");
			glowstoneWorkedIronSword = new InfiToolSword(PHInfiTools.workedIronSwordID + 8, InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Glowstone, "glowstoneWorkedIronSword");
			iceWorkedIronSword = new InfiToolSword(PHInfiTools.workedIronSwordID + 9, InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Ice, "iceWorkedIronSword");
			slimeWorkedIronSword = new InfiToolSword(PHInfiTools.workedIronSwordID + 10, InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Slime, "slimeWorkedIronSword");
			cactusWorkedIronSword = new InfiToolSword(PHInfiTools.workedIronSwordID + 11, InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Cactus, "cactusWorkedIronSword");
			blazeWorkedIronSword = new InfiToolSword(PHInfiTools.workedIronSwordID + 12, InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Blaze, "blazeWorkedIronSword");
			copperWorkedIronSword = new InfiToolSword(PHInfiTools.workedIronSwordID + 13, InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Copper, "copperWorkedIronSword");
			bronzeWorkedIronSword = new InfiToolSword(PHInfiTools.workedIronSwordID + 14, InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Bronze, "bronzeWorkedIronSword");
			workedWorkedIronSword = new InfiToolSword(PHInfiTools.workedIronSwordID + 15, InfiMaterialEnum.WorkedIron, InfiMaterialEnum.WorkedIron, "workedWorkedIronSword");
			steelWorkedIronSword = new InfiToolSword(PHInfiTools.workedIronSwordID + 16, InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Steel, "steelWorkedIronSword");
			uraniumWorkedIronSword = new InfiToolSword(PHInfiTools.workedIronSwordID + 17, InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Uranium, "uraniumWorkedIronSword");

			MinecraftForge.setToolClass(woodWorkedIronSword, "Sword", InfiMaterialEnum.WorkedIron.getHarvestLevel());
			MinecraftForge.setToolClass(stoneWorkedIronSword, "Sword", InfiMaterialEnum.WorkedIron.getHarvestLevel());
			MinecraftForge.setToolClass(ironWorkedIronSword, "Sword", InfiMaterialEnum.WorkedIron.getHarvestLevel());
			MinecraftForge.setToolClass(diamondWorkedIronSword, "Sword", InfiMaterialEnum.WorkedIron.getHarvestLevel());
			MinecraftForge.setToolClass(redstoneWorkedIronSword, "Sword", InfiMaterialEnum.WorkedIron.getHarvestLevel());
			MinecraftForge.setToolClass(obsidianWorkedIronSword, "Sword", InfiMaterialEnum.WorkedIron.getHarvestLevel());
			MinecraftForge.setToolClass(boneWorkedIronSword, "Sword", InfiMaterialEnum.WorkedIron.getHarvestLevel());
			MinecraftForge.setToolClass(netherrackWorkedIronSword, "Sword", InfiMaterialEnum.WorkedIron.getHarvestLevel());
			MinecraftForge.setToolClass(glowstoneWorkedIronSword, "Sword", InfiMaterialEnum.WorkedIron.getHarvestLevel());
			MinecraftForge.setToolClass(iceWorkedIronSword, "Sword", InfiMaterialEnum.WorkedIron.getHarvestLevel());
			MinecraftForge.setToolClass(slimeWorkedIronSword, "Sword", InfiMaterialEnum.WorkedIron.getHarvestLevel());
			MinecraftForge.setToolClass(cactusWorkedIronSword, "Sword", InfiMaterialEnum.WorkedIron.getHarvestLevel());
			MinecraftForge.setToolClass(blazeWorkedIronSword, "Sword", InfiMaterialEnum.WorkedIron.getHarvestLevel());
			MinecraftForge.setToolClass(copperWorkedIronSword, "Sword", InfiMaterialEnum.WorkedIron.getHarvestLevel());
			MinecraftForge.setToolClass(bronzeWorkedIronSword, "Sword", InfiMaterialEnum.WorkedIron.getHarvestLevel());
			MinecraftForge.setToolClass(workedWorkedIronSword, "Sword", InfiMaterialEnum.WorkedIron.getHarvestLevel());
			MinecraftForge.setToolClass(steelWorkedIronSword, "Sword", InfiMaterialEnum.WorkedIron.getHarvestLevel());
			MinecraftForge.setToolClass(uraniumWorkedIronSword, "Sword", InfiMaterialEnum.WorkedIron.getHarvestLevel());
		}

		if (PHInfiTools.enableSteelTools)
		{
			woodSteelSword = new InfiToolSword(PHInfiTools.steelSwordID + 0, InfiMaterialEnum.Steel, InfiMaterialEnum.Wood, "woodSteelSword");
			stoneSteelSword = new InfiToolSword(PHInfiTools.steelSwordID + 1, InfiMaterialEnum.Steel, InfiMaterialEnum.Stone, "stoneSteelSword");
			ironSteelSword = new InfiToolSword(PHInfiTools.steelSwordID + 2, InfiMaterialEnum.Steel, InfiMaterialEnum.Iron, "ironSteelSword");
			diamondSteelSword = new InfiToolSword(PHInfiTools.steelSwordID + 3, InfiMaterialEnum.Steel, InfiMaterialEnum.Diamond, "diamondSteelSword");
			redstoneSteelSword = new InfiToolSword(PHInfiTools.steelSwordID + 4, InfiMaterialEnum.Steel, InfiMaterialEnum.Redstone, "redstoneSteelSword");
			obsidianSteelSword = new InfiToolSword(PHInfiTools.steelSwordID + 5, InfiMaterialEnum.Steel, InfiMaterialEnum.Obsidian, "obsidianSteelSword");
			boneSteelSword = new InfiToolSword(PHInfiTools.steelSwordID + 6, InfiMaterialEnum.Steel, InfiMaterialEnum.Bone, "boneSteelSword");
			netherrackSteelSword = new InfiToolSword(PHInfiTools.steelSwordID + 7, InfiMaterialEnum.Steel, InfiMaterialEnum.Netherrack, "netherrackSteelSword");
			glowstoneSteelSword = new InfiToolSword(PHInfiTools.steelSwordID + 8, InfiMaterialEnum.Steel, InfiMaterialEnum.Glowstone, "glowstoneSteelSword");
			iceSteelSword = new InfiToolSword(PHInfiTools.steelSwordID + 9, InfiMaterialEnum.Steel, InfiMaterialEnum.Ice, "iceSteelSword");
			slimeSteelSword = new InfiToolSword(PHInfiTools.steelSwordID + 10, InfiMaterialEnum.Steel, InfiMaterialEnum.Slime, "slimeSteelSword");
			cactusSteelSword = new InfiToolSword(PHInfiTools.steelSwordID + 11, InfiMaterialEnum.Steel, InfiMaterialEnum.Cactus, "cactusSteelSword");
			blazeSteelSword = new InfiToolSword(PHInfiTools.steelSwordID + 12, InfiMaterialEnum.Steel, InfiMaterialEnum.Blaze, "blazeSteelSword");
			copperSteelSword = new InfiToolSword(PHInfiTools.steelSwordID + 13, InfiMaterialEnum.Steel, InfiMaterialEnum.Copper, "copperSteelSword");
			bronzeSteelSword = new InfiToolSword(PHInfiTools.steelSwordID + 14, InfiMaterialEnum.Steel, InfiMaterialEnum.Bronze, "bronzeSteelSword");
			workedSteelSword = new InfiToolSword(PHInfiTools.steelSwordID + 15, InfiMaterialEnum.Steel, InfiMaterialEnum.WorkedIron, "workedSteelSword");
			steelSteelSword = new InfiToolSword(PHInfiTools.steelSwordID + 16, InfiMaterialEnum.Steel, InfiMaterialEnum.Steel, "steelSteelSword");
			cobaltSteelSword = new InfiToolSword(PHInfiTools.steelSwordID + 17, InfiMaterialEnum.Steel, InfiMaterialEnum.Cobalt, "cobaltSteelSword");
			arditeSteelSword = new InfiToolSword(PHInfiTools.steelSwordID + 18, InfiMaterialEnum.Steel, InfiMaterialEnum.Ardite, "arditeSteelSword");
			uraniumSteelSword = new InfiToolSword(PHInfiTools.steelSwordID + 19, InfiMaterialEnum.Steel, InfiMaterialEnum.Uranium, "uraniumSteelSword");

			MinecraftForge.setToolClass(woodSteelSword, "Sword", InfiMaterialEnum.Steel.getHarvestLevel());
			MinecraftForge.setToolClass(stoneSteelSword, "Sword", InfiMaterialEnum.Steel.getHarvestLevel());
			MinecraftForge.setToolClass(ironSteelSword, "Sword", InfiMaterialEnum.Steel.getHarvestLevel());
			MinecraftForge.setToolClass(diamondSteelSword, "Sword", InfiMaterialEnum.Steel.getHarvestLevel());
			MinecraftForge.setToolClass(redstoneSteelSword, "Sword", InfiMaterialEnum.Steel.getHarvestLevel());
			MinecraftForge.setToolClass(obsidianSteelSword, "Sword", InfiMaterialEnum.Steel.getHarvestLevel());
			MinecraftForge.setToolClass(boneSteelSword, "Sword", InfiMaterialEnum.Steel.getHarvestLevel());
			MinecraftForge.setToolClass(netherrackSteelSword, "Sword", InfiMaterialEnum.Steel.getHarvestLevel());
			MinecraftForge.setToolClass(glowstoneSteelSword, "Sword", InfiMaterialEnum.Steel.getHarvestLevel());
			MinecraftForge.setToolClass(iceSteelSword, "Sword", InfiMaterialEnum.Steel.getHarvestLevel());
			MinecraftForge.setToolClass(slimeSteelSword, "Sword", InfiMaterialEnum.Steel.getHarvestLevel());
			MinecraftForge.setToolClass(cactusSteelSword, "Sword", InfiMaterialEnum.Steel.getHarvestLevel());
			MinecraftForge.setToolClass(blazeSteelSword, "Sword", InfiMaterialEnum.Steel.getHarvestLevel());
			MinecraftForge.setToolClass(copperSteelSword, "Sword", InfiMaterialEnum.Steel.getHarvestLevel());
			MinecraftForge.setToolClass(bronzeSteelSword, "Sword", InfiMaterialEnum.Steel.getHarvestLevel());
			MinecraftForge.setToolClass(workedSteelSword, "Sword", InfiMaterialEnum.Steel.getHarvestLevel());
			MinecraftForge.setToolClass(steelSteelSword, "Sword", InfiMaterialEnum.Steel.getHarvestLevel());
			MinecraftForge.setToolClass(cobaltSteelSword, "Sword", InfiMaterialEnum.Steel.getHarvestLevel());
			MinecraftForge.setToolClass(arditeSteelSword, "Sword", InfiMaterialEnum.Steel.getHarvestLevel());
			MinecraftForge.setToolClass(uraniumSteelSword, "Sword", InfiMaterialEnum.Steel.getHarvestLevel());
		}

		if (PHInfiTools.enableCobaltTools)
		{
			woodCobaltSword = new InfiToolSword(PHInfiTools.cobaltSwordID + 0, InfiMaterialEnum.Cobalt, InfiMaterialEnum.Wood, "woodCobaltSword");
			stoneCobaltSword = new InfiToolSword(PHInfiTools.cobaltSwordID + 1, InfiMaterialEnum.Cobalt, InfiMaterialEnum.Stone, "stoneCobaltSword");
			ironCobaltSword = new InfiToolSword(PHInfiTools.cobaltSwordID + 2, InfiMaterialEnum.Cobalt, InfiMaterialEnum.Iron, "ironCobaltSword");
			diamondCobaltSword = new InfiToolSword(PHInfiTools.cobaltSwordID + 3, InfiMaterialEnum.Cobalt, InfiMaterialEnum.Diamond, "diamondCobaltSword");
			redstoneCobaltSword = new InfiToolSword(PHInfiTools.cobaltSwordID + 4, InfiMaterialEnum.Cobalt, InfiMaterialEnum.Redstone, "redstoneCobaltSword");
			obsidianCobaltSword = new InfiToolSword(PHInfiTools.cobaltSwordID + 5, InfiMaterialEnum.Cobalt, InfiMaterialEnum.Obsidian, "obsidianCobaltSword");
			boneCobaltSword = new InfiToolSword(PHInfiTools.cobaltSwordID + 6, InfiMaterialEnum.Cobalt, InfiMaterialEnum.Bone, "boneCobaltSword");
			slimeCobaltSword = new InfiToolSword(PHInfiTools.cobaltSwordID + 7, InfiMaterialEnum.Cobalt, InfiMaterialEnum.Slime, "slimeCobaltSword");
			cactusCobaltSword = new InfiToolSword(PHInfiTools.cobaltSwordID + 8, InfiMaterialEnum.Cobalt, InfiMaterialEnum.Cactus, "cactusCobaltSword");
			blazeCobaltSword = new InfiToolSword(PHInfiTools.cobaltSwordID + 9, InfiMaterialEnum.Cobalt, InfiMaterialEnum.Blaze, "blazeCobaltSword");
			copperCobaltSword = new InfiToolSword(PHInfiTools.cobaltSwordID + 10, InfiMaterialEnum.Cobalt, InfiMaterialEnum.Copper, "copperCobaltSword");
			bronzeCobaltSword = new InfiToolSword(PHInfiTools.cobaltSwordID + 11, InfiMaterialEnum.Cobalt, InfiMaterialEnum.Bronze, "bronzeCobaltSword");
			workedCobaltSword = new InfiToolSword(PHInfiTools.cobaltSwordID + 12, InfiMaterialEnum.Cobalt, InfiMaterialEnum.WorkedIron, "workedCobaltSword");
			steelCobaltSword = new InfiToolSword(PHInfiTools.cobaltSwordID + 13, InfiMaterialEnum.Cobalt, InfiMaterialEnum.Steel, "steelCobaltSword");
			cobaltCobaltSword = new InfiToolSword(PHInfiTools.cobaltSwordID + 14, InfiMaterialEnum.Cobalt, InfiMaterialEnum.Cobalt, "cobaltCobaltSword");
			arditeCobaltSword = new InfiToolSword(PHInfiTools.cobaltSwordID + 15, InfiMaterialEnum.Cobalt, InfiMaterialEnum.Ardite, "arditeCobaltSword");
			manyullynCobaltSword = new InfiToolSword(PHInfiTools.cobaltSwordID + 16, InfiMaterialEnum.Cobalt, InfiMaterialEnum.Manyullyn, "manyullynCobaltSword");
			uraniumCobaltSword = new InfiToolSword(PHInfiTools.cobaltSwordID + 17, InfiMaterialEnum.Cobalt, InfiMaterialEnum.Uranium, "uraniumCobaltSword");

			MinecraftForge.setToolClass(woodCobaltSword, "Sword", InfiMaterialEnum.Cobalt.getHarvestLevel());
			MinecraftForge.setToolClass(stoneCobaltSword, "Sword", InfiMaterialEnum.Cobalt.getHarvestLevel());
			MinecraftForge.setToolClass(ironCobaltSword, "Sword", InfiMaterialEnum.Cobalt.getHarvestLevel());
			MinecraftForge.setToolClass(diamondCobaltSword, "Sword", InfiMaterialEnum.Cobalt.getHarvestLevel());
			MinecraftForge.setToolClass(redstoneCobaltSword, "Sword", InfiMaterialEnum.Cobalt.getHarvestLevel());
			MinecraftForge.setToolClass(obsidianCobaltSword, "Sword", InfiMaterialEnum.Cobalt.getHarvestLevel());
			MinecraftForge.setToolClass(boneCobaltSword, "Sword", InfiMaterialEnum.Cobalt.getHarvestLevel());
			MinecraftForge.setToolClass(slimeCobaltSword, "Sword", InfiMaterialEnum.Cobalt.getHarvestLevel());
			MinecraftForge.setToolClass(cactusCobaltSword, "Sword", InfiMaterialEnum.Cobalt.getHarvestLevel());
			MinecraftForge.setToolClass(blazeCobaltSword, "Sword", InfiMaterialEnum.Cobalt.getHarvestLevel());
			MinecraftForge.setToolClass(copperCobaltSword, "Sword", InfiMaterialEnum.Cobalt.getHarvestLevel());
			MinecraftForge.setToolClass(bronzeCobaltSword, "Sword", InfiMaterialEnum.Cobalt.getHarvestLevel());
			MinecraftForge.setToolClass(workedCobaltSword, "Sword", InfiMaterialEnum.Cobalt.getHarvestLevel());
			MinecraftForge.setToolClass(steelCobaltSword, "Sword", InfiMaterialEnum.Cobalt.getHarvestLevel());
			MinecraftForge.setToolClass(cobaltCobaltSword, "Sword", InfiMaterialEnum.Cobalt.getHarvestLevel());
			MinecraftForge.setToolClass(arditeCobaltSword, "Sword", InfiMaterialEnum.Cobalt.getHarvestLevel());
			MinecraftForge.setToolClass(manyullynCobaltSword, "Sword", InfiMaterialEnum.Cobalt.getHarvestLevel());
			MinecraftForge.setToolClass(uraniumCobaltSword, "Sword", InfiMaterialEnum.Cobalt.getHarvestLevel());
		}

		if (PHInfiTools.enableArditeTools)
		{
			woodArditeSword = new InfiToolSword(PHInfiTools.arditeSwordID + 0, InfiMaterialEnum.Ardite, InfiMaterialEnum.Wood, "woodArditeSword");
			stoneArditeSword = new InfiToolSword(PHInfiTools.arditeSwordID + 1, InfiMaterialEnum.Ardite, InfiMaterialEnum.Stone, "stoneArditeSword");
			ironArditeSword = new InfiToolSword(PHInfiTools.arditeSwordID + 2, InfiMaterialEnum.Ardite, InfiMaterialEnum.Iron, "ironArditeSword");
			diamondArditeSword = new InfiToolSword(PHInfiTools.arditeSwordID + 3, InfiMaterialEnum.Ardite, InfiMaterialEnum.Diamond, "diamondArditeSword");
			redstoneArditeSword = new InfiToolSword(PHInfiTools.arditeSwordID + 4, InfiMaterialEnum.Ardite, InfiMaterialEnum.Redstone, "redstoneArditeSword");
			obsidianArditeSword = new InfiToolSword(PHInfiTools.arditeSwordID + 5, InfiMaterialEnum.Ardite, InfiMaterialEnum.Obsidian, "obsidianArditeSword");
			boneArditeSword = new InfiToolSword(PHInfiTools.arditeSwordID + 6, InfiMaterialEnum.Ardite, InfiMaterialEnum.Bone, "boneArditeSword");
			slimeArditeSword = new InfiToolSword(PHInfiTools.arditeSwordID + 7, InfiMaterialEnum.Ardite, InfiMaterialEnum.Slime, "slimeArditeSword");
			cactusArditeSword = new InfiToolSword(PHInfiTools.arditeSwordID + 8, InfiMaterialEnum.Ardite, InfiMaterialEnum.Cactus, "cactusArditeSword");
			blazeArditeSword = new InfiToolSword(PHInfiTools.arditeSwordID + 9, InfiMaterialEnum.Ardite, InfiMaterialEnum.Blaze, "blazeArditeSword");
			copperArditeSword = new InfiToolSword(PHInfiTools.arditeSwordID + 10, InfiMaterialEnum.Ardite, InfiMaterialEnum.Copper, "copperArditeSword");
			bronzeArditeSword = new InfiToolSword(PHInfiTools.arditeSwordID + 11, InfiMaterialEnum.Ardite, InfiMaterialEnum.Bronze, "bronzeArditeSword");
			workedArditeSword = new InfiToolSword(PHInfiTools.arditeSwordID + 12, InfiMaterialEnum.Ardite, InfiMaterialEnum.WorkedIron, "workedArditeSword");
			steelArditeSword = new InfiToolSword(PHInfiTools.arditeSwordID + 13, InfiMaterialEnum.Ardite, InfiMaterialEnum.Steel, "steelArditeSword");
			cobaltArditeSword = new InfiToolSword(PHInfiTools.arditeSwordID + 14, InfiMaterialEnum.Ardite, InfiMaterialEnum.Cobalt, "cobaltArditeSword");
			arditeArditeSword = new InfiToolSword(PHInfiTools.arditeSwordID + 15, InfiMaterialEnum.Ardite, InfiMaterialEnum.Ardite, "arditeArditeSword");
			manyullynArditeSword = new InfiToolSword(PHInfiTools.arditeSwordID + 16, InfiMaterialEnum.Ardite, InfiMaterialEnum.Manyullyn, "manyullynArditeSword");
			uraniumArditeSword = new InfiToolSword(PHInfiTools.arditeSwordID + 17, InfiMaterialEnum.Ardite, InfiMaterialEnum.Uranium, "uraniumArditeSword");

			MinecraftForge.setToolClass(woodArditeSword, "Sword", InfiMaterialEnum.Ardite.getHarvestLevel());
			MinecraftForge.setToolClass(stoneArditeSword, "Sword", InfiMaterialEnum.Ardite.getHarvestLevel());
			MinecraftForge.setToolClass(ironArditeSword, "Sword", InfiMaterialEnum.Ardite.getHarvestLevel());
			MinecraftForge.setToolClass(diamondArditeSword, "Sword", InfiMaterialEnum.Ardite.getHarvestLevel());
			MinecraftForge.setToolClass(redstoneArditeSword, "Sword", InfiMaterialEnum.Ardite.getHarvestLevel());
			MinecraftForge.setToolClass(obsidianArditeSword, "Sword", InfiMaterialEnum.Ardite.getHarvestLevel());
			MinecraftForge.setToolClass(boneArditeSword, "Sword", InfiMaterialEnum.Ardite.getHarvestLevel());
			MinecraftForge.setToolClass(slimeArditeSword, "Sword", InfiMaterialEnum.Ardite.getHarvestLevel());
			MinecraftForge.setToolClass(cactusArditeSword, "Sword", InfiMaterialEnum.Ardite.getHarvestLevel());
			MinecraftForge.setToolClass(blazeArditeSword, "Sword", InfiMaterialEnum.Ardite.getHarvestLevel());
			MinecraftForge.setToolClass(copperArditeSword, "Sword", InfiMaterialEnum.Ardite.getHarvestLevel());
			MinecraftForge.setToolClass(bronzeArditeSword, "Sword", InfiMaterialEnum.Ardite.getHarvestLevel());
			MinecraftForge.setToolClass(workedArditeSword, "Sword", InfiMaterialEnum.Ardite.getHarvestLevel());
			MinecraftForge.setToolClass(steelArditeSword, "Sword", InfiMaterialEnum.Ardite.getHarvestLevel());
			MinecraftForge.setToolClass(cobaltArditeSword, "Sword", InfiMaterialEnum.Ardite.getHarvestLevel());
			MinecraftForge.setToolClass(arditeArditeSword, "Sword", InfiMaterialEnum.Ardite.getHarvestLevel());
			MinecraftForge.setToolClass(manyullynArditeSword, "Sword", InfiMaterialEnum.Ardite.getHarvestLevel());
			MinecraftForge.setToolClass(uraniumArditeSword, "Sword", InfiMaterialEnum.Ardite.getHarvestLevel());
		}

		if (PHInfiTools.enableManyullynTools)
		{
			woodManyullynSword = new InfiToolSword(PHInfiTools.manyullynSwordID + 0, InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Wood, "woodManyullynSword");
			stoneManyullynSword = new InfiToolSword(PHInfiTools.manyullynSwordID + 1, InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Stone, "stoneManyullynSword");
			ironManyullynSword = new InfiToolSword(PHInfiTools.manyullynSwordID + 2, InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Iron, "ironManyullynSword");
			diamondManyullynSword = new InfiToolSword(PHInfiTools.manyullynSwordID + 3, InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Diamond, "diamondManyullynSword");
			redstoneManyullynSword = new InfiToolSword(PHInfiTools.manyullynSwordID + 4, InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Redstone, "redstoneManyullynSword");
			obsidianManyullynSword = new InfiToolSword(PHInfiTools.manyullynSwordID + 5, InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Obsidian, "obsidianManyullynSword");
			boneManyullynSword = new InfiToolSword(PHInfiTools.manyullynSwordID + 6, InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Bone, "boneManyullynSword");
			slimeManyullynSword = new InfiToolSword(PHInfiTools.manyullynSwordID + 7, InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Slime, "slimeManyullynSword");
			cactusManyullynSword = new InfiToolSword(PHInfiTools.manyullynSwordID + 8, InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Cactus, "cactusManyullynSword");
			blazeManyullynSword = new InfiToolSword(PHInfiTools.manyullynSwordID + 9, InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Blaze, "blazeManyullynSword");
			copperManyullynSword = new InfiToolSword(PHInfiTools.manyullynSwordID + 10, InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Copper, "copperManyullynSword");
			bronzeManyullynSword = new InfiToolSword(PHInfiTools.manyullynSwordID + 11, InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Bronze, "bronzeManyullynSword");
			workedManyullynSword = new InfiToolSword(PHInfiTools.manyullynSwordID + 12, InfiMaterialEnum.Manyullyn, InfiMaterialEnum.WorkedIron, "workedManyullynSword");
			steelManyullynSword = new InfiToolSword(PHInfiTools.manyullynSwordID + 13, InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Steel, "steelManyullynSword");
			cobaltManyullynSword = new InfiToolSword(PHInfiTools.manyullynSwordID + 14, InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Cobalt, "cobaltManyullynSword");
			arditeManyullynSword = new InfiToolSword(PHInfiTools.manyullynSwordID + 15, InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Ardite, "arditeManyullynSword");
			manyullynManyullynSword = new InfiToolSword(PHInfiTools.manyullynSwordID + 16, InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Manyullyn, "manyullynManyullynSword");
			uraniumManyullynSword = new InfiToolSword(PHInfiTools.manyullynSwordID + 17, InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Uranium, "uraniumManyullynSword");

			MinecraftForge.setToolClass(woodManyullynSword, "Sword", InfiMaterialEnum.Manyullyn.getHarvestLevel());
			MinecraftForge.setToolClass(stoneManyullynSword, "Sword", InfiMaterialEnum.Manyullyn.getHarvestLevel());
			MinecraftForge.setToolClass(ironManyullynSword, "Sword", InfiMaterialEnum.Manyullyn.getHarvestLevel());
			MinecraftForge.setToolClass(diamondManyullynSword, "Sword", InfiMaterialEnum.Manyullyn.getHarvestLevel());
			MinecraftForge.setToolClass(redstoneManyullynSword, "Sword", InfiMaterialEnum.Manyullyn.getHarvestLevel());
			MinecraftForge.setToolClass(obsidianManyullynSword, "Sword", InfiMaterialEnum.Manyullyn.getHarvestLevel());
			MinecraftForge.setToolClass(boneManyullynSword, "Sword", InfiMaterialEnum.Manyullyn.getHarvestLevel());
			MinecraftForge.setToolClass(slimeManyullynSword, "Sword", InfiMaterialEnum.Manyullyn.getHarvestLevel());
			MinecraftForge.setToolClass(cactusManyullynSword, "Sword", InfiMaterialEnum.Manyullyn.getHarvestLevel());
			MinecraftForge.setToolClass(blazeManyullynSword, "Sword", InfiMaterialEnum.Manyullyn.getHarvestLevel());
			MinecraftForge.setToolClass(copperManyullynSword, "Sword", InfiMaterialEnum.Manyullyn.getHarvestLevel());
			MinecraftForge.setToolClass(bronzeManyullynSword, "Sword", InfiMaterialEnum.Manyullyn.getHarvestLevel());
			MinecraftForge.setToolClass(workedManyullynSword, "Sword", InfiMaterialEnum.Manyullyn.getHarvestLevel());
			MinecraftForge.setToolClass(steelManyullynSword, "Sword", InfiMaterialEnum.Manyullyn.getHarvestLevel());
			MinecraftForge.setToolClass(cobaltManyullynSword, "Sword", InfiMaterialEnum.Manyullyn.getHarvestLevel());
			MinecraftForge.setToolClass(arditeManyullynSword, "Sword", InfiMaterialEnum.Manyullyn.getHarvestLevel());
			MinecraftForge.setToolClass(manyullynManyullynSword, "Sword", InfiMaterialEnum.Manyullyn.getHarvestLevel());
			MinecraftForge.setToolClass(uraniumManyullynSword, "Sword", InfiMaterialEnum.Manyullyn.getHarvestLevel());
		}

		if (PHInfiTools.enableUraniumTools)
		{
			diamondUraniumSword = new InfiToolSword(PHInfiTools.uraniumSwordID + 0, InfiMaterialEnum.Uranium, InfiMaterialEnum.Diamond, "diamondUraniumSword");
			redstoneUraniumSword = new InfiToolSword(PHInfiTools.uraniumSwordID + 1, InfiMaterialEnum.Uranium, InfiMaterialEnum.Redstone, "redstoneUraniumSword");
			boneUraniumSword = new InfiToolSword(PHInfiTools.uraniumSwordID + 2, InfiMaterialEnum.Uranium, InfiMaterialEnum.Bone, "boneUraniumSword");
			netherrackUraniumSword = new InfiToolSword(PHInfiTools.uraniumSwordID + 3, InfiMaterialEnum.Uranium, InfiMaterialEnum.Netherrack, "netherrackUraniumSword");
			glowstoneUraniumSword = new InfiToolSword(PHInfiTools.uraniumSwordID + 4, InfiMaterialEnum.Uranium, InfiMaterialEnum.Glowstone, "glowstoneUraniumSword");
			lavaUraniumSword = new InfiToolSword(PHInfiTools.uraniumSwordID + 5, InfiMaterialEnum.Uranium, InfiMaterialEnum.Lava, "lavaUraniumSword");
			blazeUraniumSword = new InfiToolSword(PHInfiTools.uraniumSwordID + 6, InfiMaterialEnum.Uranium, InfiMaterialEnum.Blaze, "blazeUraniumSword");
			cobaltUraniumSword = new InfiToolSword(PHInfiTools.uraniumSwordID + 7, InfiMaterialEnum.Uranium, InfiMaterialEnum.Cobalt, "cobaltUraniumSword");
			arditeUraniumSword = new InfiToolSword(PHInfiTools.uraniumSwordID + 8, InfiMaterialEnum.Uranium, InfiMaterialEnum.Ardite, "arditeUraniumSword");
			uraniumUraniumSword = new InfiToolSword(PHInfiTools.uraniumSwordID + 9, InfiMaterialEnum.Uranium, InfiMaterialEnum.Uranium, "uraniumUraniumSword");

			MinecraftForge.setToolClass(diamondUraniumSword, "Sword", InfiMaterialEnum.Uranium.getHarvestLevel());
			MinecraftForge.setToolClass(redstoneUraniumSword, "Sword", InfiMaterialEnum.Uranium.getHarvestLevel());
			MinecraftForge.setToolClass(boneUraniumSword, "Sword", InfiMaterialEnum.Uranium.getHarvestLevel());
			MinecraftForge.setToolClass(netherrackUraniumSword, "Sword", InfiMaterialEnum.Uranium.getHarvestLevel());
			MinecraftForge.setToolClass(glowstoneUraniumSword, "Sword", InfiMaterialEnum.Uranium.getHarvestLevel());
			MinecraftForge.setToolClass(lavaUraniumSword, "Sword", InfiMaterialEnum.Uranium.getHarvestLevel());
			MinecraftForge.setToolClass(blazeUraniumSword, "Sword", InfiMaterialEnum.Uranium.getHarvestLevel());
			MinecraftForge.setToolClass(cobaltUraniumSword, "Sword", InfiMaterialEnum.Uranium.getHarvestLevel());
			MinecraftForge.setToolClass(arditeUraniumSword, "Sword", InfiMaterialEnum.Uranium.getHarvestLevel());
			MinecraftForge.setToolClass(uraniumUraniumSword, "Sword", InfiMaterialEnum.Uranium.getHarvestLevel());
		}
	}

	private static void addNames()
	{
		if (PHInfiTools.enableWoodTools && PHInfiTools.overwriteVanillaTools)
			LanguageRegistry.instance().addName(woodWoodSword, "Wooden Sword");
		if (PHInfiTools.enableStoneTools)
			LanguageRegistry.instance().addName(stoneStoneSword, "Heavy Sword");
		if (PHInfiTools.enableIronTools)
			LanguageRegistry.instance().addName(ironIronSword, "Ironic Sword");
		if (PHInfiTools.enableDiamondTools)
			LanguageRegistry.instance().addName(diamondDiamondSword, "Diamondium Sword");
		if (PHInfiTools.enableRedstoneTools)
			LanguageRegistry.instance().addName(redstoneRedstoneSword, "Redredred Sword");
		if (PHInfiTools.enableObsidianTools)
			LanguageRegistry.instance().addName(obsidianObsidianSword, "Ebony Sword");
		if (PHInfiTools.enableSandstoneTools)
			LanguageRegistry.instance().addName(sandstoneSandstoneSword, "Fragile Sword");
		if (PHInfiTools.enableNetherrackTools)
			LanguageRegistry.instance().addName(boneBoneSword, "Necrotic Sword");
		if (PHInfiTools.enablePaperTools)
			LanguageRegistry.instance().addName(paperPaperSword, "Soft Sword");
		if (PHInfiTools.enableMossyTools)
			LanguageRegistry.instance().addName(mossyMossySword, "Living Sword");
		if (PHInfiTools.enableNetherrackTools)
			LanguageRegistry.instance().addName(netherrackNetherrackSword, "Bloodsoaked Sword");
		if (PHInfiTools.enableGlowstoneTools)
			LanguageRegistry.instance().addName(glowstoneGlowstoneSword, "Bright Sword");
		if (PHInfiTools.enableIceTools)
			LanguageRegistry.instance().addName(iceIceSword, "Freezing Sword");
		if (PHInfiTools.enableLavaTools)
			LanguageRegistry.instance().addName(lavaLavaSword, "Burning Sword");
		if (PHInfiTools.enableSlimeTools)
			LanguageRegistry.instance().addName(slimeSlimeSword, "Toy Sword");
		if (PHInfiTools.enableCactusTools)
			LanguageRegistry.instance().addName(cactusCactusSword, "Thorned Sword");
		if (PHInfiTools.enableFlintTools)
			LanguageRegistry.instance().addName(flintFlintSword, "Rough-hewn Sword");
		if (PHInfiTools.enableBlazeTools)
			LanguageRegistry.instance().addName(blazeBlazeSword, "Netherite Sword");
		if (PHInfiTools.enableCopperTools)
			LanguageRegistry.instance().addName(copperCopperSword, "Orange-Tang Sword");
		if (PHInfiTools.enableBronzeTools)
			LanguageRegistry.instance().addName(bronzeBronzeSword, "Polished Sword");
		if (PHInfiTools.enableWorkedIronTools)
			LanguageRegistry.instance().addName(workedWorkedIronSword, "Reworked Iron Sword");
		if (PHInfiTools.enableSteelTools)
			LanguageRegistry.instance().addName(steelSteelSword, "Forge-Wrought Sword");
		if (PHInfiTools.enableCobaltTools)
			LanguageRegistry.instance().addName(cobaltCobaltSword, "Beautiful Sword");
		if (PHInfiTools.enableArditeTools)
			LanguageRegistry.instance().addName(arditeArditeSword, "Rustic Sword");
		if (PHInfiTools.enableManyullynTools)
			LanguageRegistry.instance().addName(manyullynManyullynSword, "False-Prophetic Sword");
		if (PHInfiTools.enableUraniumTools)
			LanguageRegistry.instance().addName(uraniumUraniumSword, "Cancerous Sword");
	}

	public static void registerInfiToolsRecipes()
	{
		if (PHInfiTools.enableWoodTools)
		{
			if (PHInfiTools.overwriteVanillaTools)
				GameRegistry.addRecipe(new ItemStack(woodWoodSword), recipe, '#', Block.planks, '|', Item.stick);
			GameRegistry.addRecipe(new ItemStack(sandstoneWoodSword), recipe, '#', Block.planks, '|', InfiLibrary.sandstoneRod );
			GameRegistry.addRecipe(new ItemStack(boneWoodSword), recipe, '#', Block.planks, '|', Item.bone );
			GameRegistry.addRecipe(new ItemStack(boneWoodSword), recipe, '#', Block.planks, '|', InfiLibrary.boneRod );
			GameRegistry.addRecipe(new ItemStack(paperWoodSword), recipe, '#', Block.planks, '|', InfiLibrary.paperRod );
			GameRegistry.addRecipe(new ItemStack(iceWoodSword), recipe, '#', Block.planks, '|', InfiLibrary.iceRod );
			GameRegistry.addRecipe(new ItemStack(slimeWoodSword), recipe, '#', Block.planks, '|', InfiLibrary.slimeRod );
			GameRegistry.addRecipe(new ItemStack(cactusWoodSword), recipe, '#', Block.planks, '|', InfiLibrary.cactusRod );
		}

		if (PHInfiTools.enableStoneTools)
		{
			if (PHInfiTools.overwriteVanillaTools)
				GameRegistry.addRecipe(new ItemStack(woodStoneSword), recipe, '#', Block.cobblestone, '|', Item.stick);
			GameRegistry.addRecipe(new ItemStack(stoneStoneSword), recipe, '#', Block.cobblestone, '|', InfiLibrary.stoneRod );
			GameRegistry.addRecipe(new ItemStack(sandstoneStoneSword), recipe, '#', Block.cobblestone, '|', InfiLibrary.sandstoneRod );
			GameRegistry.addRecipe(new ItemStack(boneStoneSword), recipe, '#', Block.cobblestone, '|', Item.bone );
			GameRegistry.addRecipe(new ItemStack(boneStoneSword), recipe, '#', Block.cobblestone, '|', InfiLibrary.boneRod );
			GameRegistry.addRecipe(new ItemStack(netherrackStoneSword), recipe, '#', Block.cobblestone, '|', InfiLibrary.netherrackRod );
			GameRegistry.addRecipe(new ItemStack(iceStoneSword), recipe, '#', Block.cobblestone, '|', InfiLibrary.iceRod );
			GameRegistry.addRecipe(new ItemStack(slimeStoneSword), recipe, '#', Block.cobblestone, '|', InfiLibrary.slimeRod );
			GameRegistry.addRecipe(new ItemStack(cactusStoneSword), recipe, '#', Block.cobblestone, '|', InfiLibrary.cactusRod );
			GameRegistry.addRecipe(new ItemStack(flintStoneSword), recipe, '#', Block.cobblestone, '|', InfiLibrary.flintRod );

			if (PHInfiTools.overwriteVanillaTools)
				GameRegistry.addRecipe(new ItemStack(woodStoneSword), recipe, '#', Block.stone, '|', Item.stick);
			GameRegistry.addRecipe(new ItemStack(stoneStoneSword), recipe, '#', Block.stone, '|', InfiLibrary.stoneRod );
			GameRegistry.addRecipe(new ItemStack(sandstoneStoneSword), recipe, '#', Block.stone, '|', InfiLibrary.sandstoneRod );
			GameRegistry.addRecipe(new ItemStack(boneStoneSword), recipe, '#', Block.stone, '|', Item.bone );
			GameRegistry.addRecipe(new ItemStack(boneStoneSword), recipe, '#', Block.stone, '|', InfiLibrary.boneRod );
			GameRegistry.addRecipe(new ItemStack(netherrackStoneSword), recipe, '#', Block.stone, '|', InfiLibrary.netherrackRod );
			GameRegistry.addRecipe(new ItemStack(iceStoneSword), recipe, '#', Block.stone, '|', InfiLibrary.iceRod );
			GameRegistry.addRecipe(new ItemStack(slimeStoneSword), recipe, '#', Block.stone, '|', InfiLibrary.slimeRod );
			GameRegistry.addRecipe(new ItemStack(cactusStoneSword), recipe, '#', Block.stone, '|', InfiLibrary.cactusRod );
			GameRegistry.addRecipe(new ItemStack(flintStoneSword), recipe, '#', Block.stone, '|', InfiLibrary.flintRod );
		}

		if (PHInfiTools.enableIronTools)
		{
			if (PHInfiTools.overwriteVanillaTools)
				GameRegistry.addRecipe(new ItemStack(woodIronSword), recipe, '#', Item.ingotIron, '|', Item.stick);
			GameRegistry.addRecipe(new ItemStack(stoneIronSword), recipe, '#', Item.ingotIron, '|', InfiLibrary.stoneRod );
			GameRegistry.addRecipe(new ItemStack(ironIronSword), recipe, '#', Item.ingotIron, '|', InfiLibrary.ironRod );
			GameRegistry.addRecipe(new ItemStack(boneIronSword), recipe, '#', Item.ingotIron, '|', Item.bone );
			GameRegistry.addRecipe(new ItemStack(boneIronSword), recipe, '#', Item.ingotIron, '|', InfiLibrary.boneRod );
			GameRegistry.addRecipe(new ItemStack(netherrackIronSword), recipe, '#', Item.ingotIron, '|', InfiLibrary.netherrackRod );
			GameRegistry.addRecipe(new ItemStack(glowstoneIronSword), recipe, '#', Item.ingotIron, '|', InfiLibrary.glowstoneRod );
			GameRegistry.addRecipe(new ItemStack(cactusIronSword), recipe, '#', Item.ingotIron, '|', InfiLibrary.cactusRod );
			GameRegistry.addRecipe(new ItemStack(copperIronSword), recipe, '#', Item.ingotIron, '|', InfiLibrary.copperRod );
			GameRegistry.addRecipe(new ItemStack(bronzeIronSword), recipe, '#', Item.ingotIron, '|', InfiLibrary.bronzeRod );
		}

		if (PHInfiTools.enableDiamondTools)
		{
			if (PHInfiTools.overwriteVanillaTools)
				GameRegistry.addRecipe(new ItemStack(woodDiamondSword), recipe, '#', Item.diamond, '|', Item.stick);
			GameRegistry.addRecipe(new ItemStack(stoneDiamondSword), recipe, '#', Item.diamond, '|', InfiLibrary.stoneRod );
			GameRegistry.addRecipe(new ItemStack(ironDiamondSword), recipe, '#', Item.diamond, '|', InfiLibrary.ironRod );
			GameRegistry.addRecipe(new ItemStack(diamondDiamondSword), recipe, '#', Item.diamond, '|', InfiLibrary.diamondRod );
			GameRegistry.addRecipe(new ItemStack(redstoneDiamondSword), recipe, '#', Item.diamond, '|', InfiLibrary.redstoneRod );
			GameRegistry.addRecipe(new ItemStack(obsidianDiamondSword), recipe, '#', Item.diamond, '|', InfiLibrary.obsidianRod );
			GameRegistry.addRecipe(new ItemStack(boneDiamondSword), recipe, '#', Item.diamond, '|', Item.bone );
			GameRegistry.addRecipe(new ItemStack(boneDiamondSword), recipe, '#', Item.diamond, '|', InfiLibrary.boneRod );
			GameRegistry.addRecipe(new ItemStack(mossyDiamondSword), recipe, '#', Item.diamond, '|', InfiLibrary.mossyRod );
			GameRegistry.addRecipe(new ItemStack(netherrackDiamondSword), recipe, '#', Item.diamond, '|', InfiLibrary.netherrackRod );
			GameRegistry.addRecipe(new ItemStack(glowstoneDiamondSword), recipe, '#', Item.diamond, '|', InfiLibrary.glowstoneRod );
			GameRegistry.addRecipe(new ItemStack(lavaDiamondSword), recipe, '#', Item.diamond, '|', InfiLibrary.lavaRod );
			GameRegistry.addRecipe(new ItemStack(cactusDiamondSword), recipe, '#', Item.diamond, '|', InfiLibrary.cactusRod );
			GameRegistry.addRecipe(new ItemStack(flintDiamondSword), recipe, '#', Item.diamond, '|', InfiLibrary.flintRod );
			GameRegistry.addRecipe(new ItemStack(blazeDiamondSword), recipe, '#', Item.diamond, '|', Item.blazeRod );
			GameRegistry.addRecipe(new ItemStack(copperDiamondSword), recipe, '#', Item.diamond, '|', InfiLibrary.copperRod );
			GameRegistry.addRecipe(new ItemStack(bronzeDiamondSword), recipe, '#', Item.diamond, '|', InfiLibrary.bronzeRod );
			GameRegistry.addRecipe(new ItemStack(workedDiamondSword), recipe, '#', Item.diamond, '|', InfiLibrary.workedIronRod );
			GameRegistry.addRecipe(new ItemStack(steelDiamondSword), recipe, '#', Item.diamond, '|', InfiLibrary.steelRod );
			GameRegistry.addRecipe(new ItemStack(cobaltDiamondSword), recipe, '#', Item.diamond, '|', InfiLibrary.cobaltRod );
			GameRegistry.addRecipe(new ItemStack(arditeDiamondSword), recipe, '#', Item.diamond, '|', InfiLibrary.arditeRod );
			GameRegistry.addRecipe(new ItemStack(manyullynDiamondSword), recipe, '#', Item.diamond, '|', InfiLibrary.manyullynRod );
			GameRegistry.addRecipe(new ItemStack(uraniumDiamondSword), recipe, '#', Item.diamond, '|', InfiLibrary.uraniumRod );
		}

		if (PHInfiTools.enableRedstoneTools)
		{
			GameRegistry.addRecipe(new ItemStack(woodRedstoneSword), recipe, '#', InfiLibrary.redstoneCrystal, '|', Item.stick );
			GameRegistry.addRecipe(new ItemStack(stoneRedstoneSword), recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.stoneRod );
			GameRegistry.addRecipe(new ItemStack(ironRedstoneSword), recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.ironRod );
			GameRegistry.addRecipe(new ItemStack(redstoneRedstoneSword), recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.redstoneRod );
			GameRegistry.addRecipe(new ItemStack(obsidianRedstoneSword), recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.obsidianRod );
			GameRegistry.addRecipe(new ItemStack(sandstoneRedstoneSword), recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.sandstoneRod );
			GameRegistry.addRecipe(new ItemStack(boneRedstoneSword), recipe, '#', InfiLibrary.redstoneCrystal, '|', Item.bone );
			GameRegistry.addRecipe(new ItemStack(boneRedstoneSword), recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.boneRod );
			GameRegistry.addRecipe(new ItemStack(paperRedstoneSword), recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.paperRod );
			GameRegistry.addRecipe(new ItemStack(mossyRedstoneSword), recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.mossyRod );
			GameRegistry.addRecipe(new ItemStack(netherrackRedstoneSword), recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.netherrackRod );
			GameRegistry.addRecipe(new ItemStack(glowstoneRedstoneSword), recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.glowstoneRod );
			GameRegistry.addRecipe(new ItemStack(iceRedstoneSword), recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.iceRod );
			GameRegistry.addRecipe(new ItemStack(lavaRedstoneSword), recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.lavaRod );
			GameRegistry.addRecipe(new ItemStack(slimeRedstoneSword), recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.slimeRod );
			GameRegistry.addRecipe(new ItemStack(cactusRedstoneSword), recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.cactusRod );
			GameRegistry.addRecipe(new ItemStack(flintRedstoneSword), recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.flintRod );
			GameRegistry.addRecipe(new ItemStack(copperRedstoneSword), recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.copperRod );
			GameRegistry.addRecipe(new ItemStack(bronzeRedstoneSword), recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.bronzeRod );
			GameRegistry.addRecipe(new ItemStack(workedRedstoneSword), recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.workedIronRod );
			GameRegistry.addRecipe(new ItemStack(uraniumRedstoneSword), recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.uraniumRod );
		}

		if (PHInfiTools.enableObsidianTools)
		{
			GameRegistry.addRecipe(new ItemStack(woodObsidianSword), recipe, '#', Block.obsidian, '|', Item.stick );
			GameRegistry.addRecipe(new ItemStack(stoneObsidianSword), recipe, '#', Block.obsidian, '|', InfiLibrary.stoneRod );
			GameRegistry.addRecipe(new ItemStack(redstoneObsidianSword), recipe, '#', Block.obsidian, '|', InfiLibrary.redstoneRod );
			GameRegistry.addRecipe(new ItemStack(obsidianObsidianSword), recipe, '#', Block.obsidian, '|', InfiLibrary.obsidianRod );
			GameRegistry.addRecipe(new ItemStack(boneObsidianSword), recipe, '#', Block.obsidian, '|', Item.bone );
			GameRegistry.addRecipe(new ItemStack(boneObsidianSword), recipe, '#', Block.obsidian, '|', InfiLibrary.boneRod );
			GameRegistry.addRecipe(new ItemStack(netherrackObsidianSword), recipe, '#', Block.obsidian, '|', InfiLibrary.netherrackRod );
			GameRegistry.addRecipe(new ItemStack(glowstoneObsidianSword), recipe, '#', Block.obsidian, '|', InfiLibrary.glowstoneRod );
			GameRegistry.addRecipe(new ItemStack(iceObsidianSword), recipe, '#', Block.obsidian, '|', InfiLibrary.iceRod );
			GameRegistry.addRecipe(new ItemStack(lavaObsidianSword), recipe, '#', Block.obsidian, '|', InfiLibrary.lavaRod );
			GameRegistry.addRecipe(new ItemStack(cactusObsidianSword), recipe, '#', Block.obsidian, '|', InfiLibrary.cactusRod );
		}

		if (PHInfiTools.enableSandstoneTools)
		{
			GameRegistry.addRecipe(new ItemStack(woodSandstoneSword), recipe, '#', Block.sandStone, '|', Item.stick );
			GameRegistry.addRecipe(new ItemStack(sandstoneSandstoneSword), recipe, '#', Block.sandStone, '|', InfiLibrary.sandstoneRod );
			GameRegistry.addRecipe(new ItemStack(boneSandstoneSword), recipe, '#', Block.sandStone, '|', Item.bone );
			GameRegistry.addRecipe(new ItemStack(boneSandstoneSword), recipe, '#', Block.sandStone, '|', InfiLibrary.boneRod );
			GameRegistry.addRecipe(new ItemStack(netherrackSandstoneSword), recipe, '#', Block.sandStone, '|', InfiLibrary.netherrackRod );
			GameRegistry.addRecipe(new ItemStack(iceSandstoneSword), recipe, '#', Block.sandStone, '|', InfiLibrary.iceRod );
			GameRegistry.addRecipe(new ItemStack(slimeSandstoneSword), recipe, '#', Block.sandStone, '|', InfiLibrary.slimeRod );
			GameRegistry.addRecipe(new ItemStack(cactusSandstoneSword), recipe, '#', Block.sandStone, '|', InfiLibrary.cactusRod );
			GameRegistry.addRecipe(new ItemStack(flintSandstoneSword), recipe, '#', Block.sandStone, '|', InfiLibrary.flintRod );
		}

		if (PHInfiTools.enableBoneTools)
		{
			GameRegistry.addRecipe(new ItemStack(woodBoneSword), recipe, '#', Item.bone, '|', Item.stick );
			GameRegistry.addRecipe(new ItemStack(stoneBoneSword), recipe, '#', Item.bone, '|', InfiLibrary.stoneRod );
			GameRegistry.addRecipe(new ItemStack(sandstoneBoneSword), recipe, '#', Item.bone, '|', InfiLibrary.sandstoneRod );
			GameRegistry.addRecipe(new ItemStack(boneBoneSword), recipe, '#', Item.bone, '|', Item.bone );
			GameRegistry.addRecipe(new ItemStack(boneBoneSword), recipe, '#', Item.bone, '|', InfiLibrary.boneRod );
			GameRegistry.addRecipe(new ItemStack(paperBoneSword), recipe, '#', Item.bone, '|', InfiLibrary.paperRod );
			GameRegistry.addRecipe(new ItemStack(netherrackBoneSword), recipe, '#', Item.bone, '|', InfiLibrary.netherrackRod );
			GameRegistry.addRecipe(new ItemStack(iceBoneSword), recipe, '#', Item.bone, '|', InfiLibrary.iceRod );
			GameRegistry.addRecipe(new ItemStack(cactusBoneSword), recipe, '#', Item.bone, '|', InfiLibrary.cactusRod );
			GameRegistry.addRecipe(new ItemStack(flintBoneSword), recipe, '#', Item.bone, '|', InfiLibrary.flintRod );
		}

		if (PHInfiTools.enablePaperTools)
		{
			GameRegistry.addRecipe(new ItemStack(woodPaperSword), recipe, '#', InfiLibrary.paperStack, '|', Item.stick );
			GameRegistry.addRecipe(new ItemStack(bonePaperSword), recipe, '#', InfiLibrary.paperStack, '|', Item.bone );
			GameRegistry.addRecipe(new ItemStack(bonePaperSword), recipe, '#', InfiLibrary.paperStack, '|', InfiLibrary.boneRod );
			GameRegistry.addRecipe(new ItemStack(paperPaperSword), recipe, '#', InfiLibrary.paperStack, '|', InfiLibrary.paperRod );
			GameRegistry.addRecipe(new ItemStack(slimePaperSword), recipe, '#', InfiLibrary.paperStack, '|', InfiLibrary.slimeRod );
			GameRegistry.addRecipe(new ItemStack(cactusPaperSword), recipe, '#', InfiLibrary.paperStack, '|', InfiLibrary.cactusRod );
		}

		if (PHInfiTools.enableMossyTools)
		{
			GameRegistry.addRecipe(new ItemStack(woodMossySword), recipe, '#', InfiLibrary.mossyStone, '|', Item.stick );
			GameRegistry.addRecipe(new ItemStack(stoneMossySword), recipe, '#', InfiLibrary.mossyStone, '|', InfiLibrary.stoneRod );
			GameRegistry.addRecipe(new ItemStack(diamondMossySword), recipe, '#', InfiLibrary.mossyStone, '|', InfiLibrary.diamondRod );
			GameRegistry.addRecipe(new ItemStack(redstoneMossySword), recipe, '#', InfiLibrary.mossyStone, '|', InfiLibrary.redstoneRod );
			GameRegistry.addRecipe(new ItemStack(boneMossySword), recipe, '#', InfiLibrary.mossyStone, '|', Item.bone );
			GameRegistry.addRecipe(new ItemStack(boneMossySword), recipe, '#', InfiLibrary.mossyStone, '|', InfiLibrary.boneRod );
			GameRegistry.addRecipe(new ItemStack(mossyMossySword), recipe, '#', InfiLibrary.mossyStone, '|', InfiLibrary.mossyRod );
			GameRegistry.addRecipe(new ItemStack(netherrackMossySword), recipe, '#', InfiLibrary.mossyStone, '|', InfiLibrary.netherrackRod );
			GameRegistry.addRecipe(new ItemStack(glowstoneMossySword), recipe, '#', InfiLibrary.mossyStone, '|', InfiLibrary.glowstoneRod );
			GameRegistry.addRecipe(new ItemStack(cactusMossySword), recipe, '#', InfiLibrary.mossyStone, '|', InfiLibrary.cactusRod );
			GameRegistry.addRecipe(new ItemStack(blazeMossySword), recipe, '#', InfiLibrary.mossyStone, '|', Item.blazeRod );
			GameRegistry.addRecipe(new ItemStack(manyullynMossySword), recipe, '#', InfiLibrary.mossyStone, '|', InfiLibrary.manyullynRod );
			GameRegistry.addRecipe(new ItemStack(uraniumMossySword), recipe, '#', InfiLibrary.mossyStone, '|', InfiLibrary.uraniumRod );
		}

		if (PHInfiTools.enableNetherrackTools)
		{
			GameRegistry.addRecipe(new ItemStack(woodNetherrackSword), recipe, '#', Block.netherrack, '|', Item.stick );
			GameRegistry.addRecipe(new ItemStack(stoneNetherrackSword), recipe, '#', Block.netherrack, '|', InfiLibrary.stoneRod );
			GameRegistry.addRecipe(new ItemStack(sandstoneNetherrackSword), recipe, '#', Block.netherrack, '|', InfiLibrary.sandstoneRod );
			GameRegistry.addRecipe(new ItemStack(boneNetherrackSword), recipe, '#', Block.netherrack, '|', Item.bone );
			GameRegistry.addRecipe(new ItemStack(boneNetherrackSword), recipe, '#', Block.netherrack, '|', InfiLibrary.boneRod );
			GameRegistry.addRecipe(new ItemStack(paperNetherrackSword), recipe, '#', Block.netherrack, '|', InfiLibrary.paperRod );
			GameRegistry.addRecipe(new ItemStack(mossyNetherrackSword), recipe, '#', Block.netherrack, '|', InfiLibrary.mossyRod );
			GameRegistry.addRecipe(new ItemStack(netherrackNetherrackSword), recipe, '#', Block.netherrack, '|', InfiLibrary.netherrackRod );
			GameRegistry.addRecipe(new ItemStack(iceNetherrackSword), recipe, '#', Block.netherrack, '|', InfiLibrary.iceRod );
			GameRegistry.addRecipe(new ItemStack(slimeNetherrackSword), recipe, '#', Block.netherrack, '|', InfiLibrary.slimeRod );
			GameRegistry.addRecipe(new ItemStack(cactusNetherrackSword), recipe, '#', Block.netherrack, '|', InfiLibrary.cactusRod );
			GameRegistry.addRecipe(new ItemStack(flintNetherrackSword), recipe, '#', Block.netherrack, '|', InfiLibrary.flintRod );
			GameRegistry.addRecipe(new ItemStack(copperNetherrackSword), recipe, '#', Block.netherrack, '|', InfiLibrary.copperRod );
			GameRegistry.addRecipe(new ItemStack(bronzeNetherrackSword), recipe, '#', Block.netherrack, '|', InfiLibrary.bronzeRod );
		}

		if (PHInfiTools.enableGlowstoneTools)
		{
			GameRegistry.addRecipe(new ItemStack(woodGlowstoneSword), recipe, '#', InfiLibrary.glowstoneCrystal, '|', Item.stick );
			GameRegistry.addRecipe(new ItemStack(redstoneGlowstoneSword), recipe, '#', InfiLibrary.glowstoneCrystal, '|', InfiLibrary.redstoneRod );
			GameRegistry.addRecipe(new ItemStack(obsidianGlowstoneSword), recipe, '#', InfiLibrary.glowstoneCrystal, '|', InfiLibrary.obsidianRod );
			GameRegistry.addRecipe(new ItemStack(boneGlowstoneSword), recipe, '#', InfiLibrary.glowstoneCrystal, '|', Item.bone );
			GameRegistry.addRecipe(new ItemStack(boneGlowstoneSword), recipe, '#', InfiLibrary.glowstoneCrystal, '|', InfiLibrary.boneRod );
			GameRegistry.addRecipe(new ItemStack(netherrackGlowstoneSword), recipe, '#', InfiLibrary.glowstoneCrystal, '|', InfiLibrary.netherrackRod );
			GameRegistry.addRecipe(new ItemStack(glowstoneGlowstoneSword), recipe, '#', InfiLibrary.glowstoneCrystal, '|', InfiLibrary.glowstoneRod );
			GameRegistry.addRecipe(new ItemStack(iceGlowstoneSword), recipe, '#', InfiLibrary.glowstoneCrystal, '|', InfiLibrary.iceRod );
			GameRegistry.addRecipe(new ItemStack(slimeGlowstoneSword), recipe, '#', InfiLibrary.glowstoneCrystal, '|', InfiLibrary.slimeRod );
			GameRegistry.addRecipe(new ItemStack(cactusGlowstoneSword), recipe, '#', InfiLibrary.glowstoneCrystal, '|', InfiLibrary.cactusRod );
		}

		if (PHInfiTools.enableIceTools)
		{
			GameRegistry.addRecipe(new ItemStack(woodIceSword), recipe, '#', Block.ice, '|', Item.stick );
			GameRegistry.addRecipe(new ItemStack(boneIceSword), recipe, '#', Block.ice, '|', Item.bone );
			GameRegistry.addRecipe(new ItemStack(boneIceSword), recipe, '#', Block.ice, '|', InfiLibrary.boneRod );
			GameRegistry.addRecipe(new ItemStack(paperIceSword), recipe, '#', Block.ice, '|', InfiLibrary.paperRod );
			GameRegistry.addRecipe(new ItemStack(iceIceSword), recipe, '#', Block.ice, '|', InfiLibrary.iceRod );
			GameRegistry.addRecipe(new ItemStack(slimeIceSword), recipe, '#', Block.ice, '|', InfiLibrary.slimeRod );
			GameRegistry.addRecipe(new ItemStack(cactusIceSword), recipe, '#', Block.ice, '|', InfiLibrary.cactusRod );
		}

		if (PHInfiTools.enableLavaTools)
		{
			GameRegistry.addRecipe(new ItemStack(diamondLavaSword), recipe, '#', InfiLibrary.lavaCrystal, '|', InfiLibrary.diamondRod );
			GameRegistry.addRecipe(new ItemStack(obsidianLavaSword), recipe, '#', InfiLibrary.lavaCrystal, '|', InfiLibrary.obsidianRod );
			GameRegistry.addRecipe(new ItemStack(netherrackLavaSword), recipe, '#', InfiLibrary.lavaCrystal, '|', InfiLibrary.netherrackRod );
			GameRegistry.addRecipe(new ItemStack(lavaLavaSword), recipe, '#', InfiLibrary.lavaCrystal, '|', InfiLibrary.lavaRod );
			GameRegistry.addRecipe(new ItemStack(flintLavaSword), recipe, '#', InfiLibrary.lavaCrystal, '|', InfiLibrary.flintRod );
			GameRegistry.addRecipe(new ItemStack(blazeLavaSword), recipe, '#', InfiLibrary.lavaCrystal, '|', Item.blazeRod );
			GameRegistry.addRecipe(new ItemStack(manyullynLavaSword), recipe, '#', InfiLibrary.lavaCrystal, '|', InfiLibrary.manyullynRod );
			GameRegistry.addRecipe(new ItemStack(uraniumLavaSword), recipe, '#', InfiLibrary.lavaCrystal, '|', InfiLibrary.uraniumRod );
		}

		if (PHInfiTools.enableSlimeTools)
		{
			GameRegistry.addRecipe(new ItemStack(woodSlimeSword), recipe, '#', InfiLibrary.slimeCrystal, '|', Item.stick );
			GameRegistry.addRecipe(new ItemStack(sandstoneSlimeSword), recipe, '#', InfiLibrary.slimeCrystal, '|', InfiLibrary.sandstoneRod );
			GameRegistry.addRecipe(new ItemStack(boneSlimeSword), recipe, '#', InfiLibrary.slimeCrystal, '|', Item.bone );
			GameRegistry.addRecipe(new ItemStack(boneSlimeSword), recipe, '#', InfiLibrary.slimeCrystal, '|', InfiLibrary.boneRod );
			GameRegistry.addRecipe(new ItemStack(paperSlimeSword), recipe, '#', InfiLibrary.slimeCrystal, '|', InfiLibrary.paperRod );
			GameRegistry.addRecipe(new ItemStack(slimeSlimeSword), recipe, '#', InfiLibrary.slimeCrystal, '|', InfiLibrary.slimeRod );
			GameRegistry.addRecipe(new ItemStack(cactusSlimeSword), recipe, '#', InfiLibrary.slimeCrystal, '|', InfiLibrary.cactusRod );
		}

		if (PHInfiTools.enableCactusTools)
		{
			GameRegistry.addRecipe(new ItemStack(woodCactusSword), recipe, '#', Block.cactus, '|', Item.stick );
			GameRegistry.addRecipe(new ItemStack(sandstoneCactusSword), recipe, '#', Block.cactus, '|', InfiLibrary.sandstoneRod );
			GameRegistry.addRecipe(new ItemStack(boneCactusSword), recipe, '#', Block.cactus, '|', Item.bone );
			GameRegistry.addRecipe(new ItemStack(boneCactusSword), recipe, '#', Block.cactus, '|', InfiLibrary.boneRod );
			GameRegistry.addRecipe(new ItemStack(netherrackCactusSword), recipe, '#', Block.cactus, '|', InfiLibrary.netherrackRod );
			GameRegistry.addRecipe(new ItemStack(iceCactusSword), recipe, '#', Block.cactus, '|', InfiLibrary.iceRod );
			GameRegistry.addRecipe(new ItemStack(slimeCactusSword), recipe, '#', Block.cactus, '|', InfiLibrary.slimeRod );
			GameRegistry.addRecipe(new ItemStack(cactusCactusSword), recipe, '#', Block.cactus, '|', InfiLibrary.cactusRod );
		}

		if (PHInfiTools.enableFlintTools)
		{
			GameRegistry.addRecipe(new ItemStack(woodFlintSword), recipe, '#', Item.flint, '|', Item.stick );
			GameRegistry.addRecipe(new ItemStack(stoneFlintSword), recipe, '#', Item.flint, '|', InfiLibrary.stoneRod );
			GameRegistry.addRecipe(new ItemStack(sandstoneFlintSword), recipe, '#', Item.flint, '|', InfiLibrary.sandstoneRod );
			GameRegistry.addRecipe(new ItemStack(boneFlintSword), recipe, '#', Item.flint, '|', Item.bone );
			GameRegistry.addRecipe(new ItemStack(boneFlintSword), recipe, '#', Item.flint, '|', InfiLibrary.boneRod );
			GameRegistry.addRecipe(new ItemStack(netherrackFlintSword), recipe, '#', Item.flint, '|', InfiLibrary.netherrackRod );
			GameRegistry.addRecipe(new ItemStack(slimeFlintSword), recipe, '#', Item.flint, '|', InfiLibrary.slimeRod );
			GameRegistry.addRecipe(new ItemStack(cactusFlintSword), recipe, '#', Item.flint, '|', InfiLibrary.cactusRod );
			GameRegistry.addRecipe(new ItemStack(flintFlintSword), recipe, '#', Item.flint, '|', InfiLibrary.flintRod );
			GameRegistry.addRecipe(new ItemStack(copperFlintSword), recipe, '#', Item.flint, '|', InfiLibrary.copperRod );
			GameRegistry.addRecipe(new ItemStack(bronzeFlintSword), recipe, '#', Item.flint, '|', InfiLibrary.bronzeRod );
		}

		if (PHInfiTools.enableBlazeTools)
		{
			GameRegistry.addRecipe(new ItemStack(diamondBlazeSword), recipe, '#', InfiLibrary.blazeCrystal, '|', InfiLibrary.diamondRod );
			GameRegistry.addRecipe(new ItemStack(obsidianBlazeSword), recipe, '#', InfiLibrary.blazeCrystal, '|', InfiLibrary.obsidianRod );
			GameRegistry.addRecipe(new ItemStack(netherrackBlazeSword), recipe, '#', InfiLibrary.blazeCrystal, '|', InfiLibrary.netherrackRod );
			GameRegistry.addRecipe(new ItemStack(lavaBlazeSword), recipe, '#', InfiLibrary.blazeCrystal, '|', InfiLibrary.lavaRod );
			GameRegistry.addRecipe(new ItemStack(flintBlazeSword), recipe, '#', InfiLibrary.blazeCrystal, '|', InfiLibrary.flintRod );
			GameRegistry.addRecipe(new ItemStack(blazeBlazeSword), recipe, '#', InfiLibrary.blazeCrystal, '|', Item.blazeRod );
			GameRegistry.addRecipe(new ItemStack(manyullynBlazeSword), recipe, '#', InfiLibrary.blazeCrystal, '|', InfiLibrary.manyullynRod );
			GameRegistry.addRecipe(new ItemStack(uraniumBlazeSword), recipe, '#', InfiLibrary.blazeCrystal, '|', InfiLibrary.uraniumRod );
		}
	}

	public static void addStoneTools(String stack)
	{
		//GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(woodStoneSword), recipe, '#', stack, '|', Item.stick ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(stoneStoneSword), recipe, '#', stack, '|', InfiLibrary.stoneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(sandstoneStoneSword), recipe, '#', stack, '|', InfiLibrary.sandstoneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(boneStoneSword), recipe, '#', stack, '|', Item.bone ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(boneStoneSword), recipe, '#', stack, '|', InfiLibrary.boneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(netherrackStoneSword), recipe, '#', stack, '|', InfiLibrary.netherrackRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(iceStoneSword), recipe, '#', stack, '|', InfiLibrary.iceRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(slimeStoneSword), recipe, '#', stack, '|', InfiLibrary.slimeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(cactusStoneSword), recipe, '#', stack, '|', InfiLibrary.cactusRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(flintStoneSword), recipe, '#', stack, '|', InfiLibrary.flintRod ) );
	}

	public static void addCopperTools(String stack)
	{
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(woodCopperSword), recipe, '#', stack, '|', Item.stick ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(stoneCopperSword), recipe, '#', stack, '|', InfiLibrary.stoneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(boneCopperSword), recipe, '#', stack, '|', Item.bone ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(boneCopperSword), recipe, '#', stack, '|', InfiLibrary.boneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(netherrackCopperSword), recipe, '#', stack, '|', InfiLibrary.netherrackRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(slimeCopperSword), recipe, '#', stack, '|', InfiLibrary.slimeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(cactusCopperSword), recipe, '#', stack, '|', InfiLibrary.cactusRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(flintCopperSword), recipe, '#', stack, '|', InfiLibrary.flintRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(copperCopperSword), recipe, '#', stack, '|', InfiLibrary.copperRod ) );
	}

	public static void addBronzeTools(String stack)
	{
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(woodBronzeSword), recipe, '#', stack, '|', Item.stick ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(stoneBronzeSword), recipe, '#', stack, '|', InfiLibrary.stoneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(boneBronzeSword), recipe, '#', stack, '|', Item.bone ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(boneBronzeSword), recipe, '#', stack, '|', InfiLibrary.boneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(netherrackBronzeSword), recipe, '#', stack, '|', InfiLibrary.netherrackRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(slimeBronzeSword), recipe, '#', stack, '|', InfiLibrary.slimeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(cactusBronzeSword), recipe, '#', stack, '|', InfiLibrary.cactusRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(flintBronzeSword), recipe, '#', stack, '|', InfiLibrary.flintRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(copperBronzeSword), recipe, '#', stack, '|', InfiLibrary.copperRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(bronzeBronzeSword), recipe, '#', stack, '|', InfiLibrary.bronzeRod ) );
	}

	public static void addWorkedIronTools(String stack)
	{
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(woodWorkedIronSword), recipe, '#', stack, '|', Item.stick ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(stoneWorkedIronSword), recipe, '#', stack, '|', InfiLibrary.stoneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(ironWorkedIronSword), recipe, '#', stack, '|', InfiLibrary.ironRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(diamondWorkedIronSword), recipe, '#', stack, '|', InfiLibrary.diamondRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(redstoneWorkedIronSword), recipe, '#', stack, '|', InfiLibrary.redstoneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(obsidianWorkedIronSword), recipe, '#', stack, '|', InfiLibrary.obsidianRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(boneWorkedIronSword), recipe, '#', stack, '|', Item.bone ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(boneWorkedIronSword), recipe, '#', stack, '|', InfiLibrary.boneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(netherrackWorkedIronSword), recipe, '#', stack, '|', InfiLibrary.netherrackRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(glowstoneWorkedIronSword), recipe, '#', stack, '|', InfiLibrary.glowstoneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(iceWorkedIronSword), recipe, '#', stack, '|', InfiLibrary.iceRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(slimeWorkedIronSword), recipe, '#', stack, '|', InfiLibrary.slimeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(cactusWorkedIronSword), recipe, '#', stack, '|', InfiLibrary.cactusRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(blazeWorkedIronSword), recipe, '#', stack, '|', Item.blazeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(copperWorkedIronSword), recipe, '#', stack, '|', InfiLibrary.copperRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(bronzeWorkedIronSword), recipe, '#', stack, '|', InfiLibrary.bronzeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(workedWorkedIronSword), recipe, '#', stack, '|', InfiLibrary.workedIronRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(steelWorkedIronSword), recipe, '#', stack, '|', InfiLibrary.steelRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(uraniumWorkedIronSword), recipe, '#', stack, '|', InfiLibrary.uraniumRod ) );
	}

	public static void addSteelTools(String stack)
	{
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(woodSteelSword), recipe, '#', stack, '|', Item.stick ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(stoneSteelSword), recipe, '#', stack, '|', InfiLibrary.stoneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(ironSteelSword), recipe, '#', stack, '|', InfiLibrary.ironRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(diamondSteelSword), recipe, '#', stack, '|', InfiLibrary.diamondRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(redstoneSteelSword), recipe, '#', stack, '|', InfiLibrary.redstoneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(obsidianSteelSword), recipe, '#', stack, '|', InfiLibrary.obsidianRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(boneSteelSword), recipe, '#', stack, '|', Item.bone ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(boneSteelSword), recipe, '#', stack, '|', InfiLibrary.boneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(netherrackSteelSword), recipe, '#', stack, '|', InfiLibrary.netherrackRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(glowstoneSteelSword), recipe, '#', stack, '|', InfiLibrary.glowstoneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(iceSteelSword), recipe, '#', stack, '|', InfiLibrary.iceRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(slimeSteelSword), recipe, '#', stack, '|', InfiLibrary.slimeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(cactusSteelSword), recipe, '#', stack, '|', InfiLibrary.cactusRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(blazeSteelSword), recipe, '#', stack, '|', Item.blazeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(copperSteelSword), recipe, '#', stack, '|', InfiLibrary.copperRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(bronzeSteelSword), recipe, '#', stack, '|', InfiLibrary.bronzeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(workedSteelSword), recipe, '#', stack, '|', InfiLibrary.workedIronRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(steelSteelSword), recipe, '#', stack, '|', InfiLibrary.steelRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(cobaltSteelSword), recipe, '#', stack, '|', InfiLibrary.cobaltRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(arditeSteelSword), recipe, '#', stack, '|', InfiLibrary.arditeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(uraniumSteelSword), recipe, '#', stack, '|', InfiLibrary.uraniumRod ) );
	}

	public static void addCobaltTools(String stack)
	{
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(woodCobaltSword), recipe, '#', stack, '|', Item.stick ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(stoneCobaltSword), recipe, '#', stack, '|', InfiLibrary.stoneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(ironCobaltSword), recipe, '#', stack, '|', InfiLibrary.ironRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(diamondCobaltSword), recipe, '#', stack, '|', InfiLibrary.diamondRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(redstoneCobaltSword), recipe, '#', stack, '|', InfiLibrary.redstoneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(obsidianCobaltSword), recipe, '#', stack, '|', InfiLibrary.obsidianRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(boneCobaltSword), recipe, '#', stack, '|', Item.bone ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(boneCobaltSword), recipe, '#', stack, '|', InfiLibrary.boneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(slimeCobaltSword), recipe, '#', stack, '|', InfiLibrary.slimeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(cactusCobaltSword), recipe, '#', stack, '|', InfiLibrary.cactusRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(blazeCobaltSword), recipe, '#', stack, '|', Item.blazeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(copperCobaltSword), recipe, '#', stack, '|', InfiLibrary.copperRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(bronzeCobaltSword), recipe, '#', stack, '|', InfiLibrary.bronzeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(workedCobaltSword), recipe, '#', stack, '|', InfiLibrary.workedIronRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(steelCobaltSword), recipe, '#', stack, '|', InfiLibrary.steelRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(cobaltCobaltSword), recipe, '#', stack, '|', InfiLibrary.cobaltRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(arditeCobaltSword), recipe, '#', stack, '|', InfiLibrary.arditeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(manyullynCobaltSword), recipe, '#', stack, '|', InfiLibrary.manyullynRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(uraniumCobaltSword), recipe, '#', stack, '|', InfiLibrary.uraniumRod ) );
	}

	public static void addArditeTools(String stack)
	{
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(woodArditeSword), recipe, '#', stack, '|', Item.stick ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(stoneArditeSword), recipe, '#', stack, '|', InfiLibrary.stoneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(ironArditeSword), recipe, '#', stack, '|', InfiLibrary.ironRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(diamondArditeSword), recipe, '#', stack, '|', InfiLibrary.diamondRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(redstoneArditeSword), recipe, '#', stack, '|', InfiLibrary.redstoneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(obsidianArditeSword), recipe, '#', stack, '|', InfiLibrary.obsidianRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(boneArditeSword), recipe, '#', stack, '|', Item.bone ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(boneArditeSword), recipe, '#', stack, '|', InfiLibrary.boneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(slimeArditeSword), recipe, '#', stack, '|', InfiLibrary.slimeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(cactusArditeSword), recipe, '#', stack, '|', InfiLibrary.cactusRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(blazeArditeSword), recipe, '#', stack, '|', Item.blazeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(copperArditeSword), recipe, '#', stack, '|', InfiLibrary.copperRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(bronzeArditeSword), recipe, '#', stack, '|', InfiLibrary.bronzeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(workedArditeSword), recipe, '#', stack, '|', InfiLibrary.workedIronRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(steelArditeSword), recipe, '#', stack, '|', InfiLibrary.steelRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(cobaltArditeSword), recipe, '#', stack, '|', InfiLibrary.cobaltRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(arditeArditeSword), recipe, '#', stack, '|', InfiLibrary.arditeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(manyullynArditeSword), recipe, '#', stack, '|', InfiLibrary.manyullynRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(uraniumArditeSword), recipe, '#', stack, '|', InfiLibrary.uraniumRod ) );
	}

	public static void addManyullynTools(String stack)
	{
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(woodManyullynSword), recipe, '#', stack, '|', Item.stick ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(stoneManyullynSword), recipe, '#', stack, '|', InfiLibrary.stoneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(ironManyullynSword), recipe, '#', stack, '|', InfiLibrary.ironRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(diamondManyullynSword), recipe, '#', stack, '|', InfiLibrary.diamondRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(redstoneManyullynSword), recipe, '#', stack, '|', InfiLibrary.redstoneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(obsidianManyullynSword), recipe, '#', stack, '|', InfiLibrary.obsidianRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(boneManyullynSword), recipe, '#', stack, '|', Item.bone ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(boneManyullynSword), recipe, '#', stack, '|', InfiLibrary.boneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(slimeManyullynSword), recipe, '#', stack, '|', InfiLibrary.slimeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(cactusManyullynSword), recipe, '#', stack, '|', InfiLibrary.cactusRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(blazeManyullynSword), recipe, '#', stack, '|', Item.blazeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(copperManyullynSword), recipe, '#', stack, '|', InfiLibrary.copperRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(bronzeManyullynSword), recipe, '#', stack, '|', InfiLibrary.bronzeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(workedManyullynSword), recipe, '#', stack, '|', InfiLibrary.workedIronRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(steelManyullynSword), recipe, '#', stack, '|', InfiLibrary.steelRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(cobaltManyullynSword), recipe, '#', stack, '|', InfiLibrary.cobaltRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(arditeManyullynSword), recipe, '#', stack, '|', InfiLibrary.arditeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(manyullynManyullynSword), recipe, '#', stack, '|', InfiLibrary.manyullynRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(uraniumManyullynSword), recipe, '#', stack, '|', InfiLibrary.uraniumRod ) );
	}

	public static void addUraniumTools(String stack)
	{
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(diamondUraniumSword), recipe, '#', stack, '|', InfiLibrary.diamondRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(redstoneUraniumSword), recipe, '#', stack, '|', InfiLibrary.redstoneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(boneUraniumSword), recipe, '#', stack, '|', Item.bone ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(boneUraniumSword), recipe, '#', stack, '|', InfiLibrary.boneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(netherrackUraniumSword), recipe, '#', stack, '|', InfiLibrary.netherrackRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(glowstoneUraniumSword), recipe, '#', stack, '|', InfiLibrary.glowstoneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(lavaUraniumSword), recipe, '#', stack, '|', InfiLibrary.lavaRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(blazeUraniumSword), recipe, '#', stack, '|', Item.blazeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(cobaltUraniumSword), recipe, '#', stack, '|', InfiLibrary.cobaltRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(arditeUraniumSword), recipe, '#', stack, '|', InfiLibrary.arditeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(uraniumUraniumSword), recipe, '#', stack, '|', InfiLibrary.uraniumRod ) );
	}

	public static Item woodWoodSword;
	public static Item sandstoneWoodSword;
	public static Item boneWoodSword;
	public static Item paperWoodSword;
	public static Item iceWoodSword;
	public static Item slimeWoodSword;
	public static Item cactusWoodSword;

	public static Item woodStoneSword;
	public static Item stoneStoneSword;
	public static Item sandstoneStoneSword;
	public static Item boneStoneSword;
	public static Item netherrackStoneSword;
	public static Item iceStoneSword;
	public static Item slimeStoneSword;
	public static Item cactusStoneSword;
	public static Item flintStoneSword;

	public static Item woodIronSword;
	public static Item stoneIronSword;
	public static Item ironIronSword;
	public static Item boneIronSword;
	public static Item netherrackIronSword;
	public static Item glowstoneIronSword;
	public static Item cactusIronSword;
	public static Item copperIronSword;
	public static Item bronzeIronSword;

	public static Item woodDiamondSword;
	public static Item stoneDiamondSword;
	public static Item ironDiamondSword;
	public static Item diamondDiamondSword;
	public static Item redstoneDiamondSword;
	public static Item obsidianDiamondSword;
	public static Item boneDiamondSword;
	public static Item mossyDiamondSword;
	public static Item netherrackDiamondSword;
	public static Item glowstoneDiamondSword;
	public static Item lavaDiamondSword;
	public static Item cactusDiamondSword;
	public static Item flintDiamondSword;
	public static Item blazeDiamondSword;
	public static Item copperDiamondSword;
	public static Item bronzeDiamondSword;
	public static Item workedDiamondSword;
	public static Item steelDiamondSword;
	public static Item cobaltDiamondSword;
	public static Item arditeDiamondSword;
	public static Item manyullynDiamondSword;
	public static Item uraniumDiamondSword;

	public static Item woodRedstoneSword;
	public static Item stoneRedstoneSword;
	public static Item ironRedstoneSword;
	public static Item redstoneRedstoneSword;
	public static Item obsidianRedstoneSword;
	public static Item sandstoneRedstoneSword;
	public static Item boneRedstoneSword;
	public static Item paperRedstoneSword;
	public static Item mossyRedstoneSword;
	public static Item netherrackRedstoneSword;
	public static Item glowstoneRedstoneSword;
	public static Item iceRedstoneSword;
	public static Item lavaRedstoneSword;
	public static Item slimeRedstoneSword;
	public static Item cactusRedstoneSword;
	public static Item flintRedstoneSword;
	public static Item copperRedstoneSword;
	public static Item bronzeRedstoneSword;
	public static Item workedRedstoneSword;
	public static Item uraniumRedstoneSword;

	public static Item woodObsidianSword;
	public static Item stoneObsidianSword;
	public static Item redstoneObsidianSword;
	public static Item obsidianObsidianSword;
	public static Item boneObsidianSword;
	public static Item netherrackObsidianSword;
	public static Item glowstoneObsidianSword;
	public static Item iceObsidianSword;
	public static Item lavaObsidianSword;
	public static Item cactusObsidianSword;

	public static Item woodSandstoneSword;
	public static Item sandstoneSandstoneSword;
	public static Item boneSandstoneSword;
	public static Item netherrackSandstoneSword;
	public static Item iceSandstoneSword;
	public static Item slimeSandstoneSword;
	public static Item cactusSandstoneSword;
	public static Item flintSandstoneSword;

	public static Item woodBoneSword;
	public static Item stoneBoneSword;
	public static Item sandstoneBoneSword;
	public static Item boneBoneSword;
	public static Item paperBoneSword;
	public static Item netherrackBoneSword;
	public static Item iceBoneSword;
	public static Item cactusBoneSword;
	public static Item flintBoneSword;

	public static Item woodPaperSword;
	public static Item bonePaperSword;
	public static Item paperPaperSword;
	public static Item slimePaperSword;
	public static Item cactusPaperSword;

	public static Item woodMossySword;
	public static Item stoneMossySword;
	public static Item diamondMossySword;
	public static Item redstoneMossySword;
	public static Item boneMossySword;
	public static Item mossyMossySword;
	public static Item netherrackMossySword;
	public static Item glowstoneMossySword;
	public static Item cactusMossySword;
	public static Item blazeMossySword;
	public static Item manyullynMossySword;
	public static Item uraniumMossySword;

	public static Item woodNetherrackSword;
	public static Item stoneNetherrackSword;
	public static Item sandstoneNetherrackSword;
	public static Item boneNetherrackSword;
	public static Item paperNetherrackSword;
	public static Item mossyNetherrackSword;
	public static Item netherrackNetherrackSword;
	public static Item iceNetherrackSword;
	public static Item slimeNetherrackSword;
	public static Item cactusNetherrackSword;
	public static Item flintNetherrackSword;
	public static Item copperNetherrackSword;
	public static Item bronzeNetherrackSword;

	public static Item woodGlowstoneSword;
	public static Item redstoneGlowstoneSword;
	public static Item obsidianGlowstoneSword;
	public static Item boneGlowstoneSword;
	public static Item netherrackGlowstoneSword;
	public static Item glowstoneGlowstoneSword;
	public static Item iceGlowstoneSword;
	public static Item slimeGlowstoneSword;
	public static Item cactusGlowstoneSword;

	public static Item woodIceSword;
	public static Item boneIceSword;
	public static Item paperIceSword;
	public static Item iceIceSword;
	public static Item slimeIceSword;
	public static Item cactusIceSword;

	public static Item diamondLavaSword;
	public static Item obsidianLavaSword;
	public static Item netherrackLavaSword;
	public static Item lavaLavaSword;
	public static Item flintLavaSword;
	public static Item blazeLavaSword;
	public static Item manyullynLavaSword;
	public static Item uraniumLavaSword;

	public static Item woodSlimeSword;
	public static Item sandstoneSlimeSword;
	public static Item boneSlimeSword;
	public static Item paperSlimeSword;
	public static Item slimeSlimeSword;
	public static Item cactusSlimeSword;

	public static Item woodCactusSword;
	public static Item sandstoneCactusSword;
	public static Item boneCactusSword;
	public static Item netherrackCactusSword;
	public static Item iceCactusSword;
	public static Item slimeCactusSword;
	public static Item cactusCactusSword;

	public static Item woodFlintSword;
	public static Item stoneFlintSword;
	public static Item sandstoneFlintSword;
	public static Item boneFlintSword;
	public static Item netherrackFlintSword;
	public static Item slimeFlintSword;
	public static Item cactusFlintSword;
	public static Item flintFlintSword;
	public static Item copperFlintSword;
	public static Item bronzeFlintSword;

	public static Item diamondBlazeSword;
	public static Item obsidianBlazeSword;
	public static Item netherrackBlazeSword;
	public static Item lavaBlazeSword;
	public static Item flintBlazeSword;
	public static Item blazeBlazeSword;
	public static Item manyullynBlazeSword;
	public static Item uraniumBlazeSword;

	public static Item woodCopperSword;
	public static Item stoneCopperSword;
	public static Item boneCopperSword;
	public static Item netherrackCopperSword;
	public static Item slimeCopperSword;
	public static Item cactusCopperSword;
	public static Item flintCopperSword;
	public static Item copperCopperSword;

	public static Item woodBronzeSword;
	public static Item stoneBronzeSword;
	public static Item boneBronzeSword;
	public static Item netherrackBronzeSword;
	public static Item slimeBronzeSword;
	public static Item cactusBronzeSword;
	public static Item flintBronzeSword;
	public static Item copperBronzeSword;
	public static Item bronzeBronzeSword;

	public static Item woodWorkedIronSword;
	public static Item stoneWorkedIronSword;
	public static Item ironWorkedIronSword;
	public static Item diamondWorkedIronSword;
	public static Item redstoneWorkedIronSword;
	public static Item obsidianWorkedIronSword;
	public static Item boneWorkedIronSword;
	public static Item netherrackWorkedIronSword;
	public static Item glowstoneWorkedIronSword;
	public static Item iceWorkedIronSword;
	public static Item slimeWorkedIronSword;
	public static Item cactusWorkedIronSword;
	public static Item blazeWorkedIronSword;
	public static Item copperWorkedIronSword;
	public static Item bronzeWorkedIronSword;
	public static Item workedWorkedIronSword;
	public static Item steelWorkedIronSword;
	public static Item uraniumWorkedIronSword;

	public static Item woodSteelSword;
	public static Item stoneSteelSword;
	public static Item ironSteelSword;
	public static Item diamondSteelSword;
	public static Item redstoneSteelSword;
	public static Item obsidianSteelSword;
	public static Item boneSteelSword;
	public static Item netherrackSteelSword;
	public static Item glowstoneSteelSword;
	public static Item iceSteelSword;
	public static Item slimeSteelSword;
	public static Item cactusSteelSword;
	public static Item blazeSteelSword;
	public static Item copperSteelSword;
	public static Item bronzeSteelSword;
	public static Item workedSteelSword;
	public static Item steelSteelSword;
	public static Item cobaltSteelSword;
	public static Item arditeSteelSword;
	public static Item uraniumSteelSword;

	public static Item woodCobaltSword;
	public static Item stoneCobaltSword;
	public static Item ironCobaltSword;
	public static Item diamondCobaltSword;
	public static Item redstoneCobaltSword;
	public static Item obsidianCobaltSword;
	public static Item boneCobaltSword;
	public static Item slimeCobaltSword;
	public static Item cactusCobaltSword;
	public static Item blazeCobaltSword;
	public static Item copperCobaltSword;
	public static Item bronzeCobaltSword;
	public static Item workedCobaltSword;
	public static Item steelCobaltSword;
	public static Item cobaltCobaltSword;
	public static Item arditeCobaltSword;
	public static Item manyullynCobaltSword;
	public static Item uraniumCobaltSword;

	public static Item woodArditeSword;
	public static Item stoneArditeSword;
	public static Item ironArditeSword;
	public static Item diamondArditeSword;
	public static Item redstoneArditeSword;
	public static Item obsidianArditeSword;
	public static Item boneArditeSword;
	public static Item slimeArditeSword;
	public static Item cactusArditeSword;
	public static Item blazeArditeSword;
	public static Item copperArditeSword;
	public static Item bronzeArditeSword;
	public static Item workedArditeSword;
	public static Item steelArditeSword;
	public static Item cobaltArditeSword;
	public static Item arditeArditeSword;
	public static Item manyullynArditeSword;
	public static Item uraniumArditeSword;

	public static Item woodManyullynSword;
	public static Item stoneManyullynSword;
	public static Item ironManyullynSword;
	public static Item diamondManyullynSword;
	public static Item redstoneManyullynSword;
	public static Item obsidianManyullynSword;
	public static Item boneManyullynSword;
	public static Item slimeManyullynSword;
	public static Item cactusManyullynSword;
	public static Item blazeManyullynSword;
	public static Item copperManyullynSword;
	public static Item bronzeManyullynSword;
	public static Item workedManyullynSword;
	public static Item steelManyullynSword;
	public static Item cobaltManyullynSword;
	public static Item arditeManyullynSword;
	public static Item manyullynManyullynSword;
	public static Item uraniumManyullynSword;

	public static Item diamondUraniumSword;
	public static Item redstoneUraniumSword;
	public static Item boneUraniumSword;
	public static Item netherrackUraniumSword;
	public static Item glowstoneUraniumSword;
	public static Item lavaUraniumSword;
	public static Item blazeUraniumSword;
	public static Item cobaltUraniumSword;
	public static Item arditeUraniumSword;
	public static Item uraniumUraniumSword;
}
