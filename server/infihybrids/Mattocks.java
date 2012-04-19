package net.minecraft.src.infihybrids;
import net.minecraft.src.Block;
import net.minecraft.src.InfiMaterialEnum;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;
import net.minecraft.src.ModLoader;
import net.minecraft.src.mod_Infi2x2;
import net.minecraft.src.mod_InfiBase;
import net.minecraft.src.forge.MinecraftForge;

public class Mattocks 
{
    public static Mattocks instance = new Mattocks();
    
    private static String[] recipe = { "###", "#| ", " | " };
    
    public static Mattocks getInstance()
    {
        return instance;
    }

    public static void init()
    {
        if(mod_Infi2x2.infitoolsPresent)
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
    	woodWoodMattock = new InfiToolMattock(PropsHelperInfiHybrids.woodMattockID+0, 
                InfiMaterialEnum.Wood, InfiMaterialEnum.Wood, "woodWood");
    	woodStoneMattock = new InfiToolMattock(PropsHelperInfiHybrids.stoneMattockID+0, 
                InfiMaterialEnum.Stone, InfiMaterialEnum.Wood, "woodStoneMattock");
    	woodIronMattock = new InfiToolMattock(PropsHelperInfiHybrids.ironMattockID+0, 
                InfiMaterialEnum.Iron, InfiMaterialEnum.Wood, "woodIronMattock");
    	woodDiamondMattock = new InfiToolMattock(PropsHelperInfiHybrids.diamondMattockID+0, 
                InfiMaterialEnum.Diamond, InfiMaterialEnum.Wood, "woodDiamondMattock");
    	
    	MinecraftForge.setToolClass(woodWoodMattock, "shovel", InfiMaterialEnum.Wood.getHarvestLevel());
    	MinecraftForge.setToolClass(woodStoneMattock, "shovel", InfiMaterialEnum.Stone.getHarvestLevel());
    	MinecraftForge.setToolClass(woodIronMattock, "shovel", InfiMaterialEnum.Iron.getHarvestLevel());
    	MinecraftForge.setToolClass(woodDiamondMattock, "shovel", InfiMaterialEnum.Diamond.getHarvestLevel());
    	
    	MinecraftForge.setToolClass(woodWoodMattock, "axe", InfiMaterialEnum.Wood.getHarvestLevel());
    	MinecraftForge.setToolClass(woodStoneMattock, "axe", InfiMaterialEnum.Stone.getHarvestLevel());
    	MinecraftForge.setToolClass(woodIronMattock, "axe", InfiMaterialEnum.Iron.getHarvestLevel());
    	MinecraftForge.setToolClass(woodDiamondMattock, "axe", InfiMaterialEnum.Diamond.getHarvestLevel());
    }
    
    private static void registerVanillaRecipes()
    {
    	ModLoader.addRecipe(new ItemStack(woodWoodMattock), new Object[] 
                { recipe, '#', Block.planks, '|', Item.stick, });
		ModLoader.addRecipe(new ItemStack(woodStoneMattock), new Object[] 
                { recipe, '#', Block.cobblestone, '|', Item.stick, });
		ModLoader.addRecipe(new ItemStack(woodIronMattock), new Object[] 
                { recipe, '#', Item.ingotIron, '|', Item.stick, });
		ModLoader.addRecipe(new ItemStack(woodDiamondMattock), new Object[] 
                { recipe, '#', Item.diamond, '|', Item.stick, });
    }
    
