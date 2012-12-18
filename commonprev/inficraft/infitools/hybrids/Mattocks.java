package inficraft.infitools.hybrids;
import inficraft.infitools.base.PHInfiTools;
import inficraft.infitools.library.InfiLibrary;
import inficraft.infitools.library.InfiMaterialEnum;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.src.Block;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;
import net.minecraft.src.ModLoader;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.oredict.ShapedOreRecipe;

public class Mattocks 
{
    public static Mattocks instance = new Mattocks();
    
    private static String[] recipe = { "#s#", "#| ", " | " };
    
    public static Mattocks getInstance()
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
    	woodWoodMattock = new InfiToolMattock(PHInfiHybrids.woodMattockID+0, 
                InfiMaterialEnum.Wood, InfiMaterialEnum.Wood, "woodWoodMattock");
    	woodStoneMattock = new InfiToolMattock(PHInfiHybrids.stoneMattockID+0, 
                InfiMaterialEnum.Stone, InfiMaterialEnum.Wood, "woodStoneMattock");
    	woodIronMattock = new InfiToolMattock(PHInfiHybrids.ironMattockID+0, 
                InfiMaterialEnum.Iron, InfiMaterialEnum.Wood, "woodIronMattock");
    	woodDiamondMattock = new InfiToolMattock(PHInfiHybrids.diamondMattockID+0, 
                InfiMaterialEnum.Diamond, InfiMaterialEnum.Wood, "woodDiamondMattock");
    	
    	MinecraftForge.setToolClass(woodWoodMattock, "Mattock", InfiMaterialEnum.Wood.getHarvestLevel());
    	MinecraftForge.setToolClass(woodStoneMattock, "Mattock", InfiMaterialEnum.Stone.getHarvestLevel());
    	MinecraftForge.setToolClass(woodIronMattock, "Mattock", InfiMaterialEnum.Iron.getHarvestLevel());
    	MinecraftForge.setToolClass(woodDiamondMattock, "Mattock", InfiMaterialEnum.Diamond.getHarvestLevel());
    	
