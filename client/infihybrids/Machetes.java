package net.minecraft.src.infihybrids;
import net.minecraft.src.Block;
import net.minecraft.src.InfiMaterialEnum;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;
import net.minecraft.src.ModLoader;
import net.minecraft.src.mod_InfiBase;
import net.minecraft.src.mod_InfiHybrids;
import net.minecraft.src.forge.MinecraftForge;

public class Machetes 
{
    public static Machetes instance = new Machetes();
    
    private static String[] recipe = { "#  ", " # ", "  |" };
    
    public static Machetes getInstance()
    {
        return instance;
    }

    public static void init()
    {
        if(mod_InfiHybrids.infitoolsPresent)
        {
        	createTools();
            addNames();
        	registerInfiToolsRecipes();
        }
        else
        {
        	createVanillaTools();
        	registerVanillaRecipes();
        }
    }
    
    private static void createVanillaTools()
    {
    	woodWoodMachete = new InfiToolMachete(PropsHelperInfiHybrids.woodMacheteID+0, 
                InfiMaterialEnum.Wood, InfiMaterialEnum.Wood, "woodWoodMachete");
    	woodStoneMachete = new InfiToolMachete(PropsHelperInfiHybrids.stoneMacheteID+0, 
                InfiMaterialEnum.Stone, InfiMaterialEnum.Wood, "woodStoneMachete");
    	woodIronMachete = new InfiToolMachete(PropsHelperInfiHybrids.ironMacheteID+0, 
                InfiMaterialEnum.Iron, InfiMaterialEnum.Wood, "woodIronMachete");
    	woodDiamondMachete = new InfiToolMachete(PropsHelperInfiHybrids.diamondMacheteID+0, 
                InfiMaterialEnum.Diamond, InfiMaterialEnum.Wood, "woodDiamondMachete");
    	
    	ModLoader.addName(woodWoodMachete, "Wooden Machete");
    }
    
    private static void registerVanillaRecipes()
    {
    	ModLoader.addRecipe(new ItemStack(woodWoodMachete), new Object[] 
                { recipe, '#', Block.planks, '|', Item.stick, });
		ModLoader.addRecipe(new ItemStack(woodStoneMachete), new Object[] 
                { recipe, '#', Block.cobblestone, '|', Item.stick, });
		ModLoader.addRecipe(new ItemStack(woodIronMachete), new Object[] 
                { recipe, '#', Item.ingotIron, '|', Item.stick, });
		ModLoader.addRecipe(new ItemStack(woodDiamondMachete), new Object[] 
                { recipe, '#', Item.diamond, '|', Item.stick, });
    }
    
