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

public class Axes
{
	public static Axes instance = new Axes();

	private static String[] recipe = { "##", "#|", " |" };

	public static Axes getInstance()
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
			sandstoneWoodAxe = new InfiToolAxe(PHInfiTools.woodAxeID + 1, InfiMaterialEnum.Wood, InfiMaterialEnum.Sandstone, "sandstoneWoodAxe");
			boneWoodAxe = new InfiToolAxe(PHInfiTools.woodAxeID + 2, InfiMaterialEnum.Wood, InfiMaterialEnum.Bone, "boneWoodAxe");
			paperWoodAxe = new InfiToolAxe(PHInfiTools.woodAxeID + 3, InfiMaterialEnum.Wood, InfiMaterialEnum.Paper, "paperWoodAxe");
			iceWoodAxe = new InfiToolAxe(PHInfiTools.woodAxeID + 4, InfiMaterialEnum.Wood, InfiMaterialEnum.Ice, "iceWoodAxe");
			slimeWoodAxe = new InfiToolAxe(PHInfiTools.woodAxeID + 5, InfiMaterialEnum.Wood, InfiMaterialEnum.Slime, "slimeWoodAxe");
			cactusWoodAxe = new InfiToolAxe(PHInfiTools.woodAxeID + 6, InfiMaterialEnum.Wood, InfiMaterialEnum.Cactus, "cactusWoodAxe");

