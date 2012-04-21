package net.minecraft.src.inficore;
import net.minecraft.src.Block;
import net.minecraft.src.InfiMaterialEnum;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;
import net.minecraft.src.ModLoader;
import net.minecraft.src.mod_InfiBase;
import net.minecraft.src.forge.MinecraftForge;

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
        createTools();
        addNames();
        registerInfiToolsRecipes();
    }
    
    private static void createTools()
    {
    	if(PropsHelperInfiTools.enableWoodTools)
    	{
    		woodWoodSword = new InfiToolSword(12, 
                    InfiMaterialEnum.Wood, InfiMaterialEnum.Wood, "woodWoodSword");
    		sandstoneWoodSword = new InfiToolSword(PropsHelperInfiTools.woodSwordID+1, 
                    InfiMaterialEnum.Wood, InfiMaterialEnum.Sandstone, "sandstoneWoodSword");
    		boneWoodSword = new InfiToolSword(PropsHelperInfiTools.woodSwordID+2, 
                    InfiMaterialEnum.Wood, InfiMaterialEnum.Bone, "boneWoodSword");
    		paperWoodSword = new InfiToolSword(PropsHelperInfiTools.woodSwordID+3, 
                    InfiMaterialEnum.Wood, InfiMaterialEnum.Paper, "paperWoodSword");
    		iceWoodSword = new InfiToolSword(PropsHelperInfiTools.woodSwordID+4, 
                    InfiMaterialEnum.Wood, InfiMaterialEnum.Ice, "iceWoodSword");
    		slimeWoodSword = new InfiToolSword(PropsHelperInfiTools.woodSwordID+5, 
                    InfiMaterialEnum.Wood, InfiMaterialEnum.Slime, "slimeWoodSword");
    		cactusWoodSword = new InfiToolSword(PropsHelperInfiTools.woodSwordID+6, 
                    InfiMaterialEnum.Wood, InfiMaterialEnum.Cactus, "cactusWoodSword");
    	}

        if(PropsHelperInfiTools.enableStoneTools)
        {
        	woodStoneSword = new InfiToolSword(16, 
                    InfiMaterialEnum.Stone, InfiMaterialEnum.Wood, "woodStoneSword");
        	stoneStoneSword = new InfiToolSword(PropsHelperInfiTools.stoneSwordID+1, 
                    InfiMaterialEnum.Stone, InfiMaterialEnum.Stone, "stoneStoneSword");
        	sandstoneStoneSword = new InfiToolSword(PropsHelperInfiTools.stoneSwordID+2, 
                    InfiMaterialEnum.Stone, InfiMaterialEnum.Sandstone, "sandstoneStoneSword");
        	boneStoneSword = new InfiToolSword(PropsHelperInfiTools.stoneSwordID+3, 
                    InfiMaterialEnum.Stone, InfiMaterialEnum.Bone, "boneStoneSword");
        	netherrackStoneSword = new InfiToolSword(PropsHelperInfiTools.stoneSwordID+4, 
                    InfiMaterialEnum.Stone, InfiMaterialEnum.Netherrack, "netherrackStoneSword");
        	iceStoneSword = new InfiToolSword(PropsHelperInfiTools.stoneSwordID+5, 
                    InfiMaterialEnum.Stone, InfiMaterialEnum.Ice, "iceStoneSword");
        	slimeStoneSword = new InfiToolSword(PropsHelperInfiTools.stoneSwordID+6, 
                    InfiMaterialEnum.Stone, InfiMaterialEnum.Slime, "slimeStoneSword");
        	cactusStoneSword = new InfiToolSword(PropsHelperInfiTools.stoneSwordID+7, 
                    InfiMaterialEnum.Stone, InfiMaterialEnum.Cactus, "cactusStoneSword");
        	flintStoneSword = new InfiToolSword(PropsHelperInfiTools.stoneSwordID+8, 
                    InfiMaterialEnum.Stone, InfiMaterialEnum.Flint, "flintStoneSword");
        }
        
        if(PropsHelperInfiTools.enableIronTools)
        {
        	woodIronSword = new InfiToolSword(11, 
                    InfiMaterialEnum.Iron, InfiMaterialEnum.Wood, "woodIronSword");
        	stoneIronSword = new InfiToolSword(PropsHelperInfiTools.ironSwordID+1, 
                    InfiMaterialEnum.Iron, InfiMaterialEnum.Stone, "stoneIronSword");
        	ironIronSword = new InfiToolSword(PropsHelperInfiTools.ironSwordID+2, 
                    InfiMaterialEnum.Iron, InfiMaterialEnum.Iron, "ironIronSword");
        	boneIronSword = new InfiToolSword(PropsHelperInfiTools.ironSwordID+3, 
                    InfiMaterialEnum.Iron, InfiMaterialEnum.Bone, "boneIronSword");
        	netherrackIronSword = new InfiToolSword(PropsHelperInfiTools.ironSwordID+4, 
                    InfiMaterialEnum.Iron, InfiMaterialEnum.Netherrack, "netherrackIronSword");
        	glowstoneIronSword = new InfiToolSword(PropsHelperInfiTools.ironSwordID+5, 
                    InfiMaterialEnum.Iron, InfiMaterialEnum.Glowstone, "glowstoneIronSword");
        	cactusIronSword = new InfiToolSword(PropsHelperInfiTools.ironSwordID+6, 
                    InfiMaterialEnum.Iron, InfiMaterialEnum.Cactus, "cactusIronSword");
        	copperIronSword = new InfiToolSword(PropsHelperInfiTools.ironSwordID+7, 
                    InfiMaterialEnum.Iron, InfiMaterialEnum.Copper, "copperIronSword");
        	bronzeIronSword = new InfiToolSword(PropsHelperInfiTools.ironSwordID+8, 
                    InfiMaterialEnum.Iron, InfiMaterialEnum.Bronze, "bronzeIronSword");
        }
        
        if(PropsHelperInfiTools.enableDiamondTools)
        {
        	woodDiamondSword = new InfiToolSword(20, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Wood, "woodDiamondSword");
        	stoneDiamondSword = new InfiToolSword(PropsHelperInfiTools.diamondSwordID+1, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Stone, "stoneDiamondSword");
        	ironDiamondSword = new InfiToolSword(PropsHelperInfiTools.diamondSwordID+2, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Iron, "ironDiamondSword");
        	diamondDiamondSword = new InfiToolSword(PropsHelperInfiTools.diamondSwordID+3, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Diamond, "diamondDiamondSword");
        	redstoneDiamondSword = new InfiToolSword(PropsHelperInfiTools.diamondSwordID+4, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Redstone, "redstoneDiamondSword");
        	obsidianDiamondSword = new InfiToolSword(PropsHelperInfiTools.diamondSwordID+5, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Obsidian, "obsidianDiamondSword");
        	boneDiamondSword = new InfiToolSword(PropsHelperInfiTools.diamondSwordID+6, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Bone, "boneDiamondSword");
        	mossyDiamondSword = new InfiToolSword(PropsHelperInfiTools.diamondSwordID+7, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Mossy, "mossyDiamondSword");
        	netherrackDiamondSword = new InfiToolSword(PropsHelperInfiTools.diamondSwordID+8, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Netherrack, "netherrackDiamondSword");
        	glowstoneDiamondSword = new InfiToolSword(PropsHelperInfiTools.diamondSwordID+9, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Glowstone, "glowstoneDiamondSword");
        	lavaDiamondSword = new InfiToolSword(PropsHelperInfiTools.diamondSwordID+10, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Lava, "lavaDiamondSword");
        	cactusDiamondSword = new InfiToolSword(PropsHelperInfiTools.diamondSwordID+11, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Cactus, "cactusDiamondSword");
        	flintDiamondSword = new InfiToolSword(PropsHelperInfiTools.diamondSwordID+12, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Flint, "flintDiamondSword");
        	blazeDiamondSword = new InfiToolSword(PropsHelperInfiTools.diamondSwordID+13, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Blaze, "blazeDiamondSword");
            copperDiamondSword = new InfiToolSword(PropsHelperInfiTools.diamondSwordID+14, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Copper, "copperDiamondSword");
            bronzeDiamondSword = new InfiToolSword(PropsHelperInfiTools.diamondSwordID+15, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Bronze, "bronzeDiamondSword");
            workedDiamondSword = new InfiToolSword(PropsHelperInfiTools.diamondSwordID+16, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.WorkedIron, "workedDiamondSword");
            steelDiamondSword = new InfiToolSword(PropsHelperInfiTools.diamondSwordID+17, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Steel, "steelDiamondSword");
            cobaltDiamondSword = new InfiToolSword(PropsHelperInfiTools.diamondSwordID+18, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Cobalt, "cobaltDiamondSword");
            arditeDiamondSword = new InfiToolSword(PropsHelperInfiTools.diamondSwordID+19, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Ardite, "arditeDiamondSword");
            manyullynDiamondSword = new InfiToolSword(PropsHelperInfiTools.diamondSwordID+20, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Manyullyn, "manyullynDiamondSword");
            uraniumDiamondSword = new InfiToolSword(PropsHelperInfiTools.diamondSwordID+21, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Uranium, "uraniumDiamondSword");
        }
        
        if(PropsHelperInfiTools.enableRedstoneTools)
        {
        	woodRedstoneSword = new InfiToolSword(PropsHelperInfiTools.redstoneSwordID+0, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Wood, "woodRedstoneSword");
        	stoneRedstoneSword = new InfiToolSword(PropsHelperInfiTools.redstoneSwordID+1, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Stone, "stoneRedstoneSword");
        	ironRedstoneSword = new InfiToolSword(PropsHelperInfiTools.redstoneSwordID+2, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Iron, "ironRedstoneSword");
        	redstoneRedstoneSword = new InfiToolSword(PropsHelperInfiTools.redstoneSwordID+3, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Redstone, "redstoneRedstoneSword");
        	obsidianRedstoneSword = new InfiToolSword(PropsHelperInfiTools.redstoneSwordID+4, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Obsidian, "obsidianRedstoneSword");
        	sandstoneRedstoneSword = new InfiToolSword(PropsHelperInfiTools.redstoneSwordID+5, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Sandstone, "sandstoneRedstoneSword");
        	boneRedstoneSword = new InfiToolSword(PropsHelperInfiTools.redstoneSwordID+6, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Bone, "boneRedstoneSword");
        	paperRedstoneSword = new InfiToolSword(PropsHelperInfiTools.redstoneSwordID+7, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Paper, "paperRedstoneSword");
        	mossyRedstoneSword = new InfiToolSword(PropsHelperInfiTools.redstoneSwordID+8, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Mossy, "mossyRedstoneSword");
        	netherrackRedstoneSword = new InfiToolSword(PropsHelperInfiTools.redstoneSwordID+9, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Netherrack, "netherrackRedstoneSword");
        	glowstoneRedstoneSword = new InfiToolSword(PropsHelperInfiTools.redstoneSwordID+10, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Glowstone, "glowstoneRedstoneSword");
        	iceRedstoneSword = new InfiToolSword(PropsHelperInfiTools.redstoneSwordID+11, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Ice, "iceRedstoneSword");
        	lavaRedstoneSword = new InfiToolSword(PropsHelperInfiTools.redstoneSwordID+12,
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Lava, "lavaRedstoneSword");
        	slimeRedstoneSword = new InfiToolSword(PropsHelperInfiTools.redstoneSwordID+13,
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Slime, "slimeRedstoneSword");
        	cactusRedstoneSword = new InfiToolSword(PropsHelperInfiTools.redstoneSwordID+14,
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Cactus, "cactusRedstoneSword");
        	flintRedstoneSword = new InfiToolSword(PropsHelperInfiTools.redstoneSwordID+15,
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Flint, "flintRedstoneSword");
        	copperRedstoneSword = new InfiToolSword(PropsHelperInfiTools.redstoneSwordID+16,
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Copper, "copperRedstoneSword");
        	bronzeRedstoneSword = new InfiToolSword(PropsHelperInfiTools.redstoneSwordID+17,
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Bronze, "bronzeRedstoneSword");
        	workedRedstoneSword = new InfiToolSword(PropsHelperInfiTools.redstoneSwordID+18,
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.WorkedIron, "workedRedstoneSword");
        	uraniumRedstoneSword = new InfiToolSword(PropsHelperInfiTools.redstoneSwordID+19,
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Uranium, "uraniumRedstoneSword");
        }
        
        if(PropsHelperInfiTools.enableObsidianTools)
        {
        	woodObsidianSword = new InfiToolSword(PropsHelperInfiTools.obsidianSwordID+0, 
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Wood, "woodObsidianSword");
        	stoneObsidianSword = new InfiToolSword(PropsHelperInfiTools.obsidianSwordID+1, 
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Stone, "stoneObsidianSword");
        	redstoneObsidianSword = new InfiToolSword(PropsHelperInfiTools.obsidianSwordID+2, 
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Redstone, "redstoneObsidianSword");
        	obsidianObsidianSword = new InfiToolSword(PropsHelperInfiTools.obsidianSwordID+3, 
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Obsidian, "obsidianObsidianSword");;
        	boneObsidianSword = new InfiToolSword(PropsHelperInfiTools.obsidianSwordID+4, 
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Bone, "boneObsidianSword");
        	netherrackObsidianSword = new InfiToolSword(PropsHelperInfiTools.obsidianSwordID+5, 
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Netherrack, "netherrackObsidianSword");
        	glowstoneObsidianSword = new InfiToolSword(PropsHelperInfiTools.obsidianSwordID+6, 
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Glowstone, "glowstoneObsidianSword");
        	iceObsidianSword = new InfiToolSword(PropsHelperInfiTools.obsidianSwordID+7, 
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Ice, "iceObsidianSword");
        	lavaObsidianSword = new InfiToolSword(PropsHelperInfiTools.obsidianSwordID+8,
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Lava, "lavaObsidianSword");
        	cactusObsidianSword = new InfiToolSword(PropsHelperInfiTools.obsidianSwordID+9,
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Cactus, "cactusObsidianSword");
        }
        
        if(PropsHelperInfiTools.enableSandstoneTools)
        {
        	woodSandstoneSword = new InfiToolSword(PropsHelperInfiTools.sandstoneSwordID+0, 
                    InfiMaterialEnum.Sandstone, InfiMaterialEnum.Wood, "woodSandstoneSword");
        	sandstoneSandstoneSword = new InfiToolSword(PropsHelperInfiTools.sandstoneSwordID+1, 
                    InfiMaterialEnum.Sandstone, InfiMaterialEnum.Sandstone, "sandstoneSandstoneSword");
        	boneSandstoneSword = new InfiToolSword(PropsHelperInfiTools.sandstoneSwordID+2, 
                    InfiMaterialEnum.Sandstone, InfiMaterialEnum.Bone, "boneSandstoneSword");
        	netherrackSandstoneSword = new InfiToolSword(PropsHelperInfiTools.sandstoneSwordID+3, 
                    InfiMaterialEnum.Sandstone, InfiMaterialEnum.Netherrack, "netherrackSandstoneSword");
        	iceSandstoneSword = new InfiToolSword(PropsHelperInfiTools.sandstoneSwordID+4, 
                    InfiMaterialEnum.Sandstone, InfiMaterialEnum.Ice, "iceSandstoneSword");
        	slimeSandstoneSword = new InfiToolSword(PropsHelperInfiTools.sandstoneSwordID+5,
                    InfiMaterialEnum.Sandstone, InfiMaterialEnum.Slime, "slimeSandstoneSword");
        	cactusSandstoneSword = new InfiToolSword(PropsHelperInfiTools.sandstoneSwordID+6,
                    InfiMaterialEnum.Sandstone, InfiMaterialEnum.Cactus, "cactusSandstoneSword");
        	flintSandstoneSword = new InfiToolSword(PropsHelperInfiTools.sandstoneSwordID+7,
                    InfiMaterialEnum.Sandstone, InfiMaterialEnum.Flint, "flintSandstoneSword");
        }
        
        if(PropsHelperInfiTools.enableBoneTools)
        {
        	woodBoneSword = new InfiToolSword(PropsHelperInfiTools.boneSwordID+0, 
                    InfiMaterialEnum.Bone, InfiMaterialEnum.Wood, "woodBoneSword");
        	stoneBoneSword = new InfiToolSword(PropsHelperInfiTools.boneSwordID+1, 
                    InfiMaterialEnum.Bone, InfiMaterialEnum.Stone, "stoneBoneSword");
        	sandstoneBoneSword = new InfiToolSword(PropsHelperInfiTools.boneSwordID+2, 
                    InfiMaterialEnum.Bone, InfiMaterialEnum.Sandstone, "sandstoneBoneSword");
        	boneBoneSword = new InfiToolSword(PropsHelperInfiTools.boneSwordID+3, 
                    InfiMaterialEnum.Bone, InfiMaterialEnum.Bone, "boneBoneSword");
        	paperBoneSword = new InfiToolSword(PropsHelperInfiTools.boneSwordID+4, 
                    InfiMaterialEnum.Bone, InfiMaterialEnum.Paper, "paperBoneSword");
        	netherrackBoneSword = new InfiToolSword(PropsHelperInfiTools.boneSwordID+5, 
                    InfiMaterialEnum.Bone, InfiMaterialEnum.Netherrack, "netherrackBoneSword");
        	iceBoneSword = new InfiToolSword(PropsHelperInfiTools.boneSwordID+6, 
                    InfiMaterialEnum.Bone, InfiMaterialEnum.Ice, "iceBoneSword");
        	cactusBoneSword = new InfiToolSword(PropsHelperInfiTools.boneSwordID+7,
                    InfiMaterialEnum.Bone, InfiMaterialEnum.Cactus, "cactusBoneSword");
        	flintBoneSword = new InfiToolSword(PropsHelperInfiTools.boneSwordID+8,
                    InfiMaterialEnum.Bone, InfiMaterialEnum.Flint, "flintBoneSword");
        }
        
        if(PropsHelperInfiTools.enablePaperTools)
        {
        	woodPaperSword = new InfiToolSword(PropsHelperInfiTools.paperSwordID+0, 
                    InfiMaterialEnum.Paper, InfiMaterialEnum.Wood, "woodPaperSword");
        	bonePaperSword = new InfiToolSword(PropsHelperInfiTools.paperSwordID+1, 
                    InfiMaterialEnum.Paper, InfiMaterialEnum.Bone, "bonePaperSword");
        	paperPaperSword = new InfiToolSword(PropsHelperInfiTools.paperSwordID+2, 
                    InfiMaterialEnum.Paper, InfiMaterialEnum.Paper, "paperPaperSword");
        	slimePaperSword = new InfiToolSword(PropsHelperInfiTools.paperSwordID+3,
                    InfiMaterialEnum.Paper, InfiMaterialEnum.Slime, "slimePaperSword");
        	cactusPaperSword = new InfiToolSword(PropsHelperInfiTools.paperSwordID+4,
                    InfiMaterialEnum.Paper, InfiMaterialEnum.Cactus, "cactusPaperSword");
        }
        
        if(PropsHelperInfiTools.enableMossyTools)
        {
        	woodMossySword = new InfiToolSword(PropsHelperInfiTools.mossySwordID+0, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Wood, "woodMossySword");
        	stoneMossySword = new InfiToolSword(PropsHelperInfiTools.mossySwordID+1, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Stone, "stoneMossySword");
        	diamondMossySword = new InfiToolSword(PropsHelperInfiTools.mossySwordID+2, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Diamond, "diamondMossySword");
        	redstoneMossySword = new InfiToolSword(PropsHelperInfiTools.mossySwordID+3, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Redstone, "redstoneMossySword");
        	boneMossySword = new InfiToolSword(PropsHelperInfiTools.mossySwordID+4, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Bone, "boneMossySword");
        	mossyMossySword = new InfiToolSword(PropsHelperInfiTools.mossySwordID+5, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Mossy, "mossyMossySword");
        	netherrackMossySword = new InfiToolSword(PropsHelperInfiTools.mossySwordID+6, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Netherrack, "netherrackMossySword");
        	glowstoneMossySword = new InfiToolSword(PropsHelperInfiTools.mossySwordID+7, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Glowstone, "glowstoneMossySword");
        	cactusMossySword = new InfiToolSword(PropsHelperInfiTools.mossySwordID+8, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Cactus, "cactusMossySword");
        	blazeMossySword = new InfiToolSword(PropsHelperInfiTools.mossySwordID+9, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Blaze, "blazeMossySword");
        	manyullynMossySword = new InfiToolSword(PropsHelperInfiTools.mossySwordID+10, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Manyullyn, "manyullynMossySword");
        	uraniumMossySword = new InfiToolSword(PropsHelperInfiTools.mossySwordID+11, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Uranium, "uraniumMossySword");
        }
        
        if(PropsHelperInfiTools.enableNetherrackTools)
        {
        	woodNetherrackSword = new InfiToolSword(PropsHelperInfiTools.netherrackSwordID+0, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Wood, "woodNetherrackSword");
        	stoneNetherrackSword = new InfiToolSword(PropsHelperInfiTools.netherrackSwordID+1, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Stone, "stoneNetherrackSword");
        	sandstoneNetherrackSword = new InfiToolSword(PropsHelperInfiTools.netherrackSwordID+2, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Sandstone, "sandstoneNetherrackSword");
        	boneNetherrackSword = new InfiToolSword(PropsHelperInfiTools.netherrackSwordID+3, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Bone, "boneNetherrackSword");
        	paperNetherrackSword = new InfiToolSword(PropsHelperInfiTools.netherrackSwordID+4, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Paper, "paperNetherrackSword");
        	mossyNetherrackSword = new InfiToolSword(PropsHelperInfiTools.netherrackSwordID+5, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Mossy, "mossyNetherrackSword");
        	netherrackNetherrackSword = new InfiToolSword(PropsHelperInfiTools.netherrackSwordID+6, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Netherrack, "netherrackNetherrackSword");
        	iceNetherrackSword = new InfiToolSword(PropsHelperInfiTools.netherrackSwordID+7, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Ice, "iceNetherrackSword");
        	slimeNetherrackSword = new InfiToolSword(PropsHelperInfiTools.netherrackSwordID+8, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Slime, "slimeNetherrackSword");
        	cactusNetherrackSword = new InfiToolSword(PropsHelperInfiTools.netherrackSwordID+9, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Cactus, "cactusNetherrackSword");
        	flintNetherrackSword = new InfiToolSword(PropsHelperInfiTools.netherrackSwordID+10, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Flint, "flintNetherrackSword");
        	copperNetherrackSword = new InfiToolSword(PropsHelperInfiTools.netherrackSwordID+11, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Copper, "copperNetherrackSword");
        	bronzeNetherrackSword = new InfiToolSword(PropsHelperInfiTools.netherrackSwordID+12, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Bronze, "bronzeNetherrackSword");
        }
        
        if(PropsHelperInfiTools.enableGlowstoneTools)
        {
        	woodGlowstoneSword = new InfiToolSword(PropsHelperInfiTools.glowstoneSwordID+0, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Wood, "woodGlowstoneSword");
        	redstoneGlowstoneSword = new InfiToolSword(PropsHelperInfiTools.glowstoneSwordID+1, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Redstone, "redstoneGlowstoneSword");
        	obsidianGlowstoneSword = new InfiToolSword(PropsHelperInfiTools.glowstoneSwordID+2, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Obsidian, "obsidianGlowstoneSword");
        	boneGlowstoneSword = new InfiToolSword(PropsHelperInfiTools.glowstoneSwordID+3, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Bone, "boneGlowstoneSword");
        	netherrackGlowstoneSword = new InfiToolSword(PropsHelperInfiTools.glowstoneSwordID+4, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Netherrack, "netherrackGlowstoneSword");
        	glowstoneGlowstoneSword = new InfiToolSword(PropsHelperInfiTools.glowstoneSwordID+5, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Glowstone, "glowstoneGlowstoneSword");
        	iceGlowstoneSword = new InfiToolSword(PropsHelperInfiTools.glowstoneSwordID+6, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Ice, "iceGlowstoneSword");
        	slimeGlowstoneSword = new InfiToolSword(PropsHelperInfiTools.glowstoneSwordID+7, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Slime, "slimeGlowstoneSword");
        	cactusGlowstoneSword = new InfiToolSword(PropsHelperInfiTools.glowstoneSwordID+8, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Cactus, "cactusGlowstoneSword");
            
        }
        
        if(PropsHelperInfiTools.enableIceTools)
        {
        	woodIceSword = new InfiToolSword(PropsHelperInfiTools.iceSwordID+0, 
                    InfiMaterialEnum.Ice, InfiMaterialEnum.Wood, "woodIceSword");
        	boneIceSword = new InfiToolSword(PropsHelperInfiTools.iceSwordID+1, 
                    InfiMaterialEnum.Ice, InfiMaterialEnum.Bone, "boneIceSword");
        	paperIceSword = new InfiToolSword(PropsHelperInfiTools.iceSwordID+2, 
                    InfiMaterialEnum.Ice, InfiMaterialEnum.Paper, "paperIceSword");
        	iceIceSword = new InfiToolSword(PropsHelperInfiTools.iceSwordID+3, 
                    InfiMaterialEnum.Ice, InfiMaterialEnum.Ice, "iceIceSword");
        	slimeIceSword = new InfiToolSword(PropsHelperInfiTools.iceSwordID+4, 
                    InfiMaterialEnum.Ice, InfiMaterialEnum.Slime, "slimeIceSword");
        	cactusIceSword = new InfiToolSword(PropsHelperInfiTools.iceSwordID+5, 
                    InfiMaterialEnum.Ice, InfiMaterialEnum.Cactus, "cactusIceSword");
        }
        
        if(PropsHelperInfiTools.enableLavaTools)
        {
        	diamondLavaSword = new InfiToolSword(PropsHelperInfiTools.lavaSwordID+0, 
                    InfiMaterialEnum.Lava, InfiMaterialEnum.Diamond, "diamondLavaSword");
        	obsidianLavaSword = new InfiToolSword(PropsHelperInfiTools.lavaSwordID+1, 
                    InfiMaterialEnum.Lava, InfiMaterialEnum.Obsidian, "obsidianLavaSword");
        	netherrackLavaSword = new InfiToolSword(PropsHelperInfiTools.lavaSwordID+2, 
                    InfiMaterialEnum.Lava, InfiMaterialEnum.Netherrack, "netherrackLavaSword");
        	lavaLavaSword = new InfiToolSword(PropsHelperInfiTools.lavaSwordID+3, 
                    InfiMaterialEnum.Lava, InfiMaterialEnum.Lava, "lavaLavaSword");
        	flintLavaSword = new InfiToolSword(PropsHelperInfiTools.lavaSwordID+4, 
                    InfiMaterialEnum.Lava, InfiMaterialEnum.Flint, "flintLavaSword");
        	blazeLavaSword = new InfiToolSword(PropsHelperInfiTools.lavaSwordID+5, 
                    InfiMaterialEnum.Lava, InfiMaterialEnum.Blaze, "blazeLavaSword");
        	manyullynLavaSword = new InfiToolSword(PropsHelperInfiTools.lavaSwordID+6, 
                    InfiMaterialEnum.Lava, InfiMaterialEnum.Manyullyn, "manyullynLavaSword");
            uraniumLavaSword = new InfiToolSword(PropsHelperInfiTools.lavaSwordID+7, 
                    InfiMaterialEnum.Lava, InfiMaterialEnum.Uranium, "uraniumLavaSword");
        }
        
        if(PropsHelperInfiTools.enableSlimeTools)
        {
        	woodSlimeSword = new InfiToolSword(PropsHelperInfiTools.slimeSwordID+0, 
                    InfiMaterialEnum.Slime, InfiMaterialEnum.Wood, "woodSlimeSword");
        	sandstoneSlimeSword = new InfiToolSword(PropsHelperInfiTools.slimeSwordID+1, 
                    InfiMaterialEnum.Slime, InfiMaterialEnum.Sandstone, "sandstoneSlimeSword");
        	boneSlimeSword = new InfiToolSword(PropsHelperInfiTools.slimeSwordID+2, 
                    InfiMaterialEnum.Slime, InfiMaterialEnum.Bone, "boneSlimeSword");
        	paperSlimeSword = new InfiToolSword(PropsHelperInfiTools.slimeSwordID+3, 
                    InfiMaterialEnum.Slime, InfiMaterialEnum.Paper, "paperSlimeSword");
        	slimeSlimeSword = new InfiToolSword(PropsHelperInfiTools.slimeSwordID+4, 
                    InfiMaterialEnum.Slime, InfiMaterialEnum.Slime, "slimeSlimeSword");
        	cactusSlimeSword = new InfiToolSword(PropsHelperInfiTools.slimeSwordID+5, 
                    InfiMaterialEnum.Slime, InfiMaterialEnum.Cactus, "cactusSlimeSword");
        }
        
        if(PropsHelperInfiTools.enableCactusTools)
        {
        	woodCactusSword = new InfiToolSword(PropsHelperInfiTools.cactusSwordID+0, 
                    InfiMaterialEnum.Cactus, InfiMaterialEnum.Wood, "woodCactusSword");
        	sandstoneCactusSword = new InfiToolSword(PropsHelperInfiTools.cactusSwordID+1, 
                    InfiMaterialEnum.Cactus, InfiMaterialEnum.Sandstone, "sandstoneCactusSword");
        	boneCactusSword = new InfiToolSword(PropsHelperInfiTools.cactusSwordID+2, 
                    InfiMaterialEnum.Cactus, InfiMaterialEnum.Bone, "boneCactusSword");
        	netherrackCactusSword = new InfiToolSword(PropsHelperInfiTools.cactusSwordID+3, 
                    InfiMaterialEnum.Cactus, InfiMaterialEnum.Netherrack, "netherrackCactusSword");
        	iceCactusSword = new InfiToolSword(PropsHelperInfiTools.cactusSwordID+4, 
                    InfiMaterialEnum.Cactus, InfiMaterialEnum.Ice, "iceCactusSword");
        	slimeCactusSword = new InfiToolSword(PropsHelperInfiTools.cactusSwordID+5, 
                    InfiMaterialEnum.Cactus, InfiMaterialEnum.Slime, "slimeCactusSword");
        	cactusCactusSword = new InfiToolSword(PropsHelperInfiTools.cactusSwordID+6, 
                    InfiMaterialEnum.Cactus, InfiMaterialEnum.Cactus, "cactusCactusSword");
        }
        
        if(PropsHelperInfiTools.enableFlintTools)
        {
        	woodFlintSword = new InfiToolSword(PropsHelperInfiTools.flintSwordID+0, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Wood, "woodFlintSword");
        	stoneFlintSword = new InfiToolSword(PropsHelperInfiTools.flintSwordID+1, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Stone, "stoneFlintSword");
        	sandstoneFlintSword = new InfiToolSword(PropsHelperInfiTools.flintSwordID+2, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Sandstone, "sandstoneFlintSword");
        	boneFlintSword = new InfiToolSword(PropsHelperInfiTools.flintSwordID+3, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Bone, "boneFlintSword");
        	netherrackFlintSword = new InfiToolSword(PropsHelperInfiTools.flintSwordID+4, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Netherrack, "netherrackFlintSword");
        	slimeFlintSword = new InfiToolSword(PropsHelperInfiTools.flintSwordID+5, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Slime, "slimeFlintSword");
        	cactusFlintSword = new InfiToolSword(PropsHelperInfiTools.flintSwordID+6, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Cactus, "cactusFlintSword");
        	flintFlintSword = new InfiToolSword(PropsHelperInfiTools.flintSwordID+7, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Flint, "flintFlintSword");
        	copperFlintSword = new InfiToolSword(PropsHelperInfiTools.flintSwordID+8, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Copper, "copperFlintSword");
        	bronzeFlintSword = new InfiToolSword(PropsHelperInfiTools.flintSwordID+9, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Bronze, "bronzeFlintSword");
        }
        
        if(PropsHelperInfiTools.enableBlazeTools)
        {
        	diamondBlazeSword = new InfiToolSword(PropsHelperInfiTools.blazeSwordID+0, 
                    InfiMaterialEnum.Blaze, InfiMaterialEnum.Diamond, "diamondBlazeSword");
        	obsidianBlazeSword = new InfiToolSword(PropsHelperInfiTools.blazeSwordID+1, 
                    InfiMaterialEnum.Blaze, InfiMaterialEnum.Obsidian, "obsidianBlazeSword");
        	netherrackBlazeSword = new InfiToolSword(PropsHelperInfiTools.blazeSwordID+2, 
                    InfiMaterialEnum.Blaze, InfiMaterialEnum.Netherrack, "netherrackBlazeSword");
        	lavaBlazeSword = new InfiToolSword(PropsHelperInfiTools.blazeSwordID+3, 
                    InfiMaterialEnum.Blaze, InfiMaterialEnum.Lava, "lavaBlazeSword");
        	flintBlazeSword = new InfiToolSword(PropsHelperInfiTools.blazeSwordID+4, 
                    InfiMaterialEnum.Blaze, InfiMaterialEnum.Flint, "flintBlazeSword");
        	blazeBlazeSword = new InfiToolSword(PropsHelperInfiTools.blazeSwordID+5, 
                    InfiMaterialEnum.Blaze, InfiMaterialEnum.Blaze, "blazeBlazeSword");
        	manyullynBlazeSword = new InfiToolSword(PropsHelperInfiTools.blazeSwordID+6, 
                    InfiMaterialEnum.Blaze, InfiMaterialEnum.Manyullyn, "manyullynBlazeSword");
            uraniumBlazeSword = new InfiToolSword(PropsHelperInfiTools.blazeSwordID+7, 
                    InfiMaterialEnum.Blaze, InfiMaterialEnum.Uranium, "uraniumBlazeSword");
        }
    	
        if(PropsHelperInfiTools.enableCopperTools)
        {
        	woodCopperSword = new InfiToolSword(PropsHelperInfiTools.copperSwordID+0, 
                    InfiMaterialEnum.Copper, InfiMaterialEnum.Wood, "woodCopperSword");
            stoneCopperSword = new InfiToolSword(PropsHelperInfiTools.copperSwordID+1, 
                    InfiMaterialEnum.Copper, InfiMaterialEnum.Stone, "stoneCopperSword");
            boneCopperSword = new InfiToolSword(PropsHelperInfiTools.copperSwordID+2, 
                    InfiMaterialEnum.Copper, InfiMaterialEnum.Bone, "boneCopperSword");
            netherrackCopperSword = new InfiToolSword(PropsHelperInfiTools.copperSwordID+3, 
                    InfiMaterialEnum.Copper, InfiMaterialEnum.Netherrack, "netherrackCopperSword");
            slimeCopperSword = new InfiToolSword(PropsHelperInfiTools.copperSwordID+4, 
                    InfiMaterialEnum.Copper, InfiMaterialEnum.Slime, "slimeCopperSword");
            cactusCopperSword = new InfiToolSword(PropsHelperInfiTools.copperSwordID+5, 
                    InfiMaterialEnum.Copper, InfiMaterialEnum.Cactus, "cactusCopperSword");
            flintCopperSword = new InfiToolSword(PropsHelperInfiTools.copperSwordID+6, 
                    InfiMaterialEnum.Copper, InfiMaterialEnum.Flint, "flintCopperSword");
            copperCopperSword = new InfiToolSword(PropsHelperInfiTools.copperSwordID+7, 
                    InfiMaterialEnum.Copper, InfiMaterialEnum.Copper, "copperCopperSword");
        }
        
        if(PropsHelperInfiTools.enableBronzeTools)
        {
        	woodBronzeSword = new InfiToolSword(PropsHelperInfiTools.bronzeSwordID+0, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Wood, "woodBronzeSword");
            stoneBronzeSword = new InfiToolSword(PropsHelperInfiTools.bronzeSwordID+1, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Stone, "stoneBronzeSword");
            boneBronzeSword = new InfiToolSword(PropsHelperInfiTools.bronzeSwordID+2, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Bone, "boneBronzeSword");
            netherrackBronzeSword = new InfiToolSword(PropsHelperInfiTools.bronzeSwordID+3, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Netherrack, "netherrackBronzeSword");
            slimeBronzeSword = new InfiToolSword(PropsHelperInfiTools.bronzeSwordID+4, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Slime, "slimeBronzeSword");
            cactusBronzeSword = new InfiToolSword(PropsHelperInfiTools.bronzeSwordID+5, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Cactus, "cactusBronzeSword");
            flintBronzeSword = new InfiToolSword(PropsHelperInfiTools.bronzeSwordID+6, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Flint, "flintBronzeSword");
            copperBronzeSword = new InfiToolSword(PropsHelperInfiTools.bronzeSwordID+7, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Copper, "copperBronzeSword");
            bronzeBronzeSword = new InfiToolSword(PropsHelperInfiTools.bronzeSwordID+8, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Bronze, "copperBronzeSword");
        }
        
        if(PropsHelperInfiTools.enableWorkedIronTools)
        {
        	woodWorkedIronSword = new InfiToolSword(PropsHelperInfiTools.workedIronSwordID+0, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Wood, "woodWorkedIronSword");
            stoneWorkedIronSword = new InfiToolSword(PropsHelperInfiTools.workedIronSwordID+1, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Stone, "stoneWorkedIronSword");
            ironWorkedIronSword = new InfiToolSword(PropsHelperInfiTools.workedIronSwordID+2,
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Iron, "ironWorkedIronSword");
            diamondWorkedIronSword = new InfiToolSword(PropsHelperInfiTools.workedIronSwordID+3, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Diamond, "diamondWorkedIronSword");
            redstoneWorkedIronSword = new InfiToolSword(PropsHelperInfiTools.workedIronSwordID+4, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Redstone, "redstoneWorkedIronSword");
            obsidianWorkedIronSword = new InfiToolSword(PropsHelperInfiTools.workedIronSwordID+5, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Obsidian, "obsidianWorkedIronSword");
            boneWorkedIronSword = new InfiToolSword(PropsHelperInfiTools.workedIronSwordID+6, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Bone, "boneWorkedIronSword");
            netherrackWorkedIronSword = new InfiToolSword(PropsHelperInfiTools.workedIronSwordID+7, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Netherrack, "netherrackWorkedIronSword");
            glowstoneWorkedIronSword = new InfiToolSword(PropsHelperInfiTools.workedIronSwordID+8, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Glowstone, "glowstoneWorkedIronSword");
            iceWorkedIronSword = new InfiToolSword(PropsHelperInfiTools.workedIronSwordID+9, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Ice, "iceWorkedIronSword");
            slimeWorkedIronSword = new InfiToolSword(PropsHelperInfiTools.workedIronSwordID+10, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Slime, "slimeWorkedIronSword");
            cactusWorkedIronSword = new InfiToolSword(PropsHelperInfiTools.workedIronSwordID+11, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Cactus, "cactusWorkedIronSword");
            blazeWorkedIronSword = new InfiToolSword(PropsHelperInfiTools.workedIronSwordID+12, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Blaze, "blazeWorkedIronSword");
            copperWorkedIronSword = new InfiToolSword(PropsHelperInfiTools.workedIronSwordID+13, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Copper, "copperWorkedIronSword");
            bronzeWorkedIronSword = new InfiToolSword(PropsHelperInfiTools.workedIronSwordID+14, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Bronze, "bronzeWorkedIronSword");
            workedWorkedIronSword = new InfiToolSword(PropsHelperInfiTools.workedIronSwordID+15, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.WorkedIron, "workedWorkedIronSword");
            steelWorkedIronSword = new InfiToolSword(PropsHelperInfiTools.workedIronSwordID+16, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Steel, "steelWorkedIronSword");
            uraniumWorkedIronSword = new InfiToolSword(PropsHelperInfiTools.workedIronSwordID+17, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Uranium, "uraniumWorkedIronSword");
        }
        
        if(PropsHelperInfiTools.enableSteelTools)
        {
        	woodSteelSword = new InfiToolSword(PropsHelperInfiTools.steelSwordID+0, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Wood, "woodSteelSword");
            stoneSteelSword = new InfiToolSword(PropsHelperInfiTools.steelSwordID+1, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Stone, "stoneSteelSword");
            ironSteelSword = new InfiToolSword(PropsHelperInfiTools.steelSwordID+2, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Iron, "ironSteelSword");
            diamondSteelSword = new InfiToolSword(PropsHelperInfiTools.steelSwordID+3, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Diamond, "diamondSteelSword");
            redstoneSteelSword = new InfiToolSword(PropsHelperInfiTools.steelSwordID+4, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Redstone, "redstoneSteelSword");
            obsidianSteelSword = new InfiToolSword(PropsHelperInfiTools.steelSwordID+5, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Obsidian, "obsidianSteelSword");
            boneSteelSword = new InfiToolSword(PropsHelperInfiTools.steelSwordID+6, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Bone, "boneSteelSword");
            netherrackSteelSword = new InfiToolSword(PropsHelperInfiTools.steelSwordID+7, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Netherrack, "netherrackSteelSword");
            glowstoneSteelSword = new InfiToolSword(PropsHelperInfiTools.steelSwordID+8, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Glowstone, "glowstoneSteelSword");
            iceSteelSword = new InfiToolSword(PropsHelperInfiTools.steelSwordID+9, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Ice, "iceSteelSword");
            slimeSteelSword = new InfiToolSword(PropsHelperInfiTools.steelSwordID+10, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Slime, "slimeSteelSword");
            cactusSteelSword = new InfiToolSword(PropsHelperInfiTools.steelSwordID+11, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Cactus, "cactusSteelSword");
            blazeSteelSword = new InfiToolSword(PropsHelperInfiTools.steelSwordID+12, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Blaze, "blazeSteelSword");
            copperSteelSword = new InfiToolSword(PropsHelperInfiTools.steelSwordID+13, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Copper, "copperSteelSword");
            bronzeSteelSword = new InfiToolSword(PropsHelperInfiTools.steelSwordID+14, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Bronze, "bronzeSteelSword");
            workedSteelSword = new InfiToolSword(PropsHelperInfiTools.steelSwordID+15, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.WorkedIron, "workedSteelSword");
            steelSteelSword = new InfiToolSword(PropsHelperInfiTools.steelSwordID+16, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Steel, "steelSteelSword");
            cobaltSteelSword = new InfiToolSword(PropsHelperInfiTools.steelSwordID+17, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Cobalt, "cobaltSteelSword");
            arditeSteelSword = new InfiToolSword(PropsHelperInfiTools.steelSwordID+18, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Ardite, "arditeSteelSword");
            uraniumSteelSword = new InfiToolSword(PropsHelperInfiTools.steelSwordID+19, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Uranium, "uraniumSteelSword");
        }
        
        if(PropsHelperInfiTools.enableCobaltTools)
        {
        	woodCobaltSword = new InfiToolSword(PropsHelperInfiTools.cobaltSwordID+0, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Wood, "woodCobaltSword");
            stoneCobaltSword = new InfiToolSword(PropsHelperInfiTools.cobaltSwordID+1, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Stone, "stoneCobaltSword");
            ironCobaltSword = new InfiToolSword(PropsHelperInfiTools.cobaltSwordID+2, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Iron, "ironCobaltSword");
            diamondCobaltSword = new InfiToolSword(PropsHelperInfiTools.cobaltSwordID+3,
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Diamond, "diamondCobaltSword");
            redstoneCobaltSword = new InfiToolSword(PropsHelperInfiTools.cobaltSwordID+4, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Redstone, "redstoneCobaltSword");
            obsidianCobaltSword = new InfiToolSword(PropsHelperInfiTools.cobaltSwordID+5, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Obsidian, "obsidianCobaltSword");
            boneCobaltSword = new InfiToolSword(PropsHelperInfiTools.cobaltSwordID+6, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Bone, "boneCobaltSword");
            slimeCobaltSword = new InfiToolSword(PropsHelperInfiTools.cobaltSwordID+7, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Slime, "slimeCobaltSword");
            cactusCobaltSword = new InfiToolSword(PropsHelperInfiTools.cobaltSwordID+8, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Cactus, "cactusCobaltSword");
            blazeCobaltSword = new InfiToolSword(PropsHelperInfiTools.cobaltSwordID+9, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Blaze, "blazeCobaltSword");
            copperCobaltSword = new InfiToolSword(PropsHelperInfiTools.cobaltSwordID+10, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Copper, "copperCobaltSword");
            bronzeCobaltSword = new InfiToolSword(PropsHelperInfiTools.cobaltSwordID+11, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Bronze, "bronzeCobaltSword");
            workedCobaltSword = new InfiToolSword(PropsHelperInfiTools.cobaltSwordID+12, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.WorkedIron, "workedCobaltSword");
            steelCobaltSword = new InfiToolSword(PropsHelperInfiTools.cobaltSwordID+13, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Steel, "steelCobaltSword");
            cobaltCobaltSword = new InfiToolSword(PropsHelperInfiTools.cobaltSwordID+14, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Cobalt, "cobaltCobaltSword");
            arditeCobaltSword = new InfiToolSword(PropsHelperInfiTools.cobaltSwordID+15, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Ardite, "arditeCobaltSword");
            manyullynCobaltSword = new InfiToolSword(PropsHelperInfiTools.cobaltSwordID+16, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Manyullyn, "arditeCobaltSword");
            uraniumCobaltSword = new InfiToolSword(PropsHelperInfiTools.cobaltSwordID+17, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Uranium, "uraniumCobaltSword");
        }
        
        if(PropsHelperInfiTools.enableArditeTools)
        {
        	woodArditeSword = new InfiToolSword(PropsHelperInfiTools.arditeSwordID+0, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Wood, "woodArditeSword");
            stoneArditeSword = new InfiToolSword(PropsHelperInfiTools.arditeSwordID+1, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Stone, "stoneArditeSword");
            ironArditeSword = new InfiToolSword(PropsHelperInfiTools.arditeSwordID+2, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Iron, "ironArditeSword");
            diamondArditeSword = new InfiToolSword(PropsHelperInfiTools.arditeSwordID+3,
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Diamond, "diamondArditeSword");
            redstoneArditeSword = new InfiToolSword(PropsHelperInfiTools.arditeSwordID+4, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Redstone, "redstoneArditeSword");
            obsidianArditeSword = new InfiToolSword(PropsHelperInfiTools.arditeSwordID+5, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Obsidian, "obsidianArditeSword");
            boneArditeSword = new InfiToolSword(PropsHelperInfiTools.arditeSwordID+6,
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Bone, "boneArditeSword");
            slimeArditeSword = new InfiToolSword(PropsHelperInfiTools.arditeSwordID+7, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Slime, "slimeArditeSword");
            cactusArditeSword = new InfiToolSword(PropsHelperInfiTools.arditeSwordID+8, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Cactus, "cactusArditeSword");
            blazeArditeSword = new InfiToolSword(PropsHelperInfiTools.arditeSwordID+9, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Blaze, "blazeArditeSword");
            copperArditeSword = new InfiToolSword(PropsHelperInfiTools.arditeSwordID+10, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Copper, "copperArditeSword");
            bronzeArditeSword = new InfiToolSword(PropsHelperInfiTools.arditeSwordID+11, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Bronze, "bronzeArditeSword");
            workedArditeSword = new InfiToolSword(PropsHelperInfiTools.arditeSwordID+12, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.WorkedIron, "workedArditeSword");
            steelArditeSword = new InfiToolSword(PropsHelperInfiTools.arditeSwordID+13, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Steel, "steelArditeSword");
            cobaltArditeSword = new InfiToolSword(PropsHelperInfiTools.arditeSwordID+14, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Cobalt, "cobaltArditeSword");
            arditeArditeSword = new InfiToolSword(PropsHelperInfiTools.arditeSwordID+15, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Ardite, "arditeArditeSword");
            manyullynArditeSword = new InfiToolSword(PropsHelperInfiTools.arditeSwordID+16, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Manyullyn, "arditeArditeSword");
            uraniumArditeSword = new InfiToolSword(PropsHelperInfiTools.arditeSwordID+17, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Uranium, "uraniumArditeSword");
        }
        
        if(PropsHelperInfiTools.enableManyullynTools)
        {
        	woodManyullynSword = new InfiToolSword(PropsHelperInfiTools.manyullynSwordID+0, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Wood, "woodManyullynSword");
            stoneManyullynSword = new InfiToolSword(PropsHelperInfiTools.manyullynSwordID+1, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Stone, "stoneManyullynSword");
            ironManyullynSword = new InfiToolSword(PropsHelperInfiTools.manyullynSwordID+2, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Iron, "ironManyullynSword");
            diamondManyullynSword = new InfiToolSword(PropsHelperInfiTools.manyullynSwordID+3,
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Diamond, "diamondManyullynSword");
            redstoneManyullynSword = new InfiToolSword(PropsHelperInfiTools.manyullynSwordID+4, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Redstone, "redstoneManyullynSword");
            obsidianManyullynSword = new InfiToolSword(PropsHelperInfiTools.manyullynSwordID+5, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Obsidian, "obsidianManyullynSword");
            boneManyullynSword = new InfiToolSword(PropsHelperInfiTools.manyullynSwordID+6, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Bone, "boneManyullynSword");
            slimeManyullynSword = new InfiToolSword(PropsHelperInfiTools.manyullynSwordID+7, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Slime, "slimeManyullynSword");
            cactusManyullynSword = new InfiToolSword(PropsHelperInfiTools.manyullynSwordID+8, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Cactus, "cactusManyullynSword");
            blazeManyullynSword = new InfiToolSword(PropsHelperInfiTools.manyullynSwordID+9, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Blaze, "blazeManyullynSword");
            copperManyullynSword = new InfiToolSword(PropsHelperInfiTools.manyullynSwordID+10, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Copper, "copperManyullynSword");
            bronzeManyullynSword = new InfiToolSword(PropsHelperInfiTools.manyullynSwordID+11, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Bronze, "bronzeManyullynSword");
            workedManyullynSword = new InfiToolSword(PropsHelperInfiTools.manyullynSwordID+12, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.WorkedIron, "workedManyullynSword");
            steelManyullynSword = new InfiToolSword(PropsHelperInfiTools.manyullynSwordID+13, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Steel, "steelManyullynSword");
            cobaltManyullynSword = new InfiToolSword(PropsHelperInfiTools.manyullynSwordID+14, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Cobalt, "cobaltManyullynSword");
            arditeManyullynSword = new InfiToolSword(PropsHelperInfiTools.manyullynSwordID+15, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Ardite, "arditeManyullynSword");
            manyullynManyullynSword = new InfiToolSword(PropsHelperInfiTools.manyullynSwordID+16, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Manyullyn, "arditeManyullynSword");
            uraniumManyullynSword = new InfiToolSword(PropsHelperInfiTools.manyullynSwordID+17,
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Uranium, "uraniumManyullynSword");
        }
        
        if(PropsHelperInfiTools.enableUraniumTools)
        {
            diamondUraniumSword = new InfiToolSword(PropsHelperInfiTools.uraniumSwordID+0, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Diamond, "diamondUraniumSword");
            redstoneUraniumSword = new InfiToolSword(PropsHelperInfiTools.uraniumSwordID+1, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Redstone, "redstoneUraniumSword");
            boneUraniumSword = new InfiToolSword(PropsHelperInfiTools.uraniumSwordID+2, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Bone, "boneUraniumSword");
            netherrackUraniumSword = new InfiToolSword(PropsHelperInfiTools.uraniumSwordID+3, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Netherrack, "netherrackUraniumSword");
            glowstoneUraniumSword = new InfiToolSword(PropsHelperInfiTools.uraniumSwordID+4, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Glowstone, "glowstoneUraniumSword");
            lavaUraniumSword = new InfiToolSword(PropsHelperInfiTools.uraniumSwordID+5, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Lava, "lavaUraniumSword");
            blazeUraniumSword = new InfiToolSword(PropsHelperInfiTools.uraniumSwordID+6, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Blaze, "blazeUraniumSword");
            cobaltUraniumSword = new InfiToolSword(PropsHelperInfiTools.uraniumSwordID+7, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Cobalt, "cobaltUraniumSword");
            arditeUraniumSword = new InfiToolSword(PropsHelperInfiTools.uraniumSwordID+8, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Ardite, "arditeUraniumSword");
            uraniumUraniumSword = new InfiToolSword(PropsHelperInfiTools.uraniumSwordID+9, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Uranium, "uraniumUraniumSword");
        }
    }
    
    private static void addNames()
    {
    	ModLoader.addName(woodWoodSword, "Wooden Sword");
    	ModLoader.addName(stoneStoneSword, "Heavy Sword");
    	ModLoader.addName(ironIronSword, "Ironic Sword");
    	ModLoader.addName(diamondDiamondSword, "Diamondium Sword");
    	ModLoader.addName(redstoneRedstoneSword, "Redredred Sword");
    	ModLoader.addName(obsidianObsidianSword, "Ebony Sword");
    	ModLoader.addName(sandstoneSandstoneSword, "Fragile Sword");
    	ModLoader.addName(boneBoneSword, "Necrotic Sword");
    	ModLoader.addName(paperPaperSword, "Soft Sword");
    	ModLoader.addName(mossyMossySword, "Living Sword");
    	ModLoader.addName(netherrackNetherrackSword, "Blood Sword");
    	ModLoader.addName(glowstoneGlowstoneSword, "Bright Sword");
    	ModLoader.addName(iceIceSword, "Freezing Sword");
    	ModLoader.addName(lavaLavaSword, "Burning Sword");
    	ModLoader.addName(slimeSlimeSword, "Toy Sword");
    	ModLoader.addName(cactusCactusSword, "Thorned Sword");
    	ModLoader.addName(flintFlintSword, "Rough-hewn Sword");
    	ModLoader.addName(blazeBlazeSword, "Netherite Sword");
        ModLoader.addName(copperCopperSword, "Orange-Tang Sword");
        ModLoader.addName(bronzeBronzeSword, "Polished Sword");
        ModLoader.addName(workedWorkedIronSword, "Reworked Iron Sword");
        ModLoader.addName(steelSteelSword, "Forge-Wrought Sword");
        ModLoader.addName(cobaltCobaltSword, "Beautiful Sword");
        ModLoader.addName(arditeArditeSword, "Rustic Sword");
        ModLoader.addName(manyullynManyullynSword, "False-Prophetic Sword");
        ModLoader.addName(uraniumUraniumSword, "Cancerous Sword");
    }
    
    public static void registerInfiToolsRecipes()
    {
    	if(PropsHelperInfiTools.enableWoodTools)
        {
            ModLoader.addRecipe(new ItemStack(woodWoodSword), new Object[] 
                    { recipe, '#', Block.planks, '|', Item.stick });
            ModLoader.addRecipe(new ItemStack(sandstoneWoodSword), new Object[] 
                    { recipe, '#', Block.planks, '|', mod_InfiBase.sandstoneRod });
            ModLoader.addRecipe(new ItemStack(boneWoodSword), new Object[] 
                    { recipe, '#', Block.planks, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneWoodSword), new Object[] 
                    { recipe, '#', Block.planks, '|', mod_InfiBase.boneRod });
            ModLoader.addRecipe(new ItemStack(paperWoodSword), new Object[] 
                    { recipe, '#', Block.planks, '|', mod_InfiBase.paperRod });
            ModLoader.addRecipe(new ItemStack(iceWoodSword), new Object[] 
                    { recipe, '#', Block.planks, '|', mod_InfiBase.iceRod });
            ModLoader.addRecipe(new ItemStack(slimeWoodSword), new Object[] 
                    { recipe, '#', Block.planks, '|', mod_InfiBase.slimeRod });
            ModLoader.addRecipe(new ItemStack(cactusWoodSword), new Object[] 
                    { recipe, '#', Block.planks, '|', mod_InfiBase.cactusRod });
        }
    	
        if(PropsHelperInfiTools.enableStoneTools)
        {
        	ModLoader.addRecipe(new ItemStack(woodStoneSword), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', Item.stick });
        	ModLoader.addRecipe(new ItemStack(stoneStoneSword), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', mod_InfiBase.stoneRod });
            ModLoader.addRecipe(new ItemStack(sandstoneStoneSword), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', mod_InfiBase.sandstoneRod });
            ModLoader.addRecipe(new ItemStack(boneStoneSword), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneStoneSword), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', mod_InfiBase.boneRod });
            ModLoader.addRecipe(new ItemStack(netherrackStoneSword), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', mod_InfiBase.netherrackRod });
            ModLoader.addRecipe(new ItemStack(iceStoneSword), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', mod_InfiBase.iceRod });
            ModLoader.addRecipe(new ItemStack(slimeStoneSword), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', mod_InfiBase.slimeRod });
            ModLoader.addRecipe(new ItemStack(cactusStoneSword), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', mod_InfiBase.cactusRod });
            ModLoader.addRecipe(new ItemStack(flintStoneSword), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', mod_InfiBase.flintRod });
            
            ModLoader.addRecipe(new ItemStack(woodStoneSword), new Object[] 
                    { recipe, '#', Block.stone, '|', Item.stick });
        	ModLoader.addRecipe(new ItemStack(stoneStoneSword), new Object[] 
                    { recipe, '#', Block.stone, '|', mod_InfiBase.stoneRod });
            ModLoader.addRecipe(new ItemStack(sandstoneStoneSword), new Object[] 
                    { recipe, '#', Block.stone, '|', mod_InfiBase.sandstoneRod });
            ModLoader.addRecipe(new ItemStack(boneStoneSword), new Object[] 
                    { recipe, '#', Block.stone, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneStoneSword), new Object[] 
                    { recipe, '#', Block.stone, '|', mod_InfiBase.boneRod });
            ModLoader.addRecipe(new ItemStack(netherrackStoneSword), new Object[] 
                    { recipe, '#', Block.stone, '|', mod_InfiBase.netherrackRod });
            ModLoader.addRecipe(new ItemStack(iceStoneSword), new Object[] 
                    { recipe, '#', Block.stone, '|', mod_InfiBase.iceRod });
            ModLoader.addRecipe(new ItemStack(slimeStoneSword), new Object[] 
                    { recipe, '#', Block.stone, '|', mod_InfiBase.slimeRod });
            ModLoader.addRecipe(new ItemStack(cactusStoneSword), new Object[] 
                    { recipe, '#', Block.stone, '|', mod_InfiBase.cactusRod });
            ModLoader.addRecipe(new ItemStack(flintStoneSword), new Object[] 
                    { recipe, '#', Block.stone, '|', mod_InfiBase.flintRod });
        }
        
        if(PropsHelperInfiTools.enableIronTools)
        {
        	ModLoader.addRecipe(new ItemStack(woodIronSword), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', Item.stick });
        	ModLoader.addRecipe(new ItemStack(stoneIronSword), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', mod_InfiBase.stoneRod });
            ModLoader.addRecipe(new ItemStack(ironIronSword), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', mod_InfiBase.ironRod });
            ModLoader.addRecipe(new ItemStack(boneIronSword), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneIronSword), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', mod_InfiBase.boneRod });
            ModLoader.addRecipe(new ItemStack(netherrackIronSword), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', mod_InfiBase.netherrackRod });
            ModLoader.addRecipe(new ItemStack(glowstoneIronSword), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', mod_InfiBase.glowstoneRod });
            ModLoader.addRecipe(new ItemStack(cactusIronSword), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', mod_InfiBase.cactusRod });
            ModLoader.addRecipe(new ItemStack(copperIronSword), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', mod_InfiBase.copperRod });
            ModLoader.addRecipe(new ItemStack(bronzeIronSword), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', mod_InfiBase.bronzeRod });
        }
        
        if(PropsHelperInfiTools.enableDiamondTools)
        {
        	ModLoader.addRecipe(new ItemStack(woodDiamondSword), new Object[] 
                    { recipe, '#', Item.diamond, '|', Item.stick });
        	ModLoader.addRecipe(new ItemStack(stoneDiamondSword), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.stoneRod });
            ModLoader.addRecipe(new ItemStack(ironDiamondSword), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.ironRod });
            ModLoader.addRecipe(new ItemStack(diamondDiamondSword), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.diamondRod });
            ModLoader.addRecipe(new ItemStack(redstoneDiamondSword), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.redstoneRod });
            ModLoader.addRecipe(new ItemStack(obsidianDiamondSword), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.obsidianRod });
            ModLoader.addRecipe(new ItemStack(boneDiamondSword), new Object[] 
                    { recipe, '#', Item.diamond, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneDiamondSword), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.boneRod });
            ModLoader.addRecipe(new ItemStack(mossyDiamondSword), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.mossyRod });
            ModLoader.addRecipe(new ItemStack(netherrackDiamondSword), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.netherrackRod });
            ModLoader.addRecipe(new ItemStack(glowstoneDiamondSword), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.glowstoneRod });
            ModLoader.addRecipe(new ItemStack(lavaDiamondSword), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.lavaRod });
            ModLoader.addRecipe(new ItemStack(cactusDiamondSword), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.cactusRod });
            ModLoader.addRecipe(new ItemStack(flintDiamondSword), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.flintRod });
            ModLoader.addRecipe(new ItemStack(blazeDiamondSword), new Object[] 
                    { recipe, '#', Item.diamond, '|', Item.blazeRod });
            ModLoader.addRecipe(new ItemStack(copperDiamondSword), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.copperRod });
            ModLoader.addRecipe(new ItemStack(bronzeDiamondSword), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.bronzeRod });
            ModLoader.addRecipe(new ItemStack(workedDiamondSword), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.workedIronRod });
            ModLoader.addRecipe(new ItemStack(steelDiamondSword), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.steelRod });
            ModLoader.addRecipe(new ItemStack(cobaltDiamondSword), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.cobaltRod });
            ModLoader.addRecipe(new ItemStack(arditeDiamondSword), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.arditeRod });
            ModLoader.addRecipe(new ItemStack(manyullynDiamondSword), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.manyullynRod });
            ModLoader.addRecipe(new ItemStack(uraniumDiamondSword), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.uraniumRod });
        }
        
        if(PropsHelperInfiTools.enableRedstoneTools)
        {
        	ModLoader.addRecipe(new ItemStack(woodRedstoneSword), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', Item.stick });
        	ModLoader.addRecipe(new ItemStack(stoneRedstoneSword), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.stoneRod });
            ModLoader.addRecipe(new ItemStack(ironRedstoneSword), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.ironRod });
            ModLoader.addRecipe(new ItemStack(redstoneRedstoneSword), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.redstoneRod });
            ModLoader.addRecipe(new ItemStack(obsidianRedstoneSword), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.obsidianRod });
            ModLoader.addRecipe(new ItemStack(sandstoneRedstoneSword), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.sandstoneRod });
            ModLoader.addRecipe(new ItemStack(boneRedstoneSword), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneRedstoneSword), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.boneRod });
            ModLoader.addRecipe(new ItemStack(paperRedstoneSword), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.paperRod });
            ModLoader.addRecipe(new ItemStack(mossyRedstoneSword), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.mossyRod });
            ModLoader.addRecipe(new ItemStack(netherrackRedstoneSword), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.netherrackRod });
            ModLoader.addRecipe(new ItemStack(glowstoneRedstoneSword), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.glowstoneRod });
            ModLoader.addRecipe(new ItemStack(iceRedstoneSword), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.iceRod });
            ModLoader.addRecipe(new ItemStack(lavaRedstoneSword), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.lavaRod });
            ModLoader.addRecipe(new ItemStack(slimeRedstoneSword), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.slimeRod });
            ModLoader.addRecipe(new ItemStack(cactusRedstoneSword), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.cactusRod });
            ModLoader.addRecipe(new ItemStack(flintRedstoneSword), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.flintRod });
            ModLoader.addRecipe(new ItemStack(copperRedstoneSword), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.copperRod });
            ModLoader.addRecipe(new ItemStack(bronzeRedstoneSword), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.bronzeRod });
            ModLoader.addRecipe(new ItemStack(workedRedstoneSword), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.workedIronRod });
            ModLoader.addRecipe(new ItemStack(uraniumRedstoneSword), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.uraniumRod });
        }
        
        if(PropsHelperInfiTools.enableObsidianTools)
        {
        	ModLoader.addRecipe(new ItemStack(woodObsidianSword), new Object[] 
                    { recipe, '#', Block.obsidian, '|', Item.stick });
        	ModLoader.addRecipe(new ItemStack(stoneObsidianSword), new Object[] 
                    { recipe, '#', Block.obsidian, '|', mod_InfiBase.stoneRod });
            ModLoader.addRecipe(new ItemStack(redstoneObsidianSword), new Object[] 
                    { recipe, '#', Block.obsidian, '|', mod_InfiBase.redstoneRod });
            ModLoader.addRecipe(new ItemStack(obsidianObsidianSword), new Object[] 
                    { recipe, '#', Block.obsidian, '|', mod_InfiBase.obsidianRod });
            ModLoader.addRecipe(new ItemStack(boneObsidianSword), new Object[] 
                    { recipe, '#', Block.obsidian, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneObsidianSword), new Object[] 
                    { recipe, '#', Block.obsidian, '|', mod_InfiBase.boneRod });
            ModLoader.addRecipe(new ItemStack(netherrackObsidianSword), new Object[] 
                    { recipe, '#', Block.obsidian, '|', mod_InfiBase.netherrackRod });
            ModLoader.addRecipe(new ItemStack(glowstoneObsidianSword), new Object[] 
                    { recipe, '#', Block.obsidian, '|', mod_InfiBase.glowstoneRod });
            ModLoader.addRecipe(new ItemStack(iceObsidianSword), new Object[] 
                    { recipe, '#', Block.obsidian, '|', mod_InfiBase.iceRod });
            ModLoader.addRecipe(new ItemStack(lavaObsidianSword), new Object[] 
                    { recipe, '#', Block.obsidian, '|', mod_InfiBase.lavaRod });
            ModLoader.addRecipe(new ItemStack(cactusObsidianSword), new Object[] 
                    { recipe, '#', Block.obsidian, '|', mod_InfiBase.cactusRod });
        }
        
        if(PropsHelperInfiTools.enableSandstoneTools)
        {
            ModLoader.addRecipe(new ItemStack(woodSandstoneSword), new Object[] 
                    { recipe, '#', Block.sandStone, '|', Item.stick });
            ModLoader.addRecipe(new ItemStack(sandstoneSandstoneSword), new Object[] 
                    { recipe, '#', Block.sandStone, '|', mod_InfiBase.sandstoneRod });
            ModLoader.addRecipe(new ItemStack(boneSandstoneSword), new Object[] 
                    { recipe, '#', Block.sandStone, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneSandstoneSword), new Object[] 
                    { recipe, '#', Block.sandStone, '|', mod_InfiBase.boneRod });      
            ModLoader.addRecipe(new ItemStack(netherrackSandstoneSword), new Object[] 
                    { recipe, '#', Block.sandStone, '|', mod_InfiBase.netherrackRod });
            ModLoader.addRecipe(new ItemStack(iceSandstoneSword), new Object[] 
                    { recipe, '#', Block.sandStone, '|', mod_InfiBase.iceRod });
            ModLoader.addRecipe(new ItemStack(slimeSandstoneSword), new Object[] 
                    { recipe, '#', Block.sandStone, '|', mod_InfiBase.slimeRod });
            ModLoader.addRecipe(new ItemStack(cactusSandstoneSword), new Object[] 
                    { recipe, '#', Block.sandStone, '|', mod_InfiBase.cactusRod });
            ModLoader.addRecipe(new ItemStack(flintSandstoneSword), new Object[] 
                    { recipe, '#', Block.sandStone, '|', mod_InfiBase.flintRod });
        }
        
        if(PropsHelperInfiTools.enableBoneTools)
        {
            ModLoader.addRecipe(new ItemStack(woodBoneSword), new Object[] 
                    { recipe, '#', Item.bone, '|', Item.stick });
            ModLoader.addRecipe(new ItemStack(stoneBoneSword), new Object[] 
                    { recipe, '#', Item.bone, '|', mod_InfiBase.stoneRod });
            ModLoader.addRecipe(new ItemStack(sandstoneBoneSword), new Object[] 
                    { recipe, '#', Item.bone, '|', mod_InfiBase.sandstoneRod });
            ModLoader.addRecipe(new ItemStack(boneBoneSword), new Object[] 
                    { recipe, '#', Item.bone, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneBoneSword), new Object[] 
                    { recipe, '#', Item.bone, '|', mod_InfiBase.boneRod });
            ModLoader.addRecipe(new ItemStack(paperBoneSword), new Object[] 
                    { recipe, '#', Item.bone, '|', mod_InfiBase.paperRod });
            ModLoader.addRecipe(new ItemStack(netherrackBoneSword), new Object[] 
                    { recipe, '#', Item.bone, '|', mod_InfiBase.netherrackRod });
            ModLoader.addRecipe(new ItemStack(iceBoneSword), new Object[] 
                    { recipe, '#', Item.bone, '|', mod_InfiBase.iceRod });
            ModLoader.addRecipe(new ItemStack(cactusBoneSword), new Object[] 
                    { recipe, '#', Item.bone, '|', mod_InfiBase.cactusRod });
            ModLoader.addRecipe(new ItemStack(flintBoneSword), new Object[] 
                    { recipe, '#', Item.bone, '|', mod_InfiBase.flintRod });
        }
        
        if(PropsHelperInfiTools.enablePaperTools)
        {
            ModLoader.addRecipe(new ItemStack(woodPaperSword), new Object[] 
                    { recipe, '#', mod_InfiBase.paperStack, '|', Item.stick });
            ModLoader.addRecipe(new ItemStack(bonePaperSword), new Object[] 
                    { recipe, '#', mod_InfiBase.paperStack, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(bonePaperSword), new Object[] 
                    { recipe, '#', mod_InfiBase.paperStack, '|', mod_InfiBase.boneRod });
            ModLoader.addRecipe(new ItemStack(paperPaperSword), new Object[] 
                    { recipe, '#', mod_InfiBase.paperStack, '|', mod_InfiBase.paperRod });
            ModLoader.addRecipe(new ItemStack(slimePaperSword), new Object[] 
                    { recipe, '#', mod_InfiBase.paperStack, '|', mod_InfiBase.slimeRod });
            ModLoader.addRecipe(new ItemStack(cactusPaperSword), new Object[] 
                    { recipe, '#', mod_InfiBase.paperStack, '|', mod_InfiBase.cactusRod });
        }
        
        if(PropsHelperInfiTools.enableMossyTools)
        {
        	ModLoader.addRecipe(new ItemStack(woodMossySword), new Object[] 
                    { recipe, '#', mod_InfiBase.mossyStone, '|', Item.stick });
        	ModLoader.addRecipe(new ItemStack(stoneMossySword), new Object[] 
                    { recipe, '#', mod_InfiBase.mossyStone, '|', mod_InfiBase.stoneRod });
            ModLoader.addRecipe(new ItemStack(diamondMossySword), new Object[] 
                    { recipe, '#', mod_InfiBase.mossyStone, '|', mod_InfiBase.diamondRod });
            ModLoader.addRecipe(new ItemStack(redstoneMossySword), new Object[] 
                    { recipe, '#', mod_InfiBase.mossyStone, '|', mod_InfiBase.redstoneRod });
            ModLoader.addRecipe(new ItemStack(boneMossySword), new Object[] 
                    { recipe, '#', mod_InfiBase.mossyStone, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneMossySword), new Object[] 
                    { recipe, '#', mod_InfiBase.mossyStone, '|', mod_InfiBase.boneRod });
            ModLoader.addRecipe(new ItemStack(mossyMossySword), new Object[] 
                    { recipe, '#', mod_InfiBase.mossyStone, '|', mod_InfiBase.mossyRod });
            ModLoader.addRecipe(new ItemStack(netherrackMossySword), new Object[] 
                    { recipe, '#', mod_InfiBase.mossyStone, '|', mod_InfiBase.netherrackRod });
            ModLoader.addRecipe(new ItemStack(glowstoneMossySword), new Object[] 
                    { recipe, '#', mod_InfiBase.mossyStone, '|', mod_InfiBase.glowstoneRod });
            ModLoader.addRecipe(new ItemStack(cactusMossySword), new Object[] 
                    { recipe, '#', mod_InfiBase.mossyStone, '|', mod_InfiBase.cactusRod });
            ModLoader.addRecipe(new ItemStack(blazeMossySword), new Object[] 
                    { recipe, '#', mod_InfiBase.mossyStone, '|', Item.blazeRod });
            ModLoader.addRecipe(new ItemStack(manyullynMossySword), new Object[] 
                    { recipe, '#', mod_InfiBase.mossyStone, '|', mod_InfiBase.manyullynRod });
            ModLoader.addRecipe(new ItemStack(uraniumMossySword), new Object[] 
                    { recipe, '#', mod_InfiBase.mossyStone, '|', mod_InfiBase.uraniumRod });
        }
        
        if(PropsHelperInfiTools.enableNetherrackTools)
        {
        	ModLoader.addRecipe(new ItemStack(woodNetherrackSword), new Object[] 
                    { recipe, '#', Block.netherrack, '|', Item.stick });
        	ModLoader.addRecipe(new ItemStack(stoneNetherrackSword), new Object[] 
                    { recipe, '#', Block.netherrack, '|', mod_InfiBase.stoneRod });
            ModLoader.addRecipe(new ItemStack(sandstoneNetherrackSword), new Object[] 
                    { recipe, '#', Block.netherrack, '|', mod_InfiBase.sandstoneRod });
            ModLoader.addRecipe(new ItemStack(boneNetherrackSword), new Object[] 
                    { recipe, '#', Block.netherrack, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneNetherrackSword), new Object[] 
                    { recipe, '#', Block.netherrack, '|', mod_InfiBase.boneRod });
            ModLoader.addRecipe(new ItemStack(paperNetherrackSword), new Object[] 
                    { recipe, '#', Block.netherrack, '|', mod_InfiBase.paperRod });
            ModLoader.addRecipe(new ItemStack(mossyNetherrackSword), new Object[] 
                    { recipe, '#', Block.netherrack, '|', mod_InfiBase.mossyRod });
            ModLoader.addRecipe(new ItemStack(netherrackNetherrackSword), new Object[] 
                    { recipe, '#', Block.netherrack, '|', mod_InfiBase.netherrackRod });
            ModLoader.addRecipe(new ItemStack(iceNetherrackSword), new Object[] 
                    { recipe, '#', Block.netherrack, '|', mod_InfiBase.iceRod });
            ModLoader.addRecipe(new ItemStack(slimeNetherrackSword), new Object[] 
                    { recipe, '#', Block.netherrack, '|', mod_InfiBase.slimeRod });
            ModLoader.addRecipe(new ItemStack(cactusNetherrackSword), new Object[] 
                    { recipe, '#', Block.netherrack, '|', mod_InfiBase.cactusRod });
            ModLoader.addRecipe(new ItemStack(flintNetherrackSword), new Object[] 
                    { recipe, '#', Block.netherrack, '|', mod_InfiBase.flintRod });
            ModLoader.addRecipe(new ItemStack(copperNetherrackSword), new Object[] 
                    { recipe, '#', Block.netherrack, '|', mod_InfiBase.copperRod });
            ModLoader.addRecipe(new ItemStack(bronzeNetherrackSword), new Object[] 
                    { recipe, '#', Block.netherrack, '|', mod_InfiBase.bronzeRod });
        }
        
        if(PropsHelperInfiTools.enableGlowstoneTools)
        {
        	ModLoader.addRecipe(new ItemStack(woodGlowstoneSword), new Object[] 
                    { recipe, '#', mod_InfiBase.glowstoneCrystal, '|', Item.stick });
        	ModLoader.addRecipe(new ItemStack(redstoneGlowstoneSword), new Object[] 
                    { recipe, '#', mod_InfiBase.glowstoneCrystal, '|', mod_InfiBase.glowstoneRod });
        	ModLoader.addRecipe(new ItemStack(obsidianGlowstoneSword), new Object[] 
                    { recipe, '#', mod_InfiBase.glowstoneCrystal, '|', mod_InfiBase.obsidianRod });
            ModLoader.addRecipe(new ItemStack(boneGlowstoneSword), new Object[] 
                    { recipe, '#', mod_InfiBase.glowstoneCrystal, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneGlowstoneSword), new Object[] 
                    { recipe, '#', mod_InfiBase.glowstoneCrystal, '|', mod_InfiBase.boneRod });
            ModLoader.addRecipe(new ItemStack(netherrackGlowstoneSword), new Object[] 
                    { recipe, '#', mod_InfiBase.glowstoneCrystal, '|', mod_InfiBase.netherrackRod });
            ModLoader.addRecipe(new ItemStack(iceGlowstoneSword), new Object[] 
                    { recipe, '#', mod_InfiBase.glowstoneCrystal, '|', mod_InfiBase.iceRod });
            ModLoader.addRecipe(new ItemStack(slimeGlowstoneSword), new Object[] 
                    { recipe, '#', mod_InfiBase.glowstoneCrystal, '|', mod_InfiBase.slimeRod });
            ModLoader.addRecipe(new ItemStack(cactusGlowstoneSword), new Object[] 
                    { recipe, '#', mod_InfiBase.glowstoneCrystal, '|', mod_InfiBase.cactusRod });
        }
        
        if(PropsHelperInfiTools.enableIceTools)
        {
            ModLoader.addRecipe(new ItemStack(woodIceSword), new Object[] 
                    { recipe, '#', Block.ice, '|', Item.stick });
            ModLoader.addRecipe(new ItemStack(boneIceSword), new Object[] 
                    { recipe, '#', Block.ice, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneIceSword), new Object[] 
                    { recipe, '#', Block.ice, '|', mod_InfiBase.boneRod });
            ModLoader.addRecipe(new ItemStack(paperIceSword), new Object[] 
                    { recipe, '#', Block.ice, '|', mod_InfiBase.paperRod });
            ModLoader.addRecipe(new ItemStack(iceIceSword), new Object[] 
                    { recipe, '#', Block.ice, '|', mod_InfiBase.iceRod });
            ModLoader.addRecipe(new ItemStack(slimeIceSword), new Object[] 
                    { recipe, '#', Block.ice, '|', mod_InfiBase.slimeRod });
            ModLoader.addRecipe(new ItemStack(cactusIceSword), new Object[] 
                    { recipe, '#', Block.ice, '|', mod_InfiBase.cactusRod });
        }
        
        if(PropsHelperInfiTools.enableLavaTools)
        {
            ModLoader.addRecipe(new ItemStack(diamondLavaSword), new Object[] 
                    { recipe, '#', mod_InfiBase.lavaCrystal, '|', mod_InfiBase.diamondRod });
            ModLoader.addRecipe(new ItemStack(obsidianLavaSword), new Object[] 
                    { recipe, '#', mod_InfiBase.lavaCrystal, '|', mod_InfiBase.obsidianRod });
            ModLoader.addRecipe(new ItemStack(netherrackLavaSword), new Object[] 
                    { recipe, '#', mod_InfiBase.lavaCrystal, '|', mod_InfiBase.netherrackRod });
            ModLoader.addRecipe(new ItemStack(lavaLavaSword), new Object[] 
                    { recipe, '#', mod_InfiBase.lavaCrystal, '|', mod_InfiBase.lavaRod });
            ModLoader.addRecipe(new ItemStack(flintLavaSword), new Object[] 
                    { recipe, '#', mod_InfiBase.lavaCrystal, '|', mod_InfiBase.flintRod });
            ModLoader.addRecipe(new ItemStack(blazeLavaSword), new Object[] 
                    { recipe, '#', mod_InfiBase.lavaCrystal, '|', Item.blazeRod });
            ModLoader.addRecipe(new ItemStack(manyullynLavaSword), new Object[] 
                    { recipe, '#', mod_InfiBase.lavaCrystal, '|', mod_InfiBase.manyullynRod });
            ModLoader.addRecipe(new ItemStack(uraniumLavaSword), new Object[] 
                    { recipe, '#', mod_InfiBase.lavaCrystal, '|', mod_InfiBase.uraniumRod });
        }
        
        if(PropsHelperInfiTools.enableSlimeTools)
        {
            ModLoader.addRecipe(new ItemStack(woodSlimeSword), new Object[] 
                    { recipe, '#', mod_InfiBase.slimeCrystal, '|', Item.stick });
            ModLoader.addRecipe(new ItemStack(sandstoneSlimeSword), new Object[] 
                    { recipe, '#', mod_InfiBase.slimeCrystal, '|', mod_InfiBase.sandstoneRod });
            ModLoader.addRecipe(new ItemStack(boneSlimeSword), new Object[] 
                    { recipe, '#', mod_InfiBase.slimeCrystal, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneSlimeSword), new Object[] 
                    { recipe, '#', mod_InfiBase.slimeCrystal, '|', mod_InfiBase.boneRod });
            ModLoader.addRecipe(new ItemStack(paperSlimeSword), new Object[] 
                    { recipe, '#', mod_InfiBase.slimeCrystal, '|', mod_InfiBase.paperRod });
            ModLoader.addRecipe(new ItemStack(slimeSlimeSword), new Object[] 
                    { recipe, '#', mod_InfiBase.slimeCrystal, '|', mod_InfiBase.slimeRod });
            ModLoader.addRecipe(new ItemStack(cactusSlimeSword), new Object[] 
                    { recipe, '#', mod_InfiBase.slimeCrystal, '|', mod_InfiBase.cactusRod });
        }
        
        if(PropsHelperInfiTools.enableCactusTools)
        {
            ModLoader.addRecipe(new ItemStack(woodCactusSword), new Object[] 
                    { recipe, '#', Block.cactus, '|', Item.stick });
            ModLoader.addRecipe(new ItemStack(sandstoneCactusSword), new Object[] 
                    { recipe, '#', Block.cactus, '|', mod_InfiBase.sandstoneRod });
            ModLoader.addRecipe(new ItemStack(boneCactusSword), new Object[] 
                    { recipe, '#', Block.cactus, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneCactusSword), new Object[] 
                    { recipe, '#', Block.cactus, '|', mod_InfiBase.boneRod });
            ModLoader.addRecipe(new ItemStack(netherrackCactusSword), new Object[] 
                    { recipe, '#', Block.cactus, '|', mod_InfiBase.netherrackRod });
            ModLoader.addRecipe(new ItemStack(iceCactusSword), new Object[] 
                    { recipe, '#', Block.cactus, '|', mod_InfiBase.iceRod });
            ModLoader.addRecipe(new ItemStack(slimeCactusSword), new Object[] 
                    { recipe, '#', Block.cactus, '|', mod_InfiBase.slimeRod });
            ModLoader.addRecipe(new ItemStack(cactusCactusSword), new Object[] 
                    { recipe, '#', Block.cactus, '|', mod_InfiBase.cactusRod });
        }
        
        if(PropsHelperInfiTools.enableFlintTools)
        {
        	ModLoader.addRecipe(new ItemStack(woodFlintSword), new Object[] 
                    { recipe, '#', Item.flint, '|', Item.stick });
        	ModLoader.addRecipe(new ItemStack(stoneFlintSword), new Object[] 
                    { recipe, '#', Item.flint, '|', mod_InfiBase.stoneRod });
            ModLoader.addRecipe(new ItemStack(sandstoneFlintSword), new Object[] 
                    { recipe, '#', Item.flint, '|', mod_InfiBase.sandstoneRod });
            ModLoader.addRecipe(new ItemStack(boneFlintSword), new Object[] 
                    { recipe, '#', Item.flint, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneFlintSword), new Object[] 
                    { recipe, '#', Item.flint, '|', mod_InfiBase.boneRod });
            ModLoader.addRecipe(new ItemStack(netherrackFlintSword), new Object[] 
                    { recipe, '#', Item.flint, '|', mod_InfiBase.netherrackRod });
            ModLoader.addRecipe(new ItemStack(slimeFlintSword), new Object[] 
                    { recipe, '#', Item.flint, '|', mod_InfiBase.slimeRod });
            ModLoader.addRecipe(new ItemStack(cactusFlintSword), new Object[] 
                    { recipe, '#', Item.flint, '|', mod_InfiBase.cactusRod });
            ModLoader.addRecipe(new ItemStack(flintFlintSword), new Object[] 
                    { recipe, '#', Item.flint, '|', mod_InfiBase.flintRod });
            ModLoader.addRecipe(new ItemStack(copperFlintSword), new Object[] 
                    { recipe, '#', Block.netherrack, '|', mod_InfiBase.copperRod });
            ModLoader.addRecipe(new ItemStack(bronzeFlintSword), new Object[] 
                    { recipe, '#', Block.netherrack, '|', mod_InfiBase.bronzeRod });
        }
        
        if(PropsHelperInfiTools.enableBlazeTools)
        {
            ModLoader.addRecipe(new ItemStack(diamondBlazeSword), new Object[] 
                    { recipe, '#', mod_InfiBase.blazeCrystal, '|', mod_InfiBase.diamondRod });
            ModLoader.addRecipe(new ItemStack(obsidianBlazeSword), new Object[] 
                    { recipe, '#', mod_InfiBase.blazeCrystal, '|', mod_InfiBase.obsidianRod });
            ModLoader.addRecipe(new ItemStack(netherrackBlazeSword), new Object[] 
                    { recipe, '#', mod_InfiBase.blazeCrystal, '|', mod_InfiBase.netherrackRod });
            ModLoader.addRecipe(new ItemStack(lavaBlazeSword), new Object[] 
                    { recipe, '#', mod_InfiBase.blazeCrystal, '|', mod_InfiBase.lavaRod });
            ModLoader.addRecipe(new ItemStack(flintBlazeSword), new Object[] 
                    { recipe, '#', mod_InfiBase.blazeCrystal, '|', mod_InfiBase.flintRod });
            ModLoader.addRecipe(new ItemStack(blazeBlazeSword), new Object[] 
                    { recipe, '#', mod_InfiBase.blazeCrystal, '|', Item.blazeRod });
            ModLoader.addRecipe(new ItemStack(manyullynBlazeSword), new Object[] 
                    { recipe, '#', mod_InfiBase.blazeCrystal, '|', mod_InfiBase.manyullynRod });
            ModLoader.addRecipe(new ItemStack(uraniumBlazeSword), new Object[] 
                    { recipe, '#', mod_InfiBase.blazeCrystal, '|', mod_InfiBase.uraniumRod });
        }
    }
    
    public static void addStoneTools(ItemStack stack)
    {
    	ModLoader.addRecipe(new ItemStack(woodStoneSword), new Object[] 
                { recipe, '#', stack, '|', Item.stick });
    	ModLoader.addRecipe(new ItemStack(stoneStoneSword), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.stoneRod });
        ModLoader.addRecipe(new ItemStack(sandstoneStoneSword), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.sandstoneRod });
        ModLoader.addRecipe(new ItemStack(boneStoneSword), new Object[] 
                { recipe, '#', stack, '|', Item.bone });
        ModLoader.addRecipe(new ItemStack(boneStoneSword), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.boneRod });
        ModLoader.addRecipe(new ItemStack(netherrackStoneSword), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.netherrackRod });
        ModLoader.addRecipe(new ItemStack(iceStoneSword), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.iceRod });
        ModLoader.addRecipe(new ItemStack(slimeStoneSword), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.slimeRod });
        ModLoader.addRecipe(new ItemStack(cactusStoneSword), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.cactusRod });
        ModLoader.addRecipe(new ItemStack(flintStoneSword), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.flintRod });
    }
    
    public static void addCopperTools(ItemStack stack)
    {
    	ModLoader.addRecipe(new ItemStack(woodCopperSword), new Object[] 
                { recipe, '#', stack, '|', Item.stick });
        ModLoader.addRecipe(new ItemStack(stoneCopperSword), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.stoneRod });
        ModLoader.addRecipe(new ItemStack(boneCopperSword), new Object[] 
                { recipe, '#', stack, '|', Item.bone });
        ModLoader.addRecipe(new ItemStack(boneCopperSword), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.boneRod });
        ModLoader.addRecipe(new ItemStack(netherrackCopperSword), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.netherrackRod });
        ModLoader.addRecipe(new ItemStack(slimeCopperSword), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.slimeRod });
        ModLoader.addRecipe(new ItemStack(cactusCopperSword), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.cactusRod });
        ModLoader.addRecipe(new ItemStack(flintCopperSword), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.flintRod });
        ModLoader.addRecipe(new ItemStack(copperCopperSword), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.copperRod });
    }
    
    public static void addBronzeTools(ItemStack stack)
    {
    	ModLoader.addRecipe(new ItemStack(woodBronzeSword), new Object[] 
                { recipe, '#', stack, '|', Item.stick });
        ModLoader.addRecipe(new ItemStack(stoneBronzeSword), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.stoneRod });
        ModLoader.addRecipe(new ItemStack(boneBronzeSword), new Object[] 
                { recipe, '#', stack, '|', Item.bone });
        ModLoader.addRecipe(new ItemStack(boneBronzeSword), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.boneRod });
        ModLoader.addRecipe(new ItemStack(netherrackBronzeSword), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.netherrackRod });
        ModLoader.addRecipe(new ItemStack(slimeBronzeSword), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.slimeRod });
        ModLoader.addRecipe(new ItemStack(cactusBronzeSword), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.cactusRod });
        ModLoader.addRecipe(new ItemStack(flintBronzeSword), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.flintRod });
        ModLoader.addRecipe(new ItemStack(copperBronzeSword), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.copperRod });
        ModLoader.addRecipe(new ItemStack(bronzeBronzeSword), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.bronzeRod });
    }
    
    public static void addWorkedIronTools(ItemStack stack)
    {
    	ModLoader.addRecipe(new ItemStack(woodWorkedIronSword), new Object[] 
                { recipe, '#', stack, '|', Item.stick });
        ModLoader.addRecipe(new ItemStack(stoneWorkedIronSword), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.stoneRod });
        ModLoader.addRecipe(new ItemStack(ironWorkedIronSword), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.ironRod });
        ModLoader.addRecipe(new ItemStack(diamondWorkedIronSword), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.diamondRod });
        ModLoader.addRecipe(new ItemStack(redstoneWorkedIronSword), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.redstoneRod });
        ModLoader.addRecipe(new ItemStack(obsidianWorkedIronSword), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.obsidianRod });
        ModLoader.addRecipe(new ItemStack(boneWorkedIronSword), new Object[] 
                { recipe, '#', stack, '|', Item.bone });
        ModLoader.addRecipe(new ItemStack(boneWorkedIronSword), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.boneRod });
        ModLoader.addRecipe(new ItemStack(netherrackWorkedIronSword), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.netherrackRod });
        ModLoader.addRecipe(new ItemStack(glowstoneWorkedIronSword), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.glowstoneRod });
        ModLoader.addRecipe(new ItemStack(iceWorkedIronSword), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.iceRod });
        ModLoader.addRecipe(new ItemStack(slimeWorkedIronSword), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.slimeRod });
        ModLoader.addRecipe(new ItemStack(cactusWorkedIronSword), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.cactusRod });
        ModLoader.addRecipe(new ItemStack(blazeWorkedIronSword), new Object[] 
                { recipe, '#', stack, '|', Item.blazeRod });
        ModLoader.addRecipe(new ItemStack(copperWorkedIronSword), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.copperRod });
        ModLoader.addRecipe(new ItemStack(bronzeWorkedIronSword), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.bronzeRod });
        ModLoader.addRecipe(new ItemStack(workedWorkedIronSword), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.workedIronRod });
        ModLoader.addRecipe(new ItemStack(steelWorkedIronSword), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.steelRod });
        ModLoader.addRecipe(new ItemStack(uraniumWorkedIronSword), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.uraniumRod });
    }
    
    public static void addSteelTools(ItemStack stack)
    {
    	ModLoader.addRecipe(new ItemStack(woodSteelSword), new Object[] 
                { recipe, '#', stack, '|', Item.stick });
        ModLoader.addRecipe(new ItemStack(stoneSteelSword), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.stoneRod });
        ModLoader.addRecipe(new ItemStack(ironSteelSword), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.ironRod });
        ModLoader.addRecipe(new ItemStack(diamondSteelSword), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.diamondRod });
        ModLoader.addRecipe(new ItemStack(redstoneSteelSword), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.redstoneRod });
        ModLoader.addRecipe(new ItemStack(obsidianSteelSword), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.obsidianRod });
        ModLoader.addRecipe(new ItemStack(boneSteelSword), new Object[] 
                { recipe, '#', stack, '|', Item.bone });
        ModLoader.addRecipe(new ItemStack(boneSteelSword), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.boneRod });
        ModLoader.addRecipe(new ItemStack(netherrackSteelSword), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.netherrackRod });
        ModLoader.addRecipe(new ItemStack(glowstoneSteelSword), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.glowstoneRod });
        ModLoader.addRecipe(new ItemStack(iceSteelSword), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.iceRod });
        ModLoader.addRecipe(new ItemStack(slimeSteelSword), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.slimeRod });
        ModLoader.addRecipe(new ItemStack(cactusSteelSword), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.cactusRod });
        ModLoader.addRecipe(new ItemStack(blazeSteelSword), new Object[] 
                { recipe, '#', stack, '|', Item.blazeRod });
        ModLoader.addRecipe(new ItemStack(copperSteelSword), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.copperRod });
        ModLoader.addRecipe(new ItemStack(bronzeSteelSword), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.bronzeRod });
        ModLoader.addRecipe(new ItemStack(workedSteelSword), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.workedIronRod });
        ModLoader.addRecipe(new ItemStack(steelSteelSword), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.steelRod });
        ModLoader.addRecipe(new ItemStack(cobaltSteelSword), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.cobaltRod });
        ModLoader.addRecipe(new ItemStack(arditeSteelSword), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.arditeRod });
        ModLoader.addRecipe(new ItemStack(uraniumSteelSword), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.uraniumRod });
    }
    
    public static void addCobaltTools(ItemStack stack)
    {
    	ModLoader.addRecipe(new ItemStack(woodCobaltSword), new Object[] 
                { recipe, '#', stack, '|', Item.stick });
        ModLoader.addRecipe(new ItemStack(stoneCobaltSword), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.stoneRod });
        ModLoader.addRecipe(new ItemStack(ironCobaltSword), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.ironRod });
        ModLoader.addRecipe(new ItemStack(diamondCobaltSword), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.diamondRod });
        ModLoader.addRecipe(new ItemStack(redstoneCobaltSword), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.redstoneRod });
        ModLoader.addRecipe(new ItemStack(obsidianCobaltSword), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.obsidianRod });
        ModLoader.addRecipe(new ItemStack(boneCobaltSword), new Object[] 
                { recipe, '#', stack, '|', Item.bone });
        ModLoader.addRecipe(new ItemStack(boneCobaltSword), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.boneRod });
        ModLoader.addRecipe(new ItemStack(slimeCobaltSword), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.slimeRod });
        ModLoader.addRecipe(new ItemStack(cactusCobaltSword), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.cactusRod });
        ModLoader.addRecipe(new ItemStack(blazeCobaltSword), new Object[] 
                { recipe, '#', stack, '|', Item.blazeRod });
        ModLoader.addRecipe(new ItemStack(copperCobaltSword), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.copperRod });
        ModLoader.addRecipe(new ItemStack(bronzeCobaltSword), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.bronzeRod });
        ModLoader.addRecipe(new ItemStack(workedCobaltSword), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.workedIronRod });
        ModLoader.addRecipe(new ItemStack(steelCobaltSword), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.steelRod });
        ModLoader.addRecipe(new ItemStack(cobaltCobaltSword), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.cobaltRod });
        ModLoader.addRecipe(new ItemStack(arditeCobaltSword), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.arditeRod });
        ModLoader.addRecipe(new ItemStack(manyullynCobaltSword), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.manyullynRod });
        ModLoader.addRecipe(new ItemStack(uraniumCobaltSword), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.uraniumRod });
    }
    
    public static void addArditeTools(ItemStack stack)
    {
    	ModLoader.addRecipe(new ItemStack(woodArditeSword), new Object[] 
                { recipe, '#', stack, '|', Item.stick });
        ModLoader.addRecipe(new ItemStack(stoneArditeSword), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.stoneRod });
        ModLoader.addRecipe(new ItemStack(ironArditeSword), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.ironRod });
        ModLoader.addRecipe(new ItemStack(diamondArditeSword), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.diamondRod });
        ModLoader.addRecipe(new ItemStack(redstoneArditeSword), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.redstoneRod });
        ModLoader.addRecipe(new ItemStack(obsidianArditeSword), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.obsidianRod });
        ModLoader.addRecipe(new ItemStack(boneArditeSword), new Object[] 
                { recipe, '#', stack, '|', Item.bone });
        ModLoader.addRecipe(new ItemStack(boneArditeSword), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.boneRod });
        ModLoader.addRecipe(new ItemStack(slimeArditeSword), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.slimeRod });
        ModLoader.addRecipe(new ItemStack(cactusArditeSword), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.cactusRod });
        ModLoader.addRecipe(new ItemStack(blazeArditeSword), new Object[] 
                { recipe, '#', stack, '|', Item.blazeRod });
        ModLoader.addRecipe(new ItemStack(copperArditeSword), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.copperRod });
        ModLoader.addRecipe(new ItemStack(bronzeArditeSword), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.bronzeRod });
        ModLoader.addRecipe(new ItemStack(workedArditeSword), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.workedIronRod });
        ModLoader.addRecipe(new ItemStack(steelArditeSword), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.steelRod });
        ModLoader.addRecipe(new ItemStack(cobaltArditeSword), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.cobaltRod });
        ModLoader.addRecipe(new ItemStack(arditeArditeSword), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.arditeRod });
        ModLoader.addRecipe(new ItemStack(manyullynArditeSword), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.manyullynRod });
        ModLoader.addRecipe(new ItemStack(uraniumArditeSword), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.uraniumRod });
    }
    
    public static void addManyullynTools(ItemStack stack)
    {
    	ModLoader.addRecipe(new ItemStack(woodManyullynSword), new Object[] 
                { recipe, '#', stack, '|', Item.stick });
        ModLoader.addRecipe(new ItemStack(stoneManyullynSword), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.stoneRod });
        ModLoader.addRecipe(new ItemStack(ironManyullynSword), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.ironRod });
        ModLoader.addRecipe(new ItemStack(diamondManyullynSword), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.diamondRod });
        ModLoader.addRecipe(new ItemStack(redstoneManyullynSword), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.redstoneRod });
        ModLoader.addRecipe(new ItemStack(obsidianManyullynSword), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.obsidianRod });
        ModLoader.addRecipe(new ItemStack(boneManyullynSword), new Object[] 
                { recipe, '#', stack, '|', Item.bone });
        ModLoader.addRecipe(new ItemStack(boneManyullynSword), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.boneRod });
        ModLoader.addRecipe(new ItemStack(slimeManyullynSword), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.slimeRod });
        ModLoader.addRecipe(new ItemStack(cactusManyullynSword), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.cactusRod });
        ModLoader.addRecipe(new ItemStack(blazeManyullynSword), new Object[] 
                { recipe, '#', stack, '|', Item.blazeRod });
        ModLoader.addRecipe(new ItemStack(copperManyullynSword), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.copperRod });
        ModLoader.addRecipe(new ItemStack(bronzeManyullynSword), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.bronzeRod });
        ModLoader.addRecipe(new ItemStack(workedManyullynSword), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.workedIronRod });
        ModLoader.addRecipe(new ItemStack(steelManyullynSword), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.steelRod });
        ModLoader.addRecipe(new ItemStack(cobaltManyullynSword), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.cobaltRod });
        ModLoader.addRecipe(new ItemStack(arditeManyullynSword), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.arditeRod });
        ModLoader.addRecipe(new ItemStack(manyullynManyullynSword), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.manyullynRod });
        ModLoader.addRecipe(new ItemStack(uraniumManyullynSword), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.uraniumRod });
    }
    
    public static void addUraniumTools(ItemStack stack)
    {
        ModLoader.addRecipe(new ItemStack(diamondUraniumSword), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.diamondRod });
        ModLoader.addRecipe(new ItemStack(redstoneUraniumSword), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.redstoneRod });
        ModLoader.addRecipe(new ItemStack(boneUraniumSword), new Object[] 
                { recipe, '#', stack, '|', Item.bone });
        ModLoader.addRecipe(new ItemStack(boneUraniumSword), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.boneRod });
        ModLoader.addRecipe(new ItemStack(netherrackUraniumSword), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.netherrackRod });
        ModLoader.addRecipe(new ItemStack(glowstoneUraniumSword), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.glowstoneRod });
        ModLoader.addRecipe(new ItemStack(lavaUraniumSword), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.lavaRod });
        ModLoader.addRecipe(new ItemStack(blazeUraniumSword), new Object[] 
                { recipe, '#', stack, '|', Item.blazeRod });
        ModLoader.addRecipe(new ItemStack(cobaltUraniumSword), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.cobaltRod });
        ModLoader.addRecipe(new ItemStack(arditeUraniumSword), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.arditeRod });
        ModLoader.addRecipe(new ItemStack(uraniumUraniumSword), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.uraniumRod });
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