    private static void createTools()
    {
    	if(PropsHelperInfiHybrids.enableWoodTools)
    	{
    		woodWoodMattock = new InfiToolMattock(PropsHelperInfiHybrids.woodMattockID+0, 
                    InfiMaterialEnum.Wood, InfiMaterialEnum.Wood, "woodWood");
    		sandstoneWoodMattock = new InfiToolMattock(PropsHelperInfiHybrids.woodMattockID+1, 
                    InfiMaterialEnum.Wood, InfiMaterialEnum.Sandstone, "sandstoneWoodMattock");
    		boneWoodMattock = new InfiToolMattock(PropsHelperInfiHybrids.woodMattockID+2, 
                    InfiMaterialEnum.Wood, InfiMaterialEnum.Bone, "boneWoodMattock");
    		paperWoodMattock = new InfiToolMattock(PropsHelperInfiHybrids.woodMattockID+3, 
                    InfiMaterialEnum.Wood, InfiMaterialEnum.Paper, "paperWoodMattock");
    		iceWoodMattock = new InfiToolMattock(PropsHelperInfiHybrids.woodMattockID+4, 
                    InfiMaterialEnum.Wood, InfiMaterialEnum.Ice, "iceWoodMattock");
    		slimeWoodMattock = new InfiToolMattock(PropsHelperInfiHybrids.woodMattockID+5, 
                    InfiMaterialEnum.Wood, InfiMaterialEnum.Slime, "slimeWoodMattock");
    		cactusWoodMattock = new InfiToolMattock(PropsHelperInfiHybrids.woodMattockID+6, 
                    InfiMaterialEnum.Wood, InfiMaterialEnum.Cactus, "cactusWoodMattock");
    		
    		MinecraftForge.setToolClass(woodWoodMattock, "shovel", InfiMaterialEnum.Wood.getHarvestLevel());
    		MinecraftForge.setToolClass(sandstoneWoodMattock, "shovel", InfiMaterialEnum.Wood.getHarvestLevel());
    		MinecraftForge.setToolClass(boneWoodMattock, "shovel", InfiMaterialEnum.Wood.getHarvestLevel());
    		MinecraftForge.setToolClass(paperWoodMattock, "shovel", InfiMaterialEnum.Wood.getHarvestLevel());
    		MinecraftForge.setToolClass(iceWoodMattock, "shovel", InfiMaterialEnum.Wood.getHarvestLevel());
    		MinecraftForge.setToolClass(slimeWoodMattock, "shovel", InfiMaterialEnum.Wood.getHarvestLevel());
    		MinecraftForge.setToolClass(cactusWoodMattock, "shovel", InfiMaterialEnum.Wood.getHarvestLevel());
    		
    		MinecraftForge.setToolClass(woodWoodMattock, "axe", InfiMaterialEnum.Wood.getHarvestLevel());
    		MinecraftForge.setToolClass(sandstoneWoodMattock, "axe", InfiMaterialEnum.Wood.getHarvestLevel());
    		MinecraftForge.setToolClass(boneWoodMattock, "axe", InfiMaterialEnum.Wood.getHarvestLevel());
    		MinecraftForge.setToolClass(paperWoodMattock, "axe", InfiMaterialEnum.Wood.getHarvestLevel());
    		MinecraftForge.setToolClass(iceWoodMattock, "axe", InfiMaterialEnum.Wood.getHarvestLevel());
    		MinecraftForge.setToolClass(slimeWoodMattock, "axe", InfiMaterialEnum.Wood.getHarvestLevel());
    		MinecraftForge.setToolClass(cactusWoodMattock, "axe", InfiMaterialEnum.Wood.getHarvestLevel());
    	}

        if(PropsHelperInfiHybrids.enableStoneTools)
        {
        	woodStoneMattock = new InfiToolMattock(PropsHelperInfiHybrids.stoneMattockID+0, 
                    InfiMaterialEnum.Stone, InfiMaterialEnum.Wood, "woodStoneMattock");
        	stoneStoneMattock = new InfiToolMattock(PropsHelperInfiHybrids.stoneMattockID+1, 
                    InfiMaterialEnum.Stone, InfiMaterialEnum.Stone, "stoneStoneMattock");
        	sandstoneStoneMattock = new InfiToolMattock(PropsHelperInfiHybrids.stoneMattockID+2, 
                    InfiMaterialEnum.Stone, InfiMaterialEnum.Sandstone, "sandstoneStoneMattock");
        	boneStoneMattock = new InfiToolMattock(PropsHelperInfiHybrids.stoneMattockID+3, 
                    InfiMaterialEnum.Stone, InfiMaterialEnum.Bone, "boneStoneMattock");
        	netherrackStoneMattock = new InfiToolMattock(PropsHelperInfiHybrids.stoneMattockID+4, 
                    InfiMaterialEnum.Stone, InfiMaterialEnum.Netherrack, "netherrackStoneMattock");
        	iceStoneMattock = new InfiToolMattock(PropsHelperInfiHybrids.stoneMattockID+5, 
                    InfiMaterialEnum.Stone, InfiMaterialEnum.Ice, "iceStoneMattock");
        	slimeStoneMattock = new InfiToolMattock(PropsHelperInfiHybrids.stoneMattockID+6, 
                    InfiMaterialEnum.Stone, InfiMaterialEnum.Slime, "slimeStoneMattock");
        	cactusStoneMattock = new InfiToolMattock(PropsHelperInfiHybrids.stoneMattockID+7, 
                    InfiMaterialEnum.Stone, InfiMaterialEnum.Cactus, "cactusStoneMattock");
        	flintStoneMattock = new InfiToolMattock(PropsHelperInfiHybrids.stoneMattockID+8, 
                    InfiMaterialEnum.Stone, InfiMaterialEnum.Flint, "flintStoneMattock");
            
            MinecraftForge.setToolClass(woodStoneMattock, "shovel", InfiMaterialEnum.Stone.getHarvestLevel());
            MinecraftForge.setToolClass(stoneStoneMattock, "shovel", InfiMaterialEnum.Stone.getHarvestLevel());
            MinecraftForge.setToolClass(sandstoneStoneMattock, "shovel", InfiMaterialEnum.Stone.getHarvestLevel());
            MinecraftForge.setToolClass(boneStoneMattock, "shovel", InfiMaterialEnum.Stone.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackStoneMattock, "shovel", InfiMaterialEnum.Stone.getHarvestLevel());
            MinecraftForge.setToolClass(iceStoneMattock, "shovel", InfiMaterialEnum.Stone.getHarvestLevel());
            MinecraftForge.setToolClass(slimeStoneMattock, "shovel", InfiMaterialEnum.Stone.getHarvestLevel());
            MinecraftForge.setToolClass(cactusStoneMattock, "shovel", InfiMaterialEnum.Stone.getHarvestLevel());
            MinecraftForge.setToolClass(flintStoneMattock, "shovel", InfiMaterialEnum.Stone.getHarvestLevel());
            
            MinecraftForge.setToolClass(woodStoneMattock, "axe", InfiMaterialEnum.Stone.getHarvestLevel());
            MinecraftForge.setToolClass(stoneStoneMattock, "axe", InfiMaterialEnum.Stone.getHarvestLevel());
            MinecraftForge.setToolClass(sandstoneStoneMattock, "axe", InfiMaterialEnum.Stone.getHarvestLevel());
            MinecraftForge.setToolClass(boneStoneMattock, "axe", InfiMaterialEnum.Stone.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackStoneMattock, "axe", InfiMaterialEnum.Stone.getHarvestLevel());
            MinecraftForge.setToolClass(iceStoneMattock, "axe", InfiMaterialEnum.Stone.getHarvestLevel());
            MinecraftForge.setToolClass(slimeStoneMattock, "axe", InfiMaterialEnum.Stone.getHarvestLevel());
            MinecraftForge.setToolClass(cactusStoneMattock, "axe", InfiMaterialEnum.Stone.getHarvestLevel());
            MinecraftForge.setToolClass(flintStoneMattock, "axe", InfiMaterialEnum.Stone.getHarvestLevel());
        }
        
        if(PropsHelperInfiHybrids.enableIronTools)
        {
        	woodIronMattock = new InfiToolMattock(PropsHelperInfiHybrids.ironMattockID+0, 
                    InfiMaterialEnum.Iron, InfiMaterialEnum.Wood, "woodIronMattock");
        	stoneIronMattock = new InfiToolMattock(PropsHelperInfiHybrids.ironMattockID+1, 
                    InfiMaterialEnum.Iron, InfiMaterialEnum.Stone, "stoneIronMattock");
        	ironIronMattock = new InfiToolMattock(PropsHelperInfiHybrids.ironMattockID+2, 
                    InfiMaterialEnum.Iron, InfiMaterialEnum.Iron, "ironIronMattock");
        	boneIronMattock = new InfiToolMattock(PropsHelperInfiHybrids.ironMattockID+3, 
                    InfiMaterialEnum.Iron, InfiMaterialEnum.Bone, "boneIronMattock");
        	netherrackIronMattock = new InfiToolMattock(PropsHelperInfiHybrids.ironMattockID+4, 
                    InfiMaterialEnum.Iron, InfiMaterialEnum.Netherrack, "netherrackIronMattock");
        	glowstoneIronMattock = new InfiToolMattock(PropsHelperInfiHybrids.ironMattockID+5, 
                    InfiMaterialEnum.Iron, InfiMaterialEnum.Glowstone, "glowstoneIronMattock");
        	cactusIronMattock = new InfiToolMattock(PropsHelperInfiHybrids.ironMattockID+6, 
                    InfiMaterialEnum.Iron, InfiMaterialEnum.Cactus, "cactusIronMattock");
        	copperIronMattock = new InfiToolMattock(PropsHelperInfiHybrids.ironMattockID+7, 
                    InfiMaterialEnum.Iron, InfiMaterialEnum.Copper, "copperIronMattock");
        	bronzeIronMattock = new InfiToolMattock(PropsHelperInfiHybrids.ironMattockID+8, 
                    InfiMaterialEnum.Iron, InfiMaterialEnum.Bronze, "bronzeIronMattock");
            
            MinecraftForge.setToolClass(woodIronMattock, "shovel", InfiMaterialEnum.Iron.getHarvestLevel());
            MinecraftForge.setToolClass(stoneIronMattock, "shovel", InfiMaterialEnum.Iron.getHarvestLevel());
            MinecraftForge.setToolClass(ironIronMattock, "shovel", InfiMaterialEnum.Iron.getHarvestLevel());
            MinecraftForge.setToolClass(boneIronMattock, "shovel", InfiMaterialEnum.Iron.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackIronMattock, "shovel", InfiMaterialEnum.Iron.getHarvestLevel());
            MinecraftForge.setToolClass(glowstoneIronMattock, "shovel", InfiMaterialEnum.Iron.getHarvestLevel());
            MinecraftForge.setToolClass(cactusIronMattock, "shovel", InfiMaterialEnum.Iron.getHarvestLevel());
            MinecraftForge.setToolClass(copperIronMattock, "shovel", InfiMaterialEnum.Iron.getHarvestLevel());
            MinecraftForge.setToolClass(bronzeIronMattock, "shovel", InfiMaterialEnum.Iron.getHarvestLevel());
            
            MinecraftForge.setToolClass(woodIronMattock, "axe", InfiMaterialEnum.Iron.getHarvestLevel());
            MinecraftForge.setToolClass(stoneIronMattock, "axe", InfiMaterialEnum.Iron.getHarvestLevel());
            MinecraftForge.setToolClass(ironIronMattock, "axe", InfiMaterialEnum.Iron.getHarvestLevel());
            MinecraftForge.setToolClass(boneIronMattock, "axe", InfiMaterialEnum.Iron.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackIronMattock, "axe", InfiMaterialEnum.Iron.getHarvestLevel());
            MinecraftForge.setToolClass(glowstoneIronMattock, "axe", InfiMaterialEnum.Iron.getHarvestLevel());
            MinecraftForge.setToolClass(cactusIronMattock, "axe", InfiMaterialEnum.Iron.getHarvestLevel());
            MinecraftForge.setToolClass(copperIronMattock, "axe", InfiMaterialEnum.Iron.getHarvestLevel());
            MinecraftForge.setToolClass(bronzeIronMattock, "axe", InfiMaterialEnum.Iron.getHarvestLevel());
        }
        
        if(PropsHelperInfiHybrids.enableDiamondTools)
        {
        	woodDiamondMattock = new InfiToolMattock(PropsHelperInfiHybrids.diamondMattockID+0, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Wood, "woodDiamondMattock");
        	stoneDiamondMattock = new InfiToolMattock(PropsHelperInfiHybrids.diamondMattockID+1, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Stone, "stoneDiamondMattock");
        	ironDiamondMattock = new InfiToolMattock(PropsHelperInfiHybrids.diamondMattockID+2, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Iron, "ironDiamondMattock");
        	diamondDiamondMattock = new InfiToolMattock(PropsHelperInfiHybrids.diamondMattockID+3, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Diamond, "diamondDiamondMattock");
        	redstoneDiamondMattock = new InfiToolMattock(PropsHelperInfiHybrids.diamondMattockID+4, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Redstone, "redstoneDiamondMattock");
        	obsidianDiamondMattock = new InfiToolMattock(PropsHelperInfiHybrids.diamondMattockID+5, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Obsidian, "obsidianDiamondMattock");
        	boneDiamondMattock = new InfiToolMattock(PropsHelperInfiHybrids.diamondMattockID+6, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Bone, "boneDiamondMattock");
        	mossyDiamondMattock = new InfiToolMattock(PropsHelperInfiHybrids.diamondMattockID+7, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Mossy, "mossyDiamondMattock");
        	netherrackDiamondMattock = new InfiToolMattock(PropsHelperInfiHybrids.diamondMattockID+8, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Netherrack, "netherrackDiamondMattock");
        	glowstoneDiamondMattock = new InfiToolMattock(PropsHelperInfiHybrids.diamondMattockID+9, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Glowstone, "glowstoneDiamondMattock");
        	lavaDiamondMattock = new InfiToolMattock(PropsHelperInfiHybrids.diamondMattockID+10, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Lava, "lavaDiamondMattock");
        	cactusDiamondMattock = new InfiToolMattock(PropsHelperInfiHybrids.diamondMattockID+11, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Cactus, "cactusDiamondMattock");
        	flintDiamondMattock = new InfiToolMattock(PropsHelperInfiHybrids.diamondMattockID+12, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Flint, "flintDiamondMattock");
        	blazeDiamondMattock = new InfiToolMattock(PropsHelperInfiHybrids.diamondMattockID+13, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Blaze, "blazeDiamondMattock");
            copperDiamondMattock = new InfiToolMattock(PropsHelperInfiHybrids.diamondMattockID+14, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Copper, "copperDiamondMattock");
            bronzeDiamondMattock = new InfiToolMattock(PropsHelperInfiHybrids.diamondMattockID+15, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Bronze, "bronzeDiamondMattock");
            workedDiamondMattock = new InfiToolMattock(PropsHelperInfiHybrids.diamondMattockID+16, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.WorkedIron, "workedDiamondMattock");
            steelDiamondMattock = new InfiToolMattock(PropsHelperInfiHybrids.diamondMattockID+17, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Steel, "steelDiamondMattock");
            cobaltDiamondMattock = new InfiToolMattock(PropsHelperInfiHybrids.diamondMattockID+18, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Cobalt, "cobaltDiamondMattock");
            arditeDiamondMattock = new InfiToolMattock(PropsHelperInfiHybrids.diamondMattockID+19, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Ardite, "arditeDiamondMattock");
            manyullynDiamondMattock = new InfiToolMattock(PropsHelperInfiHybrids.diamondMattockID+20, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Manyullyn, "manyullynDiamondMattock");
            uraniumDiamondMattock = new InfiToolMattock(PropsHelperInfiHybrids.diamondMattockID+21, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Uranium, "uraniumDiamondMattock");
            
            MinecraftForge.setToolClass(woodDiamondMattock, "shovel", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(stoneDiamondMattock, "shovel", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(ironDiamondMattock, "shovel", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(diamondDiamondMattock, "shovel", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(redstoneDiamondMattock, "shovel", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(obsidianDiamondMattock, "shovel", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(boneDiamondMattock, "shovel", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(mossyDiamondMattock, "shovel", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackDiamondMattock, "shovel", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(glowstoneDiamondMattock, "shovel", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(lavaDiamondMattock, "shovel", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(cactusDiamondMattock, "shovel", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(flintDiamondMattock, "shovel", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(blazeDiamondMattock, "shovel", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(copperDiamondMattock, "shovel", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(bronzeDiamondMattock, "shovel", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(workedDiamondMattock, "shovel", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(steelDiamondMattock, "shovel", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(cobaltDiamondMattock, "shovel", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(arditeDiamondMattock, "shovel", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(manyullynDiamondMattock, "shovel", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(uraniumDiamondMattock, "shovel", InfiMaterialEnum.Diamond.getHarvestLevel());
            
            MinecraftForge.setToolClass(woodDiamondMattock, "axe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(stoneDiamondMattock, "axe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(ironDiamondMattock, "axe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(diamondDiamondMattock, "axe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(redstoneDiamondMattock, "axe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(obsidianDiamondMattock, "axe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(boneDiamondMattock, "axe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(mossyDiamondMattock, "axe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackDiamondMattock, "axe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(glowstoneDiamondMattock, "axe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(lavaDiamondMattock, "axe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(cactusDiamondMattock, "axe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(flintDiamondMattock, "axe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(blazeDiamondMattock, "axe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(copperDiamondMattock, "axe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(bronzeDiamondMattock, "axe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(workedDiamondMattock, "axe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(steelDiamondMattock, "axe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(cobaltDiamondMattock, "axe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(arditeDiamondMattock, "axe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(manyullynDiamondMattock, "axe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(uraniumDiamondMattock, "axe", InfiMaterialEnum.Diamond.getHarvestLevel());
        }
        
        if(PropsHelperInfiHybrids.enableRedstoneTools)
        {
        	woodRedstoneMattock = new InfiToolMattock(PropsHelperInfiHybrids.redstoneMattockID+0, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Redstone, "woodRedstoneMattock");
        	stoneRedstoneMattock = new InfiToolMattock(PropsHelperInfiHybrids.redstoneMattockID+1, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Stone, "stoneRedstoneMattock");
        	ironRedstoneMattock = new InfiToolMattock(PropsHelperInfiHybrids.redstoneMattockID+2, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Iron, "ironRedstoneMattock");
        	redstoneRedstoneMattock = new InfiToolMattock(PropsHelperInfiHybrids.redstoneMattockID+3, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Redstone, "redstoneRedstoneMattock");
        	obsidianRedstoneMattock = new InfiToolMattock(PropsHelperInfiHybrids.redstoneMattockID+4, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Obsidian, "obsidianRedstoneMattock");
        	sandstoneRedstoneMattock = new InfiToolMattock(PropsHelperInfiHybrids.redstoneMattockID+5, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Sandstone, "sandstoneRedstoneMattock");
        	boneRedstoneMattock = new InfiToolMattock(PropsHelperInfiHybrids.redstoneMattockID+6, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Bone, "boneRedstoneMattock");
        	paperRedstoneMattock = new InfiToolMattock(PropsHelperInfiHybrids.redstoneMattockID+7, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Paper, "paperRedstoneMattock");
        	mossyRedstoneMattock = new InfiToolMattock(PropsHelperInfiHybrids.redstoneMattockID+8, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Mossy, "mossyRedstoneMattock");
        	netherrackRedstoneMattock = new InfiToolMattock(PropsHelperInfiHybrids.redstoneMattockID+9, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Netherrack, "netherrackRedstoneMattock");
        	glowstoneRedstoneMattock = new InfiToolMattock(PropsHelperInfiHybrids.redstoneMattockID+10, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Glowstone, "glowstoneRedstoneMattock");
        	iceRedstoneMattock = new InfiToolMattock(PropsHelperInfiHybrids.redstoneMattockID+11, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Ice, "iceRedstoneMattock");
        	lavaRedstoneMattock = new InfiToolMattock(PropsHelperInfiHybrids.redstoneMattockID+12,
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Lava, "lavaRedstoneMattock");
        	slimeRedstoneMattock = new InfiToolMattock(PropsHelperInfiHybrids.redstoneMattockID+13,
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Slime, "slimeRedstoneMattock");
        	cactusRedstoneMattock = new InfiToolMattock(PropsHelperInfiHybrids.redstoneMattockID+14,
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Cactus, "cactusRedstoneMattock");
        	flintRedstoneMattock = new InfiToolMattock(PropsHelperInfiHybrids.redstoneMattockID+15,
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Flint, "flintRedstoneMattock");
        	copperRedstoneMattock = new InfiToolMattock(PropsHelperInfiHybrids.redstoneMattockID+16,
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Copper, "copperRedstoneMattock");
        	bronzeRedstoneMattock = new InfiToolMattock(PropsHelperInfiHybrids.redstoneMattockID+17,
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Bronze, "bronzeRedstoneMattock");
        	workedRedstoneMattock = new InfiToolMattock(PropsHelperInfiHybrids.redstoneMattockID+18,
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.WorkedIron, "workedRedstoneMattock");
        	uraniumRedstoneMattock = new InfiToolMattock(PropsHelperInfiHybrids.redstoneMattockID+19,
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Uranium, "uraniumRedstoneMattock");
            
            MinecraftForge.setToolClass(woodRedstoneMattock, "shovel", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(stoneRedstoneMattock, "shovel", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(ironRedstoneMattock, "shovel", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(redstoneRedstoneMattock, "shovel", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(obsidianRedstoneMattock, "shovel", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(sandstoneRedstoneMattock, "shovel", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(boneRedstoneMattock, "shovel", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(paperRedstoneMattock, "shovel", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(mossyRedstoneMattock, "shovel", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackRedstoneMattock, "shovel", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(glowstoneRedstoneMattock, "shovel", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(iceRedstoneMattock, "shovel", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(lavaRedstoneMattock, "shovel", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(slimeRedstoneMattock, "shovel", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(cactusRedstoneMattock, "shovel", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(flintRedstoneMattock, "shovel", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(copperRedstoneMattock, "shovel", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(bronzeRedstoneMattock, "shovel", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(workedRedstoneMattock, "shovel", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(uraniumRedstoneMattock, "shovel", InfiMaterialEnum.Redstone.getHarvestLevel());
            
            MinecraftForge.setToolClass(woodRedstoneMattock, "axe", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(stoneRedstoneMattock, "axe", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(ironRedstoneMattock, "axe", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(redstoneRedstoneMattock, "axe", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(obsidianRedstoneMattock, "axe", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(sandstoneRedstoneMattock, "axe", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(boneRedstoneMattock, "axe", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(paperRedstoneMattock, "axe", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(mossyRedstoneMattock, "axe", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackRedstoneMattock, "axe", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(glowstoneRedstoneMattock, "axe", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(iceRedstoneMattock, "axe", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(lavaRedstoneMattock, "axe", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(slimeRedstoneMattock, "axe", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(cactusRedstoneMattock, "axe", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(flintRedstoneMattock, "axe", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(copperRedstoneMattock, "axe", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(bronzeRedstoneMattock, "axe", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(workedRedstoneMattock, "axe", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(uraniumRedstoneMattock, "axe", InfiMaterialEnum.Redstone.getHarvestLevel());
        }
        
        if(PropsHelperInfiHybrids.enableObsidianTools)
        {
        	woodObsidianMattock = new InfiToolMattock(PropsHelperInfiHybrids.obsidianMattockID+0, 
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Obsidian, "woodObsidianMattock");
        	stoneObsidianMattock = new InfiToolMattock(PropsHelperInfiHybrids.obsidianMattockID+1, 
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Stone, "stoneObsidianMattock");
        	redstoneObsidianMattock = new InfiToolMattock(PropsHelperInfiHybrids.obsidianMattockID+2, 
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Obsidian, "redstoneObsidianMattock");
        	obsidianObsidianMattock = new InfiToolMattock(PropsHelperInfiHybrids.obsidianMattockID+3, 
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Obsidian, "obsidianObsidianMattock");;
        	boneObsidianMattock = new InfiToolMattock(PropsHelperInfiHybrids.obsidianMattockID+4, 
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Bone, "boneObsidianMattock");
        	netherrackObsidianMattock = new InfiToolMattock(PropsHelperInfiHybrids.obsidianMattockID+5, 
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Netherrack, "netherrackObsidianMattock");
        	glowstoneObsidianMattock = new InfiToolMattock(PropsHelperInfiHybrids.obsidianMattockID+6, 
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Glowstone, "glowstoneObsidianMattock");
        	iceObsidianMattock = new InfiToolMattock(PropsHelperInfiHybrids.obsidianMattockID+7, 
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Ice, "iceObsidianMattock");
        	lavaObsidianMattock = new InfiToolMattock(PropsHelperInfiHybrids.obsidianMattockID+8,
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Lava, "lavaObsidianMattock");
        	cactusObsidianMattock = new InfiToolMattock(PropsHelperInfiHybrids.obsidianMattockID+9,
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Cactus, "cactusObsidianMattock");
            
            MinecraftForge.setToolClass(woodObsidianMattock, "shovel", InfiMaterialEnum.Obsidian.getHarvestLevel());
            MinecraftForge.setToolClass(stoneObsidianMattock, "shovel", InfiMaterialEnum.Obsidian.getHarvestLevel());
            MinecraftForge.setToolClass(redstoneObsidianMattock, "shovel", InfiMaterialEnum.Obsidian.getHarvestLevel());
            MinecraftForge.setToolClass(obsidianObsidianMattock, "shovel", InfiMaterialEnum.Obsidian.getHarvestLevel());
            MinecraftForge.setToolClass(boneObsidianMattock, "shovel", InfiMaterialEnum.Obsidian.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackObsidianMattock, "shovel", InfiMaterialEnum.Obsidian.getHarvestLevel());
            MinecraftForge.setToolClass(glowstoneObsidianMattock, "shovel", InfiMaterialEnum.Obsidian.getHarvestLevel());
            MinecraftForge.setToolClass(iceObsidianMattock, "shovel", InfiMaterialEnum.Obsidian.getHarvestLevel());
            MinecraftForge.setToolClass(lavaObsidianMattock, "shovel", InfiMaterialEnum.Obsidian.getHarvestLevel());
            MinecraftForge.setToolClass(cactusObsidianMattock, "shovel", InfiMaterialEnum.Obsidian.getHarvestLevel());
            
            MinecraftForge.setToolClass(woodObsidianMattock, "axe", InfiMaterialEnum.Obsidian.getHarvestLevel());
            MinecraftForge.setToolClass(stoneObsidianMattock, "axe", InfiMaterialEnum.Obsidian.getHarvestLevel());
            MinecraftForge.setToolClass(redstoneObsidianMattock, "axe", InfiMaterialEnum.Obsidian.getHarvestLevel());
            MinecraftForge.setToolClass(obsidianObsidianMattock, "axe", InfiMaterialEnum.Obsidian.getHarvestLevel());
            MinecraftForge.setToolClass(boneObsidianMattock, "axe", InfiMaterialEnum.Obsidian.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackObsidianMattock, "axe", InfiMaterialEnum.Obsidian.getHarvestLevel());
            MinecraftForge.setToolClass(glowstoneObsidianMattock, "axe", InfiMaterialEnum.Obsidian.getHarvestLevel());
            MinecraftForge.setToolClass(iceObsidianMattock, "axe", InfiMaterialEnum.Obsidian.getHarvestLevel());
            MinecraftForge.setToolClass(lavaObsidianMattock, "axe", InfiMaterialEnum.Obsidian.getHarvestLevel());
            MinecraftForge.setToolClass(cactusObsidianMattock, "axe", InfiMaterialEnum.Obsidian.getHarvestLevel());
        }
        
        if(PropsHelperInfiHybrids.enableSandstoneTools)
        {
        	woodSandstoneMattock = new InfiToolMattock(PropsHelperInfiHybrids.sandstoneMattockID+0, 
                    InfiMaterialEnum.Sandstone, InfiMaterialEnum.Sandstone, "woodSandstoneMattock");
        	sandstoneSandstoneMattock = new InfiToolMattock(PropsHelperInfiHybrids.sandstoneMattockID+1, 
                    InfiMaterialEnum.Sandstone, InfiMaterialEnum.Sandstone, "sandstoneSandstoneMattock");
        	boneSandstoneMattock = new InfiToolMattock(PropsHelperInfiHybrids.sandstoneMattockID+2, 
                    InfiMaterialEnum.Sandstone, InfiMaterialEnum.Bone, "boneSandstoneMattock");
        	netherrackSandstoneMattock = new InfiToolMattock(PropsHelperInfiHybrids.sandstoneMattockID+3, 
                    InfiMaterialEnum.Sandstone, InfiMaterialEnum.Netherrack, "netherrackSandstoneMattock");
        	iceSandstoneMattock = new InfiToolMattock(PropsHelperInfiHybrids.sandstoneMattockID+4, 
                    InfiMaterialEnum.Sandstone, InfiMaterialEnum.Ice, "iceSandstoneMattock");
        	slimeSandstoneMattock = new InfiToolMattock(PropsHelperInfiHybrids.sandstoneMattockID+5,
                    InfiMaterialEnum.Sandstone, InfiMaterialEnum.Slime, "slimeSandstoneMattock");
        	cactusSandstoneMattock = new InfiToolMattock(PropsHelperInfiHybrids.sandstoneMattockID+6,
                    InfiMaterialEnum.Sandstone, InfiMaterialEnum.Cactus, "cactusSandstoneMattock");
        	flintSandstoneMattock = new InfiToolMattock(PropsHelperInfiHybrids.sandstoneMattockID+7,
                    InfiMaterialEnum.Sandstone, InfiMaterialEnum.Flint, "flintSandstoneMattock");
            
            MinecraftForge.setToolClass(woodSandstoneMattock, "shovel", InfiMaterialEnum.Sandstone.getHarvestLevel());
            MinecraftForge.setToolClass(sandstoneSandstoneMattock, "shovel", InfiMaterialEnum.Sandstone.getHarvestLevel());
            MinecraftForge.setToolClass(boneSandstoneMattock, "shovel", InfiMaterialEnum.Sandstone.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackSandstoneMattock, "shovel", InfiMaterialEnum.Sandstone.getHarvestLevel());
            MinecraftForge.setToolClass(iceSandstoneMattock, "shovel", InfiMaterialEnum.Sandstone.getHarvestLevel());
            MinecraftForge.setToolClass(slimeSandstoneMattock, "shovel", InfiMaterialEnum.Sandstone.getHarvestLevel());
            MinecraftForge.setToolClass(cactusSandstoneMattock, "shovel", InfiMaterialEnum.Sandstone.getHarvestLevel());
            MinecraftForge.setToolClass(flintSandstoneMattock, "shovel", InfiMaterialEnum.Sandstone.getHarvestLevel());
            
            MinecraftForge.setToolClass(woodSandstoneMattock, "axe", InfiMaterialEnum.Sandstone.getHarvestLevel());
            MinecraftForge.setToolClass(sandstoneSandstoneMattock, "axe", InfiMaterialEnum.Sandstone.getHarvestLevel());
            MinecraftForge.setToolClass(boneSandstoneMattock, "axe", InfiMaterialEnum.Sandstone.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackSandstoneMattock, "axe", InfiMaterialEnum.Sandstone.getHarvestLevel());
            MinecraftForge.setToolClass(iceSandstoneMattock, "axe", InfiMaterialEnum.Sandstone.getHarvestLevel());
            MinecraftForge.setToolClass(slimeSandstoneMattock, "axe", InfiMaterialEnum.Sandstone.getHarvestLevel());
            MinecraftForge.setToolClass(cactusSandstoneMattock, "axe", InfiMaterialEnum.Sandstone.getHarvestLevel());
            MinecraftForge.setToolClass(flintSandstoneMattock, "axe", InfiMaterialEnum.Sandstone.getHarvestLevel());
        }
        
        if(PropsHelperInfiHybrids.enableBoneTools)
        {
        	woodBoneMattock = new InfiToolMattock(PropsHelperInfiHybrids.boneMattockID+0, 
                    InfiMaterialEnum.Bone, InfiMaterialEnum.Bone, "woodBoneMattock");
        	stoneBoneMattock = new InfiToolMattock(PropsHelperInfiHybrids.boneMattockID+1, 
                    InfiMaterialEnum.Bone, InfiMaterialEnum.Stone, "stoneBoneMattock");
        	sandstoneBoneMattock = new InfiToolMattock(PropsHelperInfiHybrids.boneMattockID+2, 
                    InfiMaterialEnum.Bone, InfiMaterialEnum.Sandstone, "sandstoneBoneMattock");
        	boneBoneMattock = new InfiToolMattock(PropsHelperInfiHybrids.boneMattockID+3, 
                    InfiMaterialEnum.Bone, InfiMaterialEnum.Bone, "boneBoneMattock");
        	paperBoneMattock = new InfiToolMattock(PropsHelperInfiHybrids.boneMattockID+4, 
                    InfiMaterialEnum.Bone, InfiMaterialEnum.Paper, "paperBoneMattock");
        	netherrackBoneMattock = new InfiToolMattock(PropsHelperInfiHybrids.boneMattockID+5, 
                    InfiMaterialEnum.Bone, InfiMaterialEnum.Netherrack, "netherrackBoneMattock");
        	iceBoneMattock = new InfiToolMattock(PropsHelperInfiHybrids.boneMattockID+6, 
                    InfiMaterialEnum.Bone, InfiMaterialEnum.Ice, "iceBoneMattock");
        	cactusBoneMattock = new InfiToolMattock(PropsHelperInfiHybrids.boneMattockID+7,
                    InfiMaterialEnum.Bone, InfiMaterialEnum.Cactus, "cactusBoneMattock");
        	flintBoneMattock = new InfiToolMattock(PropsHelperInfiHybrids.boneMattockID+8,
                    InfiMaterialEnum.Bone, InfiMaterialEnum.Flint, "flintBoneMattock");
            
            MinecraftForge.setToolClass(woodBoneMattock, "shovel", InfiMaterialEnum.Bone.getHarvestLevel());
            MinecraftForge.setToolClass(stoneBoneMattock, "shovel", InfiMaterialEnum.Bone.getHarvestLevel());
            MinecraftForge.setToolClass(sandstoneBoneMattock, "shovel", InfiMaterialEnum.Bone.getHarvestLevel());
            MinecraftForge.setToolClass(boneBoneMattock, "shovel", InfiMaterialEnum.Bone.getHarvestLevel());
            MinecraftForge.setToolClass(paperBoneMattock, "shovel", InfiMaterialEnum.Bone.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackBoneMattock, "shovel", InfiMaterialEnum.Bone.getHarvestLevel());
            MinecraftForge.setToolClass(iceBoneMattock, "shovel", InfiMaterialEnum.Bone.getHarvestLevel());
            MinecraftForge.setToolClass(cactusBoneMattock, "shovel", InfiMaterialEnum.Bone.getHarvestLevel());
            MinecraftForge.setToolClass(flintBoneMattock, "shovel", InfiMaterialEnum.Bone.getHarvestLevel());
            
            MinecraftForge.setToolClass(woodBoneMattock, "axe", InfiMaterialEnum.Bone.getHarvestLevel());
            MinecraftForge.setToolClass(stoneBoneMattock, "axe", InfiMaterialEnum.Bone.getHarvestLevel());
            MinecraftForge.setToolClass(sandstoneBoneMattock, "axe", InfiMaterialEnum.Bone.getHarvestLevel());
            MinecraftForge.setToolClass(boneBoneMattock, "axe", InfiMaterialEnum.Bone.getHarvestLevel());
            MinecraftForge.setToolClass(paperBoneMattock, "axe", InfiMaterialEnum.Bone.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackBoneMattock, "axe", InfiMaterialEnum.Bone.getHarvestLevel());
            MinecraftForge.setToolClass(iceBoneMattock, "axe", InfiMaterialEnum.Bone.getHarvestLevel());
            MinecraftForge.setToolClass(cactusBoneMattock, "axe", InfiMaterialEnum.Bone.getHarvestLevel());
            MinecraftForge.setToolClass(flintBoneMattock, "axe", InfiMaterialEnum.Bone.getHarvestLevel());
        }
        
        if(PropsHelperInfiHybrids.enablePaperTools)
        {
        	woodPaperMattock = new InfiToolMattock(PropsHelperInfiHybrids.paperMattockID+0, 
                    InfiMaterialEnum.Paper, InfiMaterialEnum.Paper, "woodPaperMattock");
        	bonePaperMattock = new InfiToolMattock(PropsHelperInfiHybrids.paperMattockID+1, 
                    InfiMaterialEnum.Paper, InfiMaterialEnum.Paper, "bonePaperMattock");
        	paperPaperMattock = new InfiToolMattock(PropsHelperInfiHybrids.paperMattockID+2, 
                    InfiMaterialEnum.Paper, InfiMaterialEnum.Paper, "paperPaperMattock");
        	slimePaperMattock = new InfiToolMattock(PropsHelperInfiHybrids.paperMattockID+3,
                    InfiMaterialEnum.Paper, InfiMaterialEnum.Cactus, "slimePaperMattock");
        	cactusPaperMattock = new InfiToolMattock(PropsHelperInfiHybrids.paperMattockID+4,
                    InfiMaterialEnum.Paper, InfiMaterialEnum.Cactus, "cactusPaperMattock");
            
            MinecraftForge.setToolClass(woodPaperMattock, "shovel", InfiMaterialEnum.Paper.getHarvestLevel());
            MinecraftForge.setToolClass(bonePaperMattock, "shovel", InfiMaterialEnum.Paper.getHarvestLevel());
            MinecraftForge.setToolClass(paperPaperMattock, "shovel", InfiMaterialEnum.Paper.getHarvestLevel());
            MinecraftForge.setToolClass(slimePaperMattock, "shovel", InfiMaterialEnum.Paper.getHarvestLevel());
            MinecraftForge.setToolClass(cactusPaperMattock, "shovel", InfiMaterialEnum.Paper.getHarvestLevel());
            
            MinecraftForge.setToolClass(woodPaperMattock, "axe", InfiMaterialEnum.Paper.getHarvestLevel());
            MinecraftForge.setToolClass(bonePaperMattock, "axe", InfiMaterialEnum.Paper.getHarvestLevel());
            MinecraftForge.setToolClass(paperPaperMattock, "axe", InfiMaterialEnum.Paper.getHarvestLevel());
            MinecraftForge.setToolClass(slimePaperMattock, "axe", InfiMaterialEnum.Paper.getHarvestLevel());
            MinecraftForge.setToolClass(cactusPaperMattock, "axe", InfiMaterialEnum.Paper.getHarvestLevel());
        }
        
        if(PropsHelperInfiHybrids.enableMossyTools)
        {
        	woodMossyMattock = new InfiToolMattock(PropsHelperInfiHybrids.mossyMattockID+0, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Wood, "woodMossyMattock");
        	stoneMossyMattock = new InfiToolMattock(PropsHelperInfiHybrids.mossyMattockID+1, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Stone, "stoneMossyMattock");
        	diamondMossyMattock = new InfiToolMattock(PropsHelperInfiHybrids.mossyMattockID+2, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Diamond, "diamondMossyMattock");
        	redstoneMossyMattock = new InfiToolMattock(PropsHelperInfiHybrids.mossyMattockID+3, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Redstone, "redstoneMossyMattock");
        	boneMossyMattock = new InfiToolMattock(PropsHelperInfiHybrids.mossyMattockID+4, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Bone, "boneMossyMattock");
        	mossyMossyMattock = new InfiToolMattock(PropsHelperInfiHybrids.mossyMattockID+5, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Mossy, "mossyMossyMattock");
        	netherrackMossyMattock = new InfiToolMattock(PropsHelperInfiHybrids.mossyMattockID+6, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Netherrack, "netherrackMossyMattock");
        	glowstoneMossyMattock = new InfiToolMattock(PropsHelperInfiHybrids.mossyMattockID+7, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Glowstone, "glowstoneMossyMattock");
        	cactusMossyMattock = new InfiToolMattock(PropsHelperInfiHybrids.mossyMattockID+8, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Cactus, "cactusMossyMattock");
        	blazeMossyMattock = new InfiToolMattock(PropsHelperInfiHybrids.mossyMattockID+9, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Blaze, "blazeMossyMattock");
        	manyullynMossyMattock = new InfiToolMattock(PropsHelperInfiHybrids.mossyMattockID+10, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Manyullyn, "manyullynMossyMattock");
        	uraniumMossyMattock = new InfiToolMattock(PropsHelperInfiHybrids.mossyMattockID+11, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Uranium, "uraniumMossyMattock");
            
            MinecraftForge.setToolClass(woodMossyMattock, "shovel", InfiMaterialEnum.Mossy.getHarvestLevel());
            MinecraftForge.setToolClass(stoneMossyMattock, "shovel", InfiMaterialEnum.Mossy.getHarvestLevel());
            MinecraftForge.setToolClass(diamondMossyMattock, "shovel", InfiMaterialEnum.Mossy.getHarvestLevel());
            MinecraftForge.setToolClass(redstoneMossyMattock, "shovel", InfiMaterialEnum.Mossy.getHarvestLevel());
            MinecraftForge.setToolClass(boneMossyMattock, "shovel", InfiMaterialEnum.Mossy.getHarvestLevel());
            MinecraftForge.setToolClass(mossyMossyMattock, "shovel", InfiMaterialEnum.Mossy.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackMossyMattock, "shovel", InfiMaterialEnum.Mossy.getHarvestLevel());
            MinecraftForge.setToolClass(glowstoneMossyMattock, "shovel", InfiMaterialEnum.Mossy.getHarvestLevel());
            MinecraftForge.setToolClass(cactusMossyMattock, "shovel", InfiMaterialEnum.Mossy.getHarvestLevel());
            MinecraftForge.setToolClass(blazeMossyMattock, "shovel", InfiMaterialEnum.Mossy.getHarvestLevel());
            MinecraftForge.setToolClass(manyullynMossyMattock, "shovel", InfiMaterialEnum.Mossy.getHarvestLevel());
            MinecraftForge.setToolClass(uraniumMossyMattock, "shovel", InfiMaterialEnum.Mossy.getHarvestLevel());
            
            MinecraftForge.setToolClass(woodMossyMattock, "axe", InfiMaterialEnum.Mossy.getHarvestLevel());
            MinecraftForge.setToolClass(stoneMossyMattock, "axe", InfiMaterialEnum.Mossy.getHarvestLevel());
            MinecraftForge.setToolClass(diamondMossyMattock, "axe", InfiMaterialEnum.Mossy.getHarvestLevel());
            MinecraftForge.setToolClass(redstoneMossyMattock, "axe", InfiMaterialEnum.Mossy.getHarvestLevel());
            MinecraftForge.setToolClass(boneMossyMattock, "axe", InfiMaterialEnum.Mossy.getHarvestLevel());
            MinecraftForge.setToolClass(mossyMossyMattock, "axe", InfiMaterialEnum.Mossy.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackMossyMattock, "axe", InfiMaterialEnum.Mossy.getHarvestLevel());
            MinecraftForge.setToolClass(glowstoneMossyMattock, "axe", InfiMaterialEnum.Mossy.getHarvestLevel());
            MinecraftForge.setToolClass(cactusMossyMattock, "axe", InfiMaterialEnum.Mossy.getHarvestLevel());
            MinecraftForge.setToolClass(blazeMossyMattock, "axe", InfiMaterialEnum.Mossy.getHarvestLevel());
            MinecraftForge.setToolClass(manyullynMossyMattock, "axe", InfiMaterialEnum.Mossy.getHarvestLevel());
            MinecraftForge.setToolClass(uraniumMossyMattock, "axe", InfiMaterialEnum.Mossy.getHarvestLevel());
        }
        
        if(PropsHelperInfiHybrids.enableNetherrackTools)
        {
        	woodNetherrackMattock = new InfiToolMattock(PropsHelperInfiHybrids.netherrackMattockID+0, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Wood, "woodNetherrackMattock");
        	stoneNetherrackMattock = new InfiToolMattock(PropsHelperInfiHybrids.netherrackMattockID+1, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Stone, "stoneNetherrackMattock");
        	sandstoneNetherrackMattock = new InfiToolMattock(PropsHelperInfiHybrids.netherrackMattockID+2, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Sandstone, "sandstoneNetherrackMattock");
        	boneNetherrackMattock = new InfiToolMattock(PropsHelperInfiHybrids.netherrackMattockID+3, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Bone, "boneNetherrackMattock");
        	paperNetherrackMattock = new InfiToolMattock(PropsHelperInfiHybrids.netherrackMattockID+4, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Paper, "paperNetherrackMattock");
        	mossyNetherrackMattock = new InfiToolMattock(PropsHelperInfiHybrids.netherrackMattockID+5, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Mossy, "mossyNetherrackMattock");
        	netherrackNetherrackMattock = new InfiToolMattock(PropsHelperInfiHybrids.netherrackMattockID+6, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Netherrack, "netherrackNetherrackMattock");
        	iceNetherrackMattock = new InfiToolMattock(PropsHelperInfiHybrids.netherrackMattockID+7, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Ice, "iceNetherrackMattock");
        	slimeNetherrackMattock = new InfiToolMattock(PropsHelperInfiHybrids.netherrackMattockID+8, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Slime, "slimeNetherrackMattock");
        	cactusNetherrackMattock = new InfiToolMattock(PropsHelperInfiHybrids.netherrackMattockID+9, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Cactus, "cactusNetherrackMattock");
        	flintNetherrackMattock = new InfiToolMattock(PropsHelperInfiHybrids.netherrackMattockID+10, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Flint, "flintNetherrackMattock");
        	copperNetherrackMattock = new InfiToolMattock(PropsHelperInfiHybrids.netherrackMattockID+11, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Copper, "copperNetherrackMattock");
        	bronzeNetherrackMattock = new InfiToolMattock(PropsHelperInfiHybrids.netherrackMattockID+12, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Bronze, "bronzeNetherrackMattock");
            
            MinecraftForge.setToolClass(woodNetherrackMattock, "shovel", InfiMaterialEnum.Netherrack.getHarvestLevel());
            MinecraftForge.setToolClass(stoneNetherrackMattock, "shovel", InfiMaterialEnum.Netherrack.getHarvestLevel());
            MinecraftForge.setToolClass(sandstoneNetherrackMattock, "shovel", InfiMaterialEnum.Netherrack.getHarvestLevel());
            MinecraftForge.setToolClass(boneNetherrackMattock, "shovel", InfiMaterialEnum.Netherrack.getHarvestLevel());
            MinecraftForge.setToolClass(paperNetherrackMattock, "shovel", InfiMaterialEnum.Netherrack.getHarvestLevel());
            MinecraftForge.setToolClass(mossyNetherrackMattock, "shovel", InfiMaterialEnum.Netherrack.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackNetherrackMattock, "shovel", InfiMaterialEnum.Netherrack.getHarvestLevel());
            MinecraftForge.setToolClass(iceNetherrackMattock, "shovel", InfiMaterialEnum.Netherrack.getHarvestLevel());
            MinecraftForge.setToolClass(slimeNetherrackMattock, "shovel", InfiMaterialEnum.Netherrack.getHarvestLevel());
            MinecraftForge.setToolClass(cactusNetherrackMattock, "shovel", InfiMaterialEnum.Netherrack.getHarvestLevel());
            MinecraftForge.setToolClass(flintNetherrackMattock, "shovel", InfiMaterialEnum.Netherrack.getHarvestLevel());
            MinecraftForge.setToolClass(copperNetherrackMattock, "shovel", InfiMaterialEnum.Netherrack.getHarvestLevel());
            MinecraftForge.setToolClass(bronzeNetherrackMattock, "shovel", InfiMaterialEnum.Netherrack.getHarvestLevel());
            
            MinecraftForge.setToolClass(woodNetherrackMattock, "axe", InfiMaterialEnum.Netherrack.getHarvestLevel());
            MinecraftForge.setToolClass(stoneNetherrackMattock, "axe", InfiMaterialEnum.Netherrack.getHarvestLevel());
            MinecraftForge.setToolClass(sandstoneNetherrackMattock, "axe", InfiMaterialEnum.Netherrack.getHarvestLevel());
            MinecraftForge.setToolClass(boneNetherrackMattock, "axe", InfiMaterialEnum.Netherrack.getHarvestLevel());
            MinecraftForge.setToolClass(paperNetherrackMattock, "axe", InfiMaterialEnum.Netherrack.getHarvestLevel());
            MinecraftForge.setToolClass(mossyNetherrackMattock, "axe", InfiMaterialEnum.Netherrack.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackNetherrackMattock, "axe", InfiMaterialEnum.Netherrack.getHarvestLevel());
            MinecraftForge.setToolClass(iceNetherrackMattock, "axe", InfiMaterialEnum.Netherrack.getHarvestLevel());
            MinecraftForge.setToolClass(slimeNetherrackMattock, "axe", InfiMaterialEnum.Netherrack.getHarvestLevel());
            MinecraftForge.setToolClass(cactusNetherrackMattock, "axe", InfiMaterialEnum.Netherrack.getHarvestLevel());
            MinecraftForge.setToolClass(flintNetherrackMattock, "axe", InfiMaterialEnum.Netherrack.getHarvestLevel());
            MinecraftForge.setToolClass(copperNetherrackMattock, "axe", InfiMaterialEnum.Netherrack.getHarvestLevel());
            MinecraftForge.setToolClass(bronzeNetherrackMattock, "axe", InfiMaterialEnum.Netherrack.getHarvestLevel());
        }
        
        if(PropsHelperInfiHybrids.enableGlowstoneTools)
        {
        	woodGlowstoneMattock = new InfiToolMattock(PropsHelperInfiHybrids.glowstoneMattockID+0, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Wood, "woodGlowstoneMattock");
        	redstoneGlowstoneMattock = new InfiToolMattock(PropsHelperInfiHybrids.glowstoneMattockID+1, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Redstone, "redstoneGlowstoneMattock");
        	obsidianGlowstoneMattock = new InfiToolMattock(PropsHelperInfiHybrids.glowstoneMattockID+2, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Obsidian, "obsidianGlowstoneMattock");
        	boneGlowstoneMattock = new InfiToolMattock(PropsHelperInfiHybrids.glowstoneMattockID+3, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Bone, "boneGlowstoneMattock");
        	netherrackGlowstoneMattock = new InfiToolMattock(PropsHelperInfiHybrids.glowstoneMattockID+4, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Netherrack, "netherrackGlowstoneMattock");
        	glowstoneGlowstoneMattock = new InfiToolMattock(PropsHelperInfiHybrids.glowstoneMattockID+5, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Glowstone, "glowstoneGlowstoneMattock");
        	iceGlowstoneMattock = new InfiToolMattock(PropsHelperInfiHybrids.glowstoneMattockID+6, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Ice, "iceGlowstoneMattock");
        	slimeGlowstoneMattock = new InfiToolMattock(PropsHelperInfiHybrids.glowstoneMattockID+7, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Slime, "slimeGlowstoneMattock");
        	cactusGlowstoneMattock = new InfiToolMattock(PropsHelperInfiHybrids.glowstoneMattockID+8, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Cactus, "cactusGlowstoneMattock");
            
            
            MinecraftForge.setToolClass(woodGlowstoneMattock, "shovel", InfiMaterialEnum.Glowstone.getHarvestLevel());
            MinecraftForge.setToolClass(redstoneGlowstoneMattock, "shovel", InfiMaterialEnum.Glowstone.getHarvestLevel());
            MinecraftForge.setToolClass(obsidianGlowstoneMattock, "shovel", InfiMaterialEnum.Glowstone.getHarvestLevel());
            MinecraftForge.setToolClass(boneGlowstoneMattock, "shovel", InfiMaterialEnum.Glowstone.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackGlowstoneMattock, "shovel", InfiMaterialEnum.Glowstone.getHarvestLevel());
            MinecraftForge.setToolClass(glowstoneGlowstoneMattock, "shovel", InfiMaterialEnum.Glowstone.getHarvestLevel());
            MinecraftForge.setToolClass(iceGlowstoneMattock, "shovel", InfiMaterialEnum.Glowstone.getHarvestLevel());
            MinecraftForge.setToolClass(slimeGlowstoneMattock, "shovel", InfiMaterialEnum.Glowstone.getHarvestLevel());
            MinecraftForge.setToolClass(cactusGlowstoneMattock, "shovel", InfiMaterialEnum.Glowstone.getHarvestLevel());
            
            MinecraftForge.setToolClass(woodGlowstoneMattock, "axe", InfiMaterialEnum.Glowstone.getHarvestLevel());
            MinecraftForge.setToolClass(redstoneGlowstoneMattock, "axe", InfiMaterialEnum.Glowstone.getHarvestLevel());
            MinecraftForge.setToolClass(obsidianGlowstoneMattock, "axe", InfiMaterialEnum.Glowstone.getHarvestLevel());
            MinecraftForge.setToolClass(boneGlowstoneMattock, "axe", InfiMaterialEnum.Glowstone.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackGlowstoneMattock, "axe", InfiMaterialEnum.Glowstone.getHarvestLevel());
            MinecraftForge.setToolClass(glowstoneGlowstoneMattock, "axe", InfiMaterialEnum.Glowstone.getHarvestLevel());
            MinecraftForge.setToolClass(iceGlowstoneMattock, "axe", InfiMaterialEnum.Glowstone.getHarvestLevel());
            MinecraftForge.setToolClass(slimeGlowstoneMattock, "axe", InfiMaterialEnum.Glowstone.getHarvestLevel());
            MinecraftForge.setToolClass(cactusGlowstoneMattock, "axe", InfiMaterialEnum.Glowstone.getHarvestLevel());
        }
        
        if(PropsHelperInfiHybrids.enableIceTools)
        {
        	woodIceMattock = new InfiToolMattock(PropsHelperInfiHybrids.iceMattockID+0, 
                    InfiMaterialEnum.Ice, InfiMaterialEnum.Wood, "woodIceMattock");
        	boneIceMattock = new InfiToolMattock(PropsHelperInfiHybrids.iceMattockID+1, 
                    InfiMaterialEnum.Ice, InfiMaterialEnum.Bone, "boneIceMattock");
        	paperIceMattock = new InfiToolMattock(PropsHelperInfiHybrids.iceMattockID+2, 
                    InfiMaterialEnum.Ice, InfiMaterialEnum.Paper, "paperIceMattock");
        	iceIceMattock = new InfiToolMattock(PropsHelperInfiHybrids.iceMattockID+3, 
                    InfiMaterialEnum.Ice, InfiMaterialEnum.Ice, "iceIceMattock");
        	slimeIceMattock = new InfiToolMattock(PropsHelperInfiHybrids.iceMattockID+4, 
                    InfiMaterialEnum.Ice, InfiMaterialEnum.Slime, "slimeIceMattock");
        	cactusIceMattock = new InfiToolMattock(PropsHelperInfiHybrids.iceMattockID+5, 
                    InfiMaterialEnum.Ice, InfiMaterialEnum.Cactus, "cactusIceMattock");
            
            MinecraftForge.setToolClass(woodIceMattock, "shovel", InfiMaterialEnum.Ice.getHarvestLevel());
            MinecraftForge.setToolClass(boneIceMattock, "shovel", InfiMaterialEnum.Ice.getHarvestLevel());
            MinecraftForge.setToolClass(paperIceMattock, "shovel", InfiMaterialEnum.Ice.getHarvestLevel());
            MinecraftForge.setToolClass(iceIceMattock, "shovel", InfiMaterialEnum.Ice.getHarvestLevel());
            MinecraftForge.setToolClass(slimeIceMattock, "shovel", InfiMaterialEnum.Ice.getHarvestLevel());
            MinecraftForge.setToolClass(cactusIceMattock, "shovel", InfiMaterialEnum.Ice.getHarvestLevel());
            
            MinecraftForge.setToolClass(woodIceMattock, "axe", InfiMaterialEnum.Ice.getHarvestLevel());
            MinecraftForge.setToolClass(boneIceMattock, "axe", InfiMaterialEnum.Ice.getHarvestLevel());
            MinecraftForge.setToolClass(paperIceMattock, "axe", InfiMaterialEnum.Ice.getHarvestLevel());
            MinecraftForge.setToolClass(iceIceMattock, "axe", InfiMaterialEnum.Ice.getHarvestLevel());
            MinecraftForge.setToolClass(slimeIceMattock, "axe", InfiMaterialEnum.Ice.getHarvestLevel());
            MinecraftForge.setToolClass(cactusIceMattock, "axe", InfiMaterialEnum.Ice.getHarvestLevel());
        }
        
        if(PropsHelperInfiHybrids.enableLavaTools)
        {
        	diamondLavaMattock = new InfiToolMattock(PropsHelperInfiHybrids.lavaMattockID+0, 
                    InfiMaterialEnum.Lava, InfiMaterialEnum.Diamond, "diamondLavaMattock");
        	obsidianLavaMattock = new InfiToolMattock(PropsHelperInfiHybrids.lavaMattockID+1, 
                    InfiMaterialEnum.Lava, InfiMaterialEnum.Obsidian, "obsidianLavaMattock");
        	netherrackLavaMattock = new InfiToolMattock(PropsHelperInfiHybrids.lavaMattockID+2, 
                    InfiMaterialEnum.Lava, InfiMaterialEnum.Netherrack, "netherrackLavaMattock");
        	lavaLavaMattock = new InfiToolMattock(PropsHelperInfiHybrids.lavaMattockID+3, 
                    InfiMaterialEnum.Lava, InfiMaterialEnum.Lava, "lavaLavaMattock");
        	flintLavaMattock = new InfiToolMattock(PropsHelperInfiHybrids.lavaMattockID+4, 
                    InfiMaterialEnum.Lava, InfiMaterialEnum.Flint, "flintLavaMattock");
        	blazeLavaMattock = new InfiToolMattock(PropsHelperInfiHybrids.lavaMattockID+5, 
                    InfiMaterialEnum.Lava, InfiMaterialEnum.Blaze, "blazeLavaMattock");
        	manyullynLavaMattock = new InfiToolMattock(PropsHelperInfiHybrids.lavaMattockID+6, 
                    InfiMaterialEnum.Lava, InfiMaterialEnum.Manyullyn, "manyullynLavaMattock");
            uraniumLavaMattock = new InfiToolMattock(PropsHelperInfiHybrids.lavaMattockID+7, 
                    InfiMaterialEnum.Lava, InfiMaterialEnum.Uranium, "uraniumLavaMattock");
            
            MinecraftForge.setToolClass(diamondLavaMattock, "shovel", InfiMaterialEnum.Lava.getHarvestLevel());
            MinecraftForge.setToolClass(obsidianLavaMattock, "shovel", InfiMaterialEnum.Lava.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackLavaMattock, "shovel", InfiMaterialEnum.Lava.getHarvestLevel());
            MinecraftForge.setToolClass(lavaLavaMattock, "shovel", InfiMaterialEnum.Lava.getHarvestLevel());
            MinecraftForge.setToolClass(flintLavaMattock, "shovel", InfiMaterialEnum.Lava.getHarvestLevel());
            MinecraftForge.setToolClass(blazeLavaMattock, "shovel", InfiMaterialEnum.Lava.getHarvestLevel());
            MinecraftForge.setToolClass(manyullynLavaMattock, "shovel", InfiMaterialEnum.Lava.getHarvestLevel());
            MinecraftForge.setToolClass(uraniumLavaMattock, "shovel", InfiMaterialEnum.Lava.getHarvestLevel());
            
            MinecraftForge.setToolClass(diamondLavaMattock, "axe", InfiMaterialEnum.Lava.getHarvestLevel());
            MinecraftForge.setToolClass(obsidianLavaMattock, "axe", InfiMaterialEnum.Lava.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackLavaMattock, "axe", InfiMaterialEnum.Lava.getHarvestLevel());
            MinecraftForge.setToolClass(lavaLavaMattock, "axe", InfiMaterialEnum.Lava.getHarvestLevel());
            MinecraftForge.setToolClass(flintLavaMattock, "axe", InfiMaterialEnum.Lava.getHarvestLevel());
            MinecraftForge.setToolClass(blazeLavaMattock, "axe", InfiMaterialEnum.Lava.getHarvestLevel());
            MinecraftForge.setToolClass(manyullynLavaMattock, "axe", InfiMaterialEnum.Lava.getHarvestLevel());
            MinecraftForge.setToolClass(uraniumLavaMattock, "axe", InfiMaterialEnum.Lava.getHarvestLevel());
        }
        
        if(PropsHelperInfiHybrids.enableSlimeTools)
        {
        	woodSlimeMattock = new InfiToolMattock(PropsHelperInfiHybrids.slimeMattockID+0, 
                    InfiMaterialEnum.Slime, InfiMaterialEnum.Wood, "woodSlimeMattock");
        	sandstoneSlimeMattock = new InfiToolMattock(PropsHelperInfiHybrids.slimeMattockID+1, 
                    InfiMaterialEnum.Slime, InfiMaterialEnum.Sandstone, "sandstoneSlimeMattock");
        	boneSlimeMattock = new InfiToolMattock(PropsHelperInfiHybrids.slimeMattockID+2, 
                    InfiMaterialEnum.Slime, InfiMaterialEnum.Bone, "boneSlimeMattock");
        	paperSlimeMattock = new InfiToolMattock(PropsHelperInfiHybrids.slimeMattockID+3, 
                    InfiMaterialEnum.Slime, InfiMaterialEnum.Paper, "paperSlimeMattock");
        	slimeSlimeMattock = new InfiToolMattock(PropsHelperInfiHybrids.slimeMattockID+4, 
                    InfiMaterialEnum.Slime, InfiMaterialEnum.Slime, "slimeSlimeMattock");
        	cactusSlimeMattock = new InfiToolMattock(PropsHelperInfiHybrids.slimeMattockID+5, 
                    InfiMaterialEnum.Slime, InfiMaterialEnum.Cactus, "cactusSlimeMattock");
            
            MinecraftForge.setToolClass(woodSlimeMattock, "shovel", InfiMaterialEnum.Slime.getHarvestLevel());
            MinecraftForge.setToolClass(sandstoneSlimeMattock, "shovel", InfiMaterialEnum.Slime.getHarvestLevel());
            MinecraftForge.setToolClass(boneSlimeMattock, "shovel", InfiMaterialEnum.Slime.getHarvestLevel());
            MinecraftForge.setToolClass(paperSlimeMattock, "shovel", InfiMaterialEnum.Slime.getHarvestLevel());
            MinecraftForge.setToolClass(slimeSlimeMattock, "shovel", InfiMaterialEnum.Slime.getHarvestLevel());
            MinecraftForge.setToolClass(cactusSlimeMattock, "shovel", InfiMaterialEnum.Slime.getHarvestLevel());
            
            MinecraftForge.setToolClass(woodSlimeMattock, "axe", InfiMaterialEnum.Slime.getHarvestLevel());
            MinecraftForge.setToolClass(sandstoneSlimeMattock, "axe", InfiMaterialEnum.Slime.getHarvestLevel());
            MinecraftForge.setToolClass(boneSlimeMattock, "axe", InfiMaterialEnum.Slime.getHarvestLevel());
            MinecraftForge.setToolClass(paperSlimeMattock, "axe", InfiMaterialEnum.Slime.getHarvestLevel());
            MinecraftForge.setToolClass(slimeSlimeMattock, "axe", InfiMaterialEnum.Slime.getHarvestLevel());
            MinecraftForge.setToolClass(cactusSlimeMattock, "axe", InfiMaterialEnum.Slime.getHarvestLevel());
        }
        
        if(PropsHelperInfiHybrids.enableCactusTools)
        {
        	woodCactusMattock = new InfiToolMattock(PropsHelperInfiHybrids.cactusMattockID+0, 
                    InfiMaterialEnum.Cactus, InfiMaterialEnum.Wood, "woodCactusMattock");
        	sandstoneCactusMattock = new InfiToolMattock(PropsHelperInfiHybrids.cactusMattockID+1, 
                    InfiMaterialEnum.Cactus, InfiMaterialEnum.Sandstone, "sandstoneCactusMattock");
        	boneCactusMattock = new InfiToolMattock(PropsHelperInfiHybrids.cactusMattockID+2, 
                    InfiMaterialEnum.Cactus, InfiMaterialEnum.Bone, "boneCactusMattock");
        	netherrackCactusMattock = new InfiToolMattock(PropsHelperInfiHybrids.cactusMattockID+3, 
                    InfiMaterialEnum.Cactus, InfiMaterialEnum.Netherrack, "netherrackCactusMattock");
        	iceCactusMattock = new InfiToolMattock(PropsHelperInfiHybrids.cactusMattockID+4, 
                    InfiMaterialEnum.Cactus, InfiMaterialEnum.Ice, "iceCactusMattock");
        	slimeCactusMattock = new InfiToolMattock(PropsHelperInfiHybrids.cactusMattockID+5, 
                    InfiMaterialEnum.Cactus, InfiMaterialEnum.Slime, "slimeCactusMattock");
        	cactusCactusMattock = new InfiToolMattock(PropsHelperInfiHybrids.cactusMattockID+6, 
                    InfiMaterialEnum.Cactus, InfiMaterialEnum.Cactus, "cactusCactusMattock");
            
            MinecraftForge.setToolClass(woodCactusMattock, "shovel", InfiMaterialEnum.Cactus.getHarvestLevel());
            MinecraftForge.setToolClass(sandstoneCactusMattock, "shovel", InfiMaterialEnum.Cactus.getHarvestLevel());
            MinecraftForge.setToolClass(boneCactusMattock, "shovel", InfiMaterialEnum.Cactus.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackCactusMattock, "shovel", InfiMaterialEnum.Cactus.getHarvestLevel());
            MinecraftForge.setToolClass(iceCactusMattock, "shovel", InfiMaterialEnum.Cactus.getHarvestLevel());
            MinecraftForge.setToolClass(slimeCactusMattock, "shovel", InfiMaterialEnum.Cactus.getHarvestLevel());
            MinecraftForge.setToolClass(cactusCactusMattock, "shovel", InfiMaterialEnum.Cactus.getHarvestLevel());
            
            MinecraftForge.setToolClass(woodCactusMattock, "axe", InfiMaterialEnum.Cactus.getHarvestLevel());
            MinecraftForge.setToolClass(sandstoneCactusMattock, "axe", InfiMaterialEnum.Cactus.getHarvestLevel());
            MinecraftForge.setToolClass(boneCactusMattock, "axe", InfiMaterialEnum.Cactus.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackCactusMattock, "axe", InfiMaterialEnum.Cactus.getHarvestLevel());
            MinecraftForge.setToolClass(iceCactusMattock, "axe", InfiMaterialEnum.Cactus.getHarvestLevel());
            MinecraftForge.setToolClass(slimeCactusMattock, "axe", InfiMaterialEnum.Cactus.getHarvestLevel());
            MinecraftForge.setToolClass(cactusCactusMattock, "axe", InfiMaterialEnum.Cactus.getHarvestLevel());
        }
        
        if(PropsHelperInfiHybrids.enableFlintTools)
        {
        	woodFlintMattock = new InfiToolMattock(PropsHelperInfiHybrids.flintMattockID+0, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Wood, "woodFlintMattock");
        	stoneFlintMattock = new InfiToolMattock(PropsHelperInfiHybrids.flintMattockID+1, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Stone, "stoneFlintMattock");
        	sandstoneFlintMattock = new InfiToolMattock(PropsHelperInfiHybrids.flintMattockID+2, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Sandstone, "sandstoneFlintMattock");
        	boneFlintMattock = new InfiToolMattock(PropsHelperInfiHybrids.flintMattockID+3, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Bone, "boneFlintMattock");
        	netherrackFlintMattock = new InfiToolMattock(PropsHelperInfiHybrids.flintMattockID+4, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Flint, "netherrackFlintMattock");
        	slimeFlintMattock = new InfiToolMattock(PropsHelperInfiHybrids.flintMattockID+5, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Slime, "slimeFlintMattock");
        	cactusFlintMattock = new InfiToolMattock(PropsHelperInfiHybrids.flintMattockID+6, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Cactus, "cactusFlintMattock");
        	flintFlintMattock = new InfiToolMattock(PropsHelperInfiHybrids.flintMattockID+7, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Flint, "flintFlintMattock");
        	copperFlintMattock = new InfiToolMattock(PropsHelperInfiHybrids.flintMattockID+8, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Copper, "copperFlintMattock");
        	bronzeFlintMattock = new InfiToolMattock(PropsHelperInfiHybrids.flintMattockID+9, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Bronze, "bronzeFlintMattock");
            
            MinecraftForge.setToolClass(woodFlintMattock, "shovel", InfiMaterialEnum.Flint.getHarvestLevel());
            MinecraftForge.setToolClass(stoneFlintMattock, "shovel", InfiMaterialEnum.Flint.getHarvestLevel());
            MinecraftForge.setToolClass(sandstoneFlintMattock, "shovel", InfiMaterialEnum.Flint.getHarvestLevel());
            MinecraftForge.setToolClass(boneFlintMattock, "shovel", InfiMaterialEnum.Flint.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackFlintMattock, "shovel", InfiMaterialEnum.Flint.getHarvestLevel());
            MinecraftForge.setToolClass(slimeFlintMattock, "shovel", InfiMaterialEnum.Flint.getHarvestLevel());
            MinecraftForge.setToolClass(cactusFlintMattock, "shovel", InfiMaterialEnum.Flint.getHarvestLevel());
            MinecraftForge.setToolClass(flintFlintMattock, "shovel", InfiMaterialEnum.Flint.getHarvestLevel());
            MinecraftForge.setToolClass(copperFlintMattock, "shovel", InfiMaterialEnum.Flint.getHarvestLevel());
            MinecraftForge.setToolClass(bronzeFlintMattock, "shovel", InfiMaterialEnum.Flint.getHarvestLevel());
            
            MinecraftForge.setToolClass(woodFlintMattock, "axe", InfiMaterialEnum.Flint.getHarvestLevel());
            MinecraftForge.setToolClass(stoneFlintMattock, "axe", InfiMaterialEnum.Flint.getHarvestLevel());
            MinecraftForge.setToolClass(sandstoneFlintMattock, "axe", InfiMaterialEnum.Flint.getHarvestLevel());
            MinecraftForge.setToolClass(boneFlintMattock, "axe", InfiMaterialEnum.Flint.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackFlintMattock, "axe", InfiMaterialEnum.Flint.getHarvestLevel());
            MinecraftForge.setToolClass(slimeFlintMattock, "axe", InfiMaterialEnum.Flint.getHarvestLevel());
            MinecraftForge.setToolClass(cactusFlintMattock, "axe", InfiMaterialEnum.Flint.getHarvestLevel());
            MinecraftForge.setToolClass(flintFlintMattock, "axe", InfiMaterialEnum.Flint.getHarvestLevel());
            MinecraftForge.setToolClass(copperFlintMattock, "axe", InfiMaterialEnum.Flint.getHarvestLevel());
            MinecraftForge.setToolClass(bronzeFlintMattock, "axe", InfiMaterialEnum.Flint.getHarvestLevel());
        }
        
        if(PropsHelperInfiHybrids.enableBlazeTools)
        {
        	diamondBlazeMattock = new InfiToolMattock(PropsHelperInfiHybrids.blazeMattockID+0, 
                    InfiMaterialEnum.Blaze, InfiMaterialEnum.Diamond, "diamondBlazeMattock");
        	obsidianBlazeMattock = new InfiToolMattock(PropsHelperInfiHybrids.blazeMattockID+1, 
                    InfiMaterialEnum.Blaze, InfiMaterialEnum.Obsidian, "obsidianBlazeMattock");
        	netherrackBlazeMattock = new InfiToolMattock(PropsHelperInfiHybrids.blazeMattockID+2, 
                    InfiMaterialEnum.Blaze, InfiMaterialEnum.Netherrack, "netherrackBlazeMattock");
        	lavaBlazeMattock = new InfiToolMattock(PropsHelperInfiHybrids.blazeMattockID+3, 
                    InfiMaterialEnum.Blaze, InfiMaterialEnum.Lava, "lavaBlazeMattock");
        	flintBlazeMattock = new InfiToolMattock(PropsHelperInfiHybrids.blazeMattockID+4, 
                    InfiMaterialEnum.Blaze, InfiMaterialEnum.Flint, "flintBlazeMattock");
        	blazeBlazeMattock = new InfiToolMattock(PropsHelperInfiHybrids.blazeMattockID+5, 
                    InfiMaterialEnum.Blaze, InfiMaterialEnum.Blaze, "blazeBlazeMattock");
        	manyullynBlazeMattock = new InfiToolMattock(PropsHelperInfiHybrids.blazeMattockID+6, 
                    InfiMaterialEnum.Blaze, InfiMaterialEnum.Manyullyn, "manyullynBlazeMattock");
            uraniumBlazeMattock = new InfiToolMattock(PropsHelperInfiHybrids.blazeMattockID+7, 
                    InfiMaterialEnum.Blaze, InfiMaterialEnum.Uranium, "uraniumBlazeMattock");
            
            MinecraftForge.setToolClass(diamondBlazeMattock, "shovel", InfiMaterialEnum.Blaze.getHarvestLevel());
            MinecraftForge.setToolClass(obsidianBlazeMattock, "shovel", InfiMaterialEnum.Blaze.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackBlazeMattock, "shovel", InfiMaterialEnum.Blaze.getHarvestLevel());
            MinecraftForge.setToolClass(blazeBlazeMattock, "shovel", InfiMaterialEnum.Blaze.getHarvestLevel());
            MinecraftForge.setToolClass(flintBlazeMattock, "shovel", InfiMaterialEnum.Blaze.getHarvestLevel());
            MinecraftForge.setToolClass(blazeBlazeMattock, "shovel", InfiMaterialEnum.Blaze.getHarvestLevel());
            MinecraftForge.setToolClass(manyullynBlazeMattock, "shovel", InfiMaterialEnum.Blaze.getHarvestLevel());
            MinecraftForge.setToolClass(uraniumBlazeMattock, "shovel", InfiMaterialEnum.Blaze.getHarvestLevel());
            
            MinecraftForge.setToolClass(diamondBlazeMattock, "axe", InfiMaterialEnum.Blaze.getHarvestLevel());
            MinecraftForge.setToolClass(obsidianBlazeMattock, "axe", InfiMaterialEnum.Blaze.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackBlazeMattock, "axe", InfiMaterialEnum.Blaze.getHarvestLevel());
            MinecraftForge.setToolClass(blazeBlazeMattock, "axe", InfiMaterialEnum.Blaze.getHarvestLevel());
            MinecraftForge.setToolClass(flintBlazeMattock, "axe", InfiMaterialEnum.Blaze.getHarvestLevel());
            MinecraftForge.setToolClass(blazeBlazeMattock, "axe", InfiMaterialEnum.Blaze.getHarvestLevel());
            MinecraftForge.setToolClass(manyullynBlazeMattock, "axe", InfiMaterialEnum.Blaze.getHarvestLevel());
            MinecraftForge.setToolClass(uraniumBlazeMattock, "axe", InfiMaterialEnum.Blaze.getHarvestLevel());
        }
    	
        if(PropsHelperInfiHybrids.enableCopperTools)
        {
        	woodCopperMattock = new InfiToolMattock(PropsHelperInfiHybrids.copperMattockID+0, 
                    InfiMaterialEnum.Copper, InfiMaterialEnum.Wood, "woodCopperMattock");
            stoneCopperMattock = new InfiToolMattock(PropsHelperInfiHybrids.copperMattockID+1, 
                    InfiMaterialEnum.Copper, InfiMaterialEnum.Stone, "stoneCopperMattock");
            boneCopperMattock = new InfiToolMattock(PropsHelperInfiHybrids.copperMattockID+2, 
                    InfiMaterialEnum.Copper, InfiMaterialEnum.Bone, "boneCopperMattock");
            netherrackCopperMattock = new InfiToolMattock(PropsHelperInfiHybrids.copperMattockID+3, 
                    InfiMaterialEnum.Copper, InfiMaterialEnum.Netherrack, "netherrackCopperMattock");
            slimeCopperMattock = new InfiToolMattock(PropsHelperInfiHybrids.copperMattockID+4, 
                    InfiMaterialEnum.Copper, InfiMaterialEnum.Slime, "slimeCopperMattock");
            cactusCopperMattock = new InfiToolMattock(PropsHelperInfiHybrids.copperMattockID+5, 
                    InfiMaterialEnum.Copper, InfiMaterialEnum.Cactus, "cactusCopperMattock");
            flintCopperMattock = new InfiToolMattock(PropsHelperInfiHybrids.copperMattockID+6, 
                    InfiMaterialEnum.Copper, InfiMaterialEnum.Flint, "flintCopperMattock");
            copperCopperMattock = new InfiToolMattock(PropsHelperInfiHybrids.copperMattockID+7, 
                    InfiMaterialEnum.Copper, InfiMaterialEnum.Copper, "copperCopperMattock");
            
            MinecraftForge.setToolClass(woodCopperMattock, "shovel", InfiMaterialEnum.Copper.getHarvestLevel());
        	MinecraftForge.setToolClass(stoneCopperMattock, "shovel", InfiMaterialEnum.Copper.getHarvestLevel());
            MinecraftForge.setToolClass(boneCopperMattock, "shovel", InfiMaterialEnum.Copper.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackCopperMattock, "shovel", InfiMaterialEnum.Copper.getHarvestLevel());
            MinecraftForge.setToolClass(slimeCopperMattock, "shovel", InfiMaterialEnum.Copper.getHarvestLevel());
            MinecraftForge.setToolClass(cactusCopperMattock, "shovel", InfiMaterialEnum.Copper.getHarvestLevel());
            MinecraftForge.setToolClass(flintCopperMattock, "shovel", InfiMaterialEnum.Copper.getHarvestLevel());
            MinecraftForge.setToolClass(copperCopperMattock, "shovel", InfiMaterialEnum.Copper.getHarvestLevel());
            
            MinecraftForge.setToolClass(woodCopperMattock, "axe", InfiMaterialEnum.Copper.getHarvestLevel());
        	MinecraftForge.setToolClass(stoneCopperMattock, "axe", InfiMaterialEnum.Copper.getHarvestLevel());
            MinecraftForge.setToolClass(boneCopperMattock, "axe", InfiMaterialEnum.Copper.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackCopperMattock, "axe", InfiMaterialEnum.Copper.getHarvestLevel());
            MinecraftForge.setToolClass(slimeCopperMattock, "axe", InfiMaterialEnum.Copper.getHarvestLevel());
            MinecraftForge.setToolClass(cactusCopperMattock, "axe", InfiMaterialEnum.Copper.getHarvestLevel());
            MinecraftForge.setToolClass(flintCopperMattock, "axe", InfiMaterialEnum.Copper.getHarvestLevel());
            MinecraftForge.setToolClass(copperCopperMattock, "axe", InfiMaterialEnum.Copper.getHarvestLevel());
        }
        
        if(PropsHelperInfiHybrids.enableBronzeTools)
        {
        	woodBronzeMattock = new InfiToolMattock(PropsHelperInfiHybrids.bronzeMattockID+0, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Wood, "woodBronzeMattock");
            stoneBronzeMattock = new InfiToolMattock(PropsHelperInfiHybrids.bronzeMattockID+1, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Stone, "stoneBronzeMattock");
            boneBronzeMattock = new InfiToolMattock(PropsHelperInfiHybrids.bronzeMattockID+2, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Bone, "boneBronzeMattock");
            netherrackBronzeMattock = new InfiToolMattock(PropsHelperInfiHybrids.bronzeMattockID+3, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Netherrack, "netherrackBronzeMattock");
            slimeBronzeMattock = new InfiToolMattock(PropsHelperInfiHybrids.bronzeMattockID+4, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Slime, "slimeBronzeMattock");
            cactusBronzeMattock = new InfiToolMattock(PropsHelperInfiHybrids.bronzeMattockID+5, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Cactus, "cactusBronzeMattock");
            flintBronzeMattock = new InfiToolMattock(PropsHelperInfiHybrids.bronzeMattockID+6, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Flint, "flintBronzeMattock");
            copperBronzeMattock = new InfiToolMattock(PropsHelperInfiHybrids.bronzeMattockID+7, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Copper, "copperBronzeMattock");
            bronzeBronzeMattock = new InfiToolMattock(PropsHelperInfiHybrids.bronzeMattockID+8, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Bronze, "copperBronzeMattock");
            
            MinecraftForge.setToolClass(woodBronzeMattock, "shovel", InfiMaterialEnum.Bronze.getHarvestLevel());
            MinecraftForge.setToolClass(stoneBronzeMattock, "shovel", InfiMaterialEnum.Bronze.getHarvestLevel());
            MinecraftForge.setToolClass(boneBronzeMattock, "shovel", InfiMaterialEnum.Bronze.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackBronzeMattock, "shovel", InfiMaterialEnum.Bronze.getHarvestLevel());
            MinecraftForge.setToolClass(slimeBronzeMattock, "shovel", InfiMaterialEnum.Bronze.getHarvestLevel());
            MinecraftForge.setToolClass(cactusBronzeMattock, "shovel", InfiMaterialEnum.Bronze.getHarvestLevel());
            MinecraftForge.setToolClass(flintBronzeMattock, "shovel", InfiMaterialEnum.Bronze.getHarvestLevel());
            MinecraftForge.setToolClass(copperBronzeMattock, "shovel", InfiMaterialEnum.Bronze.getHarvestLevel());
            MinecraftForge.setToolClass(bronzeBronzeMattock, "shovel", InfiMaterialEnum.Bronze.getHarvestLevel());
            
            MinecraftForge.setToolClass(woodBronzeMattock, "axe", InfiMaterialEnum.Bronze.getHarvestLevel());
            MinecraftForge.setToolClass(stoneBronzeMattock, "axe", InfiMaterialEnum.Bronze.getHarvestLevel());
            MinecraftForge.setToolClass(boneBronzeMattock, "axe", InfiMaterialEnum.Bronze.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackBronzeMattock, "axe", InfiMaterialEnum.Bronze.getHarvestLevel());
            MinecraftForge.setToolClass(slimeBronzeMattock, "axe", InfiMaterialEnum.Bronze.getHarvestLevel());
            MinecraftForge.setToolClass(cactusBronzeMattock, "axe", InfiMaterialEnum.Bronze.getHarvestLevel());
            MinecraftForge.setToolClass(flintBronzeMattock, "axe", InfiMaterialEnum.Bronze.getHarvestLevel());
            MinecraftForge.setToolClass(copperBronzeMattock, "axe", InfiMaterialEnum.Bronze.getHarvestLevel());
            MinecraftForge.setToolClass(bronzeBronzeMattock, "axe", InfiMaterialEnum.Bronze.getHarvestLevel());
        }
        
        if(PropsHelperInfiHybrids.enableWorkedIronTools)
        {
        	woodWorkedIronMattock = new InfiToolMattock(PropsHelperInfiHybrids.workedIronMattockID+0, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Wood, "woodWorkedIronMattock");
            stoneWorkedIronMattock = new InfiToolMattock(PropsHelperInfiHybrids.workedIronMattockID+1, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Stone, "stoneWorkedIronMattock");
            ironWorkedIronMattock = new InfiToolMattock(PropsHelperInfiHybrids.workedIronMattockID+2,
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Iron, "ironWorkedIronMattock");
            diamondWorkedIronMattock = new InfiToolMattock(PropsHelperInfiHybrids.workedIronMattockID+3, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Diamond, "diamondWorkedIronMattock");
            redstoneWorkedIronMattock = new InfiToolMattock(PropsHelperInfiHybrids.workedIronMattockID+4, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Redstone, "redstoneWorkedIronMattock");
            obsidianWorkedIronMattock = new InfiToolMattock(PropsHelperInfiHybrids.workedIronMattockID+5, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Obsidian, "obsidianWorkedIronMattock");
            boneWorkedIronMattock = new InfiToolMattock(PropsHelperInfiHybrids.workedIronMattockID+6, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Bone, "boneWorkedIronMattock");
            netherrackWorkedIronMattock = new InfiToolMattock(PropsHelperInfiHybrids.workedIronMattockID+7, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Netherrack, "netherrackWorkedIronMattock");
            glowstoneWorkedIronMattock = new InfiToolMattock(PropsHelperInfiHybrids.workedIronMattockID+8, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Glowstone, "glowstoneWorkedIronMattock");
            iceWorkedIronMattock = new InfiToolMattock(PropsHelperInfiHybrids.workedIronMattockID+9, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Ice, "iceWorkedIronMattock");
            slimeWorkedIronMattock = new InfiToolMattock(PropsHelperInfiHybrids.workedIronMattockID+10, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Slime, "slimeWorkedIronMattock");
            cactusWorkedIronMattock = new InfiToolMattock(PropsHelperInfiHybrids.workedIronMattockID+11, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Cactus, "cactusWorkedIronMattock");
            blazeWorkedIronMattock = new InfiToolMattock(PropsHelperInfiHybrids.workedIronMattockID+12, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Blaze, "blazeWorkedIronMattock");
            copperWorkedIronMattock = new InfiToolMattock(PropsHelperInfiHybrids.workedIronMattockID+13, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Copper, "copperWorkedIronMattock");
            bronzeWorkedIronMattock = new InfiToolMattock(PropsHelperInfiHybrids.workedIronMattockID+14, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Bronze, "bronzeWorkedIronMattock");
            workedWorkedIronMattock = new InfiToolMattock(PropsHelperInfiHybrids.workedIronMattockID+15, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.WorkedIron, "workedWorkedIronMattock");
            steelWorkedIronMattock = new InfiToolMattock(PropsHelperInfiHybrids.workedIronMattockID+16, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Steel, "steelWorkedIronMattock");
            uraniumWorkedIronMattock = new InfiToolMattock(PropsHelperInfiHybrids.workedIronMattockID+17, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Bronze, "uraniumWorkedIronMattock");
            
            MinecraftForge.setToolClass(woodWorkedIronMattock, "shovel", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(stoneWorkedIronMattock, "shovel", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(ironWorkedIronMattock, "shovel", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(diamondWorkedIronMattock, "shovel", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(redstoneWorkedIronMattock, "shovel", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(obsidianWorkedIronMattock, "shovel", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(boneWorkedIronMattock, "shovel", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackWorkedIronMattock, "shovel", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(glowstoneWorkedIronMattock, "shovel", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(iceWorkedIronMattock, "shovel", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(slimeWorkedIronMattock, "shovel", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(cactusWorkedIronMattock, "shovel", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(blazeWorkedIronMattock, "shovel", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(copperWorkedIronMattock, "shovel", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(bronzeWorkedIronMattock, "shovel", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(workedWorkedIronMattock, "shovel", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(steelWorkedIronMattock, "shovel", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(uraniumWorkedIronMattock, "shovel", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            
            MinecraftForge.setToolClass(woodWorkedIronMattock, "axe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(stoneWorkedIronMattock, "axe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(ironWorkedIronMattock, "axe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(diamondWorkedIronMattock, "axe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(redstoneWorkedIronMattock, "axe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(obsidianWorkedIronMattock, "axe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(boneWorkedIronMattock, "axe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackWorkedIronMattock, "axe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(glowstoneWorkedIronMattock, "axe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(iceWorkedIronMattock, "axe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(slimeWorkedIronMattock, "axe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(cactusWorkedIronMattock, "axe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(blazeWorkedIronMattock, "axe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(copperWorkedIronMattock, "axe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(bronzeWorkedIronMattock, "axe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(workedWorkedIronMattock, "axe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(steelWorkedIronMattock, "axe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(uraniumWorkedIronMattock, "axe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
        }
        
        if(PropsHelperInfiHybrids.enableSteelTools)
        {
        	woodSteelMattock = new InfiToolMattock(PropsHelperInfiHybrids.steelMattockID+0, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Wood, "woodSteelMattock");
            stoneSteelMattock = new InfiToolMattock(PropsHelperInfiHybrids.steelMattockID+1, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Stone, "stoneSteelMattock");
            ironSteelMattock = new InfiToolMattock(PropsHelperInfiHybrids.steelMattockID+2, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Iron, "ironSteelMattock");
            diamondSteelMattock = new InfiToolMattock(PropsHelperInfiHybrids.steelMattockID+3, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Diamond, "diamondSteelMattock");
            redstoneSteelMattock = new InfiToolMattock(PropsHelperInfiHybrids.steelMattockID+4, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Redstone, "redstoneSteelMattock");
            obsidianSteelMattock = new InfiToolMattock(PropsHelperInfiHybrids.steelMattockID+5, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Obsidian, "obsidianSteelMattock");
            boneSteelMattock = new InfiToolMattock(PropsHelperInfiHybrids.steelMattockID+6, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Bone, "boneSteelMattock");
            netherrackSteelMattock = new InfiToolMattock(PropsHelperInfiHybrids.steelMattockID+7, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Netherrack, "netherrackSteelMattock");
            glowstoneSteelMattock = new InfiToolMattock(PropsHelperInfiHybrids.steelMattockID+8, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Glowstone, "glowstoneSteelMattock");
            iceSteelMattock = new InfiToolMattock(PropsHelperInfiHybrids.steelMattockID+9, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Ice, "iceSteelMattock");
            slimeSteelMattock = new InfiToolMattock(PropsHelperInfiHybrids.steelMattockID+10, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Slime, "slimeSteelMattock");
            cactusSteelMattock = new InfiToolMattock(PropsHelperInfiHybrids.steelMattockID+11, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Cactus, "cactusSteelMattock");
            blazeSteelMattock = new InfiToolMattock(PropsHelperInfiHybrids.steelMattockID+12, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Blaze, "blazeSteelMattock");
            copperSteelMattock = new InfiToolMattock(PropsHelperInfiHybrids.steelMattockID+13, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Copper, "copperSteelMattock");
            bronzeSteelMattock = new InfiToolMattock(PropsHelperInfiHybrids.steelMattockID+14, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Bronze, "bronzeSteelMattock");
            workedSteelMattock = new InfiToolMattock(PropsHelperInfiHybrids.steelMattockID+15, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.WorkedIron, "workedSteelMattock");
            steelSteelMattock = new InfiToolMattock(PropsHelperInfiHybrids.steelMattockID+16, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Steel, "steelSteelMattock");
            cobaltSteelMattock = new InfiToolMattock(PropsHelperInfiHybrids.steelMattockID+17, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Cobalt, "cobaltSteelMattock");
            arditeSteelMattock = new InfiToolMattock(PropsHelperInfiHybrids.steelMattockID+18, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Ardite, "arditeSteelMattock");
            uraniumSteelMattock = new InfiToolMattock(PropsHelperInfiHybrids.steelMattockID+19, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Bronze, "uraniumSteelMattock");

            MinecraftForge.setToolClass(woodSteelMattock, "shovel", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(stoneSteelMattock, "shovel", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(ironSteelMattock, "shovel", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(diamondSteelMattock, "shovel", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(redstoneSteelMattock, "shovel", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(obsidianSteelMattock, "shovel", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(boneSteelMattock, "shovel", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackSteelMattock, "shovel", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(glowstoneSteelMattock, "shovel", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(iceSteelMattock, "shovel", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(slimeSteelMattock, "shovel", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(cactusSteelMattock, "shovel", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(blazeSteelMattock, "shovel", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(copperSteelMattock, "shovel", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(bronzeSteelMattock, "shovel", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(workedSteelMattock, "shovel", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(steelSteelMattock, "shovel", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(cobaltSteelMattock, "shovel", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(arditeSteelMattock, "shovel", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(uraniumSteelMattock, "shovel", InfiMaterialEnum.Steel.getHarvestLevel());
            
            MinecraftForge.setToolClass(woodSteelMattock, "axe", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(stoneSteelMattock, "axe", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(ironSteelMattock, "axe", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(diamondSteelMattock, "axe", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(redstoneSteelMattock, "axe", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(obsidianSteelMattock, "axe", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(boneSteelMattock, "axe", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackSteelMattock, "axe", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(glowstoneSteelMattock, "axe", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(iceSteelMattock, "axe", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(slimeSteelMattock, "axe", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(cactusSteelMattock, "axe", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(blazeSteelMattock, "axe", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(copperSteelMattock, "axe", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(bronzeSteelMattock, "axe", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(workedSteelMattock, "axe", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(steelSteelMattock, "axe", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(cobaltSteelMattock, "axe", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(arditeSteelMattock, "axe", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(uraniumSteelMattock, "axe", InfiMaterialEnum.Steel.getHarvestLevel());
        }
        
        if(PropsHelperInfiHybrids.enableCobaltTools)
        {
        	woodCobaltMattock = new InfiToolMattock(PropsHelperInfiHybrids.cobaltMattockID+0, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Wood, "woodCobaltMattock");
            stoneCobaltMattock = new InfiToolMattock(PropsHelperInfiHybrids.cobaltMattockID+1, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Stone, "stoneCobaltMattock");
            ironCobaltMattock = new InfiToolMattock(PropsHelperInfiHybrids.cobaltMattockID+2, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Iron, "ironCobaltMattock");
            diamondCobaltMattock = new InfiToolMattock(PropsHelperInfiHybrids.cobaltMattockID+3,
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Diamond, "diamondCobaltMattock");
            redstoneCobaltMattock = new InfiToolMattock(PropsHelperInfiHybrids.cobaltMattockID+4, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Redstone, "redstoneCobaltMattock");
            obsidianCobaltMattock = new InfiToolMattock(PropsHelperInfiHybrids.cobaltMattockID+5, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Obsidian, "obsidianCobaltMattock");
            boneCobaltMattock = new InfiToolMattock(PropsHelperInfiHybrids.cobaltMattockID+6, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Bone, "boneCobaltMattock");
            slimeCobaltMattock = new InfiToolMattock(PropsHelperInfiHybrids.cobaltMattockID+7, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Slime, "slimeCobaltMattock");
            cactusCobaltMattock = new InfiToolMattock(PropsHelperInfiHybrids.cobaltMattockID+8, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Cactus, "cactusCobaltMattock");
            blazeCobaltMattock = new InfiToolMattock(PropsHelperInfiHybrids.cobaltMattockID+9, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Blaze, "blazeCobaltMattock");
            copperCobaltMattock = new InfiToolMattock(PropsHelperInfiHybrids.cobaltMattockID+10, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Copper, "copperCobaltMattock");
            bronzeCobaltMattock = new InfiToolMattock(PropsHelperInfiHybrids.cobaltMattockID+11, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Bronze, "bronzeCobaltMattock");
            workedCobaltMattock = new InfiToolMattock(PropsHelperInfiHybrids.cobaltMattockID+12, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.WorkedIron, "workedCobaltMattock");
            steelCobaltMattock = new InfiToolMattock(PropsHelperInfiHybrids.cobaltMattockID+13, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Steel, "steelCobaltMattock");
            cobaltCobaltMattock = new InfiToolMattock(PropsHelperInfiHybrids.cobaltMattockID+14, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Cobalt, "cobaltCobaltMattock");
            arditeCobaltMattock = new InfiToolMattock(PropsHelperInfiHybrids.cobaltMattockID+15, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Ardite, "arditeCobaltMattock");
            manyullynCobaltMattock = new InfiToolMattock(PropsHelperInfiHybrids.cobaltMattockID+16, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Manyullyn, "arditeCobaltMattock");
            uraniumCobaltMattock = new InfiToolMattock(PropsHelperInfiHybrids.cobaltMattockID+17, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Bronze, "uraniumCobaltMattock");
            
            MinecraftForge.setToolClass(woodCobaltMattock, "shovel", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(stoneCobaltMattock, "shovel", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(ironCobaltMattock, "shovel", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(diamondCobaltMattock, "shovel", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(redstoneCobaltMattock, "shovel", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(obsidianCobaltMattock, "shovel", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(boneCobaltMattock, "shovel", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(slimeCobaltMattock, "shovel", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(cactusCobaltMattock, "shovel", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(blazeCobaltMattock, "shovel", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(copperCobaltMattock, "shovel", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(bronzeCobaltMattock, "shovel", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(workedCobaltMattock, "shovel", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(steelCobaltMattock, "shovel", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(cobaltCobaltMattock, "shovel", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(arditeCobaltMattock, "shovel", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(manyullynCobaltMattock, "shovel", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(uraniumCobaltMattock, "shovel", InfiMaterialEnum.Cobalt.getHarvestLevel());
            
            MinecraftForge.setToolClass(woodCobaltMattock, "axe", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(stoneCobaltMattock, "axe", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(ironCobaltMattock, "axe", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(diamondCobaltMattock, "axe", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(redstoneCobaltMattock, "axe", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(obsidianCobaltMattock, "axe", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(boneCobaltMattock, "axe", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(slimeCobaltMattock, "axe", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(cactusCobaltMattock, "axe", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(blazeCobaltMattock, "axe", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(copperCobaltMattock, "axe", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(bronzeCobaltMattock, "axe", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(workedCobaltMattock, "axe", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(steelCobaltMattock, "axe", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(cobaltCobaltMattock, "axe", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(arditeCobaltMattock, "axe", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(manyullynCobaltMattock, "axe", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(uraniumCobaltMattock, "axe", InfiMaterialEnum.Cobalt.getHarvestLevel());
        }
        
        if(PropsHelperInfiHybrids.enableArditeTools)
        {
        	woodArditeMattock = new InfiToolMattock(PropsHelperInfiHybrids.arditeMattockID+0, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Wood, "woodArditeMattock");
            stoneArditeMattock = new InfiToolMattock(PropsHelperInfiHybrids.arditeMattockID+1, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Stone, "stoneArditeMattock");
            ironArditeMattock = new InfiToolMattock(PropsHelperInfiHybrids.arditeMattockID+2, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Iron, "ironArditeMattock");
            diamondArditeMattock = new InfiToolMattock(PropsHelperInfiHybrids.arditeMattockID+3,
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Diamond, "diamondArditeMattock");
            redstoneArditeMattock = new InfiToolMattock(PropsHelperInfiHybrids.arditeMattockID+4, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Redstone, "redstoneArditeMattock");
            obsidianArditeMattock = new InfiToolMattock(PropsHelperInfiHybrids.arditeMattockID+5, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Obsidian, "obsidianArditeMattock");
            boneArditeMattock = new InfiToolMattock(PropsHelperInfiHybrids.arditeMattockID+6,
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Bone, "boneArditeMattock");
            slimeArditeMattock = new InfiToolMattock(PropsHelperInfiHybrids.arditeMattockID+7, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Slime, "slimeArditeMattock");
            cactusArditeMattock = new InfiToolMattock(PropsHelperInfiHybrids.arditeMattockID+8, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Cactus, "cactusArditeMattock");
            blazeArditeMattock = new InfiToolMattock(PropsHelperInfiHybrids.arditeMattockID+9, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Blaze, "blazeArditeMattock");
            copperArditeMattock = new InfiToolMattock(PropsHelperInfiHybrids.arditeMattockID+10, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Copper, "copperArditeMattock");
            bronzeArditeMattock = new InfiToolMattock(PropsHelperInfiHybrids.arditeMattockID+11, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Bronze, "bronzeArditeMattock");
            workedArditeMattock = new InfiToolMattock(PropsHelperInfiHybrids.arditeMattockID+12, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.WorkedIron, "workedArditeMattock");
            steelArditeMattock = new InfiToolMattock(PropsHelperInfiHybrids.arditeMattockID+13, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Steel, "steelArditeMattock");
            cobaltArditeMattock = new InfiToolMattock(PropsHelperInfiHybrids.arditeMattockID+14, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Cobalt, "cobaltArditeMattock");
            arditeArditeMattock = new InfiToolMattock(PropsHelperInfiHybrids.arditeMattockID+15, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Ardite, "arditeArditeMattock");
            manyullynArditeMattock = new InfiToolMattock(PropsHelperInfiHybrids.arditeMattockID+16, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Manyullyn, "arditeArditeMattock");
            uraniumArditeMattock = new InfiToolMattock(PropsHelperInfiHybrids.arditeMattockID+17, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Bronze, "uraniumArditeMattock");
            
            MinecraftForge.setToolClass(woodArditeMattock, "shovel", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(stoneArditeMattock, "shovel", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(ironArditeMattock, "shovel", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(diamondArditeMattock, "shovel", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(redstoneArditeMattock, "shovel", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(obsidianArditeMattock, "shovel", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(boneArditeMattock, "shovel", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(slimeArditeMattock, "shovel", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(cactusArditeMattock, "shovel", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(blazeArditeMattock, "shovel", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(copperArditeMattock, "shovel", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(bronzeArditeMattock, "shovel", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(workedArditeMattock, "shovel", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(steelArditeMattock, "shovel", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(cobaltArditeMattock, "shovel", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(arditeArditeMattock, "shovel", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(manyullynArditeMattock, "shovel", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(uraniumArditeMattock, "shovel", InfiMaterialEnum.Ardite.getHarvestLevel());
            
            MinecraftForge.setToolClass(woodArditeMattock, "axe", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(stoneArditeMattock, "axe", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(ironArditeMattock, "axe", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(diamondArditeMattock, "axe", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(redstoneArditeMattock, "axe", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(obsidianArditeMattock, "axe", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(boneArditeMattock, "axe", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(slimeArditeMattock, "axe", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(cactusArditeMattock, "axe", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(blazeArditeMattock, "axe", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(copperArditeMattock, "axe", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(bronzeArditeMattock, "axe", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(workedArditeMattock, "axe", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(steelArditeMattock, "axe", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(cobaltArditeMattock, "axe", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(arditeArditeMattock, "axe", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(manyullynArditeMattock, "axe", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(uraniumArditeMattock, "axe", InfiMaterialEnum.Ardite.getHarvestLevel());
        }
        
        if(PropsHelperInfiHybrids.enableManyullynTools)
        {
        	woodManyullynMattock = new InfiToolMattock(PropsHelperInfiHybrids.manyullynMattockID+0, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Stone, "woodManyullynMattock");
            stoneManyullynMattock = new InfiToolMattock(PropsHelperInfiHybrids.manyullynMattockID+1, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Stone, "stoneManyullynMattock");
            ironManyullynMattock = new InfiToolMattock(PropsHelperInfiHybrids.manyullynMattockID+2, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Iron, "ironManyullynMattock");
            diamondManyullynMattock = new InfiToolMattock(PropsHelperInfiHybrids.manyullynMattockID+3,
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Diamond, "diamondManyullynMattock");
            redstoneManyullynMattock = new InfiToolMattock(PropsHelperInfiHybrids.manyullynMattockID+4, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Redstone, "redstoneManyullynMattock");
            obsidianManyullynMattock = new InfiToolMattock(PropsHelperInfiHybrids.manyullynMattockID+5, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Obsidian, "obsidianManyullynMattock");
            boneManyullynMattock = new InfiToolMattock(PropsHelperInfiHybrids.manyullynMattockID+6, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Bone, "boneManyullynMattock");
            slimeManyullynMattock = new InfiToolMattock(PropsHelperInfiHybrids.manyullynMattockID+7, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Slime, "slimeManyullynMattock");
            cactusManyullynMattock = new InfiToolMattock(PropsHelperInfiHybrids.manyullynMattockID+8, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Cactus, "cactusManyullynMattock");
            blazeManyullynMattock = new InfiToolMattock(PropsHelperInfiHybrids.manyullynMattockID+9, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Blaze, "blazeManyullynMattock");
            copperManyullynMattock = new InfiToolMattock(PropsHelperInfiHybrids.manyullynMattockID+10, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Copper, "copperManyullynMattock");
            bronzeManyullynMattock = new InfiToolMattock(PropsHelperInfiHybrids.manyullynMattockID+11, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Bronze, "bronzeManyullynMattock");
            workedManyullynMattock = new InfiToolMattock(PropsHelperInfiHybrids.manyullynMattockID+12, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.WorkedIron, "workedManyullynMattock");
            steelManyullynMattock = new InfiToolMattock(PropsHelperInfiHybrids.manyullynMattockID+13, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Steel, "steelManyullynMattock");
            cobaltManyullynMattock = new InfiToolMattock(PropsHelperInfiHybrids.manyullynMattockID+14, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Cobalt, "cobaltManyullynMattock");
            arditeManyullynMattock = new InfiToolMattock(PropsHelperInfiHybrids.manyullynMattockID+15, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Ardite, "arditeManyullynMattock");
            manyullynManyullynMattock = new InfiToolMattock(PropsHelperInfiHybrids.manyullynMattockID+16, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Manyullyn, "arditeManyullynMattock");
            uraniumManyullynMattock = new InfiToolMattock(PropsHelperInfiHybrids.manyullynMattockID+17,
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Bronze, "uraniumManyullynMattock");
            
            MinecraftForge.setToolClass(woodManyullynMattock, "shovel", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(stoneManyullynMattock, "shovel", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(ironManyullynMattock, "shovel", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(diamondManyullynMattock, "shovel", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(redstoneManyullynMattock, "shovel", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(obsidianManyullynMattock, "shovel", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(boneManyullynMattock, "shovel", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(slimeManyullynMattock, "shovel", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(cactusManyullynMattock, "shovel", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(blazeManyullynMattock, "shovel", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(copperManyullynMattock, "shovel", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(bronzeManyullynMattock, "shovel", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(workedManyullynMattock, "shovel", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(steelManyullynMattock, "shovel", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(cobaltManyullynMattock, "shovel", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(arditeManyullynMattock, "shovel", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(manyullynManyullynMattock, "shovel", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(uraniumManyullynMattock, "shovel", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            
            MinecraftForge.setToolClass(woodManyullynMattock, "axe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(stoneManyullynMattock, "axe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(ironManyullynMattock, "axe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(diamondManyullynMattock, "axe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(redstoneManyullynMattock, "axe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(obsidianManyullynMattock, "axe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(boneManyullynMattock, "axe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(slimeManyullynMattock, "axe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(cactusManyullynMattock, "axe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(blazeManyullynMattock, "axe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(copperManyullynMattock, "axe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(bronzeManyullynMattock, "axe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(workedManyullynMattock, "axe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(steelManyullynMattock, "axe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(cobaltManyullynMattock, "axe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(arditeManyullynMattock, "axe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(manyullynManyullynMattock, "axe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(uraniumManyullynMattock, "axe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
        }
        
        if(PropsHelperInfiHybrids.enableUraniumTools)
        {
            diamondUraniumMattock = new InfiToolMattock(PropsHelperInfiHybrids.uraniumMattockID+0, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Diamond, "diamondUraniumMattock");
            redstoneUraniumMattock = new InfiToolMattock(PropsHelperInfiHybrids.uraniumMattockID+1, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Redstone, "redstoneUraniumMattock");
            boneUraniumMattock = new InfiToolMattock(PropsHelperInfiHybrids.uraniumMattockID+2, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Bone, "boneUraniumMattock");
            netherrackUraniumMattock = new InfiToolMattock(PropsHelperInfiHybrids.uraniumMattockID+3, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Netherrack, "netherrackUraniumMattock");
            glowstoneUraniumMattock = new InfiToolMattock(PropsHelperInfiHybrids.uraniumMattockID+4, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Glowstone, "glowstoneUraniumMattock");
            lavaUraniumMattock = new InfiToolMattock(PropsHelperInfiHybrids.uraniumMattockID+5, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Lava, "lavaUraniumMattock");
            blazeUraniumMattock = new InfiToolMattock(PropsHelperInfiHybrids.uraniumMattockID+6, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Blaze, "blazeUraniumMattock");
            cobaltUraniumMattock = new InfiToolMattock(PropsHelperInfiHybrids.uraniumMattockID+7, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Cobalt, "cobaltUraniumMattock");
            arditeUraniumMattock = new InfiToolMattock(PropsHelperInfiHybrids.uraniumMattockID+8, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Ardite, "arditeUraniumMattock");
            uraniumUraniumMattock = new InfiToolMattock(PropsHelperInfiHybrids.uraniumMattockID+9, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Uranium, "uraniumUraniumMattock");
            
            MinecraftForge.setToolClass(diamondUraniumMattock, "shovel", InfiMaterialEnum.Uranium.getHarvestLevel());
            MinecraftForge.setToolClass(redstoneUraniumMattock, "shovel", InfiMaterialEnum.Uranium.getHarvestLevel());
            MinecraftForge.setToolClass(boneUraniumMattock, "shovel", InfiMaterialEnum.Uranium.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackUraniumMattock, "shovel", InfiMaterialEnum.Uranium.getHarvestLevel());
            MinecraftForge.setToolClass(glowstoneUraniumMattock, "shovel", InfiMaterialEnum.Uranium.getHarvestLevel());
            MinecraftForge.setToolClass(lavaUraniumMattock, "shovel", InfiMaterialEnum.Uranium.getHarvestLevel());
            MinecraftForge.setToolClass(blazeUraniumMattock, "shovel", InfiMaterialEnum.Uranium.getHarvestLevel());
            MinecraftForge.setToolClass(cobaltUraniumMattock, "shovel", InfiMaterialEnum.Uranium.getHarvestLevel());
            MinecraftForge.setToolClass(arditeUraniumMattock, "shovel", InfiMaterialEnum.Uranium.getHarvestLevel());
            MinecraftForge.setToolClass(uraniumUraniumMattock, "shovel", InfiMaterialEnum.Uranium.getHarvestLevel());
            
            MinecraftForge.setToolClass(diamondUraniumMattock, "axe", InfiMaterialEnum.Uranium.getHarvestLevel());
            MinecraftForge.setToolClass(redstoneUraniumMattock, "axe", InfiMaterialEnum.Uranium.getHarvestLevel());
            MinecraftForge.setToolClass(boneUraniumMattock, "axe", InfiMaterialEnum.Uranium.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackUraniumMattock, "axe", InfiMaterialEnum.Uranium.getHarvestLevel());
            MinecraftForge.setToolClass(glowstoneUraniumMattock, "axe", InfiMaterialEnum.Uranium.getHarvestLevel());
            MinecraftForge.setToolClass(lavaUraniumMattock, "axe", InfiMaterialEnum.Uranium.getHarvestLevel());
            MinecraftForge.setToolClass(blazeUraniumMattock, "axe", InfiMaterialEnum.Uranium.getHarvestLevel());
            MinecraftForge.setToolClass(cobaltUraniumMattock, "axe", InfiMaterialEnum.Uranium.getHarvestLevel());
            MinecraftForge.setToolClass(arditeUraniumMattock, "axe", InfiMaterialEnum.Uranium.getHarvestLevel());
            MinecraftForge.setToolClass(uraniumUraniumMattock, "axe", InfiMaterialEnum.Uranium.getHarvestLevel());
        }
    }
    
    private static void addNames()
    {
    	ModLoader.addName(woodWoodMattock, "Wooden Mattock");
    	ModLoader.addName(stoneStoneMattock, "Heavy Mattock");
    	ModLoader.addName(ironIronMattock, "Ironic Mattock");
    	ModLoader.addName(diamondDiamondMattock, "Diamondium Mattock");
    	ModLoader.addName(redstoneRedstoneMattock, "Redredred Mattock");
    	ModLoader.addName(obsidianObsidianMattock, "Ebony Mattock");
    	ModLoader.addName(sandstoneSandstoneMattock, "Fragile Mattock");
    	ModLoader.addName(boneBoneMattock, "Necrotic Mattock");
    	ModLoader.addName(paperPaperMattock, "Soft Mattock");
    	ModLoader.addName(mossyMossyMattock, "Living Mattock");
    	ModLoader.addName(netherrackNetherrackMattock, "Blood Mattock");
    	ModLoader.addName(glowstoneGlowstoneMattock, "Bright Mattock");
    	ModLoader.addName(iceIceMattock, "Freezing Mattock");
    	ModLoader.addName(lavaLavaMattock, "Burning Mattock");
    	ModLoader.addName(slimeSlimeMattock, "Toy Mattock");
    	ModLoader.addName(cactusCactusMattock, "Thorned Mattock");
    	ModLoader.addName(flintFlintMattock, "Rough-hewn Mattock");
    	ModLoader.addName(blazeBlazeMattock, "Netherite Mattock");
        ModLoader.addName(copperCopperMattock, "Orange-Tang Mattock");
        ModLoader.addName(bronzeBronzeMattock, "Polished Mattock");
        ModLoader.addName(workedWorkedIronMattock, "Reworked Iron Mattock");
        ModLoader.addName(steelSteelMattock, "Forge-Wrought Mattock");
        ModLoader.addName(cobaltCobaltMattock, "Beautiful Mattock");
        ModLoader.addName(arditeArditeMattock, "Rustic StoneDigger");
        ModLoader.addName(manyullynManyullynMattock, "False-Prophetic Mattock");
        ModLoader.addName(uraniumUraniumMattock, "Cancerous Mattock");
    }
    
    public static void registerInfiToolsRecipes()
    {
    	if(PropsHelperInfiHybrids.enableWoodTools)
        {
            ModLoader.addRecipe(new ItemStack(woodWoodMattock), new Object[] 
                    { recipe, '#', Block.planks, '|', Item.stick });
            ModLoader.addRecipe(new ItemStack(sandstoneWoodMattock), new Object[] 
                    { recipe, '#', Block.planks, '|', mod_InfiBase.sandstoneRod });
            ModLoader.addRecipe(new ItemStack(boneWoodMattock), new Object[] 
                    { recipe, '#', Block.planks, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneWoodMattock), new Object[] 
                    { recipe, '#', Block.planks, '|', mod_InfiBase.boneRod });
            ModLoader.addRecipe(new ItemStack(paperWoodMattock), new Object[] 
                    { recipe, '#', Block.planks, '|', mod_InfiBase.paperRod });
            ModLoader.addRecipe(new ItemStack(iceWoodMattock), new Object[] 
                    { recipe, '#', Block.planks, '|', mod_InfiBase.iceRod });
            ModLoader.addRecipe(new ItemStack(slimeWoodMattock), new Object[] 
                    { recipe, '#', Block.planks, '|', mod_InfiBase.slimeRod });
            ModLoader.addRecipe(new ItemStack(cactusWoodMattock), new Object[] 
                    { recipe, '#', Block.planks, '|', mod_InfiBase.cactusRod });
        }
    	
        if(PropsHelperInfiHybrids.enableStoneTools)
        {
        	ModLoader.addRecipe(new ItemStack(woodStoneMattock), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', Item.stick });
        	ModLoader.addRecipe(new ItemStack(stoneStoneMattock), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', mod_InfiBase.stoneRod });
            ModLoader.addRecipe(new ItemStack(sandstoneStoneMattock), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', mod_InfiBase.sandstoneRod });
            ModLoader.addRecipe(new ItemStack(boneStoneMattock), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneStoneMattock), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', mod_InfiBase.boneRod });
            ModLoader.addRecipe(new ItemStack(netherrackStoneMattock), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', mod_InfiBase.netherrackRod });
            ModLoader.addRecipe(new ItemStack(iceStoneMattock), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', mod_InfiBase.iceRod });
            ModLoader.addRecipe(new ItemStack(slimeStoneMattock), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', mod_InfiBase.slimeRod });
            ModLoader.addRecipe(new ItemStack(cactusStoneMattock), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', mod_InfiBase.cactusRod });
            ModLoader.addRecipe(new ItemStack(flintStoneMattock), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', mod_InfiBase.flintRod });
            
            ModLoader.addRecipe(new ItemStack(woodStoneMattock), new Object[] 
                    { recipe, '#', Block.stone, '|', Item.stick });
        	ModLoader.addRecipe(new ItemStack(stoneStoneMattock), new Object[] 
                    { recipe, '#', Block.stone, '|', mod_InfiBase.stoneRod });
            ModLoader.addRecipe(new ItemStack(sandstoneStoneMattock), new Object[] 
                    { recipe, '#', Block.stone, '|', mod_InfiBase.sandstoneRod });
            ModLoader.addRecipe(new ItemStack(boneStoneMattock), new Object[] 
                    { recipe, '#', Block.stone, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneStoneMattock), new Object[] 
                    { recipe, '#', Block.stone, '|', mod_InfiBase.boneRod });
            ModLoader.addRecipe(new ItemStack(netherrackStoneMattock), new Object[] 
                    { recipe, '#', Block.stone, '|', mod_InfiBase.netherrackRod });
            ModLoader.addRecipe(new ItemStack(iceStoneMattock), new Object[] 
                    { recipe, '#', Block.stone, '|', mod_InfiBase.iceRod });
            ModLoader.addRecipe(new ItemStack(slimeStoneMattock), new Object[] 
                    { recipe, '#', Block.stone, '|', mod_InfiBase.slimeRod });
            ModLoader.addRecipe(new ItemStack(cactusStoneMattock), new Object[] 
                    { recipe, '#', Block.stone, '|', mod_InfiBase.cactusRod });
            ModLoader.addRecipe(new ItemStack(flintStoneMattock), new Object[] 
                    { recipe, '#', Block.stone, '|', mod_InfiBase.flintRod });
        }
        
        if(PropsHelperInfiHybrids.enableIronTools)
        {
        	ModLoader.addRecipe(new ItemStack(woodIronMattock), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', Item.stick });
        	ModLoader.addRecipe(new ItemStack(stoneIronMattock), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', mod_InfiBase.stoneRod });
            ModLoader.addRecipe(new ItemStack(ironIronMattock), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', mod_InfiBase.ironRod });
            ModLoader.addRecipe(new ItemStack(boneIronMattock), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneIronMattock), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', mod_InfiBase.boneRod });
            ModLoader.addRecipe(new ItemStack(netherrackIronMattock), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', mod_InfiBase.netherrackRod });
            ModLoader.addRecipe(new ItemStack(glowstoneIronMattock), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', mod_InfiBase.glowstoneRod });
            ModLoader.addRecipe(new ItemStack(cactusIronMattock), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', mod_InfiBase.cactusRod });
            ModLoader.addRecipe(new ItemStack(copperIronMattock), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', mod_InfiBase.copperRod });
            ModLoader.addRecipe(new ItemStack(bronzeIronMattock), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', mod_InfiBase.bronzeRod });
        }
        
        if(PropsHelperInfiHybrids.enableDiamondTools)
        {
        	ModLoader.addRecipe(new ItemStack(woodDiamondMattock), new Object[] 
                    { recipe, '#', Item.diamond, '|', Item.stick });
        	ModLoader.addRecipe(new ItemStack(stoneDiamondMattock), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.stoneRod });
            ModLoader.addRecipe(new ItemStack(ironDiamondMattock), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.ironRod });
            ModLoader.addRecipe(new ItemStack(diamondDiamondMattock), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.diamondRod });
            ModLoader.addRecipe(new ItemStack(redstoneDiamondMattock), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.redstoneRod });
            ModLoader.addRecipe(new ItemStack(obsidianDiamondMattock), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.obsidianRod });
            ModLoader.addRecipe(new ItemStack(boneDiamondMattock), new Object[] 
                    { recipe, '#', Item.diamond, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneDiamondMattock), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.boneRod });
            ModLoader.addRecipe(new ItemStack(mossyDiamondMattock), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.mossyRod });
            ModLoader.addRecipe(new ItemStack(netherrackDiamondMattock), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.netherrackRod });
            ModLoader.addRecipe(new ItemStack(glowstoneDiamondMattock), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.glowstoneRod });
            ModLoader.addRecipe(new ItemStack(lavaDiamondMattock), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.lavaRod });
            ModLoader.addRecipe(new ItemStack(cactusDiamondMattock), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.cactusRod });
            ModLoader.addRecipe(new ItemStack(flintDiamondMattock), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.flintRod });
            ModLoader.addRecipe(new ItemStack(blazeDiamondMattock), new Object[] 
                    { recipe, '#', Item.diamond, '|', Item.blazeRod });
            ModLoader.addRecipe(new ItemStack(copperDiamondMattock), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.copperRod });
            ModLoader.addRecipe(new ItemStack(bronzeDiamondMattock), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.bronzeRod });
            ModLoader.addRecipe(new ItemStack(workedDiamondMattock), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.workedIronRod });
            ModLoader.addRecipe(new ItemStack(steelDiamondMattock), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.steelRod });
            ModLoader.addRecipe(new ItemStack(cobaltDiamondMattock), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.cobaltRod });
            ModLoader.addRecipe(new ItemStack(arditeDiamondMattock), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.arditeRod });
            ModLoader.addRecipe(new ItemStack(manyullynDiamondMattock), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.manyullynRod });
            ModLoader.addRecipe(new ItemStack(uraniumDiamondMattock), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.uraniumRod });
        }
        
        if(PropsHelperInfiHybrids.enableRedstoneTools)
        {
        	ModLoader.addRecipe(new ItemStack(woodRedstoneMattock), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', Item.stick });
        	ModLoader.addRecipe(new ItemStack(stoneRedstoneMattock), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.stoneRod });
            ModLoader.addRecipe(new ItemStack(ironRedstoneMattock), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.ironRod });
            ModLoader.addRecipe(new ItemStack(redstoneRedstoneMattock), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.redstoneRod });
            ModLoader.addRecipe(new ItemStack(obsidianRedstoneMattock), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.obsidianRod });
            ModLoader.addRecipe(new ItemStack(sandstoneRedstoneMattock), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.sandstoneRod });
            ModLoader.addRecipe(new ItemStack(boneRedstoneMattock), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneRedstoneMattock), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.boneRod });
            ModLoader.addRecipe(new ItemStack(paperRedstoneMattock), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.paperRod });
            ModLoader.addRecipe(new ItemStack(mossyRedstoneMattock), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.mossyRod });
            ModLoader.addRecipe(new ItemStack(netherrackRedstoneMattock), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.netherrackRod });
            ModLoader.addRecipe(new ItemStack(glowstoneRedstoneMattock), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.glowstoneRod });
            ModLoader.addRecipe(new ItemStack(iceRedstoneMattock), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.iceRod });
            ModLoader.addRecipe(new ItemStack(lavaRedstoneMattock), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.lavaRod });
            ModLoader.addRecipe(new ItemStack(slimeRedstoneMattock), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.slimeRod });
            ModLoader.addRecipe(new ItemStack(cactusRedstoneMattock), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.cactusRod });
            ModLoader.addRecipe(new ItemStack(flintRedstoneMattock), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.flintRod });
            ModLoader.addRecipe(new ItemStack(copperRedstoneMattock), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.copperRod });
            ModLoader.addRecipe(new ItemStack(bronzeRedstoneMattock), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.bronzeRod });
            ModLoader.addRecipe(new ItemStack(workedRedstoneMattock), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.workedIronRod });
            ModLoader.addRecipe(new ItemStack(uraniumRedstoneMattock), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.uraniumRod });
        }
        
        if(PropsHelperInfiHybrids.enableObsidianTools)
        {
        	ModLoader.addRecipe(new ItemStack(woodObsidianMattock), new Object[] 
                    { recipe, '#', Block.obsidian, '|', Item.stick });
        	ModLoader.addRecipe(new ItemStack(stoneObsidianMattock), new Object[] 
                    { recipe, '#', Block.obsidian, '|', mod_InfiBase.stoneRod });
            ModLoader.addRecipe(new ItemStack(redstoneObsidianMattock), new Object[] 
                    { recipe, '#', Block.obsidian, '|', mod_InfiBase.redstoneRod });
            ModLoader.addRecipe(new ItemStack(obsidianObsidianMattock), new Object[] 
                    { recipe, '#', Block.obsidian, '|', mod_InfiBase.obsidianRod });
            ModLoader.addRecipe(new ItemStack(boneObsidianMattock), new Object[] 
                    { recipe, '#', Block.obsidian, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneObsidianMattock), new Object[] 
                    { recipe, '#', Block.obsidian, '|', mod_InfiBase.boneRod });
            ModLoader.addRecipe(new ItemStack(netherrackObsidianMattock), new Object[] 
                    { recipe, '#', Block.obsidian, '|', mod_InfiBase.netherrackRod });
            ModLoader.addRecipe(new ItemStack(glowstoneObsidianMattock), new Object[] 
                    { recipe, '#', Block.obsidian, '|', mod_InfiBase.glowstoneRod });
            ModLoader.addRecipe(new ItemStack(iceObsidianMattock), new Object[] 
                    { recipe, '#', Block.obsidian, '|', mod_InfiBase.iceRod });
            ModLoader.addRecipe(new ItemStack(lavaObsidianMattock), new Object[] 
                    { recipe, '#', Block.obsidian, '|', mod_InfiBase.lavaRod });
            ModLoader.addRecipe(new ItemStack(cactusObsidianMattock), new Object[] 
                    { recipe, '#', Block.obsidian, '|', mod_InfiBase.cactusRod });
        }
        
        if(PropsHelperInfiHybrids.enableSandstoneTools)
        {
            ModLoader.addRecipe(new ItemStack(woodSandstoneMattock), new Object[] 
                    { recipe, '#', Block.sandStone, '|', Item.stick });
            ModLoader.addRecipe(new ItemStack(sandstoneSandstoneMattock), new Object[] 
                    { recipe, '#', Block.sandStone, '|', mod_InfiBase.sandstoneRod });
            ModLoader.addRecipe(new ItemStack(boneSandstoneMattock), new Object[] 
                    { recipe, '#', Block.sandStone, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneSandstoneMattock), new Object[] 
                    { recipe, '#', Block.sandStone, '|', mod_InfiBase.boneRod });      
            ModLoader.addRecipe(new ItemStack(netherrackSandstoneMattock), new Object[] 
                    { recipe, '#', Block.sandStone, '|', mod_InfiBase.netherrackRod });
            ModLoader.addRecipe(new ItemStack(iceSandstoneMattock), new Object[] 
                    { recipe, '#', Block.sandStone, '|', mod_InfiBase.iceRod });
            ModLoader.addRecipe(new ItemStack(slimeSandstoneMattock), new Object[] 
                    { recipe, '#', Block.sandStone, '|', mod_InfiBase.slimeRod });
            ModLoader.addRecipe(new ItemStack(cactusSandstoneMattock), new Object[] 
                    { recipe, '#', Block.sandStone, '|', mod_InfiBase.cactusRod });
            ModLoader.addRecipe(new ItemStack(flintSandstoneMattock), new Object[] 
                    { recipe, '#', Block.sandStone, '|', mod_InfiBase.flintRod });
        }
        
        if(PropsHelperInfiHybrids.enableBoneTools)
        {
            ModLoader.addRecipe(new ItemStack(woodBoneMattock), new Object[] 
                    { recipe, '#', Item.bone, '|', Item.stick });
            ModLoader.addRecipe(new ItemStack(stoneBoneMattock), new Object[] 
                    { recipe, '#', Item.bone, '|', mod_InfiBase.stoneRod });
            ModLoader.addRecipe(new ItemStack(sandstoneBoneMattock), new Object[] 
                    { recipe, '#', Item.bone, '|', mod_InfiBase.sandstoneRod });
            ModLoader.addRecipe(new ItemStack(boneBoneMattock), new Object[] 
                    { recipe, '#', Item.bone, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneBoneMattock), new Object[] 
                    { recipe, '#', Item.bone, '|', mod_InfiBase.boneRod });
            ModLoader.addRecipe(new ItemStack(paperBoneMattock), new Object[] 
                    { recipe, '#', Item.bone, '|', mod_InfiBase.paperRod });
            ModLoader.addRecipe(new ItemStack(netherrackBoneMattock), new Object[] 
                    { recipe, '#', Item.bone, '|', mod_InfiBase.netherrackRod });
            ModLoader.addRecipe(new ItemStack(iceBoneMattock), new Object[] 
                    { recipe, '#', Item.bone, '|', mod_InfiBase.iceRod });
            ModLoader.addRecipe(new ItemStack(cactusBoneMattock), new Object[] 
                    { recipe, '#', Item.bone, '|', mod_InfiBase.cactusRod });
            ModLoader.addRecipe(new ItemStack(flintBoneMattock), new Object[] 
                    { recipe, '#', Item.bone, '|', mod_InfiBase.flintRod });
        }
        
        if(PropsHelperInfiHybrids.enablePaperTools)
        {
            ModLoader.addRecipe(new ItemStack(woodPaperMattock), new Object[] 
                    { recipe, '#', mod_InfiBase.paperStack, '|', Item.stick });
            ModLoader.addRecipe(new ItemStack(bonePaperMattock), new Object[] 
                    { recipe, '#', mod_InfiBase.paperStack, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(bonePaperMattock), new Object[] 
                    { recipe, '#', mod_InfiBase.paperStack, '|', mod_InfiBase.boneRod });
            ModLoader.addRecipe(new ItemStack(paperPaperMattock), new Object[] 
                    { recipe, '#', mod_InfiBase.paperStack, '|', mod_InfiBase.paperRod });
            ModLoader.addRecipe(new ItemStack(slimePaperMattock), new Object[] 
                    { recipe, '#', mod_InfiBase.paperStack, '|', mod_InfiBase.slimeRod });
            ModLoader.addRecipe(new ItemStack(cactusPaperMattock), new Object[] 
                    { recipe, '#', mod_InfiBase.paperStack, '|', mod_InfiBase.cactusRod });
        }
        
        if(PropsHelperInfiHybrids.enableMossyTools)
        {
        	ModLoader.addRecipe(new ItemStack(woodMossyMattock), new Object[] 
                    { recipe, '#', mod_InfiBase.mossyStone, '|', Item.stick });
        	ModLoader.addRecipe(new ItemStack(stoneMossyMattock), new Object[] 
                    { recipe, '#', mod_InfiBase.mossyStone, '|', mod_InfiBase.stoneRod });
            ModLoader.addRecipe(new ItemStack(diamondMossyMattock), new Object[] 
                    { recipe, '#', mod_InfiBase.mossyStone, '|', mod_InfiBase.diamondRod });
            ModLoader.addRecipe(new ItemStack(redstoneMossyMattock), new Object[] 
                    { recipe, '#', mod_InfiBase.mossyStone, '|', mod_InfiBase.redstoneRod });
            ModLoader.addRecipe(new ItemStack(boneMossyMattock), new Object[] 
                    { recipe, '#', mod_InfiBase.mossyStone, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneMossyMattock), new Object[] 
                    { recipe, '#', mod_InfiBase.mossyStone, '|', mod_InfiBase.boneRod });
            ModLoader.addRecipe(new ItemStack(mossyMossyMattock), new Object[] 
                    { recipe, '#', mod_InfiBase.mossyStone, '|', mod_InfiBase.mossyRod });
            ModLoader.addRecipe(new ItemStack(netherrackMossyMattock), new Object[] 
                    { recipe, '#', mod_InfiBase.mossyStone, '|', mod_InfiBase.netherrackRod });
            ModLoader.addRecipe(new ItemStack(glowstoneMossyMattock), new Object[] 
                    { recipe, '#', mod_InfiBase.mossyStone, '|', mod_InfiBase.glowstoneRod });
            ModLoader.addRecipe(new ItemStack(cactusMossyMattock), new Object[] 
                    { recipe, '#', mod_InfiBase.mossyStone, '|', mod_InfiBase.cactusRod });
            ModLoader.addRecipe(new ItemStack(blazeMossyMattock), new Object[] 
                    { recipe, '#', mod_InfiBase.mossyStone, '|', Item.blazeRod });
            ModLoader.addRecipe(new ItemStack(manyullynMossyMattock), new Object[] 
                    { recipe, '#', mod_InfiBase.mossyStone, '|', mod_InfiBase.manyullynRod });
            ModLoader.addRecipe(new ItemStack(uraniumMossyMattock), new Object[] 
                    { recipe, '#', mod_InfiBase.mossyStone, '|', mod_InfiBase.uraniumRod });
        }
        
        if(PropsHelperInfiHybrids.enableNetherrackTools)
        {
        	ModLoader.addRecipe(new ItemStack(woodNetherrackMattock), new Object[] 
                    { recipe, '#', Block.netherrack, '|', Item.stick });
        	ModLoader.addRecipe(new ItemStack(stoneNetherrackMattock), new Object[] 
                    { recipe, '#', Block.netherrack, '|', mod_InfiBase.stoneRod });
            ModLoader.addRecipe(new ItemStack(sandstoneNetherrackMattock), new Object[] 
                    { recipe, '#', Block.netherrack, '|', mod_InfiBase.sandstoneRod });
            ModLoader.addRecipe(new ItemStack(boneNetherrackMattock), new Object[] 
                    { recipe, '#', Block.netherrack, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneNetherrackMattock), new Object[] 
                    { recipe, '#', Block.netherrack, '|', mod_InfiBase.boneRod });
            ModLoader.addRecipe(new ItemStack(paperNetherrackMattock), new Object[] 
                    { recipe, '#', Block.netherrack, '|', mod_InfiBase.paperRod });
            ModLoader.addRecipe(new ItemStack(mossyNetherrackMattock), new Object[] 
                    { recipe, '#', Block.netherrack, '|', mod_InfiBase.mossyRod });
            ModLoader.addRecipe(new ItemStack(netherrackNetherrackMattock), new Object[] 
                    { recipe, '#', Block.netherrack, '|', mod_InfiBase.netherrackRod });
            ModLoader.addRecipe(new ItemStack(iceNetherrackMattock), new Object[] 
                    { recipe, '#', Block.netherrack, '|', mod_InfiBase.iceRod });
            ModLoader.addRecipe(new ItemStack(slimeNetherrackMattock), new Object[] 
                    { recipe, '#', Block.netherrack, '|', mod_InfiBase.slimeRod });
            ModLoader.addRecipe(new ItemStack(cactusNetherrackMattock), new Object[] 
                    { recipe, '#', Block.netherrack, '|', mod_InfiBase.cactusRod });
            ModLoader.addRecipe(new ItemStack(flintNetherrackMattock), new Object[] 
                    { recipe, '#', Block.netherrack, '|', mod_InfiBase.flintRod });
            ModLoader.addRecipe(new ItemStack(copperNetherrackMattock), new Object[] 
                    { recipe, '#', Block.netherrack, '|', mod_InfiBase.copperRod });
            ModLoader.addRecipe(new ItemStack(bronzeNetherrackMattock), new Object[] 
                    { recipe, '#', Block.netherrack, '|', mod_InfiBase.bronzeRod });
        }
        
        if(PropsHelperInfiHybrids.enableGlowstoneTools)
        {
        	ModLoader.addRecipe(new ItemStack(woodGlowstoneMattock), new Object[] 
                    { recipe, '#', mod_InfiBase.glowstoneCrystal, '|', Item.stick });
        	ModLoader.addRecipe(new ItemStack(redstoneGlowstoneMattock), new Object[] 
                    { recipe, '#', mod_InfiBase.glowstoneCrystal, '|', mod_InfiBase.glowstoneRod });
        	ModLoader.addRecipe(new ItemStack(obsidianGlowstoneMattock), new Object[] 
                    { recipe, '#', mod_InfiBase.glowstoneCrystal, '|', mod_InfiBase.obsidianRod });
            ModLoader.addRecipe(new ItemStack(boneGlowstoneMattock), new Object[] 
                    { recipe, '#', mod_InfiBase.glowstoneCrystal, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneGlowstoneMattock), new Object[] 
                    { recipe, '#', mod_InfiBase.glowstoneCrystal, '|', mod_InfiBase.boneRod });
            ModLoader.addRecipe(new ItemStack(netherrackGlowstoneMattock), new Object[] 
                    { recipe, '#', mod_InfiBase.glowstoneCrystal, '|', mod_InfiBase.netherrackRod });
            ModLoader.addRecipe(new ItemStack(iceGlowstoneMattock), new Object[] 
                    { recipe, '#', mod_InfiBase.glowstoneCrystal, '|', mod_InfiBase.iceRod });
            ModLoader.addRecipe(new ItemStack(slimeGlowstoneMattock), new Object[] 
                    { recipe, '#', mod_InfiBase.glowstoneCrystal, '|', mod_InfiBase.slimeRod });
            ModLoader.addRecipe(new ItemStack(cactusGlowstoneMattock), new Object[] 
                    { recipe, '#', mod_InfiBase.glowstoneCrystal, '|', mod_InfiBase.cactusRod });
        }
        
        if(PropsHelperInfiHybrids.enableIceTools)
        {
            ModLoader.addRecipe(new ItemStack(woodIceMattock), new Object[] 
                    { recipe, '#', Block.ice, '|', Item.stick });
            ModLoader.addRecipe(new ItemStack(boneIceMattock), new Object[] 
                    { recipe, '#', Block.ice, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneIceMattock), new Object[] 
                    { recipe, '#', Block.ice, '|', mod_InfiBase.boneRod });
            ModLoader.addRecipe(new ItemStack(paperIceMattock), new Object[] 
                    { recipe, '#', Block.ice, '|', mod_InfiBase.paperRod });
            ModLoader.addRecipe(new ItemStack(iceIceMattock), new Object[] 
                    { recipe, '#', Block.ice, '|', mod_InfiBase.iceRod });
            ModLoader.addRecipe(new ItemStack(slimeIceMattock), new Object[] 
                    { recipe, '#', Block.ice, '|', mod_InfiBase.slimeRod });
            ModLoader.addRecipe(new ItemStack(cactusIceMattock), new Object[] 
                    { recipe, '#', Block.ice, '|', mod_InfiBase.cactusRod });
        }
        
        if(PropsHelperInfiHybrids.enableLavaTools)
        {
            ModLoader.addRecipe(new ItemStack(diamondLavaMattock), new Object[] 
                    { recipe, '#', mod_InfiBase.lavaCrystal, '|', mod_InfiBase.diamondRod });
            ModLoader.addRecipe(new ItemStack(obsidianLavaMattock), new Object[] 
                    { recipe, '#', mod_InfiBase.lavaCrystal, '|', mod_InfiBase.obsidianRod });
            ModLoader.addRecipe(new ItemStack(netherrackLavaMattock), new Object[] 
                    { recipe, '#', mod_InfiBase.lavaCrystal, '|', mod_InfiBase.netherrackRod });
            ModLoader.addRecipe(new ItemStack(lavaLavaMattock), new Object[] 
                    { recipe, '#', mod_InfiBase.lavaCrystal, '|', mod_InfiBase.lavaRod });
            ModLoader.addRecipe(new ItemStack(flintLavaMattock), new Object[] 
                    { recipe, '#', mod_InfiBase.lavaCrystal, '|', mod_InfiBase.flintRod });
            ModLoader.addRecipe(new ItemStack(blazeLavaMattock), new Object[] 
                    { recipe, '#', mod_InfiBase.lavaCrystal, '|', Item.blazeRod });
            ModLoader.addRecipe(new ItemStack(manyullynLavaMattock), new Object[] 
                    { recipe, '#', mod_InfiBase.lavaCrystal, '|', mod_InfiBase.manyullynRod });
            ModLoader.addRecipe(new ItemStack(uraniumLavaMattock), new Object[] 
                    { recipe, '#', mod_InfiBase.lavaCrystal, '|', mod_InfiBase.uraniumRod });
        }
        
        if(PropsHelperInfiHybrids.enableSlimeTools)
        {
            ModLoader.addRecipe(new ItemStack(woodSlimeMattock), new Object[] 
                    { recipe, '#', mod_InfiBase.slimeCrystal, '|', Item.stick });
            ModLoader.addRecipe(new ItemStack(sandstoneSlimeMattock), new Object[] 
                    { recipe, '#', mod_InfiBase.slimeCrystal, '|', mod_InfiBase.sandstoneRod });
            ModLoader.addRecipe(new ItemStack(boneSlimeMattock), new Object[] 
                    { recipe, '#', mod_InfiBase.slimeCrystal, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneSlimeMattock), new Object[] 
                    { recipe, '#', mod_InfiBase.slimeCrystal, '|', mod_InfiBase.boneRod });
            ModLoader.addRecipe(new ItemStack(paperSlimeMattock), new Object[] 
                    { recipe, '#', mod_InfiBase.slimeCrystal, '|', mod_InfiBase.paperRod });
            ModLoader.addRecipe(new ItemStack(slimeSlimeMattock), new Object[] 
                    { recipe, '#', mod_InfiBase.slimeCrystal, '|', mod_InfiBase.slimeRod });
            ModLoader.addRecipe(new ItemStack(cactusSlimeMattock), new Object[] 
                    { recipe, '#', mod_InfiBase.slimeCrystal, '|', mod_InfiBase.cactusRod });
        }
        
        if(PropsHelperInfiHybrids.enableCactusTools)
        {
            ModLoader.addRecipe(new ItemStack(woodCactusMattock), new Object[] 
                    { recipe, '#', Block.cactus, '|', Item.stick });
            ModLoader.addRecipe(new ItemStack(sandstoneCactusMattock), new Object[] 
                    { recipe, '#', Block.cactus, '|', mod_InfiBase.sandstoneRod });
            ModLoader.addRecipe(new ItemStack(boneCactusMattock), new Object[] 
                    { recipe, '#', Block.cactus, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneCactusMattock), new Object[] 
                    { recipe, '#', Block.cactus, '|', mod_InfiBase.boneRod });
            ModLoader.addRecipe(new ItemStack(netherrackCactusMattock), new Object[] 
                    { recipe, '#', Block.cactus, '|', mod_InfiBase.netherrackRod });
            ModLoader.addRecipe(new ItemStack(iceCactusMattock), new Object[] 
                    { recipe, '#', Block.cactus, '|', mod_InfiBase.iceRod });
            ModLoader.addRecipe(new ItemStack(slimeCactusMattock), new Object[] 
                    { recipe, '#', Block.cactus, '|', mod_InfiBase.slimeRod });
            ModLoader.addRecipe(new ItemStack(cactusCactusMattock), new Object[] 
                    { recipe, '#', Block.cactus, '|', mod_InfiBase.cactusRod });
        }
        
        if(PropsHelperInfiHybrids.enableFlintTools)
        {
        	ModLoader.addRecipe(new ItemStack(woodFlintMattock), new Object[] 
                    { recipe, '#', Item.flint, '|', Item.stick });
        	ModLoader.addRecipe(new ItemStack(stoneFlintMattock), new Object[] 
                    { recipe, '#', Item.flint, '|', mod_InfiBase.stoneRod });
            ModLoader.addRecipe(new ItemStack(sandstoneFlintMattock), new Object[] 
                    { recipe, '#', Item.flint, '|', mod_InfiBase.sandstoneRod });
            ModLoader.addRecipe(new ItemStack(boneFlintMattock), new Object[] 
                    { recipe, '#', Item.flint, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneFlintMattock), new Object[] 
                    { recipe, '#', Item.flint, '|', mod_InfiBase.boneRod });
            ModLoader.addRecipe(new ItemStack(netherrackFlintMattock), new Object[] 
                    { recipe, '#', Item.flint, '|', mod_InfiBase.netherrackRod });
            ModLoader.addRecipe(new ItemStack(slimeFlintMattock), new Object[] 
                    { recipe, '#', Item.flint, '|', mod_InfiBase.slimeRod });
            ModLoader.addRecipe(new ItemStack(cactusFlintMattock), new Object[] 
                    { recipe, '#', Item.flint, '|', mod_InfiBase.cactusRod });
            ModLoader.addRecipe(new ItemStack(flintFlintMattock), new Object[] 
                    { recipe, '#', Item.flint, '|', mod_InfiBase.flintRod });
            ModLoader.addRecipe(new ItemStack(copperFlintMattock), new Object[] 
                    { recipe, '#', Block.netherrack, '|', mod_InfiBase.copperRod });
            ModLoader.addRecipe(new ItemStack(bronzeFlintMattock), new Object[] 
                    { recipe, '#', Block.netherrack, '|', mod_InfiBase.bronzeRod });
        }
        
        if(PropsHelperInfiHybrids.enableBlazeTools)
        {
            ModLoader.addRecipe(new ItemStack(diamondBlazeMattock), new Object[] 
                    { recipe, '#', mod_InfiBase.blazeCrystal, '|', mod_InfiBase.diamondRod });
            ModLoader.addRecipe(new ItemStack(obsidianBlazeMattock), new Object[] 
                    { recipe, '#', mod_InfiBase.blazeCrystal, '|', mod_InfiBase.obsidianRod });
            ModLoader.addRecipe(new ItemStack(netherrackBlazeMattock), new Object[] 
                    { recipe, '#', mod_InfiBase.blazeCrystal, '|', mod_InfiBase.netherrackRod });
            ModLoader.addRecipe(new ItemStack(lavaBlazeMattock), new Object[] 
                    { recipe, '#', mod_InfiBase.blazeCrystal, '|', mod_InfiBase.lavaRod });
            ModLoader.addRecipe(new ItemStack(flintBlazeMattock), new Object[] 
                    { recipe, '#', mod_InfiBase.blazeCrystal, '|', mod_InfiBase.flintRod });
            ModLoader.addRecipe(new ItemStack(blazeBlazeMattock), new Object[] 
                    { recipe, '#', mod_InfiBase.blazeCrystal, '|', Item.blazeRod });
            ModLoader.addRecipe(new ItemStack(manyullynBlazeMattock), new Object[] 
                    { recipe, '#', mod_InfiBase.blazeCrystal, '|', mod_InfiBase.manyullynRod });
            ModLoader.addRecipe(new ItemStack(uraniumBlazeMattock), new Object[] 
                    { recipe, '#', mod_InfiBase.blazeCrystal, '|', mod_InfiBase.uraniumRod });
        }
    }
    
    public static void addStoneTools(ItemStack stack)
    {
    	ModLoader.addRecipe(new ItemStack(woodStoneMattock), new Object[] 
                { recipe, '#', stack, '|', Item.stick });
    	ModLoader.addRecipe(new ItemStack(stoneStoneMattock), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.stoneRod });
        ModLoader.addRecipe(new ItemStack(sandstoneStoneMattock), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.sandstoneRod });
        ModLoader.addRecipe(new ItemStack(boneStoneMattock), new Object[] 
                { recipe, '#', stack, '|', Item.bone });
        ModLoader.addRecipe(new ItemStack(boneStoneMattock), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.boneRod });
        ModLoader.addRecipe(new ItemStack(netherrackStoneMattock), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.netherrackRod });
        ModLoader.addRecipe(new ItemStack(iceStoneMattock), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.iceRod });
        ModLoader.addRecipe(new ItemStack(slimeStoneMattock), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.slimeRod });
        ModLoader.addRecipe(new ItemStack(cactusStoneMattock), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.cactusRod });
        ModLoader.addRecipe(new ItemStack(flintStoneMattock), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.flintRod });
    }
    
    public static void addCopperTools(ItemStack stack)
    {
    	ModLoader.addRecipe(new ItemStack(woodCopperMattock), new Object[] 
                { recipe, '#', stack, '|', Item.stick });
        ModLoader.addRecipe(new ItemStack(stoneCopperMattock), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.stoneRod });
        ModLoader.addRecipe(new ItemStack(boneCopperMattock), new Object[] 
                { recipe, '#', stack, '|', Item.bone });
        ModLoader.addRecipe(new ItemStack(boneCopperMattock), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.boneRod });
        ModLoader.addRecipe(new ItemStack(netherrackCopperMattock), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.netherrackRod });
        ModLoader.addRecipe(new ItemStack(slimeCopperMattock), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.slimeRod });
        ModLoader.addRecipe(new ItemStack(cactusCopperMattock), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.cactusRod });
        ModLoader.addRecipe(new ItemStack(flintCopperMattock), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.flintRod });
        ModLoader.addRecipe(new ItemStack(copperCopperMattock), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.copperRod });
    }
    
    public static void addBronzeTools(ItemStack stack)
    {
    	ModLoader.addRecipe(new ItemStack(woodBronzeMattock), new Object[] 
                { recipe, '#', stack, '|', Item.stick });
        ModLoader.addRecipe(new ItemStack(stoneBronzeMattock), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.stoneRod });
        ModLoader.addRecipe(new ItemStack(boneBronzeMattock), new Object[] 
                { recipe, '#', stack, '|', Item.bone });
        ModLoader.addRecipe(new ItemStack(boneBronzeMattock), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.boneRod });
        ModLoader.addRecipe(new ItemStack(netherrackBronzeMattock), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.netherrackRod });
        ModLoader.addRecipe(new ItemStack(slimeBronzeMattock), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.slimeRod });
        ModLoader.addRecipe(new ItemStack(cactusBronzeMattock), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.cactusRod });
        ModLoader.addRecipe(new ItemStack(flintBronzeMattock), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.flintRod });
        ModLoader.addRecipe(new ItemStack(copperBronzeMattock), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.copperRod });
        ModLoader.addRecipe(new ItemStack(bronzeBronzeMattock), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.bronzeRod });
    }
    
    public static void addWorkedIronTools(ItemStack stack)
    {
    	ModLoader.addRecipe(new ItemStack(woodWorkedIronMattock), new Object[] 
                { recipe, '#', stack, '|', Item.stick });
        ModLoader.addRecipe(new ItemStack(stoneWorkedIronMattock), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.stoneRod });
        ModLoader.addRecipe(new ItemStack(ironWorkedIronMattock), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.ironRod });
        ModLoader.addRecipe(new ItemStack(diamondWorkedIronMattock), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.diamondRod });
        ModLoader.addRecipe(new ItemStack(redstoneWorkedIronMattock), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.redstoneRod });
        ModLoader.addRecipe(new ItemStack(obsidianWorkedIronMattock), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.obsidianRod });
        ModLoader.addRecipe(new ItemStack(boneWorkedIronMattock), new Object[] 
                { recipe, '#', stack, '|', Item.bone });
        ModLoader.addRecipe(new ItemStack(boneWorkedIronMattock), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.boneRod });
        ModLoader.addRecipe(new ItemStack(netherrackWorkedIronMattock), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.netherrackRod });
        ModLoader.addRecipe(new ItemStack(glowstoneWorkedIronMattock), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.glowstoneRod });
        ModLoader.addRecipe(new ItemStack(iceWorkedIronMattock), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.iceRod });
        ModLoader.addRecipe(new ItemStack(slimeWorkedIronMattock), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.slimeRod });
        ModLoader.addRecipe(new ItemStack(cactusWorkedIronMattock), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.cactusRod });
        ModLoader.addRecipe(new ItemStack(blazeWorkedIronMattock), new Object[] 
                { recipe, '#', stack, '|', Item.blazeRod });
        ModLoader.addRecipe(new ItemStack(copperWorkedIronMattock), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.copperRod });
        ModLoader.addRecipe(new ItemStack(bronzeWorkedIronMattock), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.bronzeRod });
        ModLoader.addRecipe(new ItemStack(workedWorkedIronMattock), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.workedIronRod });
        ModLoader.addRecipe(new ItemStack(steelWorkedIronMattock), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.steelRod });
        ModLoader.addRecipe(new ItemStack(uraniumWorkedIronMattock), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.uraniumRod });
    }
    
    public static void addSteelTools(ItemStack stack)
    {
    	ModLoader.addRecipe(new ItemStack(woodSteelMattock), new Object[] 
                { recipe, '#', stack, '|', Item.stick });
        ModLoader.addRecipe(new ItemStack(stoneSteelMattock), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.stoneRod });
        ModLoader.addRecipe(new ItemStack(ironSteelMattock), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.ironRod });
        ModLoader.addRecipe(new ItemStack(diamondSteelMattock), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.diamondRod });
        ModLoader.addRecipe(new ItemStack(redstoneSteelMattock), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.redstoneRod });
        ModLoader.addRecipe(new ItemStack(obsidianSteelMattock), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.obsidianRod });
        ModLoader.addRecipe(new ItemStack(boneSteelMattock), new Object[] 
                { recipe, '#', stack, '|', Item.bone });
        ModLoader.addRecipe(new ItemStack(boneSteelMattock), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.boneRod });
        ModLoader.addRecipe(new ItemStack(netherrackSteelMattock), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.netherrackRod });
        ModLoader.addRecipe(new ItemStack(glowstoneSteelMattock), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.glowstoneRod });
        ModLoader.addRecipe(new ItemStack(iceSteelMattock), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.iceRod });
        ModLoader.addRecipe(new ItemStack(slimeSteelMattock), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.slimeRod });
        ModLoader.addRecipe(new ItemStack(cactusSteelMattock), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.cactusRod });
        ModLoader.addRecipe(new ItemStack(blazeSteelMattock), new Object[] 
                { recipe, '#', stack, '|', Item.blazeRod });
        ModLoader.addRecipe(new ItemStack(copperSteelMattock), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.copperRod });
        ModLoader.addRecipe(new ItemStack(bronzeSteelMattock), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.bronzeRod });
        ModLoader.addRecipe(new ItemStack(workedSteelMattock), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.workedIronRod });
        ModLoader.addRecipe(new ItemStack(steelSteelMattock), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.steelRod });
        ModLoader.addRecipe(new ItemStack(cobaltSteelMattock), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.cobaltRod });
        ModLoader.addRecipe(new ItemStack(arditeSteelMattock), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.arditeRod });
        ModLoader.addRecipe(new ItemStack(uraniumSteelMattock), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.uraniumRod });
    }
    
    public static void addCobaltTools(ItemStack stack)
    {
    	ModLoader.addRecipe(new ItemStack(woodCobaltMattock), new Object[] 
                { recipe, '#', stack, '|', Item.stick });
        ModLoader.addRecipe(new ItemStack(stoneCobaltMattock), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.stoneRod });
        ModLoader.addRecipe(new ItemStack(ironCobaltMattock), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.ironRod });
        ModLoader.addRecipe(new ItemStack(diamondCobaltMattock), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.diamondRod });
        ModLoader.addRecipe(new ItemStack(redstoneCobaltMattock), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.redstoneRod });
        ModLoader.addRecipe(new ItemStack(obsidianCobaltMattock), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.obsidianRod });
        ModLoader.addRecipe(new ItemStack(boneCobaltMattock), new Object[] 
                { recipe, '#', stack, '|', Item.bone });
        ModLoader.addRecipe(new ItemStack(boneCobaltMattock), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.boneRod });
        ModLoader.addRecipe(new ItemStack(slimeCobaltMattock), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.slimeRod });
        ModLoader.addRecipe(new ItemStack(cactusCobaltMattock), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.cactusRod });
        ModLoader.addRecipe(new ItemStack(blazeCobaltMattock), new Object[] 
                { recipe, '#', stack, '|', Item.blazeRod });
        ModLoader.addRecipe(new ItemStack(copperCobaltMattock), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.copperRod });
        ModLoader.addRecipe(new ItemStack(bronzeCobaltMattock), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.bronzeRod });
        ModLoader.addRecipe(new ItemStack(workedCobaltMattock), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.workedIronRod });
        ModLoader.addRecipe(new ItemStack(steelCobaltMattock), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.steelRod });
        ModLoader.addRecipe(new ItemStack(cobaltCobaltMattock), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.cobaltRod });
        ModLoader.addRecipe(new ItemStack(arditeCobaltMattock), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.arditeRod });
        ModLoader.addRecipe(new ItemStack(manyullynCobaltMattock), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.manyullynRod });
        ModLoader.addRecipe(new ItemStack(uraniumCobaltMattock), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.uraniumRod });
    }
    
    public static void addArditeTools(ItemStack stack)
    {
    	ModLoader.addRecipe(new ItemStack(woodArditeMattock), new Object[] 
                { recipe, '#', stack, '|', Item.stick });
        ModLoader.addRecipe(new ItemStack(stoneArditeMattock), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.stoneRod });
        ModLoader.addRecipe(new ItemStack(ironArditeMattock), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.ironRod });
        ModLoader.addRecipe(new ItemStack(diamondArditeMattock), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.diamondRod });
        ModLoader.addRecipe(new ItemStack(redstoneArditeMattock), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.redstoneRod });
        ModLoader.addRecipe(new ItemStack(obsidianArditeMattock), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.obsidianRod });
        ModLoader.addRecipe(new ItemStack(boneArditeMattock), new Object[] 
                { recipe, '#', stack, '|', Item.bone });
        ModLoader.addRecipe(new ItemStack(boneArditeMattock), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.boneRod });
        ModLoader.addRecipe(new ItemStack(slimeArditeMattock), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.slimeRod });
        ModLoader.addRecipe(new ItemStack(cactusArditeMattock), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.cactusRod });
        ModLoader.addRecipe(new ItemStack(blazeArditeMattock), new Object[] 
                { recipe, '#', stack, '|', Item.blazeRod });
        ModLoader.addRecipe(new ItemStack(copperArditeMattock), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.copperRod });
        ModLoader.addRecipe(new ItemStack(bronzeArditeMattock), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.bronzeRod });
        ModLoader.addRecipe(new ItemStack(workedArditeMattock), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.workedIronRod });
        ModLoader.addRecipe(new ItemStack(steelArditeMattock), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.steelRod });
        ModLoader.addRecipe(new ItemStack(cobaltArditeMattock), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.cobaltRod });
        ModLoader.addRecipe(new ItemStack(arditeArditeMattock), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.arditeRod });
        ModLoader.addRecipe(new ItemStack(manyullynArditeMattock), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.manyullynRod });
        ModLoader.addRecipe(new ItemStack(uraniumArditeMattock), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.uraniumRod });
    }
    
    public static void addManyullynTools(ItemStack stack)
    {
    	ModLoader.addRecipe(new ItemStack(woodManyullynMattock), new Object[] 
                { recipe, '#', stack, '|', Item.stick });
        ModLoader.addRecipe(new ItemStack(stoneManyullynMattock), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.stoneRod });
        ModLoader.addRecipe(new ItemStack(ironManyullynMattock), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.ironRod });
        ModLoader.addRecipe(new ItemStack(diamondManyullynMattock), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.diamondRod });
        ModLoader.addRecipe(new ItemStack(redstoneManyullynMattock), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.redstoneRod });
        ModLoader.addRecipe(new ItemStack(obsidianManyullynMattock), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.obsidianRod });
        ModLoader.addRecipe(new ItemStack(boneManyullynMattock), new Object[] 
                { recipe, '#', stack, '|', Item.bone });
        ModLoader.addRecipe(new ItemStack(boneManyullynMattock), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.boneRod });
        ModLoader.addRecipe(new ItemStack(slimeManyullynMattock), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.slimeRod });
        ModLoader.addRecipe(new ItemStack(cactusManyullynMattock), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.cactusRod });
        ModLoader.addRecipe(new ItemStack(blazeManyullynMattock), new Object[] 
                { recipe, '#', stack, '|', Item.blazeRod });
        ModLoader.addRecipe(new ItemStack(copperManyullynMattock), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.copperRod });
        ModLoader.addRecipe(new ItemStack(bronzeManyullynMattock), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.bronzeRod });
        ModLoader.addRecipe(new ItemStack(workedManyullynMattock), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.workedIronRod });
        ModLoader.addRecipe(new ItemStack(steelManyullynMattock), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.steelRod });
        ModLoader.addRecipe(new ItemStack(cobaltManyullynMattock), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.cobaltRod });
        ModLoader.addRecipe(new ItemStack(arditeManyullynMattock), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.arditeRod });
        ModLoader.addRecipe(new ItemStack(manyullynManyullynMattock), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.manyullynRod });
        ModLoader.addRecipe(new ItemStack(uraniumManyullynMattock), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.uraniumRod });
    }
    
    public static void addUraniumTools(ItemStack stack)
    {
        ModLoader.addRecipe(new ItemStack(diamondUraniumMattock), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.diamondRod });
        ModLoader.addRecipe(new ItemStack(redstoneUraniumMattock), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.redstoneRod });
        ModLoader.addRecipe(new ItemStack(boneUraniumMattock), new Object[] 
                { recipe, '#', stack, '|', Item.bone });
        ModLoader.addRecipe(new ItemStack(boneUraniumMattock), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.boneRod });
        ModLoader.addRecipe(new ItemStack(netherrackUraniumMattock), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.netherrackRod });
        ModLoader.addRecipe(new ItemStack(glowstoneUraniumMattock), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.glowstoneRod });
        ModLoader.addRecipe(new ItemStack(lavaUraniumMattock), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.lavaRod });
        ModLoader.addRecipe(new ItemStack(blazeUraniumMattock), new Object[] 
                { recipe, '#', stack, '|', Item.blazeRod });
        ModLoader.addRecipe(new ItemStack(cobaltUraniumMattock), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.cobaltRod });
        ModLoader.addRecipe(new ItemStack(arditeUraniumMattock), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.arditeRod });
        ModLoader.addRecipe(new ItemStack(uraniumUraniumMattock), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.uraniumRod });
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