			MinecraftForge.setToolClass(sandstoneWoodAxe, "Axe", InfiMaterialEnum.Wood.getHarvestLevel());
			MinecraftForge.setToolClass(boneWoodAxe, "Axe", InfiMaterialEnum.Wood.getHarvestLevel());
			MinecraftForge.setToolClass(paperWoodAxe, "Axe", InfiMaterialEnum.Wood.getHarvestLevel());
			MinecraftForge.setToolClass(iceWoodAxe, "Axe", InfiMaterialEnum.Wood.getHarvestLevel());
			MinecraftForge.setToolClass(slimeWoodAxe, "Axe", InfiMaterialEnum.Wood.getHarvestLevel());
			MinecraftForge.setToolClass(cactusWoodAxe, "Axe", InfiMaterialEnum.Wood.getHarvestLevel());
		}

		if (PHInfiTools.enableStoneTools)
		{
			stoneStoneAxe = new InfiToolAxe(PHInfiTools.stoneAxeID + 1, InfiMaterialEnum.Stone, InfiMaterialEnum.Stone, "stoneStoneAxe");
			sandstoneStoneAxe = new InfiToolAxe(PHInfiTools.stoneAxeID + 2, InfiMaterialEnum.Stone, InfiMaterialEnum.Sandstone, "sandstoneStoneAxe");
			boneStoneAxe = new InfiToolAxe(PHInfiTools.stoneAxeID + 3, InfiMaterialEnum.Stone, InfiMaterialEnum.Bone, "boneStoneAxe");
			netherrackStoneAxe = new InfiToolAxe(PHInfiTools.stoneAxeID + 4, InfiMaterialEnum.Stone, InfiMaterialEnum.Netherrack, "netherrackStoneAxe");
			iceStoneAxe = new InfiToolAxe(PHInfiTools.stoneAxeID + 5, InfiMaterialEnum.Stone, InfiMaterialEnum.Ice, "iceStoneAxe");
			slimeStoneAxe = new InfiToolAxe(PHInfiTools.stoneAxeID + 6, InfiMaterialEnum.Stone, InfiMaterialEnum.Slime, "slimeStoneAxe");
			cactusStoneAxe = new InfiToolAxe(PHInfiTools.stoneAxeID + 7, InfiMaterialEnum.Stone, InfiMaterialEnum.Cactus, "cactusStoneAxe");
			flintStoneAxe = new InfiToolAxe(PHInfiTools.stoneAxeID + 8, InfiMaterialEnum.Stone, InfiMaterialEnum.Flint, "flintStoneAxe");

			MinecraftForge.setToolClass(stoneStoneAxe, "Axe", InfiMaterialEnum.Stone.getHarvestLevel());
			MinecraftForge.setToolClass(sandstoneStoneAxe, "Axe", InfiMaterialEnum.Stone.getHarvestLevel());
			MinecraftForge.setToolClass(boneStoneAxe, "Axe", InfiMaterialEnum.Stone.getHarvestLevel());
			MinecraftForge.setToolClass(netherrackStoneAxe, "Axe", InfiMaterialEnum.Stone.getHarvestLevel());
			MinecraftForge.setToolClass(iceStoneAxe, "Axe", InfiMaterialEnum.Stone.getHarvestLevel());
			MinecraftForge.setToolClass(slimeStoneAxe, "Axe", InfiMaterialEnum.Stone.getHarvestLevel());
			MinecraftForge.setToolClass(cactusStoneAxe, "Axe", InfiMaterialEnum.Stone.getHarvestLevel());
			MinecraftForge.setToolClass(flintStoneAxe, "Axe", InfiMaterialEnum.Stone.getHarvestLevel());
		}

		if (PHInfiTools.enableIronTools)
		{
			stoneIronAxe = new InfiToolAxe(PHInfiTools.ironAxeID + 1, InfiMaterialEnum.Iron, InfiMaterialEnum.Stone, "stoneIronAxe");
			ironIronAxe = new InfiToolAxe(PHInfiTools.ironAxeID + 2, InfiMaterialEnum.Iron, InfiMaterialEnum.Iron, "ironIronAxe");
			boneIronAxe = new InfiToolAxe(PHInfiTools.ironAxeID + 3, InfiMaterialEnum.Iron, InfiMaterialEnum.Bone, "boneIronAxe");
			netherrackIronAxe = new InfiToolAxe(PHInfiTools.ironAxeID + 4, InfiMaterialEnum.Iron, InfiMaterialEnum.Netherrack, "netherrackIronAxe");
			glowstoneIronAxe = new InfiToolAxe(PHInfiTools.ironAxeID + 5, InfiMaterialEnum.Iron, InfiMaterialEnum.Glowstone, "glowstoneIronAxe");
			cactusIronAxe = new InfiToolAxe(PHInfiTools.ironAxeID + 6, InfiMaterialEnum.Iron, InfiMaterialEnum.Cactus, "cactusIronAxe");
			copperIronAxe = new InfiToolAxe(PHInfiTools.ironAxeID + 7, InfiMaterialEnum.Iron, InfiMaterialEnum.Copper, "copperIronAxe");
			bronzeIronAxe = new InfiToolAxe(PHInfiTools.ironAxeID + 8, InfiMaterialEnum.Iron, InfiMaterialEnum.Bronze, "bronzeIronAxe");

			MinecraftForge.setToolClass(stoneIronAxe, "Axe", InfiMaterialEnum.Iron.getHarvestLevel());
			MinecraftForge.setToolClass(ironIronAxe, "Axe", InfiMaterialEnum.Iron.getHarvestLevel());
			MinecraftForge.setToolClass(boneIronAxe, "Axe", InfiMaterialEnum.Iron.getHarvestLevel());
			MinecraftForge.setToolClass(netherrackIronAxe, "Axe", InfiMaterialEnum.Iron.getHarvestLevel());
			MinecraftForge.setToolClass(glowstoneIronAxe, "Axe", InfiMaterialEnum.Iron.getHarvestLevel());
			MinecraftForge.setToolClass(cactusIronAxe, "Axe", InfiMaterialEnum.Iron.getHarvestLevel());
			MinecraftForge.setToolClass(copperIronAxe, "Axe", InfiMaterialEnum.Iron.getHarvestLevel());
			MinecraftForge.setToolClass(bronzeIronAxe, "Axe", InfiMaterialEnum.Iron.getHarvestLevel());
		}

		if (PHInfiTools.enableDiamondTools)
		{
			stoneDiamondAxe = new InfiToolAxe(PHInfiTools.diamondAxeID + 1, InfiMaterialEnum.Diamond, InfiMaterialEnum.Stone, "stoneDiamondAxe");
			ironDiamondAxe = new InfiToolAxe(PHInfiTools.diamondAxeID + 2, InfiMaterialEnum.Diamond, InfiMaterialEnum.Iron, "ironDiamondAxe");
			diamondDiamondAxe = new InfiToolAxe(PHInfiTools.diamondAxeID + 3, InfiMaterialEnum.Diamond, InfiMaterialEnum.Diamond, "diamondDiamondAxe");
			redstoneDiamondAxe = new InfiToolAxe(PHInfiTools.diamondAxeID + 4, InfiMaterialEnum.Diamond, InfiMaterialEnum.Redstone, "redstoneDiamondAxe");
			obsidianDiamondAxe = new InfiToolAxe(PHInfiTools.diamondAxeID + 5, InfiMaterialEnum.Diamond, InfiMaterialEnum.Obsidian, "obsidianDiamondAxe");
			boneDiamondAxe = new InfiToolAxe(PHInfiTools.diamondAxeID + 6, InfiMaterialEnum.Diamond, InfiMaterialEnum.Bone, "boneDiamondAxe");
			mossyDiamondAxe = new InfiToolAxe(PHInfiTools.diamondAxeID + 7, InfiMaterialEnum.Diamond, InfiMaterialEnum.Mossy, "mossyDiamondAxe");
			netherrackDiamondAxe = new InfiToolAxe(PHInfiTools.diamondAxeID + 8, InfiMaterialEnum.Diamond, InfiMaterialEnum.Netherrack, "netherrackDiamondAxe");
			glowstoneDiamondAxe = new InfiToolAxe(PHInfiTools.diamondAxeID + 9, InfiMaterialEnum.Diamond, InfiMaterialEnum.Glowstone, "glowstoneDiamondAxe");
			lavaDiamondAxe = new InfiToolAxe(PHInfiTools.diamondAxeID + 10, InfiMaterialEnum.Diamond, InfiMaterialEnum.Lava, "lavaDiamondAxe");
			cactusDiamondAxe = new InfiToolAxe(PHInfiTools.diamondAxeID + 11, InfiMaterialEnum.Diamond, InfiMaterialEnum.Cactus, "cactusDiamondAxe");
			flintDiamondAxe = new InfiToolAxe(PHInfiTools.diamondAxeID + 12, InfiMaterialEnum.Diamond, InfiMaterialEnum.Flint, "flintDiamondAxe");
			blazeDiamondAxe = new InfiToolAxe(PHInfiTools.diamondAxeID + 13, InfiMaterialEnum.Diamond, InfiMaterialEnum.Blaze, "blazeDiamondAxe");
			copperDiamondAxe = new InfiToolAxe(PHInfiTools.diamondAxeID + 14, InfiMaterialEnum.Diamond, InfiMaterialEnum.Copper, "copperDiamondAxe");
			bronzeDiamondAxe = new InfiToolAxe(PHInfiTools.diamondAxeID + 15, InfiMaterialEnum.Diamond, InfiMaterialEnum.Bronze, "bronzeDiamondAxe");
			workedDiamondAxe = new InfiToolAxe(PHInfiTools.diamondAxeID + 16, InfiMaterialEnum.Diamond, InfiMaterialEnum.WorkedIron, "workedDiamondAxe");
			steelDiamondAxe = new InfiToolAxe(PHInfiTools.diamondAxeID + 17, InfiMaterialEnum.Diamond, InfiMaterialEnum.Steel, "steelDiamondAxe");
			cobaltDiamondAxe = new InfiToolAxe(PHInfiTools.diamondAxeID + 18, InfiMaterialEnum.Diamond, InfiMaterialEnum.Cobalt, "cobaltDiamondAxe");
			arditeDiamondAxe = new InfiToolAxe(PHInfiTools.diamondAxeID + 19, InfiMaterialEnum.Diamond, InfiMaterialEnum.Ardite, "arditeDiamondAxe");
			manyullynDiamondAxe = new InfiToolAxe(PHInfiTools.diamondAxeID + 20, InfiMaterialEnum.Diamond, InfiMaterialEnum.Manyullyn, "manyullynDiamondAxe");
			uraniumDiamondAxe = new InfiToolAxe(PHInfiTools.diamondAxeID + 21, InfiMaterialEnum.Diamond, InfiMaterialEnum.Uranium, "uraniumDiamondAxe");

			MinecraftForge.setToolClass(stoneDiamondAxe, "Axe", InfiMaterialEnum.Diamond.getHarvestLevel());
			MinecraftForge.setToolClass(ironDiamondAxe, "Axe", InfiMaterialEnum.Diamond.getHarvestLevel());
			MinecraftForge.setToolClass(diamondDiamondAxe, "Axe", InfiMaterialEnum.Diamond.getHarvestLevel());
			MinecraftForge.setToolClass(redstoneDiamondAxe, "Axe", InfiMaterialEnum.Diamond.getHarvestLevel());
			MinecraftForge.setToolClass(obsidianDiamondAxe, "Axe", InfiMaterialEnum.Diamond.getHarvestLevel());
			MinecraftForge.setToolClass(boneDiamondAxe, "Axe", InfiMaterialEnum.Diamond.getHarvestLevel());
			MinecraftForge.setToolClass(mossyDiamondAxe, "Axe", InfiMaterialEnum.Diamond.getHarvestLevel());
			MinecraftForge.setToolClass(netherrackDiamondAxe, "Axe", InfiMaterialEnum.Diamond.getHarvestLevel());
			MinecraftForge.setToolClass(glowstoneDiamondAxe, "Axe", InfiMaterialEnum.Diamond.getHarvestLevel());
			MinecraftForge.setToolClass(lavaDiamondAxe, "Axe", InfiMaterialEnum.Diamond.getHarvestLevel());
			MinecraftForge.setToolClass(cactusDiamondAxe, "Axe", InfiMaterialEnum.Diamond.getHarvestLevel());
			MinecraftForge.setToolClass(flintDiamondAxe, "Axe", InfiMaterialEnum.Diamond.getHarvestLevel());
			MinecraftForge.setToolClass(blazeDiamondAxe, "Axe", InfiMaterialEnum.Diamond.getHarvestLevel());
			MinecraftForge.setToolClass(copperDiamondAxe, "Axe", InfiMaterialEnum.Diamond.getHarvestLevel());
			MinecraftForge.setToolClass(bronzeDiamondAxe, "Axe", InfiMaterialEnum.Diamond.getHarvestLevel());
			MinecraftForge.setToolClass(workedDiamondAxe, "Axe", InfiMaterialEnum.Diamond.getHarvestLevel());
			MinecraftForge.setToolClass(steelDiamondAxe, "Axe", InfiMaterialEnum.Diamond.getHarvestLevel());
			MinecraftForge.setToolClass(cobaltDiamondAxe, "Axe", InfiMaterialEnum.Diamond.getHarvestLevel());
			MinecraftForge.setToolClass(arditeDiamondAxe, "Axe", InfiMaterialEnum.Diamond.getHarvestLevel());
			MinecraftForge.setToolClass(manyullynDiamondAxe, "Axe", InfiMaterialEnum.Diamond.getHarvestLevel());
			MinecraftForge.setToolClass(uraniumDiamondAxe, "Axe", InfiMaterialEnum.Diamond.getHarvestLevel());
		}

		if (PHInfiTools.enableRedstoneTools)
		{
			woodRedstoneAxe = new InfiToolAxe(PHInfiTools.redstoneAxeID + 0, InfiMaterialEnum.Redstone, InfiMaterialEnum.Wood, "woodRedstoneAxe");
			stoneRedstoneAxe = new InfiToolAxe(PHInfiTools.redstoneAxeID + 1, InfiMaterialEnum.Redstone, InfiMaterialEnum.Stone, "stoneRedstoneAxe");
			ironRedstoneAxe = new InfiToolAxe(PHInfiTools.redstoneAxeID + 2, InfiMaterialEnum.Redstone, InfiMaterialEnum.Iron, "ironRedstoneAxe");
			redstoneRedstoneAxe = new InfiToolAxe(PHInfiTools.redstoneAxeID + 3, InfiMaterialEnum.Redstone, InfiMaterialEnum.Redstone, "redstoneRedstoneAxe");
			obsidianRedstoneAxe = new InfiToolAxe(PHInfiTools.redstoneAxeID + 4, InfiMaterialEnum.Redstone, InfiMaterialEnum.Obsidian, "obsidianRedstoneAxe");
			sandstoneRedstoneAxe = new InfiToolAxe(PHInfiTools.redstoneAxeID + 5, InfiMaterialEnum.Redstone, InfiMaterialEnum.Sandstone, "sandstoneRedstoneAxe");
			boneRedstoneAxe = new InfiToolAxe(PHInfiTools.redstoneAxeID + 6, InfiMaterialEnum.Redstone, InfiMaterialEnum.Bone, "boneRedstoneAxe");
			paperRedstoneAxe = new InfiToolAxe(PHInfiTools.redstoneAxeID + 7, InfiMaterialEnum.Redstone, InfiMaterialEnum.Paper, "paperRedstoneAxe");
			mossyRedstoneAxe = new InfiToolAxe(PHInfiTools.redstoneAxeID + 8, InfiMaterialEnum.Redstone, InfiMaterialEnum.Mossy, "mossyRedstoneAxe");
			netherrackRedstoneAxe = new InfiToolAxe(PHInfiTools.redstoneAxeID + 9, InfiMaterialEnum.Redstone, InfiMaterialEnum.Netherrack, "netherrackRedstoneAxe");
			glowstoneRedstoneAxe = new InfiToolAxe(PHInfiTools.redstoneAxeID + 10, InfiMaterialEnum.Redstone, InfiMaterialEnum.Glowstone, "glowstoneRedstoneAxe");
			iceRedstoneAxe = new InfiToolAxe(PHInfiTools.redstoneAxeID + 11, InfiMaterialEnum.Redstone, InfiMaterialEnum.Ice, "iceRedstoneAxe");
			lavaRedstoneAxe = new InfiToolAxe(PHInfiTools.redstoneAxeID + 12, InfiMaterialEnum.Redstone, InfiMaterialEnum.Lava, "lavaRedstoneAxe");
			slimeRedstoneAxe = new InfiToolAxe(PHInfiTools.redstoneAxeID + 13, InfiMaterialEnum.Redstone, InfiMaterialEnum.Slime, "slimeRedstoneAxe");
			cactusRedstoneAxe = new InfiToolAxe(PHInfiTools.redstoneAxeID + 14, InfiMaterialEnum.Redstone, InfiMaterialEnum.Cactus, "cactusRedstoneAxe");
			flintRedstoneAxe = new InfiToolAxe(PHInfiTools.redstoneAxeID + 15, InfiMaterialEnum.Redstone, InfiMaterialEnum.Flint, "flintRedstoneAxe");
			copperRedstoneAxe = new InfiToolAxe(PHInfiTools.redstoneAxeID + 16, InfiMaterialEnum.Redstone, InfiMaterialEnum.Copper, "copperRedstoneAxe");
			bronzeRedstoneAxe = new InfiToolAxe(PHInfiTools.redstoneAxeID + 17, InfiMaterialEnum.Redstone, InfiMaterialEnum.Bronze, "bronzeRedstoneAxe");
			workedRedstoneAxe = new InfiToolAxe(PHInfiTools.redstoneAxeID + 18, InfiMaterialEnum.Redstone, InfiMaterialEnum.WorkedIron, "workedRedstoneAxe");
			uraniumRedstoneAxe = new InfiToolAxe(PHInfiTools.redstoneAxeID + 19, InfiMaterialEnum.Redstone, InfiMaterialEnum.Uranium, "uraniumRedstoneAxe");

			MinecraftForge.setToolClass(woodRedstoneAxe, "Axe", InfiMaterialEnum.Redstone.getHarvestLevel());
			MinecraftForge.setToolClass(stoneRedstoneAxe, "Axe", InfiMaterialEnum.Redstone.getHarvestLevel());
			MinecraftForge.setToolClass(ironRedstoneAxe, "Axe", InfiMaterialEnum.Redstone.getHarvestLevel());
			MinecraftForge.setToolClass(redstoneRedstoneAxe, "Axe", InfiMaterialEnum.Redstone.getHarvestLevel());
			MinecraftForge.setToolClass(obsidianRedstoneAxe, "Axe", InfiMaterialEnum.Redstone.getHarvestLevel());
			MinecraftForge.setToolClass(sandstoneRedstoneAxe, "Axe", InfiMaterialEnum.Redstone.getHarvestLevel());
			MinecraftForge.setToolClass(boneRedstoneAxe, "Axe", InfiMaterialEnum.Redstone.getHarvestLevel());
			MinecraftForge.setToolClass(paperRedstoneAxe, "Axe", InfiMaterialEnum.Redstone.getHarvestLevel());
			MinecraftForge.setToolClass(mossyRedstoneAxe, "Axe", InfiMaterialEnum.Redstone.getHarvestLevel());
			MinecraftForge.setToolClass(netherrackRedstoneAxe, "Axe", InfiMaterialEnum.Redstone.getHarvestLevel());
			MinecraftForge.setToolClass(glowstoneRedstoneAxe, "Axe", InfiMaterialEnum.Redstone.getHarvestLevel());
			MinecraftForge.setToolClass(iceRedstoneAxe, "Axe", InfiMaterialEnum.Redstone.getHarvestLevel());
			MinecraftForge.setToolClass(lavaRedstoneAxe, "Axe", InfiMaterialEnum.Redstone.getHarvestLevel());
			MinecraftForge.setToolClass(slimeRedstoneAxe, "Axe", InfiMaterialEnum.Redstone.getHarvestLevel());
			MinecraftForge.setToolClass(cactusRedstoneAxe, "Axe", InfiMaterialEnum.Redstone.getHarvestLevel());
			MinecraftForge.setToolClass(flintRedstoneAxe, "Axe", InfiMaterialEnum.Redstone.getHarvestLevel());
			MinecraftForge.setToolClass(copperRedstoneAxe, "Axe", InfiMaterialEnum.Redstone.getHarvestLevel());
			MinecraftForge.setToolClass(bronzeRedstoneAxe, "Axe", InfiMaterialEnum.Redstone.getHarvestLevel());
			MinecraftForge.setToolClass(workedRedstoneAxe, "Axe", InfiMaterialEnum.Redstone.getHarvestLevel());
			MinecraftForge.setToolClass(uraniumRedstoneAxe, "Axe", InfiMaterialEnum.Redstone.getHarvestLevel());
		}

		if (PHInfiTools.enableObsidianTools)
		{
			woodObsidianAxe = new InfiToolAxe(PHInfiTools.obsidianAxeID + 0, InfiMaterialEnum.Obsidian, InfiMaterialEnum.Wood, "woodObsidianAxe");
			stoneObsidianAxe = new InfiToolAxe(PHInfiTools.obsidianAxeID + 1, InfiMaterialEnum.Obsidian, InfiMaterialEnum.Stone, "stoneObsidianAxe");
			redstoneObsidianAxe = new InfiToolAxe(PHInfiTools.obsidianAxeID + 2, InfiMaterialEnum.Obsidian, InfiMaterialEnum.Redstone, "redstoneObsidianAxe");
			obsidianObsidianAxe = new InfiToolAxe(PHInfiTools.obsidianAxeID + 3, InfiMaterialEnum.Obsidian, InfiMaterialEnum.Obsidian, "obsidianObsidianAxe");
			;
			boneObsidianAxe = new InfiToolAxe(PHInfiTools.obsidianAxeID + 4, InfiMaterialEnum.Obsidian, InfiMaterialEnum.Bone, "boneObsidianAxe");
			netherrackObsidianAxe = new InfiToolAxe(PHInfiTools.obsidianAxeID + 5, InfiMaterialEnum.Obsidian, InfiMaterialEnum.Netherrack, "netherrackObsidianAxe");
			glowstoneObsidianAxe = new InfiToolAxe(PHInfiTools.obsidianAxeID + 6, InfiMaterialEnum.Obsidian, InfiMaterialEnum.Glowstone, "glowstoneObsidianAxe");
			iceObsidianAxe = new InfiToolAxe(PHInfiTools.obsidianAxeID + 7, InfiMaterialEnum.Obsidian, InfiMaterialEnum.Ice, "iceObsidianAxe");
			lavaObsidianAxe = new InfiToolAxe(PHInfiTools.obsidianAxeID + 8, InfiMaterialEnum.Obsidian, InfiMaterialEnum.Lava, "lavaObsidianAxe");
			cactusObsidianAxe = new InfiToolAxe(PHInfiTools.obsidianAxeID + 9, InfiMaterialEnum.Obsidian, InfiMaterialEnum.Cactus, "cactusObsidianAxe");

			MinecraftForge.setToolClass(woodObsidianAxe, "Axe", InfiMaterialEnum.Obsidian.getHarvestLevel());
			MinecraftForge.setToolClass(stoneObsidianAxe, "Axe", InfiMaterialEnum.Obsidian.getHarvestLevel());
			MinecraftForge.setToolClass(redstoneObsidianAxe, "Axe", InfiMaterialEnum.Obsidian.getHarvestLevel());
			MinecraftForge.setToolClass(obsidianObsidianAxe, "Axe", InfiMaterialEnum.Obsidian.getHarvestLevel());
			MinecraftForge.setToolClass(boneObsidianAxe, "Axe", InfiMaterialEnum.Obsidian.getHarvestLevel());
			MinecraftForge.setToolClass(netherrackObsidianAxe, "Axe", InfiMaterialEnum.Obsidian.getHarvestLevel());
			MinecraftForge.setToolClass(glowstoneObsidianAxe, "Axe", InfiMaterialEnum.Obsidian.getHarvestLevel());
			MinecraftForge.setToolClass(iceObsidianAxe, "Axe", InfiMaterialEnum.Obsidian.getHarvestLevel());
			MinecraftForge.setToolClass(lavaObsidianAxe, "Axe", InfiMaterialEnum.Obsidian.getHarvestLevel());
			MinecraftForge.setToolClass(cactusObsidianAxe, "Axe", InfiMaterialEnum.Obsidian.getHarvestLevel());
		}

		if (PHInfiTools.enableSandstoneTools)
		{
			woodSandstoneAxe = new InfiToolAxe(PHInfiTools.sandstoneAxeID + 0, InfiMaterialEnum.Sandstone, InfiMaterialEnum.Wood, "woodSandstoneAxe");
			sandstoneSandstoneAxe = new InfiToolAxe(PHInfiTools.sandstoneAxeID + 1, InfiMaterialEnum.Sandstone, InfiMaterialEnum.Sandstone, "sandstoneSandstoneAxe");
			boneSandstoneAxe = new InfiToolAxe(PHInfiTools.sandstoneAxeID + 2, InfiMaterialEnum.Sandstone, InfiMaterialEnum.Bone, "boneSandstoneAxe");
			netherrackSandstoneAxe = new InfiToolAxe(PHInfiTools.sandstoneAxeID + 3, InfiMaterialEnum.Sandstone, InfiMaterialEnum.Netherrack, "netherrackSandstoneAxe");
			iceSandstoneAxe = new InfiToolAxe(PHInfiTools.sandstoneAxeID + 4, InfiMaterialEnum.Sandstone, InfiMaterialEnum.Ice, "iceSandstoneAxe");
			slimeSandstoneAxe = new InfiToolAxe(PHInfiTools.sandstoneAxeID + 5, InfiMaterialEnum.Sandstone, InfiMaterialEnum.Slime, "slimeSandstoneAxe");
			cactusSandstoneAxe = new InfiToolAxe(PHInfiTools.sandstoneAxeID + 6, InfiMaterialEnum.Sandstone, InfiMaterialEnum.Cactus, "cactusSandstoneAxe");
			flintSandstoneAxe = new InfiToolAxe(PHInfiTools.sandstoneAxeID + 7, InfiMaterialEnum.Sandstone, InfiMaterialEnum.Flint, "flintSandstoneAxe");

			MinecraftForge.setToolClass(woodSandstoneAxe, "Axe", InfiMaterialEnum.Sandstone.getHarvestLevel());
			MinecraftForge.setToolClass(sandstoneSandstoneAxe, "Axe", InfiMaterialEnum.Sandstone.getHarvestLevel());
			MinecraftForge.setToolClass(boneSandstoneAxe, "Axe", InfiMaterialEnum.Sandstone.getHarvestLevel());
			MinecraftForge.setToolClass(netherrackSandstoneAxe, "Axe", InfiMaterialEnum.Sandstone.getHarvestLevel());
			MinecraftForge.setToolClass(iceSandstoneAxe, "Axe", InfiMaterialEnum.Sandstone.getHarvestLevel());
			MinecraftForge.setToolClass(slimeSandstoneAxe, "Axe", InfiMaterialEnum.Sandstone.getHarvestLevel());
			MinecraftForge.setToolClass(cactusSandstoneAxe, "Axe", InfiMaterialEnum.Sandstone.getHarvestLevel());
			MinecraftForge.setToolClass(flintSandstoneAxe, "Axe", InfiMaterialEnum.Sandstone.getHarvestLevel());
		}

		if (PHInfiTools.enableBoneTools)
		{
			woodBoneAxe = new InfiToolAxe(PHInfiTools.boneAxeID + 0, InfiMaterialEnum.Bone, InfiMaterialEnum.Wood, "woodBoneAxe");
			stoneBoneAxe = new InfiToolAxe(PHInfiTools.boneAxeID + 1, InfiMaterialEnum.Bone, InfiMaterialEnum.Stone, "stoneBoneAxe");
			sandstoneBoneAxe = new InfiToolAxe(PHInfiTools.boneAxeID + 2, InfiMaterialEnum.Bone, InfiMaterialEnum.Sandstone, "sandstoneBoneAxe");
			boneBoneAxe = new InfiToolAxe(PHInfiTools.boneAxeID + 3, InfiMaterialEnum.Bone, InfiMaterialEnum.Bone, "boneBoneAxe");
			paperBoneAxe = new InfiToolAxe(PHInfiTools.boneAxeID + 4, InfiMaterialEnum.Bone, InfiMaterialEnum.Paper, "paperBoneAxe");
			netherrackBoneAxe = new InfiToolAxe(PHInfiTools.boneAxeID + 5, InfiMaterialEnum.Bone, InfiMaterialEnum.Netherrack, "netherrackBoneAxe");
			iceBoneAxe = new InfiToolAxe(PHInfiTools.boneAxeID + 6, InfiMaterialEnum.Bone, InfiMaterialEnum.Ice, "iceBoneAxe");
			cactusBoneAxe = new InfiToolAxe(PHInfiTools.boneAxeID + 7, InfiMaterialEnum.Bone, InfiMaterialEnum.Cactus, "cactusBoneAxe");
			flintBoneAxe = new InfiToolAxe(PHInfiTools.boneAxeID + 8, InfiMaterialEnum.Bone, InfiMaterialEnum.Flint, "flintBoneAxe");

			MinecraftForge.setToolClass(woodBoneAxe, "Axe", InfiMaterialEnum.Bone.getHarvestLevel());
			MinecraftForge.setToolClass(stoneBoneAxe, "Axe", InfiMaterialEnum.Bone.getHarvestLevel());
			MinecraftForge.setToolClass(sandstoneBoneAxe, "Axe", InfiMaterialEnum.Bone.getHarvestLevel());
			MinecraftForge.setToolClass(boneBoneAxe, "Axe", InfiMaterialEnum.Bone.getHarvestLevel());
			MinecraftForge.setToolClass(paperBoneAxe, "Axe", InfiMaterialEnum.Bone.getHarvestLevel());
			MinecraftForge.setToolClass(netherrackBoneAxe, "Axe", InfiMaterialEnum.Bone.getHarvestLevel());
			MinecraftForge.setToolClass(iceBoneAxe, "Axe", InfiMaterialEnum.Bone.getHarvestLevel());
			MinecraftForge.setToolClass(cactusBoneAxe, "Axe", InfiMaterialEnum.Bone.getHarvestLevel());
			MinecraftForge.setToolClass(flintBoneAxe, "Axe", InfiMaterialEnum.Bone.getHarvestLevel());
		}

		if (PHInfiTools.enablePaperTools)
		{
			woodPaperAxe = new InfiToolAxe(PHInfiTools.paperAxeID + 0, InfiMaterialEnum.Paper, InfiMaterialEnum.Wood, "woodPaperAxe");
			bonePaperAxe = new InfiToolAxe(PHInfiTools.paperAxeID + 1, InfiMaterialEnum.Paper, InfiMaterialEnum.Bone, "bonePaperAxe");
			paperPaperAxe = new InfiToolAxe(PHInfiTools.paperAxeID + 2, InfiMaterialEnum.Paper, InfiMaterialEnum.Paper, "paperPaperAxe");
			slimePaperAxe = new InfiToolAxe(PHInfiTools.paperAxeID + 3, InfiMaterialEnum.Paper, InfiMaterialEnum.Slime, "slimePaperAxe");
			cactusPaperAxe = new InfiToolAxe(PHInfiTools.paperAxeID + 4, InfiMaterialEnum.Paper, InfiMaterialEnum.Cactus, "cactusPaperAxe");

			MinecraftForge.setToolClass(woodPaperAxe, "Axe", InfiMaterialEnum.Paper.getHarvestLevel());
			MinecraftForge.setToolClass(bonePaperAxe, "Axe", InfiMaterialEnum.Paper.getHarvestLevel());
			MinecraftForge.setToolClass(paperPaperAxe, "Axe", InfiMaterialEnum.Paper.getHarvestLevel());
			MinecraftForge.setToolClass(slimePaperAxe, "Axe", InfiMaterialEnum.Paper.getHarvestLevel());
			MinecraftForge.setToolClass(cactusPaperAxe, "Axe", InfiMaterialEnum.Paper.getHarvestLevel());
		}

		if (PHInfiTools.enableMossyTools)
		{
			woodMossyAxe = new InfiToolAxe(PHInfiTools.mossyAxeID + 0, InfiMaterialEnum.Mossy, InfiMaterialEnum.Wood, "woodMossyAxe");
			stoneMossyAxe = new InfiToolAxe(PHInfiTools.mossyAxeID + 1, InfiMaterialEnum.Mossy, InfiMaterialEnum.Stone, "stoneMossyAxe");
			diamondMossyAxe = new InfiToolAxe(PHInfiTools.mossyAxeID + 2, InfiMaterialEnum.Mossy, InfiMaterialEnum.Diamond, "diamondMossyAxe");
			redstoneMossyAxe = new InfiToolAxe(PHInfiTools.mossyAxeID + 3, InfiMaterialEnum.Mossy, InfiMaterialEnum.Redstone, "redstoneMossyAxe");
			boneMossyAxe = new InfiToolAxe(PHInfiTools.mossyAxeID + 4, InfiMaterialEnum.Mossy, InfiMaterialEnum.Bone, "boneMossyAxe");
			mossyMossyAxe = new InfiToolAxe(PHInfiTools.mossyAxeID + 5, InfiMaterialEnum.Mossy, InfiMaterialEnum.Mossy, "mossyMossyAxe");
			netherrackMossyAxe = new InfiToolAxe(PHInfiTools.mossyAxeID + 6, InfiMaterialEnum.Mossy, InfiMaterialEnum.Netherrack, "netherrackMossyAxe");
			glowstoneMossyAxe = new InfiToolAxe(PHInfiTools.mossyAxeID + 7, InfiMaterialEnum.Mossy, InfiMaterialEnum.Glowstone, "glowstoneMossyAxe");
			cactusMossyAxe = new InfiToolAxe(PHInfiTools.mossyAxeID + 8, InfiMaterialEnum.Mossy, InfiMaterialEnum.Cactus, "cactusMossyAxe");
			blazeMossyAxe = new InfiToolAxe(PHInfiTools.mossyAxeID + 9, InfiMaterialEnum.Mossy, InfiMaterialEnum.Blaze, "blazeMossyAxe");
			manyullynMossyAxe = new InfiToolAxe(PHInfiTools.mossyAxeID + 10, InfiMaterialEnum.Mossy, InfiMaterialEnum.Manyullyn, "manyullynMossyAxe");
			uraniumMossyAxe = new InfiToolAxe(PHInfiTools.mossyAxeID + 11, InfiMaterialEnum.Mossy, InfiMaterialEnum.Uranium, "uraniumMossyAxe");

			MinecraftForge.setToolClass(woodMossyAxe, "Axe", InfiMaterialEnum.Mossy.getHarvestLevel());
			MinecraftForge.setToolClass(stoneMossyAxe, "Axe", InfiMaterialEnum.Mossy.getHarvestLevel());
			MinecraftForge.setToolClass(diamondMossyAxe, "Axe", InfiMaterialEnum.Mossy.getHarvestLevel());
			MinecraftForge.setToolClass(redstoneMossyAxe, "Axe", InfiMaterialEnum.Mossy.getHarvestLevel());
			MinecraftForge.setToolClass(boneMossyAxe, "Axe", InfiMaterialEnum.Mossy.getHarvestLevel());
			MinecraftForge.setToolClass(mossyMossyAxe, "Axe", InfiMaterialEnum.Mossy.getHarvestLevel());
			MinecraftForge.setToolClass(netherrackMossyAxe, "Axe", InfiMaterialEnum.Mossy.getHarvestLevel());
			MinecraftForge.setToolClass(glowstoneMossyAxe, "Axe", InfiMaterialEnum.Mossy.getHarvestLevel());
			MinecraftForge.setToolClass(cactusMossyAxe, "Axe", InfiMaterialEnum.Mossy.getHarvestLevel());
			MinecraftForge.setToolClass(blazeMossyAxe, "Axe", InfiMaterialEnum.Mossy.getHarvestLevel());
			MinecraftForge.setToolClass(manyullynMossyAxe, "Axe", InfiMaterialEnum.Mossy.getHarvestLevel());
			MinecraftForge.setToolClass(uraniumMossyAxe, "Axe", InfiMaterialEnum.Mossy.getHarvestLevel());
		}

		if (PHInfiTools.enableNetherrackTools)
		{
			woodNetherrackAxe = new InfiToolAxe(PHInfiTools.netherrackAxeID + 0, InfiMaterialEnum.Netherrack, InfiMaterialEnum.Wood, "woodNetherrackAxe");
			stoneNetherrackAxe = new InfiToolAxe(PHInfiTools.netherrackAxeID + 1, InfiMaterialEnum.Netherrack, InfiMaterialEnum.Stone, "stoneNetherrackAxe");
			sandstoneNetherrackAxe = new InfiToolAxe(PHInfiTools.netherrackAxeID + 2, InfiMaterialEnum.Netherrack, InfiMaterialEnum.Sandstone, "sandstoneNetherrackAxe");
			boneNetherrackAxe = new InfiToolAxe(PHInfiTools.netherrackAxeID + 3, InfiMaterialEnum.Netherrack, InfiMaterialEnum.Bone, "boneNetherrackAxe");
			paperNetherrackAxe = new InfiToolAxe(PHInfiTools.netherrackAxeID + 4, InfiMaterialEnum.Netherrack, InfiMaterialEnum.Paper, "paperNetherrackAxe");
			mossyNetherrackAxe = new InfiToolAxe(PHInfiTools.netherrackAxeID + 5, InfiMaterialEnum.Netherrack, InfiMaterialEnum.Mossy, "mossyNetherrackAxe");
			netherrackNetherrackAxe = new InfiToolAxe(PHInfiTools.netherrackAxeID + 6, InfiMaterialEnum.Netherrack, InfiMaterialEnum.Netherrack, "netherrackNetherrackAxe");
			iceNetherrackAxe = new InfiToolAxe(PHInfiTools.netherrackAxeID + 7, InfiMaterialEnum.Netherrack, InfiMaterialEnum.Ice, "iceNetherrackAxe");
			slimeNetherrackAxe = new InfiToolAxe(PHInfiTools.netherrackAxeID + 8, InfiMaterialEnum.Netherrack, InfiMaterialEnum.Slime, "slimeNetherrackAxe");
			cactusNetherrackAxe = new InfiToolAxe(PHInfiTools.netherrackAxeID + 9, InfiMaterialEnum.Netherrack, InfiMaterialEnum.Cactus, "cactusNetherrackAxe");
			flintNetherrackAxe = new InfiToolAxe(PHInfiTools.netherrackAxeID + 10, InfiMaterialEnum.Netherrack, InfiMaterialEnum.Flint, "flintNetherrackAxe");
			copperNetherrackAxe = new InfiToolAxe(PHInfiTools.netherrackAxeID + 11, InfiMaterialEnum.Netherrack, InfiMaterialEnum.Copper, "copperNetherrackAxe");
			bronzeNetherrackAxe = new InfiToolAxe(PHInfiTools.netherrackAxeID + 12, InfiMaterialEnum.Netherrack, InfiMaterialEnum.Bronze, "bronzeNetherrackAxe");

			MinecraftForge.setToolClass(woodNetherrackAxe, "Axe", InfiMaterialEnum.Netherrack.getHarvestLevel());
			MinecraftForge.setToolClass(stoneNetherrackAxe, "Axe", InfiMaterialEnum.Netherrack.getHarvestLevel());
			MinecraftForge.setToolClass(sandstoneNetherrackAxe, "Axe", InfiMaterialEnum.Netherrack.getHarvestLevel());
			MinecraftForge.setToolClass(boneNetherrackAxe, "Axe", InfiMaterialEnum.Netherrack.getHarvestLevel());
			MinecraftForge.setToolClass(paperNetherrackAxe, "Axe", InfiMaterialEnum.Netherrack.getHarvestLevel());
			MinecraftForge.setToolClass(mossyNetherrackAxe, "Axe", InfiMaterialEnum.Netherrack.getHarvestLevel());
			MinecraftForge.setToolClass(netherrackNetherrackAxe, "Axe", InfiMaterialEnum.Netherrack.getHarvestLevel());
			MinecraftForge.setToolClass(iceNetherrackAxe, "Axe", InfiMaterialEnum.Netherrack.getHarvestLevel());
			MinecraftForge.setToolClass(slimeNetherrackAxe, "Axe", InfiMaterialEnum.Netherrack.getHarvestLevel());
			MinecraftForge.setToolClass(cactusNetherrackAxe, "Axe", InfiMaterialEnum.Netherrack.getHarvestLevel());
			MinecraftForge.setToolClass(flintNetherrackAxe, "Axe", InfiMaterialEnum.Netherrack.getHarvestLevel());
			MinecraftForge.setToolClass(copperNetherrackAxe, "Axe", InfiMaterialEnum.Netherrack.getHarvestLevel());
			MinecraftForge.setToolClass(bronzeNetherrackAxe, "Axe", InfiMaterialEnum.Netherrack.getHarvestLevel());
		}

		if (PHInfiTools.enableGlowstoneTools)
		{
			woodGlowstoneAxe = new InfiToolAxe(PHInfiTools.glowstoneAxeID + 0, InfiMaterialEnum.Glowstone, InfiMaterialEnum.Wood, "woodGlowstoneAxe");
			redstoneGlowstoneAxe = new InfiToolAxe(PHInfiTools.glowstoneAxeID + 1, InfiMaterialEnum.Glowstone, InfiMaterialEnum.Redstone, "redstoneGlowstoneAxe");
			obsidianGlowstoneAxe = new InfiToolAxe(PHInfiTools.glowstoneAxeID + 2, InfiMaterialEnum.Glowstone, InfiMaterialEnum.Obsidian, "obsidianGlowstoneAxe");
			boneGlowstoneAxe = new InfiToolAxe(PHInfiTools.glowstoneAxeID + 3, InfiMaterialEnum.Glowstone, InfiMaterialEnum.Bone, "boneGlowstoneAxe");
			netherrackGlowstoneAxe = new InfiToolAxe(PHInfiTools.glowstoneAxeID + 4, InfiMaterialEnum.Glowstone, InfiMaterialEnum.Netherrack, "netherrackGlowstoneAxe");
			glowstoneGlowstoneAxe = new InfiToolAxe(PHInfiTools.glowstoneAxeID + 5, InfiMaterialEnum.Glowstone, InfiMaterialEnum.Glowstone, "glowstoneGlowstoneAxe");
			iceGlowstoneAxe = new InfiToolAxe(PHInfiTools.glowstoneAxeID + 6, InfiMaterialEnum.Glowstone, InfiMaterialEnum.Ice, "iceGlowstoneAxe");
			slimeGlowstoneAxe = new InfiToolAxe(PHInfiTools.glowstoneAxeID + 7, InfiMaterialEnum.Glowstone, InfiMaterialEnum.Slime, "slimeGlowstoneAxe");
			cactusGlowstoneAxe = new InfiToolAxe(PHInfiTools.glowstoneAxeID + 8, InfiMaterialEnum.Glowstone, InfiMaterialEnum.Cactus, "cactusGlowstoneAxe");

			MinecraftForge.setToolClass(woodGlowstoneAxe, "Axe", InfiMaterialEnum.Glowstone.getHarvestLevel());
			MinecraftForge.setToolClass(redstoneGlowstoneAxe, "Axe", InfiMaterialEnum.Glowstone.getHarvestLevel());
			MinecraftForge.setToolClass(obsidianGlowstoneAxe, "Axe", InfiMaterialEnum.Glowstone.getHarvestLevel());
			MinecraftForge.setToolClass(boneGlowstoneAxe, "Axe", InfiMaterialEnum.Glowstone.getHarvestLevel());
			MinecraftForge.setToolClass(netherrackGlowstoneAxe, "Axe", InfiMaterialEnum.Glowstone.getHarvestLevel());
			MinecraftForge.setToolClass(glowstoneGlowstoneAxe, "Axe", InfiMaterialEnum.Glowstone.getHarvestLevel());
			MinecraftForge.setToolClass(iceGlowstoneAxe, "Axe", InfiMaterialEnum.Glowstone.getHarvestLevel());
			MinecraftForge.setToolClass(slimeGlowstoneAxe, "Axe", InfiMaterialEnum.Glowstone.getHarvestLevel());
			MinecraftForge.setToolClass(cactusGlowstoneAxe, "Axe", InfiMaterialEnum.Glowstone.getHarvestLevel());
		}

		if (PHInfiTools.enableIceTools)
		{
			woodIceAxe = new InfiToolAxe(PHInfiTools.iceAxeID + 0, InfiMaterialEnum.Ice, InfiMaterialEnum.Wood, "woodIceAxe");
			boneIceAxe = new InfiToolAxe(PHInfiTools.iceAxeID + 1, InfiMaterialEnum.Ice, InfiMaterialEnum.Bone, "boneIceAxe");
			paperIceAxe = new InfiToolAxe(PHInfiTools.iceAxeID + 2, InfiMaterialEnum.Ice, InfiMaterialEnum.Paper, "paperIceAxe");
			iceIceAxe = new InfiToolAxe(PHInfiTools.iceAxeID + 3, InfiMaterialEnum.Ice, InfiMaterialEnum.Ice, "iceIceAxe");
			slimeIceAxe = new InfiToolAxe(PHInfiTools.iceAxeID + 4, InfiMaterialEnum.Ice, InfiMaterialEnum.Slime, "slimeIceAxe");
			cactusIceAxe = new InfiToolAxe(PHInfiTools.iceAxeID + 5, InfiMaterialEnum.Ice, InfiMaterialEnum.Cactus, "cactusIceAxe");

			MinecraftForge.setToolClass(woodIceAxe, "Axe", InfiMaterialEnum.Ice.getHarvestLevel());
			MinecraftForge.setToolClass(boneIceAxe, "Axe", InfiMaterialEnum.Ice.getHarvestLevel());
			MinecraftForge.setToolClass(paperIceAxe, "Axe", InfiMaterialEnum.Ice.getHarvestLevel());
			MinecraftForge.setToolClass(iceIceAxe, "Axe", InfiMaterialEnum.Ice.getHarvestLevel());
			MinecraftForge.setToolClass(slimeIceAxe, "Axe", InfiMaterialEnum.Ice.getHarvestLevel());
			MinecraftForge.setToolClass(cactusIceAxe, "Axe", InfiMaterialEnum.Ice.getHarvestLevel());
		}

		if (PHInfiTools.enableLavaTools)
		{
			diamondLavaAxe = new InfiToolAxe(PHInfiTools.lavaAxeID + 0, InfiMaterialEnum.Lava, InfiMaterialEnum.Diamond, "diamondLavaAxe");
			obsidianLavaAxe = new InfiToolAxe(PHInfiTools.lavaAxeID + 1, InfiMaterialEnum.Lava, InfiMaterialEnum.Obsidian, "obsidianLavaAxe");
			netherrackLavaAxe = new InfiToolAxe(PHInfiTools.lavaAxeID + 2, InfiMaterialEnum.Lava, InfiMaterialEnum.Netherrack, "netherrackLavaAxe");
			lavaLavaAxe = new InfiToolAxe(PHInfiTools.lavaAxeID + 3, InfiMaterialEnum.Lava, InfiMaterialEnum.Lava, "lavaLavaAxe");
			flintLavaAxe = new InfiToolAxe(PHInfiTools.lavaAxeID + 4, InfiMaterialEnum.Lava, InfiMaterialEnum.Flint, "flintLavaAxe");
			blazeLavaAxe = new InfiToolAxe(PHInfiTools.lavaAxeID + 5, InfiMaterialEnum.Lava, InfiMaterialEnum.Blaze, "blazeLavaAxe");
			manyullynLavaAxe = new InfiToolAxe(PHInfiTools.lavaAxeID + 6, InfiMaterialEnum.Lava, InfiMaterialEnum.Manyullyn, "manyullynLavaAxe");
			uraniumLavaAxe = new InfiToolAxe(PHInfiTools.lavaAxeID + 7, InfiMaterialEnum.Lava, InfiMaterialEnum.Uranium, "uraniumLavaAxe");

			MinecraftForge.setToolClass(diamondLavaAxe, "Axe", InfiMaterialEnum.Lava.getHarvestLevel());
			MinecraftForge.setToolClass(obsidianLavaAxe, "Axe", InfiMaterialEnum.Lava.getHarvestLevel());
			MinecraftForge.setToolClass(netherrackLavaAxe, "Axe", InfiMaterialEnum.Lava.getHarvestLevel());
			MinecraftForge.setToolClass(lavaLavaAxe, "Axe", InfiMaterialEnum.Lava.getHarvestLevel());
			MinecraftForge.setToolClass(flintLavaAxe, "Axe", InfiMaterialEnum.Lava.getHarvestLevel());
			MinecraftForge.setToolClass(blazeLavaAxe, "Axe", InfiMaterialEnum.Lava.getHarvestLevel());
			MinecraftForge.setToolClass(manyullynLavaAxe, "Axe", InfiMaterialEnum.Lava.getHarvestLevel());
			MinecraftForge.setToolClass(uraniumLavaAxe, "Axe", InfiMaterialEnum.Lava.getHarvestLevel());
		}

		if (PHInfiTools.enableSlimeTools)
		{
			woodSlimeAxe = new InfiToolAxe(PHInfiTools.slimeAxeID + 0, InfiMaterialEnum.Slime, InfiMaterialEnum.Wood, "woodSlimeAxe");
			sandstoneSlimeAxe = new InfiToolAxe(PHInfiTools.slimeAxeID + 1, InfiMaterialEnum.Slime, InfiMaterialEnum.Sandstone, "sandstoneSlimeAxe");
			boneSlimeAxe = new InfiToolAxe(PHInfiTools.slimeAxeID + 2, InfiMaterialEnum.Slime, InfiMaterialEnum.Bone, "boneSlimeAxe");
			paperSlimeAxe = new InfiToolAxe(PHInfiTools.slimeAxeID + 3, InfiMaterialEnum.Slime, InfiMaterialEnum.Paper, "paperSlimeAxe");
			slimeSlimeAxe = new InfiToolAxe(PHInfiTools.slimeAxeID + 4, InfiMaterialEnum.Slime, InfiMaterialEnum.Slime, "slimeSlimeAxe");
			cactusSlimeAxe = new InfiToolAxe(PHInfiTools.slimeAxeID + 5, InfiMaterialEnum.Slime, InfiMaterialEnum.Cactus, "cactusSlimeAxe");

			MinecraftForge.setToolClass(woodSlimeAxe, "Axe", InfiMaterialEnum.Slime.getHarvestLevel());
			MinecraftForge.setToolClass(sandstoneSlimeAxe, "Axe", InfiMaterialEnum.Slime.getHarvestLevel());
			MinecraftForge.setToolClass(boneSlimeAxe, "Axe", InfiMaterialEnum.Slime.getHarvestLevel());
			MinecraftForge.setToolClass(paperSlimeAxe, "Axe", InfiMaterialEnum.Slime.getHarvestLevel());
			MinecraftForge.setToolClass(slimeSlimeAxe, "Axe", InfiMaterialEnum.Slime.getHarvestLevel());
			MinecraftForge.setToolClass(cactusSlimeAxe, "Axe", InfiMaterialEnum.Slime.getHarvestLevel());
		}

		if (PHInfiTools.enableCactusTools)
		{
			woodCactusAxe = new InfiToolAxe(PHInfiTools.cactusAxeID + 0, InfiMaterialEnum.Cactus, InfiMaterialEnum.Wood, "woodCactusAxe");
			sandstoneCactusAxe = new InfiToolAxe(PHInfiTools.cactusAxeID + 1, InfiMaterialEnum.Cactus, InfiMaterialEnum.Sandstone, "sandstoneCactusAxe");
			boneCactusAxe = new InfiToolAxe(PHInfiTools.cactusAxeID + 2, InfiMaterialEnum.Cactus, InfiMaterialEnum.Bone, "boneCactusAxe");
			netherrackCactusAxe = new InfiToolAxe(PHInfiTools.cactusAxeID + 3, InfiMaterialEnum.Cactus, InfiMaterialEnum.Netherrack, "netherrackCactusAxe");
			iceCactusAxe = new InfiToolAxe(PHInfiTools.cactusAxeID + 4, InfiMaterialEnum.Cactus, InfiMaterialEnum.Ice, "iceCactusAxe");
			slimeCactusAxe = new InfiToolAxe(PHInfiTools.cactusAxeID + 5, InfiMaterialEnum.Cactus, InfiMaterialEnum.Slime, "slimeCactusAxe");
			cactusCactusAxe = new InfiToolAxe(PHInfiTools.cactusAxeID + 6, InfiMaterialEnum.Cactus, InfiMaterialEnum.Cactus, "cactusCactusAxe");

			MinecraftForge.setToolClass(woodCactusAxe, "Axe", InfiMaterialEnum.Cactus.getHarvestLevel());
			MinecraftForge.setToolClass(sandstoneCactusAxe, "Axe", InfiMaterialEnum.Cactus.getHarvestLevel());
			MinecraftForge.setToolClass(boneCactusAxe, "Axe", InfiMaterialEnum.Cactus.getHarvestLevel());
			MinecraftForge.setToolClass(netherrackCactusAxe, "Axe", InfiMaterialEnum.Cactus.getHarvestLevel());
			MinecraftForge.setToolClass(iceCactusAxe, "Axe", InfiMaterialEnum.Cactus.getHarvestLevel());
			MinecraftForge.setToolClass(slimeCactusAxe, "Axe", InfiMaterialEnum.Cactus.getHarvestLevel());
			MinecraftForge.setToolClass(cactusCactusAxe, "Axe", InfiMaterialEnum.Cactus.getHarvestLevel());
		}

		if (PHInfiTools.enableFlintTools)
		{
			woodFlintAxe = new InfiToolAxe(PHInfiTools.flintAxeID + 0, InfiMaterialEnum.Flint, InfiMaterialEnum.Wood, "woodFlintAxe");
			stoneFlintAxe = new InfiToolAxe(PHInfiTools.flintAxeID + 1, InfiMaterialEnum.Flint, InfiMaterialEnum.Stone, "stoneFlintAxe");
			sandstoneFlintAxe = new InfiToolAxe(PHInfiTools.flintAxeID + 2, InfiMaterialEnum.Flint, InfiMaterialEnum.Sandstone, "sandstoneFlintAxe");
			boneFlintAxe = new InfiToolAxe(PHInfiTools.flintAxeID + 3, InfiMaterialEnum.Flint, InfiMaterialEnum.Bone, "boneFlintAxe");
			netherrackFlintAxe = new InfiToolAxe(PHInfiTools.flintAxeID + 4, InfiMaterialEnum.Flint, InfiMaterialEnum.Netherrack, "netherrackFlintAxe");
			slimeFlintAxe = new InfiToolAxe(PHInfiTools.flintAxeID + 5, InfiMaterialEnum.Flint, InfiMaterialEnum.Slime, "slimeFlintAxe");
			cactusFlintAxe = new InfiToolAxe(PHInfiTools.flintAxeID + 6, InfiMaterialEnum.Flint, InfiMaterialEnum.Cactus, "cactusFlintAxe");
			flintFlintAxe = new InfiToolAxe(PHInfiTools.flintAxeID + 7, InfiMaterialEnum.Flint, InfiMaterialEnum.Flint, "flintFlintAxe");
			copperFlintAxe = new InfiToolAxe(PHInfiTools.flintAxeID + 8, InfiMaterialEnum.Flint, InfiMaterialEnum.Copper, "copperFlintAxe");
			bronzeFlintAxe = new InfiToolAxe(PHInfiTools.flintAxeID + 9, InfiMaterialEnum.Flint, InfiMaterialEnum.Bronze, "bronzeFlintAxe");

			MinecraftForge.setToolClass(woodFlintAxe, "Axe", InfiMaterialEnum.Flint.getHarvestLevel());
			MinecraftForge.setToolClass(stoneFlintAxe, "Axe", InfiMaterialEnum.Flint.getHarvestLevel());
			MinecraftForge.setToolClass(sandstoneFlintAxe, "Axe", InfiMaterialEnum.Flint.getHarvestLevel());
			MinecraftForge.setToolClass(boneFlintAxe, "Axe", InfiMaterialEnum.Flint.getHarvestLevel());
			MinecraftForge.setToolClass(netherrackFlintAxe, "Axe", InfiMaterialEnum.Flint.getHarvestLevel());
			MinecraftForge.setToolClass(slimeFlintAxe, "Axe", InfiMaterialEnum.Flint.getHarvestLevel());
			MinecraftForge.setToolClass(cactusFlintAxe, "Axe", InfiMaterialEnum.Flint.getHarvestLevel());
			MinecraftForge.setToolClass(flintFlintAxe, "Axe", InfiMaterialEnum.Flint.getHarvestLevel());
			MinecraftForge.setToolClass(copperFlintAxe, "Axe", InfiMaterialEnum.Flint.getHarvestLevel());
			MinecraftForge.setToolClass(bronzeFlintAxe, "Axe", InfiMaterialEnum.Flint.getHarvestLevel());
		}

		if (PHInfiTools.enableBlazeTools)
		{
			diamondBlazeAxe = new InfiToolAxe(PHInfiTools.blazeAxeID + 0, InfiMaterialEnum.Blaze, InfiMaterialEnum.Diamond, "diamondBlazeAxe");
			obsidianBlazeAxe = new InfiToolAxe(PHInfiTools.blazeAxeID + 1, InfiMaterialEnum.Blaze, InfiMaterialEnum.Obsidian, "obsidianBlazeAxe");
			netherrackBlazeAxe = new InfiToolAxe(PHInfiTools.blazeAxeID + 2, InfiMaterialEnum.Blaze, InfiMaterialEnum.Netherrack, "netherrackBlazeAxe");
			lavaBlazeAxe = new InfiToolAxe(PHInfiTools.blazeAxeID + 3, InfiMaterialEnum.Blaze, InfiMaterialEnum.Lava, "lavaBlazeAxe");
			flintBlazeAxe = new InfiToolAxe(PHInfiTools.blazeAxeID + 4, InfiMaterialEnum.Blaze, InfiMaterialEnum.Flint, "flintBlazeAxe");
			blazeBlazeAxe = new InfiToolAxe(PHInfiTools.blazeAxeID + 5, InfiMaterialEnum.Blaze, InfiMaterialEnum.Blaze, "blazeBlazeAxe");
			manyullynBlazeAxe = new InfiToolAxe(PHInfiTools.blazeAxeID + 6, InfiMaterialEnum.Blaze, InfiMaterialEnum.Manyullyn, "manyullynBlazeAxe");
			uraniumBlazeAxe = new InfiToolAxe(PHInfiTools.blazeAxeID + 7, InfiMaterialEnum.Blaze, InfiMaterialEnum.Uranium, "uraniumBlazeAxe");

			MinecraftForge.setToolClass(diamondBlazeAxe, "Axe", InfiMaterialEnum.Blaze.getHarvestLevel());
			MinecraftForge.setToolClass(obsidianBlazeAxe, "Axe", InfiMaterialEnum.Blaze.getHarvestLevel());
			MinecraftForge.setToolClass(netherrackBlazeAxe, "Axe", InfiMaterialEnum.Blaze.getHarvestLevel());
			MinecraftForge.setToolClass(blazeBlazeAxe, "Axe", InfiMaterialEnum.Blaze.getHarvestLevel());
			MinecraftForge.setToolClass(flintBlazeAxe, "Axe", InfiMaterialEnum.Blaze.getHarvestLevel());
			MinecraftForge.setToolClass(blazeBlazeAxe, "Axe", InfiMaterialEnum.Blaze.getHarvestLevel());
			MinecraftForge.setToolClass(manyullynBlazeAxe, "Axe", InfiMaterialEnum.Blaze.getHarvestLevel());
			MinecraftForge.setToolClass(uraniumBlazeAxe, "Axe", InfiMaterialEnum.Blaze.getHarvestLevel());
		}

		if (PHInfiTools.enableCopperTools)
		{
			woodCopperAxe = new InfiToolAxe(PHInfiTools.copperAxeID + 0, InfiMaterialEnum.Copper, InfiMaterialEnum.Wood, "woodCopperAxe");
			stoneCopperAxe = new InfiToolAxe(PHInfiTools.copperAxeID + 1, InfiMaterialEnum.Copper, InfiMaterialEnum.Stone, "stoneCopperAxe");
			boneCopperAxe = new InfiToolAxe(PHInfiTools.copperAxeID + 2, InfiMaterialEnum.Copper, InfiMaterialEnum.Bone, "boneCopperAxe");
			netherrackCopperAxe = new InfiToolAxe(PHInfiTools.copperAxeID + 3, InfiMaterialEnum.Copper, InfiMaterialEnum.Netherrack, "netherrackCopperAxe");
			slimeCopperAxe = new InfiToolAxe(PHInfiTools.copperAxeID + 4, InfiMaterialEnum.Copper, InfiMaterialEnum.Slime, "slimeCopperAxe");
			cactusCopperAxe = new InfiToolAxe(PHInfiTools.copperAxeID + 5, InfiMaterialEnum.Copper, InfiMaterialEnum.Cactus, "cactusCopperAxe");
			flintCopperAxe = new InfiToolAxe(PHInfiTools.copperAxeID + 6, InfiMaterialEnum.Copper, InfiMaterialEnum.Flint, "flintCopperAxe");
			copperCopperAxe = new InfiToolAxe(PHInfiTools.copperAxeID + 7, InfiMaterialEnum.Copper, InfiMaterialEnum.Copper, "copperCopperAxe");

			MinecraftForge.setToolClass(woodCopperAxe, "Axe", InfiMaterialEnum.Copper.getHarvestLevel());
			MinecraftForge.setToolClass(stoneCopperAxe, "Axe", InfiMaterialEnum.Copper.getHarvestLevel());
			MinecraftForge.setToolClass(boneCopperAxe, "Axe", InfiMaterialEnum.Copper.getHarvestLevel());
			MinecraftForge.setToolClass(netherrackCopperAxe, "Axe", InfiMaterialEnum.Copper.getHarvestLevel());
			MinecraftForge.setToolClass(slimeCopperAxe, "Axe", InfiMaterialEnum.Copper.getHarvestLevel());
			MinecraftForge.setToolClass(cactusCopperAxe, "Axe", InfiMaterialEnum.Copper.getHarvestLevel());
			MinecraftForge.setToolClass(flintCopperAxe, "Axe", InfiMaterialEnum.Copper.getHarvestLevel());
			MinecraftForge.setToolClass(copperCopperAxe, "Axe", InfiMaterialEnum.Copper.getHarvestLevel());
		}

		if (PHInfiTools.enableBronzeTools)
		{
			woodBronzeAxe = new InfiToolAxe(PHInfiTools.bronzeAxeID + 0, InfiMaterialEnum.Bronze, InfiMaterialEnum.Wood, "woodBronzeAxe");
			stoneBronzeAxe = new InfiToolAxe(PHInfiTools.bronzeAxeID + 1, InfiMaterialEnum.Bronze, InfiMaterialEnum.Stone, "stoneBronzeAxe");
			boneBronzeAxe = new InfiToolAxe(PHInfiTools.bronzeAxeID + 2, InfiMaterialEnum.Bronze, InfiMaterialEnum.Bone, "boneBronzeAxe");
			netherrackBronzeAxe = new InfiToolAxe(PHInfiTools.bronzeAxeID + 3, InfiMaterialEnum.Bronze, InfiMaterialEnum.Netherrack, "netherrackBronzeAxe");
			slimeBronzeAxe = new InfiToolAxe(PHInfiTools.bronzeAxeID + 4, InfiMaterialEnum.Bronze, InfiMaterialEnum.Slime, "slimeBronzeAxe");
			cactusBronzeAxe = new InfiToolAxe(PHInfiTools.bronzeAxeID + 5, InfiMaterialEnum.Bronze, InfiMaterialEnum.Cactus, "cactusBronzeAxe");
			flintBronzeAxe = new InfiToolAxe(PHInfiTools.bronzeAxeID + 6, InfiMaterialEnum.Bronze, InfiMaterialEnum.Flint, "flintBronzeAxe");
			copperBronzeAxe = new InfiToolAxe(PHInfiTools.bronzeAxeID + 7, InfiMaterialEnum.Bronze, InfiMaterialEnum.Copper, "copperBronzeAxe");
			bronzeBronzeAxe = new InfiToolAxe(PHInfiTools.bronzeAxeID + 8, InfiMaterialEnum.Bronze, InfiMaterialEnum.Bronze, "bronzeBronzeAxe");

			MinecraftForge.setToolClass(woodBronzeAxe, "Axe", InfiMaterialEnum.Bronze.getHarvestLevel());
			MinecraftForge.setToolClass(stoneBronzeAxe, "Axe", InfiMaterialEnum.Bronze.getHarvestLevel());
			MinecraftForge.setToolClass(boneBronzeAxe, "Axe", InfiMaterialEnum.Bronze.getHarvestLevel());
			MinecraftForge.setToolClass(netherrackBronzeAxe, "Axe", InfiMaterialEnum.Bronze.getHarvestLevel());
			MinecraftForge.setToolClass(slimeBronzeAxe, "Axe", InfiMaterialEnum.Bronze.getHarvestLevel());
			MinecraftForge.setToolClass(cactusBronzeAxe, "Axe", InfiMaterialEnum.Bronze.getHarvestLevel());
			MinecraftForge.setToolClass(flintBronzeAxe, "Axe", InfiMaterialEnum.Bronze.getHarvestLevel());
			MinecraftForge.setToolClass(copperBronzeAxe, "Axe", InfiMaterialEnum.Bronze.getHarvestLevel());
			MinecraftForge.setToolClass(bronzeBronzeAxe, "Axe", InfiMaterialEnum.Bronze.getHarvestLevel());
		}

		if (PHInfiTools.enableWorkedIronTools)
		{
			woodWorkedIronAxe = new InfiToolAxe(PHInfiTools.workedIronAxeID + 0, InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Wood, "woodWorkedIronAxe");
			stoneWorkedIronAxe = new InfiToolAxe(PHInfiTools.workedIronAxeID + 1, InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Stone, "stoneWorkedIronAxe");
			ironWorkedIronAxe = new InfiToolAxe(PHInfiTools.workedIronAxeID + 2, InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Iron, "ironWorkedIronAxe");
			diamondWorkedIronAxe = new InfiToolAxe(PHInfiTools.workedIronAxeID + 3, InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Diamond, "diamondWorkedIronAxe");
			redstoneWorkedIronAxe = new InfiToolAxe(PHInfiTools.workedIronAxeID + 4, InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Redstone, "redstoneWorkedIronAxe");
			obsidianWorkedIronAxe = new InfiToolAxe(PHInfiTools.workedIronAxeID + 5, InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Obsidian, "obsidianWorkedIronAxe");
			boneWorkedIronAxe = new InfiToolAxe(PHInfiTools.workedIronAxeID + 6, InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Bone, "boneWorkedIronAxe");
			netherrackWorkedIronAxe = new InfiToolAxe(PHInfiTools.workedIronAxeID + 7, InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Netherrack, "netherrackWorkedIronAxe");
			glowstoneWorkedIronAxe = new InfiToolAxe(PHInfiTools.workedIronAxeID + 8, InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Glowstone, "glowstoneWorkedIronAxe");
			iceWorkedIronAxe = new InfiToolAxe(PHInfiTools.workedIronAxeID + 9, InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Ice, "iceWorkedIronAxe");
			slimeWorkedIronAxe = new InfiToolAxe(PHInfiTools.workedIronAxeID + 10, InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Slime, "slimeWorkedIronAxe");
			cactusWorkedIronAxe = new InfiToolAxe(PHInfiTools.workedIronAxeID + 11, InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Cactus, "cactusWorkedIronAxe");
			blazeWorkedIronAxe = new InfiToolAxe(PHInfiTools.workedIronAxeID + 12, InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Blaze, "blazeWorkedIronAxe");
			copperWorkedIronAxe = new InfiToolAxe(PHInfiTools.workedIronAxeID + 13, InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Copper, "copperWorkedIronAxe");
			bronzeWorkedIronAxe = new InfiToolAxe(PHInfiTools.workedIronAxeID + 14, InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Bronze, "bronzeWorkedIronAxe");
			workedWorkedIronAxe = new InfiToolAxe(PHInfiTools.workedIronAxeID + 15, InfiMaterialEnum.WorkedIron, InfiMaterialEnum.WorkedIron, "workedWorkedIronAxe");
			steelWorkedIronAxe = new InfiToolAxe(PHInfiTools.workedIronAxeID + 16, InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Steel, "steelWorkedIronAxe");
			uraniumWorkedIronAxe = new InfiToolAxe(PHInfiTools.workedIronAxeID + 17, InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Uranium, "uraniumWorkedIronAxe");

			MinecraftForge.setToolClass(woodWorkedIronAxe, "Axe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
			MinecraftForge.setToolClass(stoneWorkedIronAxe, "Axe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
			MinecraftForge.setToolClass(ironWorkedIronAxe, "Axe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
			MinecraftForge.setToolClass(diamondWorkedIronAxe, "Axe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
			MinecraftForge.setToolClass(redstoneWorkedIronAxe, "Axe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
			MinecraftForge.setToolClass(obsidianWorkedIronAxe, "Axe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
			MinecraftForge.setToolClass(boneWorkedIronAxe, "Axe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
			MinecraftForge.setToolClass(netherrackWorkedIronAxe, "Axe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
			MinecraftForge.setToolClass(glowstoneWorkedIronAxe, "Axe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
			MinecraftForge.setToolClass(iceWorkedIronAxe, "Axe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
			MinecraftForge.setToolClass(slimeWorkedIronAxe, "Axe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
			MinecraftForge.setToolClass(cactusWorkedIronAxe, "Axe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
			MinecraftForge.setToolClass(blazeWorkedIronAxe, "Axe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
			MinecraftForge.setToolClass(copperWorkedIronAxe, "Axe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
			MinecraftForge.setToolClass(bronzeWorkedIronAxe, "Axe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
			MinecraftForge.setToolClass(workedWorkedIronAxe, "Axe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
			MinecraftForge.setToolClass(steelWorkedIronAxe, "Axe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
			MinecraftForge.setToolClass(uraniumWorkedIronAxe, "Axe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
		}

		if (PHInfiTools.enableSteelTools)
		{
			woodSteelAxe = new InfiToolAxe(PHInfiTools.steelAxeID + 0, InfiMaterialEnum.Steel, InfiMaterialEnum.Wood, "woodSteelAxe");
			stoneSteelAxe = new InfiToolAxe(PHInfiTools.steelAxeID + 1, InfiMaterialEnum.Steel, InfiMaterialEnum.Stone, "stoneSteelAxe");
			ironSteelAxe = new InfiToolAxe(PHInfiTools.steelAxeID + 2, InfiMaterialEnum.Steel, InfiMaterialEnum.Iron, "ironSteelAxe");
			diamondSteelAxe = new InfiToolAxe(PHInfiTools.steelAxeID + 3, InfiMaterialEnum.Steel, InfiMaterialEnum.Diamond, "diamondSteelAxe");
			redstoneSteelAxe = new InfiToolAxe(PHInfiTools.steelAxeID + 4, InfiMaterialEnum.Steel, InfiMaterialEnum.Redstone, "redstoneSteelAxe");
			obsidianSteelAxe = new InfiToolAxe(PHInfiTools.steelAxeID + 5, InfiMaterialEnum.Steel, InfiMaterialEnum.Obsidian, "obsidianSteelAxe");
			boneSteelAxe = new InfiToolAxe(PHInfiTools.steelAxeID + 6, InfiMaterialEnum.Steel, InfiMaterialEnum.Bone, "boneSteelAxe");
			netherrackSteelAxe = new InfiToolAxe(PHInfiTools.steelAxeID + 7, InfiMaterialEnum.Steel, InfiMaterialEnum.Netherrack, "netherrackSteelAxe");
			glowstoneSteelAxe = new InfiToolAxe(PHInfiTools.steelAxeID + 8, InfiMaterialEnum.Steel, InfiMaterialEnum.Glowstone, "glowstoneSteelAxe");
			iceSteelAxe = new InfiToolAxe(PHInfiTools.steelAxeID + 9, InfiMaterialEnum.Steel, InfiMaterialEnum.Ice, "iceSteelAxe");
			slimeSteelAxe = new InfiToolAxe(PHInfiTools.steelAxeID + 10, InfiMaterialEnum.Steel, InfiMaterialEnum.Slime, "slimeSteelAxe");
			cactusSteelAxe = new InfiToolAxe(PHInfiTools.steelAxeID + 11, InfiMaterialEnum.Steel, InfiMaterialEnum.Cactus, "cactusSteelAxe");
			blazeSteelAxe = new InfiToolAxe(PHInfiTools.steelAxeID + 12, InfiMaterialEnum.Steel, InfiMaterialEnum.Blaze, "blazeSteelAxe");
			copperSteelAxe = new InfiToolAxe(PHInfiTools.steelAxeID + 13, InfiMaterialEnum.Steel, InfiMaterialEnum.Copper, "copperSteelAxe");
			bronzeSteelAxe = new InfiToolAxe(PHInfiTools.steelAxeID + 14, InfiMaterialEnum.Steel, InfiMaterialEnum.Bronze, "bronzeSteelAxe");
			workedSteelAxe = new InfiToolAxe(PHInfiTools.steelAxeID + 15, InfiMaterialEnum.Steel, InfiMaterialEnum.WorkedIron, "workedSteelAxe");
			steelSteelAxe = new InfiToolAxe(PHInfiTools.steelAxeID + 16, InfiMaterialEnum.Steel, InfiMaterialEnum.Steel, "steelSteelAxe");
			cobaltSteelAxe = new InfiToolAxe(PHInfiTools.steelAxeID + 17, InfiMaterialEnum.Steel, InfiMaterialEnum.Cobalt, "cobaltSteelAxe");
			arditeSteelAxe = new InfiToolAxe(PHInfiTools.steelAxeID + 18, InfiMaterialEnum.Steel, InfiMaterialEnum.Ardite, "arditeSteelAxe");
			uraniumSteelAxe = new InfiToolAxe(PHInfiTools.steelAxeID + 19, InfiMaterialEnum.Steel, InfiMaterialEnum.Uranium, "uraniumSteelAxe");

			MinecraftForge.setToolClass(woodSteelAxe, "Axe", InfiMaterialEnum.Steel.getHarvestLevel());
			MinecraftForge.setToolClass(stoneSteelAxe, "Axe", InfiMaterialEnum.Steel.getHarvestLevel());
			MinecraftForge.setToolClass(ironSteelAxe, "Axe", InfiMaterialEnum.Steel.getHarvestLevel());
			MinecraftForge.setToolClass(diamondSteelAxe, "Axe", InfiMaterialEnum.Steel.getHarvestLevel());
			MinecraftForge.setToolClass(redstoneSteelAxe, "Axe", InfiMaterialEnum.Steel.getHarvestLevel());
			MinecraftForge.setToolClass(obsidianSteelAxe, "Axe", InfiMaterialEnum.Steel.getHarvestLevel());
			MinecraftForge.setToolClass(boneSteelAxe, "Axe", InfiMaterialEnum.Steel.getHarvestLevel());
			MinecraftForge.setToolClass(netherrackSteelAxe, "Axe", InfiMaterialEnum.Steel.getHarvestLevel());
			MinecraftForge.setToolClass(glowstoneSteelAxe, "Axe", InfiMaterialEnum.Steel.getHarvestLevel());
			MinecraftForge.setToolClass(iceSteelAxe, "Axe", InfiMaterialEnum.Steel.getHarvestLevel());
			MinecraftForge.setToolClass(slimeSteelAxe, "Axe", InfiMaterialEnum.Steel.getHarvestLevel());
			MinecraftForge.setToolClass(cactusSteelAxe, "Axe", InfiMaterialEnum.Steel.getHarvestLevel());
			MinecraftForge.setToolClass(blazeSteelAxe, "Axe", InfiMaterialEnum.Steel.getHarvestLevel());
			MinecraftForge.setToolClass(copperSteelAxe, "Axe", InfiMaterialEnum.Steel.getHarvestLevel());
			MinecraftForge.setToolClass(bronzeSteelAxe, "Axe", InfiMaterialEnum.Steel.getHarvestLevel());
			MinecraftForge.setToolClass(workedSteelAxe, "Axe", InfiMaterialEnum.Steel.getHarvestLevel());
			MinecraftForge.setToolClass(steelSteelAxe, "Axe", InfiMaterialEnum.Steel.getHarvestLevel());
			MinecraftForge.setToolClass(cobaltSteelAxe, "Axe", InfiMaterialEnum.Steel.getHarvestLevel());
			MinecraftForge.setToolClass(arditeSteelAxe, "Axe", InfiMaterialEnum.Steel.getHarvestLevel());
			MinecraftForge.setToolClass(uraniumSteelAxe, "Axe", InfiMaterialEnum.Steel.getHarvestLevel());
		}

		if (PHInfiTools.enableCobaltTools)
		{
			woodCobaltAxe = new InfiToolAxe(PHInfiTools.cobaltAxeID + 0, InfiMaterialEnum.Cobalt, InfiMaterialEnum.Wood, "woodCobaltAxe");
			stoneCobaltAxe = new InfiToolAxe(PHInfiTools.cobaltAxeID + 1, InfiMaterialEnum.Cobalt, InfiMaterialEnum.Stone, "stoneCobaltAxe");
			ironCobaltAxe = new InfiToolAxe(PHInfiTools.cobaltAxeID + 2, InfiMaterialEnum.Cobalt, InfiMaterialEnum.Iron, "ironCobaltAxe");
			diamondCobaltAxe = new InfiToolAxe(PHInfiTools.cobaltAxeID + 3, InfiMaterialEnum.Cobalt, InfiMaterialEnum.Diamond, "diamondCobaltAxe");
			redstoneCobaltAxe = new InfiToolAxe(PHInfiTools.cobaltAxeID + 4, InfiMaterialEnum.Cobalt, InfiMaterialEnum.Redstone, "redstoneCobaltAxe");
			obsidianCobaltAxe = new InfiToolAxe(PHInfiTools.cobaltAxeID + 5, InfiMaterialEnum.Cobalt, InfiMaterialEnum.Obsidian, "obsidianCobaltAxe");
			boneCobaltAxe = new InfiToolAxe(PHInfiTools.cobaltAxeID + 6, InfiMaterialEnum.Cobalt, InfiMaterialEnum.Bone, "boneCobaltAxe");
			slimeCobaltAxe = new InfiToolAxe(PHInfiTools.cobaltAxeID + 7, InfiMaterialEnum.Cobalt, InfiMaterialEnum.Slime, "slimeCobaltAxe");
			cactusCobaltAxe = new InfiToolAxe(PHInfiTools.cobaltAxeID + 8, InfiMaterialEnum.Cobalt, InfiMaterialEnum.Cactus, "cactusCobaltAxe");
			blazeCobaltAxe = new InfiToolAxe(PHInfiTools.cobaltAxeID + 9, InfiMaterialEnum.Cobalt, InfiMaterialEnum.Blaze, "blazeCobaltAxe");
			copperCobaltAxe = new InfiToolAxe(PHInfiTools.cobaltAxeID + 10, InfiMaterialEnum.Cobalt, InfiMaterialEnum.Copper, "copperCobaltAxe");
			bronzeCobaltAxe = new InfiToolAxe(PHInfiTools.cobaltAxeID + 11, InfiMaterialEnum.Cobalt, InfiMaterialEnum.Bronze, "bronzeCobaltAxe");
			workedCobaltAxe = new InfiToolAxe(PHInfiTools.cobaltAxeID + 12, InfiMaterialEnum.Cobalt, InfiMaterialEnum.WorkedIron, "workedCobaltAxe");
			steelCobaltAxe = new InfiToolAxe(PHInfiTools.cobaltAxeID + 13, InfiMaterialEnum.Cobalt, InfiMaterialEnum.Steel, "steelCobaltAxe");
			cobaltCobaltAxe = new InfiToolAxe(PHInfiTools.cobaltAxeID + 14, InfiMaterialEnum.Cobalt, InfiMaterialEnum.Cobalt, "cobaltCobaltAxe");
			arditeCobaltAxe = new InfiToolAxe(PHInfiTools.cobaltAxeID + 15, InfiMaterialEnum.Cobalt, InfiMaterialEnum.Ardite, "arditeCobaltAxe");
			manyullynCobaltAxe = new InfiToolAxe(PHInfiTools.cobaltAxeID + 16, InfiMaterialEnum.Cobalt, InfiMaterialEnum.Manyullyn, "manyullynCobaltAxe");
			uraniumCobaltAxe = new InfiToolAxe(PHInfiTools.cobaltAxeID + 17, InfiMaterialEnum.Cobalt, InfiMaterialEnum.Uranium, "uraniumCobaltAxe");

			MinecraftForge.setToolClass(woodCobaltAxe, "Axe", InfiMaterialEnum.Cobalt.getHarvestLevel());
			MinecraftForge.setToolClass(stoneCobaltAxe, "Axe", InfiMaterialEnum.Cobalt.getHarvestLevel());
			MinecraftForge.setToolClass(ironCobaltAxe, "Axe", InfiMaterialEnum.Cobalt.getHarvestLevel());
			MinecraftForge.setToolClass(diamondCobaltAxe, "Axe", InfiMaterialEnum.Cobalt.getHarvestLevel());
			MinecraftForge.setToolClass(redstoneCobaltAxe, "Axe", InfiMaterialEnum.Cobalt.getHarvestLevel());
			MinecraftForge.setToolClass(obsidianCobaltAxe, "Axe", InfiMaterialEnum.Cobalt.getHarvestLevel());
			MinecraftForge.setToolClass(boneCobaltAxe, "Axe", InfiMaterialEnum.Cobalt.getHarvestLevel());
			MinecraftForge.setToolClass(slimeCobaltAxe, "Axe", InfiMaterialEnum.Cobalt.getHarvestLevel());
			MinecraftForge.setToolClass(cactusCobaltAxe, "Axe", InfiMaterialEnum.Cobalt.getHarvestLevel());
			MinecraftForge.setToolClass(blazeCobaltAxe, "Axe", InfiMaterialEnum.Cobalt.getHarvestLevel());
			MinecraftForge.setToolClass(copperCobaltAxe, "Axe", InfiMaterialEnum.Cobalt.getHarvestLevel());
			MinecraftForge.setToolClass(bronzeCobaltAxe, "Axe", InfiMaterialEnum.Cobalt.getHarvestLevel());
			MinecraftForge.setToolClass(workedCobaltAxe, "Axe", InfiMaterialEnum.Cobalt.getHarvestLevel());
			MinecraftForge.setToolClass(steelCobaltAxe, "Axe", InfiMaterialEnum.Cobalt.getHarvestLevel());
			MinecraftForge.setToolClass(cobaltCobaltAxe, "Axe", InfiMaterialEnum.Cobalt.getHarvestLevel());
			MinecraftForge.setToolClass(arditeCobaltAxe, "Axe", InfiMaterialEnum.Cobalt.getHarvestLevel());
			MinecraftForge.setToolClass(manyullynCobaltAxe, "Axe", InfiMaterialEnum.Cobalt.getHarvestLevel());
			MinecraftForge.setToolClass(uraniumCobaltAxe, "Axe", InfiMaterialEnum.Cobalt.getHarvestLevel());
		}

		if (PHInfiTools.enableArditeTools)
		{
			woodArditeAxe = new InfiToolAxe(PHInfiTools.arditeAxeID + 0, InfiMaterialEnum.Ardite, InfiMaterialEnum.Wood, "woodArditeAxe");
			stoneArditeAxe = new InfiToolAxe(PHInfiTools.arditeAxeID + 1, InfiMaterialEnum.Ardite, InfiMaterialEnum.Stone, "stoneArditeAxe");
			ironArditeAxe = new InfiToolAxe(PHInfiTools.arditeAxeID + 2, InfiMaterialEnum.Ardite, InfiMaterialEnum.Iron, "ironArditeAxe");
			diamondArditeAxe = new InfiToolAxe(PHInfiTools.arditeAxeID + 3, InfiMaterialEnum.Ardite, InfiMaterialEnum.Diamond, "diamondArditeAxe");
			redstoneArditeAxe = new InfiToolAxe(PHInfiTools.arditeAxeID + 4, InfiMaterialEnum.Ardite, InfiMaterialEnum.Redstone, "redstoneArditeAxe");
			obsidianArditeAxe = new InfiToolAxe(PHInfiTools.arditeAxeID + 5, InfiMaterialEnum.Ardite, InfiMaterialEnum.Obsidian, "obsidianArditeAxe");
			boneArditeAxe = new InfiToolAxe(PHInfiTools.arditeAxeID + 6, InfiMaterialEnum.Ardite, InfiMaterialEnum.Bone, "boneArditeAxe");
			slimeArditeAxe = new InfiToolAxe(PHInfiTools.arditeAxeID + 7, InfiMaterialEnum.Ardite, InfiMaterialEnum.Slime, "slimeArditeAxe");
			cactusArditeAxe = new InfiToolAxe(PHInfiTools.arditeAxeID + 8, InfiMaterialEnum.Ardite, InfiMaterialEnum.Cactus, "cactusArditeAxe");
			blazeArditeAxe = new InfiToolAxe(PHInfiTools.arditeAxeID + 9, InfiMaterialEnum.Ardite, InfiMaterialEnum.Blaze, "blazeArditeAxe");
			copperArditeAxe = new InfiToolAxe(PHInfiTools.arditeAxeID + 10, InfiMaterialEnum.Ardite, InfiMaterialEnum.Copper, "copperArditeAxe");
			bronzeArditeAxe = new InfiToolAxe(PHInfiTools.arditeAxeID + 11, InfiMaterialEnum.Ardite, InfiMaterialEnum.Bronze, "bronzeArditeAxe");
			workedArditeAxe = new InfiToolAxe(PHInfiTools.arditeAxeID + 12, InfiMaterialEnum.Ardite, InfiMaterialEnum.WorkedIron, "workedArditeAxe");
			steelArditeAxe = new InfiToolAxe(PHInfiTools.arditeAxeID + 13, InfiMaterialEnum.Ardite, InfiMaterialEnum.Steel, "steelArditeAxe");
			cobaltArditeAxe = new InfiToolAxe(PHInfiTools.arditeAxeID + 14, InfiMaterialEnum.Ardite, InfiMaterialEnum.Cobalt, "cobaltArditeAxe");
			arditeArditeAxe = new InfiToolAxe(PHInfiTools.arditeAxeID + 15, InfiMaterialEnum.Ardite, InfiMaterialEnum.Ardite, "arditeArditeAxe");
			manyullynArditeAxe = new InfiToolAxe(PHInfiTools.arditeAxeID + 16, InfiMaterialEnum.Ardite, InfiMaterialEnum.Manyullyn, "manyullynArditeAxe");
			uraniumArditeAxe = new InfiToolAxe(PHInfiTools.arditeAxeID + 17, InfiMaterialEnum.Ardite, InfiMaterialEnum.Uranium, "uraniumArditeAxe");

			MinecraftForge.setToolClass(woodArditeAxe, "Axe", InfiMaterialEnum.Ardite.getHarvestLevel());
			MinecraftForge.setToolClass(stoneArditeAxe, "Axe", InfiMaterialEnum.Ardite.getHarvestLevel());
			MinecraftForge.setToolClass(ironArditeAxe, "Axe", InfiMaterialEnum.Ardite.getHarvestLevel());
			MinecraftForge.setToolClass(diamondArditeAxe, "Axe", InfiMaterialEnum.Ardite.getHarvestLevel());
			MinecraftForge.setToolClass(redstoneArditeAxe, "Axe", InfiMaterialEnum.Ardite.getHarvestLevel());
			MinecraftForge.setToolClass(obsidianArditeAxe, "Axe", InfiMaterialEnum.Ardite.getHarvestLevel());
			MinecraftForge.setToolClass(boneArditeAxe, "Axe", InfiMaterialEnum.Ardite.getHarvestLevel());
			MinecraftForge.setToolClass(slimeArditeAxe, "Axe", InfiMaterialEnum.Ardite.getHarvestLevel());
			MinecraftForge.setToolClass(cactusArditeAxe, "Axe", InfiMaterialEnum.Ardite.getHarvestLevel());
			MinecraftForge.setToolClass(blazeArditeAxe, "Axe", InfiMaterialEnum.Ardite.getHarvestLevel());
			MinecraftForge.setToolClass(copperArditeAxe, "Axe", InfiMaterialEnum.Ardite.getHarvestLevel());
			MinecraftForge.setToolClass(bronzeArditeAxe, "Axe", InfiMaterialEnum.Ardite.getHarvestLevel());
			MinecraftForge.setToolClass(workedArditeAxe, "Axe", InfiMaterialEnum.Ardite.getHarvestLevel());
			MinecraftForge.setToolClass(steelArditeAxe, "Axe", InfiMaterialEnum.Ardite.getHarvestLevel());
			MinecraftForge.setToolClass(cobaltArditeAxe, "Axe", InfiMaterialEnum.Ardite.getHarvestLevel());
			MinecraftForge.setToolClass(arditeArditeAxe, "Axe", InfiMaterialEnum.Ardite.getHarvestLevel());
			MinecraftForge.setToolClass(manyullynArditeAxe, "Axe", InfiMaterialEnum.Ardite.getHarvestLevel());
			MinecraftForge.setToolClass(uraniumArditeAxe, "Axe", InfiMaterialEnum.Ardite.getHarvestLevel());
		}

		if (PHInfiTools.enableManyullynTools)
		{
			woodManyullynAxe = new InfiToolAxe(PHInfiTools.manyullynAxeID + 0, InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Wood, "woodManyullynAxe");
			stoneManyullynAxe = new InfiToolAxe(PHInfiTools.manyullynAxeID + 1, InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Stone, "stoneManyullynAxe");
			ironManyullynAxe = new InfiToolAxe(PHInfiTools.manyullynAxeID + 2, InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Iron, "ironManyullynAxe");
			diamondManyullynAxe = new InfiToolAxe(PHInfiTools.manyullynAxeID + 3, InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Diamond, "diamondManyullynAxe");
			redstoneManyullynAxe = new InfiToolAxe(PHInfiTools.manyullynAxeID + 4, InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Redstone, "redstoneManyullynAxe");
			obsidianManyullynAxe = new InfiToolAxe(PHInfiTools.manyullynAxeID + 5, InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Obsidian, "obsidianManyullynAxe");
			boneManyullynAxe = new InfiToolAxe(PHInfiTools.manyullynAxeID + 6, InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Bone, "boneManyullynAxe");
			slimeManyullynAxe = new InfiToolAxe(PHInfiTools.manyullynAxeID + 7, InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Slime, "slimeManyullynAxe");
			cactusManyullynAxe = new InfiToolAxe(PHInfiTools.manyullynAxeID + 8, InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Cactus, "cactusManyullynAxe");
			blazeManyullynAxe = new InfiToolAxe(PHInfiTools.manyullynAxeID + 9, InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Blaze, "blazeManyullynAxe");
			copperManyullynAxe = new InfiToolAxe(PHInfiTools.manyullynAxeID + 10, InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Copper, "copperManyullynAxe");
			bronzeManyullynAxe = new InfiToolAxe(PHInfiTools.manyullynAxeID + 11, InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Bronze, "bronzeManyullynAxe");
			workedManyullynAxe = new InfiToolAxe(PHInfiTools.manyullynAxeID + 12, InfiMaterialEnum.Manyullyn, InfiMaterialEnum.WorkedIron, "workedManyullynAxe");
			steelManyullynAxe = new InfiToolAxe(PHInfiTools.manyullynAxeID + 13, InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Steel, "steelManyullynAxe");
			cobaltManyullynAxe = new InfiToolAxe(PHInfiTools.manyullynAxeID + 14, InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Cobalt, "cobaltManyullynAxe");
			arditeManyullynAxe = new InfiToolAxe(PHInfiTools.manyullynAxeID + 15, InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Ardite, "arditeManyullynAxe");
			manyullynManyullynAxe = new InfiToolAxe(PHInfiTools.manyullynAxeID + 16, InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Manyullyn, "manyullynManyullynAxe");
			uraniumManyullynAxe = new InfiToolAxe(PHInfiTools.manyullynAxeID + 17, InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Uranium, "uraniumManyullynAxe");

			MinecraftForge.setToolClass(woodManyullynAxe, "Axe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
			MinecraftForge.setToolClass(stoneManyullynAxe, "Axe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
			MinecraftForge.setToolClass(ironManyullynAxe, "Axe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
			MinecraftForge.setToolClass(diamondManyullynAxe, "Axe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
			MinecraftForge.setToolClass(redstoneManyullynAxe, "Axe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
			MinecraftForge.setToolClass(obsidianManyullynAxe, "Axe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
			MinecraftForge.setToolClass(boneManyullynAxe, "Axe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
			MinecraftForge.setToolClass(slimeManyullynAxe, "Axe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
			MinecraftForge.setToolClass(cactusManyullynAxe, "Axe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
			MinecraftForge.setToolClass(blazeManyullynAxe, "Axe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
			MinecraftForge.setToolClass(copperManyullynAxe, "Axe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
			MinecraftForge.setToolClass(bronzeManyullynAxe, "Axe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
			MinecraftForge.setToolClass(workedManyullynAxe, "Axe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
			MinecraftForge.setToolClass(steelManyullynAxe, "Axe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
			MinecraftForge.setToolClass(cobaltManyullynAxe, "Axe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
			MinecraftForge.setToolClass(arditeManyullynAxe, "Axe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
			MinecraftForge.setToolClass(manyullynManyullynAxe, "Axe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
			MinecraftForge.setToolClass(uraniumManyullynAxe, "Axe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
		}

		if (PHInfiTools.enableUraniumTools)
		{
			diamondUraniumAxe = new InfiToolAxe(PHInfiTools.uraniumAxeID + 0, InfiMaterialEnum.Uranium, InfiMaterialEnum.Diamond, "diamondUraniumAxe");
			redstoneUraniumAxe = new InfiToolAxe(PHInfiTools.uraniumAxeID + 1, InfiMaterialEnum.Uranium, InfiMaterialEnum.Redstone, "redstoneUraniumAxe");
			boneUraniumAxe = new InfiToolAxe(PHInfiTools.uraniumAxeID + 2, InfiMaterialEnum.Uranium, InfiMaterialEnum.Bone, "boneUraniumAxe");
			netherrackUraniumAxe = new InfiToolAxe(PHInfiTools.uraniumAxeID + 3, InfiMaterialEnum.Uranium, InfiMaterialEnum.Netherrack, "netherrackUraniumAxe");
			glowstoneUraniumAxe = new InfiToolAxe(PHInfiTools.uraniumAxeID + 4, InfiMaterialEnum.Uranium, InfiMaterialEnum.Glowstone, "glowstoneUraniumAxe");
			lavaUraniumAxe = new InfiToolAxe(PHInfiTools.uraniumAxeID + 5, InfiMaterialEnum.Uranium, InfiMaterialEnum.Lava, "lavaUraniumAxe");
			blazeUraniumAxe = new InfiToolAxe(PHInfiTools.uraniumAxeID + 6, InfiMaterialEnum.Uranium, InfiMaterialEnum.Blaze, "blazeUraniumAxe");
			cobaltUraniumAxe = new InfiToolAxe(PHInfiTools.uraniumAxeID + 7, InfiMaterialEnum.Uranium, InfiMaterialEnum.Cobalt, "cobaltUraniumAxe");
			arditeUraniumAxe = new InfiToolAxe(PHInfiTools.uraniumAxeID + 8, InfiMaterialEnum.Uranium, InfiMaterialEnum.Ardite, "arditeUraniumAxe");
			uraniumUraniumAxe = new InfiToolAxe(PHInfiTools.uraniumAxeID + 9, InfiMaterialEnum.Uranium, InfiMaterialEnum.Uranium, "uraniumUraniumAxe");

			MinecraftForge.setToolClass(diamondUraniumAxe, "Axe", InfiMaterialEnum.Uranium.getHarvestLevel());
			MinecraftForge.setToolClass(redstoneUraniumAxe, "Axe", InfiMaterialEnum.Uranium.getHarvestLevel());
			MinecraftForge.setToolClass(boneUraniumAxe, "Axe", InfiMaterialEnum.Uranium.getHarvestLevel());
			MinecraftForge.setToolClass(netherrackUraniumAxe, "Axe", InfiMaterialEnum.Uranium.getHarvestLevel());
			MinecraftForge.setToolClass(glowstoneUraniumAxe, "Axe", InfiMaterialEnum.Uranium.getHarvestLevel());
			MinecraftForge.setToolClass(lavaUraniumAxe, "Axe", InfiMaterialEnum.Uranium.getHarvestLevel());
			MinecraftForge.setToolClass(blazeUraniumAxe, "Axe", InfiMaterialEnum.Uranium.getHarvestLevel());
			MinecraftForge.setToolClass(cobaltUraniumAxe, "Axe", InfiMaterialEnum.Uranium.getHarvestLevel());
			MinecraftForge.setToolClass(arditeUraniumAxe, "Axe", InfiMaterialEnum.Uranium.getHarvestLevel());
			MinecraftForge.setToolClass(uraniumUraniumAxe, "Axe", InfiMaterialEnum.Uranium.getHarvestLevel());
		}
	}

	private static void addNames()
	{
		if (PHInfiTools.enableStoneTools)
			LanguageRegistry.instance().addName(stoneStoneAxe, "Heavy Axe");
		if (PHInfiTools.enableIronTools)
			LanguageRegistry.instance().addName(ironIronAxe, "Ironic Axe");
		if (PHInfiTools.enableDiamondTools)
			LanguageRegistry.instance().addName(diamondDiamondAxe, "Diamondium Axe");
		if (PHInfiTools.enableRedstoneTools)
			LanguageRegistry.instance().addName(redstoneRedstoneAxe, "Redredred Axe");
		if (PHInfiTools.enableObsidianTools)
			LanguageRegistry.instance().addName(obsidianObsidianAxe, "Ebony Axe");
		if (PHInfiTools.enableSandstoneTools)
			LanguageRegistry.instance().addName(sandstoneSandstoneAxe, "Fragile Axe");
		if (PHInfiTools.enableNetherrackTools)
			LanguageRegistry.instance().addName(boneBoneAxe, "Necrotic Axe");
		if (PHInfiTools.enablePaperTools)
			LanguageRegistry.instance().addName(paperPaperAxe, "Soft Axe");
		if (PHInfiTools.enableMossyTools)
			LanguageRegistry.instance().addName(mossyMossyAxe, "Living Axe");
		if (PHInfiTools.enableNetherrackTools)
			LanguageRegistry.instance().addName(netherrackNetherrackAxe, "Bloodsoaked Axe");
		if (PHInfiTools.enableGlowstoneTools)
			LanguageRegistry.instance().addName(glowstoneGlowstoneAxe, "Bright Axe");
		if (PHInfiTools.enableIceTools)
			LanguageRegistry.instance().addName(iceIceAxe, "Freezing Axe");
		if (PHInfiTools.enableLavaTools)
			LanguageRegistry.instance().addName(lavaLavaAxe, "Burning Axe");
		if (PHInfiTools.enableSlimeTools)
			LanguageRegistry.instance().addName(slimeSlimeAxe, "Toy Axe");
		if (PHInfiTools.enableCactusTools)
			LanguageRegistry.instance().addName(cactusCactusAxe, "Thorned Axe");
		if (PHInfiTools.enableFlintTools)
			LanguageRegistry.instance().addName(flintFlintAxe, "Rough-hewn Axe");
		if (PHInfiTools.enableBlazeTools)
			LanguageRegistry.instance().addName(blazeBlazeAxe, "Netherite Axe");
		if (PHInfiTools.enableCopperTools)
			LanguageRegistry.instance().addName(copperCopperAxe, "Orange-Tang Axe");
		if (PHInfiTools.enableBronzeTools)
			LanguageRegistry.instance().addName(bronzeBronzeAxe, "Polished Axe");
		if (PHInfiTools.enableWorkedIronTools)
			LanguageRegistry.instance().addName(workedWorkedIronAxe, "Reworked Iron Axe");
		if (PHInfiTools.enableSteelTools)
			LanguageRegistry.instance().addName(steelSteelAxe, "Forge-Wrought Axe");
		if (PHInfiTools.enableCobaltTools)
			LanguageRegistry.instance().addName(cobaltCobaltAxe, "Beautiful Axe");
		if (PHInfiTools.enableArditeTools)
			LanguageRegistry.instance().addName(arditeArditeAxe, "Rustic Axe");
		if (PHInfiTools.enableManyullynTools)
			LanguageRegistry.instance().addName(manyullynManyullynAxe, "False-Prophetic Axe");
		if (PHInfiTools.enableUraniumTools)
			LanguageRegistry.instance().addName(uraniumUraniumAxe, "Cancerous Axe");
	}

	public static void registerInfiToolsRecipes()
	{
		if (PHInfiTools.enableWoodTools)
		{
			GameRegistry.addRecipe(new ItemStack(sandstoneWoodAxe), recipe, '#', Block.planks, '|', InfiLibrary.sandstoneRod );
			GameRegistry.addRecipe(new ItemStack(boneWoodAxe), recipe, '#', Block.planks, '|', Item.bone );
			GameRegistry.addRecipe(new ItemStack(boneWoodAxe), recipe, '#', Block.planks, '|', InfiLibrary.boneRod );
			GameRegistry.addRecipe(new ItemStack(paperWoodAxe), recipe, '#', Block.planks, '|', InfiLibrary.paperRod );
			GameRegistry.addRecipe(new ItemStack(iceWoodAxe), recipe, '#', Block.planks, '|', InfiLibrary.iceRod );
			GameRegistry.addRecipe(new ItemStack(slimeWoodAxe), recipe, '#', Block.planks, '|', InfiLibrary.slimeRod );
			GameRegistry.addRecipe(new ItemStack(cactusWoodAxe), recipe, '#', Block.planks, '|', InfiLibrary.cactusRod );
		}

		if (PHInfiTools.enableStoneTools)
		{
			GameRegistry.addRecipe(new ItemStack(stoneStoneAxe), recipe, '#', Block.cobblestone, '|', InfiLibrary.stoneRod );
			GameRegistry.addRecipe(new ItemStack(sandstoneStoneAxe), recipe, '#', Block.cobblestone, '|', InfiLibrary.sandstoneRod );
			GameRegistry.addRecipe(new ItemStack(boneStoneAxe), recipe, '#', Block.cobblestone, '|', Item.bone );
			GameRegistry.addRecipe(new ItemStack(boneStoneAxe), recipe, '#', Block.cobblestone, '|', InfiLibrary.boneRod );
			GameRegistry.addRecipe(new ItemStack(netherrackStoneAxe), recipe, '#', Block.cobblestone, '|', InfiLibrary.netherrackRod );
			GameRegistry.addRecipe(new ItemStack(iceStoneAxe), recipe, '#', Block.cobblestone, '|', InfiLibrary.iceRod );
			GameRegistry.addRecipe(new ItemStack(slimeStoneAxe), recipe, '#', Block.cobblestone, '|', InfiLibrary.slimeRod );
			GameRegistry.addRecipe(new ItemStack(cactusStoneAxe), recipe, '#', Block.cobblestone, '|', InfiLibrary.cactusRod );
			GameRegistry.addRecipe(new ItemStack(flintStoneAxe), recipe, '#', Block.cobblestone, '|', InfiLibrary.flintRod );

			GameRegistry.addRecipe(new ItemStack(stoneStoneAxe), recipe, '#', Block.stone, '|', InfiLibrary.stoneRod );
			GameRegistry.addRecipe(new ItemStack(sandstoneStoneAxe), recipe, '#', Block.stone, '|', InfiLibrary.sandstoneRod );
			GameRegistry.addRecipe(new ItemStack(boneStoneAxe), recipe, '#', Block.stone, '|', Item.bone );
			GameRegistry.addRecipe(new ItemStack(boneStoneAxe), recipe, '#', Block.stone, '|', InfiLibrary.boneRod );
			GameRegistry.addRecipe(new ItemStack(netherrackStoneAxe), recipe, '#', Block.stone, '|', InfiLibrary.netherrackRod );
			GameRegistry.addRecipe(new ItemStack(iceStoneAxe), recipe, '#', Block.stone, '|', InfiLibrary.iceRod );
			GameRegistry.addRecipe(new ItemStack(slimeStoneAxe), recipe, '#', Block.stone, '|', InfiLibrary.slimeRod );
			GameRegistry.addRecipe(new ItemStack(cactusStoneAxe), recipe, '#', Block.stone, '|', InfiLibrary.cactusRod );
			GameRegistry.addRecipe(new ItemStack(flintStoneAxe), recipe, '#', Block.stone, '|', InfiLibrary.flintRod );
		}

		if (PHInfiTools.enableIronTools)
		{
			GameRegistry.addRecipe(new ItemStack(stoneIronAxe), recipe, '#', Item.ingotIron, '|', InfiLibrary.stoneRod );
			GameRegistry.addRecipe(new ItemStack(ironIronAxe), recipe, '#', Item.ingotIron, '|', InfiLibrary.ironRod );
			GameRegistry.addRecipe(new ItemStack(boneIronAxe), recipe, '#', Item.ingotIron, '|', Item.bone );
			GameRegistry.addRecipe(new ItemStack(boneIronAxe), recipe, '#', Item.ingotIron, '|', InfiLibrary.boneRod );
			GameRegistry.addRecipe(new ItemStack(netherrackIronAxe), recipe, '#', Item.ingotIron, '|', InfiLibrary.netherrackRod );
			GameRegistry.addRecipe(new ItemStack(glowstoneIronAxe), recipe, '#', Item.ingotIron, '|', InfiLibrary.glowstoneRod );
			GameRegistry.addRecipe(new ItemStack(cactusIronAxe), recipe, '#', Item.ingotIron, '|', InfiLibrary.cactusRod );
			GameRegistry.addRecipe(new ItemStack(copperIronAxe), recipe, '#', Item.ingotIron, '|', InfiLibrary.copperRod );
			GameRegistry.addRecipe(new ItemStack(bronzeIronAxe), recipe, '#', Item.ingotIron, '|', InfiLibrary.bronzeRod );
		}

		if (PHInfiTools.enableDiamondTools)
		{
			GameRegistry.addRecipe(new ItemStack(stoneDiamondAxe), recipe, '#', Item.diamond, '|', InfiLibrary.stoneRod );
			GameRegistry.addRecipe(new ItemStack(ironDiamondAxe), recipe, '#', Item.diamond, '|', InfiLibrary.ironRod );
			GameRegistry.addRecipe(new ItemStack(diamondDiamondAxe), recipe, '#', Item.diamond, '|', InfiLibrary.diamondRod );
			GameRegistry.addRecipe(new ItemStack(redstoneDiamondAxe), recipe, '#', Item.diamond, '|', InfiLibrary.redstoneRod );
			GameRegistry.addRecipe(new ItemStack(obsidianDiamondAxe), recipe, '#', Item.diamond, '|', InfiLibrary.obsidianRod );
			GameRegistry.addRecipe(new ItemStack(boneDiamondAxe), recipe, '#', Item.diamond, '|', Item.bone );
			GameRegistry.addRecipe(new ItemStack(boneDiamondAxe), recipe, '#', Item.diamond, '|', InfiLibrary.boneRod );
			GameRegistry.addRecipe(new ItemStack(mossyDiamondAxe), recipe, '#', Item.diamond, '|', InfiLibrary.mossyRod );
			GameRegistry.addRecipe(new ItemStack(netherrackDiamondAxe), recipe, '#', Item.diamond, '|', InfiLibrary.netherrackRod );
			GameRegistry.addRecipe(new ItemStack(glowstoneDiamondAxe), recipe, '#', Item.diamond, '|', InfiLibrary.glowstoneRod );
			GameRegistry.addRecipe(new ItemStack(lavaDiamondAxe), recipe, '#', Item.diamond, '|', InfiLibrary.lavaRod );
			GameRegistry.addRecipe(new ItemStack(cactusDiamondAxe), recipe, '#', Item.diamond, '|', InfiLibrary.cactusRod );
			GameRegistry.addRecipe(new ItemStack(flintDiamondAxe), recipe, '#', Item.diamond, '|', InfiLibrary.flintRod );
			GameRegistry.addRecipe(new ItemStack(blazeDiamondAxe), recipe, '#', Item.diamond, '|', Item.blazeRod );
			GameRegistry.addRecipe(new ItemStack(copperDiamondAxe), recipe, '#', Item.diamond, '|', InfiLibrary.copperRod );
			GameRegistry.addRecipe(new ItemStack(bronzeDiamondAxe), recipe, '#', Item.diamond, '|', InfiLibrary.bronzeRod );
			GameRegistry.addRecipe(new ItemStack(workedDiamondAxe), recipe, '#', Item.diamond, '|', InfiLibrary.workedIronRod );
			GameRegistry.addRecipe(new ItemStack(steelDiamondAxe), recipe, '#', Item.diamond, '|', InfiLibrary.steelRod );
			GameRegistry.addRecipe(new ItemStack(cobaltDiamondAxe), recipe, '#', Item.diamond, '|', InfiLibrary.cobaltRod );
			GameRegistry.addRecipe(new ItemStack(arditeDiamondAxe), recipe, '#', Item.diamond, '|', InfiLibrary.arditeRod );
			GameRegistry.addRecipe(new ItemStack(manyullynDiamondAxe), recipe, '#', Item.diamond, '|', InfiLibrary.manyullynRod );
			GameRegistry.addRecipe(new ItemStack(uraniumDiamondAxe), recipe, '#', Item.diamond, '|', InfiLibrary.uraniumRod );
		}

		if (PHInfiTools.enableRedstoneTools)
		{
			GameRegistry.addRecipe(new ItemStack(woodRedstoneAxe), recipe, '#', InfiLibrary.redstoneCrystal, '|', Item.stick );
			GameRegistry.addRecipe(new ItemStack(stoneRedstoneAxe), recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.stoneRod );
			GameRegistry.addRecipe(new ItemStack(ironRedstoneAxe), recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.ironRod );
			GameRegistry.addRecipe(new ItemStack(redstoneRedstoneAxe), recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.redstoneRod );
			GameRegistry.addRecipe(new ItemStack(obsidianRedstoneAxe), recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.obsidianRod );
			GameRegistry.addRecipe(new ItemStack(sandstoneRedstoneAxe), recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.sandstoneRod );
			GameRegistry.addRecipe(new ItemStack(boneRedstoneAxe), recipe, '#', InfiLibrary.redstoneCrystal, '|', Item.bone );
			GameRegistry.addRecipe(new ItemStack(boneRedstoneAxe), recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.boneRod );
			GameRegistry.addRecipe(new ItemStack(paperRedstoneAxe), recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.paperRod );
			GameRegistry.addRecipe(new ItemStack(mossyRedstoneAxe), recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.mossyRod );
			GameRegistry.addRecipe(new ItemStack(netherrackRedstoneAxe), recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.netherrackRod );
			GameRegistry.addRecipe(new ItemStack(glowstoneRedstoneAxe), recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.glowstoneRod );
			GameRegistry.addRecipe(new ItemStack(iceRedstoneAxe), recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.iceRod );
			GameRegistry.addRecipe(new ItemStack(lavaRedstoneAxe), recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.lavaRod );
			GameRegistry.addRecipe(new ItemStack(slimeRedstoneAxe), recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.slimeRod );
			GameRegistry.addRecipe(new ItemStack(cactusRedstoneAxe), recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.cactusRod );
			GameRegistry.addRecipe(new ItemStack(flintRedstoneAxe), recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.flintRod );
			GameRegistry.addRecipe(new ItemStack(copperRedstoneAxe), recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.copperRod );
			GameRegistry.addRecipe(new ItemStack(bronzeRedstoneAxe), recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.bronzeRod );
			GameRegistry.addRecipe(new ItemStack(workedRedstoneAxe), recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.workedIronRod );
			GameRegistry.addRecipe(new ItemStack(uraniumRedstoneAxe), recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.uraniumRod );
		}

		if (PHInfiTools.enableObsidianTools)
		{
			GameRegistry.addRecipe(new ItemStack(woodObsidianAxe), recipe, '#', Block.obsidian, '|', Item.stick );
			GameRegistry.addRecipe(new ItemStack(stoneObsidianAxe), recipe, '#', Block.obsidian, '|', InfiLibrary.stoneRod );
			GameRegistry.addRecipe(new ItemStack(redstoneObsidianAxe), recipe, '#', Block.obsidian, '|', InfiLibrary.redstoneRod );
			GameRegistry.addRecipe(new ItemStack(obsidianObsidianAxe), recipe, '#', Block.obsidian, '|', InfiLibrary.obsidianRod );
			GameRegistry.addRecipe(new ItemStack(boneObsidianAxe), recipe, '#', Block.obsidian, '|', Item.bone );
			GameRegistry.addRecipe(new ItemStack(boneObsidianAxe), recipe, '#', Block.obsidian, '|', InfiLibrary.boneRod );
			GameRegistry.addRecipe(new ItemStack(netherrackObsidianAxe), recipe, '#', Block.obsidian, '|', InfiLibrary.netherrackRod );
			GameRegistry.addRecipe(new ItemStack(glowstoneObsidianAxe), recipe, '#', Block.obsidian, '|', InfiLibrary.glowstoneRod );
			GameRegistry.addRecipe(new ItemStack(iceObsidianAxe), recipe, '#', Block.obsidian, '|', InfiLibrary.iceRod );
			GameRegistry.addRecipe(new ItemStack(lavaObsidianAxe), recipe, '#', Block.obsidian, '|', InfiLibrary.lavaRod );
			GameRegistry.addRecipe(new ItemStack(cactusObsidianAxe), recipe, '#', Block.obsidian, '|', InfiLibrary.cactusRod );
		}

		if (PHInfiTools.enableSandstoneTools)
		{
			GameRegistry.addRecipe(new ItemStack(woodSandstoneAxe), recipe, '#', Block.sandStone, '|', Item.stick );
			GameRegistry.addRecipe(new ItemStack(sandstoneSandstoneAxe), recipe, '#', Block.sandStone, '|', InfiLibrary.sandstoneRod );
			GameRegistry.addRecipe(new ItemStack(boneSandstoneAxe), recipe, '#', Block.sandStone, '|', Item.bone );
			GameRegistry.addRecipe(new ItemStack(boneSandstoneAxe), recipe, '#', Block.sandStone, '|', InfiLibrary.boneRod );
			GameRegistry.addRecipe(new ItemStack(netherrackSandstoneAxe), recipe, '#', Block.sandStone, '|', InfiLibrary.netherrackRod );
			GameRegistry.addRecipe(new ItemStack(iceSandstoneAxe), recipe, '#', Block.sandStone, '|', InfiLibrary.iceRod );
			GameRegistry.addRecipe(new ItemStack(slimeSandstoneAxe), recipe, '#', Block.sandStone, '|', InfiLibrary.slimeRod );
			GameRegistry.addRecipe(new ItemStack(cactusSandstoneAxe), recipe, '#', Block.sandStone, '|', InfiLibrary.cactusRod );
			GameRegistry.addRecipe(new ItemStack(flintSandstoneAxe), recipe, '#', Block.sandStone, '|', InfiLibrary.flintRod );
		}

		if (PHInfiTools.enableBoneTools)
		{
			GameRegistry.addRecipe(new ItemStack(woodBoneAxe), recipe, '#', Item.bone, '|', Item.stick );
			GameRegistry.addRecipe(new ItemStack(stoneBoneAxe), recipe, '#', Item.bone, '|', InfiLibrary.stoneRod );
			GameRegistry.addRecipe(new ItemStack(sandstoneBoneAxe), recipe, '#', Item.bone, '|', InfiLibrary.sandstoneRod );
			GameRegistry.addRecipe(new ItemStack(boneBoneAxe), recipe, '#', Item.bone, '|', Item.bone );
			GameRegistry.addRecipe(new ItemStack(boneBoneAxe), recipe, '#', Item.bone, '|', InfiLibrary.boneRod );
			GameRegistry.addRecipe(new ItemStack(paperBoneAxe), recipe, '#', Item.bone, '|', InfiLibrary.paperRod );
			GameRegistry.addRecipe(new ItemStack(netherrackBoneAxe), recipe, '#', Item.bone, '|', InfiLibrary.netherrackRod );
			GameRegistry.addRecipe(new ItemStack(iceBoneAxe), recipe, '#', Item.bone, '|', InfiLibrary.iceRod );
			GameRegistry.addRecipe(new ItemStack(cactusBoneAxe), recipe, '#', Item.bone, '|', InfiLibrary.cactusRod );
			GameRegistry.addRecipe(new ItemStack(flintBoneAxe), recipe, '#', Item.bone, '|', InfiLibrary.flintRod );
		}

		if (PHInfiTools.enablePaperTools)
		{
			GameRegistry.addRecipe(new ItemStack(woodPaperAxe), recipe, '#', InfiLibrary.paperStack, '|', Item.stick );
			GameRegistry.addRecipe(new ItemStack(bonePaperAxe), recipe, '#', InfiLibrary.paperStack, '|', Item.bone );
			GameRegistry.addRecipe(new ItemStack(bonePaperAxe), recipe, '#', InfiLibrary.paperStack, '|', InfiLibrary.boneRod );
			GameRegistry.addRecipe(new ItemStack(paperPaperAxe), recipe, '#', InfiLibrary.paperStack, '|', InfiLibrary.paperRod );
			GameRegistry.addRecipe(new ItemStack(slimePaperAxe), recipe, '#', InfiLibrary.paperStack, '|', InfiLibrary.slimeRod );
			GameRegistry.addRecipe(new ItemStack(cactusPaperAxe), recipe, '#', InfiLibrary.paperStack, '|', InfiLibrary.cactusRod );
		}

		if (PHInfiTools.enableMossyTools)
		{
			GameRegistry.addRecipe(new ItemStack(woodMossyAxe), recipe, '#', InfiLibrary.mossyStone, '|', Item.stick );
			GameRegistry.addRecipe(new ItemStack(stoneMossyAxe), recipe, '#', InfiLibrary.mossyStone, '|', InfiLibrary.stoneRod );
			GameRegistry.addRecipe(new ItemStack(diamondMossyAxe), recipe, '#', InfiLibrary.mossyStone, '|', InfiLibrary.diamondRod );
			GameRegistry.addRecipe(new ItemStack(redstoneMossyAxe), recipe, '#', InfiLibrary.mossyStone, '|', InfiLibrary.redstoneRod );
			GameRegistry.addRecipe(new ItemStack(boneMossyAxe), recipe, '#', InfiLibrary.mossyStone, '|', Item.bone );
			GameRegistry.addRecipe(new ItemStack(boneMossyAxe), recipe, '#', InfiLibrary.mossyStone, '|', InfiLibrary.boneRod );
			GameRegistry.addRecipe(new ItemStack(mossyMossyAxe), recipe, '#', InfiLibrary.mossyStone, '|', InfiLibrary.mossyRod );
			GameRegistry.addRecipe(new ItemStack(netherrackMossyAxe), recipe, '#', InfiLibrary.mossyStone, '|', InfiLibrary.netherrackRod );
			GameRegistry.addRecipe(new ItemStack(glowstoneMossyAxe), recipe, '#', InfiLibrary.mossyStone, '|', InfiLibrary.glowstoneRod );
			GameRegistry.addRecipe(new ItemStack(cactusMossyAxe), recipe, '#', InfiLibrary.mossyStone, '|', InfiLibrary.cactusRod );
			GameRegistry.addRecipe(new ItemStack(blazeMossyAxe), recipe, '#', InfiLibrary.mossyStone, '|', Item.blazeRod );
			GameRegistry.addRecipe(new ItemStack(manyullynMossyAxe), recipe, '#', InfiLibrary.mossyStone, '|', InfiLibrary.manyullynRod );
			GameRegistry.addRecipe(new ItemStack(uraniumMossyAxe), recipe, '#', InfiLibrary.mossyStone, '|', InfiLibrary.uraniumRod );
		}

		if (PHInfiTools.enableNetherrackTools)
		{
			GameRegistry.addRecipe(new ItemStack(woodNetherrackAxe), recipe, '#', Block.netherrack, '|', Item.stick );
			GameRegistry.addRecipe(new ItemStack(stoneNetherrackAxe), recipe, '#', Block.netherrack, '|', InfiLibrary.stoneRod );
			GameRegistry.addRecipe(new ItemStack(sandstoneNetherrackAxe), recipe, '#', Block.netherrack, '|', InfiLibrary.sandstoneRod );
			GameRegistry.addRecipe(new ItemStack(boneNetherrackAxe), recipe, '#', Block.netherrack, '|', Item.bone );
			GameRegistry.addRecipe(new ItemStack(boneNetherrackAxe), recipe, '#', Block.netherrack, '|', InfiLibrary.boneRod );
			GameRegistry.addRecipe(new ItemStack(paperNetherrackAxe), recipe, '#', Block.netherrack, '|', InfiLibrary.paperRod );
			GameRegistry.addRecipe(new ItemStack(mossyNetherrackAxe), recipe, '#', Block.netherrack, '|', InfiLibrary.mossyRod );
			GameRegistry.addRecipe(new ItemStack(netherrackNetherrackAxe), recipe, '#', Block.netherrack, '|', InfiLibrary.netherrackRod );
			GameRegistry.addRecipe(new ItemStack(iceNetherrackAxe), recipe, '#', Block.netherrack, '|', InfiLibrary.iceRod );
			GameRegistry.addRecipe(new ItemStack(slimeNetherrackAxe), recipe, '#', Block.netherrack, '|', InfiLibrary.slimeRod );
			GameRegistry.addRecipe(new ItemStack(cactusNetherrackAxe), recipe, '#', Block.netherrack, '|', InfiLibrary.cactusRod );
			GameRegistry.addRecipe(new ItemStack(flintNetherrackAxe), recipe, '#', Block.netherrack, '|', InfiLibrary.flintRod );
			GameRegistry.addRecipe(new ItemStack(copperNetherrackAxe), recipe, '#', Block.netherrack, '|', InfiLibrary.copperRod );
			GameRegistry.addRecipe(new ItemStack(bronzeNetherrackAxe), recipe, '#', Block.netherrack, '|', InfiLibrary.bronzeRod );
		}

		if (PHInfiTools.enableGlowstoneTools)
		{
			GameRegistry.addRecipe(new ItemStack(woodGlowstoneAxe), recipe, '#', InfiLibrary.glowstoneCrystal, '|', Item.stick );
			GameRegistry.addRecipe(new ItemStack(redstoneGlowstoneAxe), recipe, '#', InfiLibrary.glowstoneCrystal, '|', InfiLibrary.redstoneRod );
			GameRegistry.addRecipe(new ItemStack(obsidianGlowstoneAxe), recipe, '#', InfiLibrary.glowstoneCrystal, '|', InfiLibrary.obsidianRod );
			GameRegistry.addRecipe(new ItemStack(boneGlowstoneAxe), recipe, '#', InfiLibrary.glowstoneCrystal, '|', Item.bone );
			GameRegistry.addRecipe(new ItemStack(boneGlowstoneAxe), recipe, '#', InfiLibrary.glowstoneCrystal, '|', InfiLibrary.boneRod );
			GameRegistry.addRecipe(new ItemStack(netherrackGlowstoneAxe), recipe, '#', InfiLibrary.glowstoneCrystal, '|', InfiLibrary.netherrackRod );
			GameRegistry.addRecipe(new ItemStack(glowstoneGlowstoneAxe), recipe, '#', InfiLibrary.glowstoneCrystal, '|', InfiLibrary.glowstoneRod );
			GameRegistry.addRecipe(new ItemStack(iceGlowstoneAxe), recipe, '#', InfiLibrary.glowstoneCrystal, '|', InfiLibrary.iceRod );
			GameRegistry.addRecipe(new ItemStack(slimeGlowstoneAxe), recipe, '#', InfiLibrary.glowstoneCrystal, '|', InfiLibrary.slimeRod );
			GameRegistry.addRecipe(new ItemStack(cactusGlowstoneAxe), recipe, '#', InfiLibrary.glowstoneCrystal, '|', InfiLibrary.cactusRod );
		}

		if (PHInfiTools.enableIceTools)
		{
			GameRegistry.addRecipe(new ItemStack(woodIceAxe), recipe, '#', Block.ice, '|', Item.stick );
			GameRegistry.addRecipe(new ItemStack(boneIceAxe), recipe, '#', Block.ice, '|', Item.bone );
			GameRegistry.addRecipe(new ItemStack(boneIceAxe), recipe, '#', Block.ice, '|', InfiLibrary.boneRod );
			GameRegistry.addRecipe(new ItemStack(paperIceAxe), recipe, '#', Block.ice, '|', InfiLibrary.paperRod );
			GameRegistry.addRecipe(new ItemStack(iceIceAxe), recipe, '#', Block.ice, '|', InfiLibrary.iceRod );
			GameRegistry.addRecipe(new ItemStack(slimeIceAxe), recipe, '#', Block.ice, '|', InfiLibrary.slimeRod );
			GameRegistry.addRecipe(new ItemStack(cactusIceAxe), recipe, '#', Block.ice, '|', InfiLibrary.cactusRod );
		}

		if (PHInfiTools.enableLavaTools)
		{
			GameRegistry.addRecipe(new ItemStack(diamondLavaAxe), recipe, '#', InfiLibrary.lavaCrystal, '|', InfiLibrary.diamondRod );
			GameRegistry.addRecipe(new ItemStack(obsidianLavaAxe), recipe, '#', InfiLibrary.lavaCrystal, '|', InfiLibrary.obsidianRod );
			GameRegistry.addRecipe(new ItemStack(netherrackLavaAxe), recipe, '#', InfiLibrary.lavaCrystal, '|', InfiLibrary.netherrackRod );
			GameRegistry.addRecipe(new ItemStack(lavaLavaAxe), recipe, '#', InfiLibrary.lavaCrystal, '|', InfiLibrary.lavaRod );
			GameRegistry.addRecipe(new ItemStack(flintLavaAxe), recipe, '#', InfiLibrary.lavaCrystal, '|', InfiLibrary.flintRod );
			GameRegistry.addRecipe(new ItemStack(blazeLavaAxe), recipe, '#', InfiLibrary.lavaCrystal, '|', Item.blazeRod );
			GameRegistry.addRecipe(new ItemStack(manyullynLavaAxe), recipe, '#', InfiLibrary.lavaCrystal, '|', InfiLibrary.manyullynRod );
			GameRegistry.addRecipe(new ItemStack(uraniumLavaAxe), recipe, '#', InfiLibrary.lavaCrystal, '|', InfiLibrary.uraniumRod );
		}

		if (PHInfiTools.enableSlimeTools)
		{
			GameRegistry.addRecipe(new ItemStack(woodSlimeAxe), recipe, '#', InfiLibrary.slimeCrystal, '|', Item.stick );
			GameRegistry.addRecipe(new ItemStack(sandstoneSlimeAxe), recipe, '#', InfiLibrary.slimeCrystal, '|', InfiLibrary.sandstoneRod );
			GameRegistry.addRecipe(new ItemStack(boneSlimeAxe), recipe, '#', InfiLibrary.slimeCrystal, '|', Item.bone );
			GameRegistry.addRecipe(new ItemStack(boneSlimeAxe), recipe, '#', InfiLibrary.slimeCrystal, '|', InfiLibrary.boneRod );
			GameRegistry.addRecipe(new ItemStack(paperSlimeAxe), recipe, '#', InfiLibrary.slimeCrystal, '|', InfiLibrary.paperRod );
			GameRegistry.addRecipe(new ItemStack(slimeSlimeAxe), recipe, '#', InfiLibrary.slimeCrystal, '|', InfiLibrary.slimeRod );
			GameRegistry.addRecipe(new ItemStack(cactusSlimeAxe), recipe, '#', InfiLibrary.slimeCrystal, '|', InfiLibrary.cactusRod );
		}

		if (PHInfiTools.enableCactusTools)
		{
			GameRegistry.addRecipe(new ItemStack(woodCactusAxe), recipe, '#', Block.cactus, '|', Item.stick );
			GameRegistry.addRecipe(new ItemStack(sandstoneCactusAxe), recipe, '#', Block.cactus, '|', InfiLibrary.sandstoneRod );
			GameRegistry.addRecipe(new ItemStack(boneCactusAxe), recipe, '#', Block.cactus, '|', Item.bone );
			GameRegistry.addRecipe(new ItemStack(boneCactusAxe), recipe, '#', Block.cactus, '|', InfiLibrary.boneRod );
			GameRegistry.addRecipe(new ItemStack(netherrackCactusAxe), recipe, '#', Block.cactus, '|', InfiLibrary.netherrackRod );
			GameRegistry.addRecipe(new ItemStack(iceCactusAxe), recipe, '#', Block.cactus, '|', InfiLibrary.iceRod );
			GameRegistry.addRecipe(new ItemStack(slimeCactusAxe), recipe, '#', Block.cactus, '|', InfiLibrary.slimeRod );
			GameRegistry.addRecipe(new ItemStack(cactusCactusAxe), recipe, '#', Block.cactus, '|', InfiLibrary.cactusRod );
		}

		if (PHInfiTools.enableFlintTools)
		{
			GameRegistry.addRecipe(new ItemStack(woodFlintAxe), recipe, '#', Item.flint, '|', Item.stick );
			GameRegistry.addRecipe(new ItemStack(stoneFlintAxe), recipe, '#', Item.flint, '|', InfiLibrary.stoneRod );
			GameRegistry.addRecipe(new ItemStack(sandstoneFlintAxe), recipe, '#', Item.flint, '|', InfiLibrary.sandstoneRod );
			GameRegistry.addRecipe(new ItemStack(boneFlintAxe), recipe, '#', Item.flint, '|', Item.bone );
			GameRegistry.addRecipe(new ItemStack(boneFlintAxe), recipe, '#', Item.flint, '|', InfiLibrary.boneRod );
			GameRegistry.addRecipe(new ItemStack(netherrackFlintAxe), recipe, '#', Item.flint, '|', InfiLibrary.netherrackRod );
			GameRegistry.addRecipe(new ItemStack(slimeFlintAxe), recipe, '#', Item.flint, '|', InfiLibrary.slimeRod );
			GameRegistry.addRecipe(new ItemStack(cactusFlintAxe), recipe, '#', Item.flint, '|', InfiLibrary.cactusRod );
			GameRegistry.addRecipe(new ItemStack(flintFlintAxe), recipe, '#', Item.flint, '|', InfiLibrary.flintRod );
			GameRegistry.addRecipe(new ItemStack(copperFlintAxe), recipe, '#', Item.flint, '|', InfiLibrary.copperRod );
			GameRegistry.addRecipe(new ItemStack(bronzeFlintAxe), recipe, '#', Item.flint, '|', InfiLibrary.bronzeRod );
		}

		if (PHInfiTools.enableBlazeTools)
		{
			GameRegistry.addRecipe(new ItemStack(diamondBlazeAxe), recipe, '#', InfiLibrary.blazeCrystal, '|', InfiLibrary.diamondRod );
			GameRegistry.addRecipe(new ItemStack(obsidianBlazeAxe), recipe, '#', InfiLibrary.blazeCrystal, '|', InfiLibrary.obsidianRod );
			GameRegistry.addRecipe(new ItemStack(netherrackBlazeAxe), recipe, '#', InfiLibrary.blazeCrystal, '|', InfiLibrary.netherrackRod );
			GameRegistry.addRecipe(new ItemStack(lavaBlazeAxe), recipe, '#', InfiLibrary.blazeCrystal, '|', InfiLibrary.lavaRod );
			GameRegistry.addRecipe(new ItemStack(flintBlazeAxe), recipe, '#', InfiLibrary.blazeCrystal, '|', InfiLibrary.flintRod );
			GameRegistry.addRecipe(new ItemStack(blazeBlazeAxe), recipe, '#', InfiLibrary.blazeCrystal, '|', Item.blazeRod );
			GameRegistry.addRecipe(new ItemStack(manyullynBlazeAxe), recipe, '#', InfiLibrary.blazeCrystal, '|', InfiLibrary.manyullynRod );
			GameRegistry.addRecipe(new ItemStack(uraniumBlazeAxe), recipe, '#', InfiLibrary.blazeCrystal, '|', InfiLibrary.uraniumRod );
		}
	}

	public static void addStoneTools(String stack)
	{
		//GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(woodStoneAxe), recipe, '#', stack, '|', Item.stick ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(stoneStoneAxe), recipe, '#', stack, '|', InfiLibrary.stoneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(sandstoneStoneAxe), recipe, '#', stack, '|', InfiLibrary.sandstoneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(boneStoneAxe), recipe, '#', stack, '|', Item.bone ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(boneStoneAxe), recipe, '#', stack, '|', InfiLibrary.boneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(netherrackStoneAxe), recipe, '#', stack, '|', InfiLibrary.netherrackRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(iceStoneAxe), recipe, '#', stack, '|', InfiLibrary.iceRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(slimeStoneAxe), recipe, '#', stack, '|', InfiLibrary.slimeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(cactusStoneAxe), recipe, '#', stack, '|', InfiLibrary.cactusRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(flintStoneAxe), recipe, '#', stack, '|', InfiLibrary.flintRod ) );
	}

	public static void addCopperTools(String stack)
	{
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(woodCopperAxe), recipe, '#', stack, '|', Item.stick ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(stoneCopperAxe), recipe, '#', stack, '|', InfiLibrary.stoneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(boneCopperAxe), recipe, '#', stack, '|', Item.bone ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(boneCopperAxe), recipe, '#', stack, '|', InfiLibrary.boneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(netherrackCopperAxe), recipe, '#', stack, '|', InfiLibrary.netherrackRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(slimeCopperAxe), recipe, '#', stack, '|', InfiLibrary.slimeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(cactusCopperAxe), recipe, '#', stack, '|', InfiLibrary.cactusRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(flintCopperAxe), recipe, '#', stack, '|', InfiLibrary.flintRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(copperCopperAxe), recipe, '#', stack, '|', InfiLibrary.copperRod ) );
	}

	public static void addBronzeTools(String stack)
	{
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(woodBronzeAxe), recipe, '#', stack, '|', Item.stick ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(stoneBronzeAxe), recipe, '#', stack, '|', InfiLibrary.stoneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(boneBronzeAxe), recipe, '#', stack, '|', Item.bone ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(boneBronzeAxe), recipe, '#', stack, '|', InfiLibrary.boneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(netherrackBronzeAxe), recipe, '#', stack, '|', InfiLibrary.netherrackRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(slimeBronzeAxe), recipe, '#', stack, '|', InfiLibrary.slimeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(cactusBronzeAxe), recipe, '#', stack, '|', InfiLibrary.cactusRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(flintBronzeAxe), recipe, '#', stack, '|', InfiLibrary.flintRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(copperBronzeAxe), recipe, '#', stack, '|', InfiLibrary.copperRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(bronzeBronzeAxe), recipe, '#', stack, '|', InfiLibrary.bronzeRod ) );
	}

	public static void addWorkedIronTools(String stack)
	{
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(woodWorkedIronAxe), recipe, '#', stack, '|', Item.stick ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(stoneWorkedIronAxe), recipe, '#', stack, '|', InfiLibrary.stoneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(ironWorkedIronAxe), recipe, '#', stack, '|', InfiLibrary.ironRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(diamondWorkedIronAxe), recipe, '#', stack, '|', InfiLibrary.diamondRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(redstoneWorkedIronAxe), recipe, '#', stack, '|', InfiLibrary.redstoneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(obsidianWorkedIronAxe), recipe, '#', stack, '|', InfiLibrary.obsidianRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(boneWorkedIronAxe), recipe, '#', stack, '|', Item.bone ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(boneWorkedIronAxe), recipe, '#', stack, '|', InfiLibrary.boneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(netherrackWorkedIronAxe), recipe, '#', stack, '|', InfiLibrary.netherrackRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(glowstoneWorkedIronAxe), recipe, '#', stack, '|', InfiLibrary.glowstoneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(iceWorkedIronAxe), recipe, '#', stack, '|', InfiLibrary.iceRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(slimeWorkedIronAxe), recipe, '#', stack, '|', InfiLibrary.slimeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(cactusWorkedIronAxe), recipe, '#', stack, '|', InfiLibrary.cactusRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(blazeWorkedIronAxe), recipe, '#', stack, '|', Item.blazeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(copperWorkedIronAxe), recipe, '#', stack, '|', InfiLibrary.copperRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(bronzeWorkedIronAxe), recipe, '#', stack, '|', InfiLibrary.bronzeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(workedWorkedIronAxe), recipe, '#', stack, '|', InfiLibrary.workedIronRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(steelWorkedIronAxe), recipe, '#', stack, '|', InfiLibrary.steelRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(uraniumWorkedIronAxe), recipe, '#', stack, '|', InfiLibrary.uraniumRod ) );
	}

	public static void addSteelTools(String stack)
	{
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(woodSteelAxe), recipe, '#', stack, '|', Item.stick ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(stoneSteelAxe), recipe, '#', stack, '|', InfiLibrary.stoneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(ironSteelAxe), recipe, '#', stack, '|', InfiLibrary.ironRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(diamondSteelAxe), recipe, '#', stack, '|', InfiLibrary.diamondRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(redstoneSteelAxe), recipe, '#', stack, '|', InfiLibrary.redstoneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(obsidianSteelAxe), recipe, '#', stack, '|', InfiLibrary.obsidianRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(boneSteelAxe), recipe, '#', stack, '|', Item.bone ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(boneSteelAxe), recipe, '#', stack, '|', InfiLibrary.boneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(netherrackSteelAxe), recipe, '#', stack, '|', InfiLibrary.netherrackRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(glowstoneSteelAxe), recipe, '#', stack, '|', InfiLibrary.glowstoneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(iceSteelAxe), recipe, '#', stack, '|', InfiLibrary.iceRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(slimeSteelAxe), recipe, '#', stack, '|', InfiLibrary.slimeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(cactusSteelAxe), recipe, '#', stack, '|', InfiLibrary.cactusRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(blazeSteelAxe), recipe, '#', stack, '|', Item.blazeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(copperSteelAxe), recipe, '#', stack, '|', InfiLibrary.copperRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(bronzeSteelAxe), recipe, '#', stack, '|', InfiLibrary.bronzeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(workedSteelAxe), recipe, '#', stack, '|', InfiLibrary.workedIronRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(steelSteelAxe), recipe, '#', stack, '|', InfiLibrary.steelRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(cobaltSteelAxe), recipe, '#', stack, '|', InfiLibrary.cobaltRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(arditeSteelAxe), recipe, '#', stack, '|', InfiLibrary.arditeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(uraniumSteelAxe), recipe, '#', stack, '|', InfiLibrary.uraniumRod ) );
	}

	public static void addCobaltTools(String stack)
	{
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(woodCobaltAxe), recipe, '#', stack, '|', Item.stick ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(stoneCobaltAxe), recipe, '#', stack, '|', InfiLibrary.stoneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(ironCobaltAxe), recipe, '#', stack, '|', InfiLibrary.ironRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(diamondCobaltAxe), recipe, '#', stack, '|', InfiLibrary.diamondRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(redstoneCobaltAxe), recipe, '#', stack, '|', InfiLibrary.redstoneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(obsidianCobaltAxe), recipe, '#', stack, '|', InfiLibrary.obsidianRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(boneCobaltAxe), recipe, '#', stack, '|', Item.bone ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(boneCobaltAxe), recipe, '#', stack, '|', InfiLibrary.boneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(slimeCobaltAxe), recipe, '#', stack, '|', InfiLibrary.slimeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(cactusCobaltAxe), recipe, '#', stack, '|', InfiLibrary.cactusRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(blazeCobaltAxe), recipe, '#', stack, '|', Item.blazeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(copperCobaltAxe), recipe, '#', stack, '|', InfiLibrary.copperRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(bronzeCobaltAxe), recipe, '#', stack, '|', InfiLibrary.bronzeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(workedCobaltAxe), recipe, '#', stack, '|', InfiLibrary.workedIronRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(steelCobaltAxe), recipe, '#', stack, '|', InfiLibrary.steelRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(cobaltCobaltAxe), recipe, '#', stack, '|', InfiLibrary.cobaltRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(arditeCobaltAxe), recipe, '#', stack, '|', InfiLibrary.arditeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(manyullynCobaltAxe), recipe, '#', stack, '|', InfiLibrary.manyullynRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(uraniumCobaltAxe), recipe, '#', stack, '|', InfiLibrary.uraniumRod ) );
	}

	public static void addArditeTools(String stack)
	{
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(woodArditeAxe), recipe, '#', stack, '|', Item.stick ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(stoneArditeAxe), recipe, '#', stack, '|', InfiLibrary.stoneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(ironArditeAxe), recipe, '#', stack, '|', InfiLibrary.ironRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(diamondArditeAxe), recipe, '#', stack, '|', InfiLibrary.diamondRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(redstoneArditeAxe), recipe, '#', stack, '|', InfiLibrary.redstoneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(obsidianArditeAxe), recipe, '#', stack, '|', InfiLibrary.obsidianRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(boneArditeAxe), recipe, '#', stack, '|', Item.bone ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(boneArditeAxe), recipe, '#', stack, '|', InfiLibrary.boneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(slimeArditeAxe), recipe, '#', stack, '|', InfiLibrary.slimeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(cactusArditeAxe), recipe, '#', stack, '|', InfiLibrary.cactusRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(blazeArditeAxe), recipe, '#', stack, '|', Item.blazeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(copperArditeAxe), recipe, '#', stack, '|', InfiLibrary.copperRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(bronzeArditeAxe), recipe, '#', stack, '|', InfiLibrary.bronzeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(workedArditeAxe), recipe, '#', stack, '|', InfiLibrary.workedIronRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(steelArditeAxe), recipe, '#', stack, '|', InfiLibrary.steelRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(cobaltArditeAxe), recipe, '#', stack, '|', InfiLibrary.cobaltRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(arditeArditeAxe), recipe, '#', stack, '|', InfiLibrary.arditeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(manyullynArditeAxe), recipe, '#', stack, '|', InfiLibrary.manyullynRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(uraniumArditeAxe), recipe, '#', stack, '|', InfiLibrary.uraniumRod ) );
	}

	public static void addManyullynTools(String stack)
	{
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(woodManyullynAxe), recipe, '#', stack, '|', Item.stick ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(stoneManyullynAxe), recipe, '#', stack, '|', InfiLibrary.stoneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(ironManyullynAxe), recipe, '#', stack, '|', InfiLibrary.ironRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(diamondManyullynAxe), recipe, '#', stack, '|', InfiLibrary.diamondRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(redstoneManyullynAxe), recipe, '#', stack, '|', InfiLibrary.redstoneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(obsidianManyullynAxe), recipe, '#', stack, '|', InfiLibrary.obsidianRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(boneManyullynAxe), recipe, '#', stack, '|', Item.bone ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(boneManyullynAxe), recipe, '#', stack, '|', InfiLibrary.boneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(slimeManyullynAxe), recipe, '#', stack, '|', InfiLibrary.slimeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(cactusManyullynAxe), recipe, '#', stack, '|', InfiLibrary.cactusRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(blazeManyullynAxe), recipe, '#', stack, '|', Item.blazeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(copperManyullynAxe), recipe, '#', stack, '|', InfiLibrary.copperRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(bronzeManyullynAxe), recipe, '#', stack, '|', InfiLibrary.bronzeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(workedManyullynAxe), recipe, '#', stack, '|', InfiLibrary.workedIronRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(steelManyullynAxe), recipe, '#', stack, '|', InfiLibrary.steelRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(cobaltManyullynAxe), recipe, '#', stack, '|', InfiLibrary.cobaltRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(arditeManyullynAxe), recipe, '#', stack, '|', InfiLibrary.arditeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(manyullynManyullynAxe), recipe, '#', stack, '|', InfiLibrary.manyullynRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(uraniumManyullynAxe), recipe, '#', stack, '|', InfiLibrary.uraniumRod ) );
	}

	public static void addUraniumTools(String stack)
	{
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(diamondUraniumAxe), recipe, '#', stack, '|', InfiLibrary.diamondRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(redstoneUraniumAxe), recipe, '#', stack, '|', InfiLibrary.redstoneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(boneUraniumAxe), recipe, '#', stack, '|', Item.bone ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(boneUraniumAxe), recipe, '#', stack, '|', InfiLibrary.boneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(netherrackUraniumAxe), recipe, '#', stack, '|', InfiLibrary.netherrackRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(glowstoneUraniumAxe), recipe, '#', stack, '|', InfiLibrary.glowstoneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(lavaUraniumAxe), recipe, '#', stack, '|', InfiLibrary.lavaRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(blazeUraniumAxe), recipe, '#', stack, '|', Item.blazeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(cobaltUraniumAxe), recipe, '#', stack, '|', InfiLibrary.cobaltRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(arditeUraniumAxe), recipe, '#', stack, '|', InfiLibrary.arditeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(uraniumUraniumAxe), recipe, '#', stack, '|', InfiLibrary.uraniumRod ) );
	}

	public static Item woodWoodAxe;
	public static Item sandstoneWoodAxe;
	public static Item boneWoodAxe;
	public static Item paperWoodAxe;
	public static Item iceWoodAxe;
	public static Item slimeWoodAxe;
	public static Item cactusWoodAxe;

	public static Item woodStoneAxe;
	public static Item stoneStoneAxe;
	public static Item sandstoneStoneAxe;
	public static Item boneStoneAxe;
	public static Item netherrackStoneAxe;
	public static Item iceStoneAxe;
	public static Item slimeStoneAxe;
	public static Item cactusStoneAxe;
	public static Item flintStoneAxe;

	public static Item woodIronAxe;
	public static Item stoneIronAxe;
	public static Item ironIronAxe;
	public static Item boneIronAxe;
	public static Item netherrackIronAxe;
	public static Item glowstoneIronAxe;
	public static Item cactusIronAxe;
	public static Item copperIronAxe;
	public static Item bronzeIronAxe;

	public static Item woodDiamondAxe;
	public static Item stoneDiamondAxe;
	public static Item ironDiamondAxe;
	public static Item diamondDiamondAxe;
	public static Item redstoneDiamondAxe;
	public static Item obsidianDiamondAxe;
	public static Item boneDiamondAxe;
	public static Item mossyDiamondAxe;
	public static Item netherrackDiamondAxe;
	public static Item glowstoneDiamondAxe;
	public static Item lavaDiamondAxe;
	public static Item cactusDiamondAxe;
	public static Item flintDiamondAxe;
	public static Item blazeDiamondAxe;
	public static Item copperDiamondAxe;
	public static Item bronzeDiamondAxe;
	public static Item workedDiamondAxe;
	public static Item steelDiamondAxe;
	public static Item cobaltDiamondAxe;
	public static Item arditeDiamondAxe;
	public static Item manyullynDiamondAxe;
	public static Item uraniumDiamondAxe;

	public static Item woodRedstoneAxe;
	public static Item stoneRedstoneAxe;
	public static Item ironRedstoneAxe;
	public static Item redstoneRedstoneAxe;
	public static Item obsidianRedstoneAxe;
	public static Item sandstoneRedstoneAxe;
	public static Item boneRedstoneAxe;
	public static Item paperRedstoneAxe;
	public static Item mossyRedstoneAxe;
	public static Item netherrackRedstoneAxe;
	public static Item glowstoneRedstoneAxe;
	public static Item iceRedstoneAxe;
	public static Item lavaRedstoneAxe;
	public static Item slimeRedstoneAxe;
	public static Item cactusRedstoneAxe;
	public static Item flintRedstoneAxe;
	public static Item copperRedstoneAxe;
	public static Item bronzeRedstoneAxe;
	public static Item workedRedstoneAxe;
	public static Item uraniumRedstoneAxe;

	public static Item woodObsidianAxe;
	public static Item stoneObsidianAxe;
	public static Item redstoneObsidianAxe;
	public static Item obsidianObsidianAxe;
	public static Item boneObsidianAxe;
	public static Item netherrackObsidianAxe;
	public static Item glowstoneObsidianAxe;
	public static Item iceObsidianAxe;
	public static Item lavaObsidianAxe;
	public static Item cactusObsidianAxe;

	public static Item woodSandstoneAxe;
	public static Item sandstoneSandstoneAxe;
	public static Item boneSandstoneAxe;
	public static Item netherrackSandstoneAxe;
	public static Item iceSandstoneAxe;
	public static Item slimeSandstoneAxe;
	public static Item cactusSandstoneAxe;
	public static Item flintSandstoneAxe;

	public static Item woodBoneAxe;
	public static Item stoneBoneAxe;
	public static Item sandstoneBoneAxe;
	public static Item boneBoneAxe;
	public static Item paperBoneAxe;
	public static Item netherrackBoneAxe;
	public static Item iceBoneAxe;
	public static Item cactusBoneAxe;
	public static Item flintBoneAxe;

	public static Item woodPaperAxe;
	public static Item bonePaperAxe;
	public static Item paperPaperAxe;
	public static Item slimePaperAxe;
	public static Item cactusPaperAxe;

	public static Item woodMossyAxe;
	public static Item stoneMossyAxe;
	public static Item diamondMossyAxe;
	public static Item redstoneMossyAxe;
	public static Item boneMossyAxe;
	public static Item mossyMossyAxe;
	public static Item netherrackMossyAxe;
	public static Item glowstoneMossyAxe;
	public static Item cactusMossyAxe;
	public static Item blazeMossyAxe;
	public static Item manyullynMossyAxe;
	public static Item uraniumMossyAxe;

	public static Item woodNetherrackAxe;
	public static Item stoneNetherrackAxe;
	public static Item sandstoneNetherrackAxe;
	public static Item boneNetherrackAxe;
	public static Item paperNetherrackAxe;
	public static Item mossyNetherrackAxe;
	public static Item netherrackNetherrackAxe;
	public static Item iceNetherrackAxe;
	public static Item slimeNetherrackAxe;
	public static Item cactusNetherrackAxe;
	public static Item flintNetherrackAxe;
	public static Item copperNetherrackAxe;
	public static Item bronzeNetherrackAxe;

	public static Item woodGlowstoneAxe;
	public static Item redstoneGlowstoneAxe;
	public static Item obsidianGlowstoneAxe;
	public static Item boneGlowstoneAxe;
	public static Item netherrackGlowstoneAxe;
	public static Item glowstoneGlowstoneAxe;
	public static Item iceGlowstoneAxe;
	public static Item slimeGlowstoneAxe;
	public static Item cactusGlowstoneAxe;

	public static Item woodIceAxe;
	public static Item boneIceAxe;
	public static Item paperIceAxe;
	public static Item iceIceAxe;
	public static Item slimeIceAxe;
	public static Item cactusIceAxe;

	public static Item diamondLavaAxe;
	public static Item obsidianLavaAxe;
	public static Item netherrackLavaAxe;
	public static Item lavaLavaAxe;
	public static Item flintLavaAxe;
	public static Item blazeLavaAxe;
	public static Item manyullynLavaAxe;
	public static Item uraniumLavaAxe;

	public static Item woodSlimeAxe;
	public static Item sandstoneSlimeAxe;
	public static Item boneSlimeAxe;
	public static Item paperSlimeAxe;
	public static Item slimeSlimeAxe;
	public static Item cactusSlimeAxe;

	public static Item woodCactusAxe;
	public static Item sandstoneCactusAxe;
	public static Item boneCactusAxe;
	public static Item netherrackCactusAxe;
	public static Item iceCactusAxe;
	public static Item slimeCactusAxe;
	public static Item cactusCactusAxe;

	public static Item woodFlintAxe;
	public static Item stoneFlintAxe;
	public static Item sandstoneFlintAxe;
	public static Item boneFlintAxe;
	public static Item netherrackFlintAxe;
	public static Item slimeFlintAxe;
	public static Item cactusFlintAxe;
	public static Item flintFlintAxe;
	public static Item copperFlintAxe;
	public static Item bronzeFlintAxe;

	public static Item diamondBlazeAxe;
	public static Item obsidianBlazeAxe;
	public static Item netherrackBlazeAxe;
	public static Item lavaBlazeAxe;
	public static Item flintBlazeAxe;
	public static Item blazeBlazeAxe;
	public static Item manyullynBlazeAxe;
	public static Item uraniumBlazeAxe;

	public static Item woodCopperAxe;
	public static Item stoneCopperAxe;
	public static Item boneCopperAxe;
	public static Item netherrackCopperAxe;
	public static Item slimeCopperAxe;
	public static Item cactusCopperAxe;
	public static Item flintCopperAxe;
	public static Item copperCopperAxe;

	public static Item woodBronzeAxe;
	public static Item stoneBronzeAxe;
	public static Item boneBronzeAxe;
	public static Item netherrackBronzeAxe;
	public static Item slimeBronzeAxe;
	public static Item cactusBronzeAxe;
	public static Item flintBronzeAxe;
	public static Item copperBronzeAxe;
	public static Item bronzeBronzeAxe;

	public static Item woodWorkedIronAxe;
	public static Item stoneWorkedIronAxe;
	public static Item ironWorkedIronAxe;
	public static Item diamondWorkedIronAxe;
	public static Item redstoneWorkedIronAxe;
	public static Item obsidianWorkedIronAxe;
	public static Item boneWorkedIronAxe;
	public static Item netherrackWorkedIronAxe;
	public static Item glowstoneWorkedIronAxe;
	public static Item iceWorkedIronAxe;
	public static Item slimeWorkedIronAxe;
	public static Item cactusWorkedIronAxe;
	public static Item blazeWorkedIronAxe;
	public static Item copperWorkedIronAxe;
	public static Item bronzeWorkedIronAxe;
	public static Item workedWorkedIronAxe;
	public static Item steelWorkedIronAxe;
	public static Item uraniumWorkedIronAxe;

	public static Item woodSteelAxe;
	public static Item stoneSteelAxe;
	public static Item ironSteelAxe;
	public static Item diamondSteelAxe;
	public static Item redstoneSteelAxe;
	public static Item obsidianSteelAxe;
	public static Item boneSteelAxe;
	public static Item netherrackSteelAxe;
	public static Item glowstoneSteelAxe;
	public static Item iceSteelAxe;
	public static Item slimeSteelAxe;
	public static Item cactusSteelAxe;
	public static Item blazeSteelAxe;
	public static Item copperSteelAxe;
	public static Item bronzeSteelAxe;
	public static Item workedSteelAxe;
	public static Item steelSteelAxe;
	public static Item cobaltSteelAxe;
	public static Item arditeSteelAxe;
	public static Item uraniumSteelAxe;

	public static Item woodCobaltAxe;
	public static Item stoneCobaltAxe;
	public static Item ironCobaltAxe;
	public static Item diamondCobaltAxe;
	public static Item redstoneCobaltAxe;
	public static Item obsidianCobaltAxe;
	public static Item boneCobaltAxe;
	public static Item slimeCobaltAxe;
	public static Item cactusCobaltAxe;
	public static Item blazeCobaltAxe;
	public static Item copperCobaltAxe;
	public static Item bronzeCobaltAxe;
	public static Item workedCobaltAxe;
	public static Item steelCobaltAxe;
	public static Item cobaltCobaltAxe;
	public static Item arditeCobaltAxe;
	public static Item manyullynCobaltAxe;
	public static Item uraniumCobaltAxe;

	public static Item woodArditeAxe;
	public static Item stoneArditeAxe;
	public static Item ironArditeAxe;
	public static Item diamondArditeAxe;
	public static Item redstoneArditeAxe;
	public static Item obsidianArditeAxe;
	public static Item boneArditeAxe;
	public static Item slimeArditeAxe;
	public static Item cactusArditeAxe;
	public static Item blazeArditeAxe;
	public static Item copperArditeAxe;
	public static Item bronzeArditeAxe;
	public static Item workedArditeAxe;
	public static Item steelArditeAxe;
	public static Item cobaltArditeAxe;
	public static Item arditeArditeAxe;
	public static Item manyullynArditeAxe;
	public static Item uraniumArditeAxe;

	public static Item woodManyullynAxe;
	public static Item stoneManyullynAxe;
	public static Item ironManyullynAxe;
	public static Item diamondManyullynAxe;
	public static Item redstoneManyullynAxe;
	public static Item obsidianManyullynAxe;
	public static Item boneManyullynAxe;
	public static Item slimeManyullynAxe;
	public static Item cactusManyullynAxe;
	public static Item blazeManyullynAxe;
	public static Item copperManyullynAxe;
	public static Item bronzeManyullynAxe;
	public static Item workedManyullynAxe;
	public static Item steelManyullynAxe;
	public static Item cobaltManyullynAxe;
	public static Item arditeManyullynAxe;
	public static Item manyullynManyullynAxe;
	public static Item uraniumManyullynAxe;

	public static Item diamondUraniumAxe;
	public static Item redstoneUraniumAxe;
	public static Item boneUraniumAxe;
	public static Item netherrackUraniumAxe;
	public static Item glowstoneUraniumAxe;
	public static Item lavaUraniumAxe;
	public static Item blazeUraniumAxe;
	public static Item cobaltUraniumAxe;
	public static Item arditeUraniumAxe;
	public static Item uraniumUraniumAxe;
}
