package net.minecraft.src.inficore;
import net.minecraft.src.Block;
import net.minecraft.src.InfiMaterialEnum;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;
import net.minecraft.src.ModLoader;
import net.minecraft.src.mod_InfiBase;
import net.minecraft.src.forge.MinecraftForge;

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
    	if(PropsHelperInfiTools.enableWoodTools)
    	{
    		woodWoodHoe = new InfiToolHoe(PropsHelperInfiTools.woodHoeID+0, 
                    InfiMaterialEnum.Wood, InfiMaterialEnum.Wood, "woodWood");
    		sandstoneWoodHoe = new InfiToolHoe(PropsHelperInfiTools.woodHoeID+1, 
                    InfiMaterialEnum.Wood, InfiMaterialEnum.Sandstone, "sandstoneWoodHoe");
    		boneWoodHoe = new InfiToolHoe(PropsHelperInfiTools.woodHoeID+2, 
                    InfiMaterialEnum.Wood, InfiMaterialEnum.Bone, "boneWoodHoe");
    		paperWoodHoe = new InfiToolHoe(PropsHelperInfiTools.woodHoeID+3, 
                    InfiMaterialEnum.Wood, InfiMaterialEnum.Paper, "paperWoodHoe");
    		iceWoodHoe = new InfiToolHoe(PropsHelperInfiTools.woodHoeID+4, 
                    InfiMaterialEnum.Wood, InfiMaterialEnum.Ice, "iceWoodHoe");
    		slimeWoodHoe = new InfiToolHoe(PropsHelperInfiTools.woodHoeID+5, 
                    InfiMaterialEnum.Wood, InfiMaterialEnum.Slime, "slimeWoodHoe");
    		cactusWoodHoe = new InfiToolHoe(PropsHelperInfiTools.woodHoeID+6, 
                    InfiMaterialEnum.Wood, InfiMaterialEnum.Cactus, "cactusWoodHoe");
    		
    		
    		
    		
    		
    		
    		
    		
    	}

        if(PropsHelperInfiTools.enableStoneTools)
        {
        	woodStoneHoe = new InfiToolHoe(PropsHelperInfiTools.stoneHoeID+0, 
                    InfiMaterialEnum.Stone, InfiMaterialEnum.Wood, "woodStoneHoe");
        	stoneStoneHoe = new InfiToolHoe(PropsHelperInfiTools.stoneHoeID+1, 
                    InfiMaterialEnum.Stone, InfiMaterialEnum.Stone, "stoneStoneHoe");
        	sandstoneStoneHoe = new InfiToolHoe(PropsHelperInfiTools.stoneHoeID+2, 
                    InfiMaterialEnum.Stone, InfiMaterialEnum.Sandstone, "sandstoneStoneHoe");
        	boneStoneHoe = new InfiToolHoe(PropsHelperInfiTools.stoneHoeID+3, 
                    InfiMaterialEnum.Stone, InfiMaterialEnum.Bone, "boneStoneHoe");
        	netherrackStoneHoe = new InfiToolHoe(PropsHelperInfiTools.stoneHoeID+4, 
                    InfiMaterialEnum.Stone, InfiMaterialEnum.Netherrack, "netherrackStoneHoe");
        	iceStoneHoe = new InfiToolHoe(PropsHelperInfiTools.stoneHoeID+5, 
                    InfiMaterialEnum.Stone, InfiMaterialEnum.Ice, "iceStoneHoe");
        	slimeStoneHoe = new InfiToolHoe(PropsHelperInfiTools.stoneHoeID+6, 
                    InfiMaterialEnum.Stone, InfiMaterialEnum.Slime, "slimeStoneHoe");
        	cactusStoneHoe = new InfiToolHoe(PropsHelperInfiTools.stoneHoeID+7, 
                    InfiMaterialEnum.Stone, InfiMaterialEnum.Cactus, "cactusStoneHoe");
        	flintStoneHoe = new InfiToolHoe(PropsHelperInfiTools.stoneHoeID+8, 
                    InfiMaterialEnum.Stone, InfiMaterialEnum.Flint, "flintStoneHoe");
            
            
            
            
            
            
            
            
            
            
        }
        
        if(PropsHelperInfiTools.enableIronTools)
        {
        	woodIronHoe = new InfiToolHoe(PropsHelperInfiTools.ironHoeID+0, 
                    InfiMaterialEnum.Iron, InfiMaterialEnum.Wood, "woodIronHoe");
        	stoneIronHoe = new InfiToolHoe(PropsHelperInfiTools.ironHoeID+1, 
                    InfiMaterialEnum.Iron, InfiMaterialEnum.Stone, "stoneIronHoe");
        	ironIronHoe = new InfiToolHoe(PropsHelperInfiTools.ironHoeID+2, 
                    InfiMaterialEnum.Iron, InfiMaterialEnum.Iron, "ironIronHoe");
        	boneIronHoe = new InfiToolHoe(PropsHelperInfiTools.ironHoeID+3, 
                    InfiMaterialEnum.Iron, InfiMaterialEnum.Bone, "boneIronHoe");
        	netherrackIronHoe = new InfiToolHoe(PropsHelperInfiTools.ironHoeID+4, 
                    InfiMaterialEnum.Iron, InfiMaterialEnum.Netherrack, "netherrackIronHoe");
        	glowstoneIronHoe = new InfiToolHoe(PropsHelperInfiTools.ironHoeID+5, 
                    InfiMaterialEnum.Iron, InfiMaterialEnum.Glowstone, "glowstoneIronHoe");
        	cactusIronHoe = new InfiToolHoe(PropsHelperInfiTools.ironHoeID+6, 
                    InfiMaterialEnum.Iron, InfiMaterialEnum.Cactus, "cactusIronHoe");
        	copperIronHoe = new InfiToolHoe(PropsHelperInfiTools.ironHoeID+7, 
                    InfiMaterialEnum.Iron, InfiMaterialEnum.Copper, "copperIronHoe");
        	bronzeIronHoe = new InfiToolHoe(PropsHelperInfiTools.ironHoeID+8, 
                    InfiMaterialEnum.Iron, InfiMaterialEnum.Bronze, "bronzeIronHoe");
            
            
            
            
            
            
            
            
            
            
        }
        
        if(PropsHelperInfiTools.enableDiamondTools)
        {
        	woodDiamondHoe = new InfiToolHoe(PropsHelperInfiTools.diamondHoeID+0, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Wood, "woodDiamondHoe");
        	stoneDiamondHoe = new InfiToolHoe(PropsHelperInfiTools.diamondHoeID+1, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Stone, "stoneDiamondHoe");
        	ironDiamondHoe = new InfiToolHoe(PropsHelperInfiTools.diamondHoeID+2, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Iron, "ironDiamondHoe");
        	diamondDiamondHoe = new InfiToolHoe(PropsHelperInfiTools.diamondHoeID+3, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Diamond, "diamondDiamondHoe");
        	redstoneDiamondHoe = new InfiToolHoe(PropsHelperInfiTools.diamondHoeID+4, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Redstone, "redstoneDiamondHoe");
        	obsidianDiamondHoe = new InfiToolHoe(PropsHelperInfiTools.diamondHoeID+5, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Obsidian, "obsidianDiamondHoe");
        	boneDiamondHoe = new InfiToolHoe(PropsHelperInfiTools.diamondHoeID+6, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Bone, "boneDiamondHoe");
        	mossyDiamondHoe = new InfiToolHoe(PropsHelperInfiTools.diamondHoeID+7, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Mossy, "mossyDiamondHoe");
        	netherrackDiamondHoe = new InfiToolHoe(PropsHelperInfiTools.diamondHoeID+8, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Netherrack, "netherrackDiamondHoe");
        	glowstoneDiamondHoe = new InfiToolHoe(PropsHelperInfiTools.diamondHoeID+9, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Glowstone, "glowstoneDiamondHoe");
        	lavaDiamondHoe = new InfiToolHoe(PropsHelperInfiTools.diamondHoeID+10, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Lava, "lavaDiamondHoe");
        	cactusDiamondHoe = new InfiToolHoe(PropsHelperInfiTools.diamondHoeID+11, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Cactus, "cactusDiamondHoe");
        	flintDiamondHoe = new InfiToolHoe(PropsHelperInfiTools.diamondHoeID+12, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Flint, "flintDiamondHoe");
        	blazeDiamondHoe = new InfiToolHoe(PropsHelperInfiTools.diamondHoeID+13, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Blaze, "blazeDiamondHoe");
            copperDiamondHoe = new InfiToolHoe(PropsHelperInfiTools.diamondHoeID+14, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Copper, "copperDiamondHoe");
            bronzeDiamondHoe = new InfiToolHoe(PropsHelperInfiTools.diamondHoeID+15, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Bronze, "bronzeDiamondHoe");
            workedDiamondHoe = new InfiToolHoe(PropsHelperInfiTools.diamondHoeID+16, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.WorkedIron, "workedDiamondHoe");
            steelDiamondHoe = new InfiToolHoe(PropsHelperInfiTools.diamondHoeID+17, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Steel, "steelDiamondHoe");
            cobaltDiamondHoe = new InfiToolHoe(PropsHelperInfiTools.diamondHoeID+18, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Cobalt, "cobaltDiamondHoe");
            arditeDiamondHoe = new InfiToolHoe(PropsHelperInfiTools.diamondHoeID+19, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Ardite, "arditeDiamondHoe");
            manyullynDiamondHoe = new InfiToolHoe(PropsHelperInfiTools.diamondHoeID+20, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Manyullyn, "manyullynDiamondHoe");
            uraniumDiamondHoe = new InfiToolHoe(PropsHelperInfiTools.diamondHoeID+21, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Uranium, "uraniumDiamondHoe");
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
        }
        
        if(PropsHelperInfiTools.enableRedstoneTools)
        {
        	woodRedstoneHoe = new InfiToolHoe(PropsHelperInfiTools.redstoneHoeID+0, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Redstone, "woodRedstoneHoe");
        	stoneRedstoneHoe = new InfiToolHoe(PropsHelperInfiTools.redstoneHoeID+1, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Stone, "stoneRedstoneHoe");
        	ironRedstoneHoe = new InfiToolHoe(PropsHelperInfiTools.redstoneHoeID+2, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Iron, "ironRedstoneHoe");
        	redstoneRedstoneHoe = new InfiToolHoe(PropsHelperInfiTools.redstoneHoeID+3, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Redstone, "redstoneRedstoneHoe");
        	obsidianRedstoneHoe = new InfiToolHoe(PropsHelperInfiTools.redstoneHoeID+4, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Obsidian, "obsidianRedstoneHoe");
        	sandstoneRedstoneHoe = new InfiToolHoe(PropsHelperInfiTools.redstoneHoeID+5, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Sandstone, "sandstoneRedstoneHoe");
        	boneRedstoneHoe = new InfiToolHoe(PropsHelperInfiTools.redstoneHoeID+6, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Bone, "boneRedstoneHoe");
        	paperRedstoneHoe = new InfiToolHoe(PropsHelperInfiTools.redstoneHoeID+7, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Paper, "paperRedstoneHoe");
        	mossyRedstoneHoe = new InfiToolHoe(PropsHelperInfiTools.redstoneHoeID+8, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Mossy, "mossyRedstoneHoe");
        	netherrackRedstoneHoe = new InfiToolHoe(PropsHelperInfiTools.redstoneHoeID+9, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Netherrack, "netherrackRedstoneHoe");
        	glowstoneRedstoneHoe = new InfiToolHoe(PropsHelperInfiTools.redstoneHoeID+10, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Glowstone, "glowstoneRedstoneHoe");
        	iceRedstoneHoe = new InfiToolHoe(PropsHelperInfiTools.redstoneHoeID+11, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Ice, "iceRedstoneHoe");
        	lavaRedstoneHoe = new InfiToolHoe(PropsHelperInfiTools.redstoneHoeID+12,
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Lava, "lavaRedstoneHoe");
        	slimeRedstoneHoe = new InfiToolHoe(PropsHelperInfiTools.redstoneHoeID+13,
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Slime, "slimeRedstoneHoe");
        	cactusRedstoneHoe = new InfiToolHoe(PropsHelperInfiTools.redstoneHoeID+14,
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Cactus, "cactusRedstoneHoe");
        	flintRedstoneHoe = new InfiToolHoe(PropsHelperInfiTools.redstoneHoeID+15,
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Flint, "flintRedstoneHoe");
        	copperRedstoneHoe = new InfiToolHoe(PropsHelperInfiTools.redstoneHoeID+16,
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Copper, "copperRedstoneHoe");
        	bronzeRedstoneHoe = new InfiToolHoe(PropsHelperInfiTools.redstoneHoeID+17,
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Bronze, "bronzeRedstoneHoe");
        	workedRedstoneHoe = new InfiToolHoe(PropsHelperInfiTools.redstoneHoeID+18,
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.WorkedIron, "workedRedstoneHoe");
        	uraniumRedstoneHoe = new InfiToolHoe(PropsHelperInfiTools.redstoneHoeID+19,
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Uranium, "uraniumRedstoneHoe");
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
        }
        
        if(PropsHelperInfiTools.enableObsidianTools)
        {
        	woodObsidianHoe = new InfiToolHoe(PropsHelperInfiTools.obsidianHoeID+0, 
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Obsidian, "woodObsidianHoe");
        	stoneObsidianHoe = new InfiToolHoe(PropsHelperInfiTools.obsidianHoeID+1, 
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Stone, "stoneObsidianHoe");
        	redstoneObsidianHoe = new InfiToolHoe(PropsHelperInfiTools.obsidianHoeID+2, 
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Obsidian, "redstoneObsidianHoe");
        	obsidianObsidianHoe = new InfiToolHoe(PropsHelperInfiTools.obsidianHoeID+3, 
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Obsidian, "obsidianObsidianHoe");;
        	boneObsidianHoe = new InfiToolHoe(PropsHelperInfiTools.obsidianHoeID+4, 
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Bone, "boneObsidianHoe");
        	netherrackObsidianHoe = new InfiToolHoe(PropsHelperInfiTools.obsidianHoeID+5, 
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Netherrack, "netherrackObsidianHoe");
        	glowstoneObsidianHoe = new InfiToolHoe(PropsHelperInfiTools.obsidianHoeID+6, 
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Glowstone, "glowstoneObsidianHoe");
        	iceObsidianHoe = new InfiToolHoe(PropsHelperInfiTools.obsidianHoeID+7, 
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Ice, "iceObsidianHoe");
        	lavaObsidianHoe = new InfiToolHoe(PropsHelperInfiTools.obsidianHoeID+8,
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Lava, "lavaObsidianHoe");
        	cactusObsidianHoe = new InfiToolHoe(PropsHelperInfiTools.obsidianHoeID+9,
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Cactus, "cactusObsidianHoe");
            
            
            
            
            
            
            
            
            
            
            
        }
        
        if(PropsHelperInfiTools.enableSandstoneTools)
        {
        	woodSandstoneHoe = new InfiToolHoe(PropsHelperInfiTools.sandstoneHoeID+0, 
                    InfiMaterialEnum.Sandstone, InfiMaterialEnum.Sandstone, "woodSandstoneHoe");
        	sandstoneSandstoneHoe = new InfiToolHoe(PropsHelperInfiTools.sandstoneHoeID+1, 
                    InfiMaterialEnum.Sandstone, InfiMaterialEnum.Sandstone, "sandstoneSandstoneHoe");
        	boneSandstoneHoe = new InfiToolHoe(PropsHelperInfiTools.sandstoneHoeID+2, 
                    InfiMaterialEnum.Sandstone, InfiMaterialEnum.Bone, "boneSandstoneHoe");
        	netherrackSandstoneHoe = new InfiToolHoe(PropsHelperInfiTools.sandstoneHoeID+3, 
                    InfiMaterialEnum.Sandstone, InfiMaterialEnum.Netherrack, "netherrackSandstoneHoe");
        	iceSandstoneHoe = new InfiToolHoe(PropsHelperInfiTools.sandstoneHoeID+4, 
                    InfiMaterialEnum.Sandstone, InfiMaterialEnum.Ice, "iceSandstoneHoe");
        	slimeSandstoneHoe = new InfiToolHoe(PropsHelperInfiTools.sandstoneHoeID+5,
                    InfiMaterialEnum.Sandstone, InfiMaterialEnum.Slime, "slimeSandstoneHoe");
        	cactusSandstoneHoe = new InfiToolHoe(PropsHelperInfiTools.sandstoneHoeID+6,
                    InfiMaterialEnum.Sandstone, InfiMaterialEnum.Cactus, "cactusSandstoneHoe");
        	flintSandstoneHoe = new InfiToolHoe(PropsHelperInfiTools.sandstoneHoeID+7,
                    InfiMaterialEnum.Sandstone, InfiMaterialEnum.Flint, "flintSandstoneHoe");
            
            
            
            
            
            
            
            
            
        }
        
        if(PropsHelperInfiTools.enableBoneTools)
        {
        	woodBoneHoe = new InfiToolHoe(PropsHelperInfiTools.boneHoeID+0, 
                    InfiMaterialEnum.Bone, InfiMaterialEnum.Bone, "woodBoneHoe");
        	stoneBoneHoe = new InfiToolHoe(PropsHelperInfiTools.boneHoeID+1, 
                    InfiMaterialEnum.Bone, InfiMaterialEnum.Stone, "stoneBoneHoe");
        	sandstoneBoneHoe = new InfiToolHoe(PropsHelperInfiTools.boneHoeID+2, 
                    InfiMaterialEnum.Bone, InfiMaterialEnum.Sandstone, "sandstoneBoneHoe");
        	boneBoneHoe = new InfiToolHoe(PropsHelperInfiTools.boneHoeID+3, 
                    InfiMaterialEnum.Bone, InfiMaterialEnum.Bone, "boneBoneHoe");
        	paperBoneHoe = new InfiToolHoe(PropsHelperInfiTools.boneHoeID+4, 
                    InfiMaterialEnum.Bone, InfiMaterialEnum.Paper, "paperBoneHoe");
        	netherrackBoneHoe = new InfiToolHoe(PropsHelperInfiTools.boneHoeID+5, 
                    InfiMaterialEnum.Bone, InfiMaterialEnum.Netherrack, "netherrackBoneHoe");
        	iceBoneHoe = new InfiToolHoe(PropsHelperInfiTools.boneHoeID+6, 
                    InfiMaterialEnum.Bone, InfiMaterialEnum.Ice, "iceBoneHoe");
        	cactusBoneHoe = new InfiToolHoe(PropsHelperInfiTools.boneHoeID+7,
                    InfiMaterialEnum.Bone, InfiMaterialEnum.Cactus, "cactusBoneHoe");
        	flintBoneHoe = new InfiToolHoe(PropsHelperInfiTools.boneHoeID+8,
                    InfiMaterialEnum.Bone, InfiMaterialEnum.Flint, "flintBoneHoe");
            
            
            
            
            
            
            
            
            
            
        }
        
        if(PropsHelperInfiTools.enablePaperTools)
        {
        	woodPaperHoe = new InfiToolHoe(PropsHelperInfiTools.paperHoeID+0, 
                    InfiMaterialEnum.Paper, InfiMaterialEnum.Paper, "woodPaperHoe");
        	bonePaperHoe = new InfiToolHoe(PropsHelperInfiTools.paperHoeID+1, 
                    InfiMaterialEnum.Paper, InfiMaterialEnum.Paper, "bonePaperHoe");
        	paperPaperHoe = new InfiToolHoe(PropsHelperInfiTools.paperHoeID+2, 
                    InfiMaterialEnum.Paper, InfiMaterialEnum.Paper, "paperPaperHoe");
        	slimePaperHoe = new InfiToolHoe(PropsHelperInfiTools.paperHoeID+3,
                    InfiMaterialEnum.Paper, InfiMaterialEnum.Cactus, "slimePaperHoe");
        	cactusPaperHoe = new InfiToolHoe(PropsHelperInfiTools.paperHoeID+4,
                    InfiMaterialEnum.Paper, InfiMaterialEnum.Cactus, "cactusPaperHoe");
            
            
            
            
            
            
        }
        
        if(PropsHelperInfiTools.enableMossyTools)
        {
        	woodMossyHoe = new InfiToolHoe(PropsHelperInfiTools.mossyHoeID+0, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Wood, "woodMossyHoe");
        	stoneMossyHoe = new InfiToolHoe(PropsHelperInfiTools.mossyHoeID+1, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Stone, "stoneMossyHoe");
        	diamondMossyHoe = new InfiToolHoe(PropsHelperInfiTools.mossyHoeID+2, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Diamond, "diamondMossyHoe");
        	redstoneMossyHoe = new InfiToolHoe(PropsHelperInfiTools.mossyHoeID+3, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Redstone, "redstoneMossyHoe");
        	boneMossyHoe = new InfiToolHoe(PropsHelperInfiTools.mossyHoeID+4, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Bone, "boneMossyHoe");
        	mossyMossyHoe = new InfiToolHoe(PropsHelperInfiTools.mossyHoeID+5, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Mossy, "mossyMossyHoe");
        	netherrackMossyHoe = new InfiToolHoe(PropsHelperInfiTools.mossyHoeID+6, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Netherrack, "netherrackMossyHoe");
        	glowstoneMossyHoe = new InfiToolHoe(PropsHelperInfiTools.mossyHoeID+7, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Glowstone, "glowstoneMossyHoe");
        	cactusMossyHoe = new InfiToolHoe(PropsHelperInfiTools.mossyHoeID+8, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Cactus, "cactusMossyHoe");
        	blazeMossyHoe = new InfiToolHoe(PropsHelperInfiTools.mossyHoeID+9, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Blaze, "blazeMossyHoe");
        	manyullynMossyHoe = new InfiToolHoe(PropsHelperInfiTools.mossyHoeID+10, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Manyullyn, "manyullynMossyHoe");
        	uraniumMossyHoe = new InfiToolHoe(PropsHelperInfiTools.mossyHoeID+11, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Uranium, "uraniumMossyHoe");
            
            
            
            
            
            
            
            
            
            
            
            
            
        }
        
        if(PropsHelperInfiTools.enableNetherrackTools)
        {
        	woodNetherrackHoe = new InfiToolHoe(PropsHelperInfiTools.netherrackHoeID+0, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Wood, "woodNetherrackHoe");
        	stoneNetherrackHoe = new InfiToolHoe(PropsHelperInfiTools.netherrackHoeID+1, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Stone, "stoneNetherrackHoe");
        	sandstoneNetherrackHoe = new InfiToolHoe(PropsHelperInfiTools.netherrackHoeID+2, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Sandstone, "sandstoneNetherrackHoe");
        	boneNetherrackHoe = new InfiToolHoe(PropsHelperInfiTools.netherrackHoeID+3, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Bone, "boneNetherrackHoe");
        	paperNetherrackHoe = new InfiToolHoe(PropsHelperInfiTools.netherrackHoeID+4, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Paper, "paperNetherrackHoe");
        	mossyNetherrackHoe = new InfiToolHoe(PropsHelperInfiTools.netherrackHoeID+5, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Mossy, "mossyNetherrackHoe");
        	netherrackNetherrackHoe = new InfiToolHoe(PropsHelperInfiTools.netherrackHoeID+6, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Netherrack, "netherrackNetherrackHoe");
        	iceNetherrackHoe = new InfiToolHoe(PropsHelperInfiTools.netherrackHoeID+7, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Ice, "iceNetherrackHoe");
        	slimeNetherrackHoe = new InfiToolHoe(PropsHelperInfiTools.netherrackHoeID+8, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Slime, "slimeNetherrackHoe");
        	cactusNetherrackHoe = new InfiToolHoe(PropsHelperInfiTools.netherrackHoeID+9, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Cactus, "cactusNetherrackHoe");
        	flintNetherrackHoe = new InfiToolHoe(PropsHelperInfiTools.netherrackHoeID+10, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Flint, "flintNetherrackHoe");
        	copperNetherrackHoe = new InfiToolHoe(PropsHelperInfiTools.netherrackHoeID+11, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Copper, "copperNetherrackHoe");
        	bronzeNetherrackHoe = new InfiToolHoe(PropsHelperInfiTools.netherrackHoeID+12, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Bronze, "bronzeNetherrackHoe");
            
            
            
            
            
            
            
            
            
            
            
            
            
            
        }
        
        if(PropsHelperInfiTools.enableGlowstoneTools)
        {
        	woodGlowstoneHoe = new InfiToolHoe(PropsHelperInfiTools.glowstoneHoeID+0, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Wood, "woodGlowstoneHoe");
        	redstoneGlowstoneHoe = new InfiToolHoe(PropsHelperInfiTools.glowstoneHoeID+1, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Redstone, "redstoneGlowstoneHoe");
        	obsidianGlowstoneHoe = new InfiToolHoe(PropsHelperInfiTools.glowstoneHoeID+2, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Obsidian, "obsidianGlowstoneHoe");
        	boneGlowstoneHoe = new InfiToolHoe(PropsHelperInfiTools.glowstoneHoeID+3, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Bone, "boneGlowstoneHoe");
        	netherrackGlowstoneHoe = new InfiToolHoe(PropsHelperInfiTools.glowstoneHoeID+4, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Netherrack, "netherrackGlowstoneHoe");
        	glowstoneGlowstoneHoe = new InfiToolHoe(PropsHelperInfiTools.glowstoneHoeID+5, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Glowstone, "glowstoneGlowstoneHoe");
        	iceGlowstoneHoe = new InfiToolHoe(PropsHelperInfiTools.glowstoneHoeID+6, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Ice, "iceGlowstoneHoe");
        	slimeGlowstoneHoe = new InfiToolHoe(PropsHelperInfiTools.glowstoneHoeID+7, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Slime, "slimeGlowstoneHoe");
        	cactusGlowstoneHoe = new InfiToolHoe(PropsHelperInfiTools.glowstoneHoeID+8, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Cactus, "cactusGlowstoneHoe");
            
            
            
            
            
            
            
            
            
            
            
        }
        
        if(PropsHelperInfiTools.enableIceTools)
        {
        	woodIceHoe = new InfiToolHoe(PropsHelperInfiTools.iceHoeID+0, 
                    InfiMaterialEnum.Ice, InfiMaterialEnum.Wood, "woodIceHoe");
        	boneIceHoe = new InfiToolHoe(PropsHelperInfiTools.iceHoeID+1, 
                    InfiMaterialEnum.Ice, InfiMaterialEnum.Bone, "boneIceHoe");
        	paperIceHoe = new InfiToolHoe(PropsHelperInfiTools.iceHoeID+2, 
                    InfiMaterialEnum.Ice, InfiMaterialEnum.Paper, "paperIceHoe");
        	iceIceHoe = new InfiToolHoe(PropsHelperInfiTools.iceHoeID+3, 
                    InfiMaterialEnum.Ice, InfiMaterialEnum.Ice, "iceIceHoe");
        	slimeIceHoe = new InfiToolHoe(PropsHelperInfiTools.iceHoeID+4, 
                    InfiMaterialEnum.Ice, InfiMaterialEnum.Slime, "slimeIceHoe");
        	cactusIceHoe = new InfiToolHoe(PropsHelperInfiTools.iceHoeID+5, 
                    InfiMaterialEnum.Ice, InfiMaterialEnum.Cactus, "cactusIceHoe");
            
            
            
            
            
            
            
            
        }
        
        if(PropsHelperInfiTools.enableLavaTools)
        {
        	diamondLavaHoe = new InfiToolHoe(PropsHelperInfiTools.lavaHoeID+0, 
                    InfiMaterialEnum.Lava, InfiMaterialEnum.Diamond, "diamondLavaHoe");
        	obsidianLavaHoe = new InfiToolHoe(PropsHelperInfiTools.lavaHoeID+1, 
                    InfiMaterialEnum.Lava, InfiMaterialEnum.Obsidian, "obsidianLavaHoe");
        	netherrackLavaHoe = new InfiToolHoe(PropsHelperInfiTools.lavaHoeID+2, 
                    InfiMaterialEnum.Lava, InfiMaterialEnum.Netherrack, "netherrackLavaHoe");
        	lavaLavaHoe = new InfiToolHoe(PropsHelperInfiTools.lavaHoeID+3, 
                    InfiMaterialEnum.Lava, InfiMaterialEnum.Lava, "lavaLavaHoe");
        	flintLavaHoe = new InfiToolHoe(PropsHelperInfiTools.lavaHoeID+4, 
                    InfiMaterialEnum.Lava, InfiMaterialEnum.Flint, "flintLavaHoe");
        	blazeLavaHoe = new InfiToolHoe(PropsHelperInfiTools.lavaHoeID+5, 
                    InfiMaterialEnum.Lava, InfiMaterialEnum.Blaze, "blazeLavaHoe");
        	manyullynLavaHoe = new InfiToolHoe(PropsHelperInfiTools.lavaHoeID+6, 
                    InfiMaterialEnum.Lava, InfiMaterialEnum.Manyullyn, "manyullynLavaHoe");
            uraniumLavaHoe = new InfiToolHoe(PropsHelperInfiTools.lavaHoeID+7, 
                    InfiMaterialEnum.Lava, InfiMaterialEnum.Uranium, "uraniumLavaHoe");
            
            
            
            
            
            
            
            
            
        }
        
        if(PropsHelperInfiTools.enableSlimeTools)
        {
        	woodSlimeHoe = new InfiToolHoe(PropsHelperInfiTools.slimeHoeID+0, 
                    InfiMaterialEnum.Slime, InfiMaterialEnum.Wood, "woodSlimeHoe");
        	sandstoneSlimeHoe = new InfiToolHoe(PropsHelperInfiTools.slimeHoeID+1, 
                    InfiMaterialEnum.Slime, InfiMaterialEnum.Sandstone, "sandstoneSlimeHoe");
        	boneSlimeHoe = new InfiToolHoe(PropsHelperInfiTools.slimeHoeID+2, 
                    InfiMaterialEnum.Slime, InfiMaterialEnum.Bone, "boneSlimeHoe");
        	paperSlimeHoe = new InfiToolHoe(PropsHelperInfiTools.slimeHoeID+3, 
                    InfiMaterialEnum.Slime, InfiMaterialEnum.Paper, "paperSlimeHoe");
        	slimeSlimeHoe = new InfiToolHoe(PropsHelperInfiTools.slimeHoeID+4, 
                    InfiMaterialEnum.Slime, InfiMaterialEnum.Slime, "slimeSlimeHoe");
        	cactusSlimeHoe = new InfiToolHoe(PropsHelperInfiTools.slimeHoeID+5, 
                    InfiMaterialEnum.Slime, InfiMaterialEnum.Cactus, "cactusSlimeHoe");
            
            
            
            
            
            
            
        }
        
        if(PropsHelperInfiTools.enableCactusTools)
        {
        	woodCactusHoe = new InfiToolHoe(PropsHelperInfiTools.cactusHoeID+0, 
                    InfiMaterialEnum.Cactus, InfiMaterialEnum.Wood, "woodCactusHoe");
        	sandstoneCactusHoe = new InfiToolHoe(PropsHelperInfiTools.cactusHoeID+1, 
                    InfiMaterialEnum.Cactus, InfiMaterialEnum.Sandstone, "sandstoneCactusHoe");
        	boneCactusHoe = new InfiToolHoe(PropsHelperInfiTools.cactusHoeID+2, 
                    InfiMaterialEnum.Cactus, InfiMaterialEnum.Bone, "boneCactusHoe");
        	netherrackCactusHoe = new InfiToolHoe(PropsHelperInfiTools.cactusHoeID+3, 
                    InfiMaterialEnum.Cactus, InfiMaterialEnum.Netherrack, "netherrackCactusHoe");
        	iceCactusHoe = new InfiToolHoe(PropsHelperInfiTools.cactusHoeID+4, 
                    InfiMaterialEnum.Cactus, InfiMaterialEnum.Ice, "iceCactusHoe");
        	slimeCactusHoe = new InfiToolHoe(PropsHelperInfiTools.cactusHoeID+5, 
                    InfiMaterialEnum.Cactus, InfiMaterialEnum.Slime, "slimeCactusHoe");
        	cactusCactusHoe = new InfiToolHoe(PropsHelperInfiTools.cactusHoeID+6, 
                    InfiMaterialEnum.Cactus, InfiMaterialEnum.Cactus, "cactusCactusHoe");
            
            
            
            
            
            
            
            
        }
        
        if(PropsHelperInfiTools.enableFlintTools)
        {
        	woodFlintHoe = new InfiToolHoe(PropsHelperInfiTools.flintHoeID+0, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Wood, "woodFlintHoe");
        	stoneFlintHoe = new InfiToolHoe(PropsHelperInfiTools.flintHoeID+1, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Stone, "stoneFlintHoe");
        	sandstoneFlintHoe = new InfiToolHoe(PropsHelperInfiTools.flintHoeID+2, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Sandstone, "sandstoneFlintHoe");
        	boneFlintHoe = new InfiToolHoe(PropsHelperInfiTools.flintHoeID+3, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Bone, "boneFlintHoe");
        	netherrackFlintHoe = new InfiToolHoe(PropsHelperInfiTools.flintHoeID+4, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Flint, "netherrackFlintHoe");
        	slimeFlintHoe = new InfiToolHoe(PropsHelperInfiTools.flintHoeID+5, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Slime, "slimeFlintHoe");
        	cactusFlintHoe = new InfiToolHoe(PropsHelperInfiTools.flintHoeID+6, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Cactus, "cactusFlintHoe");
        	flintFlintHoe = new InfiToolHoe(PropsHelperInfiTools.flintHoeID+7, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Flint, "flintFlintHoe");
        	copperFlintHoe = new InfiToolHoe(PropsHelperInfiTools.flintHoeID+8, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Copper, "copperFlintHoe");
        	bronzeFlintHoe = new InfiToolHoe(PropsHelperInfiTools.flintHoeID+9, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Bronze, "bronzeFlintHoe");
            
            
            
            
            
            
            
            
            
            
            
        }
        
        if(PropsHelperInfiTools.enableBlazeTools)
        {
        	diamondBlazeHoe = new InfiToolHoe(PropsHelperInfiTools.blazeHoeID+0, 
                    InfiMaterialEnum.Blaze, InfiMaterialEnum.Diamond, "diamondBlazeHoe");
        	obsidianBlazeHoe = new InfiToolHoe(PropsHelperInfiTools.blazeHoeID+1, 
                    InfiMaterialEnum.Blaze, InfiMaterialEnum.Obsidian, "obsidianBlazeHoe");
        	netherrackBlazeHoe = new InfiToolHoe(PropsHelperInfiTools.blazeHoeID+2, 
                    InfiMaterialEnum.Blaze, InfiMaterialEnum.Netherrack, "netherrackBlazeHoe");
        	lavaBlazeHoe = new InfiToolHoe(PropsHelperInfiTools.blazeHoeID+3, 
                    InfiMaterialEnum.Blaze, InfiMaterialEnum.Lava, "lavaBlazeHoe");
        	flintBlazeHoe = new InfiToolHoe(PropsHelperInfiTools.blazeHoeID+4, 
                    InfiMaterialEnum.Blaze, InfiMaterialEnum.Flint, "flintBlazeHoe");
        	blazeBlazeHoe = new InfiToolHoe(PropsHelperInfiTools.blazeHoeID+5, 
                    InfiMaterialEnum.Blaze, InfiMaterialEnum.Blaze, "blazeBlazeHoe");
        	manyullynBlazeHoe = new InfiToolHoe(PropsHelperInfiTools.blazeHoeID+6, 
                    InfiMaterialEnum.Blaze, InfiMaterialEnum.Manyullyn, "manyullynBlazeHoe");
            uraniumBlazeHoe = new InfiToolHoe(PropsHelperInfiTools.blazeHoeID+7, 
                    InfiMaterialEnum.Blaze, InfiMaterialEnum.Uranium, "uraniumBlazeHoe");
            
            
            
            
            
            
            
            
            
        }
    	
        if(PropsHelperInfiTools.enableCopperTools)
        {
        	woodCopperHoe = new InfiToolHoe(PropsHelperInfiTools.copperHoeID+0, 
                    InfiMaterialEnum.Copper, InfiMaterialEnum.Wood, "woodCopperHoe");
            stoneCopperHoe = new InfiToolHoe(PropsHelperInfiTools.copperHoeID+1, 
                    InfiMaterialEnum.Copper, InfiMaterialEnum.Stone, "stoneCopperHoe");
            boneCopperHoe = new InfiToolHoe(PropsHelperInfiTools.copperHoeID+2, 
                    InfiMaterialEnum.Copper, InfiMaterialEnum.Bone, "boneCopperHoe");
            netherrackCopperHoe = new InfiToolHoe(PropsHelperInfiTools.copperHoeID+3, 
                    InfiMaterialEnum.Copper, InfiMaterialEnum.Netherrack, "netherrackCopperHoe");
            slimeCopperHoe = new InfiToolHoe(PropsHelperInfiTools.copperHoeID+4, 
                    InfiMaterialEnum.Copper, InfiMaterialEnum.Slime, "slimeCopperHoe");
            cactusCopperHoe = new InfiToolHoe(PropsHelperInfiTools.copperHoeID+5, 
                    InfiMaterialEnum.Copper, InfiMaterialEnum.Cactus, "cactusCopperHoe");
            flintCopperHoe = new InfiToolHoe(PropsHelperInfiTools.copperHoeID+6, 
                    InfiMaterialEnum.Copper, InfiMaterialEnum.Flint, "flintCopperHoe");
            copperCopperHoe = new InfiToolHoe(PropsHelperInfiTools.copperHoeID+7, 
                    InfiMaterialEnum.Copper, InfiMaterialEnum.Copper, "copperCopperHoe");
            
            
        	
            
            
            
            
            
            
        }
        
        if(PropsHelperInfiTools.enableBronzeTools)
        {
        	woodBronzeHoe = new InfiToolHoe(PropsHelperInfiTools.bronzeHoeID+0, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Wood, "woodBronzeHoe");
            stoneBronzeHoe = new InfiToolHoe(PropsHelperInfiTools.bronzeHoeID+1, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Stone, "stoneBronzeHoe");
            boneBronzeHoe = new InfiToolHoe(PropsHelperInfiTools.bronzeHoeID+2, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Bone, "boneBronzeHoe");
            netherrackBronzeHoe = new InfiToolHoe(PropsHelperInfiTools.bronzeHoeID+3, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Netherrack, "netherrackBronzeHoe");
            slimeBronzeHoe = new InfiToolHoe(PropsHelperInfiTools.bronzeHoeID+4, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Slime, "slimeBronzeHoe");
            cactusBronzeHoe = new InfiToolHoe(PropsHelperInfiTools.bronzeHoeID+5, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Cactus, "cactusBronzeHoe");
            flintBronzeHoe = new InfiToolHoe(PropsHelperInfiTools.bronzeHoeID+6, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Flint, "flintBronzeHoe");
            copperBronzeHoe = new InfiToolHoe(PropsHelperInfiTools.bronzeHoeID+7, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Copper, "copperBronzeHoe");
            bronzeBronzeHoe = new InfiToolHoe(PropsHelperInfiTools.bronzeHoeID+8, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Bronze, "copperBronzeHoe");
            
            
            
            
            
            
            
            
            
            
        }
        
        if(PropsHelperInfiTools.enableWorkedIronTools)
        {
        	woodWorkedIronHoe = new InfiToolHoe(PropsHelperInfiTools.workedIronHoeID+0, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Wood, "woodWorkedIronHoe");
            stoneWorkedIronHoe = new InfiToolHoe(PropsHelperInfiTools.workedIronHoeID+1, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Stone, "stoneWorkedIronHoe");
            ironWorkedIronHoe = new InfiToolHoe(PropsHelperInfiTools.workedIronHoeID+2,
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Iron, "ironWorkedIronHoe");
            diamondWorkedIronHoe = new InfiToolHoe(PropsHelperInfiTools.workedIronHoeID+3, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Diamond, "diamondWorkedIronHoe");
            redstoneWorkedIronHoe = new InfiToolHoe(PropsHelperInfiTools.workedIronHoeID+4, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Redstone, "redstoneWorkedIronHoe");
            obsidianWorkedIronHoe = new InfiToolHoe(PropsHelperInfiTools.workedIronHoeID+5, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Obsidian, "obsidianWorkedIronHoe");
            boneWorkedIronHoe = new InfiToolHoe(PropsHelperInfiTools.workedIronHoeID+6, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Bone, "boneWorkedIronHoe");
            netherrackWorkedIronHoe = new InfiToolHoe(PropsHelperInfiTools.workedIronHoeID+7, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Netherrack, "netherrackWorkedIronHoe");
            glowstoneWorkedIronHoe = new InfiToolHoe(PropsHelperInfiTools.workedIronHoeID+8, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Glowstone, "glowstoneWorkedIronHoe");
            iceWorkedIronHoe = new InfiToolHoe(PropsHelperInfiTools.workedIronHoeID+9, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Ice, "iceWorkedIronHoe");
            slimeWorkedIronHoe = new InfiToolHoe(PropsHelperInfiTools.workedIronHoeID+10, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Slime, "slimeWorkedIronHoe");
            cactusWorkedIronHoe = new InfiToolHoe(PropsHelperInfiTools.workedIronHoeID+11, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Cactus, "cactusWorkedIronHoe");
            blazeWorkedIronHoe = new InfiToolHoe(PropsHelperInfiTools.workedIronHoeID+12, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Blaze, "blazeWorkedIronHoe");
            copperWorkedIronHoe = new InfiToolHoe(PropsHelperInfiTools.workedIronHoeID+13, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Copper, "copperWorkedIronHoe");
            bronzeWorkedIronHoe = new InfiToolHoe(PropsHelperInfiTools.workedIronHoeID+14, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Bronze, "bronzeWorkedIronHoe");
            workedWorkedIronHoe = new InfiToolHoe(PropsHelperInfiTools.workedIronHoeID+15, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.WorkedIron, "workedWorkedIronHoe");
            steelWorkedIronHoe = new InfiToolHoe(PropsHelperInfiTools.workedIronHoeID+16, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Steel, "steelWorkedIronHoe");
            uraniumWorkedIronHoe = new InfiToolHoe(PropsHelperInfiTools.workedIronHoeID+17, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Bronze, "uraniumWorkedIronHoe");
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
        }
        
        if(PropsHelperInfiTools.enableSteelTools)
        {
        	woodSteelHoe = new InfiToolHoe(PropsHelperInfiTools.steelHoeID+0, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Wood, "woodSteelHoe");
            stoneSteelHoe = new InfiToolHoe(PropsHelperInfiTools.steelHoeID+1, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Stone, "stoneSteelHoe");
            ironSteelHoe = new InfiToolHoe(PropsHelperInfiTools.steelHoeID+2, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Iron, "ironSteelHoe");
            diamondSteelHoe = new InfiToolHoe(PropsHelperInfiTools.steelHoeID+3, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Diamond, "diamondSteelHoe");
            redstoneSteelHoe = new InfiToolHoe(PropsHelperInfiTools.steelHoeID+4, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Redstone, "redstoneSteelHoe");
            obsidianSteelHoe = new InfiToolHoe(PropsHelperInfiTools.steelHoeID+5, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Obsidian, "obsidianSteelHoe");
            boneSteelHoe = new InfiToolHoe(PropsHelperInfiTools.steelHoeID+6, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Bone, "boneSteelHoe");
            netherrackSteelHoe = new InfiToolHoe(PropsHelperInfiTools.steelHoeID+7, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Netherrack, "netherrackSteelHoe");
            glowstoneSteelHoe = new InfiToolHoe(PropsHelperInfiTools.steelHoeID+8, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Glowstone, "glowstoneSteelHoe");
            iceSteelHoe = new InfiToolHoe(PropsHelperInfiTools.steelHoeID+9, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Ice, "iceSteelHoe");
            slimeSteelHoe = new InfiToolHoe(PropsHelperInfiTools.steelHoeID+10, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Slime, "slimeSteelHoe");
            cactusSteelHoe = new InfiToolHoe(PropsHelperInfiTools.steelHoeID+11, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Cactus, "cactusSteelHoe");
            blazeSteelHoe = new InfiToolHoe(PropsHelperInfiTools.steelHoeID+12, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Blaze, "blazeSteelHoe");
            copperSteelHoe = new InfiToolHoe(PropsHelperInfiTools.steelHoeID+13, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Copper, "copperSteelHoe");
            bronzeSteelHoe = new InfiToolHoe(PropsHelperInfiTools.steelHoeID+14, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Bronze, "bronzeSteelHoe");
            workedSteelHoe = new InfiToolHoe(PropsHelperInfiTools.steelHoeID+15, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.WorkedIron, "workedSteelHoe");
            steelSteelHoe = new InfiToolHoe(PropsHelperInfiTools.steelHoeID+16, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Steel, "steelSteelHoe");
            cobaltSteelHoe = new InfiToolHoe(PropsHelperInfiTools.steelHoeID+17, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Cobalt, "cobaltSteelHoe");
            arditeSteelHoe = new InfiToolHoe(PropsHelperInfiTools.steelHoeID+18, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Ardite, "arditeSteelHoe");
            uraniumSteelHoe = new InfiToolHoe(PropsHelperInfiTools.steelHoeID+19, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Bronze, "uraniumSteelHoe");

            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
        }
        
        if(PropsHelperInfiTools.enableCobaltTools)
        {
        	woodCobaltHoe = new InfiToolHoe(PropsHelperInfiTools.cobaltHoeID+0, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Wood, "woodCobaltHoe");
            stoneCobaltHoe = new InfiToolHoe(PropsHelperInfiTools.cobaltHoeID+1, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Stone, "stoneCobaltHoe");
            ironCobaltHoe = new InfiToolHoe(PropsHelperInfiTools.cobaltHoeID+2, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Iron, "ironCobaltHoe");
            diamondCobaltHoe = new InfiToolHoe(PropsHelperInfiTools.cobaltHoeID+3,
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Diamond, "diamondCobaltHoe");
            redstoneCobaltHoe = new InfiToolHoe(PropsHelperInfiTools.cobaltHoeID+4, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Redstone, "redstoneCobaltHoe");
            obsidianCobaltHoe = new InfiToolHoe(PropsHelperInfiTools.cobaltHoeID+5, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Obsidian, "obsidianCobaltHoe");
            boneCobaltHoe = new InfiToolHoe(PropsHelperInfiTools.cobaltHoeID+6, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Bone, "boneCobaltHoe");
            slimeCobaltHoe = new InfiToolHoe(PropsHelperInfiTools.cobaltHoeID+7, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Slime, "slimeCobaltHoe");
            cactusCobaltHoe = new InfiToolHoe(PropsHelperInfiTools.cobaltHoeID+8, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Cactus, "cactusCobaltHoe");
            blazeCobaltHoe = new InfiToolHoe(PropsHelperInfiTools.cobaltHoeID+9, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Blaze, "blazeCobaltHoe");
            copperCobaltHoe = new InfiToolHoe(PropsHelperInfiTools.cobaltHoeID+10, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Copper, "copperCobaltHoe");
            bronzeCobaltHoe = new InfiToolHoe(PropsHelperInfiTools.cobaltHoeID+11, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Bronze, "bronzeCobaltHoe");
            workedCobaltHoe = new InfiToolHoe(PropsHelperInfiTools.cobaltHoeID+12, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.WorkedIron, "workedCobaltHoe");
            steelCobaltHoe = new InfiToolHoe(PropsHelperInfiTools.cobaltHoeID+13, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Steel, "steelCobaltHoe");
            cobaltCobaltHoe = new InfiToolHoe(PropsHelperInfiTools.cobaltHoeID+14, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Cobalt, "cobaltCobaltHoe");
            arditeCobaltHoe = new InfiToolHoe(PropsHelperInfiTools.cobaltHoeID+15, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Ardite, "arditeCobaltHoe");
            manyullynCobaltHoe = new InfiToolHoe(PropsHelperInfiTools.cobaltHoeID+16, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Manyullyn, "arditeCobaltHoe");
            uraniumCobaltHoe = new InfiToolHoe(PropsHelperInfiTools.cobaltHoeID+17, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Bronze, "uraniumCobaltHoe");
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
        }
        
        if(PropsHelperInfiTools.enableArditeTools)
        {
        	woodArditeHoe = new InfiToolHoe(PropsHelperInfiTools.arditeHoeID+0, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Wood, "woodArditeHoe");
            stoneArditeHoe = new InfiToolHoe(PropsHelperInfiTools.arditeHoeID+1, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Stone, "stoneArditeHoe");
            ironArditeHoe = new InfiToolHoe(PropsHelperInfiTools.arditeHoeID+2, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Iron, "ironArditeHoe");
            diamondArditeHoe = new InfiToolHoe(PropsHelperInfiTools.arditeHoeID+3,
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Diamond, "diamondArditeHoe");
            redstoneArditeHoe = new InfiToolHoe(PropsHelperInfiTools.arditeHoeID+4, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Redstone, "redstoneArditeHoe");
            obsidianArditeHoe = new InfiToolHoe(PropsHelperInfiTools.arditeHoeID+5, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Obsidian, "obsidianArditeHoe");
            boneArditeHoe = new InfiToolHoe(PropsHelperInfiTools.arditeHoeID+6,
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Bone, "boneArditeHoe");
            slimeArditeHoe = new InfiToolHoe(PropsHelperInfiTools.arditeHoeID+7, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Slime, "slimeArditeHoe");
            cactusArditeHoe = new InfiToolHoe(PropsHelperInfiTools.arditeHoeID+8, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Cactus, "cactusArditeHoe");
            blazeArditeHoe = new InfiToolHoe(PropsHelperInfiTools.arditeHoeID+9, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Blaze, "blazeArditeHoe");
            copperArditeHoe = new InfiToolHoe(PropsHelperInfiTools.arditeHoeID+10, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Copper, "copperArditeHoe");
            bronzeArditeHoe = new InfiToolHoe(PropsHelperInfiTools.arditeHoeID+11, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Bronze, "bronzeArditeHoe");
            workedArditeHoe = new InfiToolHoe(PropsHelperInfiTools.arditeHoeID+12, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.WorkedIron, "workedArditeHoe");
            steelArditeHoe = new InfiToolHoe(PropsHelperInfiTools.arditeHoeID+13, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Steel, "steelArditeHoe");
            cobaltArditeHoe = new InfiToolHoe(PropsHelperInfiTools.arditeHoeID+14, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Cobalt, "cobaltArditeHoe");
            arditeArditeHoe = new InfiToolHoe(PropsHelperInfiTools.arditeHoeID+15, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Ardite, "arditeArditeHoe");
            manyullynArditeHoe = new InfiToolHoe(PropsHelperInfiTools.arditeHoeID+16, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Manyullyn, "arditeArditeHoe");
            uraniumArditeHoe = new InfiToolHoe(PropsHelperInfiTools.arditeHoeID+17, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Bronze, "uraniumArditeHoe");
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
        }
        
        if(PropsHelperInfiTools.enableManyullynTools)
        {
        	woodManyullynHoe = new InfiToolHoe(PropsHelperInfiTools.manyullynHoeID+0, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Stone, "woodManyullynHoe");
            stoneManyullynHoe = new InfiToolHoe(PropsHelperInfiTools.manyullynHoeID+1, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Stone, "stoneManyullynHoe");
            ironManyullynHoe = new InfiToolHoe(PropsHelperInfiTools.manyullynHoeID+2, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Iron, "ironManyullynHoe");
            diamondManyullynHoe = new InfiToolHoe(PropsHelperInfiTools.manyullynHoeID+3,
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Diamond, "diamondManyullynHoe");
            redstoneManyullynHoe = new InfiToolHoe(PropsHelperInfiTools.manyullynHoeID+4, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Redstone, "redstoneManyullynHoe");
            obsidianManyullynHoe = new InfiToolHoe(PropsHelperInfiTools.manyullynHoeID+5, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Obsidian, "obsidianManyullynHoe");
            boneManyullynHoe = new InfiToolHoe(PropsHelperInfiTools.manyullynHoeID+6, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Bone, "boneManyullynHoe");
            slimeManyullynHoe = new InfiToolHoe(PropsHelperInfiTools.manyullynHoeID+7, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Slime, "slimeManyullynHoe");
            cactusManyullynHoe = new InfiToolHoe(PropsHelperInfiTools.manyullynHoeID+8, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Cactus, "cactusManyullynHoe");
            blazeManyullynHoe = new InfiToolHoe(PropsHelperInfiTools.manyullynHoeID+9, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Blaze, "blazeManyullynHoe");
            copperManyullynHoe = new InfiToolHoe(PropsHelperInfiTools.manyullynHoeID+10, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Copper, "copperManyullynHoe");
            bronzeManyullynHoe = new InfiToolHoe(PropsHelperInfiTools.manyullynHoeID+11, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Bronze, "bronzeManyullynHoe");
            workedManyullynHoe = new InfiToolHoe(PropsHelperInfiTools.manyullynHoeID+12, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.WorkedIron, "workedManyullynHoe");
            steelManyullynHoe = new InfiToolHoe(PropsHelperInfiTools.manyullynHoeID+13, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Steel, "steelManyullynHoe");
            cobaltManyullynHoe = new InfiToolHoe(PropsHelperInfiTools.manyullynHoeID+14, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Cobalt, "cobaltManyullynHoe");
            arditeManyullynHoe = new InfiToolHoe(PropsHelperInfiTools.manyullynHoeID+15, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Ardite, "arditeManyullynHoe");
            manyullynManyullynHoe = new InfiToolHoe(PropsHelperInfiTools.manyullynHoeID+16, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Manyullyn, "arditeManyullynHoe");
            uraniumManyullynHoe = new InfiToolHoe(PropsHelperInfiTools.manyullynHoeID+17,
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Bronze, "uraniumManyullynHoe");
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
        }
        
        if(PropsHelperInfiTools.enableUraniumTools)
        {
            diamondUraniumHoe = new InfiToolHoe(PropsHelperInfiTools.uraniumHoeID+0, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Diamond, "diamondUraniumHoe");
            redstoneUraniumHoe = new InfiToolHoe(PropsHelperInfiTools.uraniumHoeID+1, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Redstone, "redstoneUraniumHoe");
            boneUraniumHoe = new InfiToolHoe(PropsHelperInfiTools.uraniumHoeID+2, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Bone, "boneUraniumHoe");
            netherrackUraniumHoe = new InfiToolHoe(PropsHelperInfiTools.uraniumHoeID+3, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Netherrack, "netherrackUraniumHoe");
            glowstoneUraniumHoe = new InfiToolHoe(PropsHelperInfiTools.uraniumHoeID+4, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Glowstone, "glowstoneUraniumHoe");
            lavaUraniumHoe = new InfiToolHoe(PropsHelperInfiTools.uraniumHoeID+5, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Lava, "lavaUraniumHoe");
            blazeUraniumHoe = new InfiToolHoe(PropsHelperInfiTools.uraniumHoeID+6, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Blaze, "blazeUraniumHoe");
            cobaltUraniumHoe = new InfiToolHoe(PropsHelperInfiTools.uraniumHoeID+7, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Cobalt, "cobaltUraniumHoe");
            arditeUraniumHoe = new InfiToolHoe(PropsHelperInfiTools.uraniumHoeID+8, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Ardite, "arditeUraniumHoe");
            uraniumUraniumHoe = new InfiToolHoe(PropsHelperInfiTools.uraniumHoeID+9, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Uranium, "uraniumUraniumHoe");
            
            
            
            
            
            
            
            
            
            
            
        }
    }
    
    private static void addNames()
    {
    	ModLoader.addName(woodWoodHoe, "Wood Hoe");
    	ModLoader.addName(stoneStoneHoe, "Heavy Hoe");
    	ModLoader.addName(ironIronHoe, "Ironic Hoe");
    	ModLoader.addName(diamondDiamondHoe, "Diamondium Hoe");
    	ModLoader.addName(redstoneRedstoneHoe, "Redredred Hoe");
    	ModLoader.addName(obsidianObsidianHoe, "Ebony Hoe");
    	ModLoader.addName(sandstoneSandstoneHoe, "Fragile Hoe");
    	ModLoader.addName(boneBoneHoe, "Necrotic Hoe");
    	ModLoader.addName(paperPaperHoe, "Soft Hoe");
    	ModLoader.addName(mossyMossyHoe, "Living Hoe");
    	ModLoader.addName(netherrackNetherrackHoe, "Blood Pick");
    	ModLoader.addName(glowstoneGlowstoneHoe, "Bright Hoe");
    	ModLoader.addName(iceIceHoe, "Freezing Hoe");
    	ModLoader.addName(lavaLavaHoe, "Burning Hoe");
    	ModLoader.addName(slimeSlimeHoe, "Toy Hoe");
    	ModLoader.addName(cactusCactusHoe, "Thorned Hoe");
    	ModLoader.addName(flintFlintHoe, "Rough-hewn Hoe");
    	ModLoader.addName(blazeBlazeHoe, "Netherite Hoe");
        ModLoader.addName(copperCopperHoe, "Orange-Tang Hoe");
        ModLoader.addName(bronzeBronzeHoe, "Polished Hoe");
        ModLoader.addName(workedWorkedIronHoe, "Reworked Iron Hoe");
        ModLoader.addName(steelSteelHoe, "Forge-Wrought Hoe");
        ModLoader.addName(cobaltCobaltHoe, "Beautiful Hoe");
        ModLoader.addName(arditeArditeHoe, "Rustic StoneDigger");
        ModLoader.addName(manyullynManyullynHoe, "False-Prophetic Hoe");
        ModLoader.addName(uraniumUraniumHoe, "Cancerous Hoe");
    }
    
    public static void registerInfiToolsRecipes()
    {
    	if(PropsHelperInfiTools.enableWoodTools)
        {
            ModLoader.addRecipe(new ItemStack(woodWoodHoe), new Object[] 
                    { recipe, '#', Block.planks, '|', Item.stick });
            ModLoader.addRecipe(new ItemStack(sandstoneWoodHoe), new Object[] 
                    { recipe, '#', Block.planks, '|', mod_InfiBase.sandstoneRod });
            ModLoader.addRecipe(new ItemStack(boneWoodHoe), new Object[] 
                    { recipe, '#', Block.planks, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneWoodHoe), new Object[] 
                    { recipe, '#', Block.planks, '|', mod_InfiBase.boneRod });
            ModLoader.addRecipe(new ItemStack(paperWoodHoe), new Object[] 
                    { recipe, '#', Block.planks, '|', mod_InfiBase.paperRod });
            ModLoader.addRecipe(new ItemStack(iceWoodHoe), new Object[] 
                    { recipe, '#', Block.planks, '|', mod_InfiBase.iceRod });
            ModLoader.addRecipe(new ItemStack(slimeWoodHoe), new Object[] 
                    { recipe, '#', Block.planks, '|', mod_InfiBase.slimeRod });
            ModLoader.addRecipe(new ItemStack(cactusWoodHoe), new Object[] 
                    { recipe, '#', Block.planks, '|', mod_InfiBase.cactusRod });
        }
    	
        if(PropsHelperInfiTools.enableStoneTools)
        {
        	ModLoader.addRecipe(new ItemStack(woodStoneHoe), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', Item.stick });
        	ModLoader.addRecipe(new ItemStack(stoneStoneHoe), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', mod_InfiBase.stoneRod });
            ModLoader.addRecipe(new ItemStack(sandstoneStoneHoe), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', mod_InfiBase.sandstoneRod });
            ModLoader.addRecipe(new ItemStack(boneStoneHoe), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneStoneHoe), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', mod_InfiBase.boneRod });
            ModLoader.addRecipe(new ItemStack(netherrackStoneHoe), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', mod_InfiBase.netherrackRod });
            ModLoader.addRecipe(new ItemStack(iceStoneHoe), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', mod_InfiBase.iceRod });
            ModLoader.addRecipe(new ItemStack(slimeStoneHoe), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', mod_InfiBase.slimeRod });
            ModLoader.addRecipe(new ItemStack(cactusStoneHoe), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', mod_InfiBase.cactusRod });
            ModLoader.addRecipe(new ItemStack(flintStoneHoe), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', mod_InfiBase.flintRod });
            
            ModLoader.addRecipe(new ItemStack(woodStoneHoe), new Object[] 
                    { recipe, '#', Block.stone, '|', Item.stick });
        	ModLoader.addRecipe(new ItemStack(stoneStoneHoe), new Object[] 
                    { recipe, '#', Block.stone, '|', mod_InfiBase.stoneRod });
            ModLoader.addRecipe(new ItemStack(sandstoneStoneHoe), new Object[] 
                    { recipe, '#', Block.stone, '|', mod_InfiBase.sandstoneRod });
            ModLoader.addRecipe(new ItemStack(boneStoneHoe), new Object[] 
                    { recipe, '#', Block.stone, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneStoneHoe), new Object[] 
                    { recipe, '#', Block.stone, '|', mod_InfiBase.boneRod });
            ModLoader.addRecipe(new ItemStack(netherrackStoneHoe), new Object[] 
                    { recipe, '#', Block.stone, '|', mod_InfiBase.netherrackRod });
            ModLoader.addRecipe(new ItemStack(iceStoneHoe), new Object[] 
                    { recipe, '#', Block.stone, '|', mod_InfiBase.iceRod });
            ModLoader.addRecipe(new ItemStack(slimeStoneHoe), new Object[] 
                    { recipe, '#', Block.stone, '|', mod_InfiBase.slimeRod });
            ModLoader.addRecipe(new ItemStack(cactusStoneHoe), new Object[] 
                    { recipe, '#', Block.stone, '|', mod_InfiBase.cactusRod });
            ModLoader.addRecipe(new ItemStack(flintStoneHoe), new Object[] 
                    { recipe, '#', Block.stone, '|', mod_InfiBase.flintRod });
        }
        
        if(PropsHelperInfiTools.enableIronTools)
        {
        	ModLoader.addRecipe(new ItemStack(woodIronHoe), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', Item.stick });
        	ModLoader.addRecipe(new ItemStack(stoneIronHoe), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', mod_InfiBase.stoneRod });
            ModLoader.addRecipe(new ItemStack(ironIronHoe), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', mod_InfiBase.ironRod });
            ModLoader.addRecipe(new ItemStack(boneIronHoe), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneIronHoe), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', mod_InfiBase.boneRod });
            ModLoader.addRecipe(new ItemStack(netherrackIronHoe), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', mod_InfiBase.netherrackRod });
            ModLoader.addRecipe(new ItemStack(glowstoneIronHoe), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', mod_InfiBase.glowstoneRod });
            ModLoader.addRecipe(new ItemStack(cactusIronHoe), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', mod_InfiBase.cactusRod });
            ModLoader.addRecipe(new ItemStack(copperIronHoe), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', mod_InfiBase.copperRod });
            ModLoader.addRecipe(new ItemStack(bronzeIronHoe), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', mod_InfiBase.bronzeRod });
        }
        
        if(PropsHelperInfiTools.enableDiamondTools)
        {
        	ModLoader.addRecipe(new ItemStack(woodDiamondHoe), new Object[] 
                    { recipe, '#', Item.diamond, '|', Item.stick });
        	ModLoader.addRecipe(new ItemStack(stoneDiamondHoe), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.stoneRod });
            ModLoader.addRecipe(new ItemStack(ironDiamondHoe), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.ironRod });
            ModLoader.addRecipe(new ItemStack(diamondDiamondHoe), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.diamondRod });
            ModLoader.addRecipe(new ItemStack(redstoneDiamondHoe), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.redstoneRod });
            ModLoader.addRecipe(new ItemStack(obsidianDiamondHoe), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.obsidianRod });
            ModLoader.addRecipe(new ItemStack(boneDiamondHoe), new Object[] 
                    { recipe, '#', Item.diamond, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneDiamondHoe), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.boneRod });
            ModLoader.addRecipe(new ItemStack(mossyDiamondHoe), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.mossyRod });
            ModLoader.addRecipe(new ItemStack(netherrackDiamondHoe), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.netherrackRod });
            ModLoader.addRecipe(new ItemStack(glowstoneDiamondHoe), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.glowstoneRod });
            ModLoader.addRecipe(new ItemStack(lavaDiamondHoe), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.lavaRod });
            ModLoader.addRecipe(new ItemStack(cactusDiamondHoe), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.cactusRod });
            ModLoader.addRecipe(new ItemStack(flintDiamondHoe), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.flintRod });
            ModLoader.addRecipe(new ItemStack(blazeDiamondHoe), new Object[] 
                    { recipe, '#', Item.diamond, '|', Item.blazeRod });
            ModLoader.addRecipe(new ItemStack(copperDiamondHoe), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.copperRod });
            ModLoader.addRecipe(new ItemStack(bronzeDiamondHoe), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.bronzeRod });
            ModLoader.addRecipe(new ItemStack(workedDiamondHoe), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.workedIronRod });
            ModLoader.addRecipe(new ItemStack(steelDiamondHoe), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.steelRod });
            ModLoader.addRecipe(new ItemStack(cobaltDiamondHoe), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.cobaltRod });
            ModLoader.addRecipe(new ItemStack(arditeDiamondHoe), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.arditeRod });
            ModLoader.addRecipe(new ItemStack(manyullynDiamondHoe), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.manyullynRod });
            ModLoader.addRecipe(new ItemStack(uraniumDiamondHoe), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.uraniumRod });
        }
        
        if(PropsHelperInfiTools.enableRedstoneTools)
        {
        	ModLoader.addRecipe(new ItemStack(woodRedstoneHoe), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', Item.stick });
        	ModLoader.addRecipe(new ItemStack(stoneRedstoneHoe), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.stoneRod });
            ModLoader.addRecipe(new ItemStack(ironRedstoneHoe), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.ironRod });
            ModLoader.addRecipe(new ItemStack(redstoneRedstoneHoe), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.redstoneRod });
            ModLoader.addRecipe(new ItemStack(obsidianRedstoneHoe), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.obsidianRod });
            ModLoader.addRecipe(new ItemStack(sandstoneRedstoneHoe), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.sandstoneRod });
            ModLoader.addRecipe(new ItemStack(boneRedstoneHoe), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneRedstoneHoe), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.boneRod });
            ModLoader.addRecipe(new ItemStack(paperRedstoneHoe), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.paperRod });
            ModLoader.addRecipe(new ItemStack(mossyRedstoneHoe), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.mossyRod });
            ModLoader.addRecipe(new ItemStack(netherrackRedstoneHoe), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.netherrackRod });
            ModLoader.addRecipe(new ItemStack(glowstoneRedstoneHoe), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.glowstoneRod });
            ModLoader.addRecipe(new ItemStack(iceRedstoneHoe), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.iceRod });
            ModLoader.addRecipe(new ItemStack(lavaRedstoneHoe), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.lavaRod });
            ModLoader.addRecipe(new ItemStack(slimeRedstoneHoe), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.slimeRod });
            ModLoader.addRecipe(new ItemStack(cactusRedstoneHoe), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.cactusRod });
            ModLoader.addRecipe(new ItemStack(flintRedstoneHoe), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.flintRod });
            ModLoader.addRecipe(new ItemStack(copperRedstoneHoe), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.copperRod });
            ModLoader.addRecipe(new ItemStack(bronzeRedstoneHoe), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.bronzeRod });
            ModLoader.addRecipe(new ItemStack(workedRedstoneHoe), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.workedIronRod });
            ModLoader.addRecipe(new ItemStack(uraniumRedstoneHoe), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.uraniumRod });
        }
        
        if(PropsHelperInfiTools.enableObsidianTools)
        {
        	ModLoader.addRecipe(new ItemStack(woodObsidianHoe), new Object[] 
                    { recipe, '#', Block.obsidian, '|', Item.stick });
        	ModLoader.addRecipe(new ItemStack(stoneObsidianHoe), new Object[] 
                    { recipe, '#', Block.obsidian, '|', mod_InfiBase.stoneRod });
            ModLoader.addRecipe(new ItemStack(redstoneObsidianHoe), new Object[] 
                    { recipe, '#', Block.obsidian, '|', mod_InfiBase.redstoneRod });
            ModLoader.addRecipe(new ItemStack(obsidianObsidianHoe), new Object[] 
                    { recipe, '#', Block.obsidian, '|', mod_InfiBase.obsidianRod });
            ModLoader.addRecipe(new ItemStack(boneObsidianHoe), new Object[] 
                    { recipe, '#', Block.obsidian, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneObsidianHoe), new Object[] 
                    { recipe, '#', Block.obsidian, '|', mod_InfiBase.boneRod });
            ModLoader.addRecipe(new ItemStack(netherrackObsidianHoe), new Object[] 
                    { recipe, '#', Block.obsidian, '|', mod_InfiBase.netherrackRod });
            ModLoader.addRecipe(new ItemStack(glowstoneObsidianHoe), new Object[] 
                    { recipe, '#', Block.obsidian, '|', mod_InfiBase.glowstoneRod });
            ModLoader.addRecipe(new ItemStack(iceObsidianHoe), new Object[] 
                    { recipe, '#', Block.obsidian, '|', mod_InfiBase.iceRod });
            ModLoader.addRecipe(new ItemStack(lavaObsidianHoe), new Object[] 
                    { recipe, '#', Block.obsidian, '|', mod_InfiBase.lavaRod });
            ModLoader.addRecipe(new ItemStack(cactusObsidianHoe), new Object[] 
                    { recipe, '#', Block.obsidian, '|', mod_InfiBase.cactusRod });
        }
        
        if(PropsHelperInfiTools.enableSandstoneTools)
        {
            ModLoader.addRecipe(new ItemStack(woodSandstoneHoe), new Object[] 
                    { recipe, '#', Block.sandStone, '|', Item.stick });
            ModLoader.addRecipe(new ItemStack(sandstoneSandstoneHoe), new Object[] 
                    { recipe, '#', Block.sandStone, '|', mod_InfiBase.sandstoneRod });
            ModLoader.addRecipe(new ItemStack(boneSandstoneHoe), new Object[] 
                    { recipe, '#', Block.sandStone, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneSandstoneHoe), new Object[] 
                    { recipe, '#', Block.sandStone, '|', mod_InfiBase.boneRod });      
            ModLoader.addRecipe(new ItemStack(netherrackSandstoneHoe), new Object[] 
                    { recipe, '#', Block.sandStone, '|', mod_InfiBase.netherrackRod });
            ModLoader.addRecipe(new ItemStack(iceSandstoneHoe), new Object[] 
                    { recipe, '#', Block.sandStone, '|', mod_InfiBase.iceRod });
            ModLoader.addRecipe(new ItemStack(slimeSandstoneHoe), new Object[] 
                    { recipe, '#', Block.sandStone, '|', mod_InfiBase.slimeRod });
            ModLoader.addRecipe(new ItemStack(cactusSandstoneHoe), new Object[] 
                    { recipe, '#', Block.sandStone, '|', mod_InfiBase.cactusRod });
            ModLoader.addRecipe(new ItemStack(flintSandstoneHoe), new Object[] 
                    { recipe, '#', Block.sandStone, '|', mod_InfiBase.flintRod });
        }
        
        if(PropsHelperInfiTools.enableBoneTools)
        {
            ModLoader.addRecipe(new ItemStack(woodBoneHoe), new Object[] 
                    { recipe, '#', Item.bone, '|', Item.stick });
            ModLoader.addRecipe(new ItemStack(stoneBoneHoe), new Object[] 
                    { recipe, '#', Item.bone, '|', mod_InfiBase.stoneRod });
            ModLoader.addRecipe(new ItemStack(sandstoneBoneHoe), new Object[] 
                    { recipe, '#', Item.bone, '|', mod_InfiBase.sandstoneRod });
            ModLoader.addRecipe(new ItemStack(boneBoneHoe), new Object[] 
                    { recipe, '#', Item.bone, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneBoneHoe), new Object[] 
                    { recipe, '#', Item.bone, '|', mod_InfiBase.boneRod });
            ModLoader.addRecipe(new ItemStack(paperBoneHoe), new Object[] 
                    { recipe, '#', Item.bone, '|', mod_InfiBase.paperRod });
            ModLoader.addRecipe(new ItemStack(netherrackBoneHoe), new Object[] 
                    { recipe, '#', Item.bone, '|', mod_InfiBase.netherrackRod });
            ModLoader.addRecipe(new ItemStack(iceBoneHoe), new Object[] 
                    { recipe, '#', Item.bone, '|', mod_InfiBase.iceRod });
            ModLoader.addRecipe(new ItemStack(cactusBoneHoe), new Object[] 
                    { recipe, '#', Item.bone, '|', mod_InfiBase.cactusRod });
            ModLoader.addRecipe(new ItemStack(flintBoneHoe), new Object[] 
                    { recipe, '#', Item.bone, '|', mod_InfiBase.flintRod });
        }
        
        if(PropsHelperInfiTools.enablePaperTools)
        {
            ModLoader.addRecipe(new ItemStack(woodPaperHoe), new Object[] 
                    { recipe, '#', mod_InfiBase.paperStack, '|', Item.stick });
            ModLoader.addRecipe(new ItemStack(bonePaperHoe), new Object[] 
                    { recipe, '#', mod_InfiBase.paperStack, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(bonePaperHoe), new Object[] 
                    { recipe, '#', mod_InfiBase.paperStack, '|', mod_InfiBase.boneRod });
            ModLoader.addRecipe(new ItemStack(paperPaperHoe), new Object[] 
                    { recipe, '#', mod_InfiBase.paperStack, '|', mod_InfiBase.paperRod });
            ModLoader.addRecipe(new ItemStack(slimePaperHoe), new Object[] 
                    { recipe, '#', mod_InfiBase.paperStack, '|', mod_InfiBase.slimeRod });
            ModLoader.addRecipe(new ItemStack(cactusPaperHoe), new Object[] 
                    { recipe, '#', mod_InfiBase.paperStack, '|', mod_InfiBase.cactusRod });
        }
        
        if(PropsHelperInfiTools.enableMossyTools)
        {
        	ModLoader.addRecipe(new ItemStack(woodMossyHoe), new Object[] 
                    { recipe, '#', mod_InfiBase.mossyStone, '|', Item.stick });
        	ModLoader.addRecipe(new ItemStack(stoneMossyHoe), new Object[] 
                    { recipe, '#', mod_InfiBase.mossyStone, '|', mod_InfiBase.stoneRod });
            ModLoader.addRecipe(new ItemStack(diamondMossyHoe), new Object[] 
                    { recipe, '#', mod_InfiBase.mossyStone, '|', mod_InfiBase.diamondRod });
            ModLoader.addRecipe(new ItemStack(redstoneMossyHoe), new Object[] 
                    { recipe, '#', mod_InfiBase.mossyStone, '|', mod_InfiBase.redstoneRod });
            ModLoader.addRecipe(new ItemStack(boneMossyHoe), new Object[] 
                    { recipe, '#', mod_InfiBase.mossyStone, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneMossyHoe), new Object[] 
                    { recipe, '#', mod_InfiBase.mossyStone, '|', mod_InfiBase.boneRod });
            ModLoader.addRecipe(new ItemStack(mossyMossyHoe), new Object[] 
                    { recipe, '#', mod_InfiBase.mossyStone, '|', mod_InfiBase.mossyRod });
            ModLoader.addRecipe(new ItemStack(netherrackMossyHoe), new Object[] 
                    { recipe, '#', mod_InfiBase.mossyStone, '|', mod_InfiBase.netherrackRod });
            ModLoader.addRecipe(new ItemStack(glowstoneMossyHoe), new Object[] 
                    { recipe, '#', mod_InfiBase.mossyStone, '|', mod_InfiBase.glowstoneRod });
            ModLoader.addRecipe(new ItemStack(cactusMossyHoe), new Object[] 
                    { recipe, '#', mod_InfiBase.mossyStone, '|', mod_InfiBase.cactusRod });
            ModLoader.addRecipe(new ItemStack(blazeMossyHoe), new Object[] 
                    { recipe, '#', mod_InfiBase.mossyStone, '|', Item.blazeRod });
            ModLoader.addRecipe(new ItemStack(manyullynMossyHoe), new Object[] 
                    { recipe, '#', mod_InfiBase.mossyStone, '|', mod_InfiBase.manyullynRod });
            ModLoader.addRecipe(new ItemStack(uraniumMossyHoe), new Object[] 
                    { recipe, '#', mod_InfiBase.mossyStone, '|', mod_InfiBase.uraniumRod });
        }
        
        if(PropsHelperInfiTools.enableNetherrackTools)
        {
        	ModLoader.addRecipe(new ItemStack(woodNetherrackHoe), new Object[] 
                    { recipe, '#', Block.netherrack, '|', Item.stick });
        	ModLoader.addRecipe(new ItemStack(stoneNetherrackHoe), new Object[] 
                    { recipe, '#', Block.netherrack, '|', mod_InfiBase.stoneRod });
            ModLoader.addRecipe(new ItemStack(sandstoneNetherrackHoe), new Object[] 
                    { recipe, '#', Block.netherrack, '|', mod_InfiBase.sandstoneRod });
            ModLoader.addRecipe(new ItemStack(boneNetherrackHoe), new Object[] 
                    { recipe, '#', Block.netherrack, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneNetherrackHoe), new Object[] 
                    { recipe, '#', Block.netherrack, '|', mod_InfiBase.boneRod });
            ModLoader.addRecipe(new ItemStack(paperNetherrackHoe), new Object[] 
                    { recipe, '#', Block.netherrack, '|', mod_InfiBase.paperRod });
            ModLoader.addRecipe(new ItemStack(mossyNetherrackHoe), new Object[] 
                    { recipe, '#', Block.netherrack, '|', mod_InfiBase.mossyRod });
            ModLoader.addRecipe(new ItemStack(netherrackNetherrackHoe), new Object[] 
                    { recipe, '#', Block.netherrack, '|', mod_InfiBase.netherrackRod });
            ModLoader.addRecipe(new ItemStack(iceNetherrackHoe), new Object[] 
                    { recipe, '#', Block.netherrack, '|', mod_InfiBase.iceRod });
            ModLoader.addRecipe(new ItemStack(slimeNetherrackHoe), new Object[] 
                    { recipe, '#', Block.netherrack, '|', mod_InfiBase.slimeRod });
            ModLoader.addRecipe(new ItemStack(cactusNetherrackHoe), new Object[] 
                    { recipe, '#', Block.netherrack, '|', mod_InfiBase.cactusRod });
            ModLoader.addRecipe(new ItemStack(flintNetherrackHoe), new Object[] 
                    { recipe, '#', Block.netherrack, '|', mod_InfiBase.flintRod });
            ModLoader.addRecipe(new ItemStack(copperNetherrackHoe), new Object[] 
                    { recipe, '#', Block.netherrack, '|', mod_InfiBase.copperRod });
            ModLoader.addRecipe(new ItemStack(bronzeNetherrackHoe), new Object[] 
                    { recipe, '#', Block.netherrack, '|', mod_InfiBase.bronzeRod });
        }
        
        if(PropsHelperInfiTools.enableGlowstoneTools)
        {
        	ModLoader.addRecipe(new ItemStack(woodGlowstoneHoe), new Object[] 
                    { recipe, '#', mod_InfiBase.glowstoneCrystal, '|', Item.stick });
        	ModLoader.addRecipe(new ItemStack(redstoneGlowstoneHoe), new Object[] 
                    { recipe, '#', mod_InfiBase.glowstoneCrystal, '|', mod_InfiBase.glowstoneRod });
        	ModLoader.addRecipe(new ItemStack(obsidianGlowstoneHoe), new Object[] 
                    { recipe, '#', mod_InfiBase.glowstoneCrystal, '|', mod_InfiBase.obsidianRod });
            ModLoader.addRecipe(new ItemStack(boneGlowstoneHoe), new Object[] 
                    { recipe, '#', mod_InfiBase.glowstoneCrystal, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneGlowstoneHoe), new Object[] 
                    { recipe, '#', mod_InfiBase.glowstoneCrystal, '|', mod_InfiBase.boneRod });
            ModLoader.addRecipe(new ItemStack(netherrackGlowstoneHoe), new Object[] 
                    { recipe, '#', mod_InfiBase.glowstoneCrystal, '|', mod_InfiBase.netherrackRod });
            ModLoader.addRecipe(new ItemStack(iceGlowstoneHoe), new Object[] 
                    { recipe, '#', mod_InfiBase.glowstoneCrystal, '|', mod_InfiBase.iceRod });
            ModLoader.addRecipe(new ItemStack(slimeGlowstoneHoe), new Object[] 
                    { recipe, '#', mod_InfiBase.glowstoneCrystal, '|', mod_InfiBase.slimeRod });
            ModLoader.addRecipe(new ItemStack(cactusGlowstoneHoe), new Object[] 
                    { recipe, '#', mod_InfiBase.glowstoneCrystal, '|', mod_InfiBase.cactusRod });
        }
        
        if(PropsHelperInfiTools.enableIceTools)
        {
            ModLoader.addRecipe(new ItemStack(woodIceHoe), new Object[] 
                    { recipe, '#', Block.ice, '|', Item.stick });
            ModLoader.addRecipe(new ItemStack(boneIceHoe), new Object[] 
                    { recipe, '#', Block.ice, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneIceHoe), new Object[] 
                    { recipe, '#', Block.ice, '|', mod_InfiBase.boneRod });
            ModLoader.addRecipe(new ItemStack(paperIceHoe), new Object[] 
                    { recipe, '#', Block.ice, '|', mod_InfiBase.paperRod });
            ModLoader.addRecipe(new ItemStack(iceIceHoe), new Object[] 
                    { recipe, '#', Block.ice, '|', mod_InfiBase.iceRod });
            ModLoader.addRecipe(new ItemStack(slimeIceHoe), new Object[] 
                    { recipe, '#', Block.ice, '|', mod_InfiBase.slimeRod });
            ModLoader.addRecipe(new ItemStack(cactusIceHoe), new Object[] 
                    { recipe, '#', Block.ice, '|', mod_InfiBase.cactusRod });
        }
        
        if(PropsHelperInfiTools.enableLavaTools)
        {
            ModLoader.addRecipe(new ItemStack(diamondLavaHoe), new Object[] 
                    { recipe, '#', mod_InfiBase.lavaCrystal, '|', mod_InfiBase.diamondRod });
            ModLoader.addRecipe(new ItemStack(obsidianLavaHoe), new Object[] 
                    { recipe, '#', mod_InfiBase.lavaCrystal, '|', mod_InfiBase.obsidianRod });
            ModLoader.addRecipe(new ItemStack(netherrackLavaHoe), new Object[] 
                    { recipe, '#', mod_InfiBase.lavaCrystal, '|', mod_InfiBase.netherrackRod });
            ModLoader.addRecipe(new ItemStack(lavaLavaHoe), new Object[] 
                    { recipe, '#', mod_InfiBase.lavaCrystal, '|', mod_InfiBase.lavaRod });
            ModLoader.addRecipe(new ItemStack(flintLavaHoe), new Object[] 
                    { recipe, '#', mod_InfiBase.lavaCrystal, '|', mod_InfiBase.flintRod });
            ModLoader.addRecipe(new ItemStack(blazeLavaHoe), new Object[] 
                    { recipe, '#', mod_InfiBase.lavaCrystal, '|', Item.blazeRod });
            ModLoader.addRecipe(new ItemStack(manyullynLavaHoe), new Object[] 
                    { recipe, '#', mod_InfiBase.lavaCrystal, '|', mod_InfiBase.manyullynRod });
            ModLoader.addRecipe(new ItemStack(uraniumLavaHoe), new Object[] 
                    { recipe, '#', mod_InfiBase.lavaCrystal, '|', mod_InfiBase.uraniumRod });
        }
        
        if(PropsHelperInfiTools.enableSlimeTools)
        {
            ModLoader.addRecipe(new ItemStack(woodSlimeHoe), new Object[] 
                    { recipe, '#', mod_InfiBase.slimeCrystal, '|', Item.stick });
            ModLoader.addRecipe(new ItemStack(sandstoneSlimeHoe), new Object[] 
                    { recipe, '#', mod_InfiBase.slimeCrystal, '|', mod_InfiBase.sandstoneRod });
            ModLoader.addRecipe(new ItemStack(boneSlimeHoe), new Object[] 
                    { recipe, '#', mod_InfiBase.slimeCrystal, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneSlimeHoe), new Object[] 
                    { recipe, '#', mod_InfiBase.slimeCrystal, '|', mod_InfiBase.boneRod });
            ModLoader.addRecipe(new ItemStack(paperSlimeHoe), new Object[] 
                    { recipe, '#', mod_InfiBase.slimeCrystal, '|', mod_InfiBase.paperRod });
            ModLoader.addRecipe(new ItemStack(slimeSlimeHoe), new Object[] 
                    { recipe, '#', mod_InfiBase.slimeCrystal, '|', mod_InfiBase.slimeRod });
            ModLoader.addRecipe(new ItemStack(cactusSlimeHoe), new Object[] 
                    { recipe, '#', mod_InfiBase.slimeCrystal, '|', mod_InfiBase.cactusRod });
        }
        
        if(PropsHelperInfiTools.enableCactusTools)
        {
            ModLoader.addRecipe(new ItemStack(woodCactusHoe), new Object[] 
                    { recipe, '#', Block.cactus, '|', Item.stick });
            ModLoader.addRecipe(new ItemStack(sandstoneCactusHoe), new Object[] 
                    { recipe, '#', Block.cactus, '|', mod_InfiBase.sandstoneRod });
            ModLoader.addRecipe(new ItemStack(boneCactusHoe), new Object[] 
                    { recipe, '#', Block.cactus, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneCactusHoe), new Object[] 
                    { recipe, '#', Block.cactus, '|', mod_InfiBase.boneRod });
            ModLoader.addRecipe(new ItemStack(netherrackCactusHoe), new Object[] 
                    { recipe, '#', Block.cactus, '|', mod_InfiBase.netherrackRod });
            ModLoader.addRecipe(new ItemStack(iceCactusHoe), new Object[] 
                    { recipe, '#', Block.cactus, '|', mod_InfiBase.iceRod });
            ModLoader.addRecipe(new ItemStack(slimeCactusHoe), new Object[] 
                    { recipe, '#', Block.cactus, '|', mod_InfiBase.slimeRod });
            ModLoader.addRecipe(new ItemStack(cactusCactusHoe), new Object[] 
                    { recipe, '#', Block.cactus, '|', mod_InfiBase.cactusRod });
        }
        
        if(PropsHelperInfiTools.enableFlintTools)
        {
        	ModLoader.addRecipe(new ItemStack(woodFlintHoe), new Object[] 
                    { recipe, '#', Item.flint, '|', Item.stick });
        	ModLoader.addRecipe(new ItemStack(stoneFlintHoe), new Object[] 
                    { recipe, '#', Item.flint, '|', mod_InfiBase.stoneRod });
            ModLoader.addRecipe(new ItemStack(sandstoneFlintHoe), new Object[] 
                    { recipe, '#', Item.flint, '|', mod_InfiBase.sandstoneRod });
            ModLoader.addRecipe(new ItemStack(boneFlintHoe), new Object[] 
                    { recipe, '#', Item.flint, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneFlintHoe), new Object[] 
                    { recipe, '#', Item.flint, '|', mod_InfiBase.boneRod });
            ModLoader.addRecipe(new ItemStack(netherrackFlintHoe), new Object[] 
                    { recipe, '#', Item.flint, '|', mod_InfiBase.netherrackRod });
            ModLoader.addRecipe(new ItemStack(slimeFlintHoe), new Object[] 
                    { recipe, '#', Item.flint, '|', mod_InfiBase.slimeRod });
            ModLoader.addRecipe(new ItemStack(cactusFlintHoe), new Object[] 
                    { recipe, '#', Item.flint, '|', mod_InfiBase.cactusRod });
            ModLoader.addRecipe(new ItemStack(flintFlintHoe), new Object[] 
                    { recipe, '#', Item.flint, '|', mod_InfiBase.flintRod });
            ModLoader.addRecipe(new ItemStack(copperFlintHoe), new Object[] 
                    { recipe, '#', Block.netherrack, '|', mod_InfiBase.copperRod });
            ModLoader.addRecipe(new ItemStack(bronzeFlintHoe), new Object[] 
                    { recipe, '#', Block.netherrack, '|', mod_InfiBase.bronzeRod });
        }
        
        if(PropsHelperInfiTools.enableBlazeTools)
        {
            ModLoader.addRecipe(new ItemStack(diamondBlazeHoe), new Object[] 
                    { recipe, '#', mod_InfiBase.blazeCrystal, '|', mod_InfiBase.diamondRod });
            ModLoader.addRecipe(new ItemStack(obsidianBlazeHoe), new Object[] 
                    { recipe, '#', mod_InfiBase.blazeCrystal, '|', mod_InfiBase.obsidianRod });
            ModLoader.addRecipe(new ItemStack(netherrackBlazeHoe), new Object[] 
                    { recipe, '#', mod_InfiBase.blazeCrystal, '|', mod_InfiBase.netherrackRod });
            ModLoader.addRecipe(new ItemStack(lavaBlazeHoe), new Object[] 
                    { recipe, '#', mod_InfiBase.blazeCrystal, '|', mod_InfiBase.lavaRod });
            ModLoader.addRecipe(new ItemStack(flintBlazeHoe), new Object[] 
                    { recipe, '#', mod_InfiBase.blazeCrystal, '|', mod_InfiBase.flintRod });
            ModLoader.addRecipe(new ItemStack(blazeBlazeHoe), new Object[] 
                    { recipe, '#', mod_InfiBase.blazeCrystal, '|', Item.blazeRod });
            ModLoader.addRecipe(new ItemStack(manyullynBlazeHoe), new Object[] 
                    { recipe, '#', mod_InfiBase.blazeCrystal, '|', mod_InfiBase.manyullynRod });
            ModLoader.addRecipe(new ItemStack(uraniumBlazeHoe), new Object[] 
                    { recipe, '#', mod_InfiBase.blazeCrystal, '|', mod_InfiBase.uraniumRod });
        }
    }
    
    public static void addStoneTools(ItemStack stack)
    {
    	ModLoader.addRecipe(new ItemStack(woodStoneHoe), new Object[] 
                { recipe, '#', stack, '|', Item.stick });
    	ModLoader.addRecipe(new ItemStack(stoneStoneHoe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.stoneRod });
        ModLoader.addRecipe(new ItemStack(sandstoneStoneHoe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.sandstoneRod });
        ModLoader.addRecipe(new ItemStack(boneStoneHoe), new Object[] 
                { recipe, '#', stack, '|', Item.bone });
        ModLoader.addRecipe(new ItemStack(boneStoneHoe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.boneRod });
        ModLoader.addRecipe(new ItemStack(netherrackStoneHoe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.netherrackRod });
        ModLoader.addRecipe(new ItemStack(iceStoneHoe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.iceRod });
        ModLoader.addRecipe(new ItemStack(slimeStoneHoe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.slimeRod });
        ModLoader.addRecipe(new ItemStack(cactusStoneHoe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.cactusRod });
        ModLoader.addRecipe(new ItemStack(flintStoneHoe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.flintRod });
    }
    
    public static void addCopperTools(ItemStack stack)
    {
    	ModLoader.addRecipe(new ItemStack(woodCopperHoe), new Object[] 
                { recipe, '#', stack, '|', Item.stick });
        ModLoader.addRecipe(new ItemStack(stoneCopperHoe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.stoneRod });
        ModLoader.addRecipe(new ItemStack(boneCopperHoe), new Object[] 
                { recipe, '#', stack, '|', Item.bone });
        ModLoader.addRecipe(new ItemStack(boneCopperHoe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.boneRod });
        ModLoader.addRecipe(new ItemStack(netherrackCopperHoe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.netherrackRod });
        ModLoader.addRecipe(new ItemStack(slimeCopperHoe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.slimeRod });
        ModLoader.addRecipe(new ItemStack(cactusCopperHoe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.cactusRod });
        ModLoader.addRecipe(new ItemStack(flintCopperHoe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.flintRod });
        ModLoader.addRecipe(new ItemStack(copperCopperHoe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.copperRod });
    }
    
    public static void addBronzeTools(ItemStack stack)
    {
    	ModLoader.addRecipe(new ItemStack(woodBronzeHoe), new Object[] 
                { recipe, '#', stack, '|', Item.stick });
        ModLoader.addRecipe(new ItemStack(stoneBronzeHoe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.stoneRod });
        ModLoader.addRecipe(new ItemStack(boneBronzeHoe), new Object[] 
                { recipe, '#', stack, '|', Item.bone });
        ModLoader.addRecipe(new ItemStack(boneBronzeHoe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.boneRod });
        ModLoader.addRecipe(new ItemStack(netherrackBronzeHoe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.netherrackRod });
        ModLoader.addRecipe(new ItemStack(slimeBronzeHoe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.slimeRod });
        ModLoader.addRecipe(new ItemStack(cactusBronzeHoe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.cactusRod });
        ModLoader.addRecipe(new ItemStack(flintBronzeHoe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.flintRod });
        ModLoader.addRecipe(new ItemStack(copperBronzeHoe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.copperRod });
        ModLoader.addRecipe(new ItemStack(bronzeBronzeHoe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.bronzeRod });
    }
    
    public static void addWorkedIronTools(ItemStack stack)
    {
    	ModLoader.addRecipe(new ItemStack(woodWorkedIronHoe), new Object[] 
                { recipe, '#', stack, '|', Item.stick });
        ModLoader.addRecipe(new ItemStack(stoneWorkedIronHoe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.stoneRod });
        ModLoader.addRecipe(new ItemStack(ironWorkedIronHoe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.ironRod });
        ModLoader.addRecipe(new ItemStack(diamondWorkedIronHoe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.diamondRod });
        ModLoader.addRecipe(new ItemStack(redstoneWorkedIronHoe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.redstoneRod });
        ModLoader.addRecipe(new ItemStack(obsidianWorkedIronHoe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.obsidianRod });
        ModLoader.addRecipe(new ItemStack(boneWorkedIronHoe), new Object[] 
                { recipe, '#', stack, '|', Item.bone });
        ModLoader.addRecipe(new ItemStack(boneWorkedIronHoe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.boneRod });
        ModLoader.addRecipe(new ItemStack(netherrackWorkedIronHoe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.netherrackRod });
        ModLoader.addRecipe(new ItemStack(glowstoneWorkedIronHoe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.glowstoneRod });
        ModLoader.addRecipe(new ItemStack(iceWorkedIronHoe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.iceRod });
        ModLoader.addRecipe(new ItemStack(slimeWorkedIronHoe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.slimeRod });
        ModLoader.addRecipe(new ItemStack(cactusWorkedIronHoe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.cactusRod });
        ModLoader.addRecipe(new ItemStack(blazeWorkedIronHoe), new Object[] 
                { recipe, '#', stack, '|', Item.blazeRod });
        ModLoader.addRecipe(new ItemStack(copperWorkedIronHoe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.copperRod });
        ModLoader.addRecipe(new ItemStack(bronzeWorkedIronHoe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.bronzeRod });
        ModLoader.addRecipe(new ItemStack(workedWorkedIronHoe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.workedIronRod });
        ModLoader.addRecipe(new ItemStack(steelWorkedIronHoe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.steelRod });
        ModLoader.addRecipe(new ItemStack(uraniumWorkedIronHoe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.uraniumRod });
    }
    
    public static void addSteelTools(ItemStack stack)
    {
    	ModLoader.addRecipe(new ItemStack(woodSteelHoe), new Object[] 
                { recipe, '#', stack, '|', Item.stick });
        ModLoader.addRecipe(new ItemStack(stoneSteelHoe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.stoneRod });
        ModLoader.addRecipe(new ItemStack(ironSteelHoe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.ironRod });
        ModLoader.addRecipe(new ItemStack(diamondSteelHoe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.diamondRod });
        ModLoader.addRecipe(new ItemStack(redstoneSteelHoe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.redstoneRod });
        ModLoader.addRecipe(new ItemStack(obsidianSteelHoe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.obsidianRod });
        ModLoader.addRecipe(new ItemStack(boneSteelHoe), new Object[] 
                { recipe, '#', stack, '|', Item.bone });
        ModLoader.addRecipe(new ItemStack(boneSteelHoe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.boneRod });
        ModLoader.addRecipe(new ItemStack(netherrackSteelHoe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.netherrackRod });
        ModLoader.addRecipe(new ItemStack(glowstoneSteelHoe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.glowstoneRod });
        ModLoader.addRecipe(new ItemStack(iceSteelHoe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.iceRod });
        ModLoader.addRecipe(new ItemStack(slimeSteelHoe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.slimeRod });
        ModLoader.addRecipe(new ItemStack(cactusSteelHoe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.cactusRod });
        ModLoader.addRecipe(new ItemStack(blazeSteelHoe), new Object[] 
                { recipe, '#', stack, '|', Item.blazeRod });
        ModLoader.addRecipe(new ItemStack(copperSteelHoe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.copperRod });
        ModLoader.addRecipe(new ItemStack(bronzeSteelHoe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.bronzeRod });
        ModLoader.addRecipe(new ItemStack(workedSteelHoe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.workedIronRod });
        ModLoader.addRecipe(new ItemStack(steelSteelHoe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.steelRod });
        ModLoader.addRecipe(new ItemStack(cobaltSteelHoe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.cobaltRod });
        ModLoader.addRecipe(new ItemStack(arditeSteelHoe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.arditeRod });
        ModLoader.addRecipe(new ItemStack(uraniumSteelHoe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.uraniumRod });
    }
    
    public static void addCobaltTools(ItemStack stack)
    {
    	ModLoader.addRecipe(new ItemStack(woodCobaltHoe), new Object[] 
                { recipe, '#', stack, '|', Item.stick });
        ModLoader.addRecipe(new ItemStack(stoneCobaltHoe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.stoneRod });
        ModLoader.addRecipe(new ItemStack(ironCobaltHoe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.ironRod });
        ModLoader.addRecipe(new ItemStack(diamondCobaltHoe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.diamondRod });
        ModLoader.addRecipe(new ItemStack(redstoneCobaltHoe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.redstoneRod });
        ModLoader.addRecipe(new ItemStack(obsidianCobaltHoe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.obsidianRod });
        ModLoader.addRecipe(new ItemStack(boneCobaltHoe), new Object[] 
                { recipe, '#', stack, '|', Item.bone });
        ModLoader.addRecipe(new ItemStack(boneCobaltHoe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.boneRod });
        ModLoader.addRecipe(new ItemStack(slimeCobaltHoe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.slimeRod });
        ModLoader.addRecipe(new ItemStack(cactusCobaltHoe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.cactusRod });
        ModLoader.addRecipe(new ItemStack(blazeCobaltHoe), new Object[] 
                { recipe, '#', stack, '|', Item.blazeRod });
        ModLoader.addRecipe(new ItemStack(copperCobaltHoe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.copperRod });
        ModLoader.addRecipe(new ItemStack(bronzeCobaltHoe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.bronzeRod });
        ModLoader.addRecipe(new ItemStack(workedCobaltHoe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.workedIronRod });
        ModLoader.addRecipe(new ItemStack(steelCobaltHoe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.steelRod });
        ModLoader.addRecipe(new ItemStack(cobaltCobaltHoe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.cobaltRod });
        ModLoader.addRecipe(new ItemStack(arditeCobaltHoe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.arditeRod });
        ModLoader.addRecipe(new ItemStack(manyullynCobaltHoe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.manyullynRod });
        ModLoader.addRecipe(new ItemStack(uraniumCobaltHoe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.uraniumRod });
    }
    
    public static void addArditeTools(ItemStack stack)
    {
    	ModLoader.addRecipe(new ItemStack(woodArditeHoe), new Object[] 
                { recipe, '#', stack, '|', Item.stick });
        ModLoader.addRecipe(new ItemStack(stoneArditeHoe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.stoneRod });
        ModLoader.addRecipe(new ItemStack(ironArditeHoe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.ironRod });
        ModLoader.addRecipe(new ItemStack(diamondArditeHoe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.diamondRod });
        ModLoader.addRecipe(new ItemStack(redstoneArditeHoe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.redstoneRod });
        ModLoader.addRecipe(new ItemStack(obsidianArditeHoe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.obsidianRod });
        ModLoader.addRecipe(new ItemStack(boneArditeHoe), new Object[] 
                { recipe, '#', stack, '|', Item.bone });
        ModLoader.addRecipe(new ItemStack(boneArditeHoe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.boneRod });
        ModLoader.addRecipe(new ItemStack(slimeArditeHoe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.slimeRod });
        ModLoader.addRecipe(new ItemStack(cactusArditeHoe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.cactusRod });
        ModLoader.addRecipe(new ItemStack(blazeArditeHoe), new Object[] 
                { recipe, '#', stack, '|', Item.blazeRod });
        ModLoader.addRecipe(new ItemStack(copperArditeHoe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.copperRod });
        ModLoader.addRecipe(new ItemStack(bronzeArditeHoe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.bronzeRod });
        ModLoader.addRecipe(new ItemStack(workedArditeHoe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.workedIronRod });
        ModLoader.addRecipe(new ItemStack(steelArditeHoe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.steelRod });
        ModLoader.addRecipe(new ItemStack(cobaltArditeHoe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.cobaltRod });
        ModLoader.addRecipe(new ItemStack(arditeArditeHoe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.arditeRod });
        ModLoader.addRecipe(new ItemStack(manyullynArditeHoe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.manyullynRod });
        ModLoader.addRecipe(new ItemStack(uraniumArditeHoe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.uraniumRod });
    }
    
    public static void addManyullynTools(ItemStack stack)
    {
    	ModLoader.addRecipe(new ItemStack(woodManyullynHoe), new Object[] 
                { recipe, '#', stack, '|', Item.stick });
        ModLoader.addRecipe(new ItemStack(stoneManyullynHoe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.stoneRod });
        ModLoader.addRecipe(new ItemStack(ironManyullynHoe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.ironRod });
        ModLoader.addRecipe(new ItemStack(diamondManyullynHoe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.diamondRod });
        ModLoader.addRecipe(new ItemStack(redstoneManyullynHoe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.redstoneRod });
        ModLoader.addRecipe(new ItemStack(obsidianManyullynHoe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.obsidianRod });
        ModLoader.addRecipe(new ItemStack(boneManyullynHoe), new Object[] 
                { recipe, '#', stack, '|', Item.bone });
        ModLoader.addRecipe(new ItemStack(boneManyullynHoe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.boneRod });
        ModLoader.addRecipe(new ItemStack(slimeManyullynHoe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.slimeRod });
        ModLoader.addRecipe(new ItemStack(cactusManyullynHoe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.cactusRod });
        ModLoader.addRecipe(new ItemStack(blazeManyullynHoe), new Object[] 
                { recipe, '#', stack, '|', Item.blazeRod });
        ModLoader.addRecipe(new ItemStack(copperManyullynHoe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.copperRod });
        ModLoader.addRecipe(new ItemStack(bronzeManyullynHoe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.bronzeRod });
        ModLoader.addRecipe(new ItemStack(workedManyullynHoe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.workedIronRod });
        ModLoader.addRecipe(new ItemStack(steelManyullynHoe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.steelRod });
        ModLoader.addRecipe(new ItemStack(cobaltManyullynHoe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.cobaltRod });
        ModLoader.addRecipe(new ItemStack(arditeManyullynHoe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.arditeRod });
        ModLoader.addRecipe(new ItemStack(manyullynManyullynHoe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.manyullynRod });
        ModLoader.addRecipe(new ItemStack(uraniumManyullynHoe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.uraniumRod });
    }
    
    public static void addUraniumTools(ItemStack stack)
    {
        ModLoader.addRecipe(new ItemStack(diamondUraniumHoe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.diamondRod });
        ModLoader.addRecipe(new ItemStack(redstoneUraniumHoe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.redstoneRod });
        ModLoader.addRecipe(new ItemStack(boneUraniumHoe), new Object[] 
                { recipe, '#', stack, '|', Item.bone });
        ModLoader.addRecipe(new ItemStack(boneUraniumHoe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.boneRod });
        ModLoader.addRecipe(new ItemStack(netherrackUraniumHoe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.netherrackRod });
        ModLoader.addRecipe(new ItemStack(glowstoneUraniumHoe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.glowstoneRod });
        ModLoader.addRecipe(new ItemStack(lavaUraniumHoe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.lavaRod });
        ModLoader.addRecipe(new ItemStack(blazeUraniumHoe), new Object[] 
                { recipe, '#', stack, '|', Item.blazeRod });
        ModLoader.addRecipe(new ItemStack(cobaltUraniumHoe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.cobaltRod });
        ModLoader.addRecipe(new ItemStack(arditeUraniumHoe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.arditeRod });
        ModLoader.addRecipe(new ItemStack(uraniumUraniumHoe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.uraniumRod });
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
