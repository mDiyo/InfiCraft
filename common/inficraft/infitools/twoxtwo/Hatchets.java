package inficraft.infitools.twoxtwo;

import inficraft.infitools.base.PHInfiTools;
import inficraft.infitools.library.InfiLibrary;
import inficraft.infitools.library.InfiMaterialEnum;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.src.Block;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;

public class Hatchets
{
	public static Hatchets instance = new Hatchets();

	private static String[] recipe = { "##", " |" };

	public static Hatchets getInstance()
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

	private static void createVanillaTools()
	{
		woodWoodHatchet = new InfiToolHatchet(PropsHelperInfi2x2.woodHatchetID + 0, InfiMaterialEnum.Wood, InfiMaterialEnum.Wood, "woodWoodHatchet");
		woodStoneHatchet = new InfiToolHatchet(PropsHelperInfi2x2.stoneHatchetID + 0, InfiMaterialEnum.Stone, InfiMaterialEnum.Wood, "woodStoneHatchet");
		woodIronHatchet = new InfiToolHatchet(PropsHelperInfi2x2.ironHatchetID + 0, InfiMaterialEnum.Iron, InfiMaterialEnum.Wood, "woodIronHatchet");
		woodDiamondHatchet = new InfiToolHatchet(PropsHelperInfi2x2.diamondHatchetID + 0, InfiMaterialEnum.Diamond, InfiMaterialEnum.Wood, "woodDiamondHatchet");

		LanguageRegistry.instance().addName(woodWoodHatchet, "Wooden Hatchet");
	}

	private static void registerVanillaRecipes()
	{
		GameRegistry.addRecipe(new ItemStack(woodWoodHatchet), recipe, '#', Block.planks, '|', Item.stick);
		GameRegistry.addRecipe(new ItemStack(woodStoneHatchet), recipe, '#', Block.cobblestone, '|', Item.stick);
		GameRegistry.addRecipe(new ItemStack(woodIronHatchet), recipe, '#', Item.ingotIron, '|', Item.stick);
		GameRegistry.addRecipe(new ItemStack(woodDiamondHatchet), recipe, '#', Item.diamond, '|', Item.stick);
	}

