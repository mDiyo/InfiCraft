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

public class IceAxes 
{
    public static IceAxes instance = new IceAxes();
    
    private static String[] recipe = { "##s", " | ", " | " };
    
    public static IceAxes getInstance()
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
    	woodWoodIceAxe = new InfiToolIceAxe(PHInfiHybrids.woodIceAxeID+0, 
                InfiMaterialEnum.Wood, InfiMaterialEnum.Wood, "woodWoodIceAxe");
    	woodStoneIceAxe = new InfiToolIceAxe(PHInfiHybrids.stoneIceAxeID+0, 
                InfiMaterialEnum.Stone, InfiMaterialEnum.Wood, "woodStoneIceAxe");
    	woodIronIceAxe = new InfiToolIceAxe(PHInfiHybrids.ironIceAxeID+0, 
                InfiMaterialEnum.Iron, InfiMaterialEnum.Wood, "woodIronIceAxe");
    	woodDiamondIceAxe = new InfiToolIceAxe(PHInfiHybrids.diamondIceAxeID+0, 
                InfiMaterialEnum.Diamond, InfiMaterialEnum.Wood, "woodDiamondIceAxe");
    	
    	MinecraftForge.setToolClass(woodWoodIceAxe, "IceAxe", InfiMaterialEnum.Wood.getHarvestLevel());
    	MinecraftForge.setToolClass(woodStoneIceAxe, "IceAxe", InfiMaterialEnum.Stone.getHarvestLevel());
    	MinecraftForge.setToolClass(woodIronIceAxe, "IceAxe", InfiMaterialEnum.Iron.getHarvestLevel());
    	MinecraftForge.setToolClass(woodDiamondIceAxe, "IceAxe", InfiMaterialEnum.Diamond.getHarvestLevel());
    	
