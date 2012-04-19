package net.minecraft.src.inficore;
import net.minecraft.src.Block;
import net.minecraft.src.InfiMaterialEnum;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;
import net.minecraft.src.ModLoader;
import net.minecraft.src.mod_InfiBase;
import net.minecraft.src.forge.MinecraftForge;

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
        createTools();
        addNames();
        registerInfiToolsRecipes();
    }
    
    private static void createTools()
    {
    	if(PropsHelperInfiTools.enableWoodTools)
    	{
    		woodWoodShovel = new InfiToolShovel(13, 
                    InfiMaterialEnum.Wood, InfiMaterialEnum.Wood, "woodWoodShovel");
    		sandstoneWoodShovel = new InfiToolShovel(PropsHelperInfiTools.woodShovelID+1, 
                    InfiMaterialEnum.Wood, InfiMaterialEnum.Sandstone, "sandstoneWoodShovel");
    		boneWoodShovel = new InfiToolShovel(PropsHelperInfiTools.woodShovelID+2, 
                    InfiMaterialEnum.Wood, InfiMaterialEnum.Bone, "boneWoodShovel");
    		paperWoodShovel = new InfiToolShovel(PropsHelperInfiTools.woodShovelID+3, 
                    InfiMaterialEnum.Wood, InfiMaterialEnum.Paper, "paperWoodShovel");
    		iceWoodShovel = new InfiToolShovel(PropsHelperInfiTools.woodShovelID+4, 
                    InfiMaterialEnum.Wood, InfiMaterialEnum.Ice, "iceWoodShovel");
    		slimeWoodShovel = new InfiToolShovel(PropsHelperInfiTools.woodShovelID+5, 
                    InfiMaterialEnum.Wood, InfiMaterialEnum.Slime, "slimeWoodShovel");
    		cactusWoodShovel = new InfiToolShovel(PropsHelperInfiTools.woodShovelID+6, 
                    InfiMaterialEnum.Wood, InfiMaterialEnum.Cactus, "cactusWoodShovel");
    		
    		MinecraftForge.setToolClass(woodWoodShovel, "shovel", InfiMaterialEnum.Wood.getHarvestLevel());
    		MinecraftForge.setToolClass(sandstoneWoodShovel, "shovel", InfiMaterialEnum.Wood.getHarvestLevel());
    		MinecraftForge.setToolClass(boneWoodShovel, "shovel", InfiMaterialEnum.Wood.getHarvestLevel());
    		MinecraftForge.setToolClass(paperWoodShovel, "shovel", InfiMaterialEnum.Wood.getHarvestLevel());
    		MinecraftForge.setToolClass(iceWoodShovel, "shovel", InfiMaterialEnum.Wood.getHarvestLevel());
    		MinecraftForge.setToolClass(slimeWoodShovel, "shovel", InfiMaterialEnum.Wood.getHarvestLevel());
    		MinecraftForge.setToolClass(cactusWoodShovel, "shovel", InfiMaterialEnum.Wood.getHarvestLevel());
    	}

        if(PropsHelperInfiTools.enableStoneTools)
        {
        	woodStoneShovel = new InfiToolShovel(17, 
                    InfiMaterialEnum.Stone, InfiMaterialEnum.Wood, "woodStoneShovel");
        	stoneStoneShovel = new InfiToolShovel(PropsHelperInfiTools.stoneShovelID+1, 
                    InfiMaterialEnum.Stone, InfiMaterialEnum.Stone, "stoneStoneShovel");
        	sandstoneStoneShovel = new InfiToolShovel(PropsHelperInfiTools.stoneShovelID+2, 
                    InfiMaterialEnum.Stone, InfiMaterialEnum.Sandstone, "sandstoneStoneShovel");
        	boneStoneShovel = new InfiToolShovel(PropsHelperInfiTools.stoneShovelID+3, 
                    InfiMaterialEnum.Stone, InfiMaterialEnum.Bone, "boneStoneShovel");
        	netherrackStoneShovel = new InfiToolShovel(PropsHelperInfiTools.stoneShovelID+4, 
                    InfiMaterialEnum.Stone, InfiMaterialEnum.Netherrack, "netherrackStoneShovel");
        	iceStoneShovel = new InfiToolShovel(PropsHelperInfiTools.stoneShovelID+5, 
                    InfiMaterialEnum.Stone, InfiMaterialEnum.Ice, "iceStoneShovel");
        	slimeStoneShovel = new InfiToolShovel(PropsHelperInfiTools.stoneShovelID+6, 
                    InfiMaterialEnum.Stone, InfiMaterialEnum.Slime, "slimeStoneShovel");
        	cactusStoneShovel = new InfiToolShovel(PropsHelperInfiTools.stoneShovelID+7, 
                    InfiMaterialEnum.Stone, InfiMaterialEnum.Cactus, "cactusStoneShovel");
        	flintStoneShovel = new InfiToolShovel(PropsHelperInfiTools.stoneShovelID+8, 
                    InfiMaterialEnum.Stone, InfiMaterialEnum.Flint, "flintStoneShovel");
            
            MinecraftForge.setToolClass(woodStoneShovel, "shovel", InfiMaterialEnum.Stone.getHarvestLevel());
            MinecraftForge.setToolClass(stoneStoneShovel, "shovel", InfiMaterialEnum.Stone.getHarvestLevel());
            MinecraftForge.setToolClass(sandstoneStoneShovel, "shovel", InfiMaterialEnum.Stone.getHarvestLevel());
            MinecraftForge.setToolClass(boneStoneShovel, "shovel", InfiMaterialEnum.Stone.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackStoneShovel, "shovel", InfiMaterialEnum.Stone.getHarvestLevel());
            MinecraftForge.setToolClass(iceStoneShovel, "shovel", InfiMaterialEnum.Stone.getHarvestLevel());
            MinecraftForge.setToolClass(slimeStoneShovel, "shovel", InfiMaterialEnum.Stone.getHarvestLevel());
            MinecraftForge.setToolClass(cactusStoneShovel, "shovel", InfiMaterialEnum.Stone.getHarvestLevel());
            MinecraftForge.setToolClass(flintStoneShovel, "shovel", InfiMaterialEnum.Stone.getHarvestLevel());
        }
        
        if(PropsHelperInfiTools.enableIronTools)
        {
        	woodIronShovel = new InfiToolShovel(0, 
                    InfiMaterialEnum.Iron, InfiMaterialEnum.Wood, "woodIronShovel");
        	stoneIronShovel = new InfiToolShovel(PropsHelperInfiTools.ironShovelID+1, 
                    InfiMaterialEnum.Iron, InfiMaterialEnum.Stone, "stoneIronShovel");
        	ironIronShovel = new InfiToolShovel(PropsHelperInfiTools.ironShovelID+2, 
                    InfiMaterialEnum.Iron, InfiMaterialEnum.Iron, "ironIronShovel");
        	boneIronShovel = new InfiToolShovel(PropsHelperInfiTools.ironShovelID+3, 
                    InfiMaterialEnum.Iron, InfiMaterialEnum.Bone, "boneIronShovel");
        	netherrackIronShovel = new InfiToolShovel(PropsHelperInfiTools.ironShovelID+4, 
                    InfiMaterialEnum.Iron, InfiMaterialEnum.Netherrack, "netherrackIronShovel");
        	glowstoneIronShovel = new InfiToolShovel(PropsHelperInfiTools.ironShovelID+5, 
                    InfiMaterialEnum.Iron, InfiMaterialEnum.Glowstone, "glowstoneIronShovel");
        	cactusIronShovel = new InfiToolShovel(PropsHelperInfiTools.ironShovelID+6, 
                    InfiMaterialEnum.Iron, InfiMaterialEnum.Cactus, "cactusIronShovel");
        	copperIronShovel = new InfiToolShovel(PropsHelperInfiTools.ironShovelID+7, 
                    InfiMaterialEnum.Iron, InfiMaterialEnum.Copper, "copperIronShovel");
        	bronzeIronShovel = new InfiToolShovel(PropsHelperInfiTools.ironShovelID+8, 
                    InfiMaterialEnum.Iron, InfiMaterialEnum.Bronze, "bronzeIronShovel");
            
            MinecraftForge.setToolClass(woodIronShovel, "shovel", InfiMaterialEnum.Iron.getHarvestLevel());
            MinecraftForge.setToolClass(stoneIronShovel, "shovel", InfiMaterialEnum.Iron.getHarvestLevel());
            MinecraftForge.setToolClass(ironIronShovel, "shovel", InfiMaterialEnum.Iron.getHarvestLevel());
            MinecraftForge.setToolClass(boneIronShovel, "shovel", InfiMaterialEnum.Iron.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackIronShovel, "shovel", InfiMaterialEnum.Iron.getHarvestLevel());
            MinecraftForge.setToolClass(glowstoneIronShovel, "shovel", InfiMaterialEnum.Iron.getHarvestLevel());
            MinecraftForge.setToolClass(cactusIronShovel, "shovel", InfiMaterialEnum.Iron.getHarvestLevel());
            MinecraftForge.setToolClass(copperIronShovel, "shovel", InfiMaterialEnum.Iron.getHarvestLevel());
            MinecraftForge.setToolClass(bronzeIronShovel, "shovel", InfiMaterialEnum.Iron.getHarvestLevel());
        }
        
        if(PropsHelperInfiTools.enableDiamondTools)
        {
        	woodDiamondShovel = new InfiToolShovel(21, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Wood, "woodDiamondShovel");
        	stoneDiamondShovel = new InfiToolShovel(PropsHelperInfiTools.diamondShovelID+1, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Stone, "stoneDiamondShovel");
        	ironDiamondShovel = new InfiToolShovel(PropsHelperInfiTools.diamondShovelID+2, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Iron, "ironDiamondShovel");
        	diamondDiamondShovel = new InfiToolShovel(PropsHelperInfiTools.diamondShovelID+3, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Diamond, "diamondDiamondShovel");
        	redstoneDiamondShovel = new InfiToolShovel(PropsHelperInfiTools.diamondShovelID+4, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Redstone, "redstoneDiamondShovel");
        	obsidianDiamondShovel = new InfiToolShovel(PropsHelperInfiTools.diamondShovelID+5, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Obsidian, "obsidianDiamondShovel");
        	boneDiamondShovel = new InfiToolShovel(PropsHelperInfiTools.diamondShovelID+6, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Bone, "boneDiamondShovel");
        	mossyDiamondShovel = new InfiToolShovel(PropsHelperInfiTools.diamondShovelID+7, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Mossy, "mossyDiamondShovel");
        	netherrackDiamondShovel = new InfiToolShovel(PropsHelperInfiTools.diamondShovelID+8, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Netherrack, "netherrackDiamondShovel");
        	glowstoneDiamondShovel = new InfiToolShovel(PropsHelperInfiTools.diamondShovelID+9, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Glowstone, "glowstoneDiamondShovel");
        	lavaDiamondShovel = new InfiToolShovel(PropsHelperInfiTools.diamondShovelID+10, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Lava, "lavaDiamondShovel");
        	cactusDiamondShovel = new InfiToolShovel(PropsHelperInfiTools.diamondShovelID+11, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Cactus, "cactusDiamondShovel");
        	flintDiamondShovel = new InfiToolShovel(PropsHelperInfiTools.diamondShovelID+12, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Flint, "flintDiamondShovel");
        	blazeDiamondShovel = new InfiToolShovel(PropsHelperInfiTools.diamondShovelID+13, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Blaze, "blazeDiamondShovel");
            copperDiamondShovel = new InfiToolShovel(PropsHelperInfiTools.diamondShovelID+14, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Copper, "copperDiamondShovel");
            bronzeDiamondShovel = new InfiToolShovel(PropsHelperInfiTools.diamondShovelID+15, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Bronze, "bronzeDiamondShovel");
            workedDiamondShovel = new InfiToolShovel(PropsHelperInfiTools.diamondShovelID+16, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.WorkedIron, "workedDiamondShovel");
            steelDiamondShovel = new InfiToolShovel(PropsHelperInfiTools.diamondShovelID+17, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Steel, "steelDiamondShovel");
            cobaltDiamondShovel = new InfiToolShovel(PropsHelperInfiTools.diamondShovelID+18, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Cobalt, "cobaltDiamondShovel");
            arditeDiamondShovel = new InfiToolShovel(PropsHelperInfiTools.diamondShovelID+19, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Ardite, "arditeDiamondShovel");
            manyullynDiamondShovel = new InfiToolShovel(PropsHelperInfiTools.diamondShovelID+20, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Manyullyn, "manyullynDiamondShovel");
            uraniumDiamondShovel = new InfiToolShovel(PropsHelperInfiTools.diamondShovelID+21, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Uranium, "uraniumDiamondShovel");
            
            MinecraftForge.setToolClass(woodDiamondShovel, "shovel", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(stoneDiamondShovel, "shovel", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(ironDiamondShovel, "shovel", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(diamondDiamondShovel, "shovel", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(redstoneDiamondShovel, "shovel", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(obsidianDiamondShovel, "shovel", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(boneDiamondShovel, "shovel", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(mossyDiamondShovel, "shovel", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackDiamondShovel, "shovel", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(glowstoneDiamondShovel, "shovel", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(lavaDiamondShovel, "shovel", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(cactusDiamondShovel, "shovel", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(flintDiamondShovel, "shovel", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(blazeDiamondShovel, "shovel", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(copperDiamondShovel, "shovel", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(bronzeDiamondShovel, "shovel", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(workedDiamondShovel, "shovel", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(steelDiamondShovel, "shovel", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(cobaltDiamondShovel, "shovel", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(arditeDiamondShovel, "shovel", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(manyullynDiamondShovel, "shovel", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(uraniumDiamondShovel, "shovel", InfiMaterialEnum.Diamond.getHarvestLevel());
        }
        
        if(PropsHelperInfiTools.enableRedstoneTools)
        {
        	woodRedstoneShovel = new InfiToolShovel(PropsHelperInfiTools.redstoneShovelID+0, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Redstone, "woodRedstoneShovel");
        	stoneRedstoneShovel = new InfiToolShovel(PropsHelperInfiTools.redstoneShovelID+1, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Stone, "stoneRedstoneShovel");
        	ironRedstoneShovel = new InfiToolShovel(PropsHelperInfiTools.redstoneShovelID+2, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Iron, "ironRedstoneShovel");
        	redstoneRedstoneShovel = new InfiToolShovel(PropsHelperInfiTools.redstoneShovelID+3, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Redstone, "redstoneRedstoneShovel");
        	obsidianRedstoneShovel = new InfiToolShovel(PropsHelperInfiTools.redstoneShovelID+4, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Obsidian, "obsidianRedstoneShovel");
        	sandstoneRedstoneShovel = new InfiToolShovel(PropsHelperInfiTools.redstoneShovelID+5, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Sandstone, "sandstoneRedstoneShovel");
        	boneRedstoneShovel = new InfiToolShovel(PropsHelperInfiTools.redstoneShovelID+6, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Bone, "boneRedstoneShovel");
        	paperRedstoneShovel = new InfiToolShovel(PropsHelperInfiTools.redstoneShovelID+7, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Paper, "paperRedstoneShovel");
        	mossyRedstoneShovel = new InfiToolShovel(PropsHelperInfiTools.redstoneShovelID+8, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Mossy, "mossyRedstoneShovel");
        	netherrackRedstoneShovel = new InfiToolShovel(PropsHelperInfiTools.redstoneShovelID+9, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Netherrack, "netherrackRedstoneShovel");
        	glowstoneRedstoneShovel = new InfiToolShovel(PropsHelperInfiTools.redstoneShovelID+10, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Glowstone, "glowstoneRedstoneShovel");
        	iceRedstoneShovel = new InfiToolShovel(PropsHelperInfiTools.redstoneShovelID+11, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Ice, "iceRedstoneShovel");
        	lavaRedstoneShovel = new InfiToolShovel(PropsHelperInfiTools.redstoneShovelID+12,
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Lava, "lavaRedstoneShovel");
        	slimeRedstoneShovel = new InfiToolShovel(PropsHelperInfiTools.redstoneShovelID+13,
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Slime, "slimeRedstoneShovel");
        	cactusRedstoneShovel = new InfiToolShovel(PropsHelperInfiTools.redstoneShovelID+14,
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Cactus, "cactusRedstoneShovel");
        	flintRedstoneShovel = new InfiToolShovel(PropsHelperInfiTools.redstoneShovelID+15,
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Flint, "flintRedstoneShovel");
        	copperRedstoneShovel = new InfiToolShovel(PropsHelperInfiTools.redstoneShovelID+16,
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Copper, "copperRedstoneShovel");
        	bronzeRedstoneShovel = new InfiToolShovel(PropsHelperInfiTools.redstoneShovelID+17,
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Bronze, "bronzeRedstoneShovel");
        	workedRedstoneShovel = new InfiToolShovel(PropsHelperInfiTools.redstoneShovelID+18,
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.WorkedIron, "workedRedstoneShovel");
        	uraniumRedstoneShovel = new InfiToolShovel(PropsHelperInfiTools.redstoneShovelID+19,
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Uranium, "uraniumRedstoneShovel");
            
            MinecraftForge.setToolClass(woodRedstoneShovel, "shovel", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(stoneRedstoneShovel, "shovel", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(ironRedstoneShovel, "shovel", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(redstoneRedstoneShovel, "shovel", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(obsidianRedstoneShovel, "shovel", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(sandstoneRedstoneShovel, "shovel", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(boneRedstoneShovel, "shovel", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(paperRedstoneShovel, "shovel", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(mossyRedstoneShovel, "shovel", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackRedstoneShovel, "shovel", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(glowstoneRedstoneShovel, "shovel", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(iceRedstoneShovel, "shovel", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(lavaRedstoneShovel, "shovel", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(slimeRedstoneShovel, "shovel", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(cactusRedstoneShovel, "shovel", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(flintRedstoneShovel, "shovel", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(copperRedstoneShovel, "shovel", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(bronzeRedstoneShovel, "shovel", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(workedRedstoneShovel, "shovel", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(uraniumRedstoneShovel, "shovel", InfiMaterialEnum.Redstone.getHarvestLevel());
        }
        
        if(PropsHelperInfiTools.enableObsidianTools)
        {
        	woodObsidianShovel = new InfiToolShovel(PropsHelperInfiTools.obsidianShovelID+0, 
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Obsidian, "woodObsidianShovel");
        	stoneObsidianShovel = new InfiToolShovel(PropsHelperInfiTools.obsidianShovelID+1, 
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Stone, "stoneObsidianShovel");
        	redstoneObsidianShovel = new InfiToolShovel(PropsHelperInfiTools.obsidianShovelID+2, 
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Obsidian, "redstoneObsidianShovel");
        	obsidianObsidianShovel = new InfiToolShovel(PropsHelperInfiTools.obsidianShovelID+3, 
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Obsidian, "obsidianObsidianShovel");;
        	boneObsidianShovel = new InfiToolShovel(PropsHelperInfiTools.obsidianShovelID+4, 
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Bone, "boneObsidianShovel");
        	netherrackObsidianShovel = new InfiToolShovel(PropsHelperInfiTools.obsidianShovelID+5, 
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Netherrack, "netherrackObsidianShovel");
        	glowstoneObsidianShovel = new InfiToolShovel(PropsHelperInfiTools.obsidianShovelID+6, 
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Glowstone, "glowstoneObsidianShovel");
        	iceObsidianShovel = new InfiToolShovel(PropsHelperInfiTools.obsidianShovelID+7, 
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Ice, "iceObsidianShovel");
        	lavaObsidianShovel = new InfiToolShovel(PropsHelperInfiTools.obsidianShovelID+8,
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Lava, "lavaObsidianShovel");
        	cactusObsidianShovel = new InfiToolShovel(PropsHelperInfiTools.obsidianShovelID+9,
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Cactus, "cactusObsidianShovel");
            
            MinecraftForge.setToolClass(woodObsidianShovel, "shovel", InfiMaterialEnum.Obsidian.getHarvestLevel());
            MinecraftForge.setToolClass(stoneObsidianShovel, "shovel", InfiMaterialEnum.Obsidian.getHarvestLevel());
            MinecraftForge.setToolClass(redstoneObsidianShovel, "shovel", InfiMaterialEnum.Obsidian.getHarvestLevel());
            MinecraftForge.setToolClass(obsidianObsidianShovel, "shovel", InfiMaterialEnum.Obsidian.getHarvestLevel());
            MinecraftForge.setToolClass(boneObsidianShovel, "shovel", InfiMaterialEnum.Obsidian.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackObsidianShovel, "shovel", InfiMaterialEnum.Obsidian.getHarvestLevel());
            MinecraftForge.setToolClass(glowstoneObsidianShovel, "shovel", InfiMaterialEnum.Obsidian.getHarvestLevel());
            MinecraftForge.setToolClass(iceObsidianShovel, "shovel", InfiMaterialEnum.Obsidian.getHarvestLevel());
            MinecraftForge.setToolClass(lavaObsidianShovel, "shovel", InfiMaterialEnum.Obsidian.getHarvestLevel());
            MinecraftForge.setToolClass(cactusObsidianShovel, "shovel", InfiMaterialEnum.Obsidian.getHarvestLevel());
        }
        
        if(PropsHelperInfiTools.enableSandstoneTools)
        {
        	woodSandstoneShovel = new InfiToolShovel(PropsHelperInfiTools.sandstoneShovelID+0, 
                    InfiMaterialEnum.Sandstone, InfiMaterialEnum.Sandstone, "woodSandstoneShovel");
        	sandstoneSandstoneShovel = new InfiToolShovel(PropsHelperInfiTools.sandstoneShovelID+1, 
                    InfiMaterialEnum.Sandstone, InfiMaterialEnum.Sandstone, "sandstoneSandstoneShovel");
        	boneSandstoneShovel = new InfiToolShovel(PropsHelperInfiTools.sandstoneShovelID+2, 
                    InfiMaterialEnum.Sandstone, InfiMaterialEnum.Bone, "boneSandstoneShovel");
        	netherrackSandstoneShovel = new InfiToolShovel(PropsHelperInfiTools.sandstoneShovelID+3, 
                    InfiMaterialEnum.Sandstone, InfiMaterialEnum.Netherrack, "netherrackSandstoneShovel");
        	iceSandstoneShovel = new InfiToolShovel(PropsHelperInfiTools.sandstoneShovelID+4, 
                    InfiMaterialEnum.Sandstone, InfiMaterialEnum.Ice, "iceSandstoneShovel");
        	slimeSandstoneShovel = new InfiToolShovel(PropsHelperInfiTools.sandstoneShovelID+5,
                    InfiMaterialEnum.Sandstone, InfiMaterialEnum.Slime, "slimeSandstoneShovel");
        	cactusSandstoneShovel = new InfiToolShovel(PropsHelperInfiTools.sandstoneShovelID+6,
                    InfiMaterialEnum.Sandstone, InfiMaterialEnum.Cactus, "cactusSandstoneShovel");
        	flintSandstoneShovel = new InfiToolShovel(PropsHelperInfiTools.sandstoneShovelID+7,
                    InfiMaterialEnum.Sandstone, InfiMaterialEnum.Flint, "flintSandstoneShovel");
            
            MinecraftForge.setToolClass(woodSandstoneShovel, "shovel", InfiMaterialEnum.Sandstone.getHarvestLevel());
            MinecraftForge.setToolClass(sandstoneSandstoneShovel, "shovel", InfiMaterialEnum.Sandstone.getHarvestLevel());
            MinecraftForge.setToolClass(boneSandstoneShovel, "shovel", InfiMaterialEnum.Sandstone.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackSandstoneShovel, "shovel", InfiMaterialEnum.Sandstone.getHarvestLevel());
            MinecraftForge.setToolClass(iceSandstoneShovel, "shovel", InfiMaterialEnum.Sandstone.getHarvestLevel());
            MinecraftForge.setToolClass(slimeSandstoneShovel, "shovel", InfiMaterialEnum.Sandstone.getHarvestLevel());
            MinecraftForge.setToolClass(cactusSandstoneShovel, "shovel", InfiMaterialEnum.Sandstone.getHarvestLevel());
            MinecraftForge.setToolClass(flintSandstoneShovel, "shovel", InfiMaterialEnum.Sandstone.getHarvestLevel());
        }
        
        if(PropsHelperInfiTools.enableBoneTools)
        {
        	woodBoneShovel = new InfiToolShovel(PropsHelperInfiTools.boneShovelID+0, 
                    InfiMaterialEnum.Bone, InfiMaterialEnum.Bone, "woodBoneShovel");
        	stoneBoneShovel = new InfiToolShovel(PropsHelperInfiTools.boneShovelID+1, 
                    InfiMaterialEnum.Bone, InfiMaterialEnum.Stone, "stoneBoneShovel");
        	sandstoneBoneShovel = new InfiToolShovel(PropsHelperInfiTools.boneShovelID+2, 
                    InfiMaterialEnum.Bone, InfiMaterialEnum.Sandstone, "sandstoneBoneShovel");
        	boneBoneShovel = new InfiToolShovel(PropsHelperInfiTools.boneShovelID+3, 
                    InfiMaterialEnum.Bone, InfiMaterialEnum.Bone, "boneBoneShovel");
        	paperBoneShovel = new InfiToolShovel(PropsHelperInfiTools.boneShovelID+4, 
                    InfiMaterialEnum.Bone, InfiMaterialEnum.Paper, "paperBoneShovel");
        	netherrackBoneShovel = new InfiToolShovel(PropsHelperInfiTools.boneShovelID+5, 
                    InfiMaterialEnum.Bone, InfiMaterialEnum.Netherrack, "netherrackBoneShovel");
        	iceBoneShovel = new InfiToolShovel(PropsHelperInfiTools.boneShovelID+6, 
                    InfiMaterialEnum.Bone, InfiMaterialEnum.Ice, "iceBoneShovel");
        	cactusBoneShovel = new InfiToolShovel(PropsHelperInfiTools.boneShovelID+7,
                    InfiMaterialEnum.Bone, InfiMaterialEnum.Cactus, "cactusBoneShovel");
        	flintBoneShovel = new InfiToolShovel(PropsHelperInfiTools.boneShovelID+8,
                    InfiMaterialEnum.Bone, InfiMaterialEnum.Flint, "flintBoneShovel");
            
            MinecraftForge.setToolClass(woodBoneShovel, "shovel", InfiMaterialEnum.Bone.getHarvestLevel());
            MinecraftForge.setToolClass(stoneBoneShovel, "shovel", InfiMaterialEnum.Bone.getHarvestLevel());
            MinecraftForge.setToolClass(sandstoneBoneShovel, "shovel", InfiMaterialEnum.Bone.getHarvestLevel());
            MinecraftForge.setToolClass(boneBoneShovel, "shovel", InfiMaterialEnum.Bone.getHarvestLevel());
            MinecraftForge.setToolClass(paperBoneShovel, "shovel", InfiMaterialEnum.Bone.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackBoneShovel, "shovel", InfiMaterialEnum.Bone.getHarvestLevel());
            MinecraftForge.setToolClass(iceBoneShovel, "shovel", InfiMaterialEnum.Bone.getHarvestLevel());
            MinecraftForge.setToolClass(cactusBoneShovel, "shovel", InfiMaterialEnum.Bone.getHarvestLevel());
            MinecraftForge.setToolClass(flintBoneShovel, "shovel", InfiMaterialEnum.Bone.getHarvestLevel());
        }
        
        if(PropsHelperInfiTools.enablePaperTools)
        {
        	woodPaperShovel = new InfiToolShovel(PropsHelperInfiTools.paperShovelID+0, 
                    InfiMaterialEnum.Paper, InfiMaterialEnum.Paper, "woodPaperShovel");
        	bonePaperShovel = new InfiToolShovel(PropsHelperInfiTools.paperShovelID+1, 
                    InfiMaterialEnum.Paper, InfiMaterialEnum.Paper, "bonePaperShovel");
        	paperPaperShovel = new InfiToolShovel(PropsHelperInfiTools.paperShovelID+2, 
                    InfiMaterialEnum.Paper, InfiMaterialEnum.Paper, "paperPaperShovel");
        	slimePaperShovel = new InfiToolShovel(PropsHelperInfiTools.paperShovelID+3,
                    InfiMaterialEnum.Paper, InfiMaterialEnum.Cactus, "slimePaperShovel");
        	cactusPaperShovel = new InfiToolShovel(PropsHelperInfiTools.paperShovelID+4,
                    InfiMaterialEnum.Paper, InfiMaterialEnum.Cactus, "cactusPaperShovel");
            
            MinecraftForge.setToolClass(woodPaperShovel, "shovel", InfiMaterialEnum.Paper.getHarvestLevel());
            MinecraftForge.setToolClass(bonePaperShovel, "shovel", InfiMaterialEnum.Paper.getHarvestLevel());
            MinecraftForge.setToolClass(paperPaperShovel, "shovel", InfiMaterialEnum.Paper.getHarvestLevel());
            MinecraftForge.setToolClass(slimePaperShovel, "shovel", InfiMaterialEnum.Paper.getHarvestLevel());
            MinecraftForge.setToolClass(cactusPaperShovel, "shovel", InfiMaterialEnum.Paper.getHarvestLevel());
        }
        
        if(PropsHelperInfiTools.enableMossyTools)
        {
        	woodMossyShovel = new InfiToolShovel(PropsHelperInfiTools.mossyShovelID+0, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Wood, "woodMossyShovel");
        	stoneMossyShovel = new InfiToolShovel(PropsHelperInfiTools.mossyShovelID+1, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Stone, "stoneMossyShovel");
        	diamondMossyShovel = new InfiToolShovel(PropsHelperInfiTools.mossyShovelID+2, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Diamond, "diamondMossyShovel");
        	redstoneMossyShovel = new InfiToolShovel(PropsHelperInfiTools.mossyShovelID+3, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Redstone, "redstoneMossyShovel");
        	boneMossyShovel = new InfiToolShovel(PropsHelperInfiTools.mossyShovelID+4, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Bone, "boneMossyShovel");
        	mossyMossyShovel = new InfiToolShovel(PropsHelperInfiTools.mossyShovelID+5, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Mossy, "mossyMossyShovel");
        	netherrackMossyShovel = new InfiToolShovel(PropsHelperInfiTools.mossyShovelID+6, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Netherrack, "netherrackMossyShovel");
        	glowstoneMossyShovel = new InfiToolShovel(PropsHelperInfiTools.mossyShovelID+7, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Glowstone, "glowstoneMossyShovel");
        	cactusMossyShovel = new InfiToolShovel(PropsHelperInfiTools.mossyShovelID+8, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Cactus, "cactusMossyShovel");
        	blazeMossyShovel = new InfiToolShovel(PropsHelperInfiTools.mossyShovelID+9, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Blaze, "blazeMossyShovel");
        	manyullynMossyShovel = new InfiToolShovel(PropsHelperInfiTools.mossyShovelID+10, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Manyullyn, "manyullynMossyShovel");
        	uraniumMossyShovel = new InfiToolShovel(PropsHelperInfiTools.mossyShovelID+11, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Uranium, "uraniumMossyShovel");
            
            MinecraftForge.setToolClass(woodMossyShovel, "shovel", InfiMaterialEnum.Mossy.getHarvestLevel());
            MinecraftForge.setToolClass(stoneMossyShovel, "shovel", InfiMaterialEnum.Mossy.getHarvestLevel());
            MinecraftForge.setToolClass(diamondMossyShovel, "shovel", InfiMaterialEnum.Mossy.getHarvestLevel());
            MinecraftForge.setToolClass(redstoneMossyShovel, "shovel", InfiMaterialEnum.Mossy.getHarvestLevel());
            MinecraftForge.setToolClass(boneMossyShovel, "shovel", InfiMaterialEnum.Mossy.getHarvestLevel());
            MinecraftForge.setToolClass(mossyMossyShovel, "shovel", InfiMaterialEnum.Mossy.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackMossyShovel, "shovel", InfiMaterialEnum.Mossy.getHarvestLevel());
            MinecraftForge.setToolClass(glowstoneMossyShovel, "shovel", InfiMaterialEnum.Mossy.getHarvestLevel());
            MinecraftForge.setToolClass(cactusMossyShovel, "shovel", InfiMaterialEnum.Mossy.getHarvestLevel());
            MinecraftForge.setToolClass(blazeMossyShovel, "shovel", InfiMaterialEnum.Mossy.getHarvestLevel());
            MinecraftForge.setToolClass(manyullynMossyShovel, "shovel", InfiMaterialEnum.Mossy.getHarvestLevel());
            MinecraftForge.setToolClass(uraniumMossyShovel, "shovel", InfiMaterialEnum.Mossy.getHarvestLevel());
        }
        
        if(PropsHelperInfiTools.enableNetherrackTools)
        {
        	woodNetherrackShovel = new InfiToolShovel(PropsHelperInfiTools.netherrackShovelID+0, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Wood, "woodNetherrackShovel");
        	stoneNetherrackShovel = new InfiToolShovel(PropsHelperInfiTools.netherrackShovelID+1, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Stone, "stoneNetherrackShovel");
        	sandstoneNetherrackShovel = new InfiToolShovel(PropsHelperInfiTools.netherrackShovelID+2, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Sandstone, "sandstoneNetherrackShovel");
        	boneNetherrackShovel = new InfiToolShovel(PropsHelperInfiTools.netherrackShovelID+3, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Bone, "boneNetherrackShovel");
        	paperNetherrackShovel = new InfiToolShovel(PropsHelperInfiTools.netherrackShovelID+4, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Paper, "paperNetherrackShovel");
        	mossyNetherrackShovel = new InfiToolShovel(PropsHelperInfiTools.netherrackShovelID+5, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Mossy, "mossyNetherrackShovel");
        	netherrackNetherrackShovel = new InfiToolShovel(PropsHelperInfiTools.netherrackShovelID+6, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Netherrack, "netherrackNetherrackShovel");
        	iceNetherrackShovel = new InfiToolShovel(PropsHelperInfiTools.netherrackShovelID+7, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Ice, "iceNetherrackShovel");
        	slimeNetherrackShovel = new InfiToolShovel(PropsHelperInfiTools.netherrackShovelID+8, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Slime, "slimeNetherrackShovel");
        	cactusNetherrackShovel = new InfiToolShovel(PropsHelperInfiTools.netherrackShovelID+9, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Cactus, "cactusNetherrackShovel");
        	flintNetherrackShovel = new InfiToolShovel(PropsHelperInfiTools.netherrackShovelID+10, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Flint, "flintNetherrackShovel");
        	copperNetherrackShovel = new InfiToolShovel(PropsHelperInfiTools.netherrackShovelID+11, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Copper, "copperNetherrackShovel");
        	bronzeNetherrackShovel = new InfiToolShovel(PropsHelperInfiTools.netherrackShovelID+12, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Bronze, "bronzeNetherrackShovel");
            
            MinecraftForge.setToolClass(woodNetherrackShovel, "shovel", InfiMaterialEnum.Netherrack.getHarvestLevel());
            MinecraftForge.setToolClass(stoneNetherrackShovel, "shovel", InfiMaterialEnum.Netherrack.getHarvestLevel());
            MinecraftForge.setToolClass(sandstoneNetherrackShovel, "shovel", InfiMaterialEnum.Netherrack.getHarvestLevel());
            MinecraftForge.setToolClass(boneNetherrackShovel, "shovel", InfiMaterialEnum.Netherrack.getHarvestLevel());
            MinecraftForge.setToolClass(paperNetherrackShovel, "shovel", InfiMaterialEnum.Netherrack.getHarvestLevel());
            MinecraftForge.setToolClass(mossyNetherrackShovel, "shovel", InfiMaterialEnum.Netherrack.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackNetherrackShovel, "shovel", InfiMaterialEnum.Netherrack.getHarvestLevel());
            MinecraftForge.setToolClass(iceNetherrackShovel, "shovel", InfiMaterialEnum.Netherrack.getHarvestLevel());
            MinecraftForge.setToolClass(slimeNetherrackShovel, "shovel", InfiMaterialEnum.Netherrack.getHarvestLevel());
            MinecraftForge.setToolClass(cactusNetherrackShovel, "shovel", InfiMaterialEnum.Netherrack.getHarvestLevel());
            MinecraftForge.setToolClass(flintNetherrackShovel, "shovel", InfiMaterialEnum.Netherrack.getHarvestLevel());
            MinecraftForge.setToolClass(copperNetherrackShovel, "shovel", InfiMaterialEnum.Netherrack.getHarvestLevel());
            MinecraftForge.setToolClass(bronzeNetherrackShovel, "shovel", InfiMaterialEnum.Netherrack.getHarvestLevel());
        }
        
        if(PropsHelperInfiTools.enableGlowstoneTools)
        {
        	woodGlowstoneShovel = new InfiToolShovel(PropsHelperInfiTools.glowstoneShovelID+0, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Wood, "woodGlowstoneShovel");
        	redstoneGlowstoneShovel = new InfiToolShovel(PropsHelperInfiTools.glowstoneShovelID+1, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Redstone, "redstoneGlowstoneShovel");
        	obsidianGlowstoneShovel = new InfiToolShovel(PropsHelperInfiTools.glowstoneShovelID+2, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Obsidian, "obsidianGlowstoneShovel");
        	boneGlowstoneShovel = new InfiToolShovel(PropsHelperInfiTools.glowstoneShovelID+3, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Bone, "boneGlowstoneShovel");
        	netherrackGlowstoneShovel = new InfiToolShovel(PropsHelperInfiTools.glowstoneShovelID+4, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Netherrack, "netherrackGlowstoneShovel");
        	glowstoneGlowstoneShovel = new InfiToolShovel(PropsHelperInfiTools.glowstoneShovelID+5, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Glowstone, "glowstoneGlowstoneShovel");
        	iceGlowstoneShovel = new InfiToolShovel(PropsHelperInfiTools.glowstoneShovelID+6, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Ice, "iceGlowstoneShovel");
        	slimeGlowstoneShovel = new InfiToolShovel(PropsHelperInfiTools.glowstoneShovelID+7, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Slime, "slimeGlowstoneShovel");
        	cactusGlowstoneShovel = new InfiToolShovel(PropsHelperInfiTools.glowstoneShovelID+8, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Cactus, "cactusGlowstoneShovel");
            
            
            MinecraftForge.setToolClass(woodGlowstoneShovel, "shovel", InfiMaterialEnum.Glowstone.getHarvestLevel());
            MinecraftForge.setToolClass(redstoneGlowstoneShovel, "shovel", InfiMaterialEnum.Glowstone.getHarvestLevel());
            MinecraftForge.setToolClass(obsidianGlowstoneShovel, "shovel", InfiMaterialEnum.Glowstone.getHarvestLevel());
            MinecraftForge.setToolClass(boneGlowstoneShovel, "shovel", InfiMaterialEnum.Glowstone.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackGlowstoneShovel, "shovel", InfiMaterialEnum.Glowstone.getHarvestLevel());
            MinecraftForge.setToolClass(glowstoneGlowstoneShovel, "shovel", InfiMaterialEnum.Glowstone.getHarvestLevel());
            MinecraftForge.setToolClass(iceGlowstoneShovel, "shovel", InfiMaterialEnum.Glowstone.getHarvestLevel());
            MinecraftForge.setToolClass(slimeGlowstoneShovel, "shovel", InfiMaterialEnum.Glowstone.getHarvestLevel());
            MinecraftForge.setToolClass(cactusGlowstoneShovel, "shovel", InfiMaterialEnum.Glowstone.getHarvestLevel());
        }
        
        if(PropsHelperInfiTools.enableIceTools)
        {
        	woodIceShovel = new InfiToolShovel(PropsHelperInfiTools.iceShovelID+0, 
                    InfiMaterialEnum.Ice, InfiMaterialEnum.Wood, "woodIceShovel");
        	boneIceShovel = new InfiToolShovel(PropsHelperInfiTools.iceShovelID+1, 
                    InfiMaterialEnum.Ice, InfiMaterialEnum.Bone, "boneIceShovel");
        	paperIceShovel = new InfiToolShovel(PropsHelperInfiTools.iceShovelID+2, 
                    InfiMaterialEnum.Ice, InfiMaterialEnum.Paper, "paperIceShovel");
        	iceIceShovel = new InfiToolShovel(PropsHelperInfiTools.iceShovelID+3, 
                    InfiMaterialEnum.Ice, InfiMaterialEnum.Ice, "iceIceShovel");
        	slimeIceShovel = new InfiToolShovel(PropsHelperInfiTools.iceShovelID+4, 
                    InfiMaterialEnum.Ice, InfiMaterialEnum.Slime, "slimeIceShovel");
        	cactusIceShovel = new InfiToolShovel(PropsHelperInfiTools.iceShovelID+5, 
                    InfiMaterialEnum.Ice, InfiMaterialEnum.Cactus, "cactusIceShovel");
            
            
            MinecraftForge.setToolClass(woodIceShovel, "shovel", InfiMaterialEnum.Ice.getHarvestLevel());
            MinecraftForge.setToolClass(boneIceShovel, "shovel", InfiMaterialEnum.Ice.getHarvestLevel());
            MinecraftForge.setToolClass(paperIceShovel, "shovel", InfiMaterialEnum.Ice.getHarvestLevel());
            MinecraftForge.setToolClass(iceIceShovel, "shovel", InfiMaterialEnum.Ice.getHarvestLevel());
            MinecraftForge.setToolClass(slimeIceShovel, "shovel", InfiMaterialEnum.Ice.getHarvestLevel());
            MinecraftForge.setToolClass(cactusIceShovel, "shovel", InfiMaterialEnum.Ice.getHarvestLevel());
        }
        
        if(PropsHelperInfiTools.enableLavaTools)
        {
        	diamondLavaShovel = new InfiToolShovel(PropsHelperInfiTools.lavaShovelID+0, 
                    InfiMaterialEnum.Lava, InfiMaterialEnum.Diamond, "diamondLavaShovel");
        	obsidianLavaShovel = new InfiToolShovel(PropsHelperInfiTools.lavaShovelID+1, 
                    InfiMaterialEnum.Lava, InfiMaterialEnum.Obsidian, "obsidianLavaShovel");
        	netherrackLavaShovel = new InfiToolShovel(PropsHelperInfiTools.lavaShovelID+2, 
                    InfiMaterialEnum.Lava, InfiMaterialEnum.Netherrack, "netherrackLavaShovel");
        	lavaLavaShovel = new InfiToolShovel(PropsHelperInfiTools.lavaShovelID+3, 
                    InfiMaterialEnum.Lava, InfiMaterialEnum.Lava, "lavaLavaShovel");
        	flintLavaShovel = new InfiToolShovel(PropsHelperInfiTools.lavaShovelID+4, 
                    InfiMaterialEnum.Lava, InfiMaterialEnum.Flint, "flintLavaShovel");
        	blazeLavaShovel = new InfiToolShovel(PropsHelperInfiTools.lavaShovelID+5, 
                    InfiMaterialEnum.Lava, InfiMaterialEnum.Blaze, "blazeLavaShovel");
        	manyullynLavaShovel = new InfiToolShovel(PropsHelperInfiTools.lavaShovelID+6, 
                    InfiMaterialEnum.Lava, InfiMaterialEnum.Manyullyn, "manyullynLavaShovel");
            uraniumLavaShovel = new InfiToolShovel(PropsHelperInfiTools.lavaShovelID+7, 
                    InfiMaterialEnum.Lava, InfiMaterialEnum.Uranium, "uraniumLavaShovel");
            
            MinecraftForge.setToolClass(diamondLavaShovel, "shovel", InfiMaterialEnum.Lava.getHarvestLevel());
            MinecraftForge.setToolClass(obsidianLavaShovel, "shovel", InfiMaterialEnum.Lava.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackLavaShovel, "shovel", InfiMaterialEnum.Lava.getHarvestLevel());
            MinecraftForge.setToolClass(lavaLavaShovel, "shovel", InfiMaterialEnum.Lava.getHarvestLevel());
            MinecraftForge.setToolClass(flintLavaShovel, "shovel", InfiMaterialEnum.Lava.getHarvestLevel());
            MinecraftForge.setToolClass(blazeLavaShovel, "shovel", InfiMaterialEnum.Lava.getHarvestLevel());
            MinecraftForge.setToolClass(manyullynLavaShovel, "shovel", InfiMaterialEnum.Lava.getHarvestLevel());
            MinecraftForge.setToolClass(uraniumLavaShovel, "shovel", InfiMaterialEnum.Lava.getHarvestLevel());
        }
        
        if(PropsHelperInfiTools.enableSlimeTools)
        {
        	woodSlimeShovel = new InfiToolShovel(PropsHelperInfiTools.slimeShovelID+0, 
                    InfiMaterialEnum.Slime, InfiMaterialEnum.Wood, "woodSlimeShovel");
        	sandstoneSlimeShovel = new InfiToolShovel(PropsHelperInfiTools.slimeShovelID+1, 
                    InfiMaterialEnum.Slime, InfiMaterialEnum.Sandstone, "sandstoneSlimeShovel");
        	boneSlimeShovel = new InfiToolShovel(PropsHelperInfiTools.slimeShovelID+2, 
                    InfiMaterialEnum.Slime, InfiMaterialEnum.Bone, "boneSlimeShovel");
        	paperSlimeShovel = new InfiToolShovel(PropsHelperInfiTools.slimeShovelID+3, 
                    InfiMaterialEnum.Slime, InfiMaterialEnum.Paper, "paperSlimeShovel");
        	slimeSlimeShovel = new InfiToolShovel(PropsHelperInfiTools.slimeShovelID+4, 
                    InfiMaterialEnum.Slime, InfiMaterialEnum.Slime, "slimeSlimeShovel");
        	cactusSlimeShovel = new InfiToolShovel(PropsHelperInfiTools.slimeShovelID+5, 
                    InfiMaterialEnum.Slime, InfiMaterialEnum.Cactus, "cactusSlimeShovel");
            
            MinecraftForge.setToolClass(woodSlimeShovel, "shovel", InfiMaterialEnum.Slime.getHarvestLevel());
            MinecraftForge.setToolClass(sandstoneSlimeShovel, "shovel", InfiMaterialEnum.Slime.getHarvestLevel());
            MinecraftForge.setToolClass(boneSlimeShovel, "shovel", InfiMaterialEnum.Slime.getHarvestLevel());
            MinecraftForge.setToolClass(paperSlimeShovel, "shovel", InfiMaterialEnum.Slime.getHarvestLevel());
            MinecraftForge.setToolClass(slimeSlimeShovel, "shovel", InfiMaterialEnum.Slime.getHarvestLevel());
            MinecraftForge.setToolClass(cactusSlimeShovel, "shovel", InfiMaterialEnum.Slime.getHarvestLevel());
        }
        
        if(PropsHelperInfiTools.enableCactusTools)
        {
        	woodCactusShovel = new InfiToolShovel(PropsHelperInfiTools.cactusShovelID+0, 
                    InfiMaterialEnum.Cactus, InfiMaterialEnum.Wood, "woodCactusShovel");
        	sandstoneCactusShovel = new InfiToolShovel(PropsHelperInfiTools.cactusShovelID+1, 
                    InfiMaterialEnum.Cactus, InfiMaterialEnum.Sandstone, "sandstoneCactusShovel");
        	boneCactusShovel = new InfiToolShovel(PropsHelperInfiTools.cactusShovelID+2, 
                    InfiMaterialEnum.Cactus, InfiMaterialEnum.Bone, "boneCactusShovel");
        	netherrackCactusShovel = new InfiToolShovel(PropsHelperInfiTools.cactusShovelID+3, 
                    InfiMaterialEnum.Cactus, InfiMaterialEnum.Netherrack, "netherrackCactusShovel");
        	iceCactusShovel = new InfiToolShovel(PropsHelperInfiTools.cactusShovelID+4, 
                    InfiMaterialEnum.Cactus, InfiMaterialEnum.Ice, "iceCactusShovel");
        	slimeCactusShovel = new InfiToolShovel(PropsHelperInfiTools.cactusShovelID+5, 
                    InfiMaterialEnum.Cactus, InfiMaterialEnum.Slime, "slimeCactusShovel");
        	cactusCactusShovel = new InfiToolShovel(PropsHelperInfiTools.cactusShovelID+6, 
                    InfiMaterialEnum.Cactus, InfiMaterialEnum.Cactus, "cactusCactusShovel");
            
            MinecraftForge.setToolClass(woodCactusShovel, "shovel", InfiMaterialEnum.Cactus.getHarvestLevel());
            MinecraftForge.setToolClass(sandstoneCactusShovel, "shovel", InfiMaterialEnum.Cactus.getHarvestLevel());
            MinecraftForge.setToolClass(boneCactusShovel, "shovel", InfiMaterialEnum.Cactus.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackCactusShovel, "shovel", InfiMaterialEnum.Cactus.getHarvestLevel());
            MinecraftForge.setToolClass(iceCactusShovel, "shovel", InfiMaterialEnum.Cactus.getHarvestLevel());
            MinecraftForge.setToolClass(slimeCactusShovel, "shovel", InfiMaterialEnum.Cactus.getHarvestLevel());
            MinecraftForge.setToolClass(cactusCactusShovel, "shovel", InfiMaterialEnum.Cactus.getHarvestLevel());
        }
        
        if(PropsHelperInfiTools.enableFlintTools)
        {
        	woodFlintShovel = new InfiToolShovel(PropsHelperInfiTools.flintShovelID+0, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Wood, "woodFlintShovel");
        	stoneFlintShovel = new InfiToolShovel(PropsHelperInfiTools.flintShovelID+1, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Stone, "stoneFlintShovel");
        	sandstoneFlintShovel = new InfiToolShovel(PropsHelperInfiTools.flintShovelID+2, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Sandstone, "sandstoneFlintShovel");
        	boneFlintShovel = new InfiToolShovel(PropsHelperInfiTools.flintShovelID+3, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Bone, "boneFlintShovel");
        	netherrackFlintShovel = new InfiToolShovel(PropsHelperInfiTools.flintShovelID+4, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Flint, "netherrackFlintShovel");
        	slimeFlintShovel = new InfiToolShovel(PropsHelperInfiTools.flintShovelID+5, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Slime, "slimeFlintShovel");
        	cactusFlintShovel = new InfiToolShovel(PropsHelperInfiTools.flintShovelID+6, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Cactus, "cactusFlintShovel");
        	flintFlintShovel = new InfiToolShovel(PropsHelperInfiTools.flintShovelID+7, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Flint, "flintFlintShovel");
        	copperFlintShovel = new InfiToolShovel(PropsHelperInfiTools.flintShovelID+8, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Copper, "copperFlintShovel");
        	bronzeFlintShovel = new InfiToolShovel(PropsHelperInfiTools.flintShovelID+9, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Bronze, "bronzeFlintShovel");
            
            MinecraftForge.setToolClass(woodFlintShovel, "shovel", InfiMaterialEnum.Flint.getHarvestLevel());
            MinecraftForge.setToolClass(stoneFlintShovel, "shovel", InfiMaterialEnum.Flint.getHarvestLevel());
            MinecraftForge.setToolClass(sandstoneFlintShovel, "shovel", InfiMaterialEnum.Flint.getHarvestLevel());
            MinecraftForge.setToolClass(boneFlintShovel, "shovel", InfiMaterialEnum.Flint.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackFlintShovel, "shovel", InfiMaterialEnum.Flint.getHarvestLevel());
            MinecraftForge.setToolClass(slimeFlintShovel, "shovel", InfiMaterialEnum.Flint.getHarvestLevel());
            MinecraftForge.setToolClass(cactusFlintShovel, "shovel", InfiMaterialEnum.Flint.getHarvestLevel());
            MinecraftForge.setToolClass(flintFlintShovel, "shovel", InfiMaterialEnum.Flint.getHarvestLevel());
            MinecraftForge.setToolClass(copperFlintShovel, "shovel", InfiMaterialEnum.Flint.getHarvestLevel());
            MinecraftForge.setToolClass(bronzeFlintShovel, "shovel", InfiMaterialEnum.Flint.getHarvestLevel());
        }
        
        if(PropsHelperInfiTools.enableBlazeTools)
        {
        	diamondBlazeShovel = new InfiToolShovel(PropsHelperInfiTools.blazeShovelID+0, 
                    InfiMaterialEnum.Blaze, InfiMaterialEnum.Diamond, "diamondBlazeShovel");
        	obsidianBlazeShovel = new InfiToolShovel(PropsHelperInfiTools.blazeShovelID+1, 
                    InfiMaterialEnum.Blaze, InfiMaterialEnum.Obsidian, "obsidianBlazeShovel");
        	netherrackBlazeShovel = new InfiToolShovel(PropsHelperInfiTools.blazeShovelID+2, 
                    InfiMaterialEnum.Blaze, InfiMaterialEnum.Netherrack, "netherrackBlazeShovel");
        	lavaBlazeShovel = new InfiToolShovel(PropsHelperInfiTools.blazeShovelID+3, 
                    InfiMaterialEnum.Blaze, InfiMaterialEnum.Lava, "lavaBlazeShovel");
        	flintBlazeShovel = new InfiToolShovel(PropsHelperInfiTools.blazeShovelID+4, 
                    InfiMaterialEnum.Blaze, InfiMaterialEnum.Flint, "flintBlazeShovel");
        	blazeBlazeShovel = new InfiToolShovel(PropsHelperInfiTools.blazeShovelID+5, 
                    InfiMaterialEnum.Blaze, InfiMaterialEnum.Blaze, "blazeBlazeShovel");
        	manyullynBlazeShovel = new InfiToolShovel(PropsHelperInfiTools.blazeShovelID+6, 
                    InfiMaterialEnum.Blaze, InfiMaterialEnum.Manyullyn, "manyullynBlazeShovel");
            uraniumBlazeShovel = new InfiToolShovel(PropsHelperInfiTools.blazeShovelID+7, 
                    InfiMaterialEnum.Blaze, InfiMaterialEnum.Uranium, "uraniumBlazeShovel");
            
            MinecraftForge.setToolClass(diamondBlazeShovel, "shovel", InfiMaterialEnum.Blaze.getHarvestLevel());
            MinecraftForge.setToolClass(obsidianBlazeShovel, "shovel", InfiMaterialEnum.Blaze.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackBlazeShovel, "shovel", InfiMaterialEnum.Blaze.getHarvestLevel());
            MinecraftForge.setToolClass(blazeBlazeShovel, "shovel", InfiMaterialEnum.Blaze.getHarvestLevel());
            MinecraftForge.setToolClass(flintBlazeShovel, "shovel", InfiMaterialEnum.Blaze.getHarvestLevel());
            MinecraftForge.setToolClass(blazeBlazeShovel, "shovel", InfiMaterialEnum.Blaze.getHarvestLevel());
            MinecraftForge.setToolClass(manyullynBlazeShovel, "shovel", InfiMaterialEnum.Blaze.getHarvestLevel());
            MinecraftForge.setToolClass(uraniumBlazeShovel, "shovel", InfiMaterialEnum.Blaze.getHarvestLevel());
        }
    	
        if(PropsHelperInfiTools.enableCopperTools)
        {
        	woodCopperShovel = new InfiToolShovel(PropsHelperInfiTools.copperShovelID+0, 
                    InfiMaterialEnum.Copper, InfiMaterialEnum.Wood, "woodCopperShovel");
            stoneCopperShovel = new InfiToolShovel(PropsHelperInfiTools.copperShovelID+1, 
                    InfiMaterialEnum.Copper, InfiMaterialEnum.Stone, "stoneCopperShovel");
            boneCopperShovel = new InfiToolShovel(PropsHelperInfiTools.copperShovelID+2, 
                    InfiMaterialEnum.Copper, InfiMaterialEnum.Bone, "boneCopperShovel");
            netherrackCopperShovel = new InfiToolShovel(PropsHelperInfiTools.copperShovelID+3, 
                    InfiMaterialEnum.Copper, InfiMaterialEnum.Netherrack, "netherrackCopperShovel");
            slimeCopperShovel = new InfiToolShovel(PropsHelperInfiTools.copperShovelID+4, 
                    InfiMaterialEnum.Copper, InfiMaterialEnum.Slime, "slimeCopperShovel");
            cactusCopperShovel = new InfiToolShovel(PropsHelperInfiTools.copperShovelID+5, 
                    InfiMaterialEnum.Copper, InfiMaterialEnum.Cactus, "cactusCopperShovel");
            flintCopperShovel = new InfiToolShovel(PropsHelperInfiTools.copperShovelID+6, 
                    InfiMaterialEnum.Copper, InfiMaterialEnum.Flint, "flintCopperShovel");
            copperCopperShovel = new InfiToolShovel(PropsHelperInfiTools.copperShovelID+7, 
                    InfiMaterialEnum.Copper, InfiMaterialEnum.Copper, "copperCopperShovel");
            
            MinecraftForge.setToolClass(woodCopperShovel, "shovel", InfiMaterialEnum.Copper.getHarvestLevel());
        	MinecraftForge.setToolClass(stoneCopperShovel, "shovel", InfiMaterialEnum.Copper.getHarvestLevel());
            MinecraftForge.setToolClass(boneCopperShovel, "shovel", InfiMaterialEnum.Copper.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackCopperShovel, "shovel", InfiMaterialEnum.Copper.getHarvestLevel());
            MinecraftForge.setToolClass(slimeCopperShovel, "shovel", InfiMaterialEnum.Copper.getHarvestLevel());
            MinecraftForge.setToolClass(cactusCopperShovel, "shovel", InfiMaterialEnum.Copper.getHarvestLevel());
            MinecraftForge.setToolClass(flintCopperShovel, "shovel", InfiMaterialEnum.Copper.getHarvestLevel());
            MinecraftForge.setToolClass(copperCopperShovel, "shovel", InfiMaterialEnum.Copper.getHarvestLevel());
        }
        
        if(PropsHelperInfiTools.enableBronzeTools)
        {
        	woodBronzeShovel = new InfiToolShovel(PropsHelperInfiTools.bronzeShovelID+0, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Wood, "woodBronzeShovel");
            stoneBronzeShovel = new InfiToolShovel(PropsHelperInfiTools.bronzeShovelID+1, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Stone, "stoneBronzeShovel");
            boneBronzeShovel = new InfiToolShovel(PropsHelperInfiTools.bronzeShovelID+2, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Bone, "boneBronzeShovel");
            netherrackBronzeShovel = new InfiToolShovel(PropsHelperInfiTools.bronzeShovelID+3, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Netherrack, "netherrackBronzeShovel");
            slimeBronzeShovel = new InfiToolShovel(PropsHelperInfiTools.bronzeShovelID+4, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Slime, "slimeBronzeShovel");
            cactusBronzeShovel = new InfiToolShovel(PropsHelperInfiTools.bronzeShovelID+5, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Cactus, "cactusBronzeShovel");
            flintBronzeShovel = new InfiToolShovel(PropsHelperInfiTools.bronzeShovelID+6, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Flint, "flintBronzeShovel");
            copperBronzeShovel = new InfiToolShovel(PropsHelperInfiTools.bronzeShovelID+7, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Copper, "copperBronzeShovel");
            bronzeBronzeShovel = new InfiToolShovel(PropsHelperInfiTools.bronzeShovelID+8, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Bronze, "copperBronzeShovel");
            
            MinecraftForge.setToolClass(woodBronzeShovel, "shovel", InfiMaterialEnum.Bronze.getHarvestLevel());
            MinecraftForge.setToolClass(stoneBronzeShovel, "shovel", InfiMaterialEnum.Bronze.getHarvestLevel());
            MinecraftForge.setToolClass(boneBronzeShovel, "shovel", InfiMaterialEnum.Bronze.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackBronzeShovel, "shovel", InfiMaterialEnum.Bronze.getHarvestLevel());
            MinecraftForge.setToolClass(slimeBronzeShovel, "shovel", InfiMaterialEnum.Bronze.getHarvestLevel());
            MinecraftForge.setToolClass(cactusBronzeShovel, "shovel", InfiMaterialEnum.Bronze.getHarvestLevel());
            MinecraftForge.setToolClass(flintBronzeShovel, "shovel", InfiMaterialEnum.Bronze.getHarvestLevel());
            MinecraftForge.setToolClass(copperBronzeShovel, "shovel", InfiMaterialEnum.Bronze.getHarvestLevel());
            MinecraftForge.setToolClass(bronzeBronzeShovel, "shovel", InfiMaterialEnum.Bronze.getHarvestLevel());
        }
        
        if(PropsHelperInfiTools.enableWorkedIronTools)
        {
        	woodWorkedIronShovel = new InfiToolShovel(PropsHelperInfiTools.workedIronShovelID+0, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Wood, "woodWorkedIronShovel");
            stoneWorkedIronShovel = new InfiToolShovel(PropsHelperInfiTools.workedIronShovelID+1, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Stone, "stoneWorkedIronShovel");
            ironWorkedIronShovel = new InfiToolShovel(PropsHelperInfiTools.workedIronShovelID+2,
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Iron, "ironWorkedIronShovel");
            diamondWorkedIronShovel = new InfiToolShovel(PropsHelperInfiTools.workedIronShovelID+3, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Diamond, "diamondWorkedIronShovel");
            redstoneWorkedIronShovel = new InfiToolShovel(PropsHelperInfiTools.workedIronShovelID+4, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Redstone, "redstoneWorkedIronShovel");
            obsidianWorkedIronShovel = new InfiToolShovel(PropsHelperInfiTools.workedIronShovelID+5, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Obsidian, "obsidianWorkedIronShovel");
            boneWorkedIronShovel = new InfiToolShovel(PropsHelperInfiTools.workedIronShovelID+6, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Bone, "boneWorkedIronShovel");
            netherrackWorkedIronShovel = new InfiToolShovel(PropsHelperInfiTools.workedIronShovelID+7, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Netherrack, "netherrackWorkedIronShovel");
            glowstoneWorkedIronShovel = new InfiToolShovel(PropsHelperInfiTools.workedIronShovelID+8, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Glowstone, "glowstoneWorkedIronShovel");
            iceWorkedIronShovel = new InfiToolShovel(PropsHelperInfiTools.workedIronShovelID+9, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Ice, "iceWorkedIronShovel");
            slimeWorkedIronShovel = new InfiToolShovel(PropsHelperInfiTools.workedIronShovelID+10, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Slime, "slimeWorkedIronShovel");
            cactusWorkedIronShovel = new InfiToolShovel(PropsHelperInfiTools.workedIronShovelID+11, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Cactus, "cactusWorkedIronShovel");
            blazeWorkedIronShovel = new InfiToolShovel(PropsHelperInfiTools.workedIronShovelID+12, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Blaze, "blazeWorkedIronShovel");
            copperWorkedIronShovel = new InfiToolShovel(PropsHelperInfiTools.workedIronShovelID+13, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Copper, "copperWorkedIronShovel");
            bronzeWorkedIronShovel = new InfiToolShovel(PropsHelperInfiTools.workedIronShovelID+14, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Bronze, "bronzeWorkedIronShovel");
            workedWorkedIronShovel = new InfiToolShovel(PropsHelperInfiTools.workedIronShovelID+15, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.WorkedIron, "workedWorkedIronShovel");
            steelWorkedIronShovel = new InfiToolShovel(PropsHelperInfiTools.workedIronShovelID+16, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Steel, "steelWorkedIronShovel");
            uraniumWorkedIronShovel = new InfiToolShovel(PropsHelperInfiTools.workedIronShovelID+17, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Bronze, "uraniumWorkedIronShovel");
            
            MinecraftForge.setToolClass(woodWorkedIronShovel, "shovel", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(stoneWorkedIronShovel, "shovel", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(ironWorkedIronShovel, "shovel", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(diamondWorkedIronShovel, "shovel", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(redstoneWorkedIronShovel, "shovel", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(obsidianWorkedIronShovel, "shovel", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(boneWorkedIronShovel, "shovel", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackWorkedIronShovel, "shovel", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(glowstoneWorkedIronShovel, "shovel", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(iceWorkedIronShovel, "shovel", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(slimeWorkedIronShovel, "shovel", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(cactusWorkedIronShovel, "shovel", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(blazeWorkedIronShovel, "shovel", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(copperWorkedIronShovel, "shovel", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(bronzeWorkedIronShovel, "shovel", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(workedWorkedIronShovel, "shovel", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(steelWorkedIronShovel, "shovel", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(uraniumWorkedIronShovel, "shovel", InfiMaterialEnum.WorkedIron.getHarvestLevel());
        }
        
        if(PropsHelperInfiTools.enableSteelTools)
        {
        	woodSteelShovel = new InfiToolShovel(PropsHelperInfiTools.steelShovelID+0, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Wood, "woodSteelShovel");
            stoneSteelShovel = new InfiToolShovel(PropsHelperInfiTools.steelShovelID+1, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Stone, "stoneSteelShovel");
            ironSteelShovel = new InfiToolShovel(PropsHelperInfiTools.steelShovelID+2, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Iron, "ironSteelShovel");
            diamondSteelShovel = new InfiToolShovel(PropsHelperInfiTools.steelShovelID+3, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Diamond, "diamondSteelShovel");
            redstoneSteelShovel = new InfiToolShovel(PropsHelperInfiTools.steelShovelID+4, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Redstone, "redstoneSteelShovel");
            obsidianSteelShovel = new InfiToolShovel(PropsHelperInfiTools.steelShovelID+5, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Obsidian, "obsidianSteelShovel");
            boneSteelShovel = new InfiToolShovel(PropsHelperInfiTools.steelShovelID+6, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Bone, "boneSteelShovel");
            netherrackSteelShovel = new InfiToolShovel(PropsHelperInfiTools.steelShovelID+7, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Netherrack, "netherrackSteelShovel");
            glowstoneSteelShovel = new InfiToolShovel(PropsHelperInfiTools.steelShovelID+8, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Glowstone, "glowstoneSteelShovel");
            iceSteelShovel = new InfiToolShovel(PropsHelperInfiTools.steelShovelID+9, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Ice, "iceSteelShovel");
            slimeSteelShovel = new InfiToolShovel(PropsHelperInfiTools.steelShovelID+10, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Slime, "slimeSteelShovel");
            cactusSteelShovel = new InfiToolShovel(PropsHelperInfiTools.steelShovelID+11, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Cactus, "cactusSteelShovel");
            blazeSteelShovel = new InfiToolShovel(PropsHelperInfiTools.steelShovelID+12, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Blaze, "blazeSteelShovel");
            copperSteelShovel = new InfiToolShovel(PropsHelperInfiTools.steelShovelID+13, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Copper, "copperSteelShovel");
            bronzeSteelShovel = new InfiToolShovel(PropsHelperInfiTools.steelShovelID+14, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Bronze, "bronzeSteelShovel");
            workedSteelShovel = new InfiToolShovel(PropsHelperInfiTools.steelShovelID+15, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.WorkedIron, "workedSteelShovel");
            steelSteelShovel = new InfiToolShovel(PropsHelperInfiTools.steelShovelID+16, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Steel, "steelSteelShovel");
            cobaltSteelShovel = new InfiToolShovel(PropsHelperInfiTools.steelShovelID+17, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Cobalt, "cobaltSteelShovel");
            arditeSteelShovel = new InfiToolShovel(PropsHelperInfiTools.steelShovelID+18, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Ardite, "arditeSteelShovel");
            uraniumSteelShovel = new InfiToolShovel(PropsHelperInfiTools.steelShovelID+19, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Bronze, "uraniumSteelShovel");

            MinecraftForge.setToolClass(woodSteelShovel, "shovel", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(stoneSteelShovel, "shovel", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(ironSteelShovel, "shovel", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(diamondSteelShovel, "shovel", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(redstoneSteelShovel, "shovel", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(obsidianSteelShovel, "shovel", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(boneSteelShovel, "shovel", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackSteelShovel, "shovel", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(glowstoneSteelShovel, "shovel", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(iceSteelShovel, "shovel", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(slimeSteelShovel, "shovel", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(cactusSteelShovel, "shovel", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(blazeSteelShovel, "shovel", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(copperSteelShovel, "shovel", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(bronzeSteelShovel, "shovel", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(workedSteelShovel, "shovel", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(steelSteelShovel, "shovel", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(cobaltSteelShovel, "shovel", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(arditeSteelShovel, "shovel", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(uraniumSteelShovel, "shovel", InfiMaterialEnum.Steel.getHarvestLevel());
        }
        
        if(PropsHelperInfiTools.enableCobaltTools)
        {
        	woodCobaltShovel = new InfiToolShovel(PropsHelperInfiTools.cobaltShovelID+0, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Wood, "woodCobaltShovel");
            stoneCobaltShovel = new InfiToolShovel(PropsHelperInfiTools.cobaltShovelID+1, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Stone, "stoneCobaltShovel");
            ironCobaltShovel = new InfiToolShovel(PropsHelperInfiTools.cobaltShovelID+2, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Iron, "ironCobaltShovel");
            diamondCobaltShovel = new InfiToolShovel(PropsHelperInfiTools.cobaltShovelID+3,
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Diamond, "diamondCobaltShovel");
            redstoneCobaltShovel = new InfiToolShovel(PropsHelperInfiTools.cobaltShovelID+4, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Redstone, "redstoneCobaltShovel");
            obsidianCobaltShovel = new InfiToolShovel(PropsHelperInfiTools.cobaltShovelID+5, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Obsidian, "obsidianCobaltShovel");
            boneCobaltShovel = new InfiToolShovel(PropsHelperInfiTools.cobaltShovelID+6, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Bone, "boneCobaltShovel");
            slimeCobaltShovel = new InfiToolShovel(PropsHelperInfiTools.cobaltShovelID+7, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Slime, "slimeCobaltShovel");
            cactusCobaltShovel = new InfiToolShovel(PropsHelperInfiTools.cobaltShovelID+8, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Cactus, "cactusCobaltShovel");
            blazeCobaltShovel = new InfiToolShovel(PropsHelperInfiTools.cobaltShovelID+9, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Blaze, "blazeCobaltShovel");
            copperCobaltShovel = new InfiToolShovel(PropsHelperInfiTools.cobaltShovelID+10, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Copper, "copperCobaltShovel");
            bronzeCobaltShovel = new InfiToolShovel(PropsHelperInfiTools.cobaltShovelID+11, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Bronze, "bronzeCobaltShovel");
            workedCobaltShovel = new InfiToolShovel(PropsHelperInfiTools.cobaltShovelID+12, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.WorkedIron, "workedCobaltShovel");
            steelCobaltShovel = new InfiToolShovel(PropsHelperInfiTools.cobaltShovelID+13, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Steel, "steelCobaltShovel");
            cobaltCobaltShovel = new InfiToolShovel(PropsHelperInfiTools.cobaltShovelID+14, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Cobalt, "cobaltCobaltShovel");
            arditeCobaltShovel = new InfiToolShovel(PropsHelperInfiTools.cobaltShovelID+15, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Ardite, "arditeCobaltShovel");
            manyullynCobaltShovel = new InfiToolShovel(PropsHelperInfiTools.cobaltShovelID+16, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Manyullyn, "arditeCobaltShovel");
            uraniumCobaltShovel = new InfiToolShovel(PropsHelperInfiTools.cobaltShovelID+17, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Bronze, "uraniumCobaltShovel");
            
            MinecraftForge.setToolClass(woodCobaltShovel, "shovel", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(stoneCobaltShovel, "shovel", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(ironCobaltShovel, "shovel", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(diamondCobaltShovel, "shovel", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(redstoneCobaltShovel, "shovel", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(obsidianCobaltShovel, "shovel", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(boneCobaltShovel, "shovel", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(slimeCobaltShovel, "shovel", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(cactusCobaltShovel, "shovel", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(blazeCobaltShovel, "shovel", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(copperCobaltShovel, "shovel", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(bronzeCobaltShovel, "shovel", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(workedCobaltShovel, "shovel", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(steelCobaltShovel, "shovel", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(cobaltCobaltShovel, "shovel", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(arditeCobaltShovel, "shovel", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(manyullynCobaltShovel, "shovel", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(uraniumCobaltShovel, "shovel", InfiMaterialEnum.Cobalt.getHarvestLevel());
        }
        
        if(PropsHelperInfiTools.enableArditeTools)
        {
        	woodArditeShovel = new InfiToolShovel(PropsHelperInfiTools.arditeShovelID+0, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Wood, "woodArditeShovel");
            stoneArditeShovel = new InfiToolShovel(PropsHelperInfiTools.arditeShovelID+1, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Stone, "stoneArditeShovel");
            ironArditeShovel = new InfiToolShovel(PropsHelperInfiTools.arditeShovelID+2, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Iron, "ironArditeShovel");
            diamondArditeShovel = new InfiToolShovel(PropsHelperInfiTools.arditeShovelID+3,
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Diamond, "diamondArditeShovel");
            redstoneArditeShovel = new InfiToolShovel(PropsHelperInfiTools.arditeShovelID+4, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Redstone, "redstoneArditeShovel");
            obsidianArditeShovel = new InfiToolShovel(PropsHelperInfiTools.arditeShovelID+5, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Obsidian, "obsidianArditeShovel");
            boneArditeShovel = new InfiToolShovel(PropsHelperInfiTools.arditeShovelID+6,
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Bone, "boneArditeShovel");
            slimeArditeShovel = new InfiToolShovel(PropsHelperInfiTools.arditeShovelID+7, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Slime, "slimeArditeShovel");
            cactusArditeShovel = new InfiToolShovel(PropsHelperInfiTools.arditeShovelID+8, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Cactus, "cactusArditeShovel");
            blazeArditeShovel = new InfiToolShovel(PropsHelperInfiTools.arditeShovelID+9, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Blaze, "blazeArditeShovel");
            copperArditeShovel = new InfiToolShovel(PropsHelperInfiTools.arditeShovelID+10, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Copper, "copperArditeShovel");
            bronzeArditeShovel = new InfiToolShovel(PropsHelperInfiTools.arditeShovelID+11, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Bronze, "bronzeArditeShovel");
            workedArditeShovel = new InfiToolShovel(PropsHelperInfiTools.arditeShovelID+12, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.WorkedIron, "workedArditeShovel");
            steelArditeShovel = new InfiToolShovel(PropsHelperInfiTools.arditeShovelID+13, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Steel, "steelArditeShovel");
            cobaltArditeShovel = new InfiToolShovel(PropsHelperInfiTools.arditeShovelID+14, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Cobalt, "cobaltArditeShovel");
            arditeArditeShovel = new InfiToolShovel(PropsHelperInfiTools.arditeShovelID+15, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Ardite, "arditeArditeShovel");
            manyullynArditeShovel = new InfiToolShovel(PropsHelperInfiTools.arditeShovelID+16, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Manyullyn, "arditeArditeShovel");
            uraniumArditeShovel = new InfiToolShovel(PropsHelperInfiTools.arditeShovelID+17, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Bronze, "uraniumArditeShovel");
            
            MinecraftForge.setToolClass(woodArditeShovel, "shovel", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(stoneArditeShovel, "shovel", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(ironArditeShovel, "shovel", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(diamondArditeShovel, "shovel", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(redstoneArditeShovel, "shovel", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(obsidianArditeShovel, "shovel", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(boneArditeShovel, "shovel", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(slimeArditeShovel, "shovel", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(cactusArditeShovel, "shovel", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(blazeArditeShovel, "shovel", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(copperArditeShovel, "shovel", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(bronzeArditeShovel, "shovel", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(workedArditeShovel, "shovel", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(steelArditeShovel, "shovel", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(cobaltArditeShovel, "shovel", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(arditeArditeShovel, "shovel", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(manyullynArditeShovel, "shovel", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(uraniumArditeShovel, "shovel", InfiMaterialEnum.Ardite.getHarvestLevel());
        }
        
        if(PropsHelperInfiTools.enableManyullynTools)
        {
        	woodManyullynShovel = new InfiToolShovel(PropsHelperInfiTools.manyullynShovelID+0, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Stone, "woodManyullynShovel");
            stoneManyullynShovel = new InfiToolShovel(PropsHelperInfiTools.manyullynShovelID+1, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Stone, "stoneManyullynShovel");
            ironManyullynShovel = new InfiToolShovel(PropsHelperInfiTools.manyullynShovelID+2, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Iron, "ironManyullynShovel");
            diamondManyullynShovel = new InfiToolShovel(PropsHelperInfiTools.manyullynShovelID+3,
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Diamond, "diamondManyullynShovel");
            redstoneManyullynShovel = new InfiToolShovel(PropsHelperInfiTools.manyullynShovelID+4, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Redstone, "redstoneManyullynShovel");
            obsidianManyullynShovel = new InfiToolShovel(PropsHelperInfiTools.manyullynShovelID+5, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Obsidian, "obsidianManyullynShovel");
            boneManyullynShovel = new InfiToolShovel(PropsHelperInfiTools.manyullynShovelID+6, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Bone, "boneManyullynShovel");
            slimeManyullynShovel = new InfiToolShovel(PropsHelperInfiTools.manyullynShovelID+7, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Slime, "slimeManyullynShovel");
            cactusManyullynShovel = new InfiToolShovel(PropsHelperInfiTools.manyullynShovelID+8, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Cactus, "cactusManyullynShovel");
            blazeManyullynShovel = new InfiToolShovel(PropsHelperInfiTools.manyullynShovelID+9, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Blaze, "blazeManyullynShovel");
            copperManyullynShovel = new InfiToolShovel(PropsHelperInfiTools.manyullynShovelID+10, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Copper, "copperManyullynShovel");
            bronzeManyullynShovel = new InfiToolShovel(PropsHelperInfiTools.manyullynShovelID+11, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Bronze, "bronzeManyullynShovel");
            workedManyullynShovel = new InfiToolShovel(PropsHelperInfiTools.manyullynShovelID+12, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.WorkedIron, "workedManyullynShovel");
            steelManyullynShovel = new InfiToolShovel(PropsHelperInfiTools.manyullynShovelID+13, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Steel, "steelManyullynShovel");
            cobaltManyullynShovel = new InfiToolShovel(PropsHelperInfiTools.manyullynShovelID+14, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Cobalt, "cobaltManyullynShovel");
            arditeManyullynShovel = new InfiToolShovel(PropsHelperInfiTools.manyullynShovelID+15, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Ardite, "arditeManyullynShovel");
            manyullynManyullynShovel = new InfiToolShovel(PropsHelperInfiTools.manyullynShovelID+16, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Manyullyn, "arditeManyullynShovel");
            uraniumManyullynShovel = new InfiToolShovel(PropsHelperInfiTools.manyullynShovelID+17,
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Bronze, "uraniumManyullynShovel");
            
            MinecraftForge.setToolClass(woodManyullynShovel, "shovel", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(stoneManyullynShovel, "shovel", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(ironManyullynShovel, "shovel", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(diamondManyullynShovel, "shovel", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(redstoneManyullynShovel, "shovel", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(obsidianManyullynShovel, "shovel", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(boneManyullynShovel, "shovel", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(slimeManyullynShovel, "shovel", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(cactusManyullynShovel, "shovel", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(blazeManyullynShovel, "shovel", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(copperManyullynShovel, "shovel", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(bronzeManyullynShovel, "shovel", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(workedManyullynShovel, "shovel", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(steelManyullynShovel, "shovel", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(cobaltManyullynShovel, "shovel", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(arditeManyullynShovel, "shovel", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(manyullynManyullynShovel, "shovel", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(uraniumManyullynShovel, "shovel", InfiMaterialEnum.Manyullyn.getHarvestLevel());
        }
        
        if(PropsHelperInfiTools.enableUraniumTools)
        {
            diamondUraniumShovel = new InfiToolShovel(PropsHelperInfiTools.uraniumShovelID+0, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Diamond, "diamondUraniumShovel");
            redstoneUraniumShovel = new InfiToolShovel(PropsHelperInfiTools.uraniumShovelID+1, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Redstone, "redstoneUraniumShovel");
            boneUraniumShovel = new InfiToolShovel(PropsHelperInfiTools.uraniumShovelID+2, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Bone, "boneUraniumShovel");
            netherrackUraniumShovel = new InfiToolShovel(PropsHelperInfiTools.uraniumShovelID+3, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Netherrack, "netherrackUraniumShovel");
            glowstoneUraniumShovel = new InfiToolShovel(PropsHelperInfiTools.uraniumShovelID+4, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Glowstone, "glowstoneUraniumShovel");
            lavaUraniumShovel = new InfiToolShovel(PropsHelperInfiTools.uraniumShovelID+5, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Lava, "lavaUraniumShovel");
            blazeUraniumShovel = new InfiToolShovel(PropsHelperInfiTools.uraniumShovelID+6, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Blaze, "blazeUraniumShovel");
            cobaltUraniumShovel = new InfiToolShovel(PropsHelperInfiTools.uraniumShovelID+7, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Cobalt, "cobaltUraniumShovel");
            arditeUraniumShovel = new InfiToolShovel(PropsHelperInfiTools.uraniumShovelID+8, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Ardite, "arditeUraniumShovel");
            uraniumUraniumShovel = new InfiToolShovel(PropsHelperInfiTools.uraniumShovelID+9, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Uranium, "uraniumUraniumShovel");
            
            MinecraftForge.setToolClass(diamondUraniumShovel, "shovel", InfiMaterialEnum.Uranium.getHarvestLevel());
            MinecraftForge.setToolClass(redstoneUraniumShovel, "shovel", InfiMaterialEnum.Uranium.getHarvestLevel());
            MinecraftForge.setToolClass(boneUraniumShovel, "shovel", InfiMaterialEnum.Uranium.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackUraniumShovel, "shovel", InfiMaterialEnum.Uranium.getHarvestLevel());
            MinecraftForge.setToolClass(glowstoneUraniumShovel, "shovel", InfiMaterialEnum.Uranium.getHarvestLevel());
            MinecraftForge.setToolClass(lavaUraniumShovel, "shovel", InfiMaterialEnum.Uranium.getHarvestLevel());
            MinecraftForge.setToolClass(blazeUraniumShovel, "shovel", InfiMaterialEnum.Uranium.getHarvestLevel());
            MinecraftForge.setToolClass(cobaltUraniumShovel, "shovel", InfiMaterialEnum.Uranium.getHarvestLevel());
            MinecraftForge.setToolClass(arditeUraniumShovel, "shovel", InfiMaterialEnum.Uranium.getHarvestLevel());
            MinecraftForge.setToolClass(uraniumUraniumShovel, "shovel", InfiMaterialEnum.Uranium.getHarvestLevel());
        }
    }
    
    private static void addNames()
    {
    	ModLoader.addName(woodWoodShovel, "Wooden Shovel");
    	ModLoader.addName(stoneStoneShovel, "Heavy Shovel");
    	ModLoader.addName(ironIronShovel, "Ironic Shovel");
    	ModLoader.addName(diamondDiamondShovel, "Diamondium Shovel");
    	ModLoader.addName(redstoneRedstoneShovel, "Redredred Shovel");
    	ModLoader.addName(obsidianObsidianShovel, "Ebony Shovel");
    	ModLoader.addName(sandstoneSandstoneShovel, "Fragile Shovel");
    	ModLoader.addName(boneBoneShovel, "Necrotic Shovel");
    	ModLoader.addName(paperPaperShovel, "Soft Shovel");
    	ModLoader.addName(mossyMossyShovel, "Living Shovel");
    	ModLoader.addName(netherrackNetherrackShovel, "Blood Shovel");
    	ModLoader.addName(glowstoneGlowstoneShovel, "Bright Shovel");
    	ModLoader.addName(iceIceShovel, "Freezing Shovel");
    	ModLoader.addName(lavaLavaShovel, "Burning Shovel");
    	ModLoader.addName(slimeSlimeShovel, "Toy Shovel");
    	ModLoader.addName(cactusCactusShovel, "Thorned Shovel");
    	ModLoader.addName(flintFlintShovel, "Rough-hewn Shovel");
    	ModLoader.addName(blazeBlazeShovel, "Netherite Shovel");
        ModLoader.addName(copperCopperShovel, "Orange-Tang Shovel");
        ModLoader.addName(bronzeBronzeShovel, "Polished Shovel");
        ModLoader.addName(workedWorkedIronShovel, "Reworked Iron Shovel");
        ModLoader.addName(steelSteelShovel, "Forge-Wrought Shovel");
        ModLoader.addName(cobaltCobaltShovel, "Beautiful Shovel");
        ModLoader.addName(arditeArditeShovel, "Rustic Shovel");
        ModLoader.addName(manyullynManyullynShovel, "False-Prophetic Shovel");
        ModLoader.addName(uraniumUraniumShovel, "Cancerous Shovel");
    }
    
    public static void registerInfiToolsRecipes()
    {
    	if(PropsHelperInfiTools.enableWoodTools)
        {
            ModLoader.addRecipe(new ItemStack(woodWoodShovel), new Object[] 
                    { recipe, '#', Block.planks, '|', Item.stick });
            ModLoader.addRecipe(new ItemStack(sandstoneWoodShovel), new Object[] 
                    { recipe, '#', Block.planks, '|', mod_InfiBase.sandstoneRod });
            ModLoader.addRecipe(new ItemStack(boneWoodShovel), new Object[] 
                    { recipe, '#', Block.planks, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneWoodShovel), new Object[] 
                    { recipe, '#', Block.planks, '|', mod_InfiBase.boneRod });
            ModLoader.addRecipe(new ItemStack(paperWoodShovel), new Object[] 
                    { recipe, '#', Block.planks, '|', mod_InfiBase.paperRod });
            ModLoader.addRecipe(new ItemStack(iceWoodShovel), new Object[] 
                    { recipe, '#', Block.planks, '|', mod_InfiBase.iceRod });
            ModLoader.addRecipe(new ItemStack(slimeWoodShovel), new Object[] 
                    { recipe, '#', Block.planks, '|', mod_InfiBase.slimeRod });
            ModLoader.addRecipe(new ItemStack(cactusWoodShovel), new Object[] 
                    { recipe, '#', Block.planks, '|', mod_InfiBase.cactusRod });
        }
    	
        if(PropsHelperInfiTools.enableStoneTools)
        {
        	ModLoader.addRecipe(new ItemStack(woodStoneShovel), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', Item.stick });
        	ModLoader.addRecipe(new ItemStack(stoneStoneShovel), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', mod_InfiBase.stoneRod });
            ModLoader.addRecipe(new ItemStack(sandstoneStoneShovel), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', mod_InfiBase.sandstoneRod });
            ModLoader.addRecipe(new ItemStack(boneStoneShovel), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneStoneShovel), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', mod_InfiBase.boneRod });
            ModLoader.addRecipe(new ItemStack(netherrackStoneShovel), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', mod_InfiBase.netherrackRod });
            ModLoader.addRecipe(new ItemStack(iceStoneShovel), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', mod_InfiBase.iceRod });
            ModLoader.addRecipe(new ItemStack(slimeStoneShovel), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', mod_InfiBase.slimeRod });
            ModLoader.addRecipe(new ItemStack(cactusStoneShovel), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', mod_InfiBase.cactusRod });
            ModLoader.addRecipe(new ItemStack(flintStoneShovel), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', mod_InfiBase.flintRod });
            
            ModLoader.addRecipe(new ItemStack(woodStoneShovel), new Object[] 
                    { recipe, '#', Block.stone, '|', Item.stick });
        	ModLoader.addRecipe(new ItemStack(stoneStoneShovel), new Object[] 
                    { recipe, '#', Block.stone, '|', mod_InfiBase.stoneRod });
            ModLoader.addRecipe(new ItemStack(sandstoneStoneShovel), new Object[] 
                    { recipe, '#', Block.stone, '|', mod_InfiBase.sandstoneRod });
            ModLoader.addRecipe(new ItemStack(boneStoneShovel), new Object[] 
                    { recipe, '#', Block.stone, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneStoneShovel), new Object[] 
                    { recipe, '#', Block.stone, '|', mod_InfiBase.boneRod });
            ModLoader.addRecipe(new ItemStack(netherrackStoneShovel), new Object[] 
                    { recipe, '#', Block.stone, '|', mod_InfiBase.netherrackRod });
            ModLoader.addRecipe(new ItemStack(iceStoneShovel), new Object[] 
                    { recipe, '#', Block.stone, '|', mod_InfiBase.iceRod });
            ModLoader.addRecipe(new ItemStack(slimeStoneShovel), new Object[] 
                    { recipe, '#', Block.stone, '|', mod_InfiBase.slimeRod });
            ModLoader.addRecipe(new ItemStack(cactusStoneShovel), new Object[] 
                    { recipe, '#', Block.stone, '|', mod_InfiBase.cactusRod });
            ModLoader.addRecipe(new ItemStack(flintStoneShovel), new Object[] 
                    { recipe, '#', Block.stone, '|', mod_InfiBase.flintRod });
        }
        
        if(PropsHelperInfiTools.enableIronTools)
        {
        	ModLoader.addRecipe(new ItemStack(woodIronShovel), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', Item.stick });
        	ModLoader.addRecipe(new ItemStack(stoneIronShovel), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', mod_InfiBase.stoneRod });
            ModLoader.addRecipe(new ItemStack(ironIronShovel), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', mod_InfiBase.ironRod });
            ModLoader.addRecipe(new ItemStack(boneIronShovel), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneIronShovel), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', mod_InfiBase.boneRod });
            ModLoader.addRecipe(new ItemStack(netherrackIronShovel), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', mod_InfiBase.netherrackRod });
            ModLoader.addRecipe(new ItemStack(glowstoneIronShovel), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', mod_InfiBase.glowstoneRod });
            ModLoader.addRecipe(new ItemStack(cactusIronShovel), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', mod_InfiBase.cactusRod });
            ModLoader.addRecipe(new ItemStack(copperIronShovel), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', mod_InfiBase.copperRod });
            ModLoader.addRecipe(new ItemStack(bronzeIronShovel), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', mod_InfiBase.bronzeRod });
        }
        
        if(PropsHelperInfiTools.enableDiamondTools)
        {
        	ModLoader.addRecipe(new ItemStack(woodDiamondShovel), new Object[] 
                    { recipe, '#', Item.diamond, '|', Item.stick });
        	ModLoader.addRecipe(new ItemStack(stoneDiamondShovel), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.stoneRod });
            ModLoader.addRecipe(new ItemStack(ironDiamondShovel), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.ironRod });
            ModLoader.addRecipe(new ItemStack(diamondDiamondShovel), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.diamondRod });
            ModLoader.addRecipe(new ItemStack(redstoneDiamondShovel), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.redstoneRod });
            ModLoader.addRecipe(new ItemStack(obsidianDiamondShovel), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.obsidianRod });
            ModLoader.addRecipe(new ItemStack(boneDiamondShovel), new Object[] 
                    { recipe, '#', Item.diamond, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneDiamondShovel), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.boneRod });
            ModLoader.addRecipe(new ItemStack(mossyDiamondShovel), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.mossyRod });
            ModLoader.addRecipe(new ItemStack(netherrackDiamondShovel), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.netherrackRod });
            ModLoader.addRecipe(new ItemStack(glowstoneDiamondShovel), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.glowstoneRod });
            ModLoader.addRecipe(new ItemStack(lavaDiamondShovel), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.lavaRod });
            ModLoader.addRecipe(new ItemStack(cactusDiamondShovel), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.cactusRod });
            ModLoader.addRecipe(new ItemStack(flintDiamondShovel), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.flintRod });
            ModLoader.addRecipe(new ItemStack(blazeDiamondShovel), new Object[] 
                    { recipe, '#', Item.diamond, '|', Item.blazeRod });
            ModLoader.addRecipe(new ItemStack(copperDiamondShovel), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.copperRod });
            ModLoader.addRecipe(new ItemStack(bronzeDiamondShovel), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.bronzeRod });
            ModLoader.addRecipe(new ItemStack(workedDiamondShovel), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.workedIronRod });
            ModLoader.addRecipe(new ItemStack(steelDiamondShovel), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.steelRod });
            ModLoader.addRecipe(new ItemStack(cobaltDiamondShovel), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.cobaltRod });
            ModLoader.addRecipe(new ItemStack(arditeDiamondShovel), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.arditeRod });
            ModLoader.addRecipe(new ItemStack(manyullynDiamondShovel), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.manyullynRod });
            ModLoader.addRecipe(new ItemStack(uraniumDiamondShovel), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.uraniumRod });
        }
        
        if(PropsHelperInfiTools.enableRedstoneTools)
        {
        	ModLoader.addRecipe(new ItemStack(woodRedstoneShovel), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', Item.stick });
        	ModLoader.addRecipe(new ItemStack(stoneRedstoneShovel), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.stoneRod });
            ModLoader.addRecipe(new ItemStack(ironRedstoneShovel), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.ironRod });
            ModLoader.addRecipe(new ItemStack(redstoneRedstoneShovel), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.redstoneRod });
            ModLoader.addRecipe(new ItemStack(obsidianRedstoneShovel), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.obsidianRod });
            ModLoader.addRecipe(new ItemStack(sandstoneRedstoneShovel), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.sandstoneRod });
            ModLoader.addRecipe(new ItemStack(boneRedstoneShovel), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneRedstoneShovel), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.boneRod });
            ModLoader.addRecipe(new ItemStack(paperRedstoneShovel), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.paperRod });
            ModLoader.addRecipe(new ItemStack(mossyRedstoneShovel), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.mossyRod });
            ModLoader.addRecipe(new ItemStack(netherrackRedstoneShovel), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.netherrackRod });
            ModLoader.addRecipe(new ItemStack(glowstoneRedstoneShovel), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.glowstoneRod });
            ModLoader.addRecipe(new ItemStack(iceRedstoneShovel), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.iceRod });
            ModLoader.addRecipe(new ItemStack(lavaRedstoneShovel), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.lavaRod });
            ModLoader.addRecipe(new ItemStack(slimeRedstoneShovel), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.slimeRod });
            ModLoader.addRecipe(new ItemStack(cactusRedstoneShovel), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.cactusRod });
            ModLoader.addRecipe(new ItemStack(flintRedstoneShovel), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.flintRod });
            ModLoader.addRecipe(new ItemStack(copperRedstoneShovel), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.copperRod });
            ModLoader.addRecipe(new ItemStack(bronzeRedstoneShovel), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.bronzeRod });
            ModLoader.addRecipe(new ItemStack(workedRedstoneShovel), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.workedIronRod });
            ModLoader.addRecipe(new ItemStack(uraniumRedstoneShovel), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.uraniumRod });
        }
        
        if(PropsHelperInfiTools.enableObsidianTools)
        {
        	ModLoader.addRecipe(new ItemStack(woodObsidianShovel), new Object[] 
                    { recipe, '#', Block.obsidian, '|', Item.stick });
        	ModLoader.addRecipe(new ItemStack(stoneObsidianShovel), new Object[] 
                    { recipe, '#', Block.obsidian, '|', mod_InfiBase.stoneRod });
            ModLoader.addRecipe(new ItemStack(redstoneObsidianShovel), new Object[] 
                    { recipe, '#', Block.obsidian, '|', mod_InfiBase.redstoneRod });
            ModLoader.addRecipe(new ItemStack(obsidianObsidianShovel), new Object[] 
                    { recipe, '#', Block.obsidian, '|', mod_InfiBase.obsidianRod });
            ModLoader.addRecipe(new ItemStack(boneObsidianShovel), new Object[] 
                    { recipe, '#', Block.obsidian, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneObsidianShovel), new Object[] 
                    { recipe, '#', Block.obsidian, '|', mod_InfiBase.boneRod });
            ModLoader.addRecipe(new ItemStack(netherrackObsidianShovel), new Object[] 
                    { recipe, '#', Block.obsidian, '|', mod_InfiBase.netherrackRod });
            ModLoader.addRecipe(new ItemStack(glowstoneObsidianShovel), new Object[] 
                    { recipe, '#', Block.obsidian, '|', mod_InfiBase.glowstoneRod });
            ModLoader.addRecipe(new ItemStack(iceObsidianShovel), new Object[] 
                    { recipe, '#', Block.obsidian, '|', mod_InfiBase.iceRod });
            ModLoader.addRecipe(new ItemStack(lavaObsidianShovel), new Object[] 
                    { recipe, '#', Block.obsidian, '|', mod_InfiBase.lavaRod });
            ModLoader.addRecipe(new ItemStack(cactusObsidianShovel), new Object[] 
                    { recipe, '#', Block.obsidian, '|', mod_InfiBase.cactusRod });
        }
        
        if(PropsHelperInfiTools.enableSandstoneTools)
        {
            ModLoader.addRecipe(new ItemStack(woodSandstoneShovel), new Object[] 
                    { recipe, '#', Block.sandStone, '|', Item.stick });
            ModLoader.addRecipe(new ItemStack(sandstoneSandstoneShovel), new Object[] 
                    { recipe, '#', Block.sandStone, '|', mod_InfiBase.sandstoneRod });
            ModLoader.addRecipe(new ItemStack(boneSandstoneShovel), new Object[] 
                    { recipe, '#', Block.sandStone, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneSandstoneShovel), new Object[] 
                    { recipe, '#', Block.sandStone, '|', mod_InfiBase.boneRod });      
            ModLoader.addRecipe(new ItemStack(netherrackSandstoneShovel), new Object[] 
                    { recipe, '#', Block.sandStone, '|', mod_InfiBase.netherrackRod });
            ModLoader.addRecipe(new ItemStack(iceSandstoneShovel), new Object[] 
                    { recipe, '#', Block.sandStone, '|', mod_InfiBase.iceRod });
            ModLoader.addRecipe(new ItemStack(slimeSandstoneShovel), new Object[] 
                    { recipe, '#', Block.sandStone, '|', mod_InfiBase.slimeRod });
            ModLoader.addRecipe(new ItemStack(cactusSandstoneShovel), new Object[] 
                    { recipe, '#', Block.sandStone, '|', mod_InfiBase.cactusRod });
            ModLoader.addRecipe(new ItemStack(flintSandstoneShovel), new Object[] 
                    { recipe, '#', Block.sandStone, '|', mod_InfiBase.flintRod });
        }
        
        if(PropsHelperInfiTools.enableBoneTools)
        {
            ModLoader.addRecipe(new ItemStack(woodBoneShovel), new Object[] 
                    { recipe, '#', Item.bone, '|', Item.stick });
            ModLoader.addRecipe(new ItemStack(stoneBoneShovel), new Object[] 
                    { recipe, '#', Item.bone, '|', mod_InfiBase.stoneRod });
            ModLoader.addRecipe(new ItemStack(sandstoneBoneShovel), new Object[] 
                    { recipe, '#', Item.bone, '|', mod_InfiBase.sandstoneRod });
            ModLoader.addRecipe(new ItemStack(boneBoneShovel), new Object[] 
                    { recipe, '#', Item.bone, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneBoneShovel), new Object[] 
                    { recipe, '#', Item.bone, '|', mod_InfiBase.boneRod });
            ModLoader.addRecipe(new ItemStack(paperBoneShovel), new Object[] 
                    { recipe, '#', Item.bone, '|', mod_InfiBase.paperRod });
            ModLoader.addRecipe(new ItemStack(netherrackBoneShovel), new Object[] 
                    { recipe, '#', Item.bone, '|', mod_InfiBase.netherrackRod });
            ModLoader.addRecipe(new ItemStack(iceBoneShovel), new Object[] 
                    { recipe, '#', Item.bone, '|', mod_InfiBase.iceRod });
            ModLoader.addRecipe(new ItemStack(cactusBoneShovel), new Object[] 
                    { recipe, '#', Item.bone, '|', mod_InfiBase.cactusRod });
            ModLoader.addRecipe(new ItemStack(flintBoneShovel), new Object[] 
                    { recipe, '#', Item.bone, '|', mod_InfiBase.flintRod });
        }
        
        if(PropsHelperInfiTools.enablePaperTools)
        {
            ModLoader.addRecipe(new ItemStack(woodPaperShovel), new Object[] 
                    { recipe, '#', mod_InfiBase.paperStack, '|', Item.stick });
            ModLoader.addRecipe(new ItemStack(bonePaperShovel), new Object[] 
                    { recipe, '#', mod_InfiBase.paperStack, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(bonePaperShovel), new Object[] 
                    { recipe, '#', mod_InfiBase.paperStack, '|', mod_InfiBase.boneRod });
            ModLoader.addRecipe(new ItemStack(paperPaperShovel), new Object[] 
                    { recipe, '#', mod_InfiBase.paperStack, '|', mod_InfiBase.paperRod });
            ModLoader.addRecipe(new ItemStack(slimePaperShovel), new Object[] 
                    { recipe, '#', mod_InfiBase.paperStack, '|', mod_InfiBase.slimeRod });
            ModLoader.addRecipe(new ItemStack(cactusPaperShovel), new Object[] 
                    { recipe, '#', mod_InfiBase.paperStack, '|', mod_InfiBase.cactusRod });
        }
        
        if(PropsHelperInfiTools.enableMossyTools)
        {
        	ModLoader.addRecipe(new ItemStack(woodMossyShovel), new Object[] 
                    { recipe, '#', mod_InfiBase.mossyStone, '|', Item.stick });
        	ModLoader.addRecipe(new ItemStack(stoneMossyShovel), new Object[] 
                    { recipe, '#', mod_InfiBase.mossyStone, '|', mod_InfiBase.stoneRod });
            ModLoader.addRecipe(new ItemStack(diamondMossyShovel), new Object[] 
                    { recipe, '#', mod_InfiBase.mossyStone, '|', mod_InfiBase.diamondRod });
            ModLoader.addRecipe(new ItemStack(redstoneMossyShovel), new Object[] 
                    { recipe, '#', mod_InfiBase.mossyStone, '|', mod_InfiBase.redstoneRod });
            ModLoader.addRecipe(new ItemStack(boneMossyShovel), new Object[] 
                    { recipe, '#', mod_InfiBase.mossyStone, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneMossyShovel), new Object[] 
                    { recipe, '#', mod_InfiBase.mossyStone, '|', mod_InfiBase.boneRod });
            ModLoader.addRecipe(new ItemStack(mossyMossyShovel), new Object[] 
                    { recipe, '#', mod_InfiBase.mossyStone, '|', mod_InfiBase.mossyRod });
            ModLoader.addRecipe(new ItemStack(netherrackMossyShovel), new Object[] 
                    { recipe, '#', mod_InfiBase.mossyStone, '|', mod_InfiBase.netherrackRod });
            ModLoader.addRecipe(new ItemStack(glowstoneMossyShovel), new Object[] 
                    { recipe, '#', mod_InfiBase.mossyStone, '|', mod_InfiBase.glowstoneRod });
            ModLoader.addRecipe(new ItemStack(cactusMossyShovel), new Object[] 
                    { recipe, '#', mod_InfiBase.mossyStone, '|', mod_InfiBase.cactusRod });
            ModLoader.addRecipe(new ItemStack(blazeMossyShovel), new Object[] 
                    { recipe, '#', mod_InfiBase.mossyStone, '|', Item.blazeRod });
            ModLoader.addRecipe(new ItemStack(manyullynMossyShovel), new Object[] 
                    { recipe, '#', mod_InfiBase.mossyStone, '|', mod_InfiBase.manyullynRod });
            ModLoader.addRecipe(new ItemStack(uraniumMossyShovel), new Object[] 
                    { recipe, '#', mod_InfiBase.mossyStone, '|', mod_InfiBase.uraniumRod });
        }
        
        if(PropsHelperInfiTools.enableNetherrackTools)
        {
        	ModLoader.addRecipe(new ItemStack(woodNetherrackShovel), new Object[] 
                    { recipe, '#', Block.netherrack, '|', Item.stick });
        	ModLoader.addRecipe(new ItemStack(stoneNetherrackShovel), new Object[] 
                    { recipe, '#', Block.netherrack, '|', mod_InfiBase.stoneRod });
            ModLoader.addRecipe(new ItemStack(sandstoneNetherrackShovel), new Object[] 
                    { recipe, '#', Block.netherrack, '|', mod_InfiBase.sandstoneRod });
            ModLoader.addRecipe(new ItemStack(boneNetherrackShovel), new Object[] 
                    { recipe, '#', Block.netherrack, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneNetherrackShovel), new Object[] 
                    { recipe, '#', Block.netherrack, '|', mod_InfiBase.boneRod });
            ModLoader.addRecipe(new ItemStack(paperNetherrackShovel), new Object[] 
                    { recipe, '#', Block.netherrack, '|', mod_InfiBase.paperRod });
            ModLoader.addRecipe(new ItemStack(mossyNetherrackShovel), new Object[] 
                    { recipe, '#', Block.netherrack, '|', mod_InfiBase.mossyRod });
            ModLoader.addRecipe(new ItemStack(netherrackNetherrackShovel), new Object[] 
                    { recipe, '#', Block.netherrack, '|', mod_InfiBase.netherrackRod });
            ModLoader.addRecipe(new ItemStack(iceNetherrackShovel), new Object[] 
                    { recipe, '#', Block.netherrack, '|', mod_InfiBase.iceRod });
            ModLoader.addRecipe(new ItemStack(slimeNetherrackShovel), new Object[] 
                    { recipe, '#', Block.netherrack, '|', mod_InfiBase.slimeRod });
            ModLoader.addRecipe(new ItemStack(cactusNetherrackShovel), new Object[] 
                    { recipe, '#', Block.netherrack, '|', mod_InfiBase.cactusRod });
            ModLoader.addRecipe(new ItemStack(flintNetherrackShovel), new Object[] 
                    { recipe, '#', Block.netherrack, '|', mod_InfiBase.flintRod });
            ModLoader.addRecipe(new ItemStack(copperNetherrackShovel), new Object[] 
                    { recipe, '#', Block.netherrack, '|', mod_InfiBase.copperRod });
            ModLoader.addRecipe(new ItemStack(bronzeNetherrackShovel), new Object[] 
                    { recipe, '#', Block.netherrack, '|', mod_InfiBase.bronzeRod });
        }
        
        if(PropsHelperInfiTools.enableGlowstoneTools)
        {
        	ModLoader.addRecipe(new ItemStack(woodGlowstoneShovel), new Object[] 
                    { recipe, '#', mod_InfiBase.glowstoneCrystal, '|', Item.stick });
        	ModLoader.addRecipe(new ItemStack(redstoneGlowstoneShovel), new Object[] 
                    { recipe, '#', mod_InfiBase.glowstoneCrystal, '|', mod_InfiBase.glowstoneRod });
        	ModLoader.addRecipe(new ItemStack(obsidianGlowstoneShovel), new Object[] 
                    { recipe, '#', mod_InfiBase.glowstoneCrystal, '|', mod_InfiBase.obsidianRod });
            ModLoader.addRecipe(new ItemStack(boneGlowstoneShovel), new Object[] 
                    { recipe, '#', mod_InfiBase.glowstoneCrystal, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneGlowstoneShovel), new Object[] 
                    { recipe, '#', mod_InfiBase.glowstoneCrystal, '|', mod_InfiBase.boneRod });
            ModLoader.addRecipe(new ItemStack(netherrackGlowstoneShovel), new Object[] 
                    { recipe, '#', mod_InfiBase.glowstoneCrystal, '|', mod_InfiBase.netherrackRod });
            ModLoader.addRecipe(new ItemStack(iceGlowstoneShovel), new Object[] 
                    { recipe, '#', mod_InfiBase.glowstoneCrystal, '|', mod_InfiBase.iceRod });
            ModLoader.addRecipe(new ItemStack(slimeGlowstoneShovel), new Object[] 
                    { recipe, '#', mod_InfiBase.glowstoneCrystal, '|', mod_InfiBase.slimeRod });
            ModLoader.addRecipe(new ItemStack(cactusGlowstoneShovel), new Object[] 
                    { recipe, '#', mod_InfiBase.glowstoneCrystal, '|', mod_InfiBase.cactusRod });
        }
        
        if(PropsHelperInfiTools.enableIceTools)
        {
            ModLoader.addRecipe(new ItemStack(woodIceShovel), new Object[] 
                    { recipe, '#', Block.ice, '|', Item.stick });
            ModLoader.addRecipe(new ItemStack(boneIceShovel), new Object[] 
                    { recipe, '#', Block.ice, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneIceShovel), new Object[] 
                    { recipe, '#', Block.ice, '|', mod_InfiBase.boneRod });
            ModLoader.addRecipe(new ItemStack(paperIceShovel), new Object[] 
                    { recipe, '#', Block.ice, '|', mod_InfiBase.paperRod });
            ModLoader.addRecipe(new ItemStack(iceIceShovel), new Object[] 
                    { recipe, '#', Block.ice, '|', mod_InfiBase.iceRod });
            ModLoader.addRecipe(new ItemStack(slimeIceShovel), new Object[] 
                    { recipe, '#', Block.ice, '|', mod_InfiBase.slimeRod });
            ModLoader.addRecipe(new ItemStack(cactusIceShovel), new Object[] 
                    { recipe, '#', Block.ice, '|', mod_InfiBase.cactusRod });
        }
        
        if(PropsHelperInfiTools.enableLavaTools)
        {
            ModLoader.addRecipe(new ItemStack(diamondLavaShovel), new Object[] 
                    { recipe, '#', mod_InfiBase.lavaCrystal, '|', mod_InfiBase.diamondRod });
            ModLoader.addRecipe(new ItemStack(obsidianLavaShovel), new Object[] 
                    { recipe, '#', mod_InfiBase.lavaCrystal, '|', mod_InfiBase.obsidianRod });
            ModLoader.addRecipe(new ItemStack(netherrackLavaShovel), new Object[] 
                    { recipe, '#', mod_InfiBase.lavaCrystal, '|', mod_InfiBase.netherrackRod });
            ModLoader.addRecipe(new ItemStack(lavaLavaShovel), new Object[] 
                    { recipe, '#', mod_InfiBase.lavaCrystal, '|', mod_InfiBase.lavaRod });
            ModLoader.addRecipe(new ItemStack(flintLavaShovel), new Object[] 
                    { recipe, '#', mod_InfiBase.lavaCrystal, '|', mod_InfiBase.flintRod });
            ModLoader.addRecipe(new ItemStack(blazeLavaShovel), new Object[] 
                    { recipe, '#', mod_InfiBase.lavaCrystal, '|', Item.blazeRod });
            ModLoader.addRecipe(new ItemStack(manyullynLavaShovel), new Object[] 
                    { recipe, '#', mod_InfiBase.lavaCrystal, '|', mod_InfiBase.manyullynRod });
            ModLoader.addRecipe(new ItemStack(uraniumLavaShovel), new Object[] 
                    { recipe, '#', mod_InfiBase.lavaCrystal, '|', mod_InfiBase.uraniumRod });
        }
        
        if(PropsHelperInfiTools.enableSlimeTools)
        {
            ModLoader.addRecipe(new ItemStack(woodSlimeShovel), new Object[] 
                    { recipe, '#', mod_InfiBase.slimeCrystal, '|', Item.stick });
            ModLoader.addRecipe(new ItemStack(sandstoneSlimeShovel), new Object[] 
                    { recipe, '#', mod_InfiBase.slimeCrystal, '|', mod_InfiBase.sandstoneRod });
            ModLoader.addRecipe(new ItemStack(boneSlimeShovel), new Object[] 
                    { recipe, '#', mod_InfiBase.slimeCrystal, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneSlimeShovel), new Object[] 
                    { recipe, '#', mod_InfiBase.slimeCrystal, '|', mod_InfiBase.boneRod });
            ModLoader.addRecipe(new ItemStack(paperSlimeShovel), new Object[] 
                    { recipe, '#', mod_InfiBase.slimeCrystal, '|', mod_InfiBase.paperRod });
            ModLoader.addRecipe(new ItemStack(slimeSlimeShovel), new Object[] 
                    { recipe, '#', mod_InfiBase.slimeCrystal, '|', mod_InfiBase.slimeRod });
            ModLoader.addRecipe(new ItemStack(cactusSlimeShovel), new Object[] 
                    { recipe, '#', mod_InfiBase.slimeCrystal, '|', mod_InfiBase.cactusRod });
        }
        
        if(PropsHelperInfiTools.enableCactusTools)
        {
            ModLoader.addRecipe(new ItemStack(woodCactusShovel), new Object[] 
                    { recipe, '#', Block.cactus, '|', Item.stick });
            ModLoader.addRecipe(new ItemStack(sandstoneCactusShovel), new Object[] 
                    { recipe, '#', Block.cactus, '|', mod_InfiBase.sandstoneRod });
            ModLoader.addRecipe(new ItemStack(boneCactusShovel), new Object[] 
                    { recipe, '#', Block.cactus, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneCactusShovel), new Object[] 
                    { recipe, '#', Block.cactus, '|', mod_InfiBase.boneRod });
            ModLoader.addRecipe(new ItemStack(netherrackCactusShovel), new Object[] 
                    { recipe, '#', Block.cactus, '|', mod_InfiBase.netherrackRod });
            ModLoader.addRecipe(new ItemStack(iceCactusShovel), new Object[] 
                    { recipe, '#', Block.cactus, '|', mod_InfiBase.iceRod });
            ModLoader.addRecipe(new ItemStack(slimeCactusShovel), new Object[] 
                    { recipe, '#', Block.cactus, '|', mod_InfiBase.slimeRod });
            ModLoader.addRecipe(new ItemStack(cactusCactusShovel), new Object[] 
                    { recipe, '#', Block.cactus, '|', mod_InfiBase.cactusRod });
        }
        
        if(PropsHelperInfiTools.enableFlintTools)
        {
        	ModLoader.addRecipe(new ItemStack(woodFlintShovel), new Object[] 
                    { recipe, '#', Item.flint, '|', Item.stick });
        	ModLoader.addRecipe(new ItemStack(stoneFlintShovel), new Object[] 
                    { recipe, '#', Item.flint, '|', mod_InfiBase.stoneRod });
            ModLoader.addRecipe(new ItemStack(sandstoneFlintShovel), new Object[] 
                    { recipe, '#', Item.flint, '|', mod_InfiBase.sandstoneRod });
            ModLoader.addRecipe(new ItemStack(boneFlintShovel), new Object[] 
                    { recipe, '#', Item.flint, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneFlintShovel), new Object[] 
                    { recipe, '#', Item.flint, '|', mod_InfiBase.boneRod });
            ModLoader.addRecipe(new ItemStack(netherrackFlintShovel), new Object[] 
                    { recipe, '#', Item.flint, '|', mod_InfiBase.netherrackRod });
            ModLoader.addRecipe(new ItemStack(slimeFlintShovel), new Object[] 
                    { recipe, '#', Item.flint, '|', mod_InfiBase.slimeRod });
            ModLoader.addRecipe(new ItemStack(cactusFlintShovel), new Object[] 
                    { recipe, '#', Item.flint, '|', mod_InfiBase.cactusRod });
            ModLoader.addRecipe(new ItemStack(flintFlintShovel), new Object[] 
                    { recipe, '#', Item.flint, '|', mod_InfiBase.flintRod });
            ModLoader.addRecipe(new ItemStack(copperFlintShovel), new Object[] 
                    { recipe, '#', Block.netherrack, '|', mod_InfiBase.copperRod });
            ModLoader.addRecipe(new ItemStack(bronzeFlintShovel), new Object[] 
                    { recipe, '#', Block.netherrack, '|', mod_InfiBase.bronzeRod });
        }
        
        if(PropsHelperInfiTools.enableBlazeTools)
        {
            ModLoader.addRecipe(new ItemStack(diamondBlazeShovel), new Object[] 
                    { recipe, '#', mod_InfiBase.blazeCrystal, '|', mod_InfiBase.diamondRod });
            ModLoader.addRecipe(new ItemStack(obsidianBlazeShovel), new Object[] 
                    { recipe, '#', mod_InfiBase.blazeCrystal, '|', mod_InfiBase.obsidianRod });
            ModLoader.addRecipe(new ItemStack(netherrackBlazeShovel), new Object[] 
                    { recipe, '#', mod_InfiBase.blazeCrystal, '|', mod_InfiBase.netherrackRod });
            ModLoader.addRecipe(new ItemStack(lavaBlazeShovel), new Object[] 
                    { recipe, '#', mod_InfiBase.blazeCrystal, '|', mod_InfiBase.lavaRod });
            ModLoader.addRecipe(new ItemStack(flintBlazeShovel), new Object[] 
                    { recipe, '#', mod_InfiBase.blazeCrystal, '|', mod_InfiBase.flintRod });
            ModLoader.addRecipe(new ItemStack(blazeBlazeShovel), new Object[] 
                    { recipe, '#', mod_InfiBase.blazeCrystal, '|', Item.blazeRod });
            ModLoader.addRecipe(new ItemStack(manyullynBlazeShovel), new Object[] 
                    { recipe, '#', mod_InfiBase.blazeCrystal, '|', mod_InfiBase.manyullynRod });
            ModLoader.addRecipe(new ItemStack(uraniumBlazeShovel), new Object[] 
                    { recipe, '#', mod_InfiBase.blazeCrystal, '|', mod_InfiBase.uraniumRod });
        }
    }
    
    public static void addStoneTools(ItemStack stack)
    {
    	ModLoader.addRecipe(new ItemStack(woodStoneShovel), new Object[] 
                { recipe, '#', stack, '|', Item.stick });
    	ModLoader.addRecipe(new ItemStack(stoneStoneShovel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.stoneRod });
        ModLoader.addRecipe(new ItemStack(sandstoneStoneShovel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.sandstoneRod });
        ModLoader.addRecipe(new ItemStack(boneStoneShovel), new Object[] 
                { recipe, '#', stack, '|', Item.bone });
        ModLoader.addRecipe(new ItemStack(boneStoneShovel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.boneRod });
        ModLoader.addRecipe(new ItemStack(netherrackStoneShovel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.netherrackRod });
        ModLoader.addRecipe(new ItemStack(iceStoneShovel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.iceRod });
        ModLoader.addRecipe(new ItemStack(slimeStoneShovel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.slimeRod });
        ModLoader.addRecipe(new ItemStack(cactusStoneShovel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.cactusRod });
        ModLoader.addRecipe(new ItemStack(flintStoneShovel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.flintRod });
    }
    
    public static void addCopperTools(ItemStack stack)
    {
    	ModLoader.addRecipe(new ItemStack(woodCopperShovel), new Object[] 
                { recipe, '#', stack, '|', Item.stick });
        ModLoader.addRecipe(new ItemStack(stoneCopperShovel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.stoneRod });
        ModLoader.addRecipe(new ItemStack(boneCopperShovel), new Object[] 
                { recipe, '#', stack, '|', Item.bone });
        ModLoader.addRecipe(new ItemStack(boneCopperShovel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.boneRod });
        ModLoader.addRecipe(new ItemStack(netherrackCopperShovel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.netherrackRod });
        ModLoader.addRecipe(new ItemStack(slimeCopperShovel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.slimeRod });
        ModLoader.addRecipe(new ItemStack(cactusCopperShovel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.cactusRod });
        ModLoader.addRecipe(new ItemStack(flintCopperShovel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.flintRod });
        ModLoader.addRecipe(new ItemStack(copperCopperShovel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.copperRod });
    }
    
    public static void addBronzeTools(ItemStack stack)
    {
    	ModLoader.addRecipe(new ItemStack(woodBronzeShovel), new Object[] 
                { recipe, '#', stack, '|', Item.stick });
        ModLoader.addRecipe(new ItemStack(stoneBronzeShovel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.stoneRod });
        ModLoader.addRecipe(new ItemStack(boneBronzeShovel), new Object[] 
                { recipe, '#', stack, '|', Item.bone });
        ModLoader.addRecipe(new ItemStack(boneBronzeShovel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.boneRod });
        ModLoader.addRecipe(new ItemStack(netherrackBronzeShovel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.netherrackRod });
        ModLoader.addRecipe(new ItemStack(slimeBronzeShovel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.slimeRod });
        ModLoader.addRecipe(new ItemStack(cactusBronzeShovel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.cactusRod });
        ModLoader.addRecipe(new ItemStack(flintBronzeShovel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.flintRod });
        ModLoader.addRecipe(new ItemStack(copperBronzeShovel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.copperRod });
        ModLoader.addRecipe(new ItemStack(bronzeBronzeShovel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.bronzeRod });
    }
    
    public static void addWorkedIronTools(ItemStack stack)
    {
    	ModLoader.addRecipe(new ItemStack(woodWorkedIronShovel), new Object[] 
                { recipe, '#', stack, '|', Item.stick });
        ModLoader.addRecipe(new ItemStack(stoneWorkedIronShovel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.stoneRod });
        ModLoader.addRecipe(new ItemStack(ironWorkedIronShovel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.ironRod });
        ModLoader.addRecipe(new ItemStack(diamondWorkedIronShovel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.diamondRod });
        ModLoader.addRecipe(new ItemStack(redstoneWorkedIronShovel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.redstoneRod });
        ModLoader.addRecipe(new ItemStack(obsidianWorkedIronShovel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.obsidianRod });
        ModLoader.addRecipe(new ItemStack(boneWorkedIronShovel), new Object[] 
                { recipe, '#', stack, '|', Item.bone });
        ModLoader.addRecipe(new ItemStack(boneWorkedIronShovel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.boneRod });
        ModLoader.addRecipe(new ItemStack(netherrackWorkedIronShovel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.netherrackRod });
        ModLoader.addRecipe(new ItemStack(glowstoneWorkedIronShovel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.glowstoneRod });
        ModLoader.addRecipe(new ItemStack(iceWorkedIronShovel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.iceRod });
        ModLoader.addRecipe(new ItemStack(slimeWorkedIronShovel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.slimeRod });
        ModLoader.addRecipe(new ItemStack(cactusWorkedIronShovel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.cactusRod });
        ModLoader.addRecipe(new ItemStack(blazeWorkedIronShovel), new Object[] 
                { recipe, '#', stack, '|', Item.blazeRod });
        ModLoader.addRecipe(new ItemStack(copperWorkedIronShovel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.copperRod });
        ModLoader.addRecipe(new ItemStack(bronzeWorkedIronShovel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.bronzeRod });
        ModLoader.addRecipe(new ItemStack(workedWorkedIronShovel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.workedIronRod });
        ModLoader.addRecipe(new ItemStack(steelWorkedIronShovel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.steelRod });
        ModLoader.addRecipe(new ItemStack(uraniumWorkedIronShovel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.uraniumRod });
    }
    
    public static void addSteelTools(ItemStack stack)
    {
    	ModLoader.addRecipe(new ItemStack(woodSteelShovel), new Object[] 
                { recipe, '#', stack, '|', Item.stick });
        ModLoader.addRecipe(new ItemStack(stoneSteelShovel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.stoneRod });
        ModLoader.addRecipe(new ItemStack(ironSteelShovel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.ironRod });
        ModLoader.addRecipe(new ItemStack(diamondSteelShovel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.diamondRod });
        ModLoader.addRecipe(new ItemStack(redstoneSteelShovel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.redstoneRod });
        ModLoader.addRecipe(new ItemStack(obsidianSteelShovel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.obsidianRod });
        ModLoader.addRecipe(new ItemStack(boneSteelShovel), new Object[] 
                { recipe, '#', stack, '|', Item.bone });
        ModLoader.addRecipe(new ItemStack(boneSteelShovel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.boneRod });
        ModLoader.addRecipe(new ItemStack(netherrackSteelShovel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.netherrackRod });
        ModLoader.addRecipe(new ItemStack(glowstoneSteelShovel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.glowstoneRod });
        ModLoader.addRecipe(new ItemStack(iceSteelShovel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.iceRod });
        ModLoader.addRecipe(new ItemStack(slimeSteelShovel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.slimeRod });
        ModLoader.addRecipe(new ItemStack(cactusSteelShovel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.cactusRod });
        ModLoader.addRecipe(new ItemStack(blazeSteelShovel), new Object[] 
                { recipe, '#', stack, '|', Item.blazeRod });
        ModLoader.addRecipe(new ItemStack(copperSteelShovel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.copperRod });
        ModLoader.addRecipe(new ItemStack(bronzeSteelShovel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.bronzeRod });
        ModLoader.addRecipe(new ItemStack(workedSteelShovel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.workedIronRod });
        ModLoader.addRecipe(new ItemStack(steelSteelShovel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.steelRod });
        ModLoader.addRecipe(new ItemStack(cobaltSteelShovel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.cobaltRod });
        ModLoader.addRecipe(new ItemStack(arditeSteelShovel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.arditeRod });
        ModLoader.addRecipe(new ItemStack(uraniumSteelShovel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.uraniumRod });
    }
    
    public static void addCobaltTools(ItemStack stack)
    {
    	ModLoader.addRecipe(new ItemStack(woodCobaltShovel), new Object[] 
                { recipe, '#', stack, '|', Item.stick });
        ModLoader.addRecipe(new ItemStack(stoneCobaltShovel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.stoneRod });
        ModLoader.addRecipe(new ItemStack(ironCobaltShovel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.ironRod });
        ModLoader.addRecipe(new ItemStack(diamondCobaltShovel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.diamondRod });
        ModLoader.addRecipe(new ItemStack(redstoneCobaltShovel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.redstoneRod });
        ModLoader.addRecipe(new ItemStack(obsidianCobaltShovel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.obsidianRod });
        ModLoader.addRecipe(new ItemStack(boneCobaltShovel), new Object[] 
                { recipe, '#', stack, '|', Item.bone });
        ModLoader.addRecipe(new ItemStack(boneCobaltShovel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.boneRod });
        ModLoader.addRecipe(new ItemStack(slimeCobaltShovel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.slimeRod });
        ModLoader.addRecipe(new ItemStack(cactusCobaltShovel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.cactusRod });
        ModLoader.addRecipe(new ItemStack(blazeCobaltShovel), new Object[] 
                { recipe, '#', stack, '|', Item.blazeRod });
        ModLoader.addRecipe(new ItemStack(copperCobaltShovel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.copperRod });
        ModLoader.addRecipe(new ItemStack(bronzeCobaltShovel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.bronzeRod });
        ModLoader.addRecipe(new ItemStack(workedCobaltShovel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.workedIronRod });
        ModLoader.addRecipe(new ItemStack(steelCobaltShovel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.steelRod });
        ModLoader.addRecipe(new ItemStack(cobaltCobaltShovel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.cobaltRod });
        ModLoader.addRecipe(new ItemStack(arditeCobaltShovel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.arditeRod });
        ModLoader.addRecipe(new ItemStack(manyullynCobaltShovel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.manyullynRod });
        ModLoader.addRecipe(new ItemStack(uraniumCobaltShovel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.uraniumRod });
    }
    
    public static void addArditeTools(ItemStack stack)
    {
    	ModLoader.addRecipe(new ItemStack(woodArditeShovel), new Object[] 
                { recipe, '#', stack, '|', Item.stick });
        ModLoader.addRecipe(new ItemStack(stoneArditeShovel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.stoneRod });
        ModLoader.addRecipe(new ItemStack(ironArditeShovel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.ironRod });
        ModLoader.addRecipe(new ItemStack(diamondArditeShovel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.diamondRod });
        ModLoader.addRecipe(new ItemStack(redstoneArditeShovel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.redstoneRod });
        ModLoader.addRecipe(new ItemStack(obsidianArditeShovel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.obsidianRod });
        ModLoader.addRecipe(new ItemStack(boneArditeShovel), new Object[] 
                { recipe, '#', stack, '|', Item.bone });
        ModLoader.addRecipe(new ItemStack(boneArditeShovel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.boneRod });
        ModLoader.addRecipe(new ItemStack(slimeArditeShovel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.slimeRod });
        ModLoader.addRecipe(new ItemStack(cactusArditeShovel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.cactusRod });
        ModLoader.addRecipe(new ItemStack(blazeArditeShovel), new Object[] 
                { recipe, '#', stack, '|', Item.blazeRod });
        ModLoader.addRecipe(new ItemStack(copperArditeShovel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.copperRod });
        ModLoader.addRecipe(new ItemStack(bronzeArditeShovel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.bronzeRod });
        ModLoader.addRecipe(new ItemStack(workedArditeShovel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.workedIronRod });
        ModLoader.addRecipe(new ItemStack(steelArditeShovel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.steelRod });
        ModLoader.addRecipe(new ItemStack(cobaltArditeShovel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.cobaltRod });
        ModLoader.addRecipe(new ItemStack(arditeArditeShovel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.arditeRod });
        ModLoader.addRecipe(new ItemStack(manyullynArditeShovel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.manyullynRod });
        ModLoader.addRecipe(new ItemStack(uraniumArditeShovel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.uraniumRod });
    }
    
    public static void addManyullynTools(ItemStack stack)
    {
    	ModLoader.addRecipe(new ItemStack(woodManyullynShovel), new Object[] 
                { recipe, '#', stack, '|', Item.stick });
        ModLoader.addRecipe(new ItemStack(stoneManyullynShovel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.stoneRod });
        ModLoader.addRecipe(new ItemStack(ironManyullynShovel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.ironRod });
        ModLoader.addRecipe(new ItemStack(diamondManyullynShovel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.diamondRod });
        ModLoader.addRecipe(new ItemStack(redstoneManyullynShovel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.redstoneRod });
        ModLoader.addRecipe(new ItemStack(obsidianManyullynShovel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.obsidianRod });
        ModLoader.addRecipe(new ItemStack(boneManyullynShovel), new Object[] 
                { recipe, '#', stack, '|', Item.bone });
        ModLoader.addRecipe(new ItemStack(boneManyullynShovel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.boneRod });
        ModLoader.addRecipe(new ItemStack(slimeManyullynShovel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.slimeRod });
        ModLoader.addRecipe(new ItemStack(cactusManyullynShovel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.cactusRod });
        ModLoader.addRecipe(new ItemStack(blazeManyullynShovel), new Object[] 
                { recipe, '#', stack, '|', Item.blazeRod });
        ModLoader.addRecipe(new ItemStack(copperManyullynShovel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.copperRod });
        ModLoader.addRecipe(new ItemStack(bronzeManyullynShovel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.bronzeRod });
        ModLoader.addRecipe(new ItemStack(workedManyullynShovel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.workedIronRod });
        ModLoader.addRecipe(new ItemStack(steelManyullynShovel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.steelRod });
        ModLoader.addRecipe(new ItemStack(cobaltManyullynShovel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.cobaltRod });
        ModLoader.addRecipe(new ItemStack(arditeManyullynShovel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.arditeRod });
        ModLoader.addRecipe(new ItemStack(manyullynManyullynShovel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.manyullynRod });
        ModLoader.addRecipe(new ItemStack(uraniumManyullynShovel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.uraniumRod });
    }
    
    public static void addUraniumTools(ItemStack stack)
    {
        ModLoader.addRecipe(new ItemStack(diamondUraniumShovel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.diamondRod });
        ModLoader.addRecipe(new ItemStack(redstoneUraniumShovel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.redstoneRod });
        ModLoader.addRecipe(new ItemStack(boneUraniumShovel), new Object[] 
                { recipe, '#', stack, '|', Item.bone });
        ModLoader.addRecipe(new ItemStack(boneUraniumShovel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.boneRod });
        ModLoader.addRecipe(new ItemStack(netherrackUraniumShovel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.netherrackRod });
        ModLoader.addRecipe(new ItemStack(glowstoneUraniumShovel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.glowstoneRod });
        ModLoader.addRecipe(new ItemStack(lavaUraniumShovel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.lavaRod });
        ModLoader.addRecipe(new ItemStack(blazeUraniumShovel), new Object[] 
                { recipe, '#', stack, '|', Item.blazeRod });
        ModLoader.addRecipe(new ItemStack(cobaltUraniumShovel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.cobaltRod });
        ModLoader.addRecipe(new ItemStack(arditeUraniumShovel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.arditeRod });
        ModLoader.addRecipe(new ItemStack(uraniumUraniumShovel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.uraniumRod });
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