	private static void createTools()
	{
		if (PropsHelperInfi2x2.enableWoodTools)
		{
			woodWoodHatchet = new InfiToolHatchet(PropsHelperInfi2x2.woodHatchetID + 0, InfiMaterialEnum.Wood, InfiMaterialEnum.Wood, "woodWoodHatchet");
			sandstoneWoodHatchet = new InfiToolHatchet(PropsHelperInfi2x2.woodHatchetID + 1, InfiMaterialEnum.Wood, InfiMaterialEnum.Sandstone, "sandstoneWoodHatchet");
			boneWoodHatchet = new InfiToolHatchet(PropsHelperInfi2x2.woodHatchetID + 2, InfiMaterialEnum.Wood, InfiMaterialEnum.Bone, "boneWoodHatchet");
			paperWoodHatchet = new InfiToolHatchet(PropsHelperInfi2x2.woodHatchetID + 3, InfiMaterialEnum.Wood, InfiMaterialEnum.Paper, "paperWoodHatchet");
			iceWoodHatchet = new InfiToolHatchet(PropsHelperInfi2x2.woodHatchetID + 4, InfiMaterialEnum.Wood, InfiMaterialEnum.Ice, "iceWoodHatchet");
			slimeWoodHatchet = new InfiToolHatchet(PropsHelperInfi2x2.woodHatchetID + 5, InfiMaterialEnum.Wood, InfiMaterialEnum.Slime, "slimeWoodHatchet");
			cactusWoodHatchet = new InfiToolHatchet(PropsHelperInfi2x2.woodHatchetID + 6, InfiMaterialEnum.Wood, InfiMaterialEnum.Cactus, "cactusWoodHatchet");
		}

		if (PropsHelperInfi2x2.enableStoneTools)
		{
			woodStoneHatchet = new InfiToolHatchet(PropsHelperInfi2x2.stoneHatchetID + 0, InfiMaterialEnum.Stone, InfiMaterialEnum.Wood, "woodStoneHatchet");
			stoneStoneHatchet = new InfiToolHatchet(PropsHelperInfi2x2.stoneHatchetID + 1, InfiMaterialEnum.Stone, InfiMaterialEnum.Stone, "stoneStoneHatchet");
			sandstoneStoneHatchet = new InfiToolHatchet(PropsHelperInfi2x2.stoneHatchetID + 2, InfiMaterialEnum.Stone, InfiMaterialEnum.Sandstone, "sandstoneStoneHatchet");
			boneStoneHatchet = new InfiToolHatchet(PropsHelperInfi2x2.stoneHatchetID + 3, InfiMaterialEnum.Stone, InfiMaterialEnum.Bone, "boneStoneHatchet");
			netherrackStoneHatchet = new InfiToolHatchet(PropsHelperInfi2x2.stoneHatchetID + 4, InfiMaterialEnum.Stone, InfiMaterialEnum.Netherrack, "netherrackStoneHatchet");
			iceStoneHatchet = new InfiToolHatchet(PropsHelperInfi2x2.stoneHatchetID + 5, InfiMaterialEnum.Stone, InfiMaterialEnum.Ice, "iceStoneHatchet");
			slimeStoneHatchet = new InfiToolHatchet(PropsHelperInfi2x2.stoneHatchetID + 6, InfiMaterialEnum.Stone, InfiMaterialEnum.Slime, "slimeStoneHatchet");
			cactusStoneHatchet = new InfiToolHatchet(PropsHelperInfi2x2.stoneHatchetID + 7, InfiMaterialEnum.Stone, InfiMaterialEnum.Cactus, "cactusStoneHatchet");
			flintStoneHatchet = new InfiToolHatchet(PropsHelperInfi2x2.stoneHatchetID + 8, InfiMaterialEnum.Stone, InfiMaterialEnum.Flint, "flintStoneHatchet");
		}

		if (PropsHelperInfi2x2.enableIronTools)
		{
			woodIronHatchet = new InfiToolHatchet(PropsHelperInfi2x2.ironHatchetID + 0, InfiMaterialEnum.Iron, InfiMaterialEnum.Wood, "woodIronHatchet");
			stoneIronHatchet = new InfiToolHatchet(PropsHelperInfi2x2.ironHatchetID + 1, InfiMaterialEnum.Iron, InfiMaterialEnum.Stone, "stoneIronHatchet");
			ironIronHatchet = new InfiToolHatchet(PropsHelperInfi2x2.ironHatchetID + 2, InfiMaterialEnum.Iron, InfiMaterialEnum.Iron, "ironIronHatchet");
			boneIronHatchet = new InfiToolHatchet(PropsHelperInfi2x2.ironHatchetID + 3, InfiMaterialEnum.Iron, InfiMaterialEnum.Bone, "boneIronHatchet");
			netherrackIronHatchet = new InfiToolHatchet(PropsHelperInfi2x2.ironHatchetID + 4, InfiMaterialEnum.Iron, InfiMaterialEnum.Netherrack, "netherrackIronHatchet");
			glowstoneIronHatchet = new InfiToolHatchet(PropsHelperInfi2x2.ironHatchetID + 5, InfiMaterialEnum.Iron, InfiMaterialEnum.Glowstone, "glowstoneIronHatchet");
			cactusIronHatchet = new InfiToolHatchet(PropsHelperInfi2x2.ironHatchetID + 6, InfiMaterialEnum.Iron, InfiMaterialEnum.Cactus, "cactusIronHatchet");
			copperIronHatchet = new InfiToolHatchet(PropsHelperInfi2x2.ironHatchetID + 7, InfiMaterialEnum.Iron, InfiMaterialEnum.Copper, "copperIronHatchet");
			bronzeIronHatchet = new InfiToolHatchet(PropsHelperInfi2x2.ironHatchetID + 8, InfiMaterialEnum.Iron, InfiMaterialEnum.Bronze, "bronzeIronHatchet");
		}

		if (PropsHelperInfi2x2.enableDiamondTools)
		{
			woodDiamondHatchet = new InfiToolHatchet(PropsHelperInfi2x2.diamondHatchetID + 0, InfiMaterialEnum.Diamond, InfiMaterialEnum.Wood, "woodDiamondHatchet");
			stoneDiamondHatchet = new InfiToolHatchet(PropsHelperInfi2x2.diamondHatchetID + 1, InfiMaterialEnum.Diamond, InfiMaterialEnum.Stone, "stoneDiamondHatchet");
			ironDiamondHatchet = new InfiToolHatchet(PropsHelperInfi2x2.diamondHatchetID + 2, InfiMaterialEnum.Diamond, InfiMaterialEnum.Iron, "ironDiamondHatchet");
			diamondDiamondHatchet = new InfiToolHatchet(PropsHelperInfi2x2.diamondHatchetID + 3, InfiMaterialEnum.Diamond, InfiMaterialEnum.Diamond, "diamondDiamondHatchet");
			redstoneDiamondHatchet = new InfiToolHatchet(PropsHelperInfi2x2.diamondHatchetID + 4, InfiMaterialEnum.Diamond, InfiMaterialEnum.Redstone, "redstoneDiamondHatchet");
			obsidianDiamondHatchet = new InfiToolHatchet(PropsHelperInfi2x2.diamondHatchetID + 5, InfiMaterialEnum.Diamond, InfiMaterialEnum.Obsidian, "obsidianDiamondHatchet");
			boneDiamondHatchet = new InfiToolHatchet(PropsHelperInfi2x2.diamondHatchetID + 6, InfiMaterialEnum.Diamond, InfiMaterialEnum.Bone, "boneDiamondHatchet");
			mossyDiamondHatchet = new InfiToolHatchet(PropsHelperInfi2x2.diamondHatchetID + 7, InfiMaterialEnum.Diamond, InfiMaterialEnum.Mossy, "mossyDiamondHatchet");
			netherrackDiamondHatchet = new InfiToolHatchet(PropsHelperInfi2x2.diamondHatchetID + 8, InfiMaterialEnum.Diamond, InfiMaterialEnum.Netherrack, "netherrackDiamondHatchet");
			glowstoneDiamondHatchet = new InfiToolHatchet(PropsHelperInfi2x2.diamondHatchetID + 9, InfiMaterialEnum.Diamond, InfiMaterialEnum.Glowstone, "glowstoneDiamondHatchet");
			lavaDiamondHatchet = new InfiToolHatchet(PropsHelperInfi2x2.diamondHatchetID + 10, InfiMaterialEnum.Diamond, InfiMaterialEnum.Lava, "lavaDiamondHatchet");
			cactusDiamondHatchet = new InfiToolHatchet(PropsHelperInfi2x2.diamondHatchetID + 11, InfiMaterialEnum.Diamond, InfiMaterialEnum.Cactus, "cactusDiamondHatchet");
			flintDiamondHatchet = new InfiToolHatchet(PropsHelperInfi2x2.diamondHatchetID + 12, InfiMaterialEnum.Diamond, InfiMaterialEnum.Flint, "flintDiamondHatchet");
			blazeDiamondHatchet = new InfiToolHatchet(PropsHelperInfi2x2.diamondHatchetID + 13, InfiMaterialEnum.Diamond, InfiMaterialEnum.Blaze, "blazeDiamondHatchet");
			copperDiamondHatchet = new InfiToolHatchet(PropsHelperInfi2x2.diamondHatchetID + 14, InfiMaterialEnum.Diamond, InfiMaterialEnum.Copper, "copperDiamondHatchet");
			bronzeDiamondHatchet = new InfiToolHatchet(PropsHelperInfi2x2.diamondHatchetID + 15, InfiMaterialEnum.Diamond, InfiMaterialEnum.Bronze, "bronzeDiamondHatchet");
			workedDiamondHatchet = new InfiToolHatchet(PropsHelperInfi2x2.diamondHatchetID + 16, InfiMaterialEnum.Diamond, InfiMaterialEnum.WorkedIron, "workedDiamondHatchet");
			steelDiamondHatchet = new InfiToolHatchet(PropsHelperInfi2x2.diamondHatchetID + 17, InfiMaterialEnum.Diamond, InfiMaterialEnum.Steel, "steelDiamondHatchet");
			cobaltDiamondHatchet = new InfiToolHatchet(PropsHelperInfi2x2.diamondHatchetID + 18, InfiMaterialEnum.Diamond, InfiMaterialEnum.Cobalt, "cobaltDiamondHatchet");
			arditeDiamondHatchet = new InfiToolHatchet(PropsHelperInfi2x2.diamondHatchetID + 19, InfiMaterialEnum.Diamond, InfiMaterialEnum.Ardite, "arditeDiamondHatchet");
			manyullynDiamondHatchet = new InfiToolHatchet(PropsHelperInfi2x2.diamondHatchetID + 20, InfiMaterialEnum.Diamond, InfiMaterialEnum.Manyullyn, "manyullynDiamondHatchet");
			uraniumDiamondHatchet = new InfiToolHatchet(PropsHelperInfi2x2.diamondHatchetID + 21, InfiMaterialEnum.Diamond, InfiMaterialEnum.Uranium, "uraniumDiamondHatchet");
		}

		if (PropsHelperInfi2x2.enableRedstoneTools)
		{
			woodRedstoneHatchet = new InfiToolHatchet(PropsHelperInfi2x2.redstoneHatchetID + 0, InfiMaterialEnum.Redstone, InfiMaterialEnum.Wood, "woodRedstoneHatchet");
			stoneRedstoneHatchet = new InfiToolHatchet(PropsHelperInfi2x2.redstoneHatchetID + 1, InfiMaterialEnum.Redstone, InfiMaterialEnum.Stone, "stoneRedstoneHatchet");
			ironRedstoneHatchet = new InfiToolHatchet(PropsHelperInfi2x2.redstoneHatchetID + 2, InfiMaterialEnum.Redstone, InfiMaterialEnum.Iron, "ironRedstoneHatchet");
			redstoneRedstoneHatchet = new InfiToolHatchet(PropsHelperInfi2x2.redstoneHatchetID + 3, InfiMaterialEnum.Redstone, InfiMaterialEnum.Redstone, "redstoneRedstoneHatchet");
			obsidianRedstoneHatchet = new InfiToolHatchet(PropsHelperInfi2x2.redstoneHatchetID + 4, InfiMaterialEnum.Redstone, InfiMaterialEnum.Obsidian, "obsidianRedstoneHatchet");
			sandstoneRedstoneHatchet = new InfiToolHatchet(PropsHelperInfi2x2.redstoneHatchetID + 5, InfiMaterialEnum.Redstone, InfiMaterialEnum.Sandstone, "sandstoneRedstoneHatchet");
			boneRedstoneHatchet = new InfiToolHatchet(PropsHelperInfi2x2.redstoneHatchetID + 6, InfiMaterialEnum.Redstone, InfiMaterialEnum.Bone, "boneRedstoneHatchet");
			paperRedstoneHatchet = new InfiToolHatchet(PropsHelperInfi2x2.redstoneHatchetID + 7, InfiMaterialEnum.Redstone, InfiMaterialEnum.Paper, "paperRedstoneHatchet");
			mossyRedstoneHatchet = new InfiToolHatchet(PropsHelperInfi2x2.redstoneHatchetID + 8, InfiMaterialEnum.Redstone, InfiMaterialEnum.Mossy, "mossyRedstoneHatchet");
			netherrackRedstoneHatchet = new InfiToolHatchet(PropsHelperInfi2x2.redstoneHatchetID + 9, InfiMaterialEnum.Redstone, InfiMaterialEnum.Netherrack, "netherrackRedstoneHatchet");
			glowstoneRedstoneHatchet = new InfiToolHatchet(PropsHelperInfi2x2.redstoneHatchetID + 10, InfiMaterialEnum.Redstone, InfiMaterialEnum.Glowstone, "glowstoneRedstoneHatchet");
			iceRedstoneHatchet = new InfiToolHatchet(PropsHelperInfi2x2.redstoneHatchetID + 11, InfiMaterialEnum.Redstone, InfiMaterialEnum.Ice, "iceRedstoneHatchet");
			lavaRedstoneHatchet = new InfiToolHatchet(PropsHelperInfi2x2.redstoneHatchetID + 12, InfiMaterialEnum.Redstone, InfiMaterialEnum.Lava, "lavaRedstoneHatchet");
			slimeRedstoneHatchet = new InfiToolHatchet(PropsHelperInfi2x2.redstoneHatchetID + 13, InfiMaterialEnum.Redstone, InfiMaterialEnum.Slime, "slimeRedstoneHatchet");
			cactusRedstoneHatchet = new InfiToolHatchet(PropsHelperInfi2x2.redstoneHatchetID + 14, InfiMaterialEnum.Redstone, InfiMaterialEnum.Cactus, "cactusRedstoneHatchet");
			flintRedstoneHatchet = new InfiToolHatchet(PropsHelperInfi2x2.redstoneHatchetID + 15, InfiMaterialEnum.Redstone, InfiMaterialEnum.Flint, "flintRedstoneHatchet");
			copperRedstoneHatchet = new InfiToolHatchet(PropsHelperInfi2x2.redstoneHatchetID + 16, InfiMaterialEnum.Redstone, InfiMaterialEnum.Copper, "copperRedstoneHatchet");
			bronzeRedstoneHatchet = new InfiToolHatchet(PropsHelperInfi2x2.redstoneHatchetID + 17, InfiMaterialEnum.Redstone, InfiMaterialEnum.Bronze, "bronzeRedstoneHatchet");
			workedRedstoneHatchet = new InfiToolHatchet(PropsHelperInfi2x2.redstoneHatchetID + 18, InfiMaterialEnum.Redstone, InfiMaterialEnum.WorkedIron, "workedRedstoneHatchet");
			uraniumRedstoneHatchet = new InfiToolHatchet(PropsHelperInfi2x2.redstoneHatchetID + 19, InfiMaterialEnum.Redstone, InfiMaterialEnum.Uranium, "uraniumRedstoneHatchet");
		}

		if (PropsHelperInfi2x2.enableObsidianTools)
		{
			woodObsidianHatchet = new InfiToolHatchet(PropsHelperInfi2x2.obsidianHatchetID + 0, InfiMaterialEnum.Obsidian, InfiMaterialEnum.Wood, "woodObsidianHatchet");
			stoneObsidianHatchet = new InfiToolHatchet(PropsHelperInfi2x2.obsidianHatchetID + 1, InfiMaterialEnum.Obsidian, InfiMaterialEnum.Stone, "stoneObsidianHatchet");
			redstoneObsidianHatchet = new InfiToolHatchet(PropsHelperInfi2x2.obsidianHatchetID + 2, InfiMaterialEnum.Obsidian, InfiMaterialEnum.Redstone, "redstoneObsidianHatchet");
			obsidianObsidianHatchet = new InfiToolHatchet(PropsHelperInfi2x2.obsidianHatchetID + 3, InfiMaterialEnum.Obsidian, InfiMaterialEnum.Obsidian, "obsidianObsidianHatchet");
			;
			boneObsidianHatchet = new InfiToolHatchet(PropsHelperInfi2x2.obsidianHatchetID + 4, InfiMaterialEnum.Obsidian, InfiMaterialEnum.Bone, "boneObsidianHatchet");
			netherrackObsidianHatchet = new InfiToolHatchet(PropsHelperInfi2x2.obsidianHatchetID + 5, InfiMaterialEnum.Obsidian, InfiMaterialEnum.Netherrack, "netherrackObsidianHatchet");
			glowstoneObsidianHatchet = new InfiToolHatchet(PropsHelperInfi2x2.obsidianHatchetID + 6, InfiMaterialEnum.Obsidian, InfiMaterialEnum.Glowstone, "glowstoneObsidianHatchet");
			iceObsidianHatchet = new InfiToolHatchet(PropsHelperInfi2x2.obsidianHatchetID + 7, InfiMaterialEnum.Obsidian, InfiMaterialEnum.Ice, "iceObsidianHatchet");
			lavaObsidianHatchet = new InfiToolHatchet(PropsHelperInfi2x2.obsidianHatchetID + 8, InfiMaterialEnum.Obsidian, InfiMaterialEnum.Lava, "lavaObsidianHatchet");
			cactusObsidianHatchet = new InfiToolHatchet(PropsHelperInfi2x2.obsidianHatchetID + 9, InfiMaterialEnum.Obsidian, InfiMaterialEnum.Cactus, "cactusObsidianHatchet");
		}

		if (PropsHelperInfi2x2.enableSandstoneTools)
		{
			woodSandstoneHatchet = new InfiToolHatchet(PropsHelperInfi2x2.sandstoneHatchetID + 0, InfiMaterialEnum.Sandstone, InfiMaterialEnum.Wood, "woodSandstoneHatchet");
			sandstoneSandstoneHatchet = new InfiToolHatchet(PropsHelperInfi2x2.sandstoneHatchetID + 1, InfiMaterialEnum.Sandstone, InfiMaterialEnum.Sandstone, "sandstoneSandstoneHatchet");
			boneSandstoneHatchet = new InfiToolHatchet(PropsHelperInfi2x2.sandstoneHatchetID + 2, InfiMaterialEnum.Sandstone, InfiMaterialEnum.Bone, "boneSandstoneHatchet");
			netherrackSandstoneHatchet = new InfiToolHatchet(PropsHelperInfi2x2.sandstoneHatchetID + 3, InfiMaterialEnum.Sandstone, InfiMaterialEnum.Netherrack, "netherrackSandstoneHatchet");
			iceSandstoneHatchet = new InfiToolHatchet(PropsHelperInfi2x2.sandstoneHatchetID + 4, InfiMaterialEnum.Sandstone, InfiMaterialEnum.Ice, "iceSandstoneHatchet");
			slimeSandstoneHatchet = new InfiToolHatchet(PropsHelperInfi2x2.sandstoneHatchetID + 5, InfiMaterialEnum.Sandstone, InfiMaterialEnum.Slime, "slimeSandstoneHatchet");
			cactusSandstoneHatchet = new InfiToolHatchet(PropsHelperInfi2x2.sandstoneHatchetID + 6, InfiMaterialEnum.Sandstone, InfiMaterialEnum.Cactus, "cactusSandstoneHatchet");
			flintSandstoneHatchet = new InfiToolHatchet(PropsHelperInfi2x2.sandstoneHatchetID + 7, InfiMaterialEnum.Sandstone, InfiMaterialEnum.Flint, "flintSandstoneHatchet");
		}

		if (PropsHelperInfi2x2.enableBoneTools)
		{
			woodBoneHatchet = new InfiToolHatchet(PropsHelperInfi2x2.boneHatchetID + 0, InfiMaterialEnum.Bone, InfiMaterialEnum.Bone, "woodBoneHatchet");
			stoneBoneHatchet = new InfiToolHatchet(PropsHelperInfi2x2.boneHatchetID + 1, InfiMaterialEnum.Bone, InfiMaterialEnum.Stone, "stoneBoneHatchet");
			sandstoneBoneHatchet = new InfiToolHatchet(PropsHelperInfi2x2.boneHatchetID + 2, InfiMaterialEnum.Bone, InfiMaterialEnum.Sandstone, "sandstoneBoneHatchet");
			boneBoneHatchet = new InfiToolHatchet(PropsHelperInfi2x2.boneHatchetID + 3, InfiMaterialEnum.Bone, InfiMaterialEnum.Bone, "boneBoneHatchet");
			paperBoneHatchet = new InfiToolHatchet(PropsHelperInfi2x2.boneHatchetID + 4, InfiMaterialEnum.Bone, InfiMaterialEnum.Paper, "paperBoneHatchet");
			netherrackBoneHatchet = new InfiToolHatchet(PropsHelperInfi2x2.boneHatchetID + 5, InfiMaterialEnum.Bone, InfiMaterialEnum.Netherrack, "netherrackBoneHatchet");
			iceBoneHatchet = new InfiToolHatchet(PropsHelperInfi2x2.boneHatchetID + 6, InfiMaterialEnum.Bone, InfiMaterialEnum.Ice, "iceBoneHatchet");
			cactusBoneHatchet = new InfiToolHatchet(PropsHelperInfi2x2.boneHatchetID + 7, InfiMaterialEnum.Bone, InfiMaterialEnum.Cactus, "cactusBoneHatchet");
			flintBoneHatchet = new InfiToolHatchet(PropsHelperInfi2x2.boneHatchetID + 8, InfiMaterialEnum.Bone, InfiMaterialEnum.Flint, "flintBoneHatchet");
		}

		if (PropsHelperInfi2x2.enablePaperTools)
		{
			woodPaperHatchet = new InfiToolHatchet(PropsHelperInfi2x2.paperHatchetID + 0, InfiMaterialEnum.Paper, InfiMaterialEnum.Wood, "woodPaperHatchet");
			bonePaperHatchet = new InfiToolHatchet(PropsHelperInfi2x2.paperHatchetID + 1, InfiMaterialEnum.Paper, InfiMaterialEnum.Bone, "bonePaperHatchet");
			paperPaperHatchet = new InfiToolHatchet(PropsHelperInfi2x2.paperHatchetID + 2, InfiMaterialEnum.Paper, InfiMaterialEnum.Paper, "paperPaperHatchet");
			slimePaperHatchet = new InfiToolHatchet(PropsHelperInfi2x2.paperHatchetID + 3, InfiMaterialEnum.Paper, InfiMaterialEnum.Slime, "slimePaperHatchet");
			cactusPaperHatchet = new InfiToolHatchet(PropsHelperInfi2x2.paperHatchetID + 4, InfiMaterialEnum.Paper, InfiMaterialEnum.Cactus, "cactusPaperHatchet");
		}

		if (PropsHelperInfi2x2.enableMossyTools)
		{
			woodMossyHatchet = new InfiToolHatchet(PropsHelperInfi2x2.mossyHatchetID + 0, InfiMaterialEnum.Mossy, InfiMaterialEnum.Wood, "woodMossyHatchet");
			stoneMossyHatchet = new InfiToolHatchet(PropsHelperInfi2x2.mossyHatchetID + 1, InfiMaterialEnum.Mossy, InfiMaterialEnum.Stone, "stoneMossyHatchet");
			diamondMossyHatchet = new InfiToolHatchet(PropsHelperInfi2x2.mossyHatchetID + 2, InfiMaterialEnum.Mossy, InfiMaterialEnum.Diamond, "diamondMossyHatchet");
			redstoneMossyHatchet = new InfiToolHatchet(PropsHelperInfi2x2.mossyHatchetID + 3, InfiMaterialEnum.Mossy, InfiMaterialEnum.Redstone, "redstoneMossyHatchet");
			boneMossyHatchet = new InfiToolHatchet(PropsHelperInfi2x2.mossyHatchetID + 4, InfiMaterialEnum.Mossy, InfiMaterialEnum.Bone, "boneMossyHatchet");
			mossyMossyHatchet = new InfiToolHatchet(PropsHelperInfi2x2.mossyHatchetID + 5, InfiMaterialEnum.Mossy, InfiMaterialEnum.Mossy, "mossyMossyHatchet");
			netherrackMossyHatchet = new InfiToolHatchet(PropsHelperInfi2x2.mossyHatchetID + 6, InfiMaterialEnum.Mossy, InfiMaterialEnum.Netherrack, "netherrackMossyHatchet");
			glowstoneMossyHatchet = new InfiToolHatchet(PropsHelperInfi2x2.mossyHatchetID + 7, InfiMaterialEnum.Mossy, InfiMaterialEnum.Glowstone, "glowstoneMossyHatchet");
			cactusMossyHatchet = new InfiToolHatchet(PropsHelperInfi2x2.mossyHatchetID + 8, InfiMaterialEnum.Mossy, InfiMaterialEnum.Cactus, "cactusMossyHatchet");
			blazeMossyHatchet = new InfiToolHatchet(PropsHelperInfi2x2.mossyHatchetID + 9, InfiMaterialEnum.Mossy, InfiMaterialEnum.Blaze, "blazeMossyHatchet");
			manyullynMossyHatchet = new InfiToolHatchet(PropsHelperInfi2x2.mossyHatchetID + 10, InfiMaterialEnum.Mossy, InfiMaterialEnum.Manyullyn, "manyullynMossyHatchet");
			uraniumMossyHatchet = new InfiToolHatchet(PropsHelperInfi2x2.mossyHatchetID + 11, InfiMaterialEnum.Mossy, InfiMaterialEnum.Uranium, "uraniumMossyHatchet");
		}

		if (PropsHelperInfi2x2.enableNetherrackTools)
		{
			woodNetherrackHatchet = new InfiToolHatchet(PropsHelperInfi2x2.netherrackHatchetID + 0, InfiMaterialEnum.Netherrack, InfiMaterialEnum.Wood, "woodNetherrackHatchet");
			stoneNetherrackHatchet = new InfiToolHatchet(PropsHelperInfi2x2.netherrackHatchetID + 1, InfiMaterialEnum.Netherrack, InfiMaterialEnum.Stone, "stoneNetherrackHatchet");
			sandstoneNetherrackHatchet = new InfiToolHatchet(PropsHelperInfi2x2.netherrackHatchetID + 2, InfiMaterialEnum.Netherrack, InfiMaterialEnum.Sandstone, "sandstoneNetherrackHatchet");
			boneNetherrackHatchet = new InfiToolHatchet(PropsHelperInfi2x2.netherrackHatchetID + 3, InfiMaterialEnum.Netherrack, InfiMaterialEnum.Bone, "boneNetherrackHatchet");
			paperNetherrackHatchet = new InfiToolHatchet(PropsHelperInfi2x2.netherrackHatchetID + 4, InfiMaterialEnum.Netherrack, InfiMaterialEnum.Paper, "paperNetherrackHatchet");
			mossyNetherrackHatchet = new InfiToolHatchet(PropsHelperInfi2x2.netherrackHatchetID + 5, InfiMaterialEnum.Netherrack, InfiMaterialEnum.Mossy, "mossyNetherrackHatchet");
			netherrackNetherrackHatchet = new InfiToolHatchet(PropsHelperInfi2x2.netherrackHatchetID + 6, InfiMaterialEnum.Netherrack, InfiMaterialEnum.Netherrack, "netherrackNetherrackHatchet");
			iceNetherrackHatchet = new InfiToolHatchet(PropsHelperInfi2x2.netherrackHatchetID + 7, InfiMaterialEnum.Netherrack, InfiMaterialEnum.Ice, "iceNetherrackHatchet");
			slimeNetherrackHatchet = new InfiToolHatchet(PropsHelperInfi2x2.netherrackHatchetID + 8, InfiMaterialEnum.Netherrack, InfiMaterialEnum.Slime, "slimeNetherrackHatchet");
			cactusNetherrackHatchet = new InfiToolHatchet(PropsHelperInfi2x2.netherrackHatchetID + 9, InfiMaterialEnum.Netherrack, InfiMaterialEnum.Cactus, "cactusNetherrackHatchet");
			flintNetherrackHatchet = new InfiToolHatchet(PropsHelperInfi2x2.netherrackHatchetID + 10, InfiMaterialEnum.Netherrack, InfiMaterialEnum.Flint, "flintNetherrackHatchet");
			copperNetherrackHatchet = new InfiToolHatchet(PropsHelperInfi2x2.netherrackHatchetID + 11, InfiMaterialEnum.Netherrack, InfiMaterialEnum.Copper, "copperNetherrackHatchet");
			bronzeNetherrackHatchet = new InfiToolHatchet(PropsHelperInfi2x2.netherrackHatchetID + 12, InfiMaterialEnum.Netherrack, InfiMaterialEnum.Bronze, "bronzeNetherrackHatchet");

		}

		if (PropsHelperInfi2x2.enableGlowstoneTools)
		{
			woodGlowstoneHatchet = new InfiToolHatchet(PropsHelperInfi2x2.glowstoneHatchetID + 0, InfiMaterialEnum.Glowstone, InfiMaterialEnum.Wood, "woodGlowstoneHatchet");
			redstoneGlowstoneHatchet = new InfiToolHatchet(PropsHelperInfi2x2.glowstoneHatchetID + 1, InfiMaterialEnum.Glowstone, InfiMaterialEnum.Redstone, "redstoneGlowstoneHatchet");
			obsidianGlowstoneHatchet = new InfiToolHatchet(PropsHelperInfi2x2.glowstoneHatchetID + 2, InfiMaterialEnum.Glowstone, InfiMaterialEnum.Obsidian, "obsidianGlowstoneHatchet");
			boneGlowstoneHatchet = new InfiToolHatchet(PropsHelperInfi2x2.glowstoneHatchetID + 3, InfiMaterialEnum.Glowstone, InfiMaterialEnum.Bone, "boneGlowstoneHatchet");
			netherrackGlowstoneHatchet = new InfiToolHatchet(PropsHelperInfi2x2.glowstoneHatchetID + 4, InfiMaterialEnum.Glowstone, InfiMaterialEnum.Netherrack, "netherrackGlowstoneHatchet");
			glowstoneGlowstoneHatchet = new InfiToolHatchet(PropsHelperInfi2x2.glowstoneHatchetID + 5, InfiMaterialEnum.Glowstone, InfiMaterialEnum.Glowstone, "glowstoneGlowstoneHatchet");
			iceGlowstoneHatchet = new InfiToolHatchet(PropsHelperInfi2x2.glowstoneHatchetID + 6, InfiMaterialEnum.Glowstone, InfiMaterialEnum.Ice, "iceGlowstoneHatchet");
			slimeGlowstoneHatchet = new InfiToolHatchet(PropsHelperInfi2x2.glowstoneHatchetID + 7, InfiMaterialEnum.Glowstone, InfiMaterialEnum.Slime, "slimeGlowstoneHatchet");
			cactusGlowstoneHatchet = new InfiToolHatchet(PropsHelperInfi2x2.glowstoneHatchetID + 8, InfiMaterialEnum.Glowstone, InfiMaterialEnum.Cactus, "cactusGlowstoneHatchet");

		}

		if (PropsHelperInfi2x2.enableIceTools)
		{
			woodIceHatchet = new InfiToolHatchet(PropsHelperInfi2x2.iceHatchetID + 0, InfiMaterialEnum.Ice, InfiMaterialEnum.Wood, "woodIceHatchet");
			boneIceHatchet = new InfiToolHatchet(PropsHelperInfi2x2.iceHatchetID + 1, InfiMaterialEnum.Ice, InfiMaterialEnum.Bone, "boneIceHatchet");
			paperIceHatchet = new InfiToolHatchet(PropsHelperInfi2x2.iceHatchetID + 2, InfiMaterialEnum.Ice, InfiMaterialEnum.Paper, "paperIceHatchet");
			iceIceHatchet = new InfiToolHatchet(PropsHelperInfi2x2.iceHatchetID + 3, InfiMaterialEnum.Ice, InfiMaterialEnum.Ice, "iceIceHatchet");
			slimeIceHatchet = new InfiToolHatchet(PropsHelperInfi2x2.iceHatchetID + 4, InfiMaterialEnum.Ice, InfiMaterialEnum.Slime, "slimeIceHatchet");
			cactusIceHatchet = new InfiToolHatchet(PropsHelperInfi2x2.iceHatchetID + 5, InfiMaterialEnum.Ice, InfiMaterialEnum.Cactus, "cactusIceHatchet");

		}

		if (PropsHelperInfi2x2.enableLavaTools)
		{
			diamondLavaHatchet = new InfiToolHatchet(PropsHelperInfi2x2.lavaHatchetID + 0, InfiMaterialEnum.Lava, InfiMaterialEnum.Diamond, "diamondLavaHatchet");
			obsidianLavaHatchet = new InfiToolHatchet(PropsHelperInfi2x2.lavaHatchetID + 1, InfiMaterialEnum.Lava, InfiMaterialEnum.Obsidian, "obsidianLavaHatchet");
			netherrackLavaHatchet = new InfiToolHatchet(PropsHelperInfi2x2.lavaHatchetID + 2, InfiMaterialEnum.Lava, InfiMaterialEnum.Netherrack, "netherrackLavaHatchet");
			lavaLavaHatchet = new InfiToolHatchet(PropsHelperInfi2x2.lavaHatchetID + 3, InfiMaterialEnum.Lava, InfiMaterialEnum.Lava, "lavaLavaHatchet");
			flintLavaHatchet = new InfiToolHatchet(PropsHelperInfi2x2.lavaHatchetID + 4, InfiMaterialEnum.Lava, InfiMaterialEnum.Flint, "flintLavaHatchet");
			blazeLavaHatchet = new InfiToolHatchet(PropsHelperInfi2x2.lavaHatchetID + 5, InfiMaterialEnum.Lava, InfiMaterialEnum.Blaze, "blazeLavaHatchet");
			manyullynLavaHatchet = new InfiToolHatchet(PropsHelperInfi2x2.lavaHatchetID + 6, InfiMaterialEnum.Lava, InfiMaterialEnum.Manyullyn, "manyullynLavaHatchet");
			uraniumLavaHatchet = new InfiToolHatchet(PropsHelperInfi2x2.lavaHatchetID + 7, InfiMaterialEnum.Lava, InfiMaterialEnum.Uranium, "uraniumLavaHatchet");

		}

		if (PropsHelperInfi2x2.enableSlimeTools)
		{
			woodSlimeHatchet = new InfiToolHatchet(PropsHelperInfi2x2.slimeHatchetID + 0, InfiMaterialEnum.Slime, InfiMaterialEnum.Wood, "woodSlimeHatchet");
			sandstoneSlimeHatchet = new InfiToolHatchet(PropsHelperInfi2x2.slimeHatchetID + 1, InfiMaterialEnum.Slime, InfiMaterialEnum.Sandstone, "sandstoneSlimeHatchet");
			boneSlimeHatchet = new InfiToolHatchet(PropsHelperInfi2x2.slimeHatchetID + 2, InfiMaterialEnum.Slime, InfiMaterialEnum.Bone, "boneSlimeHatchet");
			paperSlimeHatchet = new InfiToolHatchet(PropsHelperInfi2x2.slimeHatchetID + 3, InfiMaterialEnum.Slime, InfiMaterialEnum.Paper, "paperSlimeHatchet");
			slimeSlimeHatchet = new InfiToolHatchet(PropsHelperInfi2x2.slimeHatchetID + 4, InfiMaterialEnum.Slime, InfiMaterialEnum.Slime, "slimeSlimeHatchet");
			cactusSlimeHatchet = new InfiToolHatchet(PropsHelperInfi2x2.slimeHatchetID + 5, InfiMaterialEnum.Slime, InfiMaterialEnum.Cactus, "cactusSlimeHatchet");

		}

		if (PropsHelperInfi2x2.enableCactusTools)
		{
			woodCactusHatchet = new InfiToolHatchet(PropsHelperInfi2x2.cactusHatchetID + 0, InfiMaterialEnum.Cactus, InfiMaterialEnum.Wood, "woodCactusHatchet");
			sandstoneCactusHatchet = new InfiToolHatchet(PropsHelperInfi2x2.cactusHatchetID + 1, InfiMaterialEnum.Cactus, InfiMaterialEnum.Sandstone, "sandstoneCactusHatchet");
			boneCactusHatchet = new InfiToolHatchet(PropsHelperInfi2x2.cactusHatchetID + 2, InfiMaterialEnum.Cactus, InfiMaterialEnum.Bone, "boneCactusHatchet");
			netherrackCactusHatchet = new InfiToolHatchet(PropsHelperInfi2x2.cactusHatchetID + 3, InfiMaterialEnum.Cactus, InfiMaterialEnum.Netherrack, "netherrackCactusHatchet");
			iceCactusHatchet = new InfiToolHatchet(PropsHelperInfi2x2.cactusHatchetID + 4, InfiMaterialEnum.Cactus, InfiMaterialEnum.Ice, "iceCactusHatchet");
			slimeCactusHatchet = new InfiToolHatchet(PropsHelperInfi2x2.cactusHatchetID + 5, InfiMaterialEnum.Cactus, InfiMaterialEnum.Slime, "slimeCactusHatchet");
			cactusCactusHatchet = new InfiToolHatchet(PropsHelperInfi2x2.cactusHatchetID + 6, InfiMaterialEnum.Cactus, InfiMaterialEnum.Cactus, "cactusCactusHatchet");

		}

		if (PropsHelperInfi2x2.enableFlintTools)
		{
			woodFlintHatchet = new InfiToolHatchet(PropsHelperInfi2x2.flintHatchetID + 0, InfiMaterialEnum.Flint, InfiMaterialEnum.Wood, "woodFlintHatchet");
			stoneFlintHatchet = new InfiToolHatchet(PropsHelperInfi2x2.flintHatchetID + 1, InfiMaterialEnum.Flint, InfiMaterialEnum.Stone, "stoneFlintHatchet");
			sandstoneFlintHatchet = new InfiToolHatchet(PropsHelperInfi2x2.flintHatchetID + 2, InfiMaterialEnum.Flint, InfiMaterialEnum.Sandstone, "sandstoneFlintHatchet");
			boneFlintHatchet = new InfiToolHatchet(PropsHelperInfi2x2.flintHatchetID + 3, InfiMaterialEnum.Flint, InfiMaterialEnum.Bone, "boneFlintHatchet");
			netherrackFlintHatchet = new InfiToolHatchet(PropsHelperInfi2x2.flintHatchetID + 4, InfiMaterialEnum.Flint, InfiMaterialEnum.Flint, "netherrackFlintHatchet");
			slimeFlintHatchet = new InfiToolHatchet(PropsHelperInfi2x2.flintHatchetID + 5, InfiMaterialEnum.Flint, InfiMaterialEnum.Slime, "slimeFlintHatchet");
			cactusFlintHatchet = new InfiToolHatchet(PropsHelperInfi2x2.flintHatchetID + 6, InfiMaterialEnum.Flint, InfiMaterialEnum.Cactus, "cactusFlintHatchet");
			flintFlintHatchet = new InfiToolHatchet(PropsHelperInfi2x2.flintHatchetID + 7, InfiMaterialEnum.Flint, InfiMaterialEnum.Flint, "flintFlintHatchet");
			copperFlintHatchet = new InfiToolHatchet(PropsHelperInfi2x2.flintHatchetID + 8, InfiMaterialEnum.Flint, InfiMaterialEnum.Copper, "copperFlintHatchet");
			bronzeFlintHatchet = new InfiToolHatchet(PropsHelperInfi2x2.flintHatchetID + 9, InfiMaterialEnum.Flint, InfiMaterialEnum.Bronze, "bronzeFlintHatchet");

		}

		if (PropsHelperInfi2x2.enableBlazeTools)
		{
			diamondBlazeHatchet = new InfiToolHatchet(PropsHelperInfi2x2.blazeHatchetID + 0, InfiMaterialEnum.Blaze, InfiMaterialEnum.Diamond, "diamondBlazeHatchet");
			obsidianBlazeHatchet = new InfiToolHatchet(PropsHelperInfi2x2.blazeHatchetID + 1, InfiMaterialEnum.Blaze, InfiMaterialEnum.Obsidian, "obsidianBlazeHatchet");
			netherrackBlazeHatchet = new InfiToolHatchet(PropsHelperInfi2x2.blazeHatchetID + 2, InfiMaterialEnum.Blaze, InfiMaterialEnum.Netherrack, "netherrackBlazeHatchet");
			lavaBlazeHatchet = new InfiToolHatchet(PropsHelperInfi2x2.blazeHatchetID + 3, InfiMaterialEnum.Blaze, InfiMaterialEnum.Lava, "lavaBlazeHatchet");
			flintBlazeHatchet = new InfiToolHatchet(PropsHelperInfi2x2.blazeHatchetID + 4, InfiMaterialEnum.Blaze, InfiMaterialEnum.Flint, "flintBlazeHatchet");
			blazeBlazeHatchet = new InfiToolHatchet(PropsHelperInfi2x2.blazeHatchetID + 5, InfiMaterialEnum.Blaze, InfiMaterialEnum.Blaze, "blazeBlazeHatchet");
			manyullynBlazeHatchet = new InfiToolHatchet(PropsHelperInfi2x2.blazeHatchetID + 6, InfiMaterialEnum.Blaze, InfiMaterialEnum.Manyullyn, "manyullynBlazeHatchet");
			uraniumBlazeHatchet = new InfiToolHatchet(PropsHelperInfi2x2.blazeHatchetID + 7, InfiMaterialEnum.Blaze, InfiMaterialEnum.Uranium, "uraniumBlazeHatchet");

		}

		if (PropsHelperInfi2x2.enableCopperTools)
		{
			woodCopperHatchet = new InfiToolHatchet(PropsHelperInfi2x2.copperHatchetID + 0, InfiMaterialEnum.Copper, InfiMaterialEnum.Wood, "woodCopperHatchet");
			stoneCopperHatchet = new InfiToolHatchet(PropsHelperInfi2x2.copperHatchetID + 1, InfiMaterialEnum.Copper, InfiMaterialEnum.Stone, "stoneCopperHatchet");
			boneCopperHatchet = new InfiToolHatchet(PropsHelperInfi2x2.copperHatchetID + 2, InfiMaterialEnum.Copper, InfiMaterialEnum.Bone, "boneCopperHatchet");
			netherrackCopperHatchet = new InfiToolHatchet(PropsHelperInfi2x2.copperHatchetID + 3, InfiMaterialEnum.Copper, InfiMaterialEnum.Netherrack, "netherrackCopperHatchet");
			slimeCopperHatchet = new InfiToolHatchet(PropsHelperInfi2x2.copperHatchetID + 4, InfiMaterialEnum.Copper, InfiMaterialEnum.Slime, "slimeCopperHatchet");
			cactusCopperHatchet = new InfiToolHatchet(PropsHelperInfi2x2.copperHatchetID + 5, InfiMaterialEnum.Copper, InfiMaterialEnum.Cactus, "cactusCopperHatchet");
			flintCopperHatchet = new InfiToolHatchet(PropsHelperInfi2x2.copperHatchetID + 6, InfiMaterialEnum.Copper, InfiMaterialEnum.Flint, "flintCopperHatchet");
			copperCopperHatchet = new InfiToolHatchet(PropsHelperInfi2x2.copperHatchetID + 7, InfiMaterialEnum.Copper, InfiMaterialEnum.Copper, "copperCopperHatchet");

		}

		if (PropsHelperInfi2x2.enableBronzeTools)
		{
			woodBronzeHatchet = new InfiToolHatchet(PropsHelperInfi2x2.bronzeHatchetID + 0, InfiMaterialEnum.Bronze, InfiMaterialEnum.Wood, "woodBronzeHatchet");
			stoneBronzeHatchet = new InfiToolHatchet(PropsHelperInfi2x2.bronzeHatchetID + 1, InfiMaterialEnum.Bronze, InfiMaterialEnum.Stone, "stoneBronzeHatchet");
			boneBronzeHatchet = new InfiToolHatchet(PropsHelperInfi2x2.bronzeHatchetID + 2, InfiMaterialEnum.Bronze, InfiMaterialEnum.Bone, "boneBronzeHatchet");
			netherrackBronzeHatchet = new InfiToolHatchet(PropsHelperInfi2x2.bronzeHatchetID + 3, InfiMaterialEnum.Bronze, InfiMaterialEnum.Netherrack, "netherrackBronzeHatchet");
			slimeBronzeHatchet = new InfiToolHatchet(PropsHelperInfi2x2.bronzeHatchetID + 4, InfiMaterialEnum.Bronze, InfiMaterialEnum.Slime, "slimeBronzeHatchet");
			cactusBronzeHatchet = new InfiToolHatchet(PropsHelperInfi2x2.bronzeHatchetID + 5, InfiMaterialEnum.Bronze, InfiMaterialEnum.Cactus, "cactusBronzeHatchet");
			flintBronzeHatchet = new InfiToolHatchet(PropsHelperInfi2x2.bronzeHatchetID + 6, InfiMaterialEnum.Bronze, InfiMaterialEnum.Flint, "flintBronzeHatchet");
			copperBronzeHatchet = new InfiToolHatchet(PropsHelperInfi2x2.bronzeHatchetID + 7, InfiMaterialEnum.Bronze, InfiMaterialEnum.Copper, "copperBronzeHatchet");
			bronzeBronzeHatchet = new InfiToolHatchet(PropsHelperInfi2x2.bronzeHatchetID + 8, InfiMaterialEnum.Bronze, InfiMaterialEnum.Bronze, "bronzeBronzeHatchet");
		}

		if (PropsHelperInfi2x2.enableWorkedIronTools)
		{
			woodWorkedIronHatchet = new InfiToolHatchet(PropsHelperInfi2x2.workedIronHatchetID + 0, InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Wood, "woodWorkedIronHatchet");
			stoneWorkedIronHatchet = new InfiToolHatchet(PropsHelperInfi2x2.workedIronHatchetID + 1, InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Stone, "stoneWorkedIronHatchet");
			ironWorkedIronHatchet = new InfiToolHatchet(PropsHelperInfi2x2.workedIronHatchetID + 2, InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Iron, "ironWorkedIronHatchet");
			diamondWorkedIronHatchet = new InfiToolHatchet(PropsHelperInfi2x2.workedIronHatchetID + 3, InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Diamond, "diamondWorkedIronHatchet");
			redstoneWorkedIronHatchet = new InfiToolHatchet(PropsHelperInfi2x2.workedIronHatchetID + 4, InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Redstone, "redstoneWorkedIronHatchet");
			obsidianWorkedIronHatchet = new InfiToolHatchet(PropsHelperInfi2x2.workedIronHatchetID + 5, InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Obsidian, "obsidianWorkedIronHatchet");
			boneWorkedIronHatchet = new InfiToolHatchet(PropsHelperInfi2x2.workedIronHatchetID + 6, InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Bone, "boneWorkedIronHatchet");
			netherrackWorkedIronHatchet = new InfiToolHatchet(PropsHelperInfi2x2.workedIronHatchetID + 7, InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Netherrack, "netherrackWorkedIronHatchet");
			glowstoneWorkedIronHatchet = new InfiToolHatchet(PropsHelperInfi2x2.workedIronHatchetID + 8, InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Glowstone, "glowstoneWorkedIronHatchet");
			iceWorkedIronHatchet = new InfiToolHatchet(PropsHelperInfi2x2.workedIronHatchetID + 9, InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Ice, "iceWorkedIronHatchet");
			slimeWorkedIronHatchet = new InfiToolHatchet(PropsHelperInfi2x2.workedIronHatchetID + 10, InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Slime, "slimeWorkedIronHatchet");
			cactusWorkedIronHatchet = new InfiToolHatchet(PropsHelperInfi2x2.workedIronHatchetID + 11, InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Cactus, "cactusWorkedIronHatchet");
			blazeWorkedIronHatchet = new InfiToolHatchet(PropsHelperInfi2x2.workedIronHatchetID + 12, InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Blaze, "blazeWorkedIronHatchet");
			copperWorkedIronHatchet = new InfiToolHatchet(PropsHelperInfi2x2.workedIronHatchetID + 13, InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Copper, "copperWorkedIronHatchet");
			bronzeWorkedIronHatchet = new InfiToolHatchet(PropsHelperInfi2x2.workedIronHatchetID + 14, InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Bronze, "bronzeWorkedIronHatchet");
			workedWorkedIronHatchet = new InfiToolHatchet(PropsHelperInfi2x2.workedIronHatchetID + 15, InfiMaterialEnum.WorkedIron, InfiMaterialEnum.WorkedIron, "workedWorkedIronHatchet");
			steelWorkedIronHatchet = new InfiToolHatchet(PropsHelperInfi2x2.workedIronHatchetID + 16, InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Steel, "steelWorkedIronHatchet");
			uraniumWorkedIronHatchet = new InfiToolHatchet(PropsHelperInfi2x2.workedIronHatchetID + 17, InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Bronze, "uraniumWorkedIronHatchet");

		}

		if (PropsHelperInfi2x2.enableSteelTools)
		{
			woodSteelHatchet = new InfiToolHatchet(PropsHelperInfi2x2.steelHatchetID + 0, InfiMaterialEnum.Steel, InfiMaterialEnum.Wood, "woodSteelHatchet");
			stoneSteelHatchet = new InfiToolHatchet(PropsHelperInfi2x2.steelHatchetID + 1, InfiMaterialEnum.Steel, InfiMaterialEnum.Stone, "stoneSteelHatchet");
			ironSteelHatchet = new InfiToolHatchet(PropsHelperInfi2x2.steelHatchetID + 2, InfiMaterialEnum.Steel, InfiMaterialEnum.Iron, "ironSteelHatchet");
			diamondSteelHatchet = new InfiToolHatchet(PropsHelperInfi2x2.steelHatchetID + 3, InfiMaterialEnum.Steel, InfiMaterialEnum.Diamond, "diamondSteelHatchet");
			redstoneSteelHatchet = new InfiToolHatchet(PropsHelperInfi2x2.steelHatchetID + 4, InfiMaterialEnum.Steel, InfiMaterialEnum.Redstone, "redstoneSteelHatchet");
			obsidianSteelHatchet = new InfiToolHatchet(PropsHelperInfi2x2.steelHatchetID + 5, InfiMaterialEnum.Steel, InfiMaterialEnum.Obsidian, "obsidianSteelHatchet");
			boneSteelHatchet = new InfiToolHatchet(PropsHelperInfi2x2.steelHatchetID + 6, InfiMaterialEnum.Steel, InfiMaterialEnum.Bone, "boneSteelHatchet");
			netherrackSteelHatchet = new InfiToolHatchet(PropsHelperInfi2x2.steelHatchetID + 7, InfiMaterialEnum.Steel, InfiMaterialEnum.Netherrack, "netherrackSteelHatchet");
			glowstoneSteelHatchet = new InfiToolHatchet(PropsHelperInfi2x2.steelHatchetID + 8, InfiMaterialEnum.Steel, InfiMaterialEnum.Glowstone, "glowstoneSteelHatchet");
			iceSteelHatchet = new InfiToolHatchet(PropsHelperInfi2x2.steelHatchetID + 9, InfiMaterialEnum.Steel, InfiMaterialEnum.Ice, "iceSteelHatchet");
			slimeSteelHatchet = new InfiToolHatchet(PropsHelperInfi2x2.steelHatchetID + 10, InfiMaterialEnum.Steel, InfiMaterialEnum.Slime, "slimeSteelHatchet");
			cactusSteelHatchet = new InfiToolHatchet(PropsHelperInfi2x2.steelHatchetID + 11, InfiMaterialEnum.Steel, InfiMaterialEnum.Cactus, "cactusSteelHatchet");
			blazeSteelHatchet = new InfiToolHatchet(PropsHelperInfi2x2.steelHatchetID + 12, InfiMaterialEnum.Steel, InfiMaterialEnum.Blaze, "blazeSteelHatchet");
			copperSteelHatchet = new InfiToolHatchet(PropsHelperInfi2x2.steelHatchetID + 13, InfiMaterialEnum.Steel, InfiMaterialEnum.Copper, "copperSteelHatchet");
			bronzeSteelHatchet = new InfiToolHatchet(PropsHelperInfi2x2.steelHatchetID + 14, InfiMaterialEnum.Steel, InfiMaterialEnum.Bronze, "bronzeSteelHatchet");
			workedSteelHatchet = new InfiToolHatchet(PropsHelperInfi2x2.steelHatchetID + 15, InfiMaterialEnum.Steel, InfiMaterialEnum.WorkedIron, "workedSteelHatchet");
			steelSteelHatchet = new InfiToolHatchet(PropsHelperInfi2x2.steelHatchetID + 16, InfiMaterialEnum.Steel, InfiMaterialEnum.Steel, "steelSteelHatchet");
			cobaltSteelHatchet = new InfiToolHatchet(PropsHelperInfi2x2.steelHatchetID + 17, InfiMaterialEnum.Steel, InfiMaterialEnum.Cobalt, "cobaltSteelHatchet");
			arditeSteelHatchet = new InfiToolHatchet(PropsHelperInfi2x2.steelHatchetID + 18, InfiMaterialEnum.Steel, InfiMaterialEnum.Ardite, "arditeSteelHatchet");
			uraniumSteelHatchet = new InfiToolHatchet(PropsHelperInfi2x2.steelHatchetID + 19, InfiMaterialEnum.Steel, InfiMaterialEnum.Bronze, "uraniumSteelHatchet");

		}

		if (PropsHelperInfi2x2.enableCobaltTools)
		{
			woodCobaltHatchet = new InfiToolHatchet(PropsHelperInfi2x2.cobaltHatchetID + 0, InfiMaterialEnum.Cobalt, InfiMaterialEnum.Wood, "woodCobaltHatchet");
			stoneCobaltHatchet = new InfiToolHatchet(PropsHelperInfi2x2.cobaltHatchetID + 1, InfiMaterialEnum.Cobalt, InfiMaterialEnum.Stone, "stoneCobaltHatchet");
			ironCobaltHatchet = new InfiToolHatchet(PropsHelperInfi2x2.cobaltHatchetID + 2, InfiMaterialEnum.Cobalt, InfiMaterialEnum.Iron, "ironCobaltHatchet");
			diamondCobaltHatchet = new InfiToolHatchet(PropsHelperInfi2x2.cobaltHatchetID + 3, InfiMaterialEnum.Cobalt, InfiMaterialEnum.Diamond, "diamondCobaltHatchet");
			redstoneCobaltHatchet = new InfiToolHatchet(PropsHelperInfi2x2.cobaltHatchetID + 4, InfiMaterialEnum.Cobalt, InfiMaterialEnum.Redstone, "redstoneCobaltHatchet");
			obsidianCobaltHatchet = new InfiToolHatchet(PropsHelperInfi2x2.cobaltHatchetID + 5, InfiMaterialEnum.Cobalt, InfiMaterialEnum.Obsidian, "obsidianCobaltHatchet");
			boneCobaltHatchet = new InfiToolHatchet(PropsHelperInfi2x2.cobaltHatchetID + 6, InfiMaterialEnum.Cobalt, InfiMaterialEnum.Bone, "boneCobaltHatchet");
			slimeCobaltHatchet = new InfiToolHatchet(PropsHelperInfi2x2.cobaltHatchetID + 7, InfiMaterialEnum.Cobalt, InfiMaterialEnum.Slime, "slimeCobaltHatchet");
			cactusCobaltHatchet = new InfiToolHatchet(PropsHelperInfi2x2.cobaltHatchetID + 8, InfiMaterialEnum.Cobalt, InfiMaterialEnum.Cactus, "cactusCobaltHatchet");
			blazeCobaltHatchet = new InfiToolHatchet(PropsHelperInfi2x2.cobaltHatchetID + 9, InfiMaterialEnum.Cobalt, InfiMaterialEnum.Blaze, "blazeCobaltHatchet");
			copperCobaltHatchet = new InfiToolHatchet(PropsHelperInfi2x2.cobaltHatchetID + 10, InfiMaterialEnum.Cobalt, InfiMaterialEnum.Copper, "copperCobaltHatchet");
			bronzeCobaltHatchet = new InfiToolHatchet(PropsHelperInfi2x2.cobaltHatchetID + 11, InfiMaterialEnum.Cobalt, InfiMaterialEnum.Bronze, "bronzeCobaltHatchet");
			workedCobaltHatchet = new InfiToolHatchet(PropsHelperInfi2x2.cobaltHatchetID + 12, InfiMaterialEnum.Cobalt, InfiMaterialEnum.WorkedIron, "workedCobaltHatchet");
			steelCobaltHatchet = new InfiToolHatchet(PropsHelperInfi2x2.cobaltHatchetID + 13, InfiMaterialEnum.Cobalt, InfiMaterialEnum.Steel, "steelCobaltHatchet");
			cobaltCobaltHatchet = new InfiToolHatchet(PropsHelperInfi2x2.cobaltHatchetID + 14, InfiMaterialEnum.Cobalt, InfiMaterialEnum.Cobalt, "cobaltCobaltHatchet");
			arditeCobaltHatchet = new InfiToolHatchet(PropsHelperInfi2x2.cobaltHatchetID + 15, InfiMaterialEnum.Cobalt, InfiMaterialEnum.Ardite, "arditeCobaltHatchet");
			manyullynCobaltHatchet = new InfiToolHatchet(PropsHelperInfi2x2.cobaltHatchetID + 16, InfiMaterialEnum.Cobalt, InfiMaterialEnum.Manyullyn, "manyullynCobaltHatchet");
			uraniumCobaltHatchet = new InfiToolHatchet(PropsHelperInfi2x2.cobaltHatchetID + 17, InfiMaterialEnum.Cobalt, InfiMaterialEnum.Bronze, "uraniumCobaltHatchet");
		}

		if (PropsHelperInfi2x2.enableArditeTools)
		{
			woodArditeHatchet = new InfiToolHatchet(PropsHelperInfi2x2.arditeHatchetID + 0, InfiMaterialEnum.Ardite, InfiMaterialEnum.Wood, "woodArditeHatchet");
			stoneArditeHatchet = new InfiToolHatchet(PropsHelperInfi2x2.arditeHatchetID + 1, InfiMaterialEnum.Ardite, InfiMaterialEnum.Stone, "stoneArditeHatchet");
			ironArditeHatchet = new InfiToolHatchet(PropsHelperInfi2x2.arditeHatchetID + 2, InfiMaterialEnum.Ardite, InfiMaterialEnum.Iron, "ironArditeHatchet");
			diamondArditeHatchet = new InfiToolHatchet(PropsHelperInfi2x2.arditeHatchetID + 3, InfiMaterialEnum.Ardite, InfiMaterialEnum.Diamond, "diamondArditeHatchet");
			redstoneArditeHatchet = new InfiToolHatchet(PropsHelperInfi2x2.arditeHatchetID + 4, InfiMaterialEnum.Ardite, InfiMaterialEnum.Redstone, "redstoneArditeHatchet");
			obsidianArditeHatchet = new InfiToolHatchet(PropsHelperInfi2x2.arditeHatchetID + 5, InfiMaterialEnum.Ardite, InfiMaterialEnum.Obsidian, "obsidianArditeHatchet");
			boneArditeHatchet = new InfiToolHatchet(PropsHelperInfi2x2.arditeHatchetID + 6, InfiMaterialEnum.Ardite, InfiMaterialEnum.Bone, "boneArditeHatchet");
			slimeArditeHatchet = new InfiToolHatchet(PropsHelperInfi2x2.arditeHatchetID + 7, InfiMaterialEnum.Ardite, InfiMaterialEnum.Slime, "slimeArditeHatchet");
			cactusArditeHatchet = new InfiToolHatchet(PropsHelperInfi2x2.arditeHatchetID + 8, InfiMaterialEnum.Ardite, InfiMaterialEnum.Cactus, "cactusArditeHatchet");
			blazeArditeHatchet = new InfiToolHatchet(PropsHelperInfi2x2.arditeHatchetID + 9, InfiMaterialEnum.Ardite, InfiMaterialEnum.Blaze, "blazeArditeHatchet");
			copperArditeHatchet = new InfiToolHatchet(PropsHelperInfi2x2.arditeHatchetID + 10, InfiMaterialEnum.Ardite, InfiMaterialEnum.Copper, "copperArditeHatchet");
			bronzeArditeHatchet = new InfiToolHatchet(PropsHelperInfi2x2.arditeHatchetID + 11, InfiMaterialEnum.Ardite, InfiMaterialEnum.Bronze, "bronzeArditeHatchet");
			workedArditeHatchet = new InfiToolHatchet(PropsHelperInfi2x2.arditeHatchetID + 12, InfiMaterialEnum.Ardite, InfiMaterialEnum.WorkedIron, "workedArditeHatchet");
			steelArditeHatchet = new InfiToolHatchet(PropsHelperInfi2x2.arditeHatchetID + 13, InfiMaterialEnum.Ardite, InfiMaterialEnum.Steel, "steelArditeHatchet");
			cobaltArditeHatchet = new InfiToolHatchet(PropsHelperInfi2x2.arditeHatchetID + 14, InfiMaterialEnum.Ardite, InfiMaterialEnum.Cobalt, "cobaltArditeHatchet");
			arditeArditeHatchet = new InfiToolHatchet(PropsHelperInfi2x2.arditeHatchetID + 15, InfiMaterialEnum.Ardite, InfiMaterialEnum.Ardite, "arditeArditeHatchet");
			manyullynArditeHatchet = new InfiToolHatchet(PropsHelperInfi2x2.arditeHatchetID + 16, InfiMaterialEnum.Ardite, InfiMaterialEnum.Manyullyn, "manyullynArditeHatchet");
			uraniumArditeHatchet = new InfiToolHatchet(PropsHelperInfi2x2.arditeHatchetID + 17, InfiMaterialEnum.Ardite, InfiMaterialEnum.Bronze, "uraniumArditeHatchet");
		}

		if (PropsHelperInfi2x2.enableManyullynTools)
		{
			woodManyullynHatchet = new InfiToolHatchet(PropsHelperInfi2x2.manyullynHatchetID + 0, InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Stone, "woodManyullynHatchet");
			stoneManyullynHatchet = new InfiToolHatchet(PropsHelperInfi2x2.manyullynHatchetID + 1, InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Stone, "stoneManyullynHatchet");
			ironManyullynHatchet = new InfiToolHatchet(PropsHelperInfi2x2.manyullynHatchetID + 2, InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Iron, "ironManyullynHatchet");
			diamondManyullynHatchet = new InfiToolHatchet(PropsHelperInfi2x2.manyullynHatchetID + 3, InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Diamond, "diamondManyullynHatchet");
			redstoneManyullynHatchet = new InfiToolHatchet(PropsHelperInfi2x2.manyullynHatchetID + 4, InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Redstone, "redstoneManyullynHatchet");
			obsidianManyullynHatchet = new InfiToolHatchet(PropsHelperInfi2x2.manyullynHatchetID + 5, InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Obsidian, "obsidianManyullynHatchet");
			boneManyullynHatchet = new InfiToolHatchet(PropsHelperInfi2x2.manyullynHatchetID + 6, InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Bone, "boneManyullynHatchet");
			slimeManyullynHatchet = new InfiToolHatchet(PropsHelperInfi2x2.manyullynHatchetID + 7, InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Slime, "slimeManyullynHatchet");
			cactusManyullynHatchet = new InfiToolHatchet(PropsHelperInfi2x2.manyullynHatchetID + 8, InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Cactus, "cactusManyullynHatchet");
			blazeManyullynHatchet = new InfiToolHatchet(PropsHelperInfi2x2.manyullynHatchetID + 9, InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Blaze, "blazeManyullynHatchet");
			copperManyullynHatchet = new InfiToolHatchet(PropsHelperInfi2x2.manyullynHatchetID + 10, InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Copper, "copperManyullynHatchet");
			bronzeManyullynHatchet = new InfiToolHatchet(PropsHelperInfi2x2.manyullynHatchetID + 11, InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Bronze, "bronzeManyullynHatchet");
			workedManyullynHatchet = new InfiToolHatchet(PropsHelperInfi2x2.manyullynHatchetID + 12, InfiMaterialEnum.Manyullyn, InfiMaterialEnum.WorkedIron, "workedManyullynHatchet");
			steelManyullynHatchet = new InfiToolHatchet(PropsHelperInfi2x2.manyullynHatchetID + 13, InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Steel, "steelManyullynHatchet");
			cobaltManyullynHatchet = new InfiToolHatchet(PropsHelperInfi2x2.manyullynHatchetID + 14, InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Cobalt, "cobaltManyullynHatchet");
			arditeManyullynHatchet = new InfiToolHatchet(PropsHelperInfi2x2.manyullynHatchetID + 15, InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Ardite, "arditeManyullynHatchet");
			manyullynManyullynHatchet = new InfiToolHatchet(PropsHelperInfi2x2.manyullynHatchetID + 16, InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Manyullyn, "manyullynManyullynHatchet");
			uraniumManyullynHatchet = new InfiToolHatchet(PropsHelperInfi2x2.manyullynHatchetID + 17, InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Bronze, "uraniumManyullynHatchet");
		}

		if (PropsHelperInfi2x2.enableUraniumTools)
		{
			diamondUraniumHatchet = new InfiToolHatchet(PropsHelperInfi2x2.uraniumHatchetID + 0, InfiMaterialEnum.Uranium, InfiMaterialEnum.Diamond, "diamondUraniumHatchet");
			redstoneUraniumHatchet = new InfiToolHatchet(PropsHelperInfi2x2.uraniumHatchetID + 1, InfiMaterialEnum.Uranium, InfiMaterialEnum.Redstone, "redstoneUraniumHatchet");
			boneUraniumHatchet = new InfiToolHatchet(PropsHelperInfi2x2.uraniumHatchetID + 2, InfiMaterialEnum.Uranium, InfiMaterialEnum.Bone, "boneUraniumHatchet");
			netherrackUraniumHatchet = new InfiToolHatchet(PropsHelperInfi2x2.uraniumHatchetID + 3, InfiMaterialEnum.Uranium, InfiMaterialEnum.Netherrack, "netherrackUraniumHatchet");
			glowstoneUraniumHatchet = new InfiToolHatchet(PropsHelperInfi2x2.uraniumHatchetID + 4, InfiMaterialEnum.Uranium, InfiMaterialEnum.Glowstone, "glowstoneUraniumHatchet");
			lavaUraniumHatchet = new InfiToolHatchet(PropsHelperInfi2x2.uraniumHatchetID + 5, InfiMaterialEnum.Uranium, InfiMaterialEnum.Lava, "lavaUraniumHatchet");
			blazeUraniumHatchet = new InfiToolHatchet(PropsHelperInfi2x2.uraniumHatchetID + 6, InfiMaterialEnum.Uranium, InfiMaterialEnum.Blaze, "blazeUraniumHatchet");
			cobaltUraniumHatchet = new InfiToolHatchet(PropsHelperInfi2x2.uraniumHatchetID + 7, InfiMaterialEnum.Uranium, InfiMaterialEnum.Cobalt, "cobaltUraniumHatchet");
			arditeUraniumHatchet = new InfiToolHatchet(PropsHelperInfi2x2.uraniumHatchetID + 8, InfiMaterialEnum.Uranium, InfiMaterialEnum.Ardite, "arditeUraniumHatchet");
			uraniumUraniumHatchet = new InfiToolHatchet(PropsHelperInfi2x2.uraniumHatchetID + 9, InfiMaterialEnum.Uranium, InfiMaterialEnum.Uranium, "uraniumUraniumHatchet");
		}
	}

