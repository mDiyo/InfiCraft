package mDiyo.inficraft.infitools.core;
import mDiyo.inficraft.infitools.library.InfiLibrary;
import mDiyo.inficraft.infitools.library.InfiMaterialEnum;
import net.minecraft.src.Block;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;
import net.minecraft.src.ModLoader;

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
        createTools();
        addNames();
        registerInfiToolsRecipes();
    }
    
    private static void createTools()
    {
    	if(PHInfiTools.enableWoodTools)
    	{
    		woodWoodHoe = new InfiToolHoe(34, 
                    InfiMaterialEnum.Wood, InfiMaterialEnum.Wood, "woodWoodHoe");
    		sandstoneWoodHoe = new InfiToolHoe(PHInfiTools.woodHoeID+1, 
                    InfiMaterialEnum.Wood, InfiMaterialEnum.Sandstone, "sandstoneWoodHoe");
    		boneWoodHoe = new InfiToolHoe(PHInfiTools.woodHoeID+2, 
                    InfiMaterialEnum.Wood, InfiMaterialEnum.Bone, "boneWoodHoe");
    		paperWoodHoe = new InfiToolHoe(PHInfiTools.woodHoeID+3, 
                    InfiMaterialEnum.Wood, InfiMaterialEnum.Paper, "paperWoodHoe");
    		iceWoodHoe = new InfiToolHoe(PHInfiTools.woodHoeID+4, 
                    InfiMaterialEnum.Wood, InfiMaterialEnum.Ice, "iceWoodHoe");
    		slimeWoodHoe = new InfiToolHoe(PHInfiTools.woodHoeID+5, 
                    InfiMaterialEnum.Wood, InfiMaterialEnum.Slime, "slimeWoodHoe");
    		cactusWoodHoe = new InfiToolHoe(PHInfiTools.woodHoeID+6, 
                    InfiMaterialEnum.Wood, InfiMaterialEnum.Cactus, "cactusWoodHoe");
    	}

        if(PHInfiTools.enableStoneTools)
        {
        	woodStoneHoe = new InfiToolHoe(35, 
                    InfiMaterialEnum.Stone, InfiMaterialEnum.Wood, "woodStoneHoe");
        	stoneStoneHoe = new InfiToolHoe(PHInfiTools.stoneHoeID+1, 
                    InfiMaterialEnum.Stone, InfiMaterialEnum.Stone, "stoneStoneHoe");
        	sandstoneStoneHoe = new InfiToolHoe(PHInfiTools.stoneHoeID+2, 
                    InfiMaterialEnum.Stone, InfiMaterialEnum.Sandstone, "sandstoneStoneHoe");
        	boneStoneHoe = new InfiToolHoe(PHInfiTools.stoneHoeID+3, 
                    InfiMaterialEnum.Stone, InfiMaterialEnum.Bone, "boneStoneHoe");
        	netherrackStoneHoe = new InfiToolHoe(PHInfiTools.stoneHoeID+4, 
                    InfiMaterialEnum.Stone, InfiMaterialEnum.Netherrack, "netherrackStoneHoe");
        	iceStoneHoe = new InfiToolHoe(PHInfiTools.stoneHoeID+5, 
                    InfiMaterialEnum.Stone, InfiMaterialEnum.Ice, "iceStoneHoe");
        	slimeStoneHoe = new InfiToolHoe(PHInfiTools.stoneHoeID+6, 
                    InfiMaterialEnum.Stone, InfiMaterialEnum.Slime, "slimeStoneHoe");
        	cactusStoneHoe = new InfiToolHoe(PHInfiTools.stoneHoeID+7, 
                    InfiMaterialEnum.Stone, InfiMaterialEnum.Cactus, "cactusStoneHoe");
        	flintStoneHoe = new InfiToolHoe(PHInfiTools.stoneHoeID+8, 
                    InfiMaterialEnum.Stone, InfiMaterialEnum.Flint, "flintStoneHoe");            
        }
        
        if(PHInfiTools.enableIronTools)
        {
        	woodIronHoe = new InfiToolHoe(36, 
                    InfiMaterialEnum.Iron, InfiMaterialEnum.Wood, "woodIronHoe");
        	stoneIronHoe = new InfiToolHoe(PHInfiTools.ironHoeID+1, 
                    InfiMaterialEnum.Iron, InfiMaterialEnum.Stone, "stoneIronHoe");
        	ironIronHoe = new InfiToolHoe(PHInfiTools.ironHoeID+2, 
                    InfiMaterialEnum.Iron, InfiMaterialEnum.Iron, "ironIronHoe");
        	boneIronHoe = new InfiToolHoe(PHInfiTools.ironHoeID+3, 
                    InfiMaterialEnum.Iron, InfiMaterialEnum.Bone, "boneIronHoe");
        	netherrackIronHoe = new InfiToolHoe(PHInfiTools.ironHoeID+4, 
                    InfiMaterialEnum.Iron, InfiMaterialEnum.Netherrack, "netherrackIronHoe");
        	glowstoneIronHoe = new InfiToolHoe(PHInfiTools.ironHoeID+5, 
                    InfiMaterialEnum.Iron, InfiMaterialEnum.Glowstone, "glowstoneIronHoe");
        	cactusIronHoe = new InfiToolHoe(PHInfiTools.ironHoeID+6, 
                    InfiMaterialEnum.Iron, InfiMaterialEnum.Cactus, "cactusIronHoe");
        	copperIronHoe = new InfiToolHoe(PHInfiTools.ironHoeID+7, 
                    InfiMaterialEnum.Iron, InfiMaterialEnum.Copper, "copperIronHoe");
        	bronzeIronHoe = new InfiToolHoe(PHInfiTools.ironHoeID+8, 
                    InfiMaterialEnum.Iron, InfiMaterialEnum.Bronze, "bronzeIronHoe");
        }
        
        if(PHInfiTools.enableDiamondTools)
        {
        	woodDiamondHoe = new InfiToolHoe(37, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Wood, "woodDiamondHoe");
        	stoneDiamondHoe = new InfiToolHoe(PHInfiTools.diamondHoeID+1, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Stone, "stoneDiamondHoe");
        	ironDiamondHoe = new InfiToolHoe(PHInfiTools.diamondHoeID+2, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Iron, "ironDiamondHoe");
        	diamondDiamondHoe = new InfiToolHoe(PHInfiTools.diamondHoeID+3, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Diamond, "diamondDiamondHoe");
        	redstoneDiamondHoe = new InfiToolHoe(PHInfiTools.diamondHoeID+4, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Redstone, "redstoneDiamondHoe");
        	obsidianDiamondHoe = new InfiToolHoe(PHInfiTools.diamondHoeID+5, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Obsidian, "obsidianDiamondHoe");
        	boneDiamondHoe = new InfiToolHoe(PHInfiTools.diamondHoeID+6, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Bone, "boneDiamondHoe");
        	mossyDiamondHoe = new InfiToolHoe(PHInfiTools.diamondHoeID+7, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Mossy, "mossyDiamondHoe");
        	netherrackDiamondHoe = new InfiToolHoe(PHInfiTools.diamondHoeID+8, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Netherrack, "netherrackDiamondHoe");
        	glowstoneDiamondHoe = new InfiToolHoe(PHInfiTools.diamondHoeID+9, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Glowstone, "glowstoneDiamondHoe");
        	lavaDiamondHoe = new InfiToolHoe(PHInfiTools.diamondHoeID+10, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Lava, "lavaDiamondHoe");
        	cactusDiamondHoe = new InfiToolHoe(PHInfiTools.diamondHoeID+11, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Cactus, "cactusDiamondHoe");
        	flintDiamondHoe = new InfiToolHoe(PHInfiTools.diamondHoeID+12, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Flint, "flintDiamondHoe");
        	blazeDiamondHoe = new InfiToolHoe(PHInfiTools.diamondHoeID+13, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Blaze, "blazeDiamondHoe");
            copperDiamondHoe = new InfiToolHoe(PHInfiTools.diamondHoeID+14, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Copper, "copperDiamondHoe");
            bronzeDiamondHoe = new InfiToolHoe(PHInfiTools.diamondHoeID+15, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Bronze, "bronzeDiamondHoe");
            workedDiamondHoe = new InfiToolHoe(PHInfiTools.diamondHoeID+16, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.WorkedIron, "workedDiamondHoe");
            steelDiamondHoe = new InfiToolHoe(PHInfiTools.diamondHoeID+17, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Steel, "steelDiamondHoe");
            cobaltDiamondHoe = new InfiToolHoe(PHInfiTools.diamondHoeID+18, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Cobalt, "cobaltDiamondHoe");
            arditeDiamondHoe = new InfiToolHoe(PHInfiTools.diamondHoeID+19, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Ardite, "arditeDiamondHoe");
            manyullynDiamondHoe = new InfiToolHoe(PHInfiTools.diamondHoeID+20, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Manyullyn, "manyullynDiamondHoe");
            uraniumDiamondHoe = new InfiToolHoe(PHInfiTools.diamondHoeID+21, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Uranium, "uraniumDiamondHoe");
        }
        
        if(PHInfiTools.enableRedstoneTools)
        {
        	woodRedstoneHoe = new InfiToolHoe(PHInfiTools.redstoneHoeID+0, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Wood, "woodRedstoneHoe");
        	stoneRedstoneHoe = new InfiToolHoe(PHInfiTools.redstoneHoeID+1, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Stone, "stoneRedstoneHoe");
        	ironRedstoneHoe = new InfiToolHoe(PHInfiTools.redstoneHoeID+2, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Iron, "ironRedstoneHoe");
        	redstoneRedstoneHoe = new InfiToolHoe(PHInfiTools.redstoneHoeID+3, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Redstone, "redstoneRedstoneHoe");
        	obsidianRedstoneHoe = new InfiToolHoe(PHInfiTools.redstoneHoeID+4, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Obsidian, "obsidianRedstoneHoe");
        	sandstoneRedstoneHoe = new InfiToolHoe(PHInfiTools.redstoneHoeID+5, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Sandstone, "sandstoneRedstoneHoe");
        	boneRedstoneHoe = new InfiToolHoe(PHInfiTools.redstoneHoeID+6, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Bone, "boneRedstoneHoe");
        	paperRedstoneHoe = new InfiToolHoe(PHInfiTools.redstoneHoeID+7, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Paper, "paperRedstoneHoe");
        	mossyRedstoneHoe = new InfiToolHoe(PHInfiTools.redstoneHoeID+8, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Mossy, "mossyRedstoneHoe");
        	netherrackRedstoneHoe = new InfiToolHoe(PHInfiTools.redstoneHoeID+9, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Netherrack, "netherrackRedstoneHoe");
        	glowstoneRedstoneHoe = new InfiToolHoe(PHInfiTools.redstoneHoeID+10, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Glowstone, "glowstoneRedstoneHoe");
        	iceRedstoneHoe = new InfiToolHoe(PHInfiTools.redstoneHoeID+11, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Ice, "iceRedstoneHoe");
        	lavaRedstoneHoe = new InfiToolHoe(PHInfiTools.redstoneHoeID+12,
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Lava, "lavaRedstoneHoe");
        	slimeRedstoneHoe = new InfiToolHoe(PHInfiTools.redstoneHoeID+13,
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Slime, "slimeRedstoneHoe");
        	cactusRedstoneHoe = new InfiToolHoe(PHInfiTools.redstoneHoeID+14,
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Cactus, "cactusRedstoneHoe");
        	flintRedstoneHoe = new InfiToolHoe(PHInfiTools.redstoneHoeID+15,
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Flint, "flintRedstoneHoe");
        	copperRedstoneHoe = new InfiToolHoe(PHInfiTools.redstoneHoeID+16,
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Copper, "copperRedstoneHoe");
        	bronzeRedstoneHoe = new InfiToolHoe(PHInfiTools.redstoneHoeID+17,
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Bronze, "bronzeRedstoneHoe");
        	workedRedstoneHoe = new InfiToolHoe(PHInfiTools.redstoneHoeID+18,
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.WorkedIron, "workedRedstoneHoe");
        	uraniumRedstoneHoe = new InfiToolHoe(PHInfiTools.redstoneHoeID+19,
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Uranium, "uraniumRedstoneHoe");
        }
        
        if(PHInfiTools.enableObsidianTools)
        {
        	woodObsidianHoe = new InfiToolHoe(PHInfiTools.obsidianHoeID+0, 
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Wood, "woodObsidianHoe");
        	stoneObsidianHoe = new InfiToolHoe(PHInfiTools.obsidianHoeID+1, 
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Stone, "stoneObsidianHoe");
        	redstoneObsidianHoe = new InfiToolHoe(PHInfiTools.obsidianHoeID+2, 
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Redstone, "redstoneObsidianHoe");
        	obsidianObsidianHoe = new InfiToolHoe(PHInfiTools.obsidianHoeID+3, 
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Obsidian, "obsidianObsidianHoe");;
        	boneObsidianHoe = new InfiToolHoe(PHInfiTools.obsidianHoeID+4, 
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Bone, "boneObsidianHoe");
        	netherrackObsidianHoe = new InfiToolHoe(PHInfiTools.obsidianHoeID+5, 
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Netherrack, "netherrackObsidianHoe");
        	glowstoneObsidianHoe = new InfiToolHoe(PHInfiTools.obsidianHoeID+6, 
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Glowstone, "glowstoneObsidianHoe");
        	iceObsidianHoe = new InfiToolHoe(PHInfiTools.obsidianHoeID+7, 
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Ice, "iceObsidianHoe");
        	lavaObsidianHoe = new InfiToolHoe(PHInfiTools.obsidianHoeID+8,
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Lava, "lavaObsidianHoe");
        	cactusObsidianHoe = new InfiToolHoe(PHInfiTools.obsidianHoeID+9,
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Cactus, "cactusObsidianHoe");
        }
        
        if(PHInfiTools.enableSandstoneTools)
        {
        	woodSandstoneHoe = new InfiToolHoe(PHInfiTools.sandstoneHoeID+0, 
                    InfiMaterialEnum.Sandstone, InfiMaterialEnum.Wood, "woodSandstoneHoe");
        	sandstoneSandstoneHoe = new InfiToolHoe(PHInfiTools.sandstoneHoeID+1, 
                    InfiMaterialEnum.Sandstone, InfiMaterialEnum.Sandstone, "sandstoneSandstoneHoe");
        	boneSandstoneHoe = new InfiToolHoe(PHInfiTools.sandstoneHoeID+2, 
                    InfiMaterialEnum.Sandstone, InfiMaterialEnum.Bone, "boneSandstoneHoe");
        	netherrackSandstoneHoe = new InfiToolHoe(PHInfiTools.sandstoneHoeID+3, 
                    InfiMaterialEnum.Sandstone, InfiMaterialEnum.Netherrack, "netherrackSandstoneHoe");
        	iceSandstoneHoe = new InfiToolHoe(PHInfiTools.sandstoneHoeID+4, 
                    InfiMaterialEnum.Sandstone, InfiMaterialEnum.Ice, "iceSandstoneHoe");
        	slimeSandstoneHoe = new InfiToolHoe(PHInfiTools.sandstoneHoeID+5,
                    InfiMaterialEnum.Sandstone, InfiMaterialEnum.Slime, "slimeSandstoneHoe");
        	cactusSandstoneHoe = new InfiToolHoe(PHInfiTools.sandstoneHoeID+6,
                    InfiMaterialEnum.Sandstone, InfiMaterialEnum.Cactus, "cactusSandstoneHoe");
        	flintSandstoneHoe = new InfiToolHoe(PHInfiTools.sandstoneHoeID+7,
                    InfiMaterialEnum.Sandstone, InfiMaterialEnum.Flint, "flintSandstoneHoe");
        }
        
        if(PHInfiTools.enableBoneTools)
        {
        	woodBoneHoe = new InfiToolHoe(PHInfiTools.boneHoeID+0, 
                    InfiMaterialEnum.Bone, InfiMaterialEnum.Wood, "woodBoneHoe");
        	stoneBoneHoe = new InfiToolHoe(PHInfiTools.boneHoeID+1, 
                    InfiMaterialEnum.Bone, InfiMaterialEnum.Stone, "stoneBoneHoe");
        	sandstoneBoneHoe = new InfiToolHoe(PHInfiTools.boneHoeID+2, 
                    InfiMaterialEnum.Bone, InfiMaterialEnum.Sandstone, "sandstoneBoneHoe");
        	boneBoneHoe = new InfiToolHoe(PHInfiTools.boneHoeID+3, 
                    InfiMaterialEnum.Bone, InfiMaterialEnum.Bone, "boneBoneHoe");
        	paperBoneHoe = new InfiToolHoe(PHInfiTools.boneHoeID+4, 
                    InfiMaterialEnum.Bone, InfiMaterialEnum.Paper, "paperBoneHoe");
        	netherrackBoneHoe = new InfiToolHoe(PHInfiTools.boneHoeID+5, 
                    InfiMaterialEnum.Bone, InfiMaterialEnum.Netherrack, "netherrackBoneHoe");
        	iceBoneHoe = new InfiToolHoe(PHInfiTools.boneHoeID+6, 
                    InfiMaterialEnum.Bone, InfiMaterialEnum.Ice, "iceBoneHoe");
        	cactusBoneHoe = new InfiToolHoe(PHInfiTools.boneHoeID+7,
                    InfiMaterialEnum.Bone, InfiMaterialEnum.Cactus, "cactusBoneHoe");
        	flintBoneHoe = new InfiToolHoe(PHInfiTools.boneHoeID+8,
                    InfiMaterialEnum.Bone, InfiMaterialEnum.Flint, "flintBoneHoe");
        }
        
        if(PHInfiTools.enablePaperTools)
        {
        	woodPaperHoe = new InfiToolHoe(PHInfiTools.paperHoeID+0, 
                    InfiMaterialEnum.Paper, InfiMaterialEnum.Wood, "woodPaperHoe");
        	bonePaperHoe = new InfiToolHoe(PHInfiTools.paperHoeID+1, 
                    InfiMaterialEnum.Paper, InfiMaterialEnum.Bone, "bonePaperHoe");
        	paperPaperHoe = new InfiToolHoe(PHInfiTools.paperHoeID+2, 
                    InfiMaterialEnum.Paper, InfiMaterialEnum.Paper, "paperPaperHoe");
        	slimePaperHoe = new InfiToolHoe(PHInfiTools.paperHoeID+3,
                    InfiMaterialEnum.Paper, InfiMaterialEnum.Slime, "slimePaperHoe");
        	cactusPaperHoe = new InfiToolHoe(PHInfiTools.paperHoeID+4,
                    InfiMaterialEnum.Paper, InfiMaterialEnum.Cactus, "cactusPaperHoe");
            
            
            
            
            
            
        }
        
        if(PHInfiTools.enableMossyTools)
        {
        	woodMossyHoe = new InfiToolHoe(PHInfiTools.mossyHoeID+0, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Wood, "woodMossyHoe");
        	stoneMossyHoe = new InfiToolHoe(PHInfiTools.mossyHoeID+1, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Stone, "stoneMossyHoe");
        	diamondMossyHoe = new InfiToolHoe(PHInfiTools.mossyHoeID+2, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Diamond, "diamondMossyHoe");
        	redstoneMossyHoe = new InfiToolHoe(PHInfiTools.mossyHoeID+3, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Redstone, "redstoneMossyHoe");
        	boneMossyHoe = new InfiToolHoe(PHInfiTools.mossyHoeID+4, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Bone, "boneMossyHoe");
        	mossyMossyHoe = new InfiToolHoe(PHInfiTools.mossyHoeID+5, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Mossy, "mossyMossyHoe");
        	netherrackMossyHoe = new InfiToolHoe(PHInfiTools.mossyHoeID+6, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Netherrack, "netherrackMossyHoe");
        	glowstoneMossyHoe = new InfiToolHoe(PHInfiTools.mossyHoeID+7, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Glowstone, "glowstoneMossyHoe");
        	cactusMossyHoe = new InfiToolHoe(PHInfiTools.mossyHoeID+8, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Cactus, "cactusMossyHoe");
        	blazeMossyHoe = new InfiToolHoe(PHInfiTools.mossyHoeID+9, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Blaze, "blazeMossyHoe");
        	manyullynMossyHoe = new InfiToolHoe(PHInfiTools.mossyHoeID+10, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Manyullyn, "manyullynMossyHoe");
        	uraniumMossyHoe = new InfiToolHoe(PHInfiTools.mossyHoeID+11, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Uranium, "uraniumMossyHoe");
            
            
            
            
            
            
            
            
            
            
            
            
            
        }
        
        if(PHInfiTools.enableNetherrackTools)
        {
        	woodNetherrackHoe = new InfiToolHoe(PHInfiTools.netherrackHoeID+0, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Wood, "woodNetherrackHoe");
        	stoneNetherrackHoe = new InfiToolHoe(PHInfiTools.netherrackHoeID+1, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Stone, "stoneNetherrackHoe");
        	sandstoneNetherrackHoe = new InfiToolHoe(PHInfiTools.netherrackHoeID+2, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Sandstone, "sandstoneNetherrackHoe");
        	boneNetherrackHoe = new InfiToolHoe(PHInfiTools.netherrackHoeID+3, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Bone, "boneNetherrackHoe");
        	paperNetherrackHoe = new InfiToolHoe(PHInfiTools.netherrackHoeID+4, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Paper, "paperNetherrackHoe");
        	mossyNetherrackHoe = new InfiToolHoe(PHInfiTools.netherrackHoeID+5, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Mossy, "mossyNetherrackHoe");
        	netherrackNetherrackHoe = new InfiToolHoe(PHInfiTools.netherrackHoeID+6, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Netherrack, "netherrackNetherrackHoe");
        	iceNetherrackHoe = new InfiToolHoe(PHInfiTools.netherrackHoeID+7, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Ice, "iceNetherrackHoe");
        	slimeNetherrackHoe = new InfiToolHoe(PHInfiTools.netherrackHoeID+8, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Slime, "slimeNetherrackHoe");
        	cactusNetherrackHoe = new InfiToolHoe(PHInfiTools.netherrackHoeID+9, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Cactus, "cactusNetherrackHoe");
        	flintNetherrackHoe = new InfiToolHoe(PHInfiTools.netherrackHoeID+10, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Flint, "flintNetherrackHoe");
        	copperNetherrackHoe = new InfiToolHoe(PHInfiTools.netherrackHoeID+11, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Copper, "copperNetherrackHoe");
        	bronzeNetherrackHoe = new InfiToolHoe(PHInfiTools.netherrackHoeID+12, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Bronze, "bronzeNetherrackHoe");
            
            
            
            
            
            
            
            
            
            
            
            
            
            
        }
        
        if(PHInfiTools.enableGlowstoneTools)
        {
        	woodGlowstoneHoe = new InfiToolHoe(PHInfiTools.glowstoneHoeID+0, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Wood, "woodGlowstoneHoe");
        	redstoneGlowstoneHoe = new InfiToolHoe(PHInfiTools.glowstoneHoeID+1, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Redstone, "redstoneGlowstoneHoe");
        	obsidianGlowstoneHoe = new InfiToolHoe(PHInfiTools.glowstoneHoeID+2, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Obsidian, "obsidianGlowstoneHoe");
        	boneGlowstoneHoe = new InfiToolHoe(PHInfiTools.glowstoneHoeID+3, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Bone, "boneGlowstoneHoe");
        	netherrackGlowstoneHoe = new InfiToolHoe(PHInfiTools.glowstoneHoeID+4, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Netherrack, "netherrackGlowstoneHoe");
        	glowstoneGlowstoneHoe = new InfiToolHoe(PHInfiTools.glowstoneHoeID+5, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Glowstone, "glowstoneGlowstoneHoe");
        	iceGlowstoneHoe = new InfiToolHoe(PHInfiTools.glowstoneHoeID+6, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Ice, "iceGlowstoneHoe");
        	slimeGlowstoneHoe = new InfiToolHoe(PHInfiTools.glowstoneHoeID+7, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Slime, "slimeGlowstoneHoe");
        	cactusGlowstoneHoe = new InfiToolHoe(PHInfiTools.glowstoneHoeID+8, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Cactus, "cactusGlowstoneHoe");
            
            
            
            
            
            
            
            
            
            
            
        }
        
        if(PHInfiTools.enableIceTools)
        {
        	woodIceHoe = new InfiToolHoe(PHInfiTools.iceHoeID+0, 
                    InfiMaterialEnum.Ice, InfiMaterialEnum.Wood, "woodIceHoe");
        	boneIceHoe = new InfiToolHoe(PHInfiTools.iceHoeID+1, 
                    InfiMaterialEnum.Ice, InfiMaterialEnum.Bone, "boneIceHoe");
        	paperIceHoe = new InfiToolHoe(PHInfiTools.iceHoeID+2, 
                    InfiMaterialEnum.Ice, InfiMaterialEnum.Paper, "paperIceHoe");
        	iceIceHoe = new InfiToolHoe(PHInfiTools.iceHoeID+3, 
                    InfiMaterialEnum.Ice, InfiMaterialEnum.Ice, "iceIceHoe");
        	slimeIceHoe = new InfiToolHoe(PHInfiTools.iceHoeID+4, 
                    InfiMaterialEnum.Ice, InfiMaterialEnum.Slime, "slimeIceHoe");
        	cactusIceHoe = new InfiToolHoe(PHInfiTools.iceHoeID+5, 
                    InfiMaterialEnum.Ice, InfiMaterialEnum.Cactus, "cactusIceHoe");
            
            
            
            
            
            
            
            
        }
        
        if(PHInfiTools.enableLavaTools)
        {
        	diamondLavaHoe = new InfiToolHoe(PHInfiTools.lavaHoeID+0, 
                    InfiMaterialEnum.Lava, InfiMaterialEnum.Diamond, "diamondLavaHoe");
        	obsidianLavaHoe = new InfiToolHoe(PHInfiTools.lavaHoeID+1, 
                    InfiMaterialEnum.Lava, InfiMaterialEnum.Obsidian, "obsidianLavaHoe");
        	netherrackLavaHoe = new InfiToolHoe(PHInfiTools.lavaHoeID+2, 
                    InfiMaterialEnum.Lava, InfiMaterialEnum.Netherrack, "netherrackLavaHoe");
        	lavaLavaHoe = new InfiToolHoe(PHInfiTools.lavaHoeID+3, 
                    InfiMaterialEnum.Lava, InfiMaterialEnum.Lava, "lavaLavaHoe");
        	flintLavaHoe = new InfiToolHoe(PHInfiTools.lavaHoeID+4, 
                    InfiMaterialEnum.Lava, InfiMaterialEnum.Flint, "flintLavaHoe");
        	blazeLavaHoe = new InfiToolHoe(PHInfiTools.lavaHoeID+5, 
                    InfiMaterialEnum.Lava, InfiMaterialEnum.Blaze, "blazeLavaHoe");
        	manyullynLavaHoe = new InfiToolHoe(PHInfiTools.lavaHoeID+6, 
                    InfiMaterialEnum.Lava, InfiMaterialEnum.Manyullyn, "manyullynLavaHoe");
            uraniumLavaHoe = new InfiToolHoe(PHInfiTools.lavaHoeID+7, 
                    InfiMaterialEnum.Lava, InfiMaterialEnum.Uranium, "uraniumLavaHoe");
            
            
            
            
            
            
            
            
            
        }
        
        if(PHInfiTools.enableSlimeTools)
        {
        	woodSlimeHoe = new InfiToolHoe(PHInfiTools.slimeHoeID+0, 
                    InfiMaterialEnum.Slime, InfiMaterialEnum.Wood, "woodSlimeHoe");
        	sandstoneSlimeHoe = new InfiToolHoe(PHInfiTools.slimeHoeID+1, 
                    InfiMaterialEnum.Slime, InfiMaterialEnum.Sandstone, "sandstoneSlimeHoe");
        	boneSlimeHoe = new InfiToolHoe(PHInfiTools.slimeHoeID+2, 
                    InfiMaterialEnum.Slime, InfiMaterialEnum.Bone, "boneSlimeHoe");
        	paperSlimeHoe = new InfiToolHoe(PHInfiTools.slimeHoeID+3, 
                    InfiMaterialEnum.Slime, InfiMaterialEnum.Paper, "paperSlimeHoe");
        	slimeSlimeHoe = new InfiToolHoe(PHInfiTools.slimeHoeID+4, 
                    InfiMaterialEnum.Slime, InfiMaterialEnum.Slime, "slimeSlimeHoe");
        	cactusSlimeHoe = new InfiToolHoe(PHInfiTools.slimeHoeID+5, 
                    InfiMaterialEnum.Slime, InfiMaterialEnum.Cactus, "cactusSlimeHoe");
            
            
            
            
            
            
            
        }
        
        if(PHInfiTools.enableCactusTools)
        {
        	woodCactusHoe = new InfiToolHoe(PHInfiTools.cactusHoeID+0, 
                    InfiMaterialEnum.Cactus, InfiMaterialEnum.Wood, "woodCactusHoe");
        	sandstoneCactusHoe = new InfiToolHoe(PHInfiTools.cactusHoeID+1, 
                    InfiMaterialEnum.Cactus, InfiMaterialEnum.Sandstone, "sandstoneCactusHoe");
        	boneCactusHoe = new InfiToolHoe(PHInfiTools.cactusHoeID+2, 
                    InfiMaterialEnum.Cactus, InfiMaterialEnum.Bone, "boneCactusHoe");
        	netherrackCactusHoe = new InfiToolHoe(PHInfiTools.cactusHoeID+3, 
                    InfiMaterialEnum.Cactus, InfiMaterialEnum.Netherrack, "netherrackCactusHoe");
        	iceCactusHoe = new InfiToolHoe(PHInfiTools.cactusHoeID+4, 
                    InfiMaterialEnum.Cactus, InfiMaterialEnum.Ice, "iceCactusHoe");
        	slimeCactusHoe = new InfiToolHoe(PHInfiTools.cactusHoeID+5, 
                    InfiMaterialEnum.Cactus, InfiMaterialEnum.Slime, "slimeCactusHoe");
        	cactusCactusHoe = new InfiToolHoe(PHInfiTools.cactusHoeID+6, 
                    InfiMaterialEnum.Cactus, InfiMaterialEnum.Cactus, "cactusCactusHoe");
            
            
            
            
            
            
            
            
        }
        
        if(PHInfiTools.enableFlintTools)
        {
        	woodFlintHoe = new InfiToolHoe(PHInfiTools.flintHoeID+0, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Wood, "woodFlintHoe");
        	stoneFlintHoe = new InfiToolHoe(PHInfiTools.flintHoeID+1, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Stone, "stoneFlintHoe");
        	sandstoneFlintHoe = new InfiToolHoe(PHInfiTools.flintHoeID+2, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Sandstone, "sandstoneFlintHoe");
        	boneFlintHoe = new InfiToolHoe(PHInfiTools.flintHoeID+3, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Bone, "boneFlintHoe");
        	netherrackFlintHoe = new InfiToolHoe(PHInfiTools.flintHoeID+4, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Netherrack, "netherrackFlintHoe");
        	slimeFlintHoe = new InfiToolHoe(PHInfiTools.flintHoeID+5, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Slime, "slimeFlintHoe");
        	cactusFlintHoe = new InfiToolHoe(PHInfiTools.flintHoeID+6, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Cactus, "cactusFlintHoe");
        	flintFlintHoe = new InfiToolHoe(PHInfiTools.flintHoeID+7, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Flint, "flintFlintHoe");
        	copperFlintHoe = new InfiToolHoe(PHInfiTools.flintHoeID+8, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Copper, "copperFlintHoe");
        	bronzeFlintHoe = new InfiToolHoe(PHInfiTools.flintHoeID+9, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Bronze, "bronzeFlintHoe");
        }
        
        if(PHInfiTools.enableBlazeTools)
        {
        	diamondBlazeHoe = new InfiToolHoe(PHInfiTools.blazeHoeID+0, 
                    InfiMaterialEnum.Blaze, InfiMaterialEnum.Diamond, "diamondBlazeHoe");
        	obsidianBlazeHoe = new InfiToolHoe(PHInfiTools.blazeHoeID+1, 
                    InfiMaterialEnum.Blaze, InfiMaterialEnum.Obsidian, "obsidianBlazeHoe");
        	netherrackBlazeHoe = new InfiToolHoe(PHInfiTools.blazeHoeID+2, 
                    InfiMaterialEnum.Blaze, InfiMaterialEnum.Netherrack, "netherrackBlazeHoe");
        	lavaBlazeHoe = new InfiToolHoe(PHInfiTools.blazeHoeID+3, 
                    InfiMaterialEnum.Blaze, InfiMaterialEnum.Lava, "lavaBlazeHoe");
        	flintBlazeHoe = new InfiToolHoe(PHInfiTools.blazeHoeID+4, 
                    InfiMaterialEnum.Blaze, InfiMaterialEnum.Flint, "flintBlazeHoe");
        	blazeBlazeHoe = new InfiToolHoe(PHInfiTools.blazeHoeID+5, 
                    InfiMaterialEnum.Blaze, InfiMaterialEnum.Blaze, "blazeBlazeHoe");
        	manyullynBlazeHoe = new InfiToolHoe(PHInfiTools.blazeHoeID+6, 
                    InfiMaterialEnum.Blaze, InfiMaterialEnum.Manyullyn, "manyullynBlazeHoe");
            uraniumBlazeHoe = new InfiToolHoe(PHInfiTools.blazeHoeID+7, 
                    InfiMaterialEnum.Blaze, InfiMaterialEnum.Uranium, "uraniumBlazeHoe");
        }
    	
        if(PHInfiTools.enableCopperTools)
        {
        	woodCopperHoe = new InfiToolHoe(PHInfiTools.copperHoeID+0, 
                    InfiMaterialEnum.Copper, InfiMaterialEnum.Wood, "woodCopperHoe");
            stoneCopperHoe = new InfiToolHoe(PHInfiTools.copperHoeID+1, 
                    InfiMaterialEnum.Copper, InfiMaterialEnum.Stone, "stoneCopperHoe");
            boneCopperHoe = new InfiToolHoe(PHInfiTools.copperHoeID+2, 
                    InfiMaterialEnum.Copper, InfiMaterialEnum.Bone, "boneCopperHoe");
            netherrackCopperHoe = new InfiToolHoe(PHInfiTools.copperHoeID+3, 
                    InfiMaterialEnum.Copper, InfiMaterialEnum.Netherrack, "netherrackCopperHoe");
            slimeCopperHoe = new InfiToolHoe(PHInfiTools.copperHoeID+4, 
                    InfiMaterialEnum.Copper, InfiMaterialEnum.Slime, "slimeCopperHoe");
            cactusCopperHoe = new InfiToolHoe(PHInfiTools.copperHoeID+5, 
                    InfiMaterialEnum.Copper, InfiMaterialEnum.Cactus, "cactusCopperHoe");
            flintCopperHoe = new InfiToolHoe(PHInfiTools.copperHoeID+6, 
                    InfiMaterialEnum.Copper, InfiMaterialEnum.Flint, "flintCopperHoe");
            copperCopperHoe = new InfiToolHoe(PHInfiTools.copperHoeID+7, 
                    InfiMaterialEnum.Copper, InfiMaterialEnum.Copper, "copperCopperHoe");
        }
        
        if(PHInfiTools.enableBronzeTools)
        {
        	woodBronzeHoe = new InfiToolHoe(PHInfiTools.bronzeHoeID+0, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Wood, "woodBronzeHoe");
            stoneBronzeHoe = new InfiToolHoe(PHInfiTools.bronzeHoeID+1, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Stone, "stoneBronzeHoe");
            boneBronzeHoe = new InfiToolHoe(PHInfiTools.bronzeHoeID+2, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Bone, "boneBronzeHoe");
            netherrackBronzeHoe = new InfiToolHoe(PHInfiTools.bronzeHoeID+3, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Netherrack, "netherrackBronzeHoe");
            slimeBronzeHoe = new InfiToolHoe(PHInfiTools.bronzeHoeID+4, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Slime, "slimeBronzeHoe");
            cactusBronzeHoe = new InfiToolHoe(PHInfiTools.bronzeHoeID+5, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Cactus, "cactusBronzeHoe");
            flintBronzeHoe = new InfiToolHoe(PHInfiTools.bronzeHoeID+6, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Flint, "flintBronzeHoe");
            copperBronzeHoe = new InfiToolHoe(PHInfiTools.bronzeHoeID+7, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Copper, "copperBronzeHoe");
            bronzeBronzeHoe = new InfiToolHoe(PHInfiTools.bronzeHoeID+8, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Bronze, "bronzeBronzeHoe");
        }
        
        if(PHInfiTools.enableWorkedIronTools)
        {
        	woodWorkedIronHoe = new InfiToolHoe(PHInfiTools.workedIronHoeID+0, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Wood, "woodWorkedIronHoe");
            stoneWorkedIronHoe = new InfiToolHoe(PHInfiTools.workedIronHoeID+1, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Stone, "stoneWorkedIronHoe");
            ironWorkedIronHoe = new InfiToolHoe(PHInfiTools.workedIronHoeID+2,
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Iron, "ironWorkedIronHoe");
            diamondWorkedIronHoe = new InfiToolHoe(PHInfiTools.workedIronHoeID+3, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Diamond, "diamondWorkedIronHoe");
            redstoneWorkedIronHoe = new InfiToolHoe(PHInfiTools.workedIronHoeID+4, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Redstone, "redstoneWorkedIronHoe");
            obsidianWorkedIronHoe = new InfiToolHoe(PHInfiTools.workedIronHoeID+5, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Obsidian, "obsidianWorkedIronHoe");
            boneWorkedIronHoe = new InfiToolHoe(PHInfiTools.workedIronHoeID+6, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Bone, "boneWorkedIronHoe");
            netherrackWorkedIronHoe = new InfiToolHoe(PHInfiTools.workedIronHoeID+7, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Netherrack, "netherrackWorkedIronHoe");
            glowstoneWorkedIronHoe = new InfiToolHoe(PHInfiTools.workedIronHoeID+8, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Glowstone, "glowstoneWorkedIronHoe");
            iceWorkedIronHoe = new InfiToolHoe(PHInfiTools.workedIronHoeID+9, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Ice, "iceWorkedIronHoe");
            slimeWorkedIronHoe = new InfiToolHoe(PHInfiTools.workedIronHoeID+10, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Slime, "slimeWorkedIronHoe");
            cactusWorkedIronHoe = new InfiToolHoe(PHInfiTools.workedIronHoeID+11, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Cactus, "cactusWorkedIronHoe");
            blazeWorkedIronHoe = new InfiToolHoe(PHInfiTools.workedIronHoeID+12, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Blaze, "blazeWorkedIronHoe");
            copperWorkedIronHoe = new InfiToolHoe(PHInfiTools.workedIronHoeID+13, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Copper, "copperWorkedIronHoe");
            bronzeWorkedIronHoe = new InfiToolHoe(PHInfiTools.workedIronHoeID+14, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Bronze, "bronzeWorkedIronHoe");
            workedWorkedIronHoe = new InfiToolHoe(PHInfiTools.workedIronHoeID+15, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.WorkedIron, "workedWorkedIronHoe");
            steelWorkedIronHoe = new InfiToolHoe(PHInfiTools.workedIronHoeID+16, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Steel, "steelWorkedIronHoe");
            uraniumWorkedIronHoe = new InfiToolHoe(PHInfiTools.workedIronHoeID+17, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Uranium, "uraniumWorkedIronHoe");
        }
        
        if(PHInfiTools.enableSteelTools)
        {
        	woodSteelHoe = new InfiToolHoe(PHInfiTools.steelHoeID+0, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Wood, "woodSteelHoe");
            stoneSteelHoe = new InfiToolHoe(PHInfiTools.steelHoeID+1, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Stone, "stoneSteelHoe");
            ironSteelHoe = new InfiToolHoe(PHInfiTools.steelHoeID+2, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Iron, "ironSteelHoe");
            diamondSteelHoe = new InfiToolHoe(PHInfiTools.steelHoeID+3, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Diamond, "diamondSteelHoe");
            redstoneSteelHoe = new InfiToolHoe(PHInfiTools.steelHoeID+4, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Redstone, "redstoneSteelHoe");
            obsidianSteelHoe = new InfiToolHoe(PHInfiTools.steelHoeID+5, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Obsidian, "obsidianSteelHoe");
            boneSteelHoe = new InfiToolHoe(PHInfiTools.steelHoeID+6, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Bone, "boneSteelHoe");
            netherrackSteelHoe = new InfiToolHoe(PHInfiTools.steelHoeID+7, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Netherrack, "netherrackSteelHoe");
            glowstoneSteelHoe = new InfiToolHoe(PHInfiTools.steelHoeID+8, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Glowstone, "glowstoneSteelHoe");
            iceSteelHoe = new InfiToolHoe(PHInfiTools.steelHoeID+9, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Ice, "iceSteelHoe");
            slimeSteelHoe = new InfiToolHoe(PHInfiTools.steelHoeID+10, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Slime, "slimeSteelHoe");
            cactusSteelHoe = new InfiToolHoe(PHInfiTools.steelHoeID+11, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Cactus, "cactusSteelHoe");
            blazeSteelHoe = new InfiToolHoe(PHInfiTools.steelHoeID+12, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Blaze, "blazeSteelHoe");
            copperSteelHoe = new InfiToolHoe(PHInfiTools.steelHoeID+13, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Copper, "copperSteelHoe");
            bronzeSteelHoe = new InfiToolHoe(PHInfiTools.steelHoeID+14, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Bronze, "bronzeSteelHoe");
            workedSteelHoe = new InfiToolHoe(PHInfiTools.steelHoeID+15, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.WorkedIron, "workedSteelHoe");
            steelSteelHoe = new InfiToolHoe(PHInfiTools.steelHoeID+16, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Steel, "steelSteelHoe");
            cobaltSteelHoe = new InfiToolHoe(PHInfiTools.steelHoeID+17, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Cobalt, "cobaltSteelHoe");
            arditeSteelHoe = new InfiToolHoe(PHInfiTools.steelHoeID+18, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Ardite, "arditeSteelHoe");
            uraniumSteelHoe = new InfiToolHoe(PHInfiTools.steelHoeID+19, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Uranium, "uraniumSteelHoe");
        }
        
        if(PHInfiTools.enableCobaltTools)
        {
        	woodCobaltHoe = new InfiToolHoe(PHInfiTools.cobaltHoeID+0, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Wood, "woodCobaltHoe");
            stoneCobaltHoe = new InfiToolHoe(PHInfiTools.cobaltHoeID+1, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Stone, "stoneCobaltHoe");
            ironCobaltHoe = new InfiToolHoe(PHInfiTools.cobaltHoeID+2, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Iron, "ironCobaltHoe");
            diamondCobaltHoe = new InfiToolHoe(PHInfiTools.cobaltHoeID+3,
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Diamond, "diamondCobaltHoe");
            redstoneCobaltHoe = new InfiToolHoe(PHInfiTools.cobaltHoeID+4, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Redstone, "redstoneCobaltHoe");
            obsidianCobaltHoe = new InfiToolHoe(PHInfiTools.cobaltHoeID+5, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Obsidian, "obsidianCobaltHoe");
            boneCobaltHoe = new InfiToolHoe(PHInfiTools.cobaltHoeID+6, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Bone, "boneCobaltHoe");
            slimeCobaltHoe = new InfiToolHoe(PHInfiTools.cobaltHoeID+7, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Slime, "slimeCobaltHoe");
            cactusCobaltHoe = new InfiToolHoe(PHInfiTools.cobaltHoeID+8, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Cactus, "cactusCobaltHoe");
            blazeCobaltHoe = new InfiToolHoe(PHInfiTools.cobaltHoeID+9, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Blaze, "blazeCobaltHoe");
            copperCobaltHoe = new InfiToolHoe(PHInfiTools.cobaltHoeID+10, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Copper, "copperCobaltHoe");
            bronzeCobaltHoe = new InfiToolHoe(PHInfiTools.cobaltHoeID+11, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Bronze, "bronzeCobaltHoe");
            workedCobaltHoe = new InfiToolHoe(PHInfiTools.cobaltHoeID+12, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.WorkedIron, "workedCobaltHoe");
            steelCobaltHoe = new InfiToolHoe(PHInfiTools.cobaltHoeID+13, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Steel, "steelCobaltHoe");
            cobaltCobaltHoe = new InfiToolHoe(PHInfiTools.cobaltHoeID+14, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Cobalt, "cobaltCobaltHoe");
            arditeCobaltHoe = new InfiToolHoe(PHInfiTools.cobaltHoeID+15, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Ardite, "arditeCobaltHoe");
            manyullynCobaltHoe = new InfiToolHoe(PHInfiTools.cobaltHoeID+16, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Manyullyn, "manyullynCobaltHoe");
            uraniumCobaltHoe = new InfiToolHoe(PHInfiTools.cobaltHoeID+17, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Uranium, "uraniumCobaltHoe");
        }
        
        if(PHInfiTools.enableArditeTools)
        {
        	woodArditeHoe = new InfiToolHoe(PHInfiTools.arditeHoeID+0, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Wood, "woodArditeHoe");
            stoneArditeHoe = new InfiToolHoe(PHInfiTools.arditeHoeID+1, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Stone, "stoneArditeHoe");
            ironArditeHoe = new InfiToolHoe(PHInfiTools.arditeHoeID+2, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Iron, "ironArditeHoe");
            diamondArditeHoe = new InfiToolHoe(PHInfiTools.arditeHoeID+3,
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Diamond, "diamondArditeHoe");
            redstoneArditeHoe = new InfiToolHoe(PHInfiTools.arditeHoeID+4, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Redstone, "redstoneArditeHoe");
            obsidianArditeHoe = new InfiToolHoe(PHInfiTools.arditeHoeID+5, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Obsidian, "obsidianArditeHoe");
            boneArditeHoe = new InfiToolHoe(PHInfiTools.arditeHoeID+6,
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Bone, "boneArditeHoe");
            slimeArditeHoe = new InfiToolHoe(PHInfiTools.arditeHoeID+7, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Slime, "slimeArditeHoe");
            cactusArditeHoe = new InfiToolHoe(PHInfiTools.arditeHoeID+8, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Cactus, "cactusArditeHoe");
            blazeArditeHoe = new InfiToolHoe(PHInfiTools.arditeHoeID+9, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Blaze, "blazeArditeHoe");
            copperArditeHoe = new InfiToolHoe(PHInfiTools.arditeHoeID+10, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Copper, "copperArditeHoe");
            bronzeArditeHoe = new InfiToolHoe(PHInfiTools.arditeHoeID+11, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Bronze, "bronzeArditeHoe");
            workedArditeHoe = new InfiToolHoe(PHInfiTools.arditeHoeID+12, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.WorkedIron, "workedArditeHoe");
            steelArditeHoe = new InfiToolHoe(PHInfiTools.arditeHoeID+13, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Steel, "steelArditeHoe");
            cobaltArditeHoe = new InfiToolHoe(PHInfiTools.arditeHoeID+14, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Cobalt, "cobaltArditeHoe");
            arditeArditeHoe = new InfiToolHoe(PHInfiTools.arditeHoeID+15, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Ardite, "arditeArditeHoe");
            manyullynArditeHoe = new InfiToolHoe(PHInfiTools.arditeHoeID+16, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Manyullyn, "manyullynArditeHoe");
            uraniumArditeHoe = new InfiToolHoe(PHInfiTools.arditeHoeID+17, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Uranium, "uraniumArditeHoe");
        }
        
        if(PHInfiTools.enableManyullynTools)
        {
        	woodManyullynHoe = new InfiToolHoe(PHInfiTools.manyullynHoeID+0, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Wood, "woodManyullynHoe");
            stoneManyullynHoe = new InfiToolHoe(PHInfiTools.manyullynHoeID+1, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Stone, "stoneManyullynHoe");
            ironManyullynHoe = new InfiToolHoe(PHInfiTools.manyullynHoeID+2, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Iron, "ironManyullynHoe");
            diamondManyullynHoe = new InfiToolHoe(PHInfiTools.manyullynHoeID+3,
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Diamond, "diamondManyullynHoe");
            redstoneManyullynHoe = new InfiToolHoe(PHInfiTools.manyullynHoeID+4, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Redstone, "redstoneManyullynHoe");
            obsidianManyullynHoe = new InfiToolHoe(PHInfiTools.manyullynHoeID+5, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Obsidian, "obsidianManyullynHoe");
            boneManyullynHoe = new InfiToolHoe(PHInfiTools.manyullynHoeID+6, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Bone, "boneManyullynHoe");
            slimeManyullynHoe = new InfiToolHoe(PHInfiTools.manyullynHoeID+7, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Slime, "slimeManyullynHoe");
            cactusManyullynHoe = new InfiToolHoe(PHInfiTools.manyullynHoeID+8, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Cactus, "cactusManyullynHoe");
            blazeManyullynHoe = new InfiToolHoe(PHInfiTools.manyullynHoeID+9, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Blaze, "blazeManyullynHoe");
            copperManyullynHoe = new InfiToolHoe(PHInfiTools.manyullynHoeID+10, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Copper, "copperManyullynHoe");
            bronzeManyullynHoe = new InfiToolHoe(PHInfiTools.manyullynHoeID+11, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Bronze, "bronzeManyullynHoe");
            workedManyullynHoe = new InfiToolHoe(PHInfiTools.manyullynHoeID+12, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.WorkedIron, "workedManyullynHoe");
            steelManyullynHoe = new InfiToolHoe(PHInfiTools.manyullynHoeID+13, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Steel, "steelManyullynHoe");
            cobaltManyullynHoe = new InfiToolHoe(PHInfiTools.manyullynHoeID+14, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Cobalt, "cobaltManyullynHoe");
            arditeManyullynHoe = new InfiToolHoe(PHInfiTools.manyullynHoeID+15, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Ardite, "arditeManyullynHoe");
            manyullynManyullynHoe = new InfiToolHoe(PHInfiTools.manyullynHoeID+16, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Manyullyn, "manyullynManyullynHoe");
            uraniumManyullynHoe = new InfiToolHoe(PHInfiTools.manyullynHoeID+17,
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Uranium, "uraniumManyullynHoe");
        }
        
        if(PHInfiTools.enableUraniumTools)
        {
            diamondUraniumHoe = new InfiToolHoe(PHInfiTools.uraniumHoeID+0, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Diamond, "diamondUraniumHoe");
            redstoneUraniumHoe = new InfiToolHoe(PHInfiTools.uraniumHoeID+1, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Redstone, "redstoneUraniumHoe");
            boneUraniumHoe = new InfiToolHoe(PHInfiTools.uraniumHoeID+2, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Bone, "boneUraniumHoe");
            netherrackUraniumHoe = new InfiToolHoe(PHInfiTools.uraniumHoeID+3, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Netherrack, "netherrackUraniumHoe");
            glowstoneUraniumHoe = new InfiToolHoe(PHInfiTools.uraniumHoeID+4, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Glowstone, "glowstoneUraniumHoe");
            lavaUraniumHoe = new InfiToolHoe(PHInfiTools.uraniumHoeID+5, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Lava, "lavaUraniumHoe");
            blazeUraniumHoe = new InfiToolHoe(PHInfiTools.uraniumHoeID+6, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Blaze, "blazeUraniumHoe");
            cobaltUraniumHoe = new InfiToolHoe(PHInfiTools.uraniumHoeID+7, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Cobalt, "cobaltUraniumHoe");
            arditeUraniumHoe = new InfiToolHoe(PHInfiTools.uraniumHoeID+8, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Ardite, "arditeUraniumHoe");
            uraniumUraniumHoe = new InfiToolHoe(PHInfiTools.uraniumHoeID+9, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Uranium, "uraniumUraniumHoe");
        }
    }
    
    private static void addNames()
    {
    	if(PHInfiTools.enableWoodTools)
            ModLoader.addName(woodWoodHoe, "Wooden Hoe");
        if(PHInfiTools.enableStoneTools)
            ModLoader.addName(stoneStoneHoe, "Heavy Hoe");
        if(PHInfiTools.enableIronTools)
            ModLoader.addName(ironIronHoe, "Ironic Hoe");
        if(PHInfiTools.enableDiamondTools)
            ModLoader.addName(diamondDiamondHoe, "Diamondium Hoe");
        if(PHInfiTools.enableRedstoneTools)
            ModLoader.addName(redstoneRedstoneHoe, "Redredred Hoe");
        if(PHInfiTools.enableObsidianTools)
            ModLoader.addName(obsidianObsidianHoe, "Ebony Hoe");
        if(PHInfiTools.enableSandstoneTools)
            ModLoader.addName(sandstoneSandstoneHoe, "Fragile Hoe");
        if(PHInfiTools.enableNetherrackTools)
            ModLoader.addName(boneBoneHoe, "Necrotic Hoe");
        if(PHInfiTools.enablePaperTools)
            ModLoader.addName(paperPaperHoe, "Soft Hoe");
        if(PHInfiTools.enableMossyTools)
            ModLoader.addName(mossyMossyHoe, "Living Hoe");
        if(PHInfiTools.enableNetherrackTools)
            ModLoader.addName(netherrackNetherrackHoe, "Bloodsoaked Hoe");
        if(PHInfiTools.enableGlowstoneTools)
            ModLoader.addName(glowstoneGlowstoneHoe, "Bright Hoe");
        if(PHInfiTools.enableIceTools)
            ModLoader.addName(iceIceHoe, "Freezing Hoe");
        if(PHInfiTools.enableLavaTools)
            ModLoader.addName(lavaLavaHoe, "Burning Hoe");
        if(PHInfiTools.enableSlimeTools)
            ModLoader.addName(slimeSlimeHoe, "Toy Hoe");
        if(PHInfiTools.enableCactusTools)
            ModLoader.addName(cactusCactusHoe, "Thorned Hoe");
        if(PHInfiTools.enableFlintTools)
            ModLoader.addName(flintFlintHoe, "Rough-hewn Hoe");
        if(PHInfiTools.enableBlazeTools)
            ModLoader.addName(blazeBlazeHoe, "Netherite Hoe");
        if(PHInfiTools.enableCopperTools)
            ModLoader.addName(copperCopperHoe, "Orange-Tang Hoe");
        if(PHInfiTools.enableBronzeTools)
            ModLoader.addName(bronzeBronzeHoe, "Polished Hoe");
        if(PHInfiTools.enableWorkedIronTools)
            ModLoader.addName(workedWorkedIronHoe, "Reworked Iron Hoe");
        if(PHInfiTools.enableSteelTools)
            ModLoader.addName(steelSteelHoe, "Forge-Wrought Hoe");
        if(PHInfiTools.enableCobaltTools)
            ModLoader.addName(cobaltCobaltHoe, "Beautiful Hoe");
        if(PHInfiTools.enableArditeTools)
            ModLoader.addName(arditeArditeHoe, "Rustic Hoe");
        if(PHInfiTools.enableManyullynTools)
            ModLoader.addName(manyullynManyullynHoe, "False-Prophetic Hoe");
        if(PHInfiTools.enableUraniumTools)
            ModLoader.addName(uraniumUraniumHoe, "Cancerous Hoe");
    }
    
    public static void registerInfiToolsRecipes()
    {
    	if(PHInfiTools.enableWoodTools)
        {
            ModLoader.addRecipe(new ItemStack(woodWoodHoe), new Object[] 
                    { recipe, '#', Block.planks, '|', Item.stick });
            ModLoader.addRecipe(new ItemStack(sandstoneWoodHoe), new Object[] 
                    { recipe, '#', Block.planks, '|', InfiLibrary.sandstoneRod });
            ModLoader.addRecipe(new ItemStack(boneWoodHoe), new Object[] 
                    { recipe, '#', Block.planks, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneWoodHoe), new Object[] 
                    { recipe, '#', Block.planks, '|', InfiLibrary.boneRod });
            ModLoader.addRecipe(new ItemStack(paperWoodHoe), new Object[] 
                    { recipe, '#', Block.planks, '|', InfiLibrary.paperRod });
            ModLoader.addRecipe(new ItemStack(iceWoodHoe), new Object[] 
                    { recipe, '#', Block.planks, '|', InfiLibrary.iceRod });
            ModLoader.addRecipe(new ItemStack(slimeWoodHoe), new Object[] 
                    { recipe, '#', Block.planks, '|', InfiLibrary.slimeRod });
            ModLoader.addRecipe(new ItemStack(cactusWoodHoe), new Object[] 
                    { recipe, '#', Block.planks, '|', InfiLibrary.cactusRod });
        }
    	
        if(PHInfiTools.enableStoneTools)
        {
        	ModLoader.addRecipe(new ItemStack(woodStoneHoe), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', Item.stick });
        	ModLoader.addRecipe(new ItemStack(stoneStoneHoe), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', InfiLibrary.stoneRod });
            ModLoader.addRecipe(new ItemStack(sandstoneStoneHoe), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', InfiLibrary.sandstoneRod });
            ModLoader.addRecipe(new ItemStack(boneStoneHoe), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneStoneHoe), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', InfiLibrary.boneRod });
            ModLoader.addRecipe(new ItemStack(netherrackStoneHoe), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', InfiLibrary.netherrackRod });
            ModLoader.addRecipe(new ItemStack(iceStoneHoe), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', InfiLibrary.iceRod });
            ModLoader.addRecipe(new ItemStack(slimeStoneHoe), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', InfiLibrary.slimeRod });
            ModLoader.addRecipe(new ItemStack(cactusStoneHoe), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', InfiLibrary.cactusRod });
            ModLoader.addRecipe(new ItemStack(flintStoneHoe), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', InfiLibrary.flintRod });
            
            ModLoader.addRecipe(new ItemStack(woodStoneHoe), new Object[] 
                    { recipe, '#', Block.stone, '|', Item.stick });
        	ModLoader.addRecipe(new ItemStack(stoneStoneHoe), new Object[] 
                    { recipe, '#', Block.stone, '|', InfiLibrary.stoneRod });
            ModLoader.addRecipe(new ItemStack(sandstoneStoneHoe), new Object[] 
                    { recipe, '#', Block.stone, '|', InfiLibrary.sandstoneRod });
            ModLoader.addRecipe(new ItemStack(boneStoneHoe), new Object[] 
                    { recipe, '#', Block.stone, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneStoneHoe), new Object[] 
                    { recipe, '#', Block.stone, '|', InfiLibrary.boneRod });
            ModLoader.addRecipe(new ItemStack(netherrackStoneHoe), new Object[] 
                    { recipe, '#', Block.stone, '|', InfiLibrary.netherrackRod });
            ModLoader.addRecipe(new ItemStack(iceStoneHoe), new Object[] 
                    { recipe, '#', Block.stone, '|', InfiLibrary.iceRod });
            ModLoader.addRecipe(new ItemStack(slimeStoneHoe), new Object[] 
                    { recipe, '#', Block.stone, '|', InfiLibrary.slimeRod });
            ModLoader.addRecipe(new ItemStack(cactusStoneHoe), new Object[] 
                    { recipe, '#', Block.stone, '|', InfiLibrary.cactusRod });
            ModLoader.addRecipe(new ItemStack(flintStoneHoe), new Object[] 
                    { recipe, '#', Block.stone, '|', InfiLibrary.flintRod });
        }
        
        if(PHInfiTools.enableIronTools)
        {
        	ModLoader.addRecipe(new ItemStack(woodIronHoe), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', Item.stick });
        	ModLoader.addRecipe(new ItemStack(stoneIronHoe), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', InfiLibrary.stoneRod });
            ModLoader.addRecipe(new ItemStack(ironIronHoe), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', InfiLibrary.ironRod });
            ModLoader.addRecipe(new ItemStack(boneIronHoe), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneIronHoe), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', InfiLibrary.boneRod });
            ModLoader.addRecipe(new ItemStack(netherrackIronHoe), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', InfiLibrary.netherrackRod });
            ModLoader.addRecipe(new ItemStack(glowstoneIronHoe), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', InfiLibrary.glowstoneRod });
            ModLoader.addRecipe(new ItemStack(cactusIronHoe), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', InfiLibrary.cactusRod });
            ModLoader.addRecipe(new ItemStack(copperIronHoe), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', InfiLibrary.copperRod });
            ModLoader.addRecipe(new ItemStack(bronzeIronHoe), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', InfiLibrary.bronzeRod });
        }
        
        if(PHInfiTools.enableDiamondTools)
        {
        	ModLoader.addRecipe(new ItemStack(woodDiamondHoe), new Object[] 
                    { recipe, '#', Item.diamond, '|', Item.stick });
        	ModLoader.addRecipe(new ItemStack(stoneDiamondHoe), new Object[] 
                    { recipe, '#', Item.diamond, '|', InfiLibrary.stoneRod });
            ModLoader.addRecipe(new ItemStack(ironDiamondHoe), new Object[] 
                    { recipe, '#', Item.diamond, '|', InfiLibrary.ironRod });
            ModLoader.addRecipe(new ItemStack(diamondDiamondHoe), new Object[] 
                    { recipe, '#', Item.diamond, '|', InfiLibrary.diamondRod });
            ModLoader.addRecipe(new ItemStack(redstoneDiamondHoe), new Object[] 
                    { recipe, '#', Item.diamond, '|', InfiLibrary.redstoneRod });
            ModLoader.addRecipe(new ItemStack(obsidianDiamondHoe), new Object[] 
                    { recipe, '#', Item.diamond, '|', InfiLibrary.obsidianRod });
            ModLoader.addRecipe(new ItemStack(boneDiamondHoe), new Object[] 
                    { recipe, '#', Item.diamond, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneDiamondHoe), new Object[] 
                    { recipe, '#', Item.diamond, '|', InfiLibrary.boneRod });
            ModLoader.addRecipe(new ItemStack(mossyDiamondHoe), new Object[] 
                    { recipe, '#', Item.diamond, '|', InfiLibrary.mossyRod });
            ModLoader.addRecipe(new ItemStack(netherrackDiamondHoe), new Object[] 
                    { recipe, '#', Item.diamond, '|', InfiLibrary.netherrackRod });
            ModLoader.addRecipe(new ItemStack(glowstoneDiamondHoe), new Object[] 
                    { recipe, '#', Item.diamond, '|', InfiLibrary.glowstoneRod });
            ModLoader.addRecipe(new ItemStack(lavaDiamondHoe), new Object[] 
                    { recipe, '#', Item.diamond, '|', InfiLibrary.lavaRod });
            ModLoader.addRecipe(new ItemStack(cactusDiamondHoe), new Object[] 
                    { recipe, '#', Item.diamond, '|', InfiLibrary.cactusRod });
            ModLoader.addRecipe(new ItemStack(flintDiamondHoe), new Object[] 
                    { recipe, '#', Item.diamond, '|', InfiLibrary.flintRod });
            ModLoader.addRecipe(new ItemStack(blazeDiamondHoe), new Object[] 
                    { recipe, '#', Item.diamond, '|', Item.blazeRod });
            ModLoader.addRecipe(new ItemStack(copperDiamondHoe), new Object[] 
                    { recipe, '#', Item.diamond, '|', InfiLibrary.copperRod });
            ModLoader.addRecipe(new ItemStack(bronzeDiamondHoe), new Object[] 
                    { recipe, '#', Item.diamond, '|', InfiLibrary.bronzeRod });
            ModLoader.addRecipe(new ItemStack(workedDiamondHoe), new Object[] 
                    { recipe, '#', Item.diamond, '|', InfiLibrary.workedIronRod });
            ModLoader.addRecipe(new ItemStack(steelDiamondHoe), new Object[] 
                    { recipe, '#', Item.diamond, '|', InfiLibrary.steelRod });
            ModLoader.addRecipe(new ItemStack(cobaltDiamondHoe), new Object[] 
                    { recipe, '#', Item.diamond, '|', InfiLibrary.cobaltRod });
            ModLoader.addRecipe(new ItemStack(arditeDiamondHoe), new Object[] 
                    { recipe, '#', Item.diamond, '|', InfiLibrary.arditeRod });
            ModLoader.addRecipe(new ItemStack(manyullynDiamondHoe), new Object[] 
                    { recipe, '#', Item.diamond, '|', InfiLibrary.manyullynRod });
            ModLoader.addRecipe(new ItemStack(uraniumDiamondHoe), new Object[] 
                    { recipe, '#', Item.diamond, '|', InfiLibrary.uraniumRod });
        }
        
        if(PHInfiTools.enableRedstoneTools)
        {
        	ModLoader.addRecipe(new ItemStack(woodRedstoneHoe), new Object[] 
                    { recipe, '#', InfiLibrary.redstoneCrystal, '|', Item.stick });
        	ModLoader.addRecipe(new ItemStack(stoneRedstoneHoe), new Object[] 
                    { recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.stoneRod });
            ModLoader.addRecipe(new ItemStack(ironRedstoneHoe), new Object[] 
                    { recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.ironRod });
            ModLoader.addRecipe(new ItemStack(redstoneRedstoneHoe), new Object[] 
                    { recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.redstoneRod });
            ModLoader.addRecipe(new ItemStack(obsidianRedstoneHoe), new Object[] 
                    { recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.obsidianRod });
            ModLoader.addRecipe(new ItemStack(sandstoneRedstoneHoe), new Object[] 
                    { recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.sandstoneRod });
            ModLoader.addRecipe(new ItemStack(boneRedstoneHoe), new Object[] 
                    { recipe, '#', InfiLibrary.redstoneCrystal, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneRedstoneHoe), new Object[] 
                    { recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.boneRod });
            ModLoader.addRecipe(new ItemStack(paperRedstoneHoe), new Object[] 
                    { recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.paperRod });
            ModLoader.addRecipe(new ItemStack(mossyRedstoneHoe), new Object[] 
                    { recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.mossyRod });
            ModLoader.addRecipe(new ItemStack(netherrackRedstoneHoe), new Object[] 
                    { recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.netherrackRod });
            ModLoader.addRecipe(new ItemStack(glowstoneRedstoneHoe), new Object[] 
                    { recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.glowstoneRod });
            ModLoader.addRecipe(new ItemStack(iceRedstoneHoe), new Object[] 
                    { recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.iceRod });
            ModLoader.addRecipe(new ItemStack(lavaRedstoneHoe), new Object[] 
                    { recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.lavaRod });
            ModLoader.addRecipe(new ItemStack(slimeRedstoneHoe), new Object[] 
                    { recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.slimeRod });
            ModLoader.addRecipe(new ItemStack(cactusRedstoneHoe), new Object[] 
                    { recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.cactusRod });
            ModLoader.addRecipe(new ItemStack(flintRedstoneHoe), new Object[] 
                    { recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.flintRod });
            ModLoader.addRecipe(new ItemStack(copperRedstoneHoe), new Object[] 
                    { recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.copperRod });
            ModLoader.addRecipe(new ItemStack(bronzeRedstoneHoe), new Object[] 
                    { recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.bronzeRod });
            ModLoader.addRecipe(new ItemStack(workedRedstoneHoe), new Object[] 
                    { recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.workedIronRod });
            ModLoader.addRecipe(new ItemStack(uraniumRedstoneHoe), new Object[] 
                    { recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.uraniumRod });
        }
        
        if(PHInfiTools.enableObsidianTools)
        {
        	ModLoader.addRecipe(new ItemStack(woodObsidianHoe), new Object[] 
                    { recipe, '#', Block.obsidian, '|', Item.stick });
        	ModLoader.addRecipe(new ItemStack(stoneObsidianHoe), new Object[] 
                    { recipe, '#', Block.obsidian, '|', InfiLibrary.stoneRod });
            ModLoader.addRecipe(new ItemStack(redstoneObsidianHoe), new Object[] 
                    { recipe, '#', Block.obsidian, '|', InfiLibrary.redstoneRod });
            ModLoader.addRecipe(new ItemStack(obsidianObsidianHoe), new Object[] 
                    { recipe, '#', Block.obsidian, '|', InfiLibrary.obsidianRod });
            ModLoader.addRecipe(new ItemStack(boneObsidianHoe), new Object[] 
                    { recipe, '#', Block.obsidian, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneObsidianHoe), new Object[] 
                    { recipe, '#', Block.obsidian, '|', InfiLibrary.boneRod });
            ModLoader.addRecipe(new ItemStack(netherrackObsidianHoe), new Object[] 
                    { recipe, '#', Block.obsidian, '|', InfiLibrary.netherrackRod });
            ModLoader.addRecipe(new ItemStack(glowstoneObsidianHoe), new Object[] 
                    { recipe, '#', Block.obsidian, '|', InfiLibrary.glowstoneRod });
            ModLoader.addRecipe(new ItemStack(iceObsidianHoe), new Object[] 
                    { recipe, '#', Block.obsidian, '|', InfiLibrary.iceRod });
            ModLoader.addRecipe(new ItemStack(lavaObsidianHoe), new Object[] 
                    { recipe, '#', Block.obsidian, '|', InfiLibrary.lavaRod });
            ModLoader.addRecipe(new ItemStack(cactusObsidianHoe), new Object[] 
                    { recipe, '#', Block.obsidian, '|', InfiLibrary.cactusRod });
        }
        
        if(PHInfiTools.enableSandstoneTools)
        {
            ModLoader.addRecipe(new ItemStack(woodSandstoneHoe), new Object[] 
                    { recipe, '#', Block.sandStone, '|', Item.stick });
            ModLoader.addRecipe(new ItemStack(sandstoneSandstoneHoe), new Object[] 
                    { recipe, '#', Block.sandStone, '|', InfiLibrary.sandstoneRod });
            ModLoader.addRecipe(new ItemStack(boneSandstoneHoe), new Object[] 
                    { recipe, '#', Block.sandStone, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneSandstoneHoe), new Object[] 
                    { recipe, '#', Block.sandStone, '|', InfiLibrary.boneRod });      
            ModLoader.addRecipe(new ItemStack(netherrackSandstoneHoe), new Object[] 
                    { recipe, '#', Block.sandStone, '|', InfiLibrary.netherrackRod });
            ModLoader.addRecipe(new ItemStack(iceSandstoneHoe), new Object[] 
                    { recipe, '#', Block.sandStone, '|', InfiLibrary.iceRod });
            ModLoader.addRecipe(new ItemStack(slimeSandstoneHoe), new Object[] 
                    { recipe, '#', Block.sandStone, '|', InfiLibrary.slimeRod });
            ModLoader.addRecipe(new ItemStack(cactusSandstoneHoe), new Object[] 
                    { recipe, '#', Block.sandStone, '|', InfiLibrary.cactusRod });
            ModLoader.addRecipe(new ItemStack(flintSandstoneHoe), new Object[] 
                    { recipe, '#', Block.sandStone, '|', InfiLibrary.flintRod });
        }
        
        if(PHInfiTools.enableBoneTools)
        {
            ModLoader.addRecipe(new ItemStack(woodBoneHoe), new Object[] 
                    { recipe, '#', Item.bone, '|', Item.stick });
            ModLoader.addRecipe(new ItemStack(stoneBoneHoe), new Object[] 
                    { recipe, '#', Item.bone, '|', InfiLibrary.stoneRod });
            ModLoader.addRecipe(new ItemStack(sandstoneBoneHoe), new Object[] 
                    { recipe, '#', Item.bone, '|', InfiLibrary.sandstoneRod });
            ModLoader.addRecipe(new ItemStack(boneBoneHoe), new Object[] 
                    { recipe, '#', Item.bone, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneBoneHoe), new Object[] 
                    { recipe, '#', Item.bone, '|', InfiLibrary.boneRod });
            ModLoader.addRecipe(new ItemStack(paperBoneHoe), new Object[] 
                    { recipe, '#', Item.bone, '|', InfiLibrary.paperRod });
            ModLoader.addRecipe(new ItemStack(netherrackBoneHoe), new Object[] 
                    { recipe, '#', Item.bone, '|', InfiLibrary.netherrackRod });
            ModLoader.addRecipe(new ItemStack(iceBoneHoe), new Object[] 
                    { recipe, '#', Item.bone, '|', InfiLibrary.iceRod });
            ModLoader.addRecipe(new ItemStack(cactusBoneHoe), new Object[] 
                    { recipe, '#', Item.bone, '|', InfiLibrary.cactusRod });
            ModLoader.addRecipe(new ItemStack(flintBoneHoe), new Object[] 
                    { recipe, '#', Item.bone, '|', InfiLibrary.flintRod });
        }
        
        if(PHInfiTools.enablePaperTools)
        {
            ModLoader.addRecipe(new ItemStack(woodPaperHoe), new Object[] 
                    { recipe, '#', InfiLibrary.paperStack, '|', Item.stick });
            ModLoader.addRecipe(new ItemStack(bonePaperHoe), new Object[] 
                    { recipe, '#', InfiLibrary.paperStack, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(bonePaperHoe), new Object[] 
                    { recipe, '#', InfiLibrary.paperStack, '|', InfiLibrary.boneRod });
            ModLoader.addRecipe(new ItemStack(paperPaperHoe), new Object[] 
                    { recipe, '#', InfiLibrary.paperStack, '|', InfiLibrary.paperRod });
            ModLoader.addRecipe(new ItemStack(slimePaperHoe), new Object[] 
                    { recipe, '#', InfiLibrary.paperStack, '|', InfiLibrary.slimeRod });
            ModLoader.addRecipe(new ItemStack(cactusPaperHoe), new Object[] 
                    { recipe, '#', InfiLibrary.paperStack, '|', InfiLibrary.cactusRod });
        }
        
        if(PHInfiTools.enableMossyTools)
        {
        	ModLoader.addRecipe(new ItemStack(woodMossyHoe), new Object[] 
                    { recipe, '#', InfiLibrary.mossyStone, '|', Item.stick });
        	ModLoader.addRecipe(new ItemStack(stoneMossyHoe), new Object[] 
                    { recipe, '#', InfiLibrary.mossyStone, '|', InfiLibrary.stoneRod });
            ModLoader.addRecipe(new ItemStack(diamondMossyHoe), new Object[] 
                    { recipe, '#', InfiLibrary.mossyStone, '|', InfiLibrary.diamondRod });
            ModLoader.addRecipe(new ItemStack(redstoneMossyHoe), new Object[] 
                    { recipe, '#', InfiLibrary.mossyStone, '|', InfiLibrary.redstoneRod });
            ModLoader.addRecipe(new ItemStack(boneMossyHoe), new Object[] 
                    { recipe, '#', InfiLibrary.mossyStone, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneMossyHoe), new Object[] 
                    { recipe, '#', InfiLibrary.mossyStone, '|', InfiLibrary.boneRod });
            ModLoader.addRecipe(new ItemStack(mossyMossyHoe), new Object[] 
                    { recipe, '#', InfiLibrary.mossyStone, '|', InfiLibrary.mossyRod });
            ModLoader.addRecipe(new ItemStack(netherrackMossyHoe), new Object[] 
                    { recipe, '#', InfiLibrary.mossyStone, '|', InfiLibrary.netherrackRod });
            ModLoader.addRecipe(new ItemStack(glowstoneMossyHoe), new Object[] 
                    { recipe, '#', InfiLibrary.mossyStone, '|', InfiLibrary.glowstoneRod });
            ModLoader.addRecipe(new ItemStack(cactusMossyHoe), new Object[] 
                    { recipe, '#', InfiLibrary.mossyStone, '|', InfiLibrary.cactusRod });
            ModLoader.addRecipe(new ItemStack(blazeMossyHoe), new Object[] 
                    { recipe, '#', InfiLibrary.mossyStone, '|', Item.blazeRod });
            ModLoader.addRecipe(new ItemStack(manyullynMossyHoe), new Object[] 
                    { recipe, '#', InfiLibrary.mossyStone, '|', InfiLibrary.manyullynRod });
            ModLoader.addRecipe(new ItemStack(uraniumMossyHoe), new Object[] 
                    { recipe, '#', InfiLibrary.mossyStone, '|', InfiLibrary.uraniumRod });
        }
        
        if(PHInfiTools.enableNetherrackTools)
        {
        	ModLoader.addRecipe(new ItemStack(woodNetherrackHoe), new Object[] 
                    { recipe, '#', Block.netherrack, '|', Item.stick });
        	ModLoader.addRecipe(new ItemStack(stoneNetherrackHoe), new Object[] 
                    { recipe, '#', Block.netherrack, '|', InfiLibrary.stoneRod });
            ModLoader.addRecipe(new ItemStack(sandstoneNetherrackHoe), new Object[] 
                    { recipe, '#', Block.netherrack, '|', InfiLibrary.sandstoneRod });
            ModLoader.addRecipe(new ItemStack(boneNetherrackHoe), new Object[] 
                    { recipe, '#', Block.netherrack, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneNetherrackHoe), new Object[] 
                    { recipe, '#', Block.netherrack, '|', InfiLibrary.boneRod });
            ModLoader.addRecipe(new ItemStack(paperNetherrackHoe), new Object[] 
                    { recipe, '#', Block.netherrack, '|', InfiLibrary.paperRod });
            ModLoader.addRecipe(new ItemStack(mossyNetherrackHoe), new Object[] 
                    { recipe, '#', Block.netherrack, '|', InfiLibrary.mossyRod });
            ModLoader.addRecipe(new ItemStack(netherrackNetherrackHoe), new Object[] 
                    { recipe, '#', Block.netherrack, '|', InfiLibrary.netherrackRod });
            ModLoader.addRecipe(new ItemStack(iceNetherrackHoe), new Object[] 
                    { recipe, '#', Block.netherrack, '|', InfiLibrary.iceRod });
            ModLoader.addRecipe(new ItemStack(slimeNetherrackHoe), new Object[] 
                    { recipe, '#', Block.netherrack, '|', InfiLibrary.slimeRod });
            ModLoader.addRecipe(new ItemStack(cactusNetherrackHoe), new Object[] 
                    { recipe, '#', Block.netherrack, '|', InfiLibrary.cactusRod });
            ModLoader.addRecipe(new ItemStack(flintNetherrackHoe), new Object[] 
                    { recipe, '#', Block.netherrack, '|', InfiLibrary.flintRod });
            ModLoader.addRecipe(new ItemStack(copperNetherrackHoe), new Object[] 
                    { recipe, '#', Block.netherrack, '|', InfiLibrary.copperRod });
            ModLoader.addRecipe(new ItemStack(bronzeNetherrackHoe), new Object[] 
                    { recipe, '#', Block.netherrack, '|', InfiLibrary.bronzeRod });
        }
        
        if(PHInfiTools.enableGlowstoneTools)
        {
        	ModLoader.addRecipe(new ItemStack(woodGlowstoneHoe), new Object[] 
                    { recipe, '#', InfiLibrary.glowstoneCrystal, '|', Item.stick });
        	ModLoader.addRecipe(new ItemStack(redstoneGlowstoneHoe), new Object[] 
                    { recipe, '#', InfiLibrary.glowstoneCrystal, '|', InfiLibrary.redstoneRod });
        	ModLoader.addRecipe(new ItemStack(obsidianGlowstoneHoe), new Object[] 
                    { recipe, '#', InfiLibrary.glowstoneCrystal, '|', InfiLibrary.obsidianRod });
            ModLoader.addRecipe(new ItemStack(boneGlowstoneHoe), new Object[] 
                    { recipe, '#', InfiLibrary.glowstoneCrystal, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneGlowstoneHoe), new Object[] 
                    { recipe, '#', InfiLibrary.glowstoneCrystal, '|', InfiLibrary.boneRod });
            ModLoader.addRecipe(new ItemStack(netherrackGlowstoneHoe), new Object[] 
                    { recipe, '#', InfiLibrary.glowstoneCrystal, '|', InfiLibrary.netherrackRod });
            ModLoader.addRecipe(new ItemStack(glowstoneGlowstoneHoe), new Object[] 
                    { recipe, '#', InfiLibrary.glowstoneCrystal, '|', InfiLibrary.glowstoneRod });
            ModLoader.addRecipe(new ItemStack(iceGlowstoneHoe), new Object[] 
                    { recipe, '#', InfiLibrary.glowstoneCrystal, '|', InfiLibrary.iceRod });
            ModLoader.addRecipe(new ItemStack(slimeGlowstoneHoe), new Object[] 
                    { recipe, '#', InfiLibrary.glowstoneCrystal, '|', InfiLibrary.slimeRod });
            ModLoader.addRecipe(new ItemStack(cactusGlowstoneHoe), new Object[] 
                    { recipe, '#', InfiLibrary.glowstoneCrystal, '|', InfiLibrary.cactusRod });
        }
        
        if(PHInfiTools.enableIceTools)
        {
            ModLoader.addRecipe(new ItemStack(woodIceHoe), new Object[] 
                    { recipe, '#', Block.ice, '|', Item.stick });
            ModLoader.addRecipe(new ItemStack(boneIceHoe), new Object[] 
                    { recipe, '#', Block.ice, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneIceHoe), new Object[] 
                    { recipe, '#', Block.ice, '|', InfiLibrary.boneRod });
            ModLoader.addRecipe(new ItemStack(paperIceHoe), new Object[] 
                    { recipe, '#', Block.ice, '|', InfiLibrary.paperRod });
            ModLoader.addRecipe(new ItemStack(iceIceHoe), new Object[] 
                    { recipe, '#', Block.ice, '|', InfiLibrary.iceRod });
            ModLoader.addRecipe(new ItemStack(slimeIceHoe), new Object[] 
                    { recipe, '#', Block.ice, '|', InfiLibrary.slimeRod });
            ModLoader.addRecipe(new ItemStack(cactusIceHoe), new Object[] 
                    { recipe, '#', Block.ice, '|', InfiLibrary.cactusRod });
        }
        
        if(PHInfiTools.enableLavaTools)
        {
            ModLoader.addRecipe(new ItemStack(diamondLavaHoe), new Object[] 
                    { recipe, '#', InfiLibrary.lavaCrystal, '|', InfiLibrary.diamondRod });
            ModLoader.addRecipe(new ItemStack(obsidianLavaHoe), new Object[] 
                    { recipe, '#', InfiLibrary.lavaCrystal, '|', InfiLibrary.obsidianRod });
            ModLoader.addRecipe(new ItemStack(netherrackLavaHoe), new Object[] 
                    { recipe, '#', InfiLibrary.lavaCrystal, '|', InfiLibrary.netherrackRod });
            ModLoader.addRecipe(new ItemStack(lavaLavaHoe), new Object[] 
                    { recipe, '#', InfiLibrary.lavaCrystal, '|', InfiLibrary.lavaRod });
            ModLoader.addRecipe(new ItemStack(flintLavaHoe), new Object[] 
                    { recipe, '#', InfiLibrary.lavaCrystal, '|', InfiLibrary.flintRod });
            ModLoader.addRecipe(new ItemStack(blazeLavaHoe), new Object[] 
                    { recipe, '#', InfiLibrary.lavaCrystal, '|', Item.blazeRod });
            ModLoader.addRecipe(new ItemStack(manyullynLavaHoe), new Object[] 
                    { recipe, '#', InfiLibrary.lavaCrystal, '|', InfiLibrary.manyullynRod });
            ModLoader.addRecipe(new ItemStack(uraniumLavaHoe), new Object[] 
                    { recipe, '#', InfiLibrary.lavaCrystal, '|', InfiLibrary.uraniumRod });
        }
        
        if(PHInfiTools.enableSlimeTools)
        {
            ModLoader.addRecipe(new ItemStack(woodSlimeHoe), new Object[] 
                    { recipe, '#', InfiLibrary.slimeCrystal, '|', Item.stick });
            ModLoader.addRecipe(new ItemStack(sandstoneSlimeHoe), new Object[] 
                    { recipe, '#', InfiLibrary.slimeCrystal, '|', InfiLibrary.sandstoneRod });
            ModLoader.addRecipe(new ItemStack(boneSlimeHoe), new Object[] 
                    { recipe, '#', InfiLibrary.slimeCrystal, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneSlimeHoe), new Object[] 
                    { recipe, '#', InfiLibrary.slimeCrystal, '|', InfiLibrary.boneRod });
            ModLoader.addRecipe(new ItemStack(paperSlimeHoe), new Object[] 
                    { recipe, '#', InfiLibrary.slimeCrystal, '|', InfiLibrary.paperRod });
            ModLoader.addRecipe(new ItemStack(slimeSlimeHoe), new Object[] 
                    { recipe, '#', InfiLibrary.slimeCrystal, '|', InfiLibrary.slimeRod });
            ModLoader.addRecipe(new ItemStack(cactusSlimeHoe), new Object[] 
                    { recipe, '#', InfiLibrary.slimeCrystal, '|', InfiLibrary.cactusRod });
        }
        
        if(PHInfiTools.enableCactusTools)
        {
            ModLoader.addRecipe(new ItemStack(woodCactusHoe), new Object[] 
                    { recipe, '#', Block.cactus, '|', Item.stick });
            ModLoader.addRecipe(new ItemStack(sandstoneCactusHoe), new Object[] 
                    { recipe, '#', Block.cactus, '|', InfiLibrary.sandstoneRod });
            ModLoader.addRecipe(new ItemStack(boneCactusHoe), new Object[] 
                    { recipe, '#', Block.cactus, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneCactusHoe), new Object[] 
                    { recipe, '#', Block.cactus, '|', InfiLibrary.boneRod });
            ModLoader.addRecipe(new ItemStack(netherrackCactusHoe), new Object[] 
                    { recipe, '#', Block.cactus, '|', InfiLibrary.netherrackRod });
            ModLoader.addRecipe(new ItemStack(iceCactusHoe), new Object[] 
                    { recipe, '#', Block.cactus, '|', InfiLibrary.iceRod });
            ModLoader.addRecipe(new ItemStack(slimeCactusHoe), new Object[] 
                    { recipe, '#', Block.cactus, '|', InfiLibrary.slimeRod });
            ModLoader.addRecipe(new ItemStack(cactusCactusHoe), new Object[] 
                    { recipe, '#', Block.cactus, '|', InfiLibrary.cactusRod });
        }
        
        if(PHInfiTools.enableFlintTools)
        {
        	ModLoader.addRecipe(new ItemStack(woodFlintHoe), new Object[] 
                    { recipe, '#', Item.flint, '|', Item.stick });
        	ModLoader.addRecipe(new ItemStack(stoneFlintHoe), new Object[] 
                    { recipe, '#', Item.flint, '|', InfiLibrary.stoneRod });
            ModLoader.addRecipe(new ItemStack(sandstoneFlintHoe), new Object[] 
                    { recipe, '#', Item.flint, '|', InfiLibrary.sandstoneRod });
            ModLoader.addRecipe(new ItemStack(boneFlintHoe), new Object[] 
                    { recipe, '#', Item.flint, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneFlintHoe), new Object[] 
                    { recipe, '#', Item.flint, '|', InfiLibrary.boneRod });
            ModLoader.addRecipe(new ItemStack(netherrackFlintHoe), new Object[] 
                    { recipe, '#', Item.flint, '|', InfiLibrary.netherrackRod });
            ModLoader.addRecipe(new ItemStack(slimeFlintHoe), new Object[] 
                    { recipe, '#', Item.flint, '|', InfiLibrary.slimeRod });
            ModLoader.addRecipe(new ItemStack(cactusFlintHoe), new Object[] 
                    { recipe, '#', Item.flint, '|', InfiLibrary.cactusRod });
            ModLoader.addRecipe(new ItemStack(flintFlintHoe), new Object[] 
                    { recipe, '#', Item.flint, '|', InfiLibrary.flintRod });
            ModLoader.addRecipe(new ItemStack(copperFlintHoe), new Object[] 
                    { recipe, '#', Item.flint, '|', InfiLibrary.copperRod });
            ModLoader.addRecipe(new ItemStack(bronzeFlintHoe), new Object[] 
                    { recipe, '#', Item.flint, '|', InfiLibrary.bronzeRod });
        }
        
        if(PHInfiTools.enableBlazeTools)
        {
            ModLoader.addRecipe(new ItemStack(diamondBlazeHoe), new Object[] 
                    { recipe, '#', InfiLibrary.blazeCrystal, '|', InfiLibrary.diamondRod });
            ModLoader.addRecipe(new ItemStack(obsidianBlazeHoe), new Object[] 
                    { recipe, '#', InfiLibrary.blazeCrystal, '|', InfiLibrary.obsidianRod });
            ModLoader.addRecipe(new ItemStack(netherrackBlazeHoe), new Object[] 
                    { recipe, '#', InfiLibrary.blazeCrystal, '|', InfiLibrary.netherrackRod });
            ModLoader.addRecipe(new ItemStack(lavaBlazeHoe), new Object[] 
                    { recipe, '#', InfiLibrary.blazeCrystal, '|', InfiLibrary.lavaRod });
            ModLoader.addRecipe(new ItemStack(flintBlazeHoe), new Object[] 
                    { recipe, '#', InfiLibrary.blazeCrystal, '|', InfiLibrary.flintRod });
            ModLoader.addRecipe(new ItemStack(blazeBlazeHoe), new Object[] 
                    { recipe, '#', InfiLibrary.blazeCrystal, '|', Item.blazeRod });
            ModLoader.addRecipe(new ItemStack(manyullynBlazeHoe), new Object[] 
                    { recipe, '#', InfiLibrary.blazeCrystal, '|', InfiLibrary.manyullynRod });
            ModLoader.addRecipe(new ItemStack(uraniumBlazeHoe), new Object[] 
                    { recipe, '#', InfiLibrary.blazeCrystal, '|', InfiLibrary.uraniumRod });
        }
    }
    
    public static void addStoneTools(ItemStack stack)
    {
    	ModLoader.addRecipe(new ItemStack(woodStoneHoe), new Object[] 
                { recipe, '#', stack, '|', Item.stick });
    	ModLoader.addRecipe(new ItemStack(stoneStoneHoe), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.stoneRod });
        ModLoader.addRecipe(new ItemStack(sandstoneStoneHoe), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.sandstoneRod });
        ModLoader.addRecipe(new ItemStack(boneStoneHoe), new Object[] 
                { recipe, '#', stack, '|', Item.bone });
        ModLoader.addRecipe(new ItemStack(boneStoneHoe), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.boneRod });
        ModLoader.addRecipe(new ItemStack(netherrackStoneHoe), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.netherrackRod });
        ModLoader.addRecipe(new ItemStack(iceStoneHoe), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.iceRod });
        ModLoader.addRecipe(new ItemStack(slimeStoneHoe), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.slimeRod });
        ModLoader.addRecipe(new ItemStack(cactusStoneHoe), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.cactusRod });
        ModLoader.addRecipe(new ItemStack(flintStoneHoe), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.flintRod });
    }
    
    public static void addCopperTools(ItemStack stack)
    {
    	ModLoader.addRecipe(new ItemStack(woodCopperHoe), new Object[] 
                { recipe, '#', stack, '|', Item.stick });
        ModLoader.addRecipe(new ItemStack(stoneCopperHoe), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.stoneRod });
        ModLoader.addRecipe(new ItemStack(boneCopperHoe), new Object[] 
                { recipe, '#', stack, '|', Item.bone });
        ModLoader.addRecipe(new ItemStack(boneCopperHoe), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.boneRod });
        ModLoader.addRecipe(new ItemStack(netherrackCopperHoe), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.netherrackRod });
        ModLoader.addRecipe(new ItemStack(slimeCopperHoe), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.slimeRod });
        ModLoader.addRecipe(new ItemStack(cactusCopperHoe), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.cactusRod });
        ModLoader.addRecipe(new ItemStack(flintCopperHoe), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.flintRod });
        ModLoader.addRecipe(new ItemStack(copperCopperHoe), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.copperRod });
    }
    
    public static void addBronzeTools(ItemStack stack)
    {
    	ModLoader.addRecipe(new ItemStack(woodBronzeHoe), new Object[] 
                { recipe, '#', stack, '|', Item.stick });
        ModLoader.addRecipe(new ItemStack(stoneBronzeHoe), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.stoneRod });
        ModLoader.addRecipe(new ItemStack(boneBronzeHoe), new Object[] 
                { recipe, '#', stack, '|', Item.bone });
        ModLoader.addRecipe(new ItemStack(boneBronzeHoe), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.boneRod });
        ModLoader.addRecipe(new ItemStack(netherrackBronzeHoe), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.netherrackRod });
        ModLoader.addRecipe(new ItemStack(slimeBronzeHoe), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.slimeRod });
        ModLoader.addRecipe(new ItemStack(cactusBronzeHoe), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.cactusRod });
        ModLoader.addRecipe(new ItemStack(flintBronzeHoe), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.flintRod });
        ModLoader.addRecipe(new ItemStack(copperBronzeHoe), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.copperRod });
        ModLoader.addRecipe(new ItemStack(bronzeBronzeHoe), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.bronzeRod });
    }
    
    public static void addWorkedIronTools(ItemStack stack)
    {
    	ModLoader.addRecipe(new ItemStack(woodWorkedIronHoe), new Object[] 
                { recipe, '#', stack, '|', Item.stick });
        ModLoader.addRecipe(new ItemStack(stoneWorkedIronHoe), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.stoneRod });
        ModLoader.addRecipe(new ItemStack(ironWorkedIronHoe), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.ironRod });
        ModLoader.addRecipe(new ItemStack(diamondWorkedIronHoe), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.diamondRod });
        ModLoader.addRecipe(new ItemStack(redstoneWorkedIronHoe), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.redstoneRod });
        ModLoader.addRecipe(new ItemStack(obsidianWorkedIronHoe), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.obsidianRod });
        ModLoader.addRecipe(new ItemStack(boneWorkedIronHoe), new Object[] 
                { recipe, '#', stack, '|', Item.bone });
        ModLoader.addRecipe(new ItemStack(boneWorkedIronHoe), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.boneRod });
        ModLoader.addRecipe(new ItemStack(netherrackWorkedIronHoe), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.netherrackRod });
        ModLoader.addRecipe(new ItemStack(glowstoneWorkedIronHoe), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.glowstoneRod });
        ModLoader.addRecipe(new ItemStack(iceWorkedIronHoe), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.iceRod });
        ModLoader.addRecipe(new ItemStack(slimeWorkedIronHoe), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.slimeRod });
        ModLoader.addRecipe(new ItemStack(cactusWorkedIronHoe), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.cactusRod });
        ModLoader.addRecipe(new ItemStack(blazeWorkedIronHoe), new Object[] 
                { recipe, '#', stack, '|', Item.blazeRod });
        ModLoader.addRecipe(new ItemStack(copperWorkedIronHoe), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.copperRod });
        ModLoader.addRecipe(new ItemStack(bronzeWorkedIronHoe), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.bronzeRod });
        ModLoader.addRecipe(new ItemStack(workedWorkedIronHoe), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.workedIronRod });
        ModLoader.addRecipe(new ItemStack(steelWorkedIronHoe), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.steelRod });
        ModLoader.addRecipe(new ItemStack(uraniumWorkedIronHoe), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.uraniumRod });
    }
    
    public static void addSteelTools(ItemStack stack)
    {
    	ModLoader.addRecipe(new ItemStack(woodSteelHoe), new Object[] 
                { recipe, '#', stack, '|', Item.stick });
        ModLoader.addRecipe(new ItemStack(stoneSteelHoe), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.stoneRod });
        ModLoader.addRecipe(new ItemStack(ironSteelHoe), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.ironRod });
        ModLoader.addRecipe(new ItemStack(diamondSteelHoe), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.diamondRod });
        ModLoader.addRecipe(new ItemStack(redstoneSteelHoe), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.redstoneRod });
        ModLoader.addRecipe(new ItemStack(obsidianSteelHoe), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.obsidianRod });
        ModLoader.addRecipe(new ItemStack(boneSteelHoe), new Object[] 
                { recipe, '#', stack, '|', Item.bone });
        ModLoader.addRecipe(new ItemStack(boneSteelHoe), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.boneRod });
        ModLoader.addRecipe(new ItemStack(netherrackSteelHoe), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.netherrackRod });
        ModLoader.addRecipe(new ItemStack(glowstoneSteelHoe), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.glowstoneRod });
        ModLoader.addRecipe(new ItemStack(iceSteelHoe), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.iceRod });
        ModLoader.addRecipe(new ItemStack(slimeSteelHoe), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.slimeRod });
        ModLoader.addRecipe(new ItemStack(cactusSteelHoe), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.cactusRod });
        ModLoader.addRecipe(new ItemStack(blazeSteelHoe), new Object[] 
                { recipe, '#', stack, '|', Item.blazeRod });
        ModLoader.addRecipe(new ItemStack(copperSteelHoe), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.copperRod });
        ModLoader.addRecipe(new ItemStack(bronzeSteelHoe), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.bronzeRod });
        ModLoader.addRecipe(new ItemStack(workedSteelHoe), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.workedIronRod });
        ModLoader.addRecipe(new ItemStack(steelSteelHoe), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.steelRod });
        ModLoader.addRecipe(new ItemStack(cobaltSteelHoe), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.cobaltRod });
        ModLoader.addRecipe(new ItemStack(arditeSteelHoe), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.arditeRod });
        ModLoader.addRecipe(new ItemStack(uraniumSteelHoe), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.uraniumRod });
    }
    
    public static void addCobaltTools(ItemStack stack)
    {
    	ModLoader.addRecipe(new ItemStack(woodCobaltHoe), new Object[] 
                { recipe, '#', stack, '|', Item.stick });
        ModLoader.addRecipe(new ItemStack(stoneCobaltHoe), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.stoneRod });
        ModLoader.addRecipe(new ItemStack(ironCobaltHoe), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.ironRod });
        ModLoader.addRecipe(new ItemStack(diamondCobaltHoe), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.diamondRod });
        ModLoader.addRecipe(new ItemStack(redstoneCobaltHoe), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.redstoneRod });
        ModLoader.addRecipe(new ItemStack(obsidianCobaltHoe), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.obsidianRod });
        ModLoader.addRecipe(new ItemStack(boneCobaltHoe), new Object[] 
                { recipe, '#', stack, '|', Item.bone });
        ModLoader.addRecipe(new ItemStack(boneCobaltHoe), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.boneRod });
        ModLoader.addRecipe(new ItemStack(slimeCobaltHoe), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.slimeRod });
        ModLoader.addRecipe(new ItemStack(cactusCobaltHoe), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.cactusRod });
        ModLoader.addRecipe(new ItemStack(blazeCobaltHoe), new Object[] 
                { recipe, '#', stack, '|', Item.blazeRod });
        ModLoader.addRecipe(new ItemStack(copperCobaltHoe), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.copperRod });
        ModLoader.addRecipe(new ItemStack(bronzeCobaltHoe), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.bronzeRod });
        ModLoader.addRecipe(new ItemStack(workedCobaltHoe), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.workedIronRod });
        ModLoader.addRecipe(new ItemStack(steelCobaltHoe), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.steelRod });
        ModLoader.addRecipe(new ItemStack(cobaltCobaltHoe), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.cobaltRod });
        ModLoader.addRecipe(new ItemStack(arditeCobaltHoe), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.arditeRod });
        ModLoader.addRecipe(new ItemStack(manyullynCobaltHoe), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.manyullynRod });
        ModLoader.addRecipe(new ItemStack(uraniumCobaltHoe), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.uraniumRod });
    }
    
    public static void addArditeTools(ItemStack stack)
    {
    	ModLoader.addRecipe(new ItemStack(woodArditeHoe), new Object[] 
                { recipe, '#', stack, '|', Item.stick });
        ModLoader.addRecipe(new ItemStack(stoneArditeHoe), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.stoneRod });
        ModLoader.addRecipe(new ItemStack(ironArditeHoe), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.ironRod });
        ModLoader.addRecipe(new ItemStack(diamondArditeHoe), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.diamondRod });
        ModLoader.addRecipe(new ItemStack(redstoneArditeHoe), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.redstoneRod });
        ModLoader.addRecipe(new ItemStack(obsidianArditeHoe), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.obsidianRod });
        ModLoader.addRecipe(new ItemStack(boneArditeHoe), new Object[] 
                { recipe, '#', stack, '|', Item.bone });
        ModLoader.addRecipe(new ItemStack(boneArditeHoe), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.boneRod });
        ModLoader.addRecipe(new ItemStack(slimeArditeHoe), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.slimeRod });
        ModLoader.addRecipe(new ItemStack(cactusArditeHoe), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.cactusRod });
        ModLoader.addRecipe(new ItemStack(blazeArditeHoe), new Object[] 
                { recipe, '#', stack, '|', Item.blazeRod });
        ModLoader.addRecipe(new ItemStack(copperArditeHoe), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.copperRod });
        ModLoader.addRecipe(new ItemStack(bronzeArditeHoe), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.bronzeRod });
        ModLoader.addRecipe(new ItemStack(workedArditeHoe), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.workedIronRod });
        ModLoader.addRecipe(new ItemStack(steelArditeHoe), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.steelRod });
        ModLoader.addRecipe(new ItemStack(cobaltArditeHoe), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.cobaltRod });
        ModLoader.addRecipe(new ItemStack(arditeArditeHoe), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.arditeRod });
        ModLoader.addRecipe(new ItemStack(manyullynArditeHoe), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.manyullynRod });
        ModLoader.addRecipe(new ItemStack(uraniumArditeHoe), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.uraniumRod });
    }
    
    public static void addManyullynTools(ItemStack stack)
    {
    	ModLoader.addRecipe(new ItemStack(woodManyullynHoe), new Object[] 
                { recipe, '#', stack, '|', Item.stick });
        ModLoader.addRecipe(new ItemStack(stoneManyullynHoe), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.stoneRod });
        ModLoader.addRecipe(new ItemStack(ironManyullynHoe), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.ironRod });
        ModLoader.addRecipe(new ItemStack(diamondManyullynHoe), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.diamondRod });
        ModLoader.addRecipe(new ItemStack(redstoneManyullynHoe), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.redstoneRod });
        ModLoader.addRecipe(new ItemStack(obsidianManyullynHoe), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.obsidianRod });
        ModLoader.addRecipe(new ItemStack(boneManyullynHoe), new Object[] 
                { recipe, '#', stack, '|', Item.bone });
        ModLoader.addRecipe(new ItemStack(boneManyullynHoe), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.boneRod });
        ModLoader.addRecipe(new ItemStack(slimeManyullynHoe), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.slimeRod });
        ModLoader.addRecipe(new ItemStack(cactusManyullynHoe), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.cactusRod });
        ModLoader.addRecipe(new ItemStack(blazeManyullynHoe), new Object[] 
                { recipe, '#', stack, '|', Item.blazeRod });
        ModLoader.addRecipe(new ItemStack(copperManyullynHoe), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.copperRod });
        ModLoader.addRecipe(new ItemStack(bronzeManyullynHoe), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.bronzeRod });
        ModLoader.addRecipe(new ItemStack(workedManyullynHoe), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.workedIronRod });
        ModLoader.addRecipe(new ItemStack(steelManyullynHoe), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.steelRod });
        ModLoader.addRecipe(new ItemStack(cobaltManyullynHoe), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.cobaltRod });
        ModLoader.addRecipe(new ItemStack(arditeManyullynHoe), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.arditeRod });
        ModLoader.addRecipe(new ItemStack(manyullynManyullynHoe), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.manyullynRod });
        ModLoader.addRecipe(new ItemStack(uraniumManyullynHoe), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.uraniumRod });
    }
    
    public static void addUraniumTools(ItemStack stack)
    {
        ModLoader.addRecipe(new ItemStack(diamondUraniumHoe), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.diamondRod });
        ModLoader.addRecipe(new ItemStack(redstoneUraniumHoe), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.redstoneRod });
        ModLoader.addRecipe(new ItemStack(boneUraniumHoe), new Object[] 
                { recipe, '#', stack, '|', Item.bone });
        ModLoader.addRecipe(new ItemStack(boneUraniumHoe), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.boneRod });
        ModLoader.addRecipe(new ItemStack(netherrackUraniumHoe), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.netherrackRod });
        ModLoader.addRecipe(new ItemStack(glowstoneUraniumHoe), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.glowstoneRod });
        ModLoader.addRecipe(new ItemStack(lavaUraniumHoe), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.lavaRod });
        ModLoader.addRecipe(new ItemStack(blazeUraniumHoe), new Object[] 
                { recipe, '#', stack, '|', Item.blazeRod });
        ModLoader.addRecipe(new ItemStack(cobaltUraniumHoe), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.cobaltRod });
        ModLoader.addRecipe(new ItemStack(arditeUraniumHoe), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.arditeRod });
        ModLoader.addRecipe(new ItemStack(uraniumUraniumHoe), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.uraniumRod });
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
