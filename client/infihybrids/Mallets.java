package net.minecraft.src.infihybrids;
import net.minecraft.src.Block;
import net.minecraft.src.InfiMaterialEnum;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;
import net.minecraft.src.ModLoader;
import net.minecraft.src.mod_InfiBase;
import net.minecraft.src.mod_InfiHybrids;
import net.minecraft.src.forge.MinecraftForge;

public class Mallets 
{
    public static Mallets instance = new Mallets();
    
    private static String[] recipe = { "##", "##", " |" };
    
    public static Mallets getInstance()
    {
        return instance;
    }

    public static void init()
    {
        if(mod_InfiHybrids.infitoolsPresent)
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
    	woodWoodMallet = new InfiToolMallet(PropsHelperInfiHybrids.woodMalletID+0, 
                InfiMaterialEnum.Wood, InfiMaterialEnum.Wood, "woodWoodMallet");
    	woodStoneMallet = new InfiToolMallet(PropsHelperInfiHybrids.stoneMalletID+0, 
                InfiMaterialEnum.Stone, InfiMaterialEnum.Wood, "woodStoneMallet");
    	woodIronMallet = new InfiToolMallet(PropsHelperInfiHybrids.ironMalletID+0, 
                InfiMaterialEnum.Iron, InfiMaterialEnum.Wood, "woodIronMallet");
    	woodDiamondMallet = new InfiToolMallet(PropsHelperInfiHybrids.diamondMalletID+0, 
                InfiMaterialEnum.Diamond, InfiMaterialEnum.Wood, "woodDiamondMallet");
    	
    	MinecraftForge.setToolClass(woodWoodMallet, "pickaxe", InfiMaterialEnum.Wood.getHarvestLevel());
    	MinecraftForge.setToolClass(woodStoneMallet, "pickaxe", InfiMaterialEnum.Stone.getHarvestLevel());
    	MinecraftForge.setToolClass(woodIronMallet, "pickaxe", InfiMaterialEnum.Iron.getHarvestLevel());
    	MinecraftForge.setToolClass(woodDiamondMallet, "pickaxe", InfiMaterialEnum.Diamond.getHarvestLevel());
    	
    	ModLoader.addName(woodWoodMallet, "Wooden Mallet");
    }
    
    private static void registerVanillaRecipes()
    {
    	ModLoader.addRecipe(new ItemStack(woodWoodMallet), new Object[] 
                { recipe, '#', Block.planks, '|', Item.stick, });
		ModLoader.addRecipe(new ItemStack(woodStoneMallet), new Object[] 
                { recipe, '#', Block.cobblestone, '|', Item.stick, });
		ModLoader.addRecipe(new ItemStack(woodIronMallet), new Object[] 
                { recipe, '#', Item.ingotIron, '|', Item.stick, });
		ModLoader.addRecipe(new ItemStack(woodDiamondMallet), new Object[] 
                { recipe, '#', Item.diamond, '|', Item.stick, });
    }
    