	private static void addNames()
	{
		if (PropsHelperInfi2x2.enableWoodTools)
			LanguageRegistry.instance().addName(woodWoodHatchet, "Wooden Hatchet");
		if (PropsHelperInfi2x2.enableStoneTools)
			LanguageRegistry.instance().addName(stoneStoneHatchet, "Heavy Hatchet");
		if (PropsHelperInfi2x2.enableIronTools)
			LanguageRegistry.instance().addName(ironIronHatchet, "Ironic Hatchet");
		if (PropsHelperInfi2x2.enableDiamondTools)
			LanguageRegistry.instance().addName(diamondDiamondHatchet, "Diamondium Hatchet");
		if (PropsHelperInfi2x2.enableRedstoneTools)
			LanguageRegistry.instance().addName(redstoneRedstoneHatchet, "Redredred Hatchet");
		if (PropsHelperInfi2x2.enableObsidianTools)
			LanguageRegistry.instance().addName(obsidianObsidianHatchet, "Ebony Hatchet");
		if (PropsHelperInfi2x2.enableSandstoneTools)
			LanguageRegistry.instance().addName(sandstoneSandstoneHatchet, "Fragile Hatchet");
		if (PropsHelperInfi2x2.enableNetherrackTools)
			LanguageRegistry.instance().addName(boneBoneHatchet, "Necrotic Hatchet");
		if (PropsHelperInfi2x2.enablePaperTools)
			LanguageRegistry.instance().addName(paperPaperHatchet, "Soft Hatchet");
		if (PropsHelperInfi2x2.enableMossyTools)
			LanguageRegistry.instance().addName(mossyMossyHatchet, "Living Hatchet");
		if (PropsHelperInfi2x2.enableNetherrackTools)
			LanguageRegistry.instance().addName(netherrackNetherrackHatchet, "Bloodsoaked Hatchet");
		if (PropsHelperInfi2x2.enableGlowstoneTools)
			LanguageRegistry.instance().addName(glowstoneGlowstoneHatchet, "Bright Hatchet");
		if (PropsHelperInfi2x2.enableIceTools)
			LanguageRegistry.instance().addName(iceIceHatchet, "Freezing Hatchet");
		if (PropsHelperInfi2x2.enableLavaTools)
			LanguageRegistry.instance().addName(lavaLavaHatchet, "Burning Hatchet");
		if (PropsHelperInfi2x2.enableSlimeTools)
			LanguageRegistry.instance().addName(slimeSlimeHatchet, "Toy Hatchet");
		if (PropsHelperInfi2x2.enableCactusTools)
			LanguageRegistry.instance().addName(cactusCactusHatchet, "Thorned Hatchet");
		if (PropsHelperInfi2x2.enableFlintTools)
			LanguageRegistry.instance().addName(flintFlintHatchet, "Rough-hewn Hatchet");
		if (PropsHelperInfi2x2.enableBlazeTools)
			LanguageRegistry.instance().addName(blazeBlazeHatchet, "Netherite Hatchet");
		if (PropsHelperInfi2x2.enableCopperTools)
			LanguageRegistry.instance().addName(copperCopperHatchet, "Orange-Tang Hatchet");
		if (PropsHelperInfi2x2.enableBronzeTools)
			LanguageRegistry.instance().addName(bronzeBronzeHatchet, "Polished Hatchet");
		if (PropsHelperInfi2x2.enableWorkedIronTools)
			LanguageRegistry.instance().addName(workedWorkedIronHatchet, "Reworked Iron Hatchet");
		if (PropsHelperInfi2x2.enableSteelTools)
			LanguageRegistry.instance().addName(steelSteelHatchet, "Forge-Wrought Hatchet");
		if (PropsHelperInfi2x2.enableCobaltTools)
			LanguageRegistry.instance().addName(cobaltCobaltHatchet, "Beautiful Hatchet");
		if (PropsHelperInfi2x2.enableArditeTools)
			LanguageRegistry.instance().addName(arditeArditeHatchet, "Rustic Hatchet");
		if (PropsHelperInfi2x2.enableManyullynTools)
			LanguageRegistry.instance().addName(manyullynManyullynHatchet, "False-Prophetic Hatchet");
		if (PropsHelperInfi2x2.enableUraniumTools)
			LanguageRegistry.instance().addName(uraniumUraniumHatchet, "Cancerous Hatchet");
	}

