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

public class Scythes 
{
    public static Scythes instance = new Scythes();
    
    private static String[] recipe = { "## ", " ||", " | " };
    
    public static Scythes getInstance()
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
    	woodWoodScythe = new InfiToolScythe(PHInfiHybrids.woodScytheID+0, 
                InfiMaterialEnum.Wood, InfiMaterialEnum.Wood, "woodWoodScythe");
    	woodStoneScythe = new InfiToolScythe(PHInfiHybrids.stoneScytheID+0, 
                InfiMaterialEnum.Stone, InfiMaterialEnum.Wood, "woodStoneScythe");
    	woodIronScythe = new InfiToolScythe(PHInfiHybrids.ironScytheID+0, 
                InfiMaterialEnum.Iron, InfiMaterialEnum.Wood, "woodIronScythe");
    	woodDiamondScythe = new InfiToolScythe(PHInfiHybrids.diamondScytheID+0, 
                InfiMaterialEnum.Diamond, InfiMaterialEnum.Wood, "woodDiamondScythe");
    	
    	MinecraftForge.setToolClass(woodWoodScythe, "Scythe", InfiMaterialEnum.Wood.getHarvestLevel());
    	MinecraftForge.setToolClass(woodStoneScythe, "Scythe", InfiMaterialEnum.Stone.getHarvestLevel());
    	MinecraftForge.setToolClass(woodIronScythe, "Scythe", InfiMaterialEnum.Iron.getHarvestLevel());
    	MinecraftForge.setToolClass(woodDiamondScythe, "Scythe", InfiMaterialEnum.Diamond.getHarvestLevel());
    	