    	ModLoader.addName(woodWoodIceAxe, "Wooden Ice Axe");
    }
    
    private static void registerVanillaRecipes()
    {
    	ModLoader.addRecipe(new ItemStack(woodWoodIceAxe), new Object[] 
                { recipe, '#', Block.planks, '|', Item.stick, 's', Item.stick });
		ModLoader.addRecipe(new ItemStack(woodStoneIceAxe), new Object[] 
                { recipe, '#', Block.cobblestone, '|', Item.stick, 's', InfiLibrary.stoneShard });
		ModLoader.addRecipe(new ItemStack(woodIronIceAxe), new Object[] 
                { recipe, '#', Item.ingotIron, '|', Item.stick, 's', InfiLibrary.ironChunk });
		ModLoader.addRecipe(new ItemStack(woodDiamondIceAxe), new Object[] 
                { recipe, '#', Item.diamond, '|', Item.stick, 's', InfiLibrary.diamondShard });
    }
    
    private static void createTools()
    {
    	if(PHInfiHybrids.enableWoodTools)
    	{
    		woodWoodIceAxe = new InfiToolIceAxe(PHInfiHybrids.woodIceAxeID+0, 
                    InfiMaterialEnum.Wood, InfiMaterialEnum.Wood, "woodWoodIceAxe");
    		sandstoneWoodIceAxe = new InfiToolIceAxe(PHInfiHybrids.woodIceAxeID+1, 
                    InfiMaterialEnum.Wood, InfiMaterialEnum.Sandstone, "sandstoneWoodIceAxe");
    		boneWoodIceAxe = new InfiToolIceAxe(PHInfiHybrids.woodIceAxeID+2, 
                    InfiMaterialEnum.Wood, InfiMaterialEnum.Bone, "boneWoodIceAxe");
    		paperWoodIceAxe = new InfiToolIceAxe(PHInfiHybrids.woodIceAxeID+3, 
                    InfiMaterialEnum.Wood, InfiMaterialEnum.Paper, "paperWoodIceAxe");
    		iceWoodIceAxe = new InfiToolIceAxe(PHInfiHybrids.woodIceAxeID+4, 
                    InfiMaterialEnum.Wood, InfiMaterialEnum.Ice, "iceWoodIceAxe");
    		slimeWoodIceAxe = new InfiToolIceAxe(PHInfiHybrids.woodIceAxeID+5, 
                    InfiMaterialEnum.Wood, InfiMaterialEnum.Slime, "slimeWoodIceAxe");
    		cactusWoodIceAxe = new InfiToolIceAxe(PHInfiHybrids.woodIceAxeID+6, 
                    InfiMaterialEnum.Wood, InfiMaterialEnum.Cactus, "cactusWoodIceAxe");
    		
    		MinecraftForge.setToolClass(woodWoodIceAxe, "IceAxe", InfiMaterialEnum.Wood.getHarvestLevel());
    		MinecraftForge.setToolClass(sandstoneWoodIceAxe, "IceAxe", InfiMaterialEnum.Wood.getHarvestLevel());
    		MinecraftForge.setToolClass(boneWoodIceAxe, "IceAxe", InfiMaterialEnum.Wood.getHarvestLevel());
    		MinecraftForge.setToolClass(paperWoodIceAxe, "IceAxe", InfiMaterialEnum.Wood.getHarvestLevel());
    		MinecraftForge.setToolClass(iceWoodIceAxe, "IceAxe", InfiMaterialEnum.Wood.getHarvestLevel());
    		MinecraftForge.setToolClass(slimeWoodIceAxe, "IceAxe", InfiMaterialEnum.Wood.getHarvestLevel());
    		MinecraftForge.setToolClass(cactusWoodIceAxe, "IceAxe", InfiMaterialEnum.Wood.getHarvestLevel());
    	}

        if(PHInfiHybrids.enableStoneTools)
        {
        	woodStoneIceAxe = new InfiToolIceAxe(PHInfiHybrids.stoneIceAxeID+0, 
                    InfiMaterialEnum.Stone, InfiMaterialEnum.Wood, "woodStoneIceAxe");
        	stoneStoneIceAxe = new InfiToolIceAxe(PHInfiHybrids.stoneIceAxeID+1, 
                    InfiMaterialEnum.Stone, InfiMaterialEnum.Stone, "stoneStoneIceAxe");
        	sandstoneStoneIceAxe = new InfiToolIceAxe(PHInfiHybrids.stoneIceAxeID+2, 
                    InfiMaterialEnum.Stone, InfiMaterialEnum.Sandstone, "sandstoneStoneIceAxe");
        	boneStoneIceAxe = new InfiToolIceAxe(PHInfiHybrids.stoneIceAxeID+3, 
                    InfiMaterialEnum.Stone, InfiMaterialEnum.Bone, "boneStoneIceAxe");
        	netherrackStoneIceAxe = new InfiToolIceAxe(PHInfiHybrids.stoneIceAxeID+4, 
                    InfiMaterialEnum.Stone, InfiMaterialEnum.Netherrack, "netherrackStoneIceAxe");
        	iceStoneIceAxe = new InfiToolIceAxe(PHInfiHybrids.stoneIceAxeID+5, 
                    InfiMaterialEnum.Stone, InfiMaterialEnum.Ice, "iceStoneIceAxe");
        	slimeStoneIceAxe = new InfiToolIceAxe(PHInfiHybrids.stoneIceAxeID+6, 
                    InfiMaterialEnum.Stone, InfiMaterialEnum.Slime, "slimeStoneIceAxe");
        	cactusStoneIceAxe = new InfiToolIceAxe(PHInfiHybrids.stoneIceAxeID+7, 
                    InfiMaterialEnum.Stone, InfiMaterialEnum.Cactus, "cactusStoneIceAxe");
        	flintStoneIceAxe = new InfiToolIceAxe(PHInfiHybrids.stoneIceAxeID+8, 
                    InfiMaterialEnum.Stone, InfiMaterialEnum.Flint, "flintStoneIceAxe");
            
            MinecraftForge.setToolClass(woodStoneIceAxe, "IceAxe", InfiMaterialEnum.Stone.getHarvestLevel());
            MinecraftForge.setToolClass(stoneStoneIceAxe, "IceAxe", InfiMaterialEnum.Stone.getHarvestLevel());
            MinecraftForge.setToolClass(sandstoneStoneIceAxe, "IceAxe", InfiMaterialEnum.Stone.getHarvestLevel());
            MinecraftForge.setToolClass(boneStoneIceAxe, "IceAxe", InfiMaterialEnum.Stone.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackStoneIceAxe, "IceAxe", InfiMaterialEnum.Stone.getHarvestLevel());
            MinecraftForge.setToolClass(iceStoneIceAxe, "IceAxe", InfiMaterialEnum.Stone.getHarvestLevel());
            MinecraftForge.setToolClass(slimeStoneIceAxe, "IceAxe", InfiMaterialEnum.Stone.getHarvestLevel());
            MinecraftForge.setToolClass(cactusStoneIceAxe, "IceAxe", InfiMaterialEnum.Stone.getHarvestLevel());
            MinecraftForge.setToolClass(flintStoneIceAxe, "IceAxe", InfiMaterialEnum.Stone.getHarvestLevel());
        }
        
        if(PHInfiHybrids.enableIronTools)
        {
        	woodIronIceAxe = new InfiToolIceAxe(PHInfiHybrids.ironIceAxeID+0, 
                    InfiMaterialEnum.Iron, InfiMaterialEnum.Wood, "woodIronIceAxe");
        	stoneIronIceAxe = new InfiToolIceAxe(PHInfiHybrids.ironIceAxeID+1, 
                    InfiMaterialEnum.Iron, InfiMaterialEnum.Stone, "stoneIronIceAxe");
        	ironIronIceAxe = new InfiToolIceAxe(PHInfiHybrids.ironIceAxeID+2, 
                    InfiMaterialEnum.Iron, InfiMaterialEnum.Iron, "ironIronIceAxe");
        	boneIronIceAxe = new InfiToolIceAxe(PHInfiHybrids.ironIceAxeID+3, 
                    InfiMaterialEnum.Iron, InfiMaterialEnum.Bone, "boneIronIceAxe");
        	netherrackIronIceAxe = new InfiToolIceAxe(PHInfiHybrids.ironIceAxeID+4, 
                    InfiMaterialEnum.Iron, InfiMaterialEnum.Netherrack, "netherrackIronIceAxe");
        	glowstoneIronIceAxe = new InfiToolIceAxe(PHInfiHybrids.ironIceAxeID+5, 
                    InfiMaterialEnum.Iron, InfiMaterialEnum.Glowstone, "glowstoneIronIceAxe");
        	cactusIronIceAxe = new InfiToolIceAxe(PHInfiHybrids.ironIceAxeID+6, 
                    InfiMaterialEnum.Iron, InfiMaterialEnum.Cactus, "cactusIronIceAxe");
        	copperIronIceAxe = new InfiToolIceAxe(PHInfiHybrids.ironIceAxeID+7, 
                    InfiMaterialEnum.Iron, InfiMaterialEnum.Copper, "copperIronIceAxe");
        	bronzeIronIceAxe = new InfiToolIceAxe(PHInfiHybrids.ironIceAxeID+8, 
                    InfiMaterialEnum.Iron, InfiMaterialEnum.Bronze, "bronzeIronIceAxe");
            
            MinecraftForge.setToolClass(woodIronIceAxe, "IceAxe", InfiMaterialEnum.Iron.getHarvestLevel());
            MinecraftForge.setToolClass(stoneIronIceAxe, "IceAxe", InfiMaterialEnum.Iron.getHarvestLevel());
            MinecraftForge.setToolClass(ironIronIceAxe, "IceAxe", InfiMaterialEnum.Iron.getHarvestLevel());
            MinecraftForge.setToolClass(boneIronIceAxe, "IceAxe", InfiMaterialEnum.Iron.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackIronIceAxe, "IceAxe", InfiMaterialEnum.Iron.getHarvestLevel());
            MinecraftForge.setToolClass(glowstoneIronIceAxe, "IceAxe", InfiMaterialEnum.Iron.getHarvestLevel());
            MinecraftForge.setToolClass(cactusIronIceAxe, "IceAxe", InfiMaterialEnum.Iron.getHarvestLevel());
            MinecraftForge.setToolClass(copperIronIceAxe, "IceAxe", InfiMaterialEnum.Iron.getHarvestLevel());
            MinecraftForge.setToolClass(bronzeIronIceAxe, "IceAxe", InfiMaterialEnum.Iron.getHarvestLevel());
        }
        
        if(PHInfiHybrids.enableDiamondTools)
        {
        	woodDiamondIceAxe = new InfiToolIceAxe(PHInfiHybrids.diamondIceAxeID+0, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Wood, "woodDiamondIceAxe");
        	stoneDiamondIceAxe = new InfiToolIceAxe(PHInfiHybrids.diamondIceAxeID+1, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Stone, "stoneDiamondIceAxe");
        	ironDiamondIceAxe = new InfiToolIceAxe(PHInfiHybrids.diamondIceAxeID+2, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Iron, "ironDiamondIceAxe");
        	diamondDiamondIceAxe = new InfiToolIceAxe(PHInfiHybrids.diamondIceAxeID+3, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Diamond, "diamondDiamondIceAxe");
        	redstoneDiamondIceAxe = new InfiToolIceAxe(PHInfiHybrids.diamondIceAxeID+4, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Redstone, "redstoneDiamondIceAxe");
        	obsidianDiamondIceAxe = new InfiToolIceAxe(PHInfiHybrids.diamondIceAxeID+5, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Obsidian, "obsidianDiamondIceAxe");
        	boneDiamondIceAxe = new InfiToolIceAxe(PHInfiHybrids.diamondIceAxeID+6, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Bone, "boneDiamondIceAxe");
        	mossyDiamondIceAxe = new InfiToolIceAxe(PHInfiHybrids.diamondIceAxeID+7, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Mossy, "mossyDiamondIceAxe");
        	netherrackDiamondIceAxe = new InfiToolIceAxe(PHInfiHybrids.diamondIceAxeID+8, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Netherrack, "netherrackDiamondIceAxe");
        	glowstoneDiamondIceAxe = new InfiToolIceAxe(PHInfiHybrids.diamondIceAxeID+9, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Glowstone, "glowstoneDiamondIceAxe");
        	lavaDiamondIceAxe = new InfiToolIceAxe(PHInfiHybrids.diamondIceAxeID+10, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Lava, "lavaDiamondIceAxe");
        	cactusDiamondIceAxe = new InfiToolIceAxe(PHInfiHybrids.diamondIceAxeID+11, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Cactus, "cactusDiamondIceAxe");
        	flintDiamondIceAxe = new InfiToolIceAxe(PHInfiHybrids.diamondIceAxeID+12, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Flint, "flintDiamondIceAxe");
        	blazeDiamondIceAxe = new InfiToolIceAxe(PHInfiHybrids.diamondIceAxeID+13, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Blaze, "blazeDiamondIceAxe");
            copperDiamondIceAxe = new InfiToolIceAxe(PHInfiHybrids.diamondIceAxeID+14, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Copper, "copperDiamondIceAxe");
            bronzeDiamondIceAxe = new InfiToolIceAxe(PHInfiHybrids.diamondIceAxeID+15, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Bronze, "bronzeDiamondIceAxe");
            workedDiamondIceAxe = new InfiToolIceAxe(PHInfiHybrids.diamondIceAxeID+16, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.WorkedIron, "workedDiamondIceAxe");
            steelDiamondIceAxe = new InfiToolIceAxe(PHInfiHybrids.diamondIceAxeID+17, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Steel, "steelDiamondIceAxe");
            cobaltDiamondIceAxe = new InfiToolIceAxe(PHInfiHybrids.diamondIceAxeID+18, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Cobalt, "cobaltDiamondIceAxe");
            arditeDiamondIceAxe = new InfiToolIceAxe(PHInfiHybrids.diamondIceAxeID+19, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Ardite, "arditeDiamondIceAxe");
            manyullynDiamondIceAxe = new InfiToolIceAxe(PHInfiHybrids.diamondIceAxeID+20, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Manyullyn, "manyullynDiamondIceAxe");
            uraniumDiamondIceAxe = new InfiToolIceAxe(PHInfiHybrids.diamondIceAxeID+21, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Uranium, "uraniumDiamondIceAxe");
            
            MinecraftForge.setToolClass(woodDiamondIceAxe, "IceAxe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(stoneDiamondIceAxe, "IceAxe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(ironDiamondIceAxe, "IceAxe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(diamondDiamondIceAxe, "IceAxe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(redstoneDiamondIceAxe, "IceAxe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(obsidianDiamondIceAxe, "IceAxe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(boneDiamondIceAxe, "IceAxe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(mossyDiamondIceAxe, "IceAxe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackDiamondIceAxe, "IceAxe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(glowstoneDiamondIceAxe, "IceAxe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(lavaDiamondIceAxe, "IceAxe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(cactusDiamondIceAxe, "IceAxe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(flintDiamondIceAxe, "IceAxe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(blazeDiamondIceAxe, "IceAxe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(copperDiamondIceAxe, "IceAxe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(bronzeDiamondIceAxe, "IceAxe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(workedDiamondIceAxe, "IceAxe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(steelDiamondIceAxe, "IceAxe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(cobaltDiamondIceAxe, "IceAxe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(arditeDiamondIceAxe, "IceAxe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(manyullynDiamondIceAxe, "IceAxe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(uraniumDiamondIceAxe, "IceAxe", InfiMaterialEnum.Diamond.getHarvestLevel());
        }
        
        if(PHInfiHybrids.enableRedstoneTools)
        {
        	woodRedstoneIceAxe = new InfiToolIceAxe(PHInfiHybrids.redstoneIceAxeID+0, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Wood, "woodRedstoneIceAxe");
        	stoneRedstoneIceAxe = new InfiToolIceAxe(PHInfiHybrids.redstoneIceAxeID+1, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Stone, "stoneRedstoneIceAxe");
        	ironRedstoneIceAxe = new InfiToolIceAxe(PHInfiHybrids.redstoneIceAxeID+2, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Iron, "ironRedstoneIceAxe");
        	redstoneRedstoneIceAxe = new InfiToolIceAxe(PHInfiHybrids.redstoneIceAxeID+3, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Redstone, "redstoneRedstoneIceAxe");
        	obsidianRedstoneIceAxe = new InfiToolIceAxe(PHInfiHybrids.redstoneIceAxeID+4, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Obsidian, "obsidianRedstoneIceAxe");
        	sandstoneRedstoneIceAxe = new InfiToolIceAxe(PHInfiHybrids.redstoneIceAxeID+5, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Sandstone, "sandstoneRedstoneIceAxe");
        	boneRedstoneIceAxe = new InfiToolIceAxe(PHInfiHybrids.redstoneIceAxeID+6, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Bone, "boneRedstoneIceAxe");
        	paperRedstoneIceAxe = new InfiToolIceAxe(PHInfiHybrids.redstoneIceAxeID+7, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Paper, "paperRedstoneIceAxe");
        	mossyRedstoneIceAxe = new InfiToolIceAxe(PHInfiHybrids.redstoneIceAxeID+8, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Mossy, "mossyRedstoneIceAxe");
        	netherrackRedstoneIceAxe = new InfiToolIceAxe(PHInfiHybrids.redstoneIceAxeID+9, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Netherrack, "netherrackRedstoneIceAxe");
        	glowstoneRedstoneIceAxe = new InfiToolIceAxe(PHInfiHybrids.redstoneIceAxeID+10, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Glowstone, "glowstoneRedstoneIceAxe");
        	iceRedstoneIceAxe = new InfiToolIceAxe(PHInfiHybrids.redstoneIceAxeID+11, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Ice, "iceRedstoneIceAxe");
        	lavaRedstoneIceAxe = new InfiToolIceAxe(PHInfiHybrids.redstoneIceAxeID+12,
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Lava, "lavaRedstoneIceAxe");
        	slimeRedstoneIceAxe = new InfiToolIceAxe(PHInfiHybrids.redstoneIceAxeID+13,
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Slime, "slimeRedstoneIceAxe");
        	cactusRedstoneIceAxe = new InfiToolIceAxe(PHInfiHybrids.redstoneIceAxeID+14,
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Cactus, "cactusRedstoneIceAxe");
        	flintRedstoneIceAxe = new InfiToolIceAxe(PHInfiHybrids.redstoneIceAxeID+15,
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Flint, "flintRedstoneIceAxe");
        	copperRedstoneIceAxe = new InfiToolIceAxe(PHInfiHybrids.redstoneIceAxeID+16,
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Copper, "copperRedstoneIceAxe");
        	bronzeRedstoneIceAxe = new InfiToolIceAxe(PHInfiHybrids.redstoneIceAxeID+17,
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Bronze, "bronzeRedstoneIceAxe");
        	workedRedstoneIceAxe = new InfiToolIceAxe(PHInfiHybrids.redstoneIceAxeID+18,
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.WorkedIron, "workedRedstoneIceAxe");
        	uraniumRedstoneIceAxe = new InfiToolIceAxe(PHInfiHybrids.redstoneIceAxeID+19,
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Uranium, "uraniumRedstoneIceAxe");
            
            MinecraftForge.setToolClass(woodRedstoneIceAxe, "IceAxe", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(stoneRedstoneIceAxe, "IceAxe", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(ironRedstoneIceAxe, "IceAxe", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(redstoneRedstoneIceAxe, "IceAxe", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(obsidianRedstoneIceAxe, "IceAxe", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(sandstoneRedstoneIceAxe, "IceAxe", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(boneRedstoneIceAxe, "IceAxe", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(paperRedstoneIceAxe, "IceAxe", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(mossyRedstoneIceAxe, "IceAxe", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackRedstoneIceAxe, "IceAxe", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(glowstoneRedstoneIceAxe, "IceAxe", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(iceRedstoneIceAxe, "IceAxe", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(lavaRedstoneIceAxe, "IceAxe", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(slimeRedstoneIceAxe, "IceAxe", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(cactusRedstoneIceAxe, "IceAxe", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(flintRedstoneIceAxe, "IceAxe", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(copperRedstoneIceAxe, "IceAxe", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(bronzeRedstoneIceAxe, "IceAxe", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(workedRedstoneIceAxe, "IceAxe", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(uraniumRedstoneIceAxe, "IceAxe", InfiMaterialEnum.Redstone.getHarvestLevel());
        }
        
        if(PHInfiHybrids.enableObsidianTools)
        {
        	woodObsidianIceAxe = new InfiToolIceAxe(PHInfiHybrids.obsidianIceAxeID+0, 
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Wood, "woodObsidianIceAxe");
        	stoneObsidianIceAxe = new InfiToolIceAxe(PHInfiHybrids.obsidianIceAxeID+1, 
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Stone, "stoneObsidianIceAxe");
        	redstoneObsidianIceAxe = new InfiToolIceAxe(PHInfiHybrids.obsidianIceAxeID+2, 
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Redstone, "redstoneObsidianIceAxe");
        	obsidianObsidianIceAxe = new InfiToolIceAxe(PHInfiHybrids.obsidianIceAxeID+3, 
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Obsidian, "obsidianObsidianIceAxe");;
        	boneObsidianIceAxe = new InfiToolIceAxe(PHInfiHybrids.obsidianIceAxeID+4, 
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Bone, "boneObsidianIceAxe");
        	netherrackObsidianIceAxe = new InfiToolIceAxe(PHInfiHybrids.obsidianIceAxeID+5, 
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Netherrack, "netherrackObsidianIceAxe");
        	glowstoneObsidianIceAxe = new InfiToolIceAxe(PHInfiHybrids.obsidianIceAxeID+6, 
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Glowstone, "glowstoneObsidianIceAxe");
        	iceObsidianIceAxe = new InfiToolIceAxe(PHInfiHybrids.obsidianIceAxeID+7, 
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Ice, "iceObsidianIceAxe");
        	lavaObsidianIceAxe = new InfiToolIceAxe(PHInfiHybrids.obsidianIceAxeID+8,
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Lava, "lavaObsidianIceAxe");
        	cactusObsidianIceAxe = new InfiToolIceAxe(PHInfiHybrids.obsidianIceAxeID+9,
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Cactus, "cactusObsidianIceAxe");
            
            MinecraftForge.setToolClass(woodObsidianIceAxe, "IceAxe", InfiMaterialEnum.Obsidian.getHarvestLevel());
            MinecraftForge.setToolClass(stoneObsidianIceAxe, "IceAxe", InfiMaterialEnum.Obsidian.getHarvestLevel());
            MinecraftForge.setToolClass(redstoneObsidianIceAxe, "IceAxe", InfiMaterialEnum.Obsidian.getHarvestLevel());
            MinecraftForge.setToolClass(obsidianObsidianIceAxe, "IceAxe", InfiMaterialEnum.Obsidian.getHarvestLevel());
            MinecraftForge.setToolClass(boneObsidianIceAxe, "IceAxe", InfiMaterialEnum.Obsidian.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackObsidianIceAxe, "IceAxe", InfiMaterialEnum.Obsidian.getHarvestLevel());
            MinecraftForge.setToolClass(glowstoneObsidianIceAxe, "IceAxe", InfiMaterialEnum.Obsidian.getHarvestLevel());
            MinecraftForge.setToolClass(iceObsidianIceAxe, "IceAxe", InfiMaterialEnum.Obsidian.getHarvestLevel());
            MinecraftForge.setToolClass(lavaObsidianIceAxe, "IceAxe", InfiMaterialEnum.Obsidian.getHarvestLevel());
            MinecraftForge.setToolClass(cactusObsidianIceAxe, "IceAxe", InfiMaterialEnum.Obsidian.getHarvestLevel());
        }
        
        if(PHInfiHybrids.enableSandstoneTools)
        {
        	woodSandstoneIceAxe = new InfiToolIceAxe(PHInfiHybrids.sandstoneIceAxeID+0, 
                    InfiMaterialEnum.Sandstone, InfiMaterialEnum.Wood, "woodSandstoneIceAxe");
        	sandstoneSandstoneIceAxe = new InfiToolIceAxe(PHInfiHybrids.sandstoneIceAxeID+1, 
                    InfiMaterialEnum.Sandstone, InfiMaterialEnum.Sandstone, "sandstoneSandstoneIceAxe");
        	boneSandstoneIceAxe = new InfiToolIceAxe(PHInfiHybrids.sandstoneIceAxeID+2, 
                    InfiMaterialEnum.Sandstone, InfiMaterialEnum.Bone, "boneSandstoneIceAxe");
        	netherrackSandstoneIceAxe = new InfiToolIceAxe(PHInfiHybrids.sandstoneIceAxeID+3, 
                    InfiMaterialEnum.Sandstone, InfiMaterialEnum.Netherrack, "netherrackSandstoneIceAxe");
        	iceSandstoneIceAxe = new InfiToolIceAxe(PHInfiHybrids.sandstoneIceAxeID+4, 
                    InfiMaterialEnum.Sandstone, InfiMaterialEnum.Ice, "iceSandstoneIceAxe");
        	slimeSandstoneIceAxe = new InfiToolIceAxe(PHInfiHybrids.sandstoneIceAxeID+5,
                    InfiMaterialEnum.Sandstone, InfiMaterialEnum.Slime, "slimeSandstoneIceAxe");
        	cactusSandstoneIceAxe = new InfiToolIceAxe(PHInfiHybrids.sandstoneIceAxeID+6,
                    InfiMaterialEnum.Sandstone, InfiMaterialEnum.Cactus, "cactusSandstoneIceAxe");
        	flintSandstoneIceAxe = new InfiToolIceAxe(PHInfiHybrids.sandstoneIceAxeID+7,
                    InfiMaterialEnum.Sandstone, InfiMaterialEnum.Flint, "flintSandstoneIceAxe");
            
            MinecraftForge.setToolClass(woodSandstoneIceAxe, "IceAxe", InfiMaterialEnum.Sandstone.getHarvestLevel());
            MinecraftForge.setToolClass(sandstoneSandstoneIceAxe, "IceAxe", InfiMaterialEnum.Sandstone.getHarvestLevel());
            MinecraftForge.setToolClass(boneSandstoneIceAxe, "IceAxe", InfiMaterialEnum.Sandstone.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackSandstoneIceAxe, "IceAxe", InfiMaterialEnum.Sandstone.getHarvestLevel());
            MinecraftForge.setToolClass(iceSandstoneIceAxe, "IceAxe", InfiMaterialEnum.Sandstone.getHarvestLevel());
            MinecraftForge.setToolClass(slimeSandstoneIceAxe, "IceAxe", InfiMaterialEnum.Sandstone.getHarvestLevel());
            MinecraftForge.setToolClass(cactusSandstoneIceAxe, "IceAxe", InfiMaterialEnum.Sandstone.getHarvestLevel());
            MinecraftForge.setToolClass(flintSandstoneIceAxe, "IceAxe", InfiMaterialEnum.Sandstone.getHarvestLevel());
        }
        
        if(PHInfiHybrids.enableBoneTools)
        {
        	woodBoneIceAxe = new InfiToolIceAxe(PHInfiHybrids.boneIceAxeID+0, 
                    InfiMaterialEnum.Bone, InfiMaterialEnum.Wood, "woodBoneIceAxe");
        	stoneBoneIceAxe = new InfiToolIceAxe(PHInfiHybrids.boneIceAxeID+1, 
                    InfiMaterialEnum.Bone, InfiMaterialEnum.Stone, "stoneBoneIceAxe");
        	sandstoneBoneIceAxe = new InfiToolIceAxe(PHInfiHybrids.boneIceAxeID+2, 
                    InfiMaterialEnum.Bone, InfiMaterialEnum.Sandstone, "sandstoneBoneIceAxe");
        	boneBoneIceAxe = new InfiToolIceAxe(PHInfiHybrids.boneIceAxeID+3, 
                    InfiMaterialEnum.Bone, InfiMaterialEnum.Bone, "boneBoneIceAxe");
        	paperBoneIceAxe = new InfiToolIceAxe(PHInfiHybrids.boneIceAxeID+4, 
                    InfiMaterialEnum.Bone, InfiMaterialEnum.Paper, "paperBoneIceAxe");
        	netherrackBoneIceAxe = new InfiToolIceAxe(PHInfiHybrids.boneIceAxeID+5, 
                    InfiMaterialEnum.Bone, InfiMaterialEnum.Netherrack, "netherrackBoneIceAxe");
        	iceBoneIceAxe = new InfiToolIceAxe(PHInfiHybrids.boneIceAxeID+6, 
                    InfiMaterialEnum.Bone, InfiMaterialEnum.Ice, "iceBoneIceAxe");
        	cactusBoneIceAxe = new InfiToolIceAxe(PHInfiHybrids.boneIceAxeID+7,
                    InfiMaterialEnum.Bone, InfiMaterialEnum.Cactus, "cactusBoneIceAxe");
        	flintBoneIceAxe = new InfiToolIceAxe(PHInfiHybrids.boneIceAxeID+8,
                    InfiMaterialEnum.Bone, InfiMaterialEnum.Flint, "flintBoneIceAxe");
            
            MinecraftForge.setToolClass(woodBoneIceAxe, "IceAxe", InfiMaterialEnum.Bone.getHarvestLevel());
            MinecraftForge.setToolClass(stoneBoneIceAxe, "IceAxe", InfiMaterialEnum.Bone.getHarvestLevel());
            MinecraftForge.setToolClass(sandstoneBoneIceAxe, "IceAxe", InfiMaterialEnum.Bone.getHarvestLevel());
            MinecraftForge.setToolClass(boneBoneIceAxe, "IceAxe", InfiMaterialEnum.Bone.getHarvestLevel());
            MinecraftForge.setToolClass(paperBoneIceAxe, "IceAxe", InfiMaterialEnum.Bone.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackBoneIceAxe, "IceAxe", InfiMaterialEnum.Bone.getHarvestLevel());
            MinecraftForge.setToolClass(iceBoneIceAxe, "IceAxe", InfiMaterialEnum.Bone.getHarvestLevel());
            MinecraftForge.setToolClass(cactusBoneIceAxe, "IceAxe", InfiMaterialEnum.Bone.getHarvestLevel());
            MinecraftForge.setToolClass(flintBoneIceAxe, "IceAxe", InfiMaterialEnum.Bone.getHarvestLevel());
        }
        
        if(PHInfiHybrids.enablePaperTools)
        {
        	woodPaperIceAxe = new InfiToolIceAxe(PHInfiHybrids.paperIceAxeID+0, 
                    InfiMaterialEnum.Paper, InfiMaterialEnum.Wood, "woodPaperIceAxe");
        	bonePaperIceAxe = new InfiToolIceAxe(PHInfiHybrids.paperIceAxeID+1, 
                    InfiMaterialEnum.Paper, InfiMaterialEnum.Bone, "bonePaperIceAxe");
        	paperPaperIceAxe = new InfiToolIceAxe(PHInfiHybrids.paperIceAxeID+2, 
                    InfiMaterialEnum.Paper, InfiMaterialEnum.Paper, "paperPaperIceAxe");
        	slimePaperIceAxe = new InfiToolIceAxe(PHInfiHybrids.paperIceAxeID+3,
                    InfiMaterialEnum.Paper, InfiMaterialEnum.Slime, "slimePaperIceAxe");
        	cactusPaperIceAxe = new InfiToolIceAxe(PHInfiHybrids.paperIceAxeID+4,
                    InfiMaterialEnum.Paper, InfiMaterialEnum.Cactus, "cactusPaperIceAxe");
            
            MinecraftForge.setToolClass(woodPaperIceAxe, "IceAxe", InfiMaterialEnum.Paper.getHarvestLevel());
            MinecraftForge.setToolClass(bonePaperIceAxe, "IceAxe", InfiMaterialEnum.Paper.getHarvestLevel());
            MinecraftForge.setToolClass(paperPaperIceAxe, "IceAxe", InfiMaterialEnum.Paper.getHarvestLevel());
            MinecraftForge.setToolClass(slimePaperIceAxe, "IceAxe", InfiMaterialEnum.Paper.getHarvestLevel());
            MinecraftForge.setToolClass(cactusPaperIceAxe, "IceAxe", InfiMaterialEnum.Paper.getHarvestLevel());
        }
        
        if(PHInfiHybrids.enableMossyTools)
        {
        	woodMossyIceAxe = new InfiToolIceAxe(PHInfiHybrids.mossyIceAxeID+0, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Wood, "woodMossyIceAxe");
        	stoneMossyIceAxe = new InfiToolIceAxe(PHInfiHybrids.mossyIceAxeID+1, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Stone, "stoneMossyIceAxe");
        	diamondMossyIceAxe = new InfiToolIceAxe(PHInfiHybrids.mossyIceAxeID+2, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Diamond, "diamondMossyIceAxe");
        	redstoneMossyIceAxe = new InfiToolIceAxe(PHInfiHybrids.mossyIceAxeID+3, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Redstone, "redstoneMossyIceAxe");
        	boneMossyIceAxe = new InfiToolIceAxe(PHInfiHybrids.mossyIceAxeID+4, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Bone, "boneMossyIceAxe");
        	mossyMossyIceAxe = new InfiToolIceAxe(PHInfiHybrids.mossyIceAxeID+5, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Mossy, "mossyMossyIceAxe");
        	netherrackMossyIceAxe = new InfiToolIceAxe(PHInfiHybrids.mossyIceAxeID+6, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Netherrack, "netherrackMossyIceAxe");
        	glowstoneMossyIceAxe = new InfiToolIceAxe(PHInfiHybrids.mossyIceAxeID+7, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Glowstone, "glowstoneMossyIceAxe");
        	cactusMossyIceAxe = new InfiToolIceAxe(PHInfiHybrids.mossyIceAxeID+8, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Cactus, "cactusMossyIceAxe");
        	blazeMossyIceAxe = new InfiToolIceAxe(PHInfiHybrids.mossyIceAxeID+9, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Blaze, "blazeMossyIceAxe");
        	manyullynMossyIceAxe = new InfiToolIceAxe(PHInfiHybrids.mossyIceAxeID+10, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Manyullyn, "manyullynMossyIceAxe");
        	uraniumMossyIceAxe = new InfiToolIceAxe(PHInfiHybrids.mossyIceAxeID+11, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Uranium, "uraniumMossyIceAxe");
            
            MinecraftForge.setToolClass(woodMossyIceAxe, "IceAxe", InfiMaterialEnum.Mossy.getHarvestLevel());
            MinecraftForge.setToolClass(stoneMossyIceAxe, "IceAxe", InfiMaterialEnum.Mossy.getHarvestLevel());
            MinecraftForge.setToolClass(diamondMossyIceAxe, "IceAxe", InfiMaterialEnum.Mossy.getHarvestLevel());
            MinecraftForge.setToolClass(redstoneMossyIceAxe, "IceAxe", InfiMaterialEnum.Mossy.getHarvestLevel());
            MinecraftForge.setToolClass(boneMossyIceAxe, "IceAxe", InfiMaterialEnum.Mossy.getHarvestLevel());
            MinecraftForge.setToolClass(mossyMossyIceAxe, "IceAxe", InfiMaterialEnum.Mossy.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackMossyIceAxe, "IceAxe", InfiMaterialEnum.Mossy.getHarvestLevel());
            MinecraftForge.setToolClass(glowstoneMossyIceAxe, "IceAxe", InfiMaterialEnum.Mossy.getHarvestLevel());
            MinecraftForge.setToolClass(cactusMossyIceAxe, "IceAxe", InfiMaterialEnum.Mossy.getHarvestLevel());
            MinecraftForge.setToolClass(blazeMossyIceAxe, "IceAxe", InfiMaterialEnum.Mossy.getHarvestLevel());
            MinecraftForge.setToolClass(manyullynMossyIceAxe, "IceAxe", InfiMaterialEnum.Mossy.getHarvestLevel());
            MinecraftForge.setToolClass(uraniumMossyIceAxe, "IceAxe", InfiMaterialEnum.Mossy.getHarvestLevel());
        }
        
        if(PHInfiHybrids.enableNetherrackTools)
        {
        	woodNetherrackIceAxe = new InfiToolIceAxe(PHInfiHybrids.netherrackIceAxeID+0, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Wood, "woodNetherrackIceAxe");
        	stoneNetherrackIceAxe = new InfiToolIceAxe(PHInfiHybrids.netherrackIceAxeID+1, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Stone, "stoneNetherrackIceAxe");
        	sandstoneNetherrackIceAxe = new InfiToolIceAxe(PHInfiHybrids.netherrackIceAxeID+2, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Sandstone, "sandstoneNetherrackIceAxe");
        	boneNetherrackIceAxe = new InfiToolIceAxe(PHInfiHybrids.netherrackIceAxeID+3, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Bone, "boneNetherrackIceAxe");
        	paperNetherrackIceAxe = new InfiToolIceAxe(PHInfiHybrids.netherrackIceAxeID+4, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Paper, "paperNetherrackIceAxe");
        	mossyNetherrackIceAxe = new InfiToolIceAxe(PHInfiHybrids.netherrackIceAxeID+5, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Mossy, "mossyNetherrackIceAxe");
        	netherrackNetherrackIceAxe = new InfiToolIceAxe(PHInfiHybrids.netherrackIceAxeID+6, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Netherrack, "netherrackNetherrackIceAxe");
        	iceNetherrackIceAxe = new InfiToolIceAxe(PHInfiHybrids.netherrackIceAxeID+7, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Ice, "iceNetherrackIceAxe");
        	slimeNetherrackIceAxe = new InfiToolIceAxe(PHInfiHybrids.netherrackIceAxeID+8, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Slime, "slimeNetherrackIceAxe");
        	cactusNetherrackIceAxe = new InfiToolIceAxe(PHInfiHybrids.netherrackIceAxeID+9, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Cactus, "cactusNetherrackIceAxe");
        	flintNetherrackIceAxe = new InfiToolIceAxe(PHInfiHybrids.netherrackIceAxeID+10, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Flint, "flintNetherrackIceAxe");
        	copperNetherrackIceAxe = new InfiToolIceAxe(PHInfiHybrids.netherrackIceAxeID+11, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Copper, "copperNetherrackIceAxe");
        	bronzeNetherrackIceAxe = new InfiToolIceAxe(PHInfiHybrids.netherrackIceAxeID+12, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Bronze, "bronzeNetherrackIceAxe");
            
            MinecraftForge.setToolClass(woodNetherrackIceAxe, "IceAxe", InfiMaterialEnum.Netherrack.getHarvestLevel());
            MinecraftForge.setToolClass(stoneNetherrackIceAxe, "IceAxe", InfiMaterialEnum.Netherrack.getHarvestLevel());
            MinecraftForge.setToolClass(sandstoneNetherrackIceAxe, "IceAxe", InfiMaterialEnum.Netherrack.getHarvestLevel());
            MinecraftForge.setToolClass(boneNetherrackIceAxe, "IceAxe", InfiMaterialEnum.Netherrack.getHarvestLevel());
            MinecraftForge.setToolClass(paperNetherrackIceAxe, "IceAxe", InfiMaterialEnum.Netherrack.getHarvestLevel());
            MinecraftForge.setToolClass(mossyNetherrackIceAxe, "IceAxe", InfiMaterialEnum.Netherrack.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackNetherrackIceAxe, "IceAxe", InfiMaterialEnum.Netherrack.getHarvestLevel());
            MinecraftForge.setToolClass(iceNetherrackIceAxe, "IceAxe", InfiMaterialEnum.Netherrack.getHarvestLevel());
            MinecraftForge.setToolClass(slimeNetherrackIceAxe, "IceAxe", InfiMaterialEnum.Netherrack.getHarvestLevel());
            MinecraftForge.setToolClass(cactusNetherrackIceAxe, "IceAxe", InfiMaterialEnum.Netherrack.getHarvestLevel());
            MinecraftForge.setToolClass(flintNetherrackIceAxe, "IceAxe", InfiMaterialEnum.Netherrack.getHarvestLevel());
            MinecraftForge.setToolClass(copperNetherrackIceAxe, "IceAxe", InfiMaterialEnum.Netherrack.getHarvestLevel());
            MinecraftForge.setToolClass(bronzeNetherrackIceAxe, "IceAxe", InfiMaterialEnum.Netherrack.getHarvestLevel());
        }
        
        if(PHInfiHybrids.enableGlowstoneTools)
        {
        	woodGlowstoneIceAxe = new InfiToolIceAxe(PHInfiHybrids.glowstoneIceAxeID+0, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Wood, "woodGlowstoneIceAxe");
        	redstoneGlowstoneIceAxe = new InfiToolIceAxe(PHInfiHybrids.glowstoneIceAxeID+1, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Redstone, "redstoneGlowstoneIceAxe");
        	obsidianGlowstoneIceAxe = new InfiToolIceAxe(PHInfiHybrids.glowstoneIceAxeID+2, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Obsidian, "obsidianGlowstoneIceAxe");
        	boneGlowstoneIceAxe = new InfiToolIceAxe(PHInfiHybrids.glowstoneIceAxeID+3, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Bone, "boneGlowstoneIceAxe");
        	netherrackGlowstoneIceAxe = new InfiToolIceAxe(PHInfiHybrids.glowstoneIceAxeID+4, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Netherrack, "netherrackGlowstoneIceAxe");
        	glowstoneGlowstoneIceAxe = new InfiToolIceAxe(PHInfiHybrids.glowstoneIceAxeID+5, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Glowstone, "glowstoneGlowstoneIceAxe");
        	iceGlowstoneIceAxe = new InfiToolIceAxe(PHInfiHybrids.glowstoneIceAxeID+6, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Ice, "iceGlowstoneIceAxe");
        	slimeGlowstoneIceAxe = new InfiToolIceAxe(PHInfiHybrids.glowstoneIceAxeID+7, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Slime, "slimeGlowstoneIceAxe");
        	cactusGlowstoneIceAxe = new InfiToolIceAxe(PHInfiHybrids.glowstoneIceAxeID+8, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Cactus, "cactusGlowstoneIceAxe");
            
            
            MinecraftForge.setToolClass(woodGlowstoneIceAxe, "IceAxe", InfiMaterialEnum.Glowstone.getHarvestLevel());
            MinecraftForge.setToolClass(redstoneGlowstoneIceAxe, "IceAxe", InfiMaterialEnum.Glowstone.getHarvestLevel());
            MinecraftForge.setToolClass(obsidianGlowstoneIceAxe, "IceAxe", InfiMaterialEnum.Glowstone.getHarvestLevel());
            MinecraftForge.setToolClass(boneGlowstoneIceAxe, "IceAxe", InfiMaterialEnum.Glowstone.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackGlowstoneIceAxe, "IceAxe", InfiMaterialEnum.Glowstone.getHarvestLevel());
            MinecraftForge.setToolClass(glowstoneGlowstoneIceAxe, "IceAxe", InfiMaterialEnum.Glowstone.getHarvestLevel());
            MinecraftForge.setToolClass(iceGlowstoneIceAxe, "IceAxe", InfiMaterialEnum.Glowstone.getHarvestLevel());
            MinecraftForge.setToolClass(slimeGlowstoneIceAxe, "IceAxe", InfiMaterialEnum.Glowstone.getHarvestLevel());
            MinecraftForge.setToolClass(cactusGlowstoneIceAxe, "IceAxe", InfiMaterialEnum.Glowstone.getHarvestLevel());
        }
        
        if(PHInfiHybrids.enableIceTools)
        {
        	woodIceIceAxe = new InfiToolIceAxe(PHInfiHybrids.iceIceAxeID+0, 
                    InfiMaterialEnum.Ice, InfiMaterialEnum.Wood, "woodIceIceAxe");
        	boneIceIceAxe = new InfiToolIceAxe(PHInfiHybrids.iceIceAxeID+1, 
                    InfiMaterialEnum.Ice, InfiMaterialEnum.Bone, "boneIceIceAxe");
        	paperIceIceAxe = new InfiToolIceAxe(PHInfiHybrids.iceIceAxeID+2, 
                    InfiMaterialEnum.Ice, InfiMaterialEnum.Paper, "paperIceIceAxe");
        	iceIceIceAxe = new InfiToolIceAxe(PHInfiHybrids.iceIceAxeID+3, 
                    InfiMaterialEnum.Ice, InfiMaterialEnum.Ice, "iceIceIceAxe");
        	slimeIceIceAxe = new InfiToolIceAxe(PHInfiHybrids.iceIceAxeID+4, 
                    InfiMaterialEnum.Ice, InfiMaterialEnum.Slime, "slimeIceIceAxe");
        	cactusIceIceAxe = new InfiToolIceAxe(PHInfiHybrids.iceIceAxeID+5, 
                    InfiMaterialEnum.Ice, InfiMaterialEnum.Cactus, "cactusIceIceAxe");
            
            
            MinecraftForge.setToolClass(woodIceIceAxe, "IceAxe", InfiMaterialEnum.Ice.getHarvestLevel());
            MinecraftForge.setToolClass(boneIceIceAxe, "IceAxe", InfiMaterialEnum.Ice.getHarvestLevel());
            MinecraftForge.setToolClass(paperIceIceAxe, "IceAxe", InfiMaterialEnum.Ice.getHarvestLevel());
            MinecraftForge.setToolClass(iceIceIceAxe, "IceAxe", InfiMaterialEnum.Ice.getHarvestLevel());
            MinecraftForge.setToolClass(slimeIceIceAxe, "IceAxe", InfiMaterialEnum.Ice.getHarvestLevel());
            MinecraftForge.setToolClass(cactusIceIceAxe, "IceAxe", InfiMaterialEnum.Ice.getHarvestLevel());
        }
        
        if(PHInfiHybrids.enableLavaTools)
        {
        	diamondLavaIceAxe = new InfiToolIceAxe(PHInfiHybrids.lavaIceAxeID+0, 
                    InfiMaterialEnum.Lava, InfiMaterialEnum.Diamond, "diamondLavaIceAxe");
        	obsidianLavaIceAxe = new InfiToolIceAxe(PHInfiHybrids.lavaIceAxeID+1, 
                    InfiMaterialEnum.Lava, InfiMaterialEnum.Obsidian, "obsidianLavaIceAxe");
        	netherrackLavaIceAxe = new InfiToolIceAxe(PHInfiHybrids.lavaIceAxeID+2, 
                    InfiMaterialEnum.Lava, InfiMaterialEnum.Netherrack, "netherrackLavaIceAxe");
        	lavaLavaIceAxe = new InfiToolIceAxe(PHInfiHybrids.lavaIceAxeID+3, 
                    InfiMaterialEnum.Lava, InfiMaterialEnum.Lava, "lavaLavaIceAxe");
        	flintLavaIceAxe = new InfiToolIceAxe(PHInfiHybrids.lavaIceAxeID+4, 
                    InfiMaterialEnum.Lava, InfiMaterialEnum.Flint, "flintLavaIceAxe");
        	blazeLavaIceAxe = new InfiToolIceAxe(PHInfiHybrids.lavaIceAxeID+5, 
                    InfiMaterialEnum.Lava, InfiMaterialEnum.Blaze, "blazeLavaIceAxe");
        	manyullynLavaIceAxe = new InfiToolIceAxe(PHInfiHybrids.lavaIceAxeID+6, 
                    InfiMaterialEnum.Lava, InfiMaterialEnum.Manyullyn, "manyullynLavaIceAxe");
            uraniumLavaIceAxe = new InfiToolIceAxe(PHInfiHybrids.lavaIceAxeID+7, 
                    InfiMaterialEnum.Lava, InfiMaterialEnum.Uranium, "uraniumLavaIceAxe");
            
            MinecraftForge.setToolClass(diamondLavaIceAxe, "IceAxe", InfiMaterialEnum.Lava.getHarvestLevel());
            MinecraftForge.setToolClass(obsidianLavaIceAxe, "IceAxe", InfiMaterialEnum.Lava.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackLavaIceAxe, "IceAxe", InfiMaterialEnum.Lava.getHarvestLevel());
            MinecraftForge.setToolClass(lavaLavaIceAxe, "IceAxe", InfiMaterialEnum.Lava.getHarvestLevel());
            MinecraftForge.setToolClass(flintLavaIceAxe, "IceAxe", InfiMaterialEnum.Lava.getHarvestLevel());
            MinecraftForge.setToolClass(blazeLavaIceAxe, "IceAxe", InfiMaterialEnum.Lava.getHarvestLevel());
            MinecraftForge.setToolClass(manyullynLavaIceAxe, "IceAxe", InfiMaterialEnum.Lava.getHarvestLevel());
            MinecraftForge.setToolClass(uraniumLavaIceAxe, "IceAxe", InfiMaterialEnum.Lava.getHarvestLevel());
        }
        
        if(PHInfiHybrids.enableSlimeTools)
        {
        	woodSlimeIceAxe = new InfiToolIceAxe(PHInfiHybrids.slimeIceAxeID+0, 
                    InfiMaterialEnum.Slime, InfiMaterialEnum.Wood, "woodSlimeIceAxe");
        	sandstoneSlimeIceAxe = new InfiToolIceAxe(PHInfiHybrids.slimeIceAxeID+1, 
                    InfiMaterialEnum.Slime, InfiMaterialEnum.Sandstone, "sandstoneSlimeIceAxe");
        	boneSlimeIceAxe = new InfiToolIceAxe(PHInfiHybrids.slimeIceAxeID+2, 
                    InfiMaterialEnum.Slime, InfiMaterialEnum.Bone, "boneSlimeIceAxe");
        	paperSlimeIceAxe = new InfiToolIceAxe(PHInfiHybrids.slimeIceAxeID+3, 
                    InfiMaterialEnum.Slime, InfiMaterialEnum.Paper, "paperSlimeIceAxe");
        	slimeSlimeIceAxe = new InfiToolIceAxe(PHInfiHybrids.slimeIceAxeID+4, 
                    InfiMaterialEnum.Slime, InfiMaterialEnum.Slime, "slimeSlimeIceAxe");
        	cactusSlimeIceAxe = new InfiToolIceAxe(PHInfiHybrids.slimeIceAxeID+5, 
                    InfiMaterialEnum.Slime, InfiMaterialEnum.Cactus, "cactusSlimeIceAxe");
            
            MinecraftForge.setToolClass(woodSlimeIceAxe, "IceAxe", InfiMaterialEnum.Slime.getHarvestLevel());
            MinecraftForge.setToolClass(sandstoneSlimeIceAxe, "IceAxe", InfiMaterialEnum.Slime.getHarvestLevel());
            MinecraftForge.setToolClass(boneSlimeIceAxe, "IceAxe", InfiMaterialEnum.Slime.getHarvestLevel());
            MinecraftForge.setToolClass(paperSlimeIceAxe, "IceAxe", InfiMaterialEnum.Slime.getHarvestLevel());
            MinecraftForge.setToolClass(slimeSlimeIceAxe, "IceAxe", InfiMaterialEnum.Slime.getHarvestLevel());
            MinecraftForge.setToolClass(cactusSlimeIceAxe, "IceAxe", InfiMaterialEnum.Slime.getHarvestLevel());
        }
        
        if(PHInfiHybrids.enableCactusTools)
        {
        	woodCactusIceAxe = new InfiToolIceAxe(PHInfiHybrids.cactusIceAxeID+0, 
                    InfiMaterialEnum.Cactus, InfiMaterialEnum.Wood, "woodCactusIceAxe");
        	sandstoneCactusIceAxe = new InfiToolIceAxe(PHInfiHybrids.cactusIceAxeID+1, 
                    InfiMaterialEnum.Cactus, InfiMaterialEnum.Sandstone, "sandstoneCactusIceAxe");
        	boneCactusIceAxe = new InfiToolIceAxe(PHInfiHybrids.cactusIceAxeID+2, 
                    InfiMaterialEnum.Cactus, InfiMaterialEnum.Bone, "boneCactusIceAxe");
        	netherrackCactusIceAxe = new InfiToolIceAxe(PHInfiHybrids.cactusIceAxeID+3, 
                    InfiMaterialEnum.Cactus, InfiMaterialEnum.Netherrack, "netherrackCactusIceAxe");
        	iceCactusIceAxe = new InfiToolIceAxe(PHInfiHybrids.cactusIceAxeID+4, 
                    InfiMaterialEnum.Cactus, InfiMaterialEnum.Ice, "iceCactusIceAxe");
        	slimeCactusIceAxe = new InfiToolIceAxe(PHInfiHybrids.cactusIceAxeID+5, 
                    InfiMaterialEnum.Cactus, InfiMaterialEnum.Slime, "slimeCactusIceAxe");
        	cactusCactusIceAxe = new InfiToolIceAxe(PHInfiHybrids.cactusIceAxeID+6, 
                    InfiMaterialEnum.Cactus, InfiMaterialEnum.Cactus, "cactusCactusIceAxe");
            
            MinecraftForge.setToolClass(woodCactusIceAxe, "IceAxe", InfiMaterialEnum.Cactus.getHarvestLevel());
            MinecraftForge.setToolClass(sandstoneCactusIceAxe, "IceAxe", InfiMaterialEnum.Cactus.getHarvestLevel());
            MinecraftForge.setToolClass(boneCactusIceAxe, "IceAxe", InfiMaterialEnum.Cactus.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackCactusIceAxe, "IceAxe", InfiMaterialEnum.Cactus.getHarvestLevel());
            MinecraftForge.setToolClass(iceCactusIceAxe, "IceAxe", InfiMaterialEnum.Cactus.getHarvestLevel());
            MinecraftForge.setToolClass(slimeCactusIceAxe, "IceAxe", InfiMaterialEnum.Cactus.getHarvestLevel());
            MinecraftForge.setToolClass(cactusCactusIceAxe, "IceAxe", InfiMaterialEnum.Cactus.getHarvestLevel());
        }
        
        if(PHInfiHybrids.enableFlintTools)
        {
        	woodFlintIceAxe = new InfiToolIceAxe(PHInfiHybrids.flintIceAxeID+0, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Wood, "woodFlintIceAxe");
        	stoneFlintIceAxe = new InfiToolIceAxe(PHInfiHybrids.flintIceAxeID+1, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Stone, "stoneFlintIceAxe");
        	sandstoneFlintIceAxe = new InfiToolIceAxe(PHInfiHybrids.flintIceAxeID+2, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Sandstone, "sandstoneFlintIceAxe");
        	boneFlintIceAxe = new InfiToolIceAxe(PHInfiHybrids.flintIceAxeID+3, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Bone, "boneFlintIceAxe");
        	netherrackFlintIceAxe = new InfiToolIceAxe(PHInfiHybrids.flintIceAxeID+4, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Netherrack, "netherrackFlintIceAxe");
        	slimeFlintIceAxe = new InfiToolIceAxe(PHInfiHybrids.flintIceAxeID+5, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Slime, "slimeFlintIceAxe");
        	cactusFlintIceAxe = new InfiToolIceAxe(PHInfiHybrids.flintIceAxeID+6, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Cactus, "cactusFlintIceAxe");
        	flintFlintIceAxe = new InfiToolIceAxe(PHInfiHybrids.flintIceAxeID+7, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Flint, "flintFlintIceAxe");
        	copperFlintIceAxe = new InfiToolIceAxe(PHInfiHybrids.flintIceAxeID+8, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Copper, "copperFlintIceAxe");
        	bronzeFlintIceAxe = new InfiToolIceAxe(PHInfiHybrids.flintIceAxeID+9, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Bronze, "bronzeFlintIceAxe");
            
            MinecraftForge.setToolClass(woodFlintIceAxe, "IceAxe", InfiMaterialEnum.Flint.getHarvestLevel());
            MinecraftForge.setToolClass(stoneFlintIceAxe, "IceAxe", InfiMaterialEnum.Flint.getHarvestLevel());
            MinecraftForge.setToolClass(sandstoneFlintIceAxe, "IceAxe", InfiMaterialEnum.Flint.getHarvestLevel());
            MinecraftForge.setToolClass(boneFlintIceAxe, "IceAxe", InfiMaterialEnum.Flint.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackFlintIceAxe, "IceAxe", InfiMaterialEnum.Flint.getHarvestLevel());
            MinecraftForge.setToolClass(slimeFlintIceAxe, "IceAxe", InfiMaterialEnum.Flint.getHarvestLevel());
            MinecraftForge.setToolClass(cactusFlintIceAxe, "IceAxe", InfiMaterialEnum.Flint.getHarvestLevel());
            MinecraftForge.setToolClass(flintFlintIceAxe, "IceAxe", InfiMaterialEnum.Flint.getHarvestLevel());
            MinecraftForge.setToolClass(copperFlintIceAxe, "IceAxe", InfiMaterialEnum.Flint.getHarvestLevel());
            MinecraftForge.setToolClass(bronzeFlintIceAxe, "IceAxe", InfiMaterialEnum.Flint.getHarvestLevel());
        }
        
        if(PHInfiHybrids.enableBlazeTools)
        {
        	diamondBlazeIceAxe = new InfiToolIceAxe(PHInfiHybrids.blazeIceAxeID+0, 
                    InfiMaterialEnum.Blaze, InfiMaterialEnum.Diamond, "diamondBlazeIceAxe");
        	obsidianBlazeIceAxe = new InfiToolIceAxe(PHInfiHybrids.blazeIceAxeID+1, 
                    InfiMaterialEnum.Blaze, InfiMaterialEnum.Obsidian, "obsidianBlazeIceAxe");
        	netherrackBlazeIceAxe = new InfiToolIceAxe(PHInfiHybrids.blazeIceAxeID+2, 
                    InfiMaterialEnum.Blaze, InfiMaterialEnum.Netherrack, "netherrackBlazeIceAxe");
        	lavaBlazeIceAxe = new InfiToolIceAxe(PHInfiHybrids.blazeIceAxeID+3, 
                    InfiMaterialEnum.Blaze, InfiMaterialEnum.Lava, "lavaBlazeIceAxe");
        	flintBlazeIceAxe = new InfiToolIceAxe(PHInfiHybrids.blazeIceAxeID+4, 
                    InfiMaterialEnum.Blaze, InfiMaterialEnum.Flint, "flintBlazeIceAxe");
        	blazeBlazeIceAxe = new InfiToolIceAxe(PHInfiHybrids.blazeIceAxeID+5, 
                    InfiMaterialEnum.Blaze, InfiMaterialEnum.Blaze, "blazeBlazeIceAxe");
        	manyullynBlazeIceAxe = new InfiToolIceAxe(PHInfiHybrids.blazeIceAxeID+6, 
                    InfiMaterialEnum.Blaze, InfiMaterialEnum.Manyullyn, "manyullynBlazeIceAxe");
            uraniumBlazeIceAxe = new InfiToolIceAxe(PHInfiHybrids.blazeIceAxeID+7, 
                    InfiMaterialEnum.Blaze, InfiMaterialEnum.Uranium, "uraniumBlazeIceAxe");
            
            MinecraftForge.setToolClass(diamondBlazeIceAxe, "IceAxe", InfiMaterialEnum.Blaze.getHarvestLevel());
            MinecraftForge.setToolClass(obsidianBlazeIceAxe, "IceAxe", InfiMaterialEnum.Blaze.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackBlazeIceAxe, "IceAxe", InfiMaterialEnum.Blaze.getHarvestLevel());
            MinecraftForge.setToolClass(blazeBlazeIceAxe, "IceAxe", InfiMaterialEnum.Blaze.getHarvestLevel());
            MinecraftForge.setToolClass(flintBlazeIceAxe, "IceAxe", InfiMaterialEnum.Blaze.getHarvestLevel());
            MinecraftForge.setToolClass(blazeBlazeIceAxe, "IceAxe", InfiMaterialEnum.Blaze.getHarvestLevel());
            MinecraftForge.setToolClass(manyullynBlazeIceAxe, "IceAxe", InfiMaterialEnum.Blaze.getHarvestLevel());
            MinecraftForge.setToolClass(uraniumBlazeIceAxe, "IceAxe", InfiMaterialEnum.Blaze.getHarvestLevel());
        }
    	
        if(PHInfiHybrids.enableCopperTools)
        {
        	woodCopperIceAxe = new InfiToolIceAxe(PHInfiHybrids.copperIceAxeID+0, 
                    InfiMaterialEnum.Copper, InfiMaterialEnum.Wood, "woodCopperIceAxe");
            stoneCopperIceAxe = new InfiToolIceAxe(PHInfiHybrids.copperIceAxeID+1, 
                    InfiMaterialEnum.Copper, InfiMaterialEnum.Stone, "stoneCopperIceAxe");
            boneCopperIceAxe = new InfiToolIceAxe(PHInfiHybrids.copperIceAxeID+2, 
                    InfiMaterialEnum.Copper, InfiMaterialEnum.Bone, "boneCopperIceAxe");
            netherrackCopperIceAxe = new InfiToolIceAxe(PHInfiHybrids.copperIceAxeID+3, 
                    InfiMaterialEnum.Copper, InfiMaterialEnum.Netherrack, "netherrackCopperIceAxe");
            slimeCopperIceAxe = new InfiToolIceAxe(PHInfiHybrids.copperIceAxeID+4, 
                    InfiMaterialEnum.Copper, InfiMaterialEnum.Slime, "slimeCopperIceAxe");
            cactusCopperIceAxe = new InfiToolIceAxe(PHInfiHybrids.copperIceAxeID+5, 
                    InfiMaterialEnum.Copper, InfiMaterialEnum.Cactus, "cactusCopperIceAxe");
            flintCopperIceAxe = new InfiToolIceAxe(PHInfiHybrids.copperIceAxeID+6, 
                    InfiMaterialEnum.Copper, InfiMaterialEnum.Flint, "flintCopperIceAxe");
            copperCopperIceAxe = new InfiToolIceAxe(PHInfiHybrids.copperIceAxeID+7, 
                    InfiMaterialEnum.Copper, InfiMaterialEnum.Copper, "copperCopperIceAxe");
            
            MinecraftForge.setToolClass(woodCopperIceAxe, "IceAxe", InfiMaterialEnum.Copper.getHarvestLevel());
        	MinecraftForge.setToolClass(stoneCopperIceAxe, "IceAxe", InfiMaterialEnum.Copper.getHarvestLevel());
            MinecraftForge.setToolClass(boneCopperIceAxe, "IceAxe", InfiMaterialEnum.Copper.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackCopperIceAxe, "IceAxe", InfiMaterialEnum.Copper.getHarvestLevel());
            MinecraftForge.setToolClass(slimeCopperIceAxe, "IceAxe", InfiMaterialEnum.Copper.getHarvestLevel());
            MinecraftForge.setToolClass(cactusCopperIceAxe, "IceAxe", InfiMaterialEnum.Copper.getHarvestLevel());
            MinecraftForge.setToolClass(flintCopperIceAxe, "IceAxe", InfiMaterialEnum.Copper.getHarvestLevel());
            MinecraftForge.setToolClass(copperCopperIceAxe, "IceAxe", InfiMaterialEnum.Copper.getHarvestLevel());
        }
        
        if(PHInfiHybrids.enableBronzeTools)
        {
        	woodBronzeIceAxe = new InfiToolIceAxe(PHInfiHybrids.bronzeIceAxeID+0, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Wood, "woodBronzeIceAxe");
            stoneBronzeIceAxe = new InfiToolIceAxe(PHInfiHybrids.bronzeIceAxeID+1, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Stone, "stoneBronzeIceAxe");
            boneBronzeIceAxe = new InfiToolIceAxe(PHInfiHybrids.bronzeIceAxeID+2, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Bone, "boneBronzeIceAxe");
            netherrackBronzeIceAxe = new InfiToolIceAxe(PHInfiHybrids.bronzeIceAxeID+3, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Netherrack, "netherrackBronzeIceAxe");
            slimeBronzeIceAxe = new InfiToolIceAxe(PHInfiHybrids.bronzeIceAxeID+4, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Slime, "slimeBronzeIceAxe");
            cactusBronzeIceAxe = new InfiToolIceAxe(PHInfiHybrids.bronzeIceAxeID+5, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Cactus, "cactusBronzeIceAxe");
            flintBronzeIceAxe = new InfiToolIceAxe(PHInfiHybrids.bronzeIceAxeID+6, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Flint, "flintBronzeIceAxe");
            copperBronzeIceAxe = new InfiToolIceAxe(PHInfiHybrids.bronzeIceAxeID+7, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Copper, "copperBronzeIceAxe");
            bronzeBronzeIceAxe = new InfiToolIceAxe(PHInfiHybrids.bronzeIceAxeID+8, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Bronze, "bronzeBronzeIceAxe");
            
            MinecraftForge.setToolClass(woodBronzeIceAxe, "IceAxe", InfiMaterialEnum.Bronze.getHarvestLevel());
            MinecraftForge.setToolClass(stoneBronzeIceAxe, "IceAxe", InfiMaterialEnum.Bronze.getHarvestLevel());
            MinecraftForge.setToolClass(boneBronzeIceAxe, "IceAxe", InfiMaterialEnum.Bronze.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackBronzeIceAxe, "IceAxe", InfiMaterialEnum.Bronze.getHarvestLevel());
            MinecraftForge.setToolClass(slimeBronzeIceAxe, "IceAxe", InfiMaterialEnum.Bronze.getHarvestLevel());
            MinecraftForge.setToolClass(cactusBronzeIceAxe, "IceAxe", InfiMaterialEnum.Bronze.getHarvestLevel());
            MinecraftForge.setToolClass(flintBronzeIceAxe, "IceAxe", InfiMaterialEnum.Bronze.getHarvestLevel());
            MinecraftForge.setToolClass(copperBronzeIceAxe, "IceAxe", InfiMaterialEnum.Bronze.getHarvestLevel());
            MinecraftForge.setToolClass(bronzeBronzeIceAxe, "IceAxe", InfiMaterialEnum.Bronze.getHarvestLevel());
        }
        
        if(PHInfiHybrids.enableWorkedIronTools)
        {
        	woodWorkedIronIceAxe = new InfiToolIceAxe(PHInfiHybrids.workedIronIceAxeID+0, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Wood, "woodWorkedIronIceAxe");
            stoneWorkedIronIceAxe = new InfiToolIceAxe(PHInfiHybrids.workedIronIceAxeID+1, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Stone, "stoneWorkedIronIceAxe");
            ironWorkedIronIceAxe = new InfiToolIceAxe(PHInfiHybrids.workedIronIceAxeID+2,
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Iron, "ironWorkedIronIceAxe");
            diamondWorkedIronIceAxe = new InfiToolIceAxe(PHInfiHybrids.workedIronIceAxeID+3, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Diamond, "diamondWorkedIronIceAxe");
            redstoneWorkedIronIceAxe = new InfiToolIceAxe(PHInfiHybrids.workedIronIceAxeID+4, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Redstone, "redstoneWorkedIronIceAxe");
            obsidianWorkedIronIceAxe = new InfiToolIceAxe(PHInfiHybrids.workedIronIceAxeID+5, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Obsidian, "obsidianWorkedIronIceAxe");
            boneWorkedIronIceAxe = new InfiToolIceAxe(PHInfiHybrids.workedIronIceAxeID+6, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Bone, "boneWorkedIronIceAxe");
            netherrackWorkedIronIceAxe = new InfiToolIceAxe(PHInfiHybrids.workedIronIceAxeID+7, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Netherrack, "netherrackWorkedIronIceAxe");
            glowstoneWorkedIronIceAxe = new InfiToolIceAxe(PHInfiHybrids.workedIronIceAxeID+8, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Glowstone, "glowstoneWorkedIronIceAxe");
            iceWorkedIronIceAxe = new InfiToolIceAxe(PHInfiHybrids.workedIronIceAxeID+9, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Ice, "iceWorkedIronIceAxe");
            slimeWorkedIronIceAxe = new InfiToolIceAxe(PHInfiHybrids.workedIronIceAxeID+10, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Slime, "slimeWorkedIronIceAxe");
            cactusWorkedIronIceAxe = new InfiToolIceAxe(PHInfiHybrids.workedIronIceAxeID+11, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Cactus, "cactusWorkedIronIceAxe");
            blazeWorkedIronIceAxe = new InfiToolIceAxe(PHInfiHybrids.workedIronIceAxeID+12, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Blaze, "blazeWorkedIronIceAxe");
            copperWorkedIronIceAxe = new InfiToolIceAxe(PHInfiHybrids.workedIronIceAxeID+13, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Copper, "copperWorkedIronIceAxe");
            bronzeWorkedIronIceAxe = new InfiToolIceAxe(PHInfiHybrids.workedIronIceAxeID+14, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Bronze, "bronzeWorkedIronIceAxe");
            workedWorkedIronIceAxe = new InfiToolIceAxe(PHInfiHybrids.workedIronIceAxeID+15, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.WorkedIron, "workedWorkedIronIceAxe");
            steelWorkedIronIceAxe = new InfiToolIceAxe(PHInfiHybrids.workedIronIceAxeID+16, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Steel, "steelWorkedIronIceAxe");
            uraniumWorkedIronIceAxe = new InfiToolIceAxe(PHInfiHybrids.workedIronIceAxeID+17, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Uranium, "uraniumWorkedIronIceAxe");
            
            MinecraftForge.setToolClass(woodWorkedIronIceAxe, "IceAxe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(stoneWorkedIronIceAxe, "IceAxe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(ironWorkedIronIceAxe, "IceAxe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(diamondWorkedIronIceAxe, "IceAxe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(redstoneWorkedIronIceAxe, "IceAxe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(obsidianWorkedIronIceAxe, "IceAxe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(boneWorkedIronIceAxe, "IceAxe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackWorkedIronIceAxe, "IceAxe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(glowstoneWorkedIronIceAxe, "IceAxe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(iceWorkedIronIceAxe, "IceAxe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(slimeWorkedIronIceAxe, "IceAxe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(cactusWorkedIronIceAxe, "IceAxe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(blazeWorkedIronIceAxe, "IceAxe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(copperWorkedIronIceAxe, "IceAxe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(bronzeWorkedIronIceAxe, "IceAxe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(workedWorkedIronIceAxe, "IceAxe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(steelWorkedIronIceAxe, "IceAxe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(uraniumWorkedIronIceAxe, "IceAxe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
        }
        
        if(PHInfiHybrids.enableSteelTools)
        {
        	woodSteelIceAxe = new InfiToolIceAxe(PHInfiHybrids.steelIceAxeID+0, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Wood, "woodSteelIceAxe");
            stoneSteelIceAxe = new InfiToolIceAxe(PHInfiHybrids.steelIceAxeID+1, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Stone, "stoneSteelIceAxe");
            ironSteelIceAxe = new InfiToolIceAxe(PHInfiHybrids.steelIceAxeID+2, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Iron, "ironSteelIceAxe");
            diamondSteelIceAxe = new InfiToolIceAxe(PHInfiHybrids.steelIceAxeID+3, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Diamond, "diamondSteelIceAxe");
            redstoneSteelIceAxe = new InfiToolIceAxe(PHInfiHybrids.steelIceAxeID+4, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Redstone, "redstoneSteelIceAxe");
            obsidianSteelIceAxe = new InfiToolIceAxe(PHInfiHybrids.steelIceAxeID+5, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Obsidian, "obsidianSteelIceAxe");
            boneSteelIceAxe = new InfiToolIceAxe(PHInfiHybrids.steelIceAxeID+6, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Bone, "boneSteelIceAxe");
            netherrackSteelIceAxe = new InfiToolIceAxe(PHInfiHybrids.steelIceAxeID+7, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Netherrack, "netherrackSteelIceAxe");
            glowstoneSteelIceAxe = new InfiToolIceAxe(PHInfiHybrids.steelIceAxeID+8, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Glowstone, "glowstoneSteelIceAxe");
            iceSteelIceAxe = new InfiToolIceAxe(PHInfiHybrids.steelIceAxeID+9, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Ice, "iceSteelIceAxe");
            slimeSteelIceAxe = new InfiToolIceAxe(PHInfiHybrids.steelIceAxeID+10, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Slime, "slimeSteelIceAxe");
            cactusSteelIceAxe = new InfiToolIceAxe(PHInfiHybrids.steelIceAxeID+11, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Cactus, "cactusSteelIceAxe");
            blazeSteelIceAxe = new InfiToolIceAxe(PHInfiHybrids.steelIceAxeID+12, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Blaze, "blazeSteelIceAxe");
            copperSteelIceAxe = new InfiToolIceAxe(PHInfiHybrids.steelIceAxeID+13, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Copper, "copperSteelIceAxe");
            bronzeSteelIceAxe = new InfiToolIceAxe(PHInfiHybrids.steelIceAxeID+14, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Bronze, "bronzeSteelIceAxe");
            workedSteelIceAxe = new InfiToolIceAxe(PHInfiHybrids.steelIceAxeID+15, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.WorkedIron, "workedSteelIceAxe");
            steelSteelIceAxe = new InfiToolIceAxe(PHInfiHybrids.steelIceAxeID+16, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Steel, "steelSteelIceAxe");
            cobaltSteelIceAxe = new InfiToolIceAxe(PHInfiHybrids.steelIceAxeID+17, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Cobalt, "cobaltSteelIceAxe");
            arditeSteelIceAxe = new InfiToolIceAxe(PHInfiHybrids.steelIceAxeID+18, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Ardite, "arditeSteelIceAxe");
            uraniumSteelIceAxe = new InfiToolIceAxe(PHInfiHybrids.steelIceAxeID+19, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Uranium, "uraniumSteelIceAxe");

            MinecraftForge.setToolClass(woodSteelIceAxe, "IceAxe", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(stoneSteelIceAxe, "IceAxe", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(ironSteelIceAxe, "IceAxe", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(diamondSteelIceAxe, "IceAxe", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(redstoneSteelIceAxe, "IceAxe", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(obsidianSteelIceAxe, "IceAxe", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(boneSteelIceAxe, "IceAxe", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackSteelIceAxe, "IceAxe", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(glowstoneSteelIceAxe, "IceAxe", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(iceSteelIceAxe, "IceAxe", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(slimeSteelIceAxe, "IceAxe", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(cactusSteelIceAxe, "IceAxe", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(blazeSteelIceAxe, "IceAxe", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(copperSteelIceAxe, "IceAxe", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(bronzeSteelIceAxe, "IceAxe", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(workedSteelIceAxe, "IceAxe", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(steelSteelIceAxe, "IceAxe", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(cobaltSteelIceAxe, "IceAxe", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(arditeSteelIceAxe, "IceAxe", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(uraniumSteelIceAxe, "IceAxe", InfiMaterialEnum.Steel.getHarvestLevel());
        }
        
        if(PHInfiHybrids.enableCobaltTools)
        {
        	woodCobaltIceAxe = new InfiToolIceAxe(PHInfiHybrids.cobaltIceAxeID+0, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Wood, "woodCobaltIceAxe");
            stoneCobaltIceAxe = new InfiToolIceAxe(PHInfiHybrids.cobaltIceAxeID+1, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Stone, "stoneCobaltIceAxe");
            ironCobaltIceAxe = new InfiToolIceAxe(PHInfiHybrids.cobaltIceAxeID+2, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Iron, "ironCobaltIceAxe");
            diamondCobaltIceAxe = new InfiToolIceAxe(PHInfiHybrids.cobaltIceAxeID+3,
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Diamond, "diamondCobaltIceAxe");
            redstoneCobaltIceAxe = new InfiToolIceAxe(PHInfiHybrids.cobaltIceAxeID+4, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Redstone, "redstoneCobaltIceAxe");
            obsidianCobaltIceAxe = new InfiToolIceAxe(PHInfiHybrids.cobaltIceAxeID+5, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Obsidian, "obsidianCobaltIceAxe");
            boneCobaltIceAxe = new InfiToolIceAxe(PHInfiHybrids.cobaltIceAxeID+6, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Bone, "boneCobaltIceAxe");
            slimeCobaltIceAxe = new InfiToolIceAxe(PHInfiHybrids.cobaltIceAxeID+7, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Slime, "slimeCobaltIceAxe");
            cactusCobaltIceAxe = new InfiToolIceAxe(PHInfiHybrids.cobaltIceAxeID+8, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Cactus, "cactusCobaltIceAxe");
            blazeCobaltIceAxe = new InfiToolIceAxe(PHInfiHybrids.cobaltIceAxeID+9, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Blaze, "blazeCobaltIceAxe");
            copperCobaltIceAxe = new InfiToolIceAxe(PHInfiHybrids.cobaltIceAxeID+10, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Copper, "copperCobaltIceAxe");
            bronzeCobaltIceAxe = new InfiToolIceAxe(PHInfiHybrids.cobaltIceAxeID+11, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Bronze, "bronzeCobaltIceAxe");
            workedCobaltIceAxe = new InfiToolIceAxe(PHInfiHybrids.cobaltIceAxeID+12, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.WorkedIron, "workedCobaltIceAxe");
            steelCobaltIceAxe = new InfiToolIceAxe(PHInfiHybrids.cobaltIceAxeID+13, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Steel, "steelCobaltIceAxe");
            cobaltCobaltIceAxe = new InfiToolIceAxe(PHInfiHybrids.cobaltIceAxeID+14, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Cobalt, "cobaltCobaltIceAxe");
            arditeCobaltIceAxe = new InfiToolIceAxe(PHInfiHybrids.cobaltIceAxeID+15, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Ardite, "arditeCobaltIceAxe");
            manyullynCobaltIceAxe = new InfiToolIceAxe(PHInfiHybrids.cobaltIceAxeID+16, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Manyullyn, "manyullynCobaltIceAxe");
            uraniumCobaltIceAxe = new InfiToolIceAxe(PHInfiHybrids.cobaltIceAxeID+17, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Uranium, "uraniumCobaltIceAxe");
            
            MinecraftForge.setToolClass(woodCobaltIceAxe, "IceAxe", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(stoneCobaltIceAxe, "IceAxe", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(ironCobaltIceAxe, "IceAxe", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(diamondCobaltIceAxe, "IceAxe", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(redstoneCobaltIceAxe, "IceAxe", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(obsidianCobaltIceAxe, "IceAxe", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(boneCobaltIceAxe, "IceAxe", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(slimeCobaltIceAxe, "IceAxe", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(cactusCobaltIceAxe, "IceAxe", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(blazeCobaltIceAxe, "IceAxe", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(copperCobaltIceAxe, "IceAxe", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(bronzeCobaltIceAxe, "IceAxe", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(workedCobaltIceAxe, "IceAxe", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(steelCobaltIceAxe, "IceAxe", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(cobaltCobaltIceAxe, "IceAxe", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(arditeCobaltIceAxe, "IceAxe", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(manyullynCobaltIceAxe, "IceAxe", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(uraniumCobaltIceAxe, "IceAxe", InfiMaterialEnum.Cobalt.getHarvestLevel());
        }
        
        if(PHInfiHybrids.enableArditeTools)
        {
        	woodArditeIceAxe = new InfiToolIceAxe(PHInfiHybrids.arditeIceAxeID+0, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Wood, "woodArditeIceAxe");
            stoneArditeIceAxe = new InfiToolIceAxe(PHInfiHybrids.arditeIceAxeID+1, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Stone, "stoneArditeIceAxe");
            ironArditeIceAxe = new InfiToolIceAxe(PHInfiHybrids.arditeIceAxeID+2, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Iron, "ironArditeIceAxe");
            diamondArditeIceAxe = new InfiToolIceAxe(PHInfiHybrids.arditeIceAxeID+3,
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Diamond, "diamondArditeIceAxe");
            redstoneArditeIceAxe = new InfiToolIceAxe(PHInfiHybrids.arditeIceAxeID+4, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Redstone, "redstoneArditeIceAxe");
            obsidianArditeIceAxe = new InfiToolIceAxe(PHInfiHybrids.arditeIceAxeID+5, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Obsidian, "obsidianArditeIceAxe");
            boneArditeIceAxe = new InfiToolIceAxe(PHInfiHybrids.arditeIceAxeID+6,
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Bone, "boneArditeIceAxe");
            slimeArditeIceAxe = new InfiToolIceAxe(PHInfiHybrids.arditeIceAxeID+7, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Slime, "slimeArditeIceAxe");
            cactusArditeIceAxe = new InfiToolIceAxe(PHInfiHybrids.arditeIceAxeID+8, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Cactus, "cactusArditeIceAxe");
            blazeArditeIceAxe = new InfiToolIceAxe(PHInfiHybrids.arditeIceAxeID+9, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Blaze, "blazeArditeIceAxe");
            copperArditeIceAxe = new InfiToolIceAxe(PHInfiHybrids.arditeIceAxeID+10, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Copper, "copperArditeIceAxe");
            bronzeArditeIceAxe = new InfiToolIceAxe(PHInfiHybrids.arditeIceAxeID+11, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Bronze, "bronzeArditeIceAxe");
            workedArditeIceAxe = new InfiToolIceAxe(PHInfiHybrids.arditeIceAxeID+12, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.WorkedIron, "workedArditeIceAxe");
            steelArditeIceAxe = new InfiToolIceAxe(PHInfiHybrids.arditeIceAxeID+13, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Steel, "steelArditeIceAxe");
            cobaltArditeIceAxe = new InfiToolIceAxe(PHInfiHybrids.arditeIceAxeID+14, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Cobalt, "cobaltArditeIceAxe");
            arditeArditeIceAxe = new InfiToolIceAxe(PHInfiHybrids.arditeIceAxeID+15, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Ardite, "arditeArditeIceAxe");
            manyullynArditeIceAxe = new InfiToolIceAxe(PHInfiHybrids.arditeIceAxeID+16, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Manyullyn, "manyullynArditeIceAxe");
            uraniumArditeIceAxe = new InfiToolIceAxe(PHInfiHybrids.arditeIceAxeID+17, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Uranium, "uraniumArditeIceAxe");
            
            MinecraftForge.setToolClass(woodArditeIceAxe, "IceAxe", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(stoneArditeIceAxe, "IceAxe", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(ironArditeIceAxe, "IceAxe", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(diamondArditeIceAxe, "IceAxe", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(redstoneArditeIceAxe, "IceAxe", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(obsidianArditeIceAxe, "IceAxe", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(boneArditeIceAxe, "IceAxe", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(slimeArditeIceAxe, "IceAxe", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(cactusArditeIceAxe, "IceAxe", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(blazeArditeIceAxe, "IceAxe", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(copperArditeIceAxe, "IceAxe", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(bronzeArditeIceAxe, "IceAxe", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(workedArditeIceAxe, "IceAxe", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(steelArditeIceAxe, "IceAxe", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(cobaltArditeIceAxe, "IceAxe", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(arditeArditeIceAxe, "IceAxe", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(manyullynArditeIceAxe, "IceAxe", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(uraniumArditeIceAxe, "IceAxe", InfiMaterialEnum.Ardite.getHarvestLevel());
        }
        
        if(PHInfiHybrids.enableManyullynTools)
        {
        	woodManyullynIceAxe = new InfiToolIceAxe(PHInfiHybrids.manyullynIceAxeID+0, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Wood, "woodManyullynIceAxe");
            stoneManyullynIceAxe = new InfiToolIceAxe(PHInfiHybrids.manyullynIceAxeID+1, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Stone, "stoneManyullynIceAxe");
            ironManyullynIceAxe = new InfiToolIceAxe(PHInfiHybrids.manyullynIceAxeID+2, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Iron, "ironManyullynIceAxe");
            diamondManyullynIceAxe = new InfiToolIceAxe(PHInfiHybrids.manyullynIceAxeID+3,
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Diamond, "diamondManyullynIceAxe");
            redstoneManyullynIceAxe = new InfiToolIceAxe(PHInfiHybrids.manyullynIceAxeID+4, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Redstone, "redstoneManyullynIceAxe");
            obsidianManyullynIceAxe = new InfiToolIceAxe(PHInfiHybrids.manyullynIceAxeID+5, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Obsidian, "obsidianManyullynIceAxe");
            boneManyullynIceAxe = new InfiToolIceAxe(PHInfiHybrids.manyullynIceAxeID+6, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Bone, "boneManyullynIceAxe");
            slimeManyullynIceAxe = new InfiToolIceAxe(PHInfiHybrids.manyullynIceAxeID+7, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Slime, "slimeManyullynIceAxe");
            cactusManyullynIceAxe = new InfiToolIceAxe(PHInfiHybrids.manyullynIceAxeID+8, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Cactus, "cactusManyullynIceAxe");
            blazeManyullynIceAxe = new InfiToolIceAxe(PHInfiHybrids.manyullynIceAxeID+9, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Blaze, "blazeManyullynIceAxe");
            copperManyullynIceAxe = new InfiToolIceAxe(PHInfiHybrids.manyullynIceAxeID+10, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Copper, "copperManyullynIceAxe");
            bronzeManyullynIceAxe = new InfiToolIceAxe(PHInfiHybrids.manyullynIceAxeID+11, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Bronze, "bronzeManyullynIceAxe");
            workedManyullynIceAxe = new InfiToolIceAxe(PHInfiHybrids.manyullynIceAxeID+12, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.WorkedIron, "workedManyullynIceAxe");
            steelManyullynIceAxe = new InfiToolIceAxe(PHInfiHybrids.manyullynIceAxeID+13, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Steel, "steelManyullynIceAxe");
            cobaltManyullynIceAxe = new InfiToolIceAxe(PHInfiHybrids.manyullynIceAxeID+14, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Cobalt, "cobaltManyullynIceAxe");
            arditeManyullynIceAxe = new InfiToolIceAxe(PHInfiHybrids.manyullynIceAxeID+15, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Ardite, "arditeManyullynIceAxe");
            manyullynManyullynIceAxe = new InfiToolIceAxe(PHInfiHybrids.manyullynIceAxeID+16, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Manyullyn, "manyullynManyullynIceAxe");
            uraniumManyullynIceAxe = new InfiToolIceAxe(PHInfiHybrids.manyullynIceAxeID+17,
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Uranium, "uraniumManyullynIceAxe");
            
            MinecraftForge.setToolClass(woodManyullynIceAxe, "IceAxe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(stoneManyullynIceAxe, "IceAxe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(ironManyullynIceAxe, "IceAxe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(diamondManyullynIceAxe, "IceAxe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(redstoneManyullynIceAxe, "IceAxe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(obsidianManyullynIceAxe, "IceAxe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(boneManyullynIceAxe, "IceAxe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(slimeManyullynIceAxe, "IceAxe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(cactusManyullynIceAxe, "IceAxe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(blazeManyullynIceAxe, "IceAxe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(copperManyullynIceAxe, "IceAxe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(bronzeManyullynIceAxe, "IceAxe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(workedManyullynIceAxe, "IceAxe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(steelManyullynIceAxe, "IceAxe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(cobaltManyullynIceAxe, "IceAxe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(arditeManyullynIceAxe, "IceAxe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(manyullynManyullynIceAxe, "IceAxe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(uraniumManyullynIceAxe, "IceAxe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
        }
        
        if(PHInfiHybrids.enableUraniumTools)
        {
            diamondUraniumIceAxe = new InfiToolIceAxe(PHInfiHybrids.uraniumIceAxeID+0, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Diamond, "diamondUraniumIceAxe");
            redstoneUraniumIceAxe = new InfiToolIceAxe(PHInfiHybrids.uraniumIceAxeID+1, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Redstone, "redstoneUraniumIceAxe");
            boneUraniumIceAxe = new InfiToolIceAxe(PHInfiHybrids.uraniumIceAxeID+2, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Bone, "boneUraniumIceAxe");
            netherrackUraniumIceAxe = new InfiToolIceAxe(PHInfiHybrids.uraniumIceAxeID+3, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Netherrack, "netherrackUraniumIceAxe");
            glowstoneUraniumIceAxe = new InfiToolIceAxe(PHInfiHybrids.uraniumIceAxeID+4, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Glowstone, "glowstoneUraniumIceAxe");
            lavaUraniumIceAxe = new InfiToolIceAxe(PHInfiHybrids.uraniumIceAxeID+5, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Lava, "lavaUraniumIceAxe");
            blazeUraniumIceAxe = new InfiToolIceAxe(PHInfiHybrids.uraniumIceAxeID+6, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Blaze, "blazeUraniumIceAxe");
            cobaltUraniumIceAxe = new InfiToolIceAxe(PHInfiHybrids.uraniumIceAxeID+7, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Cobalt, "cobaltUraniumIceAxe");
            arditeUraniumIceAxe = new InfiToolIceAxe(PHInfiHybrids.uraniumIceAxeID+8, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Ardite, "arditeUraniumIceAxe");
            uraniumUraniumIceAxe = new InfiToolIceAxe(PHInfiHybrids.uraniumIceAxeID+9, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Uranium, "uraniumUraniumIceAxe");
            
            MinecraftForge.setToolClass(diamondUraniumIceAxe, "IceAxe", InfiMaterialEnum.Uranium.getHarvestLevel());
            MinecraftForge.setToolClass(redstoneUraniumIceAxe, "IceAxe", InfiMaterialEnum.Uranium.getHarvestLevel());
            MinecraftForge.setToolClass(boneUraniumIceAxe, "IceAxe", InfiMaterialEnum.Uranium.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackUraniumIceAxe, "IceAxe", InfiMaterialEnum.Uranium.getHarvestLevel());
            MinecraftForge.setToolClass(glowstoneUraniumIceAxe, "IceAxe", InfiMaterialEnum.Uranium.getHarvestLevel());
            MinecraftForge.setToolClass(lavaUraniumIceAxe, "IceAxe", InfiMaterialEnum.Uranium.getHarvestLevel());
            MinecraftForge.setToolClass(blazeUraniumIceAxe, "IceAxe", InfiMaterialEnum.Uranium.getHarvestLevel());
            MinecraftForge.setToolClass(cobaltUraniumIceAxe, "IceAxe", InfiMaterialEnum.Uranium.getHarvestLevel());
            MinecraftForge.setToolClass(arditeUraniumIceAxe, "IceAxe", InfiMaterialEnum.Uranium.getHarvestLevel());
            MinecraftForge.setToolClass(uraniumUraniumIceAxe, "IceAxe", InfiMaterialEnum.Uranium.getHarvestLevel());
        }
    }
    
    private static void addNames()
    {
    	if(PHInfiHybrids.enableWoodTools)
            ModLoader.addName(woodWoodIceAxe, "Wooden Ice Axe");
        if(PHInfiHybrids.enableStoneTools)
            ModLoader.addName(stoneStoneIceAxe, "Heavy Ice Axe");
        if(PHInfiHybrids.enableIronTools)
            ModLoader.addName(ironIronIceAxe, "Ironic Ice Axe");
        if(PHInfiHybrids.enableDiamondTools)
            ModLoader.addName(diamondDiamondIceAxe, "Diamondium Ice Axe");
        if(PHInfiHybrids.enableRedstoneTools)
            ModLoader.addName(redstoneRedstoneIceAxe, "Redredred Ice Axe");
        if(PHInfiHybrids.enableObsidianTools)
            ModLoader.addName(obsidianObsidianIceAxe, "Ebony Ice Axe");
        if(PHInfiHybrids.enableSandstoneTools)
            ModLoader.addName(sandstoneSandstoneIceAxe, "Fragile Ice Axe");
        if(PHInfiHybrids.enableNetherrackTools)
            ModLoader.addName(boneBoneIceAxe, "Necrotic Ice Axe");
        if(PHInfiHybrids.enablePaperTools)
            ModLoader.addName(paperPaperIceAxe, "Soft Ice Axe");
        if(PHInfiHybrids.enableMossyTools)
            ModLoader.addName(mossyMossyIceAxe, "Living Ice Axe");
        if(PHInfiHybrids.enableNetherrackTools)
            ModLoader.addName(netherrackNetherrackIceAxe, "Bloodsoaked Ice Axe");
        if(PHInfiHybrids.enableGlowstoneTools)
            ModLoader.addName(glowstoneGlowstoneIceAxe, "Bright Ice Axe");
        if(PHInfiHybrids.enableIceTools)
            ModLoader.addName(iceIceIceAxe, "Freezing Ice Axe");
        if(PHInfiHybrids.enableLavaTools)
            ModLoader.addName(lavaLavaIceAxe, "Burning Ice Axe");
        if(PHInfiHybrids.enableSlimeTools)
            ModLoader.addName(slimeSlimeIceAxe, "Toy Ice Axe");
        if(PHInfiHybrids.enableCactusTools)
            ModLoader.addName(cactusCactusIceAxe, "Thorned Ice Axe");
        if(PHInfiHybrids.enableFlintTools)
            ModLoader.addName(flintFlintIceAxe, "Rough-hewn Ice Axe");
        if(PHInfiHybrids.enableBlazeTools)
            ModLoader.addName(blazeBlazeIceAxe, "Netherite Ice Axe");
        if(PHInfiHybrids.enableCopperTools)
            ModLoader.addName(copperCopperIceAxe, "Orange-Tang Ice Axe");
        if(PHInfiHybrids.enableBronzeTools)
            ModLoader.addName(bronzeBronzeIceAxe, "Polished Ice Axe");
        if(PHInfiHybrids.enableWorkedIronTools)
            ModLoader.addName(workedWorkedIronIceAxe, "Reworked Iron Ice Axe");
        if(PHInfiHybrids.enableSteelTools)
            ModLoader.addName(steelSteelIceAxe, "Forge-Wrought Ice Axe");
        if(PHInfiHybrids.enableCobaltTools)
            ModLoader.addName(cobaltCobaltIceAxe, "Beautiful Ice Axe");
        if(PHInfiHybrids.enableArditeTools)
            ModLoader.addName(arditeArditeIceAxe, "Rustic Ice Axe");
        if(PHInfiHybrids.enableManyullynTools)
            ModLoader.addName(manyullynManyullynIceAxe, "False-Prophetic Ice Axe");
        if(PHInfiHybrids.enableUraniumTools)
            ModLoader.addName(uraniumUraniumIceAxe, "Cancerous Ice Axe");
    }
    
    public static void registerInfiToolsRecipes()
    {
    	if(PHInfiHybrids.enableWoodTools)
        {
            ModLoader.addRecipe(new ItemStack(woodWoodIceAxe), new Object[] 
                    { recipe, '#', Block.planks, '|', Item.stick, 's', Item.stick });
            ModLoader.addRecipe(new ItemStack(sandstoneWoodIceAxe), new Object[] 
                    { recipe, '#', Block.planks, '|', InfiLibrary.sandstoneRod, 's', Item.stick });
            ModLoader.addRecipe(new ItemStack(boneWoodIceAxe), new Object[] 
                    { recipe, '#', Block.planks, '|', Item.bone, 's', Item.stick });
            ModLoader.addRecipe(new ItemStack(boneWoodIceAxe), new Object[] 
                    { recipe, '#', Block.planks, '|', InfiLibrary.boneRod, 's', Item.stick });
            ModLoader.addRecipe(new ItemStack(paperWoodIceAxe), new Object[] 
                    { recipe, '#', Block.planks, '|', InfiLibrary.paperRod, 's', Item.stick });
            ModLoader.addRecipe(new ItemStack(iceWoodIceAxe), new Object[] 
                    { recipe, '#', Block.planks, '|', InfiLibrary.iceRod, 's', Item.stick });
            ModLoader.addRecipe(new ItemStack(slimeWoodIceAxe), new Object[] 
                    { recipe, '#', Block.planks, '|', InfiLibrary.slimeRod, 's', Item.stick });
            ModLoader.addRecipe(new ItemStack(cactusWoodIceAxe), new Object[] 
                    { recipe, '#', Block.planks, '|', InfiLibrary.cactusRod, 's', Item.stick });
        }
    	
        if(PHInfiHybrids.enableStoneTools)
        {
        	ModLoader.addRecipe(new ItemStack(woodStoneIceAxe), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', Item.stick, 's', InfiLibrary.stoneShard });
        	ModLoader.addRecipe(new ItemStack(stoneStoneIceAxe), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', InfiLibrary.stoneRod, 's', InfiLibrary.stoneShard });
            ModLoader.addRecipe(new ItemStack(sandstoneStoneIceAxe), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', InfiLibrary.sandstoneRod, 's', InfiLibrary.stoneShard });
            ModLoader.addRecipe(new ItemStack(boneStoneIceAxe), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', Item.bone, 's', InfiLibrary.stoneShard });
            ModLoader.addRecipe(new ItemStack(boneStoneIceAxe), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', InfiLibrary.boneRod, 's', InfiLibrary.stoneShard });
            ModLoader.addRecipe(new ItemStack(netherrackStoneIceAxe), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', InfiLibrary.netherrackRod, 's', InfiLibrary.stoneShard });
            ModLoader.addRecipe(new ItemStack(iceStoneIceAxe), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', InfiLibrary.iceRod, 's', InfiLibrary.stoneShard });
            ModLoader.addRecipe(new ItemStack(slimeStoneIceAxe), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', InfiLibrary.slimeRod, 's', InfiLibrary.stoneShard });
            ModLoader.addRecipe(new ItemStack(cactusStoneIceAxe), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', InfiLibrary.cactusRod, 's', InfiLibrary.stoneShard });
            ModLoader.addRecipe(new ItemStack(flintStoneIceAxe), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', InfiLibrary.flintRod, 's', InfiLibrary.stoneShard });
            
            ModLoader.addRecipe(new ItemStack(woodStoneIceAxe), new Object[] 
                    { recipe, '#', Block.stone, '|', Item.stick, 's', InfiLibrary.stoneShard });
        	ModLoader.addRecipe(new ItemStack(stoneStoneIceAxe), new Object[] 
                    { recipe, '#', Block.stone, '|', InfiLibrary.stoneRod, 's', InfiLibrary.stoneShard });
            ModLoader.addRecipe(new ItemStack(sandstoneStoneIceAxe), new Object[] 
                    { recipe, '#', Block.stone, '|', InfiLibrary.sandstoneRod, 's', InfiLibrary.stoneShard });
            ModLoader.addRecipe(new ItemStack(boneStoneIceAxe), new Object[] 
                    { recipe, '#', Block.stone, '|', Item.bone, 's', InfiLibrary.stoneShard });
            ModLoader.addRecipe(new ItemStack(boneStoneIceAxe), new Object[] 
                    { recipe, '#', Block.stone, '|', InfiLibrary.boneRod, 's', InfiLibrary.stoneShard });
            ModLoader.addRecipe(new ItemStack(netherrackStoneIceAxe), new Object[] 
                    { recipe, '#', Block.stone, '|', InfiLibrary.netherrackRod, 's', InfiLibrary.stoneShard });
            ModLoader.addRecipe(new ItemStack(iceStoneIceAxe), new Object[] 
                    { recipe, '#', Block.stone, '|', InfiLibrary.iceRod, 's', InfiLibrary.stoneShard });
            ModLoader.addRecipe(new ItemStack(slimeStoneIceAxe), new Object[] 
                    { recipe, '#', Block.stone, '|', InfiLibrary.slimeRod, 's', InfiLibrary.stoneShard });
            ModLoader.addRecipe(new ItemStack(cactusStoneIceAxe), new Object[] 
                    { recipe, '#', Block.stone, '|', InfiLibrary.cactusRod, 's', InfiLibrary.stoneShard });
            ModLoader.addRecipe(new ItemStack(flintStoneIceAxe), new Object[] 
                    { recipe, '#', Block.stone, '|', InfiLibrary.flintRod, 's', InfiLibrary.stoneShard });
        }
        
        if(PHInfiHybrids.enableIronTools)
        {
        	ModLoader.addRecipe(new ItemStack(woodIronIceAxe), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', Item.stick, 's', InfiLibrary.ironChunk });
        	ModLoader.addRecipe(new ItemStack(stoneIronIceAxe), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', InfiLibrary.stoneRod, 's', InfiLibrary.ironChunk });
            ModLoader.addRecipe(new ItemStack(ironIronIceAxe), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', InfiLibrary.ironRod, 's', InfiLibrary.ironChunk });
            ModLoader.addRecipe(new ItemStack(boneIronIceAxe), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', Item.bone, 's', InfiLibrary.ironChunk });
            ModLoader.addRecipe(new ItemStack(boneIronIceAxe), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', InfiLibrary.boneRod, 's', InfiLibrary.ironChunk });
            ModLoader.addRecipe(new ItemStack(netherrackIronIceAxe), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', InfiLibrary.netherrackRod, 's', InfiLibrary.ironChunk });
            ModLoader.addRecipe(new ItemStack(glowstoneIronIceAxe), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', InfiLibrary.glowstoneRod, 's', InfiLibrary.ironChunk });
            ModLoader.addRecipe(new ItemStack(cactusIronIceAxe), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', InfiLibrary.cactusRod, 's', InfiLibrary.ironChunk });
            ModLoader.addRecipe(new ItemStack(copperIronIceAxe), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', InfiLibrary.copperRod, 's', InfiLibrary.ironChunk });
            ModLoader.addRecipe(new ItemStack(bronzeIronIceAxe), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', InfiLibrary.bronzeRod, 's', InfiLibrary.ironChunk });
        }
        
        if(PHInfiHybrids.enableDiamondTools)
        {
        	ModLoader.addRecipe(new ItemStack(woodDiamondIceAxe), new Object[] 
                    { recipe, '#', Item.diamond, '|', Item.stick, 's', InfiLibrary.diamondShard });
        	ModLoader.addRecipe(new ItemStack(stoneDiamondIceAxe), new Object[] 
                    { recipe, '#', Item.diamond, '|', InfiLibrary.stoneRod, 's', InfiLibrary.diamondShard });
            ModLoader.addRecipe(new ItemStack(ironDiamondIceAxe), new Object[] 
                    { recipe, '#', Item.diamond, '|', InfiLibrary.ironRod, 's', InfiLibrary.diamondShard });
            ModLoader.addRecipe(new ItemStack(diamondDiamondIceAxe), new Object[] 
                    { recipe, '#', Item.diamond, '|', InfiLibrary.diamondRod, 's', InfiLibrary.diamondShard });
            ModLoader.addRecipe(new ItemStack(redstoneDiamondIceAxe), new Object[] 
                    { recipe, '#', Item.diamond, '|', InfiLibrary.redstoneRod, 's', InfiLibrary.diamondShard });
            ModLoader.addRecipe(new ItemStack(obsidianDiamondIceAxe), new Object[] 
                    { recipe, '#', Item.diamond, '|', InfiLibrary.obsidianRod, 's', InfiLibrary.diamondShard });
            ModLoader.addRecipe(new ItemStack(boneDiamondIceAxe), new Object[] 
                    { recipe, '#', Item.diamond, '|', Item.bone, 's', InfiLibrary.diamondShard });
            ModLoader.addRecipe(new ItemStack(boneDiamondIceAxe), new Object[] 
                    { recipe, '#', Item.diamond, '|', InfiLibrary.boneRod, 's', InfiLibrary.diamondShard });
            ModLoader.addRecipe(new ItemStack(mossyDiamondIceAxe), new Object[] 
                    { recipe, '#', Item.diamond, '|', InfiLibrary.mossyRod, 's', InfiLibrary.diamondShard });
            ModLoader.addRecipe(new ItemStack(netherrackDiamondIceAxe), new Object[] 
                    { recipe, '#', Item.diamond, '|', InfiLibrary.netherrackRod, 's', InfiLibrary.diamondShard });
            ModLoader.addRecipe(new ItemStack(glowstoneDiamondIceAxe), new Object[] 
                    { recipe, '#', Item.diamond, '|', InfiLibrary.glowstoneRod, 's', InfiLibrary.diamondShard });
            ModLoader.addRecipe(new ItemStack(lavaDiamondIceAxe), new Object[] 
                    { recipe, '#', Item.diamond, '|', InfiLibrary.lavaRod, 's', InfiLibrary.diamondShard });
            ModLoader.addRecipe(new ItemStack(cactusDiamondIceAxe), new Object[] 
                    { recipe, '#', Item.diamond, '|', InfiLibrary.cactusRod, 's', InfiLibrary.diamondShard });
            ModLoader.addRecipe(new ItemStack(flintDiamondIceAxe), new Object[] 
                    { recipe, '#', Item.diamond, '|', InfiLibrary.flintRod, 's', InfiLibrary.diamondShard });
            ModLoader.addRecipe(new ItemStack(blazeDiamondIceAxe), new Object[] 
                    { recipe, '#', Item.diamond, '|', Item.blazeRod, 's', InfiLibrary.diamondShard });
            ModLoader.addRecipe(new ItemStack(copperDiamondIceAxe), new Object[] 
                    { recipe, '#', Item.diamond, '|', InfiLibrary.copperRod, 's', InfiLibrary.diamondShard });
            ModLoader.addRecipe(new ItemStack(bronzeDiamondIceAxe), new Object[] 
                    { recipe, '#', Item.diamond, '|', InfiLibrary.bronzeRod, 's', InfiLibrary.diamondShard });
            ModLoader.addRecipe(new ItemStack(workedDiamondIceAxe), new Object[] 
                    { recipe, '#', Item.diamond, '|', InfiLibrary.workedIronRod, 's', InfiLibrary.diamondShard });
            ModLoader.addRecipe(new ItemStack(steelDiamondIceAxe), new Object[] 
                    { recipe, '#', Item.diamond, '|', InfiLibrary.steelRod, 's', InfiLibrary.diamondShard });
            ModLoader.addRecipe(new ItemStack(cobaltDiamondIceAxe), new Object[] 
                    { recipe, '#', Item.diamond, '|', InfiLibrary.cobaltRod, 's', InfiLibrary.diamondShard });
            ModLoader.addRecipe(new ItemStack(arditeDiamondIceAxe), new Object[] 
                    { recipe, '#', Item.diamond, '|', InfiLibrary.arditeRod, 's', InfiLibrary.diamondShard });
            ModLoader.addRecipe(new ItemStack(manyullynDiamondIceAxe), new Object[] 
                    { recipe, '#', Item.diamond, '|', InfiLibrary.manyullynRod, 's', InfiLibrary.diamondShard });
            ModLoader.addRecipe(new ItemStack(uraniumDiamondIceAxe), new Object[] 
                    { recipe, '#', Item.diamond, '|', InfiLibrary.uraniumRod, 's', InfiLibrary.diamondShard });
        }
        
        if(PHInfiHybrids.enableRedstoneTools)
        {
        	ModLoader.addRecipe(new ItemStack(woodRedstoneIceAxe), new Object[] 
                    { recipe, '#', InfiLibrary.redstoneCrystal, '|', Item.stick, 's', InfiLibrary.redstoneFragment });
        	ModLoader.addRecipe(new ItemStack(stoneRedstoneIceAxe), new Object[] 
                    { recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.stoneRod, 's', InfiLibrary.redstoneFragment });
            ModLoader.addRecipe(new ItemStack(ironRedstoneIceAxe), new Object[] 
                    { recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.ironRod, 's', InfiLibrary.redstoneFragment });
            ModLoader.addRecipe(new ItemStack(redstoneRedstoneIceAxe), new Object[] 
                    { recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.redstoneRod, 's', InfiLibrary.redstoneFragment });
            ModLoader.addRecipe(new ItemStack(obsidianRedstoneIceAxe), new Object[] 
                    { recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.obsidianRod, 's', InfiLibrary.redstoneFragment });
            ModLoader.addRecipe(new ItemStack(sandstoneRedstoneIceAxe), new Object[] 
                    { recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.sandstoneRod, 's', InfiLibrary.redstoneFragment });
            ModLoader.addRecipe(new ItemStack(boneRedstoneIceAxe), new Object[] 
                    { recipe, '#', InfiLibrary.redstoneCrystal, '|', Item.bone, 's', InfiLibrary.redstoneFragment });
            ModLoader.addRecipe(new ItemStack(boneRedstoneIceAxe), new Object[] 
                    { recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.boneRod, 's', InfiLibrary.redstoneFragment });
            ModLoader.addRecipe(new ItemStack(paperRedstoneIceAxe), new Object[] 
                    { recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.paperRod, 's', InfiLibrary.redstoneFragment });
            ModLoader.addRecipe(new ItemStack(mossyRedstoneIceAxe), new Object[] 
                    { recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.mossyRod, 's', InfiLibrary.redstoneFragment });
            ModLoader.addRecipe(new ItemStack(netherrackRedstoneIceAxe), new Object[] 
                    { recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.netherrackRod, 's', InfiLibrary.redstoneFragment });
            ModLoader.addRecipe(new ItemStack(glowstoneRedstoneIceAxe), new Object[] 
                    { recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.glowstoneRod, 's', InfiLibrary.redstoneFragment });
            ModLoader.addRecipe(new ItemStack(iceRedstoneIceAxe), new Object[] 
                    { recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.iceRod, 's', InfiLibrary.redstoneFragment });
            ModLoader.addRecipe(new ItemStack(lavaRedstoneIceAxe), new Object[] 
                    { recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.lavaRod, 's', InfiLibrary.redstoneFragment });
            ModLoader.addRecipe(new ItemStack(slimeRedstoneIceAxe), new Object[] 
                    { recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.slimeRod, 's', InfiLibrary.redstoneFragment });
            ModLoader.addRecipe(new ItemStack(cactusRedstoneIceAxe), new Object[] 
                    { recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.cactusRod, 's', InfiLibrary.redstoneFragment });
            ModLoader.addRecipe(new ItemStack(flintRedstoneIceAxe), new Object[] 
                    { recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.flintRod, 's', InfiLibrary.redstoneFragment });
            ModLoader.addRecipe(new ItemStack(copperRedstoneIceAxe), new Object[] 
                    { recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.copperRod, 's', InfiLibrary.redstoneFragment });
            ModLoader.addRecipe(new ItemStack(bronzeRedstoneIceAxe), new Object[] 
                    { recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.bronzeRod, 's', InfiLibrary.redstoneFragment });
            ModLoader.addRecipe(new ItemStack(workedRedstoneIceAxe), new Object[] 
                    { recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.workedIronRod, 's', InfiLibrary.redstoneFragment });
            ModLoader.addRecipe(new ItemStack(uraniumRedstoneIceAxe), new Object[] 
                    { recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.uraniumRod, 's', InfiLibrary.redstoneFragment });
        }
        
        if(PHInfiHybrids.enableObsidianTools)
        {
        	ModLoader.addRecipe(new ItemStack(woodObsidianIceAxe), new Object[] 
                    { recipe, '#', Block.obsidian, '|', Item.stick, 's', InfiLibrary.obsidianShard });
        	ModLoader.addRecipe(new ItemStack(stoneObsidianIceAxe), new Object[] 
                    { recipe, '#', Block.obsidian, '|', InfiLibrary.stoneRod, 's', InfiLibrary.obsidianShard });
            ModLoader.addRecipe(new ItemStack(redstoneObsidianIceAxe), new Object[] 
                    { recipe, '#', Block.obsidian, '|', InfiLibrary.redstoneRod, 's', InfiLibrary.obsidianShard });
            ModLoader.addRecipe(new ItemStack(obsidianObsidianIceAxe), new Object[] 
                    { recipe, '#', Block.obsidian, '|', InfiLibrary.obsidianRod, 's', InfiLibrary.obsidianShard });
            ModLoader.addRecipe(new ItemStack(boneObsidianIceAxe), new Object[] 
                    { recipe, '#', Block.obsidian, '|', Item.bone, 's', InfiLibrary.obsidianShard });
            ModLoader.addRecipe(new ItemStack(boneObsidianIceAxe), new Object[] 
                    { recipe, '#', Block.obsidian, '|', InfiLibrary.boneRod, 's', InfiLibrary.obsidianShard });
            ModLoader.addRecipe(new ItemStack(netherrackObsidianIceAxe), new Object[] 
                    { recipe, '#', Block.obsidian, '|', InfiLibrary.netherrackRod, 's', InfiLibrary.obsidianShard });
            ModLoader.addRecipe(new ItemStack(glowstoneObsidianIceAxe), new Object[] 
                    { recipe, '#', Block.obsidian, '|', InfiLibrary.glowstoneRod, 's', InfiLibrary.obsidianShard });
            ModLoader.addRecipe(new ItemStack(iceObsidianIceAxe), new Object[] 
                    { recipe, '#', Block.obsidian, '|', InfiLibrary.iceRod, 's', InfiLibrary.obsidianShard });
            ModLoader.addRecipe(new ItemStack(lavaObsidianIceAxe), new Object[] 
                    { recipe, '#', Block.obsidian, '|', InfiLibrary.lavaRod, 's', InfiLibrary.obsidianShard });
            ModLoader.addRecipe(new ItemStack(cactusObsidianIceAxe), new Object[] 
                    { recipe, '#', Block.obsidian, '|', InfiLibrary.cactusRod, 's', InfiLibrary.obsidianShard });
        }
        
        if(PHInfiHybrids.enableSandstoneTools)
        {
            ModLoader.addRecipe(new ItemStack(woodSandstoneIceAxe), new Object[] 
                    { recipe, '#', Block.sandStone, '|', Item.stick, 's', InfiLibrary.sandstoneShard });
            ModLoader.addRecipe(new ItemStack(sandstoneSandstoneIceAxe), new Object[] 
                    { recipe, '#', Block.sandStone, '|', InfiLibrary.sandstoneRod, 's', InfiLibrary.sandstoneShard });
            ModLoader.addRecipe(new ItemStack(boneSandstoneIceAxe), new Object[] 
                    { recipe, '#', Block.sandStone, '|', Item.bone, 's', InfiLibrary.sandstoneShard });
            ModLoader.addRecipe(new ItemStack(boneSandstoneIceAxe), new Object[] 
                    { recipe, '#', Block.sandStone, '|', InfiLibrary.boneRod, 's', InfiLibrary.sandstoneShard });      
            ModLoader.addRecipe(new ItemStack(netherrackSandstoneIceAxe), new Object[] 
                    { recipe, '#', Block.sandStone, '|', InfiLibrary.netherrackRod, 's', InfiLibrary.sandstoneShard });
            ModLoader.addRecipe(new ItemStack(iceSandstoneIceAxe), new Object[] 
                    { recipe, '#', Block.sandStone, '|', InfiLibrary.iceRod, 's', InfiLibrary.sandstoneShard });
            ModLoader.addRecipe(new ItemStack(slimeSandstoneIceAxe), new Object[] 
                    { recipe, '#', Block.sandStone, '|', InfiLibrary.slimeRod, 's', InfiLibrary.sandstoneShard });
            ModLoader.addRecipe(new ItemStack(cactusSandstoneIceAxe), new Object[] 
                    { recipe, '#', Block.sandStone, '|', InfiLibrary.cactusRod, 's', InfiLibrary.sandstoneShard });
            ModLoader.addRecipe(new ItemStack(flintSandstoneIceAxe), new Object[] 
                    { recipe, '#', Block.sandStone, '|', InfiLibrary.flintRod, 's', InfiLibrary.sandstoneShard });
        }
        
        if(PHInfiHybrids.enableBoneTools)
        {
            ModLoader.addRecipe(new ItemStack(woodBoneIceAxe), new Object[] 
                    { recipe, '#', Item.bone, '|', Item.stick, 's', new ItemStack(Item.dyePowder, 1, 15) });
            ModLoader.addRecipe(new ItemStack(stoneBoneIceAxe), new Object[] 
                    { recipe, '#', Item.bone, '|', InfiLibrary.stoneRod, 's', new ItemStack(Item.dyePowder, 1, 15) });
            ModLoader.addRecipe(new ItemStack(sandstoneBoneIceAxe), new Object[] 
                    { recipe, '#', Item.bone, '|', InfiLibrary.sandstoneRod, 's', new ItemStack(Item.dyePowder, 1, 15) });
            ModLoader.addRecipe(new ItemStack(boneBoneIceAxe), new Object[] 
                    { recipe, '#', Item.bone, '|', Item.bone, 's', new ItemStack(Item.dyePowder, 1, 15) });
            ModLoader.addRecipe(new ItemStack(boneBoneIceAxe), new Object[] 
                    { recipe, '#', Item.bone, '|', InfiLibrary.boneRod, 's', new ItemStack(Item.dyePowder, 1, 15) });
            ModLoader.addRecipe(new ItemStack(paperBoneIceAxe), new Object[] 
                    { recipe, '#', Item.bone, '|', InfiLibrary.paperRod, 's', new ItemStack(Item.dyePowder, 1, 15) });
            ModLoader.addRecipe(new ItemStack(netherrackBoneIceAxe), new Object[] 
                    { recipe, '#', Item.bone, '|', InfiLibrary.netherrackRod, 's', new ItemStack(Item.dyePowder, 1, 15) });
            ModLoader.addRecipe(new ItemStack(iceBoneIceAxe), new Object[] 
                    { recipe, '#', Item.bone, '|', InfiLibrary.iceRod, 's', new ItemStack(Item.dyePowder, 1, 15) });
            ModLoader.addRecipe(new ItemStack(cactusBoneIceAxe), new Object[] 
                    { recipe, '#', Item.bone, '|', InfiLibrary.cactusRod, 's', new ItemStack(Item.dyePowder, 1, 15) });
            ModLoader.addRecipe(new ItemStack(flintBoneIceAxe), new Object[] 
                    { recipe, '#', Item.bone, '|', InfiLibrary.flintRod, 's', new ItemStack(Item.dyePowder, 1, 15) });
        }
        
        if(PHInfiHybrids.enablePaperTools)
        {
            ModLoader.addRecipe(new ItemStack(woodPaperIceAxe), new Object[] 
                    { recipe, '#', InfiLibrary.paperStack, '|', Item.stick, 's', Item.paper });
            ModLoader.addRecipe(new ItemStack(bonePaperIceAxe), new Object[] 
                    { recipe, '#', InfiLibrary.paperStack, '|', Item.bone, 's', Item.paper });
            ModLoader.addRecipe(new ItemStack(bonePaperIceAxe), new Object[] 
                    { recipe, '#', InfiLibrary.paperStack, '|', InfiLibrary.boneRod, 's', Item.paper });
            ModLoader.addRecipe(new ItemStack(paperPaperIceAxe), new Object[] 
                    { recipe, '#', InfiLibrary.paperStack, '|', InfiLibrary.paperRod, 's', Item.paper });
            ModLoader.addRecipe(new ItemStack(slimePaperIceAxe), new Object[] 
                    { recipe, '#', InfiLibrary.paperStack, '|', InfiLibrary.slimeRod, 's', Item.paper });
            ModLoader.addRecipe(new ItemStack(cactusPaperIceAxe), new Object[] 
                    { recipe, '#', InfiLibrary.paperStack, '|', InfiLibrary.cactusRod, 's', Item.paper });
        }
        
        if(PHInfiHybrids.enableMossyTools)
        {
        	ModLoader.addRecipe(new ItemStack(woodMossyIceAxe), new Object[] 
                    { recipe, '#', InfiLibrary.mossyStone, '|', Item.stick, 's', InfiLibrary.mossyPatch });
        	ModLoader.addRecipe(new ItemStack(stoneMossyIceAxe), new Object[] 
                    { recipe, '#', InfiLibrary.mossyStone, '|', InfiLibrary.stoneRod, 's', InfiLibrary.mossyPatch });
            ModLoader.addRecipe(new ItemStack(diamondMossyIceAxe), new Object[] 
                    { recipe, '#', InfiLibrary.mossyStone, '|', InfiLibrary.diamondRod, 's', InfiLibrary.mossyPatch });
            ModLoader.addRecipe(new ItemStack(redstoneMossyIceAxe), new Object[] 
                    { recipe, '#', InfiLibrary.mossyStone, '|', InfiLibrary.redstoneRod, 's', InfiLibrary.mossyPatch });
            ModLoader.addRecipe(new ItemStack(boneMossyIceAxe), new Object[] 
                    { recipe, '#', InfiLibrary.mossyStone, '|', Item.bone, 's', InfiLibrary.mossyPatch });
            ModLoader.addRecipe(new ItemStack(boneMossyIceAxe), new Object[] 
                    { recipe, '#', InfiLibrary.mossyStone, '|', InfiLibrary.boneRod, 's', InfiLibrary.mossyPatch });
            ModLoader.addRecipe(new ItemStack(mossyMossyIceAxe), new Object[] 
                    { recipe, '#', InfiLibrary.mossyStone, '|', InfiLibrary.mossyRod, 's', InfiLibrary.mossyPatch });
            ModLoader.addRecipe(new ItemStack(netherrackMossyIceAxe), new Object[] 
                    { recipe, '#', InfiLibrary.mossyStone, '|', InfiLibrary.netherrackRod, 's', InfiLibrary.mossyPatch });
            ModLoader.addRecipe(new ItemStack(glowstoneMossyIceAxe), new Object[] 
                    { recipe, '#', InfiLibrary.mossyStone, '|', InfiLibrary.glowstoneRod, 's', InfiLibrary.mossyPatch });
            ModLoader.addRecipe(new ItemStack(cactusMossyIceAxe), new Object[] 
                    { recipe, '#', InfiLibrary.mossyStone, '|', InfiLibrary.cactusRod, 's', InfiLibrary.mossyPatch });
            ModLoader.addRecipe(new ItemStack(blazeMossyIceAxe), new Object[] 
                    { recipe, '#', InfiLibrary.mossyStone, '|', Item.blazeRod, 's', InfiLibrary.mossyPatch });
            ModLoader.addRecipe(new ItemStack(manyullynMossyIceAxe), new Object[] 
                    { recipe, '#', InfiLibrary.mossyStone, '|', InfiLibrary.manyullynRod, 's', InfiLibrary.mossyPatch });
            ModLoader.addRecipe(new ItemStack(uraniumMossyIceAxe), new Object[] 
                    { recipe, '#', InfiLibrary.mossyStone, '|', InfiLibrary.uraniumRod, 's', InfiLibrary.mossyPatch });
        }
        
        if(PHInfiHybrids.enableNetherrackTools)
        {
        	ModLoader.addRecipe(new ItemStack(woodNetherrackIceAxe), new Object[] 
                    { recipe, '#', Block.netherrack, '|', Item.stick, 's', InfiLibrary.netherrackShard });
        	ModLoader.addRecipe(new ItemStack(stoneNetherrackIceAxe), new Object[] 
                    { recipe, '#', Block.netherrack, '|', InfiLibrary.stoneRod, 's', InfiLibrary.netherrackShard });
            ModLoader.addRecipe(new ItemStack(sandstoneNetherrackIceAxe), new Object[] 
                    { recipe, '#', Block.netherrack, '|', InfiLibrary.sandstoneRod, 's', InfiLibrary.netherrackShard });
            ModLoader.addRecipe(new ItemStack(boneNetherrackIceAxe), new Object[] 
                    { recipe, '#', Block.netherrack, '|', Item.bone, 's', InfiLibrary.netherrackShard });
            ModLoader.addRecipe(new ItemStack(boneNetherrackIceAxe), new Object[] 
                    { recipe, '#', Block.netherrack, '|', InfiLibrary.boneRod, 's', InfiLibrary.netherrackShard });
            ModLoader.addRecipe(new ItemStack(paperNetherrackIceAxe), new Object[] 
                    { recipe, '#', Block.netherrack, '|', InfiLibrary.paperRod, 's', InfiLibrary.netherrackShard });
            ModLoader.addRecipe(new ItemStack(mossyNetherrackIceAxe), new Object[] 
                    { recipe, '#', Block.netherrack, '|', InfiLibrary.mossyRod, 's', InfiLibrary.netherrackShard });
            ModLoader.addRecipe(new ItemStack(netherrackNetherrackIceAxe), new Object[] 
                    { recipe, '#', Block.netherrack, '|', InfiLibrary.netherrackRod, 's', InfiLibrary.netherrackShard });
            ModLoader.addRecipe(new ItemStack(iceNetherrackIceAxe), new Object[] 
                    { recipe, '#', Block.netherrack, '|', InfiLibrary.iceRod, 's', InfiLibrary.netherrackShard });
            ModLoader.addRecipe(new ItemStack(slimeNetherrackIceAxe), new Object[] 
                    { recipe, '#', Block.netherrack, '|', InfiLibrary.slimeRod, 's', InfiLibrary.netherrackShard });
            ModLoader.addRecipe(new ItemStack(cactusNetherrackIceAxe), new Object[] 
                    { recipe, '#', Block.netherrack, '|', InfiLibrary.cactusRod, 's', InfiLibrary.netherrackShard });
            ModLoader.addRecipe(new ItemStack(flintNetherrackIceAxe), new Object[] 
                    { recipe, '#', Block.netherrack, '|', InfiLibrary.flintRod, 's', InfiLibrary.netherrackShard });
            ModLoader.addRecipe(new ItemStack(copperNetherrackIceAxe), new Object[] 
                    { recipe, '#', Block.netherrack, '|', InfiLibrary.copperRod, 's', InfiLibrary.netherrackShard });
            ModLoader.addRecipe(new ItemStack(bronzeNetherrackIceAxe), new Object[] 
                    { recipe, '#', Block.netherrack, '|', InfiLibrary.bronzeRod, 's', InfiLibrary.netherrackShard });
        }
        
        if(PHInfiHybrids.enableGlowstoneTools)
        {
        	ModLoader.addRecipe(new ItemStack(woodGlowstoneIceAxe), new Object[] 
                    { recipe, '#', InfiLibrary.glowstoneCrystal, '|', Item.stick, 's', InfiLibrary.glowstoneFragment });
        	ModLoader.addRecipe(new ItemStack(redstoneGlowstoneIceAxe), new Object[] 
                    { recipe, '#', InfiLibrary.glowstoneCrystal, '|', InfiLibrary.glowstoneRod, 's', InfiLibrary.glowstoneFragment });
        	ModLoader.addRecipe(new ItemStack(obsidianGlowstoneIceAxe), new Object[] 
                    { recipe, '#', InfiLibrary.glowstoneCrystal, '|', InfiLibrary.obsidianRod, 's', InfiLibrary.glowstoneFragment });
            ModLoader.addRecipe(new ItemStack(boneGlowstoneIceAxe), new Object[] 
                    { recipe, '#', InfiLibrary.glowstoneCrystal, '|', Item.bone, 's', InfiLibrary.glowstoneFragment });
            ModLoader.addRecipe(new ItemStack(boneGlowstoneIceAxe), new Object[] 
                    { recipe, '#', InfiLibrary.glowstoneCrystal, '|', InfiLibrary.boneRod, 's', InfiLibrary.glowstoneFragment });
            ModLoader.addRecipe(new ItemStack(netherrackGlowstoneIceAxe), new Object[] 
                    { recipe, '#', InfiLibrary.glowstoneCrystal, '|', InfiLibrary.netherrackRod, 's', InfiLibrary.glowstoneFragment });
            ModLoader.addRecipe(new ItemStack(glowstoneGlowstoneIceAxe), new Object[] 
                    { recipe, '#', InfiLibrary.glowstoneCrystal, '|', InfiLibrary.glowstoneRod, 's', InfiLibrary.glowstoneFragment });
            ModLoader.addRecipe(new ItemStack(iceGlowstoneIceAxe), new Object[] 
                    { recipe, '#', InfiLibrary.glowstoneCrystal, '|', InfiLibrary.iceRod, 's', InfiLibrary.glowstoneFragment });
            ModLoader.addRecipe(new ItemStack(slimeGlowstoneIceAxe), new Object[] 
                    { recipe, '#', InfiLibrary.glowstoneCrystal, '|', InfiLibrary.slimeRod, 's', InfiLibrary.glowstoneFragment });
            ModLoader.addRecipe(new ItemStack(cactusGlowstoneIceAxe), new Object[] 
                    { recipe, '#', InfiLibrary.glowstoneCrystal, '|', InfiLibrary.cactusRod, 's', InfiLibrary.glowstoneFragment });
        }
        
        if(PHInfiHybrids.enableIceTools)
        {
            ModLoader.addRecipe(new ItemStack(woodIceIceAxe), new Object[] 
                    { recipe, '#', Block.ice, '|', Item.stick, 's', InfiLibrary.iceShard });
            ModLoader.addRecipe(new ItemStack(boneIceIceAxe), new Object[] 
                    { recipe, '#', Block.ice, '|', Item.bone, 's', InfiLibrary.iceShard });
            ModLoader.addRecipe(new ItemStack(boneIceIceAxe), new Object[] 
                    { recipe, '#', Block.ice, '|', InfiLibrary.boneRod, 's', InfiLibrary.iceShard });
            ModLoader.addRecipe(new ItemStack(paperIceIceAxe), new Object[] 
                    { recipe, '#', Block.ice, '|', InfiLibrary.paperRod, 's', InfiLibrary.iceShard });
            ModLoader.addRecipe(new ItemStack(iceIceIceAxe), new Object[] 
                    { recipe, '#', Block.ice, '|', InfiLibrary.iceRod, 's', InfiLibrary.iceShard });
            ModLoader.addRecipe(new ItemStack(slimeIceIceAxe), new Object[] 
                    { recipe, '#', Block.ice, '|', InfiLibrary.slimeRod, 's', InfiLibrary.iceShard });
            ModLoader.addRecipe(new ItemStack(cactusIceIceAxe), new Object[] 
                    { recipe, '#', Block.ice, '|', InfiLibrary.cactusRod, 's', InfiLibrary.iceShard });
        }
        
        if(PHInfiHybrids.enableLavaTools)
        {
            ModLoader.addRecipe(new ItemStack(diamondLavaIceAxe), new Object[] 
                    { recipe, '#', InfiLibrary.lavaCrystal, '|', InfiLibrary.diamondRod, 's', InfiLibrary.lavaFragment });
            ModLoader.addRecipe(new ItemStack(obsidianLavaIceAxe), new Object[] 
                    { recipe, '#', InfiLibrary.lavaCrystal, '|', InfiLibrary.obsidianRod, 's', InfiLibrary.lavaFragment });
            ModLoader.addRecipe(new ItemStack(netherrackLavaIceAxe), new Object[] 
                    { recipe, '#', InfiLibrary.lavaCrystal, '|', InfiLibrary.netherrackRod, 's', InfiLibrary.lavaFragment });
            ModLoader.addRecipe(new ItemStack(lavaLavaIceAxe), new Object[] 
                    { recipe, '#', InfiLibrary.lavaCrystal, '|', InfiLibrary.lavaRod, 's', InfiLibrary.lavaFragment });
            ModLoader.addRecipe(new ItemStack(flintLavaIceAxe), new Object[] 
                    { recipe, '#', InfiLibrary.lavaCrystal, '|', InfiLibrary.flintRod, 's', InfiLibrary.lavaFragment });
            ModLoader.addRecipe(new ItemStack(blazeLavaIceAxe), new Object[] 
                    { recipe, '#', InfiLibrary.lavaCrystal, '|', Item.blazeRod, 's', InfiLibrary.lavaFragment });
            ModLoader.addRecipe(new ItemStack(manyullynLavaIceAxe), new Object[] 
                    { recipe, '#', InfiLibrary.lavaCrystal, '|', InfiLibrary.manyullynRod, 's', InfiLibrary.lavaFragment });
            ModLoader.addRecipe(new ItemStack(uraniumLavaIceAxe), new Object[] 
                    { recipe, '#', InfiLibrary.lavaCrystal, '|', InfiLibrary.uraniumRod, 's', InfiLibrary.lavaFragment });
        }
        
        if(PHInfiHybrids.enableSlimeTools)
        {
            ModLoader.addRecipe(new ItemStack(woodSlimeIceAxe), new Object[] 
                    { recipe, '#', InfiLibrary.slimeCrystal, '|', Item.stick, 's', Item.slimeBall });
            ModLoader.addRecipe(new ItemStack(sandstoneSlimeIceAxe), new Object[] 
                    { recipe, '#', InfiLibrary.slimeCrystal, '|', InfiLibrary.sandstoneRod, 's', Item.slimeBall });
            ModLoader.addRecipe(new ItemStack(boneSlimeIceAxe), new Object[] 
                    { recipe, '#', InfiLibrary.slimeCrystal, '|', Item.bone, 's', Item.slimeBall });
            ModLoader.addRecipe(new ItemStack(boneSlimeIceAxe), new Object[] 
                    { recipe, '#', InfiLibrary.slimeCrystal, '|', InfiLibrary.boneRod, 's', Item.slimeBall });
            ModLoader.addRecipe(new ItemStack(paperSlimeIceAxe), new Object[] 
                    { recipe, '#', InfiLibrary.slimeCrystal, '|', InfiLibrary.paperRod, 's', Item.slimeBall });
            ModLoader.addRecipe(new ItemStack(slimeSlimeIceAxe), new Object[] 
                    { recipe, '#', InfiLibrary.slimeCrystal, '|', InfiLibrary.slimeRod, 's', Item.slimeBall });
            ModLoader.addRecipe(new ItemStack(cactusSlimeIceAxe), new Object[] 
                    { recipe, '#', InfiLibrary.slimeCrystal, '|', InfiLibrary.cactusRod, 's', Item.slimeBall });
        }
        
        if(PHInfiHybrids.enableCactusTools)
        {
            ModLoader.addRecipe(new ItemStack(woodCactusIceAxe), new Object[] 
                    { recipe, '#', Block.cactus, '|', Item.stick, 's', InfiLibrary.cactusShard });
            ModLoader.addRecipe(new ItemStack(sandstoneCactusIceAxe), new Object[] 
                    { recipe, '#', Block.cactus, '|', InfiLibrary.sandstoneRod, 's', InfiLibrary.cactusShard });
            ModLoader.addRecipe(new ItemStack(boneCactusIceAxe), new Object[] 
                    { recipe, '#', Block.cactus, '|', Item.bone, 's', InfiLibrary.cactusShard });
            ModLoader.addRecipe(new ItemStack(boneCactusIceAxe), new Object[] 
                    { recipe, '#', Block.cactus, '|', InfiLibrary.boneRod, 's', InfiLibrary.cactusShard });
            ModLoader.addRecipe(new ItemStack(netherrackCactusIceAxe), new Object[] 
                    { recipe, '#', Block.cactus, '|', InfiLibrary.netherrackRod, 's', InfiLibrary.cactusShard });
            ModLoader.addRecipe(new ItemStack(iceCactusIceAxe), new Object[] 
                    { recipe, '#', Block.cactus, '|', InfiLibrary.iceRod, 's', InfiLibrary.cactusShard });
            ModLoader.addRecipe(new ItemStack(slimeCactusIceAxe), new Object[] 
                    { recipe, '#', Block.cactus, '|', InfiLibrary.slimeRod, 's', InfiLibrary.cactusShard });
            ModLoader.addRecipe(new ItemStack(cactusCactusIceAxe), new Object[] 
                    { recipe, '#', Block.cactus, '|', InfiLibrary.cactusRod, 's', InfiLibrary.cactusShard });
        }
        
        if(PHInfiHybrids.enableFlintTools)
        {
        	ModLoader.addRecipe(new ItemStack(woodFlintIceAxe), new Object[] 
                    { recipe, '#', Item.flint, '|', Item.stick, 's', InfiLibrary.flintShard });
        	ModLoader.addRecipe(new ItemStack(stoneFlintIceAxe), new Object[] 
                    { recipe, '#', Item.flint, '|', InfiLibrary.stoneRod, 's', InfiLibrary.flintShard });
            ModLoader.addRecipe(new ItemStack(sandstoneFlintIceAxe), new Object[] 
                    { recipe, '#', Item.flint, '|', InfiLibrary.sandstoneRod, 's', InfiLibrary.flintShard });
            ModLoader.addRecipe(new ItemStack(boneFlintIceAxe), new Object[] 
                    { recipe, '#', Item.flint, '|', Item.bone, 's', InfiLibrary.flintShard });
            ModLoader.addRecipe(new ItemStack(boneFlintIceAxe), new Object[] 
                    { recipe, '#', Item.flint, '|', InfiLibrary.boneRod, 's', InfiLibrary.flintShard });
            ModLoader.addRecipe(new ItemStack(netherrackFlintIceAxe), new Object[] 
                    { recipe, '#', Item.flint, '|', InfiLibrary.netherrackRod, 's', InfiLibrary.flintShard });
            ModLoader.addRecipe(new ItemStack(slimeFlintIceAxe), new Object[] 
                    { recipe, '#', Item.flint, '|', InfiLibrary.slimeRod, 's', InfiLibrary.flintShard });
            ModLoader.addRecipe(new ItemStack(cactusFlintIceAxe), new Object[] 
                    { recipe, '#', Item.flint, '|', InfiLibrary.cactusRod, 's', InfiLibrary.flintShard });
            ModLoader.addRecipe(new ItemStack(flintFlintIceAxe), new Object[] 
                    { recipe, '#', Item.flint, '|', InfiLibrary.flintRod, 's', InfiLibrary.flintShard });
            ModLoader.addRecipe(new ItemStack(copperFlintIceAxe), new Object[] 
                    { recipe, '#', Item.flint, '|', InfiLibrary.copperRod, 's', InfiLibrary.flintShard });
            ModLoader.addRecipe(new ItemStack(bronzeFlintIceAxe), new Object[] 
                    { recipe, '#', Item.flint, '|', InfiLibrary.bronzeRod, 's', InfiLibrary.flintShard });
        }
        
        if(PHInfiHybrids.enableBlazeTools)
        {
            ModLoader.addRecipe(new ItemStack(diamondBlazeIceAxe), new Object[] 
                    { recipe, '#', InfiLibrary.blazeCrystal, '|', InfiLibrary.diamondRod, 's', InfiLibrary.blazeFragment });
            ModLoader.addRecipe(new ItemStack(obsidianBlazeIceAxe), new Object[] 
                    { recipe, '#', InfiLibrary.blazeCrystal, '|', InfiLibrary.obsidianRod, 's', InfiLibrary.blazeFragment });
            ModLoader.addRecipe(new ItemStack(netherrackBlazeIceAxe), new Object[] 
                    { recipe, '#', InfiLibrary.blazeCrystal, '|', InfiLibrary.netherrackRod, 's', InfiLibrary.blazeFragment });
            ModLoader.addRecipe(new ItemStack(lavaBlazeIceAxe), new Object[] 
                    { recipe, '#', InfiLibrary.blazeCrystal, '|', InfiLibrary.lavaRod, 's', InfiLibrary.blazeFragment });
            ModLoader.addRecipe(new ItemStack(flintBlazeIceAxe), new Object[] 
                    { recipe, '#', InfiLibrary.blazeCrystal, '|', InfiLibrary.flintRod, 's', InfiLibrary.blazeFragment });
            ModLoader.addRecipe(new ItemStack(blazeBlazeIceAxe), new Object[] 
                    { recipe, '#', InfiLibrary.blazeCrystal, '|', Item.blazeRod, 's', InfiLibrary.blazeFragment });
            ModLoader.addRecipe(new ItemStack(manyullynBlazeIceAxe), new Object[] 
                    { recipe, '#', InfiLibrary.blazeCrystal, '|', InfiLibrary.manyullynRod, 's', InfiLibrary.blazeFragment });
            ModLoader.addRecipe(new ItemStack(uraniumBlazeIceAxe), new Object[] 
                    { recipe, '#', InfiLibrary.blazeCrystal, '|', InfiLibrary.uraniumRod, 's', InfiLibrary.blazeFragment });
        }
    }
    
    public static void addStoneTools(String stack)
	{
		//GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(woodStoneIceAxe), recipe, '#', stack, '|', Item.stick ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(stoneStoneIceAxe), recipe, '#', stack, '|', InfiLibrary.stoneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(sandstoneStoneIceAxe), recipe, '#', stack, '|', InfiLibrary.sandstoneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(boneStoneIceAxe), recipe, '#', stack, '|', Item.bone ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(boneStoneIceAxe), recipe, '#', stack, '|', InfiLibrary.boneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(netherrackStoneIceAxe), recipe, '#', stack, '|', InfiLibrary.netherrackRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(iceStoneIceAxe), recipe, '#', stack, '|', InfiLibrary.iceRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(slimeStoneIceAxe), recipe, '#', stack, '|', InfiLibrary.slimeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(cactusStoneIceAxe), recipe, '#', stack, '|', InfiLibrary.cactusRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(flintStoneIceAxe), recipe, '#', stack, '|', InfiLibrary.flintRod ) );
	}

	public static void addCopperTools(String stack)
	{
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(woodCopperIceAxe), recipe, '#', stack, '|', Item.stick ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(stoneCopperIceAxe), recipe, '#', stack, '|', InfiLibrary.stoneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(boneCopperIceAxe), recipe, '#', stack, '|', Item.bone ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(boneCopperIceAxe), recipe, '#', stack, '|', InfiLibrary.boneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(netherrackCopperIceAxe), recipe, '#', stack, '|', InfiLibrary.netherrackRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(slimeCopperIceAxe), recipe, '#', stack, '|', InfiLibrary.slimeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(cactusCopperIceAxe), recipe, '#', stack, '|', InfiLibrary.cactusRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(flintCopperIceAxe), recipe, '#', stack, '|', InfiLibrary.flintRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(copperCopperIceAxe), recipe, '#', stack, '|', InfiLibrary.copperRod ) );
	}

	public static void addBronzeTools(String stack)
	{
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(woodBronzeIceAxe), recipe, '#', stack, '|', Item.stick ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(stoneBronzeIceAxe), recipe, '#', stack, '|', InfiLibrary.stoneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(boneBronzeIceAxe), recipe, '#', stack, '|', Item.bone ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(boneBronzeIceAxe), recipe, '#', stack, '|', InfiLibrary.boneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(netherrackBronzeIceAxe), recipe, '#', stack, '|', InfiLibrary.netherrackRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(slimeBronzeIceAxe), recipe, '#', stack, '|', InfiLibrary.slimeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(cactusBronzeIceAxe), recipe, '#', stack, '|', InfiLibrary.cactusRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(flintBronzeIceAxe), recipe, '#', stack, '|', InfiLibrary.flintRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(copperBronzeIceAxe), recipe, '#', stack, '|', InfiLibrary.copperRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(bronzeBronzeIceAxe), recipe, '#', stack, '|', InfiLibrary.bronzeRod ) );
	}

	public static void addWorkedIronTools(String stack)
	{
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(woodWorkedIronIceAxe), recipe, '#', stack, '|', Item.stick ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(stoneWorkedIronIceAxe), recipe, '#', stack, '|', InfiLibrary.stoneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(ironWorkedIronIceAxe), recipe, '#', stack, '|', InfiLibrary.ironRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(diamondWorkedIronIceAxe), recipe, '#', stack, '|', InfiLibrary.diamondRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(redstoneWorkedIronIceAxe), recipe, '#', stack, '|', InfiLibrary.redstoneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(obsidianWorkedIronIceAxe), recipe, '#', stack, '|', InfiLibrary.obsidianRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(boneWorkedIronIceAxe), recipe, '#', stack, '|', Item.bone ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(boneWorkedIronIceAxe), recipe, '#', stack, '|', InfiLibrary.boneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(netherrackWorkedIronIceAxe), recipe, '#', stack, '|', InfiLibrary.netherrackRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(glowstoneWorkedIronIceAxe), recipe, '#', stack, '|', InfiLibrary.glowstoneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(iceWorkedIronIceAxe), recipe, '#', stack, '|', InfiLibrary.iceRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(slimeWorkedIronIceAxe), recipe, '#', stack, '|', InfiLibrary.slimeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(cactusWorkedIronIceAxe), recipe, '#', stack, '|', InfiLibrary.cactusRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(blazeWorkedIronIceAxe), recipe, '#', stack, '|', Item.blazeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(copperWorkedIronIceAxe), recipe, '#', stack, '|', InfiLibrary.copperRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(bronzeWorkedIronIceAxe), recipe, '#', stack, '|', InfiLibrary.bronzeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(workedWorkedIronIceAxe), recipe, '#', stack, '|', InfiLibrary.workedIronRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(steelWorkedIronIceAxe), recipe, '#', stack, '|', InfiLibrary.steelRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(uraniumWorkedIronIceAxe), recipe, '#', stack, '|', InfiLibrary.uraniumRod ) );
	}

	public static void addSteelTools(String stack)
	{
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(woodSteelIceAxe), recipe, '#', stack, '|', Item.stick ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(stoneSteelIceAxe), recipe, '#', stack, '|', InfiLibrary.stoneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(ironSteelIceAxe), recipe, '#', stack, '|', InfiLibrary.ironRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(diamondSteelIceAxe), recipe, '#', stack, '|', InfiLibrary.diamondRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(redstoneSteelIceAxe), recipe, '#', stack, '|', InfiLibrary.redstoneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(obsidianSteelIceAxe), recipe, '#', stack, '|', InfiLibrary.obsidianRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(boneSteelIceAxe), recipe, '#', stack, '|', Item.bone ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(boneSteelIceAxe), recipe, '#', stack, '|', InfiLibrary.boneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(netherrackSteelIceAxe), recipe, '#', stack, '|', InfiLibrary.netherrackRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(glowstoneSteelIceAxe), recipe, '#', stack, '|', InfiLibrary.glowstoneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(iceSteelIceAxe), recipe, '#', stack, '|', InfiLibrary.iceRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(slimeSteelIceAxe), recipe, '#', stack, '|', InfiLibrary.slimeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(cactusSteelIceAxe), recipe, '#', stack, '|', InfiLibrary.cactusRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(blazeSteelIceAxe), recipe, '#', stack, '|', Item.blazeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(copperSteelIceAxe), recipe, '#', stack, '|', InfiLibrary.copperRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(bronzeSteelIceAxe), recipe, '#', stack, '|', InfiLibrary.bronzeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(workedSteelIceAxe), recipe, '#', stack, '|', InfiLibrary.workedIronRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(steelSteelIceAxe), recipe, '#', stack, '|', InfiLibrary.steelRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(cobaltSteelIceAxe), recipe, '#', stack, '|', InfiLibrary.cobaltRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(arditeSteelIceAxe), recipe, '#', stack, '|', InfiLibrary.arditeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(uraniumSteelIceAxe), recipe, '#', stack, '|', InfiLibrary.uraniumRod ) );
	}

	public static void addCobaltTools(String stack)
	{
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(woodCobaltIceAxe), recipe, '#', stack, '|', Item.stick ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(stoneCobaltIceAxe), recipe, '#', stack, '|', InfiLibrary.stoneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(ironCobaltIceAxe), recipe, '#', stack, '|', InfiLibrary.ironRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(diamondCobaltIceAxe), recipe, '#', stack, '|', InfiLibrary.diamondRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(redstoneCobaltIceAxe), recipe, '#', stack, '|', InfiLibrary.redstoneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(obsidianCobaltIceAxe), recipe, '#', stack, '|', InfiLibrary.obsidianRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(boneCobaltIceAxe), recipe, '#', stack, '|', Item.bone ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(boneCobaltIceAxe), recipe, '#', stack, '|', InfiLibrary.boneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(slimeCobaltIceAxe), recipe, '#', stack, '|', InfiLibrary.slimeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(cactusCobaltIceAxe), recipe, '#', stack, '|', InfiLibrary.cactusRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(blazeCobaltIceAxe), recipe, '#', stack, '|', Item.blazeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(copperCobaltIceAxe), recipe, '#', stack, '|', InfiLibrary.copperRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(bronzeCobaltIceAxe), recipe, '#', stack, '|', InfiLibrary.bronzeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(workedCobaltIceAxe), recipe, '#', stack, '|', InfiLibrary.workedIronRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(steelCobaltIceAxe), recipe, '#', stack, '|', InfiLibrary.steelRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(cobaltCobaltIceAxe), recipe, '#', stack, '|', InfiLibrary.cobaltRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(arditeCobaltIceAxe), recipe, '#', stack, '|', InfiLibrary.arditeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(manyullynCobaltIceAxe), recipe, '#', stack, '|', InfiLibrary.manyullynRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(uraniumCobaltIceAxe), recipe, '#', stack, '|', InfiLibrary.uraniumRod ) );
	}

	public static void addArditeTools(String stack)
	{
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(woodArditeIceAxe), recipe, '#', stack, '|', Item.stick ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(stoneArditeIceAxe), recipe, '#', stack, '|', InfiLibrary.stoneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(ironArditeIceAxe), recipe, '#', stack, '|', InfiLibrary.ironRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(diamondArditeIceAxe), recipe, '#', stack, '|', InfiLibrary.diamondRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(redstoneArditeIceAxe), recipe, '#', stack, '|', InfiLibrary.redstoneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(obsidianArditeIceAxe), recipe, '#', stack, '|', InfiLibrary.obsidianRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(boneArditeIceAxe), recipe, '#', stack, '|', Item.bone ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(boneArditeIceAxe), recipe, '#', stack, '|', InfiLibrary.boneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(slimeArditeIceAxe), recipe, '#', stack, '|', InfiLibrary.slimeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(cactusArditeIceAxe), recipe, '#', stack, '|', InfiLibrary.cactusRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(blazeArditeIceAxe), recipe, '#', stack, '|', Item.blazeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(copperArditeIceAxe), recipe, '#', stack, '|', InfiLibrary.copperRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(bronzeArditeIceAxe), recipe, '#', stack, '|', InfiLibrary.bronzeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(workedArditeIceAxe), recipe, '#', stack, '|', InfiLibrary.workedIronRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(steelArditeIceAxe), recipe, '#', stack, '|', InfiLibrary.steelRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(cobaltArditeIceAxe), recipe, '#', stack, '|', InfiLibrary.cobaltRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(arditeArditeIceAxe), recipe, '#', stack, '|', InfiLibrary.arditeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(manyullynArditeIceAxe), recipe, '#', stack, '|', InfiLibrary.manyullynRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(uraniumArditeIceAxe), recipe, '#', stack, '|', InfiLibrary.uraniumRod ) );
	}

	public static void addManyullynTools(String stack)
	{
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(woodManyullynIceAxe), recipe, '#', stack, '|', Item.stick ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(stoneManyullynIceAxe), recipe, '#', stack, '|', InfiLibrary.stoneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(ironManyullynIceAxe), recipe, '#', stack, '|', InfiLibrary.ironRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(diamondManyullynIceAxe), recipe, '#', stack, '|', InfiLibrary.diamondRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(redstoneManyullynIceAxe), recipe, '#', stack, '|', InfiLibrary.redstoneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(obsidianManyullynIceAxe), recipe, '#', stack, '|', InfiLibrary.obsidianRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(boneManyullynIceAxe), recipe, '#', stack, '|', Item.bone ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(boneManyullynIceAxe), recipe, '#', stack, '|', InfiLibrary.boneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(slimeManyullynIceAxe), recipe, '#', stack, '|', InfiLibrary.slimeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(cactusManyullynIceAxe), recipe, '#', stack, '|', InfiLibrary.cactusRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(blazeManyullynIceAxe), recipe, '#', stack, '|', Item.blazeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(copperManyullynIceAxe), recipe, '#', stack, '|', InfiLibrary.copperRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(bronzeManyullynIceAxe), recipe, '#', stack, '|', InfiLibrary.bronzeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(workedManyullynIceAxe), recipe, '#', stack, '|', InfiLibrary.workedIronRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(steelManyullynIceAxe), recipe, '#', stack, '|', InfiLibrary.steelRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(cobaltManyullynIceAxe), recipe, '#', stack, '|', InfiLibrary.cobaltRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(arditeManyullynIceAxe), recipe, '#', stack, '|', InfiLibrary.arditeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(manyullynManyullynIceAxe), recipe, '#', stack, '|', InfiLibrary.manyullynRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(uraniumManyullynIceAxe), recipe, '#', stack, '|', InfiLibrary.uraniumRod ) );
	}

	public static void addUraniumTools(String stack)
	{
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(diamondUraniumIceAxe), recipe, '#', stack, '|', InfiLibrary.diamondRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(redstoneUraniumIceAxe), recipe, '#', stack, '|', InfiLibrary.redstoneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(boneUraniumIceAxe), recipe, '#', stack, '|', Item.bone ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(boneUraniumIceAxe), recipe, '#', stack, '|', InfiLibrary.boneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(netherrackUraniumIceAxe), recipe, '#', stack, '|', InfiLibrary.netherrackRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(glowstoneUraniumIceAxe), recipe, '#', stack, '|', InfiLibrary.glowstoneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(lavaUraniumIceAxe), recipe, '#', stack, '|', InfiLibrary.lavaRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(blazeUraniumIceAxe), recipe, '#', stack, '|', Item.blazeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(cobaltUraniumIceAxe), recipe, '#', stack, '|', InfiLibrary.cobaltRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(arditeUraniumIceAxe), recipe, '#', stack, '|', InfiLibrary.arditeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(uraniumUraniumIceAxe), recipe, '#', stack, '|', InfiLibrary.uraniumRod ) );
	}
    
	public static Item woodWoodIceAxe;
	public static Item sandstoneWoodIceAxe;
	public static Item boneWoodIceAxe;
	public static Item paperWoodIceAxe;
	public static Item iceWoodIceAxe;
	public static Item slimeWoodIceAxe;
	public static Item cactusWoodIceAxe;
	
	public static Item woodStoneIceAxe;
	public static Item stoneStoneIceAxe;
	public static Item sandstoneStoneIceAxe;
	public static Item boneStoneIceAxe;
	public static Item netherrackStoneIceAxe;
	public static Item iceStoneIceAxe;
	public static Item slimeStoneIceAxe;
	public static Item cactusStoneIceAxe;
	public static Item flintStoneIceAxe;
	
	public static Item woodIronIceAxe;
	public static Item stoneIronIceAxe;
	public static Item ironIronIceAxe;
	public static Item boneIronIceAxe;
	public static Item netherrackIronIceAxe;
	public static Item glowstoneIronIceAxe;
	public static Item cactusIronIceAxe;
	public static Item copperIronIceAxe;
	public static Item bronzeIronIceAxe;
	
	public static Item woodDiamondIceAxe;
	public static Item stoneDiamondIceAxe;
	public static Item ironDiamondIceAxe;
	public static Item diamondDiamondIceAxe;
	public static Item redstoneDiamondIceAxe;
	public static Item obsidianDiamondIceAxe;
	public static Item boneDiamondIceAxe;
	public static Item mossyDiamondIceAxe;
	public static Item netherrackDiamondIceAxe;
	public static Item glowstoneDiamondIceAxe;
	public static Item lavaDiamondIceAxe;
	public static Item cactusDiamondIceAxe;
	public static Item flintDiamondIceAxe;
	public static Item blazeDiamondIceAxe;
	public static Item copperDiamondIceAxe;
	public static Item bronzeDiamondIceAxe;
	public static Item workedDiamondIceAxe;
	public static Item steelDiamondIceAxe;
	public static Item cobaltDiamondIceAxe;
	public static Item arditeDiamondIceAxe;
	public static Item manyullynDiamondIceAxe;
	public static Item uraniumDiamondIceAxe;
	
	public static Item woodRedstoneIceAxe;
	public static Item stoneRedstoneIceAxe;
	public static Item ironRedstoneIceAxe;
	public static Item redstoneRedstoneIceAxe;
	public static Item obsidianRedstoneIceAxe;
	public static Item sandstoneRedstoneIceAxe;
	public static Item boneRedstoneIceAxe;
	public static Item paperRedstoneIceAxe;
	public static Item mossyRedstoneIceAxe;
	public static Item netherrackRedstoneIceAxe;
	public static Item glowstoneRedstoneIceAxe;
	public static Item iceRedstoneIceAxe;
	public static Item lavaRedstoneIceAxe;
	public static Item slimeRedstoneIceAxe;
	public static Item cactusRedstoneIceAxe;
	public static Item flintRedstoneIceAxe;
	public static Item copperRedstoneIceAxe;
	public static Item bronzeRedstoneIceAxe;
	public static Item workedRedstoneIceAxe;
	public static Item uraniumRedstoneIceAxe;
	
	public static Item woodObsidianIceAxe;
	public static Item stoneObsidianIceAxe;
	public static Item redstoneObsidianIceAxe;
	public static Item obsidianObsidianIceAxe;
	public static Item boneObsidianIceAxe;
	public static Item netherrackObsidianIceAxe;
	public static Item glowstoneObsidianIceAxe;
	public static Item iceObsidianIceAxe;
	public static Item lavaObsidianIceAxe;
	public static Item cactusObsidianIceAxe;
	
	public static Item woodSandstoneIceAxe;
	public static Item sandstoneSandstoneIceAxe;
	public static Item boneSandstoneIceAxe;
	public static Item netherrackSandstoneIceAxe;
	public static Item iceSandstoneIceAxe;
	public static Item slimeSandstoneIceAxe;
	public static Item cactusSandstoneIceAxe;
	public static Item flintSandstoneIceAxe;
	
	public static Item woodBoneIceAxe;
	public static Item stoneBoneIceAxe;
	public static Item sandstoneBoneIceAxe;
	public static Item boneBoneIceAxe;
	public static Item paperBoneIceAxe;
	public static Item netherrackBoneIceAxe;
	public static Item iceBoneIceAxe;
	public static Item cactusBoneIceAxe;
	public static Item flintBoneIceAxe;
	
	public static Item woodPaperIceAxe;
	public static Item bonePaperIceAxe;
	public static Item paperPaperIceAxe;
	public static Item slimePaperIceAxe;
	public static Item cactusPaperIceAxe;
	
	public static Item woodMossyIceAxe;
	public static Item stoneMossyIceAxe;
	public static Item diamondMossyIceAxe;
	public static Item redstoneMossyIceAxe;
	public static Item boneMossyIceAxe;
	public static Item mossyMossyIceAxe;
	public static Item netherrackMossyIceAxe;
	public static Item glowstoneMossyIceAxe;
	public static Item cactusMossyIceAxe;
	public static Item blazeMossyIceAxe;
	public static Item manyullynMossyIceAxe;
	public static Item uraniumMossyIceAxe;
	
	public static Item woodNetherrackIceAxe;
	public static Item stoneNetherrackIceAxe;
	public static Item sandstoneNetherrackIceAxe;
	public static Item boneNetherrackIceAxe;
	public static Item paperNetherrackIceAxe;
	public static Item mossyNetherrackIceAxe;
	public static Item netherrackNetherrackIceAxe;
	public static Item iceNetherrackIceAxe;
	public static Item slimeNetherrackIceAxe;
	public static Item cactusNetherrackIceAxe;
	public static Item flintNetherrackIceAxe;
	public static Item copperNetherrackIceAxe;
	public static Item bronzeNetherrackIceAxe;
	
	public static Item woodGlowstoneIceAxe;
	public static Item redstoneGlowstoneIceAxe;
	public static Item obsidianGlowstoneIceAxe;
	public static Item boneGlowstoneIceAxe;
	public static Item netherrackGlowstoneIceAxe;
	public static Item glowstoneGlowstoneIceAxe;
	public static Item iceGlowstoneIceAxe;
	public static Item slimeGlowstoneIceAxe;
	public static Item cactusGlowstoneIceAxe;
	
	public static Item woodIceIceAxe;
	public static Item boneIceIceAxe;
	public static Item paperIceIceAxe;
	public static Item iceIceIceAxe;
	public static Item slimeIceIceAxe;
	public static Item cactusIceIceAxe;
	
	public static Item diamondLavaIceAxe;
	public static Item obsidianLavaIceAxe;
	public static Item netherrackLavaIceAxe;
	public static Item lavaLavaIceAxe;
	public static Item flintLavaIceAxe;
	public static Item blazeLavaIceAxe;
	public static Item manyullynLavaIceAxe;
	public static Item uraniumLavaIceAxe;
	
	public static Item woodSlimeIceAxe;
	public static Item sandstoneSlimeIceAxe;
	public static Item boneSlimeIceAxe;
	public static Item paperSlimeIceAxe;
	public static Item slimeSlimeIceAxe;
	public static Item cactusSlimeIceAxe;
	
	public static Item woodCactusIceAxe;
	public static Item sandstoneCactusIceAxe;
	public static Item boneCactusIceAxe;
	public static Item netherrackCactusIceAxe;
	public static Item iceCactusIceAxe;
	public static Item slimeCactusIceAxe;
	public static Item cactusCactusIceAxe;
	
	public static Item woodFlintIceAxe;
	public static Item stoneFlintIceAxe;
	public static Item sandstoneFlintIceAxe;
	public static Item boneFlintIceAxe;
	public static Item netherrackFlintIceAxe;
	public static Item slimeFlintIceAxe;
	public static Item cactusFlintIceAxe;
	public static Item flintFlintIceAxe;
	public static Item copperFlintIceAxe;
	public static Item bronzeFlintIceAxe;
	
	public static Item diamondBlazeIceAxe;
	public static Item obsidianBlazeIceAxe;
	public static Item netherrackBlazeIceAxe;
	public static Item lavaBlazeIceAxe;
	public static Item flintBlazeIceAxe;
	public static Item blazeBlazeIceAxe;
	public static Item manyullynBlazeIceAxe;
	public static Item uraniumBlazeIceAxe;
	
	public static Item woodCopperIceAxe;
	public static Item stoneCopperIceAxe;
    public static Item boneCopperIceAxe;
    public static Item netherrackCopperIceAxe;
    public static Item slimeCopperIceAxe;
    public static Item cactusCopperIceAxe;
    public static Item flintCopperIceAxe;
    public static Item copperCopperIceAxe;
    
    public static Item woodBronzeIceAxe;
    public static Item stoneBronzeIceAxe;
    public static Item boneBronzeIceAxe;
    public static Item netherrackBronzeIceAxe;
    public static Item slimeBronzeIceAxe;
    public static Item cactusBronzeIceAxe;
    public static Item flintBronzeIceAxe;
    public static Item copperBronzeIceAxe;
    public static Item bronzeBronzeIceAxe;
    
    public static Item woodWorkedIronIceAxe;
    public static Item stoneWorkedIronIceAxe;
    public static Item ironWorkedIronIceAxe;
    public static Item diamondWorkedIronIceAxe;
    public static Item redstoneWorkedIronIceAxe;
    public static Item obsidianWorkedIronIceAxe;
    public static Item boneWorkedIronIceAxe;
    public static Item netherrackWorkedIronIceAxe;
    public static Item glowstoneWorkedIronIceAxe;
    public static Item iceWorkedIronIceAxe;
    public static Item slimeWorkedIronIceAxe;
    public static Item cactusWorkedIronIceAxe;
    public static Item blazeWorkedIronIceAxe;
    public static Item copperWorkedIronIceAxe;
    public static Item bronzeWorkedIronIceAxe;
    public static Item workedWorkedIronIceAxe;
    public static Item steelWorkedIronIceAxe;
    public static Item uraniumWorkedIronIceAxe;
    
    public static Item woodSteelIceAxe;
    public static Item stoneSteelIceAxe;
    public static Item ironSteelIceAxe;
    public static Item diamondSteelIceAxe;
    public static Item redstoneSteelIceAxe;
    public static Item obsidianSteelIceAxe;
    public static Item boneSteelIceAxe;
    public static Item netherrackSteelIceAxe;
    public static Item glowstoneSteelIceAxe;
    public static Item iceSteelIceAxe;
    public static Item slimeSteelIceAxe;
    public static Item cactusSteelIceAxe;
    public static Item blazeSteelIceAxe;
    public static Item copperSteelIceAxe;
    public static Item bronzeSteelIceAxe;
    public static Item workedSteelIceAxe;
    public static Item steelSteelIceAxe;
    public static Item cobaltSteelIceAxe;
    public static Item arditeSteelIceAxe;
    public static Item uraniumSteelIceAxe;
    
    public static Item woodCobaltIceAxe;
    public static Item stoneCobaltIceAxe;
    public static Item ironCobaltIceAxe;
    public static Item diamondCobaltIceAxe;
    public static Item redstoneCobaltIceAxe;
    public static Item obsidianCobaltIceAxe;
    public static Item boneCobaltIceAxe;
    public static Item slimeCobaltIceAxe;
    public static Item cactusCobaltIceAxe;
    public static Item blazeCobaltIceAxe;
    public static Item copperCobaltIceAxe;
    public static Item bronzeCobaltIceAxe;
    public static Item workedCobaltIceAxe;
    public static Item steelCobaltIceAxe;
    public static Item cobaltCobaltIceAxe;
    public static Item arditeCobaltIceAxe;
    public static Item manyullynCobaltIceAxe;
    public static Item uraniumCobaltIceAxe;
    
    public static Item woodArditeIceAxe;
    public static Item stoneArditeIceAxe;
    public static Item ironArditeIceAxe;
    public static Item diamondArditeIceAxe;
    public static Item redstoneArditeIceAxe;
    public static Item obsidianArditeIceAxe;
    public static Item boneArditeIceAxe;
    public static Item slimeArditeIceAxe;
    public static Item cactusArditeIceAxe;
    public static Item blazeArditeIceAxe;
    public static Item copperArditeIceAxe;
    public static Item bronzeArditeIceAxe;
    public static Item workedArditeIceAxe;
    public static Item steelArditeIceAxe;
    public static Item cobaltArditeIceAxe;
    public static Item arditeArditeIceAxe;
    public static Item manyullynArditeIceAxe;
    public static Item uraniumArditeIceAxe;
    
    public static Item woodManyullynIceAxe;
    public static Item stoneManyullynIceAxe;
    public static Item ironManyullynIceAxe;
    public static Item diamondManyullynIceAxe;
    public static Item redstoneManyullynIceAxe;
    public static Item obsidianManyullynIceAxe;
    public static Item boneManyullynIceAxe;
    public static Item slimeManyullynIceAxe;
    public static Item cactusManyullynIceAxe;
    public static Item blazeManyullynIceAxe;
    public static Item copperManyullynIceAxe;
    public static Item bronzeManyullynIceAxe;
    public static Item workedManyullynIceAxe;
    public static Item steelManyullynIceAxe;
    public static Item cobaltManyullynIceAxe;
    public static Item arditeManyullynIceAxe;
    public static Item manyullynManyullynIceAxe;
    public static Item uraniumManyullynIceAxe;
    
    public static Item diamondUraniumIceAxe;
    public static Item redstoneUraniumIceAxe;
    public static Item boneUraniumIceAxe;
    public static Item netherrackUraniumIceAxe;
    public static Item glowstoneUraniumIceAxe;
    public static Item lavaUraniumIceAxe;
    public static Item blazeUraniumIceAxe;
    public static Item cobaltUraniumIceAxe;
    public static Item arditeUraniumIceAxe;
    public static Item uraniumUraniumIceAxe;
}