	public static void registerInfiToolsRecipes()
	{
		if (PropsHelperInfi2x2.enableWoodTools)
		{
			GameRegistry.addRecipe(new ItemStack(woodWoodHatchet), recipe, '#', Block.planks, '|', Item.stick);
			GameRegistry.addRecipe(new ItemStack(sandstoneWoodHatchet), recipe, '#', Block.planks, '|', InfiLibrary.sandstoneRod);
			GameRegistry.addRecipe(new ItemStack(boneWoodHatchet), recipe, '#', Block.planks, '|', Item.bone);
			GameRegistry.addRecipe(new ItemStack(boneWoodHatchet), recipe, '#', Block.planks, '|', InfiLibrary.boneRod);
			GameRegistry.addRecipe(new ItemStack(paperWoodHatchet), recipe, '#', Block.planks, '|', InfiLibrary.paperRod);
			GameRegistry.addRecipe(new ItemStack(iceWoodHatchet), recipe, '#', Block.planks, '|', InfiLibrary.iceRod);
			GameRegistry.addRecipe(new ItemStack(slimeWoodHatchet), recipe, '#', Block.planks, '|', InfiLibrary.slimeRod);
			GameRegistry.addRecipe(new ItemStack(cactusWoodHatchet), recipe, '#', Block.planks, '|', InfiLibrary.cactusRod);
		}

		if (PropsHelperInfi2x2.enableStoneTools)
		{
			GameRegistry.addRecipe(new ItemStack(woodStoneHatchet), recipe, '#', Block.cobblestone, '|', Item.stick);
			GameRegistry.addRecipe(new ItemStack(stoneStoneHatchet), recipe, '#', Block.cobblestone, '|', InfiLibrary.stoneRod);
			GameRegistry.addRecipe(new ItemStack(sandstoneStoneHatchet), recipe, '#', Block.cobblestone, '|', InfiLibrary.sandstoneRod);
			GameRegistry.addRecipe(new ItemStack(boneStoneHatchet), recipe, '#', Block.cobblestone, '|', Item.bone);
			GameRegistry.addRecipe(new ItemStack(boneStoneHatchet), recipe, '#', Block.cobblestone, '|', InfiLibrary.boneRod);
			GameRegistry.addRecipe(new ItemStack(netherrackStoneHatchet), recipe, '#', Block.cobblestone, '|', InfiLibrary.netherrackRod);
			GameRegistry.addRecipe(new ItemStack(iceStoneHatchet), recipe, '#', Block.cobblestone, '|', InfiLibrary.iceRod);
			GameRegistry.addRecipe(new ItemStack(slimeStoneHatchet), recipe, '#', Block.cobblestone, '|', InfiLibrary.slimeRod);
			GameRegistry.addRecipe(new ItemStack(cactusStoneHatchet), recipe, '#', Block.cobblestone, '|', InfiLibrary.cactusRod);
			GameRegistry.addRecipe(new ItemStack(flintStoneHatchet), recipe, '#', Block.cobblestone, '|', InfiLibrary.flintRod);

			GameRegistry.addRecipe(new ItemStack(woodStoneHatchet), recipe, '#', Block.stone, '|', Item.stick);
			GameRegistry.addRecipe(new ItemStack(stoneStoneHatchet), recipe, '#', Block.stone, '|', InfiLibrary.stoneRod);
			GameRegistry.addRecipe(new ItemStack(sandstoneStoneHatchet), recipe, '#', Block.stone, '|', InfiLibrary.sandstoneRod);
			GameRegistry.addRecipe(new ItemStack(boneStoneHatchet), recipe, '#', Block.stone, '|', Item.bone);
			GameRegistry.addRecipe(new ItemStack(boneStoneHatchet), recipe, '#', Block.stone, '|', InfiLibrary.boneRod);
			GameRegistry.addRecipe(new ItemStack(netherrackStoneHatchet), recipe, '#', Block.stone, '|', InfiLibrary.netherrackRod);
			GameRegistry.addRecipe(new ItemStack(iceStoneHatchet), recipe, '#', Block.stone, '|', InfiLibrary.iceRod);
			GameRegistry.addRecipe(new ItemStack(slimeStoneHatchet), recipe, '#', Block.stone, '|', InfiLibrary.slimeRod);
			GameRegistry.addRecipe(new ItemStack(cactusStoneHatchet), recipe, '#', Block.stone, '|', InfiLibrary.cactusRod);
			GameRegistry.addRecipe(new ItemStack(flintStoneHatchet), recipe, '#', Block.stone, '|', InfiLibrary.flintRod);
		}

		if (PropsHelperInfi2x2.enableIronTools)
		{
			GameRegistry.addRecipe(new ItemStack(woodIronHatchet), recipe, '#', Item.ingotIron, '|', Item.stick);
			GameRegistry.addRecipe(new ItemStack(stoneIronHatchet), recipe, '#', Item.ingotIron, '|', InfiLibrary.stoneRod);
			GameRegistry.addRecipe(new ItemStack(ironIronHatchet), recipe, '#', Item.ingotIron, '|', InfiLibrary.ironRod);
			GameRegistry.addRecipe(new ItemStack(boneIronHatchet), recipe, '#', Item.ingotIron, '|', Item.bone);
			GameRegistry.addRecipe(new ItemStack(boneIronHatchet), recipe, '#', Item.ingotIron, '|', InfiLibrary.boneRod);
			GameRegistry.addRecipe(new ItemStack(netherrackIronHatchet), recipe, '#', Item.ingotIron, '|', InfiLibrary.netherrackRod);
			GameRegistry.addRecipe(new ItemStack(glowstoneIronHatchet), recipe, '#', Item.ingotIron, '|', InfiLibrary.glowstoneRod);
			GameRegistry.addRecipe(new ItemStack(cactusIronHatchet), recipe, '#', Item.ingotIron, '|', InfiLibrary.cactusRod);
			GameRegistry.addRecipe(new ItemStack(copperIronHatchet), recipe, '#', Item.ingotIron, '|', InfiLibrary.copperRod);
			GameRegistry.addRecipe(new ItemStack(bronzeIronHatchet), recipe, '#', Item.ingotIron, '|', InfiLibrary.bronzeRod);
		}

		if (PropsHelperInfi2x2.enableDiamondTools)
		{
			GameRegistry.addRecipe(new ItemStack(woodDiamondHatchet), recipe, '#', Item.diamond, '|', Item.stick);
			GameRegistry.addRecipe(new ItemStack(stoneDiamondHatchet), recipe, '#', Item.diamond, '|', InfiLibrary.stoneRod);
			GameRegistry.addRecipe(new ItemStack(ironDiamondHatchet), recipe, '#', Item.diamond, '|', InfiLibrary.ironRod);
			GameRegistry.addRecipe(new ItemStack(diamondDiamondHatchet), recipe, '#', Item.diamond, '|', InfiLibrary.diamondRod);
			GameRegistry.addRecipe(new ItemStack(redstoneDiamondHatchet), recipe, '#', Item.diamond, '|', InfiLibrary.redstoneRod);
			GameRegistry.addRecipe(new ItemStack(obsidianDiamondHatchet), recipe, '#', Item.diamond, '|', InfiLibrary.obsidianRod);
			GameRegistry.addRecipe(new ItemStack(boneDiamondHatchet), recipe, '#', Item.diamond, '|', Item.bone);
			GameRegistry.addRecipe(new ItemStack(boneDiamondHatchet), recipe, '#', Item.diamond, '|', InfiLibrary.boneRod);
			GameRegistry.addRecipe(new ItemStack(mossyDiamondHatchet), recipe, '#', Item.diamond, '|', InfiLibrary.mossyRod);
			GameRegistry.addRecipe(new ItemStack(netherrackDiamondHatchet), recipe, '#', Item.diamond, '|', InfiLibrary.netherrackRod);
			GameRegistry.addRecipe(new ItemStack(glowstoneDiamondHatchet), recipe, '#', Item.diamond, '|', InfiLibrary.glowstoneRod);
			GameRegistry.addRecipe(new ItemStack(lavaDiamondHatchet), recipe, '#', Item.diamond, '|', InfiLibrary.lavaRod);
			GameRegistry.addRecipe(new ItemStack(cactusDiamondHatchet), recipe, '#', Item.diamond, '|', InfiLibrary.cactusRod);
			GameRegistry.addRecipe(new ItemStack(flintDiamondHatchet), recipe, '#', Item.diamond, '|', InfiLibrary.flintRod);
			GameRegistry.addRecipe(new ItemStack(blazeDiamondHatchet), recipe, '#', Item.diamond, '|', Item.blazeRod);
			GameRegistry.addRecipe(new ItemStack(copperDiamondHatchet), recipe, '#', Item.diamond, '|', InfiLibrary.copperRod);
			GameRegistry.addRecipe(new ItemStack(bronzeDiamondHatchet), recipe, '#', Item.diamond, '|', InfiLibrary.bronzeRod);
			GameRegistry.addRecipe(new ItemStack(workedDiamondHatchet), recipe, '#', Item.diamond, '|', InfiLibrary.workedIronRod);
			GameRegistry.addRecipe(new ItemStack(steelDiamondHatchet), recipe, '#', Item.diamond, '|', InfiLibrary.steelRod);
			GameRegistry.addRecipe(new ItemStack(cobaltDiamondHatchet), recipe, '#', Item.diamond, '|', InfiLibrary.cobaltRod);
			GameRegistry.addRecipe(new ItemStack(arditeDiamondHatchet), recipe, '#', Item.diamond, '|', InfiLibrary.arditeRod);
			GameRegistry.addRecipe(new ItemStack(manyullynDiamondHatchet), recipe, '#', Item.diamond, '|', InfiLibrary.manyullynRod);
			GameRegistry.addRecipe(new ItemStack(uraniumDiamondHatchet), recipe, '#', Item.diamond, '|', InfiLibrary.uraniumRod);
		}

		if (PropsHelperInfi2x2.enableRedstoneTools)
		{
			GameRegistry.addRecipe(new ItemStack(woodRedstoneHatchet), recipe, '#', InfiLibrary.redstoneCrystal, '|', Item.stick);
			GameRegistry.addRecipe(new ItemStack(stoneRedstoneHatchet), recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.stoneRod);
			GameRegistry.addRecipe(new ItemStack(ironRedstoneHatchet), recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.ironRod);
			GameRegistry.addRecipe(new ItemStack(redstoneRedstoneHatchet), recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.redstoneRod);
			GameRegistry.addRecipe(new ItemStack(obsidianRedstoneHatchet), recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.obsidianRod);
			GameRegistry.addRecipe(new ItemStack(sandstoneRedstoneHatchet), recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.sandstoneRod);
			GameRegistry.addRecipe(new ItemStack(boneRedstoneHatchet), recipe, '#', InfiLibrary.redstoneCrystal, '|', Item.bone);
			GameRegistry.addRecipe(new ItemStack(boneRedstoneHatchet), recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.boneRod);
			GameRegistry.addRecipe(new ItemStack(paperRedstoneHatchet), recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.paperRod);
			GameRegistry.addRecipe(new ItemStack(mossyRedstoneHatchet), recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.mossyRod);
			GameRegistry.addRecipe(new ItemStack(netherrackRedstoneHatchet), recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.netherrackRod);
			GameRegistry.addRecipe(new ItemStack(glowstoneRedstoneHatchet), recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.glowstoneRod);
			GameRegistry.addRecipe(new ItemStack(iceRedstoneHatchet), recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.iceRod);
			GameRegistry.addRecipe(new ItemStack(lavaRedstoneHatchet), recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.lavaRod);
			GameRegistry.addRecipe(new ItemStack(slimeRedstoneHatchet), recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.slimeRod);
			GameRegistry.addRecipe(new ItemStack(cactusRedstoneHatchet), recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.cactusRod);
			GameRegistry.addRecipe(new ItemStack(flintRedstoneHatchet), recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.flintRod);
			GameRegistry.addRecipe(new ItemStack(copperRedstoneHatchet), recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.copperRod);
			GameRegistry.addRecipe(new ItemStack(bronzeRedstoneHatchet), recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.bronzeRod);
			GameRegistry.addRecipe(new ItemStack(workedRedstoneHatchet), recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.workedIronRod);
			GameRegistry.addRecipe(new ItemStack(uraniumRedstoneHatchet), recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.uraniumRod);
		}

		if (PropsHelperInfi2x2.enableObsidianTools)
		{
			GameRegistry.addRecipe(new ItemStack(woodObsidianHatchet), recipe, '#', Block.obsidian, '|', Item.stick);
			GameRegistry.addRecipe(new ItemStack(stoneObsidianHatchet), recipe, '#', Block.obsidian, '|', InfiLibrary.stoneRod);
			GameRegistry.addRecipe(new ItemStack(redstoneObsidianHatchet), recipe, '#', Block.obsidian, '|', InfiLibrary.redstoneRod);
			GameRegistry.addRecipe(new ItemStack(obsidianObsidianHatchet), recipe, '#', Block.obsidian, '|', InfiLibrary.obsidianRod);
			GameRegistry.addRecipe(new ItemStack(boneObsidianHatchet), recipe, '#', Block.obsidian, '|', Item.bone);
			GameRegistry.addRecipe(new ItemStack(boneObsidianHatchet), recipe, '#', Block.obsidian, '|', InfiLibrary.boneRod);
			GameRegistry.addRecipe(new ItemStack(netherrackObsidianHatchet), recipe, '#', Block.obsidian, '|', InfiLibrary.netherrackRod);
			GameRegistry.addRecipe(new ItemStack(glowstoneObsidianHatchet), recipe, '#', Block.obsidian, '|', InfiLibrary.glowstoneRod);
			GameRegistry.addRecipe(new ItemStack(iceObsidianHatchet), recipe, '#', Block.obsidian, '|', InfiLibrary.iceRod);
			GameRegistry.addRecipe(new ItemStack(lavaObsidianHatchet), recipe, '#', Block.obsidian, '|', InfiLibrary.lavaRod);
			GameRegistry.addRecipe(new ItemStack(cactusObsidianHatchet), recipe, '#', Block.obsidian, '|', InfiLibrary.cactusRod);
		}

		if (PropsHelperInfi2x2.enableSandstoneTools)
		{
			GameRegistry.addRecipe(new ItemStack(woodSandstoneHatchet), recipe, '#', Block.sandStone, '|', Item.stick);
			GameRegistry.addRecipe(new ItemStack(sandstoneSandstoneHatchet), recipe, '#', Block.sandStone, '|', InfiLibrary.sandstoneRod);
			GameRegistry.addRecipe(new ItemStack(boneSandstoneHatchet), recipe, '#', Block.sandStone, '|', Item.bone);
			GameRegistry.addRecipe(new ItemStack(boneSandstoneHatchet), recipe, '#', Block.sandStone, '|', InfiLibrary.boneRod);
			GameRegistry.addRecipe(new ItemStack(netherrackSandstoneHatchet), recipe, '#', Block.sandStone, '|', InfiLibrary.netherrackRod);
			GameRegistry.addRecipe(new ItemStack(iceSandstoneHatchet), recipe, '#', Block.sandStone, '|', InfiLibrary.iceRod);
			GameRegistry.addRecipe(new ItemStack(slimeSandstoneHatchet), recipe, '#', Block.sandStone, '|', InfiLibrary.slimeRod);
			GameRegistry.addRecipe(new ItemStack(cactusSandstoneHatchet), recipe, '#', Block.sandStone, '|', InfiLibrary.cactusRod);
			GameRegistry.addRecipe(new ItemStack(flintSandstoneHatchet), recipe, '#', Block.sandStone, '|', InfiLibrary.flintRod);
		}

		if (PropsHelperInfi2x2.enableBoneTools)
		{
			GameRegistry.addRecipe(new ItemStack(woodBoneHatchet), recipe, '#', Item.bone, '|', Item.stick);
			GameRegistry.addRecipe(new ItemStack(stoneBoneHatchet), recipe, '#', Item.bone, '|', InfiLibrary.stoneRod);
			GameRegistry.addRecipe(new ItemStack(sandstoneBoneHatchet), recipe, '#', Item.bone, '|', InfiLibrary.sandstoneRod);
			GameRegistry.addRecipe(new ItemStack(boneBoneHatchet), recipe, '#', Item.bone, '|', Item.bone);
			GameRegistry.addRecipe(new ItemStack(boneBoneHatchet), recipe, '#', Item.bone, '|', InfiLibrary.boneRod);
			GameRegistry.addRecipe(new ItemStack(paperBoneHatchet), recipe, '#', Item.bone, '|', InfiLibrary.paperRod);
			GameRegistry.addRecipe(new ItemStack(netherrackBoneHatchet), recipe, '#', Item.bone, '|', InfiLibrary.netherrackRod);
			GameRegistry.addRecipe(new ItemStack(iceBoneHatchet), recipe, '#', Item.bone, '|', InfiLibrary.iceRod);
			GameRegistry.addRecipe(new ItemStack(cactusBoneHatchet), recipe, '#', Item.bone, '|', InfiLibrary.cactusRod);
			GameRegistry.addRecipe(new ItemStack(flintBoneHatchet), recipe, '#', Item.bone, '|', InfiLibrary.flintRod);
		}

		if (PropsHelperInfi2x2.enablePaperTools)
		{
			GameRegistry.addRecipe(new ItemStack(woodPaperHatchet), recipe, '#', InfiLibrary.paperStack, '|', Item.stick);
			GameRegistry.addRecipe(new ItemStack(bonePaperHatchet), recipe, '#', InfiLibrary.paperStack, '|', Item.bone);
			GameRegistry.addRecipe(new ItemStack(bonePaperHatchet), recipe, '#', InfiLibrary.paperStack, '|', InfiLibrary.boneRod);
			GameRegistry.addRecipe(new ItemStack(paperPaperHatchet), recipe, '#', InfiLibrary.paperStack, '|', InfiLibrary.paperRod);
			GameRegistry.addRecipe(new ItemStack(slimePaperHatchet), recipe, '#', InfiLibrary.paperStack, '|', InfiLibrary.slimeRod);
			GameRegistry.addRecipe(new ItemStack(cactusPaperHatchet), recipe, '#', InfiLibrary.paperStack, '|', InfiLibrary.cactusRod);
		}

		if (PropsHelperInfi2x2.enableMossyTools)
		{
			GameRegistry.addRecipe(new ItemStack(woodMossyHatchet), recipe, '#', InfiLibrary.mossyStone, '|', Item.stick);
			GameRegistry.addRecipe(new ItemStack(stoneMossyHatchet), recipe, '#', InfiLibrary.mossyStone, '|', InfiLibrary.stoneRod);
			GameRegistry.addRecipe(new ItemStack(diamondMossyHatchet), recipe, '#', InfiLibrary.mossyStone, '|', InfiLibrary.diamondRod);
			GameRegistry.addRecipe(new ItemStack(redstoneMossyHatchet), recipe, '#', InfiLibrary.mossyStone, '|', InfiLibrary.redstoneRod);
			GameRegistry.addRecipe(new ItemStack(boneMossyHatchet), recipe, '#', InfiLibrary.mossyStone, '|', Item.bone);
			GameRegistry.addRecipe(new ItemStack(boneMossyHatchet), recipe, '#', InfiLibrary.mossyStone, '|', InfiLibrary.boneRod);
			GameRegistry.addRecipe(new ItemStack(mossyMossyHatchet), recipe, '#', InfiLibrary.mossyStone, '|', InfiLibrary.mossyRod);
			GameRegistry.addRecipe(new ItemStack(netherrackMossyHatchet), recipe, '#', InfiLibrary.mossyStone, '|', InfiLibrary.netherrackRod);
			GameRegistry.addRecipe(new ItemStack(glowstoneMossyHatchet), recipe, '#', InfiLibrary.mossyStone, '|', InfiLibrary.glowstoneRod);
			GameRegistry.addRecipe(new ItemStack(cactusMossyHatchet), recipe, '#', InfiLibrary.mossyStone, '|', InfiLibrary.cactusRod);
			GameRegistry.addRecipe(new ItemStack(blazeMossyHatchet), recipe, '#', InfiLibrary.mossyStone, '|', Item.blazeRod);
			GameRegistry.addRecipe(new ItemStack(manyullynMossyHatchet), recipe, '#', InfiLibrary.mossyStone, '|', InfiLibrary.manyullynRod);
			GameRegistry.addRecipe(new ItemStack(uraniumMossyHatchet), recipe, '#', InfiLibrary.mossyStone, '|', InfiLibrary.uraniumRod);
		}

		if (PropsHelperInfi2x2.enableNetherrackTools)
		{
			GameRegistry.addRecipe(new ItemStack(woodNetherrackHatchet), recipe, '#', Block.netherrack, '|', Item.stick);
			GameRegistry.addRecipe(new ItemStack(stoneNetherrackHatchet), recipe, '#', Block.netherrack, '|', InfiLibrary.stoneRod);
			GameRegistry.addRecipe(new ItemStack(sandstoneNetherrackHatchet), recipe, '#', Block.netherrack, '|', InfiLibrary.sandstoneRod);
			GameRegistry.addRecipe(new ItemStack(boneNetherrackHatchet), recipe, '#', Block.netherrack, '|', Item.bone);
			GameRegistry.addRecipe(new ItemStack(boneNetherrackHatchet), recipe, '#', Block.netherrack, '|', InfiLibrary.boneRod);
			GameRegistry.addRecipe(new ItemStack(paperNetherrackHatchet), recipe, '#', Block.netherrack, '|', InfiLibrary.paperRod);
			GameRegistry.addRecipe(new ItemStack(mossyNetherrackHatchet), recipe, '#', Block.netherrack, '|', InfiLibrary.mossyRod);
			GameRegistry.addRecipe(new ItemStack(netherrackNetherrackHatchet), recipe, '#', Block.netherrack, '|', InfiLibrary.netherrackRod);
			GameRegistry.addRecipe(new ItemStack(iceNetherrackHatchet), recipe, '#', Block.netherrack, '|', InfiLibrary.iceRod);
			GameRegistry.addRecipe(new ItemStack(slimeNetherrackHatchet), recipe, '#', Block.netherrack, '|', InfiLibrary.slimeRod);
			GameRegistry.addRecipe(new ItemStack(cactusNetherrackHatchet), recipe, '#', Block.netherrack, '|', InfiLibrary.cactusRod);
			GameRegistry.addRecipe(new ItemStack(flintNetherrackHatchet), recipe, '#', Block.netherrack, '|', InfiLibrary.flintRod);
			GameRegistry.addRecipe(new ItemStack(copperNetherrackHatchet), recipe, '#', Block.netherrack, '|', InfiLibrary.copperRod);
			GameRegistry.addRecipe(new ItemStack(bronzeNetherrackHatchet), recipe, '#', Block.netherrack, '|', InfiLibrary.bronzeRod);
		}

		if (PropsHelperInfi2x2.enableGlowstoneTools)
		{
			GameRegistry.addRecipe(new ItemStack(woodGlowstoneHatchet), recipe, '#', InfiLibrary.glowstoneCrystal, '|', Item.stick);
			GameRegistry.addRecipe(new ItemStack(redstoneGlowstoneHatchet), recipe, '#', InfiLibrary.glowstoneCrystal, '|', InfiLibrary.redstoneRod);
			GameRegistry.addRecipe(new ItemStack(obsidianGlowstoneHatchet), recipe, '#', InfiLibrary.glowstoneCrystal, '|', InfiLibrary.obsidianRod);
			GameRegistry.addRecipe(new ItemStack(boneGlowstoneHatchet), recipe, '#', InfiLibrary.glowstoneCrystal, '|', Item.bone);
			GameRegistry.addRecipe(new ItemStack(boneGlowstoneHatchet), recipe, '#', InfiLibrary.glowstoneCrystal, '|', InfiLibrary.boneRod);
			GameRegistry.addRecipe(new ItemStack(netherrackGlowstoneHatchet), recipe, '#', InfiLibrary.glowstoneCrystal, '|', InfiLibrary.netherrackRod);
			GameRegistry.addRecipe(new ItemStack(glowstoneGlowstoneHatchet), recipe, '#', InfiLibrary.glowstoneCrystal, '|', InfiLibrary.glowstoneRod);
			GameRegistry.addRecipe(new ItemStack(iceGlowstoneHatchet), recipe, '#', InfiLibrary.glowstoneCrystal, '|', InfiLibrary.iceRod);
			GameRegistry.addRecipe(new ItemStack(slimeGlowstoneHatchet), recipe, '#', InfiLibrary.glowstoneCrystal, '|', InfiLibrary.slimeRod);
			GameRegistry.addRecipe(new ItemStack(cactusGlowstoneHatchet), recipe, '#', InfiLibrary.glowstoneCrystal, '|', InfiLibrary.cactusRod);
		}

		if (PropsHelperInfi2x2.enableIceTools)
		{
			GameRegistry.addRecipe(new ItemStack(woodIceHatchet), recipe, '#', Block.ice, '|', Item.stick);
			GameRegistry.addRecipe(new ItemStack(boneIceHatchet), recipe, '#', Block.ice, '|', Item.bone);
			GameRegistry.addRecipe(new ItemStack(boneIceHatchet), recipe, '#', Block.ice, '|', InfiLibrary.boneRod);
			GameRegistry.addRecipe(new ItemStack(paperIceHatchet), recipe, '#', Block.ice, '|', InfiLibrary.paperRod);
			GameRegistry.addRecipe(new ItemStack(iceIceHatchet), recipe, '#', Block.ice, '|', InfiLibrary.iceRod);
			GameRegistry.addRecipe(new ItemStack(slimeIceHatchet), recipe, '#', Block.ice, '|', InfiLibrary.slimeRod);
			GameRegistry.addRecipe(new ItemStack(cactusIceHatchet), recipe, '#', Block.ice, '|', InfiLibrary.cactusRod);
		}

		if (PropsHelperInfi2x2.enableLavaTools)
		{
			GameRegistry.addRecipe(new ItemStack(diamondLavaHatchet), recipe, '#', InfiLibrary.lavaCrystal, '|', InfiLibrary.diamondRod);
			GameRegistry.addRecipe(new ItemStack(obsidianLavaHatchet), recipe, '#', InfiLibrary.lavaCrystal, '|', InfiLibrary.obsidianRod);
			GameRegistry.addRecipe(new ItemStack(netherrackLavaHatchet), recipe, '#', InfiLibrary.lavaCrystal, '|', InfiLibrary.netherrackRod);
			GameRegistry.addRecipe(new ItemStack(lavaLavaHatchet), recipe, '#', InfiLibrary.lavaCrystal, '|', InfiLibrary.lavaRod);
			GameRegistry.addRecipe(new ItemStack(flintLavaHatchet), recipe, '#', InfiLibrary.lavaCrystal, '|', InfiLibrary.flintRod);
			GameRegistry.addRecipe(new ItemStack(blazeLavaHatchet), recipe, '#', InfiLibrary.lavaCrystal, '|', Item.blazeRod);
			GameRegistry.addRecipe(new ItemStack(manyullynLavaHatchet), recipe, '#', InfiLibrary.lavaCrystal, '|', InfiLibrary.manyullynRod);
			GameRegistry.addRecipe(new ItemStack(uraniumLavaHatchet), recipe, '#', InfiLibrary.lavaCrystal, '|', InfiLibrary.uraniumRod);
		}

		if (PropsHelperInfi2x2.enableSlimeTools)
		{
			GameRegistry.addRecipe(new ItemStack(woodSlimeHatchet), recipe, '#', InfiLibrary.slimeCrystal, '|', Item.stick);
			GameRegistry.addRecipe(new ItemStack(sandstoneSlimeHatchet), recipe, '#', InfiLibrary.slimeCrystal, '|', InfiLibrary.sandstoneRod);
			GameRegistry.addRecipe(new ItemStack(boneSlimeHatchet), recipe, '#', InfiLibrary.slimeCrystal, '|', Item.bone);
			GameRegistry.addRecipe(new ItemStack(boneSlimeHatchet), recipe, '#', InfiLibrary.slimeCrystal, '|', InfiLibrary.boneRod);
			GameRegistry.addRecipe(new ItemStack(paperSlimeHatchet), recipe, '#', InfiLibrary.slimeCrystal, '|', InfiLibrary.paperRod);
			GameRegistry.addRecipe(new ItemStack(slimeSlimeHatchet), recipe, '#', InfiLibrary.slimeCrystal, '|', InfiLibrary.slimeRod);
			GameRegistry.addRecipe(new ItemStack(cactusSlimeHatchet), recipe, '#', InfiLibrary.slimeCrystal, '|', InfiLibrary.cactusRod);
		}

		if (PropsHelperInfi2x2.enableCactusTools)
		{
			GameRegistry.addRecipe(new ItemStack(woodCactusHatchet), recipe, '#', Block.cactus, '|', Item.stick);
			GameRegistry.addRecipe(new ItemStack(sandstoneCactusHatchet), recipe, '#', Block.cactus, '|', InfiLibrary.sandstoneRod);
			GameRegistry.addRecipe(new ItemStack(boneCactusHatchet), recipe, '#', Block.cactus, '|', Item.bone);
			GameRegistry.addRecipe(new ItemStack(boneCactusHatchet), recipe, '#', Block.cactus, '|', InfiLibrary.boneRod);
			GameRegistry.addRecipe(new ItemStack(netherrackCactusHatchet), recipe, '#', Block.cactus, '|', InfiLibrary.netherrackRod);
			GameRegistry.addRecipe(new ItemStack(iceCactusHatchet), recipe, '#', Block.cactus, '|', InfiLibrary.iceRod);
			GameRegistry.addRecipe(new ItemStack(slimeCactusHatchet), recipe, '#', Block.cactus, '|', InfiLibrary.slimeRod);
			GameRegistry.addRecipe(new ItemStack(cactusCactusHatchet), recipe, '#', Block.cactus, '|', InfiLibrary.cactusRod);
		}

		if (PropsHelperInfi2x2.enableFlintTools)
		{
			GameRegistry.addRecipe(new ItemStack(woodFlintHatchet), recipe, '#', Item.flint, '|', Item.stick);
			GameRegistry.addRecipe(new ItemStack(stoneFlintHatchet), recipe, '#', Item.flint, '|', InfiLibrary.stoneRod);
			GameRegistry.addRecipe(new ItemStack(sandstoneFlintHatchet), recipe, '#', Item.flint, '|', InfiLibrary.sandstoneRod);
			GameRegistry.addRecipe(new ItemStack(boneFlintHatchet), recipe, '#', Item.flint, '|', Item.bone);
			GameRegistry.addRecipe(new ItemStack(boneFlintHatchet), recipe, '#', Item.flint, '|', InfiLibrary.boneRod);
			GameRegistry.addRecipe(new ItemStack(netherrackFlintHatchet), recipe, '#', Item.flint, '|', InfiLibrary.netherrackRod);
			GameRegistry.addRecipe(new ItemStack(slimeFlintHatchet), recipe, '#', Item.flint, '|', InfiLibrary.slimeRod);
			GameRegistry.addRecipe(new ItemStack(cactusFlintHatchet), recipe, '#', Item.flint, '|', InfiLibrary.cactusRod);
			GameRegistry.addRecipe(new ItemStack(flintFlintHatchet), recipe, '#', Item.flint, '|', InfiLibrary.flintRod);
			GameRegistry.addRecipe(new ItemStack(copperFlintHatchet), recipe, '#', Item.flint, '|', InfiLibrary.copperRod);
			GameRegistry.addRecipe(new ItemStack(bronzeFlintHatchet), recipe, '#', Item.flint, '|', InfiLibrary.bronzeRod);
		}

		if (PropsHelperInfi2x2.enableBlazeTools)
		{
			GameRegistry.addRecipe(new ItemStack(diamondBlazeHatchet), recipe, '#', InfiLibrary.blazeCrystal, '|', InfiLibrary.diamondRod);
			GameRegistry.addRecipe(new ItemStack(obsidianBlazeHatchet), recipe, '#', InfiLibrary.blazeCrystal, '|', InfiLibrary.obsidianRod);
			GameRegistry.addRecipe(new ItemStack(netherrackBlazeHatchet), recipe, '#', InfiLibrary.blazeCrystal, '|', InfiLibrary.netherrackRod);
			GameRegistry.addRecipe(new ItemStack(lavaBlazeHatchet), recipe, '#', InfiLibrary.blazeCrystal, '|', InfiLibrary.lavaRod);
			GameRegistry.addRecipe(new ItemStack(flintBlazeHatchet), recipe, '#', InfiLibrary.blazeCrystal, '|', InfiLibrary.flintRod);
			GameRegistry.addRecipe(new ItemStack(blazeBlazeHatchet), recipe, '#', InfiLibrary.blazeCrystal, '|', Item.blazeRod);
			GameRegistry.addRecipe(new ItemStack(manyullynBlazeHatchet), recipe, '#', InfiLibrary.blazeCrystal, '|', InfiLibrary.manyullynRod);
			GameRegistry.addRecipe(new ItemStack(uraniumBlazeHatchet), recipe, '#', InfiLibrary.blazeCrystal, '|', InfiLibrary.uraniumRod);
		}
	}

