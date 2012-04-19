package net.minecraft.src.infi2x2;
import net.minecraft.src.Block;
import net.minecraft.src.InfiMaterialEnum;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;
import net.minecraft.src.ModLoader;
import net.minecraft.src.mod_Infi2x2;
import net.minecraft.src.mod_InfiBase;
import net.minecraft.src.forge.MinecraftForge;

public class Trowels 
{
    public static Trowels instance = new Trowels();
    
    private static String[] recipe = { "#", "|" };
    
    public static Trowels getInstance()
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
    	woodWoodTrowel = new InfiToolTrowel(PropsHelperInfi2x2.woodTrowelID+0, 
                InfiMaterialEnum.Wood, InfiMaterialEnum.Wood, "woodWoodTrowel");
    	woodStoneTrowel = new InfiToolTrowel(PropsHelperInfi2x2.stoneTrowelID+0, 
                InfiMaterialEnum.Stone, InfiMaterialEnum.Wood, "woodStoneTrowel");
    	woodIronTrowel = new InfiToolTrowel(PropsHelperInfi2x2.ironTrowelID+0, 
                InfiMaterialEnum.Iron, InfiMaterialEnum.Wood, "woodIronTrowel");
    	woodDiamondTrowel = new InfiToolTrowel(PropsHelperInfi2x2.diamondTrowelID+0, 
                InfiMaterialEnum.Diamond, InfiMaterialEnum.Wood, "woodDiamondTrowel");
    }
    
    private static void registerVanillaRecipes()
    {
    	ModLoader.addRecipe(new ItemStack(woodWoodTrowel), new Object[] 
                { recipe, '#', Block.planks, '|', Item.stick, });
		ModLoader.addRecipe(new ItemStack(woodStoneTrowel), new Object[] 
                { recipe, '#', Block.cobblestone, '|', Item.stick, });
		ModLoader.addRecipe(new ItemStack(woodIronTrowel), new Object[] 
                { recipe, '#', Item.ingotIron, '|', Item.stick, });
		ModLoader.addRecipe(new ItemStack(woodDiamondTrowel), new Object[] 
                { recipe, '#', Item.diamond, '|', Item.stick, });
		
		MinecraftForge.setToolClass(woodWoodTrowel, "shovel", InfiMaterialEnum.Wood.getHarvestLevel());
    	MinecraftForge.setToolClass(woodStoneTrowel, "shovel", InfiMaterialEnum.Stone.getHarvestLevel());
    	MinecraftForge.setToolClass(woodIronTrowel, "shovel", InfiMaterialEnum.Iron.getHarvestLevel());
    	MinecraftForge.setToolClass(woodDiamondTrowel, "shovel", InfiMaterialEnum.Diamond.getHarvestLevel());
    }
    
    private static void createTools()
    {
    	if(PropsHelperInfi2x2.enableWoodTools)
    	{
    		woodWoodTrowel = new InfiToolTrowel(PropsHelperInfi2x2.woodTrowelID+0, 
                    InfiMaterialEnum.Wood, InfiMaterialEnum.Wood, "woodWoodTrowel");
    		sandstoneWoodTrowel = new InfiToolTrowel(PropsHelperInfi2x2.woodTrowelID+1, 
                    InfiMaterialEnum.Wood, InfiMaterialEnum.Sandstone, "sandstoneWoodTrowel");
    		boneWoodTrowel = new InfiToolTrowel(PropsHelperInfi2x2.woodTrowelID+2, 
                    InfiMaterialEnum.Wood, InfiMaterialEnum.Bone, "boneWoodTrowel");
    		paperWoodTrowel = new InfiToolTrowel(PropsHelperInfi2x2.woodTrowelID+3, 
                    InfiMaterialEnum.Wood, InfiMaterialEnum.Paper, "paperWoodTrowel");
    		iceWoodTrowel = new InfiToolTrowel(PropsHelperInfi2x2.woodTrowelID+4, 
                    InfiMaterialEnum.Wood, InfiMaterialEnum.Ice, "iceWoodTrowel");
    		slimeWoodTrowel = new InfiToolTrowel(PropsHelperInfi2x2.woodTrowelID+5, 
                    InfiMaterialEnum.Wood, InfiMaterialEnum.Slime, "slimeWoodTrowel");
    		cactusWoodTrowel = new InfiToolTrowel(PropsHelperInfi2x2.woodTrowelID+6, 
                    InfiMaterialEnum.Wood, InfiMaterialEnum.Cactus, "cactusWoodTrowel");
    		
    		MinecraftForge.setToolClass(woodWoodTrowel, "shovel", InfiMaterialEnum.Wood.getHarvestLevel());
    		MinecraftForge.setToolClass(sandstoneWoodTrowel, "shovel", InfiMaterialEnum.Wood.getHarvestLevel());
    		MinecraftForge.setToolClass(boneWoodTrowel, "shovel", InfiMaterialEnum.Wood.getHarvestLevel());
    		MinecraftForge.setToolClass(paperWoodTrowel, "shovel", InfiMaterialEnum.Wood.getHarvestLevel());
    		MinecraftForge.setToolClass(iceWoodTrowel, "shovel", InfiMaterialEnum.Wood.getHarvestLevel());
    		MinecraftForge.setToolClass(slimeWoodTrowel, "shovel", InfiMaterialEnum.Wood.getHarvestLevel());
    		MinecraftForge.setToolClass(cactusWoodTrowel, "shovel", InfiMaterialEnum.Wood.getHarvestLevel());
    	}

        if(PropsHelperInfi2x2.enableStoneTools)
        {
        	woodStoneTrowel = new InfiToolTrowel(PropsHelperInfi2x2.stoneTrowelID+0, 
                    InfiMaterialEnum.Stone, InfiMaterialEnum.Wood, "woodStoneTrowel");
        	stoneStoneTrowel = new InfiToolTrowel(PropsHelperInfi2x2.stoneTrowelID+1, 
                    InfiMaterialEnum.Stone, InfiMaterialEnum.Stone, "stoneStoneTrowel");
        	sandstoneStoneTrowel = new InfiToolTrowel(PropsHelperInfi2x2.stoneTrowelID+2, 
                    InfiMaterialEnum.Stone, InfiMaterialEnum.Sandstone, "sandstoneStoneTrowel");
        	boneStoneTrowel = new InfiToolTrowel(PropsHelperInfi2x2.stoneTrowelID+3, 
                    InfiMaterialEnum.Stone, InfiMaterialEnum.Bone, "boneStoneTrowel");
        	netherrackStoneTrowel = new InfiToolTrowel(PropsHelperInfi2x2.stoneTrowelID+4, 
                    InfiMaterialEnum.Stone, InfiMaterialEnum.Netherrack, "netherrackStoneTrowel");
        	iceStoneTrowel = new InfiToolTrowel(PropsHelperInfi2x2.stoneTrowelID+5, 
                    InfiMaterialEnum.Stone, InfiMaterialEnum.Ice, "iceStoneTrowel");
        	slimeStoneTrowel = new InfiToolTrowel(PropsHelperInfi2x2.stoneTrowelID+6, 
                    InfiMaterialEnum.Stone, InfiMaterialEnum.Slime, "slimeStoneTrowel");
        	cactusStoneTrowel = new InfiToolTrowel(PropsHelperInfi2x2.stoneTrowelID+7, 
                    InfiMaterialEnum.Stone, InfiMaterialEnum.Cactus, "cactusStoneTrowel");
        	flintStoneTrowel = new InfiToolTrowel(PropsHelperInfi2x2.stoneTrowelID+8, 
                    InfiMaterialEnum.Stone, InfiMaterialEnum.Flint, "flintStoneTrowel");
            
            MinecraftForge.setToolClass(woodStoneTrowel, "shovel", InfiMaterialEnum.Stone.getHarvestLevel());
            MinecraftForge.setToolClass(stoneStoneTrowel, "shovel", InfiMaterialEnum.Stone.getHarvestLevel());
            MinecraftForge.setToolClass(sandstoneStoneTrowel, "shovel", InfiMaterialEnum.Stone.getHarvestLevel());
            MinecraftForge.setToolClass(boneStoneTrowel, "shovel", InfiMaterialEnum.Stone.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackStoneTrowel, "shovel", InfiMaterialEnum.Stone.getHarvestLevel());
            MinecraftForge.setToolClass(iceStoneTrowel, "shovel", InfiMaterialEnum.Stone.getHarvestLevel());
            MinecraftForge.setToolClass(slimeStoneTrowel, "shovel", InfiMaterialEnum.Stone.getHarvestLevel());
            MinecraftForge.setToolClass(cactusStoneTrowel, "shovel", InfiMaterialEnum.Stone.getHarvestLevel());
            MinecraftForge.setToolClass(flintStoneTrowel, "shovel", InfiMaterialEnum.Stone.getHarvestLevel());
        }
        
        if(PropsHelperInfi2x2.enableIronTools)
        {
        	woodIronTrowel = new InfiToolTrowel(PropsHelperInfi2x2.ironTrowelID+0, 
                    InfiMaterialEnum.Iron, InfiMaterialEnum.Wood, "woodIronTrowel");
        	stoneIronTrowel = new InfiToolTrowel(PropsHelperInfi2x2.ironTrowelID+1, 
                    InfiMaterialEnum.Iron, InfiMaterialEnum.Stone, "stoneIronTrowel");
        	ironIronTrowel = new InfiToolTrowel(PropsHelperInfi2x2.ironTrowelID+2, 
                    InfiMaterialEnum.Iron, InfiMaterialEnum.Iron, "ironIronTrowel");
        	boneIronTrowel = new InfiToolTrowel(PropsHelperInfi2x2.ironTrowelID+3, 
                    InfiMaterialEnum.Iron, InfiMaterialEnum.Bone, "boneIronTrowel");
        	netherrackIronTrowel = new InfiToolTrowel(PropsHelperInfi2x2.ironTrowelID+4, 
                    InfiMaterialEnum.Iron, InfiMaterialEnum.Netherrack, "netherrackIronTrowel");
        	glowstoneIronTrowel = new InfiToolTrowel(PropsHelperInfi2x2.ironTrowelID+5, 
                    InfiMaterialEnum.Iron, InfiMaterialEnum.Glowstone, "glowstoneIronTrowel");
        	cactusIronTrowel = new InfiToolTrowel(PropsHelperInfi2x2.ironTrowelID+6, 
                    InfiMaterialEnum.Iron, InfiMaterialEnum.Cactus, "cactusIronTrowel");
        	copperIronTrowel = new InfiToolTrowel(PropsHelperInfi2x2.ironTrowelID+7, 
                    InfiMaterialEnum.Iron, InfiMaterialEnum.Copper, "copperIronTrowel");
        	bronzeIronTrowel = new InfiToolTrowel(PropsHelperInfi2x2.ironTrowelID+8, 
                    InfiMaterialEnum.Iron, InfiMaterialEnum.Bronze, "bronzeIronTrowel");
            
            MinecraftForge.setToolClass(woodIronTrowel, "shovel", InfiMaterialEnum.Iron.getHarvestLevel());
            MinecraftForge.setToolClass(stoneIronTrowel, "shovel", InfiMaterialEnum.Iron.getHarvestLevel());
            MinecraftForge.setToolClass(ironIronTrowel, "shovel", InfiMaterialEnum.Iron.getHarvestLevel());
            MinecraftForge.setToolClass(boneIronTrowel, "shovel", InfiMaterialEnum.Iron.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackIronTrowel, "shovel", InfiMaterialEnum.Iron.getHarvestLevel());
            MinecraftForge.setToolClass(glowstoneIronTrowel, "shovel", InfiMaterialEnum.Iron.getHarvestLevel());
            MinecraftForge.setToolClass(cactusIronTrowel, "shovel", InfiMaterialEnum.Iron.getHarvestLevel());
            MinecraftForge.setToolClass(copperIronTrowel, "shovel", InfiMaterialEnum.Iron.getHarvestLevel());
            MinecraftForge.setToolClass(bronzeIronTrowel, "shovel", InfiMaterialEnum.Iron.getHarvestLevel());
        }
        
        if(PropsHelperInfi2x2.enableDiamondTools)
        {
        	woodDiamondTrowel = new InfiToolTrowel(PropsHelperInfi2x2.diamondTrowelID+0, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Wood, "woodDiamondTrowel");
        	stoneDiamondTrowel = new InfiToolTrowel(PropsHelperInfi2x2.diamondTrowelID+1, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Stone, "stoneDiamondTrowel");
        	ironDiamondTrowel = new InfiToolTrowel(PropsHelperInfi2x2.diamondTrowelID+2, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Iron, "ironDiamondTrowel");
        	diamondDiamondTrowel = new InfiToolTrowel(PropsHelperInfi2x2.diamondTrowelID+3, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Diamond, "diamondDiamondTrowel");
        	redstoneDiamondTrowel = new InfiToolTrowel(PropsHelperInfi2x2.diamondTrowelID+4, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Redstone, "redstoneDiamondTrowel");
        	obsidianDiamondTrowel = new InfiToolTrowel(PropsHelperInfi2x2.diamondTrowelID+5, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Obsidian, "obsidianDiamondTrowel");
        	boneDiamondTrowel = new InfiToolTrowel(PropsHelperInfi2x2.diamondTrowelID+6, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Bone, "boneDiamondTrowel");
        	mossyDiamondTrowel = new InfiToolTrowel(PropsHelperInfi2x2.diamondTrowelID+7, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Mossy, "mossyDiamondTrowel");
        	netherrackDiamondTrowel = new InfiToolTrowel(PropsHelperInfi2x2.diamondTrowelID+8, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Netherrack, "netherrackDiamondTrowel");
        	glowstoneDiamondTrowel = new InfiToolTrowel(PropsHelperInfi2x2.diamondTrowelID+9, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Glowstone, "glowstoneDiamondTrowel");
        	lavaDiamondTrowel = new InfiToolTrowel(PropsHelperInfi2x2.diamondTrowelID+10, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Lava, "lavaDiamondTrowel");
        	cactusDiamondTrowel = new InfiToolTrowel(PropsHelperInfi2x2.diamondTrowelID+11, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Cactus, "cactusDiamondTrowel");
        	flintDiamondTrowel = new InfiToolTrowel(PropsHelperInfi2x2.diamondTrowelID+12, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Flint, "flintDiamondTrowel");
        	blazeDiamondTrowel = new InfiToolTrowel(PropsHelperInfi2x2.diamondTrowelID+13, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Blaze, "blazeDiamondTrowel");
            copperDiamondTrowel = new InfiToolTrowel(PropsHelperInfi2x2.diamondTrowelID+14, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Copper, "copperDiamondTrowel");
            bronzeDiamondTrowel = new InfiToolTrowel(PropsHelperInfi2x2.diamondTrowelID+15, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Bronze, "bronzeDiamondTrowel");
            workedDiamondTrowel = new InfiToolTrowel(PropsHelperInfi2x2.diamondTrowelID+16, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.WorkedIron, "workedDiamondTrowel");
            steelDiamondTrowel = new InfiToolTrowel(PropsHelperInfi2x2.diamondTrowelID+17, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Steel, "steelDiamondTrowel");
            cobaltDiamondTrowel = new InfiToolTrowel(PropsHelperInfi2x2.diamondTrowelID+18, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Cobalt, "cobaltDiamondTrowel");
            arditeDiamondTrowel = new InfiToolTrowel(PropsHelperInfi2x2.diamondTrowelID+19, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Ardite, "arditeDiamondTrowel");
            manyullynDiamondTrowel = new InfiToolTrowel(PropsHelperInfi2x2.diamondTrowelID+20, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Manyullyn, "manyullynDiamondTrowel");
            uraniumDiamondTrowel = new InfiToolTrowel(PropsHelperInfi2x2.diamondTrowelID+21, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Uranium, "uraniumDiamondTrowel");
            
            MinecraftForge.setToolClass(woodDiamondTrowel, "shovel", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(stoneDiamondTrowel, "shovel", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(ironDiamondTrowel, "shovel", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(diamondDiamondTrowel, "shovel", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(redstoneDiamondTrowel, "shovel", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(obsidianDiamondTrowel, "shovel", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(boneDiamondTrowel, "shovel", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(mossyDiamondTrowel, "shovel", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackDiamondTrowel, "shovel", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(glowstoneDiamondTrowel, "shovel", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(lavaDiamondTrowel, "shovel", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(cactusDiamondTrowel, "shovel", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(flintDiamondTrowel, "shovel", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(blazeDiamondTrowel, "shovel", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(copperDiamondTrowel, "shovel", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(bronzeDiamondTrowel, "shovel", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(workedDiamondTrowel, "shovel", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(steelDiamondTrowel, "shovel", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(cobaltDiamondTrowel, "shovel", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(arditeDiamondTrowel, "shovel", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(manyullynDiamondTrowel, "shovel", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(uraniumDiamondTrowel, "shovel", InfiMaterialEnum.Diamond.getHarvestLevel());
        }
        
        if(PropsHelperInfi2x2.enableRedstoneTools)
        {
        	woodRedstoneTrowel = new InfiToolTrowel(PropsHelperInfi2x2.redstoneTrowelID+0, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Redstone, "woodRedstoneTrowel");
        	stoneRedstoneTrowel = new InfiToolTrowel(PropsHelperInfi2x2.redstoneTrowelID+1, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Stone, "stoneRedstoneTrowel");
        	ironRedstoneTrowel = new InfiToolTrowel(PropsHelperInfi2x2.redstoneTrowelID+2, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Iron, "ironRedstoneTrowel");
        	redstoneRedstoneTrowel = new InfiToolTrowel(PropsHelperInfi2x2.redstoneTrowelID+3, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Redstone, "redstoneRedstoneTrowel");
        	obsidianRedstoneTrowel = new InfiToolTrowel(PropsHelperInfi2x2.redstoneTrowelID+4, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Obsidian, "obsidianRedstoneTrowel");
        	sandstoneRedstoneTrowel = new InfiToolTrowel(PropsHelperInfi2x2.redstoneTrowelID+5, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Sandstone, "sandstoneRedstoneTrowel");
        	boneRedstoneTrowel = new InfiToolTrowel(PropsHelperInfi2x2.redstoneTrowelID+6, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Bone, "boneRedstoneTrowel");
        	paperRedstoneTrowel = new InfiToolTrowel(PropsHelperInfi2x2.redstoneTrowelID+7, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Paper, "paperRedstoneTrowel");
        	mossyRedstoneTrowel = new InfiToolTrowel(PropsHelperInfi2x2.redstoneTrowelID+8, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Mossy, "mossyRedstoneTrowel");
        	netherrackRedstoneTrowel = new InfiToolTrowel(PropsHelperInfi2x2.redstoneTrowelID+9, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Netherrack, "netherrackRedstoneTrowel");
        	glowstoneRedstoneTrowel = new InfiToolTrowel(PropsHelperInfi2x2.redstoneTrowelID+10, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Glowstone, "glowstoneRedstoneTrowel");
        	iceRedstoneTrowel = new InfiToolTrowel(PropsHelperInfi2x2.redstoneTrowelID+11, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Ice, "iceRedstoneTrowel");
        	lavaRedstoneTrowel = new InfiToolTrowel(PropsHelperInfi2x2.redstoneTrowelID+12,
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Lava, "lavaRedstoneTrowel");
        	slimeRedstoneTrowel = new InfiToolTrowel(PropsHelperInfi2x2.redstoneTrowelID+13,
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Slime, "slimeRedstoneTrowel");
        	cactusRedstoneTrowel = new InfiToolTrowel(PropsHelperInfi2x2.redstoneTrowelID+14,
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Cactus, "cactusRedstoneTrowel");
        	flintRedstoneTrowel = new InfiToolTrowel(PropsHelperInfi2x2.redstoneTrowelID+15,
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Flint, "flintRedstoneTrowel");
        	copperRedstoneTrowel = new InfiToolTrowel(PropsHelperInfi2x2.redstoneTrowelID+16,
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Copper, "copperRedstoneTrowel");
        	bronzeRedstoneTrowel = new InfiToolTrowel(PropsHelperInfi2x2.redstoneTrowelID+17,
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Bronze, "bronzeRedstoneTrowel");
        	workedRedstoneTrowel = new InfiToolTrowel(PropsHelperInfi2x2.redstoneTrowelID+18,
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.WorkedIron, "workedRedstoneTrowel");
        	uraniumRedstoneTrowel = new InfiToolTrowel(PropsHelperInfi2x2.redstoneTrowelID+19,
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Uranium, "uraniumRedstoneTrowel");
            
            MinecraftForge.setToolClass(woodRedstoneTrowel, "shovel", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(stoneRedstoneTrowel, "shovel", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(ironRedstoneTrowel, "shovel", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(redstoneRedstoneTrowel, "shovel", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(obsidianRedstoneTrowel, "shovel", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(sandstoneRedstoneTrowel, "shovel", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(boneRedstoneTrowel, "shovel", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(paperRedstoneTrowel, "shovel", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(mossyRedstoneTrowel, "shovel", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackRedstoneTrowel, "shovel", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(glowstoneRedstoneTrowel, "shovel", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(iceRedstoneTrowel, "shovel", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(lavaRedstoneTrowel, "shovel", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(slimeRedstoneTrowel, "shovel", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(cactusRedstoneTrowel, "shovel", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(flintRedstoneTrowel, "shovel", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(copperRedstoneTrowel, "shovel", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(bronzeRedstoneTrowel, "shovel", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(workedRedstoneTrowel, "shovel", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(uraniumRedstoneTrowel, "shovel", InfiMaterialEnum.Redstone.getHarvestLevel());
        }
        
        if(PropsHelperInfi2x2.enableObsidianTools)
        {
        	woodObsidianTrowel = new InfiToolTrowel(PropsHelperInfi2x2.obsidianTrowelID+0, 
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Obsidian, "woodObsidianTrowel");
        	stoneObsidianTrowel = new InfiToolTrowel(PropsHelperInfi2x2.obsidianTrowelID+1, 
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Stone, "stoneObsidianTrowel");
        	redstoneObsidianTrowel = new InfiToolTrowel(PropsHelperInfi2x2.obsidianTrowelID+2, 
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Obsidian, "redstoneObsidianTrowel");
        	obsidianObsidianTrowel = new InfiToolTrowel(PropsHelperInfi2x2.obsidianTrowelID+3, 
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Obsidian, "obsidianObsidianTrowel");;
        	boneObsidianTrowel = new InfiToolTrowel(PropsHelperInfi2x2.obsidianTrowelID+4, 
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Bone, "boneObsidianTrowel");
        	netherrackObsidianTrowel = new InfiToolTrowel(PropsHelperInfi2x2.obsidianTrowelID+5, 
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Netherrack, "netherrackObsidianTrowel");
        	glowstoneObsidianTrowel = new InfiToolTrowel(PropsHelperInfi2x2.obsidianTrowelID+6, 
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Glowstone, "glowstoneObsidianTrowel");
        	iceObsidianTrowel = new InfiToolTrowel(PropsHelperInfi2x2.obsidianTrowelID+7, 
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Ice, "iceObsidianTrowel");
        	lavaObsidianTrowel = new InfiToolTrowel(PropsHelperInfi2x2.obsidianTrowelID+8,
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Lava, "lavaObsidianTrowel");
        	cactusObsidianTrowel = new InfiToolTrowel(PropsHelperInfi2x2.obsidianTrowelID+9,
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Cactus, "cactusObsidianTrowel");
            
            MinecraftForge.setToolClass(woodObsidianTrowel, "shovel", InfiMaterialEnum.Obsidian.getHarvestLevel());
            MinecraftForge.setToolClass(stoneObsidianTrowel, "shovel", InfiMaterialEnum.Obsidian.getHarvestLevel());
            MinecraftForge.setToolClass(redstoneObsidianTrowel, "shovel", InfiMaterialEnum.Obsidian.getHarvestLevel());
            MinecraftForge.setToolClass(obsidianObsidianTrowel, "shovel", InfiMaterialEnum.Obsidian.getHarvestLevel());
            MinecraftForge.setToolClass(boneObsidianTrowel, "shovel", InfiMaterialEnum.Obsidian.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackObsidianTrowel, "shovel", InfiMaterialEnum.Obsidian.getHarvestLevel());
            MinecraftForge.setToolClass(glowstoneObsidianTrowel, "shovel", InfiMaterialEnum.Obsidian.getHarvestLevel());
            MinecraftForge.setToolClass(iceObsidianTrowel, "shovel", InfiMaterialEnum.Obsidian.getHarvestLevel());
            MinecraftForge.setToolClass(lavaObsidianTrowel, "shovel", InfiMaterialEnum.Obsidian.getHarvestLevel());
            MinecraftForge.setToolClass(cactusObsidianTrowel, "shovel", InfiMaterialEnum.Obsidian.getHarvestLevel());
        }
        
        if(PropsHelperInfi2x2.enableSandstoneTools)
        {
        	woodSandstoneTrowel = new InfiToolTrowel(PropsHelperInfi2x2.sandstoneTrowelID+0, 
                    InfiMaterialEnum.Sandstone, InfiMaterialEnum.Sandstone, "woodSandstoneTrowel");
        	sandstoneSandstoneTrowel = new InfiToolTrowel(PropsHelperInfi2x2.sandstoneTrowelID+1, 
                    InfiMaterialEnum.Sandstone, InfiMaterialEnum.Sandstone, "sandstoneSandstoneTrowel");
        	boneSandstoneTrowel = new InfiToolTrowel(PropsHelperInfi2x2.sandstoneTrowelID+2, 
                    InfiMaterialEnum.Sandstone, InfiMaterialEnum.Bone, "boneSandstoneTrowel");
        	netherrackSandstoneTrowel = new InfiToolTrowel(PropsHelperInfi2x2.sandstoneTrowelID+3, 
                    InfiMaterialEnum.Sandstone, InfiMaterialEnum.Netherrack, "netherrackSandstoneTrowel");
        	iceSandstoneTrowel = new InfiToolTrowel(PropsHelperInfi2x2.sandstoneTrowelID+4, 
                    InfiMaterialEnum.Sandstone, InfiMaterialEnum.Ice, "iceSandstoneTrowel");
        	slimeSandstoneTrowel = new InfiToolTrowel(PropsHelperInfi2x2.sandstoneTrowelID+5,
                    InfiMaterialEnum.Sandstone, InfiMaterialEnum.Slime, "slimeSandstoneTrowel");
        	cactusSandstoneTrowel = new InfiToolTrowel(PropsHelperInfi2x2.sandstoneTrowelID+6,
                    InfiMaterialEnum.Sandstone, InfiMaterialEnum.Cactus, "cactusSandstoneTrowel");
        	flintSandstoneTrowel = new InfiToolTrowel(PropsHelperInfi2x2.sandstoneTrowelID+7,
                    InfiMaterialEnum.Sandstone, InfiMaterialEnum.Flint, "flintSandstoneTrowel");
            
            MinecraftForge.setToolClass(woodSandstoneTrowel, "shovel", InfiMaterialEnum.Sandstone.getHarvestLevel());
            MinecraftForge.setToolClass(sandstoneSandstoneTrowel, "shovel", InfiMaterialEnum.Sandstone.getHarvestLevel());
            MinecraftForge.setToolClass(boneSandstoneTrowel, "shovel", InfiMaterialEnum.Sandstone.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackSandstoneTrowel, "shovel", InfiMaterialEnum.Sandstone.getHarvestLevel());
            MinecraftForge.setToolClass(iceSandstoneTrowel, "shovel", InfiMaterialEnum.Sandstone.getHarvestLevel());
            MinecraftForge.setToolClass(slimeSandstoneTrowel, "shovel", InfiMaterialEnum.Sandstone.getHarvestLevel());
            MinecraftForge.setToolClass(cactusSandstoneTrowel, "shovel", InfiMaterialEnum.Sandstone.getHarvestLevel());
            MinecraftForge.setToolClass(flintSandstoneTrowel, "shovel", InfiMaterialEnum.Sandstone.getHarvestLevel());
        }
        
        if(PropsHelperInfi2x2.enableBoneTools)
        {
        	woodBoneTrowel = new InfiToolTrowel(PropsHelperInfi2x2.boneTrowelID+0, 
                    InfiMaterialEnum.Bone, InfiMaterialEnum.Bone, "woodBoneTrowel");
        	stoneBoneTrowel = new InfiToolTrowel(PropsHelperInfi2x2.boneTrowelID+1, 
                    InfiMaterialEnum.Bone, InfiMaterialEnum.Stone, "stoneBoneTrowel");
        	sandstoneBoneTrowel = new InfiToolTrowel(PropsHelperInfi2x2.boneTrowelID+2, 
                    InfiMaterialEnum.Bone, InfiMaterialEnum.Sandstone, "sandstoneBoneTrowel");
        	boneBoneTrowel = new InfiToolTrowel(PropsHelperInfi2x2.boneTrowelID+3, 
                    InfiMaterialEnum.Bone, InfiMaterialEnum.Bone, "boneBoneTrowel");
        	paperBoneTrowel = new InfiToolTrowel(PropsHelperInfi2x2.boneTrowelID+4, 
                    InfiMaterialEnum.Bone, InfiMaterialEnum.Paper, "paperBoneTrowel");
        	netherrackBoneTrowel = new InfiToolTrowel(PropsHelperInfi2x2.boneTrowelID+5, 
                    InfiMaterialEnum.Bone, InfiMaterialEnum.Netherrack, "netherrackBoneTrowel");
        	iceBoneTrowel = new InfiToolTrowel(PropsHelperInfi2x2.boneTrowelID+6, 
                    InfiMaterialEnum.Bone, InfiMaterialEnum.Ice, "iceBoneTrowel");
        	cactusBoneTrowel = new InfiToolTrowel(PropsHelperInfi2x2.boneTrowelID+7,
                    InfiMaterialEnum.Bone, InfiMaterialEnum.Cactus, "cactusBoneTrowel");
        	flintBoneTrowel = new InfiToolTrowel(PropsHelperInfi2x2.boneTrowelID+8,
                    InfiMaterialEnum.Bone, InfiMaterialEnum.Flint, "flintBoneTrowel");
            
            MinecraftForge.setToolClass(woodBoneTrowel, "shovel", InfiMaterialEnum.Bone.getHarvestLevel());
            MinecraftForge.setToolClass(stoneBoneTrowel, "shovel", InfiMaterialEnum.Bone.getHarvestLevel());
            MinecraftForge.setToolClass(sandstoneBoneTrowel, "shovel", InfiMaterialEnum.Bone.getHarvestLevel());
            MinecraftForge.setToolClass(boneBoneTrowel, "shovel", InfiMaterialEnum.Bone.getHarvestLevel());
            MinecraftForge.setToolClass(paperBoneTrowel, "shovel", InfiMaterialEnum.Bone.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackBoneTrowel, "shovel", InfiMaterialEnum.Bone.getHarvestLevel());
            MinecraftForge.setToolClass(iceBoneTrowel, "shovel", InfiMaterialEnum.Bone.getHarvestLevel());
            MinecraftForge.setToolClass(cactusBoneTrowel, "shovel", InfiMaterialEnum.Bone.getHarvestLevel());
            MinecraftForge.setToolClass(flintBoneTrowel, "shovel", InfiMaterialEnum.Bone.getHarvestLevel());
        }
        
        if(PropsHelperInfi2x2.enablePaperTools)
        {
        	woodPaperTrowel = new InfiToolTrowel(PropsHelperInfi2x2.paperTrowelID+0, 
                    InfiMaterialEnum.Paper, InfiMaterialEnum.Paper, "woodPaperTrowel");
        	bonePaperTrowel = new InfiToolTrowel(PropsHelperInfi2x2.paperTrowelID+1, 
                    InfiMaterialEnum.Paper, InfiMaterialEnum.Paper, "bonePaperTrowel");
        	paperPaperTrowel = new InfiToolTrowel(PropsHelperInfi2x2.paperTrowelID+2, 
                    InfiMaterialEnum.Paper, InfiMaterialEnum.Paper, "paperPaperTrowel");
        	slimePaperTrowel = new InfiToolTrowel(PropsHelperInfi2x2.paperTrowelID+3,
                    InfiMaterialEnum.Paper, InfiMaterialEnum.Cactus, "slimePaperTrowel");
        	cactusPaperTrowel = new InfiToolTrowel(PropsHelperInfi2x2.paperTrowelID+4,
                    InfiMaterialEnum.Paper, InfiMaterialEnum.Cactus, "cactusPaperTrowel");
            
            MinecraftForge.setToolClass(woodPaperTrowel, "shovel", InfiMaterialEnum.Paper.getHarvestLevel());
            MinecraftForge.setToolClass(bonePaperTrowel, "shovel", InfiMaterialEnum.Paper.getHarvestLevel());
            MinecraftForge.setToolClass(paperPaperTrowel, "shovel", InfiMaterialEnum.Paper.getHarvestLevel());
            MinecraftForge.setToolClass(slimePaperTrowel, "shovel", InfiMaterialEnum.Paper.getHarvestLevel());
            MinecraftForge.setToolClass(cactusPaperTrowel, "shovel", InfiMaterialEnum.Paper.getHarvestLevel());
        }
        
        if(PropsHelperInfi2x2.enableMossyTools)
        {
        	woodMossyTrowel = new InfiToolTrowel(PropsHelperInfi2x2.mossyTrowelID+0, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Wood, "woodMossyTrowel");
        	stoneMossyTrowel = new InfiToolTrowel(PropsHelperInfi2x2.mossyTrowelID+1, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Stone, "stoneMossyTrowel");
        	diamondMossyTrowel = new InfiToolTrowel(PropsHelperInfi2x2.mossyTrowelID+2, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Diamond, "diamondMossyTrowel");
        	redstoneMossyTrowel = new InfiToolTrowel(PropsHelperInfi2x2.mossyTrowelID+3, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Redstone, "redstoneMossyTrowel");
        	boneMossyTrowel = new InfiToolTrowel(PropsHelperInfi2x2.mossyTrowelID+4, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Bone, "boneMossyTrowel");
        	mossyMossyTrowel = new InfiToolTrowel(PropsHelperInfi2x2.mossyTrowelID+5, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Mossy, "mossyMossyTrowel");
        	netherrackMossyTrowel = new InfiToolTrowel(PropsHelperInfi2x2.mossyTrowelID+6, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Netherrack, "netherrackMossyTrowel");
        	glowstoneMossyTrowel = new InfiToolTrowel(PropsHelperInfi2x2.mossyTrowelID+7, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Glowstone, "glowstoneMossyTrowel");
        	cactusMossyTrowel = new InfiToolTrowel(PropsHelperInfi2x2.mossyTrowelID+8, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Cactus, "cactusMossyTrowel");
        	blazeMossyTrowel = new InfiToolTrowel(PropsHelperInfi2x2.mossyTrowelID+9, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Blaze, "blazeMossyTrowel");
        	manyullynMossyTrowel = new InfiToolTrowel(PropsHelperInfi2x2.mossyTrowelID+10, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Manyullyn, "manyullynMossyTrowel");
        	uraniumMossyTrowel = new InfiToolTrowel(PropsHelperInfi2x2.mossyTrowelID+11, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Uranium, "uraniumMossyTrowel");
            
            MinecraftForge.setToolClass(woodMossyTrowel, "shovel", InfiMaterialEnum.Mossy.getHarvestLevel());
            MinecraftForge.setToolClass(stoneMossyTrowel, "shovel", InfiMaterialEnum.Mossy.getHarvestLevel());
            MinecraftForge.setToolClass(diamondMossyTrowel, "shovel", InfiMaterialEnum.Mossy.getHarvestLevel());
            MinecraftForge.setToolClass(redstoneMossyTrowel, "shovel", InfiMaterialEnum.Mossy.getHarvestLevel());
            MinecraftForge.setToolClass(boneMossyTrowel, "shovel", InfiMaterialEnum.Mossy.getHarvestLevel());
            MinecraftForge.setToolClass(mossyMossyTrowel, "shovel", InfiMaterialEnum.Mossy.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackMossyTrowel, "shovel", InfiMaterialEnum.Mossy.getHarvestLevel());
            MinecraftForge.setToolClass(glowstoneMossyTrowel, "shovel", InfiMaterialEnum.Mossy.getHarvestLevel());
            MinecraftForge.setToolClass(cactusMossyTrowel, "shovel", InfiMaterialEnum.Mossy.getHarvestLevel());
            MinecraftForge.setToolClass(blazeMossyTrowel, "shovel", InfiMaterialEnum.Mossy.getHarvestLevel());
            MinecraftForge.setToolClass(manyullynMossyTrowel, "shovel", InfiMaterialEnum.Mossy.getHarvestLevel());
            MinecraftForge.setToolClass(uraniumMossyTrowel, "shovel", InfiMaterialEnum.Mossy.getHarvestLevel());
        }
        
        if(PropsHelperInfi2x2.enableNetherrackTools)
        {
        	woodNetherrackTrowel = new InfiToolTrowel(PropsHelperInfi2x2.netherrackTrowelID+0, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Wood, "woodNetherrackTrowel");
        	stoneNetherrackTrowel = new InfiToolTrowel(PropsHelperInfi2x2.netherrackTrowelID+1, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Stone, "stoneNetherrackTrowel");
        	sandstoneNetherrackTrowel = new InfiToolTrowel(PropsHelperInfi2x2.netherrackTrowelID+2, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Sandstone, "sandstoneNetherrackTrowel");
        	boneNetherrackTrowel = new InfiToolTrowel(PropsHelperInfi2x2.netherrackTrowelID+3, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Bone, "boneNetherrackTrowel");
        	paperNetherrackTrowel = new InfiToolTrowel(PropsHelperInfi2x2.netherrackTrowelID+4, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Paper, "paperNetherrackTrowel");
        	mossyNetherrackTrowel = new InfiToolTrowel(PropsHelperInfi2x2.netherrackTrowelID+5, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Mossy, "mossyNetherrackTrowel");
        	netherrackNetherrackTrowel = new InfiToolTrowel(PropsHelperInfi2x2.netherrackTrowelID+6, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Netherrack, "netherrackNetherrackTrowel");
        	iceNetherrackTrowel = new InfiToolTrowel(PropsHelperInfi2x2.netherrackTrowelID+7, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Ice, "iceNetherrackTrowel");
        	slimeNetherrackTrowel = new InfiToolTrowel(PropsHelperInfi2x2.netherrackTrowelID+8, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Slime, "slimeNetherrackTrowel");
        	cactusNetherrackTrowel = new InfiToolTrowel(PropsHelperInfi2x2.netherrackTrowelID+9, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Cactus, "cactusNetherrackTrowel");
        	flintNetherrackTrowel = new InfiToolTrowel(PropsHelperInfi2x2.netherrackTrowelID+10, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Flint, "flintNetherrackTrowel");
        	copperNetherrackTrowel = new InfiToolTrowel(PropsHelperInfi2x2.netherrackTrowelID+11, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Copper, "copperNetherrackTrowel");
        	bronzeNetherrackTrowel = new InfiToolTrowel(PropsHelperInfi2x2.netherrackTrowelID+12, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Bronze, "bronzeNetherrackTrowel");
            
            MinecraftForge.setToolClass(woodNetherrackTrowel, "shovel", InfiMaterialEnum.Netherrack.getHarvestLevel());
            MinecraftForge.setToolClass(stoneNetherrackTrowel, "shovel", InfiMaterialEnum.Netherrack.getHarvestLevel());
            MinecraftForge.setToolClass(sandstoneNetherrackTrowel, "shovel", InfiMaterialEnum.Netherrack.getHarvestLevel());
            MinecraftForge.setToolClass(boneNetherrackTrowel, "shovel", InfiMaterialEnum.Netherrack.getHarvestLevel());
            MinecraftForge.setToolClass(paperNetherrackTrowel, "shovel", InfiMaterialEnum.Netherrack.getHarvestLevel());
            MinecraftForge.setToolClass(mossyNetherrackTrowel, "shovel", InfiMaterialEnum.Netherrack.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackNetherrackTrowel, "shovel", InfiMaterialEnum.Netherrack.getHarvestLevel());
            MinecraftForge.setToolClass(iceNetherrackTrowel, "shovel", InfiMaterialEnum.Netherrack.getHarvestLevel());
            MinecraftForge.setToolClass(slimeNetherrackTrowel, "shovel", InfiMaterialEnum.Netherrack.getHarvestLevel());
            MinecraftForge.setToolClass(cactusNetherrackTrowel, "shovel", InfiMaterialEnum.Netherrack.getHarvestLevel());
            MinecraftForge.setToolClass(flintNetherrackTrowel, "shovel", InfiMaterialEnum.Netherrack.getHarvestLevel());
            MinecraftForge.setToolClass(copperNetherrackTrowel, "shovel", InfiMaterialEnum.Netherrack.getHarvestLevel());
            MinecraftForge.setToolClass(bronzeNetherrackTrowel, "shovel", InfiMaterialEnum.Netherrack.getHarvestLevel());
        }
        
        if(PropsHelperInfi2x2.enableGlowstoneTools)
        {
        	woodGlowstoneTrowel = new InfiToolTrowel(PropsHelperInfi2x2.glowstoneTrowelID+0, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Wood, "woodGlowstoneTrowel");
        	redstoneGlowstoneTrowel = new InfiToolTrowel(PropsHelperInfi2x2.glowstoneTrowelID+1, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Redstone, "redstoneGlowstoneTrowel");
        	obsidianGlowstoneTrowel = new InfiToolTrowel(PropsHelperInfi2x2.glowstoneTrowelID+2, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Obsidian, "obsidianGlowstoneTrowel");
        	boneGlowstoneTrowel = new InfiToolTrowel(PropsHelperInfi2x2.glowstoneTrowelID+3, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Bone, "boneGlowstoneTrowel");
        	netherrackGlowstoneTrowel = new InfiToolTrowel(PropsHelperInfi2x2.glowstoneTrowelID+4, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Netherrack, "netherrackGlowstoneTrowel");
        	glowstoneGlowstoneTrowel = new InfiToolTrowel(PropsHelperInfi2x2.glowstoneTrowelID+5, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Glowstone, "glowstoneGlowstoneTrowel");
        	iceGlowstoneTrowel = new InfiToolTrowel(PropsHelperInfi2x2.glowstoneTrowelID+6, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Ice, "iceGlowstoneTrowel");
        	slimeGlowstoneTrowel = new InfiToolTrowel(PropsHelperInfi2x2.glowstoneTrowelID+7, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Slime, "slimeGlowstoneTrowel");
        	cactusGlowstoneTrowel = new InfiToolTrowel(PropsHelperInfi2x2.glowstoneTrowelID+8, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Cactus, "cactusGlowstoneTrowel");
            
            
            MinecraftForge.setToolClass(woodGlowstoneTrowel, "shovel", InfiMaterialEnum.Glowstone.getHarvestLevel());
            MinecraftForge.setToolClass(redstoneGlowstoneTrowel, "shovel", InfiMaterialEnum.Glowstone.getHarvestLevel());
            MinecraftForge.setToolClass(obsidianGlowstoneTrowel, "shovel", InfiMaterialEnum.Glowstone.getHarvestLevel());
            MinecraftForge.setToolClass(boneGlowstoneTrowel, "shovel", InfiMaterialEnum.Glowstone.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackGlowstoneTrowel, "shovel", InfiMaterialEnum.Glowstone.getHarvestLevel());
            MinecraftForge.setToolClass(glowstoneGlowstoneTrowel, "shovel", InfiMaterialEnum.Glowstone.getHarvestLevel());
            MinecraftForge.setToolClass(iceGlowstoneTrowel, "shovel", InfiMaterialEnum.Glowstone.getHarvestLevel());
            MinecraftForge.setToolClass(slimeGlowstoneTrowel, "shovel", InfiMaterialEnum.Glowstone.getHarvestLevel());
            MinecraftForge.setToolClass(cactusGlowstoneTrowel, "shovel", InfiMaterialEnum.Glowstone.getHarvestLevel());
        }
        
        if(PropsHelperInfi2x2.enableIceTools)
        {
        	woodIceTrowel = new InfiToolTrowel(PropsHelperInfi2x2.iceTrowelID+0, 
                    InfiMaterialEnum.Ice, InfiMaterialEnum.Wood, "woodIceTrowel");
        	boneIceTrowel = new InfiToolTrowel(PropsHelperInfi2x2.iceTrowelID+1, 
                    InfiMaterialEnum.Ice, InfiMaterialEnum.Bone, "boneIceTrowel");
        	paperIceTrowel = new InfiToolTrowel(PropsHelperInfi2x2.iceTrowelID+2, 
                    InfiMaterialEnum.Ice, InfiMaterialEnum.Paper, "paperIceTrowel");
        	iceIceTrowel = new InfiToolTrowel(PropsHelperInfi2x2.iceTrowelID+3, 
                    InfiMaterialEnum.Ice, InfiMaterialEnum.Ice, "iceIceTrowel");
        	slimeIceTrowel = new InfiToolTrowel(PropsHelperInfi2x2.iceTrowelID+4, 
                    InfiMaterialEnum.Ice, InfiMaterialEnum.Slime, "slimeIceTrowel");
        	cactusIceTrowel = new InfiToolTrowel(PropsHelperInfi2x2.iceTrowelID+5, 
                    InfiMaterialEnum.Ice, InfiMaterialEnum.Cactus, "cactusIceTrowel");
            
            
            MinecraftForge.setToolClass(woodIceTrowel, "shovel", InfiMaterialEnum.Ice.getHarvestLevel());
            MinecraftForge.setToolClass(boneIceTrowel, "shovel", InfiMaterialEnum.Ice.getHarvestLevel());
            MinecraftForge.setToolClass(paperIceTrowel, "shovel", InfiMaterialEnum.Ice.getHarvestLevel());
            MinecraftForge.setToolClass(iceIceTrowel, "shovel", InfiMaterialEnum.Ice.getHarvestLevel());
            MinecraftForge.setToolClass(slimeIceTrowel, "shovel", InfiMaterialEnum.Ice.getHarvestLevel());
            MinecraftForge.setToolClass(cactusIceTrowel, "shovel", InfiMaterialEnum.Ice.getHarvestLevel());
        }
        
        if(PropsHelperInfi2x2.enableLavaTools)
        {
        	diamondLavaTrowel = new InfiToolTrowel(PropsHelperInfi2x2.lavaTrowelID+0, 
                    InfiMaterialEnum.Lava, InfiMaterialEnum.Diamond, "diamondLavaTrowel");
        	obsidianLavaTrowel = new InfiToolTrowel(PropsHelperInfi2x2.lavaTrowelID+1, 
                    InfiMaterialEnum.Lava, InfiMaterialEnum.Obsidian, "obsidianLavaTrowel");
        	netherrackLavaTrowel = new InfiToolTrowel(PropsHelperInfi2x2.lavaTrowelID+2, 
                    InfiMaterialEnum.Lava, InfiMaterialEnum.Netherrack, "netherrackLavaTrowel");
        	lavaLavaTrowel = new InfiToolTrowel(PropsHelperInfi2x2.lavaTrowelID+3, 
                    InfiMaterialEnum.Lava, InfiMaterialEnum.Lava, "lavaLavaTrowel");
        	flintLavaTrowel = new InfiToolTrowel(PropsHelperInfi2x2.lavaTrowelID+4, 
                    InfiMaterialEnum.Lava, InfiMaterialEnum.Flint, "flintLavaTrowel");
        	blazeLavaTrowel = new InfiToolTrowel(PropsHelperInfi2x2.lavaTrowelID+5, 
                    InfiMaterialEnum.Lava, InfiMaterialEnum.Blaze, "blazeLavaTrowel");
        	manyullynLavaTrowel = new InfiToolTrowel(PropsHelperInfi2x2.lavaTrowelID+6, 
                    InfiMaterialEnum.Lava, InfiMaterialEnum.Manyullyn, "manyullynLavaTrowel");
            uraniumLavaTrowel = new InfiToolTrowel(PropsHelperInfi2x2.lavaTrowelID+7, 
                    InfiMaterialEnum.Lava, InfiMaterialEnum.Uranium, "uraniumLavaTrowel");
            
            MinecraftForge.setToolClass(diamondLavaTrowel, "shovel", InfiMaterialEnum.Lava.getHarvestLevel());
            MinecraftForge.setToolClass(obsidianLavaTrowel, "shovel", InfiMaterialEnum.Lava.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackLavaTrowel, "shovel", InfiMaterialEnum.Lava.getHarvestLevel());
            MinecraftForge.setToolClass(lavaLavaTrowel, "shovel", InfiMaterialEnum.Lava.getHarvestLevel());
            MinecraftForge.setToolClass(flintLavaTrowel, "shovel", InfiMaterialEnum.Lava.getHarvestLevel());
            MinecraftForge.setToolClass(blazeLavaTrowel, "shovel", InfiMaterialEnum.Lava.getHarvestLevel());
            MinecraftForge.setToolClass(manyullynLavaTrowel, "shovel", InfiMaterialEnum.Lava.getHarvestLevel());
            MinecraftForge.setToolClass(uraniumLavaTrowel, "shovel", InfiMaterialEnum.Lava.getHarvestLevel());
        }
        
        if(PropsHelperInfi2x2.enableSlimeTools)
        {
        	woodSlimeTrowel = new InfiToolTrowel(PropsHelperInfi2x2.slimeTrowelID+0, 
                    InfiMaterialEnum.Slime, InfiMaterialEnum.Wood, "woodSlimeTrowel");
        	sandstoneSlimeTrowel = new InfiToolTrowel(PropsHelperInfi2x2.slimeTrowelID+1, 
                    InfiMaterialEnum.Slime, InfiMaterialEnum.Sandstone, "sandstoneSlimeTrowel");
        	boneSlimeTrowel = new InfiToolTrowel(PropsHelperInfi2x2.slimeTrowelID+2, 
                    InfiMaterialEnum.Slime, InfiMaterialEnum.Bone, "boneSlimeTrowel");
        	paperSlimeTrowel = new InfiToolTrowel(PropsHelperInfi2x2.slimeTrowelID+3, 
                    InfiMaterialEnum.Slime, InfiMaterialEnum.Paper, "paperSlimeTrowel");
        	slimeSlimeTrowel = new InfiToolTrowel(PropsHelperInfi2x2.slimeTrowelID+4, 
                    InfiMaterialEnum.Slime, InfiMaterialEnum.Slime, "slimeSlimeTrowel");
        	cactusSlimeTrowel = new InfiToolTrowel(PropsHelperInfi2x2.slimeTrowelID+5, 
                    InfiMaterialEnum.Slime, InfiMaterialEnum.Cactus, "cactusSlimeTrowel");
            
            MinecraftForge.setToolClass(woodSlimeTrowel, "shovel", InfiMaterialEnum.Slime.getHarvestLevel());
            MinecraftForge.setToolClass(sandstoneSlimeTrowel, "shovel", InfiMaterialEnum.Slime.getHarvestLevel());
            MinecraftForge.setToolClass(boneSlimeTrowel, "shovel", InfiMaterialEnum.Slime.getHarvestLevel());
            MinecraftForge.setToolClass(paperSlimeTrowel, "shovel", InfiMaterialEnum.Slime.getHarvestLevel());
            MinecraftForge.setToolClass(slimeSlimeTrowel, "shovel", InfiMaterialEnum.Slime.getHarvestLevel());
            MinecraftForge.setToolClass(cactusSlimeTrowel, "shovel", InfiMaterialEnum.Slime.getHarvestLevel());
        }
        
        if(PropsHelperInfi2x2.enableCactusTools)
        {
        	woodCactusTrowel = new InfiToolTrowel(PropsHelperInfi2x2.cactusTrowelID+0, 
                    InfiMaterialEnum.Cactus, InfiMaterialEnum.Wood, "woodCactusTrowel");
        	sandstoneCactusTrowel = new InfiToolTrowel(PropsHelperInfi2x2.cactusTrowelID+1, 
                    InfiMaterialEnum.Cactus, InfiMaterialEnum.Sandstone, "sandstoneCactusTrowel");
        	boneCactusTrowel = new InfiToolTrowel(PropsHelperInfi2x2.cactusTrowelID+2, 
                    InfiMaterialEnum.Cactus, InfiMaterialEnum.Bone, "boneCactusTrowel");
        	netherrackCactusTrowel = new InfiToolTrowel(PropsHelperInfi2x2.cactusTrowelID+3, 
                    InfiMaterialEnum.Cactus, InfiMaterialEnum.Netherrack, "netherrackCactusTrowel");
        	iceCactusTrowel = new InfiToolTrowel(PropsHelperInfi2x2.cactusTrowelID+4, 
                    InfiMaterialEnum.Cactus, InfiMaterialEnum.Ice, "iceCactusTrowel");
        	slimeCactusTrowel = new InfiToolTrowel(PropsHelperInfi2x2.cactusTrowelID+5, 
                    InfiMaterialEnum.Cactus, InfiMaterialEnum.Slime, "slimeCactusTrowel");
        	cactusCactusTrowel = new InfiToolTrowel(PropsHelperInfi2x2.cactusTrowelID+6, 
                    InfiMaterialEnum.Cactus, InfiMaterialEnum.Cactus, "cactusCactusTrowel");
            
            MinecraftForge.setToolClass(woodCactusTrowel, "shovel", InfiMaterialEnum.Cactus.getHarvestLevel());
            MinecraftForge.setToolClass(sandstoneCactusTrowel, "shovel", InfiMaterialEnum.Cactus.getHarvestLevel());
            MinecraftForge.setToolClass(boneCactusTrowel, "shovel", InfiMaterialEnum.Cactus.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackCactusTrowel, "shovel", InfiMaterialEnum.Cactus.getHarvestLevel());
            MinecraftForge.setToolClass(iceCactusTrowel, "shovel", InfiMaterialEnum.Cactus.getHarvestLevel());
            MinecraftForge.setToolClass(slimeCactusTrowel, "shovel", InfiMaterialEnum.Cactus.getHarvestLevel());
            MinecraftForge.setToolClass(cactusCactusTrowel, "shovel", InfiMaterialEnum.Cactus.getHarvestLevel());
        }
        
        if(PropsHelperInfi2x2.enableFlintTools)
        {
        	woodFlintTrowel = new InfiToolTrowel(PropsHelperInfi2x2.flintTrowelID+0, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Wood, "woodFlintTrowel");
        	stoneFlintTrowel = new InfiToolTrowel(PropsHelperInfi2x2.flintTrowelID+1, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Stone, "stoneFlintTrowel");
        	sandstoneFlintTrowel = new InfiToolTrowel(PropsHelperInfi2x2.flintTrowelID+2, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Sandstone, "sandstoneFlintTrowel");
        	boneFlintTrowel = new InfiToolTrowel(PropsHelperInfi2x2.flintTrowelID+3, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Bone, "boneFlintTrowel");
        	netherrackFlintTrowel = new InfiToolTrowel(PropsHelperInfi2x2.flintTrowelID+4, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Flint, "netherrackFlintTrowel");
        	slimeFlintTrowel = new InfiToolTrowel(PropsHelperInfi2x2.flintTrowelID+5, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Slime, "slimeFlintTrowel");
        	cactusFlintTrowel = new InfiToolTrowel(PropsHelperInfi2x2.flintTrowelID+6, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Cactus, "cactusFlintTrowel");
        	flintFlintTrowel = new InfiToolTrowel(PropsHelperInfi2x2.flintTrowelID+7, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Flint, "flintFlintTrowel");
        	copperFlintTrowel = new InfiToolTrowel(PropsHelperInfi2x2.flintTrowelID+8, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Copper, "copperFlintTrowel");
        	bronzeFlintTrowel = new InfiToolTrowel(PropsHelperInfi2x2.flintTrowelID+9, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Bronze, "bronzeFlintTrowel");
            
            MinecraftForge.setToolClass(woodFlintTrowel, "shovel", InfiMaterialEnum.Flint.getHarvestLevel());
            MinecraftForge.setToolClass(stoneFlintTrowel, "shovel", InfiMaterialEnum.Flint.getHarvestLevel());
            MinecraftForge.setToolClass(sandstoneFlintTrowel, "shovel", InfiMaterialEnum.Flint.getHarvestLevel());
            MinecraftForge.setToolClass(boneFlintTrowel, "shovel", InfiMaterialEnum.Flint.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackFlintTrowel, "shovel", InfiMaterialEnum.Flint.getHarvestLevel());
            MinecraftForge.setToolClass(slimeFlintTrowel, "shovel", InfiMaterialEnum.Flint.getHarvestLevel());
            MinecraftForge.setToolClass(cactusFlintTrowel, "shovel", InfiMaterialEnum.Flint.getHarvestLevel());
            MinecraftForge.setToolClass(flintFlintTrowel, "shovel", InfiMaterialEnum.Flint.getHarvestLevel());
            MinecraftForge.setToolClass(copperFlintTrowel, "shovel", InfiMaterialEnum.Flint.getHarvestLevel());
            MinecraftForge.setToolClass(bronzeFlintTrowel, "shovel", InfiMaterialEnum.Flint.getHarvestLevel());
        }
        
        if(PropsHelperInfi2x2.enableBlazeTools)
        {
        	diamondBlazeTrowel = new InfiToolTrowel(PropsHelperInfi2x2.blazeTrowelID+0, 
                    InfiMaterialEnum.Blaze, InfiMaterialEnum.Diamond, "diamondBlazeTrowel");
        	obsidianBlazeTrowel = new InfiToolTrowel(PropsHelperInfi2x2.blazeTrowelID+1, 
                    InfiMaterialEnum.Blaze, InfiMaterialEnum.Obsidian, "obsidianBlazeTrowel");
        	netherrackBlazeTrowel = new InfiToolTrowel(PropsHelperInfi2x2.blazeTrowelID+2, 
                    InfiMaterialEnum.Blaze, InfiMaterialEnum.Netherrack, "netherrackBlazeTrowel");
        	lavaBlazeTrowel = new InfiToolTrowel(PropsHelperInfi2x2.blazeTrowelID+3, 
                    InfiMaterialEnum.Blaze, InfiMaterialEnum.Lava, "lavaBlazeTrowel");
        	flintBlazeTrowel = new InfiToolTrowel(PropsHelperInfi2x2.blazeTrowelID+4, 
                    InfiMaterialEnum.Blaze, InfiMaterialEnum.Flint, "flintBlazeTrowel");
        	blazeBlazeTrowel = new InfiToolTrowel(PropsHelperInfi2x2.blazeTrowelID+5, 
                    InfiMaterialEnum.Blaze, InfiMaterialEnum.Blaze, "blazeBlazeTrowel");
        	manyullynBlazeTrowel = new InfiToolTrowel(PropsHelperInfi2x2.blazeTrowelID+6, 
                    InfiMaterialEnum.Blaze, InfiMaterialEnum.Manyullyn, "manyullynBlazeTrowel");
            uraniumBlazeTrowel = new InfiToolTrowel(PropsHelperInfi2x2.blazeTrowelID+7, 
                    InfiMaterialEnum.Blaze, InfiMaterialEnum.Uranium, "uraniumBlazeTrowel");
            
            MinecraftForge.setToolClass(diamondBlazeTrowel, "shovel", InfiMaterialEnum.Blaze.getHarvestLevel());
            MinecraftForge.setToolClass(obsidianBlazeTrowel, "shovel", InfiMaterialEnum.Blaze.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackBlazeTrowel, "shovel", InfiMaterialEnum.Blaze.getHarvestLevel());
            MinecraftForge.setToolClass(blazeBlazeTrowel, "shovel", InfiMaterialEnum.Blaze.getHarvestLevel());
            MinecraftForge.setToolClass(flintBlazeTrowel, "shovel", InfiMaterialEnum.Blaze.getHarvestLevel());
            MinecraftForge.setToolClass(blazeBlazeTrowel, "shovel", InfiMaterialEnum.Blaze.getHarvestLevel());
            MinecraftForge.setToolClass(manyullynBlazeTrowel, "shovel", InfiMaterialEnum.Blaze.getHarvestLevel());
            MinecraftForge.setToolClass(uraniumBlazeTrowel, "shovel", InfiMaterialEnum.Blaze.getHarvestLevel());
        }
    	
        if(PropsHelperInfi2x2.enableCopperTools)
        {
        	woodCopperTrowel = new InfiToolTrowel(PropsHelperInfi2x2.copperTrowelID+0, 
                    InfiMaterialEnum.Copper, InfiMaterialEnum.Wood, "woodCopperTrowel");
            stoneCopperTrowel = new InfiToolTrowel(PropsHelperInfi2x2.copperTrowelID+1, 
                    InfiMaterialEnum.Copper, InfiMaterialEnum.Stone, "stoneCopperTrowel");
            boneCopperTrowel = new InfiToolTrowel(PropsHelperInfi2x2.copperTrowelID+2, 
                    InfiMaterialEnum.Copper, InfiMaterialEnum.Bone, "boneCopperTrowel");
            netherrackCopperTrowel = new InfiToolTrowel(PropsHelperInfi2x2.copperTrowelID+3, 
                    InfiMaterialEnum.Copper, InfiMaterialEnum.Netherrack, "netherrackCopperTrowel");
            slimeCopperTrowel = new InfiToolTrowel(PropsHelperInfi2x2.copperTrowelID+4, 
                    InfiMaterialEnum.Copper, InfiMaterialEnum.Slime, "slimeCopperTrowel");
            cactusCopperTrowel = new InfiToolTrowel(PropsHelperInfi2x2.copperTrowelID+5, 
                    InfiMaterialEnum.Copper, InfiMaterialEnum.Cactus, "cactusCopperTrowel");
            flintCopperTrowel = new InfiToolTrowel(PropsHelperInfi2x2.copperTrowelID+6, 
                    InfiMaterialEnum.Copper, InfiMaterialEnum.Flint, "flintCopperTrowel");
            copperCopperTrowel = new InfiToolTrowel(PropsHelperInfi2x2.copperTrowelID+7, 
                    InfiMaterialEnum.Copper, InfiMaterialEnum.Copper, "copperCopperTrowel");
            
            MinecraftForge.setToolClass(woodCopperTrowel, "shovel", InfiMaterialEnum.Copper.getHarvestLevel());
        	MinecraftForge.setToolClass(stoneCopperTrowel, "shovel", InfiMaterialEnum.Copper.getHarvestLevel());
            MinecraftForge.setToolClass(boneCopperTrowel, "shovel", InfiMaterialEnum.Copper.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackCopperTrowel, "shovel", InfiMaterialEnum.Copper.getHarvestLevel());
            MinecraftForge.setToolClass(slimeCopperTrowel, "shovel", InfiMaterialEnum.Copper.getHarvestLevel());
            MinecraftForge.setToolClass(cactusCopperTrowel, "shovel", InfiMaterialEnum.Copper.getHarvestLevel());
            MinecraftForge.setToolClass(flintCopperTrowel, "shovel", InfiMaterialEnum.Copper.getHarvestLevel());
            MinecraftForge.setToolClass(copperCopperTrowel, "shovel", InfiMaterialEnum.Copper.getHarvestLevel());
        }
        
        if(PropsHelperInfi2x2.enableBronzeTools)
        {
        	woodBronzeTrowel = new InfiToolTrowel(PropsHelperInfi2x2.bronzeTrowelID+0, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Wood, "woodBronzeTrowel");
            stoneBronzeTrowel = new InfiToolTrowel(PropsHelperInfi2x2.bronzeTrowelID+1, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Stone, "stoneBronzeTrowel");
            boneBronzeTrowel = new InfiToolTrowel(PropsHelperInfi2x2.bronzeTrowelID+2, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Bone, "boneBronzeTrowel");
            netherrackBronzeTrowel = new InfiToolTrowel(PropsHelperInfi2x2.bronzeTrowelID+3, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Netherrack, "netherrackBronzeTrowel");
            slimeBronzeTrowel = new InfiToolTrowel(PropsHelperInfi2x2.bronzeTrowelID+4, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Slime, "slimeBronzeTrowel");
            cactusBronzeTrowel = new InfiToolTrowel(PropsHelperInfi2x2.bronzeTrowelID+5, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Cactus, "cactusBronzeTrowel");
            flintBronzeTrowel = new InfiToolTrowel(PropsHelperInfi2x2.bronzeTrowelID+6, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Flint, "flintBronzeTrowel");
            copperBronzeTrowel = new InfiToolTrowel(PropsHelperInfi2x2.bronzeTrowelID+7, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Copper, "copperBronzeTrowel");
            bronzeBronzeTrowel = new InfiToolTrowel(PropsHelperInfi2x2.bronzeTrowelID+8, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Bronze, "copperBronzeTrowel");
            
            MinecraftForge.setToolClass(woodBronzeTrowel, "shovel", InfiMaterialEnum.Bronze.getHarvestLevel());
            MinecraftForge.setToolClass(stoneBronzeTrowel, "shovel", InfiMaterialEnum.Bronze.getHarvestLevel());
            MinecraftForge.setToolClass(boneBronzeTrowel, "shovel", InfiMaterialEnum.Bronze.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackBronzeTrowel, "shovel", InfiMaterialEnum.Bronze.getHarvestLevel());
            MinecraftForge.setToolClass(slimeBronzeTrowel, "shovel", InfiMaterialEnum.Bronze.getHarvestLevel());
            MinecraftForge.setToolClass(cactusBronzeTrowel, "shovel", InfiMaterialEnum.Bronze.getHarvestLevel());
            MinecraftForge.setToolClass(flintBronzeTrowel, "shovel", InfiMaterialEnum.Bronze.getHarvestLevel());
            MinecraftForge.setToolClass(copperBronzeTrowel, "shovel", InfiMaterialEnum.Bronze.getHarvestLevel());
            MinecraftForge.setToolClass(bronzeBronzeTrowel, "shovel", InfiMaterialEnum.Bronze.getHarvestLevel());
        }
        
        if(PropsHelperInfi2x2.enableWorkedIronTools)
        {
        	woodWorkedIronTrowel = new InfiToolTrowel(PropsHelperInfi2x2.workedIronTrowelID+0, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Wood, "woodWorkedIronTrowel");
            stoneWorkedIronTrowel = new InfiToolTrowel(PropsHelperInfi2x2.workedIronTrowelID+1, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Stone, "stoneWorkedIronTrowel");
            ironWorkedIronTrowel = new InfiToolTrowel(PropsHelperInfi2x2.workedIronTrowelID+2,
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Iron, "ironWorkedIronTrowel");
            diamondWorkedIronTrowel = new InfiToolTrowel(PropsHelperInfi2x2.workedIronTrowelID+3, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Diamond, "diamondWorkedIronTrowel");
            redstoneWorkedIronTrowel = new InfiToolTrowel(PropsHelperInfi2x2.workedIronTrowelID+4, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Redstone, "redstoneWorkedIronTrowel");
            obsidianWorkedIronTrowel = new InfiToolTrowel(PropsHelperInfi2x2.workedIronTrowelID+5, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Obsidian, "obsidianWorkedIronTrowel");
            boneWorkedIronTrowel = new InfiToolTrowel(PropsHelperInfi2x2.workedIronTrowelID+6, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Bone, "boneWorkedIronTrowel");
            netherrackWorkedIronTrowel = new InfiToolTrowel(PropsHelperInfi2x2.workedIronTrowelID+7, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Netherrack, "netherrackWorkedIronTrowel");
            glowstoneWorkedIronTrowel = new InfiToolTrowel(PropsHelperInfi2x2.workedIronTrowelID+8, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Glowstone, "glowstoneWorkedIronTrowel");
            iceWorkedIronTrowel = new InfiToolTrowel(PropsHelperInfi2x2.workedIronTrowelID+9, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Ice, "iceWorkedIronTrowel");
            slimeWorkedIronTrowel = new InfiToolTrowel(PropsHelperInfi2x2.workedIronTrowelID+10, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Slime, "slimeWorkedIronTrowel");
            cactusWorkedIronTrowel = new InfiToolTrowel(PropsHelperInfi2x2.workedIronTrowelID+11, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Cactus, "cactusWorkedIronTrowel");
            blazeWorkedIronTrowel = new InfiToolTrowel(PropsHelperInfi2x2.workedIronTrowelID+12, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Blaze, "blazeWorkedIronTrowel");
            copperWorkedIronTrowel = new InfiToolTrowel(PropsHelperInfi2x2.workedIronTrowelID+13, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Copper, "copperWorkedIronTrowel");
            bronzeWorkedIronTrowel = new InfiToolTrowel(PropsHelperInfi2x2.workedIronTrowelID+14, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Bronze, "bronzeWorkedIronTrowel");
            workedWorkedIronTrowel = new InfiToolTrowel(PropsHelperInfi2x2.workedIronTrowelID+15, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.WorkedIron, "workedWorkedIronTrowel");
            steelWorkedIronTrowel = new InfiToolTrowel(PropsHelperInfi2x2.workedIronTrowelID+16, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Steel, "steelWorkedIronTrowel");
            uraniumWorkedIronTrowel = new InfiToolTrowel(PropsHelperInfi2x2.workedIronTrowelID+17, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Bronze, "uraniumWorkedIronTrowel");
            
            MinecraftForge.setToolClass(woodWorkedIronTrowel, "shovel", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(stoneWorkedIronTrowel, "shovel", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(ironWorkedIronTrowel, "shovel", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(diamondWorkedIronTrowel, "shovel", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(redstoneWorkedIronTrowel, "shovel", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(obsidianWorkedIronTrowel, "shovel", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(boneWorkedIronTrowel, "shovel", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackWorkedIronTrowel, "shovel", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(glowstoneWorkedIronTrowel, "shovel", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(iceWorkedIronTrowel, "shovel", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(slimeWorkedIronTrowel, "shovel", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(cactusWorkedIronTrowel, "shovel", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(blazeWorkedIronTrowel, "shovel", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(copperWorkedIronTrowel, "shovel", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(bronzeWorkedIronTrowel, "shovel", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(workedWorkedIronTrowel, "shovel", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(steelWorkedIronTrowel, "shovel", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(uraniumWorkedIronTrowel, "shovel", InfiMaterialEnum.WorkedIron.getHarvestLevel());
        }
        
        if(PropsHelperInfi2x2.enableSteelTools)
        {
        	woodSteelTrowel = new InfiToolTrowel(PropsHelperInfi2x2.steelTrowelID+0, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Wood, "woodSteelTrowel");
            stoneSteelTrowel = new InfiToolTrowel(PropsHelperInfi2x2.steelTrowelID+1, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Stone, "stoneSteelTrowel");
            ironSteelTrowel = new InfiToolTrowel(PropsHelperInfi2x2.steelTrowelID+2, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Iron, "ironSteelTrowel");
            diamondSteelTrowel = new InfiToolTrowel(PropsHelperInfi2x2.steelTrowelID+3, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Diamond, "diamondSteelTrowel");
            redstoneSteelTrowel = new InfiToolTrowel(PropsHelperInfi2x2.steelTrowelID+4, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Redstone, "redstoneSteelTrowel");
            obsidianSteelTrowel = new InfiToolTrowel(PropsHelperInfi2x2.steelTrowelID+5, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Obsidian, "obsidianSteelTrowel");
            boneSteelTrowel = new InfiToolTrowel(PropsHelperInfi2x2.steelTrowelID+6, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Bone, "boneSteelTrowel");
            netherrackSteelTrowel = new InfiToolTrowel(PropsHelperInfi2x2.steelTrowelID+7, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Netherrack, "netherrackSteelTrowel");
            glowstoneSteelTrowel = new InfiToolTrowel(PropsHelperInfi2x2.steelTrowelID+8, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Glowstone, "glowstoneSteelTrowel");
            iceSteelTrowel = new InfiToolTrowel(PropsHelperInfi2x2.steelTrowelID+9, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Ice, "iceSteelTrowel");
            slimeSteelTrowel = new InfiToolTrowel(PropsHelperInfi2x2.steelTrowelID+10, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Slime, "slimeSteelTrowel");
            cactusSteelTrowel = new InfiToolTrowel(PropsHelperInfi2x2.steelTrowelID+11, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Cactus, "cactusSteelTrowel");
            blazeSteelTrowel = new InfiToolTrowel(PropsHelperInfi2x2.steelTrowelID+12, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Blaze, "blazeSteelTrowel");
            copperSteelTrowel = new InfiToolTrowel(PropsHelperInfi2x2.steelTrowelID+13, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Copper, "copperSteelTrowel");
            bronzeSteelTrowel = new InfiToolTrowel(PropsHelperInfi2x2.steelTrowelID+14, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Bronze, "bronzeSteelTrowel");
            workedSteelTrowel = new InfiToolTrowel(PropsHelperInfi2x2.steelTrowelID+15, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.WorkedIron, "workedSteelTrowel");
            steelSteelTrowel = new InfiToolTrowel(PropsHelperInfi2x2.steelTrowelID+16, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Steel, "steelSteelTrowel");
            cobaltSteelTrowel = new InfiToolTrowel(PropsHelperInfi2x2.steelTrowelID+17, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Cobalt, "cobaltSteelTrowel");
            arditeSteelTrowel = new InfiToolTrowel(PropsHelperInfi2x2.steelTrowelID+18, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Ardite, "arditeSteelTrowel");
            uraniumSteelTrowel = new InfiToolTrowel(PropsHelperInfi2x2.steelTrowelID+19, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Bronze, "uraniumSteelTrowel");

            MinecraftForge.setToolClass(woodSteelTrowel, "shovel", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(stoneSteelTrowel, "shovel", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(ironSteelTrowel, "shovel", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(diamondSteelTrowel, "shovel", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(redstoneSteelTrowel, "shovel", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(obsidianSteelTrowel, "shovel", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(boneSteelTrowel, "shovel", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackSteelTrowel, "shovel", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(glowstoneSteelTrowel, "shovel", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(iceSteelTrowel, "shovel", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(slimeSteelTrowel, "shovel", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(cactusSteelTrowel, "shovel", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(blazeSteelTrowel, "shovel", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(copperSteelTrowel, "shovel", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(bronzeSteelTrowel, "shovel", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(workedSteelTrowel, "shovel", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(steelSteelTrowel, "shovel", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(cobaltSteelTrowel, "shovel", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(arditeSteelTrowel, "shovel", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(uraniumSteelTrowel, "shovel", InfiMaterialEnum.Steel.getHarvestLevel());
        }
        
        if(PropsHelperInfi2x2.enableCobaltTools)
        {
        	woodCobaltTrowel = new InfiToolTrowel(PropsHelperInfi2x2.cobaltTrowelID+0, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Wood, "woodCobaltTrowel");
            stoneCobaltTrowel = new InfiToolTrowel(PropsHelperInfi2x2.cobaltTrowelID+1, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Stone, "stoneCobaltTrowel");
            ironCobaltTrowel = new InfiToolTrowel(PropsHelperInfi2x2.cobaltTrowelID+2, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Iron, "ironCobaltTrowel");
            diamondCobaltTrowel = new InfiToolTrowel(PropsHelperInfi2x2.cobaltTrowelID+3,
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Diamond, "diamondCobaltTrowel");
            redstoneCobaltTrowel = new InfiToolTrowel(PropsHelperInfi2x2.cobaltTrowelID+4, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Redstone, "redstoneCobaltTrowel");
            obsidianCobaltTrowel = new InfiToolTrowel(PropsHelperInfi2x2.cobaltTrowelID+5, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Obsidian, "obsidianCobaltTrowel");
            boneCobaltTrowel = new InfiToolTrowel(PropsHelperInfi2x2.cobaltTrowelID+6, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Bone, "boneCobaltTrowel");
            slimeCobaltTrowel = new InfiToolTrowel(PropsHelperInfi2x2.cobaltTrowelID+7, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Slime, "slimeCobaltTrowel");
            cactusCobaltTrowel = new InfiToolTrowel(PropsHelperInfi2x2.cobaltTrowelID+8, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Cactus, "cactusCobaltTrowel");
            blazeCobaltTrowel = new InfiToolTrowel(PropsHelperInfi2x2.cobaltTrowelID+9, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Blaze, "blazeCobaltTrowel");
            copperCobaltTrowel = new InfiToolTrowel(PropsHelperInfi2x2.cobaltTrowelID+10, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Copper, "copperCobaltTrowel");
            bronzeCobaltTrowel = new InfiToolTrowel(PropsHelperInfi2x2.cobaltTrowelID+11, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Bronze, "bronzeCobaltTrowel");
            workedCobaltTrowel = new InfiToolTrowel(PropsHelperInfi2x2.cobaltTrowelID+12, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.WorkedIron, "workedCobaltTrowel");
            steelCobaltTrowel = new InfiToolTrowel(PropsHelperInfi2x2.cobaltTrowelID+13, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Steel, "steelCobaltTrowel");
            cobaltCobaltTrowel = new InfiToolTrowel(PropsHelperInfi2x2.cobaltTrowelID+14, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Cobalt, "cobaltCobaltTrowel");
            arditeCobaltTrowel = new InfiToolTrowel(PropsHelperInfi2x2.cobaltTrowelID+15, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Ardite, "arditeCobaltTrowel");
            manyullynCobaltTrowel = new InfiToolTrowel(PropsHelperInfi2x2.cobaltTrowelID+16, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Manyullyn, "arditeCobaltTrowel");
            uraniumCobaltTrowel = new InfiToolTrowel(PropsHelperInfi2x2.cobaltTrowelID+17, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Bronze, "uraniumCobaltTrowel");
            
            MinecraftForge.setToolClass(woodCobaltTrowel, "shovel", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(stoneCobaltTrowel, "shovel", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(ironCobaltTrowel, "shovel", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(diamondCobaltTrowel, "shovel", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(redstoneCobaltTrowel, "shovel", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(obsidianCobaltTrowel, "shovel", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(boneCobaltTrowel, "shovel", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(slimeCobaltTrowel, "shovel", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(cactusCobaltTrowel, "shovel", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(blazeCobaltTrowel, "shovel", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(copperCobaltTrowel, "shovel", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(bronzeCobaltTrowel, "shovel", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(workedCobaltTrowel, "shovel", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(steelCobaltTrowel, "shovel", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(cobaltCobaltTrowel, "shovel", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(arditeCobaltTrowel, "shovel", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(manyullynCobaltTrowel, "shovel", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(uraniumCobaltTrowel, "shovel", InfiMaterialEnum.Cobalt.getHarvestLevel());
        }
        
        if(PropsHelperInfi2x2.enableArditeTools)
        {
        	woodArditeTrowel = new InfiToolTrowel(PropsHelperInfi2x2.arditeTrowelID+0, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Wood, "woodArditeTrowel");
            stoneArditeTrowel = new InfiToolTrowel(PropsHelperInfi2x2.arditeTrowelID+1, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Stone, "stoneArditeTrowel");
            ironArditeTrowel = new InfiToolTrowel(PropsHelperInfi2x2.arditeTrowelID+2, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Iron, "ironArditeTrowel");
            diamondArditeTrowel = new InfiToolTrowel(PropsHelperInfi2x2.arditeTrowelID+3,
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Diamond, "diamondArditeTrowel");
            redstoneArditeTrowel = new InfiToolTrowel(PropsHelperInfi2x2.arditeTrowelID+4, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Redstone, "redstoneArditeTrowel");
            obsidianArditeTrowel = new InfiToolTrowel(PropsHelperInfi2x2.arditeTrowelID+5, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Obsidian, "obsidianArditeTrowel");
            boneArditeTrowel = new InfiToolTrowel(PropsHelperInfi2x2.arditeTrowelID+6,
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Bone, "boneArditeTrowel");
            slimeArditeTrowel = new InfiToolTrowel(PropsHelperInfi2x2.arditeTrowelID+7, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Slime, "slimeArditeTrowel");
            cactusArditeTrowel = new InfiToolTrowel(PropsHelperInfi2x2.arditeTrowelID+8, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Cactus, "cactusArditeTrowel");
            blazeArditeTrowel = new InfiToolTrowel(PropsHelperInfi2x2.arditeTrowelID+9, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Blaze, "blazeArditeTrowel");
            copperArditeTrowel = new InfiToolTrowel(PropsHelperInfi2x2.arditeTrowelID+10, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Copper, "copperArditeTrowel");
            bronzeArditeTrowel = new InfiToolTrowel(PropsHelperInfi2x2.arditeTrowelID+11, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Bronze, "bronzeArditeTrowel");
            workedArditeTrowel = new InfiToolTrowel(PropsHelperInfi2x2.arditeTrowelID+12, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.WorkedIron, "workedArditeTrowel");
            steelArditeTrowel = new InfiToolTrowel(PropsHelperInfi2x2.arditeTrowelID+13, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Steel, "steelArditeTrowel");
            cobaltArditeTrowel = new InfiToolTrowel(PropsHelperInfi2x2.arditeTrowelID+14, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Cobalt, "cobaltArditeTrowel");
            arditeArditeTrowel = new InfiToolTrowel(PropsHelperInfi2x2.arditeTrowelID+15, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Ardite, "arditeArditeTrowel");
            manyullynArditeTrowel = new InfiToolTrowel(PropsHelperInfi2x2.arditeTrowelID+16, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Manyullyn, "arditeArditeTrowel");
            uraniumArditeTrowel = new InfiToolTrowel(PropsHelperInfi2x2.arditeTrowelID+17, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Bronze, "uraniumArditeTrowel");
            
            MinecraftForge.setToolClass(woodArditeTrowel, "shovel", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(stoneArditeTrowel, "shovel", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(ironArditeTrowel, "shovel", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(diamondArditeTrowel, "shovel", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(redstoneArditeTrowel, "shovel", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(obsidianArditeTrowel, "shovel", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(boneArditeTrowel, "shovel", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(slimeArditeTrowel, "shovel", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(cactusArditeTrowel, "shovel", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(blazeArditeTrowel, "shovel", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(copperArditeTrowel, "shovel", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(bronzeArditeTrowel, "shovel", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(workedArditeTrowel, "shovel", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(steelArditeTrowel, "shovel", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(cobaltArditeTrowel, "shovel", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(arditeArditeTrowel, "shovel", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(manyullynArditeTrowel, "shovel", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(uraniumArditeTrowel, "shovel", InfiMaterialEnum.Ardite.getHarvestLevel());
        }
        
        if(PropsHelperInfi2x2.enableManyullynTools)
        {
        	woodManyullynTrowel = new InfiToolTrowel(PropsHelperInfi2x2.manyullynTrowelID+0, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Stone, "woodManyullynTrowel");
            stoneManyullynTrowel = new InfiToolTrowel(PropsHelperInfi2x2.manyullynTrowelID+1, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Stone, "stoneManyullynTrowel");
            ironManyullynTrowel = new InfiToolTrowel(PropsHelperInfi2x2.manyullynTrowelID+2, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Iron, "ironManyullynTrowel");
            diamondManyullynTrowel = new InfiToolTrowel(PropsHelperInfi2x2.manyullynTrowelID+3,
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Diamond, "diamondManyullynTrowel");
            redstoneManyullynTrowel = new InfiToolTrowel(PropsHelperInfi2x2.manyullynTrowelID+4, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Redstone, "redstoneManyullynTrowel");
            obsidianManyullynTrowel = new InfiToolTrowel(PropsHelperInfi2x2.manyullynTrowelID+5, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Obsidian, "obsidianManyullynTrowel");
            boneManyullynTrowel = new InfiToolTrowel(PropsHelperInfi2x2.manyullynTrowelID+6, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Bone, "boneManyullynTrowel");
            slimeManyullynTrowel = new InfiToolTrowel(PropsHelperInfi2x2.manyullynTrowelID+7, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Slime, "slimeManyullynTrowel");
            cactusManyullynTrowel = new InfiToolTrowel(PropsHelperInfi2x2.manyullynTrowelID+8, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Cactus, "cactusManyullynTrowel");
            blazeManyullynTrowel = new InfiToolTrowel(PropsHelperInfi2x2.manyullynTrowelID+9, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Blaze, "blazeManyullynTrowel");
            copperManyullynTrowel = new InfiToolTrowel(PropsHelperInfi2x2.manyullynTrowelID+10, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Copper, "copperManyullynTrowel");
            bronzeManyullynTrowel = new InfiToolTrowel(PropsHelperInfi2x2.manyullynTrowelID+11, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Bronze, "bronzeManyullynTrowel");
            workedManyullynTrowel = new InfiToolTrowel(PropsHelperInfi2x2.manyullynTrowelID+12, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.WorkedIron, "workedManyullynTrowel");
            steelManyullynTrowel = new InfiToolTrowel(PropsHelperInfi2x2.manyullynTrowelID+13, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Steel, "steelManyullynTrowel");
            cobaltManyullynTrowel = new InfiToolTrowel(PropsHelperInfi2x2.manyullynTrowelID+14, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Cobalt, "cobaltManyullynTrowel");
            arditeManyullynTrowel = new InfiToolTrowel(PropsHelperInfi2x2.manyullynTrowelID+15, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Ardite, "arditeManyullynTrowel");
            manyullynManyullynTrowel = new InfiToolTrowel(PropsHelperInfi2x2.manyullynTrowelID+16, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Manyullyn, "arditeManyullynTrowel");
            uraniumManyullynTrowel = new InfiToolTrowel(PropsHelperInfi2x2.manyullynTrowelID+17,
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Bronze, "uraniumManyullynTrowel");
            
            MinecraftForge.setToolClass(woodManyullynTrowel, "shovel", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(stoneManyullynTrowel, "shovel", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(ironManyullynTrowel, "shovel", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(diamondManyullynTrowel, "shovel", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(redstoneManyullynTrowel, "shovel", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(obsidianManyullynTrowel, "shovel", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(boneManyullynTrowel, "shovel", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(slimeManyullynTrowel, "shovel", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(cactusManyullynTrowel, "shovel", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(blazeManyullynTrowel, "shovel", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(copperManyullynTrowel, "shovel", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(bronzeManyullynTrowel, "shovel", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(workedManyullynTrowel, "shovel", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(steelManyullynTrowel, "shovel", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(cobaltManyullynTrowel, "shovel", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(arditeManyullynTrowel, "shovel", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(manyullynManyullynTrowel, "shovel", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(uraniumManyullynTrowel, "shovel", InfiMaterialEnum.Manyullyn.getHarvestLevel());
        }
        
        if(PropsHelperInfi2x2.enableUraniumTools)
        {
            diamondUraniumTrowel = new InfiToolTrowel(PropsHelperInfi2x2.uraniumTrowelID+0, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Diamond, "diamondUraniumTrowel");
            redstoneUraniumTrowel = new InfiToolTrowel(PropsHelperInfi2x2.uraniumTrowelID+1, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Redstone, "redstoneUraniumTrowel");
            boneUraniumTrowel = new InfiToolTrowel(PropsHelperInfi2x2.uraniumTrowelID+2, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Bone, "boneUraniumTrowel");
            netherrackUraniumTrowel = new InfiToolTrowel(PropsHelperInfi2x2.uraniumTrowelID+3, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Netherrack, "netherrackUraniumTrowel");
            glowstoneUraniumTrowel = new InfiToolTrowel(PropsHelperInfi2x2.uraniumTrowelID+4, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Glowstone, "glowstoneUraniumTrowel");
            lavaUraniumTrowel = new InfiToolTrowel(PropsHelperInfi2x2.uraniumTrowelID+5, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Lava, "lavaUraniumTrowel");
            blazeUraniumTrowel = new InfiToolTrowel(PropsHelperInfi2x2.uraniumTrowelID+6, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Blaze, "blazeUraniumTrowel");
            cobaltUraniumTrowel = new InfiToolTrowel(PropsHelperInfi2x2.uraniumTrowelID+7, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Cobalt, "cobaltUraniumTrowel");
            arditeUraniumTrowel = new InfiToolTrowel(PropsHelperInfi2x2.uraniumTrowelID+8, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Ardite, "arditeUraniumTrowel");
            uraniumUraniumTrowel = new InfiToolTrowel(PropsHelperInfi2x2.uraniumTrowelID+9, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Uranium, "uraniumUraniumTrowel");
            
            MinecraftForge.setToolClass(diamondUraniumTrowel, "shovel", InfiMaterialEnum.Uranium.getHarvestLevel());
            MinecraftForge.setToolClass(redstoneUraniumTrowel, "shovel", InfiMaterialEnum.Uranium.getHarvestLevel());
            MinecraftForge.setToolClass(boneUraniumTrowel, "shovel", InfiMaterialEnum.Uranium.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackUraniumTrowel, "shovel", InfiMaterialEnum.Uranium.getHarvestLevel());
            MinecraftForge.setToolClass(glowstoneUraniumTrowel, "shovel", InfiMaterialEnum.Uranium.getHarvestLevel());
            MinecraftForge.setToolClass(lavaUraniumTrowel, "shovel", InfiMaterialEnum.Uranium.getHarvestLevel());
            MinecraftForge.setToolClass(blazeUraniumTrowel, "shovel", InfiMaterialEnum.Uranium.getHarvestLevel());
            MinecraftForge.setToolClass(cobaltUraniumTrowel, "shovel", InfiMaterialEnum.Uranium.getHarvestLevel());
            MinecraftForge.setToolClass(arditeUraniumTrowel, "shovel", InfiMaterialEnum.Uranium.getHarvestLevel());
            MinecraftForge.setToolClass(uraniumUraniumTrowel, "shovel", InfiMaterialEnum.Uranium.getHarvestLevel());
        }
    }
    
    private static void addNames()
    {
    	ModLoader.addName(woodWoodTrowel, "Wooden Trowel");
    	ModLoader.addName(stoneStoneTrowel, "Heavy Trowel");
    	ModLoader.addName(ironIronTrowel, "Ironic Trowel");
    	ModLoader.addName(diamondDiamondTrowel, "Diamondium Trowel");
    	ModLoader.addName(redstoneRedstoneTrowel, "Redredred Trowel");
    	ModLoader.addName(obsidianObsidianTrowel, "Ebony Trowel");
    	ModLoader.addName(sandstoneSandstoneTrowel, "Fragile Trowel");
    	ModLoader.addName(boneBoneTrowel, "Necrotic Trowel");
    	ModLoader.addName(paperPaperTrowel, "Soft Trowel");
    	ModLoader.addName(mossyMossyTrowel, "Living Trowel");
    	ModLoader.addName(netherrackNetherrackTrowel, "Blood Trowel");
    	ModLoader.addName(glowstoneGlowstoneTrowel, "Bright Trowel");
    	ModLoader.addName(iceIceTrowel, "Freezing Trowel");
    	ModLoader.addName(lavaLavaTrowel, "Burning Trowel");
    	ModLoader.addName(slimeSlimeTrowel, "Toy Trowel");
    	ModLoader.addName(cactusCactusTrowel, "Thorned Trowel");
    	ModLoader.addName(flintFlintTrowel, "Rough-hewn Trowel");
    	ModLoader.addName(blazeBlazeTrowel, "Netherite Trowel");
        ModLoader.addName(copperCopperTrowel, "Orange-Tang Trowel");
        ModLoader.addName(bronzeBronzeTrowel, "Polished Trowel");
        ModLoader.addName(workedWorkedIronTrowel, "Reworked Iron Trowel");
        ModLoader.addName(steelSteelTrowel, "Forge-Wrought Trowel");
        ModLoader.addName(cobaltCobaltTrowel, "Beautiful Trowel");
        ModLoader.addName(arditeArditeTrowel, "Rustic Trowel");
        ModLoader.addName(manyullynManyullynTrowel, "False-Prophetic Trowel");
        ModLoader.addName(uraniumUraniumTrowel, "Cancerous Trowel");
    }
    
    public static void registerInfiToolsRecipes()
    {
    	if(PropsHelperInfi2x2.enableWoodTools)
        {
            ModLoader.addRecipe(new ItemStack(woodWoodTrowel), new Object[] 
                    { recipe, '#', Block.planks, '|', Item.stick });
            ModLoader.addRecipe(new ItemStack(sandstoneWoodTrowel), new Object[] 
                    { recipe, '#', Block.planks, '|', mod_InfiBase.sandstoneRod });
            ModLoader.addRecipe(new ItemStack(boneWoodTrowel), new Object[] 
                    { recipe, '#', Block.planks, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneWoodTrowel), new Object[] 
                    { recipe, '#', Block.planks, '|', mod_InfiBase.boneRod });
            ModLoader.addRecipe(new ItemStack(paperWoodTrowel), new Object[] 
                    { recipe, '#', Block.planks, '|', mod_InfiBase.paperRod });
            ModLoader.addRecipe(new ItemStack(iceWoodTrowel), new Object[] 
                    { recipe, '#', Block.planks, '|', mod_InfiBase.iceRod });
            ModLoader.addRecipe(new ItemStack(slimeWoodTrowel), new Object[] 
                    { recipe, '#', Block.planks, '|', mod_InfiBase.slimeRod });
            ModLoader.addRecipe(new ItemStack(cactusWoodTrowel), new Object[] 
                    { recipe, '#', Block.planks, '|', mod_InfiBase.cactusRod });
        }
    	
        if(PropsHelperInfi2x2.enableStoneTools)
        {
        	ModLoader.addRecipe(new ItemStack(woodStoneTrowel), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', Item.stick });
        	ModLoader.addRecipe(new ItemStack(stoneStoneTrowel), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', mod_InfiBase.stoneRod });
            ModLoader.addRecipe(new ItemStack(sandstoneStoneTrowel), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', mod_InfiBase.sandstoneRod });
            ModLoader.addRecipe(new ItemStack(boneStoneTrowel), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneStoneTrowel), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', mod_InfiBase.boneRod });
            ModLoader.addRecipe(new ItemStack(netherrackStoneTrowel), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', mod_InfiBase.netherrackRod });
            ModLoader.addRecipe(new ItemStack(iceStoneTrowel), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', mod_InfiBase.iceRod });
            ModLoader.addRecipe(new ItemStack(slimeStoneTrowel), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', mod_InfiBase.slimeRod });
            ModLoader.addRecipe(new ItemStack(cactusStoneTrowel), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', mod_InfiBase.cactusRod });
            ModLoader.addRecipe(new ItemStack(flintStoneTrowel), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', mod_InfiBase.flintRod });
            
            ModLoader.addRecipe(new ItemStack(woodStoneTrowel), new Object[] 
                    { recipe, '#', Block.stone, '|', Item.stick });
        	ModLoader.addRecipe(new ItemStack(stoneStoneTrowel), new Object[] 
                    { recipe, '#', Block.stone, '|', mod_InfiBase.stoneRod });
            ModLoader.addRecipe(new ItemStack(sandstoneStoneTrowel), new Object[] 
                    { recipe, '#', Block.stone, '|', mod_InfiBase.sandstoneRod });
            ModLoader.addRecipe(new ItemStack(boneStoneTrowel), new Object[] 
                    { recipe, '#', Block.stone, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneStoneTrowel), new Object[] 
                    { recipe, '#', Block.stone, '|', mod_InfiBase.boneRod });
            ModLoader.addRecipe(new ItemStack(netherrackStoneTrowel), new Object[] 
                    { recipe, '#', Block.stone, '|', mod_InfiBase.netherrackRod });
            ModLoader.addRecipe(new ItemStack(iceStoneTrowel), new Object[] 
                    { recipe, '#', Block.stone, '|', mod_InfiBase.iceRod });
            ModLoader.addRecipe(new ItemStack(slimeStoneTrowel), new Object[] 
                    { recipe, '#', Block.stone, '|', mod_InfiBase.slimeRod });
            ModLoader.addRecipe(new ItemStack(cactusStoneTrowel), new Object[] 
                    { recipe, '#', Block.stone, '|', mod_InfiBase.cactusRod });
            ModLoader.addRecipe(new ItemStack(flintStoneTrowel), new Object[] 
                    { recipe, '#', Block.stone, '|', mod_InfiBase.flintRod });
        }
        
        if(PropsHelperInfi2x2.enableIronTools)
        {
        	ModLoader.addRecipe(new ItemStack(woodIronTrowel), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', Item.stick });
        	ModLoader.addRecipe(new ItemStack(stoneIronTrowel), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', mod_InfiBase.stoneRod });
            ModLoader.addRecipe(new ItemStack(ironIronTrowel), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', mod_InfiBase.ironRod });
            ModLoader.addRecipe(new ItemStack(boneIronTrowel), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneIronTrowel), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', mod_InfiBase.boneRod });
            ModLoader.addRecipe(new ItemStack(netherrackIronTrowel), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', mod_InfiBase.netherrackRod });
            ModLoader.addRecipe(new ItemStack(glowstoneIronTrowel), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', mod_InfiBase.glowstoneRod });
            ModLoader.addRecipe(new ItemStack(cactusIronTrowel), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', mod_InfiBase.cactusRod });
            ModLoader.addRecipe(new ItemStack(copperIronTrowel), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', mod_InfiBase.copperRod });
            ModLoader.addRecipe(new ItemStack(bronzeIronTrowel), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', mod_InfiBase.bronzeRod });
        }
        
        if(PropsHelperInfi2x2.enableDiamondTools)
        {
        	ModLoader.addRecipe(new ItemStack(woodDiamondTrowel), new Object[] 
                    { recipe, '#', Item.diamond, '|', Item.stick });
        	ModLoader.addRecipe(new ItemStack(stoneDiamondTrowel), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.stoneRod });
            ModLoader.addRecipe(new ItemStack(ironDiamondTrowel), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.ironRod });
            ModLoader.addRecipe(new ItemStack(diamondDiamondTrowel), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.diamondRod });
            ModLoader.addRecipe(new ItemStack(redstoneDiamondTrowel), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.redstoneRod });
            ModLoader.addRecipe(new ItemStack(obsidianDiamondTrowel), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.obsidianRod });
            ModLoader.addRecipe(new ItemStack(boneDiamondTrowel), new Object[] 
                    { recipe, '#', Item.diamond, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneDiamondTrowel), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.boneRod });
            ModLoader.addRecipe(new ItemStack(mossyDiamondTrowel), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.mossyRod });
            ModLoader.addRecipe(new ItemStack(netherrackDiamondTrowel), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.netherrackRod });
            ModLoader.addRecipe(new ItemStack(glowstoneDiamondTrowel), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.glowstoneRod });
            ModLoader.addRecipe(new ItemStack(lavaDiamondTrowel), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.lavaRod });
            ModLoader.addRecipe(new ItemStack(cactusDiamondTrowel), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.cactusRod });
            ModLoader.addRecipe(new ItemStack(flintDiamondTrowel), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.flintRod });
            ModLoader.addRecipe(new ItemStack(blazeDiamondTrowel), new Object[] 
                    { recipe, '#', Item.diamond, '|', Item.blazeRod });
            ModLoader.addRecipe(new ItemStack(copperDiamondTrowel), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.copperRod });
            ModLoader.addRecipe(new ItemStack(bronzeDiamondTrowel), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.bronzeRod });
            ModLoader.addRecipe(new ItemStack(workedDiamondTrowel), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.workedIronRod });
            ModLoader.addRecipe(new ItemStack(steelDiamondTrowel), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.steelRod });
            ModLoader.addRecipe(new ItemStack(cobaltDiamondTrowel), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.cobaltRod });
            ModLoader.addRecipe(new ItemStack(arditeDiamondTrowel), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.arditeRod });
            ModLoader.addRecipe(new ItemStack(manyullynDiamondTrowel), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.manyullynRod });
            ModLoader.addRecipe(new ItemStack(uraniumDiamondTrowel), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.uraniumRod });
        }
        
        if(PropsHelperInfi2x2.enableRedstoneTools)
        {
        	ModLoader.addRecipe(new ItemStack(woodRedstoneTrowel), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', Item.stick });
        	ModLoader.addRecipe(new ItemStack(stoneRedstoneTrowel), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.stoneRod });
            ModLoader.addRecipe(new ItemStack(ironRedstoneTrowel), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.ironRod });
            ModLoader.addRecipe(new ItemStack(redstoneRedstoneTrowel), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.redstoneRod });
            ModLoader.addRecipe(new ItemStack(obsidianRedstoneTrowel), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.obsidianRod });
            ModLoader.addRecipe(new ItemStack(sandstoneRedstoneTrowel), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.sandstoneRod });
            ModLoader.addRecipe(new ItemStack(boneRedstoneTrowel), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneRedstoneTrowel), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.boneRod });
            ModLoader.addRecipe(new ItemStack(paperRedstoneTrowel), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.paperRod });
            ModLoader.addRecipe(new ItemStack(mossyRedstoneTrowel), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.mossyRod });
            ModLoader.addRecipe(new ItemStack(netherrackRedstoneTrowel), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.netherrackRod });
            ModLoader.addRecipe(new ItemStack(glowstoneRedstoneTrowel), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.glowstoneRod });
            ModLoader.addRecipe(new ItemStack(iceRedstoneTrowel), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.iceRod });
            ModLoader.addRecipe(new ItemStack(lavaRedstoneTrowel), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.lavaRod });
            ModLoader.addRecipe(new ItemStack(slimeRedstoneTrowel), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.slimeRod });
            ModLoader.addRecipe(new ItemStack(cactusRedstoneTrowel), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.cactusRod });
            ModLoader.addRecipe(new ItemStack(flintRedstoneTrowel), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.flintRod });
            ModLoader.addRecipe(new ItemStack(copperRedstoneTrowel), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.copperRod });
            ModLoader.addRecipe(new ItemStack(bronzeRedstoneTrowel), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.bronzeRod });
            ModLoader.addRecipe(new ItemStack(workedRedstoneTrowel), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.workedIronRod });
            ModLoader.addRecipe(new ItemStack(uraniumRedstoneTrowel), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.uraniumRod });
        }
        
        if(PropsHelperInfi2x2.enableObsidianTools)
        {
        	ModLoader.addRecipe(new ItemStack(woodObsidianTrowel), new Object[] 
                    { recipe, '#', Block.obsidian, '|', Item.stick });
        	ModLoader.addRecipe(new ItemStack(stoneObsidianTrowel), new Object[] 
                    { recipe, '#', Block.obsidian, '|', mod_InfiBase.stoneRod });
            ModLoader.addRecipe(new ItemStack(redstoneObsidianTrowel), new Object[] 
                    { recipe, '#', Block.obsidian, '|', mod_InfiBase.redstoneRod });
            ModLoader.addRecipe(new ItemStack(obsidianObsidianTrowel), new Object[] 
                    { recipe, '#', Block.obsidian, '|', mod_InfiBase.obsidianRod });
            ModLoader.addRecipe(new ItemStack(boneObsidianTrowel), new Object[] 
                    { recipe, '#', Block.obsidian, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneObsidianTrowel), new Object[] 
                    { recipe, '#', Block.obsidian, '|', mod_InfiBase.boneRod });
            ModLoader.addRecipe(new ItemStack(netherrackObsidianTrowel), new Object[] 
                    { recipe, '#', Block.obsidian, '|', mod_InfiBase.netherrackRod });
            ModLoader.addRecipe(new ItemStack(glowstoneObsidianTrowel), new Object[] 
                    { recipe, '#', Block.obsidian, '|', mod_InfiBase.glowstoneRod });
            ModLoader.addRecipe(new ItemStack(iceObsidianTrowel), new Object[] 
                    { recipe, '#', Block.obsidian, '|', mod_InfiBase.iceRod });
            ModLoader.addRecipe(new ItemStack(lavaObsidianTrowel), new Object[] 
                    { recipe, '#', Block.obsidian, '|', mod_InfiBase.lavaRod });
            ModLoader.addRecipe(new ItemStack(cactusObsidianTrowel), new Object[] 
                    { recipe, '#', Block.obsidian, '|', mod_InfiBase.cactusRod });
        }
        
        if(PropsHelperInfi2x2.enableSandstoneTools)
        {
            ModLoader.addRecipe(new ItemStack(woodSandstoneTrowel), new Object[] 
                    { recipe, '#', Block.sandStone, '|', Item.stick });
            ModLoader.addRecipe(new ItemStack(sandstoneSandstoneTrowel), new Object[] 
                    { recipe, '#', Block.sandStone, '|', mod_InfiBase.sandstoneRod });
            ModLoader.addRecipe(new ItemStack(boneSandstoneTrowel), new Object[] 
                    { recipe, '#', Block.sandStone, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneSandstoneTrowel), new Object[] 
                    { recipe, '#', Block.sandStone, '|', mod_InfiBase.boneRod });      
            ModLoader.addRecipe(new ItemStack(netherrackSandstoneTrowel), new Object[] 
                    { recipe, '#', Block.sandStone, '|', mod_InfiBase.netherrackRod });
            ModLoader.addRecipe(new ItemStack(iceSandstoneTrowel), new Object[] 
                    { recipe, '#', Block.sandStone, '|', mod_InfiBase.iceRod });
            ModLoader.addRecipe(new ItemStack(slimeSandstoneTrowel), new Object[] 
                    { recipe, '#', Block.sandStone, '|', mod_InfiBase.slimeRod });
            ModLoader.addRecipe(new ItemStack(cactusSandstoneTrowel), new Object[] 
                    { recipe, '#', Block.sandStone, '|', mod_InfiBase.cactusRod });
            ModLoader.addRecipe(new ItemStack(flintSandstoneTrowel), new Object[] 
                    { recipe, '#', Block.sandStone, '|', mod_InfiBase.flintRod });
        }
        
        if(PropsHelperInfi2x2.enableBoneTools)
        {
            ModLoader.addRecipe(new ItemStack(woodBoneTrowel), new Object[] 
                    { recipe, '#', Item.bone, '|', Item.stick });
            ModLoader.addRecipe(new ItemStack(stoneBoneTrowel), new Object[] 
                    { recipe, '#', Item.bone, '|', mod_InfiBase.stoneRod });
            ModLoader.addRecipe(new ItemStack(sandstoneBoneTrowel), new Object[] 
                    { recipe, '#', Item.bone, '|', mod_InfiBase.sandstoneRod });
            ModLoader.addRecipe(new ItemStack(boneBoneTrowel), new Object[] 
                    { recipe, '#', Item.bone, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneBoneTrowel), new Object[] 
                    { recipe, '#', Item.bone, '|', mod_InfiBase.boneRod });
            ModLoader.addRecipe(new ItemStack(paperBoneTrowel), new Object[] 
                    { recipe, '#', Item.bone, '|', mod_InfiBase.paperRod });
            ModLoader.addRecipe(new ItemStack(netherrackBoneTrowel), new Object[] 
                    { recipe, '#', Item.bone, '|', mod_InfiBase.netherrackRod });
            ModLoader.addRecipe(new ItemStack(iceBoneTrowel), new Object[] 
                    { recipe, '#', Item.bone, '|', mod_InfiBase.iceRod });
            ModLoader.addRecipe(new ItemStack(cactusBoneTrowel), new Object[] 
                    { recipe, '#', Item.bone, '|', mod_InfiBase.cactusRod });
            ModLoader.addRecipe(new ItemStack(flintBoneTrowel), new Object[] 
                    { recipe, '#', Item.bone, '|', mod_InfiBase.flintRod });
        }
        
        if(PropsHelperInfi2x2.enablePaperTools)
        {
            ModLoader.addRecipe(new ItemStack(woodPaperTrowel), new Object[] 
                    { recipe, '#', mod_InfiBase.paperStack, '|', Item.stick });
            ModLoader.addRecipe(new ItemStack(bonePaperTrowel), new Object[] 
                    { recipe, '#', mod_InfiBase.paperStack, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(bonePaperTrowel), new Object[] 
                    { recipe, '#', mod_InfiBase.paperStack, '|', mod_InfiBase.boneRod });
            ModLoader.addRecipe(new ItemStack(paperPaperTrowel), new Object[] 
                    { recipe, '#', mod_InfiBase.paperStack, '|', mod_InfiBase.paperRod });
            ModLoader.addRecipe(new ItemStack(slimePaperTrowel), new Object[] 
                    { recipe, '#', mod_InfiBase.paperStack, '|', mod_InfiBase.slimeRod });
            ModLoader.addRecipe(new ItemStack(cactusPaperTrowel), new Object[] 
                    { recipe, '#', mod_InfiBase.paperStack, '|', mod_InfiBase.cactusRod });
        }
        
        if(PropsHelperInfi2x2.enableMossyTools)
        {
        	ModLoader.addRecipe(new ItemStack(woodMossyTrowel), new Object[] 
                    { recipe, '#', mod_InfiBase.mossyStone, '|', Item.stick });
        	ModLoader.addRecipe(new ItemStack(stoneMossyTrowel), new Object[] 
                    { recipe, '#', mod_InfiBase.mossyStone, '|', mod_InfiBase.stoneRod });
            ModLoader.addRecipe(new ItemStack(diamondMossyTrowel), new Object[] 
                    { recipe, '#', mod_InfiBase.mossyStone, '|', mod_InfiBase.diamondRod });
            ModLoader.addRecipe(new ItemStack(redstoneMossyTrowel), new Object[] 
                    { recipe, '#', mod_InfiBase.mossyStone, '|', mod_InfiBase.redstoneRod });
            ModLoader.addRecipe(new ItemStack(boneMossyTrowel), new Object[] 
                    { recipe, '#', mod_InfiBase.mossyStone, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneMossyTrowel), new Object[] 
                    { recipe, '#', mod_InfiBase.mossyStone, '|', mod_InfiBase.boneRod });
            ModLoader.addRecipe(new ItemStack(mossyMossyTrowel), new Object[] 
                    { recipe, '#', mod_InfiBase.mossyStone, '|', mod_InfiBase.mossyRod });
            ModLoader.addRecipe(new ItemStack(netherrackMossyTrowel), new Object[] 
                    { recipe, '#', mod_InfiBase.mossyStone, '|', mod_InfiBase.netherrackRod });
            ModLoader.addRecipe(new ItemStack(glowstoneMossyTrowel), new Object[] 
                    { recipe, '#', mod_InfiBase.mossyStone, '|', mod_InfiBase.glowstoneRod });
            ModLoader.addRecipe(new ItemStack(cactusMossyTrowel), new Object[] 
                    { recipe, '#', mod_InfiBase.mossyStone, '|', mod_InfiBase.cactusRod });
            ModLoader.addRecipe(new ItemStack(blazeMossyTrowel), new Object[] 
                    { recipe, '#', mod_InfiBase.mossyStone, '|', Item.blazeRod });
            ModLoader.addRecipe(new ItemStack(manyullynMossyTrowel), new Object[] 
                    { recipe, '#', mod_InfiBase.mossyStone, '|', mod_InfiBase.manyullynRod });
            ModLoader.addRecipe(new ItemStack(uraniumMossyTrowel), new Object[] 
                    { recipe, '#', mod_InfiBase.mossyStone, '|', mod_InfiBase.uraniumRod });
        }
        
        if(PropsHelperInfi2x2.enableNetherrackTools)
        {
        	ModLoader.addRecipe(new ItemStack(woodNetherrackTrowel), new Object[] 
                    { recipe, '#', Block.netherrack, '|', Item.stick });
        	ModLoader.addRecipe(new ItemStack(stoneNetherrackTrowel), new Object[] 
                    { recipe, '#', Block.netherrack, '|', mod_InfiBase.stoneRod });
            ModLoader.addRecipe(new ItemStack(sandstoneNetherrackTrowel), new Object[] 
                    { recipe, '#', Block.netherrack, '|', mod_InfiBase.sandstoneRod });
            ModLoader.addRecipe(new ItemStack(boneNetherrackTrowel), new Object[] 
                    { recipe, '#', Block.netherrack, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneNetherrackTrowel), new Object[] 
                    { recipe, '#', Block.netherrack, '|', mod_InfiBase.boneRod });
            ModLoader.addRecipe(new ItemStack(paperNetherrackTrowel), new Object[] 
                    { recipe, '#', Block.netherrack, '|', mod_InfiBase.paperRod });
            ModLoader.addRecipe(new ItemStack(mossyNetherrackTrowel), new Object[] 
                    { recipe, '#', Block.netherrack, '|', mod_InfiBase.mossyRod });
            ModLoader.addRecipe(new ItemStack(netherrackNetherrackTrowel), new Object[] 
                    { recipe, '#', Block.netherrack, '|', mod_InfiBase.netherrackRod });
            ModLoader.addRecipe(new ItemStack(iceNetherrackTrowel), new Object[] 
                    { recipe, '#', Block.netherrack, '|', mod_InfiBase.iceRod });
            ModLoader.addRecipe(new ItemStack(slimeNetherrackTrowel), new Object[] 
                    { recipe, '#', Block.netherrack, '|', mod_InfiBase.slimeRod });
            ModLoader.addRecipe(new ItemStack(cactusNetherrackTrowel), new Object[] 
                    { recipe, '#', Block.netherrack, '|', mod_InfiBase.cactusRod });
            ModLoader.addRecipe(new ItemStack(flintNetherrackTrowel), new Object[] 
                    { recipe, '#', Block.netherrack, '|', mod_InfiBase.flintRod });
            ModLoader.addRecipe(new ItemStack(copperNetherrackTrowel), new Object[] 
                    { recipe, '#', Block.netherrack, '|', mod_InfiBase.copperRod });
            ModLoader.addRecipe(new ItemStack(bronzeNetherrackTrowel), new Object[] 
                    { recipe, '#', Block.netherrack, '|', mod_InfiBase.bronzeRod });
        }
        
        if(PropsHelperInfi2x2.enableGlowstoneTools)
        {
        	ModLoader.addRecipe(new ItemStack(woodGlowstoneTrowel), new Object[] 
                    { recipe, '#', mod_InfiBase.glowstoneCrystal, '|', Item.stick });
        	ModLoader.addRecipe(new ItemStack(redstoneGlowstoneTrowel), new Object[] 
                    { recipe, '#', mod_InfiBase.glowstoneCrystal, '|', mod_InfiBase.glowstoneRod });
        	ModLoader.addRecipe(new ItemStack(obsidianGlowstoneTrowel), new Object[] 
                    { recipe, '#', mod_InfiBase.glowstoneCrystal, '|', mod_InfiBase.obsidianRod });
            ModLoader.addRecipe(new ItemStack(boneGlowstoneTrowel), new Object[] 
                    { recipe, '#', mod_InfiBase.glowstoneCrystal, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneGlowstoneTrowel), new Object[] 
                    { recipe, '#', mod_InfiBase.glowstoneCrystal, '|', mod_InfiBase.boneRod });
            ModLoader.addRecipe(new ItemStack(netherrackGlowstoneTrowel), new Object[] 
                    { recipe, '#', mod_InfiBase.glowstoneCrystal, '|', mod_InfiBase.netherrackRod });
            ModLoader.addRecipe(new ItemStack(iceGlowstoneTrowel), new Object[] 
                    { recipe, '#', mod_InfiBase.glowstoneCrystal, '|', mod_InfiBase.iceRod });
            ModLoader.addRecipe(new ItemStack(slimeGlowstoneTrowel), new Object[] 
                    { recipe, '#', mod_InfiBase.glowstoneCrystal, '|', mod_InfiBase.slimeRod });
            ModLoader.addRecipe(new ItemStack(cactusGlowstoneTrowel), new Object[] 
                    { recipe, '#', mod_InfiBase.glowstoneCrystal, '|', mod_InfiBase.cactusRod });
        }
        
        if(PropsHelperInfi2x2.enableIceTools)
        {
            ModLoader.addRecipe(new ItemStack(woodIceTrowel), new Object[] 
                    { recipe, '#', Block.ice, '|', Item.stick });
            ModLoader.addRecipe(new ItemStack(boneIceTrowel), new Object[] 
                    { recipe, '#', Block.ice, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneIceTrowel), new Object[] 
                    { recipe, '#', Block.ice, '|', mod_InfiBase.boneRod });
            ModLoader.addRecipe(new ItemStack(paperIceTrowel), new Object[] 
                    { recipe, '#', Block.ice, '|', mod_InfiBase.paperRod });
            ModLoader.addRecipe(new ItemStack(iceIceTrowel), new Object[] 
                    { recipe, '#', Block.ice, '|', mod_InfiBase.iceRod });
            ModLoader.addRecipe(new ItemStack(slimeIceTrowel), new Object[] 
                    { recipe, '#', Block.ice, '|', mod_InfiBase.slimeRod });
            ModLoader.addRecipe(new ItemStack(cactusIceTrowel), new Object[] 
                    { recipe, '#', Block.ice, '|', mod_InfiBase.cactusRod });
        }
        
        if(PropsHelperInfi2x2.enableLavaTools)
        {
            ModLoader.addRecipe(new ItemStack(diamondLavaTrowel), new Object[] 
                    { recipe, '#', mod_InfiBase.lavaCrystal, '|', mod_InfiBase.diamondRod });
            ModLoader.addRecipe(new ItemStack(obsidianLavaTrowel), new Object[] 
                    { recipe, '#', mod_InfiBase.lavaCrystal, '|', mod_InfiBase.obsidianRod });
            ModLoader.addRecipe(new ItemStack(netherrackLavaTrowel), new Object[] 
                    { recipe, '#', mod_InfiBase.lavaCrystal, '|', mod_InfiBase.netherrackRod });
            ModLoader.addRecipe(new ItemStack(lavaLavaTrowel), new Object[] 
                    { recipe, '#', mod_InfiBase.lavaCrystal, '|', mod_InfiBase.lavaRod });
            ModLoader.addRecipe(new ItemStack(flintLavaTrowel), new Object[] 
                    { recipe, '#', mod_InfiBase.lavaCrystal, '|', mod_InfiBase.flintRod });
            ModLoader.addRecipe(new ItemStack(blazeLavaTrowel), new Object[] 
                    { recipe, '#', mod_InfiBase.lavaCrystal, '|', Item.blazeRod });
            ModLoader.addRecipe(new ItemStack(manyullynLavaTrowel), new Object[] 
                    { recipe, '#', mod_InfiBase.lavaCrystal, '|', mod_InfiBase.manyullynRod });
            ModLoader.addRecipe(new ItemStack(uraniumLavaTrowel), new Object[] 
                    { recipe, '#', mod_InfiBase.lavaCrystal, '|', mod_InfiBase.uraniumRod });
        }
        
        if(PropsHelperInfi2x2.enableSlimeTools)
        {
            ModLoader.addRecipe(new ItemStack(woodSlimeTrowel), new Object[] 
                    { recipe, '#', mod_InfiBase.slimeCrystal, '|', Item.stick });
            ModLoader.addRecipe(new ItemStack(sandstoneSlimeTrowel), new Object[] 
                    { recipe, '#', mod_InfiBase.slimeCrystal, '|', mod_InfiBase.sandstoneRod });
            ModLoader.addRecipe(new ItemStack(boneSlimeTrowel), new Object[] 
                    { recipe, '#', mod_InfiBase.slimeCrystal, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneSlimeTrowel), new Object[] 
                    { recipe, '#', mod_InfiBase.slimeCrystal, '|', mod_InfiBase.boneRod });
            ModLoader.addRecipe(new ItemStack(paperSlimeTrowel), new Object[] 
                    { recipe, '#', mod_InfiBase.slimeCrystal, '|', mod_InfiBase.paperRod });
            ModLoader.addRecipe(new ItemStack(slimeSlimeTrowel), new Object[] 
                    { recipe, '#', mod_InfiBase.slimeCrystal, '|', mod_InfiBase.slimeRod });
            ModLoader.addRecipe(new ItemStack(cactusSlimeTrowel), new Object[] 
                    { recipe, '#', mod_InfiBase.slimeCrystal, '|', mod_InfiBase.cactusRod });
        }
        
        if(PropsHelperInfi2x2.enableCactusTools)
        {
            ModLoader.addRecipe(new ItemStack(woodCactusTrowel), new Object[] 
                    { recipe, '#', Block.cactus, '|', Item.stick });
            ModLoader.addRecipe(new ItemStack(sandstoneCactusTrowel), new Object[] 
                    { recipe, '#', Block.cactus, '|', mod_InfiBase.sandstoneRod });
            ModLoader.addRecipe(new ItemStack(boneCactusTrowel), new Object[] 
                    { recipe, '#', Block.cactus, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneCactusTrowel), new Object[] 
                    { recipe, '#', Block.cactus, '|', mod_InfiBase.boneRod });
            ModLoader.addRecipe(new ItemStack(netherrackCactusTrowel), new Object[] 
                    { recipe, '#', Block.cactus, '|', mod_InfiBase.netherrackRod });
            ModLoader.addRecipe(new ItemStack(iceCactusTrowel), new Object[] 
                    { recipe, '#', Block.cactus, '|', mod_InfiBase.iceRod });
            ModLoader.addRecipe(new ItemStack(slimeCactusTrowel), new Object[] 
                    { recipe, '#', Block.cactus, '|', mod_InfiBase.slimeRod });
            ModLoader.addRecipe(new ItemStack(cactusCactusTrowel), new Object[] 
                    { recipe, '#', Block.cactus, '|', mod_InfiBase.cactusRod });
        }
        
        if(PropsHelperInfi2x2.enableFlintTools)
        {
        	ModLoader.addRecipe(new ItemStack(woodFlintTrowel), new Object[] 
                    { recipe, '#', Item.flint, '|', Item.stick });
        	ModLoader.addRecipe(new ItemStack(stoneFlintTrowel), new Object[] 
                    { recipe, '#', Item.flint, '|', mod_InfiBase.stoneRod });
            ModLoader.addRecipe(new ItemStack(sandstoneFlintTrowel), new Object[] 
                    { recipe, '#', Item.flint, '|', mod_InfiBase.sandstoneRod });
            ModLoader.addRecipe(new ItemStack(boneFlintTrowel), new Object[] 
                    { recipe, '#', Item.flint, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneFlintTrowel), new Object[] 
                    { recipe, '#', Item.flint, '|', mod_InfiBase.boneRod });
            ModLoader.addRecipe(new ItemStack(netherrackFlintTrowel), new Object[] 
                    { recipe, '#', Item.flint, '|', mod_InfiBase.netherrackRod });
            ModLoader.addRecipe(new ItemStack(slimeFlintTrowel), new Object[] 
                    { recipe, '#', Item.flint, '|', mod_InfiBase.slimeRod });
            ModLoader.addRecipe(new ItemStack(cactusFlintTrowel), new Object[] 
                    { recipe, '#', Item.flint, '|', mod_InfiBase.cactusRod });
            ModLoader.addRecipe(new ItemStack(flintFlintTrowel), new Object[] 
                    { recipe, '#', Item.flint, '|', mod_InfiBase.flintRod });
            ModLoader.addRecipe(new ItemStack(copperFlintTrowel), new Object[] 
                    { recipe, '#', Block.netherrack, '|', mod_InfiBase.copperRod });
            ModLoader.addRecipe(new ItemStack(bronzeFlintTrowel), new Object[] 
                    { recipe, '#', Block.netherrack, '|', mod_InfiBase.bronzeRod });
        }
        
        if(PropsHelperInfi2x2.enableBlazeTools)
        {
            ModLoader.addRecipe(new ItemStack(diamondBlazeTrowel), new Object[] 
                    { recipe, '#', mod_InfiBase.blazeCrystal, '|', mod_InfiBase.diamondRod });
            ModLoader.addRecipe(new ItemStack(obsidianBlazeTrowel), new Object[] 
                    { recipe, '#', mod_InfiBase.blazeCrystal, '|', mod_InfiBase.obsidianRod });
            ModLoader.addRecipe(new ItemStack(netherrackBlazeTrowel), new Object[] 
                    { recipe, '#', mod_InfiBase.blazeCrystal, '|', mod_InfiBase.netherrackRod });
            ModLoader.addRecipe(new ItemStack(lavaBlazeTrowel), new Object[] 
                    { recipe, '#', mod_InfiBase.blazeCrystal, '|', mod_InfiBase.lavaRod });
            ModLoader.addRecipe(new ItemStack(flintBlazeTrowel), new Object[] 
                    { recipe, '#', mod_InfiBase.blazeCrystal, '|', mod_InfiBase.flintRod });
            ModLoader.addRecipe(new ItemStack(blazeBlazeTrowel), new Object[] 
                    { recipe, '#', mod_InfiBase.blazeCrystal, '|', Item.blazeRod });
            ModLoader.addRecipe(new ItemStack(manyullynBlazeTrowel), new Object[] 
                    { recipe, '#', mod_InfiBase.blazeCrystal, '|', mod_InfiBase.manyullynRod });
            ModLoader.addRecipe(new ItemStack(uraniumBlazeTrowel), new Object[] 
                    { recipe, '#', mod_InfiBase.blazeCrystal, '|', mod_InfiBase.uraniumRod });
        }
    }
    
    public static void addStoneTools(ItemStack stack)
    {
    	ModLoader.addRecipe(new ItemStack(woodStoneTrowel), new Object[] 
                { recipe, '#', stack, '|', Item.stick });
    	ModLoader.addRecipe(new ItemStack(stoneStoneTrowel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.stoneRod });
        ModLoader.addRecipe(new ItemStack(sandstoneStoneTrowel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.sandstoneRod });
        ModLoader.addRecipe(new ItemStack(boneStoneTrowel), new Object[] 
                { recipe, '#', stack, '|', Item.bone });
        ModLoader.addRecipe(new ItemStack(boneStoneTrowel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.boneRod });
        ModLoader.addRecipe(new ItemStack(netherrackStoneTrowel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.netherrackRod });
        ModLoader.addRecipe(new ItemStack(iceStoneTrowel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.iceRod });
        ModLoader.addRecipe(new ItemStack(slimeStoneTrowel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.slimeRod });
        ModLoader.addRecipe(new ItemStack(cactusStoneTrowel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.cactusRod });
        ModLoader.addRecipe(new ItemStack(flintStoneTrowel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.flintRod });
    }
    
    public static void addCopperTools(ItemStack stack)
    {
    	ModLoader.addRecipe(new ItemStack(woodCopperTrowel), new Object[] 
                { recipe, '#', stack, '|', Item.stick });
        ModLoader.addRecipe(new ItemStack(stoneCopperTrowel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.stoneRod });
        ModLoader.addRecipe(new ItemStack(boneCopperTrowel), new Object[] 
                { recipe, '#', stack, '|', Item.bone });
        ModLoader.addRecipe(new ItemStack(boneCopperTrowel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.boneRod });
        ModLoader.addRecipe(new ItemStack(netherrackCopperTrowel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.netherrackRod });
        ModLoader.addRecipe(new ItemStack(slimeCopperTrowel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.slimeRod });
        ModLoader.addRecipe(new ItemStack(cactusCopperTrowel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.cactusRod });
        ModLoader.addRecipe(new ItemStack(flintCopperTrowel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.flintRod });
        ModLoader.addRecipe(new ItemStack(copperCopperTrowel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.copperRod });
    }
    
    public static void addBronzeTools(ItemStack stack)
    {
    	ModLoader.addRecipe(new ItemStack(woodBronzeTrowel), new Object[] 
                { recipe, '#', stack, '|', Item.stick });
        ModLoader.addRecipe(new ItemStack(stoneBronzeTrowel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.stoneRod });
        ModLoader.addRecipe(new ItemStack(boneBronzeTrowel), new Object[] 
                { recipe, '#', stack, '|', Item.bone });
        ModLoader.addRecipe(new ItemStack(boneBronzeTrowel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.boneRod });
        ModLoader.addRecipe(new ItemStack(netherrackBronzeTrowel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.netherrackRod });
        ModLoader.addRecipe(new ItemStack(slimeBronzeTrowel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.slimeRod });
        ModLoader.addRecipe(new ItemStack(cactusBronzeTrowel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.cactusRod });
        ModLoader.addRecipe(new ItemStack(flintBronzeTrowel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.flintRod });
        ModLoader.addRecipe(new ItemStack(copperBronzeTrowel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.copperRod });
        ModLoader.addRecipe(new ItemStack(bronzeBronzeTrowel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.bronzeRod });
    }
    
    public static void addWorkedIronTools(ItemStack stack)
    {
    	ModLoader.addRecipe(new ItemStack(woodWorkedIronTrowel), new Object[] 
                { recipe, '#', stack, '|', Item.stick });
        ModLoader.addRecipe(new ItemStack(stoneWorkedIronTrowel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.stoneRod });
        ModLoader.addRecipe(new ItemStack(ironWorkedIronTrowel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.ironRod });
        ModLoader.addRecipe(new ItemStack(diamondWorkedIronTrowel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.diamondRod });
        ModLoader.addRecipe(new ItemStack(redstoneWorkedIronTrowel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.redstoneRod });
        ModLoader.addRecipe(new ItemStack(obsidianWorkedIronTrowel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.obsidianRod });
        ModLoader.addRecipe(new ItemStack(boneWorkedIronTrowel), new Object[] 
                { recipe, '#', stack, '|', Item.bone });
        ModLoader.addRecipe(new ItemStack(boneWorkedIronTrowel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.boneRod });
        ModLoader.addRecipe(new ItemStack(netherrackWorkedIronTrowel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.netherrackRod });
        ModLoader.addRecipe(new ItemStack(glowstoneWorkedIronTrowel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.glowstoneRod });
        ModLoader.addRecipe(new ItemStack(iceWorkedIronTrowel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.iceRod });
        ModLoader.addRecipe(new ItemStack(slimeWorkedIronTrowel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.slimeRod });
        ModLoader.addRecipe(new ItemStack(cactusWorkedIronTrowel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.cactusRod });
        ModLoader.addRecipe(new ItemStack(blazeWorkedIronTrowel), new Object[] 
                { recipe, '#', stack, '|', Item.blazeRod });
        ModLoader.addRecipe(new ItemStack(copperWorkedIronTrowel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.copperRod });
        ModLoader.addRecipe(new ItemStack(bronzeWorkedIronTrowel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.bronzeRod });
        ModLoader.addRecipe(new ItemStack(workedWorkedIronTrowel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.workedIronRod });
        ModLoader.addRecipe(new ItemStack(steelWorkedIronTrowel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.steelRod });
        ModLoader.addRecipe(new ItemStack(uraniumWorkedIronTrowel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.uraniumRod });
    }
    
    public static void addSteelTools(ItemStack stack)
    {
    	ModLoader.addRecipe(new ItemStack(woodSteelTrowel), new Object[] 
                { recipe, '#', stack, '|', Item.stick });
        ModLoader.addRecipe(new ItemStack(stoneSteelTrowel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.stoneRod });
        ModLoader.addRecipe(new ItemStack(ironSteelTrowel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.ironRod });
        ModLoader.addRecipe(new ItemStack(diamondSteelTrowel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.diamondRod });
        ModLoader.addRecipe(new ItemStack(redstoneSteelTrowel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.redstoneRod });
        ModLoader.addRecipe(new ItemStack(obsidianSteelTrowel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.obsidianRod });
        ModLoader.addRecipe(new ItemStack(boneSteelTrowel), new Object[] 
                { recipe, '#', stack, '|', Item.bone });
        ModLoader.addRecipe(new ItemStack(boneSteelTrowel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.boneRod });
        ModLoader.addRecipe(new ItemStack(netherrackSteelTrowel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.netherrackRod });
        ModLoader.addRecipe(new ItemStack(glowstoneSteelTrowel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.glowstoneRod });
        ModLoader.addRecipe(new ItemStack(iceSteelTrowel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.iceRod });
        ModLoader.addRecipe(new ItemStack(slimeSteelTrowel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.slimeRod });
        ModLoader.addRecipe(new ItemStack(cactusSteelTrowel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.cactusRod });
        ModLoader.addRecipe(new ItemStack(blazeSteelTrowel), new Object[] 
                { recipe, '#', stack, '|', Item.blazeRod });
        ModLoader.addRecipe(new ItemStack(copperSteelTrowel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.copperRod });
        ModLoader.addRecipe(new ItemStack(bronzeSteelTrowel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.bronzeRod });
        ModLoader.addRecipe(new ItemStack(workedSteelTrowel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.workedIronRod });
        ModLoader.addRecipe(new ItemStack(steelSteelTrowel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.steelRod });
        ModLoader.addRecipe(new ItemStack(cobaltSteelTrowel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.cobaltRod });
        ModLoader.addRecipe(new ItemStack(arditeSteelTrowel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.arditeRod });
        ModLoader.addRecipe(new ItemStack(uraniumSteelTrowel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.uraniumRod });
    }
    
    public static void addCobaltTools(ItemStack stack)
    {
    	ModLoader.addRecipe(new ItemStack(woodCobaltTrowel), new Object[] 
                { recipe, '#', stack, '|', Item.stick });
        ModLoader.addRecipe(new ItemStack(stoneCobaltTrowel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.stoneRod });
        ModLoader.addRecipe(new ItemStack(ironCobaltTrowel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.ironRod });
        ModLoader.addRecipe(new ItemStack(diamondCobaltTrowel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.diamondRod });
        ModLoader.addRecipe(new ItemStack(redstoneCobaltTrowel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.redstoneRod });
        ModLoader.addRecipe(new ItemStack(obsidianCobaltTrowel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.obsidianRod });
        ModLoader.addRecipe(new ItemStack(boneCobaltTrowel), new Object[] 
                { recipe, '#', stack, '|', Item.bone });
        ModLoader.addRecipe(new ItemStack(boneCobaltTrowel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.boneRod });
        ModLoader.addRecipe(new ItemStack(slimeCobaltTrowel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.slimeRod });
        ModLoader.addRecipe(new ItemStack(cactusCobaltTrowel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.cactusRod });
        ModLoader.addRecipe(new ItemStack(blazeCobaltTrowel), new Object[] 
                { recipe, '#', stack, '|', Item.blazeRod });
        ModLoader.addRecipe(new ItemStack(copperCobaltTrowel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.copperRod });
        ModLoader.addRecipe(new ItemStack(bronzeCobaltTrowel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.bronzeRod });
        ModLoader.addRecipe(new ItemStack(workedCobaltTrowel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.workedIronRod });
        ModLoader.addRecipe(new ItemStack(steelCobaltTrowel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.steelRod });
        ModLoader.addRecipe(new ItemStack(cobaltCobaltTrowel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.cobaltRod });
        ModLoader.addRecipe(new ItemStack(arditeCobaltTrowel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.arditeRod });
        ModLoader.addRecipe(new ItemStack(manyullynCobaltTrowel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.manyullynRod });
        ModLoader.addRecipe(new ItemStack(uraniumCobaltTrowel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.uraniumRod });
    }
    
    public static void addArditeTools(ItemStack stack)
    {
    	ModLoader.addRecipe(new ItemStack(woodArditeTrowel), new Object[] 
                { recipe, '#', stack, '|', Item.stick });
        ModLoader.addRecipe(new ItemStack(stoneArditeTrowel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.stoneRod });
        ModLoader.addRecipe(new ItemStack(ironArditeTrowel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.ironRod });
        ModLoader.addRecipe(new ItemStack(diamondArditeTrowel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.diamondRod });
        ModLoader.addRecipe(new ItemStack(redstoneArditeTrowel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.redstoneRod });
        ModLoader.addRecipe(new ItemStack(obsidianArditeTrowel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.obsidianRod });
        ModLoader.addRecipe(new ItemStack(boneArditeTrowel), new Object[] 
                { recipe, '#', stack, '|', Item.bone });
        ModLoader.addRecipe(new ItemStack(boneArditeTrowel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.boneRod });
        ModLoader.addRecipe(new ItemStack(slimeArditeTrowel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.slimeRod });
        ModLoader.addRecipe(new ItemStack(cactusArditeTrowel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.cactusRod });
        ModLoader.addRecipe(new ItemStack(blazeArditeTrowel), new Object[] 
                { recipe, '#', stack, '|', Item.blazeRod });
        ModLoader.addRecipe(new ItemStack(copperArditeTrowel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.copperRod });
        ModLoader.addRecipe(new ItemStack(bronzeArditeTrowel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.bronzeRod });
        ModLoader.addRecipe(new ItemStack(workedArditeTrowel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.workedIronRod });
        ModLoader.addRecipe(new ItemStack(steelArditeTrowel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.steelRod });
        ModLoader.addRecipe(new ItemStack(cobaltArditeTrowel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.cobaltRod });
        ModLoader.addRecipe(new ItemStack(arditeArditeTrowel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.arditeRod });
        ModLoader.addRecipe(new ItemStack(manyullynArditeTrowel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.manyullynRod });
        ModLoader.addRecipe(new ItemStack(uraniumArditeTrowel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.uraniumRod });
    }
    
    public static void addManyullynTools(ItemStack stack)
    {
    	ModLoader.addRecipe(new ItemStack(woodManyullynTrowel), new Object[] 
                { recipe, '#', stack, '|', Item.stick });
        ModLoader.addRecipe(new ItemStack(stoneManyullynTrowel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.stoneRod });
        ModLoader.addRecipe(new ItemStack(ironManyullynTrowel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.ironRod });
        ModLoader.addRecipe(new ItemStack(diamondManyullynTrowel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.diamondRod });
        ModLoader.addRecipe(new ItemStack(redstoneManyullynTrowel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.redstoneRod });
        ModLoader.addRecipe(new ItemStack(obsidianManyullynTrowel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.obsidianRod });
        ModLoader.addRecipe(new ItemStack(boneManyullynTrowel), new Object[] 
                { recipe, '#', stack, '|', Item.bone });
        ModLoader.addRecipe(new ItemStack(boneManyullynTrowel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.boneRod });
        ModLoader.addRecipe(new ItemStack(slimeManyullynTrowel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.slimeRod });
        ModLoader.addRecipe(new ItemStack(cactusManyullynTrowel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.cactusRod });
        ModLoader.addRecipe(new ItemStack(blazeManyullynTrowel), new Object[] 
                { recipe, '#', stack, '|', Item.blazeRod });
        ModLoader.addRecipe(new ItemStack(copperManyullynTrowel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.copperRod });
        ModLoader.addRecipe(new ItemStack(bronzeManyullynTrowel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.bronzeRod });
        ModLoader.addRecipe(new ItemStack(workedManyullynTrowel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.workedIronRod });
        ModLoader.addRecipe(new ItemStack(steelManyullynTrowel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.steelRod });
        ModLoader.addRecipe(new ItemStack(cobaltManyullynTrowel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.cobaltRod });
        ModLoader.addRecipe(new ItemStack(arditeManyullynTrowel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.arditeRod });
        ModLoader.addRecipe(new ItemStack(manyullynManyullynTrowel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.manyullynRod });
        ModLoader.addRecipe(new ItemStack(uraniumManyullynTrowel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.uraniumRod });
    }
    
    public static void addUraniumTools(ItemStack stack)
    {
        ModLoader.addRecipe(new ItemStack(diamondUraniumTrowel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.diamondRod });
        ModLoader.addRecipe(new ItemStack(redstoneUraniumTrowel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.redstoneRod });
        ModLoader.addRecipe(new ItemStack(boneUraniumTrowel), new Object[] 
                { recipe, '#', stack, '|', Item.bone });
        ModLoader.addRecipe(new ItemStack(boneUraniumTrowel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.boneRod });
        ModLoader.addRecipe(new ItemStack(netherrackUraniumTrowel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.netherrackRod });
        ModLoader.addRecipe(new ItemStack(glowstoneUraniumTrowel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.glowstoneRod });
        ModLoader.addRecipe(new ItemStack(lavaUraniumTrowel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.lavaRod });
        ModLoader.addRecipe(new ItemStack(blazeUraniumTrowel), new Object[] 
                { recipe, '#', stack, '|', Item.blazeRod });
        ModLoader.addRecipe(new ItemStack(cobaltUraniumTrowel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.cobaltRod });
        ModLoader.addRecipe(new ItemStack(arditeUraniumTrowel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.arditeRod });
        ModLoader.addRecipe(new ItemStack(uraniumUraniumTrowel), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.uraniumRod });
    }
    
	public static Item woodWoodTrowel;
	public static Item sandstoneWoodTrowel;
	public static Item boneWoodTrowel;
	public static Item paperWoodTrowel;
	public static Item iceWoodTrowel;
	public static Item slimeWoodTrowel;
	public static Item cactusWoodTrowel;
	
	public static Item woodStoneTrowel;
	public static Item stoneStoneTrowel;
	public static Item sandstoneStoneTrowel;
	public static Item boneStoneTrowel;
	public static Item netherrackStoneTrowel;
	public static Item iceStoneTrowel;
	public static Item slimeStoneTrowel;
	public static Item cactusStoneTrowel;
	public static Item flintStoneTrowel;
	
	public static Item woodIronTrowel;
	public static Item stoneIronTrowel;
	public static Item ironIronTrowel;
	public static Item boneIronTrowel;
	public static Item netherrackIronTrowel;
	public static Item glowstoneIronTrowel;
	public static Item cactusIronTrowel;
	public static Item copperIronTrowel;
	public static Item bronzeIronTrowel;
	
	public static Item woodDiamondTrowel;
	public static Item stoneDiamondTrowel;
	public static Item ironDiamondTrowel;
	public static Item diamondDiamondTrowel;
	public static Item redstoneDiamondTrowel;
	public static Item obsidianDiamondTrowel;
	public static Item boneDiamondTrowel;
	public static Item mossyDiamondTrowel;
	public static Item netherrackDiamondTrowel;
	public static Item glowstoneDiamondTrowel;
	public static Item lavaDiamondTrowel;
	public static Item cactusDiamondTrowel;
	public static Item flintDiamondTrowel;
	public static Item blazeDiamondTrowel;
	public static Item copperDiamondTrowel;
	public static Item bronzeDiamondTrowel;
	public static Item workedDiamondTrowel;
	public static Item steelDiamondTrowel;
	public static Item cobaltDiamondTrowel;
	public static Item arditeDiamondTrowel;
	public static Item manyullynDiamondTrowel;
	public static Item uraniumDiamondTrowel;
	
	public static Item woodRedstoneTrowel;
	public static Item stoneRedstoneTrowel;
	public static Item ironRedstoneTrowel;
	public static Item redstoneRedstoneTrowel;
	public static Item obsidianRedstoneTrowel;
	public static Item sandstoneRedstoneTrowel;
	public static Item boneRedstoneTrowel;
	public static Item paperRedstoneTrowel;
	public static Item mossyRedstoneTrowel;
	public static Item netherrackRedstoneTrowel;
	public static Item glowstoneRedstoneTrowel;
	public static Item iceRedstoneTrowel;
	public static Item lavaRedstoneTrowel;
	public static Item slimeRedstoneTrowel;
	public static Item cactusRedstoneTrowel;
	public static Item flintRedstoneTrowel;
	public static Item copperRedstoneTrowel;
	public static Item bronzeRedstoneTrowel;
	public static Item workedRedstoneTrowel;
	public static Item uraniumRedstoneTrowel;
	
	public static Item woodObsidianTrowel;
	public static Item stoneObsidianTrowel;
	public static Item redstoneObsidianTrowel;
	public static Item obsidianObsidianTrowel;
	public static Item boneObsidianTrowel;
	public static Item netherrackObsidianTrowel;
	public static Item glowstoneObsidianTrowel;
	public static Item iceObsidianTrowel;
	public static Item lavaObsidianTrowel;
	public static Item cactusObsidianTrowel;
	
	public static Item woodSandstoneTrowel;
	public static Item sandstoneSandstoneTrowel;
	public static Item boneSandstoneTrowel;
	public static Item netherrackSandstoneTrowel;
	public static Item iceSandstoneTrowel;
	public static Item slimeSandstoneTrowel;
	public static Item cactusSandstoneTrowel;
	public static Item flintSandstoneTrowel;
	
	public static Item woodBoneTrowel;
	public static Item stoneBoneTrowel;
	public static Item sandstoneBoneTrowel;
	public static Item boneBoneTrowel;
	public static Item paperBoneTrowel;
	public static Item netherrackBoneTrowel;
	public static Item iceBoneTrowel;
	public static Item cactusBoneTrowel;
	public static Item flintBoneTrowel;
	
	public static Item woodPaperTrowel;
	public static Item bonePaperTrowel;
	public static Item paperPaperTrowel;
	public static Item slimePaperTrowel;
	public static Item cactusPaperTrowel;
	
	public static Item woodMossyTrowel;
	public static Item stoneMossyTrowel;
	public static Item diamondMossyTrowel;
	public static Item redstoneMossyTrowel;
	public static Item boneMossyTrowel;
	public static Item mossyMossyTrowel;
	public static Item netherrackMossyTrowel;
	public static Item glowstoneMossyTrowel;
	public static Item cactusMossyTrowel;
	public static Item blazeMossyTrowel;
	public static Item manyullynMossyTrowel;
	public static Item uraniumMossyTrowel;
	
	public static Item woodNetherrackTrowel;
	public static Item stoneNetherrackTrowel;
	public static Item sandstoneNetherrackTrowel;
	public static Item boneNetherrackTrowel;
	public static Item paperNetherrackTrowel;
	public static Item mossyNetherrackTrowel;
	public static Item netherrackNetherrackTrowel;
	public static Item iceNetherrackTrowel;
	public static Item slimeNetherrackTrowel;
	public static Item cactusNetherrackTrowel;
	public static Item flintNetherrackTrowel;
	public static Item copperNetherrackTrowel;
	public static Item bronzeNetherrackTrowel;
	
	public static Item woodGlowstoneTrowel;
	public static Item redstoneGlowstoneTrowel;
	public static Item obsidianGlowstoneTrowel;
	public static Item boneGlowstoneTrowel;
	public static Item netherrackGlowstoneTrowel;
	public static Item glowstoneGlowstoneTrowel;
	public static Item iceGlowstoneTrowel;
	public static Item slimeGlowstoneTrowel;
	public static Item cactusGlowstoneTrowel;
	
	public static Item woodIceTrowel;
	public static Item boneIceTrowel;
	public static Item paperIceTrowel;
	public static Item iceIceTrowel;
	public static Item slimeIceTrowel;
	public static Item cactusIceTrowel;
	
	public static Item diamondLavaTrowel;
	public static Item obsidianLavaTrowel;
	public static Item netherrackLavaTrowel;
	public static Item lavaLavaTrowel;
	public static Item flintLavaTrowel;
	public static Item blazeLavaTrowel;
	public static Item manyullynLavaTrowel;
	public static Item uraniumLavaTrowel;
	
	public static Item woodSlimeTrowel;
	public static Item sandstoneSlimeTrowel;
	public static Item boneSlimeTrowel;
	public static Item paperSlimeTrowel;
	public static Item slimeSlimeTrowel;
	public static Item cactusSlimeTrowel;
	
	public static Item woodCactusTrowel;
	public static Item sandstoneCactusTrowel;
	public static Item boneCactusTrowel;
	public static Item netherrackCactusTrowel;
	public static Item iceCactusTrowel;
	public static Item slimeCactusTrowel;
	public static Item cactusCactusTrowel;
	
	public static Item woodFlintTrowel;
	public static Item stoneFlintTrowel;
	public static Item sandstoneFlintTrowel;
	public static Item boneFlintTrowel;
	public static Item netherrackFlintTrowel;
	public static Item slimeFlintTrowel;
	public static Item cactusFlintTrowel;
	public static Item flintFlintTrowel;
	public static Item copperFlintTrowel;
	public static Item bronzeFlintTrowel;
	
	public static Item diamondBlazeTrowel;
	public static Item obsidianBlazeTrowel;
	public static Item netherrackBlazeTrowel;
	public static Item lavaBlazeTrowel;
	public static Item flintBlazeTrowel;
	public static Item blazeBlazeTrowel;
	public static Item manyullynBlazeTrowel;
	public static Item uraniumBlazeTrowel;
	
	public static Item woodCopperTrowel;
	public static Item stoneCopperTrowel;
    public static Item boneCopperTrowel;
    public static Item netherrackCopperTrowel;
    public static Item slimeCopperTrowel;
    public static Item cactusCopperTrowel;
    public static Item flintCopperTrowel;
    public static Item copperCopperTrowel;
    
    public static Item woodBronzeTrowel;
    public static Item stoneBronzeTrowel;
    public static Item boneBronzeTrowel;
    public static Item netherrackBronzeTrowel;
    public static Item slimeBronzeTrowel;
    public static Item cactusBronzeTrowel;
    public static Item flintBronzeTrowel;
    public static Item copperBronzeTrowel;
    public static Item bronzeBronzeTrowel;
    
    public static Item woodWorkedIronTrowel;
    public static Item stoneWorkedIronTrowel;
    public static Item ironWorkedIronTrowel;
    public static Item diamondWorkedIronTrowel;
    public static Item redstoneWorkedIronTrowel;
    public static Item obsidianWorkedIronTrowel;
    public static Item boneWorkedIronTrowel;
    public static Item netherrackWorkedIronTrowel;
    public static Item glowstoneWorkedIronTrowel;
    public static Item iceWorkedIronTrowel;
    public static Item slimeWorkedIronTrowel;
    public static Item cactusWorkedIronTrowel;
    public static Item blazeWorkedIronTrowel;
    public static Item copperWorkedIronTrowel;
    public static Item bronzeWorkedIronTrowel;
    public static Item workedWorkedIronTrowel;
    public static Item steelWorkedIronTrowel;
    public static Item uraniumWorkedIronTrowel;
    
    public static Item woodSteelTrowel;
    public static Item stoneSteelTrowel;
    public static Item ironSteelTrowel;
    public static Item diamondSteelTrowel;
    public static Item redstoneSteelTrowel;
    public static Item obsidianSteelTrowel;
    public static Item boneSteelTrowel;
    public static Item netherrackSteelTrowel;
    public static Item glowstoneSteelTrowel;
    public static Item iceSteelTrowel;
    public static Item slimeSteelTrowel;
    public static Item cactusSteelTrowel;
    public static Item blazeSteelTrowel;
    public static Item copperSteelTrowel;
    public static Item bronzeSteelTrowel;
    public static Item workedSteelTrowel;
    public static Item steelSteelTrowel;
    public static Item cobaltSteelTrowel;
    public static Item arditeSteelTrowel;
    public static Item uraniumSteelTrowel;
    
    public static Item woodCobaltTrowel;
    public static Item stoneCobaltTrowel;
    public static Item ironCobaltTrowel;
    public static Item diamondCobaltTrowel;
    public static Item redstoneCobaltTrowel;
    public static Item obsidianCobaltTrowel;
    public static Item boneCobaltTrowel;
    public static Item slimeCobaltTrowel;
    public static Item cactusCobaltTrowel;
    public static Item blazeCobaltTrowel;
    public static Item copperCobaltTrowel;
    public static Item bronzeCobaltTrowel;
    public static Item workedCobaltTrowel;
    public static Item steelCobaltTrowel;
    public static Item cobaltCobaltTrowel;
    public static Item arditeCobaltTrowel;
    public static Item manyullynCobaltTrowel;
    public static Item uraniumCobaltTrowel;
    
    public static Item woodArditeTrowel;
    public static Item stoneArditeTrowel;
    public static Item ironArditeTrowel;
    public static Item diamondArditeTrowel;
    public static Item redstoneArditeTrowel;
    public static Item obsidianArditeTrowel;
    public static Item boneArditeTrowel;
    public static Item slimeArditeTrowel;
    public static Item cactusArditeTrowel;
    public static Item blazeArditeTrowel;
    public static Item copperArditeTrowel;
    public static Item bronzeArditeTrowel;
    public static Item workedArditeTrowel;
    public static Item steelArditeTrowel;
    public static Item cobaltArditeTrowel;
    public static Item arditeArditeTrowel;
    public static Item manyullynArditeTrowel;
    public static Item uraniumArditeTrowel;
    
    public static Item woodManyullynTrowel;
    public static Item stoneManyullynTrowel;
    public static Item ironManyullynTrowel;
    public static Item diamondManyullynTrowel;
    public static Item redstoneManyullynTrowel;
    public static Item obsidianManyullynTrowel;
    public static Item boneManyullynTrowel;
    public static Item slimeManyullynTrowel;
    public static Item cactusManyullynTrowel;
    public static Item blazeManyullynTrowel;
    public static Item copperManyullynTrowel;
    public static Item bronzeManyullynTrowel;
    public static Item workedManyullynTrowel;
    public static Item steelManyullynTrowel;
    public static Item cobaltManyullynTrowel;
    public static Item arditeManyullynTrowel;
    public static Item manyullynManyullynTrowel;
    public static Item uraniumManyullynTrowel;
    
    public static Item diamondUraniumTrowel;
    public static Item redstoneUraniumTrowel;
    public static Item boneUraniumTrowel;
    public static Item netherrackUraniumTrowel;
    public static Item glowstoneUraniumTrowel;
    public static Item lavaUraniumTrowel;
    public static Item blazeUraniumTrowel;
    public static Item cobaltUraniumTrowel;
    public static Item arditeUraniumTrowel;
    public static Item uraniumUraniumTrowel;
}
