package net.minecraft.src.infihybrids;
import net.minecraft.src.Block;
import net.minecraft.src.InfiMaterialEnum;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;
import net.minecraft.src.ModLoader;
import net.minecraft.src.mod_Infi2x2;
import net.minecraft.src.mod_InfiBase;
import net.minecraft.src.mod_InfiHybrids;
import net.minecraft.src.forge.MinecraftForge;

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
    	woodWoodIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.woodIceAxeID+0, 
                InfiMaterialEnum.Wood, InfiMaterialEnum.Wood, "woodWoodIceAxe");
    	woodStoneIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.stoneIceAxeID+0, 
                InfiMaterialEnum.Stone, InfiMaterialEnum.Wood, "woodStoneIceAxe");
    	woodIronIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.ironIceAxeID+0, 
                InfiMaterialEnum.Iron, InfiMaterialEnum.Wood, "woodIronIceAxe");
    	woodDiamondIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.diamondIceAxeID+0, 
                InfiMaterialEnum.Diamond, InfiMaterialEnum.Wood, "woodDiamondIceAxe");
    	
    	MinecraftForge.setToolClass(woodWoodIceAxe, "pickaxe", InfiMaterialEnum.Wood.getHarvestLevel());
    	MinecraftForge.setToolClass(woodStoneIceAxe, "pickaxe", InfiMaterialEnum.Stone.getHarvestLevel());
    	MinecraftForge.setToolClass(woodIronIceAxe, "pickaxe", InfiMaterialEnum.Iron.getHarvestLevel());
    	MinecraftForge.setToolClass(woodDiamondIceAxe, "pickaxe", InfiMaterialEnum.Diamond.getHarvestLevel());
    }
    
    private static void registerVanillaRecipes()
    {
    	ModLoader.addRecipe(new ItemStack(woodWoodIceAxe), new Object[] 
                { recipe, '#', Block.planks, '|', Item.stick, 's', Item.stick });
		ModLoader.addRecipe(new ItemStack(woodStoneIceAxe), new Object[] 
                { recipe, '#', Block.cobblestone, '|', Item.stick, 's', mod_InfiBase.stoneShard });
		ModLoader.addRecipe(new ItemStack(woodIronIceAxe), new Object[] 
                { recipe, '#', Item.ingotIron, '|', Item.stick, 's', mod_InfiBase.ironChunk });
		ModLoader.addRecipe(new ItemStack(woodDiamondIceAxe), new Object[] 
                { recipe, '#', Item.diamond, '|', Item.stick, 's', mod_InfiBase.diamondShard });
    }
    
    private static void createTools()
    {
    	if(PropsHelperInfiHybrids.enableWoodTools)
    	{
    		woodWoodIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.woodIceAxeID+0, 
                    InfiMaterialEnum.Wood, InfiMaterialEnum.Wood, "woodWoodIceAxe");
    		sandstoneWoodIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.woodIceAxeID+1, 
                    InfiMaterialEnum.Wood, InfiMaterialEnum.Sandstone, "sandstoneWoodIceAxe");
    		boneWoodIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.woodIceAxeID+2, 
                    InfiMaterialEnum.Wood, InfiMaterialEnum.Bone, "boneWoodIceAxe");
    		paperWoodIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.woodIceAxeID+3, 
                    InfiMaterialEnum.Wood, InfiMaterialEnum.Paper, "paperWoodIceAxe");
    		iceWoodIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.woodIceAxeID+4, 
                    InfiMaterialEnum.Wood, InfiMaterialEnum.Ice, "iceWoodIceAxe");
    		slimeWoodIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.woodIceAxeID+5, 
                    InfiMaterialEnum.Wood, InfiMaterialEnum.Slime, "slimeWoodIceAxe");
    		cactusWoodIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.woodIceAxeID+6, 
                    InfiMaterialEnum.Wood, InfiMaterialEnum.Cactus, "cactusWoodIceAxe");
    		
    		MinecraftForge.setToolClass(woodWoodIceAxe, "pickaxe", InfiMaterialEnum.Wood.getHarvestLevel());
    		MinecraftForge.setToolClass(sandstoneWoodIceAxe, "pickaxe", InfiMaterialEnum.Wood.getHarvestLevel());
    		MinecraftForge.setToolClass(boneWoodIceAxe, "pickaxe", InfiMaterialEnum.Wood.getHarvestLevel());
    		MinecraftForge.setToolClass(paperWoodIceAxe, "pickaxe", InfiMaterialEnum.Wood.getHarvestLevel());
    		MinecraftForge.setToolClass(iceWoodIceAxe, "pickaxe", InfiMaterialEnum.Wood.getHarvestLevel());
    		MinecraftForge.setToolClass(slimeWoodIceAxe, "pickaxe", InfiMaterialEnum.Wood.getHarvestLevel());
    		MinecraftForge.setToolClass(cactusWoodIceAxe, "pickaxe", InfiMaterialEnum.Wood.getHarvestLevel());
    	}

        if(PropsHelperInfiHybrids.enableStoneTools)
        {
        	woodStoneIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.stoneIceAxeID+0, 
                    InfiMaterialEnum.Stone, InfiMaterialEnum.Wood, "woodStoneIceAxe");
        	stoneStoneIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.stoneIceAxeID+1, 
                    InfiMaterialEnum.Stone, InfiMaterialEnum.Stone, "stoneStoneIceAxe");
        	sandstoneStoneIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.stoneIceAxeID+2, 
                    InfiMaterialEnum.Stone, InfiMaterialEnum.Sandstone, "sandstoneStoneIceAxe");
        	boneStoneIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.stoneIceAxeID+3, 
                    InfiMaterialEnum.Stone, InfiMaterialEnum.Bone, "boneStoneIceAxe");
        	netherrackStoneIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.stoneIceAxeID+4, 
                    InfiMaterialEnum.Stone, InfiMaterialEnum.Netherrack, "netherrackStoneIceAxe");
        	iceStoneIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.stoneIceAxeID+5, 
                    InfiMaterialEnum.Stone, InfiMaterialEnum.Ice, "iceStoneIceAxe");
        	slimeStoneIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.stoneIceAxeID+6, 
                    InfiMaterialEnum.Stone, InfiMaterialEnum.Slime, "slimeStoneIceAxe");
        	cactusStoneIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.stoneIceAxeID+7, 
                    InfiMaterialEnum.Stone, InfiMaterialEnum.Cactus, "cactusStoneIceAxe");
        	flintStoneIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.stoneIceAxeID+8, 
                    InfiMaterialEnum.Stone, InfiMaterialEnum.Flint, "flintStoneIceAxe");
            
            MinecraftForge.setToolClass(woodStoneIceAxe, "pickaxe", InfiMaterialEnum.Stone.getHarvestLevel());
            MinecraftForge.setToolClass(stoneStoneIceAxe, "pickaxe", InfiMaterialEnum.Stone.getHarvestLevel());
            MinecraftForge.setToolClass(sandstoneStoneIceAxe, "pickaxe", InfiMaterialEnum.Stone.getHarvestLevel());
            MinecraftForge.setToolClass(boneStoneIceAxe, "pickaxe", InfiMaterialEnum.Stone.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackStoneIceAxe, "pickaxe", InfiMaterialEnum.Stone.getHarvestLevel());
            MinecraftForge.setToolClass(iceStoneIceAxe, "pickaxe", InfiMaterialEnum.Stone.getHarvestLevel());
            MinecraftForge.setToolClass(slimeStoneIceAxe, "pickaxe", InfiMaterialEnum.Stone.getHarvestLevel());
            MinecraftForge.setToolClass(cactusStoneIceAxe, "pickaxe", InfiMaterialEnum.Stone.getHarvestLevel());
            MinecraftForge.setToolClass(flintStoneIceAxe, "pickaxe", InfiMaterialEnum.Stone.getHarvestLevel());
        }
        
        if(PropsHelperInfiHybrids.enableIronTools)
        {
        	woodIronIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.ironIceAxeID+0, 
                    InfiMaterialEnum.Iron, InfiMaterialEnum.Wood, "woodIronIceAxe");
        	stoneIronIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.ironIceAxeID+1, 
                    InfiMaterialEnum.Iron, InfiMaterialEnum.Stone, "stoneIronIceAxe");
        	ironIronIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.ironIceAxeID+2, 
                    InfiMaterialEnum.Iron, InfiMaterialEnum.Iron, "ironIronIceAxe");
        	boneIronIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.ironIceAxeID+3, 
                    InfiMaterialEnum.Iron, InfiMaterialEnum.Bone, "boneIronIceAxe");
        	netherrackIronIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.ironIceAxeID+4, 
                    InfiMaterialEnum.Iron, InfiMaterialEnum.Netherrack, "netherrackIronIceAxe");
        	glowstoneIronIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.ironIceAxeID+5, 
                    InfiMaterialEnum.Iron, InfiMaterialEnum.Glowstone, "glowstoneIronIceAxe");
        	cactusIronIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.ironIceAxeID+6, 
                    InfiMaterialEnum.Iron, InfiMaterialEnum.Cactus, "cactusIronIceAxe");
        	copperIronIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.ironIceAxeID+7, 
                    InfiMaterialEnum.Iron, InfiMaterialEnum.Copper, "copperIronIceAxe");
        	bronzeIronIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.ironIceAxeID+8, 
                    InfiMaterialEnum.Iron, InfiMaterialEnum.Bronze, "bronzeIronIceAxe");
            
            MinecraftForge.setToolClass(woodIronIceAxe, "pickaxe", InfiMaterialEnum.Iron.getHarvestLevel());
            MinecraftForge.setToolClass(stoneIronIceAxe, "pickaxe", InfiMaterialEnum.Iron.getHarvestLevel());
            MinecraftForge.setToolClass(ironIronIceAxe, "pickaxe", InfiMaterialEnum.Iron.getHarvestLevel());
            MinecraftForge.setToolClass(boneIronIceAxe, "pickaxe", InfiMaterialEnum.Iron.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackIronIceAxe, "pickaxe", InfiMaterialEnum.Iron.getHarvestLevel());
            MinecraftForge.setToolClass(glowstoneIronIceAxe, "pickaxe", InfiMaterialEnum.Iron.getHarvestLevel());
            MinecraftForge.setToolClass(cactusIronIceAxe, "pickaxe", InfiMaterialEnum.Iron.getHarvestLevel());
            MinecraftForge.setToolClass(copperIronIceAxe, "pickaxe", InfiMaterialEnum.Iron.getHarvestLevel());
            MinecraftForge.setToolClass(bronzeIronIceAxe, "pickaxe", InfiMaterialEnum.Iron.getHarvestLevel());
        }
        
        if(PropsHelperInfiHybrids.enableDiamondTools)
        {
        	woodDiamondIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.diamondIceAxeID+0, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Wood, "woodDiamondIceAxe");
        	stoneDiamondIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.diamondIceAxeID+1, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Stone, "stoneDiamondIceAxe");
        	ironDiamondIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.diamondIceAxeID+2, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Iron, "ironDiamondIceAxe");
        	diamondDiamondIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.diamondIceAxeID+3, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Diamond, "diamondDiamondIceAxe");
        	redstoneDiamondIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.diamondIceAxeID+4, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Redstone, "redstoneDiamondIceAxe");
        	obsidianDiamondIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.diamondIceAxeID+5, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Obsidian, "obsidianDiamondIceAxe");
        	boneDiamondIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.diamondIceAxeID+6, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Bone, "boneDiamondIceAxe");
        	mossyDiamondIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.diamondIceAxeID+7, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Mossy, "mossyDiamondIceAxe");
        	netherrackDiamondIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.diamondIceAxeID+8, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Netherrack, "netherrackDiamondIceAxe");
        	glowstoneDiamondIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.diamondIceAxeID+9, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Glowstone, "glowstoneDiamondIceAxe");
        	lavaDiamondIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.diamondIceAxeID+10, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Lava, "lavaDiamondIceAxe");
        	cactusDiamondIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.diamondIceAxeID+11, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Cactus, "cactusDiamondIceAxe");
        	flintDiamondIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.diamondIceAxeID+12, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Flint, "flintDiamondIceAxe");
        	blazeDiamondIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.diamondIceAxeID+13, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Blaze, "blazeDiamondIceAxe");
            copperDiamondIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.diamondIceAxeID+14, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Copper, "copperDiamondIceAxe");
            bronzeDiamondIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.diamondIceAxeID+15, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Bronze, "bronzeDiamondIceAxe");
            workedDiamondIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.diamondIceAxeID+16, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.WorkedIron, "workedDiamondIceAxe");
            steelDiamondIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.diamondIceAxeID+17, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Steel, "steelDiamondIceAxe");
            cobaltDiamondIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.diamondIceAxeID+18, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Cobalt, "cobaltDiamondIceAxe");
            arditeDiamondIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.diamondIceAxeID+19, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Ardite, "arditeDiamondIceAxe");
            manyullynDiamondIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.diamondIceAxeID+20, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Manyullyn, "manyullynDiamondIceAxe");
            uraniumDiamondIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.diamondIceAxeID+21, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Uranium, "uraniumDiamondIceAxe");
            
            MinecraftForge.setToolClass(woodDiamondIceAxe, "pickaxe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(stoneDiamondIceAxe, "pickaxe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(ironDiamondIceAxe, "pickaxe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(diamondDiamondIceAxe, "pickaxe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(redstoneDiamondIceAxe, "pickaxe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(obsidianDiamondIceAxe, "pickaxe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(boneDiamondIceAxe, "pickaxe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(mossyDiamondIceAxe, "pickaxe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackDiamondIceAxe, "pickaxe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(glowstoneDiamondIceAxe, "pickaxe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(lavaDiamondIceAxe, "pickaxe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(cactusDiamondIceAxe, "pickaxe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(flintDiamondIceAxe, "pickaxe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(blazeDiamondIceAxe, "pickaxe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(copperDiamondIceAxe, "pickaxe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(bronzeDiamondIceAxe, "pickaxe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(workedDiamondIceAxe, "pickaxe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(steelDiamondIceAxe, "pickaxe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(cobaltDiamondIceAxe, "pickaxe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(arditeDiamondIceAxe, "pickaxe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(manyullynDiamondIceAxe, "pickaxe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(uraniumDiamondIceAxe, "pickaxe", InfiMaterialEnum.Diamond.getHarvestLevel());
        }
        
        if(PropsHelperInfiHybrids.enableRedstoneTools)
        {
        	woodRedstoneIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.redstoneIceAxeID+0, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Redstone, "woodRedstoneIceAxe");
        	stoneRedstoneIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.redstoneIceAxeID+1, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Stone, "stoneRedstoneIceAxe");
        	ironRedstoneIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.redstoneIceAxeID+2, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Iron, "ironRedstoneIceAxe");
        	redstoneRedstoneIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.redstoneIceAxeID+3, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Redstone, "redstoneRedstoneIceAxe");
        	obsidianRedstoneIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.redstoneIceAxeID+4, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Obsidian, "obsidianRedstoneIceAxe");
        	sandstoneRedstoneIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.redstoneIceAxeID+5, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Sandstone, "sandstoneRedstoneIceAxe");
        	boneRedstoneIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.redstoneIceAxeID+6, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Bone, "boneRedstoneIceAxe");
        	paperRedstoneIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.redstoneIceAxeID+7, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Paper, "paperRedstoneIceAxe");
        	mossyRedstoneIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.redstoneIceAxeID+8, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Mossy, "mossyRedstoneIceAxe");
        	netherrackRedstoneIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.redstoneIceAxeID+9, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Netherrack, "netherrackRedstoneIceAxe");
        	glowstoneRedstoneIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.redstoneIceAxeID+10, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Glowstone, "glowstoneRedstoneIceAxe");
        	iceRedstoneIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.redstoneIceAxeID+11, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Ice, "iceRedstoneIceAxe");
        	lavaRedstoneIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.redstoneIceAxeID+12,
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Lava, "lavaRedstoneIceAxe");
        	slimeRedstoneIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.redstoneIceAxeID+13,
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Slime, "slimeRedstoneIceAxe");
        	cactusRedstoneIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.redstoneIceAxeID+14,
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Cactus, "cactusRedstoneIceAxe");
        	flintRedstoneIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.redstoneIceAxeID+15,
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Flint, "flintRedstoneIceAxe");
        	copperRedstoneIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.redstoneIceAxeID+16,
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Copper, "copperRedstoneIceAxe");
        	bronzeRedstoneIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.redstoneIceAxeID+17,
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Bronze, "bronzeRedstoneIceAxe");
        	workedRedstoneIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.redstoneIceAxeID+18,
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.WorkedIron, "workedRedstoneIceAxe");
        	uraniumRedstoneIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.redstoneIceAxeID+19,
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Uranium, "uraniumRedstoneIceAxe");
            
            MinecraftForge.setToolClass(woodRedstoneIceAxe, "pickaxe", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(stoneRedstoneIceAxe, "pickaxe", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(ironRedstoneIceAxe, "pickaxe", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(redstoneRedstoneIceAxe, "pickaxe", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(obsidianRedstoneIceAxe, "pickaxe", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(sandstoneRedstoneIceAxe, "pickaxe", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(boneRedstoneIceAxe, "pickaxe", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(paperRedstoneIceAxe, "pickaxe", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(mossyRedstoneIceAxe, "pickaxe", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackRedstoneIceAxe, "pickaxe", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(glowstoneRedstoneIceAxe, "pickaxe", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(iceRedstoneIceAxe, "pickaxe", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(lavaRedstoneIceAxe, "pickaxe", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(slimeRedstoneIceAxe, "pickaxe", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(cactusRedstoneIceAxe, "pickaxe", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(flintRedstoneIceAxe, "pickaxe", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(copperRedstoneIceAxe, "pickaxe", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(bronzeRedstoneIceAxe, "pickaxe", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(workedRedstoneIceAxe, "pickaxe", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(uraniumRedstoneIceAxe, "pickaxe", InfiMaterialEnum.Redstone.getHarvestLevel());
        }
        
        if(PropsHelperInfiHybrids.enableObsidianTools)
        {
        	woodObsidianIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.obsidianIceAxeID+0, 
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Obsidian, "woodObsidianIceAxe");
        	stoneObsidianIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.obsidianIceAxeID+1, 
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Stone, "stoneObsidianIceAxe");
        	redstoneObsidianIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.obsidianIceAxeID+2, 
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Obsidian, "redstoneObsidianIceAxe");
        	obsidianObsidianIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.obsidianIceAxeID+3, 
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Obsidian, "obsidianObsidianIceAxe");;
        	boneObsidianIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.obsidianIceAxeID+4, 
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Bone, "boneObsidianIceAxe");
        	netherrackObsidianIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.obsidianIceAxeID+5, 
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Netherrack, "netherrackObsidianIceAxe");
        	glowstoneObsidianIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.obsidianIceAxeID+6, 
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Glowstone, "glowstoneObsidianIceAxe");
        	iceObsidianIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.obsidianIceAxeID+7, 
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Ice, "iceObsidianIceAxe");
        	lavaObsidianIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.obsidianIceAxeID+8,
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Lava, "lavaObsidianIceAxe");
        	cactusObsidianIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.obsidianIceAxeID+9,
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Cactus, "cactusObsidianIceAxe");
            
            MinecraftForge.setToolClass(woodObsidianIceAxe, "pickaxe", InfiMaterialEnum.Obsidian.getHarvestLevel());
            MinecraftForge.setToolClass(stoneObsidianIceAxe, "pickaxe", InfiMaterialEnum.Obsidian.getHarvestLevel());
            MinecraftForge.setToolClass(redstoneObsidianIceAxe, "pickaxe", InfiMaterialEnum.Obsidian.getHarvestLevel());
            MinecraftForge.setToolClass(obsidianObsidianIceAxe, "pickaxe", InfiMaterialEnum.Obsidian.getHarvestLevel());
            MinecraftForge.setToolClass(boneObsidianIceAxe, "pickaxe", InfiMaterialEnum.Obsidian.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackObsidianIceAxe, "pickaxe", InfiMaterialEnum.Obsidian.getHarvestLevel());
            MinecraftForge.setToolClass(glowstoneObsidianIceAxe, "pickaxe", InfiMaterialEnum.Obsidian.getHarvestLevel());
            MinecraftForge.setToolClass(iceObsidianIceAxe, "pickaxe", InfiMaterialEnum.Obsidian.getHarvestLevel());
            MinecraftForge.setToolClass(lavaObsidianIceAxe, "pickaxe", InfiMaterialEnum.Obsidian.getHarvestLevel());
            MinecraftForge.setToolClass(cactusObsidianIceAxe, "pickaxe", InfiMaterialEnum.Obsidian.getHarvestLevel());
        }
        
        if(PropsHelperInfiHybrids.enableSandstoneTools)
        {
        	woodSandstoneIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.sandstoneIceAxeID+0, 
                    InfiMaterialEnum.Sandstone, InfiMaterialEnum.Sandstone, "woodSandstoneIceAxe");
        	sandstoneSandstoneIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.sandstoneIceAxeID+1, 
                    InfiMaterialEnum.Sandstone, InfiMaterialEnum.Sandstone, "sandstoneSandstoneIceAxe");
        	boneSandstoneIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.sandstoneIceAxeID+2, 
                    InfiMaterialEnum.Sandstone, InfiMaterialEnum.Bone, "boneSandstoneIceAxe");
        	netherrackSandstoneIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.sandstoneIceAxeID+3, 
                    InfiMaterialEnum.Sandstone, InfiMaterialEnum.Netherrack, "netherrackSandstoneIceAxe");
        	iceSandstoneIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.sandstoneIceAxeID+4, 
                    InfiMaterialEnum.Sandstone, InfiMaterialEnum.Ice, "iceSandstoneIceAxe");
        	slimeSandstoneIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.sandstoneIceAxeID+5,
                    InfiMaterialEnum.Sandstone, InfiMaterialEnum.Slime, "slimeSandstoneIceAxe");
        	cactusSandstoneIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.sandstoneIceAxeID+6,
                    InfiMaterialEnum.Sandstone, InfiMaterialEnum.Cactus, "cactusSandstoneIceAxe");
        	flintSandstoneIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.sandstoneIceAxeID+7,
                    InfiMaterialEnum.Sandstone, InfiMaterialEnum.Flint, "flintSandstoneIceAxe");
            
            MinecraftForge.setToolClass(woodSandstoneIceAxe, "pickaxe", InfiMaterialEnum.Sandstone.getHarvestLevel());
            MinecraftForge.setToolClass(sandstoneSandstoneIceAxe, "pickaxe", InfiMaterialEnum.Sandstone.getHarvestLevel());
            MinecraftForge.setToolClass(boneSandstoneIceAxe, "pickaxe", InfiMaterialEnum.Sandstone.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackSandstoneIceAxe, "pickaxe", InfiMaterialEnum.Sandstone.getHarvestLevel());
            MinecraftForge.setToolClass(iceSandstoneIceAxe, "pickaxe", InfiMaterialEnum.Sandstone.getHarvestLevel());
            MinecraftForge.setToolClass(slimeSandstoneIceAxe, "pickaxe", InfiMaterialEnum.Sandstone.getHarvestLevel());
            MinecraftForge.setToolClass(cactusSandstoneIceAxe, "pickaxe", InfiMaterialEnum.Sandstone.getHarvestLevel());
            MinecraftForge.setToolClass(flintSandstoneIceAxe, "pickaxe", InfiMaterialEnum.Sandstone.getHarvestLevel());
        }
        
        if(PropsHelperInfiHybrids.enableBoneTools)
        {
        	woodBoneIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.boneIceAxeID+0, 
                    InfiMaterialEnum.Bone, InfiMaterialEnum.Bone, "woodBoneIceAxe");
        	stoneBoneIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.boneIceAxeID+1, 
                    InfiMaterialEnum.Bone, InfiMaterialEnum.Stone, "stoneBoneIceAxe");
        	sandstoneBoneIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.boneIceAxeID+2, 
                    InfiMaterialEnum.Bone, InfiMaterialEnum.Sandstone, "sandstoneBoneIceAxe");
        	boneBoneIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.boneIceAxeID+3, 
                    InfiMaterialEnum.Bone, InfiMaterialEnum.Bone, "boneBoneIceAxe");
        	paperBoneIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.boneIceAxeID+4, 
                    InfiMaterialEnum.Bone, InfiMaterialEnum.Paper, "paperBoneIceAxe");
        	netherrackBoneIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.boneIceAxeID+5, 
                    InfiMaterialEnum.Bone, InfiMaterialEnum.Netherrack, "netherrackBoneIceAxe");
        	iceBoneIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.boneIceAxeID+6, 
                    InfiMaterialEnum.Bone, InfiMaterialEnum.Ice, "iceBoneIceAxe");
        	cactusBoneIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.boneIceAxeID+7,
                    InfiMaterialEnum.Bone, InfiMaterialEnum.Cactus, "cactusBoneIceAxe");
        	flintBoneIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.boneIceAxeID+8,
                    InfiMaterialEnum.Bone, InfiMaterialEnum.Flint, "flintBoneIceAxe");
            
            MinecraftForge.setToolClass(woodBoneIceAxe, "pickaxe", InfiMaterialEnum.Bone.getHarvestLevel());
            MinecraftForge.setToolClass(stoneBoneIceAxe, "pickaxe", InfiMaterialEnum.Bone.getHarvestLevel());
            MinecraftForge.setToolClass(sandstoneBoneIceAxe, "pickaxe", InfiMaterialEnum.Bone.getHarvestLevel());
            MinecraftForge.setToolClass(boneBoneIceAxe, "pickaxe", InfiMaterialEnum.Bone.getHarvestLevel());
            MinecraftForge.setToolClass(paperBoneIceAxe, "pickaxe", InfiMaterialEnum.Bone.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackBoneIceAxe, "pickaxe", InfiMaterialEnum.Bone.getHarvestLevel());
            MinecraftForge.setToolClass(iceBoneIceAxe, "pickaxe", InfiMaterialEnum.Bone.getHarvestLevel());
            MinecraftForge.setToolClass(cactusBoneIceAxe, "pickaxe", InfiMaterialEnum.Bone.getHarvestLevel());
            MinecraftForge.setToolClass(flintBoneIceAxe, "pickaxe", InfiMaterialEnum.Bone.getHarvestLevel());
        }
        
        if(PropsHelperInfiHybrids.enablePaperTools)
        {
        	woodPaperIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.paperIceAxeID+0, 
                    InfiMaterialEnum.Paper, InfiMaterialEnum.Paper, "woodPaperIceAxe");
        	bonePaperIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.paperIceAxeID+1, 
                    InfiMaterialEnum.Paper, InfiMaterialEnum.Paper, "bonePaperIceAxe");
        	paperPaperIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.paperIceAxeID+2, 
                    InfiMaterialEnum.Paper, InfiMaterialEnum.Paper, "paperPaperIceAxe");
        	slimePaperIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.paperIceAxeID+3,
                    InfiMaterialEnum.Paper, InfiMaterialEnum.Cactus, "slimePaperIceAxe");
        	cactusPaperIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.paperIceAxeID+4,
                    InfiMaterialEnum.Paper, InfiMaterialEnum.Cactus, "cactusPaperIceAxe");
            
            MinecraftForge.setToolClass(woodPaperIceAxe, "pickaxe", InfiMaterialEnum.Paper.getHarvestLevel());
            MinecraftForge.setToolClass(bonePaperIceAxe, "pickaxe", InfiMaterialEnum.Paper.getHarvestLevel());
            MinecraftForge.setToolClass(paperPaperIceAxe, "pickaxe", InfiMaterialEnum.Paper.getHarvestLevel());
            MinecraftForge.setToolClass(slimePaperIceAxe, "pickaxe", InfiMaterialEnum.Paper.getHarvestLevel());
            MinecraftForge.setToolClass(cactusPaperIceAxe, "pickaxe", InfiMaterialEnum.Paper.getHarvestLevel());
        }
        
        if(PropsHelperInfiHybrids.enableMossyTools)
        {
        	woodMossyIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.mossyIceAxeID+0, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Wood, "woodMossyIceAxe");
        	stoneMossyIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.mossyIceAxeID+1, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Stone, "stoneMossyIceAxe");
        	diamondMossyIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.mossyIceAxeID+2, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Diamond, "diamondMossyIceAxe");
        	redstoneMossyIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.mossyIceAxeID+3, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Redstone, "redstoneMossyIceAxe");
        	boneMossyIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.mossyIceAxeID+4, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Bone, "boneMossyIceAxe");
        	mossyMossyIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.mossyIceAxeID+5, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Mossy, "mossyMossyIceAxe");
        	netherrackMossyIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.mossyIceAxeID+6, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Netherrack, "netherrackMossyIceAxe");
        	glowstoneMossyIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.mossyIceAxeID+7, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Glowstone, "glowstoneMossyIceAxe");
        	cactusMossyIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.mossyIceAxeID+8, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Cactus, "cactusMossyIceAxe");
        	blazeMossyIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.mossyIceAxeID+9, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Blaze, "blazeMossyIceAxe");
        	manyullynMossyIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.mossyIceAxeID+10, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Manyullyn, "manyullynMossyIceAxe");
        	uraniumMossyIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.mossyIceAxeID+11, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Uranium, "uraniumMossyIceAxe");
            
            MinecraftForge.setToolClass(woodMossyIceAxe, "pickaxe", InfiMaterialEnum.Mossy.getHarvestLevel());
            MinecraftForge.setToolClass(stoneMossyIceAxe, "pickaxe", InfiMaterialEnum.Mossy.getHarvestLevel());
            MinecraftForge.setToolClass(diamondMossyIceAxe, "pickaxe", InfiMaterialEnum.Mossy.getHarvestLevel());
            MinecraftForge.setToolClass(redstoneMossyIceAxe, "pickaxe", InfiMaterialEnum.Mossy.getHarvestLevel());
            MinecraftForge.setToolClass(boneMossyIceAxe, "pickaxe", InfiMaterialEnum.Mossy.getHarvestLevel());
            MinecraftForge.setToolClass(mossyMossyIceAxe, "pickaxe", InfiMaterialEnum.Mossy.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackMossyIceAxe, "pickaxe", InfiMaterialEnum.Mossy.getHarvestLevel());
            MinecraftForge.setToolClass(glowstoneMossyIceAxe, "pickaxe", InfiMaterialEnum.Mossy.getHarvestLevel());
            MinecraftForge.setToolClass(cactusMossyIceAxe, "pickaxe", InfiMaterialEnum.Mossy.getHarvestLevel());
            MinecraftForge.setToolClass(blazeMossyIceAxe, "pickaxe", InfiMaterialEnum.Mossy.getHarvestLevel());
            MinecraftForge.setToolClass(manyullynMossyIceAxe, "pickaxe", InfiMaterialEnum.Mossy.getHarvestLevel());
            MinecraftForge.setToolClass(uraniumMossyIceAxe, "pickaxe", InfiMaterialEnum.Mossy.getHarvestLevel());
        }
        
        if(PropsHelperInfiHybrids.enableNetherrackTools)
        {
        	woodNetherrackIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.netherrackIceAxeID+0, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Wood, "woodNetherrackIceAxe");
        	stoneNetherrackIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.netherrackIceAxeID+1, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Stone, "stoneNetherrackIceAxe");
        	sandstoneNetherrackIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.netherrackIceAxeID+2, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Sandstone, "sandstoneNetherrackIceAxe");
        	boneNetherrackIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.netherrackIceAxeID+3, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Bone, "boneNetherrackIceAxe");
        	paperNetherrackIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.netherrackIceAxeID+4, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Paper, "paperNetherrackIceAxe");
        	mossyNetherrackIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.netherrackIceAxeID+5, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Mossy, "mossyNetherrackIceAxe");
        	netherrackNetherrackIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.netherrackIceAxeID+6, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Netherrack, "netherrackNetherrackIceAxe");
        	iceNetherrackIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.netherrackIceAxeID+7, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Ice, "iceNetherrackIceAxe");
        	slimeNetherrackIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.netherrackIceAxeID+8, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Slime, "slimeNetherrackIceAxe");
        	cactusNetherrackIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.netherrackIceAxeID+9, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Cactus, "cactusNetherrackIceAxe");
        	flintNetherrackIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.netherrackIceAxeID+10, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Flint, "flintNetherrackIceAxe");
        	copperNetherrackIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.netherrackIceAxeID+11, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Copper, "copperNetherrackIceAxe");
        	bronzeNetherrackIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.netherrackIceAxeID+12, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Bronze, "bronzeNetherrackIceAxe");
            
            MinecraftForge.setToolClass(woodNetherrackIceAxe, "pickaxe", InfiMaterialEnum.Netherrack.getHarvestLevel());
            MinecraftForge.setToolClass(stoneNetherrackIceAxe, "pickaxe", InfiMaterialEnum.Netherrack.getHarvestLevel());
            MinecraftForge.setToolClass(sandstoneNetherrackIceAxe, "pickaxe", InfiMaterialEnum.Netherrack.getHarvestLevel());
            MinecraftForge.setToolClass(boneNetherrackIceAxe, "pickaxe", InfiMaterialEnum.Netherrack.getHarvestLevel());
            MinecraftForge.setToolClass(paperNetherrackIceAxe, "pickaxe", InfiMaterialEnum.Netherrack.getHarvestLevel());
            MinecraftForge.setToolClass(mossyNetherrackIceAxe, "pickaxe", InfiMaterialEnum.Netherrack.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackNetherrackIceAxe, "pickaxe", InfiMaterialEnum.Netherrack.getHarvestLevel());
            MinecraftForge.setToolClass(iceNetherrackIceAxe, "pickaxe", InfiMaterialEnum.Netherrack.getHarvestLevel());
            MinecraftForge.setToolClass(slimeNetherrackIceAxe, "pickaxe", InfiMaterialEnum.Netherrack.getHarvestLevel());
            MinecraftForge.setToolClass(cactusNetherrackIceAxe, "pickaxe", InfiMaterialEnum.Netherrack.getHarvestLevel());
            MinecraftForge.setToolClass(flintNetherrackIceAxe, "pickaxe", InfiMaterialEnum.Netherrack.getHarvestLevel());
            MinecraftForge.setToolClass(copperNetherrackIceAxe, "pickaxe", InfiMaterialEnum.Netherrack.getHarvestLevel());
            MinecraftForge.setToolClass(bronzeNetherrackIceAxe, "pickaxe", InfiMaterialEnum.Netherrack.getHarvestLevel());
        }
        
        if(PropsHelperInfiHybrids.enableGlowstoneTools)
        {
        	woodGlowstoneIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.glowstoneIceAxeID+0, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Wood, "woodGlowstoneIceAxe");
        	redstoneGlowstoneIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.glowstoneIceAxeID+1, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Redstone, "redstoneGlowstoneIceAxe");
        	obsidianGlowstoneIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.glowstoneIceAxeID+2, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Obsidian, "obsidianGlowstoneIceAxe");
        	boneGlowstoneIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.glowstoneIceAxeID+3, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Bone, "boneGlowstoneIceAxe");
        	netherrackGlowstoneIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.glowstoneIceAxeID+4, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Netherrack, "netherrackGlowstoneIceAxe");
        	glowstoneGlowstoneIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.glowstoneIceAxeID+5, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Glowstone, "glowstoneGlowstoneIceAxe");
        	iceGlowstoneIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.glowstoneIceAxeID+6, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Ice, "iceGlowstoneIceAxe");
        	slimeGlowstoneIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.glowstoneIceAxeID+7, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Slime, "slimeGlowstoneIceAxe");
        	cactusGlowstoneIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.glowstoneIceAxeID+8, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Cactus, "cactusGlowstoneIceAxe");
            
            
            MinecraftForge.setToolClass(woodGlowstoneIceAxe, "pickaxe", InfiMaterialEnum.Glowstone.getHarvestLevel());
            MinecraftForge.setToolClass(redstoneGlowstoneIceAxe, "pickaxe", InfiMaterialEnum.Glowstone.getHarvestLevel());
            MinecraftForge.setToolClass(obsidianGlowstoneIceAxe, "pickaxe", InfiMaterialEnum.Glowstone.getHarvestLevel());
            MinecraftForge.setToolClass(boneGlowstoneIceAxe, "pickaxe", InfiMaterialEnum.Glowstone.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackGlowstoneIceAxe, "pickaxe", InfiMaterialEnum.Glowstone.getHarvestLevel());
            MinecraftForge.setToolClass(glowstoneGlowstoneIceAxe, "pickaxe", InfiMaterialEnum.Glowstone.getHarvestLevel());
            MinecraftForge.setToolClass(iceGlowstoneIceAxe, "pickaxe", InfiMaterialEnum.Glowstone.getHarvestLevel());
            MinecraftForge.setToolClass(slimeGlowstoneIceAxe, "pickaxe", InfiMaterialEnum.Glowstone.getHarvestLevel());
            MinecraftForge.setToolClass(cactusGlowstoneIceAxe, "pickaxe", InfiMaterialEnum.Glowstone.getHarvestLevel());
        }
        
        if(PropsHelperInfiHybrids.enableIceTools)
        {
        	woodIceIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.iceIceAxeID+0, 
                    InfiMaterialEnum.Ice, InfiMaterialEnum.Wood, "woodIceIceAxe");
        	boneIceIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.iceIceAxeID+1, 
                    InfiMaterialEnum.Ice, InfiMaterialEnum.Bone, "boneIceIceAxe");
        	paperIceIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.iceIceAxeID+2, 
                    InfiMaterialEnum.Ice, InfiMaterialEnum.Paper, "paperIceIceAxe");
        	iceIceIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.iceIceAxeID+3, 
                    InfiMaterialEnum.Ice, InfiMaterialEnum.Ice, "iceIceIceAxe");
        	slimeIceIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.iceIceAxeID+4, 
                    InfiMaterialEnum.Ice, InfiMaterialEnum.Slime, "slimeIceIceAxe");
        	cactusIceIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.iceIceAxeID+5, 
                    InfiMaterialEnum.Ice, InfiMaterialEnum.Cactus, "cactusIceIceAxe");
            
            
            MinecraftForge.setToolClass(woodIceIceAxe, "pickaxe", InfiMaterialEnum.Ice.getHarvestLevel());
            MinecraftForge.setToolClass(boneIceIceAxe, "pickaxe", InfiMaterialEnum.Ice.getHarvestLevel());
            MinecraftForge.setToolClass(paperIceIceAxe, "pickaxe", InfiMaterialEnum.Ice.getHarvestLevel());
            MinecraftForge.setToolClass(iceIceIceAxe, "pickaxe", InfiMaterialEnum.Ice.getHarvestLevel());
            MinecraftForge.setToolClass(slimeIceIceAxe, "pickaxe", InfiMaterialEnum.Ice.getHarvestLevel());
            MinecraftForge.setToolClass(cactusIceIceAxe, "pickaxe", InfiMaterialEnum.Ice.getHarvestLevel());
        }
        
        if(PropsHelperInfiHybrids.enableLavaTools)
        {
        	diamondLavaIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.lavaIceAxeID+0, 
                    InfiMaterialEnum.Lava, InfiMaterialEnum.Diamond, "diamondLavaIceAxe");
        	obsidianLavaIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.lavaIceAxeID+1, 
                    InfiMaterialEnum.Lava, InfiMaterialEnum.Obsidian, "obsidianLavaIceAxe");
        	netherrackLavaIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.lavaIceAxeID+2, 
                    InfiMaterialEnum.Lava, InfiMaterialEnum.Netherrack, "netherrackLavaIceAxe");
        	lavaLavaIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.lavaIceAxeID+3, 
                    InfiMaterialEnum.Lava, InfiMaterialEnum.Lava, "lavaLavaIceAxe");
        	flintLavaIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.lavaIceAxeID+4, 
                    InfiMaterialEnum.Lava, InfiMaterialEnum.Flint, "flintLavaIceAxe");
        	blazeLavaIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.lavaIceAxeID+5, 
                    InfiMaterialEnum.Lava, InfiMaterialEnum.Blaze, "blazeLavaIceAxe");
        	manyullynLavaIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.lavaIceAxeID+6, 
                    InfiMaterialEnum.Lava, InfiMaterialEnum.Manyullyn, "manyullynLavaIceAxe");
            uraniumLavaIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.lavaIceAxeID+7, 
                    InfiMaterialEnum.Lava, InfiMaterialEnum.Uranium, "uraniumLavaIceAxe");
            
            MinecraftForge.setToolClass(diamondLavaIceAxe, "pickaxe", InfiMaterialEnum.Lava.getHarvestLevel());
            MinecraftForge.setToolClass(obsidianLavaIceAxe, "pickaxe", InfiMaterialEnum.Lava.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackLavaIceAxe, "pickaxe", InfiMaterialEnum.Lava.getHarvestLevel());
            MinecraftForge.setToolClass(lavaLavaIceAxe, "pickaxe", InfiMaterialEnum.Lava.getHarvestLevel());
            MinecraftForge.setToolClass(flintLavaIceAxe, "pickaxe", InfiMaterialEnum.Lava.getHarvestLevel());
            MinecraftForge.setToolClass(blazeLavaIceAxe, "pickaxe", InfiMaterialEnum.Lava.getHarvestLevel());
            MinecraftForge.setToolClass(manyullynLavaIceAxe, "pickaxe", InfiMaterialEnum.Lava.getHarvestLevel());
            MinecraftForge.setToolClass(uraniumLavaIceAxe, "pickaxe", InfiMaterialEnum.Lava.getHarvestLevel());
        }
        
        if(PropsHelperInfiHybrids.enableSlimeTools)
        {
        	woodSlimeIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.slimeIceAxeID+0, 
                    InfiMaterialEnum.Slime, InfiMaterialEnum.Wood, "woodSlimeIceAxe");
        	sandstoneSlimeIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.slimeIceAxeID+1, 
                    InfiMaterialEnum.Slime, InfiMaterialEnum.Sandstone, "sandstoneSlimeIceAxe");
        	boneSlimeIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.slimeIceAxeID+2, 
                    InfiMaterialEnum.Slime, InfiMaterialEnum.Bone, "boneSlimeIceAxe");
        	paperSlimeIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.slimeIceAxeID+3, 
                    InfiMaterialEnum.Slime, InfiMaterialEnum.Paper, "paperSlimeIceAxe");
        	slimeSlimeIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.slimeIceAxeID+4, 
                    InfiMaterialEnum.Slime, InfiMaterialEnum.Slime, "slimeSlimeIceAxe");
        	cactusSlimeIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.slimeIceAxeID+5, 
                    InfiMaterialEnum.Slime, InfiMaterialEnum.Cactus, "cactusSlimeIceAxe");
            
            MinecraftForge.setToolClass(woodSlimeIceAxe, "pickaxe", InfiMaterialEnum.Slime.getHarvestLevel());
            MinecraftForge.setToolClass(sandstoneSlimeIceAxe, "pickaxe", InfiMaterialEnum.Slime.getHarvestLevel());
            MinecraftForge.setToolClass(boneSlimeIceAxe, "pickaxe", InfiMaterialEnum.Slime.getHarvestLevel());
            MinecraftForge.setToolClass(paperSlimeIceAxe, "pickaxe", InfiMaterialEnum.Slime.getHarvestLevel());
            MinecraftForge.setToolClass(slimeSlimeIceAxe, "pickaxe", InfiMaterialEnum.Slime.getHarvestLevel());
            MinecraftForge.setToolClass(cactusSlimeIceAxe, "pickaxe", InfiMaterialEnum.Slime.getHarvestLevel());
        }
        
        if(PropsHelperInfiHybrids.enableCactusTools)
        {
        	woodCactusIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.cactusIceAxeID+0, 
                    InfiMaterialEnum.Cactus, InfiMaterialEnum.Wood, "woodCactusIceAxe");
        	sandstoneCactusIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.cactusIceAxeID+1, 
                    InfiMaterialEnum.Cactus, InfiMaterialEnum.Sandstone, "sandstoneCactusIceAxe");
        	boneCactusIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.cactusIceAxeID+2, 
                    InfiMaterialEnum.Cactus, InfiMaterialEnum.Bone, "boneCactusIceAxe");
        	netherrackCactusIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.cactusIceAxeID+3, 
                    InfiMaterialEnum.Cactus, InfiMaterialEnum.Netherrack, "netherrackCactusIceAxe");
        	iceCactusIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.cactusIceAxeID+4, 
                    InfiMaterialEnum.Cactus, InfiMaterialEnum.Ice, "iceCactusIceAxe");
        	slimeCactusIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.cactusIceAxeID+5, 
                    InfiMaterialEnum.Cactus, InfiMaterialEnum.Slime, "slimeCactusIceAxe");
        	cactusCactusIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.cactusIceAxeID+6, 
                    InfiMaterialEnum.Cactus, InfiMaterialEnum.Cactus, "cactusCactusIceAxe");
            
            MinecraftForge.setToolClass(woodCactusIceAxe, "pickaxe", InfiMaterialEnum.Cactus.getHarvestLevel());
            MinecraftForge.setToolClass(sandstoneCactusIceAxe, "pickaxe", InfiMaterialEnum.Cactus.getHarvestLevel());
            MinecraftForge.setToolClass(boneCactusIceAxe, "pickaxe", InfiMaterialEnum.Cactus.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackCactusIceAxe, "pickaxe", InfiMaterialEnum.Cactus.getHarvestLevel());
            MinecraftForge.setToolClass(iceCactusIceAxe, "pickaxe", InfiMaterialEnum.Cactus.getHarvestLevel());
            MinecraftForge.setToolClass(slimeCactusIceAxe, "pickaxe", InfiMaterialEnum.Cactus.getHarvestLevel());
            MinecraftForge.setToolClass(cactusCactusIceAxe, "pickaxe", InfiMaterialEnum.Cactus.getHarvestLevel());
        }
        
        if(PropsHelperInfiHybrids.enableFlintTools)
        {
        	woodFlintIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.flintIceAxeID+0, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Wood, "woodFlintIceAxe");
        	stoneFlintIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.flintIceAxeID+1, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Stone, "stoneFlintIceAxe");
        	sandstoneFlintIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.flintIceAxeID+2, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Sandstone, "sandstoneFlintIceAxe");
        	boneFlintIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.flintIceAxeID+3, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Bone, "boneFlintIceAxe");
        	netherrackFlintIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.flintIceAxeID+4, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Flint, "netherrackFlintIceAxe");
        	slimeFlintIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.flintIceAxeID+5, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Slime, "slimeFlintIceAxe");
        	cactusFlintIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.flintIceAxeID+6, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Cactus, "cactusFlintIceAxe");
        	flintFlintIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.flintIceAxeID+7, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Flint, "flintFlintIceAxe");
        	copperFlintIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.flintIceAxeID+8, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Copper, "copperFlintIceAxe");
        	bronzeFlintIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.flintIceAxeID+9, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Bronze, "bronzeFlintIceAxe");
            
            MinecraftForge.setToolClass(woodFlintIceAxe, "pickaxe", InfiMaterialEnum.Flint.getHarvestLevel());
            MinecraftForge.setToolClass(stoneFlintIceAxe, "pickaxe", InfiMaterialEnum.Flint.getHarvestLevel());
            MinecraftForge.setToolClass(sandstoneFlintIceAxe, "pickaxe", InfiMaterialEnum.Flint.getHarvestLevel());
            MinecraftForge.setToolClass(boneFlintIceAxe, "pickaxe", InfiMaterialEnum.Flint.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackFlintIceAxe, "pickaxe", InfiMaterialEnum.Flint.getHarvestLevel());
            MinecraftForge.setToolClass(slimeFlintIceAxe, "pickaxe", InfiMaterialEnum.Flint.getHarvestLevel());
            MinecraftForge.setToolClass(cactusFlintIceAxe, "pickaxe", InfiMaterialEnum.Flint.getHarvestLevel());
            MinecraftForge.setToolClass(flintFlintIceAxe, "pickaxe", InfiMaterialEnum.Flint.getHarvestLevel());
            MinecraftForge.setToolClass(copperFlintIceAxe, "pickaxe", InfiMaterialEnum.Flint.getHarvestLevel());
            MinecraftForge.setToolClass(bronzeFlintIceAxe, "pickaxe", InfiMaterialEnum.Flint.getHarvestLevel());
        }
        
        if(PropsHelperInfiHybrids.enableBlazeTools)
        {
        	diamondBlazeIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.blazeIceAxeID+0, 
                    InfiMaterialEnum.Blaze, InfiMaterialEnum.Diamond, "diamondBlazeIceAxe");
        	obsidianBlazeIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.blazeIceAxeID+1, 
                    InfiMaterialEnum.Blaze, InfiMaterialEnum.Obsidian, "obsidianBlazeIceAxe");
        	netherrackBlazeIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.blazeIceAxeID+2, 
                    InfiMaterialEnum.Blaze, InfiMaterialEnum.Netherrack, "netherrackBlazeIceAxe");
        	lavaBlazeIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.blazeIceAxeID+3, 
                    InfiMaterialEnum.Blaze, InfiMaterialEnum.Lava, "lavaBlazeIceAxe");
        	flintBlazeIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.blazeIceAxeID+4, 
                    InfiMaterialEnum.Blaze, InfiMaterialEnum.Flint, "flintBlazeIceAxe");
        	blazeBlazeIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.blazeIceAxeID+5, 
                    InfiMaterialEnum.Blaze, InfiMaterialEnum.Blaze, "blazeBlazeIceAxe");
        	manyullynBlazeIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.blazeIceAxeID+6, 
                    InfiMaterialEnum.Blaze, InfiMaterialEnum.Manyullyn, "manyullynBlazeIceAxe");
            uraniumBlazeIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.blazeIceAxeID+7, 
                    InfiMaterialEnum.Blaze, InfiMaterialEnum.Uranium, "uraniumBlazeIceAxe");
            
            MinecraftForge.setToolClass(diamondBlazeIceAxe, "pickaxe", InfiMaterialEnum.Blaze.getHarvestLevel());
            MinecraftForge.setToolClass(obsidianBlazeIceAxe, "pickaxe", InfiMaterialEnum.Blaze.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackBlazeIceAxe, "pickaxe", InfiMaterialEnum.Blaze.getHarvestLevel());
            MinecraftForge.setToolClass(blazeBlazeIceAxe, "pickaxe", InfiMaterialEnum.Blaze.getHarvestLevel());
            MinecraftForge.setToolClass(flintBlazeIceAxe, "pickaxe", InfiMaterialEnum.Blaze.getHarvestLevel());
            MinecraftForge.setToolClass(blazeBlazeIceAxe, "pickaxe", InfiMaterialEnum.Blaze.getHarvestLevel());
            MinecraftForge.setToolClass(manyullynBlazeIceAxe, "pickaxe", InfiMaterialEnum.Blaze.getHarvestLevel());
            MinecraftForge.setToolClass(uraniumBlazeIceAxe, "pickaxe", InfiMaterialEnum.Blaze.getHarvestLevel());
        }
    	
        if(PropsHelperInfiHybrids.enableCopperTools)
        {
        	woodCopperIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.copperIceAxeID+0, 
                    InfiMaterialEnum.Copper, InfiMaterialEnum.Wood, "woodCopperIceAxe");
            stoneCopperIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.copperIceAxeID+1, 
                    InfiMaterialEnum.Copper, InfiMaterialEnum.Stone, "stoneCopperIceAxe");
            boneCopperIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.copperIceAxeID+2, 
                    InfiMaterialEnum.Copper, InfiMaterialEnum.Bone, "boneCopperIceAxe");
            netherrackCopperIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.copperIceAxeID+3, 
                    InfiMaterialEnum.Copper, InfiMaterialEnum.Netherrack, "netherrackCopperIceAxe");
            slimeCopperIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.copperIceAxeID+4, 
                    InfiMaterialEnum.Copper, InfiMaterialEnum.Slime, "slimeCopperIceAxe");
            cactusCopperIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.copperIceAxeID+5, 
                    InfiMaterialEnum.Copper, InfiMaterialEnum.Cactus, "cactusCopperIceAxe");
            flintCopperIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.copperIceAxeID+6, 
                    InfiMaterialEnum.Copper, InfiMaterialEnum.Flint, "flintCopperIceAxe");
            copperCopperIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.copperIceAxeID+7, 
                    InfiMaterialEnum.Copper, InfiMaterialEnum.Copper, "copperCopperIceAxe");
            
            MinecraftForge.setToolClass(woodCopperIceAxe, "pickaxe", InfiMaterialEnum.Copper.getHarvestLevel());
        	MinecraftForge.setToolClass(stoneCopperIceAxe, "pickaxe", InfiMaterialEnum.Copper.getHarvestLevel());
            MinecraftForge.setToolClass(boneCopperIceAxe, "pickaxe", InfiMaterialEnum.Copper.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackCopperIceAxe, "pickaxe", InfiMaterialEnum.Copper.getHarvestLevel());
            MinecraftForge.setToolClass(slimeCopperIceAxe, "pickaxe", InfiMaterialEnum.Copper.getHarvestLevel());
            MinecraftForge.setToolClass(cactusCopperIceAxe, "pickaxe", InfiMaterialEnum.Copper.getHarvestLevel());
            MinecraftForge.setToolClass(flintCopperIceAxe, "pickaxe", InfiMaterialEnum.Copper.getHarvestLevel());
            MinecraftForge.setToolClass(copperCopperIceAxe, "pickaxe", InfiMaterialEnum.Copper.getHarvestLevel());
        }
        
        if(PropsHelperInfiHybrids.enableBronzeTools)
        {
        	woodBronzeIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.bronzeIceAxeID+0, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Wood, "woodBronzeIceAxe");
            stoneBronzeIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.bronzeIceAxeID+1, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Stone, "stoneBronzeIceAxe");
            boneBronzeIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.bronzeIceAxeID+2, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Bone, "boneBronzeIceAxe");
            netherrackBronzeIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.bronzeIceAxeID+3, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Netherrack, "netherrackBronzeIceAxe");
            slimeBronzeIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.bronzeIceAxeID+4, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Slime, "slimeBronzeIceAxe");
            cactusBronzeIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.bronzeIceAxeID+5, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Cactus, "cactusBronzeIceAxe");
            flintBronzeIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.bronzeIceAxeID+6, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Flint, "flintBronzeIceAxe");
            copperBronzeIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.bronzeIceAxeID+7, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Copper, "copperBronzeIceAxe");
            bronzeBronzeIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.bronzeIceAxeID+8, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Bronze, "copperBronzeIceAxe");
            
            MinecraftForge.setToolClass(woodBronzeIceAxe, "pickaxe", InfiMaterialEnum.Bronze.getHarvestLevel());
            MinecraftForge.setToolClass(stoneBronzeIceAxe, "pickaxe", InfiMaterialEnum.Bronze.getHarvestLevel());
            MinecraftForge.setToolClass(boneBronzeIceAxe, "pickaxe", InfiMaterialEnum.Bronze.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackBronzeIceAxe, "pickaxe", InfiMaterialEnum.Bronze.getHarvestLevel());
            MinecraftForge.setToolClass(slimeBronzeIceAxe, "pickaxe", InfiMaterialEnum.Bronze.getHarvestLevel());
            MinecraftForge.setToolClass(cactusBronzeIceAxe, "pickaxe", InfiMaterialEnum.Bronze.getHarvestLevel());
            MinecraftForge.setToolClass(flintBronzeIceAxe, "pickaxe", InfiMaterialEnum.Bronze.getHarvestLevel());
            MinecraftForge.setToolClass(copperBronzeIceAxe, "pickaxe", InfiMaterialEnum.Bronze.getHarvestLevel());
            MinecraftForge.setToolClass(bronzeBronzeIceAxe, "pickaxe", InfiMaterialEnum.Bronze.getHarvestLevel());
        }
        
        if(PropsHelperInfiHybrids.enableWorkedIronTools)
        {
        	woodWorkedIronIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.workedIronIceAxeID+0, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Wood, "woodWorkedIronIceAxe");
            stoneWorkedIronIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.workedIronIceAxeID+1, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Stone, "stoneWorkedIronIceAxe");
            ironWorkedIronIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.workedIronIceAxeID+2,
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Iron, "ironWorkedIronIceAxe");
            diamondWorkedIronIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.workedIronIceAxeID+3, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Diamond, "diamondWorkedIronIceAxe");
            redstoneWorkedIronIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.workedIronIceAxeID+4, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Redstone, "redstoneWorkedIronIceAxe");
            obsidianWorkedIronIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.workedIronIceAxeID+5, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Obsidian, "obsidianWorkedIronIceAxe");
            boneWorkedIronIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.workedIronIceAxeID+6, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Bone, "boneWorkedIronIceAxe");
            netherrackWorkedIronIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.workedIronIceAxeID+7, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Netherrack, "netherrackWorkedIronIceAxe");
            glowstoneWorkedIronIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.workedIronIceAxeID+8, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Glowstone, "glowstoneWorkedIronIceAxe");
            iceWorkedIronIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.workedIronIceAxeID+9, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Ice, "iceWorkedIronIceAxe");
            slimeWorkedIronIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.workedIronIceAxeID+10, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Slime, "slimeWorkedIronIceAxe");
            cactusWorkedIronIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.workedIronIceAxeID+11, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Cactus, "cactusWorkedIronIceAxe");
            blazeWorkedIronIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.workedIronIceAxeID+12, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Blaze, "blazeWorkedIronIceAxe");
            copperWorkedIronIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.workedIronIceAxeID+13, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Copper, "copperWorkedIronIceAxe");
            bronzeWorkedIronIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.workedIronIceAxeID+14, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Bronze, "bronzeWorkedIronIceAxe");
            workedWorkedIronIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.workedIronIceAxeID+15, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.WorkedIron, "workedWorkedIronIceAxe");
            steelWorkedIronIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.workedIronIceAxeID+16, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Steel, "steelWorkedIronIceAxe");
            uraniumWorkedIronIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.workedIronIceAxeID+17, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Bronze, "uraniumWorkedIronIceAxe");
            
            MinecraftForge.setToolClass(woodWorkedIronIceAxe, "pickaxe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(stoneWorkedIronIceAxe, "pickaxe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(ironWorkedIronIceAxe, "pickaxe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(diamondWorkedIronIceAxe, "pickaxe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(redstoneWorkedIronIceAxe, "pickaxe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(obsidianWorkedIronIceAxe, "pickaxe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(boneWorkedIronIceAxe, "pickaxe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackWorkedIronIceAxe, "pickaxe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(glowstoneWorkedIronIceAxe, "pickaxe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(iceWorkedIronIceAxe, "pickaxe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(slimeWorkedIronIceAxe, "pickaxe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(cactusWorkedIronIceAxe, "pickaxe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(blazeWorkedIronIceAxe, "pickaxe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(copperWorkedIronIceAxe, "pickaxe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(bronzeWorkedIronIceAxe, "pickaxe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(workedWorkedIronIceAxe, "pickaxe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(steelWorkedIronIceAxe, "pickaxe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(uraniumWorkedIronIceAxe, "pickaxe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
        }
        
        if(PropsHelperInfiHybrids.enableSteelTools)
        {
        	woodSteelIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.steelIceAxeID+0, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Wood, "woodSteelIceAxe");
            stoneSteelIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.steelIceAxeID+1, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Stone, "stoneSteelIceAxe");
            ironSteelIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.steelIceAxeID+2, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Iron, "ironSteelIceAxe");
            diamondSteelIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.steelIceAxeID+3, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Diamond, "diamondSteelIceAxe");
            redstoneSteelIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.steelIceAxeID+4, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Redstone, "redstoneSteelIceAxe");
            obsidianSteelIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.steelIceAxeID+5, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Obsidian, "obsidianSteelIceAxe");
            boneSteelIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.steelIceAxeID+6, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Bone, "boneSteelIceAxe");
            netherrackSteelIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.steelIceAxeID+7, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Netherrack, "netherrackSteelIceAxe");
            glowstoneSteelIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.steelIceAxeID+8, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Glowstone, "glowstoneSteelIceAxe");
            iceSteelIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.steelIceAxeID+9, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Ice, "iceSteelIceAxe");
            slimeSteelIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.steelIceAxeID+10, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Slime, "slimeSteelIceAxe");
            cactusSteelIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.steelIceAxeID+11, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Cactus, "cactusSteelIceAxe");
            blazeSteelIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.steelIceAxeID+12, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Blaze, "blazeSteelIceAxe");
            copperSteelIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.steelIceAxeID+13, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Copper, "copperSteelIceAxe");
            bronzeSteelIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.steelIceAxeID+14, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Bronze, "bronzeSteelIceAxe");
            workedSteelIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.steelIceAxeID+15, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.WorkedIron, "workedSteelIceAxe");
            steelSteelIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.steelIceAxeID+16, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Steel, "steelSteelIceAxe");
            cobaltSteelIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.steelIceAxeID+17, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Cobalt, "cobaltSteelIceAxe");
            arditeSteelIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.steelIceAxeID+18, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Ardite, "arditeSteelIceAxe");
            uraniumSteelIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.steelIceAxeID+19, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Bronze, "uraniumSteelIceAxe");

            MinecraftForge.setToolClass(woodSteelIceAxe, "pickaxe", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(stoneSteelIceAxe, "pickaxe", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(ironSteelIceAxe, "pickaxe", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(diamondSteelIceAxe, "pickaxe", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(redstoneSteelIceAxe, "pickaxe", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(obsidianSteelIceAxe, "pickaxe", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(boneSteelIceAxe, "pickaxe", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackSteelIceAxe, "pickaxe", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(glowstoneSteelIceAxe, "pickaxe", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(iceSteelIceAxe, "pickaxe", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(slimeSteelIceAxe, "pickaxe", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(cactusSteelIceAxe, "pickaxe", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(blazeSteelIceAxe, "pickaxe", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(copperSteelIceAxe, "pickaxe", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(bronzeSteelIceAxe, "pickaxe", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(workedSteelIceAxe, "pickaxe", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(steelSteelIceAxe, "pickaxe", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(cobaltSteelIceAxe, "pickaxe", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(arditeSteelIceAxe, "pickaxe", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(uraniumSteelIceAxe, "pickaxe", InfiMaterialEnum.Steel.getHarvestLevel());
        }
        
        if(PropsHelperInfiHybrids.enableCobaltTools)
        {
        	woodCobaltIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.cobaltIceAxeID+0, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Wood, "woodCobaltIceAxe");
            stoneCobaltIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.cobaltIceAxeID+1, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Stone, "stoneCobaltIceAxe");
            ironCobaltIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.cobaltIceAxeID+2, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Iron, "ironCobaltIceAxe");
            diamondCobaltIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.cobaltIceAxeID+3,
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Diamond, "diamondCobaltIceAxe");
            redstoneCobaltIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.cobaltIceAxeID+4, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Redstone, "redstoneCobaltIceAxe");
            obsidianCobaltIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.cobaltIceAxeID+5, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Obsidian, "obsidianCobaltIceAxe");
            boneCobaltIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.cobaltIceAxeID+6, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Bone, "boneCobaltIceAxe");
            slimeCobaltIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.cobaltIceAxeID+7, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Slime, "slimeCobaltIceAxe");
            cactusCobaltIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.cobaltIceAxeID+8, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Cactus, "cactusCobaltIceAxe");
            blazeCobaltIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.cobaltIceAxeID+9, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Blaze, "blazeCobaltIceAxe");
            copperCobaltIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.cobaltIceAxeID+10, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Copper, "copperCobaltIceAxe");
            bronzeCobaltIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.cobaltIceAxeID+11, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Bronze, "bronzeCobaltIceAxe");
            workedCobaltIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.cobaltIceAxeID+12, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.WorkedIron, "workedCobaltIceAxe");
            steelCobaltIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.cobaltIceAxeID+13, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Steel, "steelCobaltIceAxe");
            cobaltCobaltIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.cobaltIceAxeID+14, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Cobalt, "cobaltCobaltIceAxe");
            arditeCobaltIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.cobaltIceAxeID+15, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Ardite, "arditeCobaltIceAxe");
            manyullynCobaltIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.cobaltIceAxeID+16, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Manyullyn, "arditeCobaltIceAxe");
            uraniumCobaltIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.cobaltIceAxeID+17, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Bronze, "uraniumCobaltIceAxe");
            
            MinecraftForge.setToolClass(woodCobaltIceAxe, "pickaxe", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(stoneCobaltIceAxe, "pickaxe", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(ironCobaltIceAxe, "pickaxe", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(diamondCobaltIceAxe, "pickaxe", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(redstoneCobaltIceAxe, "pickaxe", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(obsidianCobaltIceAxe, "pickaxe", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(boneCobaltIceAxe, "pickaxe", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(slimeCobaltIceAxe, "pickaxe", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(cactusCobaltIceAxe, "pickaxe", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(blazeCobaltIceAxe, "pickaxe", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(copperCobaltIceAxe, "pickaxe", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(bronzeCobaltIceAxe, "pickaxe", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(workedCobaltIceAxe, "pickaxe", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(steelCobaltIceAxe, "pickaxe", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(cobaltCobaltIceAxe, "pickaxe", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(arditeCobaltIceAxe, "pickaxe", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(manyullynCobaltIceAxe, "pickaxe", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(uraniumCobaltIceAxe, "pickaxe", InfiMaterialEnum.Cobalt.getHarvestLevel());
        }
        
        if(PropsHelperInfiHybrids.enableArditeTools)
        {
        	woodArditeIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.arditeIceAxeID+0, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Wood, "woodArditeIceAxe");
            stoneArditeIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.arditeIceAxeID+1, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Stone, "stoneArditeIceAxe");
            ironArditeIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.arditeIceAxeID+2, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Iron, "ironArditeIceAxe");
            diamondArditeIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.arditeIceAxeID+3,
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Diamond, "diamondArditeIceAxe");
            redstoneArditeIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.arditeIceAxeID+4, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Redstone, "redstoneArditeIceAxe");
            obsidianArditeIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.arditeIceAxeID+5, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Obsidian, "obsidianArditeIceAxe");
            boneArditeIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.arditeIceAxeID+6,
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Bone, "boneArditeIceAxe");
            slimeArditeIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.arditeIceAxeID+7, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Slime, "slimeArditeIceAxe");
            cactusArditeIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.arditeIceAxeID+8, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Cactus, "cactusArditeIceAxe");
            blazeArditeIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.arditeIceAxeID+9, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Blaze, "blazeArditeIceAxe");
            copperArditeIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.arditeIceAxeID+10, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Copper, "copperArditeIceAxe");
            bronzeArditeIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.arditeIceAxeID+11, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Bronze, "bronzeArditeIceAxe");
            workedArditeIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.arditeIceAxeID+12, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.WorkedIron, "workedArditeIceAxe");
            steelArditeIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.arditeIceAxeID+13, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Steel, "steelArditeIceAxe");
            cobaltArditeIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.arditeIceAxeID+14, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Cobalt, "cobaltArditeIceAxe");
            arditeArditeIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.arditeIceAxeID+15, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Ardite, "arditeArditeIceAxe");
            manyullynArditeIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.arditeIceAxeID+16, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Manyullyn, "arditeArditeIceAxe");
            uraniumArditeIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.arditeIceAxeID+17, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Bronze, "uraniumArditeIceAxe");
            
            MinecraftForge.setToolClass(woodArditeIceAxe, "pickaxe", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(stoneArditeIceAxe, "pickaxe", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(ironArditeIceAxe, "pickaxe", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(diamondArditeIceAxe, "pickaxe", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(redstoneArditeIceAxe, "pickaxe", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(obsidianArditeIceAxe, "pickaxe", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(boneArditeIceAxe, "pickaxe", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(slimeArditeIceAxe, "pickaxe", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(cactusArditeIceAxe, "pickaxe", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(blazeArditeIceAxe, "pickaxe", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(copperArditeIceAxe, "pickaxe", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(bronzeArditeIceAxe, "pickaxe", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(workedArditeIceAxe, "pickaxe", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(steelArditeIceAxe, "pickaxe", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(cobaltArditeIceAxe, "pickaxe", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(arditeArditeIceAxe, "pickaxe", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(manyullynArditeIceAxe, "pickaxe", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(uraniumArditeIceAxe, "pickaxe", InfiMaterialEnum.Ardite.getHarvestLevel());
        }
        
        if(PropsHelperInfiHybrids.enableManyullynTools)
        {
        	woodManyullynIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.manyullynIceAxeID+0, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Stone, "woodManyullynIceAxe");
            stoneManyullynIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.manyullynIceAxeID+1, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Stone, "stoneManyullynIceAxe");
            ironManyullynIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.manyullynIceAxeID+2, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Iron, "ironManyullynIceAxe");
            diamondManyullynIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.manyullynIceAxeID+3,
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Diamond, "diamondManyullynIceAxe");
            redstoneManyullynIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.manyullynIceAxeID+4, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Redstone, "redstoneManyullynIceAxe");
            obsidianManyullynIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.manyullynIceAxeID+5, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Obsidian, "obsidianManyullynIceAxe");
            boneManyullynIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.manyullynIceAxeID+6, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Bone, "boneManyullynIceAxe");
            slimeManyullynIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.manyullynIceAxeID+7, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Slime, "slimeManyullynIceAxe");
            cactusManyullynIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.manyullynIceAxeID+8, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Cactus, "cactusManyullynIceAxe");
            blazeManyullynIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.manyullynIceAxeID+9, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Blaze, "blazeManyullynIceAxe");
            copperManyullynIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.manyullynIceAxeID+10, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Copper, "copperManyullynIceAxe");
            bronzeManyullynIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.manyullynIceAxeID+11, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Bronze, "bronzeManyullynIceAxe");
            workedManyullynIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.manyullynIceAxeID+12, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.WorkedIron, "workedManyullynIceAxe");
            steelManyullynIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.manyullynIceAxeID+13, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Steel, "steelManyullynIceAxe");
            cobaltManyullynIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.manyullynIceAxeID+14, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Cobalt, "cobaltManyullynIceAxe");
            arditeManyullynIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.manyullynIceAxeID+15, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Ardite, "arditeManyullynIceAxe");
            manyullynManyullynIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.manyullynIceAxeID+16, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Manyullyn, "arditeManyullynIceAxe");
            uraniumManyullynIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.manyullynIceAxeID+17,
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Bronze, "uraniumManyullynIceAxe");
            
            MinecraftForge.setToolClass(woodManyullynIceAxe, "pickaxe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(stoneManyullynIceAxe, "pickaxe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(ironManyullynIceAxe, "pickaxe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(diamondManyullynIceAxe, "pickaxe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(redstoneManyullynIceAxe, "pickaxe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(obsidianManyullynIceAxe, "pickaxe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(boneManyullynIceAxe, "pickaxe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(slimeManyullynIceAxe, "pickaxe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(cactusManyullynIceAxe, "pickaxe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(blazeManyullynIceAxe, "pickaxe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(copperManyullynIceAxe, "pickaxe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(bronzeManyullynIceAxe, "pickaxe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(workedManyullynIceAxe, "pickaxe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(steelManyullynIceAxe, "pickaxe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(cobaltManyullynIceAxe, "pickaxe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(arditeManyullynIceAxe, "pickaxe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(manyullynManyullynIceAxe, "pickaxe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(uraniumManyullynIceAxe, "pickaxe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
        }
        
        if(PropsHelperInfiHybrids.enableUraniumTools)
        {
            diamondUraniumIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.uraniumIceAxeID+0, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Diamond, "diamondUraniumIceAxe");
            redstoneUraniumIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.uraniumIceAxeID+1, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Redstone, "redstoneUraniumIceAxe");
            boneUraniumIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.uraniumIceAxeID+2, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Bone, "boneUraniumIceAxe");
            netherrackUraniumIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.uraniumIceAxeID+3, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Netherrack, "netherrackUraniumIceAxe");
            glowstoneUraniumIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.uraniumIceAxeID+4, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Glowstone, "glowstoneUraniumIceAxe");
            lavaUraniumIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.uraniumIceAxeID+5, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Lava, "lavaUraniumIceAxe");
            blazeUraniumIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.uraniumIceAxeID+6, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Blaze, "blazeUraniumIceAxe");
            cobaltUraniumIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.uraniumIceAxeID+7, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Cobalt, "cobaltUraniumIceAxe");
            arditeUraniumIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.uraniumIceAxeID+8, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Ardite, "arditeUraniumIceAxe");
            uraniumUraniumIceAxe = new InfiToolIceAxe(PropsHelperInfiHybrids.uraniumIceAxeID+9, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Uranium, "uraniumUraniumIceAxe");
            
            MinecraftForge.setToolClass(diamondUraniumIceAxe, "pickaxe", InfiMaterialEnum.Uranium.getHarvestLevel());
            MinecraftForge.setToolClass(redstoneUraniumIceAxe, "pickaxe", InfiMaterialEnum.Uranium.getHarvestLevel());
            MinecraftForge.setToolClass(boneUraniumIceAxe, "pickaxe", InfiMaterialEnum.Uranium.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackUraniumIceAxe, "pickaxe", InfiMaterialEnum.Uranium.getHarvestLevel());
            MinecraftForge.setToolClass(glowstoneUraniumIceAxe, "pickaxe", InfiMaterialEnum.Uranium.getHarvestLevel());
            MinecraftForge.setToolClass(lavaUraniumIceAxe, "pickaxe", InfiMaterialEnum.Uranium.getHarvestLevel());
            MinecraftForge.setToolClass(blazeUraniumIceAxe, "pickaxe", InfiMaterialEnum.Uranium.getHarvestLevel());
            MinecraftForge.setToolClass(cobaltUraniumIceAxe, "pickaxe", InfiMaterialEnum.Uranium.getHarvestLevel());
            MinecraftForge.setToolClass(arditeUraniumIceAxe, "pickaxe", InfiMaterialEnum.Uranium.getHarvestLevel());
            MinecraftForge.setToolClass(uraniumUraniumIceAxe, "pickaxe", InfiMaterialEnum.Uranium.getHarvestLevel());
        }
    }
    
    private static void addNames()
    {
    	ModLoader.addName(woodWoodIceAxe, "Wooden Ice Axe");
    	ModLoader.addName(stoneStoneIceAxe, "Heavy Ice Axe");
    	ModLoader.addName(ironIronIceAxe, "Ironic Ice Axe");
    	ModLoader.addName(diamondDiamondIceAxe, "Diamondium Ice Axe");
    	ModLoader.addName(redstoneRedstoneIceAxe, "Redredred Ice Axe");
    	ModLoader.addName(obsidianObsidianIceAxe, "Ebony Ice Axe");
    	ModLoader.addName(sandstoneSandstoneIceAxe, "Fragile Ice Axe");
    	ModLoader.addName(boneBoneIceAxe, "Necrotic Ice Axe");
    	ModLoader.addName(paperPaperIceAxe, "Soft Ice Axe");
    	ModLoader.addName(mossyMossyIceAxe, "Living Ice Axe");
    	ModLoader.addName(netherrackNetherrackIceAxe, "Blood Pick");
    	ModLoader.addName(glowstoneGlowstoneIceAxe, "Bright Ice Axe");
    	ModLoader.addName(iceIceIceAxe, "Freezing Ice Axe");
    	ModLoader.addName(lavaLavaIceAxe, "Burning Ice Axe");
    	ModLoader.addName(slimeSlimeIceAxe, "Toy Ice Axe");
    	ModLoader.addName(cactusCactusIceAxe, "Thorned Ice Axe");
    	ModLoader.addName(flintFlintIceAxe, "Rough-hewn Ice Axe");
    	ModLoader.addName(blazeBlazeIceAxe, "Netherite Ice Axe");
        ModLoader.addName(copperCopperIceAxe, "Orange-Tang Ice Axe");
        ModLoader.addName(bronzeBronzeIceAxe, "Polished Ice Axe");
        ModLoader.addName(workedWorkedIronIceAxe, "Reworked Iron Ice Axe");
        ModLoader.addName(steelSteelIceAxe, "Forge-Wrought Ice Axe");
        ModLoader.addName(cobaltCobaltIceAxe, "Beautiful Ice Axe");
        ModLoader.addName(arditeArditeIceAxe, "Rustic Ice Axe");
        ModLoader.addName(manyullynManyullynIceAxe, "False-Prophetic Ice Axe");
        ModLoader.addName(uraniumUraniumIceAxe, "Cancerous IceAxe");
    }
    
    public static void registerInfiToolsRecipes()
    {
    	if(PropsHelperInfiHybrids.enableWoodTools)
        {
            ModLoader.addRecipe(new ItemStack(woodWoodIceAxe), new Object[] 
                    { recipe, '#', Block.planks, '|', Item.stick, 's', Item.stick });
            ModLoader.addRecipe(new ItemStack(sandstoneWoodIceAxe), new Object[] 
                    { recipe, '#', Block.planks, '|', mod_InfiBase.sandstoneRod, 's', Item.stick });
            ModLoader.addRecipe(new ItemStack(boneWoodIceAxe), new Object[] 
                    { recipe, '#', Block.planks, '|', Item.bone, 's', Item.stick });
            ModLoader.addRecipe(new ItemStack(boneWoodIceAxe), new Object[] 
                    { recipe, '#', Block.planks, '|', mod_InfiBase.boneRod, 's', Item.stick });
            ModLoader.addRecipe(new ItemStack(paperWoodIceAxe), new Object[] 
                    { recipe, '#', Block.planks, '|', mod_InfiBase.paperRod, 's', Item.stick });
            ModLoader.addRecipe(new ItemStack(iceWoodIceAxe), new Object[] 
                    { recipe, '#', Block.planks, '|', mod_InfiBase.iceRod, 's', Item.stick });
            ModLoader.addRecipe(new ItemStack(slimeWoodIceAxe), new Object[] 
                    { recipe, '#', Block.planks, '|', mod_InfiBase.slimeRod, 's', Item.stick });
            ModLoader.addRecipe(new ItemStack(cactusWoodIceAxe), new Object[] 
                    { recipe, '#', Block.planks, '|', mod_InfiBase.cactusRod, 's', Item.stick });
        }
    	
        if(PropsHelperInfiHybrids.enableStoneTools)
        {
        	ModLoader.addRecipe(new ItemStack(woodStoneIceAxe), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', Item.stick, 's', mod_InfiBase.stoneShard });
        	ModLoader.addRecipe(new ItemStack(stoneStoneIceAxe), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', mod_InfiBase.stoneRod, 's', mod_InfiBase.stoneShard });
            ModLoader.addRecipe(new ItemStack(sandstoneStoneIceAxe), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', mod_InfiBase.sandstoneRod, 's', mod_InfiBase.stoneShard });
            ModLoader.addRecipe(new ItemStack(boneStoneIceAxe), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', Item.bone, 's', mod_InfiBase.stoneShard });
            ModLoader.addRecipe(new ItemStack(boneStoneIceAxe), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', mod_InfiBase.boneRod, 's', mod_InfiBase.stoneShard });
            ModLoader.addRecipe(new ItemStack(netherrackStoneIceAxe), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', mod_InfiBase.netherrackRod, 's', mod_InfiBase.stoneShard });
            ModLoader.addRecipe(new ItemStack(iceStoneIceAxe), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', mod_InfiBase.iceRod, 's', mod_InfiBase.stoneShard });
            ModLoader.addRecipe(new ItemStack(slimeStoneIceAxe), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', mod_InfiBase.slimeRod, 's', mod_InfiBase.stoneShard });
            ModLoader.addRecipe(new ItemStack(cactusStoneIceAxe), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', mod_InfiBase.cactusRod, 's', mod_InfiBase.stoneShard });
            ModLoader.addRecipe(new ItemStack(flintStoneIceAxe), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', mod_InfiBase.flintRod, 's', mod_InfiBase.stoneShard });
            
            ModLoader.addRecipe(new ItemStack(woodStoneIceAxe), new Object[] 
                    { recipe, '#', Block.stone, '|', Item.stick, 's', mod_InfiBase.stoneShard });
        	ModLoader.addRecipe(new ItemStack(stoneStoneIceAxe), new Object[] 
                    { recipe, '#', Block.stone, '|', mod_InfiBase.stoneRod, 's', mod_InfiBase.stoneShard });
            ModLoader.addRecipe(new ItemStack(sandstoneStoneIceAxe), new Object[] 
                    { recipe, '#', Block.stone, '|', mod_InfiBase.sandstoneRod, 's', mod_InfiBase.stoneShard });
            ModLoader.addRecipe(new ItemStack(boneStoneIceAxe), new Object[] 
                    { recipe, '#', Block.stone, '|', Item.bone, 's', mod_InfiBase.stoneShard });
            ModLoader.addRecipe(new ItemStack(boneStoneIceAxe), new Object[] 
                    { recipe, '#', Block.stone, '|', mod_InfiBase.boneRod, 's', mod_InfiBase.stoneShard });
            ModLoader.addRecipe(new ItemStack(netherrackStoneIceAxe), new Object[] 
                    { recipe, '#', Block.stone, '|', mod_InfiBase.netherrackRod, 's', mod_InfiBase.stoneShard });
            ModLoader.addRecipe(new ItemStack(iceStoneIceAxe), new Object[] 
                    { recipe, '#', Block.stone, '|', mod_InfiBase.iceRod, 's', mod_InfiBase.stoneShard });
            ModLoader.addRecipe(new ItemStack(slimeStoneIceAxe), new Object[] 
                    { recipe, '#', Block.stone, '|', mod_InfiBase.slimeRod, 's', mod_InfiBase.stoneShard });
            ModLoader.addRecipe(new ItemStack(cactusStoneIceAxe), new Object[] 
                    { recipe, '#', Block.stone, '|', mod_InfiBase.cactusRod, 's', mod_InfiBase.stoneShard });
            ModLoader.addRecipe(new ItemStack(flintStoneIceAxe), new Object[] 
                    { recipe, '#', Block.stone, '|', mod_InfiBase.flintRod, 's', mod_InfiBase.stoneShard });
        }
        
        if(PropsHelperInfiHybrids.enableIronTools)
        {
        	ModLoader.addRecipe(new ItemStack(woodIronIceAxe), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', Item.stick, 's', mod_InfiBase.ironChunk });
        	ModLoader.addRecipe(new ItemStack(stoneIronIceAxe), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', mod_InfiBase.stoneRod, 's', mod_InfiBase.ironChunk });
            ModLoader.addRecipe(new ItemStack(ironIronIceAxe), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', mod_InfiBase.ironRod, 's', mod_InfiBase.ironChunk });
            ModLoader.addRecipe(new ItemStack(boneIronIceAxe), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', Item.bone, 's', mod_InfiBase.ironChunk });
            ModLoader.addRecipe(new ItemStack(boneIronIceAxe), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', mod_InfiBase.boneRod, 's', mod_InfiBase.ironChunk });
            ModLoader.addRecipe(new ItemStack(netherrackIronIceAxe), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', mod_InfiBase.netherrackRod, 's', mod_InfiBase.ironChunk });
            ModLoader.addRecipe(new ItemStack(glowstoneIronIceAxe), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', mod_InfiBase.glowstoneRod, 's', mod_InfiBase.ironChunk });
            ModLoader.addRecipe(new ItemStack(cactusIronIceAxe), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', mod_InfiBase.cactusRod, 's', mod_InfiBase.ironChunk });
            ModLoader.addRecipe(new ItemStack(copperIronIceAxe), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', mod_InfiBase.copperRod, 's', mod_InfiBase.ironChunk });
            ModLoader.addRecipe(new ItemStack(bronzeIronIceAxe), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', mod_InfiBase.bronzeRod, 's', mod_InfiBase.ironChunk });
        }
        
        if(PropsHelperInfiHybrids.enableDiamondTools)
        {
        	ModLoader.addRecipe(new ItemStack(woodDiamondIceAxe), new Object[] 
                    { recipe, '#', Item.diamond, '|', Item.stick, 's', mod_InfiBase.diamondShard });
        	ModLoader.addRecipe(new ItemStack(stoneDiamondIceAxe), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.stoneRod, 's', mod_InfiBase.diamondShard });
            ModLoader.addRecipe(new ItemStack(ironDiamondIceAxe), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.ironRod, 's', mod_InfiBase.diamondShard });
            ModLoader.addRecipe(new ItemStack(diamondDiamondIceAxe), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.diamondRod, 's', mod_InfiBase.diamondShard });
            ModLoader.addRecipe(new ItemStack(redstoneDiamondIceAxe), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.redstoneRod, 's', mod_InfiBase.diamondShard });
            ModLoader.addRecipe(new ItemStack(obsidianDiamondIceAxe), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.obsidianRod, 's', mod_InfiBase.diamondShard });
            ModLoader.addRecipe(new ItemStack(boneDiamondIceAxe), new Object[] 
                    { recipe, '#', Item.diamond, '|', Item.bone, 's', mod_InfiBase.diamondShard });
            ModLoader.addRecipe(new ItemStack(boneDiamondIceAxe), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.boneRod, 's', mod_InfiBase.diamondShard });
            ModLoader.addRecipe(new ItemStack(mossyDiamondIceAxe), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.mossyRod, 's', mod_InfiBase.diamondShard });
            ModLoader.addRecipe(new ItemStack(netherrackDiamondIceAxe), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.netherrackRod, 's', mod_InfiBase.diamondShard });
            ModLoader.addRecipe(new ItemStack(glowstoneDiamondIceAxe), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.glowstoneRod, 's', mod_InfiBase.diamondShard });
            ModLoader.addRecipe(new ItemStack(lavaDiamondIceAxe), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.lavaRod, 's', mod_InfiBase.diamondShard });
            ModLoader.addRecipe(new ItemStack(cactusDiamondIceAxe), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.cactusRod, 's', mod_InfiBase.diamondShard });
            ModLoader.addRecipe(new ItemStack(flintDiamondIceAxe), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.flintRod, 's', mod_InfiBase.diamondShard });
            ModLoader.addRecipe(new ItemStack(blazeDiamondIceAxe), new Object[] 
                    { recipe, '#', Item.diamond, '|', Item.blazeRod, 's', mod_InfiBase.diamondShard });
            ModLoader.addRecipe(new ItemStack(copperDiamondIceAxe), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.copperRod, 's', mod_InfiBase.diamondShard });
            ModLoader.addRecipe(new ItemStack(bronzeDiamondIceAxe), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.bronzeRod, 's', mod_InfiBase.diamondShard });
            ModLoader.addRecipe(new ItemStack(workedDiamondIceAxe), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.workedIronRod, 's', mod_InfiBase.diamondShard });
            ModLoader.addRecipe(new ItemStack(steelDiamondIceAxe), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.steelRod, 's', mod_InfiBase.diamondShard });
            ModLoader.addRecipe(new ItemStack(cobaltDiamondIceAxe), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.cobaltRod, 's', mod_InfiBase.diamondShard });
            ModLoader.addRecipe(new ItemStack(arditeDiamondIceAxe), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.arditeRod, 's', mod_InfiBase.diamondShard });
            ModLoader.addRecipe(new ItemStack(manyullynDiamondIceAxe), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.manyullynRod, 's', mod_InfiBase.diamondShard });
            ModLoader.addRecipe(new ItemStack(uraniumDiamondIceAxe), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.uraniumRod, 's', mod_InfiBase.diamondShard });
        }
        
        if(PropsHelperInfiHybrids.enableRedstoneTools)
        {
        	ModLoader.addRecipe(new ItemStack(woodRedstoneIceAxe), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', Item.stick, 's', mod_InfiBase.redstoneFragment });
        	ModLoader.addRecipe(new ItemStack(stoneRedstoneIceAxe), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.stoneRod, 's', mod_InfiBase.redstoneFragment });
            ModLoader.addRecipe(new ItemStack(ironRedstoneIceAxe), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.ironRod, 's', mod_InfiBase.redstoneFragment });
            ModLoader.addRecipe(new ItemStack(redstoneRedstoneIceAxe), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.redstoneRod, 's', mod_InfiBase.redstoneFragment });
            ModLoader.addRecipe(new ItemStack(obsidianRedstoneIceAxe), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.obsidianRod, 's', mod_InfiBase.redstoneFragment });
            ModLoader.addRecipe(new ItemStack(sandstoneRedstoneIceAxe), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.sandstoneRod, 's', mod_InfiBase.redstoneFragment });
            ModLoader.addRecipe(new ItemStack(boneRedstoneIceAxe), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', Item.bone, 's', mod_InfiBase.redstoneFragment });
            ModLoader.addRecipe(new ItemStack(boneRedstoneIceAxe), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.boneRod, 's', mod_InfiBase.redstoneFragment });
            ModLoader.addRecipe(new ItemStack(paperRedstoneIceAxe), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.paperRod, 's', mod_InfiBase.redstoneFragment });
            ModLoader.addRecipe(new ItemStack(mossyRedstoneIceAxe), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.mossyRod, 's', mod_InfiBase.redstoneFragment });
            ModLoader.addRecipe(new ItemStack(netherrackRedstoneIceAxe), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.netherrackRod, 's', mod_InfiBase.redstoneFragment });
            ModLoader.addRecipe(new ItemStack(glowstoneRedstoneIceAxe), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.glowstoneRod, 's', mod_InfiBase.redstoneFragment });
            ModLoader.addRecipe(new ItemStack(iceRedstoneIceAxe), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.iceRod, 's', mod_InfiBase.redstoneFragment });
            ModLoader.addRecipe(new ItemStack(lavaRedstoneIceAxe), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.lavaRod, 's', mod_InfiBase.redstoneFragment });
            ModLoader.addRecipe(new ItemStack(slimeRedstoneIceAxe), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.slimeRod, 's', mod_InfiBase.redstoneFragment });
            ModLoader.addRecipe(new ItemStack(cactusRedstoneIceAxe), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.cactusRod, 's', mod_InfiBase.redstoneFragment });
            ModLoader.addRecipe(new ItemStack(flintRedstoneIceAxe), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.flintRod, 's', mod_InfiBase.redstoneFragment });
            ModLoader.addRecipe(new ItemStack(copperRedstoneIceAxe), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.copperRod, 's', mod_InfiBase.redstoneFragment });
            ModLoader.addRecipe(new ItemStack(bronzeRedstoneIceAxe), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.bronzeRod, 's', mod_InfiBase.redstoneFragment });
            ModLoader.addRecipe(new ItemStack(workedRedstoneIceAxe), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.workedIronRod, 's', mod_InfiBase.redstoneFragment });
            ModLoader.addRecipe(new ItemStack(uraniumRedstoneIceAxe), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.uraniumRod, 's', mod_InfiBase.redstoneFragment });
        }
        
        if(PropsHelperInfiHybrids.enableObsidianTools)
        {
        	ModLoader.addRecipe(new ItemStack(woodObsidianIceAxe), new Object[] 
                    { recipe, '#', Block.obsidian, '|', Item.stick, 's', mod_InfiBase.obsidianShard });
        	ModLoader.addRecipe(new ItemStack(stoneObsidianIceAxe), new Object[] 
                    { recipe, '#', Block.obsidian, '|', mod_InfiBase.stoneRod, 's', mod_InfiBase.obsidianShard });
            ModLoader.addRecipe(new ItemStack(redstoneObsidianIceAxe), new Object[] 
                    { recipe, '#', Block.obsidian, '|', mod_InfiBase.redstoneRod, 's', mod_InfiBase.obsidianShard });
            ModLoader.addRecipe(new ItemStack(obsidianObsidianIceAxe), new Object[] 
                    { recipe, '#', Block.obsidian, '|', mod_InfiBase.obsidianRod, 's', mod_InfiBase.obsidianShard });
            ModLoader.addRecipe(new ItemStack(boneObsidianIceAxe), new Object[] 
                    { recipe, '#', Block.obsidian, '|', Item.bone, 's', mod_InfiBase.obsidianShard });
            ModLoader.addRecipe(new ItemStack(boneObsidianIceAxe), new Object[] 
                    { recipe, '#', Block.obsidian, '|', mod_InfiBase.boneRod, 's', mod_InfiBase.obsidianShard });
            ModLoader.addRecipe(new ItemStack(netherrackObsidianIceAxe), new Object[] 
                    { recipe, '#', Block.obsidian, '|', mod_InfiBase.netherrackRod, 's', mod_InfiBase.obsidianShard });
            ModLoader.addRecipe(new ItemStack(glowstoneObsidianIceAxe), new Object[] 
                    { recipe, '#', Block.obsidian, '|', mod_InfiBase.glowstoneRod, 's', mod_InfiBase.obsidianShard });
            ModLoader.addRecipe(new ItemStack(iceObsidianIceAxe), new Object[] 
                    { recipe, '#', Block.obsidian, '|', mod_InfiBase.iceRod, 's', mod_InfiBase.obsidianShard });
            ModLoader.addRecipe(new ItemStack(lavaObsidianIceAxe), new Object[] 
                    { recipe, '#', Block.obsidian, '|', mod_InfiBase.lavaRod, 's', mod_InfiBase.obsidianShard });
            ModLoader.addRecipe(new ItemStack(cactusObsidianIceAxe), new Object[] 
                    { recipe, '#', Block.obsidian, '|', mod_InfiBase.cactusRod, 's', mod_InfiBase.obsidianShard });
        }
        
        if(PropsHelperInfiHybrids.enableSandstoneTools)
        {
            ModLoader.addRecipe(new ItemStack(woodSandstoneIceAxe), new Object[] 
                    { recipe, '#', Block.sandStone, '|', Item.stick, 's', mod_InfiBase.sandstoneShard });
            ModLoader.addRecipe(new ItemStack(sandstoneSandstoneIceAxe), new Object[] 
                    { recipe, '#', Block.sandStone, '|', mod_InfiBase.sandstoneRod, 's', mod_InfiBase.sandstoneShard });
            ModLoader.addRecipe(new ItemStack(boneSandstoneIceAxe), new Object[] 
                    { recipe, '#', Block.sandStone, '|', Item.bone, 's', mod_InfiBase.sandstoneShard });
            ModLoader.addRecipe(new ItemStack(boneSandstoneIceAxe), new Object[] 
                    { recipe, '#', Block.sandStone, '|', mod_InfiBase.boneRod, 's', mod_InfiBase.sandstoneShard });      
            ModLoader.addRecipe(new ItemStack(netherrackSandstoneIceAxe), new Object[] 
                    { recipe, '#', Block.sandStone, '|', mod_InfiBase.netherrackRod, 's', mod_InfiBase.sandstoneShard });
            ModLoader.addRecipe(new ItemStack(iceSandstoneIceAxe), new Object[] 
                    { recipe, '#', Block.sandStone, '|', mod_InfiBase.iceRod, 's', mod_InfiBase.sandstoneShard });
            ModLoader.addRecipe(new ItemStack(slimeSandstoneIceAxe), new Object[] 
                    { recipe, '#', Block.sandStone, '|', mod_InfiBase.slimeRod, 's', mod_InfiBase.sandstoneShard });
            ModLoader.addRecipe(new ItemStack(cactusSandstoneIceAxe), new Object[] 
                    { recipe, '#', Block.sandStone, '|', mod_InfiBase.cactusRod, 's', mod_InfiBase.sandstoneShard });
            ModLoader.addRecipe(new ItemStack(flintSandstoneIceAxe), new Object[] 
                    { recipe, '#', Block.sandStone, '|', mod_InfiBase.flintRod, 's', mod_InfiBase.sandstoneShard });
        }
        
        if(PropsHelperInfiHybrids.enableBoneTools)
        {
            ModLoader.addRecipe(new ItemStack(woodBoneIceAxe), new Object[] 
                    { recipe, '#', Item.bone, '|', Item.stick, 's', new ItemStack(Item.dyePowder, 1, 15) });
            ModLoader.addRecipe(new ItemStack(stoneBoneIceAxe), new Object[] 
                    { recipe, '#', Item.bone, '|', mod_InfiBase.stoneRod, 's', new ItemStack(Item.dyePowder, 1, 15) });
            ModLoader.addRecipe(new ItemStack(sandstoneBoneIceAxe), new Object[] 
                    { recipe, '#', Item.bone, '|', mod_InfiBase.sandstoneRod, 's', new ItemStack(Item.dyePowder, 1, 15) });
            ModLoader.addRecipe(new ItemStack(boneBoneIceAxe), new Object[] 
                    { recipe, '#', Item.bone, '|', Item.bone, 's', new ItemStack(Item.dyePowder, 1, 15) });
            ModLoader.addRecipe(new ItemStack(boneBoneIceAxe), new Object[] 
                    { recipe, '#', Item.bone, '|', mod_InfiBase.boneRod, 's', new ItemStack(Item.dyePowder, 1, 15) });
            ModLoader.addRecipe(new ItemStack(paperBoneIceAxe), new Object[] 
                    { recipe, '#', Item.bone, '|', mod_InfiBase.paperRod, 's', new ItemStack(Item.dyePowder, 1, 15) });
            ModLoader.addRecipe(new ItemStack(netherrackBoneIceAxe), new Object[] 
                    { recipe, '#', Item.bone, '|', mod_InfiBase.netherrackRod, 's', new ItemStack(Item.dyePowder, 1, 15) });
            ModLoader.addRecipe(new ItemStack(iceBoneIceAxe), new Object[] 
                    { recipe, '#', Item.bone, '|', mod_InfiBase.iceRod, 's', new ItemStack(Item.dyePowder, 1, 15) });
            ModLoader.addRecipe(new ItemStack(cactusBoneIceAxe), new Object[] 
                    { recipe, '#', Item.bone, '|', mod_InfiBase.cactusRod, 's', new ItemStack(Item.dyePowder, 1, 15) });
            ModLoader.addRecipe(new ItemStack(flintBoneIceAxe), new Object[] 
                    { recipe, '#', Item.bone, '|', mod_InfiBase.flintRod, 's', new ItemStack(Item.dyePowder, 1, 15) });
        }
        
        if(PropsHelperInfiHybrids.enablePaperTools)
        {
            ModLoader.addRecipe(new ItemStack(woodPaperIceAxe), new Object[] 
                    { recipe, '#', mod_InfiBase.paperStack, '|', Item.stick, 's', Item.paper });
            ModLoader.addRecipe(new ItemStack(bonePaperIceAxe), new Object[] 
                    { recipe, '#', mod_InfiBase.paperStack, '|', Item.bone, 's', Item.paper });
            ModLoader.addRecipe(new ItemStack(bonePaperIceAxe), new Object[] 
                    { recipe, '#', mod_InfiBase.paperStack, '|', mod_InfiBase.boneRod, 's', Item.paper });
            ModLoader.addRecipe(new ItemStack(paperPaperIceAxe), new Object[] 
                    { recipe, '#', mod_InfiBase.paperStack, '|', mod_InfiBase.paperRod, 's', Item.paper });
            ModLoader.addRecipe(new ItemStack(slimePaperIceAxe), new Object[] 
                    { recipe, '#', mod_InfiBase.paperStack, '|', mod_InfiBase.slimeRod, 's', Item.paper });
            ModLoader.addRecipe(new ItemStack(cactusPaperIceAxe), new Object[] 
                    { recipe, '#', mod_InfiBase.paperStack, '|', mod_InfiBase.cactusRod, 's', Item.paper });
        }
        
        if(PropsHelperInfiHybrids.enableMossyTools)
        {
        	ModLoader.addRecipe(new ItemStack(woodMossyIceAxe), new Object[] 
                    { recipe, '#', mod_InfiBase.mossyStone, '|', Item.stick, 's', mod_InfiBase.mossyPatch });
        	ModLoader.addRecipe(new ItemStack(stoneMossyIceAxe), new Object[] 
                    { recipe, '#', mod_InfiBase.mossyStone, '|', mod_InfiBase.stoneRod, 's', mod_InfiBase.mossyPatch });
            ModLoader.addRecipe(new ItemStack(diamondMossyIceAxe), new Object[] 
                    { recipe, '#', mod_InfiBase.mossyStone, '|', mod_InfiBase.diamondRod, 's', mod_InfiBase.mossyPatch });
            ModLoader.addRecipe(new ItemStack(redstoneMossyIceAxe), new Object[] 
                    { recipe, '#', mod_InfiBase.mossyStone, '|', mod_InfiBase.redstoneRod, 's', mod_InfiBase.mossyPatch });
            ModLoader.addRecipe(new ItemStack(boneMossyIceAxe), new Object[] 
                    { recipe, '#', mod_InfiBase.mossyStone, '|', Item.bone, 's', mod_InfiBase.mossyPatch });
            ModLoader.addRecipe(new ItemStack(boneMossyIceAxe), new Object[] 
                    { recipe, '#', mod_InfiBase.mossyStone, '|', mod_InfiBase.boneRod, 's', mod_InfiBase.mossyPatch });
            ModLoader.addRecipe(new ItemStack(mossyMossyIceAxe), new Object[] 
                    { recipe, '#', mod_InfiBase.mossyStone, '|', mod_InfiBase.mossyRod, 's', mod_InfiBase.mossyPatch });
            ModLoader.addRecipe(new ItemStack(netherrackMossyIceAxe), new Object[] 
                    { recipe, '#', mod_InfiBase.mossyStone, '|', mod_InfiBase.netherrackRod, 's', mod_InfiBase.mossyPatch });
            ModLoader.addRecipe(new ItemStack(glowstoneMossyIceAxe), new Object[] 
                    { recipe, '#', mod_InfiBase.mossyStone, '|', mod_InfiBase.glowstoneRod, 's', mod_InfiBase.mossyPatch });
            ModLoader.addRecipe(new ItemStack(cactusMossyIceAxe), new Object[] 
                    { recipe, '#', mod_InfiBase.mossyStone, '|', mod_InfiBase.cactusRod, 's', mod_InfiBase.mossyPatch });
            ModLoader.addRecipe(new ItemStack(blazeMossyIceAxe), new Object[] 
                    { recipe, '#', mod_InfiBase.mossyStone, '|', Item.blazeRod, 's', mod_InfiBase.mossyPatch });
            ModLoader.addRecipe(new ItemStack(manyullynMossyIceAxe), new Object[] 
                    { recipe, '#', mod_InfiBase.mossyStone, '|', mod_InfiBase.manyullynRod, 's', mod_InfiBase.mossyPatch });
            ModLoader.addRecipe(new ItemStack(uraniumMossyIceAxe), new Object[] 
                    { recipe, '#', mod_InfiBase.mossyStone, '|', mod_InfiBase.uraniumRod, 's', mod_InfiBase.mossyPatch });
        }
        
        if(PropsHelperInfiHybrids.enableNetherrackTools)
        {
        	ModLoader.addRecipe(new ItemStack(woodNetherrackIceAxe), new Object[] 
                    { recipe, '#', Block.netherrack, '|', Item.stick, 's', mod_InfiBase.netherrackShard });
        	ModLoader.addRecipe(new ItemStack(stoneNetherrackIceAxe), new Object[] 
                    { recipe, '#', Block.netherrack, '|', mod_InfiBase.stoneRod, 's', mod_InfiBase.netherrackShard });
            ModLoader.addRecipe(new ItemStack(sandstoneNetherrackIceAxe), new Object[] 
                    { recipe, '#', Block.netherrack, '|', mod_InfiBase.sandstoneRod, 's', mod_InfiBase.netherrackShard });
            ModLoader.addRecipe(new ItemStack(boneNetherrackIceAxe), new Object[] 
                    { recipe, '#', Block.netherrack, '|', Item.bone, 's', mod_InfiBase.netherrackShard });
            ModLoader.addRecipe(new ItemStack(boneNetherrackIceAxe), new Object[] 
                    { recipe, '#', Block.netherrack, '|', mod_InfiBase.boneRod, 's', mod_InfiBase.netherrackShard });
            ModLoader.addRecipe(new ItemStack(paperNetherrackIceAxe), new Object[] 
                    { recipe, '#', Block.netherrack, '|', mod_InfiBase.paperRod, 's', mod_InfiBase.netherrackShard });
            ModLoader.addRecipe(new ItemStack(mossyNetherrackIceAxe), new Object[] 
                    { recipe, '#', Block.netherrack, '|', mod_InfiBase.mossyRod, 's', mod_InfiBase.netherrackShard });
            ModLoader.addRecipe(new ItemStack(netherrackNetherrackIceAxe), new Object[] 
                    { recipe, '#', Block.netherrack, '|', mod_InfiBase.netherrackRod, 's', mod_InfiBase.netherrackShard });
            ModLoader.addRecipe(new ItemStack(iceNetherrackIceAxe), new Object[] 
                    { recipe, '#', Block.netherrack, '|', mod_InfiBase.iceRod, 's', mod_InfiBase.netherrackShard });
            ModLoader.addRecipe(new ItemStack(slimeNetherrackIceAxe), new Object[] 
                    { recipe, '#', Block.netherrack, '|', mod_InfiBase.slimeRod, 's', mod_InfiBase.netherrackShard });
            ModLoader.addRecipe(new ItemStack(cactusNetherrackIceAxe), new Object[] 
                    { recipe, '#', Block.netherrack, '|', mod_InfiBase.cactusRod, 's', mod_InfiBase.netherrackShard });
            ModLoader.addRecipe(new ItemStack(flintNetherrackIceAxe), new Object[] 
                    { recipe, '#', Block.netherrack, '|', mod_InfiBase.flintRod, 's', mod_InfiBase.netherrackShard });
            ModLoader.addRecipe(new ItemStack(copperNetherrackIceAxe), new Object[] 
                    { recipe, '#', Block.netherrack, '|', mod_InfiBase.copperRod, 's', mod_InfiBase.netherrackShard });
            ModLoader.addRecipe(new ItemStack(bronzeNetherrackIceAxe), new Object[] 
                    { recipe, '#', Block.netherrack, '|', mod_InfiBase.bronzeRod, 's', mod_InfiBase.netherrackShard });
        }
        
        if(PropsHelperInfiHybrids.enableGlowstoneTools)
        {
        	ModLoader.addRecipe(new ItemStack(woodGlowstoneIceAxe), new Object[] 
                    { recipe, '#', mod_InfiBase.glowstoneCrystal, '|', Item.stick, 's', mod_InfiBase.glowstoneFragment });
        	ModLoader.addRecipe(new ItemStack(redstoneGlowstoneIceAxe), new Object[] 
                    { recipe, '#', mod_InfiBase.glowstoneCrystal, '|', mod_InfiBase.glowstoneRod, 's', mod_InfiBase.glowstoneFragment });
        	ModLoader.addRecipe(new ItemStack(obsidianGlowstoneIceAxe), new Object[] 
                    { recipe, '#', mod_InfiBase.glowstoneCrystal, '|', mod_InfiBase.obsidianRod, 's', mod_InfiBase.glowstoneFragment });
            ModLoader.addRecipe(new ItemStack(boneGlowstoneIceAxe), new Object[] 
                    { recipe, '#', mod_InfiBase.glowstoneCrystal, '|', Item.bone, 's', mod_InfiBase.glowstoneFragment });
            ModLoader.addRecipe(new ItemStack(boneGlowstoneIceAxe), new Object[] 
                    { recipe, '#', mod_InfiBase.glowstoneCrystal, '|', mod_InfiBase.boneRod, 's', mod_InfiBase.glowstoneFragment });
            ModLoader.addRecipe(new ItemStack(netherrackGlowstoneIceAxe), new Object[] 
                    { recipe, '#', mod_InfiBase.glowstoneCrystal, '|', mod_InfiBase.netherrackRod, 's', mod_InfiBase.glowstoneFragment });
            ModLoader.addRecipe(new ItemStack(iceGlowstoneIceAxe), new Object[] 
                    { recipe, '#', mod_InfiBase.glowstoneCrystal, '|', mod_InfiBase.iceRod, 's', mod_InfiBase.glowstoneFragment });
            ModLoader.addRecipe(new ItemStack(slimeGlowstoneIceAxe), new Object[] 
                    { recipe, '#', mod_InfiBase.glowstoneCrystal, '|', mod_InfiBase.slimeRod, 's', mod_InfiBase.glowstoneFragment });
            ModLoader.addRecipe(new ItemStack(cactusGlowstoneIceAxe), new Object[] 
                    { recipe, '#', mod_InfiBase.glowstoneCrystal, '|', mod_InfiBase.cactusRod, 's', mod_InfiBase.glowstoneFragment });
        }
        
        if(PropsHelperInfiHybrids.enableIceTools)
        {
            ModLoader.addRecipe(new ItemStack(woodIceIceAxe), new Object[] 
                    { recipe, '#', Block.ice, '|', Item.stick, 's', mod_InfiBase.iceShard });
            ModLoader.addRecipe(new ItemStack(boneIceIceAxe), new Object[] 
                    { recipe, '#', Block.ice, '|', Item.bone, 's', mod_InfiBase.iceShard });
            ModLoader.addRecipe(new ItemStack(boneIceIceAxe), new Object[] 
                    { recipe, '#', Block.ice, '|', mod_InfiBase.boneRod, 's', mod_InfiBase.iceShard });
            ModLoader.addRecipe(new ItemStack(paperIceIceAxe), new Object[] 
                    { recipe, '#', Block.ice, '|', mod_InfiBase.paperRod, 's', mod_InfiBase.iceShard });
            ModLoader.addRecipe(new ItemStack(iceIceIceAxe), new Object[] 
                    { recipe, '#', Block.ice, '|', mod_InfiBase.iceRod, 's', mod_InfiBase.iceShard });
            ModLoader.addRecipe(new ItemStack(slimeIceIceAxe), new Object[] 
                    { recipe, '#', Block.ice, '|', mod_InfiBase.slimeRod, 's', mod_InfiBase.iceShard });
            ModLoader.addRecipe(new ItemStack(cactusIceIceAxe), new Object[] 
                    { recipe, '#', Block.ice, '|', mod_InfiBase.cactusRod, 's', mod_InfiBase.iceShard });
        }
        
        if(PropsHelperInfiHybrids.enableLavaTools)
        {
            ModLoader.addRecipe(new ItemStack(diamondLavaIceAxe), new Object[] 
                    { recipe, '#', mod_InfiBase.lavaCrystal, '|', mod_InfiBase.diamondRod, 's', mod_InfiBase.lavaFragment });
            ModLoader.addRecipe(new ItemStack(obsidianLavaIceAxe), new Object[] 
                    { recipe, '#', mod_InfiBase.lavaCrystal, '|', mod_InfiBase.obsidianRod, 's', mod_InfiBase.lavaFragment });
            ModLoader.addRecipe(new ItemStack(netherrackLavaIceAxe), new Object[] 
                    { recipe, '#', mod_InfiBase.lavaCrystal, '|', mod_InfiBase.netherrackRod, 's', mod_InfiBase.lavaFragment });
            ModLoader.addRecipe(new ItemStack(lavaLavaIceAxe), new Object[] 
                    { recipe, '#', mod_InfiBase.lavaCrystal, '|', mod_InfiBase.lavaRod, 's', mod_InfiBase.lavaFragment });
            ModLoader.addRecipe(new ItemStack(flintLavaIceAxe), new Object[] 
                    { recipe, '#', mod_InfiBase.lavaCrystal, '|', mod_InfiBase.flintRod, 's', mod_InfiBase.lavaFragment });
            ModLoader.addRecipe(new ItemStack(blazeLavaIceAxe), new Object[] 
                    { recipe, '#', mod_InfiBase.lavaCrystal, '|', Item.blazeRod, 's', mod_InfiBase.lavaFragment });
            ModLoader.addRecipe(new ItemStack(manyullynLavaIceAxe), new Object[] 
                    { recipe, '#', mod_InfiBase.lavaCrystal, '|', mod_InfiBase.manyullynRod, 's', mod_InfiBase.lavaFragment });
            ModLoader.addRecipe(new ItemStack(uraniumLavaIceAxe), new Object[] 
                    { recipe, '#', mod_InfiBase.lavaCrystal, '|', mod_InfiBase.uraniumRod, 's', mod_InfiBase.lavaFragment });
        }
        
        if(PropsHelperInfiHybrids.enableSlimeTools)
        {
            ModLoader.addRecipe(new ItemStack(woodSlimeIceAxe), new Object[] 
                    { recipe, '#', mod_InfiBase.slimeCrystal, '|', Item.stick, 's', Item.slimeBall });
            ModLoader.addRecipe(new ItemStack(sandstoneSlimeIceAxe), new Object[] 
                    { recipe, '#', mod_InfiBase.slimeCrystal, '|', mod_InfiBase.sandstoneRod, 's', Item.slimeBall });
            ModLoader.addRecipe(new ItemStack(boneSlimeIceAxe), new Object[] 
                    { recipe, '#', mod_InfiBase.slimeCrystal, '|', Item.bone, 's', Item.slimeBall });
            ModLoader.addRecipe(new ItemStack(boneSlimeIceAxe), new Object[] 
                    { recipe, '#', mod_InfiBase.slimeCrystal, '|', mod_InfiBase.boneRod, 's', Item.slimeBall });
            ModLoader.addRecipe(new ItemStack(paperSlimeIceAxe), new Object[] 
                    { recipe, '#', mod_InfiBase.slimeCrystal, '|', mod_InfiBase.paperRod, 's', Item.slimeBall });
            ModLoader.addRecipe(new ItemStack(slimeSlimeIceAxe), new Object[] 
                    { recipe, '#', mod_InfiBase.slimeCrystal, '|', mod_InfiBase.slimeRod, 's', Item.slimeBall });
            ModLoader.addRecipe(new ItemStack(cactusSlimeIceAxe), new Object[] 
                    { recipe, '#', mod_InfiBase.slimeCrystal, '|', mod_InfiBase.cactusRod, 's', Item.slimeBall });
        }
        
        if(PropsHelperInfiHybrids.enableCactusTools)
        {
            ModLoader.addRecipe(new ItemStack(woodCactusIceAxe), new Object[] 
                    { recipe, '#', Block.cactus, '|', Item.stick, 's', mod_InfiBase.cactusShard });
            ModLoader.addRecipe(new ItemStack(sandstoneCactusIceAxe), new Object[] 
                    { recipe, '#', Block.cactus, '|', mod_InfiBase.sandstoneRod, 's', mod_InfiBase.cactusShard });
            ModLoader.addRecipe(new ItemStack(boneCactusIceAxe), new Object[] 
                    { recipe, '#', Block.cactus, '|', Item.bone, 's', mod_InfiBase.cactusShard });
            ModLoader.addRecipe(new ItemStack(boneCactusIceAxe), new Object[] 
                    { recipe, '#', Block.cactus, '|', mod_InfiBase.boneRod, 's', mod_InfiBase.cactusShard });
            ModLoader.addRecipe(new ItemStack(netherrackCactusIceAxe), new Object[] 
                    { recipe, '#', Block.cactus, '|', mod_InfiBase.netherrackRod, 's', mod_InfiBase.cactusShard });
            ModLoader.addRecipe(new ItemStack(iceCactusIceAxe), new Object[] 
                    { recipe, '#', Block.cactus, '|', mod_InfiBase.iceRod, 's', mod_InfiBase.cactusShard });
            ModLoader.addRecipe(new ItemStack(slimeCactusIceAxe), new Object[] 
                    { recipe, '#', Block.cactus, '|', mod_InfiBase.slimeRod, 's', mod_InfiBase.cactusShard });
            ModLoader.addRecipe(new ItemStack(cactusCactusIceAxe), new Object[] 
                    { recipe, '#', Block.cactus, '|', mod_InfiBase.cactusRod, 's', mod_InfiBase.cactusShard });
        }
        
        if(PropsHelperInfiHybrids.enableFlintTools)
        {
        	ModLoader.addRecipe(new ItemStack(woodFlintIceAxe), new Object[] 
                    { recipe, '#', Item.flint, '|', Item.stick, 's', mod_InfiBase.flintShard });
        	ModLoader.addRecipe(new ItemStack(stoneFlintIceAxe), new Object[] 
                    { recipe, '#', Item.flint, '|', mod_InfiBase.stoneRod, 's', mod_InfiBase.flintShard });
            ModLoader.addRecipe(new ItemStack(sandstoneFlintIceAxe), new Object[] 
                    { recipe, '#', Item.flint, '|', mod_InfiBase.sandstoneRod, 's', mod_InfiBase.flintShard });
            ModLoader.addRecipe(new ItemStack(boneFlintIceAxe), new Object[] 
                    { recipe, '#', Item.flint, '|', Item.bone, 's', mod_InfiBase.flintShard });
            ModLoader.addRecipe(new ItemStack(boneFlintIceAxe), new Object[] 
                    { recipe, '#', Item.flint, '|', mod_InfiBase.boneRod, 's', mod_InfiBase.flintShard });
            ModLoader.addRecipe(new ItemStack(netherrackFlintIceAxe), new Object[] 
                    { recipe, '#', Item.flint, '|', mod_InfiBase.netherrackRod, 's', mod_InfiBase.flintShard });
            ModLoader.addRecipe(new ItemStack(slimeFlintIceAxe), new Object[] 
                    { recipe, '#', Item.flint, '|', mod_InfiBase.slimeRod, 's', mod_InfiBase.flintShard });
            ModLoader.addRecipe(new ItemStack(cactusFlintIceAxe), new Object[] 
                    { recipe, '#', Item.flint, '|', mod_InfiBase.cactusRod, 's', mod_InfiBase.flintShard });
            ModLoader.addRecipe(new ItemStack(flintFlintIceAxe), new Object[] 
                    { recipe, '#', Item.flint, '|', mod_InfiBase.flintRod, 's', mod_InfiBase.flintShard });
            ModLoader.addRecipe(new ItemStack(copperFlintIceAxe), new Object[] 
                    { recipe, '#', Block.netherrack, '|', mod_InfiBase.copperRod, 's', mod_InfiBase.flintShard });
            ModLoader.addRecipe(new ItemStack(bronzeFlintIceAxe), new Object[] 
                    { recipe, '#', Block.netherrack, '|', mod_InfiBase.bronzeRod, 's', mod_InfiBase.flintShard });
        }
        
        if(PropsHelperInfiHybrids.enableBlazeTools)
        {
            ModLoader.addRecipe(new ItemStack(diamondBlazeIceAxe), new Object[] 
                    { recipe, '#', mod_InfiBase.blazeCrystal, '|', mod_InfiBase.diamondRod, 's', mod_InfiBase.blazeFragment });
            ModLoader.addRecipe(new ItemStack(obsidianBlazeIceAxe), new Object[] 
                    { recipe, '#', mod_InfiBase.blazeCrystal, '|', mod_InfiBase.obsidianRod, 's', mod_InfiBase.blazeFragment });
            ModLoader.addRecipe(new ItemStack(netherrackBlazeIceAxe), new Object[] 
                    { recipe, '#', mod_InfiBase.blazeCrystal, '|', mod_InfiBase.netherrackRod, 's', mod_InfiBase.blazeFragment });
            ModLoader.addRecipe(new ItemStack(lavaBlazeIceAxe), new Object[] 
                    { recipe, '#', mod_InfiBase.blazeCrystal, '|', mod_InfiBase.lavaRod, 's', mod_InfiBase.blazeFragment });
            ModLoader.addRecipe(new ItemStack(flintBlazeIceAxe), new Object[] 
                    { recipe, '#', mod_InfiBase.blazeCrystal, '|', mod_InfiBase.flintRod, 's', mod_InfiBase.blazeFragment });
            ModLoader.addRecipe(new ItemStack(blazeBlazeIceAxe), new Object[] 
                    { recipe, '#', mod_InfiBase.blazeCrystal, '|', Item.blazeRod, 's', mod_InfiBase.blazeFragment });
            ModLoader.addRecipe(new ItemStack(manyullynBlazeIceAxe), new Object[] 
                    { recipe, '#', mod_InfiBase.blazeCrystal, '|', mod_InfiBase.manyullynRod, 's', mod_InfiBase.blazeFragment });
            ModLoader.addRecipe(new ItemStack(uraniumBlazeIceAxe), new Object[] 
                    { recipe, '#', mod_InfiBase.blazeCrystal, '|', mod_InfiBase.uraniumRod, 's', mod_InfiBase.blazeFragment });
        }
    }
    
    public static void addStoneTools(ItemStack stack)
    {
    	ModLoader.addRecipe(new ItemStack(woodStoneIceAxe), new Object[] 
                { recipe, '#', stack, '|', Item.stick, 's', mod_InfiBase.stoneShard });
    	ModLoader.addRecipe(new ItemStack(stoneStoneIceAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.stoneRod, 's', mod_InfiBase.stoneShard });
        ModLoader.addRecipe(new ItemStack(sandstoneStoneIceAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.sandstoneRod, 's', mod_InfiBase.stoneShard });
        ModLoader.addRecipe(new ItemStack(boneStoneIceAxe), new Object[] 
                { recipe, '#', stack, '|', Item.bone, 's', mod_InfiBase.stoneShard });
        ModLoader.addRecipe(new ItemStack(boneStoneIceAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.boneRod, 's', mod_InfiBase.stoneShard });
        ModLoader.addRecipe(new ItemStack(netherrackStoneIceAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.netherrackRod, 's', mod_InfiBase.stoneShard });
        ModLoader.addRecipe(new ItemStack(iceStoneIceAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.iceRod, 's', mod_InfiBase.stoneShard });
        ModLoader.addRecipe(new ItemStack(slimeStoneIceAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.slimeRod, 's', mod_InfiBase.stoneShard });
        ModLoader.addRecipe(new ItemStack(cactusStoneIceAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.cactusRod, 's', mod_InfiBase.stoneShard });
        ModLoader.addRecipe(new ItemStack(flintStoneIceAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.flintRod, 's', mod_InfiBase.stoneShard });
    }
    
    public static void addCopperTools(ItemStack stack)
    {
    	ModLoader.addRecipe(new ItemStack(woodCopperIceAxe), new Object[] 
                { recipe, '#', stack, '|', Item.stick, 's', mod_InfiBase.copperChunk });
        ModLoader.addRecipe(new ItemStack(stoneCopperIceAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.stoneRod, 's', mod_InfiBase.copperChunk });
        ModLoader.addRecipe(new ItemStack(boneCopperIceAxe), new Object[] 
                { recipe, '#', stack, '|', Item.bone, 's', mod_InfiBase.copperChunk });
        ModLoader.addRecipe(new ItemStack(boneCopperIceAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.boneRod, 's', mod_InfiBase.copperChunk });
        ModLoader.addRecipe(new ItemStack(netherrackCopperIceAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.netherrackRod, 's', mod_InfiBase.copperChunk });
        ModLoader.addRecipe(new ItemStack(slimeCopperIceAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.slimeRod, 's', mod_InfiBase.copperChunk });
        ModLoader.addRecipe(new ItemStack(cactusCopperIceAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.cactusRod, 's', mod_InfiBase.copperChunk });
        ModLoader.addRecipe(new ItemStack(flintCopperIceAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.flintRod, 's', mod_InfiBase.copperChunk });
        ModLoader.addRecipe(new ItemStack(copperCopperIceAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.copperRod, 's', mod_InfiBase.copperChunk });
    }
    
    public static void addBronzeTools(ItemStack stack)
    {
    	ModLoader.addRecipe(new ItemStack(woodBronzeIceAxe), new Object[] 
                { recipe, '#', stack, '|', Item.stick, 's', mod_InfiBase.bronzeChunk });
        ModLoader.addRecipe(new ItemStack(stoneBronzeIceAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.stoneRod, 's', mod_InfiBase.bronzeChunk });
        ModLoader.addRecipe(new ItemStack(boneBronzeIceAxe), new Object[] 
                { recipe, '#', stack, '|', Item.bone, 's', mod_InfiBase.bronzeChunk });
        ModLoader.addRecipe(new ItemStack(boneBronzeIceAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.boneRod, 's', mod_InfiBase.bronzeChunk });
        ModLoader.addRecipe(new ItemStack(netherrackBronzeIceAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.netherrackRod, 's', mod_InfiBase.bronzeChunk });
        ModLoader.addRecipe(new ItemStack(slimeBronzeIceAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.slimeRod, 's', mod_InfiBase.bronzeChunk });
        ModLoader.addRecipe(new ItemStack(cactusBronzeIceAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.cactusRod, 's', mod_InfiBase.bronzeChunk });
        ModLoader.addRecipe(new ItemStack(flintBronzeIceAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.flintRod, 's', mod_InfiBase.bronzeChunk });
        ModLoader.addRecipe(new ItemStack(copperBronzeIceAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.copperRod, 's', mod_InfiBase.bronzeChunk });
        ModLoader.addRecipe(new ItemStack(bronzeBronzeIceAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.bronzeRod, 's', mod_InfiBase.bronzeChunk });
    }
    
    public static void addWorkedIronTools(ItemStack stack)
    {
    	ModLoader.addRecipe(new ItemStack(woodWorkedIronIceAxe), new Object[] 
                { recipe, '#', stack, '|', Item.stick, 's', mod_InfiBase.workedIronChunk });
        ModLoader.addRecipe(new ItemStack(stoneWorkedIronIceAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.stoneRod, 's', mod_InfiBase.workedIronChunk });
        ModLoader.addRecipe(new ItemStack(ironWorkedIronIceAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.ironRod, 's', mod_InfiBase.workedIronChunk });
        ModLoader.addRecipe(new ItemStack(diamondWorkedIronIceAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.diamondRod, 's', mod_InfiBase.workedIronChunk });
        ModLoader.addRecipe(new ItemStack(redstoneWorkedIronIceAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.redstoneRod, 's', mod_InfiBase.workedIronChunk });
        ModLoader.addRecipe(new ItemStack(obsidianWorkedIronIceAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.obsidianRod, 's', mod_InfiBase.workedIronChunk });
        ModLoader.addRecipe(new ItemStack(boneWorkedIronIceAxe), new Object[] 
                { recipe, '#', stack, '|', Item.bone, 's', mod_InfiBase.workedIronChunk });
        ModLoader.addRecipe(new ItemStack(boneWorkedIronIceAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.boneRod, 's', mod_InfiBase.workedIronChunk });
        ModLoader.addRecipe(new ItemStack(netherrackWorkedIronIceAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.netherrackRod, 's', mod_InfiBase.workedIronChunk });
        ModLoader.addRecipe(new ItemStack(glowstoneWorkedIronIceAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.glowstoneRod, 's', mod_InfiBase.workedIronChunk });
        ModLoader.addRecipe(new ItemStack(iceWorkedIronIceAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.iceRod, 's', mod_InfiBase.workedIronChunk });
        ModLoader.addRecipe(new ItemStack(slimeWorkedIronIceAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.slimeRod, 's', mod_InfiBase.workedIronChunk });
        ModLoader.addRecipe(new ItemStack(cactusWorkedIronIceAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.cactusRod, 's', mod_InfiBase.workedIronChunk });
        ModLoader.addRecipe(new ItemStack(blazeWorkedIronIceAxe), new Object[] 
                { recipe, '#', stack, '|', Item.blazeRod, 's', mod_InfiBase.workedIronChunk });
        ModLoader.addRecipe(new ItemStack(copperWorkedIronIceAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.copperRod, 's', mod_InfiBase.workedIronChunk });
        ModLoader.addRecipe(new ItemStack(bronzeWorkedIronIceAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.bronzeRod, 's', mod_InfiBase.workedIronChunk });
        ModLoader.addRecipe(new ItemStack(workedWorkedIronIceAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.workedIronRod, 's', mod_InfiBase.workedIronChunk });
        ModLoader.addRecipe(new ItemStack(steelWorkedIronIceAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.steelRod, 's', mod_InfiBase.workedIronChunk });
        ModLoader.addRecipe(new ItemStack(uraniumWorkedIronIceAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.uraniumRod, 's', mod_InfiBase.workedIronChunk });
    }
    
    public static void addSteelTools(ItemStack stack)
    {
    	ModLoader.addRecipe(new ItemStack(woodSteelIceAxe), new Object[] 
                { recipe, '#', stack, '|', Item.stick, 's', mod_InfiBase.steelChunk });
        ModLoader.addRecipe(new ItemStack(stoneSteelIceAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.stoneRod, 's', mod_InfiBase.steelChunk });
        ModLoader.addRecipe(new ItemStack(ironSteelIceAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.ironRod, 's', mod_InfiBase.steelChunk });
        ModLoader.addRecipe(new ItemStack(diamondSteelIceAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.diamondRod, 's', mod_InfiBase.steelChunk });
        ModLoader.addRecipe(new ItemStack(redstoneSteelIceAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.redstoneRod, 's', mod_InfiBase.steelChunk });
        ModLoader.addRecipe(new ItemStack(obsidianSteelIceAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.obsidianRod, 's', mod_InfiBase.steelChunk });
        ModLoader.addRecipe(new ItemStack(boneSteelIceAxe), new Object[] 
                { recipe, '#', stack, '|', Item.bone, 's', mod_InfiBase.steelChunk });
        ModLoader.addRecipe(new ItemStack(boneSteelIceAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.boneRod, 's', mod_InfiBase.steelChunk });
        ModLoader.addRecipe(new ItemStack(netherrackSteelIceAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.netherrackRod, 's', mod_InfiBase.steelChunk });
        ModLoader.addRecipe(new ItemStack(glowstoneSteelIceAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.glowstoneRod, 's', mod_InfiBase.steelChunk });
        ModLoader.addRecipe(new ItemStack(iceSteelIceAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.iceRod, 's', mod_InfiBase.steelChunk });
        ModLoader.addRecipe(new ItemStack(slimeSteelIceAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.slimeRod, 's', mod_InfiBase.steelChunk });
        ModLoader.addRecipe(new ItemStack(cactusSteelIceAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.cactusRod, 's', mod_InfiBase.steelChunk });
        ModLoader.addRecipe(new ItemStack(blazeSteelIceAxe), new Object[] 
                { recipe, '#', stack, '|', Item.blazeRod, 's', mod_InfiBase.steelChunk });
        ModLoader.addRecipe(new ItemStack(copperSteelIceAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.copperRod, 's', mod_InfiBase.steelChunk });
        ModLoader.addRecipe(new ItemStack(bronzeSteelIceAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.bronzeRod, 's', mod_InfiBase.steelChunk });
        ModLoader.addRecipe(new ItemStack(workedSteelIceAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.workedIronRod, 's', mod_InfiBase.steelChunk });
        ModLoader.addRecipe(new ItemStack(steelSteelIceAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.steelRod, 's', mod_InfiBase.steelChunk });
        ModLoader.addRecipe(new ItemStack(cobaltSteelIceAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.cobaltRod, 's', mod_InfiBase.steelChunk });
        ModLoader.addRecipe(new ItemStack(arditeSteelIceAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.arditeRod, 's', mod_InfiBase.steelChunk });
        ModLoader.addRecipe(new ItemStack(uraniumSteelIceAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.uraniumRod, 's', mod_InfiBase.steelChunk });
    }
    
    public static void addCobaltTools(ItemStack stack)
    {
    	ModLoader.addRecipe(new ItemStack(woodCobaltIceAxe), new Object[] 
                { recipe, '#', stack, '|', Item.stick, 's', mod_InfiBase.cobaltChunk });
        ModLoader.addRecipe(new ItemStack(stoneCobaltIceAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.stoneRod, 's', mod_InfiBase.cobaltChunk });
        ModLoader.addRecipe(new ItemStack(ironCobaltIceAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.ironRod, 's', mod_InfiBase.cobaltChunk });
        ModLoader.addRecipe(new ItemStack(diamondCobaltIceAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.diamondRod, 's', mod_InfiBase.cobaltChunk });
        ModLoader.addRecipe(new ItemStack(redstoneCobaltIceAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.redstoneRod, 's', mod_InfiBase.cobaltChunk });
        ModLoader.addRecipe(new ItemStack(obsidianCobaltIceAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.obsidianRod, 's', mod_InfiBase.cobaltChunk });
        ModLoader.addRecipe(new ItemStack(boneCobaltIceAxe), new Object[] 
                { recipe, '#', stack, '|', Item.bone, 's', mod_InfiBase.cobaltChunk });
        ModLoader.addRecipe(new ItemStack(boneCobaltIceAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.boneRod, 's', mod_InfiBase.cobaltChunk });
        ModLoader.addRecipe(new ItemStack(slimeCobaltIceAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.slimeRod, 's', mod_InfiBase.cobaltChunk });
        ModLoader.addRecipe(new ItemStack(cactusCobaltIceAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.cactusRod, 's', mod_InfiBase.cobaltChunk });
        ModLoader.addRecipe(new ItemStack(blazeCobaltIceAxe), new Object[] 
                { recipe, '#', stack, '|', Item.blazeRod, 's', mod_InfiBase.cobaltChunk });
        ModLoader.addRecipe(new ItemStack(copperCobaltIceAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.copperRod, 's', mod_InfiBase.cobaltChunk });
        ModLoader.addRecipe(new ItemStack(bronzeCobaltIceAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.bronzeRod, 's', mod_InfiBase.cobaltChunk });
        ModLoader.addRecipe(new ItemStack(workedCobaltIceAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.workedIronRod, 's', mod_InfiBase.cobaltChunk });
        ModLoader.addRecipe(new ItemStack(steelCobaltIceAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.steelRod, 's', mod_InfiBase.cobaltChunk });
        ModLoader.addRecipe(new ItemStack(cobaltCobaltIceAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.cobaltRod, 's', mod_InfiBase.cobaltChunk });
        ModLoader.addRecipe(new ItemStack(arditeCobaltIceAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.arditeRod, 's', mod_InfiBase.cobaltChunk });
        ModLoader.addRecipe(new ItemStack(manyullynCobaltIceAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.manyullynRod, 's', mod_InfiBase.cobaltChunk });
        ModLoader.addRecipe(new ItemStack(uraniumCobaltIceAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.uraniumRod, 's', mod_InfiBase.cobaltChunk });
    }
    
    public static void addArditeTools(ItemStack stack)
    {
    	ModLoader.addRecipe(new ItemStack(woodArditeIceAxe), new Object[] 
                { recipe, '#', stack, '|', Item.stick, 's', mod_InfiBase.arditeChunk });
        ModLoader.addRecipe(new ItemStack(stoneArditeIceAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.stoneRod, 's', mod_InfiBase.arditeChunk });
        ModLoader.addRecipe(new ItemStack(ironArditeIceAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.ironRod, 's', mod_InfiBase.arditeChunk });
        ModLoader.addRecipe(new ItemStack(diamondArditeIceAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.diamondRod, 's', mod_InfiBase.arditeChunk });
        ModLoader.addRecipe(new ItemStack(redstoneArditeIceAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.redstoneRod, 's', mod_InfiBase.arditeChunk });
        ModLoader.addRecipe(new ItemStack(obsidianArditeIceAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.obsidianRod, 's', mod_InfiBase.arditeChunk });
        ModLoader.addRecipe(new ItemStack(boneArditeIceAxe), new Object[] 
                { recipe, '#', stack, '|', Item.bone, 's', mod_InfiBase.arditeChunk });
        ModLoader.addRecipe(new ItemStack(boneArditeIceAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.boneRod, 's', mod_InfiBase.arditeChunk });
        ModLoader.addRecipe(new ItemStack(slimeArditeIceAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.slimeRod, 's', mod_InfiBase.arditeChunk });
        ModLoader.addRecipe(new ItemStack(cactusArditeIceAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.cactusRod, 's', mod_InfiBase.arditeChunk });
        ModLoader.addRecipe(new ItemStack(blazeArditeIceAxe), new Object[] 
                { recipe, '#', stack, '|', Item.blazeRod, 's', mod_InfiBase.arditeChunk });
        ModLoader.addRecipe(new ItemStack(copperArditeIceAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.copperRod, 's', mod_InfiBase.arditeChunk });
        ModLoader.addRecipe(new ItemStack(bronzeArditeIceAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.bronzeRod, 's', mod_InfiBase.arditeChunk });
        ModLoader.addRecipe(new ItemStack(workedArditeIceAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.workedIronRod, 's', mod_InfiBase.arditeChunk });
        ModLoader.addRecipe(new ItemStack(steelArditeIceAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.steelRod, 's', mod_InfiBase.arditeChunk });
        ModLoader.addRecipe(new ItemStack(cobaltArditeIceAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.cobaltRod, 's', mod_InfiBase.arditeChunk });
        ModLoader.addRecipe(new ItemStack(arditeArditeIceAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.arditeRod, 's', mod_InfiBase.arditeChunk });
        ModLoader.addRecipe(new ItemStack(manyullynArditeIceAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.manyullynRod, 's', mod_InfiBase.arditeChunk });
        ModLoader.addRecipe(new ItemStack(uraniumArditeIceAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.uraniumRod, 's', mod_InfiBase.arditeChunk });
    }
    
    public static void addManyullynTools(ItemStack stack)
    {
    	ModLoader.addRecipe(new ItemStack(woodManyullynIceAxe), new Object[] 
                { recipe, '#', stack, '|', Item.stick, 's', mod_InfiBase.manyullynChunk });
        ModLoader.addRecipe(new ItemStack(stoneManyullynIceAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.stoneRod, 's', mod_InfiBase.manyullynChunk });
        ModLoader.addRecipe(new ItemStack(ironManyullynIceAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.ironRod, 's', mod_InfiBase.manyullynChunk });
        ModLoader.addRecipe(new ItemStack(diamondManyullynIceAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.diamondRod, 's', mod_InfiBase.manyullynChunk });
        ModLoader.addRecipe(new ItemStack(redstoneManyullynIceAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.redstoneRod, 's', mod_InfiBase.manyullynChunk });
        ModLoader.addRecipe(new ItemStack(obsidianManyullynIceAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.obsidianRod, 's', mod_InfiBase.manyullynChunk });
        ModLoader.addRecipe(new ItemStack(boneManyullynIceAxe), new Object[] 
                { recipe, '#', stack, '|', Item.bone, 's', mod_InfiBase.manyullynChunk });
        ModLoader.addRecipe(new ItemStack(boneManyullynIceAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.boneRod, 's', mod_InfiBase.manyullynChunk });
        ModLoader.addRecipe(new ItemStack(slimeManyullynIceAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.slimeRod, 's', mod_InfiBase.manyullynChunk });
        ModLoader.addRecipe(new ItemStack(cactusManyullynIceAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.cactusRod, 's', mod_InfiBase.manyullynChunk });
        ModLoader.addRecipe(new ItemStack(blazeManyullynIceAxe), new Object[] 
                { recipe, '#', stack, '|', Item.blazeRod, 's', mod_InfiBase.manyullynChunk });
        ModLoader.addRecipe(new ItemStack(copperManyullynIceAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.copperRod, 's', mod_InfiBase.manyullynChunk });
        ModLoader.addRecipe(new ItemStack(bronzeManyullynIceAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.bronzeRod, 's', mod_InfiBase.manyullynChunk });
        ModLoader.addRecipe(new ItemStack(workedManyullynIceAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.workedIronRod, 's', mod_InfiBase.manyullynChunk });
        ModLoader.addRecipe(new ItemStack(steelManyullynIceAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.steelRod, 's', mod_InfiBase.manyullynChunk });
        ModLoader.addRecipe(new ItemStack(cobaltManyullynIceAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.cobaltRod, 's', mod_InfiBase.manyullynChunk });
        ModLoader.addRecipe(new ItemStack(arditeManyullynIceAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.arditeRod, 's', mod_InfiBase.manyullynChunk });
        ModLoader.addRecipe(new ItemStack(manyullynManyullynIceAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.manyullynRod, 's', mod_InfiBase.manyullynChunk });
        ModLoader.addRecipe(new ItemStack(uraniumManyullynIceAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.uraniumRod, 's', mod_InfiBase.manyullynChunk });
    }
    
    public static void addUraniumTools(ItemStack stack)
    {
        ModLoader.addRecipe(new ItemStack(diamondUraniumIceAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.diamondRod, 's', mod_InfiBase.uraniumChunk });
        ModLoader.addRecipe(new ItemStack(redstoneUraniumIceAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.redstoneRod, 's', mod_InfiBase.uraniumChunk });
        ModLoader.addRecipe(new ItemStack(boneUraniumIceAxe), new Object[] 
                { recipe, '#', stack, '|', Item.bone, 's', mod_InfiBase.uraniumChunk });
        ModLoader.addRecipe(new ItemStack(boneUraniumIceAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.boneRod, 's', mod_InfiBase.uraniumChunk });
        ModLoader.addRecipe(new ItemStack(netherrackUraniumIceAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.netherrackRod, 's', mod_InfiBase.uraniumChunk });
        ModLoader.addRecipe(new ItemStack(glowstoneUraniumIceAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.glowstoneRod, 's', mod_InfiBase.uraniumChunk });
        ModLoader.addRecipe(new ItemStack(lavaUraniumIceAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.lavaRod, 's', mod_InfiBase.uraniumChunk });
        ModLoader.addRecipe(new ItemStack(blazeUraniumIceAxe), new Object[] 
                { recipe, '#', stack, '|', Item.blazeRod, 's', mod_InfiBase.uraniumChunk });
        ModLoader.addRecipe(new ItemStack(cobaltUraniumIceAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.cobaltRod, 's', mod_InfiBase.uraniumChunk });
        ModLoader.addRecipe(new ItemStack(arditeUraniumIceAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.arditeRod, 's', mod_InfiBase.uraniumChunk });
        ModLoader.addRecipe(new ItemStack(uraniumUraniumIceAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.uraniumRod, 's', mod_InfiBase.uraniumChunk });
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
