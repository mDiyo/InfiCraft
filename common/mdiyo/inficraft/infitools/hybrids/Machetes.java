package mDiyo.inficraft.infitools.hybrids;
import cpw.mods.fml.common.registry.GameRegistry;
import mDiyo.inficraft.infitools.core.PHInfiTools;
import mDiyo.inficraft.infitools.library.InfiLibrary;
import mDiyo.inficraft.infitools.library.InfiMaterialEnum;
import net.minecraft.src.Block;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;
import net.minecraft.src.ModLoader;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.oredict.ShapedOreRecipe;

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
        if(InfiHybrids.infitoolsPresent)
        {
        	createTools();
            addNames();
        	registerInfiToolsRecipes();
			oreDictionarySupport();
        }
        else
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
    	woodWoodMachete = new InfiToolMachete(PHInfiHybrids.woodMacheteID+0, 
                InfiMaterialEnum.Wood, InfiMaterialEnum.Wood, "woodWoodMachete");
    	woodStoneMachete = new InfiToolMachete(PHInfiHybrids.stoneMacheteID+0, 
                InfiMaterialEnum.Stone, InfiMaterialEnum.Wood, "woodStoneMachete");
    	woodIronMachete = new InfiToolMachete(PHInfiHybrids.ironMacheteID+0, 
                InfiMaterialEnum.Iron, InfiMaterialEnum.Wood, "woodIronMachete");
    	woodDiamondMachete = new InfiToolMachete(PHInfiHybrids.diamondMacheteID+0, 
                InfiMaterialEnum.Diamond, InfiMaterialEnum.Wood, "woodDiamondMachete");
    	
    	MinecraftForge.setToolClass(woodWoodMachete, "Machete", InfiMaterialEnum.Wood.getHarvestLevel());
    	MinecraftForge.setToolClass(woodStoneMachete, "Machete", InfiMaterialEnum.Stone.getHarvestLevel());
    	MinecraftForge.setToolClass(woodIronMachete, "Machete", InfiMaterialEnum.Iron.getHarvestLevel());
    	MinecraftForge.setToolClass(woodDiamondMachete, "Machete", InfiMaterialEnum.Diamond.getHarvestLevel());
    	
    	ModLoader.addName(woodWoodMachete, "Wooden Machete");
    }
    
    private static void registerVanillaRecipes()
    {
    	ModLoader.addRecipe(new ItemStack(woodWoodMachete), new Object[] 
                { recipe, '#', Block.planks, '|', Item.stick, 's', Item.stick });
		ModLoader.addRecipe(new ItemStack(woodStoneMachete), new Object[] 
                { recipe, '#', Block.cobblestone, '|', Item.stick, 's', InfiLibrary.stoneShard });
		ModLoader.addRecipe(new ItemStack(woodIronMachete), new Object[] 
                { recipe, '#', Item.ingotIron, '|', Item.stick, 's', InfiLibrary.ironChunk });
		ModLoader.addRecipe(new ItemStack(woodDiamondMachete), new Object[] 
                { recipe, '#', Item.diamond, '|', Item.stick, 's', InfiLibrary.diamondShard });
    }
    
    private static void createTools()
    {
    	if(PHInfiHybrids.enableWoodTools)
    	{
    		woodWoodMachete = new InfiToolMachete(PHInfiHybrids.woodMacheteID+0, 
                    InfiMaterialEnum.Wood, InfiMaterialEnum.Wood, "woodWoodMachete");
    		sandstoneWoodMachete = new InfiToolMachete(PHInfiHybrids.woodMacheteID+1, 
                    InfiMaterialEnum.Wood, InfiMaterialEnum.Sandstone, "sandstoneWoodMachete");
    		boneWoodMachete = new InfiToolMachete(PHInfiHybrids.woodMacheteID+2, 
                    InfiMaterialEnum.Wood, InfiMaterialEnum.Bone, "boneWoodMachete");
    		paperWoodMachete = new InfiToolMachete(PHInfiHybrids.woodMacheteID+3, 
                    InfiMaterialEnum.Wood, InfiMaterialEnum.Paper, "paperWoodMachete");
    		iceWoodMachete = new InfiToolMachete(PHInfiHybrids.woodMacheteID+4, 
                    InfiMaterialEnum.Wood, InfiMaterialEnum.Ice, "iceWoodMachete");
    		slimeWoodMachete = new InfiToolMachete(PHInfiHybrids.woodMacheteID+5, 
                    InfiMaterialEnum.Wood, InfiMaterialEnum.Slime, "slimeWoodMachete");
    		cactusWoodMachete = new InfiToolMachete(PHInfiHybrids.woodMacheteID+6, 
                    InfiMaterialEnum.Wood, InfiMaterialEnum.Cactus, "cactusWoodMachete");
    		
    		MinecraftForge.setToolClass(woodWoodMachete, "Machete", InfiMaterialEnum.Wood.getHarvestLevel());
    		MinecraftForge.setToolClass(sandstoneWoodMachete, "Machete", InfiMaterialEnum.Wood.getHarvestLevel());
    		MinecraftForge.setToolClass(boneWoodMachete, "Machete", InfiMaterialEnum.Wood.getHarvestLevel());
    		MinecraftForge.setToolClass(paperWoodMachete, "Machete", InfiMaterialEnum.Wood.getHarvestLevel());
    		MinecraftForge.setToolClass(iceWoodMachete, "Machete", InfiMaterialEnum.Wood.getHarvestLevel());
    		MinecraftForge.setToolClass(slimeWoodMachete, "Machete", InfiMaterialEnum.Wood.getHarvestLevel());
    		MinecraftForge.setToolClass(cactusWoodMachete, "Machete", InfiMaterialEnum.Wood.getHarvestLevel());
    	}

        if(PHInfiHybrids.enableStoneTools)
        {
        	woodStoneMachete = new InfiToolMachete(PHInfiHybrids.stoneMacheteID+0, 
                    InfiMaterialEnum.Stone, InfiMaterialEnum.Wood, "woodStoneMachete");
        	stoneStoneMachete = new InfiToolMachete(PHInfiHybrids.stoneMacheteID+1, 
                    InfiMaterialEnum.Stone, InfiMaterialEnum.Stone, "stoneStoneMachete");
        	sandstoneStoneMachete = new InfiToolMachete(PHInfiHybrids.stoneMacheteID+2, 
                    InfiMaterialEnum.Stone, InfiMaterialEnum.Sandstone, "sandstoneStoneMachete");
        	boneStoneMachete = new InfiToolMachete(PHInfiHybrids.stoneMacheteID+3, 
                    InfiMaterialEnum.Stone, InfiMaterialEnum.Bone, "boneStoneMachete");
        	netherrackStoneMachete = new InfiToolMachete(PHInfiHybrids.stoneMacheteID+4, 
                    InfiMaterialEnum.Stone, InfiMaterialEnum.Netherrack, "netherrackStoneMachete");
        	iceStoneMachete = new InfiToolMachete(PHInfiHybrids.stoneMacheteID+5, 
                    InfiMaterialEnum.Stone, InfiMaterialEnum.Ice, "iceStoneMachete");
        	slimeStoneMachete = new InfiToolMachete(PHInfiHybrids.stoneMacheteID+6, 
                    InfiMaterialEnum.Stone, InfiMaterialEnum.Slime, "slimeStoneMachete");
        	cactusStoneMachete = new InfiToolMachete(PHInfiHybrids.stoneMacheteID+7, 
                    InfiMaterialEnum.Stone, InfiMaterialEnum.Cactus, "cactusStoneMachete");
        	flintStoneMachete = new InfiToolMachete(PHInfiHybrids.stoneMacheteID+8, 
                    InfiMaterialEnum.Stone, InfiMaterialEnum.Flint, "flintStoneMachete");
            
            MinecraftForge.setToolClass(woodStoneMachete, "Machete", InfiMaterialEnum.Stone.getHarvestLevel());
            MinecraftForge.setToolClass(stoneStoneMachete, "Machete", InfiMaterialEnum.Stone.getHarvestLevel());
            MinecraftForge.setToolClass(sandstoneStoneMachete, "Machete", InfiMaterialEnum.Stone.getHarvestLevel());
            MinecraftForge.setToolClass(boneStoneMachete, "Machete", InfiMaterialEnum.Stone.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackStoneMachete, "Machete", InfiMaterialEnum.Stone.getHarvestLevel());
            MinecraftForge.setToolClass(iceStoneMachete, "Machete", InfiMaterialEnum.Stone.getHarvestLevel());
            MinecraftForge.setToolClass(slimeStoneMachete, "Machete", InfiMaterialEnum.Stone.getHarvestLevel());
            MinecraftForge.setToolClass(cactusStoneMachete, "Machete", InfiMaterialEnum.Stone.getHarvestLevel());
            MinecraftForge.setToolClass(flintStoneMachete, "Machete", InfiMaterialEnum.Stone.getHarvestLevel());
        }
        
        if(PHInfiHybrids.enableIronTools)
        {
        	woodIronMachete = new InfiToolMachete(PHInfiHybrids.ironMacheteID+0, 
                    InfiMaterialEnum.Iron, InfiMaterialEnum.Wood, "woodIronMachete");
        	stoneIronMachete = new InfiToolMachete(PHInfiHybrids.ironMacheteID+1, 
                    InfiMaterialEnum.Iron, InfiMaterialEnum.Stone, "stoneIronMachete");
        	ironIronMachete = new InfiToolMachete(PHInfiHybrids.ironMacheteID+2, 
                    InfiMaterialEnum.Iron, InfiMaterialEnum.Iron, "ironIronMachete");
        	boneIronMachete = new InfiToolMachete(PHInfiHybrids.ironMacheteID+3, 
                    InfiMaterialEnum.Iron, InfiMaterialEnum.Bone, "boneIronMachete");
        	netherrackIronMachete = new InfiToolMachete(PHInfiHybrids.ironMacheteID+4, 
                    InfiMaterialEnum.Iron, InfiMaterialEnum.Netherrack, "netherrackIronMachete");
        	glowstoneIronMachete = new InfiToolMachete(PHInfiHybrids.ironMacheteID+5, 
                    InfiMaterialEnum.Iron, InfiMaterialEnum.Glowstone, "glowstoneIronMachete");
        	cactusIronMachete = new InfiToolMachete(PHInfiHybrids.ironMacheteID+6, 
                    InfiMaterialEnum.Iron, InfiMaterialEnum.Cactus, "cactusIronMachete");
        	copperIronMachete = new InfiToolMachete(PHInfiHybrids.ironMacheteID+7, 
                    InfiMaterialEnum.Iron, InfiMaterialEnum.Copper, "copperIronMachete");
        	bronzeIronMachete = new InfiToolMachete(PHInfiHybrids.ironMacheteID+8, 
                    InfiMaterialEnum.Iron, InfiMaterialEnum.Bronze, "bronzeIronMachete");
            
            MinecraftForge.setToolClass(woodIronMachete, "Machete", InfiMaterialEnum.Iron.getHarvestLevel());
            MinecraftForge.setToolClass(stoneIronMachete, "Machete", InfiMaterialEnum.Iron.getHarvestLevel());
            MinecraftForge.setToolClass(ironIronMachete, "Machete", InfiMaterialEnum.Iron.getHarvestLevel());
            MinecraftForge.setToolClass(boneIronMachete, "Machete", InfiMaterialEnum.Iron.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackIronMachete, "Machete", InfiMaterialEnum.Iron.getHarvestLevel());
            MinecraftForge.setToolClass(glowstoneIronMachete, "Machete", InfiMaterialEnum.Iron.getHarvestLevel());
            MinecraftForge.setToolClass(cactusIronMachete, "Machete", InfiMaterialEnum.Iron.getHarvestLevel());
            MinecraftForge.setToolClass(copperIronMachete, "Machete", InfiMaterialEnum.Iron.getHarvestLevel());
            MinecraftForge.setToolClass(bronzeIronMachete, "Machete", InfiMaterialEnum.Iron.getHarvestLevel());
        }
        
        if(PHInfiHybrids.enableDiamondTools)
        {
        	woodDiamondMachete = new InfiToolMachete(PHInfiHybrids.diamondMacheteID+0, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Wood, "woodDiamondMachete");
        	stoneDiamondMachete = new InfiToolMachete(PHInfiHybrids.diamondMacheteID+1, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Stone, "stoneDiamondMachete");
        	ironDiamondMachete = new InfiToolMachete(PHInfiHybrids.diamondMacheteID+2, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Iron, "ironDiamondMachete");
        	diamondDiamondMachete = new InfiToolMachete(PHInfiHybrids.diamondMacheteID+3, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Diamond, "diamondDiamondMachete");
        	redstoneDiamondMachete = new InfiToolMachete(PHInfiHybrids.diamondMacheteID+4, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Redstone, "redstoneDiamondMachete");
        	obsidianDiamondMachete = new InfiToolMachete(PHInfiHybrids.diamondMacheteID+5, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Obsidian, "obsidianDiamondMachete");
        	boneDiamondMachete = new InfiToolMachete(PHInfiHybrids.diamondMacheteID+6, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Bone, "boneDiamondMachete");
        	mossyDiamondMachete = new InfiToolMachete(PHInfiHybrids.diamondMacheteID+7, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Mossy, "mossyDiamondMachete");
        	netherrackDiamondMachete = new InfiToolMachete(PHInfiHybrids.diamondMacheteID+8, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Netherrack, "netherrackDiamondMachete");
        	glowstoneDiamondMachete = new InfiToolMachete(PHInfiHybrids.diamondMacheteID+9, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Glowstone, "glowstoneDiamondMachete");
        	lavaDiamondMachete = new InfiToolMachete(PHInfiHybrids.diamondMacheteID+10, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Lava, "lavaDiamondMachete");
        	cactusDiamondMachete = new InfiToolMachete(PHInfiHybrids.diamondMacheteID+11, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Cactus, "cactusDiamondMachete");
        	flintDiamondMachete = new InfiToolMachete(PHInfiHybrids.diamondMacheteID+12, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Flint, "flintDiamondMachete");
        	blazeDiamondMachete = new InfiToolMachete(PHInfiHybrids.diamondMacheteID+13, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Blaze, "blazeDiamondMachete");
            copperDiamondMachete = new InfiToolMachete(PHInfiHybrids.diamondMacheteID+14, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Copper, "copperDiamondMachete");
            bronzeDiamondMachete = new InfiToolMachete(PHInfiHybrids.diamondMacheteID+15, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Bronze, "bronzeDiamondMachete");
            workedDiamondMachete = new InfiToolMachete(PHInfiHybrids.diamondMacheteID+16, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.WorkedIron, "workedDiamondMachete");
            steelDiamondMachete = new InfiToolMachete(PHInfiHybrids.diamondMacheteID+17, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Steel, "steelDiamondMachete");
            cobaltDiamondMachete = new InfiToolMachete(PHInfiHybrids.diamondMacheteID+18, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Cobalt, "cobaltDiamondMachete");
            arditeDiamondMachete = new InfiToolMachete(PHInfiHybrids.diamondMacheteID+19, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Ardite, "arditeDiamondMachete");
            manyullynDiamondMachete = new InfiToolMachete(PHInfiHybrids.diamondMacheteID+20, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Manyullyn, "manyullynDiamondMachete");
            uraniumDiamondMachete = new InfiToolMachete(PHInfiHybrids.diamondMacheteID+21, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Uranium, "uraniumDiamondMachete");
            
            MinecraftForge.setToolClass(woodDiamondMachete, "Machete", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(stoneDiamondMachete, "Machete", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(ironDiamondMachete, "Machete", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(diamondDiamondMachete, "Machete", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(redstoneDiamondMachete, "Machete", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(obsidianDiamondMachete, "Machete", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(boneDiamondMachete, "Machete", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(mossyDiamondMachete, "Machete", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackDiamondMachete, "Machete", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(glowstoneDiamondMachete, "Machete", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(lavaDiamondMachete, "Machete", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(cactusDiamondMachete, "Machete", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(flintDiamondMachete, "Machete", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(blazeDiamondMachete, "Machete", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(copperDiamondMachete, "Machete", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(bronzeDiamondMachete, "Machete", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(workedDiamondMachete, "Machete", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(steelDiamondMachete, "Machete", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(cobaltDiamondMachete, "Machete", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(arditeDiamondMachete, "Machete", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(manyullynDiamondMachete, "Machete", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(uraniumDiamondMachete, "Machete", InfiMaterialEnum.Diamond.getHarvestLevel());
        }
        
        if(PHInfiHybrids.enableRedstoneTools)
        {
        	woodRedstoneMachete = new InfiToolMachete(PHInfiHybrids.redstoneMacheteID+0, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Wood, "woodRedstoneMachete");
        	stoneRedstoneMachete = new InfiToolMachete(PHInfiHybrids.redstoneMacheteID+1, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Stone, "stoneRedstoneMachete");
        	ironRedstoneMachete = new InfiToolMachete(PHInfiHybrids.redstoneMacheteID+2, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Iron, "ironRedstoneMachete");
        	redstoneRedstoneMachete = new InfiToolMachete(PHInfiHybrids.redstoneMacheteID+3, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Redstone, "redstoneRedstoneMachete");
        	obsidianRedstoneMachete = new InfiToolMachete(PHInfiHybrids.redstoneMacheteID+4, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Obsidian, "obsidianRedstoneMachete");
        	sandstoneRedstoneMachete = new InfiToolMachete(PHInfiHybrids.redstoneMacheteID+5, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Sandstone, "sandstoneRedstoneMachete");
        	boneRedstoneMachete = new InfiToolMachete(PHInfiHybrids.redstoneMacheteID+6, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Bone, "boneRedstoneMachete");
        	paperRedstoneMachete = new InfiToolMachete(PHInfiHybrids.redstoneMacheteID+7, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Paper, "paperRedstoneMachete");
        	mossyRedstoneMachete = new InfiToolMachete(PHInfiHybrids.redstoneMacheteID+8, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Mossy, "mossyRedstoneMachete");
        	netherrackRedstoneMachete = new InfiToolMachete(PHInfiHybrids.redstoneMacheteID+9, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Netherrack, "netherrackRedstoneMachete");
        	glowstoneRedstoneMachete = new InfiToolMachete(PHInfiHybrids.redstoneMacheteID+10, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Glowstone, "glowstoneRedstoneMachete");
        	iceRedstoneMachete = new InfiToolMachete(PHInfiHybrids.redstoneMacheteID+11, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Ice, "iceRedstoneMachete");
        	lavaRedstoneMachete = new InfiToolMachete(PHInfiHybrids.redstoneMacheteID+12,
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Lava, "lavaRedstoneMachete");
        	slimeRedstoneMachete = new InfiToolMachete(PHInfiHybrids.redstoneMacheteID+13,
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Slime, "slimeRedstoneMachete");
        	cactusRedstoneMachete = new InfiToolMachete(PHInfiHybrids.redstoneMacheteID+14,
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Cactus, "cactusRedstoneMachete");
        	flintRedstoneMachete = new InfiToolMachete(PHInfiHybrids.redstoneMacheteID+15,
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Flint, "flintRedstoneMachete");
        	copperRedstoneMachete = new InfiToolMachete(PHInfiHybrids.redstoneMacheteID+16,
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Copper, "copperRedstoneMachete");
        	bronzeRedstoneMachete = new InfiToolMachete(PHInfiHybrids.redstoneMacheteID+17,
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Bronze, "bronzeRedstoneMachete");
        	workedRedstoneMachete = new InfiToolMachete(PHInfiHybrids.redstoneMacheteID+18,
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.WorkedIron, "workedRedstoneMachete");
        	uraniumRedstoneMachete = new InfiToolMachete(PHInfiHybrids.redstoneMacheteID+19,
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Uranium, "uraniumRedstoneMachete");
            
            MinecraftForge.setToolClass(woodRedstoneMachete, "Machete", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(stoneRedstoneMachete, "Machete", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(ironRedstoneMachete, "Machete", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(redstoneRedstoneMachete, "Machete", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(obsidianRedstoneMachete, "Machete", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(sandstoneRedstoneMachete, "Machete", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(boneRedstoneMachete, "Machete", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(paperRedstoneMachete, "Machete", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(mossyRedstoneMachete, "Machete", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackRedstoneMachete, "Machete", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(glowstoneRedstoneMachete, "Machete", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(iceRedstoneMachete, "Machete", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(lavaRedstoneMachete, "Machete", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(slimeRedstoneMachete, "Machete", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(cactusRedstoneMachete, "Machete", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(flintRedstoneMachete, "Machete", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(copperRedstoneMachete, "Machete", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(bronzeRedstoneMachete, "Machete", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(workedRedstoneMachete, "Machete", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(uraniumRedstoneMachete, "Machete", InfiMaterialEnum.Redstone.getHarvestLevel());
        }
        
        if(PHInfiHybrids.enableObsidianTools)
        {
        	woodObsidianMachete = new InfiToolMachete(PHInfiHybrids.obsidianMacheteID+0, 
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Wood, "woodObsidianMachete");
        	stoneObsidianMachete = new InfiToolMachete(PHInfiHybrids.obsidianMacheteID+1, 
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Stone, "stoneObsidianMachete");
        	redstoneObsidianMachete = new InfiToolMachete(PHInfiHybrids.obsidianMacheteID+2, 
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Redstone, "redstoneObsidianMachete");
        	obsidianObsidianMachete = new InfiToolMachete(PHInfiHybrids.obsidianMacheteID+3, 
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Obsidian, "obsidianObsidianMachete");;
        	boneObsidianMachete = new InfiToolMachete(PHInfiHybrids.obsidianMacheteID+4, 
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Bone, "boneObsidianMachete");
        	netherrackObsidianMachete = new InfiToolMachete(PHInfiHybrids.obsidianMacheteID+5, 
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Netherrack, "netherrackObsidianMachete");
        	glowstoneObsidianMachete = new InfiToolMachete(PHInfiHybrids.obsidianMacheteID+6, 
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Glowstone, "glowstoneObsidianMachete");
        	iceObsidianMachete = new InfiToolMachete(PHInfiHybrids.obsidianMacheteID+7, 
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Ice, "iceObsidianMachete");
        	lavaObsidianMachete = new InfiToolMachete(PHInfiHybrids.obsidianMacheteID+8,
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Lava, "lavaObsidianMachete");
        	cactusObsidianMachete = new InfiToolMachete(PHInfiHybrids.obsidianMacheteID+9,
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Cactus, "cactusObsidianMachete");
            
            MinecraftForge.setToolClass(woodObsidianMachete, "Machete", InfiMaterialEnum.Obsidian.getHarvestLevel());
            MinecraftForge.setToolClass(stoneObsidianMachete, "Machete", InfiMaterialEnum.Obsidian.getHarvestLevel());
            MinecraftForge.setToolClass(redstoneObsidianMachete, "Machete", InfiMaterialEnum.Obsidian.getHarvestLevel());
            MinecraftForge.setToolClass(obsidianObsidianMachete, "Machete", InfiMaterialEnum.Obsidian.getHarvestLevel());
            MinecraftForge.setToolClass(boneObsidianMachete, "Machete", InfiMaterialEnum.Obsidian.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackObsidianMachete, "Machete", InfiMaterialEnum.Obsidian.getHarvestLevel());
            MinecraftForge.setToolClass(glowstoneObsidianMachete, "Machete", InfiMaterialEnum.Obsidian.getHarvestLevel());
            MinecraftForge.setToolClass(iceObsidianMachete, "Machete", InfiMaterialEnum.Obsidian.getHarvestLevel());
            MinecraftForge.setToolClass(lavaObsidianMachete, "Machete", InfiMaterialEnum.Obsidian.getHarvestLevel());
            MinecraftForge.setToolClass(cactusObsidianMachete, "Machete", InfiMaterialEnum.Obsidian.getHarvestLevel());
        }
        
        if(PHInfiHybrids.enableSandstoneTools)
        {
        	woodSandstoneMachete = new InfiToolMachete(PHInfiHybrids.sandstoneMacheteID+0, 
                    InfiMaterialEnum.Sandstone, InfiMaterialEnum.Wood, "woodSandstoneMachete");
        	sandstoneSandstoneMachete = new InfiToolMachete(PHInfiHybrids.sandstoneMacheteID+1, 
                    InfiMaterialEnum.Sandstone, InfiMaterialEnum.Sandstone, "sandstoneSandstoneMachete");
        	boneSandstoneMachete = new InfiToolMachete(PHInfiHybrids.sandstoneMacheteID+2, 
                    InfiMaterialEnum.Sandstone, InfiMaterialEnum.Bone, "boneSandstoneMachete");
        	netherrackSandstoneMachete = new InfiToolMachete(PHInfiHybrids.sandstoneMacheteID+3, 
                    InfiMaterialEnum.Sandstone, InfiMaterialEnum.Netherrack, "netherrackSandstoneMachete");
        	iceSandstoneMachete = new InfiToolMachete(PHInfiHybrids.sandstoneMacheteID+4, 
                    InfiMaterialEnum.Sandstone, InfiMaterialEnum.Ice, "iceSandstoneMachete");
        	slimeSandstoneMachete = new InfiToolMachete(PHInfiHybrids.sandstoneMacheteID+5,
                    InfiMaterialEnum.Sandstone, InfiMaterialEnum.Slime, "slimeSandstoneMachete");
        	cactusSandstoneMachete = new InfiToolMachete(PHInfiHybrids.sandstoneMacheteID+6,
                    InfiMaterialEnum.Sandstone, InfiMaterialEnum.Cactus, "cactusSandstoneMachete");
        	flintSandstoneMachete = new InfiToolMachete(PHInfiHybrids.sandstoneMacheteID+7,
                    InfiMaterialEnum.Sandstone, InfiMaterialEnum.Flint, "flintSandstoneMachete");
            
            MinecraftForge.setToolClass(woodSandstoneMachete, "Machete", InfiMaterialEnum.Sandstone.getHarvestLevel());
            MinecraftForge.setToolClass(sandstoneSandstoneMachete, "Machete", InfiMaterialEnum.Sandstone.getHarvestLevel());
            MinecraftForge.setToolClass(boneSandstoneMachete, "Machete", InfiMaterialEnum.Sandstone.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackSandstoneMachete, "Machete", InfiMaterialEnum.Sandstone.getHarvestLevel());
            MinecraftForge.setToolClass(iceSandstoneMachete, "Machete", InfiMaterialEnum.Sandstone.getHarvestLevel());
            MinecraftForge.setToolClass(slimeSandstoneMachete, "Machete", InfiMaterialEnum.Sandstone.getHarvestLevel());
            MinecraftForge.setToolClass(cactusSandstoneMachete, "Machete", InfiMaterialEnum.Sandstone.getHarvestLevel());
            MinecraftForge.setToolClass(flintSandstoneMachete, "Machete", InfiMaterialEnum.Sandstone.getHarvestLevel());
        }
        
        if(PHInfiHybrids.enableBoneTools)
        {
        	woodBoneMachete = new InfiToolMachete(PHInfiHybrids.boneMacheteID+0, 
                    InfiMaterialEnum.Bone, InfiMaterialEnum.Wood, "woodBoneMachete");
        	stoneBoneMachete = new InfiToolMachete(PHInfiHybrids.boneMacheteID+1, 
                    InfiMaterialEnum.Bone, InfiMaterialEnum.Stone, "stoneBoneMachete");
        	sandstoneBoneMachete = new InfiToolMachete(PHInfiHybrids.boneMacheteID+2, 
                    InfiMaterialEnum.Bone, InfiMaterialEnum.Sandstone, "sandstoneBoneMachete");
        	boneBoneMachete = new InfiToolMachete(PHInfiHybrids.boneMacheteID+3, 
                    InfiMaterialEnum.Bone, InfiMaterialEnum.Bone, "boneBoneMachete");
        	paperBoneMachete = new InfiToolMachete(PHInfiHybrids.boneMacheteID+4, 
                    InfiMaterialEnum.Bone, InfiMaterialEnum.Paper, "paperBoneMachete");
        	netherrackBoneMachete = new InfiToolMachete(PHInfiHybrids.boneMacheteID+5, 
                    InfiMaterialEnum.Bone, InfiMaterialEnum.Netherrack, "netherrackBoneMachete");
        	iceBoneMachete = new InfiToolMachete(PHInfiHybrids.boneMacheteID+6, 
                    InfiMaterialEnum.Bone, InfiMaterialEnum.Ice, "iceBoneMachete");
        	cactusBoneMachete = new InfiToolMachete(PHInfiHybrids.boneMacheteID+7,
                    InfiMaterialEnum.Bone, InfiMaterialEnum.Cactus, "cactusBoneMachete");
        	flintBoneMachete = new InfiToolMachete(PHInfiHybrids.boneMacheteID+8,
                    InfiMaterialEnum.Bone, InfiMaterialEnum.Flint, "flintBoneMachete");
            
            MinecraftForge.setToolClass(woodBoneMachete, "Machete", InfiMaterialEnum.Bone.getHarvestLevel());
            MinecraftForge.setToolClass(stoneBoneMachete, "Machete", InfiMaterialEnum.Bone.getHarvestLevel());
            MinecraftForge.setToolClass(sandstoneBoneMachete, "Machete", InfiMaterialEnum.Bone.getHarvestLevel());
            MinecraftForge.setToolClass(boneBoneMachete, "Machete", InfiMaterialEnum.Bone.getHarvestLevel());
            MinecraftForge.setToolClass(paperBoneMachete, "Machete", InfiMaterialEnum.Bone.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackBoneMachete, "Machete", InfiMaterialEnum.Bone.getHarvestLevel());
            MinecraftForge.setToolClass(iceBoneMachete, "Machete", InfiMaterialEnum.Bone.getHarvestLevel());
            MinecraftForge.setToolClass(cactusBoneMachete, "Machete", InfiMaterialEnum.Bone.getHarvestLevel());
            MinecraftForge.setToolClass(flintBoneMachete, "Machete", InfiMaterialEnum.Bone.getHarvestLevel());
        }
        
        if(PHInfiHybrids.enablePaperTools)
        {
        	woodPaperMachete = new InfiToolMachete(PHInfiHybrids.paperMacheteID+0, 
                    InfiMaterialEnum.Paper, InfiMaterialEnum.Wood, "woodPaperMachete");
        	bonePaperMachete = new InfiToolMachete(PHInfiHybrids.paperMacheteID+1, 
                    InfiMaterialEnum.Paper, InfiMaterialEnum.Bone, "bonePaperMachete");
        	paperPaperMachete = new InfiToolMachete(PHInfiHybrids.paperMacheteID+2, 
                    InfiMaterialEnum.Paper, InfiMaterialEnum.Paper, "paperPaperMachete");
        	slimePaperMachete = new InfiToolMachete(PHInfiHybrids.paperMacheteID+3,
                    InfiMaterialEnum.Paper, InfiMaterialEnum.Slime, "slimePaperMachete");
        	cactusPaperMachete = new InfiToolMachete(PHInfiHybrids.paperMacheteID+4,
                    InfiMaterialEnum.Paper, InfiMaterialEnum.Cactus, "cactusPaperMachete");
            
            MinecraftForge.setToolClass(woodPaperMachete, "Machete", InfiMaterialEnum.Paper.getHarvestLevel());
            MinecraftForge.setToolClass(bonePaperMachete, "Machete", InfiMaterialEnum.Paper.getHarvestLevel());
            MinecraftForge.setToolClass(paperPaperMachete, "Machete", InfiMaterialEnum.Paper.getHarvestLevel());
            MinecraftForge.setToolClass(slimePaperMachete, "Machete", InfiMaterialEnum.Paper.getHarvestLevel());
            MinecraftForge.setToolClass(cactusPaperMachete, "Machete", InfiMaterialEnum.Paper.getHarvestLevel());
        }
        
        if(PHInfiHybrids.enableMossyTools)
        {
        	woodMossyMachete = new InfiToolMachete(PHInfiHybrids.mossyMacheteID+0, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Wood, "woodMossyMachete");
        	stoneMossyMachete = new InfiToolMachete(PHInfiHybrids.mossyMacheteID+1, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Stone, "stoneMossyMachete");
        	diamondMossyMachete = new InfiToolMachete(PHInfiHybrids.mossyMacheteID+2, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Diamond, "diamondMossyMachete");
        	redstoneMossyMachete = new InfiToolMachete(PHInfiHybrids.mossyMacheteID+3, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Redstone, "redstoneMossyMachete");
        	boneMossyMachete = new InfiToolMachete(PHInfiHybrids.mossyMacheteID+4, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Bone, "boneMossyMachete");
        	mossyMossyMachete = new InfiToolMachete(PHInfiHybrids.mossyMacheteID+5, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Mossy, "mossyMossyMachete");
        	netherrackMossyMachete = new InfiToolMachete(PHInfiHybrids.mossyMacheteID+6, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Netherrack, "netherrackMossyMachete");
        	glowstoneMossyMachete = new InfiToolMachete(PHInfiHybrids.mossyMacheteID+7, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Glowstone, "glowstoneMossyMachete");
        	cactusMossyMachete = new InfiToolMachete(PHInfiHybrids.mossyMacheteID+8, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Cactus, "cactusMossyMachete");
        	blazeMossyMachete = new InfiToolMachete(PHInfiHybrids.mossyMacheteID+9, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Blaze, "blazeMossyMachete");
        	manyullynMossyMachete = new InfiToolMachete(PHInfiHybrids.mossyMacheteID+10, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Manyullyn, "manyullynMossyMachete");
        	uraniumMossyMachete = new InfiToolMachete(PHInfiHybrids.mossyMacheteID+11, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Uranium, "uraniumMossyMachete");
            
            MinecraftForge.setToolClass(woodMossyMachete, "Machete", InfiMaterialEnum.Mossy.getHarvestLevel());
            MinecraftForge.setToolClass(stoneMossyMachete, "Machete", InfiMaterialEnum.Mossy.getHarvestLevel());
            MinecraftForge.setToolClass(diamondMossyMachete, "Machete", InfiMaterialEnum.Mossy.getHarvestLevel());
            MinecraftForge.setToolClass(redstoneMossyMachete, "Machete", InfiMaterialEnum.Mossy.getHarvestLevel());
            MinecraftForge.setToolClass(boneMossyMachete, "Machete", InfiMaterialEnum.Mossy.getHarvestLevel());
            MinecraftForge.setToolClass(mossyMossyMachete, "Machete", InfiMaterialEnum.Mossy.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackMossyMachete, "Machete", InfiMaterialEnum.Mossy.getHarvestLevel());
            MinecraftForge.setToolClass(glowstoneMossyMachete, "Machete", InfiMaterialEnum.Mossy.getHarvestLevel());
            MinecraftForge.setToolClass(cactusMossyMachete, "Machete", InfiMaterialEnum.Mossy.getHarvestLevel());
            MinecraftForge.setToolClass(blazeMossyMachete, "Machete", InfiMaterialEnum.Mossy.getHarvestLevel());
            MinecraftForge.setToolClass(manyullynMossyMachete, "Machete", InfiMaterialEnum.Mossy.getHarvestLevel());
            MinecraftForge.setToolClass(uraniumMossyMachete, "Machete", InfiMaterialEnum.Mossy.getHarvestLevel());
        }
        
        if(PHInfiHybrids.enableNetherrackTools)
        {
        	woodNetherrackMachete = new InfiToolMachete(PHInfiHybrids.netherrackMacheteID+0, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Wood, "woodNetherrackMachete");
        	stoneNetherrackMachete = new InfiToolMachete(PHInfiHybrids.netherrackMacheteID+1, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Stone, "stoneNetherrackMachete");
        	sandstoneNetherrackMachete = new InfiToolMachete(PHInfiHybrids.netherrackMacheteID+2, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Sandstone, "sandstoneNetherrackMachete");
        	boneNetherrackMachete = new InfiToolMachete(PHInfiHybrids.netherrackMacheteID+3, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Bone, "boneNetherrackMachete");
        	paperNetherrackMachete = new InfiToolMachete(PHInfiHybrids.netherrackMacheteID+4, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Paper, "paperNetherrackMachete");
        	mossyNetherrackMachete = new InfiToolMachete(PHInfiHybrids.netherrackMacheteID+5, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Mossy, "mossyNetherrackMachete");
        	netherrackNetherrackMachete = new InfiToolMachete(PHInfiHybrids.netherrackMacheteID+6, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Netherrack, "netherrackNetherrackMachete");
        	iceNetherrackMachete = new InfiToolMachete(PHInfiHybrids.netherrackMacheteID+7, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Ice, "iceNetherrackMachete");
        	slimeNetherrackMachete = new InfiToolMachete(PHInfiHybrids.netherrackMacheteID+8, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Slime, "slimeNetherrackMachete");
        	cactusNetherrackMachete = new InfiToolMachete(PHInfiHybrids.netherrackMacheteID+9, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Cactus, "cactusNetherrackMachete");
        	flintNetherrackMachete = new InfiToolMachete(PHInfiHybrids.netherrackMacheteID+10, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Flint, "flintNetherrackMachete");
        	copperNetherrackMachete = new InfiToolMachete(PHInfiHybrids.netherrackMacheteID+11, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Copper, "copperNetherrackMachete");
        	bronzeNetherrackMachete = new InfiToolMachete(PHInfiHybrids.netherrackMacheteID+12, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Bronze, "bronzeNetherrackMachete");
            
            MinecraftForge.setToolClass(woodNetherrackMachete, "Machete", InfiMaterialEnum.Netherrack.getHarvestLevel());
            MinecraftForge.setToolClass(stoneNetherrackMachete, "Machete", InfiMaterialEnum.Netherrack.getHarvestLevel());
            MinecraftForge.setToolClass(sandstoneNetherrackMachete, "Machete", InfiMaterialEnum.Netherrack.getHarvestLevel());
            MinecraftForge.setToolClass(boneNetherrackMachete, "Machete", InfiMaterialEnum.Netherrack.getHarvestLevel());
            MinecraftForge.setToolClass(paperNetherrackMachete, "Machete", InfiMaterialEnum.Netherrack.getHarvestLevel());
            MinecraftForge.setToolClass(mossyNetherrackMachete, "Machete", InfiMaterialEnum.Netherrack.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackNetherrackMachete, "Machete", InfiMaterialEnum.Netherrack.getHarvestLevel());
            MinecraftForge.setToolClass(iceNetherrackMachete, "Machete", InfiMaterialEnum.Netherrack.getHarvestLevel());
            MinecraftForge.setToolClass(slimeNetherrackMachete, "Machete", InfiMaterialEnum.Netherrack.getHarvestLevel());
            MinecraftForge.setToolClass(cactusNetherrackMachete, "Machete", InfiMaterialEnum.Netherrack.getHarvestLevel());
            MinecraftForge.setToolClass(flintNetherrackMachete, "Machete", InfiMaterialEnum.Netherrack.getHarvestLevel());
            MinecraftForge.setToolClass(copperNetherrackMachete, "Machete", InfiMaterialEnum.Netherrack.getHarvestLevel());
            MinecraftForge.setToolClass(bronzeNetherrackMachete, "Machete", InfiMaterialEnum.Netherrack.getHarvestLevel());
        }
        
        if(PHInfiHybrids.enableGlowstoneTools)
        {
        	woodGlowstoneMachete = new InfiToolMachete(PHInfiHybrids.glowstoneMacheteID+0, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Wood, "woodGlowstoneMachete");
        	redstoneGlowstoneMachete = new InfiToolMachete(PHInfiHybrids.glowstoneMacheteID+1, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Redstone, "redstoneGlowstoneMachete");
        	obsidianGlowstoneMachete = new InfiToolMachete(PHInfiHybrids.glowstoneMacheteID+2, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Obsidian, "obsidianGlowstoneMachete");
        	boneGlowstoneMachete = new InfiToolMachete(PHInfiHybrids.glowstoneMacheteID+3, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Bone, "boneGlowstoneMachete");
        	netherrackGlowstoneMachete = new InfiToolMachete(PHInfiHybrids.glowstoneMacheteID+4, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Netherrack, "netherrackGlowstoneMachete");
        	glowstoneGlowstoneMachete = new InfiToolMachete(PHInfiHybrids.glowstoneMacheteID+5, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Glowstone, "glowstoneGlowstoneMachete");
        	iceGlowstoneMachete = new InfiToolMachete(PHInfiHybrids.glowstoneMacheteID+6, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Ice, "iceGlowstoneMachete");
        	slimeGlowstoneMachete = new InfiToolMachete(PHInfiHybrids.glowstoneMacheteID+7, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Slime, "slimeGlowstoneMachete");
        	cactusGlowstoneMachete = new InfiToolMachete(PHInfiHybrids.glowstoneMacheteID+8, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Cactus, "cactusGlowstoneMachete");
            
            
            MinecraftForge.setToolClass(woodGlowstoneMachete, "Machete", InfiMaterialEnum.Glowstone.getHarvestLevel());
            MinecraftForge.setToolClass(redstoneGlowstoneMachete, "Machete", InfiMaterialEnum.Glowstone.getHarvestLevel());
            MinecraftForge.setToolClass(obsidianGlowstoneMachete, "Machete", InfiMaterialEnum.Glowstone.getHarvestLevel());
            MinecraftForge.setToolClass(boneGlowstoneMachete, "Machete", InfiMaterialEnum.Glowstone.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackGlowstoneMachete, "Machete", InfiMaterialEnum.Glowstone.getHarvestLevel());
            MinecraftForge.setToolClass(glowstoneGlowstoneMachete, "Machete", InfiMaterialEnum.Glowstone.getHarvestLevel());
            MinecraftForge.setToolClass(iceGlowstoneMachete, "Machete", InfiMaterialEnum.Glowstone.getHarvestLevel());
            MinecraftForge.setToolClass(slimeGlowstoneMachete, "Machete", InfiMaterialEnum.Glowstone.getHarvestLevel());
            MinecraftForge.setToolClass(cactusGlowstoneMachete, "Machete", InfiMaterialEnum.Glowstone.getHarvestLevel());
        }
        
        if(PHInfiHybrids.enableIceTools)
        {
        	woodIceMachete = new InfiToolMachete(PHInfiHybrids.iceMacheteID+0, 
                    InfiMaterialEnum.Ice, InfiMaterialEnum.Wood, "woodIceMachete");
        	boneIceMachete = new InfiToolMachete(PHInfiHybrids.iceMacheteID+1, 
                    InfiMaterialEnum.Ice, InfiMaterialEnum.Bone, "boneIceMachete");
        	paperIceMachete = new InfiToolMachete(PHInfiHybrids.iceMacheteID+2, 
                    InfiMaterialEnum.Ice, InfiMaterialEnum.Paper, "paperIceMachete");
        	iceIceMachete = new InfiToolMachete(PHInfiHybrids.iceMacheteID+3, 
                    InfiMaterialEnum.Ice, InfiMaterialEnum.Ice, "iceIceMachete");
        	slimeIceMachete = new InfiToolMachete(PHInfiHybrids.iceMacheteID+4, 
                    InfiMaterialEnum.Ice, InfiMaterialEnum.Slime, "slimeIceMachete");
        	cactusIceMachete = new InfiToolMachete(PHInfiHybrids.iceMacheteID+5, 
                    InfiMaterialEnum.Ice, InfiMaterialEnum.Cactus, "cactusIceMachete");
            
            
            MinecraftForge.setToolClass(woodIceMachete, "Machete", InfiMaterialEnum.Ice.getHarvestLevel());
            MinecraftForge.setToolClass(boneIceMachete, "Machete", InfiMaterialEnum.Ice.getHarvestLevel());
            MinecraftForge.setToolClass(paperIceMachete, "Machete", InfiMaterialEnum.Ice.getHarvestLevel());
            MinecraftForge.setToolClass(iceIceMachete, "Machete", InfiMaterialEnum.Ice.getHarvestLevel());
            MinecraftForge.setToolClass(slimeIceMachete, "Machete", InfiMaterialEnum.Ice.getHarvestLevel());
            MinecraftForge.setToolClass(cactusIceMachete, "Machete", InfiMaterialEnum.Ice.getHarvestLevel());
        }
        
        if(PHInfiHybrids.enableLavaTools)
        {
        	diamondLavaMachete = new InfiToolMachete(PHInfiHybrids.lavaMacheteID+0, 
                    InfiMaterialEnum.Lava, InfiMaterialEnum.Diamond, "diamondLavaMachete");
        	obsidianLavaMachete = new InfiToolMachete(PHInfiHybrids.lavaMacheteID+1, 
                    InfiMaterialEnum.Lava, InfiMaterialEnum.Obsidian, "obsidianLavaMachete");
        	netherrackLavaMachete = new InfiToolMachete(PHInfiHybrids.lavaMacheteID+2, 
                    InfiMaterialEnum.Lava, InfiMaterialEnum.Netherrack, "netherrackLavaMachete");
        	lavaLavaMachete = new InfiToolMachete(PHInfiHybrids.lavaMacheteID+3, 
                    InfiMaterialEnum.Lava, InfiMaterialEnum.Lava, "lavaLavaMachete");
        	flintLavaMachete = new InfiToolMachete(PHInfiHybrids.lavaMacheteID+4, 
                    InfiMaterialEnum.Lava, InfiMaterialEnum.Flint, "flintLavaMachete");
        	blazeLavaMachete = new InfiToolMachete(PHInfiHybrids.lavaMacheteID+5, 
                    InfiMaterialEnum.Lava, InfiMaterialEnum.Blaze, "blazeLavaMachete");
        	manyullynLavaMachete = new InfiToolMachete(PHInfiHybrids.lavaMacheteID+6, 
                    InfiMaterialEnum.Lava, InfiMaterialEnum.Manyullyn, "manyullynLavaMachete");
            uraniumLavaMachete = new InfiToolMachete(PHInfiHybrids.lavaMacheteID+7, 
                    InfiMaterialEnum.Lava, InfiMaterialEnum.Uranium, "uraniumLavaMachete");
            
            MinecraftForge.setToolClass(diamondLavaMachete, "Machete", InfiMaterialEnum.Lava.getHarvestLevel());
            MinecraftForge.setToolClass(obsidianLavaMachete, "Machete", InfiMaterialEnum.Lava.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackLavaMachete, "Machete", InfiMaterialEnum.Lava.getHarvestLevel());
            MinecraftForge.setToolClass(lavaLavaMachete, "Machete", InfiMaterialEnum.Lava.getHarvestLevel());
            MinecraftForge.setToolClass(flintLavaMachete, "Machete", InfiMaterialEnum.Lava.getHarvestLevel());
            MinecraftForge.setToolClass(blazeLavaMachete, "Machete", InfiMaterialEnum.Lava.getHarvestLevel());
            MinecraftForge.setToolClass(manyullynLavaMachete, "Machete", InfiMaterialEnum.Lava.getHarvestLevel());
            MinecraftForge.setToolClass(uraniumLavaMachete, "Machete", InfiMaterialEnum.Lava.getHarvestLevel());
        }
        
        if(PHInfiHybrids.enableSlimeTools)
        {
        	woodSlimeMachete = new InfiToolMachete(PHInfiHybrids.slimeMacheteID+0, 
                    InfiMaterialEnum.Slime, InfiMaterialEnum.Wood, "woodSlimeMachete");
        	sandstoneSlimeMachete = new InfiToolMachete(PHInfiHybrids.slimeMacheteID+1, 
                    InfiMaterialEnum.Slime, InfiMaterialEnum.Sandstone, "sandstoneSlimeMachete");
        	boneSlimeMachete = new InfiToolMachete(PHInfiHybrids.slimeMacheteID+2, 
                    InfiMaterialEnum.Slime, InfiMaterialEnum.Bone, "boneSlimeMachete");
        	paperSlimeMachete = new InfiToolMachete(PHInfiHybrids.slimeMacheteID+3, 
                    InfiMaterialEnum.Slime, InfiMaterialEnum.Paper, "paperSlimeMachete");
        	slimeSlimeMachete = new InfiToolMachete(PHInfiHybrids.slimeMacheteID+4, 
                    InfiMaterialEnum.Slime, InfiMaterialEnum.Slime, "slimeSlimeMachete");
        	cactusSlimeMachete = new InfiToolMachete(PHInfiHybrids.slimeMacheteID+5, 
                    InfiMaterialEnum.Slime, InfiMaterialEnum.Cactus, "cactusSlimeMachete");
            
            MinecraftForge.setToolClass(woodSlimeMachete, "Machete", InfiMaterialEnum.Slime.getHarvestLevel());
            MinecraftForge.setToolClass(sandstoneSlimeMachete, "Machete", InfiMaterialEnum.Slime.getHarvestLevel());
            MinecraftForge.setToolClass(boneSlimeMachete, "Machete", InfiMaterialEnum.Slime.getHarvestLevel());
            MinecraftForge.setToolClass(paperSlimeMachete, "Machete", InfiMaterialEnum.Slime.getHarvestLevel());
            MinecraftForge.setToolClass(slimeSlimeMachete, "Machete", InfiMaterialEnum.Slime.getHarvestLevel());
            MinecraftForge.setToolClass(cactusSlimeMachete, "Machete", InfiMaterialEnum.Slime.getHarvestLevel());
        }
        
        if(PHInfiHybrids.enableCactusTools)
        {
        	woodCactusMachete = new InfiToolMachete(PHInfiHybrids.cactusMacheteID+0, 
                    InfiMaterialEnum.Cactus, InfiMaterialEnum.Wood, "woodCactusMachete");
        	sandstoneCactusMachete = new InfiToolMachete(PHInfiHybrids.cactusMacheteID+1, 
                    InfiMaterialEnum.Cactus, InfiMaterialEnum.Sandstone, "sandstoneCactusMachete");
        	boneCactusMachete = new InfiToolMachete(PHInfiHybrids.cactusMacheteID+2, 
                    InfiMaterialEnum.Cactus, InfiMaterialEnum.Bone, "boneCactusMachete");
        	netherrackCactusMachete = new InfiToolMachete(PHInfiHybrids.cactusMacheteID+3, 
                    InfiMaterialEnum.Cactus, InfiMaterialEnum.Netherrack, "netherrackCactusMachete");
        	iceCactusMachete = new InfiToolMachete(PHInfiHybrids.cactusMacheteID+4, 
                    InfiMaterialEnum.Cactus, InfiMaterialEnum.Ice, "iceCactusMachete");
        	slimeCactusMachete = new InfiToolMachete(PHInfiHybrids.cactusMacheteID+5, 
                    InfiMaterialEnum.Cactus, InfiMaterialEnum.Slime, "slimeCactusMachete");
        	cactusCactusMachete = new InfiToolMachete(PHInfiHybrids.cactusMacheteID+6, 
                    InfiMaterialEnum.Cactus, InfiMaterialEnum.Cactus, "cactusCactusMachete");
            
            MinecraftForge.setToolClass(woodCactusMachete, "Machete", InfiMaterialEnum.Cactus.getHarvestLevel());
            MinecraftForge.setToolClass(sandstoneCactusMachete, "Machete", InfiMaterialEnum.Cactus.getHarvestLevel());
            MinecraftForge.setToolClass(boneCactusMachete, "Machete", InfiMaterialEnum.Cactus.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackCactusMachete, "Machete", InfiMaterialEnum.Cactus.getHarvestLevel());
            MinecraftForge.setToolClass(iceCactusMachete, "Machete", InfiMaterialEnum.Cactus.getHarvestLevel());
            MinecraftForge.setToolClass(slimeCactusMachete, "Machete", InfiMaterialEnum.Cactus.getHarvestLevel());
            MinecraftForge.setToolClass(cactusCactusMachete, "Machete", InfiMaterialEnum.Cactus.getHarvestLevel());
        }
        
        if(PHInfiHybrids.enableFlintTools)
        {
        	woodFlintMachete = new InfiToolMachete(PHInfiHybrids.flintMacheteID+0, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Wood, "woodFlintMachete");
        	stoneFlintMachete = new InfiToolMachete(PHInfiHybrids.flintMacheteID+1, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Stone, "stoneFlintMachete");
        	sandstoneFlintMachete = new InfiToolMachete(PHInfiHybrids.flintMacheteID+2, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Sandstone, "sandstoneFlintMachete");
        	boneFlintMachete = new InfiToolMachete(PHInfiHybrids.flintMacheteID+3, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Bone, "boneFlintMachete");
        	netherrackFlintMachete = new InfiToolMachete(PHInfiHybrids.flintMacheteID+4, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Netherrack, "netherrackFlintMachete");
        	slimeFlintMachete = new InfiToolMachete(PHInfiHybrids.flintMacheteID+5, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Slime, "slimeFlintMachete");
        	cactusFlintMachete = new InfiToolMachete(PHInfiHybrids.flintMacheteID+6, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Cactus, "cactusFlintMachete");
        	flintFlintMachete = new InfiToolMachete(PHInfiHybrids.flintMacheteID+7, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Flint, "flintFlintMachete");
        	copperFlintMachete = new InfiToolMachete(PHInfiHybrids.flintMacheteID+8, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Copper, "copperFlintMachete");
        	bronzeFlintMachete = new InfiToolMachete(PHInfiHybrids.flintMacheteID+9, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Bronze, "bronzeFlintMachete");
            
            MinecraftForge.setToolClass(woodFlintMachete, "Machete", InfiMaterialEnum.Flint.getHarvestLevel());
            MinecraftForge.setToolClass(stoneFlintMachete, "Machete", InfiMaterialEnum.Flint.getHarvestLevel());
            MinecraftForge.setToolClass(sandstoneFlintMachete, "Machete", InfiMaterialEnum.Flint.getHarvestLevel());
            MinecraftForge.setToolClass(boneFlintMachete, "Machete", InfiMaterialEnum.Flint.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackFlintMachete, "Machete", InfiMaterialEnum.Flint.getHarvestLevel());
            MinecraftForge.setToolClass(slimeFlintMachete, "Machete", InfiMaterialEnum.Flint.getHarvestLevel());
            MinecraftForge.setToolClass(cactusFlintMachete, "Machete", InfiMaterialEnum.Flint.getHarvestLevel());
            MinecraftForge.setToolClass(flintFlintMachete, "Machete", InfiMaterialEnum.Flint.getHarvestLevel());
            MinecraftForge.setToolClass(copperFlintMachete, "Machete", InfiMaterialEnum.Flint.getHarvestLevel());
            MinecraftForge.setToolClass(bronzeFlintMachete, "Machete", InfiMaterialEnum.Flint.getHarvestLevel());
        }
        
        if(PHInfiHybrids.enableBlazeTools)
        {
        	diamondBlazeMachete = new InfiToolMachete(PHInfiHybrids.blazeMacheteID+0, 
                    InfiMaterialEnum.Blaze, InfiMaterialEnum.Diamond, "diamondBlazeMachete");
        	obsidianBlazeMachete = new InfiToolMachete(PHInfiHybrids.blazeMacheteID+1, 
                    InfiMaterialEnum.Blaze, InfiMaterialEnum.Obsidian, "obsidianBlazeMachete");
        	netherrackBlazeMachete = new InfiToolMachete(PHInfiHybrids.blazeMacheteID+2, 
                    InfiMaterialEnum.Blaze, InfiMaterialEnum.Netherrack, "netherrackBlazeMachete");
        	lavaBlazeMachete = new InfiToolMachete(PHInfiHybrids.blazeMacheteID+3, 
                    InfiMaterialEnum.Blaze, InfiMaterialEnum.Lava, "lavaBlazeMachete");
        	flintBlazeMachete = new InfiToolMachete(PHInfiHybrids.blazeMacheteID+4, 
                    InfiMaterialEnum.Blaze, InfiMaterialEnum.Flint, "flintBlazeMachete");
        	blazeBlazeMachete = new InfiToolMachete(PHInfiHybrids.blazeMacheteID+5, 
                    InfiMaterialEnum.Blaze, InfiMaterialEnum.Blaze, "blazeBlazeMachete");
        	manyullynBlazeMachete = new InfiToolMachete(PHInfiHybrids.blazeMacheteID+6, 
                    InfiMaterialEnum.Blaze, InfiMaterialEnum.Manyullyn, "manyullynBlazeMachete");
            uraniumBlazeMachete = new InfiToolMachete(PHInfiHybrids.blazeMacheteID+7, 
                    InfiMaterialEnum.Blaze, InfiMaterialEnum.Uranium, "uraniumBlazeMachete");
            
            MinecraftForge.setToolClass(diamondBlazeMachete, "Machete", InfiMaterialEnum.Blaze.getHarvestLevel());
            MinecraftForge.setToolClass(obsidianBlazeMachete, "Machete", InfiMaterialEnum.Blaze.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackBlazeMachete, "Machete", InfiMaterialEnum.Blaze.getHarvestLevel());
            MinecraftForge.setToolClass(blazeBlazeMachete, "Machete", InfiMaterialEnum.Blaze.getHarvestLevel());
            MinecraftForge.setToolClass(flintBlazeMachete, "Machete", InfiMaterialEnum.Blaze.getHarvestLevel());
            MinecraftForge.setToolClass(blazeBlazeMachete, "Machete", InfiMaterialEnum.Blaze.getHarvestLevel());
            MinecraftForge.setToolClass(manyullynBlazeMachete, "Machete", InfiMaterialEnum.Blaze.getHarvestLevel());
            MinecraftForge.setToolClass(uraniumBlazeMachete, "Machete", InfiMaterialEnum.Blaze.getHarvestLevel());
        }
    	
        if(PHInfiHybrids.enableCopperTools)
        {
        	woodCopperMachete = new InfiToolMachete(PHInfiHybrids.copperMacheteID+0, 
                    InfiMaterialEnum.Copper, InfiMaterialEnum.Wood, "woodCopperMachete");
            stoneCopperMachete = new InfiToolMachete(PHInfiHybrids.copperMacheteID+1, 
                    InfiMaterialEnum.Copper, InfiMaterialEnum.Stone, "stoneCopperMachete");
            boneCopperMachete = new InfiToolMachete(PHInfiHybrids.copperMacheteID+2, 
                    InfiMaterialEnum.Copper, InfiMaterialEnum.Bone, "boneCopperMachete");
            netherrackCopperMachete = new InfiToolMachete(PHInfiHybrids.copperMacheteID+3, 
                    InfiMaterialEnum.Copper, InfiMaterialEnum.Netherrack, "netherrackCopperMachete");
            slimeCopperMachete = new InfiToolMachete(PHInfiHybrids.copperMacheteID+4, 
                    InfiMaterialEnum.Copper, InfiMaterialEnum.Slime, "slimeCopperMachete");
            cactusCopperMachete = new InfiToolMachete(PHInfiHybrids.copperMacheteID+5, 
                    InfiMaterialEnum.Copper, InfiMaterialEnum.Cactus, "cactusCopperMachete");
            flintCopperMachete = new InfiToolMachete(PHInfiHybrids.copperMacheteID+6, 
                    InfiMaterialEnum.Copper, InfiMaterialEnum.Flint, "flintCopperMachete");
            copperCopperMachete = new InfiToolMachete(PHInfiHybrids.copperMacheteID+7, 
                    InfiMaterialEnum.Copper, InfiMaterialEnum.Copper, "copperCopperMachete");
            
            MinecraftForge.setToolClass(woodCopperMachete, "Machete", InfiMaterialEnum.Copper.getHarvestLevel());
        	MinecraftForge.setToolClass(stoneCopperMachete, "Machete", InfiMaterialEnum.Copper.getHarvestLevel());
            MinecraftForge.setToolClass(boneCopperMachete, "Machete", InfiMaterialEnum.Copper.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackCopperMachete, "Machete", InfiMaterialEnum.Copper.getHarvestLevel());
            MinecraftForge.setToolClass(slimeCopperMachete, "Machete", InfiMaterialEnum.Copper.getHarvestLevel());
            MinecraftForge.setToolClass(cactusCopperMachete, "Machete", InfiMaterialEnum.Copper.getHarvestLevel());
            MinecraftForge.setToolClass(flintCopperMachete, "Machete", InfiMaterialEnum.Copper.getHarvestLevel());
            MinecraftForge.setToolClass(copperCopperMachete, "Machete", InfiMaterialEnum.Copper.getHarvestLevel());
        }
        
        if(PHInfiHybrids.enableBronzeTools)
        {
        	woodBronzeMachete = new InfiToolMachete(PHInfiHybrids.bronzeMacheteID+0, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Wood, "woodBronzeMachete");
            stoneBronzeMachete = new InfiToolMachete(PHInfiHybrids.bronzeMacheteID+1, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Stone, "stoneBronzeMachete");
            boneBronzeMachete = new InfiToolMachete(PHInfiHybrids.bronzeMacheteID+2, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Bone, "boneBronzeMachete");
            netherrackBronzeMachete = new InfiToolMachete(PHInfiHybrids.bronzeMacheteID+3, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Netherrack, "netherrackBronzeMachete");
            slimeBronzeMachete = new InfiToolMachete(PHInfiHybrids.bronzeMacheteID+4, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Slime, "slimeBronzeMachete");
            cactusBronzeMachete = new InfiToolMachete(PHInfiHybrids.bronzeMacheteID+5, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Cactus, "cactusBronzeMachete");
            flintBronzeMachete = new InfiToolMachete(PHInfiHybrids.bronzeMacheteID+6, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Flint, "flintBronzeMachete");
            copperBronzeMachete = new InfiToolMachete(PHInfiHybrids.bronzeMacheteID+7, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Copper, "copperBronzeMachete");
            bronzeBronzeMachete = new InfiToolMachete(PHInfiHybrids.bronzeMacheteID+8, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Bronze, "bronzeBronzeMachete");
            
            MinecraftForge.setToolClass(woodBronzeMachete, "Machete", InfiMaterialEnum.Bronze.getHarvestLevel());
            MinecraftForge.setToolClass(stoneBronzeMachete, "Machete", InfiMaterialEnum.Bronze.getHarvestLevel());
            MinecraftForge.setToolClass(boneBronzeMachete, "Machete", InfiMaterialEnum.Bronze.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackBronzeMachete, "Machete", InfiMaterialEnum.Bronze.getHarvestLevel());
            MinecraftForge.setToolClass(slimeBronzeMachete, "Machete", InfiMaterialEnum.Bronze.getHarvestLevel());
            MinecraftForge.setToolClass(cactusBronzeMachete, "Machete", InfiMaterialEnum.Bronze.getHarvestLevel());
            MinecraftForge.setToolClass(flintBronzeMachete, "Machete", InfiMaterialEnum.Bronze.getHarvestLevel());
            MinecraftForge.setToolClass(copperBronzeMachete, "Machete", InfiMaterialEnum.Bronze.getHarvestLevel());
            MinecraftForge.setToolClass(bronzeBronzeMachete, "Machete", InfiMaterialEnum.Bronze.getHarvestLevel());
        }
        
        if(PHInfiHybrids.enableWorkedIronTools)
        {
        	woodWorkedIronMachete = new InfiToolMachete(PHInfiHybrids.workedIronMacheteID+0, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Wood, "woodWorkedIronMachete");
            stoneWorkedIronMachete = new InfiToolMachete(PHInfiHybrids.workedIronMacheteID+1, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Stone, "stoneWorkedIronMachete");
            ironWorkedIronMachete = new InfiToolMachete(PHInfiHybrids.workedIronMacheteID+2,
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Iron, "ironWorkedIronMachete");
            diamondWorkedIronMachete = new InfiToolMachete(PHInfiHybrids.workedIronMacheteID+3, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Diamond, "diamondWorkedIronMachete");
            redstoneWorkedIronMachete = new InfiToolMachete(PHInfiHybrids.workedIronMacheteID+4, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Redstone, "redstoneWorkedIronMachete");
            obsidianWorkedIronMachete = new InfiToolMachete(PHInfiHybrids.workedIronMacheteID+5, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Obsidian, "obsidianWorkedIronMachete");
            boneWorkedIronMachete = new InfiToolMachete(PHInfiHybrids.workedIronMacheteID+6, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Bone, "boneWorkedIronMachete");
            netherrackWorkedIronMachete = new InfiToolMachete(PHInfiHybrids.workedIronMacheteID+7, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Netherrack, "netherrackWorkedIronMachete");
            glowstoneWorkedIronMachete = new InfiToolMachete(PHInfiHybrids.workedIronMacheteID+8, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Glowstone, "glowstoneWorkedIronMachete");
            iceWorkedIronMachete = new InfiToolMachete(PHInfiHybrids.workedIronMacheteID+9, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Ice, "iceWorkedIronMachete");
            slimeWorkedIronMachete = new InfiToolMachete(PHInfiHybrids.workedIronMacheteID+10, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Slime, "slimeWorkedIronMachete");
            cactusWorkedIronMachete = new InfiToolMachete(PHInfiHybrids.workedIronMacheteID+11, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Cactus, "cactusWorkedIronMachete");
            blazeWorkedIronMachete = new InfiToolMachete(PHInfiHybrids.workedIronMacheteID+12, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Blaze, "blazeWorkedIronMachete");
            copperWorkedIronMachete = new InfiToolMachete(PHInfiHybrids.workedIronMacheteID+13, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Copper, "copperWorkedIronMachete");
            bronzeWorkedIronMachete = new InfiToolMachete(PHInfiHybrids.workedIronMacheteID+14, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Bronze, "bronzeWorkedIronMachete");
            workedWorkedIronMachete = new InfiToolMachete(PHInfiHybrids.workedIronMacheteID+15, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.WorkedIron, "workedWorkedIronMachete");
            steelWorkedIronMachete = new InfiToolMachete(PHInfiHybrids.workedIronMacheteID+16, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Steel, "steelWorkedIronMachete");
            uraniumWorkedIronMachete = new InfiToolMachete(PHInfiHybrids.workedIronMacheteID+17, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Uranium, "uraniumWorkedIronMachete");
            
            MinecraftForge.setToolClass(woodWorkedIronMachete, "Machete", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(stoneWorkedIronMachete, "Machete", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(ironWorkedIronMachete, "Machete", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(diamondWorkedIronMachete, "Machete", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(redstoneWorkedIronMachete, "Machete", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(obsidianWorkedIronMachete, "Machete", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(boneWorkedIronMachete, "Machete", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackWorkedIronMachete, "Machete", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(glowstoneWorkedIronMachete, "Machete", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(iceWorkedIronMachete, "Machete", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(slimeWorkedIronMachete, "Machete", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(cactusWorkedIronMachete, "Machete", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(blazeWorkedIronMachete, "Machete", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(copperWorkedIronMachete, "Machete", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(bronzeWorkedIronMachete, "Machete", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(workedWorkedIronMachete, "Machete", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(steelWorkedIronMachete, "Machete", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(uraniumWorkedIronMachete, "Machete", InfiMaterialEnum.WorkedIron.getHarvestLevel());
        }
        
        if(PHInfiHybrids.enableSteelTools)
        {
        	woodSteelMachete = new InfiToolMachete(PHInfiHybrids.steelMacheteID+0, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Wood, "woodSteelMachete");
            stoneSteelMachete = new InfiToolMachete(PHInfiHybrids.steelMacheteID+1, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Stone, "stoneSteelMachete");
            ironSteelMachete = new InfiToolMachete(PHInfiHybrids.steelMacheteID+2, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Iron, "ironSteelMachete");
            diamondSteelMachete = new InfiToolMachete(PHInfiHybrids.steelMacheteID+3, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Diamond, "diamondSteelMachete");
            redstoneSteelMachete = new InfiToolMachete(PHInfiHybrids.steelMacheteID+4, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Redstone, "redstoneSteelMachete");
            obsidianSteelMachete = new InfiToolMachete(PHInfiHybrids.steelMacheteID+5, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Obsidian, "obsidianSteelMachete");
            boneSteelMachete = new InfiToolMachete(PHInfiHybrids.steelMacheteID+6, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Bone, "boneSteelMachete");
            netherrackSteelMachete = new InfiToolMachete(PHInfiHybrids.steelMacheteID+7, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Netherrack, "netherrackSteelMachete");
            glowstoneSteelMachete = new InfiToolMachete(PHInfiHybrids.steelMacheteID+8, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Glowstone, "glowstoneSteelMachete");
            iceSteelMachete = new InfiToolMachete(PHInfiHybrids.steelMacheteID+9, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Ice, "iceSteelMachete");
            slimeSteelMachete = new InfiToolMachete(PHInfiHybrids.steelMacheteID+10, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Slime, "slimeSteelMachete");
            cactusSteelMachete = new InfiToolMachete(PHInfiHybrids.steelMacheteID+11, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Cactus, "cactusSteelMachete");
            blazeSteelMachete = new InfiToolMachete(PHInfiHybrids.steelMacheteID+12, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Blaze, "blazeSteelMachete");
            copperSteelMachete = new InfiToolMachete(PHInfiHybrids.steelMacheteID+13, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Copper, "copperSteelMachete");
            bronzeSteelMachete = new InfiToolMachete(PHInfiHybrids.steelMacheteID+14, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Bronze, "bronzeSteelMachete");
            workedSteelMachete = new InfiToolMachete(PHInfiHybrids.steelMacheteID+15, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.WorkedIron, "workedSteelMachete");
            steelSteelMachete = new InfiToolMachete(PHInfiHybrids.steelMacheteID+16, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Steel, "steelSteelMachete");
            cobaltSteelMachete = new InfiToolMachete(PHInfiHybrids.steelMacheteID+17, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Cobalt, "cobaltSteelMachete");
            arditeSteelMachete = new InfiToolMachete(PHInfiHybrids.steelMacheteID+18, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Ardite, "arditeSteelMachete");
            uraniumSteelMachete = new InfiToolMachete(PHInfiHybrids.steelMacheteID+19, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Uranium, "uraniumSteelMachete");

            MinecraftForge.setToolClass(woodSteelMachete, "Machete", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(stoneSteelMachete, "Machete", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(ironSteelMachete, "Machete", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(diamondSteelMachete, "Machete", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(redstoneSteelMachete, "Machete", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(obsidianSteelMachete, "Machete", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(boneSteelMachete, "Machete", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackSteelMachete, "Machete", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(glowstoneSteelMachete, "Machete", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(iceSteelMachete, "Machete", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(slimeSteelMachete, "Machete", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(cactusSteelMachete, "Machete", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(blazeSteelMachete, "Machete", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(copperSteelMachete, "Machete", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(bronzeSteelMachete, "Machete", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(workedSteelMachete, "Machete", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(steelSteelMachete, "Machete", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(cobaltSteelMachete, "Machete", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(arditeSteelMachete, "Machete", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(uraniumSteelMachete, "Machete", InfiMaterialEnum.Steel.getHarvestLevel());
        }
        
        if(PHInfiHybrids.enableCobaltTools)
        {
        	woodCobaltMachete = new InfiToolMachete(PHInfiHybrids.cobaltMacheteID+0, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Wood, "woodCobaltMachete");
            stoneCobaltMachete = new InfiToolMachete(PHInfiHybrids.cobaltMacheteID+1, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Stone, "stoneCobaltMachete");
            ironCobaltMachete = new InfiToolMachete(PHInfiHybrids.cobaltMacheteID+2, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Iron, "ironCobaltMachete");
            diamondCobaltMachete = new InfiToolMachete(PHInfiHybrids.cobaltMacheteID+3,
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Diamond, "diamondCobaltMachete");
            redstoneCobaltMachete = new InfiToolMachete(PHInfiHybrids.cobaltMacheteID+4, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Redstone, "redstoneCobaltMachete");
            obsidianCobaltMachete = new InfiToolMachete(PHInfiHybrids.cobaltMacheteID+5, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Obsidian, "obsidianCobaltMachete");
            boneCobaltMachete = new InfiToolMachete(PHInfiHybrids.cobaltMacheteID+6, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Bone, "boneCobaltMachete");
            slimeCobaltMachete = new InfiToolMachete(PHInfiHybrids.cobaltMacheteID+7, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Slime, "slimeCobaltMachete");
            cactusCobaltMachete = new InfiToolMachete(PHInfiHybrids.cobaltMacheteID+8, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Cactus, "cactusCobaltMachete");
            blazeCobaltMachete = new InfiToolMachete(PHInfiHybrids.cobaltMacheteID+9, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Blaze, "blazeCobaltMachete");
            copperCobaltMachete = new InfiToolMachete(PHInfiHybrids.cobaltMacheteID+10, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Copper, "copperCobaltMachete");
            bronzeCobaltMachete = new InfiToolMachete(PHInfiHybrids.cobaltMacheteID+11, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Bronze, "bronzeCobaltMachete");
            workedCobaltMachete = new InfiToolMachete(PHInfiHybrids.cobaltMacheteID+12, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.WorkedIron, "workedCobaltMachete");
            steelCobaltMachete = new InfiToolMachete(PHInfiHybrids.cobaltMacheteID+13, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Steel, "steelCobaltMachete");
            cobaltCobaltMachete = new InfiToolMachete(PHInfiHybrids.cobaltMacheteID+14, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Cobalt, "cobaltCobaltMachete");
            arditeCobaltMachete = new InfiToolMachete(PHInfiHybrids.cobaltMacheteID+15, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Ardite, "arditeCobaltMachete");
            manyullynCobaltMachete = new InfiToolMachete(PHInfiHybrids.cobaltMacheteID+16, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Manyullyn, "manyullynCobaltMachete");
            uraniumCobaltMachete = new InfiToolMachete(PHInfiHybrids.cobaltMacheteID+17, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Uranium, "uraniumCobaltMachete");
            
            MinecraftForge.setToolClass(woodCobaltMachete, "Machete", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(stoneCobaltMachete, "Machete", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(ironCobaltMachete, "Machete", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(diamondCobaltMachete, "Machete", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(redstoneCobaltMachete, "Machete", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(obsidianCobaltMachete, "Machete", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(boneCobaltMachete, "Machete", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(slimeCobaltMachete, "Machete", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(cactusCobaltMachete, "Machete", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(blazeCobaltMachete, "Machete", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(copperCobaltMachete, "Machete", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(bronzeCobaltMachete, "Machete", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(workedCobaltMachete, "Machete", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(steelCobaltMachete, "Machete", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(cobaltCobaltMachete, "Machete", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(arditeCobaltMachete, "Machete", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(manyullynCobaltMachete, "Machete", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(uraniumCobaltMachete, "Machete", InfiMaterialEnum.Cobalt.getHarvestLevel());
        }
        
        if(PHInfiHybrids.enableArditeTools)
        {
        	woodArditeMachete = new InfiToolMachete(PHInfiHybrids.arditeMacheteID+0, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Wood, "woodArditeMachete");
            stoneArditeMachete = new InfiToolMachete(PHInfiHybrids.arditeMacheteID+1, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Stone, "stoneArditeMachete");
            ironArditeMachete = new InfiToolMachete(PHInfiHybrids.arditeMacheteID+2, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Iron, "ironArditeMachete");
            diamondArditeMachete = new InfiToolMachete(PHInfiHybrids.arditeMacheteID+3,
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Diamond, "diamondArditeMachete");
            redstoneArditeMachete = new InfiToolMachete(PHInfiHybrids.arditeMacheteID+4, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Redstone, "redstoneArditeMachete");
            obsidianArditeMachete = new InfiToolMachete(PHInfiHybrids.arditeMacheteID+5, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Obsidian, "obsidianArditeMachete");
            boneArditeMachete = new InfiToolMachete(PHInfiHybrids.arditeMacheteID+6,
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Bone, "boneArditeMachete");
            slimeArditeMachete = new InfiToolMachete(PHInfiHybrids.arditeMacheteID+7, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Slime, "slimeArditeMachete");
            cactusArditeMachete = new InfiToolMachete(PHInfiHybrids.arditeMacheteID+8, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Cactus, "cactusArditeMachete");
            blazeArditeMachete = new InfiToolMachete(PHInfiHybrids.arditeMacheteID+9, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Blaze, "blazeArditeMachete");
            copperArditeMachete = new InfiToolMachete(PHInfiHybrids.arditeMacheteID+10, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Copper, "copperArditeMachete");
            bronzeArditeMachete = new InfiToolMachete(PHInfiHybrids.arditeMacheteID+11, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Bronze, "bronzeArditeMachete");
            workedArditeMachete = new InfiToolMachete(PHInfiHybrids.arditeMacheteID+12, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.WorkedIron, "workedArditeMachete");
            steelArditeMachete = new InfiToolMachete(PHInfiHybrids.arditeMacheteID+13, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Steel, "steelArditeMachete");
            cobaltArditeMachete = new InfiToolMachete(PHInfiHybrids.arditeMacheteID+14, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Cobalt, "cobaltArditeMachete");
            arditeArditeMachete = new InfiToolMachete(PHInfiHybrids.arditeMacheteID+15, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Ardite, "arditeArditeMachete");
            manyullynArditeMachete = new InfiToolMachete(PHInfiHybrids.arditeMacheteID+16, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Manyullyn, "manyullynArditeMachete");
            uraniumArditeMachete = new InfiToolMachete(PHInfiHybrids.arditeMacheteID+17, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Uranium, "uraniumArditeMachete");
            
            MinecraftForge.setToolClass(woodArditeMachete, "Machete", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(stoneArditeMachete, "Machete", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(ironArditeMachete, "Machete", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(diamondArditeMachete, "Machete", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(redstoneArditeMachete, "Machete", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(obsidianArditeMachete, "Machete", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(boneArditeMachete, "Machete", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(slimeArditeMachete, "Machete", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(cactusArditeMachete, "Machete", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(blazeArditeMachete, "Machete", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(copperArditeMachete, "Machete", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(bronzeArditeMachete, "Machete", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(workedArditeMachete, "Machete", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(steelArditeMachete, "Machete", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(cobaltArditeMachete, "Machete", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(arditeArditeMachete, "Machete", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(manyullynArditeMachete, "Machete", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(uraniumArditeMachete, "Machete", InfiMaterialEnum.Ardite.getHarvestLevel());
        }
        
        if(PHInfiHybrids.enableManyullynTools)
        {
        	woodManyullynMachete = new InfiToolMachete(PHInfiHybrids.manyullynMacheteID+0, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Wood, "woodManyullynMachete");
            stoneManyullynMachete = new InfiToolMachete(PHInfiHybrids.manyullynMacheteID+1, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Stone, "stoneManyullynMachete");
            ironManyullynMachete = new InfiToolMachete(PHInfiHybrids.manyullynMacheteID+2, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Iron, "ironManyullynMachete");
            diamondManyullynMachete = new InfiToolMachete(PHInfiHybrids.manyullynMacheteID+3,
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Diamond, "diamondManyullynMachete");
            redstoneManyullynMachete = new InfiToolMachete(PHInfiHybrids.manyullynMacheteID+4, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Redstone, "redstoneManyullynMachete");
            obsidianManyullynMachete = new InfiToolMachete(PHInfiHybrids.manyullynMacheteID+5, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Obsidian, "obsidianManyullynMachete");
            boneManyullynMachete = new InfiToolMachete(PHInfiHybrids.manyullynMacheteID+6, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Bone, "boneManyullynMachete");
            slimeManyullynMachete = new InfiToolMachete(PHInfiHybrids.manyullynMacheteID+7, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Slime, "slimeManyullynMachete");
            cactusManyullynMachete = new InfiToolMachete(PHInfiHybrids.manyullynMacheteID+8, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Cactus, "cactusManyullynMachete");
            blazeManyullynMachete = new InfiToolMachete(PHInfiHybrids.manyullynMacheteID+9, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Blaze, "blazeManyullynMachete");
            copperManyullynMachete = new InfiToolMachete(PHInfiHybrids.manyullynMacheteID+10, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Copper, "copperManyullynMachete");
            bronzeManyullynMachete = new InfiToolMachete(PHInfiHybrids.manyullynMacheteID+11, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Bronze, "bronzeManyullynMachete");
            workedManyullynMachete = new InfiToolMachete(PHInfiHybrids.manyullynMacheteID+12, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.WorkedIron, "workedManyullynMachete");
            steelManyullynMachete = new InfiToolMachete(PHInfiHybrids.manyullynMacheteID+13, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Steel, "steelManyullynMachete");
            cobaltManyullynMachete = new InfiToolMachete(PHInfiHybrids.manyullynMacheteID+14, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Cobalt, "cobaltManyullynMachete");
            arditeManyullynMachete = new InfiToolMachete(PHInfiHybrids.manyullynMacheteID+15, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Ardite, "arditeManyullynMachete");
            manyullynManyullynMachete = new InfiToolMachete(PHInfiHybrids.manyullynMacheteID+16, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Manyullyn, "manyullynManyullynMachete");
            uraniumManyullynMachete = new InfiToolMachete(PHInfiHybrids.manyullynMacheteID+17,
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Uranium, "uraniumManyullynMachete");
            
            MinecraftForge.setToolClass(woodManyullynMachete, "Machete", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(stoneManyullynMachete, "Machete", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(ironManyullynMachete, "Machete", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(diamondManyullynMachete, "Machete", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(redstoneManyullynMachete, "Machete", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(obsidianManyullynMachete, "Machete", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(boneManyullynMachete, "Machete", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(slimeManyullynMachete, "Machete", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(cactusManyullynMachete, "Machete", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(blazeManyullynMachete, "Machete", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(copperManyullynMachete, "Machete", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(bronzeManyullynMachete, "Machete", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(workedManyullynMachete, "Machete", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(steelManyullynMachete, "Machete", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(cobaltManyullynMachete, "Machete", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(arditeManyullynMachete, "Machete", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(manyullynManyullynMachete, "Machete", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(uraniumManyullynMachete, "Machete", InfiMaterialEnum.Manyullyn.getHarvestLevel());
        }
        
        if(PHInfiHybrids.enableUraniumTools)
        {
            diamondUraniumMachete = new InfiToolMachete(PHInfiHybrids.uraniumMacheteID+0, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Diamond, "diamondUraniumMachete");
            redstoneUraniumMachete = new InfiToolMachete(PHInfiHybrids.uraniumMacheteID+1, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Redstone, "redstoneUraniumMachete");
            boneUraniumMachete = new InfiToolMachete(PHInfiHybrids.uraniumMacheteID+2, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Bone, "boneUraniumMachete");
            netherrackUraniumMachete = new InfiToolMachete(PHInfiHybrids.uraniumMacheteID+3, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Netherrack, "netherrackUraniumMachete");
            glowstoneUraniumMachete = new InfiToolMachete(PHInfiHybrids.uraniumMacheteID+4, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Glowstone, "glowstoneUraniumMachete");
            lavaUraniumMachete = new InfiToolMachete(PHInfiHybrids.uraniumMacheteID+5, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Lava, "lavaUraniumMachete");
            blazeUraniumMachete = new InfiToolMachete(PHInfiHybrids.uraniumMacheteID+6, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Blaze, "blazeUraniumMachete");
            cobaltUraniumMachete = new InfiToolMachete(PHInfiHybrids.uraniumMacheteID+7, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Cobalt, "cobaltUraniumMachete");
            arditeUraniumMachete = new InfiToolMachete(PHInfiHybrids.uraniumMacheteID+8, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Ardite, "arditeUraniumMachete");
            uraniumUraniumMachete = new InfiToolMachete(PHInfiHybrids.uraniumMacheteID+9, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Uranium, "uraniumUraniumMachete");
            
            MinecraftForge.setToolClass(diamondUraniumMachete, "Machete", InfiMaterialEnum.Uranium.getHarvestLevel());
            MinecraftForge.setToolClass(redstoneUraniumMachete, "Machete", InfiMaterialEnum.Uranium.getHarvestLevel());
            MinecraftForge.setToolClass(boneUraniumMachete, "Machete", InfiMaterialEnum.Uranium.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackUraniumMachete, "Machete", InfiMaterialEnum.Uranium.getHarvestLevel());
            MinecraftForge.setToolClass(glowstoneUraniumMachete, "Machete", InfiMaterialEnum.Uranium.getHarvestLevel());
            MinecraftForge.setToolClass(lavaUraniumMachete, "Machete", InfiMaterialEnum.Uranium.getHarvestLevel());
            MinecraftForge.setToolClass(blazeUraniumMachete, "Machete", InfiMaterialEnum.Uranium.getHarvestLevel());
            MinecraftForge.setToolClass(cobaltUraniumMachete, "Machete", InfiMaterialEnum.Uranium.getHarvestLevel());
            MinecraftForge.setToolClass(arditeUraniumMachete, "Machete", InfiMaterialEnum.Uranium.getHarvestLevel());
            MinecraftForge.setToolClass(uraniumUraniumMachete, "Machete", InfiMaterialEnum.Uranium.getHarvestLevel());
        }
    }
    
    private static void addNames()
    {
    	if(PHInfiHybrids.enableWoodTools)
            ModLoader.addName(woodWoodMachete, "Wooden Machete");
        if(PHInfiHybrids.enableStoneTools)
            ModLoader.addName(stoneStoneMachete, "Heavy Machete");
        if(PHInfiHybrids.enableIronTools)
            ModLoader.addName(ironIronMachete, "Ironic Machete");
        if(PHInfiHybrids.enableDiamondTools)
            ModLoader.addName(diamondDiamondMachete, "Diamondium Machete");
        if(PHInfiHybrids.enableRedstoneTools)
            ModLoader.addName(redstoneRedstoneMachete, "Redredred Machete");
        if(PHInfiHybrids.enableObsidianTools)
            ModLoader.addName(obsidianObsidianMachete, "Ebony Machete");
        if(PHInfiHybrids.enableSandstoneTools)
            ModLoader.addName(sandstoneSandstoneMachete, "Fragile Machete");
        if(PHInfiHybrids.enableNetherrackTools)
            ModLoader.addName(boneBoneMachete, "Necrotic Machete");
        if(PHInfiHybrids.enablePaperTools)
            ModLoader.addName(paperPaperMachete, "Soft Machete");
        if(PHInfiHybrids.enableMossyTools)
            ModLoader.addName(mossyMossyMachete, "Living Machete");
        if(PHInfiHybrids.enableNetherrackTools)
            ModLoader.addName(netherrackNetherrackMachete, "Bloodsoaked Machete");
        if(PHInfiHybrids.enableGlowstoneTools)
            ModLoader.addName(glowstoneGlowstoneMachete, "Bright Machete");
        if(PHInfiHybrids.enableIceTools)
            ModLoader.addName(iceIceMachete, "Freezing Machete");
        if(PHInfiHybrids.enableLavaTools)
            ModLoader.addName(lavaLavaMachete, "Burning Machete");
        if(PHInfiHybrids.enableSlimeTools)
            ModLoader.addName(slimeSlimeMachete, "Toy Machete");
        if(PHInfiHybrids.enableCactusTools)
            ModLoader.addName(cactusCactusMachete, "Thorned Machete");
        if(PHInfiHybrids.enableFlintTools)
            ModLoader.addName(flintFlintMachete, "Rough-hewn Machete");
        if(PHInfiHybrids.enableBlazeTools)
            ModLoader.addName(blazeBlazeMachete, "Netherite Machete");
        if(PHInfiHybrids.enableCopperTools)
            ModLoader.addName(copperCopperMachete, "Orange-Tang Machete");
        if(PHInfiHybrids.enableBronzeTools)
            ModLoader.addName(bronzeBronzeMachete, "Polished Machete");
        if(PHInfiHybrids.enableWorkedIronTools)
            ModLoader.addName(workedWorkedIronMachete, "Reworked Iron Machete");
        if(PHInfiHybrids.enableSteelTools)
            ModLoader.addName(steelSteelMachete, "Forge-Wrought Machete");
        if(PHInfiHybrids.enableCobaltTools)
            ModLoader.addName(cobaltCobaltMachete, "Beautiful Machete");
        if(PHInfiHybrids.enableArditeTools)
            ModLoader.addName(arditeArditeMachete, "Rustic Machete");
        if(PHInfiHybrids.enableManyullynTools)
            ModLoader.addName(manyullynManyullynMachete, "False-Prophetic Machete");
        if(PHInfiHybrids.enableUraniumTools)
            ModLoader.addName(uraniumUraniumMachete, "Cancerous Machete");
    }
    
    public static void registerInfiToolsRecipes()
    {
    	if(PHInfiHybrids.enableWoodTools)
        {
            ModLoader.addRecipe(new ItemStack(woodWoodMachete), new Object[] 
                    { recipe, '#', Block.planks, '|', Item.stick, 's', Item.stick });
            ModLoader.addRecipe(new ItemStack(sandstoneWoodMachete), new Object[] 
                    { recipe, '#', Block.planks, '|', InfiLibrary.sandstoneRod, 's', Item.stick });
            ModLoader.addRecipe(new ItemStack(boneWoodMachete), new Object[] 
                    { recipe, '#', Block.planks, '|', Item.bone, 's', Item.stick });
            ModLoader.addRecipe(new ItemStack(boneWoodMachete), new Object[] 
                    { recipe, '#', Block.planks, '|', InfiLibrary.boneRod, 's', Item.stick });
            ModLoader.addRecipe(new ItemStack(paperWoodMachete), new Object[] 
                    { recipe, '#', Block.planks, '|', InfiLibrary.paperRod, 's', Item.stick });
            ModLoader.addRecipe(new ItemStack(iceWoodMachete), new Object[] 
                    { recipe, '#', Block.planks, '|', InfiLibrary.iceRod, 's', Item.stick });
            ModLoader.addRecipe(new ItemStack(slimeWoodMachete), new Object[] 
                    { recipe, '#', Block.planks, '|', InfiLibrary.slimeRod, 's', Item.stick });
            ModLoader.addRecipe(new ItemStack(cactusWoodMachete), new Object[] 
                    { recipe, '#', Block.planks, '|', InfiLibrary.cactusRod, 's', Item.stick });
        }
    	
        if(PHInfiHybrids.enableStoneTools)
        {
        	ModLoader.addRecipe(new ItemStack(woodStoneMachete), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', Item.stick, 's', InfiLibrary.stoneShard });
        	ModLoader.addRecipe(new ItemStack(stoneStoneMachete), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', InfiLibrary.stoneRod, 's', InfiLibrary.stoneShard });
            ModLoader.addRecipe(new ItemStack(sandstoneStoneMachete), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', InfiLibrary.sandstoneRod, 's', InfiLibrary.stoneShard });
            ModLoader.addRecipe(new ItemStack(boneStoneMachete), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', Item.bone, 's', InfiLibrary.stoneShard });
            ModLoader.addRecipe(new ItemStack(boneStoneMachete), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', InfiLibrary.boneRod, 's', InfiLibrary.stoneShard });
            ModLoader.addRecipe(new ItemStack(netherrackStoneMachete), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', InfiLibrary.netherrackRod, 's', InfiLibrary.stoneShard });
            ModLoader.addRecipe(new ItemStack(iceStoneMachete), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', InfiLibrary.iceRod, 's', InfiLibrary.stoneShard });
            ModLoader.addRecipe(new ItemStack(slimeStoneMachete), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', InfiLibrary.slimeRod, 's', InfiLibrary.stoneShard });
            ModLoader.addRecipe(new ItemStack(cactusStoneMachete), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', InfiLibrary.cactusRod, 's', InfiLibrary.stoneShard });
            ModLoader.addRecipe(new ItemStack(flintStoneMachete), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', InfiLibrary.flintRod, 's', InfiLibrary.stoneShard });
            
            ModLoader.addRecipe(new ItemStack(woodStoneMachete), new Object[] 
                    { recipe, '#', Block.stone, '|', Item.stick, 's', InfiLibrary.stoneShard });
        	ModLoader.addRecipe(new ItemStack(stoneStoneMachete), new Object[] 
                    { recipe, '#', Block.stone, '|', InfiLibrary.stoneRod, 's', InfiLibrary.stoneShard });
            ModLoader.addRecipe(new ItemStack(sandstoneStoneMachete), new Object[] 
                    { recipe, '#', Block.stone, '|', InfiLibrary.sandstoneRod, 's', InfiLibrary.stoneShard });
            ModLoader.addRecipe(new ItemStack(boneStoneMachete), new Object[] 
                    { recipe, '#', Block.stone, '|', Item.bone, 's', InfiLibrary.stoneShard });
            ModLoader.addRecipe(new ItemStack(boneStoneMachete), new Object[] 
                    { recipe, '#', Block.stone, '|', InfiLibrary.boneRod, 's', InfiLibrary.stoneShard });
            ModLoader.addRecipe(new ItemStack(netherrackStoneMachete), new Object[] 
                    { recipe, '#', Block.stone, '|', InfiLibrary.netherrackRod, 's', InfiLibrary.stoneShard });
            ModLoader.addRecipe(new ItemStack(iceStoneMachete), new Object[] 
                    { recipe, '#', Block.stone, '|', InfiLibrary.iceRod, 's', InfiLibrary.stoneShard });
            ModLoader.addRecipe(new ItemStack(slimeStoneMachete), new Object[] 
                    { recipe, '#', Block.stone, '|', InfiLibrary.slimeRod, 's', InfiLibrary.stoneShard });
            ModLoader.addRecipe(new ItemStack(cactusStoneMachete), new Object[] 
                    { recipe, '#', Block.stone, '|', InfiLibrary.cactusRod, 's', InfiLibrary.stoneShard });
            ModLoader.addRecipe(new ItemStack(flintStoneMachete), new Object[] 
                    { recipe, '#', Block.stone, '|', InfiLibrary.flintRod, 's', InfiLibrary.stoneShard });
        }
        
        if(PHInfiHybrids.enableIronTools)
        {
        	ModLoader.addRecipe(new ItemStack(woodIronMachete), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', Item.stick, 's', InfiLibrary.ironChunk });
        	ModLoader.addRecipe(new ItemStack(stoneIronMachete), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', InfiLibrary.stoneRod, 's', InfiLibrary.ironChunk });
            ModLoader.addRecipe(new ItemStack(ironIronMachete), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', InfiLibrary.ironRod, 's', InfiLibrary.ironChunk });
            ModLoader.addRecipe(new ItemStack(boneIronMachete), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', Item.bone, 's', InfiLibrary.ironChunk });
            ModLoader.addRecipe(new ItemStack(boneIronMachete), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', InfiLibrary.boneRod, 's', InfiLibrary.ironChunk });
            ModLoader.addRecipe(new ItemStack(netherrackIronMachete), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', InfiLibrary.netherrackRod, 's', InfiLibrary.ironChunk });
            ModLoader.addRecipe(new ItemStack(glowstoneIronMachete), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', InfiLibrary.glowstoneRod, 's', InfiLibrary.ironChunk });
            ModLoader.addRecipe(new ItemStack(cactusIronMachete), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', InfiLibrary.cactusRod, 's', InfiLibrary.ironChunk });
            ModLoader.addRecipe(new ItemStack(copperIronMachete), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', InfiLibrary.copperRod, 's', InfiLibrary.ironChunk });
            ModLoader.addRecipe(new ItemStack(bronzeIronMachete), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', InfiLibrary.bronzeRod, 's', InfiLibrary.ironChunk });
        }
        
        if(PHInfiHybrids.enableDiamondTools)
        {
        	ModLoader.addRecipe(new ItemStack(woodDiamondMachete), new Object[] 
                    { recipe, '#', Item.diamond, '|', Item.stick, 's', InfiLibrary.diamondShard });
        	ModLoader.addRecipe(new ItemStack(stoneDiamondMachete), new Object[] 
                    { recipe, '#', Item.diamond, '|', InfiLibrary.stoneRod, 's', InfiLibrary.diamondShard });
            ModLoader.addRecipe(new ItemStack(ironDiamondMachete), new Object[] 
                    { recipe, '#', Item.diamond, '|', InfiLibrary.ironRod, 's', InfiLibrary.diamondShard });
            ModLoader.addRecipe(new ItemStack(diamondDiamondMachete), new Object[] 
                    { recipe, '#', Item.diamond, '|', InfiLibrary.diamondRod, 's', InfiLibrary.diamondShard });
            ModLoader.addRecipe(new ItemStack(redstoneDiamondMachete), new Object[] 
                    { recipe, '#', Item.diamond, '|', InfiLibrary.redstoneRod, 's', InfiLibrary.diamondShard });
            ModLoader.addRecipe(new ItemStack(obsidianDiamondMachete), new Object[] 
                    { recipe, '#', Item.diamond, '|', InfiLibrary.obsidianRod, 's', InfiLibrary.diamondShard });
            ModLoader.addRecipe(new ItemStack(boneDiamondMachete), new Object[] 
                    { recipe, '#', Item.diamond, '|', Item.bone, 's', InfiLibrary.diamondShard });
            ModLoader.addRecipe(new ItemStack(boneDiamondMachete), new Object[] 
                    { recipe, '#', Item.diamond, '|', InfiLibrary.boneRod, 's', InfiLibrary.diamondShard });
            ModLoader.addRecipe(new ItemStack(mossyDiamondMachete), new Object[] 
                    { recipe, '#', Item.diamond, '|', InfiLibrary.mossyRod, 's', InfiLibrary.diamondShard });
            ModLoader.addRecipe(new ItemStack(netherrackDiamondMachete), new Object[] 
                    { recipe, '#', Item.diamond, '|', InfiLibrary.netherrackRod, 's', InfiLibrary.diamondShard });
            ModLoader.addRecipe(new ItemStack(glowstoneDiamondMachete), new Object[] 
                    { recipe, '#', Item.diamond, '|', InfiLibrary.glowstoneRod, 's', InfiLibrary.diamondShard });
            ModLoader.addRecipe(new ItemStack(lavaDiamondMachete), new Object[] 
                    { recipe, '#', Item.diamond, '|', InfiLibrary.lavaRod, 's', InfiLibrary.diamondShard });
            ModLoader.addRecipe(new ItemStack(cactusDiamondMachete), new Object[] 
                    { recipe, '#', Item.diamond, '|', InfiLibrary.cactusRod, 's', InfiLibrary.diamondShard });
            ModLoader.addRecipe(new ItemStack(flintDiamondMachete), new Object[] 
                    { recipe, '#', Item.diamond, '|', InfiLibrary.flintRod, 's', InfiLibrary.diamondShard });
            ModLoader.addRecipe(new ItemStack(blazeDiamondMachete), new Object[] 
                    { recipe, '#', Item.diamond, '|', Item.blazeRod, 's', InfiLibrary.diamondShard });
            ModLoader.addRecipe(new ItemStack(copperDiamondMachete), new Object[] 
                    { recipe, '#', Item.diamond, '|', InfiLibrary.copperRod, 's', InfiLibrary.diamondShard });
            ModLoader.addRecipe(new ItemStack(bronzeDiamondMachete), new Object[] 
                    { recipe, '#', Item.diamond, '|', InfiLibrary.bronzeRod, 's', InfiLibrary.diamondShard });
            ModLoader.addRecipe(new ItemStack(workedDiamondMachete), new Object[] 
                    { recipe, '#', Item.diamond, '|', InfiLibrary.workedIronRod, 's', InfiLibrary.diamondShard });
            ModLoader.addRecipe(new ItemStack(steelDiamondMachete), new Object[] 
                    { recipe, '#', Item.diamond, '|', InfiLibrary.steelRod, 's', InfiLibrary.diamondShard });
            ModLoader.addRecipe(new ItemStack(cobaltDiamondMachete), new Object[] 
                    { recipe, '#', Item.diamond, '|', InfiLibrary.cobaltRod, 's', InfiLibrary.diamondShard });
            ModLoader.addRecipe(new ItemStack(arditeDiamondMachete), new Object[] 
                    { recipe, '#', Item.diamond, '|', InfiLibrary.arditeRod, 's', InfiLibrary.diamondShard });
            ModLoader.addRecipe(new ItemStack(manyullynDiamondMachete), new Object[] 
                    { recipe, '#', Item.diamond, '|', InfiLibrary.manyullynRod, 's', InfiLibrary.diamondShard });
            ModLoader.addRecipe(new ItemStack(uraniumDiamondMachete), new Object[] 
                    { recipe, '#', Item.diamond, '|', InfiLibrary.uraniumRod, 's', InfiLibrary.diamondShard });
        }
        
        if(PHInfiHybrids.enableRedstoneTools)
        {
        	ModLoader.addRecipe(new ItemStack(woodRedstoneMachete), new Object[] 
                    { recipe, '#', InfiLibrary.redstoneCrystal, '|', Item.stick, 's', InfiLibrary.redstoneFragment });
        	ModLoader.addRecipe(new ItemStack(stoneRedstoneMachete), new Object[] 
                    { recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.stoneRod, 's', InfiLibrary.redstoneFragment });
            ModLoader.addRecipe(new ItemStack(ironRedstoneMachete), new Object[] 
                    { recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.ironRod, 's', InfiLibrary.redstoneFragment });
            ModLoader.addRecipe(new ItemStack(redstoneRedstoneMachete), new Object[] 
                    { recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.redstoneRod, 's', InfiLibrary.redstoneFragment });
            ModLoader.addRecipe(new ItemStack(obsidianRedstoneMachete), new Object[] 
                    { recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.obsidianRod, 's', InfiLibrary.redstoneFragment });
            ModLoader.addRecipe(new ItemStack(sandstoneRedstoneMachete), new Object[] 
                    { recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.sandstoneRod, 's', InfiLibrary.redstoneFragment });
            ModLoader.addRecipe(new ItemStack(boneRedstoneMachete), new Object[] 
                    { recipe, '#', InfiLibrary.redstoneCrystal, '|', Item.bone, 's', InfiLibrary.redstoneFragment });
            ModLoader.addRecipe(new ItemStack(boneRedstoneMachete), new Object[] 
                    { recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.boneRod, 's', InfiLibrary.redstoneFragment });
            ModLoader.addRecipe(new ItemStack(paperRedstoneMachete), new Object[] 
                    { recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.paperRod, 's', InfiLibrary.redstoneFragment });
            ModLoader.addRecipe(new ItemStack(mossyRedstoneMachete), new Object[] 
                    { recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.mossyRod, 's', InfiLibrary.redstoneFragment });
            ModLoader.addRecipe(new ItemStack(netherrackRedstoneMachete), new Object[] 
                    { recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.netherrackRod, 's', InfiLibrary.redstoneFragment });
            ModLoader.addRecipe(new ItemStack(glowstoneRedstoneMachete), new Object[] 
                    { recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.glowstoneRod, 's', InfiLibrary.redstoneFragment });
            ModLoader.addRecipe(new ItemStack(iceRedstoneMachete), new Object[] 
                    { recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.iceRod, 's', InfiLibrary.redstoneFragment });
            ModLoader.addRecipe(new ItemStack(lavaRedstoneMachete), new Object[] 
                    { recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.lavaRod, 's', InfiLibrary.redstoneFragment });
            ModLoader.addRecipe(new ItemStack(slimeRedstoneMachete), new Object[] 
                    { recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.slimeRod, 's', InfiLibrary.redstoneFragment });
            ModLoader.addRecipe(new ItemStack(cactusRedstoneMachete), new Object[] 
                    { recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.cactusRod, 's', InfiLibrary.redstoneFragment });
            ModLoader.addRecipe(new ItemStack(flintRedstoneMachete), new Object[] 
                    { recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.flintRod, 's', InfiLibrary.redstoneFragment });
            ModLoader.addRecipe(new ItemStack(copperRedstoneMachete), new Object[] 
                    { recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.copperRod, 's', InfiLibrary.redstoneFragment });
            ModLoader.addRecipe(new ItemStack(bronzeRedstoneMachete), new Object[] 
                    { recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.bronzeRod, 's', InfiLibrary.redstoneFragment });
            ModLoader.addRecipe(new ItemStack(workedRedstoneMachete), new Object[] 
                    { recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.workedIronRod, 's', InfiLibrary.redstoneFragment });
            ModLoader.addRecipe(new ItemStack(uraniumRedstoneMachete), new Object[] 
                    { recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.uraniumRod, 's', InfiLibrary.redstoneFragment });
        }
        
        if(PHInfiHybrids.enableObsidianTools)
        {
        	ModLoader.addRecipe(new ItemStack(woodObsidianMachete), new Object[] 
                    { recipe, '#', Block.obsidian, '|', Item.stick, 's', InfiLibrary.obsidianShard });
        	ModLoader.addRecipe(new ItemStack(stoneObsidianMachete), new Object[] 
                    { recipe, '#', Block.obsidian, '|', InfiLibrary.stoneRod, 's', InfiLibrary.obsidianShard });
            ModLoader.addRecipe(new ItemStack(redstoneObsidianMachete), new Object[] 
                    { recipe, '#', Block.obsidian, '|', InfiLibrary.redstoneRod, 's', InfiLibrary.obsidianShard });
            ModLoader.addRecipe(new ItemStack(obsidianObsidianMachete), new Object[] 
                    { recipe, '#', Block.obsidian, '|', InfiLibrary.obsidianRod, 's', InfiLibrary.obsidianShard });
            ModLoader.addRecipe(new ItemStack(boneObsidianMachete), new Object[] 
                    { recipe, '#', Block.obsidian, '|', Item.bone, 's', InfiLibrary.obsidianShard });
            ModLoader.addRecipe(new ItemStack(boneObsidianMachete), new Object[] 
                    { recipe, '#', Block.obsidian, '|', InfiLibrary.boneRod, 's', InfiLibrary.obsidianShard });
            ModLoader.addRecipe(new ItemStack(netherrackObsidianMachete), new Object[] 
                    { recipe, '#', Block.obsidian, '|', InfiLibrary.netherrackRod, 's', InfiLibrary.obsidianShard });
            ModLoader.addRecipe(new ItemStack(glowstoneObsidianMachete), new Object[] 
                    { recipe, '#', Block.obsidian, '|', InfiLibrary.glowstoneRod, 's', InfiLibrary.obsidianShard });
            ModLoader.addRecipe(new ItemStack(iceObsidianMachete), new Object[] 
                    { recipe, '#', Block.obsidian, '|', InfiLibrary.iceRod, 's', InfiLibrary.obsidianShard });
            ModLoader.addRecipe(new ItemStack(lavaObsidianMachete), new Object[] 
                    { recipe, '#', Block.obsidian, '|', InfiLibrary.lavaRod, 's', InfiLibrary.obsidianShard });
            ModLoader.addRecipe(new ItemStack(cactusObsidianMachete), new Object[] 
                    { recipe, '#', Block.obsidian, '|', InfiLibrary.cactusRod, 's', InfiLibrary.obsidianShard });
        }
        
        if(PHInfiHybrids.enableSandstoneTools)
        {
            ModLoader.addRecipe(new ItemStack(woodSandstoneMachete), new Object[] 
                    { recipe, '#', Block.sandStone, '|', Item.stick, 's', InfiLibrary.sandstoneShard });
            ModLoader.addRecipe(new ItemStack(sandstoneSandstoneMachete), new Object[] 
                    { recipe, '#', Block.sandStone, '|', InfiLibrary.sandstoneRod, 's', InfiLibrary.sandstoneShard });
            ModLoader.addRecipe(new ItemStack(boneSandstoneMachete), new Object[] 
                    { recipe, '#', Block.sandStone, '|', Item.bone, 's', InfiLibrary.sandstoneShard });
            ModLoader.addRecipe(new ItemStack(boneSandstoneMachete), new Object[] 
                    { recipe, '#', Block.sandStone, '|', InfiLibrary.boneRod, 's', InfiLibrary.sandstoneShard });      
            ModLoader.addRecipe(new ItemStack(netherrackSandstoneMachete), new Object[] 
                    { recipe, '#', Block.sandStone, '|', InfiLibrary.netherrackRod, 's', InfiLibrary.sandstoneShard });
            ModLoader.addRecipe(new ItemStack(iceSandstoneMachete), new Object[] 
                    { recipe, '#', Block.sandStone, '|', InfiLibrary.iceRod, 's', InfiLibrary.sandstoneShard });
            ModLoader.addRecipe(new ItemStack(slimeSandstoneMachete), new Object[] 
                    { recipe, '#', Block.sandStone, '|', InfiLibrary.slimeRod, 's', InfiLibrary.sandstoneShard });
            ModLoader.addRecipe(new ItemStack(cactusSandstoneMachete), new Object[] 
                    { recipe, '#', Block.sandStone, '|', InfiLibrary.cactusRod, 's', InfiLibrary.sandstoneShard });
            ModLoader.addRecipe(new ItemStack(flintSandstoneMachete), new Object[] 
                    { recipe, '#', Block.sandStone, '|', InfiLibrary.flintRod, 's', InfiLibrary.sandstoneShard });
        }
        
        if(PHInfiHybrids.enableBoneTools)
        {
            ModLoader.addRecipe(new ItemStack(woodBoneMachete), new Object[] 
                    { recipe, '#', Item.bone, '|', Item.stick, 's', new ItemStack(Item.dyePowder, 1, 15) });
            ModLoader.addRecipe(new ItemStack(stoneBoneMachete), new Object[] 
                    { recipe, '#', Item.bone, '|', InfiLibrary.stoneRod, 's', new ItemStack(Item.dyePowder, 1, 15) });
            ModLoader.addRecipe(new ItemStack(sandstoneBoneMachete), new Object[] 
                    { recipe, '#', Item.bone, '|', InfiLibrary.sandstoneRod, 's', new ItemStack(Item.dyePowder, 1, 15) });
            ModLoader.addRecipe(new ItemStack(boneBoneMachete), new Object[] 
                    { recipe, '#', Item.bone, '|', Item.bone, 's', new ItemStack(Item.dyePowder, 1, 15) });
            ModLoader.addRecipe(new ItemStack(boneBoneMachete), new Object[] 
                    { recipe, '#', Item.bone, '|', InfiLibrary.boneRod, 's', new ItemStack(Item.dyePowder, 1, 15) });
            ModLoader.addRecipe(new ItemStack(paperBoneMachete), new Object[] 
                    { recipe, '#', Item.bone, '|', InfiLibrary.paperRod, 's', new ItemStack(Item.dyePowder, 1, 15) });
            ModLoader.addRecipe(new ItemStack(netherrackBoneMachete), new Object[] 
                    { recipe, '#', Item.bone, '|', InfiLibrary.netherrackRod, 's', new ItemStack(Item.dyePowder, 1, 15) });
            ModLoader.addRecipe(new ItemStack(iceBoneMachete), new Object[] 
                    { recipe, '#', Item.bone, '|', InfiLibrary.iceRod, 's', new ItemStack(Item.dyePowder, 1, 15) });
            ModLoader.addRecipe(new ItemStack(cactusBoneMachete), new Object[] 
                    { recipe, '#', Item.bone, '|', InfiLibrary.cactusRod, 's', new ItemStack(Item.dyePowder, 1, 15) });
            ModLoader.addRecipe(new ItemStack(flintBoneMachete), new Object[] 
                    { recipe, '#', Item.bone, '|', InfiLibrary.flintRod, 's', new ItemStack(Item.dyePowder, 1, 15) });
        }
        
        if(PHInfiHybrids.enablePaperTools)
        {
            ModLoader.addRecipe(new ItemStack(woodPaperMachete), new Object[] 
                    { recipe, '#', InfiLibrary.paperStack, '|', Item.stick, 's', Item.paper });
            ModLoader.addRecipe(new ItemStack(bonePaperMachete), new Object[] 
                    { recipe, '#', InfiLibrary.paperStack, '|', Item.bone, 's', Item.paper });
            ModLoader.addRecipe(new ItemStack(bonePaperMachete), new Object[] 
                    { recipe, '#', InfiLibrary.paperStack, '|', InfiLibrary.boneRod, 's', Item.paper });
            ModLoader.addRecipe(new ItemStack(paperPaperMachete), new Object[] 
                    { recipe, '#', InfiLibrary.paperStack, '|', InfiLibrary.paperRod, 's', Item.paper });
            ModLoader.addRecipe(new ItemStack(slimePaperMachete), new Object[] 
                    { recipe, '#', InfiLibrary.paperStack, '|', InfiLibrary.slimeRod, 's', Item.paper });
            ModLoader.addRecipe(new ItemStack(cactusPaperMachete), new Object[] 
                    { recipe, '#', InfiLibrary.paperStack, '|', InfiLibrary.cactusRod, 's', Item.paper });
        }
        
        if(PHInfiHybrids.enableMossyTools)
        {
        	ModLoader.addRecipe(new ItemStack(woodMossyMachete), new Object[] 
                    { recipe, '#', InfiLibrary.mossyStone, '|', Item.stick, 's', InfiLibrary.mossyPatch });
        	ModLoader.addRecipe(new ItemStack(stoneMossyMachete), new Object[] 
                    { recipe, '#', InfiLibrary.mossyStone, '|', InfiLibrary.stoneRod, 's', InfiLibrary.mossyPatch });
            ModLoader.addRecipe(new ItemStack(diamondMossyMachete), new Object[] 
                    { recipe, '#', InfiLibrary.mossyStone, '|', InfiLibrary.diamondRod, 's', InfiLibrary.mossyPatch });
            ModLoader.addRecipe(new ItemStack(redstoneMossyMachete), new Object[] 
                    { recipe, '#', InfiLibrary.mossyStone, '|', InfiLibrary.redstoneRod, 's', InfiLibrary.mossyPatch });
            ModLoader.addRecipe(new ItemStack(boneMossyMachete), new Object[] 
                    { recipe, '#', InfiLibrary.mossyStone, '|', Item.bone, 's', InfiLibrary.mossyPatch });
            ModLoader.addRecipe(new ItemStack(boneMossyMachete), new Object[] 
                    { recipe, '#', InfiLibrary.mossyStone, '|', InfiLibrary.boneRod, 's', InfiLibrary.mossyPatch });
            ModLoader.addRecipe(new ItemStack(mossyMossyMachete), new Object[] 
                    { recipe, '#', InfiLibrary.mossyStone, '|', InfiLibrary.mossyRod, 's', InfiLibrary.mossyPatch });
            ModLoader.addRecipe(new ItemStack(netherrackMossyMachete), new Object[] 
                    { recipe, '#', InfiLibrary.mossyStone, '|', InfiLibrary.netherrackRod, 's', InfiLibrary.mossyPatch });
            ModLoader.addRecipe(new ItemStack(glowstoneMossyMachete), new Object[] 
                    { recipe, '#', InfiLibrary.mossyStone, '|', InfiLibrary.glowstoneRod, 's', InfiLibrary.mossyPatch });
            ModLoader.addRecipe(new ItemStack(cactusMossyMachete), new Object[] 
                    { recipe, '#', InfiLibrary.mossyStone, '|', InfiLibrary.cactusRod, 's', InfiLibrary.mossyPatch });
            ModLoader.addRecipe(new ItemStack(blazeMossyMachete), new Object[] 
                    { recipe, '#', InfiLibrary.mossyStone, '|', Item.blazeRod, 's', InfiLibrary.mossyPatch });
            ModLoader.addRecipe(new ItemStack(manyullynMossyMachete), new Object[] 
                    { recipe, '#', InfiLibrary.mossyStone, '|', InfiLibrary.manyullynRod, 's', InfiLibrary.mossyPatch });
            ModLoader.addRecipe(new ItemStack(uraniumMossyMachete), new Object[] 
                    { recipe, '#', InfiLibrary.mossyStone, '|', InfiLibrary.uraniumRod, 's', InfiLibrary.mossyPatch });
        }
        
        if(PHInfiHybrids.enableNetherrackTools)
        {
        	ModLoader.addRecipe(new ItemStack(woodNetherrackMachete), new Object[] 
                    { recipe, '#', Block.netherrack, '|', Item.stick, 's', InfiLibrary.netherrackShard });
        	ModLoader.addRecipe(new ItemStack(stoneNetherrackMachete), new Object[] 
                    { recipe, '#', Block.netherrack, '|', InfiLibrary.stoneRod, 's', InfiLibrary.netherrackShard });
            ModLoader.addRecipe(new ItemStack(sandstoneNetherrackMachete), new Object[] 
                    { recipe, '#', Block.netherrack, '|', InfiLibrary.sandstoneRod, 's', InfiLibrary.netherrackShard });
            ModLoader.addRecipe(new ItemStack(boneNetherrackMachete), new Object[] 
                    { recipe, '#', Block.netherrack, '|', Item.bone, 's', InfiLibrary.netherrackShard });
            ModLoader.addRecipe(new ItemStack(boneNetherrackMachete), new Object[] 
                    { recipe, '#', Block.netherrack, '|', InfiLibrary.boneRod, 's', InfiLibrary.netherrackShard });
            ModLoader.addRecipe(new ItemStack(paperNetherrackMachete), new Object[] 
                    { recipe, '#', Block.netherrack, '|', InfiLibrary.paperRod, 's', InfiLibrary.netherrackShard });
            ModLoader.addRecipe(new ItemStack(mossyNetherrackMachete), new Object[] 
                    { recipe, '#', Block.netherrack, '|', InfiLibrary.mossyRod, 's', InfiLibrary.netherrackShard });
            ModLoader.addRecipe(new ItemStack(netherrackNetherrackMachete), new Object[] 
                    { recipe, '#', Block.netherrack, '|', InfiLibrary.netherrackRod, 's', InfiLibrary.netherrackShard });
            ModLoader.addRecipe(new ItemStack(iceNetherrackMachete), new Object[] 
                    { recipe, '#', Block.netherrack, '|', InfiLibrary.iceRod, 's', InfiLibrary.netherrackShard });
            ModLoader.addRecipe(new ItemStack(slimeNetherrackMachete), new Object[] 
                    { recipe, '#', Block.netherrack, '|', InfiLibrary.slimeRod, 's', InfiLibrary.netherrackShard });
            ModLoader.addRecipe(new ItemStack(cactusNetherrackMachete), new Object[] 
                    { recipe, '#', Block.netherrack, '|', InfiLibrary.cactusRod, 's', InfiLibrary.netherrackShard });
            ModLoader.addRecipe(new ItemStack(flintNetherrackMachete), new Object[] 
                    { recipe, '#', Block.netherrack, '|', InfiLibrary.flintRod, 's', InfiLibrary.netherrackShard });
            ModLoader.addRecipe(new ItemStack(copperNetherrackMachete), new Object[] 
                    { recipe, '#', Block.netherrack, '|', InfiLibrary.copperRod, 's', InfiLibrary.netherrackShard });
            ModLoader.addRecipe(new ItemStack(bronzeNetherrackMachete), new Object[] 
                    { recipe, '#', Block.netherrack, '|', InfiLibrary.bronzeRod, 's', InfiLibrary.netherrackShard });
        }
        
        if(PHInfiHybrids.enableGlowstoneTools)
        {
        	ModLoader.addRecipe(new ItemStack(woodGlowstoneMachete), new Object[] 
                    { recipe, '#', InfiLibrary.glowstoneCrystal, '|', Item.stick, 's', InfiLibrary.glowstoneFragment });
        	ModLoader.addRecipe(new ItemStack(redstoneGlowstoneMachete), new Object[] 
                    { recipe, '#', InfiLibrary.glowstoneCrystal, '|', InfiLibrary.glowstoneRod, 's', InfiLibrary.glowstoneFragment });
        	ModLoader.addRecipe(new ItemStack(obsidianGlowstoneMachete), new Object[] 
                    { recipe, '#', InfiLibrary.glowstoneCrystal, '|', InfiLibrary.obsidianRod, 's', InfiLibrary.glowstoneFragment });
            ModLoader.addRecipe(new ItemStack(boneGlowstoneMachete), new Object[] 
                    { recipe, '#', InfiLibrary.glowstoneCrystal, '|', Item.bone, 's', InfiLibrary.glowstoneFragment });
            ModLoader.addRecipe(new ItemStack(boneGlowstoneMachete), new Object[] 
                    { recipe, '#', InfiLibrary.glowstoneCrystal, '|', InfiLibrary.boneRod, 's', InfiLibrary.glowstoneFragment });
            ModLoader.addRecipe(new ItemStack(netherrackGlowstoneMachete), new Object[] 
                    { recipe, '#', InfiLibrary.glowstoneCrystal, '|', InfiLibrary.netherrackRod, 's', InfiLibrary.glowstoneFragment });
            ModLoader.addRecipe(new ItemStack(glowstoneGlowstoneMachete), new Object[] 
                    { recipe, '#', InfiLibrary.glowstoneCrystal, '|', InfiLibrary.glowstoneRod, 's', InfiLibrary.glowstoneFragment });
            ModLoader.addRecipe(new ItemStack(iceGlowstoneMachete), new Object[] 
                    { recipe, '#', InfiLibrary.glowstoneCrystal, '|', InfiLibrary.iceRod, 's', InfiLibrary.glowstoneFragment });
            ModLoader.addRecipe(new ItemStack(slimeGlowstoneMachete), new Object[] 
                    { recipe, '#', InfiLibrary.glowstoneCrystal, '|', InfiLibrary.slimeRod, 's', InfiLibrary.glowstoneFragment });
            ModLoader.addRecipe(new ItemStack(cactusGlowstoneMachete), new Object[] 
                    { recipe, '#', InfiLibrary.glowstoneCrystal, '|', InfiLibrary.cactusRod, 's', InfiLibrary.glowstoneFragment });
        }
        
        if(PHInfiHybrids.enableIceTools)
        {
            ModLoader.addRecipe(new ItemStack(woodIceMachete), new Object[] 
                    { recipe, '#', Block.ice, '|', Item.stick, 's', InfiLibrary.iceShard });
            ModLoader.addRecipe(new ItemStack(boneIceMachete), new Object[] 
                    { recipe, '#', Block.ice, '|', Item.bone, 's', InfiLibrary.iceShard });
            ModLoader.addRecipe(new ItemStack(boneIceMachete), new Object[] 
                    { recipe, '#', Block.ice, '|', InfiLibrary.boneRod, 's', InfiLibrary.iceShard });
            ModLoader.addRecipe(new ItemStack(paperIceMachete), new Object[] 
                    { recipe, '#', Block.ice, '|', InfiLibrary.paperRod, 's', InfiLibrary.iceShard });
            ModLoader.addRecipe(new ItemStack(iceIceMachete), new Object[] 
                    { recipe, '#', Block.ice, '|', InfiLibrary.iceRod, 's', InfiLibrary.iceShard });
            ModLoader.addRecipe(new ItemStack(slimeIceMachete), new Object[] 
                    { recipe, '#', Block.ice, '|', InfiLibrary.slimeRod, 's', InfiLibrary.iceShard });
            ModLoader.addRecipe(new ItemStack(cactusIceMachete), new Object[] 
                    { recipe, '#', Block.ice, '|', InfiLibrary.cactusRod, 's', InfiLibrary.iceShard });
        }
        
        if(PHInfiHybrids.enableLavaTools)
        {
            ModLoader.addRecipe(new ItemStack(diamondLavaMachete), new Object[] 
                    { recipe, '#', InfiLibrary.lavaCrystal, '|', InfiLibrary.diamondRod, 's', InfiLibrary.lavaFragment });
            ModLoader.addRecipe(new ItemStack(obsidianLavaMachete), new Object[] 
                    { recipe, '#', InfiLibrary.lavaCrystal, '|', InfiLibrary.obsidianRod, 's', InfiLibrary.lavaFragment });
            ModLoader.addRecipe(new ItemStack(netherrackLavaMachete), new Object[] 
                    { recipe, '#', InfiLibrary.lavaCrystal, '|', InfiLibrary.netherrackRod, 's', InfiLibrary.lavaFragment });
            ModLoader.addRecipe(new ItemStack(lavaLavaMachete), new Object[] 
                    { recipe, '#', InfiLibrary.lavaCrystal, '|', InfiLibrary.lavaRod, 's', InfiLibrary.lavaFragment });
            ModLoader.addRecipe(new ItemStack(flintLavaMachete), new Object[] 
                    { recipe, '#', InfiLibrary.lavaCrystal, '|', InfiLibrary.flintRod, 's', InfiLibrary.lavaFragment });
            ModLoader.addRecipe(new ItemStack(blazeLavaMachete), new Object[] 
                    { recipe, '#', InfiLibrary.lavaCrystal, '|', Item.blazeRod, 's', InfiLibrary.lavaFragment });
            ModLoader.addRecipe(new ItemStack(manyullynLavaMachete), new Object[] 
                    { recipe, '#', InfiLibrary.lavaCrystal, '|', InfiLibrary.manyullynRod, 's', InfiLibrary.lavaFragment });
            ModLoader.addRecipe(new ItemStack(uraniumLavaMachete), new Object[] 
                    { recipe, '#', InfiLibrary.lavaCrystal, '|', InfiLibrary.uraniumRod, 's', InfiLibrary.lavaFragment });
        }
        
        if(PHInfiHybrids.enableSlimeTools)
        {
            ModLoader.addRecipe(new ItemStack(woodSlimeMachete), new Object[] 
                    { recipe, '#', InfiLibrary.slimeCrystal, '|', Item.stick, 's', Item.slimeBall });
            ModLoader.addRecipe(new ItemStack(sandstoneSlimeMachete), new Object[] 
                    { recipe, '#', InfiLibrary.slimeCrystal, '|', InfiLibrary.sandstoneRod, 's', Item.slimeBall });
            ModLoader.addRecipe(new ItemStack(boneSlimeMachete), new Object[] 
                    { recipe, '#', InfiLibrary.slimeCrystal, '|', Item.bone, 's', Item.slimeBall });
            ModLoader.addRecipe(new ItemStack(boneSlimeMachete), new Object[] 
                    { recipe, '#', InfiLibrary.slimeCrystal, '|', InfiLibrary.boneRod, 's', Item.slimeBall });
            ModLoader.addRecipe(new ItemStack(paperSlimeMachete), new Object[] 
                    { recipe, '#', InfiLibrary.slimeCrystal, '|', InfiLibrary.paperRod, 's', Item.slimeBall });
            ModLoader.addRecipe(new ItemStack(slimeSlimeMachete), new Object[] 
                    { recipe, '#', InfiLibrary.slimeCrystal, '|', InfiLibrary.slimeRod, 's', Item.slimeBall });
            ModLoader.addRecipe(new ItemStack(cactusSlimeMachete), new Object[] 
                    { recipe, '#', InfiLibrary.slimeCrystal, '|', InfiLibrary.cactusRod, 's', Item.slimeBall });
        }
        
        if(PHInfiHybrids.enableCactusTools)
        {
            ModLoader.addRecipe(new ItemStack(woodCactusMachete), new Object[] 
                    { recipe, '#', Block.cactus, '|', Item.stick, 's', InfiLibrary.cactusShard });
            ModLoader.addRecipe(new ItemStack(sandstoneCactusMachete), new Object[] 
                    { recipe, '#', Block.cactus, '|', InfiLibrary.sandstoneRod, 's', InfiLibrary.cactusShard });
            ModLoader.addRecipe(new ItemStack(boneCactusMachete), new Object[] 
                    { recipe, '#', Block.cactus, '|', Item.bone, 's', InfiLibrary.cactusShard });
            ModLoader.addRecipe(new ItemStack(boneCactusMachete), new Object[] 
                    { recipe, '#', Block.cactus, '|', InfiLibrary.boneRod, 's', InfiLibrary.cactusShard });
            ModLoader.addRecipe(new ItemStack(netherrackCactusMachete), new Object[] 
                    { recipe, '#', Block.cactus, '|', InfiLibrary.netherrackRod, 's', InfiLibrary.cactusShard });
            ModLoader.addRecipe(new ItemStack(iceCactusMachete), new Object[] 
                    { recipe, '#', Block.cactus, '|', InfiLibrary.iceRod, 's', InfiLibrary.cactusShard });
            ModLoader.addRecipe(new ItemStack(slimeCactusMachete), new Object[] 
                    { recipe, '#', Block.cactus, '|', InfiLibrary.slimeRod, 's', InfiLibrary.cactusShard });
            ModLoader.addRecipe(new ItemStack(cactusCactusMachete), new Object[] 
                    { recipe, '#', Block.cactus, '|', InfiLibrary.cactusRod, 's', InfiLibrary.cactusShard });
        }
        
        if(PHInfiHybrids.enableFlintTools)
        {
        	ModLoader.addRecipe(new ItemStack(woodFlintMachete), new Object[] 
                    { recipe, '#', Item.flint, '|', Item.stick, 's', InfiLibrary.flintShard });
        	ModLoader.addRecipe(new ItemStack(stoneFlintMachete), new Object[] 
                    { recipe, '#', Item.flint, '|', InfiLibrary.stoneRod, 's', InfiLibrary.flintShard });
            ModLoader.addRecipe(new ItemStack(sandstoneFlintMachete), new Object[] 
                    { recipe, '#', Item.flint, '|', InfiLibrary.sandstoneRod, 's', InfiLibrary.flintShard });
            ModLoader.addRecipe(new ItemStack(boneFlintMachete), new Object[] 
                    { recipe, '#', Item.flint, '|', Item.bone, 's', InfiLibrary.flintShard });
            ModLoader.addRecipe(new ItemStack(boneFlintMachete), new Object[] 
                    { recipe, '#', Item.flint, '|', InfiLibrary.boneRod, 's', InfiLibrary.flintShard });
            ModLoader.addRecipe(new ItemStack(netherrackFlintMachete), new Object[] 
                    { recipe, '#', Item.flint, '|', InfiLibrary.netherrackRod, 's', InfiLibrary.flintShard });
            ModLoader.addRecipe(new ItemStack(slimeFlintMachete), new Object[] 
                    { recipe, '#', Item.flint, '|', InfiLibrary.slimeRod, 's', InfiLibrary.flintShard });
            ModLoader.addRecipe(new ItemStack(cactusFlintMachete), new Object[] 
                    { recipe, '#', Item.flint, '|', InfiLibrary.cactusRod, 's', InfiLibrary.flintShard });
            ModLoader.addRecipe(new ItemStack(flintFlintMachete), new Object[] 
                    { recipe, '#', Item.flint, '|', InfiLibrary.flintRod, 's', InfiLibrary.flintShard });
            ModLoader.addRecipe(new ItemStack(copperFlintMachete), new Object[] 
                    { recipe, '#', Item.flint, '|', InfiLibrary.copperRod, 's', InfiLibrary.flintShard });
            ModLoader.addRecipe(new ItemStack(bronzeFlintMachete), new Object[] 
                    { recipe, '#', Item.flint, '|', InfiLibrary.bronzeRod, 's', InfiLibrary.flintShard });
        }
        
        if(PHInfiHybrids.enableBlazeTools)
        {
            ModLoader.addRecipe(new ItemStack(diamondBlazeMachete), new Object[] 
                    { recipe, '#', InfiLibrary.blazeCrystal, '|', InfiLibrary.diamondRod, 's', InfiLibrary.blazeFragment });
            ModLoader.addRecipe(new ItemStack(obsidianBlazeMachete), new Object[] 
                    { recipe, '#', InfiLibrary.blazeCrystal, '|', InfiLibrary.obsidianRod, 's', InfiLibrary.blazeFragment });
            ModLoader.addRecipe(new ItemStack(netherrackBlazeMachete), new Object[] 
                    { recipe, '#', InfiLibrary.blazeCrystal, '|', InfiLibrary.netherrackRod, 's', InfiLibrary.blazeFragment });
            ModLoader.addRecipe(new ItemStack(lavaBlazeMachete), new Object[] 
                    { recipe, '#', InfiLibrary.blazeCrystal, '|', InfiLibrary.lavaRod, 's', InfiLibrary.blazeFragment });
            ModLoader.addRecipe(new ItemStack(flintBlazeMachete), new Object[] 
                    { recipe, '#', InfiLibrary.blazeCrystal, '|', InfiLibrary.flintRod, 's', InfiLibrary.blazeFragment });
            ModLoader.addRecipe(new ItemStack(blazeBlazeMachete), new Object[] 
                    { recipe, '#', InfiLibrary.blazeCrystal, '|', Item.blazeRod, 's', InfiLibrary.blazeFragment });
            ModLoader.addRecipe(new ItemStack(manyullynBlazeMachete), new Object[] 
                    { recipe, '#', InfiLibrary.blazeCrystal, '|', InfiLibrary.manyullynRod, 's', InfiLibrary.blazeFragment });
            ModLoader.addRecipe(new ItemStack(uraniumBlazeMachete), new Object[] 
                    { recipe, '#', InfiLibrary.blazeCrystal, '|', InfiLibrary.uraniumRod, 's', InfiLibrary.blazeFragment });
        }
    }
    
    public static void addStoneTools(String stack)
	{
		//GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(woodStoneMachete), recipe, '#', stack, '|', Item.stick ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(stoneStoneMachete), recipe, '#', stack, '|', InfiLibrary.stoneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(sandstoneStoneMachete), recipe, '#', stack, '|', InfiLibrary.sandstoneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(boneStoneMachete), recipe, '#', stack, '|', Item.bone ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(boneStoneMachete), recipe, '#', stack, '|', InfiLibrary.boneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(netherrackStoneMachete), recipe, '#', stack, '|', InfiLibrary.netherrackRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(iceStoneMachete), recipe, '#', stack, '|', InfiLibrary.iceRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(slimeStoneMachete), recipe, '#', stack, '|', InfiLibrary.slimeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(cactusStoneMachete), recipe, '#', stack, '|', InfiLibrary.cactusRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(flintStoneMachete), recipe, '#', stack, '|', InfiLibrary.flintRod ) );
	}

	public static void addCopperTools(String stack)
	{
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(woodCopperMachete), recipe, '#', stack, '|', Item.stick ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(stoneCopperMachete), recipe, '#', stack, '|', InfiLibrary.stoneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(boneCopperMachete), recipe, '#', stack, '|', Item.bone ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(boneCopperMachete), recipe, '#', stack, '|', InfiLibrary.boneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(netherrackCopperMachete), recipe, '#', stack, '|', InfiLibrary.netherrackRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(slimeCopperMachete), recipe, '#', stack, '|', InfiLibrary.slimeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(cactusCopperMachete), recipe, '#', stack, '|', InfiLibrary.cactusRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(flintCopperMachete), recipe, '#', stack, '|', InfiLibrary.flintRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(copperCopperMachete), recipe, '#', stack, '|', InfiLibrary.copperRod ) );
	}

	public static void addBronzeTools(String stack)
	{
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(woodBronzeMachete), recipe, '#', stack, '|', Item.stick ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(stoneBronzeMachete), recipe, '#', stack, '|', InfiLibrary.stoneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(boneBronzeMachete), recipe, '#', stack, '|', Item.bone ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(boneBronzeMachete), recipe, '#', stack, '|', InfiLibrary.boneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(netherrackBronzeMachete), recipe, '#', stack, '|', InfiLibrary.netherrackRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(slimeBronzeMachete), recipe, '#', stack, '|', InfiLibrary.slimeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(cactusBronzeMachete), recipe, '#', stack, '|', InfiLibrary.cactusRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(flintBronzeMachete), recipe, '#', stack, '|', InfiLibrary.flintRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(copperBronzeMachete), recipe, '#', stack, '|', InfiLibrary.copperRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(bronzeBronzeMachete), recipe, '#', stack, '|', InfiLibrary.bronzeRod ) );
	}

	public static void addWorkedIronTools(String stack)
	{
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(woodWorkedIronMachete), recipe, '#', stack, '|', Item.stick ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(stoneWorkedIronMachete), recipe, '#', stack, '|', InfiLibrary.stoneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(ironWorkedIronMachete), recipe, '#', stack, '|', InfiLibrary.ironRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(diamondWorkedIronMachete), recipe, '#', stack, '|', InfiLibrary.diamondRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(redstoneWorkedIronMachete), recipe, '#', stack, '|', InfiLibrary.redstoneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(obsidianWorkedIronMachete), recipe, '#', stack, '|', InfiLibrary.obsidianRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(boneWorkedIronMachete), recipe, '#', stack, '|', Item.bone ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(boneWorkedIronMachete), recipe, '#', stack, '|', InfiLibrary.boneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(netherrackWorkedIronMachete), recipe, '#', stack, '|', InfiLibrary.netherrackRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(glowstoneWorkedIronMachete), recipe, '#', stack, '|', InfiLibrary.glowstoneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(iceWorkedIronMachete), recipe, '#', stack, '|', InfiLibrary.iceRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(slimeWorkedIronMachete), recipe, '#', stack, '|', InfiLibrary.slimeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(cactusWorkedIronMachete), recipe, '#', stack, '|', InfiLibrary.cactusRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(blazeWorkedIronMachete), recipe, '#', stack, '|', Item.blazeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(copperWorkedIronMachete), recipe, '#', stack, '|', InfiLibrary.copperRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(bronzeWorkedIronMachete), recipe, '#', stack, '|', InfiLibrary.bronzeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(workedWorkedIronMachete), recipe, '#', stack, '|', InfiLibrary.workedIronRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(steelWorkedIronMachete), recipe, '#', stack, '|', InfiLibrary.steelRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(uraniumWorkedIronMachete), recipe, '#', stack, '|', InfiLibrary.uraniumRod ) );
	}

	public static void addSteelTools(String stack)
	{
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(woodSteelMachete), recipe, '#', stack, '|', Item.stick ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(stoneSteelMachete), recipe, '#', stack, '|', InfiLibrary.stoneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(ironSteelMachete), recipe, '#', stack, '|', InfiLibrary.ironRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(diamondSteelMachete), recipe, '#', stack, '|', InfiLibrary.diamondRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(redstoneSteelMachete), recipe, '#', stack, '|', InfiLibrary.redstoneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(obsidianSteelMachete), recipe, '#', stack, '|', InfiLibrary.obsidianRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(boneSteelMachete), recipe, '#', stack, '|', Item.bone ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(boneSteelMachete), recipe, '#', stack, '|', InfiLibrary.boneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(netherrackSteelMachete), recipe, '#', stack, '|', InfiLibrary.netherrackRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(glowstoneSteelMachete), recipe, '#', stack, '|', InfiLibrary.glowstoneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(iceSteelMachete), recipe, '#', stack, '|', InfiLibrary.iceRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(slimeSteelMachete), recipe, '#', stack, '|', InfiLibrary.slimeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(cactusSteelMachete), recipe, '#', stack, '|', InfiLibrary.cactusRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(blazeSteelMachete), recipe, '#', stack, '|', Item.blazeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(copperSteelMachete), recipe, '#', stack, '|', InfiLibrary.copperRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(bronzeSteelMachete), recipe, '#', stack, '|', InfiLibrary.bronzeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(workedSteelMachete), recipe, '#', stack, '|', InfiLibrary.workedIronRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(steelSteelMachete), recipe, '#', stack, '|', InfiLibrary.steelRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(cobaltSteelMachete), recipe, '#', stack, '|', InfiLibrary.cobaltRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(arditeSteelMachete), recipe, '#', stack, '|', InfiLibrary.arditeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(uraniumSteelMachete), recipe, '#', stack, '|', InfiLibrary.uraniumRod ) );
	}

	public static void addCobaltTools(String stack)
	{
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(woodCobaltMachete), recipe, '#', stack, '|', Item.stick ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(stoneCobaltMachete), recipe, '#', stack, '|', InfiLibrary.stoneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(ironCobaltMachete), recipe, '#', stack, '|', InfiLibrary.ironRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(diamondCobaltMachete), recipe, '#', stack, '|', InfiLibrary.diamondRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(redstoneCobaltMachete), recipe, '#', stack, '|', InfiLibrary.redstoneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(obsidianCobaltMachete), recipe, '#', stack, '|', InfiLibrary.obsidianRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(boneCobaltMachete), recipe, '#', stack, '|', Item.bone ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(boneCobaltMachete), recipe, '#', stack, '|', InfiLibrary.boneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(slimeCobaltMachete), recipe, '#', stack, '|', InfiLibrary.slimeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(cactusCobaltMachete), recipe, '#', stack, '|', InfiLibrary.cactusRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(blazeCobaltMachete), recipe, '#', stack, '|', Item.blazeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(copperCobaltMachete), recipe, '#', stack, '|', InfiLibrary.copperRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(bronzeCobaltMachete), recipe, '#', stack, '|', InfiLibrary.bronzeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(workedCobaltMachete), recipe, '#', stack, '|', InfiLibrary.workedIronRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(steelCobaltMachete), recipe, '#', stack, '|', InfiLibrary.steelRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(cobaltCobaltMachete), recipe, '#', stack, '|', InfiLibrary.cobaltRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(arditeCobaltMachete), recipe, '#', stack, '|', InfiLibrary.arditeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(manyullynCobaltMachete), recipe, '#', stack, '|', InfiLibrary.manyullynRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(uraniumCobaltMachete), recipe, '#', stack, '|', InfiLibrary.uraniumRod ) );
	}

	public static void addArditeTools(String stack)
	{
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(woodArditeMachete), recipe, '#', stack, '|', Item.stick ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(stoneArditeMachete), recipe, '#', stack, '|', InfiLibrary.stoneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(ironArditeMachete), recipe, '#', stack, '|', InfiLibrary.ironRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(diamondArditeMachete), recipe, '#', stack, '|', InfiLibrary.diamondRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(redstoneArditeMachete), recipe, '#', stack, '|', InfiLibrary.redstoneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(obsidianArditeMachete), recipe, '#', stack, '|', InfiLibrary.obsidianRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(boneArditeMachete), recipe, '#', stack, '|', Item.bone ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(boneArditeMachete), recipe, '#', stack, '|', InfiLibrary.boneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(slimeArditeMachete), recipe, '#', stack, '|', InfiLibrary.slimeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(cactusArditeMachete), recipe, '#', stack, '|', InfiLibrary.cactusRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(blazeArditeMachete), recipe, '#', stack, '|', Item.blazeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(copperArditeMachete), recipe, '#', stack, '|', InfiLibrary.copperRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(bronzeArditeMachete), recipe, '#', stack, '|', InfiLibrary.bronzeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(workedArditeMachete), recipe, '#', stack, '|', InfiLibrary.workedIronRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(steelArditeMachete), recipe, '#', stack, '|', InfiLibrary.steelRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(cobaltArditeMachete), recipe, '#', stack, '|', InfiLibrary.cobaltRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(arditeArditeMachete), recipe, '#', stack, '|', InfiLibrary.arditeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(manyullynArditeMachete), recipe, '#', stack, '|', InfiLibrary.manyullynRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(uraniumArditeMachete), recipe, '#', stack, '|', InfiLibrary.uraniumRod ) );
	}

	public static void addManyullynTools(String stack)
	{
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(woodManyullynMachete), recipe, '#', stack, '|', Item.stick ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(stoneManyullynMachete), recipe, '#', stack, '|', InfiLibrary.stoneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(ironManyullynMachete), recipe, '#', stack, '|', InfiLibrary.ironRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(diamondManyullynMachete), recipe, '#', stack, '|', InfiLibrary.diamondRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(redstoneManyullynMachete), recipe, '#', stack, '|', InfiLibrary.redstoneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(obsidianManyullynMachete), recipe, '#', stack, '|', InfiLibrary.obsidianRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(boneManyullynMachete), recipe, '#', stack, '|', Item.bone ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(boneManyullynMachete), recipe, '#', stack, '|', InfiLibrary.boneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(slimeManyullynMachete), recipe, '#', stack, '|', InfiLibrary.slimeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(cactusManyullynMachete), recipe, '#', stack, '|', InfiLibrary.cactusRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(blazeManyullynMachete), recipe, '#', stack, '|', Item.blazeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(copperManyullynMachete), recipe, '#', stack, '|', InfiLibrary.copperRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(bronzeManyullynMachete), recipe, '#', stack, '|', InfiLibrary.bronzeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(workedManyullynMachete), recipe, '#', stack, '|', InfiLibrary.workedIronRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(steelManyullynMachete), recipe, '#', stack, '|', InfiLibrary.steelRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(cobaltManyullynMachete), recipe, '#', stack, '|', InfiLibrary.cobaltRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(arditeManyullynMachete), recipe, '#', stack, '|', InfiLibrary.arditeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(manyullynManyullynMachete), recipe, '#', stack, '|', InfiLibrary.manyullynRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(uraniumManyullynMachete), recipe, '#', stack, '|', InfiLibrary.uraniumRod ) );
	}

	public static void addUraniumTools(String stack)
	{
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(diamondUraniumMachete), recipe, '#', stack, '|', InfiLibrary.diamondRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(redstoneUraniumMachete), recipe, '#', stack, '|', InfiLibrary.redstoneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(boneUraniumMachete), recipe, '#', stack, '|', Item.bone ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(boneUraniumMachete), recipe, '#', stack, '|', InfiLibrary.boneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(netherrackUraniumMachete), recipe, '#', stack, '|', InfiLibrary.netherrackRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(glowstoneUraniumMachete), recipe, '#', stack, '|', InfiLibrary.glowstoneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(lavaUraniumMachete), recipe, '#', stack, '|', InfiLibrary.lavaRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(blazeUraniumMachete), recipe, '#', stack, '|', Item.blazeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(cobaltUraniumMachete), recipe, '#', stack, '|', InfiLibrary.cobaltRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(arditeUraniumMachete), recipe, '#', stack, '|', InfiLibrary.arditeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(uraniumUraniumMachete), recipe, '#', stack, '|', InfiLibrary.uraniumRod ) );
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
