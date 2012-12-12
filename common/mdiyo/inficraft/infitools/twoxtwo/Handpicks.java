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

public class Handpicks
{
	public static Handpicks instance = new Handpicks();

	private static String[] recipe = { "##", "#|" };

	public static Handpicks getInstance()
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
		woodWoodHandpick = new InfiToolHandpick(PropsHelperInfi2x2.woodHandpickID + 0, InfiMaterialEnum.Wood, InfiMaterialEnum.Wood, "woodWoodHandpick");
		woodStoneHandpick = new InfiToolHandpick(PropsHelperInfi2x2.stoneHandpickID + 0, InfiMaterialEnum.Stone, InfiMaterialEnum.Wood, "woodStoneHandpick");
		woodIronHandpick = new InfiToolHandpick(PropsHelperInfi2x2.ironHandpickID + 0, InfiMaterialEnum.Iron, InfiMaterialEnum.Wood, "woodIronHandpick");
		woodDiamondHandpick = new InfiToolHandpick(PropsHelperInfi2x2.diamondHandpickID + 0, InfiMaterialEnum.Diamond, InfiMaterialEnum.Wood, "woodDiamondHandpick");

		LanguageRegistry.instance().addName(woodWoodHandpick, "Wooden Handpick");
	}

	private static void registerVanillaRecipes()
	{
		GameRegistry.addRecipe(new ItemStack(woodWoodHandpick), recipe, '#', Block.planks, '|', Item.stick);
		GameRegistry.addRecipe(new ItemStack(woodStoneHandpick), recipe, '#', Block.cobblestone, '|', Item.stick);
		GameRegistry.addRecipe(new ItemStack(woodIronHandpick), recipe, '#', Item.ingotIron, '|', Item.stick);
		GameRegistry.addRecipe(new ItemStack(woodDiamondHandpick), recipe, '#', Item.diamond, '|', Item.stick);
	}

	private static void createTools()
	{
		if (PropsHelperInfi2x2.enableWoodTools)
		{
			woodWoodHandpick = new InfiToolHandpick(PropsHelperInfi2x2.woodHandpickID + 0, InfiMaterialEnum.Wood, InfiMaterialEnum.Wood, "woodWoodHandpick");
			sandstoneWoodHandpick = new InfiToolHandpick(PropsHelperInfi2x2.woodHandpickID + 1, InfiMaterialEnum.Wood, InfiMaterialEnum.Sandstone, "sandstoneWoodHandpick");
			boneWoodHandpick = new InfiToolHandpick(PropsHelperInfi2x2.woodHandpickID + 2, InfiMaterialEnum.Wood, InfiMaterialEnum.Bone, "boneWoodHandpick");
			paperWoodHandpick = new InfiToolHandpick(PropsHelperInfi2x2.woodHandpickID + 3, InfiMaterialEnum.Wood, InfiMaterialEnum.Paper, "paperWoodHandpick");
			iceWoodHandpick = new InfiToolHandpick(PropsHelperInfi2x2.woodHandpickID + 4, InfiMaterialEnum.Wood, InfiMaterialEnum.Ice, "iceWoodHandpick");
			slimeWoodHandpick = new InfiToolHandpick(PropsHelperInfi2x2.woodHandpickID + 5, InfiMaterialEnum.Wood, InfiMaterialEnum.Slime, "slimeWoodHandpick");
			cactusWoodHandpick = new InfiToolHandpick(PropsHelperInfi2x2.woodHandpickID + 6, InfiMaterialEnum.Wood, InfiMaterialEnum.Cactus, "cactusWoodHandpick");
		}

		if (PropsHelperInfi2x2.enableStoneTools)
		{
			woodStoneHandpick = new InfiToolHandpick(PropsHelperInfi2x2.stoneHandpickID + 0, InfiMaterialEnum.Stone, InfiMaterialEnum.Wood, "woodStoneHandpick");
			stoneStoneHandpick = new InfiToolHandpick(PropsHelperInfi2x2.stoneHandpickID + 1, InfiMaterialEnum.Stone, InfiMaterialEnum.Stone, "stoneStoneHandpick");
			sandstoneStoneHandpick = new InfiToolHandpick(PropsHelperInfi2x2.stoneHandpickID + 2, InfiMaterialEnum.Stone, InfiMaterialEnum.Sandstone, "sandstoneStoneHandpick");
			boneStoneHandpick = new InfiToolHandpick(PropsHelperInfi2x2.stoneHandpickID + 3, InfiMaterialEnum.Stone, InfiMaterialEnum.Bone, "boneStoneHandpick");
			netherrackStoneHandpick = new InfiToolHandpick(PropsHelperInfi2x2.stoneHandpickID + 4, InfiMaterialEnum.Stone, InfiMaterialEnum.Netherrack, "netherrackStoneHandpick");
			iceStoneHandpick = new InfiToolHandpick(PropsHelperInfi2x2.stoneHandpickID + 5, InfiMaterialEnum.Stone, InfiMaterialEnum.Ice, "iceStoneHandpick");
			slimeStoneHandpick = new InfiToolHandpick(PropsHelperInfi2x2.stoneHandpickID + 6, InfiMaterialEnum.Stone, InfiMaterialEnum.Slime, "slimeStoneHandpick");
			cactusStoneHandpick = new InfiToolHandpick(PropsHelperInfi2x2.stoneHandpickID + 7, InfiMaterialEnum.Stone, InfiMaterialEnum.Cactus, "cactusStoneHandpick");
			flintStoneHandpick = new InfiToolHandpick(PropsHelperInfi2x2.stoneHandpickID + 8, InfiMaterialEnum.Stone, InfiMaterialEnum.Flint, "flintStoneHandpick");
		}

		if (PropsHelperInfi2x2.enableIronTools)
		{
			woodIronHandpick = new InfiToolHandpick(PropsHelperInfi2x2.ironHandpickID + 0, InfiMaterialEnum.Iron, InfiMaterialEnum.Wood, "woodIronHandpick");
			stoneIronHandpick = new InfiToolHandpick(PropsHelperInfi2x2.ironHandpickID + 1, InfiMaterialEnum.Iron, InfiMaterialEnum.Stone, "stoneIronHandpick");
			ironIronHandpick = new InfiToolHandpick(PropsHelperInfi2x2.ironHandpickID + 2, InfiMaterialEnum.Iron, InfiMaterialEnum.Iron, "ironIronHandpick");
			boneIronHandpick = new InfiToolHandpick(PropsHelperInfi2x2.ironHandpickID + 3, InfiMaterialEnum.Iron, InfiMaterialEnum.Bone, "boneIronHandpick");
			netherrackIronHandpick = new InfiToolHandpick(PropsHelperInfi2x2.ironHandpickID + 4, InfiMaterialEnum.Iron, InfiMaterialEnum.Netherrack, "netherrackIronHandpick");
			glowstoneIronHandpick = new InfiToolHandpick(PropsHelperInfi2x2.ironHandpickID + 5, InfiMaterialEnum.Iron, InfiMaterialEnum.Glowstone, "glowstoneIronHandpick");
			cactusIronHandpick = new InfiToolHandpick(PropsHelperInfi2x2.ironHandpickID + 6, InfiMaterialEnum.Iron, InfiMaterialEnum.Cactus, "cactusIronHandpick");
			copperIronHandpick = new InfiToolHandpick(PropsHelperInfi2x2.ironHandpickID + 7, InfiMaterialEnum.Iron, InfiMaterialEnum.Copper, "copperIronHandpick");
			bronzeIronHandpick = new InfiToolHandpick(PropsHelperInfi2x2.ironHandpickID + 8, InfiMaterialEnum.Iron, InfiMaterialEnum.Bronze, "bronzeIronHandpick");
		}

		if (PropsHelperInfi2x2.enableDiamondTools)
		{
			woodDiamondHandpick = new InfiToolHandpick(PropsHelperInfi2x2.diamondHandpickID + 0, InfiMaterialEnum.Diamond, InfiMaterialEnum.Wood, "woodDiamondHandpick");
			stoneDiamondHandpick = new InfiToolHandpick(PropsHelperInfi2x2.diamondHandpickID + 1, InfiMaterialEnum.Diamond, InfiMaterialEnum.Stone, "stoneDiamondHandpick");
			ironDiamondHandpick = new InfiToolHandpick(PropsHelperInfi2x2.diamondHandpickID + 2, InfiMaterialEnum.Diamond, InfiMaterialEnum.Iron, "ironDiamondHandpick");
			diamondDiamondHandpick = new InfiToolHandpick(PropsHelperInfi2x2.diamondHandpickID + 3, InfiMaterialEnum.Diamond, InfiMaterialEnum.Diamond, "diamondDiamondHandpick");
			redstoneDiamondHandpick = new InfiToolHandpick(PropsHelperInfi2x2.diamondHandpickID + 4, InfiMaterialEnum.Diamond, InfiMaterialEnum.Redstone, "redstoneDiamondHandpick");
			obsidianDiamondHandpick = new InfiToolHandpick(PropsHelperInfi2x2.diamondHandpickID + 5, InfiMaterialEnum.Diamond, InfiMaterialEnum.Obsidian, "obsidianDiamondHandpick");
			boneDiamondHandpick = new InfiToolHandpick(PropsHelperInfi2x2.diamondHandpickID + 6, InfiMaterialEnum.Diamond, InfiMaterialEnum.Bone, "boneDiamondHandpick");
			mossyDiamondHandpick = new InfiToolHandpick(PropsHelperInfi2x2.diamondHandpickID + 7, InfiMaterialEnum.Diamond, InfiMaterialEnum.Mossy, "mossyDiamondHandpick");
			netherrackDiamondHandpick = new InfiToolHandpick(PropsHelperInfi2x2.diamondHandpickID + 8, InfiMaterialEnum.Diamond, InfiMaterialEnum.Netherrack, "netherrackDiamondHandpick");
			glowstoneDiamondHandpick = new InfiToolHandpick(PropsHelperInfi2x2.diamondHandpickID + 9, InfiMaterialEnum.Diamond, InfiMaterialEnum.Glowstone, "glowstoneDiamondHandpick");
			lavaDiamondHandpick = new InfiToolHandpick(PropsHelperInfi2x2.diamondHandpickID + 10, InfiMaterialEnum.Diamond, InfiMaterialEnum.Lava, "lavaDiamondHandpick");
			cactusDiamondHandpick = new InfiToolHandpick(PropsHelperInfi2x2.diamondHandpickID + 11, InfiMaterialEnum.Diamond, InfiMaterialEnum.Cactus, "cactusDiamondHandpick");
			flintDiamondHandpick = new InfiToolHandpick(PropsHelperInfi2x2.diamondHandpickID + 12, InfiMaterialEnum.Diamond, InfiMaterialEnum.Flint, "flintDiamondHandpick");
			blazeDiamondHandpick = new InfiToolHandpick(PropsHelperInfi2x2.diamondHandpickID + 13, InfiMaterialEnum.Diamond, InfiMaterialEnum.Blaze, "blazeDiamondHandpick");
			copperDiamondHandpick = new InfiToolHandpick(PropsHelperInfi2x2.diamondHandpickID + 14, InfiMaterialEnum.Diamond, InfiMaterialEnum.Copper, "copperDiamondHandpick");
			bronzeDiamondHandpick = new InfiToolHandpick(PropsHelperInfi2x2.diamondHandpickID + 15, InfiMaterialEnum.Diamond, InfiMaterialEnum.Bronze, "bronzeDiamondHandpick");
			workedDiamondHandpick = new InfiToolHandpick(PropsHelperInfi2x2.diamondHandpickID + 16, InfiMaterialEnum.Diamond, InfiMaterialEnum.WorkedIron, "workedDiamondHandpick");
			steelDiamondHandpick = new InfiToolHandpick(PropsHelperInfi2x2.diamondHandpickID + 17, InfiMaterialEnum.Diamond, InfiMaterialEnum.Steel, "steelDiamondHandpick");
			cobaltDiamondHandpick = new InfiToolHandpick(PropsHelperInfi2x2.diamondHandpickID + 18, InfiMaterialEnum.Diamond, InfiMaterialEnum.Cobalt, "cobaltDiamondHandpick");
			arditeDiamondHandpick = new InfiToolHandpick(PropsHelperInfi2x2.diamondHandpickID + 19, InfiMaterialEnum.Diamond, InfiMaterialEnum.Ardite, "arditeDiamondHandpick");
			manyullynDiamondHandpick = new InfiToolHandpick(PropsHelperInfi2x2.diamondHandpickID + 20, InfiMaterialEnum.Diamond, InfiMaterialEnum.Manyullyn, "manyullynDiamondHandpick");
			uraniumDiamondHandpick = new InfiToolHandpick(PropsHelperInfi2x2.diamondHandpickID + 21, InfiMaterialEnum.Diamond, InfiMaterialEnum.Uranium, "uraniumDiamondHandpick");
		}

		if (PropsHelperInfi2x2.enableRedstoneTools)
		{
			woodRedstoneHandpick = new InfiToolHandpick(PropsHelperInfi2x2.redstoneHandpickID + 0, InfiMaterialEnum.Redstone, InfiMaterialEnum.Wood, "woodRedstoneHandpick");
			stoneRedstoneHandpick = new InfiToolHandpick(PropsHelperInfi2x2.redstoneHandpickID + 1, InfiMaterialEnum.Redstone, InfiMaterialEnum.Stone, "stoneRedstoneHandpick");
			ironRedstoneHandpick = new InfiToolHandpick(PropsHelperInfi2x2.redstoneHandpickID + 2, InfiMaterialEnum.Redstone, InfiMaterialEnum.Iron, "ironRedstoneHandpick");
			redstoneRedstoneHandpick = new InfiToolHandpick(PropsHelperInfi2x2.redstoneHandpickID + 3, InfiMaterialEnum.Redstone, InfiMaterialEnum.Redstone, "redstoneRedstoneHandpick");
			obsidianRedstoneHandpick = new InfiToolHandpick(PropsHelperInfi2x2.redstoneHandpickID + 4, InfiMaterialEnum.Redstone, InfiMaterialEnum.Obsidian, "obsidianRedstoneHandpick");
			sandstoneRedstoneHandpick = new InfiToolHandpick(PropsHelperInfi2x2.redstoneHandpickID + 5, InfiMaterialEnum.Redstone, InfiMaterialEnum.Sandstone, "sandstoneRedstoneHandpick");
			boneRedstoneHandpick = new InfiToolHandpick(PropsHelperInfi2x2.redstoneHandpickID + 6, InfiMaterialEnum.Redstone, InfiMaterialEnum.Bone, "boneRedstoneHandpick");
			paperRedstoneHandpick = new InfiToolHandpick(PropsHelperInfi2x2.redstoneHandpickID + 7, InfiMaterialEnum.Redstone, InfiMaterialEnum.Paper, "paperRedstoneHandpick");
			mossyRedstoneHandpick = new InfiToolHandpick(PropsHelperInfi2x2.redstoneHandpickID + 8, InfiMaterialEnum.Redstone, InfiMaterialEnum.Mossy, "mossyRedstoneHandpick");
			netherrackRedstoneHandpick = new InfiToolHandpick(PropsHelperInfi2x2.redstoneHandpickID + 9, InfiMaterialEnum.Redstone, InfiMaterialEnum.Netherrack, "netherrackRedstoneHandpick");
			glowstoneRedstoneHandpick = new InfiToolHandpick(PropsHelperInfi2x2.redstoneHandpickID + 10, InfiMaterialEnum.Redstone, InfiMaterialEnum.Glowstone, "glowstoneRedstoneHandpick");
			iceRedstoneHandpick = new InfiToolHandpick(PropsHelperInfi2x2.redstoneHandpickID + 11, InfiMaterialEnum.Redstone, InfiMaterialEnum.Ice, "iceRedstoneHandpick");
			lavaRedstoneHandpick = new InfiToolHandpick(PropsHelperInfi2x2.redstoneHandpickID + 12, InfiMaterialEnum.Redstone, InfiMaterialEnum.Lava, "lavaRedstoneHandpick");
			slimeRedstoneHandpick = new InfiToolHandpick(PropsHelperInfi2x2.redstoneHandpickID + 13, InfiMaterialEnum.Redstone, InfiMaterialEnum.Slime, "slimeRedstoneHandpick");
			cactusRedstoneHandpick = new InfiToolHandpick(PropsHelperInfi2x2.redstoneHandpickID + 14, InfiMaterialEnum.Redstone, InfiMaterialEnum.Cactus, "cactusRedstoneHandpick");
			flintRedstoneHandpick = new InfiToolHandpick(PropsHelperInfi2x2.redstoneHandpickID + 15, InfiMaterialEnum.Redstone, InfiMaterialEnum.Flint, "flintRedstoneHandpick");
			copperRedstoneHandpick = new InfiToolHandpick(PropsHelperInfi2x2.redstoneHandpickID + 16, InfiMaterialEnum.Redstone, InfiMaterialEnum.Copper, "copperRedstoneHandpick");
			bronzeRedstoneHandpick = new InfiToolHandpick(PropsHelperInfi2x2.redstoneHandpickID + 17, InfiMaterialEnum.Redstone, InfiMaterialEnum.Bronze, "bronzeRedstoneHandpick");
			workedRedstoneHandpick = new InfiToolHandpick(PropsHelperInfi2x2.redstoneHandpickID + 18, InfiMaterialEnum.Redstone, InfiMaterialEnum.WorkedIron, "workedRedstoneHandpick");
			uraniumRedstoneHandpick = new InfiToolHandpick(PropsHelperInfi2x2.redstoneHandpickID + 19, InfiMaterialEnum.Redstone, InfiMaterialEnum.Uranium, "uraniumRedstoneHandpick");
		}

		if (PropsHelperInfi2x2.enableObsidianTools)
		{
			woodObsidianHandpick = new InfiToolHandpick(PropsHelperInfi2x2.obsidianHandpickID + 0, InfiMaterialEnum.Obsidian, InfiMaterialEnum.Wood, "woodObsidianHandpick");
			stoneObsidianHandpick = new InfiToolHandpick(PropsHelperInfi2x2.obsidianHandpickID + 1, InfiMaterialEnum.Obsidian, InfiMaterialEnum.Stone, "stoneObsidianHandpick");
			redstoneObsidianHandpick = new InfiToolHandpick(PropsHelperInfi2x2.obsidianHandpickID + 2, InfiMaterialEnum.Obsidian, InfiMaterialEnum.Redstone, "redstoneObsidianHandpick");
			obsidianObsidianHandpick = new InfiToolHandpick(PropsHelperInfi2x2.obsidianHandpickID + 3, InfiMaterialEnum.Obsidian, InfiMaterialEnum.Obsidian, "obsidianObsidianHandpick");
			;
			boneObsidianHandpick = new InfiToolHandpick(PropsHelperInfi2x2.obsidianHandpickID + 4, InfiMaterialEnum.Obsidian, InfiMaterialEnum.Bone, "boneObsidianHandpick");
			netherrackObsidianHandpick = new InfiToolHandpick(PropsHelperInfi2x2.obsidianHandpickID + 5, InfiMaterialEnum.Obsidian, InfiMaterialEnum.Netherrack, "netherrackObsidianHandpick");
			glowstoneObsidianHandpick = new InfiToolHandpick(PropsHelperInfi2x2.obsidianHandpickID + 6, InfiMaterialEnum.Obsidian, InfiMaterialEnum.Glowstone, "glowstoneObsidianHandpick");
			iceObsidianHandpick = new InfiToolHandpick(PropsHelperInfi2x2.obsidianHandpickID + 7, InfiMaterialEnum.Obsidian, InfiMaterialEnum.Ice, "iceObsidianHandpick");
			lavaObsidianHandpick = new InfiToolHandpick(PropsHelperInfi2x2.obsidianHandpickID + 8, InfiMaterialEnum.Obsidian, InfiMaterialEnum.Lava, "lavaObsidianHandpick");
			cactusObsidianHandpick = new InfiToolHandpick(PropsHelperInfi2x2.obsidianHandpickID + 9, InfiMaterialEnum.Obsidian, InfiMaterialEnum.Cactus, "cactusObsidianHandpick");
		}

		if (PropsHelperInfi2x2.enableSandstoneTools)
		{
			woodSandstoneHandpick = new InfiToolHandpick(PropsHelperInfi2x2.sandstoneHandpickID + 0, InfiMaterialEnum.Sandstone, InfiMaterialEnum.Wood, "woodSandstoneHandpick");
			sandstoneSandstoneHandpick = new InfiToolHandpick(PropsHelperInfi2x2.sandstoneHandpickID + 1, InfiMaterialEnum.Sandstone, InfiMaterialEnum.Sandstone, "sandstoneSandstoneHandpick");
			boneSandstoneHandpick = new InfiToolHandpick(PropsHelperInfi2x2.sandstoneHandpickID + 2, InfiMaterialEnum.Sandstone, InfiMaterialEnum.Bone, "boneSandstoneHandpick");
			netherrackSandstoneHandpick = new InfiToolHandpick(PropsHelperInfi2x2.sandstoneHandpickID + 3, InfiMaterialEnum.Sandstone, InfiMaterialEnum.Netherrack, "netherrackSandstoneHandpick");
			iceSandstoneHandpick = new InfiToolHandpick(PropsHelperInfi2x2.sandstoneHandpickID + 4, InfiMaterialEnum.Sandstone, InfiMaterialEnum.Ice, "iceSandstoneHandpick");
			slimeSandstoneHandpick = new InfiToolHandpick(PropsHelperInfi2x2.sandstoneHandpickID + 5, InfiMaterialEnum.Sandstone, InfiMaterialEnum.Slime, "slimeSandstoneHandpick");
			cactusSandstoneHandpick = new InfiToolHandpick(PropsHelperInfi2x2.sandstoneHandpickID + 6, InfiMaterialEnum.Sandstone, InfiMaterialEnum.Cactus, "cactusSandstoneHandpick");
			flintSandstoneHandpick = new InfiToolHandpick(PropsHelperInfi2x2.sandstoneHandpickID + 7, InfiMaterialEnum.Sandstone, InfiMaterialEnum.Flint, "flintSandstoneHandpick");
		}

		if (PropsHelperInfi2x2.enableBoneTools)
		{
			woodBoneHandpick = new InfiToolHandpick(PropsHelperInfi2x2.boneHandpickID + 0, InfiMaterialEnum.Bone, InfiMaterialEnum.Bone, "woodBoneHandpick");
			stoneBoneHandpick = new InfiToolHandpick(PropsHelperInfi2x2.boneHandpickID + 1, InfiMaterialEnum.Bone, InfiMaterialEnum.Stone, "stoneBoneHandpick");
			sandstoneBoneHandpick = new InfiToolHandpick(PropsHelperInfi2x2.boneHandpickID + 2, InfiMaterialEnum.Bone, InfiMaterialEnum.Sandstone, "sandstoneBoneHandpick");
			boneBoneHandpick = new InfiToolHandpick(PropsHelperInfi2x2.boneHandpickID + 3, InfiMaterialEnum.Bone, InfiMaterialEnum.Bone, "boneBoneHandpick");
			paperBoneHandpick = new InfiToolHandpick(PropsHelperInfi2x2.boneHandpickID + 4, InfiMaterialEnum.Bone, InfiMaterialEnum.Paper, "paperBoneHandpick");
			netherrackBoneHandpick = new InfiToolHandpick(PropsHelperInfi2x2.boneHandpickID + 5, InfiMaterialEnum.Bone, InfiMaterialEnum.Netherrack, "netherrackBoneHandpick");
			iceBoneHandpick = new InfiToolHandpick(PropsHelperInfi2x2.boneHandpickID + 6, InfiMaterialEnum.Bone, InfiMaterialEnum.Ice, "iceBoneHandpick");
			cactusBoneHandpick = new InfiToolHandpick(PropsHelperInfi2x2.boneHandpickID + 7, InfiMaterialEnum.Bone, InfiMaterialEnum.Cactus, "cactusBoneHandpick");
			flintBoneHandpick = new InfiToolHandpick(PropsHelperInfi2x2.boneHandpickID + 8, InfiMaterialEnum.Bone, InfiMaterialEnum.Flint, "flintBoneHandpick");
		}

		if (PropsHelperInfi2x2.enablePaperTools)
		{
			woodPaperHandpick = new InfiToolHandpick(PropsHelperInfi2x2.paperHandpickID + 0, InfiMaterialEnum.Paper, InfiMaterialEnum.Wood, "woodPaperHandpick");
			bonePaperHandpick = new InfiToolHandpick(PropsHelperInfi2x2.paperHandpickID + 1, InfiMaterialEnum.Paper, InfiMaterialEnum.Bone, "bonePaperHandpick");
			paperPaperHandpick = new InfiToolHandpick(PropsHelperInfi2x2.paperHandpickID + 2, InfiMaterialEnum.Paper, InfiMaterialEnum.Paper, "paperPaperHandpick");
			slimePaperHandpick = new InfiToolHandpick(PropsHelperInfi2x2.paperHandpickID + 3, InfiMaterialEnum.Paper, InfiMaterialEnum.Slime, "slimePaperHandpick");
			cactusPaperHandpick = new InfiToolHandpick(PropsHelperInfi2x2.paperHandpickID + 4, InfiMaterialEnum.Paper, InfiMaterialEnum.Cactus, "cactusPaperHandpick");
		}

		if (PropsHelperInfi2x2.enableMossyTools)
		{
			woodMossyHandpick = new InfiToolHandpick(PropsHelperInfi2x2.mossyHandpickID + 0, InfiMaterialEnum.Mossy, InfiMaterialEnum.Wood, "woodMossyHandpick");
			stoneMossyHandpick = new InfiToolHandpick(PropsHelperInfi2x2.mossyHandpickID + 1, InfiMaterialEnum.Mossy, InfiMaterialEnum.Stone, "stoneMossyHandpick");
			diamondMossyHandpick = new InfiToolHandpick(PropsHelperInfi2x2.mossyHandpickID + 2, InfiMaterialEnum.Mossy, InfiMaterialEnum.Diamond, "diamondMossyHandpick");
			redstoneMossyHandpick = new InfiToolHandpick(PropsHelperInfi2x2.mossyHandpickID + 3, InfiMaterialEnum.Mossy, InfiMaterialEnum.Redstone, "redstoneMossyHandpick");
			boneMossyHandpick = new InfiToolHandpick(PropsHelperInfi2x2.mossyHandpickID + 4, InfiMaterialEnum.Mossy, InfiMaterialEnum.Bone, "boneMossyHandpick");
			mossyMossyHandpick = new InfiToolHandpick(PropsHelperInfi2x2.mossyHandpickID + 5, InfiMaterialEnum.Mossy, InfiMaterialEnum.Mossy, "mossyMossyHandpick");
			netherrackMossyHandpick = new InfiToolHandpick(PropsHelperInfi2x2.mossyHandpickID + 6, InfiMaterialEnum.Mossy, InfiMaterialEnum.Netherrack, "netherrackMossyHandpick");
			glowstoneMossyHandpick = new InfiToolHandpick(PropsHelperInfi2x2.mossyHandpickID + 7, InfiMaterialEnum.Mossy, InfiMaterialEnum.Glowstone, "glowstoneMossyHandpick");
			cactusMossyHandpick = new InfiToolHandpick(PropsHelperInfi2x2.mossyHandpickID + 8, InfiMaterialEnum.Mossy, InfiMaterialEnum.Cactus, "cactusMossyHandpick");
			blazeMossyHandpick = new InfiToolHandpick(PropsHelperInfi2x2.mossyHandpickID + 9, InfiMaterialEnum.Mossy, InfiMaterialEnum.Blaze, "blazeMossyHandpick");
			manyullynMossyHandpick = new InfiToolHandpick(PropsHelperInfi2x2.mossyHandpickID + 10, InfiMaterialEnum.Mossy, InfiMaterialEnum.Manyullyn, "manyullynMossyHandpick");
			uraniumMossyHandpick = new InfiToolHandpick(PropsHelperInfi2x2.mossyHandpickID + 11, InfiMaterialEnum.Mossy, InfiMaterialEnum.Uranium, "uraniumMossyHandpick");
		}

		if (PropsHelperInfi2x2.enableNetherrackTools)
		{
			woodNetherrackHandpick = new InfiToolHandpick(PropsHelperInfi2x2.netherrackHandpickID + 0, InfiMaterialEnum.Netherrack, InfiMaterialEnum.Wood, "woodNetherrackHandpick");
			stoneNetherrackHandpick = new InfiToolHandpick(PropsHelperInfi2x2.netherrackHandpickID + 1, InfiMaterialEnum.Netherrack, InfiMaterialEnum.Stone, "stoneNetherrackHandpick");
			sandstoneNetherrackHandpick = new InfiToolHandpick(PropsHelperInfi2x2.netherrackHandpickID + 2, InfiMaterialEnum.Netherrack, InfiMaterialEnum.Sandstone, "sandstoneNetherrackHandpick");
			boneNetherrackHandpick = new InfiToolHandpick(PropsHelperInfi2x2.netherrackHandpickID + 3, InfiMaterialEnum.Netherrack, InfiMaterialEnum.Bone, "boneNetherrackHandpick");
			paperNetherrackHandpick = new InfiToolHandpick(PropsHelperInfi2x2.netherrackHandpickID + 4, InfiMaterialEnum.Netherrack, InfiMaterialEnum.Paper, "paperNetherrackHandpick");
			mossyNetherrackHandpick = new InfiToolHandpick(PropsHelperInfi2x2.netherrackHandpickID + 5, InfiMaterialEnum.Netherrack, InfiMaterialEnum.Mossy, "mossyNetherrackHandpick");
			netherrackNetherrackHandpick = new InfiToolHandpick(PropsHelperInfi2x2.netherrackHandpickID + 6, InfiMaterialEnum.Netherrack, InfiMaterialEnum.Netherrack, "netherrackNetherrackHandpick");
			iceNetherrackHandpick = new InfiToolHandpick(PropsHelperInfi2x2.netherrackHandpickID + 7, InfiMaterialEnum.Netherrack, InfiMaterialEnum.Ice, "iceNetherrackHandpick");
			slimeNetherrackHandpick = new InfiToolHandpick(PropsHelperInfi2x2.netherrackHandpickID + 8, InfiMaterialEnum.Netherrack, InfiMaterialEnum.Slime, "slimeNetherrackHandpick");
			cactusNetherrackHandpick = new InfiToolHandpick(PropsHelperInfi2x2.netherrackHandpickID + 9, InfiMaterialEnum.Netherrack, InfiMaterialEnum.Cactus, "cactusNetherrackHandpick");
			flintNetherrackHandpick = new InfiToolHandpick(PropsHelperInfi2x2.netherrackHandpickID + 10, InfiMaterialEnum.Netherrack, InfiMaterialEnum.Flint, "flintNetherrackHandpick");
			copperNetherrackHandpick = new InfiToolHandpick(PropsHelperInfi2x2.netherrackHandpickID + 11, InfiMaterialEnum.Netherrack, InfiMaterialEnum.Copper, "copperNetherrackHandpick");
			bronzeNetherrackHandpick = new InfiToolHandpick(PropsHelperInfi2x2.netherrackHandpickID + 12, InfiMaterialEnum.Netherrack, InfiMaterialEnum.Bronze, "bronzeNetherrackHandpick");

		}

		if (PropsHelperInfi2x2.enableGlowstoneTools)
		{
			woodGlowstoneHandpick = new InfiToolHandpick(PropsHelperInfi2x2.glowstoneHandpickID + 0, InfiMaterialEnum.Glowstone, InfiMaterialEnum.Wood, "woodGlowstoneHandpick");
			redstoneGlowstoneHandpick = new InfiToolHandpick(PropsHelperInfi2x2.glowstoneHandpickID + 1, InfiMaterialEnum.Glowstone, InfiMaterialEnum.Redstone, "redstoneGlowstoneHandpick");
			obsidianGlowstoneHandpick = new InfiToolHandpick(PropsHelperInfi2x2.glowstoneHandpickID + 2, InfiMaterialEnum.Glowstone, InfiMaterialEnum.Obsidian, "obsidianGlowstoneHandpick");
			boneGlowstoneHandpick = new InfiToolHandpick(PropsHelperInfi2x2.glowstoneHandpickID + 3, InfiMaterialEnum.Glowstone, InfiMaterialEnum.Bone, "boneGlowstoneHandpick");
			netherrackGlowstoneHandpick = new InfiToolHandpick(PropsHelperInfi2x2.glowstoneHandpickID + 4, InfiMaterialEnum.Glowstone, InfiMaterialEnum.Netherrack, "netherrackGlowstoneHandpick");
			glowstoneGlowstoneHandpick = new InfiToolHandpick(PropsHelperInfi2x2.glowstoneHandpickID + 5, InfiMaterialEnum.Glowstone, InfiMaterialEnum.Glowstone, "glowstoneGlowstoneHandpick");
			iceGlowstoneHandpick = new InfiToolHandpick(PropsHelperInfi2x2.glowstoneHandpickID + 6, InfiMaterialEnum.Glowstone, InfiMaterialEnum.Ice, "iceGlowstoneHandpick");
			slimeGlowstoneHandpick = new InfiToolHandpick(PropsHelperInfi2x2.glowstoneHandpickID + 7, InfiMaterialEnum.Glowstone, InfiMaterialEnum.Slime, "slimeGlowstoneHandpick");
			cactusGlowstoneHandpick = new InfiToolHandpick(PropsHelperInfi2x2.glowstoneHandpickID + 8, InfiMaterialEnum.Glowstone, InfiMaterialEnum.Cactus, "cactusGlowstoneHandpick");

		}

		if (PropsHelperInfi2x2.enableIceTools)
		{
			woodIceHandpick = new InfiToolHandpick(PropsHelperInfi2x2.iceHandpickID + 0, InfiMaterialEnum.Ice, InfiMaterialEnum.Wood, "woodIceHandpick");
			boneIceHandpick = new InfiToolHandpick(PropsHelperInfi2x2.iceHandpickID + 1, InfiMaterialEnum.Ice, InfiMaterialEnum.Bone, "boneIceHandpick");
			paperIceHandpick = new InfiToolHandpick(PropsHelperInfi2x2.iceHandpickID + 2, InfiMaterialEnum.Ice, InfiMaterialEnum.Paper, "paperIceHandpick");
			iceIceHandpick = new InfiToolHandpick(PropsHelperInfi2x2.iceHandpickID + 3, InfiMaterialEnum.Ice, InfiMaterialEnum.Ice, "iceIceHandpick");
			slimeIceHandpick = new InfiToolHandpick(PropsHelperInfi2x2.iceHandpickID + 4, InfiMaterialEnum.Ice, InfiMaterialEnum.Slime, "slimeIceHandpick");
			cactusIceHandpick = new InfiToolHandpick(PropsHelperInfi2x2.iceHandpickID + 5, InfiMaterialEnum.Ice, InfiMaterialEnum.Cactus, "cactusIceHandpick");

		}

		if (PropsHelperInfi2x2.enableLavaTools)
		{
			diamondLavaHandpick = new InfiToolHandpick(PropsHelperInfi2x2.lavaHandpickID + 0, InfiMaterialEnum.Lava, InfiMaterialEnum.Diamond, "diamondLavaHandpick");
			obsidianLavaHandpick = new InfiToolHandpick(PropsHelperInfi2x2.lavaHandpickID + 1, InfiMaterialEnum.Lava, InfiMaterialEnum.Obsidian, "obsidianLavaHandpick");
			netherrackLavaHandpick = new InfiToolHandpick(PropsHelperInfi2x2.lavaHandpickID + 2, InfiMaterialEnum.Lava, InfiMaterialEnum.Netherrack, "netherrackLavaHandpick");
			lavaLavaHandpick = new InfiToolHandpick(PropsHelperInfi2x2.lavaHandpickID + 3, InfiMaterialEnum.Lava, InfiMaterialEnum.Lava, "lavaLavaHandpick");
			flintLavaHandpick = new InfiToolHandpick(PropsHelperInfi2x2.lavaHandpickID + 4, InfiMaterialEnum.Lava, InfiMaterialEnum.Flint, "flintLavaHandpick");
			blazeLavaHandpick = new InfiToolHandpick(PropsHelperInfi2x2.lavaHandpickID + 5, InfiMaterialEnum.Lava, InfiMaterialEnum.Blaze, "blazeLavaHandpick");
			manyullynLavaHandpick = new InfiToolHandpick(PropsHelperInfi2x2.lavaHandpickID + 6, InfiMaterialEnum.Lava, InfiMaterialEnum.Manyullyn, "manyullynLavaHandpick");
			uraniumLavaHandpick = new InfiToolHandpick(PropsHelperInfi2x2.lavaHandpickID + 7, InfiMaterialEnum.Lava, InfiMaterialEnum.Uranium, "uraniumLavaHandpick");

		}

		if (PropsHelperInfi2x2.enableSlimeTools)
		{
			woodSlimeHandpick = new InfiToolHandpick(PropsHelperInfi2x2.slimeHandpickID + 0, InfiMaterialEnum.Slime, InfiMaterialEnum.Wood, "woodSlimeHandpick");
			sandstoneSlimeHandpick = new InfiToolHandpick(PropsHelperInfi2x2.slimeHandpickID + 1, InfiMaterialEnum.Slime, InfiMaterialEnum.Sandstone, "sandstoneSlimeHandpick");
			boneSlimeHandpick = new InfiToolHandpick(PropsHelperInfi2x2.slimeHandpickID + 2, InfiMaterialEnum.Slime, InfiMaterialEnum.Bone, "boneSlimeHandpick");
			paperSlimeHandpick = new InfiToolHandpick(PropsHelperInfi2x2.slimeHandpickID + 3, InfiMaterialEnum.Slime, InfiMaterialEnum.Paper, "paperSlimeHandpick");
			slimeSlimeHandpick = new InfiToolHandpick(PropsHelperInfi2x2.slimeHandpickID + 4, InfiMaterialEnum.Slime, InfiMaterialEnum.Slime, "slimeSlimeHandpick");
			cactusSlimeHandpick = new InfiToolHandpick(PropsHelperInfi2x2.slimeHandpickID + 5, InfiMaterialEnum.Slime, InfiMaterialEnum.Cactus, "cactusSlimeHandpick");

		}

		if (PropsHelperInfi2x2.enableCactusTools)
		{
			woodCactusHandpick = new InfiToolHandpick(PropsHelperInfi2x2.cactusHandpickID + 0, InfiMaterialEnum.Cactus, InfiMaterialEnum.Wood, "woodCactusHandpick");
			sandstoneCactusHandpick = new InfiToolHandpick(PropsHelperInfi2x2.cactusHandpickID + 1, InfiMaterialEnum.Cactus, InfiMaterialEnum.Sandstone, "sandstoneCactusHandpick");
			boneCactusHandpick = new InfiToolHandpick(PropsHelperInfi2x2.cactusHandpickID + 2, InfiMaterialEnum.Cactus, InfiMaterialEnum.Bone, "boneCactusHandpick");
			netherrackCactusHandpick = new InfiToolHandpick(PropsHelperInfi2x2.cactusHandpickID + 3, InfiMaterialEnum.Cactus, InfiMaterialEnum.Netherrack, "netherrackCactusHandpick");
			iceCactusHandpick = new InfiToolHandpick(PropsHelperInfi2x2.cactusHandpickID + 4, InfiMaterialEnum.Cactus, InfiMaterialEnum.Ice, "iceCactusHandpick");
			slimeCactusHandpick = new InfiToolHandpick(PropsHelperInfi2x2.cactusHandpickID + 5, InfiMaterialEnum.Cactus, InfiMaterialEnum.Slime, "slimeCactusHandpick");
			cactusCactusHandpick = new InfiToolHandpick(PropsHelperInfi2x2.cactusHandpickID + 6, InfiMaterialEnum.Cactus, InfiMaterialEnum.Cactus, "cactusCactusHandpick");

		}

		if (PropsHelperInfi2x2.enableFlintTools)
		{
			woodFlintHandpick = new InfiToolHandpick(PropsHelperInfi2x2.flintHandpickID + 0, InfiMaterialEnum.Flint, InfiMaterialEnum.Wood, "woodFlintHandpick");
			stoneFlintHandpick = new InfiToolHandpick(PropsHelperInfi2x2.flintHandpickID + 1, InfiMaterialEnum.Flint, InfiMaterialEnum.Stone, "stoneFlintHandpick");
			sandstoneFlintHandpick = new InfiToolHandpick(PropsHelperInfi2x2.flintHandpickID + 2, InfiMaterialEnum.Flint, InfiMaterialEnum.Sandstone, "sandstoneFlintHandpick");
			boneFlintHandpick = new InfiToolHandpick(PropsHelperInfi2x2.flintHandpickID + 3, InfiMaterialEnum.Flint, InfiMaterialEnum.Bone, "boneFlintHandpick");
			netherrackFlintHandpick = new InfiToolHandpick(PropsHelperInfi2x2.flintHandpickID + 4, InfiMaterialEnum.Flint, InfiMaterialEnum.Flint, "netherrackFlintHandpick");
			slimeFlintHandpick = new InfiToolHandpick(PropsHelperInfi2x2.flintHandpickID + 5, InfiMaterialEnum.Flint, InfiMaterialEnum.Slime, "slimeFlintHandpick");
			cactusFlintHandpick = new InfiToolHandpick(PropsHelperInfi2x2.flintHandpickID + 6, InfiMaterialEnum.Flint, InfiMaterialEnum.Cactus, "cactusFlintHandpick");
			flintFlintHandpick = new InfiToolHandpick(PropsHelperInfi2x2.flintHandpickID + 7, InfiMaterialEnum.Flint, InfiMaterialEnum.Flint, "flintFlintHandpick");
			copperFlintHandpick = new InfiToolHandpick(PropsHelperInfi2x2.flintHandpickID + 8, InfiMaterialEnum.Flint, InfiMaterialEnum.Copper, "copperFlintHandpick");
			bronzeFlintHandpick = new InfiToolHandpick(PropsHelperInfi2x2.flintHandpickID + 9, InfiMaterialEnum.Flint, InfiMaterialEnum.Bronze, "bronzeFlintHandpick");

		}

		if (PropsHelperInfi2x2.enableBlazeTools)
		{
			diamondBlazeHandpick = new InfiToolHandpick(PropsHelperInfi2x2.blazeHandpickID + 0, InfiMaterialEnum.Blaze, InfiMaterialEnum.Diamond, "diamondBlazeHandpick");
			obsidianBlazeHandpick = new InfiToolHandpick(PropsHelperInfi2x2.blazeHandpickID + 1, InfiMaterialEnum.Blaze, InfiMaterialEnum.Obsidian, "obsidianBlazeHandpick");
			netherrackBlazeHandpick = new InfiToolHandpick(PropsHelperInfi2x2.blazeHandpickID + 2, InfiMaterialEnum.Blaze, InfiMaterialEnum.Netherrack, "netherrackBlazeHandpick");
			lavaBlazeHandpick = new InfiToolHandpick(PropsHelperInfi2x2.blazeHandpickID + 3, InfiMaterialEnum.Blaze, InfiMaterialEnum.Lava, "lavaBlazeHandpick");
			flintBlazeHandpick = new InfiToolHandpick(PropsHelperInfi2x2.blazeHandpickID + 4, InfiMaterialEnum.Blaze, InfiMaterialEnum.Flint, "flintBlazeHandpick");
			blazeBlazeHandpick = new InfiToolHandpick(PropsHelperInfi2x2.blazeHandpickID + 5, InfiMaterialEnum.Blaze, InfiMaterialEnum.Blaze, "blazeBlazeHandpick");
			manyullynBlazeHandpick = new InfiToolHandpick(PropsHelperInfi2x2.blazeHandpickID + 6, InfiMaterialEnum.Blaze, InfiMaterialEnum.Manyullyn, "manyullynBlazeHandpick");
			uraniumBlazeHandpick = new InfiToolHandpick(PropsHelperInfi2x2.blazeHandpickID + 7, InfiMaterialEnum.Blaze, InfiMaterialEnum.Uranium, "uraniumBlazeHandpick");

		}

		if (PropsHelperInfi2x2.enableCopperTools)
		{
			woodCopperHandpick = new InfiToolHandpick(PropsHelperInfi2x2.copperHandpickID + 0, InfiMaterialEnum.Copper, InfiMaterialEnum.Wood, "woodCopperHandpick");
			stoneCopperHandpick = new InfiToolHandpick(PropsHelperInfi2x2.copperHandpickID + 1, InfiMaterialEnum.Copper, InfiMaterialEnum.Stone, "stoneCopperHandpick");
			boneCopperHandpick = new InfiToolHandpick(PropsHelperInfi2x2.copperHandpickID + 2, InfiMaterialEnum.Copper, InfiMaterialEnum.Bone, "boneCopperHandpick");
			netherrackCopperHandpick = new InfiToolHandpick(PropsHelperInfi2x2.copperHandpickID + 3, InfiMaterialEnum.Copper, InfiMaterialEnum.Netherrack, "netherrackCopperHandpick");
			slimeCopperHandpick = new InfiToolHandpick(PropsHelperInfi2x2.copperHandpickID + 4, InfiMaterialEnum.Copper, InfiMaterialEnum.Slime, "slimeCopperHandpick");
			cactusCopperHandpick = new InfiToolHandpick(PropsHelperInfi2x2.copperHandpickID + 5, InfiMaterialEnum.Copper, InfiMaterialEnum.Cactus, "cactusCopperHandpick");
			flintCopperHandpick = new InfiToolHandpick(PropsHelperInfi2x2.copperHandpickID + 6, InfiMaterialEnum.Copper, InfiMaterialEnum.Flint, "flintCopperHandpick");
			copperCopperHandpick = new InfiToolHandpick(PropsHelperInfi2x2.copperHandpickID + 7, InfiMaterialEnum.Copper, InfiMaterialEnum.Copper, "copperCopperHandpick");

		}

		if (PropsHelperInfi2x2.enableBronzeTools)
		{
			woodBronzeHandpick = new InfiToolHandpick(PropsHelperInfi2x2.bronzeHandpickID + 0, InfiMaterialEnum.Bronze, InfiMaterialEnum.Wood, "woodBronzeHandpick");
			stoneBronzeHandpick = new InfiToolHandpick(PropsHelperInfi2x2.bronzeHandpickID + 1, InfiMaterialEnum.Bronze, InfiMaterialEnum.Stone, "stoneBronzeHandpick");
			boneBronzeHandpick = new InfiToolHandpick(PropsHelperInfi2x2.bronzeHandpickID + 2, InfiMaterialEnum.Bronze, InfiMaterialEnum.Bone, "boneBronzeHandpick");
			netherrackBronzeHandpick = new InfiToolHandpick(PropsHelperInfi2x2.bronzeHandpickID + 3, InfiMaterialEnum.Bronze, InfiMaterialEnum.Netherrack, "netherrackBronzeHandpick");
			slimeBronzeHandpick = new InfiToolHandpick(PropsHelperInfi2x2.bronzeHandpickID + 4, InfiMaterialEnum.Bronze, InfiMaterialEnum.Slime, "slimeBronzeHandpick");
			cactusBronzeHandpick = new InfiToolHandpick(PropsHelperInfi2x2.bronzeHandpickID + 5, InfiMaterialEnum.Bronze, InfiMaterialEnum.Cactus, "cactusBronzeHandpick");
			flintBronzeHandpick = new InfiToolHandpick(PropsHelperInfi2x2.bronzeHandpickID + 6, InfiMaterialEnum.Bronze, InfiMaterialEnum.Flint, "flintBronzeHandpick");
			copperBronzeHandpick = new InfiToolHandpick(PropsHelperInfi2x2.bronzeHandpickID + 7, InfiMaterialEnum.Bronze, InfiMaterialEnum.Copper, "copperBronzeHandpick");
			bronzeBronzeHandpick = new InfiToolHandpick(PropsHelperInfi2x2.bronzeHandpickID + 8, InfiMaterialEnum.Bronze, InfiMaterialEnum.Bronze, "bronzeBronzeHandpick");
		}

		if (PropsHelperInfi2x2.enableWorkedIronTools)
		{
			woodWorkedIronHandpick = new InfiToolHandpick(PropsHelperInfi2x2.workedIronHandpickID + 0, InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Wood, "woodWorkedIronHandpick");
			stoneWorkedIronHandpick = new InfiToolHandpick(PropsHelperInfi2x2.workedIronHandpickID + 1, InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Stone, "stoneWorkedIronHandpick");
			ironWorkedIronHandpick = new InfiToolHandpick(PropsHelperInfi2x2.workedIronHandpickID + 2, InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Iron, "ironWorkedIronHandpick");
			diamondWorkedIronHandpick = new InfiToolHandpick(PropsHelperInfi2x2.workedIronHandpickID + 3, InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Diamond, "diamondWorkedIronHandpick");
			redstoneWorkedIronHandpick = new InfiToolHandpick(PropsHelperInfi2x2.workedIronHandpickID + 4, InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Redstone, "redstoneWorkedIronHandpick");
			obsidianWorkedIronHandpick = new InfiToolHandpick(PropsHelperInfi2x2.workedIronHandpickID + 5, InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Obsidian, "obsidianWorkedIronHandpick");
			boneWorkedIronHandpick = new InfiToolHandpick(PropsHelperInfi2x2.workedIronHandpickID + 6, InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Bone, "boneWorkedIronHandpick");
			netherrackWorkedIronHandpick = new InfiToolHandpick(PropsHelperInfi2x2.workedIronHandpickID + 7, InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Netherrack, "netherrackWorkedIronHandpick");
			glowstoneWorkedIronHandpick = new InfiToolHandpick(PropsHelperInfi2x2.workedIronHandpickID + 8, InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Glowstone, "glowstoneWorkedIronHandpick");
			iceWorkedIronHandpick = new InfiToolHandpick(PropsHelperInfi2x2.workedIronHandpickID + 9, InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Ice, "iceWorkedIronHandpick");
			slimeWorkedIronHandpick = new InfiToolHandpick(PropsHelperInfi2x2.workedIronHandpickID + 10, InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Slime, "slimeWorkedIronHandpick");
			cactusWorkedIronHandpick = new InfiToolHandpick(PropsHelperInfi2x2.workedIronHandpickID + 11, InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Cactus, "cactusWorkedIronHandpick");
			blazeWorkedIronHandpick = new InfiToolHandpick(PropsHelperInfi2x2.workedIronHandpickID + 12, InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Blaze, "blazeWorkedIronHandpick");
			copperWorkedIronHandpick = new InfiToolHandpick(PropsHelperInfi2x2.workedIronHandpickID + 13, InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Copper, "copperWorkedIronHandpick");
			bronzeWorkedIronHandpick = new InfiToolHandpick(PropsHelperInfi2x2.workedIronHandpickID + 14, InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Bronze, "bronzeWorkedIronHandpick");
			workedWorkedIronHandpick = new InfiToolHandpick(PropsHelperInfi2x2.workedIronHandpickID + 15, InfiMaterialEnum.WorkedIron, InfiMaterialEnum.WorkedIron, "workedWorkedIronHandpick");
			steelWorkedIronHandpick = new InfiToolHandpick(PropsHelperInfi2x2.workedIronHandpickID + 16, InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Steel, "steelWorkedIronHandpick");
			uraniumWorkedIronHandpick = new InfiToolHandpick(PropsHelperInfi2x2.workedIronHandpickID + 17, InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Bronze, "uraniumWorkedIronHandpick");

		}

		if (PropsHelperInfi2x2.enableSteelTools)
		{
			woodSteelHandpick = new InfiToolHandpick(PropsHelperInfi2x2.steelHandpickID + 0, InfiMaterialEnum.Steel, InfiMaterialEnum.Wood, "woodSteelHandpick");
			stoneSteelHandpick = new InfiToolHandpick(PropsHelperInfi2x2.steelHandpickID + 1, InfiMaterialEnum.Steel, InfiMaterialEnum.Stone, "stoneSteelHandpick");
			ironSteelHandpick = new InfiToolHandpick(PropsHelperInfi2x2.steelHandpickID + 2, InfiMaterialEnum.Steel, InfiMaterialEnum.Iron, "ironSteelHandpick");
			diamondSteelHandpick = new InfiToolHandpick(PropsHelperInfi2x2.steelHandpickID + 3, InfiMaterialEnum.Steel, InfiMaterialEnum.Diamond, "diamondSteelHandpick");
			redstoneSteelHandpick = new InfiToolHandpick(PropsHelperInfi2x2.steelHandpickID + 4, InfiMaterialEnum.Steel, InfiMaterialEnum.Redstone, "redstoneSteelHandpick");
			obsidianSteelHandpick = new InfiToolHandpick(PropsHelperInfi2x2.steelHandpickID + 5, InfiMaterialEnum.Steel, InfiMaterialEnum.Obsidian, "obsidianSteelHandpick");
			boneSteelHandpick = new InfiToolHandpick(PropsHelperInfi2x2.steelHandpickID + 6, InfiMaterialEnum.Steel, InfiMaterialEnum.Bone, "boneSteelHandpick");
			netherrackSteelHandpick = new InfiToolHandpick(PropsHelperInfi2x2.steelHandpickID + 7, InfiMaterialEnum.Steel, InfiMaterialEnum.Netherrack, "netherrackSteelHandpick");
			glowstoneSteelHandpick = new InfiToolHandpick(PropsHelperInfi2x2.steelHandpickID + 8, InfiMaterialEnum.Steel, InfiMaterialEnum.Glowstone, "glowstoneSteelHandpick");
			iceSteelHandpick = new InfiToolHandpick(PropsHelperInfi2x2.steelHandpickID + 9, InfiMaterialEnum.Steel, InfiMaterialEnum.Ice, "iceSteelHandpick");
			slimeSteelHandpick = new InfiToolHandpick(PropsHelperInfi2x2.steelHandpickID + 10, InfiMaterialEnum.Steel, InfiMaterialEnum.Slime, "slimeSteelHandpick");
			cactusSteelHandpick = new InfiToolHandpick(PropsHelperInfi2x2.steelHandpickID + 11, InfiMaterialEnum.Steel, InfiMaterialEnum.Cactus, "cactusSteelHandpick");
			blazeSteelHandpick = new InfiToolHandpick(PropsHelperInfi2x2.steelHandpickID + 12, InfiMaterialEnum.Steel, InfiMaterialEnum.Blaze, "blazeSteelHandpick");
			copperSteelHandpick = new InfiToolHandpick(PropsHelperInfi2x2.steelHandpickID + 13, InfiMaterialEnum.Steel, InfiMaterialEnum.Copper, "copperSteelHandpick");
			bronzeSteelHandpick = new InfiToolHandpick(PropsHelperInfi2x2.steelHandpickID + 14, InfiMaterialEnum.Steel, InfiMaterialEnum.Bronze, "bronzeSteelHandpick");
			workedSteelHandpick = new InfiToolHandpick(PropsHelperInfi2x2.steelHandpickID + 15, InfiMaterialEnum.Steel, InfiMaterialEnum.WorkedIron, "workedSteelHandpick");
			steelSteelHandpick = new InfiToolHandpick(PropsHelperInfi2x2.steelHandpickID + 16, InfiMaterialEnum.Steel, InfiMaterialEnum.Steel, "steelSteelHandpick");
			cobaltSteelHandpick = new InfiToolHandpick(PropsHelperInfi2x2.steelHandpickID + 17, InfiMaterialEnum.Steel, InfiMaterialEnum.Cobalt, "cobaltSteelHandpick");
			arditeSteelHandpick = new InfiToolHandpick(PropsHelperInfi2x2.steelHandpickID + 18, InfiMaterialEnum.Steel, InfiMaterialEnum.Ardite, "arditeSteelHandpick");
			uraniumSteelHandpick = new InfiToolHandpick(PropsHelperInfi2x2.steelHandpickID + 19, InfiMaterialEnum.Steel, InfiMaterialEnum.Bronze, "uraniumSteelHandpick");

		}

		if (PropsHelperInfi2x2.enableCobaltTools)
		{
			woodCobaltHandpick = new InfiToolHandpick(PropsHelperInfi2x2.cobaltHandpickID + 0, InfiMaterialEnum.Cobalt, InfiMaterialEnum.Wood, "woodCobaltHandpick");
			stoneCobaltHandpick = new InfiToolHandpick(PropsHelperInfi2x2.cobaltHandpickID + 1, InfiMaterialEnum.Cobalt, InfiMaterialEnum.Stone, "stoneCobaltHandpick");
			ironCobaltHandpick = new InfiToolHandpick(PropsHelperInfi2x2.cobaltHandpickID + 2, InfiMaterialEnum.Cobalt, InfiMaterialEnum.Iron, "ironCobaltHandpick");
			diamondCobaltHandpick = new InfiToolHandpick(PropsHelperInfi2x2.cobaltHandpickID + 3, InfiMaterialEnum.Cobalt, InfiMaterialEnum.Diamond, "diamondCobaltHandpick");
			redstoneCobaltHandpick = new InfiToolHandpick(PropsHelperInfi2x2.cobaltHandpickID + 4, InfiMaterialEnum.Cobalt, InfiMaterialEnum.Redstone, "redstoneCobaltHandpick");
			obsidianCobaltHandpick = new InfiToolHandpick(PropsHelperInfi2x2.cobaltHandpickID + 5, InfiMaterialEnum.Cobalt, InfiMaterialEnum.Obsidian, "obsidianCobaltHandpick");
			boneCobaltHandpick = new InfiToolHandpick(PropsHelperInfi2x2.cobaltHandpickID + 6, InfiMaterialEnum.Cobalt, InfiMaterialEnum.Bone, "boneCobaltHandpick");
			slimeCobaltHandpick = new InfiToolHandpick(PropsHelperInfi2x2.cobaltHandpickID + 7, InfiMaterialEnum.Cobalt, InfiMaterialEnum.Slime, "slimeCobaltHandpick");
			cactusCobaltHandpick = new InfiToolHandpick(PropsHelperInfi2x2.cobaltHandpickID + 8, InfiMaterialEnum.Cobalt, InfiMaterialEnum.Cactus, "cactusCobaltHandpick");
			blazeCobaltHandpick = new InfiToolHandpick(PropsHelperInfi2x2.cobaltHandpickID + 9, InfiMaterialEnum.Cobalt, InfiMaterialEnum.Blaze, "blazeCobaltHandpick");
			copperCobaltHandpick = new InfiToolHandpick(PropsHelperInfi2x2.cobaltHandpickID + 10, InfiMaterialEnum.Cobalt, InfiMaterialEnum.Copper, "copperCobaltHandpick");
			bronzeCobaltHandpick = new InfiToolHandpick(PropsHelperInfi2x2.cobaltHandpickID + 11, InfiMaterialEnum.Cobalt, InfiMaterialEnum.Bronze, "bronzeCobaltHandpick");
			workedCobaltHandpick = new InfiToolHandpick(PropsHelperInfi2x2.cobaltHandpickID + 12, InfiMaterialEnum.Cobalt, InfiMaterialEnum.WorkedIron, "workedCobaltHandpick");
			steelCobaltHandpick = new InfiToolHandpick(PropsHelperInfi2x2.cobaltHandpickID + 13, InfiMaterialEnum.Cobalt, InfiMaterialEnum.Steel, "steelCobaltHandpick");
			cobaltCobaltHandpick = new InfiToolHandpick(PropsHelperInfi2x2.cobaltHandpickID + 14, InfiMaterialEnum.Cobalt, InfiMaterialEnum.Cobalt, "cobaltCobaltHandpick");
			arditeCobaltHandpick = new InfiToolHandpick(PropsHelperInfi2x2.cobaltHandpickID + 15, InfiMaterialEnum.Cobalt, InfiMaterialEnum.Ardite, "arditeCobaltHandpick");
			manyullynCobaltHandpick = new InfiToolHandpick(PropsHelperInfi2x2.cobaltHandpickID + 16, InfiMaterialEnum.Cobalt, InfiMaterialEnum.Manyullyn, "manyullynCobaltHandpick");
			uraniumCobaltHandpick = new InfiToolHandpick(PropsHelperInfi2x2.cobaltHandpickID + 17, InfiMaterialEnum.Cobalt, InfiMaterialEnum.Bronze, "uraniumCobaltHandpick");
		}

		if (PropsHelperInfi2x2.enableArditeTools)
		{
			woodArditeHandpick = new InfiToolHandpick(PropsHelperInfi2x2.arditeHandpickID + 0, InfiMaterialEnum.Ardite, InfiMaterialEnum.Wood, "woodArditeHandpick");
			stoneArditeHandpick = new InfiToolHandpick(PropsHelperInfi2x2.arditeHandpickID + 1, InfiMaterialEnum.Ardite, InfiMaterialEnum.Stone, "stoneArditeHandpick");
			ironArditeHandpick = new InfiToolHandpick(PropsHelperInfi2x2.arditeHandpickID + 2, InfiMaterialEnum.Ardite, InfiMaterialEnum.Iron, "ironArditeHandpick");
			diamondArditeHandpick = new InfiToolHandpick(PropsHelperInfi2x2.arditeHandpickID + 3, InfiMaterialEnum.Ardite, InfiMaterialEnum.Diamond, "diamondArditeHandpick");
			redstoneArditeHandpick = new InfiToolHandpick(PropsHelperInfi2x2.arditeHandpickID + 4, InfiMaterialEnum.Ardite, InfiMaterialEnum.Redstone, "redstoneArditeHandpick");
			obsidianArditeHandpick = new InfiToolHandpick(PropsHelperInfi2x2.arditeHandpickID + 5, InfiMaterialEnum.Ardite, InfiMaterialEnum.Obsidian, "obsidianArditeHandpick");
			boneArditeHandpick = new InfiToolHandpick(PropsHelperInfi2x2.arditeHandpickID + 6, InfiMaterialEnum.Ardite, InfiMaterialEnum.Bone, "boneArditeHandpick");
			slimeArditeHandpick = new InfiToolHandpick(PropsHelperInfi2x2.arditeHandpickID + 7, InfiMaterialEnum.Ardite, InfiMaterialEnum.Slime, "slimeArditeHandpick");
			cactusArditeHandpick = new InfiToolHandpick(PropsHelperInfi2x2.arditeHandpickID + 8, InfiMaterialEnum.Ardite, InfiMaterialEnum.Cactus, "cactusArditeHandpick");
			blazeArditeHandpick = new InfiToolHandpick(PropsHelperInfi2x2.arditeHandpickID + 9, InfiMaterialEnum.Ardite, InfiMaterialEnum.Blaze, "blazeArditeHandpick");
			copperArditeHandpick = new InfiToolHandpick(PropsHelperInfi2x2.arditeHandpickID + 10, InfiMaterialEnum.Ardite, InfiMaterialEnum.Copper, "copperArditeHandpick");
			bronzeArditeHandpick = new InfiToolHandpick(PropsHelperInfi2x2.arditeHandpickID + 11, InfiMaterialEnum.Ardite, InfiMaterialEnum.Bronze, "bronzeArditeHandpick");
			workedArditeHandpick = new InfiToolHandpick(PropsHelperInfi2x2.arditeHandpickID + 12, InfiMaterialEnum.Ardite, InfiMaterialEnum.WorkedIron, "workedArditeHandpick");
			steelArditeHandpick = new InfiToolHandpick(PropsHelperInfi2x2.arditeHandpickID + 13, InfiMaterialEnum.Ardite, InfiMaterialEnum.Steel, "steelArditeHandpick");
			cobaltArditeHandpick = new InfiToolHandpick(PropsHelperInfi2x2.arditeHandpickID + 14, InfiMaterialEnum.Ardite, InfiMaterialEnum.Cobalt, "cobaltArditeHandpick");
			arditeArditeHandpick = new InfiToolHandpick(PropsHelperInfi2x2.arditeHandpickID + 15, InfiMaterialEnum.Ardite, InfiMaterialEnum.Ardite, "arditeArditeHandpick");
			manyullynArditeHandpick = new InfiToolHandpick(PropsHelperInfi2x2.arditeHandpickID + 16, InfiMaterialEnum.Ardite, InfiMaterialEnum.Manyullyn, "manyullynArditeHandpick");
			uraniumArditeHandpick = new InfiToolHandpick(PropsHelperInfi2x2.arditeHandpickID + 17, InfiMaterialEnum.Ardite, InfiMaterialEnum.Bronze, "uraniumArditeHandpick");
		}

		if (PropsHelperInfi2x2.enableManyullynTools)
		{
			woodManyullynHandpick = new InfiToolHandpick(PropsHelperInfi2x2.manyullynHandpickID + 0, InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Stone, "woodManyullynHandpick");
			stoneManyullynHandpick = new InfiToolHandpick(PropsHelperInfi2x2.manyullynHandpickID + 1, InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Stone, "stoneManyullynHandpick");
			ironManyullynHandpick = new InfiToolHandpick(PropsHelperInfi2x2.manyullynHandpickID + 2, InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Iron, "ironManyullynHandpick");
			diamondManyullynHandpick = new InfiToolHandpick(PropsHelperInfi2x2.manyullynHandpickID + 3, InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Diamond, "diamondManyullynHandpick");
			redstoneManyullynHandpick = new InfiToolHandpick(PropsHelperInfi2x2.manyullynHandpickID + 4, InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Redstone, "redstoneManyullynHandpick");
			obsidianManyullynHandpick = new InfiToolHandpick(PropsHelperInfi2x2.manyullynHandpickID + 5, InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Obsidian, "obsidianManyullynHandpick");
			boneManyullynHandpick = new InfiToolHandpick(PropsHelperInfi2x2.manyullynHandpickID + 6, InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Bone, "boneManyullynHandpick");
			slimeManyullynHandpick = new InfiToolHandpick(PropsHelperInfi2x2.manyullynHandpickID + 7, InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Slime, "slimeManyullynHandpick");
			cactusManyullynHandpick = new InfiToolHandpick(PropsHelperInfi2x2.manyullynHandpickID + 8, InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Cactus, "cactusManyullynHandpick");
			blazeManyullynHandpick = new InfiToolHandpick(PropsHelperInfi2x2.manyullynHandpickID + 9, InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Blaze, "blazeManyullynHandpick");
			copperManyullynHandpick = new InfiToolHandpick(PropsHelperInfi2x2.manyullynHandpickID + 10, InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Copper, "copperManyullynHandpick");
			bronzeManyullynHandpick = new InfiToolHandpick(PropsHelperInfi2x2.manyullynHandpickID + 11, InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Bronze, "bronzeManyullynHandpick");
			workedManyullynHandpick = new InfiToolHandpick(PropsHelperInfi2x2.manyullynHandpickID + 12, InfiMaterialEnum.Manyullyn, InfiMaterialEnum.WorkedIron, "workedManyullynHandpick");
			steelManyullynHandpick = new InfiToolHandpick(PropsHelperInfi2x2.manyullynHandpickID + 13, InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Steel, "steelManyullynHandpick");
			cobaltManyullynHandpick = new InfiToolHandpick(PropsHelperInfi2x2.manyullynHandpickID + 14, InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Cobalt, "cobaltManyullynHandpick");
			arditeManyullynHandpick = new InfiToolHandpick(PropsHelperInfi2x2.manyullynHandpickID + 15, InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Ardite, "arditeManyullynHandpick");
			manyullynManyullynHandpick = new InfiToolHandpick(PropsHelperInfi2x2.manyullynHandpickID + 16, InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Manyullyn, "manyullynManyullynHandpick");
			uraniumManyullynHandpick = new InfiToolHandpick(PropsHelperInfi2x2.manyullynHandpickID + 17, InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Bronze, "uraniumManyullynHandpick");
		}

		if (PropsHelperInfi2x2.enableUraniumTools)
		{
			diamondUraniumHandpick = new InfiToolHandpick(PropsHelperInfi2x2.uraniumHandpickID + 0, InfiMaterialEnum.Uranium, InfiMaterialEnum.Diamond, "diamondUraniumHandpick");
			redstoneUraniumHandpick = new InfiToolHandpick(PropsHelperInfi2x2.uraniumHandpickID + 1, InfiMaterialEnum.Uranium, InfiMaterialEnum.Redstone, "redstoneUraniumHandpick");
			boneUraniumHandpick = new InfiToolHandpick(PropsHelperInfi2x2.uraniumHandpickID + 2, InfiMaterialEnum.Uranium, InfiMaterialEnum.Bone, "boneUraniumHandpick");
			netherrackUraniumHandpick = new InfiToolHandpick(PropsHelperInfi2x2.uraniumHandpickID + 3, InfiMaterialEnum.Uranium, InfiMaterialEnum.Netherrack, "netherrackUraniumHandpick");
			glowstoneUraniumHandpick = new InfiToolHandpick(PropsHelperInfi2x2.uraniumHandpickID + 4, InfiMaterialEnum.Uranium, InfiMaterialEnum.Glowstone, "glowstoneUraniumHandpick");
			lavaUraniumHandpick = new InfiToolHandpick(PropsHelperInfi2x2.uraniumHandpickID + 5, InfiMaterialEnum.Uranium, InfiMaterialEnum.Lava, "lavaUraniumHandpick");
			blazeUraniumHandpick = new InfiToolHandpick(PropsHelperInfi2x2.uraniumHandpickID + 6, InfiMaterialEnum.Uranium, InfiMaterialEnum.Blaze, "blazeUraniumHandpick");
			cobaltUraniumHandpick = new InfiToolHandpick(PropsHelperInfi2x2.uraniumHandpickID + 7, InfiMaterialEnum.Uranium, InfiMaterialEnum.Cobalt, "cobaltUraniumHandpick");
			arditeUraniumHandpick = new InfiToolHandpick(PropsHelperInfi2x2.uraniumHandpickID + 8, InfiMaterialEnum.Uranium, InfiMaterialEnum.Ardite, "arditeUraniumHandpick");
			uraniumUraniumHandpick = new InfiToolHandpick(PropsHelperInfi2x2.uraniumHandpickID + 9, InfiMaterialEnum.Uranium, InfiMaterialEnum.Uranium, "uraniumUraniumHandpick");
		}
	}

	private static void addNames()
	{
		if (PropsHelperInfi2x2.enableWoodTools)
			LanguageRegistry.instance().addName(woodWoodHandpick, "Wooden Handpick");
		if (PropsHelperInfi2x2.enableStoneTools)
			LanguageRegistry.instance().addName(stoneStoneHandpick, "Heavy Handpick");
		if (PropsHelperInfi2x2.enableIronTools)
			LanguageRegistry.instance().addName(ironIronHandpick, "Ironic Handpick");
		if (PropsHelperInfi2x2.enableDiamondTools)
			LanguageRegistry.instance().addName(diamondDiamondHandpick, "Diamondium Handpick");
		if (PropsHelperInfi2x2.enableRedstoneTools)
			LanguageRegistry.instance().addName(redstoneRedstoneHandpick, "Redredred Handpick");
		if (PropsHelperInfi2x2.enableObsidianTools)
			LanguageRegistry.instance().addName(obsidianObsidianHandpick, "Ebony Handpick");
		if (PropsHelperInfi2x2.enableSandstoneTools)
			LanguageRegistry.instance().addName(sandstoneSandstoneHandpick, "Fragile Handpick");
		if (PropsHelperInfi2x2.enableNetherrackTools)
			LanguageRegistry.instance().addName(boneBoneHandpick, "Necrotic Handpick");
		if (PropsHelperInfi2x2.enablePaperTools)
			LanguageRegistry.instance().addName(paperPaperHandpick, "Soft Handpick");
		if (PropsHelperInfi2x2.enableMossyTools)
			LanguageRegistry.instance().addName(mossyMossyHandpick, "Living Handpick");
		if (PropsHelperInfi2x2.enableNetherrackTools)
			LanguageRegistry.instance().addName(netherrackNetherrackHandpick, "Bloodsoaked Handpick");
		if (PropsHelperInfi2x2.enableGlowstoneTools)
			LanguageRegistry.instance().addName(glowstoneGlowstoneHandpick, "Bright Handpick");
		if (PropsHelperInfi2x2.enableIceTools)
			LanguageRegistry.instance().addName(iceIceHandpick, "Freezing Handpick");
		if (PropsHelperInfi2x2.enableLavaTools)
			LanguageRegistry.instance().addName(lavaLavaHandpick, "Burning Handpick");
		if (PropsHelperInfi2x2.enableSlimeTools)
			LanguageRegistry.instance().addName(slimeSlimeHandpick, "Toy Handpick");
		if (PropsHelperInfi2x2.enableCactusTools)
			LanguageRegistry.instance().addName(cactusCactusHandpick, "Thorned Handpick");
		if (PropsHelperInfi2x2.enableFlintTools)
			LanguageRegistry.instance().addName(flintFlintHandpick, "Rough-hewn Handpick");
		if (PropsHelperInfi2x2.enableBlazeTools)
			LanguageRegistry.instance().addName(blazeBlazeHandpick, "Netherite Handpick");
		if (PropsHelperInfi2x2.enableCopperTools)
			LanguageRegistry.instance().addName(copperCopperHandpick, "Orange-Tang Handpick");
		if (PropsHelperInfi2x2.enableBronzeTools)
			LanguageRegistry.instance().addName(bronzeBronzeHandpick, "Polished Handpick");
		if (PropsHelperInfi2x2.enableWorkedIronTools)
			LanguageRegistry.instance().addName(workedWorkedIronHandpick, "Reworked Iron Handpick");
		if (PropsHelperInfi2x2.enableSteelTools)
			LanguageRegistry.instance().addName(steelSteelHandpick, "Forge-Wrought Handpick");
		if (PropsHelperInfi2x2.enableCobaltTools)
			LanguageRegistry.instance().addName(cobaltCobaltHandpick, "Beautiful Handpick");
		if (PropsHelperInfi2x2.enableArditeTools)
			LanguageRegistry.instance().addName(arditeArditeHandpick, "Rustic Handpick");
		if (PropsHelperInfi2x2.enableManyullynTools)
			LanguageRegistry.instance().addName(manyullynManyullynHandpick, "False-Prophetic Handpick");
		if (PropsHelperInfi2x2.enableUraniumTools)
			LanguageRegistry.instance().addName(uraniumUraniumHandpick, "Cancerous Handpick");
	}

	public static void registerInfiToolsRecipes()
	{
		if (PropsHelperInfi2x2.enableWoodTools)
		{
			GameRegistry.addRecipe(new ItemStack(woodWoodHandpick), recipe, '#', Block.planks, '|', Item.stick);
			GameRegistry.addRecipe(new ItemStack(sandstoneWoodHandpick), recipe, '#', Block.planks, '|', InfiLibrary.sandstoneRod);
			GameRegistry.addRecipe(new ItemStack(boneWoodHandpick), recipe, '#', Block.planks, '|', Item.bone);
			GameRegistry.addRecipe(new ItemStack(boneWoodHandpick), recipe, '#', Block.planks, '|', InfiLibrary.boneRod);
			GameRegistry.addRecipe(new ItemStack(paperWoodHandpick), recipe, '#', Block.planks, '|', InfiLibrary.paperRod);
			GameRegistry.addRecipe(new ItemStack(iceWoodHandpick), recipe, '#', Block.planks, '|', InfiLibrary.iceRod);
			GameRegistry.addRecipe(new ItemStack(slimeWoodHandpick), recipe, '#', Block.planks, '|', InfiLibrary.slimeRod);
			GameRegistry.addRecipe(new ItemStack(cactusWoodHandpick), recipe, '#', Block.planks, '|', InfiLibrary.cactusRod);
		}

		if (PropsHelperInfi2x2.enableStoneTools)
		{
			GameRegistry.addRecipe(new ItemStack(woodStoneHandpick), recipe, '#', Block.cobblestone, '|', Item.stick);
			GameRegistry.addRecipe(new ItemStack(stoneStoneHandpick), recipe, '#', Block.cobblestone, '|', InfiLibrary.stoneRod);
			GameRegistry.addRecipe(new ItemStack(sandstoneStoneHandpick), recipe, '#', Block.cobblestone, '|', InfiLibrary.sandstoneRod);
			GameRegistry.addRecipe(new ItemStack(boneStoneHandpick), recipe, '#', Block.cobblestone, '|', Item.bone);
			GameRegistry.addRecipe(new ItemStack(boneStoneHandpick), recipe, '#', Block.cobblestone, '|', InfiLibrary.boneRod);
			GameRegistry.addRecipe(new ItemStack(netherrackStoneHandpick), recipe, '#', Block.cobblestone, '|', InfiLibrary.netherrackRod);
			GameRegistry.addRecipe(new ItemStack(iceStoneHandpick), recipe, '#', Block.cobblestone, '|', InfiLibrary.iceRod);
			GameRegistry.addRecipe(new ItemStack(slimeStoneHandpick), recipe, '#', Block.cobblestone, '|', InfiLibrary.slimeRod);
			GameRegistry.addRecipe(new ItemStack(cactusStoneHandpick), recipe, '#', Block.cobblestone, '|', InfiLibrary.cactusRod);
			GameRegistry.addRecipe(new ItemStack(flintStoneHandpick), recipe, '#', Block.cobblestone, '|', InfiLibrary.flintRod);

			GameRegistry.addRecipe(new ItemStack(woodStoneHandpick), recipe, '#', Block.stone, '|', Item.stick);
			GameRegistry.addRecipe(new ItemStack(stoneStoneHandpick), recipe, '#', Block.stone, '|', InfiLibrary.stoneRod);
			GameRegistry.addRecipe(new ItemStack(sandstoneStoneHandpick), recipe, '#', Block.stone, '|', InfiLibrary.sandstoneRod);
			GameRegistry.addRecipe(new ItemStack(boneStoneHandpick), recipe, '#', Block.stone, '|', Item.bone);
			GameRegistry.addRecipe(new ItemStack(boneStoneHandpick), recipe, '#', Block.stone, '|', InfiLibrary.boneRod);
			GameRegistry.addRecipe(new ItemStack(netherrackStoneHandpick), recipe, '#', Block.stone, '|', InfiLibrary.netherrackRod);
			GameRegistry.addRecipe(new ItemStack(iceStoneHandpick), recipe, '#', Block.stone, '|', InfiLibrary.iceRod);
			GameRegistry.addRecipe(new ItemStack(slimeStoneHandpick), recipe, '#', Block.stone, '|', InfiLibrary.slimeRod);
			GameRegistry.addRecipe(new ItemStack(cactusStoneHandpick), recipe, '#', Block.stone, '|', InfiLibrary.cactusRod);
			GameRegistry.addRecipe(new ItemStack(flintStoneHandpick), recipe, '#', Block.stone, '|', InfiLibrary.flintRod);
		}

		if (PropsHelperInfi2x2.enableIronTools)
		{
			GameRegistry.addRecipe(new ItemStack(woodIronHandpick), recipe, '#', Item.ingotIron, '|', Item.stick);
			GameRegistry.addRecipe(new ItemStack(stoneIronHandpick), recipe, '#', Item.ingotIron, '|', InfiLibrary.stoneRod);
			GameRegistry.addRecipe(new ItemStack(ironIronHandpick), recipe, '#', Item.ingotIron, '|', InfiLibrary.ironRod);
			GameRegistry.addRecipe(new ItemStack(boneIronHandpick), recipe, '#', Item.ingotIron, '|', Item.bone);
			GameRegistry.addRecipe(new ItemStack(boneIronHandpick), recipe, '#', Item.ingotIron, '|', InfiLibrary.boneRod);
			GameRegistry.addRecipe(new ItemStack(netherrackIronHandpick), recipe, '#', Item.ingotIron, '|', InfiLibrary.netherrackRod);
			GameRegistry.addRecipe(new ItemStack(glowstoneIronHandpick), recipe, '#', Item.ingotIron, '|', InfiLibrary.glowstoneRod);
			GameRegistry.addRecipe(new ItemStack(cactusIronHandpick), recipe, '#', Item.ingotIron, '|', InfiLibrary.cactusRod);
			GameRegistry.addRecipe(new ItemStack(copperIronHandpick), recipe, '#', Item.ingotIron, '|', InfiLibrary.copperRod);
			GameRegistry.addRecipe(new ItemStack(bronzeIronHandpick), recipe, '#', Item.ingotIron, '|', InfiLibrary.bronzeRod);
		}

		if (PropsHelperInfi2x2.enableDiamondTools)
		{
			GameRegistry.addRecipe(new ItemStack(woodDiamondHandpick), recipe, '#', Item.diamond, '|', Item.stick);
			GameRegistry.addRecipe(new ItemStack(stoneDiamondHandpick), recipe, '#', Item.diamond, '|', InfiLibrary.stoneRod);
			GameRegistry.addRecipe(new ItemStack(ironDiamondHandpick), recipe, '#', Item.diamond, '|', InfiLibrary.ironRod);
			GameRegistry.addRecipe(new ItemStack(diamondDiamondHandpick), recipe, '#', Item.diamond, '|', InfiLibrary.diamondRod);
			GameRegistry.addRecipe(new ItemStack(redstoneDiamondHandpick), recipe, '#', Item.diamond, '|', InfiLibrary.redstoneRod);
			GameRegistry.addRecipe(new ItemStack(obsidianDiamondHandpick), recipe, '#', Item.diamond, '|', InfiLibrary.obsidianRod);
			GameRegistry.addRecipe(new ItemStack(boneDiamondHandpick), recipe, '#', Item.diamond, '|', Item.bone);
			GameRegistry.addRecipe(new ItemStack(boneDiamondHandpick), recipe, '#', Item.diamond, '|', InfiLibrary.boneRod);
			GameRegistry.addRecipe(new ItemStack(mossyDiamondHandpick), recipe, '#', Item.diamond, '|', InfiLibrary.mossyRod);
			GameRegistry.addRecipe(new ItemStack(netherrackDiamondHandpick), recipe, '#', Item.diamond, '|', InfiLibrary.netherrackRod);
			GameRegistry.addRecipe(new ItemStack(glowstoneDiamondHandpick), recipe, '#', Item.diamond, '|', InfiLibrary.glowstoneRod);
			GameRegistry.addRecipe(new ItemStack(lavaDiamondHandpick), recipe, '#', Item.diamond, '|', InfiLibrary.lavaRod);
			GameRegistry.addRecipe(new ItemStack(cactusDiamondHandpick), recipe, '#', Item.diamond, '|', InfiLibrary.cactusRod);
			GameRegistry.addRecipe(new ItemStack(flintDiamondHandpick), recipe, '#', Item.diamond, '|', InfiLibrary.flintRod);
			GameRegistry.addRecipe(new ItemStack(blazeDiamondHandpick), recipe, '#', Item.diamond, '|', Item.blazeRod);
			GameRegistry.addRecipe(new ItemStack(copperDiamondHandpick), recipe, '#', Item.diamond, '|', InfiLibrary.copperRod);
			GameRegistry.addRecipe(new ItemStack(bronzeDiamondHandpick), recipe, '#', Item.diamond, '|', InfiLibrary.bronzeRod);
			GameRegistry.addRecipe(new ItemStack(workedDiamondHandpick), recipe, '#', Item.diamond, '|', InfiLibrary.workedIronRod);
			GameRegistry.addRecipe(new ItemStack(steelDiamondHandpick), recipe, '#', Item.diamond, '|', InfiLibrary.steelRod);
			GameRegistry.addRecipe(new ItemStack(cobaltDiamondHandpick), recipe, '#', Item.diamond, '|', InfiLibrary.cobaltRod);
			GameRegistry.addRecipe(new ItemStack(arditeDiamondHandpick), recipe, '#', Item.diamond, '|', InfiLibrary.arditeRod);
			GameRegistry.addRecipe(new ItemStack(manyullynDiamondHandpick), recipe, '#', Item.diamond, '|', InfiLibrary.manyullynRod);
			GameRegistry.addRecipe(new ItemStack(uraniumDiamondHandpick), recipe, '#', Item.diamond, '|', InfiLibrary.uraniumRod);
		}

		if (PropsHelperInfi2x2.enableRedstoneTools)
		{
			GameRegistry.addRecipe(new ItemStack(woodRedstoneHandpick), recipe, '#', InfiLibrary.redstoneCrystal, '|', Item.stick);
			GameRegistry.addRecipe(new ItemStack(stoneRedstoneHandpick), recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.stoneRod);
			GameRegistry.addRecipe(new ItemStack(ironRedstoneHandpick), recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.ironRod);
			GameRegistry.addRecipe(new ItemStack(redstoneRedstoneHandpick), recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.redstoneRod);
			GameRegistry.addRecipe(new ItemStack(obsidianRedstoneHandpick), recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.obsidianRod);
			GameRegistry.addRecipe(new ItemStack(sandstoneRedstoneHandpick), recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.sandstoneRod);
			GameRegistry.addRecipe(new ItemStack(boneRedstoneHandpick), recipe, '#', InfiLibrary.redstoneCrystal, '|', Item.bone);
			GameRegistry.addRecipe(new ItemStack(boneRedstoneHandpick), recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.boneRod);
			GameRegistry.addRecipe(new ItemStack(paperRedstoneHandpick), recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.paperRod);
			GameRegistry.addRecipe(new ItemStack(mossyRedstoneHandpick), recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.mossyRod);
			GameRegistry.addRecipe(new ItemStack(netherrackRedstoneHandpick), recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.netherrackRod);
			GameRegistry.addRecipe(new ItemStack(glowstoneRedstoneHandpick), recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.glowstoneRod);
			GameRegistry.addRecipe(new ItemStack(iceRedstoneHandpick), recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.iceRod);
			GameRegistry.addRecipe(new ItemStack(lavaRedstoneHandpick), recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.lavaRod);
			GameRegistry.addRecipe(new ItemStack(slimeRedstoneHandpick), recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.slimeRod);
			GameRegistry.addRecipe(new ItemStack(cactusRedstoneHandpick), recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.cactusRod);
			GameRegistry.addRecipe(new ItemStack(flintRedstoneHandpick), recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.flintRod);
			GameRegistry.addRecipe(new ItemStack(copperRedstoneHandpick), recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.copperRod);
			GameRegistry.addRecipe(new ItemStack(bronzeRedstoneHandpick), recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.bronzeRod);
			GameRegistry.addRecipe(new ItemStack(workedRedstoneHandpick), recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.workedIronRod);
			GameRegistry.addRecipe(new ItemStack(uraniumRedstoneHandpick), recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.uraniumRod);
		}

		if (PropsHelperInfi2x2.enableObsidianTools)
		{
			GameRegistry.addRecipe(new ItemStack(woodObsidianHandpick), recipe, '#', Block.obsidian, '|', Item.stick);
			GameRegistry.addRecipe(new ItemStack(stoneObsidianHandpick), recipe, '#', Block.obsidian, '|', InfiLibrary.stoneRod);
			GameRegistry.addRecipe(new ItemStack(redstoneObsidianHandpick), recipe, '#', Block.obsidian, '|', InfiLibrary.redstoneRod);
			GameRegistry.addRecipe(new ItemStack(obsidianObsidianHandpick), recipe, '#', Block.obsidian, '|', InfiLibrary.obsidianRod);
			GameRegistry.addRecipe(new ItemStack(boneObsidianHandpick), recipe, '#', Block.obsidian, '|', Item.bone);
			GameRegistry.addRecipe(new ItemStack(boneObsidianHandpick), recipe, '#', Block.obsidian, '|', InfiLibrary.boneRod);
			GameRegistry.addRecipe(new ItemStack(netherrackObsidianHandpick), recipe, '#', Block.obsidian, '|', InfiLibrary.netherrackRod);
			GameRegistry.addRecipe(new ItemStack(glowstoneObsidianHandpick), recipe, '#', Block.obsidian, '|', InfiLibrary.glowstoneRod);
			GameRegistry.addRecipe(new ItemStack(iceObsidianHandpick), recipe, '#', Block.obsidian, '|', InfiLibrary.iceRod);
			GameRegistry.addRecipe(new ItemStack(lavaObsidianHandpick), recipe, '#', Block.obsidian, '|', InfiLibrary.lavaRod);
			GameRegistry.addRecipe(new ItemStack(cactusObsidianHandpick), recipe, '#', Block.obsidian, '|', InfiLibrary.cactusRod);
		}

		if (PropsHelperInfi2x2.enableSandstoneTools)
		{
			GameRegistry.addRecipe(new ItemStack(woodSandstoneHandpick), recipe, '#', Block.sandStone, '|', Item.stick);
			GameRegistry.addRecipe(new ItemStack(sandstoneSandstoneHandpick), recipe, '#', Block.sandStone, '|', InfiLibrary.sandstoneRod);
			GameRegistry.addRecipe(new ItemStack(boneSandstoneHandpick), recipe, '#', Block.sandStone, '|', Item.bone);
			GameRegistry.addRecipe(new ItemStack(boneSandstoneHandpick), recipe, '#', Block.sandStone, '|', InfiLibrary.boneRod);
			GameRegistry.addRecipe(new ItemStack(netherrackSandstoneHandpick), recipe, '#', Block.sandStone, '|', InfiLibrary.netherrackRod);
			GameRegistry.addRecipe(new ItemStack(iceSandstoneHandpick), recipe, '#', Block.sandStone, '|', InfiLibrary.iceRod);
			GameRegistry.addRecipe(new ItemStack(slimeSandstoneHandpick), recipe, '#', Block.sandStone, '|', InfiLibrary.slimeRod);
			GameRegistry.addRecipe(new ItemStack(cactusSandstoneHandpick), recipe, '#', Block.sandStone, '|', InfiLibrary.cactusRod);
			GameRegistry.addRecipe(new ItemStack(flintSandstoneHandpick), recipe, '#', Block.sandStone, '|', InfiLibrary.flintRod);
		}

		if (PropsHelperInfi2x2.enableBoneTools)
		{
			GameRegistry.addRecipe(new ItemStack(woodBoneHandpick), recipe, '#', Item.bone, '|', Item.stick);
			GameRegistry.addRecipe(new ItemStack(stoneBoneHandpick), recipe, '#', Item.bone, '|', InfiLibrary.stoneRod);
			GameRegistry.addRecipe(new ItemStack(sandstoneBoneHandpick), recipe, '#', Item.bone, '|', InfiLibrary.sandstoneRod);
			GameRegistry.addRecipe(new ItemStack(boneBoneHandpick), recipe, '#', Item.bone, '|', Item.bone);
			GameRegistry.addRecipe(new ItemStack(boneBoneHandpick), recipe, '#', Item.bone, '|', InfiLibrary.boneRod);
			GameRegistry.addRecipe(new ItemStack(paperBoneHandpick), recipe, '#', Item.bone, '|', InfiLibrary.paperRod);
			GameRegistry.addRecipe(new ItemStack(netherrackBoneHandpick), recipe, '#', Item.bone, '|', InfiLibrary.netherrackRod);
			GameRegistry.addRecipe(new ItemStack(iceBoneHandpick), recipe, '#', Item.bone, '|', InfiLibrary.iceRod);
			GameRegistry.addRecipe(new ItemStack(cactusBoneHandpick), recipe, '#', Item.bone, '|', InfiLibrary.cactusRod);
			GameRegistry.addRecipe(new ItemStack(flintBoneHandpick), recipe, '#', Item.bone, '|', InfiLibrary.flintRod);
		}

		if (PropsHelperInfi2x2.enablePaperTools)
		{
			GameRegistry.addRecipe(new ItemStack(woodPaperHandpick), recipe, '#', InfiLibrary.paperStack, '|', Item.stick);
			GameRegistry.addRecipe(new ItemStack(bonePaperHandpick), recipe, '#', InfiLibrary.paperStack, '|', Item.bone);
			GameRegistry.addRecipe(new ItemStack(bonePaperHandpick), recipe, '#', InfiLibrary.paperStack, '|', InfiLibrary.boneRod);
			GameRegistry.addRecipe(new ItemStack(paperPaperHandpick), recipe, '#', InfiLibrary.paperStack, '|', InfiLibrary.paperRod);
			GameRegistry.addRecipe(new ItemStack(slimePaperHandpick), recipe, '#', InfiLibrary.paperStack, '|', InfiLibrary.slimeRod);
			GameRegistry.addRecipe(new ItemStack(cactusPaperHandpick), recipe, '#', InfiLibrary.paperStack, '|', InfiLibrary.cactusRod);
		}

		if (PropsHelperInfi2x2.enableMossyTools)
		{
			GameRegistry.addRecipe(new ItemStack(woodMossyHandpick), recipe, '#', InfiLibrary.mossyStone, '|', Item.stick);
			GameRegistry.addRecipe(new ItemStack(stoneMossyHandpick), recipe, '#', InfiLibrary.mossyStone, '|', InfiLibrary.stoneRod);
			GameRegistry.addRecipe(new ItemStack(diamondMossyHandpick), recipe, '#', InfiLibrary.mossyStone, '|', InfiLibrary.diamondRod);
			GameRegistry.addRecipe(new ItemStack(redstoneMossyHandpick), recipe, '#', InfiLibrary.mossyStone, '|', InfiLibrary.redstoneRod);
			GameRegistry.addRecipe(new ItemStack(boneMossyHandpick), recipe, '#', InfiLibrary.mossyStone, '|', Item.bone);
			GameRegistry.addRecipe(new ItemStack(boneMossyHandpick), recipe, '#', InfiLibrary.mossyStone, '|', InfiLibrary.boneRod);
			GameRegistry.addRecipe(new ItemStack(mossyMossyHandpick), recipe, '#', InfiLibrary.mossyStone, '|', InfiLibrary.mossyRod);
			GameRegistry.addRecipe(new ItemStack(netherrackMossyHandpick), recipe, '#', InfiLibrary.mossyStone, '|', InfiLibrary.netherrackRod);
			GameRegistry.addRecipe(new ItemStack(glowstoneMossyHandpick), recipe, '#', InfiLibrary.mossyStone, '|', InfiLibrary.glowstoneRod);
			GameRegistry.addRecipe(new ItemStack(cactusMossyHandpick), recipe, '#', InfiLibrary.mossyStone, '|', InfiLibrary.cactusRod);
			GameRegistry.addRecipe(new ItemStack(blazeMossyHandpick), recipe, '#', InfiLibrary.mossyStone, '|', Item.blazeRod);
			GameRegistry.addRecipe(new ItemStack(manyullynMossyHandpick), recipe, '#', InfiLibrary.mossyStone, '|', InfiLibrary.manyullynRod);
			GameRegistry.addRecipe(new ItemStack(uraniumMossyHandpick), recipe, '#', InfiLibrary.mossyStone, '|', InfiLibrary.uraniumRod);
		}

		if (PropsHelperInfi2x2.enableNetherrackTools)
		{
			GameRegistry.addRecipe(new ItemStack(woodNetherrackHandpick), recipe, '#', Block.netherrack, '|', Item.stick);
			GameRegistry.addRecipe(new ItemStack(stoneNetherrackHandpick), recipe, '#', Block.netherrack, '|', InfiLibrary.stoneRod);
			GameRegistry.addRecipe(new ItemStack(sandstoneNetherrackHandpick), recipe, '#', Block.netherrack, '|', InfiLibrary.sandstoneRod);
			GameRegistry.addRecipe(new ItemStack(boneNetherrackHandpick), recipe, '#', Block.netherrack, '|', Item.bone);
			GameRegistry.addRecipe(new ItemStack(boneNetherrackHandpick), recipe, '#', Block.netherrack, '|', InfiLibrary.boneRod);
			GameRegistry.addRecipe(new ItemStack(paperNetherrackHandpick), recipe, '#', Block.netherrack, '|', InfiLibrary.paperRod);
			GameRegistry.addRecipe(new ItemStack(mossyNetherrackHandpick), recipe, '#', Block.netherrack, '|', InfiLibrary.mossyRod);
			GameRegistry.addRecipe(new ItemStack(netherrackNetherrackHandpick), recipe, '#', Block.netherrack, '|', InfiLibrary.netherrackRod);
			GameRegistry.addRecipe(new ItemStack(iceNetherrackHandpick), recipe, '#', Block.netherrack, '|', InfiLibrary.iceRod);
			GameRegistry.addRecipe(new ItemStack(slimeNetherrackHandpick), recipe, '#', Block.netherrack, '|', InfiLibrary.slimeRod);
			GameRegistry.addRecipe(new ItemStack(cactusNetherrackHandpick), recipe, '#', Block.netherrack, '|', InfiLibrary.cactusRod);
			GameRegistry.addRecipe(new ItemStack(flintNetherrackHandpick), recipe, '#', Block.netherrack, '|', InfiLibrary.flintRod);
			GameRegistry.addRecipe(new ItemStack(copperNetherrackHandpick), recipe, '#', Block.netherrack, '|', InfiLibrary.copperRod);
			GameRegistry.addRecipe(new ItemStack(bronzeNetherrackHandpick), recipe, '#', Block.netherrack, '|', InfiLibrary.bronzeRod);
		}

		if (PropsHelperInfi2x2.enableGlowstoneTools)
		{
			GameRegistry.addRecipe(new ItemStack(woodGlowstoneHandpick), recipe, '#', InfiLibrary.glowstoneCrystal, '|', Item.stick);
			GameRegistry.addRecipe(new ItemStack(redstoneGlowstoneHandpick), recipe, '#', InfiLibrary.glowstoneCrystal, '|', InfiLibrary.redstoneRod);
			GameRegistry.addRecipe(new ItemStack(obsidianGlowstoneHandpick), recipe, '#', InfiLibrary.glowstoneCrystal, '|', InfiLibrary.obsidianRod);
			GameRegistry.addRecipe(new ItemStack(boneGlowstoneHandpick), recipe, '#', InfiLibrary.glowstoneCrystal, '|', Item.bone);
			GameRegistry.addRecipe(new ItemStack(boneGlowstoneHandpick), recipe, '#', InfiLibrary.glowstoneCrystal, '|', InfiLibrary.boneRod);
			GameRegistry.addRecipe(new ItemStack(netherrackGlowstoneHandpick), recipe, '#', InfiLibrary.glowstoneCrystal, '|', InfiLibrary.netherrackRod);
			GameRegistry.addRecipe(new ItemStack(glowstoneGlowstoneHandpick), recipe, '#', InfiLibrary.glowstoneCrystal, '|', InfiLibrary.glowstoneRod);
			GameRegistry.addRecipe(new ItemStack(iceGlowstoneHandpick), recipe, '#', InfiLibrary.glowstoneCrystal, '|', InfiLibrary.iceRod);
			GameRegistry.addRecipe(new ItemStack(slimeGlowstoneHandpick), recipe, '#', InfiLibrary.glowstoneCrystal, '|', InfiLibrary.slimeRod);
			GameRegistry.addRecipe(new ItemStack(cactusGlowstoneHandpick), recipe, '#', InfiLibrary.glowstoneCrystal, '|', InfiLibrary.cactusRod);
		}

		if (PropsHelperInfi2x2.enableIceTools)
		{
			GameRegistry.addRecipe(new ItemStack(woodIceHandpick), recipe, '#', Block.ice, '|', Item.stick);
			GameRegistry.addRecipe(new ItemStack(boneIceHandpick), recipe, '#', Block.ice, '|', Item.bone);
			GameRegistry.addRecipe(new ItemStack(boneIceHandpick), recipe, '#', Block.ice, '|', InfiLibrary.boneRod);
			GameRegistry.addRecipe(new ItemStack(paperIceHandpick), recipe, '#', Block.ice, '|', InfiLibrary.paperRod);
			GameRegistry.addRecipe(new ItemStack(iceIceHandpick), recipe, '#', Block.ice, '|', InfiLibrary.iceRod);
			GameRegistry.addRecipe(new ItemStack(slimeIceHandpick), recipe, '#', Block.ice, '|', InfiLibrary.slimeRod);
			GameRegistry.addRecipe(new ItemStack(cactusIceHandpick), recipe, '#', Block.ice, '|', InfiLibrary.cactusRod);
		}

		if (PropsHelperInfi2x2.enableLavaTools)
		{
			GameRegistry.addRecipe(new ItemStack(diamondLavaHandpick), recipe, '#', InfiLibrary.lavaCrystal, '|', InfiLibrary.diamondRod);
			GameRegistry.addRecipe(new ItemStack(obsidianLavaHandpick), recipe, '#', InfiLibrary.lavaCrystal, '|', InfiLibrary.obsidianRod);
			GameRegistry.addRecipe(new ItemStack(netherrackLavaHandpick), recipe, '#', InfiLibrary.lavaCrystal, '|', InfiLibrary.netherrackRod);
			GameRegistry.addRecipe(new ItemStack(lavaLavaHandpick), recipe, '#', InfiLibrary.lavaCrystal, '|', InfiLibrary.lavaRod);
			GameRegistry.addRecipe(new ItemStack(flintLavaHandpick), recipe, '#', InfiLibrary.lavaCrystal, '|', InfiLibrary.flintRod);
			GameRegistry.addRecipe(new ItemStack(blazeLavaHandpick), recipe, '#', InfiLibrary.lavaCrystal, '|', Item.blazeRod);
			GameRegistry.addRecipe(new ItemStack(manyullynLavaHandpick), recipe, '#', InfiLibrary.lavaCrystal, '|', InfiLibrary.manyullynRod);
			GameRegistry.addRecipe(new ItemStack(uraniumLavaHandpick), recipe, '#', InfiLibrary.lavaCrystal, '|', InfiLibrary.uraniumRod);
		}

		if (PropsHelperInfi2x2.enableSlimeTools)
		{
			GameRegistry.addRecipe(new ItemStack(woodSlimeHandpick), recipe, '#', InfiLibrary.slimeCrystal, '|', Item.stick);
			GameRegistry.addRecipe(new ItemStack(sandstoneSlimeHandpick), recipe, '#', InfiLibrary.slimeCrystal, '|', InfiLibrary.sandstoneRod);
			GameRegistry.addRecipe(new ItemStack(boneSlimeHandpick), recipe, '#', InfiLibrary.slimeCrystal, '|', Item.bone);
			GameRegistry.addRecipe(new ItemStack(boneSlimeHandpick), recipe, '#', InfiLibrary.slimeCrystal, '|', InfiLibrary.boneRod);
			GameRegistry.addRecipe(new ItemStack(paperSlimeHandpick), recipe, '#', InfiLibrary.slimeCrystal, '|', InfiLibrary.paperRod);
			GameRegistry.addRecipe(new ItemStack(slimeSlimeHandpick), recipe, '#', InfiLibrary.slimeCrystal, '|', InfiLibrary.slimeRod);
			GameRegistry.addRecipe(new ItemStack(cactusSlimeHandpick), recipe, '#', InfiLibrary.slimeCrystal, '|', InfiLibrary.cactusRod);
		}

		if (PropsHelperInfi2x2.enableCactusTools)
		{
			GameRegistry.addRecipe(new ItemStack(woodCactusHandpick), recipe, '#', Block.cactus, '|', Item.stick);
			GameRegistry.addRecipe(new ItemStack(sandstoneCactusHandpick), recipe, '#', Block.cactus, '|', InfiLibrary.sandstoneRod);
			GameRegistry.addRecipe(new ItemStack(boneCactusHandpick), recipe, '#', Block.cactus, '|', Item.bone);
			GameRegistry.addRecipe(new ItemStack(boneCactusHandpick), recipe, '#', Block.cactus, '|', InfiLibrary.boneRod);
			GameRegistry.addRecipe(new ItemStack(netherrackCactusHandpick), recipe, '#', Block.cactus, '|', InfiLibrary.netherrackRod);
			GameRegistry.addRecipe(new ItemStack(iceCactusHandpick), recipe, '#', Block.cactus, '|', InfiLibrary.iceRod);
			GameRegistry.addRecipe(new ItemStack(slimeCactusHandpick), recipe, '#', Block.cactus, '|', InfiLibrary.slimeRod);
			GameRegistry.addRecipe(new ItemStack(cactusCactusHandpick), recipe, '#', Block.cactus, '|', InfiLibrary.cactusRod);
		}

		if (PropsHelperInfi2x2.enableFlintTools)
		{
			GameRegistry.addRecipe(new ItemStack(woodFlintHandpick), recipe, '#', Item.flint, '|', Item.stick);
			GameRegistry.addRecipe(new ItemStack(stoneFlintHandpick), recipe, '#', Item.flint, '|', InfiLibrary.stoneRod);
			GameRegistry.addRecipe(new ItemStack(sandstoneFlintHandpick), recipe, '#', Item.flint, '|', InfiLibrary.sandstoneRod);
			GameRegistry.addRecipe(new ItemStack(boneFlintHandpick), recipe, '#', Item.flint, '|', Item.bone);
			GameRegistry.addRecipe(new ItemStack(boneFlintHandpick), recipe, '#', Item.flint, '|', InfiLibrary.boneRod);
			GameRegistry.addRecipe(new ItemStack(netherrackFlintHandpick), recipe, '#', Item.flint, '|', InfiLibrary.netherrackRod);
			GameRegistry.addRecipe(new ItemStack(slimeFlintHandpick), recipe, '#', Item.flint, '|', InfiLibrary.slimeRod);
			GameRegistry.addRecipe(new ItemStack(cactusFlintHandpick), recipe, '#', Item.flint, '|', InfiLibrary.cactusRod);
			GameRegistry.addRecipe(new ItemStack(flintFlintHandpick), recipe, '#', Item.flint, '|', InfiLibrary.flintRod);
			GameRegistry.addRecipe(new ItemStack(copperFlintHandpick), recipe, '#', Item.flint, '|', InfiLibrary.copperRod);
			GameRegistry.addRecipe(new ItemStack(bronzeFlintHandpick), recipe, '#', Item.flint, '|', InfiLibrary.bronzeRod);
		}

		if (PropsHelperInfi2x2.enableBlazeTools)
		{
			GameRegistry.addRecipe(new ItemStack(diamondBlazeHandpick), recipe, '#', InfiLibrary.blazeCrystal, '|', InfiLibrary.diamondRod);
			GameRegistry.addRecipe(new ItemStack(obsidianBlazeHandpick), recipe, '#', InfiLibrary.blazeCrystal, '|', InfiLibrary.obsidianRod);
			GameRegistry.addRecipe(new ItemStack(netherrackBlazeHandpick), recipe, '#', InfiLibrary.blazeCrystal, '|', InfiLibrary.netherrackRod);
			GameRegistry.addRecipe(new ItemStack(lavaBlazeHandpick), recipe, '#', InfiLibrary.blazeCrystal, '|', InfiLibrary.lavaRod);
			GameRegistry.addRecipe(new ItemStack(flintBlazeHandpick), recipe, '#', InfiLibrary.blazeCrystal, '|', InfiLibrary.flintRod);
			GameRegistry.addRecipe(new ItemStack(blazeBlazeHandpick), recipe, '#', InfiLibrary.blazeCrystal, '|', Item.blazeRod);
			GameRegistry.addRecipe(new ItemStack(manyullynBlazeHandpick), recipe, '#', InfiLibrary.blazeCrystal, '|', InfiLibrary.manyullynRod);
			GameRegistry.addRecipe(new ItemStack(uraniumBlazeHandpick), recipe, '#', InfiLibrary.blazeCrystal, '|', InfiLibrary.uraniumRod);
		}
	}

	public static void addStoneTools(String stack)
	{
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(woodStoneHandpick), recipe, '#', stack, '|', Item.stick));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(stoneStoneHandpick), recipe, '#', stack, '|', InfiLibrary.stoneRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(sandstoneStoneHandpick), recipe, '#', stack, '|', InfiLibrary.sandstoneRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(boneStoneHandpick), recipe, '#', stack, '|', Item.bone));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(boneStoneHandpick), recipe, '#', stack, '|', InfiLibrary.boneRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(netherrackStoneHandpick), recipe, '#', stack, '|', InfiLibrary.netherrackRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(iceStoneHandpick), recipe, '#', stack, '|', InfiLibrary.iceRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(slimeStoneHandpick), recipe, '#', stack, '|', InfiLibrary.slimeRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(cactusStoneHandpick), recipe, '#', stack, '|', InfiLibrary.cactusRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(flintStoneHandpick), recipe, '#', stack, '|', InfiLibrary.flintRod));
	}

	public static void addCopperTools(String stack)
	{
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(woodCopperHandpick), recipe, '#', stack, '|', Item.stick));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(stoneCopperHandpick), recipe, '#', stack, '|', InfiLibrary.stoneRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(boneCopperHandpick), recipe, '#', stack, '|', Item.bone));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(boneCopperHandpick), recipe, '#', stack, '|', InfiLibrary.boneRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(netherrackCopperHandpick), recipe, '#', stack, '|', InfiLibrary.netherrackRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(slimeCopperHandpick), recipe, '#', stack, '|', InfiLibrary.slimeRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(cactusCopperHandpick), recipe, '#', stack, '|', InfiLibrary.cactusRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(flintCopperHandpick), recipe, '#', stack, '|', InfiLibrary.flintRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(copperCopperHandpick), recipe, '#', stack, '|', InfiLibrary.copperRod));
	}

	public static void addBronzeTools(String stack)
	{
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(woodBronzeHandpick), recipe, '#', stack, '|', Item.stick));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(stoneBronzeHandpick), recipe, '#', stack, '|', InfiLibrary.stoneRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(boneBronzeHandpick), recipe, '#', stack, '|', Item.bone));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(boneBronzeHandpick), recipe, '#', stack, '|', InfiLibrary.boneRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(netherrackBronzeHandpick), recipe, '#', stack, '|', InfiLibrary.netherrackRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(slimeBronzeHandpick), recipe, '#', stack, '|', InfiLibrary.slimeRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(cactusBronzeHandpick), recipe, '#', stack, '|', InfiLibrary.cactusRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(flintBronzeHandpick), recipe, '#', stack, '|', InfiLibrary.flintRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(copperBronzeHandpick), recipe, '#', stack, '|', InfiLibrary.copperRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(bronzeBronzeHandpick), recipe, '#', stack, '|', InfiLibrary.bronzeRod));
	}

	public static void addWorkedIronTools(String stack)
	{
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(woodWorkedIronHandpick), recipe, '#', stack, '|', Item.stick));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(stoneWorkedIronHandpick), recipe, '#', stack, '|', InfiLibrary.stoneRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ironWorkedIronHandpick), recipe, '#', stack, '|', InfiLibrary.ironRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(diamondWorkedIronHandpick), recipe, '#', stack, '|', InfiLibrary.diamondRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(redstoneWorkedIronHandpick), recipe, '#', stack, '|', InfiLibrary.redstoneRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(obsidianWorkedIronHandpick), recipe, '#', stack, '|', InfiLibrary.obsidianRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(boneWorkedIronHandpick), recipe, '#', stack, '|', Item.bone));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(boneWorkedIronHandpick), recipe, '#', stack, '|', InfiLibrary.boneRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(netherrackWorkedIronHandpick), recipe, '#', stack, '|', InfiLibrary.netherrackRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(glowstoneWorkedIronHandpick), recipe, '#', stack, '|', InfiLibrary.glowstoneRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(iceWorkedIronHandpick), recipe, '#', stack, '|', InfiLibrary.iceRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(slimeWorkedIronHandpick), recipe, '#', stack, '|', InfiLibrary.slimeRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(cactusWorkedIronHandpick), recipe, '#', stack, '|', InfiLibrary.cactusRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(blazeWorkedIronHandpick), recipe, '#', stack, '|', Item.blazeRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(copperWorkedIronHandpick), recipe, '#', stack, '|', InfiLibrary.copperRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(bronzeWorkedIronHandpick), recipe, '#', stack, '|', InfiLibrary.bronzeRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(workedWorkedIronHandpick), recipe, '#', stack, '|', InfiLibrary.workedIronRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(steelWorkedIronHandpick), recipe, '#', stack, '|', InfiLibrary.steelRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(uraniumWorkedIronHandpick), recipe, '#', stack, '|', InfiLibrary.uraniumRod));
	}

	public static void addSteelTools(String stack)
	{
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(woodSteelHandpick), recipe, '#', stack, '|', Item.stick));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(stoneSteelHandpick), recipe, '#', stack, '|', InfiLibrary.stoneRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ironSteelHandpick), recipe, '#', stack, '|', InfiLibrary.ironRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(diamondSteelHandpick), recipe, '#', stack, '|', InfiLibrary.diamondRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(redstoneSteelHandpick), recipe, '#', stack, '|', InfiLibrary.redstoneRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(obsidianSteelHandpick), recipe, '#', stack, '|', InfiLibrary.obsidianRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(boneSteelHandpick), recipe, '#', stack, '|', Item.bone));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(boneSteelHandpick), recipe, '#', stack, '|', InfiLibrary.boneRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(netherrackSteelHandpick), recipe, '#', stack, '|', InfiLibrary.netherrackRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(glowstoneSteelHandpick), recipe, '#', stack, '|', InfiLibrary.glowstoneRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(iceSteelHandpick), recipe, '#', stack, '|', InfiLibrary.iceRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(slimeSteelHandpick), recipe, '#', stack, '|', InfiLibrary.slimeRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(cactusSteelHandpick), recipe, '#', stack, '|', InfiLibrary.cactusRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(blazeSteelHandpick), recipe, '#', stack, '|', Item.blazeRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(copperSteelHandpick), recipe, '#', stack, '|', InfiLibrary.copperRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(bronzeSteelHandpick), recipe, '#', stack, '|', InfiLibrary.bronzeRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(workedSteelHandpick), recipe, '#', stack, '|', InfiLibrary.workedIronRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(steelSteelHandpick), recipe, '#', stack, '|', InfiLibrary.steelRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(cobaltSteelHandpick), recipe, '#', stack, '|', InfiLibrary.cobaltRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(arditeSteelHandpick), recipe, '#', stack, '|', InfiLibrary.arditeRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(uraniumSteelHandpick), recipe, '#', stack, '|', InfiLibrary.uraniumRod));
	}

	public static void addCobaltTools(String stack)
	{
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(woodCobaltHandpick), recipe, '#', stack, '|', Item.stick));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(stoneCobaltHandpick), recipe, '#', stack, '|', InfiLibrary.stoneRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ironCobaltHandpick), recipe, '#', stack, '|', InfiLibrary.ironRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(diamondCobaltHandpick), recipe, '#', stack, '|', InfiLibrary.diamondRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(redstoneCobaltHandpick), recipe, '#', stack, '|', InfiLibrary.redstoneRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(obsidianCobaltHandpick), recipe, '#', stack, '|', InfiLibrary.obsidianRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(boneCobaltHandpick), recipe, '#', stack, '|', Item.bone));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(boneCobaltHandpick), recipe, '#', stack, '|', InfiLibrary.boneRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(slimeCobaltHandpick), recipe, '#', stack, '|', InfiLibrary.slimeRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(cactusCobaltHandpick), recipe, '#', stack, '|', InfiLibrary.cactusRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(blazeCobaltHandpick), recipe, '#', stack, '|', Item.blazeRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(copperCobaltHandpick), recipe, '#', stack, '|', InfiLibrary.copperRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(bronzeCobaltHandpick), recipe, '#', stack, '|', InfiLibrary.bronzeRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(workedCobaltHandpick), recipe, '#', stack, '|', InfiLibrary.workedIronRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(steelCobaltHandpick), recipe, '#', stack, '|', InfiLibrary.steelRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(cobaltCobaltHandpick), recipe, '#', stack, '|', InfiLibrary.cobaltRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(arditeCobaltHandpick), recipe, '#', stack, '|', InfiLibrary.arditeRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(manyullynCobaltHandpick), recipe, '#', stack, '|', InfiLibrary.manyullynRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(uraniumCobaltHandpick), recipe, '#', stack, '|', InfiLibrary.uraniumRod));
	}

	public static void addArditeTools(String stack)
	{
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(woodArditeHandpick), recipe, '#', stack, '|', Item.stick));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(stoneArditeHandpick), recipe, '#', stack, '|', InfiLibrary.stoneRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ironArditeHandpick), recipe, '#', stack, '|', InfiLibrary.ironRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(diamondArditeHandpick), recipe, '#', stack, '|', InfiLibrary.diamondRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(redstoneArditeHandpick), recipe, '#', stack, '|', InfiLibrary.redstoneRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(obsidianArditeHandpick), recipe, '#', stack, '|', InfiLibrary.obsidianRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(boneArditeHandpick), recipe, '#', stack, '|', Item.bone));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(boneArditeHandpick), recipe, '#', stack, '|', InfiLibrary.boneRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(slimeArditeHandpick), recipe, '#', stack, '|', InfiLibrary.slimeRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(cactusArditeHandpick), recipe, '#', stack, '|', InfiLibrary.cactusRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(blazeArditeHandpick), recipe, '#', stack, '|', Item.blazeRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(copperArditeHandpick), recipe, '#', stack, '|', InfiLibrary.copperRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(bronzeArditeHandpick), recipe, '#', stack, '|', InfiLibrary.bronzeRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(workedArditeHandpick), recipe, '#', stack, '|', InfiLibrary.workedIronRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(steelArditeHandpick), recipe, '#', stack, '|', InfiLibrary.steelRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(cobaltArditeHandpick), recipe, '#', stack, '|', InfiLibrary.cobaltRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(arditeArditeHandpick), recipe, '#', stack, '|', InfiLibrary.arditeRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(manyullynArditeHandpick), recipe, '#', stack, '|', InfiLibrary.manyullynRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(uraniumArditeHandpick), recipe, '#', stack, '|', InfiLibrary.uraniumRod));
	}

	public static void addManyullynTools(String stack)
	{
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(woodManyullynHandpick), recipe, '#', stack, '|', Item.stick));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(stoneManyullynHandpick), recipe, '#', stack, '|', InfiLibrary.stoneRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ironManyullynHandpick), recipe, '#', stack, '|', InfiLibrary.ironRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(diamondManyullynHandpick), recipe, '#', stack, '|', InfiLibrary.diamondRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(redstoneManyullynHandpick), recipe, '#', stack, '|', InfiLibrary.redstoneRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(obsidianManyullynHandpick), recipe, '#', stack, '|', InfiLibrary.obsidianRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(boneManyullynHandpick), recipe, '#', stack, '|', Item.bone));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(boneManyullynHandpick), recipe, '#', stack, '|', InfiLibrary.boneRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(slimeManyullynHandpick), recipe, '#', stack, '|', InfiLibrary.slimeRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(cactusManyullynHandpick), recipe, '#', stack, '|', InfiLibrary.cactusRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(blazeManyullynHandpick), recipe, '#', stack, '|', Item.blazeRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(copperManyullynHandpick), recipe, '#', stack, '|', InfiLibrary.copperRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(bronzeManyullynHandpick), recipe, '#', stack, '|', InfiLibrary.bronzeRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(workedManyullynHandpick), recipe, '#', stack, '|', InfiLibrary.workedIronRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(steelManyullynHandpick), recipe, '#', stack, '|', InfiLibrary.steelRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(cobaltManyullynHandpick), recipe, '#', stack, '|', InfiLibrary.cobaltRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(arditeManyullynHandpick), recipe, '#', stack, '|', InfiLibrary.arditeRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(manyullynManyullynHandpick), recipe, '#', stack, '|', InfiLibrary.manyullynRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(uraniumManyullynHandpick), recipe, '#', stack, '|', InfiLibrary.uraniumRod));
	}

	public static void addUraniumTools(String stack)
	{
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(diamondUraniumHandpick), recipe, '#', stack, '|', InfiLibrary.diamondRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(redstoneUraniumHandpick), recipe, '#', stack, '|', InfiLibrary.redstoneRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(boneUraniumHandpick), recipe, '#', stack, '|', Item.bone));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(boneUraniumHandpick), recipe, '#', stack, '|', InfiLibrary.boneRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(netherrackUraniumHandpick), recipe, '#', stack, '|', InfiLibrary.netherrackRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(glowstoneUraniumHandpick), recipe, '#', stack, '|', InfiLibrary.glowstoneRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(lavaUraniumHandpick), recipe, '#', stack, '|', InfiLibrary.lavaRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(blazeUraniumHandpick), recipe, '#', stack, '|', Item.blazeRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(cobaltUraniumHandpick), recipe, '#', stack, '|', InfiLibrary.cobaltRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(arditeUraniumHandpick), recipe, '#', stack, '|', InfiLibrary.arditeRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(uraniumUraniumHandpick), recipe, '#', stack, '|', InfiLibrary.uraniumRod));
	}

	public static Item woodWoodHandpick;
	public static Item sandstoneWoodHandpick;
	public static Item boneWoodHandpick;
	public static Item paperWoodHandpick;
	public static Item iceWoodHandpick;
	public static Item slimeWoodHandpick;
	public static Item cactusWoodHandpick;

	public static Item woodStoneHandpick;
	public static Item stoneStoneHandpick;
	public static Item sandstoneStoneHandpick;
	public static Item boneStoneHandpick;
	public static Item netherrackStoneHandpick;
	public static Item iceStoneHandpick;
	public static Item slimeStoneHandpick;
	public static Item cactusStoneHandpick;
	public static Item flintStoneHandpick;

	public static Item woodIronHandpick;
	public static Item stoneIronHandpick;
	public static Item ironIronHandpick;
	public static Item boneIronHandpick;
	public static Item netherrackIronHandpick;
	public static Item glowstoneIronHandpick;
	public static Item cactusIronHandpick;
	public static Item copperIronHandpick;
	public static Item bronzeIronHandpick;

	public static Item woodDiamondHandpick;
	public static Item stoneDiamondHandpick;
	public static Item ironDiamondHandpick;
	public static Item diamondDiamondHandpick;
	public static Item redstoneDiamondHandpick;
	public static Item obsidianDiamondHandpick;
	public static Item boneDiamondHandpick;
	public static Item mossyDiamondHandpick;
	public static Item netherrackDiamondHandpick;
	public static Item glowstoneDiamondHandpick;
	public static Item lavaDiamondHandpick;
	public static Item cactusDiamondHandpick;
	public static Item flintDiamondHandpick;
	public static Item blazeDiamondHandpick;
	public static Item copperDiamondHandpick;
	public static Item bronzeDiamondHandpick;
	public static Item workedDiamondHandpick;
	public static Item steelDiamondHandpick;
	public static Item cobaltDiamondHandpick;
	public static Item arditeDiamondHandpick;
	public static Item manyullynDiamondHandpick;
	public static Item uraniumDiamondHandpick;

	public static Item woodRedstoneHandpick;
	public static Item stoneRedstoneHandpick;
	public static Item ironRedstoneHandpick;
	public static Item redstoneRedstoneHandpick;
	public static Item obsidianRedstoneHandpick;
	public static Item sandstoneRedstoneHandpick;
	public static Item boneRedstoneHandpick;
	public static Item paperRedstoneHandpick;
	public static Item mossyRedstoneHandpick;
	public static Item netherrackRedstoneHandpick;
	public static Item glowstoneRedstoneHandpick;
	public static Item iceRedstoneHandpick;
	public static Item lavaRedstoneHandpick;
	public static Item slimeRedstoneHandpick;
	public static Item cactusRedstoneHandpick;
	public static Item flintRedstoneHandpick;
	public static Item copperRedstoneHandpick;
	public static Item bronzeRedstoneHandpick;
	public static Item workedRedstoneHandpick;
	public static Item uraniumRedstoneHandpick;

	public static Item woodObsidianHandpick;
	public static Item stoneObsidianHandpick;
	public static Item redstoneObsidianHandpick;
	public static Item obsidianObsidianHandpick;
	public static Item boneObsidianHandpick;
	public static Item netherrackObsidianHandpick;
	public static Item glowstoneObsidianHandpick;
	public static Item iceObsidianHandpick;
	public static Item lavaObsidianHandpick;
	public static Item cactusObsidianHandpick;

	public static Item woodSandstoneHandpick;
	public static Item sandstoneSandstoneHandpick;
	public static Item boneSandstoneHandpick;
	public static Item netherrackSandstoneHandpick;
	public static Item iceSandstoneHandpick;
	public static Item slimeSandstoneHandpick;
	public static Item cactusSandstoneHandpick;
	public static Item flintSandstoneHandpick;

	public static Item woodBoneHandpick;
	public static Item stoneBoneHandpick;
	public static Item sandstoneBoneHandpick;
	public static Item boneBoneHandpick;
	public static Item paperBoneHandpick;
	public static Item netherrackBoneHandpick;
	public static Item iceBoneHandpick;
	public static Item cactusBoneHandpick;
	public static Item flintBoneHandpick;

	public static Item woodPaperHandpick;
	public static Item bonePaperHandpick;
	public static Item paperPaperHandpick;
	public static Item slimePaperHandpick;
	public static Item cactusPaperHandpick;

	public static Item woodMossyHandpick;
	public static Item stoneMossyHandpick;
	public static Item diamondMossyHandpick;
	public static Item redstoneMossyHandpick;
	public static Item boneMossyHandpick;
	public static Item mossyMossyHandpick;
	public static Item netherrackMossyHandpick;
	public static Item glowstoneMossyHandpick;
	public static Item cactusMossyHandpick;
	public static Item blazeMossyHandpick;
	public static Item manyullynMossyHandpick;
	public static Item uraniumMossyHandpick;

	public static Item woodNetherrackHandpick;
	public static Item stoneNetherrackHandpick;
	public static Item sandstoneNetherrackHandpick;
	public static Item boneNetherrackHandpick;
	public static Item paperNetherrackHandpick;
	public static Item mossyNetherrackHandpick;
	public static Item netherrackNetherrackHandpick;
	public static Item iceNetherrackHandpick;
	public static Item slimeNetherrackHandpick;
	public static Item cactusNetherrackHandpick;
	public static Item flintNetherrackHandpick;
	public static Item copperNetherrackHandpick;
	public static Item bronzeNetherrackHandpick;

	public static Item woodGlowstoneHandpick;
	public static Item redstoneGlowstoneHandpick;
	public static Item obsidianGlowstoneHandpick;
	public static Item boneGlowstoneHandpick;
	public static Item netherrackGlowstoneHandpick;
	public static Item glowstoneGlowstoneHandpick;
	public static Item iceGlowstoneHandpick;
	public static Item slimeGlowstoneHandpick;
	public static Item cactusGlowstoneHandpick;

	public static Item woodIceHandpick;
	public static Item boneIceHandpick;
	public static Item paperIceHandpick;
	public static Item iceIceHandpick;
	public static Item slimeIceHandpick;
	public static Item cactusIceHandpick;

	public static Item diamondLavaHandpick;
	public static Item obsidianLavaHandpick;
	public static Item netherrackLavaHandpick;
	public static Item lavaLavaHandpick;
	public static Item flintLavaHandpick;
	public static Item blazeLavaHandpick;
	public static Item manyullynLavaHandpick;
	public static Item uraniumLavaHandpick;

	public static Item woodSlimeHandpick;
	public static Item sandstoneSlimeHandpick;
	public static Item boneSlimeHandpick;
	public static Item paperSlimeHandpick;
	public static Item slimeSlimeHandpick;
	public static Item cactusSlimeHandpick;

	public static Item woodCactusHandpick;
	public static Item sandstoneCactusHandpick;
	public static Item boneCactusHandpick;
	public static Item netherrackCactusHandpick;
	public static Item iceCactusHandpick;
	public static Item slimeCactusHandpick;
	public static Item cactusCactusHandpick;

	public static Item woodFlintHandpick;
	public static Item stoneFlintHandpick;
	public static Item sandstoneFlintHandpick;
	public static Item boneFlintHandpick;
	public static Item netherrackFlintHandpick;
	public static Item slimeFlintHandpick;
	public static Item cactusFlintHandpick;
	public static Item flintFlintHandpick;
	public static Item copperFlintHandpick;
	public static Item bronzeFlintHandpick;

	public static Item diamondBlazeHandpick;
	public static Item obsidianBlazeHandpick;
	public static Item netherrackBlazeHandpick;
	public static Item lavaBlazeHandpick;
	public static Item flintBlazeHandpick;
	public static Item blazeBlazeHandpick;
	public static Item manyullynBlazeHandpick;
	public static Item uraniumBlazeHandpick;

	public static Item woodCopperHandpick;
	public static Item stoneCopperHandpick;
	public static Item boneCopperHandpick;
	public static Item netherrackCopperHandpick;
	public static Item slimeCopperHandpick;
	public static Item cactusCopperHandpick;
	public static Item flintCopperHandpick;
	public static Item copperCopperHandpick;

	public static Item woodBronzeHandpick;
	public static Item stoneBronzeHandpick;
	public static Item boneBronzeHandpick;
	public static Item netherrackBronzeHandpick;
	public static Item slimeBronzeHandpick;
	public static Item cactusBronzeHandpick;
	public static Item flintBronzeHandpick;
	public static Item copperBronzeHandpick;
	public static Item bronzeBronzeHandpick;

	public static Item woodWorkedIronHandpick;
	public static Item stoneWorkedIronHandpick;
	public static Item ironWorkedIronHandpick;
	public static Item diamondWorkedIronHandpick;
	public static Item redstoneWorkedIronHandpick;
	public static Item obsidianWorkedIronHandpick;
	public static Item boneWorkedIronHandpick;
	public static Item netherrackWorkedIronHandpick;
	public static Item glowstoneWorkedIronHandpick;
	public static Item iceWorkedIronHandpick;
	public static Item slimeWorkedIronHandpick;
	public static Item cactusWorkedIronHandpick;
	public static Item blazeWorkedIronHandpick;
	public static Item copperWorkedIronHandpick;
	public static Item bronzeWorkedIronHandpick;
	public static Item workedWorkedIronHandpick;
	public static Item steelWorkedIronHandpick;
	public static Item uraniumWorkedIronHandpick;

	public static Item woodSteelHandpick;
	public static Item stoneSteelHandpick;
	public static Item ironSteelHandpick;
	public static Item diamondSteelHandpick;
	public static Item redstoneSteelHandpick;
	public static Item obsidianSteelHandpick;
	public static Item boneSteelHandpick;
	public static Item netherrackSteelHandpick;
	public static Item glowstoneSteelHandpick;
	public static Item iceSteelHandpick;
	public static Item slimeSteelHandpick;
	public static Item cactusSteelHandpick;
	public static Item blazeSteelHandpick;
	public static Item copperSteelHandpick;
	public static Item bronzeSteelHandpick;
	public static Item workedSteelHandpick;
	public static Item steelSteelHandpick;
	public static Item cobaltSteelHandpick;
	public static Item arditeSteelHandpick;
	public static Item uraniumSteelHandpick;

	public static Item woodCobaltHandpick;
	public static Item stoneCobaltHandpick;
	public static Item ironCobaltHandpick;
	public static Item diamondCobaltHandpick;
	public static Item redstoneCobaltHandpick;
	public static Item obsidianCobaltHandpick;
	public static Item boneCobaltHandpick;
	public static Item slimeCobaltHandpick;
	public static Item cactusCobaltHandpick;
	public static Item blazeCobaltHandpick;
	public static Item copperCobaltHandpick;
	public static Item bronzeCobaltHandpick;
	public static Item workedCobaltHandpick;
	public static Item steelCobaltHandpick;
	public static Item cobaltCobaltHandpick;
	public static Item arditeCobaltHandpick;
	public static Item manyullynCobaltHandpick;
	public static Item uraniumCobaltHandpick;

	public static Item woodArditeHandpick;
	public static Item stoneArditeHandpick;
	public static Item ironArditeHandpick;
	public static Item diamondArditeHandpick;
	public static Item redstoneArditeHandpick;
	public static Item obsidianArditeHandpick;
	public static Item boneArditeHandpick;
	public static Item slimeArditeHandpick;
	public static Item cactusArditeHandpick;
	public static Item blazeArditeHandpick;
	public static Item copperArditeHandpick;
	public static Item bronzeArditeHandpick;
	public static Item workedArditeHandpick;
	public static Item steelArditeHandpick;
	public static Item cobaltArditeHandpick;
	public static Item arditeArditeHandpick;
	public static Item manyullynArditeHandpick;
	public static Item uraniumArditeHandpick;

	public static Item woodManyullynHandpick;
	public static Item stoneManyullynHandpick;
	public static Item ironManyullynHandpick;
	public static Item diamondManyullynHandpick;
	public static Item redstoneManyullynHandpick;
	public static Item obsidianManyullynHandpick;
	public static Item boneManyullynHandpick;
	public static Item slimeManyullynHandpick;
	public static Item cactusManyullynHandpick;
	public static Item blazeManyullynHandpick;
	public static Item copperManyullynHandpick;
	public static Item bronzeManyullynHandpick;
	public static Item workedManyullynHandpick;
	public static Item steelManyullynHandpick;
	public static Item cobaltManyullynHandpick;
	public static Item arditeManyullynHandpick;
	public static Item manyullynManyullynHandpick;
	public static Item uraniumManyullynHandpick;

	public static Item diamondUraniumHandpick;
	public static Item redstoneUraniumHandpick;
	public static Item boneUraniumHandpick;
	public static Item netherrackUraniumHandpick;
	public static Item glowstoneUraniumHandpick;
	public static Item lavaUraniumHandpick;
	public static Item blazeUraniumHandpick;
	public static Item cobaltUraniumHandpick;
	public static Item arditeUraniumHandpick;
	public static Item uraniumUraniumHandpick;
}