    	ModLoader.addName(woodWoodMattock, "Wooden Mattock");
    }
    
    private static void registerVanillaRecipes()
    {
    	ModLoader.addRecipe(new ItemStack(woodWoodMattock), new Object[] 
                { recipe, '#', Block.planks, '|', Item.stick, 's', Item.stick });
		ModLoader.addRecipe(new ItemStack(woodStoneMattock), new Object[] 
                { recipe, '#', Block.cobblestone, '|', Item.stick, 's', InfiLibrary.stoneShard });
		ModLoader.addRecipe(new ItemStack(woodIronMattock), new Object[] 
                { recipe, '#', Item.ingotIron, '|', Item.stick, 's', InfiLibrary.ironChunk });
		ModLoader.addRecipe(new ItemStack(woodDiamondMattock), new Object[] 
                { recipe, '#', Item.diamond, '|', Item.stick, 's', InfiLibrary.diamondShard });
    }
    
    private static void createTools()
    {
    	if(PHInfiHybrids.enableWoodTools)
    	{
    		woodWoodMattock = new InfiToolMattock(PHInfiHybrids.woodMattockID+0, 
                    InfiMaterialEnum.Wood, InfiMaterialEnum.Wood, "woodWoodMattock");
    		sandstoneWoodMattock = new InfiToolMattock(PHInfiHybrids.woodMattockID+1, 
                    InfiMaterialEnum.Wood, InfiMaterialEnum.Sandstone, "sandstoneWoodMattock");
    		boneWoodMattock = new InfiToolMattock(PHInfiHybrids.woodMattockID+2, 
                    InfiMaterialEnum.Wood, InfiMaterialEnum.Bone, "boneWoodMattock");
    		paperWoodMattock = new InfiToolMattock(PHInfiHybrids.woodMattockID+3, 
                    InfiMaterialEnum.Wood, InfiMaterialEnum.Paper, "paperWoodMattock");
    		iceWoodMattock = new InfiToolMattock(PHInfiHybrids.woodMattockID+4, 
                    InfiMaterialEnum.Wood, InfiMaterialEnum.Ice, "iceWoodMattock");
    		slimeWoodMattock = new InfiToolMattock(PHInfiHybrids.woodMattockID+5, 
                    InfiMaterialEnum.Wood, InfiMaterialEnum.Slime, "slimeWoodMattock");
    		cactusWoodMattock = new InfiToolMattock(PHInfiHybrids.woodMattockID+6, 
                    InfiMaterialEnum.Wood, InfiMaterialEnum.Cactus, "cactusWoodMattock");
    		
    		MinecraftForge.setToolClass(woodWoodMattock, "Mattock", InfiMaterialEnum.Wood.getHarvestLevel());
    		MinecraftForge.setToolClass(sandstoneWoodMattock, "Mattock", InfiMaterialEnum.Wood.getHarvestLevel());
    		MinecraftForge.setToolClass(boneWoodMattock, "Mattock", InfiMaterialEnum.Wood.getHarvestLevel());
    		MinecraftForge.setToolClass(paperWoodMattock, "Mattock", InfiMaterialEnum.Wood.getHarvestLevel());
    		MinecraftForge.setToolClass(iceWoodMattock, "Mattock", InfiMaterialEnum.Wood.getHarvestLevel());
    		MinecraftForge.setToolClass(slimeWoodMattock, "Mattock", InfiMaterialEnum.Wood.getHarvestLevel());
    		MinecraftForge.setToolClass(cactusWoodMattock, "Mattock", InfiMaterialEnum.Wood.getHarvestLevel());
    	}

        if(PHInfiHybrids.enableStoneTools)
        {
        	woodStoneMattock = new InfiToolMattock(PHInfiHybrids.stoneMattockID+0, 
                    InfiMaterialEnum.Stone, InfiMaterialEnum.Wood, "woodStoneMattock");
        	stoneStoneMattock = new InfiToolMattock(PHInfiHybrids.stoneMattockID+1, 
                    InfiMaterialEnum.Stone, InfiMaterialEnum.Stone, "stoneStoneMattock");
        	sandstoneStoneMattock = new InfiToolMattock(PHInfiHybrids.stoneMattockID+2, 
                    InfiMaterialEnum.Stone, InfiMaterialEnum.Sandstone, "sandstoneStoneMattock");
        	boneStoneMattock = new InfiToolMattock(PHInfiHybrids.stoneMattockID+3, 
                    InfiMaterialEnum.Stone, InfiMaterialEnum.Bone, "boneStoneMattock");
        	netherrackStoneMattock = new InfiToolMattock(PHInfiHybrids.stoneMattockID+4, 
                    InfiMaterialEnum.Stone, InfiMaterialEnum.Netherrack, "netherrackStoneMattock");
        	iceStoneMattock = new InfiToolMattock(PHInfiHybrids.stoneMattockID+5, 
                    InfiMaterialEnum.Stone, InfiMaterialEnum.Ice, "iceStoneMattock");
        	slimeStoneMattock = new InfiToolMattock(PHInfiHybrids.stoneMattockID+6, 
                    InfiMaterialEnum.Stone, InfiMaterialEnum.Slime, "slimeStoneMattock");
        	cactusStoneMattock = new InfiToolMattock(PHInfiHybrids.stoneMattockID+7, 
                    InfiMaterialEnum.Stone, InfiMaterialEnum.Cactus, "cactusStoneMattock");
        	flintStoneMattock = new InfiToolMattock(PHInfiHybrids.stoneMattockID+8, 
                    InfiMaterialEnum.Stone, InfiMaterialEnum.Flint, "flintStoneMattock");
            
            MinecraftForge.setToolClass(woodStoneMattock, "Mattock", InfiMaterialEnum.Stone.getHarvestLevel());
            MinecraftForge.setToolClass(stoneStoneMattock, "Mattock", InfiMaterialEnum.Stone.getHarvestLevel());
            MinecraftForge.setToolClass(sandstoneStoneMattock, "Mattock", InfiMaterialEnum.Stone.getHarvestLevel());
            MinecraftForge.setToolClass(boneStoneMattock, "Mattock", InfiMaterialEnum.Stone.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackStoneMattock, "Mattock", InfiMaterialEnum.Stone.getHarvestLevel());
            MinecraftForge.setToolClass(iceStoneMattock, "Mattock", InfiMaterialEnum.Stone.getHarvestLevel());
            MinecraftForge.setToolClass(slimeStoneMattock, "Mattock", InfiMaterialEnum.Stone.getHarvestLevel());
            MinecraftForge.setToolClass(cactusStoneMattock, "Mattock", InfiMaterialEnum.Stone.getHarvestLevel());
            MinecraftForge.setToolClass(flintStoneMattock, "Mattock", InfiMaterialEnum.Stone.getHarvestLevel());
        }
        
        if(PHInfiHybrids.enableIronTools)
        {
        	woodIronMattock = new InfiToolMattock(PHInfiHybrids.ironMattockID+0, 
                    InfiMaterialEnum.Iron, InfiMaterialEnum.Wood, "woodIronMattock");
        	stoneIronMattock = new InfiToolMattock(PHInfiHybrids.ironMattockID+1, 
                    InfiMaterialEnum.Iron, InfiMaterialEnum.Stone, "stoneIronMattock");
        	ironIronMattock = new InfiToolMattock(PHInfiHybrids.ironMattockID+2, 
                    InfiMaterialEnum.Iron, InfiMaterialEnum.Iron, "ironIronMattock");
        	boneIronMattock = new InfiToolMattock(PHInfiHybrids.ironMattockID+3, 
                    InfiMaterialEnum.Iron, InfiMaterialEnum.Bone, "boneIronMattock");
        	netherrackIronMattock = new InfiToolMattock(PHInfiHybrids.ironMattockID+4, 
                    InfiMaterialEnum.Iron, InfiMaterialEnum.Netherrack, "netherrackIronMattock");
        	glowstoneIronMattock = new InfiToolMattock(PHInfiHybrids.ironMattockID+5, 
                    InfiMaterialEnum.Iron, InfiMaterialEnum.Glowstone, "glowstoneIronMattock");
        	cactusIronMattock = new InfiToolMattock(PHInfiHybrids.ironMattockID+6, 
                    InfiMaterialEnum.Iron, InfiMaterialEnum.Cactus, "cactusIronMattock");
        	copperIronMattock = new InfiToolMattock(PHInfiHybrids.ironMattockID+7, 
                    InfiMaterialEnum.Iron, InfiMaterialEnum.Copper, "copperIronMattock");
        	bronzeIronMattock = new InfiToolMattock(PHInfiHybrids.ironMattockID+8, 
                    InfiMaterialEnum.Iron, InfiMaterialEnum.Bronze, "bronzeIronMattock");
            
            MinecraftForge.setToolClass(woodIronMattock, "Mattock", InfiMaterialEnum.Iron.getHarvestLevel());
            MinecraftForge.setToolClass(stoneIronMattock, "Mattock", InfiMaterialEnum.Iron.getHarvestLevel());
            MinecraftForge.setToolClass(ironIronMattock, "Mattock", InfiMaterialEnum.Iron.getHarvestLevel());
            MinecraftForge.setToolClass(boneIronMattock, "Mattock", InfiMaterialEnum.Iron.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackIronMattock, "Mattock", InfiMaterialEnum.Iron.getHarvestLevel());
            MinecraftForge.setToolClass(glowstoneIronMattock, "Mattock", InfiMaterialEnum.Iron.getHarvestLevel());
            MinecraftForge.setToolClass(cactusIronMattock, "Mattock", InfiMaterialEnum.Iron.getHarvestLevel());
            MinecraftForge.setToolClass(copperIronMattock, "Mattock", InfiMaterialEnum.Iron.getHarvestLevel());
            MinecraftForge.setToolClass(bronzeIronMattock, "Mattock", InfiMaterialEnum.Iron.getHarvestLevel());
        }
        
        if(PHInfiHybrids.enableDiamondTools)
        {
        	woodDiamondMattock = new InfiToolMattock(PHInfiHybrids.diamondMattockID+0, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Wood, "woodDiamondMattock");
        	stoneDiamondMattock = new InfiToolMattock(PHInfiHybrids.diamondMattockID+1, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Stone, "stoneDiamondMattock");
        	ironDiamondMattock = new InfiToolMattock(PHInfiHybrids.diamondMattockID+2, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Iron, "ironDiamondMattock");
        	diamondDiamondMattock = new InfiToolMattock(PHInfiHybrids.diamondMattockID+3, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Diamond, "diamondDiamondMattock");
        	redstoneDiamondMattock = new InfiToolMattock(PHInfiHybrids.diamondMattockID+4, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Redstone, "redstoneDiamondMattock");
        	obsidianDiamondMattock = new InfiToolMattock(PHInfiHybrids.diamondMattockID+5, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Obsidian, "obsidianDiamondMattock");
        	boneDiamondMattock = new InfiToolMattock(PHInfiHybrids.diamondMattockID+6, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Bone, "boneDiamondMattock");
        	mossyDiamondMattock = new InfiToolMattock(PHInfiHybrids.diamondMattockID+7, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Mossy, "mossyDiamondMattock");
        	netherrackDiamondMattock = new InfiToolMattock(PHInfiHybrids.diamondMattockID+8, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Netherrack, "netherrackDiamondMattock");
        	glowstoneDiamondMattock = new InfiToolMattock(PHInfiHybrids.diamondMattockID+9, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Glowstone, "glowstoneDiamondMattock");
        	lavaDiamondMattock = new InfiToolMattock(PHInfiHybrids.diamondMattockID+10, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Lava, "lavaDiamondMattock");
        	cactusDiamondMattock = new InfiToolMattock(PHInfiHybrids.diamondMattockID+11, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Cactus, "cactusDiamondMattock");
        	flintDiamondMattock = new InfiToolMattock(PHInfiHybrids.diamondMattockID+12, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Flint, "flintDiamondMattock");
        	blazeDiamondMattock = new InfiToolMattock(PHInfiHybrids.diamondMattockID+13, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Blaze, "blazeDiamondMattock");
            copperDiamondMattock = new InfiToolMattock(PHInfiHybrids.diamondMattockID+14, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Copper, "copperDiamondMattock");
            bronzeDiamondMattock = new InfiToolMattock(PHInfiHybrids.diamondMattockID+15, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Bronze, "bronzeDiamondMattock");
            workedDiamondMattock = new InfiToolMattock(PHInfiHybrids.diamondMattockID+16, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.WorkedIron, "workedDiamondMattock");
            steelDiamondMattock = new InfiToolMattock(PHInfiHybrids.diamondMattockID+17, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Steel, "steelDiamondMattock");
            cobaltDiamondMattock = new InfiToolMattock(PHInfiHybrids.diamondMattockID+18, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Cobalt, "cobaltDiamondMattock");
            arditeDiamondMattock = new InfiToolMattock(PHInfiHybrids.diamondMattockID+19, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Ardite, "arditeDiamondMattock");
            manyullynDiamondMattock = new InfiToolMattock(PHInfiHybrids.diamondMattockID+20, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Manyullyn, "manyullynDiamondMattock");
            uraniumDiamondMattock = new InfiToolMattock(PHInfiHybrids.diamondMattockID+21, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Uranium, "uraniumDiamondMattock");
            
            MinecraftForge.setToolClass(woodDiamondMattock, "Mattock", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(stoneDiamondMattock, "Mattock", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(ironDiamondMattock, "Mattock", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(diamondDiamondMattock, "Mattock", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(redstoneDiamondMattock, "Mattock", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(obsidianDiamondMattock, "Mattock", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(boneDiamondMattock, "Mattock", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(mossyDiamondMattock, "Mattock", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackDiamondMattock, "Mattock", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(glowstoneDiamondMattock, "Mattock", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(lavaDiamondMattock, "Mattock", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(cactusDiamondMattock, "Mattock", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(flintDiamondMattock, "Mattock", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(blazeDiamondMattock, "Mattock", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(copperDiamondMattock, "Mattock", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(bronzeDiamondMattock, "Mattock", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(workedDiamondMattock, "Mattock", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(steelDiamondMattock, "Mattock", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(cobaltDiamondMattock, "Mattock", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(arditeDiamondMattock, "Mattock", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(manyullynDiamondMattock, "Mattock", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(uraniumDiamondMattock, "Mattock", InfiMaterialEnum.Diamond.getHarvestLevel());
        }
        
        if(PHInfiHybrids.enableRedstoneTools)
        {
        	woodRedstoneMattock = new InfiToolMattock(PHInfiHybrids.redstoneMattockID+0, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Wood, "woodRedstoneMattock");
        	stoneRedstoneMattock = new InfiToolMattock(PHInfiHybrids.redstoneMattockID+1, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Stone, "stoneRedstoneMattock");
        	ironRedstoneMattock = new InfiToolMattock(PHInfiHybrids.redstoneMattockID+2, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Iron, "ironRedstoneMattock");
        	redstoneRedstoneMattock = new InfiToolMattock(PHInfiHybrids.redstoneMattockID+3, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Redstone, "redstoneRedstoneMattock");
        	obsidianRedstoneMattock = new InfiToolMattock(PHInfiHybrids.redstoneMattockID+4, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Obsidian, "obsidianRedstoneMattock");
        	sandstoneRedstoneMattock = new InfiToolMattock(PHInfiHybrids.redstoneMattockID+5, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Sandstone, "sandstoneRedstoneMattock");
        	boneRedstoneMattock = new InfiToolMattock(PHInfiHybrids.redstoneMattockID+6, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Bone, "boneRedstoneMattock");
        	paperRedstoneMattock = new InfiToolMattock(PHInfiHybrids.redstoneMattockID+7, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Paper, "paperRedstoneMattock");
        	mossyRedstoneMattock = new InfiToolMattock(PHInfiHybrids.redstoneMattockID+8, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Mossy, "mossyRedstoneMattock");
        	netherrackRedstoneMattock = new InfiToolMattock(PHInfiHybrids.redstoneMattockID+9, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Netherrack, "netherrackRedstoneMattock");
        	glowstoneRedstoneMattock = new InfiToolMattock(PHInfiHybrids.redstoneMattockID+10, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Glowstone, "glowstoneRedstoneMattock");
        	iceRedstoneMattock = new InfiToolMattock(PHInfiHybrids.redstoneMattockID+11, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Ice, "iceRedstoneMattock");
        	lavaRedstoneMattock = new InfiToolMattock(PHInfiHybrids.redstoneMattockID+12,
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Lava, "lavaRedstoneMattock");
        	slimeRedstoneMattock = new InfiToolMattock(PHInfiHybrids.redstoneMattockID+13,
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Slime, "slimeRedstoneMattock");
        	cactusRedstoneMattock = new InfiToolMattock(PHInfiHybrids.redstoneMattockID+14,
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Cactus, "cactusRedstoneMattock");
        	flintRedstoneMattock = new InfiToolMattock(PHInfiHybrids.redstoneMattockID+15,
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Flint, "flintRedstoneMattock");
        	copperRedstoneMattock = new InfiToolMattock(PHInfiHybrids.redstoneMattockID+16,
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Copper, "copperRedstoneMattock");
        	bronzeRedstoneMattock = new InfiToolMattock(PHInfiHybrids.redstoneMattockID+17,
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Bronze, "bronzeRedstoneMattock");
        	workedRedstoneMattock = new InfiToolMattock(PHInfiHybrids.redstoneMattockID+18,
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.WorkedIron, "workedRedstoneMattock");
        	uraniumRedstoneMattock = new InfiToolMattock(PHInfiHybrids.redstoneMattockID+19,
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Uranium, "uraniumRedstoneMattock");
            
            MinecraftForge.setToolClass(woodRedstoneMattock, "Mattock", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(stoneRedstoneMattock, "Mattock", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(ironRedstoneMattock, "Mattock", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(redstoneRedstoneMattock, "Mattock", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(obsidianRedstoneMattock, "Mattock", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(sandstoneRedstoneMattock, "Mattock", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(boneRedstoneMattock, "Mattock", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(paperRedstoneMattock, "Mattock", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(mossyRedstoneMattock, "Mattock", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackRedstoneMattock, "Mattock", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(glowstoneRedstoneMattock, "Mattock", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(iceRedstoneMattock, "Mattock", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(lavaRedstoneMattock, "Mattock", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(slimeRedstoneMattock, "Mattock", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(cactusRedstoneMattock, "Mattock", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(flintRedstoneMattock, "Mattock", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(copperRedstoneMattock, "Mattock", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(bronzeRedstoneMattock, "Mattock", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(workedRedstoneMattock, "Mattock", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(uraniumRedstoneMattock, "Mattock", InfiMaterialEnum.Redstone.getHarvestLevel());
        }
        
        if(PHInfiHybrids.enableObsidianTools)
        {
        	woodObsidianMattock = new InfiToolMattock(PHInfiHybrids.obsidianMattockID+0, 
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Wood, "woodObsidianMattock");
        	stoneObsidianMattock = new InfiToolMattock(PHInfiHybrids.obsidianMattockID+1, 
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Stone, "stoneObsidianMattock");
        	redstoneObsidianMattock = new InfiToolMattock(PHInfiHybrids.obsidianMattockID+2, 
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Redstone, "redstoneObsidianMattock");
        	obsidianObsidianMattock = new InfiToolMattock(PHInfiHybrids.obsidianMattockID+3, 
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Obsidian, "obsidianObsidianMattock");;
        	boneObsidianMattock = new InfiToolMattock(PHInfiHybrids.obsidianMattockID+4, 
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Bone, "boneObsidianMattock");
        	netherrackObsidianMattock = new InfiToolMattock(PHInfiHybrids.obsidianMattockID+5, 
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Netherrack, "netherrackObsidianMattock");
        	glowstoneObsidianMattock = new InfiToolMattock(PHInfiHybrids.obsidianMattockID+6, 
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Glowstone, "glowstoneObsidianMattock");
        	iceObsidianMattock = new InfiToolMattock(PHInfiHybrids.obsidianMattockID+7, 
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Ice, "iceObsidianMattock");
        	lavaObsidianMattock = new InfiToolMattock(PHInfiHybrids.obsidianMattockID+8,
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Lava, "lavaObsidianMattock");
        	cactusObsidianMattock = new InfiToolMattock(PHInfiHybrids.obsidianMattockID+9,
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Cactus, "cactusObsidianMattock");
            
            MinecraftForge.setToolClass(woodObsidianMattock, "Mattock", InfiMaterialEnum.Obsidian.getHarvestLevel());
            MinecraftForge.setToolClass(stoneObsidianMattock, "Mattock", InfiMaterialEnum.Obsidian.getHarvestLevel());
            MinecraftForge.setToolClass(redstoneObsidianMattock, "Mattock", InfiMaterialEnum.Obsidian.getHarvestLevel());
            MinecraftForge.setToolClass(obsidianObsidianMattock, "Mattock", InfiMaterialEnum.Obsidian.getHarvestLevel());
            MinecraftForge.setToolClass(boneObsidianMattock, "Mattock", InfiMaterialEnum.Obsidian.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackObsidianMattock, "Mattock", InfiMaterialEnum.Obsidian.getHarvestLevel());
            MinecraftForge.setToolClass(glowstoneObsidianMattock, "Mattock", InfiMaterialEnum.Obsidian.getHarvestLevel());
            MinecraftForge.setToolClass(iceObsidianMattock, "Mattock", InfiMaterialEnum.Obsidian.getHarvestLevel());
            MinecraftForge.setToolClass(lavaObsidianMattock, "Mattock", InfiMaterialEnum.Obsidian.getHarvestLevel());
            MinecraftForge.setToolClass(cactusObsidianMattock, "Mattock", InfiMaterialEnum.Obsidian.getHarvestLevel());
        }
        
        if(PHInfiHybrids.enableSandstoneTools)
        {
        	woodSandstoneMattock = new InfiToolMattock(PHInfiHybrids.sandstoneMattockID+0, 
                    InfiMaterialEnum.Sandstone, InfiMaterialEnum.Wood, "woodSandstoneMattock");
        	sandstoneSandstoneMattock = new InfiToolMattock(PHInfiHybrids.sandstoneMattockID+1, 
                    InfiMaterialEnum.Sandstone, InfiMaterialEnum.Sandstone, "sandstoneSandstoneMattock");
        	boneSandstoneMattock = new InfiToolMattock(PHInfiHybrids.sandstoneMattockID+2, 
                    InfiMaterialEnum.Sandstone, InfiMaterialEnum.Bone, "boneSandstoneMattock");
        	netherrackSandstoneMattock = new InfiToolMattock(PHInfiHybrids.sandstoneMattockID+3, 
                    InfiMaterialEnum.Sandstone, InfiMaterialEnum.Netherrack, "netherrackSandstoneMattock");
        	iceSandstoneMattock = new InfiToolMattock(PHInfiHybrids.sandstoneMattockID+4, 
                    InfiMaterialEnum.Sandstone, InfiMaterialEnum.Ice, "iceSandstoneMattock");
        	slimeSandstoneMattock = new InfiToolMattock(PHInfiHybrids.sandstoneMattockID+5,
                    InfiMaterialEnum.Sandstone, InfiMaterialEnum.Slime, "slimeSandstoneMattock");
        	cactusSandstoneMattock = new InfiToolMattock(PHInfiHybrids.sandstoneMattockID+6,
                    InfiMaterialEnum.Sandstone, InfiMaterialEnum.Cactus, "cactusSandstoneMattock");
        	flintSandstoneMattock = new InfiToolMattock(PHInfiHybrids.sandstoneMattockID+7,
                    InfiMaterialEnum.Sandstone, InfiMaterialEnum.Flint, "flintSandstoneMattock");
            
            MinecraftForge.setToolClass(woodSandstoneMattock, "Mattock", InfiMaterialEnum.Sandstone.getHarvestLevel());
            MinecraftForge.setToolClass(sandstoneSandstoneMattock, "Mattock", InfiMaterialEnum.Sandstone.getHarvestLevel());
            MinecraftForge.setToolClass(boneSandstoneMattock, "Mattock", InfiMaterialEnum.Sandstone.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackSandstoneMattock, "Mattock", InfiMaterialEnum.Sandstone.getHarvestLevel());
            MinecraftForge.setToolClass(iceSandstoneMattock, "Mattock", InfiMaterialEnum.Sandstone.getHarvestLevel());
            MinecraftForge.setToolClass(slimeSandstoneMattock, "Mattock", InfiMaterialEnum.Sandstone.getHarvestLevel());
            MinecraftForge.setToolClass(cactusSandstoneMattock, "Mattock", InfiMaterialEnum.Sandstone.getHarvestLevel());
            MinecraftForge.setToolClass(flintSandstoneMattock, "Mattock", InfiMaterialEnum.Sandstone.getHarvestLevel());
        }
        
        if(PHInfiHybrids.enableBoneTools)
        {
        	woodBoneMattock = new InfiToolMattock(PHInfiHybrids.boneMattockID+0, 
                    InfiMaterialEnum.Bone, InfiMaterialEnum.Wood, "woodBoneMattock");
        	stoneBoneMattock = new InfiToolMattock(PHInfiHybrids.boneMattockID+1, 
                    InfiMaterialEnum.Bone, InfiMaterialEnum.Stone, "stoneBoneMattock");
        	sandstoneBoneMattock = new InfiToolMattock(PHInfiHybrids.boneMattockID+2, 
                    InfiMaterialEnum.Bone, InfiMaterialEnum.Sandstone, "sandstoneBoneMattock");
        	boneBoneMattock = new InfiToolMattock(PHInfiHybrids.boneMattockID+3, 
                    InfiMaterialEnum.Bone, InfiMaterialEnum.Bone, "boneBoneMattock");
        	paperBoneMattock = new InfiToolMattock(PHInfiHybrids.boneMattockID+4, 
                    InfiMaterialEnum.Bone, InfiMaterialEnum.Paper, "paperBoneMattock");
        	netherrackBoneMattock = new InfiToolMattock(PHInfiHybrids.boneMattockID+5, 
                    InfiMaterialEnum.Bone, InfiMaterialEnum.Netherrack, "netherrackBoneMattock");
        	iceBoneMattock = new InfiToolMattock(PHInfiHybrids.boneMattockID+6, 
                    InfiMaterialEnum.Bone, InfiMaterialEnum.Ice, "iceBoneMattock");
        	cactusBoneMattock = new InfiToolMattock(PHInfiHybrids.boneMattockID+7,
                    InfiMaterialEnum.Bone, InfiMaterialEnum.Cactus, "cactusBoneMattock");
        	flintBoneMattock = new InfiToolMattock(PHInfiHybrids.boneMattockID+8,
                    InfiMaterialEnum.Bone, InfiMaterialEnum.Flint, "flintBoneMattock");
            
            MinecraftForge.setToolClass(woodBoneMattock, "Mattock", InfiMaterialEnum.Bone.getHarvestLevel());
            MinecraftForge.setToolClass(stoneBoneMattock, "Mattock", InfiMaterialEnum.Bone.getHarvestLevel());
            MinecraftForge.setToolClass(sandstoneBoneMattock, "Mattock", InfiMaterialEnum.Bone.getHarvestLevel());
            MinecraftForge.setToolClass(boneBoneMattock, "Mattock", InfiMaterialEnum.Bone.getHarvestLevel());
            MinecraftForge.setToolClass(paperBoneMattock, "Mattock", InfiMaterialEnum.Bone.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackBoneMattock, "Mattock", InfiMaterialEnum.Bone.getHarvestLevel());
            MinecraftForge.setToolClass(iceBoneMattock, "Mattock", InfiMaterialEnum.Bone.getHarvestLevel());
            MinecraftForge.setToolClass(cactusBoneMattock, "Mattock", InfiMaterialEnum.Bone.getHarvestLevel());
            MinecraftForge.setToolClass(flintBoneMattock, "Mattock", InfiMaterialEnum.Bone.getHarvestLevel());
        }
        
        if(PHInfiHybrids.enablePaperTools)
        {
        	woodPaperMattock = new InfiToolMattock(PHInfiHybrids.paperMattockID+0, 
                    InfiMaterialEnum.Paper, InfiMaterialEnum.Wood, "woodPaperMattock");
        	bonePaperMattock = new InfiToolMattock(PHInfiHybrids.paperMattockID+1, 
                    InfiMaterialEnum.Paper, InfiMaterialEnum.Bone, "bonePaperMattock");
        	paperPaperMattock = new InfiToolMattock(PHInfiHybrids.paperMattockID+2, 
                    InfiMaterialEnum.Paper, InfiMaterialEnum.Paper, "paperPaperMattock");
        	slimePaperMattock = new InfiToolMattock(PHInfiHybrids.paperMattockID+3,
                    InfiMaterialEnum.Paper, InfiMaterialEnum.Slime, "slimePaperMattock");
        	cactusPaperMattock = new InfiToolMattock(PHInfiHybrids.paperMattockID+4,
                    InfiMaterialEnum.Paper, InfiMaterialEnum.Cactus, "cactusPaperMattock");
            
            MinecraftForge.setToolClass(woodPaperMattock, "Mattock", InfiMaterialEnum.Paper.getHarvestLevel());
            MinecraftForge.setToolClass(bonePaperMattock, "Mattock", InfiMaterialEnum.Paper.getHarvestLevel());
            MinecraftForge.setToolClass(paperPaperMattock, "Mattock", InfiMaterialEnum.Paper.getHarvestLevel());
            MinecraftForge.setToolClass(slimePaperMattock, "Mattock", InfiMaterialEnum.Paper.getHarvestLevel());
            MinecraftForge.setToolClass(cactusPaperMattock, "Mattock", InfiMaterialEnum.Paper.getHarvestLevel());
        }
        
        if(PHInfiHybrids.enableMossyTools)
        {
        	woodMossyMattock = new InfiToolMattock(PHInfiHybrids.mossyMattockID+0, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Wood, "woodMossyMattock");
        	stoneMossyMattock = new InfiToolMattock(PHInfiHybrids.mossyMattockID+1, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Stone, "stoneMossyMattock");
        	diamondMossyMattock = new InfiToolMattock(PHInfiHybrids.mossyMattockID+2, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Diamond, "diamondMossyMattock");
        	redstoneMossyMattock = new InfiToolMattock(PHInfiHybrids.mossyMattockID+3, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Redstone, "redstoneMossyMattock");
        	boneMossyMattock = new InfiToolMattock(PHInfiHybrids.mossyMattockID+4, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Bone, "boneMossyMattock");
        	mossyMossyMattock = new InfiToolMattock(PHInfiHybrids.mossyMattockID+5, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Mossy, "mossyMossyMattock");
        	netherrackMossyMattock = new InfiToolMattock(PHInfiHybrids.mossyMattockID+6, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Netherrack, "netherrackMossyMattock");
        	glowstoneMossyMattock = new InfiToolMattock(PHInfiHybrids.mossyMattockID+7, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Glowstone, "glowstoneMossyMattock");
        	cactusMossyMattock = new InfiToolMattock(PHInfiHybrids.mossyMattockID+8, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Cactus, "cactusMossyMattock");
        	blazeMossyMattock = new InfiToolMattock(PHInfiHybrids.mossyMattockID+9, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Blaze, "blazeMossyMattock");
        	manyullynMossyMattock = new InfiToolMattock(PHInfiHybrids.mossyMattockID+10, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Manyullyn, "manyullynMossyMattock");
        	uraniumMossyMattock = new InfiToolMattock(PHInfiHybrids.mossyMattockID+11, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Uranium, "uraniumMossyMattock");
            
            MinecraftForge.setToolClass(woodMossyMattock, "Mattock", InfiMaterialEnum.Mossy.getHarvestLevel());
            MinecraftForge.setToolClass(stoneMossyMattock, "Mattock", InfiMaterialEnum.Mossy.getHarvestLevel());
            MinecraftForge.setToolClass(diamondMossyMattock, "Mattock", InfiMaterialEnum.Mossy.getHarvestLevel());
            MinecraftForge.setToolClass(redstoneMossyMattock, "Mattock", InfiMaterialEnum.Mossy.getHarvestLevel());
            MinecraftForge.setToolClass(boneMossyMattock, "Mattock", InfiMaterialEnum.Mossy.getHarvestLevel());
            MinecraftForge.setToolClass(mossyMossyMattock, "Mattock", InfiMaterialEnum.Mossy.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackMossyMattock, "Mattock", InfiMaterialEnum.Mossy.getHarvestLevel());
            MinecraftForge.setToolClass(glowstoneMossyMattock, "Mattock", InfiMaterialEnum.Mossy.getHarvestLevel());
            MinecraftForge.setToolClass(cactusMossyMattock, "Mattock", InfiMaterialEnum.Mossy.getHarvestLevel());
            MinecraftForge.setToolClass(blazeMossyMattock, "Mattock", InfiMaterialEnum.Mossy.getHarvestLevel());
            MinecraftForge.setToolClass(manyullynMossyMattock, "Mattock", InfiMaterialEnum.Mossy.getHarvestLevel());
            MinecraftForge.setToolClass(uraniumMossyMattock, "Mattock", InfiMaterialEnum.Mossy.getHarvestLevel());
        }
        
        if(PHInfiHybrids.enableNetherrackTools)
        {
        	woodNetherrackMattock = new InfiToolMattock(PHInfiHybrids.netherrackMattockID+0, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Wood, "woodNetherrackMattock");
        	stoneNetherrackMattock = new InfiToolMattock(PHInfiHybrids.netherrackMattockID+1, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Stone, "stoneNetherrackMattock");
        	sandstoneNetherrackMattock = new InfiToolMattock(PHInfiHybrids.netherrackMattockID+2, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Sandstone, "sandstoneNetherrackMattock");
        	boneNetherrackMattock = new InfiToolMattock(PHInfiHybrids.netherrackMattockID+3, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Bone, "boneNetherrackMattock");
        	paperNetherrackMattock = new InfiToolMattock(PHInfiHybrids.netherrackMattockID+4, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Paper, "paperNetherrackMattock");
        	mossyNetherrackMattock = new InfiToolMattock(PHInfiHybrids.netherrackMattockID+5, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Mossy, "mossyNetherrackMattock");
        	netherrackNetherrackMattock = new InfiToolMattock(PHInfiHybrids.netherrackMattockID+6, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Netherrack, "netherrackNetherrackMattock");
        	iceNetherrackMattock = new InfiToolMattock(PHInfiHybrids.netherrackMattockID+7, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Ice, "iceNetherrackMattock");
        	slimeNetherrackMattock = new InfiToolMattock(PHInfiHybrids.netherrackMattockID+8, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Slime, "slimeNetherrackMattock");
        	cactusNetherrackMattock = new InfiToolMattock(PHInfiHybrids.netherrackMattockID+9, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Cactus, "cactusNetherrackMattock");
        	flintNetherrackMattock = new InfiToolMattock(PHInfiHybrids.netherrackMattockID+10, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Flint, "flintNetherrackMattock");
        	copperNetherrackMattock = new InfiToolMattock(PHInfiHybrids.netherrackMattockID+11, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Copper, "copperNetherrackMattock");
        	bronzeNetherrackMattock = new InfiToolMattock(PHInfiHybrids.netherrackMattockID+12, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Bronze, "bronzeNetherrackMattock");
            
            MinecraftForge.setToolClass(woodNetherrackMattock, "Mattock", InfiMaterialEnum.Netherrack.getHarvestLevel());
            MinecraftForge.setToolClass(stoneNetherrackMattock, "Mattock", InfiMaterialEnum.Netherrack.getHarvestLevel());
            MinecraftForge.setToolClass(sandstoneNetherrackMattock, "Mattock", InfiMaterialEnum.Netherrack.getHarvestLevel());
            MinecraftForge.setToolClass(boneNetherrackMattock, "Mattock", InfiMaterialEnum.Netherrack.getHarvestLevel());
            MinecraftForge.setToolClass(paperNetherrackMattock, "Mattock", InfiMaterialEnum.Netherrack.getHarvestLevel());
            MinecraftForge.setToolClass(mossyNetherrackMattock, "Mattock", InfiMaterialEnum.Netherrack.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackNetherrackMattock, "Mattock", InfiMaterialEnum.Netherrack.getHarvestLevel());
            MinecraftForge.setToolClass(iceNetherrackMattock, "Mattock", InfiMaterialEnum.Netherrack.getHarvestLevel());
            MinecraftForge.setToolClass(slimeNetherrackMattock, "Mattock", InfiMaterialEnum.Netherrack.getHarvestLevel());
            MinecraftForge.setToolClass(cactusNetherrackMattock, "Mattock", InfiMaterialEnum.Netherrack.getHarvestLevel());
            MinecraftForge.setToolClass(flintNetherrackMattock, "Mattock", InfiMaterialEnum.Netherrack.getHarvestLevel());
            MinecraftForge.setToolClass(copperNetherrackMattock, "Mattock", InfiMaterialEnum.Netherrack.getHarvestLevel());
            MinecraftForge.setToolClass(bronzeNetherrackMattock, "Mattock", InfiMaterialEnum.Netherrack.getHarvestLevel());
        }
        
        if(PHInfiHybrids.enableGlowstoneTools)
        {
        	woodGlowstoneMattock = new InfiToolMattock(PHInfiHybrids.glowstoneMattockID+0, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Wood, "woodGlowstoneMattock");
        	redstoneGlowstoneMattock = new InfiToolMattock(PHInfiHybrids.glowstoneMattockID+1, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Redstone, "redstoneGlowstoneMattock");
        	obsidianGlowstoneMattock = new InfiToolMattock(PHInfiHybrids.glowstoneMattockID+2, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Obsidian, "obsidianGlowstoneMattock");
        	boneGlowstoneMattock = new InfiToolMattock(PHInfiHybrids.glowstoneMattockID+3, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Bone, "boneGlowstoneMattock");
        	netherrackGlowstoneMattock = new InfiToolMattock(PHInfiHybrids.glowstoneMattockID+4, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Netherrack, "netherrackGlowstoneMattock");
        	glowstoneGlowstoneMattock = new InfiToolMattock(PHInfiHybrids.glowstoneMattockID+5, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Glowstone, "glowstoneGlowstoneMattock");
        	iceGlowstoneMattock = new InfiToolMattock(PHInfiHybrids.glowstoneMattockID+6, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Ice, "iceGlowstoneMattock");
        	slimeGlowstoneMattock = new InfiToolMattock(PHInfiHybrids.glowstoneMattockID+7, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Slime, "slimeGlowstoneMattock");
        	cactusGlowstoneMattock = new InfiToolMattock(PHInfiHybrids.glowstoneMattockID+8, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Cactus, "cactusGlowstoneMattock");
            
            
            MinecraftForge.setToolClass(woodGlowstoneMattock, "Mattock", InfiMaterialEnum.Glowstone.getHarvestLevel());
            MinecraftForge.setToolClass(redstoneGlowstoneMattock, "Mattock", InfiMaterialEnum.Glowstone.getHarvestLevel());
            MinecraftForge.setToolClass(obsidianGlowstoneMattock, "Mattock", InfiMaterialEnum.Glowstone.getHarvestLevel());
            MinecraftForge.setToolClass(boneGlowstoneMattock, "Mattock", InfiMaterialEnum.Glowstone.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackGlowstoneMattock, "Mattock", InfiMaterialEnum.Glowstone.getHarvestLevel());
            MinecraftForge.setToolClass(glowstoneGlowstoneMattock, "Mattock", InfiMaterialEnum.Glowstone.getHarvestLevel());
            MinecraftForge.setToolClass(iceGlowstoneMattock, "Mattock", InfiMaterialEnum.Glowstone.getHarvestLevel());
            MinecraftForge.setToolClass(slimeGlowstoneMattock, "Mattock", InfiMaterialEnum.Glowstone.getHarvestLevel());
            MinecraftForge.setToolClass(cactusGlowstoneMattock, "Mattock", InfiMaterialEnum.Glowstone.getHarvestLevel());
        }
        
        if(PHInfiHybrids.enableIceTools)
        {
        	woodIceMattock = new InfiToolMattock(PHInfiHybrids.iceMattockID+0, 
                    InfiMaterialEnum.Ice, InfiMaterialEnum.Wood, "woodIceMattock");
        	boneIceMattock = new InfiToolMattock(PHInfiHybrids.iceMattockID+1, 
                    InfiMaterialEnum.Ice, InfiMaterialEnum.Bone, "boneIceMattock");
        	paperIceMattock = new InfiToolMattock(PHInfiHybrids.iceMattockID+2, 
                    InfiMaterialEnum.Ice, InfiMaterialEnum.Paper, "paperIceMattock");
        	iceIceMattock = new InfiToolMattock(PHInfiHybrids.iceMattockID+3, 
                    InfiMaterialEnum.Ice, InfiMaterialEnum.Ice, "iceIceMattock");
        	slimeIceMattock = new InfiToolMattock(PHInfiHybrids.iceMattockID+4, 
                    InfiMaterialEnum.Ice, InfiMaterialEnum.Slime, "slimeIceMattock");
        	cactusIceMattock = new InfiToolMattock(PHInfiHybrids.iceMattockID+5, 
                    InfiMaterialEnum.Ice, InfiMaterialEnum.Cactus, "cactusIceMattock");
            
            
            MinecraftForge.setToolClass(woodIceMattock, "Mattock", InfiMaterialEnum.Ice.getHarvestLevel());
            MinecraftForge.setToolClass(boneIceMattock, "Mattock", InfiMaterialEnum.Ice.getHarvestLevel());
            MinecraftForge.setToolClass(paperIceMattock, "Mattock", InfiMaterialEnum.Ice.getHarvestLevel());
            MinecraftForge.setToolClass(iceIceMattock, "Mattock", InfiMaterialEnum.Ice.getHarvestLevel());
            MinecraftForge.setToolClass(slimeIceMattock, "Mattock", InfiMaterialEnum.Ice.getHarvestLevel());
            MinecraftForge.setToolClass(cactusIceMattock, "Mattock", InfiMaterialEnum.Ice.getHarvestLevel());
        }
        
        if(PHInfiHybrids.enableLavaTools)
        {
        	diamondLavaMattock = new InfiToolMattock(PHInfiHybrids.lavaMattockID+0, 
                    InfiMaterialEnum.Lava, InfiMaterialEnum.Diamond, "diamondLavaMattock");
        	obsidianLavaMattock = new InfiToolMattock(PHInfiHybrids.lavaMattockID+1, 
                    InfiMaterialEnum.Lava, InfiMaterialEnum.Obsidian, "obsidianLavaMattock");
        	netherrackLavaMattock = new InfiToolMattock(PHInfiHybrids.lavaMattockID+2, 
                    InfiMaterialEnum.Lava, InfiMaterialEnum.Netherrack, "netherrackLavaMattock");
        	lavaLavaMattock = new InfiToolMattock(PHInfiHybrids.lavaMattockID+3, 
                    InfiMaterialEnum.Lava, InfiMaterialEnum.Lava, "lavaLavaMattock");
        	flintLavaMattock = new InfiToolMattock(PHInfiHybrids.lavaMattockID+4, 
                    InfiMaterialEnum.Lava, InfiMaterialEnum.Flint, "flintLavaMattock");
        	blazeLavaMattock = new InfiToolMattock(PHInfiHybrids.lavaMattockID+5, 
                    InfiMaterialEnum.Lava, InfiMaterialEnum.Blaze, "blazeLavaMattock");
        	manyullynLavaMattock = new InfiToolMattock(PHInfiHybrids.lavaMattockID+6, 
                    InfiMaterialEnum.Lava, InfiMaterialEnum.Manyullyn, "manyullynLavaMattock");
            uraniumLavaMattock = new InfiToolMattock(PHInfiHybrids.lavaMattockID+7, 
                    InfiMaterialEnum.Lava, InfiMaterialEnum.Uranium, "uraniumLavaMattock");
            
            MinecraftForge.setToolClass(diamondLavaMattock, "Mattock", InfiMaterialEnum.Lava.getHarvestLevel());
            MinecraftForge.setToolClass(obsidianLavaMattock, "Mattock", InfiMaterialEnum.Lava.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackLavaMattock, "Mattock", InfiMaterialEnum.Lava.getHarvestLevel());
            MinecraftForge.setToolClass(lavaLavaMattock, "Mattock", InfiMaterialEnum.Lava.getHarvestLevel());
            MinecraftForge.setToolClass(flintLavaMattock, "Mattock", InfiMaterialEnum.Lava.getHarvestLevel());
            MinecraftForge.setToolClass(blazeLavaMattock, "Mattock", InfiMaterialEnum.Lava.getHarvestLevel());
            MinecraftForge.setToolClass(manyullynLavaMattock, "Mattock", InfiMaterialEnum.Lava.getHarvestLevel());
            MinecraftForge.setToolClass(uraniumLavaMattock, "Mattock", InfiMaterialEnum.Lava.getHarvestLevel());
        }
        
        if(PHInfiHybrids.enableSlimeTools)
        {
        	woodSlimeMattock = new InfiToolMattock(PHInfiHybrids.slimeMattockID+0, 
                    InfiMaterialEnum.Slime, InfiMaterialEnum.Wood, "woodSlimeMattock");
        	sandstoneSlimeMattock = new InfiToolMattock(PHInfiHybrids.slimeMattockID+1, 
                    InfiMaterialEnum.Slime, InfiMaterialEnum.Sandstone, "sandstoneSlimeMattock");
        	boneSlimeMattock = new InfiToolMattock(PHInfiHybrids.slimeMattockID+2, 
                    InfiMaterialEnum.Slime, InfiMaterialEnum.Bone, "boneSlimeMattock");
        	paperSlimeMattock = new InfiToolMattock(PHInfiHybrids.slimeMattockID+3, 
                    InfiMaterialEnum.Slime, InfiMaterialEnum.Paper, "paperSlimeMattock");
        	slimeSlimeMattock = new InfiToolMattock(PHInfiHybrids.slimeMattockID+4, 
                    InfiMaterialEnum.Slime, InfiMaterialEnum.Slime, "slimeSlimeMattock");
        	cactusSlimeMattock = new InfiToolMattock(PHInfiHybrids.slimeMattockID+5, 
                    InfiMaterialEnum.Slime, InfiMaterialEnum.Cactus, "cactusSlimeMattock");
            
            MinecraftForge.setToolClass(woodSlimeMattock, "Mattock", InfiMaterialEnum.Slime.getHarvestLevel());
            MinecraftForge.setToolClass(sandstoneSlimeMattock, "Mattock", InfiMaterialEnum.Slime.getHarvestLevel());
            MinecraftForge.setToolClass(boneSlimeMattock, "Mattock", InfiMaterialEnum.Slime.getHarvestLevel());
            MinecraftForge.setToolClass(paperSlimeMattock, "Mattock", InfiMaterialEnum.Slime.getHarvestLevel());
            MinecraftForge.setToolClass(slimeSlimeMattock, "Mattock", InfiMaterialEnum.Slime.getHarvestLevel());
            MinecraftForge.setToolClass(cactusSlimeMattock, "Mattock", InfiMaterialEnum.Slime.getHarvestLevel());
        }
        
        if(PHInfiHybrids.enableCactusTools)
        {
        	woodCactusMattock = new InfiToolMattock(PHInfiHybrids.cactusMattockID+0, 
                    InfiMaterialEnum.Cactus, InfiMaterialEnum.Wood, "woodCactusMattock");
        	sandstoneCactusMattock = new InfiToolMattock(PHInfiHybrids.cactusMattockID+1, 
                    InfiMaterialEnum.Cactus, InfiMaterialEnum.Sandstone, "sandstoneCactusMattock");
        	boneCactusMattock = new InfiToolMattock(PHInfiHybrids.cactusMattockID+2, 
                    InfiMaterialEnum.Cactus, InfiMaterialEnum.Bone, "boneCactusMattock");
        	netherrackCactusMattock = new InfiToolMattock(PHInfiHybrids.cactusMattockID+3, 
                    InfiMaterialEnum.Cactus, InfiMaterialEnum.Netherrack, "netherrackCactusMattock");
        	iceCactusMattock = new InfiToolMattock(PHInfiHybrids.cactusMattockID+4, 
                    InfiMaterialEnum.Cactus, InfiMaterialEnum.Ice, "iceCactusMattock");
        	slimeCactusMattock = new InfiToolMattock(PHInfiHybrids.cactusMattockID+5, 
                    InfiMaterialEnum.Cactus, InfiMaterialEnum.Slime, "slimeCactusMattock");
        	cactusCactusMattock = new InfiToolMattock(PHInfiHybrids.cactusMattockID+6, 
                    InfiMaterialEnum.Cactus, InfiMaterialEnum.Cactus, "cactusCactusMattock");
            
            MinecraftForge.setToolClass(woodCactusMattock, "Mattock", InfiMaterialEnum.Cactus.getHarvestLevel());
            MinecraftForge.setToolClass(sandstoneCactusMattock, "Mattock", InfiMaterialEnum.Cactus.getHarvestLevel());
            MinecraftForge.setToolClass(boneCactusMattock, "Mattock", InfiMaterialEnum.Cactus.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackCactusMattock, "Mattock", InfiMaterialEnum.Cactus.getHarvestLevel());
            MinecraftForge.setToolClass(iceCactusMattock, "Mattock", InfiMaterialEnum.Cactus.getHarvestLevel());
            MinecraftForge.setToolClass(slimeCactusMattock, "Mattock", InfiMaterialEnum.Cactus.getHarvestLevel());
            MinecraftForge.setToolClass(cactusCactusMattock, "Mattock", InfiMaterialEnum.Cactus.getHarvestLevel());
        }
        
        if(PHInfiHybrids.enableFlintTools)
        {
        	woodFlintMattock = new InfiToolMattock(PHInfiHybrids.flintMattockID+0, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Wood, "woodFlintMattock");
        	stoneFlintMattock = new InfiToolMattock(PHInfiHybrids.flintMattockID+1, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Stone, "stoneFlintMattock");
        	sandstoneFlintMattock = new InfiToolMattock(PHInfiHybrids.flintMattockID+2, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Sandstone, "sandstoneFlintMattock");
        	boneFlintMattock = new InfiToolMattock(PHInfiHybrids.flintMattockID+3, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Bone, "boneFlintMattock");
        	netherrackFlintMattock = new InfiToolMattock(PHInfiHybrids.flintMattockID+4, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Netherrack, "netherrackFlintMattock");
        	slimeFlintMattock = new InfiToolMattock(PHInfiHybrids.flintMattockID+5, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Slime, "slimeFlintMattock");
        	cactusFlintMattock = new InfiToolMattock(PHInfiHybrids.flintMattockID+6, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Cactus, "cactusFlintMattock");
        	flintFlintMattock = new InfiToolMattock(PHInfiHybrids.flintMattockID+7, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Flint, "flintFlintMattock");
        	copperFlintMattock = new InfiToolMattock(PHInfiHybrids.flintMattockID+8, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Copper, "copperFlintMattock");
        	bronzeFlintMattock = new InfiToolMattock(PHInfiHybrids.flintMattockID+9, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Bronze, "bronzeFlintMattock");
            
            MinecraftForge.setToolClass(woodFlintMattock, "Mattock", InfiMaterialEnum.Flint.getHarvestLevel());
            MinecraftForge.setToolClass(stoneFlintMattock, "Mattock", InfiMaterialEnum.Flint.getHarvestLevel());
            MinecraftForge.setToolClass(sandstoneFlintMattock, "Mattock", InfiMaterialEnum.Flint.getHarvestLevel());
            MinecraftForge.setToolClass(boneFlintMattock, "Mattock", InfiMaterialEnum.Flint.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackFlintMattock, "Mattock", InfiMaterialEnum.Flint.getHarvestLevel());
            MinecraftForge.setToolClass(slimeFlintMattock, "Mattock", InfiMaterialEnum.Flint.getHarvestLevel());
            MinecraftForge.setToolClass(cactusFlintMattock, "Mattock", InfiMaterialEnum.Flint.getHarvestLevel());
            MinecraftForge.setToolClass(flintFlintMattock, "Mattock", InfiMaterialEnum.Flint.getHarvestLevel());
            MinecraftForge.setToolClass(copperFlintMattock, "Mattock", InfiMaterialEnum.Flint.getHarvestLevel());
            MinecraftForge.setToolClass(bronzeFlintMattock, "Mattock", InfiMaterialEnum.Flint.getHarvestLevel());
        }
        
        if(PHInfiHybrids.enableBlazeTools)
        {
        	diamondBlazeMattock = new InfiToolMattock(PHInfiHybrids.blazeMattockID+0, 
                    InfiMaterialEnum.Blaze, InfiMaterialEnum.Diamond, "diamondBlazeMattock");
        	obsidianBlazeMattock = new InfiToolMattock(PHInfiHybrids.blazeMattockID+1, 
                    InfiMaterialEnum.Blaze, InfiMaterialEnum.Obsidian, "obsidianBlazeMattock");
        	netherrackBlazeMattock = new InfiToolMattock(PHInfiHybrids.blazeMattockID+2, 
                    InfiMaterialEnum.Blaze, InfiMaterialEnum.Netherrack, "netherrackBlazeMattock");
        	lavaBlazeMattock = new InfiToolMattock(PHInfiHybrids.blazeMattockID+3, 
                    InfiMaterialEnum.Blaze, InfiMaterialEnum.Lava, "lavaBlazeMattock");
        	flintBlazeMattock = new InfiToolMattock(PHInfiHybrids.blazeMattockID+4, 
                    InfiMaterialEnum.Blaze, InfiMaterialEnum.Flint, "flintBlazeMattock");
        	blazeBlazeMattock = new InfiToolMattock(PHInfiHybrids.blazeMattockID+5, 
                    InfiMaterialEnum.Blaze, InfiMaterialEnum.Blaze, "blazeBlazeMattock");
        	manyullynBlazeMattock = new InfiToolMattock(PHInfiHybrids.blazeMattockID+6, 
                    InfiMaterialEnum.Blaze, InfiMaterialEnum.Manyullyn, "manyullynBlazeMattock");
            uraniumBlazeMattock = new InfiToolMattock(PHInfiHybrids.blazeMattockID+7, 
                    InfiMaterialEnum.Blaze, InfiMaterialEnum.Uranium, "uraniumBlazeMattock");
            
            MinecraftForge.setToolClass(diamondBlazeMattock, "Mattock", InfiMaterialEnum.Blaze.getHarvestLevel());
            MinecraftForge.setToolClass(obsidianBlazeMattock, "Mattock", InfiMaterialEnum.Blaze.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackBlazeMattock, "Mattock", InfiMaterialEnum.Blaze.getHarvestLevel());
            MinecraftForge.setToolClass(blazeBlazeMattock, "Mattock", InfiMaterialEnum.Blaze.getHarvestLevel());
            MinecraftForge.setToolClass(flintBlazeMattock, "Mattock", InfiMaterialEnum.Blaze.getHarvestLevel());
            MinecraftForge.setToolClass(blazeBlazeMattock, "Mattock", InfiMaterialEnum.Blaze.getHarvestLevel());
            MinecraftForge.setToolClass(manyullynBlazeMattock, "Mattock", InfiMaterialEnum.Blaze.getHarvestLevel());
            MinecraftForge.setToolClass(uraniumBlazeMattock, "Mattock", InfiMaterialEnum.Blaze.getHarvestLevel());
        }
    	
        if(PHInfiHybrids.enableCopperTools)
        {
        	woodCopperMattock = new InfiToolMattock(PHInfiHybrids.copperMattockID+0, 
                    InfiMaterialEnum.Copper, InfiMaterialEnum.Wood, "woodCopperMattock");
            stoneCopperMattock = new InfiToolMattock(PHInfiHybrids.copperMattockID+1, 
                    InfiMaterialEnum.Copper, InfiMaterialEnum.Stone, "stoneCopperMattock");
            boneCopperMattock = new InfiToolMattock(PHInfiHybrids.copperMattockID+2, 
                    InfiMaterialEnum.Copper, InfiMaterialEnum.Bone, "boneCopperMattock");
            netherrackCopperMattock = new InfiToolMattock(PHInfiHybrids.copperMattockID+3, 
                    InfiMaterialEnum.Copper, InfiMaterialEnum.Netherrack, "netherrackCopperMattock");
            slimeCopperMattock = new InfiToolMattock(PHInfiHybrids.copperMattockID+4, 
                    InfiMaterialEnum.Copper, InfiMaterialEnum.Slime, "slimeCopperMattock");
            cactusCopperMattock = new InfiToolMattock(PHInfiHybrids.copperMattockID+5, 
                    InfiMaterialEnum.Copper, InfiMaterialEnum.Cactus, "cactusCopperMattock");
            flintCopperMattock = new InfiToolMattock(PHInfiHybrids.copperMattockID+6, 
                    InfiMaterialEnum.Copper, InfiMaterialEnum.Flint, "flintCopperMattock");
            copperCopperMattock = new InfiToolMattock(PHInfiHybrids.copperMattockID+7, 
                    InfiMaterialEnum.Copper, InfiMaterialEnum.Copper, "copperCopperMattock");
            
            MinecraftForge.setToolClass(woodCopperMattock, "Mattock", InfiMaterialEnum.Copper.getHarvestLevel());
        	MinecraftForge.setToolClass(stoneCopperMattock, "Mattock", InfiMaterialEnum.Copper.getHarvestLevel());
            MinecraftForge.setToolClass(boneCopperMattock, "Mattock", InfiMaterialEnum.Copper.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackCopperMattock, "Mattock", InfiMaterialEnum.Copper.getHarvestLevel());
            MinecraftForge.setToolClass(slimeCopperMattock, "Mattock", InfiMaterialEnum.Copper.getHarvestLevel());
            MinecraftForge.setToolClass(cactusCopperMattock, "Mattock", InfiMaterialEnum.Copper.getHarvestLevel());
            MinecraftForge.setToolClass(flintCopperMattock, "Mattock", InfiMaterialEnum.Copper.getHarvestLevel());
            MinecraftForge.setToolClass(copperCopperMattock, "Mattock", InfiMaterialEnum.Copper.getHarvestLevel());
        }
        
        if(PHInfiHybrids.enableBronzeTools)
        {
        	woodBronzeMattock = new InfiToolMattock(PHInfiHybrids.bronzeMattockID+0, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Wood, "woodBronzeMattock");
            stoneBronzeMattock = new InfiToolMattock(PHInfiHybrids.bronzeMattockID+1, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Stone, "stoneBronzeMattock");
            boneBronzeMattock = new InfiToolMattock(PHInfiHybrids.bronzeMattockID+2, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Bone, "boneBronzeMattock");
            netherrackBronzeMattock = new InfiToolMattock(PHInfiHybrids.bronzeMattockID+3, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Netherrack, "netherrackBronzeMattock");
            slimeBronzeMattock = new InfiToolMattock(PHInfiHybrids.bronzeMattockID+4, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Slime, "slimeBronzeMattock");
            cactusBronzeMattock = new InfiToolMattock(PHInfiHybrids.bronzeMattockID+5, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Cactus, "cactusBronzeMattock");
            flintBronzeMattock = new InfiToolMattock(PHInfiHybrids.bronzeMattockID+6, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Flint, "flintBronzeMattock");
            copperBronzeMattock = new InfiToolMattock(PHInfiHybrids.bronzeMattockID+7, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Copper, "copperBronzeMattock");
            bronzeBronzeMattock = new InfiToolMattock(PHInfiHybrids.bronzeMattockID+8, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Bronze, "bronzeBronzeMattock");
            
            MinecraftForge.setToolClass(woodBronzeMattock, "Mattock", InfiMaterialEnum.Bronze.getHarvestLevel());
            MinecraftForge.setToolClass(stoneBronzeMattock, "Mattock", InfiMaterialEnum.Bronze.getHarvestLevel());
            MinecraftForge.setToolClass(boneBronzeMattock, "Mattock", InfiMaterialEnum.Bronze.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackBronzeMattock, "Mattock", InfiMaterialEnum.Bronze.getHarvestLevel());
            MinecraftForge.setToolClass(slimeBronzeMattock, "Mattock", InfiMaterialEnum.Bronze.getHarvestLevel());
            MinecraftForge.setToolClass(cactusBronzeMattock, "Mattock", InfiMaterialEnum.Bronze.getHarvestLevel());
            MinecraftForge.setToolClass(flintBronzeMattock, "Mattock", InfiMaterialEnum.Bronze.getHarvestLevel());
            MinecraftForge.setToolClass(copperBronzeMattock, "Mattock", InfiMaterialEnum.Bronze.getHarvestLevel());
            MinecraftForge.setToolClass(bronzeBronzeMattock, "Mattock", InfiMaterialEnum.Bronze.getHarvestLevel());
        }
        
        if(PHInfiHybrids.enableWorkedIronTools)
        {
        	woodWorkedIronMattock = new InfiToolMattock(PHInfiHybrids.workedIronMattockID+0, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Wood, "woodWorkedIronMattock");
            stoneWorkedIronMattock = new InfiToolMattock(PHInfiHybrids.workedIronMattockID+1, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Stone, "stoneWorkedIronMattock");
            ironWorkedIronMattock = new InfiToolMattock(PHInfiHybrids.workedIronMattockID+2,
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Iron, "ironWorkedIronMattock");
            diamondWorkedIronMattock = new InfiToolMattock(PHInfiHybrids.workedIronMattockID+3, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Diamond, "diamondWorkedIronMattock");
            redstoneWorkedIronMattock = new InfiToolMattock(PHInfiHybrids.workedIronMattockID+4, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Redstone, "redstoneWorkedIronMattock");
            obsidianWorkedIronMattock = new InfiToolMattock(PHInfiHybrids.workedIronMattockID+5, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Obsidian, "obsidianWorkedIronMattock");
            boneWorkedIronMattock = new InfiToolMattock(PHInfiHybrids.workedIronMattockID+6, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Bone, "boneWorkedIronMattock");
            netherrackWorkedIronMattock = new InfiToolMattock(PHInfiHybrids.workedIronMattockID+7, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Netherrack, "netherrackWorkedIronMattock");
            glowstoneWorkedIronMattock = new InfiToolMattock(PHInfiHybrids.workedIronMattockID+8, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Glowstone, "glowstoneWorkedIronMattock");
            iceWorkedIronMattock = new InfiToolMattock(PHInfiHybrids.workedIronMattockID+9, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Ice, "iceWorkedIronMattock");
            slimeWorkedIronMattock = new InfiToolMattock(PHInfiHybrids.workedIronMattockID+10, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Slime, "slimeWorkedIronMattock");
            cactusWorkedIronMattock = new InfiToolMattock(PHInfiHybrids.workedIronMattockID+11, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Cactus, "cactusWorkedIronMattock");
            blazeWorkedIronMattock = new InfiToolMattock(PHInfiHybrids.workedIronMattockID+12, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Blaze, "blazeWorkedIronMattock");
            copperWorkedIronMattock = new InfiToolMattock(PHInfiHybrids.workedIronMattockID+13, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Copper, "copperWorkedIronMattock");
            bronzeWorkedIronMattock = new InfiToolMattock(PHInfiHybrids.workedIronMattockID+14, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Bronze, "bronzeWorkedIronMattock");
            workedWorkedIronMattock = new InfiToolMattock(PHInfiHybrids.workedIronMattockID+15, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.WorkedIron, "workedWorkedIronMattock");
            steelWorkedIronMattock = new InfiToolMattock(PHInfiHybrids.workedIronMattockID+16, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Steel, "steelWorkedIronMattock");
            uraniumWorkedIronMattock = new InfiToolMattock(PHInfiHybrids.workedIronMattockID+17, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Uranium, "uraniumWorkedIronMattock");
            
            MinecraftForge.setToolClass(woodWorkedIronMattock, "Mattock", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(stoneWorkedIronMattock, "Mattock", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(ironWorkedIronMattock, "Mattock", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(diamondWorkedIronMattock, "Mattock", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(redstoneWorkedIronMattock, "Mattock", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(obsidianWorkedIronMattock, "Mattock", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(boneWorkedIronMattock, "Mattock", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackWorkedIronMattock, "Mattock", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(glowstoneWorkedIronMattock, "Mattock", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(iceWorkedIronMattock, "Mattock", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(slimeWorkedIronMattock, "Mattock", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(cactusWorkedIronMattock, "Mattock", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(blazeWorkedIronMattock, "Mattock", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(copperWorkedIronMattock, "Mattock", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(bronzeWorkedIronMattock, "Mattock", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(workedWorkedIronMattock, "Mattock", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(steelWorkedIronMattock, "Mattock", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(uraniumWorkedIronMattock, "Mattock", InfiMaterialEnum.WorkedIron.getHarvestLevel());
        }
        
        if(PHInfiHybrids.enableSteelTools)
        {
        	woodSteelMattock = new InfiToolMattock(PHInfiHybrids.steelMattockID+0, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Wood, "woodSteelMattock");
            stoneSteelMattock = new InfiToolMattock(PHInfiHybrids.steelMattockID+1, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Stone, "stoneSteelMattock");
            ironSteelMattock = new InfiToolMattock(PHInfiHybrids.steelMattockID+2, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Iron, "ironSteelMattock");
            diamondSteelMattock = new InfiToolMattock(PHInfiHybrids.steelMattockID+3, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Diamond, "diamondSteelMattock");
            redstoneSteelMattock = new InfiToolMattock(PHInfiHybrids.steelMattockID+4, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Redstone, "redstoneSteelMattock");
            obsidianSteelMattock = new InfiToolMattock(PHInfiHybrids.steelMattockID+5, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Obsidian, "obsidianSteelMattock");
            boneSteelMattock = new InfiToolMattock(PHInfiHybrids.steelMattockID+6, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Bone, "boneSteelMattock");
            netherrackSteelMattock = new InfiToolMattock(PHInfiHybrids.steelMattockID+7, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Netherrack, "netherrackSteelMattock");
            glowstoneSteelMattock = new InfiToolMattock(PHInfiHybrids.steelMattockID+8, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Glowstone, "glowstoneSteelMattock");
            iceSteelMattock = new InfiToolMattock(PHInfiHybrids.steelMattockID+9, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Ice, "iceSteelMattock");
            slimeSteelMattock = new InfiToolMattock(PHInfiHybrids.steelMattockID+10, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Slime, "slimeSteelMattock");
            cactusSteelMattock = new InfiToolMattock(PHInfiHybrids.steelMattockID+11, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Cactus, "cactusSteelMattock");
            blazeSteelMattock = new InfiToolMattock(PHInfiHybrids.steelMattockID+12, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Blaze, "blazeSteelMattock");
            copperSteelMattock = new InfiToolMattock(PHInfiHybrids.steelMattockID+13, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Copper, "copperSteelMattock");
            bronzeSteelMattock = new InfiToolMattock(PHInfiHybrids.steelMattockID+14, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Bronze, "bronzeSteelMattock");
            workedSteelMattock = new InfiToolMattock(PHInfiHybrids.steelMattockID+15, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.WorkedIron, "workedSteelMattock");
            steelSteelMattock = new InfiToolMattock(PHInfiHybrids.steelMattockID+16, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Steel, "steelSteelMattock");
            cobaltSteelMattock = new InfiToolMattock(PHInfiHybrids.steelMattockID+17, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Cobalt, "cobaltSteelMattock");
            arditeSteelMattock = new InfiToolMattock(PHInfiHybrids.steelMattockID+18, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Ardite, "arditeSteelMattock");
            uraniumSteelMattock = new InfiToolMattock(PHInfiHybrids.steelMattockID+19, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Uranium, "uraniumSteelMattock");

            MinecraftForge.setToolClass(woodSteelMattock, "Mattock", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(stoneSteelMattock, "Mattock", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(ironSteelMattock, "Mattock", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(diamondSteelMattock, "Mattock", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(redstoneSteelMattock, "Mattock", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(obsidianSteelMattock, "Mattock", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(boneSteelMattock, "Mattock", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackSteelMattock, "Mattock", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(glowstoneSteelMattock, "Mattock", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(iceSteelMattock, "Mattock", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(slimeSteelMattock, "Mattock", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(cactusSteelMattock, "Mattock", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(blazeSteelMattock, "Mattock", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(copperSteelMattock, "Mattock", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(bronzeSteelMattock, "Mattock", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(workedSteelMattock, "Mattock", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(steelSteelMattock, "Mattock", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(cobaltSteelMattock, "Mattock", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(arditeSteelMattock, "Mattock", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(uraniumSteelMattock, "Mattock", InfiMaterialEnum.Steel.getHarvestLevel());
        }
        
        if(PHInfiHybrids.enableCobaltTools)
        {
        	woodCobaltMattock = new InfiToolMattock(PHInfiHybrids.cobaltMattockID+0, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Wood, "woodCobaltMattock");
            stoneCobaltMattock = new InfiToolMattock(PHInfiHybrids.cobaltMattockID+1, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Stone, "stoneCobaltMattock");
            ironCobaltMattock = new InfiToolMattock(PHInfiHybrids.cobaltMattockID+2, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Iron, "ironCobaltMattock");
            diamondCobaltMattock = new InfiToolMattock(PHInfiHybrids.cobaltMattockID+3,
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Diamond, "diamondCobaltMattock");
            redstoneCobaltMattock = new InfiToolMattock(PHInfiHybrids.cobaltMattockID+4, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Redstone, "redstoneCobaltMattock");
            obsidianCobaltMattock = new InfiToolMattock(PHInfiHybrids.cobaltMattockID+5, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Obsidian, "obsidianCobaltMattock");
            boneCobaltMattock = new InfiToolMattock(PHInfiHybrids.cobaltMattockID+6, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Bone, "boneCobaltMattock");
            slimeCobaltMattock = new InfiToolMattock(PHInfiHybrids.cobaltMattockID+7, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Slime, "slimeCobaltMattock");
            cactusCobaltMattock = new InfiToolMattock(PHInfiHybrids.cobaltMattockID+8, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Cactus, "cactusCobaltMattock");
            blazeCobaltMattock = new InfiToolMattock(PHInfiHybrids.cobaltMattockID+9, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Blaze, "blazeCobaltMattock");
            copperCobaltMattock = new InfiToolMattock(PHInfiHybrids.cobaltMattockID+10, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Copper, "copperCobaltMattock");
            bronzeCobaltMattock = new InfiToolMattock(PHInfiHybrids.cobaltMattockID+11, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Bronze, "bronzeCobaltMattock");
            workedCobaltMattock = new InfiToolMattock(PHInfiHybrids.cobaltMattockID+12, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.WorkedIron, "workedCobaltMattock");
            steelCobaltMattock = new InfiToolMattock(PHInfiHybrids.cobaltMattockID+13, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Steel, "steelCobaltMattock");
            cobaltCobaltMattock = new InfiToolMattock(PHInfiHybrids.cobaltMattockID+14, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Cobalt, "cobaltCobaltMattock");
            arditeCobaltMattock = new InfiToolMattock(PHInfiHybrids.cobaltMattockID+15, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Ardite, "arditeCobaltMattock");
            manyullynCobaltMattock = new InfiToolMattock(PHInfiHybrids.cobaltMattockID+16, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Manyullyn, "manyullynCobaltMattock");
            uraniumCobaltMattock = new InfiToolMattock(PHInfiHybrids.cobaltMattockID+17, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Uranium, "uraniumCobaltMattock");
            
            MinecraftForge.setToolClass(woodCobaltMattock, "Mattock", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(stoneCobaltMattock, "Mattock", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(ironCobaltMattock, "Mattock", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(diamondCobaltMattock, "Mattock", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(redstoneCobaltMattock, "Mattock", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(obsidianCobaltMattock, "Mattock", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(boneCobaltMattock, "Mattock", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(slimeCobaltMattock, "Mattock", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(cactusCobaltMattock, "Mattock", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(blazeCobaltMattock, "Mattock", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(copperCobaltMattock, "Mattock", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(bronzeCobaltMattock, "Mattock", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(workedCobaltMattock, "Mattock", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(steelCobaltMattock, "Mattock", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(cobaltCobaltMattock, "Mattock", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(arditeCobaltMattock, "Mattock", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(manyullynCobaltMattock, "Mattock", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(uraniumCobaltMattock, "Mattock", InfiMaterialEnum.Cobalt.getHarvestLevel());
        }
        
        if(PHInfiHybrids.enableArditeTools)
        {
        	woodArditeMattock = new InfiToolMattock(PHInfiHybrids.arditeMattockID+0, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Wood, "woodArditeMattock");
            stoneArditeMattock = new InfiToolMattock(PHInfiHybrids.arditeMattockID+1, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Stone, "stoneArditeMattock");
            ironArditeMattock = new InfiToolMattock(PHInfiHybrids.arditeMattockID+2, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Iron, "ironArditeMattock");
            diamondArditeMattock = new InfiToolMattock(PHInfiHybrids.arditeMattockID+3,
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Diamond, "diamondArditeMattock");
            redstoneArditeMattock = new InfiToolMattock(PHInfiHybrids.arditeMattockID+4, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Redstone, "redstoneArditeMattock");
            obsidianArditeMattock = new InfiToolMattock(PHInfiHybrids.arditeMattockID+5, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Obsidian, "obsidianArditeMattock");
            boneArditeMattock = new InfiToolMattock(PHInfiHybrids.arditeMattockID+6,
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Bone, "boneArditeMattock");
            slimeArditeMattock = new InfiToolMattock(PHInfiHybrids.arditeMattockID+7, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Slime, "slimeArditeMattock");
            cactusArditeMattock = new InfiToolMattock(PHInfiHybrids.arditeMattockID+8, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Cactus, "cactusArditeMattock");
            blazeArditeMattock = new InfiToolMattock(PHInfiHybrids.arditeMattockID+9, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Blaze, "blazeArditeMattock");
            copperArditeMattock = new InfiToolMattock(PHInfiHybrids.arditeMattockID+10, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Copper, "copperArditeMattock");
            bronzeArditeMattock = new InfiToolMattock(PHInfiHybrids.arditeMattockID+11, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Bronze, "bronzeArditeMattock");
            workedArditeMattock = new InfiToolMattock(PHInfiHybrids.arditeMattockID+12, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.WorkedIron, "workedArditeMattock");
            steelArditeMattock = new InfiToolMattock(PHInfiHybrids.arditeMattockID+13, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Steel, "steelArditeMattock");
            cobaltArditeMattock = new InfiToolMattock(PHInfiHybrids.arditeMattockID+14, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Cobalt, "cobaltArditeMattock");
            arditeArditeMattock = new InfiToolMattock(PHInfiHybrids.arditeMattockID+15, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Ardite, "arditeArditeMattock");
            manyullynArditeMattock = new InfiToolMattock(PHInfiHybrids.arditeMattockID+16, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Manyullyn, "manyullynArditeMattock");
            uraniumArditeMattock = new InfiToolMattock(PHInfiHybrids.arditeMattockID+17, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Uranium, "uraniumArditeMattock");
            
            MinecraftForge.setToolClass(woodArditeMattock, "Mattock", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(stoneArditeMattock, "Mattock", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(ironArditeMattock, "Mattock", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(diamondArditeMattock, "Mattock", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(redstoneArditeMattock, "Mattock", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(obsidianArditeMattock, "Mattock", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(boneArditeMattock, "Mattock", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(slimeArditeMattock, "Mattock", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(cactusArditeMattock, "Mattock", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(blazeArditeMattock, "Mattock", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(copperArditeMattock, "Mattock", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(bronzeArditeMattock, "Mattock", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(workedArditeMattock, "Mattock", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(steelArditeMattock, "Mattock", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(cobaltArditeMattock, "Mattock", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(arditeArditeMattock, "Mattock", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(manyullynArditeMattock, "Mattock", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(uraniumArditeMattock, "Mattock", InfiMaterialEnum.Ardite.getHarvestLevel());
        }
        
        if(PHInfiHybrids.enableManyullynTools)
        {
        	woodManyullynMattock = new InfiToolMattock(PHInfiHybrids.manyullynMattockID+0, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Wood, "woodManyullynMattock");
            stoneManyullynMattock = new InfiToolMattock(PHInfiHybrids.manyullynMattockID+1, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Stone, "stoneManyullynMattock");
            ironManyullynMattock = new InfiToolMattock(PHInfiHybrids.manyullynMattockID+2, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Iron, "ironManyullynMattock");
            diamondManyullynMattock = new InfiToolMattock(PHInfiHybrids.manyullynMattockID+3,
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Diamond, "diamondManyullynMattock");
            redstoneManyullynMattock = new InfiToolMattock(PHInfiHybrids.manyullynMattockID+4, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Redstone, "redstoneManyullynMattock");
            obsidianManyullynMattock = new InfiToolMattock(PHInfiHybrids.manyullynMattockID+5, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Obsidian, "obsidianManyullynMattock");
            boneManyullynMattock = new InfiToolMattock(PHInfiHybrids.manyullynMattockID+6, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Bone, "boneManyullynMattock");
            slimeManyullynMattock = new InfiToolMattock(PHInfiHybrids.manyullynMattockID+7, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Slime, "slimeManyullynMattock");
            cactusManyullynMattock = new InfiToolMattock(PHInfiHybrids.manyullynMattockID+8, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Cactus, "cactusManyullynMattock");
            blazeManyullynMattock = new InfiToolMattock(PHInfiHybrids.manyullynMattockID+9, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Blaze, "blazeManyullynMattock");
            copperManyullynMattock = new InfiToolMattock(PHInfiHybrids.manyullynMattockID+10, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Copper, "copperManyullynMattock");
            bronzeManyullynMattock = new InfiToolMattock(PHInfiHybrids.manyullynMattockID+11, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Bronze, "bronzeManyullynMattock");
            workedManyullynMattock = new InfiToolMattock(PHInfiHybrids.manyullynMattockID+12, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.WorkedIron, "workedManyullynMattock");
            steelManyullynMattock = new InfiToolMattock(PHInfiHybrids.manyullynMattockID+13, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Steel, "steelManyullynMattock");
            cobaltManyullynMattock = new InfiToolMattock(PHInfiHybrids.manyullynMattockID+14, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Cobalt, "cobaltManyullynMattock");
            arditeManyullynMattock = new InfiToolMattock(PHInfiHybrids.manyullynMattockID+15, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Ardite, "arditeManyullynMattock");
            manyullynManyullynMattock = new InfiToolMattock(PHInfiHybrids.manyullynMattockID+16, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Manyullyn, "manyullynManyullynMattock");
            uraniumManyullynMattock = new InfiToolMattock(PHInfiHybrids.manyullynMattockID+17,
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Uranium, "uraniumManyullynMattock");
            
            MinecraftForge.setToolClass(woodManyullynMattock, "Mattock", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(stoneManyullynMattock, "Mattock", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(ironManyullynMattock, "Mattock", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(diamondManyullynMattock, "Mattock", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(redstoneManyullynMattock, "Mattock", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(obsidianManyullynMattock, "Mattock", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(boneManyullynMattock, "Mattock", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(slimeManyullynMattock, "Mattock", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(cactusManyullynMattock, "Mattock", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(blazeManyullynMattock, "Mattock", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(copperManyullynMattock, "Mattock", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(bronzeManyullynMattock, "Mattock", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(workedManyullynMattock, "Mattock", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(steelManyullynMattock, "Mattock", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(cobaltManyullynMattock, "Mattock", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(arditeManyullynMattock, "Mattock", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(manyullynManyullynMattock, "Mattock", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(uraniumManyullynMattock, "Mattock", InfiMaterialEnum.Manyullyn.getHarvestLevel());
        }
        
        if(PHInfiHybrids.enableUraniumTools)
        {
            diamondUraniumMattock = new InfiToolMattock(PHInfiHybrids.uraniumMattockID+0, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Diamond, "diamondUraniumMattock");
            redstoneUraniumMattock = new InfiToolMattock(PHInfiHybrids.uraniumMattockID+1, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Redstone, "redstoneUraniumMattock");
            boneUraniumMattock = new InfiToolMattock(PHInfiHybrids.uraniumMattockID+2, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Bone, "boneUraniumMattock");
            netherrackUraniumMattock = new InfiToolMattock(PHInfiHybrids.uraniumMattockID+3, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Netherrack, "netherrackUraniumMattock");
            glowstoneUraniumMattock = new InfiToolMattock(PHInfiHybrids.uraniumMattockID+4, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Glowstone, "glowstoneUraniumMattock");
            lavaUraniumMattock = new InfiToolMattock(PHInfiHybrids.uraniumMattockID+5, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Lava, "lavaUraniumMattock");
            blazeUraniumMattock = new InfiToolMattock(PHInfiHybrids.uraniumMattockID+6, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Blaze, "blazeUraniumMattock");
            cobaltUraniumMattock = new InfiToolMattock(PHInfiHybrids.uraniumMattockID+7, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Cobalt, "cobaltUraniumMattock");
            arditeUraniumMattock = new InfiToolMattock(PHInfiHybrids.uraniumMattockID+8, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Ardite, "arditeUraniumMattock");
            uraniumUraniumMattock = new InfiToolMattock(PHInfiHybrids.uraniumMattockID+9, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Uranium, "uraniumUraniumMattock");
            
            MinecraftForge.setToolClass(diamondUraniumMattock, "Mattock", InfiMaterialEnum.Uranium.getHarvestLevel());
            MinecraftForge.setToolClass(redstoneUraniumMattock, "Mattock", InfiMaterialEnum.Uranium.getHarvestLevel());
            MinecraftForge.setToolClass(boneUraniumMattock, "Mattock", InfiMaterialEnum.Uranium.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackUraniumMattock, "Mattock", InfiMaterialEnum.Uranium.getHarvestLevel());
            MinecraftForge.setToolClass(glowstoneUraniumMattock, "Mattock", InfiMaterialEnum.Uranium.getHarvestLevel());
            MinecraftForge.setToolClass(lavaUraniumMattock, "Mattock", InfiMaterialEnum.Uranium.getHarvestLevel());
            MinecraftForge.setToolClass(blazeUraniumMattock, "Mattock", InfiMaterialEnum.Uranium.getHarvestLevel());
            MinecraftForge.setToolClass(cobaltUraniumMattock, "Mattock", InfiMaterialEnum.Uranium.getHarvestLevel());
            MinecraftForge.setToolClass(arditeUraniumMattock, "Mattock", InfiMaterialEnum.Uranium.getHarvestLevel());
            MinecraftForge.setToolClass(uraniumUraniumMattock, "Mattock", InfiMaterialEnum.Uranium.getHarvestLevel());
        }
    }
    
    private static void addNames()
    {
    	if(PHInfiHybrids.enableWoodTools)
            ModLoader.addName(woodWoodMattock, "Wooden Mattock");
        if(PHInfiHybrids.enableStoneTools)
            ModLoader.addName(stoneStoneMattock, "Heavy Mattock");
        if(PHInfiHybrids.enableIronTools)
            ModLoader.addName(ironIronMattock, "Ironic Mattock");
        if(PHInfiHybrids.enableDiamondTools)
            ModLoader.addName(diamondDiamondMattock, "Diamondium Mattock");
        if(PHInfiHybrids.enableRedstoneTools)
            ModLoader.addName(redstoneRedstoneMattock, "Redredred Mattock");
        if(PHInfiHybrids.enableObsidianTools)
            ModLoader.addName(obsidianObsidianMattock, "Ebony Mattock");
        if(PHInfiHybrids.enableSandstoneTools)
            ModLoader.addName(sandstoneSandstoneMattock, "Fragile Mattock");
        if(PHInfiHybrids.enableNetherrackTools)
            ModLoader.addName(boneBoneMattock, "Necrotic Mattock");
        if(PHInfiHybrids.enablePaperTools)
            ModLoader.addName(paperPaperMattock, "Soft Mattock");
        if(PHInfiHybrids.enableMossyTools)
            ModLoader.addName(mossyMossyMattock, "Living Mattock");
        if(PHInfiHybrids.enableNetherrackTools)
            ModLoader.addName(netherrackNetherrackMattock, "Bloodsoaked Mattock");
        if(PHInfiHybrids.enableGlowstoneTools)
            ModLoader.addName(glowstoneGlowstoneMattock, "Bright Mattock");
        if(PHInfiHybrids.enableIceTools)
            ModLoader.addName(iceIceMattock, "Freezing Mattock");
        if(PHInfiHybrids.enableLavaTools)
            ModLoader.addName(lavaLavaMattock, "Burning Mattock");
        if(PHInfiHybrids.enableSlimeTools)
            ModLoader.addName(slimeSlimeMattock, "Toy Mattock");
        if(PHInfiHybrids.enableCactusTools)
            ModLoader.addName(cactusCactusMattock, "Thorned Mattock");
        if(PHInfiHybrids.enableFlintTools)
            ModLoader.addName(flintFlintMattock, "Rough-hewn Mattock");
        if(PHInfiHybrids.enableBlazeTools)
            ModLoader.addName(blazeBlazeMattock, "Netherite Mattock");
        if(PHInfiHybrids.enableCopperTools)
            ModLoader.addName(copperCopperMattock, "Orange-Tang Mattock");
        if(PHInfiHybrids.enableBronzeTools)
            ModLoader.addName(bronzeBronzeMattock, "Polished Mattock");
        if(PHInfiHybrids.enableWorkedIronTools)
            ModLoader.addName(workedWorkedIronMattock, "Reworked Iron Mattock");
        if(PHInfiHybrids.enableSteelTools)
            ModLoader.addName(steelSteelMattock, "Forge-Wrought Mattock");
        if(PHInfiHybrids.enableCobaltTools)
            ModLoader.addName(cobaltCobaltMattock, "Beautiful Mattock");
        if(PHInfiHybrids.enableArditeTools)
            ModLoader.addName(arditeArditeMattock, "Rustic Mattock");
        if(PHInfiHybrids.enableManyullynTools)
            ModLoader.addName(manyullynManyullynMattock, "False-Prophetic Mattock");
        if(PHInfiHybrids.enableUraniumTools)
            ModLoader.addName(uraniumUraniumMattock, "Cancerous Mattock");
    }
    
    public static void registerInfiToolsRecipes()
    {
    	if(PHInfiHybrids.enableWoodTools)
        {
            ModLoader.addRecipe(new ItemStack(woodWoodMattock), new Object[] 
                    { recipe, '#', Block.planks, '|', Item.stick, 's', Item.stick });
            ModLoader.addRecipe(new ItemStack(sandstoneWoodMattock), new Object[] 
                    { recipe, '#', Block.planks, '|', InfiLibrary.sandstoneRod, 's', Item.stick });
            ModLoader.addRecipe(new ItemStack(boneWoodMattock), new Object[] 
                    { recipe, '#', Block.planks, '|', Item.bone, 's', Item.stick });
            ModLoader.addRecipe(new ItemStack(boneWoodMattock), new Object[] 
                    { recipe, '#', Block.planks, '|', InfiLibrary.boneRod, 's', Item.stick });
            ModLoader.addRecipe(new ItemStack(paperWoodMattock), new Object[] 
                    { recipe, '#', Block.planks, '|', InfiLibrary.paperRod, 's', Item.stick });
            ModLoader.addRecipe(new ItemStack(iceWoodMattock), new Object[] 
                    { recipe, '#', Block.planks, '|', InfiLibrary.iceRod, 's', Item.stick });
            ModLoader.addRecipe(new ItemStack(slimeWoodMattock), new Object[] 
                    { recipe, '#', Block.planks, '|', InfiLibrary.slimeRod, 's', Item.stick });
            ModLoader.addRecipe(new ItemStack(cactusWoodMattock), new Object[] 
                    { recipe, '#', Block.planks, '|', InfiLibrary.cactusRod, 's', Item.stick });
        }
    	
        if(PHInfiHybrids.enableStoneTools)
        {
        	ModLoader.addRecipe(new ItemStack(woodStoneMattock), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', Item.stick, 's', InfiLibrary.stoneShard });
        	ModLoader.addRecipe(new ItemStack(stoneStoneMattock), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', InfiLibrary.stoneRod, 's', InfiLibrary.stoneShard });
            ModLoader.addRecipe(new ItemStack(sandstoneStoneMattock), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', InfiLibrary.sandstoneRod, 's', InfiLibrary.stoneShard });
            ModLoader.addRecipe(new ItemStack(boneStoneMattock), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', Item.bone, 's', InfiLibrary.stoneShard });
            ModLoader.addRecipe(new ItemStack(boneStoneMattock), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', InfiLibrary.boneRod, 's', InfiLibrary.stoneShard });
            ModLoader.addRecipe(new ItemStack(netherrackStoneMattock), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', InfiLibrary.netherrackRod, 's', InfiLibrary.stoneShard });
            ModLoader.addRecipe(new ItemStack(iceStoneMattock), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', InfiLibrary.iceRod, 's', InfiLibrary.stoneShard });
            ModLoader.addRecipe(new ItemStack(slimeStoneMattock), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', InfiLibrary.slimeRod, 's', InfiLibrary.stoneShard });
            ModLoader.addRecipe(new ItemStack(cactusStoneMattock), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', InfiLibrary.cactusRod, 's', InfiLibrary.stoneShard });
            ModLoader.addRecipe(new ItemStack(flintStoneMattock), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', InfiLibrary.flintRod, 's', InfiLibrary.stoneShard });
            
            ModLoader.addRecipe(new ItemStack(woodStoneMattock), new Object[] 
                    { recipe, '#', Block.stone, '|', Item.stick, 's', InfiLibrary.stoneShard });
        	ModLoader.addRecipe(new ItemStack(stoneStoneMattock), new Object[] 
                    { recipe, '#', Block.stone, '|', InfiLibrary.stoneRod, 's', InfiLibrary.stoneShard });
            ModLoader.addRecipe(new ItemStack(sandstoneStoneMattock), new Object[] 
                    { recipe, '#', Block.stone, '|', InfiLibrary.sandstoneRod, 's', InfiLibrary.stoneShard });
            ModLoader.addRecipe(new ItemStack(boneStoneMattock), new Object[] 
                    { recipe, '#', Block.stone, '|', Item.bone, 's', InfiLibrary.stoneShard });
            ModLoader.addRecipe(new ItemStack(boneStoneMattock), new Object[] 
                    { recipe, '#', Block.stone, '|', InfiLibrary.boneRod, 's', InfiLibrary.stoneShard });
            ModLoader.addRecipe(new ItemStack(netherrackStoneMattock), new Object[] 
                    { recipe, '#', Block.stone, '|', InfiLibrary.netherrackRod, 's', InfiLibrary.stoneShard });
            ModLoader.addRecipe(new ItemStack(iceStoneMattock), new Object[] 
                    { recipe, '#', Block.stone, '|', InfiLibrary.iceRod, 's', InfiLibrary.stoneShard });
            ModLoader.addRecipe(new ItemStack(slimeStoneMattock), new Object[] 
                    { recipe, '#', Block.stone, '|', InfiLibrary.slimeRod, 's', InfiLibrary.stoneShard });
            ModLoader.addRecipe(new ItemStack(cactusStoneMattock), new Object[] 
                    { recipe, '#', Block.stone, '|', InfiLibrary.cactusRod, 's', InfiLibrary.stoneShard });
            ModLoader.addRecipe(new ItemStack(flintStoneMattock), new Object[] 
                    { recipe, '#', Block.stone, '|', InfiLibrary.flintRod, 's', InfiLibrary.stoneShard });
        }
        
        if(PHInfiHybrids.enableIronTools)
        {
        	ModLoader.addRecipe(new ItemStack(woodIronMattock), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', Item.stick, 's', InfiLibrary.ironChunk });
        	ModLoader.addRecipe(new ItemStack(stoneIronMattock), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', InfiLibrary.stoneRod, 's', InfiLibrary.ironChunk });
            ModLoader.addRecipe(new ItemStack(ironIronMattock), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', InfiLibrary.ironRod, 's', InfiLibrary.ironChunk });
            ModLoader.addRecipe(new ItemStack(boneIronMattock), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', Item.bone, 's', InfiLibrary.ironChunk });
            ModLoader.addRecipe(new ItemStack(boneIronMattock), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', InfiLibrary.boneRod, 's', InfiLibrary.ironChunk });
            ModLoader.addRecipe(new ItemStack(netherrackIronMattock), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', InfiLibrary.netherrackRod, 's', InfiLibrary.ironChunk });
            ModLoader.addRecipe(new ItemStack(glowstoneIronMattock), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', InfiLibrary.glowstoneRod, 's', InfiLibrary.ironChunk });
            ModLoader.addRecipe(new ItemStack(cactusIronMattock), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', InfiLibrary.cactusRod, 's', InfiLibrary.ironChunk });
            ModLoader.addRecipe(new ItemStack(copperIronMattock), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', InfiLibrary.copperRod, 's', InfiLibrary.ironChunk });
            ModLoader.addRecipe(new ItemStack(bronzeIronMattock), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', InfiLibrary.bronzeRod, 's', InfiLibrary.ironChunk });
        }
        
        if(PHInfiHybrids.enableDiamondTools)
        {
        	ModLoader.addRecipe(new ItemStack(woodDiamondMattock), new Object[] 
                    { recipe, '#', Item.diamond, '|', Item.stick, 's', InfiLibrary.diamondShard });
        	ModLoader.addRecipe(new ItemStack(stoneDiamondMattock), new Object[] 
                    { recipe, '#', Item.diamond, '|', InfiLibrary.stoneRod, 's', InfiLibrary.diamondShard });
            ModLoader.addRecipe(new ItemStack(ironDiamondMattock), new Object[] 
                    { recipe, '#', Item.diamond, '|', InfiLibrary.ironRod, 's', InfiLibrary.diamondShard });
            ModLoader.addRecipe(new ItemStack(diamondDiamondMattock), new Object[] 
                    { recipe, '#', Item.diamond, '|', InfiLibrary.diamondRod, 's', InfiLibrary.diamondShard });
            ModLoader.addRecipe(new ItemStack(redstoneDiamondMattock), new Object[] 
                    { recipe, '#', Item.diamond, '|', InfiLibrary.redstoneRod, 's', InfiLibrary.diamondShard });
            ModLoader.addRecipe(new ItemStack(obsidianDiamondMattock), new Object[] 
                    { recipe, '#', Item.diamond, '|', InfiLibrary.obsidianRod, 's', InfiLibrary.diamondShard });
            ModLoader.addRecipe(new ItemStack(boneDiamondMattock), new Object[] 
                    { recipe, '#', Item.diamond, '|', Item.bone, 's', InfiLibrary.diamondShard });
            ModLoader.addRecipe(new ItemStack(boneDiamondMattock), new Object[] 
                    { recipe, '#', Item.diamond, '|', InfiLibrary.boneRod, 's', InfiLibrary.diamondShard });
            ModLoader.addRecipe(new ItemStack(mossyDiamondMattock), new Object[] 
                    { recipe, '#', Item.diamond, '|', InfiLibrary.mossyRod, 's', InfiLibrary.diamondShard });
            ModLoader.addRecipe(new ItemStack(netherrackDiamondMattock), new Object[] 
                    { recipe, '#', Item.diamond, '|', InfiLibrary.netherrackRod, 's', InfiLibrary.diamondShard });
            ModLoader.addRecipe(new ItemStack(glowstoneDiamondMattock), new Object[] 
                    { recipe, '#', Item.diamond, '|', InfiLibrary.glowstoneRod, 's', InfiLibrary.diamondShard });
            ModLoader.addRecipe(new ItemStack(lavaDiamondMattock), new Object[] 
                    { recipe, '#', Item.diamond, '|', InfiLibrary.lavaRod, 's', InfiLibrary.diamondShard });
            ModLoader.addRecipe(new ItemStack(cactusDiamondMattock), new Object[] 
                    { recipe, '#', Item.diamond, '|', InfiLibrary.cactusRod, 's', InfiLibrary.diamondShard });
            ModLoader.addRecipe(new ItemStack(flintDiamondMattock), new Object[] 
                    { recipe, '#', Item.diamond, '|', InfiLibrary.flintRod, 's', InfiLibrary.diamondShard });
            ModLoader.addRecipe(new ItemStack(blazeDiamondMattock), new Object[] 
                    { recipe, '#', Item.diamond, '|', Item.blazeRod, 's', InfiLibrary.diamondShard });
            ModLoader.addRecipe(new ItemStack(copperDiamondMattock), new Object[] 
                    { recipe, '#', Item.diamond, '|', InfiLibrary.copperRod, 's', InfiLibrary.diamondShard });
            ModLoader.addRecipe(new ItemStack(bronzeDiamondMattock), new Object[] 
                    { recipe, '#', Item.diamond, '|', InfiLibrary.bronzeRod, 's', InfiLibrary.diamondShard });
            ModLoader.addRecipe(new ItemStack(workedDiamondMattock), new Object[] 
                    { recipe, '#', Item.diamond, '|', InfiLibrary.workedIronRod, 's', InfiLibrary.diamondShard });
            ModLoader.addRecipe(new ItemStack(steelDiamondMattock), new Object[] 
                    { recipe, '#', Item.diamond, '|', InfiLibrary.steelRod, 's', InfiLibrary.diamondShard });
            ModLoader.addRecipe(new ItemStack(cobaltDiamondMattock), new Object[] 
                    { recipe, '#', Item.diamond, '|', InfiLibrary.cobaltRod, 's', InfiLibrary.diamondShard });
            ModLoader.addRecipe(new ItemStack(arditeDiamondMattock), new Object[] 
                    { recipe, '#', Item.diamond, '|', InfiLibrary.arditeRod, 's', InfiLibrary.diamondShard });
            ModLoader.addRecipe(new ItemStack(manyullynDiamondMattock), new Object[] 
                    { recipe, '#', Item.diamond, '|', InfiLibrary.manyullynRod, 's', InfiLibrary.diamondShard });
            ModLoader.addRecipe(new ItemStack(uraniumDiamondMattock), new Object[] 
                    { recipe, '#', Item.diamond, '|', InfiLibrary.uraniumRod, 's', InfiLibrary.diamondShard });
        }
        
        if(PHInfiHybrids.enableRedstoneTools)
        {
        	ModLoader.addRecipe(new ItemStack(woodRedstoneMattock), new Object[] 
                    { recipe, '#', InfiLibrary.redstoneCrystal, '|', Item.stick, 's', InfiLibrary.redstoneFragment });
        	ModLoader.addRecipe(new ItemStack(stoneRedstoneMattock), new Object[] 
                    { recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.stoneRod, 's', InfiLibrary.redstoneFragment });
            ModLoader.addRecipe(new ItemStack(ironRedstoneMattock), new Object[] 
                    { recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.ironRod, 's', InfiLibrary.redstoneFragment });
            ModLoader.addRecipe(new ItemStack(redstoneRedstoneMattock), new Object[] 
                    { recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.redstoneRod, 's', InfiLibrary.redstoneFragment });
            ModLoader.addRecipe(new ItemStack(obsidianRedstoneMattock), new Object[] 
                    { recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.obsidianRod, 's', InfiLibrary.redstoneFragment });
            ModLoader.addRecipe(new ItemStack(sandstoneRedstoneMattock), new Object[] 
                    { recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.sandstoneRod, 's', InfiLibrary.redstoneFragment });
            ModLoader.addRecipe(new ItemStack(boneRedstoneMattock), new Object[] 
                    { recipe, '#', InfiLibrary.redstoneCrystal, '|', Item.bone, 's', InfiLibrary.redstoneFragment });
            ModLoader.addRecipe(new ItemStack(boneRedstoneMattock), new Object[] 
                    { recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.boneRod, 's', InfiLibrary.redstoneFragment });
            ModLoader.addRecipe(new ItemStack(paperRedstoneMattock), new Object[] 
                    { recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.paperRod, 's', InfiLibrary.redstoneFragment });
            ModLoader.addRecipe(new ItemStack(mossyRedstoneMattock), new Object[] 
                    { recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.mossyRod, 's', InfiLibrary.redstoneFragment });
            ModLoader.addRecipe(new ItemStack(netherrackRedstoneMattock), new Object[] 
                    { recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.netherrackRod, 's', InfiLibrary.redstoneFragment });
            ModLoader.addRecipe(new ItemStack(glowstoneRedstoneMattock), new Object[] 
                    { recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.glowstoneRod, 's', InfiLibrary.redstoneFragment });
            ModLoader.addRecipe(new ItemStack(iceRedstoneMattock), new Object[] 
                    { recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.iceRod, 's', InfiLibrary.redstoneFragment });
            ModLoader.addRecipe(new ItemStack(lavaRedstoneMattock), new Object[] 
                    { recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.lavaRod, 's', InfiLibrary.redstoneFragment });
            ModLoader.addRecipe(new ItemStack(slimeRedstoneMattock), new Object[] 
                    { recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.slimeRod, 's', InfiLibrary.redstoneFragment });
            ModLoader.addRecipe(new ItemStack(cactusRedstoneMattock), new Object[] 
                    { recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.cactusRod, 's', InfiLibrary.redstoneFragment });
            ModLoader.addRecipe(new ItemStack(flintRedstoneMattock), new Object[] 
                    { recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.flintRod, 's', InfiLibrary.redstoneFragment });
            ModLoader.addRecipe(new ItemStack(copperRedstoneMattock), new Object[] 
                    { recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.copperRod, 's', InfiLibrary.redstoneFragment });
            ModLoader.addRecipe(new ItemStack(bronzeRedstoneMattock), new Object[] 
                    { recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.bronzeRod, 's', InfiLibrary.redstoneFragment });
            ModLoader.addRecipe(new ItemStack(workedRedstoneMattock), new Object[] 
                    { recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.workedIronRod, 's', InfiLibrary.redstoneFragment });
            ModLoader.addRecipe(new ItemStack(uraniumRedstoneMattock), new Object[] 
                    { recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.uraniumRod, 's', InfiLibrary.redstoneFragment });
        }
        
        if(PHInfiHybrids.enableObsidianTools)
        {
        	ModLoader.addRecipe(new ItemStack(woodObsidianMattock), new Object[] 
                    { recipe, '#', Block.obsidian, '|', Item.stick, 's', InfiLibrary.obsidianShard });
        	ModLoader.addRecipe(new ItemStack(stoneObsidianMattock), new Object[] 
                    { recipe, '#', Block.obsidian, '|', InfiLibrary.stoneRod, 's', InfiLibrary.obsidianShard });
            ModLoader.addRecipe(new ItemStack(redstoneObsidianMattock), new Object[] 
                    { recipe, '#', Block.obsidian, '|', InfiLibrary.redstoneRod, 's', InfiLibrary.obsidianShard });
            ModLoader.addRecipe(new ItemStack(obsidianObsidianMattock), new Object[] 
                    { recipe, '#', Block.obsidian, '|', InfiLibrary.obsidianRod, 's', InfiLibrary.obsidianShard });
            ModLoader.addRecipe(new ItemStack(boneObsidianMattock), new Object[] 
                    { recipe, '#', Block.obsidian, '|', Item.bone, 's', InfiLibrary.obsidianShard });
            ModLoader.addRecipe(new ItemStack(boneObsidianMattock), new Object[] 
                    { recipe, '#', Block.obsidian, '|', InfiLibrary.boneRod, 's', InfiLibrary.obsidianShard });
            ModLoader.addRecipe(new ItemStack(netherrackObsidianMattock), new Object[] 
                    { recipe, '#', Block.obsidian, '|', InfiLibrary.netherrackRod, 's', InfiLibrary.obsidianShard });
            ModLoader.addRecipe(new ItemStack(glowstoneObsidianMattock), new Object[] 
                    { recipe, '#', Block.obsidian, '|', InfiLibrary.glowstoneRod, 's', InfiLibrary.obsidianShard });
            ModLoader.addRecipe(new ItemStack(iceObsidianMattock), new Object[] 
                    { recipe, '#', Block.obsidian, '|', InfiLibrary.iceRod, 's', InfiLibrary.obsidianShard });
            ModLoader.addRecipe(new ItemStack(lavaObsidianMattock), new Object[] 
                    { recipe, '#', Block.obsidian, '|', InfiLibrary.lavaRod, 's', InfiLibrary.obsidianShard });
            ModLoader.addRecipe(new ItemStack(cactusObsidianMattock), new Object[] 
                    { recipe, '#', Block.obsidian, '|', InfiLibrary.cactusRod, 's', InfiLibrary.obsidianShard });
        }
        
        if(PHInfiHybrids.enableSandstoneTools)
        {
            ModLoader.addRecipe(new ItemStack(woodSandstoneMattock), new Object[] 
                    { recipe, '#', Block.sandStone, '|', Item.stick, 's', InfiLibrary.sandstoneShard });
            ModLoader.addRecipe(new ItemStack(sandstoneSandstoneMattock), new Object[] 
                    { recipe, '#', Block.sandStone, '|', InfiLibrary.sandstoneRod, 's', InfiLibrary.sandstoneShard });
            ModLoader.addRecipe(new ItemStack(boneSandstoneMattock), new Object[] 
                    { recipe, '#', Block.sandStone, '|', Item.bone, 's', InfiLibrary.sandstoneShard });
            ModLoader.addRecipe(new ItemStack(boneSandstoneMattock), new Object[] 
                    { recipe, '#', Block.sandStone, '|', InfiLibrary.boneRod, 's', InfiLibrary.sandstoneShard });      
            ModLoader.addRecipe(new ItemStack(netherrackSandstoneMattock), new Object[] 
                    { recipe, '#', Block.sandStone, '|', InfiLibrary.netherrackRod, 's', InfiLibrary.sandstoneShard });
            ModLoader.addRecipe(new ItemStack(iceSandstoneMattock), new Object[] 
                    { recipe, '#', Block.sandStone, '|', InfiLibrary.iceRod, 's', InfiLibrary.sandstoneShard });
            ModLoader.addRecipe(new ItemStack(slimeSandstoneMattock), new Object[] 
                    { recipe, '#', Block.sandStone, '|', InfiLibrary.slimeRod, 's', InfiLibrary.sandstoneShard });
            ModLoader.addRecipe(new ItemStack(cactusSandstoneMattock), new Object[] 
                    { recipe, '#', Block.sandStone, '|', InfiLibrary.cactusRod, 's', InfiLibrary.sandstoneShard });
            ModLoader.addRecipe(new ItemStack(flintSandstoneMattock), new Object[] 
                    { recipe, '#', Block.sandStone, '|', InfiLibrary.flintRod, 's', InfiLibrary.sandstoneShard });
        }
        
        if(PHInfiHybrids.enableBoneTools)
        {
            ModLoader.addRecipe(new ItemStack(woodBoneMattock), new Object[] 
                    { recipe, '#', Item.bone, '|', Item.stick, 's', new ItemStack(Item.dyePowder, 1, 15) });
            ModLoader.addRecipe(new ItemStack(stoneBoneMattock), new Object[] 
                    { recipe, '#', Item.bone, '|', InfiLibrary.stoneRod, 's', new ItemStack(Item.dyePowder, 1, 15) });
            ModLoader.addRecipe(new ItemStack(sandstoneBoneMattock), new Object[] 
                    { recipe, '#', Item.bone, '|', InfiLibrary.sandstoneRod, 's', new ItemStack(Item.dyePowder, 1, 15) });
            ModLoader.addRecipe(new ItemStack(boneBoneMattock), new Object[] 
                    { recipe, '#', Item.bone, '|', Item.bone, 's', new ItemStack(Item.dyePowder, 1, 15) });
            ModLoader.addRecipe(new ItemStack(boneBoneMattock), new Object[] 
                    { recipe, '#', Item.bone, '|', InfiLibrary.boneRod, 's', new ItemStack(Item.dyePowder, 1, 15) });
            ModLoader.addRecipe(new ItemStack(paperBoneMattock), new Object[] 
                    { recipe, '#', Item.bone, '|', InfiLibrary.paperRod, 's', new ItemStack(Item.dyePowder, 1, 15) });
            ModLoader.addRecipe(new ItemStack(netherrackBoneMattock), new Object[] 
                    { recipe, '#', Item.bone, '|', InfiLibrary.netherrackRod, 's', new ItemStack(Item.dyePowder, 1, 15) });
            ModLoader.addRecipe(new ItemStack(iceBoneMattock), new Object[] 
                    { recipe, '#', Item.bone, '|', InfiLibrary.iceRod, 's', new ItemStack(Item.dyePowder, 1, 15) });
            ModLoader.addRecipe(new ItemStack(cactusBoneMattock), new Object[] 
                    { recipe, '#', Item.bone, '|', InfiLibrary.cactusRod, 's', new ItemStack(Item.dyePowder, 1, 15) });
            ModLoader.addRecipe(new ItemStack(flintBoneMattock), new Object[] 
                    { recipe, '#', Item.bone, '|', InfiLibrary.flintRod, 's', new ItemStack(Item.dyePowder, 1, 15) });
        }
        
        if(PHInfiHybrids.enablePaperTools)
        {
            ModLoader.addRecipe(new ItemStack(woodPaperMattock), new Object[] 
                    { recipe, '#', InfiLibrary.paperStack, '|', Item.stick, 's', Item.paper });
            ModLoader.addRecipe(new ItemStack(bonePaperMattock), new Object[] 
                    { recipe, '#', InfiLibrary.paperStack, '|', Item.bone, 's', Item.paper });
            ModLoader.addRecipe(new ItemStack(bonePaperMattock), new Object[] 
                    { recipe, '#', InfiLibrary.paperStack, '|', InfiLibrary.boneRod, 's', Item.paper });
            ModLoader.addRecipe(new ItemStack(paperPaperMattock), new Object[] 
                    { recipe, '#', InfiLibrary.paperStack, '|', InfiLibrary.paperRod, 's', Item.paper });
            ModLoader.addRecipe(new ItemStack(slimePaperMattock), new Object[] 
                    { recipe, '#', InfiLibrary.paperStack, '|', InfiLibrary.slimeRod, 's', Item.paper });
            ModLoader.addRecipe(new ItemStack(cactusPaperMattock), new Object[] 
                    { recipe, '#', InfiLibrary.paperStack, '|', InfiLibrary.cactusRod, 's', Item.paper });
        }
        
        if(PHInfiHybrids.enableMossyTools)
        {
        	ModLoader.addRecipe(new ItemStack(woodMossyMattock), new Object[] 
                    { recipe, '#', InfiLibrary.mossyStone, '|', Item.stick, 's', InfiLibrary.mossyPatch });
        	ModLoader.addRecipe(new ItemStack(stoneMossyMattock), new Object[] 
                    { recipe, '#', InfiLibrary.mossyStone, '|', InfiLibrary.stoneRod, 's', InfiLibrary.mossyPatch });
            ModLoader.addRecipe(new ItemStack(diamondMossyMattock), new Object[] 
                    { recipe, '#', InfiLibrary.mossyStone, '|', InfiLibrary.diamondRod, 's', InfiLibrary.mossyPatch });
            ModLoader.addRecipe(new ItemStack(redstoneMossyMattock), new Object[] 
                    { recipe, '#', InfiLibrary.mossyStone, '|', InfiLibrary.redstoneRod, 's', InfiLibrary.mossyPatch });
            ModLoader.addRecipe(new ItemStack(boneMossyMattock), new Object[] 
                    { recipe, '#', InfiLibrary.mossyStone, '|', Item.bone, 's', InfiLibrary.mossyPatch });
            ModLoader.addRecipe(new ItemStack(boneMossyMattock), new Object[] 
                    { recipe, '#', InfiLibrary.mossyStone, '|', InfiLibrary.boneRod, 's', InfiLibrary.mossyPatch });
            ModLoader.addRecipe(new ItemStack(mossyMossyMattock), new Object[] 
                    { recipe, '#', InfiLibrary.mossyStone, '|', InfiLibrary.mossyRod, 's', InfiLibrary.mossyPatch });
            ModLoader.addRecipe(new ItemStack(netherrackMossyMattock), new Object[] 
                    { recipe, '#', InfiLibrary.mossyStone, '|', InfiLibrary.netherrackRod, 's', InfiLibrary.mossyPatch });
            ModLoader.addRecipe(new ItemStack(glowstoneMossyMattock), new Object[] 
                    { recipe, '#', InfiLibrary.mossyStone, '|', InfiLibrary.glowstoneRod, 's', InfiLibrary.mossyPatch });
            ModLoader.addRecipe(new ItemStack(cactusMossyMattock), new Object[] 
                    { recipe, '#', InfiLibrary.mossyStone, '|', InfiLibrary.cactusRod, 's', InfiLibrary.mossyPatch });
            ModLoader.addRecipe(new ItemStack(blazeMossyMattock), new Object[] 
                    { recipe, '#', InfiLibrary.mossyStone, '|', Item.blazeRod, 's', InfiLibrary.mossyPatch });
            ModLoader.addRecipe(new ItemStack(manyullynMossyMattock), new Object[] 
                    { recipe, '#', InfiLibrary.mossyStone, '|', InfiLibrary.manyullynRod, 's', InfiLibrary.mossyPatch });
            ModLoader.addRecipe(new ItemStack(uraniumMossyMattock), new Object[] 
                    { recipe, '#', InfiLibrary.mossyStone, '|', InfiLibrary.uraniumRod, 's', InfiLibrary.mossyPatch });
        }
        
        if(PHInfiHybrids.enableNetherrackTools)
        {
        	ModLoader.addRecipe(new ItemStack(woodNetherrackMattock), new Object[] 
                    { recipe, '#', Block.netherrack, '|', Item.stick, 's', InfiLibrary.netherrackShard });
        	ModLoader.addRecipe(new ItemStack(stoneNetherrackMattock), new Object[] 
                    { recipe, '#', Block.netherrack, '|', InfiLibrary.stoneRod, 's', InfiLibrary.netherrackShard });
            ModLoader.addRecipe(new ItemStack(sandstoneNetherrackMattock), new Object[] 
                    { recipe, '#', Block.netherrack, '|', InfiLibrary.sandstoneRod, 's', InfiLibrary.netherrackShard });
            ModLoader.addRecipe(new ItemStack(boneNetherrackMattock), new Object[] 
                    { recipe, '#', Block.netherrack, '|', Item.bone, 's', InfiLibrary.netherrackShard });
            ModLoader.addRecipe(new ItemStack(boneNetherrackMattock), new Object[] 
                    { recipe, '#', Block.netherrack, '|', InfiLibrary.boneRod, 's', InfiLibrary.netherrackShard });
            ModLoader.addRecipe(new ItemStack(paperNetherrackMattock), new Object[] 
                    { recipe, '#', Block.netherrack, '|', InfiLibrary.paperRod, 's', InfiLibrary.netherrackShard });
            ModLoader.addRecipe(new ItemStack(mossyNetherrackMattock), new Object[] 
                    { recipe, '#', Block.netherrack, '|', InfiLibrary.mossyRod, 's', InfiLibrary.netherrackShard });
            ModLoader.addRecipe(new ItemStack(netherrackNetherrackMattock), new Object[] 
                    { recipe, '#', Block.netherrack, '|', InfiLibrary.netherrackRod, 's', InfiLibrary.netherrackShard });
            ModLoader.addRecipe(new ItemStack(iceNetherrackMattock), new Object[] 
                    { recipe, '#', Block.netherrack, '|', InfiLibrary.iceRod, 's', InfiLibrary.netherrackShard });
            ModLoader.addRecipe(new ItemStack(slimeNetherrackMattock), new Object[] 
                    { recipe, '#', Block.netherrack, '|', InfiLibrary.slimeRod, 's', InfiLibrary.netherrackShard });
            ModLoader.addRecipe(new ItemStack(cactusNetherrackMattock), new Object[] 
                    { recipe, '#', Block.netherrack, '|', InfiLibrary.cactusRod, 's', InfiLibrary.netherrackShard });
            ModLoader.addRecipe(new ItemStack(flintNetherrackMattock), new Object[] 
                    { recipe, '#', Block.netherrack, '|', InfiLibrary.flintRod, 's', InfiLibrary.netherrackShard });
            ModLoader.addRecipe(new ItemStack(copperNetherrackMattock), new Object[] 
                    { recipe, '#', Block.netherrack, '|', InfiLibrary.copperRod, 's', InfiLibrary.netherrackShard });
            ModLoader.addRecipe(new ItemStack(bronzeNetherrackMattock), new Object[] 
                    { recipe, '#', Block.netherrack, '|', InfiLibrary.bronzeRod, 's', InfiLibrary.netherrackShard });
        }
        
        if(PHInfiHybrids.enableGlowstoneTools)
        {
        	ModLoader.addRecipe(new ItemStack(woodGlowstoneMattock), new Object[] 
                    { recipe, '#', InfiLibrary.glowstoneCrystal, '|', Item.stick, 's', InfiLibrary.glowstoneFragment });
        	ModLoader.addRecipe(new ItemStack(redstoneGlowstoneMattock), new Object[] 
                    { recipe, '#', InfiLibrary.glowstoneCrystal, '|', InfiLibrary.glowstoneRod, 's', InfiLibrary.glowstoneFragment });
        	ModLoader.addRecipe(new ItemStack(obsidianGlowstoneMattock), new Object[] 
                    { recipe, '#', InfiLibrary.glowstoneCrystal, '|', InfiLibrary.obsidianRod, 's', InfiLibrary.glowstoneFragment });
            ModLoader.addRecipe(new ItemStack(boneGlowstoneMattock), new Object[] 
                    { recipe, '#', InfiLibrary.glowstoneCrystal, '|', Item.bone, 's', InfiLibrary.glowstoneFragment });
            ModLoader.addRecipe(new ItemStack(boneGlowstoneMattock), new Object[] 
                    { recipe, '#', InfiLibrary.glowstoneCrystal, '|', InfiLibrary.boneRod, 's', InfiLibrary.glowstoneFragment });
            ModLoader.addRecipe(new ItemStack(netherrackGlowstoneMattock), new Object[] 
                    { recipe, '#', InfiLibrary.glowstoneCrystal, '|', InfiLibrary.netherrackRod, 's', InfiLibrary.glowstoneFragment });
            ModLoader.addRecipe(new ItemStack(glowstoneGlowstoneMattock), new Object[] 
                    { recipe, '#', InfiLibrary.glowstoneCrystal, '|', InfiLibrary.glowstoneRod, 's', InfiLibrary.glowstoneFragment });
            ModLoader.addRecipe(new ItemStack(iceGlowstoneMattock), new Object[] 
                    { recipe, '#', InfiLibrary.glowstoneCrystal, '|', InfiLibrary.iceRod, 's', InfiLibrary.glowstoneFragment });
            ModLoader.addRecipe(new ItemStack(slimeGlowstoneMattock), new Object[] 
                    { recipe, '#', InfiLibrary.glowstoneCrystal, '|', InfiLibrary.slimeRod, 's', InfiLibrary.glowstoneFragment });
            ModLoader.addRecipe(new ItemStack(cactusGlowstoneMattock), new Object[] 
                    { recipe, '#', InfiLibrary.glowstoneCrystal, '|', InfiLibrary.cactusRod, 's', InfiLibrary.glowstoneFragment });
        }
        
        if(PHInfiHybrids.enableIceTools)
        {
            ModLoader.addRecipe(new ItemStack(woodIceMattock), new Object[] 
                    { recipe, '#', Block.ice, '|', Item.stick, 's', InfiLibrary.iceShard });
            ModLoader.addRecipe(new ItemStack(boneIceMattock), new Object[] 
                    { recipe, '#', Block.ice, '|', Item.bone, 's', InfiLibrary.iceShard });
            ModLoader.addRecipe(new ItemStack(boneIceMattock), new Object[] 
                    { recipe, '#', Block.ice, '|', InfiLibrary.boneRod, 's', InfiLibrary.iceShard });
            ModLoader.addRecipe(new ItemStack(paperIceMattock), new Object[] 
                    { recipe, '#', Block.ice, '|', InfiLibrary.paperRod, 's', InfiLibrary.iceShard });
            ModLoader.addRecipe(new ItemStack(iceIceMattock), new Object[] 
                    { recipe, '#', Block.ice, '|', InfiLibrary.iceRod, 's', InfiLibrary.iceShard });
            ModLoader.addRecipe(new ItemStack(slimeIceMattock), new Object[] 
                    { recipe, '#', Block.ice, '|', InfiLibrary.slimeRod, 's', InfiLibrary.iceShard });
            ModLoader.addRecipe(new ItemStack(cactusIceMattock), new Object[] 
                    { recipe, '#', Block.ice, '|', InfiLibrary.cactusRod, 's', InfiLibrary.iceShard });
        }
        
        if(PHInfiHybrids.enableLavaTools)
        {
            ModLoader.addRecipe(new ItemStack(diamondLavaMattock), new Object[] 
                    { recipe, '#', InfiLibrary.lavaCrystal, '|', InfiLibrary.diamondRod, 's', InfiLibrary.lavaFragment });
            ModLoader.addRecipe(new ItemStack(obsidianLavaMattock), new Object[] 
                    { recipe, '#', InfiLibrary.lavaCrystal, '|', InfiLibrary.obsidianRod, 's', InfiLibrary.lavaFragment });
            ModLoader.addRecipe(new ItemStack(netherrackLavaMattock), new Object[] 
                    { recipe, '#', InfiLibrary.lavaCrystal, '|', InfiLibrary.netherrackRod, 's', InfiLibrary.lavaFragment });
            ModLoader.addRecipe(new ItemStack(lavaLavaMattock), new Object[] 
                    { recipe, '#', InfiLibrary.lavaCrystal, '|', InfiLibrary.lavaRod, 's', InfiLibrary.lavaFragment });
            ModLoader.addRecipe(new ItemStack(flintLavaMattock), new Object[] 
                    { recipe, '#', InfiLibrary.lavaCrystal, '|', InfiLibrary.flintRod, 's', InfiLibrary.lavaFragment });
            ModLoader.addRecipe(new ItemStack(blazeLavaMattock), new Object[] 
                    { recipe, '#', InfiLibrary.lavaCrystal, '|', Item.blazeRod, 's', InfiLibrary.lavaFragment });
            ModLoader.addRecipe(new ItemStack(manyullynLavaMattock), new Object[] 
                    { recipe, '#', InfiLibrary.lavaCrystal, '|', InfiLibrary.manyullynRod, 's', InfiLibrary.lavaFragment });
            ModLoader.addRecipe(new ItemStack(uraniumLavaMattock), new Object[] 
                    { recipe, '#', InfiLibrary.lavaCrystal, '|', InfiLibrary.uraniumRod, 's', InfiLibrary.lavaFragment });
        }
        
        if(PHInfiHybrids.enableSlimeTools)
        {
            ModLoader.addRecipe(new ItemStack(woodSlimeMattock), new Object[] 
                    { recipe, '#', InfiLibrary.slimeCrystal, '|', Item.stick, 's', Item.slimeBall });
            ModLoader.addRecipe(new ItemStack(sandstoneSlimeMattock), new Object[] 
                    { recipe, '#', InfiLibrary.slimeCrystal, '|', InfiLibrary.sandstoneRod, 's', Item.slimeBall });
            ModLoader.addRecipe(new ItemStack(boneSlimeMattock), new Object[] 
                    { recipe, '#', InfiLibrary.slimeCrystal, '|', Item.bone, 's', Item.slimeBall });
            ModLoader.addRecipe(new ItemStack(boneSlimeMattock), new Object[] 
                    { recipe, '#', InfiLibrary.slimeCrystal, '|', InfiLibrary.boneRod, 's', Item.slimeBall });
            ModLoader.addRecipe(new ItemStack(paperSlimeMattock), new Object[] 
                    { recipe, '#', InfiLibrary.slimeCrystal, '|', InfiLibrary.paperRod, 's', Item.slimeBall });
            ModLoader.addRecipe(new ItemStack(slimeSlimeMattock), new Object[] 
                    { recipe, '#', InfiLibrary.slimeCrystal, '|', InfiLibrary.slimeRod, 's', Item.slimeBall });
            ModLoader.addRecipe(new ItemStack(cactusSlimeMattock), new Object[] 
                    { recipe, '#', InfiLibrary.slimeCrystal, '|', InfiLibrary.cactusRod, 's', Item.slimeBall });
        }
        
        if(PHInfiHybrids.enableCactusTools)
        {
            ModLoader.addRecipe(new ItemStack(woodCactusMattock), new Object[] 
                    { recipe, '#', Block.cactus, '|', Item.stick, 's', InfiLibrary.cactusShard });
            ModLoader.addRecipe(new ItemStack(sandstoneCactusMattock), new Object[] 
                    { recipe, '#', Block.cactus, '|', InfiLibrary.sandstoneRod, 's', InfiLibrary.cactusShard });
            ModLoader.addRecipe(new ItemStack(boneCactusMattock), new Object[] 
                    { recipe, '#', Block.cactus, '|', Item.bone, 's', InfiLibrary.cactusShard });
            ModLoader.addRecipe(new ItemStack(boneCactusMattock), new Object[] 
                    { recipe, '#', Block.cactus, '|', InfiLibrary.boneRod, 's', InfiLibrary.cactusShard });
            ModLoader.addRecipe(new ItemStack(netherrackCactusMattock), new Object[] 
                    { recipe, '#', Block.cactus, '|', InfiLibrary.netherrackRod, 's', InfiLibrary.cactusShard });
            ModLoader.addRecipe(new ItemStack(iceCactusMattock), new Object[] 
                    { recipe, '#', Block.cactus, '|', InfiLibrary.iceRod, 's', InfiLibrary.cactusShard });
            ModLoader.addRecipe(new ItemStack(slimeCactusMattock), new Object[] 
                    { recipe, '#', Block.cactus, '|', InfiLibrary.slimeRod, 's', InfiLibrary.cactusShard });
            ModLoader.addRecipe(new ItemStack(cactusCactusMattock), new Object[] 
                    { recipe, '#', Block.cactus, '|', InfiLibrary.cactusRod, 's', InfiLibrary.cactusShard });
        }
        
        if(PHInfiHybrids.enableFlintTools)
        {
        	ModLoader.addRecipe(new ItemStack(woodFlintMattock), new Object[] 
                    { recipe, '#', Item.flint, '|', Item.stick, 's', InfiLibrary.flintShard });
        	ModLoader.addRecipe(new ItemStack(stoneFlintMattock), new Object[] 
                    { recipe, '#', Item.flint, '|', InfiLibrary.stoneRod, 's', InfiLibrary.flintShard });
            ModLoader.addRecipe(new ItemStack(sandstoneFlintMattock), new Object[] 
                    { recipe, '#', Item.flint, '|', InfiLibrary.sandstoneRod, 's', InfiLibrary.flintShard });
            ModLoader.addRecipe(new ItemStack(boneFlintMattock), new Object[] 
                    { recipe, '#', Item.flint, '|', Item.bone, 's', InfiLibrary.flintShard });
            ModLoader.addRecipe(new ItemStack(boneFlintMattock), new Object[] 
                    { recipe, '#', Item.flint, '|', InfiLibrary.boneRod, 's', InfiLibrary.flintShard });
            ModLoader.addRecipe(new ItemStack(netherrackFlintMattock), new Object[] 
                    { recipe, '#', Item.flint, '|', InfiLibrary.netherrackRod, 's', InfiLibrary.flintShard });
            ModLoader.addRecipe(new ItemStack(slimeFlintMattock), new Object[] 
                    { recipe, '#', Item.flint, '|', InfiLibrary.slimeRod, 's', InfiLibrary.flintShard });
            ModLoader.addRecipe(new ItemStack(cactusFlintMattock), new Object[] 
                    { recipe, '#', Item.flint, '|', InfiLibrary.cactusRod, 's', InfiLibrary.flintShard });
            ModLoader.addRecipe(new ItemStack(flintFlintMattock), new Object[] 
                    { recipe, '#', Item.flint, '|', InfiLibrary.flintRod, 's', InfiLibrary.flintShard });
            ModLoader.addRecipe(new ItemStack(copperFlintMattock), new Object[] 
                    { recipe, '#', Item.flint, '|', InfiLibrary.copperRod, 's', InfiLibrary.flintShard });
            ModLoader.addRecipe(new ItemStack(bronzeFlintMattock), new Object[] 
                    { recipe, '#', Item.flint, '|', InfiLibrary.bronzeRod, 's', InfiLibrary.flintShard });
        }
        
        if(PHInfiHybrids.enableBlazeTools)
        {
            ModLoader.addRecipe(new ItemStack(diamondBlazeMattock), new Object[] 
                    { recipe, '#', InfiLibrary.blazeCrystal, '|', InfiLibrary.diamondRod, 's', InfiLibrary.blazeFragment });
            ModLoader.addRecipe(new ItemStack(obsidianBlazeMattock), new Object[] 
                    { recipe, '#', InfiLibrary.blazeCrystal, '|', InfiLibrary.obsidianRod, 's', InfiLibrary.blazeFragment });
            ModLoader.addRecipe(new ItemStack(netherrackBlazeMattock), new Object[] 
                    { recipe, '#', InfiLibrary.blazeCrystal, '|', InfiLibrary.netherrackRod, 's', InfiLibrary.blazeFragment });
            ModLoader.addRecipe(new ItemStack(lavaBlazeMattock), new Object[] 
                    { recipe, '#', InfiLibrary.blazeCrystal, '|', InfiLibrary.lavaRod, 's', InfiLibrary.blazeFragment });
            ModLoader.addRecipe(new ItemStack(flintBlazeMattock), new Object[] 
                    { recipe, '#', InfiLibrary.blazeCrystal, '|', InfiLibrary.flintRod, 's', InfiLibrary.blazeFragment });
            ModLoader.addRecipe(new ItemStack(blazeBlazeMattock), new Object[] 
                    { recipe, '#', InfiLibrary.blazeCrystal, '|', Item.blazeRod, 's', InfiLibrary.blazeFragment });
            ModLoader.addRecipe(new ItemStack(manyullynBlazeMattock), new Object[] 
                    { recipe, '#', InfiLibrary.blazeCrystal, '|', InfiLibrary.manyullynRod, 's', InfiLibrary.blazeFragment });
            ModLoader.addRecipe(new ItemStack(uraniumBlazeMattock), new Object[] 
                    { recipe, '#', InfiLibrary.blazeCrystal, '|', InfiLibrary.uraniumRod, 's', InfiLibrary.blazeFragment });
        }
    }
    
    public static void addStoneTools(String stack)
	{
		//GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(woodStoneMattock), recipe, '#', stack, '|', Item.stick ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(stoneStoneMattock), recipe, '#', stack, '|', InfiLibrary.stoneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(sandstoneStoneMattock), recipe, '#', stack, '|', InfiLibrary.sandstoneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(boneStoneMattock), recipe, '#', stack, '|', Item.bone ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(boneStoneMattock), recipe, '#', stack, '|', InfiLibrary.boneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(netherrackStoneMattock), recipe, '#', stack, '|', InfiLibrary.netherrackRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(iceStoneMattock), recipe, '#', stack, '|', InfiLibrary.iceRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(slimeStoneMattock), recipe, '#', stack, '|', InfiLibrary.slimeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(cactusStoneMattock), recipe, '#', stack, '|', InfiLibrary.cactusRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(flintStoneMattock), recipe, '#', stack, '|', InfiLibrary.flintRod ) );
	}

	public static void addCopperTools(String stack)
	{
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(woodCopperMattock), recipe, '#', stack, '|', Item.stick ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(stoneCopperMattock), recipe, '#', stack, '|', InfiLibrary.stoneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(boneCopperMattock), recipe, '#', stack, '|', Item.bone ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(boneCopperMattock), recipe, '#', stack, '|', InfiLibrary.boneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(netherrackCopperMattock), recipe, '#', stack, '|', InfiLibrary.netherrackRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(slimeCopperMattock), recipe, '#', stack, '|', InfiLibrary.slimeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(cactusCopperMattock), recipe, '#', stack, '|', InfiLibrary.cactusRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(flintCopperMattock), recipe, '#', stack, '|', InfiLibrary.flintRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(copperCopperMattock), recipe, '#', stack, '|', InfiLibrary.copperRod ) );
	}

	public static void addBronzeTools(String stack)
	{
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(woodBronzeMattock), recipe, '#', stack, '|', Item.stick ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(stoneBronzeMattock), recipe, '#', stack, '|', InfiLibrary.stoneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(boneBronzeMattock), recipe, '#', stack, '|', Item.bone ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(boneBronzeMattock), recipe, '#', stack, '|', InfiLibrary.boneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(netherrackBronzeMattock), recipe, '#', stack, '|', InfiLibrary.netherrackRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(slimeBronzeMattock), recipe, '#', stack, '|', InfiLibrary.slimeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(cactusBronzeMattock), recipe, '#', stack, '|', InfiLibrary.cactusRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(flintBronzeMattock), recipe, '#', stack, '|', InfiLibrary.flintRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(copperBronzeMattock), recipe, '#', stack, '|', InfiLibrary.copperRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(bronzeBronzeMattock), recipe, '#', stack, '|', InfiLibrary.bronzeRod ) );
	}

	public static void addWorkedIronTools(String stack)
	{
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(woodWorkedIronMattock), recipe, '#', stack, '|', Item.stick ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(stoneWorkedIronMattock), recipe, '#', stack, '|', InfiLibrary.stoneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(ironWorkedIronMattock), recipe, '#', stack, '|', InfiLibrary.ironRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(diamondWorkedIronMattock), recipe, '#', stack, '|', InfiLibrary.diamondRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(redstoneWorkedIronMattock), recipe, '#', stack, '|', InfiLibrary.redstoneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(obsidianWorkedIronMattock), recipe, '#', stack, '|', InfiLibrary.obsidianRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(boneWorkedIronMattock), recipe, '#', stack, '|', Item.bone ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(boneWorkedIronMattock), recipe, '#', stack, '|', InfiLibrary.boneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(netherrackWorkedIronMattock), recipe, '#', stack, '|', InfiLibrary.netherrackRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(glowstoneWorkedIronMattock), recipe, '#', stack, '|', InfiLibrary.glowstoneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(iceWorkedIronMattock), recipe, '#', stack, '|', InfiLibrary.iceRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(slimeWorkedIronMattock), recipe, '#', stack, '|', InfiLibrary.slimeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(cactusWorkedIronMattock), recipe, '#', stack, '|', InfiLibrary.cactusRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(blazeWorkedIronMattock), recipe, '#', stack, '|', Item.blazeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(copperWorkedIronMattock), recipe, '#', stack, '|', InfiLibrary.copperRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(bronzeWorkedIronMattock), recipe, '#', stack, '|', InfiLibrary.bronzeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(workedWorkedIronMattock), recipe, '#', stack, '|', InfiLibrary.workedIronRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(steelWorkedIronMattock), recipe, '#', stack, '|', InfiLibrary.steelRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(uraniumWorkedIronMattock), recipe, '#', stack, '|', InfiLibrary.uraniumRod ) );
	}

	public static void addSteelTools(String stack)
	{
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(woodSteelMattock), recipe, '#', stack, '|', Item.stick ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(stoneSteelMattock), recipe, '#', stack, '|', InfiLibrary.stoneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(ironSteelMattock), recipe, '#', stack, '|', InfiLibrary.ironRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(diamondSteelMattock), recipe, '#', stack, '|', InfiLibrary.diamondRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(redstoneSteelMattock), recipe, '#', stack, '|', InfiLibrary.redstoneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(obsidianSteelMattock), recipe, '#', stack, '|', InfiLibrary.obsidianRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(boneSteelMattock), recipe, '#', stack, '|', Item.bone ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(boneSteelMattock), recipe, '#', stack, '|', InfiLibrary.boneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(netherrackSteelMattock), recipe, '#', stack, '|', InfiLibrary.netherrackRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(glowstoneSteelMattock), recipe, '#', stack, '|', InfiLibrary.glowstoneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(iceSteelMattock), recipe, '#', stack, '|', InfiLibrary.iceRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(slimeSteelMattock), recipe, '#', stack, '|', InfiLibrary.slimeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(cactusSteelMattock), recipe, '#', stack, '|', InfiLibrary.cactusRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(blazeSteelMattock), recipe, '#', stack, '|', Item.blazeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(copperSteelMattock), recipe, '#', stack, '|', InfiLibrary.copperRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(bronzeSteelMattock), recipe, '#', stack, '|', InfiLibrary.bronzeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(workedSteelMattock), recipe, '#', stack, '|', InfiLibrary.workedIronRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(steelSteelMattock), recipe, '#', stack, '|', InfiLibrary.steelRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(cobaltSteelMattock), recipe, '#', stack, '|', InfiLibrary.cobaltRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(arditeSteelMattock), recipe, '#', stack, '|', InfiLibrary.arditeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(uraniumSteelMattock), recipe, '#', stack, '|', InfiLibrary.uraniumRod ) );
	}

	public static void addCobaltTools(String stack)
	{
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(woodCobaltMattock), recipe, '#', stack, '|', Item.stick ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(stoneCobaltMattock), recipe, '#', stack, '|', InfiLibrary.stoneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(ironCobaltMattock), recipe, '#', stack, '|', InfiLibrary.ironRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(diamondCobaltMattock), recipe, '#', stack, '|', InfiLibrary.diamondRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(redstoneCobaltMattock), recipe, '#', stack, '|', InfiLibrary.redstoneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(obsidianCobaltMattock), recipe, '#', stack, '|', InfiLibrary.obsidianRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(boneCobaltMattock), recipe, '#', stack, '|', Item.bone ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(boneCobaltMattock), recipe, '#', stack, '|', InfiLibrary.boneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(slimeCobaltMattock), recipe, '#', stack, '|', InfiLibrary.slimeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(cactusCobaltMattock), recipe, '#', stack, '|', InfiLibrary.cactusRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(blazeCobaltMattock), recipe, '#', stack, '|', Item.blazeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(copperCobaltMattock), recipe, '#', stack, '|', InfiLibrary.copperRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(bronzeCobaltMattock), recipe, '#', stack, '|', InfiLibrary.bronzeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(workedCobaltMattock), recipe, '#', stack, '|', InfiLibrary.workedIronRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(steelCobaltMattock), recipe, '#', stack, '|', InfiLibrary.steelRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(cobaltCobaltMattock), recipe, '#', stack, '|', InfiLibrary.cobaltRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(arditeCobaltMattock), recipe, '#', stack, '|', InfiLibrary.arditeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(manyullynCobaltMattock), recipe, '#', stack, '|', InfiLibrary.manyullynRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(uraniumCobaltMattock), recipe, '#', stack, '|', InfiLibrary.uraniumRod ) );
	}

	public static void addArditeTools(String stack)
	{
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(woodArditeMattock), recipe, '#', stack, '|', Item.stick ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(stoneArditeMattock), recipe, '#', stack, '|', InfiLibrary.stoneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(ironArditeMattock), recipe, '#', stack, '|', InfiLibrary.ironRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(diamondArditeMattock), recipe, '#', stack, '|', InfiLibrary.diamondRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(redstoneArditeMattock), recipe, '#', stack, '|', InfiLibrary.redstoneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(obsidianArditeMattock), recipe, '#', stack, '|', InfiLibrary.obsidianRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(boneArditeMattock), recipe, '#', stack, '|', Item.bone ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(boneArditeMattock), recipe, '#', stack, '|', InfiLibrary.boneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(slimeArditeMattock), recipe, '#', stack, '|', InfiLibrary.slimeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(cactusArditeMattock), recipe, '#', stack, '|', InfiLibrary.cactusRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(blazeArditeMattock), recipe, '#', stack, '|', Item.blazeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(copperArditeMattock), recipe, '#', stack, '|', InfiLibrary.copperRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(bronzeArditeMattock), recipe, '#', stack, '|', InfiLibrary.bronzeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(workedArditeMattock), recipe, '#', stack, '|', InfiLibrary.workedIronRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(steelArditeMattock), recipe, '#', stack, '|', InfiLibrary.steelRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(cobaltArditeMattock), recipe, '#', stack, '|', InfiLibrary.cobaltRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(arditeArditeMattock), recipe, '#', stack, '|', InfiLibrary.arditeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(manyullynArditeMattock), recipe, '#', stack, '|', InfiLibrary.manyullynRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(uraniumArditeMattock), recipe, '#', stack, '|', InfiLibrary.uraniumRod ) );
	}

	public static void addManyullynTools(String stack)
	{
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(woodManyullynMattock), recipe, '#', stack, '|', Item.stick ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(stoneManyullynMattock), recipe, '#', stack, '|', InfiLibrary.stoneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(ironManyullynMattock), recipe, '#', stack, '|', InfiLibrary.ironRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(diamondManyullynMattock), recipe, '#', stack, '|', InfiLibrary.diamondRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(redstoneManyullynMattock), recipe, '#', stack, '|', InfiLibrary.redstoneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(obsidianManyullynMattock), recipe, '#', stack, '|', InfiLibrary.obsidianRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(boneManyullynMattock), recipe, '#', stack, '|', Item.bone ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(boneManyullynMattock), recipe, '#', stack, '|', InfiLibrary.boneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(slimeManyullynMattock), recipe, '#', stack, '|', InfiLibrary.slimeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(cactusManyullynMattock), recipe, '#', stack, '|', InfiLibrary.cactusRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(blazeManyullynMattock), recipe, '#', stack, '|', Item.blazeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(copperManyullynMattock), recipe, '#', stack, '|', InfiLibrary.copperRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(bronzeManyullynMattock), recipe, '#', stack, '|', InfiLibrary.bronzeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(workedManyullynMattock), recipe, '#', stack, '|', InfiLibrary.workedIronRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(steelManyullynMattock), recipe, '#', stack, '|', InfiLibrary.steelRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(cobaltManyullynMattock), recipe, '#', stack, '|', InfiLibrary.cobaltRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(arditeManyullynMattock), recipe, '#', stack, '|', InfiLibrary.arditeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(manyullynManyullynMattock), recipe, '#', stack, '|', InfiLibrary.manyullynRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(uraniumManyullynMattock), recipe, '#', stack, '|', InfiLibrary.uraniumRod ) );
	}

	public static void addUraniumTools(String stack)
	{
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(diamondUraniumMattock), recipe, '#', stack, '|', InfiLibrary.diamondRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(redstoneUraniumMattock), recipe, '#', stack, '|', InfiLibrary.redstoneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(boneUraniumMattock), recipe, '#', stack, '|', Item.bone ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(boneUraniumMattock), recipe, '#', stack, '|', InfiLibrary.boneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(netherrackUraniumMattock), recipe, '#', stack, '|', InfiLibrary.netherrackRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(glowstoneUraniumMattock), recipe, '#', stack, '|', InfiLibrary.glowstoneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(lavaUraniumMattock), recipe, '#', stack, '|', InfiLibrary.lavaRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(blazeUraniumMattock), recipe, '#', stack, '|', Item.blazeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(cobaltUraniumMattock), recipe, '#', stack, '|', InfiLibrary.cobaltRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(arditeUraniumMattock), recipe, '#', stack, '|', InfiLibrary.arditeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(uraniumUraniumMattock), recipe, '#', stack, '|', InfiLibrary.uraniumRod ) );
	}
    
	public static Item woodWoodMattock;
	public static Item sandstoneWoodMattock;
	public static Item boneWoodMattock;
	public static Item paperWoodMattock;
	public static Item iceWoodMattock;
	public static Item slimeWoodMattock;
	public static Item cactusWoodMattock;
	
	public static Item woodStoneMattock;
	public static Item stoneStoneMattock;
	public static Item sandstoneStoneMattock;
	public static Item boneStoneMattock;
	public static Item netherrackStoneMattock;
	public static Item iceStoneMattock;
	public static Item slimeStoneMattock;
	public static Item cactusStoneMattock;
	public static Item flintStoneMattock;
	
	public static Item woodIronMattock;
	public static Item stoneIronMattock;
	public static Item ironIronMattock;
	public static Item boneIronMattock;
	public static Item netherrackIronMattock;
	public static Item glowstoneIronMattock;
	public static Item cactusIronMattock;
	public static Item copperIronMattock;
	public static Item bronzeIronMattock;
	
	public static Item woodDiamondMattock;
	public static Item stoneDiamondMattock;
	public static Item ironDiamondMattock;
	public static Item diamondDiamondMattock;
	public static Item redstoneDiamondMattock;
	public static Item obsidianDiamondMattock;
	public static Item boneDiamondMattock;
	public static Item mossyDiamondMattock;
	public static Item netherrackDiamondMattock;
	public static Item glowstoneDiamondMattock;
	public static Item lavaDiamondMattock;
	public static Item cactusDiamondMattock;
	public static Item flintDiamondMattock;
	public static Item blazeDiamondMattock;
	public static Item copperDiamondMattock;
	public static Item bronzeDiamondMattock;
	public static Item workedDiamondMattock;
	public static Item steelDiamondMattock;
	public static Item cobaltDiamondMattock;
	public static Item arditeDiamondMattock;
	public static Item manyullynDiamondMattock;
	public static Item uraniumDiamondMattock;
	
	public static Item woodRedstoneMattock;
	public static Item stoneRedstoneMattock;
	public static Item ironRedstoneMattock;
	public static Item redstoneRedstoneMattock;
	public static Item obsidianRedstoneMattock;
	public static Item sandstoneRedstoneMattock;
	public static Item boneRedstoneMattock;
	public static Item paperRedstoneMattock;
	public static Item mossyRedstoneMattock;
	public static Item netherrackRedstoneMattock;
	public static Item glowstoneRedstoneMattock;
	public static Item iceRedstoneMattock;
	public static Item lavaRedstoneMattock;
	public static Item slimeRedstoneMattock;
	public static Item cactusRedstoneMattock;
	public static Item flintRedstoneMattock;
	public static Item copperRedstoneMattock;
	public static Item bronzeRedstoneMattock;
	public static Item workedRedstoneMattock;
	public static Item uraniumRedstoneMattock;
	
	public static Item woodObsidianMattock;
	public static Item stoneObsidianMattock;
	public static Item redstoneObsidianMattock;
	public static Item obsidianObsidianMattock;
	public static Item boneObsidianMattock;
	public static Item netherrackObsidianMattock;
	public static Item glowstoneObsidianMattock;
	public static Item iceObsidianMattock;
	public static Item lavaObsidianMattock;
	public static Item cactusObsidianMattock;
	
	public static Item woodSandstoneMattock;
	public static Item sandstoneSandstoneMattock;
	public static Item boneSandstoneMattock;
	public static Item netherrackSandstoneMattock;
	public static Item iceSandstoneMattock;
	public static Item slimeSandstoneMattock;
	public static Item cactusSandstoneMattock;
	public static Item flintSandstoneMattock;
	
	public static Item woodBoneMattock;
	public static Item stoneBoneMattock;
	public static Item sandstoneBoneMattock;
	public static Item boneBoneMattock;
	public static Item paperBoneMattock;
	public static Item netherrackBoneMattock;
	public static Item iceBoneMattock;
	public static Item cactusBoneMattock;
	public static Item flintBoneMattock;
	
	public static Item woodPaperMattock;
	public static Item bonePaperMattock;
	public static Item paperPaperMattock;
	public static Item slimePaperMattock;
	public static Item cactusPaperMattock;
	
	public static Item woodMossyMattock;
	public static Item stoneMossyMattock;
	public static Item diamondMossyMattock;
	public static Item redstoneMossyMattock;
	public static Item boneMossyMattock;
	public static Item mossyMossyMattock;
	public static Item netherrackMossyMattock;
	public static Item glowstoneMossyMattock;
	public static Item cactusMossyMattock;
	public static Item blazeMossyMattock;
	public static Item manyullynMossyMattock;
	public static Item uraniumMossyMattock;
	
	public static Item woodNetherrackMattock;
	public static Item stoneNetherrackMattock;
	public static Item sandstoneNetherrackMattock;
	public static Item boneNetherrackMattock;
	public static Item paperNetherrackMattock;
	public static Item mossyNetherrackMattock;
	public static Item netherrackNetherrackMattock;
	public static Item iceNetherrackMattock;
	public static Item slimeNetherrackMattock;
	public static Item cactusNetherrackMattock;
	public static Item flintNetherrackMattock;
	public static Item copperNetherrackMattock;
	public static Item bronzeNetherrackMattock;
	
	public static Item woodGlowstoneMattock;
	public static Item redstoneGlowstoneMattock;
	public static Item obsidianGlowstoneMattock;
	public static Item boneGlowstoneMattock;
	public static Item netherrackGlowstoneMattock;
	public static Item glowstoneGlowstoneMattock;
	public static Item iceGlowstoneMattock;
	public static Item slimeGlowstoneMattock;
	public static Item cactusGlowstoneMattock;
	
	public static Item woodIceMattock;
	public static Item boneIceMattock;
	public static Item paperIceMattock;
	public static Item iceIceMattock;
	public static Item slimeIceMattock;
	public static Item cactusIceMattock;
	
	public static Item diamondLavaMattock;
	public static Item obsidianLavaMattock;
	public static Item netherrackLavaMattock;
	public static Item lavaLavaMattock;
	public static Item flintLavaMattock;
	public static Item blazeLavaMattock;
	public static Item manyullynLavaMattock;
	public static Item uraniumLavaMattock;
	
	public static Item woodSlimeMattock;
	public static Item sandstoneSlimeMattock;
	public static Item boneSlimeMattock;
	public static Item paperSlimeMattock;
	public static Item slimeSlimeMattock;
	public static Item cactusSlimeMattock;
	
	public static Item woodCactusMattock;
	public static Item sandstoneCactusMattock;
	public static Item boneCactusMattock;
	public static Item netherrackCactusMattock;
	public static Item iceCactusMattock;
	public static Item slimeCactusMattock;
	public static Item cactusCactusMattock;
	
	public static Item woodFlintMattock;
	public static Item stoneFlintMattock;
	public static Item sandstoneFlintMattock;
	public static Item boneFlintMattock;
	public static Item netherrackFlintMattock;
	public static Item slimeFlintMattock;
	public static Item cactusFlintMattock;
	public static Item flintFlintMattock;
	public static Item copperFlintMattock;
	public static Item bronzeFlintMattock;
	
	public static Item diamondBlazeMattock;
	public static Item obsidianBlazeMattock;
	public static Item netherrackBlazeMattock;
	public static Item lavaBlazeMattock;
	public static Item flintBlazeMattock;
	public static Item blazeBlazeMattock;
	public static Item manyullynBlazeMattock;
	public static Item uraniumBlazeMattock;
	
	public static Item woodCopperMattock;
	public static Item stoneCopperMattock;
    public static Item boneCopperMattock;
    public static Item netherrackCopperMattock;
    public static Item slimeCopperMattock;
    public static Item cactusCopperMattock;
    public static Item flintCopperMattock;
    public static Item copperCopperMattock;
    
    public static Item woodBronzeMattock;
    public static Item stoneBronzeMattock;
    public static Item boneBronzeMattock;
    public static Item netherrackBronzeMattock;
    public static Item slimeBronzeMattock;
    public static Item cactusBronzeMattock;
    public static Item flintBronzeMattock;
    public static Item copperBronzeMattock;
    public static Item bronzeBronzeMattock;
    
    public static Item woodWorkedIronMattock;
    public static Item stoneWorkedIronMattock;
    public static Item ironWorkedIronMattock;
    public static Item diamondWorkedIronMattock;
    public static Item redstoneWorkedIronMattock;
    public static Item obsidianWorkedIronMattock;
    public static Item boneWorkedIronMattock;
    public static Item netherrackWorkedIronMattock;
    public static Item glowstoneWorkedIronMattock;
    public static Item iceWorkedIronMattock;
    public static Item slimeWorkedIronMattock;
    public static Item cactusWorkedIronMattock;
    public static Item blazeWorkedIronMattock;
    public static Item copperWorkedIronMattock;
    public static Item bronzeWorkedIronMattock;
    public static Item workedWorkedIronMattock;
    public static Item steelWorkedIronMattock;
    public static Item uraniumWorkedIronMattock;
    
    public static Item woodSteelMattock;
    public static Item stoneSteelMattock;
    public static Item ironSteelMattock;
    public static Item diamondSteelMattock;
    public static Item redstoneSteelMattock;
    public static Item obsidianSteelMattock;
    public static Item boneSteelMattock;
    public static Item netherrackSteelMattock;
    public static Item glowstoneSteelMattock;
    public static Item iceSteelMattock;
    public static Item slimeSteelMattock;
    public static Item cactusSteelMattock;
    public static Item blazeSteelMattock;
    public static Item copperSteelMattock;
    public static Item bronzeSteelMattock;
    public static Item workedSteelMattock;
    public static Item steelSteelMattock;
    public static Item cobaltSteelMattock;
    public static Item arditeSteelMattock;
    public static Item uraniumSteelMattock;
    
    public static Item woodCobaltMattock;
    public static Item stoneCobaltMattock;
    public static Item ironCobaltMattock;
    public static Item diamondCobaltMattock;
    public static Item redstoneCobaltMattock;
    public static Item obsidianCobaltMattock;
    public static Item boneCobaltMattock;
    public static Item slimeCobaltMattock;
    public static Item cactusCobaltMattock;
    public static Item blazeCobaltMattock;
    public static Item copperCobaltMattock;
    public static Item bronzeCobaltMattock;
    public static Item workedCobaltMattock;
    public static Item steelCobaltMattock;
    public static Item cobaltCobaltMattock;
    public static Item arditeCobaltMattock;
    public static Item manyullynCobaltMattock;
    public static Item uraniumCobaltMattock;
    
    public static Item woodArditeMattock;
    public static Item stoneArditeMattock;
    public static Item ironArditeMattock;
    public static Item diamondArditeMattock;
    public static Item redstoneArditeMattock;
    public static Item obsidianArditeMattock;
    public static Item boneArditeMattock;
    public static Item slimeArditeMattock;
    public static Item cactusArditeMattock;
    public static Item blazeArditeMattock;
    public static Item copperArditeMattock;
    public static Item bronzeArditeMattock;
    public static Item workedArditeMattock;
    public static Item steelArditeMattock;
    public static Item cobaltArditeMattock;
    public static Item arditeArditeMattock;
    public static Item manyullynArditeMattock;
    public static Item uraniumArditeMattock;
    
    public static Item woodManyullynMattock;
    public static Item stoneManyullynMattock;
    public static Item ironManyullynMattock;
    public static Item diamondManyullynMattock;
    public static Item redstoneManyullynMattock;
    public static Item obsidianManyullynMattock;
    public static Item boneManyullynMattock;
    public static Item slimeManyullynMattock;
    public static Item cactusManyullynMattock;
    public static Item blazeManyullynMattock;
    public static Item copperManyullynMattock;
    public static Item bronzeManyullynMattock;
    public static Item workedManyullynMattock;
    public static Item steelManyullynMattock;
    public static Item cobaltManyullynMattock;
    public static Item arditeManyullynMattock;
    public static Item manyullynManyullynMattock;
    public static Item uraniumManyullynMattock;
    
    public static Item diamondUraniumMattock;
    public static Item redstoneUraniumMattock;
    public static Item boneUraniumMattock;
    public static Item netherrackUraniumMattock;
    public static Item glowstoneUraniumMattock;
    public static Item lavaUraniumMattock;
    public static Item blazeUraniumMattock;
    public static Item cobaltUraniumMattock;
    public static Item arditeUraniumMattock;
    public static Item uraniumUraniumMattock;
}