    private static void createTools()
    {
    	if(PropsHelperInfiHybrids.enableWoodTools)
    	{
    		woodWoodMallet = new InfiToolMallet(PropsHelperInfiHybrids.woodMalletID+0, 
                    InfiMaterialEnum.Wood, InfiMaterialEnum.Wood, "woodWoodMallet");
    		sandstoneWoodMallet = new InfiToolMallet(PropsHelperInfiHybrids.woodMalletID+1, 
                    InfiMaterialEnum.Wood, InfiMaterialEnum.Sandstone, "sandstoneWoodMallet");
    		boneWoodMallet = new InfiToolMallet(PropsHelperInfiHybrids.woodMalletID+2, 
                    InfiMaterialEnum.Wood, InfiMaterialEnum.Bone, "boneWoodMallet");
    		paperWoodMallet = new InfiToolMallet(PropsHelperInfiHybrids.woodMalletID+3, 
                    InfiMaterialEnum.Wood, InfiMaterialEnum.Paper, "paperWoodMallet");
    		iceWoodMallet = new InfiToolMallet(PropsHelperInfiHybrids.woodMalletID+4, 
                    InfiMaterialEnum.Wood, InfiMaterialEnum.Ice, "iceWoodMallet");
    		slimeWoodMallet = new InfiToolMallet(PropsHelperInfiHybrids.woodMalletID+5, 
                    InfiMaterialEnum.Wood, InfiMaterialEnum.Slime, "slimeWoodMallet");
    		cactusWoodMallet = new InfiToolMallet(PropsHelperInfiHybrids.woodMalletID+6, 
                    InfiMaterialEnum.Wood, InfiMaterialEnum.Cactus, "cactusWoodMallet");
    		
    		MinecraftForge.setToolClass(woodWoodMallet, "pickaxe", InfiMaterialEnum.Wood.getHarvestLevel());
    		MinecraftForge.setToolClass(sandstoneWoodMallet, "pickaxe", InfiMaterialEnum.Wood.getHarvestLevel());
    		MinecraftForge.setToolClass(boneWoodMallet, "pickaxe", InfiMaterialEnum.Wood.getHarvestLevel());
    		MinecraftForge.setToolClass(paperWoodMallet, "pickaxe", InfiMaterialEnum.Wood.getHarvestLevel());
    		MinecraftForge.setToolClass(iceWoodMallet, "pickaxe", InfiMaterialEnum.Wood.getHarvestLevel());
    		MinecraftForge.setToolClass(slimeWoodMallet, "pickaxe", InfiMaterialEnum.Wood.getHarvestLevel());
    		MinecraftForge.setToolClass(cactusWoodMallet, "pickaxe", InfiMaterialEnum.Wood.getHarvestLevel());
    	}

        if(PropsHelperInfiHybrids.enableStoneTools)
        {
        	woodStoneMallet = new InfiToolMallet(PropsHelperInfiHybrids.stoneMalletID+0, 
                    InfiMaterialEnum.Stone, InfiMaterialEnum.Wood, "woodStoneMallet");
        	stoneStoneMallet = new InfiToolMallet(PropsHelperInfiHybrids.stoneMalletID+1, 
                    InfiMaterialEnum.Stone, InfiMaterialEnum.Stone, "stoneStoneMallet");
        	sandstoneStoneMallet = new InfiToolMallet(PropsHelperInfiHybrids.stoneMalletID+2, 
                    InfiMaterialEnum.Stone, InfiMaterialEnum.Sandstone, "sandstoneStoneMallet");
        	boneStoneMallet = new InfiToolMallet(PropsHelperInfiHybrids.stoneMalletID+3, 
                    InfiMaterialEnum.Stone, InfiMaterialEnum.Bone, "boneStoneMallet");
        	netherrackStoneMallet = new InfiToolMallet(PropsHelperInfiHybrids.stoneMalletID+4, 
                    InfiMaterialEnum.Stone, InfiMaterialEnum.Netherrack, "netherrackStoneMallet");
        	iceStoneMallet = new InfiToolMallet(PropsHelperInfiHybrids.stoneMalletID+5, 
                    InfiMaterialEnum.Stone, InfiMaterialEnum.Ice, "iceStoneMallet");
        	slimeStoneMallet = new InfiToolMallet(PropsHelperInfiHybrids.stoneMalletID+6, 
                    InfiMaterialEnum.Stone, InfiMaterialEnum.Slime, "slimeStoneMallet");
        	cactusStoneMallet = new InfiToolMallet(PropsHelperInfiHybrids.stoneMalletID+7, 
                    InfiMaterialEnum.Stone, InfiMaterialEnum.Cactus, "cactusStoneMallet");
        	flintStoneMallet = new InfiToolMallet(PropsHelperInfiHybrids.stoneMalletID+8, 
                    InfiMaterialEnum.Stone, InfiMaterialEnum.Flint, "flintStoneMallet");
            
            MinecraftForge.setToolClass(woodStoneMallet, "pickaxe", InfiMaterialEnum.Stone.getHarvestLevel());
            MinecraftForge.setToolClass(stoneStoneMallet, "pickaxe", InfiMaterialEnum.Stone.getHarvestLevel());
            MinecraftForge.setToolClass(sandstoneStoneMallet, "pickaxe", InfiMaterialEnum.Stone.getHarvestLevel());
            MinecraftForge.setToolClass(boneStoneMallet, "pickaxe", InfiMaterialEnum.Stone.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackStoneMallet, "pickaxe", InfiMaterialEnum.Stone.getHarvestLevel());
            MinecraftForge.setToolClass(iceStoneMallet, "pickaxe", InfiMaterialEnum.Stone.getHarvestLevel());
            MinecraftForge.setToolClass(slimeStoneMallet, "pickaxe", InfiMaterialEnum.Stone.getHarvestLevel());
            MinecraftForge.setToolClass(cactusStoneMallet, "pickaxe", InfiMaterialEnum.Stone.getHarvestLevel());
            MinecraftForge.setToolClass(flintStoneMallet, "pickaxe", InfiMaterialEnum.Stone.getHarvestLevel());
        }
        
        if(PropsHelperInfiHybrids.enableIronTools)
        {
        	woodIronMallet = new InfiToolMallet(PropsHelperInfiHybrids.ironMalletID+0, 
                    InfiMaterialEnum.Iron, InfiMaterialEnum.Wood, "woodIronMallet");
        	stoneIronMallet = new InfiToolMallet(PropsHelperInfiHybrids.ironMalletID+1, 
                    InfiMaterialEnum.Iron, InfiMaterialEnum.Stone, "stoneIronMallet");
        	ironIronMallet = new InfiToolMallet(PropsHelperInfiHybrids.ironMalletID+2, 
                    InfiMaterialEnum.Iron, InfiMaterialEnum.Iron, "ironIronMallet");
        	boneIronMallet = new InfiToolMallet(PropsHelperInfiHybrids.ironMalletID+3, 
                    InfiMaterialEnum.Iron, InfiMaterialEnum.Bone, "boneIronMallet");
        	netherrackIronMallet = new InfiToolMallet(PropsHelperInfiHybrids.ironMalletID+4, 
                    InfiMaterialEnum.Iron, InfiMaterialEnum.Netherrack, "netherrackIronMallet");
        	glowstoneIronMallet = new InfiToolMallet(PropsHelperInfiHybrids.ironMalletID+5, 
                    InfiMaterialEnum.Iron, InfiMaterialEnum.Glowstone, "glowstoneIronMallet");
        	cactusIronMallet = new InfiToolMallet(PropsHelperInfiHybrids.ironMalletID+6, 
                    InfiMaterialEnum.Iron, InfiMaterialEnum.Cactus, "cactusIronMallet");
        	copperIronMallet = new InfiToolMallet(PropsHelperInfiHybrids.ironMalletID+7, 
                    InfiMaterialEnum.Iron, InfiMaterialEnum.Copper, "copperIronMallet");
        	bronzeIronMallet = new InfiToolMallet(PropsHelperInfiHybrids.ironMalletID+8, 
                    InfiMaterialEnum.Iron, InfiMaterialEnum.Bronze, "bronzeIronMallet");
            
            MinecraftForge.setToolClass(woodIronMallet, "pickaxe", InfiMaterialEnum.Iron.getHarvestLevel());
            MinecraftForge.setToolClass(stoneIronMallet, "pickaxe", InfiMaterialEnum.Iron.getHarvestLevel());
            MinecraftForge.setToolClass(ironIronMallet, "pickaxe", InfiMaterialEnum.Iron.getHarvestLevel());
            MinecraftForge.setToolClass(boneIronMallet, "pickaxe", InfiMaterialEnum.Iron.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackIronMallet, "pickaxe", InfiMaterialEnum.Iron.getHarvestLevel());
            MinecraftForge.setToolClass(glowstoneIronMallet, "pickaxe", InfiMaterialEnum.Iron.getHarvestLevel());
            MinecraftForge.setToolClass(cactusIronMallet, "pickaxe", InfiMaterialEnum.Iron.getHarvestLevel());
            MinecraftForge.setToolClass(copperIronMallet, "pickaxe", InfiMaterialEnum.Iron.getHarvestLevel());
            MinecraftForge.setToolClass(bronzeIronMallet, "pickaxe", InfiMaterialEnum.Iron.getHarvestLevel());
        }
        
        if(PropsHelperInfiHybrids.enableDiamondTools)
        {
        	woodDiamondMallet = new InfiToolMallet(PropsHelperInfiHybrids.diamondMalletID+0, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Wood, "woodDiamondMallet");
        	stoneDiamondMallet = new InfiToolMallet(PropsHelperInfiHybrids.diamondMalletID+1, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Stone, "stoneDiamondMallet");
        	ironDiamondMallet = new InfiToolMallet(PropsHelperInfiHybrids.diamondMalletID+2, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Iron, "ironDiamondMallet");
        	diamondDiamondMallet = new InfiToolMallet(PropsHelperInfiHybrids.diamondMalletID+3, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Diamond, "diamondDiamondMallet");
        	redstoneDiamondMallet = new InfiToolMallet(PropsHelperInfiHybrids.diamondMalletID+4, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Redstone, "redstoneDiamondMallet");
        	obsidianDiamondMallet = new InfiToolMallet(PropsHelperInfiHybrids.diamondMalletID+5, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Obsidian, "obsidianDiamondMallet");
        	boneDiamondMallet = new InfiToolMallet(PropsHelperInfiHybrids.diamondMalletID+6, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Bone, "boneDiamondMallet");
        	mossyDiamondMallet = new InfiToolMallet(PropsHelperInfiHybrids.diamondMalletID+7, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Mossy, "mossyDiamondMallet");
        	netherrackDiamondMallet = new InfiToolMallet(PropsHelperInfiHybrids.diamondMalletID+8, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Netherrack, "netherrackDiamondMallet");
        	glowstoneDiamondMallet = new InfiToolMallet(PropsHelperInfiHybrids.diamondMalletID+9, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Glowstone, "glowstoneDiamondMallet");
        	lavaDiamondMallet = new InfiToolMallet(PropsHelperInfiHybrids.diamondMalletID+10, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Lava, "lavaDiamondMallet");
        	cactusDiamondMallet = new InfiToolMallet(PropsHelperInfiHybrids.diamondMalletID+11, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Cactus, "cactusDiamondMallet");
        	flintDiamondMallet = new InfiToolMallet(PropsHelperInfiHybrids.diamondMalletID+12, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Flint, "flintDiamondMallet");
        	blazeDiamondMallet = new InfiToolMallet(PropsHelperInfiHybrids.diamondMalletID+13, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Blaze, "blazeDiamondMallet");
            copperDiamondMallet = new InfiToolMallet(PropsHelperInfiHybrids.diamondMalletID+14, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Copper, "copperDiamondMallet");
            bronzeDiamondMallet = new InfiToolMallet(PropsHelperInfiHybrids.diamondMalletID+15, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Bronze, "bronzeDiamondMallet");
            workedDiamondMallet = new InfiToolMallet(PropsHelperInfiHybrids.diamondMalletID+16, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.WorkedIron, "workedDiamondMallet");
            steelDiamondMallet = new InfiToolMallet(PropsHelperInfiHybrids.diamondMalletID+17, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Steel, "steelDiamondMallet");
            cobaltDiamondMallet = new InfiToolMallet(PropsHelperInfiHybrids.diamondMalletID+18, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Cobalt, "cobaltDiamondMallet");
            arditeDiamondMallet = new InfiToolMallet(PropsHelperInfiHybrids.diamondMalletID+19, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Ardite, "arditeDiamondMallet");
            manyullynDiamondMallet = new InfiToolMallet(PropsHelperInfiHybrids.diamondMalletID+20, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Manyullyn, "manyullynDiamondMallet");
            uraniumDiamondMallet = new InfiToolMallet(PropsHelperInfiHybrids.diamondMalletID+21, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Uranium, "uraniumDiamondMallet");
            
            MinecraftForge.setToolClass(woodDiamondMallet, "pickaxe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(stoneDiamondMallet, "pickaxe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(ironDiamondMallet, "pickaxe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(diamondDiamondMallet, "pickaxe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(redstoneDiamondMallet, "pickaxe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(obsidianDiamondMallet, "pickaxe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(boneDiamondMallet, "pickaxe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(mossyDiamondMallet, "pickaxe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackDiamondMallet, "pickaxe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(glowstoneDiamondMallet, "pickaxe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(lavaDiamondMallet, "pickaxe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(cactusDiamondMallet, "pickaxe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(flintDiamondMallet, "pickaxe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(blazeDiamondMallet, "pickaxe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(copperDiamondMallet, "pickaxe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(bronzeDiamondMallet, "pickaxe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(workedDiamondMallet, "pickaxe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(steelDiamondMallet, "pickaxe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(cobaltDiamondMallet, "pickaxe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(arditeDiamondMallet, "pickaxe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(manyullynDiamondMallet, "pickaxe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(uraniumDiamondMallet, "pickaxe", InfiMaterialEnum.Diamond.getHarvestLevel());
        }
        
        if(PropsHelperInfiHybrids.enableRedstoneTools)
        {
        	woodRedstoneMallet = new InfiToolMallet(PropsHelperInfiHybrids.redstoneMalletID+0, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Wood, "woodRedstoneMallet");
        	stoneRedstoneMallet = new InfiToolMallet(PropsHelperInfiHybrids.redstoneMalletID+1, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Stone, "stoneRedstoneMallet");
        	ironRedstoneMallet = new InfiToolMallet(PropsHelperInfiHybrids.redstoneMalletID+2, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Iron, "ironRedstoneMallet");
        	redstoneRedstoneMallet = new InfiToolMallet(PropsHelperInfiHybrids.redstoneMalletID+3, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Redstone, "redstoneRedstoneMallet");
        	obsidianRedstoneMallet = new InfiToolMallet(PropsHelperInfiHybrids.redstoneMalletID+4, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Obsidian, "obsidianRedstoneMallet");
        	sandstoneRedstoneMallet = new InfiToolMallet(PropsHelperInfiHybrids.redstoneMalletID+5, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Sandstone, "sandstoneRedstoneMallet");
        	boneRedstoneMallet = new InfiToolMallet(PropsHelperInfiHybrids.redstoneMalletID+6, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Bone, "boneRedstoneMallet");
        	paperRedstoneMallet = new InfiToolMallet(PropsHelperInfiHybrids.redstoneMalletID+7, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Paper, "paperRedstoneMallet");
        	mossyRedstoneMallet = new InfiToolMallet(PropsHelperInfiHybrids.redstoneMalletID+8, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Mossy, "mossyRedstoneMallet");
        	netherrackRedstoneMallet = new InfiToolMallet(PropsHelperInfiHybrids.redstoneMalletID+9, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Netherrack, "netherrackRedstoneMallet");
        	glowstoneRedstoneMallet = new InfiToolMallet(PropsHelperInfiHybrids.redstoneMalletID+10, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Glowstone, "glowstoneRedstoneMallet");
        	iceRedstoneMallet = new InfiToolMallet(PropsHelperInfiHybrids.redstoneMalletID+11, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Ice, "iceRedstoneMallet");
        	lavaRedstoneMallet = new InfiToolMallet(PropsHelperInfiHybrids.redstoneMalletID+12,
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Lava, "lavaRedstoneMallet");
        	slimeRedstoneMallet = new InfiToolMallet(PropsHelperInfiHybrids.redstoneMalletID+13,
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Slime, "slimeRedstoneMallet");
        	cactusRedstoneMallet = new InfiToolMallet(PropsHelperInfiHybrids.redstoneMalletID+14,
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Cactus, "cactusRedstoneMallet");
        	flintRedstoneMallet = new InfiToolMallet(PropsHelperInfiHybrids.redstoneMalletID+15,
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Flint, "flintRedstoneMallet");
        	copperRedstoneMallet = new InfiToolMallet(PropsHelperInfiHybrids.redstoneMalletID+16,
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Copper, "copperRedstoneMallet");
        	bronzeRedstoneMallet = new InfiToolMallet(PropsHelperInfiHybrids.redstoneMalletID+17,
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Bronze, "bronzeRedstoneMallet");
        	workedRedstoneMallet = new InfiToolMallet(PropsHelperInfiHybrids.redstoneMalletID+18,
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.WorkedIron, "workedRedstoneMallet");
        	uraniumRedstoneMallet = new InfiToolMallet(PropsHelperInfiHybrids.redstoneMalletID+19,
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Uranium, "uraniumRedstoneMallet");
            
            MinecraftForge.setToolClass(woodRedstoneMallet, "pickaxe", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(stoneRedstoneMallet, "pickaxe", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(ironRedstoneMallet, "pickaxe", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(redstoneRedstoneMallet, "pickaxe", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(obsidianRedstoneMallet, "pickaxe", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(sandstoneRedstoneMallet, "pickaxe", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(boneRedstoneMallet, "pickaxe", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(paperRedstoneMallet, "pickaxe", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(mossyRedstoneMallet, "pickaxe", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackRedstoneMallet, "pickaxe", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(glowstoneRedstoneMallet, "pickaxe", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(iceRedstoneMallet, "pickaxe", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(lavaRedstoneMallet, "pickaxe", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(slimeRedstoneMallet, "pickaxe", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(cactusRedstoneMallet, "pickaxe", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(flintRedstoneMallet, "pickaxe", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(copperRedstoneMallet, "pickaxe", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(bronzeRedstoneMallet, "pickaxe", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(workedRedstoneMallet, "pickaxe", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(uraniumRedstoneMallet, "pickaxe", InfiMaterialEnum.Redstone.getHarvestLevel());
        }
        
        if(PropsHelperInfiHybrids.enableObsidianTools)
        {
        	woodObsidianMallet = new InfiToolMallet(PropsHelperInfiHybrids.obsidianMalletID+0, 
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Wood, "woodObsidianMallet");
        	stoneObsidianMallet = new InfiToolMallet(PropsHelperInfiHybrids.obsidianMalletID+1, 
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Stone, "stoneObsidianMallet");
        	redstoneObsidianMallet = new InfiToolMallet(PropsHelperInfiHybrids.obsidianMalletID+2, 
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Redstone, "redstoneObsidianMallet");
        	obsidianObsidianMallet = new InfiToolMallet(PropsHelperInfiHybrids.obsidianMalletID+3, 
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Obsidian, "obsidianObsidianMallet");;
        	boneObsidianMallet = new InfiToolMallet(PropsHelperInfiHybrids.obsidianMalletID+4, 
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Bone, "boneObsidianMallet");
        	netherrackObsidianMallet = new InfiToolMallet(PropsHelperInfiHybrids.obsidianMalletID+5, 
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Netherrack, "netherrackObsidianMallet");
        	glowstoneObsidianMallet = new InfiToolMallet(PropsHelperInfiHybrids.obsidianMalletID+6, 
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Glowstone, "glowstoneObsidianMallet");
        	iceObsidianMallet = new InfiToolMallet(PropsHelperInfiHybrids.obsidianMalletID+7, 
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Ice, "iceObsidianMallet");
        	lavaObsidianMallet = new InfiToolMallet(PropsHelperInfiHybrids.obsidianMalletID+8,
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Lava, "lavaObsidianMallet");
        	cactusObsidianMallet = new InfiToolMallet(PropsHelperInfiHybrids.obsidianMalletID+9,
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Cactus, "cactusObsidianMallet");
            
            MinecraftForge.setToolClass(woodObsidianMallet, "pickaxe", InfiMaterialEnum.Obsidian.getHarvestLevel());
            MinecraftForge.setToolClass(stoneObsidianMallet, "pickaxe", InfiMaterialEnum.Obsidian.getHarvestLevel());
            MinecraftForge.setToolClass(redstoneObsidianMallet, "pickaxe", InfiMaterialEnum.Obsidian.getHarvestLevel());
            MinecraftForge.setToolClass(obsidianObsidianMallet, "pickaxe", InfiMaterialEnum.Obsidian.getHarvestLevel());
            MinecraftForge.setToolClass(boneObsidianMallet, "pickaxe", InfiMaterialEnum.Obsidian.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackObsidianMallet, "pickaxe", InfiMaterialEnum.Obsidian.getHarvestLevel());
            MinecraftForge.setToolClass(glowstoneObsidianMallet, "pickaxe", InfiMaterialEnum.Obsidian.getHarvestLevel());
            MinecraftForge.setToolClass(iceObsidianMallet, "pickaxe", InfiMaterialEnum.Obsidian.getHarvestLevel());
            MinecraftForge.setToolClass(lavaObsidianMallet, "pickaxe", InfiMaterialEnum.Obsidian.getHarvestLevel());
            MinecraftForge.setToolClass(cactusObsidianMallet, "pickaxe", InfiMaterialEnum.Obsidian.getHarvestLevel());
        }
        
        if(PropsHelperInfiHybrids.enableSandstoneTools)
        {
        	woodSandstoneMallet = new InfiToolMallet(PropsHelperInfiHybrids.sandstoneMalletID+0, 
                    InfiMaterialEnum.Sandstone, InfiMaterialEnum.Wood, "woodSandstoneMallet");
        	sandstoneSandstoneMallet = new InfiToolMallet(PropsHelperInfiHybrids.sandstoneMalletID+1, 
                    InfiMaterialEnum.Sandstone, InfiMaterialEnum.Sandstone, "sandstoneSandstoneMallet");
        	boneSandstoneMallet = new InfiToolMallet(PropsHelperInfiHybrids.sandstoneMalletID+2, 
                    InfiMaterialEnum.Sandstone, InfiMaterialEnum.Bone, "boneSandstoneMallet");
        	netherrackSandstoneMallet = new InfiToolMallet(PropsHelperInfiHybrids.sandstoneMalletID+3, 
                    InfiMaterialEnum.Sandstone, InfiMaterialEnum.Netherrack, "netherrackSandstoneMallet");
        	iceSandstoneMallet = new InfiToolMallet(PropsHelperInfiHybrids.sandstoneMalletID+4, 
                    InfiMaterialEnum.Sandstone, InfiMaterialEnum.Ice, "iceSandstoneMallet");
        	slimeSandstoneMallet = new InfiToolMallet(PropsHelperInfiHybrids.sandstoneMalletID+5,
                    InfiMaterialEnum.Sandstone, InfiMaterialEnum.Slime, "slimeSandstoneMallet");
        	cactusSandstoneMallet = new InfiToolMallet(PropsHelperInfiHybrids.sandstoneMalletID+6,
                    InfiMaterialEnum.Sandstone, InfiMaterialEnum.Cactus, "cactusSandstoneMallet");
        	flintSandstoneMallet = new InfiToolMallet(PropsHelperInfiHybrids.sandstoneMalletID+7,
                    InfiMaterialEnum.Sandstone, InfiMaterialEnum.Flint, "flintSandstoneMallet");
            
            MinecraftForge.setToolClass(woodSandstoneMallet, "pickaxe", InfiMaterialEnum.Sandstone.getHarvestLevel());
            MinecraftForge.setToolClass(sandstoneSandstoneMallet, "pickaxe", InfiMaterialEnum.Sandstone.getHarvestLevel());
            MinecraftForge.setToolClass(boneSandstoneMallet, "pickaxe", InfiMaterialEnum.Sandstone.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackSandstoneMallet, "pickaxe", InfiMaterialEnum.Sandstone.getHarvestLevel());
            MinecraftForge.setToolClass(iceSandstoneMallet, "pickaxe", InfiMaterialEnum.Sandstone.getHarvestLevel());
            MinecraftForge.setToolClass(slimeSandstoneMallet, "pickaxe", InfiMaterialEnum.Sandstone.getHarvestLevel());
            MinecraftForge.setToolClass(cactusSandstoneMallet, "pickaxe", InfiMaterialEnum.Sandstone.getHarvestLevel());
            MinecraftForge.setToolClass(flintSandstoneMallet, "pickaxe", InfiMaterialEnum.Sandstone.getHarvestLevel());
        }
        
        if(PropsHelperInfiHybrids.enableBoneTools)
        {
        	woodBoneMallet = new InfiToolMallet(PropsHelperInfiHybrids.boneMalletID+0, 
                    InfiMaterialEnum.Bone, InfiMaterialEnum.Wood, "woodBoneMallet");
        	stoneBoneMallet = new InfiToolMallet(PropsHelperInfiHybrids.boneMalletID+1, 
                    InfiMaterialEnum.Bone, InfiMaterialEnum.Stone, "stoneBoneMallet");
        	sandstoneBoneMallet = new InfiToolMallet(PropsHelperInfiHybrids.boneMalletID+2, 
                    InfiMaterialEnum.Bone, InfiMaterialEnum.Sandstone, "sandstoneBoneMallet");
        	boneBoneMallet = new InfiToolMallet(PropsHelperInfiHybrids.boneMalletID+3, 
                    InfiMaterialEnum.Bone, InfiMaterialEnum.Bone, "boneBoneMallet");
        	paperBoneMallet = new InfiToolMallet(PropsHelperInfiHybrids.boneMalletID+4, 
                    InfiMaterialEnum.Bone, InfiMaterialEnum.Paper, "paperBoneMallet");
        	netherrackBoneMallet = new InfiToolMallet(PropsHelperInfiHybrids.boneMalletID+5, 
                    InfiMaterialEnum.Bone, InfiMaterialEnum.Netherrack, "netherrackBoneMallet");
        	iceBoneMallet = new InfiToolMallet(PropsHelperInfiHybrids.boneMalletID+6, 
                    InfiMaterialEnum.Bone, InfiMaterialEnum.Ice, "iceBoneMallet");
        	cactusBoneMallet = new InfiToolMallet(PropsHelperInfiHybrids.boneMalletID+7,
                    InfiMaterialEnum.Bone, InfiMaterialEnum.Cactus, "cactusBoneMallet");
        	flintBoneMallet = new InfiToolMallet(PropsHelperInfiHybrids.boneMalletID+8,
                    InfiMaterialEnum.Bone, InfiMaterialEnum.Flint, "flintBoneMallet");
            
            MinecraftForge.setToolClass(woodBoneMallet, "pickaxe", InfiMaterialEnum.Bone.getHarvestLevel());
            MinecraftForge.setToolClass(stoneBoneMallet, "pickaxe", InfiMaterialEnum.Bone.getHarvestLevel());
            MinecraftForge.setToolClass(sandstoneBoneMallet, "pickaxe", InfiMaterialEnum.Bone.getHarvestLevel());
            MinecraftForge.setToolClass(boneBoneMallet, "pickaxe", InfiMaterialEnum.Bone.getHarvestLevel());
            MinecraftForge.setToolClass(paperBoneMallet, "pickaxe", InfiMaterialEnum.Bone.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackBoneMallet, "pickaxe", InfiMaterialEnum.Bone.getHarvestLevel());
            MinecraftForge.setToolClass(iceBoneMallet, "pickaxe", InfiMaterialEnum.Bone.getHarvestLevel());
            MinecraftForge.setToolClass(cactusBoneMallet, "pickaxe", InfiMaterialEnum.Bone.getHarvestLevel());
            MinecraftForge.setToolClass(flintBoneMallet, "pickaxe", InfiMaterialEnum.Bone.getHarvestLevel());
        }
        
        if(PropsHelperInfiHybrids.enablePaperTools)
        {
        	woodPaperMallet = new InfiToolMallet(PropsHelperInfiHybrids.paperMalletID+0, 
                    InfiMaterialEnum.Paper, InfiMaterialEnum.Wood, "woodPaperMallet");
        	bonePaperMallet = new InfiToolMallet(PropsHelperInfiHybrids.paperMalletID+1, 
                    InfiMaterialEnum.Paper, InfiMaterialEnum.Bone, "bonePaperMallet");
        	paperPaperMallet = new InfiToolMallet(PropsHelperInfiHybrids.paperMalletID+2, 
                    InfiMaterialEnum.Paper, InfiMaterialEnum.Paper, "paperPaperMallet");
        	slimePaperMallet = new InfiToolMallet(PropsHelperInfiHybrids.paperMalletID+3,
                    InfiMaterialEnum.Paper, InfiMaterialEnum.Slime, "slimePaperMallet");
        	cactusPaperMallet = new InfiToolMallet(PropsHelperInfiHybrids.paperMalletID+4,
                    InfiMaterialEnum.Paper, InfiMaterialEnum.Cactus, "cactusPaperMallet");
            
            MinecraftForge.setToolClass(woodPaperMallet, "pickaxe", InfiMaterialEnum.Paper.getHarvestLevel());
            MinecraftForge.setToolClass(bonePaperMallet, "pickaxe", InfiMaterialEnum.Paper.getHarvestLevel());
            MinecraftForge.setToolClass(paperPaperMallet, "pickaxe", InfiMaterialEnum.Paper.getHarvestLevel());
            MinecraftForge.setToolClass(slimePaperMallet, "pickaxe", InfiMaterialEnum.Paper.getHarvestLevel());
            MinecraftForge.setToolClass(cactusPaperMallet, "pickaxe", InfiMaterialEnum.Paper.getHarvestLevel());
        }
        
        if(PropsHelperInfiHybrids.enableMossyTools)
        {
        	woodMossyMallet = new InfiToolMallet(PropsHelperInfiHybrids.mossyMalletID+0, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Wood, "woodMossyMallet");
        	stoneMossyMallet = new InfiToolMallet(PropsHelperInfiHybrids.mossyMalletID+1, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Stone, "stoneMossyMallet");
        	diamondMossyMallet = new InfiToolMallet(PropsHelperInfiHybrids.mossyMalletID+2, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Diamond, "diamondMossyMallet");
        	redstoneMossyMallet = new InfiToolMallet(PropsHelperInfiHybrids.mossyMalletID+3, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Redstone, "redstoneMossyMallet");
        	boneMossyMallet = new InfiToolMallet(PropsHelperInfiHybrids.mossyMalletID+4, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Bone, "boneMossyMallet");
        	mossyMossyMallet = new InfiToolMallet(PropsHelperInfiHybrids.mossyMalletID+5, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Mossy, "mossyMossyMallet");
        	netherrackMossyMallet = new InfiToolMallet(PropsHelperInfiHybrids.mossyMalletID+6, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Netherrack, "netherrackMossyMallet");
        	glowstoneMossyMallet = new InfiToolMallet(PropsHelperInfiHybrids.mossyMalletID+7, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Glowstone, "glowstoneMossyMallet");
        	cactusMossyMallet = new InfiToolMallet(PropsHelperInfiHybrids.mossyMalletID+8, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Cactus, "cactusMossyMallet");
        	blazeMossyMallet = new InfiToolMallet(PropsHelperInfiHybrids.mossyMalletID+9, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Blaze, "blazeMossyMallet");
        	manyullynMossyMallet = new InfiToolMallet(PropsHelperInfiHybrids.mossyMalletID+10, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Manyullyn, "manyullynMossyMallet");
        	uraniumMossyMallet = new InfiToolMallet(PropsHelperInfiHybrids.mossyMalletID+11, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Uranium, "uraniumMossyMallet");
            
            MinecraftForge.setToolClass(woodMossyMallet, "pickaxe", InfiMaterialEnum.Mossy.getHarvestLevel());
            MinecraftForge.setToolClass(stoneMossyMallet, "pickaxe", InfiMaterialEnum.Mossy.getHarvestLevel());
            MinecraftForge.setToolClass(diamondMossyMallet, "pickaxe", InfiMaterialEnum.Mossy.getHarvestLevel());
            MinecraftForge.setToolClass(redstoneMossyMallet, "pickaxe", InfiMaterialEnum.Mossy.getHarvestLevel());
            MinecraftForge.setToolClass(boneMossyMallet, "pickaxe", InfiMaterialEnum.Mossy.getHarvestLevel());
            MinecraftForge.setToolClass(mossyMossyMallet, "pickaxe", InfiMaterialEnum.Mossy.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackMossyMallet, "pickaxe", InfiMaterialEnum.Mossy.getHarvestLevel());
            MinecraftForge.setToolClass(glowstoneMossyMallet, "pickaxe", InfiMaterialEnum.Mossy.getHarvestLevel());
            MinecraftForge.setToolClass(cactusMossyMallet, "pickaxe", InfiMaterialEnum.Mossy.getHarvestLevel());
            MinecraftForge.setToolClass(blazeMossyMallet, "pickaxe", InfiMaterialEnum.Mossy.getHarvestLevel());
            MinecraftForge.setToolClass(manyullynMossyMallet, "pickaxe", InfiMaterialEnum.Mossy.getHarvestLevel());
            MinecraftForge.setToolClass(uraniumMossyMallet, "pickaxe", InfiMaterialEnum.Mossy.getHarvestLevel());
        }
        
        if(PropsHelperInfiHybrids.enableNetherrackTools)
        {
        	woodNetherrackMallet = new InfiToolMallet(PropsHelperInfiHybrids.netherrackMalletID+0, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Wood, "woodNetherrackMallet");
        	stoneNetherrackMallet = new InfiToolMallet(PropsHelperInfiHybrids.netherrackMalletID+1, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Stone, "stoneNetherrackMallet");
        	sandstoneNetherrackMallet = new InfiToolMallet(PropsHelperInfiHybrids.netherrackMalletID+2, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Sandstone, "sandstoneNetherrackMallet");
        	boneNetherrackMallet = new InfiToolMallet(PropsHelperInfiHybrids.netherrackMalletID+3, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Bone, "boneNetherrackMallet");
        	paperNetherrackMallet = new InfiToolMallet(PropsHelperInfiHybrids.netherrackMalletID+4, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Paper, "paperNetherrackMallet");
        	mossyNetherrackMallet = new InfiToolMallet(PropsHelperInfiHybrids.netherrackMalletID+5, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Mossy, "mossyNetherrackMallet");
        	netherrackNetherrackMallet = new InfiToolMallet(PropsHelperInfiHybrids.netherrackMalletID+6, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Netherrack, "netherrackNetherrackMallet");
        	iceNetherrackMallet = new InfiToolMallet(PropsHelperInfiHybrids.netherrackMalletID+7, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Ice, "iceNetherrackMallet");
        	slimeNetherrackMallet = new InfiToolMallet(PropsHelperInfiHybrids.netherrackMalletID+8, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Slime, "slimeNetherrackMallet");
        	cactusNetherrackMallet = new InfiToolMallet(PropsHelperInfiHybrids.netherrackMalletID+9, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Cactus, "cactusNetherrackMallet");
        	flintNetherrackMallet = new InfiToolMallet(PropsHelperInfiHybrids.netherrackMalletID+10, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Flint, "flintNetherrackMallet");
        	copperNetherrackMallet = new InfiToolMallet(PropsHelperInfiHybrids.netherrackMalletID+11, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Copper, "copperNetherrackMallet");
        	bronzeNetherrackMallet = new InfiToolMallet(PropsHelperInfiHybrids.netherrackMalletID+12, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Bronze, "bronzeNetherrackMallet");
            
            MinecraftForge.setToolClass(woodNetherrackMallet, "pickaxe", InfiMaterialEnum.Netherrack.getHarvestLevel());
            MinecraftForge.setToolClass(stoneNetherrackMallet, "pickaxe", InfiMaterialEnum.Netherrack.getHarvestLevel());
            MinecraftForge.setToolClass(sandstoneNetherrackMallet, "pickaxe", InfiMaterialEnum.Netherrack.getHarvestLevel());
            MinecraftForge.setToolClass(boneNetherrackMallet, "pickaxe", InfiMaterialEnum.Netherrack.getHarvestLevel());
            MinecraftForge.setToolClass(paperNetherrackMallet, "pickaxe", InfiMaterialEnum.Netherrack.getHarvestLevel());
            MinecraftForge.setToolClass(mossyNetherrackMallet, "pickaxe", InfiMaterialEnum.Netherrack.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackNetherrackMallet, "pickaxe", InfiMaterialEnum.Netherrack.getHarvestLevel());
            MinecraftForge.setToolClass(iceNetherrackMallet, "pickaxe", InfiMaterialEnum.Netherrack.getHarvestLevel());
            MinecraftForge.setToolClass(slimeNetherrackMallet, "pickaxe", InfiMaterialEnum.Netherrack.getHarvestLevel());
            MinecraftForge.setToolClass(cactusNetherrackMallet, "pickaxe", InfiMaterialEnum.Netherrack.getHarvestLevel());
            MinecraftForge.setToolClass(flintNetherrackMallet, "pickaxe", InfiMaterialEnum.Netherrack.getHarvestLevel());
            MinecraftForge.setToolClass(copperNetherrackMallet, "pickaxe", InfiMaterialEnum.Netherrack.getHarvestLevel());
            MinecraftForge.setToolClass(bronzeNetherrackMallet, "pickaxe", InfiMaterialEnum.Netherrack.getHarvestLevel());
        }
        
        if(PropsHelperInfiHybrids.enableGlowstoneTools)
        {
        	woodGlowstoneMallet = new InfiToolMallet(PropsHelperInfiHybrids.glowstoneMalletID+0, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Wood, "woodGlowstoneMallet");
        	redstoneGlowstoneMallet = new InfiToolMallet(PropsHelperInfiHybrids.glowstoneMalletID+1, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Redstone, "redstoneGlowstoneMallet");
        	obsidianGlowstoneMallet = new InfiToolMallet(PropsHelperInfiHybrids.glowstoneMalletID+2, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Obsidian, "obsidianGlowstoneMallet");
        	boneGlowstoneMallet = new InfiToolMallet(PropsHelperInfiHybrids.glowstoneMalletID+3, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Bone, "boneGlowstoneMallet");
        	netherrackGlowstoneMallet = new InfiToolMallet(PropsHelperInfiHybrids.glowstoneMalletID+4, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Netherrack, "netherrackGlowstoneMallet");
        	glowstoneGlowstoneMallet = new InfiToolMallet(PropsHelperInfiHybrids.glowstoneMalletID+5, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Glowstone, "glowstoneGlowstoneMallet");
        	iceGlowstoneMallet = new InfiToolMallet(PropsHelperInfiHybrids.glowstoneMalletID+6, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Ice, "iceGlowstoneMallet");
        	slimeGlowstoneMallet = new InfiToolMallet(PropsHelperInfiHybrids.glowstoneMalletID+7, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Slime, "slimeGlowstoneMallet");
        	cactusGlowstoneMallet = new InfiToolMallet(PropsHelperInfiHybrids.glowstoneMalletID+8, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Cactus, "cactusGlowstoneMallet");
            
            
            MinecraftForge.setToolClass(woodGlowstoneMallet, "pickaxe", InfiMaterialEnum.Glowstone.getHarvestLevel());
            MinecraftForge.setToolClass(redstoneGlowstoneMallet, "pickaxe", InfiMaterialEnum.Glowstone.getHarvestLevel());
            MinecraftForge.setToolClass(obsidianGlowstoneMallet, "pickaxe", InfiMaterialEnum.Glowstone.getHarvestLevel());
            MinecraftForge.setToolClass(boneGlowstoneMallet, "pickaxe", InfiMaterialEnum.Glowstone.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackGlowstoneMallet, "pickaxe", InfiMaterialEnum.Glowstone.getHarvestLevel());
            MinecraftForge.setToolClass(glowstoneGlowstoneMallet, "pickaxe", InfiMaterialEnum.Glowstone.getHarvestLevel());
            MinecraftForge.setToolClass(iceGlowstoneMallet, "pickaxe", InfiMaterialEnum.Glowstone.getHarvestLevel());
            MinecraftForge.setToolClass(slimeGlowstoneMallet, "pickaxe", InfiMaterialEnum.Glowstone.getHarvestLevel());
            MinecraftForge.setToolClass(cactusGlowstoneMallet, "pickaxe", InfiMaterialEnum.Glowstone.getHarvestLevel());
        }
        
        if(PropsHelperInfiHybrids.enableIceTools)
        {
        	woodIceMallet = new InfiToolMallet(PropsHelperInfiHybrids.iceMalletID+0, 
                    InfiMaterialEnum.Ice, InfiMaterialEnum.Wood, "woodIceMallet");
        	boneIceMallet = new InfiToolMallet(PropsHelperInfiHybrids.iceMalletID+1, 
                    InfiMaterialEnum.Ice, InfiMaterialEnum.Bone, "boneIceMallet");
        	paperIceMallet = new InfiToolMallet(PropsHelperInfiHybrids.iceMalletID+2, 
                    InfiMaterialEnum.Ice, InfiMaterialEnum.Paper, "paperIceMallet");
        	iceIceMallet = new InfiToolMallet(PropsHelperInfiHybrids.iceMalletID+3, 
                    InfiMaterialEnum.Ice, InfiMaterialEnum.Ice, "iceIceMallet");
        	slimeIceMallet = new InfiToolMallet(PropsHelperInfiHybrids.iceMalletID+4, 
                    InfiMaterialEnum.Ice, InfiMaterialEnum.Slime, "slimeIceMallet");
        	cactusIceMallet = new InfiToolMallet(PropsHelperInfiHybrids.iceMalletID+5, 
                    InfiMaterialEnum.Ice, InfiMaterialEnum.Cactus, "cactusIceMallet");
            
            
            MinecraftForge.setToolClass(woodIceMallet, "pickaxe", InfiMaterialEnum.Ice.getHarvestLevel());
            MinecraftForge.setToolClass(boneIceMallet, "pickaxe", InfiMaterialEnum.Ice.getHarvestLevel());
            MinecraftForge.setToolClass(paperIceMallet, "pickaxe", InfiMaterialEnum.Ice.getHarvestLevel());
            MinecraftForge.setToolClass(iceIceMallet, "pickaxe", InfiMaterialEnum.Ice.getHarvestLevel());
            MinecraftForge.setToolClass(slimeIceMallet, "pickaxe", InfiMaterialEnum.Ice.getHarvestLevel());
            MinecraftForge.setToolClass(cactusIceMallet, "pickaxe", InfiMaterialEnum.Ice.getHarvestLevel());
        }
        
        if(PropsHelperInfiHybrids.enableLavaTools)
        {
        	diamondLavaMallet = new InfiToolMallet(PropsHelperInfiHybrids.lavaMalletID+0, 
                    InfiMaterialEnum.Lava, InfiMaterialEnum.Diamond, "diamondLavaMallet");
        	obsidianLavaMallet = new InfiToolMallet(PropsHelperInfiHybrids.lavaMalletID+1, 
                    InfiMaterialEnum.Lava, InfiMaterialEnum.Obsidian, "obsidianLavaMallet");
        	netherrackLavaMallet = new InfiToolMallet(PropsHelperInfiHybrids.lavaMalletID+2, 
                    InfiMaterialEnum.Lava, InfiMaterialEnum.Netherrack, "netherrackLavaMallet");
        	lavaLavaMallet = new InfiToolMallet(PropsHelperInfiHybrids.lavaMalletID+3, 
                    InfiMaterialEnum.Lava, InfiMaterialEnum.Lava, "lavaLavaMallet");
        	flintLavaMallet = new InfiToolMallet(PropsHelperInfiHybrids.lavaMalletID+4, 
                    InfiMaterialEnum.Lava, InfiMaterialEnum.Flint, "flintLavaMallet");
        	blazeLavaMallet = new InfiToolMallet(PropsHelperInfiHybrids.lavaMalletID+5, 
                    InfiMaterialEnum.Lava, InfiMaterialEnum.Blaze, "blazeLavaMallet");
        	manyullynLavaMallet = new InfiToolMallet(PropsHelperInfiHybrids.lavaMalletID+6, 
                    InfiMaterialEnum.Lava, InfiMaterialEnum.Manyullyn, "manyullynLavaMallet");
            uraniumLavaMallet = new InfiToolMallet(PropsHelperInfiHybrids.lavaMalletID+7, 
                    InfiMaterialEnum.Lava, InfiMaterialEnum.Uranium, "uraniumLavaMallet");
            
            MinecraftForge.setToolClass(diamondLavaMallet, "pickaxe", InfiMaterialEnum.Lava.getHarvestLevel());
            MinecraftForge.setToolClass(obsidianLavaMallet, "pickaxe", InfiMaterialEnum.Lava.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackLavaMallet, "pickaxe", InfiMaterialEnum.Lava.getHarvestLevel());
            MinecraftForge.setToolClass(lavaLavaMallet, "pickaxe", InfiMaterialEnum.Lava.getHarvestLevel());
            MinecraftForge.setToolClass(flintLavaMallet, "pickaxe", InfiMaterialEnum.Lava.getHarvestLevel());
            MinecraftForge.setToolClass(blazeLavaMallet, "pickaxe", InfiMaterialEnum.Lava.getHarvestLevel());
            MinecraftForge.setToolClass(manyullynLavaMallet, "pickaxe", InfiMaterialEnum.Lava.getHarvestLevel());
            MinecraftForge.setToolClass(uraniumLavaMallet, "pickaxe", InfiMaterialEnum.Lava.getHarvestLevel());
        }
        
        if(PropsHelperInfiHybrids.enableSlimeTools)
        {
        	woodSlimeMallet = new InfiToolMallet(PropsHelperInfiHybrids.slimeMalletID+0, 
                    InfiMaterialEnum.Slime, InfiMaterialEnum.Wood, "woodSlimeMallet");
        	sandstoneSlimeMallet = new InfiToolMallet(PropsHelperInfiHybrids.slimeMalletID+1, 
                    InfiMaterialEnum.Slime, InfiMaterialEnum.Sandstone, "sandstoneSlimeMallet");
        	boneSlimeMallet = new InfiToolMallet(PropsHelperInfiHybrids.slimeMalletID+2, 
                    InfiMaterialEnum.Slime, InfiMaterialEnum.Bone, "boneSlimeMallet");
        	paperSlimeMallet = new InfiToolMallet(PropsHelperInfiHybrids.slimeMalletID+3, 
                    InfiMaterialEnum.Slime, InfiMaterialEnum.Paper, "paperSlimeMallet");
        	slimeSlimeMallet = new InfiToolMallet(PropsHelperInfiHybrids.slimeMalletID+4, 
                    InfiMaterialEnum.Slime, InfiMaterialEnum.Slime, "slimeSlimeMallet");
        	cactusSlimeMallet = new InfiToolMallet(PropsHelperInfiHybrids.slimeMalletID+5, 
                    InfiMaterialEnum.Slime, InfiMaterialEnum.Cactus, "cactusSlimeMallet");
            
            MinecraftForge.setToolClass(woodSlimeMallet, "pickaxe", InfiMaterialEnum.Slime.getHarvestLevel());
            MinecraftForge.setToolClass(sandstoneSlimeMallet, "pickaxe", InfiMaterialEnum.Slime.getHarvestLevel());
            MinecraftForge.setToolClass(boneSlimeMallet, "pickaxe", InfiMaterialEnum.Slime.getHarvestLevel());
            MinecraftForge.setToolClass(paperSlimeMallet, "pickaxe", InfiMaterialEnum.Slime.getHarvestLevel());
            MinecraftForge.setToolClass(slimeSlimeMallet, "pickaxe", InfiMaterialEnum.Slime.getHarvestLevel());
            MinecraftForge.setToolClass(cactusSlimeMallet, "pickaxe", InfiMaterialEnum.Slime.getHarvestLevel());
        }
        
        if(PropsHelperInfiHybrids.enableCactusTools)
        {
        	woodCactusMallet = new InfiToolMallet(PropsHelperInfiHybrids.cactusMalletID+0, 
                    InfiMaterialEnum.Cactus, InfiMaterialEnum.Wood, "woodCactusMallet");
        	sandstoneCactusMallet = new InfiToolMallet(PropsHelperInfiHybrids.cactusMalletID+1, 
                    InfiMaterialEnum.Cactus, InfiMaterialEnum.Sandstone, "sandstoneCactusMallet");
        	boneCactusMallet = new InfiToolMallet(PropsHelperInfiHybrids.cactusMalletID+2, 
                    InfiMaterialEnum.Cactus, InfiMaterialEnum.Bone, "boneCactusMallet");
        	netherrackCactusMallet = new InfiToolMallet(PropsHelperInfiHybrids.cactusMalletID+3, 
                    InfiMaterialEnum.Cactus, InfiMaterialEnum.Netherrack, "netherrackCactusMallet");
        	iceCactusMallet = new InfiToolMallet(PropsHelperInfiHybrids.cactusMalletID+4, 
                    InfiMaterialEnum.Cactus, InfiMaterialEnum.Ice, "iceCactusMallet");
        	slimeCactusMallet = new InfiToolMallet(PropsHelperInfiHybrids.cactusMalletID+5, 
                    InfiMaterialEnum.Cactus, InfiMaterialEnum.Slime, "slimeCactusMallet");
        	cactusCactusMallet = new InfiToolMallet(PropsHelperInfiHybrids.cactusMalletID+6, 
                    InfiMaterialEnum.Cactus, InfiMaterialEnum.Cactus, "cactusCactusMallet");
            
            MinecraftForge.setToolClass(woodCactusMallet, "pickaxe", InfiMaterialEnum.Cactus.getHarvestLevel());
            MinecraftForge.setToolClass(sandstoneCactusMallet, "pickaxe", InfiMaterialEnum.Cactus.getHarvestLevel());
            MinecraftForge.setToolClass(boneCactusMallet, "pickaxe", InfiMaterialEnum.Cactus.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackCactusMallet, "pickaxe", InfiMaterialEnum.Cactus.getHarvestLevel());
            MinecraftForge.setToolClass(iceCactusMallet, "pickaxe", InfiMaterialEnum.Cactus.getHarvestLevel());
            MinecraftForge.setToolClass(slimeCactusMallet, "pickaxe", InfiMaterialEnum.Cactus.getHarvestLevel());
            MinecraftForge.setToolClass(cactusCactusMallet, "pickaxe", InfiMaterialEnum.Cactus.getHarvestLevel());
        }
        
        if(PropsHelperInfiHybrids.enableFlintTools)
        {
        	woodFlintMallet = new InfiToolMallet(PropsHelperInfiHybrids.flintMalletID+0, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Wood, "woodFlintMallet");
        	stoneFlintMallet = new InfiToolMallet(PropsHelperInfiHybrids.flintMalletID+1, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Stone, "stoneFlintMallet");
        	sandstoneFlintMallet = new InfiToolMallet(PropsHelperInfiHybrids.flintMalletID+2, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Sandstone, "sandstoneFlintMallet");
        	boneFlintMallet = new InfiToolMallet(PropsHelperInfiHybrids.flintMalletID+3, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Bone, "boneFlintMallet");
        	netherrackFlintMallet = new InfiToolMallet(PropsHelperInfiHybrids.flintMalletID+4, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Netherrack, "netherrackFlintMallet");
        	slimeFlintMallet = new InfiToolMallet(PropsHelperInfiHybrids.flintMalletID+5, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Slime, "slimeFlintMallet");
        	cactusFlintMallet = new InfiToolMallet(PropsHelperInfiHybrids.flintMalletID+6, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Cactus, "cactusFlintMallet");
        	flintFlintMallet = new InfiToolMallet(PropsHelperInfiHybrids.flintMalletID+7, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Flint, "flintFlintMallet");
        	copperFlintMallet = new InfiToolMallet(PropsHelperInfiHybrids.flintMalletID+8, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Copper, "copperFlintMallet");
        	bronzeFlintMallet = new InfiToolMallet(PropsHelperInfiHybrids.flintMalletID+9, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Bronze, "bronzeFlintMallet");
            
            MinecraftForge.setToolClass(woodFlintMallet, "pickaxe", InfiMaterialEnum.Flint.getHarvestLevel());
            MinecraftForge.setToolClass(stoneFlintMallet, "pickaxe", InfiMaterialEnum.Flint.getHarvestLevel());
            MinecraftForge.setToolClass(sandstoneFlintMallet, "pickaxe", InfiMaterialEnum.Flint.getHarvestLevel());
            MinecraftForge.setToolClass(boneFlintMallet, "pickaxe", InfiMaterialEnum.Flint.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackFlintMallet, "pickaxe", InfiMaterialEnum.Flint.getHarvestLevel());
            MinecraftForge.setToolClass(slimeFlintMallet, "pickaxe", InfiMaterialEnum.Flint.getHarvestLevel());
            MinecraftForge.setToolClass(cactusFlintMallet, "pickaxe", InfiMaterialEnum.Flint.getHarvestLevel());
            MinecraftForge.setToolClass(flintFlintMallet, "pickaxe", InfiMaterialEnum.Flint.getHarvestLevel());
            MinecraftForge.setToolClass(copperFlintMallet, "pickaxe", InfiMaterialEnum.Flint.getHarvestLevel());
            MinecraftForge.setToolClass(bronzeFlintMallet, "pickaxe", InfiMaterialEnum.Flint.getHarvestLevel());
        }
        
        if(PropsHelperInfiHybrids.enableBlazeTools)
        {
        	diamondBlazeMallet = new InfiToolMallet(PropsHelperInfiHybrids.blazeMalletID+0, 
                    InfiMaterialEnum.Blaze, InfiMaterialEnum.Diamond, "diamondBlazeMallet");
        	obsidianBlazeMallet = new InfiToolMallet(PropsHelperInfiHybrids.blazeMalletID+1, 
                    InfiMaterialEnum.Blaze, InfiMaterialEnum.Obsidian, "obsidianBlazeMallet");
        	netherrackBlazeMallet = new InfiToolMallet(PropsHelperInfiHybrids.blazeMalletID+2, 
                    InfiMaterialEnum.Blaze, InfiMaterialEnum.Netherrack, "netherrackBlazeMallet");
        	lavaBlazeMallet = new InfiToolMallet(PropsHelperInfiHybrids.blazeMalletID+3, 
                    InfiMaterialEnum.Blaze, InfiMaterialEnum.Lava, "lavaBlazeMallet");
        	flintBlazeMallet = new InfiToolMallet(PropsHelperInfiHybrids.blazeMalletID+4, 
                    InfiMaterialEnum.Blaze, InfiMaterialEnum.Flint, "flintBlazeMallet");
        	blazeBlazeMallet = new InfiToolMallet(PropsHelperInfiHybrids.blazeMalletID+5, 
                    InfiMaterialEnum.Blaze, InfiMaterialEnum.Blaze, "blazeBlazeMallet");
        	manyullynBlazeMallet = new InfiToolMallet(PropsHelperInfiHybrids.blazeMalletID+6, 
                    InfiMaterialEnum.Blaze, InfiMaterialEnum.Manyullyn, "manyullynBlazeMallet");
            uraniumBlazeMallet = new InfiToolMallet(PropsHelperInfiHybrids.blazeMalletID+7, 
                    InfiMaterialEnum.Blaze, InfiMaterialEnum.Uranium, "uraniumBlazeMallet");
            
            MinecraftForge.setToolClass(diamondBlazeMallet, "pickaxe", InfiMaterialEnum.Blaze.getHarvestLevel());
            MinecraftForge.setToolClass(obsidianBlazeMallet, "pickaxe", InfiMaterialEnum.Blaze.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackBlazeMallet, "pickaxe", InfiMaterialEnum.Blaze.getHarvestLevel());
            MinecraftForge.setToolClass(blazeBlazeMallet, "pickaxe", InfiMaterialEnum.Blaze.getHarvestLevel());
            MinecraftForge.setToolClass(flintBlazeMallet, "pickaxe", InfiMaterialEnum.Blaze.getHarvestLevel());
            MinecraftForge.setToolClass(blazeBlazeMallet, "pickaxe", InfiMaterialEnum.Blaze.getHarvestLevel());
            MinecraftForge.setToolClass(manyullynBlazeMallet, "pickaxe", InfiMaterialEnum.Blaze.getHarvestLevel());
            MinecraftForge.setToolClass(uraniumBlazeMallet, "pickaxe", InfiMaterialEnum.Blaze.getHarvestLevel());
        }
    	
        if(PropsHelperInfiHybrids.enableCopperTools)
        {
        	woodCopperMallet = new InfiToolMallet(PropsHelperInfiHybrids.copperMalletID+0, 
                    InfiMaterialEnum.Copper, InfiMaterialEnum.Wood, "woodCopperMallet");
            stoneCopperMallet = new InfiToolMallet(PropsHelperInfiHybrids.copperMalletID+1, 
                    InfiMaterialEnum.Copper, InfiMaterialEnum.Stone, "stoneCopperMallet");
            boneCopperMallet = new InfiToolMallet(PropsHelperInfiHybrids.copperMalletID+2, 
                    InfiMaterialEnum.Copper, InfiMaterialEnum.Bone, "boneCopperMallet");
            netherrackCopperMallet = new InfiToolMallet(PropsHelperInfiHybrids.copperMalletID+3, 
                    InfiMaterialEnum.Copper, InfiMaterialEnum.Netherrack, "netherrackCopperMallet");
            slimeCopperMallet = new InfiToolMallet(PropsHelperInfiHybrids.copperMalletID+4, 
                    InfiMaterialEnum.Copper, InfiMaterialEnum.Slime, "slimeCopperMallet");
            cactusCopperMallet = new InfiToolMallet(PropsHelperInfiHybrids.copperMalletID+5, 
                    InfiMaterialEnum.Copper, InfiMaterialEnum.Cactus, "cactusCopperMallet");
            flintCopperMallet = new InfiToolMallet(PropsHelperInfiHybrids.copperMalletID+6, 
                    InfiMaterialEnum.Copper, InfiMaterialEnum.Flint, "flintCopperMallet");
            copperCopperMallet = new InfiToolMallet(PropsHelperInfiHybrids.copperMalletID+7, 
                    InfiMaterialEnum.Copper, InfiMaterialEnum.Copper, "copperCopperMallet");
            
            MinecraftForge.setToolClass(woodCopperMallet, "pickaxe", InfiMaterialEnum.Copper.getHarvestLevel());
        	MinecraftForge.setToolClass(stoneCopperMallet, "pickaxe", InfiMaterialEnum.Copper.getHarvestLevel());
            MinecraftForge.setToolClass(boneCopperMallet, "pickaxe", InfiMaterialEnum.Copper.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackCopperMallet, "pickaxe", InfiMaterialEnum.Copper.getHarvestLevel());
            MinecraftForge.setToolClass(slimeCopperMallet, "pickaxe", InfiMaterialEnum.Copper.getHarvestLevel());
            MinecraftForge.setToolClass(cactusCopperMallet, "pickaxe", InfiMaterialEnum.Copper.getHarvestLevel());
            MinecraftForge.setToolClass(flintCopperMallet, "pickaxe", InfiMaterialEnum.Copper.getHarvestLevel());
            MinecraftForge.setToolClass(copperCopperMallet, "pickaxe", InfiMaterialEnum.Copper.getHarvestLevel());
        }
        
        if(PropsHelperInfiHybrids.enableBronzeTools)
        {
        	woodBronzeMallet = new InfiToolMallet(PropsHelperInfiHybrids.bronzeMalletID+0, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Wood, "woodBronzeMallet");
            stoneBronzeMallet = new InfiToolMallet(PropsHelperInfiHybrids.bronzeMalletID+1, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Stone, "stoneBronzeMallet");
            boneBronzeMallet = new InfiToolMallet(PropsHelperInfiHybrids.bronzeMalletID+2, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Bone, "boneBronzeMallet");
            netherrackBronzeMallet = new InfiToolMallet(PropsHelperInfiHybrids.bronzeMalletID+3, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Netherrack, "netherrackBronzeMallet");
            slimeBronzeMallet = new InfiToolMallet(PropsHelperInfiHybrids.bronzeMalletID+4, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Slime, "slimeBronzeMallet");
            cactusBronzeMallet = new InfiToolMallet(PropsHelperInfiHybrids.bronzeMalletID+5, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Cactus, "cactusBronzeMallet");
            flintBronzeMallet = new InfiToolMallet(PropsHelperInfiHybrids.bronzeMalletID+6, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Flint, "flintBronzeMallet");
            copperBronzeMallet = new InfiToolMallet(PropsHelperInfiHybrids.bronzeMalletID+7, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Copper, "copperBronzeMallet");
            bronzeBronzeMallet = new InfiToolMallet(PropsHelperInfiHybrids.bronzeMalletID+8, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Bronze, "bronzeBronzeMallet");
            
            MinecraftForge.setToolClass(woodBronzeMallet, "pickaxe", InfiMaterialEnum.Bronze.getHarvestLevel());
            MinecraftForge.setToolClass(stoneBronzeMallet, "pickaxe", InfiMaterialEnum.Bronze.getHarvestLevel());
            MinecraftForge.setToolClass(boneBronzeMallet, "pickaxe", InfiMaterialEnum.Bronze.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackBronzeMallet, "pickaxe", InfiMaterialEnum.Bronze.getHarvestLevel());
            MinecraftForge.setToolClass(slimeBronzeMallet, "pickaxe", InfiMaterialEnum.Bronze.getHarvestLevel());
            MinecraftForge.setToolClass(cactusBronzeMallet, "pickaxe", InfiMaterialEnum.Bronze.getHarvestLevel());
            MinecraftForge.setToolClass(flintBronzeMallet, "pickaxe", InfiMaterialEnum.Bronze.getHarvestLevel());
            MinecraftForge.setToolClass(copperBronzeMallet, "pickaxe", InfiMaterialEnum.Bronze.getHarvestLevel());
            MinecraftForge.setToolClass(bronzeBronzeMallet, "pickaxe", InfiMaterialEnum.Bronze.getHarvestLevel());
        }
        
        if(PropsHelperInfiHybrids.enableWorkedIronTools)
        {
        	woodWorkedIronMallet = new InfiToolMallet(PropsHelperInfiHybrids.workedIronMalletID+0, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Wood, "woodWorkedIronMallet");
            stoneWorkedIronMallet = new InfiToolMallet(PropsHelperInfiHybrids.workedIronMalletID+1, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Stone, "stoneWorkedIronMallet");
            ironWorkedIronMallet = new InfiToolMallet(PropsHelperInfiHybrids.workedIronMalletID+2,
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Iron, "ironWorkedIronMallet");
            diamondWorkedIronMallet = new InfiToolMallet(PropsHelperInfiHybrids.workedIronMalletID+3, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Diamond, "diamondWorkedIronMallet");
            redstoneWorkedIronMallet = new InfiToolMallet(PropsHelperInfiHybrids.workedIronMalletID+4, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Redstone, "redstoneWorkedIronMallet");
            obsidianWorkedIronMallet = new InfiToolMallet(PropsHelperInfiHybrids.workedIronMalletID+5, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Obsidian, "obsidianWorkedIronMallet");
            boneWorkedIronMallet = new InfiToolMallet(PropsHelperInfiHybrids.workedIronMalletID+6, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Bone, "boneWorkedIronMallet");
            netherrackWorkedIronMallet = new InfiToolMallet(PropsHelperInfiHybrids.workedIronMalletID+7, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Netherrack, "netherrackWorkedIronMallet");
            glowstoneWorkedIronMallet = new InfiToolMallet(PropsHelperInfiHybrids.workedIronMalletID+8, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Glowstone, "glowstoneWorkedIronMallet");
            iceWorkedIronMallet = new InfiToolMallet(PropsHelperInfiHybrids.workedIronMalletID+9, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Ice, "iceWorkedIronMallet");
            slimeWorkedIronMallet = new InfiToolMallet(PropsHelperInfiHybrids.workedIronMalletID+10, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Slime, "slimeWorkedIronMallet");
            cactusWorkedIronMallet = new InfiToolMallet(PropsHelperInfiHybrids.workedIronMalletID+11, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Cactus, "cactusWorkedIronMallet");
            blazeWorkedIronMallet = new InfiToolMallet(PropsHelperInfiHybrids.workedIronMalletID+12, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Blaze, "blazeWorkedIronMallet");
            copperWorkedIronMallet = new InfiToolMallet(PropsHelperInfiHybrids.workedIronMalletID+13, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Copper, "copperWorkedIronMallet");
            bronzeWorkedIronMallet = new InfiToolMallet(PropsHelperInfiHybrids.workedIronMalletID+14, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Bronze, "bronzeWorkedIronMallet");
            workedWorkedIronMallet = new InfiToolMallet(PropsHelperInfiHybrids.workedIronMalletID+15, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.WorkedIron, "workedWorkedIronMallet");
            steelWorkedIronMallet = new InfiToolMallet(PropsHelperInfiHybrids.workedIronMalletID+16, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Steel, "steelWorkedIronMallet");
            uraniumWorkedIronMallet = new InfiToolMallet(PropsHelperInfiHybrids.workedIronMalletID+17, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Uranium, "uraniumWorkedIronMallet");
            
            MinecraftForge.setToolClass(woodWorkedIronMallet, "pickaxe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(stoneWorkedIronMallet, "pickaxe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(ironWorkedIronMallet, "pickaxe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(diamondWorkedIronMallet, "pickaxe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(redstoneWorkedIronMallet, "pickaxe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(obsidianWorkedIronMallet, "pickaxe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(boneWorkedIronMallet, "pickaxe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackWorkedIronMallet, "pickaxe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(glowstoneWorkedIronMallet, "pickaxe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(iceWorkedIronMallet, "pickaxe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(slimeWorkedIronMallet, "pickaxe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(cactusWorkedIronMallet, "pickaxe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(blazeWorkedIronMallet, "pickaxe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(copperWorkedIronMallet, "pickaxe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(bronzeWorkedIronMallet, "pickaxe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(workedWorkedIronMallet, "pickaxe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(steelWorkedIronMallet, "pickaxe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(uraniumWorkedIronMallet, "pickaxe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
        }
        
        if(PropsHelperInfiHybrids.enableSteelTools)
        {
        	woodSteelMallet = new InfiToolMallet(PropsHelperInfiHybrids.steelMalletID+0, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Wood, "woodSteelMallet");
            stoneSteelMallet = new InfiToolMallet(PropsHelperInfiHybrids.steelMalletID+1, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Stone, "stoneSteelMallet");
            ironSteelMallet = new InfiToolMallet(PropsHelperInfiHybrids.steelMalletID+2, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Iron, "ironSteelMallet");
            diamondSteelMallet = new InfiToolMallet(PropsHelperInfiHybrids.steelMalletID+3, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Diamond, "diamondSteelMallet");
            redstoneSteelMallet = new InfiToolMallet(PropsHelperInfiHybrids.steelMalletID+4, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Redstone, "redstoneSteelMallet");
            obsidianSteelMallet = new InfiToolMallet(PropsHelperInfiHybrids.steelMalletID+5, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Obsidian, "obsidianSteelMallet");
            boneSteelMallet = new InfiToolMallet(PropsHelperInfiHybrids.steelMalletID+6, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Bone, "boneSteelMallet");
            netherrackSteelMallet = new InfiToolMallet(PropsHelperInfiHybrids.steelMalletID+7, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Netherrack, "netherrackSteelMallet");
            glowstoneSteelMallet = new InfiToolMallet(PropsHelperInfiHybrids.steelMalletID+8, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Glowstone, "glowstoneSteelMallet");
            iceSteelMallet = new InfiToolMallet(PropsHelperInfiHybrids.steelMalletID+9, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Ice, "iceSteelMallet");
            slimeSteelMallet = new InfiToolMallet(PropsHelperInfiHybrids.steelMalletID+10, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Slime, "slimeSteelMallet");
            cactusSteelMallet = new InfiToolMallet(PropsHelperInfiHybrids.steelMalletID+11, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Cactus, "cactusSteelMallet");
            blazeSteelMallet = new InfiToolMallet(PropsHelperInfiHybrids.steelMalletID+12, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Blaze, "blazeSteelMallet");
            copperSteelMallet = new InfiToolMallet(PropsHelperInfiHybrids.steelMalletID+13, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Copper, "copperSteelMallet");
            bronzeSteelMallet = new InfiToolMallet(PropsHelperInfiHybrids.steelMalletID+14, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Bronze, "bronzeSteelMallet");
            workedSteelMallet = new InfiToolMallet(PropsHelperInfiHybrids.steelMalletID+15, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.WorkedIron, "workedSteelMallet");
            steelSteelMallet = new InfiToolMallet(PropsHelperInfiHybrids.steelMalletID+16, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Steel, "steelSteelMallet");
            cobaltSteelMallet = new InfiToolMallet(PropsHelperInfiHybrids.steelMalletID+17, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Cobalt, "cobaltSteelMallet");
            arditeSteelMallet = new InfiToolMallet(PropsHelperInfiHybrids.steelMalletID+18, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Ardite, "arditeSteelMallet");
            uraniumSteelMallet = new InfiToolMallet(PropsHelperInfiHybrids.steelMalletID+19, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Uranium, "uraniumSteelMallet");

            MinecraftForge.setToolClass(woodSteelMallet, "pickaxe", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(stoneSteelMallet, "pickaxe", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(ironSteelMallet, "pickaxe", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(diamondSteelMallet, "pickaxe", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(redstoneSteelMallet, "pickaxe", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(obsidianSteelMallet, "pickaxe", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(boneSteelMallet, "pickaxe", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackSteelMallet, "pickaxe", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(glowstoneSteelMallet, "pickaxe", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(iceSteelMallet, "pickaxe", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(slimeSteelMallet, "pickaxe", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(cactusSteelMallet, "pickaxe", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(blazeSteelMallet, "pickaxe", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(copperSteelMallet, "pickaxe", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(bronzeSteelMallet, "pickaxe", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(workedSteelMallet, "pickaxe", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(steelSteelMallet, "pickaxe", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(cobaltSteelMallet, "pickaxe", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(arditeSteelMallet, "pickaxe", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(uraniumSteelMallet, "pickaxe", InfiMaterialEnum.Steel.getHarvestLevel());
        }
        
        if(PropsHelperInfiHybrids.enableCobaltTools)
        {
        	woodCobaltMallet = new InfiToolMallet(PropsHelperInfiHybrids.cobaltMalletID+0, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Wood, "woodCobaltMallet");
            stoneCobaltMallet = new InfiToolMallet(PropsHelperInfiHybrids.cobaltMalletID+1, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Stone, "stoneCobaltMallet");
            ironCobaltMallet = new InfiToolMallet(PropsHelperInfiHybrids.cobaltMalletID+2, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Iron, "ironCobaltMallet");
            diamondCobaltMallet = new InfiToolMallet(PropsHelperInfiHybrids.cobaltMalletID+3,
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Diamond, "diamondCobaltMallet");
            redstoneCobaltMallet = new InfiToolMallet(PropsHelperInfiHybrids.cobaltMalletID+4, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Redstone, "redstoneCobaltMallet");
            obsidianCobaltMallet = new InfiToolMallet(PropsHelperInfiHybrids.cobaltMalletID+5, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Obsidian, "obsidianCobaltMallet");
            boneCobaltMallet = new InfiToolMallet(PropsHelperInfiHybrids.cobaltMalletID+6, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Bone, "boneCobaltMallet");
            slimeCobaltMallet = new InfiToolMallet(PropsHelperInfiHybrids.cobaltMalletID+7, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Slime, "slimeCobaltMallet");
            cactusCobaltMallet = new InfiToolMallet(PropsHelperInfiHybrids.cobaltMalletID+8, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Cactus, "cactusCobaltMallet");
            blazeCobaltMallet = new InfiToolMallet(PropsHelperInfiHybrids.cobaltMalletID+9, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Blaze, "blazeCobaltMallet");
            copperCobaltMallet = new InfiToolMallet(PropsHelperInfiHybrids.cobaltMalletID+10, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Copper, "copperCobaltMallet");
            bronzeCobaltMallet = new InfiToolMallet(PropsHelperInfiHybrids.cobaltMalletID+11, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Bronze, "bronzeCobaltMallet");
            workedCobaltMallet = new InfiToolMallet(PropsHelperInfiHybrids.cobaltMalletID+12, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.WorkedIron, "workedCobaltMallet");
            steelCobaltMallet = new InfiToolMallet(PropsHelperInfiHybrids.cobaltMalletID+13, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Steel, "steelCobaltMallet");
            cobaltCobaltMallet = new InfiToolMallet(PropsHelperInfiHybrids.cobaltMalletID+14, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Cobalt, "cobaltCobaltMallet");
            arditeCobaltMallet = new InfiToolMallet(PropsHelperInfiHybrids.cobaltMalletID+15, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Ardite, "arditeCobaltMallet");
            manyullynCobaltMallet = new InfiToolMallet(PropsHelperInfiHybrids.cobaltMalletID+16, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Manyullyn, "manyullynCobaltMallet");
            uraniumCobaltMallet = new InfiToolMallet(PropsHelperInfiHybrids.cobaltMalletID+17, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Uranium, "uraniumCobaltMallet");
            
            MinecraftForge.setToolClass(woodCobaltMallet, "pickaxe", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(stoneCobaltMallet, "pickaxe", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(ironCobaltMallet, "pickaxe", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(diamondCobaltMallet, "pickaxe", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(redstoneCobaltMallet, "pickaxe", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(obsidianCobaltMallet, "pickaxe", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(boneCobaltMallet, "pickaxe", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(slimeCobaltMallet, "pickaxe", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(cactusCobaltMallet, "pickaxe", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(blazeCobaltMallet, "pickaxe", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(copperCobaltMallet, "pickaxe", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(bronzeCobaltMallet, "pickaxe", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(workedCobaltMallet, "pickaxe", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(steelCobaltMallet, "pickaxe", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(cobaltCobaltMallet, "pickaxe", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(arditeCobaltMallet, "pickaxe", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(manyullynCobaltMallet, "pickaxe", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(uraniumCobaltMallet, "pickaxe", InfiMaterialEnum.Cobalt.getHarvestLevel());
        }
        
        if(PropsHelperInfiHybrids.enableArditeTools)
        {
        	woodArditeMallet = new InfiToolMallet(PropsHelperInfiHybrids.arditeMalletID+0, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Wood, "woodArditeMallet");
            stoneArditeMallet = new InfiToolMallet(PropsHelperInfiHybrids.arditeMalletID+1, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Stone, "stoneArditeMallet");
            ironArditeMallet = new InfiToolMallet(PropsHelperInfiHybrids.arditeMalletID+2, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Iron, "ironArditeMallet");
            diamondArditeMallet = new InfiToolMallet(PropsHelperInfiHybrids.arditeMalletID+3,
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Diamond, "diamondArditeMallet");
            redstoneArditeMallet = new InfiToolMallet(PropsHelperInfiHybrids.arditeMalletID+4, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Redstone, "redstoneArditeMallet");
            obsidianArditeMallet = new InfiToolMallet(PropsHelperInfiHybrids.arditeMalletID+5, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Obsidian, "obsidianArditeMallet");
            boneArditeMallet = new InfiToolMallet(PropsHelperInfiHybrids.arditeMalletID+6,
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Bone, "boneArditeMallet");
            slimeArditeMallet = new InfiToolMallet(PropsHelperInfiHybrids.arditeMalletID+7, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Slime, "slimeArditeMallet");
            cactusArditeMallet = new InfiToolMallet(PropsHelperInfiHybrids.arditeMalletID+8, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Cactus, "cactusArditeMallet");
            blazeArditeMallet = new InfiToolMallet(PropsHelperInfiHybrids.arditeMalletID+9, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Blaze, "blazeArditeMallet");
            copperArditeMallet = new InfiToolMallet(PropsHelperInfiHybrids.arditeMalletID+10, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Copper, "copperArditeMallet");
            bronzeArditeMallet = new InfiToolMallet(PropsHelperInfiHybrids.arditeMalletID+11, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Bronze, "bronzeArditeMallet");
            workedArditeMallet = new InfiToolMallet(PropsHelperInfiHybrids.arditeMalletID+12, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.WorkedIron, "workedArditeMallet");
            steelArditeMallet = new InfiToolMallet(PropsHelperInfiHybrids.arditeMalletID+13, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Steel, "steelArditeMallet");
            cobaltArditeMallet = new InfiToolMallet(PropsHelperInfiHybrids.arditeMalletID+14, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Cobalt, "cobaltArditeMallet");
            arditeArditeMallet = new InfiToolMallet(PropsHelperInfiHybrids.arditeMalletID+15, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Ardite, "arditeArditeMallet");
            manyullynArditeMallet = new InfiToolMallet(PropsHelperInfiHybrids.arditeMalletID+16, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Manyullyn, "manyullynArditeMallet");
            uraniumArditeMallet = new InfiToolMallet(PropsHelperInfiHybrids.arditeMalletID+17, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Uranium, "uraniumArditeMallet");
            
            MinecraftForge.setToolClass(woodArditeMallet, "pickaxe", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(stoneArditeMallet, "pickaxe", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(ironArditeMallet, "pickaxe", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(diamondArditeMallet, "pickaxe", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(redstoneArditeMallet, "pickaxe", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(obsidianArditeMallet, "pickaxe", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(boneArditeMallet, "pickaxe", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(slimeArditeMallet, "pickaxe", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(cactusArditeMallet, "pickaxe", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(blazeArditeMallet, "pickaxe", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(copperArditeMallet, "pickaxe", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(bronzeArditeMallet, "pickaxe", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(workedArditeMallet, "pickaxe", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(steelArditeMallet, "pickaxe", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(cobaltArditeMallet, "pickaxe", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(arditeArditeMallet, "pickaxe", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(manyullynArditeMallet, "pickaxe", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(uraniumArditeMallet, "pickaxe", InfiMaterialEnum.Ardite.getHarvestLevel());
        }
        
        if(PropsHelperInfiHybrids.enableManyullynTools)
        {
        	woodManyullynMallet = new InfiToolMallet(PropsHelperInfiHybrids.manyullynMalletID+0, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Wood, "woodManyullynMallet");
            stoneManyullynMallet = new InfiToolMallet(PropsHelperInfiHybrids.manyullynMalletID+1, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Stone, "stoneManyullynMallet");
            ironManyullynMallet = new InfiToolMallet(PropsHelperInfiHybrids.manyullynMalletID+2, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Iron, "ironManyullynMallet");
            diamondManyullynMallet = new InfiToolMallet(PropsHelperInfiHybrids.manyullynMalletID+3,
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Diamond, "diamondManyullynMallet");
            redstoneManyullynMallet = new InfiToolMallet(PropsHelperInfiHybrids.manyullynMalletID+4, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Redstone, "redstoneManyullynMallet");
            obsidianManyullynMallet = new InfiToolMallet(PropsHelperInfiHybrids.manyullynMalletID+5, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Obsidian, "obsidianManyullynMallet");
            boneManyullynMallet = new InfiToolMallet(PropsHelperInfiHybrids.manyullynMalletID+6, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Bone, "boneManyullynMallet");
            slimeManyullynMallet = new InfiToolMallet(PropsHelperInfiHybrids.manyullynMalletID+7, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Slime, "slimeManyullynMallet");
            cactusManyullynMallet = new InfiToolMallet(PropsHelperInfiHybrids.manyullynMalletID+8, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Cactus, "cactusManyullynMallet");
            blazeManyullynMallet = new InfiToolMallet(PropsHelperInfiHybrids.manyullynMalletID+9, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Blaze, "blazeManyullynMallet");
            copperManyullynMallet = new InfiToolMallet(PropsHelperInfiHybrids.manyullynMalletID+10, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Copper, "copperManyullynMallet");
            bronzeManyullynMallet = new InfiToolMallet(PropsHelperInfiHybrids.manyullynMalletID+11, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Bronze, "bronzeManyullynMallet");
            workedManyullynMallet = new InfiToolMallet(PropsHelperInfiHybrids.manyullynMalletID+12, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.WorkedIron, "workedManyullynMallet");
            steelManyullynMallet = new InfiToolMallet(PropsHelperInfiHybrids.manyullynMalletID+13, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Steel, "steelManyullynMallet");
            cobaltManyullynMallet = new InfiToolMallet(PropsHelperInfiHybrids.manyullynMalletID+14, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Cobalt, "cobaltManyullynMallet");
            arditeManyullynMallet = new InfiToolMallet(PropsHelperInfiHybrids.manyullynMalletID+15, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Ardite, "arditeManyullynMallet");
            manyullynManyullynMallet = new InfiToolMallet(PropsHelperInfiHybrids.manyullynMalletID+16, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Manyullyn, "manyullynManyullynMallet");
            uraniumManyullynMallet = new InfiToolMallet(PropsHelperInfiHybrids.manyullynMalletID+17,
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Uranium, "uraniumManyullynMallet");
            
            MinecraftForge.setToolClass(woodManyullynMallet, "pickaxe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(stoneManyullynMallet, "pickaxe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(ironManyullynMallet, "pickaxe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(diamondManyullynMallet, "pickaxe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(redstoneManyullynMallet, "pickaxe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(obsidianManyullynMallet, "pickaxe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(boneManyullynMallet, "pickaxe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(slimeManyullynMallet, "pickaxe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(cactusManyullynMallet, "pickaxe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(blazeManyullynMallet, "pickaxe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(copperManyullynMallet, "pickaxe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(bronzeManyullynMallet, "pickaxe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(workedManyullynMallet, "pickaxe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(steelManyullynMallet, "pickaxe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(cobaltManyullynMallet, "pickaxe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(arditeManyullynMallet, "pickaxe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(manyullynManyullynMallet, "pickaxe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(uraniumManyullynMallet, "pickaxe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
        }
        
        if(PropsHelperInfiHybrids.enableUraniumTools)
        {
            diamondUraniumMallet = new InfiToolMallet(PropsHelperInfiHybrids.uraniumMalletID+0, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Diamond, "diamondUraniumMallet");
            redstoneUraniumMallet = new InfiToolMallet(PropsHelperInfiHybrids.uraniumMalletID+1, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Redstone, "redstoneUraniumMallet");
            boneUraniumMallet = new InfiToolMallet(PropsHelperInfiHybrids.uraniumMalletID+2, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Bone, "boneUraniumMallet");
            netherrackUraniumMallet = new InfiToolMallet(PropsHelperInfiHybrids.uraniumMalletID+3, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Netherrack, "netherrackUraniumMallet");
            glowstoneUraniumMallet = new InfiToolMallet(PropsHelperInfiHybrids.uraniumMalletID+4, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Glowstone, "glowstoneUraniumMallet");
            lavaUraniumMallet = new InfiToolMallet(PropsHelperInfiHybrids.uraniumMalletID+5, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Lava, "lavaUraniumMallet");
            blazeUraniumMallet = new InfiToolMallet(PropsHelperInfiHybrids.uraniumMalletID+6, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Blaze, "blazeUraniumMallet");
            cobaltUraniumMallet = new InfiToolMallet(PropsHelperInfiHybrids.uraniumMalletID+7, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Cobalt, "cobaltUraniumMallet");
            arditeUraniumMallet = new InfiToolMallet(PropsHelperInfiHybrids.uraniumMalletID+8, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Ardite, "arditeUraniumMallet");
            uraniumUraniumMallet = new InfiToolMallet(PropsHelperInfiHybrids.uraniumMalletID+9, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Uranium, "uraniumUraniumMallet");
            
            MinecraftForge.setToolClass(diamondUraniumMallet, "pickaxe", InfiMaterialEnum.Uranium.getHarvestLevel());
            MinecraftForge.setToolClass(redstoneUraniumMallet, "pickaxe", InfiMaterialEnum.Uranium.getHarvestLevel());
            MinecraftForge.setToolClass(boneUraniumMallet, "pickaxe", InfiMaterialEnum.Uranium.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackUraniumMallet, "pickaxe", InfiMaterialEnum.Uranium.getHarvestLevel());
            MinecraftForge.setToolClass(glowstoneUraniumMallet, "pickaxe", InfiMaterialEnum.Uranium.getHarvestLevel());
            MinecraftForge.setToolClass(lavaUraniumMallet, "pickaxe", InfiMaterialEnum.Uranium.getHarvestLevel());
            MinecraftForge.setToolClass(blazeUraniumMallet, "pickaxe", InfiMaterialEnum.Uranium.getHarvestLevel());
            MinecraftForge.setToolClass(cobaltUraniumMallet, "pickaxe", InfiMaterialEnum.Uranium.getHarvestLevel());
            MinecraftForge.setToolClass(arditeUraniumMallet, "pickaxe", InfiMaterialEnum.Uranium.getHarvestLevel());
            MinecraftForge.setToolClass(uraniumUraniumMallet, "pickaxe", InfiMaterialEnum.Uranium.getHarvestLevel());
        }
    }
    
    private static void addNames()
    {
    	if(PropsHelperInfiHybrids.enableWoodTools)
            ModLoader.addName(woodWoodMallet, "Wooden Mallet");
        if(PropsHelperInfiHybrids.enableStoneTools)
            ModLoader.addName(stoneStoneMallet, "Heavy Mallet");
        if(PropsHelperInfiHybrids.enableIronTools)
            ModLoader.addName(ironIronMallet, "Ironic Mallet");
        if(PropsHelperInfiHybrids.enableDiamondTools)
            ModLoader.addName(diamondDiamondMallet, "Diamondium Mallet");
        if(PropsHelperInfiHybrids.enableRedstoneTools)
            ModLoader.addName(redstoneRedstoneMallet, "Redredred Mallet");
        if(PropsHelperInfiHybrids.enableObsidianTools)
            ModLoader.addName(obsidianObsidianMallet, "Ebony Mallet");
        if(PropsHelperInfiHybrids.enableSandstoneTools)
            ModLoader.addName(sandstoneSandstoneMallet, "Fragile Mallet");
        if(PropsHelperInfiHybrids.enableNetherrackTools)
            ModLoader.addName(boneBoneMallet, "Necrotic Mallet");
        if(PropsHelperInfiHybrids.enablePaperTools)
            ModLoader.addName(paperPaperMallet, "Soft Mallet");
        if(PropsHelperInfiHybrids.enableMossyTools)
            ModLoader.addName(mossyMossyMallet, "Living Mallet");
        if(PropsHelperInfiHybrids.enableNetherrackTools)
            ModLoader.addName(netherrackNetherrackMallet, "Bloodsoaked Mallet");
        if(PropsHelperInfiHybrids.enableGlowstoneTools)
            ModLoader.addName(glowstoneGlowstoneMallet, "Bright Mallet");
        if(PropsHelperInfiHybrids.enableIceTools)
            ModLoader.addName(iceIceMallet, "Freezing Mallet");
        if(PropsHelperInfiHybrids.enableLavaTools)
            ModLoader.addName(lavaLavaMallet, "Burning Mallet");
        if(PropsHelperInfiHybrids.enableSlimeTools)
            ModLoader.addName(slimeSlimeMallet, "Toy Mallet");
        if(PropsHelperInfiHybrids.enableCactusTools)
            ModLoader.addName(cactusCactusMallet, "Thorned Mallet");
        if(PropsHelperInfiHybrids.enableFlintTools)
            ModLoader.addName(flintFlintMallet, "Rough-hewn Mallet");
        if(PropsHelperInfiHybrids.enableBlazeTools)
            ModLoader.addName(blazeBlazeMallet, "Netherite Mallet");
        if(PropsHelperInfiHybrids.enableCopperTools)
            ModLoader.addName(copperCopperMallet, "Orange-Tang Mallet");
        if(PropsHelperInfiHybrids.enableBronzeTools)
            ModLoader.addName(bronzeBronzeMallet, "Polished Mallet");
        if(PropsHelperInfiHybrids.enableWorkedIronTools)
            ModLoader.addName(workedWorkedIronMallet, "Reworked Iron Mallet");
        if(PropsHelperInfiHybrids.enableSteelTools)
            ModLoader.addName(steelSteelMallet, "Forge-Wrought Mallet");
        if(PropsHelperInfiHybrids.enableCobaltTools)
            ModLoader.addName(cobaltCobaltMallet, "Beautiful Mallet");
        if(PropsHelperInfiHybrids.enableArditeTools)
            ModLoader.addName(arditeArditeMallet, "Rustic Mallet");
        if(PropsHelperInfiHybrids.enableManyullynTools)
            ModLoader.addName(manyullynManyullynMallet, "False-Prophetic Mallet");
        if(PropsHelperInfiHybrids.enableUraniumTools)
            ModLoader.addName(uraniumUraniumMallet, "Cancerous Mallet");
    }
    
    public static void registerInfiToolsRecipes()
    {
    	if(PropsHelperInfiHybrids.enableWoodTools)
        {
            ModLoader.addRecipe(new ItemStack(woodWoodMallet), new Object[] 
                    { recipe, '#', Block.planks, '|', Item.stick });
            ModLoader.addRecipe(new ItemStack(sandstoneWoodMallet), new Object[] 
                    { recipe, '#', Block.planks, '|', mod_InfiBase.sandstoneRod });
            ModLoader.addRecipe(new ItemStack(boneWoodMallet), new Object[] 
                    { recipe, '#', Block.planks, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneWoodMallet), new Object[] 
                    { recipe, '#', Block.planks, '|', mod_InfiBase.boneRod });
            ModLoader.addRecipe(new ItemStack(paperWoodMallet), new Object[] 
                    { recipe, '#', Block.planks, '|', mod_InfiBase.paperRod });
            ModLoader.addRecipe(new ItemStack(iceWoodMallet), new Object[] 
                    { recipe, '#', Block.planks, '|', mod_InfiBase.iceRod });
            ModLoader.addRecipe(new ItemStack(slimeWoodMallet), new Object[] 
                    { recipe, '#', Block.planks, '|', mod_InfiBase.slimeRod });
            ModLoader.addRecipe(new ItemStack(cactusWoodMallet), new Object[] 
                    { recipe, '#', Block.planks, '|', mod_InfiBase.cactusRod });
        }
    	
        if(PropsHelperInfiHybrids.enableStoneTools)
        {
        	ModLoader.addRecipe(new ItemStack(woodStoneMallet), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', Item.stick });
        	ModLoader.addRecipe(new ItemStack(stoneStoneMallet), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', mod_InfiBase.stoneRod });
            ModLoader.addRecipe(new ItemStack(sandstoneStoneMallet), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', mod_InfiBase.sandstoneRod });
            ModLoader.addRecipe(new ItemStack(boneStoneMallet), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneStoneMallet), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', mod_InfiBase.boneRod });
            ModLoader.addRecipe(new ItemStack(netherrackStoneMallet), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', mod_InfiBase.netherrackRod });
            ModLoader.addRecipe(new ItemStack(iceStoneMallet), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', mod_InfiBase.iceRod });
            ModLoader.addRecipe(new ItemStack(slimeStoneMallet), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', mod_InfiBase.slimeRod });
            ModLoader.addRecipe(new ItemStack(cactusStoneMallet), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', mod_InfiBase.cactusRod });
            ModLoader.addRecipe(new ItemStack(flintStoneMallet), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', mod_InfiBase.flintRod });
            
            ModLoader.addRecipe(new ItemStack(woodStoneMallet), new Object[] 
                    { recipe, '#', Block.stone, '|', Item.stick });
        	ModLoader.addRecipe(new ItemStack(stoneStoneMallet), new Object[] 
                    { recipe, '#', Block.stone, '|', mod_InfiBase.stoneRod });
            ModLoader.addRecipe(new ItemStack(sandstoneStoneMallet), new Object[] 
                    { recipe, '#', Block.stone, '|', mod_InfiBase.sandstoneRod });
            ModLoader.addRecipe(new ItemStack(boneStoneMallet), new Object[] 
                    { recipe, '#', Block.stone, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneStoneMallet), new Object[] 
                    { recipe, '#', Block.stone, '|', mod_InfiBase.boneRod });
            ModLoader.addRecipe(new ItemStack(netherrackStoneMallet), new Object[] 
                    { recipe, '#', Block.stone, '|', mod_InfiBase.netherrackRod });
            ModLoader.addRecipe(new ItemStack(iceStoneMallet), new Object[] 
                    { recipe, '#', Block.stone, '|', mod_InfiBase.iceRod });
            ModLoader.addRecipe(new ItemStack(slimeStoneMallet), new Object[] 
                    { recipe, '#', Block.stone, '|', mod_InfiBase.slimeRod });
            ModLoader.addRecipe(new ItemStack(cactusStoneMallet), new Object[] 
                    { recipe, '#', Block.stone, '|', mod_InfiBase.cactusRod });
            ModLoader.addRecipe(new ItemStack(flintStoneMallet), new Object[] 
                    { recipe, '#', Block.stone, '|', mod_InfiBase.flintRod });
        }
        
        if(PropsHelperInfiHybrids.enableIronTools)
        {
        	ModLoader.addRecipe(new ItemStack(woodIronMallet), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', Item.stick });
        	ModLoader.addRecipe(new ItemStack(stoneIronMallet), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', mod_InfiBase.stoneRod });
            ModLoader.addRecipe(new ItemStack(ironIronMallet), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', mod_InfiBase.ironRod });
            ModLoader.addRecipe(new ItemStack(boneIronMallet), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneIronMallet), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', mod_InfiBase.boneRod });
            ModLoader.addRecipe(new ItemStack(netherrackIronMallet), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', mod_InfiBase.netherrackRod });
            ModLoader.addRecipe(new ItemStack(glowstoneIronMallet), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', mod_InfiBase.glowstoneRod });
            ModLoader.addRecipe(new ItemStack(cactusIronMallet), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', mod_InfiBase.cactusRod });
            ModLoader.addRecipe(new ItemStack(copperIronMallet), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', mod_InfiBase.copperRod });
            ModLoader.addRecipe(new ItemStack(bronzeIronMallet), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', mod_InfiBase.bronzeRod });
        }
        
        if(PropsHelperInfiHybrids.enableDiamondTools)
        {
        	ModLoader.addRecipe(new ItemStack(woodDiamondMallet), new Object[] 
                    { recipe, '#', Item.diamond, '|', Item.stick });
        	ModLoader.addRecipe(new ItemStack(stoneDiamondMallet), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.stoneRod });
            ModLoader.addRecipe(new ItemStack(ironDiamondMallet), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.ironRod });
            ModLoader.addRecipe(new ItemStack(diamondDiamondMallet), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.diamondRod });
            ModLoader.addRecipe(new ItemStack(redstoneDiamondMallet), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.redstoneRod });
            ModLoader.addRecipe(new ItemStack(obsidianDiamondMallet), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.obsidianRod });
            ModLoader.addRecipe(new ItemStack(boneDiamondMallet), new Object[] 
                    { recipe, '#', Item.diamond, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneDiamondMallet), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.boneRod });
            ModLoader.addRecipe(new ItemStack(mossyDiamondMallet), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.mossyRod });
            ModLoader.addRecipe(new ItemStack(netherrackDiamondMallet), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.netherrackRod });
            ModLoader.addRecipe(new ItemStack(glowstoneDiamondMallet), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.glowstoneRod });
            ModLoader.addRecipe(new ItemStack(lavaDiamondMallet), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.lavaRod });
            ModLoader.addRecipe(new ItemStack(cactusDiamondMallet), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.cactusRod });
            ModLoader.addRecipe(new ItemStack(flintDiamondMallet), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.flintRod });
            ModLoader.addRecipe(new ItemStack(blazeDiamondMallet), new Object[] 
                    { recipe, '#', Item.diamond, '|', Item.blazeRod });
            ModLoader.addRecipe(new ItemStack(copperDiamondMallet), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.copperRod });
            ModLoader.addRecipe(new ItemStack(bronzeDiamondMallet), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.bronzeRod });
            ModLoader.addRecipe(new ItemStack(workedDiamondMallet), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.workedIronRod });
            ModLoader.addRecipe(new ItemStack(steelDiamondMallet), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.steelRod });
            ModLoader.addRecipe(new ItemStack(cobaltDiamondMallet), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.cobaltRod });
            ModLoader.addRecipe(new ItemStack(arditeDiamondMallet), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.arditeRod });
            ModLoader.addRecipe(new ItemStack(manyullynDiamondMallet), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.manyullynRod });
            ModLoader.addRecipe(new ItemStack(uraniumDiamondMallet), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.uraniumRod });
        }
        
        if(PropsHelperInfiHybrids.enableRedstoneTools)
        {
        	ModLoader.addRecipe(new ItemStack(woodRedstoneMallet), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', Item.stick });
        	ModLoader.addRecipe(new ItemStack(stoneRedstoneMallet), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.stoneRod });
            ModLoader.addRecipe(new ItemStack(ironRedstoneMallet), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.ironRod });
            ModLoader.addRecipe(new ItemStack(redstoneRedstoneMallet), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.redstoneRod });
            ModLoader.addRecipe(new ItemStack(obsidianRedstoneMallet), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.obsidianRod });
            ModLoader.addRecipe(new ItemStack(sandstoneRedstoneMallet), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.sandstoneRod });
            ModLoader.addRecipe(new ItemStack(boneRedstoneMallet), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneRedstoneMallet), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.boneRod });
            ModLoader.addRecipe(new ItemStack(paperRedstoneMallet), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.paperRod });
            ModLoader.addRecipe(new ItemStack(mossyRedstoneMallet), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.mossyRod });
            ModLoader.addRecipe(new ItemStack(netherrackRedstoneMallet), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.netherrackRod });
            ModLoader.addRecipe(new ItemStack(glowstoneRedstoneMallet), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.glowstoneRod });
            ModLoader.addRecipe(new ItemStack(iceRedstoneMallet), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.iceRod });
            ModLoader.addRecipe(new ItemStack(lavaRedstoneMallet), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.lavaRod });
            ModLoader.addRecipe(new ItemStack(slimeRedstoneMallet), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.slimeRod });
            ModLoader.addRecipe(new ItemStack(cactusRedstoneMallet), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.cactusRod });
            ModLoader.addRecipe(new ItemStack(flintRedstoneMallet), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.flintRod });
            ModLoader.addRecipe(new ItemStack(copperRedstoneMallet), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.copperRod });
            ModLoader.addRecipe(new ItemStack(bronzeRedstoneMallet), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.bronzeRod });
            ModLoader.addRecipe(new ItemStack(workedRedstoneMallet), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.workedIronRod });
            ModLoader.addRecipe(new ItemStack(uraniumRedstoneMallet), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.uraniumRod });
        }
        
        if(PropsHelperInfiHybrids.enableObsidianTools)
        {
        	ModLoader.addRecipe(new ItemStack(woodObsidianMallet), new Object[] 
                    { recipe, '#', Block.obsidian, '|', Item.stick });
        	ModLoader.addRecipe(new ItemStack(stoneObsidianMallet), new Object[] 
                    { recipe, '#', Block.obsidian, '|', mod_InfiBase.stoneRod });
            ModLoader.addRecipe(new ItemStack(redstoneObsidianMallet), new Object[] 
                    { recipe, '#', Block.obsidian, '|', mod_InfiBase.redstoneRod });
            ModLoader.addRecipe(new ItemStack(obsidianObsidianMallet), new Object[] 
                    { recipe, '#', Block.obsidian, '|', mod_InfiBase.obsidianRod });
            ModLoader.addRecipe(new ItemStack(boneObsidianMallet), new Object[] 
                    { recipe, '#', Block.obsidian, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneObsidianMallet), new Object[] 
                    { recipe, '#', Block.obsidian, '|', mod_InfiBase.boneRod });
            ModLoader.addRecipe(new ItemStack(netherrackObsidianMallet), new Object[] 
                    { recipe, '#', Block.obsidian, '|', mod_InfiBase.netherrackRod });
            ModLoader.addRecipe(new ItemStack(glowstoneObsidianMallet), new Object[] 
                    { recipe, '#', Block.obsidian, '|', mod_InfiBase.glowstoneRod });
            ModLoader.addRecipe(new ItemStack(iceObsidianMallet), new Object[] 
                    { recipe, '#', Block.obsidian, '|', mod_InfiBase.iceRod });
            ModLoader.addRecipe(new ItemStack(lavaObsidianMallet), new Object[] 
                    { recipe, '#', Block.obsidian, '|', mod_InfiBase.lavaRod });
            ModLoader.addRecipe(new ItemStack(cactusObsidianMallet), new Object[] 
                    { recipe, '#', Block.obsidian, '|', mod_InfiBase.cactusRod });
        }
        
        if(PropsHelperInfiHybrids.enableSandstoneTools)
        {
            ModLoader.addRecipe(new ItemStack(woodSandstoneMallet), new Object[] 
                    { recipe, '#', Block.sandStone, '|', Item.stick });
            ModLoader.addRecipe(new ItemStack(sandstoneSandstoneMallet), new Object[] 
                    { recipe, '#', Block.sandStone, '|', mod_InfiBase.sandstoneRod });
            ModLoader.addRecipe(new ItemStack(boneSandstoneMallet), new Object[] 
                    { recipe, '#', Block.sandStone, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneSandstoneMallet), new Object[] 
                    { recipe, '#', Block.sandStone, '|', mod_InfiBase.boneRod });      
            ModLoader.addRecipe(new ItemStack(netherrackSandstoneMallet), new Object[] 
                    { recipe, '#', Block.sandStone, '|', mod_InfiBase.netherrackRod });
            ModLoader.addRecipe(new ItemStack(iceSandstoneMallet), new Object[] 
                    { recipe, '#', Block.sandStone, '|', mod_InfiBase.iceRod });
            ModLoader.addRecipe(new ItemStack(slimeSandstoneMallet), new Object[] 
                    { recipe, '#', Block.sandStone, '|', mod_InfiBase.slimeRod });
            ModLoader.addRecipe(new ItemStack(cactusSandstoneMallet), new Object[] 
                    { recipe, '#', Block.sandStone, '|', mod_InfiBase.cactusRod });
            ModLoader.addRecipe(new ItemStack(flintSandstoneMallet), new Object[] 
                    { recipe, '#', Block.sandStone, '|', mod_InfiBase.flintRod });
        }
        
        if(PropsHelperInfiHybrids.enableBoneTools)
        {
            ModLoader.addRecipe(new ItemStack(woodBoneMallet), new Object[] 
                    { recipe, '#', Item.bone, '|', Item.stick });
            ModLoader.addRecipe(new ItemStack(stoneBoneMallet), new Object[] 
                    { recipe, '#', Item.bone, '|', mod_InfiBase.stoneRod });
            ModLoader.addRecipe(new ItemStack(sandstoneBoneMallet), new Object[] 
                    { recipe, '#', Item.bone, '|', mod_InfiBase.sandstoneRod });
            ModLoader.addRecipe(new ItemStack(boneBoneMallet), new Object[] 
                    { recipe, '#', Item.bone, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneBoneMallet), new Object[] 
                    { recipe, '#', Item.bone, '|', mod_InfiBase.boneRod });
            ModLoader.addRecipe(new ItemStack(paperBoneMallet), new Object[] 
                    { recipe, '#', Item.bone, '|', mod_InfiBase.paperRod });
            ModLoader.addRecipe(new ItemStack(netherrackBoneMallet), new Object[] 
                    { recipe, '#', Item.bone, '|', mod_InfiBase.netherrackRod });
            ModLoader.addRecipe(new ItemStack(iceBoneMallet), new Object[] 
                    { recipe, '#', Item.bone, '|', mod_InfiBase.iceRod });
            ModLoader.addRecipe(new ItemStack(cactusBoneMallet), new Object[] 
                    { recipe, '#', Item.bone, '|', mod_InfiBase.cactusRod });
            ModLoader.addRecipe(new ItemStack(flintBoneMallet), new Object[] 
                    { recipe, '#', Item.bone, '|', mod_InfiBase.flintRod });
        }
        
        if(PropsHelperInfiHybrids.enablePaperTools)
        {
            ModLoader.addRecipe(new ItemStack(woodPaperMallet), new Object[] 
                    { recipe, '#', mod_InfiBase.paperStack, '|', Item.stick });
            ModLoader.addRecipe(new ItemStack(bonePaperMallet), new Object[] 
                    { recipe, '#', mod_InfiBase.paperStack, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(bonePaperMallet), new Object[] 
                    { recipe, '#', mod_InfiBase.paperStack, '|', mod_InfiBase.boneRod });
            ModLoader.addRecipe(new ItemStack(paperPaperMallet), new Object[] 
                    { recipe, '#', mod_InfiBase.paperStack, '|', mod_InfiBase.paperRod });
            ModLoader.addRecipe(new ItemStack(slimePaperMallet), new Object[] 
                    { recipe, '#', mod_InfiBase.paperStack, '|', mod_InfiBase.slimeRod });
            ModLoader.addRecipe(new ItemStack(cactusPaperMallet), new Object[] 
                    { recipe, '#', mod_InfiBase.paperStack, '|', mod_InfiBase.cactusRod });
        }
        
        if(PropsHelperInfiHybrids.enableMossyTools)
        {
        	ModLoader.addRecipe(new ItemStack(woodMossyMallet), new Object[] 
                    { recipe, '#', mod_InfiBase.mossyStone, '|', Item.stick });
        	ModLoader.addRecipe(new ItemStack(stoneMossyMallet), new Object[] 
                    { recipe, '#', mod_InfiBase.mossyStone, '|', mod_InfiBase.stoneRod });
            ModLoader.addRecipe(new ItemStack(diamondMossyMallet), new Object[] 
                    { recipe, '#', mod_InfiBase.mossyStone, '|', mod_InfiBase.diamondRod });
            ModLoader.addRecipe(new ItemStack(redstoneMossyMallet), new Object[] 
                    { recipe, '#', mod_InfiBase.mossyStone, '|', mod_InfiBase.redstoneRod });
            ModLoader.addRecipe(new ItemStack(boneMossyMallet), new Object[] 
                    { recipe, '#', mod_InfiBase.mossyStone, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneMossyMallet), new Object[] 
                    { recipe, '#', mod_InfiBase.mossyStone, '|', mod_InfiBase.boneRod });
            ModLoader.addRecipe(new ItemStack(mossyMossyMallet), new Object[] 
                    { recipe, '#', mod_InfiBase.mossyStone, '|', mod_InfiBase.mossyRod });
            ModLoader.addRecipe(new ItemStack(netherrackMossyMallet), new Object[] 
                    { recipe, '#', mod_InfiBase.mossyStone, '|', mod_InfiBase.netherrackRod });
            ModLoader.addRecipe(new ItemStack(glowstoneMossyMallet), new Object[] 
                    { recipe, '#', mod_InfiBase.mossyStone, '|', mod_InfiBase.glowstoneRod });
            ModLoader.addRecipe(new ItemStack(cactusMossyMallet), new Object[] 
                    { recipe, '#', mod_InfiBase.mossyStone, '|', mod_InfiBase.cactusRod });
            ModLoader.addRecipe(new ItemStack(blazeMossyMallet), new Object[] 
                    { recipe, '#', mod_InfiBase.mossyStone, '|', Item.blazeRod });
            ModLoader.addRecipe(new ItemStack(manyullynMossyMallet), new Object[] 
                    { recipe, '#', mod_InfiBase.mossyStone, '|', mod_InfiBase.manyullynRod });
            ModLoader.addRecipe(new ItemStack(uraniumMossyMallet), new Object[] 
                    { recipe, '#', mod_InfiBase.mossyStone, '|', mod_InfiBase.uraniumRod });
        }
        
        if(PropsHelperInfiHybrids.enableNetherrackTools)
        {
        	ModLoader.addRecipe(new ItemStack(woodNetherrackMallet), new Object[] 
                    { recipe, '#', Block.netherrack, '|', Item.stick });
        	ModLoader.addRecipe(new ItemStack(stoneNetherrackMallet), new Object[] 
                    { recipe, '#', Block.netherrack, '|', mod_InfiBase.stoneRod });
            ModLoader.addRecipe(new ItemStack(sandstoneNetherrackMallet), new Object[] 
                    { recipe, '#', Block.netherrack, '|', mod_InfiBase.sandstoneRod });
            ModLoader.addRecipe(new ItemStack(boneNetherrackMallet), new Object[] 
                    { recipe, '#', Block.netherrack, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneNetherrackMallet), new Object[] 
                    { recipe, '#', Block.netherrack, '|', mod_InfiBase.boneRod });
            ModLoader.addRecipe(new ItemStack(paperNetherrackMallet), new Object[] 
                    { recipe, '#', Block.netherrack, '|', mod_InfiBase.paperRod });
            ModLoader.addRecipe(new ItemStack(mossyNetherrackMallet), new Object[] 
                    { recipe, '#', Block.netherrack, '|', mod_InfiBase.mossyRod });
            ModLoader.addRecipe(new ItemStack(netherrackNetherrackMallet), new Object[] 
                    { recipe, '#', Block.netherrack, '|', mod_InfiBase.netherrackRod });
            ModLoader.addRecipe(new ItemStack(iceNetherrackMallet), new Object[] 
                    { recipe, '#', Block.netherrack, '|', mod_InfiBase.iceRod });
            ModLoader.addRecipe(new ItemStack(slimeNetherrackMallet), new Object[] 
                    { recipe, '#', Block.netherrack, '|', mod_InfiBase.slimeRod });
            ModLoader.addRecipe(new ItemStack(cactusNetherrackMallet), new Object[] 
                    { recipe, '#', Block.netherrack, '|', mod_InfiBase.cactusRod });
            ModLoader.addRecipe(new ItemStack(flintNetherrackMallet), new Object[] 
                    { recipe, '#', Block.netherrack, '|', mod_InfiBase.flintRod });
            ModLoader.addRecipe(new ItemStack(copperNetherrackMallet), new Object[] 
                    { recipe, '#', Block.netherrack, '|', mod_InfiBase.copperRod });
            ModLoader.addRecipe(new ItemStack(bronzeNetherrackMallet), new Object[] 
                    { recipe, '#', Block.netherrack, '|', mod_InfiBase.bronzeRod });
        }
        
        if(PropsHelperInfiHybrids.enableGlowstoneTools)
        {
        	ModLoader.addRecipe(new ItemStack(woodGlowstoneMallet), new Object[] 
                    { recipe, '#', mod_InfiBase.glowstoneCrystal, '|', Item.stick });
        	ModLoader.addRecipe(new ItemStack(redstoneGlowstoneMallet), new Object[] 
                    { recipe, '#', mod_InfiBase.glowstoneCrystal, '|', mod_InfiBase.redstoneRod });
        	ModLoader.addRecipe(new ItemStack(obsidianGlowstoneMallet), new Object[] 
                    { recipe, '#', mod_InfiBase.glowstoneCrystal, '|', mod_InfiBase.obsidianRod });
            ModLoader.addRecipe(new ItemStack(boneGlowstoneMallet), new Object[] 
                    { recipe, '#', mod_InfiBase.glowstoneCrystal, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneGlowstoneMallet), new Object[] 
                    { recipe, '#', mod_InfiBase.glowstoneCrystal, '|', mod_InfiBase.boneRod });
            ModLoader.addRecipe(new ItemStack(netherrackGlowstoneMallet), new Object[] 
                    { recipe, '#', mod_InfiBase.glowstoneCrystal, '|', mod_InfiBase.netherrackRod });
            ModLoader.addRecipe(new ItemStack(glowstoneGlowstoneMallet), new Object[] 
                    { recipe, '#', mod_InfiBase.glowstoneCrystal, '|', mod_InfiBase.glowstoneRod });
            ModLoader.addRecipe(new ItemStack(iceGlowstoneMallet), new Object[] 
                    { recipe, '#', mod_InfiBase.glowstoneCrystal, '|', mod_InfiBase.iceRod });
            ModLoader.addRecipe(new ItemStack(slimeGlowstoneMallet), new Object[] 
                    { recipe, '#', mod_InfiBase.glowstoneCrystal, '|', mod_InfiBase.slimeRod });
            ModLoader.addRecipe(new ItemStack(cactusGlowstoneMallet), new Object[] 
                    { recipe, '#', mod_InfiBase.glowstoneCrystal, '|', mod_InfiBase.cactusRod });
        }
        
        if(PropsHelperInfiHybrids.enableIceTools)
        {
            ModLoader.addRecipe(new ItemStack(woodIceMallet), new Object[] 
                    { recipe, '#', Block.ice, '|', Item.stick });
            ModLoader.addRecipe(new ItemStack(boneIceMallet), new Object[] 
                    { recipe, '#', Block.ice, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneIceMallet), new Object[] 
                    { recipe, '#', Block.ice, '|', mod_InfiBase.boneRod });
            ModLoader.addRecipe(new ItemStack(paperIceMallet), new Object[] 
                    { recipe, '#', Block.ice, '|', mod_InfiBase.paperRod });
            ModLoader.addRecipe(new ItemStack(iceIceMallet), new Object[] 
                    { recipe, '#', Block.ice, '|', mod_InfiBase.iceRod });
            ModLoader.addRecipe(new ItemStack(slimeIceMallet), new Object[] 
                    { recipe, '#', Block.ice, '|', mod_InfiBase.slimeRod });
            ModLoader.addRecipe(new ItemStack(cactusIceMallet), new Object[] 
                    { recipe, '#', Block.ice, '|', mod_InfiBase.cactusRod });
        }
        
        if(PropsHelperInfiHybrids.enableLavaTools)
        {
            ModLoader.addRecipe(new ItemStack(diamondLavaMallet), new Object[] 
                    { recipe, '#', mod_InfiBase.lavaCrystal, '|', mod_InfiBase.diamondRod });
            ModLoader.addRecipe(new ItemStack(obsidianLavaMallet), new Object[] 
                    { recipe, '#', mod_InfiBase.lavaCrystal, '|', mod_InfiBase.obsidianRod });
            ModLoader.addRecipe(new ItemStack(netherrackLavaMallet), new Object[] 
                    { recipe, '#', mod_InfiBase.lavaCrystal, '|', mod_InfiBase.netherrackRod });
            ModLoader.addRecipe(new ItemStack(lavaLavaMallet), new Object[] 
                    { recipe, '#', mod_InfiBase.lavaCrystal, '|', mod_InfiBase.lavaRod });
            ModLoader.addRecipe(new ItemStack(flintLavaMallet), new Object[] 
                    { recipe, '#', mod_InfiBase.lavaCrystal, '|', mod_InfiBase.flintRod });
            ModLoader.addRecipe(new ItemStack(blazeLavaMallet), new Object[] 
                    { recipe, '#', mod_InfiBase.lavaCrystal, '|', Item.blazeRod });
            ModLoader.addRecipe(new ItemStack(manyullynLavaMallet), new Object[] 
                    { recipe, '#', mod_InfiBase.lavaCrystal, '|', mod_InfiBase.manyullynRod });
            ModLoader.addRecipe(new ItemStack(uraniumLavaMallet), new Object[] 
                    { recipe, '#', mod_InfiBase.lavaCrystal, '|', mod_InfiBase.uraniumRod });
        }
        
        if(PropsHelperInfiHybrids.enableSlimeTools)
        {
            ModLoader.addRecipe(new ItemStack(woodSlimeMallet), new Object[] 
                    { recipe, '#', mod_InfiBase.slimeCrystal, '|', Item.stick });
            ModLoader.addRecipe(new ItemStack(sandstoneSlimeMallet), new Object[] 
                    { recipe, '#', mod_InfiBase.slimeCrystal, '|', mod_InfiBase.sandstoneRod });
            ModLoader.addRecipe(new ItemStack(boneSlimeMallet), new Object[] 
                    { recipe, '#', mod_InfiBase.slimeCrystal, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneSlimeMallet), new Object[] 
                    { recipe, '#', mod_InfiBase.slimeCrystal, '|', mod_InfiBase.boneRod });
            ModLoader.addRecipe(new ItemStack(paperSlimeMallet), new Object[] 
                    { recipe, '#', mod_InfiBase.slimeCrystal, '|', mod_InfiBase.paperRod });
            ModLoader.addRecipe(new ItemStack(slimeSlimeMallet), new Object[] 
                    { recipe, '#', mod_InfiBase.slimeCrystal, '|', mod_InfiBase.slimeRod });
            ModLoader.addRecipe(new ItemStack(cactusSlimeMallet), new Object[] 
                    { recipe, '#', mod_InfiBase.slimeCrystal, '|', mod_InfiBase.cactusRod });
        }
        
        if(PropsHelperInfiHybrids.enableCactusTools)
        {
            ModLoader.addRecipe(new ItemStack(woodCactusMallet), new Object[] 
                    { recipe, '#', Block.cactus, '|', Item.stick });
            ModLoader.addRecipe(new ItemStack(sandstoneCactusMallet), new Object[] 
                    { recipe, '#', Block.cactus, '|', mod_InfiBase.sandstoneRod });
            ModLoader.addRecipe(new ItemStack(boneCactusMallet), new Object[] 
                    { recipe, '#', Block.cactus, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneCactusMallet), new Object[] 
                    { recipe, '#', Block.cactus, '|', mod_InfiBase.boneRod });
            ModLoader.addRecipe(new ItemStack(netherrackCactusMallet), new Object[] 
                    { recipe, '#', Block.cactus, '|', mod_InfiBase.netherrackRod });
            ModLoader.addRecipe(new ItemStack(iceCactusMallet), new Object[] 
                    { recipe, '#', Block.cactus, '|', mod_InfiBase.iceRod });
            ModLoader.addRecipe(new ItemStack(slimeCactusMallet), new Object[] 
                    { recipe, '#', Block.cactus, '|', mod_InfiBase.slimeRod });
            ModLoader.addRecipe(new ItemStack(cactusCactusMallet), new Object[] 
                    { recipe, '#', Block.cactus, '|', mod_InfiBase.cactusRod });
        }
        
        if(PropsHelperInfiHybrids.enableFlintTools)
        {
        	ModLoader.addRecipe(new ItemStack(woodFlintMallet), new Object[] 
                    { recipe, '#', Item.flint, '|', Item.stick });
        	ModLoader.addRecipe(new ItemStack(stoneFlintMallet), new Object[] 
                    { recipe, '#', Item.flint, '|', mod_InfiBase.stoneRod });
            ModLoader.addRecipe(new ItemStack(sandstoneFlintMallet), new Object[] 
                    { recipe, '#', Item.flint, '|', mod_InfiBase.sandstoneRod });
            ModLoader.addRecipe(new ItemStack(boneFlintMallet), new Object[] 
                    { recipe, '#', Item.flint, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneFlintMallet), new Object[] 
                    { recipe, '#', Item.flint, '|', mod_InfiBase.boneRod });
            ModLoader.addRecipe(new ItemStack(netherrackFlintMallet), new Object[] 
                    { recipe, '#', Item.flint, '|', mod_InfiBase.netherrackRod });
            ModLoader.addRecipe(new ItemStack(slimeFlintMallet), new Object[] 
                    { recipe, '#', Item.flint, '|', mod_InfiBase.slimeRod });
            ModLoader.addRecipe(new ItemStack(cactusFlintMallet), new Object[] 
                    { recipe, '#', Item.flint, '|', mod_InfiBase.cactusRod });
            ModLoader.addRecipe(new ItemStack(flintFlintMallet), new Object[] 
                    { recipe, '#', Item.flint, '|', mod_InfiBase.flintRod });
            ModLoader.addRecipe(new ItemStack(copperFlintMallet), new Object[] 
                    { recipe, '#', Item.flint, '|', mod_InfiBase.copperRod });
            ModLoader.addRecipe(new ItemStack(bronzeFlintMallet), new Object[] 
                    { recipe, '#', Item.flint, '|', mod_InfiBase.bronzeRod });
        }
        
        if(PropsHelperInfiHybrids.enableBlazeTools)
        {
            ModLoader.addRecipe(new ItemStack(diamondBlazeMallet), new Object[] 
                    { recipe, '#', mod_InfiBase.blazeCrystal, '|', mod_InfiBase.diamondRod });
            ModLoader.addRecipe(new ItemStack(obsidianBlazeMallet), new Object[] 
                    { recipe, '#', mod_InfiBase.blazeCrystal, '|', mod_InfiBase.obsidianRod });
            ModLoader.addRecipe(new ItemStack(netherrackBlazeMallet), new Object[] 
                    { recipe, '#', mod_InfiBase.blazeCrystal, '|', mod_InfiBase.netherrackRod });
            ModLoader.addRecipe(new ItemStack(lavaBlazeMallet), new Object[] 
                    { recipe, '#', mod_InfiBase.blazeCrystal, '|', mod_InfiBase.lavaRod });
            ModLoader.addRecipe(new ItemStack(flintBlazeMallet), new Object[] 
                    { recipe, '#', mod_InfiBase.blazeCrystal, '|', mod_InfiBase.flintRod });
            ModLoader.addRecipe(new ItemStack(blazeBlazeMallet), new Object[] 
                    { recipe, '#', mod_InfiBase.blazeCrystal, '|', Item.blazeRod });
            ModLoader.addRecipe(new ItemStack(manyullynBlazeMallet), new Object[] 
                    { recipe, '#', mod_InfiBase.blazeCrystal, '|', mod_InfiBase.manyullynRod });
            ModLoader.addRecipe(new ItemStack(uraniumBlazeMallet), new Object[] 
                    { recipe, '#', mod_InfiBase.blazeCrystal, '|', mod_InfiBase.uraniumRod });
        }
    }
    
    public static void addStoneTools(ItemStack stack)
    {
    	ModLoader.addRecipe(new ItemStack(woodStoneMallet), new Object[] 
                { recipe, '#', stack, '|', Item.stick });
    	ModLoader.addRecipe(new ItemStack(stoneStoneMallet), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.stoneRod });
        ModLoader.addRecipe(new ItemStack(sandstoneStoneMallet), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.sandstoneRod });
        ModLoader.addRecipe(new ItemStack(boneStoneMallet), new Object[] 
                { recipe, '#', stack, '|', Item.bone });
        ModLoader.addRecipe(new ItemStack(boneStoneMallet), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.boneRod });
        ModLoader.addRecipe(new ItemStack(netherrackStoneMallet), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.netherrackRod });
        ModLoader.addRecipe(new ItemStack(iceStoneMallet), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.iceRod });
        ModLoader.addRecipe(new ItemStack(slimeStoneMallet), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.slimeRod });
        ModLoader.addRecipe(new ItemStack(cactusStoneMallet), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.cactusRod });
        ModLoader.addRecipe(new ItemStack(flintStoneMallet), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.flintRod });
    }
    
    public static void addCopperTools(ItemStack stack)
    {
    	ModLoader.addRecipe(new ItemStack(woodCopperMallet), new Object[] 
                { recipe, '#', stack, '|', Item.stick });
        ModLoader.addRecipe(new ItemStack(stoneCopperMallet), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.stoneRod });
        ModLoader.addRecipe(new ItemStack(boneCopperMallet), new Object[] 
                { recipe, '#', stack, '|', Item.bone });
        ModLoader.addRecipe(new ItemStack(boneCopperMallet), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.boneRod });
        ModLoader.addRecipe(new ItemStack(netherrackCopperMallet), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.netherrackRod });
        ModLoader.addRecipe(new ItemStack(slimeCopperMallet), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.slimeRod });
        ModLoader.addRecipe(new ItemStack(cactusCopperMallet), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.cactusRod });
        ModLoader.addRecipe(new ItemStack(flintCopperMallet), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.flintRod });
        ModLoader.addRecipe(new ItemStack(copperCopperMallet), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.copperRod });
    }
    
    public static void addBronzeTools(ItemStack stack)
    {
    	ModLoader.addRecipe(new ItemStack(woodBronzeMallet), new Object[] 
                { recipe, '#', stack, '|', Item.stick });
        ModLoader.addRecipe(new ItemStack(stoneBronzeMallet), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.stoneRod });
        ModLoader.addRecipe(new ItemStack(boneBronzeMallet), new Object[] 
                { recipe, '#', stack, '|', Item.bone });
        ModLoader.addRecipe(new ItemStack(boneBronzeMallet), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.boneRod });
        ModLoader.addRecipe(new ItemStack(netherrackBronzeMallet), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.netherrackRod });
        ModLoader.addRecipe(new ItemStack(slimeBronzeMallet), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.slimeRod });
        ModLoader.addRecipe(new ItemStack(cactusBronzeMallet), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.cactusRod });
        ModLoader.addRecipe(new ItemStack(flintBronzeMallet), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.flintRod });
        ModLoader.addRecipe(new ItemStack(copperBronzeMallet), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.copperRod });
        ModLoader.addRecipe(new ItemStack(bronzeBronzeMallet), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.bronzeRod });
    }
    
    public static void addWorkedIronTools(ItemStack stack)
    {
    	ModLoader.addRecipe(new ItemStack(woodWorkedIronMallet), new Object[] 
                { recipe, '#', stack, '|', Item.stick });
        ModLoader.addRecipe(new ItemStack(stoneWorkedIronMallet), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.stoneRod });
        ModLoader.addRecipe(new ItemStack(ironWorkedIronMallet), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.ironRod });
        ModLoader.addRecipe(new ItemStack(diamondWorkedIronMallet), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.diamondRod });
        ModLoader.addRecipe(new ItemStack(redstoneWorkedIronMallet), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.redstoneRod });
        ModLoader.addRecipe(new ItemStack(obsidianWorkedIronMallet), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.obsidianRod });
        ModLoader.addRecipe(new ItemStack(boneWorkedIronMallet), new Object[] 
                { recipe, '#', stack, '|', Item.bone });
        ModLoader.addRecipe(new ItemStack(boneWorkedIronMallet), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.boneRod });
        ModLoader.addRecipe(new ItemStack(netherrackWorkedIronMallet), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.netherrackRod });
        ModLoader.addRecipe(new ItemStack(glowstoneWorkedIronMallet), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.glowstoneRod });
        ModLoader.addRecipe(new ItemStack(iceWorkedIronMallet), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.iceRod });
        ModLoader.addRecipe(new ItemStack(slimeWorkedIronMallet), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.slimeRod });
        ModLoader.addRecipe(new ItemStack(cactusWorkedIronMallet), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.cactusRod });
        ModLoader.addRecipe(new ItemStack(blazeWorkedIronMallet), new Object[] 
                { recipe, '#', stack, '|', Item.blazeRod });
        ModLoader.addRecipe(new ItemStack(copperWorkedIronMallet), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.copperRod });
        ModLoader.addRecipe(new ItemStack(bronzeWorkedIronMallet), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.bronzeRod });
        ModLoader.addRecipe(new ItemStack(workedWorkedIronMallet), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.workedIronRod });
        ModLoader.addRecipe(new ItemStack(steelWorkedIronMallet), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.steelRod });
        ModLoader.addRecipe(new ItemStack(uraniumWorkedIronMallet), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.uraniumRod });
    }
    
    public static void addSteelTools(ItemStack stack)
    {
    	ModLoader.addRecipe(new ItemStack(woodSteelMallet), new Object[] 
                { recipe, '#', stack, '|', Item.stick });
        ModLoader.addRecipe(new ItemStack(stoneSteelMallet), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.stoneRod });
        ModLoader.addRecipe(new ItemStack(ironSteelMallet), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.ironRod });
        ModLoader.addRecipe(new ItemStack(diamondSteelMallet), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.diamondRod });
        ModLoader.addRecipe(new ItemStack(redstoneSteelMallet), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.redstoneRod });
        ModLoader.addRecipe(new ItemStack(obsidianSteelMallet), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.obsidianRod });
        ModLoader.addRecipe(new ItemStack(boneSteelMallet), new Object[] 
                { recipe, '#', stack, '|', Item.bone });
        ModLoader.addRecipe(new ItemStack(boneSteelMallet), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.boneRod });
        ModLoader.addRecipe(new ItemStack(netherrackSteelMallet), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.netherrackRod });
        ModLoader.addRecipe(new ItemStack(glowstoneSteelMallet), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.glowstoneRod });
        ModLoader.addRecipe(new ItemStack(iceSteelMallet), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.iceRod });
        ModLoader.addRecipe(new ItemStack(slimeSteelMallet), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.slimeRod });
        ModLoader.addRecipe(new ItemStack(cactusSteelMallet), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.cactusRod });
        ModLoader.addRecipe(new ItemStack(blazeSteelMallet), new Object[] 
                { recipe, '#', stack, '|', Item.blazeRod });
        ModLoader.addRecipe(new ItemStack(copperSteelMallet), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.copperRod });
        ModLoader.addRecipe(new ItemStack(bronzeSteelMallet), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.bronzeRod });
        ModLoader.addRecipe(new ItemStack(workedSteelMallet), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.workedIronRod });
        ModLoader.addRecipe(new ItemStack(steelSteelMallet), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.steelRod });
        ModLoader.addRecipe(new ItemStack(cobaltSteelMallet), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.cobaltRod });
        ModLoader.addRecipe(new ItemStack(arditeSteelMallet), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.arditeRod });
        ModLoader.addRecipe(new ItemStack(uraniumSteelMallet), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.uraniumRod });
    }
    
    public static void addCobaltTools(ItemStack stack)
    {
    	ModLoader.addRecipe(new ItemStack(woodCobaltMallet), new Object[] 
                { recipe, '#', stack, '|', Item.stick });
        ModLoader.addRecipe(new ItemStack(stoneCobaltMallet), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.stoneRod });
        ModLoader.addRecipe(new ItemStack(ironCobaltMallet), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.ironRod });
        ModLoader.addRecipe(new ItemStack(diamondCobaltMallet), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.diamondRod });
        ModLoader.addRecipe(new ItemStack(redstoneCobaltMallet), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.redstoneRod });
        ModLoader.addRecipe(new ItemStack(obsidianCobaltMallet), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.obsidianRod });
        ModLoader.addRecipe(new ItemStack(boneCobaltMallet), new Object[] 
                { recipe, '#', stack, '|', Item.bone });
        ModLoader.addRecipe(new ItemStack(boneCobaltMallet), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.boneRod });
        ModLoader.addRecipe(new ItemStack(slimeCobaltMallet), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.slimeRod });
        ModLoader.addRecipe(new ItemStack(cactusCobaltMallet), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.cactusRod });
        ModLoader.addRecipe(new ItemStack(blazeCobaltMallet), new Object[] 
                { recipe, '#', stack, '|', Item.blazeRod });
        ModLoader.addRecipe(new ItemStack(copperCobaltMallet), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.copperRod });
        ModLoader.addRecipe(new ItemStack(bronzeCobaltMallet), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.bronzeRod });
        ModLoader.addRecipe(new ItemStack(workedCobaltMallet), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.workedIronRod });
        ModLoader.addRecipe(new ItemStack(steelCobaltMallet), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.steelRod });
        ModLoader.addRecipe(new ItemStack(cobaltCobaltMallet), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.cobaltRod });
        ModLoader.addRecipe(new ItemStack(arditeCobaltMallet), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.arditeRod });
        ModLoader.addRecipe(new ItemStack(manyullynCobaltMallet), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.manyullynRod });
        ModLoader.addRecipe(new ItemStack(uraniumCobaltMallet), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.uraniumRod });
    }
    
    public static void addArditeTools(ItemStack stack)
    {
    	ModLoader.addRecipe(new ItemStack(woodArditeMallet), new Object[] 
                { recipe, '#', stack, '|', Item.stick });
        ModLoader.addRecipe(new ItemStack(stoneArditeMallet), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.stoneRod });
        ModLoader.addRecipe(new ItemStack(ironArditeMallet), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.ironRod });
        ModLoader.addRecipe(new ItemStack(diamondArditeMallet), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.diamondRod });
        ModLoader.addRecipe(new ItemStack(redstoneArditeMallet), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.redstoneRod });
        ModLoader.addRecipe(new ItemStack(obsidianArditeMallet), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.obsidianRod });
        ModLoader.addRecipe(new ItemStack(boneArditeMallet), new Object[] 
                { recipe, '#', stack, '|', Item.bone });
        ModLoader.addRecipe(new ItemStack(boneArditeMallet), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.boneRod });
        ModLoader.addRecipe(new ItemStack(slimeArditeMallet), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.slimeRod });
        ModLoader.addRecipe(new ItemStack(cactusArditeMallet), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.cactusRod });
        ModLoader.addRecipe(new ItemStack(blazeArditeMallet), new Object[] 
                { recipe, '#', stack, '|', Item.blazeRod });
        ModLoader.addRecipe(new ItemStack(copperArditeMallet), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.copperRod });
        ModLoader.addRecipe(new ItemStack(bronzeArditeMallet), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.bronzeRod });
        ModLoader.addRecipe(new ItemStack(workedArditeMallet), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.workedIronRod });
        ModLoader.addRecipe(new ItemStack(steelArditeMallet), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.steelRod });
        ModLoader.addRecipe(new ItemStack(cobaltArditeMallet), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.cobaltRod });
        ModLoader.addRecipe(new ItemStack(arditeArditeMallet), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.arditeRod });
        ModLoader.addRecipe(new ItemStack(manyullynArditeMallet), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.manyullynRod });
        ModLoader.addRecipe(new ItemStack(uraniumArditeMallet), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.uraniumRod });
    }
    
    public static void addManyullynTools(ItemStack stack)
    {
    	ModLoader.addRecipe(new ItemStack(woodManyullynMallet), new Object[] 
                { recipe, '#', stack, '|', Item.stick });
        ModLoader.addRecipe(new ItemStack(stoneManyullynMallet), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.stoneRod });
        ModLoader.addRecipe(new ItemStack(ironManyullynMallet), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.ironRod });
        ModLoader.addRecipe(new ItemStack(diamondManyullynMallet), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.diamondRod });
        ModLoader.addRecipe(new ItemStack(redstoneManyullynMallet), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.redstoneRod });
        ModLoader.addRecipe(new ItemStack(obsidianManyullynMallet), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.obsidianRod });
        ModLoader.addRecipe(new ItemStack(boneManyullynMallet), new Object[] 
                { recipe, '#', stack, '|', Item.bone });
        ModLoader.addRecipe(new ItemStack(boneManyullynMallet), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.boneRod });
        ModLoader.addRecipe(new ItemStack(slimeManyullynMallet), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.slimeRod });
        ModLoader.addRecipe(new ItemStack(cactusManyullynMallet), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.cactusRod });
        ModLoader.addRecipe(new ItemStack(blazeManyullynMallet), new Object[] 
                { recipe, '#', stack, '|', Item.blazeRod });
        ModLoader.addRecipe(new ItemStack(copperManyullynMallet), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.copperRod });
        ModLoader.addRecipe(new ItemStack(bronzeManyullynMallet), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.bronzeRod });
        ModLoader.addRecipe(new ItemStack(workedManyullynMallet), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.workedIronRod });
        ModLoader.addRecipe(new ItemStack(steelManyullynMallet), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.steelRod });
        ModLoader.addRecipe(new ItemStack(cobaltManyullynMallet), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.cobaltRod });
        ModLoader.addRecipe(new ItemStack(arditeManyullynMallet), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.arditeRod });
        ModLoader.addRecipe(new ItemStack(manyullynManyullynMallet), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.manyullynRod });
        ModLoader.addRecipe(new ItemStack(uraniumManyullynMallet), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.uraniumRod });
    }
    
    public static void addUraniumTools(ItemStack stack)
    {
        ModLoader.addRecipe(new ItemStack(diamondUraniumMallet), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.diamondRod });
        ModLoader.addRecipe(new ItemStack(redstoneUraniumMallet), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.redstoneRod });
        ModLoader.addRecipe(new ItemStack(boneUraniumMallet), new Object[] 
                { recipe, '#', stack, '|', Item.bone });
        ModLoader.addRecipe(new ItemStack(boneUraniumMallet), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.boneRod });
        ModLoader.addRecipe(new ItemStack(netherrackUraniumMallet), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.netherrackRod });
        ModLoader.addRecipe(new ItemStack(glowstoneUraniumMallet), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.glowstoneRod });
        ModLoader.addRecipe(new ItemStack(lavaUraniumMallet), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.lavaRod });
        ModLoader.addRecipe(new ItemStack(blazeUraniumMallet), new Object[] 
                { recipe, '#', stack, '|', Item.blazeRod });
        ModLoader.addRecipe(new ItemStack(cobaltUraniumMallet), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.cobaltRod });
        ModLoader.addRecipe(new ItemStack(arditeUraniumMallet), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.arditeRod });
        ModLoader.addRecipe(new ItemStack(uraniumUraniumMallet), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.uraniumRod });
    }
    
	public static Item woodWoodMallet;
	public static Item sandstoneWoodMallet;
	public static Item boneWoodMallet;
	public static Item paperWoodMallet;
	public static Item iceWoodMallet;
	public static Item slimeWoodMallet;
	public static Item cactusWoodMallet;
	
	public static Item woodStoneMallet;
	public static Item stoneStoneMallet;
	public static Item sandstoneStoneMallet;
	public static Item boneStoneMallet;
	public static Item netherrackStoneMallet;
	public static Item iceStoneMallet;
	public static Item slimeStoneMallet;
	public static Item cactusStoneMallet;
	public static Item flintStoneMallet;
	
	public static Item woodIronMallet;
	public static Item stoneIronMallet;
	public static Item ironIronMallet;
	public static Item boneIronMallet;
	public static Item netherrackIronMallet;
	public static Item glowstoneIronMallet;
	public static Item cactusIronMallet;
	public static Item copperIronMallet;
	public static Item bronzeIronMallet;
	
	public static Item woodDiamondMallet;
	public static Item stoneDiamondMallet;
	public static Item ironDiamondMallet;
	public static Item diamondDiamondMallet;
	public static Item redstoneDiamondMallet;
	public static Item obsidianDiamondMallet;
	public static Item boneDiamondMallet;
	public static Item mossyDiamondMallet;
	public static Item netherrackDiamondMallet;
	public static Item glowstoneDiamondMallet;
	public static Item lavaDiamondMallet;
	public static Item cactusDiamondMallet;
	public static Item flintDiamondMallet;
	public static Item blazeDiamondMallet;
	public static Item copperDiamondMallet;
	public static Item bronzeDiamondMallet;
	public static Item workedDiamondMallet;
	public static Item steelDiamondMallet;
	public static Item cobaltDiamondMallet;
	public static Item arditeDiamondMallet;
	public static Item manyullynDiamondMallet;
	public static Item uraniumDiamondMallet;
	
	public static Item woodRedstoneMallet;
	public static Item stoneRedstoneMallet;
	public static Item ironRedstoneMallet;
	public static Item redstoneRedstoneMallet;
	public static Item obsidianRedstoneMallet;
	public static Item sandstoneRedstoneMallet;
	public static Item boneRedstoneMallet;
	public static Item paperRedstoneMallet;
	public static Item mossyRedstoneMallet;
	public static Item netherrackRedstoneMallet;
	public static Item glowstoneRedstoneMallet;
	public static Item iceRedstoneMallet;
	public static Item lavaRedstoneMallet;
	public static Item slimeRedstoneMallet;
	public static Item cactusRedstoneMallet;
	public static Item flintRedstoneMallet;
	public static Item copperRedstoneMallet;
	public static Item bronzeRedstoneMallet;
	public static Item workedRedstoneMallet;
	public static Item uraniumRedstoneMallet;
	
	public static Item woodObsidianMallet;
	public static Item stoneObsidianMallet;
	public static Item redstoneObsidianMallet;
	public static Item obsidianObsidianMallet;
	public static Item boneObsidianMallet;
	public static Item netherrackObsidianMallet;
	public static Item glowstoneObsidianMallet;
	public static Item iceObsidianMallet;
	public static Item lavaObsidianMallet;
	public static Item cactusObsidianMallet;
	
	public static Item woodSandstoneMallet;
	public static Item sandstoneSandstoneMallet;
	public static Item boneSandstoneMallet;
	public static Item netherrackSandstoneMallet;
	public static Item iceSandstoneMallet;
	public static Item slimeSandstoneMallet;
	public static Item cactusSandstoneMallet;
	public static Item flintSandstoneMallet;
	
	public static Item woodBoneMallet;
	public static Item stoneBoneMallet;
	public static Item sandstoneBoneMallet;
	public static Item boneBoneMallet;
	public static Item paperBoneMallet;
	public static Item netherrackBoneMallet;
	public static Item iceBoneMallet;
	public static Item cactusBoneMallet;
	public static Item flintBoneMallet;
	
	public static Item woodPaperMallet;
	public static Item bonePaperMallet;
	public static Item paperPaperMallet;
	public static Item slimePaperMallet;
	public static Item cactusPaperMallet;
	
	public static Item woodMossyMallet;
	public static Item stoneMossyMallet;
	public static Item diamondMossyMallet;
	public static Item redstoneMossyMallet;
	public static Item boneMossyMallet;
	public static Item mossyMossyMallet;
	public static Item netherrackMossyMallet;
	public static Item glowstoneMossyMallet;
	public static Item cactusMossyMallet;
	public static Item blazeMossyMallet;
	public static Item manyullynMossyMallet;
	public static Item uraniumMossyMallet;
	
	public static Item woodNetherrackMallet;
	public static Item stoneNetherrackMallet;
	public static Item sandstoneNetherrackMallet;
	public static Item boneNetherrackMallet;
	public static Item paperNetherrackMallet;
	public static Item mossyNetherrackMallet;
	public static Item netherrackNetherrackMallet;
	public static Item iceNetherrackMallet;
	public static Item slimeNetherrackMallet;
	public static Item cactusNetherrackMallet;
	public static Item flintNetherrackMallet;
	public static Item copperNetherrackMallet;
	public static Item bronzeNetherrackMallet;
	
	public static Item woodGlowstoneMallet;
	public static Item redstoneGlowstoneMallet;
	public static Item obsidianGlowstoneMallet;
	public static Item boneGlowstoneMallet;
	public static Item netherrackGlowstoneMallet;
	public static Item glowstoneGlowstoneMallet;
	public static Item iceGlowstoneMallet;
	public static Item slimeGlowstoneMallet;
	public static Item cactusGlowstoneMallet;
	
	public static Item woodIceMallet;
	public static Item boneIceMallet;
	public static Item paperIceMallet;
	public static Item iceIceMallet;
	public static Item slimeIceMallet;
	public static Item cactusIceMallet;
	
	public static Item diamondLavaMallet;
	public static Item obsidianLavaMallet;
	public static Item netherrackLavaMallet;
	public static Item lavaLavaMallet;
	public static Item flintLavaMallet;
	public static Item blazeLavaMallet;
	public static Item manyullynLavaMallet;
	public static Item uraniumLavaMallet;
	
	public static Item woodSlimeMallet;
	public static Item sandstoneSlimeMallet;
	public static Item boneSlimeMallet;
	public static Item paperSlimeMallet;
	public static Item slimeSlimeMallet;
	public static Item cactusSlimeMallet;
	
	public static Item woodCactusMallet;
	public static Item sandstoneCactusMallet;
	public static Item boneCactusMallet;
	public static Item netherrackCactusMallet;
	public static Item iceCactusMallet;
	public static Item slimeCactusMallet;
	public static Item cactusCactusMallet;
	
	public static Item woodFlintMallet;
	public static Item stoneFlintMallet;
	public static Item sandstoneFlintMallet;
	public static Item boneFlintMallet;
	public static Item netherrackFlintMallet;
	public static Item slimeFlintMallet;
	public static Item cactusFlintMallet;
	public static Item flintFlintMallet;
	public static Item copperFlintMallet;
	public static Item bronzeFlintMallet;
	
	public static Item diamondBlazeMallet;
	public static Item obsidianBlazeMallet;
	public static Item netherrackBlazeMallet;
	public static Item lavaBlazeMallet;
	public static Item flintBlazeMallet;
	public static Item blazeBlazeMallet;
	public static Item manyullynBlazeMallet;
	public static Item uraniumBlazeMallet;
	
	public static Item woodCopperMallet;
	public static Item stoneCopperMallet;
    public static Item boneCopperMallet;
    public static Item netherrackCopperMallet;
    public static Item slimeCopperMallet;
    public static Item cactusCopperMallet;
    public static Item flintCopperMallet;
    public static Item copperCopperMallet;
    
    public static Item woodBronzeMallet;
    public static Item stoneBronzeMallet;
    public static Item boneBronzeMallet;
    public static Item netherrackBronzeMallet;
    public static Item slimeBronzeMallet;
    public static Item cactusBronzeMallet;
    public static Item flintBronzeMallet;
    public static Item copperBronzeMallet;
    public static Item bronzeBronzeMallet;
    
    public static Item woodWorkedIronMallet;
    public static Item stoneWorkedIronMallet;
    public static Item ironWorkedIronMallet;
    public static Item diamondWorkedIronMallet;
    public static Item redstoneWorkedIronMallet;
    public static Item obsidianWorkedIronMallet;
    public static Item boneWorkedIronMallet;
    public static Item netherrackWorkedIronMallet;
    public static Item glowstoneWorkedIronMallet;
    public static Item iceWorkedIronMallet;
    public static Item slimeWorkedIronMallet;
    public static Item cactusWorkedIronMallet;
    public static Item blazeWorkedIronMallet;
    public static Item copperWorkedIronMallet;
    public static Item bronzeWorkedIronMallet;
    public static Item workedWorkedIronMallet;
    public static Item steelWorkedIronMallet;
    public static Item uraniumWorkedIronMallet;
    
    public static Item woodSteelMallet;
    public static Item stoneSteelMallet;
    public static Item ironSteelMallet;
    public static Item diamondSteelMallet;
    public static Item redstoneSteelMallet;
    public static Item obsidianSteelMallet;
    public static Item boneSteelMallet;
    public static Item netherrackSteelMallet;
    public static Item glowstoneSteelMallet;
    public static Item iceSteelMallet;
    public static Item slimeSteelMallet;
    public static Item cactusSteelMallet;
    public static Item blazeSteelMallet;
    public static Item copperSteelMallet;
    public static Item bronzeSteelMallet;
    public static Item workedSteelMallet;
    public static Item steelSteelMallet;
    public static Item cobaltSteelMallet;
    public static Item arditeSteelMallet;
    public static Item uraniumSteelMallet;
    
    public static Item woodCobaltMallet;
    public static Item stoneCobaltMallet;
    public static Item ironCobaltMallet;
    public static Item diamondCobaltMallet;
    public static Item redstoneCobaltMallet;
    public static Item obsidianCobaltMallet;
    public static Item boneCobaltMallet;
    public static Item slimeCobaltMallet;
    public static Item cactusCobaltMallet;
    public static Item blazeCobaltMallet;
    public static Item copperCobaltMallet;
    public static Item bronzeCobaltMallet;
    public static Item workedCobaltMallet;
    public static Item steelCobaltMallet;
    public static Item cobaltCobaltMallet;
    public static Item arditeCobaltMallet;
    public static Item manyullynCobaltMallet;
    public static Item uraniumCobaltMallet;
    
    public static Item woodArditeMallet;
    public static Item stoneArditeMallet;
    public static Item ironArditeMallet;
    public static Item diamondArditeMallet;
    public static Item redstoneArditeMallet;
    public static Item obsidianArditeMallet;
    public static Item boneArditeMallet;
    public static Item slimeArditeMallet;
    public static Item cactusArditeMallet;
    public static Item blazeArditeMallet;
    public static Item copperArditeMallet;
    public static Item bronzeArditeMallet;
    public static Item workedArditeMallet;
    public static Item steelArditeMallet;
    public static Item cobaltArditeMallet;
    public static Item arditeArditeMallet;
    public static Item manyullynArditeMallet;
    public static Item uraniumArditeMallet;
    
    public static Item woodManyullynMallet;
    public static Item stoneManyullynMallet;
    public static Item ironManyullynMallet;
    public static Item diamondManyullynMallet;
    public static Item redstoneManyullynMallet;
    public static Item obsidianManyullynMallet;
    public static Item boneManyullynMallet;
    public static Item slimeManyullynMallet;
    public static Item cactusManyullynMallet;
    public static Item blazeManyullynMallet;
    public static Item copperManyullynMallet;
    public static Item bronzeManyullynMallet;
    public static Item workedManyullynMallet;
    public static Item steelManyullynMallet;
    public static Item cobaltManyullynMallet;
    public static Item arditeManyullynMallet;
    public static Item manyullynManyullynMallet;
    public static Item uraniumManyullynMallet;
    
    public static Item diamondUraniumMallet;
    public static Item redstoneUraniumMallet;
    public static Item boneUraniumMallet;
    public static Item netherrackUraniumMallet;
    public static Item glowstoneUraniumMallet;
    public static Item lavaUraniumMallet;
    public static Item blazeUraniumMallet;
    public static Item cobaltUraniumMallet;
    public static Item arditeUraniumMallet;
    public static Item uraniumUraniumMallet;
}
