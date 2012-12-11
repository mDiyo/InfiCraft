package mDiyo.inficraft.infitools.core;
import mDiyo.inficraft.infitools.library.InfiLibrary;
import mDiyo.inficraft.infitools.library.InfiMaterialEnum;
import net.minecraft.src.Block;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;
import net.minecraft.src.ModLoader;
import net.minecraftforge.common.MinecraftForge;

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
    	if(PHInfiTools.addInfiTools)
        {
    		createTools();
    		addNames();
    		registerInfiToolsRecipes();
        }
    }
    
    private static void createTools()
    {
    	if(PHInfiTools.enableWoodTools)
    	{
    		if (PHInfiTools.overwriteVanillaTools)
    			woodWoodShovel = new InfiToolShovel(14, InfiMaterialEnum.Wood, InfiMaterialEnum.Wood, "woodWoodShovel");
    		sandstoneWoodShovel = new InfiToolShovel(PHInfiTools.woodShovelID+1, 
                    InfiMaterialEnum.Wood, InfiMaterialEnum.Sandstone, "sandstoneWoodShovel");
    		boneWoodShovel = new InfiToolShovel(PHInfiTools.woodShovelID+2, 
                    InfiMaterialEnum.Wood, InfiMaterialEnum.Bone, "boneWoodShovel");
    		paperWoodShovel = new InfiToolShovel(PHInfiTools.woodShovelID+3, 
                    InfiMaterialEnum.Wood, InfiMaterialEnum.Paper, "paperWoodShovel");
    		iceWoodShovel = new InfiToolShovel(PHInfiTools.woodShovelID+4, 
                    InfiMaterialEnum.Wood, InfiMaterialEnum.Ice, "iceWoodShovel");
    		slimeWoodShovel = new InfiToolShovel(PHInfiTools.woodShovelID+5, 
                    InfiMaterialEnum.Wood, InfiMaterialEnum.Slime, "slimeWoodShovel");
    		cactusWoodShovel = new InfiToolShovel(PHInfiTools.woodShovelID+6, 
                    InfiMaterialEnum.Wood, InfiMaterialEnum.Cactus, "cactusWoodShovel");
    		
    		if (PHInfiTools.overwriteVanillaTools)
    			MinecraftForge.setToolClass(woodWoodShovel, "Shovel", InfiMaterialEnum.Wood.getHarvestLevel());
    		MinecraftForge.setToolClass(sandstoneWoodShovel, "Shovel", InfiMaterialEnum.Wood.getHarvestLevel());
    		MinecraftForge.setToolClass(boneWoodShovel, "Shovel", InfiMaterialEnum.Wood.getHarvestLevel());
    		MinecraftForge.setToolClass(paperWoodShovel, "Shovel", InfiMaterialEnum.Wood.getHarvestLevel());
    		MinecraftForge.setToolClass(iceWoodShovel, "Shovel", InfiMaterialEnum.Wood.getHarvestLevel());
    		MinecraftForge.setToolClass(slimeWoodShovel, "Shovel", InfiMaterialEnum.Wood.getHarvestLevel());
    		MinecraftForge.setToolClass(cactusWoodShovel, "Shovel", InfiMaterialEnum.Wood.getHarvestLevel());
    	}

        if(PHInfiTools.enableStoneTools)
        {
        	if (PHInfiTools.overwriteVanillaTools)
        		woodStoneShovel = new InfiToolShovel(18, InfiMaterialEnum.Stone, InfiMaterialEnum.Wood, "woodStoneShovel");
        	stoneStoneShovel = new InfiToolShovel(PHInfiTools.stoneShovelID+1, 
                    InfiMaterialEnum.Stone, InfiMaterialEnum.Stone, "stoneStoneShovel");
        	sandstoneStoneShovel = new InfiToolShovel(PHInfiTools.stoneShovelID+2, 
                    InfiMaterialEnum.Stone, InfiMaterialEnum.Sandstone, "sandstoneStoneShovel");
        	boneStoneShovel = new InfiToolShovel(PHInfiTools.stoneShovelID+3, 
                    InfiMaterialEnum.Stone, InfiMaterialEnum.Bone, "boneStoneShovel");
        	netherrackStoneShovel = new InfiToolShovel(PHInfiTools.stoneShovelID+4, 
                    InfiMaterialEnum.Stone, InfiMaterialEnum.Netherrack, "netherrackStoneShovel");
        	iceStoneShovel = new InfiToolShovel(PHInfiTools.stoneShovelID+5, 
                    InfiMaterialEnum.Stone, InfiMaterialEnum.Ice, "iceStoneShovel");
        	slimeStoneShovel = new InfiToolShovel(PHInfiTools.stoneShovelID+6, 
                    InfiMaterialEnum.Stone, InfiMaterialEnum.Slime, "slimeStoneShovel");
        	cactusStoneShovel = new InfiToolShovel(PHInfiTools.stoneShovelID+7, 
                    InfiMaterialEnum.Stone, InfiMaterialEnum.Cactus, "cactusStoneShovel");
        	flintStoneShovel = new InfiToolShovel(PHInfiTools.stoneShovelID+8, 
                    InfiMaterialEnum.Stone, InfiMaterialEnum.Flint, "flintStoneShovel");
            
        	if (PHInfiTools.overwriteVanillaTools)
        		MinecraftForge.setToolClass(woodStoneShovel, "Shovel", InfiMaterialEnum.Stone.getHarvestLevel());
            MinecraftForge.setToolClass(stoneStoneShovel, "Shovel", InfiMaterialEnum.Stone.getHarvestLevel());
            MinecraftForge.setToolClass(sandstoneStoneShovel, "Shovel", InfiMaterialEnum.Stone.getHarvestLevel());
            MinecraftForge.setToolClass(boneStoneShovel, "Shovel", InfiMaterialEnum.Stone.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackStoneShovel, "Shovel", InfiMaterialEnum.Stone.getHarvestLevel());
            MinecraftForge.setToolClass(iceStoneShovel, "Shovel", InfiMaterialEnum.Stone.getHarvestLevel());
            MinecraftForge.setToolClass(slimeStoneShovel, "Shovel", InfiMaterialEnum.Stone.getHarvestLevel());
            MinecraftForge.setToolClass(cactusStoneShovel, "Shovel", InfiMaterialEnum.Stone.getHarvestLevel());
            MinecraftForge.setToolClass(flintStoneShovel, "Shovel", InfiMaterialEnum.Stone.getHarvestLevel());
        }
        
        if(PHInfiTools.enableIronTools)
        {
        	if (PHInfiTools.overwriteVanillaTools)
        		woodIronShovel = new InfiToolShovel(1, InfiMaterialEnum.Iron, InfiMaterialEnum.Wood, "woodIronShovel");
        	stoneIronShovel = new InfiToolShovel(PHInfiTools.ironShovelID+1, 
                    InfiMaterialEnum.Iron, InfiMaterialEnum.Stone, "stoneIronShovel");
        	ironIronShovel = new InfiToolShovel(PHInfiTools.ironShovelID+2, 
                    InfiMaterialEnum.Iron, InfiMaterialEnum.Iron, "ironIronShovel");
        	boneIronShovel = new InfiToolShovel(PHInfiTools.ironShovelID+3, 
                    InfiMaterialEnum.Iron, InfiMaterialEnum.Bone, "boneIronShovel");
        	netherrackIronShovel = new InfiToolShovel(PHInfiTools.ironShovelID+4, 
                    InfiMaterialEnum.Iron, InfiMaterialEnum.Netherrack, "netherrackIronShovel");
        	glowstoneIronShovel = new InfiToolShovel(PHInfiTools.ironShovelID+5, 
                    InfiMaterialEnum.Iron, InfiMaterialEnum.Glowstone, "glowstoneIronShovel");
        	cactusIronShovel = new InfiToolShovel(PHInfiTools.ironShovelID+6, 
                    InfiMaterialEnum.Iron, InfiMaterialEnum.Cactus, "cactusIronShovel");
        	copperIronShovel = new InfiToolShovel(PHInfiTools.ironShovelID+7, 
                    InfiMaterialEnum.Iron, InfiMaterialEnum.Copper, "copperIronShovel");
        	bronzeIronShovel = new InfiToolShovel(PHInfiTools.ironShovelID+8, 
                    InfiMaterialEnum.Iron, InfiMaterialEnum.Bronze, "bronzeIronShovel");
            
        	if (PHInfiTools.overwriteVanillaTools)
        		MinecraftForge.setToolClass(woodIronShovel, "Shovel", InfiMaterialEnum.Iron.getHarvestLevel());
            MinecraftForge.setToolClass(stoneIronShovel, "Shovel", InfiMaterialEnum.Iron.getHarvestLevel());
            MinecraftForge.setToolClass(ironIronShovel, "Shovel", InfiMaterialEnum.Iron.getHarvestLevel());
            MinecraftForge.setToolClass(boneIronShovel, "Shovel", InfiMaterialEnum.Iron.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackIronShovel, "Shovel", InfiMaterialEnum.Iron.getHarvestLevel());
            MinecraftForge.setToolClass(glowstoneIronShovel, "Shovel", InfiMaterialEnum.Iron.getHarvestLevel());
            MinecraftForge.setToolClass(cactusIronShovel, "Shovel", InfiMaterialEnum.Iron.getHarvestLevel());
            MinecraftForge.setToolClass(copperIronShovel, "Shovel", InfiMaterialEnum.Iron.getHarvestLevel());
            MinecraftForge.setToolClass(bronzeIronShovel, "Shovel", InfiMaterialEnum.Iron.getHarvestLevel());
        }
        
        if(PHInfiTools.enableDiamondTools)
        {
        	if (PHInfiTools.overwriteVanillaTools)
        		woodDiamondShovel = new InfiToolShovel(22, InfiMaterialEnum.Diamond, InfiMaterialEnum.Wood, "woodDiamondShovel");
        	stoneDiamondShovel = new InfiToolShovel(PHInfiTools.diamondShovelID+1, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Stone, "stoneDiamondShovel");
        	ironDiamondShovel = new InfiToolShovel(PHInfiTools.diamondShovelID+2, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Iron, "ironDiamondShovel");
        	diamondDiamondShovel = new InfiToolShovel(PHInfiTools.diamondShovelID+3, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Diamond, "diamondDiamondShovel");
        	redstoneDiamondShovel = new InfiToolShovel(PHInfiTools.diamondShovelID+4, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Redstone, "redstoneDiamondShovel");
        	obsidianDiamondShovel = new InfiToolShovel(PHInfiTools.diamondShovelID+5, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Obsidian, "obsidianDiamondShovel");
        	boneDiamondShovel = new InfiToolShovel(PHInfiTools.diamondShovelID+6, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Bone, "boneDiamondShovel");
        	mossyDiamondShovel = new InfiToolShovel(PHInfiTools.diamondShovelID+7, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Mossy, "mossyDiamondShovel");
        	netherrackDiamondShovel = new InfiToolShovel(PHInfiTools.diamondShovelID+8, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Netherrack, "netherrackDiamondShovel");
        	glowstoneDiamondShovel = new InfiToolShovel(PHInfiTools.diamondShovelID+9, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Glowstone, "glowstoneDiamondShovel");
        	lavaDiamondShovel = new InfiToolShovel(PHInfiTools.diamondShovelID+10, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Lava, "lavaDiamondShovel");
        	cactusDiamondShovel = new InfiToolShovel(PHInfiTools.diamondShovelID+11, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Cactus, "cactusDiamondShovel");
        	flintDiamondShovel = new InfiToolShovel(PHInfiTools.diamondShovelID+12, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Flint, "flintDiamondShovel");
        	blazeDiamondShovel = new InfiToolShovel(PHInfiTools.diamondShovelID+13, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Blaze, "blazeDiamondShovel");
            copperDiamondShovel = new InfiToolShovel(PHInfiTools.diamondShovelID+14, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Copper, "copperDiamondShovel");
            bronzeDiamondShovel = new InfiToolShovel(PHInfiTools.diamondShovelID+15, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Bronze, "bronzeDiamondShovel");
            workedDiamondShovel = new InfiToolShovel(PHInfiTools.diamondShovelID+16, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.WorkedIron, "workedDiamondShovel");
            steelDiamondShovel = new InfiToolShovel(PHInfiTools.diamondShovelID+17, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Steel, "steelDiamondShovel");
            cobaltDiamondShovel = new InfiToolShovel(PHInfiTools.diamondShovelID+18, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Cobalt, "cobaltDiamondShovel");
            arditeDiamondShovel = new InfiToolShovel(PHInfiTools.diamondShovelID+19, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Ardite, "arditeDiamondShovel");
            manyullynDiamondShovel = new InfiToolShovel(PHInfiTools.diamondShovelID+20, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Manyullyn, "manyullynDiamondShovel");
            uraniumDiamondShovel = new InfiToolShovel(PHInfiTools.diamondShovelID+21, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Uranium, "uraniumDiamondShovel");
            
            if (PHInfiTools.overwriteVanillaTools)
            	MinecraftForge.setToolClass(woodDiamondShovel, "Shovel", InfiMaterialEnum.Diamond.getHarvestLevel());
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
        
        if(PHInfiTools.enableRedstoneTools)
        {
        	woodRedstoneShovel = new InfiToolShovel(PHInfiTools.redstoneShovelID+0, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Wood, "woodRedstoneShovel");
        	stoneRedstoneShovel = new InfiToolShovel(PHInfiTools.redstoneShovelID+1, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Stone, "stoneRedstoneShovel");
        	ironRedstoneShovel = new InfiToolShovel(PHInfiTools.redstoneShovelID+2, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Iron, "ironRedstoneShovel");
        	redstoneRedstoneShovel = new InfiToolShovel(PHInfiTools.redstoneShovelID+3, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Redstone, "redstoneRedstoneShovel");
        	obsidianRedstoneShovel = new InfiToolShovel(PHInfiTools.redstoneShovelID+4, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Obsidian, "obsidianRedstoneShovel");
        	sandstoneRedstoneShovel = new InfiToolShovel(PHInfiTools.redstoneShovelID+5, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Sandstone, "sandstoneRedstoneShovel");
        	boneRedstoneShovel = new InfiToolShovel(PHInfiTools.redstoneShovelID+6, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Bone, "boneRedstoneShovel");
        	paperRedstoneShovel = new InfiToolShovel(PHInfiTools.redstoneShovelID+7, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Paper, "paperRedstoneShovel");
        	mossyRedstoneShovel = new InfiToolShovel(PHInfiTools.redstoneShovelID+8, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Mossy, "mossyRedstoneShovel");
        	netherrackRedstoneShovel = new InfiToolShovel(PHInfiTools.redstoneShovelID+9, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Netherrack, "netherrackRedstoneShovel");
        	glowstoneRedstoneShovel = new InfiToolShovel(PHInfiTools.redstoneShovelID+10, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Glowstone, "glowstoneRedstoneShovel");
        	iceRedstoneShovel = new InfiToolShovel(PHInfiTools.redstoneShovelID+11, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Ice, "iceRedstoneShovel");
        	lavaRedstoneShovel = new InfiToolShovel(PHInfiTools.redstoneShovelID+12,
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Lava, "lavaRedstoneShovel");
        	slimeRedstoneShovel = new InfiToolShovel(PHInfiTools.redstoneShovelID+13,
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Slime, "slimeRedstoneShovel");
        	cactusRedstoneShovel = new InfiToolShovel(PHInfiTools.redstoneShovelID+14,
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Cactus, "cactusRedstoneShovel");
        	flintRedstoneShovel = new InfiToolShovel(PHInfiTools.redstoneShovelID+15,
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Flint, "flintRedstoneShovel");
        	copperRedstoneShovel = new InfiToolShovel(PHInfiTools.redstoneShovelID+16,
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Copper, "copperRedstoneShovel");
        	bronzeRedstoneShovel = new InfiToolShovel(PHInfiTools.redstoneShovelID+17,
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Bronze, "bronzeRedstoneShovel");
        	workedRedstoneShovel = new InfiToolShovel(PHInfiTools.redstoneShovelID+18,
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.WorkedIron, "workedRedstoneShovel");
        	uraniumRedstoneShovel = new InfiToolShovel(PHInfiTools.redstoneShovelID+19,
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Uranium, "uraniumRedstoneShovel");
            
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
        
        if(PHInfiTools.enableObsidianTools)
        {
        	woodObsidianShovel = new InfiToolShovel(PHInfiTools.obsidianShovelID+0, 
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Wood, "woodObsidianShovel");
        	stoneObsidianShovel = new InfiToolShovel(PHInfiTools.obsidianShovelID+1, 
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Stone, "stoneObsidianShovel");
        	redstoneObsidianShovel = new InfiToolShovel(PHInfiTools.obsidianShovelID+2, 
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Redstone, "redstoneObsidianShovel");
        	obsidianObsidianShovel = new InfiToolShovel(PHInfiTools.obsidianShovelID+3, 
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Obsidian, "obsidianObsidianShovel");;
        	boneObsidianShovel = new InfiToolShovel(PHInfiTools.obsidianShovelID+4, 
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Bone, "boneObsidianShovel");
        	netherrackObsidianShovel = new InfiToolShovel(PHInfiTools.obsidianShovelID+5, 
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Netherrack, "netherrackObsidianShovel");
        	glowstoneObsidianShovel = new InfiToolShovel(PHInfiTools.obsidianShovelID+6, 
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Glowstone, "glowstoneObsidianShovel");
        	iceObsidianShovel = new InfiToolShovel(PHInfiTools.obsidianShovelID+7, 
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Ice, "iceObsidianShovel");
        	lavaObsidianShovel = new InfiToolShovel(PHInfiTools.obsidianShovelID+8,
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Lava, "lavaObsidianShovel");
        	cactusObsidianShovel = new InfiToolShovel(PHInfiTools.obsidianShovelID+9,
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Cactus, "cactusObsidianShovel");
            
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
        
        if(PHInfiTools.enableSandstoneTools)
        {
        	woodSandstoneShovel = new InfiToolShovel(PHInfiTools.sandstoneShovelID+0, 
                    InfiMaterialEnum.Sandstone, InfiMaterialEnum.Wood, "woodSandstoneShovel");
        	sandstoneSandstoneShovel = new InfiToolShovel(PHInfiTools.sandstoneShovelID+1, 
                    InfiMaterialEnum.Sandstone, InfiMaterialEnum.Sandstone, "sandstoneSandstoneShovel");
        	boneSandstoneShovel = new InfiToolShovel(PHInfiTools.sandstoneShovelID+2, 
                    InfiMaterialEnum.Sandstone, InfiMaterialEnum.Bone, "boneSandstoneShovel");
        	netherrackSandstoneShovel = new InfiToolShovel(PHInfiTools.sandstoneShovelID+3, 
                    InfiMaterialEnum.Sandstone, InfiMaterialEnum.Netherrack, "netherrackSandstoneShovel");
        	iceSandstoneShovel = new InfiToolShovel(PHInfiTools.sandstoneShovelID+4, 
                    InfiMaterialEnum.Sandstone, InfiMaterialEnum.Ice, "iceSandstoneShovel");
        	slimeSandstoneShovel = new InfiToolShovel(PHInfiTools.sandstoneShovelID+5,
                    InfiMaterialEnum.Sandstone, InfiMaterialEnum.Slime, "slimeSandstoneShovel");
        	cactusSandstoneShovel = new InfiToolShovel(PHInfiTools.sandstoneShovelID+6,
                    InfiMaterialEnum.Sandstone, InfiMaterialEnum.Cactus, "cactusSandstoneShovel");
        	flintSandstoneShovel = new InfiToolShovel(PHInfiTools.sandstoneShovelID+7,
                    InfiMaterialEnum.Sandstone, InfiMaterialEnum.Flint, "flintSandstoneShovel");
            
            MinecraftForge.setToolClass(woodSandstoneShovel, "Shovel", InfiMaterialEnum.Sandstone.getHarvestLevel());
            MinecraftForge.setToolClass(sandstoneSandstoneShovel, "Shovel", InfiMaterialEnum.Sandstone.getHarvestLevel());
            MinecraftForge.setToolClass(boneSandstoneShovel, "Shovel", InfiMaterialEnum.Sandstone.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackSandstoneShovel, "Shovel", InfiMaterialEnum.Sandstone.getHarvestLevel());
            MinecraftForge.setToolClass(iceSandstoneShovel, "Shovel", InfiMaterialEnum.Sandstone.getHarvestLevel());
            MinecraftForge.setToolClass(slimeSandstoneShovel, "Shovel", InfiMaterialEnum.Sandstone.getHarvestLevel());
            MinecraftForge.setToolClass(cactusSandstoneShovel, "Shovel", InfiMaterialEnum.Sandstone.getHarvestLevel());
            MinecraftForge.setToolClass(flintSandstoneShovel, "Shovel", InfiMaterialEnum.Sandstone.getHarvestLevel());
        }
        
        if(PHInfiTools.enableBoneTools)
        {
        	woodBoneShovel = new InfiToolShovel(PHInfiTools.boneShovelID+0, 
                    InfiMaterialEnum.Bone, InfiMaterialEnum.Wood, "woodBoneShovel");
        	stoneBoneShovel = new InfiToolShovel(PHInfiTools.boneShovelID+1, 
                    InfiMaterialEnum.Bone, InfiMaterialEnum.Stone, "stoneBoneShovel");
        	sandstoneBoneShovel = new InfiToolShovel(PHInfiTools.boneShovelID+2, 
                    InfiMaterialEnum.Bone, InfiMaterialEnum.Sandstone, "sandstoneBoneShovel");
        	boneBoneShovel = new InfiToolShovel(PHInfiTools.boneShovelID+3, 
                    InfiMaterialEnum.Bone, InfiMaterialEnum.Bone, "boneBoneShovel");
        	paperBoneShovel = new InfiToolShovel(PHInfiTools.boneShovelID+4, 
                    InfiMaterialEnum.Bone, InfiMaterialEnum.Paper, "paperBoneShovel");
        	netherrackBoneShovel = new InfiToolShovel(PHInfiTools.boneShovelID+5, 
                    InfiMaterialEnum.Bone, InfiMaterialEnum.Netherrack, "netherrackBoneShovel");
        	iceBoneShovel = new InfiToolShovel(PHInfiTools.boneShovelID+6, 
                    InfiMaterialEnum.Bone, InfiMaterialEnum.Ice, "iceBoneShovel");
        	cactusBoneShovel = new InfiToolShovel(PHInfiTools.boneShovelID+7,
                    InfiMaterialEnum.Bone, InfiMaterialEnum.Cactus, "cactusBoneShovel");
        	flintBoneShovel = new InfiToolShovel(PHInfiTools.boneShovelID+8,
                    InfiMaterialEnum.Bone, InfiMaterialEnum.Flint, "flintBoneShovel");
            
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
        
        if(PHInfiTools.enablePaperTools)
        {
        	woodPaperShovel = new InfiToolShovel(PHInfiTools.paperShovelID+0, 
                    InfiMaterialEnum.Paper, InfiMaterialEnum.Wood, "woodPaperShovel");
        	bonePaperShovel = new InfiToolShovel(PHInfiTools.paperShovelID+1, 
                    InfiMaterialEnum.Paper, InfiMaterialEnum.Bone, "bonePaperShovel");
        	paperPaperShovel = new InfiToolShovel(PHInfiTools.paperShovelID+2, 
                    InfiMaterialEnum.Paper, InfiMaterialEnum.Paper, "paperPaperShovel");
        	slimePaperShovel = new InfiToolShovel(PHInfiTools.paperShovelID+3,
                    InfiMaterialEnum.Paper, InfiMaterialEnum.Slime, "slimePaperShovel");
        	cactusPaperShovel = new InfiToolShovel(PHInfiTools.paperShovelID+4,
                    InfiMaterialEnum.Paper, InfiMaterialEnum.Cactus, "cactusPaperShovel");
            
            MinecraftForge.setToolClass(woodPaperShovel, "Shovel", InfiMaterialEnum.Paper.getHarvestLevel());
            MinecraftForge.setToolClass(bonePaperShovel, "Shovel", InfiMaterialEnum.Paper.getHarvestLevel());
            MinecraftForge.setToolClass(paperPaperShovel, "Shovel", InfiMaterialEnum.Paper.getHarvestLevel());
            MinecraftForge.setToolClass(slimePaperShovel, "Shovel", InfiMaterialEnum.Paper.getHarvestLevel());
            MinecraftForge.setToolClass(cactusPaperShovel, "Shovel", InfiMaterialEnum.Paper.getHarvestLevel());
        }
        
        if(PHInfiTools.enableMossyTools)
        {
        	woodMossyShovel = new InfiToolShovel(PHInfiTools.mossyShovelID+0, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Wood, "woodMossyShovel");
        	stoneMossyShovel = new InfiToolShovel(PHInfiTools.mossyShovelID+1, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Stone, "stoneMossyShovel");
        	diamondMossyShovel = new InfiToolShovel(PHInfiTools.mossyShovelID+2, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Diamond, "diamondMossyShovel");
        	redstoneMossyShovel = new InfiToolShovel(PHInfiTools.mossyShovelID+3, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Redstone, "redstoneMossyShovel");
        	boneMossyShovel = new InfiToolShovel(PHInfiTools.mossyShovelID+4, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Bone, "boneMossyShovel");
        	mossyMossyShovel = new InfiToolShovel(PHInfiTools.mossyShovelID+5, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Mossy, "mossyMossyShovel");
        	netherrackMossyShovel = new InfiToolShovel(PHInfiTools.mossyShovelID+6, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Netherrack, "netherrackMossyShovel");
        	glowstoneMossyShovel = new InfiToolShovel(PHInfiTools.mossyShovelID+7, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Glowstone, "glowstoneMossyShovel");
        	cactusMossyShovel = new InfiToolShovel(PHInfiTools.mossyShovelID+8, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Cactus, "cactusMossyShovel");
        	blazeMossyShovel = new InfiToolShovel(PHInfiTools.mossyShovelID+9, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Blaze, "blazeMossyShovel");
        	manyullynMossyShovel = new InfiToolShovel(PHInfiTools.mossyShovelID+10, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Manyullyn, "manyullynMossyShovel");
        	uraniumMossyShovel = new InfiToolShovel(PHInfiTools.mossyShovelID+11, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Uranium, "uraniumMossyShovel");
            
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
        
        if(PHInfiTools.enableNetherrackTools)
        {
        	woodNetherrackShovel = new InfiToolShovel(PHInfiTools.netherrackShovelID+0, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Wood, "woodNetherrackShovel");
        	stoneNetherrackShovel = new InfiToolShovel(PHInfiTools.netherrackShovelID+1, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Stone, "stoneNetherrackShovel");
        	sandstoneNetherrackShovel = new InfiToolShovel(PHInfiTools.netherrackShovelID+2, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Sandstone, "sandstoneNetherrackShovel");
        	boneNetherrackShovel = new InfiToolShovel(PHInfiTools.netherrackShovelID+3, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Bone, "boneNetherrackShovel");
        	paperNetherrackShovel = new InfiToolShovel(PHInfiTools.netherrackShovelID+4, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Paper, "paperNetherrackShovel");
        	mossyNetherrackShovel = new InfiToolShovel(PHInfiTools.netherrackShovelID+5, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Mossy, "mossyNetherrackShovel");
        	netherrackNetherrackShovel = new InfiToolShovel(PHInfiTools.netherrackShovelID+6, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Netherrack, "netherrackNetherrackShovel");
        	iceNetherrackShovel = new InfiToolShovel(PHInfiTools.netherrackShovelID+7, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Ice, "iceNetherrackShovel");
        	slimeNetherrackShovel = new InfiToolShovel(PHInfiTools.netherrackShovelID+8, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Slime, "slimeNetherrackShovel");
        	cactusNetherrackShovel = new InfiToolShovel(PHInfiTools.netherrackShovelID+9, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Cactus, "cactusNetherrackShovel");
        	flintNetherrackShovel = new InfiToolShovel(PHInfiTools.netherrackShovelID+10, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Flint, "flintNetherrackShovel");
        	copperNetherrackShovel = new InfiToolShovel(PHInfiTools.netherrackShovelID+11, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Copper, "copperNetherrackShovel");
        	bronzeNetherrackShovel = new InfiToolShovel(PHInfiTools.netherrackShovelID+12, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Bronze, "bronzeNetherrackShovel");
            
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
        
        if(PHInfiTools.enableGlowstoneTools)
        {
        	woodGlowstoneShovel = new InfiToolShovel(PHInfiTools.glowstoneShovelID+0, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Wood, "woodGlowstoneShovel");
        	redstoneGlowstoneShovel = new InfiToolShovel(PHInfiTools.glowstoneShovelID+1, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Redstone, "redstoneGlowstoneShovel");
        	obsidianGlowstoneShovel = new InfiToolShovel(PHInfiTools.glowstoneShovelID+2, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Obsidian, "obsidianGlowstoneShovel");
        	boneGlowstoneShovel = new InfiToolShovel(PHInfiTools.glowstoneShovelID+3, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Bone, "boneGlowstoneShovel");
        	netherrackGlowstoneShovel = new InfiToolShovel(PHInfiTools.glowstoneShovelID+4, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Netherrack, "netherrackGlowstoneShovel");
        	glowstoneGlowstoneShovel = new InfiToolShovel(PHInfiTools.glowstoneShovelID+5, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Glowstone, "glowstoneGlowstoneShovel");
        	iceGlowstoneShovel = new InfiToolShovel(PHInfiTools.glowstoneShovelID+6, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Ice, "iceGlowstoneShovel");
        	slimeGlowstoneShovel = new InfiToolShovel(PHInfiTools.glowstoneShovelID+7, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Slime, "slimeGlowstoneShovel");
        	cactusGlowstoneShovel = new InfiToolShovel(PHInfiTools.glowstoneShovelID+8, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Cactus, "cactusGlowstoneShovel");
            
            
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
        
        if(PHInfiTools.enableIceTools)
        {
        	woodIceShovel = new InfiToolShovel(PHInfiTools.iceShovelID+0, 
                    InfiMaterialEnum.Ice, InfiMaterialEnum.Wood, "woodIceShovel");
        	boneIceShovel = new InfiToolShovel(PHInfiTools.iceShovelID+1, 
                    InfiMaterialEnum.Ice, InfiMaterialEnum.Bone, "boneIceShovel");
        	paperIceShovel = new InfiToolShovel(PHInfiTools.iceShovelID+2, 
                    InfiMaterialEnum.Ice, InfiMaterialEnum.Paper, "paperIceShovel");
        	iceIceShovel = new InfiToolShovel(PHInfiTools.iceShovelID+3, 
                    InfiMaterialEnum.Ice, InfiMaterialEnum.Ice, "iceIceShovel");
        	slimeIceShovel = new InfiToolShovel(PHInfiTools.iceShovelID+4, 
                    InfiMaterialEnum.Ice, InfiMaterialEnum.Slime, "slimeIceShovel");
        	cactusIceShovel = new InfiToolShovel(PHInfiTools.iceShovelID+5, 
                    InfiMaterialEnum.Ice, InfiMaterialEnum.Cactus, "cactusIceShovel");
            
            
            MinecraftForge.setToolClass(woodIceShovel, "Shovel", InfiMaterialEnum.Ice.getHarvestLevel());
            MinecraftForge.setToolClass(boneIceShovel, "Shovel", InfiMaterialEnum.Ice.getHarvestLevel());
            MinecraftForge.setToolClass(paperIceShovel, "Shovel", InfiMaterialEnum.Ice.getHarvestLevel());
            MinecraftForge.setToolClass(iceIceShovel, "Shovel", InfiMaterialEnum.Ice.getHarvestLevel());
            MinecraftForge.setToolClass(slimeIceShovel, "Shovel", InfiMaterialEnum.Ice.getHarvestLevel());
            MinecraftForge.setToolClass(cactusIceShovel, "Shovel", InfiMaterialEnum.Ice.getHarvestLevel());
        }
        
        if(PHInfiTools.enableLavaTools)
        {
        	diamondLavaShovel = new InfiToolShovel(PHInfiTools.lavaShovelID+0, 
                    InfiMaterialEnum.Lava, InfiMaterialEnum.Diamond, "diamondLavaShovel");
        	obsidianLavaShovel = new InfiToolShovel(PHInfiTools.lavaShovelID+1, 
                    InfiMaterialEnum.Lava, InfiMaterialEnum.Obsidian, "obsidianLavaShovel");
        	netherrackLavaShovel = new InfiToolShovel(PHInfiTools.lavaShovelID+2, 
                    InfiMaterialEnum.Lava, InfiMaterialEnum.Netherrack, "netherrackLavaShovel");
        	lavaLavaShovel = new InfiToolShovel(PHInfiTools.lavaShovelID+3, 
                    InfiMaterialEnum.Lava, InfiMaterialEnum.Lava, "lavaLavaShovel");
        	flintLavaShovel = new InfiToolShovel(PHInfiTools.lavaShovelID+4, 
                    InfiMaterialEnum.Lava, InfiMaterialEnum.Flint, "flintLavaShovel");
        	blazeLavaShovel = new InfiToolShovel(PHInfiTools.lavaShovelID+5, 
                    InfiMaterialEnum.Lava, InfiMaterialEnum.Blaze, "blazeLavaShovel");
        	manyullynLavaShovel = new InfiToolShovel(PHInfiTools.lavaShovelID+6, 
                    InfiMaterialEnum.Lava, InfiMaterialEnum.Manyullyn, "manyullynLavaShovel");
            uraniumLavaShovel = new InfiToolShovel(PHInfiTools.lavaShovelID+7, 
                    InfiMaterialEnum.Lava, InfiMaterialEnum.Uranium, "uraniumLavaShovel");
            
            MinecraftForge.setToolClass(diamondLavaShovel, "Shovel", InfiMaterialEnum.Lava.getHarvestLevel());
            MinecraftForge.setToolClass(obsidianLavaShovel, "Shovel", InfiMaterialEnum.Lava.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackLavaShovel, "Shovel", InfiMaterialEnum.Lava.getHarvestLevel());
            MinecraftForge.setToolClass(lavaLavaShovel, "Shovel", InfiMaterialEnum.Lava.getHarvestLevel());
            MinecraftForge.setToolClass(flintLavaShovel, "Shovel", InfiMaterialEnum.Lava.getHarvestLevel());
            MinecraftForge.setToolClass(blazeLavaShovel, "Shovel", InfiMaterialEnum.Lava.getHarvestLevel());
            MinecraftForge.setToolClass(manyullynLavaShovel, "Shovel", InfiMaterialEnum.Lava.getHarvestLevel());
            MinecraftForge.setToolClass(uraniumLavaShovel, "Shovel", InfiMaterialEnum.Lava.getHarvestLevel());
        }
        
        if(PHInfiTools.enableSlimeTools)
        {
        	woodSlimeShovel = new InfiToolShovel(PHInfiTools.slimeShovelID+0, 
                    InfiMaterialEnum.Slime, InfiMaterialEnum.Wood, "woodSlimeShovel");
        	sandstoneSlimeShovel = new InfiToolShovel(PHInfiTools.slimeShovelID+1, 
                    InfiMaterialEnum.Slime, InfiMaterialEnum.Sandstone, "sandstoneSlimeShovel");
        	boneSlimeShovel = new InfiToolShovel(PHInfiTools.slimeShovelID+2, 
                    InfiMaterialEnum.Slime, InfiMaterialEnum.Bone, "boneSlimeShovel");
        	paperSlimeShovel = new InfiToolShovel(PHInfiTools.slimeShovelID+3, 
                    InfiMaterialEnum.Slime, InfiMaterialEnum.Paper, "paperSlimeShovel");
        	slimeSlimeShovel = new InfiToolShovel(PHInfiTools.slimeShovelID+4, 
                    InfiMaterialEnum.Slime, InfiMaterialEnum.Slime, "slimeSlimeShovel");
        	cactusSlimeShovel = new InfiToolShovel(PHInfiTools.slimeShovelID+5, 
                    InfiMaterialEnum.Slime, InfiMaterialEnum.Cactus, "cactusSlimeShovel");
            
            MinecraftForge.setToolClass(woodSlimeShovel, "Shovel", InfiMaterialEnum.Slime.getHarvestLevel());
            MinecraftForge.setToolClass(sandstoneSlimeShovel, "Shovel", InfiMaterialEnum.Slime.getHarvestLevel());
            MinecraftForge.setToolClass(boneSlimeShovel, "Shovel", InfiMaterialEnum.Slime.getHarvestLevel());
            MinecraftForge.setToolClass(paperSlimeShovel, "Shovel", InfiMaterialEnum.Slime.getHarvestLevel());
            MinecraftForge.setToolClass(slimeSlimeShovel, "Shovel", InfiMaterialEnum.Slime.getHarvestLevel());
            MinecraftForge.setToolClass(cactusSlimeShovel, "Shovel", InfiMaterialEnum.Slime.getHarvestLevel());
        }
        
        if(PHInfiTools.enableCactusTools)
        {
        	woodCactusShovel = new InfiToolShovel(PHInfiTools.cactusShovelID+0, 
                    InfiMaterialEnum.Cactus, InfiMaterialEnum.Wood, "woodCactusShovel");
        	sandstoneCactusShovel = new InfiToolShovel(PHInfiTools.cactusShovelID+1, 
                    InfiMaterialEnum.Cactus, InfiMaterialEnum.Sandstone, "sandstoneCactusShovel");
        	boneCactusShovel = new InfiToolShovel(PHInfiTools.cactusShovelID+2, 
                    InfiMaterialEnum.Cactus, InfiMaterialEnum.Bone, "boneCactusShovel");
        	netherrackCactusShovel = new InfiToolShovel(PHInfiTools.cactusShovelID+3, 
                    InfiMaterialEnum.Cactus, InfiMaterialEnum.Netherrack, "netherrackCactusShovel");
        	iceCactusShovel = new InfiToolShovel(PHInfiTools.cactusShovelID+4, 
                    InfiMaterialEnum.Cactus, InfiMaterialEnum.Ice, "iceCactusShovel");
        	slimeCactusShovel = new InfiToolShovel(PHInfiTools.cactusShovelID+5, 
                    InfiMaterialEnum.Cactus, InfiMaterialEnum.Slime, "slimeCactusShovel");
        	cactusCactusShovel = new InfiToolShovel(PHInfiTools.cactusShovelID+6, 
                    InfiMaterialEnum.Cactus, InfiMaterialEnum.Cactus, "cactusCactusShovel");
            
            MinecraftForge.setToolClass(woodCactusShovel, "Shovel", InfiMaterialEnum.Cactus.getHarvestLevel());
            MinecraftForge.setToolClass(sandstoneCactusShovel, "Shovel", InfiMaterialEnum.Cactus.getHarvestLevel());
            MinecraftForge.setToolClass(boneCactusShovel, "Shovel", InfiMaterialEnum.Cactus.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackCactusShovel, "Shovel", InfiMaterialEnum.Cactus.getHarvestLevel());
            MinecraftForge.setToolClass(iceCactusShovel, "Shovel", InfiMaterialEnum.Cactus.getHarvestLevel());
            MinecraftForge.setToolClass(slimeCactusShovel, "Shovel", InfiMaterialEnum.Cactus.getHarvestLevel());
            MinecraftForge.setToolClass(cactusCactusShovel, "Shovel", InfiMaterialEnum.Cactus.getHarvestLevel());
        }
        
        if(PHInfiTools.enableFlintTools)
        {
        	woodFlintShovel = new InfiToolShovel(PHInfiTools.flintShovelID+0, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Wood, "woodFlintShovel");
        	stoneFlintShovel = new InfiToolShovel(PHInfiTools.flintShovelID+1, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Stone, "stoneFlintShovel");
        	sandstoneFlintShovel = new InfiToolShovel(PHInfiTools.flintShovelID+2, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Sandstone, "sandstoneFlintShovel");
        	boneFlintShovel = new InfiToolShovel(PHInfiTools.flintShovelID+3, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Bone, "boneFlintShovel");
        	netherrackFlintShovel = new InfiToolShovel(PHInfiTools.flintShovelID+4, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Netherrack, "netherrackFlintShovel");
        	slimeFlintShovel = new InfiToolShovel(PHInfiTools.flintShovelID+5, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Slime, "slimeFlintShovel");
        	cactusFlintShovel = new InfiToolShovel(PHInfiTools.flintShovelID+6, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Cactus, "cactusFlintShovel");
        	flintFlintShovel = new InfiToolShovel(PHInfiTools.flintShovelID+7, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Flint, "flintFlintShovel");
        	copperFlintShovel = new InfiToolShovel(PHInfiTools.flintShovelID+8, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Copper, "copperFlintShovel");
        	bronzeFlintShovel = new InfiToolShovel(PHInfiTools.flintShovelID+9, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Bronze, "bronzeFlintShovel");
            
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
        
        if(PHInfiTools.enableBlazeTools)
        {
        	diamondBlazeShovel = new InfiToolShovel(PHInfiTools.blazeShovelID+0, 
                    InfiMaterialEnum.Blaze, InfiMaterialEnum.Diamond, "diamondBlazeShovel");
        	obsidianBlazeShovel = new InfiToolShovel(PHInfiTools.blazeShovelID+1, 
                    InfiMaterialEnum.Blaze, InfiMaterialEnum.Obsidian, "obsidianBlazeShovel");
        	netherrackBlazeShovel = new InfiToolShovel(PHInfiTools.blazeShovelID+2, 
                    InfiMaterialEnum.Blaze, InfiMaterialEnum.Netherrack, "netherrackBlazeShovel");
        	lavaBlazeShovel = new InfiToolShovel(PHInfiTools.blazeShovelID+3, 
                    InfiMaterialEnum.Blaze, InfiMaterialEnum.Lava, "lavaBlazeShovel");
        	flintBlazeShovel = new InfiToolShovel(PHInfiTools.blazeShovelID+4, 
                    InfiMaterialEnum.Blaze, InfiMaterialEnum.Flint, "flintBlazeShovel");
        	blazeBlazeShovel = new InfiToolShovel(PHInfiTools.blazeShovelID+5, 
                    InfiMaterialEnum.Blaze, InfiMaterialEnum.Blaze, "blazeBlazeShovel");
        	manyullynBlazeShovel = new InfiToolShovel(PHInfiTools.blazeShovelID+6, 
                    InfiMaterialEnum.Blaze, InfiMaterialEnum.Manyullyn, "manyullynBlazeShovel");
            uraniumBlazeShovel = new InfiToolShovel(PHInfiTools.blazeShovelID+7, 
                    InfiMaterialEnum.Blaze, InfiMaterialEnum.Uranium, "uraniumBlazeShovel");
            
            MinecraftForge.setToolClass(diamondBlazeShovel, "Shovel", InfiMaterialEnum.Blaze.getHarvestLevel());
            MinecraftForge.setToolClass(obsidianBlazeShovel, "Shovel", InfiMaterialEnum.Blaze.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackBlazeShovel, "Shovel", InfiMaterialEnum.Blaze.getHarvestLevel());
            MinecraftForge.setToolClass(blazeBlazeShovel, "Shovel", InfiMaterialEnum.Blaze.getHarvestLevel());
            MinecraftForge.setToolClass(flintBlazeShovel, "Shovel", InfiMaterialEnum.Blaze.getHarvestLevel());
            MinecraftForge.setToolClass(blazeBlazeShovel, "Shovel", InfiMaterialEnum.Blaze.getHarvestLevel());
            MinecraftForge.setToolClass(manyullynBlazeShovel, "Shovel", InfiMaterialEnum.Blaze.getHarvestLevel());
            MinecraftForge.setToolClass(uraniumBlazeShovel, "Shovel", InfiMaterialEnum.Blaze.getHarvestLevel());
        }
    	
        if(PHInfiTools.enableCopperTools)
        {
        	woodCopperShovel = new InfiToolShovel(PHInfiTools.copperShovelID+0, 
                    InfiMaterialEnum.Copper, InfiMaterialEnum.Wood, "woodCopperShovel");
            stoneCopperShovel = new InfiToolShovel(PHInfiTools.copperShovelID+1, 
                    InfiMaterialEnum.Copper, InfiMaterialEnum.Stone, "stoneCopperShovel");
            boneCopperShovel = new InfiToolShovel(PHInfiTools.copperShovelID+2, 
                    InfiMaterialEnum.Copper, InfiMaterialEnum.Bone, "boneCopperShovel");
            netherrackCopperShovel = new InfiToolShovel(PHInfiTools.copperShovelID+3, 
                    InfiMaterialEnum.Copper, InfiMaterialEnum.Netherrack, "netherrackCopperShovel");
            slimeCopperShovel = new InfiToolShovel(PHInfiTools.copperShovelID+4, 
                    InfiMaterialEnum.Copper, InfiMaterialEnum.Slime, "slimeCopperShovel");
            cactusCopperShovel = new InfiToolShovel(PHInfiTools.copperShovelID+5, 
                    InfiMaterialEnum.Copper, InfiMaterialEnum.Cactus, "cactusCopperShovel");
            flintCopperShovel = new InfiToolShovel(PHInfiTools.copperShovelID+6, 
                    InfiMaterialEnum.Copper, InfiMaterialEnum.Flint, "flintCopperShovel");
            copperCopperShovel = new InfiToolShovel(PHInfiTools.copperShovelID+7, 
                    InfiMaterialEnum.Copper, InfiMaterialEnum.Copper, "copperCopperShovel");
            
            MinecraftForge.setToolClass(woodCopperShovel, "Shovel", InfiMaterialEnum.Copper.getHarvestLevel());
        	MinecraftForge.setToolClass(stoneCopperShovel, "Shovel", InfiMaterialEnum.Copper.getHarvestLevel());
            MinecraftForge.setToolClass(boneCopperShovel, "Shovel", InfiMaterialEnum.Copper.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackCopperShovel, "Shovel", InfiMaterialEnum.Copper.getHarvestLevel());
            MinecraftForge.setToolClass(slimeCopperShovel, "Shovel", InfiMaterialEnum.Copper.getHarvestLevel());
            MinecraftForge.setToolClass(cactusCopperShovel, "Shovel", InfiMaterialEnum.Copper.getHarvestLevel());
            MinecraftForge.setToolClass(flintCopperShovel, "Shovel", InfiMaterialEnum.Copper.getHarvestLevel());
            MinecraftForge.setToolClass(copperCopperShovel, "Shovel", InfiMaterialEnum.Copper.getHarvestLevel());
        }
        
        if(PHInfiTools.enableBronzeTools)
        {
        	woodBronzeShovel = new InfiToolShovel(PHInfiTools.bronzeShovelID+0, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Wood, "woodBronzeShovel");
            stoneBronzeShovel = new InfiToolShovel(PHInfiTools.bronzeShovelID+1, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Stone, "stoneBronzeShovel");
            boneBronzeShovel = new InfiToolShovel(PHInfiTools.bronzeShovelID+2, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Bone, "boneBronzeShovel");
            netherrackBronzeShovel = new InfiToolShovel(PHInfiTools.bronzeShovelID+3, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Netherrack, "netherrackBronzeShovel");
            slimeBronzeShovel = new InfiToolShovel(PHInfiTools.bronzeShovelID+4, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Slime, "slimeBronzeShovel");
            cactusBronzeShovel = new InfiToolShovel(PHInfiTools.bronzeShovelID+5, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Cactus, "cactusBronzeShovel");
            flintBronzeShovel = new InfiToolShovel(PHInfiTools.bronzeShovelID+6, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Flint, "flintBronzeShovel");
            copperBronzeShovel = new InfiToolShovel(PHInfiTools.bronzeShovelID+7, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Copper, "copperBronzeShovel");
            bronzeBronzeShovel = new InfiToolShovel(PHInfiTools.bronzeShovelID+8, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Bronze, "bronzeBronzeShovel");
            
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
        
        if(PHInfiTools.enableWorkedIronTools)
        {
        	woodWorkedIronShovel = new InfiToolShovel(PHInfiTools.workedIronShovelID+0, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Wood, "woodWorkedIronShovel");
            stoneWorkedIronShovel = new InfiToolShovel(PHInfiTools.workedIronShovelID+1, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Stone, "stoneWorkedIronShovel");
            ironWorkedIronShovel = new InfiToolShovel(PHInfiTools.workedIronShovelID+2,
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Iron, "ironWorkedIronShovel");
            diamondWorkedIronShovel = new InfiToolShovel(PHInfiTools.workedIronShovelID+3, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Diamond, "diamondWorkedIronShovel");
            redstoneWorkedIronShovel = new InfiToolShovel(PHInfiTools.workedIronShovelID+4, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Redstone, "redstoneWorkedIronShovel");
            obsidianWorkedIronShovel = new InfiToolShovel(PHInfiTools.workedIronShovelID+5, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Obsidian, "obsidianWorkedIronShovel");
            boneWorkedIronShovel = new InfiToolShovel(PHInfiTools.workedIronShovelID+6, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Bone, "boneWorkedIronShovel");
            netherrackWorkedIronShovel = new InfiToolShovel(PHInfiTools.workedIronShovelID+7, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Netherrack, "netherrackWorkedIronShovel");
            glowstoneWorkedIronShovel = new InfiToolShovel(PHInfiTools.workedIronShovelID+8, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Glowstone, "glowstoneWorkedIronShovel");
            iceWorkedIronShovel = new InfiToolShovel(PHInfiTools.workedIronShovelID+9, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Ice, "iceWorkedIronShovel");
            slimeWorkedIronShovel = new InfiToolShovel(PHInfiTools.workedIronShovelID+10, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Slime, "slimeWorkedIronShovel");
            cactusWorkedIronShovel = new InfiToolShovel(PHInfiTools.workedIronShovelID+11, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Cactus, "cactusWorkedIronShovel");
            blazeWorkedIronShovel = new InfiToolShovel(PHInfiTools.workedIronShovelID+12, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Blaze, "blazeWorkedIronShovel");
            copperWorkedIronShovel = new InfiToolShovel(PHInfiTools.workedIronShovelID+13, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Copper, "copperWorkedIronShovel");
            bronzeWorkedIronShovel = new InfiToolShovel(PHInfiTools.workedIronShovelID+14, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Bronze, "bronzeWorkedIronShovel");
            workedWorkedIronShovel = new InfiToolShovel(PHInfiTools.workedIronShovelID+15, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.WorkedIron, "workedWorkedIronShovel");
            steelWorkedIronShovel = new InfiToolShovel(PHInfiTools.workedIronShovelID+16, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Steel, "steelWorkedIronShovel");
            uraniumWorkedIronShovel = new InfiToolShovel(PHInfiTools.workedIronShovelID+17, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Uranium, "uraniumWorkedIronShovel");
            
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
        
        if(PHInfiTools.enableSteelTools)
        {
        	woodSteelShovel = new InfiToolShovel(PHInfiTools.steelShovelID+0, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Wood, "woodSteelShovel");
            stoneSteelShovel = new InfiToolShovel(PHInfiTools.steelShovelID+1, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Stone, "stoneSteelShovel");
            ironSteelShovel = new InfiToolShovel(PHInfiTools.steelShovelID+2, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Iron, "ironSteelShovel");
            diamondSteelShovel = new InfiToolShovel(PHInfiTools.steelShovelID+3, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Diamond, "diamondSteelShovel");
            redstoneSteelShovel = new InfiToolShovel(PHInfiTools.steelShovelID+4, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Redstone, "redstoneSteelShovel");
            obsidianSteelShovel = new InfiToolShovel(PHInfiTools.steelShovelID+5, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Obsidian, "obsidianSteelShovel");
            boneSteelShovel = new InfiToolShovel(PHInfiTools.steelShovelID+6, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Bone, "boneSteelShovel");
            netherrackSteelShovel = new InfiToolShovel(PHInfiTools.steelShovelID+7, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Netherrack, "netherrackSteelShovel");
            glowstoneSteelShovel = new InfiToolShovel(PHInfiTools.steelShovelID+8, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Glowstone, "glowstoneSteelShovel");
            iceSteelShovel = new InfiToolShovel(PHInfiTools.steelShovelID+9, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Ice, "iceSteelShovel");
            slimeSteelShovel = new InfiToolShovel(PHInfiTools.steelShovelID+10, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Slime, "slimeSteelShovel");
            cactusSteelShovel = new InfiToolShovel(PHInfiTools.steelShovelID+11, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Cactus, "cactusSteelShovel");
            blazeSteelShovel = new InfiToolShovel(PHInfiTools.steelShovelID+12, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Blaze, "blazeSteelShovel");
            copperSteelShovel = new InfiToolShovel(PHInfiTools.steelShovelID+13, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Copper, "copperSteelShovel");
            bronzeSteelShovel = new InfiToolShovel(PHInfiTools.steelShovelID+14, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Bronze, "bronzeSteelShovel");
            workedSteelShovel = new InfiToolShovel(PHInfiTools.steelShovelID+15, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.WorkedIron, "workedSteelShovel");
            steelSteelShovel = new InfiToolShovel(PHInfiTools.steelShovelID+16, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Steel, "steelSteelShovel");
            cobaltSteelShovel = new InfiToolShovel(PHInfiTools.steelShovelID+17, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Cobalt, "cobaltSteelShovel");
            arditeSteelShovel = new InfiToolShovel(PHInfiTools.steelShovelID+18, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Ardite, "arditeSteelShovel");
            uraniumSteelShovel = new InfiToolShovel(PHInfiTools.steelShovelID+19, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Uranium, "uraniumSteelShovel");

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
        
        if(PHInfiTools.enableCobaltTools)
        {
        	woodCobaltShovel = new InfiToolShovel(PHInfiTools.cobaltShovelID+0, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Wood, "woodCobaltShovel");
            stoneCobaltShovel = new InfiToolShovel(PHInfiTools.cobaltShovelID+1, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Stone, "stoneCobaltShovel");
            ironCobaltShovel = new InfiToolShovel(PHInfiTools.cobaltShovelID+2, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Iron, "ironCobaltShovel");
            diamondCobaltShovel = new InfiToolShovel(PHInfiTools.cobaltShovelID+3,
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Diamond, "diamondCobaltShovel");
            redstoneCobaltShovel = new InfiToolShovel(PHInfiTools.cobaltShovelID+4, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Redstone, "redstoneCobaltShovel");
            obsidianCobaltShovel = new InfiToolShovel(PHInfiTools.cobaltShovelID+5, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Obsidian, "obsidianCobaltShovel");
            boneCobaltShovel = new InfiToolShovel(PHInfiTools.cobaltShovelID+6, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Bone, "boneCobaltShovel");
            slimeCobaltShovel = new InfiToolShovel(PHInfiTools.cobaltShovelID+7, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Slime, "slimeCobaltShovel");
            cactusCobaltShovel = new InfiToolShovel(PHInfiTools.cobaltShovelID+8, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Cactus, "cactusCobaltShovel");
            blazeCobaltShovel = new InfiToolShovel(PHInfiTools.cobaltShovelID+9, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Blaze, "blazeCobaltShovel");
            copperCobaltShovel = new InfiToolShovel(PHInfiTools.cobaltShovelID+10, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Copper, "copperCobaltShovel");
            bronzeCobaltShovel = new InfiToolShovel(PHInfiTools.cobaltShovelID+11, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Bronze, "bronzeCobaltShovel");
            workedCobaltShovel = new InfiToolShovel(PHInfiTools.cobaltShovelID+12, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.WorkedIron, "workedCobaltShovel");
            steelCobaltShovel = new InfiToolShovel(PHInfiTools.cobaltShovelID+13, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Steel, "steelCobaltShovel");
            cobaltCobaltShovel = new InfiToolShovel(PHInfiTools.cobaltShovelID+14, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Cobalt, "cobaltCobaltShovel");
            arditeCobaltShovel = new InfiToolShovel(PHInfiTools.cobaltShovelID+15, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Ardite, "arditeCobaltShovel");
            manyullynCobaltShovel = new InfiToolShovel(PHInfiTools.cobaltShovelID+16, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Manyullyn, "manyullynCobaltShovel");
            uraniumCobaltShovel = new InfiToolShovel(PHInfiTools.cobaltShovelID+17, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Uranium, "uraniumCobaltShovel");
            
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
        
        if(PHInfiTools.enableArditeTools)
        {
        	woodArditeShovel = new InfiToolShovel(PHInfiTools.arditeShovelID+0, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Wood, "woodArditeShovel");
            stoneArditeShovel = new InfiToolShovel(PHInfiTools.arditeShovelID+1, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Stone, "stoneArditeShovel");
            ironArditeShovel = new InfiToolShovel(PHInfiTools.arditeShovelID+2, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Iron, "ironArditeShovel");
            diamondArditeShovel = new InfiToolShovel(PHInfiTools.arditeShovelID+3,
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Diamond, "diamondArditeShovel");
            redstoneArditeShovel = new InfiToolShovel(PHInfiTools.arditeShovelID+4, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Redstone, "redstoneArditeShovel");
            obsidianArditeShovel = new InfiToolShovel(PHInfiTools.arditeShovelID+5, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Obsidian, "obsidianArditeShovel");
            boneArditeShovel = new InfiToolShovel(PHInfiTools.arditeShovelID+6,
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Bone, "boneArditeShovel");
            slimeArditeShovel = new InfiToolShovel(PHInfiTools.arditeShovelID+7, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Slime, "slimeArditeShovel");
            cactusArditeShovel = new InfiToolShovel(PHInfiTools.arditeShovelID+8, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Cactus, "cactusArditeShovel");
            blazeArditeShovel = new InfiToolShovel(PHInfiTools.arditeShovelID+9, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Blaze, "blazeArditeShovel");
            copperArditeShovel = new InfiToolShovel(PHInfiTools.arditeShovelID+10, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Copper, "copperArditeShovel");
            bronzeArditeShovel = new InfiToolShovel(PHInfiTools.arditeShovelID+11, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Bronze, "bronzeArditeShovel");
            workedArditeShovel = new InfiToolShovel(PHInfiTools.arditeShovelID+12, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.WorkedIron, "workedArditeShovel");
            steelArditeShovel = new InfiToolShovel(PHInfiTools.arditeShovelID+13, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Steel, "steelArditeShovel");
            cobaltArditeShovel = new InfiToolShovel(PHInfiTools.arditeShovelID+14, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Cobalt, "cobaltArditeShovel");
            arditeArditeShovel = new InfiToolShovel(PHInfiTools.arditeShovelID+15, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Ardite, "arditeArditeShovel");
            manyullynArditeShovel = new InfiToolShovel(PHInfiTools.arditeShovelID+16, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Manyullyn, "manyullynArditeShovel");
            uraniumArditeShovel = new InfiToolShovel(PHInfiTools.arditeShovelID+17, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Uranium, "uraniumArditeShovel");
            
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
        
        if(PHInfiTools.enableManyullynTools)
        {
        	woodManyullynShovel = new InfiToolShovel(PHInfiTools.manyullynShovelID+0, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Wood, "woodManyullynShovel");
            stoneManyullynShovel = new InfiToolShovel(PHInfiTools.manyullynShovelID+1, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Stone, "stoneManyullynShovel");
            ironManyullynShovel = new InfiToolShovel(PHInfiTools.manyullynShovelID+2, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Iron, "ironManyullynShovel");
            diamondManyullynShovel = new InfiToolShovel(PHInfiTools.manyullynShovelID+3,
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Diamond, "diamondManyullynShovel");
            redstoneManyullynShovel = new InfiToolShovel(PHInfiTools.manyullynShovelID+4, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Redstone, "redstoneManyullynShovel");
            obsidianManyullynShovel = new InfiToolShovel(PHInfiTools.manyullynShovelID+5, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Obsidian, "obsidianManyullynShovel");
            boneManyullynShovel = new InfiToolShovel(PHInfiTools.manyullynShovelID+6, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Bone, "boneManyullynShovel");
            slimeManyullynShovel = new InfiToolShovel(PHInfiTools.manyullynShovelID+7, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Slime, "slimeManyullynShovel");
            cactusManyullynShovel = new InfiToolShovel(PHInfiTools.manyullynShovelID+8, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Cactus, "cactusManyullynShovel");
            blazeManyullynShovel = new InfiToolShovel(PHInfiTools.manyullynShovelID+9, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Blaze, "blazeManyullynShovel");
            copperManyullynShovel = new InfiToolShovel(PHInfiTools.manyullynShovelID+10, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Copper, "copperManyullynShovel");
            bronzeManyullynShovel = new InfiToolShovel(PHInfiTools.manyullynShovelID+11, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Bronze, "bronzeManyullynShovel");
            workedManyullynShovel = new InfiToolShovel(PHInfiTools.manyullynShovelID+12, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.WorkedIron, "workedManyullynShovel");
            steelManyullynShovel = new InfiToolShovel(PHInfiTools.manyullynShovelID+13, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Steel, "steelManyullynShovel");
            cobaltManyullynShovel = new InfiToolShovel(PHInfiTools.manyullynShovelID+14, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Cobalt, "cobaltManyullynShovel");
            arditeManyullynShovel = new InfiToolShovel(PHInfiTools.manyullynShovelID+15, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Ardite, "arditeManyullynShovel");
            manyullynManyullynShovel = new InfiToolShovel(PHInfiTools.manyullynShovelID+16, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Manyullyn, "manyullynManyullynShovel");
            uraniumManyullynShovel = new InfiToolShovel(PHInfiTools.manyullynShovelID+17,
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Uranium, "uraniumManyullynShovel");
            
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
        
        if(PHInfiTools.enableUraniumTools)
        {
            diamondUraniumShovel = new InfiToolShovel(PHInfiTools.uraniumShovelID+0, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Diamond, "diamondUraniumShovel");
            redstoneUraniumShovel = new InfiToolShovel(PHInfiTools.uraniumShovelID+1, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Redstone, "redstoneUraniumShovel");
            boneUraniumShovel = new InfiToolShovel(PHInfiTools.uraniumShovelID+2, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Bone, "boneUraniumShovel");
            netherrackUraniumShovel = new InfiToolShovel(PHInfiTools.uraniumShovelID+3, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Netherrack, "netherrackUraniumShovel");
            glowstoneUraniumShovel = new InfiToolShovel(PHInfiTools.uraniumShovelID+4, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Glowstone, "glowstoneUraniumShovel");
            lavaUraniumShovel = new InfiToolShovel(PHInfiTools.uraniumShovelID+5, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Lava, "lavaUraniumShovel");
            blazeUraniumShovel = new InfiToolShovel(PHInfiTools.uraniumShovelID+6, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Blaze, "blazeUraniumShovel");
            cobaltUraniumShovel = new InfiToolShovel(PHInfiTools.uraniumShovelID+7, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Cobalt, "cobaltUraniumShovel");
            arditeUraniumShovel = new InfiToolShovel(PHInfiTools.uraniumShovelID+8, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Ardite, "arditeUraniumShovel");
            uraniumUraniumShovel = new InfiToolShovel(PHInfiTools.uraniumShovelID+9, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Uranium, "uraniumUraniumShovel");
            
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
    	if(PHInfiTools.enableWoodTools && PHInfiTools.overwriteVanillaTools)
            ModLoader.addName(woodWoodShovel, "Wooden Shovel");
        if(PHInfiTools.enableStoneTools)
            ModLoader.addName(stoneStoneShovel, "Heavy Shovel");
        if(PHInfiTools.enableIronTools)
            ModLoader.addName(ironIronShovel, "Ironic Shovel");
        if(PHInfiTools.enableDiamondTools)
            ModLoader.addName(diamondDiamondShovel, "Diamondium Shovel");
        if(PHInfiTools.enableRedstoneTools)
            ModLoader.addName(redstoneRedstoneShovel, "Redredred Shovel");
        if(PHInfiTools.enableObsidianTools)
            ModLoader.addName(obsidianObsidianShovel, "Ebony Shovel");
        if(PHInfiTools.enableSandstoneTools)
            ModLoader.addName(sandstoneSandstoneShovel, "Fragile Shovel");
        if(PHInfiTools.enableNetherrackTools)
            ModLoader.addName(boneBoneShovel, "Necrotic Shovel");
        if(PHInfiTools.enablePaperTools)
            ModLoader.addName(paperPaperShovel, "Soft Shovel");
        if(PHInfiTools.enableMossyTools)
            ModLoader.addName(mossyMossyShovel, "Living Shovel");
        if(PHInfiTools.enableNetherrackTools)
            ModLoader.addName(netherrackNetherrackShovel, "Bloodsoaked Shovel");
        if(PHInfiTools.enableGlowstoneTools)
            ModLoader.addName(glowstoneGlowstoneShovel, "Bright Shovel");
        if(PHInfiTools.enableIceTools)
            ModLoader.addName(iceIceShovel, "Freezing Shovel");
        if(PHInfiTools.enableLavaTools)
            ModLoader.addName(lavaLavaShovel, "Burning Shovel");
        if(PHInfiTools.enableSlimeTools)
            ModLoader.addName(slimeSlimeShovel, "Toy Shovel");
        if(PHInfiTools.enableCactusTools)
            ModLoader.addName(cactusCactusShovel, "Thorned Shovel");
        if(PHInfiTools.enableFlintTools)
            ModLoader.addName(flintFlintShovel, "Rough-hewn Shovel");
        if(PHInfiTools.enableBlazeTools)
            ModLoader.addName(blazeBlazeShovel, "Netherite Shovel");
        if(PHInfiTools.enableCopperTools)
            ModLoader.addName(copperCopperShovel, "Orange-Tang Shovel");
        if(PHInfiTools.enableBronzeTools)
            ModLoader.addName(bronzeBronzeShovel, "Polished Shovel");
        if(PHInfiTools.enableWorkedIronTools)
            ModLoader.addName(workedWorkedIronShovel, "Reworked Iron Shovel");
        if(PHInfiTools.enableSteelTools)
            ModLoader.addName(steelSteelShovel, "Forge-Wrought Shovel");
        if(PHInfiTools.enableCobaltTools)
            ModLoader.addName(cobaltCobaltShovel, "Beautiful Shovel");
        if(PHInfiTools.enableArditeTools)
            ModLoader.addName(arditeArditeShovel, "Rustic Shovel");
        if(PHInfiTools.enableManyullynTools)
            ModLoader.addName(manyullynManyullynShovel, "False-Prophetic Shovel");
        if(PHInfiTools.enableUraniumTools)
            ModLoader.addName(uraniumUraniumShovel, "Cancerous Shovel");
    }
    
    public static void registerInfiToolsRecipes()
    {
    	if(PHInfiTools.enableWoodTools)
        {
    		if (PHInfiTools.overwriteVanillaTools)
    			ModLoader.addRecipe(new ItemStack(woodWoodShovel), recipe, '#', Block.planks, '|', Item.stick );
            ModLoader.addRecipe(new ItemStack(sandstoneWoodShovel), new Object[] 
                    { recipe, '#', Block.planks, '|', InfiLibrary.sandstoneRod });
            ModLoader.addRecipe(new ItemStack(boneWoodShovel), new Object[] 
                    { recipe, '#', Block.planks, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneWoodShovel), new Object[] 
                    { recipe, '#', Block.planks, '|', InfiLibrary.boneRod });
            ModLoader.addRecipe(new ItemStack(paperWoodShovel), new Object[] 
                    { recipe, '#', Block.planks, '|', InfiLibrary.paperRod });
            ModLoader.addRecipe(new ItemStack(iceWoodShovel), new Object[] 
                    { recipe, '#', Block.planks, '|', InfiLibrary.iceRod });
            ModLoader.addRecipe(new ItemStack(slimeWoodShovel), new Object[] 
                    { recipe, '#', Block.planks, '|', InfiLibrary.slimeRod });
            ModLoader.addRecipe(new ItemStack(cactusWoodShovel), new Object[] 
                    { recipe, '#', Block.planks, '|', InfiLibrary.cactusRod });
        }
    	
        if(PHInfiTools.enableStoneTools)
        {
        	if (PHInfiTools.overwriteVanillaTools)
        		ModLoader.addRecipe(new ItemStack(woodStoneShovel), recipe, '#', Block.cobblestone, '|', Item.stick );
        	ModLoader.addRecipe(new ItemStack(stoneStoneShovel), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', InfiLibrary.stoneRod });
            ModLoader.addRecipe(new ItemStack(sandstoneStoneShovel), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', InfiLibrary.sandstoneRod });
            ModLoader.addRecipe(new ItemStack(boneStoneShovel), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneStoneShovel), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', InfiLibrary.boneRod });
            ModLoader.addRecipe(new ItemStack(netherrackStoneShovel), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', InfiLibrary.netherrackRod });
            ModLoader.addRecipe(new ItemStack(iceStoneShovel), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', InfiLibrary.iceRod });
            ModLoader.addRecipe(new ItemStack(slimeStoneShovel), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', InfiLibrary.slimeRod });
            ModLoader.addRecipe(new ItemStack(cactusStoneShovel), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', InfiLibrary.cactusRod });
            ModLoader.addRecipe(new ItemStack(flintStoneShovel), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', InfiLibrary.flintRod });
            
            if (PHInfiTools.overwriteVanillaTools)
            	ModLoader.addRecipe(new ItemStack(woodStoneShovel), recipe, '#', Block.stone, '|', Item.stick );
        	ModLoader.addRecipe(new ItemStack(stoneStoneShovel), new Object[] 
                    { recipe, '#', Block.stone, '|', InfiLibrary.stoneRod });
            ModLoader.addRecipe(new ItemStack(sandstoneStoneShovel), new Object[] 
                    { recipe, '#', Block.stone, '|', InfiLibrary.sandstoneRod });
            ModLoader.addRecipe(new ItemStack(boneStoneShovel), new Object[] 
                    { recipe, '#', Block.stone, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneStoneShovel), new Object[] 
                    { recipe, '#', Block.stone, '|', InfiLibrary.boneRod });
            ModLoader.addRecipe(new ItemStack(netherrackStoneShovel), new Object[] 
                    { recipe, '#', Block.stone, '|', InfiLibrary.netherrackRod });
            ModLoader.addRecipe(new ItemStack(iceStoneShovel), new Object[] 
                    { recipe, '#', Block.stone, '|', InfiLibrary.iceRod });
            ModLoader.addRecipe(new ItemStack(slimeStoneShovel), new Object[] 
                    { recipe, '#', Block.stone, '|', InfiLibrary.slimeRod });
            ModLoader.addRecipe(new ItemStack(cactusStoneShovel), new Object[] 
                    { recipe, '#', Block.stone, '|', InfiLibrary.cactusRod });
            ModLoader.addRecipe(new ItemStack(flintStoneShovel), new Object[] 
                    { recipe, '#', Block.stone, '|', InfiLibrary.flintRod });
        }
        
        if(PHInfiTools.enableIronTools)
        {
        	if (PHInfiTools.overwriteVanillaTools)
        		ModLoader.addRecipe(new ItemStack(woodIronShovel), recipe, '#', Item.ingotIron, '|', Item.stick );
        	ModLoader.addRecipe(new ItemStack(stoneIronShovel), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', InfiLibrary.stoneRod });
            ModLoader.addRecipe(new ItemStack(ironIronShovel), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', InfiLibrary.ironRod });
            ModLoader.addRecipe(new ItemStack(boneIronShovel), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneIronShovel), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', InfiLibrary.boneRod });
            ModLoader.addRecipe(new ItemStack(netherrackIronShovel), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', InfiLibrary.netherrackRod });
            ModLoader.addRecipe(new ItemStack(glowstoneIronShovel), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', InfiLibrary.glowstoneRod });
            ModLoader.addRecipe(new ItemStack(cactusIronShovel), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', InfiLibrary.cactusRod });
            ModLoader.addRecipe(new ItemStack(copperIronShovel), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', InfiLibrary.copperRod });
            ModLoader.addRecipe(new ItemStack(bronzeIronShovel), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', InfiLibrary.bronzeRod });
        }
        
        if(PHInfiTools.enableDiamondTools)
        {
        	if (PHInfiTools.overwriteVanillaTools)
        		ModLoader.addRecipe(new ItemStack(woodDiamondShovel), recipe, '#', Item.diamond, '|', Item.stick );
        	ModLoader.addRecipe(new ItemStack(stoneDiamondShovel), new Object[] 
                    { recipe, '#', Item.diamond, '|', InfiLibrary.stoneRod });
            ModLoader.addRecipe(new ItemStack(ironDiamondShovel), new Object[] 
                    { recipe, '#', Item.diamond, '|', InfiLibrary.ironRod });
            ModLoader.addRecipe(new ItemStack(diamondDiamondShovel), new Object[] 
                    { recipe, '#', Item.diamond, '|', InfiLibrary.diamondRod });
            ModLoader.addRecipe(new ItemStack(redstoneDiamondShovel), new Object[] 
                    { recipe, '#', Item.diamond, '|', InfiLibrary.redstoneRod });
            ModLoader.addRecipe(new ItemStack(obsidianDiamondShovel), new Object[] 
                    { recipe, '#', Item.diamond, '|', InfiLibrary.obsidianRod });
            ModLoader.addRecipe(new ItemStack(boneDiamondShovel), new Object[] 
                    { recipe, '#', Item.diamond, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneDiamondShovel), new Object[] 
                    { recipe, '#', Item.diamond, '|', InfiLibrary.boneRod });
            ModLoader.addRecipe(new ItemStack(mossyDiamondShovel), new Object[] 
                    { recipe, '#', Item.diamond, '|', InfiLibrary.mossyRod });
            ModLoader.addRecipe(new ItemStack(netherrackDiamondShovel), new Object[] 
                    { recipe, '#', Item.diamond, '|', InfiLibrary.netherrackRod });
            ModLoader.addRecipe(new ItemStack(glowstoneDiamondShovel), new Object[] 
                    { recipe, '#', Item.diamond, '|', InfiLibrary.glowstoneRod });
            ModLoader.addRecipe(new ItemStack(lavaDiamondShovel), new Object[] 
                    { recipe, '#', Item.diamond, '|', InfiLibrary.lavaRod });
            ModLoader.addRecipe(new ItemStack(cactusDiamondShovel), new Object[] 
                    { recipe, '#', Item.diamond, '|', InfiLibrary.cactusRod });
            ModLoader.addRecipe(new ItemStack(flintDiamondShovel), new Object[] 
                    { recipe, '#', Item.diamond, '|', InfiLibrary.flintRod });
            ModLoader.addRecipe(new ItemStack(blazeDiamondShovel), new Object[] 
                    { recipe, '#', Item.diamond, '|', Item.blazeRod });
            ModLoader.addRecipe(new ItemStack(copperDiamondShovel), new Object[] 
                    { recipe, '#', Item.diamond, '|', InfiLibrary.copperRod });
            ModLoader.addRecipe(new ItemStack(bronzeDiamondShovel), new Object[] 
                    { recipe, '#', Item.diamond, '|', InfiLibrary.bronzeRod });
            ModLoader.addRecipe(new ItemStack(workedDiamondShovel), new Object[] 
                    { recipe, '#', Item.diamond, '|', InfiLibrary.workedIronRod });
            ModLoader.addRecipe(new ItemStack(steelDiamondShovel), new Object[] 
                    { recipe, '#', Item.diamond, '|', InfiLibrary.steelRod });
            ModLoader.addRecipe(new ItemStack(cobaltDiamondShovel), new Object[] 
                    { recipe, '#', Item.diamond, '|', InfiLibrary.cobaltRod });
            ModLoader.addRecipe(new ItemStack(arditeDiamondShovel), new Object[] 
                    { recipe, '#', Item.diamond, '|', InfiLibrary.arditeRod });
            ModLoader.addRecipe(new ItemStack(manyullynDiamondShovel), new Object[] 
                    { recipe, '#', Item.diamond, '|', InfiLibrary.manyullynRod });
            ModLoader.addRecipe(new ItemStack(uraniumDiamondShovel), new Object[] 
                    { recipe, '#', Item.diamond, '|', InfiLibrary.uraniumRod });
        }
        
        if(PHInfiTools.enableRedstoneTools)
        {
        	ModLoader.addRecipe(new ItemStack(woodRedstoneShovel), new Object[] 
                    { recipe, '#', InfiLibrary.redstoneCrystal, '|', Item.stick });
        	ModLoader.addRecipe(new ItemStack(stoneRedstoneShovel), new Object[] 
                    { recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.stoneRod });
            ModLoader.addRecipe(new ItemStack(ironRedstoneShovel), new Object[] 
                    { recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.ironRod });
            ModLoader.addRecipe(new ItemStack(redstoneRedstoneShovel), new Object[] 
                    { recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.redstoneRod });
            ModLoader.addRecipe(new ItemStack(obsidianRedstoneShovel), new Object[] 
                    { recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.obsidianRod });
            ModLoader.addRecipe(new ItemStack(sandstoneRedstoneShovel), new Object[] 
                    { recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.sandstoneRod });
            ModLoader.addRecipe(new ItemStack(boneRedstoneShovel), new Object[] 
                    { recipe, '#', InfiLibrary.redstoneCrystal, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneRedstoneShovel), new Object[] 
                    { recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.boneRod });
            ModLoader.addRecipe(new ItemStack(paperRedstoneShovel), new Object[] 
                    { recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.paperRod });
            ModLoader.addRecipe(new ItemStack(mossyRedstoneShovel), new Object[] 
                    { recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.mossyRod });
            ModLoader.addRecipe(new ItemStack(netherrackRedstoneShovel), new Object[] 
                    { recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.netherrackRod });
            ModLoader.addRecipe(new ItemStack(glowstoneRedstoneShovel), new Object[] 
                    { recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.glowstoneRod });
            ModLoader.addRecipe(new ItemStack(iceRedstoneShovel), new Object[] 
                    { recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.iceRod });
            ModLoader.addRecipe(new ItemStack(lavaRedstoneShovel), new Object[] 
                    { recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.lavaRod });
            ModLoader.addRecipe(new ItemStack(slimeRedstoneShovel), new Object[] 
                    { recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.slimeRod });
            ModLoader.addRecipe(new ItemStack(cactusRedstoneShovel), new Object[] 
                    { recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.cactusRod });
            ModLoader.addRecipe(new ItemStack(flintRedstoneShovel), new Object[] 
                    { recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.flintRod });
            ModLoader.addRecipe(new ItemStack(copperRedstoneShovel), new Object[] 
                    { recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.copperRod });
            ModLoader.addRecipe(new ItemStack(bronzeRedstoneShovel), new Object[] 
                    { recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.bronzeRod });
            ModLoader.addRecipe(new ItemStack(workedRedstoneShovel), new Object[] 
                    { recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.workedIronRod });
            ModLoader.addRecipe(new ItemStack(uraniumRedstoneShovel), new Object[] 
                    { recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.uraniumRod });
        }
        
        if(PHInfiTools.enableObsidianTools)
        {
        	ModLoader.addRecipe(new ItemStack(woodObsidianShovel), new Object[] 
                    { recipe, '#', Block.obsidian, '|', Item.stick });
        	ModLoader.addRecipe(new ItemStack(stoneObsidianShovel), new Object[] 
                    { recipe, '#', Block.obsidian, '|', InfiLibrary.stoneRod });
            ModLoader.addRecipe(new ItemStack(redstoneObsidianShovel), new Object[] 
                    { recipe, '#', Block.obsidian, '|', InfiLibrary.redstoneRod });
            ModLoader.addRecipe(new ItemStack(obsidianObsidianShovel), new Object[] 
                    { recipe, '#', Block.obsidian, '|', InfiLibrary.obsidianRod });
            ModLoader.addRecipe(new ItemStack(boneObsidianShovel), new Object[] 
                    { recipe, '#', Block.obsidian, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneObsidianShovel), new Object[] 
                    { recipe, '#', Block.obsidian, '|', InfiLibrary.boneRod });
            ModLoader.addRecipe(new ItemStack(netherrackObsidianShovel), new Object[] 
                    { recipe, '#', Block.obsidian, '|', InfiLibrary.netherrackRod });
            ModLoader.addRecipe(new ItemStack(glowstoneObsidianShovel), new Object[] 
                    { recipe, '#', Block.obsidian, '|', InfiLibrary.glowstoneRod });
            ModLoader.addRecipe(new ItemStack(iceObsidianShovel), new Object[] 
                    { recipe, '#', Block.obsidian, '|', InfiLibrary.iceRod });
            ModLoader.addRecipe(new ItemStack(lavaObsidianShovel), new Object[] 
                    { recipe, '#', Block.obsidian, '|', InfiLibrary.lavaRod });
            ModLoader.addRecipe(new ItemStack(cactusObsidianShovel), new Object[] 
                    { recipe, '#', Block.obsidian, '|', InfiLibrary.cactusRod });
        }
        
        if(PHInfiTools.enableSandstoneTools)
        {
            ModLoader.addRecipe(new ItemStack(woodSandstoneShovel), new Object[] 
                    { recipe, '#', Block.sandStone, '|', Item.stick });
            ModLoader.addRecipe(new ItemStack(sandstoneSandstoneShovel), new Object[] 
                    { recipe, '#', Block.sandStone, '|', InfiLibrary.sandstoneRod });
            ModLoader.addRecipe(new ItemStack(boneSandstoneShovel), new Object[] 
                    { recipe, '#', Block.sandStone, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneSandstoneShovel), new Object[] 
                    { recipe, '#', Block.sandStone, '|', InfiLibrary.boneRod });      
            ModLoader.addRecipe(new ItemStack(netherrackSandstoneShovel), new Object[] 
                    { recipe, '#', Block.sandStone, '|', InfiLibrary.netherrackRod });
            ModLoader.addRecipe(new ItemStack(iceSandstoneShovel), new Object[] 
                    { recipe, '#', Block.sandStone, '|', InfiLibrary.iceRod });
            ModLoader.addRecipe(new ItemStack(slimeSandstoneShovel), new Object[] 
                    { recipe, '#', Block.sandStone, '|', InfiLibrary.slimeRod });
            ModLoader.addRecipe(new ItemStack(cactusSandstoneShovel), new Object[] 
                    { recipe, '#', Block.sandStone, '|', InfiLibrary.cactusRod });
            ModLoader.addRecipe(new ItemStack(flintSandstoneShovel), new Object[] 
                    { recipe, '#', Block.sandStone, '|', InfiLibrary.flintRod });
        }
        
        if(PHInfiTools.enableBoneTools)
        {
            ModLoader.addRecipe(new ItemStack(woodBoneShovel), new Object[] 
                    { recipe, '#', Item.bone, '|', Item.stick });
            ModLoader.addRecipe(new ItemStack(stoneBoneShovel), new Object[] 
                    { recipe, '#', Item.bone, '|', InfiLibrary.stoneRod });
            ModLoader.addRecipe(new ItemStack(sandstoneBoneShovel), new Object[] 
                    { recipe, '#', Item.bone, '|', InfiLibrary.sandstoneRod });
            ModLoader.addRecipe(new ItemStack(boneBoneShovel), new Object[] 
                    { recipe, '#', Item.bone, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneBoneShovel), new Object[] 
                    { recipe, '#', Item.bone, '|', InfiLibrary.boneRod });
            ModLoader.addRecipe(new ItemStack(paperBoneShovel), new Object[] 
                    { recipe, '#', Item.bone, '|', InfiLibrary.paperRod });
            ModLoader.addRecipe(new ItemStack(netherrackBoneShovel), new Object[] 
                    { recipe, '#', Item.bone, '|', InfiLibrary.netherrackRod });
            ModLoader.addRecipe(new ItemStack(iceBoneShovel), new Object[] 
                    { recipe, '#', Item.bone, '|', InfiLibrary.iceRod });
            ModLoader.addRecipe(new ItemStack(cactusBoneShovel), new Object[] 
                    { recipe, '#', Item.bone, '|', InfiLibrary.cactusRod });
            ModLoader.addRecipe(new ItemStack(flintBoneShovel), new Object[] 
                    { recipe, '#', Item.bone, '|', InfiLibrary.flintRod });
        }
        
        if(PHInfiTools.enablePaperTools)
        {
            ModLoader.addRecipe(new ItemStack(woodPaperShovel), new Object[] 
                    { recipe, '#', InfiLibrary.paperStack, '|', Item.stick });
            ModLoader.addRecipe(new ItemStack(bonePaperShovel), new Object[] 
                    { recipe, '#', InfiLibrary.paperStack, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(bonePaperShovel), new Object[] 
                    { recipe, '#', InfiLibrary.paperStack, '|', InfiLibrary.boneRod });
            ModLoader.addRecipe(new ItemStack(paperPaperShovel), new Object[] 
                    { recipe, '#', InfiLibrary.paperStack, '|', InfiLibrary.paperRod });
            ModLoader.addRecipe(new ItemStack(slimePaperShovel), new Object[] 
                    { recipe, '#', InfiLibrary.paperStack, '|', InfiLibrary.slimeRod });
            ModLoader.addRecipe(new ItemStack(cactusPaperShovel), new Object[] 
                    { recipe, '#', InfiLibrary.paperStack, '|', InfiLibrary.cactusRod });
        }
        
        if(PHInfiTools.enableMossyTools)
        {
        	ModLoader.addRecipe(new ItemStack(woodMossyShovel), new Object[] 
                    { recipe, '#', InfiLibrary.mossyStone, '|', Item.stick });
        	ModLoader.addRecipe(new ItemStack(stoneMossyShovel), new Object[] 
                    { recipe, '#', InfiLibrary.mossyStone, '|', InfiLibrary.stoneRod });
            ModLoader.addRecipe(new ItemStack(diamondMossyShovel), new Object[] 
                    { recipe, '#', InfiLibrary.mossyStone, '|', InfiLibrary.diamondRod });
            ModLoader.addRecipe(new ItemStack(redstoneMossyShovel), new Object[] 
                    { recipe, '#', InfiLibrary.mossyStone, '|', InfiLibrary.redstoneRod });
            ModLoader.addRecipe(new ItemStack(boneMossyShovel), new Object[] 
                    { recipe, '#', InfiLibrary.mossyStone, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneMossyShovel), new Object[] 
                    { recipe, '#', InfiLibrary.mossyStone, '|', InfiLibrary.boneRod });
            ModLoader.addRecipe(new ItemStack(mossyMossyShovel), new Object[] 
                    { recipe, '#', InfiLibrary.mossyStone, '|', InfiLibrary.mossyRod });
            ModLoader.addRecipe(new ItemStack(netherrackMossyShovel), new Object[] 
                    { recipe, '#', InfiLibrary.mossyStone, '|', InfiLibrary.netherrackRod });
            ModLoader.addRecipe(new ItemStack(glowstoneMossyShovel), new Object[] 
                    { recipe, '#', InfiLibrary.mossyStone, '|', InfiLibrary.glowstoneRod });
            ModLoader.addRecipe(new ItemStack(cactusMossyShovel), new Object[] 
                    { recipe, '#', InfiLibrary.mossyStone, '|', InfiLibrary.cactusRod });
            ModLoader.addRecipe(new ItemStack(blazeMossyShovel), new Object[] 
                    { recipe, '#', InfiLibrary.mossyStone, '|', Item.blazeRod });
            ModLoader.addRecipe(new ItemStack(manyullynMossyShovel), new Object[] 
                    { recipe, '#', InfiLibrary.mossyStone, '|', InfiLibrary.manyullynRod });
            ModLoader.addRecipe(new ItemStack(uraniumMossyShovel), new Object[] 
                    { recipe, '#', InfiLibrary.mossyStone, '|', InfiLibrary.uraniumRod });
        }
        
        if(PHInfiTools.enableNetherrackTools)
        {
        	ModLoader.addRecipe(new ItemStack(woodNetherrackShovel), new Object[] 
                    { recipe, '#', Block.netherrack, '|', Item.stick });
        	ModLoader.addRecipe(new ItemStack(stoneNetherrackShovel), new Object[] 
                    { recipe, '#', Block.netherrack, '|', InfiLibrary.stoneRod });
            ModLoader.addRecipe(new ItemStack(sandstoneNetherrackShovel), new Object[] 
                    { recipe, '#', Block.netherrack, '|', InfiLibrary.sandstoneRod });
            ModLoader.addRecipe(new ItemStack(boneNetherrackShovel), new Object[] 
                    { recipe, '#', Block.netherrack, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneNetherrackShovel), new Object[] 
                    { recipe, '#', Block.netherrack, '|', InfiLibrary.boneRod });
            ModLoader.addRecipe(new ItemStack(paperNetherrackShovel), new Object[] 
                    { recipe, '#', Block.netherrack, '|', InfiLibrary.paperRod });
            ModLoader.addRecipe(new ItemStack(mossyNetherrackShovel), new Object[] 
                    { recipe, '#', Block.netherrack, '|', InfiLibrary.mossyRod });
            ModLoader.addRecipe(new ItemStack(netherrackNetherrackShovel), new Object[] 
                    { recipe, '#', Block.netherrack, '|', InfiLibrary.netherrackRod });
            ModLoader.addRecipe(new ItemStack(iceNetherrackShovel), new Object[] 
                    { recipe, '#', Block.netherrack, '|', InfiLibrary.iceRod });
            ModLoader.addRecipe(new ItemStack(slimeNetherrackShovel), new Object[] 
                    { recipe, '#', Block.netherrack, '|', InfiLibrary.slimeRod });
            ModLoader.addRecipe(new ItemStack(cactusNetherrackShovel), new Object[] 
                    { recipe, '#', Block.netherrack, '|', InfiLibrary.cactusRod });
            ModLoader.addRecipe(new ItemStack(flintNetherrackShovel), new Object[] 
                    { recipe, '#', Block.netherrack, '|', InfiLibrary.flintRod });
            ModLoader.addRecipe(new ItemStack(copperNetherrackShovel), new Object[] 
                    { recipe, '#', Block.netherrack, '|', InfiLibrary.copperRod });
            ModLoader.addRecipe(new ItemStack(bronzeNetherrackShovel), new Object[] 
                    { recipe, '#', Block.netherrack, '|', InfiLibrary.bronzeRod });
        }
        
        if(PHInfiTools.enableGlowstoneTools)
        {
        	ModLoader.addRecipe(new ItemStack(woodGlowstoneShovel), new Object[] 
                    { recipe, '#', InfiLibrary.glowstoneCrystal, '|', Item.stick });
        	ModLoader.addRecipe(new ItemStack(redstoneGlowstoneShovel), new Object[] 
                    { recipe, '#', InfiLibrary.glowstoneCrystal, '|', InfiLibrary.redstoneRod });
        	ModLoader.addRecipe(new ItemStack(obsidianGlowstoneShovel), new Object[] 
                    { recipe, '#', InfiLibrary.glowstoneCrystal, '|', InfiLibrary.obsidianRod });
            ModLoader.addRecipe(new ItemStack(boneGlowstoneShovel), new Object[] 
                    { recipe, '#', InfiLibrary.glowstoneCrystal, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneGlowstoneShovel), new Object[] 
                    { recipe, '#', InfiLibrary.glowstoneCrystal, '|', InfiLibrary.boneRod });
            ModLoader.addRecipe(new ItemStack(netherrackGlowstoneShovel), new Object[] 
                    { recipe, '#', InfiLibrary.glowstoneCrystal, '|', InfiLibrary.netherrackRod });
            ModLoader.addRecipe(new ItemStack(glowstoneGlowstoneShovel), new Object[] 
                    { recipe, '#', InfiLibrary.glowstoneCrystal, '|', InfiLibrary.glowstoneRod });
            ModLoader.addRecipe(new ItemStack(iceGlowstoneShovel), new Object[] 
                    { recipe, '#', InfiLibrary.glowstoneCrystal, '|', InfiLibrary.iceRod });
            ModLoader.addRecipe(new ItemStack(slimeGlowstoneShovel), new Object[] 
                    { recipe, '#', InfiLibrary.glowstoneCrystal, '|', InfiLibrary.slimeRod });
            ModLoader.addRecipe(new ItemStack(cactusGlowstoneShovel), new Object[] 
                    { recipe, '#', InfiLibrary.glowstoneCrystal, '|', InfiLibrary.cactusRod });
        }
        
        if(PHInfiTools.enableIceTools)
        {
            ModLoader.addRecipe(new ItemStack(woodIceShovel), new Object[] 
                    { recipe, '#', Block.ice, '|', Item.stick });
            ModLoader.addRecipe(new ItemStack(boneIceShovel), new Object[] 
                    { recipe, '#', Block.ice, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneIceShovel), new Object[] 
                    { recipe, '#', Block.ice, '|', InfiLibrary.boneRod });
            ModLoader.addRecipe(new ItemStack(paperIceShovel), new Object[] 
                    { recipe, '#', Block.ice, '|', InfiLibrary.paperRod });
            ModLoader.addRecipe(new ItemStack(iceIceShovel), new Object[] 
                    { recipe, '#', Block.ice, '|', InfiLibrary.iceRod });
            ModLoader.addRecipe(new ItemStack(slimeIceShovel), new Object[] 
                    { recipe, '#', Block.ice, '|', InfiLibrary.slimeRod });
            ModLoader.addRecipe(new ItemStack(cactusIceShovel), new Object[] 
                    { recipe, '#', Block.ice, '|', InfiLibrary.cactusRod });
        }
        
        if(PHInfiTools.enableLavaTools)
        {
            ModLoader.addRecipe(new ItemStack(diamondLavaShovel), new Object[] 
                    { recipe, '#', InfiLibrary.lavaCrystal, '|', InfiLibrary.diamondRod });
            ModLoader.addRecipe(new ItemStack(obsidianLavaShovel), new Object[] 
                    { recipe, '#', InfiLibrary.lavaCrystal, '|', InfiLibrary.obsidianRod });
            ModLoader.addRecipe(new ItemStack(netherrackLavaShovel), new Object[] 
                    { recipe, '#', InfiLibrary.lavaCrystal, '|', InfiLibrary.netherrackRod });
            ModLoader.addRecipe(new ItemStack(lavaLavaShovel), new Object[] 
                    { recipe, '#', InfiLibrary.lavaCrystal, '|', InfiLibrary.lavaRod });
            ModLoader.addRecipe(new ItemStack(flintLavaShovel), new Object[] 
                    { recipe, '#', InfiLibrary.lavaCrystal, '|', InfiLibrary.flintRod });
            ModLoader.addRecipe(new ItemStack(blazeLavaShovel), new Object[] 
                    { recipe, '#', InfiLibrary.lavaCrystal, '|', Item.blazeRod });
            ModLoader.addRecipe(new ItemStack(manyullynLavaShovel), new Object[] 
                    { recipe, '#', InfiLibrary.lavaCrystal, '|', InfiLibrary.manyullynRod });
            ModLoader.addRecipe(new ItemStack(uraniumLavaShovel), new Object[] 
                    { recipe, '#', InfiLibrary.lavaCrystal, '|', InfiLibrary.uraniumRod });
        }
        
        if(PHInfiTools.enableSlimeTools)
        {
            ModLoader.addRecipe(new ItemStack(woodSlimeShovel), new Object[] 
                    { recipe, '#', InfiLibrary.slimeCrystal, '|', Item.stick });
            ModLoader.addRecipe(new ItemStack(sandstoneSlimeShovel), new Object[] 
                    { recipe, '#', InfiLibrary.slimeCrystal, '|', InfiLibrary.sandstoneRod });
            ModLoader.addRecipe(new ItemStack(boneSlimeShovel), new Object[] 
                    { recipe, '#', InfiLibrary.slimeCrystal, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneSlimeShovel), new Object[] 
                    { recipe, '#', InfiLibrary.slimeCrystal, '|', InfiLibrary.boneRod });
            ModLoader.addRecipe(new ItemStack(paperSlimeShovel), new Object[] 
                    { recipe, '#', InfiLibrary.slimeCrystal, '|', InfiLibrary.paperRod });
            ModLoader.addRecipe(new ItemStack(slimeSlimeShovel), new Object[] 
                    { recipe, '#', InfiLibrary.slimeCrystal, '|', InfiLibrary.slimeRod });
            ModLoader.addRecipe(new ItemStack(cactusSlimeShovel), new Object[] 
                    { recipe, '#', InfiLibrary.slimeCrystal, '|', InfiLibrary.cactusRod });
        }
        
        if(PHInfiTools.enableCactusTools)
        {
            ModLoader.addRecipe(new ItemStack(woodCactusShovel), new Object[] 
                    { recipe, '#', Block.cactus, '|', Item.stick });
            ModLoader.addRecipe(new ItemStack(sandstoneCactusShovel), new Object[] 
                    { recipe, '#', Block.cactus, '|', InfiLibrary.sandstoneRod });
            ModLoader.addRecipe(new ItemStack(boneCactusShovel), new Object[] 
                    { recipe, '#', Block.cactus, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneCactusShovel), new Object[] 
                    { recipe, '#', Block.cactus, '|', InfiLibrary.boneRod });
            ModLoader.addRecipe(new ItemStack(netherrackCactusShovel), new Object[] 
                    { recipe, '#', Block.cactus, '|', InfiLibrary.netherrackRod });
            ModLoader.addRecipe(new ItemStack(iceCactusShovel), new Object[] 
                    { recipe, '#', Block.cactus, '|', InfiLibrary.iceRod });
            ModLoader.addRecipe(new ItemStack(slimeCactusShovel), new Object[] 
                    { recipe, '#', Block.cactus, '|', InfiLibrary.slimeRod });
            ModLoader.addRecipe(new ItemStack(cactusCactusShovel), new Object[] 
                    { recipe, '#', Block.cactus, '|', InfiLibrary.cactusRod });
        }
        
        if(PHInfiTools.enableFlintTools)
        {
        	ModLoader.addRecipe(new ItemStack(woodFlintShovel), new Object[] 
                    { recipe, '#', Item.flint, '|', Item.stick });
        	ModLoader.addRecipe(new ItemStack(stoneFlintShovel), new Object[] 
                    { recipe, '#', Item.flint, '|', InfiLibrary.stoneRod });
            ModLoader.addRecipe(new ItemStack(sandstoneFlintShovel), new Object[] 
                    { recipe, '#', Item.flint, '|', InfiLibrary.sandstoneRod });
            ModLoader.addRecipe(new ItemStack(boneFlintShovel), new Object[] 
                    { recipe, '#', Item.flint, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneFlintShovel), new Object[] 
                    { recipe, '#', Item.flint, '|', InfiLibrary.boneRod });
            ModLoader.addRecipe(new ItemStack(netherrackFlintShovel), new Object[] 
                    { recipe, '#', Item.flint, '|', InfiLibrary.netherrackRod });
            ModLoader.addRecipe(new ItemStack(slimeFlintShovel), new Object[] 
                    { recipe, '#', Item.flint, '|', InfiLibrary.slimeRod });
            ModLoader.addRecipe(new ItemStack(cactusFlintShovel), new Object[] 
                    { recipe, '#', Item.flint, '|', InfiLibrary.cactusRod });
            ModLoader.addRecipe(new ItemStack(flintFlintShovel), new Object[] 
                    { recipe, '#', Item.flint, '|', InfiLibrary.flintRod });
            ModLoader.addRecipe(new ItemStack(copperFlintShovel), new Object[] 
                    { recipe, '#', Item.flint, '|', InfiLibrary.copperRod });
            ModLoader.addRecipe(new ItemStack(bronzeFlintShovel), new Object[] 
                    { recipe, '#', Item.flint, '|', InfiLibrary.bronzeRod });
        }
        
        if(PHInfiTools.enableBlazeTools)
        {
            ModLoader.addRecipe(new ItemStack(diamondBlazeShovel), new Object[] 
                    { recipe, '#', InfiLibrary.blazeCrystal, '|', InfiLibrary.diamondRod });
            ModLoader.addRecipe(new ItemStack(obsidianBlazeShovel), new Object[] 
                    { recipe, '#', InfiLibrary.blazeCrystal, '|', InfiLibrary.obsidianRod });
            ModLoader.addRecipe(new ItemStack(netherrackBlazeShovel), new Object[] 
                    { recipe, '#', InfiLibrary.blazeCrystal, '|', InfiLibrary.netherrackRod });
            ModLoader.addRecipe(new ItemStack(lavaBlazeShovel), new Object[] 
                    { recipe, '#', InfiLibrary.blazeCrystal, '|', InfiLibrary.lavaRod });
            ModLoader.addRecipe(new ItemStack(flintBlazeShovel), new Object[] 
                    { recipe, '#', InfiLibrary.blazeCrystal, '|', InfiLibrary.flintRod });
            ModLoader.addRecipe(new ItemStack(blazeBlazeShovel), new Object[] 
                    { recipe, '#', InfiLibrary.blazeCrystal, '|', Item.blazeRod });
            ModLoader.addRecipe(new ItemStack(manyullynBlazeShovel), new Object[] 
                    { recipe, '#', InfiLibrary.blazeCrystal, '|', InfiLibrary.manyullynRod });
            ModLoader.addRecipe(new ItemStack(uraniumBlazeShovel), new Object[] 
                    { recipe, '#', InfiLibrary.blazeCrystal, '|', InfiLibrary.uraniumRod });
        }
    }
    
    public static void addStoneTools(ItemStack stack)
    {
    	ModLoader.addRecipe(new ItemStack(woodStoneShovel), new Object[] 
                { recipe, '#', stack, '|', Item.stick });
    	ModLoader.addRecipe(new ItemStack(stoneStoneShovel), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.stoneRod });
        ModLoader.addRecipe(new ItemStack(sandstoneStoneShovel), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.sandstoneRod });
        ModLoader.addRecipe(new ItemStack(boneStoneShovel), new Object[] 
                { recipe, '#', stack, '|', Item.bone });
        ModLoader.addRecipe(new ItemStack(boneStoneShovel), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.boneRod });
        ModLoader.addRecipe(new ItemStack(netherrackStoneShovel), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.netherrackRod });
        ModLoader.addRecipe(new ItemStack(iceStoneShovel), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.iceRod });
        ModLoader.addRecipe(new ItemStack(slimeStoneShovel), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.slimeRod });
        ModLoader.addRecipe(new ItemStack(cactusStoneShovel), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.cactusRod });
        ModLoader.addRecipe(new ItemStack(flintStoneShovel), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.flintRod });
    }
    
    public static void addCopperTools(ItemStack stack)
    {
    	ModLoader.addRecipe(new ItemStack(woodCopperShovel), new Object[] 
                { recipe, '#', stack, '|', Item.stick });
        ModLoader.addRecipe(new ItemStack(stoneCopperShovel), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.stoneRod });
        ModLoader.addRecipe(new ItemStack(boneCopperShovel), new Object[] 
                { recipe, '#', stack, '|', Item.bone });
        ModLoader.addRecipe(new ItemStack(boneCopperShovel), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.boneRod });
        ModLoader.addRecipe(new ItemStack(netherrackCopperShovel), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.netherrackRod });
        ModLoader.addRecipe(new ItemStack(slimeCopperShovel), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.slimeRod });
        ModLoader.addRecipe(new ItemStack(cactusCopperShovel), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.cactusRod });
        ModLoader.addRecipe(new ItemStack(flintCopperShovel), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.flintRod });
        ModLoader.addRecipe(new ItemStack(copperCopperShovel), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.copperRod });
    }
    
    public static void addBronzeTools(ItemStack stack)
    {
    	ModLoader.addRecipe(new ItemStack(woodBronzeShovel), new Object[] 
                { recipe, '#', stack, '|', Item.stick });
        ModLoader.addRecipe(new ItemStack(stoneBronzeShovel), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.stoneRod });
        ModLoader.addRecipe(new ItemStack(boneBronzeShovel), new Object[] 
                { recipe, '#', stack, '|', Item.bone });
        ModLoader.addRecipe(new ItemStack(boneBronzeShovel), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.boneRod });
        ModLoader.addRecipe(new ItemStack(netherrackBronzeShovel), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.netherrackRod });
        ModLoader.addRecipe(new ItemStack(slimeBronzeShovel), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.slimeRod });
        ModLoader.addRecipe(new ItemStack(cactusBronzeShovel), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.cactusRod });
        ModLoader.addRecipe(new ItemStack(flintBronzeShovel), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.flintRod });
        ModLoader.addRecipe(new ItemStack(copperBronzeShovel), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.copperRod });
        ModLoader.addRecipe(new ItemStack(bronzeBronzeShovel), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.bronzeRod });
    }
    
    public static void addWorkedIronTools(ItemStack stack)
    {
    	ModLoader.addRecipe(new ItemStack(woodWorkedIronShovel), new Object[] 
                { recipe, '#', stack, '|', Item.stick });
        ModLoader.addRecipe(new ItemStack(stoneWorkedIronShovel), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.stoneRod });
        ModLoader.addRecipe(new ItemStack(ironWorkedIronShovel), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.ironRod });
        ModLoader.addRecipe(new ItemStack(diamondWorkedIronShovel), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.diamondRod });
        ModLoader.addRecipe(new ItemStack(redstoneWorkedIronShovel), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.redstoneRod });
        ModLoader.addRecipe(new ItemStack(obsidianWorkedIronShovel), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.obsidianRod });
        ModLoader.addRecipe(new ItemStack(boneWorkedIronShovel), new Object[] 
                { recipe, '#', stack, '|', Item.bone });
        ModLoader.addRecipe(new ItemStack(boneWorkedIronShovel), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.boneRod });
        ModLoader.addRecipe(new ItemStack(netherrackWorkedIronShovel), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.netherrackRod });
        ModLoader.addRecipe(new ItemStack(glowstoneWorkedIronShovel), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.glowstoneRod });
        ModLoader.addRecipe(new ItemStack(iceWorkedIronShovel), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.iceRod });
        ModLoader.addRecipe(new ItemStack(slimeWorkedIronShovel), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.slimeRod });
        ModLoader.addRecipe(new ItemStack(cactusWorkedIronShovel), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.cactusRod });
        ModLoader.addRecipe(new ItemStack(blazeWorkedIronShovel), new Object[] 
                { recipe, '#', stack, '|', Item.blazeRod });
        ModLoader.addRecipe(new ItemStack(copperWorkedIronShovel), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.copperRod });
        ModLoader.addRecipe(new ItemStack(bronzeWorkedIronShovel), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.bronzeRod });
        ModLoader.addRecipe(new ItemStack(workedWorkedIronShovel), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.workedIronRod });
        ModLoader.addRecipe(new ItemStack(steelWorkedIronShovel), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.steelRod });
        ModLoader.addRecipe(new ItemStack(uraniumWorkedIronShovel), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.uraniumRod });
    }
    
    public static void addSteelTools(ItemStack stack)
    {
    	ModLoader.addRecipe(new ItemStack(woodSteelShovel), new Object[] 
                { recipe, '#', stack, '|', Item.stick });
        ModLoader.addRecipe(new ItemStack(stoneSteelShovel), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.stoneRod });
        ModLoader.addRecipe(new ItemStack(ironSteelShovel), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.ironRod });
        ModLoader.addRecipe(new ItemStack(diamondSteelShovel), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.diamondRod });
        ModLoader.addRecipe(new ItemStack(redstoneSteelShovel), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.redstoneRod });
        ModLoader.addRecipe(new ItemStack(obsidianSteelShovel), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.obsidianRod });
        ModLoader.addRecipe(new ItemStack(boneSteelShovel), new Object[] 
                { recipe, '#', stack, '|', Item.bone });
        ModLoader.addRecipe(new ItemStack(boneSteelShovel), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.boneRod });
        ModLoader.addRecipe(new ItemStack(netherrackSteelShovel), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.netherrackRod });
        ModLoader.addRecipe(new ItemStack(glowstoneSteelShovel), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.glowstoneRod });
        ModLoader.addRecipe(new ItemStack(iceSteelShovel), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.iceRod });
        ModLoader.addRecipe(new ItemStack(slimeSteelShovel), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.slimeRod });
        ModLoader.addRecipe(new ItemStack(cactusSteelShovel), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.cactusRod });
        ModLoader.addRecipe(new ItemStack(blazeSteelShovel), new Object[] 
                { recipe, '#', stack, '|', Item.blazeRod });
        ModLoader.addRecipe(new ItemStack(copperSteelShovel), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.copperRod });
        ModLoader.addRecipe(new ItemStack(bronzeSteelShovel), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.bronzeRod });
        ModLoader.addRecipe(new ItemStack(workedSteelShovel), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.workedIronRod });
        ModLoader.addRecipe(new ItemStack(steelSteelShovel), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.steelRod });
        ModLoader.addRecipe(new ItemStack(cobaltSteelShovel), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.cobaltRod });
        ModLoader.addRecipe(new ItemStack(arditeSteelShovel), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.arditeRod });
        ModLoader.addRecipe(new ItemStack(uraniumSteelShovel), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.uraniumRod });
    }
    
    public static void addCobaltTools(ItemStack stack)
    {
    	ModLoader.addRecipe(new ItemStack(woodCobaltShovel), new Object[] 
                { recipe, '#', stack, '|', Item.stick });
        ModLoader.addRecipe(new ItemStack(stoneCobaltShovel), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.stoneRod });
        ModLoader.addRecipe(new ItemStack(ironCobaltShovel), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.ironRod });
        ModLoader.addRecipe(new ItemStack(diamondCobaltShovel), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.diamondRod });
        ModLoader.addRecipe(new ItemStack(redstoneCobaltShovel), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.redstoneRod });
        ModLoader.addRecipe(new ItemStack(obsidianCobaltShovel), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.obsidianRod });
        ModLoader.addRecipe(new ItemStack(boneCobaltShovel), new Object[] 
                { recipe, '#', stack, '|', Item.bone });
        ModLoader.addRecipe(new ItemStack(boneCobaltShovel), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.boneRod });
        ModLoader.addRecipe(new ItemStack(slimeCobaltShovel), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.slimeRod });
        ModLoader.addRecipe(new ItemStack(cactusCobaltShovel), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.cactusRod });
        ModLoader.addRecipe(new ItemStack(blazeCobaltShovel), new Object[] 
                { recipe, '#', stack, '|', Item.blazeRod });
        ModLoader.addRecipe(new ItemStack(copperCobaltShovel), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.copperRod });
        ModLoader.addRecipe(new ItemStack(bronzeCobaltShovel), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.bronzeRod });
        ModLoader.addRecipe(new ItemStack(workedCobaltShovel), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.workedIronRod });
        ModLoader.addRecipe(new ItemStack(steelCobaltShovel), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.steelRod });
        ModLoader.addRecipe(new ItemStack(cobaltCobaltShovel), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.cobaltRod });
        ModLoader.addRecipe(new ItemStack(arditeCobaltShovel), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.arditeRod });
        ModLoader.addRecipe(new ItemStack(manyullynCobaltShovel), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.manyullynRod });
        ModLoader.addRecipe(new ItemStack(uraniumCobaltShovel), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.uraniumRod });
    }
    
    public static void addArditeTools(ItemStack stack)
    {
    	ModLoader.addRecipe(new ItemStack(woodArditeShovel), new Object[] 
                { recipe, '#', stack, '|', Item.stick });
        ModLoader.addRecipe(new ItemStack(stoneArditeShovel), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.stoneRod });
        ModLoader.addRecipe(new ItemStack(ironArditeShovel), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.ironRod });
        ModLoader.addRecipe(new ItemStack(diamondArditeShovel), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.diamondRod });
        ModLoader.addRecipe(new ItemStack(redstoneArditeShovel), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.redstoneRod });
        ModLoader.addRecipe(new ItemStack(obsidianArditeShovel), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.obsidianRod });
        ModLoader.addRecipe(new ItemStack(boneArditeShovel), new Object[] 
                { recipe, '#', stack, '|', Item.bone });
        ModLoader.addRecipe(new ItemStack(boneArditeShovel), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.boneRod });
        ModLoader.addRecipe(new ItemStack(slimeArditeShovel), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.slimeRod });
        ModLoader.addRecipe(new ItemStack(cactusArditeShovel), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.cactusRod });
        ModLoader.addRecipe(new ItemStack(blazeArditeShovel), new Object[] 
                { recipe, '#', stack, '|', Item.blazeRod });
        ModLoader.addRecipe(new ItemStack(copperArditeShovel), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.copperRod });
        ModLoader.addRecipe(new ItemStack(bronzeArditeShovel), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.bronzeRod });
        ModLoader.addRecipe(new ItemStack(workedArditeShovel), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.workedIronRod });
        ModLoader.addRecipe(new ItemStack(steelArditeShovel), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.steelRod });
        ModLoader.addRecipe(new ItemStack(cobaltArditeShovel), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.cobaltRod });
        ModLoader.addRecipe(new ItemStack(arditeArditeShovel), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.arditeRod });
        ModLoader.addRecipe(new ItemStack(manyullynArditeShovel), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.manyullynRod });
        ModLoader.addRecipe(new ItemStack(uraniumArditeShovel), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.uraniumRod });
    }
    
    public static void addManyullynTools(ItemStack stack)
    {
    	ModLoader.addRecipe(new ItemStack(woodManyullynShovel), new Object[] 
                { recipe, '#', stack, '|', Item.stick });
        ModLoader.addRecipe(new ItemStack(stoneManyullynShovel), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.stoneRod });
        ModLoader.addRecipe(new ItemStack(ironManyullynShovel), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.ironRod });
        ModLoader.addRecipe(new ItemStack(diamondManyullynShovel), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.diamondRod });
        ModLoader.addRecipe(new ItemStack(redstoneManyullynShovel), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.redstoneRod });
        ModLoader.addRecipe(new ItemStack(obsidianManyullynShovel), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.obsidianRod });
        ModLoader.addRecipe(new ItemStack(boneManyullynShovel), new Object[] 
                { recipe, '#', stack, '|', Item.bone });
        ModLoader.addRecipe(new ItemStack(boneManyullynShovel), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.boneRod });
        ModLoader.addRecipe(new ItemStack(slimeManyullynShovel), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.slimeRod });
        ModLoader.addRecipe(new ItemStack(cactusManyullynShovel), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.cactusRod });
        ModLoader.addRecipe(new ItemStack(blazeManyullynShovel), new Object[] 
                { recipe, '#', stack, '|', Item.blazeRod });
        ModLoader.addRecipe(new ItemStack(copperManyullynShovel), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.copperRod });
        ModLoader.addRecipe(new ItemStack(bronzeManyullynShovel), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.bronzeRod });
        ModLoader.addRecipe(new ItemStack(workedManyullynShovel), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.workedIronRod });
        ModLoader.addRecipe(new ItemStack(steelManyullynShovel), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.steelRod });
        ModLoader.addRecipe(new ItemStack(cobaltManyullynShovel), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.cobaltRod });
        ModLoader.addRecipe(new ItemStack(arditeManyullynShovel), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.arditeRod });
        ModLoader.addRecipe(new ItemStack(manyullynManyullynShovel), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.manyullynRod });
        ModLoader.addRecipe(new ItemStack(uraniumManyullynShovel), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.uraniumRod });
    }
    
    public static void addUraniumTools(ItemStack stack)
    {
        ModLoader.addRecipe(new ItemStack(diamondUraniumShovel), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.diamondRod });
        ModLoader.addRecipe(new ItemStack(redstoneUraniumShovel), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.redstoneRod });
        ModLoader.addRecipe(new ItemStack(boneUraniumShovel), new Object[] 
                { recipe, '#', stack, '|', Item.bone });
        ModLoader.addRecipe(new ItemStack(boneUraniumShovel), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.boneRod });
        ModLoader.addRecipe(new ItemStack(netherrackUraniumShovel), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.netherrackRod });
        ModLoader.addRecipe(new ItemStack(glowstoneUraniumShovel), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.glowstoneRod });
        ModLoader.addRecipe(new ItemStack(lavaUraniumShovel), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.lavaRod });
        ModLoader.addRecipe(new ItemStack(blazeUraniumShovel), new Object[] 
                { recipe, '#', stack, '|', Item.blazeRod });
        ModLoader.addRecipe(new ItemStack(cobaltUraniumShovel), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.cobaltRod });
        ModLoader.addRecipe(new ItemStack(arditeUraniumShovel), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.arditeRod });
        ModLoader.addRecipe(new ItemStack(uraniumUraniumShovel), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.uraniumRod });
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