    private static void createTools()
    {
    	if(PropsHelperInfiHybrids.enableWoodTools)
    	{
    		woodWoodMachete = new InfiToolMachete(PropsHelperInfiHybrids.woodMacheteID+0, 
                    InfiMaterialEnum.Wood, InfiMaterialEnum.Wood, "woodWoodMachete");
    		sandstoneWoodMachete = new InfiToolMachete(PropsHelperInfiHybrids.woodMacheteID+1, 
                    InfiMaterialEnum.Wood, InfiMaterialEnum.Sandstone, "sandstoneWoodMachete");
    		boneWoodMachete = new InfiToolMachete(PropsHelperInfiHybrids.woodMacheteID+2, 
                    InfiMaterialEnum.Wood, InfiMaterialEnum.Bone, "boneWoodMachete");
    		paperWoodMachete = new InfiToolMachete(PropsHelperInfiHybrids.woodMacheteID+3, 
                    InfiMaterialEnum.Wood, InfiMaterialEnum.Paper, "paperWoodMachete");
    		iceWoodMachete = new InfiToolMachete(PropsHelperInfiHybrids.woodMacheteID+4, 
                    InfiMaterialEnum.Wood, InfiMaterialEnum.Ice, "iceWoodMachete");
    		slimeWoodMachete = new InfiToolMachete(PropsHelperInfiHybrids.woodMacheteID+5, 
                    InfiMaterialEnum.Wood, InfiMaterialEnum.Slime, "slimeWoodMachete");
    		cactusWoodMachete = new InfiToolMachete(PropsHelperInfiHybrids.woodMacheteID+6, 
                    InfiMaterialEnum.Wood, InfiMaterialEnum.Cactus, "cactusWoodMachete");
    	}

        if(PropsHelperInfiHybrids.enableStoneTools)
        {
        	woodStoneMachete = new InfiToolMachete(PropsHelperInfiHybrids.stoneMacheteID+0, 
                    InfiMaterialEnum.Stone, InfiMaterialEnum.Wood, "woodStoneMachete");
        	stoneStoneMachete = new InfiToolMachete(PropsHelperInfiHybrids.stoneMacheteID+1, 
                    InfiMaterialEnum.Stone, InfiMaterialEnum.Stone, "stoneStoneMachete");
        	sandstoneStoneMachete = new InfiToolMachete(PropsHelperInfiHybrids.stoneMacheteID+2, 
                    InfiMaterialEnum.Stone, InfiMaterialEnum.Sandstone, "sandstoneStoneMachete");
        	boneStoneMachete = new InfiToolMachete(PropsHelperInfiHybrids.stoneMacheteID+3, 
                    InfiMaterialEnum.Stone, InfiMaterialEnum.Bone, "boneStoneMachete");
        	netherrackStoneMachete = new InfiToolMachete(PropsHelperInfiHybrids.stoneMacheteID+4, 
                    InfiMaterialEnum.Stone, InfiMaterialEnum.Netherrack, "netherrackStoneMachete");
        	iceStoneMachete = new InfiToolMachete(PropsHelperInfiHybrids.stoneMacheteID+5, 
                    InfiMaterialEnum.Stone, InfiMaterialEnum.Ice, "iceStoneMachete");
        	slimeStoneMachete = new InfiToolMachete(PropsHelperInfiHybrids.stoneMacheteID+6, 
                    InfiMaterialEnum.Stone, InfiMaterialEnum.Slime, "slimeStoneMachete");
        	cactusStoneMachete = new InfiToolMachete(PropsHelperInfiHybrids.stoneMacheteID+7, 
                    InfiMaterialEnum.Stone, InfiMaterialEnum.Cactus, "cactusStoneMachete");
        	flintStoneMachete = new InfiToolMachete(PropsHelperInfiHybrids.stoneMacheteID+8, 
                    InfiMaterialEnum.Stone, InfiMaterialEnum.Flint, "flintStoneMachete");
        }
        
        if(PropsHelperInfiHybrids.enableIronTools)
        {
        	woodIronMachete = new InfiToolMachete(PropsHelperInfiHybrids.ironMacheteID+0, 
                    InfiMaterialEnum.Iron, InfiMaterialEnum.Wood, "woodIronMachete");
        	stoneIronMachete = new InfiToolMachete(PropsHelperInfiHybrids.ironMacheteID+1, 
                    InfiMaterialEnum.Iron, InfiMaterialEnum.Stone, "stoneIronMachete");
        	ironIronMachete = new InfiToolMachete(PropsHelperInfiHybrids.ironMacheteID+2, 
                    InfiMaterialEnum.Iron, InfiMaterialEnum.Iron, "ironIronMachete");
        	boneIronMachete = new InfiToolMachete(PropsHelperInfiHybrids.ironMacheteID+3, 
                    InfiMaterialEnum.Iron, InfiMaterialEnum.Bone, "boneIronMachete");
        	netherrackIronMachete = new InfiToolMachete(PropsHelperInfiHybrids.ironMacheteID+4, 
                    InfiMaterialEnum.Iron, InfiMaterialEnum.Netherrack, "netherrackIronMachete");
        	glowstoneIronMachete = new InfiToolMachete(PropsHelperInfiHybrids.ironMacheteID+5, 
                    InfiMaterialEnum.Iron, InfiMaterialEnum.Glowstone, "glowstoneIronMachete");
        	cactusIronMachete = new InfiToolMachete(PropsHelperInfiHybrids.ironMacheteID+6, 
                    InfiMaterialEnum.Iron, InfiMaterialEnum.Cactus, "cactusIronMachete");
        	copperIronMachete = new InfiToolMachete(PropsHelperInfiHybrids.ironMacheteID+7, 
                    InfiMaterialEnum.Iron, InfiMaterialEnum.Copper, "copperIronMachete");
        	bronzeIronMachete = new InfiToolMachete(PropsHelperInfiHybrids.ironMacheteID+8, 
                    InfiMaterialEnum.Iron, InfiMaterialEnum.Bronze, "bronzeIronMachete");
        }
        
        if(PropsHelperInfiHybrids.enableDiamondTools)
        {
        	woodDiamondMachete = new InfiToolMachete(PropsHelperInfiHybrids.diamondMacheteID+0, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Wood, "woodDiamondMachete");
        	stoneDiamondMachete = new InfiToolMachete(PropsHelperInfiHybrids.diamondMacheteID+1, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Stone, "stoneDiamondMachete");
        	ironDiamondMachete = new InfiToolMachete(PropsHelperInfiHybrids.diamondMacheteID+2, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Iron, "ironDiamondMachete");
        	diamondDiamondMachete = new InfiToolMachete(PropsHelperInfiHybrids.diamondMacheteID+3, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Diamond, "diamondDiamondMachete");
        	redstoneDiamondMachete = new InfiToolMachete(PropsHelperInfiHybrids.diamondMacheteID+4, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Redstone, "redstoneDiamondMachete");
        	obsidianDiamondMachete = new InfiToolMachete(PropsHelperInfiHybrids.diamondMacheteID+5, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Obsidian, "obsidianDiamondMachete");
        	boneDiamondMachete = new InfiToolMachete(PropsHelperInfiHybrids.diamondMacheteID+6, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Bone, "boneDiamondMachete");
        	mossyDiamondMachete = new InfiToolMachete(PropsHelperInfiHybrids.diamondMacheteID+7, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Mossy, "mossyDiamondMachete");
        	netherrackDiamondMachete = new InfiToolMachete(PropsHelperInfiHybrids.diamondMacheteID+8, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Netherrack, "netherrackDiamondMachete");
        	glowstoneDiamondMachete = new InfiToolMachete(PropsHelperInfiHybrids.diamondMacheteID+9, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Glowstone, "glowstoneDiamondMachete");
        	lavaDiamondMachete = new InfiToolMachete(PropsHelperInfiHybrids.diamondMacheteID+10, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Lava, "lavaDiamondMachete");
        	cactusDiamondMachete = new InfiToolMachete(PropsHelperInfiHybrids.diamondMacheteID+11, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Cactus, "cactusDiamondMachete");
        	flintDiamondMachete = new InfiToolMachete(PropsHelperInfiHybrids.diamondMacheteID+12, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Flint, "flintDiamondMachete");
        	blazeDiamondMachete = new InfiToolMachete(PropsHelperInfiHybrids.diamondMacheteID+13, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Blaze, "blazeDiamondMachete");
            copperDiamondMachete = new InfiToolMachete(PropsHelperInfiHybrids.diamondMacheteID+14, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Copper, "copperDiamondMachete");
            bronzeDiamondMachete = new InfiToolMachete(PropsHelperInfiHybrids.diamondMacheteID+15, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Bronze, "bronzeDiamondMachete");
            workedDiamondMachete = new InfiToolMachete(PropsHelperInfiHybrids.diamondMacheteID+16, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.WorkedIron, "workedDiamondMachete");
            steelDiamondMachete = new InfiToolMachete(PropsHelperInfiHybrids.diamondMacheteID+17, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Steel, "steelDiamondMachete");
            cobaltDiamondMachete = new InfiToolMachete(PropsHelperInfiHybrids.diamondMacheteID+18, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Cobalt, "cobaltDiamondMachete");
            arditeDiamondMachete = new InfiToolMachete(PropsHelperInfiHybrids.diamondMacheteID+19, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Ardite, "arditeDiamondMachete");
            manyullynDiamondMachete = new InfiToolMachete(PropsHelperInfiHybrids.diamondMacheteID+20, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Manyullyn, "manyullynDiamondMachete");
            uraniumDiamondMachete = new InfiToolMachete(PropsHelperInfiHybrids.diamondMacheteID+21, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Uranium, "uraniumDiamondMachete");
        }
        
        if(PropsHelperInfiHybrids.enableRedstoneTools)
        {
        	woodRedstoneMachete = new InfiToolMachete(PropsHelperInfiHybrids.redstoneMacheteID+0, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Wood, "woodRedstoneMachete");
        	stoneRedstoneMachete = new InfiToolMachete(PropsHelperInfiHybrids.redstoneMacheteID+1, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Stone, "stoneRedstoneMachete");
        	ironRedstoneMachete = new InfiToolMachete(PropsHelperInfiHybrids.redstoneMacheteID+2, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Iron, "ironRedstoneMachete");
        	redstoneRedstoneMachete = new InfiToolMachete(PropsHelperInfiHybrids.redstoneMacheteID+3, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Redstone, "redstoneRedstoneMachete");
        	obsidianRedstoneMachete = new InfiToolMachete(PropsHelperInfiHybrids.redstoneMacheteID+4, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Obsidian, "obsidianRedstoneMachete");
        	sandstoneRedstoneMachete = new InfiToolMachete(PropsHelperInfiHybrids.redstoneMacheteID+5, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Sandstone, "sandstoneRedstoneMachete");
        	boneRedstoneMachete = new InfiToolMachete(PropsHelperInfiHybrids.redstoneMacheteID+6, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Bone, "boneRedstoneMachete");
        	paperRedstoneMachete = new InfiToolMachete(PropsHelperInfiHybrids.redstoneMacheteID+7, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Paper, "paperRedstoneMachete");
        	mossyRedstoneMachete = new InfiToolMachete(PropsHelperInfiHybrids.redstoneMacheteID+8, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Mossy, "mossyRedstoneMachete");
        	netherrackRedstoneMachete = new InfiToolMachete(PropsHelperInfiHybrids.redstoneMacheteID+9, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Netherrack, "netherrackRedstoneMachete");
        	glowstoneRedstoneMachete = new InfiToolMachete(PropsHelperInfiHybrids.redstoneMacheteID+10, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Glowstone, "glowstoneRedstoneMachete");
        	iceRedstoneMachete = new InfiToolMachete(PropsHelperInfiHybrids.redstoneMacheteID+11, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Ice, "iceRedstoneMachete");
        	lavaRedstoneMachete = new InfiToolMachete(PropsHelperInfiHybrids.redstoneMacheteID+12,
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Lava, "lavaRedstoneMachete");
        	slimeRedstoneMachete = new InfiToolMachete(PropsHelperInfiHybrids.redstoneMacheteID+13,
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Slime, "slimeRedstoneMachete");
        	cactusRedstoneMachete = new InfiToolMachete(PropsHelperInfiHybrids.redstoneMacheteID+14,
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Cactus, "cactusRedstoneMachete");
        	flintRedstoneMachete = new InfiToolMachete(PropsHelperInfiHybrids.redstoneMacheteID+15,
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Flint, "flintRedstoneMachete");
        	copperRedstoneMachete = new InfiToolMachete(PropsHelperInfiHybrids.redstoneMacheteID+16,
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Copper, "copperRedstoneMachete");
        	bronzeRedstoneMachete = new InfiToolMachete(PropsHelperInfiHybrids.redstoneMacheteID+17,
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Bronze, "bronzeRedstoneMachete");
        	workedRedstoneMachete = new InfiToolMachete(PropsHelperInfiHybrids.redstoneMacheteID+18,
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.WorkedIron, "workedRedstoneMachete");
        	uraniumRedstoneMachete = new InfiToolMachete(PropsHelperInfiHybrids.redstoneMacheteID+19,
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Uranium, "uraniumRedstoneMachete");
        }
        
        if(PropsHelperInfiHybrids.enableObsidianTools)
        {
        	woodObsidianMachete = new InfiToolMachete(PropsHelperInfiHybrids.obsidianMacheteID+0, 
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Wood, "woodObsidianMachete");
        	stoneObsidianMachete = new InfiToolMachete(PropsHelperInfiHybrids.obsidianMacheteID+1, 
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Stone, "stoneObsidianMachete");
        	redstoneObsidianMachete = new InfiToolMachete(PropsHelperInfiHybrids.obsidianMacheteID+2, 
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Redstone, "redstoneObsidianMachete");
        	obsidianObsidianMachete = new InfiToolMachete(PropsHelperInfiHybrids.obsidianMacheteID+3, 
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Obsidian, "obsidianObsidianMachete");;
        	boneObsidianMachete = new InfiToolMachete(PropsHelperInfiHybrids.obsidianMacheteID+4, 
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Bone, "boneObsidianMachete");
        	netherrackObsidianMachete = new InfiToolMachete(PropsHelperInfiHybrids.obsidianMacheteID+5, 
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Netherrack, "netherrackObsidianMachete");
        	glowstoneObsidianMachete = new InfiToolMachete(PropsHelperInfiHybrids.obsidianMacheteID+6, 
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Glowstone, "glowstoneObsidianMachete");
        	iceObsidianMachete = new InfiToolMachete(PropsHelperInfiHybrids.obsidianMacheteID+7, 
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Ice, "iceObsidianMachete");
        	lavaObsidianMachete = new InfiToolMachete(PropsHelperInfiHybrids.obsidianMacheteID+8,
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Lava, "lavaObsidianMachete");
        	cactusObsidianMachete = new InfiToolMachete(PropsHelperInfiHybrids.obsidianMacheteID+9,
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Cactus, "cactusObsidianMachete");
        }
        
        if(PropsHelperInfiHybrids.enableSandstoneTools)
        {
        	woodSandstoneMachete = new InfiToolMachete(PropsHelperInfiHybrids.sandstoneMacheteID+0, 
                    InfiMaterialEnum.Sandstone, InfiMaterialEnum.Wood, "woodSandstoneMachete");
        	sandstoneSandstoneMachete = new InfiToolMachete(PropsHelperInfiHybrids.sandstoneMacheteID+1, 
                    InfiMaterialEnum.Sandstone, InfiMaterialEnum.Sandstone, "sandstoneSandstoneMachete");
        	boneSandstoneMachete = new InfiToolMachete(PropsHelperInfiHybrids.sandstoneMacheteID+2, 
                    InfiMaterialEnum.Sandstone, InfiMaterialEnum.Bone, "boneSandstoneMachete");
        	netherrackSandstoneMachete = new InfiToolMachete(PropsHelperInfiHybrids.sandstoneMacheteID+3, 
                    InfiMaterialEnum.Sandstone, InfiMaterialEnum.Netherrack, "netherrackSandstoneMachete");
        	iceSandstoneMachete = new InfiToolMachete(PropsHelperInfiHybrids.sandstoneMacheteID+4, 
                    InfiMaterialEnum.Sandstone, InfiMaterialEnum.Ice, "iceSandstoneMachete");
        	slimeSandstoneMachete = new InfiToolMachete(PropsHelperInfiHybrids.sandstoneMacheteID+5,
                    InfiMaterialEnum.Sandstone, InfiMaterialEnum.Slime, "slimeSandstoneMachete");
        	cactusSandstoneMachete = new InfiToolMachete(PropsHelperInfiHybrids.sandstoneMacheteID+6,
                    InfiMaterialEnum.Sandstone, InfiMaterialEnum.Cactus, "cactusSandstoneMachete");
        	flintSandstoneMachete = new InfiToolMachete(PropsHelperInfiHybrids.sandstoneMacheteID+7,
                    InfiMaterialEnum.Sandstone, InfiMaterialEnum.Flint, "flintSandstoneMachete");
        }
        
        if(PropsHelperInfiHybrids.enableBoneTools)
        {
        	woodBoneMachete = new InfiToolMachete(PropsHelperInfiHybrids.boneMacheteID+0, 
                    InfiMaterialEnum.Bone, InfiMaterialEnum.Wood, "woodBoneMachete");
        	stoneBoneMachete = new InfiToolMachete(PropsHelperInfiHybrids.boneMacheteID+1, 
                    InfiMaterialEnum.Bone, InfiMaterialEnum.Stone, "stoneBoneMachete");
        	sandstoneBoneMachete = new InfiToolMachete(PropsHelperInfiHybrids.boneMacheteID+2, 
                    InfiMaterialEnum.Bone, InfiMaterialEnum.Sandstone, "sandstoneBoneMachete");
        	boneBoneMachete = new InfiToolMachete(PropsHelperInfiHybrids.boneMacheteID+3, 
                    InfiMaterialEnum.Bone, InfiMaterialEnum.Bone, "boneBoneMachete");
        	paperBoneMachete = new InfiToolMachete(PropsHelperInfiHybrids.boneMacheteID+4, 
                    InfiMaterialEnum.Bone, InfiMaterialEnum.Paper, "paperBoneMachete");
        	netherrackBoneMachete = new InfiToolMachete(PropsHelperInfiHybrids.boneMacheteID+5, 
                    InfiMaterialEnum.Bone, InfiMaterialEnum.Netherrack, "netherrackBoneMachete");
        	iceBoneMachete = new InfiToolMachete(PropsHelperInfiHybrids.boneMacheteID+6, 
                    InfiMaterialEnum.Bone, InfiMaterialEnum.Ice, "iceBoneMachete");
        	cactusBoneMachete = new InfiToolMachete(PropsHelperInfiHybrids.boneMacheteID+7,
                    InfiMaterialEnum.Bone, InfiMaterialEnum.Cactus, "cactusBoneMachete");
        	flintBoneMachete = new InfiToolMachete(PropsHelperInfiHybrids.boneMacheteID+8,
                    InfiMaterialEnum.Bone, InfiMaterialEnum.Flint, "flintBoneMachete");
        }
        
        if(PropsHelperInfiHybrids.enablePaperTools)
        {
        	woodPaperMachete = new InfiToolMachete(PropsHelperInfiHybrids.paperMacheteID+0, 
                    InfiMaterialEnum.Paper, InfiMaterialEnum.Wood, "woodPaperMachete");
        	bonePaperMachete = new InfiToolMachete(PropsHelperInfiHybrids.paperMacheteID+1, 
                    InfiMaterialEnum.Paper, InfiMaterialEnum.Bone, "bonePaperMachete");
        	paperPaperMachete = new InfiToolMachete(PropsHelperInfiHybrids.paperMacheteID+2, 
                    InfiMaterialEnum.Paper, InfiMaterialEnum.Paper, "paperPaperMachete");
        	slimePaperMachete = new InfiToolMachete(PropsHelperInfiHybrids.paperMacheteID+3,
                    InfiMaterialEnum.Paper, InfiMaterialEnum.Slime, "slimePaperMachete");
        	cactusPaperMachete = new InfiToolMachete(PropsHelperInfiHybrids.paperMacheteID+4,
                    InfiMaterialEnum.Paper, InfiMaterialEnum.Cactus, "cactusPaperMachete");
        }
        
        if(PropsHelperInfiHybrids.enableMossyTools)
        {
        	woodMossyMachete = new InfiToolMachete(PropsHelperInfiHybrids.mossyMacheteID+0, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Wood, "woodMossyMachete");
        	stoneMossyMachete = new InfiToolMachete(PropsHelperInfiHybrids.mossyMacheteID+1, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Stone, "stoneMossyMachete");
        	diamondMossyMachete = new InfiToolMachete(PropsHelperInfiHybrids.mossyMacheteID+2, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Diamond, "diamondMossyMachete");
        	redstoneMossyMachete = new InfiToolMachete(PropsHelperInfiHybrids.mossyMacheteID+3, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Redstone, "redstoneMossyMachete");
        	boneMossyMachete = new InfiToolMachete(PropsHelperInfiHybrids.mossyMacheteID+4, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Bone, "boneMossyMachete");
        	mossyMossyMachete = new InfiToolMachete(PropsHelperInfiHybrids.mossyMacheteID+5, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Mossy, "mossyMossyMachete");
        	netherrackMossyMachete = new InfiToolMachete(PropsHelperInfiHybrids.mossyMacheteID+6, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Netherrack, "netherrackMossyMachete");
        	glowstoneMossyMachete = new InfiToolMachete(PropsHelperInfiHybrids.mossyMacheteID+7, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Glowstone, "glowstoneMossyMachete");
        	cactusMossyMachete = new InfiToolMachete(PropsHelperInfiHybrids.mossyMacheteID+8, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Cactus, "cactusMossyMachete");
        	blazeMossyMachete = new InfiToolMachete(PropsHelperInfiHybrids.mossyMacheteID+9, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Blaze, "blazeMossyMachete");
        	manyullynMossyMachete = new InfiToolMachete(PropsHelperInfiHybrids.mossyMacheteID+10, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Manyullyn, "manyullynMossyMachete");
        	uraniumMossyMachete = new InfiToolMachete(PropsHelperInfiHybrids.mossyMacheteID+11, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Uranium, "uraniumMossyMachete");
        }
        
        if(PropsHelperInfiHybrids.enableNetherrackTools)
        {
        	woodNetherrackMachete = new InfiToolMachete(PropsHelperInfiHybrids.netherrackMacheteID+0, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Wood, "woodNetherrackMachete");
        	stoneNetherrackMachete = new InfiToolMachete(PropsHelperInfiHybrids.netherrackMacheteID+1, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Stone, "stoneNetherrackMachete");
        	sandstoneNetherrackMachete = new InfiToolMachete(PropsHelperInfiHybrids.netherrackMacheteID+2, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Sandstone, "sandstoneNetherrackMachete");
        	boneNetherrackMachete = new InfiToolMachete(PropsHelperInfiHybrids.netherrackMacheteID+3, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Bone, "boneNetherrackMachete");
        	paperNetherrackMachete = new InfiToolMachete(PropsHelperInfiHybrids.netherrackMacheteID+4, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Paper, "paperNetherrackMachete");
        	mossyNetherrackMachete = new InfiToolMachete(PropsHelperInfiHybrids.netherrackMacheteID+5, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Mossy, "mossyNetherrackMachete");
        	netherrackNetherrackMachete = new InfiToolMachete(PropsHelperInfiHybrids.netherrackMacheteID+6, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Netherrack, "netherrackNetherrackMachete");
        	iceNetherrackMachete = new InfiToolMachete(PropsHelperInfiHybrids.netherrackMacheteID+7, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Ice, "iceNetherrackMachete");
        	slimeNetherrackMachete = new InfiToolMachete(PropsHelperInfiHybrids.netherrackMacheteID+8, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Slime, "slimeNetherrackMachete");
        	cactusNetherrackMachete = new InfiToolMachete(PropsHelperInfiHybrids.netherrackMacheteID+9, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Cactus, "cactusNetherrackMachete");
        	flintNetherrackMachete = new InfiToolMachete(PropsHelperInfiHybrids.netherrackMacheteID+10, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Flint, "flintNetherrackMachete");
        	copperNetherrackMachete = new InfiToolMachete(PropsHelperInfiHybrids.netherrackMacheteID+11, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Copper, "copperNetherrackMachete");
        	bronzeNetherrackMachete = new InfiToolMachete(PropsHelperInfiHybrids.netherrackMacheteID+12, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Bronze, "bronzeNetherrackMachete");
        }
        
        if(PropsHelperInfiHybrids.enableGlowstoneTools)
        {
        	woodGlowstoneMachete = new InfiToolMachete(PropsHelperInfiHybrids.glowstoneMacheteID+0, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Wood, "woodGlowstoneMachete");
        	redstoneGlowstoneMachete = new InfiToolMachete(PropsHelperInfiHybrids.glowstoneMacheteID+1, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Redstone, "redstoneGlowstoneMachete");
        	obsidianGlowstoneMachete = new InfiToolMachete(PropsHelperInfiHybrids.glowstoneMacheteID+2, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Obsidian, "obsidianGlowstoneMachete");
        	boneGlowstoneMachete = new InfiToolMachete(PropsHelperInfiHybrids.glowstoneMacheteID+3, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Bone, "boneGlowstoneMachete");
        	netherrackGlowstoneMachete = new InfiToolMachete(PropsHelperInfiHybrids.glowstoneMacheteID+4, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Netherrack, "netherrackGlowstoneMachete");
        	glowstoneGlowstoneMachete = new InfiToolMachete(PropsHelperInfiHybrids.glowstoneMacheteID+5, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Glowstone, "glowstoneGlowstoneMachete");
        	iceGlowstoneMachete = new InfiToolMachete(PropsHelperInfiHybrids.glowstoneMacheteID+6, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Ice, "iceGlowstoneMachete");
        	slimeGlowstoneMachete = new InfiToolMachete(PropsHelperInfiHybrids.glowstoneMacheteID+7, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Slime, "slimeGlowstoneMachete");
        	cactusGlowstoneMachete = new InfiToolMachete(PropsHelperInfiHybrids.glowstoneMacheteID+8, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Cactus, "cactusGlowstoneMachete");
        }
        
        if(PropsHelperInfiHybrids.enableIceTools)
        {
        	woodIceMachete = new InfiToolMachete(PropsHelperInfiHybrids.iceMacheteID+0, 
                    InfiMaterialEnum.Ice, InfiMaterialEnum.Wood, "woodIceMachete");
        	boneIceMachete = new InfiToolMachete(PropsHelperInfiHybrids.iceMacheteID+1, 
                    InfiMaterialEnum.Ice, InfiMaterialEnum.Bone, "boneIceMachete");
        	paperIceMachete = new InfiToolMachete(PropsHelperInfiHybrids.iceMacheteID+2, 
                    InfiMaterialEnum.Ice, InfiMaterialEnum.Paper, "paperIceMachete");
        	iceIceMachete = new InfiToolMachete(PropsHelperInfiHybrids.iceMacheteID+3, 
                    InfiMaterialEnum.Ice, InfiMaterialEnum.Ice, "iceIceMachete");
        	slimeIceMachete = new InfiToolMachete(PropsHelperInfiHybrids.iceMacheteID+4, 
                    InfiMaterialEnum.Ice, InfiMaterialEnum.Slime, "slimeIceMachete");
        	cactusIceMachete = new InfiToolMachete(PropsHelperInfiHybrids.iceMacheteID+5, 
                    InfiMaterialEnum.Ice, InfiMaterialEnum.Cactus, "cactusIceMachete");
        }
        
        if(PropsHelperInfiHybrids.enableLavaTools)
        {
        	diamondLavaMachete = new InfiToolMachete(PropsHelperInfiHybrids.lavaMacheteID+0, 
                    InfiMaterialEnum.Lava, InfiMaterialEnum.Diamond, "diamondLavaMachete");
        	obsidianLavaMachete = new InfiToolMachete(PropsHelperInfiHybrids.lavaMacheteID+1, 
                    InfiMaterialEnum.Lava, InfiMaterialEnum.Obsidian, "obsidianLavaMachete");
        	netherrackLavaMachete = new InfiToolMachete(PropsHelperInfiHybrids.lavaMacheteID+2, 
                    InfiMaterialEnum.Lava, InfiMaterialEnum.Netherrack, "netherrackLavaMachete");
        	lavaLavaMachete = new InfiToolMachete(PropsHelperInfiHybrids.lavaMacheteID+3, 
                    InfiMaterialEnum.Lava, InfiMaterialEnum.Lava, "lavaLavaMachete");
        	flintLavaMachete = new InfiToolMachete(PropsHelperInfiHybrids.lavaMacheteID+4, 
                    InfiMaterialEnum.Lava, InfiMaterialEnum.Flint, "flintLavaMachete");
        	blazeLavaMachete = new InfiToolMachete(PropsHelperInfiHybrids.lavaMacheteID+5, 
                    InfiMaterialEnum.Lava, InfiMaterialEnum.Blaze, "blazeLavaMachete");
        	manyullynLavaMachete = new InfiToolMachete(PropsHelperInfiHybrids.lavaMacheteID+6, 
                    InfiMaterialEnum.Lava, InfiMaterialEnum.Manyullyn, "manyullynLavaMachete");
            uraniumLavaMachete = new InfiToolMachete(PropsHelperInfiHybrids.lavaMacheteID+7, 
                    InfiMaterialEnum.Lava, InfiMaterialEnum.Uranium, "uraniumLavaMachete");
        }
        
        if(PropsHelperInfiHybrids.enableSlimeTools)
        {
        	woodSlimeMachete = new InfiToolMachete(PropsHelperInfiHybrids.slimeMacheteID+0, 
                    InfiMaterialEnum.Slime, InfiMaterialEnum.Wood, "woodSlimeMachete");
        	sandstoneSlimeMachete = new InfiToolMachete(PropsHelperInfiHybrids.slimeMacheteID+1, 
                    InfiMaterialEnum.Slime, InfiMaterialEnum.Sandstone, "sandstoneSlimeMachete");
        	boneSlimeMachete = new InfiToolMachete(PropsHelperInfiHybrids.slimeMacheteID+2, 
                    InfiMaterialEnum.Slime, InfiMaterialEnum.Bone, "boneSlimeMachete");
        	paperSlimeMachete = new InfiToolMachete(PropsHelperInfiHybrids.slimeMacheteID+3, 
                    InfiMaterialEnum.Slime, InfiMaterialEnum.Paper, "paperSlimeMachete");
        	slimeSlimeMachete = new InfiToolMachete(PropsHelperInfiHybrids.slimeMacheteID+4, 
                    InfiMaterialEnum.Slime, InfiMaterialEnum.Slime, "slimeSlimeMachete");
        	cactusSlimeMachete = new InfiToolMachete(PropsHelperInfiHybrids.slimeMacheteID+5, 
                    InfiMaterialEnum.Slime, InfiMaterialEnum.Cactus, "cactusSlimeMachete");
        }
        
        if(PropsHelperInfiHybrids.enableCactusTools)
        {
        	woodCactusMachete = new InfiToolMachete(PropsHelperInfiHybrids.cactusMacheteID+0, 
                    InfiMaterialEnum.Cactus, InfiMaterialEnum.Wood, "woodCactusMachete");
        	sandstoneCactusMachete = new InfiToolMachete(PropsHelperInfiHybrids.cactusMacheteID+1, 
                    InfiMaterialEnum.Cactus, InfiMaterialEnum.Sandstone, "sandstoneCactusMachete");
        	boneCactusMachete = new InfiToolMachete(PropsHelperInfiHybrids.cactusMacheteID+2, 
                    InfiMaterialEnum.Cactus, InfiMaterialEnum.Bone, "boneCactusMachete");
        	netherrackCactusMachete = new InfiToolMachete(PropsHelperInfiHybrids.cactusMacheteID+3, 
                    InfiMaterialEnum.Cactus, InfiMaterialEnum.Netherrack, "netherrackCactusMachete");
        	iceCactusMachete = new InfiToolMachete(PropsHelperInfiHybrids.cactusMacheteID+4, 
                    InfiMaterialEnum.Cactus, InfiMaterialEnum.Ice, "iceCactusMachete");
        	slimeCactusMachete = new InfiToolMachete(PropsHelperInfiHybrids.cactusMacheteID+5, 
                    InfiMaterialEnum.Cactus, InfiMaterialEnum.Slime, "slimeCactusMachete");
        	cactusCactusMachete = new InfiToolMachete(PropsHelperInfiHybrids.cactusMacheteID+6, 
                    InfiMaterialEnum.Cactus, InfiMaterialEnum.Cactus, "cactusCactusMachete");
        }
        
        if(PropsHelperInfiHybrids.enableFlintTools)
        {
        	woodFlintMachete = new InfiToolMachete(PropsHelperInfiHybrids.flintMacheteID+0, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Wood, "woodFlintMachete");
        	stoneFlintMachete = new InfiToolMachete(PropsHelperInfiHybrids.flintMacheteID+1, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Stone, "stoneFlintMachete");
        	sandstoneFlintMachete = new InfiToolMachete(PropsHelperInfiHybrids.flintMacheteID+2, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Sandstone, "sandstoneFlintMachete");
        	boneFlintMachete = new InfiToolMachete(PropsHelperInfiHybrids.flintMacheteID+3, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Bone, "boneFlintMachete");
        	netherrackFlintMachete = new InfiToolMachete(PropsHelperInfiHybrids.flintMacheteID+4, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Netherrack, "netherrackFlintMachete");
        	slimeFlintMachete = new InfiToolMachete(PropsHelperInfiHybrids.flintMacheteID+5, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Slime, "slimeFlintMachete");
        	cactusFlintMachete = new InfiToolMachete(PropsHelperInfiHybrids.flintMacheteID+6, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Cactus, "cactusFlintMachete");
        	flintFlintMachete = new InfiToolMachete(PropsHelperInfiHybrids.flintMacheteID+7, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Flint, "flintFlintMachete");
        	copperFlintMachete = new InfiToolMachete(PropsHelperInfiHybrids.flintMacheteID+8, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Copper, "copperFlintMachete");
        	bronzeFlintMachete = new InfiToolMachete(PropsHelperInfiHybrids.flintMacheteID+9, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Bronze, "bronzeFlintMachete");
        }
        
        if(PropsHelperInfiHybrids.enableBlazeTools)
        {
        	diamondBlazeMachete = new InfiToolMachete(PropsHelperInfiHybrids.blazeMacheteID+0, 
                    InfiMaterialEnum.Blaze, InfiMaterialEnum.Diamond, "diamondBlazeMachete");
        	obsidianBlazeMachete = new InfiToolMachete(PropsHelperInfiHybrids.blazeMacheteID+1, 
                    InfiMaterialEnum.Blaze, InfiMaterialEnum.Obsidian, "obsidianBlazeMachete");
        	netherrackBlazeMachete = new InfiToolMachete(PropsHelperInfiHybrids.blazeMacheteID+2, 
                    InfiMaterialEnum.Blaze, InfiMaterialEnum.Netherrack, "netherrackBlazeMachete");
        	lavaBlazeMachete = new InfiToolMachete(PropsHelperInfiHybrids.blazeMacheteID+3, 
                    InfiMaterialEnum.Blaze, InfiMaterialEnum.Lava, "lavaBlazeMachete");
        	flintBlazeMachete = new InfiToolMachete(PropsHelperInfiHybrids.blazeMacheteID+4, 
                    InfiMaterialEnum.Blaze, InfiMaterialEnum.Flint, "flintBlazeMachete");
        	blazeBlazeMachete = new InfiToolMachete(PropsHelperInfiHybrids.blazeMacheteID+5, 
                    InfiMaterialEnum.Blaze, InfiMaterialEnum.Blaze, "blazeBlazeMachete");
        	manyullynBlazeMachete = new InfiToolMachete(PropsHelperInfiHybrids.blazeMacheteID+6, 
                    InfiMaterialEnum.Blaze, InfiMaterialEnum.Manyullyn, "manyullynBlazeMachete");
            uraniumBlazeMachete = new InfiToolMachete(PropsHelperInfiHybrids.blazeMacheteID+7, 
                    InfiMaterialEnum.Blaze, InfiMaterialEnum.Uranium, "uraniumBlazeMachete");
        }
    	
        if(PropsHelperInfiHybrids.enableCopperTools)
        {
        	woodCopperMachete = new InfiToolMachete(PropsHelperInfiHybrids.copperMacheteID+0, 
                    InfiMaterialEnum.Copper, InfiMaterialEnum.Wood, "woodCopperMachete");
            stoneCopperMachete = new InfiToolMachete(PropsHelperInfiHybrids.copperMacheteID+1, 
                    InfiMaterialEnum.Copper, InfiMaterialEnum.Stone, "stoneCopperMachete");
            boneCopperMachete = new InfiToolMachete(PropsHelperInfiHybrids.copperMacheteID+2, 
                    InfiMaterialEnum.Copper, InfiMaterialEnum.Bone, "boneCopperMachete");
            netherrackCopperMachete = new InfiToolMachete(PropsHelperInfiHybrids.copperMacheteID+3, 
                    InfiMaterialEnum.Copper, InfiMaterialEnum.Netherrack, "netherrackCopperMachete");
            slimeCopperMachete = new InfiToolMachete(PropsHelperInfiHybrids.copperMacheteID+4, 
                    InfiMaterialEnum.Copper, InfiMaterialEnum.Slime, "slimeCopperMachete");
            cactusCopperMachete = new InfiToolMachete(PropsHelperInfiHybrids.copperMacheteID+5, 
                    InfiMaterialEnum.Copper, InfiMaterialEnum.Cactus, "cactusCopperMachete");
            flintCopperMachete = new InfiToolMachete(PropsHelperInfiHybrids.copperMacheteID+6, 
                    InfiMaterialEnum.Copper, InfiMaterialEnum.Flint, "flintCopperMachete");
            copperCopperMachete = new InfiToolMachete(PropsHelperInfiHybrids.copperMacheteID+7, 
                    InfiMaterialEnum.Copper, InfiMaterialEnum.Copper, "copperCopperMachete");
        }
        
        if(PropsHelperInfiHybrids.enableBronzeTools)
        {
        	woodBronzeMachete = new InfiToolMachete(PropsHelperInfiHybrids.bronzeMacheteID+0, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Wood, "woodBronzeMachete");
            stoneBronzeMachete = new InfiToolMachete(PropsHelperInfiHybrids.bronzeMacheteID+1, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Stone, "stoneBronzeMachete");
            boneBronzeMachete = new InfiToolMachete(PropsHelperInfiHybrids.bronzeMacheteID+2, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Bone, "boneBronzeMachete");
            netherrackBronzeMachete = new InfiToolMachete(PropsHelperInfiHybrids.bronzeMacheteID+3, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Netherrack, "netherrackBronzeMachete");
            slimeBronzeMachete = new InfiToolMachete(PropsHelperInfiHybrids.bronzeMacheteID+4, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Slime, "slimeBronzeMachete");
            cactusBronzeMachete = new InfiToolMachete(PropsHelperInfiHybrids.bronzeMacheteID+5, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Cactus, "cactusBronzeMachete");
            flintBronzeMachete = new InfiToolMachete(PropsHelperInfiHybrids.bronzeMacheteID+6, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Flint, "flintBronzeMachete");
            copperBronzeMachete = new InfiToolMachete(PropsHelperInfiHybrids.bronzeMacheteID+7, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Copper, "copperBronzeMachete");
            bronzeBronzeMachete = new InfiToolMachete(PropsHelperInfiHybrids.bronzeMacheteID+8, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Bronze, "bronzeBronzeMachete");
        }
        
        if(PropsHelperInfiHybrids.enableWorkedIronTools)
        {
        	woodWorkedIronMachete = new InfiToolMachete(PropsHelperInfiHybrids.workedIronMacheteID+0, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Wood, "woodWorkedIronMachete");
            stoneWorkedIronMachete = new InfiToolMachete(PropsHelperInfiHybrids.workedIronMacheteID+1, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Stone, "stoneWorkedIronMachete");
            ironWorkedIronMachete = new InfiToolMachete(PropsHelperInfiHybrids.workedIronMacheteID+2,
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Iron, "ironWorkedIronMachete");
            diamondWorkedIronMachete = new InfiToolMachete(PropsHelperInfiHybrids.workedIronMacheteID+3, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Diamond, "diamondWorkedIronMachete");
            redstoneWorkedIronMachete = new InfiToolMachete(PropsHelperInfiHybrids.workedIronMacheteID+4, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Redstone, "redstoneWorkedIronMachete");
            obsidianWorkedIronMachete = new InfiToolMachete(PropsHelperInfiHybrids.workedIronMacheteID+5, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Obsidian, "obsidianWorkedIronMachete");
            boneWorkedIronMachete = new InfiToolMachete(PropsHelperInfiHybrids.workedIronMacheteID+6, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Bone, "boneWorkedIronMachete");
            netherrackWorkedIronMachete = new InfiToolMachete(PropsHelperInfiHybrids.workedIronMacheteID+7, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Netherrack, "netherrackWorkedIronMachete");
            glowstoneWorkedIronMachete = new InfiToolMachete(PropsHelperInfiHybrids.workedIronMacheteID+8, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Glowstone, "glowstoneWorkedIronMachete");
            iceWorkedIronMachete = new InfiToolMachete(PropsHelperInfiHybrids.workedIronMacheteID+9, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Ice, "iceWorkedIronMachete");
            slimeWorkedIronMachete = new InfiToolMachete(PropsHelperInfiHybrids.workedIronMacheteID+10, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Slime, "slimeWorkedIronMachete");
            cactusWorkedIronMachete = new InfiToolMachete(PropsHelperInfiHybrids.workedIronMacheteID+11, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Cactus, "cactusWorkedIronMachete");
            blazeWorkedIronMachete = new InfiToolMachete(PropsHelperInfiHybrids.workedIronMacheteID+12, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Blaze, "blazeWorkedIronMachete");
            copperWorkedIronMachete = new InfiToolMachete(PropsHelperInfiHybrids.workedIronMacheteID+13, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Copper, "copperWorkedIronMachete");
            bronzeWorkedIronMachete = new InfiToolMachete(PropsHelperInfiHybrids.workedIronMacheteID+14, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Bronze, "bronzeWorkedIronMachete");
            workedWorkedIronMachete = new InfiToolMachete(PropsHelperInfiHybrids.workedIronMacheteID+15, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.WorkedIron, "workedWorkedIronMachete");
            steelWorkedIronMachete = new InfiToolMachete(PropsHelperInfiHybrids.workedIronMacheteID+16, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Steel, "steelWorkedIronMachete");
            uraniumWorkedIronMachete = new InfiToolMachete(PropsHelperInfiHybrids.workedIronMacheteID+17, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Uranium, "uraniumWorkedIronMachete");
        }
        
        if(PropsHelperInfiHybrids.enableSteelTools)
        {
        	woodSteelMachete = new InfiToolMachete(PropsHelperInfiHybrids.steelMacheteID+0, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Wood, "woodSteelMachete");
            stoneSteelMachete = new InfiToolMachete(PropsHelperInfiHybrids.steelMacheteID+1, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Stone, "stoneSteelMachete");
            ironSteelMachete = new InfiToolMachete(PropsHelperInfiHybrids.steelMacheteID+2, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Iron, "ironSteelMachete");
            diamondSteelMachete = new InfiToolMachete(PropsHelperInfiHybrids.steelMacheteID+3, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Diamond, "diamondSteelMachete");
            redstoneSteelMachete = new InfiToolMachete(PropsHelperInfiHybrids.steelMacheteID+4, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Redstone, "redstoneSteelMachete");
            obsidianSteelMachete = new InfiToolMachete(PropsHelperInfiHybrids.steelMacheteID+5, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Obsidian, "obsidianSteelMachete");
            boneSteelMachete = new InfiToolMachete(PropsHelperInfiHybrids.steelMacheteID+6, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Bone, "boneSteelMachete");
            netherrackSteelMachete = new InfiToolMachete(PropsHelperInfiHybrids.steelMacheteID+7, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Netherrack, "netherrackSteelMachete");
            glowstoneSteelMachete = new InfiToolMachete(PropsHelperInfiHybrids.steelMacheteID+8, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Glowstone, "glowstoneSteelMachete");
            iceSteelMachete = new InfiToolMachete(PropsHelperInfiHybrids.steelMacheteID+9, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Ice, "iceSteelMachete");
            slimeSteelMachete = new InfiToolMachete(PropsHelperInfiHybrids.steelMacheteID+10, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Slime, "slimeSteelMachete");
            cactusSteelMachete = new InfiToolMachete(PropsHelperInfiHybrids.steelMacheteID+11, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Cactus, "cactusSteelMachete");
            blazeSteelMachete = new InfiToolMachete(PropsHelperInfiHybrids.steelMacheteID+12, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Blaze, "blazeSteelMachete");
            copperSteelMachete = new InfiToolMachete(PropsHelperInfiHybrids.steelMacheteID+13, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Copper, "copperSteelMachete");
            bronzeSteelMachete = new InfiToolMachete(PropsHelperInfiHybrids.steelMacheteID+14, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Bronze, "bronzeSteelMachete");
            workedSteelMachete = new InfiToolMachete(PropsHelperInfiHybrids.steelMacheteID+15, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.WorkedIron, "workedSteelMachete");
            steelSteelMachete = new InfiToolMachete(PropsHelperInfiHybrids.steelMacheteID+16, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Steel, "steelSteelMachete");
            cobaltSteelMachete = new InfiToolMachete(PropsHelperInfiHybrids.steelMacheteID+17, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Cobalt, "cobaltSteelMachete");
            arditeSteelMachete = new InfiToolMachete(PropsHelperInfiHybrids.steelMacheteID+18, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Ardite, "arditeSteelMachete");
            uraniumSteelMachete = new InfiToolMachete(PropsHelperInfiHybrids.steelMacheteID+19, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Uranium, "uraniumSteelMachete");
        }
        
        if(PropsHelperInfiHybrids.enableCobaltTools)
        {
        	woodCobaltMachete = new InfiToolMachete(PropsHelperInfiHybrids.cobaltMacheteID+0, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Wood, "woodCobaltMachete");
            stoneCobaltMachete = new InfiToolMachete(PropsHelperInfiHybrids.cobaltMacheteID+1, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Stone, "stoneCobaltMachete");
            ironCobaltMachete = new InfiToolMachete(PropsHelperInfiHybrids.cobaltMacheteID+2, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Iron, "ironCobaltMachete");
            diamondCobaltMachete = new InfiToolMachete(PropsHelperInfiHybrids.cobaltMacheteID+3,
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Diamond, "diamondCobaltMachete");
            redstoneCobaltMachete = new InfiToolMachete(PropsHelperInfiHybrids.cobaltMacheteID+4, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Redstone, "redstoneCobaltMachete");
            obsidianCobaltMachete = new InfiToolMachete(PropsHelperInfiHybrids.cobaltMacheteID+5, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Obsidian, "obsidianCobaltMachete");
            boneCobaltMachete = new InfiToolMachete(PropsHelperInfiHybrids.cobaltMacheteID+6, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Bone, "boneCobaltMachete");
            slimeCobaltMachete = new InfiToolMachete(PropsHelperInfiHybrids.cobaltMacheteID+7, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Slime, "slimeCobaltMachete");
            cactusCobaltMachete = new InfiToolMachete(PropsHelperInfiHybrids.cobaltMacheteID+8, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Cactus, "cactusCobaltMachete");
            blazeCobaltMachete = new InfiToolMachete(PropsHelperInfiHybrids.cobaltMacheteID+9, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Blaze, "blazeCobaltMachete");
            copperCobaltMachete = new InfiToolMachete(PropsHelperInfiHybrids.cobaltMacheteID+10, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Copper, "copperCobaltMachete");
            bronzeCobaltMachete = new InfiToolMachete(PropsHelperInfiHybrids.cobaltMacheteID+11, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Bronze, "bronzeCobaltMachete");
            workedCobaltMachete = new InfiToolMachete(PropsHelperInfiHybrids.cobaltMacheteID+12, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.WorkedIron, "workedCobaltMachete");
            steelCobaltMachete = new InfiToolMachete(PropsHelperInfiHybrids.cobaltMacheteID+13, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Steel, "steelCobaltMachete");
            cobaltCobaltMachete = new InfiToolMachete(PropsHelperInfiHybrids.cobaltMacheteID+14, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Cobalt, "cobaltCobaltMachete");
            arditeCobaltMachete = new InfiToolMachete(PropsHelperInfiHybrids.cobaltMacheteID+15, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Ardite, "arditeCobaltMachete");
            manyullynCobaltMachete = new InfiToolMachete(PropsHelperInfiHybrids.cobaltMacheteID+16, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Manyullyn, "manyullynCobaltMachete");
            uraniumCobaltMachete = new InfiToolMachete(PropsHelperInfiHybrids.cobaltMacheteID+17, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Uranium, "uraniumCobaltMachete");
        }
        
        if(PropsHelperInfiHybrids.enableArditeTools)
        {
        	woodArditeMachete = new InfiToolMachete(PropsHelperInfiHybrids.arditeMacheteID+0, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Wood, "woodArditeMachete");
            stoneArditeMachete = new InfiToolMachete(PropsHelperInfiHybrids.arditeMacheteID+1, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Stone, "stoneArditeMachete");
            ironArditeMachete = new InfiToolMachete(PropsHelperInfiHybrids.arditeMacheteID+2, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Iron, "ironArditeMachete");
            diamondArditeMachete = new InfiToolMachete(PropsHelperInfiHybrids.arditeMacheteID+3,
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Diamond, "diamondArditeMachete");
            redstoneArditeMachete = new InfiToolMachete(PropsHelperInfiHybrids.arditeMacheteID+4, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Redstone, "redstoneArditeMachete");
            obsidianArditeMachete = new InfiToolMachete(PropsHelperInfiHybrids.arditeMacheteID+5, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Obsidian, "obsidianArditeMachete");
            boneArditeMachete = new InfiToolMachete(PropsHelperInfiHybrids.arditeMacheteID+6,
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Bone, "boneArditeMachete");
            slimeArditeMachete = new InfiToolMachete(PropsHelperInfiHybrids.arditeMacheteID+7, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Slime, "slimeArditeMachete");
            cactusArditeMachete = new InfiToolMachete(PropsHelperInfiHybrids.arditeMacheteID+8, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Cactus, "cactusArditeMachete");
            blazeArditeMachete = new InfiToolMachete(PropsHelperInfiHybrids.arditeMacheteID+9, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Blaze, "blazeArditeMachete");
            copperArditeMachete = new InfiToolMachete(PropsHelperInfiHybrids.arditeMacheteID+10, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Copper, "copperArditeMachete");
            bronzeArditeMachete = new InfiToolMachete(PropsHelperInfiHybrids.arditeMacheteID+11, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Bronze, "bronzeArditeMachete");
            workedArditeMachete = new InfiToolMachete(PropsHelperInfiHybrids.arditeMacheteID+12, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.WorkedIron, "workedArditeMachete");
            steelArditeMachete = new InfiToolMachete(PropsHelperInfiHybrids.arditeMacheteID+13, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Steel, "steelArditeMachete");
            cobaltArditeMachete = new InfiToolMachete(PropsHelperInfiHybrids.arditeMacheteID+14, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Cobalt, "cobaltArditeMachete");
            arditeArditeMachete = new InfiToolMachete(PropsHelperInfiHybrids.arditeMacheteID+15, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Ardite, "arditeArditeMachete");
            manyullynArditeMachete = new InfiToolMachete(PropsHelperInfiHybrids.arditeMacheteID+16, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Manyullyn, "manyullynArditeMachete");
            uraniumArditeMachete = new InfiToolMachete(PropsHelperInfiHybrids.arditeMacheteID+17, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Uranium, "uraniumArditeMachete");
        }
        
        if(PropsHelperInfiHybrids.enableManyullynTools)
        {
        	woodManyullynMachete = new InfiToolMachete(PropsHelperInfiHybrids.manyullynMacheteID+0, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Wood, "woodManyullynMachete");
            stoneManyullynMachete = new InfiToolMachete(PropsHelperInfiHybrids.manyullynMacheteID+1, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Stone, "stoneManyullynMachete");
            ironManyullynMachete = new InfiToolMachete(PropsHelperInfiHybrids.manyullynMacheteID+2, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Iron, "ironManyullynMachete");
            diamondManyullynMachete = new InfiToolMachete(PropsHelperInfiHybrids.manyullynMacheteID+3,
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Diamond, "diamondManyullynMachete");
            redstoneManyullynMachete = new InfiToolMachete(PropsHelperInfiHybrids.manyullynMacheteID+4, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Redstone, "redstoneManyullynMachete");
            obsidianManyullynMachete = new InfiToolMachete(PropsHelperInfiHybrids.manyullynMacheteID+5, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Obsidian, "obsidianManyullynMachete");
            boneManyullynMachete = new InfiToolMachete(PropsHelperInfiHybrids.manyullynMacheteID+6, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Bone, "boneManyullynMachete");
            slimeManyullynMachete = new InfiToolMachete(PropsHelperInfiHybrids.manyullynMacheteID+7, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Slime, "slimeManyullynMachete");
            cactusManyullynMachete = new InfiToolMachete(PropsHelperInfiHybrids.manyullynMacheteID+8, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Cactus, "cactusManyullynMachete");
            blazeManyullynMachete = new InfiToolMachete(PropsHelperInfiHybrids.manyullynMacheteID+9, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Blaze, "blazeManyullynMachete");
            copperManyullynMachete = new InfiToolMachete(PropsHelperInfiHybrids.manyullynMacheteID+10, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Copper, "copperManyullynMachete");
            bronzeManyullynMachete = new InfiToolMachete(PropsHelperInfiHybrids.manyullynMacheteID+11, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Bronze, "bronzeManyullynMachete");
            workedManyullynMachete = new InfiToolMachete(PropsHelperInfiHybrids.manyullynMacheteID+12, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.WorkedIron, "workedManyullynMachete");
            steelManyullynMachete = new InfiToolMachete(PropsHelperInfiHybrids.manyullynMacheteID+13, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Steel, "steelManyullynMachete");
            cobaltManyullynMachete = new InfiToolMachete(PropsHelperInfiHybrids.manyullynMacheteID+14, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Cobalt, "cobaltManyullynMachete");
            arditeManyullynMachete = new InfiToolMachete(PropsHelperInfiHybrids.manyullynMacheteID+15, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Ardite, "arditeManyullynMachete");
            manyullynManyullynMachete = new InfiToolMachete(PropsHelperInfiHybrids.manyullynMacheteID+16, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Manyullyn, "manyullynManyullynMachete");
            uraniumManyullynMachete = new InfiToolMachete(PropsHelperInfiHybrids.manyullynMacheteID+17,
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Bronze, "uraniumManyullynMachete");
        }
        
        if(PropsHelperInfiHybrids.enableUraniumTools)
        {
            diamondUraniumMachete = new InfiToolMachete(PropsHelperInfiHybrids.uraniumMacheteID+0, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Diamond, "diamondUraniumMachete");
            redstoneUraniumMachete = new InfiToolMachete(PropsHelperInfiHybrids.uraniumMacheteID+1, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Redstone, "redstoneUraniumMachete");
            boneUraniumMachete = new InfiToolMachete(PropsHelperInfiHybrids.uraniumMacheteID+2, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Bone, "boneUraniumMachete");
            netherrackUraniumMachete = new InfiToolMachete(PropsHelperInfiHybrids.uraniumMacheteID+3, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Netherrack, "netherrackUraniumMachete");
            glowstoneUraniumMachete = new InfiToolMachete(PropsHelperInfiHybrids.uraniumMacheteID+4, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Glowstone, "glowstoneUraniumMachete");
            lavaUraniumMachete = new InfiToolMachete(PropsHelperInfiHybrids.uraniumMacheteID+5, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Lava, "lavaUraniumMachete");
            blazeUraniumMachete = new InfiToolMachete(PropsHelperInfiHybrids.uraniumMacheteID+6, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Blaze, "blazeUraniumMachete");
            cobaltUraniumMachete = new InfiToolMachete(PropsHelperInfiHybrids.uraniumMacheteID+7, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Cobalt, "cobaltUraniumMachete");
            arditeUraniumMachete = new InfiToolMachete(PropsHelperInfiHybrids.uraniumMacheteID+8, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Ardite, "arditeUraniumMachete");
            uraniumUraniumMachete = new InfiToolMachete(PropsHelperInfiHybrids.uraniumMacheteID+9, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Uranium, "uraniumUraniumMachete");
        }
    }
    
