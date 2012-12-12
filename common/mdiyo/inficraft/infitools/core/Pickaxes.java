package mDiyo.inficraft.infitools.core;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import mDiyo.inficraft.infitools.library.InfiLibrary;
import mDiyo.inficraft.infitools.library.InfiMaterialEnum;
import net.minecraft.src.Block;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.oredict.ShapedOreRecipe;

public class Pickaxes
{
	public static Pickaxes instance = new Pickaxes();

	private static String[] recipe = { "###", " | ", " | " };

	public static Pickaxes getInstance()
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

	private static void createTools()
	{
		if (PHInfiTools.enableWoodTools)
		{
			sandstoneWoodPickaxe = new InfiToolPickaxe(PHInfiTools.woodPickaxeID + 1, InfiMaterialEnum.Wood, InfiMaterialEnum.Sandstone, "sandstoneWoodPickaxe");
			boneWoodPickaxe = new InfiToolPickaxe(PHInfiTools.woodPickaxeID + 2, InfiMaterialEnum.Wood, InfiMaterialEnum.Bone, "boneWoodPickaxe");
			paperWoodPickaxe = new InfiToolPickaxe(PHInfiTools.woodPickaxeID + 3, InfiMaterialEnum.Wood, InfiMaterialEnum.Paper, "paperWoodPickaxe");
			iceWoodPickaxe = new InfiToolPickaxe(PHInfiTools.woodPickaxeID + 4, InfiMaterialEnum.Wood, InfiMaterialEnum.Ice, "iceWoodPickaxe");
			slimeWoodPickaxe = new InfiToolPickaxe(PHInfiTools.woodPickaxeID + 5, InfiMaterialEnum.Wood, InfiMaterialEnum.Slime, "slimeWoodPickaxe");
			cactusWoodPickaxe = new InfiToolPickaxe(PHInfiTools.woodPickaxeID + 6, InfiMaterialEnum.Wood, InfiMaterialEnum.Cactus, "cactusWoodPickaxe");

			MinecraftForge.setToolClass(sandstoneWoodPickaxe, "pickaxe", InfiMaterialEnum.Wood.getHarvestLevel());
			MinecraftForge.setToolClass(boneWoodPickaxe, "pickaxe", InfiMaterialEnum.Wood.getHarvestLevel());
			MinecraftForge.setToolClass(paperWoodPickaxe, "pickaxe", InfiMaterialEnum.Wood.getHarvestLevel());
			MinecraftForge.setToolClass(iceWoodPickaxe, "pickaxe", InfiMaterialEnum.Wood.getHarvestLevel());
			MinecraftForge.setToolClass(slimeWoodPickaxe, "pickaxe", InfiMaterialEnum.Wood.getHarvestLevel());
			MinecraftForge.setToolClass(cactusWoodPickaxe, "pickaxe", InfiMaterialEnum.Wood.getHarvestLevel());
		}

		if (PHInfiTools.enableStoneTools)
		{
			stoneStonePickaxe = new InfiToolPickaxe(PHInfiTools.stonePickaxeID + 1, InfiMaterialEnum.Stone, InfiMaterialEnum.Stone, "stoneStonePickaxe");
			sandstoneStonePickaxe = new InfiToolPickaxe(PHInfiTools.stonePickaxeID + 2, InfiMaterialEnum.Stone, InfiMaterialEnum.Sandstone, "sandstoneStonePickaxe");
			boneStonePickaxe = new InfiToolPickaxe(PHInfiTools.stonePickaxeID + 3, InfiMaterialEnum.Stone, InfiMaterialEnum.Bone, "boneStonePickaxe");
			netherrackStonePickaxe = new InfiToolPickaxe(PHInfiTools.stonePickaxeID + 4, InfiMaterialEnum.Stone, InfiMaterialEnum.Netherrack, "netherrackStonePickaxe");
			iceStonePickaxe = new InfiToolPickaxe(PHInfiTools.stonePickaxeID + 5, InfiMaterialEnum.Stone, InfiMaterialEnum.Ice, "iceStonePickaxe");
			slimeStonePickaxe = new InfiToolPickaxe(PHInfiTools.stonePickaxeID + 6, InfiMaterialEnum.Stone, InfiMaterialEnum.Slime, "slimeStonePickaxe");
			cactusStonePickaxe = new InfiToolPickaxe(PHInfiTools.stonePickaxeID + 7, InfiMaterialEnum.Stone, InfiMaterialEnum.Cactus, "cactusStonePickaxe");
			flintStonePickaxe = new InfiToolPickaxe(PHInfiTools.stonePickaxeID + 8, InfiMaterialEnum.Stone, InfiMaterialEnum.Flint, "flintStonePickaxe");

			MinecraftForge.setToolClass(stoneStonePickaxe, "pickaxe", InfiMaterialEnum.Stone.getHarvestLevel());
			MinecraftForge.setToolClass(sandstoneStonePickaxe, "pickaxe", InfiMaterialEnum.Stone.getHarvestLevel());
			MinecraftForge.setToolClass(boneStonePickaxe, "pickaxe", InfiMaterialEnum.Stone.getHarvestLevel());
			MinecraftForge.setToolClass(netherrackStonePickaxe, "pickaxe", InfiMaterialEnum.Stone.getHarvestLevel());
			MinecraftForge.setToolClass(iceStonePickaxe, "pickaxe", InfiMaterialEnum.Stone.getHarvestLevel());
			MinecraftForge.setToolClass(slimeStonePickaxe, "pickaxe", InfiMaterialEnum.Stone.getHarvestLevel());
			MinecraftForge.setToolClass(cactusStonePickaxe, "pickaxe", InfiMaterialEnum.Stone.getHarvestLevel());
			MinecraftForge.setToolClass(flintStonePickaxe, "pickaxe", InfiMaterialEnum.Stone.getHarvestLevel());
		}

		if (PHInfiTools.enableIronTools)
		{
			stoneIronPickaxe = new InfiToolPickaxe(PHInfiTools.ironPickaxeID + 1, InfiMaterialEnum.Iron, InfiMaterialEnum.Stone, "stoneIronPickaxe");
			ironIronPickaxe = new InfiToolPickaxe(PHInfiTools.ironPickaxeID + 2, InfiMaterialEnum.Iron, InfiMaterialEnum.Iron, "ironIronPickaxe");
			boneIronPickaxe = new InfiToolPickaxe(PHInfiTools.ironPickaxeID + 3, InfiMaterialEnum.Iron, InfiMaterialEnum.Bone, "boneIronPickaxe");
			netherrackIronPickaxe = new InfiToolPickaxe(PHInfiTools.ironPickaxeID + 4, InfiMaterialEnum.Iron, InfiMaterialEnum.Netherrack, "netherrackIronPickaxe");
			glowstoneIronPickaxe = new InfiToolPickaxe(PHInfiTools.ironPickaxeID + 5, InfiMaterialEnum.Iron, InfiMaterialEnum.Glowstone, "glowstoneIronPickaxe");
			cactusIronPickaxe = new InfiToolPickaxe(PHInfiTools.ironPickaxeID + 6, InfiMaterialEnum.Iron, InfiMaterialEnum.Cactus, "cactusIronPickaxe");
			copperIronPickaxe = new InfiToolPickaxe(PHInfiTools.ironPickaxeID + 7, InfiMaterialEnum.Iron, InfiMaterialEnum.Copper, "copperIronPickaxe");
			bronzeIronPickaxe = new InfiToolPickaxe(PHInfiTools.ironPickaxeID + 8, InfiMaterialEnum.Iron, InfiMaterialEnum.Bronze, "bronzeIronPickaxe");

			MinecraftForge.setToolClass(stoneIronPickaxe, "pickaxe", InfiMaterialEnum.Iron.getHarvestLevel());
			MinecraftForge.setToolClass(ironIronPickaxe, "pickaxe", InfiMaterialEnum.Iron.getHarvestLevel());
			MinecraftForge.setToolClass(boneIronPickaxe, "pickaxe", InfiMaterialEnum.Iron.getHarvestLevel());
			MinecraftForge.setToolClass(netherrackIronPickaxe, "pickaxe", InfiMaterialEnum.Iron.getHarvestLevel());
			MinecraftForge.setToolClass(glowstoneIronPickaxe, "pickaxe", InfiMaterialEnum.Iron.getHarvestLevel());
			MinecraftForge.setToolClass(cactusIronPickaxe, "pickaxe", InfiMaterialEnum.Iron.getHarvestLevel());
			MinecraftForge.setToolClass(copperIronPickaxe, "pickaxe", InfiMaterialEnum.Iron.getHarvestLevel());
			MinecraftForge.setToolClass(bronzeIronPickaxe, "pickaxe", InfiMaterialEnum.Iron.getHarvestLevel());
		}

		if (PHInfiTools.enableDiamondTools)
		{
			stoneDiamondPickaxe = new InfiToolPickaxe(PHInfiTools.diamondPickaxeID + 1, InfiMaterialEnum.Diamond, InfiMaterialEnum.Stone, "stoneDiamondPickaxe");
			ironDiamondPickaxe = new InfiToolPickaxe(PHInfiTools.diamondPickaxeID + 2, InfiMaterialEnum.Diamond, InfiMaterialEnum.Iron, "ironDiamondPickaxe");
			diamondDiamondPickaxe = new InfiToolPickaxe(PHInfiTools.diamondPickaxeID + 3, InfiMaterialEnum.Diamond, InfiMaterialEnum.Diamond, "diamondDiamondPickaxe");
			redstoneDiamondPickaxe = new InfiToolPickaxe(PHInfiTools.diamondPickaxeID + 4, InfiMaterialEnum.Diamond, InfiMaterialEnum.Redstone, "redstoneDiamondPickaxe");
			obsidianDiamondPickaxe = new InfiToolPickaxe(PHInfiTools.diamondPickaxeID + 5, InfiMaterialEnum.Diamond, InfiMaterialEnum.Obsidian, "obsidianDiamondPickaxe");
			boneDiamondPickaxe = new InfiToolPickaxe(PHInfiTools.diamondPickaxeID + 6, InfiMaterialEnum.Diamond, InfiMaterialEnum.Bone, "boneDiamondPickaxe");
			mossyDiamondPickaxe = new InfiToolPickaxe(PHInfiTools.diamondPickaxeID + 7, InfiMaterialEnum.Diamond, InfiMaterialEnum.Mossy, "mossyDiamondPickaxe");
			netherrackDiamondPickaxe = new InfiToolPickaxe(PHInfiTools.diamondPickaxeID + 8, InfiMaterialEnum.Diamond, InfiMaterialEnum.Netherrack, "netherrackDiamondPickaxe");
			glowstoneDiamondPickaxe = new InfiToolPickaxe(PHInfiTools.diamondPickaxeID + 9, InfiMaterialEnum.Diamond, InfiMaterialEnum.Glowstone, "glowstoneDiamondPickaxe");
			lavaDiamondPickaxe = new InfiToolPickaxe(PHInfiTools.diamondPickaxeID + 10, InfiMaterialEnum.Diamond, InfiMaterialEnum.Lava, "lavaDiamondPickaxe");
			cactusDiamondPickaxe = new InfiToolPickaxe(PHInfiTools.diamondPickaxeID + 11, InfiMaterialEnum.Diamond, InfiMaterialEnum.Cactus, "cactusDiamondPickaxe");
			flintDiamondPickaxe = new InfiToolPickaxe(PHInfiTools.diamondPickaxeID + 12, InfiMaterialEnum.Diamond, InfiMaterialEnum.Flint, "flintDiamondPickaxe");
			blazeDiamondPickaxe = new InfiToolPickaxe(PHInfiTools.diamondPickaxeID + 13, InfiMaterialEnum.Diamond, InfiMaterialEnum.Blaze, "blazeDiamondPickaxe");
			copperDiamondPickaxe = new InfiToolPickaxe(PHInfiTools.diamondPickaxeID + 14, InfiMaterialEnum.Diamond, InfiMaterialEnum.Copper, "copperDiamondPickaxe");
			bronzeDiamondPickaxe = new InfiToolPickaxe(PHInfiTools.diamondPickaxeID + 15, InfiMaterialEnum.Diamond, InfiMaterialEnum.Bronze, "bronzeDiamondPickaxe");
			workedDiamondPickaxe = new InfiToolPickaxe(PHInfiTools.diamondPickaxeID + 16, InfiMaterialEnum.Diamond, InfiMaterialEnum.WorkedIron, "workedDiamondPickaxe");
			steelDiamondPickaxe = new InfiToolPickaxe(PHInfiTools.diamondPickaxeID + 17, InfiMaterialEnum.Diamond, InfiMaterialEnum.Steel, "steelDiamondPickaxe");
			cobaltDiamondPickaxe = new InfiToolPickaxe(PHInfiTools.diamondPickaxeID + 18, InfiMaterialEnum.Diamond, InfiMaterialEnum.Cobalt, "cobaltDiamondPickaxe");
			arditeDiamondPickaxe = new InfiToolPickaxe(PHInfiTools.diamondPickaxeID + 19, InfiMaterialEnum.Diamond, InfiMaterialEnum.Ardite, "arditeDiamondPickaxe");
			manyullynDiamondPickaxe = new InfiToolPickaxe(PHInfiTools.diamondPickaxeID + 20, InfiMaterialEnum.Diamond, InfiMaterialEnum.Manyullyn, "manyullynDiamondPickaxe");
			uraniumDiamondPickaxe = new InfiToolPickaxe(PHInfiTools.diamondPickaxeID + 21, InfiMaterialEnum.Diamond, InfiMaterialEnum.Uranium, "uraniumDiamondPickaxe");

			MinecraftForge.setToolClass(stoneDiamondPickaxe, "pickaxe", InfiMaterialEnum.Diamond.getHarvestLevel());
			MinecraftForge.setToolClass(ironDiamondPickaxe, "pickaxe", InfiMaterialEnum.Diamond.getHarvestLevel());
			MinecraftForge.setToolClass(diamondDiamondPickaxe, "pickaxe", InfiMaterialEnum.Diamond.getHarvestLevel());
			MinecraftForge.setToolClass(redstoneDiamondPickaxe, "pickaxe", InfiMaterialEnum.Diamond.getHarvestLevel());
			MinecraftForge.setToolClass(obsidianDiamondPickaxe, "pickaxe", InfiMaterialEnum.Diamond.getHarvestLevel());
			MinecraftForge.setToolClass(boneDiamondPickaxe, "pickaxe", InfiMaterialEnum.Diamond.getHarvestLevel());
			MinecraftForge.setToolClass(mossyDiamondPickaxe, "pickaxe", InfiMaterialEnum.Diamond.getHarvestLevel());
			MinecraftForge.setToolClass(netherrackDiamondPickaxe, "pickaxe", InfiMaterialEnum.Diamond.getHarvestLevel());
			MinecraftForge.setToolClass(glowstoneDiamondPickaxe, "pickaxe", InfiMaterialEnum.Diamond.getHarvestLevel());
			MinecraftForge.setToolClass(lavaDiamondPickaxe, "pickaxe", InfiMaterialEnum.Diamond.getHarvestLevel());
			MinecraftForge.setToolClass(cactusDiamondPickaxe, "pickaxe", InfiMaterialEnum.Diamond.getHarvestLevel());
			MinecraftForge.setToolClass(flintDiamondPickaxe, "pickaxe", InfiMaterialEnum.Diamond.getHarvestLevel());
			MinecraftForge.setToolClass(blazeDiamondPickaxe, "pickaxe", InfiMaterialEnum.Diamond.getHarvestLevel());
			MinecraftForge.setToolClass(copperDiamondPickaxe, "pickaxe", InfiMaterialEnum.Diamond.getHarvestLevel());
			MinecraftForge.setToolClass(bronzeDiamondPickaxe, "pickaxe", InfiMaterialEnum.Diamond.getHarvestLevel());
			MinecraftForge.setToolClass(workedDiamondPickaxe, "pickaxe", InfiMaterialEnum.Diamond.getHarvestLevel());
			MinecraftForge.setToolClass(steelDiamondPickaxe, "pickaxe", InfiMaterialEnum.Diamond.getHarvestLevel());
			MinecraftForge.setToolClass(cobaltDiamondPickaxe, "pickaxe", InfiMaterialEnum.Diamond.getHarvestLevel());
			MinecraftForge.setToolClass(arditeDiamondPickaxe, "pickaxe", InfiMaterialEnum.Diamond.getHarvestLevel());
			MinecraftForge.setToolClass(manyullynDiamondPickaxe, "pickaxe", InfiMaterialEnum.Diamond.getHarvestLevel());
			MinecraftForge.setToolClass(uraniumDiamondPickaxe, "pickaxe", InfiMaterialEnum.Diamond.getHarvestLevel());
		}

		if (PHInfiTools.enableRedstoneTools)
		{
			woodRedstonePickaxe = new InfiToolPickaxe(PHInfiTools.redstonePickaxeID + 0, InfiMaterialEnum.Redstone, InfiMaterialEnum.Wood, "woodRedstonePickaxe");
			stoneRedstonePickaxe = new InfiToolPickaxe(PHInfiTools.redstonePickaxeID + 1, InfiMaterialEnum.Redstone, InfiMaterialEnum.Stone, "stoneRedstonePickaxe");
			ironRedstonePickaxe = new InfiToolPickaxe(PHInfiTools.redstonePickaxeID + 2, InfiMaterialEnum.Redstone, InfiMaterialEnum.Iron, "ironRedstonePickaxe");
			redstoneRedstonePickaxe = new InfiToolPickaxe(PHInfiTools.redstonePickaxeID + 3, InfiMaterialEnum.Redstone, InfiMaterialEnum.Redstone, "redstoneRedstonePickaxe");
			obsidianRedstonePickaxe = new InfiToolPickaxe(PHInfiTools.redstonePickaxeID + 4, InfiMaterialEnum.Redstone, InfiMaterialEnum.Obsidian, "obsidianRedstonePickaxe");
			sandstoneRedstonePickaxe = new InfiToolPickaxe(PHInfiTools.redstonePickaxeID + 5, InfiMaterialEnum.Redstone, InfiMaterialEnum.Sandstone, "sandstoneRedstonePickaxe");
			boneRedstonePickaxe = new InfiToolPickaxe(PHInfiTools.redstonePickaxeID + 6, InfiMaterialEnum.Redstone, InfiMaterialEnum.Bone, "boneRedstonePickaxe");
			paperRedstonePickaxe = new InfiToolPickaxe(PHInfiTools.redstonePickaxeID + 7, InfiMaterialEnum.Redstone, InfiMaterialEnum.Paper, "paperRedstonePickaxe");
			mossyRedstonePickaxe = new InfiToolPickaxe(PHInfiTools.redstonePickaxeID + 8, InfiMaterialEnum.Redstone, InfiMaterialEnum.Mossy, "mossyRedstonePickaxe");
			netherrackRedstonePickaxe = new InfiToolPickaxe(PHInfiTools.redstonePickaxeID + 9, InfiMaterialEnum.Redstone, InfiMaterialEnum.Netherrack, "netherrackRedstonePickaxe");
			glowstoneRedstonePickaxe = new InfiToolPickaxe(PHInfiTools.redstonePickaxeID + 10, InfiMaterialEnum.Redstone, InfiMaterialEnum.Glowstone, "glowstoneRedstonePickaxe");
			iceRedstonePickaxe = new InfiToolPickaxe(PHInfiTools.redstonePickaxeID + 11, InfiMaterialEnum.Redstone, InfiMaterialEnum.Ice, "iceRedstonePickaxe");
			lavaRedstonePickaxe = new InfiToolPickaxe(PHInfiTools.redstonePickaxeID + 12, InfiMaterialEnum.Redstone, InfiMaterialEnum.Lava, "lavaRedstonePickaxe");
			slimeRedstonePickaxe = new InfiToolPickaxe(PHInfiTools.redstonePickaxeID + 13, InfiMaterialEnum.Redstone, InfiMaterialEnum.Slime, "slimeRedstonePickaxe");
			cactusRedstonePickaxe = new InfiToolPickaxe(PHInfiTools.redstonePickaxeID + 14, InfiMaterialEnum.Redstone, InfiMaterialEnum.Cactus, "cactusRedstonePickaxe");
			flintRedstonePickaxe = new InfiToolPickaxe(PHInfiTools.redstonePickaxeID + 15, InfiMaterialEnum.Redstone, InfiMaterialEnum.Flint, "flintRedstonePickaxe");
			copperRedstonePickaxe = new InfiToolPickaxe(PHInfiTools.redstonePickaxeID + 16, InfiMaterialEnum.Redstone, InfiMaterialEnum.Copper, "copperRedstonePickaxe");
			bronzeRedstonePickaxe = new InfiToolPickaxe(PHInfiTools.redstonePickaxeID + 17, InfiMaterialEnum.Redstone, InfiMaterialEnum.Bronze, "bronzeRedstonePickaxe");
			workedRedstonePickaxe = new InfiToolPickaxe(PHInfiTools.redstonePickaxeID + 18, InfiMaterialEnum.Redstone, InfiMaterialEnum.WorkedIron, "workedRedstonePickaxe");
			uraniumRedstonePickaxe = new InfiToolPickaxe(PHInfiTools.redstonePickaxeID + 19, InfiMaterialEnum.Redstone, InfiMaterialEnum.Uranium, "uraniumRedstonePickaxe");

			MinecraftForge.setToolClass(woodRedstonePickaxe, "pickaxe", InfiMaterialEnum.Redstone.getHarvestLevel());
			MinecraftForge.setToolClass(stoneRedstonePickaxe, "pickaxe", InfiMaterialEnum.Redstone.getHarvestLevel());
			MinecraftForge.setToolClass(ironRedstonePickaxe, "pickaxe", InfiMaterialEnum.Redstone.getHarvestLevel());
			MinecraftForge.setToolClass(redstoneRedstonePickaxe, "pickaxe", InfiMaterialEnum.Redstone.getHarvestLevel());
			MinecraftForge.setToolClass(obsidianRedstonePickaxe, "pickaxe", InfiMaterialEnum.Redstone.getHarvestLevel());
			MinecraftForge.setToolClass(sandstoneRedstonePickaxe, "pickaxe", InfiMaterialEnum.Redstone.getHarvestLevel());
			MinecraftForge.setToolClass(boneRedstonePickaxe, "pickaxe", InfiMaterialEnum.Redstone.getHarvestLevel());
			MinecraftForge.setToolClass(paperRedstonePickaxe, "pickaxe", InfiMaterialEnum.Redstone.getHarvestLevel());
			MinecraftForge.setToolClass(mossyRedstonePickaxe, "pickaxe", InfiMaterialEnum.Redstone.getHarvestLevel());
			MinecraftForge.setToolClass(netherrackRedstonePickaxe, "pickaxe", InfiMaterialEnum.Redstone.getHarvestLevel());
			MinecraftForge.setToolClass(glowstoneRedstonePickaxe, "pickaxe", InfiMaterialEnum.Redstone.getHarvestLevel());
			MinecraftForge.setToolClass(iceRedstonePickaxe, "pickaxe", InfiMaterialEnum.Redstone.getHarvestLevel());
			MinecraftForge.setToolClass(lavaRedstonePickaxe, "pickaxe", InfiMaterialEnum.Redstone.getHarvestLevel());
			MinecraftForge.setToolClass(slimeRedstonePickaxe, "pickaxe", InfiMaterialEnum.Redstone.getHarvestLevel());
			MinecraftForge.setToolClass(cactusRedstonePickaxe, "pickaxe", InfiMaterialEnum.Redstone.getHarvestLevel());
			MinecraftForge.setToolClass(flintRedstonePickaxe, "pickaxe", InfiMaterialEnum.Redstone.getHarvestLevel());
			MinecraftForge.setToolClass(copperRedstonePickaxe, "pickaxe", InfiMaterialEnum.Redstone.getHarvestLevel());
			MinecraftForge.setToolClass(bronzeRedstonePickaxe, "pickaxe", InfiMaterialEnum.Redstone.getHarvestLevel());
			MinecraftForge.setToolClass(workedRedstonePickaxe, "pickaxe", InfiMaterialEnum.Redstone.getHarvestLevel());
			MinecraftForge.setToolClass(uraniumRedstonePickaxe, "pickaxe", InfiMaterialEnum.Redstone.getHarvestLevel());
		}

		if (PHInfiTools.enableObsidianTools)
		{
			woodObsidianPickaxe = new InfiToolPickaxe(PHInfiTools.obsidianPickaxeID + 0, InfiMaterialEnum.Obsidian, InfiMaterialEnum.Wood, "woodObsidianPickaxe");
			stoneObsidianPickaxe = new InfiToolPickaxe(PHInfiTools.obsidianPickaxeID + 1, InfiMaterialEnum.Obsidian, InfiMaterialEnum.Stone, "stoneObsidianPickaxe");
			redstoneObsidianPickaxe = new InfiToolPickaxe(PHInfiTools.obsidianPickaxeID + 2, InfiMaterialEnum.Obsidian, InfiMaterialEnum.Redstone, "redstoneObsidianPickaxe");
			obsidianObsidianPickaxe = new InfiToolPickaxe(PHInfiTools.obsidianPickaxeID + 3, InfiMaterialEnum.Obsidian, InfiMaterialEnum.Obsidian, "obsidianObsidianPickaxe");
			;
			boneObsidianPickaxe = new InfiToolPickaxe(PHInfiTools.obsidianPickaxeID + 4, InfiMaterialEnum.Obsidian, InfiMaterialEnum.Bone, "boneObsidianPickaxe");
			netherrackObsidianPickaxe = new InfiToolPickaxe(PHInfiTools.obsidianPickaxeID + 5, InfiMaterialEnum.Obsidian, InfiMaterialEnum.Netherrack, "netherrackObsidianPickaxe");
			glowstoneObsidianPickaxe = new InfiToolPickaxe(PHInfiTools.obsidianPickaxeID + 6, InfiMaterialEnum.Obsidian, InfiMaterialEnum.Glowstone, "glowstoneObsidianPickaxe");
			iceObsidianPickaxe = new InfiToolPickaxe(PHInfiTools.obsidianPickaxeID + 7, InfiMaterialEnum.Obsidian, InfiMaterialEnum.Ice, "iceObsidianPickaxe");
			lavaObsidianPickaxe = new InfiToolPickaxe(PHInfiTools.obsidianPickaxeID + 8, InfiMaterialEnum.Obsidian, InfiMaterialEnum.Lava, "lavaObsidianPickaxe");
			cactusObsidianPickaxe = new InfiToolPickaxe(PHInfiTools.obsidianPickaxeID + 9, InfiMaterialEnum.Obsidian, InfiMaterialEnum.Cactus, "cactusObsidianPickaxe");

			MinecraftForge.setToolClass(woodObsidianPickaxe, "pickaxe", InfiMaterialEnum.Obsidian.getHarvestLevel());
			MinecraftForge.setToolClass(stoneObsidianPickaxe, "pickaxe", InfiMaterialEnum.Obsidian.getHarvestLevel());
			MinecraftForge.setToolClass(redstoneObsidianPickaxe, "pickaxe", InfiMaterialEnum.Obsidian.getHarvestLevel());
			MinecraftForge.setToolClass(obsidianObsidianPickaxe, "pickaxe", InfiMaterialEnum.Obsidian.getHarvestLevel());
			MinecraftForge.setToolClass(boneObsidianPickaxe, "pickaxe", InfiMaterialEnum.Obsidian.getHarvestLevel());
			MinecraftForge.setToolClass(netherrackObsidianPickaxe, "pickaxe", InfiMaterialEnum.Obsidian.getHarvestLevel());
			MinecraftForge.setToolClass(glowstoneObsidianPickaxe, "pickaxe", InfiMaterialEnum.Obsidian.getHarvestLevel());
			MinecraftForge.setToolClass(iceObsidianPickaxe, "pickaxe", InfiMaterialEnum.Obsidian.getHarvestLevel());
			MinecraftForge.setToolClass(lavaObsidianPickaxe, "pickaxe", InfiMaterialEnum.Obsidian.getHarvestLevel());
			MinecraftForge.setToolClass(cactusObsidianPickaxe, "pickaxe", InfiMaterialEnum.Obsidian.getHarvestLevel());
		}

		if (PHInfiTools.enableSandstoneTools)
		{
			woodSandstonePickaxe = new InfiToolPickaxe(PHInfiTools.sandstonePickaxeID + 0, InfiMaterialEnum.Sandstone, InfiMaterialEnum.Wood, "woodSandstonePickaxe");
			sandstoneSandstonePickaxe = new InfiToolPickaxe(PHInfiTools.sandstonePickaxeID + 1, InfiMaterialEnum.Sandstone, InfiMaterialEnum.Sandstone, "sandstoneSandstonePickaxe");
			boneSandstonePickaxe = new InfiToolPickaxe(PHInfiTools.sandstonePickaxeID + 2, InfiMaterialEnum.Sandstone, InfiMaterialEnum.Bone, "boneSandstonePickaxe");
			netherrackSandstonePickaxe = new InfiToolPickaxe(PHInfiTools.sandstonePickaxeID + 3, InfiMaterialEnum.Sandstone, InfiMaterialEnum.Netherrack, "netherrackSandstonePickaxe");
			iceSandstonePickaxe = new InfiToolPickaxe(PHInfiTools.sandstonePickaxeID + 4, InfiMaterialEnum.Sandstone, InfiMaterialEnum.Ice, "iceSandstonePickaxe");
			slimeSandstonePickaxe = new InfiToolPickaxe(PHInfiTools.sandstonePickaxeID + 5, InfiMaterialEnum.Sandstone, InfiMaterialEnum.Slime, "slimeSandstonePickaxe");
			cactusSandstonePickaxe = new InfiToolPickaxe(PHInfiTools.sandstonePickaxeID + 6, InfiMaterialEnum.Sandstone, InfiMaterialEnum.Cactus, "cactusSandstonePickaxe");
			flintSandstonePickaxe = new InfiToolPickaxe(PHInfiTools.sandstonePickaxeID + 7, InfiMaterialEnum.Sandstone, InfiMaterialEnum.Flint, "flintSandstonePickaxe");

			MinecraftForge.setToolClass(woodSandstonePickaxe, "pickaxe", InfiMaterialEnum.Sandstone.getHarvestLevel());
			MinecraftForge.setToolClass(sandstoneSandstonePickaxe, "pickaxe", InfiMaterialEnum.Sandstone.getHarvestLevel());
			MinecraftForge.setToolClass(boneSandstonePickaxe, "pickaxe", InfiMaterialEnum.Sandstone.getHarvestLevel());
			MinecraftForge.setToolClass(netherrackSandstonePickaxe, "pickaxe", InfiMaterialEnum.Sandstone.getHarvestLevel());
			MinecraftForge.setToolClass(iceSandstonePickaxe, "pickaxe", InfiMaterialEnum.Sandstone.getHarvestLevel());
			MinecraftForge.setToolClass(slimeSandstonePickaxe, "pickaxe", InfiMaterialEnum.Sandstone.getHarvestLevel());
			MinecraftForge.setToolClass(cactusSandstonePickaxe, "pickaxe", InfiMaterialEnum.Sandstone.getHarvestLevel());
			MinecraftForge.setToolClass(flintSandstonePickaxe, "pickaxe", InfiMaterialEnum.Sandstone.getHarvestLevel());
		}

		if (PHInfiTools.enableBoneTools)
		{
			woodBonePickaxe = new InfiToolPickaxe(PHInfiTools.bonePickaxeID + 0, InfiMaterialEnum.Bone, InfiMaterialEnum.Wood, "woodBonePickaxe");
			stoneBonePickaxe = new InfiToolPickaxe(PHInfiTools.bonePickaxeID + 1, InfiMaterialEnum.Bone, InfiMaterialEnum.Stone, "stoneBonePickaxe");
			sandstoneBonePickaxe = new InfiToolPickaxe(PHInfiTools.bonePickaxeID + 2, InfiMaterialEnum.Bone, InfiMaterialEnum.Sandstone, "sandstoneBonePickaxe");
			boneBonePickaxe = new InfiToolPickaxe(PHInfiTools.bonePickaxeID + 3, InfiMaterialEnum.Bone, InfiMaterialEnum.Bone, "boneBonePickaxe");
			paperBonePickaxe = new InfiToolPickaxe(PHInfiTools.bonePickaxeID + 4, InfiMaterialEnum.Bone, InfiMaterialEnum.Paper, "paperBonePickaxe");
			netherrackBonePickaxe = new InfiToolPickaxe(PHInfiTools.bonePickaxeID + 5, InfiMaterialEnum.Bone, InfiMaterialEnum.Netherrack, "netherrackBonePickaxe");
			iceBonePickaxe = new InfiToolPickaxe(PHInfiTools.bonePickaxeID + 6, InfiMaterialEnum.Bone, InfiMaterialEnum.Ice, "iceBonePickaxe");
			cactusBonePickaxe = new InfiToolPickaxe(PHInfiTools.bonePickaxeID + 7, InfiMaterialEnum.Bone, InfiMaterialEnum.Cactus, "cactusBonePickaxe");
			flintBonePickaxe = new InfiToolPickaxe(PHInfiTools.bonePickaxeID + 8, InfiMaterialEnum.Bone, InfiMaterialEnum.Flint, "flintBonePickaxe");

			MinecraftForge.setToolClass(woodBonePickaxe, "pickaxe", InfiMaterialEnum.Bone.getHarvestLevel());
			MinecraftForge.setToolClass(stoneBonePickaxe, "pickaxe", InfiMaterialEnum.Bone.getHarvestLevel());
			MinecraftForge.setToolClass(sandstoneBonePickaxe, "pickaxe", InfiMaterialEnum.Bone.getHarvestLevel());
			MinecraftForge.setToolClass(boneBonePickaxe, "pickaxe", InfiMaterialEnum.Bone.getHarvestLevel());
			MinecraftForge.setToolClass(paperBonePickaxe, "pickaxe", InfiMaterialEnum.Bone.getHarvestLevel());
			MinecraftForge.setToolClass(netherrackBonePickaxe, "pickaxe", InfiMaterialEnum.Bone.getHarvestLevel());
			MinecraftForge.setToolClass(iceBonePickaxe, "pickaxe", InfiMaterialEnum.Bone.getHarvestLevel());
			MinecraftForge.setToolClass(cactusBonePickaxe, "pickaxe", InfiMaterialEnum.Bone.getHarvestLevel());
			MinecraftForge.setToolClass(flintBonePickaxe, "pickaxe", InfiMaterialEnum.Bone.getHarvestLevel());
		}

		if (PHInfiTools.enablePaperTools)
		{
			woodPaperPickaxe = new InfiToolPickaxe(PHInfiTools.paperPickaxeID + 0, InfiMaterialEnum.Paper, InfiMaterialEnum.Wood, "woodPaperPickaxe");
			bonePaperPickaxe = new InfiToolPickaxe(PHInfiTools.paperPickaxeID + 1, InfiMaterialEnum.Paper, InfiMaterialEnum.Bone, "bonePaperPickaxe");
			paperPaperPickaxe = new InfiToolPickaxe(PHInfiTools.paperPickaxeID + 2, InfiMaterialEnum.Paper, InfiMaterialEnum.Paper, "paperPaperPickaxe");
			slimePaperPickaxe = new InfiToolPickaxe(PHInfiTools.paperPickaxeID + 3, InfiMaterialEnum.Paper, InfiMaterialEnum.Slime, "slimePaperPickaxe");
			cactusPaperPickaxe = new InfiToolPickaxe(PHInfiTools.paperPickaxeID + 4, InfiMaterialEnum.Paper, InfiMaterialEnum.Cactus, "cactusPaperPickaxe");

			MinecraftForge.setToolClass(woodPaperPickaxe, "pickaxe", InfiMaterialEnum.Paper.getHarvestLevel());
			MinecraftForge.setToolClass(bonePaperPickaxe, "pickaxe", InfiMaterialEnum.Paper.getHarvestLevel());
			MinecraftForge.setToolClass(paperPaperPickaxe, "pickaxe", InfiMaterialEnum.Paper.getHarvestLevel());
			MinecraftForge.setToolClass(slimePaperPickaxe, "pickaxe", InfiMaterialEnum.Paper.getHarvestLevel());
			MinecraftForge.setToolClass(cactusPaperPickaxe, "pickaxe", InfiMaterialEnum.Paper.getHarvestLevel());
		}

		if (PHInfiTools.enableMossyTools)
		{
			woodMossyPickaxe = new InfiToolPickaxe(PHInfiTools.mossyPickaxeID + 0, InfiMaterialEnum.Mossy, InfiMaterialEnum.Wood, "woodMossyPickaxe");
			stoneMossyPickaxe = new InfiToolPickaxe(PHInfiTools.mossyPickaxeID + 1, InfiMaterialEnum.Mossy, InfiMaterialEnum.Stone, "stoneMossyPickaxe");
			diamondMossyPickaxe = new InfiToolPickaxe(PHInfiTools.mossyPickaxeID + 2, InfiMaterialEnum.Mossy, InfiMaterialEnum.Diamond, "diamondMossyPickaxe");
			redstoneMossyPickaxe = new InfiToolPickaxe(PHInfiTools.mossyPickaxeID + 3, InfiMaterialEnum.Mossy, InfiMaterialEnum.Redstone, "redstoneMossyPickaxe");
			boneMossyPickaxe = new InfiToolPickaxe(PHInfiTools.mossyPickaxeID + 4, InfiMaterialEnum.Mossy, InfiMaterialEnum.Bone, "boneMossyPickaxe");
			mossyMossyPickaxe = new InfiToolPickaxe(PHInfiTools.mossyPickaxeID + 5, InfiMaterialEnum.Mossy, InfiMaterialEnum.Mossy, "mossyMossyPickaxe");
			netherrackMossyPickaxe = new InfiToolPickaxe(PHInfiTools.mossyPickaxeID + 6, InfiMaterialEnum.Mossy, InfiMaterialEnum.Netherrack, "netherrackMossyPickaxe");
			glowstoneMossyPickaxe = new InfiToolPickaxe(PHInfiTools.mossyPickaxeID + 7, InfiMaterialEnum.Mossy, InfiMaterialEnum.Glowstone, "glowstoneMossyPickaxe");
			cactusMossyPickaxe = new InfiToolPickaxe(PHInfiTools.mossyPickaxeID + 8, InfiMaterialEnum.Mossy, InfiMaterialEnum.Cactus, "cactusMossyPickaxe");
			blazeMossyPickaxe = new InfiToolPickaxe(PHInfiTools.mossyPickaxeID + 9, InfiMaterialEnum.Mossy, InfiMaterialEnum.Blaze, "blazeMossyPickaxe");
			manyullynMossyPickaxe = new InfiToolPickaxe(PHInfiTools.mossyPickaxeID + 10, InfiMaterialEnum.Mossy, InfiMaterialEnum.Manyullyn, "manyullynMossyPickaxe");
			uraniumMossyPickaxe = new InfiToolPickaxe(PHInfiTools.mossyPickaxeID + 11, InfiMaterialEnum.Mossy, InfiMaterialEnum.Uranium, "uraniumMossyPickaxe");

			MinecraftForge.setToolClass(woodMossyPickaxe, "pickaxe", InfiMaterialEnum.Mossy.getHarvestLevel());
			MinecraftForge.setToolClass(stoneMossyPickaxe, "pickaxe", InfiMaterialEnum.Mossy.getHarvestLevel());
			MinecraftForge.setToolClass(diamondMossyPickaxe, "pickaxe", InfiMaterialEnum.Mossy.getHarvestLevel());
			MinecraftForge.setToolClass(redstoneMossyPickaxe, "pickaxe", InfiMaterialEnum.Mossy.getHarvestLevel());
			MinecraftForge.setToolClass(boneMossyPickaxe, "pickaxe", InfiMaterialEnum.Mossy.getHarvestLevel());
			MinecraftForge.setToolClass(mossyMossyPickaxe, "pickaxe", InfiMaterialEnum.Mossy.getHarvestLevel());
			MinecraftForge.setToolClass(netherrackMossyPickaxe, "pickaxe", InfiMaterialEnum.Mossy.getHarvestLevel());
			MinecraftForge.setToolClass(glowstoneMossyPickaxe, "pickaxe", InfiMaterialEnum.Mossy.getHarvestLevel());
			MinecraftForge.setToolClass(cactusMossyPickaxe, "pickaxe", InfiMaterialEnum.Mossy.getHarvestLevel());
			MinecraftForge.setToolClass(blazeMossyPickaxe, "pickaxe", InfiMaterialEnum.Mossy.getHarvestLevel());
			MinecraftForge.setToolClass(manyullynMossyPickaxe, "pickaxe", InfiMaterialEnum.Mossy.getHarvestLevel());
			MinecraftForge.setToolClass(uraniumMossyPickaxe, "pickaxe", InfiMaterialEnum.Mossy.getHarvestLevel());
		}

		if (PHInfiTools.enableNetherrackTools)
		{
			woodNetherrackPickaxe = new InfiToolPickaxe(PHInfiTools.netherrackPickaxeID + 0, InfiMaterialEnum.Netherrack, InfiMaterialEnum.Wood, "woodNetherrackPickaxe");
			stoneNetherrackPickaxe = new InfiToolPickaxe(PHInfiTools.netherrackPickaxeID + 1, InfiMaterialEnum.Netherrack, InfiMaterialEnum.Stone, "stoneNetherrackPickaxe");
			sandstoneNetherrackPickaxe = new InfiToolPickaxe(PHInfiTools.netherrackPickaxeID + 2, InfiMaterialEnum.Netherrack, InfiMaterialEnum.Sandstone, "sandstoneNetherrackPickaxe");
			boneNetherrackPickaxe = new InfiToolPickaxe(PHInfiTools.netherrackPickaxeID + 3, InfiMaterialEnum.Netherrack, InfiMaterialEnum.Bone, "boneNetherrackPickaxe");
			paperNetherrackPickaxe = new InfiToolPickaxe(PHInfiTools.netherrackPickaxeID + 4, InfiMaterialEnum.Netherrack, InfiMaterialEnum.Paper, "paperNetherrackPickaxe");
			mossyNetherrackPickaxe = new InfiToolPickaxe(PHInfiTools.netherrackPickaxeID + 5, InfiMaterialEnum.Netherrack, InfiMaterialEnum.Mossy, "mossyNetherrackPickaxe");
			netherrackNetherrackPickaxe = new InfiToolPickaxe(PHInfiTools.netherrackPickaxeID + 6, InfiMaterialEnum.Netherrack, InfiMaterialEnum.Netherrack, "netherrackNetherrackPickaxe");
			iceNetherrackPickaxe = new InfiToolPickaxe(PHInfiTools.netherrackPickaxeID + 7, InfiMaterialEnum.Netherrack, InfiMaterialEnum.Ice, "iceNetherrackPickaxe");
			slimeNetherrackPickaxe = new InfiToolPickaxe(PHInfiTools.netherrackPickaxeID + 8, InfiMaterialEnum.Netherrack, InfiMaterialEnum.Slime, "slimeNetherrackPickaxe");
			cactusNetherrackPickaxe = new InfiToolPickaxe(PHInfiTools.netherrackPickaxeID + 9, InfiMaterialEnum.Netherrack, InfiMaterialEnum.Cactus, "cactusNetherrackPickaxe");
			flintNetherrackPickaxe = new InfiToolPickaxe(PHInfiTools.netherrackPickaxeID + 10, InfiMaterialEnum.Netherrack, InfiMaterialEnum.Flint, "flintNetherrackPickaxe");
			copperNetherrackPickaxe = new InfiToolPickaxe(PHInfiTools.netherrackPickaxeID + 11, InfiMaterialEnum.Netherrack, InfiMaterialEnum.Copper, "copperNetherrackPickaxe");
			bronzeNetherrackPickaxe = new InfiToolPickaxe(PHInfiTools.netherrackPickaxeID + 12, InfiMaterialEnum.Netherrack, InfiMaterialEnum.Bronze, "bronzeNetherrackPickaxe");

			MinecraftForge.setToolClass(woodNetherrackPickaxe, "pickaxe", InfiMaterialEnum.Netherrack.getHarvestLevel());
			MinecraftForge.setToolClass(stoneNetherrackPickaxe, "pickaxe", InfiMaterialEnum.Netherrack.getHarvestLevel());
			MinecraftForge.setToolClass(sandstoneNetherrackPickaxe, "pickaxe", InfiMaterialEnum.Netherrack.getHarvestLevel());
			MinecraftForge.setToolClass(boneNetherrackPickaxe, "pickaxe", InfiMaterialEnum.Netherrack.getHarvestLevel());
			MinecraftForge.setToolClass(paperNetherrackPickaxe, "pickaxe", InfiMaterialEnum.Netherrack.getHarvestLevel());
			MinecraftForge.setToolClass(mossyNetherrackPickaxe, "pickaxe", InfiMaterialEnum.Netherrack.getHarvestLevel());
			MinecraftForge.setToolClass(netherrackNetherrackPickaxe, "pickaxe", InfiMaterialEnum.Netherrack.getHarvestLevel());
			MinecraftForge.setToolClass(iceNetherrackPickaxe, "pickaxe", InfiMaterialEnum.Netherrack.getHarvestLevel());
			MinecraftForge.setToolClass(slimeNetherrackPickaxe, "pickaxe", InfiMaterialEnum.Netherrack.getHarvestLevel());
			MinecraftForge.setToolClass(cactusNetherrackPickaxe, "pickaxe", InfiMaterialEnum.Netherrack.getHarvestLevel());
			MinecraftForge.setToolClass(flintNetherrackPickaxe, "pickaxe", InfiMaterialEnum.Netherrack.getHarvestLevel());
			MinecraftForge.setToolClass(copperNetherrackPickaxe, "pickaxe", InfiMaterialEnum.Netherrack.getHarvestLevel());
			MinecraftForge.setToolClass(bronzeNetherrackPickaxe, "pickaxe", InfiMaterialEnum.Netherrack.getHarvestLevel());
		}

		if (PHInfiTools.enableGlowstoneTools)
		{
			woodGlowstonePickaxe = new InfiToolPickaxe(PHInfiTools.glowstonePickaxeID + 0, InfiMaterialEnum.Glowstone, InfiMaterialEnum.Wood, "woodGlowstonePickaxe");
			redstoneGlowstonePickaxe = new InfiToolPickaxe(PHInfiTools.glowstonePickaxeID + 1, InfiMaterialEnum.Glowstone, InfiMaterialEnum.Redstone, "redstoneGlowstonePickaxe");
			obsidianGlowstonePickaxe = new InfiToolPickaxe(PHInfiTools.glowstonePickaxeID + 2, InfiMaterialEnum.Glowstone, InfiMaterialEnum.Obsidian, "obsidianGlowstonePickaxe");
			boneGlowstonePickaxe = new InfiToolPickaxe(PHInfiTools.glowstonePickaxeID + 3, InfiMaterialEnum.Glowstone, InfiMaterialEnum.Bone, "boneGlowstonePickaxe");
			netherrackGlowstonePickaxe = new InfiToolPickaxe(PHInfiTools.glowstonePickaxeID + 4, InfiMaterialEnum.Glowstone, InfiMaterialEnum.Netherrack, "netherrackGlowstonePickaxe");
			glowstoneGlowstonePickaxe = new InfiToolPickaxe(PHInfiTools.glowstonePickaxeID + 5, InfiMaterialEnum.Glowstone, InfiMaterialEnum.Glowstone, "glowstoneGlowstonePickaxe");
			iceGlowstonePickaxe = new InfiToolPickaxe(PHInfiTools.glowstonePickaxeID + 6, InfiMaterialEnum.Glowstone, InfiMaterialEnum.Ice, "iceGlowstonePickaxe");
			slimeGlowstonePickaxe = new InfiToolPickaxe(PHInfiTools.glowstonePickaxeID + 7, InfiMaterialEnum.Glowstone, InfiMaterialEnum.Slime, "slimeGlowstonePickaxe");
			cactusGlowstonePickaxe = new InfiToolPickaxe(PHInfiTools.glowstonePickaxeID + 8, InfiMaterialEnum.Glowstone, InfiMaterialEnum.Cactus, "cactusGlowstonePickaxe");

			MinecraftForge.setToolClass(woodGlowstonePickaxe, "pickaxe", InfiMaterialEnum.Glowstone.getHarvestLevel());
			MinecraftForge.setToolClass(redstoneGlowstonePickaxe, "pickaxe", InfiMaterialEnum.Glowstone.getHarvestLevel());
			MinecraftForge.setToolClass(obsidianGlowstonePickaxe, "pickaxe", InfiMaterialEnum.Glowstone.getHarvestLevel());
			MinecraftForge.setToolClass(boneGlowstonePickaxe, "pickaxe", InfiMaterialEnum.Glowstone.getHarvestLevel());
			MinecraftForge.setToolClass(netherrackGlowstonePickaxe, "pickaxe", InfiMaterialEnum.Glowstone.getHarvestLevel());
			MinecraftForge.setToolClass(glowstoneGlowstonePickaxe, "pickaxe", InfiMaterialEnum.Glowstone.getHarvestLevel());
			MinecraftForge.setToolClass(iceGlowstonePickaxe, "pickaxe", InfiMaterialEnum.Glowstone.getHarvestLevel());
			MinecraftForge.setToolClass(slimeGlowstonePickaxe, "pickaxe", InfiMaterialEnum.Glowstone.getHarvestLevel());
			MinecraftForge.setToolClass(cactusGlowstonePickaxe, "pickaxe", InfiMaterialEnum.Glowstone.getHarvestLevel());
		}

		if (PHInfiTools.enableIceTools)
		{
			woodIcePickaxe = new InfiToolPickaxe(PHInfiTools.icePickaxeID + 0, InfiMaterialEnum.Ice, InfiMaterialEnum.Wood, "woodIcePickaxe");
			boneIcePickaxe = new InfiToolPickaxe(PHInfiTools.icePickaxeID + 1, InfiMaterialEnum.Ice, InfiMaterialEnum.Bone, "boneIcePickaxe");
			paperIcePickaxe = new InfiToolPickaxe(PHInfiTools.icePickaxeID + 2, InfiMaterialEnum.Ice, InfiMaterialEnum.Paper, "paperIcePickaxe");
			iceIcePickaxe = new InfiToolPickaxe(PHInfiTools.icePickaxeID + 3, InfiMaterialEnum.Ice, InfiMaterialEnum.Ice, "iceIcePickaxe");
			slimeIcePickaxe = new InfiToolPickaxe(PHInfiTools.icePickaxeID + 4, InfiMaterialEnum.Ice, InfiMaterialEnum.Slime, "slimeIcePickaxe");
			cactusIcePickaxe = new InfiToolPickaxe(PHInfiTools.icePickaxeID + 5, InfiMaterialEnum.Ice, InfiMaterialEnum.Cactus, "cactusIcePickaxe");

			MinecraftForge.setToolClass(woodIcePickaxe, "pickaxe", InfiMaterialEnum.Ice.getHarvestLevel());
			MinecraftForge.setToolClass(boneIcePickaxe, "pickaxe", InfiMaterialEnum.Ice.getHarvestLevel());
			MinecraftForge.setToolClass(paperIcePickaxe, "pickaxe", InfiMaterialEnum.Ice.getHarvestLevel());
			MinecraftForge.setToolClass(iceIcePickaxe, "pickaxe", InfiMaterialEnum.Ice.getHarvestLevel());
			MinecraftForge.setToolClass(slimeIcePickaxe, "pickaxe", InfiMaterialEnum.Ice.getHarvestLevel());
			MinecraftForge.setToolClass(cactusIcePickaxe, "pickaxe", InfiMaterialEnum.Ice.getHarvestLevel());
		}

		if (PHInfiTools.enableLavaTools)
		{
			diamondLavaPickaxe = new InfiToolPickaxe(PHInfiTools.lavaPickaxeID + 0, InfiMaterialEnum.Lava, InfiMaterialEnum.Diamond, "diamondLavaPickaxe");
			obsidianLavaPickaxe = new InfiToolPickaxe(PHInfiTools.lavaPickaxeID + 1, InfiMaterialEnum.Lava, InfiMaterialEnum.Obsidian, "obsidianLavaPickaxe");
			netherrackLavaPickaxe = new InfiToolPickaxe(PHInfiTools.lavaPickaxeID + 2, InfiMaterialEnum.Lava, InfiMaterialEnum.Netherrack, "netherrackLavaPickaxe");
			lavaLavaPickaxe = new InfiToolPickaxe(PHInfiTools.lavaPickaxeID + 3, InfiMaterialEnum.Lava, InfiMaterialEnum.Lava, "lavaLavaPickaxe");
			flintLavaPickaxe = new InfiToolPickaxe(PHInfiTools.lavaPickaxeID + 4, InfiMaterialEnum.Lava, InfiMaterialEnum.Flint, "flintLavaPickaxe");
			blazeLavaPickaxe = new InfiToolPickaxe(PHInfiTools.lavaPickaxeID + 5, InfiMaterialEnum.Lava, InfiMaterialEnum.Blaze, "blazeLavaPickaxe");
			manyullynLavaPickaxe = new InfiToolPickaxe(PHInfiTools.lavaPickaxeID + 6, InfiMaterialEnum.Lava, InfiMaterialEnum.Manyullyn, "manyullynLavaPickaxe");
			uraniumLavaPickaxe = new InfiToolPickaxe(PHInfiTools.lavaPickaxeID + 7, InfiMaterialEnum.Lava, InfiMaterialEnum.Uranium, "uraniumLavaPickaxe");

			MinecraftForge.setToolClass(diamondLavaPickaxe, "pickaxe", InfiMaterialEnum.Lava.getHarvestLevel());
			MinecraftForge.setToolClass(obsidianLavaPickaxe, "pickaxe", InfiMaterialEnum.Lava.getHarvestLevel());
			MinecraftForge.setToolClass(netherrackLavaPickaxe, "pickaxe", InfiMaterialEnum.Lava.getHarvestLevel());
			MinecraftForge.setToolClass(lavaLavaPickaxe, "pickaxe", InfiMaterialEnum.Lava.getHarvestLevel());
			MinecraftForge.setToolClass(flintLavaPickaxe, "pickaxe", InfiMaterialEnum.Lava.getHarvestLevel());
			MinecraftForge.setToolClass(blazeLavaPickaxe, "pickaxe", InfiMaterialEnum.Lava.getHarvestLevel());
			MinecraftForge.setToolClass(manyullynLavaPickaxe, "pickaxe", InfiMaterialEnum.Lava.getHarvestLevel());
			MinecraftForge.setToolClass(uraniumLavaPickaxe, "pickaxe", InfiMaterialEnum.Lava.getHarvestLevel());
		}

		if (PHInfiTools.enableSlimeTools)
		{
			woodSlimePickaxe = new InfiToolPickaxe(PHInfiTools.slimePickaxeID + 0, InfiMaterialEnum.Slime, InfiMaterialEnum.Wood, "woodSlimePickaxe");
			sandstoneSlimePickaxe = new InfiToolPickaxe(PHInfiTools.slimePickaxeID + 1, InfiMaterialEnum.Slime, InfiMaterialEnum.Sandstone, "sandstoneSlimePickaxe");
			boneSlimePickaxe = new InfiToolPickaxe(PHInfiTools.slimePickaxeID + 2, InfiMaterialEnum.Slime, InfiMaterialEnum.Bone, "boneSlimePickaxe");
			paperSlimePickaxe = new InfiToolPickaxe(PHInfiTools.slimePickaxeID + 3, InfiMaterialEnum.Slime, InfiMaterialEnum.Paper, "paperSlimePickaxe");
			slimeSlimePickaxe = new InfiToolPickaxe(PHInfiTools.slimePickaxeID + 4, InfiMaterialEnum.Slime, InfiMaterialEnum.Slime, "slimeSlimePickaxe");
			cactusSlimePickaxe = new InfiToolPickaxe(PHInfiTools.slimePickaxeID + 5, InfiMaterialEnum.Slime, InfiMaterialEnum.Cactus, "cactusSlimePickaxe");

			MinecraftForge.setToolClass(woodSlimePickaxe, "pickaxe", InfiMaterialEnum.Slime.getHarvestLevel());
			MinecraftForge.setToolClass(sandstoneSlimePickaxe, "pickaxe", InfiMaterialEnum.Slime.getHarvestLevel());
			MinecraftForge.setToolClass(boneSlimePickaxe, "pickaxe", InfiMaterialEnum.Slime.getHarvestLevel());
			MinecraftForge.setToolClass(paperSlimePickaxe, "pickaxe", InfiMaterialEnum.Slime.getHarvestLevel());
			MinecraftForge.setToolClass(slimeSlimePickaxe, "pickaxe", InfiMaterialEnum.Slime.getHarvestLevel());
			MinecraftForge.setToolClass(cactusSlimePickaxe, "pickaxe", InfiMaterialEnum.Slime.getHarvestLevel());
		}

		if (PHInfiTools.enableCactusTools)
		{
			woodCactusPickaxe = new InfiToolPickaxe(PHInfiTools.cactusPickaxeID + 0, InfiMaterialEnum.Cactus, InfiMaterialEnum.Wood, "woodCactusPickaxe");
			sandstoneCactusPickaxe = new InfiToolPickaxe(PHInfiTools.cactusPickaxeID + 1, InfiMaterialEnum.Cactus, InfiMaterialEnum.Sandstone, "sandstoneCactusPickaxe");
			boneCactusPickaxe = new InfiToolPickaxe(PHInfiTools.cactusPickaxeID + 2, InfiMaterialEnum.Cactus, InfiMaterialEnum.Bone, "boneCactusPickaxe");
			netherrackCactusPickaxe = new InfiToolPickaxe(PHInfiTools.cactusPickaxeID + 3, InfiMaterialEnum.Cactus, InfiMaterialEnum.Netherrack, "netherrackCactusPickaxe");
			iceCactusPickaxe = new InfiToolPickaxe(PHInfiTools.cactusPickaxeID + 4, InfiMaterialEnum.Cactus, InfiMaterialEnum.Ice, "iceCactusPickaxe");
			slimeCactusPickaxe = new InfiToolPickaxe(PHInfiTools.cactusPickaxeID + 5, InfiMaterialEnum.Cactus, InfiMaterialEnum.Slime, "slimeCactusPickaxe");
			cactusCactusPickaxe = new InfiToolPickaxe(PHInfiTools.cactusPickaxeID + 6, InfiMaterialEnum.Cactus, InfiMaterialEnum.Cactus, "cactusCactusPickaxe");

			MinecraftForge.setToolClass(woodCactusPickaxe, "pickaxe", InfiMaterialEnum.Cactus.getHarvestLevel());
			MinecraftForge.setToolClass(sandstoneCactusPickaxe, "pickaxe", InfiMaterialEnum.Cactus.getHarvestLevel());
			MinecraftForge.setToolClass(boneCactusPickaxe, "pickaxe", InfiMaterialEnum.Cactus.getHarvestLevel());
			MinecraftForge.setToolClass(netherrackCactusPickaxe, "pickaxe", InfiMaterialEnum.Cactus.getHarvestLevel());
			MinecraftForge.setToolClass(iceCactusPickaxe, "pickaxe", InfiMaterialEnum.Cactus.getHarvestLevel());
			MinecraftForge.setToolClass(slimeCactusPickaxe, "pickaxe", InfiMaterialEnum.Cactus.getHarvestLevel());
			MinecraftForge.setToolClass(cactusCactusPickaxe, "pickaxe", InfiMaterialEnum.Cactus.getHarvestLevel());
		}

		if (PHInfiTools.enableFlintTools)
		{
			woodFlintPickaxe = new InfiToolPickaxe(PHInfiTools.flintPickaxeID + 0, InfiMaterialEnum.Flint, InfiMaterialEnum.Wood, "woodFlintPickaxe");
			stoneFlintPickaxe = new InfiToolPickaxe(PHInfiTools.flintPickaxeID + 1, InfiMaterialEnum.Flint, InfiMaterialEnum.Stone, "stoneFlintPickaxe");
			sandstoneFlintPickaxe = new InfiToolPickaxe(PHInfiTools.flintPickaxeID + 2, InfiMaterialEnum.Flint, InfiMaterialEnum.Sandstone, "sandstoneFlintPickaxe");
			boneFlintPickaxe = new InfiToolPickaxe(PHInfiTools.flintPickaxeID + 3, InfiMaterialEnum.Flint, InfiMaterialEnum.Bone, "boneFlintPickaxe");
			netherrackFlintPickaxe = new InfiToolPickaxe(PHInfiTools.flintPickaxeID + 4, InfiMaterialEnum.Flint, InfiMaterialEnum.Netherrack, "netherrackFlintPickaxe");
			slimeFlintPickaxe = new InfiToolPickaxe(PHInfiTools.flintPickaxeID + 5, InfiMaterialEnum.Flint, InfiMaterialEnum.Slime, "slimeFlintPickaxe");
			cactusFlintPickaxe = new InfiToolPickaxe(PHInfiTools.flintPickaxeID + 6, InfiMaterialEnum.Flint, InfiMaterialEnum.Cactus, "cactusFlintPickaxe");
			flintFlintPickaxe = new InfiToolPickaxe(PHInfiTools.flintPickaxeID + 7, InfiMaterialEnum.Flint, InfiMaterialEnum.Flint, "flintFlintPickaxe");
			copperFlintPickaxe = new InfiToolPickaxe(PHInfiTools.flintPickaxeID + 8, InfiMaterialEnum.Flint, InfiMaterialEnum.Copper, "copperFlintPickaxe");
			bronzeFlintPickaxe = new InfiToolPickaxe(PHInfiTools.flintPickaxeID + 9, InfiMaterialEnum.Flint, InfiMaterialEnum.Bronze, "bronzeFlintPickaxe");

			MinecraftForge.setToolClass(woodFlintPickaxe, "pickaxe", InfiMaterialEnum.Flint.getHarvestLevel());
			MinecraftForge.setToolClass(stoneFlintPickaxe, "pickaxe", InfiMaterialEnum.Flint.getHarvestLevel());
			MinecraftForge.setToolClass(sandstoneFlintPickaxe, "pickaxe", InfiMaterialEnum.Flint.getHarvestLevel());
			MinecraftForge.setToolClass(boneFlintPickaxe, "pickaxe", InfiMaterialEnum.Flint.getHarvestLevel());
			MinecraftForge.setToolClass(netherrackFlintPickaxe, "pickaxe", InfiMaterialEnum.Flint.getHarvestLevel());
			MinecraftForge.setToolClass(slimeFlintPickaxe, "pickaxe", InfiMaterialEnum.Flint.getHarvestLevel());
			MinecraftForge.setToolClass(cactusFlintPickaxe, "pickaxe", InfiMaterialEnum.Flint.getHarvestLevel());
			MinecraftForge.setToolClass(flintFlintPickaxe, "pickaxe", InfiMaterialEnum.Flint.getHarvestLevel());
			MinecraftForge.setToolClass(copperFlintPickaxe, "pickaxe", InfiMaterialEnum.Flint.getHarvestLevel());
			MinecraftForge.setToolClass(bronzeFlintPickaxe, "pickaxe", InfiMaterialEnum.Flint.getHarvestLevel());
		}

		if (PHInfiTools.enableBlazeTools)
		{
			diamondBlazePickaxe = new InfiToolPickaxe(PHInfiTools.blazePickaxeID + 0, InfiMaterialEnum.Blaze, InfiMaterialEnum.Diamond, "diamondBlazePickaxe");
			obsidianBlazePickaxe = new InfiToolPickaxe(PHInfiTools.blazePickaxeID + 1, InfiMaterialEnum.Blaze, InfiMaterialEnum.Obsidian, "obsidianBlazePickaxe");
			netherrackBlazePickaxe = new InfiToolPickaxe(PHInfiTools.blazePickaxeID + 2, InfiMaterialEnum.Blaze, InfiMaterialEnum.Netherrack, "netherrackBlazePickaxe");
			lavaBlazePickaxe = new InfiToolPickaxe(PHInfiTools.blazePickaxeID + 3, InfiMaterialEnum.Blaze, InfiMaterialEnum.Lava, "lavaBlazePickaxe");
			flintBlazePickaxe = new InfiToolPickaxe(PHInfiTools.blazePickaxeID + 4, InfiMaterialEnum.Blaze, InfiMaterialEnum.Flint, "flintBlazePickaxe");
			blazeBlazePickaxe = new InfiToolPickaxe(PHInfiTools.blazePickaxeID + 5, InfiMaterialEnum.Blaze, InfiMaterialEnum.Blaze, "blazeBlazePickaxe");
			manyullynBlazePickaxe = new InfiToolPickaxe(PHInfiTools.blazePickaxeID + 6, InfiMaterialEnum.Blaze, InfiMaterialEnum.Manyullyn, "manyullynBlazePickaxe");
			uraniumBlazePickaxe = new InfiToolPickaxe(PHInfiTools.blazePickaxeID + 7, InfiMaterialEnum.Blaze, InfiMaterialEnum.Uranium, "uraniumBlazePickaxe");

			MinecraftForge.setToolClass(diamondBlazePickaxe, "pickaxe", InfiMaterialEnum.Blaze.getHarvestLevel());
			MinecraftForge.setToolClass(obsidianBlazePickaxe, "pickaxe", InfiMaterialEnum.Blaze.getHarvestLevel());
			MinecraftForge.setToolClass(netherrackBlazePickaxe, "pickaxe", InfiMaterialEnum.Blaze.getHarvestLevel());
			MinecraftForge.setToolClass(blazeBlazePickaxe, "pickaxe", InfiMaterialEnum.Blaze.getHarvestLevel());
			MinecraftForge.setToolClass(flintBlazePickaxe, "pickaxe", InfiMaterialEnum.Blaze.getHarvestLevel());
			MinecraftForge.setToolClass(blazeBlazePickaxe, "pickaxe", InfiMaterialEnum.Blaze.getHarvestLevel());
			MinecraftForge.setToolClass(manyullynBlazePickaxe, "pickaxe", InfiMaterialEnum.Blaze.getHarvestLevel());
			MinecraftForge.setToolClass(uraniumBlazePickaxe, "pickaxe", InfiMaterialEnum.Blaze.getHarvestLevel());
		}

		if (PHInfiTools.enableCopperTools)
		{
			woodCopperPickaxe = new InfiToolPickaxe(PHInfiTools.copperPickaxeID + 0, InfiMaterialEnum.Copper, InfiMaterialEnum.Wood, "woodCopperPickaxe");
			stoneCopperPickaxe = new InfiToolPickaxe(PHInfiTools.copperPickaxeID + 1, InfiMaterialEnum.Copper, InfiMaterialEnum.Stone, "stoneCopperPickaxe");
			boneCopperPickaxe = new InfiToolPickaxe(PHInfiTools.copperPickaxeID + 2, InfiMaterialEnum.Copper, InfiMaterialEnum.Bone, "boneCopperPickaxe");
			netherrackCopperPickaxe = new InfiToolPickaxe(PHInfiTools.copperPickaxeID + 3, InfiMaterialEnum.Copper, InfiMaterialEnum.Netherrack, "netherrackCopperPickaxe");
			slimeCopperPickaxe = new InfiToolPickaxe(PHInfiTools.copperPickaxeID + 4, InfiMaterialEnum.Copper, InfiMaterialEnum.Slime, "slimeCopperPickaxe");
			cactusCopperPickaxe = new InfiToolPickaxe(PHInfiTools.copperPickaxeID + 5, InfiMaterialEnum.Copper, InfiMaterialEnum.Cactus, "cactusCopperPickaxe");
			flintCopperPickaxe = new InfiToolPickaxe(PHInfiTools.copperPickaxeID + 6, InfiMaterialEnum.Copper, InfiMaterialEnum.Flint, "flintCopperPickaxe");
			copperCopperPickaxe = new InfiToolPickaxe(PHInfiTools.copperPickaxeID + 7, InfiMaterialEnum.Copper, InfiMaterialEnum.Copper, "copperCopperPickaxe");

			MinecraftForge.setToolClass(woodCopperPickaxe, "pickaxe", InfiMaterialEnum.Copper.getHarvestLevel());
			MinecraftForge.setToolClass(stoneCopperPickaxe, "pickaxe", InfiMaterialEnum.Copper.getHarvestLevel());
			MinecraftForge.setToolClass(boneCopperPickaxe, "pickaxe", InfiMaterialEnum.Copper.getHarvestLevel());
			MinecraftForge.setToolClass(netherrackCopperPickaxe, "pickaxe", InfiMaterialEnum.Copper.getHarvestLevel());
			MinecraftForge.setToolClass(slimeCopperPickaxe, "pickaxe", InfiMaterialEnum.Copper.getHarvestLevel());
			MinecraftForge.setToolClass(cactusCopperPickaxe, "pickaxe", InfiMaterialEnum.Copper.getHarvestLevel());
			MinecraftForge.setToolClass(flintCopperPickaxe, "pickaxe", InfiMaterialEnum.Copper.getHarvestLevel());
			MinecraftForge.setToolClass(copperCopperPickaxe, "pickaxe", InfiMaterialEnum.Copper.getHarvestLevel());
		}

		if (PHInfiTools.enableBronzeTools)
		{
			woodBronzePickaxe = new InfiToolPickaxe(PHInfiTools.bronzePickaxeID + 0, InfiMaterialEnum.Bronze, InfiMaterialEnum.Wood, "woodBronzePickaxe");
			stoneBronzePickaxe = new InfiToolPickaxe(PHInfiTools.bronzePickaxeID + 1, InfiMaterialEnum.Bronze, InfiMaterialEnum.Stone, "stoneBronzePickaxe");
			boneBronzePickaxe = new InfiToolPickaxe(PHInfiTools.bronzePickaxeID + 2, InfiMaterialEnum.Bronze, InfiMaterialEnum.Bone, "boneBronzePickaxe");
			netherrackBronzePickaxe = new InfiToolPickaxe(PHInfiTools.bronzePickaxeID + 3, InfiMaterialEnum.Bronze, InfiMaterialEnum.Netherrack, "netherrackBronzePickaxe");
			slimeBronzePickaxe = new InfiToolPickaxe(PHInfiTools.bronzePickaxeID + 4, InfiMaterialEnum.Bronze, InfiMaterialEnum.Slime, "slimeBronzePickaxe");
			cactusBronzePickaxe = new InfiToolPickaxe(PHInfiTools.bronzePickaxeID + 5, InfiMaterialEnum.Bronze, InfiMaterialEnum.Cactus, "cactusBronzePickaxe");
			flintBronzePickaxe = new InfiToolPickaxe(PHInfiTools.bronzePickaxeID + 6, InfiMaterialEnum.Bronze, InfiMaterialEnum.Flint, "flintBronzePickaxe");
			copperBronzePickaxe = new InfiToolPickaxe(PHInfiTools.bronzePickaxeID + 7, InfiMaterialEnum.Bronze, InfiMaterialEnum.Copper, "copperBronzePickaxe");
			bronzeBronzePickaxe = new InfiToolPickaxe(PHInfiTools.bronzePickaxeID + 8, InfiMaterialEnum.Bronze, InfiMaterialEnum.Bronze, "bronzeBronzePickaxe");

			MinecraftForge.setToolClass(woodBronzePickaxe, "pickaxe", InfiMaterialEnum.Bronze.getHarvestLevel());
			MinecraftForge.setToolClass(stoneBronzePickaxe, "pickaxe", InfiMaterialEnum.Bronze.getHarvestLevel());
			MinecraftForge.setToolClass(boneBronzePickaxe, "pickaxe", InfiMaterialEnum.Bronze.getHarvestLevel());
			MinecraftForge.setToolClass(netherrackBronzePickaxe, "pickaxe", InfiMaterialEnum.Bronze.getHarvestLevel());
			MinecraftForge.setToolClass(slimeBronzePickaxe, "pickaxe", InfiMaterialEnum.Bronze.getHarvestLevel());
			MinecraftForge.setToolClass(cactusBronzePickaxe, "pickaxe", InfiMaterialEnum.Bronze.getHarvestLevel());
			MinecraftForge.setToolClass(flintBronzePickaxe, "pickaxe", InfiMaterialEnum.Bronze.getHarvestLevel());
			MinecraftForge.setToolClass(copperBronzePickaxe, "pickaxe", InfiMaterialEnum.Bronze.getHarvestLevel());
			MinecraftForge.setToolClass(bronzeBronzePickaxe, "pickaxe", InfiMaterialEnum.Bronze.getHarvestLevel());
		}

		if (PHInfiTools.enableWorkedIronTools)
		{
			woodWorkedIronPickaxe = new InfiToolPickaxe(PHInfiTools.workedIronPickaxeID + 0, InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Wood, "woodWorkedIronPickaxe");
			stoneWorkedIronPickaxe = new InfiToolPickaxe(PHInfiTools.workedIronPickaxeID + 1, InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Stone, "stoneWorkedIronPickaxe");
			ironWorkedIronPickaxe = new InfiToolPickaxe(PHInfiTools.workedIronPickaxeID + 2, InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Iron, "ironWorkedIronPickaxe");
			diamondWorkedIronPickaxe = new InfiToolPickaxe(PHInfiTools.workedIronPickaxeID + 3, InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Diamond, "diamondWorkedIronPickaxe");
			redstoneWorkedIronPickaxe = new InfiToolPickaxe(PHInfiTools.workedIronPickaxeID + 4, InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Redstone, "redstoneWorkedIronPickaxe");
			obsidianWorkedIronPickaxe = new InfiToolPickaxe(PHInfiTools.workedIronPickaxeID + 5, InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Obsidian, "obsidianWorkedIronPickaxe");
			boneWorkedIronPickaxe = new InfiToolPickaxe(PHInfiTools.workedIronPickaxeID + 6, InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Bone, "boneWorkedIronPickaxe");
			netherrackWorkedIronPickaxe = new InfiToolPickaxe(PHInfiTools.workedIronPickaxeID + 7, InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Netherrack, "netherrackWorkedIronPickaxe");
			glowstoneWorkedIronPickaxe = new InfiToolPickaxe(PHInfiTools.workedIronPickaxeID + 8, InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Glowstone, "glowstoneWorkedIronPickaxe");
			iceWorkedIronPickaxe = new InfiToolPickaxe(PHInfiTools.workedIronPickaxeID + 9, InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Ice, "iceWorkedIronPickaxe");
			slimeWorkedIronPickaxe = new InfiToolPickaxe(PHInfiTools.workedIronPickaxeID + 10, InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Slime, "slimeWorkedIronPickaxe");
			cactusWorkedIronPickaxe = new InfiToolPickaxe(PHInfiTools.workedIronPickaxeID + 11, InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Cactus, "cactusWorkedIronPickaxe");
			blazeWorkedIronPickaxe = new InfiToolPickaxe(PHInfiTools.workedIronPickaxeID + 12, InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Blaze, "blazeWorkedIronPickaxe");
			copperWorkedIronPickaxe = new InfiToolPickaxe(PHInfiTools.workedIronPickaxeID + 13, InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Copper, "copperWorkedIronPickaxe");
			bronzeWorkedIronPickaxe = new InfiToolPickaxe(PHInfiTools.workedIronPickaxeID + 14, InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Bronze, "bronzeWorkedIronPickaxe");
			workedWorkedIronPickaxe = new InfiToolPickaxe(PHInfiTools.workedIronPickaxeID + 15, InfiMaterialEnum.WorkedIron, InfiMaterialEnum.WorkedIron, "workedWorkedIronPickaxe");
			steelWorkedIronPickaxe = new InfiToolPickaxe(PHInfiTools.workedIronPickaxeID + 16, InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Steel, "steelWorkedIronPickaxe");
			uraniumWorkedIronPickaxe = new InfiToolPickaxe(PHInfiTools.workedIronPickaxeID + 17, InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Uranium, "uraniumWorkedIronPickaxe");

			MinecraftForge.setToolClass(woodWorkedIronPickaxe, "pickaxe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
			MinecraftForge.setToolClass(stoneWorkedIronPickaxe, "pickaxe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
			MinecraftForge.setToolClass(ironWorkedIronPickaxe, "pickaxe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
			MinecraftForge.setToolClass(diamondWorkedIronPickaxe, "pickaxe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
			MinecraftForge.setToolClass(redstoneWorkedIronPickaxe, "pickaxe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
			MinecraftForge.setToolClass(obsidianWorkedIronPickaxe, "pickaxe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
			MinecraftForge.setToolClass(boneWorkedIronPickaxe, "pickaxe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
			MinecraftForge.setToolClass(netherrackWorkedIronPickaxe, "pickaxe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
			MinecraftForge.setToolClass(glowstoneWorkedIronPickaxe, "pickaxe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
			MinecraftForge.setToolClass(iceWorkedIronPickaxe, "pickaxe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
			MinecraftForge.setToolClass(slimeWorkedIronPickaxe, "pickaxe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
			MinecraftForge.setToolClass(cactusWorkedIronPickaxe, "pickaxe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
			MinecraftForge.setToolClass(blazeWorkedIronPickaxe, "pickaxe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
			MinecraftForge.setToolClass(copperWorkedIronPickaxe, "pickaxe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
			MinecraftForge.setToolClass(bronzeWorkedIronPickaxe, "pickaxe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
			MinecraftForge.setToolClass(workedWorkedIronPickaxe, "pickaxe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
			MinecraftForge.setToolClass(steelWorkedIronPickaxe, "pickaxe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
			MinecraftForge.setToolClass(uraniumWorkedIronPickaxe, "pickaxe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
		}

		if (PHInfiTools.enableSteelTools)
		{
			woodSteelPickaxe = new InfiToolPickaxe(PHInfiTools.steelPickaxeID + 0, InfiMaterialEnum.Steel, InfiMaterialEnum.Wood, "woodSteelPickaxe");
			stoneSteelPickaxe = new InfiToolPickaxe(PHInfiTools.steelPickaxeID + 1, InfiMaterialEnum.Steel, InfiMaterialEnum.Stone, "stoneSteelPickaxe");
			ironSteelPickaxe = new InfiToolPickaxe(PHInfiTools.steelPickaxeID + 2, InfiMaterialEnum.Steel, InfiMaterialEnum.Iron, "ironSteelPickaxe");
			diamondSteelPickaxe = new InfiToolPickaxe(PHInfiTools.steelPickaxeID + 3, InfiMaterialEnum.Steel, InfiMaterialEnum.Diamond, "diamondSteelPickaxe");
			redstoneSteelPickaxe = new InfiToolPickaxe(PHInfiTools.steelPickaxeID + 4, InfiMaterialEnum.Steel, InfiMaterialEnum.Redstone, "redstoneSteelPickaxe");
			obsidianSteelPickaxe = new InfiToolPickaxe(PHInfiTools.steelPickaxeID + 5, InfiMaterialEnum.Steel, InfiMaterialEnum.Obsidian, "obsidianSteelPickaxe");
			boneSteelPickaxe = new InfiToolPickaxe(PHInfiTools.steelPickaxeID + 6, InfiMaterialEnum.Steel, InfiMaterialEnum.Bone, "boneSteelPickaxe");
			netherrackSteelPickaxe = new InfiToolPickaxe(PHInfiTools.steelPickaxeID + 7, InfiMaterialEnum.Steel, InfiMaterialEnum.Netherrack, "netherrackSteelPickaxe");
			glowstoneSteelPickaxe = new InfiToolPickaxe(PHInfiTools.steelPickaxeID + 8, InfiMaterialEnum.Steel, InfiMaterialEnum.Glowstone, "glowstoneSteelPickaxe");
			iceSteelPickaxe = new InfiToolPickaxe(PHInfiTools.steelPickaxeID + 9, InfiMaterialEnum.Steel, InfiMaterialEnum.Ice, "iceSteelPickaxe");
			slimeSteelPickaxe = new InfiToolPickaxe(PHInfiTools.steelPickaxeID + 10, InfiMaterialEnum.Steel, InfiMaterialEnum.Slime, "slimeSteelPickaxe");
			cactusSteelPickaxe = new InfiToolPickaxe(PHInfiTools.steelPickaxeID + 11, InfiMaterialEnum.Steel, InfiMaterialEnum.Cactus, "cactusSteelPickaxe");
			blazeSteelPickaxe = new InfiToolPickaxe(PHInfiTools.steelPickaxeID + 12, InfiMaterialEnum.Steel, InfiMaterialEnum.Blaze, "blazeSteelPickaxe");
			copperSteelPickaxe = new InfiToolPickaxe(PHInfiTools.steelPickaxeID + 13, InfiMaterialEnum.Steel, InfiMaterialEnum.Copper, "copperSteelPickaxe");
			bronzeSteelPickaxe = new InfiToolPickaxe(PHInfiTools.steelPickaxeID + 14, InfiMaterialEnum.Steel, InfiMaterialEnum.Bronze, "bronzeSteelPickaxe");
			workedSteelPickaxe = new InfiToolPickaxe(PHInfiTools.steelPickaxeID + 15, InfiMaterialEnum.Steel, InfiMaterialEnum.WorkedIron, "workedSteelPickaxe");
			steelSteelPickaxe = new InfiToolPickaxe(PHInfiTools.steelPickaxeID + 16, InfiMaterialEnum.Steel, InfiMaterialEnum.Steel, "steelSteelPickaxe");
			cobaltSteelPickaxe = new InfiToolPickaxe(PHInfiTools.steelPickaxeID + 17, InfiMaterialEnum.Steel, InfiMaterialEnum.Cobalt, "cobaltSteelPickaxe");
			arditeSteelPickaxe = new InfiToolPickaxe(PHInfiTools.steelPickaxeID + 18, InfiMaterialEnum.Steel, InfiMaterialEnum.Ardite, "arditeSteelPickaxe");
			uraniumSteelPickaxe = new InfiToolPickaxe(PHInfiTools.steelPickaxeID + 19, InfiMaterialEnum.Steel, InfiMaterialEnum.Uranium, "uraniumSteelPickaxe");

			MinecraftForge.setToolClass(woodSteelPickaxe, "pickaxe", InfiMaterialEnum.Steel.getHarvestLevel());
			MinecraftForge.setToolClass(stoneSteelPickaxe, "pickaxe", InfiMaterialEnum.Steel.getHarvestLevel());
			MinecraftForge.setToolClass(ironSteelPickaxe, "pickaxe", InfiMaterialEnum.Steel.getHarvestLevel());
			MinecraftForge.setToolClass(diamondSteelPickaxe, "pickaxe", InfiMaterialEnum.Steel.getHarvestLevel());
			MinecraftForge.setToolClass(redstoneSteelPickaxe, "pickaxe", InfiMaterialEnum.Steel.getHarvestLevel());
			MinecraftForge.setToolClass(obsidianSteelPickaxe, "pickaxe", InfiMaterialEnum.Steel.getHarvestLevel());
			MinecraftForge.setToolClass(boneSteelPickaxe, "pickaxe", InfiMaterialEnum.Steel.getHarvestLevel());
			MinecraftForge.setToolClass(netherrackSteelPickaxe, "pickaxe", InfiMaterialEnum.Steel.getHarvestLevel());
			MinecraftForge.setToolClass(glowstoneSteelPickaxe, "pickaxe", InfiMaterialEnum.Steel.getHarvestLevel());
			MinecraftForge.setToolClass(iceSteelPickaxe, "pickaxe", InfiMaterialEnum.Steel.getHarvestLevel());
			MinecraftForge.setToolClass(slimeSteelPickaxe, "pickaxe", InfiMaterialEnum.Steel.getHarvestLevel());
			MinecraftForge.setToolClass(cactusSteelPickaxe, "pickaxe", InfiMaterialEnum.Steel.getHarvestLevel());
			MinecraftForge.setToolClass(blazeSteelPickaxe, "pickaxe", InfiMaterialEnum.Steel.getHarvestLevel());
			MinecraftForge.setToolClass(copperSteelPickaxe, "pickaxe", InfiMaterialEnum.Steel.getHarvestLevel());
			MinecraftForge.setToolClass(bronzeSteelPickaxe, "pickaxe", InfiMaterialEnum.Steel.getHarvestLevel());
			MinecraftForge.setToolClass(workedSteelPickaxe, "pickaxe", InfiMaterialEnum.Steel.getHarvestLevel());
			MinecraftForge.setToolClass(steelSteelPickaxe, "pickaxe", InfiMaterialEnum.Steel.getHarvestLevel());
			MinecraftForge.setToolClass(cobaltSteelPickaxe, "pickaxe", InfiMaterialEnum.Steel.getHarvestLevel());
			MinecraftForge.setToolClass(arditeSteelPickaxe, "pickaxe", InfiMaterialEnum.Steel.getHarvestLevel());
			MinecraftForge.setToolClass(uraniumSteelPickaxe, "pickaxe", InfiMaterialEnum.Steel.getHarvestLevel());
		}

		if (PHInfiTools.enableCobaltTools)
		{
			woodCobaltPickaxe = new InfiToolPickaxe(PHInfiTools.cobaltPickaxeID + 0, InfiMaterialEnum.Cobalt, InfiMaterialEnum.Wood, "woodCobaltPickaxe");
			stoneCobaltPickaxe = new InfiToolPickaxe(PHInfiTools.cobaltPickaxeID + 1, InfiMaterialEnum.Cobalt, InfiMaterialEnum.Stone, "stoneCobaltPickaxe");
			ironCobaltPickaxe = new InfiToolPickaxe(PHInfiTools.cobaltPickaxeID + 2, InfiMaterialEnum.Cobalt, InfiMaterialEnum.Iron, "ironCobaltPickaxe");
			diamondCobaltPickaxe = new InfiToolPickaxe(PHInfiTools.cobaltPickaxeID + 3, InfiMaterialEnum.Cobalt, InfiMaterialEnum.Diamond, "diamondCobaltPickaxe");
			redstoneCobaltPickaxe = new InfiToolPickaxe(PHInfiTools.cobaltPickaxeID + 4, InfiMaterialEnum.Cobalt, InfiMaterialEnum.Redstone, "redstoneCobaltPickaxe");
			obsidianCobaltPickaxe = new InfiToolPickaxe(PHInfiTools.cobaltPickaxeID + 5, InfiMaterialEnum.Cobalt, InfiMaterialEnum.Obsidian, "obsidianCobaltPickaxe");
			boneCobaltPickaxe = new InfiToolPickaxe(PHInfiTools.cobaltPickaxeID + 6, InfiMaterialEnum.Cobalt, InfiMaterialEnum.Bone, "boneCobaltPickaxe");
			slimeCobaltPickaxe = new InfiToolPickaxe(PHInfiTools.cobaltPickaxeID + 7, InfiMaterialEnum.Cobalt, InfiMaterialEnum.Slime, "slimeCobaltPickaxe");
			cactusCobaltPickaxe = new InfiToolPickaxe(PHInfiTools.cobaltPickaxeID + 8, InfiMaterialEnum.Cobalt, InfiMaterialEnum.Cactus, "cactusCobaltPickaxe");
			blazeCobaltPickaxe = new InfiToolPickaxe(PHInfiTools.cobaltPickaxeID + 9, InfiMaterialEnum.Cobalt, InfiMaterialEnum.Blaze, "blazeCobaltPickaxe");
			copperCobaltPickaxe = new InfiToolPickaxe(PHInfiTools.cobaltPickaxeID + 10, InfiMaterialEnum.Cobalt, InfiMaterialEnum.Copper, "copperCobaltPickaxe");
			bronzeCobaltPickaxe = new InfiToolPickaxe(PHInfiTools.cobaltPickaxeID + 11, InfiMaterialEnum.Cobalt, InfiMaterialEnum.Bronze, "bronzeCobaltPickaxe");
			workedCobaltPickaxe = new InfiToolPickaxe(PHInfiTools.cobaltPickaxeID + 12, InfiMaterialEnum.Cobalt, InfiMaterialEnum.WorkedIron, "workedCobaltPickaxe");
			steelCobaltPickaxe = new InfiToolPickaxe(PHInfiTools.cobaltPickaxeID + 13, InfiMaterialEnum.Cobalt, InfiMaterialEnum.Steel, "steelCobaltPickaxe");
			cobaltCobaltPickaxe = new InfiToolPickaxe(PHInfiTools.cobaltPickaxeID + 14, InfiMaterialEnum.Cobalt, InfiMaterialEnum.Cobalt, "cobaltCobaltPickaxe");
			arditeCobaltPickaxe = new InfiToolPickaxe(PHInfiTools.cobaltPickaxeID + 15, InfiMaterialEnum.Cobalt, InfiMaterialEnum.Ardite, "arditeCobaltPickaxe");
			manyullynCobaltPickaxe = new InfiToolPickaxe(PHInfiTools.cobaltPickaxeID + 16, InfiMaterialEnum.Cobalt, InfiMaterialEnum.Manyullyn, "manyullynCobaltPickaxe");
			uraniumCobaltPickaxe = new InfiToolPickaxe(PHInfiTools.cobaltPickaxeID + 17, InfiMaterialEnum.Cobalt, InfiMaterialEnum.Uranium, "uraniumCobaltPickaxe");

			MinecraftForge.setToolClass(woodCobaltPickaxe, "pickaxe", InfiMaterialEnum.Cobalt.getHarvestLevel());
			MinecraftForge.setToolClass(stoneCobaltPickaxe, "pickaxe", InfiMaterialEnum.Cobalt.getHarvestLevel());
			MinecraftForge.setToolClass(ironCobaltPickaxe, "pickaxe", InfiMaterialEnum.Cobalt.getHarvestLevel());
			MinecraftForge.setToolClass(diamondCobaltPickaxe, "pickaxe", InfiMaterialEnum.Cobalt.getHarvestLevel());
			MinecraftForge.setToolClass(redstoneCobaltPickaxe, "pickaxe", InfiMaterialEnum.Cobalt.getHarvestLevel());
			MinecraftForge.setToolClass(obsidianCobaltPickaxe, "pickaxe", InfiMaterialEnum.Cobalt.getHarvestLevel());
			MinecraftForge.setToolClass(boneCobaltPickaxe, "pickaxe", InfiMaterialEnum.Cobalt.getHarvestLevel());
			MinecraftForge.setToolClass(slimeCobaltPickaxe, "pickaxe", InfiMaterialEnum.Cobalt.getHarvestLevel());
			MinecraftForge.setToolClass(cactusCobaltPickaxe, "pickaxe", InfiMaterialEnum.Cobalt.getHarvestLevel());
			MinecraftForge.setToolClass(blazeCobaltPickaxe, "pickaxe", InfiMaterialEnum.Cobalt.getHarvestLevel());
			MinecraftForge.setToolClass(copperCobaltPickaxe, "pickaxe", InfiMaterialEnum.Cobalt.getHarvestLevel());
			MinecraftForge.setToolClass(bronzeCobaltPickaxe, "pickaxe", InfiMaterialEnum.Cobalt.getHarvestLevel());
			MinecraftForge.setToolClass(workedCobaltPickaxe, "pickaxe", InfiMaterialEnum.Cobalt.getHarvestLevel());
			MinecraftForge.setToolClass(steelCobaltPickaxe, "pickaxe", InfiMaterialEnum.Cobalt.getHarvestLevel());
			MinecraftForge.setToolClass(cobaltCobaltPickaxe, "pickaxe", InfiMaterialEnum.Cobalt.getHarvestLevel());
			MinecraftForge.setToolClass(arditeCobaltPickaxe, "pickaxe", InfiMaterialEnum.Cobalt.getHarvestLevel());
			MinecraftForge.setToolClass(manyullynCobaltPickaxe, "pickaxe", InfiMaterialEnum.Cobalt.getHarvestLevel());
			MinecraftForge.setToolClass(uraniumCobaltPickaxe, "pickaxe", InfiMaterialEnum.Cobalt.getHarvestLevel());
		}

		if (PHInfiTools.enableArditeTools)
		{
			woodArditePickaxe = new InfiToolPickaxe(PHInfiTools.arditePickaxeID + 0, InfiMaterialEnum.Ardite, InfiMaterialEnum.Wood, "woodArditePickaxe");
			stoneArditePickaxe = new InfiToolPickaxe(PHInfiTools.arditePickaxeID + 1, InfiMaterialEnum.Ardite, InfiMaterialEnum.Stone, "stoneArditePickaxe");
			ironArditePickaxe = new InfiToolPickaxe(PHInfiTools.arditePickaxeID + 2, InfiMaterialEnum.Ardite, InfiMaterialEnum.Iron, "ironArditePickaxe");
			diamondArditePickaxe = new InfiToolPickaxe(PHInfiTools.arditePickaxeID + 3, InfiMaterialEnum.Ardite, InfiMaterialEnum.Diamond, "diamondArditePickaxe");
			redstoneArditePickaxe = new InfiToolPickaxe(PHInfiTools.arditePickaxeID + 4, InfiMaterialEnum.Ardite, InfiMaterialEnum.Redstone, "redstoneArditePickaxe");
			obsidianArditePickaxe = new InfiToolPickaxe(PHInfiTools.arditePickaxeID + 5, InfiMaterialEnum.Ardite, InfiMaterialEnum.Obsidian, "obsidianArditePickaxe");
			boneArditePickaxe = new InfiToolPickaxe(PHInfiTools.arditePickaxeID + 6, InfiMaterialEnum.Ardite, InfiMaterialEnum.Bone, "boneArditePickaxe");
			slimeArditePickaxe = new InfiToolPickaxe(PHInfiTools.arditePickaxeID + 7, InfiMaterialEnum.Ardite, InfiMaterialEnum.Slime, "slimeArditePickaxe");
			cactusArditePickaxe = new InfiToolPickaxe(PHInfiTools.arditePickaxeID + 8, InfiMaterialEnum.Ardite, InfiMaterialEnum.Cactus, "cactusArditePickaxe");
			blazeArditePickaxe = new InfiToolPickaxe(PHInfiTools.arditePickaxeID + 9, InfiMaterialEnum.Ardite, InfiMaterialEnum.Blaze, "blazeArditePickaxe");
			copperArditePickaxe = new InfiToolPickaxe(PHInfiTools.arditePickaxeID + 10, InfiMaterialEnum.Ardite, InfiMaterialEnum.Copper, "copperArditePickaxe");
			bronzeArditePickaxe = new InfiToolPickaxe(PHInfiTools.arditePickaxeID + 11, InfiMaterialEnum.Ardite, InfiMaterialEnum.Bronze, "bronzeArditePickaxe");
			workedArditePickaxe = new InfiToolPickaxe(PHInfiTools.arditePickaxeID + 12, InfiMaterialEnum.Ardite, InfiMaterialEnum.WorkedIron, "workedArditePickaxe");
			steelArditePickaxe = new InfiToolPickaxe(PHInfiTools.arditePickaxeID + 13, InfiMaterialEnum.Ardite, InfiMaterialEnum.Steel, "steelArditePickaxe");
			cobaltArditePickaxe = new InfiToolPickaxe(PHInfiTools.arditePickaxeID + 14, InfiMaterialEnum.Ardite, InfiMaterialEnum.Cobalt, "cobaltArditePickaxe");
			arditeArditePickaxe = new InfiToolPickaxe(PHInfiTools.arditePickaxeID + 15, InfiMaterialEnum.Ardite, InfiMaterialEnum.Ardite, "arditeArditePickaxe");
			manyullynArditePickaxe = new InfiToolPickaxe(PHInfiTools.arditePickaxeID + 16, InfiMaterialEnum.Ardite, InfiMaterialEnum.Manyullyn, "manyullynArditePickaxe");
			uraniumArditePickaxe = new InfiToolPickaxe(PHInfiTools.arditePickaxeID + 17, InfiMaterialEnum.Ardite, InfiMaterialEnum.Uranium, "uraniumArditePickaxe");

			MinecraftForge.setToolClass(woodArditePickaxe, "pickaxe", InfiMaterialEnum.Ardite.getHarvestLevel());
			MinecraftForge.setToolClass(stoneArditePickaxe, "pickaxe", InfiMaterialEnum.Ardite.getHarvestLevel());
			MinecraftForge.setToolClass(ironArditePickaxe, "pickaxe", InfiMaterialEnum.Ardite.getHarvestLevel());
			MinecraftForge.setToolClass(diamondArditePickaxe, "pickaxe", InfiMaterialEnum.Ardite.getHarvestLevel());
			MinecraftForge.setToolClass(redstoneArditePickaxe, "pickaxe", InfiMaterialEnum.Ardite.getHarvestLevel());
			MinecraftForge.setToolClass(obsidianArditePickaxe, "pickaxe", InfiMaterialEnum.Ardite.getHarvestLevel());
			MinecraftForge.setToolClass(boneArditePickaxe, "pickaxe", InfiMaterialEnum.Ardite.getHarvestLevel());
			MinecraftForge.setToolClass(slimeArditePickaxe, "pickaxe", InfiMaterialEnum.Ardite.getHarvestLevel());
			MinecraftForge.setToolClass(cactusArditePickaxe, "pickaxe", InfiMaterialEnum.Ardite.getHarvestLevel());
			MinecraftForge.setToolClass(blazeArditePickaxe, "pickaxe", InfiMaterialEnum.Ardite.getHarvestLevel());
			MinecraftForge.setToolClass(copperArditePickaxe, "pickaxe", InfiMaterialEnum.Ardite.getHarvestLevel());
			MinecraftForge.setToolClass(bronzeArditePickaxe, "pickaxe", InfiMaterialEnum.Ardite.getHarvestLevel());
			MinecraftForge.setToolClass(workedArditePickaxe, "pickaxe", InfiMaterialEnum.Ardite.getHarvestLevel());
			MinecraftForge.setToolClass(steelArditePickaxe, "pickaxe", InfiMaterialEnum.Ardite.getHarvestLevel());
			MinecraftForge.setToolClass(cobaltArditePickaxe, "pickaxe", InfiMaterialEnum.Ardite.getHarvestLevel());
			MinecraftForge.setToolClass(arditeArditePickaxe, "pickaxe", InfiMaterialEnum.Ardite.getHarvestLevel());
			MinecraftForge.setToolClass(manyullynArditePickaxe, "pickaxe", InfiMaterialEnum.Ardite.getHarvestLevel());
			MinecraftForge.setToolClass(uraniumArditePickaxe, "pickaxe", InfiMaterialEnum.Ardite.getHarvestLevel());
		}

		if (PHInfiTools.enableManyullynTools)
		{
			woodManyullynPickaxe = new InfiToolPickaxe(PHInfiTools.manyullynPickaxeID + 0, InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Wood, "woodManyullynPickaxe");
			stoneManyullynPickaxe = new InfiToolPickaxe(PHInfiTools.manyullynPickaxeID + 1, InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Stone, "stoneManyullynPickaxe");
			ironManyullynPickaxe = new InfiToolPickaxe(PHInfiTools.manyullynPickaxeID + 2, InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Iron, "ironManyullynPickaxe");
			diamondManyullynPickaxe = new InfiToolPickaxe(PHInfiTools.manyullynPickaxeID + 3, InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Diamond, "diamondManyullynPickaxe");
			redstoneManyullynPickaxe = new InfiToolPickaxe(PHInfiTools.manyullynPickaxeID + 4, InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Redstone, "redstoneManyullynPickaxe");
			obsidianManyullynPickaxe = new InfiToolPickaxe(PHInfiTools.manyullynPickaxeID + 5, InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Obsidian, "obsidianManyullynPickaxe");
			boneManyullynPickaxe = new InfiToolPickaxe(PHInfiTools.manyullynPickaxeID + 6, InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Bone, "boneManyullynPickaxe");
			slimeManyullynPickaxe = new InfiToolPickaxe(PHInfiTools.manyullynPickaxeID + 7, InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Slime, "slimeManyullynPickaxe");
			cactusManyullynPickaxe = new InfiToolPickaxe(PHInfiTools.manyullynPickaxeID + 8, InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Cactus, "cactusManyullynPickaxe");
			blazeManyullynPickaxe = new InfiToolPickaxe(PHInfiTools.manyullynPickaxeID + 9, InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Blaze, "blazeManyullynPickaxe");
			copperManyullynPickaxe = new InfiToolPickaxe(PHInfiTools.manyullynPickaxeID + 10, InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Copper, "copperManyullynPickaxe");
			bronzeManyullynPickaxe = new InfiToolPickaxe(PHInfiTools.manyullynPickaxeID + 11, InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Bronze, "bronzeManyullynPickaxe");
			workedManyullynPickaxe = new InfiToolPickaxe(PHInfiTools.manyullynPickaxeID + 12, InfiMaterialEnum.Manyullyn, InfiMaterialEnum.WorkedIron, "workedManyullynPickaxe");
			steelManyullynPickaxe = new InfiToolPickaxe(PHInfiTools.manyullynPickaxeID + 13, InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Steel, "steelManyullynPickaxe");
			cobaltManyullynPickaxe = new InfiToolPickaxe(PHInfiTools.manyullynPickaxeID + 14, InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Cobalt, "cobaltManyullynPickaxe");
			arditeManyullynPickaxe = new InfiToolPickaxe(PHInfiTools.manyullynPickaxeID + 15, InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Ardite, "arditeManyullynPickaxe");
			manyullynManyullynPickaxe = new InfiToolPickaxe(PHInfiTools.manyullynPickaxeID + 16, InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Manyullyn, "manyullynManyullynPickaxe");
			uraniumManyullynPickaxe = new InfiToolPickaxe(PHInfiTools.manyullynPickaxeID + 17, InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Uranium, "uraniumManyullynPickaxe");

			MinecraftForge.setToolClass(woodManyullynPickaxe, "pickaxe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
			MinecraftForge.setToolClass(stoneManyullynPickaxe, "pickaxe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
			MinecraftForge.setToolClass(ironManyullynPickaxe, "pickaxe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
			MinecraftForge.setToolClass(diamondManyullynPickaxe, "pickaxe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
			MinecraftForge.setToolClass(redstoneManyullynPickaxe, "pickaxe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
			MinecraftForge.setToolClass(obsidianManyullynPickaxe, "pickaxe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
			MinecraftForge.setToolClass(boneManyullynPickaxe, "pickaxe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
			MinecraftForge.setToolClass(slimeManyullynPickaxe, "pickaxe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
			MinecraftForge.setToolClass(cactusManyullynPickaxe, "pickaxe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
			MinecraftForge.setToolClass(blazeManyullynPickaxe, "pickaxe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
			MinecraftForge.setToolClass(copperManyullynPickaxe, "pickaxe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
			MinecraftForge.setToolClass(bronzeManyullynPickaxe, "pickaxe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
			MinecraftForge.setToolClass(workedManyullynPickaxe, "pickaxe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
			MinecraftForge.setToolClass(steelManyullynPickaxe, "pickaxe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
			MinecraftForge.setToolClass(cobaltManyullynPickaxe, "pickaxe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
			MinecraftForge.setToolClass(arditeManyullynPickaxe, "pickaxe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
			MinecraftForge.setToolClass(manyullynManyullynPickaxe, "pickaxe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
			MinecraftForge.setToolClass(uraniumManyullynPickaxe, "pickaxe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
		}

		if (PHInfiTools.enableUraniumTools)
		{
			diamondUraniumPickaxe = new InfiToolPickaxe(PHInfiTools.uraniumPickaxeID + 0, InfiMaterialEnum.Uranium, InfiMaterialEnum.Diamond, "diamondUraniumPickaxe");
			redstoneUraniumPickaxe = new InfiToolPickaxe(PHInfiTools.uraniumPickaxeID + 1, InfiMaterialEnum.Uranium, InfiMaterialEnum.Redstone, "redstoneUraniumPickaxe");
			boneUraniumPickaxe = new InfiToolPickaxe(PHInfiTools.uraniumPickaxeID + 2, InfiMaterialEnum.Uranium, InfiMaterialEnum.Bone, "boneUraniumPickaxe");
			netherrackUraniumPickaxe = new InfiToolPickaxe(PHInfiTools.uraniumPickaxeID + 3, InfiMaterialEnum.Uranium, InfiMaterialEnum.Netherrack, "netherrackUraniumPickaxe");
			glowstoneUraniumPickaxe = new InfiToolPickaxe(PHInfiTools.uraniumPickaxeID + 4, InfiMaterialEnum.Uranium, InfiMaterialEnum.Glowstone, "glowstoneUraniumPickaxe");
			lavaUraniumPickaxe = new InfiToolPickaxe(PHInfiTools.uraniumPickaxeID + 5, InfiMaterialEnum.Uranium, InfiMaterialEnum.Lava, "lavaUraniumPickaxe");
			blazeUraniumPickaxe = new InfiToolPickaxe(PHInfiTools.uraniumPickaxeID + 6, InfiMaterialEnum.Uranium, InfiMaterialEnum.Blaze, "blazeUraniumPickaxe");
			cobaltUraniumPickaxe = new InfiToolPickaxe(PHInfiTools.uraniumPickaxeID + 7, InfiMaterialEnum.Uranium, InfiMaterialEnum.Cobalt, "cobaltUraniumPickaxe");
			arditeUraniumPickaxe = new InfiToolPickaxe(PHInfiTools.uraniumPickaxeID + 8, InfiMaterialEnum.Uranium, InfiMaterialEnum.Ardite, "arditeUraniumPickaxe");
			uraniumUraniumPickaxe = new InfiToolPickaxe(PHInfiTools.uraniumPickaxeID + 9, InfiMaterialEnum.Uranium, InfiMaterialEnum.Uranium, "uraniumUraniumPickaxe");

			MinecraftForge.setToolClass(diamondUraniumPickaxe, "pickaxe", InfiMaterialEnum.Uranium.getHarvestLevel());
			MinecraftForge.setToolClass(redstoneUraniumPickaxe, "pickaxe", InfiMaterialEnum.Uranium.getHarvestLevel());
			MinecraftForge.setToolClass(boneUraniumPickaxe, "pickaxe", InfiMaterialEnum.Uranium.getHarvestLevel());
			MinecraftForge.setToolClass(netherrackUraniumPickaxe, "pickaxe", InfiMaterialEnum.Uranium.getHarvestLevel());
			MinecraftForge.setToolClass(glowstoneUraniumPickaxe, "pickaxe", InfiMaterialEnum.Uranium.getHarvestLevel());
			MinecraftForge.setToolClass(lavaUraniumPickaxe, "pickaxe", InfiMaterialEnum.Uranium.getHarvestLevel());
			MinecraftForge.setToolClass(blazeUraniumPickaxe, "pickaxe", InfiMaterialEnum.Uranium.getHarvestLevel());
			MinecraftForge.setToolClass(cobaltUraniumPickaxe, "pickaxe", InfiMaterialEnum.Uranium.getHarvestLevel());
			MinecraftForge.setToolClass(arditeUraniumPickaxe, "pickaxe", InfiMaterialEnum.Uranium.getHarvestLevel());
			MinecraftForge.setToolClass(uraniumUraniumPickaxe, "pickaxe", InfiMaterialEnum.Uranium.getHarvestLevel());
		}
	}

	private static void addNames()
	{
		if (PHInfiTools.enableWoodTools && PHInfiTools.overwriteVanillaTools)
			LanguageRegistry.instance().addName(woodWoodPickaxe, "Wooden Pickaxe");
		if (PHInfiTools.enableStoneTools)
			LanguageRegistry.instance().addName(stoneStonePickaxe, "Heavy Pickaxe");
		if (PHInfiTools.enableIronTools)
			LanguageRegistry.instance().addName(ironIronPickaxe, "Ironic Pickaxe");
		if (PHInfiTools.enableDiamondTools)
			LanguageRegistry.instance().addName(diamondDiamondPickaxe, "Diamondium Pickaxe");
		if (PHInfiTools.enableRedstoneTools)
			LanguageRegistry.instance().addName(redstoneRedstonePickaxe, "Redredred Pickaxe");
		if (PHInfiTools.enableObsidianTools)
			LanguageRegistry.instance().addName(obsidianObsidianPickaxe, "Ebony Pickaxe");
		if (PHInfiTools.enableSandstoneTools)
			LanguageRegistry.instance().addName(sandstoneSandstonePickaxe, "Fragile Pickaxe");
		if (PHInfiTools.enableNetherrackTools)
			LanguageRegistry.instance().addName(boneBonePickaxe, "Necrotic Pickaxe");
		if (PHInfiTools.enablePaperTools)
			LanguageRegistry.instance().addName(paperPaperPickaxe, "Soft Pickaxe");
		if (PHInfiTools.enableMossyTools)
			LanguageRegistry.instance().addName(mossyMossyPickaxe, "Living Pickaxe");
		if (PHInfiTools.enableNetherrackTools)
			LanguageRegistry.instance().addName(netherrackNetherrackPickaxe, "Bloodsoaked Pickaxe");
		if (PHInfiTools.enableGlowstoneTools)
			LanguageRegistry.instance().addName(glowstoneGlowstonePickaxe, "Bright Pickaxe");
		if (PHInfiTools.enableIceTools)
			LanguageRegistry.instance().addName(iceIcePickaxe, "Freezing Pickaxe");
		if (PHInfiTools.enableLavaTools)
			LanguageRegistry.instance().addName(lavaLavaPickaxe, "Burning Pickaxe");
		if (PHInfiTools.enableSlimeTools)
			LanguageRegistry.instance().addName(slimeSlimePickaxe, "Toy Pickaxe");
		if (PHInfiTools.enableCactusTools)
			LanguageRegistry.instance().addName(cactusCactusPickaxe, "Thorned Pickaxe");
		if (PHInfiTools.enableFlintTools)
			LanguageRegistry.instance().addName(flintFlintPickaxe, "Rough-hewn Pickaxe");
		if (PHInfiTools.enableBlazeTools)
			LanguageRegistry.instance().addName(blazeBlazePickaxe, "Netherite Pickaxe");
		if (PHInfiTools.enableCopperTools)
			LanguageRegistry.instance().addName(copperCopperPickaxe, "Orange-Tang Pickaxe");
		if (PHInfiTools.enableBronzeTools)
			LanguageRegistry.instance().addName(bronzeBronzePickaxe, "Polished Pickaxe");
		if (PHInfiTools.enableWorkedIronTools)
			LanguageRegistry.instance().addName(workedWorkedIronPickaxe, "Reworked Iron Pickaxe");
		if (PHInfiTools.enableSteelTools)
			LanguageRegistry.instance().addName(steelSteelPickaxe, "Forge-Wrought Pickaxe");
		if (PHInfiTools.enableCobaltTools)
			LanguageRegistry.instance().addName(cobaltCobaltPickaxe, "Beautiful Pickaxe");
		if (PHInfiTools.enableArditeTools)
			LanguageRegistry.instance().addName(arditeArditePickaxe, "Rustic Pickaxe");
		if (PHInfiTools.enableManyullynTools)
			LanguageRegistry.instance().addName(manyullynManyullynPickaxe, "False-Prophetic Pickaxe");
		if (PHInfiTools.enableUraniumTools)
			LanguageRegistry.instance().addName(uraniumUraniumPickaxe, "Cancerous Pickaxe");
	}

	public static void registerInfiToolsRecipes()
	{
		if (PHInfiTools.enableWoodTools)
		{
			if (PHInfiTools.overwriteVanillaTools)
				GameRegistry.addRecipe(new ItemStack(woodWoodPickaxe), recipe, '#', Block.planks, '|', Item.stick);
			GameRegistry.addRecipe(new ItemStack(sandstoneWoodPickaxe), recipe, '#', Block.planks, '|', InfiLibrary.sandstoneRod );
			GameRegistry.addRecipe(new ItemStack(boneWoodPickaxe), recipe, '#', Block.planks, '|', Item.bone );
			GameRegistry.addRecipe(new ItemStack(boneWoodPickaxe), recipe, '#', Block.planks, '|', InfiLibrary.boneRod );
			GameRegistry.addRecipe(new ItemStack(paperWoodPickaxe), recipe, '#', Block.planks, '|', InfiLibrary.paperRod );
			GameRegistry.addRecipe(new ItemStack(iceWoodPickaxe), recipe, '#', Block.planks, '|', InfiLibrary.iceRod );
			GameRegistry.addRecipe(new ItemStack(slimeWoodPickaxe), recipe, '#', Block.planks, '|', InfiLibrary.slimeRod );
			GameRegistry.addRecipe(new ItemStack(cactusWoodPickaxe), recipe, '#', Block.planks, '|', InfiLibrary.cactusRod );
		}

		if (PHInfiTools.enableStoneTools)
		{
			if (PHInfiTools.overwriteVanillaTools)
				GameRegistry.addRecipe(new ItemStack(woodStonePickaxe), recipe, '#', Block.cobblestone, '|', Item.stick);
			GameRegistry.addRecipe(new ItemStack(stoneStonePickaxe), recipe, '#', Block.cobblestone, '|', InfiLibrary.stoneRod );
			GameRegistry.addRecipe(new ItemStack(sandstoneStonePickaxe), recipe, '#', Block.cobblestone, '|', InfiLibrary.sandstoneRod );
			GameRegistry.addRecipe(new ItemStack(boneStonePickaxe), recipe, '#', Block.cobblestone, '|', Item.bone );
			GameRegistry.addRecipe(new ItemStack(boneStonePickaxe), recipe, '#', Block.cobblestone, '|', InfiLibrary.boneRod );
			GameRegistry.addRecipe(new ItemStack(netherrackStonePickaxe), recipe, '#', Block.cobblestone, '|', InfiLibrary.netherrackRod );
			GameRegistry.addRecipe(new ItemStack(iceStonePickaxe), recipe, '#', Block.cobblestone, '|', InfiLibrary.iceRod );
			GameRegistry.addRecipe(new ItemStack(slimeStonePickaxe), recipe, '#', Block.cobblestone, '|', InfiLibrary.slimeRod );
			GameRegistry.addRecipe(new ItemStack(cactusStonePickaxe), recipe, '#', Block.cobblestone, '|', InfiLibrary.cactusRod );
			GameRegistry.addRecipe(new ItemStack(flintStonePickaxe), recipe, '#', Block.cobblestone, '|', InfiLibrary.flintRod );

			if (PHInfiTools.overwriteVanillaTools)
				GameRegistry.addRecipe(new ItemStack(woodStonePickaxe), recipe, '#', Block.stone, '|', Item.stick);
			GameRegistry.addRecipe(new ItemStack(stoneStonePickaxe), recipe, '#', Block.stone, '|', InfiLibrary.stoneRod );
			GameRegistry.addRecipe(new ItemStack(sandstoneStonePickaxe), recipe, '#', Block.stone, '|', InfiLibrary.sandstoneRod );
			GameRegistry.addRecipe(new ItemStack(boneStonePickaxe), recipe, '#', Block.stone, '|', Item.bone );
			GameRegistry.addRecipe(new ItemStack(boneStonePickaxe), recipe, '#', Block.stone, '|', InfiLibrary.boneRod );
			GameRegistry.addRecipe(new ItemStack(netherrackStonePickaxe), recipe, '#', Block.stone, '|', InfiLibrary.netherrackRod );
			GameRegistry.addRecipe(new ItemStack(iceStonePickaxe), recipe, '#', Block.stone, '|', InfiLibrary.iceRod );
			GameRegistry.addRecipe(new ItemStack(slimeStonePickaxe), recipe, '#', Block.stone, '|', InfiLibrary.slimeRod );
			GameRegistry.addRecipe(new ItemStack(cactusStonePickaxe), recipe, '#', Block.stone, '|', InfiLibrary.cactusRod );
			GameRegistry.addRecipe(new ItemStack(flintStonePickaxe), recipe, '#', Block.stone, '|', InfiLibrary.flintRod );
		}

		if (PHInfiTools.enableIronTools)
		{
			if (PHInfiTools.overwriteVanillaTools)
				GameRegistry.addRecipe(new ItemStack(woodIronPickaxe), recipe, '#', Item.ingotIron, '|', Item.stick);
			GameRegistry.addRecipe(new ItemStack(stoneIronPickaxe), recipe, '#', Item.ingotIron, '|', InfiLibrary.stoneRod );
			GameRegistry.addRecipe(new ItemStack(ironIronPickaxe), recipe, '#', Item.ingotIron, '|', InfiLibrary.ironRod );
			GameRegistry.addRecipe(new ItemStack(boneIronPickaxe), recipe, '#', Item.ingotIron, '|', Item.bone );
			GameRegistry.addRecipe(new ItemStack(boneIronPickaxe), recipe, '#', Item.ingotIron, '|', InfiLibrary.boneRod );
			GameRegistry.addRecipe(new ItemStack(netherrackIronPickaxe), recipe, '#', Item.ingotIron, '|', InfiLibrary.netherrackRod );
			GameRegistry.addRecipe(new ItemStack(glowstoneIronPickaxe), recipe, '#', Item.ingotIron, '|', InfiLibrary.glowstoneRod );
			GameRegistry.addRecipe(new ItemStack(cactusIronPickaxe), recipe, '#', Item.ingotIron, '|', InfiLibrary.cactusRod );
			GameRegistry.addRecipe(new ItemStack(copperIronPickaxe), recipe, '#', Item.ingotIron, '|', InfiLibrary.copperRod );
			GameRegistry.addRecipe(new ItemStack(bronzeIronPickaxe), recipe, '#', Item.ingotIron, '|', InfiLibrary.bronzeRod );
		}

		if (PHInfiTools.enableDiamondTools)
		{
			if (PHInfiTools.overwriteVanillaTools)
				GameRegistry.addRecipe(new ItemStack(woodDiamondPickaxe), recipe, '#', Item.diamond, '|', Item.stick);
			GameRegistry.addRecipe(new ItemStack(stoneDiamondPickaxe), recipe, '#', Item.diamond, '|', InfiLibrary.stoneRod );
			GameRegistry.addRecipe(new ItemStack(ironDiamondPickaxe), recipe, '#', Item.diamond, '|', InfiLibrary.ironRod );
			GameRegistry.addRecipe(new ItemStack(diamondDiamondPickaxe), recipe, '#', Item.diamond, '|', InfiLibrary.diamondRod );
			GameRegistry.addRecipe(new ItemStack(redstoneDiamondPickaxe), recipe, '#', Item.diamond, '|', InfiLibrary.redstoneRod );
			GameRegistry.addRecipe(new ItemStack(obsidianDiamondPickaxe), recipe, '#', Item.diamond, '|', InfiLibrary.obsidianRod );
			GameRegistry.addRecipe(new ItemStack(boneDiamondPickaxe), recipe, '#', Item.diamond, '|', Item.bone );
			GameRegistry.addRecipe(new ItemStack(boneDiamondPickaxe), recipe, '#', Item.diamond, '|', InfiLibrary.boneRod );
			GameRegistry.addRecipe(new ItemStack(mossyDiamondPickaxe), recipe, '#', Item.diamond, '|', InfiLibrary.mossyRod );
			GameRegistry.addRecipe(new ItemStack(netherrackDiamondPickaxe), recipe, '#', Item.diamond, '|', InfiLibrary.netherrackRod );
			GameRegistry.addRecipe(new ItemStack(glowstoneDiamondPickaxe), recipe, '#', Item.diamond, '|', InfiLibrary.glowstoneRod );
			GameRegistry.addRecipe(new ItemStack(lavaDiamondPickaxe), recipe, '#', Item.diamond, '|', InfiLibrary.lavaRod );
			GameRegistry.addRecipe(new ItemStack(cactusDiamondPickaxe), recipe, '#', Item.diamond, '|', InfiLibrary.cactusRod );
			GameRegistry.addRecipe(new ItemStack(flintDiamondPickaxe), recipe, '#', Item.diamond, '|', InfiLibrary.flintRod );
			GameRegistry.addRecipe(new ItemStack(blazeDiamondPickaxe), recipe, '#', Item.diamond, '|', Item.blazeRod );
			GameRegistry.addRecipe(new ItemStack(copperDiamondPickaxe), recipe, '#', Item.diamond, '|', InfiLibrary.copperRod );
			GameRegistry.addRecipe(new ItemStack(bronzeDiamondPickaxe), recipe, '#', Item.diamond, '|', InfiLibrary.bronzeRod );
			GameRegistry.addRecipe(new ItemStack(workedDiamondPickaxe), recipe, '#', Item.diamond, '|', InfiLibrary.workedIronRod );
			GameRegistry.addRecipe(new ItemStack(steelDiamondPickaxe), recipe, '#', Item.diamond, '|', InfiLibrary.steelRod );
			GameRegistry.addRecipe(new ItemStack(cobaltDiamondPickaxe), recipe, '#', Item.diamond, '|', InfiLibrary.cobaltRod );
			GameRegistry.addRecipe(new ItemStack(arditeDiamondPickaxe), recipe, '#', Item.diamond, '|', InfiLibrary.arditeRod );
			GameRegistry.addRecipe(new ItemStack(manyullynDiamondPickaxe), recipe, '#', Item.diamond, '|', InfiLibrary.manyullynRod );
			GameRegistry.addRecipe(new ItemStack(uraniumDiamondPickaxe), recipe, '#', Item.diamond, '|', InfiLibrary.uraniumRod );
		}

		if (PHInfiTools.enableRedstoneTools)
		{
			GameRegistry.addRecipe(new ItemStack(woodRedstonePickaxe), recipe, '#', InfiLibrary.redstoneCrystal, '|', Item.stick );
			GameRegistry.addRecipe(new ItemStack(stoneRedstonePickaxe), recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.stoneRod );
			GameRegistry.addRecipe(new ItemStack(ironRedstonePickaxe), recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.ironRod );
			GameRegistry.addRecipe(new ItemStack(redstoneRedstonePickaxe), recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.redstoneRod );
			GameRegistry.addRecipe(new ItemStack(obsidianRedstonePickaxe), recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.obsidianRod );
			GameRegistry.addRecipe(new ItemStack(sandstoneRedstonePickaxe), recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.sandstoneRod );
			GameRegistry.addRecipe(new ItemStack(boneRedstonePickaxe), recipe, '#', InfiLibrary.redstoneCrystal, '|', Item.bone );
			GameRegistry.addRecipe(new ItemStack(boneRedstonePickaxe), recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.boneRod );
			GameRegistry.addRecipe(new ItemStack(paperRedstonePickaxe), recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.paperRod );
			GameRegistry.addRecipe(new ItemStack(mossyRedstonePickaxe), recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.mossyRod );
			GameRegistry.addRecipe(new ItemStack(netherrackRedstonePickaxe), recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.netherrackRod );
			GameRegistry.addRecipe(new ItemStack(glowstoneRedstonePickaxe), recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.glowstoneRod );
			GameRegistry.addRecipe(new ItemStack(iceRedstonePickaxe), recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.iceRod );
			GameRegistry.addRecipe(new ItemStack(lavaRedstonePickaxe), recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.lavaRod );
			GameRegistry.addRecipe(new ItemStack(slimeRedstonePickaxe), recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.slimeRod );
			GameRegistry.addRecipe(new ItemStack(cactusRedstonePickaxe), recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.cactusRod );
			GameRegistry.addRecipe(new ItemStack(flintRedstonePickaxe), recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.flintRod );
			GameRegistry.addRecipe(new ItemStack(copperRedstonePickaxe), recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.copperRod );
			GameRegistry.addRecipe(new ItemStack(bronzeRedstonePickaxe), recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.bronzeRod );
			GameRegistry.addRecipe(new ItemStack(workedRedstonePickaxe), recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.workedIronRod );
			GameRegistry.addRecipe(new ItemStack(uraniumRedstonePickaxe), recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.uraniumRod );
		}

		if (PHInfiTools.enableObsidianTools)
		{
			GameRegistry.addRecipe(new ItemStack(woodObsidianPickaxe), recipe, '#', Block.obsidian, '|', Item.stick );
			GameRegistry.addRecipe(new ItemStack(stoneObsidianPickaxe), recipe, '#', Block.obsidian, '|', InfiLibrary.stoneRod );
			GameRegistry.addRecipe(new ItemStack(redstoneObsidianPickaxe), recipe, '#', Block.obsidian, '|', InfiLibrary.redstoneRod );
			GameRegistry.addRecipe(new ItemStack(obsidianObsidianPickaxe), recipe, '#', Block.obsidian, '|', InfiLibrary.obsidianRod );
			GameRegistry.addRecipe(new ItemStack(boneObsidianPickaxe), recipe, '#', Block.obsidian, '|', Item.bone );
			GameRegistry.addRecipe(new ItemStack(boneObsidianPickaxe), recipe, '#', Block.obsidian, '|', InfiLibrary.boneRod );
			GameRegistry.addRecipe(new ItemStack(netherrackObsidianPickaxe), recipe, '#', Block.obsidian, '|', InfiLibrary.netherrackRod );
			GameRegistry.addRecipe(new ItemStack(glowstoneObsidianPickaxe), recipe, '#', Block.obsidian, '|', InfiLibrary.glowstoneRod );
			GameRegistry.addRecipe(new ItemStack(iceObsidianPickaxe), recipe, '#', Block.obsidian, '|', InfiLibrary.iceRod );
			GameRegistry.addRecipe(new ItemStack(lavaObsidianPickaxe), recipe, '#', Block.obsidian, '|', InfiLibrary.lavaRod );
			GameRegistry.addRecipe(new ItemStack(cactusObsidianPickaxe), recipe, '#', Block.obsidian, '|', InfiLibrary.cactusRod );
		}

		if (PHInfiTools.enableSandstoneTools)
		{
			GameRegistry.addRecipe(new ItemStack(woodSandstonePickaxe), recipe, '#', Block.sandStone, '|', Item.stick );
			GameRegistry.addRecipe(new ItemStack(sandstoneSandstonePickaxe), recipe, '#', Block.sandStone, '|', InfiLibrary.sandstoneRod );
			GameRegistry.addRecipe(new ItemStack(boneSandstonePickaxe), recipe, '#', Block.sandStone, '|', Item.bone );
			GameRegistry.addRecipe(new ItemStack(boneSandstonePickaxe), recipe, '#', Block.sandStone, '|', InfiLibrary.boneRod );
			GameRegistry.addRecipe(new ItemStack(netherrackSandstonePickaxe), recipe, '#', Block.sandStone, '|', InfiLibrary.netherrackRod );
			GameRegistry.addRecipe(new ItemStack(iceSandstonePickaxe), recipe, '#', Block.sandStone, '|', InfiLibrary.iceRod );
			GameRegistry.addRecipe(new ItemStack(slimeSandstonePickaxe), recipe, '#', Block.sandStone, '|', InfiLibrary.slimeRod );
			GameRegistry.addRecipe(new ItemStack(cactusSandstonePickaxe), recipe, '#', Block.sandStone, '|', InfiLibrary.cactusRod );
			GameRegistry.addRecipe(new ItemStack(flintSandstonePickaxe), recipe, '#', Block.sandStone, '|', InfiLibrary.flintRod );
		}

		if (PHInfiTools.enableBoneTools)
		{
			GameRegistry.addRecipe(new ItemStack(woodBonePickaxe), recipe, '#', Item.bone, '|', Item.stick );
			GameRegistry.addRecipe(new ItemStack(stoneBonePickaxe), recipe, '#', Item.bone, '|', InfiLibrary.stoneRod );
			GameRegistry.addRecipe(new ItemStack(sandstoneBonePickaxe), recipe, '#', Item.bone, '|', InfiLibrary.sandstoneRod );
			GameRegistry.addRecipe(new ItemStack(boneBonePickaxe), recipe, '#', Item.bone, '|', Item.bone );
			GameRegistry.addRecipe(new ItemStack(boneBonePickaxe), recipe, '#', Item.bone, '|', InfiLibrary.boneRod );
			GameRegistry.addRecipe(new ItemStack(paperBonePickaxe), recipe, '#', Item.bone, '|', InfiLibrary.paperRod );
			GameRegistry.addRecipe(new ItemStack(netherrackBonePickaxe), recipe, '#', Item.bone, '|', InfiLibrary.netherrackRod );
			GameRegistry.addRecipe(new ItemStack(iceBonePickaxe), recipe, '#', Item.bone, '|', InfiLibrary.iceRod );
			GameRegistry.addRecipe(new ItemStack(cactusBonePickaxe), recipe, '#', Item.bone, '|', InfiLibrary.cactusRod );
			GameRegistry.addRecipe(new ItemStack(flintBonePickaxe), recipe, '#', Item.bone, '|', InfiLibrary.flintRod );
		}

		if (PHInfiTools.enablePaperTools)
		{
			GameRegistry.addRecipe(new ItemStack(woodPaperPickaxe), recipe, '#', InfiLibrary.paperStack, '|', Item.stick );
			GameRegistry.addRecipe(new ItemStack(bonePaperPickaxe), recipe, '#', InfiLibrary.paperStack, '|', Item.bone );
			GameRegistry.addRecipe(new ItemStack(bonePaperPickaxe), recipe, '#', InfiLibrary.paperStack, '|', InfiLibrary.boneRod );
			GameRegistry.addRecipe(new ItemStack(paperPaperPickaxe), recipe, '#', InfiLibrary.paperStack, '|', InfiLibrary.paperRod );
			GameRegistry.addRecipe(new ItemStack(slimePaperPickaxe), recipe, '#', InfiLibrary.paperStack, '|', InfiLibrary.slimeRod );
			GameRegistry.addRecipe(new ItemStack(cactusPaperPickaxe), recipe, '#', InfiLibrary.paperStack, '|', InfiLibrary.cactusRod );
		}

		if (PHInfiTools.enableMossyTools)
		{
			GameRegistry.addRecipe(new ItemStack(woodMossyPickaxe), recipe, '#', InfiLibrary.mossyStone, '|', Item.stick );
			GameRegistry.addRecipe(new ItemStack(stoneMossyPickaxe), recipe, '#', InfiLibrary.mossyStone, '|', InfiLibrary.stoneRod );
			GameRegistry.addRecipe(new ItemStack(diamondMossyPickaxe), recipe, '#', InfiLibrary.mossyStone, '|', InfiLibrary.diamondRod );
			GameRegistry.addRecipe(new ItemStack(redstoneMossyPickaxe), recipe, '#', InfiLibrary.mossyStone, '|', InfiLibrary.redstoneRod );
			GameRegistry.addRecipe(new ItemStack(boneMossyPickaxe), recipe, '#', InfiLibrary.mossyStone, '|', Item.bone );
			GameRegistry.addRecipe(new ItemStack(boneMossyPickaxe), recipe, '#', InfiLibrary.mossyStone, '|', InfiLibrary.boneRod );
			GameRegistry.addRecipe(new ItemStack(mossyMossyPickaxe), recipe, '#', InfiLibrary.mossyStone, '|', InfiLibrary.mossyRod );
			GameRegistry.addRecipe(new ItemStack(netherrackMossyPickaxe), recipe, '#', InfiLibrary.mossyStone, '|', InfiLibrary.netherrackRod );
			GameRegistry.addRecipe(new ItemStack(glowstoneMossyPickaxe), recipe, '#', InfiLibrary.mossyStone, '|', InfiLibrary.glowstoneRod );
			GameRegistry.addRecipe(new ItemStack(cactusMossyPickaxe), recipe, '#', InfiLibrary.mossyStone, '|', InfiLibrary.cactusRod );
			GameRegistry.addRecipe(new ItemStack(blazeMossyPickaxe), recipe, '#', InfiLibrary.mossyStone, '|', Item.blazeRod );
			GameRegistry.addRecipe(new ItemStack(manyullynMossyPickaxe), recipe, '#', InfiLibrary.mossyStone, '|', InfiLibrary.manyullynRod );
			GameRegistry.addRecipe(new ItemStack(uraniumMossyPickaxe), recipe, '#', InfiLibrary.mossyStone, '|', InfiLibrary.uraniumRod );
		}

		if (PHInfiTools.enableNetherrackTools)
		{
			GameRegistry.addRecipe(new ItemStack(woodNetherrackPickaxe), recipe, '#', Block.netherrack, '|', Item.stick );
			GameRegistry.addRecipe(new ItemStack(stoneNetherrackPickaxe), recipe, '#', Block.netherrack, '|', InfiLibrary.stoneRod );
			GameRegistry.addRecipe(new ItemStack(sandstoneNetherrackPickaxe), recipe, '#', Block.netherrack, '|', InfiLibrary.sandstoneRod );
			GameRegistry.addRecipe(new ItemStack(boneNetherrackPickaxe), recipe, '#', Block.netherrack, '|', Item.bone );
			GameRegistry.addRecipe(new ItemStack(boneNetherrackPickaxe), recipe, '#', Block.netherrack, '|', InfiLibrary.boneRod );
			GameRegistry.addRecipe(new ItemStack(paperNetherrackPickaxe), recipe, '#', Block.netherrack, '|', InfiLibrary.paperRod );
			GameRegistry.addRecipe(new ItemStack(mossyNetherrackPickaxe), recipe, '#', Block.netherrack, '|', InfiLibrary.mossyRod );
			GameRegistry.addRecipe(new ItemStack(netherrackNetherrackPickaxe), recipe, '#', Block.netherrack, '|', InfiLibrary.netherrackRod );
			GameRegistry.addRecipe(new ItemStack(iceNetherrackPickaxe), recipe, '#', Block.netherrack, '|', InfiLibrary.iceRod );
			GameRegistry.addRecipe(new ItemStack(slimeNetherrackPickaxe), recipe, '#', Block.netherrack, '|', InfiLibrary.slimeRod );
			GameRegistry.addRecipe(new ItemStack(cactusNetherrackPickaxe), recipe, '#', Block.netherrack, '|', InfiLibrary.cactusRod );
			GameRegistry.addRecipe(new ItemStack(flintNetherrackPickaxe), recipe, '#', Block.netherrack, '|', InfiLibrary.flintRod );
			GameRegistry.addRecipe(new ItemStack(copperNetherrackPickaxe), recipe, '#', Block.netherrack, '|', InfiLibrary.copperRod );
			GameRegistry.addRecipe(new ItemStack(bronzeNetherrackPickaxe), recipe, '#', Block.netherrack, '|', InfiLibrary.bronzeRod );
		}

		if (PHInfiTools.enableGlowstoneTools)
		{
			GameRegistry.addRecipe(new ItemStack(woodGlowstonePickaxe), recipe, '#', InfiLibrary.glowstoneCrystal, '|', Item.stick );
			GameRegistry.addRecipe(new ItemStack(redstoneGlowstonePickaxe), recipe, '#', InfiLibrary.glowstoneCrystal, '|', InfiLibrary.redstoneRod );
			GameRegistry.addRecipe(new ItemStack(obsidianGlowstonePickaxe), recipe, '#', InfiLibrary.glowstoneCrystal, '|', InfiLibrary.obsidianRod );
			GameRegistry.addRecipe(new ItemStack(boneGlowstonePickaxe), recipe, '#', InfiLibrary.glowstoneCrystal, '|', Item.bone );
			GameRegistry.addRecipe(new ItemStack(boneGlowstonePickaxe), recipe, '#', InfiLibrary.glowstoneCrystal, '|', InfiLibrary.boneRod );
			GameRegistry.addRecipe(new ItemStack(netherrackGlowstonePickaxe), recipe, '#', InfiLibrary.glowstoneCrystal, '|', InfiLibrary.netherrackRod );
			GameRegistry.addRecipe(new ItemStack(glowstoneGlowstonePickaxe), recipe, '#', InfiLibrary.glowstoneCrystal, '|', InfiLibrary.glowstoneRod );
			GameRegistry.addRecipe(new ItemStack(iceGlowstonePickaxe), recipe, '#', InfiLibrary.glowstoneCrystal, '|', InfiLibrary.iceRod );
			GameRegistry.addRecipe(new ItemStack(slimeGlowstonePickaxe), recipe, '#', InfiLibrary.glowstoneCrystal, '|', InfiLibrary.slimeRod );
			GameRegistry.addRecipe(new ItemStack(cactusGlowstonePickaxe), recipe, '#', InfiLibrary.glowstoneCrystal, '|', InfiLibrary.cactusRod );
		}

		if (PHInfiTools.enableIceTools)
		{
			GameRegistry.addRecipe(new ItemStack(woodIcePickaxe), recipe, '#', Block.ice, '|', Item.stick );
			GameRegistry.addRecipe(new ItemStack(boneIcePickaxe), recipe, '#', Block.ice, '|', Item.bone );
			GameRegistry.addRecipe(new ItemStack(boneIcePickaxe), recipe, '#', Block.ice, '|', InfiLibrary.boneRod );
			GameRegistry.addRecipe(new ItemStack(paperIcePickaxe), recipe, '#', Block.ice, '|', InfiLibrary.paperRod );
			GameRegistry.addRecipe(new ItemStack(iceIcePickaxe), recipe, '#', Block.ice, '|', InfiLibrary.iceRod );
			GameRegistry.addRecipe(new ItemStack(slimeIcePickaxe), recipe, '#', Block.ice, '|', InfiLibrary.slimeRod );
			GameRegistry.addRecipe(new ItemStack(cactusIcePickaxe), recipe, '#', Block.ice, '|', InfiLibrary.cactusRod );
		}

		if (PHInfiTools.enableLavaTools)
		{
			GameRegistry.addRecipe(new ItemStack(diamondLavaPickaxe), recipe, '#', InfiLibrary.lavaCrystal, '|', InfiLibrary.diamondRod );
			GameRegistry.addRecipe(new ItemStack(obsidianLavaPickaxe), recipe, '#', InfiLibrary.lavaCrystal, '|', InfiLibrary.obsidianRod );
			GameRegistry.addRecipe(new ItemStack(netherrackLavaPickaxe), recipe, '#', InfiLibrary.lavaCrystal, '|', InfiLibrary.netherrackRod );
			GameRegistry.addRecipe(new ItemStack(lavaLavaPickaxe), recipe, '#', InfiLibrary.lavaCrystal, '|', InfiLibrary.lavaRod );
			GameRegistry.addRecipe(new ItemStack(flintLavaPickaxe), recipe, '#', InfiLibrary.lavaCrystal, '|', InfiLibrary.flintRod );
			GameRegistry.addRecipe(new ItemStack(blazeLavaPickaxe), recipe, '#', InfiLibrary.lavaCrystal, '|', Item.blazeRod );
			GameRegistry.addRecipe(new ItemStack(manyullynLavaPickaxe), recipe, '#', InfiLibrary.lavaCrystal, '|', InfiLibrary.manyullynRod );
			GameRegistry.addRecipe(new ItemStack(uraniumLavaPickaxe), recipe, '#', InfiLibrary.lavaCrystal, '|', InfiLibrary.uraniumRod );
		}

		if (PHInfiTools.enableSlimeTools)
		{
			GameRegistry.addRecipe(new ItemStack(woodSlimePickaxe), recipe, '#', InfiLibrary.slimeCrystal, '|', Item.stick );
			GameRegistry.addRecipe(new ItemStack(sandstoneSlimePickaxe), recipe, '#', InfiLibrary.slimeCrystal, '|', InfiLibrary.sandstoneRod );
			GameRegistry.addRecipe(new ItemStack(boneSlimePickaxe), recipe, '#', InfiLibrary.slimeCrystal, '|', Item.bone );
			GameRegistry.addRecipe(new ItemStack(boneSlimePickaxe), recipe, '#', InfiLibrary.slimeCrystal, '|', InfiLibrary.boneRod );
			GameRegistry.addRecipe(new ItemStack(paperSlimePickaxe), recipe, '#', InfiLibrary.slimeCrystal, '|', InfiLibrary.paperRod );
			GameRegistry.addRecipe(new ItemStack(slimeSlimePickaxe), recipe, '#', InfiLibrary.slimeCrystal, '|', InfiLibrary.slimeRod );
			GameRegistry.addRecipe(new ItemStack(cactusSlimePickaxe), recipe, '#', InfiLibrary.slimeCrystal, '|', InfiLibrary.cactusRod );
		}

		if (PHInfiTools.enableCactusTools)
		{
			GameRegistry.addRecipe(new ItemStack(woodCactusPickaxe), recipe, '#', Block.cactus, '|', Item.stick );
			GameRegistry.addRecipe(new ItemStack(sandstoneCactusPickaxe), recipe, '#', Block.cactus, '|', InfiLibrary.sandstoneRod );
			GameRegistry.addRecipe(new ItemStack(boneCactusPickaxe), recipe, '#', Block.cactus, '|', Item.bone );
			GameRegistry.addRecipe(new ItemStack(boneCactusPickaxe), recipe, '#', Block.cactus, '|', InfiLibrary.boneRod );
			GameRegistry.addRecipe(new ItemStack(netherrackCactusPickaxe), recipe, '#', Block.cactus, '|', InfiLibrary.netherrackRod );
			GameRegistry.addRecipe(new ItemStack(iceCactusPickaxe), recipe, '#', Block.cactus, '|', InfiLibrary.iceRod );
			GameRegistry.addRecipe(new ItemStack(slimeCactusPickaxe), recipe, '#', Block.cactus, '|', InfiLibrary.slimeRod );
			GameRegistry.addRecipe(new ItemStack(cactusCactusPickaxe), recipe, '#', Block.cactus, '|', InfiLibrary.cactusRod );
		}

		if (PHInfiTools.enableFlintTools)
		{
			GameRegistry.addRecipe(new ItemStack(woodFlintPickaxe), recipe, '#', Item.flint, '|', Item.stick );
			GameRegistry.addRecipe(new ItemStack(stoneFlintPickaxe), recipe, '#', Item.flint, '|', InfiLibrary.stoneRod );
			GameRegistry.addRecipe(new ItemStack(sandstoneFlintPickaxe), recipe, '#', Item.flint, '|', InfiLibrary.sandstoneRod );
			GameRegistry.addRecipe(new ItemStack(boneFlintPickaxe), recipe, '#', Item.flint, '|', Item.bone );
			GameRegistry.addRecipe(new ItemStack(boneFlintPickaxe), recipe, '#', Item.flint, '|', InfiLibrary.boneRod );
			GameRegistry.addRecipe(new ItemStack(netherrackFlintPickaxe), recipe, '#', Item.flint, '|', InfiLibrary.netherrackRod );
			GameRegistry.addRecipe(new ItemStack(slimeFlintPickaxe), recipe, '#', Item.flint, '|', InfiLibrary.slimeRod );
			GameRegistry.addRecipe(new ItemStack(cactusFlintPickaxe), recipe, '#', Item.flint, '|', InfiLibrary.cactusRod );
			GameRegistry.addRecipe(new ItemStack(flintFlintPickaxe), recipe, '#', Item.flint, '|', InfiLibrary.flintRod );
			GameRegistry.addRecipe(new ItemStack(copperFlintPickaxe), recipe, '#', Item.flint, '|', InfiLibrary.copperRod );
			GameRegistry.addRecipe(new ItemStack(bronzeFlintPickaxe), recipe, '#', Item.flint, '|', InfiLibrary.bronzeRod );
		}

		if (PHInfiTools.enableBlazeTools)
		{
			GameRegistry.addRecipe(new ItemStack(diamondBlazePickaxe), recipe, '#', InfiLibrary.blazeCrystal, '|', InfiLibrary.diamondRod );
			GameRegistry.addRecipe(new ItemStack(obsidianBlazePickaxe), recipe, '#', InfiLibrary.blazeCrystal, '|', InfiLibrary.obsidianRod );
			GameRegistry.addRecipe(new ItemStack(netherrackBlazePickaxe), recipe, '#', InfiLibrary.blazeCrystal, '|', InfiLibrary.netherrackRod );
			GameRegistry.addRecipe(new ItemStack(lavaBlazePickaxe), recipe, '#', InfiLibrary.blazeCrystal, '|', InfiLibrary.lavaRod );
			GameRegistry.addRecipe(new ItemStack(flintBlazePickaxe), recipe, '#', InfiLibrary.blazeCrystal, '|', InfiLibrary.flintRod );
			GameRegistry.addRecipe(new ItemStack(blazeBlazePickaxe), recipe, '#', InfiLibrary.blazeCrystal, '|', Item.blazeRod );
			GameRegistry.addRecipe(new ItemStack(manyullynBlazePickaxe), recipe, '#', InfiLibrary.blazeCrystal, '|', InfiLibrary.manyullynRod );
			GameRegistry.addRecipe(new ItemStack(uraniumBlazePickaxe), recipe, '#', InfiLibrary.blazeCrystal, '|', InfiLibrary.uraniumRod );
		}
	}

	public static void addStoneTools(String stack)
	{
		//GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(woodStonePickaxe), recipe, '#', stack, '|', Item.stick ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(stoneStonePickaxe), recipe, '#', stack, '|', InfiLibrary.stoneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(sandstoneStonePickaxe), recipe, '#', stack, '|', InfiLibrary.sandstoneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(boneStonePickaxe), recipe, '#', stack, '|', Item.bone ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(boneStonePickaxe), recipe, '#', stack, '|', InfiLibrary.boneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(netherrackStonePickaxe), recipe, '#', stack, '|', InfiLibrary.netherrackRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(iceStonePickaxe), recipe, '#', stack, '|', InfiLibrary.iceRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(slimeStonePickaxe), recipe, '#', stack, '|', InfiLibrary.slimeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(cactusStonePickaxe), recipe, '#', stack, '|', InfiLibrary.cactusRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(flintStonePickaxe), recipe, '#', stack, '|', InfiLibrary.flintRod ) );
	}

	public static void addCopperTools(String stack)
	{
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(woodCopperPickaxe), recipe, '#', stack, '|', Item.stick ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(stoneCopperPickaxe), recipe, '#', stack, '|', InfiLibrary.stoneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(boneCopperPickaxe), recipe, '#', stack, '|', Item.bone ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(boneCopperPickaxe), recipe, '#', stack, '|', InfiLibrary.boneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(netherrackCopperPickaxe), recipe, '#', stack, '|', InfiLibrary.netherrackRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(slimeCopperPickaxe), recipe, '#', stack, '|', InfiLibrary.slimeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(cactusCopperPickaxe), recipe, '#', stack, '|', InfiLibrary.cactusRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(flintCopperPickaxe), recipe, '#', stack, '|', InfiLibrary.flintRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(copperCopperPickaxe), recipe, '#', stack, '|', InfiLibrary.copperRod ) );
	}

	public static void addBronzeTools(String stack)
	{
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(woodBronzePickaxe), recipe, '#', stack, '|', Item.stick ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(stoneBronzePickaxe), recipe, '#', stack, '|', InfiLibrary.stoneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(boneBronzePickaxe), recipe, '#', stack, '|', Item.bone ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(boneBronzePickaxe), recipe, '#', stack, '|', InfiLibrary.boneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(netherrackBronzePickaxe), recipe, '#', stack, '|', InfiLibrary.netherrackRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(slimeBronzePickaxe), recipe, '#', stack, '|', InfiLibrary.slimeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(cactusBronzePickaxe), recipe, '#', stack, '|', InfiLibrary.cactusRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(flintBronzePickaxe), recipe, '#', stack, '|', InfiLibrary.flintRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(copperBronzePickaxe), recipe, '#', stack, '|', InfiLibrary.copperRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(bronzeBronzePickaxe), recipe, '#', stack, '|', InfiLibrary.bronzeRod ) );
	}

	public static void addWorkedIronTools(String stack)
	{
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(woodWorkedIronPickaxe), recipe, '#', stack, '|', Item.stick ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(stoneWorkedIronPickaxe), recipe, '#', stack, '|', InfiLibrary.stoneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(ironWorkedIronPickaxe), recipe, '#', stack, '|', InfiLibrary.ironRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(diamondWorkedIronPickaxe), recipe, '#', stack, '|', InfiLibrary.diamondRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(redstoneWorkedIronPickaxe), recipe, '#', stack, '|', InfiLibrary.redstoneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(obsidianWorkedIronPickaxe), recipe, '#', stack, '|', InfiLibrary.obsidianRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(boneWorkedIronPickaxe), recipe, '#', stack, '|', Item.bone ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(boneWorkedIronPickaxe), recipe, '#', stack, '|', InfiLibrary.boneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(netherrackWorkedIronPickaxe), recipe, '#', stack, '|', InfiLibrary.netherrackRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(glowstoneWorkedIronPickaxe), recipe, '#', stack, '|', InfiLibrary.glowstoneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(iceWorkedIronPickaxe), recipe, '#', stack, '|', InfiLibrary.iceRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(slimeWorkedIronPickaxe), recipe, '#', stack, '|', InfiLibrary.slimeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(cactusWorkedIronPickaxe), recipe, '#', stack, '|', InfiLibrary.cactusRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(blazeWorkedIronPickaxe), recipe, '#', stack, '|', Item.blazeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(copperWorkedIronPickaxe), recipe, '#', stack, '|', InfiLibrary.copperRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(bronzeWorkedIronPickaxe), recipe, '#', stack, '|', InfiLibrary.bronzeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(workedWorkedIronPickaxe), recipe, '#', stack, '|', InfiLibrary.workedIronRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(steelWorkedIronPickaxe), recipe, '#', stack, '|', InfiLibrary.steelRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(uraniumWorkedIronPickaxe), recipe, '#', stack, '|', InfiLibrary.uraniumRod ) );
	}

	public static void addSteelTools(String stack)
	{
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(woodSteelPickaxe), recipe, '#', stack, '|', Item.stick ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(stoneSteelPickaxe), recipe, '#', stack, '|', InfiLibrary.stoneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(ironSteelPickaxe), recipe, '#', stack, '|', InfiLibrary.ironRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(diamondSteelPickaxe), recipe, '#', stack, '|', InfiLibrary.diamondRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(redstoneSteelPickaxe), recipe, '#', stack, '|', InfiLibrary.redstoneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(obsidianSteelPickaxe), recipe, '#', stack, '|', InfiLibrary.obsidianRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(boneSteelPickaxe), recipe, '#', stack, '|', Item.bone ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(boneSteelPickaxe), recipe, '#', stack, '|', InfiLibrary.boneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(netherrackSteelPickaxe), recipe, '#', stack, '|', InfiLibrary.netherrackRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(glowstoneSteelPickaxe), recipe, '#', stack, '|', InfiLibrary.glowstoneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(iceSteelPickaxe), recipe, '#', stack, '|', InfiLibrary.iceRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(slimeSteelPickaxe), recipe, '#', stack, '|', InfiLibrary.slimeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(cactusSteelPickaxe), recipe, '#', stack, '|', InfiLibrary.cactusRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(blazeSteelPickaxe), recipe, '#', stack, '|', Item.blazeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(copperSteelPickaxe), recipe, '#', stack, '|', InfiLibrary.copperRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(bronzeSteelPickaxe), recipe, '#', stack, '|', InfiLibrary.bronzeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(workedSteelPickaxe), recipe, '#', stack, '|', InfiLibrary.workedIronRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(steelSteelPickaxe), recipe, '#', stack, '|', InfiLibrary.steelRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(cobaltSteelPickaxe), recipe, '#', stack, '|', InfiLibrary.cobaltRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(arditeSteelPickaxe), recipe, '#', stack, '|', InfiLibrary.arditeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(uraniumSteelPickaxe), recipe, '#', stack, '|', InfiLibrary.uraniumRod ) );
	}

	public static void addCobaltTools(String stack)
	{
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(woodCobaltPickaxe), recipe, '#', stack, '|', Item.stick ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(stoneCobaltPickaxe), recipe, '#', stack, '|', InfiLibrary.stoneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(ironCobaltPickaxe), recipe, '#', stack, '|', InfiLibrary.ironRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(diamondCobaltPickaxe), recipe, '#', stack, '|', InfiLibrary.diamondRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(redstoneCobaltPickaxe), recipe, '#', stack, '|', InfiLibrary.redstoneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(obsidianCobaltPickaxe), recipe, '#', stack, '|', InfiLibrary.obsidianRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(boneCobaltPickaxe), recipe, '#', stack, '|', Item.bone ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(boneCobaltPickaxe), recipe, '#', stack, '|', InfiLibrary.boneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(slimeCobaltPickaxe), recipe, '#', stack, '|', InfiLibrary.slimeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(cactusCobaltPickaxe), recipe, '#', stack, '|', InfiLibrary.cactusRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(blazeCobaltPickaxe), recipe, '#', stack, '|', Item.blazeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(copperCobaltPickaxe), recipe, '#', stack, '|', InfiLibrary.copperRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(bronzeCobaltPickaxe), recipe, '#', stack, '|', InfiLibrary.bronzeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(workedCobaltPickaxe), recipe, '#', stack, '|', InfiLibrary.workedIronRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(steelCobaltPickaxe), recipe, '#', stack, '|', InfiLibrary.steelRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(cobaltCobaltPickaxe), recipe, '#', stack, '|', InfiLibrary.cobaltRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(arditeCobaltPickaxe), recipe, '#', stack, '|', InfiLibrary.arditeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(manyullynCobaltPickaxe), recipe, '#', stack, '|', InfiLibrary.manyullynRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(uraniumCobaltPickaxe), recipe, '#', stack, '|', InfiLibrary.uraniumRod ) );
	}

	public static void addArditeTools(String stack)
	{
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(woodArditePickaxe), recipe, '#', stack, '|', Item.stick ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(stoneArditePickaxe), recipe, '#', stack, '|', InfiLibrary.stoneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(ironArditePickaxe), recipe, '#', stack, '|', InfiLibrary.ironRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(diamondArditePickaxe), recipe, '#', stack, '|', InfiLibrary.diamondRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(redstoneArditePickaxe), recipe, '#', stack, '|', InfiLibrary.redstoneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(obsidianArditePickaxe), recipe, '#', stack, '|', InfiLibrary.obsidianRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(boneArditePickaxe), recipe, '#', stack, '|', Item.bone ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(boneArditePickaxe), recipe, '#', stack, '|', InfiLibrary.boneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(slimeArditePickaxe), recipe, '#', stack, '|', InfiLibrary.slimeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(cactusArditePickaxe), recipe, '#', stack, '|', InfiLibrary.cactusRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(blazeArditePickaxe), recipe, '#', stack, '|', Item.blazeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(copperArditePickaxe), recipe, '#', stack, '|', InfiLibrary.copperRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(bronzeArditePickaxe), recipe, '#', stack, '|', InfiLibrary.bronzeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(workedArditePickaxe), recipe, '#', stack, '|', InfiLibrary.workedIronRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(steelArditePickaxe), recipe, '#', stack, '|', InfiLibrary.steelRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(cobaltArditePickaxe), recipe, '#', stack, '|', InfiLibrary.cobaltRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(arditeArditePickaxe), recipe, '#', stack, '|', InfiLibrary.arditeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(manyullynArditePickaxe), recipe, '#', stack, '|', InfiLibrary.manyullynRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(uraniumArditePickaxe), recipe, '#', stack, '|', InfiLibrary.uraniumRod ) );
	}

	public static void addManyullynTools(String stack)
	{
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(woodManyullynPickaxe), recipe, '#', stack, '|', Item.stick ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(stoneManyullynPickaxe), recipe, '#', stack, '|', InfiLibrary.stoneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(ironManyullynPickaxe), recipe, '#', stack, '|', InfiLibrary.ironRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(diamondManyullynPickaxe), recipe, '#', stack, '|', InfiLibrary.diamondRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(redstoneManyullynPickaxe), recipe, '#', stack, '|', InfiLibrary.redstoneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(obsidianManyullynPickaxe), recipe, '#', stack, '|', InfiLibrary.obsidianRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(boneManyullynPickaxe), recipe, '#', stack, '|', Item.bone ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(boneManyullynPickaxe), recipe, '#', stack, '|', InfiLibrary.boneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(slimeManyullynPickaxe), recipe, '#', stack, '|', InfiLibrary.slimeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(cactusManyullynPickaxe), recipe, '#', stack, '|', InfiLibrary.cactusRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(blazeManyullynPickaxe), recipe, '#', stack, '|', Item.blazeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(copperManyullynPickaxe), recipe, '#', stack, '|', InfiLibrary.copperRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(bronzeManyullynPickaxe), recipe, '#', stack, '|', InfiLibrary.bronzeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(workedManyullynPickaxe), recipe, '#', stack, '|', InfiLibrary.workedIronRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(steelManyullynPickaxe), recipe, '#', stack, '|', InfiLibrary.steelRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(cobaltManyullynPickaxe), recipe, '#', stack, '|', InfiLibrary.cobaltRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(arditeManyullynPickaxe), recipe, '#', stack, '|', InfiLibrary.arditeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(manyullynManyullynPickaxe), recipe, '#', stack, '|', InfiLibrary.manyullynRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(uraniumManyullynPickaxe), recipe, '#', stack, '|', InfiLibrary.uraniumRod ) );
	}

	public static void addUraniumTools(String stack)
	{
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(diamondUraniumPickaxe), recipe, '#', stack, '|', InfiLibrary.diamondRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(redstoneUraniumPickaxe), recipe, '#', stack, '|', InfiLibrary.redstoneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(boneUraniumPickaxe), recipe, '#', stack, '|', Item.bone ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(boneUraniumPickaxe), recipe, '#', stack, '|', InfiLibrary.boneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(netherrackUraniumPickaxe), recipe, '#', stack, '|', InfiLibrary.netherrackRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(glowstoneUraniumPickaxe), recipe, '#', stack, '|', InfiLibrary.glowstoneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(lavaUraniumPickaxe), recipe, '#', stack, '|', InfiLibrary.lavaRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(blazeUraniumPickaxe), recipe, '#', stack, '|', Item.blazeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(cobaltUraniumPickaxe), recipe, '#', stack, '|', InfiLibrary.cobaltRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(arditeUraniumPickaxe), recipe, '#', stack, '|', InfiLibrary.arditeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(uraniumUraniumPickaxe), recipe, '#', stack, '|', InfiLibrary.uraniumRod ) );
	}

	public static Item woodWoodPickaxe;
	public static Item sandstoneWoodPickaxe;
	public static Item boneWoodPickaxe;
	public static Item paperWoodPickaxe;
	public static Item iceWoodPickaxe;
	public static Item slimeWoodPickaxe;
	public static Item cactusWoodPickaxe;

	public static Item woodStonePickaxe;
	public static Item stoneStonePickaxe;
	public static Item sandstoneStonePickaxe;
	public static Item boneStonePickaxe;
	public static Item netherrackStonePickaxe;
	public static Item iceStonePickaxe;
	public static Item slimeStonePickaxe;
	public static Item cactusStonePickaxe;
	public static Item flintStonePickaxe;

	public static Item woodIronPickaxe;
	public static Item stoneIronPickaxe;
	public static Item ironIronPickaxe;
	public static Item boneIronPickaxe;
	public static Item netherrackIronPickaxe;
	public static Item glowstoneIronPickaxe;
	public static Item cactusIronPickaxe;
	public static Item copperIronPickaxe;
	public static Item bronzeIronPickaxe;

	public static Item woodDiamondPickaxe;
	public static Item stoneDiamondPickaxe;
	public static Item ironDiamondPickaxe;
	public static Item diamondDiamondPickaxe;
	public static Item redstoneDiamondPickaxe;
	public static Item obsidianDiamondPickaxe;
	public static Item boneDiamondPickaxe;
	public static Item mossyDiamondPickaxe;
	public static Item netherrackDiamondPickaxe;
	public static Item glowstoneDiamondPickaxe;
	public static Item lavaDiamondPickaxe;
	public static Item cactusDiamondPickaxe;
	public static Item flintDiamondPickaxe;
	public static Item blazeDiamondPickaxe;
	public static Item copperDiamondPickaxe;
	public static Item bronzeDiamondPickaxe;
	public static Item workedDiamondPickaxe;
	public static Item steelDiamondPickaxe;
	public static Item cobaltDiamondPickaxe;
	public static Item arditeDiamondPickaxe;
	public static Item manyullynDiamondPickaxe;
	public static Item uraniumDiamondPickaxe;

	public static Item woodRedstonePickaxe;
	public static Item stoneRedstonePickaxe;
	public static Item ironRedstonePickaxe;
	public static Item redstoneRedstonePickaxe;
	public static Item obsidianRedstonePickaxe;
	public static Item sandstoneRedstonePickaxe;
	public static Item boneRedstonePickaxe;
	public static Item paperRedstonePickaxe;
	public static Item mossyRedstonePickaxe;
	public static Item netherrackRedstonePickaxe;
	public static Item glowstoneRedstonePickaxe;
	public static Item iceRedstonePickaxe;
	public static Item lavaRedstonePickaxe;
	public static Item slimeRedstonePickaxe;
	public static Item cactusRedstonePickaxe;
	public static Item flintRedstonePickaxe;
	public static Item copperRedstonePickaxe;
	public static Item bronzeRedstonePickaxe;
	public static Item workedRedstonePickaxe;
	public static Item uraniumRedstonePickaxe;

	public static Item woodObsidianPickaxe;
	public static Item stoneObsidianPickaxe;
	public static Item redstoneObsidianPickaxe;
	public static Item obsidianObsidianPickaxe;
	public static Item boneObsidianPickaxe;
	public static Item netherrackObsidianPickaxe;
	public static Item glowstoneObsidianPickaxe;
	public static Item iceObsidianPickaxe;
	public static Item lavaObsidianPickaxe;
	public static Item cactusObsidianPickaxe;

	public static Item woodSandstonePickaxe;
	public static Item sandstoneSandstonePickaxe;
	public static Item boneSandstonePickaxe;
	public static Item netherrackSandstonePickaxe;
	public static Item iceSandstonePickaxe;
	public static Item slimeSandstonePickaxe;
	public static Item cactusSandstonePickaxe;
	public static Item flintSandstonePickaxe;

	public static Item woodBonePickaxe;
	public static Item stoneBonePickaxe;
	public static Item sandstoneBonePickaxe;
	public static Item boneBonePickaxe;
	public static Item paperBonePickaxe;
	public static Item netherrackBonePickaxe;
	public static Item iceBonePickaxe;
	public static Item cactusBonePickaxe;
	public static Item flintBonePickaxe;

	public static Item woodPaperPickaxe;
	public static Item bonePaperPickaxe;
	public static Item paperPaperPickaxe;
	public static Item slimePaperPickaxe;
	public static Item cactusPaperPickaxe;

	public static Item woodMossyPickaxe;
	public static Item stoneMossyPickaxe;
	public static Item diamondMossyPickaxe;
	public static Item redstoneMossyPickaxe;
	public static Item boneMossyPickaxe;
	public static Item mossyMossyPickaxe;
	public static Item netherrackMossyPickaxe;
	public static Item glowstoneMossyPickaxe;
	public static Item cactusMossyPickaxe;
	public static Item blazeMossyPickaxe;
	public static Item manyullynMossyPickaxe;
	public static Item uraniumMossyPickaxe;

	public static Item woodNetherrackPickaxe;
	public static Item stoneNetherrackPickaxe;
	public static Item sandstoneNetherrackPickaxe;
	public static Item boneNetherrackPickaxe;
	public static Item paperNetherrackPickaxe;
	public static Item mossyNetherrackPickaxe;
	public static Item netherrackNetherrackPickaxe;
	public static Item iceNetherrackPickaxe;
	public static Item slimeNetherrackPickaxe;
	public static Item cactusNetherrackPickaxe;
	public static Item flintNetherrackPickaxe;
	public static Item copperNetherrackPickaxe;
	public static Item bronzeNetherrackPickaxe;

	public static Item woodGlowstonePickaxe;
	public static Item redstoneGlowstonePickaxe;
	public static Item obsidianGlowstonePickaxe;
	public static Item boneGlowstonePickaxe;
	public static Item netherrackGlowstonePickaxe;
	public static Item glowstoneGlowstonePickaxe;
	public static Item iceGlowstonePickaxe;
	public static Item slimeGlowstonePickaxe;
	public static Item cactusGlowstonePickaxe;

	public static Item woodIcePickaxe;
	public static Item boneIcePickaxe;
	public static Item paperIcePickaxe;
	public static Item iceIcePickaxe;
	public static Item slimeIcePickaxe;
	public static Item cactusIcePickaxe;

	public static Item diamondLavaPickaxe;
	public static Item obsidianLavaPickaxe;
	public static Item netherrackLavaPickaxe;
	public static Item lavaLavaPickaxe;
	public static Item flintLavaPickaxe;
	public static Item blazeLavaPickaxe;
	public static Item manyullynLavaPickaxe;
	public static Item uraniumLavaPickaxe;

	public static Item woodSlimePickaxe;
	public static Item sandstoneSlimePickaxe;
	public static Item boneSlimePickaxe;
	public static Item paperSlimePickaxe;
	public static Item slimeSlimePickaxe;
	public static Item cactusSlimePickaxe;

	public static Item woodCactusPickaxe;
	public static Item sandstoneCactusPickaxe;
	public static Item boneCactusPickaxe;
	public static Item netherrackCactusPickaxe;
	public static Item iceCactusPickaxe;
	public static Item slimeCactusPickaxe;
	public static Item cactusCactusPickaxe;

	public static Item woodFlintPickaxe;
	public static Item stoneFlintPickaxe;
	public static Item sandstoneFlintPickaxe;
	public static Item boneFlintPickaxe;
	public static Item netherrackFlintPickaxe;
	public static Item slimeFlintPickaxe;
	public static Item cactusFlintPickaxe;
	public static Item flintFlintPickaxe;
	public static Item copperFlintPickaxe;
	public static Item bronzeFlintPickaxe;

	public static Item diamondBlazePickaxe;
	public static Item obsidianBlazePickaxe;
	public static Item netherrackBlazePickaxe;
	public static Item lavaBlazePickaxe;
	public static Item flintBlazePickaxe;
	public static Item blazeBlazePickaxe;
	public static Item manyullynBlazePickaxe;
	public static Item uraniumBlazePickaxe;

	public static Item woodCopperPickaxe;
	public static Item stoneCopperPickaxe;
	public static Item boneCopperPickaxe;
	public static Item netherrackCopperPickaxe;
	public static Item slimeCopperPickaxe;
	public static Item cactusCopperPickaxe;
	public static Item flintCopperPickaxe;
	public static Item copperCopperPickaxe;

	public static Item woodBronzePickaxe;
	public static Item stoneBronzePickaxe;
	public static Item boneBronzePickaxe;
	public static Item netherrackBronzePickaxe;
	public static Item slimeBronzePickaxe;
	public static Item cactusBronzePickaxe;
	public static Item flintBronzePickaxe;
	public static Item copperBronzePickaxe;
	public static Item bronzeBronzePickaxe;

	public static Item woodWorkedIronPickaxe;
	public static Item stoneWorkedIronPickaxe;
	public static Item ironWorkedIronPickaxe;
	public static Item diamondWorkedIronPickaxe;
	public static Item redstoneWorkedIronPickaxe;
	public static Item obsidianWorkedIronPickaxe;
	public static Item boneWorkedIronPickaxe;
	public static Item netherrackWorkedIronPickaxe;
	public static Item glowstoneWorkedIronPickaxe;
	public static Item iceWorkedIronPickaxe;
	public static Item slimeWorkedIronPickaxe;
	public static Item cactusWorkedIronPickaxe;
	public static Item blazeWorkedIronPickaxe;
	public static Item copperWorkedIronPickaxe;
	public static Item bronzeWorkedIronPickaxe;
	public static Item workedWorkedIronPickaxe;
	public static Item steelWorkedIronPickaxe;
	public static Item uraniumWorkedIronPickaxe;

	public static Item woodSteelPickaxe;
	public static Item stoneSteelPickaxe;
	public static Item ironSteelPickaxe;
	public static Item diamondSteelPickaxe;
	public static Item redstoneSteelPickaxe;
	public static Item obsidianSteelPickaxe;
	public static Item boneSteelPickaxe;
	public static Item netherrackSteelPickaxe;
	public static Item glowstoneSteelPickaxe;
	public static Item iceSteelPickaxe;
	public static Item slimeSteelPickaxe;
	public static Item cactusSteelPickaxe;
	public static Item blazeSteelPickaxe;
	public static Item copperSteelPickaxe;
	public static Item bronzeSteelPickaxe;
	public static Item workedSteelPickaxe;
	public static Item steelSteelPickaxe;
	public static Item cobaltSteelPickaxe;
	public static Item arditeSteelPickaxe;
	public static Item uraniumSteelPickaxe;

	public static Item woodCobaltPickaxe;
	public static Item stoneCobaltPickaxe;
	public static Item ironCobaltPickaxe;
	public static Item diamondCobaltPickaxe;
	public static Item redstoneCobaltPickaxe;
	public static Item obsidianCobaltPickaxe;
	public static Item boneCobaltPickaxe;
	public static Item slimeCobaltPickaxe;
	public static Item cactusCobaltPickaxe;
	public static Item blazeCobaltPickaxe;
	public static Item copperCobaltPickaxe;
	public static Item bronzeCobaltPickaxe;
	public static Item workedCobaltPickaxe;
	public static Item steelCobaltPickaxe;
	public static Item cobaltCobaltPickaxe;
	public static Item arditeCobaltPickaxe;
	public static Item manyullynCobaltPickaxe;
	public static Item uraniumCobaltPickaxe;

	public static Item woodArditePickaxe;
	public static Item stoneArditePickaxe;
	public static Item ironArditePickaxe;
	public static Item diamondArditePickaxe;
	public static Item redstoneArditePickaxe;
	public static Item obsidianArditePickaxe;
	public static Item boneArditePickaxe;
	public static Item slimeArditePickaxe;
	public static Item cactusArditePickaxe;
	public static Item blazeArditePickaxe;
	public static Item copperArditePickaxe;
	public static Item bronzeArditePickaxe;
	public static Item workedArditePickaxe;
	public static Item steelArditePickaxe;
	public static Item cobaltArditePickaxe;
	public static Item arditeArditePickaxe;
	public static Item manyullynArditePickaxe;
	public static Item uraniumArditePickaxe;

	public static Item woodManyullynPickaxe;
	public static Item stoneManyullynPickaxe;
	public static Item ironManyullynPickaxe;
	public static Item diamondManyullynPickaxe;
	public static Item redstoneManyullynPickaxe;
	public static Item obsidianManyullynPickaxe;
	public static Item boneManyullynPickaxe;
	public static Item slimeManyullynPickaxe;
	public static Item cactusManyullynPickaxe;
	public static Item blazeManyullynPickaxe;
	public static Item copperManyullynPickaxe;
	public static Item bronzeManyullynPickaxe;
	public static Item workedManyullynPickaxe;
	public static Item steelManyullynPickaxe;
	public static Item cobaltManyullynPickaxe;
	public static Item arditeManyullynPickaxe;
	public static Item manyullynManyullynPickaxe;
	public static Item uraniumManyullynPickaxe;

	public static Item diamondUraniumPickaxe;
	public static Item redstoneUraniumPickaxe;
	public static Item boneUraniumPickaxe;
	public static Item netherrackUraniumPickaxe;
	public static Item glowstoneUraniumPickaxe;
	public static Item lavaUraniumPickaxe;
	public static Item blazeUraniumPickaxe;
	public static Item cobaltUraniumPickaxe;
	public static Item arditeUraniumPickaxe;
	public static Item uraniumUraniumPickaxe;
}
