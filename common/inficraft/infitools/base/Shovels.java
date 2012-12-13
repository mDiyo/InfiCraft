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

public class Shovels
{
	public static Shovels instance = new Shovels();

	private static String[] recipe = { "#", "|", "|" };

	public static Shovels getInstance()
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
			sandstoneWoodShovel = new InfiToolShovel(PHInfiTools.woodShovelID + 1, InfiMaterialEnum.Wood, InfiMaterialEnum.Sandstone, "sandstoneWoodShovel");
			boneWoodShovel = new InfiToolShovel(PHInfiTools.woodShovelID + 2, InfiMaterialEnum.Wood, InfiMaterialEnum.Bone, "boneWoodShovel");
			paperWoodShovel = new InfiToolShovel(PHInfiTools.woodShovelID + 3, InfiMaterialEnum.Wood, InfiMaterialEnum.Paper, "paperWoodShovel");
			iceWoodShovel = new InfiToolShovel(PHInfiTools.woodShovelID + 4, InfiMaterialEnum.Wood, InfiMaterialEnum.Ice, "iceWoodShovel");
			slimeWoodShovel = new InfiToolShovel(PHInfiTools.woodShovelID + 5, InfiMaterialEnum.Wood, InfiMaterialEnum.Slime, "slimeWoodShovel");
			cactusWoodShovel = new InfiToolShovel(PHInfiTools.woodShovelID + 6, InfiMaterialEnum.Wood, InfiMaterialEnum.Cactus, "cactusWoodShovel");