    private static void addNames()
    {
    	if(PropsHelperInfiHybrids.enableWoodTools)
            ModLoader.addName(woodWoodMachete, "Wooden Machete");
        if(PropsHelperInfiHybrids.enableStoneTools)
            ModLoader.addName(stoneStoneMachete, "Heavy Machete");
        if(PropsHelperInfiHybrids.enableIronTools)
            ModLoader.addName(ironIronMachete, "Ironic Machete");
        if(PropsHelperInfiHybrids.enableDiamondTools)
            ModLoader.addName(diamondDiamondMachete, "Diamondium Machete");
        if(PropsHelperInfiHybrids.enableRedstoneTools)
            ModLoader.addName(redstoneRedstoneMachete, "Redredred Machete");
        if(PropsHelperInfiHybrids.enableObsidianTools)
            ModLoader.addName(obsidianObsidianMachete, "Ebony Machete");
        if(PropsHelperInfiHybrids.enableSandstoneTools)
            ModLoader.addName(sandstoneSandstoneMachete, "Fragile Machete");
        if(PropsHelperInfiHybrids.enableNetherrackTools)
            ModLoader.addName(boneBoneMachete, "Necrotic Machete");
        if(PropsHelperInfiHybrids.enablePaperTools)
            ModLoader.addName(paperPaperMachete, "Soft Machete");
        if(PropsHelperInfiHybrids.enableMossyTools)
            ModLoader.addName(mossyMossyMachete, "Living Machete");
        if(PropsHelperInfiHybrids.enableNetherrackTools)
            ModLoader.addName(netherrackNetherrackMachete, "Bloodsoaked Machete");
        if(PropsHelperInfiHybrids.enableGlowstoneTools)
            ModLoader.addName(glowstoneGlowstoneMachete, "Bright Machete");
        if(PropsHelperInfiHybrids.enableIceTools)
            ModLoader.addName(iceIceMachete, "Freezing Machete");
        if(PropsHelperInfiHybrids.enableLavaTools)
            ModLoader.addName(lavaLavaMachete, "Burning Machete");
        if(PropsHelperInfiHybrids.enableSlimeTools)
            ModLoader.addName(slimeSlimeMachete, "Toy Machete");
        if(PropsHelperInfiHybrids.enableCactusTools)
            ModLoader.addName(cactusCactusMachete, "Thorned Machete");
        if(PropsHelperInfiHybrids.enableFlintTools)
            ModLoader.addName(flintFlintMachete, "Rough-hewn Machete");
        if(PropsHelperInfiHybrids.enableBlazeTools)
            ModLoader.addName(blazeBlazeMachete, "Netherite Machete");
        if(PropsHelperInfiHybrids.enableCopperTools)
            ModLoader.addName(copperCopperMachete, "Orange-Tang Machete");
        if(PropsHelperInfiHybrids.enableBronzeTools)
            ModLoader.addName(bronzeBronzeMachete, "Polished Machete");
        if(PropsHelperInfiHybrids.enableWorkedIronTools)
            ModLoader.addName(workedWorkedIronMachete, "Reworked Iron Machete");
        if(PropsHelperInfiHybrids.enableSteelTools)
            ModLoader.addName(steelSteelMachete, "Forge-Wrought Machete");
        if(PropsHelperInfiHybrids.enableCobaltTools)
            ModLoader.addName(cobaltCobaltMachete, "Beautiful Machete");
        if(PropsHelperInfiHybrids.enableArditeTools)
            ModLoader.addName(arditeArditeMachete, "Rustic Machete");
        if(PropsHelperInfiHybrids.enableManyullynTools)
            ModLoader.addName(manyullynManyullynMachete, "False-Prophetic Machete");
        if(PropsHelperInfiHybrids.enableUraniumTools)
            ModLoader.addName(uraniumUraniumMachete, "Cancerous Machete");
    }
    
