package net.minecraft.src.inficore;
import net.minecraft.src.Block;
import net.minecraft.src.InfiMaterialEnum;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;
import net.minecraft.src.ModLoader;
import net.minecraft.src.mod_InfiBase;
import net.minecraft.src.forge.MinecraftForge;

public class Axes 
{
    public static Axes instance = new Axes();
    
    private static String[] recipe = { "##", "#|", " |" };
    
    public static Axes getInstance()
    {
        return instance;
    }

    public static void init()
    {
        createTools();
        addNames();
        registerInfiToolsRecipes();
    }
    
    private static void createTools()
    {
    	if(PropsHelperInfiTools.enableWoodTools)
    	{
    		woodWoodAxe = new InfiToolAxe(PropsHelperInfiTools.woodAxeID+0, 
                    InfiMaterialEnum.Wood, InfiMaterialEnum.Wood, "woodWood");
    		sandstoneWoodAxe = new InfiToolAxe(PropsHelperInfiTools.woodAxeID+1, 
                    InfiMaterialEnum.Wood, InfiMaterialEnum.Sandstone, "sandstoneWoodAxe");
    		boneWoodAxe = new InfiToolAxe(PropsHelperInfiTools.woodAxeID+2, 
                    InfiMaterialEnum.Wood, InfiMaterialEnum.Bone, "boneWoodAxe");
    		paperWoodAxe = new InfiToolAxe(PropsHelperInfiTools.woodAxeID+3, 
                    InfiMaterialEnum.Wood, InfiMaterialEnum.Paper, "paperWoodAxe");
    		iceWoodAxe = new InfiToolAxe(PropsHelperInfiTools.woodAxeID+4, 
                    InfiMaterialEnum.Wood, InfiMaterialEnum.Ice, "iceWoodAxe");
    		slimeWoodAxe = new InfiToolAxe(PropsHelperInfiTools.woodAxeID+5, 
                    InfiMaterialEnum.Wood, InfiMaterialEnum.Slime, "slimeWoodAxe");
    		cactusWoodAxe = new InfiToolAxe(PropsHelperInfiTools.woodAxeID+6, 
                    InfiMaterialEnum.Wood, InfiMaterialEnum.Cactus, "cactusWoodAxe");
    		
    		MinecraftForge.setToolClass(woodWoodAxe, "axe", InfiMaterialEnum.Wood.getHarvestLevel());
    		MinecraftForge.setToolClass(sandstoneWoodAxe, "axe", InfiMaterialEnum.Wood.getHarvestLevel());
    		MinecraftForge.setToolClass(boneWoodAxe, "axe", InfiMaterialEnum.Wood.getHarvestLevel());
    		MinecraftForge.setToolClass(paperWoodAxe, "axe", InfiMaterialEnum.Wood.getHarvestLevel());
    		MinecraftForge.setToolClass(iceWoodAxe, "axe", InfiMaterialEnum.Wood.getHarvestLevel());
    		MinecraftForge.setToolClass(slimeWoodAxe, "axe", InfiMaterialEnum.Wood.getHarvestLevel());
    		MinecraftForge.setToolClass(cactusWoodAxe, "axe", InfiMaterialEnum.Wood.getHarvestLevel());
    	}

        if(PropsHelperInfiTools.enableStoneTools)
        {
        	woodStoneAxe = new InfiToolAxe(PropsHelperInfiTools.stoneAxeID+0, 
                    InfiMaterialEnum.Stone, InfiMaterialEnum.Wood, "woodStoneAxe");
        	stoneStoneAxe = new InfiToolAxe(PropsHelperInfiTools.stoneAxeID+1, 
                    InfiMaterialEnum.Stone, InfiMaterialEnum.Stone, "stoneStoneAxe");
        	sandstoneStoneAxe = new InfiToolAxe(PropsHelperInfiTools.stoneAxeID+2, 
                    InfiMaterialEnum.Stone, InfiMaterialEnum.Sandstone, "sandstoneStoneAxe");
        	boneStoneAxe = new InfiToolAxe(PropsHelperInfiTools.stoneAxeID+3, 
                    InfiMaterialEnum.Stone, InfiMaterialEnum.Bone, "boneStoneAxe");
        	netherrackStoneAxe = new InfiToolAxe(PropsHelperInfiTools.stoneAxeID+4, 
                    InfiMaterialEnum.Stone, InfiMaterialEnum.Netherrack, "netherrackStoneAxe");
        	iceStoneAxe = new InfiToolAxe(PropsHelperInfiTools.stoneAxeID+5, 
                    InfiMaterialEnum.Stone, InfiMaterialEnum.Ice, "iceStoneAxe");
        	slimeStoneAxe = new InfiToolAxe(PropsHelperInfiTools.stoneAxeID+6, 
                    InfiMaterialEnum.Stone, InfiMaterialEnum.Slime, "slimeStoneAxe");
        	cactusStoneAxe = new InfiToolAxe(PropsHelperInfiTools.stoneAxeID+7, 
                    InfiMaterialEnum.Stone, InfiMaterialEnum.Cactus, "cactusStoneAxe");
        	flintStoneAxe = new InfiToolAxe(PropsHelperInfiTools.stoneAxeID+8, 
                    InfiMaterialEnum.Stone, InfiMaterialEnum.Flint, "flintStoneAxe");
            
            MinecraftForge.setToolClass(woodStoneAxe, "axe", InfiMaterialEnum.Stone.getHarvestLevel());
            MinecraftForge.setToolClass(stoneStoneAxe, "axe", InfiMaterialEnum.Stone.getHarvestLevel());
            MinecraftForge.setToolClass(sandstoneStoneAxe, "axe", InfiMaterialEnum.Stone.getHarvestLevel());
            MinecraftForge.setToolClass(boneStoneAxe, "axe", InfiMaterialEnum.Stone.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackStoneAxe, "axe", InfiMaterialEnum.Stone.getHarvestLevel());
            MinecraftForge.setToolClass(iceStoneAxe, "axe", InfiMaterialEnum.Stone.getHarvestLevel());
            MinecraftForge.setToolClass(slimeStoneAxe, "axe", InfiMaterialEnum.Stone.getHarvestLevel());
            MinecraftForge.setToolClass(cactusStoneAxe, "axe", InfiMaterialEnum.Stone.getHarvestLevel());
            MinecraftForge.setToolClass(flintStoneAxe, "axe", InfiMaterialEnum.Stone.getHarvestLevel());
        }
        
        if(PropsHelperInfiTools.enableIronTools)
        {
        	woodIronAxe = new InfiToolAxe(PropsHelperInfiTools.ironAxeID+0, 
                    InfiMaterialEnum.Iron, InfiMaterialEnum.Wood, "woodIronAxe");
        	stoneIronAxe = new InfiToolAxe(PropsHelperInfiTools.ironAxeID+1, 
                    InfiMaterialEnum.Iron, InfiMaterialEnum.Stone, "stoneIronAxe");
        	ironIronAxe = new InfiToolAxe(PropsHelperInfiTools.ironAxeID+2, 
                    InfiMaterialEnum.Iron, InfiMaterialEnum.Iron, "ironIronAxe");
        	boneIronAxe = new InfiToolAxe(PropsHelperInfiTools.ironAxeID+3, 
                    InfiMaterialEnum.Iron, InfiMaterialEnum.Bone, "boneIronAxe");
        	netherrackIronAxe = new InfiToolAxe(PropsHelperInfiTools.ironAxeID+4, 
                    InfiMaterialEnum.Iron, InfiMaterialEnum.Netherrack, "netherrackIronAxe");
        	glowstoneIronAxe = new InfiToolAxe(PropsHelperInfiTools.ironAxeID+5, 
                    InfiMaterialEnum.Iron, InfiMaterialEnum.Glowstone, "glowstoneIronAxe");
        	cactusIronAxe = new InfiToolAxe(PropsHelperInfiTools.ironAxeID+6, 
                    InfiMaterialEnum.Iron, InfiMaterialEnum.Cactus, "cactusIronAxe");
        	copperIronAxe = new InfiToolAxe(PropsHelperInfiTools.ironAxeID+7, 
                    InfiMaterialEnum.Iron, InfiMaterialEnum.Copper, "copperIronAxe");
        	bronzeIronAxe = new InfiToolAxe(PropsHelperInfiTools.ironAxeID+8, 
                    InfiMaterialEnum.Iron, InfiMaterialEnum.Bronze, "bronzeIronAxe");
            
            MinecraftForge.setToolClass(woodIronAxe, "axe", InfiMaterialEnum.Iron.getHarvestLevel());
            MinecraftForge.setToolClass(stoneIronAxe, "axe", InfiMaterialEnum.Iron.getHarvestLevel());
            MinecraftForge.setToolClass(ironIronAxe, "axe", InfiMaterialEnum.Iron.getHarvestLevel());
            MinecraftForge.setToolClass(boneIronAxe, "axe", InfiMaterialEnum.Iron.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackIronAxe, "axe", InfiMaterialEnum.Iron.getHarvestLevel());
            MinecraftForge.setToolClass(glowstoneIronAxe, "axe", InfiMaterialEnum.Iron.getHarvestLevel());
            MinecraftForge.setToolClass(cactusIronAxe, "axe", InfiMaterialEnum.Iron.getHarvestLevel());
            MinecraftForge.setToolClass(copperIronAxe, "axe", InfiMaterialEnum.Iron.getHarvestLevel());
            MinecraftForge.setToolClass(bronzeIronAxe, "axe", InfiMaterialEnum.Iron.getHarvestLevel());
        }
        
        if(PropsHelperInfiTools.enableDiamondTools)
        {
        	woodDiamondAxe = new InfiToolAxe(PropsHelperInfiTools.diamondAxeID+0, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Wood, "woodDiamondAxe");
        	stoneDiamondAxe = new InfiToolAxe(PropsHelperInfiTools.diamondAxeID+1, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Stone, "stoneDiamondAxe");
        	ironDiamondAxe = new InfiToolAxe(PropsHelperInfiTools.diamondAxeID+2, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Iron, "ironDiamondAxe");
        	diamondDiamondAxe = new InfiToolAxe(PropsHelperInfiTools.diamondAxeID+3, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Diamond, "diamondDiamondAxe");
        	redstoneDiamondAxe = new InfiToolAxe(PropsHelperInfiTools.diamondAxeID+4, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Redstone, "redstoneDiamondAxe");
        	obsidianDiamondAxe = new InfiToolAxe(PropsHelperInfiTools.diamondAxeID+5, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Obsidian, "obsidianDiamondAxe");
        	boneDiamondAxe = new InfiToolAxe(PropsHelperInfiTools.diamondAxeID+6, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Bone, "boneDiamondAxe");
        	mossyDiamondAxe = new InfiToolAxe(PropsHelperInfiTools.diamondAxeID+7, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Mossy, "mossyDiamondAxe");
        	netherrackDiamondAxe = new InfiToolAxe(PropsHelperInfiTools.diamondAxeID+8, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Netherrack, "netherrackDiamondAxe");
        	glowstoneDiamondAxe = new InfiToolAxe(PropsHelperInfiTools.diamondAxeID+9, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Glowstone, "glowstoneDiamondAxe");
        	lavaDiamondAxe = new InfiToolAxe(PropsHelperInfiTools.diamondAxeID+10, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Lava, "lavaDiamondAxe");
        	cactusDiamondAxe = new InfiToolAxe(PropsHelperInfiTools.diamondAxeID+11, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Cactus, "cactusDiamondAxe");
        	flintDiamondAxe = new InfiToolAxe(PropsHelperInfiTools.diamondAxeID+12, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Flint, "flintDiamondAxe");
        	blazeDiamondAxe = new InfiToolAxe(PropsHelperInfiTools.diamondAxeID+13, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Blaze, "blazeDiamondAxe");
            copperDiamondAxe = new InfiToolAxe(PropsHelperInfiTools.diamondAxeID+14, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Copper, "copperDiamondAxe");
            bronzeDiamondAxe = new InfiToolAxe(PropsHelperInfiTools.diamondAxeID+15, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Bronze, "bronzeDiamondAxe");
            workedDiamondAxe = new InfiToolAxe(PropsHelperInfiTools.diamondAxeID+16, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.WorkedIron, "workedDiamondAxe");
            steelDiamondAxe = new InfiToolAxe(PropsHelperInfiTools.diamondAxeID+17, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Steel, "steelDiamondAxe");
            cobaltDiamondAxe = new InfiToolAxe(PropsHelperInfiTools.diamondAxeID+18, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Cobalt, "cobaltDiamondAxe");
            arditeDiamondAxe = new InfiToolAxe(PropsHelperInfiTools.diamondAxeID+19, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Ardite, "arditeDiamondAxe");
            manyullynDiamondAxe = new InfiToolAxe(PropsHelperInfiTools.diamondAxeID+20, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Manyullyn, "manyullynDiamondAxe");
            uraniumDiamondAxe = new InfiToolAxe(PropsHelperInfiTools.diamondAxeID+21, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Uranium, "uraniumDiamondAxe");
            
            MinecraftForge.setToolClass(woodDiamondAxe, "axe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(stoneDiamondAxe, "axe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(ironDiamondAxe, "axe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(diamondDiamondAxe, "axe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(redstoneDiamondAxe, "axe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(obsidianDiamondAxe, "axe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(boneDiamondAxe, "axe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(mossyDiamondAxe, "axe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackDiamondAxe, "axe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(glowstoneDiamondAxe, "axe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(lavaDiamondAxe, "axe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(cactusDiamondAxe, "axe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(flintDiamondAxe, "axe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(blazeDiamondAxe, "axe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(copperDiamondAxe, "axe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(bronzeDiamondAxe, "axe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(workedDiamondAxe, "axe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(steelDiamondAxe, "axe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(cobaltDiamondAxe, "axe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(arditeDiamondAxe, "axe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(manyullynDiamondAxe, "axe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(uraniumDiamondAxe, "axe", InfiMaterialEnum.Diamond.getHarvestLevel());
        }
        
        if(PropsHelperInfiTools.enableRedstoneTools)
        {
        	woodRedstoneAxe = new InfiToolAxe(PropsHelperInfiTools.redstoneAxeID+0, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Redstone, "woodRedstoneAxe");
        	stoneRedstoneAxe = new InfiToolAxe(PropsHelperInfiTools.redstoneAxeID+1, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Stone, "stoneRedstoneAxe");
        	ironRedstoneAxe = new InfiToolAxe(PropsHelperInfiTools.redstoneAxeID+2, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Iron, "ironRedstoneAxe");
        	redstoneRedstoneAxe = new InfiToolAxe(PropsHelperInfiTools.redstoneAxeID+3, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Redstone, "redstoneRedstoneAxe");
        	obsidianRedstoneAxe = new InfiToolAxe(PropsHelperInfiTools.redstoneAxeID+4, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Obsidian, "obsidianRedstoneAxe");
        	sandstoneRedstoneAxe = new InfiToolAxe(PropsHelperInfiTools.redstoneAxeID+5, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Sandstone, "sandstoneRedstoneAxe");
        	boneRedstoneAxe = new InfiToolAxe(PropsHelperInfiTools.redstoneAxeID+6, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Bone, "boneRedstoneAxe");
        	paperRedstoneAxe = new InfiToolAxe(PropsHelperInfiTools.redstoneAxeID+7, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Paper, "paperRedstoneAxe");
        	mossyRedstoneAxe = new InfiToolAxe(PropsHelperInfiTools.redstoneAxeID+8, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Mossy, "mossyRedstoneAxe");
        	netherrackRedstoneAxe = new InfiToolAxe(PropsHelperInfiTools.redstoneAxeID+9, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Netherrack, "netherrackRedstoneAxe");
        	glowstoneRedstoneAxe = new InfiToolAxe(PropsHelperInfiTools.redstoneAxeID+10, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Glowstone, "glowstoneRedstoneAxe");
        	iceRedstoneAxe = new InfiToolAxe(PropsHelperInfiTools.redstoneAxeID+11, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Ice, "iceRedstoneAxe");
        	lavaRedstoneAxe = new InfiToolAxe(PropsHelperInfiTools.redstoneAxeID+12,
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Lava, "lavaRedstoneAxe");
        	slimeRedstoneAxe = new InfiToolAxe(PropsHelperInfiTools.redstoneAxeID+13,
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Slime, "slimeRedstoneAxe");
        	cactusRedstoneAxe = new InfiToolAxe(PropsHelperInfiTools.redstoneAxeID+14,
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Cactus, "cactusRedstoneAxe");
        	flintRedstoneAxe = new InfiToolAxe(PropsHelperInfiTools.redstoneAxeID+15,
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Flint, "flintRedstoneAxe");
        	copperRedstoneAxe = new InfiToolAxe(PropsHelperInfiTools.redstoneAxeID+16,
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Copper, "copperRedstoneAxe");
        	bronzeRedstoneAxe = new InfiToolAxe(PropsHelperInfiTools.redstoneAxeID+17,
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Bronze, "bronzeRedstoneAxe");
        	workedRedstoneAxe = new InfiToolAxe(PropsHelperInfiTools.redstoneAxeID+18,
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.WorkedIron, "workedRedstoneAxe");
        	uraniumRedstoneAxe = new InfiToolAxe(PropsHelperInfiTools.redstoneAxeID+19,
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Uranium, "uraniumRedstoneAxe");
            
            MinecraftForge.setToolClass(woodRedstoneAxe, "axe", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(stoneRedstoneAxe, "axe", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(ironRedstoneAxe, "axe", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(redstoneRedstoneAxe, "axe", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(obsidianRedstoneAxe, "axe", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(sandstoneRedstoneAxe, "axe", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(boneRedstoneAxe, "axe", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(paperRedstoneAxe, "axe", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(mossyRedstoneAxe, "axe", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackRedstoneAxe, "axe", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(glowstoneRedstoneAxe, "axe", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(iceRedstoneAxe, "axe", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(lavaRedstoneAxe, "axe", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(slimeRedstoneAxe, "axe", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(cactusRedstoneAxe, "axe", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(flintRedstoneAxe, "axe", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(copperRedstoneAxe, "axe", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(bronzeRedstoneAxe, "axe", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(workedRedstoneAxe, "axe", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(uraniumRedstoneAxe, "axe", InfiMaterialEnum.Redstone.getHarvestLevel());
        }
        
        if(PropsHelperInfiTools.enableObsidianTools)
        {
        	woodObsidianAxe = new InfiToolAxe(PropsHelperInfiTools.obsidianAxeID+0, 
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Obsidian, "woodObsidianAxe");
        	stoneObsidianAxe = new InfiToolAxe(PropsHelperInfiTools.obsidianAxeID+1, 
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Stone, "stoneObsidianAxe");
        	redstoneObsidianAxe = new InfiToolAxe(PropsHelperInfiTools.obsidianAxeID+2, 
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Obsidian, "redstoneObsidianAxe");
        	obsidianObsidianAxe = new InfiToolAxe(PropsHelperInfiTools.obsidianAxeID+3, 
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Obsidian, "obsidianObsidianAxe");;
        	boneObsidianAxe = new InfiToolAxe(PropsHelperInfiTools.obsidianAxeID+4, 
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Bone, "boneObsidianAxe");
        	netherrackObsidianAxe = new InfiToolAxe(PropsHelperInfiTools.obsidianAxeID+5, 
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Netherrack, "netherrackObsidianAxe");
        	glowstoneObsidianAxe = new InfiToolAxe(PropsHelperInfiTools.obsidianAxeID+6, 
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Glowstone, "glowstoneObsidianAxe");
        	iceObsidianAxe = new InfiToolAxe(PropsHelperInfiTools.obsidianAxeID+7, 
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Ice, "iceObsidianAxe");
        	lavaObsidianAxe = new InfiToolAxe(PropsHelperInfiTools.obsidianAxeID+8,
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Lava, "lavaObsidianAxe");
        	cactusObsidianAxe = new InfiToolAxe(PropsHelperInfiTools.obsidianAxeID+9,
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Cactus, "cactusObsidianAxe");
            
            MinecraftForge.setToolClass(woodObsidianAxe, "axe", InfiMaterialEnum.Obsidian.getHarvestLevel());
            MinecraftForge.setToolClass(stoneObsidianAxe, "axe", InfiMaterialEnum.Obsidian.getHarvestLevel());
            MinecraftForge.setToolClass(redstoneObsidianAxe, "axe", InfiMaterialEnum.Obsidian.getHarvestLevel());
            MinecraftForge.setToolClass(obsidianObsidianAxe, "axe", InfiMaterialEnum.Obsidian.getHarvestLevel());
            MinecraftForge.setToolClass(boneObsidianAxe, "axe", InfiMaterialEnum.Obsidian.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackObsidianAxe, "axe", InfiMaterialEnum.Obsidian.getHarvestLevel());
            MinecraftForge.setToolClass(glowstoneObsidianAxe, "axe", InfiMaterialEnum.Obsidian.getHarvestLevel());
            MinecraftForge.setToolClass(iceObsidianAxe, "axe", InfiMaterialEnum.Obsidian.getHarvestLevel());
            MinecraftForge.setToolClass(lavaObsidianAxe, "axe", InfiMaterialEnum.Obsidian.getHarvestLevel());
            MinecraftForge.setToolClass(cactusObsidianAxe, "axe", InfiMaterialEnum.Obsidian.getHarvestLevel());
        }
        
        if(PropsHelperInfiTools.enableSandstoneTools)
        {
        	woodSandstoneAxe = new InfiToolAxe(PropsHelperInfiTools.sandstoneAxeID+0, 
                    InfiMaterialEnum.Sandstone, InfiMaterialEnum.Sandstone, "woodSandstoneAxe");
        	sandstoneSandstoneAxe = new InfiToolAxe(PropsHelperInfiTools.sandstoneAxeID+1, 
                    InfiMaterialEnum.Sandstone, InfiMaterialEnum.Sandstone, "sandstoneSandstoneAxe");
        	boneSandstoneAxe = new InfiToolAxe(PropsHelperInfiTools.sandstoneAxeID+2, 
                    InfiMaterialEnum.Sandstone, InfiMaterialEnum.Bone, "boneSandstoneAxe");
        	netherrackSandstoneAxe = new InfiToolAxe(PropsHelperInfiTools.sandstoneAxeID+3, 
                    InfiMaterialEnum.Sandstone, InfiMaterialEnum.Netherrack, "netherrackSandstoneAxe");
        	iceSandstoneAxe = new InfiToolAxe(PropsHelperInfiTools.sandstoneAxeID+4, 
                    InfiMaterialEnum.Sandstone, InfiMaterialEnum.Ice, "iceSandstoneAxe");
        	slimeSandstoneAxe = new InfiToolAxe(PropsHelperInfiTools.sandstoneAxeID+5,
                    InfiMaterialEnum.Sandstone, InfiMaterialEnum.Slime, "slimeSandstoneAxe");
        	cactusSandstoneAxe = new InfiToolAxe(PropsHelperInfiTools.sandstoneAxeID+6,
                    InfiMaterialEnum.Sandstone, InfiMaterialEnum.Cactus, "cactusSandstoneAxe");
        	flintSandstoneAxe = new InfiToolAxe(PropsHelperInfiTools.sandstoneAxeID+7,
                    InfiMaterialEnum.Sandstone, InfiMaterialEnum.Flint, "flintSandstoneAxe");
            
            MinecraftForge.setToolClass(woodSandstoneAxe, "axe", InfiMaterialEnum.Sandstone.getHarvestLevel());
            MinecraftForge.setToolClass(sandstoneSandstoneAxe, "axe", InfiMaterialEnum.Sandstone.getHarvestLevel());
            MinecraftForge.setToolClass(boneSandstoneAxe, "axe", InfiMaterialEnum.Sandstone.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackSandstoneAxe, "axe", InfiMaterialEnum.Sandstone.getHarvestLevel());
            MinecraftForge.setToolClass(iceSandstoneAxe, "axe", InfiMaterialEnum.Sandstone.getHarvestLevel());
            MinecraftForge.setToolClass(slimeSandstoneAxe, "axe", InfiMaterialEnum.Sandstone.getHarvestLevel());
            MinecraftForge.setToolClass(cactusSandstoneAxe, "axe", InfiMaterialEnum.Sandstone.getHarvestLevel());
            MinecraftForge.setToolClass(flintSandstoneAxe, "axe", InfiMaterialEnum.Sandstone.getHarvestLevel());
        }
        
        if(PropsHelperInfiTools.enableBoneTools)
        {
        	woodBoneAxe = new InfiToolAxe(PropsHelperInfiTools.boneAxeID+0, 
                    InfiMaterialEnum.Bone, InfiMaterialEnum.Bone, "woodBoneAxe");
        	stoneBoneAxe = new InfiToolAxe(PropsHelperInfiTools.boneAxeID+1, 
                    InfiMaterialEnum.Bone, InfiMaterialEnum.Stone, "stoneBoneAxe");
        	sandstoneBoneAxe = new InfiToolAxe(PropsHelperInfiTools.boneAxeID+2, 
                    InfiMaterialEnum.Bone, InfiMaterialEnum.Sandstone, "sandstoneBoneAxe");
        	boneBoneAxe = new InfiToolAxe(PropsHelperInfiTools.boneAxeID+3, 
                    InfiMaterialEnum.Bone, InfiMaterialEnum.Bone, "boneBoneAxe");
        	paperBoneAxe = new InfiToolAxe(PropsHelperInfiTools.boneAxeID+4, 
                    InfiMaterialEnum.Bone, InfiMaterialEnum.Paper, "paperBoneAxe");
        	netherrackBoneAxe = new InfiToolAxe(PropsHelperInfiTools.boneAxeID+5, 
                    InfiMaterialEnum.Bone, InfiMaterialEnum.Netherrack, "netherrackBoneAxe");
        	iceBoneAxe = new InfiToolAxe(PropsHelperInfiTools.boneAxeID+6, 
                    InfiMaterialEnum.Bone, InfiMaterialEnum.Ice, "iceBoneAxe");
        	cactusBoneAxe = new InfiToolAxe(PropsHelperInfiTools.boneAxeID+7,
                    InfiMaterialEnum.Bone, InfiMaterialEnum.Cactus, "cactusBoneAxe");
        	flintBoneAxe = new InfiToolAxe(PropsHelperInfiTools.boneAxeID+8,
                    InfiMaterialEnum.Bone, InfiMaterialEnum.Flint, "flintBoneAxe");
            
            MinecraftForge.setToolClass(woodBoneAxe, "axe", InfiMaterialEnum.Bone.getHarvestLevel());
            MinecraftForge.setToolClass(stoneBoneAxe, "axe", InfiMaterialEnum.Bone.getHarvestLevel());
            MinecraftForge.setToolClass(sandstoneBoneAxe, "axe", InfiMaterialEnum.Bone.getHarvestLevel());
            MinecraftForge.setToolClass(boneBoneAxe, "axe", InfiMaterialEnum.Bone.getHarvestLevel());
            MinecraftForge.setToolClass(paperBoneAxe, "axe", InfiMaterialEnum.Bone.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackBoneAxe, "axe", InfiMaterialEnum.Bone.getHarvestLevel());
            MinecraftForge.setToolClass(iceBoneAxe, "axe", InfiMaterialEnum.Bone.getHarvestLevel());
            MinecraftForge.setToolClass(cactusBoneAxe, "axe", InfiMaterialEnum.Bone.getHarvestLevel());
            MinecraftForge.setToolClass(flintBoneAxe, "axe", InfiMaterialEnum.Bone.getHarvestLevel());
        }
        
        if(PropsHelperInfiTools.enablePaperTools)
        {
        	woodPaperAxe = new InfiToolAxe(PropsHelperInfiTools.paperAxeID+0, 
                    InfiMaterialEnum.Paper, InfiMaterialEnum.Paper, "woodPaperAxe");
        	bonePaperAxe = new InfiToolAxe(PropsHelperInfiTools.paperAxeID+1, 
                    InfiMaterialEnum.Paper, InfiMaterialEnum.Paper, "bonePaperAxe");
        	paperPaperAxe = new InfiToolAxe(PropsHelperInfiTools.paperAxeID+2, 
                    InfiMaterialEnum.Paper, InfiMaterialEnum.Paper, "paperPaperAxe");
        	slimePaperAxe = new InfiToolAxe(PropsHelperInfiTools.paperAxeID+3,
                    InfiMaterialEnum.Paper, InfiMaterialEnum.Cactus, "slimePaperAxe");
        	cactusPaperAxe = new InfiToolAxe(PropsHelperInfiTools.paperAxeID+4,
                    InfiMaterialEnum.Paper, InfiMaterialEnum.Cactus, "cactusPaperAxe");
            
            MinecraftForge.setToolClass(woodPaperAxe, "axe", InfiMaterialEnum.Paper.getHarvestLevel());
            MinecraftForge.setToolClass(bonePaperAxe, "axe", InfiMaterialEnum.Paper.getHarvestLevel());
            MinecraftForge.setToolClass(paperPaperAxe, "axe", InfiMaterialEnum.Paper.getHarvestLevel());
            MinecraftForge.setToolClass(slimePaperAxe, "axe", InfiMaterialEnum.Paper.getHarvestLevel());
            MinecraftForge.setToolClass(cactusPaperAxe, "axe", InfiMaterialEnum.Paper.getHarvestLevel());
        }
        
        if(PropsHelperInfiTools.enableMossyTools)
        {
        	woodMossyAxe = new InfiToolAxe(PropsHelperInfiTools.mossyAxeID+0, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Wood, "woodMossyAxe");
        	stoneMossyAxe = new InfiToolAxe(PropsHelperInfiTools.mossyAxeID+1, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Stone, "stoneMossyAxe");
        	diamondMossyAxe = new InfiToolAxe(PropsHelperInfiTools.mossyAxeID+2, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Diamond, "diamondMossyAxe");
        	redstoneMossyAxe = new InfiToolAxe(PropsHelperInfiTools.mossyAxeID+3, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Redstone, "redstoneMossyAxe");
        	boneMossyAxe = new InfiToolAxe(PropsHelperInfiTools.mossyAxeID+4, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Bone, "boneMossyAxe");
        	mossyMossyAxe = new InfiToolAxe(PropsHelperInfiTools.mossyAxeID+5, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Mossy, "mossyMossyAxe");
        	netherrackMossyAxe = new InfiToolAxe(PropsHelperInfiTools.mossyAxeID+6, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Netherrack, "netherrackMossyAxe");
        	glowstoneMossyAxe = new InfiToolAxe(PropsHelperInfiTools.mossyAxeID+7, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Glowstone, "glowstoneMossyAxe");
        	cactusMossyAxe = new InfiToolAxe(PropsHelperInfiTools.mossyAxeID+8, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Cactus, "cactusMossyAxe");
        	blazeMossyAxe = new InfiToolAxe(PropsHelperInfiTools.mossyAxeID+9, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Blaze, "blazeMossyAxe");
        	manyullynMossyAxe = new InfiToolAxe(PropsHelperInfiTools.mossyAxeID+10, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Manyullyn, "manyullynMossyAxe");
        	uraniumMossyAxe = new InfiToolAxe(PropsHelperInfiTools.mossyAxeID+11, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Uranium, "uraniumMossyAxe");
            
            MinecraftForge.setToolClass(woodMossyAxe, "axe", InfiMaterialEnum.Mossy.getHarvestLevel());
            MinecraftForge.setToolClass(stoneMossyAxe, "axe", InfiMaterialEnum.Mossy.getHarvestLevel());
            MinecraftForge.setToolClass(diamondMossyAxe, "axe", InfiMaterialEnum.Mossy.getHarvestLevel());
            MinecraftForge.setToolClass(redstoneMossyAxe, "axe", InfiMaterialEnum.Mossy.getHarvestLevel());
            MinecraftForge.setToolClass(boneMossyAxe, "axe", InfiMaterialEnum.Mossy.getHarvestLevel());
            MinecraftForge.setToolClass(mossyMossyAxe, "axe", InfiMaterialEnum.Mossy.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackMossyAxe, "axe", InfiMaterialEnum.Mossy.getHarvestLevel());
            MinecraftForge.setToolClass(glowstoneMossyAxe, "axe", InfiMaterialEnum.Mossy.getHarvestLevel());
            MinecraftForge.setToolClass(cactusMossyAxe, "axe", InfiMaterialEnum.Mossy.getHarvestLevel());
            MinecraftForge.setToolClass(blazeMossyAxe, "axe", InfiMaterialEnum.Mossy.getHarvestLevel());
            MinecraftForge.setToolClass(manyullynMossyAxe, "axe", InfiMaterialEnum.Mossy.getHarvestLevel());
            MinecraftForge.setToolClass(uraniumMossyAxe, "axe", InfiMaterialEnum.Mossy.getHarvestLevel());
        }
        
        if(PropsHelperInfiTools.enableNetherrackTools)
        {
        	woodNetherrackAxe = new InfiToolAxe(PropsHelperInfiTools.netherrackAxeID+0, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Wood, "woodNetherrackAxe");
        	stoneNetherrackAxe = new InfiToolAxe(PropsHelperInfiTools.netherrackAxeID+1, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Stone, "stoneNetherrackAxe");
        	sandstoneNetherrackAxe = new InfiToolAxe(PropsHelperInfiTools.netherrackAxeID+2, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Sandstone, "sandstoneNetherrackAxe");
        	boneNetherrackAxe = new InfiToolAxe(PropsHelperInfiTools.netherrackAxeID+3, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Bone, "boneNetherrackAxe");
        	paperNetherrackAxe = new InfiToolAxe(PropsHelperInfiTools.netherrackAxeID+4, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Paper, "paperNetherrackAxe");
        	mossyNetherrackAxe = new InfiToolAxe(PropsHelperInfiTools.netherrackAxeID+5, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Mossy, "mossyNetherrackAxe");
        	netherrackNetherrackAxe = new InfiToolAxe(PropsHelperInfiTools.netherrackAxeID+6, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Netherrack, "netherrackNetherrackAxe");
        	iceNetherrackAxe = new InfiToolAxe(PropsHelperInfiTools.netherrackAxeID+7, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Ice, "iceNetherrackAxe");
        	slimeNetherrackAxe = new InfiToolAxe(PropsHelperInfiTools.netherrackAxeID+8, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Slime, "slimeNetherrackAxe");
        	cactusNetherrackAxe = new InfiToolAxe(PropsHelperInfiTools.netherrackAxeID+9, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Cactus, "cactusNetherrackAxe");
        	flintNetherrackAxe = new InfiToolAxe(PropsHelperInfiTools.netherrackAxeID+10, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Flint, "flintNetherrackAxe");
        	copperNetherrackAxe = new InfiToolAxe(PropsHelperInfiTools.netherrackAxeID+11, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Copper, "copperNetherrackAxe");
        	bronzeNetherrackAxe = new InfiToolAxe(PropsHelperInfiTools.netherrackAxeID+12, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Bronze, "bronzeNetherrackAxe");
            
            MinecraftForge.setToolClass(woodNetherrackAxe, "axe", InfiMaterialEnum.Netherrack.getHarvestLevel());
            MinecraftForge.setToolClass(stoneNetherrackAxe, "axe", InfiMaterialEnum.Netherrack.getHarvestLevel());
            MinecraftForge.setToolClass(sandstoneNetherrackAxe, "axe", InfiMaterialEnum.Netherrack.getHarvestLevel());
            MinecraftForge.setToolClass(boneNetherrackAxe, "axe", InfiMaterialEnum.Netherrack.getHarvestLevel());
            MinecraftForge.setToolClass(paperNetherrackAxe, "axe", InfiMaterialEnum.Netherrack.getHarvestLevel());
            MinecraftForge.setToolClass(mossyNetherrackAxe, "axe", InfiMaterialEnum.Netherrack.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackNetherrackAxe, "axe", InfiMaterialEnum.Netherrack.getHarvestLevel());
            MinecraftForge.setToolClass(iceNetherrackAxe, "axe", InfiMaterialEnum.Netherrack.getHarvestLevel());
            MinecraftForge.setToolClass(slimeNetherrackAxe, "axe", InfiMaterialEnum.Netherrack.getHarvestLevel());
            MinecraftForge.setToolClass(cactusNetherrackAxe, "axe", InfiMaterialEnum.Netherrack.getHarvestLevel());
            MinecraftForge.setToolClass(flintNetherrackAxe, "axe", InfiMaterialEnum.Netherrack.getHarvestLevel());
            MinecraftForge.setToolClass(copperNetherrackAxe, "axe", InfiMaterialEnum.Netherrack.getHarvestLevel());
            MinecraftForge.setToolClass(bronzeNetherrackAxe, "axe", InfiMaterialEnum.Netherrack.getHarvestLevel());
        }
        
        if(PropsHelperInfiTools.enableGlowstoneTools)
        {
        	woodGlowstoneAxe = new InfiToolAxe(PropsHelperInfiTools.glowstoneAxeID+0, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Wood, "woodGlowstoneAxe");
        	redstoneGlowstoneAxe = new InfiToolAxe(PropsHelperInfiTools.glowstoneAxeID+1, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Redstone, "redstoneGlowstoneAxe");
        	obsidianGlowstoneAxe = new InfiToolAxe(PropsHelperInfiTools.glowstoneAxeID+2, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Obsidian, "obsidianGlowstoneAxe");
        	boneGlowstoneAxe = new InfiToolAxe(PropsHelperInfiTools.glowstoneAxeID+3, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Bone, "boneGlowstoneAxe");
        	netherrackGlowstoneAxe = new InfiToolAxe(PropsHelperInfiTools.glowstoneAxeID+4, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Netherrack, "netherrackGlowstoneAxe");
        	glowstoneGlowstoneAxe = new InfiToolAxe(PropsHelperInfiTools.glowstoneAxeID+5, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Glowstone, "glowstoneGlowstoneAxe");
        	iceGlowstoneAxe = new InfiToolAxe(PropsHelperInfiTools.glowstoneAxeID+6, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Ice, "iceGlowstoneAxe");
        	slimeGlowstoneAxe = new InfiToolAxe(PropsHelperInfiTools.glowstoneAxeID+7, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Slime, "slimeGlowstoneAxe");
        	cactusGlowstoneAxe = new InfiToolAxe(PropsHelperInfiTools.glowstoneAxeID+8, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Cactus, "cactusGlowstoneAxe");
            
            
            MinecraftForge.setToolClass(woodGlowstoneAxe, "axe", InfiMaterialEnum.Glowstone.getHarvestLevel());
            MinecraftForge.setToolClass(redstoneGlowstoneAxe, "axe", InfiMaterialEnum.Glowstone.getHarvestLevel());
            MinecraftForge.setToolClass(obsidianGlowstoneAxe, "axe", InfiMaterialEnum.Glowstone.getHarvestLevel());
            MinecraftForge.setToolClass(boneGlowstoneAxe, "axe", InfiMaterialEnum.Glowstone.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackGlowstoneAxe, "axe", InfiMaterialEnum.Glowstone.getHarvestLevel());
            MinecraftForge.setToolClass(glowstoneGlowstoneAxe, "axe", InfiMaterialEnum.Glowstone.getHarvestLevel());
            MinecraftForge.setToolClass(iceGlowstoneAxe, "axe", InfiMaterialEnum.Glowstone.getHarvestLevel());
            MinecraftForge.setToolClass(slimeGlowstoneAxe, "axe", InfiMaterialEnum.Glowstone.getHarvestLevel());
            MinecraftForge.setToolClass(cactusGlowstoneAxe, "axe", InfiMaterialEnum.Glowstone.getHarvestLevel());
        }
        
        if(PropsHelperInfiTools.enableIceTools)
        {
        	woodIceAxe = new InfiToolAxe(PropsHelperInfiTools.iceAxeID+0, 
                    InfiMaterialEnum.Ice, InfiMaterialEnum.Wood, "woodIceAxe");
        	boneIceAxe = new InfiToolAxe(PropsHelperInfiTools.iceAxeID+1, 
                    InfiMaterialEnum.Ice, InfiMaterialEnum.Bone, "boneIceAxe");
        	paperIceAxe = new InfiToolAxe(PropsHelperInfiTools.iceAxeID+2, 
                    InfiMaterialEnum.Ice, InfiMaterialEnum.Paper, "paperIceAxe");
        	iceIceAxe = new InfiToolAxe(PropsHelperInfiTools.iceAxeID+3, 
                    InfiMaterialEnum.Ice, InfiMaterialEnum.Ice, "iceIceAxe");
        	slimeIceAxe = new InfiToolAxe(PropsHelperInfiTools.iceAxeID+4, 
                    InfiMaterialEnum.Ice, InfiMaterialEnum.Slime, "slimeIceAxe");
        	cactusIceAxe = new InfiToolAxe(PropsHelperInfiTools.iceAxeID+5, 
                    InfiMaterialEnum.Ice, InfiMaterialEnum.Cactus, "cactusIceAxe");
            
            
            MinecraftForge.setToolClass(woodIceAxe, "axe", InfiMaterialEnum.Ice.getHarvestLevel());
            MinecraftForge.setToolClass(boneIceAxe, "axe", InfiMaterialEnum.Ice.getHarvestLevel());
            MinecraftForge.setToolClass(paperIceAxe, "axe", InfiMaterialEnum.Ice.getHarvestLevel());
            MinecraftForge.setToolClass(iceIceAxe, "axe", InfiMaterialEnum.Ice.getHarvestLevel());
            MinecraftForge.setToolClass(slimeIceAxe, "axe", InfiMaterialEnum.Ice.getHarvestLevel());
            MinecraftForge.setToolClass(cactusIceAxe, "axe", InfiMaterialEnum.Ice.getHarvestLevel());
        }
        
        if(PropsHelperInfiTools.enableLavaTools)
        {
        	diamondLavaAxe = new InfiToolAxe(PropsHelperInfiTools.lavaAxeID+0, 
                    InfiMaterialEnum.Lava, InfiMaterialEnum.Diamond, "diamondLavaAxe");
        	obsidianLavaAxe = new InfiToolAxe(PropsHelperInfiTools.lavaAxeID+1, 
                    InfiMaterialEnum.Lava, InfiMaterialEnum.Obsidian, "obsidianLavaAxe");
        	netherrackLavaAxe = new InfiToolAxe(PropsHelperInfiTools.lavaAxeID+2, 
                    InfiMaterialEnum.Lava, InfiMaterialEnum.Netherrack, "netherrackLavaAxe");
        	lavaLavaAxe = new InfiToolAxe(PropsHelperInfiTools.lavaAxeID+3, 
                    InfiMaterialEnum.Lava, InfiMaterialEnum.Lava, "lavaLavaAxe");
        	flintLavaAxe = new InfiToolAxe(PropsHelperInfiTools.lavaAxeID+4, 
                    InfiMaterialEnum.Lava, InfiMaterialEnum.Flint, "flintLavaAxe");
        	blazeLavaAxe = new InfiToolAxe(PropsHelperInfiTools.lavaAxeID+5, 
                    InfiMaterialEnum.Lava, InfiMaterialEnum.Blaze, "blazeLavaAxe");
        	manyullynLavaAxe = new InfiToolAxe(PropsHelperInfiTools.lavaAxeID+6, 
                    InfiMaterialEnum.Lava, InfiMaterialEnum.Manyullyn, "manyullynLavaAxe");
            uraniumLavaAxe = new InfiToolAxe(PropsHelperInfiTools.lavaAxeID+7, 
                    InfiMaterialEnum.Lava, InfiMaterialEnum.Uranium, "uraniumLavaAxe");
            
            MinecraftForge.setToolClass(diamondLavaAxe, "axe", InfiMaterialEnum.Lava.getHarvestLevel());
            MinecraftForge.setToolClass(obsidianLavaAxe, "axe", InfiMaterialEnum.Lava.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackLavaAxe, "axe", InfiMaterialEnum.Lava.getHarvestLevel());
            MinecraftForge.setToolClass(lavaLavaAxe, "axe", InfiMaterialEnum.Lava.getHarvestLevel());
            MinecraftForge.setToolClass(flintLavaAxe, "axe", InfiMaterialEnum.Lava.getHarvestLevel());
            MinecraftForge.setToolClass(blazeLavaAxe, "axe", InfiMaterialEnum.Lava.getHarvestLevel());
            MinecraftForge.setToolClass(manyullynLavaAxe, "axe", InfiMaterialEnum.Lava.getHarvestLevel());
            MinecraftForge.setToolClass(uraniumLavaAxe, "axe", InfiMaterialEnum.Lava.getHarvestLevel());
        }
        
        if(PropsHelperInfiTools.enableSlimeTools)
        {
        	woodSlimeAxe = new InfiToolAxe(PropsHelperInfiTools.slimeAxeID+0, 
                    InfiMaterialEnum.Slime, InfiMaterialEnum.Wood, "woodSlimeAxe");
        	sandstoneSlimeAxe = new InfiToolAxe(PropsHelperInfiTools.slimeAxeID+1, 
                    InfiMaterialEnum.Slime, InfiMaterialEnum.Sandstone, "sandstoneSlimeAxe");
        	boneSlimeAxe = new InfiToolAxe(PropsHelperInfiTools.slimeAxeID+2, 
                    InfiMaterialEnum.Slime, InfiMaterialEnum.Bone, "boneSlimeAxe");
        	paperSlimeAxe = new InfiToolAxe(PropsHelperInfiTools.slimeAxeID+3, 
                    InfiMaterialEnum.Slime, InfiMaterialEnum.Paper, "paperSlimeAxe");
        	slimeSlimeAxe = new InfiToolAxe(PropsHelperInfiTools.slimeAxeID+4, 
                    InfiMaterialEnum.Slime, InfiMaterialEnum.Slime, "slimeSlimeAxe");
        	cactusSlimeAxe = new InfiToolAxe(PropsHelperInfiTools.slimeAxeID+5, 
                    InfiMaterialEnum.Slime, InfiMaterialEnum.Cactus, "cactusSlimeAxe");
            
            MinecraftForge.setToolClass(woodSlimeAxe, "axe", InfiMaterialEnum.Slime.getHarvestLevel());
            MinecraftForge.setToolClass(sandstoneSlimeAxe, "axe", InfiMaterialEnum.Slime.getHarvestLevel());
            MinecraftForge.setToolClass(boneSlimeAxe, "axe", InfiMaterialEnum.Slime.getHarvestLevel());
            MinecraftForge.setToolClass(paperSlimeAxe, "axe", InfiMaterialEnum.Slime.getHarvestLevel());
            MinecraftForge.setToolClass(slimeSlimeAxe, "axe", InfiMaterialEnum.Slime.getHarvestLevel());
            MinecraftForge.setToolClass(cactusSlimeAxe, "axe", InfiMaterialEnum.Slime.getHarvestLevel());
        }
        
        if(PropsHelperInfiTools.enableCactusTools)
        {
        	woodCactusAxe = new InfiToolAxe(PropsHelperInfiTools.cactusAxeID+0, 
                    InfiMaterialEnum.Cactus, InfiMaterialEnum.Wood, "woodCactusAxe");
        	sandstoneCactusAxe = new InfiToolAxe(PropsHelperInfiTools.cactusAxeID+1, 
                    InfiMaterialEnum.Cactus, InfiMaterialEnum.Sandstone, "sandstoneCactusAxe");
        	boneCactusAxe = new InfiToolAxe(PropsHelperInfiTools.cactusAxeID+2, 
                    InfiMaterialEnum.Cactus, InfiMaterialEnum.Bone, "boneCactusAxe");
        	netherrackCactusAxe = new InfiToolAxe(PropsHelperInfiTools.cactusAxeID+3, 
                    InfiMaterialEnum.Cactus, InfiMaterialEnum.Netherrack, "netherrackCactusAxe");
        	iceCactusAxe = new InfiToolAxe(PropsHelperInfiTools.cactusAxeID+4, 
                    InfiMaterialEnum.Cactus, InfiMaterialEnum.Ice, "iceCactusAxe");
        	slimeCactusAxe = new InfiToolAxe(PropsHelperInfiTools.cactusAxeID+5, 
                    InfiMaterialEnum.Cactus, InfiMaterialEnum.Slime, "slimeCactusAxe");
        	cactusCactusAxe = new InfiToolAxe(PropsHelperInfiTools.cactusAxeID+6, 
                    InfiMaterialEnum.Cactus, InfiMaterialEnum.Cactus, "cactusCactusAxe");
            
            MinecraftForge.setToolClass(woodCactusAxe, "axe", InfiMaterialEnum.Cactus.getHarvestLevel());
            MinecraftForge.setToolClass(sandstoneCactusAxe, "axe", InfiMaterialEnum.Cactus.getHarvestLevel());
            MinecraftForge.setToolClass(boneCactusAxe, "axe", InfiMaterialEnum.Cactus.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackCactusAxe, "axe", InfiMaterialEnum.Cactus.getHarvestLevel());
            MinecraftForge.setToolClass(iceCactusAxe, "axe", InfiMaterialEnum.Cactus.getHarvestLevel());
            MinecraftForge.setToolClass(slimeCactusAxe, "axe", InfiMaterialEnum.Cactus.getHarvestLevel());
            MinecraftForge.setToolClass(cactusCactusAxe, "axe", InfiMaterialEnum.Cactus.getHarvestLevel());
        }
        
        if(PropsHelperInfiTools.enableFlintTools)
        {
        	woodFlintAxe = new InfiToolAxe(PropsHelperInfiTools.flintAxeID+0, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Wood, "woodFlintAxe");
        	stoneFlintAxe = new InfiToolAxe(PropsHelperInfiTools.flintAxeID+1, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Stone, "stoneFlintAxe");
        	sandstoneFlintAxe = new InfiToolAxe(PropsHelperInfiTools.flintAxeID+2, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Sandstone, "sandstoneFlintAxe");
        	boneFlintAxe = new InfiToolAxe(PropsHelperInfiTools.flintAxeID+3, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Bone, "boneFlintAxe");
        	netherrackFlintAxe = new InfiToolAxe(PropsHelperInfiTools.flintAxeID+4, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Flint, "netherrackFlintAxe");
        	slimeFlintAxe = new InfiToolAxe(PropsHelperInfiTools.flintAxeID+5, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Slime, "slimeFlintAxe");
        	cactusFlintAxe = new InfiToolAxe(PropsHelperInfiTools.flintAxeID+6, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Cactus, "cactusFlintAxe");
        	flintFlintAxe = new InfiToolAxe(PropsHelperInfiTools.flintAxeID+7, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Flint, "flintFlintAxe");
        	copperFlintAxe = new InfiToolAxe(PropsHelperInfiTools.flintAxeID+8, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Copper, "copperFlintAxe");
        	bronzeFlintAxe = new InfiToolAxe(PropsHelperInfiTools.flintAxeID+9, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Bronze, "bronzeFlintAxe");
            
            MinecraftForge.setToolClass(woodFlintAxe, "axe", InfiMaterialEnum.Flint.getHarvestLevel());
            MinecraftForge.setToolClass(stoneFlintAxe, "axe", InfiMaterialEnum.Flint.getHarvestLevel());
            MinecraftForge.setToolClass(sandstoneFlintAxe, "axe", InfiMaterialEnum.Flint.getHarvestLevel());
            MinecraftForge.setToolClass(boneFlintAxe, "axe", InfiMaterialEnum.Flint.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackFlintAxe, "axe", InfiMaterialEnum.Flint.getHarvestLevel());
            MinecraftForge.setToolClass(slimeFlintAxe, "axe", InfiMaterialEnum.Flint.getHarvestLevel());
            MinecraftForge.setToolClass(cactusFlintAxe, "axe", InfiMaterialEnum.Flint.getHarvestLevel());
            MinecraftForge.setToolClass(flintFlintAxe, "axe", InfiMaterialEnum.Flint.getHarvestLevel());
            MinecraftForge.setToolClass(copperFlintAxe, "axe", InfiMaterialEnum.Flint.getHarvestLevel());
            MinecraftForge.setToolClass(bronzeFlintAxe, "axe", InfiMaterialEnum.Flint.getHarvestLevel());
        }
        
        if(PropsHelperInfiTools.enableBlazeTools)
        {
        	diamondBlazeAxe = new InfiToolAxe(PropsHelperInfiTools.blazeAxeID+0, 
                    InfiMaterialEnum.Blaze, InfiMaterialEnum.Diamond, "diamondBlazeAxe");
        	obsidianBlazeAxe = new InfiToolAxe(PropsHelperInfiTools.blazeAxeID+1, 
                    InfiMaterialEnum.Blaze, InfiMaterialEnum.Obsidian, "obsidianBlazeAxe");
        	netherrackBlazeAxe = new InfiToolAxe(PropsHelperInfiTools.blazeAxeID+2, 
                    InfiMaterialEnum.Blaze, InfiMaterialEnum.Netherrack, "netherrackBlazeAxe");
        	lavaBlazeAxe = new InfiToolAxe(PropsHelperInfiTools.blazeAxeID+3, 
                    InfiMaterialEnum.Blaze, InfiMaterialEnum.Lava, "lavaBlazeAxe");
        	flintBlazeAxe = new InfiToolAxe(PropsHelperInfiTools.blazeAxeID+4, 
                    InfiMaterialEnum.Blaze, InfiMaterialEnum.Flint, "flintBlazeAxe");
        	blazeBlazeAxe = new InfiToolAxe(PropsHelperInfiTools.blazeAxeID+5, 
                    InfiMaterialEnum.Blaze, InfiMaterialEnum.Blaze, "blazeBlazeAxe");
        	manyullynBlazeAxe = new InfiToolAxe(PropsHelperInfiTools.blazeAxeID+6, 
                    InfiMaterialEnum.Blaze, InfiMaterialEnum.Manyullyn, "manyullynBlazeAxe");
            uraniumBlazeAxe = new InfiToolAxe(PropsHelperInfiTools.blazeAxeID+7, 
                    InfiMaterialEnum.Blaze, InfiMaterialEnum.Uranium, "uraniumBlazeAxe");
            
            MinecraftForge.setToolClass(diamondBlazeAxe, "axe", InfiMaterialEnum.Blaze.getHarvestLevel());
            MinecraftForge.setToolClass(obsidianBlazeAxe, "axe", InfiMaterialEnum.Blaze.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackBlazeAxe, "axe", InfiMaterialEnum.Blaze.getHarvestLevel());
            MinecraftForge.setToolClass(blazeBlazeAxe, "axe", InfiMaterialEnum.Blaze.getHarvestLevel());
            MinecraftForge.setToolClass(flintBlazeAxe, "axe", InfiMaterialEnum.Blaze.getHarvestLevel());
            MinecraftForge.setToolClass(blazeBlazeAxe, "axe", InfiMaterialEnum.Blaze.getHarvestLevel());
            MinecraftForge.setToolClass(manyullynBlazeAxe, "axe", InfiMaterialEnum.Blaze.getHarvestLevel());
            MinecraftForge.setToolClass(uraniumBlazeAxe, "axe", InfiMaterialEnum.Blaze.getHarvestLevel());
        }
    	
        if(PropsHelperInfiTools.enableCopperTools)
        {
        	woodCopperAxe = new InfiToolAxe(PropsHelperInfiTools.copperAxeID+0, 
                    InfiMaterialEnum.Copper, InfiMaterialEnum.Wood, "woodCopperAxe");
            stoneCopperAxe = new InfiToolAxe(PropsHelperInfiTools.copperAxeID+1, 
                    InfiMaterialEnum.Copper, InfiMaterialEnum.Stone, "stoneCopperAxe");
            boneCopperAxe = new InfiToolAxe(PropsHelperInfiTools.copperAxeID+2, 
                    InfiMaterialEnum.Copper, InfiMaterialEnum.Bone, "boneCopperAxe");
            netherrackCopperAxe = new InfiToolAxe(PropsHelperInfiTools.copperAxeID+3, 
                    InfiMaterialEnum.Copper, InfiMaterialEnum.Netherrack, "netherrackCopperAxe");
            slimeCopperAxe = new InfiToolAxe(PropsHelperInfiTools.copperAxeID+4, 
                    InfiMaterialEnum.Copper, InfiMaterialEnum.Slime, "slimeCopperAxe");
            cactusCopperAxe = new InfiToolAxe(PropsHelperInfiTools.copperAxeID+5, 
                    InfiMaterialEnum.Copper, InfiMaterialEnum.Cactus, "cactusCopperAxe");
            flintCopperAxe = new InfiToolAxe(PropsHelperInfiTools.copperAxeID+6, 
                    InfiMaterialEnum.Copper, InfiMaterialEnum.Flint, "flintCopperAxe");
            copperCopperAxe = new InfiToolAxe(PropsHelperInfiTools.copperAxeID+7, 
                    InfiMaterialEnum.Copper, InfiMaterialEnum.Copper, "copperCopperAxe");
            
            MinecraftForge.setToolClass(woodCopperAxe, "axe", InfiMaterialEnum.Copper.getHarvestLevel());
        	MinecraftForge.setToolClass(stoneCopperAxe, "axe", InfiMaterialEnum.Copper.getHarvestLevel());
            MinecraftForge.setToolClass(boneCopperAxe, "axe", InfiMaterialEnum.Copper.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackCopperAxe, "axe", InfiMaterialEnum.Copper.getHarvestLevel());
            MinecraftForge.setToolClass(slimeCopperAxe, "axe", InfiMaterialEnum.Copper.getHarvestLevel());
            MinecraftForge.setToolClass(cactusCopperAxe, "axe", InfiMaterialEnum.Copper.getHarvestLevel());
            MinecraftForge.setToolClass(flintCopperAxe, "axe", InfiMaterialEnum.Copper.getHarvestLevel());
            MinecraftForge.setToolClass(copperCopperAxe, "axe", InfiMaterialEnum.Copper.getHarvestLevel());
        }
        
        if(PropsHelperInfiTools.enableBronzeTools)
        {
        	woodBronzeAxe = new InfiToolAxe(PropsHelperInfiTools.bronzeAxeID+0, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Wood, "woodBronzeAxe");
            stoneBronzeAxe = new InfiToolAxe(PropsHelperInfiTools.bronzeAxeID+1, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Stone, "stoneBronzeAxe");
            boneBronzeAxe = new InfiToolAxe(PropsHelperInfiTools.bronzeAxeID+2, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Bone, "boneBronzeAxe");
            netherrackBronzeAxe = new InfiToolAxe(PropsHelperInfiTools.bronzeAxeID+3, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Netherrack, "netherrackBronzeAxe");
            slimeBronzeAxe = new InfiToolAxe(PropsHelperInfiTools.bronzeAxeID+4, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Slime, "slimeBronzeAxe");
            cactusBronzeAxe = new InfiToolAxe(PropsHelperInfiTools.bronzeAxeID+5, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Cactus, "cactusBronzeAxe");
            flintBronzeAxe = new InfiToolAxe(PropsHelperInfiTools.bronzeAxeID+6, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Flint, "flintBronzeAxe");
            copperBronzeAxe = new InfiToolAxe(PropsHelperInfiTools.bronzeAxeID+7, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Copper, "copperBronzeAxe");
            bronzeBronzeAxe = new InfiToolAxe(PropsHelperInfiTools.bronzeAxeID+8, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Bronze, "copperBronzeAxe");
            
            MinecraftForge.setToolClass(woodBronzeAxe, "axe", InfiMaterialEnum.Bronze.getHarvestLevel());
            MinecraftForge.setToolClass(stoneBronzeAxe, "axe", InfiMaterialEnum.Bronze.getHarvestLevel());
            MinecraftForge.setToolClass(boneBronzeAxe, "axe", InfiMaterialEnum.Bronze.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackBronzeAxe, "axe", InfiMaterialEnum.Bronze.getHarvestLevel());
            MinecraftForge.setToolClass(slimeBronzeAxe, "axe", InfiMaterialEnum.Bronze.getHarvestLevel());
            MinecraftForge.setToolClass(cactusBronzeAxe, "axe", InfiMaterialEnum.Bronze.getHarvestLevel());
            MinecraftForge.setToolClass(flintBronzeAxe, "axe", InfiMaterialEnum.Bronze.getHarvestLevel());
            MinecraftForge.setToolClass(copperBronzeAxe, "axe", InfiMaterialEnum.Bronze.getHarvestLevel());
            MinecraftForge.setToolClass(bronzeBronzeAxe, "axe", InfiMaterialEnum.Bronze.getHarvestLevel());
        }
        
        if(PropsHelperInfiTools.enableWorkedIronTools)
        {
        	woodWorkedIronAxe = new InfiToolAxe(PropsHelperInfiTools.workedIronAxeID+0, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Wood, "woodWorkedIronAxe");
            stoneWorkedIronAxe = new InfiToolAxe(PropsHelperInfiTools.workedIronAxeID+1, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Stone, "stoneWorkedIronAxe");
            ironWorkedIronAxe = new InfiToolAxe(PropsHelperInfiTools.workedIronAxeID+2,
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Iron, "ironWorkedIronAxe");
            diamondWorkedIronAxe = new InfiToolAxe(PropsHelperInfiTools.workedIronAxeID+3, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Diamond, "diamondWorkedIronAxe");
            redstoneWorkedIronAxe = new InfiToolAxe(PropsHelperInfiTools.workedIronAxeID+4, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Redstone, "redstoneWorkedIronAxe");
            obsidianWorkedIronAxe = new InfiToolAxe(PropsHelperInfiTools.workedIronAxeID+5, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Obsidian, "obsidianWorkedIronAxe");
            boneWorkedIronAxe = new InfiToolAxe(PropsHelperInfiTools.workedIronAxeID+6, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Bone, "boneWorkedIronAxe");
            netherrackWorkedIronAxe = new InfiToolAxe(PropsHelperInfiTools.workedIronAxeID+7, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Netherrack, "netherrackWorkedIronAxe");
            glowstoneWorkedIronAxe = new InfiToolAxe(PropsHelperInfiTools.workedIronAxeID+8, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Glowstone, "glowstoneWorkedIronAxe");
            iceWorkedIronAxe = new InfiToolAxe(PropsHelperInfiTools.workedIronAxeID+9, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Ice, "iceWorkedIronAxe");
            slimeWorkedIronAxe = new InfiToolAxe(PropsHelperInfiTools.workedIronAxeID+10, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Slime, "slimeWorkedIronAxe");
            cactusWorkedIronAxe = new InfiToolAxe(PropsHelperInfiTools.workedIronAxeID+11, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Cactus, "cactusWorkedIronAxe");
            blazeWorkedIronAxe = new InfiToolAxe(PropsHelperInfiTools.workedIronAxeID+12, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Blaze, "blazeWorkedIronAxe");
            copperWorkedIronAxe = new InfiToolAxe(PropsHelperInfiTools.workedIronAxeID+13, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Copper, "copperWorkedIronAxe");
            bronzeWorkedIronAxe = new InfiToolAxe(PropsHelperInfiTools.workedIronAxeID+14, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Bronze, "bronzeWorkedIronAxe");
            workedWorkedIronAxe = new InfiToolAxe(PropsHelperInfiTools.workedIronAxeID+15, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.WorkedIron, "workedWorkedIronAxe");
            steelWorkedIronAxe = new InfiToolAxe(PropsHelperInfiTools.workedIronAxeID+16, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Steel, "steelWorkedIronAxe");
            uraniumWorkedIronAxe = new InfiToolAxe(PropsHelperInfiTools.workedIronAxeID+17, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Bronze, "uraniumWorkedIronAxe");
            
            MinecraftForge.setToolClass(woodWorkedIronAxe, "axe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(stoneWorkedIronAxe, "axe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(ironWorkedIronAxe, "axe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(diamondWorkedIronAxe, "axe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(redstoneWorkedIronAxe, "axe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(obsidianWorkedIronAxe, "axe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(boneWorkedIronAxe, "axe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackWorkedIronAxe, "axe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(glowstoneWorkedIronAxe, "axe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(iceWorkedIronAxe, "axe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(slimeWorkedIronAxe, "axe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(cactusWorkedIronAxe, "axe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(blazeWorkedIronAxe, "axe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(copperWorkedIronAxe, "axe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(bronzeWorkedIronAxe, "axe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(workedWorkedIronAxe, "axe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(steelWorkedIronAxe, "axe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(uraniumWorkedIronAxe, "axe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
        }
        
        if(PropsHelperInfiTools.enableSteelTools)
        {
        	woodSteelAxe = new InfiToolAxe(PropsHelperInfiTools.steelAxeID+0, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Wood, "woodSteelAxe");
            stoneSteelAxe = new InfiToolAxe(PropsHelperInfiTools.steelAxeID+1, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Stone, "stoneSteelAxe");
            ironSteelAxe = new InfiToolAxe(PropsHelperInfiTools.steelAxeID+2, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Iron, "ironSteelAxe");
            diamondSteelAxe = new InfiToolAxe(PropsHelperInfiTools.steelAxeID+3, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Diamond, "diamondSteelAxe");
            redstoneSteelAxe = new InfiToolAxe(PropsHelperInfiTools.steelAxeID+4, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Redstone, "redstoneSteelAxe");
            obsidianSteelAxe = new InfiToolAxe(PropsHelperInfiTools.steelAxeID+5, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Obsidian, "obsidianSteelAxe");
            boneSteelAxe = new InfiToolAxe(PropsHelperInfiTools.steelAxeID+6, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Bone, "boneSteelAxe");
            netherrackSteelAxe = new InfiToolAxe(PropsHelperInfiTools.steelAxeID+7, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Netherrack, "netherrackSteelAxe");
            glowstoneSteelAxe = new InfiToolAxe(PropsHelperInfiTools.steelAxeID+8, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Glowstone, "glowstoneSteelAxe");
            iceSteelAxe = new InfiToolAxe(PropsHelperInfiTools.steelAxeID+9, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Ice, "iceSteelAxe");
            slimeSteelAxe = new InfiToolAxe(PropsHelperInfiTools.steelAxeID+10, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Slime, "slimeSteelAxe");
            cactusSteelAxe = new InfiToolAxe(PropsHelperInfiTools.steelAxeID+11, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Cactus, "cactusSteelAxe");
            blazeSteelAxe = new InfiToolAxe(PropsHelperInfiTools.steelAxeID+12, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Blaze, "blazeSteelAxe");
            copperSteelAxe = new InfiToolAxe(PropsHelperInfiTools.steelAxeID+13, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Copper, "copperSteelAxe");
            bronzeSteelAxe = new InfiToolAxe(PropsHelperInfiTools.steelAxeID+14, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Bronze, "bronzeSteelAxe");
            workedSteelAxe = new InfiToolAxe(PropsHelperInfiTools.steelAxeID+15, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.WorkedIron, "workedSteelAxe");
            steelSteelAxe = new InfiToolAxe(PropsHelperInfiTools.steelAxeID+16, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Steel, "steelSteelAxe");
            cobaltSteelAxe = new InfiToolAxe(PropsHelperInfiTools.steelAxeID+17, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Cobalt, "cobaltSteelAxe");
            arditeSteelAxe = new InfiToolAxe(PropsHelperInfiTools.steelAxeID+18, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Ardite, "arditeSteelAxe");
            uraniumSteelAxe = new InfiToolAxe(PropsHelperInfiTools.steelAxeID+19, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Bronze, "uraniumSteelAxe");

            MinecraftForge.setToolClass(woodSteelAxe, "axe", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(stoneSteelAxe, "axe", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(ironSteelAxe, "axe", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(diamondSteelAxe, "axe", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(redstoneSteelAxe, "axe", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(obsidianSteelAxe, "axe", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(boneSteelAxe, "axe", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackSteelAxe, "axe", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(glowstoneSteelAxe, "axe", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(iceSteelAxe, "axe", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(slimeSteelAxe, "axe", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(cactusSteelAxe, "axe", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(blazeSteelAxe, "axe", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(copperSteelAxe, "axe", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(bronzeSteelAxe, "axe", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(workedSteelAxe, "axe", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(steelSteelAxe, "axe", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(cobaltSteelAxe, "axe", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(arditeSteelAxe, "axe", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(uraniumSteelAxe, "axe", InfiMaterialEnum.Steel.getHarvestLevel());
        }
        
        if(PropsHelperInfiTools.enableCobaltTools)
        {
        	woodCobaltAxe = new InfiToolAxe(PropsHelperInfiTools.cobaltAxeID+0, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Wood, "woodCobaltAxe");
            stoneCobaltAxe = new InfiToolAxe(PropsHelperInfiTools.cobaltAxeID+1, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Stone, "stoneCobaltAxe");
            ironCobaltAxe = new InfiToolAxe(PropsHelperInfiTools.cobaltAxeID+2, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Iron, "ironCobaltAxe");
            diamondCobaltAxe = new InfiToolAxe(PropsHelperInfiTools.cobaltAxeID+3,
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Diamond, "diamondCobaltAxe");
            redstoneCobaltAxe = new InfiToolAxe(PropsHelperInfiTools.cobaltAxeID+4, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Redstone, "redstoneCobaltAxe");
            obsidianCobaltAxe = new InfiToolAxe(PropsHelperInfiTools.cobaltAxeID+5, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Obsidian, "obsidianCobaltAxe");
            boneCobaltAxe = new InfiToolAxe(PropsHelperInfiTools.cobaltAxeID+6, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Bone, "boneCobaltAxe");
            slimeCobaltAxe = new InfiToolAxe(PropsHelperInfiTools.cobaltAxeID+7, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Slime, "slimeCobaltAxe");
            cactusCobaltAxe = new InfiToolAxe(PropsHelperInfiTools.cobaltAxeID+8, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Cactus, "cactusCobaltAxe");
            blazeCobaltAxe = new InfiToolAxe(PropsHelperInfiTools.cobaltAxeID+9, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Blaze, "blazeCobaltAxe");
            copperCobaltAxe = new InfiToolAxe(PropsHelperInfiTools.cobaltAxeID+10, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Copper, "copperCobaltAxe");
            bronzeCobaltAxe = new InfiToolAxe(PropsHelperInfiTools.cobaltAxeID+11, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Bronze, "bronzeCobaltAxe");
            workedCobaltAxe = new InfiToolAxe(PropsHelperInfiTools.cobaltAxeID+12, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.WorkedIron, "workedCobaltAxe");
            steelCobaltAxe = new InfiToolAxe(PropsHelperInfiTools.cobaltAxeID+13, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Steel, "steelCobaltAxe");
            cobaltCobaltAxe = new InfiToolAxe(PropsHelperInfiTools.cobaltAxeID+14, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Cobalt, "cobaltCobaltAxe");
            arditeCobaltAxe = new InfiToolAxe(PropsHelperInfiTools.cobaltAxeID+15, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Ardite, "arditeCobaltAxe");
            manyullynCobaltAxe = new InfiToolAxe(PropsHelperInfiTools.cobaltAxeID+16, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Manyullyn, "arditeCobaltAxe");
            uraniumCobaltAxe = new InfiToolAxe(PropsHelperInfiTools.cobaltAxeID+17, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Bronze, "uraniumCobaltAxe");
            
            MinecraftForge.setToolClass(woodCobaltAxe, "axe", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(stoneCobaltAxe, "axe", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(ironCobaltAxe, "axe", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(diamondCobaltAxe, "axe", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(redstoneCobaltAxe, "axe", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(obsidianCobaltAxe, "axe", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(boneCobaltAxe, "axe", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(slimeCobaltAxe, "axe", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(cactusCobaltAxe, "axe", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(blazeCobaltAxe, "axe", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(copperCobaltAxe, "axe", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(bronzeCobaltAxe, "axe", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(workedCobaltAxe, "axe", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(steelCobaltAxe, "axe", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(cobaltCobaltAxe, "axe", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(arditeCobaltAxe, "axe", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(manyullynCobaltAxe, "axe", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(uraniumCobaltAxe, "axe", InfiMaterialEnum.Cobalt.getHarvestLevel());
        }
        
        if(PropsHelperInfiTools.enableArditeTools)
        {
        	woodArditeAxe = new InfiToolAxe(PropsHelperInfiTools.arditeAxeID+0, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Wood, "woodArditeAxe");
            stoneArditeAxe = new InfiToolAxe(PropsHelperInfiTools.arditeAxeID+1, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Stone, "stoneArditeAxe");
            ironArditeAxe = new InfiToolAxe(PropsHelperInfiTools.arditeAxeID+2, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Iron, "ironArditeAxe");
            diamondArditeAxe = new InfiToolAxe(PropsHelperInfiTools.arditeAxeID+3,
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Diamond, "diamondArditeAxe");
            redstoneArditeAxe = new InfiToolAxe(PropsHelperInfiTools.arditeAxeID+4, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Redstone, "redstoneArditeAxe");
            obsidianArditeAxe = new InfiToolAxe(PropsHelperInfiTools.arditeAxeID+5, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Obsidian, "obsidianArditeAxe");
            boneArditeAxe = new InfiToolAxe(PropsHelperInfiTools.arditeAxeID+6,
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Bone, "boneArditeAxe");
            slimeArditeAxe = new InfiToolAxe(PropsHelperInfiTools.arditeAxeID+7, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Slime, "slimeArditeAxe");
            cactusArditeAxe = new InfiToolAxe(PropsHelperInfiTools.arditeAxeID+8, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Cactus, "cactusArditeAxe");
            blazeArditeAxe = new InfiToolAxe(PropsHelperInfiTools.arditeAxeID+9, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Blaze, "blazeArditeAxe");
            copperArditeAxe = new InfiToolAxe(PropsHelperInfiTools.arditeAxeID+10, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Copper, "copperArditeAxe");
            bronzeArditeAxe = new InfiToolAxe(PropsHelperInfiTools.arditeAxeID+11, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Bronze, "bronzeArditeAxe");
            workedArditeAxe = new InfiToolAxe(PropsHelperInfiTools.arditeAxeID+12, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.WorkedIron, "workedArditeAxe");
            steelArditeAxe = new InfiToolAxe(PropsHelperInfiTools.arditeAxeID+13, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Steel, "steelArditeAxe");
            cobaltArditeAxe = new InfiToolAxe(PropsHelperInfiTools.arditeAxeID+14, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Cobalt, "cobaltArditeAxe");
            arditeArditeAxe = new InfiToolAxe(PropsHelperInfiTools.arditeAxeID+15, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Ardite, "arditeArditeAxe");
            manyullynArditeAxe = new InfiToolAxe(PropsHelperInfiTools.arditeAxeID+16, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Manyullyn, "arditeArditeAxe");
            uraniumArditeAxe = new InfiToolAxe(PropsHelperInfiTools.arditeAxeID+17, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Bronze, "uraniumArditeAxe");
            
            MinecraftForge.setToolClass(woodArditeAxe, "axe", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(stoneArditeAxe, "axe", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(ironArditeAxe, "axe", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(diamondArditeAxe, "axe", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(redstoneArditeAxe, "axe", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(obsidianArditeAxe, "axe", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(boneArditeAxe, "axe", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(slimeArditeAxe, "axe", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(cactusArditeAxe, "axe", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(blazeArditeAxe, "axe", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(copperArditeAxe, "axe", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(bronzeArditeAxe, "axe", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(workedArditeAxe, "axe", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(steelArditeAxe, "axe", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(cobaltArditeAxe, "axe", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(arditeArditeAxe, "axe", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(manyullynArditeAxe, "axe", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(uraniumArditeAxe, "axe", InfiMaterialEnum.Ardite.getHarvestLevel());
        }
        
        if(PropsHelperInfiTools.enableManyullynTools)
        {
        	woodManyullynAxe = new InfiToolAxe(PropsHelperInfiTools.manyullynAxeID+0, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Stone, "woodManyullynAxe");
            stoneManyullynAxe = new InfiToolAxe(PropsHelperInfiTools.manyullynAxeID+1, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Stone, "stoneManyullynAxe");
            ironManyullynAxe = new InfiToolAxe(PropsHelperInfiTools.manyullynAxeID+2, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Iron, "ironManyullynAxe");
            diamondManyullynAxe = new InfiToolAxe(PropsHelperInfiTools.manyullynAxeID+3,
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Diamond, "diamondManyullynAxe");
            redstoneManyullynAxe = new InfiToolAxe(PropsHelperInfiTools.manyullynAxeID+4, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Redstone, "redstoneManyullynAxe");
            obsidianManyullynAxe = new InfiToolAxe(PropsHelperInfiTools.manyullynAxeID+5, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Obsidian, "obsidianManyullynAxe");
            boneManyullynAxe = new InfiToolAxe(PropsHelperInfiTools.manyullynAxeID+6, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Bone, "boneManyullynAxe");
            slimeManyullynAxe = new InfiToolAxe(PropsHelperInfiTools.manyullynAxeID+7, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Slime, "slimeManyullynAxe");
            cactusManyullynAxe = new InfiToolAxe(PropsHelperInfiTools.manyullynAxeID+8, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Cactus, "cactusManyullynAxe");
            blazeManyullynAxe = new InfiToolAxe(PropsHelperInfiTools.manyullynAxeID+9, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Blaze, "blazeManyullynAxe");
            copperManyullynAxe = new InfiToolAxe(PropsHelperInfiTools.manyullynAxeID+10, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Copper, "copperManyullynAxe");
            bronzeManyullynAxe = new InfiToolAxe(PropsHelperInfiTools.manyullynAxeID+11, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Bronze, "bronzeManyullynAxe");
            workedManyullynAxe = new InfiToolAxe(PropsHelperInfiTools.manyullynAxeID+12, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.WorkedIron, "workedManyullynAxe");
            steelManyullynAxe = new InfiToolAxe(PropsHelperInfiTools.manyullynAxeID+13, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Steel, "steelManyullynAxe");
            cobaltManyullynAxe = new InfiToolAxe(PropsHelperInfiTools.manyullynAxeID+14, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Cobalt, "cobaltManyullynAxe");
            arditeManyullynAxe = new InfiToolAxe(PropsHelperInfiTools.manyullynAxeID+15, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Ardite, "arditeManyullynAxe");
            manyullynManyullynAxe = new InfiToolAxe(PropsHelperInfiTools.manyullynAxeID+16, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Manyullyn, "arditeManyullynAxe");
            uraniumManyullynAxe = new InfiToolAxe(PropsHelperInfiTools.manyullynAxeID+17,
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Bronze, "uraniumManyullynAxe");
            
            MinecraftForge.setToolClass(woodManyullynAxe, "axe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(stoneManyullynAxe, "axe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(ironManyullynAxe, "axe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(diamondManyullynAxe, "axe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(redstoneManyullynAxe, "axe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(obsidianManyullynAxe, "axe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(boneManyullynAxe, "axe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(slimeManyullynAxe, "axe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(cactusManyullynAxe, "axe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(blazeManyullynAxe, "axe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(copperManyullynAxe, "axe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(bronzeManyullynAxe, "axe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(workedManyullynAxe, "axe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(steelManyullynAxe, "axe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(cobaltManyullynAxe, "axe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(arditeManyullynAxe, "axe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(manyullynManyullynAxe, "axe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(uraniumManyullynAxe, "axe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
        }
        
        if(PropsHelperInfiTools.enableUraniumTools)
        {
            diamondUraniumAxe = new InfiToolAxe(PropsHelperInfiTools.uraniumAxeID+0, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Diamond, "diamondUraniumAxe");
            redstoneUraniumAxe = new InfiToolAxe(PropsHelperInfiTools.uraniumAxeID+1, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Redstone, "redstoneUraniumAxe");
            boneUraniumAxe = new InfiToolAxe(PropsHelperInfiTools.uraniumAxeID+2, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Bone, "boneUraniumAxe");
            netherrackUraniumAxe = new InfiToolAxe(PropsHelperInfiTools.uraniumAxeID+3, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Netherrack, "netherrackUraniumAxe");
            glowstoneUraniumAxe = new InfiToolAxe(PropsHelperInfiTools.uraniumAxeID+4, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Glowstone, "glowstoneUraniumAxe");
            lavaUraniumAxe = new InfiToolAxe(PropsHelperInfiTools.uraniumAxeID+5, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Lava, "lavaUraniumAxe");
            blazeUraniumAxe = new InfiToolAxe(PropsHelperInfiTools.uraniumAxeID+6, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Blaze, "blazeUraniumAxe");
            cobaltUraniumAxe = new InfiToolAxe(PropsHelperInfiTools.uraniumAxeID+7, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Cobalt, "cobaltUraniumAxe");
            arditeUraniumAxe = new InfiToolAxe(PropsHelperInfiTools.uraniumAxeID+8, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Ardite, "arditeUraniumAxe");
            uraniumUraniumAxe = new InfiToolAxe(PropsHelperInfiTools.uraniumAxeID+9, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Uranium, "uraniumUraniumAxe");
            
            MinecraftForge.setToolClass(diamondUraniumAxe, "axe", InfiMaterialEnum.Uranium.getHarvestLevel());
            MinecraftForge.setToolClass(redstoneUraniumAxe, "axe", InfiMaterialEnum.Uranium.getHarvestLevel());
            MinecraftForge.setToolClass(boneUraniumAxe, "axe", InfiMaterialEnum.Uranium.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackUraniumAxe, "axe", InfiMaterialEnum.Uranium.getHarvestLevel());
            MinecraftForge.setToolClass(glowstoneUraniumAxe, "axe", InfiMaterialEnum.Uranium.getHarvestLevel());
            MinecraftForge.setToolClass(lavaUraniumAxe, "axe", InfiMaterialEnum.Uranium.getHarvestLevel());
            MinecraftForge.setToolClass(blazeUraniumAxe, "axe", InfiMaterialEnum.Uranium.getHarvestLevel());
            MinecraftForge.setToolClass(cobaltUraniumAxe, "axe", InfiMaterialEnum.Uranium.getHarvestLevel());
            MinecraftForge.setToolClass(arditeUraniumAxe, "axe", InfiMaterialEnum.Uranium.getHarvestLevel());
            MinecraftForge.setToolClass(uraniumUraniumAxe, "axe", InfiMaterialEnum.Uranium.getHarvestLevel());
        }
    }
    
    private static void addNames()
    {
    	ModLoader.addName(woodWoodAxe, "Wood Axe");
    	ModLoader.addName(stoneStoneAxe, "Heavy Axe");
    	ModLoader.addName(ironIronAxe, "Ironic Axe");
    	ModLoader.addName(diamondDiamondAxe, "Diamondium Axe");
    	ModLoader.addName(redstoneRedstoneAxe, "Redredred Axe");
    	ModLoader.addName(obsidianObsidianAxe, "Ebony Axe");
    	ModLoader.addName(sandstoneSandstoneAxe, "Fragile Axe");
    	ModLoader.addName(boneBoneAxe, "Necrotic Axe");
    	ModLoader.addName(paperPaperAxe, "Soft Axe");
    	ModLoader.addName(mossyMossyAxe, "Living Axe");
    	ModLoader.addName(netherrackNetherrackAxe, "Blood Pick");
    	ModLoader.addName(glowstoneGlowstoneAxe, "Bright Axe");
    	ModLoader.addName(iceIceAxe, "Freezing Axe");
    	ModLoader.addName(lavaLavaAxe, "Burning Axe");
    	ModLoader.addName(slimeSlimeAxe, "Toy Axe");
    	ModLoader.addName(cactusCactusAxe, "Thorned Axe");
    	ModLoader.addName(flintFlintAxe, "Rough-hewn Axe");
    	ModLoader.addName(blazeBlazeAxe, "Netherite Axe");
        ModLoader.addName(copperCopperAxe, "Orange-Tang Axe");
        ModLoader.addName(bronzeBronzeAxe, "Polished Axe");
        ModLoader.addName(workedWorkedIronAxe, "Reworked Iron Axe");
        ModLoader.addName(steelSteelAxe, "Forge-Wrought Axe");
        ModLoader.addName(cobaltCobaltAxe, "Beautiful Axe");
        ModLoader.addName(arditeArditeAxe, "Rustic StoneDigger");
        ModLoader.addName(manyullynManyullynAxe, "False-Prophetic Axe");
        ModLoader.addName(uraniumUraniumAxe, "Cancerous Axe");
    }
    
    public static void registerInfiToolsRecipes()
    {
    	if(PropsHelperInfiTools.enableWoodTools)
        {
            ModLoader.addRecipe(new ItemStack(woodWoodAxe), new Object[] 
                    { recipe, '#', Block.planks, '|', Item.stick });
            ModLoader.addRecipe(new ItemStack(sandstoneWoodAxe), new Object[] 
                    { recipe, '#', Block.planks, '|', mod_InfiBase.sandstoneRod });
            ModLoader.addRecipe(new ItemStack(boneWoodAxe), new Object[] 
                    { recipe, '#', Block.planks, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneWoodAxe), new Object[] 
                    { recipe, '#', Block.planks, '|', mod_InfiBase.boneRod });
            ModLoader.addRecipe(new ItemStack(paperWoodAxe), new Object[] 
                    { recipe, '#', Block.planks, '|', mod_InfiBase.paperRod });
            ModLoader.addRecipe(new ItemStack(iceWoodAxe), new Object[] 
                    { recipe, '#', Block.planks, '|', mod_InfiBase.iceRod });
            ModLoader.addRecipe(new ItemStack(slimeWoodAxe), new Object[] 
                    { recipe, '#', Block.planks, '|', mod_InfiBase.slimeRod });
            ModLoader.addRecipe(new ItemStack(cactusWoodAxe), new Object[] 
                    { recipe, '#', Block.planks, '|', mod_InfiBase.cactusRod });
        }
    	
        if(PropsHelperInfiTools.enableStoneTools)
        {
        	ModLoader.addRecipe(new ItemStack(woodStoneAxe), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', Item.stick });
        	ModLoader.addRecipe(new ItemStack(stoneStoneAxe), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', mod_InfiBase.stoneRod });
            ModLoader.addRecipe(new ItemStack(sandstoneStoneAxe), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', mod_InfiBase.sandstoneRod });
            ModLoader.addRecipe(new ItemStack(boneStoneAxe), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneStoneAxe), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', mod_InfiBase.boneRod });
            ModLoader.addRecipe(new ItemStack(netherrackStoneAxe), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', mod_InfiBase.netherrackRod });
            ModLoader.addRecipe(new ItemStack(iceStoneAxe), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', mod_InfiBase.iceRod });
            ModLoader.addRecipe(new ItemStack(slimeStoneAxe), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', mod_InfiBase.slimeRod });
            ModLoader.addRecipe(new ItemStack(cactusStoneAxe), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', mod_InfiBase.cactusRod });
            ModLoader.addRecipe(new ItemStack(flintStoneAxe), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', mod_InfiBase.flintRod });
            
            ModLoader.addRecipe(new ItemStack(woodStoneAxe), new Object[] 
                    { recipe, '#', Block.stone, '|', Item.stick });
        	ModLoader.addRecipe(new ItemStack(stoneStoneAxe), new Object[] 
                    { recipe, '#', Block.stone, '|', mod_InfiBase.stoneRod });
            ModLoader.addRecipe(new ItemStack(sandstoneStoneAxe), new Object[] 
                    { recipe, '#', Block.stone, '|', mod_InfiBase.sandstoneRod });
            ModLoader.addRecipe(new ItemStack(boneStoneAxe), new Object[] 
                    { recipe, '#', Block.stone, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneStoneAxe), new Object[] 
                    { recipe, '#', Block.stone, '|', mod_InfiBase.boneRod });
            ModLoader.addRecipe(new ItemStack(netherrackStoneAxe), new Object[] 
                    { recipe, '#', Block.stone, '|', mod_InfiBase.netherrackRod });
            ModLoader.addRecipe(new ItemStack(iceStoneAxe), new Object[] 
                    { recipe, '#', Block.stone, '|', mod_InfiBase.iceRod });
            ModLoader.addRecipe(new ItemStack(slimeStoneAxe), new Object[] 
                    { recipe, '#', Block.stone, '|', mod_InfiBase.slimeRod });
            ModLoader.addRecipe(new ItemStack(cactusStoneAxe), new Object[] 
                    { recipe, '#', Block.stone, '|', mod_InfiBase.cactusRod });
            ModLoader.addRecipe(new ItemStack(flintStoneAxe), new Object[] 
                    { recipe, '#', Block.stone, '|', mod_InfiBase.flintRod });
        }
        
        if(PropsHelperInfiTools.enableIronTools)
        {
        	ModLoader.addRecipe(new ItemStack(woodIronAxe), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', Item.stick });
        	ModLoader.addRecipe(new ItemStack(stoneIronAxe), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', mod_InfiBase.stoneRod });
            ModLoader.addRecipe(new ItemStack(ironIronAxe), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', mod_InfiBase.ironRod });
            ModLoader.addRecipe(new ItemStack(boneIronAxe), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneIronAxe), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', mod_InfiBase.boneRod });
            ModLoader.addRecipe(new ItemStack(netherrackIronAxe), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', mod_InfiBase.netherrackRod });
            ModLoader.addRecipe(new ItemStack(glowstoneIronAxe), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', mod_InfiBase.glowstoneRod });
            ModLoader.addRecipe(new ItemStack(cactusIronAxe), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', mod_InfiBase.cactusRod });
            ModLoader.addRecipe(new ItemStack(copperIronAxe), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', mod_InfiBase.copperRod });
            ModLoader.addRecipe(new ItemStack(bronzeIronAxe), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', mod_InfiBase.bronzeRod });
        }
        
        if(PropsHelperInfiTools.enableDiamondTools)
        {
        	ModLoader.addRecipe(new ItemStack(woodDiamondAxe), new Object[] 
                    { recipe, '#', Item.diamond, '|', Item.stick });
        	ModLoader.addRecipe(new ItemStack(stoneDiamondAxe), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.stoneRod });
            ModLoader.addRecipe(new ItemStack(ironDiamondAxe), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.ironRod });
            ModLoader.addRecipe(new ItemStack(diamondDiamondAxe), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.diamondRod });
            ModLoader.addRecipe(new ItemStack(redstoneDiamondAxe), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.redstoneRod });
            ModLoader.addRecipe(new ItemStack(obsidianDiamondAxe), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.obsidianRod });
            ModLoader.addRecipe(new ItemStack(boneDiamondAxe), new Object[] 
                    { recipe, '#', Item.diamond, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneDiamondAxe), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.boneRod });
            ModLoader.addRecipe(new ItemStack(mossyDiamondAxe), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.mossyRod });
            ModLoader.addRecipe(new ItemStack(netherrackDiamondAxe), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.netherrackRod });
            ModLoader.addRecipe(new ItemStack(glowstoneDiamondAxe), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.glowstoneRod });
            ModLoader.addRecipe(new ItemStack(lavaDiamondAxe), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.lavaRod });
            ModLoader.addRecipe(new ItemStack(cactusDiamondAxe), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.cactusRod });
            ModLoader.addRecipe(new ItemStack(flintDiamondAxe), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.flintRod });
            ModLoader.addRecipe(new ItemStack(blazeDiamondAxe), new Object[] 
                    { recipe, '#', Item.diamond, '|', Item.blazeRod });
            ModLoader.addRecipe(new ItemStack(copperDiamondAxe), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.copperRod });
            ModLoader.addRecipe(new ItemStack(bronzeDiamondAxe), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.bronzeRod });
            ModLoader.addRecipe(new ItemStack(workedDiamondAxe), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.workedIronRod });
            ModLoader.addRecipe(new ItemStack(steelDiamondAxe), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.steelRod });
            ModLoader.addRecipe(new ItemStack(cobaltDiamondAxe), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.cobaltRod });
            ModLoader.addRecipe(new ItemStack(arditeDiamondAxe), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.arditeRod });
            ModLoader.addRecipe(new ItemStack(manyullynDiamondAxe), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.manyullynRod });
            ModLoader.addRecipe(new ItemStack(uraniumDiamondAxe), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.uraniumRod });
        }
        
        if(PropsHelperInfiTools.enableRedstoneTools)
        {
        	ModLoader.addRecipe(new ItemStack(woodRedstoneAxe), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', Item.stick });
        	ModLoader.addRecipe(new ItemStack(stoneRedstoneAxe), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.stoneRod });
            ModLoader.addRecipe(new ItemStack(ironRedstoneAxe), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.ironRod });
            ModLoader.addRecipe(new ItemStack(redstoneRedstoneAxe), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.redstoneRod });
            ModLoader.addRecipe(new ItemStack(obsidianRedstoneAxe), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.obsidianRod });
            ModLoader.addRecipe(new ItemStack(sandstoneRedstoneAxe), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.sandstoneRod });
            ModLoader.addRecipe(new ItemStack(boneRedstoneAxe), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneRedstoneAxe), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.boneRod });
            ModLoader.addRecipe(new ItemStack(paperRedstoneAxe), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.paperRod });
            ModLoader.addRecipe(new ItemStack(mossyRedstoneAxe), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.mossyRod });
            ModLoader.addRecipe(new ItemStack(netherrackRedstoneAxe), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.netherrackRod });
            ModLoader.addRecipe(new ItemStack(glowstoneRedstoneAxe), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.glowstoneRod });
            ModLoader.addRecipe(new ItemStack(iceRedstoneAxe), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.iceRod });
            ModLoader.addRecipe(new ItemStack(lavaRedstoneAxe), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.lavaRod });
            ModLoader.addRecipe(new ItemStack(slimeRedstoneAxe), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.slimeRod });
            ModLoader.addRecipe(new ItemStack(cactusRedstoneAxe), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.cactusRod });
            ModLoader.addRecipe(new ItemStack(flintRedstoneAxe), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.flintRod });
            ModLoader.addRecipe(new ItemStack(copperRedstoneAxe), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.copperRod });
            ModLoader.addRecipe(new ItemStack(bronzeRedstoneAxe), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.bronzeRod });
            ModLoader.addRecipe(new ItemStack(workedRedstoneAxe), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.workedIronRod });
            ModLoader.addRecipe(new ItemStack(uraniumRedstoneAxe), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.uraniumRod });
        }
        
        if(PropsHelperInfiTools.enableObsidianTools)
        {
        	ModLoader.addRecipe(new ItemStack(woodObsidianAxe), new Object[] 
                    { recipe, '#', Block.obsidian, '|', Item.stick });
        	ModLoader.addRecipe(new ItemStack(stoneObsidianAxe), new Object[] 
                    { recipe, '#', Block.obsidian, '|', mod_InfiBase.stoneRod });
            ModLoader.addRecipe(new ItemStack(redstoneObsidianAxe), new Object[] 
                    { recipe, '#', Block.obsidian, '|', mod_InfiBase.redstoneRod });
            ModLoader.addRecipe(new ItemStack(obsidianObsidianAxe), new Object[] 
                    { recipe, '#', Block.obsidian, '|', mod_InfiBase.obsidianRod });
            ModLoader.addRecipe(new ItemStack(boneObsidianAxe), new Object[] 
                    { recipe, '#', Block.obsidian, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneObsidianAxe), new Object[] 
                    { recipe, '#', Block.obsidian, '|', mod_InfiBase.boneRod });
            ModLoader.addRecipe(new ItemStack(netherrackObsidianAxe), new Object[] 
                    { recipe, '#', Block.obsidian, '|', mod_InfiBase.netherrackRod });
            ModLoader.addRecipe(new ItemStack(glowstoneObsidianAxe), new Object[] 
                    { recipe, '#', Block.obsidian, '|', mod_InfiBase.glowstoneRod });
            ModLoader.addRecipe(new ItemStack(iceObsidianAxe), new Object[] 
                    { recipe, '#', Block.obsidian, '|', mod_InfiBase.iceRod });
            ModLoader.addRecipe(new ItemStack(lavaObsidianAxe), new Object[] 
                    { recipe, '#', Block.obsidian, '|', mod_InfiBase.lavaRod });
            ModLoader.addRecipe(new ItemStack(cactusObsidianAxe), new Object[] 
                    { recipe, '#', Block.obsidian, '|', mod_InfiBase.cactusRod });
        }
        
        if(PropsHelperInfiTools.enableSandstoneTools)
        {
            ModLoader.addRecipe(new ItemStack(woodSandstoneAxe), new Object[] 
                    { recipe, '#', Block.sandStone, '|', Item.stick });
            ModLoader.addRecipe(new ItemStack(sandstoneSandstoneAxe), new Object[] 
                    { recipe, '#', Block.sandStone, '|', mod_InfiBase.sandstoneRod });
            ModLoader.addRecipe(new ItemStack(boneSandstoneAxe), new Object[] 
                    { recipe, '#', Block.sandStone, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneSandstoneAxe), new Object[] 
                    { recipe, '#', Block.sandStone, '|', mod_InfiBase.boneRod });      
            ModLoader.addRecipe(new ItemStack(netherrackSandstoneAxe), new Object[] 
                    { recipe, '#', Block.sandStone, '|', mod_InfiBase.netherrackRod });
            ModLoader.addRecipe(new ItemStack(iceSandstoneAxe), new Object[] 
                    { recipe, '#', Block.sandStone, '|', mod_InfiBase.iceRod });
            ModLoader.addRecipe(new ItemStack(slimeSandstoneAxe), new Object[] 
                    { recipe, '#', Block.sandStone, '|', mod_InfiBase.slimeRod });
            ModLoader.addRecipe(new ItemStack(cactusSandstoneAxe), new Object[] 
                    { recipe, '#', Block.sandStone, '|', mod_InfiBase.cactusRod });
            ModLoader.addRecipe(new ItemStack(flintSandstoneAxe), new Object[] 
                    { recipe, '#', Block.sandStone, '|', mod_InfiBase.flintRod });
        }
        
        if(PropsHelperInfiTools.enableBoneTools)
        {
            ModLoader.addRecipe(new ItemStack(woodBoneAxe), new Object[] 
                    { recipe, '#', Item.bone, '|', Item.stick });
            ModLoader.addRecipe(new ItemStack(stoneBoneAxe), new Object[] 
                    { recipe, '#', Item.bone, '|', mod_InfiBase.stoneRod });
            ModLoader.addRecipe(new ItemStack(sandstoneBoneAxe), new Object[] 
                    { recipe, '#', Item.bone, '|', mod_InfiBase.sandstoneRod });
            ModLoader.addRecipe(new ItemStack(boneBoneAxe), new Object[] 
                    { recipe, '#', Item.bone, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneBoneAxe), new Object[] 
                    { recipe, '#', Item.bone, '|', mod_InfiBase.boneRod });
            ModLoader.addRecipe(new ItemStack(paperBoneAxe), new Object[] 
                    { recipe, '#', Item.bone, '|', mod_InfiBase.paperRod });
            ModLoader.addRecipe(new ItemStack(netherrackBoneAxe), new Object[] 
                    { recipe, '#', Item.bone, '|', mod_InfiBase.netherrackRod });
            ModLoader.addRecipe(new ItemStack(iceBoneAxe), new Object[] 
                    { recipe, '#', Item.bone, '|', mod_InfiBase.iceRod });
            ModLoader.addRecipe(new ItemStack(cactusBoneAxe), new Object[] 
                    { recipe, '#', Item.bone, '|', mod_InfiBase.cactusRod });
            ModLoader.addRecipe(new ItemStack(flintBoneAxe), new Object[] 
                    { recipe, '#', Item.bone, '|', mod_InfiBase.flintRod });
        }
        
        if(PropsHelperInfiTools.enablePaperTools)
        {
            ModLoader.addRecipe(new ItemStack(woodPaperAxe), new Object[] 
                    { recipe, '#', mod_InfiBase.paperStack, '|', Item.stick });
            ModLoader.addRecipe(new ItemStack(bonePaperAxe), new Object[] 
                    { recipe, '#', mod_InfiBase.paperStack, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(bonePaperAxe), new Object[] 
                    { recipe, '#', mod_InfiBase.paperStack, '|', mod_InfiBase.boneRod });
            ModLoader.addRecipe(new ItemStack(paperPaperAxe), new Object[] 
                    { recipe, '#', mod_InfiBase.paperStack, '|', mod_InfiBase.paperRod });
            ModLoader.addRecipe(new ItemStack(slimePaperAxe), new Object[] 
                    { recipe, '#', mod_InfiBase.paperStack, '|', mod_InfiBase.slimeRod });
            ModLoader.addRecipe(new ItemStack(cactusPaperAxe), new Object[] 
                    { recipe, '#', mod_InfiBase.paperStack, '|', mod_InfiBase.cactusRod });
        }
        
        if(PropsHelperInfiTools.enableMossyTools)
        {
        	ModLoader.addRecipe(new ItemStack(woodMossyAxe), new Object[] 
                    { recipe, '#', mod_InfiBase.mossyStone, '|', Item.stick });
        	ModLoader.addRecipe(new ItemStack(stoneMossyAxe), new Object[] 
                    { recipe, '#', mod_InfiBase.mossyStone, '|', mod_InfiBase.stoneRod });
            ModLoader.addRecipe(new ItemStack(diamondMossyAxe), new Object[] 
                    { recipe, '#', mod_InfiBase.mossyStone, '|', mod_InfiBase.diamondRod });
            ModLoader.addRecipe(new ItemStack(redstoneMossyAxe), new Object[] 
                    { recipe, '#', mod_InfiBase.mossyStone, '|', mod_InfiBase.redstoneRod });
            ModLoader.addRecipe(new ItemStack(boneMossyAxe), new Object[] 
                    { recipe, '#', mod_InfiBase.mossyStone, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneMossyAxe), new Object[] 
                    { recipe, '#', mod_InfiBase.mossyStone, '|', mod_InfiBase.boneRod });
            ModLoader.addRecipe(new ItemStack(mossyMossyAxe), new Object[] 
                    { recipe, '#', mod_InfiBase.mossyStone, '|', mod_InfiBase.mossyRod });
            ModLoader.addRecipe(new ItemStack(netherrackMossyAxe), new Object[] 
                    { recipe, '#', mod_InfiBase.mossyStone, '|', mod_InfiBase.netherrackRod });
            ModLoader.addRecipe(new ItemStack(glowstoneMossyAxe), new Object[] 
                    { recipe, '#', mod_InfiBase.mossyStone, '|', mod_InfiBase.glowstoneRod });
            ModLoader.addRecipe(new ItemStack(cactusMossyAxe), new Object[] 
                    { recipe, '#', mod_InfiBase.mossyStone, '|', mod_InfiBase.cactusRod });
            ModLoader.addRecipe(new ItemStack(blazeMossyAxe), new Object[] 
                    { recipe, '#', mod_InfiBase.mossyStone, '|', Item.blazeRod });
            ModLoader.addRecipe(new ItemStack(manyullynMossyAxe), new Object[] 
                    { recipe, '#', mod_InfiBase.mossyStone, '|', mod_InfiBase.manyullynRod });
            ModLoader.addRecipe(new ItemStack(uraniumMossyAxe), new Object[] 
                    { recipe, '#', mod_InfiBase.mossyStone, '|', mod_InfiBase.uraniumRod });
        }
        
        if(PropsHelperInfiTools.enableNetherrackTools)
        {
        	ModLoader.addRecipe(new ItemStack(woodNetherrackAxe), new Object[] 
                    { recipe, '#', Block.netherrack, '|', Item.stick });
        	ModLoader.addRecipe(new ItemStack(stoneNetherrackAxe), new Object[] 
                    { recipe, '#', Block.netherrack, '|', mod_InfiBase.stoneRod });
            ModLoader.addRecipe(new ItemStack(sandstoneNetherrackAxe), new Object[] 
                    { recipe, '#', Block.netherrack, '|', mod_InfiBase.sandstoneRod });
            ModLoader.addRecipe(new ItemStack(boneNetherrackAxe), new Object[] 
                    { recipe, '#', Block.netherrack, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneNetherrackAxe), new Object[] 
                    { recipe, '#', Block.netherrack, '|', mod_InfiBase.boneRod });
            ModLoader.addRecipe(new ItemStack(paperNetherrackAxe), new Object[] 
                    { recipe, '#', Block.netherrack, '|', mod_InfiBase.paperRod });
            ModLoader.addRecipe(new ItemStack(mossyNetherrackAxe), new Object[] 
                    { recipe, '#', Block.netherrack, '|', mod_InfiBase.mossyRod });
            ModLoader.addRecipe(new ItemStack(netherrackNetherrackAxe), new Object[] 
                    { recipe, '#', Block.netherrack, '|', mod_InfiBase.netherrackRod });
            ModLoader.addRecipe(new ItemStack(iceNetherrackAxe), new Object[] 
                    { recipe, '#', Block.netherrack, '|', mod_InfiBase.iceRod });
            ModLoader.addRecipe(new ItemStack(slimeNetherrackAxe), new Object[] 
                    { recipe, '#', Block.netherrack, '|', mod_InfiBase.slimeRod });
            ModLoader.addRecipe(new ItemStack(cactusNetherrackAxe), new Object[] 
                    { recipe, '#', Block.netherrack, '|', mod_InfiBase.cactusRod });
            ModLoader.addRecipe(new ItemStack(flintNetherrackAxe), new Object[] 
                    { recipe, '#', Block.netherrack, '|', mod_InfiBase.flintRod });
            ModLoader.addRecipe(new ItemStack(copperNetherrackAxe), new Object[] 
                    { recipe, '#', Block.netherrack, '|', mod_InfiBase.copperRod });
            ModLoader.addRecipe(new ItemStack(bronzeNetherrackAxe), new Object[] 
                    { recipe, '#', Block.netherrack, '|', mod_InfiBase.bronzeRod });
        }
        
        if(PropsHelperInfiTools.enableGlowstoneTools)
        {
        	ModLoader.addRecipe(new ItemStack(woodGlowstoneAxe), new Object[] 
                    { recipe, '#', mod_InfiBase.glowstoneCrystal, '|', Item.stick });
        	ModLoader.addRecipe(new ItemStack(redstoneGlowstoneAxe), new Object[] 
                    { recipe, '#', mod_InfiBase.glowstoneCrystal, '|', mod_InfiBase.glowstoneRod });
        	ModLoader.addRecipe(new ItemStack(obsidianGlowstoneAxe), new Object[] 
                    { recipe, '#', mod_InfiBase.glowstoneCrystal, '|', mod_InfiBase.obsidianRod });
            ModLoader.addRecipe(new ItemStack(boneGlowstoneAxe), new Object[] 
                    { recipe, '#', mod_InfiBase.glowstoneCrystal, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneGlowstoneAxe), new Object[] 
                    { recipe, '#', mod_InfiBase.glowstoneCrystal, '|', mod_InfiBase.boneRod });
            ModLoader.addRecipe(new ItemStack(netherrackGlowstoneAxe), new Object[] 
                    { recipe, '#', mod_InfiBase.glowstoneCrystal, '|', mod_InfiBase.netherrackRod });
            ModLoader.addRecipe(new ItemStack(iceGlowstoneAxe), new Object[] 
                    { recipe, '#', mod_InfiBase.glowstoneCrystal, '|', mod_InfiBase.iceRod });
            ModLoader.addRecipe(new ItemStack(slimeGlowstoneAxe), new Object[] 
                    { recipe, '#', mod_InfiBase.glowstoneCrystal, '|', mod_InfiBase.slimeRod });
            ModLoader.addRecipe(new ItemStack(cactusGlowstoneAxe), new Object[] 
                    { recipe, '#', mod_InfiBase.glowstoneCrystal, '|', mod_InfiBase.cactusRod });
        }
        
        if(PropsHelperInfiTools.enableIceTools)
        {
            ModLoader.addRecipe(new ItemStack(woodIceAxe), new Object[] 
                    { recipe, '#', Block.ice, '|', Item.stick });
            ModLoader.addRecipe(new ItemStack(boneIceAxe), new Object[] 
                    { recipe, '#', Block.ice, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneIceAxe), new Object[] 
                    { recipe, '#', Block.ice, '|', mod_InfiBase.boneRod });
            ModLoader.addRecipe(new ItemStack(paperIceAxe), new Object[] 
                    { recipe, '#', Block.ice, '|', mod_InfiBase.paperRod });
            ModLoader.addRecipe(new ItemStack(iceIceAxe), new Object[] 
                    { recipe, '#', Block.ice, '|', mod_InfiBase.iceRod });
            ModLoader.addRecipe(new ItemStack(slimeIceAxe), new Object[] 
                    { recipe, '#', Block.ice, '|', mod_InfiBase.slimeRod });
            ModLoader.addRecipe(new ItemStack(cactusIceAxe), new Object[] 
                    { recipe, '#', Block.ice, '|', mod_InfiBase.cactusRod });
        }
        
        if(PropsHelperInfiTools.enableLavaTools)
        {
            ModLoader.addRecipe(new ItemStack(diamondLavaAxe), new Object[] 
                    { recipe, '#', mod_InfiBase.lavaCrystal, '|', mod_InfiBase.diamondRod });
            ModLoader.addRecipe(new ItemStack(obsidianLavaAxe), new Object[] 
                    { recipe, '#', mod_InfiBase.lavaCrystal, '|', mod_InfiBase.obsidianRod });
            ModLoader.addRecipe(new ItemStack(netherrackLavaAxe), new Object[] 
                    { recipe, '#', mod_InfiBase.lavaCrystal, '|', mod_InfiBase.netherrackRod });
            ModLoader.addRecipe(new ItemStack(lavaLavaAxe), new Object[] 
                    { recipe, '#', mod_InfiBase.lavaCrystal, '|', mod_InfiBase.lavaRod });
            ModLoader.addRecipe(new ItemStack(flintLavaAxe), new Object[] 
                    { recipe, '#', mod_InfiBase.lavaCrystal, '|', mod_InfiBase.flintRod });
            ModLoader.addRecipe(new ItemStack(blazeLavaAxe), new Object[] 
                    { recipe, '#', mod_InfiBase.lavaCrystal, '|', Item.blazeRod });
            ModLoader.addRecipe(new ItemStack(manyullynLavaAxe), new Object[] 
                    { recipe, '#', mod_InfiBase.lavaCrystal, '|', mod_InfiBase.manyullynRod });
            ModLoader.addRecipe(new ItemStack(uraniumLavaAxe), new Object[] 
                    { recipe, '#', mod_InfiBase.lavaCrystal, '|', mod_InfiBase.uraniumRod });
        }
        
        if(PropsHelperInfiTools.enableSlimeTools)
        {
            ModLoader.addRecipe(new ItemStack(woodSlimeAxe), new Object[] 
                    { recipe, '#', mod_InfiBase.slimeCrystal, '|', Item.stick });
            ModLoader.addRecipe(new ItemStack(sandstoneSlimeAxe), new Object[] 
                    { recipe, '#', mod_InfiBase.slimeCrystal, '|', mod_InfiBase.sandstoneRod });
            ModLoader.addRecipe(new ItemStack(boneSlimeAxe), new Object[] 
                    { recipe, '#', mod_InfiBase.slimeCrystal, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneSlimeAxe), new Object[] 
                    { recipe, '#', mod_InfiBase.slimeCrystal, '|', mod_InfiBase.boneRod });
            ModLoader.addRecipe(new ItemStack(paperSlimeAxe), new Object[] 
                    { recipe, '#', mod_InfiBase.slimeCrystal, '|', mod_InfiBase.paperRod });
            ModLoader.addRecipe(new ItemStack(slimeSlimeAxe), new Object[] 
                    { recipe, '#', mod_InfiBase.slimeCrystal, '|', mod_InfiBase.slimeRod });
            ModLoader.addRecipe(new ItemStack(cactusSlimeAxe), new Object[] 
                    { recipe, '#', mod_InfiBase.slimeCrystal, '|', mod_InfiBase.cactusRod });
        }
        
        if(PropsHelperInfiTools.enableCactusTools)
        {
            ModLoader.addRecipe(new ItemStack(woodCactusAxe), new Object[] 
                    { recipe, '#', Block.cactus, '|', Item.stick });
            ModLoader.addRecipe(new ItemStack(sandstoneCactusAxe), new Object[] 
                    { recipe, '#', Block.cactus, '|', mod_InfiBase.sandstoneRod });
            ModLoader.addRecipe(new ItemStack(boneCactusAxe), new Object[] 
                    { recipe, '#', Block.cactus, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneCactusAxe), new Object[] 
                    { recipe, '#', Block.cactus, '|', mod_InfiBase.boneRod });
            ModLoader.addRecipe(new ItemStack(netherrackCactusAxe), new Object[] 
                    { recipe, '#', Block.cactus, '|', mod_InfiBase.netherrackRod });
            ModLoader.addRecipe(new ItemStack(iceCactusAxe), new Object[] 
                    { recipe, '#', Block.cactus, '|', mod_InfiBase.iceRod });
            ModLoader.addRecipe(new ItemStack(slimeCactusAxe), new Object[] 
                    { recipe, '#', Block.cactus, '|', mod_InfiBase.slimeRod });
            ModLoader.addRecipe(new ItemStack(cactusCactusAxe), new Object[] 
                    { recipe, '#', Block.cactus, '|', mod_InfiBase.cactusRod });
        }
        
        if(PropsHelperInfiTools.enableFlintTools)
        {
        	ModLoader.addRecipe(new ItemStack(woodFlintAxe), new Object[] 
                    { recipe, '#', Item.flint, '|', Item.stick });
        	ModLoader.addRecipe(new ItemStack(stoneFlintAxe), new Object[] 
                    { recipe, '#', Item.flint, '|', mod_InfiBase.stoneRod });
            ModLoader.addRecipe(new ItemStack(sandstoneFlintAxe), new Object[] 
                    { recipe, '#', Item.flint, '|', mod_InfiBase.sandstoneRod });
            ModLoader.addRecipe(new ItemStack(boneFlintAxe), new Object[] 
                    { recipe, '#', Item.flint, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneFlintAxe), new Object[] 
                    { recipe, '#', Item.flint, '|', mod_InfiBase.boneRod });
            ModLoader.addRecipe(new ItemStack(netherrackFlintAxe), new Object[] 
                    { recipe, '#', Item.flint, '|', mod_InfiBase.netherrackRod });
            ModLoader.addRecipe(new ItemStack(slimeFlintAxe), new Object[] 
                    { recipe, '#', Item.flint, '|', mod_InfiBase.slimeRod });
            ModLoader.addRecipe(new ItemStack(cactusFlintAxe), new Object[] 
                    { recipe, '#', Item.flint, '|', mod_InfiBase.cactusRod });
            ModLoader.addRecipe(new ItemStack(flintFlintAxe), new Object[] 
                    { recipe, '#', Item.flint, '|', mod_InfiBase.flintRod });
            ModLoader.addRecipe(new ItemStack(copperFlintAxe), new Object[] 
                    { recipe, '#', Block.netherrack, '|', mod_InfiBase.copperRod });
            ModLoader.addRecipe(new ItemStack(bronzeFlintAxe), new Object[] 
                    { recipe, '#', Block.netherrack, '|', mod_InfiBase.bronzeRod });
        }
        
        if(PropsHelperInfiTools.enableBlazeTools)
        {
            ModLoader.addRecipe(new ItemStack(diamondBlazeAxe), new Object[] 
                    { recipe, '#', mod_InfiBase.blazeCrystal, '|', mod_InfiBase.diamondRod });
            ModLoader.addRecipe(new ItemStack(obsidianBlazeAxe), new Object[] 
                    { recipe, '#', mod_InfiBase.blazeCrystal, '|', mod_InfiBase.obsidianRod });
            ModLoader.addRecipe(new ItemStack(netherrackBlazeAxe), new Object[] 
                    { recipe, '#', mod_InfiBase.blazeCrystal, '|', mod_InfiBase.netherrackRod });
            ModLoader.addRecipe(new ItemStack(lavaBlazeAxe), new Object[] 
                    { recipe, '#', mod_InfiBase.blazeCrystal, '|', mod_InfiBase.lavaRod });
            ModLoader.addRecipe(new ItemStack(flintBlazeAxe), new Object[] 
                    { recipe, '#', mod_InfiBase.blazeCrystal, '|', mod_InfiBase.flintRod });
            ModLoader.addRecipe(new ItemStack(blazeBlazeAxe), new Object[] 
                    { recipe, '#', mod_InfiBase.blazeCrystal, '|', Item.blazeRod });
            ModLoader.addRecipe(new ItemStack(manyullynBlazeAxe), new Object[] 
                    { recipe, '#', mod_InfiBase.blazeCrystal, '|', mod_InfiBase.manyullynRod });
            ModLoader.addRecipe(new ItemStack(uraniumBlazeAxe), new Object[] 
                    { recipe, '#', mod_InfiBase.blazeCrystal, '|', mod_InfiBase.uraniumRod });
        }
    }
    
    public static void addStoneTools(ItemStack stack)
    {
    	ModLoader.addRecipe(new ItemStack(woodStoneAxe), new Object[] 
                { recipe, '#', stack, '|', Item.stick });
    	ModLoader.addRecipe(new ItemStack(stoneStoneAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.stoneRod });
        ModLoader.addRecipe(new ItemStack(sandstoneStoneAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.sandstoneRod });
        ModLoader.addRecipe(new ItemStack(boneStoneAxe), new Object[] 
                { recipe, '#', stack, '|', Item.bone });
        ModLoader.addRecipe(new ItemStack(boneStoneAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.boneRod });
        ModLoader.addRecipe(new ItemStack(netherrackStoneAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.netherrackRod });
        ModLoader.addRecipe(new ItemStack(iceStoneAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.iceRod });
        ModLoader.addRecipe(new ItemStack(slimeStoneAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.slimeRod });
        ModLoader.addRecipe(new ItemStack(cactusStoneAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.cactusRod });
        ModLoader.addRecipe(new ItemStack(flintStoneAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.flintRod });
    }
    
    public static void addCopperTools(ItemStack stack)
    {
    	ModLoader.addRecipe(new ItemStack(woodCopperAxe), new Object[] 
                { recipe, '#', stack, '|', Item.stick });
        ModLoader.addRecipe(new ItemStack(stoneCopperAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.stoneRod });
        ModLoader.addRecipe(new ItemStack(boneCopperAxe), new Object[] 
                { recipe, '#', stack, '|', Item.bone });
        ModLoader.addRecipe(new ItemStack(boneCopperAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.boneRod });
        ModLoader.addRecipe(new ItemStack(netherrackCopperAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.netherrackRod });
        ModLoader.addRecipe(new ItemStack(slimeCopperAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.slimeRod });
        ModLoader.addRecipe(new ItemStack(cactusCopperAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.cactusRod });
        ModLoader.addRecipe(new ItemStack(flintCopperAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.flintRod });
        ModLoader.addRecipe(new ItemStack(copperCopperAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.copperRod });
    }
    
    public static void addBronzeTools(ItemStack stack)
    {
    	ModLoader.addRecipe(new ItemStack(woodBronzeAxe), new Object[] 
                { recipe, '#', stack, '|', Item.stick });
        ModLoader.addRecipe(new ItemStack(stoneBronzeAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.stoneRod });
        ModLoader.addRecipe(new ItemStack(boneBronzeAxe), new Object[] 
                { recipe, '#', stack, '|', Item.bone });
        ModLoader.addRecipe(new ItemStack(boneBronzeAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.boneRod });
        ModLoader.addRecipe(new ItemStack(netherrackBronzeAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.netherrackRod });
        ModLoader.addRecipe(new ItemStack(slimeBronzeAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.slimeRod });
        ModLoader.addRecipe(new ItemStack(cactusBronzeAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.cactusRod });
        ModLoader.addRecipe(new ItemStack(flintBronzeAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.flintRod });
        ModLoader.addRecipe(new ItemStack(copperBronzeAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.copperRod });
        ModLoader.addRecipe(new ItemStack(bronzeBronzeAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.bronzeRod });
    }
    
    public static void addWorkedIronTools(ItemStack stack)
    {
    	ModLoader.addRecipe(new ItemStack(woodWorkedIronAxe), new Object[] 
                { recipe, '#', stack, '|', Item.stick });
        ModLoader.addRecipe(new ItemStack(stoneWorkedIronAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.stoneRod });
        ModLoader.addRecipe(new ItemStack(ironWorkedIronAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.ironRod });
        ModLoader.addRecipe(new ItemStack(diamondWorkedIronAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.diamondRod });
        ModLoader.addRecipe(new ItemStack(redstoneWorkedIronAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.redstoneRod });
        ModLoader.addRecipe(new ItemStack(obsidianWorkedIronAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.obsidianRod });
        ModLoader.addRecipe(new ItemStack(boneWorkedIronAxe), new Object[] 
                { recipe, '#', stack, '|', Item.bone });
        ModLoader.addRecipe(new ItemStack(boneWorkedIronAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.boneRod });
        ModLoader.addRecipe(new ItemStack(netherrackWorkedIronAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.netherrackRod });
        ModLoader.addRecipe(new ItemStack(glowstoneWorkedIronAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.glowstoneRod });
        ModLoader.addRecipe(new ItemStack(iceWorkedIronAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.iceRod });
        ModLoader.addRecipe(new ItemStack(slimeWorkedIronAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.slimeRod });
        ModLoader.addRecipe(new ItemStack(cactusWorkedIronAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.cactusRod });
        ModLoader.addRecipe(new ItemStack(blazeWorkedIronAxe), new Object[] 
                { recipe, '#', stack, '|', Item.blazeRod });
        ModLoader.addRecipe(new ItemStack(copperWorkedIronAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.copperRod });
        ModLoader.addRecipe(new ItemStack(bronzeWorkedIronAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.bronzeRod });
        ModLoader.addRecipe(new ItemStack(workedWorkedIronAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.workedIronRod });
        ModLoader.addRecipe(new ItemStack(steelWorkedIronAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.steelRod });
        ModLoader.addRecipe(new ItemStack(uraniumWorkedIronAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.uraniumRod });
    }
    
    public static void addSteelTools(ItemStack stack)
    {
    	ModLoader.addRecipe(new ItemStack(woodSteelAxe), new Object[] 
                { recipe, '#', stack, '|', Item.stick });
        ModLoader.addRecipe(new ItemStack(stoneSteelAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.stoneRod });
        ModLoader.addRecipe(new ItemStack(ironSteelAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.ironRod });
        ModLoader.addRecipe(new ItemStack(diamondSteelAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.diamondRod });
        ModLoader.addRecipe(new ItemStack(redstoneSteelAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.redstoneRod });
        ModLoader.addRecipe(new ItemStack(obsidianSteelAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.obsidianRod });
        ModLoader.addRecipe(new ItemStack(boneSteelAxe), new Object[] 
                { recipe, '#', stack, '|', Item.bone });
        ModLoader.addRecipe(new ItemStack(boneSteelAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.boneRod });
        ModLoader.addRecipe(new ItemStack(netherrackSteelAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.netherrackRod });
        ModLoader.addRecipe(new ItemStack(glowstoneSteelAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.glowstoneRod });
        ModLoader.addRecipe(new ItemStack(iceSteelAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.iceRod });
        ModLoader.addRecipe(new ItemStack(slimeSteelAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.slimeRod });
        ModLoader.addRecipe(new ItemStack(cactusSteelAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.cactusRod });
        ModLoader.addRecipe(new ItemStack(blazeSteelAxe), new Object[] 
                { recipe, '#', stack, '|', Item.blazeRod });
        ModLoader.addRecipe(new ItemStack(copperSteelAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.copperRod });
        ModLoader.addRecipe(new ItemStack(bronzeSteelAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.bronzeRod });
        ModLoader.addRecipe(new ItemStack(workedSteelAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.workedIronRod });
        ModLoader.addRecipe(new ItemStack(steelSteelAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.steelRod });
        ModLoader.addRecipe(new ItemStack(cobaltSteelAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.cobaltRod });
        ModLoader.addRecipe(new ItemStack(arditeSteelAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.arditeRod });
        ModLoader.addRecipe(new ItemStack(uraniumSteelAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.uraniumRod });
    }
    
    public static void addCobaltTools(ItemStack stack)
    {
    	ModLoader.addRecipe(new ItemStack(woodCobaltAxe), new Object[] 
                { recipe, '#', stack, '|', Item.stick });
        ModLoader.addRecipe(new ItemStack(stoneCobaltAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.stoneRod });
        ModLoader.addRecipe(new ItemStack(ironCobaltAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.ironRod });
        ModLoader.addRecipe(new ItemStack(diamondCobaltAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.diamondRod });
        ModLoader.addRecipe(new ItemStack(redstoneCobaltAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.redstoneRod });
        ModLoader.addRecipe(new ItemStack(obsidianCobaltAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.obsidianRod });
        ModLoader.addRecipe(new ItemStack(boneCobaltAxe), new Object[] 
                { recipe, '#', stack, '|', Item.bone });
        ModLoader.addRecipe(new ItemStack(boneCobaltAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.boneRod });
        ModLoader.addRecipe(new ItemStack(slimeCobaltAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.slimeRod });
        ModLoader.addRecipe(new ItemStack(cactusCobaltAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.cactusRod });
        ModLoader.addRecipe(new ItemStack(blazeCobaltAxe), new Object[] 
                { recipe, '#', stack, '|', Item.blazeRod });
        ModLoader.addRecipe(new ItemStack(copperCobaltAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.copperRod });
        ModLoader.addRecipe(new ItemStack(bronzeCobaltAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.bronzeRod });
        ModLoader.addRecipe(new ItemStack(workedCobaltAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.workedIronRod });
        ModLoader.addRecipe(new ItemStack(steelCobaltAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.steelRod });
        ModLoader.addRecipe(new ItemStack(cobaltCobaltAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.cobaltRod });
        ModLoader.addRecipe(new ItemStack(arditeCobaltAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.arditeRod });
        ModLoader.addRecipe(new ItemStack(manyullynCobaltAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.manyullynRod });
        ModLoader.addRecipe(new ItemStack(uraniumCobaltAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.uraniumRod });
    }
    
    public static void addArditeTools(ItemStack stack)
    {
    	ModLoader.addRecipe(new ItemStack(woodArditeAxe), new Object[] 
                { recipe, '#', stack, '|', Item.stick });
        ModLoader.addRecipe(new ItemStack(stoneArditeAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.stoneRod });
        ModLoader.addRecipe(new ItemStack(ironArditeAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.ironRod });
        ModLoader.addRecipe(new ItemStack(diamondArditeAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.diamondRod });
        ModLoader.addRecipe(new ItemStack(redstoneArditeAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.redstoneRod });
        ModLoader.addRecipe(new ItemStack(obsidianArditeAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.obsidianRod });
        ModLoader.addRecipe(new ItemStack(boneArditeAxe), new Object[] 
                { recipe, '#', stack, '|', Item.bone });
        ModLoader.addRecipe(new ItemStack(boneArditeAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.boneRod });
        ModLoader.addRecipe(new ItemStack(slimeArditeAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.slimeRod });
        ModLoader.addRecipe(new ItemStack(cactusArditeAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.cactusRod });
        ModLoader.addRecipe(new ItemStack(blazeArditeAxe), new Object[] 
                { recipe, '#', stack, '|', Item.blazeRod });
        ModLoader.addRecipe(new ItemStack(copperArditeAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.copperRod });
        ModLoader.addRecipe(new ItemStack(bronzeArditeAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.bronzeRod });
        ModLoader.addRecipe(new ItemStack(workedArditeAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.workedIronRod });
        ModLoader.addRecipe(new ItemStack(steelArditeAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.steelRod });
        ModLoader.addRecipe(new ItemStack(cobaltArditeAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.cobaltRod });
        ModLoader.addRecipe(new ItemStack(arditeArditeAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.arditeRod });
        ModLoader.addRecipe(new ItemStack(manyullynArditeAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.manyullynRod });
        ModLoader.addRecipe(new ItemStack(uraniumArditeAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.uraniumRod });
    }
    
    public static void addManyullynTools(ItemStack stack)
    {
    	ModLoader.addRecipe(new ItemStack(woodManyullynAxe), new Object[] 
                { recipe, '#', stack, '|', Item.stick });
        ModLoader.addRecipe(new ItemStack(stoneManyullynAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.stoneRod });
        ModLoader.addRecipe(new ItemStack(ironManyullynAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.ironRod });
        ModLoader.addRecipe(new ItemStack(diamondManyullynAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.diamondRod });
        ModLoader.addRecipe(new ItemStack(redstoneManyullynAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.redstoneRod });
        ModLoader.addRecipe(new ItemStack(obsidianManyullynAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.obsidianRod });
        ModLoader.addRecipe(new ItemStack(boneManyullynAxe), new Object[] 
                { recipe, '#', stack, '|', Item.bone });
        ModLoader.addRecipe(new ItemStack(boneManyullynAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.boneRod });
        ModLoader.addRecipe(new ItemStack(slimeManyullynAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.slimeRod });
        ModLoader.addRecipe(new ItemStack(cactusManyullynAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.cactusRod });
        ModLoader.addRecipe(new ItemStack(blazeManyullynAxe), new Object[] 
                { recipe, '#', stack, '|', Item.blazeRod });
        ModLoader.addRecipe(new ItemStack(copperManyullynAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.copperRod });
        ModLoader.addRecipe(new ItemStack(bronzeManyullynAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.bronzeRod });
        ModLoader.addRecipe(new ItemStack(workedManyullynAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.workedIronRod });
        ModLoader.addRecipe(new ItemStack(steelManyullynAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.steelRod });
        ModLoader.addRecipe(new ItemStack(cobaltManyullynAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.cobaltRod });
        ModLoader.addRecipe(new ItemStack(arditeManyullynAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.arditeRod });
        ModLoader.addRecipe(new ItemStack(manyullynManyullynAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.manyullynRod });
        ModLoader.addRecipe(new ItemStack(uraniumManyullynAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.uraniumRod });
    }
    
    public static void addUraniumTools(ItemStack stack)
    {
        ModLoader.addRecipe(new ItemStack(diamondUraniumAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.diamondRod });
        ModLoader.addRecipe(new ItemStack(redstoneUraniumAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.redstoneRod });
        ModLoader.addRecipe(new ItemStack(boneUraniumAxe), new Object[] 
                { recipe, '#', stack, '|', Item.bone });
        ModLoader.addRecipe(new ItemStack(boneUraniumAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.boneRod });
        ModLoader.addRecipe(new ItemStack(netherrackUraniumAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.netherrackRod });
        ModLoader.addRecipe(new ItemStack(glowstoneUraniumAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.glowstoneRod });
        ModLoader.addRecipe(new ItemStack(lavaUraniumAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.lavaRod });
        ModLoader.addRecipe(new ItemStack(blazeUraniumAxe), new Object[] 
                { recipe, '#', stack, '|', Item.blazeRod });
        ModLoader.addRecipe(new ItemStack(cobaltUraniumAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.cobaltRod });
        ModLoader.addRecipe(new ItemStack(arditeUraniumAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.arditeRod });
        ModLoader.addRecipe(new ItemStack(uraniumUraniumAxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.uraniumRod });
    }
    
	public static Item woodWoodAxe;
	public static Item sandstoneWoodAxe;
	public static Item boneWoodAxe;
	public static Item paperWoodAxe;
	public static Item iceWoodAxe;
	public static Item slimeWoodAxe;
	public static Item cactusWoodAxe;
	
	public static Item woodStoneAxe;
	public static Item stoneStoneAxe;
	public static Item sandstoneStoneAxe;
	public static Item boneStoneAxe;
	public static Item netherrackStoneAxe;
	public static Item iceStoneAxe;
	public static Item slimeStoneAxe;
	public static Item cactusStoneAxe;
	public static Item flintStoneAxe;
	
	public static Item woodIronAxe;
	public static Item stoneIronAxe;
	public static Item ironIronAxe;
	public static Item boneIronAxe;
	public static Item netherrackIronAxe;
	public static Item glowstoneIronAxe;
	public static Item cactusIronAxe;
	public static Item copperIronAxe;
	public static Item bronzeIronAxe;
	
	public static Item woodDiamondAxe;
	public static Item stoneDiamondAxe;
	public static Item ironDiamondAxe;
	public static Item diamondDiamondAxe;
	public static Item redstoneDiamondAxe;
	public static Item obsidianDiamondAxe;
	public static Item boneDiamondAxe;
	public static Item mossyDiamondAxe;
	public static Item netherrackDiamondAxe;
	public static Item glowstoneDiamondAxe;
	public static Item lavaDiamondAxe;
	public static Item cactusDiamondAxe;
	public static Item flintDiamondAxe;
	public static Item blazeDiamondAxe;
	public static Item copperDiamondAxe;
	public static Item bronzeDiamondAxe;
	public static Item workedDiamondAxe;
	public static Item steelDiamondAxe;
	public static Item cobaltDiamondAxe;
	public static Item arditeDiamondAxe;
	public static Item manyullynDiamondAxe;
	public static Item uraniumDiamondAxe;
	
	public static Item woodRedstoneAxe;
	public static Item stoneRedstoneAxe;
	public static Item ironRedstoneAxe;
	public static Item redstoneRedstoneAxe;
	public static Item obsidianRedstoneAxe;
	public static Item sandstoneRedstoneAxe;
	public static Item boneRedstoneAxe;
	public static Item paperRedstoneAxe;
	public static Item mossyRedstoneAxe;
	public static Item netherrackRedstoneAxe;
	public static Item glowstoneRedstoneAxe;
	public static Item iceRedstoneAxe;
	public static Item lavaRedstoneAxe;
	public static Item slimeRedstoneAxe;
	public static Item cactusRedstoneAxe;
	public static Item flintRedstoneAxe;
	public static Item copperRedstoneAxe;
	public static Item bronzeRedstoneAxe;
	public static Item workedRedstoneAxe;
	public static Item uraniumRedstoneAxe;
	
	public static Item woodObsidianAxe;
	public static Item stoneObsidianAxe;
	public static Item redstoneObsidianAxe;
	public static Item obsidianObsidianAxe;
	public static Item boneObsidianAxe;
	public static Item netherrackObsidianAxe;
	public static Item glowstoneObsidianAxe;
	public static Item iceObsidianAxe;
	public static Item lavaObsidianAxe;
	public static Item cactusObsidianAxe;
	
	public static Item woodSandstoneAxe;
	public static Item sandstoneSandstoneAxe;
	public static Item boneSandstoneAxe;
	public static Item netherrackSandstoneAxe;
	public static Item iceSandstoneAxe;
	public static Item slimeSandstoneAxe;
	public static Item cactusSandstoneAxe;
	public static Item flintSandstoneAxe;
	
	public static Item woodBoneAxe;
	public static Item stoneBoneAxe;
	public static Item sandstoneBoneAxe;
	public static Item boneBoneAxe;
	public static Item paperBoneAxe;
	public static Item netherrackBoneAxe;
	public static Item iceBoneAxe;
	public static Item cactusBoneAxe;
	public static Item flintBoneAxe;
	
	public static Item woodPaperAxe;
	public static Item bonePaperAxe;
	public static Item paperPaperAxe;
	public static Item slimePaperAxe;
	public static Item cactusPaperAxe;
	
	public static Item woodMossyAxe;
	public static Item stoneMossyAxe;
	public static Item diamondMossyAxe;
	public static Item redstoneMossyAxe;
	public static Item boneMossyAxe;
	public static Item mossyMossyAxe;
	public static Item netherrackMossyAxe;
	public static Item glowstoneMossyAxe;
	public static Item cactusMossyAxe;
	public static Item blazeMossyAxe;
	public static Item manyullynMossyAxe;
	public static Item uraniumMossyAxe;
	
	public static Item woodNetherrackAxe;
	public static Item stoneNetherrackAxe;
	public static Item sandstoneNetherrackAxe;
	public static Item boneNetherrackAxe;
	public static Item paperNetherrackAxe;
	public static Item mossyNetherrackAxe;
	public static Item netherrackNetherrackAxe;
	public static Item iceNetherrackAxe;
	public static Item slimeNetherrackAxe;
	public static Item cactusNetherrackAxe;
	public static Item flintNetherrackAxe;
	public static Item copperNetherrackAxe;
	public static Item bronzeNetherrackAxe;
	
	public static Item woodGlowstoneAxe;
	public static Item redstoneGlowstoneAxe;
	public static Item obsidianGlowstoneAxe;
	public static Item boneGlowstoneAxe;
	public static Item netherrackGlowstoneAxe;
	public static Item glowstoneGlowstoneAxe;
	public static Item iceGlowstoneAxe;
	public static Item slimeGlowstoneAxe;
	public static Item cactusGlowstoneAxe;
	
	public static Item woodIceAxe;
	public static Item boneIceAxe;
	public static Item paperIceAxe;
	public static Item iceIceAxe;
	public static Item slimeIceAxe;
	public static Item cactusIceAxe;
	
	public static Item diamondLavaAxe;
	public static Item obsidianLavaAxe;
	public static Item netherrackLavaAxe;
	public static Item lavaLavaAxe;
	public static Item flintLavaAxe;
	public static Item blazeLavaAxe;
	public static Item manyullynLavaAxe;
	public static Item uraniumLavaAxe;
	
	public static Item woodSlimeAxe;
	public static Item sandstoneSlimeAxe;
	public static Item boneSlimeAxe;
	public static Item paperSlimeAxe;
	public static Item slimeSlimeAxe;
	public static Item cactusSlimeAxe;
	
	public static Item woodCactusAxe;
	public static Item sandstoneCactusAxe;
	public static Item boneCactusAxe;
	public static Item netherrackCactusAxe;
	public static Item iceCactusAxe;
	public static Item slimeCactusAxe;
	public static Item cactusCactusAxe;
	
	public static Item woodFlintAxe;
	public static Item stoneFlintAxe;
	public static Item sandstoneFlintAxe;
	public static Item boneFlintAxe;
	public static Item netherrackFlintAxe;
	public static Item slimeFlintAxe;
	public static Item cactusFlintAxe;
	public static Item flintFlintAxe;
	public static Item copperFlintAxe;
	public static Item bronzeFlintAxe;
	
	public static Item diamondBlazeAxe;
	public static Item obsidianBlazeAxe;
	public static Item netherrackBlazeAxe;
	public static Item lavaBlazeAxe;
	public static Item flintBlazeAxe;
	public static Item blazeBlazeAxe;
	public static Item manyullynBlazeAxe;
	public static Item uraniumBlazeAxe;
	
	public static Item woodCopperAxe;
	public static Item stoneCopperAxe;
    public static Item boneCopperAxe;
    public static Item netherrackCopperAxe;
    public static Item slimeCopperAxe;
    public static Item cactusCopperAxe;
    public static Item flintCopperAxe;
    public static Item copperCopperAxe;
    
    public static Item woodBronzeAxe;
    public static Item stoneBronzeAxe;
    public static Item boneBronzeAxe;
    public static Item netherrackBronzeAxe;
    public static Item slimeBronzeAxe;
    public static Item cactusBronzeAxe;
    public static Item flintBronzeAxe;
    public static Item copperBronzeAxe;
    public static Item bronzeBronzeAxe;
    
    public static Item woodWorkedIronAxe;
    public static Item stoneWorkedIronAxe;
    public static Item ironWorkedIronAxe;
    public static Item diamondWorkedIronAxe;
    public static Item redstoneWorkedIronAxe;
    public static Item obsidianWorkedIronAxe;
    public static Item boneWorkedIronAxe;
    public static Item netherrackWorkedIronAxe;
    public static Item glowstoneWorkedIronAxe;
    public static Item iceWorkedIronAxe;
    public static Item slimeWorkedIronAxe;
    public static Item cactusWorkedIronAxe;
    public static Item blazeWorkedIronAxe;
    public static Item copperWorkedIronAxe;
    public static Item bronzeWorkedIronAxe;
    public static Item workedWorkedIronAxe;
    public static Item steelWorkedIronAxe;
    public static Item uraniumWorkedIronAxe;
    
    public static Item woodSteelAxe;
    public static Item stoneSteelAxe;
    public static Item ironSteelAxe;
    public static Item diamondSteelAxe;
    public static Item redstoneSteelAxe;
    public static Item obsidianSteelAxe;
    public static Item boneSteelAxe;
    public static Item netherrackSteelAxe;
    public static Item glowstoneSteelAxe;
    public static Item iceSteelAxe;
    public static Item slimeSteelAxe;
    public static Item cactusSteelAxe;
    public static Item blazeSteelAxe;
    public static Item copperSteelAxe;
    public static Item bronzeSteelAxe;
    public static Item workedSteelAxe;
    public static Item steelSteelAxe;
    public static Item cobaltSteelAxe;
    public static Item arditeSteelAxe;
    public static Item uraniumSteelAxe;
    
    public static Item woodCobaltAxe;
    public static Item stoneCobaltAxe;
    public static Item ironCobaltAxe;
    public static Item diamondCobaltAxe;
    public static Item redstoneCobaltAxe;
    public static Item obsidianCobaltAxe;
    public static Item boneCobaltAxe;
    public static Item slimeCobaltAxe;
    public static Item cactusCobaltAxe;
    public static Item blazeCobaltAxe;
    public static Item copperCobaltAxe;
    public static Item bronzeCobaltAxe;
    public static Item workedCobaltAxe;
    public static Item steelCobaltAxe;
    public static Item cobaltCobaltAxe;
    public static Item arditeCobaltAxe;
    public static Item manyullynCobaltAxe;
    public static Item uraniumCobaltAxe;
    
    public static Item woodArditeAxe;
    public static Item stoneArditeAxe;
    public static Item ironArditeAxe;
    public static Item diamondArditeAxe;
    public static Item redstoneArditeAxe;
    public static Item obsidianArditeAxe;
    public static Item boneArditeAxe;
    public static Item slimeArditeAxe;
    public static Item cactusArditeAxe;
    public static Item blazeArditeAxe;
    public static Item copperArditeAxe;
    public static Item bronzeArditeAxe;
    public static Item workedArditeAxe;
    public static Item steelArditeAxe;
    public static Item cobaltArditeAxe;
    public static Item arditeArditeAxe;
    public static Item manyullynArditeAxe;
    public static Item uraniumArditeAxe;
    
    public static Item woodManyullynAxe;
    public static Item stoneManyullynAxe;
    public static Item ironManyullynAxe;
    public static Item diamondManyullynAxe;
    public static Item redstoneManyullynAxe;
    public static Item obsidianManyullynAxe;
    public static Item boneManyullynAxe;
    public static Item slimeManyullynAxe;
    public static Item cactusManyullynAxe;
    public static Item blazeManyullynAxe;
    public static Item copperManyullynAxe;
    public static Item bronzeManyullynAxe;
    public static Item workedManyullynAxe;
    public static Item steelManyullynAxe;
    public static Item cobaltManyullynAxe;
    public static Item arditeManyullynAxe;
    public static Item manyullynManyullynAxe;
    public static Item uraniumManyullynAxe;
    
    public static Item diamondUraniumAxe;
    public static Item redstoneUraniumAxe;
    public static Item boneUraniumAxe;
    public static Item netherrackUraniumAxe;
    public static Item glowstoneUraniumAxe;
    public static Item lavaUraniumAxe;
    public static Item blazeUraniumAxe;
    public static Item cobaltUraniumAxe;
    public static Item arditeUraniumAxe;
    public static Item uraniumUraniumAxe;
}
