package mDiyo.inficraft.infitools.core;
import mDiyo.inficraft.infitools.library.InfiLibrary;
import mDiyo.inficraft.infitools.library.InfiMaterialEnum;
import net.minecraft.src.Block;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;
import net.minecraft.src.ModLoader;
import net.minecraftforge.common.MinecraftForge;

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
    			woodWoodSword = new InfiToolSword(14, InfiMaterialEnum.Wood, InfiMaterialEnum.Wood, "woodWoodSword");
    		sandstoneWoodSword = new InfiToolSword(PHInfiTools.woodSwordID+1, 
                    InfiMaterialEnum.Wood, InfiMaterialEnum.Sandstone, "sandstoneWoodSword");
    		boneWoodSword = new InfiToolSword(PHInfiTools.woodSwordID+2, 
                    InfiMaterialEnum.Wood, InfiMaterialEnum.Bone, "boneWoodSword");
    		paperWoodSword = new InfiToolSword(PHInfiTools.woodSwordID+3, 
                    InfiMaterialEnum.Wood, InfiMaterialEnum.Paper, "paperWoodSword");
    		iceWoodSword = new InfiToolSword(PHInfiTools.woodSwordID+4, 
                    InfiMaterialEnum.Wood, InfiMaterialEnum.Ice, "iceWoodSword");
    		slimeWoodSword = new InfiToolSword(PHInfiTools.woodSwordID+5, 
                    InfiMaterialEnum.Wood, InfiMaterialEnum.Slime, "slimeWoodSword");
    		cactusWoodSword = new InfiToolSword(PHInfiTools.woodSwordID+6, 
                    InfiMaterialEnum.Wood, InfiMaterialEnum.Cactus, "cactusWoodSword");
    		
    		if (PHInfiTools.overwriteVanillaTools)
    			MinecraftForge.setToolClass(woodWoodSword, "Sword", InfiMaterialEnum.Wood.getHarvestLevel());
    		MinecraftForge.setToolClass(sandstoneWoodSword, "Sword", InfiMaterialEnum.Wood.getHarvestLevel());
    		MinecraftForge.setToolClass(boneWoodSword, "Sword", InfiMaterialEnum.Wood.getHarvestLevel());
    		MinecraftForge.setToolClass(paperWoodSword, "Sword", InfiMaterialEnum.Wood.getHarvestLevel());
    		MinecraftForge.setToolClass(iceWoodSword, "Sword", InfiMaterialEnum.Wood.getHarvestLevel());
    		MinecraftForge.setToolClass(slimeWoodSword, "Sword", InfiMaterialEnum.Wood.getHarvestLevel());
    		MinecraftForge.setToolClass(cactusWoodSword, "Sword", InfiMaterialEnum.Wood.getHarvestLevel());
    	}

        if(PHInfiTools.enableStoneTools)
        {
        	if (PHInfiTools.overwriteVanillaTools)
        		woodStoneSword = new InfiToolSword(18, InfiMaterialEnum.Stone, InfiMaterialEnum.Wood, "woodStoneSword");
        	stoneStoneSword = new InfiToolSword(PHInfiTools.stoneSwordID+1, 
                    InfiMaterialEnum.Stone, InfiMaterialEnum.Stone, "stoneStoneSword");
        	sandstoneStoneSword = new InfiToolSword(PHInfiTools.stoneSwordID+2, 
                    InfiMaterialEnum.Stone, InfiMaterialEnum.Sandstone, "sandstoneStoneSword");
        	boneStoneSword = new InfiToolSword(PHInfiTools.stoneSwordID+3, 
                    InfiMaterialEnum.Stone, InfiMaterialEnum.Bone, "boneStoneSword");
        	netherrackStoneSword = new InfiToolSword(PHInfiTools.stoneSwordID+4, 
                    InfiMaterialEnum.Stone, InfiMaterialEnum.Netherrack, "netherrackStoneSword");
        	iceStoneSword = new InfiToolSword(PHInfiTools.stoneSwordID+5, 
                    InfiMaterialEnum.Stone, InfiMaterialEnum.Ice, "iceStoneSword");
        	slimeStoneSword = new InfiToolSword(PHInfiTools.stoneSwordID+6, 
                    InfiMaterialEnum.Stone, InfiMaterialEnum.Slime, "slimeStoneSword");
        	cactusStoneSword = new InfiToolSword(PHInfiTools.stoneSwordID+7, 
                    InfiMaterialEnum.Stone, InfiMaterialEnum.Cactus, "cactusStoneSword");
        	flintStoneSword = new InfiToolSword(PHInfiTools.stoneSwordID+8, 
                    InfiMaterialEnum.Stone, InfiMaterialEnum.Flint, "flintStoneSword");
            
        	if (PHInfiTools.overwriteVanillaTools)
        		MinecraftForge.setToolClass(woodStoneSword, "Sword", InfiMaterialEnum.Stone.getHarvestLevel());
            MinecraftForge.setToolClass(stoneStoneSword, "Sword", InfiMaterialEnum.Stone.getHarvestLevel());
            MinecraftForge.setToolClass(sandstoneStoneSword, "Sword", InfiMaterialEnum.Stone.getHarvestLevel());
            MinecraftForge.setToolClass(boneStoneSword, "Sword", InfiMaterialEnum.Stone.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackStoneSword, "Sword", InfiMaterialEnum.Stone.getHarvestLevel());
            MinecraftForge.setToolClass(iceStoneSword, "Sword", InfiMaterialEnum.Stone.getHarvestLevel());
            MinecraftForge.setToolClass(slimeStoneSword, "Sword", InfiMaterialEnum.Stone.getHarvestLevel());
            MinecraftForge.setToolClass(cactusStoneSword, "Sword", InfiMaterialEnum.Stone.getHarvestLevel());
            MinecraftForge.setToolClass(flintStoneSword, "Sword", InfiMaterialEnum.Stone.getHarvestLevel());
        }
        
        if(PHInfiTools.enableIronTools)
        {
        	if (PHInfiTools.overwriteVanillaTools)
        		woodIronSword = new InfiToolSword(1, InfiMaterialEnum.Iron, InfiMaterialEnum.Wood, "woodIronSword");
        	stoneIronSword = new InfiToolSword(PHInfiTools.ironSwordID+1, 
                    InfiMaterialEnum.Iron, InfiMaterialEnum.Stone, "stoneIronSword");
        	ironIronSword = new InfiToolSword(PHInfiTools.ironSwordID+2, 
                    InfiMaterialEnum.Iron, InfiMaterialEnum.Iron, "ironIronSword");
        	boneIronSword = new InfiToolSword(PHInfiTools.ironSwordID+3, 
                    InfiMaterialEnum.Iron, InfiMaterialEnum.Bone, "boneIronSword");
        	netherrackIronSword = new InfiToolSword(PHInfiTools.ironSwordID+4, 
                    InfiMaterialEnum.Iron, InfiMaterialEnum.Netherrack, "netherrackIronSword");
        	glowstoneIronSword = new InfiToolSword(PHInfiTools.ironSwordID+5, 
                    InfiMaterialEnum.Iron, InfiMaterialEnum.Glowstone, "glowstoneIronSword");
        	cactusIronSword = new InfiToolSword(PHInfiTools.ironSwordID+6, 
                    InfiMaterialEnum.Iron, InfiMaterialEnum.Cactus, "cactusIronSword");
        	copperIronSword = new InfiToolSword(PHInfiTools.ironSwordID+7, 
                    InfiMaterialEnum.Iron, InfiMaterialEnum.Copper, "copperIronSword");
        	bronzeIronSword = new InfiToolSword(PHInfiTools.ironSwordID+8, 
                    InfiMaterialEnum.Iron, InfiMaterialEnum.Bronze, "bronzeIronSword");
            
        	if (PHInfiTools.overwriteVanillaTools)
        		MinecraftForge.setToolClass(woodIronSword, "Sword", InfiMaterialEnum.Iron.getHarvestLevel());
            MinecraftForge.setToolClass(stoneIronSword, "Sword", InfiMaterialEnum.Iron.getHarvestLevel());
            MinecraftForge.setToolClass(ironIronSword, "Sword", InfiMaterialEnum.Iron.getHarvestLevel());
            MinecraftForge.setToolClass(boneIronSword, "Sword", InfiMaterialEnum.Iron.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackIronSword, "Sword", InfiMaterialEnum.Iron.getHarvestLevel());
            MinecraftForge.setToolClass(glowstoneIronSword, "Sword", InfiMaterialEnum.Iron.getHarvestLevel());
            MinecraftForge.setToolClass(cactusIronSword, "Sword", InfiMaterialEnum.Iron.getHarvestLevel());
            MinecraftForge.setToolClass(copperIronSword, "Sword", InfiMaterialEnum.Iron.getHarvestLevel());
            MinecraftForge.setToolClass(bronzeIronSword, "Sword", InfiMaterialEnum.Iron.getHarvestLevel());
        }
        
        if(PHInfiTools.enableDiamondTools)
        {
        	if (PHInfiTools.overwriteVanillaTools)
        		woodDiamondSword = new InfiToolSword(22, InfiMaterialEnum.Diamond, InfiMaterialEnum.Wood, "woodDiamondSword");
        	stoneDiamondSword = new InfiToolSword(PHInfiTools.diamondSwordID+1, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Stone, "stoneDiamondSword");
        	ironDiamondSword = new InfiToolSword(PHInfiTools.diamondSwordID+2, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Iron, "ironDiamondSword");
        	diamondDiamondSword = new InfiToolSword(PHInfiTools.diamondSwordID+3, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Diamond, "diamondDiamondSword");
        	redstoneDiamondSword = new InfiToolSword(PHInfiTools.diamondSwordID+4, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Redstone, "redstoneDiamondSword");
        	obsidianDiamondSword = new InfiToolSword(PHInfiTools.diamondSwordID+5, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Obsidian, "obsidianDiamondSword");
        	boneDiamondSword = new InfiToolSword(PHInfiTools.diamondSwordID+6, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Bone, "boneDiamondSword");
        	mossyDiamondSword = new InfiToolSword(PHInfiTools.diamondSwordID+7, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Mossy, "mossyDiamondSword");
        	netherrackDiamondSword = new InfiToolSword(PHInfiTools.diamondSwordID+8, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Netherrack, "netherrackDiamondSword");
        	glowstoneDiamondSword = new InfiToolSword(PHInfiTools.diamondSwordID+9, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Glowstone, "glowstoneDiamondSword");
        	lavaDiamondSword = new InfiToolSword(PHInfiTools.diamondSwordID+10, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Lava, "lavaDiamondSword");
        	cactusDiamondSword = new InfiToolSword(PHInfiTools.diamondSwordID+11, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Cactus, "cactusDiamondSword");
        	flintDiamondSword = new InfiToolSword(PHInfiTools.diamondSwordID+12, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Flint, "flintDiamondSword");
        	blazeDiamondSword = new InfiToolSword(PHInfiTools.diamondSwordID+13, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Blaze, "blazeDiamondSword");
            copperDiamondSword = new InfiToolSword(PHInfiTools.diamondSwordID+14, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Copper, "copperDiamondSword");
            bronzeDiamondSword = new InfiToolSword(PHInfiTools.diamondSwordID+15, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Bronze, "bronzeDiamondSword");
            workedDiamondSword = new InfiToolSword(PHInfiTools.diamondSwordID+16, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.WorkedIron, "workedDiamondSword");
            steelDiamondSword = new InfiToolSword(PHInfiTools.diamondSwordID+17, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Steel, "steelDiamondSword");
            cobaltDiamondSword = new InfiToolSword(PHInfiTools.diamondSwordID+18, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Cobalt, "cobaltDiamondSword");
            arditeDiamondSword = new InfiToolSword(PHInfiTools.diamondSwordID+19, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Ardite, "arditeDiamondSword");
            manyullynDiamondSword = new InfiToolSword(PHInfiTools.diamondSwordID+20, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Manyullyn, "manyullynDiamondSword");
            uraniumDiamondSword = new InfiToolSword(PHInfiTools.diamondSwordID+21, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Uranium, "uraniumDiamondSword");
            
            if (PHInfiTools.overwriteVanillaTools)
            	MinecraftForge.setToolClass(woodDiamondSword, "Sword", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(stoneDiamondSword, "Sword", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(ironDiamondSword, "Sword", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(diamondDiamondSword, "Sword", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(redstoneDiamondSword, "Sword", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(obsidianDiamondSword, "Sword", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(boneDiamondSword, "Sword", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(mossyDiamondSword, "Sword", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackDiamondSword, "Sword", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(glowstoneDiamondSword, "Sword", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(lavaDiamondSword, "Sword", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(cactusDiamondSword, "Sword", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(flintDiamondSword, "Sword", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(blazeDiamondSword, "Sword", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(copperDiamondSword, "Sword", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(bronzeDiamondSword, "Sword", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(workedDiamondSword, "Sword", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(steelDiamondSword, "Sword", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(cobaltDiamondSword, "Sword", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(arditeDiamondSword, "Sword", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(manyullynDiamondSword, "Sword", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(uraniumDiamondSword, "Sword", InfiMaterialEnum.Diamond.getHarvestLevel());
        }
        
        if(PHInfiTools.enableRedstoneTools)
        {
        	woodRedstoneSword = new InfiToolSword(PHInfiTools.redstoneSwordID+0, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Wood, "woodRedstoneSword");
        	stoneRedstoneSword = new InfiToolSword(PHInfiTools.redstoneSwordID+1, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Stone, "stoneRedstoneSword");
        	ironRedstoneSword = new InfiToolSword(PHInfiTools.redstoneSwordID+2, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Iron, "ironRedstoneSword");
        	redstoneRedstoneSword = new InfiToolSword(PHInfiTools.redstoneSwordID+3, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Redstone, "redstoneRedstoneSword");
        	obsidianRedstoneSword = new InfiToolSword(PHInfiTools.redstoneSwordID+4, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Obsidian, "obsidianRedstoneSword");
        	sandstoneRedstoneSword = new InfiToolSword(PHInfiTools.redstoneSwordID+5, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Sandstone, "sandstoneRedstoneSword");
        	boneRedstoneSword = new InfiToolSword(PHInfiTools.redstoneSwordID+6, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Bone, "boneRedstoneSword");
        	paperRedstoneSword = new InfiToolSword(PHInfiTools.redstoneSwordID+7, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Paper, "paperRedstoneSword");
        	mossyRedstoneSword = new InfiToolSword(PHInfiTools.redstoneSwordID+8, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Mossy, "mossyRedstoneSword");
        	netherrackRedstoneSword = new InfiToolSword(PHInfiTools.redstoneSwordID+9, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Netherrack, "netherrackRedstoneSword");
        	glowstoneRedstoneSword = new InfiToolSword(PHInfiTools.redstoneSwordID+10, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Glowstone, "glowstoneRedstoneSword");
        	iceRedstoneSword = new InfiToolSword(PHInfiTools.redstoneSwordID+11, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Ice, "iceRedstoneSword");
        	lavaRedstoneSword = new InfiToolSword(PHInfiTools.redstoneSwordID+12,
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Lava, "lavaRedstoneSword");
        	slimeRedstoneSword = new InfiToolSword(PHInfiTools.redstoneSwordID+13,
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Slime, "slimeRedstoneSword");
        	cactusRedstoneSword = new InfiToolSword(PHInfiTools.redstoneSwordID+14,
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Cactus, "cactusRedstoneSword");
        	flintRedstoneSword = new InfiToolSword(PHInfiTools.redstoneSwordID+15,
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Flint, "flintRedstoneSword");
        	copperRedstoneSword = new InfiToolSword(PHInfiTools.redstoneSwordID+16,
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Copper, "copperRedstoneSword");
        	bronzeRedstoneSword = new InfiToolSword(PHInfiTools.redstoneSwordID+17,
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Bronze, "bronzeRedstoneSword");
        	workedRedstoneSword = new InfiToolSword(PHInfiTools.redstoneSwordID+18,
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.WorkedIron, "workedRedstoneSword");
        	uraniumRedstoneSword = new InfiToolSword(PHInfiTools.redstoneSwordID+19,
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Uranium, "uraniumRedstoneSword");
            
            MinecraftForge.setToolClass(woodRedstoneSword, "Sword", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(stoneRedstoneSword, "Sword", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(ironRedstoneSword, "Sword", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(redstoneRedstoneSword, "Sword", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(obsidianRedstoneSword, "Sword", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(sandstoneRedstoneSword, "Sword", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(boneRedstoneSword, "Sword", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(paperRedstoneSword, "Sword", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(mossyRedstoneSword, "Sword", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackRedstoneSword, "Sword", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(glowstoneRedstoneSword, "Sword", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(iceRedstoneSword, "Sword", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(lavaRedstoneSword, "Sword", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(slimeRedstoneSword, "Sword", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(cactusRedstoneSword, "Sword", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(flintRedstoneSword, "Sword", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(copperRedstoneSword, "Sword", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(bronzeRedstoneSword, "Sword", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(workedRedstoneSword, "Sword", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(uraniumRedstoneSword, "Sword", InfiMaterialEnum.Redstone.getHarvestLevel());
        }
        
        if(PHInfiTools.enableObsidianTools)
        {
        	woodObsidianSword = new InfiToolSword(PHInfiTools.obsidianSwordID+0, 
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Wood, "woodObsidianSword");
        	stoneObsidianSword = new InfiToolSword(PHInfiTools.obsidianSwordID+1, 
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Stone, "stoneObsidianSword");
        	redstoneObsidianSword = new InfiToolSword(PHInfiTools.obsidianSwordID+2, 
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Redstone, "redstoneObsidianSword");
        	obsidianObsidianSword = new InfiToolSword(PHInfiTools.obsidianSwordID+3, 
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Obsidian, "obsidianObsidianSword");;
        	boneObsidianSword = new InfiToolSword(PHInfiTools.obsidianSwordID+4, 
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Bone, "boneObsidianSword");
        	netherrackObsidianSword = new InfiToolSword(PHInfiTools.obsidianSwordID+5, 
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Netherrack, "netherrackObsidianSword");
        	glowstoneObsidianSword = new InfiToolSword(PHInfiTools.obsidianSwordID+6, 
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Glowstone, "glowstoneObsidianSword");
        	iceObsidianSword = new InfiToolSword(PHInfiTools.obsidianSwordID+7, 
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Ice, "iceObsidianSword");
        	lavaObsidianSword = new InfiToolSword(PHInfiTools.obsidianSwordID+8,
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Lava, "lavaObsidianSword");
        	cactusObsidianSword = new InfiToolSword(PHInfiTools.obsidianSwordID+9,
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Cactus, "cactusObsidianSword");
            
            MinecraftForge.setToolClass(woodObsidianSword, "Sword", InfiMaterialEnum.Obsidian.getHarvestLevel());
            MinecraftForge.setToolClass(stoneObsidianSword, "Sword", InfiMaterialEnum.Obsidian.getHarvestLevel());
            MinecraftForge.setToolClass(redstoneObsidianSword, "Sword", InfiMaterialEnum.Obsidian.getHarvestLevel());
            MinecraftForge.setToolClass(obsidianObsidianSword, "Sword", InfiMaterialEnum.Obsidian.getHarvestLevel());
            MinecraftForge.setToolClass(boneObsidianSword, "Sword", InfiMaterialEnum.Obsidian.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackObsidianSword, "Sword", InfiMaterialEnum.Obsidian.getHarvestLevel());
            MinecraftForge.setToolClass(glowstoneObsidianSword, "Sword", InfiMaterialEnum.Obsidian.getHarvestLevel());
            MinecraftForge.setToolClass(iceObsidianSword, "Sword", InfiMaterialEnum.Obsidian.getHarvestLevel());
            MinecraftForge.setToolClass(lavaObsidianSword, "Sword", InfiMaterialEnum.Obsidian.getHarvestLevel());
            MinecraftForge.setToolClass(cactusObsidianSword, "Sword", InfiMaterialEnum.Obsidian.getHarvestLevel());
        }
        
        if(PHInfiTools.enableSandstoneTools)
        {
        	woodSandstoneSword = new InfiToolSword(PHInfiTools.sandstoneSwordID+0, 
                    InfiMaterialEnum.Sandstone, InfiMaterialEnum.Wood, "woodSandstoneSword");
        	sandstoneSandstoneSword = new InfiToolSword(PHInfiTools.sandstoneSwordID+1, 
                    InfiMaterialEnum.Sandstone, InfiMaterialEnum.Sandstone, "sandstoneSandstoneSword");
        	boneSandstoneSword = new InfiToolSword(PHInfiTools.sandstoneSwordID+2, 
                    InfiMaterialEnum.Sandstone, InfiMaterialEnum.Bone, "boneSandstoneSword");
        	netherrackSandstoneSword = new InfiToolSword(PHInfiTools.sandstoneSwordID+3, 
                    InfiMaterialEnum.Sandstone, InfiMaterialEnum.Netherrack, "netherrackSandstoneSword");
        	iceSandstoneSword = new InfiToolSword(PHInfiTools.sandstoneSwordID+4, 
                    InfiMaterialEnum.Sandstone, InfiMaterialEnum.Ice, "iceSandstoneSword");
        	slimeSandstoneSword = new InfiToolSword(PHInfiTools.sandstoneSwordID+5,
                    InfiMaterialEnum.Sandstone, InfiMaterialEnum.Slime, "slimeSandstoneSword");
        	cactusSandstoneSword = new InfiToolSword(PHInfiTools.sandstoneSwordID+6,
                    InfiMaterialEnum.Sandstone, InfiMaterialEnum.Cactus, "cactusSandstoneSword");
        	flintSandstoneSword = new InfiToolSword(PHInfiTools.sandstoneSwordID+7,
                    InfiMaterialEnum.Sandstone, InfiMaterialEnum.Flint, "flintSandstoneSword");
            
            MinecraftForge.setToolClass(woodSandstoneSword, "Sword", InfiMaterialEnum.Sandstone.getHarvestLevel());
            MinecraftForge.setToolClass(sandstoneSandstoneSword, "Sword", InfiMaterialEnum.Sandstone.getHarvestLevel());
            MinecraftForge.setToolClass(boneSandstoneSword, "Sword", InfiMaterialEnum.Sandstone.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackSandstoneSword, "Sword", InfiMaterialEnum.Sandstone.getHarvestLevel());
            MinecraftForge.setToolClass(iceSandstoneSword, "Sword", InfiMaterialEnum.Sandstone.getHarvestLevel());
            MinecraftForge.setToolClass(slimeSandstoneSword, "Sword", InfiMaterialEnum.Sandstone.getHarvestLevel());
            MinecraftForge.setToolClass(cactusSandstoneSword, "Sword", InfiMaterialEnum.Sandstone.getHarvestLevel());
            MinecraftForge.setToolClass(flintSandstoneSword, "Sword", InfiMaterialEnum.Sandstone.getHarvestLevel());
        }
        
        if(PHInfiTools.enableBoneTools)
        {
        	woodBoneSword = new InfiToolSword(PHInfiTools.boneSwordID+0, 
                    InfiMaterialEnum.Bone, InfiMaterialEnum.Wood, "woodBoneSword");
        	stoneBoneSword = new InfiToolSword(PHInfiTools.boneSwordID+1, 
                    InfiMaterialEnum.Bone, InfiMaterialEnum.Stone, "stoneBoneSword");
        	sandstoneBoneSword = new InfiToolSword(PHInfiTools.boneSwordID+2, 
                    InfiMaterialEnum.Bone, InfiMaterialEnum.Sandstone, "sandstoneBoneSword");
        	boneBoneSword = new InfiToolSword(PHInfiTools.boneSwordID+3, 
                    InfiMaterialEnum.Bone, InfiMaterialEnum.Bone, "boneBoneSword");
        	paperBoneSword = new InfiToolSword(PHInfiTools.boneSwordID+4, 
                    InfiMaterialEnum.Bone, InfiMaterialEnum.Paper, "paperBoneSword");
        	netherrackBoneSword = new InfiToolSword(PHInfiTools.boneSwordID+5, 
                    InfiMaterialEnum.Bone, InfiMaterialEnum.Netherrack, "netherrackBoneSword");
        	iceBoneSword = new InfiToolSword(PHInfiTools.boneSwordID+6, 
                    InfiMaterialEnum.Bone, InfiMaterialEnum.Ice, "iceBoneSword");
        	cactusBoneSword = new InfiToolSword(PHInfiTools.boneSwordID+7,
                    InfiMaterialEnum.Bone, InfiMaterialEnum.Cactus, "cactusBoneSword");
        	flintBoneSword = new InfiToolSword(PHInfiTools.boneSwordID+8,
                    InfiMaterialEnum.Bone, InfiMaterialEnum.Flint, "flintBoneSword");
            
            MinecraftForge.setToolClass(woodBoneSword, "Sword", InfiMaterialEnum.Bone.getHarvestLevel());
            MinecraftForge.setToolClass(stoneBoneSword, "Sword", InfiMaterialEnum.Bone.getHarvestLevel());
            MinecraftForge.setToolClass(sandstoneBoneSword, "Sword", InfiMaterialEnum.Bone.getHarvestLevel());
            MinecraftForge.setToolClass(boneBoneSword, "Sword", InfiMaterialEnum.Bone.getHarvestLevel());
            MinecraftForge.setToolClass(paperBoneSword, "Sword", InfiMaterialEnum.Bone.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackBoneSword, "Sword", InfiMaterialEnum.Bone.getHarvestLevel());
            MinecraftForge.setToolClass(iceBoneSword, "Sword", InfiMaterialEnum.Bone.getHarvestLevel());
            MinecraftForge.setToolClass(cactusBoneSword, "Sword", InfiMaterialEnum.Bone.getHarvestLevel());
            MinecraftForge.setToolClass(flintBoneSword, "Sword", InfiMaterialEnum.Bone.getHarvestLevel());
        }
        
        if(PHInfiTools.enablePaperTools)
        {
        	woodPaperSword = new InfiToolSword(PHInfiTools.paperSwordID+0, 
                    InfiMaterialEnum.Paper, InfiMaterialEnum.Wood, "woodPaperSword");
        	bonePaperSword = new InfiToolSword(PHInfiTools.paperSwordID+1, 
                    InfiMaterialEnum.Paper, InfiMaterialEnum.Bone, "bonePaperSword");
        	paperPaperSword = new InfiToolSword(PHInfiTools.paperSwordID+2, 
                    InfiMaterialEnum.Paper, InfiMaterialEnum.Paper, "paperPaperSword");
        	slimePaperSword = new InfiToolSword(PHInfiTools.paperSwordID+3,
                    InfiMaterialEnum.Paper, InfiMaterialEnum.Slime, "slimePaperSword");
        	cactusPaperSword = new InfiToolSword(PHInfiTools.paperSwordID+4,
                    InfiMaterialEnum.Paper, InfiMaterialEnum.Cactus, "cactusPaperSword");
            
            MinecraftForge.setToolClass(woodPaperSword, "Sword", InfiMaterialEnum.Paper.getHarvestLevel());
            MinecraftForge.setToolClass(bonePaperSword, "Sword", InfiMaterialEnum.Paper.getHarvestLevel());
            MinecraftForge.setToolClass(paperPaperSword, "Sword", InfiMaterialEnum.Paper.getHarvestLevel());
            MinecraftForge.setToolClass(slimePaperSword, "Sword", InfiMaterialEnum.Paper.getHarvestLevel());
            MinecraftForge.setToolClass(cactusPaperSword, "Sword", InfiMaterialEnum.Paper.getHarvestLevel());
        }
        
        if(PHInfiTools.enableMossyTools)
        {
        	woodMossySword = new InfiToolSword(PHInfiTools.mossySwordID+0, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Wood, "woodMossySword");
        	stoneMossySword = new InfiToolSword(PHInfiTools.mossySwordID+1, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Stone, "stoneMossySword");
        	diamondMossySword = new InfiToolSword(PHInfiTools.mossySwordID+2, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Diamond, "diamondMossySword");
        	redstoneMossySword = new InfiToolSword(PHInfiTools.mossySwordID+3, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Redstone, "redstoneMossySword");
        	boneMossySword = new InfiToolSword(PHInfiTools.mossySwordID+4, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Bone, "boneMossySword");
        	mossyMossySword = new InfiToolSword(PHInfiTools.mossySwordID+5, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Mossy, "mossyMossySword");
        	netherrackMossySword = new InfiToolSword(PHInfiTools.mossySwordID+6, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Netherrack, "netherrackMossySword");
        	glowstoneMossySword = new InfiToolSword(PHInfiTools.mossySwordID+7, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Glowstone, "glowstoneMossySword");
        	cactusMossySword = new InfiToolSword(PHInfiTools.mossySwordID+8, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Cactus, "cactusMossySword");
        	blazeMossySword = new InfiToolSword(PHInfiTools.mossySwordID+9, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Blaze, "blazeMossySword");
        	manyullynMossySword = new InfiToolSword(PHInfiTools.mossySwordID+10, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Manyullyn, "manyullynMossySword");
        	uraniumMossySword = new InfiToolSword(PHInfiTools.mossySwordID+11, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Uranium, "uraniumMossySword");
            
            MinecraftForge.setToolClass(woodMossySword, "Sword", InfiMaterialEnum.Mossy.getHarvestLevel());
            MinecraftForge.setToolClass(stoneMossySword, "Sword", InfiMaterialEnum.Mossy.getHarvestLevel());
            MinecraftForge.setToolClass(diamondMossySword, "Sword", InfiMaterialEnum.Mossy.getHarvestLevel());
            MinecraftForge.setToolClass(redstoneMossySword, "Sword", InfiMaterialEnum.Mossy.getHarvestLevel());
            MinecraftForge.setToolClass(boneMossySword, "Sword", InfiMaterialEnum.Mossy.getHarvestLevel());
            MinecraftForge.setToolClass(mossyMossySword, "Sword", InfiMaterialEnum.Mossy.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackMossySword, "Sword", InfiMaterialEnum.Mossy.getHarvestLevel());
            MinecraftForge.setToolClass(glowstoneMossySword, "Sword", InfiMaterialEnum.Mossy.getHarvestLevel());
            MinecraftForge.setToolClass(cactusMossySword, "Sword", InfiMaterialEnum.Mossy.getHarvestLevel());
            MinecraftForge.setToolClass(blazeMossySword, "Sword", InfiMaterialEnum.Mossy.getHarvestLevel());
            MinecraftForge.setToolClass(manyullynMossySword, "Sword", InfiMaterialEnum.Mossy.getHarvestLevel());
            MinecraftForge.setToolClass(uraniumMossySword, "Sword", InfiMaterialEnum.Mossy.getHarvestLevel());
        }
        
        if(PHInfiTools.enableNetherrackTools)
        {
        	woodNetherrackSword = new InfiToolSword(PHInfiTools.netherrackSwordID+0, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Wood, "woodNetherrackSword");
        	stoneNetherrackSword = new InfiToolSword(PHInfiTools.netherrackSwordID+1, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Stone, "stoneNetherrackSword");
        	sandstoneNetherrackSword = new InfiToolSword(PHInfiTools.netherrackSwordID+2, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Sandstone, "sandstoneNetherrackSword");
        	boneNetherrackSword = new InfiToolSword(PHInfiTools.netherrackSwordID+3, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Bone, "boneNetherrackSword");
        	paperNetherrackSword = new InfiToolSword(PHInfiTools.netherrackSwordID+4, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Paper, "paperNetherrackSword");
        	mossyNetherrackSword = new InfiToolSword(PHInfiTools.netherrackSwordID+5, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Mossy, "mossyNetherrackSword");
        	netherrackNetherrackSword = new InfiToolSword(PHInfiTools.netherrackSwordID+6, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Netherrack, "netherrackNetherrackSword");
        	iceNetherrackSword = new InfiToolSword(PHInfiTools.netherrackSwordID+7, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Ice, "iceNetherrackSword");
        	slimeNetherrackSword = new InfiToolSword(PHInfiTools.netherrackSwordID+8, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Slime, "slimeNetherrackSword");
        	cactusNetherrackSword = new InfiToolSword(PHInfiTools.netherrackSwordID+9, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Cactus, "cactusNetherrackSword");
        	flintNetherrackSword = new InfiToolSword(PHInfiTools.netherrackSwordID+10, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Flint, "flintNetherrackSword");
        	copperNetherrackSword = new InfiToolSword(PHInfiTools.netherrackSwordID+11, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Copper, "copperNetherrackSword");
        	bronzeNetherrackSword = new InfiToolSword(PHInfiTools.netherrackSwordID+12, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Bronze, "bronzeNetherrackSword");
            
            MinecraftForge.setToolClass(woodNetherrackSword, "Sword", InfiMaterialEnum.Netherrack.getHarvestLevel());
            MinecraftForge.setToolClass(stoneNetherrackSword, "Sword", InfiMaterialEnum.Netherrack.getHarvestLevel());
            MinecraftForge.setToolClass(sandstoneNetherrackSword, "Sword", InfiMaterialEnum.Netherrack.getHarvestLevel());
            MinecraftForge.setToolClass(boneNetherrackSword, "Sword", InfiMaterialEnum.Netherrack.getHarvestLevel());
            MinecraftForge.setToolClass(paperNetherrackSword, "Sword", InfiMaterialEnum.Netherrack.getHarvestLevel());
            MinecraftForge.setToolClass(mossyNetherrackSword, "Sword", InfiMaterialEnum.Netherrack.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackNetherrackSword, "Sword", InfiMaterialEnum.Netherrack.getHarvestLevel());
            MinecraftForge.setToolClass(iceNetherrackSword, "Sword", InfiMaterialEnum.Netherrack.getHarvestLevel());
            MinecraftForge.setToolClass(slimeNetherrackSword, "Sword", InfiMaterialEnum.Netherrack.getHarvestLevel());
            MinecraftForge.setToolClass(cactusNetherrackSword, "Sword", InfiMaterialEnum.Netherrack.getHarvestLevel());
            MinecraftForge.setToolClass(flintNetherrackSword, "Sword", InfiMaterialEnum.Netherrack.getHarvestLevel());
            MinecraftForge.setToolClass(copperNetherrackSword, "Sword", InfiMaterialEnum.Netherrack.getHarvestLevel());
            MinecraftForge.setToolClass(bronzeNetherrackSword, "Sword", InfiMaterialEnum.Netherrack.getHarvestLevel());
        }
        
        if(PHInfiTools.enableGlowstoneTools)
        {
        	woodGlowstoneSword = new InfiToolSword(PHInfiTools.glowstoneSwordID+0, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Wood, "woodGlowstoneSword");
        	redstoneGlowstoneSword = new InfiToolSword(PHInfiTools.glowstoneSwordID+1, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Redstone, "redstoneGlowstoneSword");
        	obsidianGlowstoneSword = new InfiToolSword(PHInfiTools.glowstoneSwordID+2, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Obsidian, "obsidianGlowstoneSword");
        	boneGlowstoneSword = new InfiToolSword(PHInfiTools.glowstoneSwordID+3, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Bone, "boneGlowstoneSword");
        	netherrackGlowstoneSword = new InfiToolSword(PHInfiTools.glowstoneSwordID+4, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Netherrack, "netherrackGlowstoneSword");
        	glowstoneGlowstoneSword = new InfiToolSword(PHInfiTools.glowstoneSwordID+5, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Glowstone, "glowstoneGlowstoneSword");
        	iceGlowstoneSword = new InfiToolSword(PHInfiTools.glowstoneSwordID+6, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Ice, "iceGlowstoneSword");
        	slimeGlowstoneSword = new InfiToolSword(PHInfiTools.glowstoneSwordID+7, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Slime, "slimeGlowstoneSword");
        	cactusGlowstoneSword = new InfiToolSword(PHInfiTools.glowstoneSwordID+8, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Cactus, "cactusGlowstoneSword");
            
            
            MinecraftForge.setToolClass(woodGlowstoneSword, "Sword", InfiMaterialEnum.Glowstone.getHarvestLevel());
            MinecraftForge.setToolClass(redstoneGlowstoneSword, "Sword", InfiMaterialEnum.Glowstone.getHarvestLevel());
            MinecraftForge.setToolClass(obsidianGlowstoneSword, "Sword", InfiMaterialEnum.Glowstone.getHarvestLevel());
            MinecraftForge.setToolClass(boneGlowstoneSword, "Sword", InfiMaterialEnum.Glowstone.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackGlowstoneSword, "Sword", InfiMaterialEnum.Glowstone.getHarvestLevel());
            MinecraftForge.setToolClass(glowstoneGlowstoneSword, "Sword", InfiMaterialEnum.Glowstone.getHarvestLevel());
            MinecraftForge.setToolClass(iceGlowstoneSword, "Sword", InfiMaterialEnum.Glowstone.getHarvestLevel());
            MinecraftForge.setToolClass(slimeGlowstoneSword, "Sword", InfiMaterialEnum.Glowstone.getHarvestLevel());
            MinecraftForge.setToolClass(cactusGlowstoneSword, "Sword", InfiMaterialEnum.Glowstone.getHarvestLevel());
        }
        
        if(PHInfiTools.enableIceTools)
        {
        	woodIceSword = new InfiToolSword(PHInfiTools.iceSwordID+0, 
                    InfiMaterialEnum.Ice, InfiMaterialEnum.Wood, "woodIceSword");
        	boneIceSword = new InfiToolSword(PHInfiTools.iceSwordID+1, 
                    InfiMaterialEnum.Ice, InfiMaterialEnum.Bone, "boneIceSword");
        	paperIceSword = new InfiToolSword(PHInfiTools.iceSwordID+2, 
                    InfiMaterialEnum.Ice, InfiMaterialEnum.Paper, "paperIceSword");
        	iceIceSword = new InfiToolSword(PHInfiTools.iceSwordID+3, 
                    InfiMaterialEnum.Ice, InfiMaterialEnum.Ice, "iceIceSword");
        	slimeIceSword = new InfiToolSword(PHInfiTools.iceSwordID+4, 
                    InfiMaterialEnum.Ice, InfiMaterialEnum.Slime, "slimeIceSword");
        	cactusIceSword = new InfiToolSword(PHInfiTools.iceSwordID+5, 
                    InfiMaterialEnum.Ice, InfiMaterialEnum.Cactus, "cactusIceSword");
            
            
            MinecraftForge.setToolClass(woodIceSword, "Sword", InfiMaterialEnum.Ice.getHarvestLevel());
            MinecraftForge.setToolClass(boneIceSword, "Sword", InfiMaterialEnum.Ice.getHarvestLevel());
            MinecraftForge.setToolClass(paperIceSword, "Sword", InfiMaterialEnum.Ice.getHarvestLevel());
            MinecraftForge.setToolClass(iceIceSword, "Sword", InfiMaterialEnum.Ice.getHarvestLevel());
            MinecraftForge.setToolClass(slimeIceSword, "Sword", InfiMaterialEnum.Ice.getHarvestLevel());
            MinecraftForge.setToolClass(cactusIceSword, "Sword", InfiMaterialEnum.Ice.getHarvestLevel());
        }
        
        if(PHInfiTools.enableLavaTools)
        {
        	diamondLavaSword = new InfiToolSword(PHInfiTools.lavaSwordID+0, 
                    InfiMaterialEnum.Lava, InfiMaterialEnum.Diamond, "diamondLavaSword");
        	obsidianLavaSword = new InfiToolSword(PHInfiTools.lavaSwordID+1, 
                    InfiMaterialEnum.Lava, InfiMaterialEnum.Obsidian, "obsidianLavaSword");
        	netherrackLavaSword = new InfiToolSword(PHInfiTools.lavaSwordID+2, 
                    InfiMaterialEnum.Lava, InfiMaterialEnum.Netherrack, "netherrackLavaSword");
        	lavaLavaSword = new InfiToolSword(PHInfiTools.lavaSwordID+3, 
                    InfiMaterialEnum.Lava, InfiMaterialEnum.Lava, "lavaLavaSword");
        	flintLavaSword = new InfiToolSword(PHInfiTools.lavaSwordID+4, 
                    InfiMaterialEnum.Lava, InfiMaterialEnum.Flint, "flintLavaSword");
        	blazeLavaSword = new InfiToolSword(PHInfiTools.lavaSwordID+5, 
                    InfiMaterialEnum.Lava, InfiMaterialEnum.Blaze, "blazeLavaSword");
        	manyullynLavaSword = new InfiToolSword(PHInfiTools.lavaSwordID+6, 
                    InfiMaterialEnum.Lava, InfiMaterialEnum.Manyullyn, "manyullynLavaSword");
            uraniumLavaSword = new InfiToolSword(PHInfiTools.lavaSwordID+7, 
                    InfiMaterialEnum.Lava, InfiMaterialEnum.Uranium, "uraniumLavaSword");
            
            MinecraftForge.setToolClass(diamondLavaSword, "Sword", InfiMaterialEnum.Lava.getHarvestLevel());
            MinecraftForge.setToolClass(obsidianLavaSword, "Sword", InfiMaterialEnum.Lava.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackLavaSword, "Sword", InfiMaterialEnum.Lava.getHarvestLevel());
            MinecraftForge.setToolClass(lavaLavaSword, "Sword", InfiMaterialEnum.Lava.getHarvestLevel());
            MinecraftForge.setToolClass(flintLavaSword, "Sword", InfiMaterialEnum.Lava.getHarvestLevel());
            MinecraftForge.setToolClass(blazeLavaSword, "Sword", InfiMaterialEnum.Lava.getHarvestLevel());
            MinecraftForge.setToolClass(manyullynLavaSword, "Sword", InfiMaterialEnum.Lava.getHarvestLevel());
            MinecraftForge.setToolClass(uraniumLavaSword, "Sword", InfiMaterialEnum.Lava.getHarvestLevel());
        }
        
        if(PHInfiTools.enableSlimeTools)
        {
        	woodSlimeSword = new InfiToolSword(PHInfiTools.slimeSwordID+0, 
                    InfiMaterialEnum.Slime, InfiMaterialEnum.Wood, "woodSlimeSword");
        	sandstoneSlimeSword = new InfiToolSword(PHInfiTools.slimeSwordID+1, 
                    InfiMaterialEnum.Slime, InfiMaterialEnum.Sandstone, "sandstoneSlimeSword");
        	boneSlimeSword = new InfiToolSword(PHInfiTools.slimeSwordID+2, 
                    InfiMaterialEnum.Slime, InfiMaterialEnum.Bone, "boneSlimeSword");
        	paperSlimeSword = new InfiToolSword(PHInfiTools.slimeSwordID+3, 
                    InfiMaterialEnum.Slime, InfiMaterialEnum.Paper, "paperSlimeSword");
        	slimeSlimeSword = new InfiToolSword(PHInfiTools.slimeSwordID+4, 
                    InfiMaterialEnum.Slime, InfiMaterialEnum.Slime, "slimeSlimeSword");
        	cactusSlimeSword = new InfiToolSword(PHInfiTools.slimeSwordID+5, 
                    InfiMaterialEnum.Slime, InfiMaterialEnum.Cactus, "cactusSlimeSword");
            
            MinecraftForge.setToolClass(woodSlimeSword, "Sword", InfiMaterialEnum.Slime.getHarvestLevel());
            MinecraftForge.setToolClass(sandstoneSlimeSword, "Sword", InfiMaterialEnum.Slime.getHarvestLevel());
            MinecraftForge.setToolClass(boneSlimeSword, "Sword", InfiMaterialEnum.Slime.getHarvestLevel());
            MinecraftForge.setToolClass(paperSlimeSword, "Sword", InfiMaterialEnum.Slime.getHarvestLevel());
            MinecraftForge.setToolClass(slimeSlimeSword, "Sword", InfiMaterialEnum.Slime.getHarvestLevel());
            MinecraftForge.setToolClass(cactusSlimeSword, "Sword", InfiMaterialEnum.Slime.getHarvestLevel());
        }
        
        if(PHInfiTools.enableCactusTools)
        {
        	woodCactusSword = new InfiToolSword(PHInfiTools.cactusSwordID+0, 
                    InfiMaterialEnum.Cactus, InfiMaterialEnum.Wood, "woodCactusSword");
        	sandstoneCactusSword = new InfiToolSword(PHInfiTools.cactusSwordID+1, 
                    InfiMaterialEnum.Cactus, InfiMaterialEnum.Sandstone, "sandstoneCactusSword");
        	boneCactusSword = new InfiToolSword(PHInfiTools.cactusSwordID+2, 
                    InfiMaterialEnum.Cactus, InfiMaterialEnum.Bone, "boneCactusSword");
        	netherrackCactusSword = new InfiToolSword(PHInfiTools.cactusSwordID+3, 
                    InfiMaterialEnum.Cactus, InfiMaterialEnum.Netherrack, "netherrackCactusSword");
        	iceCactusSword = new InfiToolSword(PHInfiTools.cactusSwordID+4, 
                    InfiMaterialEnum.Cactus, InfiMaterialEnum.Ice, "iceCactusSword");
        	slimeCactusSword = new InfiToolSword(PHInfiTools.cactusSwordID+5, 
                    InfiMaterialEnum.Cactus, InfiMaterialEnum.Slime, "slimeCactusSword");
        	cactusCactusSword = new InfiToolSword(PHInfiTools.cactusSwordID+6, 
                    InfiMaterialEnum.Cactus, InfiMaterialEnum.Cactus, "cactusCactusSword");
            
            MinecraftForge.setToolClass(woodCactusSword, "Sword", InfiMaterialEnum.Cactus.getHarvestLevel());
            MinecraftForge.setToolClass(sandstoneCactusSword, "Sword", InfiMaterialEnum.Cactus.getHarvestLevel());
            MinecraftForge.setToolClass(boneCactusSword, "Sword", InfiMaterialEnum.Cactus.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackCactusSword, "Sword", InfiMaterialEnum.Cactus.getHarvestLevel());
            MinecraftForge.setToolClass(iceCactusSword, "Sword", InfiMaterialEnum.Cactus.getHarvestLevel());
            MinecraftForge.setToolClass(slimeCactusSword, "Sword", InfiMaterialEnum.Cactus.getHarvestLevel());
            MinecraftForge.setToolClass(cactusCactusSword, "Sword", InfiMaterialEnum.Cactus.getHarvestLevel());
        }
        
        if(PHInfiTools.enableFlintTools)
        {
        	woodFlintSword = new InfiToolSword(PHInfiTools.flintSwordID+0, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Wood, "woodFlintSword");
        	stoneFlintSword = new InfiToolSword(PHInfiTools.flintSwordID+1, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Stone, "stoneFlintSword");
        	sandstoneFlintSword = new InfiToolSword(PHInfiTools.flintSwordID+2, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Sandstone, "sandstoneFlintSword");
        	boneFlintSword = new InfiToolSword(PHInfiTools.flintSwordID+3, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Bone, "boneFlintSword");
        	netherrackFlintSword = new InfiToolSword(PHInfiTools.flintSwordID+4, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Netherrack, "netherrackFlintSword");
        	slimeFlintSword = new InfiToolSword(PHInfiTools.flintSwordID+5, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Slime, "slimeFlintSword");
        	cactusFlintSword = new InfiToolSword(PHInfiTools.flintSwordID+6, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Cactus, "cactusFlintSword");
        	flintFlintSword = new InfiToolSword(PHInfiTools.flintSwordID+7, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Flint, "flintFlintSword");
        	copperFlintSword = new InfiToolSword(PHInfiTools.flintSwordID+8, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Copper, "copperFlintSword");
        	bronzeFlintSword = new InfiToolSword(PHInfiTools.flintSwordID+9, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Bronze, "bronzeFlintSword");
            
            MinecraftForge.setToolClass(woodFlintSword, "Sword", InfiMaterialEnum.Flint.getHarvestLevel());
            MinecraftForge.setToolClass(stoneFlintSword, "Sword", InfiMaterialEnum.Flint.getHarvestLevel());
            MinecraftForge.setToolClass(sandstoneFlintSword, "Sword", InfiMaterialEnum.Flint.getHarvestLevel());
            MinecraftForge.setToolClass(boneFlintSword, "Sword", InfiMaterialEnum.Flint.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackFlintSword, "Sword", InfiMaterialEnum.Flint.getHarvestLevel());
            MinecraftForge.setToolClass(slimeFlintSword, "Sword", InfiMaterialEnum.Flint.getHarvestLevel());
            MinecraftForge.setToolClass(cactusFlintSword, "Sword", InfiMaterialEnum.Flint.getHarvestLevel());
            MinecraftForge.setToolClass(flintFlintSword, "Sword", InfiMaterialEnum.Flint.getHarvestLevel());
            MinecraftForge.setToolClass(copperFlintSword, "Sword", InfiMaterialEnum.Flint.getHarvestLevel());
            MinecraftForge.setToolClass(bronzeFlintSword, "Sword", InfiMaterialEnum.Flint.getHarvestLevel());
        }
        
        if(PHInfiTools.enableBlazeTools)
        {
        	diamondBlazeSword = new InfiToolSword(PHInfiTools.blazeSwordID+0, 
                    InfiMaterialEnum.Blaze, InfiMaterialEnum.Diamond, "diamondBlazeSword");
        	obsidianBlazeSword = new InfiToolSword(PHInfiTools.blazeSwordID+1, 
                    InfiMaterialEnum.Blaze, InfiMaterialEnum.Obsidian, "obsidianBlazeSword");
        	netherrackBlazeSword = new InfiToolSword(PHInfiTools.blazeSwordID+2, 
                    InfiMaterialEnum.Blaze, InfiMaterialEnum.Netherrack, "netherrackBlazeSword");
        	lavaBlazeSword = new InfiToolSword(PHInfiTools.blazeSwordID+3, 
                    InfiMaterialEnum.Blaze, InfiMaterialEnum.Lava, "lavaBlazeSword");
        	flintBlazeSword = new InfiToolSword(PHInfiTools.blazeSwordID+4, 
                    InfiMaterialEnum.Blaze, InfiMaterialEnum.Flint, "flintBlazeSword");
        	blazeBlazeSword = new InfiToolSword(PHInfiTools.blazeSwordID+5, 
                    InfiMaterialEnum.Blaze, InfiMaterialEnum.Blaze, "blazeBlazeSword");
        	manyullynBlazeSword = new InfiToolSword(PHInfiTools.blazeSwordID+6, 
                    InfiMaterialEnum.Blaze, InfiMaterialEnum.Manyullyn, "manyullynBlazeSword");
            uraniumBlazeSword = new InfiToolSword(PHInfiTools.blazeSwordID+7, 
                    InfiMaterialEnum.Blaze, InfiMaterialEnum.Uranium, "uraniumBlazeSword");
            
            MinecraftForge.setToolClass(diamondBlazeSword, "Sword", InfiMaterialEnum.Blaze.getHarvestLevel());
            MinecraftForge.setToolClass(obsidianBlazeSword, "Sword", InfiMaterialEnum.Blaze.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackBlazeSword, "Sword", InfiMaterialEnum.Blaze.getHarvestLevel());
            MinecraftForge.setToolClass(blazeBlazeSword, "Sword", InfiMaterialEnum.Blaze.getHarvestLevel());
            MinecraftForge.setToolClass(flintBlazeSword, "Sword", InfiMaterialEnum.Blaze.getHarvestLevel());
            MinecraftForge.setToolClass(blazeBlazeSword, "Sword", InfiMaterialEnum.Blaze.getHarvestLevel());
            MinecraftForge.setToolClass(manyullynBlazeSword, "Sword", InfiMaterialEnum.Blaze.getHarvestLevel());
            MinecraftForge.setToolClass(uraniumBlazeSword, "Sword", InfiMaterialEnum.Blaze.getHarvestLevel());
        }
    	
        if(PHInfiTools.enableCopperTools)
        {
        	woodCopperSword = new InfiToolSword(PHInfiTools.copperSwordID+0, 
                    InfiMaterialEnum.Copper, InfiMaterialEnum.Wood, "woodCopperSword");
            stoneCopperSword = new InfiToolSword(PHInfiTools.copperSwordID+1, 
                    InfiMaterialEnum.Copper, InfiMaterialEnum.Stone, "stoneCopperSword");
            boneCopperSword = new InfiToolSword(PHInfiTools.copperSwordID+2, 
                    InfiMaterialEnum.Copper, InfiMaterialEnum.Bone, "boneCopperSword");
            netherrackCopperSword = new InfiToolSword(PHInfiTools.copperSwordID+3, 
                    InfiMaterialEnum.Copper, InfiMaterialEnum.Netherrack, "netherrackCopperSword");
            slimeCopperSword = new InfiToolSword(PHInfiTools.copperSwordID+4, 
                    InfiMaterialEnum.Copper, InfiMaterialEnum.Slime, "slimeCopperSword");
            cactusCopperSword = new InfiToolSword(PHInfiTools.copperSwordID+5, 
                    InfiMaterialEnum.Copper, InfiMaterialEnum.Cactus, "cactusCopperSword");
            flintCopperSword = new InfiToolSword(PHInfiTools.copperSwordID+6, 
                    InfiMaterialEnum.Copper, InfiMaterialEnum.Flint, "flintCopperSword");
            copperCopperSword = new InfiToolSword(PHInfiTools.copperSwordID+7, 
                    InfiMaterialEnum.Copper, InfiMaterialEnum.Copper, "copperCopperSword");
            
            MinecraftForge.setToolClass(woodCopperSword, "Sword", InfiMaterialEnum.Copper.getHarvestLevel());
        	MinecraftForge.setToolClass(stoneCopperSword, "Sword", InfiMaterialEnum.Copper.getHarvestLevel());
            MinecraftForge.setToolClass(boneCopperSword, "Sword", InfiMaterialEnum.Copper.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackCopperSword, "Sword", InfiMaterialEnum.Copper.getHarvestLevel());
            MinecraftForge.setToolClass(slimeCopperSword, "Sword", InfiMaterialEnum.Copper.getHarvestLevel());
            MinecraftForge.setToolClass(cactusCopperSword, "Sword", InfiMaterialEnum.Copper.getHarvestLevel());
            MinecraftForge.setToolClass(flintCopperSword, "Sword", InfiMaterialEnum.Copper.getHarvestLevel());
            MinecraftForge.setToolClass(copperCopperSword, "Sword", InfiMaterialEnum.Copper.getHarvestLevel());
        }
        
        if(PHInfiTools.enableBronzeTools)
        {
        	woodBronzeSword = new InfiToolSword(PHInfiTools.bronzeSwordID+0, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Wood, "woodBronzeSword");
            stoneBronzeSword = new InfiToolSword(PHInfiTools.bronzeSwordID+1, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Stone, "stoneBronzeSword");
            boneBronzeSword = new InfiToolSword(PHInfiTools.bronzeSwordID+2, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Bone, "boneBronzeSword");
            netherrackBronzeSword = new InfiToolSword(PHInfiTools.bronzeSwordID+3, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Netherrack, "netherrackBronzeSword");
            slimeBronzeSword = new InfiToolSword(PHInfiTools.bronzeSwordID+4, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Slime, "slimeBronzeSword");
            cactusBronzeSword = new InfiToolSword(PHInfiTools.bronzeSwordID+5, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Cactus, "cactusBronzeSword");
            flintBronzeSword = new InfiToolSword(PHInfiTools.bronzeSwordID+6, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Flint, "flintBronzeSword");
            copperBronzeSword = new InfiToolSword(PHInfiTools.bronzeSwordID+7, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Copper, "copperBronzeSword");
            bronzeBronzeSword = new InfiToolSword(PHInfiTools.bronzeSwordID+8, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Bronze, "bronzeBronzeSword");
            
            MinecraftForge.setToolClass(woodBronzeSword, "Sword", InfiMaterialEnum.Bronze.getHarvestLevel());
            MinecraftForge.setToolClass(stoneBronzeSword, "Sword", InfiMaterialEnum.Bronze.getHarvestLevel());
            MinecraftForge.setToolClass(boneBronzeSword, "Sword", InfiMaterialEnum.Bronze.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackBronzeSword, "Sword", InfiMaterialEnum.Bronze.getHarvestLevel());
            MinecraftForge.setToolClass(slimeBronzeSword, "Sword", InfiMaterialEnum.Bronze.getHarvestLevel());
            MinecraftForge.setToolClass(cactusBronzeSword, "Sword", InfiMaterialEnum.Bronze.getHarvestLevel());
            MinecraftForge.setToolClass(flintBronzeSword, "Sword", InfiMaterialEnum.Bronze.getHarvestLevel());
            MinecraftForge.setToolClass(copperBronzeSword, "Sword", InfiMaterialEnum.Bronze.getHarvestLevel());
            MinecraftForge.setToolClass(bronzeBronzeSword, "Sword", InfiMaterialEnum.Bronze.getHarvestLevel());
        }
        
        if(PHInfiTools.enableWorkedIronTools)
        {
        	woodWorkedIronSword = new InfiToolSword(PHInfiTools.workedIronSwordID+0, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Wood, "woodWorkedIronSword");
            stoneWorkedIronSword = new InfiToolSword(PHInfiTools.workedIronSwordID+1, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Stone, "stoneWorkedIronSword");
            ironWorkedIronSword = new InfiToolSword(PHInfiTools.workedIronSwordID+2,
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Iron, "ironWorkedIronSword");
            diamondWorkedIronSword = new InfiToolSword(PHInfiTools.workedIronSwordID+3, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Diamond, "diamondWorkedIronSword");
            redstoneWorkedIronSword = new InfiToolSword(PHInfiTools.workedIronSwordID+4, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Redstone, "redstoneWorkedIronSword");
            obsidianWorkedIronSword = new InfiToolSword(PHInfiTools.workedIronSwordID+5, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Obsidian, "obsidianWorkedIronSword");
            boneWorkedIronSword = new InfiToolSword(PHInfiTools.workedIronSwordID+6, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Bone, "boneWorkedIronSword");
            netherrackWorkedIronSword = new InfiToolSword(PHInfiTools.workedIronSwordID+7, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Netherrack, "netherrackWorkedIronSword");
            glowstoneWorkedIronSword = new InfiToolSword(PHInfiTools.workedIronSwordID+8, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Glowstone, "glowstoneWorkedIronSword");
            iceWorkedIronSword = new InfiToolSword(PHInfiTools.workedIronSwordID+9, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Ice, "iceWorkedIronSword");
            slimeWorkedIronSword = new InfiToolSword(PHInfiTools.workedIronSwordID+10, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Slime, "slimeWorkedIronSword");
            cactusWorkedIronSword = new InfiToolSword(PHInfiTools.workedIronSwordID+11, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Cactus, "cactusWorkedIronSword");
            blazeWorkedIronSword = new InfiToolSword(PHInfiTools.workedIronSwordID+12, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Blaze, "blazeWorkedIronSword");
            copperWorkedIronSword = new InfiToolSword(PHInfiTools.workedIronSwordID+13, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Copper, "copperWorkedIronSword");
            bronzeWorkedIronSword = new InfiToolSword(PHInfiTools.workedIronSwordID+14, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Bronze, "bronzeWorkedIronSword");
            workedWorkedIronSword = new InfiToolSword(PHInfiTools.workedIronSwordID+15, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.WorkedIron, "workedWorkedIronSword");
            steelWorkedIronSword = new InfiToolSword(PHInfiTools.workedIronSwordID+16, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Steel, "steelWorkedIronSword");
            uraniumWorkedIronSword = new InfiToolSword(PHInfiTools.workedIronSwordID+17, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Uranium, "uraniumWorkedIronSword");
            
            MinecraftForge.setToolClass(woodWorkedIronSword, "Sword", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(stoneWorkedIronSword, "Sword", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(ironWorkedIronSword, "Sword", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(diamondWorkedIronSword, "Sword", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(redstoneWorkedIronSword, "Sword", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(obsidianWorkedIronSword, "Sword", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(boneWorkedIronSword, "Sword", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackWorkedIronSword, "Sword", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(glowstoneWorkedIronSword, "Sword", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(iceWorkedIronSword, "Sword", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(slimeWorkedIronSword, "Sword", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(cactusWorkedIronSword, "Sword", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(blazeWorkedIronSword, "Sword", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(copperWorkedIronSword, "Sword", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(bronzeWorkedIronSword, "Sword", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(workedWorkedIronSword, "Sword", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(steelWorkedIronSword, "Sword", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(uraniumWorkedIronSword, "Sword", InfiMaterialEnum.WorkedIron.getHarvestLevel());
        }
        
        if(PHInfiTools.enableSteelTools)
        {
        	woodSteelSword = new InfiToolSword(PHInfiTools.steelSwordID+0, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Wood, "woodSteelSword");
            stoneSteelSword = new InfiToolSword(PHInfiTools.steelSwordID+1, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Stone, "stoneSteelSword");
            ironSteelSword = new InfiToolSword(PHInfiTools.steelSwordID+2, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Iron, "ironSteelSword");
            diamondSteelSword = new InfiToolSword(PHInfiTools.steelSwordID+3, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Diamond, "diamondSteelSword");
            redstoneSteelSword = new InfiToolSword(PHInfiTools.steelSwordID+4, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Redstone, "redstoneSteelSword");
            obsidianSteelSword = new InfiToolSword(PHInfiTools.steelSwordID+5, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Obsidian, "obsidianSteelSword");
            boneSteelSword = new InfiToolSword(PHInfiTools.steelSwordID+6, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Bone, "boneSteelSword");
            netherrackSteelSword = new InfiToolSword(PHInfiTools.steelSwordID+7, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Netherrack, "netherrackSteelSword");
            glowstoneSteelSword = new InfiToolSword(PHInfiTools.steelSwordID+8, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Glowstone, "glowstoneSteelSword");
            iceSteelSword = new InfiToolSword(PHInfiTools.steelSwordID+9, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Ice, "iceSteelSword");
            slimeSteelSword = new InfiToolSword(PHInfiTools.steelSwordID+10, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Slime, "slimeSteelSword");
            cactusSteelSword = new InfiToolSword(PHInfiTools.steelSwordID+11, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Cactus, "cactusSteelSword");
            blazeSteelSword = new InfiToolSword(PHInfiTools.steelSwordID+12, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Blaze, "blazeSteelSword");
            copperSteelSword = new InfiToolSword(PHInfiTools.steelSwordID+13, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Copper, "copperSteelSword");
            bronzeSteelSword = new InfiToolSword(PHInfiTools.steelSwordID+14, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Bronze, "bronzeSteelSword");
            workedSteelSword = new InfiToolSword(PHInfiTools.steelSwordID+15, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.WorkedIron, "workedSteelSword");
            steelSteelSword = new InfiToolSword(PHInfiTools.steelSwordID+16, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Steel, "steelSteelSword");
            cobaltSteelSword = new InfiToolSword(PHInfiTools.steelSwordID+17, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Cobalt, "cobaltSteelSword");
            arditeSteelSword = new InfiToolSword(PHInfiTools.steelSwordID+18, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Ardite, "arditeSteelSword");
            uraniumSteelSword = new InfiToolSword(PHInfiTools.steelSwordID+19, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Uranium, "uraniumSteelSword");

            MinecraftForge.setToolClass(woodSteelSword, "Sword", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(stoneSteelSword, "Sword", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(ironSteelSword, "Sword", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(diamondSteelSword, "Sword", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(redstoneSteelSword, "Sword", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(obsidianSteelSword, "Sword", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(boneSteelSword, "Sword", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackSteelSword, "Sword", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(glowstoneSteelSword, "Sword", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(iceSteelSword, "Sword", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(slimeSteelSword, "Sword", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(cactusSteelSword, "Sword", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(blazeSteelSword, "Sword", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(copperSteelSword, "Sword", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(bronzeSteelSword, "Sword", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(workedSteelSword, "Sword", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(steelSteelSword, "Sword", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(cobaltSteelSword, "Sword", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(arditeSteelSword, "Sword", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(uraniumSteelSword, "Sword", InfiMaterialEnum.Steel.getHarvestLevel());
        }
        
        if(PHInfiTools.enableCobaltTools)
        {
        	woodCobaltSword = new InfiToolSword(PHInfiTools.cobaltSwordID+0, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Wood, "woodCobaltSword");
            stoneCobaltSword = new InfiToolSword(PHInfiTools.cobaltSwordID+1, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Stone, "stoneCobaltSword");
            ironCobaltSword = new InfiToolSword(PHInfiTools.cobaltSwordID+2, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Iron, "ironCobaltSword");
            diamondCobaltSword = new InfiToolSword(PHInfiTools.cobaltSwordID+3,
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Diamond, "diamondCobaltSword");
            redstoneCobaltSword = new InfiToolSword(PHInfiTools.cobaltSwordID+4, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Redstone, "redstoneCobaltSword");
            obsidianCobaltSword = new InfiToolSword(PHInfiTools.cobaltSwordID+5, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Obsidian, "obsidianCobaltSword");
            boneCobaltSword = new InfiToolSword(PHInfiTools.cobaltSwordID+6, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Bone, "boneCobaltSword");
            slimeCobaltSword = new InfiToolSword(PHInfiTools.cobaltSwordID+7, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Slime, "slimeCobaltSword");
            cactusCobaltSword = new InfiToolSword(PHInfiTools.cobaltSwordID+8, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Cactus, "cactusCobaltSword");
            blazeCobaltSword = new InfiToolSword(PHInfiTools.cobaltSwordID+9, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Blaze, "blazeCobaltSword");
            copperCobaltSword = new InfiToolSword(PHInfiTools.cobaltSwordID+10, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Copper, "copperCobaltSword");
            bronzeCobaltSword = new InfiToolSword(PHInfiTools.cobaltSwordID+11, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Bronze, "bronzeCobaltSword");
            workedCobaltSword = new InfiToolSword(PHInfiTools.cobaltSwordID+12, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.WorkedIron, "workedCobaltSword");
            steelCobaltSword = new InfiToolSword(PHInfiTools.cobaltSwordID+13, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Steel, "steelCobaltSword");
            cobaltCobaltSword = new InfiToolSword(PHInfiTools.cobaltSwordID+14, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Cobalt, "cobaltCobaltSword");
            arditeCobaltSword = new InfiToolSword(PHInfiTools.cobaltSwordID+15, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Ardite, "arditeCobaltSword");
            manyullynCobaltSword = new InfiToolSword(PHInfiTools.cobaltSwordID+16, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Manyullyn, "manyullynCobaltSword");
            uraniumCobaltSword = new InfiToolSword(PHInfiTools.cobaltSwordID+17, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Uranium, "uraniumCobaltSword");
            
            MinecraftForge.setToolClass(woodCobaltSword, "Sword", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(stoneCobaltSword, "Sword", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(ironCobaltSword, "Sword", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(diamondCobaltSword, "Sword", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(redstoneCobaltSword, "Sword", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(obsidianCobaltSword, "Sword", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(boneCobaltSword, "Sword", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(slimeCobaltSword, "Sword", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(cactusCobaltSword, "Sword", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(blazeCobaltSword, "Sword", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(copperCobaltSword, "Sword", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(bronzeCobaltSword, "Sword", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(workedCobaltSword, "Sword", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(steelCobaltSword, "Sword", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(cobaltCobaltSword, "Sword", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(arditeCobaltSword, "Sword", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(manyullynCobaltSword, "Sword", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(uraniumCobaltSword, "Sword", InfiMaterialEnum.Cobalt.getHarvestLevel());
        }
        
        if(PHInfiTools.enableArditeTools)
        {
        	woodArditeSword = new InfiToolSword(PHInfiTools.arditeSwordID+0, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Wood, "woodArditeSword");
            stoneArditeSword = new InfiToolSword(PHInfiTools.arditeSwordID+1, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Stone, "stoneArditeSword");
            ironArditeSword = new InfiToolSword(PHInfiTools.arditeSwordID+2, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Iron, "ironArditeSword");
            diamondArditeSword = new InfiToolSword(PHInfiTools.arditeSwordID+3,
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Diamond, "diamondArditeSword");
            redstoneArditeSword = new InfiToolSword(PHInfiTools.arditeSwordID+4, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Redstone, "redstoneArditeSword");
            obsidianArditeSword = new InfiToolSword(PHInfiTools.arditeSwordID+5, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Obsidian, "obsidianArditeSword");
            boneArditeSword = new InfiToolSword(PHInfiTools.arditeSwordID+6,
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Bone, "boneArditeSword");
            slimeArditeSword = new InfiToolSword(PHInfiTools.arditeSwordID+7, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Slime, "slimeArditeSword");
            cactusArditeSword = new InfiToolSword(PHInfiTools.arditeSwordID+8, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Cactus, "cactusArditeSword");
            blazeArditeSword = new InfiToolSword(PHInfiTools.arditeSwordID+9, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Blaze, "blazeArditeSword");
            copperArditeSword = new InfiToolSword(PHInfiTools.arditeSwordID+10, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Copper, "copperArditeSword");
            bronzeArditeSword = new InfiToolSword(PHInfiTools.arditeSwordID+11, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Bronze, "bronzeArditeSword");
            workedArditeSword = new InfiToolSword(PHInfiTools.arditeSwordID+12, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.WorkedIron, "workedArditeSword");
            steelArditeSword = new InfiToolSword(PHInfiTools.arditeSwordID+13, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Steel, "steelArditeSword");
            cobaltArditeSword = new InfiToolSword(PHInfiTools.arditeSwordID+14, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Cobalt, "cobaltArditeSword");
            arditeArditeSword = new InfiToolSword(PHInfiTools.arditeSwordID+15, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Ardite, "arditeArditeSword");
            manyullynArditeSword = new InfiToolSword(PHInfiTools.arditeSwordID+16, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Manyullyn, "manyullynArditeSword");
            uraniumArditeSword = new InfiToolSword(PHInfiTools.arditeSwordID+17, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Uranium, "uraniumArditeSword");
            
            MinecraftForge.setToolClass(woodArditeSword, "Sword", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(stoneArditeSword, "Sword", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(ironArditeSword, "Sword", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(diamondArditeSword, "Sword", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(redstoneArditeSword, "Sword", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(obsidianArditeSword, "Sword", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(boneArditeSword, "Sword", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(slimeArditeSword, "Sword", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(cactusArditeSword, "Sword", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(blazeArditeSword, "Sword", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(copperArditeSword, "Sword", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(bronzeArditeSword, "Sword", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(workedArditeSword, "Sword", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(steelArditeSword, "Sword", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(cobaltArditeSword, "Sword", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(arditeArditeSword, "Sword", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(manyullynArditeSword, "Sword", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(uraniumArditeSword, "Sword", InfiMaterialEnum.Ardite.getHarvestLevel());
        }
        
        if(PHInfiTools.enableManyullynTools)
        {
        	woodManyullynSword = new InfiToolSword(PHInfiTools.manyullynSwordID+0, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Wood, "woodManyullynSword");
            stoneManyullynSword = new InfiToolSword(PHInfiTools.manyullynSwordID+1, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Stone, "stoneManyullynSword");
            ironManyullynSword = new InfiToolSword(PHInfiTools.manyullynSwordID+2, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Iron, "ironManyullynSword");
            diamondManyullynSword = new InfiToolSword(PHInfiTools.manyullynSwordID+3,
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Diamond, "diamondManyullynSword");
            redstoneManyullynSword = new InfiToolSword(PHInfiTools.manyullynSwordID+4, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Redstone, "redstoneManyullynSword");
            obsidianManyullynSword = new InfiToolSword(PHInfiTools.manyullynSwordID+5, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Obsidian, "obsidianManyullynSword");
            boneManyullynSword = new InfiToolSword(PHInfiTools.manyullynSwordID+6, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Bone, "boneManyullynSword");
            slimeManyullynSword = new InfiToolSword(PHInfiTools.manyullynSwordID+7, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Slime, "slimeManyullynSword");
            cactusManyullynSword = new InfiToolSword(PHInfiTools.manyullynSwordID+8, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Cactus, "cactusManyullynSword");
            blazeManyullynSword = new InfiToolSword(PHInfiTools.manyullynSwordID+9, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Blaze, "blazeManyullynSword");
            copperManyullynSword = new InfiToolSword(PHInfiTools.manyullynSwordID+10, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Copper, "copperManyullynSword");
            bronzeManyullynSword = new InfiToolSword(PHInfiTools.manyullynSwordID+11, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Bronze, "bronzeManyullynSword");
            workedManyullynSword = new InfiToolSword(PHInfiTools.manyullynSwordID+12, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.WorkedIron, "workedManyullynSword");
            steelManyullynSword = new InfiToolSword(PHInfiTools.manyullynSwordID+13, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Steel, "steelManyullynSword");
            cobaltManyullynSword = new InfiToolSword(PHInfiTools.manyullynSwordID+14, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Cobalt, "cobaltManyullynSword");
            arditeManyullynSword = new InfiToolSword(PHInfiTools.manyullynSwordID+15, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Ardite, "arditeManyullynSword");
            manyullynManyullynSword = new InfiToolSword(PHInfiTools.manyullynSwordID+16, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Manyullyn, "manyullynManyullynSword");
            uraniumManyullynSword = new InfiToolSword(PHInfiTools.manyullynSwordID+17,
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Uranium, "uraniumManyullynSword");
            
            MinecraftForge.setToolClass(woodManyullynSword, "Sword", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(stoneManyullynSword, "Sword", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(ironManyullynSword, "Sword", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(diamondManyullynSword, "Sword", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(redstoneManyullynSword, "Sword", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(obsidianManyullynSword, "Sword", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(boneManyullynSword, "Sword", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(slimeManyullynSword, "Sword", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(cactusManyullynSword, "Sword", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(blazeManyullynSword, "Sword", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(copperManyullynSword, "Sword", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(bronzeManyullynSword, "Sword", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(workedManyullynSword, "Sword", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(steelManyullynSword, "Sword", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(cobaltManyullynSword, "Sword", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(arditeManyullynSword, "Sword", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(manyullynManyullynSword, "Sword", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(uraniumManyullynSword, "Sword", InfiMaterialEnum.Manyullyn.getHarvestLevel());
        }
        
        if(PHInfiTools.enableUraniumTools)
        {
            diamondUraniumSword = new InfiToolSword(PHInfiTools.uraniumSwordID+0, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Diamond, "diamondUraniumSword");
            redstoneUraniumSword = new InfiToolSword(PHInfiTools.uraniumSwordID+1, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Redstone, "redstoneUraniumSword");
            boneUraniumSword = new InfiToolSword(PHInfiTools.uraniumSwordID+2, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Bone, "boneUraniumSword");
            netherrackUraniumSword = new InfiToolSword(PHInfiTools.uraniumSwordID+3, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Netherrack, "netherrackUraniumSword");
            glowstoneUraniumSword = new InfiToolSword(PHInfiTools.uraniumSwordID+4, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Glowstone, "glowstoneUraniumSword");
            lavaUraniumSword = new InfiToolSword(PHInfiTools.uraniumSwordID+5, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Lava, "lavaUraniumSword");
            blazeUraniumSword = new InfiToolSword(PHInfiTools.uraniumSwordID+6, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Blaze, "blazeUraniumSword");
            cobaltUraniumSword = new InfiToolSword(PHInfiTools.uraniumSwordID+7, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Cobalt, "cobaltUraniumSword");
            arditeUraniumSword = new InfiToolSword(PHInfiTools.uraniumSwordID+8, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Ardite, "arditeUraniumSword");
            uraniumUraniumSword = new InfiToolSword(PHInfiTools.uraniumSwordID+9, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Uranium, "uraniumUraniumSword");
            
            MinecraftForge.setToolClass(diamondUraniumSword, "Sword", InfiMaterialEnum.Uranium.getHarvestLevel());
            MinecraftForge.setToolClass(redstoneUraniumSword, "Sword", InfiMaterialEnum.Uranium.getHarvestLevel());
            MinecraftForge.setToolClass(boneUraniumSword, "Sword", InfiMaterialEnum.Uranium.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackUraniumSword, "Sword", InfiMaterialEnum.Uranium.getHarvestLevel());
            MinecraftForge.setToolClass(glowstoneUraniumSword, "Sword", InfiMaterialEnum.Uranium.getHarvestLevel());
            MinecraftForge.setToolClass(lavaUraniumSword, "Sword", InfiMaterialEnum.Uranium.getHarvestLevel());
            MinecraftForge.setToolClass(blazeUraniumSword, "Sword", InfiMaterialEnum.Uranium.getHarvestLevel());
            MinecraftForge.setToolClass(cobaltUraniumSword, "Sword", InfiMaterialEnum.Uranium.getHarvestLevel());
            MinecraftForge.setToolClass(arditeUraniumSword, "Sword", InfiMaterialEnum.Uranium.getHarvestLevel());
            MinecraftForge.setToolClass(uraniumUraniumSword, "Sword", InfiMaterialEnum.Uranium.getHarvestLevel());
        }
    }
    
    private static void addNames()
    {
    	if(PHInfiTools.enableWoodTools && PHInfiTools.overwriteVanillaTools)
            ModLoader.addName(woodWoodSword, "Wooden Sword");
        if(PHInfiTools.enableStoneTools)
            ModLoader.addName(stoneStoneSword, "Heavy Sword");
        if(PHInfiTools.enableIronTools)
            ModLoader.addName(ironIronSword, "Ironic Sword");
        if(PHInfiTools.enableDiamondTools)
            ModLoader.addName(diamondDiamondSword, "Diamondium Sword");
        if(PHInfiTools.enableRedstoneTools)
            ModLoader.addName(redstoneRedstoneSword, "Redredred Sword");
        if(PHInfiTools.enableObsidianTools)
            ModLoader.addName(obsidianObsidianSword, "Ebony Sword");
        if(PHInfiTools.enableSandstoneTools)
            ModLoader.addName(sandstoneSandstoneSword, "Fragile Sword");
        if(PHInfiTools.enableNetherrackTools)
            ModLoader.addName(boneBoneSword, "Necrotic Sword");
        if(PHInfiTools.enablePaperTools)
            ModLoader.addName(paperPaperSword, "Soft Sword");
        if(PHInfiTools.enableMossyTools)
            ModLoader.addName(mossyMossySword, "Living Sword");
        if(PHInfiTools.enableNetherrackTools)
            ModLoader.addName(netherrackNetherrackSword, "Bloodsoaked Sword");
        if(PHInfiTools.enableGlowstoneTools)
            ModLoader.addName(glowstoneGlowstoneSword, "Bright Sword");
        if(PHInfiTools.enableIceTools)
            ModLoader.addName(iceIceSword, "Freezing Sword");
        if(PHInfiTools.enableLavaTools)
            ModLoader.addName(lavaLavaSword, "Burning Sword");
        if(PHInfiTools.enableSlimeTools)
            ModLoader.addName(slimeSlimeSword, "Toy Sword");
        if(PHInfiTools.enableCactusTools)
            ModLoader.addName(cactusCactusSword, "Thorned Sword");
        if(PHInfiTools.enableFlintTools)
            ModLoader.addName(flintFlintSword, "Rough-hewn Sword");
        if(PHInfiTools.enableBlazeTools)
            ModLoader.addName(blazeBlazeSword, "Netherite Sword");
        if(PHInfiTools.enableCopperTools)
            ModLoader.addName(copperCopperSword, "Orange-Tang Sword");
        if(PHInfiTools.enableBronzeTools)
            ModLoader.addName(bronzeBronzeSword, "Polished Sword");
        if(PHInfiTools.enableWorkedIronTools)
            ModLoader.addName(workedWorkedIronSword, "Reworked Iron Sword");
        if(PHInfiTools.enableSteelTools)
            ModLoader.addName(steelSteelSword, "Forge-Wrought Sword");
        if(PHInfiTools.enableCobaltTools)
            ModLoader.addName(cobaltCobaltSword, "Beautiful Sword");
        if(PHInfiTools.enableArditeTools)
            ModLoader.addName(arditeArditeSword, "Rustic Sword");
        if(PHInfiTools.enableManyullynTools)
            ModLoader.addName(manyullynManyullynSword, "False-Prophetic Sword");
        if(PHInfiTools.enableUraniumTools)
            ModLoader.addName(uraniumUraniumSword, "Cancerous Sword");
    }
    
    public static void registerInfiToolsRecipes()
    {
    	if(PHInfiTools.enableWoodTools)
        {
    		if (PHInfiTools.overwriteVanillaTools)
    			ModLoader.addRecipe(new ItemStack(woodWoodSword), recipe, '#', Block.planks, '|', Item.stick );
            ModLoader.addRecipe(new ItemStack(sandstoneWoodSword), new Object[] 
                    { recipe, '#', Block.planks, '|', InfiLibrary.sandstoneRod });
            ModLoader.addRecipe(new ItemStack(boneWoodSword), new Object[] 
                    { recipe, '#', Block.planks, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneWoodSword), new Object[] 
                    { recipe, '#', Block.planks, '|', InfiLibrary.boneRod });
            ModLoader.addRecipe(new ItemStack(paperWoodSword), new Object[] 
                    { recipe, '#', Block.planks, '|', InfiLibrary.paperRod });
            ModLoader.addRecipe(new ItemStack(iceWoodSword), new Object[] 
                    { recipe, '#', Block.planks, '|', InfiLibrary.iceRod });
            ModLoader.addRecipe(new ItemStack(slimeWoodSword), new Object[] 
                    { recipe, '#', Block.planks, '|', InfiLibrary.slimeRod });
            ModLoader.addRecipe(new ItemStack(cactusWoodSword), new Object[] 
                    { recipe, '#', Block.planks, '|', InfiLibrary.cactusRod });
        }
    	
        if(PHInfiTools.enableStoneTools)
        {
        	if (PHInfiTools.overwriteVanillaTools)
        		ModLoader.addRecipe(new ItemStack(woodStoneSword), recipe, '#', Block.cobblestone, '|', Item.stick );
        	ModLoader.addRecipe(new ItemStack(stoneStoneSword), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', InfiLibrary.stoneRod });
            ModLoader.addRecipe(new ItemStack(sandstoneStoneSword), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', InfiLibrary.sandstoneRod });
            ModLoader.addRecipe(new ItemStack(boneStoneSword), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneStoneSword), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', InfiLibrary.boneRod });
            ModLoader.addRecipe(new ItemStack(netherrackStoneSword), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', InfiLibrary.netherrackRod });
            ModLoader.addRecipe(new ItemStack(iceStoneSword), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', InfiLibrary.iceRod });
            ModLoader.addRecipe(new ItemStack(slimeStoneSword), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', InfiLibrary.slimeRod });
            ModLoader.addRecipe(new ItemStack(cactusStoneSword), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', InfiLibrary.cactusRod });
            ModLoader.addRecipe(new ItemStack(flintStoneSword), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', InfiLibrary.flintRod });
            
            if (PHInfiTools.overwriteVanillaTools)
            ModLoader.addRecipe(new ItemStack(woodStoneSword), recipe, '#', Block.stone, '|', Item.stick );
        	ModLoader.addRecipe(new ItemStack(stoneStoneSword), new Object[] 
                    { recipe, '#', Block.stone, '|', InfiLibrary.stoneRod });
            ModLoader.addRecipe(new ItemStack(sandstoneStoneSword), new Object[] 
                    { recipe, '#', Block.stone, '|', InfiLibrary.sandstoneRod });
            ModLoader.addRecipe(new ItemStack(boneStoneSword), new Object[] 
                    { recipe, '#', Block.stone, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneStoneSword), new Object[] 
                    { recipe, '#', Block.stone, '|', InfiLibrary.boneRod });
            ModLoader.addRecipe(new ItemStack(netherrackStoneSword), new Object[] 
                    { recipe, '#', Block.stone, '|', InfiLibrary.netherrackRod });
            ModLoader.addRecipe(new ItemStack(iceStoneSword), new Object[] 
                    { recipe, '#', Block.stone, '|', InfiLibrary.iceRod });
            ModLoader.addRecipe(new ItemStack(slimeStoneSword), new Object[] 
                    { recipe, '#', Block.stone, '|', InfiLibrary.slimeRod });
            ModLoader.addRecipe(new ItemStack(cactusStoneSword), new Object[] 
                    { recipe, '#', Block.stone, '|', InfiLibrary.cactusRod });
            ModLoader.addRecipe(new ItemStack(flintStoneSword), new Object[] 
                    { recipe, '#', Block.stone, '|', InfiLibrary.flintRod });
        }
        
        if(PHInfiTools.enableIronTools)
        {
        	if (PHInfiTools.overwriteVanillaTools)
        		ModLoader.addRecipe(new ItemStack(woodIronSword), recipe, '#', Item.ingotIron, '|', Item.stick );
        	ModLoader.addRecipe(new ItemStack(stoneIronSword), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', InfiLibrary.stoneRod });
            ModLoader.addRecipe(new ItemStack(ironIronSword), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', InfiLibrary.ironRod });
            ModLoader.addRecipe(new ItemStack(boneIronSword), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneIronSword), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', InfiLibrary.boneRod });
            ModLoader.addRecipe(new ItemStack(netherrackIronSword), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', InfiLibrary.netherrackRod });
            ModLoader.addRecipe(new ItemStack(glowstoneIronSword), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', InfiLibrary.glowstoneRod });
            ModLoader.addRecipe(new ItemStack(cactusIronSword), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', InfiLibrary.cactusRod });
            ModLoader.addRecipe(new ItemStack(copperIronSword), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', InfiLibrary.copperRod });
            ModLoader.addRecipe(new ItemStack(bronzeIronSword), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', InfiLibrary.bronzeRod });
        }
        
        if(PHInfiTools.enableDiamondTools)
        {
        	if (PHInfiTools.overwriteVanillaTools)
        		ModLoader.addRecipe(new ItemStack(woodDiamondSword), recipe, '#', Item.diamond, '|', Item.stick );
        	ModLoader.addRecipe(new ItemStack(stoneDiamondSword), new Object[] 
                    { recipe, '#', Item.diamond, '|', InfiLibrary.stoneRod });
            ModLoader.addRecipe(new ItemStack(ironDiamondSword), new Object[] 
                    { recipe, '#', Item.diamond, '|', InfiLibrary.ironRod });
            ModLoader.addRecipe(new ItemStack(diamondDiamondSword), new Object[] 
                    { recipe, '#', Item.diamond, '|', InfiLibrary.diamondRod });
            ModLoader.addRecipe(new ItemStack(redstoneDiamondSword), new Object[] 
                    { recipe, '#', Item.diamond, '|', InfiLibrary.redstoneRod });
            ModLoader.addRecipe(new ItemStack(obsidianDiamondSword), new Object[] 
                    { recipe, '#', Item.diamond, '|', InfiLibrary.obsidianRod });
            ModLoader.addRecipe(new ItemStack(boneDiamondSword), new Object[] 
                    { recipe, '#', Item.diamond, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneDiamondSword), new Object[] 
                    { recipe, '#', Item.diamond, '|', InfiLibrary.boneRod });
            ModLoader.addRecipe(new ItemStack(mossyDiamondSword), new Object[] 
                    { recipe, '#', Item.diamond, '|', InfiLibrary.mossyRod });
            ModLoader.addRecipe(new ItemStack(netherrackDiamondSword), new Object[] 
                    { recipe, '#', Item.diamond, '|', InfiLibrary.netherrackRod });
            ModLoader.addRecipe(new ItemStack(glowstoneDiamondSword), new Object[] 
                    { recipe, '#', Item.diamond, '|', InfiLibrary.glowstoneRod });
            ModLoader.addRecipe(new ItemStack(lavaDiamondSword), new Object[] 
                    { recipe, '#', Item.diamond, '|', InfiLibrary.lavaRod });
            ModLoader.addRecipe(new ItemStack(cactusDiamondSword), new Object[] 
                    { recipe, '#', Item.diamond, '|', InfiLibrary.cactusRod });
            ModLoader.addRecipe(new ItemStack(flintDiamondSword), new Object[] 
                    { recipe, '#', Item.diamond, '|', InfiLibrary.flintRod });
            ModLoader.addRecipe(new ItemStack(blazeDiamondSword), new Object[] 
                    { recipe, '#', Item.diamond, '|', Item.blazeRod });
            ModLoader.addRecipe(new ItemStack(copperDiamondSword), new Object[] 
                    { recipe, '#', Item.diamond, '|', InfiLibrary.copperRod });
            ModLoader.addRecipe(new ItemStack(bronzeDiamondSword), new Object[] 
                    { recipe, '#', Item.diamond, '|', InfiLibrary.bronzeRod });
            ModLoader.addRecipe(new ItemStack(workedDiamondSword), new Object[] 
                    { recipe, '#', Item.diamond, '|', InfiLibrary.workedIronRod });
            ModLoader.addRecipe(new ItemStack(steelDiamondSword), new Object[] 
                    { recipe, '#', Item.diamond, '|', InfiLibrary.steelRod });
            ModLoader.addRecipe(new ItemStack(cobaltDiamondSword), new Object[] 
                    { recipe, '#', Item.diamond, '|', InfiLibrary.cobaltRod });
            ModLoader.addRecipe(new ItemStack(arditeDiamondSword), new Object[] 
                    { recipe, '#', Item.diamond, '|', InfiLibrary.arditeRod });
            ModLoader.addRecipe(new ItemStack(manyullynDiamondSword), new Object[] 
                    { recipe, '#', Item.diamond, '|', InfiLibrary.manyullynRod });
            ModLoader.addRecipe(new ItemStack(uraniumDiamondSword), new Object[] 
                    { recipe, '#', Item.diamond, '|', InfiLibrary.uraniumRod });
        }
        
        if(PHInfiTools.enableRedstoneTools)
        {
        	ModLoader.addRecipe(new ItemStack(woodRedstoneSword), new Object[] 
                    { recipe, '#', InfiLibrary.redstoneCrystal, '|', Item.stick });
        	ModLoader.addRecipe(new ItemStack(stoneRedstoneSword), new Object[] 
                    { recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.stoneRod });
            ModLoader.addRecipe(new ItemStack(ironRedstoneSword), new Object[] 
                    { recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.ironRod });
            ModLoader.addRecipe(new ItemStack(redstoneRedstoneSword), new Object[] 
                    { recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.redstoneRod });
            ModLoader.addRecipe(new ItemStack(obsidianRedstoneSword), new Object[] 
                    { recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.obsidianRod });
            ModLoader.addRecipe(new ItemStack(sandstoneRedstoneSword), new Object[] 
                    { recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.sandstoneRod });
            ModLoader.addRecipe(new ItemStack(boneRedstoneSword), new Object[] 
                    { recipe, '#', InfiLibrary.redstoneCrystal, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneRedstoneSword), new Object[] 
                    { recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.boneRod });
            ModLoader.addRecipe(new ItemStack(paperRedstoneSword), new Object[] 
                    { recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.paperRod });
            ModLoader.addRecipe(new ItemStack(mossyRedstoneSword), new Object[] 
                    { recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.mossyRod });
            ModLoader.addRecipe(new ItemStack(netherrackRedstoneSword), new Object[] 
                    { recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.netherrackRod });
            ModLoader.addRecipe(new ItemStack(glowstoneRedstoneSword), new Object[] 
                    { recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.glowstoneRod });
            ModLoader.addRecipe(new ItemStack(iceRedstoneSword), new Object[] 
                    { recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.iceRod });
            ModLoader.addRecipe(new ItemStack(lavaRedstoneSword), new Object[] 
                    { recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.lavaRod });
            ModLoader.addRecipe(new ItemStack(slimeRedstoneSword), new Object[] 
                    { recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.slimeRod });
            ModLoader.addRecipe(new ItemStack(cactusRedstoneSword), new Object[] 
                    { recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.cactusRod });
            ModLoader.addRecipe(new ItemStack(flintRedstoneSword), new Object[] 
                    { recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.flintRod });
            ModLoader.addRecipe(new ItemStack(copperRedstoneSword), new Object[] 
                    { recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.copperRod });
            ModLoader.addRecipe(new ItemStack(bronzeRedstoneSword), new Object[] 
                    { recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.bronzeRod });
            ModLoader.addRecipe(new ItemStack(workedRedstoneSword), new Object[] 
                    { recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.workedIronRod });
            ModLoader.addRecipe(new ItemStack(uraniumRedstoneSword), new Object[] 
                    { recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.uraniumRod });
        }
        
        if(PHInfiTools.enableObsidianTools)
        {
        	ModLoader.addRecipe(new ItemStack(woodObsidianSword), new Object[] 
                    { recipe, '#', Block.obsidian, '|', Item.stick });
        	ModLoader.addRecipe(new ItemStack(stoneObsidianSword), new Object[] 
                    { recipe, '#', Block.obsidian, '|', InfiLibrary.stoneRod });
            ModLoader.addRecipe(new ItemStack(redstoneObsidianSword), new Object[] 
                    { recipe, '#', Block.obsidian, '|', InfiLibrary.redstoneRod });
            ModLoader.addRecipe(new ItemStack(obsidianObsidianSword), new Object[] 
                    { recipe, '#', Block.obsidian, '|', InfiLibrary.obsidianRod });
            ModLoader.addRecipe(new ItemStack(boneObsidianSword), new Object[] 
                    { recipe, '#', Block.obsidian, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneObsidianSword), new Object[] 
                    { recipe, '#', Block.obsidian, '|', InfiLibrary.boneRod });
            ModLoader.addRecipe(new ItemStack(netherrackObsidianSword), new Object[] 
                    { recipe, '#', Block.obsidian, '|', InfiLibrary.netherrackRod });
            ModLoader.addRecipe(new ItemStack(glowstoneObsidianSword), new Object[] 
                    { recipe, '#', Block.obsidian, '|', InfiLibrary.glowstoneRod });
            ModLoader.addRecipe(new ItemStack(iceObsidianSword), new Object[] 
                    { recipe, '#', Block.obsidian, '|', InfiLibrary.iceRod });
            ModLoader.addRecipe(new ItemStack(lavaObsidianSword), new Object[] 
                    { recipe, '#', Block.obsidian, '|', InfiLibrary.lavaRod });
            ModLoader.addRecipe(new ItemStack(cactusObsidianSword), new Object[] 
                    { recipe, '#', Block.obsidian, '|', InfiLibrary.cactusRod });
        }
        
        if(PHInfiTools.enableSandstoneTools)
        {
            ModLoader.addRecipe(new ItemStack(woodSandstoneSword), new Object[] 
                    { recipe, '#', Block.sandStone, '|', Item.stick });
            ModLoader.addRecipe(new ItemStack(sandstoneSandstoneSword), new Object[] 
                    { recipe, '#', Block.sandStone, '|', InfiLibrary.sandstoneRod });
            ModLoader.addRecipe(new ItemStack(boneSandstoneSword), new Object[] 
                    { recipe, '#', Block.sandStone, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneSandstoneSword), new Object[] 
                    { recipe, '#', Block.sandStone, '|', InfiLibrary.boneRod });      
            ModLoader.addRecipe(new ItemStack(netherrackSandstoneSword), new Object[] 
                    { recipe, '#', Block.sandStone, '|', InfiLibrary.netherrackRod });
            ModLoader.addRecipe(new ItemStack(iceSandstoneSword), new Object[] 
                    { recipe, '#', Block.sandStone, '|', InfiLibrary.iceRod });
            ModLoader.addRecipe(new ItemStack(slimeSandstoneSword), new Object[] 
                    { recipe, '#', Block.sandStone, '|', InfiLibrary.slimeRod });
            ModLoader.addRecipe(new ItemStack(cactusSandstoneSword), new Object[] 
                    { recipe, '#', Block.sandStone, '|', InfiLibrary.cactusRod });
            ModLoader.addRecipe(new ItemStack(flintSandstoneSword), new Object[] 
                    { recipe, '#', Block.sandStone, '|', InfiLibrary.flintRod });
        }
        
        if(PHInfiTools.enableBoneTools)
        {
            ModLoader.addRecipe(new ItemStack(woodBoneSword), new Object[] 
                    { recipe, '#', Item.bone, '|', Item.stick });
            ModLoader.addRecipe(new ItemStack(stoneBoneSword), new Object[] 
                    { recipe, '#', Item.bone, '|', InfiLibrary.stoneRod });
            ModLoader.addRecipe(new ItemStack(sandstoneBoneSword), new Object[] 
                    { recipe, '#', Item.bone, '|', InfiLibrary.sandstoneRod });
            ModLoader.addRecipe(new ItemStack(boneBoneSword), new Object[] 
                    { recipe, '#', Item.bone, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneBoneSword), new Object[] 
                    { recipe, '#', Item.bone, '|', InfiLibrary.boneRod });
            ModLoader.addRecipe(new ItemStack(paperBoneSword), new Object[] 
                    { recipe, '#', Item.bone, '|', InfiLibrary.paperRod });
            ModLoader.addRecipe(new ItemStack(netherrackBoneSword), new Object[] 
                    { recipe, '#', Item.bone, '|', InfiLibrary.netherrackRod });
            ModLoader.addRecipe(new ItemStack(iceBoneSword), new Object[] 
                    { recipe, '#', Item.bone, '|', InfiLibrary.iceRod });
            ModLoader.addRecipe(new ItemStack(cactusBoneSword), new Object[] 
                    { recipe, '#', Item.bone, '|', InfiLibrary.cactusRod });
            ModLoader.addRecipe(new ItemStack(flintBoneSword), new Object[] 
                    { recipe, '#', Item.bone, '|', InfiLibrary.flintRod });
        }
        
        if(PHInfiTools.enablePaperTools)
        {
            ModLoader.addRecipe(new ItemStack(woodPaperSword), new Object[] 
                    { recipe, '#', InfiLibrary.paperStack, '|', Item.stick });
            ModLoader.addRecipe(new ItemStack(bonePaperSword), new Object[] 
                    { recipe, '#', InfiLibrary.paperStack, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(bonePaperSword), new Object[] 
                    { recipe, '#', InfiLibrary.paperStack, '|', InfiLibrary.boneRod });
            ModLoader.addRecipe(new ItemStack(paperPaperSword), new Object[] 
                    { recipe, '#', InfiLibrary.paperStack, '|', InfiLibrary.paperRod });
            ModLoader.addRecipe(new ItemStack(slimePaperSword), new Object[] 
                    { recipe, '#', InfiLibrary.paperStack, '|', InfiLibrary.slimeRod });
            ModLoader.addRecipe(new ItemStack(cactusPaperSword), new Object[] 
                    { recipe, '#', InfiLibrary.paperStack, '|', InfiLibrary.cactusRod });
        }
        
        if(PHInfiTools.enableMossyTools)
        {
        	ModLoader.addRecipe(new ItemStack(woodMossySword), new Object[] 
                    { recipe, '#', InfiLibrary.mossyStone, '|', Item.stick });
        	ModLoader.addRecipe(new ItemStack(stoneMossySword), new Object[] 
                    { recipe, '#', InfiLibrary.mossyStone, '|', InfiLibrary.stoneRod });
            ModLoader.addRecipe(new ItemStack(diamondMossySword), new Object[] 
                    { recipe, '#', InfiLibrary.mossyStone, '|', InfiLibrary.diamondRod });
            ModLoader.addRecipe(new ItemStack(redstoneMossySword), new Object[] 
                    { recipe, '#', InfiLibrary.mossyStone, '|', InfiLibrary.redstoneRod });
            ModLoader.addRecipe(new ItemStack(boneMossySword), new Object[] 
                    { recipe, '#', InfiLibrary.mossyStone, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneMossySword), new Object[] 
                    { recipe, '#', InfiLibrary.mossyStone, '|', InfiLibrary.boneRod });
            ModLoader.addRecipe(new ItemStack(mossyMossySword), new Object[] 
                    { recipe, '#', InfiLibrary.mossyStone, '|', InfiLibrary.mossyRod });
            ModLoader.addRecipe(new ItemStack(netherrackMossySword), new Object[] 
                    { recipe, '#', InfiLibrary.mossyStone, '|', InfiLibrary.netherrackRod });
            ModLoader.addRecipe(new ItemStack(glowstoneMossySword), new Object[] 
                    { recipe, '#', InfiLibrary.mossyStone, '|', InfiLibrary.glowstoneRod });
            ModLoader.addRecipe(new ItemStack(cactusMossySword), new Object[] 
                    { recipe, '#', InfiLibrary.mossyStone, '|', InfiLibrary.cactusRod });
            ModLoader.addRecipe(new ItemStack(blazeMossySword), new Object[] 
                    { recipe, '#', InfiLibrary.mossyStone, '|', Item.blazeRod });
            ModLoader.addRecipe(new ItemStack(manyullynMossySword), new Object[] 
                    { recipe, '#', InfiLibrary.mossyStone, '|', InfiLibrary.manyullynRod });
            ModLoader.addRecipe(new ItemStack(uraniumMossySword), new Object[] 
                    { recipe, '#', InfiLibrary.mossyStone, '|', InfiLibrary.uraniumRod });
        }
        
        if(PHInfiTools.enableNetherrackTools)
        {
        	ModLoader.addRecipe(new ItemStack(woodNetherrackSword), new Object[] 
                    { recipe, '#', Block.netherrack, '|', Item.stick });
        	ModLoader.addRecipe(new ItemStack(stoneNetherrackSword), new Object[] 
                    { recipe, '#', Block.netherrack, '|', InfiLibrary.stoneRod });
            ModLoader.addRecipe(new ItemStack(sandstoneNetherrackSword), new Object[] 
                    { recipe, '#', Block.netherrack, '|', InfiLibrary.sandstoneRod });
            ModLoader.addRecipe(new ItemStack(boneNetherrackSword), new Object[] 
                    { recipe, '#', Block.netherrack, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneNetherrackSword), new Object[] 
                    { recipe, '#', Block.netherrack, '|', InfiLibrary.boneRod });
            ModLoader.addRecipe(new ItemStack(paperNetherrackSword), new Object[] 
                    { recipe, '#', Block.netherrack, '|', InfiLibrary.paperRod });
            ModLoader.addRecipe(new ItemStack(mossyNetherrackSword), new Object[] 
                    { recipe, '#', Block.netherrack, '|', InfiLibrary.mossyRod });
            ModLoader.addRecipe(new ItemStack(netherrackNetherrackSword), new Object[] 
                    { recipe, '#', Block.netherrack, '|', InfiLibrary.netherrackRod });
            ModLoader.addRecipe(new ItemStack(iceNetherrackSword), new Object[] 
                    { recipe, '#', Block.netherrack, '|', InfiLibrary.iceRod });
            ModLoader.addRecipe(new ItemStack(slimeNetherrackSword), new Object[] 
                    { recipe, '#', Block.netherrack, '|', InfiLibrary.slimeRod });
            ModLoader.addRecipe(new ItemStack(cactusNetherrackSword), new Object[] 
                    { recipe, '#', Block.netherrack, '|', InfiLibrary.cactusRod });
            ModLoader.addRecipe(new ItemStack(flintNetherrackSword), new Object[] 
                    { recipe, '#', Block.netherrack, '|', InfiLibrary.flintRod });
            ModLoader.addRecipe(new ItemStack(copperNetherrackSword), new Object[] 
                    { recipe, '#', Block.netherrack, '|', InfiLibrary.copperRod });
            ModLoader.addRecipe(new ItemStack(bronzeNetherrackSword), new Object[] 
                    { recipe, '#', Block.netherrack, '|', InfiLibrary.bronzeRod });
        }
        
        if(PHInfiTools.enableGlowstoneTools)
        {
        	ModLoader.addRecipe(new ItemStack(woodGlowstoneSword), new Object[] 
                    { recipe, '#', InfiLibrary.glowstoneCrystal, '|', Item.stick });
        	ModLoader.addRecipe(new ItemStack(redstoneGlowstoneSword), new Object[] 
                    { recipe, '#', InfiLibrary.glowstoneCrystal, '|', InfiLibrary.redstoneRod });
        	ModLoader.addRecipe(new ItemStack(obsidianGlowstoneSword), new Object[] 
                    { recipe, '#', InfiLibrary.glowstoneCrystal, '|', InfiLibrary.obsidianRod });
            ModLoader.addRecipe(new ItemStack(boneGlowstoneSword), new Object[] 
                    { recipe, '#', InfiLibrary.glowstoneCrystal, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneGlowstoneSword), new Object[] 
                    { recipe, '#', InfiLibrary.glowstoneCrystal, '|', InfiLibrary.boneRod });
            ModLoader.addRecipe(new ItemStack(netherrackGlowstoneSword), new Object[] 
                    { recipe, '#', InfiLibrary.glowstoneCrystal, '|', InfiLibrary.netherrackRod });
            ModLoader.addRecipe(new ItemStack(glowstoneGlowstoneSword), new Object[] 
                    { recipe, '#', InfiLibrary.glowstoneCrystal, '|', InfiLibrary.glowstoneRod });
            ModLoader.addRecipe(new ItemStack(iceGlowstoneSword), new Object[] 
                    { recipe, '#', InfiLibrary.glowstoneCrystal, '|', InfiLibrary.iceRod });
            ModLoader.addRecipe(new ItemStack(slimeGlowstoneSword), new Object[] 
                    { recipe, '#', InfiLibrary.glowstoneCrystal, '|', InfiLibrary.slimeRod });
            ModLoader.addRecipe(new ItemStack(cactusGlowstoneSword), new Object[] 
                    { recipe, '#', InfiLibrary.glowstoneCrystal, '|', InfiLibrary.cactusRod });
        }
        
        if(PHInfiTools.enableIceTools)
        {
            ModLoader.addRecipe(new ItemStack(woodIceSword), new Object[] 
                    { recipe, '#', Block.ice, '|', Item.stick });
            ModLoader.addRecipe(new ItemStack(boneIceSword), new Object[] 
                    { recipe, '#', Block.ice, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneIceSword), new Object[] 
                    { recipe, '#', Block.ice, '|', InfiLibrary.boneRod });
            ModLoader.addRecipe(new ItemStack(paperIceSword), new Object[] 
                    { recipe, '#', Block.ice, '|', InfiLibrary.paperRod });
            ModLoader.addRecipe(new ItemStack(iceIceSword), new Object[] 
                    { recipe, '#', Block.ice, '|', InfiLibrary.iceRod });
            ModLoader.addRecipe(new ItemStack(slimeIceSword), new Object[] 
                    { recipe, '#', Block.ice, '|', InfiLibrary.slimeRod });
            ModLoader.addRecipe(new ItemStack(cactusIceSword), new Object[] 
                    { recipe, '#', Block.ice, '|', InfiLibrary.cactusRod });
        }
        
        if(PHInfiTools.enableLavaTools)
        {
            ModLoader.addRecipe(new ItemStack(diamondLavaSword), new Object[] 
                    { recipe, '#', InfiLibrary.lavaCrystal, '|', InfiLibrary.diamondRod });
            ModLoader.addRecipe(new ItemStack(obsidianLavaSword), new Object[] 
                    { recipe, '#', InfiLibrary.lavaCrystal, '|', InfiLibrary.obsidianRod });
            ModLoader.addRecipe(new ItemStack(netherrackLavaSword), new Object[] 
                    { recipe, '#', InfiLibrary.lavaCrystal, '|', InfiLibrary.netherrackRod });
            ModLoader.addRecipe(new ItemStack(lavaLavaSword), new Object[] 
                    { recipe, '#', InfiLibrary.lavaCrystal, '|', InfiLibrary.lavaRod });
            ModLoader.addRecipe(new ItemStack(flintLavaSword), new Object[] 
                    { recipe, '#', InfiLibrary.lavaCrystal, '|', InfiLibrary.flintRod });
            ModLoader.addRecipe(new ItemStack(blazeLavaSword), new Object[] 
                    { recipe, '#', InfiLibrary.lavaCrystal, '|', Item.blazeRod });
            ModLoader.addRecipe(new ItemStack(manyullynLavaSword), new Object[] 
                    { recipe, '#', InfiLibrary.lavaCrystal, '|', InfiLibrary.manyullynRod });
            ModLoader.addRecipe(new ItemStack(uraniumLavaSword), new Object[] 
                    { recipe, '#', InfiLibrary.lavaCrystal, '|', InfiLibrary.uraniumRod });
        }
        
        if(PHInfiTools.enableSlimeTools)
        {
            ModLoader.addRecipe(new ItemStack(woodSlimeSword), new Object[] 
                    { recipe, '#', InfiLibrary.slimeCrystal, '|', Item.stick });
            ModLoader.addRecipe(new ItemStack(sandstoneSlimeSword), new Object[] 
                    { recipe, '#', InfiLibrary.slimeCrystal, '|', InfiLibrary.sandstoneRod });
            ModLoader.addRecipe(new ItemStack(boneSlimeSword), new Object[] 
                    { recipe, '#', InfiLibrary.slimeCrystal, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneSlimeSword), new Object[] 
                    { recipe, '#', InfiLibrary.slimeCrystal, '|', InfiLibrary.boneRod });
            ModLoader.addRecipe(new ItemStack(paperSlimeSword), new Object[] 
                    { recipe, '#', InfiLibrary.slimeCrystal, '|', InfiLibrary.paperRod });
            ModLoader.addRecipe(new ItemStack(slimeSlimeSword), new Object[] 
                    { recipe, '#', InfiLibrary.slimeCrystal, '|', InfiLibrary.slimeRod });
            ModLoader.addRecipe(new ItemStack(cactusSlimeSword), new Object[] 
                    { recipe, '#', InfiLibrary.slimeCrystal, '|', InfiLibrary.cactusRod });
        }
        
        if(PHInfiTools.enableCactusTools)
        {
            ModLoader.addRecipe(new ItemStack(woodCactusSword), new Object[] 
                    { recipe, '#', Block.cactus, '|', Item.stick });
            ModLoader.addRecipe(new ItemStack(sandstoneCactusSword), new Object[] 
                    { recipe, '#', Block.cactus, '|', InfiLibrary.sandstoneRod });
            ModLoader.addRecipe(new ItemStack(boneCactusSword), new Object[] 
                    { recipe, '#', Block.cactus, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneCactusSword), new Object[] 
                    { recipe, '#', Block.cactus, '|', InfiLibrary.boneRod });
            ModLoader.addRecipe(new ItemStack(netherrackCactusSword), new Object[] 
                    { recipe, '#', Block.cactus, '|', InfiLibrary.netherrackRod });
            ModLoader.addRecipe(new ItemStack(iceCactusSword), new Object[] 
                    { recipe, '#', Block.cactus, '|', InfiLibrary.iceRod });
            ModLoader.addRecipe(new ItemStack(slimeCactusSword), new Object[] 
                    { recipe, '#', Block.cactus, '|', InfiLibrary.slimeRod });
            ModLoader.addRecipe(new ItemStack(cactusCactusSword), new Object[] 
                    { recipe, '#', Block.cactus, '|', InfiLibrary.cactusRod });
        }
        
        if(PHInfiTools.enableFlintTools)
        {
        	ModLoader.addRecipe(new ItemStack(woodFlintSword), new Object[] 
                    { recipe, '#', Item.flint, '|', Item.stick });
        	ModLoader.addRecipe(new ItemStack(stoneFlintSword), new Object[] 
                    { recipe, '#', Item.flint, '|', InfiLibrary.stoneRod });
            ModLoader.addRecipe(new ItemStack(sandstoneFlintSword), new Object[] 
                    { recipe, '#', Item.flint, '|', InfiLibrary.sandstoneRod });
            ModLoader.addRecipe(new ItemStack(boneFlintSword), new Object[] 
                    { recipe, '#', Item.flint, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneFlintSword), new Object[] 
                    { recipe, '#', Item.flint, '|', InfiLibrary.boneRod });
            ModLoader.addRecipe(new ItemStack(netherrackFlintSword), new Object[] 
                    { recipe, '#', Item.flint, '|', InfiLibrary.netherrackRod });
            ModLoader.addRecipe(new ItemStack(slimeFlintSword), new Object[] 
                    { recipe, '#', Item.flint, '|', InfiLibrary.slimeRod });
            ModLoader.addRecipe(new ItemStack(cactusFlintSword), new Object[] 
                    { recipe, '#', Item.flint, '|', InfiLibrary.cactusRod });
            ModLoader.addRecipe(new ItemStack(flintFlintSword), new Object[] 
                    { recipe, '#', Item.flint, '|', InfiLibrary.flintRod });
            ModLoader.addRecipe(new ItemStack(copperFlintSword), new Object[] 
                    { recipe, '#', Item.flint, '|', InfiLibrary.copperRod });
            ModLoader.addRecipe(new ItemStack(bronzeFlintSword), new Object[] 
                    { recipe, '#', Item.flint, '|', InfiLibrary.bronzeRod });
        }
        
        if(PHInfiTools.enableBlazeTools)
        {
            ModLoader.addRecipe(new ItemStack(diamondBlazeSword), new Object[] 
                    { recipe, '#', InfiLibrary.blazeCrystal, '|', InfiLibrary.diamondRod });
            ModLoader.addRecipe(new ItemStack(obsidianBlazeSword), new Object[] 
                    { recipe, '#', InfiLibrary.blazeCrystal, '|', InfiLibrary.obsidianRod });
            ModLoader.addRecipe(new ItemStack(netherrackBlazeSword), new Object[] 
                    { recipe, '#', InfiLibrary.blazeCrystal, '|', InfiLibrary.netherrackRod });
            ModLoader.addRecipe(new ItemStack(lavaBlazeSword), new Object[] 
                    { recipe, '#', InfiLibrary.blazeCrystal, '|', InfiLibrary.lavaRod });
            ModLoader.addRecipe(new ItemStack(flintBlazeSword), new Object[] 
                    { recipe, '#', InfiLibrary.blazeCrystal, '|', InfiLibrary.flintRod });
            ModLoader.addRecipe(new ItemStack(blazeBlazeSword), new Object[] 
                    { recipe, '#', InfiLibrary.blazeCrystal, '|', Item.blazeRod });
            ModLoader.addRecipe(new ItemStack(manyullynBlazeSword), new Object[] 
                    { recipe, '#', InfiLibrary.blazeCrystal, '|', InfiLibrary.manyullynRod });
            ModLoader.addRecipe(new ItemStack(uraniumBlazeSword), new Object[] 
                    { recipe, '#', InfiLibrary.blazeCrystal, '|', InfiLibrary.uraniumRod });
        }
    }
    
    public static void addStoneTools(ItemStack stack)
    {
    	ModLoader.addRecipe(new ItemStack(woodStoneSword), new Object[] 
                { recipe, '#', stack, '|', Item.stick });
    	ModLoader.addRecipe(new ItemStack(stoneStoneSword), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.stoneRod });
        ModLoader.addRecipe(new ItemStack(sandstoneStoneSword), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.sandstoneRod });
        ModLoader.addRecipe(new ItemStack(boneStoneSword), new Object[] 
                { recipe, '#', stack, '|', Item.bone });
        ModLoader.addRecipe(new ItemStack(boneStoneSword), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.boneRod });
        ModLoader.addRecipe(new ItemStack(netherrackStoneSword), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.netherrackRod });
        ModLoader.addRecipe(new ItemStack(iceStoneSword), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.iceRod });
        ModLoader.addRecipe(new ItemStack(slimeStoneSword), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.slimeRod });
        ModLoader.addRecipe(new ItemStack(cactusStoneSword), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.cactusRod });
        ModLoader.addRecipe(new ItemStack(flintStoneSword), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.flintRod });
    }
    
    public static void addCopperTools(ItemStack stack)
    {
    	ModLoader.addRecipe(new ItemStack(woodCopperSword), new Object[] 
                { recipe, '#', stack, '|', Item.stick });
        ModLoader.addRecipe(new ItemStack(stoneCopperSword), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.stoneRod });
        ModLoader.addRecipe(new ItemStack(boneCopperSword), new Object[] 
                { recipe, '#', stack, '|', Item.bone });
        ModLoader.addRecipe(new ItemStack(boneCopperSword), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.boneRod });
        ModLoader.addRecipe(new ItemStack(netherrackCopperSword), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.netherrackRod });
        ModLoader.addRecipe(new ItemStack(slimeCopperSword), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.slimeRod });
        ModLoader.addRecipe(new ItemStack(cactusCopperSword), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.cactusRod });
        ModLoader.addRecipe(new ItemStack(flintCopperSword), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.flintRod });
        ModLoader.addRecipe(new ItemStack(copperCopperSword), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.copperRod });
    }
    
    public static void addBronzeTools(ItemStack stack)
    {
    	ModLoader.addRecipe(new ItemStack(woodBronzeSword), new Object[] 
                { recipe, '#', stack, '|', Item.stick });
        ModLoader.addRecipe(new ItemStack(stoneBronzeSword), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.stoneRod });
        ModLoader.addRecipe(new ItemStack(boneBronzeSword), new Object[] 
                { recipe, '#', stack, '|', Item.bone });
        ModLoader.addRecipe(new ItemStack(boneBronzeSword), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.boneRod });
        ModLoader.addRecipe(new ItemStack(netherrackBronzeSword), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.netherrackRod });
        ModLoader.addRecipe(new ItemStack(slimeBronzeSword), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.slimeRod });
        ModLoader.addRecipe(new ItemStack(cactusBronzeSword), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.cactusRod });
        ModLoader.addRecipe(new ItemStack(flintBronzeSword), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.flintRod });
        ModLoader.addRecipe(new ItemStack(copperBronzeSword), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.copperRod });
        ModLoader.addRecipe(new ItemStack(bronzeBronzeSword), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.bronzeRod });
    }
    
    public static void addWorkedIronTools(ItemStack stack)
    {
    	ModLoader.addRecipe(new ItemStack(woodWorkedIronSword), new Object[] 
                { recipe, '#', stack, '|', Item.stick });
        ModLoader.addRecipe(new ItemStack(stoneWorkedIronSword), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.stoneRod });
        ModLoader.addRecipe(new ItemStack(ironWorkedIronSword), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.ironRod });
        ModLoader.addRecipe(new ItemStack(diamondWorkedIronSword), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.diamondRod });
        ModLoader.addRecipe(new ItemStack(redstoneWorkedIronSword), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.redstoneRod });
        ModLoader.addRecipe(new ItemStack(obsidianWorkedIronSword), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.obsidianRod });
        ModLoader.addRecipe(new ItemStack(boneWorkedIronSword), new Object[] 
                { recipe, '#', stack, '|', Item.bone });
        ModLoader.addRecipe(new ItemStack(boneWorkedIronSword), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.boneRod });
        ModLoader.addRecipe(new ItemStack(netherrackWorkedIronSword), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.netherrackRod });
        ModLoader.addRecipe(new ItemStack(glowstoneWorkedIronSword), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.glowstoneRod });
        ModLoader.addRecipe(new ItemStack(iceWorkedIronSword), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.iceRod });
        ModLoader.addRecipe(new ItemStack(slimeWorkedIronSword), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.slimeRod });
        ModLoader.addRecipe(new ItemStack(cactusWorkedIronSword), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.cactusRod });
        ModLoader.addRecipe(new ItemStack(blazeWorkedIronSword), new Object[] 
                { recipe, '#', stack, '|', Item.blazeRod });
        ModLoader.addRecipe(new ItemStack(copperWorkedIronSword), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.copperRod });
        ModLoader.addRecipe(new ItemStack(bronzeWorkedIronSword), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.bronzeRod });
        ModLoader.addRecipe(new ItemStack(workedWorkedIronSword), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.workedIronRod });
        ModLoader.addRecipe(new ItemStack(steelWorkedIronSword), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.steelRod });
        ModLoader.addRecipe(new ItemStack(uraniumWorkedIronSword), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.uraniumRod });
    }
    
    public static void addSteelTools(ItemStack stack)
    {
    	ModLoader.addRecipe(new ItemStack(woodSteelSword), new Object[] 
                { recipe, '#', stack, '|', Item.stick });
        ModLoader.addRecipe(new ItemStack(stoneSteelSword), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.stoneRod });
        ModLoader.addRecipe(new ItemStack(ironSteelSword), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.ironRod });
        ModLoader.addRecipe(new ItemStack(diamondSteelSword), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.diamondRod });
        ModLoader.addRecipe(new ItemStack(redstoneSteelSword), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.redstoneRod });
        ModLoader.addRecipe(new ItemStack(obsidianSteelSword), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.obsidianRod });
        ModLoader.addRecipe(new ItemStack(boneSteelSword), new Object[] 
                { recipe, '#', stack, '|', Item.bone });
        ModLoader.addRecipe(new ItemStack(boneSteelSword), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.boneRod });
        ModLoader.addRecipe(new ItemStack(netherrackSteelSword), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.netherrackRod });
        ModLoader.addRecipe(new ItemStack(glowstoneSteelSword), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.glowstoneRod });
        ModLoader.addRecipe(new ItemStack(iceSteelSword), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.iceRod });
        ModLoader.addRecipe(new ItemStack(slimeSteelSword), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.slimeRod });
        ModLoader.addRecipe(new ItemStack(cactusSteelSword), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.cactusRod });
        ModLoader.addRecipe(new ItemStack(blazeSteelSword), new Object[] 
                { recipe, '#', stack, '|', Item.blazeRod });
        ModLoader.addRecipe(new ItemStack(copperSteelSword), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.copperRod });
        ModLoader.addRecipe(new ItemStack(bronzeSteelSword), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.bronzeRod });
        ModLoader.addRecipe(new ItemStack(workedSteelSword), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.workedIronRod });
        ModLoader.addRecipe(new ItemStack(steelSteelSword), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.steelRod });
        ModLoader.addRecipe(new ItemStack(cobaltSteelSword), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.cobaltRod });
        ModLoader.addRecipe(new ItemStack(arditeSteelSword), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.arditeRod });
        ModLoader.addRecipe(new ItemStack(uraniumSteelSword), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.uraniumRod });
    }
    
    public static void addCobaltTools(ItemStack stack)
    {
    	ModLoader.addRecipe(new ItemStack(woodCobaltSword), new Object[] 
                { recipe, '#', stack, '|', Item.stick });
        ModLoader.addRecipe(new ItemStack(stoneCobaltSword), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.stoneRod });
        ModLoader.addRecipe(new ItemStack(ironCobaltSword), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.ironRod });
        ModLoader.addRecipe(new ItemStack(diamondCobaltSword), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.diamondRod });
        ModLoader.addRecipe(new ItemStack(redstoneCobaltSword), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.redstoneRod });
        ModLoader.addRecipe(new ItemStack(obsidianCobaltSword), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.obsidianRod });
        ModLoader.addRecipe(new ItemStack(boneCobaltSword), new Object[] 
                { recipe, '#', stack, '|', Item.bone });
        ModLoader.addRecipe(new ItemStack(boneCobaltSword), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.boneRod });
        ModLoader.addRecipe(new ItemStack(slimeCobaltSword), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.slimeRod });
        ModLoader.addRecipe(new ItemStack(cactusCobaltSword), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.cactusRod });
        ModLoader.addRecipe(new ItemStack(blazeCobaltSword), new Object[] 
                { recipe, '#', stack, '|', Item.blazeRod });
        ModLoader.addRecipe(new ItemStack(copperCobaltSword), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.copperRod });
        ModLoader.addRecipe(new ItemStack(bronzeCobaltSword), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.bronzeRod });
        ModLoader.addRecipe(new ItemStack(workedCobaltSword), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.workedIronRod });
        ModLoader.addRecipe(new ItemStack(steelCobaltSword), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.steelRod });
        ModLoader.addRecipe(new ItemStack(cobaltCobaltSword), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.cobaltRod });
        ModLoader.addRecipe(new ItemStack(arditeCobaltSword), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.arditeRod });
        ModLoader.addRecipe(new ItemStack(manyullynCobaltSword), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.manyullynRod });
        ModLoader.addRecipe(new ItemStack(uraniumCobaltSword), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.uraniumRod });
    }
    
    public static void addArditeTools(ItemStack stack)
    {
    	ModLoader.addRecipe(new ItemStack(woodArditeSword), new Object[] 
                { recipe, '#', stack, '|', Item.stick });
        ModLoader.addRecipe(new ItemStack(stoneArditeSword), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.stoneRod });
        ModLoader.addRecipe(new ItemStack(ironArditeSword), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.ironRod });
        ModLoader.addRecipe(new ItemStack(diamondArditeSword), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.diamondRod });
        ModLoader.addRecipe(new ItemStack(redstoneArditeSword), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.redstoneRod });
        ModLoader.addRecipe(new ItemStack(obsidianArditeSword), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.obsidianRod });
        ModLoader.addRecipe(new ItemStack(boneArditeSword), new Object[] 
                { recipe, '#', stack, '|', Item.bone });
        ModLoader.addRecipe(new ItemStack(boneArditeSword), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.boneRod });
        ModLoader.addRecipe(new ItemStack(slimeArditeSword), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.slimeRod });
        ModLoader.addRecipe(new ItemStack(cactusArditeSword), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.cactusRod });
        ModLoader.addRecipe(new ItemStack(blazeArditeSword), new Object[] 
                { recipe, '#', stack, '|', Item.blazeRod });
        ModLoader.addRecipe(new ItemStack(copperArditeSword), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.copperRod });
        ModLoader.addRecipe(new ItemStack(bronzeArditeSword), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.bronzeRod });
        ModLoader.addRecipe(new ItemStack(workedArditeSword), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.workedIronRod });
        ModLoader.addRecipe(new ItemStack(steelArditeSword), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.steelRod });
        ModLoader.addRecipe(new ItemStack(cobaltArditeSword), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.cobaltRod });
        ModLoader.addRecipe(new ItemStack(arditeArditeSword), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.arditeRod });
        ModLoader.addRecipe(new ItemStack(manyullynArditeSword), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.manyullynRod });
        ModLoader.addRecipe(new ItemStack(uraniumArditeSword), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.uraniumRod });
    }
    
    public static void addManyullynTools(ItemStack stack)
    {
    	ModLoader.addRecipe(new ItemStack(woodManyullynSword), new Object[] 
                { recipe, '#', stack, '|', Item.stick });
        ModLoader.addRecipe(new ItemStack(stoneManyullynSword), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.stoneRod });
        ModLoader.addRecipe(new ItemStack(ironManyullynSword), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.ironRod });
        ModLoader.addRecipe(new ItemStack(diamondManyullynSword), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.diamondRod });
        ModLoader.addRecipe(new ItemStack(redstoneManyullynSword), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.redstoneRod });
        ModLoader.addRecipe(new ItemStack(obsidianManyullynSword), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.obsidianRod });
        ModLoader.addRecipe(new ItemStack(boneManyullynSword), new Object[] 
                { recipe, '#', stack, '|', Item.bone });
        ModLoader.addRecipe(new ItemStack(boneManyullynSword), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.boneRod });
        ModLoader.addRecipe(new ItemStack(slimeManyullynSword), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.slimeRod });
        ModLoader.addRecipe(new ItemStack(cactusManyullynSword), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.cactusRod });
        ModLoader.addRecipe(new ItemStack(blazeManyullynSword), new Object[] 
                { recipe, '#', stack, '|', Item.blazeRod });
        ModLoader.addRecipe(new ItemStack(copperManyullynSword), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.copperRod });
        ModLoader.addRecipe(new ItemStack(bronzeManyullynSword), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.bronzeRod });
        ModLoader.addRecipe(new ItemStack(workedManyullynSword), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.workedIronRod });
        ModLoader.addRecipe(new ItemStack(steelManyullynSword), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.steelRod });
        ModLoader.addRecipe(new ItemStack(cobaltManyullynSword), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.cobaltRod });
        ModLoader.addRecipe(new ItemStack(arditeManyullynSword), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.arditeRod });
        ModLoader.addRecipe(new ItemStack(manyullynManyullynSword), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.manyullynRod });
        ModLoader.addRecipe(new ItemStack(uraniumManyullynSword), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.uraniumRod });
    }
    
    public static void addUraniumTools(ItemStack stack)
    {
        ModLoader.addRecipe(new ItemStack(diamondUraniumSword), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.diamondRod });
        ModLoader.addRecipe(new ItemStack(redstoneUraniumSword), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.redstoneRod });
        ModLoader.addRecipe(new ItemStack(boneUraniumSword), new Object[] 
                { recipe, '#', stack, '|', Item.bone });
        ModLoader.addRecipe(new ItemStack(boneUraniumSword), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.boneRod });
        ModLoader.addRecipe(new ItemStack(netherrackUraniumSword), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.netherrackRod });
        ModLoader.addRecipe(new ItemStack(glowstoneUraniumSword), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.glowstoneRod });
        ModLoader.addRecipe(new ItemStack(lavaUraniumSword), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.lavaRod });
        ModLoader.addRecipe(new ItemStack(blazeUraniumSword), new Object[] 
                { recipe, '#', stack, '|', Item.blazeRod });
        ModLoader.addRecipe(new ItemStack(cobaltUraniumSword), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.cobaltRod });
        ModLoader.addRecipe(new ItemStack(arditeUraniumSword), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.arditeRod });
        ModLoader.addRecipe(new ItemStack(uraniumUraniumSword), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.uraniumRod });
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