    public static void registerInfiToolsRecipes()
    {
    	if(PropsHelperInfiHybrids.enableWoodTools)
        {
            ModLoader.addRecipe(new ItemStack(woodWoodMachete), new Object[] 
                    { recipe, '#', Block.planks, '|', Item.stick });
            ModLoader.addRecipe(new ItemStack(sandstoneWoodMachete), new Object[] 
                    { recipe, '#', Block.planks, '|', mod_InfiBase.sandstoneRod });
            ModLoader.addRecipe(new ItemStack(boneWoodMachete), new Object[] 
                    { recipe, '#', Block.planks, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneWoodMachete), new Object[] 
                    { recipe, '#', Block.planks, '|', mod_InfiBase.boneRod });
            ModLoader.addRecipe(new ItemStack(paperWoodMachete), new Object[] 
                    { recipe, '#', Block.planks, '|', mod_InfiBase.paperRod });
            ModLoader.addRecipe(new ItemStack(iceWoodMachete), new Object[] 
                    { recipe, '#', Block.planks, '|', mod_InfiBase.iceRod });
            ModLoader.addRecipe(new ItemStack(slimeWoodMachete), new Object[] 
                    { recipe, '#', Block.planks, '|', mod_InfiBase.slimeRod });
            ModLoader.addRecipe(new ItemStack(cactusWoodMachete), new Object[] 
                    { recipe, '#', Block.planks, '|', mod_InfiBase.cactusRod });
        }
    	
        if(PropsHelperInfiHybrids.enableStoneTools)
        {
        	ModLoader.addRecipe(new ItemStack(woodStoneMachete), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', Item.stick });
        	ModLoader.addRecipe(new ItemStack(stoneStoneMachete), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', mod_InfiBase.stoneRod });
            ModLoader.addRecipe(new ItemStack(sandstoneStoneMachete), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', mod_InfiBase.sandstoneRod });
            ModLoader.addRecipe(new ItemStack(boneStoneMachete), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneStoneMachete), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', mod_InfiBase.boneRod });
            ModLoader.addRecipe(new ItemStack(netherrackStoneMachete), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', mod_InfiBase.netherrackRod });
            ModLoader.addRecipe(new ItemStack(iceStoneMachete), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', mod_InfiBase.iceRod });
            ModLoader.addRecipe(new ItemStack(slimeStoneMachete), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', mod_InfiBase.slimeRod });
            ModLoader.addRecipe(new ItemStack(cactusStoneMachete), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', mod_InfiBase.cactusRod });
            ModLoader.addRecipe(new ItemStack(flintStoneMachete), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', mod_InfiBase.flintRod });
            
            ModLoader.addRecipe(new ItemStack(woodStoneMachete), new Object[] 
                    { recipe, '#', Block.stone, '|', Item.stick });
        	ModLoader.addRecipe(new ItemStack(stoneStoneMachete), new Object[] 
                    { recipe, '#', Block.stone, '|', mod_InfiBase.stoneRod });
            ModLoader.addRecipe(new ItemStack(sandstoneStoneMachete), new Object[] 
                    { recipe, '#', Block.stone, '|', mod_InfiBase.sandstoneRod });
            ModLoader.addRecipe(new ItemStack(boneStoneMachete), new Object[] 
                    { recipe, '#', Block.stone, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneStoneMachete), new Object[] 
                    { recipe, '#', Block.stone, '|', mod_InfiBase.boneRod });
            ModLoader.addRecipe(new ItemStack(netherrackStoneMachete), new Object[] 
                    { recipe, '#', Block.stone, '|', mod_InfiBase.netherrackRod });
            ModLoader.addRecipe(new ItemStack(iceStoneMachete), new Object[] 
                    { recipe, '#', Block.stone, '|', mod_InfiBase.iceRod });
            ModLoader.addRecipe(new ItemStack(slimeStoneMachete), new Object[] 
                    { recipe, '#', Block.stone, '|', mod_InfiBase.slimeRod });
            ModLoader.addRecipe(new ItemStack(cactusStoneMachete), new Object[] 
                    { recipe, '#', Block.stone, '|', mod_InfiBase.cactusRod });
            ModLoader.addRecipe(new ItemStack(flintStoneMachete), new Object[] 
                    { recipe, '#', Block.stone, '|', mod_InfiBase.flintRod });
        }
        
        if(PropsHelperInfiHybrids.enableIronTools)
        {
        	ModLoader.addRecipe(new ItemStack(woodIronMachete), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', Item.stick });
        	ModLoader.addRecipe(new ItemStack(stoneIronMachete), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', mod_InfiBase.stoneRod });
            ModLoader.addRecipe(new ItemStack(ironIronMachete), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', mod_InfiBase.ironRod });
            ModLoader.addRecipe(new ItemStack(boneIronMachete), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneIronMachete), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', mod_InfiBase.boneRod });
            ModLoader.addRecipe(new ItemStack(netherrackIronMachete), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', mod_InfiBase.netherrackRod });
            ModLoader.addRecipe(new ItemStack(glowstoneIronMachete), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', mod_InfiBase.glowstoneRod });
            ModLoader.addRecipe(new ItemStack(cactusIronMachete), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', mod_InfiBase.cactusRod });
            ModLoader.addRecipe(new ItemStack(copperIronMachete), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', mod_InfiBase.copperRod });
            ModLoader.addRecipe(new ItemStack(bronzeIronMachete), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', mod_InfiBase.bronzeRod });
        }
        
        if(PropsHelperInfiHybrids.enableDiamondTools)
        {
        	ModLoader.addRecipe(new ItemStack(woodDiamondMachete), new Object[] 
                    { recipe, '#', Item.diamond, '|', Item.stick });
        	ModLoader.addRecipe(new ItemStack(stoneDiamondMachete), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.stoneRod });
            ModLoader.addRecipe(new ItemStack(ironDiamondMachete), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.ironRod });
            ModLoader.addRecipe(new ItemStack(diamondDiamondMachete), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.diamondRod });
            ModLoader.addRecipe(new ItemStack(redstoneDiamondMachete), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.redstoneRod });
            ModLoader.addRecipe(new ItemStack(obsidianDiamondMachete), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.obsidianRod });
            ModLoader.addRecipe(new ItemStack(boneDiamondMachete), new Object[] 
                    { recipe, '#', Item.diamond, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneDiamondMachete), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.boneRod });
            ModLoader.addRecipe(new ItemStack(mossyDiamondMachete), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.mossyRod });
            ModLoader.addRecipe(new ItemStack(netherrackDiamondMachete), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.netherrackRod });
            ModLoader.addRecipe(new ItemStack(glowstoneDiamondMachete), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.glowstoneRod });
            ModLoader.addRecipe(new ItemStack(lavaDiamondMachete), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.lavaRod });
            ModLoader.addRecipe(new ItemStack(cactusDiamondMachete), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.cactusRod });
            ModLoader.addRecipe(new ItemStack(flintDiamondMachete), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.flintRod });
            ModLoader.addRecipe(new ItemStack(blazeDiamondMachete), new Object[] 
                    { recipe, '#', Item.diamond, '|', Item.blazeRod });
            ModLoader.addRecipe(new ItemStack(copperDiamondMachete), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.copperRod });
            ModLoader.addRecipe(new ItemStack(bronzeDiamondMachete), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.bronzeRod });
            ModLoader.addRecipe(new ItemStack(workedDiamondMachete), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.workedIronRod });
            ModLoader.addRecipe(new ItemStack(steelDiamondMachete), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.steelRod });
            ModLoader.addRecipe(new ItemStack(cobaltDiamondMachete), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.cobaltRod });
            ModLoader.addRecipe(new ItemStack(arditeDiamondMachete), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.arditeRod });
            ModLoader.addRecipe(new ItemStack(manyullynDiamondMachete), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.manyullynRod });
            ModLoader.addRecipe(new ItemStack(uraniumDiamondMachete), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.uraniumRod });
        }
        
        if(PropsHelperInfiHybrids.enableRedstoneTools)
        {
        	ModLoader.addRecipe(new ItemStack(woodRedstoneMachete), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', Item.stick });
        	ModLoader.addRecipe(new ItemStack(stoneRedstoneMachete), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.stoneRod });
            ModLoader.addRecipe(new ItemStack(ironRedstoneMachete), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.ironRod });
            ModLoader.addRecipe(new ItemStack(redstoneRedstoneMachete), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.redstoneRod });
            ModLoader.addRecipe(new ItemStack(obsidianRedstoneMachete), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.obsidianRod });
            ModLoader.addRecipe(new ItemStack(sandstoneRedstoneMachete), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.sandstoneRod });
            ModLoader.addRecipe(new ItemStack(boneRedstoneMachete), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneRedstoneMachete), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.boneRod });
            ModLoader.addRecipe(new ItemStack(paperRedstoneMachete), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.paperRod });
            ModLoader.addRecipe(new ItemStack(mossyRedstoneMachete), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.mossyRod });
            ModLoader.addRecipe(new ItemStack(netherrackRedstoneMachete), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.netherrackRod });
            ModLoader.addRecipe(new ItemStack(glowstoneRedstoneMachete), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.glowstoneRod });
            ModLoader.addRecipe(new ItemStack(iceRedstoneMachete), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.iceRod });
            ModLoader.addRecipe(new ItemStack(lavaRedstoneMachete), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.lavaRod });
            ModLoader.addRecipe(new ItemStack(slimeRedstoneMachete), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.slimeRod });
            ModLoader.addRecipe(new ItemStack(cactusRedstoneMachete), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.cactusRod });
            ModLoader.addRecipe(new ItemStack(flintRedstoneMachete), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.flintRod });
            ModLoader.addRecipe(new ItemStack(copperRedstoneMachete), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.copperRod });
            ModLoader.addRecipe(new ItemStack(bronzeRedstoneMachete), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.bronzeRod });
            ModLoader.addRecipe(new ItemStack(workedRedstoneMachete), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.workedIronRod });
            ModLoader.addRecipe(new ItemStack(uraniumRedstoneMachete), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.uraniumRod });
        }
        
        if(PropsHelperInfiHybrids.enableObsidianTools)
        {
        	ModLoader.addRecipe(new ItemStack(woodObsidianMachete), new Object[] 
                    { recipe, '#', Block.obsidian, '|', Item.stick });
        	ModLoader.addRecipe(new ItemStack(stoneObsidianMachete), new Object[] 
                    { recipe, '#', Block.obsidian, '|', mod_InfiBase.stoneRod });
            ModLoader.addRecipe(new ItemStack(redstoneObsidianMachete), new Object[] 
                    { recipe, '#', Block.obsidian, '|', mod_InfiBase.redstoneRod });
            ModLoader.addRecipe(new ItemStack(obsidianObsidianMachete), new Object[] 
                    { recipe, '#', Block.obsidian, '|', mod_InfiBase.obsidianRod });
            ModLoader.addRecipe(new ItemStack(boneObsidianMachete), new Object[] 
                    { recipe, '#', Block.obsidian, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneObsidianMachete), new Object[] 
                    { recipe, '#', Block.obsidian, '|', mod_InfiBase.boneRod });
            ModLoader.addRecipe(new ItemStack(netherrackObsidianMachete), new Object[] 
                    { recipe, '#', Block.obsidian, '|', mod_InfiBase.netherrackRod });
            ModLoader.addRecipe(new ItemStack(glowstoneObsidianMachete), new Object[] 
                    { recipe, '#', Block.obsidian, '|', mod_InfiBase.glowstoneRod });
            ModLoader.addRecipe(new ItemStack(iceObsidianMachete), new Object[] 
                    { recipe, '#', Block.obsidian, '|', mod_InfiBase.iceRod });
            ModLoader.addRecipe(new ItemStack(lavaObsidianMachete), new Object[] 
                    { recipe, '#', Block.obsidian, '|', mod_InfiBase.lavaRod });
            ModLoader.addRecipe(new ItemStack(cactusObsidianMachete), new Object[] 
                    { recipe, '#', Block.obsidian, '|', mod_InfiBase.cactusRod });
        }
        
        if(PropsHelperInfiHybrids.enableSandstoneTools)
        {
            ModLoader.addRecipe(new ItemStack(woodSandstoneMachete), new Object[] 
                    { recipe, '#', Block.sandStone, '|', Item.stick });
            ModLoader.addRecipe(new ItemStack(sandstoneSandstoneMachete), new Object[] 
                    { recipe, '#', Block.sandStone, '|', mod_InfiBase.sandstoneRod });
            ModLoader.addRecipe(new ItemStack(boneSandstoneMachete), new Object[] 
                    { recipe, '#', Block.sandStone, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneSandstoneMachete), new Object[] 
                    { recipe, '#', Block.sandStone, '|', mod_InfiBase.boneRod });      
            ModLoader.addRecipe(new ItemStack(netherrackSandstoneMachete), new Object[] 
                    { recipe, '#', Block.sandStone, '|', mod_InfiBase.netherrackRod });
            ModLoader.addRecipe(new ItemStack(iceSandstoneMachete), new Object[] 
                    { recipe, '#', Block.sandStone, '|', mod_InfiBase.iceRod });
            ModLoader.addRecipe(new ItemStack(slimeSandstoneMachete), new Object[] 
                    { recipe, '#', Block.sandStone, '|', mod_InfiBase.slimeRod });
            ModLoader.addRecipe(new ItemStack(cactusSandstoneMachete), new Object[] 
                    { recipe, '#', Block.sandStone, '|', mod_InfiBase.cactusRod });
            ModLoader.addRecipe(new ItemStack(flintSandstoneMachete), new Object[] 
                    { recipe, '#', Block.sandStone, '|', mod_InfiBase.flintRod });
        }
        
        if(PropsHelperInfiHybrids.enableBoneTools)
        {
            ModLoader.addRecipe(new ItemStack(woodBoneMachete), new Object[] 
                    { recipe, '#', Item.bone, '|', Item.stick });
            ModLoader.addRecipe(new ItemStack(stoneBoneMachete), new Object[] 
                    { recipe, '#', Item.bone, '|', mod_InfiBase.stoneRod });
            ModLoader.addRecipe(new ItemStack(sandstoneBoneMachete), new Object[] 
                    { recipe, '#', Item.bone, '|', mod_InfiBase.sandstoneRod });
            ModLoader.addRecipe(new ItemStack(boneBoneMachete), new Object[] 
                    { recipe, '#', Item.bone, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneBoneMachete), new Object[] 
                    { recipe, '#', Item.bone, '|', mod_InfiBase.boneRod });
            ModLoader.addRecipe(new ItemStack(paperBoneMachete), new Object[] 
                    { recipe, '#', Item.bone, '|', mod_InfiBase.paperRod });
            ModLoader.addRecipe(new ItemStack(netherrackBoneMachete), new Object[] 
                    { recipe, '#', Item.bone, '|', mod_InfiBase.netherrackRod });
            ModLoader.addRecipe(new ItemStack(iceBoneMachete), new Object[] 
                    { recipe, '#', Item.bone, '|', mod_InfiBase.iceRod });
            ModLoader.addRecipe(new ItemStack(cactusBoneMachete), new Object[] 
                    { recipe, '#', Item.bone, '|', mod_InfiBase.cactusRod });
            ModLoader.addRecipe(new ItemStack(flintBoneMachete), new Object[] 
                    { recipe, '#', Item.bone, '|', mod_InfiBase.flintRod });
        }
        
        if(PropsHelperInfiHybrids.enablePaperTools)
        {
            ModLoader.addRecipe(new ItemStack(woodPaperMachete), new Object[] 
                    { recipe, '#', mod_InfiBase.paperStack, '|', Item.stick });
            ModLoader.addRecipe(new ItemStack(bonePaperMachete), new Object[] 
                    { recipe, '#', mod_InfiBase.paperStack, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(bonePaperMachete), new Object[] 
                    { recipe, '#', mod_InfiBase.paperStack, '|', mod_InfiBase.boneRod });
            ModLoader.addRecipe(new ItemStack(paperPaperMachete), new Object[] 
                    { recipe, '#', mod_InfiBase.paperStack, '|', mod_InfiBase.paperRod });
            ModLoader.addRecipe(new ItemStack(slimePaperMachete), new Object[] 
                    { recipe, '#', mod_InfiBase.paperStack, '|', mod_InfiBase.slimeRod });
            ModLoader.addRecipe(new ItemStack(cactusPaperMachete), new Object[] 
                    { recipe, '#', mod_InfiBase.paperStack, '|', mod_InfiBase.cactusRod });
        }
        
        if(PropsHelperInfiHybrids.enableMossyTools)
        {
        	ModLoader.addRecipe(new ItemStack(woodMossyMachete), new Object[] 
                    { recipe, '#', mod_InfiBase.mossyStone, '|', Item.stick });
        	ModLoader.addRecipe(new ItemStack(stoneMossyMachete), new Object[] 
                    { recipe, '#', mod_InfiBase.mossyStone, '|', mod_InfiBase.stoneRod });
            ModLoader.addRecipe(new ItemStack(diamondMossyMachete), new Object[] 
                    { recipe, '#', mod_InfiBase.mossyStone, '|', mod_InfiBase.diamondRod });
            ModLoader.addRecipe(new ItemStack(redstoneMossyMachete), new Object[] 
                    { recipe, '#', mod_InfiBase.mossyStone, '|', mod_InfiBase.redstoneRod });
            ModLoader.addRecipe(new ItemStack(boneMossyMachete), new Object[] 
                    { recipe, '#', mod_InfiBase.mossyStone, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneMossyMachete), new Object[] 
                    { recipe, '#', mod_InfiBase.mossyStone, '|', mod_InfiBase.boneRod });
            ModLoader.addRecipe(new ItemStack(mossyMossyMachete), new Object[] 
                    { recipe, '#', mod_InfiBase.mossyStone, '|', mod_InfiBase.mossyRod });
            ModLoader.addRecipe(new ItemStack(netherrackMossyMachete), new Object[] 
                    { recipe, '#', mod_InfiBase.mossyStone, '|', mod_InfiBase.netherrackRod });
            ModLoader.addRecipe(new ItemStack(glowstoneMossyMachete), new Object[] 
                    { recipe, '#', mod_InfiBase.mossyStone, '|', mod_InfiBase.glowstoneRod });
            ModLoader.addRecipe(new ItemStack(cactusMossyMachete), new Object[] 
                    { recipe, '#', mod_InfiBase.mossyStone, '|', mod_InfiBase.cactusRod });
            ModLoader.addRecipe(new ItemStack(blazeMossyMachete), new Object[] 
                    { recipe, '#', mod_InfiBase.mossyStone, '|', Item.blazeRod });
            ModLoader.addRecipe(new ItemStack(manyullynMossyMachete), new Object[] 
                    { recipe, '#', mod_InfiBase.mossyStone, '|', mod_InfiBase.manyullynRod });
            ModLoader.addRecipe(new ItemStack(uraniumMossyMachete), new Object[] 
                    { recipe, '#', mod_InfiBase.mossyStone, '|', mod_InfiBase.uraniumRod });
        }
        
        if(PropsHelperInfiHybrids.enableNetherrackTools)
        {
        	ModLoader.addRecipe(new ItemStack(woodNetherrackMachete), new Object[] 
                    { recipe, '#', Block.netherrack, '|', Item.stick });
        	ModLoader.addRecipe(new ItemStack(stoneNetherrackMachete), new Object[] 
                    { recipe, '#', Block.netherrack, '|', mod_InfiBase.stoneRod });
            ModLoader.addRecipe(new ItemStack(sandstoneNetherrackMachete), new Object[] 
                    { recipe, '#', Block.netherrack, '|', mod_InfiBase.sandstoneRod });
            ModLoader.addRecipe(new ItemStack(boneNetherrackMachete), new Object[] 
                    { recipe, '#', Block.netherrack, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneNetherrackMachete), new Object[] 
                    { recipe, '#', Block.netherrack, '|', mod_InfiBase.boneRod });
            ModLoader.addRecipe(new ItemStack(paperNetherrackMachete), new Object[] 
                    { recipe, '#', Block.netherrack, '|', mod_InfiBase.paperRod });
            ModLoader.addRecipe(new ItemStack(mossyNetherrackMachete), new Object[] 
                    { recipe, '#', Block.netherrack, '|', mod_InfiBase.mossyRod });
            ModLoader.addRecipe(new ItemStack(netherrackNetherrackMachete), new Object[] 
                    { recipe, '#', Block.netherrack, '|', mod_InfiBase.netherrackRod });
            ModLoader.addRecipe(new ItemStack(iceNetherrackMachete), new Object[] 
                    { recipe, '#', Block.netherrack, '|', mod_InfiBase.iceRod });
            ModLoader.addRecipe(new ItemStack(slimeNetherrackMachete), new Object[] 
                    { recipe, '#', Block.netherrack, '|', mod_InfiBase.slimeRod });
            ModLoader.addRecipe(new ItemStack(cactusNetherrackMachete), new Object[] 
                    { recipe, '#', Block.netherrack, '|', mod_InfiBase.cactusRod });
            ModLoader.addRecipe(new ItemStack(flintNetherrackMachete), new Object[] 
                    { recipe, '#', Block.netherrack, '|', mod_InfiBase.flintRod });
            ModLoader.addRecipe(new ItemStack(copperNetherrackMachete), new Object[] 
                    { recipe, '#', Block.netherrack, '|', mod_InfiBase.copperRod });
            ModLoader.addRecipe(new ItemStack(bronzeNetherrackMachete), new Object[] 
                    { recipe, '#', Block.netherrack, '|', mod_InfiBase.bronzeRod });
        }
        
        if(PropsHelperInfiHybrids.enableGlowstoneTools)
        {
        	ModLoader.addRecipe(new ItemStack(woodGlowstoneMachete), new Object[] 
                    { recipe, '#', mod_InfiBase.glowstoneCrystal, '|', Item.stick });
        	ModLoader.addRecipe(new ItemStack(redstoneGlowstoneMachete), new Object[] 
                    { recipe, '#', mod_InfiBase.glowstoneCrystal, '|', mod_InfiBase.redstoneRod });
        	ModLoader.addRecipe(new ItemStack(obsidianGlowstoneMachete), new Object[] 
                    { recipe, '#', mod_InfiBase.glowstoneCrystal, '|', mod_InfiBase.obsidianRod });
            ModLoader.addRecipe(new ItemStack(boneGlowstoneMachete), new Object[] 
                    { recipe, '#', mod_InfiBase.glowstoneCrystal, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneGlowstoneMachete), new Object[] 
                    { recipe, '#', mod_InfiBase.glowstoneCrystal, '|', mod_InfiBase.boneRod });
            ModLoader.addRecipe(new ItemStack(netherrackGlowstoneMachete), new Object[] 
                    { recipe, '#', mod_InfiBase.glowstoneCrystal, '|', mod_InfiBase.netherrackRod });
            ModLoader.addRecipe(new ItemStack(glowstoneGlowstoneMachete), new Object[] 
                    { recipe, '#', mod_InfiBase.glowstoneCrystal, '|', mod_InfiBase.glowstoneRod });
            ModLoader.addRecipe(new ItemStack(iceGlowstoneMachete), new Object[] 
                    { recipe, '#', mod_InfiBase.glowstoneCrystal, '|', mod_InfiBase.iceRod });
            ModLoader.addRecipe(new ItemStack(slimeGlowstoneMachete), new Object[] 
                    { recipe, '#', mod_InfiBase.glowstoneCrystal, '|', mod_InfiBase.slimeRod });
            ModLoader.addRecipe(new ItemStack(cactusGlowstoneMachete), new Object[] 
                    { recipe, '#', mod_InfiBase.glowstoneCrystal, '|', mod_InfiBase.cactusRod });
        }
        
        if(PropsHelperInfiHybrids.enableIceTools)
        {
            ModLoader.addRecipe(new ItemStack(woodIceMachete), new Object[] 
                    { recipe, '#', Block.ice, '|', Item.stick });
            ModLoader.addRecipe(new ItemStack(boneIceMachete), new Object[] 
                    { recipe, '#', Block.ice, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneIceMachete), new Object[] 
                    { recipe, '#', Block.ice, '|', mod_InfiBase.boneRod });
            ModLoader.addRecipe(new ItemStack(paperIceMachete), new Object[] 
                    { recipe, '#', Block.ice, '|', mod_InfiBase.paperRod });
            ModLoader.addRecipe(new ItemStack(iceIceMachete), new Object[] 
                    { recipe, '#', Block.ice, '|', mod_InfiBase.iceRod });
            ModLoader.addRecipe(new ItemStack(slimeIceMachete), new Object[] 
                    { recipe, '#', Block.ice, '|', mod_InfiBase.slimeRod });
            ModLoader.addRecipe(new ItemStack(cactusIceMachete), new Object[] 
                    { recipe, '#', Block.ice, '|', mod_InfiBase.cactusRod });
        }
        
        if(PropsHelperInfiHybrids.enableLavaTools)
        {
            ModLoader.addRecipe(new ItemStack(diamondLavaMachete), new Object[] 
                    { recipe, '#', mod_InfiBase.lavaCrystal, '|', mod_InfiBase.diamondRod });
            ModLoader.addRecipe(new ItemStack(obsidianLavaMachete), new Object[] 
                    { recipe, '#', mod_InfiBase.lavaCrystal, '|', mod_InfiBase.obsidianRod });
            ModLoader.addRecipe(new ItemStack(netherrackLavaMachete), new Object[] 
                    { recipe, '#', mod_InfiBase.lavaCrystal, '|', mod_InfiBase.netherrackRod });
            ModLoader.addRecipe(new ItemStack(lavaLavaMachete), new Object[] 
                    { recipe, '#', mod_InfiBase.lavaCrystal, '|', mod_InfiBase.lavaRod });
            ModLoader.addRecipe(new ItemStack(flintLavaMachete), new Object[] 
                    { recipe, '#', mod_InfiBase.lavaCrystal, '|', mod_InfiBase.flintRod });
            ModLoader.addRecipe(new ItemStack(blazeLavaMachete), new Object[] 
                    { recipe, '#', mod_InfiBase.lavaCrystal, '|', Item.blazeRod });
            ModLoader.addRecipe(new ItemStack(manyullynLavaMachete), new Object[] 
                    { recipe, '#', mod_InfiBase.lavaCrystal, '|', mod_InfiBase.manyullynRod });
            ModLoader.addRecipe(new ItemStack(uraniumLavaMachete), new Object[] 
                    { recipe, '#', mod_InfiBase.lavaCrystal, '|', mod_InfiBase.uraniumRod });
        }
        
        if(PropsHelperInfiHybrids.enableSlimeTools)
        {
            ModLoader.addRecipe(new ItemStack(woodSlimeMachete), new Object[] 
                    { recipe, '#', mod_InfiBase.slimeCrystal, '|', Item.stick });
            ModLoader.addRecipe(new ItemStack(sandstoneSlimeMachete), new Object[] 
                    { recipe, '#', mod_InfiBase.slimeCrystal, '|', mod_InfiBase.sandstoneRod });
            ModLoader.addRecipe(new ItemStack(boneSlimeMachete), new Object[] 
                    { recipe, '#', mod_InfiBase.slimeCrystal, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneSlimeMachete), new Object[] 
                    { recipe, '#', mod_InfiBase.slimeCrystal, '|', mod_InfiBase.boneRod });
            ModLoader.addRecipe(new ItemStack(paperSlimeMachete), new Object[] 
                    { recipe, '#', mod_InfiBase.slimeCrystal, '|', mod_InfiBase.paperRod });
            ModLoader.addRecipe(new ItemStack(slimeSlimeMachete), new Object[] 
                    { recipe, '#', mod_InfiBase.slimeCrystal, '|', mod_InfiBase.slimeRod });
            ModLoader.addRecipe(new ItemStack(cactusSlimeMachete), new Object[] 
                    { recipe, '#', mod_InfiBase.slimeCrystal, '|', mod_InfiBase.cactusRod });
        }
        
        if(PropsHelperInfiHybrids.enableCactusTools)
        {
            ModLoader.addRecipe(new ItemStack(woodCactusMachete), new Object[] 
                    { recipe, '#', Block.cactus, '|', Item.stick });
            ModLoader.addRecipe(new ItemStack(sandstoneCactusMachete), new Object[] 
                    { recipe, '#', Block.cactus, '|', mod_InfiBase.sandstoneRod });
            ModLoader.addRecipe(new ItemStack(boneCactusMachete), new Object[] 
                    { recipe, '#', Block.cactus, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneCactusMachete), new Object[] 
                    { recipe, '#', Block.cactus, '|', mod_InfiBase.boneRod });
            ModLoader.addRecipe(new ItemStack(netherrackCactusMachete), new Object[] 
                    { recipe, '#', Block.cactus, '|', mod_InfiBase.netherrackRod });
            ModLoader.addRecipe(new ItemStack(iceCactusMachete), new Object[] 
                    { recipe, '#', Block.cactus, '|', mod_InfiBase.iceRod });
            ModLoader.addRecipe(new ItemStack(slimeCactusMachete), new Object[] 
                    { recipe, '#', Block.cactus, '|', mod_InfiBase.slimeRod });
            ModLoader.addRecipe(new ItemStack(cactusCactusMachete), new Object[] 
                    { recipe, '#', Block.cactus, '|', mod_InfiBase.cactusRod });
        }
        
        if(PropsHelperInfiHybrids.enableFlintTools)
        {
        	ModLoader.addRecipe(new ItemStack(woodFlintMachete), new Object[] 
                    { recipe, '#', Item.flint, '|', Item.stick });
        	ModLoader.addRecipe(new ItemStack(stoneFlintMachete), new Object[] 
                    { recipe, '#', Item.flint, '|', mod_InfiBase.stoneRod });
            ModLoader.addRecipe(new ItemStack(sandstoneFlintMachete), new Object[] 
                    { recipe, '#', Item.flint, '|', mod_InfiBase.sandstoneRod });
            ModLoader.addRecipe(new ItemStack(boneFlintMachete), new Object[] 
                    { recipe, '#', Item.flint, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneFlintMachete), new Object[] 
                    { recipe, '#', Item.flint, '|', mod_InfiBase.boneRod });
            ModLoader.addRecipe(new ItemStack(netherrackFlintMachete), new Object[] 
                    { recipe, '#', Item.flint, '|', mod_InfiBase.netherrackRod });
            ModLoader.addRecipe(new ItemStack(slimeFlintMachete), new Object[] 
                    { recipe, '#', Item.flint, '|', mod_InfiBase.slimeRod });
            ModLoader.addRecipe(new ItemStack(cactusFlintMachete), new Object[] 
                    { recipe, '#', Item.flint, '|', mod_InfiBase.cactusRod });
            ModLoader.addRecipe(new ItemStack(flintFlintMachete), new Object[] 
                    { recipe, '#', Item.flint, '|', mod_InfiBase.flintRod });
            ModLoader.addRecipe(new ItemStack(copperFlintMachete), new Object[] 
                    { recipe, '#', Item.flint, '|', mod_InfiBase.copperRod });
            ModLoader.addRecipe(new ItemStack(bronzeFlintMachete), new Object[] 
                    { recipe, '#', Item.flint, '|', mod_InfiBase.bronzeRod });
        }
        
        if(PropsHelperInfiHybrids.enableBlazeTools)
        {
            ModLoader.addRecipe(new ItemStack(diamondBlazeMachete), new Object[] 
                    { recipe, '#', mod_InfiBase.blazeCrystal, '|', mod_InfiBase.diamondRod });
            ModLoader.addRecipe(new ItemStack(obsidianBlazeMachete), new Object[] 
                    { recipe, '#', mod_InfiBase.blazeCrystal, '|', mod_InfiBase.obsidianRod });
            ModLoader.addRecipe(new ItemStack(netherrackBlazeMachete), new Object[] 
                    { recipe, '#', mod_InfiBase.blazeCrystal, '|', mod_InfiBase.netherrackRod });
            ModLoader.addRecipe(new ItemStack(lavaBlazeMachete), new Object[] 
                    { recipe, '#', mod_InfiBase.blazeCrystal, '|', mod_InfiBase.lavaRod });
            ModLoader.addRecipe(new ItemStack(flintBlazeMachete), new Object[] 
                    { recipe, '#', mod_InfiBase.blazeCrystal, '|', mod_InfiBase.flintRod });
            ModLoader.addRecipe(new ItemStack(blazeBlazeMachete), new Object[] 
                    { recipe, '#', mod_InfiBase.blazeCrystal, '|', Item.blazeRod });
            ModLoader.addRecipe(new ItemStack(manyullynBlazeMachete), new Object[] 
                    { recipe, '#', mod_InfiBase.blazeCrystal, '|', mod_InfiBase.manyullynRod });
            ModLoader.addRecipe(new ItemStack(uraniumBlazeMachete), new Object[] 
                    { recipe, '#', mod_InfiBase.blazeCrystal, '|', mod_InfiBase.uraniumRod });
        }
    }
    
    public static void addStoneTools(ItemStack stack)
    {
    	ModLoader.addRecipe(new ItemStack(woodStoneMachete), new Object[] 
                { recipe, '#', stack, '|', Item.stick });
    	ModLoader.addRecipe(new ItemStack(stoneStoneMachete), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.stoneRod });
        ModLoader.addRecipe(new ItemStack(sandstoneStoneMachete), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.sandstoneRod });
        ModLoader.addRecipe(new ItemStack(boneStoneMachete), new Object[] 
                { recipe, '#', stack, '|', Item.bone });
        ModLoader.addRecipe(new ItemStack(boneStoneMachete), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.boneRod });
        ModLoader.addRecipe(new ItemStack(netherrackStoneMachete), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.netherrackRod });
        ModLoader.addRecipe(new ItemStack(iceStoneMachete), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.iceRod });
        ModLoader.addRecipe(new ItemStack(slimeStoneMachete), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.slimeRod });
        ModLoader.addRecipe(new ItemStack(cactusStoneMachete), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.cactusRod });
        ModLoader.addRecipe(new ItemStack(flintStoneMachete), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.flintRod });
    }
    
    public static void addCopperTools(ItemStack stack)
    {
    	ModLoader.addRecipe(new ItemStack(woodCopperMachete), new Object[] 
                { recipe, '#', stack, '|', Item.stick });
        ModLoader.addRecipe(new ItemStack(stoneCopperMachete), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.stoneRod });
        ModLoader.addRecipe(new ItemStack(boneCopperMachete), new Object[] 
                { recipe, '#', stack, '|', Item.bone });
        ModLoader.addRecipe(new ItemStack(boneCopperMachete), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.boneRod });
        ModLoader.addRecipe(new ItemStack(netherrackCopperMachete), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.netherrackRod });
        ModLoader.addRecipe(new ItemStack(slimeCopperMachete), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.slimeRod });
        ModLoader.addRecipe(new ItemStack(cactusCopperMachete), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.cactusRod });
        ModLoader.addRecipe(new ItemStack(flintCopperMachete), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.flintRod });
        ModLoader.addRecipe(new ItemStack(copperCopperMachete), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.copperRod });
    }
    
    public static void addBronzeTools(ItemStack stack)
    {
    	ModLoader.addRecipe(new ItemStack(woodBronzeMachete), new Object[] 
                { recipe, '#', stack, '|', Item.stick });
        ModLoader.addRecipe(new ItemStack(stoneBronzeMachete), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.stoneRod });
        ModLoader.addRecipe(new ItemStack(boneBronzeMachete), new Object[] 
                { recipe, '#', stack, '|', Item.bone });
        ModLoader.addRecipe(new ItemStack(boneBronzeMachete), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.boneRod });
        ModLoader.addRecipe(new ItemStack(netherrackBronzeMachete), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.netherrackRod });
        ModLoader.addRecipe(new ItemStack(slimeBronzeMachete), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.slimeRod });
        ModLoader.addRecipe(new ItemStack(cactusBronzeMachete), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.cactusRod });
        ModLoader.addRecipe(new ItemStack(flintBronzeMachete), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.flintRod });
        ModLoader.addRecipe(new ItemStack(copperBronzeMachete), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.copperRod });
        ModLoader.addRecipe(new ItemStack(bronzeBronzeMachete), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.bronzeRod });
    }
    
    public static void addWorkedIronTools(ItemStack stack)
    {
    	ModLoader.addRecipe(new ItemStack(woodWorkedIronMachete), new Object[] 
                { recipe, '#', stack, '|', Item.stick });
        ModLoader.addRecipe(new ItemStack(stoneWorkedIronMachete), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.stoneRod });
        ModLoader.addRecipe(new ItemStack(ironWorkedIronMachete), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.ironRod });
        ModLoader.addRecipe(new ItemStack(diamondWorkedIronMachete), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.diamondRod });
        ModLoader.addRecipe(new ItemStack(redstoneWorkedIronMachete), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.redstoneRod });
        ModLoader.addRecipe(new ItemStack(obsidianWorkedIronMachete), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.obsidianRod });
        ModLoader.addRecipe(new ItemStack(boneWorkedIronMachete), new Object[] 
                { recipe, '#', stack, '|', Item.bone });
        ModLoader.addRecipe(new ItemStack(boneWorkedIronMachete), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.boneRod });
        ModLoader.addRecipe(new ItemStack(netherrackWorkedIronMachete), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.netherrackRod });
        ModLoader.addRecipe(new ItemStack(glowstoneWorkedIronMachete), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.glowstoneRod });
        ModLoader.addRecipe(new ItemStack(iceWorkedIronMachete), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.iceRod });
        ModLoader.addRecipe(new ItemStack(slimeWorkedIronMachete), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.slimeRod });
        ModLoader.addRecipe(new ItemStack(cactusWorkedIronMachete), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.cactusRod });
        ModLoader.addRecipe(new ItemStack(blazeWorkedIronMachete), new Object[] 
                { recipe, '#', stack, '|', Item.blazeRod });
        ModLoader.addRecipe(new ItemStack(copperWorkedIronMachete), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.copperRod });
        ModLoader.addRecipe(new ItemStack(bronzeWorkedIronMachete), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.bronzeRod });
        ModLoader.addRecipe(new ItemStack(workedWorkedIronMachete), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.workedIronRod });
        ModLoader.addRecipe(new ItemStack(steelWorkedIronMachete), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.steelRod });
        ModLoader.addRecipe(new ItemStack(uraniumWorkedIronMachete), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.uraniumRod });
    }
    
    public static void addSteelTools(ItemStack stack)
    {
    	ModLoader.addRecipe(new ItemStack(woodSteelMachete), new Object[] 
                { recipe, '#', stack, '|', Item.stick });
        ModLoader.addRecipe(new ItemStack(stoneSteelMachete), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.stoneRod });
        ModLoader.addRecipe(new ItemStack(ironSteelMachete), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.ironRod });
        ModLoader.addRecipe(new ItemStack(diamondSteelMachete), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.diamondRod });
        ModLoader.addRecipe(new ItemStack(redstoneSteelMachete), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.redstoneRod });
        ModLoader.addRecipe(new ItemStack(obsidianSteelMachete), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.obsidianRod });
        ModLoader.addRecipe(new ItemStack(boneSteelMachete), new Object[] 
                { recipe, '#', stack, '|', Item.bone });
        ModLoader.addRecipe(new ItemStack(boneSteelMachete), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.boneRod });
        ModLoader.addRecipe(new ItemStack(netherrackSteelMachete), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.netherrackRod });
        ModLoader.addRecipe(new ItemStack(glowstoneSteelMachete), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.glowstoneRod });
        ModLoader.addRecipe(new ItemStack(iceSteelMachete), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.iceRod });
        ModLoader.addRecipe(new ItemStack(slimeSteelMachete), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.slimeRod });
        ModLoader.addRecipe(new ItemStack(cactusSteelMachete), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.cactusRod });
        ModLoader.addRecipe(new ItemStack(blazeSteelMachete), new Object[] 
                { recipe, '#', stack, '|', Item.blazeRod });
        ModLoader.addRecipe(new ItemStack(copperSteelMachete), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.copperRod });
        ModLoader.addRecipe(new ItemStack(bronzeSteelMachete), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.bronzeRod });
        ModLoader.addRecipe(new ItemStack(workedSteelMachete), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.workedIronRod });
        ModLoader.addRecipe(new ItemStack(steelSteelMachete), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.steelRod });
        ModLoader.addRecipe(new ItemStack(cobaltSteelMachete), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.cobaltRod });
        ModLoader.addRecipe(new ItemStack(arditeSteelMachete), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.arditeRod });
        ModLoader.addRecipe(new ItemStack(uraniumSteelMachete), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.uraniumRod });
    }
    
    public static void addCobaltTools(ItemStack stack)
    {
    	ModLoader.addRecipe(new ItemStack(woodCobaltMachete), new Object[] 
                { recipe, '#', stack, '|', Item.stick });
        ModLoader.addRecipe(new ItemStack(stoneCobaltMachete), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.stoneRod });
        ModLoader.addRecipe(new ItemStack(ironCobaltMachete), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.ironRod });
        ModLoader.addRecipe(new ItemStack(diamondCobaltMachete), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.diamondRod });
        ModLoader.addRecipe(new ItemStack(redstoneCobaltMachete), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.redstoneRod });
        ModLoader.addRecipe(new ItemStack(obsidianCobaltMachete), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.obsidianRod });
        ModLoader.addRecipe(new ItemStack(boneCobaltMachete), new Object[] 
                { recipe, '#', stack, '|', Item.bone });
        ModLoader.addRecipe(new ItemStack(boneCobaltMachete), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.boneRod });
        ModLoader.addRecipe(new ItemStack(slimeCobaltMachete), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.slimeRod });
        ModLoader.addRecipe(new ItemStack(cactusCobaltMachete), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.cactusRod });
        ModLoader.addRecipe(new ItemStack(blazeCobaltMachete), new Object[] 
                { recipe, '#', stack, '|', Item.blazeRod });
        ModLoader.addRecipe(new ItemStack(copperCobaltMachete), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.copperRod });
        ModLoader.addRecipe(new ItemStack(bronzeCobaltMachete), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.bronzeRod });
        ModLoader.addRecipe(new ItemStack(workedCobaltMachete), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.workedIronRod });
        ModLoader.addRecipe(new ItemStack(steelCobaltMachete), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.steelRod });
        ModLoader.addRecipe(new ItemStack(cobaltCobaltMachete), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.cobaltRod });
        ModLoader.addRecipe(new ItemStack(arditeCobaltMachete), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.arditeRod });
        ModLoader.addRecipe(new ItemStack(manyullynCobaltMachete), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.manyullynRod });
        ModLoader.addRecipe(new ItemStack(uraniumCobaltMachete), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.uraniumRod });
    }
    
    public static void addArditeTools(ItemStack stack)
    {
    	ModLoader.addRecipe(new ItemStack(woodArditeMachete), new Object[] 
                { recipe, '#', stack, '|', Item.stick });
        ModLoader.addRecipe(new ItemStack(stoneArditeMachete), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.stoneRod });
        ModLoader.addRecipe(new ItemStack(ironArditeMachete), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.ironRod });
        ModLoader.addRecipe(new ItemStack(diamondArditeMachete), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.diamondRod });
        ModLoader.addRecipe(new ItemStack(redstoneArditeMachete), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.redstoneRod });
        ModLoader.addRecipe(new ItemStack(obsidianArditeMachete), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.obsidianRod });
        ModLoader.addRecipe(new ItemStack(boneArditeMachete), new Object[] 
                { recipe, '#', stack, '|', Item.bone });
        ModLoader.addRecipe(new ItemStack(boneArditeMachete), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.boneRod });
        ModLoader.addRecipe(new ItemStack(slimeArditeMachete), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.slimeRod });
        ModLoader.addRecipe(new ItemStack(cactusArditeMachete), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.cactusRod });
        ModLoader.addRecipe(new ItemStack(blazeArditeMachete), new Object[] 
                { recipe, '#', stack, '|', Item.blazeRod });
        ModLoader.addRecipe(new ItemStack(copperArditeMachete), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.copperRod });
        ModLoader.addRecipe(new ItemStack(bronzeArditeMachete), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.bronzeRod });
        ModLoader.addRecipe(new ItemStack(workedArditeMachete), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.workedIronRod });
        ModLoader.addRecipe(new ItemStack(steelArditeMachete), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.steelRod });
        ModLoader.addRecipe(new ItemStack(cobaltArditeMachete), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.cobaltRod });
        ModLoader.addRecipe(new ItemStack(arditeArditeMachete), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.arditeRod });
        ModLoader.addRecipe(new ItemStack(manyullynArditeMachete), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.manyullynRod });
        ModLoader.addRecipe(new ItemStack(uraniumArditeMachete), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.uraniumRod });
    }
    
    public static void addManyullynTools(ItemStack stack)
    {
    	ModLoader.addRecipe(new ItemStack(woodManyullynMachete), new Object[] 
                { recipe, '#', stack, '|', Item.stick });
        ModLoader.addRecipe(new ItemStack(stoneManyullynMachete), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.stoneRod });
        ModLoader.addRecipe(new ItemStack(ironManyullynMachete), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.ironRod });
        ModLoader.addRecipe(new ItemStack(diamondManyullynMachete), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.diamondRod });
        ModLoader.addRecipe(new ItemStack(redstoneManyullynMachete), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.redstoneRod });
        ModLoader.addRecipe(new ItemStack(obsidianManyullynMachete), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.obsidianRod });
        ModLoader.addRecipe(new ItemStack(boneManyullynMachete), new Object[] 
                { recipe, '#', stack, '|', Item.bone });
        ModLoader.addRecipe(new ItemStack(boneManyullynMachete), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.boneRod });
        ModLoader.addRecipe(new ItemStack(slimeManyullynMachete), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.slimeRod });
        ModLoader.addRecipe(new ItemStack(cactusManyullynMachete), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.cactusRod });
        ModLoader.addRecipe(new ItemStack(blazeManyullynMachete), new Object[] 
                { recipe, '#', stack, '|', Item.blazeRod });
        ModLoader.addRecipe(new ItemStack(copperManyullynMachete), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.copperRod });
        ModLoader.addRecipe(new ItemStack(bronzeManyullynMachete), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.bronzeRod });
        ModLoader.addRecipe(new ItemStack(workedManyullynMachete), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.workedIronRod });
        ModLoader.addRecipe(new ItemStack(steelManyullynMachete), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.steelRod });
        ModLoader.addRecipe(new ItemStack(cobaltManyullynMachete), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.cobaltRod });
        ModLoader.addRecipe(new ItemStack(arditeManyullynMachete), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.arditeRod });
        ModLoader.addRecipe(new ItemStack(manyullynManyullynMachete), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.manyullynRod });
        ModLoader.addRecipe(new ItemStack(uraniumManyullynMachete), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.uraniumRod });
    }
    
    public static void addUraniumTools(ItemStack stack)
    {
        ModLoader.addRecipe(new ItemStack(diamondUraniumMachete), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.diamondRod });
        ModLoader.addRecipe(new ItemStack(redstoneUraniumMachete), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.redstoneRod });
        ModLoader.addRecipe(new ItemStack(boneUraniumMachete), new Object[] 
                { recipe, '#', stack, '|', Item.bone });
        ModLoader.addRecipe(new ItemStack(boneUraniumMachete), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.boneRod });
        ModLoader.addRecipe(new ItemStack(netherrackUraniumMachete), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.netherrackRod });
        ModLoader.addRecipe(new ItemStack(glowstoneUraniumMachete), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.glowstoneRod });
        ModLoader.addRecipe(new ItemStack(lavaUraniumMachete), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.lavaRod });
        ModLoader.addRecipe(new ItemStack(blazeUraniumMachete), new Object[] 
                { recipe, '#', stack, '|', Item.blazeRod });
        ModLoader.addRecipe(new ItemStack(cobaltUraniumMachete), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.cobaltRod });
        ModLoader.addRecipe(new ItemStack(arditeUraniumMachete), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.arditeRod });
        ModLoader.addRecipe(new ItemStack(uraniumUraniumMachete), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.uraniumRod });
    }
    
	public static Item woodWoodMachete;
	public static Item sandstoneWoodMachete;
	public static Item boneWoodMachete;
	public static Item paperWoodMachete;
	public static Item iceWoodMachete;
	public static Item slimeWoodMachete;
	public static Item cactusWoodMachete;
	
	public static Item woodStoneMachete;
	public static Item stoneStoneMachete;
	public static Item sandstoneStoneMachete;
	public static Item boneStoneMachete;
	public static Item netherrackStoneMachete;
	public static Item iceStoneMachete;
	public static Item slimeStoneMachete;
	public static Item cactusStoneMachete;
	public static Item flintStoneMachete;
	
	public static Item woodIronMachete;
	public static Item stoneIronMachete;
	public static Item ironIronMachete;
	public static Item boneIronMachete;
	public static Item netherrackIronMachete;
	public static Item glowstoneIronMachete;
	public static Item cactusIronMachete;
	public static Item copperIronMachete;
	public static Item bronzeIronMachete;
	
	public static Item woodDiamondMachete;
	public static Item stoneDiamondMachete;
	public static Item ironDiamondMachete;
	public static Item diamondDiamondMachete;
	public static Item redstoneDiamondMachete;
	public static Item obsidianDiamondMachete;
	public static Item boneDiamondMachete;
	public static Item mossyDiamondMachete;
	public static Item netherrackDiamondMachete;
	public static Item glowstoneDiamondMachete;
	public static Item lavaDiamondMachete;
	public static Item cactusDiamondMachete;
	public static Item flintDiamondMachete;
	public static Item blazeDiamondMachete;
	public static Item copperDiamondMachete;
	public static Item bronzeDiamondMachete;
	public static Item workedDiamondMachete;
	public static Item steelDiamondMachete;
	public static Item cobaltDiamondMachete;
	public static Item arditeDiamondMachete;
	public static Item manyullynDiamondMachete;
	public static Item uraniumDiamondMachete;
	
	public static Item woodRedstoneMachete;
	public static Item stoneRedstoneMachete;
	public static Item ironRedstoneMachete;
	public static Item redstoneRedstoneMachete;
	public static Item obsidianRedstoneMachete;
	public static Item sandstoneRedstoneMachete;
	public static Item boneRedstoneMachete;
	public static Item paperRedstoneMachete;
	public static Item mossyRedstoneMachete;
	public static Item netherrackRedstoneMachete;
	public static Item glowstoneRedstoneMachete;
	public static Item iceRedstoneMachete;
	public static Item lavaRedstoneMachete;
	public static Item slimeRedstoneMachete;
	public static Item cactusRedstoneMachete;
	public static Item flintRedstoneMachete;
	public static Item copperRedstoneMachete;
	public static Item bronzeRedstoneMachete;
	public static Item workedRedstoneMachete;
	public static Item uraniumRedstoneMachete;
	
	public static Item woodObsidianMachete;
	public static Item stoneObsidianMachete;
	public static Item redstoneObsidianMachete;
	public static Item obsidianObsidianMachete;
	public static Item boneObsidianMachete;
	public static Item netherrackObsidianMachete;
	public static Item glowstoneObsidianMachete;
	public static Item iceObsidianMachete;
	public static Item lavaObsidianMachete;
	public static Item cactusObsidianMachete;
	
	public static Item woodSandstoneMachete;
	public static Item sandstoneSandstoneMachete;
	public static Item boneSandstoneMachete;
	public static Item netherrackSandstoneMachete;
	public static Item iceSandstoneMachete;
	public static Item slimeSandstoneMachete;
	public static Item cactusSandstoneMachete;
	public static Item flintSandstoneMachete;
	
	public static Item woodBoneMachete;
	public static Item stoneBoneMachete;
	public static Item sandstoneBoneMachete;
	public static Item boneBoneMachete;
	public static Item paperBoneMachete;
	public static Item netherrackBoneMachete;
	public static Item iceBoneMachete;
	public static Item cactusBoneMachete;
	public static Item flintBoneMachete;
	
	public static Item woodPaperMachete;
	public static Item bonePaperMachete;
	public static Item paperPaperMachete;
	public static Item slimePaperMachete;
	public static Item cactusPaperMachete;
	
	public static Item woodMossyMachete;
	public static Item stoneMossyMachete;
	public static Item diamondMossyMachete;
	public static Item redstoneMossyMachete;
	public static Item boneMossyMachete;
	public static Item mossyMossyMachete;
	public static Item netherrackMossyMachete;
	public static Item glowstoneMossyMachete;
	public static Item cactusMossyMachete;
	public static Item blazeMossyMachete;
	public static Item manyullynMossyMachete;
	public static Item uraniumMossyMachete;
	
	public static Item woodNetherrackMachete;
	public static Item stoneNetherrackMachete;
	public static Item sandstoneNetherrackMachete;
	public static Item boneNetherrackMachete;
	public static Item paperNetherrackMachete;
	public static Item mossyNetherrackMachete;
	public static Item netherrackNetherrackMachete;
	public static Item iceNetherrackMachete;
	public static Item slimeNetherrackMachete;
	public static Item cactusNetherrackMachete;
	public static Item flintNetherrackMachete;
	public static Item copperNetherrackMachete;
	public static Item bronzeNetherrackMachete;
	
	public static Item woodGlowstoneMachete;
	public static Item redstoneGlowstoneMachete;
	public static Item obsidianGlowstoneMachete;
	public static Item boneGlowstoneMachete;
	public static Item netherrackGlowstoneMachete;
	public static Item glowstoneGlowstoneMachete;
	public static Item iceGlowstoneMachete;
	public static Item slimeGlowstoneMachete;
	public static Item cactusGlowstoneMachete;
	
	public static Item woodIceMachete;
	public static Item boneIceMachete;
	public static Item paperIceMachete;
	public static Item iceIceMachete;
	public static Item slimeIceMachete;
	public static Item cactusIceMachete;
	
	public static Item diamondLavaMachete;
	public static Item obsidianLavaMachete;
	public static Item netherrackLavaMachete;
	public static Item lavaLavaMachete;
	public static Item flintLavaMachete;
	public static Item blazeLavaMachete;
	public static Item manyullynLavaMachete;
	public static Item uraniumLavaMachete;
	
	public static Item woodSlimeMachete;
	public static Item sandstoneSlimeMachete;
	public static Item boneSlimeMachete;
	public static Item paperSlimeMachete;
	public static Item slimeSlimeMachete;
	public static Item cactusSlimeMachete;
	
	public static Item woodCactusMachete;
	public static Item sandstoneCactusMachete;
	public static Item boneCactusMachete;
	public static Item netherrackCactusMachete;
	public static Item iceCactusMachete;
	public static Item slimeCactusMachete;
	public static Item cactusCactusMachete;
	
	public static Item woodFlintMachete;
	public static Item stoneFlintMachete;
	public static Item sandstoneFlintMachete;
	public static Item boneFlintMachete;
	public static Item netherrackFlintMachete;
	public static Item slimeFlintMachete;
	public static Item cactusFlintMachete;
	public static Item flintFlintMachete;
	public static Item copperFlintMachete;
	public static Item bronzeFlintMachete;
	
	public static Item diamondBlazeMachete;
	public static Item obsidianBlazeMachete;
	public static Item netherrackBlazeMachete;
	public static Item lavaBlazeMachete;
	public static Item flintBlazeMachete;
	public static Item blazeBlazeMachete;
	public static Item manyullynBlazeMachete;
	public static Item uraniumBlazeMachete;
	
	public static Item woodCopperMachete;
	public static Item stoneCopperMachete;
    public static Item boneCopperMachete;
    public static Item netherrackCopperMachete;
    public static Item slimeCopperMachete;
    public static Item cactusCopperMachete;
    public static Item flintCopperMachete;
    public static Item copperCopperMachete;
    
    public static Item woodBronzeMachete;
    public static Item stoneBronzeMachete;
    public static Item boneBronzeMachete;
    public static Item netherrackBronzeMachete;
    public static Item slimeBronzeMachete;
    public static Item cactusBronzeMachete;
    public static Item flintBronzeMachete;
    public static Item copperBronzeMachete;
    public static Item bronzeBronzeMachete;
    
    public static Item woodWorkedIronMachete;
    public static Item stoneWorkedIronMachete;
    public static Item ironWorkedIronMachete;
    public static Item diamondWorkedIronMachete;
    public static Item redstoneWorkedIronMachete;
    public static Item obsidianWorkedIronMachete;
    public static Item boneWorkedIronMachete;
    public static Item netherrackWorkedIronMachete;
    public static Item glowstoneWorkedIronMachete;
    public static Item iceWorkedIronMachete;
    public static Item slimeWorkedIronMachete;
    public static Item cactusWorkedIronMachete;
    public static Item blazeWorkedIronMachete;
    public static Item copperWorkedIronMachete;
    public static Item bronzeWorkedIronMachete;
    public static Item workedWorkedIronMachete;
    public static Item steelWorkedIronMachete;
    public static Item uraniumWorkedIronMachete;
    
    public static Item woodSteelMachete;
    public static Item stoneSteelMachete;
    public static Item ironSteelMachete;
    public static Item diamondSteelMachete;
    public static Item redstoneSteelMachete;
    public static Item obsidianSteelMachete;
    public static Item boneSteelMachete;
    public static Item netherrackSteelMachete;
    public static Item glowstoneSteelMachete;
    public static Item iceSteelMachete;
    public static Item slimeSteelMachete;
    public static Item cactusSteelMachete;
    public static Item blazeSteelMachete;
    public static Item copperSteelMachete;
    public static Item bronzeSteelMachete;
    public static Item workedSteelMachete;
    public static Item steelSteelMachete;
    public static Item cobaltSteelMachete;
    public static Item arditeSteelMachete;
    public static Item uraniumSteelMachete;
    
    public static Item woodCobaltMachete;
    public static Item stoneCobaltMachete;
    public static Item ironCobaltMachete;
    public static Item diamondCobaltMachete;
    public static Item redstoneCobaltMachete;
    public static Item obsidianCobaltMachete;
    public static Item boneCobaltMachete;
    public static Item slimeCobaltMachete;
    public static Item cactusCobaltMachete;
    public static Item blazeCobaltMachete;
    public static Item copperCobaltMachete;
    public static Item bronzeCobaltMachete;
    public static Item workedCobaltMachete;
    public static Item steelCobaltMachete;
    public static Item cobaltCobaltMachete;
    public static Item arditeCobaltMachete;
    public static Item manyullynCobaltMachete;
    public static Item uraniumCobaltMachete;
    
    public static Item woodArditeMachete;
    public static Item stoneArditeMachete;
    public static Item ironArditeMachete;
    public static Item diamondArditeMachete;
    public static Item redstoneArditeMachete;
    public static Item obsidianArditeMachete;
    public static Item boneArditeMachete;
    public static Item slimeArditeMachete;
    public static Item cactusArditeMachete;
    public static Item blazeArditeMachete;
    public static Item copperArditeMachete;
    public static Item bronzeArditeMachete;
    public static Item workedArditeMachete;
    public static Item steelArditeMachete;
    public static Item cobaltArditeMachete;
    public static Item arditeArditeMachete;
    public static Item manyullynArditeMachete;
    public static Item uraniumArditeMachete;
    
    public static Item woodManyullynMachete;
    public static Item stoneManyullynMachete;
    public static Item ironManyullynMachete;
    public static Item diamondManyullynMachete;
    public static Item redstoneManyullynMachete;
    public static Item obsidianManyullynMachete;
    public static Item boneManyullynMachete;
    public static Item slimeManyullynMachete;
    public static Item cactusManyullynMachete;
    public static Item blazeManyullynMachete;
    public static Item copperManyullynMachete;
    public static Item bronzeManyullynMachete;
    public static Item workedManyullynMachete;
    public static Item steelManyullynMachete;
    public static Item cobaltManyullynMachete;
    public static Item arditeManyullynMachete;
    public static Item manyullynManyullynMachete;
    public static Item uraniumManyullynMachete;
    
    public static Item diamondUraniumMachete;
    public static Item redstoneUraniumMachete;
    public static Item boneUraniumMachete;
    public static Item netherrackUraniumMachete;
    public static Item glowstoneUraniumMachete;
    public static Item lavaUraniumMachete;
    public static Item blazeUraniumMachete;
    public static Item cobaltUraniumMachete;
    public static Item arditeUraniumMachete;
    public static Item uraniumUraniumMachete;
}