			MinecraftForge.setToolClass(sandstoneWoodShovel, "Shovel", InfiMaterialEnum.Wood.getHarvestLevel());
			MinecraftForge.setToolClass(boneWoodShovel, "Shovel", InfiMaterialEnum.Wood.getHarvestLevel());
			MinecraftForge.setToolClass(paperWoodShovel, "Shovel", InfiMaterialEnum.Wood.getHarvestLevel());
			MinecraftForge.setToolClass(iceWoodShovel, "Shovel", InfiMaterialEnum.Wood.getHarvestLevel());
			MinecraftForge.setToolClass(slimeWoodShovel, "Shovel", InfiMaterialEnum.Wood.getHarvestLevel());
			MinecraftForge.setToolClass(cactusWoodShovel, "Shovel", InfiMaterialEnum.Wood.getHarvestLevel());
		}

		if (PHInfiTools.enableStoneTools)
		{
			stoneStoneShovel = new InfiToolShovel(PHInfiTools.stoneShovelID + 1, InfiMaterialEnum.Stone, InfiMaterialEnum.Stone, "stoneStoneShovel");
			sandstoneStoneShovel = new InfiToolShovel(PHInfiTools.stoneShovelID + 2, InfiMaterialEnum.Stone, InfiMaterialEnum.Sandstone, "sandstoneStoneShovel");
			boneStoneShovel = new InfiToolShovel(PHInfiTools.stoneShovelID + 3, InfiMaterialEnum.Stone, InfiMaterialEnum.Bone, "boneStoneShovel");
			netherrackStoneShovel = new InfiToolShovel(PHInfiTools.stoneShovelID + 4, InfiMaterialEnum.Stone, InfiMaterialEnum.Netherrack, "netherrackStoneShovel");
			iceStoneShovel = new InfiToolShovel(PHInfiTools.stoneShovelID + 5, InfiMaterialEnum.Stone, InfiMaterialEnum.Ice, "iceStoneShovel");
			slimeStoneShovel = new InfiToolShovel(PHInfiTools.stoneShovelID + 6, InfiMaterialEnum.Stone, InfiMaterialEnum.Slime, "slimeStoneShovel");
			cactusStoneShovel = new InfiToolShovel(PHInfiTools.stoneShovelID + 7, InfiMaterialEnum.Stone, InfiMaterialEnum.Cactus, "cactusStoneShovel");
			flintStoneShovel = new InfiToolShovel(PHInfiTools.stoneShovelID + 8, InfiMaterialEnum.Stone, InfiMaterialEnum.Flint, "flintStoneShovel");

			MinecraftForge.setToolClass(stoneStoneShovel, "Shovel", InfiMaterialEnum.Stone.getHarvestLevel());
			MinecraftForge.setToolClass(sandstoneStoneShovel, "Shovel", InfiMaterialEnum.Stone.getHarvestLevel());
			MinecraftForge.setToolClass(boneStoneShovel, "Shovel", InfiMaterialEnum.Stone.getHarvestLevel());
			MinecraftForge.setToolClass(netherrackStoneShovel, "Shovel", InfiMaterialEnum.Stone.getHarvestLevel());
			MinecraftForge.setToolClass(iceStoneShovel, "Shovel", InfiMaterialEnum.Stone.getHarvestLevel());
			MinecraftForge.setToolClass(slimeStoneShovel, "Shovel", InfiMaterialEnum.Stone.getHarvestLevel());
			MinecraftForge.setToolClass(cactusStoneShovel, "Shovel", InfiMaterialEnum.Stone.getHarvestLevel());
			MinecraftForge.setToolClass(flintStoneShovel, "Shovel", InfiMaterialEnum.Stone.getHarvestLevel());
		}

		if (PHInfiTools.enableIronTools)
		{
			stoneIronShovel = new InfiToolShovel(PHInfiTools.ironShovelID + 1, InfiMaterialEnum.Iron, InfiMaterialEnum.Stone, "stoneIronShovel");
			ironIronShovel = new InfiToolShovel(PHInfiTools.ironShovelID + 2, InfiMaterialEnum.Iron, InfiMaterialEnum.Iron, "ironIronShovel");
			boneIronShovel = new InfiToolShovel(PHInfiTools.ironShovelID + 3, InfiMaterialEnum.Iron, InfiMaterialEnum.Bone, "boneIronShovel");
			netherrackIronShovel = new InfiToolShovel(PHInfiTools.ironShovelID + 4, InfiMaterialEnum.Iron, InfiMaterialEnum.Netherrack, "netherrackIronShovel");
			glowstoneIronShovel = new InfiToolShovel(PHInfiTools.ironShovelID + 5, InfiMaterialEnum.Iron, InfiMaterialEnum.Glowstone, "glowstoneIronShovel");
			cactusIronShovel = new InfiToolShovel(PHInfiTools.ironShovelID + 6, InfiMaterialEnum.Iron, InfiMaterialEnum.Cactus, "cactusIronShovel");
			copperIronShovel = new InfiToolShovel(PHInfiTools.ironShovelID + 7, InfiMaterialEnum.Iron, InfiMaterialEnum.Copper, "copperIronShovel");
			bronzeIronShovel = new InfiToolShovel(PHInfiTools.ironShovelID + 8, InfiMaterialEnum.Iron, InfiMaterialEnum.Bronze, "bronzeIronShovel");

			MinecraftForge.setToolClass(stoneIronShovel, "Shovel", InfiMaterialEnum.Iron.getHarvestLevel());
			MinecraftForge.setToolClass(ironIronShovel, "Shovel", InfiMaterialEnum.Iron.getHarvestLevel());
			MinecraftForge.setToolClass(boneIronShovel, "Shovel", InfiMaterialEnum.Iron.getHarvestLevel());
			MinecraftForge.setToolClass(netherrackIronShovel, "Shovel", InfiMaterialEnum.Iron.getHarvestLevel());
			MinecraftForge.setToolClass(glowstoneIronShovel, "Shovel", InfiMaterialEnum.Iron.getHarvestLevel());
			MinecraftForge.setToolClass(cactusIronShovel, "Shovel", InfiMaterialEnum.Iron.getHarvestLevel());
			MinecraftForge.setToolClass(copperIronShovel, "Shovel", InfiMaterialEnum.Iron.getHarvestLevel());
			MinecraftForge.setToolClass(bronzeIronShovel, "Shovel", InfiMaterialEnum.Iron.getHarvestLevel());
		}

		if (PHInfiTools.enableDiamondTools)
		{
			stoneDiamondShovel = new InfiToolShovel(PHInfiTools.diamondShovelID + 1, InfiMaterialEnum.Diamond, InfiMaterialEnum.Stone, "stoneDiamondShovel");
			ironDiamondShovel = new InfiToolShovel(PHInfiTools.diamondShovelID + 2, InfiMaterialEnum.Diamond, InfiMaterialEnum.Iron, "ironDiamondShovel");
			diamondDiamondShovel = new InfiToolShovel(PHInfiTools.diamondShovelID + 3, InfiMaterialEnum.Diamond, InfiMaterialEnum.Diamond, "diamondDiamondShovel");
			redstoneDiamondShovel = new InfiToolShovel(PHInfiTools.diamondShovelID + 4, InfiMaterialEnum.Diamond, InfiMaterialEnum.Redstone, "redstoneDiamondShovel");
			obsidianDiamondShovel = new InfiToolShovel(PHInfiTools.diamondShovelID + 5, InfiMaterialEnum.Diamond, InfiMaterialEnum.Obsidian, "obsidianDiamondShovel");
			boneDiamondShovel = new InfiToolShovel(PHInfiTools.diamondShovelID + 6, InfiMaterialEnum.Diamond, InfiMaterialEnum.Bone, "boneDiamondShovel");
			mossyDiamondShovel = new InfiToolShovel(PHInfiTools.diamondShovelID + 7, InfiMaterialEnum.Diamond, InfiMaterialEnum.Mossy, "mossyDiamondShovel");
			netherrackDiamondShovel = new InfiToolShovel(PHInfiTools.diamondShovelID + 8, InfiMaterialEnum.Diamond, InfiMaterialEnum.Netherrack, "netherrackDiamondShovel");
			glowstoneDiamondShovel = new InfiToolShovel(PHInfiTools.diamondShovelID + 9, InfiMaterialEnum.Diamond, InfiMaterialEnum.Glowstone, "glowstoneDiamondShovel");
			lavaDiamondShovel = new InfiToolShovel(PHInfiTools.diamondShovelID + 10, InfiMaterialEnum.Diamond, InfiMaterialEnum.Lava, "lavaDiamondShovel");
			cactusDiamondShovel = new InfiToolShovel(PHInfiTools.diamondShovelID + 11, InfiMaterialEnum.Diamond, InfiMaterialEnum.Cactus, "cactusDiamondShovel");
			flintDiamondShovel = new InfiToolShovel(PHInfiTools.diamondShovelID + 12, InfiMaterialEnum.Diamond, InfiMaterialEnum.Flint, "flintDiamondShovel");
			blazeDiamondShovel = new InfiToolShovel(PHInfiTools.diamondShovelID + 13, InfiMaterialEnum.Diamond, InfiMaterialEnum.Blaze, "blazeDiamondShovel");
			copperDiamondShovel = new InfiToolShovel(PHInfiTools.diamondShovelID + 14, InfiMaterialEnum.Diamond, InfiMaterialEnum.Copper, "copperDiamondShovel");
			bronzeDiamondShovel = new InfiToolShovel(PHInfiTools.diamondShovelID + 15, InfiMaterialEnum.Diamond, InfiMaterialEnum.Bronze, "bronzeDiamondShovel");
			workedDiamondShovel = new InfiToolShovel(PHInfiTools.diamondShovelID + 16, InfiMaterialEnum.Diamond, InfiMaterialEnum.WorkedIron, "workedDiamondShovel");
			steelDiamondShovel = new InfiToolShovel(PHInfiTools.diamondShovelID + 17, InfiMaterialEnum.Diamond, InfiMaterialEnum.Steel, "steelDiamondShovel");
			cobaltDiamondShovel = new InfiToolShovel(PHInfiTools.diamondShovelID + 18, InfiMaterialEnum.Diamond, InfiMaterialEnum.Cobalt, "cobaltDiamondShovel");
			arditeDiamondShovel = new InfiToolShovel(PHInfiTools.diamondShovelID + 19, InfiMaterialEnum.Diamond, InfiMaterialEnum.Ardite, "arditeDiamondShovel");
			manyullynDiamondShovel = new InfiToolShovel(PHInfiTools.diamondShovelID + 20, InfiMaterialEnum.Diamond, InfiMaterialEnum.Manyullyn, "manyullynDiamondShovel");
			uraniumDiamondShovel = new InfiToolShovel(PHInfiTools.diamondShovelID + 21, InfiMaterialEnum.Diamond, InfiMaterialEnum.Uranium, "uraniumDiamondShovel");

			MinecraftForge.setToolClass(stoneDiamondShovel, "Shovel", InfiMaterialEnum.Diamond.getHarvestLevel());
			MinecraftForge.setToolClass(ironDiamondShovel, "Shovel", InfiMaterialEnum.Diamond.getHarvestLevel());
			MinecraftForge.setToolClass(diamondDiamondShovel, "Shovel", InfiMaterialEnum.Diamond.getHarvestLevel());
			MinecraftForge.setToolClass(redstoneDiamondShovel, "Shovel", InfiMaterialEnum.Diamond.getHarvestLevel());
			MinecraftForge.setToolClass(obsidianDiamondShovel, "Shovel", InfiMaterialEnum.Diamond.getHarvestLevel());
			MinecraftForge.setToolClass(boneDiamondShovel, "Shovel", InfiMaterialEnum.Diamond.getHarvestLevel());
			MinecraftForge.setToolClass(mossyDiamondShovel, "Shovel", InfiMaterialEnum.Diamond.getHarvestLevel());
			MinecraftForge.setToolClass(netherrackDiamondShovel, "Shovel", InfiMaterialEnum.Diamond.getHarvestLevel());
			MinecraftForge.setToolClass(glowstoneDiamondShovel, "Shovel", InfiMaterialEnum.Diamond.getHarvestLevel());
			MinecraftForge.setToolClass(lavaDiamondShovel, "Shovel", InfiMaterialEnum.Diamond.getHarvestLevel());
			MinecraftForge.setToolClass(cactusDiamondShovel, "Shovel", InfiMaterialEnum.Diamond.getHarvestLevel());
			MinecraftForge.setToolClass(flintDiamondShovel, "Shovel", InfiMaterialEnum.Diamond.getHarvestLevel());
			MinecraftForge.setToolClass(blazeDiamondShovel, "Shovel", InfiMaterialEnum.Diamond.getHarvestLevel());
			MinecraftForge.setToolClass(copperDiamondShovel, "Shovel", InfiMaterialEnum.Diamond.getHarvestLevel());
			MinecraftForge.setToolClass(bronzeDiamondShovel, "Shovel", InfiMaterialEnum.Diamond.getHarvestLevel());
			MinecraftForge.setToolClass(workedDiamondShovel, "Shovel", InfiMaterialEnum.Diamond.getHarvestLevel());
			MinecraftForge.setToolClass(steelDiamondShovel, "Shovel", InfiMaterialEnum.Diamond.getHarvestLevel());
			MinecraftForge.setToolClass(cobaltDiamondShovel, "Shovel", InfiMaterialEnum.Diamond.getHarvestLevel());
			MinecraftForge.setToolClass(arditeDiamondShovel, "Shovel", InfiMaterialEnum.Diamond.getHarvestLevel());
			MinecraftForge.setToolClass(manyullynDiamondShovel, "Shovel", InfiMaterialEnum.Diamond.getHarvestLevel());
			MinecraftForge.setToolClass(uraniumDiamondShovel, "Shovel", InfiMaterialEnum.Diamond.getHarvestLevel());
		}

		if (PHInfiTools.enableRedstoneTools)
		{
			woodRedstoneShovel = new InfiToolShovel(PHInfiTools.redstoneShovelID + 0, InfiMaterialEnum.Redstone, InfiMaterialEnum.Wood, "woodRedstoneShovel");
			stoneRedstoneShovel = new InfiToolShovel(PHInfiTools.redstoneShovelID + 1, InfiMaterialEnum.Redstone, InfiMaterialEnum.Stone, "stoneRedstoneShovel");
			ironRedstoneShovel = new InfiToolShovel(PHInfiTools.redstoneShovelID + 2, InfiMaterialEnum.Redstone, InfiMaterialEnum.Iron, "ironRedstoneShovel");
			redstoneRedstoneShovel = new InfiToolShovel(PHInfiTools.redstoneShovelID + 3, InfiMaterialEnum.Redstone, InfiMaterialEnum.Redstone, "redstoneRedstoneShovel");
			obsidianRedstoneShovel = new InfiToolShovel(PHInfiTools.redstoneShovelID + 4, InfiMaterialEnum.Redstone, InfiMaterialEnum.Obsidian, "obsidianRedstoneShovel");
			sandstoneRedstoneShovel = new InfiToolShovel(PHInfiTools.redstoneShovelID + 5, InfiMaterialEnum.Redstone, InfiMaterialEnum.Sandstone, "sandstoneRedstoneShovel");
			boneRedstoneShovel = new InfiToolShovel(PHInfiTools.redstoneShovelID + 6, InfiMaterialEnum.Redstone, InfiMaterialEnum.Bone, "boneRedstoneShovel");
			paperRedstoneShovel = new InfiToolShovel(PHInfiTools.redstoneShovelID + 7, InfiMaterialEnum.Redstone, InfiMaterialEnum.Paper, "paperRedstoneShovel");
			mossyRedstoneShovel = new InfiToolShovel(PHInfiTools.redstoneShovelID + 8, InfiMaterialEnum.Redstone, InfiMaterialEnum.Mossy, "mossyRedstoneShovel");
			netherrackRedstoneShovel = new InfiToolShovel(PHInfiTools.redstoneShovelID + 9, InfiMaterialEnum.Redstone, InfiMaterialEnum.Netherrack, "netherrackRedstoneShovel");
			glowstoneRedstoneShovel = new InfiToolShovel(PHInfiTools.redstoneShovelID + 10, InfiMaterialEnum.Redstone, InfiMaterialEnum.Glowstone, "glowstoneRedstoneShovel");
			iceRedstoneShovel = new InfiToolShovel(PHInfiTools.redstoneShovelID + 11, InfiMaterialEnum.Redstone, InfiMaterialEnum.Ice, "iceRedstoneShovel");
			lavaRedstoneShovel = new InfiToolShovel(PHInfiTools.redstoneShovelID + 12, InfiMaterialEnum.Redstone, InfiMaterialEnum.Lava, "lavaRedstoneShovel");
			slimeRedstoneShovel = new InfiToolShovel(PHInfiTools.redstoneShovelID + 13, InfiMaterialEnum.Redstone, InfiMaterialEnum.Slime, "slimeRedstoneShovel");
			cactusRedstoneShovel = new InfiToolShovel(PHInfiTools.redstoneShovelID + 14, InfiMaterialEnum.Redstone, InfiMaterialEnum.Cactus, "cactusRedstoneShovel");
			flintRedstoneShovel = new InfiToolShovel(PHInfiTools.redstoneShovelID + 15, InfiMaterialEnum.Redstone, InfiMaterialEnum.Flint, "flintRedstoneShovel");
			copperRedstoneShovel = new InfiToolShovel(PHInfiTools.redstoneShovelID + 16, InfiMaterialEnum.Redstone, InfiMaterialEnum.Copper, "copperRedstoneShovel");
			bronzeRedstoneShovel = new InfiToolShovel(PHInfiTools.redstoneShovelID + 17, InfiMaterialEnum.Redstone, InfiMaterialEnum.Bronze, "bronzeRedstoneShovel");
			workedRedstoneShovel = new InfiToolShovel(PHInfiTools.redstoneShovelID + 18, InfiMaterialEnum.Redstone, InfiMaterialEnum.WorkedIron, "workedRedstoneShovel");
			uraniumRedstoneShovel = new InfiToolShovel(PHInfiTools.redstoneShovelID + 19, InfiMaterialEnum.Redstone, InfiMaterialEnum.Uranium, "uraniumRedstoneShovel");

			MinecraftForge.setToolClass(woodRedstoneShovel, "Shovel", InfiMaterialEnum.Redstone.getHarvestLevel());
			MinecraftForge.setToolClass(stoneRedstoneShovel, "Shovel", InfiMaterialEnum.Redstone.getHarvestLevel());
			MinecraftForge.setToolClass(ironRedstoneShovel, "Shovel", InfiMaterialEnum.Redstone.getHarvestLevel());
			MinecraftForge.setToolClass(redstoneRedstoneShovel, "Shovel", InfiMaterialEnum.Redstone.getHarvestLevel());
			MinecraftForge.setToolClass(obsidianRedstoneShovel, "Shovel", InfiMaterialEnum.Redstone.getHarvestLevel());
			MinecraftForge.setToolClass(sandstoneRedstoneShovel, "Shovel", InfiMaterialEnum.Redstone.getHarvestLevel());
			MinecraftForge.setToolClass(boneRedstoneShovel, "Shovel", InfiMaterialEnum.Redstone.getHarvestLevel());
			MinecraftForge.setToolClass(paperRedstoneShovel, "Shovel", InfiMaterialEnum.Redstone.getHarvestLevel());
			MinecraftForge.setToolClass(mossyRedstoneShovel, "Shovel", InfiMaterialEnum.Redstone.getHarvestLevel());
			MinecraftForge.setToolClass(netherrackRedstoneShovel, "Shovel", InfiMaterialEnum.Redstone.getHarvestLevel());
			MinecraftForge.setToolClass(glowstoneRedstoneShovel, "Shovel", InfiMaterialEnum.Redstone.getHarvestLevel());
			MinecraftForge.setToolClass(iceRedstoneShovel, "Shovel", InfiMaterialEnum.Redstone.getHarvestLevel());
			MinecraftForge.setToolClass(lavaRedstoneShovel, "Shovel", InfiMaterialEnum.Redstone.getHarvestLevel());
			MinecraftForge.setToolClass(slimeRedstoneShovel, "Shovel", InfiMaterialEnum.Redstone.getHarvestLevel());
			MinecraftForge.setToolClass(cactusRedstoneShovel, "Shovel", InfiMaterialEnum.Redstone.getHarvestLevel());
			MinecraftForge.setToolClass(flintRedstoneShovel, "Shovel", InfiMaterialEnum.Redstone.getHarvestLevel());
			MinecraftForge.setToolClass(copperRedstoneShovel, "Shovel", InfiMaterialEnum.Redstone.getHarvestLevel());
			MinecraftForge.setToolClass(bronzeRedstoneShovel, "Shovel", InfiMaterialEnum.Redstone.getHarvestLevel());
			MinecraftForge.setToolClass(workedRedstoneShovel, "Shovel", InfiMaterialEnum.Redstone.getHarvestLevel());
			MinecraftForge.setToolClass(uraniumRedstoneShovel, "Shovel", InfiMaterialEnum.Redstone.getHarvestLevel());
		}

		if (PHInfiTools.enableObsidianTools)
		{
			woodObsidianShovel = new InfiToolShovel(PHInfiTools.obsidianShovelID + 0, InfiMaterialEnum.Obsidian, InfiMaterialEnum.Wood, "woodObsidianShovel");
			stoneObsidianShovel = new InfiToolShovel(PHInfiTools.obsidianShovelID + 1, InfiMaterialEnum.Obsidian, InfiMaterialEnum.Stone, "stoneObsidianShovel");
			redstoneObsidianShovel = new InfiToolShovel(PHInfiTools.obsidianShovelID + 2, InfiMaterialEnum.Obsidian, InfiMaterialEnum.Redstone, "redstoneObsidianShovel");
			obsidianObsidianShovel = new InfiToolShovel(PHInfiTools.obsidianShovelID + 3, InfiMaterialEnum.Obsidian, InfiMaterialEnum.Obsidian, "obsidianObsidianShovel");
			;
			boneObsidianShovel = new InfiToolShovel(PHInfiTools.obsidianShovelID + 4, InfiMaterialEnum.Obsidian, InfiMaterialEnum.Bone, "boneObsidianShovel");
			netherrackObsidianShovel = new InfiToolShovel(PHInfiTools.obsidianShovelID + 5, InfiMaterialEnum.Obsidian, InfiMaterialEnum.Netherrack, "netherrackObsidianShovel");
			glowstoneObsidianShovel = new InfiToolShovel(PHInfiTools.obsidianShovelID + 6, InfiMaterialEnum.Obsidian, InfiMaterialEnum.Glowstone, "glowstoneObsidianShovel");
			iceObsidianShovel = new InfiToolShovel(PHInfiTools.obsidianShovelID + 7, InfiMaterialEnum.Obsidian, InfiMaterialEnum.Ice, "iceObsidianShovel");
			lavaObsidianShovel = new InfiToolShovel(PHInfiTools.obsidianShovelID + 8, InfiMaterialEnum.Obsidian, InfiMaterialEnum.Lava, "lavaObsidianShovel");
			cactusObsidianShovel = new InfiToolShovel(PHInfiTools.obsidianShovelID + 9, InfiMaterialEnum.Obsidian, InfiMaterialEnum.Cactus, "cactusObsidianShovel");

			MinecraftForge.setToolClass(woodObsidianShovel, "Shovel", InfiMaterialEnum.Obsidian.getHarvestLevel());
			MinecraftForge.setToolClass(stoneObsidianShovel, "Shovel", InfiMaterialEnum.Obsidian.getHarvestLevel());
			MinecraftForge.setToolClass(redstoneObsidianShovel, "Shovel", InfiMaterialEnum.Obsidian.getHarvestLevel());
			MinecraftForge.setToolClass(obsidianObsidianShovel, "Shovel", InfiMaterialEnum.Obsidian.getHarvestLevel());
			MinecraftForge.setToolClass(boneObsidianShovel, "Shovel", InfiMaterialEnum.Obsidian.getHarvestLevel());
			MinecraftForge.setToolClass(netherrackObsidianShovel, "Shovel", InfiMaterialEnum.Obsidian.getHarvestLevel());
			MinecraftForge.setToolClass(glowstoneObsidianShovel, "Shovel", InfiMaterialEnum.Obsidian.getHarvestLevel());
			MinecraftForge.setToolClass(iceObsidianShovel, "Shovel", InfiMaterialEnum.Obsidian.getHarvestLevel());
			MinecraftForge.setToolClass(lavaObsidianShovel, "Shovel", InfiMaterialEnum.Obsidian.getHarvestLevel());
			MinecraftForge.setToolClass(cactusObsidianShovel, "Shovel", InfiMaterialEnum.Obsidian.getHarvestLevel());
		}

		if (PHInfiTools.enableSandstoneTools)
		{
			woodSandstoneShovel = new InfiToolShovel(PHInfiTools.sandstoneShovelID + 0, InfiMaterialEnum.Sandstone, InfiMaterialEnum.Wood, "woodSandstoneShovel");
			sandstoneSandstoneShovel = new InfiToolShovel(PHInfiTools.sandstoneShovelID + 1, InfiMaterialEnum.Sandstone, InfiMaterialEnum.Sandstone, "sandstoneSandstoneShovel");
			boneSandstoneShovel = new InfiToolShovel(PHInfiTools.sandstoneShovelID + 2, InfiMaterialEnum.Sandstone, InfiMaterialEnum.Bone, "boneSandstoneShovel");
			netherrackSandstoneShovel = new InfiToolShovel(PHInfiTools.sandstoneShovelID + 3, InfiMaterialEnum.Sandstone, InfiMaterialEnum.Netherrack, "netherrackSandstoneShovel");
			iceSandstoneShovel = new InfiToolShovel(PHInfiTools.sandstoneShovelID + 4, InfiMaterialEnum.Sandstone, InfiMaterialEnum.Ice, "iceSandstoneShovel");
			slimeSandstoneShovel = new InfiToolShovel(PHInfiTools.sandstoneShovelID + 5, InfiMaterialEnum.Sandstone, InfiMaterialEnum.Slime, "slimeSandstoneShovel");
			cactusSandstoneShovel = new InfiToolShovel(PHInfiTools.sandstoneShovelID + 6, InfiMaterialEnum.Sandstone, InfiMaterialEnum.Cactus, "cactusSandstoneShovel");
			flintSandstoneShovel = new InfiToolShovel(PHInfiTools.sandstoneShovelID + 7, InfiMaterialEnum.Sandstone, InfiMaterialEnum.Flint, "flintSandstoneShovel");

			MinecraftForge.setToolClass(woodSandstoneShovel, "Shovel", InfiMaterialEnum.Sandstone.getHarvestLevel());
			MinecraftForge.setToolClass(sandstoneSandstoneShovel, "Shovel", InfiMaterialEnum.Sandstone.getHarvestLevel());
			MinecraftForge.setToolClass(boneSandstoneShovel, "Shovel", InfiMaterialEnum.Sandstone.getHarvestLevel());
			MinecraftForge.setToolClass(netherrackSandstoneShovel, "Shovel", InfiMaterialEnum.Sandstone.getHarvestLevel());
			MinecraftForge.setToolClass(iceSandstoneShovel, "Shovel", InfiMaterialEnum.Sandstone.getHarvestLevel());
			MinecraftForge.setToolClass(slimeSandstoneShovel, "Shovel", InfiMaterialEnum.Sandstone.getHarvestLevel());
			MinecraftForge.setToolClass(cactusSandstoneShovel, "Shovel", InfiMaterialEnum.Sandstone.getHarvestLevel());
			MinecraftForge.setToolClass(flintSandstoneShovel, "Shovel", InfiMaterialEnum.Sandstone.getHarvestLevel());
		}

		if (PHInfiTools.enableBoneTools)
		{
			woodBoneShovel = new InfiToolShovel(PHInfiTools.boneShovelID + 0, InfiMaterialEnum.Bone, InfiMaterialEnum.Wood, "woodBoneShovel");
			stoneBoneShovel = new InfiToolShovel(PHInfiTools.boneShovelID + 1, InfiMaterialEnum.Bone, InfiMaterialEnum.Stone, "stoneBoneShovel");
			sandstoneBoneShovel = new InfiToolShovel(PHInfiTools.boneShovelID + 2, InfiMaterialEnum.Bone, InfiMaterialEnum.Sandstone, "sandstoneBoneShovel");
			boneBoneShovel = new InfiToolShovel(PHInfiTools.boneShovelID + 3, InfiMaterialEnum.Bone, InfiMaterialEnum.Bone, "boneBoneShovel");
			paperBoneShovel = new InfiToolShovel(PHInfiTools.boneShovelID + 4, InfiMaterialEnum.Bone, InfiMaterialEnum.Paper, "paperBoneShovel");
			netherrackBoneShovel = new InfiToolShovel(PHInfiTools.boneShovelID + 5, InfiMaterialEnum.Bone, InfiMaterialEnum.Netherrack, "netherrackBoneShovel");
			iceBoneShovel = new InfiToolShovel(PHInfiTools.boneShovelID + 6, InfiMaterialEnum.Bone, InfiMaterialEnum.Ice, "iceBoneShovel");
			cactusBoneShovel = new InfiToolShovel(PHInfiTools.boneShovelID + 7, InfiMaterialEnum.Bone, InfiMaterialEnum.Cactus, "cactusBoneShovel");
			flintBoneShovel = new InfiToolShovel(PHInfiTools.boneShovelID + 8, InfiMaterialEnum.Bone, InfiMaterialEnum.Flint, "flintBoneShovel");

			MinecraftForge.setToolClass(woodBoneShovel, "Shovel", InfiMaterialEnum.Bone.getHarvestLevel());
			MinecraftForge.setToolClass(stoneBoneShovel, "Shovel", InfiMaterialEnum.Bone.getHarvestLevel());
			MinecraftForge.setToolClass(sandstoneBoneShovel, "Shovel", InfiMaterialEnum.Bone.getHarvestLevel());
			MinecraftForge.setToolClass(boneBoneShovel, "Shovel", InfiMaterialEnum.Bone.getHarvestLevel());
			MinecraftForge.setToolClass(paperBoneShovel, "Shovel", InfiMaterialEnum.Bone.getHarvestLevel());
			MinecraftForge.setToolClass(netherrackBoneShovel, "Shovel", InfiMaterialEnum.Bone.getHarvestLevel());
			MinecraftForge.setToolClass(iceBoneShovel, "Shovel", InfiMaterialEnum.Bone.getHarvestLevel());
			MinecraftForge.setToolClass(cactusBoneShovel, "Shovel", InfiMaterialEnum.Bone.getHarvestLevel());
			MinecraftForge.setToolClass(flintBoneShovel, "Shovel", InfiMaterialEnum.Bone.getHarvestLevel());
		}

		if (PHInfiTools.enablePaperTools)
		{
			woodPaperShovel = new InfiToolShovel(PHInfiTools.paperShovelID + 0, InfiMaterialEnum.Paper, InfiMaterialEnum.Wood, "woodPaperShovel");
			bonePaperShovel = new InfiToolShovel(PHInfiTools.paperShovelID + 1, InfiMaterialEnum.Paper, InfiMaterialEnum.Bone, "bonePaperShovel");
			paperPaperShovel = new InfiToolShovel(PHInfiTools.paperShovelID + 2, InfiMaterialEnum.Paper, InfiMaterialEnum.Paper, "paperPaperShovel");
			slimePaperShovel = new InfiToolShovel(PHInfiTools.paperShovelID + 3, InfiMaterialEnum.Paper, InfiMaterialEnum.Slime, "slimePaperShovel");
			cactusPaperShovel = new InfiToolShovel(PHInfiTools.paperShovelID + 4, InfiMaterialEnum.Paper, InfiMaterialEnum.Cactus, "cactusPaperShovel");

			MinecraftForge.setToolClass(woodPaperShovel, "Shovel", InfiMaterialEnum.Paper.getHarvestLevel());
			MinecraftForge.setToolClass(bonePaperShovel, "Shovel", InfiMaterialEnum.Paper.getHarvestLevel());
			MinecraftForge.setToolClass(paperPaperShovel, "Shovel", InfiMaterialEnum.Paper.getHarvestLevel());
			MinecraftForge.setToolClass(slimePaperShovel, "Shovel", InfiMaterialEnum.Paper.getHarvestLevel());
			MinecraftForge.setToolClass(cactusPaperShovel, "Shovel", InfiMaterialEnum.Paper.getHarvestLevel());
		}

		if (PHInfiTools.enableMossyTools)
		{
			woodMossyShovel = new InfiToolShovel(PHInfiTools.mossyShovelID + 0, InfiMaterialEnum.Mossy, InfiMaterialEnum.Wood, "woodMossyShovel");
			stoneMossyShovel = new InfiToolShovel(PHInfiTools.mossyShovelID + 1, InfiMaterialEnum.Mossy, InfiMaterialEnum.Stone, "stoneMossyShovel");
			diamondMossyShovel = new InfiToolShovel(PHInfiTools.mossyShovelID + 2, InfiMaterialEnum.Mossy, InfiMaterialEnum.Diamond, "diamondMossyShovel");
			redstoneMossyShovel = new InfiToolShovel(PHInfiTools.mossyShovelID + 3, InfiMaterialEnum.Mossy, InfiMaterialEnum.Redstone, "redstoneMossyShovel");
			boneMossyShovel = new InfiToolShovel(PHInfiTools.mossyShovelID + 4, InfiMaterialEnum.Mossy, InfiMaterialEnum.Bone, "boneMossyShovel");
			mossyMossyShovel = new InfiToolShovel(PHInfiTools.mossyShovelID + 5, InfiMaterialEnum.Mossy, InfiMaterialEnum.Mossy, "mossyMossyShovel");
			netherrackMossyShovel = new InfiToolShovel(PHInfiTools.mossyShovelID + 6, InfiMaterialEnum.Mossy, InfiMaterialEnum.Netherrack, "netherrackMossyShovel");
			glowstoneMossyShovel = new InfiToolShovel(PHInfiTools.mossyShovelID + 7, InfiMaterialEnum.Mossy, InfiMaterialEnum.Glowstone, "glowstoneMossyShovel");
			cactusMossyShovel = new InfiToolShovel(PHInfiTools.mossyShovelID + 8, InfiMaterialEnum.Mossy, InfiMaterialEnum.Cactus, "cactusMossyShovel");
			blazeMossyShovel = new InfiToolShovel(PHInfiTools.mossyShovelID + 9, InfiMaterialEnum.Mossy, InfiMaterialEnum.Blaze, "blazeMossyShovel");
			manyullynMossyShovel = new InfiToolShovel(PHInfiTools.mossyShovelID + 10, InfiMaterialEnum.Mossy, InfiMaterialEnum.Manyullyn, "manyullynMossyShovel");
			uraniumMossyShovel = new InfiToolShovel(PHInfiTools.mossyShovelID + 11, InfiMaterialEnum.Mossy, InfiMaterialEnum.Uranium, "uraniumMossyShovel");

			MinecraftForge.setToolClass(woodMossyShovel, "Shovel", InfiMaterialEnum.Mossy.getHarvestLevel());
			MinecraftForge.setToolClass(stoneMossyShovel, "Shovel", InfiMaterialEnum.Mossy.getHarvestLevel());
			MinecraftForge.setToolClass(diamondMossyShovel, "Shovel", InfiMaterialEnum.Mossy.getHarvestLevel());
			MinecraftForge.setToolClass(redstoneMossyShovel, "Shovel", InfiMaterialEnum.Mossy.getHarvestLevel());
			MinecraftForge.setToolClass(boneMossyShovel, "Shovel", InfiMaterialEnum.Mossy.getHarvestLevel());
			MinecraftForge.setToolClass(mossyMossyShovel, "Shovel", InfiMaterialEnum.Mossy.getHarvestLevel());
			MinecraftForge.setToolClass(netherrackMossyShovel, "Shovel", InfiMaterialEnum.Mossy.getHarvestLevel());
			MinecraftForge.setToolClass(glowstoneMossyShovel, "Shovel", InfiMaterialEnum.Mossy.getHarvestLevel());
			MinecraftForge.setToolClass(cactusMossyShovel, "Shovel", InfiMaterialEnum.Mossy.getHarvestLevel());
			MinecraftForge.setToolClass(blazeMossyShovel, "Shovel", InfiMaterialEnum.Mossy.getHarvestLevel());
			MinecraftForge.setToolClass(manyullynMossyShovel, "Shovel", InfiMaterialEnum.Mossy.getHarvestLevel());
			MinecraftForge.setToolClass(uraniumMossyShovel, "Shovel", InfiMaterialEnum.Mossy.getHarvestLevel());
		}

		if (PHInfiTools.enableNetherrackTools)
		{
			woodNetherrackShovel = new InfiToolShovel(PHInfiTools.netherrackShovelID + 0, InfiMaterialEnum.Netherrack, InfiMaterialEnum.Wood, "woodNetherrackShovel");
			stoneNetherrackShovel = new InfiToolShovel(PHInfiTools.netherrackShovelID + 1, InfiMaterialEnum.Netherrack, InfiMaterialEnum.Stone, "stoneNetherrackShovel");
			sandstoneNetherrackShovel = new InfiToolShovel(PHInfiTools.netherrackShovelID + 2, InfiMaterialEnum.Netherrack, InfiMaterialEnum.Sandstone, "sandstoneNetherrackShovel");
			boneNetherrackShovel = new InfiToolShovel(PHInfiTools.netherrackShovelID + 3, InfiMaterialEnum.Netherrack, InfiMaterialEnum.Bone, "boneNetherrackShovel");
			paperNetherrackShovel = new InfiToolShovel(PHInfiTools.netherrackShovelID + 4, InfiMaterialEnum.Netherrack, InfiMaterialEnum.Paper, "paperNetherrackShovel");
			mossyNetherrackShovel = new InfiToolShovel(PHInfiTools.netherrackShovelID + 5, InfiMaterialEnum.Netherrack, InfiMaterialEnum.Mossy, "mossyNetherrackShovel");
			netherrackNetherrackShovel = new InfiToolShovel(PHInfiTools.netherrackShovelID + 6, InfiMaterialEnum.Netherrack, InfiMaterialEnum.Netherrack, "netherrackNetherrackShovel");
			iceNetherrackShovel = new InfiToolShovel(PHInfiTools.netherrackShovelID + 7, InfiMaterialEnum.Netherrack, InfiMaterialEnum.Ice, "iceNetherrackShovel");
			slimeNetherrackShovel = new InfiToolShovel(PHInfiTools.netherrackShovelID + 8, InfiMaterialEnum.Netherrack, InfiMaterialEnum.Slime, "slimeNetherrackShovel");
			cactusNetherrackShovel = new InfiToolShovel(PHInfiTools.netherrackShovelID + 9, InfiMaterialEnum.Netherrack, InfiMaterialEnum.Cactus, "cactusNetherrackShovel");
			flintNetherrackShovel = new InfiToolShovel(PHInfiTools.netherrackShovelID + 10, InfiMaterialEnum.Netherrack, InfiMaterialEnum.Flint, "flintNetherrackShovel");
			copperNetherrackShovel = new InfiToolShovel(PHInfiTools.netherrackShovelID + 11, InfiMaterialEnum.Netherrack, InfiMaterialEnum.Copper, "copperNetherrackShovel");
			bronzeNetherrackShovel = new InfiToolShovel(PHInfiTools.netherrackShovelID + 12, InfiMaterialEnum.Netherrack, InfiMaterialEnum.Bronze, "bronzeNetherrackShovel");

			MinecraftForge.setToolClass(woodNetherrackShovel, "Shovel", InfiMaterialEnum.Netherrack.getHarvestLevel());
			MinecraftForge.setToolClass(stoneNetherrackShovel, "Shovel", InfiMaterialEnum.Netherrack.getHarvestLevel());
			MinecraftForge.setToolClass(sandstoneNetherrackShovel, "Shovel", InfiMaterialEnum.Netherrack.getHarvestLevel());
			MinecraftForge.setToolClass(boneNetherrackShovel, "Shovel", InfiMaterialEnum.Netherrack.getHarvestLevel());
			MinecraftForge.setToolClass(paperNetherrackShovel, "Shovel", InfiMaterialEnum.Netherrack.getHarvestLevel());
			MinecraftForge.setToolClass(mossyNetherrackShovel, "Shovel", InfiMaterialEnum.Netherrack.getHarvestLevel());
			MinecraftForge.setToolClass(netherrackNetherrackShovel, "Shovel", InfiMaterialEnum.Netherrack.getHarvestLevel());
			MinecraftForge.setToolClass(iceNetherrackShovel, "Shovel", InfiMaterialEnum.Netherrack.getHarvestLevel());
			MinecraftForge.setToolClass(slimeNetherrackShovel, "Shovel", InfiMaterialEnum.Netherrack.getHarvestLevel());
			MinecraftForge.setToolClass(cactusNetherrackShovel, "Shovel", InfiMaterialEnum.Netherrack.getHarvestLevel());
			MinecraftForge.setToolClass(flintNetherrackShovel, "Shovel", InfiMaterialEnum.Netherrack.getHarvestLevel());
			MinecraftForge.setToolClass(copperNetherrackShovel, "Shovel", InfiMaterialEnum.Netherrack.getHarvestLevel());
			MinecraftForge.setToolClass(bronzeNetherrackShovel, "Shovel", InfiMaterialEnum.Netherrack.getHarvestLevel());
		}

		if (PHInfiTools.enableGlowstoneTools)
		{
			woodGlowstoneShovel = new InfiToolShovel(PHInfiTools.glowstoneShovelID + 0, InfiMaterialEnum.Glowstone, InfiMaterialEnum.Wood, "woodGlowstoneShovel");
			redstoneGlowstoneShovel = new InfiToolShovel(PHInfiTools.glowstoneShovelID + 1, InfiMaterialEnum.Glowstone, InfiMaterialEnum.Redstone, "redstoneGlowstoneShovel");
			obsidianGlowstoneShovel = new InfiToolShovel(PHInfiTools.glowstoneShovelID + 2, InfiMaterialEnum.Glowstone, InfiMaterialEnum.Obsidian, "obsidianGlowstoneShovel");
			boneGlowstoneShovel = new InfiToolShovel(PHInfiTools.glowstoneShovelID + 3, InfiMaterialEnum.Glowstone, InfiMaterialEnum.Bone, "boneGlowstoneShovel");
			netherrackGlowstoneShovel = new InfiToolShovel(PHInfiTools.glowstoneShovelID + 4, InfiMaterialEnum.Glowstone, InfiMaterialEnum.Netherrack, "netherrackGlowstoneShovel");
			glowstoneGlowstoneShovel = new InfiToolShovel(PHInfiTools.glowstoneShovelID + 5, InfiMaterialEnum.Glowstone, InfiMaterialEnum.Glowstone, "glowstoneGlowstoneShovel");
			iceGlowstoneShovel = new InfiToolShovel(PHInfiTools.glowstoneShovelID + 6, InfiMaterialEnum.Glowstone, InfiMaterialEnum.Ice, "iceGlowstoneShovel");
			slimeGlowstoneShovel = new InfiToolShovel(PHInfiTools.glowstoneShovelID + 7, InfiMaterialEnum.Glowstone, InfiMaterialEnum.Slime, "slimeGlowstoneShovel");
			cactusGlowstoneShovel = new InfiToolShovel(PHInfiTools.glowstoneShovelID + 8, InfiMaterialEnum.Glowstone, InfiMaterialEnum.Cactus, "cactusGlowstoneShovel");

			MinecraftForge.setToolClass(woodGlowstoneShovel, "Shovel", InfiMaterialEnum.Glowstone.getHarvestLevel());
			MinecraftForge.setToolClass(redstoneGlowstoneShovel, "Shovel", InfiMaterialEnum.Glowstone.getHarvestLevel());
			MinecraftForge.setToolClass(obsidianGlowstoneShovel, "Shovel", InfiMaterialEnum.Glowstone.getHarvestLevel());
			MinecraftForge.setToolClass(boneGlowstoneShovel, "Shovel", InfiMaterialEnum.Glowstone.getHarvestLevel());
			MinecraftForge.setToolClass(netherrackGlowstoneShovel, "Shovel", InfiMaterialEnum.Glowstone.getHarvestLevel());
			MinecraftForge.setToolClass(glowstoneGlowstoneShovel, "Shovel", InfiMaterialEnum.Glowstone.getHarvestLevel());
			MinecraftForge.setToolClass(iceGlowstoneShovel, "Shovel", InfiMaterialEnum.Glowstone.getHarvestLevel());
			MinecraftForge.setToolClass(slimeGlowstoneShovel, "Shovel", InfiMaterialEnum.Glowstone.getHarvestLevel());
			MinecraftForge.setToolClass(cactusGlowstoneShovel, "Shovel", InfiMaterialEnum.Glowstone.getHarvestLevel());
		}

		if (PHInfiTools.enableIceTools)
		{
			woodIceShovel = new InfiToolShovel(PHInfiTools.iceShovelID + 0, InfiMaterialEnum.Ice, InfiMaterialEnum.Wood, "woodIceShovel");
			boneIceShovel = new InfiToolShovel(PHInfiTools.iceShovelID + 1, InfiMaterialEnum.Ice, InfiMaterialEnum.Bone, "boneIceShovel");
			paperIceShovel = new InfiToolShovel(PHInfiTools.iceShovelID + 2, InfiMaterialEnum.Ice, InfiMaterialEnum.Paper, "paperIceShovel");
			iceIceShovel = new InfiToolShovel(PHInfiTools.iceShovelID + 3, InfiMaterialEnum.Ice, InfiMaterialEnum.Ice, "iceIceShovel");
			slimeIceShovel = new InfiToolShovel(PHInfiTools.iceShovelID + 4, InfiMaterialEnum.Ice, InfiMaterialEnum.Slime, "slimeIceShovel");
			cactusIceShovel = new InfiToolShovel(PHInfiTools.iceShovelID + 5, InfiMaterialEnum.Ice, InfiMaterialEnum.Cactus, "cactusIceShovel");

			MinecraftForge.setToolClass(woodIceShovel, "Shovel", InfiMaterialEnum.Ice.getHarvestLevel());
			MinecraftForge.setToolClass(boneIceShovel, "Shovel", InfiMaterialEnum.Ice.getHarvestLevel());
			MinecraftForge.setToolClass(paperIceShovel, "Shovel", InfiMaterialEnum.Ice.getHarvestLevel());
			MinecraftForge.setToolClass(iceIceShovel, "Shovel", InfiMaterialEnum.Ice.getHarvestLevel());
			MinecraftForge.setToolClass(slimeIceShovel, "Shovel", InfiMaterialEnum.Ice.getHarvestLevel());
			MinecraftForge.setToolClass(cactusIceShovel, "Shovel", InfiMaterialEnum.Ice.getHarvestLevel());
		}

		if (PHInfiTools.enableLavaTools)
		{
			diamondLavaShovel = new InfiToolShovel(PHInfiTools.lavaShovelID + 0, InfiMaterialEnum.Lava, InfiMaterialEnum.Diamond, "diamondLavaShovel");
			obsidianLavaShovel = new InfiToolShovel(PHInfiTools.lavaShovelID + 1, InfiMaterialEnum.Lava, InfiMaterialEnum.Obsidian, "obsidianLavaShovel");
			netherrackLavaShovel = new InfiToolShovel(PHInfiTools.lavaShovelID + 2, InfiMaterialEnum.Lava, InfiMaterialEnum.Netherrack, "netherrackLavaShovel");
			lavaLavaShovel = new InfiToolShovel(PHInfiTools.lavaShovelID + 3, InfiMaterialEnum.Lava, InfiMaterialEnum.Lava, "lavaLavaShovel");
			flintLavaShovel = new InfiToolShovel(PHInfiTools.lavaShovelID + 4, InfiMaterialEnum.Lava, InfiMaterialEnum.Flint, "flintLavaShovel");
			blazeLavaShovel = new InfiToolShovel(PHInfiTools.lavaShovelID + 5, InfiMaterialEnum.Lava, InfiMaterialEnum.Blaze, "blazeLavaShovel");
			manyullynLavaShovel = new InfiToolShovel(PHInfiTools.lavaShovelID + 6, InfiMaterialEnum.Lava, InfiMaterialEnum.Manyullyn, "manyullynLavaShovel");
			uraniumLavaShovel = new InfiToolShovel(PHInfiTools.lavaShovelID + 7, InfiMaterialEnum.Lava, InfiMaterialEnum.Uranium, "uraniumLavaShovel");

			MinecraftForge.setToolClass(diamondLavaShovel, "Shovel", InfiMaterialEnum.Lava.getHarvestLevel());
			MinecraftForge.setToolClass(obsidianLavaShovel, "Shovel", InfiMaterialEnum.Lava.getHarvestLevel());
			MinecraftForge.setToolClass(netherrackLavaShovel, "Shovel", InfiMaterialEnum.Lava.getHarvestLevel());
			MinecraftForge.setToolClass(lavaLavaShovel, "Shovel", InfiMaterialEnum.Lava.getHarvestLevel());
			MinecraftForge.setToolClass(flintLavaShovel, "Shovel", InfiMaterialEnum.Lava.getHarvestLevel());
			MinecraftForge.setToolClass(blazeLavaShovel, "Shovel", InfiMaterialEnum.Lava.getHarvestLevel());
			MinecraftForge.setToolClass(manyullynLavaShovel, "Shovel", InfiMaterialEnum.Lava.getHarvestLevel());
			MinecraftForge.setToolClass(uraniumLavaShovel, "Shovel", InfiMaterialEnum.Lava.getHarvestLevel());
		}

		if (PHInfiTools.enableSlimeTools)
		{
			woodSlimeShovel = new InfiToolShovel(PHInfiTools.slimeShovelID + 0, InfiMaterialEnum.Slime, InfiMaterialEnum.Wood, "woodSlimeShovel");
			sandstoneSlimeShovel = new InfiToolShovel(PHInfiTools.slimeShovelID + 1, InfiMaterialEnum.Slime, InfiMaterialEnum.Sandstone, "sandstoneSlimeShovel");
			boneSlimeShovel = new InfiToolShovel(PHInfiTools.slimeShovelID + 2, InfiMaterialEnum.Slime, InfiMaterialEnum.Bone, "boneSlimeShovel");
			paperSlimeShovel = new InfiToolShovel(PHInfiTools.slimeShovelID + 3, InfiMaterialEnum.Slime, InfiMaterialEnum.Paper, "paperSlimeShovel");
			slimeSlimeShovel = new InfiToolShovel(PHInfiTools.slimeShovelID + 4, InfiMaterialEnum.Slime, InfiMaterialEnum.Slime, "slimeSlimeShovel");
			cactusSlimeShovel = new InfiToolShovel(PHInfiTools.slimeShovelID + 5, InfiMaterialEnum.Slime, InfiMaterialEnum.Cactus, "cactusSlimeShovel");

			MinecraftForge.setToolClass(woodSlimeShovel, "Shovel", InfiMaterialEnum.Slime.getHarvestLevel());
			MinecraftForge.setToolClass(sandstoneSlimeShovel, "Shovel", InfiMaterialEnum.Slime.getHarvestLevel());
			MinecraftForge.setToolClass(boneSlimeShovel, "Shovel", InfiMaterialEnum.Slime.getHarvestLevel());
			MinecraftForge.setToolClass(paperSlimeShovel, "Shovel", InfiMaterialEnum.Slime.getHarvestLevel());
			MinecraftForge.setToolClass(slimeSlimeShovel, "Shovel", InfiMaterialEnum.Slime.getHarvestLevel());
			MinecraftForge.setToolClass(cactusSlimeShovel, "Shovel", InfiMaterialEnum.Slime.getHarvestLevel());
		}

		if (PHInfiTools.enableCactusTools)
		{
			woodCactusShovel = new InfiToolShovel(PHInfiTools.cactusShovelID + 0, InfiMaterialEnum.Cactus, InfiMaterialEnum.Wood, "woodCactusShovel");
			sandstoneCactusShovel = new InfiToolShovel(PHInfiTools.cactusShovelID + 1, InfiMaterialEnum.Cactus, InfiMaterialEnum.Sandstone, "sandstoneCactusShovel");
			boneCactusShovel = new InfiToolShovel(PHInfiTools.cactusShovelID + 2, InfiMaterialEnum.Cactus, InfiMaterialEnum.Bone, "boneCactusShovel");
			netherrackCactusShovel = new InfiToolShovel(PHInfiTools.cactusShovelID + 3, InfiMaterialEnum.Cactus, InfiMaterialEnum.Netherrack, "netherrackCactusShovel");
			iceCactusShovel = new InfiToolShovel(PHInfiTools.cactusShovelID + 4, InfiMaterialEnum.Cactus, InfiMaterialEnum.Ice, "iceCactusShovel");
			slimeCactusShovel = new InfiToolShovel(PHInfiTools.cactusShovelID + 5, InfiMaterialEnum.Cactus, InfiMaterialEnum.Slime, "slimeCactusShovel");
			cactusCactusShovel = new InfiToolShovel(PHInfiTools.cactusShovelID + 6, InfiMaterialEnum.Cactus, InfiMaterialEnum.Cactus, "cactusCactusShovel");

			MinecraftForge.setToolClass(woodCactusShovel, "Shovel", InfiMaterialEnum.Cactus.getHarvestLevel());
			MinecraftForge.setToolClass(sandstoneCactusShovel, "Shovel", InfiMaterialEnum.Cactus.getHarvestLevel());
			MinecraftForge.setToolClass(boneCactusShovel, "Shovel", InfiMaterialEnum.Cactus.getHarvestLevel());
			MinecraftForge.setToolClass(netherrackCactusShovel, "Shovel", InfiMaterialEnum.Cactus.getHarvestLevel());
			MinecraftForge.setToolClass(iceCactusShovel, "Shovel", InfiMaterialEnum.Cactus.getHarvestLevel());
			MinecraftForge.setToolClass(slimeCactusShovel, "Shovel", InfiMaterialEnum.Cactus.getHarvestLevel());
			MinecraftForge.setToolClass(cactusCactusShovel, "Shovel", InfiMaterialEnum.Cactus.getHarvestLevel());
		}

		if (PHInfiTools.enableFlintTools)
		{
			woodFlintShovel = new InfiToolShovel(PHInfiTools.flintShovelID + 0, InfiMaterialEnum.Flint, InfiMaterialEnum.Wood, "woodFlintShovel");
			stoneFlintShovel = new InfiToolShovel(PHInfiTools.flintShovelID + 1, InfiMaterialEnum.Flint, InfiMaterialEnum.Stone, "stoneFlintShovel");
			sandstoneFlintShovel = new InfiToolShovel(PHInfiTools.flintShovelID + 2, InfiMaterialEnum.Flint, InfiMaterialEnum.Sandstone, "sandstoneFlintShovel");
			boneFlintShovel = new InfiToolShovel(PHInfiTools.flintShovelID + 3, InfiMaterialEnum.Flint, InfiMaterialEnum.Bone, "boneFlintShovel");
			netherrackFlintShovel = new InfiToolShovel(PHInfiTools.flintShovelID + 4, InfiMaterialEnum.Flint, InfiMaterialEnum.Netherrack, "netherrackFlintShovel");
			slimeFlintShovel = new InfiToolShovel(PHInfiTools.flintShovelID + 5, InfiMaterialEnum.Flint, InfiMaterialEnum.Slime, "slimeFlintShovel");
			cactusFlintShovel = new InfiToolShovel(PHInfiTools.flintShovelID + 6, InfiMaterialEnum.Flint, InfiMaterialEnum.Cactus, "cactusFlintShovel");
			flintFlintShovel = new InfiToolShovel(PHInfiTools.flintShovelID + 7, InfiMaterialEnum.Flint, InfiMaterialEnum.Flint, "flintFlintShovel");
			copperFlintShovel = new InfiToolShovel(PHInfiTools.flintShovelID + 8, InfiMaterialEnum.Flint, InfiMaterialEnum.Copper, "copperFlintShovel");
			bronzeFlintShovel = new InfiToolShovel(PHInfiTools.flintShovelID + 9, InfiMaterialEnum.Flint, InfiMaterialEnum.Bronze, "bronzeFlintShovel");

			MinecraftForge.setToolClass(woodFlintShovel, "Shovel", InfiMaterialEnum.Flint.getHarvestLevel());
			MinecraftForge.setToolClass(stoneFlintShovel, "Shovel", InfiMaterialEnum.Flint.getHarvestLevel());
			MinecraftForge.setToolClass(sandstoneFlintShovel, "Shovel", InfiMaterialEnum.Flint.getHarvestLevel());
			MinecraftForge.setToolClass(boneFlintShovel, "Shovel", InfiMaterialEnum.Flint.getHarvestLevel());
			MinecraftForge.setToolClass(netherrackFlintShovel, "Shovel", InfiMaterialEnum.Flint.getHarvestLevel());
			MinecraftForge.setToolClass(slimeFlintShovel, "Shovel", InfiMaterialEnum.Flint.getHarvestLevel());
			MinecraftForge.setToolClass(cactusFlintShovel, "Shovel", InfiMaterialEnum.Flint.getHarvestLevel());
			MinecraftForge.setToolClass(flintFlintShovel, "Shovel", InfiMaterialEnum.Flint.getHarvestLevel());
			MinecraftForge.setToolClass(copperFlintShovel, "Shovel", InfiMaterialEnum.Flint.getHarvestLevel());
			MinecraftForge.setToolClass(bronzeFlintShovel, "Shovel", InfiMaterialEnum.Flint.getHarvestLevel());
		}

		if (PHInfiTools.enableBlazeTools)
		{
			diamondBlazeShovel = new InfiToolShovel(PHInfiTools.blazeShovelID + 0, InfiMaterialEnum.Blaze, InfiMaterialEnum.Diamond, "diamondBlazeShovel");
			obsidianBlazeShovel = new InfiToolShovel(PHInfiTools.blazeShovelID + 1, InfiMaterialEnum.Blaze, InfiMaterialEnum.Obsidian, "obsidianBlazeShovel");
			netherrackBlazeShovel = new InfiToolShovel(PHInfiTools.blazeShovelID + 2, InfiMaterialEnum.Blaze, InfiMaterialEnum.Netherrack, "netherrackBlazeShovel");
			lavaBlazeShovel = new InfiToolShovel(PHInfiTools.blazeShovelID + 3, InfiMaterialEnum.Blaze, InfiMaterialEnum.Lava, "lavaBlazeShovel");
			flintBlazeShovel = new InfiToolShovel(PHInfiTools.blazeShovelID + 4, InfiMaterialEnum.Blaze, InfiMaterialEnum.Flint, "flintBlazeShovel");
			blazeBlazeShovel = new InfiToolShovel(PHInfiTools.blazeShovelID + 5, InfiMaterialEnum.Blaze, InfiMaterialEnum.Blaze, "blazeBlazeShovel");
			manyullynBlazeShovel = new InfiToolShovel(PHInfiTools.blazeShovelID + 6, InfiMaterialEnum.Blaze, InfiMaterialEnum.Manyullyn, "manyullynBlazeShovel");
			uraniumBlazeShovel = new InfiToolShovel(PHInfiTools.blazeShovelID + 7, InfiMaterialEnum.Blaze, InfiMaterialEnum.Uranium, "uraniumBlazeShovel");

			MinecraftForge.setToolClass(diamondBlazeShovel, "Shovel", InfiMaterialEnum.Blaze.getHarvestLevel());
			MinecraftForge.setToolClass(obsidianBlazeShovel, "Shovel", InfiMaterialEnum.Blaze.getHarvestLevel());
			MinecraftForge.setToolClass(netherrackBlazeShovel, "Shovel", InfiMaterialEnum.Blaze.getHarvestLevel());
			MinecraftForge.setToolClass(blazeBlazeShovel, "Shovel", InfiMaterialEnum.Blaze.getHarvestLevel());
			MinecraftForge.setToolClass(flintBlazeShovel, "Shovel", InfiMaterialEnum.Blaze.getHarvestLevel());
			MinecraftForge.setToolClass(blazeBlazeShovel, "Shovel", InfiMaterialEnum.Blaze.getHarvestLevel());
			MinecraftForge.setToolClass(manyullynBlazeShovel, "Shovel", InfiMaterialEnum.Blaze.getHarvestLevel());
			MinecraftForge.setToolClass(uraniumBlazeShovel, "Shovel", InfiMaterialEnum.Blaze.getHarvestLevel());
		}

		if (PHInfiTools.enableCopperTools)
		{
			woodCopperShovel = new InfiToolShovel(PHInfiTools.copperShovelID + 0, InfiMaterialEnum.Copper, InfiMaterialEnum.Wood, "woodCopperShovel");
			stoneCopperShovel = new InfiToolShovel(PHInfiTools.copperShovelID + 1, InfiMaterialEnum.Copper, InfiMaterialEnum.Stone, "stoneCopperShovel");
			boneCopperShovel = new InfiToolShovel(PHInfiTools.copperShovelID + 2, InfiMaterialEnum.Copper, InfiMaterialEnum.Bone, "boneCopperShovel");
			netherrackCopperShovel = new InfiToolShovel(PHInfiTools.copperShovelID + 3, InfiMaterialEnum.Copper, InfiMaterialEnum.Netherrack, "netherrackCopperShovel");
			slimeCopperShovel = new InfiToolShovel(PHInfiTools.copperShovelID + 4, InfiMaterialEnum.Copper, InfiMaterialEnum.Slime, "slimeCopperShovel");
			cactusCopperShovel = new InfiToolShovel(PHInfiTools.copperShovelID + 5, InfiMaterialEnum.Copper, InfiMaterialEnum.Cactus, "cactusCopperShovel");
			flintCopperShovel = new InfiToolShovel(PHInfiTools.copperShovelID + 6, InfiMaterialEnum.Copper, InfiMaterialEnum.Flint, "flintCopperShovel");
			copperCopperShovel = new InfiToolShovel(PHInfiTools.copperShovelID + 7, InfiMaterialEnum.Copper, InfiMaterialEnum.Copper, "copperCopperShovel");

			MinecraftForge.setToolClass(woodCopperShovel, "Shovel", InfiMaterialEnum.Copper.getHarvestLevel());
			MinecraftForge.setToolClass(stoneCopperShovel, "Shovel", InfiMaterialEnum.Copper.getHarvestLevel());
			MinecraftForge.setToolClass(boneCopperShovel, "Shovel", InfiMaterialEnum.Copper.getHarvestLevel());
			MinecraftForge.setToolClass(netherrackCopperShovel, "Shovel", InfiMaterialEnum.Copper.getHarvestLevel());
			MinecraftForge.setToolClass(slimeCopperShovel, "Shovel", InfiMaterialEnum.Copper.getHarvestLevel());
			MinecraftForge.setToolClass(cactusCopperShovel, "Shovel", InfiMaterialEnum.Copper.getHarvestLevel());
			MinecraftForge.setToolClass(flintCopperShovel, "Shovel", InfiMaterialEnum.Copper.getHarvestLevel());
			MinecraftForge.setToolClass(copperCopperShovel, "Shovel", InfiMaterialEnum.Copper.getHarvestLevel());
		}

		if (PHInfiTools.enableBronzeTools)
		{
			woodBronzeShovel = new InfiToolShovel(PHInfiTools.bronzeShovelID + 0, InfiMaterialEnum.Bronze, InfiMaterialEnum.Wood, "woodBronzeShovel");
			stoneBronzeShovel = new InfiToolShovel(PHInfiTools.bronzeShovelID + 1, InfiMaterialEnum.Bronze, InfiMaterialEnum.Stone, "stoneBronzeShovel");
			boneBronzeShovel = new InfiToolShovel(PHInfiTools.bronzeShovelID + 2, InfiMaterialEnum.Bronze, InfiMaterialEnum.Bone, "boneBronzeShovel");
			netherrackBronzeShovel = new InfiToolShovel(PHInfiTools.bronzeShovelID + 3, InfiMaterialEnum.Bronze, InfiMaterialEnum.Netherrack, "netherrackBronzeShovel");
			slimeBronzeShovel = new InfiToolShovel(PHInfiTools.bronzeShovelID + 4, InfiMaterialEnum.Bronze, InfiMaterialEnum.Slime, "slimeBronzeShovel");
			cactusBronzeShovel = new InfiToolShovel(PHInfiTools.bronzeShovelID + 5, InfiMaterialEnum.Bronze, InfiMaterialEnum.Cactus, "cactusBronzeShovel");
			flintBronzeShovel = new InfiToolShovel(PHInfiTools.bronzeShovelID + 6, InfiMaterialEnum.Bronze, InfiMaterialEnum.Flint, "flintBronzeShovel");
			copperBronzeShovel = new InfiToolShovel(PHInfiTools.bronzeShovelID + 7, InfiMaterialEnum.Bronze, InfiMaterialEnum.Copper, "copperBronzeShovel");
			bronzeBronzeShovel = new InfiToolShovel(PHInfiTools.bronzeShovelID + 8, InfiMaterialEnum.Bronze, InfiMaterialEnum.Bronze, "bronzeBronzeShovel");

			MinecraftForge.setToolClass(woodBronzeShovel, "Shovel", InfiMaterialEnum.Bronze.getHarvestLevel());
			MinecraftForge.setToolClass(stoneBronzeShovel, "Shovel", InfiMaterialEnum.Bronze.getHarvestLevel());
			MinecraftForge.setToolClass(boneBronzeShovel, "Shovel", InfiMaterialEnum.Bronze.getHarvestLevel());
			MinecraftForge.setToolClass(netherrackBronzeShovel, "Shovel", InfiMaterialEnum.Bronze.getHarvestLevel());
			MinecraftForge.setToolClass(slimeBronzeShovel, "Shovel", InfiMaterialEnum.Bronze.getHarvestLevel());
			MinecraftForge.setToolClass(cactusBronzeShovel, "Shovel", InfiMaterialEnum.Bronze.getHarvestLevel());
			MinecraftForge.setToolClass(flintBronzeShovel, "Shovel", InfiMaterialEnum.Bronze.getHarvestLevel());
			MinecraftForge.setToolClass(copperBronzeShovel, "Shovel", InfiMaterialEnum.Bronze.getHarvestLevel());
			MinecraftForge.setToolClass(bronzeBronzeShovel, "Shovel", InfiMaterialEnum.Bronze.getHarvestLevel());
		}

		if (PHInfiTools.enableWorkedIronTools)
		{
			woodWorkedIronShovel = new InfiToolShovel(PHInfiTools.workedIronShovelID + 0, InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Wood, "woodWorkedIronShovel");
			stoneWorkedIronShovel = new InfiToolShovel(PHInfiTools.workedIronShovelID + 1, InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Stone, "stoneWorkedIronShovel");
			ironWorkedIronShovel = new InfiToolShovel(PHInfiTools.workedIronShovelID + 2, InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Iron, "ironWorkedIronShovel");
			diamondWorkedIronShovel = new InfiToolShovel(PHInfiTools.workedIronShovelID + 3, InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Diamond, "diamondWorkedIronShovel");
			redstoneWorkedIronShovel = new InfiToolShovel(PHInfiTools.workedIronShovelID + 4, InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Redstone, "redstoneWorkedIronShovel");
			obsidianWorkedIronShovel = new InfiToolShovel(PHInfiTools.workedIronShovelID + 5, InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Obsidian, "obsidianWorkedIronShovel");
			boneWorkedIronShovel = new InfiToolShovel(PHInfiTools.workedIronShovelID + 6, InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Bone, "boneWorkedIronShovel");
			netherrackWorkedIronShovel = new InfiToolShovel(PHInfiTools.workedIronShovelID + 7, InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Netherrack, "netherrackWorkedIronShovel");
			glowstoneWorkedIronShovel = new InfiToolShovel(PHInfiTools.workedIronShovelID + 8, InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Glowstone, "glowstoneWorkedIronShovel");
			iceWorkedIronShovel = new InfiToolShovel(PHInfiTools.workedIronShovelID + 9, InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Ice, "iceWorkedIronShovel");
			slimeWorkedIronShovel = new InfiToolShovel(PHInfiTools.workedIronShovelID + 10, InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Slime, "slimeWorkedIronShovel");
			cactusWorkedIronShovel = new InfiToolShovel(PHInfiTools.workedIronShovelID + 11, InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Cactus, "cactusWorkedIronShovel");
			blazeWorkedIronShovel = new InfiToolShovel(PHInfiTools.workedIronShovelID + 12, InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Blaze, "blazeWorkedIronShovel");
			copperWorkedIronShovel = new InfiToolShovel(PHInfiTools.workedIronShovelID + 13, InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Copper, "copperWorkedIronShovel");
			bronzeWorkedIronShovel = new InfiToolShovel(PHInfiTools.workedIronShovelID + 14, InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Bronze, "bronzeWorkedIronShovel");
			workedWorkedIronShovel = new InfiToolShovel(PHInfiTools.workedIronShovelID + 15, InfiMaterialEnum.WorkedIron, InfiMaterialEnum.WorkedIron, "workedWorkedIronShovel");
			steelWorkedIronShovel = new InfiToolShovel(PHInfiTools.workedIronShovelID + 16, InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Steel, "steelWorkedIronShovel");
			uraniumWorkedIronShovel = new InfiToolShovel(PHInfiTools.workedIronShovelID + 17, InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Uranium, "uraniumWorkedIronShovel");

			MinecraftForge.setToolClass(woodWorkedIronShovel, "Shovel", InfiMaterialEnum.WorkedIron.getHarvestLevel());
			MinecraftForge.setToolClass(stoneWorkedIronShovel, "Shovel", InfiMaterialEnum.WorkedIron.getHarvestLevel());
			MinecraftForge.setToolClass(ironWorkedIronShovel, "Shovel", InfiMaterialEnum.WorkedIron.getHarvestLevel());
			MinecraftForge.setToolClass(diamondWorkedIronShovel, "Shovel", InfiMaterialEnum.WorkedIron.getHarvestLevel());
			MinecraftForge.setToolClass(redstoneWorkedIronShovel, "Shovel", InfiMaterialEnum.WorkedIron.getHarvestLevel());
			MinecraftForge.setToolClass(obsidianWorkedIronShovel, "Shovel", InfiMaterialEnum.WorkedIron.getHarvestLevel());
			MinecraftForge.setToolClass(boneWorkedIronShovel, "Shovel", InfiMaterialEnum.WorkedIron.getHarvestLevel());
			MinecraftForge.setToolClass(netherrackWorkedIronShovel, "Shovel", InfiMaterialEnum.WorkedIron.getHarvestLevel());
			MinecraftForge.setToolClass(glowstoneWorkedIronShovel, "Shovel", InfiMaterialEnum.WorkedIron.getHarvestLevel());
			MinecraftForge.setToolClass(iceWorkedIronShovel, "Shovel", InfiMaterialEnum.WorkedIron.getHarvestLevel());
			MinecraftForge.setToolClass(slimeWorkedIronShovel, "Shovel", InfiMaterialEnum.WorkedIron.getHarvestLevel());
			MinecraftForge.setToolClass(cactusWorkedIronShovel, "Shovel", InfiMaterialEnum.WorkedIron.getHarvestLevel());
			MinecraftForge.setToolClass(blazeWorkedIronShovel, "Shovel", InfiMaterialEnum.WorkedIron.getHarvestLevel());
			MinecraftForge.setToolClass(copperWorkedIronShovel, "Shovel", InfiMaterialEnum.WorkedIron.getHarvestLevel());
			MinecraftForge.setToolClass(bronzeWorkedIronShovel, "Shovel", InfiMaterialEnum.WorkedIron.getHarvestLevel());
			MinecraftForge.setToolClass(workedWorkedIronShovel, "Shovel", InfiMaterialEnum.WorkedIron.getHarvestLevel());
			MinecraftForge.setToolClass(steelWorkedIronShovel, "Shovel", InfiMaterialEnum.WorkedIron.getHarvestLevel());
			MinecraftForge.setToolClass(uraniumWorkedIronShovel, "Shovel", InfiMaterialEnum.WorkedIron.getHarvestLevel());
		}

		if (PHInfiTools.enableSteelTools)
		{
			woodSteelShovel = new InfiToolShovel(PHInfiTools.steelShovelID + 0, InfiMaterialEnum.Steel, InfiMaterialEnum.Wood, "woodSteelShovel");
			stoneSteelShovel = new InfiToolShovel(PHInfiTools.steelShovelID + 1, InfiMaterialEnum.Steel, InfiMaterialEnum.Stone, "stoneSteelShovel");
			ironSteelShovel = new InfiToolShovel(PHInfiTools.steelShovelID + 2, InfiMaterialEnum.Steel, InfiMaterialEnum.Iron, "ironSteelShovel");
			diamondSteelShovel = new InfiToolShovel(PHInfiTools.steelShovelID + 3, InfiMaterialEnum.Steel, InfiMaterialEnum.Diamond, "diamondSteelShovel");
			redstoneSteelShovel = new InfiToolShovel(PHInfiTools.steelShovelID + 4, InfiMaterialEnum.Steel, InfiMaterialEnum.Redstone, "redstoneSteelShovel");
			obsidianSteelShovel = new InfiToolShovel(PHInfiTools.steelShovelID + 5, InfiMaterialEnum.Steel, InfiMaterialEnum.Obsidian, "obsidianSteelShovel");
			boneSteelShovel = new InfiToolShovel(PHInfiTools.steelShovelID + 6, InfiMaterialEnum.Steel, InfiMaterialEnum.Bone, "boneSteelShovel");
			netherrackSteelShovel = new InfiToolShovel(PHInfiTools.steelShovelID + 7, InfiMaterialEnum.Steel, InfiMaterialEnum.Netherrack, "netherrackSteelShovel");
			glowstoneSteelShovel = new InfiToolShovel(PHInfiTools.steelShovelID + 8, InfiMaterialEnum.Steel, InfiMaterialEnum.Glowstone, "glowstoneSteelShovel");
			iceSteelShovel = new InfiToolShovel(PHInfiTools.steelShovelID + 9, InfiMaterialEnum.Steel, InfiMaterialEnum.Ice, "iceSteelShovel");
			slimeSteelShovel = new InfiToolShovel(PHInfiTools.steelShovelID + 10, InfiMaterialEnum.Steel, InfiMaterialEnum.Slime, "slimeSteelShovel");
			cactusSteelShovel = new InfiToolShovel(PHInfiTools.steelShovelID + 11, InfiMaterialEnum.Steel, InfiMaterialEnum.Cactus, "cactusSteelShovel");
			blazeSteelShovel = new InfiToolShovel(PHInfiTools.steelShovelID + 12, InfiMaterialEnum.Steel, InfiMaterialEnum.Blaze, "blazeSteelShovel");
			copperSteelShovel = new InfiToolShovel(PHInfiTools.steelShovelID + 13, InfiMaterialEnum.Steel, InfiMaterialEnum.Copper, "copperSteelShovel");
			bronzeSteelShovel = new InfiToolShovel(PHInfiTools.steelShovelID + 14, InfiMaterialEnum.Steel, InfiMaterialEnum.Bronze, "bronzeSteelShovel");
			workedSteelShovel = new InfiToolShovel(PHInfiTools.steelShovelID + 15, InfiMaterialEnum.Steel, InfiMaterialEnum.WorkedIron, "workedSteelShovel");
			steelSteelShovel = new InfiToolShovel(PHInfiTools.steelShovelID + 16, InfiMaterialEnum.Steel, InfiMaterialEnum.Steel, "steelSteelShovel");
			cobaltSteelShovel = new InfiToolShovel(PHInfiTools.steelShovelID + 17, InfiMaterialEnum.Steel, InfiMaterialEnum.Cobalt, "cobaltSteelShovel");
			arditeSteelShovel = new InfiToolShovel(PHInfiTools.steelShovelID + 18, InfiMaterialEnum.Steel, InfiMaterialEnum.Ardite, "arditeSteelShovel");
			uraniumSteelShovel = new InfiToolShovel(PHInfiTools.steelShovelID + 19, InfiMaterialEnum.Steel, InfiMaterialEnum.Uranium, "uraniumSteelShovel");

			MinecraftForge.setToolClass(woodSteelShovel, "Shovel", InfiMaterialEnum.Steel.getHarvestLevel());
			MinecraftForge.setToolClass(stoneSteelShovel, "Shovel", InfiMaterialEnum.Steel.getHarvestLevel());
			MinecraftForge.setToolClass(ironSteelShovel, "Shovel", InfiMaterialEnum.Steel.getHarvestLevel());
			MinecraftForge.setToolClass(diamondSteelShovel, "Shovel", InfiMaterialEnum.Steel.getHarvestLevel());
			MinecraftForge.setToolClass(redstoneSteelShovel, "Shovel", InfiMaterialEnum.Steel.getHarvestLevel());
			MinecraftForge.setToolClass(obsidianSteelShovel, "Shovel", InfiMaterialEnum.Steel.getHarvestLevel());
			MinecraftForge.setToolClass(boneSteelShovel, "Shovel", InfiMaterialEnum.Steel.getHarvestLevel());
			MinecraftForge.setToolClass(netherrackSteelShovel, "Shovel", InfiMaterialEnum.Steel.getHarvestLevel());
			MinecraftForge.setToolClass(glowstoneSteelShovel, "Shovel", InfiMaterialEnum.Steel.getHarvestLevel());
			MinecraftForge.setToolClass(iceSteelShovel, "Shovel", InfiMaterialEnum.Steel.getHarvestLevel());
			MinecraftForge.setToolClass(slimeSteelShovel, "Shovel", InfiMaterialEnum.Steel.getHarvestLevel());
			MinecraftForge.setToolClass(cactusSteelShovel, "Shovel", InfiMaterialEnum.Steel.getHarvestLevel());
			MinecraftForge.setToolClass(blazeSteelShovel, "Shovel", InfiMaterialEnum.Steel.getHarvestLevel());
			MinecraftForge.setToolClass(copperSteelShovel, "Shovel", InfiMaterialEnum.Steel.getHarvestLevel());
			MinecraftForge.setToolClass(bronzeSteelShovel, "Shovel", InfiMaterialEnum.Steel.getHarvestLevel());
			MinecraftForge.setToolClass(workedSteelShovel, "Shovel", InfiMaterialEnum.Steel.getHarvestLevel());
			MinecraftForge.setToolClass(steelSteelShovel, "Shovel", InfiMaterialEnum.Steel.getHarvestLevel());
			MinecraftForge.setToolClass(cobaltSteelShovel, "Shovel", InfiMaterialEnum.Steel.getHarvestLevel());
			MinecraftForge.setToolClass(arditeSteelShovel, "Shovel", InfiMaterialEnum.Steel.getHarvestLevel());
			MinecraftForge.setToolClass(uraniumSteelShovel, "Shovel", InfiMaterialEnum.Steel.getHarvestLevel());
		}

		if (PHInfiTools.enableCobaltTools)
		{
			woodCobaltShovel = new InfiToolShovel(PHInfiTools.cobaltShovelID + 0, InfiMaterialEnum.Cobalt, InfiMaterialEnum.Wood, "woodCobaltShovel");
			stoneCobaltShovel = new InfiToolShovel(PHInfiTools.cobaltShovelID + 1, InfiMaterialEnum.Cobalt, InfiMaterialEnum.Stone, "stoneCobaltShovel");
			ironCobaltShovel = new InfiToolShovel(PHInfiTools.cobaltShovelID + 2, InfiMaterialEnum.Cobalt, InfiMaterialEnum.Iron, "ironCobaltShovel");
			diamondCobaltShovel = new InfiToolShovel(PHInfiTools.cobaltShovelID + 3, InfiMaterialEnum.Cobalt, InfiMaterialEnum.Diamond, "diamondCobaltShovel");
			redstoneCobaltShovel = new InfiToolShovel(PHInfiTools.cobaltShovelID + 4, InfiMaterialEnum.Cobalt, InfiMaterialEnum.Redstone, "redstoneCobaltShovel");
			obsidianCobaltShovel = new InfiToolShovel(PHInfiTools.cobaltShovelID + 5, InfiMaterialEnum.Cobalt, InfiMaterialEnum.Obsidian, "obsidianCobaltShovel");
			boneCobaltShovel = new InfiToolShovel(PHInfiTools.cobaltShovelID + 6, InfiMaterialEnum.Cobalt, InfiMaterialEnum.Bone, "boneCobaltShovel");
			slimeCobaltShovel = new InfiToolShovel(PHInfiTools.cobaltShovelID + 7, InfiMaterialEnum.Cobalt, InfiMaterialEnum.Slime, "slimeCobaltShovel");
			cactusCobaltShovel = new InfiToolShovel(PHInfiTools.cobaltShovelID + 8, InfiMaterialEnum.Cobalt, InfiMaterialEnum.Cactus, "cactusCobaltShovel");
			blazeCobaltShovel = new InfiToolShovel(PHInfiTools.cobaltShovelID + 9, InfiMaterialEnum.Cobalt, InfiMaterialEnum.Blaze, "blazeCobaltShovel");
			copperCobaltShovel = new InfiToolShovel(PHInfiTools.cobaltShovelID + 10, InfiMaterialEnum.Cobalt, InfiMaterialEnum.Copper, "copperCobaltShovel");
			bronzeCobaltShovel = new InfiToolShovel(PHInfiTools.cobaltShovelID + 11, InfiMaterialEnum.Cobalt, InfiMaterialEnum.Bronze, "bronzeCobaltShovel");
			workedCobaltShovel = new InfiToolShovel(PHInfiTools.cobaltShovelID + 12, InfiMaterialEnum.Cobalt, InfiMaterialEnum.WorkedIron, "workedCobaltShovel");
			steelCobaltShovel = new InfiToolShovel(PHInfiTools.cobaltShovelID + 13, InfiMaterialEnum.Cobalt, InfiMaterialEnum.Steel, "steelCobaltShovel");
			cobaltCobaltShovel = new InfiToolShovel(PHInfiTools.cobaltShovelID + 14, InfiMaterialEnum.Cobalt, InfiMaterialEnum.Cobalt, "cobaltCobaltShovel");
			arditeCobaltShovel = new InfiToolShovel(PHInfiTools.cobaltShovelID + 15, InfiMaterialEnum.Cobalt, InfiMaterialEnum.Ardite, "arditeCobaltShovel");
			manyullynCobaltShovel = new InfiToolShovel(PHInfiTools.cobaltShovelID + 16, InfiMaterialEnum.Cobalt, InfiMaterialEnum.Manyullyn, "manyullynCobaltShovel");
			uraniumCobaltShovel = new InfiToolShovel(PHInfiTools.cobaltShovelID + 17, InfiMaterialEnum.Cobalt, InfiMaterialEnum.Uranium, "uraniumCobaltShovel");

			MinecraftForge.setToolClass(woodCobaltShovel, "Shovel", InfiMaterialEnum.Cobalt.getHarvestLevel());
			MinecraftForge.setToolClass(stoneCobaltShovel, "Shovel", InfiMaterialEnum.Cobalt.getHarvestLevel());
			MinecraftForge.setToolClass(ironCobaltShovel, "Shovel", InfiMaterialEnum.Cobalt.getHarvestLevel());
			MinecraftForge.setToolClass(diamondCobaltShovel, "Shovel", InfiMaterialEnum.Cobalt.getHarvestLevel());
			MinecraftForge.setToolClass(redstoneCobaltShovel, "Shovel", InfiMaterialEnum.Cobalt.getHarvestLevel());
			MinecraftForge.setToolClass(obsidianCobaltShovel, "Shovel", InfiMaterialEnum.Cobalt.getHarvestLevel());
			MinecraftForge.setToolClass(boneCobaltShovel, "Shovel", InfiMaterialEnum.Cobalt.getHarvestLevel());
			MinecraftForge.setToolClass(slimeCobaltShovel, "Shovel", InfiMaterialEnum.Cobalt.getHarvestLevel());
			MinecraftForge.setToolClass(cactusCobaltShovel, "Shovel", InfiMaterialEnum.Cobalt.getHarvestLevel());
			MinecraftForge.setToolClass(blazeCobaltShovel, "Shovel", InfiMaterialEnum.Cobalt.getHarvestLevel());
			MinecraftForge.setToolClass(copperCobaltShovel, "Shovel", InfiMaterialEnum.Cobalt.getHarvestLevel());
			MinecraftForge.setToolClass(bronzeCobaltShovel, "Shovel", InfiMaterialEnum.Cobalt.getHarvestLevel());
			MinecraftForge.setToolClass(workedCobaltShovel, "Shovel", InfiMaterialEnum.Cobalt.getHarvestLevel());
			MinecraftForge.setToolClass(steelCobaltShovel, "Shovel", InfiMaterialEnum.Cobalt.getHarvestLevel());
			MinecraftForge.setToolClass(cobaltCobaltShovel, "Shovel", InfiMaterialEnum.Cobalt.getHarvestLevel());
			MinecraftForge.setToolClass(arditeCobaltShovel, "Shovel", InfiMaterialEnum.Cobalt.getHarvestLevel());
			MinecraftForge.setToolClass(manyullynCobaltShovel, "Shovel", InfiMaterialEnum.Cobalt.getHarvestLevel());
			MinecraftForge.setToolClass(uraniumCobaltShovel, "Shovel", InfiMaterialEnum.Cobalt.getHarvestLevel());
		}

		if (PHInfiTools.enableArditeTools)
		{
			woodArditeShovel = new InfiToolShovel(PHInfiTools.arditeShovelID + 0, InfiMaterialEnum.Ardite, InfiMaterialEnum.Wood, "woodArditeShovel");
			stoneArditeShovel = new InfiToolShovel(PHInfiTools.arditeShovelID + 1, InfiMaterialEnum.Ardite, InfiMaterialEnum.Stone, "stoneArditeShovel");
			ironArditeShovel = new InfiToolShovel(PHInfiTools.arditeShovelID + 2, InfiMaterialEnum.Ardite, InfiMaterialEnum.Iron, "ironArditeShovel");
			diamondArditeShovel = new InfiToolShovel(PHInfiTools.arditeShovelID + 3, InfiMaterialEnum.Ardite, InfiMaterialEnum.Diamond, "diamondArditeShovel");
			redstoneArditeShovel = new InfiToolShovel(PHInfiTools.arditeShovelID + 4, InfiMaterialEnum.Ardite, InfiMaterialEnum.Redstone, "redstoneArditeShovel");
			obsidianArditeShovel = new InfiToolShovel(PHInfiTools.arditeShovelID + 5, InfiMaterialEnum.Ardite, InfiMaterialEnum.Obsidian, "obsidianArditeShovel");
			boneArditeShovel = new InfiToolShovel(PHInfiTools.arditeShovelID + 6, InfiMaterialEnum.Ardite, InfiMaterialEnum.Bone, "boneArditeShovel");
			slimeArditeShovel = new InfiToolShovel(PHInfiTools.arditeShovelID + 7, InfiMaterialEnum.Ardite, InfiMaterialEnum.Slime, "slimeArditeShovel");
			cactusArditeShovel = new InfiToolShovel(PHInfiTools.arditeShovelID + 8, InfiMaterialEnum.Ardite, InfiMaterialEnum.Cactus, "cactusArditeShovel");
			blazeArditeShovel = new InfiToolShovel(PHInfiTools.arditeShovelID + 9, InfiMaterialEnum.Ardite, InfiMaterialEnum.Blaze, "blazeArditeShovel");
			copperArditeShovel = new InfiToolShovel(PHInfiTools.arditeShovelID + 10, InfiMaterialEnum.Ardite, InfiMaterialEnum.Copper, "copperArditeShovel");
			bronzeArditeShovel = new InfiToolShovel(PHInfiTools.arditeShovelID + 11, InfiMaterialEnum.Ardite, InfiMaterialEnum.Bronze, "bronzeArditeShovel");
			workedArditeShovel = new InfiToolShovel(PHInfiTools.arditeShovelID + 12, InfiMaterialEnum.Ardite, InfiMaterialEnum.WorkedIron, "workedArditeShovel");
			steelArditeShovel = new InfiToolShovel(PHInfiTools.arditeShovelID + 13, InfiMaterialEnum.Ardite, InfiMaterialEnum.Steel, "steelArditeShovel");
			cobaltArditeShovel = new InfiToolShovel(PHInfiTools.arditeShovelID + 14, InfiMaterialEnum.Ardite, InfiMaterialEnum.Cobalt, "cobaltArditeShovel");
			arditeArditeShovel = new InfiToolShovel(PHInfiTools.arditeShovelID + 15, InfiMaterialEnum.Ardite, InfiMaterialEnum.Ardite, "arditeArditeShovel");
			manyullynArditeShovel = new InfiToolShovel(PHInfiTools.arditeShovelID + 16, InfiMaterialEnum.Ardite, InfiMaterialEnum.Manyullyn, "manyullynArditeShovel");
			uraniumArditeShovel = new InfiToolShovel(PHInfiTools.arditeShovelID + 17, InfiMaterialEnum.Ardite, InfiMaterialEnum.Uranium, "uraniumArditeShovel");

			MinecraftForge.setToolClass(woodArditeShovel, "Shovel", InfiMaterialEnum.Ardite.getHarvestLevel());
			MinecraftForge.setToolClass(stoneArditeShovel, "Shovel", InfiMaterialEnum.Ardite.getHarvestLevel());
			MinecraftForge.setToolClass(ironArditeShovel, "Shovel", InfiMaterialEnum.Ardite.getHarvestLevel());
			MinecraftForge.setToolClass(diamondArditeShovel, "Shovel", InfiMaterialEnum.Ardite.getHarvestLevel());
			MinecraftForge.setToolClass(redstoneArditeShovel, "Shovel", InfiMaterialEnum.Ardite.getHarvestLevel());
			MinecraftForge.setToolClass(obsidianArditeShovel, "Shovel", InfiMaterialEnum.Ardite.getHarvestLevel());
			MinecraftForge.setToolClass(boneArditeShovel, "Shovel", InfiMaterialEnum.Ardite.getHarvestLevel());
			MinecraftForge.setToolClass(slimeArditeShovel, "Shovel", InfiMaterialEnum.Ardite.getHarvestLevel());
			MinecraftForge.setToolClass(cactusArditeShovel, "Shovel", InfiMaterialEnum.Ardite.getHarvestLevel());
			MinecraftForge.setToolClass(blazeArditeShovel, "Shovel", InfiMaterialEnum.Ardite.getHarvestLevel());
			MinecraftForge.setToolClass(copperArditeShovel, "Shovel", InfiMaterialEnum.Ardite.getHarvestLevel());
			MinecraftForge.setToolClass(bronzeArditeShovel, "Shovel", InfiMaterialEnum.Ardite.getHarvestLevel());
			MinecraftForge.setToolClass(workedArditeShovel, "Shovel", InfiMaterialEnum.Ardite.getHarvestLevel());
			MinecraftForge.setToolClass(steelArditeShovel, "Shovel", InfiMaterialEnum.Ardite.getHarvestLevel());
			MinecraftForge.setToolClass(cobaltArditeShovel, "Shovel", InfiMaterialEnum.Ardite.getHarvestLevel());
			MinecraftForge.setToolClass(arditeArditeShovel, "Shovel", InfiMaterialEnum.Ardite.getHarvestLevel());
			MinecraftForge.setToolClass(manyullynArditeShovel, "Shovel", InfiMaterialEnum.Ardite.getHarvestLevel());
			MinecraftForge.setToolClass(uraniumArditeShovel, "Shovel", InfiMaterialEnum.Ardite.getHarvestLevel());
		}

		if (PHInfiTools.enableManyullynTools)
		{
			woodManyullynShovel = new InfiToolShovel(PHInfiTools.manyullynShovelID + 0, InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Wood, "woodManyullynShovel");
			stoneManyullynShovel = new InfiToolShovel(PHInfiTools.manyullynShovelID + 1, InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Stone, "stoneManyullynShovel");
			ironManyullynShovel = new InfiToolShovel(PHInfiTools.manyullynShovelID + 2, InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Iron, "ironManyullynShovel");
			diamondManyullynShovel = new InfiToolShovel(PHInfiTools.manyullynShovelID + 3, InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Diamond, "diamondManyullynShovel");
			redstoneManyullynShovel = new InfiToolShovel(PHInfiTools.manyullynShovelID + 4, InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Redstone, "redstoneManyullynShovel");
			obsidianManyullynShovel = new InfiToolShovel(PHInfiTools.manyullynShovelID + 5, InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Obsidian, "obsidianManyullynShovel");
			boneManyullynShovel = new InfiToolShovel(PHInfiTools.manyullynShovelID + 6, InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Bone, "boneManyullynShovel");
			slimeManyullynShovel = new InfiToolShovel(PHInfiTools.manyullynShovelID + 7, InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Slime, "slimeManyullynShovel");
			cactusManyullynShovel = new InfiToolShovel(PHInfiTools.manyullynShovelID + 8, InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Cactus, "cactusManyullynShovel");
			blazeManyullynShovel = new InfiToolShovel(PHInfiTools.manyullynShovelID + 9, InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Blaze, "blazeManyullynShovel");
			copperManyullynShovel = new InfiToolShovel(PHInfiTools.manyullynShovelID + 10, InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Copper, "copperManyullynShovel");
			bronzeManyullynShovel = new InfiToolShovel(PHInfiTools.manyullynShovelID + 11, InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Bronze, "bronzeManyullynShovel");
			workedManyullynShovel = new InfiToolShovel(PHInfiTools.manyullynShovelID + 12, InfiMaterialEnum.Manyullyn, InfiMaterialEnum.WorkedIron, "workedManyullynShovel");
			steelManyullynShovel = new InfiToolShovel(PHInfiTools.manyullynShovelID + 13, InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Steel, "steelManyullynShovel");
			cobaltManyullynShovel = new InfiToolShovel(PHInfiTools.manyullynShovelID + 14, InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Cobalt, "cobaltManyullynShovel");
			arditeManyullynShovel = new InfiToolShovel(PHInfiTools.manyullynShovelID + 15, InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Ardite, "arditeManyullynShovel");
			manyullynManyullynShovel = new InfiToolShovel(PHInfiTools.manyullynShovelID + 16, InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Manyullyn, "manyullynManyullynShovel");
			uraniumManyullynShovel = new InfiToolShovel(PHInfiTools.manyullynShovelID + 17, InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Uranium, "uraniumManyullynShovel");

			MinecraftForge.setToolClass(woodManyullynShovel, "Shovel", InfiMaterialEnum.Manyullyn.getHarvestLevel());
			MinecraftForge.setToolClass(stoneManyullynShovel, "Shovel", InfiMaterialEnum.Manyullyn.getHarvestLevel());
			MinecraftForge.setToolClass(ironManyullynShovel, "Shovel", InfiMaterialEnum.Manyullyn.getHarvestLevel());
			MinecraftForge.setToolClass(diamondManyullynShovel, "Shovel", InfiMaterialEnum.Manyullyn.getHarvestLevel());
			MinecraftForge.setToolClass(redstoneManyullynShovel, "Shovel", InfiMaterialEnum.Manyullyn.getHarvestLevel());
			MinecraftForge.setToolClass(obsidianManyullynShovel, "Shovel", InfiMaterialEnum.Manyullyn.getHarvestLevel());
			MinecraftForge.setToolClass(boneManyullynShovel, "Shovel", InfiMaterialEnum.Manyullyn.getHarvestLevel());
			MinecraftForge.setToolClass(slimeManyullynShovel, "Shovel", InfiMaterialEnum.Manyullyn.getHarvestLevel());
			MinecraftForge.setToolClass(cactusManyullynShovel, "Shovel", InfiMaterialEnum.Manyullyn.getHarvestLevel());
			MinecraftForge.setToolClass(blazeManyullynShovel, "Shovel", InfiMaterialEnum.Manyullyn.getHarvestLevel());
			MinecraftForge.setToolClass(copperManyullynShovel, "Shovel", InfiMaterialEnum.Manyullyn.getHarvestLevel());
			MinecraftForge.setToolClass(bronzeManyullynShovel, "Shovel", InfiMaterialEnum.Manyullyn.getHarvestLevel());
			MinecraftForge.setToolClass(workedManyullynShovel, "Shovel", InfiMaterialEnum.Manyullyn.getHarvestLevel());
			MinecraftForge.setToolClass(steelManyullynShovel, "Shovel", InfiMaterialEnum.Manyullyn.getHarvestLevel());
			MinecraftForge.setToolClass(cobaltManyullynShovel, "Shovel", InfiMaterialEnum.Manyullyn.getHarvestLevel());
			MinecraftForge.setToolClass(arditeManyullynShovel, "Shovel", InfiMaterialEnum.Manyullyn.getHarvestLevel());
			MinecraftForge.setToolClass(manyullynManyullynShovel, "Shovel", InfiMaterialEnum.Manyullyn.getHarvestLevel());
			MinecraftForge.setToolClass(uraniumManyullynShovel, "Shovel", InfiMaterialEnum.Manyullyn.getHarvestLevel());
		}

		if (PHInfiTools.enableUraniumTools)
		{
			diamondUraniumShovel = new InfiToolShovel(PHInfiTools.uraniumShovelID + 0, InfiMaterialEnum.Uranium, InfiMaterialEnum.Diamond, "diamondUraniumShovel");
			redstoneUraniumShovel = new InfiToolShovel(PHInfiTools.uraniumShovelID + 1, InfiMaterialEnum.Uranium, InfiMaterialEnum.Redstone, "redstoneUraniumShovel");
			boneUraniumShovel = new InfiToolShovel(PHInfiTools.uraniumShovelID + 2, InfiMaterialEnum.Uranium, InfiMaterialEnum.Bone, "boneUraniumShovel");
			netherrackUraniumShovel = new InfiToolShovel(PHInfiTools.uraniumShovelID + 3, InfiMaterialEnum.Uranium, InfiMaterialEnum.Netherrack, "netherrackUraniumShovel");
			glowstoneUraniumShovel = new InfiToolShovel(PHInfiTools.uraniumShovelID + 4, InfiMaterialEnum.Uranium, InfiMaterialEnum.Glowstone, "glowstoneUraniumShovel");
			lavaUraniumShovel = new InfiToolShovel(PHInfiTools.uraniumShovelID + 5, InfiMaterialEnum.Uranium, InfiMaterialEnum.Lava, "lavaUraniumShovel");
			blazeUraniumShovel = new InfiToolShovel(PHInfiTools.uraniumShovelID + 6, InfiMaterialEnum.Uranium, InfiMaterialEnum.Blaze, "blazeUraniumShovel");
			cobaltUraniumShovel = new InfiToolShovel(PHInfiTools.uraniumShovelID + 7, InfiMaterialEnum.Uranium, InfiMaterialEnum.Cobalt, "cobaltUraniumShovel");
			arditeUraniumShovel = new InfiToolShovel(PHInfiTools.uraniumShovelID + 8, InfiMaterialEnum.Uranium, InfiMaterialEnum.Ardite, "arditeUraniumShovel");
			uraniumUraniumShovel = new InfiToolShovel(PHInfiTools.uraniumShovelID + 9, InfiMaterialEnum.Uranium, InfiMaterialEnum.Uranium, "uraniumUraniumShovel");

			MinecraftForge.setToolClass(diamondUraniumShovel, "Shovel", InfiMaterialEnum.Uranium.getHarvestLevel());
			MinecraftForge.setToolClass(redstoneUraniumShovel, "Shovel", InfiMaterialEnum.Uranium.getHarvestLevel());
			MinecraftForge.setToolClass(boneUraniumShovel, "Shovel", InfiMaterialEnum.Uranium.getHarvestLevel());
			MinecraftForge.setToolClass(netherrackUraniumShovel, "Shovel", InfiMaterialEnum.Uranium.getHarvestLevel());
			MinecraftForge.setToolClass(glowstoneUraniumShovel, "Shovel", InfiMaterialEnum.Uranium.getHarvestLevel());
			MinecraftForge.setToolClass(lavaUraniumShovel, "Shovel", InfiMaterialEnum.Uranium.getHarvestLevel());
			MinecraftForge.setToolClass(blazeUraniumShovel, "Shovel", InfiMaterialEnum.Uranium.getHarvestLevel());
			MinecraftForge.setToolClass(cobaltUraniumShovel, "Shovel", InfiMaterialEnum.Uranium.getHarvestLevel());
			MinecraftForge.setToolClass(arditeUraniumShovel, "Shovel", InfiMaterialEnum.Uranium.getHarvestLevel());
			MinecraftForge.setToolClass(uraniumUraniumShovel, "Shovel", InfiMaterialEnum.Uranium.getHarvestLevel());
		}
	}

	private static void addNames()
	{
		if (PHInfiTools.enableWoodTools && PHInfiTools.overwriteVanillaTools)
			LanguageRegistry.instance().addName(woodWoodShovel, "Wooden Shovel");
		if (PHInfiTools.enableStoneTools)
			LanguageRegistry.instance().addName(stoneStoneShovel, "Heavy Shovel");
		if (PHInfiTools.enableIronTools)
			LanguageRegistry.instance().addName(ironIronShovel, "Ironic Shovel");
		if (PHInfiTools.enableDiamondTools)
			LanguageRegistry.instance().addName(diamondDiamondShovel, "Diamondium Shovel");
		if (PHInfiTools.enableRedstoneTools)
			LanguageRegistry.instance().addName(redstoneRedstoneShovel, "Redredred Shovel");
		if (PHInfiTools.enableObsidianTools)
			LanguageRegistry.instance().addName(obsidianObsidianShovel, "Ebony Shovel");
		if (PHInfiTools.enableSandstoneTools)
			LanguageRegistry.instance().addName(sandstoneSandstoneShovel, "Fragile Shovel");
		if (PHInfiTools.enableNetherrackTools)
			LanguageRegistry.instance().addName(boneBoneShovel, "Necrotic Shovel");
		if (PHInfiTools.enablePaperTools)
			LanguageRegistry.instance().addName(paperPaperShovel, "Soft Shovel");
		if (PHInfiTools.enableMossyTools)
			LanguageRegistry.instance().addName(mossyMossyShovel, "Living Shovel");
		if (PHInfiTools.enableNetherrackTools)
			LanguageRegistry.instance().addName(netherrackNetherrackShovel, "Bloodsoaked Shovel");
		if (PHInfiTools.enableGlowstoneTools)
			LanguageRegistry.instance().addName(glowstoneGlowstoneShovel, "Bright Shovel");
		if (PHInfiTools.enableIceTools)
			LanguageRegistry.instance().addName(iceIceShovel, "Freezing Shovel");
		if (PHInfiTools.enableLavaTools)
			LanguageRegistry.instance().addName(lavaLavaShovel, "Burning Shovel");
		if (PHInfiTools.enableSlimeTools)
			LanguageRegistry.instance().addName(slimeSlimeShovel, "Toy Shovel");
		if (PHInfiTools.enableCactusTools)
			LanguageRegistry.instance().addName(cactusCactusShovel, "Thorned Shovel");
		if (PHInfiTools.enableFlintTools)
			LanguageRegistry.instance().addName(flintFlintShovel, "Rough-hewn Shovel");
		if (PHInfiTools.enableBlazeTools)
			LanguageRegistry.instance().addName(blazeBlazeShovel, "Netherite Shovel");
		if (PHInfiTools.enableCopperTools)
			LanguageRegistry.instance().addName(copperCopperShovel, "Orange-Tang Shovel");
		if (PHInfiTools.enableBronzeTools)
			LanguageRegistry.instance().addName(bronzeBronzeShovel, "Polished Shovel");
		if (PHInfiTools.enableWorkedIronTools)
			LanguageRegistry.instance().addName(workedWorkedIronShovel, "Reworked Iron Shovel");
		if (PHInfiTools.enableSteelTools)
			LanguageRegistry.instance().addName(steelSteelShovel, "Forge-Wrought Shovel");
		if (PHInfiTools.enableCobaltTools)
			LanguageRegistry.instance().addName(cobaltCobaltShovel, "Beautiful Shovel");
		if (PHInfiTools.enableArditeTools)
			LanguageRegistry.instance().addName(arditeArditeShovel, "Rustic Shovel");
		if (PHInfiTools.enableManyullynTools)
			LanguageRegistry.instance().addName(manyullynManyullynShovel, "False-Prophetic Shovel");
		if (PHInfiTools.enableUraniumTools)
			LanguageRegistry.instance().addName(uraniumUraniumShovel, "Cancerous Shovel");
	}

	public static void registerInfiToolsRecipes()
	{
		if (PHInfiTools.enableWoodTools)
		{
			if (PHInfiTools.overwriteVanillaTools)
				GameRegistry.addRecipe(new ItemStack(woodWoodShovel), recipe, '#', Block.planks, '|', Item.stick);
			GameRegistry.addRecipe(new ItemStack(sandstoneWoodShovel), recipe, '#', Block.planks, '|', InfiLibrary.sandstoneRod );
			GameRegistry.addRecipe(new ItemStack(boneWoodShovel), recipe, '#', Block.planks, '|', Item.bone );
			GameRegistry.addRecipe(new ItemStack(boneWoodShovel), recipe, '#', Block.planks, '|', InfiLibrary.boneRod );
			GameRegistry.addRecipe(new ItemStack(paperWoodShovel), recipe, '#', Block.planks, '|', InfiLibrary.paperRod );
			GameRegistry.addRecipe(new ItemStack(iceWoodShovel), recipe, '#', Block.planks, '|', InfiLibrary.iceRod );
			GameRegistry.addRecipe(new ItemStack(slimeWoodShovel), recipe, '#', Block.planks, '|', InfiLibrary.slimeRod );
			GameRegistry.addRecipe(new ItemStack(cactusWoodShovel), recipe, '#', Block.planks, '|', InfiLibrary.cactusRod );
		}

		if (PHInfiTools.enableStoneTools)
		{
			if (PHInfiTools.overwriteVanillaTools)
				GameRegistry.addRecipe(new ItemStack(woodStoneShovel), recipe, '#', Block.cobblestone, '|', Item.stick);
			GameRegistry.addRecipe(new ItemStack(stoneStoneShovel), recipe, '#', Block.cobblestone, '|', InfiLibrary.stoneRod );
			GameRegistry.addRecipe(new ItemStack(sandstoneStoneShovel), recipe, '#', Block.cobblestone, '|', InfiLibrary.sandstoneRod );
			GameRegistry.addRecipe(new ItemStack(boneStoneShovel), recipe, '#', Block.cobblestone, '|', Item.bone );
			GameRegistry.addRecipe(new ItemStack(boneStoneShovel), recipe, '#', Block.cobblestone, '|', InfiLibrary.boneRod );
			GameRegistry.addRecipe(new ItemStack(netherrackStoneShovel), recipe, '#', Block.cobblestone, '|', InfiLibrary.netherrackRod );
			GameRegistry.addRecipe(new ItemStack(iceStoneShovel), recipe, '#', Block.cobblestone, '|', InfiLibrary.iceRod );
			GameRegistry.addRecipe(new ItemStack(slimeStoneShovel), recipe, '#', Block.cobblestone, '|', InfiLibrary.slimeRod );
			GameRegistry.addRecipe(new ItemStack(cactusStoneShovel), recipe, '#', Block.cobblestone, '|', InfiLibrary.cactusRod );
			GameRegistry.addRecipe(new ItemStack(flintStoneShovel), recipe, '#', Block.cobblestone, '|', InfiLibrary.flintRod );

			if (PHInfiTools.overwriteVanillaTools)
				GameRegistry.addRecipe(new ItemStack(woodStoneShovel), recipe, '#', Block.stone, '|', Item.stick);
			GameRegistry.addRecipe(new ItemStack(stoneStoneShovel), recipe, '#', Block.stone, '|', InfiLibrary.stoneRod );
			GameRegistry.addRecipe(new ItemStack(sandstoneStoneShovel), recipe, '#', Block.stone, '|', InfiLibrary.sandstoneRod );
			GameRegistry.addRecipe(new ItemStack(boneStoneShovel), recipe, '#', Block.stone, '|', Item.bone );
			GameRegistry.addRecipe(new ItemStack(boneStoneShovel), recipe, '#', Block.stone, '|', InfiLibrary.boneRod );
			GameRegistry.addRecipe(new ItemStack(netherrackStoneShovel), recipe, '#', Block.stone, '|', InfiLibrary.netherrackRod );
			GameRegistry.addRecipe(new ItemStack(iceStoneShovel), recipe, '#', Block.stone, '|', InfiLibrary.iceRod );
			GameRegistry.addRecipe(new ItemStack(slimeStoneShovel), recipe, '#', Block.stone, '|', InfiLibrary.slimeRod );
			GameRegistry.addRecipe(new ItemStack(cactusStoneShovel), recipe, '#', Block.stone, '|', InfiLibrary.cactusRod );
			GameRegistry.addRecipe(new ItemStack(flintStoneShovel), recipe, '#', Block.stone, '|', InfiLibrary.flintRod );
		}

		if (PHInfiTools.enableIronTools)
		{
			if (PHInfiTools.overwriteVanillaTools)
				GameRegistry.addRecipe(new ItemStack(woodIronShovel), recipe, '#', Item.ingotIron, '|', Item.stick);
			GameRegistry.addRecipe(new ItemStack(stoneIronShovel), recipe, '#', Item.ingotIron, '|', InfiLibrary.stoneRod );
			GameRegistry.addRecipe(new ItemStack(ironIronShovel), recipe, '#', Item.ingotIron, '|', InfiLibrary.ironRod );
			GameRegistry.addRecipe(new ItemStack(boneIronShovel), recipe, '#', Item.ingotIron, '|', Item.bone );
			GameRegistry.addRecipe(new ItemStack(boneIronShovel), recipe, '#', Item.ingotIron, '|', InfiLibrary.boneRod );
			GameRegistry.addRecipe(new ItemStack(netherrackIronShovel), recipe, '#', Item.ingotIron, '|', InfiLibrary.netherrackRod );
			GameRegistry.addRecipe(new ItemStack(glowstoneIronShovel), recipe, '#', Item.ingotIron, '|', InfiLibrary.glowstoneRod );
			GameRegistry.addRecipe(new ItemStack(cactusIronShovel), recipe, '#', Item.ingotIron, '|', InfiLibrary.cactusRod );
			GameRegistry.addRecipe(new ItemStack(copperIronShovel), recipe, '#', Item.ingotIron, '|', InfiLibrary.copperRod );
			GameRegistry.addRecipe(new ItemStack(bronzeIronShovel), recipe, '#', Item.ingotIron, '|', InfiLibrary.bronzeRod );
		}

		if (PHInfiTools.enableDiamondTools)
		{
			if (PHInfiTools.overwriteVanillaTools)
				GameRegistry.addRecipe(new ItemStack(woodDiamondShovel), recipe, '#', Item.diamond, '|', Item.stick);
			GameRegistry.addRecipe(new ItemStack(stoneDiamondShovel), recipe, '#', Item.diamond, '|', InfiLibrary.stoneRod );
			GameRegistry.addRecipe(new ItemStack(ironDiamondShovel), recipe, '#', Item.diamond, '|', InfiLibrary.ironRod );
			GameRegistry.addRecipe(new ItemStack(diamondDiamondShovel), recipe, '#', Item.diamond, '|', InfiLibrary.diamondRod );
			GameRegistry.addRecipe(new ItemStack(redstoneDiamondShovel), recipe, '#', Item.diamond, '|', InfiLibrary.redstoneRod );
			GameRegistry.addRecipe(new ItemStack(obsidianDiamondShovel), recipe, '#', Item.diamond, '|', InfiLibrary.obsidianRod );
			GameRegistry.addRecipe(new ItemStack(boneDiamondShovel), recipe, '#', Item.diamond, '|', Item.bone );
			GameRegistry.addRecipe(new ItemStack(boneDiamondShovel), recipe, '#', Item.diamond, '|', InfiLibrary.boneRod );
			GameRegistry.addRecipe(new ItemStack(mossyDiamondShovel), recipe, '#', Item.diamond, '|', InfiLibrary.mossyRod );
			GameRegistry.addRecipe(new ItemStack(netherrackDiamondShovel), recipe, '#', Item.diamond, '|', InfiLibrary.netherrackRod );
			GameRegistry.addRecipe(new ItemStack(glowstoneDiamondShovel), recipe, '#', Item.diamond, '|', InfiLibrary.glowstoneRod );
			GameRegistry.addRecipe(new ItemStack(lavaDiamondShovel), recipe, '#', Item.diamond, '|', InfiLibrary.lavaRod );
			GameRegistry.addRecipe(new ItemStack(cactusDiamondShovel), recipe, '#', Item.diamond, '|', InfiLibrary.cactusRod );
			GameRegistry.addRecipe(new ItemStack(flintDiamondShovel), recipe, '#', Item.diamond, '|', InfiLibrary.flintRod );
			GameRegistry.addRecipe(new ItemStack(blazeDiamondShovel), recipe, '#', Item.diamond, '|', Item.blazeRod );
			GameRegistry.addRecipe(new ItemStack(copperDiamondShovel), recipe, '#', Item.diamond, '|', InfiLibrary.copperRod );
			GameRegistry.addRecipe(new ItemStack(bronzeDiamondShovel), recipe, '#', Item.diamond, '|', InfiLibrary.bronzeRod );
			GameRegistry.addRecipe(new ItemStack(workedDiamondShovel), recipe, '#', Item.diamond, '|', InfiLibrary.workedIronRod );
			GameRegistry.addRecipe(new ItemStack(steelDiamondShovel), recipe, '#', Item.diamond, '|', InfiLibrary.steelRod );
			GameRegistry.addRecipe(new ItemStack(cobaltDiamondShovel), recipe, '#', Item.diamond, '|', InfiLibrary.cobaltRod );
			GameRegistry.addRecipe(new ItemStack(arditeDiamondShovel), recipe, '#', Item.diamond, '|', InfiLibrary.arditeRod );
			GameRegistry.addRecipe(new ItemStack(manyullynDiamondShovel), recipe, '#', Item.diamond, '|', InfiLibrary.manyullynRod );
			GameRegistry.addRecipe(new ItemStack(uraniumDiamondShovel), recipe, '#', Item.diamond, '|', InfiLibrary.uraniumRod );
		}

		if (PHInfiTools.enableRedstoneTools)
		{
			GameRegistry.addRecipe(new ItemStack(woodRedstoneShovel), recipe, '#', InfiLibrary.redstoneCrystal, '|', Item.stick );
			GameRegistry.addRecipe(new ItemStack(stoneRedstoneShovel), recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.stoneRod );
			GameRegistry.addRecipe(new ItemStack(ironRedstoneShovel), recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.ironRod );
			GameRegistry.addRecipe(new ItemStack(redstoneRedstoneShovel), recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.redstoneRod );
			GameRegistry.addRecipe(new ItemStack(obsidianRedstoneShovel), recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.obsidianRod );
			GameRegistry.addRecipe(new ItemStack(sandstoneRedstoneShovel), recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.sandstoneRod );
			GameRegistry.addRecipe(new ItemStack(boneRedstoneShovel), recipe, '#', InfiLibrary.redstoneCrystal, '|', Item.bone );
			GameRegistry.addRecipe(new ItemStack(boneRedstoneShovel), recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.boneRod );
			GameRegistry.addRecipe(new ItemStack(paperRedstoneShovel), recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.paperRod );
			GameRegistry.addRecipe(new ItemStack(mossyRedstoneShovel), recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.mossyRod );
			GameRegistry.addRecipe(new ItemStack(netherrackRedstoneShovel), recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.netherrackRod );
			GameRegistry.addRecipe(new ItemStack(glowstoneRedstoneShovel), recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.glowstoneRod );
			GameRegistry.addRecipe(new ItemStack(iceRedstoneShovel), recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.iceRod );
			GameRegistry.addRecipe(new ItemStack(lavaRedstoneShovel), recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.lavaRod );
			GameRegistry.addRecipe(new ItemStack(slimeRedstoneShovel), recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.slimeRod );
			GameRegistry.addRecipe(new ItemStack(cactusRedstoneShovel), recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.cactusRod );
			GameRegistry.addRecipe(new ItemStack(flintRedstoneShovel), recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.flintRod );
			GameRegistry.addRecipe(new ItemStack(copperRedstoneShovel), recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.copperRod );
			GameRegistry.addRecipe(new ItemStack(bronzeRedstoneShovel), recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.bronzeRod );
			GameRegistry.addRecipe(new ItemStack(workedRedstoneShovel), recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.workedIronRod );
			GameRegistry.addRecipe(new ItemStack(uraniumRedstoneShovel), recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.uraniumRod );
		}

		if (PHInfiTools.enableObsidianTools)
		{
			GameRegistry.addRecipe(new ItemStack(woodObsidianShovel), recipe, '#', Block.obsidian, '|', Item.stick );
			GameRegistry.addRecipe(new ItemStack(stoneObsidianShovel), recipe, '#', Block.obsidian, '|', InfiLibrary.stoneRod );
			GameRegistry.addRecipe(new ItemStack(redstoneObsidianShovel), recipe, '#', Block.obsidian, '|', InfiLibrary.redstoneRod );
			GameRegistry.addRecipe(new ItemStack(obsidianObsidianShovel), recipe, '#', Block.obsidian, '|', InfiLibrary.obsidianRod );
			GameRegistry.addRecipe(new ItemStack(boneObsidianShovel), recipe, '#', Block.obsidian, '|', Item.bone );
			GameRegistry.addRecipe(new ItemStack(boneObsidianShovel), recipe, '#', Block.obsidian, '|', InfiLibrary.boneRod );
			GameRegistry.addRecipe(new ItemStack(netherrackObsidianShovel), recipe, '#', Block.obsidian, '|', InfiLibrary.netherrackRod );
			GameRegistry.addRecipe(new ItemStack(glowstoneObsidianShovel), recipe, '#', Block.obsidian, '|', InfiLibrary.glowstoneRod );
			GameRegistry.addRecipe(new ItemStack(iceObsidianShovel), recipe, '#', Block.obsidian, '|', InfiLibrary.iceRod );
			GameRegistry.addRecipe(new ItemStack(lavaObsidianShovel), recipe, '#', Block.obsidian, '|', InfiLibrary.lavaRod );
			GameRegistry.addRecipe(new ItemStack(cactusObsidianShovel), recipe, '#', Block.obsidian, '|', InfiLibrary.cactusRod );
		}

		if (PHInfiTools.enableSandstoneTools)
		{
			GameRegistry.addRecipe(new ItemStack(woodSandstoneShovel), recipe, '#', Block.sandStone, '|', Item.stick );
			GameRegistry.addRecipe(new ItemStack(sandstoneSandstoneShovel), recipe, '#', Block.sandStone, '|', InfiLibrary.sandstoneRod );
			GameRegistry.addRecipe(new ItemStack(boneSandstoneShovel), recipe, '#', Block.sandStone, '|', Item.bone );
			GameRegistry.addRecipe(new ItemStack(boneSandstoneShovel), recipe, '#', Block.sandStone, '|', InfiLibrary.boneRod );
			GameRegistry.addRecipe(new ItemStack(netherrackSandstoneShovel), recipe, '#', Block.sandStone, '|', InfiLibrary.netherrackRod );
			GameRegistry.addRecipe(new ItemStack(iceSandstoneShovel), recipe, '#', Block.sandStone, '|', InfiLibrary.iceRod );
			GameRegistry.addRecipe(new ItemStack(slimeSandstoneShovel), recipe, '#', Block.sandStone, '|', InfiLibrary.slimeRod );
			GameRegistry.addRecipe(new ItemStack(cactusSandstoneShovel), recipe, '#', Block.sandStone, '|', InfiLibrary.cactusRod );
			GameRegistry.addRecipe(new ItemStack(flintSandstoneShovel), recipe, '#', Block.sandStone, '|', InfiLibrary.flintRod );
		}

		if (PHInfiTools.enableBoneTools)
		{
			GameRegistry.addRecipe(new ItemStack(woodBoneShovel), recipe, '#', Item.bone, '|', Item.stick );
			GameRegistry.addRecipe(new ItemStack(stoneBoneShovel), recipe, '#', Item.bone, '|', InfiLibrary.stoneRod );
			GameRegistry.addRecipe(new ItemStack(sandstoneBoneShovel), recipe, '#', Item.bone, '|', InfiLibrary.sandstoneRod );
			GameRegistry.addRecipe(new ItemStack(boneBoneShovel), recipe, '#', Item.bone, '|', Item.bone );
			GameRegistry.addRecipe(new ItemStack(boneBoneShovel), recipe, '#', Item.bone, '|', InfiLibrary.boneRod );
			GameRegistry.addRecipe(new ItemStack(paperBoneShovel), recipe, '#', Item.bone, '|', InfiLibrary.paperRod );
			GameRegistry.addRecipe(new ItemStack(netherrackBoneShovel), recipe, '#', Item.bone, '|', InfiLibrary.netherrackRod );
			GameRegistry.addRecipe(new ItemStack(iceBoneShovel), recipe, '#', Item.bone, '|', InfiLibrary.iceRod );
			GameRegistry.addRecipe(new ItemStack(cactusBoneShovel), recipe, '#', Item.bone, '|', InfiLibrary.cactusRod );
			GameRegistry.addRecipe(new ItemStack(flintBoneShovel), recipe, '#', Item.bone, '|', InfiLibrary.flintRod );
		}

		if (PHInfiTools.enablePaperTools)
		{
			GameRegistry.addRecipe(new ItemStack(woodPaperShovel), recipe, '#', InfiLibrary.paperStack, '|', Item.stick );
			GameRegistry.addRecipe(new ItemStack(bonePaperShovel), recipe, '#', InfiLibrary.paperStack, '|', Item.bone );
			GameRegistry.addRecipe(new ItemStack(bonePaperShovel), recipe, '#', InfiLibrary.paperStack, '|', InfiLibrary.boneRod );
			GameRegistry.addRecipe(new ItemStack(paperPaperShovel), recipe, '#', InfiLibrary.paperStack, '|', InfiLibrary.paperRod );
			GameRegistry.addRecipe(new ItemStack(slimePaperShovel), recipe, '#', InfiLibrary.paperStack, '|', InfiLibrary.slimeRod );
			GameRegistry.addRecipe(new ItemStack(cactusPaperShovel), recipe, '#', InfiLibrary.paperStack, '|', InfiLibrary.cactusRod );
		}

		if (PHInfiTools.enableMossyTools)
		{
			GameRegistry.addRecipe(new ItemStack(woodMossyShovel), recipe, '#', InfiLibrary.mossyStone, '|', Item.stick );
			GameRegistry.addRecipe(new ItemStack(stoneMossyShovel), recipe, '#', InfiLibrary.mossyStone, '|', InfiLibrary.stoneRod );
			GameRegistry.addRecipe(new ItemStack(diamondMossyShovel), recipe, '#', InfiLibrary.mossyStone, '|', InfiLibrary.diamondRod );
			GameRegistry.addRecipe(new ItemStack(redstoneMossyShovel), recipe, '#', InfiLibrary.mossyStone, '|', InfiLibrary.redstoneRod );
			GameRegistry.addRecipe(new ItemStack(boneMossyShovel), recipe, '#', InfiLibrary.mossyStone, '|', Item.bone );
			GameRegistry.addRecipe(new ItemStack(boneMossyShovel), recipe, '#', InfiLibrary.mossyStone, '|', InfiLibrary.boneRod );
			GameRegistry.addRecipe(new ItemStack(mossyMossyShovel), recipe, '#', InfiLibrary.mossyStone, '|', InfiLibrary.mossyRod );
			GameRegistry.addRecipe(new ItemStack(netherrackMossyShovel), recipe, '#', InfiLibrary.mossyStone, '|', InfiLibrary.netherrackRod );
			GameRegistry.addRecipe(new ItemStack(glowstoneMossyShovel), recipe, '#', InfiLibrary.mossyStone, '|', InfiLibrary.glowstoneRod );
			GameRegistry.addRecipe(new ItemStack(cactusMossyShovel), recipe, '#', InfiLibrary.mossyStone, '|', InfiLibrary.cactusRod );
			GameRegistry.addRecipe(new ItemStack(blazeMossyShovel), recipe, '#', InfiLibrary.mossyStone, '|', Item.blazeRod );
			GameRegistry.addRecipe(new ItemStack(manyullynMossyShovel), recipe, '#', InfiLibrary.mossyStone, '|', InfiLibrary.manyullynRod );
			GameRegistry.addRecipe(new ItemStack(uraniumMossyShovel), recipe, '#', InfiLibrary.mossyStone, '|', InfiLibrary.uraniumRod );
		}

		if (PHInfiTools.enableNetherrackTools)
		{
			GameRegistry.addRecipe(new ItemStack(woodNetherrackShovel), recipe, '#', Block.netherrack, '|', Item.stick );
			GameRegistry.addRecipe(new ItemStack(stoneNetherrackShovel), recipe, '#', Block.netherrack, '|', InfiLibrary.stoneRod );
			GameRegistry.addRecipe(new ItemStack(sandstoneNetherrackShovel), recipe, '#', Block.netherrack, '|', InfiLibrary.sandstoneRod );
			GameRegistry.addRecipe(new ItemStack(boneNetherrackShovel), recipe, '#', Block.netherrack, '|', Item.bone );
			GameRegistry.addRecipe(new ItemStack(boneNetherrackShovel), recipe, '#', Block.netherrack, '|', InfiLibrary.boneRod );
			GameRegistry.addRecipe(new ItemStack(paperNetherrackShovel), recipe, '#', Block.netherrack, '|', InfiLibrary.paperRod );
			GameRegistry.addRecipe(new ItemStack(mossyNetherrackShovel), recipe, '#', Block.netherrack, '|', InfiLibrary.mossyRod );
			GameRegistry.addRecipe(new ItemStack(netherrackNetherrackShovel), recipe, '#', Block.netherrack, '|', InfiLibrary.netherrackRod );
			GameRegistry.addRecipe(new ItemStack(iceNetherrackShovel), recipe, '#', Block.netherrack, '|', InfiLibrary.iceRod );
			GameRegistry.addRecipe(new ItemStack(slimeNetherrackShovel), recipe, '#', Block.netherrack, '|', InfiLibrary.slimeRod );
			GameRegistry.addRecipe(new ItemStack(cactusNetherrackShovel), recipe, '#', Block.netherrack, '|', InfiLibrary.cactusRod );
			GameRegistry.addRecipe(new ItemStack(flintNetherrackShovel), recipe, '#', Block.netherrack, '|', InfiLibrary.flintRod );
			GameRegistry.addRecipe(new ItemStack(copperNetherrackShovel), recipe, '#', Block.netherrack, '|', InfiLibrary.copperRod );
			GameRegistry.addRecipe(new ItemStack(bronzeNetherrackShovel), recipe, '#', Block.netherrack, '|', InfiLibrary.bronzeRod );
		}

		if (PHInfiTools.enableGlowstoneTools)
		{
			GameRegistry.addRecipe(new ItemStack(woodGlowstoneShovel), recipe, '#', InfiLibrary.glowstoneCrystal, '|', Item.stick );
			GameRegistry.addRecipe(new ItemStack(redstoneGlowstoneShovel), recipe, '#', InfiLibrary.glowstoneCrystal, '|', InfiLibrary.redstoneRod );
			GameRegistry.addRecipe(new ItemStack(obsidianGlowstoneShovel), recipe, '#', InfiLibrary.glowstoneCrystal, '|', InfiLibrary.obsidianRod );
			GameRegistry.addRecipe(new ItemStack(boneGlowstoneShovel), recipe, '#', InfiLibrary.glowstoneCrystal, '|', Item.bone );
			GameRegistry.addRecipe(new ItemStack(boneGlowstoneShovel), recipe, '#', InfiLibrary.glowstoneCrystal, '|', InfiLibrary.boneRod );
			GameRegistry.addRecipe(new ItemStack(netherrackGlowstoneShovel), recipe, '#', InfiLibrary.glowstoneCrystal, '|', InfiLibrary.netherrackRod );
			GameRegistry.addRecipe(new ItemStack(glowstoneGlowstoneShovel), recipe, '#', InfiLibrary.glowstoneCrystal, '|', InfiLibrary.glowstoneRod );
			GameRegistry.addRecipe(new ItemStack(iceGlowstoneShovel), recipe, '#', InfiLibrary.glowstoneCrystal, '|', InfiLibrary.iceRod );
			GameRegistry.addRecipe(new ItemStack(slimeGlowstoneShovel), recipe, '#', InfiLibrary.glowstoneCrystal, '|', InfiLibrary.slimeRod );
			GameRegistry.addRecipe(new ItemStack(cactusGlowstoneShovel), recipe, '#', InfiLibrary.glowstoneCrystal, '|', InfiLibrary.cactusRod );
		}

		if (PHInfiTools.enableIceTools)
		{
			GameRegistry.addRecipe(new ItemStack(woodIceShovel), recipe, '#', Block.ice, '|', Item.stick );
			GameRegistry.addRecipe(new ItemStack(boneIceShovel), recipe, '#', Block.ice, '|', Item.bone );
			GameRegistry.addRecipe(new ItemStack(boneIceShovel), recipe, '#', Block.ice, '|', InfiLibrary.boneRod );
			GameRegistry.addRecipe(new ItemStack(paperIceShovel), recipe, '#', Block.ice, '|', InfiLibrary.paperRod );
			GameRegistry.addRecipe(new ItemStack(iceIceShovel), recipe, '#', Block.ice, '|', InfiLibrary.iceRod );
			GameRegistry.addRecipe(new ItemStack(slimeIceShovel), recipe, '#', Block.ice, '|', InfiLibrary.slimeRod );
			GameRegistry.addRecipe(new ItemStack(cactusIceShovel), recipe, '#', Block.ice, '|', InfiLibrary.cactusRod );
		}

		if (PHInfiTools.enableLavaTools)
		{
			GameRegistry.addRecipe(new ItemStack(diamondLavaShovel), recipe, '#', InfiLibrary.lavaCrystal, '|', InfiLibrary.diamondRod );
			GameRegistry.addRecipe(new ItemStack(obsidianLavaShovel), recipe, '#', InfiLibrary.lavaCrystal, '|', InfiLibrary.obsidianRod );
			GameRegistry.addRecipe(new ItemStack(netherrackLavaShovel), recipe, '#', InfiLibrary.lavaCrystal, '|', InfiLibrary.netherrackRod );
			GameRegistry.addRecipe(new ItemStack(lavaLavaShovel), recipe, '#', InfiLibrary.lavaCrystal, '|', InfiLibrary.lavaRod );
			GameRegistry.addRecipe(new ItemStack(flintLavaShovel), recipe, '#', InfiLibrary.lavaCrystal, '|', InfiLibrary.flintRod );
			GameRegistry.addRecipe(new ItemStack(blazeLavaShovel), recipe, '#', InfiLibrary.lavaCrystal, '|', Item.blazeRod );
			GameRegistry.addRecipe(new ItemStack(manyullynLavaShovel), recipe, '#', InfiLibrary.lavaCrystal, '|', InfiLibrary.manyullynRod );
			GameRegistry.addRecipe(new ItemStack(uraniumLavaShovel), recipe, '#', InfiLibrary.lavaCrystal, '|', InfiLibrary.uraniumRod );
		}

		if (PHInfiTools.enableSlimeTools)
		{
			GameRegistry.addRecipe(new ItemStack(woodSlimeShovel), recipe, '#', InfiLibrary.slimeCrystal, '|', Item.stick );
			GameRegistry.addRecipe(new ItemStack(sandstoneSlimeShovel), recipe, '#', InfiLibrary.slimeCrystal, '|', InfiLibrary.sandstoneRod );
			GameRegistry.addRecipe(new ItemStack(boneSlimeShovel), recipe, '#', InfiLibrary.slimeCrystal, '|', Item.bone );
			GameRegistry.addRecipe(new ItemStack(boneSlimeShovel), recipe, '#', InfiLibrary.slimeCrystal, '|', InfiLibrary.boneRod );
			GameRegistry.addRecipe(new ItemStack(paperSlimeShovel), recipe, '#', InfiLibrary.slimeCrystal, '|', InfiLibrary.paperRod );
			GameRegistry.addRecipe(new ItemStack(slimeSlimeShovel), recipe, '#', InfiLibrary.slimeCrystal, '|', InfiLibrary.slimeRod );
			GameRegistry.addRecipe(new ItemStack(cactusSlimeShovel), recipe, '#', InfiLibrary.slimeCrystal, '|', InfiLibrary.cactusRod );
		}

		if (PHInfiTools.enableCactusTools)
		{
			GameRegistry.addRecipe(new ItemStack(woodCactusShovel), recipe, '#', Block.cactus, '|', Item.stick );
			GameRegistry.addRecipe(new ItemStack(sandstoneCactusShovel), recipe, '#', Block.cactus, '|', InfiLibrary.sandstoneRod );
			GameRegistry.addRecipe(new ItemStack(boneCactusShovel), recipe, '#', Block.cactus, '|', Item.bone );
			GameRegistry.addRecipe(new ItemStack(boneCactusShovel), recipe, '#', Block.cactus, '|', InfiLibrary.boneRod );
			GameRegistry.addRecipe(new ItemStack(netherrackCactusShovel), recipe, '#', Block.cactus, '|', InfiLibrary.netherrackRod );
			GameRegistry.addRecipe(new ItemStack(iceCactusShovel), recipe, '#', Block.cactus, '|', InfiLibrary.iceRod );
			GameRegistry.addRecipe(new ItemStack(slimeCactusShovel), recipe, '#', Block.cactus, '|', InfiLibrary.slimeRod );
			GameRegistry.addRecipe(new ItemStack(cactusCactusShovel), recipe, '#', Block.cactus, '|', InfiLibrary.cactusRod );
		}

		if (PHInfiTools.enableFlintTools)
		{
			GameRegistry.addRecipe(new ItemStack(woodFlintShovel), recipe, '#', Item.flint, '|', Item.stick );
			GameRegistry.addRecipe(new ItemStack(stoneFlintShovel), recipe, '#', Item.flint, '|', InfiLibrary.stoneRod );
			GameRegistry.addRecipe(new ItemStack(sandstoneFlintShovel), recipe, '#', Item.flint, '|', InfiLibrary.sandstoneRod );
			GameRegistry.addRecipe(new ItemStack(boneFlintShovel), recipe, '#', Item.flint, '|', Item.bone );
			GameRegistry.addRecipe(new ItemStack(boneFlintShovel), recipe, '#', Item.flint, '|', InfiLibrary.boneRod );
			GameRegistry.addRecipe(new ItemStack(netherrackFlintShovel), recipe, '#', Item.flint, '|', InfiLibrary.netherrackRod );
			GameRegistry.addRecipe(new ItemStack(slimeFlintShovel), recipe, '#', Item.flint, '|', InfiLibrary.slimeRod );
			GameRegistry.addRecipe(new ItemStack(cactusFlintShovel), recipe, '#', Item.flint, '|', InfiLibrary.cactusRod );
			GameRegistry.addRecipe(new ItemStack(flintFlintShovel), recipe, '#', Item.flint, '|', InfiLibrary.flintRod );
			GameRegistry.addRecipe(new ItemStack(copperFlintShovel), recipe, '#', Item.flint, '|', InfiLibrary.copperRod );
			GameRegistry.addRecipe(new ItemStack(bronzeFlintShovel), recipe, '#', Item.flint, '|', InfiLibrary.bronzeRod );
		}

		if (PHInfiTools.enableBlazeTools)
		{
			GameRegistry.addRecipe(new ItemStack(diamondBlazeShovel), recipe, '#', InfiLibrary.blazeCrystal, '|', InfiLibrary.diamondRod );
			GameRegistry.addRecipe(new ItemStack(obsidianBlazeShovel), recipe, '#', InfiLibrary.blazeCrystal, '|', InfiLibrary.obsidianRod );
			GameRegistry.addRecipe(new ItemStack(netherrackBlazeShovel), recipe, '#', InfiLibrary.blazeCrystal, '|', InfiLibrary.netherrackRod );
			GameRegistry.addRecipe(new ItemStack(lavaBlazeShovel), recipe, '#', InfiLibrary.blazeCrystal, '|', InfiLibrary.lavaRod );
			GameRegistry.addRecipe(new ItemStack(flintBlazeShovel), recipe, '#', InfiLibrary.blazeCrystal, '|', InfiLibrary.flintRod );
			GameRegistry.addRecipe(new ItemStack(blazeBlazeShovel), recipe, '#', InfiLibrary.blazeCrystal, '|', Item.blazeRod );
			GameRegistry.addRecipe(new ItemStack(manyullynBlazeShovel), recipe, '#', InfiLibrary.blazeCrystal, '|', InfiLibrary.manyullynRod );
			GameRegistry.addRecipe(new ItemStack(uraniumBlazeShovel), recipe, '#', InfiLibrary.blazeCrystal, '|', InfiLibrary.uraniumRod );
		}
	}

	public static void addStoneTools(String stack)
	{
		//GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(woodStoneShovel), recipe, '#', stack, '|', Item.stick ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(stoneStoneShovel), recipe, '#', stack, '|', InfiLibrary.stoneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(sandstoneStoneShovel), recipe, '#', stack, '|', InfiLibrary.sandstoneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(boneStoneShovel), recipe, '#', stack, '|', Item.bone ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(boneStoneShovel), recipe, '#', stack, '|', InfiLibrary.boneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(netherrackStoneShovel), recipe, '#', stack, '|', InfiLibrary.netherrackRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(iceStoneShovel), recipe, '#', stack, '|', InfiLibrary.iceRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(slimeStoneShovel), recipe, '#', stack, '|', InfiLibrary.slimeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(cactusStoneShovel), recipe, '#', stack, '|', InfiLibrary.cactusRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(flintStoneShovel), recipe, '#', stack, '|', InfiLibrary.flintRod ) );
	}

	public static void addCopperTools(String stack)
	{
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(woodCopperShovel), recipe, '#', stack, '|', Item.stick ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(stoneCopperShovel), recipe, '#', stack, '|', InfiLibrary.stoneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(boneCopperShovel), recipe, '#', stack, '|', Item.bone ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(boneCopperShovel), recipe, '#', stack, '|', InfiLibrary.boneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(netherrackCopperShovel), recipe, '#', stack, '|', InfiLibrary.netherrackRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(slimeCopperShovel), recipe, '#', stack, '|', InfiLibrary.slimeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(cactusCopperShovel), recipe, '#', stack, '|', InfiLibrary.cactusRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(flintCopperShovel), recipe, '#', stack, '|', InfiLibrary.flintRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(copperCopperShovel), recipe, '#', stack, '|', InfiLibrary.copperRod ) );
	}

	public static void addBronzeTools(String stack)
	{
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(woodBronzeShovel), recipe, '#', stack, '|', Item.stick ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(stoneBronzeShovel), recipe, '#', stack, '|', InfiLibrary.stoneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(boneBronzeShovel), recipe, '#', stack, '|', Item.bone ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(boneBronzeShovel), recipe, '#', stack, '|', InfiLibrary.boneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(netherrackBronzeShovel), recipe, '#', stack, '|', InfiLibrary.netherrackRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(slimeBronzeShovel), recipe, '#', stack, '|', InfiLibrary.slimeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(cactusBronzeShovel), recipe, '#', stack, '|', InfiLibrary.cactusRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(flintBronzeShovel), recipe, '#', stack, '|', InfiLibrary.flintRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(copperBronzeShovel), recipe, '#', stack, '|', InfiLibrary.copperRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(bronzeBronzeShovel), recipe, '#', stack, '|', InfiLibrary.bronzeRod ) );
	}

	public static void addWorkedIronTools(String stack)
	{
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(woodWorkedIronShovel), recipe, '#', stack, '|', Item.stick ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(stoneWorkedIronShovel), recipe, '#', stack, '|', InfiLibrary.stoneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(ironWorkedIronShovel), recipe, '#', stack, '|', InfiLibrary.ironRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(diamondWorkedIronShovel), recipe, '#', stack, '|', InfiLibrary.diamondRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(redstoneWorkedIronShovel), recipe, '#', stack, '|', InfiLibrary.redstoneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(obsidianWorkedIronShovel), recipe, '#', stack, '|', InfiLibrary.obsidianRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(boneWorkedIronShovel), recipe, '#', stack, '|', Item.bone ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(boneWorkedIronShovel), recipe, '#', stack, '|', InfiLibrary.boneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(netherrackWorkedIronShovel), recipe, '#', stack, '|', InfiLibrary.netherrackRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(glowstoneWorkedIronShovel), recipe, '#', stack, '|', InfiLibrary.glowstoneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(iceWorkedIronShovel), recipe, '#', stack, '|', InfiLibrary.iceRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(slimeWorkedIronShovel), recipe, '#', stack, '|', InfiLibrary.slimeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(cactusWorkedIronShovel), recipe, '#', stack, '|', InfiLibrary.cactusRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(blazeWorkedIronShovel), recipe, '#', stack, '|', Item.blazeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(copperWorkedIronShovel), recipe, '#', stack, '|', InfiLibrary.copperRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(bronzeWorkedIronShovel), recipe, '#', stack, '|', InfiLibrary.bronzeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(workedWorkedIronShovel), recipe, '#', stack, '|', InfiLibrary.workedIronRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(steelWorkedIronShovel), recipe, '#', stack, '|', InfiLibrary.steelRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(uraniumWorkedIronShovel), recipe, '#', stack, '|', InfiLibrary.uraniumRod ) );
	}

	public static void addSteelTools(String stack)
	{
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(woodSteelShovel), recipe, '#', stack, '|', Item.stick ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(stoneSteelShovel), recipe, '#', stack, '|', InfiLibrary.stoneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(ironSteelShovel), recipe, '#', stack, '|', InfiLibrary.ironRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(diamondSteelShovel), recipe, '#', stack, '|', InfiLibrary.diamondRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(redstoneSteelShovel), recipe, '#', stack, '|', InfiLibrary.redstoneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(obsidianSteelShovel), recipe, '#', stack, '|', InfiLibrary.obsidianRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(boneSteelShovel), recipe, '#', stack, '|', Item.bone ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(boneSteelShovel), recipe, '#', stack, '|', InfiLibrary.boneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(netherrackSteelShovel), recipe, '#', stack, '|', InfiLibrary.netherrackRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(glowstoneSteelShovel), recipe, '#', stack, '|', InfiLibrary.glowstoneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(iceSteelShovel), recipe, '#', stack, '|', InfiLibrary.iceRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(slimeSteelShovel), recipe, '#', stack, '|', InfiLibrary.slimeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(cactusSteelShovel), recipe, '#', stack, '|', InfiLibrary.cactusRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(blazeSteelShovel), recipe, '#', stack, '|', Item.blazeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(copperSteelShovel), recipe, '#', stack, '|', InfiLibrary.copperRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(bronzeSteelShovel), recipe, '#', stack, '|', InfiLibrary.bronzeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(workedSteelShovel), recipe, '#', stack, '|', InfiLibrary.workedIronRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(steelSteelShovel), recipe, '#', stack, '|', InfiLibrary.steelRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(cobaltSteelShovel), recipe, '#', stack, '|', InfiLibrary.cobaltRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(arditeSteelShovel), recipe, '#', stack, '|', InfiLibrary.arditeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(uraniumSteelShovel), recipe, '#', stack, '|', InfiLibrary.uraniumRod ) );
	}

	public static void addCobaltTools(String stack)
	{
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(woodCobaltShovel), recipe, '#', stack, '|', Item.stick ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(stoneCobaltShovel), recipe, '#', stack, '|', InfiLibrary.stoneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(ironCobaltShovel), recipe, '#', stack, '|', InfiLibrary.ironRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(diamondCobaltShovel), recipe, '#', stack, '|', InfiLibrary.diamondRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(redstoneCobaltShovel), recipe, '#', stack, '|', InfiLibrary.redstoneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(obsidianCobaltShovel), recipe, '#', stack, '|', InfiLibrary.obsidianRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(boneCobaltShovel), recipe, '#', stack, '|', Item.bone ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(boneCobaltShovel), recipe, '#', stack, '|', InfiLibrary.boneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(slimeCobaltShovel), recipe, '#', stack, '|', InfiLibrary.slimeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(cactusCobaltShovel), recipe, '#', stack, '|', InfiLibrary.cactusRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(blazeCobaltShovel), recipe, '#', stack, '|', Item.blazeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(copperCobaltShovel), recipe, '#', stack, '|', InfiLibrary.copperRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(bronzeCobaltShovel), recipe, '#', stack, '|', InfiLibrary.bronzeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(workedCobaltShovel), recipe, '#', stack, '|', InfiLibrary.workedIronRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(steelCobaltShovel), recipe, '#', stack, '|', InfiLibrary.steelRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(cobaltCobaltShovel), recipe, '#', stack, '|', InfiLibrary.cobaltRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(arditeCobaltShovel), recipe, '#', stack, '|', InfiLibrary.arditeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(manyullynCobaltShovel), recipe, '#', stack, '|', InfiLibrary.manyullynRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(uraniumCobaltShovel), recipe, '#', stack, '|', InfiLibrary.uraniumRod ) );
	}

	public static void addArditeTools(String stack)
	{
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(woodArditeShovel), recipe, '#', stack, '|', Item.stick ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(stoneArditeShovel), recipe, '#', stack, '|', InfiLibrary.stoneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(ironArditeShovel), recipe, '#', stack, '|', InfiLibrary.ironRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(diamondArditeShovel), recipe, '#', stack, '|', InfiLibrary.diamondRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(redstoneArditeShovel), recipe, '#', stack, '|', InfiLibrary.redstoneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(obsidianArditeShovel), recipe, '#', stack, '|', InfiLibrary.obsidianRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(boneArditeShovel), recipe, '#', stack, '|', Item.bone ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(boneArditeShovel), recipe, '#', stack, '|', InfiLibrary.boneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(slimeArditeShovel), recipe, '#', stack, '|', InfiLibrary.slimeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(cactusArditeShovel), recipe, '#', stack, '|', InfiLibrary.cactusRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(blazeArditeShovel), recipe, '#', stack, '|', Item.blazeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(copperArditeShovel), recipe, '#', stack, '|', InfiLibrary.copperRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(bronzeArditeShovel), recipe, '#', stack, '|', InfiLibrary.bronzeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(workedArditeShovel), recipe, '#', stack, '|', InfiLibrary.workedIronRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(steelArditeShovel), recipe, '#', stack, '|', InfiLibrary.steelRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(cobaltArditeShovel), recipe, '#', stack, '|', InfiLibrary.cobaltRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(arditeArditeShovel), recipe, '#', stack, '|', InfiLibrary.arditeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(manyullynArditeShovel), recipe, '#', stack, '|', InfiLibrary.manyullynRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(uraniumArditeShovel), recipe, '#', stack, '|', InfiLibrary.uraniumRod ) );
	}

	public static void addManyullynTools(String stack)
	{
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(woodManyullynShovel), recipe, '#', stack, '|', Item.stick ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(stoneManyullynShovel), recipe, '#', stack, '|', InfiLibrary.stoneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(ironManyullynShovel), recipe, '#', stack, '|', InfiLibrary.ironRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(diamondManyullynShovel), recipe, '#', stack, '|', InfiLibrary.diamondRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(redstoneManyullynShovel), recipe, '#', stack, '|', InfiLibrary.redstoneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(obsidianManyullynShovel), recipe, '#', stack, '|', InfiLibrary.obsidianRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(boneManyullynShovel), recipe, '#', stack, '|', Item.bone ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(boneManyullynShovel), recipe, '#', stack, '|', InfiLibrary.boneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(slimeManyullynShovel), recipe, '#', stack, '|', InfiLibrary.slimeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(cactusManyullynShovel), recipe, '#', stack, '|', InfiLibrary.cactusRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(blazeManyullynShovel), recipe, '#', stack, '|', Item.blazeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(copperManyullynShovel), recipe, '#', stack, '|', InfiLibrary.copperRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(bronzeManyullynShovel), recipe, '#', stack, '|', InfiLibrary.bronzeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(workedManyullynShovel), recipe, '#', stack, '|', InfiLibrary.workedIronRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(steelManyullynShovel), recipe, '#', stack, '|', InfiLibrary.steelRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(cobaltManyullynShovel), recipe, '#', stack, '|', InfiLibrary.cobaltRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(arditeManyullynShovel), recipe, '#', stack, '|', InfiLibrary.arditeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(manyullynManyullynShovel), recipe, '#', stack, '|', InfiLibrary.manyullynRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(uraniumManyullynShovel), recipe, '#', stack, '|', InfiLibrary.uraniumRod ) );
	}

	public static void addUraniumTools(String stack)
	{
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(diamondUraniumShovel), recipe, '#', stack, '|', InfiLibrary.diamondRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(redstoneUraniumShovel), recipe, '#', stack, '|', InfiLibrary.redstoneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(boneUraniumShovel), recipe, '#', stack, '|', Item.bone ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(boneUraniumShovel), recipe, '#', stack, '|', InfiLibrary.boneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(netherrackUraniumShovel), recipe, '#', stack, '|', InfiLibrary.netherrackRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(glowstoneUraniumShovel), recipe, '#', stack, '|', InfiLibrary.glowstoneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(lavaUraniumShovel), recipe, '#', stack, '|', InfiLibrary.lavaRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(blazeUraniumShovel), recipe, '#', stack, '|', Item.blazeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(cobaltUraniumShovel), recipe, '#', stack, '|', InfiLibrary.cobaltRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(arditeUraniumShovel), recipe, '#', stack, '|', InfiLibrary.arditeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(uraniumUraniumShovel), recipe, '#', stack, '|', InfiLibrary.uraniumRod ) );
	}

	public static Item woodWoodShovel;
	public static Item sandstoneWoodShovel;
	public static Item boneWoodShovel;
	public static Item paperWoodShovel;
	public static Item iceWoodShovel;
	public static Item slimeWoodShovel;
	public static Item cactusWoodShovel;

	public static Item woodStoneShovel;
	public static Item stoneStoneShovel;
	public static Item sandstoneStoneShovel;
	public static Item boneStoneShovel;
	public static Item netherrackStoneShovel;
	public static Item iceStoneShovel;
	public static Item slimeStoneShovel;
	public static Item cactusStoneShovel;
	public static Item flintStoneShovel;

	public static Item woodIronShovel;
	public static Item stoneIronShovel;
	public static Item ironIronShovel;
	public static Item boneIronShovel;
	public static Item netherrackIronShovel;
	public static Item glowstoneIronShovel;
	public static Item cactusIronShovel;
	public static Item copperIronShovel;
	public static Item bronzeIronShovel;

	public static Item woodDiamondShovel;
	public static Item stoneDiamondShovel;
	public static Item ironDiamondShovel;
	public static Item diamondDiamondShovel;
	public static Item redstoneDiamondShovel;
	public static Item obsidianDiamondShovel;
	public static Item boneDiamondShovel;
	public static Item mossyDiamondShovel;
	public static Item netherrackDiamondShovel;
	public static Item glowstoneDiamondShovel;
	public static Item lavaDiamondShovel;
	public static Item cactusDiamondShovel;
	public static Item flintDiamondShovel;
	public static Item blazeDiamondShovel;
	public static Item copperDiamondShovel;
	public static Item bronzeDiamondShovel;
	public static Item workedDiamondShovel;
	public static Item steelDiamondShovel;
	public static Item cobaltDiamondShovel;
	public static Item arditeDiamondShovel;
	public static Item manyullynDiamondShovel;
	public static Item uraniumDiamondShovel;

	public static Item woodRedstoneShovel;
	public static Item stoneRedstoneShovel;
	public static Item ironRedstoneShovel;
	public static Item redstoneRedstoneShovel;
	public static Item obsidianRedstoneShovel;
	public static Item sandstoneRedstoneShovel;
	public static Item boneRedstoneShovel;
	public static Item paperRedstoneShovel;
	public static Item mossyRedstoneShovel;
	public static Item netherrackRedstoneShovel;
	public static Item glowstoneRedstoneShovel;
	public static Item iceRedstoneShovel;
	public static Item lavaRedstoneShovel;
	public static Item slimeRedstoneShovel;
	public static Item cactusRedstoneShovel;
	public static Item flintRedstoneShovel;
	public static Item copperRedstoneShovel;
	public static Item bronzeRedstoneShovel;
	public static Item workedRedstoneShovel;
	public static Item uraniumRedstoneShovel;

	public static Item woodObsidianShovel;
	public static Item stoneObsidianShovel;
	public static Item redstoneObsidianShovel;
	public static Item obsidianObsidianShovel;
	public static Item boneObsidianShovel;
	public static Item netherrackObsidianShovel;
	public static Item glowstoneObsidianShovel;
	public static Item iceObsidianShovel;
	public static Item lavaObsidianShovel;
	public static Item cactusObsidianShovel;

	public static Item woodSandstoneShovel;
	public static Item sandstoneSandstoneShovel;
	public static Item boneSandstoneShovel;
	public static Item netherrackSandstoneShovel;
	public static Item iceSandstoneShovel;
	public static Item slimeSandstoneShovel;
	public static Item cactusSandstoneShovel;
	public static Item flintSandstoneShovel;

	public static Item woodBoneShovel;
	public static Item stoneBoneShovel;
	public static Item sandstoneBoneShovel;
	public static Item boneBoneShovel;
	public static Item paperBoneShovel;
	public static Item netherrackBoneShovel;
	public static Item iceBoneShovel;
	public static Item cactusBoneShovel;
	public static Item flintBoneShovel;

	public static Item woodPaperShovel;
	public static Item bonePaperShovel;
	public static Item paperPaperShovel;
	public static Item slimePaperShovel;
	public static Item cactusPaperShovel;

	public static Item woodMossyShovel;
	public static Item stoneMossyShovel;
	public static Item diamondMossyShovel;
	public static Item redstoneMossyShovel;
	public static Item boneMossyShovel;
	public static Item mossyMossyShovel;
	public static Item netherrackMossyShovel;
	public static Item glowstoneMossyShovel;
	public static Item cactusMossyShovel;
	public static Item blazeMossyShovel;
	public static Item manyullynMossyShovel;
	public static Item uraniumMossyShovel;

	public static Item woodNetherrackShovel;
	public static Item stoneNetherrackShovel;
	public static Item sandstoneNetherrackShovel;
	public static Item boneNetherrackShovel;
	public static Item paperNetherrackShovel;
	public static Item mossyNetherrackShovel;
	public static Item netherrackNetherrackShovel;
	public static Item iceNetherrackShovel;
	public static Item slimeNetherrackShovel;
	public static Item cactusNetherrackShovel;
	public static Item flintNetherrackShovel;
	public static Item copperNetherrackShovel;
	public static Item bronzeNetherrackShovel;

	public static Item woodGlowstoneShovel;
	public static Item redstoneGlowstoneShovel;
	public static Item obsidianGlowstoneShovel;
	public static Item boneGlowstoneShovel;
	public static Item netherrackGlowstoneShovel;
	public static Item glowstoneGlowstoneShovel;
	public static Item iceGlowstoneShovel;
	public static Item slimeGlowstoneShovel;
	public static Item cactusGlowstoneShovel;

	public static Item woodIceShovel;
	public static Item boneIceShovel;
	public static Item paperIceShovel;
	public static Item iceIceShovel;
	public static Item slimeIceShovel;
	public static Item cactusIceShovel;

	public static Item diamondLavaShovel;
	public static Item obsidianLavaShovel;
	public static Item netherrackLavaShovel;
	public static Item lavaLavaShovel;
	public static Item flintLavaShovel;
	public static Item blazeLavaShovel;
	public static Item manyullynLavaShovel;
	public static Item uraniumLavaShovel;

	public static Item woodSlimeShovel;
	public static Item sandstoneSlimeShovel;
	public static Item boneSlimeShovel;
	public static Item paperSlimeShovel;
	public static Item slimeSlimeShovel;
	public static Item cactusSlimeShovel;

	public static Item woodCactusShovel;
	public static Item sandstoneCactusShovel;
	public static Item boneCactusShovel;
	public static Item netherrackCactusShovel;
	public static Item iceCactusShovel;
	public static Item slimeCactusShovel;
	public static Item cactusCactusShovel;

	public static Item woodFlintShovel;
	public static Item stoneFlintShovel;
	public static Item sandstoneFlintShovel;
	public static Item boneFlintShovel;
	public static Item netherrackFlintShovel;
	public static Item slimeFlintShovel;
	public static Item cactusFlintShovel;
	public static Item flintFlintShovel;
	public static Item copperFlintShovel;
	public static Item bronzeFlintShovel;

	public static Item diamondBlazeShovel;
	public static Item obsidianBlazeShovel;
	public static Item netherrackBlazeShovel;
	public static Item lavaBlazeShovel;
	public static Item flintBlazeShovel;
	public static Item blazeBlazeShovel;
	public static Item manyullynBlazeShovel;
	public static Item uraniumBlazeShovel;

	public static Item woodCopperShovel;
	public static Item stoneCopperShovel;
	public static Item boneCopperShovel;
	public static Item netherrackCopperShovel;
	public static Item slimeCopperShovel;
	public static Item cactusCopperShovel;
	public static Item flintCopperShovel;
	public static Item copperCopperShovel;

	public static Item woodBronzeShovel;
	public static Item stoneBronzeShovel;
	public static Item boneBronzeShovel;
	public static Item netherrackBronzeShovel;
	public static Item slimeBronzeShovel;
	public static Item cactusBronzeShovel;
	public static Item flintBronzeShovel;
	public static Item copperBronzeShovel;
	public static Item bronzeBronzeShovel;

	public static Item woodWorkedIronShovel;
	public static Item stoneWorkedIronShovel;
	public static Item ironWorkedIronShovel;
	public static Item diamondWorkedIronShovel;
	public static Item redstoneWorkedIronShovel;
	public static Item obsidianWorkedIronShovel;
	public static Item boneWorkedIronShovel;
	public static Item netherrackWorkedIronShovel;
	public static Item glowstoneWorkedIronShovel;
	public static Item iceWorkedIronShovel;
	public static Item slimeWorkedIronShovel;
	public static Item cactusWorkedIronShovel;
	public static Item blazeWorkedIronShovel;
	public static Item copperWorkedIronShovel;
	public static Item bronzeWorkedIronShovel;
	public static Item workedWorkedIronShovel;
	public static Item steelWorkedIronShovel;
	public static Item uraniumWorkedIronShovel;

	public static Item woodSteelShovel;
	public static Item stoneSteelShovel;
	public static Item ironSteelShovel;
	public static Item diamondSteelShovel;
	public static Item redstoneSteelShovel;
	public static Item obsidianSteelShovel;
	public static Item boneSteelShovel;
	public static Item netherrackSteelShovel;
	public static Item glowstoneSteelShovel;
	public static Item iceSteelShovel;
	public static Item slimeSteelShovel;
	public static Item cactusSteelShovel;
	public static Item blazeSteelShovel;
	public static Item copperSteelShovel;
	public static Item bronzeSteelShovel;
	public static Item workedSteelShovel;
	public static Item steelSteelShovel;
	public static Item cobaltSteelShovel;
	public static Item arditeSteelShovel;
	public static Item uraniumSteelShovel;

	public static Item woodCobaltShovel;
	public static Item stoneCobaltShovel;
	public static Item ironCobaltShovel;
	public static Item diamondCobaltShovel;
	public static Item redstoneCobaltShovel;
	public static Item obsidianCobaltShovel;
	public static Item boneCobaltShovel;
	public static Item slimeCobaltShovel;
	public static Item cactusCobaltShovel;
	public static Item blazeCobaltShovel;
	public static Item copperCobaltShovel;
	public static Item bronzeCobaltShovel;
	public static Item workedCobaltShovel;
	public static Item steelCobaltShovel;
	public static Item cobaltCobaltShovel;
	public static Item arditeCobaltShovel;
	public static Item manyullynCobaltShovel;
	public static Item uraniumCobaltShovel;

	public static Item woodArditeShovel;
	public static Item stoneArditeShovel;
	public static Item ironArditeShovel;
	public static Item diamondArditeShovel;
	public static Item redstoneArditeShovel;
	public static Item obsidianArditeShovel;
	public static Item boneArditeShovel;
	public static Item slimeArditeShovel;
	public static Item cactusArditeShovel;
	public static Item blazeArditeShovel;
	public static Item copperArditeShovel;
	public static Item bronzeArditeShovel;
	public static Item workedArditeShovel;
	public static Item steelArditeShovel;
	public static Item cobaltArditeShovel;
	public static Item arditeArditeShovel;
	public static Item manyullynArditeShovel;
	public static Item uraniumArditeShovel;

	public static Item woodManyullynShovel;
	public static Item stoneManyullynShovel;
	public static Item ironManyullynShovel;
	public static Item diamondManyullynShovel;
	public static Item redstoneManyullynShovel;
	public static Item obsidianManyullynShovel;
	public static Item boneManyullynShovel;
	public static Item slimeManyullynShovel;
	public static Item cactusManyullynShovel;
	public static Item blazeManyullynShovel;
	public static Item copperManyullynShovel;
	public static Item bronzeManyullynShovel;
	public static Item workedManyullynShovel;
	public static Item steelManyullynShovel;
	public static Item cobaltManyullynShovel;
	public static Item arditeManyullynShovel;
	public static Item manyullynManyullynShovel;
	public static Item uraniumManyullynShovel;

	public static Item diamondUraniumShovel;
	public static Item redstoneUraniumShovel;
	public static Item boneUraniumShovel;
	public static Item netherrackUraniumShovel;
	public static Item glowstoneUraniumShovel;
	public static Item lavaUraniumShovel;
	public static Item blazeUraniumShovel;
	public static Item cobaltUraniumShovel;
	public static Item arditeUraniumShovel;
	public static Item uraniumUraniumShovel;
}