    	ModLoader.addName(woodWoodScythe, "Wooden Scythe");
    }
    
    private static void registerVanillaRecipes()
    {
    	ModLoader.addRecipe(new ItemStack(woodWoodScythe), new Object[] 
                { recipe, '#', Block.planks, '|', Item.stick, 's', Item.stick });
		ModLoader.addRecipe(new ItemStack(woodStoneScythe), new Object[] 
                { recipe, '#', Block.cobblestone, '|', Item.stick, 's', InfiLibrary.stoneShard });
		ModLoader.addRecipe(new ItemStack(woodIronScythe), new Object[] 
                { recipe, '#', Item.ingotIron, '|', Item.stick, 's', InfiLibrary.ironChunk });
		ModLoader.addRecipe(new ItemStack(woodDiamondScythe), new Object[] 
                { recipe, '#', Item.diamond, '|', Item.stick, 's', InfiLibrary.diamondShard });
    }
    
    private static void createTools()
    {
    	if(PHInfiHybrids.enableWoodTools)
    	{
    		woodWoodScythe = new InfiToolScythe(PHInfiHybrids.woodScytheID+0, 
                    InfiMaterialEnum.Wood, InfiMaterialEnum.Wood, "woodWoodScythe");
    		sandstoneWoodScythe = new InfiToolScythe(PHInfiHybrids.woodScytheID+1, 
                    InfiMaterialEnum.Wood, InfiMaterialEnum.Sandstone, "sandstoneWoodScythe");
    		boneWoodScythe = new InfiToolScythe(PHInfiHybrids.woodScytheID+2, 
                    InfiMaterialEnum.Wood, InfiMaterialEnum.Bone, "boneWoodScythe");
    		paperWoodScythe = new InfiToolScythe(PHInfiHybrids.woodScytheID+3, 
                    InfiMaterialEnum.Wood, InfiMaterialEnum.Paper, "paperWoodScythe");
    		iceWoodScythe = new InfiToolScythe(PHInfiHybrids.woodScytheID+4, 
                    InfiMaterialEnum.Wood, InfiMaterialEnum.Ice, "iceWoodScythe");
    		slimeWoodScythe = new InfiToolScythe(PHInfiHybrids.woodScytheID+5, 
                    InfiMaterialEnum.Wood, InfiMaterialEnum.Slime, "slimeWoodScythe");
    		cactusWoodScythe = new InfiToolScythe(PHInfiHybrids.woodScytheID+6, 
                    InfiMaterialEnum.Wood, InfiMaterialEnum.Cactus, "cactusWoodScythe");
    		
    		MinecraftForge.setToolClass(woodWoodScythe, "Scythe", InfiMaterialEnum.Wood.getHarvestLevel());
    		MinecraftForge.setToolClass(sandstoneWoodScythe, "Scythe", InfiMaterialEnum.Wood.getHarvestLevel());
    		MinecraftForge.setToolClass(boneWoodScythe, "Scythe", InfiMaterialEnum.Wood.getHarvestLevel());
    		MinecraftForge.setToolClass(paperWoodScythe, "Scythe", InfiMaterialEnum.Wood.getHarvestLevel());
    		MinecraftForge.setToolClass(iceWoodScythe, "Scythe", InfiMaterialEnum.Wood.getHarvestLevel());
    		MinecraftForge.setToolClass(slimeWoodScythe, "Scythe", InfiMaterialEnum.Wood.getHarvestLevel());
    		MinecraftForge.setToolClass(cactusWoodScythe, "Scythe", InfiMaterialEnum.Wood.getHarvestLevel());
    	}

        if(PHInfiHybrids.enableStoneTools)
        {
        	woodStoneScythe = new InfiToolScythe(PHInfiHybrids.stoneScytheID+0, 
                    InfiMaterialEnum.Stone, InfiMaterialEnum.Wood, "woodStoneScythe");
        	stoneStoneScythe = new InfiToolScythe(PHInfiHybrids.stoneScytheID+1, 
                    InfiMaterialEnum.Stone, InfiMaterialEnum.Stone, "stoneStoneScythe");
        	sandstoneStoneScythe = new InfiToolScythe(PHInfiHybrids.stoneScytheID+2, 
                    InfiMaterialEnum.Stone, InfiMaterialEnum.Sandstone, "sandstoneStoneScythe");
        	boneStoneScythe = new InfiToolScythe(PHInfiHybrids.stoneScytheID+3, 
                    InfiMaterialEnum.Stone, InfiMaterialEnum.Bone, "boneStoneScythe");
        	netherrackStoneScythe = new InfiToolScythe(PHInfiHybrids.stoneScytheID+4, 
                    InfiMaterialEnum.Stone, InfiMaterialEnum.Netherrack, "netherrackStoneScythe");
        	iceStoneScythe = new InfiToolScythe(PHInfiHybrids.stoneScytheID+5, 
                    InfiMaterialEnum.Stone, InfiMaterialEnum.Ice, "iceStoneScythe");
        	slimeStoneScythe = new InfiToolScythe(PHInfiHybrids.stoneScytheID+6, 
                    InfiMaterialEnum.Stone, InfiMaterialEnum.Slime, "slimeStoneScythe");
        	cactusStoneScythe = new InfiToolScythe(PHInfiHybrids.stoneScytheID+7, 
                    InfiMaterialEnum.Stone, InfiMaterialEnum.Cactus, "cactusStoneScythe");
        	flintStoneScythe = new InfiToolScythe(PHInfiHybrids.stoneScytheID+8, 
                    InfiMaterialEnum.Stone, InfiMaterialEnum.Flint, "flintStoneScythe");
            
            MinecraftForge.setToolClass(woodStoneScythe, "Scythe", InfiMaterialEnum.Stone.getHarvestLevel());
            MinecraftForge.setToolClass(stoneStoneScythe, "Scythe", InfiMaterialEnum.Stone.getHarvestLevel());
            MinecraftForge.setToolClass(sandstoneStoneScythe, "Scythe", InfiMaterialEnum.Stone.getHarvestLevel());
            MinecraftForge.setToolClass(boneStoneScythe, "Scythe", InfiMaterialEnum.Stone.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackStoneScythe, "Scythe", InfiMaterialEnum.Stone.getHarvestLevel());
            MinecraftForge.setToolClass(iceStoneScythe, "Scythe", InfiMaterialEnum.Stone.getHarvestLevel());
            MinecraftForge.setToolClass(slimeStoneScythe, "Scythe", InfiMaterialEnum.Stone.getHarvestLevel());
            MinecraftForge.setToolClass(cactusStoneScythe, "Scythe", InfiMaterialEnum.Stone.getHarvestLevel());
            MinecraftForge.setToolClass(flintStoneScythe, "Scythe", InfiMaterialEnum.Stone.getHarvestLevel());
        }
        
        if(PHInfiHybrids.enableIronTools)
        {
        	woodIronScythe = new InfiToolScythe(PHInfiHybrids.ironScytheID+0, 
                    InfiMaterialEnum.Iron, InfiMaterialEnum.Wood, "woodIronScythe");
        	stoneIronScythe = new InfiToolScythe(PHInfiHybrids.ironScytheID+1, 
                    InfiMaterialEnum.Iron, InfiMaterialEnum.Stone, "stoneIronScythe");
        	ironIronScythe = new InfiToolScythe(PHInfiHybrids.ironScytheID+2, 
                    InfiMaterialEnum.Iron, InfiMaterialEnum.Iron, "ironIronScythe");
        	boneIronScythe = new InfiToolScythe(PHInfiHybrids.ironScytheID+3, 
                    InfiMaterialEnum.Iron, InfiMaterialEnum.Bone, "boneIronScythe");
        	netherrackIronScythe = new InfiToolScythe(PHInfiHybrids.ironScytheID+4, 
                    InfiMaterialEnum.Iron, InfiMaterialEnum.Netherrack, "netherrackIronScythe");
        	glowstoneIronScythe = new InfiToolScythe(PHInfiHybrids.ironScytheID+5, 
                    InfiMaterialEnum.Iron, InfiMaterialEnum.Glowstone, "glowstoneIronScythe");
        	cactusIronScythe = new InfiToolScythe(PHInfiHybrids.ironScytheID+6, 
                    InfiMaterialEnum.Iron, InfiMaterialEnum.Cactus, "cactusIronScythe");
        	copperIronScythe = new InfiToolScythe(PHInfiHybrids.ironScytheID+7, 
                    InfiMaterialEnum.Iron, InfiMaterialEnum.Copper, "copperIronScythe");
        	bronzeIronScythe = new InfiToolScythe(PHInfiHybrids.ironScytheID+8, 
                    InfiMaterialEnum.Iron, InfiMaterialEnum.Bronze, "bronzeIronScythe");
            
            MinecraftForge.setToolClass(woodIronScythe, "Scythe", InfiMaterialEnum.Iron.getHarvestLevel());
            MinecraftForge.setToolClass(stoneIronScythe, "Scythe", InfiMaterialEnum.Iron.getHarvestLevel());
            MinecraftForge.setToolClass(ironIronScythe, "Scythe", InfiMaterialEnum.Iron.getHarvestLevel());
            MinecraftForge.setToolClass(boneIronScythe, "Scythe", InfiMaterialEnum.Iron.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackIronScythe, "Scythe", InfiMaterialEnum.Iron.getHarvestLevel());
            MinecraftForge.setToolClass(glowstoneIronScythe, "Scythe", InfiMaterialEnum.Iron.getHarvestLevel());
            MinecraftForge.setToolClass(cactusIronScythe, "Scythe", InfiMaterialEnum.Iron.getHarvestLevel());
            MinecraftForge.setToolClass(copperIronScythe, "Scythe", InfiMaterialEnum.Iron.getHarvestLevel());
            MinecraftForge.setToolClass(bronzeIronScythe, "Scythe", InfiMaterialEnum.Iron.getHarvestLevel());
        }
        
        if(PHInfiHybrids.enableDiamondTools)
        {
        	woodDiamondScythe = new InfiToolScythe(PHInfiHybrids.diamondScytheID+0, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Wood, "woodDiamondScythe");
        	stoneDiamondScythe = new InfiToolScythe(PHInfiHybrids.diamondScytheID+1, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Stone, "stoneDiamondScythe");
        	ironDiamondScythe = new InfiToolScythe(PHInfiHybrids.diamondScytheID+2, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Iron, "ironDiamondScythe");
        	diamondDiamondScythe = new InfiToolScythe(PHInfiHybrids.diamondScytheID+3, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Diamond, "diamondDiamondScythe");
        	redstoneDiamondScythe = new InfiToolScythe(PHInfiHybrids.diamondScytheID+4, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Redstone, "redstoneDiamondScythe");
        	obsidianDiamondScythe = new InfiToolScythe(PHInfiHybrids.diamondScytheID+5, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Obsidian, "obsidianDiamondScythe");
        	boneDiamondScythe = new InfiToolScythe(PHInfiHybrids.diamondScytheID+6, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Bone, "boneDiamondScythe");
        	mossyDiamondScythe = new InfiToolScythe(PHInfiHybrids.diamondScytheID+7, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Mossy, "mossyDiamondScythe");
        	netherrackDiamondScythe = new InfiToolScythe(PHInfiHybrids.diamondScytheID+8, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Netherrack, "netherrackDiamondScythe");
        	glowstoneDiamondScythe = new InfiToolScythe(PHInfiHybrids.diamondScytheID+9, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Glowstone, "glowstoneDiamondScythe");
        	lavaDiamondScythe = new InfiToolScythe(PHInfiHybrids.diamondScytheID+10, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Lava, "lavaDiamondScythe");
        	cactusDiamondScythe = new InfiToolScythe(PHInfiHybrids.diamondScytheID+11, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Cactus, "cactusDiamondScythe");
        	flintDiamondScythe = new InfiToolScythe(PHInfiHybrids.diamondScytheID+12, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Flint, "flintDiamondScythe");
        	blazeDiamondScythe = new InfiToolScythe(PHInfiHybrids.diamondScytheID+13, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Blaze, "blazeDiamondScythe");
            copperDiamondScythe = new InfiToolScythe(PHInfiHybrids.diamondScytheID+14, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Copper, "copperDiamondScythe");
            bronzeDiamondScythe = new InfiToolScythe(PHInfiHybrids.diamondScytheID+15, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Bronze, "bronzeDiamondScythe");
            workedDiamondScythe = new InfiToolScythe(PHInfiHybrids.diamondScytheID+16, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.WorkedIron, "workedDiamondScythe");
            steelDiamondScythe = new InfiToolScythe(PHInfiHybrids.diamondScytheID+17, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Steel, "steelDiamondScythe");
            cobaltDiamondScythe = new InfiToolScythe(PHInfiHybrids.diamondScytheID+18, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Cobalt, "cobaltDiamondScythe");
            arditeDiamondScythe = new InfiToolScythe(PHInfiHybrids.diamondScytheID+19, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Ardite, "arditeDiamondScythe");
            manyullynDiamondScythe = new InfiToolScythe(PHInfiHybrids.diamondScytheID+20, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Manyullyn, "manyullynDiamondScythe");
            uraniumDiamondScythe = new InfiToolScythe(PHInfiHybrids.diamondScytheID+21, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Uranium, "uraniumDiamondScythe");
            
            MinecraftForge.setToolClass(woodDiamondScythe, "Scythe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(stoneDiamondScythe, "Scythe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(ironDiamondScythe, "Scythe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(diamondDiamondScythe, "Scythe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(redstoneDiamondScythe, "Scythe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(obsidianDiamondScythe, "Scythe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(boneDiamondScythe, "Scythe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(mossyDiamondScythe, "Scythe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackDiamondScythe, "Scythe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(glowstoneDiamondScythe, "Scythe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(lavaDiamondScythe, "Scythe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(cactusDiamondScythe, "Scythe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(flintDiamondScythe, "Scythe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(blazeDiamondScythe, "Scythe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(copperDiamondScythe, "Scythe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(bronzeDiamondScythe, "Scythe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(workedDiamondScythe, "Scythe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(steelDiamondScythe, "Scythe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(cobaltDiamondScythe, "Scythe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(arditeDiamondScythe, "Scythe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(manyullynDiamondScythe, "Scythe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(uraniumDiamondScythe, "Scythe", InfiMaterialEnum.Diamond.getHarvestLevel());
        }
        
        if(PHInfiHybrids.enableRedstoneTools)
        {
        	woodRedstoneScythe = new InfiToolScythe(PHInfiHybrids.redstoneScytheID+0, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Wood, "woodRedstoneScythe");
        	stoneRedstoneScythe = new InfiToolScythe(PHInfiHybrids.redstoneScytheID+1, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Stone, "stoneRedstoneScythe");
        	ironRedstoneScythe = new InfiToolScythe(PHInfiHybrids.redstoneScytheID+2, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Iron, "ironRedstoneScythe");
        	redstoneRedstoneScythe = new InfiToolScythe(PHInfiHybrids.redstoneScytheID+3, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Redstone, "redstoneRedstoneScythe");
        	obsidianRedstoneScythe = new InfiToolScythe(PHInfiHybrids.redstoneScytheID+4, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Obsidian, "obsidianRedstoneScythe");
        	sandstoneRedstoneScythe = new InfiToolScythe(PHInfiHybrids.redstoneScytheID+5, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Sandstone, "sandstoneRedstoneScythe");
        	boneRedstoneScythe = new InfiToolScythe(PHInfiHybrids.redstoneScytheID+6, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Bone, "boneRedstoneScythe");
        	paperRedstoneScythe = new InfiToolScythe(PHInfiHybrids.redstoneScytheID+7, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Paper, "paperRedstoneScythe");
        	mossyRedstoneScythe = new InfiToolScythe(PHInfiHybrids.redstoneScytheID+8, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Mossy, "mossyRedstoneScythe");
        	netherrackRedstoneScythe = new InfiToolScythe(PHInfiHybrids.redstoneScytheID+9, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Netherrack, "netherrackRedstoneScythe");
        	glowstoneRedstoneScythe = new InfiToolScythe(PHInfiHybrids.redstoneScytheID+10, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Glowstone, "glowstoneRedstoneScythe");
        	iceRedstoneScythe = new InfiToolScythe(PHInfiHybrids.redstoneScytheID+11, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Ice, "iceRedstoneScythe");
        	lavaRedstoneScythe = new InfiToolScythe(PHInfiHybrids.redstoneScytheID+12,
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Lava, "lavaRedstoneScythe");
        	slimeRedstoneScythe = new InfiToolScythe(PHInfiHybrids.redstoneScytheID+13,
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Slime, "slimeRedstoneScythe");
        	cactusRedstoneScythe = new InfiToolScythe(PHInfiHybrids.redstoneScytheID+14,
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Cactus, "cactusRedstoneScythe");
        	flintRedstoneScythe = new InfiToolScythe(PHInfiHybrids.redstoneScytheID+15,
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Flint, "flintRedstoneScythe");
        	copperRedstoneScythe = new InfiToolScythe(PHInfiHybrids.redstoneScytheID+16,
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Copper, "copperRedstoneScythe");
        	bronzeRedstoneScythe = new InfiToolScythe(PHInfiHybrids.redstoneScytheID+17,
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Bronze, "bronzeRedstoneScythe");
        	workedRedstoneScythe = new InfiToolScythe(PHInfiHybrids.redstoneScytheID+18,
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.WorkedIron, "workedRedstoneScythe");
        	uraniumRedstoneScythe = new InfiToolScythe(PHInfiHybrids.redstoneScytheID+19,
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Uranium, "uraniumRedstoneScythe");
            
            MinecraftForge.setToolClass(woodRedstoneScythe, "Scythe", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(stoneRedstoneScythe, "Scythe", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(ironRedstoneScythe, "Scythe", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(redstoneRedstoneScythe, "Scythe", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(obsidianRedstoneScythe, "Scythe", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(sandstoneRedstoneScythe, "Scythe", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(boneRedstoneScythe, "Scythe", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(paperRedstoneScythe, "Scythe", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(mossyRedstoneScythe, "Scythe", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackRedstoneScythe, "Scythe", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(glowstoneRedstoneScythe, "Scythe", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(iceRedstoneScythe, "Scythe", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(lavaRedstoneScythe, "Scythe", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(slimeRedstoneScythe, "Scythe", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(cactusRedstoneScythe, "Scythe", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(flintRedstoneScythe, "Scythe", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(copperRedstoneScythe, "Scythe", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(bronzeRedstoneScythe, "Scythe", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(workedRedstoneScythe, "Scythe", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(uraniumRedstoneScythe, "Scythe", InfiMaterialEnum.Redstone.getHarvestLevel());
        }
        
        if(PHInfiHybrids.enableObsidianTools)
        {
        	woodObsidianScythe = new InfiToolScythe(PHInfiHybrids.obsidianScytheID+0, 
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Wood, "woodObsidianScythe");
        	stoneObsidianScythe = new InfiToolScythe(PHInfiHybrids.obsidianScytheID+1, 
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Stone, "stoneObsidianScythe");
        	redstoneObsidianScythe = new InfiToolScythe(PHInfiHybrids.obsidianScytheID+2, 
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Redstone, "redstoneObsidianScythe");
        	obsidianObsidianScythe = new InfiToolScythe(PHInfiHybrids.obsidianScytheID+3, 
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Obsidian, "obsidianObsidianScythe");;
        	boneObsidianScythe = new InfiToolScythe(PHInfiHybrids.obsidianScytheID+4, 
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Bone, "boneObsidianScythe");
        	netherrackObsidianScythe = new InfiToolScythe(PHInfiHybrids.obsidianScytheID+5, 
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Netherrack, "netherrackObsidianScythe");
        	glowstoneObsidianScythe = new InfiToolScythe(PHInfiHybrids.obsidianScytheID+6, 
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Glowstone, "glowstoneObsidianScythe");
        	iceObsidianScythe = new InfiToolScythe(PHInfiHybrids.obsidianScytheID+7, 
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Ice, "iceObsidianScythe");
        	lavaObsidianScythe = new InfiToolScythe(PHInfiHybrids.obsidianScytheID+8,
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Lava, "lavaObsidianScythe");
        	cactusObsidianScythe = new InfiToolScythe(PHInfiHybrids.obsidianScytheID+9,
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Cactus, "cactusObsidianScythe");
            
            MinecraftForge.setToolClass(woodObsidianScythe, "Scythe", InfiMaterialEnum.Obsidian.getHarvestLevel());
            MinecraftForge.setToolClass(stoneObsidianScythe, "Scythe", InfiMaterialEnum.Obsidian.getHarvestLevel());
            MinecraftForge.setToolClass(redstoneObsidianScythe, "Scythe", InfiMaterialEnum.Obsidian.getHarvestLevel());
            MinecraftForge.setToolClass(obsidianObsidianScythe, "Scythe", InfiMaterialEnum.Obsidian.getHarvestLevel());
            MinecraftForge.setToolClass(boneObsidianScythe, "Scythe", InfiMaterialEnum.Obsidian.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackObsidianScythe, "Scythe", InfiMaterialEnum.Obsidian.getHarvestLevel());
            MinecraftForge.setToolClass(glowstoneObsidianScythe, "Scythe", InfiMaterialEnum.Obsidian.getHarvestLevel());
            MinecraftForge.setToolClass(iceObsidianScythe, "Scythe", InfiMaterialEnum.Obsidian.getHarvestLevel());
            MinecraftForge.setToolClass(lavaObsidianScythe, "Scythe", InfiMaterialEnum.Obsidian.getHarvestLevel());
            MinecraftForge.setToolClass(cactusObsidianScythe, "Scythe", InfiMaterialEnum.Obsidian.getHarvestLevel());
        }
        
        if(PHInfiHybrids.enableSandstoneTools)
        {
        	woodSandstoneScythe = new InfiToolScythe(PHInfiHybrids.sandstoneScytheID+0, 
                    InfiMaterialEnum.Sandstone, InfiMaterialEnum.Wood, "woodSandstoneScythe");
        	sandstoneSandstoneScythe = new InfiToolScythe(PHInfiHybrids.sandstoneScytheID+1, 
                    InfiMaterialEnum.Sandstone, InfiMaterialEnum.Sandstone, "sandstoneSandstoneScythe");
        	boneSandstoneScythe = new InfiToolScythe(PHInfiHybrids.sandstoneScytheID+2, 
                    InfiMaterialEnum.Sandstone, InfiMaterialEnum.Bone, "boneSandstoneScythe");
        	netherrackSandstoneScythe = new InfiToolScythe(PHInfiHybrids.sandstoneScytheID+3, 
                    InfiMaterialEnum.Sandstone, InfiMaterialEnum.Netherrack, "netherrackSandstoneScythe");
        	iceSandstoneScythe = new InfiToolScythe(PHInfiHybrids.sandstoneScytheID+4, 
                    InfiMaterialEnum.Sandstone, InfiMaterialEnum.Ice, "iceSandstoneScythe");
        	slimeSandstoneScythe = new InfiToolScythe(PHInfiHybrids.sandstoneScytheID+5,
                    InfiMaterialEnum.Sandstone, InfiMaterialEnum.Slime, "slimeSandstoneScythe");
        	cactusSandstoneScythe = new InfiToolScythe(PHInfiHybrids.sandstoneScytheID+6,
                    InfiMaterialEnum.Sandstone, InfiMaterialEnum.Cactus, "cactusSandstoneScythe");
        	flintSandstoneScythe = new InfiToolScythe(PHInfiHybrids.sandstoneScytheID+7,
                    InfiMaterialEnum.Sandstone, InfiMaterialEnum.Flint, "flintSandstoneScythe");
            
            MinecraftForge.setToolClass(woodSandstoneScythe, "Scythe", InfiMaterialEnum.Sandstone.getHarvestLevel());
            MinecraftForge.setToolClass(sandstoneSandstoneScythe, "Scythe", InfiMaterialEnum.Sandstone.getHarvestLevel());
            MinecraftForge.setToolClass(boneSandstoneScythe, "Scythe", InfiMaterialEnum.Sandstone.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackSandstoneScythe, "Scythe", InfiMaterialEnum.Sandstone.getHarvestLevel());
            MinecraftForge.setToolClass(iceSandstoneScythe, "Scythe", InfiMaterialEnum.Sandstone.getHarvestLevel());
            MinecraftForge.setToolClass(slimeSandstoneScythe, "Scythe", InfiMaterialEnum.Sandstone.getHarvestLevel());
            MinecraftForge.setToolClass(cactusSandstoneScythe, "Scythe", InfiMaterialEnum.Sandstone.getHarvestLevel());
            MinecraftForge.setToolClass(flintSandstoneScythe, "Scythe", InfiMaterialEnum.Sandstone.getHarvestLevel());
        }
        
        if(PHInfiHybrids.enableBoneTools)
        {
        	woodBoneScythe = new InfiToolScythe(PHInfiHybrids.boneScytheID+0, 
                    InfiMaterialEnum.Bone, InfiMaterialEnum.Wood, "woodBoneScythe");
        	stoneBoneScythe = new InfiToolScythe(PHInfiHybrids.boneScytheID+1, 
                    InfiMaterialEnum.Bone, InfiMaterialEnum.Stone, "stoneBoneScythe");
        	sandstoneBoneScythe = new InfiToolScythe(PHInfiHybrids.boneScytheID+2, 
                    InfiMaterialEnum.Bone, InfiMaterialEnum.Sandstone, "sandstoneBoneScythe");
        	boneBoneScythe = new InfiToolScythe(PHInfiHybrids.boneScytheID+3, 
                    InfiMaterialEnum.Bone, InfiMaterialEnum.Bone, "boneBoneScythe");
        	paperBoneScythe = new InfiToolScythe(PHInfiHybrids.boneScytheID+4, 
                    InfiMaterialEnum.Bone, InfiMaterialEnum.Paper, "paperBoneScythe");
        	netherrackBoneScythe = new InfiToolScythe(PHInfiHybrids.boneScytheID+5, 
                    InfiMaterialEnum.Bone, InfiMaterialEnum.Netherrack, "netherrackBoneScythe");
        	iceBoneScythe = new InfiToolScythe(PHInfiHybrids.boneScytheID+6, 
                    InfiMaterialEnum.Bone, InfiMaterialEnum.Ice, "iceBoneScythe");
        	cactusBoneScythe = new InfiToolScythe(PHInfiHybrids.boneScytheID+7,
                    InfiMaterialEnum.Bone, InfiMaterialEnum.Cactus, "cactusBoneScythe");
        	flintBoneScythe = new InfiToolScythe(PHInfiHybrids.boneScytheID+8,
                    InfiMaterialEnum.Bone, InfiMaterialEnum.Flint, "flintBoneScythe");
            
            MinecraftForge.setToolClass(woodBoneScythe, "Scythe", InfiMaterialEnum.Bone.getHarvestLevel());
            MinecraftForge.setToolClass(stoneBoneScythe, "Scythe", InfiMaterialEnum.Bone.getHarvestLevel());
            MinecraftForge.setToolClass(sandstoneBoneScythe, "Scythe", InfiMaterialEnum.Bone.getHarvestLevel());
            MinecraftForge.setToolClass(boneBoneScythe, "Scythe", InfiMaterialEnum.Bone.getHarvestLevel());
            MinecraftForge.setToolClass(paperBoneScythe, "Scythe", InfiMaterialEnum.Bone.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackBoneScythe, "Scythe", InfiMaterialEnum.Bone.getHarvestLevel());
            MinecraftForge.setToolClass(iceBoneScythe, "Scythe", InfiMaterialEnum.Bone.getHarvestLevel());
            MinecraftForge.setToolClass(cactusBoneScythe, "Scythe", InfiMaterialEnum.Bone.getHarvestLevel());
            MinecraftForge.setToolClass(flintBoneScythe, "Scythe", InfiMaterialEnum.Bone.getHarvestLevel());
        }
        
        if(PHInfiHybrids.enablePaperTools)
        {
        	woodPaperScythe = new InfiToolScythe(PHInfiHybrids.paperScytheID+0, 
                    InfiMaterialEnum.Paper, InfiMaterialEnum.Wood, "woodPaperScythe");
        	bonePaperScythe = new InfiToolScythe(PHInfiHybrids.paperScytheID+1, 
                    InfiMaterialEnum.Paper, InfiMaterialEnum.Bone, "bonePaperScythe");
        	paperPaperScythe = new InfiToolScythe(PHInfiHybrids.paperScytheID+2, 
                    InfiMaterialEnum.Paper, InfiMaterialEnum.Paper, "paperPaperScythe");
        	slimePaperScythe = new InfiToolScythe(PHInfiHybrids.paperScytheID+3,
                    InfiMaterialEnum.Paper, InfiMaterialEnum.Slime, "slimePaperScythe");
        	cactusPaperScythe = new InfiToolScythe(PHInfiHybrids.paperScytheID+4,
                    InfiMaterialEnum.Paper, InfiMaterialEnum.Cactus, "cactusPaperScythe");
            
            MinecraftForge.setToolClass(woodPaperScythe, "Scythe", InfiMaterialEnum.Paper.getHarvestLevel());
            MinecraftForge.setToolClass(bonePaperScythe, "Scythe", InfiMaterialEnum.Paper.getHarvestLevel());
            MinecraftForge.setToolClass(paperPaperScythe, "Scythe", InfiMaterialEnum.Paper.getHarvestLevel());
            MinecraftForge.setToolClass(slimePaperScythe, "Scythe", InfiMaterialEnum.Paper.getHarvestLevel());
            MinecraftForge.setToolClass(cactusPaperScythe, "Scythe", InfiMaterialEnum.Paper.getHarvestLevel());
        }
        
        if(PHInfiHybrids.enableMossyTools)
        {
        	woodMossyScythe = new InfiToolScythe(PHInfiHybrids.mossyScytheID+0, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Wood, "woodMossyScythe");
        	stoneMossyScythe = new InfiToolScythe(PHInfiHybrids.mossyScytheID+1, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Stone, "stoneMossyScythe");
        	diamondMossyScythe = new InfiToolScythe(PHInfiHybrids.mossyScytheID+2, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Diamond, "diamondMossyScythe");
        	redstoneMossyScythe = new InfiToolScythe(PHInfiHybrids.mossyScytheID+3, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Redstone, "redstoneMossyScythe");
        	boneMossyScythe = new InfiToolScythe(PHInfiHybrids.mossyScytheID+4, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Bone, "boneMossyScythe");
        	mossyMossyScythe = new InfiToolScythe(PHInfiHybrids.mossyScytheID+5, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Mossy, "mossyMossyScythe");
        	netherrackMossyScythe = new InfiToolScythe(PHInfiHybrids.mossyScytheID+6, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Netherrack, "netherrackMossyScythe");
        	glowstoneMossyScythe = new InfiToolScythe(PHInfiHybrids.mossyScytheID+7, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Glowstone, "glowstoneMossyScythe");
        	cactusMossyScythe = new InfiToolScythe(PHInfiHybrids.mossyScytheID+8, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Cactus, "cactusMossyScythe");
        	blazeMossyScythe = new InfiToolScythe(PHInfiHybrids.mossyScytheID+9, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Blaze, "blazeMossyScythe");
        	manyullynMossyScythe = new InfiToolScythe(PHInfiHybrids.mossyScytheID+10, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Manyullyn, "manyullynMossyScythe");
        	uraniumMossyScythe = new InfiToolScythe(PHInfiHybrids.mossyScytheID+11, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Uranium, "uraniumMossyScythe");
            
            MinecraftForge.setToolClass(woodMossyScythe, "Scythe", InfiMaterialEnum.Mossy.getHarvestLevel());
            MinecraftForge.setToolClass(stoneMossyScythe, "Scythe", InfiMaterialEnum.Mossy.getHarvestLevel());
            MinecraftForge.setToolClass(diamondMossyScythe, "Scythe", InfiMaterialEnum.Mossy.getHarvestLevel());
            MinecraftForge.setToolClass(redstoneMossyScythe, "Scythe", InfiMaterialEnum.Mossy.getHarvestLevel());
            MinecraftForge.setToolClass(boneMossyScythe, "Scythe", InfiMaterialEnum.Mossy.getHarvestLevel());
            MinecraftForge.setToolClass(mossyMossyScythe, "Scythe", InfiMaterialEnum.Mossy.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackMossyScythe, "Scythe", InfiMaterialEnum.Mossy.getHarvestLevel());
            MinecraftForge.setToolClass(glowstoneMossyScythe, "Scythe", InfiMaterialEnum.Mossy.getHarvestLevel());
            MinecraftForge.setToolClass(cactusMossyScythe, "Scythe", InfiMaterialEnum.Mossy.getHarvestLevel());
            MinecraftForge.setToolClass(blazeMossyScythe, "Scythe", InfiMaterialEnum.Mossy.getHarvestLevel());
            MinecraftForge.setToolClass(manyullynMossyScythe, "Scythe", InfiMaterialEnum.Mossy.getHarvestLevel());
            MinecraftForge.setToolClass(uraniumMossyScythe, "Scythe", InfiMaterialEnum.Mossy.getHarvestLevel());
        }
        
        if(PHInfiHybrids.enableNetherrackTools)
        {
        	woodNetherrackScythe = new InfiToolScythe(PHInfiHybrids.netherrackScytheID+0, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Wood, "woodNetherrackScythe");
        	stoneNetherrackScythe = new InfiToolScythe(PHInfiHybrids.netherrackScytheID+1, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Stone, "stoneNetherrackScythe");
        	sandstoneNetherrackScythe = new InfiToolScythe(PHInfiHybrids.netherrackScytheID+2, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Sandstone, "sandstoneNetherrackScythe");
        	boneNetherrackScythe = new InfiToolScythe(PHInfiHybrids.netherrackScytheID+3, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Bone, "boneNetherrackScythe");
        	paperNetherrackScythe = new InfiToolScythe(PHInfiHybrids.netherrackScytheID+4, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Paper, "paperNetherrackScythe");
        	mossyNetherrackScythe = new InfiToolScythe(PHInfiHybrids.netherrackScytheID+5, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Mossy, "mossyNetherrackScythe");
        	netherrackNetherrackScythe = new InfiToolScythe(PHInfiHybrids.netherrackScytheID+6, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Netherrack, "netherrackNetherrackScythe");
        	iceNetherrackScythe = new InfiToolScythe(PHInfiHybrids.netherrackScytheID+7, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Ice, "iceNetherrackScythe");
        	slimeNetherrackScythe = new InfiToolScythe(PHInfiHybrids.netherrackScytheID+8, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Slime, "slimeNetherrackScythe");
        	cactusNetherrackScythe = new InfiToolScythe(PHInfiHybrids.netherrackScytheID+9, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Cactus, "cactusNetherrackScythe");
        	flintNetherrackScythe = new InfiToolScythe(PHInfiHybrids.netherrackScytheID+10, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Flint, "flintNetherrackScythe");
        	copperNetherrackScythe = new InfiToolScythe(PHInfiHybrids.netherrackScytheID+11, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Copper, "copperNetherrackScythe");
        	bronzeNetherrackScythe = new InfiToolScythe(PHInfiHybrids.netherrackScytheID+12, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Bronze, "bronzeNetherrackScythe");
            
            MinecraftForge.setToolClass(woodNetherrackScythe, "Scythe", InfiMaterialEnum.Netherrack.getHarvestLevel());
            MinecraftForge.setToolClass(stoneNetherrackScythe, "Scythe", InfiMaterialEnum.Netherrack.getHarvestLevel());
            MinecraftForge.setToolClass(sandstoneNetherrackScythe, "Scythe", InfiMaterialEnum.Netherrack.getHarvestLevel());
            MinecraftForge.setToolClass(boneNetherrackScythe, "Scythe", InfiMaterialEnum.Netherrack.getHarvestLevel());
            MinecraftForge.setToolClass(paperNetherrackScythe, "Scythe", InfiMaterialEnum.Netherrack.getHarvestLevel());
            MinecraftForge.setToolClass(mossyNetherrackScythe, "Scythe", InfiMaterialEnum.Netherrack.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackNetherrackScythe, "Scythe", InfiMaterialEnum.Netherrack.getHarvestLevel());
            MinecraftForge.setToolClass(iceNetherrackScythe, "Scythe", InfiMaterialEnum.Netherrack.getHarvestLevel());
            MinecraftForge.setToolClass(slimeNetherrackScythe, "Scythe", InfiMaterialEnum.Netherrack.getHarvestLevel());
            MinecraftForge.setToolClass(cactusNetherrackScythe, "Scythe", InfiMaterialEnum.Netherrack.getHarvestLevel());
            MinecraftForge.setToolClass(flintNetherrackScythe, "Scythe", InfiMaterialEnum.Netherrack.getHarvestLevel());
            MinecraftForge.setToolClass(copperNetherrackScythe, "Scythe", InfiMaterialEnum.Netherrack.getHarvestLevel());
            MinecraftForge.setToolClass(bronzeNetherrackScythe, "Scythe", InfiMaterialEnum.Netherrack.getHarvestLevel());
        }
        
        if(PHInfiHybrids.enableGlowstoneTools)
        {
        	woodGlowstoneScythe = new InfiToolScythe(PHInfiHybrids.glowstoneScytheID+0, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Wood, "woodGlowstoneScythe");
        	redstoneGlowstoneScythe = new InfiToolScythe(PHInfiHybrids.glowstoneScytheID+1, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Redstone, "redstoneGlowstoneScythe");
        	obsidianGlowstoneScythe = new InfiToolScythe(PHInfiHybrids.glowstoneScytheID+2, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Obsidian, "obsidianGlowstoneScythe");
        	boneGlowstoneScythe = new InfiToolScythe(PHInfiHybrids.glowstoneScytheID+3, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Bone, "boneGlowstoneScythe");
        	netherrackGlowstoneScythe = new InfiToolScythe(PHInfiHybrids.glowstoneScytheID+4, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Netherrack, "netherrackGlowstoneScythe");
        	glowstoneGlowstoneScythe = new InfiToolScythe(PHInfiHybrids.glowstoneScytheID+5, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Glowstone, "glowstoneGlowstoneScythe");
        	iceGlowstoneScythe = new InfiToolScythe(PHInfiHybrids.glowstoneScytheID+6, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Ice, "iceGlowstoneScythe");
        	slimeGlowstoneScythe = new InfiToolScythe(PHInfiHybrids.glowstoneScytheID+7, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Slime, "slimeGlowstoneScythe");
        	cactusGlowstoneScythe = new InfiToolScythe(PHInfiHybrids.glowstoneScytheID+8, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Cactus, "cactusGlowstoneScythe");
            
            
            MinecraftForge.setToolClass(woodGlowstoneScythe, "Scythe", InfiMaterialEnum.Glowstone.getHarvestLevel());
            MinecraftForge.setToolClass(redstoneGlowstoneScythe, "Scythe", InfiMaterialEnum.Glowstone.getHarvestLevel());
            MinecraftForge.setToolClass(obsidianGlowstoneScythe, "Scythe", InfiMaterialEnum.Glowstone.getHarvestLevel());
            MinecraftForge.setToolClass(boneGlowstoneScythe, "Scythe", InfiMaterialEnum.Glowstone.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackGlowstoneScythe, "Scythe", InfiMaterialEnum.Glowstone.getHarvestLevel());
            MinecraftForge.setToolClass(glowstoneGlowstoneScythe, "Scythe", InfiMaterialEnum.Glowstone.getHarvestLevel());
            MinecraftForge.setToolClass(iceGlowstoneScythe, "Scythe", InfiMaterialEnum.Glowstone.getHarvestLevel());
            MinecraftForge.setToolClass(slimeGlowstoneScythe, "Scythe", InfiMaterialEnum.Glowstone.getHarvestLevel());
            MinecraftForge.setToolClass(cactusGlowstoneScythe, "Scythe", InfiMaterialEnum.Glowstone.getHarvestLevel());
        }
        
        if(PHInfiHybrids.enableIceTools)
        {
        	woodIceScythe = new InfiToolScythe(PHInfiHybrids.iceScytheID+0, 
                    InfiMaterialEnum.Ice, InfiMaterialEnum.Wood, "woodIceScythe");
        	boneIceScythe = new InfiToolScythe(PHInfiHybrids.iceScytheID+1, 
                    InfiMaterialEnum.Ice, InfiMaterialEnum.Bone, "boneIceScythe");
        	paperIceScythe = new InfiToolScythe(PHInfiHybrids.iceScytheID+2, 
                    InfiMaterialEnum.Ice, InfiMaterialEnum.Paper, "paperIceScythe");
        	iceIceScythe = new InfiToolScythe(PHInfiHybrids.iceScytheID+3, 
                    InfiMaterialEnum.Ice, InfiMaterialEnum.Ice, "iceIceScythe");
        	slimeIceScythe = new InfiToolScythe(PHInfiHybrids.iceScytheID+4, 
                    InfiMaterialEnum.Ice, InfiMaterialEnum.Slime, "slimeIceScythe");
        	cactusIceScythe = new InfiToolScythe(PHInfiHybrids.iceScytheID+5, 
                    InfiMaterialEnum.Ice, InfiMaterialEnum.Cactus, "cactusIceScythe");
            
            
            MinecraftForge.setToolClass(woodIceScythe, "Scythe", InfiMaterialEnum.Ice.getHarvestLevel());
            MinecraftForge.setToolClass(boneIceScythe, "Scythe", InfiMaterialEnum.Ice.getHarvestLevel());
            MinecraftForge.setToolClass(paperIceScythe, "Scythe", InfiMaterialEnum.Ice.getHarvestLevel());
            MinecraftForge.setToolClass(iceIceScythe, "Scythe", InfiMaterialEnum.Ice.getHarvestLevel());
            MinecraftForge.setToolClass(slimeIceScythe, "Scythe", InfiMaterialEnum.Ice.getHarvestLevel());
            MinecraftForge.setToolClass(cactusIceScythe, "Scythe", InfiMaterialEnum.Ice.getHarvestLevel());
        }
        
        if(PHInfiHybrids.enableLavaTools)
        {
        	diamondLavaScythe = new InfiToolScythe(PHInfiHybrids.lavaScytheID+0, 
                    InfiMaterialEnum.Lava, InfiMaterialEnum.Diamond, "diamondLavaScythe");
        	obsidianLavaScythe = new InfiToolScythe(PHInfiHybrids.lavaScytheID+1, 
                    InfiMaterialEnum.Lava, InfiMaterialEnum.Obsidian, "obsidianLavaScythe");
        	netherrackLavaScythe = new InfiToolScythe(PHInfiHybrids.lavaScytheID+2, 
                    InfiMaterialEnum.Lava, InfiMaterialEnum.Netherrack, "netherrackLavaScythe");
        	lavaLavaScythe = new InfiToolScythe(PHInfiHybrids.lavaScytheID+3, 
                    InfiMaterialEnum.Lava, InfiMaterialEnum.Lava, "lavaLavaScythe");
        	flintLavaScythe = new InfiToolScythe(PHInfiHybrids.lavaScytheID+4, 
                    InfiMaterialEnum.Lava, InfiMaterialEnum.Flint, "flintLavaScythe");
        	blazeLavaScythe = new InfiToolScythe(PHInfiHybrids.lavaScytheID+5, 
                    InfiMaterialEnum.Lava, InfiMaterialEnum.Blaze, "blazeLavaScythe");
        	manyullynLavaScythe = new InfiToolScythe(PHInfiHybrids.lavaScytheID+6, 
                    InfiMaterialEnum.Lava, InfiMaterialEnum.Manyullyn, "manyullynLavaScythe");
            uraniumLavaScythe = new InfiToolScythe(PHInfiHybrids.lavaScytheID+7, 
                    InfiMaterialEnum.Lava, InfiMaterialEnum.Uranium, "uraniumLavaScythe");
            
            MinecraftForge.setToolClass(diamondLavaScythe, "Scythe", InfiMaterialEnum.Lava.getHarvestLevel());
            MinecraftForge.setToolClass(obsidianLavaScythe, "Scythe", InfiMaterialEnum.Lava.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackLavaScythe, "Scythe", InfiMaterialEnum.Lava.getHarvestLevel());
            MinecraftForge.setToolClass(lavaLavaScythe, "Scythe", InfiMaterialEnum.Lava.getHarvestLevel());
            MinecraftForge.setToolClass(flintLavaScythe, "Scythe", InfiMaterialEnum.Lava.getHarvestLevel());
            MinecraftForge.setToolClass(blazeLavaScythe, "Scythe", InfiMaterialEnum.Lava.getHarvestLevel());
            MinecraftForge.setToolClass(manyullynLavaScythe, "Scythe", InfiMaterialEnum.Lava.getHarvestLevel());
            MinecraftForge.setToolClass(uraniumLavaScythe, "Scythe", InfiMaterialEnum.Lava.getHarvestLevel());
        }
        
        if(PHInfiHybrids.enableSlimeTools)
        {
        	woodSlimeScythe = new InfiToolScythe(PHInfiHybrids.slimeScytheID+0, 
                    InfiMaterialEnum.Slime, InfiMaterialEnum.Wood, "woodSlimeScythe");
        	sandstoneSlimeScythe = new InfiToolScythe(PHInfiHybrids.slimeScytheID+1, 
                    InfiMaterialEnum.Slime, InfiMaterialEnum.Sandstone, "sandstoneSlimeScythe");
        	boneSlimeScythe = new InfiToolScythe(PHInfiHybrids.slimeScytheID+2, 
                    InfiMaterialEnum.Slime, InfiMaterialEnum.Bone, "boneSlimeScythe");
        	paperSlimeScythe = new InfiToolScythe(PHInfiHybrids.slimeScytheID+3, 
                    InfiMaterialEnum.Slime, InfiMaterialEnum.Paper, "paperSlimeScythe");
        	slimeSlimeScythe = new InfiToolScythe(PHInfiHybrids.slimeScytheID+4, 
                    InfiMaterialEnum.Slime, InfiMaterialEnum.Slime, "slimeSlimeScythe");
        	cactusSlimeScythe = new InfiToolScythe(PHInfiHybrids.slimeScytheID+5, 
                    InfiMaterialEnum.Slime, InfiMaterialEnum.Cactus, "cactusSlimeScythe");
            
            MinecraftForge.setToolClass(woodSlimeScythe, "Scythe", InfiMaterialEnum.Slime.getHarvestLevel());
            MinecraftForge.setToolClass(sandstoneSlimeScythe, "Scythe", InfiMaterialEnum.Slime.getHarvestLevel());
            MinecraftForge.setToolClass(boneSlimeScythe, "Scythe", InfiMaterialEnum.Slime.getHarvestLevel());
            MinecraftForge.setToolClass(paperSlimeScythe, "Scythe", InfiMaterialEnum.Slime.getHarvestLevel());
            MinecraftForge.setToolClass(slimeSlimeScythe, "Scythe", InfiMaterialEnum.Slime.getHarvestLevel());
            MinecraftForge.setToolClass(cactusSlimeScythe, "Scythe", InfiMaterialEnum.Slime.getHarvestLevel());
        }
        
        if(PHInfiHybrids.enableCactusTools)
        {
        	woodCactusScythe = new InfiToolScythe(PHInfiHybrids.cactusScytheID+0, 
                    InfiMaterialEnum.Cactus, InfiMaterialEnum.Wood, "woodCactusScythe");
        	sandstoneCactusScythe = new InfiToolScythe(PHInfiHybrids.cactusScytheID+1, 
                    InfiMaterialEnum.Cactus, InfiMaterialEnum.Sandstone, "sandstoneCactusScythe");
        	boneCactusScythe = new InfiToolScythe(PHInfiHybrids.cactusScytheID+2, 
                    InfiMaterialEnum.Cactus, InfiMaterialEnum.Bone, "boneCactusScythe");
        	netherrackCactusScythe = new InfiToolScythe(PHInfiHybrids.cactusScytheID+3, 
                    InfiMaterialEnum.Cactus, InfiMaterialEnum.Netherrack, "netherrackCactusScythe");
        	iceCactusScythe = new InfiToolScythe(PHInfiHybrids.cactusScytheID+4, 
                    InfiMaterialEnum.Cactus, InfiMaterialEnum.Ice, "iceCactusScythe");
        	slimeCactusScythe = new InfiToolScythe(PHInfiHybrids.cactusScytheID+5, 
                    InfiMaterialEnum.Cactus, InfiMaterialEnum.Slime, "slimeCactusScythe");
        	cactusCactusScythe = new InfiToolScythe(PHInfiHybrids.cactusScytheID+6, 
                    InfiMaterialEnum.Cactus, InfiMaterialEnum.Cactus, "cactusCactusScythe");
            
            MinecraftForge.setToolClass(woodCactusScythe, "Scythe", InfiMaterialEnum.Cactus.getHarvestLevel());
            MinecraftForge.setToolClass(sandstoneCactusScythe, "Scythe", InfiMaterialEnum.Cactus.getHarvestLevel());
            MinecraftForge.setToolClass(boneCactusScythe, "Scythe", InfiMaterialEnum.Cactus.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackCactusScythe, "Scythe", InfiMaterialEnum.Cactus.getHarvestLevel());
            MinecraftForge.setToolClass(iceCactusScythe, "Scythe", InfiMaterialEnum.Cactus.getHarvestLevel());
            MinecraftForge.setToolClass(slimeCactusScythe, "Scythe", InfiMaterialEnum.Cactus.getHarvestLevel());
            MinecraftForge.setToolClass(cactusCactusScythe, "Scythe", InfiMaterialEnum.Cactus.getHarvestLevel());
        }
        
        if(PHInfiHybrids.enableFlintTools)
        {
        	woodFlintScythe = new InfiToolScythe(PHInfiHybrids.flintScytheID+0, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Wood, "woodFlintScythe");
        	stoneFlintScythe = new InfiToolScythe(PHInfiHybrids.flintScytheID+1, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Stone, "stoneFlintScythe");
        	sandstoneFlintScythe = new InfiToolScythe(PHInfiHybrids.flintScytheID+2, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Sandstone, "sandstoneFlintScythe");
        	boneFlintScythe = new InfiToolScythe(PHInfiHybrids.flintScytheID+3, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Bone, "boneFlintScythe");
        	netherrackFlintScythe = new InfiToolScythe(PHInfiHybrids.flintScytheID+4, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Netherrack, "netherrackFlintScythe");
        	slimeFlintScythe = new InfiToolScythe(PHInfiHybrids.flintScytheID+5, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Slime, "slimeFlintScythe");
        	cactusFlintScythe = new InfiToolScythe(PHInfiHybrids.flintScytheID+6, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Cactus, "cactusFlintScythe");
        	flintFlintScythe = new InfiToolScythe(PHInfiHybrids.flintScytheID+7, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Flint, "flintFlintScythe");
        	copperFlintScythe = new InfiToolScythe(PHInfiHybrids.flintScytheID+8, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Copper, "copperFlintScythe");
        	bronzeFlintScythe = new InfiToolScythe(PHInfiHybrids.flintScytheID+9, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Bronze, "bronzeFlintScythe");
            
            MinecraftForge.setToolClass(woodFlintScythe, "Scythe", InfiMaterialEnum.Flint.getHarvestLevel());
            MinecraftForge.setToolClass(stoneFlintScythe, "Scythe", InfiMaterialEnum.Flint.getHarvestLevel());
            MinecraftForge.setToolClass(sandstoneFlintScythe, "Scythe", InfiMaterialEnum.Flint.getHarvestLevel());
            MinecraftForge.setToolClass(boneFlintScythe, "Scythe", InfiMaterialEnum.Flint.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackFlintScythe, "Scythe", InfiMaterialEnum.Flint.getHarvestLevel());
            MinecraftForge.setToolClass(slimeFlintScythe, "Scythe", InfiMaterialEnum.Flint.getHarvestLevel());
            MinecraftForge.setToolClass(cactusFlintScythe, "Scythe", InfiMaterialEnum.Flint.getHarvestLevel());
            MinecraftForge.setToolClass(flintFlintScythe, "Scythe", InfiMaterialEnum.Flint.getHarvestLevel());
            MinecraftForge.setToolClass(copperFlintScythe, "Scythe", InfiMaterialEnum.Flint.getHarvestLevel());
            MinecraftForge.setToolClass(bronzeFlintScythe, "Scythe", InfiMaterialEnum.Flint.getHarvestLevel());
        }
        
        if(PHInfiHybrids.enableBlazeTools)
        {
        	diamondBlazeScythe = new InfiToolScythe(PHInfiHybrids.blazeScytheID+0, 
                    InfiMaterialEnum.Blaze, InfiMaterialEnum.Diamond, "diamondBlazeScythe");
        	obsidianBlazeScythe = new InfiToolScythe(PHInfiHybrids.blazeScytheID+1, 
                    InfiMaterialEnum.Blaze, InfiMaterialEnum.Obsidian, "obsidianBlazeScythe");
        	netherrackBlazeScythe = new InfiToolScythe(PHInfiHybrids.blazeScytheID+2, 
                    InfiMaterialEnum.Blaze, InfiMaterialEnum.Netherrack, "netherrackBlazeScythe");
        	lavaBlazeScythe = new InfiToolScythe(PHInfiHybrids.blazeScytheID+3, 
                    InfiMaterialEnum.Blaze, InfiMaterialEnum.Lava, "lavaBlazeScythe");
        	flintBlazeScythe = new InfiToolScythe(PHInfiHybrids.blazeScytheID+4, 
                    InfiMaterialEnum.Blaze, InfiMaterialEnum.Flint, "flintBlazeScythe");
        	blazeBlazeScythe = new InfiToolScythe(PHInfiHybrids.blazeScytheID+5, 
                    InfiMaterialEnum.Blaze, InfiMaterialEnum.Blaze, "blazeBlazeScythe");
        	manyullynBlazeScythe = new InfiToolScythe(PHInfiHybrids.blazeScytheID+6, 
                    InfiMaterialEnum.Blaze, InfiMaterialEnum.Manyullyn, "manyullynBlazeScythe");
            uraniumBlazeScythe = new InfiToolScythe(PHInfiHybrids.blazeScytheID+7, 
                    InfiMaterialEnum.Blaze, InfiMaterialEnum.Uranium, "uraniumBlazeScythe");
            
            MinecraftForge.setToolClass(diamondBlazeScythe, "Scythe", InfiMaterialEnum.Blaze.getHarvestLevel());
            MinecraftForge.setToolClass(obsidianBlazeScythe, "Scythe", InfiMaterialEnum.Blaze.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackBlazeScythe, "Scythe", InfiMaterialEnum.Blaze.getHarvestLevel());
            MinecraftForge.setToolClass(blazeBlazeScythe, "Scythe", InfiMaterialEnum.Blaze.getHarvestLevel());
            MinecraftForge.setToolClass(flintBlazeScythe, "Scythe", InfiMaterialEnum.Blaze.getHarvestLevel());
            MinecraftForge.setToolClass(blazeBlazeScythe, "Scythe", InfiMaterialEnum.Blaze.getHarvestLevel());
            MinecraftForge.setToolClass(manyullynBlazeScythe, "Scythe", InfiMaterialEnum.Blaze.getHarvestLevel());
            MinecraftForge.setToolClass(uraniumBlazeScythe, "Scythe", InfiMaterialEnum.Blaze.getHarvestLevel());
        }
    	
        if(PHInfiHybrids.enableCopperTools)
        {
        	woodCopperScythe = new InfiToolScythe(PHInfiHybrids.copperScytheID+0, 
                    InfiMaterialEnum.Copper, InfiMaterialEnum.Wood, "woodCopperScythe");
            stoneCopperScythe = new InfiToolScythe(PHInfiHybrids.copperScytheID+1, 
                    InfiMaterialEnum.Copper, InfiMaterialEnum.Stone, "stoneCopperScythe");
            boneCopperScythe = new InfiToolScythe(PHInfiHybrids.copperScytheID+2, 
                    InfiMaterialEnum.Copper, InfiMaterialEnum.Bone, "boneCopperScythe");
            netherrackCopperScythe = new InfiToolScythe(PHInfiHybrids.copperScytheID+3, 
                    InfiMaterialEnum.Copper, InfiMaterialEnum.Netherrack, "netherrackCopperScythe");
            slimeCopperScythe = new InfiToolScythe(PHInfiHybrids.copperScytheID+4, 
                    InfiMaterialEnum.Copper, InfiMaterialEnum.Slime, "slimeCopperScythe");
            cactusCopperScythe = new InfiToolScythe(PHInfiHybrids.copperScytheID+5, 
                    InfiMaterialEnum.Copper, InfiMaterialEnum.Cactus, "cactusCopperScythe");
            flintCopperScythe = new InfiToolScythe(PHInfiHybrids.copperScytheID+6, 
                    InfiMaterialEnum.Copper, InfiMaterialEnum.Flint, "flintCopperScythe");
            copperCopperScythe = new InfiToolScythe(PHInfiHybrids.copperScytheID+7, 
                    InfiMaterialEnum.Copper, InfiMaterialEnum.Copper, "copperCopperScythe");
            
            MinecraftForge.setToolClass(woodCopperScythe, "Scythe", InfiMaterialEnum.Copper.getHarvestLevel());
        	MinecraftForge.setToolClass(stoneCopperScythe, "Scythe", InfiMaterialEnum.Copper.getHarvestLevel());
            MinecraftForge.setToolClass(boneCopperScythe, "Scythe", InfiMaterialEnum.Copper.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackCopperScythe, "Scythe", InfiMaterialEnum.Copper.getHarvestLevel());
            MinecraftForge.setToolClass(slimeCopperScythe, "Scythe", InfiMaterialEnum.Copper.getHarvestLevel());
            MinecraftForge.setToolClass(cactusCopperScythe, "Scythe", InfiMaterialEnum.Copper.getHarvestLevel());
            MinecraftForge.setToolClass(flintCopperScythe, "Scythe", InfiMaterialEnum.Copper.getHarvestLevel());
            MinecraftForge.setToolClass(copperCopperScythe, "Scythe", InfiMaterialEnum.Copper.getHarvestLevel());
        }
        
        if(PHInfiHybrids.enableBronzeTools)
        {
        	woodBronzeScythe = new InfiToolScythe(PHInfiHybrids.bronzeScytheID+0, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Wood, "woodBronzeScythe");
            stoneBronzeScythe = new InfiToolScythe(PHInfiHybrids.bronzeScytheID+1, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Stone, "stoneBronzeScythe");
            boneBronzeScythe = new InfiToolScythe(PHInfiHybrids.bronzeScytheID+2, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Bone, "boneBronzeScythe");
            netherrackBronzeScythe = new InfiToolScythe(PHInfiHybrids.bronzeScytheID+3, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Netherrack, "netherrackBronzeScythe");
            slimeBronzeScythe = new InfiToolScythe(PHInfiHybrids.bronzeScytheID+4, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Slime, "slimeBronzeScythe");
            cactusBronzeScythe = new InfiToolScythe(PHInfiHybrids.bronzeScytheID+5, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Cactus, "cactusBronzeScythe");
            flintBronzeScythe = new InfiToolScythe(PHInfiHybrids.bronzeScytheID+6, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Flint, "flintBronzeScythe");
            copperBronzeScythe = new InfiToolScythe(PHInfiHybrids.bronzeScytheID+7, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Copper, "copperBronzeScythe");
            bronzeBronzeScythe = new InfiToolScythe(PHInfiHybrids.bronzeScytheID+8, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Bronze, "bronzeBronzeScythe");
            
            MinecraftForge.setToolClass(woodBronzeScythe, "Scythe", InfiMaterialEnum.Bronze.getHarvestLevel());
            MinecraftForge.setToolClass(stoneBronzeScythe, "Scythe", InfiMaterialEnum.Bronze.getHarvestLevel());
            MinecraftForge.setToolClass(boneBronzeScythe, "Scythe", InfiMaterialEnum.Bronze.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackBronzeScythe, "Scythe", InfiMaterialEnum.Bronze.getHarvestLevel());
            MinecraftForge.setToolClass(slimeBronzeScythe, "Scythe", InfiMaterialEnum.Bronze.getHarvestLevel());
            MinecraftForge.setToolClass(cactusBronzeScythe, "Scythe", InfiMaterialEnum.Bronze.getHarvestLevel());
            MinecraftForge.setToolClass(flintBronzeScythe, "Scythe", InfiMaterialEnum.Bronze.getHarvestLevel());
            MinecraftForge.setToolClass(copperBronzeScythe, "Scythe", InfiMaterialEnum.Bronze.getHarvestLevel());
            MinecraftForge.setToolClass(bronzeBronzeScythe, "Scythe", InfiMaterialEnum.Bronze.getHarvestLevel());
        }
        
        if(PHInfiHybrids.enableWorkedIronTools)
        {
        	woodWorkedIronScythe = new InfiToolScythe(PHInfiHybrids.workedIronScytheID+0, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Wood, "woodWorkedIronScythe");
            stoneWorkedIronScythe = new InfiToolScythe(PHInfiHybrids.workedIronScytheID+1, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Stone, "stoneWorkedIronScythe");
            ironWorkedIronScythe = new InfiToolScythe(PHInfiHybrids.workedIronScytheID+2,
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Iron, "ironWorkedIronScythe");
            diamondWorkedIronScythe = new InfiToolScythe(PHInfiHybrids.workedIronScytheID+3, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Diamond, "diamondWorkedIronScythe");
            redstoneWorkedIronScythe = new InfiToolScythe(PHInfiHybrids.workedIronScytheID+4, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Redstone, "redstoneWorkedIronScythe");
            obsidianWorkedIronScythe = new InfiToolScythe(PHInfiHybrids.workedIronScytheID+5, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Obsidian, "obsidianWorkedIronScythe");
            boneWorkedIronScythe = new InfiToolScythe(PHInfiHybrids.workedIronScytheID+6, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Bone, "boneWorkedIronScythe");
            netherrackWorkedIronScythe = new InfiToolScythe(PHInfiHybrids.workedIronScytheID+7, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Netherrack, "netherrackWorkedIronScythe");
            glowstoneWorkedIronScythe = new InfiToolScythe(PHInfiHybrids.workedIronScytheID+8, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Glowstone, "glowstoneWorkedIronScythe");
            iceWorkedIronScythe = new InfiToolScythe(PHInfiHybrids.workedIronScytheID+9, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Ice, "iceWorkedIronScythe");
            slimeWorkedIronScythe = new InfiToolScythe(PHInfiHybrids.workedIronScytheID+10, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Slime, "slimeWorkedIronScythe");
            cactusWorkedIronScythe = new InfiToolScythe(PHInfiHybrids.workedIronScytheID+11, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Cactus, "cactusWorkedIronScythe");
            blazeWorkedIronScythe = new InfiToolScythe(PHInfiHybrids.workedIronScytheID+12, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Blaze, "blazeWorkedIronScythe");
            copperWorkedIronScythe = new InfiToolScythe(PHInfiHybrids.workedIronScytheID+13, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Copper, "copperWorkedIronScythe");
            bronzeWorkedIronScythe = new InfiToolScythe(PHInfiHybrids.workedIronScytheID+14, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Bronze, "bronzeWorkedIronScythe");
            workedWorkedIronScythe = new InfiToolScythe(PHInfiHybrids.workedIronScytheID+15, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.WorkedIron, "workedWorkedIronScythe");
            steelWorkedIronScythe = new InfiToolScythe(PHInfiHybrids.workedIronScytheID+16, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Steel, "steelWorkedIronScythe");
            uraniumWorkedIronScythe = new InfiToolScythe(PHInfiHybrids.workedIronScytheID+17, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Uranium, "uraniumWorkedIronScythe");
            
            MinecraftForge.setToolClass(woodWorkedIronScythe, "Scythe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(stoneWorkedIronScythe, "Scythe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(ironWorkedIronScythe, "Scythe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(diamondWorkedIronScythe, "Scythe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(redstoneWorkedIronScythe, "Scythe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(obsidianWorkedIronScythe, "Scythe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(boneWorkedIronScythe, "Scythe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackWorkedIronScythe, "Scythe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(glowstoneWorkedIronScythe, "Scythe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(iceWorkedIronScythe, "Scythe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(slimeWorkedIronScythe, "Scythe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(cactusWorkedIronScythe, "Scythe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(blazeWorkedIronScythe, "Scythe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(copperWorkedIronScythe, "Scythe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(bronzeWorkedIronScythe, "Scythe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(workedWorkedIronScythe, "Scythe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(steelWorkedIronScythe, "Scythe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(uraniumWorkedIronScythe, "Scythe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
        }
        
        if(PHInfiHybrids.enableSteelTools)
        {
        	woodSteelScythe = new InfiToolScythe(PHInfiHybrids.steelScytheID+0, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Wood, "woodSteelScythe");
            stoneSteelScythe = new InfiToolScythe(PHInfiHybrids.steelScytheID+1, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Stone, "stoneSteelScythe");
            ironSteelScythe = new InfiToolScythe(PHInfiHybrids.steelScytheID+2, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Iron, "ironSteelScythe");
            diamondSteelScythe = new InfiToolScythe(PHInfiHybrids.steelScytheID+3, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Diamond, "diamondSteelScythe");
            redstoneSteelScythe = new InfiToolScythe(PHInfiHybrids.steelScytheID+4, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Redstone, "redstoneSteelScythe");
            obsidianSteelScythe = new InfiToolScythe(PHInfiHybrids.steelScytheID+5, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Obsidian, "obsidianSteelScythe");
            boneSteelScythe = new InfiToolScythe(PHInfiHybrids.steelScytheID+6, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Bone, "boneSteelScythe");
            netherrackSteelScythe = new InfiToolScythe(PHInfiHybrids.steelScytheID+7, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Netherrack, "netherrackSteelScythe");
            glowstoneSteelScythe = new InfiToolScythe(PHInfiHybrids.steelScytheID+8, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Glowstone, "glowstoneSteelScythe");
            iceSteelScythe = new InfiToolScythe(PHInfiHybrids.steelScytheID+9, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Ice, "iceSteelScythe");
            slimeSteelScythe = new InfiToolScythe(PHInfiHybrids.steelScytheID+10, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Slime, "slimeSteelScythe");
            cactusSteelScythe = new InfiToolScythe(PHInfiHybrids.steelScytheID+11, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Cactus, "cactusSteelScythe");
            blazeSteelScythe = new InfiToolScythe(PHInfiHybrids.steelScytheID+12, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Blaze, "blazeSteelScythe");
            copperSteelScythe = new InfiToolScythe(PHInfiHybrids.steelScytheID+13, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Copper, "copperSteelScythe");
            bronzeSteelScythe = new InfiToolScythe(PHInfiHybrids.steelScytheID+14, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Bronze, "bronzeSteelScythe");
            workedSteelScythe = new InfiToolScythe(PHInfiHybrids.steelScytheID+15, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.WorkedIron, "workedSteelScythe");
            steelSteelScythe = new InfiToolScythe(PHInfiHybrids.steelScytheID+16, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Steel, "steelSteelScythe");
            cobaltSteelScythe = new InfiToolScythe(PHInfiHybrids.steelScytheID+17, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Cobalt, "cobaltSteelScythe");
            arditeSteelScythe = new InfiToolScythe(PHInfiHybrids.steelScytheID+18, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Ardite, "arditeSteelScythe");
            uraniumSteelScythe = new InfiToolScythe(PHInfiHybrids.steelScytheID+19, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Uranium, "uraniumSteelScythe");

            MinecraftForge.setToolClass(woodSteelScythe, "Scythe", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(stoneSteelScythe, "Scythe", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(ironSteelScythe, "Scythe", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(diamondSteelScythe, "Scythe", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(redstoneSteelScythe, "Scythe", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(obsidianSteelScythe, "Scythe", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(boneSteelScythe, "Scythe", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackSteelScythe, "Scythe", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(glowstoneSteelScythe, "Scythe", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(iceSteelScythe, "Scythe", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(slimeSteelScythe, "Scythe", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(cactusSteelScythe, "Scythe", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(blazeSteelScythe, "Scythe", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(copperSteelScythe, "Scythe", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(bronzeSteelScythe, "Scythe", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(workedSteelScythe, "Scythe", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(steelSteelScythe, "Scythe", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(cobaltSteelScythe, "Scythe", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(arditeSteelScythe, "Scythe", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(uraniumSteelScythe, "Scythe", InfiMaterialEnum.Steel.getHarvestLevel());
        }
        
        if(PHInfiHybrids.enableCobaltTools)
        {
        	woodCobaltScythe = new InfiToolScythe(PHInfiHybrids.cobaltScytheID+0, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Wood, "woodCobaltScythe");
            stoneCobaltScythe = new InfiToolScythe(PHInfiHybrids.cobaltScytheID+1, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Stone, "stoneCobaltScythe");
            ironCobaltScythe = new InfiToolScythe(PHInfiHybrids.cobaltScytheID+2, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Iron, "ironCobaltScythe");
            diamondCobaltScythe = new InfiToolScythe(PHInfiHybrids.cobaltScytheID+3,
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Diamond, "diamondCobaltScythe");
            redstoneCobaltScythe = new InfiToolScythe(PHInfiHybrids.cobaltScytheID+4, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Redstone, "redstoneCobaltScythe");
            obsidianCobaltScythe = new InfiToolScythe(PHInfiHybrids.cobaltScytheID+5, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Obsidian, "obsidianCobaltScythe");
            boneCobaltScythe = new InfiToolScythe(PHInfiHybrids.cobaltScytheID+6, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Bone, "boneCobaltScythe");
            slimeCobaltScythe = new InfiToolScythe(PHInfiHybrids.cobaltScytheID+7, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Slime, "slimeCobaltScythe");
            cactusCobaltScythe = new InfiToolScythe(PHInfiHybrids.cobaltScytheID+8, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Cactus, "cactusCobaltScythe");
            blazeCobaltScythe = new InfiToolScythe(PHInfiHybrids.cobaltScytheID+9, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Blaze, "blazeCobaltScythe");
            copperCobaltScythe = new InfiToolScythe(PHInfiHybrids.cobaltScytheID+10, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Copper, "copperCobaltScythe");
            bronzeCobaltScythe = new InfiToolScythe(PHInfiHybrids.cobaltScytheID+11, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Bronze, "bronzeCobaltScythe");
            workedCobaltScythe = new InfiToolScythe(PHInfiHybrids.cobaltScytheID+12, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.WorkedIron, "workedCobaltScythe");
            steelCobaltScythe = new InfiToolScythe(PHInfiHybrids.cobaltScytheID+13, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Steel, "steelCobaltScythe");
            cobaltCobaltScythe = new InfiToolScythe(PHInfiHybrids.cobaltScytheID+14, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Cobalt, "cobaltCobaltScythe");
            arditeCobaltScythe = new InfiToolScythe(PHInfiHybrids.cobaltScytheID+15, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Ardite, "arditeCobaltScythe");
            manyullynCobaltScythe = new InfiToolScythe(PHInfiHybrids.cobaltScytheID+16, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Manyullyn, "manyullynCobaltScythe");
            uraniumCobaltScythe = new InfiToolScythe(PHInfiHybrids.cobaltScytheID+17, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Uranium, "uraniumCobaltScythe");
            
            MinecraftForge.setToolClass(woodCobaltScythe, "Scythe", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(stoneCobaltScythe, "Scythe", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(ironCobaltScythe, "Scythe", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(diamondCobaltScythe, "Scythe", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(redstoneCobaltScythe, "Scythe", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(obsidianCobaltScythe, "Scythe", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(boneCobaltScythe, "Scythe", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(slimeCobaltScythe, "Scythe", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(cactusCobaltScythe, "Scythe", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(blazeCobaltScythe, "Scythe", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(copperCobaltScythe, "Scythe", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(bronzeCobaltScythe, "Scythe", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(workedCobaltScythe, "Scythe", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(steelCobaltScythe, "Scythe", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(cobaltCobaltScythe, "Scythe", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(arditeCobaltScythe, "Scythe", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(manyullynCobaltScythe, "Scythe", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(uraniumCobaltScythe, "Scythe", InfiMaterialEnum.Cobalt.getHarvestLevel());
        }
        
        if(PHInfiHybrids.enableArditeTools)
        {
        	woodArditeScythe = new InfiToolScythe(PHInfiHybrids.arditeScytheID+0, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Wood, "woodArditeScythe");
            stoneArditeScythe = new InfiToolScythe(PHInfiHybrids.arditeScytheID+1, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Stone, "stoneArditeScythe");
            ironArditeScythe = new InfiToolScythe(PHInfiHybrids.arditeScytheID+2, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Iron, "ironArditeScythe");
            diamondArditeScythe = new InfiToolScythe(PHInfiHybrids.arditeScytheID+3,
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Diamond, "diamondArditeScythe");
            redstoneArditeScythe = new InfiToolScythe(PHInfiHybrids.arditeScytheID+4, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Redstone, "redstoneArditeScythe");
            obsidianArditeScythe = new InfiToolScythe(PHInfiHybrids.arditeScytheID+5, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Obsidian, "obsidianArditeScythe");
            boneArditeScythe = new InfiToolScythe(PHInfiHybrids.arditeScytheID+6,
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Bone, "boneArditeScythe");
            slimeArditeScythe = new InfiToolScythe(PHInfiHybrids.arditeScytheID+7, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Slime, "slimeArditeScythe");
            cactusArditeScythe = new InfiToolScythe(PHInfiHybrids.arditeScytheID+8, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Cactus, "cactusArditeScythe");
            blazeArditeScythe = new InfiToolScythe(PHInfiHybrids.arditeScytheID+9, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Blaze, "blazeArditeScythe");
            copperArditeScythe = new InfiToolScythe(PHInfiHybrids.arditeScytheID+10, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Copper, "copperArditeScythe");
            bronzeArditeScythe = new InfiToolScythe(PHInfiHybrids.arditeScytheID+11, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Bronze, "bronzeArditeScythe");
            workedArditeScythe = new InfiToolScythe(PHInfiHybrids.arditeScytheID+12, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.WorkedIron, "workedArditeScythe");
            steelArditeScythe = new InfiToolScythe(PHInfiHybrids.arditeScytheID+13, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Steel, "steelArditeScythe");
            cobaltArditeScythe = new InfiToolScythe(PHInfiHybrids.arditeScytheID+14, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Cobalt, "cobaltArditeScythe");
            arditeArditeScythe = new InfiToolScythe(PHInfiHybrids.arditeScytheID+15, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Ardite, "arditeArditeScythe");
            manyullynArditeScythe = new InfiToolScythe(PHInfiHybrids.arditeScytheID+16, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Manyullyn, "manyullynArditeScythe");
            uraniumArditeScythe = new InfiToolScythe(PHInfiHybrids.arditeScytheID+17, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Uranium, "uraniumArditeScythe");
            
            MinecraftForge.setToolClass(woodArditeScythe, "Scythe", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(stoneArditeScythe, "Scythe", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(ironArditeScythe, "Scythe", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(diamondArditeScythe, "Scythe", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(redstoneArditeScythe, "Scythe", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(obsidianArditeScythe, "Scythe", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(boneArditeScythe, "Scythe", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(slimeArditeScythe, "Scythe", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(cactusArditeScythe, "Scythe", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(blazeArditeScythe, "Scythe", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(copperArditeScythe, "Scythe", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(bronzeArditeScythe, "Scythe", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(workedArditeScythe, "Scythe", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(steelArditeScythe, "Scythe", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(cobaltArditeScythe, "Scythe", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(arditeArditeScythe, "Scythe", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(manyullynArditeScythe, "Scythe", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(uraniumArditeScythe, "Scythe", InfiMaterialEnum.Ardite.getHarvestLevel());
        }
        
        if(PHInfiHybrids.enableManyullynTools)
        {
        	woodManyullynScythe = new InfiToolScythe(PHInfiHybrids.manyullynScytheID+0, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Wood, "woodManyullynScythe");
            stoneManyullynScythe = new InfiToolScythe(PHInfiHybrids.manyullynScytheID+1, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Stone, "stoneManyullynScythe");
            ironManyullynScythe = new InfiToolScythe(PHInfiHybrids.manyullynScytheID+2, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Iron, "ironManyullynScythe");
            diamondManyullynScythe = new InfiToolScythe(PHInfiHybrids.manyullynScytheID+3,
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Diamond, "diamondManyullynScythe");
            redstoneManyullynScythe = new InfiToolScythe(PHInfiHybrids.manyullynScytheID+4, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Redstone, "redstoneManyullynScythe");
            obsidianManyullynScythe = new InfiToolScythe(PHInfiHybrids.manyullynScytheID+5, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Obsidian, "obsidianManyullynScythe");
            boneManyullynScythe = new InfiToolScythe(PHInfiHybrids.manyullynScytheID+6, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Bone, "boneManyullynScythe");
            slimeManyullynScythe = new InfiToolScythe(PHInfiHybrids.manyullynScytheID+7, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Slime, "slimeManyullynScythe");
            cactusManyullynScythe = new InfiToolScythe(PHInfiHybrids.manyullynScytheID+8, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Cactus, "cactusManyullynScythe");
            blazeManyullynScythe = new InfiToolScythe(PHInfiHybrids.manyullynScytheID+9, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Blaze, "blazeManyullynScythe");
            copperManyullynScythe = new InfiToolScythe(PHInfiHybrids.manyullynScytheID+10, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Copper, "copperManyullynScythe");
            bronzeManyullynScythe = new InfiToolScythe(PHInfiHybrids.manyullynScytheID+11, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Bronze, "bronzeManyullynScythe");
            workedManyullynScythe = new InfiToolScythe(PHInfiHybrids.manyullynScytheID+12, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.WorkedIron, "workedManyullynScythe");
            steelManyullynScythe = new InfiToolScythe(PHInfiHybrids.manyullynScytheID+13, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Steel, "steelManyullynScythe");
            cobaltManyullynScythe = new InfiToolScythe(PHInfiHybrids.manyullynScytheID+14, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Cobalt, "cobaltManyullynScythe");
            arditeManyullynScythe = new InfiToolScythe(PHInfiHybrids.manyullynScytheID+15, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Ardite, "arditeManyullynScythe");
            manyullynManyullynScythe = new InfiToolScythe(PHInfiHybrids.manyullynScytheID+16, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Manyullyn, "manyullynManyullynScythe");
            uraniumManyullynScythe = new InfiToolScythe(PHInfiHybrids.manyullynScytheID+17,
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Uranium, "uraniumManyullynScythe");
            
            MinecraftForge.setToolClass(woodManyullynScythe, "Scythe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(stoneManyullynScythe, "Scythe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(ironManyullynScythe, "Scythe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(diamondManyullynScythe, "Scythe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(redstoneManyullynScythe, "Scythe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(obsidianManyullynScythe, "Scythe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(boneManyullynScythe, "Scythe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(slimeManyullynScythe, "Scythe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(cactusManyullynScythe, "Scythe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(blazeManyullynScythe, "Scythe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(copperManyullynScythe, "Scythe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(bronzeManyullynScythe, "Scythe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(workedManyullynScythe, "Scythe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(steelManyullynScythe, "Scythe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(cobaltManyullynScythe, "Scythe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(arditeManyullynScythe, "Scythe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(manyullynManyullynScythe, "Scythe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(uraniumManyullynScythe, "Scythe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
        }
        
        if(PHInfiHybrids.enableUraniumTools)
        {
            diamondUraniumScythe = new InfiToolScythe(PHInfiHybrids.uraniumScytheID+0, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Diamond, "diamondUraniumScythe");
            redstoneUraniumScythe = new InfiToolScythe(PHInfiHybrids.uraniumScytheID+1, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Redstone, "redstoneUraniumScythe");
            boneUraniumScythe = new InfiToolScythe(PHInfiHybrids.uraniumScytheID+2, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Bone, "boneUraniumScythe");
            netherrackUraniumScythe = new InfiToolScythe(PHInfiHybrids.uraniumScytheID+3, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Netherrack, "netherrackUraniumScythe");
            glowstoneUraniumScythe = new InfiToolScythe(PHInfiHybrids.uraniumScytheID+4, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Glowstone, "glowstoneUraniumScythe");
            lavaUraniumScythe = new InfiToolScythe(PHInfiHybrids.uraniumScytheID+5, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Lava, "lavaUraniumScythe");
            blazeUraniumScythe = new InfiToolScythe(PHInfiHybrids.uraniumScytheID+6, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Blaze, "blazeUraniumScythe");
            cobaltUraniumScythe = new InfiToolScythe(PHInfiHybrids.uraniumScytheID+7, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Cobalt, "cobaltUraniumScythe");
            arditeUraniumScythe = new InfiToolScythe(PHInfiHybrids.uraniumScytheID+8, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Ardite, "arditeUraniumScythe");
            uraniumUraniumScythe = new InfiToolScythe(PHInfiHybrids.uraniumScytheID+9, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Uranium, "uraniumUraniumScythe");
            
            MinecraftForge.setToolClass(diamondUraniumScythe, "Scythe", InfiMaterialEnum.Uranium.getHarvestLevel());
            MinecraftForge.setToolClass(redstoneUraniumScythe, "Scythe", InfiMaterialEnum.Uranium.getHarvestLevel());
            MinecraftForge.setToolClass(boneUraniumScythe, "Scythe", InfiMaterialEnum.Uranium.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackUraniumScythe, "Scythe", InfiMaterialEnum.Uranium.getHarvestLevel());
            MinecraftForge.setToolClass(glowstoneUraniumScythe, "Scythe", InfiMaterialEnum.Uranium.getHarvestLevel());
            MinecraftForge.setToolClass(lavaUraniumScythe, "Scythe", InfiMaterialEnum.Uranium.getHarvestLevel());
            MinecraftForge.setToolClass(blazeUraniumScythe, "Scythe", InfiMaterialEnum.Uranium.getHarvestLevel());
            MinecraftForge.setToolClass(cobaltUraniumScythe, "Scythe", InfiMaterialEnum.Uranium.getHarvestLevel());
            MinecraftForge.setToolClass(arditeUraniumScythe, "Scythe", InfiMaterialEnum.Uranium.getHarvestLevel());
            MinecraftForge.setToolClass(uraniumUraniumScythe, "Scythe", InfiMaterialEnum.Uranium.getHarvestLevel());
        }
    }
    
    private static void addNames()
    {
    	if(PHInfiHybrids.enableWoodTools)
            ModLoader.addName(woodWoodScythe, "Wooden Scythe");
        if(PHInfiHybrids.enableStoneTools)
            ModLoader.addName(stoneStoneScythe, "Heavy Scythe");
        if(PHInfiHybrids.enableIronTools)
            ModLoader.addName(ironIronScythe, "Ironic Scythe");
        if(PHInfiHybrids.enableDiamondTools)
            ModLoader.addName(diamondDiamondScythe, "Diamondium Scythe");
        if(PHInfiHybrids.enableRedstoneTools)
            ModLoader.addName(redstoneRedstoneScythe, "Redredred Scythe");
        if(PHInfiHybrids.enableObsidianTools)
            ModLoader.addName(obsidianObsidianScythe, "Ebony Scythe");
        if(PHInfiHybrids.enableSandstoneTools)
            ModLoader.addName(sandstoneSandstoneScythe, "Fragile Scythe");
        if(PHInfiHybrids.enableNetherrackTools)
            ModLoader.addName(boneBoneScythe, "Necrotic Scythe");
        if(PHInfiHybrids.enablePaperTools)
            ModLoader.addName(paperPaperScythe, "Soft Scythe");
        if(PHInfiHybrids.enableMossyTools)
            ModLoader.addName(mossyMossyScythe, "Living Scythe");
        if(PHInfiHybrids.enableNetherrackTools)
            ModLoader.addName(netherrackNetherrackScythe, "Bloodsoaked Scythe");
        if(PHInfiHybrids.enableGlowstoneTools)
            ModLoader.addName(glowstoneGlowstoneScythe, "Bright Scythe");
        if(PHInfiHybrids.enableIceTools)
            ModLoader.addName(iceIceScythe, "Freezing Scythe");
        if(PHInfiHybrids.enableLavaTools)
            ModLoader.addName(lavaLavaScythe, "Burning Scythe");
        if(PHInfiHybrids.enableSlimeTools)
            ModLoader.addName(slimeSlimeScythe, "Toy Scythe");
        if(PHInfiHybrids.enableCactusTools)
            ModLoader.addName(cactusCactusScythe, "Thorned Scythe");
        if(PHInfiHybrids.enableFlintTools)
            ModLoader.addName(flintFlintScythe, "Rough-hewn Scythe");
        if(PHInfiHybrids.enableBlazeTools)
            ModLoader.addName(blazeBlazeScythe, "Netherite Scythe");
        if(PHInfiHybrids.enableCopperTools)
            ModLoader.addName(copperCopperScythe, "Orange-Tang Scythe");
        if(PHInfiHybrids.enableBronzeTools)
            ModLoader.addName(bronzeBronzeScythe, "Polished Scythe");
        if(PHInfiHybrids.enableWorkedIronTools)
            ModLoader.addName(workedWorkedIronScythe, "Reworked Iron Scythe");
        if(PHInfiHybrids.enableSteelTools)
            ModLoader.addName(steelSteelScythe, "Forge-Wrought Scythe");
        if(PHInfiHybrids.enableCobaltTools)
            ModLoader.addName(cobaltCobaltScythe, "Beautiful Scythe");
        if(PHInfiHybrids.enableArditeTools)
            ModLoader.addName(arditeArditeScythe, "Rustic Scythe");
        if(PHInfiHybrids.enableManyullynTools)
            ModLoader.addName(manyullynManyullynScythe, "False-Prophetic Scythe");
        if(PHInfiHybrids.enableUraniumTools)
            ModLoader.addName(uraniumUraniumScythe, "Cancerous Scythe");
    }
    
    public static void registerInfiToolsRecipes()
    {
    	if(PHInfiHybrids.enableWoodTools)
        {
            ModLoader.addRecipe(new ItemStack(woodWoodScythe), new Object[] 
                    { recipe, '#', Block.planks, '|', Item.stick, 's', Item.stick });
            ModLoader.addRecipe(new ItemStack(sandstoneWoodScythe), new Object[] 
                    { recipe, '#', Block.planks, '|', InfiLibrary.sandstoneRod, 's', Item.stick });
            ModLoader.addRecipe(new ItemStack(boneWoodScythe), new Object[] 
                    { recipe, '#', Block.planks, '|', Item.bone, 's', Item.stick });
            ModLoader.addRecipe(new ItemStack(boneWoodScythe), new Object[] 
                    { recipe, '#', Block.planks, '|', InfiLibrary.boneRod, 's', Item.stick });
            ModLoader.addRecipe(new ItemStack(paperWoodScythe), new Object[] 
                    { recipe, '#', Block.planks, '|', InfiLibrary.paperRod, 's', Item.stick });
            ModLoader.addRecipe(new ItemStack(iceWoodScythe), new Object[] 
                    { recipe, '#', Block.planks, '|', InfiLibrary.iceRod, 's', Item.stick });
            ModLoader.addRecipe(new ItemStack(slimeWoodScythe), new Object[] 
                    { recipe, '#', Block.planks, '|', InfiLibrary.slimeRod, 's', Item.stick });
            ModLoader.addRecipe(new ItemStack(cactusWoodScythe), new Object[] 
                    { recipe, '#', Block.planks, '|', InfiLibrary.cactusRod, 's', Item.stick });
        }
    	
        if(PHInfiHybrids.enableStoneTools)
        {
        	ModLoader.addRecipe(new ItemStack(woodStoneScythe), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', Item.stick, 's', InfiLibrary.stoneShard });
        	ModLoader.addRecipe(new ItemStack(stoneStoneScythe), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', InfiLibrary.stoneRod, 's', InfiLibrary.stoneShard });
            ModLoader.addRecipe(new ItemStack(sandstoneStoneScythe), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', InfiLibrary.sandstoneRod, 's', InfiLibrary.stoneShard });
            ModLoader.addRecipe(new ItemStack(boneStoneScythe), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', Item.bone, 's', InfiLibrary.stoneShard });
            ModLoader.addRecipe(new ItemStack(boneStoneScythe), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', InfiLibrary.boneRod, 's', InfiLibrary.stoneShard });
            ModLoader.addRecipe(new ItemStack(netherrackStoneScythe), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', InfiLibrary.netherrackRod, 's', InfiLibrary.stoneShard });
            ModLoader.addRecipe(new ItemStack(iceStoneScythe), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', InfiLibrary.iceRod, 's', InfiLibrary.stoneShard });
            ModLoader.addRecipe(new ItemStack(slimeStoneScythe), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', InfiLibrary.slimeRod, 's', InfiLibrary.stoneShard });
            ModLoader.addRecipe(new ItemStack(cactusStoneScythe), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', InfiLibrary.cactusRod, 's', InfiLibrary.stoneShard });
            ModLoader.addRecipe(new ItemStack(flintStoneScythe), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', InfiLibrary.flintRod, 's', InfiLibrary.stoneShard });
            
            ModLoader.addRecipe(new ItemStack(woodStoneScythe), new Object[] 
                    { recipe, '#', Block.stone, '|', Item.stick, 's', InfiLibrary.stoneShard });
        	ModLoader.addRecipe(new ItemStack(stoneStoneScythe), new Object[] 
                    { recipe, '#', Block.stone, '|', InfiLibrary.stoneRod, 's', InfiLibrary.stoneShard });
            ModLoader.addRecipe(new ItemStack(sandstoneStoneScythe), new Object[] 
                    { recipe, '#', Block.stone, '|', InfiLibrary.sandstoneRod, 's', InfiLibrary.stoneShard });
            ModLoader.addRecipe(new ItemStack(boneStoneScythe), new Object[] 
                    { recipe, '#', Block.stone, '|', Item.bone, 's', InfiLibrary.stoneShard });
            ModLoader.addRecipe(new ItemStack(boneStoneScythe), new Object[] 
                    { recipe, '#', Block.stone, '|', InfiLibrary.boneRod, 's', InfiLibrary.stoneShard });
            ModLoader.addRecipe(new ItemStack(netherrackStoneScythe), new Object[] 
                    { recipe, '#', Block.stone, '|', InfiLibrary.netherrackRod, 's', InfiLibrary.stoneShard });
            ModLoader.addRecipe(new ItemStack(iceStoneScythe), new Object[] 
                    { recipe, '#', Block.stone, '|', InfiLibrary.iceRod, 's', InfiLibrary.stoneShard });
            ModLoader.addRecipe(new ItemStack(slimeStoneScythe), new Object[] 
                    { recipe, '#', Block.stone, '|', InfiLibrary.slimeRod, 's', InfiLibrary.stoneShard });
            ModLoader.addRecipe(new ItemStack(cactusStoneScythe), new Object[] 
                    { recipe, '#', Block.stone, '|', InfiLibrary.cactusRod, 's', InfiLibrary.stoneShard });
            ModLoader.addRecipe(new ItemStack(flintStoneScythe), new Object[] 
                    { recipe, '#', Block.stone, '|', InfiLibrary.flintRod, 's', InfiLibrary.stoneShard });
        }
        
        if(PHInfiHybrids.enableIronTools)
        {
        	ModLoader.addRecipe(new ItemStack(woodIronScythe), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', Item.stick, 's', InfiLibrary.ironChunk });
        	ModLoader.addRecipe(new ItemStack(stoneIronScythe), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', InfiLibrary.stoneRod, 's', InfiLibrary.ironChunk });
            ModLoader.addRecipe(new ItemStack(ironIronScythe), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', InfiLibrary.ironRod, 's', InfiLibrary.ironChunk });
            ModLoader.addRecipe(new ItemStack(boneIronScythe), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', Item.bone, 's', InfiLibrary.ironChunk });
            ModLoader.addRecipe(new ItemStack(boneIronScythe), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', InfiLibrary.boneRod, 's', InfiLibrary.ironChunk });
            ModLoader.addRecipe(new ItemStack(netherrackIronScythe), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', InfiLibrary.netherrackRod, 's', InfiLibrary.ironChunk });
            ModLoader.addRecipe(new ItemStack(glowstoneIronScythe), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', InfiLibrary.glowstoneRod, 's', InfiLibrary.ironChunk });
            ModLoader.addRecipe(new ItemStack(cactusIronScythe), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', InfiLibrary.cactusRod, 's', InfiLibrary.ironChunk });
            ModLoader.addRecipe(new ItemStack(copperIronScythe), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', InfiLibrary.copperRod, 's', InfiLibrary.ironChunk });
            ModLoader.addRecipe(new ItemStack(bronzeIronScythe), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', InfiLibrary.bronzeRod, 's', InfiLibrary.ironChunk });
        }
        
        if(PHInfiHybrids.enableDiamondTools)
        {
        	ModLoader.addRecipe(new ItemStack(woodDiamondScythe), new Object[] 
                    { recipe, '#', Item.diamond, '|', Item.stick, 's', InfiLibrary.diamondShard });
        	ModLoader.addRecipe(new ItemStack(stoneDiamondScythe), new Object[] 
                    { recipe, '#', Item.diamond, '|', InfiLibrary.stoneRod, 's', InfiLibrary.diamondShard });
            ModLoader.addRecipe(new ItemStack(ironDiamondScythe), new Object[] 
                    { recipe, '#', Item.diamond, '|', InfiLibrary.ironRod, 's', InfiLibrary.diamondShard });
            ModLoader.addRecipe(new ItemStack(diamondDiamondScythe), new Object[] 
                    { recipe, '#', Item.diamond, '|', InfiLibrary.diamondRod, 's', InfiLibrary.diamondShard });
            ModLoader.addRecipe(new ItemStack(redstoneDiamondScythe), new Object[] 
                    { recipe, '#', Item.diamond, '|', InfiLibrary.redstoneRod, 's', InfiLibrary.diamondShard });
            ModLoader.addRecipe(new ItemStack(obsidianDiamondScythe), new Object[] 
                    { recipe, '#', Item.diamond, '|', InfiLibrary.obsidianRod, 's', InfiLibrary.diamondShard });
            ModLoader.addRecipe(new ItemStack(boneDiamondScythe), new Object[] 
                    { recipe, '#', Item.diamond, '|', Item.bone, 's', InfiLibrary.diamondShard });
            ModLoader.addRecipe(new ItemStack(boneDiamondScythe), new Object[] 
                    { recipe, '#', Item.diamond, '|', InfiLibrary.boneRod, 's', InfiLibrary.diamondShard });
            ModLoader.addRecipe(new ItemStack(mossyDiamondScythe), new Object[] 
                    { recipe, '#', Item.diamond, '|', InfiLibrary.mossyRod, 's', InfiLibrary.diamondShard });
            ModLoader.addRecipe(new ItemStack(netherrackDiamondScythe), new Object[] 
                    { recipe, '#', Item.diamond, '|', InfiLibrary.netherrackRod, 's', InfiLibrary.diamondShard });
            ModLoader.addRecipe(new ItemStack(glowstoneDiamondScythe), new Object[] 
                    { recipe, '#', Item.diamond, '|', InfiLibrary.glowstoneRod, 's', InfiLibrary.diamondShard });
            ModLoader.addRecipe(new ItemStack(lavaDiamondScythe), new Object[] 
                    { recipe, '#', Item.diamond, '|', InfiLibrary.lavaRod, 's', InfiLibrary.diamondShard });
            ModLoader.addRecipe(new ItemStack(cactusDiamondScythe), new Object[] 
                    { recipe, '#', Item.diamond, '|', InfiLibrary.cactusRod, 's', InfiLibrary.diamondShard });
            ModLoader.addRecipe(new ItemStack(flintDiamondScythe), new Object[] 
                    { recipe, '#', Item.diamond, '|', InfiLibrary.flintRod, 's', InfiLibrary.diamondShard });
            ModLoader.addRecipe(new ItemStack(blazeDiamondScythe), new Object[] 
                    { recipe, '#', Item.diamond, '|', Item.blazeRod, 's', InfiLibrary.diamondShard });
            ModLoader.addRecipe(new ItemStack(copperDiamondScythe), new Object[] 
                    { recipe, '#', Item.diamond, '|', InfiLibrary.copperRod, 's', InfiLibrary.diamondShard });
            ModLoader.addRecipe(new ItemStack(bronzeDiamondScythe), new Object[] 
                    { recipe, '#', Item.diamond, '|', InfiLibrary.bronzeRod, 's', InfiLibrary.diamondShard });
            ModLoader.addRecipe(new ItemStack(workedDiamondScythe), new Object[] 
                    { recipe, '#', Item.diamond, '|', InfiLibrary.workedIronRod, 's', InfiLibrary.diamondShard });
            ModLoader.addRecipe(new ItemStack(steelDiamondScythe), new Object[] 
                    { recipe, '#', Item.diamond, '|', InfiLibrary.steelRod, 's', InfiLibrary.diamondShard });
            ModLoader.addRecipe(new ItemStack(cobaltDiamondScythe), new Object[] 
                    { recipe, '#', Item.diamond, '|', InfiLibrary.cobaltRod, 's', InfiLibrary.diamondShard });
            ModLoader.addRecipe(new ItemStack(arditeDiamondScythe), new Object[] 
                    { recipe, '#', Item.diamond, '|', InfiLibrary.arditeRod, 's', InfiLibrary.diamondShard });
            ModLoader.addRecipe(new ItemStack(manyullynDiamondScythe), new Object[] 
                    { recipe, '#', Item.diamond, '|', InfiLibrary.manyullynRod, 's', InfiLibrary.diamondShard });
            ModLoader.addRecipe(new ItemStack(uraniumDiamondScythe), new Object[] 
                    { recipe, '#', Item.diamond, '|', InfiLibrary.uraniumRod, 's', InfiLibrary.diamondShard });
        }
        
        if(PHInfiHybrids.enableRedstoneTools)
        {
        	ModLoader.addRecipe(new ItemStack(woodRedstoneScythe), new Object[] 
                    { recipe, '#', InfiLibrary.redstoneCrystal, '|', Item.stick, 's', InfiLibrary.redstoneFragment });
        	ModLoader.addRecipe(new ItemStack(stoneRedstoneScythe), new Object[] 
                    { recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.stoneRod, 's', InfiLibrary.redstoneFragment });
            ModLoader.addRecipe(new ItemStack(ironRedstoneScythe), new Object[] 
                    { recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.ironRod, 's', InfiLibrary.redstoneFragment });
            ModLoader.addRecipe(new ItemStack(redstoneRedstoneScythe), new Object[] 
                    { recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.redstoneRod, 's', InfiLibrary.redstoneFragment });
            ModLoader.addRecipe(new ItemStack(obsidianRedstoneScythe), new Object[] 
                    { recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.obsidianRod, 's', InfiLibrary.redstoneFragment });
            ModLoader.addRecipe(new ItemStack(sandstoneRedstoneScythe), new Object[] 
                    { recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.sandstoneRod, 's', InfiLibrary.redstoneFragment });
            ModLoader.addRecipe(new ItemStack(boneRedstoneScythe), new Object[] 
                    { recipe, '#', InfiLibrary.redstoneCrystal, '|', Item.bone, 's', InfiLibrary.redstoneFragment });
            ModLoader.addRecipe(new ItemStack(boneRedstoneScythe), new Object[] 
                    { recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.boneRod, 's', InfiLibrary.redstoneFragment });
            ModLoader.addRecipe(new ItemStack(paperRedstoneScythe), new Object[] 
                    { recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.paperRod, 's', InfiLibrary.redstoneFragment });
            ModLoader.addRecipe(new ItemStack(mossyRedstoneScythe), new Object[] 
                    { recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.mossyRod, 's', InfiLibrary.redstoneFragment });
            ModLoader.addRecipe(new ItemStack(netherrackRedstoneScythe), new Object[] 
                    { recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.netherrackRod, 's', InfiLibrary.redstoneFragment });
            ModLoader.addRecipe(new ItemStack(glowstoneRedstoneScythe), new Object[] 
                    { recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.glowstoneRod, 's', InfiLibrary.redstoneFragment });
            ModLoader.addRecipe(new ItemStack(iceRedstoneScythe), new Object[] 
                    { recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.iceRod, 's', InfiLibrary.redstoneFragment });
            ModLoader.addRecipe(new ItemStack(lavaRedstoneScythe), new Object[] 
                    { recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.lavaRod, 's', InfiLibrary.redstoneFragment });
            ModLoader.addRecipe(new ItemStack(slimeRedstoneScythe), new Object[] 
                    { recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.slimeRod, 's', InfiLibrary.redstoneFragment });
            ModLoader.addRecipe(new ItemStack(cactusRedstoneScythe), new Object[] 
                    { recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.cactusRod, 's', InfiLibrary.redstoneFragment });
            ModLoader.addRecipe(new ItemStack(flintRedstoneScythe), new Object[] 
                    { recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.flintRod, 's', InfiLibrary.redstoneFragment });
            ModLoader.addRecipe(new ItemStack(copperRedstoneScythe), new Object[] 
                    { recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.copperRod, 's', InfiLibrary.redstoneFragment });
            ModLoader.addRecipe(new ItemStack(bronzeRedstoneScythe), new Object[] 
                    { recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.bronzeRod, 's', InfiLibrary.redstoneFragment });
            ModLoader.addRecipe(new ItemStack(workedRedstoneScythe), new Object[] 
                    { recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.workedIronRod, 's', InfiLibrary.redstoneFragment });
            ModLoader.addRecipe(new ItemStack(uraniumRedstoneScythe), new Object[] 
                    { recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.uraniumRod, 's', InfiLibrary.redstoneFragment });
        }
        
        if(PHInfiHybrids.enableObsidianTools)
        {
        	ModLoader.addRecipe(new ItemStack(woodObsidianScythe), new Object[] 
                    { recipe, '#', Block.obsidian, '|', Item.stick, 's', InfiLibrary.obsidianShard });
        	ModLoader.addRecipe(new ItemStack(stoneObsidianScythe), new Object[] 
                    { recipe, '#', Block.obsidian, '|', InfiLibrary.stoneRod, 's', InfiLibrary.obsidianShard });
            ModLoader.addRecipe(new ItemStack(redstoneObsidianScythe), new Object[] 
                    { recipe, '#', Block.obsidian, '|', InfiLibrary.redstoneRod, 's', InfiLibrary.obsidianShard });
            ModLoader.addRecipe(new ItemStack(obsidianObsidianScythe), new Object[] 
                    { recipe, '#', Block.obsidian, '|', InfiLibrary.obsidianRod, 's', InfiLibrary.obsidianShard });
            ModLoader.addRecipe(new ItemStack(boneObsidianScythe), new Object[] 
                    { recipe, '#', Block.obsidian, '|', Item.bone, 's', InfiLibrary.obsidianShard });
            ModLoader.addRecipe(new ItemStack(boneObsidianScythe), new Object[] 
                    { recipe, '#', Block.obsidian, '|', InfiLibrary.boneRod, 's', InfiLibrary.obsidianShard });
            ModLoader.addRecipe(new ItemStack(netherrackObsidianScythe), new Object[] 
                    { recipe, '#', Block.obsidian, '|', InfiLibrary.netherrackRod, 's', InfiLibrary.obsidianShard });
            ModLoader.addRecipe(new ItemStack(glowstoneObsidianScythe), new Object[] 
                    { recipe, '#', Block.obsidian, '|', InfiLibrary.glowstoneRod, 's', InfiLibrary.obsidianShard });
            ModLoader.addRecipe(new ItemStack(iceObsidianScythe), new Object[] 
                    { recipe, '#', Block.obsidian, '|', InfiLibrary.iceRod, 's', InfiLibrary.obsidianShard });
            ModLoader.addRecipe(new ItemStack(lavaObsidianScythe), new Object[] 
                    { recipe, '#', Block.obsidian, '|', InfiLibrary.lavaRod, 's', InfiLibrary.obsidianShard });
            ModLoader.addRecipe(new ItemStack(cactusObsidianScythe), new Object[] 
                    { recipe, '#', Block.obsidian, '|', InfiLibrary.cactusRod, 's', InfiLibrary.obsidianShard });
        }
        
        if(PHInfiHybrids.enableSandstoneTools)
        {
            ModLoader.addRecipe(new ItemStack(woodSandstoneScythe), new Object[] 
                    { recipe, '#', Block.sandStone, '|', Item.stick, 's', InfiLibrary.sandstoneShard });
            ModLoader.addRecipe(new ItemStack(sandstoneSandstoneScythe), new Object[] 
                    { recipe, '#', Block.sandStone, '|', InfiLibrary.sandstoneRod, 's', InfiLibrary.sandstoneShard });
            ModLoader.addRecipe(new ItemStack(boneSandstoneScythe), new Object[] 
                    { recipe, '#', Block.sandStone, '|', Item.bone, 's', InfiLibrary.sandstoneShard });
            ModLoader.addRecipe(new ItemStack(boneSandstoneScythe), new Object[] 
                    { recipe, '#', Block.sandStone, '|', InfiLibrary.boneRod, 's', InfiLibrary.sandstoneShard });      
            ModLoader.addRecipe(new ItemStack(netherrackSandstoneScythe), new Object[] 
                    { recipe, '#', Block.sandStone, '|', InfiLibrary.netherrackRod, 's', InfiLibrary.sandstoneShard });
            ModLoader.addRecipe(new ItemStack(iceSandstoneScythe), new Object[] 
                    { recipe, '#', Block.sandStone, '|', InfiLibrary.iceRod, 's', InfiLibrary.sandstoneShard });
            ModLoader.addRecipe(new ItemStack(slimeSandstoneScythe), new Object[] 
                    { recipe, '#', Block.sandStone, '|', InfiLibrary.slimeRod, 's', InfiLibrary.sandstoneShard });
            ModLoader.addRecipe(new ItemStack(cactusSandstoneScythe), new Object[] 
                    { recipe, '#', Block.sandStone, '|', InfiLibrary.cactusRod, 's', InfiLibrary.sandstoneShard });
            ModLoader.addRecipe(new ItemStack(flintSandstoneScythe), new Object[] 
                    { recipe, '#', Block.sandStone, '|', InfiLibrary.flintRod, 's', InfiLibrary.sandstoneShard });
        }
        
        if(PHInfiHybrids.enableBoneTools)
        {
            ModLoader.addRecipe(new ItemStack(woodBoneScythe), new Object[] 
                    { recipe, '#', Item.bone, '|', Item.stick, 's', new ItemStack(Item.dyePowder, 1, 15) });
            ModLoader.addRecipe(new ItemStack(stoneBoneScythe), new Object[] 
                    { recipe, '#', Item.bone, '|', InfiLibrary.stoneRod, 's', new ItemStack(Item.dyePowder, 1, 15) });
            ModLoader.addRecipe(new ItemStack(sandstoneBoneScythe), new Object[] 
                    { recipe, '#', Item.bone, '|', InfiLibrary.sandstoneRod, 's', new ItemStack(Item.dyePowder, 1, 15) });
            ModLoader.addRecipe(new ItemStack(boneBoneScythe), new Object[] 
                    { recipe, '#', Item.bone, '|', Item.bone, 's', new ItemStack(Item.dyePowder, 1, 15) });
            ModLoader.addRecipe(new ItemStack(boneBoneScythe), new Object[] 
                    { recipe, '#', Item.bone, '|', InfiLibrary.boneRod, 's', new ItemStack(Item.dyePowder, 1, 15) });
            ModLoader.addRecipe(new ItemStack(paperBoneScythe), new Object[] 
                    { recipe, '#', Item.bone, '|', InfiLibrary.paperRod, 's', new ItemStack(Item.dyePowder, 1, 15) });
            ModLoader.addRecipe(new ItemStack(netherrackBoneScythe), new Object[] 
                    { recipe, '#', Item.bone, '|', InfiLibrary.netherrackRod, 's', new ItemStack(Item.dyePowder, 1, 15) });
            ModLoader.addRecipe(new ItemStack(iceBoneScythe), new Object[] 
                    { recipe, '#', Item.bone, '|', InfiLibrary.iceRod, 's', new ItemStack(Item.dyePowder, 1, 15) });
            ModLoader.addRecipe(new ItemStack(cactusBoneScythe), new Object[] 
                    { recipe, '#', Item.bone, '|', InfiLibrary.cactusRod, 's', new ItemStack(Item.dyePowder, 1, 15) });
            ModLoader.addRecipe(new ItemStack(flintBoneScythe), new Object[] 
                    { recipe, '#', Item.bone, '|', InfiLibrary.flintRod, 's', new ItemStack(Item.dyePowder, 1, 15) });
        }
        
        if(PHInfiHybrids.enablePaperTools)
        {
            ModLoader.addRecipe(new ItemStack(woodPaperScythe), new Object[] 
                    { recipe, '#', InfiLibrary.paperStack, '|', Item.stick, 's', Item.paper });
            ModLoader.addRecipe(new ItemStack(bonePaperScythe), new Object[] 
                    { recipe, '#', InfiLibrary.paperStack, '|', Item.bone, 's', Item.paper });
            ModLoader.addRecipe(new ItemStack(bonePaperScythe), new Object[] 
                    { recipe, '#', InfiLibrary.paperStack, '|', InfiLibrary.boneRod, 's', Item.paper });
            ModLoader.addRecipe(new ItemStack(paperPaperScythe), new Object[] 
                    { recipe, '#', InfiLibrary.paperStack, '|', InfiLibrary.paperRod, 's', Item.paper });
            ModLoader.addRecipe(new ItemStack(slimePaperScythe), new Object[] 
                    { recipe, '#', InfiLibrary.paperStack, '|', InfiLibrary.slimeRod, 's', Item.paper });
            ModLoader.addRecipe(new ItemStack(cactusPaperScythe), new Object[] 
                    { recipe, '#', InfiLibrary.paperStack, '|', InfiLibrary.cactusRod, 's', Item.paper });
        }
        
        if(PHInfiHybrids.enableMossyTools)
        {
        	ModLoader.addRecipe(new ItemStack(woodMossyScythe), new Object[] 
                    { recipe, '#', InfiLibrary.mossyStone, '|', Item.stick, 's', InfiLibrary.mossyPatch });
        	ModLoader.addRecipe(new ItemStack(stoneMossyScythe), new Object[] 
                    { recipe, '#', InfiLibrary.mossyStone, '|', InfiLibrary.stoneRod, 's', InfiLibrary.mossyPatch });
            ModLoader.addRecipe(new ItemStack(diamondMossyScythe), new Object[] 
                    { recipe, '#', InfiLibrary.mossyStone, '|', InfiLibrary.diamondRod, 's', InfiLibrary.mossyPatch });
            ModLoader.addRecipe(new ItemStack(redstoneMossyScythe), new Object[] 
                    { recipe, '#', InfiLibrary.mossyStone, '|', InfiLibrary.redstoneRod, 's', InfiLibrary.mossyPatch });
            ModLoader.addRecipe(new ItemStack(boneMossyScythe), new Object[] 
                    { recipe, '#', InfiLibrary.mossyStone, '|', Item.bone, 's', InfiLibrary.mossyPatch });
            ModLoader.addRecipe(new ItemStack(boneMossyScythe), new Object[] 
                    { recipe, '#', InfiLibrary.mossyStone, '|', InfiLibrary.boneRod, 's', InfiLibrary.mossyPatch });
            ModLoader.addRecipe(new ItemStack(mossyMossyScythe), new Object[] 
                    { recipe, '#', InfiLibrary.mossyStone, '|', InfiLibrary.mossyRod, 's', InfiLibrary.mossyPatch });
            ModLoader.addRecipe(new ItemStack(netherrackMossyScythe), new Object[] 
                    { recipe, '#', InfiLibrary.mossyStone, '|', InfiLibrary.netherrackRod, 's', InfiLibrary.mossyPatch });
            ModLoader.addRecipe(new ItemStack(glowstoneMossyScythe), new Object[] 
                    { recipe, '#', InfiLibrary.mossyStone, '|', InfiLibrary.glowstoneRod, 's', InfiLibrary.mossyPatch });
            ModLoader.addRecipe(new ItemStack(cactusMossyScythe), new Object[] 
                    { recipe, '#', InfiLibrary.mossyStone, '|', InfiLibrary.cactusRod, 's', InfiLibrary.mossyPatch });
            ModLoader.addRecipe(new ItemStack(blazeMossyScythe), new Object[] 
                    { recipe, '#', InfiLibrary.mossyStone, '|', Item.blazeRod, 's', InfiLibrary.mossyPatch });
            ModLoader.addRecipe(new ItemStack(manyullynMossyScythe), new Object[] 
                    { recipe, '#', InfiLibrary.mossyStone, '|', InfiLibrary.manyullynRod, 's', InfiLibrary.mossyPatch });
            ModLoader.addRecipe(new ItemStack(uraniumMossyScythe), new Object[] 
                    { recipe, '#', InfiLibrary.mossyStone, '|', InfiLibrary.uraniumRod, 's', InfiLibrary.mossyPatch });
        }
        
        if(PHInfiHybrids.enableNetherrackTools)
        {
        	ModLoader.addRecipe(new ItemStack(woodNetherrackScythe), new Object[] 
                    { recipe, '#', Block.netherrack, '|', Item.stick, 's', InfiLibrary.netherrackShard });
        	ModLoader.addRecipe(new ItemStack(stoneNetherrackScythe), new Object[] 
                    { recipe, '#', Block.netherrack, '|', InfiLibrary.stoneRod, 's', InfiLibrary.netherrackShard });
            ModLoader.addRecipe(new ItemStack(sandstoneNetherrackScythe), new Object[] 
                    { recipe, '#', Block.netherrack, '|', InfiLibrary.sandstoneRod, 's', InfiLibrary.netherrackShard });
            ModLoader.addRecipe(new ItemStack(boneNetherrackScythe), new Object[] 
                    { recipe, '#', Block.netherrack, '|', Item.bone, 's', InfiLibrary.netherrackShard });
            ModLoader.addRecipe(new ItemStack(boneNetherrackScythe), new Object[] 
                    { recipe, '#', Block.netherrack, '|', InfiLibrary.boneRod, 's', InfiLibrary.netherrackShard });
            ModLoader.addRecipe(new ItemStack(paperNetherrackScythe), new Object[] 
                    { recipe, '#', Block.netherrack, '|', InfiLibrary.paperRod, 's', InfiLibrary.netherrackShard });
            ModLoader.addRecipe(new ItemStack(mossyNetherrackScythe), new Object[] 
                    { recipe, '#', Block.netherrack, '|', InfiLibrary.mossyRod, 's', InfiLibrary.netherrackShard });
            ModLoader.addRecipe(new ItemStack(netherrackNetherrackScythe), new Object[] 
                    { recipe, '#', Block.netherrack, '|', InfiLibrary.netherrackRod, 's', InfiLibrary.netherrackShard });
            ModLoader.addRecipe(new ItemStack(iceNetherrackScythe), new Object[] 
                    { recipe, '#', Block.netherrack, '|', InfiLibrary.iceRod, 's', InfiLibrary.netherrackShard });
            ModLoader.addRecipe(new ItemStack(slimeNetherrackScythe), new Object[] 
                    { recipe, '#', Block.netherrack, '|', InfiLibrary.slimeRod, 's', InfiLibrary.netherrackShard });
            ModLoader.addRecipe(new ItemStack(cactusNetherrackScythe), new Object[] 
                    { recipe, '#', Block.netherrack, '|', InfiLibrary.cactusRod, 's', InfiLibrary.netherrackShard });
            ModLoader.addRecipe(new ItemStack(flintNetherrackScythe), new Object[] 
                    { recipe, '#', Block.netherrack, '|', InfiLibrary.flintRod, 's', InfiLibrary.netherrackShard });
            ModLoader.addRecipe(new ItemStack(copperNetherrackScythe), new Object[] 
                    { recipe, '#', Block.netherrack, '|', InfiLibrary.copperRod, 's', InfiLibrary.netherrackShard });
            ModLoader.addRecipe(new ItemStack(bronzeNetherrackScythe), new Object[] 
                    { recipe, '#', Block.netherrack, '|', InfiLibrary.bronzeRod, 's', InfiLibrary.netherrackShard });
        }
        
        if(PHInfiHybrids.enableGlowstoneTools)
        {
        	ModLoader.addRecipe(new ItemStack(woodGlowstoneScythe), new Object[] 
                    { recipe, '#', InfiLibrary.glowstoneCrystal, '|', Item.stick, 's', InfiLibrary.glowstoneFragment });
        	ModLoader.addRecipe(new ItemStack(redstoneGlowstoneScythe), new Object[] 
                    { recipe, '#', InfiLibrary.glowstoneCrystal, '|', InfiLibrary.glowstoneRod, 's', InfiLibrary.glowstoneFragment });
        	ModLoader.addRecipe(new ItemStack(obsidianGlowstoneScythe), new Object[] 
                    { recipe, '#', InfiLibrary.glowstoneCrystal, '|', InfiLibrary.obsidianRod, 's', InfiLibrary.glowstoneFragment });
            ModLoader.addRecipe(new ItemStack(boneGlowstoneScythe), new Object[] 
                    { recipe, '#', InfiLibrary.glowstoneCrystal, '|', Item.bone, 's', InfiLibrary.glowstoneFragment });
            ModLoader.addRecipe(new ItemStack(boneGlowstoneScythe), new Object[] 
                    { recipe, '#', InfiLibrary.glowstoneCrystal, '|', InfiLibrary.boneRod, 's', InfiLibrary.glowstoneFragment });
            ModLoader.addRecipe(new ItemStack(netherrackGlowstoneScythe), new Object[] 
                    { recipe, '#', InfiLibrary.glowstoneCrystal, '|', InfiLibrary.netherrackRod, 's', InfiLibrary.glowstoneFragment });
            ModLoader.addRecipe(new ItemStack(glowstoneGlowstoneScythe), new Object[] 
                    { recipe, '#', InfiLibrary.glowstoneCrystal, '|', InfiLibrary.glowstoneRod, 's', InfiLibrary.glowstoneFragment });
            ModLoader.addRecipe(new ItemStack(iceGlowstoneScythe), new Object[] 
                    { recipe, '#', InfiLibrary.glowstoneCrystal, '|', InfiLibrary.iceRod, 's', InfiLibrary.glowstoneFragment });
            ModLoader.addRecipe(new ItemStack(slimeGlowstoneScythe), new Object[] 
                    { recipe, '#', InfiLibrary.glowstoneCrystal, '|', InfiLibrary.slimeRod, 's', InfiLibrary.glowstoneFragment });
            ModLoader.addRecipe(new ItemStack(cactusGlowstoneScythe), new Object[] 
                    { recipe, '#', InfiLibrary.glowstoneCrystal, '|', InfiLibrary.cactusRod, 's', InfiLibrary.glowstoneFragment });
        }
        
        if(PHInfiHybrids.enableIceTools)
        {
            ModLoader.addRecipe(new ItemStack(woodIceScythe), new Object[] 
                    { recipe, '#', Block.ice, '|', Item.stick, 's', InfiLibrary.iceShard });
            ModLoader.addRecipe(new ItemStack(boneIceScythe), new Object[] 
                    { recipe, '#', Block.ice, '|', Item.bone, 's', InfiLibrary.iceShard });
            ModLoader.addRecipe(new ItemStack(boneIceScythe), new Object[] 
                    { recipe, '#', Block.ice, '|', InfiLibrary.boneRod, 's', InfiLibrary.iceShard });
            ModLoader.addRecipe(new ItemStack(paperIceScythe), new Object[] 
                    { recipe, '#', Block.ice, '|', InfiLibrary.paperRod, 's', InfiLibrary.iceShard });
            ModLoader.addRecipe(new ItemStack(iceIceScythe), new Object[] 
                    { recipe, '#', Block.ice, '|', InfiLibrary.iceRod, 's', InfiLibrary.iceShard });
            ModLoader.addRecipe(new ItemStack(slimeIceScythe), new Object[] 
                    { recipe, '#', Block.ice, '|', InfiLibrary.slimeRod, 's', InfiLibrary.iceShard });
            ModLoader.addRecipe(new ItemStack(cactusIceScythe), new Object[] 
                    { recipe, '#', Block.ice, '|', InfiLibrary.cactusRod, 's', InfiLibrary.iceShard });
        }
        
        if(PHInfiHybrids.enableLavaTools)
        {
            ModLoader.addRecipe(new ItemStack(diamondLavaScythe), new Object[] 
                    { recipe, '#', InfiLibrary.lavaCrystal, '|', InfiLibrary.diamondRod, 's', InfiLibrary.lavaFragment });
            ModLoader.addRecipe(new ItemStack(obsidianLavaScythe), new Object[] 
                    { recipe, '#', InfiLibrary.lavaCrystal, '|', InfiLibrary.obsidianRod, 's', InfiLibrary.lavaFragment });
            ModLoader.addRecipe(new ItemStack(netherrackLavaScythe), new Object[] 
                    { recipe, '#', InfiLibrary.lavaCrystal, '|', InfiLibrary.netherrackRod, 's', InfiLibrary.lavaFragment });
            ModLoader.addRecipe(new ItemStack(lavaLavaScythe), new Object[] 
                    { recipe, '#', InfiLibrary.lavaCrystal, '|', InfiLibrary.lavaRod, 's', InfiLibrary.lavaFragment });
            ModLoader.addRecipe(new ItemStack(flintLavaScythe), new Object[] 
                    { recipe, '#', InfiLibrary.lavaCrystal, '|', InfiLibrary.flintRod, 's', InfiLibrary.lavaFragment });
            ModLoader.addRecipe(new ItemStack(blazeLavaScythe), new Object[] 
                    { recipe, '#', InfiLibrary.lavaCrystal, '|', Item.blazeRod, 's', InfiLibrary.lavaFragment });
            ModLoader.addRecipe(new ItemStack(manyullynLavaScythe), new Object[] 
                    { recipe, '#', InfiLibrary.lavaCrystal, '|', InfiLibrary.manyullynRod, 's', InfiLibrary.lavaFragment });
            ModLoader.addRecipe(new ItemStack(uraniumLavaScythe), new Object[] 
                    { recipe, '#', InfiLibrary.lavaCrystal, '|', InfiLibrary.uraniumRod, 's', InfiLibrary.lavaFragment });
        }
        
        if(PHInfiHybrids.enableSlimeTools)
        {
            ModLoader.addRecipe(new ItemStack(woodSlimeScythe), new Object[] 
                    { recipe, '#', InfiLibrary.slimeCrystal, '|', Item.stick, 's', Item.slimeBall });
            ModLoader.addRecipe(new ItemStack(sandstoneSlimeScythe), new Object[] 
                    { recipe, '#', InfiLibrary.slimeCrystal, '|', InfiLibrary.sandstoneRod, 's', Item.slimeBall });
            ModLoader.addRecipe(new ItemStack(boneSlimeScythe), new Object[] 
                    { recipe, '#', InfiLibrary.slimeCrystal, '|', Item.bone, 's', Item.slimeBall });
            ModLoader.addRecipe(new ItemStack(boneSlimeScythe), new Object[] 
                    { recipe, '#', InfiLibrary.slimeCrystal, '|', InfiLibrary.boneRod, 's', Item.slimeBall });
            ModLoader.addRecipe(new ItemStack(paperSlimeScythe), new Object[] 
                    { recipe, '#', InfiLibrary.slimeCrystal, '|', InfiLibrary.paperRod, 's', Item.slimeBall });
            ModLoader.addRecipe(new ItemStack(slimeSlimeScythe), new Object[] 
                    { recipe, '#', InfiLibrary.slimeCrystal, '|', InfiLibrary.slimeRod, 's', Item.slimeBall });
            ModLoader.addRecipe(new ItemStack(cactusSlimeScythe), new Object[] 
                    { recipe, '#', InfiLibrary.slimeCrystal, '|', InfiLibrary.cactusRod, 's', Item.slimeBall });
        }
        
        if(PHInfiHybrids.enableCactusTools)
        {
            ModLoader.addRecipe(new ItemStack(woodCactusScythe), new Object[] 
                    { recipe, '#', Block.cactus, '|', Item.stick, 's', InfiLibrary.cactusShard });
            ModLoader.addRecipe(new ItemStack(sandstoneCactusScythe), new Object[] 
                    { recipe, '#', Block.cactus, '|', InfiLibrary.sandstoneRod, 's', InfiLibrary.cactusShard });
            ModLoader.addRecipe(new ItemStack(boneCactusScythe), new Object[] 
                    { recipe, '#', Block.cactus, '|', Item.bone, 's', InfiLibrary.cactusShard });
            ModLoader.addRecipe(new ItemStack(boneCactusScythe), new Object[] 
                    { recipe, '#', Block.cactus, '|', InfiLibrary.boneRod, 's', InfiLibrary.cactusShard });
            ModLoader.addRecipe(new ItemStack(netherrackCactusScythe), new Object[] 
                    { recipe, '#', Block.cactus, '|', InfiLibrary.netherrackRod, 's', InfiLibrary.cactusShard });
            ModLoader.addRecipe(new ItemStack(iceCactusScythe), new Object[] 
                    { recipe, '#', Block.cactus, '|', InfiLibrary.iceRod, 's', InfiLibrary.cactusShard });
            ModLoader.addRecipe(new ItemStack(slimeCactusScythe), new Object[] 
                    { recipe, '#', Block.cactus, '|', InfiLibrary.slimeRod, 's', InfiLibrary.cactusShard });
            ModLoader.addRecipe(new ItemStack(cactusCactusScythe), new Object[] 
                    { recipe, '#', Block.cactus, '|', InfiLibrary.cactusRod, 's', InfiLibrary.cactusShard });
        }
        
        if(PHInfiHybrids.enableFlintTools)
        {
        	ModLoader.addRecipe(new ItemStack(woodFlintScythe), new Object[] 
                    { recipe, '#', Item.flint, '|', Item.stick, 's', InfiLibrary.flintShard });
        	ModLoader.addRecipe(new ItemStack(stoneFlintScythe), new Object[] 
                    { recipe, '#', Item.flint, '|', InfiLibrary.stoneRod, 's', InfiLibrary.flintShard });
            ModLoader.addRecipe(new ItemStack(sandstoneFlintScythe), new Object[] 
                    { recipe, '#', Item.flint, '|', InfiLibrary.sandstoneRod, 's', InfiLibrary.flintShard });
            ModLoader.addRecipe(new ItemStack(boneFlintScythe), new Object[] 
                    { recipe, '#', Item.flint, '|', Item.bone, 's', InfiLibrary.flintShard });
            ModLoader.addRecipe(new ItemStack(boneFlintScythe), new Object[] 
                    { recipe, '#', Item.flint, '|', InfiLibrary.boneRod, 's', InfiLibrary.flintShard });
            ModLoader.addRecipe(new ItemStack(netherrackFlintScythe), new Object[] 
                    { recipe, '#', Item.flint, '|', InfiLibrary.netherrackRod, 's', InfiLibrary.flintShard });
            ModLoader.addRecipe(new ItemStack(slimeFlintScythe), new Object[] 
                    { recipe, '#', Item.flint, '|', InfiLibrary.slimeRod, 's', InfiLibrary.flintShard });
            ModLoader.addRecipe(new ItemStack(cactusFlintScythe), new Object[] 
                    { recipe, '#', Item.flint, '|', InfiLibrary.cactusRod, 's', InfiLibrary.flintShard });
            ModLoader.addRecipe(new ItemStack(flintFlintScythe), new Object[] 
                    { recipe, '#', Item.flint, '|', InfiLibrary.flintRod, 's', InfiLibrary.flintShard });
            ModLoader.addRecipe(new ItemStack(copperFlintScythe), new Object[] 
                    { recipe, '#', Item.flint, '|', InfiLibrary.copperRod, 's', InfiLibrary.flintShard });
            ModLoader.addRecipe(new ItemStack(bronzeFlintScythe), new Object[] 
                    { recipe, '#', Item.flint, '|', InfiLibrary.bronzeRod, 's', InfiLibrary.flintShard });
        }
        
        if(PHInfiHybrids.enableBlazeTools)
        {
            ModLoader.addRecipe(new ItemStack(diamondBlazeScythe), new Object[] 
                    { recipe, '#', InfiLibrary.blazeCrystal, '|', InfiLibrary.diamondRod, 's', InfiLibrary.blazeFragment });
            ModLoader.addRecipe(new ItemStack(obsidianBlazeScythe), new Object[] 
                    { recipe, '#', InfiLibrary.blazeCrystal, '|', InfiLibrary.obsidianRod, 's', InfiLibrary.blazeFragment });
            ModLoader.addRecipe(new ItemStack(netherrackBlazeScythe), new Object[] 
                    { recipe, '#', InfiLibrary.blazeCrystal, '|', InfiLibrary.netherrackRod, 's', InfiLibrary.blazeFragment });
            ModLoader.addRecipe(new ItemStack(lavaBlazeScythe), new Object[] 
                    { recipe, '#', InfiLibrary.blazeCrystal, '|', InfiLibrary.lavaRod, 's', InfiLibrary.blazeFragment });
            ModLoader.addRecipe(new ItemStack(flintBlazeScythe), new Object[] 
                    { recipe, '#', InfiLibrary.blazeCrystal, '|', InfiLibrary.flintRod, 's', InfiLibrary.blazeFragment });
            ModLoader.addRecipe(new ItemStack(blazeBlazeScythe), new Object[] 
                    { recipe, '#', InfiLibrary.blazeCrystal, '|', Item.blazeRod, 's', InfiLibrary.blazeFragment });
            ModLoader.addRecipe(new ItemStack(manyullynBlazeScythe), new Object[] 
                    { recipe, '#', InfiLibrary.blazeCrystal, '|', InfiLibrary.manyullynRod, 's', InfiLibrary.blazeFragment });
            ModLoader.addRecipe(new ItemStack(uraniumBlazeScythe), new Object[] 
                    { recipe, '#', InfiLibrary.blazeCrystal, '|', InfiLibrary.uraniumRod, 's', InfiLibrary.blazeFragment });
        }
    }
    
    public static void addStoneTools(String stack)
	{
		//GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(woodStoneScythe), recipe, '#', stack, '|', Item.stick ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(stoneStoneScythe), recipe, '#', stack, '|', InfiLibrary.stoneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(sandstoneStoneScythe), recipe, '#', stack, '|', InfiLibrary.sandstoneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(boneStoneScythe), recipe, '#', stack, '|', Item.bone ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(boneStoneScythe), recipe, '#', stack, '|', InfiLibrary.boneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(netherrackStoneScythe), recipe, '#', stack, '|', InfiLibrary.netherrackRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(iceStoneScythe), recipe, '#', stack, '|', InfiLibrary.iceRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(slimeStoneScythe), recipe, '#', stack, '|', InfiLibrary.slimeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(cactusStoneScythe), recipe, '#', stack, '|', InfiLibrary.cactusRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(flintStoneScythe), recipe, '#', stack, '|', InfiLibrary.flintRod ) );
	}

	public static void addCopperTools(String stack)
	{
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(woodCopperScythe), recipe, '#', stack, '|', Item.stick ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(stoneCopperScythe), recipe, '#', stack, '|', InfiLibrary.stoneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(boneCopperScythe), recipe, '#', stack, '|', Item.bone ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(boneCopperScythe), recipe, '#', stack, '|', InfiLibrary.boneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(netherrackCopperScythe), recipe, '#', stack, '|', InfiLibrary.netherrackRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(slimeCopperScythe), recipe, '#', stack, '|', InfiLibrary.slimeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(cactusCopperScythe), recipe, '#', stack, '|', InfiLibrary.cactusRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(flintCopperScythe), recipe, '#', stack, '|', InfiLibrary.flintRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(copperCopperScythe), recipe, '#', stack, '|', InfiLibrary.copperRod ) );
	}

	public static void addBronzeTools(String stack)
	{
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(woodBronzeScythe), recipe, '#', stack, '|', Item.stick ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(stoneBronzeScythe), recipe, '#', stack, '|', InfiLibrary.stoneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(boneBronzeScythe), recipe, '#', stack, '|', Item.bone ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(boneBronzeScythe), recipe, '#', stack, '|', InfiLibrary.boneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(netherrackBronzeScythe), recipe, '#', stack, '|', InfiLibrary.netherrackRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(slimeBronzeScythe), recipe, '#', stack, '|', InfiLibrary.slimeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(cactusBronzeScythe), recipe, '#', stack, '|', InfiLibrary.cactusRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(flintBronzeScythe), recipe, '#', stack, '|', InfiLibrary.flintRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(copperBronzeScythe), recipe, '#', stack, '|', InfiLibrary.copperRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(bronzeBronzeScythe), recipe, '#', stack, '|', InfiLibrary.bronzeRod ) );
	}

	public static void addWorkedIronTools(String stack)
	{
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(woodWorkedIronScythe), recipe, '#', stack, '|', Item.stick ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(stoneWorkedIronScythe), recipe, '#', stack, '|', InfiLibrary.stoneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(ironWorkedIronScythe), recipe, '#', stack, '|', InfiLibrary.ironRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(diamondWorkedIronScythe), recipe, '#', stack, '|', InfiLibrary.diamondRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(redstoneWorkedIronScythe), recipe, '#', stack, '|', InfiLibrary.redstoneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(obsidianWorkedIronScythe), recipe, '#', stack, '|', InfiLibrary.obsidianRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(boneWorkedIronScythe), recipe, '#', stack, '|', Item.bone ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(boneWorkedIronScythe), recipe, '#', stack, '|', InfiLibrary.boneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(netherrackWorkedIronScythe), recipe, '#', stack, '|', InfiLibrary.netherrackRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(glowstoneWorkedIronScythe), recipe, '#', stack, '|', InfiLibrary.glowstoneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(iceWorkedIronScythe), recipe, '#', stack, '|', InfiLibrary.iceRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(slimeWorkedIronScythe), recipe, '#', stack, '|', InfiLibrary.slimeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(cactusWorkedIronScythe), recipe, '#', stack, '|', InfiLibrary.cactusRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(blazeWorkedIronScythe), recipe, '#', stack, '|', Item.blazeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(copperWorkedIronScythe), recipe, '#', stack, '|', InfiLibrary.copperRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(bronzeWorkedIronScythe), recipe, '#', stack, '|', InfiLibrary.bronzeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(workedWorkedIronScythe), recipe, '#', stack, '|', InfiLibrary.workedIronRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(steelWorkedIronScythe), recipe, '#', stack, '|', InfiLibrary.steelRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(uraniumWorkedIronScythe), recipe, '#', stack, '|', InfiLibrary.uraniumRod ) );
	}

	public static void addSteelTools(String stack)
	{
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(woodSteelScythe), recipe, '#', stack, '|', Item.stick ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(stoneSteelScythe), recipe, '#', stack, '|', InfiLibrary.stoneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(ironSteelScythe), recipe, '#', stack, '|', InfiLibrary.ironRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(diamondSteelScythe), recipe, '#', stack, '|', InfiLibrary.diamondRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(redstoneSteelScythe), recipe, '#', stack, '|', InfiLibrary.redstoneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(obsidianSteelScythe), recipe, '#', stack, '|', InfiLibrary.obsidianRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(boneSteelScythe), recipe, '#', stack, '|', Item.bone ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(boneSteelScythe), recipe, '#', stack, '|', InfiLibrary.boneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(netherrackSteelScythe), recipe, '#', stack, '|', InfiLibrary.netherrackRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(glowstoneSteelScythe), recipe, '#', stack, '|', InfiLibrary.glowstoneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(iceSteelScythe), recipe, '#', stack, '|', InfiLibrary.iceRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(slimeSteelScythe), recipe, '#', stack, '|', InfiLibrary.slimeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(cactusSteelScythe), recipe, '#', stack, '|', InfiLibrary.cactusRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(blazeSteelScythe), recipe, '#', stack, '|', Item.blazeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(copperSteelScythe), recipe, '#', stack, '|', InfiLibrary.copperRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(bronzeSteelScythe), recipe, '#', stack, '|', InfiLibrary.bronzeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(workedSteelScythe), recipe, '#', stack, '|', InfiLibrary.workedIronRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(steelSteelScythe), recipe, '#', stack, '|', InfiLibrary.steelRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(cobaltSteelScythe), recipe, '#', stack, '|', InfiLibrary.cobaltRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(arditeSteelScythe), recipe, '#', stack, '|', InfiLibrary.arditeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(uraniumSteelScythe), recipe, '#', stack, '|', InfiLibrary.uraniumRod ) );
	}

	public static void addCobaltTools(String stack)
	{
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(woodCobaltScythe), recipe, '#', stack, '|', Item.stick ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(stoneCobaltScythe), recipe, '#', stack, '|', InfiLibrary.stoneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(ironCobaltScythe), recipe, '#', stack, '|', InfiLibrary.ironRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(diamondCobaltScythe), recipe, '#', stack, '|', InfiLibrary.diamondRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(redstoneCobaltScythe), recipe, '#', stack, '|', InfiLibrary.redstoneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(obsidianCobaltScythe), recipe, '#', stack, '|', InfiLibrary.obsidianRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(boneCobaltScythe), recipe, '#', stack, '|', Item.bone ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(boneCobaltScythe), recipe, '#', stack, '|', InfiLibrary.boneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(slimeCobaltScythe), recipe, '#', stack, '|', InfiLibrary.slimeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(cactusCobaltScythe), recipe, '#', stack, '|', InfiLibrary.cactusRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(blazeCobaltScythe), recipe, '#', stack, '|', Item.blazeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(copperCobaltScythe), recipe, '#', stack, '|', InfiLibrary.copperRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(bronzeCobaltScythe), recipe, '#', stack, '|', InfiLibrary.bronzeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(workedCobaltScythe), recipe, '#', stack, '|', InfiLibrary.workedIronRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(steelCobaltScythe), recipe, '#', stack, '|', InfiLibrary.steelRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(cobaltCobaltScythe), recipe, '#', stack, '|', InfiLibrary.cobaltRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(arditeCobaltScythe), recipe, '#', stack, '|', InfiLibrary.arditeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(manyullynCobaltScythe), recipe, '#', stack, '|', InfiLibrary.manyullynRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(uraniumCobaltScythe), recipe, '#', stack, '|', InfiLibrary.uraniumRod ) );
	}

	public static void addArditeTools(String stack)
	{
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(woodArditeScythe), recipe, '#', stack, '|', Item.stick ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(stoneArditeScythe), recipe, '#', stack, '|', InfiLibrary.stoneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(ironArditeScythe), recipe, '#', stack, '|', InfiLibrary.ironRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(diamondArditeScythe), recipe, '#', stack, '|', InfiLibrary.diamondRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(redstoneArditeScythe), recipe, '#', stack, '|', InfiLibrary.redstoneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(obsidianArditeScythe), recipe, '#', stack, '|', InfiLibrary.obsidianRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(boneArditeScythe), recipe, '#', stack, '|', Item.bone ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(boneArditeScythe), recipe, '#', stack, '|', InfiLibrary.boneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(slimeArditeScythe), recipe, '#', stack, '|', InfiLibrary.slimeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(cactusArditeScythe), recipe, '#', stack, '|', InfiLibrary.cactusRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(blazeArditeScythe), recipe, '#', stack, '|', Item.blazeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(copperArditeScythe), recipe, '#', stack, '|', InfiLibrary.copperRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(bronzeArditeScythe), recipe, '#', stack, '|', InfiLibrary.bronzeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(workedArditeScythe), recipe, '#', stack, '|', InfiLibrary.workedIronRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(steelArditeScythe), recipe, '#', stack, '|', InfiLibrary.steelRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(cobaltArditeScythe), recipe, '#', stack, '|', InfiLibrary.cobaltRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(arditeArditeScythe), recipe, '#', stack, '|', InfiLibrary.arditeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(manyullynArditeScythe), recipe, '#', stack, '|', InfiLibrary.manyullynRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(uraniumArditeScythe), recipe, '#', stack, '|', InfiLibrary.uraniumRod ) );
	}

	public static void addManyullynTools(String stack)
	{
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(woodManyullynScythe), recipe, '#', stack, '|', Item.stick ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(stoneManyullynScythe), recipe, '#', stack, '|', InfiLibrary.stoneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(ironManyullynScythe), recipe, '#', stack, '|', InfiLibrary.ironRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(diamondManyullynScythe), recipe, '#', stack, '|', InfiLibrary.diamondRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(redstoneManyullynScythe), recipe, '#', stack, '|', InfiLibrary.redstoneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(obsidianManyullynScythe), recipe, '#', stack, '|', InfiLibrary.obsidianRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(boneManyullynScythe), recipe, '#', stack, '|', Item.bone ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(boneManyullynScythe), recipe, '#', stack, '|', InfiLibrary.boneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(slimeManyullynScythe), recipe, '#', stack, '|', InfiLibrary.slimeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(cactusManyullynScythe), recipe, '#', stack, '|', InfiLibrary.cactusRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(blazeManyullynScythe), recipe, '#', stack, '|', Item.blazeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(copperManyullynScythe), recipe, '#', stack, '|', InfiLibrary.copperRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(bronzeManyullynScythe), recipe, '#', stack, '|', InfiLibrary.bronzeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(workedManyullynScythe), recipe, '#', stack, '|', InfiLibrary.workedIronRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(steelManyullynScythe), recipe, '#', stack, '|', InfiLibrary.steelRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(cobaltManyullynScythe), recipe, '#', stack, '|', InfiLibrary.cobaltRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(arditeManyullynScythe), recipe, '#', stack, '|', InfiLibrary.arditeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(manyullynManyullynScythe), recipe, '#', stack, '|', InfiLibrary.manyullynRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(uraniumManyullynScythe), recipe, '#', stack, '|', InfiLibrary.uraniumRod ) );
	}

	public static void addUraniumTools(String stack)
	{
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(diamondUraniumScythe), recipe, '#', stack, '|', InfiLibrary.diamondRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(redstoneUraniumScythe), recipe, '#', stack, '|', InfiLibrary.redstoneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(boneUraniumScythe), recipe, '#', stack, '|', Item.bone ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(boneUraniumScythe), recipe, '#', stack, '|', InfiLibrary.boneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(netherrackUraniumScythe), recipe, '#', stack, '|', InfiLibrary.netherrackRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(glowstoneUraniumScythe), recipe, '#', stack, '|', InfiLibrary.glowstoneRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(lavaUraniumScythe), recipe, '#', stack, '|', InfiLibrary.lavaRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(blazeUraniumScythe), recipe, '#', stack, '|', Item.blazeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(cobaltUraniumScythe), recipe, '#', stack, '|', InfiLibrary.cobaltRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(arditeUraniumScythe), recipe, '#', stack, '|', InfiLibrary.arditeRod ) );
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(uraniumUraniumScythe), recipe, '#', stack, '|', InfiLibrary.uraniumRod ) );
	}
    
	public static Item woodWoodScythe;
	public static Item sandstoneWoodScythe;
	public static Item boneWoodScythe;
	public static Item paperWoodScythe;
	public static Item iceWoodScythe;
	public static Item slimeWoodScythe;
	public static Item cactusWoodScythe;
	
	public static Item woodStoneScythe;
	public static Item stoneStoneScythe;
	public static Item sandstoneStoneScythe;
	public static Item boneStoneScythe;
	public static Item netherrackStoneScythe;
	public static Item iceStoneScythe;
	public static Item slimeStoneScythe;
	public static Item cactusStoneScythe;
	public static Item flintStoneScythe;
	
	public static Item woodIronScythe;
	public static Item stoneIronScythe;
	public static Item ironIronScythe;
	public static Item boneIronScythe;
	public static Item netherrackIronScythe;
	public static Item glowstoneIronScythe;
	public static Item cactusIronScythe;
	public static Item copperIronScythe;
	public static Item bronzeIronScythe;
	
	public static Item woodDiamondScythe;
	public static Item stoneDiamondScythe;
	public static Item ironDiamondScythe;
	public static Item diamondDiamondScythe;
	public static Item redstoneDiamondScythe;
	public static Item obsidianDiamondScythe;
	public static Item boneDiamondScythe;
	public static Item mossyDiamondScythe;
	public static Item netherrackDiamondScythe;
	public static Item glowstoneDiamondScythe;
	public static Item lavaDiamondScythe;
	public static Item cactusDiamondScythe;
	public static Item flintDiamondScythe;
	public static Item blazeDiamondScythe;
	public static Item copperDiamondScythe;
	public static Item bronzeDiamondScythe;
	public static Item workedDiamondScythe;
	public static Item steelDiamondScythe;
	public static Item cobaltDiamondScythe;
	public static Item arditeDiamondScythe;
	public static Item manyullynDiamondScythe;
	public static Item uraniumDiamondScythe;
	
	public static Item woodRedstoneScythe;
	public static Item stoneRedstoneScythe;
	public static Item ironRedstoneScythe;
	public static Item redstoneRedstoneScythe;
	public static Item obsidianRedstoneScythe;
	public static Item sandstoneRedstoneScythe;
	public static Item boneRedstoneScythe;
	public static Item paperRedstoneScythe;
	public static Item mossyRedstoneScythe;
	public static Item netherrackRedstoneScythe;
	public static Item glowstoneRedstoneScythe;
	public static Item iceRedstoneScythe;
	public static Item lavaRedstoneScythe;
	public static Item slimeRedstoneScythe;
	public static Item cactusRedstoneScythe;
	public static Item flintRedstoneScythe;
	public static Item copperRedstoneScythe;
	public static Item bronzeRedstoneScythe;
	public static Item workedRedstoneScythe;
	public static Item uraniumRedstoneScythe;
	
	public static Item woodObsidianScythe;
	public static Item stoneObsidianScythe;
	public static Item redstoneObsidianScythe;
	public static Item obsidianObsidianScythe;
	public static Item boneObsidianScythe;
	public static Item netherrackObsidianScythe;
	public static Item glowstoneObsidianScythe;
	public static Item iceObsidianScythe;
	public static Item lavaObsidianScythe;
	public static Item cactusObsidianScythe;
	
	public static Item woodSandstoneScythe;
	public static Item sandstoneSandstoneScythe;
	public static Item boneSandstoneScythe;
	public static Item netherrackSandstoneScythe;
	public static Item iceSandstoneScythe;
	public static Item slimeSandstoneScythe;
	public static Item cactusSandstoneScythe;
	public static Item flintSandstoneScythe;
	
	public static Item woodBoneScythe;
	public static Item stoneBoneScythe;
	public static Item sandstoneBoneScythe;
	public static Item boneBoneScythe;
	public static Item paperBoneScythe;
	public static Item netherrackBoneScythe;
	public static Item iceBoneScythe;
	public static Item cactusBoneScythe;
	public static Item flintBoneScythe;
	
	public static Item woodPaperScythe;
	public static Item bonePaperScythe;
	public static Item paperPaperScythe;
	public static Item slimePaperScythe;
	public static Item cactusPaperScythe;
	
	public static Item woodMossyScythe;
	public static Item stoneMossyScythe;
	public static Item diamondMossyScythe;
	public static Item redstoneMossyScythe;
	public static Item boneMossyScythe;
	public static Item mossyMossyScythe;
	public static Item netherrackMossyScythe;
	public static Item glowstoneMossyScythe;
	public static Item cactusMossyScythe;
	public static Item blazeMossyScythe;
	public static Item manyullynMossyScythe;
	public static Item uraniumMossyScythe;
	
	public static Item woodNetherrackScythe;
	public static Item stoneNetherrackScythe;
	public static Item sandstoneNetherrackScythe;
	public static Item boneNetherrackScythe;
	public static Item paperNetherrackScythe;
	public static Item mossyNetherrackScythe;
	public static Item netherrackNetherrackScythe;
	public static Item iceNetherrackScythe;
	public static Item slimeNetherrackScythe;
	public static Item cactusNetherrackScythe;
	public static Item flintNetherrackScythe;
	public static Item copperNetherrackScythe;
	public static Item bronzeNetherrackScythe;
	
	public static Item woodGlowstoneScythe;
	public static Item redstoneGlowstoneScythe;
	public static Item obsidianGlowstoneScythe;
	public static Item boneGlowstoneScythe;
	public static Item netherrackGlowstoneScythe;
	public static Item glowstoneGlowstoneScythe;
	public static Item iceGlowstoneScythe;
	public static Item slimeGlowstoneScythe;
	public static Item cactusGlowstoneScythe;
	
	public static Item woodIceScythe;
	public static Item boneIceScythe;
	public static Item paperIceScythe;
	public static Item iceIceScythe;
	public static Item slimeIceScythe;
	public static Item cactusIceScythe;
	
	public static Item diamondLavaScythe;
	public static Item obsidianLavaScythe;
	public static Item netherrackLavaScythe;
	public static Item lavaLavaScythe;
	public static Item flintLavaScythe;
	public static Item blazeLavaScythe;
	public static Item manyullynLavaScythe;
	public static Item uraniumLavaScythe;
	
	public static Item woodSlimeScythe;
	public static Item sandstoneSlimeScythe;
	public static Item boneSlimeScythe;
	public static Item paperSlimeScythe;
	public static Item slimeSlimeScythe;
	public static Item cactusSlimeScythe;
	
	public static Item woodCactusScythe;
	public static Item sandstoneCactusScythe;
	public static Item boneCactusScythe;
	public static Item netherrackCactusScythe;
	public static Item iceCactusScythe;
	public static Item slimeCactusScythe;
	public static Item cactusCactusScythe;
	
	public static Item woodFlintScythe;
	public static Item stoneFlintScythe;
	public static Item sandstoneFlintScythe;
	public static Item boneFlintScythe;
	public static Item netherrackFlintScythe;
	public static Item slimeFlintScythe;
	public static Item cactusFlintScythe;
	public static Item flintFlintScythe;
	public static Item copperFlintScythe;
	public static Item bronzeFlintScythe;
	
	public static Item diamondBlazeScythe;
	public static Item obsidianBlazeScythe;
	public static Item netherrackBlazeScythe;
	public static Item lavaBlazeScythe;
	public static Item flintBlazeScythe;
	public static Item blazeBlazeScythe;
	public static Item manyullynBlazeScythe;
	public static Item uraniumBlazeScythe;
	
	public static Item woodCopperScythe;
	public static Item stoneCopperScythe;
    public static Item boneCopperScythe;
    public static Item netherrackCopperScythe;
    public static Item slimeCopperScythe;
    public static Item cactusCopperScythe;
    public static Item flintCopperScythe;
    public static Item copperCopperScythe;
    
    public static Item woodBronzeScythe;
    public static Item stoneBronzeScythe;
    public static Item boneBronzeScythe;
    public static Item netherrackBronzeScythe;
    public static Item slimeBronzeScythe;
    public static Item cactusBronzeScythe;
    public static Item flintBronzeScythe;
    public static Item copperBronzeScythe;
    public static Item bronzeBronzeScythe;
    
    public static Item woodWorkedIronScythe;
    public static Item stoneWorkedIronScythe;
    public static Item ironWorkedIronScythe;
    public static Item diamondWorkedIronScythe;
    public static Item redstoneWorkedIronScythe;
    public static Item obsidianWorkedIronScythe;
    public static Item boneWorkedIronScythe;
    public static Item netherrackWorkedIronScythe;
    public static Item glowstoneWorkedIronScythe;
    public static Item iceWorkedIronScythe;
    public static Item slimeWorkedIronScythe;
    public static Item cactusWorkedIronScythe;
    public static Item blazeWorkedIronScythe;
    public static Item copperWorkedIronScythe;
    public static Item bronzeWorkedIronScythe;
    public static Item workedWorkedIronScythe;
    public static Item steelWorkedIronScythe;
    public static Item uraniumWorkedIronScythe;
    
    public static Item woodSteelScythe;
    public static Item stoneSteelScythe;
    public static Item ironSteelScythe;
    public static Item diamondSteelScythe;
    public static Item redstoneSteelScythe;
    public static Item obsidianSteelScythe;
    public static Item boneSteelScythe;
    public static Item netherrackSteelScythe;
    public static Item glowstoneSteelScythe;
    public static Item iceSteelScythe;
    public static Item slimeSteelScythe;
    public static Item cactusSteelScythe;
    public static Item blazeSteelScythe;
    public static Item copperSteelScythe;
    public static Item bronzeSteelScythe;
    public static Item workedSteelScythe;
    public static Item steelSteelScythe;
    public static Item cobaltSteelScythe;
    public static Item arditeSteelScythe;
    public static Item uraniumSteelScythe;
    
    public static Item woodCobaltScythe;
    public static Item stoneCobaltScythe;
    public static Item ironCobaltScythe;
    public static Item diamondCobaltScythe;
    public static Item redstoneCobaltScythe;
    public static Item obsidianCobaltScythe;
    public static Item boneCobaltScythe;
    public static Item slimeCobaltScythe;
    public static Item cactusCobaltScythe;
    public static Item blazeCobaltScythe;
    public static Item copperCobaltScythe;
    public static Item bronzeCobaltScythe;
    public static Item workedCobaltScythe;
    public static Item steelCobaltScythe;
    public static Item cobaltCobaltScythe;
    public static Item arditeCobaltScythe;
    public static Item manyullynCobaltScythe;
    public static Item uraniumCobaltScythe;
    
    public static Item woodArditeScythe;
    public static Item stoneArditeScythe;
    public static Item ironArditeScythe;
    public static Item diamondArditeScythe;
    public static Item redstoneArditeScythe;
    public static Item obsidianArditeScythe;
    public static Item boneArditeScythe;
    public static Item slimeArditeScythe;
    public static Item cactusArditeScythe;
    public static Item blazeArditeScythe;
    public static Item copperArditeScythe;
    public static Item bronzeArditeScythe;
    public static Item workedArditeScythe;
    public static Item steelArditeScythe;
    public static Item cobaltArditeScythe;
    public static Item arditeArditeScythe;
    public static Item manyullynArditeScythe;
    public static Item uraniumArditeScythe;
    
    public static Item woodManyullynScythe;
    public static Item stoneManyullynScythe;
    public static Item ironManyullynScythe;
    public static Item diamondManyullynScythe;
    public static Item redstoneManyullynScythe;
    public static Item obsidianManyullynScythe;
    public static Item boneManyullynScythe;
    public static Item slimeManyullynScythe;
    public static Item cactusManyullynScythe;
    public static Item blazeManyullynScythe;
    public static Item copperManyullynScythe;
    public static Item bronzeManyullynScythe;
    public static Item workedManyullynScythe;
    public static Item steelManyullynScythe;
    public static Item cobaltManyullynScythe;
    public static Item arditeManyullynScythe;
    public static Item manyullynManyullynScythe;
    public static Item uraniumManyullynScythe;
    
    public static Item diamondUraniumScythe;
    public static Item redstoneUraniumScythe;
    public static Item boneUraniumScythe;
    public static Item netherrackUraniumScythe;
    public static Item glowstoneUraniumScythe;
    public static Item lavaUraniumScythe;
    public static Item blazeUraniumScythe;
    public static Item cobaltUraniumScythe;
    public static Item arditeUraniumScythe;
    public static Item uraniumUraniumScythe;
}
