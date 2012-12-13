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

public class Hoes
{
	public static Hoes instance = new Hoes();

	private static String[] recipe = { "#|", " |", " |" };

	public static Hoes getInstance()
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
			sandstoneWoodHoe = new InfiToolHoe(PHInfiTools.woodHoeID + 1, InfiMaterialEnum.Wood, InfiMaterialEnum.Sandstone, "sandstoneWoodHoe");
			boneWoodHoe = new InfiToolHoe(PHInfiTools.woodHoeID + 2, InfiMaterialEnum.Wood, InfiMaterialEnum.Bone, "boneWoodHoe");
			paperWoodHoe = new InfiToolHoe(PHInfiTools.woodHoeID + 3, InfiMaterialEnum.Wood, InfiMaterialEnum.Paper, "paperWoodHoe");
			iceWoodHoe = new InfiToolHoe(PHInfiTools.woodHoeID + 4, InfiMaterialEnum.Wood, InfiMaterialEnum.Ice, "iceWoodHoe");
			slimeWoodHoe = new InfiToolHoe(PHInfiTools.woodHoeID + 5, InfiMaterialEnum.Wood, InfiMaterialEnum.Slime, "slimeWoodHoe");
			cactusWoodHoe = new InfiToolHoe(PHInfiTools.woodHoeID + 6, InfiMaterialEnum.Wood, InfiMaterialEnum.Cactus, "cactusWoodHoe");