	public static void addStoneTools(String stack)
	{
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(woodStoneHatchet), recipe, '#', stack, '|', Item.stick));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(stoneStoneHatchet), recipe, '#', stack, '|', InfiLibrary.stoneRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(sandstoneStoneHatchet), recipe, '#', stack, '|', InfiLibrary.sandstoneRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(boneStoneHatchet), recipe, '#', stack, '|', Item.bone));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(boneStoneHatchet), recipe, '#', stack, '|', InfiLibrary.boneRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(netherrackStoneHatchet), recipe, '#', stack, '|', InfiLibrary.netherrackRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(iceStoneHatchet), recipe, '#', stack, '|', InfiLibrary.iceRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(slimeStoneHatchet), recipe, '#', stack, '|', InfiLibrary.slimeRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(cactusStoneHatchet), recipe, '#', stack, '|', InfiLibrary.cactusRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(flintStoneHatchet), recipe, '#', stack, '|', InfiLibrary.flintRod));
	}

	public static void addCopperTools(String stack)
	{
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(woodCopperHatchet), recipe, '#', stack, '|', Item.stick));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(stoneCopperHatchet), recipe, '#', stack, '|', InfiLibrary.stoneRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(boneCopperHatchet), recipe, '#', stack, '|', Item.bone));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(boneCopperHatchet), recipe, '#', stack, '|', InfiLibrary.boneRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(netherrackCopperHatchet), recipe, '#', stack, '|', InfiLibrary.netherrackRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(slimeCopperHatchet), recipe, '#', stack, '|', InfiLibrary.slimeRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(cactusCopperHatchet), recipe, '#', stack, '|', InfiLibrary.cactusRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(flintCopperHatchet), recipe, '#', stack, '|', InfiLibrary.flintRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(copperCopperHatchet), recipe, '#', stack, '|', InfiLibrary.copperRod));
	}

	public static void addBronzeTools(String stack)
	{
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(woodBronzeHatchet), recipe, '#', stack, '|', Item.stick));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(stoneBronzeHatchet), recipe, '#', stack, '|', InfiLibrary.stoneRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(boneBronzeHatchet), recipe, '#', stack, '|', Item.bone));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(boneBronzeHatchet), recipe, '#', stack, '|', InfiLibrary.boneRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(netherrackBronzeHatchet), recipe, '#', stack, '|', InfiLibrary.netherrackRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(slimeBronzeHatchet), recipe, '#', stack, '|', InfiLibrary.slimeRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(cactusBronzeHatchet), recipe, '#', stack, '|', InfiLibrary.cactusRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(flintBronzeHatchet), recipe, '#', stack, '|', InfiLibrary.flintRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(copperBronzeHatchet), recipe, '#', stack, '|', InfiLibrary.copperRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(bronzeBronzeHatchet), recipe, '#', stack, '|', InfiLibrary.bronzeRod));
	}

	public static void addWorkedIronTools(String stack)
	{
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(woodWorkedIronHatchet), recipe, '#', stack, '|', Item.stick));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(stoneWorkedIronHatchet), recipe, '#', stack, '|', InfiLibrary.stoneRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ironWorkedIronHatchet), recipe, '#', stack, '|', InfiLibrary.ironRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(diamondWorkedIronHatchet), recipe, '#', stack, '|', InfiLibrary.diamondRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(redstoneWorkedIronHatchet), recipe, '#', stack, '|', InfiLibrary.redstoneRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(obsidianWorkedIronHatchet), recipe, '#', stack, '|', InfiLibrary.obsidianRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(boneWorkedIronHatchet), recipe, '#', stack, '|', Item.bone));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(boneWorkedIronHatchet), recipe, '#', stack, '|', InfiLibrary.boneRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(netherrackWorkedIronHatchet), recipe, '#', stack, '|', InfiLibrary.netherrackRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(glowstoneWorkedIronHatchet), recipe, '#', stack, '|', InfiLibrary.glowstoneRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(iceWorkedIronHatchet), recipe, '#', stack, '|', InfiLibrary.iceRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(slimeWorkedIronHatchet), recipe, '#', stack, '|', InfiLibrary.slimeRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(cactusWorkedIronHatchet), recipe, '#', stack, '|', InfiLibrary.cactusRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(blazeWorkedIronHatchet), recipe, '#', stack, '|', Item.blazeRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(copperWorkedIronHatchet), recipe, '#', stack, '|', InfiLibrary.copperRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(bronzeWorkedIronHatchet), recipe, '#', stack, '|', InfiLibrary.bronzeRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(workedWorkedIronHatchet), recipe, '#', stack, '|', InfiLibrary.workedIronRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(steelWorkedIronHatchet), recipe, '#', stack, '|', InfiLibrary.steelRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(uraniumWorkedIronHatchet), recipe, '#', stack, '|', InfiLibrary.uraniumRod));
	}

	public static void addSteelTools(String stack)
	{
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(woodSteelHatchet), recipe, '#', stack, '|', Item.stick));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(stoneSteelHatchet), recipe, '#', stack, '|', InfiLibrary.stoneRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ironSteelHatchet), recipe, '#', stack, '|', InfiLibrary.ironRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(diamondSteelHatchet), recipe, '#', stack, '|', InfiLibrary.diamondRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(redstoneSteelHatchet), recipe, '#', stack, '|', InfiLibrary.redstoneRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(obsidianSteelHatchet), recipe, '#', stack, '|', InfiLibrary.obsidianRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(boneSteelHatchet), recipe, '#', stack, '|', Item.bone));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(boneSteelHatchet), recipe, '#', stack, '|', InfiLibrary.boneRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(netherrackSteelHatchet), recipe, '#', stack, '|', InfiLibrary.netherrackRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(glowstoneSteelHatchet), recipe, '#', stack, '|', InfiLibrary.glowstoneRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(iceSteelHatchet), recipe, '#', stack, '|', InfiLibrary.iceRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(slimeSteelHatchet), recipe, '#', stack, '|', InfiLibrary.slimeRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(cactusSteelHatchet), recipe, '#', stack, '|', InfiLibrary.cactusRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(blazeSteelHatchet), recipe, '#', stack, '|', Item.blazeRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(copperSteelHatchet), recipe, '#', stack, '|', InfiLibrary.copperRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(bronzeSteelHatchet), recipe, '#', stack, '|', InfiLibrary.bronzeRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(workedSteelHatchet), recipe, '#', stack, '|', InfiLibrary.workedIronRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(steelSteelHatchet), recipe, '#', stack, '|', InfiLibrary.steelRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(cobaltSteelHatchet), recipe, '#', stack, '|', InfiLibrary.cobaltRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(arditeSteelHatchet), recipe, '#', stack, '|', InfiLibrary.arditeRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(uraniumSteelHatchet), recipe, '#', stack, '|', InfiLibrary.uraniumRod));
	}

	public static void addCobaltTools(String stack)
	{
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(woodCobaltHatchet), recipe, '#', stack, '|', Item.stick));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(stoneCobaltHatchet), recipe, '#', stack, '|', InfiLibrary.stoneRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ironCobaltHatchet), recipe, '#', stack, '|', InfiLibrary.ironRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(diamondCobaltHatchet), recipe, '#', stack, '|', InfiLibrary.diamondRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(redstoneCobaltHatchet), recipe, '#', stack, '|', InfiLibrary.redstoneRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(obsidianCobaltHatchet), recipe, '#', stack, '|', InfiLibrary.obsidianRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(boneCobaltHatchet), recipe, '#', stack, '|', Item.bone));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(boneCobaltHatchet), recipe, '#', stack, '|', InfiLibrary.boneRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(slimeCobaltHatchet), recipe, '#', stack, '|', InfiLibrary.slimeRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(cactusCobaltHatchet), recipe, '#', stack, '|', InfiLibrary.cactusRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(blazeCobaltHatchet), recipe, '#', stack, '|', Item.blazeRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(copperCobaltHatchet), recipe, '#', stack, '|', InfiLibrary.copperRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(bronzeCobaltHatchet), recipe, '#', stack, '|', InfiLibrary.bronzeRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(workedCobaltHatchet), recipe, '#', stack, '|', InfiLibrary.workedIronRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(steelCobaltHatchet), recipe, '#', stack, '|', InfiLibrary.steelRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(cobaltCobaltHatchet), recipe, '#', stack, '|', InfiLibrary.cobaltRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(arditeCobaltHatchet), recipe, '#', stack, '|', InfiLibrary.arditeRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(manyullynCobaltHatchet), recipe, '#', stack, '|', InfiLibrary.manyullynRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(uraniumCobaltHatchet), recipe, '#', stack, '|', InfiLibrary.uraniumRod));
	}

	public static void addArditeTools(String stack)
	{
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(woodArditeHatchet), recipe, '#', stack, '|', Item.stick));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(stoneArditeHatchet), recipe, '#', stack, '|', InfiLibrary.stoneRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ironArditeHatchet), recipe, '#', stack, '|', InfiLibrary.ironRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(diamondArditeHatchet), recipe, '#', stack, '|', InfiLibrary.diamondRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(redstoneArditeHatchet), recipe, '#', stack, '|', InfiLibrary.redstoneRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(obsidianArditeHatchet), recipe, '#', stack, '|', InfiLibrary.obsidianRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(boneArditeHatchet), recipe, '#', stack, '|', Item.bone));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(boneArditeHatchet), recipe, '#', stack, '|', InfiLibrary.boneRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(slimeArditeHatchet), recipe, '#', stack, '|', InfiLibrary.slimeRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(cactusArditeHatchet), recipe, '#', stack, '|', InfiLibrary.cactusRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(blazeArditeHatchet), recipe, '#', stack, '|', Item.blazeRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(copperArditeHatchet), recipe, '#', stack, '|', InfiLibrary.copperRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(bronzeArditeHatchet), recipe, '#', stack, '|', InfiLibrary.bronzeRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(workedArditeHatchet), recipe, '#', stack, '|', InfiLibrary.workedIronRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(steelArditeHatchet), recipe, '#', stack, '|', InfiLibrary.steelRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(cobaltArditeHatchet), recipe, '#', stack, '|', InfiLibrary.cobaltRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(arditeArditeHatchet), recipe, '#', stack, '|', InfiLibrary.arditeRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(manyullynArditeHatchet), recipe, '#', stack, '|', InfiLibrary.manyullynRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(uraniumArditeHatchet), recipe, '#', stack, '|', InfiLibrary.uraniumRod));
	}

	public static void addManyullynTools(String stack)
	{
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(woodManyullynHatchet), recipe, '#', stack, '|', Item.stick));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(stoneManyullynHatchet), recipe, '#', stack, '|', InfiLibrary.stoneRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ironManyullynHatchet), recipe, '#', stack, '|', InfiLibrary.ironRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(diamondManyullynHatchet), recipe, '#', stack, '|', InfiLibrary.diamondRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(redstoneManyullynHatchet), recipe, '#', stack, '|', InfiLibrary.redstoneRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(obsidianManyullynHatchet), recipe, '#', stack, '|', InfiLibrary.obsidianRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(boneManyullynHatchet), recipe, '#', stack, '|', Item.bone));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(boneManyullynHatchet), recipe, '#', stack, '|', InfiLibrary.boneRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(slimeManyullynHatchet), recipe, '#', stack, '|', InfiLibrary.slimeRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(cactusManyullynHatchet), recipe, '#', stack, '|', InfiLibrary.cactusRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(blazeManyullynHatchet), recipe, '#', stack, '|', Item.blazeRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(copperManyullynHatchet), recipe, '#', stack, '|', InfiLibrary.copperRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(bronzeManyullynHatchet), recipe, '#', stack, '|', InfiLibrary.bronzeRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(workedManyullynHatchet), recipe, '#', stack, '|', InfiLibrary.workedIronRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(steelManyullynHatchet), recipe, '#', stack, '|', InfiLibrary.steelRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(cobaltManyullynHatchet), recipe, '#', stack, '|', InfiLibrary.cobaltRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(arditeManyullynHatchet), recipe, '#', stack, '|', InfiLibrary.arditeRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(manyullynManyullynHatchet), recipe, '#', stack, '|', InfiLibrary.manyullynRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(uraniumManyullynHatchet), recipe, '#', stack, '|', InfiLibrary.uraniumRod));
	}

	public static void addUraniumTools(String stack)
	{
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(diamondUraniumHatchet), recipe, '#', stack, '|', InfiLibrary.diamondRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(redstoneUraniumHatchet), recipe, '#', stack, '|', InfiLibrary.redstoneRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(boneUraniumHatchet), recipe, '#', stack, '|', Item.bone));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(boneUraniumHatchet), recipe, '#', stack, '|', InfiLibrary.boneRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(netherrackUraniumHatchet), recipe, '#', stack, '|', InfiLibrary.netherrackRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(glowstoneUraniumHatchet), recipe, '#', stack, '|', InfiLibrary.glowstoneRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(lavaUraniumHatchet), recipe, '#', stack, '|', InfiLibrary.lavaRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(blazeUraniumHatchet), recipe, '#', stack, '|', Item.blazeRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(cobaltUraniumHatchet), recipe, '#', stack, '|', InfiLibrary.cobaltRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(arditeUraniumHatchet), recipe, '#', stack, '|', InfiLibrary.arditeRod));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(uraniumUraniumHatchet), recipe, '#', stack, '|', InfiLibrary.uraniumRod));
	}

	public static Item woodWoodHatchet;
	public static Item sandstoneWoodHatchet;
	public static Item boneWoodHatchet;
	public static Item paperWoodHatchet;
	public static Item iceWoodHatchet;
	public static Item slimeWoodHatchet;
	public static Item cactusWoodHatchet;

	public static Item woodStoneHatchet;
	public static Item stoneStoneHatchet;
	public static Item sandstoneStoneHatchet;
	public static Item boneStoneHatchet;
	public static Item netherrackStoneHatchet;
	public static Item iceStoneHatchet;
	public static Item slimeStoneHatchet;
	public static Item cactusStoneHatchet;
	public static Item flintStoneHatchet;

	public static Item woodIronHatchet;
	public static Item stoneIronHatchet;
	public static Item ironIronHatchet;
	public static Item boneIronHatchet;
	public static Item netherrackIronHatchet;
	public static Item glowstoneIronHatchet;
	public static Item cactusIronHatchet;
	public static Item copperIronHatchet;
	public static Item bronzeIronHatchet;

	public static Item woodDiamondHatchet;
	public static Item stoneDiamondHatchet;
	public static Item ironDiamondHatchet;
	public static Item diamondDiamondHatchet;
	public static Item redstoneDiamondHatchet;
	public static Item obsidianDiamondHatchet;
	public static Item boneDiamondHatchet;
	public static Item mossyDiamondHatchet;
	public static Item netherrackDiamondHatchet;
	public static Item glowstoneDiamondHatchet;
	public static Item lavaDiamondHatchet;
	public static Item cactusDiamondHatchet;
	public static Item flintDiamondHatchet;
	public static Item blazeDiamondHatchet;
	public static Item copperDiamondHatchet;
	public static Item bronzeDiamondHatchet;
	public static Item workedDiamondHatchet;
	public static Item steelDiamondHatchet;
	public static Item cobaltDiamondHatchet;
	public static Item arditeDiamondHatchet;
	public static Item manyullynDiamondHatchet;
	public static Item uraniumDiamondHatchet;

	public static Item woodRedstoneHatchet;
	public static Item stoneRedstoneHatchet;
	public static Item ironRedstoneHatchet;
	public static Item redstoneRedstoneHatchet;
	public static Item obsidianRedstoneHatchet;
	public static Item sandstoneRedstoneHatchet;
	public static Item boneRedstoneHatchet;
	public static Item paperRedstoneHatchet;
	public static Item mossyRedstoneHatchet;
	public static Item netherrackRedstoneHatchet;
	public static Item glowstoneRedstoneHatchet;
	public static Item iceRedstoneHatchet;
	public static Item lavaRedstoneHatchet;
	public static Item slimeRedstoneHatchet;
	public static Item cactusRedstoneHatchet;
	public static Item flintRedstoneHatchet;
	public static Item copperRedstoneHatchet;
	public static Item bronzeRedstoneHatchet;
	public static Item workedRedstoneHatchet;
	public static Item uraniumRedstoneHatchet;

	public static Item woodObsidianHatchet;
	public static Item stoneObsidianHatchet;
	public static Item redstoneObsidianHatchet;
	public static Item obsidianObsidianHatchet;
	public static Item boneObsidianHatchet;
	public static Item netherrackObsidianHatchet;
	public static Item glowstoneObsidianHatchet;
	public static Item iceObsidianHatchet;
	public static Item lavaObsidianHatchet;
	public static Item cactusObsidianHatchet;

	public static Item woodSandstoneHatchet;
	public static Item sandstoneSandstoneHatchet;
	public static Item boneSandstoneHatchet;
	public static Item netherrackSandstoneHatchet;
	public static Item iceSandstoneHatchet;
	public static Item slimeSandstoneHatchet;
	public static Item cactusSandstoneHatchet;
	public static Item flintSandstoneHatchet;

	public static Item woodBoneHatchet;
	public static Item stoneBoneHatchet;
	public static Item sandstoneBoneHatchet;
	public static Item boneBoneHatchet;
	public static Item paperBoneHatchet;
	public static Item netherrackBoneHatchet;
	public static Item iceBoneHatchet;
	public static Item cactusBoneHatchet;
	public static Item flintBoneHatchet;

	public static Item woodPaperHatchet;
	public static Item bonePaperHatchet;
	public static Item paperPaperHatchet;
	public static Item slimePaperHatchet;
	public static Item cactusPaperHatchet;

	public static Item woodMossyHatchet;
	public static Item stoneMossyHatchet;
	public static Item diamondMossyHatchet;
	public static Item redstoneMossyHatchet;
	public static Item boneMossyHatchet;
	public static Item mossyMossyHatchet;
	public static Item netherrackMossyHatchet;
	public static Item glowstoneMossyHatchet;
	public static Item cactusMossyHatchet;
	public static Item blazeMossyHatchet;
	public static Item manyullynMossyHatchet;
	public static Item uraniumMossyHatchet;

	public static Item woodNetherrackHatchet;
	public static Item stoneNetherrackHatchet;
	public static Item sandstoneNetherrackHatchet;
	public static Item boneNetherrackHatchet;
	public static Item paperNetherrackHatchet;
	public static Item mossyNetherrackHatchet;
	public static Item netherrackNetherrackHatchet;
	public static Item iceNetherrackHatchet;
	public static Item slimeNetherrackHatchet;
	public static Item cactusNetherrackHatchet;
	public static Item flintNetherrackHatchet;
	public static Item copperNetherrackHatchet;
	public static Item bronzeNetherrackHatchet;

	public static Item woodGlowstoneHatchet;
	public static Item redstoneGlowstoneHatchet;
	public static Item obsidianGlowstoneHatchet;
	public static Item boneGlowstoneHatchet;
	public static Item netherrackGlowstoneHatchet;
	public static Item glowstoneGlowstoneHatchet;
	public static Item iceGlowstoneHatchet;
	public static Item slimeGlowstoneHatchet;
	public static Item cactusGlowstoneHatchet;

	public static Item woodIceHatchet;
	public static Item boneIceHatchet;
	public static Item paperIceHatchet;
	public static Item iceIceHatchet;
	public static Item slimeIceHatchet;
	public static Item cactusIceHatchet;

	public static Item diamondLavaHatchet;
	public static Item obsidianLavaHatchet;
	public static Item netherrackLavaHatchet;
	public static Item lavaLavaHatchet;
	public static Item flintLavaHatchet;
	public static Item blazeLavaHatchet;
	public static Item manyullynLavaHatchet;
	public static Item uraniumLavaHatchet;

	public static Item woodSlimeHatchet;
	public static Item sandstoneSlimeHatchet;
	public static Item boneSlimeHatchet;
	public static Item paperSlimeHatchet;
	public static Item slimeSlimeHatchet;
	public static Item cactusSlimeHatchet;

	public static Item woodCactusHatchet;
	public static Item sandstoneCactusHatchet;
	public static Item boneCactusHatchet;
	public static Item netherrackCactusHatchet;
	public static Item iceCactusHatchet;
	public static Item slimeCactusHatchet;
	public static Item cactusCactusHatchet;

	public static Item woodFlintHatchet;
	public static Item stoneFlintHatchet;
	public static Item sandstoneFlintHatchet;
	public static Item boneFlintHatchet;
	public static Item netherrackFlintHatchet;
	public static Item slimeFlintHatchet;
	public static Item cactusFlintHatchet;
	public static Item flintFlintHatchet;
	public static Item copperFlintHatchet;
	public static Item bronzeFlintHatchet;

	public static Item diamondBlazeHatchet;
	public static Item obsidianBlazeHatchet;
	public static Item netherrackBlazeHatchet;
	public static Item lavaBlazeHatchet;
	public static Item flintBlazeHatchet;
	public static Item blazeBlazeHatchet;
	public static Item manyullynBlazeHatchet;
	public static Item uraniumBlazeHatchet;

	public static Item woodCopperHatchet;
	public static Item stoneCopperHatchet;
	public static Item boneCopperHatchet;
	public static Item netherrackCopperHatchet;
	public static Item slimeCopperHatchet;
	public static Item cactusCopperHatchet;
	public static Item flintCopperHatchet;
	public static Item copperCopperHatchet;

	public static Item woodBronzeHatchet;
	public static Item stoneBronzeHatchet;
	public static Item boneBronzeHatchet;
	public static Item netherrackBronzeHatchet;
	public static Item slimeBronzeHatchet;
	public static Item cactusBronzeHatchet;
	public static Item flintBronzeHatchet;
	public static Item copperBronzeHatchet;
	public static Item bronzeBronzeHatchet;

	public static Item woodWorkedIronHatchet;
	public static Item stoneWorkedIronHatchet;
	public static Item ironWorkedIronHatchet;
	public static Item diamondWorkedIronHatchet;
	public static Item redstoneWorkedIronHatchet;
	public static Item obsidianWorkedIronHatchet;
	public static Item boneWorkedIronHatchet;
	public static Item netherrackWorkedIronHatchet;
	public static Item glowstoneWorkedIronHatchet;
	public static Item iceWorkedIronHatchet;
	public static Item slimeWorkedIronHatchet;
	public static Item cactusWorkedIronHatchet;
	public static Item blazeWorkedIronHatchet;
	public static Item copperWorkedIronHatchet;
	public static Item bronzeWorkedIronHatchet;
	public static Item workedWorkedIronHatchet;
	public static Item steelWorkedIronHatchet;
	public static Item uraniumWorkedIronHatchet;

	public static Item woodSteelHatchet;
	public static Item stoneSteelHatchet;
	public static Item ironSteelHatchet;
	public static Item diamondSteelHatchet;
	public static Item redstoneSteelHatchet;
	public static Item obsidianSteelHatchet;
	public static Item boneSteelHatchet;
	public static Item netherrackSteelHatchet;
	public static Item glowstoneSteelHatchet;
	public static Item iceSteelHatchet;
	public static Item slimeSteelHatchet;
	public static Item cactusSteelHatchet;
	public static Item blazeSteelHatchet;
	public static Item copperSteelHatchet;
	public static Item bronzeSteelHatchet;
	public static Item workedSteelHatchet;
	public static Item steelSteelHatchet;
	public static Item cobaltSteelHatchet;
	public static Item arditeSteelHatchet;
	public static Item uraniumSteelHatchet;

	public static Item woodCobaltHatchet;
	public static Item stoneCobaltHatchet;
	public static Item ironCobaltHatchet;
	public static Item diamondCobaltHatchet;
	public static Item redstoneCobaltHatchet;
	public static Item obsidianCobaltHatchet;
	public static Item boneCobaltHatchet;
	public static Item slimeCobaltHatchet;
	public static Item cactusCobaltHatchet;
	public static Item blazeCobaltHatchet;
	public static Item copperCobaltHatchet;
	public static Item bronzeCobaltHatchet;
	public static Item workedCobaltHatchet;
	public static Item steelCobaltHatchet;
	public static Item cobaltCobaltHatchet;
	public static Item arditeCobaltHatchet;
	public static Item manyullynCobaltHatchet;
	public static Item uraniumCobaltHatchet;

	public static Item woodArditeHatchet;
	public static Item stoneArditeHatchet;
	public static Item ironArditeHatchet;
	public static Item diamondArditeHatchet;
	public static Item redstoneArditeHatchet;
	public static Item obsidianArditeHatchet;
	public static Item boneArditeHatchet;
	public static Item slimeArditeHatchet;
	public static Item cactusArditeHatchet;
	public static Item blazeArditeHatchet;
	public static Item copperArditeHatchet;
	public static Item bronzeArditeHatchet;
	public static Item workedArditeHatchet;
	public static Item steelArditeHatchet;
	public static Item cobaltArditeHatchet;
	public static Item arditeArditeHatchet;
	public static Item manyullynArditeHatchet;
	public static Item uraniumArditeHatchet;

	public static Item woodManyullynHatchet;
	public static Item stoneManyullynHatchet;
	public static Item ironManyullynHatchet;
	public static Item diamondManyullynHatchet;
	public static Item redstoneManyullynHatchet;
	public static Item obsidianManyullynHatchet;
	public static Item boneManyullynHatchet;
	public static Item slimeManyullynHatchet;
	public static Item cactusManyullynHatchet;
	public static Item blazeManyullynHatchet;
	public static Item copperManyullynHatchet;
	public static Item bronzeManyullynHatchet;
	public static Item workedManyullynHatchet;
	public static Item steelManyullynHatchet;
	public static Item cobaltManyullynHatchet;
	public static Item arditeManyullynHatchet;
	public static Item manyullynManyullynHatchet;
	public static Item uraniumManyullynHatchet;

	public static Item diamondUraniumHatchet;
	public static Item redstoneUraniumHatchet;
	public static Item boneUraniumHatchet;
	public static Item netherrackUraniumHatchet;
	public static Item glowstoneUraniumHatchet;
	public static Item lavaUraniumHatchet;
	public static Item blazeUraniumHatchet;
	public static Item cobaltUraniumHatchet;
	public static Item arditeUraniumHatchet;
	public static Item uraniumUraniumHatchet;
}
