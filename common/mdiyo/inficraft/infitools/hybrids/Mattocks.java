package mDiyo.inficraft.infitools.hybrids;
import mDiyo.inficraft.infitools.library.InfiLibrary;
import mDiyo.inficraft.infitools.library.InfiMaterialEnum;
import net.minecraft.src.Block;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;
import net.minecraft.src.ModLoader;
import net.minecraftforge.common.MinecraftForge;

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
        }
        else
        {
        	createVanillaTools();
        	registerVanillaRecipes();
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
    	
    	MinecraftForge.setToolClass(woodWoodMattock, "pickaxe", InfiMaterialEnum.Wood.getHarvestLevel());
    	MinecraftForge.setToolClass(woodStoneMattock, "pickaxe", InfiMaterialEnum.Stone.getHarvestLevel());
    	MinecraftForge.setToolClass(woodIronMattock, "pickaxe", InfiMaterialEnum.Iron.getHarvestLevel());
    	MinecraftForge.setToolClass(woodDiamondMattock, "pickaxe", InfiMaterialEnum.Diamond.getHarvestLevel());
    	
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
    		
    		MinecraftForge.setToolClass(woodWoodMattock, "pickaxe", InfiMaterialEnum.Wood.getHarvestLevel());
    		MinecraftForge.setToolClass(sandstoneWoodMattock, "pickaxe", InfiMaterialEnum.Wood.getHarvestLevel());
    		MinecraftForge.setToolClass(boneWoodMattock, "pickaxe", InfiMaterialEnum.Wood.getHarvestLevel());
    		MinecraftForge.setToolClass(paperWoodMattock, "pickaxe", InfiMaterialEnum.Wood.getHarvestLevel());
    		MinecraftForge.setToolClass(iceWoodMattock, "pickaxe", InfiMaterialEnum.Wood.getHarvestLevel());
    		MinecraftForge.setToolClass(slimeWoodMattock, "pickaxe", InfiMaterialEnum.Wood.getHarvestLevel());
    		MinecraftForge.setToolClass(cactusWoodMattock, "pickaxe", InfiMaterialEnum.Wood.getHarvestLevel());
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
            
            MinecraftForge.setToolClass(woodStoneMattock, "pickaxe", InfiMaterialEnum.Stone.getHarvestLevel());
            MinecraftForge.setToolClass(stoneStoneMattock, "pickaxe", InfiMaterialEnum.Stone.getHarvestLevel());
            MinecraftForge.setToolClass(sandstoneStoneMattock, "pickaxe", InfiMaterialEnum.Stone.getHarvestLevel());
            MinecraftForge.setToolClass(boneStoneMattock, "pickaxe", InfiMaterialEnum.Stone.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackStoneMattock, "pickaxe", InfiMaterialEnum.Stone.getHarvestLevel());
            MinecraftForge.setToolClass(iceStoneMattock, "pickaxe", InfiMaterialEnum.Stone.getHarvestLevel());
            MinecraftForge.setToolClass(slimeStoneMattock, "pickaxe", InfiMaterialEnum.Stone.getHarvestLevel());
            MinecraftForge.setToolClass(cactusStoneMattock, "pickaxe", InfiMaterialEnum.Stone.getHarvestLevel());
            MinecraftForge.setToolClass(flintStoneMattock, "pickaxe", InfiMaterialEnum.Stone.getHarvestLevel());
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
            
            MinecraftForge.setToolClass(woodIronMattock, "pickaxe", InfiMaterialEnum.Iron.getHarvestLevel());
            MinecraftForge.setToolClass(stoneIronMattock, "pickaxe", InfiMaterialEnum.Iron.getHarvestLevel());
            MinecraftForge.setToolClass(ironIronMattock, "pickaxe", InfiMaterialEnum.Iron.getHarvestLevel());
            MinecraftForge.setToolClass(boneIronMattock, "pickaxe", InfiMaterialEnum.Iron.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackIronMattock, "pickaxe", InfiMaterialEnum.Iron.getHarvestLevel());
            MinecraftForge.setToolClass(glowstoneIronMattock, "pickaxe", InfiMaterialEnum.Iron.getHarvestLevel());
            MinecraftForge.setToolClass(cactusIronMattock, "pickaxe", InfiMaterialEnum.Iron.getHarvestLevel());
            MinecraftForge.setToolClass(copperIronMattock, "pickaxe", InfiMaterialEnum.Iron.getHarvestLevel());
            MinecraftForge.setToolClass(bronzeIronMattock, "pickaxe", InfiMaterialEnum.Iron.getHarvestLevel());
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
            
            MinecraftForge.setToolClass(woodDiamondMattock, "pickaxe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(stoneDiamondMattock, "pickaxe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(ironDiamondMattock, "pickaxe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(diamondDiamondMattock, "pickaxe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(redstoneDiamondMattock, "pickaxe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(obsidianDiamondMattock, "pickaxe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(boneDiamondMattock, "pickaxe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(mossyDiamondMattock, "pickaxe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackDiamondMattock, "pickaxe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(glowstoneDiamondMattock, "pickaxe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(lavaDiamondMattock, "pickaxe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(cactusDiamondMattock, "pickaxe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(flintDiamondMattock, "pickaxe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(blazeDiamondMattock, "pickaxe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(copperDiamondMattock, "pickaxe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(bronzeDiamondMattock, "pickaxe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(workedDiamondMattock, "pickaxe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(steelDiamondMattock, "pickaxe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(cobaltDiamondMattock, "pickaxe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(arditeDiamondMattock, "pickaxe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(manyullynDiamondMattock, "pickaxe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(uraniumDiamondMattock, "pickaxe", InfiMaterialEnum.Diamond.getHarvestLevel());
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
            
            MinecraftForge.setToolClass(woodRedstoneMattock, "pickaxe", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(stoneRedstoneMattock, "pickaxe", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(ironRedstoneMattock, "pickaxe", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(redstoneRedstoneMattock, "pickaxe", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(obsidianRedstoneMattock, "pickaxe", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(sandstoneRedstoneMattock, "pickaxe", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(boneRedstoneMattock, "pickaxe", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(paperRedstoneMattock, "pickaxe", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(mossyRedstoneMattock, "pickaxe", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackRedstoneMattock, "pickaxe", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(glowstoneRedstoneMattock, "pickaxe", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(iceRedstoneMattock, "pickaxe", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(lavaRedstoneMattock, "pickaxe", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(slimeRedstoneMattock, "pickaxe", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(cactusRedstoneMattock, "pickaxe", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(flintRedstoneMattock, "pickaxe", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(copperRedstoneMattock, "pickaxe", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(bronzeRedstoneMattock, "pickaxe", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(workedRedstoneMattock, "pickaxe", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(uraniumRedstoneMattock, "pickaxe", InfiMaterialEnum.Redstone.getHarvestLevel());
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
            
            MinecraftForge.setToolClass(woodObsidianMattock, "pickaxe", InfiMaterialEnum.Obsidian.getHarvestLevel());
            MinecraftForge.setToolClass(stoneObsidianMattock, "pickaxe", InfiMaterialEnum.Obsidian.getHarvestLevel());
            MinecraftForge.setToolClass(redstoneObsidianMattock, "pickaxe", InfiMaterialEnum.Obsidian.getHarvestLevel());
            MinecraftForge.setToolClass(obsidianObsidianMattock, "pickaxe", InfiMaterialEnum.Obsidian.getHarvestLevel());
            MinecraftForge.setToolClass(boneObsidianMattock, "pickaxe", InfiMaterialEnum.Obsidian.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackObsidianMattock, "pickaxe", InfiMaterialEnum.Obsidian.getHarvestLevel());
            MinecraftForge.setToolClass(glowstoneObsidianMattock, "pickaxe", InfiMaterialEnum.Obsidian.getHarvestLevel());
            MinecraftForge.setToolClass(iceObsidianMattock, "pickaxe", InfiMaterialEnum.Obsidian.getHarvestLevel());
            MinecraftForge.setToolClass(lavaObsidianMattock, "pickaxe", InfiMaterialEnum.Obsidian.getHarvestLevel());
            MinecraftForge.setToolClass(cactusObsidianMattock, "pickaxe", InfiMaterialEnum.Obsidian.getHarvestLevel());
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
            
            MinecraftForge.setToolClass(woodSandstoneMattock, "pickaxe", InfiMaterialEnum.Sandstone.getHarvestLevel());
            MinecraftForge.setToolClass(sandstoneSandstoneMattock, "pickaxe", InfiMaterialEnum.Sandstone.getHarvestLevel());
            MinecraftForge.setToolClass(boneSandstoneMattock, "pickaxe", InfiMaterialEnum.Sandstone.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackSandstoneMattock, "pickaxe", InfiMaterialEnum.Sandstone.getHarvestLevel());
            MinecraftForge.setToolClass(iceSandstoneMattock, "pickaxe", InfiMaterialEnum.Sandstone.getHarvestLevel());
            MinecraftForge.setToolClass(slimeSandstoneMattock, "pickaxe", InfiMaterialEnum.Sandstone.getHarvestLevel());
            MinecraftForge.setToolClass(cactusSandstoneMattock, "pickaxe", InfiMaterialEnum.Sandstone.getHarvestLevel());
            MinecraftForge.setToolClass(flintSandstoneMattock, "pickaxe", InfiMaterialEnum.Sandstone.getHarvestLevel());
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
            
            MinecraftForge.setToolClass(woodBoneMattock, "pickaxe", InfiMaterialEnum.Bone.getHarvestLevel());
            MinecraftForge.setToolClass(stoneBoneMattock, "pickaxe", InfiMaterialEnum.Bone.getHarvestLevel());
            MinecraftForge.setToolClass(sandstoneBoneMattock, "pickaxe", InfiMaterialEnum.Bone.getHarvestLevel());
            MinecraftForge.setToolClass(boneBoneMattock, "pickaxe", InfiMaterialEnum.Bone.getHarvestLevel());
            MinecraftForge.setToolClass(paperBoneMattock, "pickaxe", InfiMaterialEnum.Bone.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackBoneMattock, "pickaxe", InfiMaterialEnum.Bone.getHarvestLevel());
            MinecraftForge.setToolClass(iceBoneMattock, "pickaxe", InfiMaterialEnum.Bone.getHarvestLevel());
            MinecraftForge.setToolClass(cactusBoneMattock, "pickaxe", InfiMaterialEnum.Bone.getHarvestLevel());
            MinecraftForge.setToolClass(flintBoneMattock, "pickaxe", InfiMaterialEnum.Bone.getHarvestLevel());
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
            
            MinecraftForge.setToolClass(woodPaperMattock, "pickaxe", InfiMaterialEnum.Paper.getHarvestLevel());
            MinecraftForge.setToolClass(bonePaperMattock, "pickaxe", InfiMaterialEnum.Paper.getHarvestLevel());
            MinecraftForge.setToolClass(paperPaperMattock, "pickaxe", InfiMaterialEnum.Paper.getHarvestLevel());
            MinecraftForge.setToolClass(slimePaperMattock, "pickaxe", InfiMaterialEnum.Paper.getHarvestLevel());
            MinecraftForge.setToolClass(cactusPaperMattock, "pickaxe", InfiMaterialEnum.Paper.getHarvestLevel());
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
            
            MinecraftForge.setToolClass(woodMossyMattock, "pickaxe", InfiMaterialEnum.Mossy.getHarvestLevel());
            MinecraftForge.setToolClass(stoneMossyMattock, "pickaxe", InfiMaterialEnum.Mossy.getHarvestLevel());
            MinecraftForge.setToolClass(diamondMossyMattock, "pickaxe", InfiMaterialEnum.Mossy.getHarvestLevel());
            MinecraftForge.setToolClass(redstoneMossyMattock, "pickaxe", InfiMaterialEnum.Mossy.getHarvestLevel());
            MinecraftForge.setToolClass(boneMossyMattock, "pickaxe", InfiMaterialEnum.Mossy.getHarvestLevel());
            MinecraftForge.setToolClass(mossyMossyMattock, "pickaxe", InfiMaterialEnum.Mossy.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackMossyMattock, "pickaxe", InfiMaterialEnum.Mossy.getHarvestLevel());
            MinecraftForge.setToolClass(glowstoneMossyMattock, "pickaxe", InfiMaterialEnum.Mossy.getHarvestLevel());
            MinecraftForge.setToolClass(cactusMossyMattock, "pickaxe", InfiMaterialEnum.Mossy.getHarvestLevel());
            MinecraftForge.setToolClass(blazeMossyMattock, "pickaxe", InfiMaterialEnum.Mossy.getHarvestLevel());
            MinecraftForge.setToolClass(manyullynMossyMattock, "pickaxe", InfiMaterialEnum.Mossy.getHarvestLevel());
            MinecraftForge.setToolClass(uraniumMossyMattock, "pickaxe", InfiMaterialEnum.Mossy.getHarvestLevel());
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
            
            MinecraftForge.setToolClass(woodNetherrackMattock, "pickaxe", InfiMaterialEnum.Netherrack.getHarvestLevel());
            MinecraftForge.setToolClass(stoneNetherrackMattock, "pickaxe", InfiMaterialEnum.Netherrack.getHarvestLevel());
            MinecraftForge.setToolClass(sandstoneNetherrackMattock, "pickaxe", InfiMaterialEnum.Netherrack.getHarvestLevel());
            MinecraftForge.setToolClass(boneNetherrackMattock, "pickaxe", InfiMaterialEnum.Netherrack.getHarvestLevel());
            MinecraftForge.setToolClass(paperNetherrackMattock, "pickaxe", InfiMaterialEnum.Netherrack.getHarvestLevel());
            MinecraftForge.setToolClass(mossyNetherrackMattock, "pickaxe", InfiMaterialEnum.Netherrack.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackNetherrackMattock, "pickaxe", InfiMaterialEnum.Netherrack.getHarvestLevel());
            MinecraftForge.setToolClass(iceNetherrackMattock, "pickaxe", InfiMaterialEnum.Netherrack.getHarvestLevel());
            MinecraftForge.setToolClass(slimeNetherrackMattock, "pickaxe", InfiMaterialEnum.Netherrack.getHarvestLevel());
            MinecraftForge.setToolClass(cactusNetherrackMattock, "pickaxe", InfiMaterialEnum.Netherrack.getHarvestLevel());
            MinecraftForge.setToolClass(flintNetherrackMattock, "pickaxe", InfiMaterialEnum.Netherrack.getHarvestLevel());
            MinecraftForge.setToolClass(copperNetherrackMattock, "pickaxe", InfiMaterialEnum.Netherrack.getHarvestLevel());
            MinecraftForge.setToolClass(bronzeNetherrackMattock, "pickaxe", InfiMaterialEnum.Netherrack.getHarvestLevel());
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
            
            
            MinecraftForge.setToolClass(woodGlowstoneMattock, "pickaxe", InfiMaterialEnum.Glowstone.getHarvestLevel());
            MinecraftForge.setToolClass(redstoneGlowstoneMattock, "pickaxe", InfiMaterialEnum.Glowstone.getHarvestLevel());
            MinecraftForge.setToolClass(obsidianGlowstoneMattock, "pickaxe", InfiMaterialEnum.Glowstone.getHarvestLevel());
            MinecraftForge.setToolClass(boneGlowstoneMattock, "pickaxe", InfiMaterialEnum.Glowstone.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackGlowstoneMattock, "pickaxe", InfiMaterialEnum.Glowstone.getHarvestLevel());
            MinecraftForge.setToolClass(glowstoneGlowstoneMattock, "pickaxe", InfiMaterialEnum.Glowstone.getHarvestLevel());
            MinecraftForge.setToolClass(iceGlowstoneMattock, "pickaxe", InfiMaterialEnum.Glowstone.getHarvestLevel());
            MinecraftForge.setToolClass(slimeGlowstoneMattock, "pickaxe", InfiMaterialEnum.Glowstone.getHarvestLevel());
            MinecraftForge.setToolClass(cactusGlowstoneMattock, "pickaxe", InfiMaterialEnum.Glowstone.getHarvestLevel());
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
            
            
            MinecraftForge.setToolClass(woodIceMattock, "pickaxe", InfiMaterialEnum.Ice.getHarvestLevel());
            MinecraftForge.setToolClass(boneIceMattock, "pickaxe", InfiMaterialEnum.Ice.getHarvestLevel());
            MinecraftForge.setToolClass(paperIceMattock, "pickaxe", InfiMaterialEnum.Ice.getHarvestLevel());
            MinecraftForge.setToolClass(iceIceMattock, "pickaxe", InfiMaterialEnum.Ice.getHarvestLevel());
            MinecraftForge.setToolClass(slimeIceMattock, "pickaxe", InfiMaterialEnum.Ice.getHarvestLevel());
            MinecraftForge.setToolClass(cactusIceMattock, "pickaxe", InfiMaterialEnum.Ice.getHarvestLevel());
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
            
            MinecraftForge.setToolClass(diamondLavaMattock, "pickaxe", InfiMaterialEnum.Lava.getHarvestLevel());
            MinecraftForge.setToolClass(obsidianLavaMattock, "pickaxe", InfiMaterialEnum.Lava.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackLavaMattock, "pickaxe", InfiMaterialEnum.Lava.getHarvestLevel());
            MinecraftForge.setToolClass(lavaLavaMattock, "pickaxe", InfiMaterialEnum.Lava.getHarvestLevel());
            MinecraftForge.setToolClass(flintLavaMattock, "pickaxe", InfiMaterialEnum.Lava.getHarvestLevel());
            MinecraftForge.setToolClass(blazeLavaMattock, "pickaxe", InfiMaterialEnum.Lava.getHarvestLevel());
            MinecraftForge.setToolClass(manyullynLavaMattock, "pickaxe", InfiMaterialEnum.Lava.getHarvestLevel());
            MinecraftForge.setToolClass(uraniumLavaMattock, "pickaxe", InfiMaterialEnum.Lava.getHarvestLevel());
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
            
            MinecraftForge.setToolClass(woodSlimeMattock, "pickaxe", InfiMaterialEnum.Slime.getHarvestLevel());
            MinecraftForge.setToolClass(sandstoneSlimeMattock, "pickaxe", InfiMaterialEnum.Slime.getHarvestLevel());
            MinecraftForge.setToolClass(boneSlimeMattock, "pickaxe", InfiMaterialEnum.Slime.getHarvestLevel());
            MinecraftForge.setToolClass(paperSlimeMattock, "pickaxe", InfiMaterialEnum.Slime.getHarvestLevel());
            MinecraftForge.setToolClass(slimeSlimeMattock, "pickaxe", InfiMaterialEnum.Slime.getHarvestLevel());
            MinecraftForge.setToolClass(cactusSlimeMattock, "pickaxe", InfiMaterialEnum.Slime.getHarvestLevel());
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
            
            MinecraftForge.setToolClass(woodCactusMattock, "pickaxe", InfiMaterialEnum.Cactus.getHarvestLevel());
            MinecraftForge.setToolClass(sandstoneCactusMattock, "pickaxe", InfiMaterialEnum.Cactus.getHarvestLevel());
            MinecraftForge.setToolClass(boneCactusMattock, "pickaxe", InfiMaterialEnum.Cactus.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackCactusMattock, "pickaxe", InfiMaterialEnum.Cactus.getHarvestLevel());
            MinecraftForge.setToolClass(iceCactusMattock, "pickaxe", InfiMaterialEnum.Cactus.getHarvestLevel());
            MinecraftForge.setToolClass(slimeCactusMattock, "pickaxe", InfiMaterialEnum.Cactus.getHarvestLevel());
            MinecraftForge.setToolClass(cactusCactusMattock, "pickaxe", InfiMaterialEnum.Cactus.getHarvestLevel());
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
            
            MinecraftForge.setToolClass(woodFlintMattock, "pickaxe", InfiMaterialEnum.Flint.getHarvestLevel());
            MinecraftForge.setToolClass(stoneFlintMattock, "pickaxe", InfiMaterialEnum.Flint.getHarvestLevel());
            MinecraftForge.setToolClass(sandstoneFlintMattock, "pickaxe", InfiMaterialEnum.Flint.getHarvestLevel());
            MinecraftForge.setToolClass(boneFlintMattock, "pickaxe", InfiMaterialEnum.Flint.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackFlintMattock, "pickaxe", InfiMaterialEnum.Flint.getHarvestLevel());
            MinecraftForge.setToolClass(slimeFlintMattock, "pickaxe", InfiMaterialEnum.Flint.getHarvestLevel());
            MinecraftForge.setToolClass(cactusFlintMattock, "pickaxe", InfiMaterialEnum.Flint.getHarvestLevel());
            MinecraftForge.setToolClass(flintFlintMattock, "pickaxe", InfiMaterialEnum.Flint.getHarvestLevel());
            MinecraftForge.setToolClass(copperFlintMattock, "pickaxe", InfiMaterialEnum.Flint.getHarvestLevel());
            MinecraftForge.setToolClass(bronzeFlintMattock, "pickaxe", InfiMaterialEnum.Flint.getHarvestLevel());
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
            
            MinecraftForge.setToolClass(diamondBlazeMattock, "pickaxe", InfiMaterialEnum.Blaze.getHarvestLevel());
            MinecraftForge.setToolClass(obsidianBlazeMattock, "pickaxe", InfiMaterialEnum.Blaze.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackBlazeMattock, "pickaxe", InfiMaterialEnum.Blaze.getHarvestLevel());
            MinecraftForge.setToolClass(blazeBlazeMattock, "pickaxe", InfiMaterialEnum.Blaze.getHarvestLevel());
            MinecraftForge.setToolClass(flintBlazeMattock, "pickaxe", InfiMaterialEnum.Blaze.getHarvestLevel());
            MinecraftForge.setToolClass(blazeBlazeMattock, "pickaxe", InfiMaterialEnum.Blaze.getHarvestLevel());
            MinecraftForge.setToolClass(manyullynBlazeMattock, "pickaxe", InfiMaterialEnum.Blaze.getHarvestLevel());
            MinecraftForge.setToolClass(uraniumBlazeMattock, "pickaxe", InfiMaterialEnum.Blaze.getHarvestLevel());
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
            
            MinecraftForge.setToolClass(woodCopperMattock, "pickaxe", InfiMaterialEnum.Copper.getHarvestLevel());
        	MinecraftForge.setToolClass(stoneCopperMattock, "pickaxe", InfiMaterialEnum.Copper.getHarvestLevel());
            MinecraftForge.setToolClass(boneCopperMattock, "pickaxe", InfiMaterialEnum.Copper.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackCopperMattock, "pickaxe", InfiMaterialEnum.Copper.getHarvestLevel());
            MinecraftForge.setToolClass(slimeCopperMattock, "pickaxe", InfiMaterialEnum.Copper.getHarvestLevel());
            MinecraftForge.setToolClass(cactusCopperMattock, "pickaxe", InfiMaterialEnum.Copper.getHarvestLevel());
            MinecraftForge.setToolClass(flintCopperMattock, "pickaxe", InfiMaterialEnum.Copper.getHarvestLevel());
            MinecraftForge.setToolClass(copperCopperMattock, "pickaxe", InfiMaterialEnum.Copper.getHarvestLevel());
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
            
            MinecraftForge.setToolClass(woodBronzeMattock, "pickaxe", InfiMaterialEnum.Bronze.getHarvestLevel());
            MinecraftForge.setToolClass(stoneBronzeMattock, "pickaxe", InfiMaterialEnum.Bronze.getHarvestLevel());
            MinecraftForge.setToolClass(boneBronzeMattock, "pickaxe", InfiMaterialEnum.Bronze.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackBronzeMattock, "pickaxe", InfiMaterialEnum.Bronze.getHarvestLevel());
            MinecraftForge.setToolClass(slimeBronzeMattock, "pickaxe", InfiMaterialEnum.Bronze.getHarvestLevel());
            MinecraftForge.setToolClass(cactusBronzeMattock, "pickaxe", InfiMaterialEnum.Bronze.getHarvestLevel());
            MinecraftForge.setToolClass(flintBronzeMattock, "pickaxe", InfiMaterialEnum.Bronze.getHarvestLevel());
            MinecraftForge.setToolClass(copperBronzeMattock, "pickaxe", InfiMaterialEnum.Bronze.getHarvestLevel());
            MinecraftForge.setToolClass(bronzeBronzeMattock, "pickaxe", InfiMaterialEnum.Bronze.getHarvestLevel());
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
            
            MinecraftForge.setToolClass(woodWorkedIronMattock, "pickaxe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(stoneWorkedIronMattock, "pickaxe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(ironWorkedIronMattock, "pickaxe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(diamondWorkedIronMattock, "pickaxe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(redstoneWorkedIronMattock, "pickaxe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(obsidianWorkedIronMattock, "pickaxe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(boneWorkedIronMattock, "pickaxe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackWorkedIronMattock, "pickaxe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(glowstoneWorkedIronMattock, "pickaxe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(iceWorkedIronMattock, "pickaxe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(slimeWorkedIronMattock, "pickaxe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(cactusWorkedIronMattock, "pickaxe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(blazeWorkedIronMattock, "pickaxe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(copperWorkedIronMattock, "pickaxe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(bronzeWorkedIronMattock, "pickaxe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(workedWorkedIronMattock, "pickaxe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(steelWorkedIronMattock, "pickaxe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(uraniumWorkedIronMattock, "pickaxe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
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

            MinecraftForge.setToolClass(woodSteelMattock, "pickaxe", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(stoneSteelMattock, "pickaxe", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(ironSteelMattock, "pickaxe", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(diamondSteelMattock, "pickaxe", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(redstoneSteelMattock, "pickaxe", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(obsidianSteelMattock, "pickaxe", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(boneSteelMattock, "pickaxe", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackSteelMattock, "pickaxe", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(glowstoneSteelMattock, "pickaxe", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(iceSteelMattock, "pickaxe", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(slimeSteelMattock, "pickaxe", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(cactusSteelMattock, "pickaxe", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(blazeSteelMattock, "pickaxe", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(copperSteelMattock, "pickaxe", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(bronzeSteelMattock, "pickaxe", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(workedSteelMattock, "pickaxe", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(steelSteelMattock, "pickaxe", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(cobaltSteelMattock, "pickaxe", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(arditeSteelMattock, "pickaxe", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(uraniumSteelMattock, "pickaxe", InfiMaterialEnum.Steel.getHarvestLevel());
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
            
            MinecraftForge.setToolClass(woodCobaltMattock, "pickaxe", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(stoneCobaltMattock, "pickaxe", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(ironCobaltMattock, "pickaxe", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(diamondCobaltMattock, "pickaxe", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(redstoneCobaltMattock, "pickaxe", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(obsidianCobaltMattock, "pickaxe", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(boneCobaltMattock, "pickaxe", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(slimeCobaltMattock, "pickaxe", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(cactusCobaltMattock, "pickaxe", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(blazeCobaltMattock, "pickaxe", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(copperCobaltMattock, "pickaxe", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(bronzeCobaltMattock, "pickaxe", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(workedCobaltMattock, "pickaxe", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(steelCobaltMattock, "pickaxe", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(cobaltCobaltMattock, "pickaxe", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(arditeCobaltMattock, "pickaxe", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(manyullynCobaltMattock, "pickaxe", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(uraniumCobaltMattock, "pickaxe", InfiMaterialEnum.Cobalt.getHarvestLevel());
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
            
            MinecraftForge.setToolClass(woodArditeMattock, "pickaxe", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(stoneArditeMattock, "pickaxe", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(ironArditeMattock, "pickaxe", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(diamondArditeMattock, "pickaxe", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(redstoneArditeMattock, "pickaxe", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(obsidianArditeMattock, "pickaxe", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(boneArditeMattock, "pickaxe", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(slimeArditeMattock, "pickaxe", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(cactusArditeMattock, "pickaxe", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(blazeArditeMattock, "pickaxe", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(copperArditeMattock, "pickaxe", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(bronzeArditeMattock, "pickaxe", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(workedArditeMattock, "pickaxe", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(steelArditeMattock, "pickaxe", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(cobaltArditeMattock, "pickaxe", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(arditeArditeMattock, "pickaxe", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(manyullynArditeMattock, "pickaxe", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(uraniumArditeMattock, "pickaxe", InfiMaterialEnum.Ardite.getHarvestLevel());
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
            
            MinecraftForge.setToolClass(woodManyullynMattock, "pickaxe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(stoneManyullynMattock, "pickaxe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(ironManyullynMattock, "pickaxe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(diamondManyullynMattock, "pickaxe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(redstoneManyullynMattock, "pickaxe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(obsidianManyullynMattock, "pickaxe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(boneManyullynMattock, "pickaxe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(slimeManyullynMattock, "pickaxe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(cactusManyullynMattock, "pickaxe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(blazeManyullynMattock, "pickaxe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(copperManyullynMattock, "pickaxe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(bronzeManyullynMattock, "pickaxe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(workedManyullynMattock, "pickaxe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(steelManyullynMattock, "pickaxe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(cobaltManyullynMattock, "pickaxe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(arditeManyullynMattock, "pickaxe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(manyullynManyullynMattock, "pickaxe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(uraniumManyullynMattock, "pickaxe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
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
            
            MinecraftForge.setToolClass(diamondUraniumMattock, "pickaxe", InfiMaterialEnum.Uranium.getHarvestLevel());
            MinecraftForge.setToolClass(redstoneUraniumMattock, "pickaxe", InfiMaterialEnum.Uranium.getHarvestLevel());
            MinecraftForge.setToolClass(boneUraniumMattock, "pickaxe", InfiMaterialEnum.Uranium.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackUraniumMattock, "pickaxe", InfiMaterialEnum.Uranium.getHarvestLevel());
            MinecraftForge.setToolClass(glowstoneUraniumMattock, "pickaxe", InfiMaterialEnum.Uranium.getHarvestLevel());
            MinecraftForge.setToolClass(lavaUraniumMattock, "pickaxe", InfiMaterialEnum.Uranium.getHarvestLevel());
            MinecraftForge.setToolClass(blazeUraniumMattock, "pickaxe", InfiMaterialEnum.Uranium.getHarvestLevel());
            MinecraftForge.setToolClass(cobaltUraniumMattock, "pickaxe", InfiMaterialEnum.Uranium.getHarvestLevel());
            MinecraftForge.setToolClass(arditeUraniumMattock, "pickaxe", InfiMaterialEnum.Uranium.getHarvestLevel());
            MinecraftForge.setToolClass(uraniumUraniumMattock, "pickaxe", InfiMaterialEnum.Uranium.getHarvestLevel());
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
                    { recipe, '#', InfiLibrary.glowstoneCrystal, '|', InfiLibrary.redstoneRod, 's', InfiLibrary.glowstoneFragment });
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
    
    public static void addStoneTools(ItemStack stack)
    {
    	ModLoader.addRecipe(new ItemStack(woodStoneMattock), new Object[] 
                { recipe, '#', stack, '|', Item.stick, 's', InfiLibrary.stoneShard });
    	ModLoader.addRecipe(new ItemStack(stoneStoneMattock), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.stoneRod, 's', InfiLibrary.stoneShard });
        ModLoader.addRecipe(new ItemStack(sandstoneStoneMattock), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.sandstoneRod, 's', InfiLibrary.stoneShard });
        ModLoader.addRecipe(new ItemStack(boneStoneMattock), new Object[] 
                { recipe, '#', stack, '|', Item.bone, 's', InfiLibrary.stoneShard });
        ModLoader.addRecipe(new ItemStack(boneStoneMattock), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.boneRod, 's', InfiLibrary.stoneShard });
        ModLoader.addRecipe(new ItemStack(netherrackStoneMattock), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.netherrackRod, 's', InfiLibrary.stoneShard });
        ModLoader.addRecipe(new ItemStack(iceStoneMattock), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.iceRod, 's', InfiLibrary.stoneShard });
        ModLoader.addRecipe(new ItemStack(slimeStoneMattock), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.slimeRod, 's', InfiLibrary.stoneShard });
        ModLoader.addRecipe(new ItemStack(cactusStoneMattock), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.cactusRod, 's', InfiLibrary.stoneShard });
        ModLoader.addRecipe(new ItemStack(flintStoneMattock), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.flintRod, 's', InfiLibrary.stoneShard });
    }
    
    public static void addCopperTools(ItemStack stack)
    {
    	ModLoader.addRecipe(new ItemStack(woodCopperMattock), new Object[] 
                { recipe, '#', stack, '|', Item.stick, 's', InfiLibrary.copperChunk });
        ModLoader.addRecipe(new ItemStack(stoneCopperMattock), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.stoneRod, 's', InfiLibrary.copperChunk });
        ModLoader.addRecipe(new ItemStack(boneCopperMattock), new Object[] 
                { recipe, '#', stack, '|', Item.bone, 's', InfiLibrary.copperChunk });
        ModLoader.addRecipe(new ItemStack(boneCopperMattock), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.boneRod, 's', InfiLibrary.copperChunk });
        ModLoader.addRecipe(new ItemStack(netherrackCopperMattock), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.netherrackRod, 's', InfiLibrary.copperChunk });
        ModLoader.addRecipe(new ItemStack(slimeCopperMattock), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.slimeRod, 's', InfiLibrary.copperChunk });
        ModLoader.addRecipe(new ItemStack(cactusCopperMattock), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.cactusRod, 's', InfiLibrary.copperChunk });
        ModLoader.addRecipe(new ItemStack(flintCopperMattock), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.flintRod, 's', InfiLibrary.copperChunk });
        ModLoader.addRecipe(new ItemStack(copperCopperMattock), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.copperRod, 's', InfiLibrary.copperChunk });
    }
    
    public static void addBronzeTools(ItemStack stack)
    {
    	ModLoader.addRecipe(new ItemStack(woodBronzeMattock), new Object[] 
                { recipe, '#', stack, '|', Item.stick, 's', InfiLibrary.bronzeChunk });
        ModLoader.addRecipe(new ItemStack(stoneBronzeMattock), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.stoneRod, 's', InfiLibrary.bronzeChunk });
        ModLoader.addRecipe(new ItemStack(boneBronzeMattock), new Object[] 
                { recipe, '#', stack, '|', Item.bone, 's', InfiLibrary.bronzeChunk });
        ModLoader.addRecipe(new ItemStack(boneBronzeMattock), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.boneRod, 's', InfiLibrary.bronzeChunk });
        ModLoader.addRecipe(new ItemStack(netherrackBronzeMattock), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.netherrackRod, 's', InfiLibrary.bronzeChunk });
        ModLoader.addRecipe(new ItemStack(slimeBronzeMattock), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.slimeRod, 's', InfiLibrary.bronzeChunk });
        ModLoader.addRecipe(new ItemStack(cactusBronzeMattock), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.cactusRod, 's', InfiLibrary.bronzeChunk });
        ModLoader.addRecipe(new ItemStack(flintBronzeMattock), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.flintRod, 's', InfiLibrary.bronzeChunk });
        ModLoader.addRecipe(new ItemStack(copperBronzeMattock), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.copperRod, 's', InfiLibrary.bronzeChunk });
        ModLoader.addRecipe(new ItemStack(bronzeBronzeMattock), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.bronzeRod, 's', InfiLibrary.bronzeChunk });
    }
    
    public static void addWorkedIronTools(ItemStack stack)
    {
    	ModLoader.addRecipe(new ItemStack(woodWorkedIronMattock), new Object[] 
                { recipe, '#', stack, '|', Item.stick, 's', InfiLibrary.workedIronChunk });
        ModLoader.addRecipe(new ItemStack(stoneWorkedIronMattock), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.stoneRod, 's', InfiLibrary.workedIronChunk });
        ModLoader.addRecipe(new ItemStack(ironWorkedIronMattock), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.ironRod, 's', InfiLibrary.workedIronChunk });
        ModLoader.addRecipe(new ItemStack(diamondWorkedIronMattock), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.diamondRod, 's', InfiLibrary.workedIronChunk });
        ModLoader.addRecipe(new ItemStack(redstoneWorkedIronMattock), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.redstoneRod, 's', InfiLibrary.workedIronChunk });
        ModLoader.addRecipe(new ItemStack(obsidianWorkedIronMattock), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.obsidianRod, 's', InfiLibrary.workedIronChunk });
        ModLoader.addRecipe(new ItemStack(boneWorkedIronMattock), new Object[] 
                { recipe, '#', stack, '|', Item.bone, 's', InfiLibrary.workedIronChunk });
        ModLoader.addRecipe(new ItemStack(boneWorkedIronMattock), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.boneRod, 's', InfiLibrary.workedIronChunk });
        ModLoader.addRecipe(new ItemStack(netherrackWorkedIronMattock), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.netherrackRod, 's', InfiLibrary.workedIronChunk });
        ModLoader.addRecipe(new ItemStack(glowstoneWorkedIronMattock), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.glowstoneRod, 's', InfiLibrary.workedIronChunk });
        ModLoader.addRecipe(new ItemStack(iceWorkedIronMattock), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.iceRod, 's', InfiLibrary.workedIronChunk });
        ModLoader.addRecipe(new ItemStack(slimeWorkedIronMattock), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.slimeRod, 's', InfiLibrary.workedIronChunk });
        ModLoader.addRecipe(new ItemStack(cactusWorkedIronMattock), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.cactusRod, 's', InfiLibrary.workedIronChunk });
        ModLoader.addRecipe(new ItemStack(blazeWorkedIronMattock), new Object[] 
                { recipe, '#', stack, '|', Item.blazeRod, 's', InfiLibrary.workedIronChunk });
        ModLoader.addRecipe(new ItemStack(copperWorkedIronMattock), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.copperRod, 's', InfiLibrary.workedIronChunk });
        ModLoader.addRecipe(new ItemStack(bronzeWorkedIronMattock), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.bronzeRod, 's', InfiLibrary.workedIronChunk });
        ModLoader.addRecipe(new ItemStack(workedWorkedIronMattock), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.workedIronRod, 's', InfiLibrary.workedIronChunk });
        ModLoader.addRecipe(new ItemStack(steelWorkedIronMattock), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.steelRod, 's', InfiLibrary.workedIronChunk });
        ModLoader.addRecipe(new ItemStack(uraniumWorkedIronMattock), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.uraniumRod, 's', InfiLibrary.workedIronChunk });
    }
    
    public static void addSteelTools(ItemStack stack)
    {
    	ModLoader.addRecipe(new ItemStack(woodSteelMattock), new Object[] 
                { recipe, '#', stack, '|', Item.stick, 's', InfiLibrary.steelChunk });
        ModLoader.addRecipe(new ItemStack(stoneSteelMattock), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.stoneRod, 's', InfiLibrary.steelChunk });
        ModLoader.addRecipe(new ItemStack(ironSteelMattock), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.ironRod, 's', InfiLibrary.steelChunk });
        ModLoader.addRecipe(new ItemStack(diamondSteelMattock), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.diamondRod, 's', InfiLibrary.steelChunk });
        ModLoader.addRecipe(new ItemStack(redstoneSteelMattock), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.redstoneRod, 's', InfiLibrary.steelChunk });
        ModLoader.addRecipe(new ItemStack(obsidianSteelMattock), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.obsidianRod, 's', InfiLibrary.steelChunk });
        ModLoader.addRecipe(new ItemStack(boneSteelMattock), new Object[] 
                { recipe, '#', stack, '|', Item.bone, 's', InfiLibrary.steelChunk });
        ModLoader.addRecipe(new ItemStack(boneSteelMattock), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.boneRod, 's', InfiLibrary.steelChunk });
        ModLoader.addRecipe(new ItemStack(netherrackSteelMattock), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.netherrackRod, 's', InfiLibrary.steelChunk });
        ModLoader.addRecipe(new ItemStack(glowstoneSteelMattock), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.glowstoneRod, 's', InfiLibrary.steelChunk });
        ModLoader.addRecipe(new ItemStack(iceSteelMattock), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.iceRod, 's', InfiLibrary.steelChunk });
        ModLoader.addRecipe(new ItemStack(slimeSteelMattock), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.slimeRod, 's', InfiLibrary.steelChunk });
        ModLoader.addRecipe(new ItemStack(cactusSteelMattock), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.cactusRod, 's', InfiLibrary.steelChunk });
        ModLoader.addRecipe(new ItemStack(blazeSteelMattock), new Object[] 
                { recipe, '#', stack, '|', Item.blazeRod, 's', InfiLibrary.steelChunk });
        ModLoader.addRecipe(new ItemStack(copperSteelMattock), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.copperRod, 's', InfiLibrary.steelChunk });
        ModLoader.addRecipe(new ItemStack(bronzeSteelMattock), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.bronzeRod, 's', InfiLibrary.steelChunk });
        ModLoader.addRecipe(new ItemStack(workedSteelMattock), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.workedIronRod, 's', InfiLibrary.steelChunk });
        ModLoader.addRecipe(new ItemStack(steelSteelMattock), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.steelRod, 's', InfiLibrary.steelChunk });
        ModLoader.addRecipe(new ItemStack(cobaltSteelMattock), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.cobaltRod, 's', InfiLibrary.steelChunk });
        ModLoader.addRecipe(new ItemStack(arditeSteelMattock), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.arditeRod, 's', InfiLibrary.steelChunk });
        ModLoader.addRecipe(new ItemStack(uraniumSteelMattock), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.uraniumRod, 's', InfiLibrary.steelChunk });
    }
    
    public static void addCobaltTools(ItemStack stack)
    {
    	ModLoader.addRecipe(new ItemStack(woodCobaltMattock), new Object[] 
                { recipe, '#', stack, '|', Item.stick, 's', InfiLibrary.cobaltChunk });
        ModLoader.addRecipe(new ItemStack(stoneCobaltMattock), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.stoneRod, 's', InfiLibrary.cobaltChunk });
        ModLoader.addRecipe(new ItemStack(ironCobaltMattock), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.ironRod, 's', InfiLibrary.cobaltChunk });
        ModLoader.addRecipe(new ItemStack(diamondCobaltMattock), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.diamondRod, 's', InfiLibrary.cobaltChunk });
        ModLoader.addRecipe(new ItemStack(redstoneCobaltMattock), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.redstoneRod, 's', InfiLibrary.cobaltChunk });
        ModLoader.addRecipe(new ItemStack(obsidianCobaltMattock), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.obsidianRod, 's', InfiLibrary.cobaltChunk });
        ModLoader.addRecipe(new ItemStack(boneCobaltMattock), new Object[] 
                { recipe, '#', stack, '|', Item.bone, 's', InfiLibrary.cobaltChunk });
        ModLoader.addRecipe(new ItemStack(boneCobaltMattock), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.boneRod, 's', InfiLibrary.cobaltChunk });
        ModLoader.addRecipe(new ItemStack(slimeCobaltMattock), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.slimeRod, 's', InfiLibrary.cobaltChunk });
        ModLoader.addRecipe(new ItemStack(cactusCobaltMattock), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.cactusRod, 's', InfiLibrary.cobaltChunk });
        ModLoader.addRecipe(new ItemStack(blazeCobaltMattock), new Object[] 
                { recipe, '#', stack, '|', Item.blazeRod, 's', InfiLibrary.cobaltChunk });
        ModLoader.addRecipe(new ItemStack(copperCobaltMattock), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.copperRod, 's', InfiLibrary.cobaltChunk });
        ModLoader.addRecipe(new ItemStack(bronzeCobaltMattock), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.bronzeRod, 's', InfiLibrary.cobaltChunk });
        ModLoader.addRecipe(new ItemStack(workedCobaltMattock), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.workedIronRod, 's', InfiLibrary.cobaltChunk });
        ModLoader.addRecipe(new ItemStack(steelCobaltMattock), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.steelRod, 's', InfiLibrary.cobaltChunk });
        ModLoader.addRecipe(new ItemStack(cobaltCobaltMattock), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.cobaltRod, 's', InfiLibrary.cobaltChunk });
        ModLoader.addRecipe(new ItemStack(arditeCobaltMattock), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.arditeRod, 's', InfiLibrary.cobaltChunk });
        ModLoader.addRecipe(new ItemStack(manyullynCobaltMattock), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.manyullynRod, 's', InfiLibrary.cobaltChunk });
        ModLoader.addRecipe(new ItemStack(uraniumCobaltMattock), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.uraniumRod, 's', InfiLibrary.cobaltChunk });
    }
    
    public static void addArditeTools(ItemStack stack)
    {
    	ModLoader.addRecipe(new ItemStack(woodArditeMattock), new Object[] 
                { recipe, '#', stack, '|', Item.stick, 's', InfiLibrary.arditeChunk });
        ModLoader.addRecipe(new ItemStack(stoneArditeMattock), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.stoneRod, 's', InfiLibrary.arditeChunk });
        ModLoader.addRecipe(new ItemStack(ironArditeMattock), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.ironRod, 's', InfiLibrary.arditeChunk });
        ModLoader.addRecipe(new ItemStack(diamondArditeMattock), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.diamondRod, 's', InfiLibrary.arditeChunk });
        ModLoader.addRecipe(new ItemStack(redstoneArditeMattock), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.redstoneRod, 's', InfiLibrary.arditeChunk });
        ModLoader.addRecipe(new ItemStack(obsidianArditeMattock), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.obsidianRod, 's', InfiLibrary.arditeChunk });
        ModLoader.addRecipe(new ItemStack(boneArditeMattock), new Object[] 
                { recipe, '#', stack, '|', Item.bone, 's', InfiLibrary.arditeChunk });
        ModLoader.addRecipe(new ItemStack(boneArditeMattock), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.boneRod, 's', InfiLibrary.arditeChunk });
        ModLoader.addRecipe(new ItemStack(slimeArditeMattock), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.slimeRod, 's', InfiLibrary.arditeChunk });
        ModLoader.addRecipe(new ItemStack(cactusArditeMattock), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.cactusRod, 's', InfiLibrary.arditeChunk });
        ModLoader.addRecipe(new ItemStack(blazeArditeMattock), new Object[] 
                { recipe, '#', stack, '|', Item.blazeRod, 's', InfiLibrary.arditeChunk });
        ModLoader.addRecipe(new ItemStack(copperArditeMattock), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.copperRod, 's', InfiLibrary.arditeChunk });
        ModLoader.addRecipe(new ItemStack(bronzeArditeMattock), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.bronzeRod, 's', InfiLibrary.arditeChunk });
        ModLoader.addRecipe(new ItemStack(workedArditeMattock), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.workedIronRod, 's', InfiLibrary.arditeChunk });
        ModLoader.addRecipe(new ItemStack(steelArditeMattock), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.steelRod, 's', InfiLibrary.arditeChunk });
        ModLoader.addRecipe(new ItemStack(cobaltArditeMattock), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.cobaltRod, 's', InfiLibrary.arditeChunk });
        ModLoader.addRecipe(new ItemStack(arditeArditeMattock), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.arditeRod, 's', InfiLibrary.arditeChunk });
        ModLoader.addRecipe(new ItemStack(manyullynArditeMattock), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.manyullynRod, 's', InfiLibrary.arditeChunk });
        ModLoader.addRecipe(new ItemStack(uraniumArditeMattock), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.uraniumRod, 's', InfiLibrary.arditeChunk });
    }
    
    public static void addManyullynTools(ItemStack stack)
    {
    	ModLoader.addRecipe(new ItemStack(woodManyullynMattock), new Object[] 
                { recipe, '#', stack, '|', Item.stick, 's', InfiLibrary.manyullynChunk });
        ModLoader.addRecipe(new ItemStack(stoneManyullynMattock), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.stoneRod, 's', InfiLibrary.manyullynChunk });
        ModLoader.addRecipe(new ItemStack(ironManyullynMattock), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.ironRod, 's', InfiLibrary.manyullynChunk });
        ModLoader.addRecipe(new ItemStack(diamondManyullynMattock), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.diamondRod, 's', InfiLibrary.manyullynChunk });
        ModLoader.addRecipe(new ItemStack(redstoneManyullynMattock), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.redstoneRod, 's', InfiLibrary.manyullynChunk });
        ModLoader.addRecipe(new ItemStack(obsidianManyullynMattock), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.obsidianRod, 's', InfiLibrary.manyullynChunk });
        ModLoader.addRecipe(new ItemStack(boneManyullynMattock), new Object[] 
                { recipe, '#', stack, '|', Item.bone, 's', InfiLibrary.manyullynChunk });
        ModLoader.addRecipe(new ItemStack(boneManyullynMattock), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.boneRod, 's', InfiLibrary.manyullynChunk });
        ModLoader.addRecipe(new ItemStack(slimeManyullynMattock), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.slimeRod, 's', InfiLibrary.manyullynChunk });
        ModLoader.addRecipe(new ItemStack(cactusManyullynMattock), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.cactusRod, 's', InfiLibrary.manyullynChunk });
        ModLoader.addRecipe(new ItemStack(blazeManyullynMattock), new Object[] 
                { recipe, '#', stack, '|', Item.blazeRod, 's', InfiLibrary.manyullynChunk });
        ModLoader.addRecipe(new ItemStack(copperManyullynMattock), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.copperRod, 's', InfiLibrary.manyullynChunk });
        ModLoader.addRecipe(new ItemStack(bronzeManyullynMattock), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.bronzeRod, 's', InfiLibrary.manyullynChunk });
        ModLoader.addRecipe(new ItemStack(workedManyullynMattock), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.workedIronRod, 's', InfiLibrary.manyullynChunk });
        ModLoader.addRecipe(new ItemStack(steelManyullynMattock), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.steelRod, 's', InfiLibrary.manyullynChunk });
        ModLoader.addRecipe(new ItemStack(cobaltManyullynMattock), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.cobaltRod, 's', InfiLibrary.manyullynChunk });
        ModLoader.addRecipe(new ItemStack(arditeManyullynMattock), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.arditeRod, 's', InfiLibrary.manyullynChunk });
        ModLoader.addRecipe(new ItemStack(manyullynManyullynMattock), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.manyullynRod, 's', InfiLibrary.manyullynChunk });
        ModLoader.addRecipe(new ItemStack(uraniumManyullynMattock), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.uraniumRod, 's', InfiLibrary.manyullynChunk });
    }
    
    public static void addUraniumTools(ItemStack stack)
    {
        ModLoader.addRecipe(new ItemStack(diamondUraniumMattock), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.diamondRod, 's', InfiLibrary.uraniumChunk });
        ModLoader.addRecipe(new ItemStack(redstoneUraniumMattock), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.redstoneRod, 's', InfiLibrary.uraniumChunk });
        ModLoader.addRecipe(new ItemStack(boneUraniumMattock), new Object[] 
                { recipe, '#', stack, '|', Item.bone, 's', InfiLibrary.uraniumChunk });
        ModLoader.addRecipe(new ItemStack(boneUraniumMattock), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.boneRod, 's', InfiLibrary.uraniumChunk });
        ModLoader.addRecipe(new ItemStack(netherrackUraniumMattock), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.netherrackRod, 's', InfiLibrary.uraniumChunk });
        ModLoader.addRecipe(new ItemStack(glowstoneUraniumMattock), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.glowstoneRod, 's', InfiLibrary.uraniumChunk });
        ModLoader.addRecipe(new ItemStack(lavaUraniumMattock), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.lavaRod, 's', InfiLibrary.uraniumChunk });
        ModLoader.addRecipe(new ItemStack(blazeUraniumMattock), new Object[] 
                { recipe, '#', stack, '|', Item.blazeRod, 's', InfiLibrary.uraniumChunk });
        ModLoader.addRecipe(new ItemStack(cobaltUraniumMattock), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.cobaltRod, 's', InfiLibrary.uraniumChunk });
        ModLoader.addRecipe(new ItemStack(arditeUraniumMattock), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.arditeRod, 's', InfiLibrary.uraniumChunk });
        ModLoader.addRecipe(new ItemStack(uraniumUraniumMattock), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.uraniumRod, 's', InfiLibrary.uraniumChunk });
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