			MinecraftForge.setToolClass(sandstoneWoodHoe, "Hoe", InfiMaterialEnum.Wood.getHarvestLevel());
			MinecraftForge.setToolClass(boneWoodHoe, "Hoe", InfiMaterialEnum.Wood.getHarvestLevel());
			MinecraftForge.setToolClass(paperWoodHoe, "Hoe", InfiMaterialEnum.Wood.getHarvestLevel());
			MinecraftForge.setToolClass(iceWoodHoe, "Hoe", InfiMaterialEnum.Wood.getHarvestLevel());
			MinecraftForge.setToolClass(slimeWoodHoe, "Hoe", InfiMaterialEnum.Wood.getHarvestLevel());
			MinecraftForge.setToolClass(cactusWoodHoe, "Hoe", InfiMaterialEnum.Wood.getHarvestLevel());
		}

		if (PHInfiTools.enableStoneTools)
		{
			stoneStoneHoe = new InfiToolHoe(PHInfiTools.stoneHoeID + 1, InfiMaterialEnum.Stone, InfiMaterialEnum.Stone, "stoneStoneHoe");
			sandstoneStoneHoe = new InfiToolHoe(PHInfiTools.stoneHoeID + 2, InfiMaterialEnum.Stone, InfiMaterialEnum.Sandstone, "sandstoneStoneHoe");
			boneStoneHoe = new InfiToolHoe(PHInfiTools.stoneHoeID + 3, InfiMaterialEnum.Stone, InfiMaterialEnum.Bone, "boneStoneHoe");
			netherrackStoneHoe = new InfiToolHoe(PHInfiTools.stoneHoeID + 4, InfiMaterialEnum.Stone, InfiMaterialEnum.Netherrack, "netherrackStoneHoe");
			iceStoneHoe = new InfiToolHoe(PHInfiTools.stoneHoeID + 5, InfiMaterialEnum.Stone, InfiMaterialEnum.Ice, "iceStoneHoe");
			slimeStoneHoe = new InfiToolHoe(PHInfiTools.stoneHoeID + 6, InfiMaterialEnum.Stone, InfiMaterialEnum.Slime, "slimeStoneHoe");
			cactusStoneHoe = new InfiToolHoe(PHInfiTools.stoneHoeID + 7, InfiMaterialEnum.Stone, InfiMaterialEnum.Cactus, "cactusStoneHoe");
			flintStoneHoe = new InfiToolHoe(PHInfiTools.stoneHoeID + 8, InfiMaterialEnum.Stone, InfiMaterialEnum.Flint, "flintStoneHoe");

			MinecraftForge.setToolClass(stoneStoneHoe, "Hoe", InfiMaterialEnum.Stone.getHarvestLevel());
			MinecraftForge.setToolClass(sandstoneStoneHoe, "Hoe", InfiMaterialEnum.Stone.getHarvestLevel());
			MinecraftForge.setToolClass(boneStoneHoe, "Hoe", InfiMaterialEnum.Stone.getHarvestLevel());
			MinecraftForge.setToolClass(netherrackStoneHoe, "Hoe", InfiMaterialEnum.Stone.getHarvestLevel());
			MinecraftForge.setToolClass(iceStoneHoe, "Hoe", InfiMaterialEnum.Stone.getHarvestLevel());
			MinecraftForge.setToolClass(slimeStoneHoe, "Hoe", InfiMaterialEnum.Stone.getHarvestLevel());
			MinecraftForge.setToolClass(cactusStoneHoe, "Hoe", InfiMaterialEnum.Stone.getHarvestLevel());
			MinecraftForge.setToolClass(flintStoneHoe, "Hoe", InfiMaterialEnum.Stone.getHarvestLevel());
		}

		if (PHInfiTools.enableIronTools)
		{
			stoneIronHoe = new InfiToolHoe(PHInfiTools.ironHoeID + 1, InfiMaterialEnum.Iron, InfiMaterialEnum.Stone, "stoneIronHoe");
			ironIronHoe = new InfiToolHoe(PHInfiTools.ironHoeID + 2, InfiMaterialEnum.Iron, InfiMaterialEnum.Iron, "ironIronHoe");
			boneIronHoe = new InfiToolHoe(PHInfiTools.ironHoeID + 3, InfiMaterialEnum.Iron, InfiMaterialEnum.Bone, "boneIronHoe");
			netherrackIronHoe = new InfiToolHoe(PHInfiTools.ironHoeID + 4, InfiMaterialEnum.Iron, InfiMaterialEnum.Netherrack, "netherrackIronHoe");
			glowstoneIronHoe = new InfiToolHoe(PHInfiTools.ironHoeID + 5, InfiMaterialEnum.Iron, InfiMaterialEnum.Glowstone, "glowstoneIronHoe");
			cactusIronHoe = new InfiToolHoe(PHInfiTools.ironHoeID + 6, InfiMaterialEnum.Iron, InfiMaterialEnum.Cactus, "cactusIronHoe");
			copperIronHoe = new InfiToolHoe(PHInfiTools.ironHoeID + 7, InfiMaterialEnum.Iron, InfiMaterialEnum.Copper, "copperIronHoe");
			bronzeIronHoe = new InfiToolHoe(PHInfiTools.ironHoeID + 8, InfiMaterialEnum.Iron, InfiMaterialEnum.Bronze, "bronzeIronHoe");

			MinecraftForge.setToolClass(stoneIronHoe, "Hoe", InfiMaterialEnum.Iron.getHarvestLevel());
			MinecraftForge.setToolClass(ironIronHoe, "Hoe", InfiMaterialEnum.Iron.getHarvestLevel());
			MinecraftForge.setToolClass(boneIronHoe, "Hoe", InfiMaterialEnum.Iron.getHarvestLevel());
			MinecraftForge.setToolClass(netherrackIronHoe, "Hoe", InfiMaterialEnum.Iron.getHarvestLevel());
			MinecraftForge.setToolClass(glowstoneIronHoe, "Hoe", InfiMaterialEnum.Iron.getHarvestLevel());
			MinecraftForge.setToolClass(cactusIronHoe, "Hoe", InfiMaterialEnum.Iron.getHarvestLevel());
			MinecraftForge.setToolClass(copperIronHoe, "Hoe", InfiMaterialEnum.Iron.getHarvestLevel());
			MinecraftForge.setToolClass(bronzeIronHoe, "Hoe", InfiMaterialEnum.Iron.getHarvestLevel());
		}

		if (PHInfiTools.enableDiamondTools)
		{
			stoneDiamondHoe = new InfiToolHoe(PHInfiTools.diamondHoeID + 1, InfiMaterialEnum.Diamond, InfiMaterialEnum.Stone, "stoneDiamondHoe");
			ironDiamondHoe = new InfiToolHoe(PHInfiTools.diamondHoeID + 2, InfiMaterialEnum.Diamond, InfiMaterialEnum.Iron, "ironDiamondHoe");
			diamondDiamondHoe = new InfiToolHoe(PHInfiTools.diamondHoeID + 3, InfiMaterialEnum.Diamond, InfiMaterialEnum.Diamond, "diamondDiamondHoe");
			redstoneDiamondHoe = new InfiToolHoe(PHInfiTools.diamondHoeID + 4, InfiMaterialEnum.Diamond, InfiMaterialEnum.Redstone, "redstoneDiamondHoe");
			obsidianDiamondHoe = new InfiToolHoe(PHInfiTools.diamondHoeID + 5, InfiMaterialEnum.Diamond, InfiMaterialEnum.Obsidian, "obsidianDiamondHoe");
			boneDiamondHoe = new InfiToolHoe(PHInfiTools.diamondHoeID + 6, InfiMaterialEnum.Diamond, InfiMaterialEnum.Bone, "boneDiamondHoe");
			mossyDiamondHoe = new InfiToolHoe(PHInfiTools.diamondHoeID + 7, InfiMaterialEnum.Diamond, InfiMaterialEnum.Mossy, "mossyDiamondHoe");
			netherrackDiamondHoe = new InfiToolHoe(PHInfiTools.diamondHoeID + 8, InfiMaterialEnum.Diamond, InfiMaterialEnum.Netherrack, "netherrackDiamondHoe");
			glowstoneDiamondHoe = new InfiToolHoe(PHInfiTools.diamondHoeID + 9, InfiMaterialEnum.Diamond, InfiMaterialEnum.Glowstone, "glowstoneDiamondHoe");
			lavaDiamondHoe = new InfiToolHoe(PHInfiTools.diamondHoeID + 10, InfiMaterialEnum.Diamond, InfiMaterialEnum.Lava, "lavaDiamondHoe");
			cactusDiamondHoe = new InfiToolHoe(PHInfiTools.diamondHoeID + 11, InfiMaterialEnum.Diamond, InfiMaterialEnum.Cactus, "cactusDiamondHoe");
			flintDiamondHoe = new InfiToolHoe(PHInfiTools.diamondHoeID + 12, InfiMaterialEnum.Diamond, InfiMaterialEnum.Flint, "flintDiamondHoe");
			blazeDiamondHoe = new InfiToolHoe(PHInfiTools.diamondHoeID + 13, InfiMaterialEnum.Diamond, InfiMaterialEnum.Blaze, "blazeDiamondHoe");
			copperDiamondHoe = new InfiToolHoe(PHInfiTools.diamondHoeID + 14, InfiMaterialEnum.Diamond, InfiMaterialEnum.Copper, "copperDiamondHoe");
			bronzeDiamondHoe = new InfiToolHoe(PHInfiTools.diamondHoeID + 15, InfiMaterialEnum.Diamond, InfiMaterialEnum.Bronze, "bronzeDiamondHoe");
			workedDiamondHoe = new InfiToolHoe(PHInfiTools.diamondHoeID + 16, InfiMaterialEnum.Diamond, InfiMaterialEnum.WorkedIron, "workedDiamondHoe");
			steelDiamondHoe = new InfiToolHoe(PHInfiTools.diamondHoeID + 17, InfiMaterialEnum.Diamond, InfiMaterialEnum.Steel, "steelDiamondHoe");
			cobaltDiamondHoe = new InfiToolHoe(PHInfiTools.diamondHoeID + 18, InfiMaterialEnum.Diamond, InfiMaterialEnum.Cobalt, "cobaltDiamondHoe");
			arditeDiamondHoe = new InfiToolHoe(PHInfiTools.diamondHoeID + 19, InfiMaterialEnum.Diamond, InfiMaterialEnum.Ardite, "arditeDiamondHoe");
			manyullynDiamondHoe = new InfiToolHoe(PHInfiTools.diamondHoeID + 20, InfiMaterialEnum.Diamond, InfiMaterialEnum.Manyullyn, "manyullynDiamondHoe");
			uraniumDiamondHoe = new InfiToolHoe(PHInfiTools.diamondHoeID + 21, InfiMaterialEnum.Diamond, InfiMaterialEnum.Uranium, "uraniumDiamondHoe");

			MinecraftForge.setToolClass(stoneDiamondHoe, "Hoe", InfiMaterialEnum.Diamond.getHarvestLevel());
			MinecraftForge.setToolClass(ironDiamondHoe, "Hoe", InfiMaterialEnum.Diamond.getHarvestLevel());
			MinecraftForge.setToolClass(diamondDiamondHoe, "Hoe", InfiMaterialEnum.Diamond.getHarvestLevel());
			MinecraftForge.setToolClass(redstoneDiamondHoe, "Hoe", InfiMaterialEnum.Diamond.getHarvestLevel());
			MinecraftForge.setToolClass(obsidianDiamondHoe, "Hoe", InfiMaterialEnum.Diamond.getHarvestLevel());
			MinecraftForge.setToolClass(boneDiamondHoe, "Hoe", InfiMaterialEnum.Diamond.getHarvestLevel());
			MinecraftForge.setToolClass(mossyDiamondHoe, "Hoe", InfiMaterialEnum.Diamond.getHarvestLevel());
			MinecraftForge.setToolClass(netherrackDiamondHoe, "Hoe", InfiMaterialEnum.Diamond.getHarvestLevel());
			MinecraftForge.setToolClass(glowstoneDiamondHoe, "Hoe", InfiMaterialEnum.Diamond.getHarvestLevel());
			MinecraftForge.setToolClass(lavaDiamondHoe, "Hoe", InfiMaterialEnum.Diamond.getHarvestLevel());
			MinecraftForge.setToolClass(cactusDiamondHoe, "Hoe", InfiMaterialEnum.Diamond.getHarvestLevel());
			MinecraftForge.setToolClass(flintDiamondHoe, "Hoe", InfiMaterialEnum.Diamond.getHarvestLevel());
			MinecraftForge.setToolClass(blazeDiamondHoe, "Hoe", InfiMaterialEnum.Diamond.getHarvestLevel());
			MinecraftForge.setToolClass(copperDiamondHoe, "Hoe", InfiMaterialEnum.Diamond.getHarvestLevel());
			MinecraftForge.setToolClass(bronzeDiamondHoe, "Hoe", InfiMaterialEnum.Diamond.getHarvestLevel());
			MinecraftForge.setToolClass(workedDiamondHoe, "Hoe", InfiMaterialEnum.Diamond.getHarvestLevel());
			MinecraftForge.setToolClass(steelDiamondHoe, "Hoe", InfiMaterialEnum.Diamond.getHarvestLevel());
			MinecraftForge.setToolClass(cobaltDiamondHoe, "Hoe", InfiMaterialEnum.Diamond.getHarvestLevel());
			MinecraftForge.setToolClass(arditeDiamondHoe, "Hoe", InfiMaterialEnum.Diamond.getHarvestLevel());
			MinecraftForge.setToolClass(manyullynDiamondHoe, "Hoe", InfiMaterialEnum.Diamond.getHarvestLevel());
			MinecraftForge.setToolClass(uraniumDiamondHoe, "Hoe", InfiMaterialEnum.Diamond.getHarvestLevel());
		}

		if (PHInfiTools.enableRedstoneTools)
		{
			woodRedstoneHoe = new InfiToolHoe(PHInfiTools.redstoneHoeID + 0, InfiMaterialEnum.Redstone, InfiMaterialEnum.Wood, "woodRedstoneHoe");
			stoneRedstoneHoe = new InfiToolHoe(PHInfiTools.redstoneHoeID + 1, InfiMaterialEnum.Redstone, InfiMaterialEnum.Stone, "stoneRedstoneHoe");
			ironRedstoneHoe = new InfiToolHoe(PHInfiTools.redstoneHoeID + 2, InfiMaterialEnum.Redstone, InfiMaterialEnum.Iron, "ironRedstoneHoe");
			redstoneRedstoneHoe = new InfiToolHoe(PHInfiTools.redstoneHoeID + 3, InfiMaterialEnum.Redstone, InfiMaterialEnum.Redstone, "redstoneRedstoneHoe");
			obsidianRedstoneHoe = new InfiToolHoe(PHInfiTools.redstoneHoeID + 4, InfiMaterialEnum.Redstone, InfiMaterialEnum.Obsidian, "obsidianRedstoneHoe");
			sandstoneRedstoneHoe = new InfiToolHoe(PHInfiTools.redstoneHoeID + 5, InfiMaterialEnum.Redstone, InfiMaterialEnum.Sandstone, "sandstoneRedstoneHoe");
			boneRedstoneHoe = new InfiToolHoe(PHInfiTools.redstoneHoeID + 6, InfiMaterialEnum.Redstone, InfiMaterialEnum.Bone, "boneRedstoneHoe");
			paperRedstoneHoe = new InfiToolHoe(PHInfiTools.redstoneHoeID + 7, InfiMaterialEnum.Redstone, InfiMaterialEnum.Paper, "paperRedstoneHoe");
			mossyRedstoneHoe = new InfiToolHoe(PHInfiTools.redstoneHoeID + 8, InfiMaterialEnum.Redstone, InfiMaterialEnum.Mossy, "mossyRedstoneHoe");
			netherrackRedstoneHoe = new InfiToolHoe(PHInfiTools.redstoneHoeID + 9, InfiMaterialEnum.Redstone, InfiMaterialEnum.Netherrack, "netherrackRedstoneHoe");
			glowstoneRedstoneHoe = new InfiToolHoe(PHInfiTools.redstoneHoeID + 10, InfiMaterialEnum.Redstone, InfiMaterialEnum.Glowstone, "glowstoneRedstoneHoe");
			iceRedstoneHoe = new InfiToolHoe(PHInfiTools.redstoneHoeID + 11, InfiMaterialEnum.Redstone, InfiMaterialEnum.Ice, "iceRedstoneHoe");
			lavaRedstoneHoe = new InfiToolHoe(PHInfiTools.redstoneHoeID + 12, InfiMaterialEnum.Redstone, InfiMaterialEnum.Lava, "lavaRedstoneHoe");
			slimeRedstoneHoe = new InfiToolHoe(PHInfiTools.redstoneHoeID + 13, InfiMaterialEnum.Redstone, InfiMaterialEnum.Slime, "slimeRedstoneHoe");
			cactusRedstoneHoe = new InfiToolHoe(PHInfiTools.redstoneHoeID + 14, InfiMaterialEnum.Redstone, InfiMaterialEnum.Cactus, "cactusRedstoneHoe");
			flintRedstoneHoe = new InfiToolHoe(PHInfiTools.redstoneHoeID + 15, InfiMaterialEnum.Redstone, InfiMaterialEnum.Flint, "flintRedstoneHoe");
			copperRedstoneHoe = new InfiToolHoe(PHInfiTools.redstoneHoeID + 16, InfiMaterialEnum.Redstone, InfiMaterialEnum.Copper, "copperRedstoneHoe");
			bronzeRedstoneHoe = new InfiToolHoe(PHInfiTools.redstoneHoeID + 17, InfiMaterialEnum.Redstone, InfiMaterialEnum.Bronze, "bronzeRedstoneHoe");
			workedRedstoneHoe = new InfiToolHoe(PHInfiTools.redstoneHoeID + 18, InfiMaterialEnum.Redstone, InfiMaterialEnum.WorkedIron, "workedRedstoneHoe");
			uraniumRedstoneHoe = new InfiToolHoe(PHInfiTools.redstoneHoeID + 19, InfiMaterialEnum.Redstone, InfiMaterialEnum.Uranium, "uraniumRedstoneHoe");

			MinecraftForge.setToolClass(woodRedstoneHoe, "Hoe", InfiMaterialEnum.Redstone.getHarvestLevel());
			MinecraftForge.setToolClass(stoneRedstoneHoe, "Hoe", InfiMaterialEnum.Redstone.getHarvestLevel());
			MinecraftForge.setToolClass(ironRedstoneHoe, "Hoe", InfiMaterialEnum.Redstone.getHarvestLevel());
			MinecraftForge.setToolClass(redstoneRedstoneHoe, "Hoe", InfiMaterialEnum.Redstone.getHarvestLevel());
			MinecraftForge.setToolClass(obsidianRedstoneHoe, "Hoe", InfiMaterialEnum.Redstone.getHarvestLevel());
			MinecraftForge.setToolClass(sandstoneRedstoneHoe, "Hoe", InfiMaterialEnum.Redstone.getHarvestLevel());
			MinecraftForge.setToolClass(boneRedstoneHoe, "Hoe", InfiMaterialEnum.Redstone.getHarvestLevel());
			MinecraftForge.setToolClass(paperRedstoneHoe, "Hoe", InfiMaterialEnum.Redstone.getHarvestLevel());
			MinecraftForge.setToolClass(mossyRedstoneHoe, "Hoe", InfiMaterialEnum.Redstone.getHarvestLevel());
			MinecraftForge.setToolClass(netherrackRedstoneHoe, "Hoe", InfiMaterialEnum.Redstone.getHarvestLevel());
			MinecraftForge.setToolClass(glowstoneRedstoneHoe, "Hoe", InfiMaterialEnum.Redstone.getHarvestLevel());
			MinecraftForge.setToolClass(iceRedstoneHoe, "Hoe", InfiMaterialEnum.Redstone.getHarvestLevel());
			MinecraftForge.setToolClass(lavaRedstoneHoe, "Hoe", InfiMaterialEnum.Redstone.getHarvestLevel());
			MinecraftForge.setToolClass(slimeRedstoneHoe, "Hoe", InfiMaterialEnum.Redstone.getHarvestLevel());
			MinecraftForge.setToolClass(cactusRedstoneHoe, "Hoe", InfiMaterialEnum.Redstone.getHarvestLevel());
			MinecraftForge.setToolClass(flintRedstoneHoe, "Hoe", InfiMaterialEnum.Redstone.getHarvestLevel());
			MinecraftForge.setToolClass(copperRedstoneHoe, "Hoe", InfiMaterialEnum.Redstone.getHarvestLevel());
			MinecraftForge.setToolClass(bronzeRedstoneHoe, "Hoe", InfiMaterialEnum.Redstone.getHarvestLevel());
			MinecraftForge.setToolClass(workedRedstoneHoe, "Hoe", InfiMaterialEnum.Redstone.getHarvestLevel());
			MinecraftForge.setToolClass(uraniumRedstoneHoe, "Hoe", InfiMaterialEnum.Redstone.getHarvestLevel());
		}

		if (PHInfiTools.enableObsidianTools)
		{
			woodObsidianHoe = new InfiToolHoe(PHInfiTools.obsidianHoeID + 0, InfiMaterialEnum.Obsidian, InfiMaterialEnum.Wood, "woodObsidianHoe");
			stoneObsidianHoe = new InfiToolHoe(PHInfiTools.obsidianHoeID + 1, InfiMaterialEnum.Obsidian, InfiMaterialEnum.Stone, "stoneObsidianHoe");
			redstoneObsidianHoe = new InfiToolHoe(PHInfiTools.obsidianHoeID + 2, InfiMaterialEnum.Obsidian, InfiMaterialEnum.Redstone, "redstoneObsidianHoe");
			obsidianObsidianHoe = new InfiToolHoe(PHInfiTools.obsidianHoeID + 3, InfiMaterialEnum.Obsidian, InfiMaterialEnum.Obsidian, "obsidianObsidianHoe");
			;
			boneObsidianHoe = new InfiToolHoe(PHInfiTools.obsidianHoeID + 4, InfiMaterialEnum.Obsidian, InfiMaterialEnum.Bone, "boneObsidianHoe");
			netherrackObsidianHoe = new InfiToolHoe(PHInfiTools.obsidianHoeID + 5, InfiMaterialEnum.Obsidian, InfiMaterialEnum.Netherrack, "netherrackObsidianHoe");
			glowstoneObsidianHoe = new InfiToolHoe(PHInfiTools.obsidianHoeID + 6, InfiMaterialEnum.Obsidian, InfiMaterialEnum.Glowstone, "glowstoneObsidianHoe");
			iceObsidianHoe = new InfiToolHoe(PHInfiTools.obsidianHoeID + 7, InfiMaterialEnum.Obsidian, InfiMaterialEnum.Ice, "iceObsidianHoe");
			lavaObsidianHoe = new InfiToolHoe(PHInfiTools.obsidianHoeID + 8, InfiMaterialEnum.Obsidian, InfiMaterialEnum.Lava, "lavaObsidianHoe");
			cactusObsidianHoe = new InfiToolHoe(PHInfiTools.obsidianHoeID + 9, InfiMaterialEnum.Obsidian, InfiMaterialEnum.Cactus, "cactusObsidianHoe");

			MinecraftForge.setToolClass(woodObsidianHoe, "Hoe", InfiMaterialEnum.Obsidian.getHarvestLevel());
			MinecraftForge.setToolClass(stoneObsidianHoe, "Hoe", InfiMaterialEnum.Obsidian.getHarvestLevel());
			MinecraftForge.setToolClass(redstoneObsidianHoe, "Hoe", InfiMaterialEnum.Obsidian.getHarvestLevel());
			MinecraftForge.setToolClass(obsidianObsidianHoe, "Hoe", InfiMaterialEnum.Obsidian.getHarvestLevel());
			MinecraftForge.setToolClass(boneObsidianHoe, "Hoe", InfiMaterialEnum.Obsidian.getHarvestLevel());
			MinecraftForge.setToolClass(netherrackObsidianHoe, "Hoe", InfiMaterialEnum.Obsidian.getHarvestLevel());
			MinecraftForge.setToolClass(glowstoneObsidianHoe, "Hoe", InfiMaterialEnum.Obsidian.getHarvestLevel());
			MinecraftForge.setToolClass(iceObsidianHoe, "Hoe", InfiMaterialEnum.Obsidian.getHarvestLevel());
			MinecraftForge.setToolClass(lavaObsidianHoe, "Hoe", InfiMaterialEnum.Obsidian.getHarvestLevel());
			MinecraftForge.setToolClass(cactusObsidianHoe, "Hoe", InfiMaterialEnum.Obsidian.getHarvestLevel());
		}

		if (PHInfiTools.enableSandstoneTools)
		{
			woodSandstoneHoe = new InfiToolHoe(PHInfiTools.sandstoneHoeID + 0, InfiMaterialEnum.Sandstone, InfiMaterialEnum.Wood, "woodSandstoneHoe");
			sandstoneSandstoneHoe = new InfiToolHoe(PHInfiTools.sandstoneHoeID + 1, InfiMaterialEnum.Sandstone, InfiMaterialEnum.Sandstone, "sandstoneSandstoneHoe");
			boneSandstoneHoe = new InfiToolHoe(PHInfiTools.sandstoneHoeID + 2, InfiMaterialEnum.Sandstone, InfiMaterialEnum.Bone, "boneSandstoneHoe");
			netherrackSandstoneHoe = new InfiToolHoe(PHInfiTools.sandstoneHoeID + 3, InfiMaterialEnum.Sandstone, InfiMaterialEnum.Netherrack, "netherrackSandstoneHoe");
			iceSandstoneHoe = new InfiToolHoe(PHInfiTools.sandstoneHoeID + 4, InfiMaterialEnum.Sandstone, InfiMaterialEnum.Ice, "iceSandstoneHoe");
			slimeSandstoneHoe = new InfiToolHoe(PHInfiTools.sandstoneHoeID + 5, InfiMaterialEnum.Sandstone, InfiMaterialEnum.Slime, "slimeSandstoneHoe");
			cactusSandstoneHoe = new InfiToolHoe(PHInfiTools.sandstoneHoeID + 6, InfiMaterialEnum.Sandstone, InfiMaterialEnum.Cactus, "cactusSandstoneHoe");
			flintSandstoneHoe = new InfiToolHoe(PHInfiTools.sandstoneHoeID + 7, InfiMaterialEnum.Sandstone, InfiMaterialEnum.Flint, "flintSandstoneHoe");

			MinecraftForge.setToolClass(woodSandstoneHoe, "Hoe", InfiMaterialEnum.Sandstone.getHarvestLevel());
			MinecraftForge.setToolClass(sandstoneSandstoneHoe, "Hoe", InfiMaterialEnum.Sandstone.getHarvestLevel());
			MinecraftForge.setToolClass(boneSandstoneHoe, "Hoe", InfiMaterialEnum.Sandstone.getHarvestLevel());
			MinecraftForge.setToolClass(netherrackSandstoneHoe, "Hoe", InfiMaterialEnum.Sandstone.getHarvestLevel());
			MinecraftForge.setToolClass(iceSandstoneHoe, "Hoe", InfiMaterialEnum.Sandstone.getHarvestLevel());
			MinecraftForge.setToolClass(slimeSandstoneHoe, "Hoe", InfiMaterialEnum.Sandstone.getHarvestLevel());
			MinecraftForge.setToolClass(cactusSandstoneHoe, "Hoe", InfiMaterialEnum.Sandstone.getHarvestLevel());
			MinecraftForge.setToolClass(flintSandstoneHoe, "Hoe", InfiMaterialEnum.Sandstone.getHarvestLevel());
		}

		if (PHInfiTools.enableBoneTools)
		{
			woodBoneHoe = new InfiToolHoe(PHInfiTools.boneHoeID + 0, InfiMaterialEnum.Bone, InfiMaterialEnum.Wood, "woodBoneHoe");
			stoneBoneHoe = new InfiToolHoe(PHInfiTools.boneHoeID + 1, InfiMaterialEnum.Bone, InfiMaterialEnum.Stone, "stoneBoneHoe");
			sandstoneBoneHoe = new InfiToolHoe(PHInfiTools.boneHoeID + 2, InfiMaterialEnum.Bone, InfiMaterialEnum.Sandstone, "sandstoneBoneHoe");
			boneBoneHoe = new InfiToolHoe(PHInfiTools.boneHoeID + 3, InfiMaterialEnum.Bone, InfiMaterialEnum.Bone, "boneBoneHoe");
			paperBoneHoe = new InfiToolHoe(PHInfiTools.boneHoeID + 4, InfiMaterialEnum.Bone, InfiMaterialEnum.Paper, "paperBoneHoe");
			netherrackBoneHoe = new InfiToolHoe(PHInfiTools.boneHoeID + 5, InfiMaterialEnum.Bone, InfiMaterialEnum.Netherrack, "netherrackBoneHoe");
			iceBoneHoe = new InfiToolHoe(PHInfiTools.boneHoeID + 6, InfiMaterialEnum.Bone, InfiMaterialEnum.Ice, "iceBoneHoe");
			cactusBoneHoe = new InfiToolHoe(PHInfiTools.boneHoeID + 7, InfiMaterialEnum.Bone, InfiMaterialEnum.Cactus, "cactusBoneHoe");
			flintBoneHoe = new InfiToolHoe(PHInfiTools.boneHoeID + 8, InfiMaterialEnum.Bone, InfiMaterialEnum.Flint, "flintBoneHoe");

			MinecraftForge.setToolClass(woodBoneHoe, "Hoe", InfiMaterialEnum.Bone.getHarvestLevel());
			MinecraftForge.setToolClass(stoneBoneHoe, "Hoe", InfiMaterialEnum.Bone.getHarvestLevel());
			MinecraftForge.setToolClass(sandstoneBoneHoe, "Hoe", InfiMaterialEnum.Bone.getHarvestLevel());
			MinecraftForge.setToolClass(boneBoneHoe, "Hoe", InfiMaterialEnum.Bone.getHarvestLevel());
			MinecraftForge.setToolClass(paperBoneHoe, "Hoe", InfiMaterialEnum.Bone.getHarvestLevel());
			MinecraftForge.setToolClass(netherrackBoneHoe, "Hoe", InfiMaterialEnum.Bone.getHarvestLevel());
			MinecraftForge.setToolClass(iceBoneHoe, "Hoe", InfiMaterialEnum.Bone.getHarvestLevel());
			MinecraftForge.setToolClass(cactusBoneHoe, "Hoe", InfiMaterialEnum.Bone.getHarvestLevel());
			MinecraftForge.setToolClass(flintBoneHoe, "Hoe", InfiMaterialEnum.Bone.getHarvestLevel());
		}

		if (PHInfiTools.enablePaperTools)
		{
			woodPaperHoe = new InfiToolHoe(PHInfiTools.paperHoeID + 0, InfiMaterialEnum.Paper, InfiMaterialEnum.Wood, "woodPaperHoe");
			bonePaperHoe = new InfiToolHoe(PHInfiTools.paperHoeID + 1, InfiMaterialEnum.Paper, InfiMaterialEnum.Bone, "bonePaperHoe");
			paperPaperHoe = new InfiToolHoe(PHInfiTools.paperHoeID + 2, InfiMaterialEnum.Paper, InfiMaterialEnum.Paper, "paperPaperHoe");
			slimePaperHoe = new InfiToolHoe(PHInfiTools.paperHoeID + 3, InfiMaterialEnum.Paper, InfiMaterialEnum.Slime, "slimePaperHoe");
			cactusPaperHoe = new InfiToolHoe(PHInfiTools.paperHoeID + 4, InfiMaterialEnum.Paper, InfiMaterialEnum.Cactus, "cactusPaperHoe");

			MinecraftForge.setToolClass(woodPaperHoe, "Hoe", InfiMaterialEnum.Paper.getHarvestLevel());
			MinecraftForge.setToolClass(bonePaperHoe, "Hoe", InfiMaterialEnum.Paper.getHarvestLevel());
			MinecraftForge.setToolClass(paperPaperHoe, "Hoe", InfiMaterialEnum.Paper.getHarvestLevel());
			MinecraftForge.setToolClass(slimePaperHoe, "Hoe", InfiMaterialEnum.Paper.getHarvestLevel());
			MinecraftForge.setToolClass(cactusPaperHoe, "Hoe", InfiMaterialEnum.Paper.getHarvestLevel());
		}

		if (PHInfiTools.enableMossyTools)
		{
			woodMossyHoe = new InfiToolHoe(PHInfiTools.mossyHoeID + 0, InfiMaterialEnum.Mossy, InfiMaterialEnum.Wood, "woodMossyHoe");
			stoneMossyHoe = new InfiToolHoe(PHInfiTools.mossyHoeID + 1, InfiMaterialEnum.Mossy, InfiMaterialEnum.Stone, "stoneMossyHoe");
			diamondMossyHoe = new InfiToolHoe(PHInfiTools.mossyHoeID + 2, InfiMaterialEnum.Mossy, InfiMaterialEnum.Diamond, "diamondMossyHoe");
			redstoneMossyHoe = new InfiToolHoe(PHInfiTools.mossyHoeID + 3, InfiMaterialEnum.Mossy, InfiMaterialEnum.Redstone, "redstoneMossyHoe");
			boneMossyHoe = new InfiToolHoe(PHInfiTools.mossyHoeID + 4, InfiMaterialEnum.Mossy, InfiMaterialEnum.Bone, "boneMossyHoe");
			mossyMossyHoe = new InfiToolHoe(PHInfiTools.mossyHoeID + 5, InfiMaterialEnum.Mossy, InfiMaterialEnum.Mossy, "mossyMossyHoe");
			netherrackMossyHoe = new InfiToolHoe(PHInfiTools.mossyHoeID + 6, InfiMaterialEnum.Mossy, InfiMaterialEnum.Netherrack, "netherrackMossyHoe");
			glowstoneMossyHoe = new InfiToolHoe(PHInfiTools.mossyHoeID + 7, InfiMaterialEnum.Mossy, InfiMaterialEnum.Glowstone, "glowstoneMossyHoe");
			cactusMossyHoe = new InfiToolHoe(PHInfiTools.mossyHoeID + 8, InfiMaterialEnum.Mossy, InfiMaterialEnum.Cactus, "cactusMossyHoe");
			blazeMossyHoe = new InfiToolHoe(PHInfiTools.mossyHoeID + 9, InfiMaterialEnum.Mossy, InfiMaterialEnum.Blaze, "blazeMossyHoe");
			manyullynMossyHoe = new InfiToolHoe(PHInfiTools.mossyHoeID + 10, InfiMaterialEnum.Mossy, InfiMaterialEnum.Manyullyn, "manyullynMossyHoe");
			uraniumMossyHoe = new InfiToolHoe(PHInfiTools.mossyHoeID + 11, InfiMaterialEnum.Mossy, InfiMaterialEnum.Uranium, "uraniumMossyHoe");

			MinecraftForge.setToolClass(woodMossyHoe, "Hoe", InfiMaterialEnum.Mossy.getHarvestLevel());
			MinecraftForge.setToolClass(stoneMossyHoe, "Hoe", InfiMaterialEnum.Mossy.getHarvestLevel());
			MinecraftForge.setToolClass(diamondMossyHoe, "Hoe", InfiMaterialEnum.Mossy.getHarvestLevel());
			MinecraftForge.setToolClass(redstoneMossyHoe, "Hoe", InfiMaterialEnum.Mossy.getHarvestLevel());
			MinecraftForge.setToolClass(boneMossyHoe, "Hoe", InfiMaterialEnum.Mossy.getHarvestLevel());
			MinecraftForge.setToolClass(mossyMossyHoe, "Hoe", InfiMaterialEnum.Mossy.getHarvestLevel());
			MinecraftForge.setToolClass(netherrackMossyHoe, "Hoe", InfiMaterialEnum.Mossy.getHarvestLevel());
			MinecraftForge.setToolClass(glowstoneMossyHoe, "Hoe", InfiMaterialEnum.Mossy.getHarvestLevel());
			MinecraftForge.setToolClass(cactusMossyHoe, "Hoe", InfiMaterialEnum.Mossy.getHarvestLevel());
			MinecraftForge.setToolClass(blazeMossyHoe, "Hoe", InfiMaterialEnum.Mossy.getHarvestLevel());
			MinecraftForge.setToolClass(manyullynMossyHoe, "Hoe", InfiMaterialEnum.Mossy.getHarvestLevel());
			MinecraftForge.setToolClass(uraniumMossyHoe, "Hoe", InfiMaterialEnum.Mossy.getHarvestLevel());
		}

		if (PHInfiTools.enableNetherrackTools)
		{
			woodNetherrackHoe = new InfiToolHoe(PHInfiTools.netherrackHoeID + 0, InfiMaterialEnum.Netherrack, InfiMaterialEnum.Wood, "woodNetherrackHoe");
			stoneNetherrackHoe = new InfiToolHoe(PHInfiTools.netherrackHoeID + 1, InfiMaterialEnum.Netherrack, InfiMaterialEnum.Stone, "stoneNetherrackHoe");
			sandstoneNetherrackHoe = new InfiToolHoe(PHInfiTools.netherrackHoeID + 2, InfiMaterialEnum.Netherrack, InfiMaterialEnum.Sandstone, "sandstoneNetherrackHoe");
			boneNetherrackHoe = new InfiToolHoe(PHInfiTools.netherrackHoeID + 3, InfiMaterialEnum.Netherrack, InfiMaterialEnum.Bone, "boneNetherrackHoe");
			paperNetherrackHoe = new InfiToolHoe(PHInfiTools.netherrackHoeID + 4, InfiMaterialEnum.Netherrack, InfiMaterialEnum.Paper, "paperNetherrackHoe");
			mossyNetherrackHoe = new InfiToolHoe(PHInfiTools.netherrackHoeID + 5, InfiMaterialEnum.Netherrack, InfiMaterialEnum.Mossy, "mossyNetherrackHoe");
			netherrackNetherrackHoe = new InfiToolHoe(PHInfiTools.netherrackHoeID + 6, InfiMaterialEnum.Netherrack, InfiMaterialEnum.Netherrack, "netherrackNetherrackHoe");
			iceNetherrackHoe = new InfiToolHoe(PHInfiTools.netherrackHoeID + 7, InfiMaterialEnum.Netherrack, InfiMaterialEnum.Ice, "iceNetherrackHoe");
			slimeNetherrackHoe = new InfiToolHoe(PHInfiTools.netherrackHoeID + 8, InfiMaterialEnum.Netherrack, InfiMaterialEnum.Slime, "slimeNetherrackHoe");
			cactusNetherrackHoe = new InfiToolHoe(PHInfiTools.netherrackHoeID + 9, InfiMaterialEnum.Netherrack, InfiMaterialEnum.Cactus, "cactusNetherrackHoe");
			flintNetherrackHoe = new InfiToolHoe(PHInfiTools.netherrackHoeID + 10, InfiMaterialEnum.Netherrack, InfiMaterialEnum.Flint, "flintNetherrackHoe");
			copperNetherrackHoe = new InfiToolHoe(PHInfiTools.netherrackHoeID + 11, InfiMaterialEnum.Netherrack, InfiMaterialEnum.Copper, "copperNetherrackHoe");
			bronzeNetherrackHoe = new InfiToolHoe(PHInfiTools.netherrackHoeID + 12, InfiMaterialEnum.Netherrack, InfiMaterialEnum.Bronze, "bronzeNetherrackHoe");

			MinecraftForge.setToolClass(woodNetherrackHoe, "Hoe", InfiMaterialEnum.Netherrack.getHarvestLevel());
			MinecraftForge.setToolClass(stoneNetherrackHoe, "Hoe", InfiMaterialEnum.Netherrack.getHarvestLevel());
			MinecraftForge.setToolClass(sandstoneNetherrackHoe, "Hoe", InfiMaterialEnum.Netherrack.getHarvestLevel());
			MinecraftForge.setToolClass(boneNetherrackHoe, "Hoe", InfiMaterialEnum.Netherrack.getHarvestLevel());
			MinecraftForge.setToolClass(paperNetherrackHoe, "Hoe", InfiMaterialEnum.Netherrack.getHarvestLevel());
			MinecraftForge.setToolClass(mossyNetherrackHoe, "Hoe", InfiMaterialEnum.Netherrack.getHarvestLevel());
			MinecraftForge.setToolClass(netherrackNetherrackHoe, "Hoe", InfiMaterialEnum.Netherrack.getHarvestLevel());
			MinecraftForge.setToolClass(iceNetherrackHoe, "Hoe", InfiMaterialEnum.Netherrack.getHarvestLevel());
			MinecraftForge.setToolClass(slimeNetherrackHoe, "Hoe", InfiMaterialEnum.Netherrack.getHarvestLevel());
			MinecraftForge.setToolClass(cactusNetherrackHoe, "Hoe", InfiMaterialEnum.Netherrack.getHarvestLevel());
			MinecraftForge.setToolClass(flintNetherrackHoe, "Hoe", InfiMaterialEnum.Netherrack.getHarvestLevel());
			MinecraftForge.setToolClass(copperNetherrackHoe, "Hoe", InfiMaterialEnum.Netherrack.getHarvestLevel());
			MinecraftForge.setToolClass(bronzeNetherrackHoe, "Hoe", InfiMaterialEnum.Netherrack.getHarvestLevel());
		}

		if (PHInfiTools.enableGlowstoneTools)
		{
			woodGlowstoneHoe = new InfiToolHoe(PHInfiTools.glowstoneHoeID + 0, InfiMaterialEnum.Glowstone, InfiMaterialEnum.Wood, "woodGlowstoneHoe");
			redstoneGlowstoneHoe = new InfiToolHoe(PHInfiTools.glowstoneHoeID + 1, InfiMaterialEnum.Glowstone, InfiMaterialEnum.Redstone, "redstoneGlowstoneHoe");
			obsidianGlowstoneHoe = new InfiToolHoe(PHInfiTools.glowstoneHoeID + 2, InfiMaterialEnum.Glowstone, InfiMaterialEnum.Obsidian, "obsidianGlowstoneHoe");
			boneGlowstoneHoe = new InfiToolHoe(PHInfiTools.glowstoneHoeID + 3, InfiMaterialEnum.Glowstone, InfiMaterialEnum.Bone, "boneGlowstoneHoe");
			netherrackGlowstoneHoe = new InfiToolHoe(PHInfiTools.glowstoneHoeID + 4, InfiMaterialEnum.Glowstone, InfiMaterialEnum.Netherrack, "netherrackGlowstoneHoe");
			glowstoneGlowstoneHoe = new InfiToolHoe(PHInfiTools.glowstoneHoeID + 5, InfiMaterialEnum.Glowstone, InfiMaterialEnum.Glowstone, "glowstoneGlowstoneHoe");
			iceGlowstoneHoe = new InfiToolHoe(PHInfiTools.glowstoneHoeID + 6, InfiMaterialEnum.Glowstone, InfiMaterialEnum.Ice, "iceGlowstoneHoe");
			slimeGlowstoneHoe = new InfiToolHoe(PHInfiTools.glowstoneHoeID + 7, InfiMaterialEnum.Glowstone, InfiMaterialEnum.Slime, "slimeGlowstoneHoe");
			cactusGlowstoneHoe = new InfiToolHoe(PHInfiTools.glowstoneHoeID + 8, InfiMaterialEnum.Glowstone, InfiMaterialEnum.Cactus, "cactusGlowstoneHoe");

			MinecraftForge.setToolClass(woodGlowstoneHoe, "Hoe", InfiMaterialEnum.Glowstone.getHarvestLevel());
			MinecraftForge.setToolClass(redstoneGlowstoneHoe, "Hoe", InfiMaterialEnum.Glowstone.getHarvestLevel());
			MinecraftForge.setToolClass(obsidianGlowstoneHoe, "Hoe", InfiMaterialEnum.Glowstone.getHarvestLevel());
			MinecraftForge.setToolClass(boneGlowstoneHoe, "Hoe", InfiMaterialEnum.Glowstone.getHarvestLevel());
			MinecraftForge.setToolClass(netherrackGlowstoneHoe, "Hoe", InfiMaterialEnum.Glowstone.getHarvestLevel());
			MinecraftForge.setToolClass(glowstoneGlowstoneHoe, "Hoe", InfiMaterialEnum.Glowstone.getHarvestLevel());
			MinecraftForge.setToolClass(iceGlowstoneHoe, "Hoe", InfiMaterialEnum.Glowstone.getHarvestLevel());
			MinecraftForge.setToolClass(slimeGlowstoneHoe, "Hoe", InfiMaterialEnum.Glowstone.getHarvestLevel());
			MinecraftForge.setToolClass(cactusGlowstoneHoe, "Hoe", InfiMaterialEnum.Glowstone.getHarvestLevel());
		}

		if (PHInfiTools.enableIceTools)
		{
			woodIceHoe = new InfiToolHoe(PHInfiTools.iceHoeID + 0, InfiMaterialEnum.Ice, InfiMaterialEnum.Wood, "woodIceHoe");
			boneIceHoe = new InfiToolHoe(PHInfiTools.iceHoeID + 1, InfiMaterialEnum.Ice, InfiMaterialEnum.Bone, "boneIceHoe");
			paperIceHoe = new InfiToolHoe(PHInfiTools.iceHoeID + 2, InfiMaterialEnum.Ice, InfiMaterialEnum.Paper, "paperIceHoe");
			iceIceHoe = new InfiToolHoe(PHInfiTools.iceHoeID + 3, InfiMaterialEnum.Ice, InfiMaterialEnum.Ice, "iceIceHoe");
			slimeIceHoe = new InfiToolHoe(PHInfiTools.iceHoeID + 4, InfiMaterialEnum.Ice, InfiMaterialEnum.Slime, "slimeIceHoe");
			cactusIceHoe = new InfiToolHoe(PHInfiTools.iceHoeID + 5, InfiMaterialEnum.Ice, InfiMaterialEnum.Cactus, "cactusIceHoe");

			MinecraftForge.setToolClass(woodIceHoe, "Hoe", InfiMaterialEnum.Ice.getHarvestLevel());
			MinecraftForge.setToolClass(boneIceHoe, "Hoe", InfiMaterialEnum.Ice.getHarvestLevel());
			MinecraftForge.setToolClass(paperIceHoe, "Hoe", InfiMaterialEnum.Ice.getHarvestLevel());
			MinecraftForge.setToolClass(iceIceHoe, "Hoe", InfiMaterialEnum.Ice.getHarvestLevel());
			MinecraftForge.setToolClass(slimeIceHoe, "Hoe", InfiMaterialEnum.Ice.getHarvestLevel());
			MinecraftForge.setToolClass(cactusIceHoe, "Hoe", InfiMaterialEnum.Ice.getHarvestLevel());
		}

		if (PHInfiTools.enableLavaTools)
		{
			diamondLavaHoe = new InfiToolHoe(PHInfiTools.lavaHoeID + 0, InfiMaterialEnum.Lava, InfiMaterialEnum.Diamond, "diamondLavaHoe");
			obsidianLavaHoe = new InfiToolHoe(PHInfiTools.lavaHoeID + 1, InfiMaterialEnum.Lava, InfiMaterialEnum.Obsidian, "obsidianLavaHoe");
			netherrackLavaHoe = new InfiToolHoe(PHInfiTools.lavaHoeID + 2, InfiMaterialEnum.Lava, InfiMaterialEnum.Netherrack, "netherrackLavaHoe");
			lavaLavaHoe = new InfiToolHoe(PHInfiTools.lavaHoeID + 3, InfiMaterialEnum.Lava, InfiMaterialEnum.Lava, "lavaLavaHoe");
			flintLavaHoe = new InfiToolHoe(PHInfiTools.lavaHoeID + 4, InfiMaterialEnum.Lava, InfiMaterialEnum.Flint, "flintLavaHoe");
			blazeLavaHoe = new InfiToolHoe(PHInfiTools.lavaHoeID + 5, InfiMaterialEnum.Lava, InfiMaterialEnum.Blaze, "blazeLavaHoe");
			manyullynLavaHoe = new InfiToolHoe(PHInfiTools.lavaHoeID + 6, InfiMaterialEnum.Lava, InfiMaterialEnum.Manyullyn, "manyullynLavaHoe");
			uraniumLavaHoe = new InfiToolHoe(PHInfiTools.lavaHoeID + 7, InfiMaterialEnum.Lava, InfiMaterialEnum.Uranium, "uraniumLavaHoe");

			MinecraftForge.setToolClass(diamondLavaHoe, "Hoe", InfiMaterialEnum.Lava.getHarvestLevel());
			MinecraftForge.setToolClass(obsidianLavaHoe, "Hoe", InfiMaterialEnum.Lava.getHarvestLevel());
			MinecraftForge.setToolClass(netherrackLavaHoe, "Hoe", InfiMaterialEnum.Lava.getHarvestLevel());
			MinecraftForge.setToolClass(lavaLavaHoe, "Hoe", InfiMaterialEnum.Lava.getHarvestLevel());
			MinecraftForge.setToolClass(flintLavaHoe, "Hoe", InfiMaterialEnum.Lava.getHarvestLevel());
			MinecraftForge.setToolClass(blazeLavaHoe, "Hoe", InfiMaterialEnum.Lava.getHarvestLevel());
			MinecraftForge.setToolClass(manyullynLavaHoe, "Hoe", InfiMaterialEnum.Lava.getHarvestLevel());
			MinecraftForge.setToolClass(uraniumLavaHoe, "Hoe", InfiMaterialEnum.Lava.getHarvestLevel());
		}

		if (PHInfiTools.enableSlimeTools)
		{
			woodSlimeHoe = new InfiToolHoe(PHInfiTools.slimeHoeID + 0, InfiMaterialEnum.Slime, InfiMaterialEnum.Wood, "woodSlimeHoe");
			sandstoneSlimeHoe = new InfiToolHoe(PHInfiTools.slimeHoeID + 1, InfiMaterialEnum.Slime, InfiMaterialEnum.Sandstone, "sandstoneSlimeHoe");
			boneSlimeHoe = new InfiToolHoe(PHInfiTools.slimeHoeID + 2, InfiMaterialEnum.Slime, InfiMaterialEnum.Bone, "boneSlimeHoe");
			paperSlimeHoe = new InfiToolHoe(PHInfiTools.slimeHoeID + 3, InfiMaterialEnum.Slime, InfiMaterialEnum.Paper, "paperSlimeHoe");
			slimeSlimeHoe = new InfiToolHoe(PHInfiTools.slimeHoeID + 4, InfiMaterialEnum.Slime, InfiMaterialEnum.Slime, "slimeSlimeHoe");
			cactusSlimeHoe = new InfiToolHoe(PHInfiTools.slimeHoeID + 5, InfiMaterialEnum.Slime, InfiMaterialEnum.Cactus, "cactusSlimeHoe");

			MinecraftForge.setToolClass(woodSlimeHoe, "Hoe", InfiMaterialEnum.Slime.getHarvestLevel());
			MinecraftForge.setToolClass(sandstoneSlimeHoe, "Hoe", InfiMaterialEnum.Slime.getHarvestLevel());
			MinecraftForge.setToolClass(boneSlimeHoe, "Hoe", InfiMaterialEnum.Slime.getHarvestLevel());
			MinecraftForge.setToolClass(paperSlimeHoe, "Hoe", InfiMaterialEnum.Slime.getHarvestLevel());
			MinecraftForge.setToolClass(slimeSlimeHoe, "Hoe", InfiMaterialEnum.Slime.getHarvestLevel());
			MinecraftForge.setToolClass(cactusSlimeHoe, "Hoe", InfiMaterialEnum.Slime.getHarvestLevel());
		}

		if (PHInfiTools.enableCactusTools)
		{
			woodCactusHoe = new InfiToolHoe(PHInfiTools.cactusHoeID + 0, InfiMaterialEnum.Cactus, InfiMaterialEnum.Wood, "woodCactusHoe");
			sandstoneCactusHoe = new InfiToolHoe(PHInfiTools.cactusHoeID + 1, InfiMaterialEnum.Cactus, InfiMaterialEnum.Sandstone, "sandstoneCactusHoe");
			boneCactusHoe = new InfiToolHoe(PHInfiTools.cactusHoeID + 2, InfiMaterialEnum.Cactus, InfiMaterialEnum.Bone, "boneCactusHoe");
			netherrackCactusHoe = new InfiToolHoe(PHInfiTools.cactusHoeID + 3, InfiMaterialEnum.Cactus, InfiMaterialEnum.Netherrack, "netherrackCactusHoe");
			iceCactusHoe = new InfiToolHoe(PHInfiTools.cactusHoeID + 4, InfiMaterialEnum.Cactus, InfiMaterialEnum.Ice, "iceCactusHoe");
			slimeCactusHoe = new InfiToolHoe(PHInfiTools.cactusHoeID + 5, InfiMaterialEnum.Cactus, InfiMaterialEnum.Slime, "slimeCactusHoe");
			cactusCactusHoe = new InfiToolHoe(PHInfiTools.cactusHoeID + 6, InfiMaterialEnum.Cactus, InfiMaterialEnum.Cactus, "cactusCactusHoe");

			MinecraftForge.setToolClass(woodCactusHoe, "Hoe", InfiMaterialEnum.Cactus.getHarvestLevel());
			MinecraftForge.setToolClass(sandstoneCactusHoe, "Hoe", InfiMaterialEnum.Cactus.getHarvestLevel());
			MinecraftForge.setToolClass(boneCactusHoe, "Hoe", InfiMaterialEnum.Cactus.getHarvestLevel());
			MinecraftForge.setToolClass(netherrackCactusHoe, "Hoe", InfiMaterialEnum.Cactus.getHarvestLevel());
			MinecraftForge.setToolClass(iceCactusHoe, "Hoe", InfiMaterialEnum.Cactus.getHarvestLevel());
			MinecraftForge.setToolClass(slimeCactusHoe, "Hoe", InfiMaterialEnum.Cactus.getHarvestLevel());
			MinecraftForge.setToolClass(cactusCactusHoe, "Hoe", InfiMaterialEnum.Cactus.getHarvestLevel());
		}

		if (PHInfiTools.enableFlintTools)
		{
			woodFlintHoe = new InfiToolHoe(PHInfiTools.flintHoeID + 0, InfiMaterialEnum.Flint, InfiMaterialEnum.Wood, "woodFlintHoe");
			stoneFlintHoe = new InfiToolHoe(PHInfiTools.flintHoeID + 1, InfiMaterialEnum.Flint, InfiMaterialEnum.Stone, "stoneFlintHoe");
			sandstoneFlintHoe = new InfiToolHoe(PHInfiTools.flintHoeID + 2, InfiMaterialEnum.Flint, InfiMaterialEnum.Sandstone, "sandstoneFlintHoe");
			boneFlintHoe = new InfiToolHoe(PHInfiTools.flintHoeID + 3, InfiMaterialEnum.Flint, InfiMaterialEnum.Bone, "boneFlintHoe");
			netherrackFlintHoe = new InfiToolHoe(PHInfiTools.flintHoeID + 4, InfiMaterialEnum.Flint, InfiMaterialEnum.Netherrack, "netherrackFlintHoe");
			slimeFlintHoe = new InfiToolHoe(PHInfiTools.flintHoeID + 5, InfiMaterialEnum.Flint, InfiMaterialEnum.Slime, "slimeFlintHoe");
			cactusFlintHoe = new InfiToolHoe(PHInfiTools.flintHoeID + 6, InfiMaterialEnum.Flint, InfiMaterialEnum.Cactus, "cactusFlintHoe");
			flintFlintHoe = new InfiToolHoe(PHInfiTools.flintHoeID + 7, InfiMaterialEnum.Flint, InfiMaterialEnum.Flint, "flintFlintHoe");
			copperFlintHoe = new InfiToolHoe(PHInfiTools.flintHoeID + 8, InfiMaterialEnum.Flint, InfiMaterialEnum.Copper, "copperFlintHoe");
			bronzeFlintHoe = new InfiToolHoe(PHInfiTools.flintHoeID + 9, InfiMaterialEnum.Flint, InfiMaterialEnum.Bronze, "bronzeFlintHoe");

			MinecraftForge.setToolClass(woodFlintHoe, "Hoe", InfiMaterialEnum.Flint.getHarvestLevel());
			MinecraftForge.setToolClass(stoneFlintHoe, "Hoe", InfiMaterialEnum.Flint.getHarvestLevel());
			MinecraftForge.setToolClass(sandstoneFlintHoe, "Hoe", InfiMaterialEnum.Flint.getHarvestLevel());
			MinecraftForge.setToolClass(boneFlintHoe, "Hoe", InfiMaterialEnum.Flint.getHarvestLevel());
			MinecraftForge.setToolClass(netherrackFlintHoe, "Hoe", InfiMaterialEnum.Flint.getHarvestLevel());
			MinecraftForge.setToolClass(slimeFlintHoe, "Hoe", InfiMaterialEnum.Flint.getHarvestLevel());
			MinecraftForge.setToolClass(cactusFlintHoe, "Hoe", InfiMaterialEnum.Flint.getHarvestLevel());
			MinecraftForge.setToolClass(flintFlintHoe, "Hoe", InfiMaterialEnum.Flint.getHarvestLevel());
			MinecraftForge.setToolClass(copperFlintHoe, "Hoe", InfiMaterialEnum.Flint.getHarvestLevel());
			MinecraftForge.setToolClass(bronzeFlintHoe, "Hoe", InfiMaterialEnum.Flint.getHarvestLevel());
		}

		if (PHInfiTools.enableBlazeTools)
		{
			diamondBlazeHoe = new InfiToolHoe(PHInfiTools.blazeHoeID + 0, InfiMaterialEnum.Blaze, InfiMaterialEnum.Diamond, "diamondBlazeHoe");
			obsidianBlazeHoe = new InfiToolHoe(PHInfiTools.blazeHoeID + 1, InfiMaterialEnum.Blaze, InfiMaterialEnum.Obsidian, "obsidianBlazeHoe");
			netherrackBlazeHoe = new InfiToolHoe(PHInfiTools.blazeHoeID + 2, InfiMaterialEnum.Blaze, InfiMaterialEnum.Netherrack, "netherrackBlazeHoe");
			lavaBlazeHoe = new InfiToolHoe(PHInfiTools.blazeHoeID + 3, InfiMaterialEnum.Blaze, InfiMaterialEnum.Lava, "lavaBlazeHoe");
			flintBlazeHoe = new InfiToolHoe(PHInfiTools.blazeHoeID + 4, InfiMaterialEnum.Blaze, InfiMaterialEnum.Flint, "flintBlazeHoe");
			blazeBlazeHoe = new InfiToolHoe(PHInfiTools.blazeHoeID + 5, InfiMaterialEnum.Blaze, InfiMaterialEnum.Blaze, "blazeBlazeHoe");
			manyullynBlazeHoe = new InfiToolHoe(PHInfiTools.blazeHoeID + 6, InfiMaterialEnum.Blaze, InfiMaterialEnum.Manyullyn, "manyullynBlazeHoe");
			uraniumBlazeHoe = new InfiToolHoe(PHInfiTools.blazeHoeID + 7, InfiMaterialEnum.Blaze, InfiMaterialEnum.Uranium, "uraniumBlazeHoe");

			MinecraftForge.setToolClass(diamondBlazeHoe, "Hoe", InfiMaterialEnum.Blaze.getHarvestLevel());
			MinecraftForge.setToolClass(obsidianBlazeHoe, "Hoe", InfiMaterialEnum.Blaze.getHarvestLevel());
			MinecraftForge.setToolClass(netherrackBlazeHoe, "Hoe", InfiMaterialEnum.Blaze.getHarvestLevel());
			MinecraftForge.setToolClass(blazeBlazeHoe, "Hoe", InfiMaterialEnum.Blaze.getHarvestLevel());
			MinecraftForge.setToolClass(flintBlazeHoe, "Hoe", InfiMaterialEnum.Blaze.getHarvestLevel());
			MinecraftForge.setToolClass(blazeBlazeHoe, "Hoe", InfiMaterialEnum.Blaze.getHarvestLevel());
			MinecraftForge.setToolClass(manyullynBlazeHoe, "Hoe", InfiMaterialEnum.Blaze.getHarvestLevel());
			MinecraftForge.setToolClass(uraniumBlazeHoe, "Hoe", InfiMaterialEnum.Blaze.getHarvestLevel());
		}

		if (PHInfiTools.enableCopperTools)
		{
			woodCopperHoe = new InfiToolHoe(PHInfiTools.copperHoeID + 0, InfiMaterialEnum.Copper, InfiMaterialEnum.Wood, "woodCopperHoe");
			stoneCopperHoe = new InfiToolHoe(PHInfiTools.copperHoeID + 1, InfiMaterialEnum.Copper, InfiMaterialEnum.Stone, "stoneCopperHoe");
			boneCopperHoe = new InfiToolHoe(PHInfiTools.copperHoeID + 2, InfiMaterialEnum.Copper, InfiMaterialEnum.Bone, "boneCopperHoe");
			netherrackCopperHoe = new InfiToolHoe(PHInfiTools.copperHoeID + 3, InfiMaterialEnum.Copper, InfiMaterialEnum.Netherrack, "netherrackCopperHoe");
			slimeCopperHoe = new InfiToolHoe(PHInfiTools.copperHoeID + 4, InfiMaterialEnum.Copper, InfiMaterialEnum.Slime, "slimeCopperHoe");
			cactusCopperHoe = new InfiToolHoe(PHInfiTools.copperHoeID + 5, InfiMaterialEnum.Copper, InfiMaterialEnum.Cactus, "cactusCopperHoe");
			flintCopperHoe = new InfiToolHoe(PHInfiTools.copperHoeID + 6, InfiMaterialEnum.Copper, InfiMaterialEnum.Flint, "flintCopperHoe");
			copperCopperHoe = new InfiToolHoe(PHInfiTools.copperHoeID + 7, InfiMaterialEnum.Copper, InfiMaterialEnum.Copper, "copperCopperHoe");

			MinecraftForge.setToolClass(woodCopperHoe, "Hoe", InfiMaterialEnum.Copper.getHarvestLevel());
			MinecraftForge.setToolClass(stoneCopperHoe, "Hoe", InfiMaterialEnum.Copper.getHarvestLevel());
			MinecraftForge.setToolClass(boneCopperHoe, "Hoe", InfiMaterialEnum.Copper.getHarvestLevel());
			MinecraftForge.setToolClass(netherrackCopperHoe, "Hoe", InfiMaterialEnum.Copper.getHarvestLevel());
			MinecraftForge.setToolClass(slimeCopperHoe, "Hoe", InfiMaterialEnum.Copper.getHarvestLevel());
			MinecraftForge.setToolClass(cactusCopperHoe, "Hoe", InfiMaterialEnum.Copper.getHarvestLevel());
			MinecraftForge.setToolClass(flintCopperHoe, "Hoe", InfiMaterialEnum.Copper.getHarvestLevel());
			MinecraftForge.setToolClass(copperCopperHoe, "Hoe", InfiMaterialEnum.Copper.getHarvestLevel());
		}

		if (PHInfiTools.enableBronzeTools)
		{
			woodBronzeHoe = new InfiToolHoe(PHInfiTools.bronzeHoeID + 0, InfiMaterialEnum.Bronze, InfiMaterialEnum.Wood, "woodBronzeHoe");
			stoneBronzeHoe = new InfiToolHoe(PHInfiTools.bronzeHoeID + 1, InfiMaterialEnum.Bronze, InfiMaterialEnum.Stone, "stoneBronzeHoe");
			boneBronzeHoe = new InfiToolHoe(PHInfiTools.bronzeHoeID + 2, InfiMaterialEnum.Bronze, InfiMaterialEnum.Bone, "boneBronzeHoe");
			netherrackBronzeHoe = new InfiToolHoe(PHInfiTools.bronzeHoeID + 3, InfiMaterialEnum.Bronze, InfiMaterialEnum.Netherrack, "netherrackBronzeHoe");
			slimeBronzeHoe = new InfiToolHoe(PHInfiTools.bronzeHoeID + 4, InfiMaterialEnum.Bronze, InfiMaterialEnum.Slime, "slimeBronzeHoe");
			cactusBronzeHoe = new InfiToolHoe(PHInfiTools.bronzeHoeID + 5, InfiMaterialEnum.Bronze, InfiMaterialEnum.Cactus, "cactusBronzeHoe");
			flintBronzeHoe = new InfiToolHoe(PHInfiTools.bronzeHoeID + 6, InfiMaterialEnum.Bronze, InfiMaterialEnum.Flint, "flintBronzeHoe");
			copperBronzeHoe = new InfiToolHoe(PHInfiTools.bronzeHoeID + 7, InfiMaterialEnum.Bronze, InfiMaterialEnum.Copper, "copperBronzeHoe");
			bronzeBronzeHoe = new InfiToolHoe(PHInfiTools.bronzeHoeID + 8, InfiMaterialEnum.Bronze, InfiMaterialEnum.Bronze, "bronzeBronzeHoe");

			MinecraftForge.setToolClass(woodBronzeHoe, "Hoe", InfiMaterialEnum.Bronze.getHarvestLevel());
			MinecraftForge.setToolClass(stoneBronzeHoe, "Hoe", InfiMaterialEnum.Bronze.getHarvestLevel());
			MinecraftForge.setToolClass(boneBronzeHoe, "Hoe", InfiMaterialEnum.Bronze.getHarvestLevel());
			MinecraftForge.setToolClass(netherrackBronzeHoe, "Hoe", InfiMaterialEnum.Bronze.getHarvestLevel());
			MinecraftForge.setToolClass(slimeBronzeHoe, "Hoe", InfiMaterialEnum.Bronze.getHarvestLevel());
			MinecraftForge.setToolClass(cactusBronzeHoe, "Hoe", InfiMaterialEnum.Bronze.getHarvestLevel());
			MinecraftForge.setToolClass(flintBronzeHoe, "Hoe", InfiMaterialEnum.Bronze.getHarvestLevel());
			MinecraftForge.setToolClass(copperBronzeHoe, "Hoe", InfiMaterialEnum.Bronze.getHarvestLevel());
			MinecraftForge.setToolClass(bronzeBronzeHoe, "Hoe", InfiMaterialEnum.Bronze.getHarvestLevel());
		}

		if (PHInfiTools.enableWorkedIronTools)
		{
			woodWorkedIronHoe = new InfiToolHoe(PHInfiTools.workedIronHoeID + 0, InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Wood, "woodWorkedIronHoe");
			stoneWorkedIronHoe = new InfiToolHoe(PHInfiTools.workedIronHoeID + 1, InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Stone, "stoneWorkedIronHoe");
			ironWorkedIronHoe = new InfiToolHoe(PHInfiTools.workedIronHoeID + 2, InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Iron, "ironWorkedIronHoe");
			diamondWorkedIronHoe = new InfiToolHoe(PHInfiTools.workedIronHoeID + 3, InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Diamond, "diamondWorkedIronHoe");
			redstoneWorkedIronHoe = new InfiToolHoe(PHInfiTools.workedIronHoeID + 4, InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Redstone, "redstoneWorkedIronHoe");
			obsidianWorkedIronHoe = new InfiToolHoe(PHInfiTools.workedIronHoeID + 5, InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Obsidian, "obsidianWorkedIronHoe");
			boneWorkedIronHoe = new InfiToolHoe(PHInfiTools.workedIronHoeID + 6, InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Bone, "boneWorkedIronHoe");
			netherrackWorkedIronHoe = new InfiToolHoe(PHInfiTools.workedIronHoeID + 7, InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Netherrack, "netherrackWorkedIronHoe");
			glowstoneWorkedIronHoe = new InfiToolHoe(PHInfiTools.workedIronHoeID + 8, InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Glowstone, "glowstoneWorkedIronHoe");
			iceWorkedIronHoe = new InfiToolHoe(PHInfiTools.workedIronHoeID + 9, InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Ice, "iceWorkedIronHoe");
			slimeWorkedIronHoe = new InfiToolHoe(PHInfiTools.workedIronHoeID + 10, InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Slime, "slimeWorkedIronHoe");
			cactusWorkedIronHoe = new InfiToolHoe(PHInfiTools.workedIronHoeID + 11, InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Cactus, "cactusWorkedIronHoe");
			blazeWorkedIronHoe = new InfiToolHoe(PHInfiTools.workedIronHoeID + 12, InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Blaze, "blazeWorkedIronHoe");
			copperWorkedIronHoe = new InfiToolHoe(PHInfiTools.workedIronHoeID + 13, InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Copper, "copperWorkedIronHoe");
			bronzeWorkedIronHoe = new InfiToolHoe(PHInfiTools.workedIronHoeID + 14, InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Bronze, "bronzeWorkedIronHoe");
			workedWorkedIronHoe = new InfiToolHoe(PHInfiTools.workedIronHoeID + 15, InfiMaterialEnum.WorkedIron, InfiMaterialEnum.WorkedIron, "workedWorkedIronHoe");
			steelWorkedIronHoe = new InfiToolHoe(PHInfiTools.workedIronHoeID + 16, InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Steel, "steelWorkedIronHoe");
			uraniumWorkedIronHoe = new InfiToolHoe(PHInfiTools.workedIronHoeID + 17, InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Uranium, "uraniumWorkedIronHoe");

			MinecraftForge.setToolClass(woodWorkedIronHoe, "Hoe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
			MinecraftForge.setToolClass(stoneWorkedIronHoe, "Hoe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
			MinecraftForge.setToolClass(ironWorkedIronHoe, "Hoe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
			MinecraftForge.setToolClass(diamondWorkedIronHoe, "Hoe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
			MinecraftForge.setToolClass(redstoneWorkedIronHoe, "Hoe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
			MinecraftForge.setToolClass(obsidianWorkedIronHoe, "Hoe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
			MinecraftForge.setToolClass(boneWorkedIronHoe, "Hoe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
			MinecraftForge.setToolClass(netherrackWorkedIronHoe, "Hoe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
			MinecraftForge.setToolClass(glowstoneWorkedIronHoe, "Hoe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
			MinecraftForge.setToolClass(iceWorkedIronHoe, "Hoe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
			MinecraftForge.setToolClass(slimeWorkedIronHoe, "Hoe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
			MinecraftForge.setToolClass(cactusWorkedIronHoe, "Hoe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
			MinecraftForge.setToolClass(blazeWorkedIronHoe, "Hoe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
			MinecraftForge.setToolClass(copperWorkedIronHoe, "Hoe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
			MinecraftForge.setToolClass(bronzeWorkedIronHoe, "Hoe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
			MinecraftForge.setToolClass(workedWorkedIronHoe, "Hoe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
			MinecraftForge.setToolClass(steelWorkedIronHoe, "Hoe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
			MinecraftForge.setToolClass(uraniumWorkedIronHoe, "Hoe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
		}

		if (PHInfiTools.enableSteelTools)
		{
			woodSteelHoe = new InfiToolHoe(PHInfiTools.steelHoeID + 0, InfiMaterialEnum.Steel, InfiMaterialEnum.Wood, "woodSteelHoe");
			stoneSteelHoe = new InfiToolHoe(PHInfiTools.steelHoeID + 1, InfiMaterialEnum.Steel, InfiMaterialEnum.Stone, "stoneSteelHoe");
			ironSteelHoe = new InfiToolHoe(PHInfiTools.steelHoeID + 2, InfiMaterialEnum.Steel, InfiMaterialEnum.Iron, "ironSteelHoe");
			diamondSteelHoe = new InfiToolHoe(PHInfiTools.steelHoeID + 3, InfiMaterialEnum.Steel, InfiMaterialEnum.Diamond, "diamondSteelHoe");
			redstoneSteelHoe = new InfiToolHoe(PHInfiTools.steelHoeID + 4, InfiMaterialEnum.Steel, InfiMaterialEnum.Redstone, "redstoneSteelHoe");
			obsidianSteelHoe = new InfiToolHoe(PHInfiTools.steelHoeID + 5, InfiMaterialEnum.Steel, InfiMaterialEnum.Obsidian, "obsidianSteelHoe");
			boneSteelHoe = new InfiToolHoe(PHInfiTools.steelHoeID + 6, InfiMaterialEnum.Steel, InfiMaterialEnum.Bone, "boneSteelHoe");
			netherrackSteelHoe = new InfiToolHoe(PHInfiTools.steelHoeID + 7, InfiMaterialEnum.Steel, InfiMaterialEnum.Netherrack, "netherrackSteelHoe");
			glowstoneSteelHoe = new InfiToolHoe(PHInfiTools.steelHoeID + 8, InfiMaterialEnum.Steel, InfiMaterialEnum.Glowstone, "glowstoneSteelHoe");
			iceSteelHoe = new InfiToolHoe(PHInfiTools.steelHoeID + 9, InfiMaterialEnum.Steel, InfiMaterialEnum.Ice, "iceSteelHoe");
			slimeSteelHoe = new InfiToolHoe(PHInfiTools.steelHoeID + 10, InfiMaterialEnum.Steel, InfiMaterialEnum.Slime, "slimeSteelHoe");
			cactusSteelHoe = new InfiToolHoe(PHInfiTools.steelHoeID + 11, InfiMaterialEnum.Steel, InfiMaterialEnum.Cactus, "cactusSteelHoe");
			blazeSteelHoe = new InfiToolHoe(PHInfiTools.steelHoeID + 12, InfiMaterialEnum.Steel, InfiMaterialEnum.Blaze, "blazeSteelHoe");
			copperSteelHoe = new InfiToolHoe(PHInfiTools.steelHoeID + 13, InfiMaterialEnum.Steel, InfiMaterialEnum.Copper, "copperSteelHoe");
			bronzeSteelHoe = new InfiToolHoe(PHInfiTools.steelHoeID + 14, InfiMaterialEnum.Steel, InfiMaterialEnum.Bronze, "bronzeSteelHoe");
			workedSteelHoe = new InfiToolHoe(PHInfiTools.steelHoeID + 15, InfiMaterialEnum.Steel, InfiMaterialEnum.WorkedIron, "workedSteelHoe");
			steelSteelHoe = new InfiToolHoe(PHInfiTools.steelHoeID + 16, InfiMaterialEnum.Steel, InfiMaterialEnum.Steel, "steelSteelHoe");
			cobaltSteelHoe = new InfiToolHoe(PHInfiTools.steelHoeID + 17, InfiMaterialEnum.Steel, InfiMaterialEnum.Cobalt, "cobaltSteelHoe");
			arditeSteelHoe = new InfiToolHoe(PHInfiTools.steelHoeID + 18, InfiMaterialEnum.Steel, InfiMaterialEnum.Ardite, "arditeSteelHoe");
			uraniumSteelHoe = new InfiToolHoe(PHInfiTools.steelHoeID + 19, InfiMaterialEnum.Steel, InfiMaterialEnum.Uranium, "uraniumSteelHoe");

			MinecraftForge.setToolClass(woodSteelHoe, "Hoe", InfiMaterialEnum.Steel.getHarvestLevel());
			MinecraftForge.setToolClass(stoneSteelHoe, "Hoe", InfiMaterialEnum.Steel.getHarvestLevel());
			MinecraftForge.setToolClass(ironSteelHoe, "Hoe", InfiMaterialEnum.Steel.getHarvestLevel());
			MinecraftForge.setToolClass(diamondSteelHoe, "Hoe", InfiMaterialEnum.Steel.getHarvestLevel());
			MinecraftForge.setToolClass(redstoneSteelHoe, "Hoe", InfiMaterialEnum.Steel.getHarvestLevel());
			MinecraftForge.setToolClass(obsidianSteelHoe, "Hoe", InfiMaterialEnum.Steel.getHarvestLevel());
			MinecraftForge.setToolClass(boneSteelHoe, "Hoe", InfiMaterialEnum.Steel.getHarvestLevel());
			MinecraftForge.setToolClass(netherrackSteelHoe, "Hoe", InfiMaterialEnum.Steel.getHarvestLevel());
			MinecraftForge.setToolClass(glowstoneSteelHoe, "Hoe", InfiMaterialEnum.Steel.getHarvestLevel());
			MinecraftForge.setToolClass(iceSteelHoe, "Hoe", InfiMaterialEnum.Steel.getHarvestLevel());
			MinecraftForge.setToolClass(slimeSteelHoe, "Hoe", InfiMaterialEnum.Steel.getHarvestLevel());
			MinecraftForge.setToolClass(cactusSteelHoe, "Hoe", InfiMaterialEnum.Steel.getHarvestLevel());
			MinecraftForge.setToolClass(blazeSteelHoe, "Hoe", InfiMaterialEnum.Steel.getHarvestLevel());
			MinecraftForge.setToolClass(copperSteelHoe, "Hoe", InfiMaterialEnum.Steel.getHarvestLevel());
			MinecraftForge.setToolClass(bronzeSteelHoe, "Hoe", InfiMaterialEnum.Steel.getHarvestLevel());
			MinecraftForge.setToolClass(workedSteelHoe, "Hoe", InfiMaterialEnum.Steel.getHarvestLevel());
			MinecraftForge.setToolClass(steelSteelHoe, "Hoe", InfiMaterialEnum.Steel.getHarvestLevel());
			MinecraftForge.setToolClass(cobaltSteelHoe, "Hoe", InfiMaterialEnum.Steel.getHarvestLevel());
			MinecraftForge.setToolClass(arditeSteelHoe, "Hoe", InfiMaterialEnum.Steel.getHarvestLevel());
			MinecraftForge.setToolClass(uraniumSteelHoe, "Hoe", InfiMaterialEnum.Steel.getHarvestLevel());
		}

		if (PHInfiTools.enableCobaltTools)
		{
			woodCobaltHoe = new InfiToolHoe(PHInfiTools.cobaltHoeID + 0, InfiMaterialEnum.Cobalt, InfiMaterialEnum.Wood, "woodCobaltHoe");
			stoneCobaltHoe = new InfiToolHoe(PHInfiTools.cobaltHoeID + 1, InfiMaterialEnum.Cobalt, InfiMaterialEnum.Stone, "stoneCobaltHoe");
			ironCobaltHoe = new InfiToolHoe(PHInfiTools.cobaltHoeID + 2, InfiMaterialEnum.Cobalt, InfiMaterialEnum.Iron, "ironCobaltHoe");
			diamondCobaltHoe = new InfiToolHoe(PHInfiTools.cobaltHoeID + 3, InfiMaterialEnum.Cobalt, InfiMaterialEnum.Diamond, "diamondCobaltHoe");
			redstoneCobaltHoe = new InfiToolHoe(PHInfiTools.cobaltHoeID + 4, InfiMaterialEnum.Cobalt, InfiMaterialEnum.Redstone, "redstoneCobaltHoe");
			obsidianCobaltHoe = new InfiToolHoe(PHInfiTools.cobaltHoeID + 5, InfiMaterialEnum.Cobalt, InfiMaterialEnum.Obsidian, "obsidianCobaltHoe");
			boneCobaltHoe = new InfiToolHoe(PHInfiTools.cobaltHoeID + 6, InfiMaterialEnum.Cobalt, InfiMaterialEnum.Bone, "boneCobaltHoe");
			slimeCobaltHoe = new InfiToolHoe(PHInfiTools.cobaltHoeID + 7, InfiMaterialEnum.Cobalt, InfiMaterialEnum.Slime, "slimeCobaltHoe");
			cactusCobaltHoe = new InfiToolHoe(PHInfiTools.cobaltHoeID + 8, InfiMaterialEnum.Cobalt, InfiMaterialEnum.Cactus, "cactusCobaltHoe");
			blazeCobaltHoe = new InfiToolHoe(PHInfiTools.cobaltHoeID + 9, InfiMaterialEnum.Cobalt, InfiMaterialEnum.Blaze, "blazeCobaltHoe");
			copperCobaltHoe = new InfiToolHoe(PHInfiTools.cobaltHoeID + 10, InfiMaterialEnum.Cobalt, InfiMaterialEnum.Copper, "copperCobaltHoe");
			bronzeCobaltHoe = new InfiToolHoe(PHInfiTools.cobaltHoeID + 11, InfiMaterialEnum.Cobalt, InfiMaterialEnum.Bronze, "bronzeCobaltHoe");
			workedCobaltHoe = new InfiToolHoe(PHInfiTools.cobaltHoeID + 12, InfiMaterialEnum.Cobalt, InfiMaterialEnum.WorkedIron, "workedCobaltHoe");
			steelCobaltHoe = new InfiToolHoe(PHInfiTools.cobaltHoeID + 13, InfiMaterialEnum.Cobalt, InfiMaterialEnum.Steel, "steelCobaltHoe");
			cobaltCobaltHoe = new InfiToolHoe(PHInfiTools.cobaltHoeID + 14, InfiMaterialEnum.Cobalt, InfiMaterialEnum.Cobalt, "cobaltCobaltHoe");
			arditeCobaltHoe = new InfiToolHoe(PHInfiTools.cobaltHoeID + 15, InfiMaterialEnum.Cobalt, InfiMaterialEnum.Ardite, "arditeCobaltHoe");
			manyullynCobaltHoe = new InfiToolHoe(PHInfiTools.cobaltHoeID + 16, InfiMaterialEnum.Cobalt, InfiMaterialEnum.Manyullyn, "manyullynCobaltHoe");
			uraniumCobaltHoe = new InfiToolHoe(PHInfiTools.cobaltHoeID + 17, InfiMaterialEnum.Cobalt, InfiMaterialEnum.Uranium, "uraniumCobaltHoe");

			MinecraftForge.setToolClass(woodCobaltHoe, "Hoe", InfiMaterialEnum.Cobalt.getHarvestLevel());
			MinecraftForge.setToolClass(stoneCobaltHoe, "Hoe", InfiMaterialEnum.Cobalt.getHarvestLevel());
			MinecraftForge.setToolClass(ironCobaltHoe, "Hoe", InfiMaterialEnum.Cobalt.getHarvestLevel());
			MinecraftForge.setToolClass(diamondCobaltHoe, "Hoe", InfiMaterialEnum.Cobalt.getHarvestLevel());
			MinecraftForge.setToolClass(redstoneCobaltHoe, "Hoe", InfiMaterialEnum.Cobalt.getHarvestLevel());
			MinecraftForge.setToolClass(obsidianCobaltHoe, "Hoe", InfiMaterialEnum.Cobalt.getHarvestLevel());
			MinecraftForge.setToolClass(boneCobaltHoe, "Hoe", InfiMaterialEnum.Cobalt.getHarvestLevel());
			MinecraftForge.setToolClass(slimeCobaltHoe, "Hoe", InfiMaterialEnum.Cobalt.getHarvestLevel());
			MinecraftForge.setToolClass(cactusCobaltHoe, "Hoe", InfiMaterialEnum.Cobalt.getHarvestLevel());
			MinecraftForge.setToolClass(blazeCobaltHoe, "Hoe", InfiMaterialEnum.Cobalt.getHarvestLevel());
			MinecraftForge.setToolClass(copperCobaltHoe, "Hoe", InfiMaterialEnum.Cobalt.getHarvestLevel());
			MinecraftForge.setToolClass(bronzeCobaltHoe, "Hoe", InfiMaterialEnum.Cobalt.getHarvestLevel());
			MinecraftForge.setToolClass(workedCobaltHoe, "Hoe", InfiMaterialEnum.Cobalt.getHarvestLevel());
			MinecraftForge.setToolClass(steelCobaltHoe, "Hoe", InfiMaterialEnum.Cobalt.getHarvestLevel());
			MinecraftForge.setToolClass(cobaltCobaltHoe, "Hoe", InfiMaterialEnum.Cobalt.getHarvestLevel());
			MinecraftForge.setToolClass(arditeCobaltHoe, "Hoe", InfiMaterialEnum.Cobalt.getHarvestLevel());
			MinecraftForge.setToolClass(manyullynCobaltHoe, "Hoe", InfiMaterialEnum.Cobalt.getHarvestLevel());
			MinecraftForge.setToolClass(uraniumCobaltHoe, "Hoe", InfiMaterialEnum.Cobalt.getHarvestLevel());
		}

		if (PHInfiTools.enableArditeTools)
		{
			woodArditeHoe = new InfiToolHoe(PHInfiTools.arditeHoeID + 0, InfiMaterialEnum.Ardite, InfiMaterialEnum.Wood, "woodArditeHoe");
			stoneArditeHoe = new InfiToolHoe(PHInfiTools.arditeHoeID + 1, InfiMaterialEnum.Ardite, InfiMaterialEnum.Stone, "stoneArditeHoe");
			ironArditeHoe = new InfiToolHoe(PHInfiTools.arditeHoeID + 2, InfiMaterialEnum.Ardite, InfiMaterialEnum.Iron, "ironArditeHoe");
			diamondArditeHoe = new InfiToolHoe(PHInfiTools.arditeHoeID + 3, InfiMaterialEnum.Ardite, InfiMaterialEnum.Diamond, "diamondArditeHoe");
			redstoneArditeHoe = new InfiToolHoe(PHInfiTools.arditeHoeID + 4, InfiMaterialEnum.Ardite, InfiMaterialEnum.Redstone, "redstoneArditeHoe");
			obsidianArditeHoe = new InfiToolHoe(PHInfiTools.arditeHoeID + 5, InfiMaterialEnum.Ardite, InfiMaterialEnum.Obsidian, "obsidianArditeHoe");
			boneArditeHoe = new InfiToolHoe(PHInfiTools.arditeHoeID + 6, InfiMaterialEnum.Ardite, InfiMaterialEnum.Bone, "boneArditeHoe");
			slimeArditeHoe = new InfiToolHoe(PHInfiTools.arditeHoeID + 7, InfiMaterialEnum.Ardite, InfiMaterialEnum.Slime, "slimeArditeHoe");
			cactusArditeHoe = new InfiToolHoe(PHInfiTools.arditeHoeID + 8, InfiMaterialEnum.Ardite, InfiMaterialEnum.Cactus, "cactusArditeHoe");
			blazeArditeHoe = new InfiToolHoe(PHInfiTools.arditeHoeID + 9, InfiMaterialEnum.Ardite, InfiMaterialEnum.Blaze, "blazeArditeHoe");
			copperArditeHoe = new InfiToolHoe(PHInfiTools.arditeHoeID + 10, InfiMaterialEnum.Ardite, InfiMaterialEnum.Copper, "copperArditeHoe");
			bronzeArditeHoe = new InfiToolHoe(PHInfiTools.arditeHoeID + 11, InfiMaterialEnum.Ardite, InfiMaterialEnum.Bronze, "bronzeArditeHoe");
			workedArditeHoe = new InfiToolHoe(PHInfiTools.arditeHoeID + 12, InfiMaterialEnum.Ardite, InfiMaterialEnum.WorkedIron, "workedArditeHoe");
			steelArditeHoe = new InfiToolHoe(PHInfiTools.arditeHoeID + 13, InfiMaterialEnum.Ardite, InfiMaterialEnum.Steel, "steelArditeHoe");
			cobaltArditeHoe = new InfiToolHoe(PHInfiTools.arditeHoeID + 14, InfiMaterialEnum.Ardite, InfiMaterialEnum.Cobalt, "cobaltArditeHoe");
			arditeArditeHoe = new InfiToolHoe(PHInfiTools.arditeHoeID + 15, InfiMaterialEnum.Ardite, InfiMaterialEnum.Ardite, "arditeArditeHoe");
			manyullynArditeHoe = new InfiToolHoe(PHInfiTools.arditeHoeID + 16, InfiMaterialEnum.Ardite, InfiMaterialEnum.Manyullyn, "manyullynArditeHoe");
			uraniumArditeHoe = new InfiToolHoe(PHInfiTools.arditeHoeID + 17, InfiMaterialEnum.Ardite, InfiMaterialEnum.Uranium, "uraniumArditeHoe");

			MinecraftForge.setToolClass(woodArditeHoe, "Hoe", InfiMaterialEnum.Ardite.getHarvestLevel());
			MinecraftForge.setToolClass(stoneArditeHoe, "Hoe", InfiMaterialEnum.Ardite.getHarvestLevel());
			MinecraftForge.setToolClass(ironArditeHoe, "Hoe", InfiMaterialEnum.Ardite.getHarvestLevel());
			MinecraftForge.setToolClass(diamondArditeHoe, "Hoe", InfiMaterialEnum.Ardite.getHarvestLevel());
			MinecraftForge.setToolClass(redstoneArditeHoe, "Hoe", InfiMaterialEnum.Ardite.getHarvestLevel());
			MinecraftForge.setToolClass(obsidianArditeHoe, "Hoe", InfiMaterialEnum.Ardite.getHarvestLevel());
			MinecraftForge.setToolClass(boneArditeHoe, "Hoe", InfiMaterialEnum.Ardite.getHarvestLevel());
			MinecraftForge.setToolClass(slimeArditeHoe, "Hoe", InfiMaterialEnum.Ardite.getHarvestLevel());
			MinecraftForge.setToolClass(cactusArditeHoe, "Hoe", InfiMaterialEnum.Ardite.getHarvestLevel());
			MinecraftForge.setToolClass(blazeArditeHoe, "Hoe", InfiMaterialEnum.Ardite.getHarvestLevel());
			MinecraftForge.setToolClass(copperArditeHoe, "Hoe", InfiMaterialEnum.Ardite.getHarvestLevel());
			MinecraftForge.setToolClass(bronzeArditeHoe, "Hoe", InfiMaterialEnum.Ardite.getHarvestLevel());
			MinecraftForge.setToolClass(workedArditeHoe, "Hoe", InfiMaterialEnum.Ardite.getHarvestLevel());
			MinecraftForge.setToolClass(steelArditeHoe, "Hoe", InfiMaterialEnum.Ardite.getHarvestLevel());
			MinecraftForge.setToolClass(cobaltArditeHoe, "Hoe", InfiMaterialEnum.Ardite.getHarvestLevel());
			MinecraftForge.setToolClass(arditeArditeHoe, "Hoe", InfiMaterialEnum.Ardite.getHarvestLevel());
			MinecraftForge.setToolClass(manyullynArditeHoe, "Hoe", InfiMaterialEnum.Ardite.getHarvestLevel());
			MinecraftForge.setToolClass(uraniumArditeHoe, "Hoe", InfiMaterialEnum.Ardite.getHarvestLevel());
		}

		if (PHInfiTools.enableManyullynTools)
		{
			woodManyullynHoe = new InfiToolHoe(PHInfiTools.manyullynHoeID + 0, InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Wood, "woodManyullynHoe");
			stoneManyullynHoe = new InfiToolHoe(PHInfiTools.manyullynHoeID + 1, InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Stone, "stoneManyullynHoe");
			ironManyullynHoe = new InfiToolHoe(PHInfiTools.manyullynHoeID + 2, InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Iron, "ironManyullynHoe");
			diamondManyullynHoe = new InfiToolHoe(PHInfiTools.manyullynHoeID + 3, InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Diamond, "diamondManyullynHoe");
			redstoneManyullynHoe = new InfiToolHoe(PHInfiTools.manyullynHoeID + 4, InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Redstone, "redstoneManyullynHoe");
			obsidianManyullynHoe = new InfiToolHoe(PHInfiTools.manyullynHoeID + 5, InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Obsidian, "obsidianManyullynHoe");
			boneManyullynHoe = new InfiToolHoe(PHInfiTools.manyullynHoeID + 6, InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Bone, "boneManyullynHoe");
			slimeManyullynHoe = new InfiToolHoe(PHInfiTools.manyullynHoeID + 7, InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Slime, "slimeManyullynHoe");
			cactusManyullynHoe = new InfiToolHoe(PHInfiTools.manyullynHoeID + 8, InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Cactus, "cactusManyullynHoe");
			blazeManyullynHoe = new InfiToolHoe(PHInfiTools.manyullynHoeID + 9, InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Blaze, "blazeManyullynHoe");
			copperManyullynHoe = new InfiToolHoe(PHInfiTools.manyullynHoeID + 10, InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Copper, "copperManyullynHoe");
			bronzeManyullynHoe = new InfiToolHoe(PHInfiTools.manyullynHoeID + 11, InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Bronze, "bronzeManyullynHoe");
			workedManyullynHoe = new InfiToolHoe(PHInfiTools.manyullynHoeID + 12, InfiMaterialEnum.Manyullyn, InfiMaterialEnum.WorkedIron, "workedManyullynHoe");
			steelManyullynHoe = new InfiToolHoe(PHInfiTools.manyullynHoeID + 13, InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Steel, "steelManyullynHoe");
			cobaltManyullynHoe = new InfiToolHoe(PHInfiTools.manyullynHoeID + 14, InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Cobalt, "cobaltManyullynHoe");
			arditeManyullynHoe = new InfiToolHoe(PHInfiTools.manyullynHoeID + 15, InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Ardite, "arditeManyullynHoe");
			manyullynManyullynHoe = new InfiToolHoe(PHInfiTools.manyullynHoeID + 16, InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Manyullyn, "manyullynManyullynHoe");
			uraniumManyullynHoe = new InfiToolHoe(PHInfiTools.manyullynHoeID + 17, InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Uranium, "uraniumManyullynHoe");

			MinecraftForge.setToolClass(woodManyullynHoe, "Hoe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
			MinecraftForge.setToolClass(stoneManyullynHoe, "Hoe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
			MinecraftForge.setToolClass(ironManyullynHoe, "Hoe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
			MinecraftForge.setToolClass(diamondManyullynHoe, "Hoe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
			MinecraftForge.setToolClass(redstoneManyullynHoe, "Hoe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
			MinecraftForge.setToolClass(obsidianManyullynHoe, "Hoe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
			MinecraftForge.setToolClass(boneManyullynHoe, "Hoe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
			MinecraftForge.setToolClass(slimeManyullynHoe, "Hoe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
			MinecraftForge.setToolClass(cactusManyullynHoe, "Hoe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
			MinecraftForge.setToolClass(blazeManyullynHoe, "Hoe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
			MinecraftForge.setToolClass(copperManyullynHoe, "Hoe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
			MinecraftForge.setToolClass(bronzeManyullynHoe, "Hoe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
			MinecraftForge.setToolClass(workedManyullynHoe, "Hoe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
			MinecraftForge.setToolClass(steelManyullynHoe, "Hoe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
			MinecraftForge.setToolClass(cobaltManyullynHoe, "Hoe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
			MinecraftForge.setToolClass(arditeManyullynHoe, "Hoe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
			MinecraftForge.setToolClass(manyullynManyullynHoe, "Hoe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
			MinecraftForge.setToolClass(uraniumManyullynHoe, "Hoe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
		}

		if (PHInfiTools.enableUraniumTools)
		{
			diamondUraniumHoe = new InfiToolHoe(PHInfiTools.uraniumHoeID + 0, InfiMaterialEnum.Uranium, InfiMaterialEnum.Diamond, "diamondUraniumHoe");
			redstoneUraniumHoe = new InfiToolHoe(PHInfiTools.uraniumHoeID + 1, InfiMaterialEnum.Uranium, InfiMaterialEnum.Redstone, "redstoneUraniumHoe");
			boneUraniumHoe = new InfiToolHoe(PHInfiTools.uraniumHoeID + 2, InfiMaterialEnum.Uranium, InfiMaterialEnum.Bone, "boneUraniumHoe");
			netherrackUraniumHoe = new InfiToolHoe(PHInfiTools.uraniumHoeID + 3, InfiMaterialEnum.Uranium, InfiMaterialEnum.Netherrack, "netherrackUraniumHoe");
			glowstoneUraniumHoe = new InfiToolHoe(PHInfiTools.uraniumHoeID + 4, InfiMaterialEnum.Uranium, InfiMaterialEnum.Glowstone, "glowstoneUraniumHoe");
			lavaUraniumHoe = new InfiToolHoe(PHInfiTools.uraniumHoeID + 5, InfiMaterialEnum.Uranium, InfiMaterialEnum.Lava, "lavaUraniumHoe");
			blazeUraniumHoe = new InfiToolHoe(PHInfiTools.uraniumHoeID + 6, InfiMaterialEnum.Uranium, InfiMaterialEnum.Blaze, "blazeUraniumHoe");
			cobaltUraniumHoe = new InfiToolHoe(PHInfiTools.uraniumHoeID + 7, InfiMaterialEnum.Uranium, InfiMaterialEnum.Cobalt, "cobaltUraniumHoe");
			arditeUraniumHoe = new InfiToolHoe(PHInfiTools.uraniumHoeID + 8, InfiMaterialEnum.Uranium, InfiMaterialEnum.Ardite, "arditeUraniumHoe");
			uraniumUraniumHoe = new InfiToolHoe(PHInfiTools.uraniumHoeID + 9, InfiMaterialEnum.Uranium, InfiMaterialEnum.Uranium, "uraniumUraniumHoe");

			MinecraftForge.setToolClass(diamondUraniumHoe, "Hoe", InfiMaterialEnum.Uranium.getHarvestLevel());
			MinecraftForge.setToolClass(redstoneUraniumHoe, "Hoe", InfiMaterialEnum.Uranium.getHarvestLevel());
			MinecraftForge.setToolClass(boneUraniumHoe, "Hoe", InfiMaterialEnum.Uranium.getHarvestLevel());
			MinecraftForge.setToolClass(netherrackUraniumHoe, "Hoe", InfiMaterialEnum.Uranium.getHarvestLevel());
			MinecraftForge.setToolClass(glowstoneUraniumHoe, "Hoe", InfiMaterialEnum.Uranium.getHarvestLevel());
			MinecraftForge.setToolClass(lavaUraniumHoe, "Hoe", InfiMaterialEnum.Uranium.getHarvestLevel());
			MinecraftForge.setToolClass(blazeUraniumHoe, "Hoe", InfiMaterialEnum.Uranium.getHarvestLevel());
			MinecraftForge.setToolClass(cobaltUraniumHoe, "Hoe", InfiMaterialEnum.Uranium.getHarvestLevel());
			MinecraftForge.setToolClass(arditeUraniumHoe, "Hoe", InfiMaterialEnum.Uranium.getHarvestLevel());
			MinecraftForge.setToolClass(uraniumUraniumHoe, "Hoe", InfiMaterialEnum.Uranium.getHarvestLevel());
		}
	}

	private static void addNames()
	{
		if (PHInfiTools.enableWoodTools && PHInfiTools.overwriteVanillaTools)
			LanguageRegistry.instance().addName(woodWoodHoe, "Wooden Hoe");
		if (PHInfiTools.enableStoneTools)
			LanguageRegistry.instance().addName(stoneStoneHoe, "Heavy Hoe");
		if (PHInfiTools.enableIronTools)
			LanguageRegistry.instance().addName(ironIronHoe, "Ironic Hoe");
		if (PHInfiTools.enableDiamondTools)
			LanguageRegistry.instance().addName(diamondDiamondHoe, "Diamondium Hoe");
		if (PHInfiTools.enableRedstoneTools)
			LanguageRegistry.instance().addName(redstoneRedstoneHoe, "Redredred Hoe");
		if (PHInfiTools.enableObsidianTools)
			LanguageRegistry.instance().addName(obsidianObsidianHoe, "Ebony Hoe");
		if (PHInfiTools.enableSandstoneTools)
			LanguageRegistry.instance().addName(sandstoneSandstoneHoe, "Fragile Hoe");
		if (PHInfiTools.enableNetherrackTools)
			LanguageRegistry.instance().addName(boneBoneHoe, "Necrotic Hoe");
		if (PHInfiTools.enablePaperTools)
			LanguageRegistry.instance().addName(paperPaperHoe, "Soft Hoe");
		if (PHInfiTools.enableMossyTools)
			LanguageRegistry.instance().addName(mossyMossyHoe, "Living Hoe");
		if (PHInfiTools.enableNetherrackTools)
			LanguageRegistry.instance().addName(netherrackNetherrackHoe, "Bloodsoaked Hoe");
		if (PHInfiTools.enableGlowstoneTools)
			LanguageRegistry.instance().addName(glowstoneGlowstoneHoe, "Bright Hoe");
		if (PHInfiTools.enableIceTools)
			LanguageRegistry.instance().addName(iceIceHoe, "Freezing Hoe");
		if (PHInfiTools.enableLavaTools)
			LanguageRegistry.instance().addName(lavaLavaHoe, "Burning Hoe");
		if (PHInfiTools.enableSlimeTools)
			LanguageRegistry.instance().addName(slimeSlimeHoe, "Toy Hoe");
		if (PHInfiTools.enableCactusTools)
			LanguageRegistry.instance().addName(cactusCactusHoe, "Thorned Hoe");
		if (PHInfiTools.enableFlintTools)
			LanguageRegistry.instance().addName(flintFlintHoe, "Rough-hewn Hoe");
		if (PHInfiTools.enableBlazeTools)
			LanguageRegistry.instance().addName(blazeBlazeHoe, "Netherite Hoe");
		if (PHInfiTools.enableCopperTools)
			LanguageRegistry.instance().addName(copperCopperHoe, "Orange-Tang Hoe");
		if (PHInfiTools.enableBronzeTools)
			LanguageRegistry.instance().addName(bronzeBronzeHoe, "Polished Hoe");
		if (PHInfiTools.enableWorkedIronTools)
			LanguageRegistry.instance().addName(workedWorkedIronHoe, "Reworked Iron Hoe");
		if (PHInfiTools.enableSteelTools)
			LanguageRegistry.instance().addName(steelSteelHoe, "Forge-Wrought Hoe");
		if (PHInfiTools.enableCobaltTools)
			LanguageRegistry.instance().addName(cobaltCobaltHoe, "Beautiful Hoe");
		if (PHInfiTools.enableArditeTools)
			LanguageRegistry.instance().addName(arditeArditeHoe, "Rustic Hoe");
		if (PHInfiTools.enableManyullynTools)
			LanguageRegistry.instance().addName(manyullynManyullynHoe, "False-Prophetic Hoe");
		if (PHInfiTools.enableUraniumTools)
			LanguageRegistry.instance().addName(uraniumUraniumHoe, "Cancerous Hoe");
	}

	public static void registerInfiToolsRecipes()
	{
		if (PHInfiTools.enableWoodTools)
		{
			if (PHInfiTools.overwriteVanillaTools)
				GameRegistry.addRecipe(new ItemStack(woodWoodHoe), recipe, '#', Block.planks, '|', Item.stick);
			GameRegistry.addRecipe(new ItemStack(sandstoneWoodHoe), recipe, '#', Block.planks, '|', InfiLibrary.sandstoneRod );
			GameRegistry.addRecipe(new ItemStack(boneWoodHoe), recipe, '#', Block.planks, '|', Item.bone );
			GameRegistry.addRecipe(new ItemStack(boneWoodHoe), recipe, '#', Block.planks, '|', InfiLibrary.boneRod );
			GameRegistry.addRecipe(new ItemStack(paperWoodHoe), recipe, '#', Block.planks, '|', InfiLibrary.paperRod );
			GameRegistry.addRecipe(new ItemStack(iceWoodHoe), recipe, '#', Block.planks, '|', InfiLibrary.iceRod );
			GameRegistry.addRecipe(new ItemStack(slimeWoodHoe), recipe, '#', Block.planks, '|', InfiLibrary.slimeRod );
			GameRegistry.addRecipe(new ItemStack(cactusWoodHoe), recipe, '#', Block.planks, '|', InfiLibrary.cactusRod );
		}

		if (PHInfiTools.enableStoneTools)
		{
			if (PHInfiTools.overwriteVanillaTools)
				GameRegistry.addRecipe(new ItemStack(woodStoneHoe), recipe, '#', Block.cobblestone, '|', Item.stick);
			GameRegistry.addRecipe(new ItemStack(stoneStoneHoe), recipe, '#', Block.cobblestone, '|', InfiLibrary.stoneRod );
			GameRegistry.addRecipe(new ItemStack(sandstoneStoneHoe), recipe, '#', Block.cobblestone, '|', InfiLibrary.sandstoneRod );
			GameRegistry.addRecipe(new ItemStack(boneStoneHoe), recipe, '#', Block.cobblestone, '|', Item.bone );
			GameRegistry.addRecipe(new ItemStack(boneStoneHoe), recipe, '#', Block.cobblestone, '|', InfiLibrary.boneRod );
			GameRegistry.addRecipe(new ItemStack(netherrackStoneHoe), recipe, '#', Block.cobblestone, '|', InfiLibrary.netherrackRod );
			GameRegistry.addRecipe(new ItemStack(iceStoneHoe), recipe, '#', Block.cobblestone, '|', InfiLibrary.iceRod );
			GameRegistry.addRecipe(new ItemStack(slimeStoneHoe), recipe, '#', Block.cobblestone, '|', InfiLibrary.slimeRod );
			GameRegistry.addRecipe(new ItemStack(cactusStoneHoe), recipe, '#', Block.cobblestone, '|', InfiLibrary.cactusRod );
			GameRegistry.addRecipe(new ItemStack(flintStoneHoe), recipe, '#', Block.cobblestone, '|', InfiLibrary.flintRod );

			if (PHInfiTools.overwriteVanillaTools)
				GameRegistry.addRecipe(new ItemStack(woodStoneHoe), recipe, '#', Block.stone, '|', Item.stick);
			GameRegistry.addRecipe(new ItemStack(stoneStoneHoe), recipe, '#', Block.stone, '|', InfiLibrary.stoneRod );
			GameRegistry.addRecipe(new ItemStack(sandstoneStoneHoe), recipe, '#', Block.stone, '|', InfiLibrary.sandstoneRod );
			GameRegistry.addRecipe(new ItemStack(boneStoneHoe), recipe, '#', Block.stone, '|', Item.bone );
			GameRegistry.addRecipe(new ItemStack(boneStoneHoe), recipe, '#', Block.stone, '|', InfiLibrary.boneRod );
			GameRegistry.addRecipe(new ItemStack(netherrackStoneHoe), recipe, '#', Block.stone, '|', InfiLibrary.netherrackRod );
			GameRegistry.addRecipe(new ItemStack(iceStoneHoe), recipe, '#', Block.stone, '|', InfiLibrary.iceRod );
			GameRegistry.addRecipe(new ItemStack(slimeStoneHoe), recipe, '#', Block.stone, '|', InfiLibrary.slimeRod );
			GameRegistry.addRecipe(new ItemStack(cactusStoneHoe), recipe, '#', Block.stone, '|', InfiLibrary.cactusRod );
			GameRegistry.addRecipe(new ItemStack(flintStoneHoe), recipe, '#', Block.stone, '|', InfiLibrary.flintRod );
		}

		if (PHInfiTools.enableIronTools)
		{
			if (PHInfiTools.overwriteVanillaTools)
				GameRegistry.addRecipe(new ItemStack(woodIronHoe), recipe, '#', Item.ingotIron, '|', Item.stick);
			GameRegistry.addRecipe(new ItemStack(stoneIronHoe), recipe, '#', Item.ingotIron, '|', InfiLibrary.stoneRod );
			GameRegistry.addRecipe(new ItemStack(ironIronHoe), recipe, '#', Item.ingotIron, '|', InfiLibrary.ironRod );
			GameRegistry.addRecipe(new ItemStack(boneIronHoe), recipe, '#', Item.ingotIron, '|', Item.bone );
			GameRegistry.addRecipe(new ItemStack(boneIronHoe), recipe, '#', Item.ingotIron, '|', InfiLibrary.boneRod );
			GameRegistry.addRecipe(new ItemStack(netherrackIronHoe), recipe, '#', Item.ingotIron, '|', InfiLibrary.netherrackRod );
			GameRegistry.addRecipe(new ItemStack(glowstoneIronHoe), recipe, '#', Item.ingotIron, '|', InfiLibrary.glowstoneRod );
			GameRegistry.addRecipe(new ItemStack(cactusIronHoe), recipe, '#', Item.ingotIron, '|', InfiLibrary.cactusRod );
			GameRegistry.addRecipe(new ItemStack(copperIronHoe), recipe, '#', Item.ingotIron, '|', InfiLibrary.copperRod );
			GameRegistry.addRecipe(new ItemStack(bronzeIronHoe), recipe, '#', Item.ingotIron, '|', InfiLibrary.bronzeRod );
		}

		if (PHInfiTools.enableDiamondTools)
		{
			if (PHInfiTools.overwriteVanillaTools)
				GameRegistry.addRecipe(new ItemStack(woodDiamondHoe), recipe, '#', Item.diamond, '|', Item.stick);
			GameRegistry.addRecipe(new ItemStack(stoneDiamondHoe), recipe, '#', Item.diamond, '|', InfiLibrary.stoneRod );
			GameRegistry.addRecipe(new ItemStack(ironDiamondHoe), recipe, '#', Item.diamond, '|', InfiLibrary.ironRod );
			GameRegistry.addRecipe(new ItemStack(diamondDiamondHoe), recipe, '#', Item.diamond, '|', InfiLibrary.diamondRod );
			GameRegistry.addRecipe(new ItemStack(redstoneDiamondHoe), recipe, '#', Item.diamond, '|', InfiLibrary.redstoneRod );
			GameRegistry.addRecipe(new ItemStack(obsidianDiamondHoe), recipe, '#', Item.diamond, '|', InfiLibrary.obsidianRod );
			GameRegistry.addRecipe(new ItemStack(boneDiamondHoe), recipe, '#', Item.diamond, '|', Item.bone );
			GameRegistry.addRecipe(new ItemStack(boneDiamondHoe), recipe, '#', Item.diamond, '|', InfiLibrary.boneRod );
			GameRegistry.addRecipe(new ItemStack(mossyDiamondHoe), recipe, '#', Item.diamond, '|', InfiLibrary.mossyRod );
			GameRegistry.addRecipe(new ItemStack(netherrackDiamondHoe), recipe, '#', Item.diamond, '|', InfiLibrary.netherrackRod );
			GameRegistry.addRecipe(new ItemStack(glowstoneDiamondHoe), recipe, '#', Item.diamond, '|', InfiLibrary.glowstoneRod );
			GameRegistry.addRecipe(new ItemStack(lavaDiamondHoe), recipe, '#', Item.diamond, '|', InfiLibrary.lavaRod );
			GameRegistry.addRecipe(new ItemStack(cactusDiamondHoe), recipe, '#', Item.diamond, '|', InfiLibrary.cactusRod );
			GameRegistry.addRecipe(new ItemStack(flintDiamondHoe), recipe, '#', Item.diamond, '|', InfiLibrary.flintRod );
			GameRegistry.addRecipe(new ItemStack(blazeDiamondHoe), recipe, '#', Item.diamond, '|', Item.blazeRod );
			GameRegistry.addRecipe(new ItemStack(copperDiamondHoe), recipe, '#', Item.diamond, '|', InfiLibrary.copperRod );
			GameRegistry.addRecipe(new ItemStack(bronzeDiamondHoe), recipe, '#', Item.diamond, '|', InfiLibrary.bronzeRod );
			GameRegistry.addRecipe(new ItemStack(workedDiamondHoe), recipe, '#', Item.diamond, '|', InfiLibrary.workedIronRod );
			GameRegistry.addRecipe(new ItemStack(steelDiamondHoe), recipe, '#', Item.diamond, '|', InfiLibrary.steelRod );
			GameRegistry.addRecipe(new ItemStack(cobaltDiamondHoe), recipe, '#', Item.diamond, '|', InfiLibrary.cobaltRod );
			GameRegistry.addRecipe(new ItemStack(arditeDiamondHoe), recipe, '#', Item.diamond, '|', InfiLibrary.arditeRod );
			GameRegistry.addRecipe(new ItemStack(manyullynDiamondHoe), recipe, '#', Item.diamond, '|', InfiLibrary.manyullynRod );
			GameRegistry.addRecipe(new ItemStack(uraniumDiamondHoe), recipe, '#', Item.diamond, '|', InfiLibrary.uraniumRod );
		}

		if (PHInfiTools.enableRedstoneTools)
		{
			GameRegistry.addRecipe(new ItemStack(woodRedstoneHoe), recipe, '#', InfiLibrary.redstoneCrystal, '|', Item.stick );
			GameRegistry.addRecipe(new ItemStack(stoneRedstoneHoe), recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.stoneRod );
			GameRegistry.addRecipe(new ItemStack(ironRedstoneHoe), recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.ironRod );
			GameRegistry.addRecipe(new ItemStack(redstoneRedstoneHoe), recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.redstoneRod );
			GameRegistry.addRecipe(new ItemStack(obsidianRedstoneHoe), recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.obsidianRod );
			GameRegistry.addRecipe(new ItemStack(sandstoneRedstoneHoe), recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.sandstoneRod );
			GameRegistry.addRecipe(new ItemStack(boneRedstoneHoe), recipe, '#', InfiLibrary.redstoneCrystal, '|', Item.bone );
			GameRegistry.addRecipe(new ItemStack(boneRedstoneHoe), recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.boneRod );
			GameRegistry.addRecipe(new ItemStack(paperRedstoneHoe), recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.paperRod );
			GameRegistry.addRecipe(new ItemStack(mossyRedstoneHoe), recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.mossyRod );
			GameRegistry.addRecipe(new ItemStack(netherrackRedstoneHoe), recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.netherrackRod );
			GameRegistry.addRecipe(new ItemStack(glowstoneRedstoneHoe), recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.glowstoneRod );
			GameRegistry.addRecipe(new ItemStack(iceRedstoneHoe), recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.iceRod );
			GameRegistry.addRecipe(new ItemStack(lavaRedstoneHoe), recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.lavaRod );
			GameRegistry.addRecipe(new ItemStack(slimeRedstoneHoe), recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.slimeRod );
			GameRegistry.addRecipe(new ItemStack(cactusRedstoneHoe), recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.cactusRod );
			GameRegistry.addRecipe(new ItemStack(flintRedstoneHoe), recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.flintRod );
			GameRegistry.addRecipe(new ItemStack(copperRedstoneHoe), recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.copperRod );
			GameRegistry.addRecipe(new ItemStack(bronzeRedstoneHoe), recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.bronzeRod );
			GameRegistry.addRecipe(new ItemStack(workedRedstoneHoe), recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.workedIronRod );
			GameRegistry.addRecipe(new ItemStack(uraniumRedstoneHoe), recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.uraniumRod );
		}

		if (PHInfiTools.enableObsidianTools)
		{
			GameRegistry.addRecipe(new ItemStack(woodObsidianHoe), recipe, '#', Block.obsidian, '|', Item.stick );
			GameRegistry.addRecipe(new ItemStack(stoneObsidianHoe), recipe, '#', Block.obsidian, '|', InfiLibrary.stoneRod );
			GameRegistry.addRecipe(new ItemStack(redstoneObsidianHoe), recipe, '#', Block.obsidian, '|', InfiLibrary.redstoneRod );
			GameRegistry.addRecipe(new ItemStack(obsidianObsidianHoe), recipe, '#', Block.obsidian, '|', InfiLibrary.obsidianRod );
			GameRegistry.addRecipe(new ItemStack(boneObsidianHoe), recipe, '#', Block.obsidian, '|', Item.bone );
			GameRegistry.addRecipe(new ItemStack(boneObsidianHoe), recipe, '#', Block.obsidian, '|', InfiLibrary.boneRod );
			GameRegistry.addRecipe(new ItemStack(netherrackObsidianHoe), recipe, '#', Block.obsidian, '|', InfiLibrary.netherrackRod );
			GameRegistry.addRecipe(new ItemStack(glowstoneObsidianHoe), recipe, '#', Block.obsidian, '|', InfiLibrary.glowstoneRod );
			GameRegistry.addRecipe(new ItemStack(iceObsidianHoe), recipe, '#', Block.obsidian, '|', InfiLibrary.iceRod );
			GameRegistry.addRecipe(new ItemStack(lavaObsidianHoe), recipe, '#', Block.obsidian, '|', InfiLibrary.lavaRod );
			GameRegistry.addRecipe(new ItemStack(cactusObsidianHoe), recipe, '#', Block.obsidian, '|', InfiLibrary.cactusRod );
		}

		if (PHInfiTools.enableSandstoneTools)
		{
			GameRegistry.addRecipe(new ItemStack(woodSandstoneHoe), recipe, '#', Block.sandStone, '|', Item.stick );
			GameRegistry.addRecipe(new ItemStack(sandstoneSandstoneHoe), recipe, '#', Block.sandStone, '|', InfiLibrary.sandstoneRod );
			GameRegistry.addRecipe(new ItemStack(boneSandstoneHoe), recipe, '#', Block.sandStone, '|', Item.bone );
			GameRegistry.addRecipe(new ItemStack(boneSandstoneHoe), recipe, '#', Block.sandStone, '|', InfiLibrary.boneRod );
			GameRegistry.addRecipe(new ItemStack(netherrackSandstoneHoe), recipe, '#', Block.sandStone, '|', InfiLibrary.netherrackRod );
			GameRegistry.addRecipe(new ItemStack(iceSandstoneHoe), recipe, '#', Block.sandStone, '|', InfiLibrary.iceRod );
			GameRegistry.addRecipe(new ItemStack(slimeSandstoneHoe), recipe, '#', Block.sandStone, '|', InfiLibrary.slimeRod );
			GameRegistry.addRecipe(new ItemStack(cactusSandstoneHoe), recipe, '#', Block.sandStone, '|', InfiLibrary.cactusRod );
			GameRegistry.addRecipe(new ItemStack(flintSandstoneHoe), recipe, '#', Block.sandStone, '|', InfiLibrary.flintRod );
		}

		if (PHInfiTools.enableBoneTools)
		{
			GameRegistry.addRecipe(new ItemStack(woodBoneHoe), recipe, '#', Item.bone, '|', Item.stick );
			GameRegistry.addRecipe(new ItemStack(stoneBoneHoe), recipe, '#', Item.bone, '|', InfiLibrary.stoneRod );
			GameRegistry.addRecipe(new ItemStack(sandstoneBoneHoe), recipe, '#', Item.bone, '|', InfiLibrary.sandstoneRod );
			GameRegistry.addRecipe(new ItemStack(boneBoneHoe), recipe, '#', Item.bone, '|', Item.bone );
			GameRegistry.addRecipe(new ItemStack(boneBoneHoe), recipe, '#', Item.bone, '|', InfiLibrary.boneRod );
			GameRegistry.addRecipe(new ItemStack(paperBoneHoe), recipe, '#', Item.bone, '|', InfiLibrary.paperRod );
			GameRegistry.addRecipe(new ItemStack(netherrackBoneHoe), recipe, '#', Item.bone, '|', InfiLibrary.netherrackRod );
			GameRegistry.addRecipe(new ItemStack(iceBoneHoe), recipe, '#', Item.bone, '|', InfiLibrary.iceRod );
			GameRegistry.addRecipe(new ItemStack(cactusBoneHoe), recipe, '#', Item.bone, '|', InfiLibrary.cactusRod );
			GameRegistry.addRecipe(new ItemStack(flintBoneHoe), recipe, '#', Item.bone, '|', InfiLibrary.flintRod );
		}

		if (PHInfiTools.enablePaperTools)
		{
			GameRegistry.addRecipe(new ItemStack(woodPaperHoe), recipe, '#', InfiLibrary.paperStack, '|', Item.stick );
			GameRegistry.addRecipe(new ItemStack(bonePaperHoe), recipe, '#', InfiLibrary.paperStack, '|', Item.bone );
			GameRegistry.addRecipe(new ItemStack(bonePaperHoe), recipe, '#', InfiLibrary.paperStack, '|', InfiLibrary.boneRod );
			GameRegistry.addRecipe(new ItemStack(paperPaperHoe), recipe, '#', InfiLibrary.paperStack, '|', InfiLibrary.paperRod );
			GameRegistry.addRecipe(new ItemStack(slimePaperHoe), recipe, '#', InfiLibrary.paperStack, '|', InfiLibrary.slimeRod );
			GameRegistry.addRecipe(new ItemStack(cactusPaperHoe), recipe, '#', InfiLibrary.paperStack, '|', InfiLibrary.cactusRod );
		}

		if (PHInfiTools.enableMossyTools)
		{
			GameRegistry.addRecipe(new ItemStack(woodMossyHoe), recipe, '#', InfiLibrary.mossyStone, '|', Item.stick );
			GameRegistry.addRecipe(new ItemStack(stoneMossyHoe), recipe, '#', InfiLibrary.mossyStone, '|', InfiLibrary.stoneRod );
			GameRegistry.addRecipe(new ItemStack(diamondMossyHoe), recipe, '#', InfiLibrary.mossyStone, '|', InfiLibrary.diamondRod );
			GameRegistry.addRecipe(new ItemStack(redstoneMossyHoe), recipe, '#', InfiLibrary.mossyStone, '|', InfiLibrary.redstoneRod );
			GameRegistry.addRecipe(new ItemStack(boneMossyHoe), recipe, '#', InfiLibrary.mossyStone, '|', Item.bone );
			GameRegistry.addRecipe(new ItemStack(boneMossyHoe), recipe, '#', InfiLibrary.mossyStone, '|', InfiLibrary.boneRod );
			GameRegistry.addRecipe(new ItemStack(mossyMossyHoe), recipe, '#', InfiLibrary.mossyStone, '|', InfiLibrary.mossyRod );
			GameRegistry.addRecipe(new ItemStack(netherrackMossyHoe), recipe, '#', InfiLibrary.mossyStone, '|', InfiLibrary.netherrackRod );
			GameRegistry.addRecipe(new ItemStack(glowstoneMossyHoe), recipe, '#', InfiLibrary.mossyStone, '|', InfiLibrary.glowstoneRod );
			GameRegistry.addRecipe(new ItemStack(cactusMossyHoe), recipe, '#', InfiLibrary.mossyStone, '|', InfiLibrary.cactusRod );
			GameRegistry.addRecipe(new ItemStack(blazeMossyHoe), recipe, '#', InfiLibrary.mossyStone, '|', Item.blazeRod );
			GameRegistry.addRecipe(new ItemStack(manyullynMossyHoe), recipe, '#', InfiLibrary.mossyStone, '|', InfiLibrary.manyullynRod );
			GameRegistry.addRecipe(new ItemStack(uraniumMossyHoe), recipe, '#', InfiLibrary.mossyStone, '|', InfiLibrary.uraniumRod );
		}

		if (PHInfiTools.enableNetherrackTools)
		{
			GameRegistry.addRecipe(new ItemStack(woodNetherrackHoe), recipe, '#', Block.netherrack, '|', Item.stick );
			GameRegistry.addRecipe(new ItemStack(stoneNetherrackHoe), recipe, '#', Block.netherrack, '|', InfiLibrary.stoneRod );
			GameRegistry.addRecipe(new ItemStack(sandstoneNetherrackHoe), recipe, '#', Block.netherrack, '|', InfiLibrary.sandstoneRod );
			GameRegistry.addRecipe(new ItemStack(boneNetherrackHoe), recipe, '#', Block.netherrack, '|', Item.bone );
			GameRegistry.addRecipe(new ItemStack(boneNetherrackHoe), recipe, '#', Block.netherrack, '|', InfiLibrary.boneRod );
			GameRegistry.addRecipe(new ItemStack(paperNetherrackHoe), recipe, '#', Block.netherrack, '|', InfiLibrary.paperRod );
			GameRegistry.addRecipe(new ItemStack(mossyNetherrackHoe), recipe, '#', Block.netherrack, '|', InfiLibrary.mossyRod );
			GameRegistry.addRecipe(new ItemStack(netherrackNetherrackHoe), recipe, '#', Block.netherrack, '|', InfiLibrary.netherrackRod );
			GameRegistry.addRecipe(new ItemStack(iceNetherrackHoe), recipe, '#', Block.netherrack, '|', InfiLibrary.iceRod );
			GameRegistry.addRecipe(new ItemStack(slimeNetherrackHoe), recipe, '#', Block.netherrack, '|', InfiLibrary.slimeRod );
			GameRegistry.addRecipe(new ItemStack(cactusNetherrackHoe), recipe, '#', Block.netherrack, '|', InfiLibrary.cactusRod );
			GameRegistry.addRecipe(new ItemStack(flintNetherrackHoe), recipe, '#', Block.netherrack, '|', InfiLibrary.flintRod );
			GameRegistry.addRecipe(new ItemStack(copperNetherrackHoe), recipe, '#', Block.netherrack, '|', InfiLibrary.copperRod );
			GameRegistry.addRecipe(new ItemStack(bronzeNetherrackHoe), recipe, '#', Block.netherrack, '|', InfiLibrary.bronzeRod );
		}

		if (PHInfiTools.enableGlowstoneTools)
		{
			GameRegistry.addRecipe(new ItemStack(woodGlowstoneHoe), recipe, '#', InfiLibrary.glowstoneCrystal, '|', Item.stick );
			GameRegistry.addRecipe(new ItemStack(redstoneGlowstoneHoe), recipe, '#', InfiLibrary.glowstoneCrystal, '|', InfiLibrary.redstoneRod );
			GameRegistry.addRecipe(new ItemStack(obsidianGlowstoneHoe), recipe, '#', InfiLibrary.glowstoneCrystal, '|', InfiLibrary.obsidianRod );
			GameRegistry.addRecipe(new ItemStack(boneGlowstoneHoe), recipe, '#', InfiLibrary.glowstoneCrystal, '|', Item.bone );
			GameRegistry.addRecipe(new ItemStack(boneGlowstoneHoe), recipe, '#', InfiLibrary.glowstoneCrystal, '|', InfiLibrary.boneRod );
			GameRegistry.addRecipe(new ItemStack(netherrackGlowstoneHoe), recipe, '#', InfiLibrary.glowstoneCrystal, '|', InfiLibrary.netherrackRod );
			GameRegistry.addRecipe(new ItemStack(glowstoneGlowstoneHoe), recipe, '#', InfiLibrary.glowstoneCrystal, '|', InfiLibrary.glowstoneRod );
			GameRegistry.addRecipe(new ItemStack(iceGlowstoneHoe), recipe, '#', InfiLibrary.glowstoneCrystal, '|', InfiLibrary.iceRod );
			GameRegistry.addRecipe(new ItemStack(slimeGlowstoneHoe), recipe, '#', InfiLibrary.glowstoneCrystal, '|', InfiLibrary.slimeRod );
			GameRegistry.addRecipe(new ItemStack(cactusGlowstoneHoe), recipe, '#', InfiLibrary.glowstoneCrystal, '|', InfiLibrary.cactusRod );
		}

		if (PHInfiTools.enableIceTools)
		{
			GameRegistry.addRecipe(new ItemStack(woodIceHoe), recipe, '#', Block.ice, '|', Item.stick );
			GameRegistry.addRecipe(new ItemStack(boneIceHoe), recipe, '#', Block.ice, '|', Item.bone );
			GameRegistry.addRecipe(new ItemStack(boneIceHoe), recipe, '#', Block.ice, '|', InfiLibrary.boneRod );
			GameRegistry.addRecipe(new ItemStack(paperIceHoe), recipe, '#', Block.ice, '|', InfiLibrary.paperRod );
			GameRegistry.addRecipe(new ItemStack(iceIceHoe), recipe, '#', Block.ice, '|', InfiLibrary.iceRod );
			GameRegistry.addRecipe(new ItemStack(slimeIceHoe), recipe, '#', Block.ice, '|', InfiLibrary.slimeRod );
			GameRegistry.addRecipe(new ItemStack(cactusIceHoe), recipe, '#', Block.ice, '|', InfiLibrary.cactusRod );
		}

		if (PHInfiTools.enableLavaTools)
		{
			GameRegistry.addRecipe(new ItemStack(diamondLavaHoe), recipe, '#', InfiLibrary.lavaCrystal, '|', InfiLibrary.diamondRod );
			GameRegistry.addRecipe(new ItemStack(obsidianLavaHoe), recipe, '#', InfiLibrary.lavaCrystal, '|', InfiLibrary.obsidianRod );
			GameRegistry.addRecipe(new ItemStack(netherrackLavaHoe), recipe, '#', InfiLibrary.lavaCrystal, '|', InfiLibrary.netherrackRod );
			GameRegistry.addRecipe(new ItemStack(lavaLavaHoe), recipe, '#', InfiLibrary.lavaCrystal, '|', InfiLibrary.lavaRod );
			GameRegistry.addRecipe(new ItemStack(flintLavaHoe), recipe, '#', InfiLibrary.lavaCrystal, '|', InfiLibrary.flintRod );
			GameRegistry.addRecipe(new ItemStack(blazeLavaHoe), recipe, '#', InfiLibrary.lavaCrystal, '|', Item.blazeRod );
			GameRegistry.addRecipe(new ItemStack(manyullynLavaHoe), recipe, '#', InfiLibrary.lavaCrystal, '|', InfiLibrary.manyullynRod );
			GameRegistry.addRecipe(new ItemStack(uraniumLavaHoe), recipe, '#', InfiLibrary.lavaCrystal, '|', InfiLibrary.uraniumRod );
		}

		if (PHInfiTools.enableSlimeTools)
		{
			GameRegistry.addRecipe(new ItemStack(woodSlimeHoe), recipe, '#', InfiLibrary.slimeCrystal, '|', Item.stick );
			GameRegistry.addRecipe(new ItemStack(sandstoneSlimeHoe), recipe, '#', InfiLibrary.slimeCrystal, '|', InfiLibrary.sandstoneRod );
			GameRegistry.addRecipe(new ItemStack(boneSlimeHoe), recipe, '#', InfiLibrary.slimeCrystal, '|', Item.bone );
			GameRegistry.addRecipe(new ItemStack(boneSlimeHoe), recipe, '#', InfiLibrary.slimeCrystal, '|', InfiLibrary.boneRod );
			GameRegistry.addRecipe(new ItemStack(paperSlimeHoe), recipe, '#', InfiLibrary.slimeCrystal, '|', InfiLibrary.paperRod );
			GameRegistry.addRecipe(new ItemStack(slimeSlimeHoe), recipe, '#', InfiLibrary.slimeCrystal, '|', InfiLibrary.slimeRod );
			GameRegistry.addRecipe(new ItemStack(cactusSlimeHoe), recipe, '#', InfiLibrary.slimeCrystal, '|', InfiLibrary.cactusRod );
		}

		if (PHInfiTools.enableCactusTools)
		{
			GameRegistry.addRecipe(new ItemStack(woodCactusHoe), recipe, '#', Block.cactus, '|', Item.stick );
			GameRegistry.addRecipe(new ItemStack(sandstoneCactusHoe), recipe, '#', Block.cactus, '|', InfiLibrary.sandstoneRod );
			GameRegistry.addRecipe(new ItemStack(boneCactusHoe), recipe, '#', Block.cactus, '|', Item.bone );
			GameRegistry.addRecipe(new ItemStack(boneCactusHoe), recipe, '#', Block.cactus, '|', InfiLibrary.boneRod );
			GameRegistry.addRecipe(new ItemStack(netherrackCactusHoe), recipe, '#', Block.cactus, '|', InfiLibrary.netherrackRod );
			GameRegistry.addRecipe(new ItemStack(iceCactusHoe), recipe, '#', Block.cactus, '|', InfiLibrary.iceRod );
			GameRegistry.addRecipe(new ItemStack(slimeCactusHoe), recipe, '#', Block.cactus, '|', InfiLibrary.slimeRod );
			GameRegistry.addRecipe(new ItemStack(cactusCactusHoe), recipe, '#', Block.cactus, '|', InfiLibrary.cactusRod );
		}

		if (PHInfiTools.enableFlintTools)
		{
			GameRegistry.addRecipe(new ItemStack(woodFlintHoe), recipe, '#', Item.flint, '|', Item.stick );
			GameRegistry.addRecipe(new ItemStack(stoneFlintHoe), recipe, '#', Item.flint, '|', InfiLibrary.stoneRod );
			GameRegistry.addRecipe(new ItemStack(sandstoneFlintHoe), recipe, '#', Item.flint, '|', InfiLibrary.sandstoneRod );
			GameRegistry.addRecipe(new ItemStack(boneFlintHoe), recipe, '#', Item.flint, '|', Item.bone );
			GameRegistry.addRecipe(new ItemStack(boneFlintHoe), recipe, '#', Item.flint, '|', InfiLibrary.boneRod );
			GameRegistry.addRecipe(new ItemStack(netherrackFlintHoe), recipe, '#', Item.flint, '|', InfiLibrary.netherrackRod );
			GameRegistry.addRecipe(new ItemStack(slimeFlintHoe), recipe, '#', Item.flint, '|', InfiLibrary.slimeRod );
			GameRegistry.addRecipe(new ItemStack(cactusFlintHoe), recipe, '#', Item.flint, '|', InfiLibrary.cactusRod );
			GameRegistry.addRecipe(new ItemStack(flintFlintHoe), recipe, '#', Item.flint, '|', InfiLibrary.flintRod );
			GameRegistry.addRecipe(new ItemStack(copperFlintHoe), recipe, '#', Item.flint, '|', InfiLibrary.copperRod );
			GameRegistry.addRecipe(new ItemStack(bronzeFlintHoe), recipe, '#', Item.flint, '|', InfiLibrary.bronzeRod );
		}

		if (PHInfiTools.enableBlazeTools)
		{
			GameRegistry.addRecipe(new ItemStack(diamondBlazeHoe), recipe, '#', InfiLibrary.blazeCrystal, '|', InfiLibrary.diamondRod );
			GameRegistry.addRecipe(new ItemStack(obsidianBlazeHoe), recipe, '#', InfiLibrary.blazeCrystal, '|', InfiLibrary.obsidianRod );
			GameRegistry.addRecipe(new ItemStack(netherrackBlazeHoe), recipe, '#', InfiLibrary.blazeCrystal, '|', InfiLibrary.netherrackRod );
			GameRegistry.addRecipe(new ItemStack(lavaBlazeHoe), recipe, '#', InfiLibrary.blazeCrystal, '|', InfiLibrary.lavaRod );
			GameRegistry.addRecipe(new ItemStack(flintBlazeHoe), recipe, '#', InfiLibrary.blazeCrystal, '|', InfiLibrary.flintRod );
			GameRegistry.addRecipe(new ItemStack(blazeBlazeHoe), recipe, '#', InfiLibrary.blazeCrystal, '|', Item.blazeRod );
			GameRegistry.addRecipe(new ItemStack(manyullynBlazeHoe), recipe, '#', InfiLibrary.blazeCrystal, '|', InfiLibrary.manyullynRod );
			GameRegistry.addRecipe(new ItemStack(uraniumBlazeHoe), recipe, '#', InfiLibrary.blazeCrystal, '|', InfiLibrary.uraniumRod );
		}
	}

	public static void addStoneTools(String stack)
	{
		//GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(woodStoneHoe), recipe, '#', stack, '|', Item.stick ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(stoneStoneHoe), recipe, '#', stack, '|', InfiLibrary.stoneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(sandstoneStoneHoe), recipe, '#', stack, '|', InfiLibrary.sandstoneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(boneStoneHoe), recipe, '#', stack, '|', Item.bone ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(boneStoneHoe), recipe, '#', stack, '|', InfiLibrary.boneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(netherrackStoneHoe), recipe, '#', stack, '|', InfiLibrary.netherrackRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(iceStoneHoe), recipe, '#', stack, '|', InfiLibrary.iceRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(slimeStoneHoe), recipe, '#', stack, '|', InfiLibrary.slimeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(cactusStoneHoe), recipe, '#', stack, '|', InfiLibrary.cactusRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(flintStoneHoe), recipe, '#', stack, '|', InfiLibrary.flintRod ) );
	}

	public static void addCopperTools(String stack)
	{
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(woodCopperHoe), recipe, '#', stack, '|', Item.stick ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(stoneCopperHoe), recipe, '#', stack, '|', InfiLibrary.stoneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(boneCopperHoe), recipe, '#', stack, '|', Item.bone ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(boneCopperHoe), recipe, '#', stack, '|', InfiLibrary.boneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(netherrackCopperHoe), recipe, '#', stack, '|', InfiLibrary.netherrackRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(slimeCopperHoe), recipe, '#', stack, '|', InfiLibrary.slimeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(cactusCopperHoe), recipe, '#', stack, '|', InfiLibrary.cactusRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(flintCopperHoe), recipe, '#', stack, '|', InfiLibrary.flintRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(copperCopperHoe), recipe, '#', stack, '|', InfiLibrary.copperRod ) );
	}

	public static void addBronzeTools(String stack)
	{
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(woodBronzeHoe), recipe, '#', stack, '|', Item.stick ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(stoneBronzeHoe), recipe, '#', stack, '|', InfiLibrary.stoneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(boneBronzeHoe), recipe, '#', stack, '|', Item.bone ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(boneBronzeHoe), recipe, '#', stack, '|', InfiLibrary.boneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(netherrackBronzeHoe), recipe, '#', stack, '|', InfiLibrary.netherrackRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(slimeBronzeHoe), recipe, '#', stack, '|', InfiLibrary.slimeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(cactusBronzeHoe), recipe, '#', stack, '|', InfiLibrary.cactusRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(flintBronzeHoe), recipe, '#', stack, '|', InfiLibrary.flintRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(copperBronzeHoe), recipe, '#', stack, '|', InfiLibrary.copperRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(bronzeBronzeHoe), recipe, '#', stack, '|', InfiLibrary.bronzeRod ) );
	}

	public static void addWorkedIronTools(String stack)
	{
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(woodWorkedIronHoe), recipe, '#', stack, '|', Item.stick ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(stoneWorkedIronHoe), recipe, '#', stack, '|', InfiLibrary.stoneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(ironWorkedIronHoe), recipe, '#', stack, '|', InfiLibrary.ironRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(diamondWorkedIronHoe), recipe, '#', stack, '|', InfiLibrary.diamondRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(redstoneWorkedIronHoe), recipe, '#', stack, '|', InfiLibrary.redstoneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(obsidianWorkedIronHoe), recipe, '#', stack, '|', InfiLibrary.obsidianRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(boneWorkedIronHoe), recipe, '#', stack, '|', Item.bone ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(boneWorkedIronHoe), recipe, '#', stack, '|', InfiLibrary.boneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(netherrackWorkedIronHoe), recipe, '#', stack, '|', InfiLibrary.netherrackRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(glowstoneWorkedIronHoe), recipe, '#', stack, '|', InfiLibrary.glowstoneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(iceWorkedIronHoe), recipe, '#', stack, '|', InfiLibrary.iceRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(slimeWorkedIronHoe), recipe, '#', stack, '|', InfiLibrary.slimeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(cactusWorkedIronHoe), recipe, '#', stack, '|', InfiLibrary.cactusRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(blazeWorkedIronHoe), recipe, '#', stack, '|', Item.blazeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(copperWorkedIronHoe), recipe, '#', stack, '|', InfiLibrary.copperRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(bronzeWorkedIronHoe), recipe, '#', stack, '|', InfiLibrary.bronzeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(workedWorkedIronHoe), recipe, '#', stack, '|', InfiLibrary.workedIronRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(steelWorkedIronHoe), recipe, '#', stack, '|', InfiLibrary.steelRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(uraniumWorkedIronHoe), recipe, '#', stack, '|', InfiLibrary.uraniumRod ) );
	}

	public static void addSteelTools(String stack)
	{
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(woodSteelHoe), recipe, '#', stack, '|', Item.stick ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(stoneSteelHoe), recipe, '#', stack, '|', InfiLibrary.stoneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(ironSteelHoe), recipe, '#', stack, '|', InfiLibrary.ironRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(diamondSteelHoe), recipe, '#', stack, '|', InfiLibrary.diamondRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(redstoneSteelHoe), recipe, '#', stack, '|', InfiLibrary.redstoneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(obsidianSteelHoe), recipe, '#', stack, '|', InfiLibrary.obsidianRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(boneSteelHoe), recipe, '#', stack, '|', Item.bone ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(boneSteelHoe), recipe, '#', stack, '|', InfiLibrary.boneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(netherrackSteelHoe), recipe, '#', stack, '|', InfiLibrary.netherrackRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(glowstoneSteelHoe), recipe, '#', stack, '|', InfiLibrary.glowstoneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(iceSteelHoe), recipe, '#', stack, '|', InfiLibrary.iceRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(slimeSteelHoe), recipe, '#', stack, '|', InfiLibrary.slimeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(cactusSteelHoe), recipe, '#', stack, '|', InfiLibrary.cactusRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(blazeSteelHoe), recipe, '#', stack, '|', Item.blazeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(copperSteelHoe), recipe, '#', stack, '|', InfiLibrary.copperRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(bronzeSteelHoe), recipe, '#', stack, '|', InfiLibrary.bronzeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(workedSteelHoe), recipe, '#', stack, '|', InfiLibrary.workedIronRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(steelSteelHoe), recipe, '#', stack, '|', InfiLibrary.steelRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(cobaltSteelHoe), recipe, '#', stack, '|', InfiLibrary.cobaltRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(arditeSteelHoe), recipe, '#', stack, '|', InfiLibrary.arditeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(uraniumSteelHoe), recipe, '#', stack, '|', InfiLibrary.uraniumRod ) );
	}

	public static void addCobaltTools(String stack)
	{
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(woodCobaltHoe), recipe, '#', stack, '|', Item.stick ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(stoneCobaltHoe), recipe, '#', stack, '|', InfiLibrary.stoneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(ironCobaltHoe), recipe, '#', stack, '|', InfiLibrary.ironRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(diamondCobaltHoe), recipe, '#', stack, '|', InfiLibrary.diamondRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(redstoneCobaltHoe), recipe, '#', stack, '|', InfiLibrary.redstoneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(obsidianCobaltHoe), recipe, '#', stack, '|', InfiLibrary.obsidianRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(boneCobaltHoe), recipe, '#', stack, '|', Item.bone ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(boneCobaltHoe), recipe, '#', stack, '|', InfiLibrary.boneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(slimeCobaltHoe), recipe, '#', stack, '|', InfiLibrary.slimeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(cactusCobaltHoe), recipe, '#', stack, '|', InfiLibrary.cactusRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(blazeCobaltHoe), recipe, '#', stack, '|', Item.blazeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(copperCobaltHoe), recipe, '#', stack, '|', InfiLibrary.copperRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(bronzeCobaltHoe), recipe, '#', stack, '|', InfiLibrary.bronzeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(workedCobaltHoe), recipe, '#', stack, '|', InfiLibrary.workedIronRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(steelCobaltHoe), recipe, '#', stack, '|', InfiLibrary.steelRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(cobaltCobaltHoe), recipe, '#', stack, '|', InfiLibrary.cobaltRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(arditeCobaltHoe), recipe, '#', stack, '|', InfiLibrary.arditeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(manyullynCobaltHoe), recipe, '#', stack, '|', InfiLibrary.manyullynRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(uraniumCobaltHoe), recipe, '#', stack, '|', InfiLibrary.uraniumRod ) );
	}

	public static void addArditeTools(String stack)
	{
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(woodArditeHoe), recipe, '#', stack, '|', Item.stick ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(stoneArditeHoe), recipe, '#', stack, '|', InfiLibrary.stoneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(ironArditeHoe), recipe, '#', stack, '|', InfiLibrary.ironRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(diamondArditeHoe), recipe, '#', stack, '|', InfiLibrary.diamondRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(redstoneArditeHoe), recipe, '#', stack, '|', InfiLibrary.redstoneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(obsidianArditeHoe), recipe, '#', stack, '|', InfiLibrary.obsidianRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(boneArditeHoe), recipe, '#', stack, '|', Item.bone ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(boneArditeHoe), recipe, '#', stack, '|', InfiLibrary.boneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(slimeArditeHoe), recipe, '#', stack, '|', InfiLibrary.slimeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(cactusArditeHoe), recipe, '#', stack, '|', InfiLibrary.cactusRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(blazeArditeHoe), recipe, '#', stack, '|', Item.blazeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(copperArditeHoe), recipe, '#', stack, '|', InfiLibrary.copperRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(bronzeArditeHoe), recipe, '#', stack, '|', InfiLibrary.bronzeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(workedArditeHoe), recipe, '#', stack, '|', InfiLibrary.workedIronRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(steelArditeHoe), recipe, '#', stack, '|', InfiLibrary.steelRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(cobaltArditeHoe), recipe, '#', stack, '|', InfiLibrary.cobaltRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(arditeArditeHoe), recipe, '#', stack, '|', InfiLibrary.arditeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(manyullynArditeHoe), recipe, '#', stack, '|', InfiLibrary.manyullynRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(uraniumArditeHoe), recipe, '#', stack, '|', InfiLibrary.uraniumRod ) );
	}

	public static void addManyullynTools(String stack)
	{
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(woodManyullynHoe), recipe, '#', stack, '|', Item.stick ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(stoneManyullynHoe), recipe, '#', stack, '|', InfiLibrary.stoneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(ironManyullynHoe), recipe, '#', stack, '|', InfiLibrary.ironRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(diamondManyullynHoe), recipe, '#', stack, '|', InfiLibrary.diamondRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(redstoneManyullynHoe), recipe, '#', stack, '|', InfiLibrary.redstoneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(obsidianManyullynHoe), recipe, '#', stack, '|', InfiLibrary.obsidianRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(boneManyullynHoe), recipe, '#', stack, '|', Item.bone ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(boneManyullynHoe), recipe, '#', stack, '|', InfiLibrary.boneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(slimeManyullynHoe), recipe, '#', stack, '|', InfiLibrary.slimeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(cactusManyullynHoe), recipe, '#', stack, '|', InfiLibrary.cactusRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(blazeManyullynHoe), recipe, '#', stack, '|', Item.blazeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(copperManyullynHoe), recipe, '#', stack, '|', InfiLibrary.copperRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(bronzeManyullynHoe), recipe, '#', stack, '|', InfiLibrary.bronzeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(workedManyullynHoe), recipe, '#', stack, '|', InfiLibrary.workedIronRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(steelManyullynHoe), recipe, '#', stack, '|', InfiLibrary.steelRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(cobaltManyullynHoe), recipe, '#', stack, '|', InfiLibrary.cobaltRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(arditeManyullynHoe), recipe, '#', stack, '|', InfiLibrary.arditeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(manyullynManyullynHoe), recipe, '#', stack, '|', InfiLibrary.manyullynRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(uraniumManyullynHoe), recipe, '#', stack, '|', InfiLibrary.uraniumRod ) );
	}

	public static void addUraniumTools(String stack)
	{
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(diamondUraniumHoe), recipe, '#', stack, '|', InfiLibrary.diamondRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(redstoneUraniumHoe), recipe, '#', stack, '|', InfiLibrary.redstoneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(boneUraniumHoe), recipe, '#', stack, '|', Item.bone ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(boneUraniumHoe), recipe, '#', stack, '|', InfiLibrary.boneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(netherrackUraniumHoe), recipe, '#', stack, '|', InfiLibrary.netherrackRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(glowstoneUraniumHoe), recipe, '#', stack, '|', InfiLibrary.glowstoneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(lavaUraniumHoe), recipe, '#', stack, '|', InfiLibrary.lavaRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(blazeUraniumHoe), recipe, '#', stack, '|', Item.blazeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(cobaltUraniumHoe), recipe, '#', stack, '|', InfiLibrary.cobaltRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(arditeUraniumHoe), recipe, '#', stack, '|', InfiLibrary.arditeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(uraniumUraniumHoe), recipe, '#', stack, '|', InfiLibrary.uraniumRod ) );
	}

	public static Item woodWoodHoe;
	public static Item sandstoneWoodHoe;
	public static Item boneWoodHoe;
	public static Item paperWoodHoe;
	public static Item iceWoodHoe;
	public static Item slimeWoodHoe;
	public static Item cactusWoodHoe;

	public static Item woodStoneHoe;
	public static Item stoneStoneHoe;
	public static Item sandstoneStoneHoe;
	public static Item boneStoneHoe;
	public static Item netherrackStoneHoe;
	public static Item iceStoneHoe;
	public static Item slimeStoneHoe;
	public static Item cactusStoneHoe;
	public static Item flintStoneHoe;

	public static Item woodIronHoe;
	public static Item stoneIronHoe;
	public static Item ironIronHoe;
	public static Item boneIronHoe;
	public static Item netherrackIronHoe;
	public static Item glowstoneIronHoe;
	public static Item cactusIronHoe;
	public static Item copperIronHoe;
	public static Item bronzeIronHoe;

	public static Item woodDiamondHoe;
	public static Item stoneDiamondHoe;
	public static Item ironDiamondHoe;
	public static Item diamondDiamondHoe;
	public static Item redstoneDiamondHoe;
	public static Item obsidianDiamondHoe;
	public static Item boneDiamondHoe;
	public static Item mossyDiamondHoe;
	public static Item netherrackDiamondHoe;
	public static Item glowstoneDiamondHoe;
	public static Item lavaDiamondHoe;
	public static Item cactusDiamondHoe;
	public static Item flintDiamondHoe;
	public static Item blazeDiamondHoe;
	public static Item copperDiamondHoe;
	public static Item bronzeDiamondHoe;
	public static Item workedDiamondHoe;
	public static Item steelDiamondHoe;
	public static Item cobaltDiamondHoe;
	public static Item arditeDiamondHoe;
	public static Item manyullynDiamondHoe;
	public static Item uraniumDiamondHoe;

	public static Item woodRedstoneHoe;
	public static Item stoneRedstoneHoe;
	public static Item ironRedstoneHoe;
	public static Item redstoneRedstoneHoe;
	public static Item obsidianRedstoneHoe;
	public static Item sandstoneRedstoneHoe;
	public static Item boneRedstoneHoe;
	public static Item paperRedstoneHoe;
	public static Item mossyRedstoneHoe;
	public static Item netherrackRedstoneHoe;
	public static Item glowstoneRedstoneHoe;
	public static Item iceRedstoneHoe;
	public static Item lavaRedstoneHoe;
	public static Item slimeRedstoneHoe;
	public static Item cactusRedstoneHoe;
	public static Item flintRedstoneHoe;
	public static Item copperRedstoneHoe;
	public static Item bronzeRedstoneHoe;
	public static Item workedRedstoneHoe;
	public static Item uraniumRedstoneHoe;

	public static Item woodObsidianHoe;
	public static Item stoneObsidianHoe;
	public static Item redstoneObsidianHoe;
	public static Item obsidianObsidianHoe;
	public static Item boneObsidianHoe;
	public static Item netherrackObsidianHoe;
	public static Item glowstoneObsidianHoe;
	public static Item iceObsidianHoe;
	public static Item lavaObsidianHoe;
	public static Item cactusObsidianHoe;

	public static Item woodSandstoneHoe;
	public static Item sandstoneSandstoneHoe;
	public static Item boneSandstoneHoe;
	public static Item netherrackSandstoneHoe;
	public static Item iceSandstoneHoe;
	public static Item slimeSandstoneHoe;
	public static Item cactusSandstoneHoe;
	public static Item flintSandstoneHoe;

	public static Item woodBoneHoe;
	public static Item stoneBoneHoe;
	public static Item sandstoneBoneHoe;
	public static Item boneBoneHoe;
	public static Item paperBoneHoe;
	public static Item netherrackBoneHoe;
	public static Item iceBoneHoe;
	public static Item cactusBoneHoe;
	public static Item flintBoneHoe;

	public static Item woodPaperHoe;
	public static Item bonePaperHoe;
	public static Item paperPaperHoe;
	public static Item slimePaperHoe;
	public static Item cactusPaperHoe;

	public static Item woodMossyHoe;
	public static Item stoneMossyHoe;
	public static Item diamondMossyHoe;
	public static Item redstoneMossyHoe;
	public static Item boneMossyHoe;
	public static Item mossyMossyHoe;
	public static Item netherrackMossyHoe;
	public static Item glowstoneMossyHoe;
	public static Item cactusMossyHoe;
	public static Item blazeMossyHoe;
	public static Item manyullynMossyHoe;
	public static Item uraniumMossyHoe;

	public static Item woodNetherrackHoe;
	public static Item stoneNetherrackHoe;
	public static Item sandstoneNetherrackHoe;
	public static Item boneNetherrackHoe;
	public static Item paperNetherrackHoe;
	public static Item mossyNetherrackHoe;
	public static Item netherrackNetherrackHoe;
	public static Item iceNetherrackHoe;
	public static Item slimeNetherrackHoe;
	public static Item cactusNetherrackHoe;
	public static Item flintNetherrackHoe;
	public static Item copperNetherrackHoe;
	public static Item bronzeNetherrackHoe;

	public static Item woodGlowstoneHoe;
	public static Item redstoneGlowstoneHoe;
	public static Item obsidianGlowstoneHoe;
	public static Item boneGlowstoneHoe;
	public static Item netherrackGlowstoneHoe;
	public static Item glowstoneGlowstoneHoe;
	public static Item iceGlowstoneHoe;
	public static Item slimeGlowstoneHoe;
	public static Item cactusGlowstoneHoe;

	public static Item woodIceHoe;
	public static Item boneIceHoe;
	public static Item paperIceHoe;
	public static Item iceIceHoe;
	public static Item slimeIceHoe;
	public static Item cactusIceHoe;

	public static Item diamondLavaHoe;
	public static Item obsidianLavaHoe;
	public static Item netherrackLavaHoe;
	public static Item lavaLavaHoe;
	public static Item flintLavaHoe;
	public static Item blazeLavaHoe;
	public static Item manyullynLavaHoe;
	public static Item uraniumLavaHoe;

	public static Item woodSlimeHoe;
	public static Item sandstoneSlimeHoe;
	public static Item boneSlimeHoe;
	public static Item paperSlimeHoe;
	public static Item slimeSlimeHoe;
	public static Item cactusSlimeHoe;

	public static Item woodCactusHoe;
	public static Item sandstoneCactusHoe;
	public static Item boneCactusHoe;
	public static Item netherrackCactusHoe;
	public static Item iceCactusHoe;
	public static Item slimeCactusHoe;
	public static Item cactusCactusHoe;

	public static Item woodFlintHoe;
	public static Item stoneFlintHoe;
	public static Item sandstoneFlintHoe;
	public static Item boneFlintHoe;
	public static Item netherrackFlintHoe;
	public static Item slimeFlintHoe;
	public static Item cactusFlintHoe;
	public static Item flintFlintHoe;
	public static Item copperFlintHoe;
	public static Item bronzeFlintHoe;

	public static Item diamondBlazeHoe;
	public static Item obsidianBlazeHoe;
	public static Item netherrackBlazeHoe;
	public static Item lavaBlazeHoe;
	public static Item flintBlazeHoe;
	public static Item blazeBlazeHoe;
	public static Item manyullynBlazeHoe;
	public static Item uraniumBlazeHoe;

	public static Item woodCopperHoe;
	public static Item stoneCopperHoe;
	public static Item boneCopperHoe;
	public static Item netherrackCopperHoe;
	public static Item slimeCopperHoe;
	public static Item cactusCopperHoe;
	public static Item flintCopperHoe;
	public static Item copperCopperHoe;

	public static Item woodBronzeHoe;
	public static Item stoneBronzeHoe;
	public static Item boneBronzeHoe;
	public static Item netherrackBronzeHoe;
	public static Item slimeBronzeHoe;
	public static Item cactusBronzeHoe;
	public static Item flintBronzeHoe;
	public static Item copperBronzeHoe;
	public static Item bronzeBronzeHoe;

	public static Item woodWorkedIronHoe;
	public static Item stoneWorkedIronHoe;
	public static Item ironWorkedIronHoe;
	public static Item diamondWorkedIronHoe;
	public static Item redstoneWorkedIronHoe;
	public static Item obsidianWorkedIronHoe;
	public static Item boneWorkedIronHoe;
	public static Item netherrackWorkedIronHoe;
	public static Item glowstoneWorkedIronHoe;
	public static Item iceWorkedIronHoe;
	public static Item slimeWorkedIronHoe;
	public static Item cactusWorkedIronHoe;
	public static Item blazeWorkedIronHoe;
	public static Item copperWorkedIronHoe;
	public static Item bronzeWorkedIronHoe;
	public static Item workedWorkedIronHoe;
	public static Item steelWorkedIronHoe;
	public static Item uraniumWorkedIronHoe;

	public static Item woodSteelHoe;
	public static Item stoneSteelHoe;
	public static Item ironSteelHoe;
	public static Item diamondSteelHoe;
	public static Item redstoneSteelHoe;
	public static Item obsidianSteelHoe;
	public static Item boneSteelHoe;
	public static Item netherrackSteelHoe;
	public static Item glowstoneSteelHoe;
	public static Item iceSteelHoe;
	public static Item slimeSteelHoe;
	public static Item cactusSteelHoe;
	public static Item blazeSteelHoe;
	public static Item copperSteelHoe;
	public static Item bronzeSteelHoe;
	public static Item workedSteelHoe;
	public static Item steelSteelHoe;
	public static Item cobaltSteelHoe;
	public static Item arditeSteelHoe;
	public static Item uraniumSteelHoe;

	public static Item woodCobaltHoe;
	public static Item stoneCobaltHoe;
	public static Item ironCobaltHoe;
	public static Item diamondCobaltHoe;
	public static Item redstoneCobaltHoe;
	public static Item obsidianCobaltHoe;
	public static Item boneCobaltHoe;
	public static Item slimeCobaltHoe;
	public static Item cactusCobaltHoe;
	public static Item blazeCobaltHoe;
	public static Item copperCobaltHoe;
	public static Item bronzeCobaltHoe;
	public static Item workedCobaltHoe;
	public static Item steelCobaltHoe;
	public static Item cobaltCobaltHoe;
	public static Item arditeCobaltHoe;
	public static Item manyullynCobaltHoe;
	public static Item uraniumCobaltHoe;

	public static Item woodArditeHoe;
	public static Item stoneArditeHoe;
	public static Item ironArditeHoe;
	public static Item diamondArditeHoe;
	public static Item redstoneArditeHoe;
	public static Item obsidianArditeHoe;
	public static Item boneArditeHoe;
	public static Item slimeArditeHoe;
	public static Item cactusArditeHoe;
	public static Item blazeArditeHoe;
	public static Item copperArditeHoe;
	public static Item bronzeArditeHoe;
	public static Item workedArditeHoe;
	public static Item steelArditeHoe;
	public static Item cobaltArditeHoe;
	public static Item arditeArditeHoe;
	public static Item manyullynArditeHoe;
	public static Item uraniumArditeHoe;

	public static Item woodManyullynHoe;
	public static Item stoneManyullynHoe;
	public static Item ironManyullynHoe;
	public static Item diamondManyullynHoe;
	public static Item redstoneManyullynHoe;
	public static Item obsidianManyullynHoe;
	public static Item boneManyullynHoe;
	public static Item slimeManyullynHoe;
	public static Item cactusManyullynHoe;
	public static Item blazeManyullynHoe;
	public static Item copperManyullynHoe;
	public static Item bronzeManyullynHoe;
	public static Item workedManyullynHoe;
	public static Item steelManyullynHoe;
	public static Item cobaltManyullynHoe;
	public static Item arditeManyullynHoe;
	public static Item manyullynManyullynHoe;
	public static Item uraniumManyullynHoe;

	public static Item diamondUraniumHoe;
	public static Item redstoneUraniumHoe;
	public static Item boneUraniumHoe;
	public static Item netherrackUraniumHoe;
	public static Item glowstoneUraniumHoe;
	public static Item lavaUraniumHoe;
	public static Item blazeUraniumHoe;
	public static Item cobaltUraniumHoe;
	public static Item arditeUraniumHoe;
	public static Item uraniumUraniumHoe;
}
