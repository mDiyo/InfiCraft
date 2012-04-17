package net.minecraft.src.inficore;
import net.minecraft.src.Block;
import net.minecraft.src.InfiMaterialEnum;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;
import net.minecraft.src.ModLoader;
import net.minecraft.src.mod_InfiBase;
import net.minecraft.src.forge.MinecraftForge;

public class Pickaxes 
{
    public static Pickaxes instance = new Pickaxes();
    
    private static String[] recipe = { "###", " | ", " | " };
    
    public static Pickaxes getInstance()
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
    		woodWoodPickaxe = new InfiToolPickaxe(PropsHelperInfiTools.woodPickaxeID+0, 
                    InfiMaterialEnum.Wood, InfiMaterialEnum.Wood, "woodWood");
    		sandstoneWoodPickaxe = new InfiToolPickaxe(PropsHelperInfiTools.woodPickaxeID+1, 
                    InfiMaterialEnum.Wood, InfiMaterialEnum.Sandstone, "sandstoneWoodPickaxe");
    		boneWoodPickaxe = new InfiToolPickaxe(PropsHelperInfiTools.woodPickaxeID+2, 
                    InfiMaterialEnum.Wood, InfiMaterialEnum.Bone, "boneWoodPickaxe");
    		paperWoodPickaxe = new InfiToolPickaxe(PropsHelperInfiTools.woodPickaxeID+3, 
                    InfiMaterialEnum.Wood, InfiMaterialEnum.Paper, "paperWoodPickaxe");
    		iceWoodPickaxe = new InfiToolPickaxe(PropsHelperInfiTools.woodPickaxeID+4, 
                    InfiMaterialEnum.Wood, InfiMaterialEnum.Ice, "iceWoodPickaxe");
    		slimeWoodPickaxe = new InfiToolPickaxe(PropsHelperInfiTools.woodPickaxeID+5, 
                    InfiMaterialEnum.Wood, InfiMaterialEnum.Slime, "slimeWoodPickaxe");
    		cactusWoodPickaxe = new InfiToolPickaxe(PropsHelperInfiTools.woodPickaxeID+6, 
                    InfiMaterialEnum.Wood, InfiMaterialEnum.Cactus, "cactusWoodPickaxe");
    		
    		MinecraftForge.setToolClass(woodWoodPickaxe, "pickaxe", InfiMaterialEnum.Wood.getHarvestLevel());
    		MinecraftForge.setToolClass(sandstoneWoodPickaxe, "pickaxe", InfiMaterialEnum.Wood.getHarvestLevel());
    		MinecraftForge.setToolClass(boneWoodPickaxe, "pickaxe", InfiMaterialEnum.Wood.getHarvestLevel());
    		MinecraftForge.setToolClass(paperWoodPickaxe, "pickaxe", InfiMaterialEnum.Wood.getHarvestLevel());
    		MinecraftForge.setToolClass(iceWoodPickaxe, "pickaxe", InfiMaterialEnum.Wood.getHarvestLevel());
    		MinecraftForge.setToolClass(slimeWoodPickaxe, "pickaxe", InfiMaterialEnum.Wood.getHarvestLevel());
    		MinecraftForge.setToolClass(cactusWoodPickaxe, "pickaxe", InfiMaterialEnum.Wood.getHarvestLevel());
    	}

        if(PropsHelperInfiTools.enableStoneTools)
        {
        	woodStonePickaxe = new InfiToolPickaxe(PropsHelperInfiTools.stonePickaxeID+0, 
                    InfiMaterialEnum.Stone, InfiMaterialEnum.Wood, "woodStonePickaxe");
        	stoneStonePickaxe = new InfiToolPickaxe(PropsHelperInfiTools.stonePickaxeID+1, 
                    InfiMaterialEnum.Stone, InfiMaterialEnum.Stone, "stoneStonePickaxe");
        	sandstoneStonePickaxe = new InfiToolPickaxe(PropsHelperInfiTools.stonePickaxeID+2, 
                    InfiMaterialEnum.Stone, InfiMaterialEnum.Sandstone, "sandstoneStonePickaxe");
        	boneStonePickaxe = new InfiToolPickaxe(PropsHelperInfiTools.stonePickaxeID+3, 
                    InfiMaterialEnum.Stone, InfiMaterialEnum.Bone, "boneStonePickaxe");
        	netherrackStonePickaxe = new InfiToolPickaxe(PropsHelperInfiTools.stonePickaxeID+4, 
                    InfiMaterialEnum.Stone, InfiMaterialEnum.Netherrack, "netherrackStonePickaxe");
        	iceStonePickaxe = new InfiToolPickaxe(PropsHelperInfiTools.stonePickaxeID+5, 
                    InfiMaterialEnum.Stone, InfiMaterialEnum.Ice, "iceStonePickaxe");
        	slimeStonePickaxe = new InfiToolPickaxe(PropsHelperInfiTools.stonePickaxeID+6, 
                    InfiMaterialEnum.Stone, InfiMaterialEnum.Slime, "slimeStonePickaxe");
        	cactusStonePickaxe = new InfiToolPickaxe(PropsHelperInfiTools.stonePickaxeID+7, 
                    InfiMaterialEnum.Stone, InfiMaterialEnum.Cactus, "cactusStonePickaxe");
        	flintStonePickaxe = new InfiToolPickaxe(PropsHelperInfiTools.stonePickaxeID+8, 
                    InfiMaterialEnum.Stone, InfiMaterialEnum.Flint, "flintStonePickaxe");
            
            MinecraftForge.setToolClass(woodStonePickaxe, "pickaxe", InfiMaterialEnum.Stone.getHarvestLevel());
            MinecraftForge.setToolClass(stoneStonePickaxe, "pickaxe", InfiMaterialEnum.Stone.getHarvestLevel());
            MinecraftForge.setToolClass(sandstoneStonePickaxe, "pickaxe", InfiMaterialEnum.Stone.getHarvestLevel());
            MinecraftForge.setToolClass(boneStonePickaxe, "pickaxe", InfiMaterialEnum.Stone.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackStonePickaxe, "pickaxe", InfiMaterialEnum.Stone.getHarvestLevel());
            MinecraftForge.setToolClass(iceStonePickaxe, "pickaxe", InfiMaterialEnum.Stone.getHarvestLevel());
            MinecraftForge.setToolClass(slimeStonePickaxe, "pickaxe", InfiMaterialEnum.Stone.getHarvestLevel());
            MinecraftForge.setToolClass(cactusStonePickaxe, "pickaxe", InfiMaterialEnum.Stone.getHarvestLevel());
            MinecraftForge.setToolClass(flintStonePickaxe, "pickaxe", InfiMaterialEnum.Stone.getHarvestLevel());
        }
        
        if(PropsHelperInfiTools.enableIronTools)
        {
        	woodIronPickaxe = new InfiToolPickaxe(PropsHelperInfiTools.ironPickaxeID+0, 
                    InfiMaterialEnum.Iron, InfiMaterialEnum.Wood, "woodIronPickaxe");
        	stoneIronPickaxe = new InfiToolPickaxe(PropsHelperInfiTools.ironPickaxeID+1, 
                    InfiMaterialEnum.Iron, InfiMaterialEnum.Stone, "stoneIronPickaxe");
        	ironIronPickaxe = new InfiToolPickaxe(PropsHelperInfiTools.ironPickaxeID+2, 
                    InfiMaterialEnum.Iron, InfiMaterialEnum.Iron, "ironIronPickaxe");
        	boneIronPickaxe = new InfiToolPickaxe(PropsHelperInfiTools.ironPickaxeID+3, 
                    InfiMaterialEnum.Iron, InfiMaterialEnum.Bone, "boneIronPickaxe");
        	netherrackIronPickaxe = new InfiToolPickaxe(PropsHelperInfiTools.ironPickaxeID+4, 
                    InfiMaterialEnum.Iron, InfiMaterialEnum.Netherrack, "netherrackIronPickaxe");
        	glowstoneIronPickaxe = new InfiToolPickaxe(PropsHelperInfiTools.ironPickaxeID+5, 
                    InfiMaterialEnum.Iron, InfiMaterialEnum.Glowstone, "glowstoneIronPickaxe");
        	cactusIronPickaxe = new InfiToolPickaxe(PropsHelperInfiTools.ironPickaxeID+6, 
                    InfiMaterialEnum.Iron, InfiMaterialEnum.Cactus, "cactusIronPickaxe");
        	copperIronPickaxe = new InfiToolPickaxe(PropsHelperInfiTools.ironPickaxeID+7, 
                    InfiMaterialEnum.Iron, InfiMaterialEnum.Copper, "copperIronPickaxe");
        	bronzeIronPickaxe = new InfiToolPickaxe(PropsHelperInfiTools.ironPickaxeID+8, 
                    InfiMaterialEnum.Iron, InfiMaterialEnum.Bronze, "bronzeIronPickaxe");
            
            MinecraftForge.setToolClass(woodIronPickaxe, "pickaxe", InfiMaterialEnum.Iron.getHarvestLevel());
            MinecraftForge.setToolClass(stoneIronPickaxe, "pickaxe", InfiMaterialEnum.Iron.getHarvestLevel());
            MinecraftForge.setToolClass(ironIronPickaxe, "pickaxe", InfiMaterialEnum.Iron.getHarvestLevel());
            MinecraftForge.setToolClass(boneIronPickaxe, "pickaxe", InfiMaterialEnum.Iron.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackIronPickaxe, "pickaxe", InfiMaterialEnum.Iron.getHarvestLevel());
            MinecraftForge.setToolClass(glowstoneIronPickaxe, "pickaxe", InfiMaterialEnum.Iron.getHarvestLevel());
            MinecraftForge.setToolClass(cactusIronPickaxe, "pickaxe", InfiMaterialEnum.Iron.getHarvestLevel());
            MinecraftForge.setToolClass(copperIronPickaxe, "pickaxe", InfiMaterialEnum.Iron.getHarvestLevel());
            MinecraftForge.setToolClass(bronzeIronPickaxe, "pickaxe", InfiMaterialEnum.Iron.getHarvestLevel());
        }
        
        if(PropsHelperInfiTools.enableDiamondTools)
        {
        	woodDiamondPickaxe = new InfiToolPickaxe(PropsHelperInfiTools.diamondPickaxeID+0, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Wood, "woodDiamondPickaxe");
        	stoneDiamondPickaxe = new InfiToolPickaxe(PropsHelperInfiTools.diamondPickaxeID+1, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Stone, "stoneDiamondPickaxe");
        	ironDiamondPickaxe = new InfiToolPickaxe(PropsHelperInfiTools.diamondPickaxeID+2, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Iron, "ironDiamondPickaxe");
        	diamondDiamondPickaxe = new InfiToolPickaxe(PropsHelperInfiTools.diamondPickaxeID+3, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Diamond, "diamondDiamondPickaxe");
        	redstoneDiamondPickaxe = new InfiToolPickaxe(PropsHelperInfiTools.diamondPickaxeID+4, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Redstone, "redstoneDiamondPickaxe");
        	obsidianDiamondPickaxe = new InfiToolPickaxe(PropsHelperInfiTools.diamondPickaxeID+5, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Obsidian, "obsidianDiamondPickaxe");
        	boneDiamondPickaxe = new InfiToolPickaxe(PropsHelperInfiTools.diamondPickaxeID+6, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Bone, "boneDiamondPickaxe");
        	mossyDiamondPickaxe = new InfiToolPickaxe(PropsHelperInfiTools.diamondPickaxeID+7, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Mossy, "mossyDiamondPickaxe");
        	netherrackDiamondPickaxe = new InfiToolPickaxe(PropsHelperInfiTools.diamondPickaxeID+8, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Netherrack, "netherrackDiamondPickaxe");
        	glowstoneDiamondPickaxe = new InfiToolPickaxe(PropsHelperInfiTools.diamondPickaxeID+9, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Glowstone, "glowstoneDiamondPickaxe");
        	lavaDiamondPickaxe = new InfiToolPickaxe(PropsHelperInfiTools.diamondPickaxeID+10, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Lava, "lavaDiamondPickaxe");
        	cactusDiamondPickaxe = new InfiToolPickaxe(PropsHelperInfiTools.diamondPickaxeID+11, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Cactus, "cactusDiamondPickaxe");
        	flintDiamondPickaxe = new InfiToolPickaxe(PropsHelperInfiTools.diamondPickaxeID+12, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Flint, "flintDiamondPickaxe");
        	blazeDiamondPickaxe = new InfiToolPickaxe(PropsHelperInfiTools.diamondPickaxeID+13, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Blaze, "blazeDiamondPickaxe");
            copperDiamondPickaxe = new InfiToolPickaxe(PropsHelperInfiTools.diamondPickaxeID+14, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Copper, "copperDiamondPickaxe");
            bronzeDiamondPickaxe = new InfiToolPickaxe(PropsHelperInfiTools.diamondPickaxeID+15, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Bronze, "bronzeDiamondPickaxe");
            workedDiamondPickaxe = new InfiToolPickaxe(PropsHelperInfiTools.diamondPickaxeID+16, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.WorkedIron, "workedDiamondPickaxe");
            steelDiamondPickaxe = new InfiToolPickaxe(PropsHelperInfiTools.diamondPickaxeID+17, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Steel, "steelDiamondPickaxe");
            cobaltDiamondPickaxe = new InfiToolPickaxe(PropsHelperInfiTools.diamondPickaxeID+18, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Cobalt, "cobaltDiamondPickaxe");
            arditeDiamondPickaxe = new InfiToolPickaxe(PropsHelperInfiTools.diamondPickaxeID+19, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Ardite, "arditeDiamondPickaxe");
            manyullynDiamondPickaxe = new InfiToolPickaxe(PropsHelperInfiTools.diamondPickaxeID+20, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Manyullyn, "manyullynDiamondPickaxe");
            uraniumDiamondPickaxe = new InfiToolPickaxe(PropsHelperInfiTools.diamondPickaxeID+21, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Uranium, "uraniumDiamondPickaxe");
            
            MinecraftForge.setToolClass(woodDiamondPickaxe, "pickaxe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(stoneDiamondPickaxe, "pickaxe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(ironDiamondPickaxe, "pickaxe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(diamondDiamondPickaxe, "pickaxe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(redstoneDiamondPickaxe, "pickaxe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(obsidianDiamondPickaxe, "pickaxe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(boneDiamondPickaxe, "pickaxe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(mossyDiamondPickaxe, "pickaxe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackDiamondPickaxe, "pickaxe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(glowstoneDiamondPickaxe, "pickaxe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(lavaDiamondPickaxe, "pickaxe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(cactusDiamondPickaxe, "pickaxe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(flintDiamondPickaxe, "pickaxe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(blazeDiamondPickaxe, "pickaxe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(copperDiamondPickaxe, "pickaxe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(bronzeDiamondPickaxe, "pickaxe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(workedDiamondPickaxe, "pickaxe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(steelDiamondPickaxe, "pickaxe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(cobaltDiamondPickaxe, "pickaxe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(arditeDiamondPickaxe, "pickaxe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(manyullynDiamondPickaxe, "pickaxe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(uraniumDiamondPickaxe, "pickaxe", InfiMaterialEnum.Diamond.getHarvestLevel());
        }
        
        if(PropsHelperInfiTools.enableRedstoneTools)
        {
        	woodRedstonePickaxe = new InfiToolPickaxe(PropsHelperInfiTools.redstonePickaxeID+0, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Redstone, "woodRedstonePickaxe");
        	stoneRedstonePickaxe = new InfiToolPickaxe(PropsHelperInfiTools.redstonePickaxeID+1, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Stone, "stoneRedstonePickaxe");
        	ironRedstonePickaxe = new InfiToolPickaxe(PropsHelperInfiTools.redstonePickaxeID+2, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Iron, "ironRedstonePickaxe");
        	redstoneRedstonePickaxe = new InfiToolPickaxe(PropsHelperInfiTools.redstonePickaxeID+3, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Redstone, "redstoneRedstonePickaxe");
        	obsidianRedstonePickaxe = new InfiToolPickaxe(PropsHelperInfiTools.redstonePickaxeID+4, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Obsidian, "obsidianRedstonePickaxe");
        	sandstoneRedstonePickaxe = new InfiToolPickaxe(PropsHelperInfiTools.redstonePickaxeID+5, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Sandstone, "sandstoneRedstonePickaxe");
        	boneRedstonePickaxe = new InfiToolPickaxe(PropsHelperInfiTools.redstonePickaxeID+6, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Bone, "boneRedstonePickaxe");
        	paperRedstonePickaxe = new InfiToolPickaxe(PropsHelperInfiTools.redstonePickaxeID+7, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Paper, "paperRedstonePickaxe");
        	mossyRedstonePickaxe = new InfiToolPickaxe(PropsHelperInfiTools.redstonePickaxeID+8, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Mossy, "mossyRedstonePickaxe");
        	netherrackRedstonePickaxe = new InfiToolPickaxe(PropsHelperInfiTools.redstonePickaxeID+9, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Netherrack, "netherrackRedstonePickaxe");
        	glowstoneRedstonePickaxe = new InfiToolPickaxe(PropsHelperInfiTools.redstonePickaxeID+10, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Glowstone, "glowstoneRedstonePickaxe");
        	iceRedstonePickaxe = new InfiToolPickaxe(PropsHelperInfiTools.redstonePickaxeID+11, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Ice, "iceRedstonePickaxe");
        	lavaRedstonePickaxe = new InfiToolPickaxe(PropsHelperInfiTools.redstonePickaxeID+12,
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Lava, "lavaRedstonePickaxe");
        	slimeRedstonePickaxe = new InfiToolPickaxe(PropsHelperInfiTools.redstonePickaxeID+13,
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Slime, "slimeRedstonePickaxe");
        	cactusRedstonePickaxe = new InfiToolPickaxe(PropsHelperInfiTools.redstonePickaxeID+14,
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Cactus, "cactusRedstonePickaxe");
        	flintRedstonePickaxe = new InfiToolPickaxe(PropsHelperInfiTools.redstonePickaxeID+15,
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Flint, "flintRedstonePickaxe");
        	copperRedstonePickaxe = new InfiToolPickaxe(PropsHelperInfiTools.redstonePickaxeID+16,
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Copper, "copperRedstonePickaxe");
        	bronzeRedstonePickaxe = new InfiToolPickaxe(PropsHelperInfiTools.redstonePickaxeID+17,
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Bronze, "bronzeRedstonePickaxe");
        	workedRedstonePickaxe = new InfiToolPickaxe(PropsHelperInfiTools.redstonePickaxeID+18,
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.WorkedIron, "workedRedstonePickaxe");
        	uraniumRedstonePickaxe = new InfiToolPickaxe(PropsHelperInfiTools.redstonePickaxeID+19,
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Uranium, "uraniumRedstonePickaxe");
            
            MinecraftForge.setToolClass(woodRedstonePickaxe, "pickaxe", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(stoneRedstonePickaxe, "pickaxe", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(ironRedstonePickaxe, "pickaxe", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(redstoneRedstonePickaxe, "pickaxe", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(obsidianRedstonePickaxe, "pickaxe", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(sandstoneRedstonePickaxe, "pickaxe", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(boneRedstonePickaxe, "pickaxe", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(paperRedstonePickaxe, "pickaxe", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(mossyRedstonePickaxe, "pickaxe", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackRedstonePickaxe, "pickaxe", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(glowstoneRedstonePickaxe, "pickaxe", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(iceRedstonePickaxe, "pickaxe", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(lavaRedstonePickaxe, "pickaxe", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(slimeRedstonePickaxe, "pickaxe", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(cactusRedstonePickaxe, "pickaxe", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(flintRedstonePickaxe, "pickaxe", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(copperRedstonePickaxe, "pickaxe", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(bronzeRedstonePickaxe, "pickaxe", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(workedRedstonePickaxe, "pickaxe", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(uraniumRedstonePickaxe, "pickaxe", InfiMaterialEnum.Redstone.getHarvestLevel());
        }
        
        if(PropsHelperInfiTools.enableObsidianTools)
        {
        	woodObsidianPickaxe = new InfiToolPickaxe(PropsHelperInfiTools.obsidianPickaxeID+0, 
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Obsidian, "woodObsidianPickaxe");
        	stoneObsidianPickaxe = new InfiToolPickaxe(PropsHelperInfiTools.obsidianPickaxeID+1, 
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Stone, "stoneObsidianPickaxe");
        	redstoneObsidianPickaxe = new InfiToolPickaxe(PropsHelperInfiTools.obsidianPickaxeID+2, 
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Obsidian, "redstoneObsidianPickaxe");
        	obsidianObsidianPickaxe = new InfiToolPickaxe(PropsHelperInfiTools.obsidianPickaxeID+3, 
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Obsidian, "obsidianObsidianPickaxe");;
        	boneObsidianPickaxe = new InfiToolPickaxe(PropsHelperInfiTools.obsidianPickaxeID+4, 
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Bone, "boneObsidianPickaxe");
        	netherrackObsidianPickaxe = new InfiToolPickaxe(PropsHelperInfiTools.obsidianPickaxeID+5, 
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Netherrack, "netherrackObsidianPickaxe");
        	glowstoneObsidianPickaxe = new InfiToolPickaxe(PropsHelperInfiTools.obsidianPickaxeID+6, 
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Glowstone, "glowstoneObsidianPickaxe");
        	iceObsidianPickaxe = new InfiToolPickaxe(PropsHelperInfiTools.obsidianPickaxeID+7, 
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Ice, "iceObsidianPickaxe");
        	lavaObsidianPickaxe = new InfiToolPickaxe(PropsHelperInfiTools.obsidianPickaxeID+8,
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Lava, "lavaObsidianPickaxe");
        	cactusObsidianPickaxe = new InfiToolPickaxe(PropsHelperInfiTools.obsidianPickaxeID+9,
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Cactus, "cactusObsidianPickaxe");
            
            MinecraftForge.setToolClass(woodObsidianPickaxe, "pickaxe", InfiMaterialEnum.Obsidian.getHarvestLevel());
            MinecraftForge.setToolClass(stoneObsidianPickaxe, "pickaxe", InfiMaterialEnum.Obsidian.getHarvestLevel());
            MinecraftForge.setToolClass(redstoneObsidianPickaxe, "pickaxe", InfiMaterialEnum.Obsidian.getHarvestLevel());
            MinecraftForge.setToolClass(obsidianObsidianPickaxe, "pickaxe", InfiMaterialEnum.Obsidian.getHarvestLevel());
            MinecraftForge.setToolClass(boneObsidianPickaxe, "pickaxe", InfiMaterialEnum.Obsidian.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackObsidianPickaxe, "pickaxe", InfiMaterialEnum.Obsidian.getHarvestLevel());
            MinecraftForge.setToolClass(glowstoneObsidianPickaxe, "pickaxe", InfiMaterialEnum.Obsidian.getHarvestLevel());
            MinecraftForge.setToolClass(iceObsidianPickaxe, "pickaxe", InfiMaterialEnum.Obsidian.getHarvestLevel());
            MinecraftForge.setToolClass(lavaObsidianPickaxe, "pickaxe", InfiMaterialEnum.Obsidian.getHarvestLevel());
            MinecraftForge.setToolClass(cactusObsidianPickaxe, "pickaxe", InfiMaterialEnum.Obsidian.getHarvestLevel());
        }
        
        if(PropsHelperInfiTools.enableSandstoneTools)
        {
        	woodSandstonePickaxe = new InfiToolPickaxe(PropsHelperInfiTools.sandstonePickaxeID+0, 
                    InfiMaterialEnum.Sandstone, InfiMaterialEnum.Sandstone, "woodSandstonePickaxe");
        	sandstoneSandstonePickaxe = new InfiToolPickaxe(PropsHelperInfiTools.sandstonePickaxeID+1, 
                    InfiMaterialEnum.Sandstone, InfiMaterialEnum.Sandstone, "sandstoneSandstonePickaxe");
        	boneSandstonePickaxe = new InfiToolPickaxe(PropsHelperInfiTools.sandstonePickaxeID+2, 
                    InfiMaterialEnum.Sandstone, InfiMaterialEnum.Bone, "boneSandstonePickaxe");
        	netherrackSandstonePickaxe = new InfiToolPickaxe(PropsHelperInfiTools.sandstonePickaxeID+3, 
                    InfiMaterialEnum.Sandstone, InfiMaterialEnum.Netherrack, "netherrackSandstonePickaxe");
        	iceSandstonePickaxe = new InfiToolPickaxe(PropsHelperInfiTools.sandstonePickaxeID+4, 
                    InfiMaterialEnum.Sandstone, InfiMaterialEnum.Ice, "iceSandstonePickaxe");
        	slimeSandstonePickaxe = new InfiToolPickaxe(PropsHelperInfiTools.sandstonePickaxeID+5,
                    InfiMaterialEnum.Sandstone, InfiMaterialEnum.Slime, "slimeSandstonePickaxe");
        	cactusSandstonePickaxe = new InfiToolPickaxe(PropsHelperInfiTools.sandstonePickaxeID+6,
                    InfiMaterialEnum.Sandstone, InfiMaterialEnum.Cactus, "cactusSandstonePickaxe");
        	flintSandstonePickaxe = new InfiToolPickaxe(PropsHelperInfiTools.sandstonePickaxeID+7,
                    InfiMaterialEnum.Sandstone, InfiMaterialEnum.Flint, "flintSandstonePickaxe");
            
            MinecraftForge.setToolClass(woodSandstonePickaxe, "pickaxe", InfiMaterialEnum.Sandstone.getHarvestLevel());
            MinecraftForge.setToolClass(sandstoneSandstonePickaxe, "pickaxe", InfiMaterialEnum.Sandstone.getHarvestLevel());
            MinecraftForge.setToolClass(boneSandstonePickaxe, "pickaxe", InfiMaterialEnum.Sandstone.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackSandstonePickaxe, "pickaxe", InfiMaterialEnum.Sandstone.getHarvestLevel());
            MinecraftForge.setToolClass(iceSandstonePickaxe, "pickaxe", InfiMaterialEnum.Sandstone.getHarvestLevel());
            MinecraftForge.setToolClass(slimeSandstonePickaxe, "pickaxe", InfiMaterialEnum.Sandstone.getHarvestLevel());
            MinecraftForge.setToolClass(cactusSandstonePickaxe, "pickaxe", InfiMaterialEnum.Sandstone.getHarvestLevel());
            MinecraftForge.setToolClass(flintSandstonePickaxe, "pickaxe", InfiMaterialEnum.Sandstone.getHarvestLevel());
        }
        
        if(PropsHelperInfiTools.enableBoneTools)
        {
        	woodBonePickaxe = new InfiToolPickaxe(PropsHelperInfiTools.bonePickaxeID+0, 
                    InfiMaterialEnum.Bone, InfiMaterialEnum.Bone, "woodBonePickaxe");
        	stoneBonePickaxe = new InfiToolPickaxe(PropsHelperInfiTools.bonePickaxeID+1, 
                    InfiMaterialEnum.Bone, InfiMaterialEnum.Stone, "stoneBonePickaxe");
        	sandstoneBonePickaxe = new InfiToolPickaxe(PropsHelperInfiTools.bonePickaxeID+2, 
                    InfiMaterialEnum.Bone, InfiMaterialEnum.Sandstone, "sandstoneBonePickaxe");
        	boneBonePickaxe = new InfiToolPickaxe(PropsHelperInfiTools.bonePickaxeID+3, 
                    InfiMaterialEnum.Bone, InfiMaterialEnum.Bone, "boneBonePickaxe");
        	paperBonePickaxe = new InfiToolPickaxe(PropsHelperInfiTools.bonePickaxeID+4, 
                    InfiMaterialEnum.Bone, InfiMaterialEnum.Paper, "paperBonePickaxe");
        	netherrackBonePickaxe = new InfiToolPickaxe(PropsHelperInfiTools.bonePickaxeID+5, 
                    InfiMaterialEnum.Bone, InfiMaterialEnum.Netherrack, "netherrackBonePickaxe");
        	iceBonePickaxe = new InfiToolPickaxe(PropsHelperInfiTools.bonePickaxeID+6, 
                    InfiMaterialEnum.Bone, InfiMaterialEnum.Ice, "iceBonePickaxe");
        	cactusBonePickaxe = new InfiToolPickaxe(PropsHelperInfiTools.bonePickaxeID+7,
                    InfiMaterialEnum.Bone, InfiMaterialEnum.Cactus, "cactusBonePickaxe");
        	flintBonePickaxe = new InfiToolPickaxe(PropsHelperInfiTools.bonePickaxeID+8,
                    InfiMaterialEnum.Bone, InfiMaterialEnum.Flint, "flintBonePickaxe");
            
            MinecraftForge.setToolClass(woodBonePickaxe, "pickaxe", InfiMaterialEnum.Bone.getHarvestLevel());
            MinecraftForge.setToolClass(stoneBonePickaxe, "pickaxe", InfiMaterialEnum.Bone.getHarvestLevel());
            MinecraftForge.setToolClass(sandstoneBonePickaxe, "pickaxe", InfiMaterialEnum.Bone.getHarvestLevel());
            MinecraftForge.setToolClass(boneBonePickaxe, "pickaxe", InfiMaterialEnum.Bone.getHarvestLevel());
            MinecraftForge.setToolClass(paperBonePickaxe, "pickaxe", InfiMaterialEnum.Bone.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackBonePickaxe, "pickaxe", InfiMaterialEnum.Bone.getHarvestLevel());
            MinecraftForge.setToolClass(iceBonePickaxe, "pickaxe", InfiMaterialEnum.Bone.getHarvestLevel());
            MinecraftForge.setToolClass(cactusBonePickaxe, "pickaxe", InfiMaterialEnum.Bone.getHarvestLevel());
            MinecraftForge.setToolClass(flintBonePickaxe, "pickaxe", InfiMaterialEnum.Bone.getHarvestLevel());
        }
        
        if(PropsHelperInfiTools.enablePaperTools)
        {
        	woodPaperPickaxe = new InfiToolPickaxe(PropsHelperInfiTools.paperPickaxeID+0, 
                    InfiMaterialEnum.Paper, InfiMaterialEnum.Paper, "woodPaperPickaxe");
        	bonePaperPickaxe = new InfiToolPickaxe(PropsHelperInfiTools.paperPickaxeID+1, 
                    InfiMaterialEnum.Paper, InfiMaterialEnum.Paper, "bonePaperPickaxe");
        	paperPaperPickaxe = new InfiToolPickaxe(PropsHelperInfiTools.paperPickaxeID+2, 
                    InfiMaterialEnum.Paper, InfiMaterialEnum.Paper, "paperPaperPickaxe");
        	slimePaperPickaxe = new InfiToolPickaxe(PropsHelperInfiTools.paperPickaxeID+3,
                    InfiMaterialEnum.Paper, InfiMaterialEnum.Cactus, "slimePaperPickaxe");
        	cactusPaperPickaxe = new InfiToolPickaxe(PropsHelperInfiTools.paperPickaxeID+4,
                    InfiMaterialEnum.Paper, InfiMaterialEnum.Cactus, "cactusPaperPickaxe");
            
            MinecraftForge.setToolClass(woodPaperPickaxe, "pickaxe", InfiMaterialEnum.Paper.getHarvestLevel());
            MinecraftForge.setToolClass(bonePaperPickaxe, "pickaxe", InfiMaterialEnum.Paper.getHarvestLevel());
            MinecraftForge.setToolClass(paperPaperPickaxe, "pickaxe", InfiMaterialEnum.Paper.getHarvestLevel());
            MinecraftForge.setToolClass(slimePaperPickaxe, "pickaxe", InfiMaterialEnum.Paper.getHarvestLevel());
            MinecraftForge.setToolClass(cactusPaperPickaxe, "pickaxe", InfiMaterialEnum.Paper.getHarvestLevel());
        }
        
        if(PropsHelperInfiTools.enableMossyTools)
        {
        	woodMossyPickaxe = new InfiToolPickaxe(PropsHelperInfiTools.mossyPickaxeID+0, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Wood, "woodMossyPickaxe");
        	stoneMossyPickaxe = new InfiToolPickaxe(PropsHelperInfiTools.mossyPickaxeID+1, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Stone, "stoneMossyPickaxe");
        	diamondMossyPickaxe = new InfiToolPickaxe(PropsHelperInfiTools.mossyPickaxeID+2, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Diamond, "diamondMossyPickaxe");
        	redstoneMossyPickaxe = new InfiToolPickaxe(PropsHelperInfiTools.mossyPickaxeID+3, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Redstone, "redstoneMossyPickaxe");
        	boneMossyPickaxe = new InfiToolPickaxe(PropsHelperInfiTools.mossyPickaxeID+4, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Bone, "boneMossyPickaxe");
        	mossyMossyPickaxe = new InfiToolPickaxe(PropsHelperInfiTools.mossyPickaxeID+5, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Mossy, "mossyMossyPickaxe");
        	netherrackMossyPickaxe = new InfiToolPickaxe(PropsHelperInfiTools.mossyPickaxeID+6, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Netherrack, "netherrackMossyPickaxe");
        	glowstoneMossyPickaxe = new InfiToolPickaxe(PropsHelperInfiTools.mossyPickaxeID+7, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Glowstone, "glowstoneMossyPickaxe");
        	cactusMossyPickaxe = new InfiToolPickaxe(PropsHelperInfiTools.mossyPickaxeID+8, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Cactus, "cactusMossyPickaxe");
        	blazeMossyPickaxe = new InfiToolPickaxe(PropsHelperInfiTools.mossyPickaxeID+9, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Blaze, "blazeMossyPickaxe");
        	manyullynMossyPickaxe = new InfiToolPickaxe(PropsHelperInfiTools.mossyPickaxeID+10, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Manyullyn, "manyullynMossyPickaxe");
        	uraniumMossyPickaxe = new InfiToolPickaxe(PropsHelperInfiTools.mossyPickaxeID+11, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Uranium, "uraniumMossyPickaxe");
            
            MinecraftForge.setToolClass(woodMossyPickaxe, "pickaxe", InfiMaterialEnum.Mossy.getHarvestLevel());
            MinecraftForge.setToolClass(stoneMossyPickaxe, "pickaxe", InfiMaterialEnum.Mossy.getHarvestLevel());
            MinecraftForge.setToolClass(diamondMossyPickaxe, "pickaxe", InfiMaterialEnum.Mossy.getHarvestLevel());
            MinecraftForge.setToolClass(redstoneMossyPickaxe, "pickaxe", InfiMaterialEnum.Mossy.getHarvestLevel());
            MinecraftForge.setToolClass(boneMossyPickaxe, "pickaxe", InfiMaterialEnum.Mossy.getHarvestLevel());
            MinecraftForge.setToolClass(mossyMossyPickaxe, "pickaxe", InfiMaterialEnum.Mossy.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackMossyPickaxe, "pickaxe", InfiMaterialEnum.Mossy.getHarvestLevel());
            MinecraftForge.setToolClass(glowstoneMossyPickaxe, "pickaxe", InfiMaterialEnum.Mossy.getHarvestLevel());
            MinecraftForge.setToolClass(cactusMossyPickaxe, "pickaxe", InfiMaterialEnum.Mossy.getHarvestLevel());
            MinecraftForge.setToolClass(blazeMossyPickaxe, "pickaxe", InfiMaterialEnum.Mossy.getHarvestLevel());
            MinecraftForge.setToolClass(manyullynMossyPickaxe, "pickaxe", InfiMaterialEnum.Mossy.getHarvestLevel());
            MinecraftForge.setToolClass(uraniumMossyPickaxe, "pickaxe", InfiMaterialEnum.Mossy.getHarvestLevel());
        }
        
        if(PropsHelperInfiTools.enableNetherrackTools)
        {
        	woodNetherrackPickaxe = new InfiToolPickaxe(PropsHelperInfiTools.netherrackPickaxeID+0, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Wood, "woodNetherrackPickaxe");
        	stoneNetherrackPickaxe = new InfiToolPickaxe(PropsHelperInfiTools.netherrackPickaxeID+1, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Stone, "stoneNetherrackPickaxe");
        	sandstoneNetherrackPickaxe = new InfiToolPickaxe(PropsHelperInfiTools.netherrackPickaxeID+2, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Sandstone, "sandstoneNetherrackPickaxe");
        	boneNetherrackPickaxe = new InfiToolPickaxe(PropsHelperInfiTools.netherrackPickaxeID+3, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Bone, "boneNetherrackPickaxe");
        	paperNetherrackPickaxe = new InfiToolPickaxe(PropsHelperInfiTools.netherrackPickaxeID+4, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Paper, "paperNetherrackPickaxe");
        	mossyNetherrackPickaxe = new InfiToolPickaxe(PropsHelperInfiTools.netherrackPickaxeID+5, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Mossy, "mossyNetherrackPickaxe");
        	netherrackNetherrackPickaxe = new InfiToolPickaxe(PropsHelperInfiTools.netherrackPickaxeID+6, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Netherrack, "netherrackNetherrackPickaxe");
        	iceNetherrackPickaxe = new InfiToolPickaxe(PropsHelperInfiTools.netherrackPickaxeID+7, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Ice, "iceNetherrackPickaxe");
        	slimeNetherrackPickaxe = new InfiToolPickaxe(PropsHelperInfiTools.netherrackPickaxeID+8, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Slime, "slimeNetherrackPickaxe");
        	cactusNetherrackPickaxe = new InfiToolPickaxe(PropsHelperInfiTools.netherrackPickaxeID+9, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Cactus, "cactusNetherrackPickaxe");
        	flintNetherrackPickaxe = new InfiToolPickaxe(PropsHelperInfiTools.netherrackPickaxeID+10, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Flint, "flintNetherrackPickaxe");
        	copperNetherrackPickaxe = new InfiToolPickaxe(PropsHelperInfiTools.netherrackPickaxeID+11, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Copper, "copperNetherrackPickaxe");
        	bronzeNetherrackPickaxe = new InfiToolPickaxe(PropsHelperInfiTools.netherrackPickaxeID+12, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Bronze, "bronzeNetherrackPickaxe");
            
            MinecraftForge.setToolClass(woodNetherrackPickaxe, "pickaxe", InfiMaterialEnum.Netherrack.getHarvestLevel());
            MinecraftForge.setToolClass(stoneNetherrackPickaxe, "pickaxe", InfiMaterialEnum.Netherrack.getHarvestLevel());
            MinecraftForge.setToolClass(sandstoneNetherrackPickaxe, "pickaxe", InfiMaterialEnum.Netherrack.getHarvestLevel());
            MinecraftForge.setToolClass(boneNetherrackPickaxe, "pickaxe", InfiMaterialEnum.Netherrack.getHarvestLevel());
            MinecraftForge.setToolClass(paperNetherrackPickaxe, "pickaxe", InfiMaterialEnum.Netherrack.getHarvestLevel());
            MinecraftForge.setToolClass(mossyNetherrackPickaxe, "pickaxe", InfiMaterialEnum.Netherrack.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackNetherrackPickaxe, "pickaxe", InfiMaterialEnum.Netherrack.getHarvestLevel());
            MinecraftForge.setToolClass(iceNetherrackPickaxe, "pickaxe", InfiMaterialEnum.Netherrack.getHarvestLevel());
            MinecraftForge.setToolClass(slimeNetherrackPickaxe, "pickaxe", InfiMaterialEnum.Netherrack.getHarvestLevel());
            MinecraftForge.setToolClass(cactusNetherrackPickaxe, "pickaxe", InfiMaterialEnum.Netherrack.getHarvestLevel());
            MinecraftForge.setToolClass(flintNetherrackPickaxe, "pickaxe", InfiMaterialEnum.Netherrack.getHarvestLevel());
            MinecraftForge.setToolClass(copperNetherrackPickaxe, "pickaxe", InfiMaterialEnum.Netherrack.getHarvestLevel());
            MinecraftForge.setToolClass(bronzeNetherrackPickaxe, "pickaxe", InfiMaterialEnum.Netherrack.getHarvestLevel());
        }
        
        if(PropsHelperInfiTools.enableGlowstoneTools)
        {
        	woodGlowstonePickaxe = new InfiToolPickaxe(PropsHelperInfiTools.glowstonePickaxeID+0, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Wood, "woodGlowstonePickaxe");
        	redstoneGlowstonePickaxe = new InfiToolPickaxe(PropsHelperInfiTools.glowstonePickaxeID+1, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Redstone, "redstoneGlowstonePickaxe");
        	obsidianGlowstonePickaxe = new InfiToolPickaxe(PropsHelperInfiTools.glowstonePickaxeID+2, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Obsidian, "obsidianGlowstonePickaxe");
        	boneGlowstonePickaxe = new InfiToolPickaxe(PropsHelperInfiTools.glowstonePickaxeID+3, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Bone, "boneGlowstonePickaxe");
        	netherrackGlowstonePickaxe = new InfiToolPickaxe(PropsHelperInfiTools.glowstonePickaxeID+4, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Netherrack, "netherrackGlowstonePickaxe");
        	glowstoneGlowstonePickaxe = new InfiToolPickaxe(PropsHelperInfiTools.glowstonePickaxeID+5, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Glowstone, "glowstoneGlowstonePickaxe");
        	iceGlowstonePickaxe = new InfiToolPickaxe(PropsHelperInfiTools.glowstonePickaxeID+6, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Ice, "iceGlowstonePickaxe");
        	slimeGlowstonePickaxe = new InfiToolPickaxe(PropsHelperInfiTools.glowstonePickaxeID+7, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Slime, "slimeGlowstonePickaxe");
        	cactusGlowstonePickaxe = new InfiToolPickaxe(PropsHelperInfiTools.glowstonePickaxeID+8, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Cactus, "cactusGlowstonePickaxe");
            
            
            MinecraftForge.setToolClass(woodGlowstonePickaxe, "pickaxe", InfiMaterialEnum.Glowstone.getHarvestLevel());
            MinecraftForge.setToolClass(redstoneGlowstonePickaxe, "pickaxe", InfiMaterialEnum.Glowstone.getHarvestLevel());
            MinecraftForge.setToolClass(obsidianGlowstonePickaxe, "pickaxe", InfiMaterialEnum.Glowstone.getHarvestLevel());
            MinecraftForge.setToolClass(boneGlowstonePickaxe, "pickaxe", InfiMaterialEnum.Glowstone.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackGlowstonePickaxe, "pickaxe", InfiMaterialEnum.Glowstone.getHarvestLevel());
            MinecraftForge.setToolClass(glowstoneGlowstonePickaxe, "pickaxe", InfiMaterialEnum.Glowstone.getHarvestLevel());
            MinecraftForge.setToolClass(iceGlowstonePickaxe, "pickaxe", InfiMaterialEnum.Glowstone.getHarvestLevel());
            MinecraftForge.setToolClass(slimeGlowstonePickaxe, "pickaxe", InfiMaterialEnum.Glowstone.getHarvestLevel());
            MinecraftForge.setToolClass(cactusGlowstonePickaxe, "pickaxe", InfiMaterialEnum.Glowstone.getHarvestLevel());
        }
        
        if(PropsHelperInfiTools.enableIceTools)
        {
        	woodIcePickaxe = new InfiToolPickaxe(PropsHelperInfiTools.icePickaxeID+0, 
                    InfiMaterialEnum.Ice, InfiMaterialEnum.Wood, "woodIcePickaxe");
        	boneIcePickaxe = new InfiToolPickaxe(PropsHelperInfiTools.icePickaxeID+1, 
                    InfiMaterialEnum.Ice, InfiMaterialEnum.Bone, "boneIcePickaxe");
        	paperIcePickaxe = new InfiToolPickaxe(PropsHelperInfiTools.icePickaxeID+2, 
                    InfiMaterialEnum.Ice, InfiMaterialEnum.Paper, "paperIcePickaxe");
        	iceIcePickaxe = new InfiToolPickaxe(PropsHelperInfiTools.icePickaxeID+3, 
                    InfiMaterialEnum.Ice, InfiMaterialEnum.Ice, "iceIcePickaxe");
        	slimeIcePickaxe = new InfiToolPickaxe(PropsHelperInfiTools.icePickaxeID+4, 
                    InfiMaterialEnum.Ice, InfiMaterialEnum.Slime, "slimeIcePickaxe");
        	cactusIcePickaxe = new InfiToolPickaxe(PropsHelperInfiTools.icePickaxeID+5, 
                    InfiMaterialEnum.Ice, InfiMaterialEnum.Cactus, "cactusIcePickaxe");
            
            
            MinecraftForge.setToolClass(woodIcePickaxe, "pickaxe", InfiMaterialEnum.Ice.getHarvestLevel());
            MinecraftForge.setToolClass(boneIcePickaxe, "pickaxe", InfiMaterialEnum.Ice.getHarvestLevel());
            MinecraftForge.setToolClass(paperIcePickaxe, "pickaxe", InfiMaterialEnum.Ice.getHarvestLevel());
            MinecraftForge.setToolClass(iceIcePickaxe, "pickaxe", InfiMaterialEnum.Ice.getHarvestLevel());
            MinecraftForge.setToolClass(slimeIcePickaxe, "pickaxe", InfiMaterialEnum.Ice.getHarvestLevel());
            MinecraftForge.setToolClass(cactusIcePickaxe, "pickaxe", InfiMaterialEnum.Ice.getHarvestLevel());
        }
        
        if(PropsHelperInfiTools.enableLavaTools)
        {
        	diamondLavaPickaxe = new InfiToolPickaxe(PropsHelperInfiTools.lavaPickaxeID+0, 
                    InfiMaterialEnum.Lava, InfiMaterialEnum.Diamond, "diamondLavaPickaxe");
        	obsidianLavaPickaxe = new InfiToolPickaxe(PropsHelperInfiTools.lavaPickaxeID+1, 
                    InfiMaterialEnum.Lava, InfiMaterialEnum.Obsidian, "obsidianLavaPickaxe");
        	netherrackLavaPickaxe = new InfiToolPickaxe(PropsHelperInfiTools.lavaPickaxeID+2, 
                    InfiMaterialEnum.Lava, InfiMaterialEnum.Netherrack, "netherrackLavaPickaxe");
        	lavaLavaPickaxe = new InfiToolPickaxe(PropsHelperInfiTools.lavaPickaxeID+3, 
                    InfiMaterialEnum.Lava, InfiMaterialEnum.Lava, "lavaLavaPickaxe");
        	flintLavaPickaxe = new InfiToolPickaxe(PropsHelperInfiTools.lavaPickaxeID+4, 
                    InfiMaterialEnum.Lava, InfiMaterialEnum.Flint, "flintLavaPickaxe");
        	blazeLavaPickaxe = new InfiToolPickaxe(PropsHelperInfiTools.lavaPickaxeID+5, 
                    InfiMaterialEnum.Lava, InfiMaterialEnum.Blaze, "blazeLavaPickaxe");
        	manyullynLavaPickaxe = new InfiToolPickaxe(PropsHelperInfiTools.lavaPickaxeID+6, 
                    InfiMaterialEnum.Lava, InfiMaterialEnum.Manyullyn, "manyullynLavaPickaxe");
            uraniumLavaPickaxe = new InfiToolPickaxe(PropsHelperInfiTools.lavaPickaxeID+7, 
                    InfiMaterialEnum.Lava, InfiMaterialEnum.Uranium, "uraniumLavaPickaxe");
            
            MinecraftForge.setToolClass(diamondLavaPickaxe, "pickaxe", InfiMaterialEnum.Lava.getHarvestLevel());
            MinecraftForge.setToolClass(obsidianLavaPickaxe, "pickaxe", InfiMaterialEnum.Lava.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackLavaPickaxe, "pickaxe", InfiMaterialEnum.Lava.getHarvestLevel());
            MinecraftForge.setToolClass(lavaLavaPickaxe, "pickaxe", InfiMaterialEnum.Lava.getHarvestLevel());
            MinecraftForge.setToolClass(flintLavaPickaxe, "pickaxe", InfiMaterialEnum.Lava.getHarvestLevel());
            MinecraftForge.setToolClass(blazeLavaPickaxe, "pickaxe", InfiMaterialEnum.Lava.getHarvestLevel());
            MinecraftForge.setToolClass(manyullynLavaPickaxe, "pickaxe", InfiMaterialEnum.Lava.getHarvestLevel());
            MinecraftForge.setToolClass(uraniumLavaPickaxe, "pickaxe", InfiMaterialEnum.Lava.getHarvestLevel());
        }
        
        if(PropsHelperInfiTools.enableSlimeTools)
        {
        	woodSlimePickaxe = new InfiToolPickaxe(PropsHelperInfiTools.slimePickaxeID+0, 
                    InfiMaterialEnum.Slime, InfiMaterialEnum.Wood, "woodSlimePickaxe");
        	sandstoneSlimePickaxe = new InfiToolPickaxe(PropsHelperInfiTools.slimePickaxeID+1, 
                    InfiMaterialEnum.Slime, InfiMaterialEnum.Sandstone, "sandstoneSlimePickaxe");
        	boneSlimePickaxe = new InfiToolPickaxe(PropsHelperInfiTools.slimePickaxeID+2, 
                    InfiMaterialEnum.Slime, InfiMaterialEnum.Bone, "boneSlimePickaxe");
        	paperSlimePickaxe = new InfiToolPickaxe(PropsHelperInfiTools.slimePickaxeID+3, 
                    InfiMaterialEnum.Slime, InfiMaterialEnum.Paper, "paperSlimePickaxe");
        	slimeSlimePickaxe = new InfiToolPickaxe(PropsHelperInfiTools.slimePickaxeID+4, 
                    InfiMaterialEnum.Slime, InfiMaterialEnum.Slime, "slimeSlimePickaxe");
        	cactusSlimePickaxe = new InfiToolPickaxe(PropsHelperInfiTools.slimePickaxeID+5, 
                    InfiMaterialEnum.Slime, InfiMaterialEnum.Cactus, "cactusSlimePickaxe");
            
            MinecraftForge.setToolClass(woodSlimePickaxe, "pickaxe", InfiMaterialEnum.Slime.getHarvestLevel());
            MinecraftForge.setToolClass(sandstoneSlimePickaxe, "pickaxe", InfiMaterialEnum.Slime.getHarvestLevel());
            MinecraftForge.setToolClass(boneSlimePickaxe, "pickaxe", InfiMaterialEnum.Slime.getHarvestLevel());
            MinecraftForge.setToolClass(paperSlimePickaxe, "pickaxe", InfiMaterialEnum.Slime.getHarvestLevel());
            MinecraftForge.setToolClass(slimeSlimePickaxe, "pickaxe", InfiMaterialEnum.Slime.getHarvestLevel());
            MinecraftForge.setToolClass(cactusSlimePickaxe, "pickaxe", InfiMaterialEnum.Slime.getHarvestLevel());
        }
        
        if(PropsHelperInfiTools.enableCactusTools)
        {
        	woodCactusPickaxe = new InfiToolPickaxe(PropsHelperInfiTools.cactusPickaxeID+0, 
                    InfiMaterialEnum.Cactus, InfiMaterialEnum.Wood, "woodCactusPickaxe");
        	sandstoneCactusPickaxe = new InfiToolPickaxe(PropsHelperInfiTools.cactusPickaxeID+1, 
                    InfiMaterialEnum.Cactus, InfiMaterialEnum.Sandstone, "sandstoneCactusPickaxe");
        	boneCactusPickaxe = new InfiToolPickaxe(PropsHelperInfiTools.cactusPickaxeID+2, 
                    InfiMaterialEnum.Cactus, InfiMaterialEnum.Bone, "boneCactusPickaxe");
        	netherrackCactusPickaxe = new InfiToolPickaxe(PropsHelperInfiTools.cactusPickaxeID+3, 
                    InfiMaterialEnum.Cactus, InfiMaterialEnum.Netherrack, "netherrackCactusPickaxe");
        	iceCactusPickaxe = new InfiToolPickaxe(PropsHelperInfiTools.cactusPickaxeID+4, 
                    InfiMaterialEnum.Cactus, InfiMaterialEnum.Ice, "iceCactusPickaxe");
        	slimeCactusPickaxe = new InfiToolPickaxe(PropsHelperInfiTools.cactusPickaxeID+5, 
                    InfiMaterialEnum.Cactus, InfiMaterialEnum.Slime, "slimeCactusPickaxe");
        	cactusCactusPickaxe = new InfiToolPickaxe(PropsHelperInfiTools.cactusPickaxeID+6, 
                    InfiMaterialEnum.Cactus, InfiMaterialEnum.Cactus, "cactusCactusPickaxe");
            
            MinecraftForge.setToolClass(woodCactusPickaxe, "pickaxe", InfiMaterialEnum.Cactus.getHarvestLevel());
            MinecraftForge.setToolClass(sandstoneCactusPickaxe, "pickaxe", InfiMaterialEnum.Cactus.getHarvestLevel());
            MinecraftForge.setToolClass(boneCactusPickaxe, "pickaxe", InfiMaterialEnum.Cactus.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackCactusPickaxe, "pickaxe", InfiMaterialEnum.Cactus.getHarvestLevel());
            MinecraftForge.setToolClass(iceCactusPickaxe, "pickaxe", InfiMaterialEnum.Cactus.getHarvestLevel());
            MinecraftForge.setToolClass(slimeCactusPickaxe, "pickaxe", InfiMaterialEnum.Cactus.getHarvestLevel());
            MinecraftForge.setToolClass(cactusCactusPickaxe, "pickaxe", InfiMaterialEnum.Cactus.getHarvestLevel());
        }
        
        if(PropsHelperInfiTools.enableFlintTools)
        {
        	woodFlintPickaxe = new InfiToolPickaxe(PropsHelperInfiTools.flintPickaxeID+0, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Wood, "woodFlintPickaxe");
        	stoneFlintPickaxe = new InfiToolPickaxe(PropsHelperInfiTools.flintPickaxeID+1, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Stone, "stoneFlintPickaxe");
        	sandstoneFlintPickaxe = new InfiToolPickaxe(PropsHelperInfiTools.flintPickaxeID+2, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Sandstone, "sandstoneFlintPickaxe");
        	boneFlintPickaxe = new InfiToolPickaxe(PropsHelperInfiTools.flintPickaxeID+3, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Bone, "boneFlintPickaxe");
        	netherrackFlintPickaxe = new InfiToolPickaxe(PropsHelperInfiTools.flintPickaxeID+4, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Flint, "netherrackFlintPickaxe");
        	slimeFlintPickaxe = new InfiToolPickaxe(PropsHelperInfiTools.flintPickaxeID+5, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Slime, "slimeFlintPickaxe");
        	cactusFlintPickaxe = new InfiToolPickaxe(PropsHelperInfiTools.flintPickaxeID+6, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Cactus, "cactusFlintPickaxe");
        	flintFlintPickaxe = new InfiToolPickaxe(PropsHelperInfiTools.flintPickaxeID+7, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Flint, "flintFlintPickaxe");
        	copperFlintPickaxe = new InfiToolPickaxe(PropsHelperInfiTools.flintPickaxeID+8, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Copper, "copperFlintPickaxe");
        	bronzeFlintPickaxe = new InfiToolPickaxe(PropsHelperInfiTools.flintPickaxeID+9, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Bronze, "bronzeFlintPickaxe");
            
            MinecraftForge.setToolClass(woodFlintPickaxe, "pickaxe", InfiMaterialEnum.Flint.getHarvestLevel());
            MinecraftForge.setToolClass(stoneFlintPickaxe, "pickaxe", InfiMaterialEnum.Flint.getHarvestLevel());
            MinecraftForge.setToolClass(sandstoneFlintPickaxe, "pickaxe", InfiMaterialEnum.Flint.getHarvestLevel());
            MinecraftForge.setToolClass(boneFlintPickaxe, "pickaxe", InfiMaterialEnum.Flint.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackFlintPickaxe, "pickaxe", InfiMaterialEnum.Flint.getHarvestLevel());
            MinecraftForge.setToolClass(slimeFlintPickaxe, "pickaxe", InfiMaterialEnum.Flint.getHarvestLevel());
            MinecraftForge.setToolClass(cactusFlintPickaxe, "pickaxe", InfiMaterialEnum.Flint.getHarvestLevel());
            MinecraftForge.setToolClass(flintFlintPickaxe, "pickaxe", InfiMaterialEnum.Flint.getHarvestLevel());
            MinecraftForge.setToolClass(copperFlintPickaxe, "pickaxe", InfiMaterialEnum.Flint.getHarvestLevel());
            MinecraftForge.setToolClass(bronzeFlintPickaxe, "pickaxe", InfiMaterialEnum.Flint.getHarvestLevel());
        }
        
        if(PropsHelperInfiTools.enableBlazeTools)
        {
        	diamondBlazePickaxe = new InfiToolPickaxe(PropsHelperInfiTools.blazePickaxeID+0, 
                    InfiMaterialEnum.Blaze, InfiMaterialEnum.Diamond, "diamondBlazePickaxe");
        	obsidianBlazePickaxe = new InfiToolPickaxe(PropsHelperInfiTools.blazePickaxeID+1, 
                    InfiMaterialEnum.Blaze, InfiMaterialEnum.Obsidian, "obsidianBlazePickaxe");
        	netherrackBlazePickaxe = new InfiToolPickaxe(PropsHelperInfiTools.blazePickaxeID+2, 
                    InfiMaterialEnum.Blaze, InfiMaterialEnum.Netherrack, "netherrackBlazePickaxe");
        	lavaBlazePickaxe = new InfiToolPickaxe(PropsHelperInfiTools.blazePickaxeID+3, 
                    InfiMaterialEnum.Blaze, InfiMaterialEnum.Lava, "lavaBlazePickaxe");
        	flintBlazePickaxe = new InfiToolPickaxe(PropsHelperInfiTools.blazePickaxeID+4, 
                    InfiMaterialEnum.Blaze, InfiMaterialEnum.Flint, "flintBlazePickaxe");
        	blazeBlazePickaxe = new InfiToolPickaxe(PropsHelperInfiTools.blazePickaxeID+5, 
                    InfiMaterialEnum.Blaze, InfiMaterialEnum.Blaze, "blazeBlazePickaxe");
        	manyullynBlazePickaxe = new InfiToolPickaxe(PropsHelperInfiTools.blazePickaxeID+6, 
                    InfiMaterialEnum.Blaze, InfiMaterialEnum.Manyullyn, "manyullynBlazePickaxe");
            uraniumBlazePickaxe = new InfiToolPickaxe(PropsHelperInfiTools.blazePickaxeID+7, 
                    InfiMaterialEnum.Blaze, InfiMaterialEnum.Uranium, "uraniumBlazePickaxe");
            
            MinecraftForge.setToolClass(diamondBlazePickaxe, "pickaxe", InfiMaterialEnum.Blaze.getHarvestLevel());
            MinecraftForge.setToolClass(obsidianBlazePickaxe, "pickaxe", InfiMaterialEnum.Blaze.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackBlazePickaxe, "pickaxe", InfiMaterialEnum.Blaze.getHarvestLevel());
            MinecraftForge.setToolClass(blazeBlazePickaxe, "pickaxe", InfiMaterialEnum.Blaze.getHarvestLevel());
            MinecraftForge.setToolClass(flintBlazePickaxe, "pickaxe", InfiMaterialEnum.Blaze.getHarvestLevel());
            MinecraftForge.setToolClass(blazeBlazePickaxe, "pickaxe", InfiMaterialEnum.Blaze.getHarvestLevel());
            MinecraftForge.setToolClass(manyullynBlazePickaxe, "pickaxe", InfiMaterialEnum.Blaze.getHarvestLevel());
            MinecraftForge.setToolClass(uraniumBlazePickaxe, "pickaxe", InfiMaterialEnum.Blaze.getHarvestLevel());
        }
    	
        if(PropsHelperInfiTools.enableCopperTools)
        {
        	woodCopperPickaxe = new InfiToolPickaxe(PropsHelperInfiTools.copperPickaxeID+0, 
                    InfiMaterialEnum.Copper, InfiMaterialEnum.Wood, "woodCopperPickaxe");
            stoneCopperPickaxe = new InfiToolPickaxe(PropsHelperInfiTools.copperPickaxeID+1, 
                    InfiMaterialEnum.Copper, InfiMaterialEnum.Stone, "stoneCopperPickaxe");
            boneCopperPickaxe = new InfiToolPickaxe(PropsHelperInfiTools.copperPickaxeID+2, 
                    InfiMaterialEnum.Copper, InfiMaterialEnum.Bone, "boneCopperPickaxe");
            netherrackCopperPickaxe = new InfiToolPickaxe(PropsHelperInfiTools.copperPickaxeID+3, 
                    InfiMaterialEnum.Copper, InfiMaterialEnum.Netherrack, "netherrackCopperPickaxe");
            slimeCopperPickaxe = new InfiToolPickaxe(PropsHelperInfiTools.copperPickaxeID+4, 
                    InfiMaterialEnum.Copper, InfiMaterialEnum.Slime, "slimeCopperPickaxe");
            cactusCopperPickaxe = new InfiToolPickaxe(PropsHelperInfiTools.copperPickaxeID+5, 
                    InfiMaterialEnum.Copper, InfiMaterialEnum.Cactus, "cactusCopperPickaxe");
            flintCopperPickaxe = new InfiToolPickaxe(PropsHelperInfiTools.copperPickaxeID+6, 
                    InfiMaterialEnum.Copper, InfiMaterialEnum.Flint, "flintCopperPickaxe");
            copperCopperPickaxe = new InfiToolPickaxe(PropsHelperInfiTools.copperPickaxeID+7, 
                    InfiMaterialEnum.Copper, InfiMaterialEnum.Copper, "copperCopperPickaxe");
            
            MinecraftForge.setToolClass(woodCopperPickaxe, "pickaxe", InfiMaterialEnum.Copper.getHarvestLevel());
        	MinecraftForge.setToolClass(stoneCopperPickaxe, "pickaxe", InfiMaterialEnum.Copper.getHarvestLevel());
            MinecraftForge.setToolClass(boneCopperPickaxe, "pickaxe", InfiMaterialEnum.Copper.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackCopperPickaxe, "pickaxe", InfiMaterialEnum.Copper.getHarvestLevel());
            MinecraftForge.setToolClass(slimeCopperPickaxe, "pickaxe", InfiMaterialEnum.Copper.getHarvestLevel());
            MinecraftForge.setToolClass(cactusCopperPickaxe, "pickaxe", InfiMaterialEnum.Copper.getHarvestLevel());
            MinecraftForge.setToolClass(flintCopperPickaxe, "pickaxe", InfiMaterialEnum.Copper.getHarvestLevel());
            MinecraftForge.setToolClass(copperCopperPickaxe, "pickaxe", InfiMaterialEnum.Copper.getHarvestLevel());
        }
        
        if(PropsHelperInfiTools.enableBronzeTools)
        {
        	woodBronzePickaxe = new InfiToolPickaxe(PropsHelperInfiTools.bronzePickaxeID+0, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Wood, "woodBronzePickaxe");
            stoneBronzePickaxe = new InfiToolPickaxe(PropsHelperInfiTools.bronzePickaxeID+1, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Stone, "stoneBronzePickaxe");
            boneBronzePickaxe = new InfiToolPickaxe(PropsHelperInfiTools.bronzePickaxeID+2, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Bone, "boneBronzePickaxe");
            netherrackBronzePickaxe = new InfiToolPickaxe(PropsHelperInfiTools.bronzePickaxeID+3, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Netherrack, "netherrackBronzePickaxe");
            slimeBronzePickaxe = new InfiToolPickaxe(PropsHelperInfiTools.bronzePickaxeID+4, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Slime, "slimeBronzePickaxe");
            cactusBronzePickaxe = new InfiToolPickaxe(PropsHelperInfiTools.bronzePickaxeID+5, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Cactus, "cactusBronzePickaxe");
            flintBronzePickaxe = new InfiToolPickaxe(PropsHelperInfiTools.bronzePickaxeID+6, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Flint, "flintBronzePickaxe");
            copperBronzePickaxe = new InfiToolPickaxe(PropsHelperInfiTools.bronzePickaxeID+7, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Copper, "copperBronzePickaxe");
            bronzeBronzePickaxe = new InfiToolPickaxe(PropsHelperInfiTools.bronzePickaxeID+8, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Bronze, "copperBronzePickaxe");
            
            MinecraftForge.setToolClass(woodBronzePickaxe, "pickaxe", InfiMaterialEnum.Bronze.getHarvestLevel());
            MinecraftForge.setToolClass(stoneBronzePickaxe, "pickaxe", InfiMaterialEnum.Bronze.getHarvestLevel());
            MinecraftForge.setToolClass(boneBronzePickaxe, "pickaxe", InfiMaterialEnum.Bronze.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackBronzePickaxe, "pickaxe", InfiMaterialEnum.Bronze.getHarvestLevel());
            MinecraftForge.setToolClass(slimeBronzePickaxe, "pickaxe", InfiMaterialEnum.Bronze.getHarvestLevel());
            MinecraftForge.setToolClass(cactusBronzePickaxe, "pickaxe", InfiMaterialEnum.Bronze.getHarvestLevel());
            MinecraftForge.setToolClass(flintBronzePickaxe, "pickaxe", InfiMaterialEnum.Bronze.getHarvestLevel());
            MinecraftForge.setToolClass(copperBronzePickaxe, "pickaxe", InfiMaterialEnum.Bronze.getHarvestLevel());
            MinecraftForge.setToolClass(bronzeBronzePickaxe, "pickaxe", InfiMaterialEnum.Bronze.getHarvestLevel());
        }
        
        if(PropsHelperInfiTools.enableWorkedIronTools)
        {
        	woodWorkedIronPickaxe = new InfiToolPickaxe(PropsHelperInfiTools.workedIronPickaxeID+0, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Wood, "woodWorkedIronPickaxe");
            stoneWorkedIronPickaxe = new InfiToolPickaxe(PropsHelperInfiTools.workedIronPickaxeID+1, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Stone, "stoneWorkedIronPickaxe");
            ironWorkedIronPickaxe = new InfiToolPickaxe(PropsHelperInfiTools.workedIronPickaxeID+2,
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Iron, "ironWorkedIronPickaxe");
            diamondWorkedIronPickaxe = new InfiToolPickaxe(PropsHelperInfiTools.workedIronPickaxeID+3, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Diamond, "diamondWorkedIronPickaxe");
            redstoneWorkedIronPickaxe = new InfiToolPickaxe(PropsHelperInfiTools.workedIronPickaxeID+4, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Redstone, "redstoneWorkedIronPickaxe");
            obsidianWorkedIronPickaxe = new InfiToolPickaxe(PropsHelperInfiTools.workedIronPickaxeID+5, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Obsidian, "obsidianWorkedIronPickaxe");
            boneWorkedIronPickaxe = new InfiToolPickaxe(PropsHelperInfiTools.workedIronPickaxeID+6, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Bone, "boneWorkedIronPickaxe");
            netherrackWorkedIronPickaxe = new InfiToolPickaxe(PropsHelperInfiTools.workedIronPickaxeID+7, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Netherrack, "netherrackWorkedIronPickaxe");
            glowstoneWorkedIronPickaxe = new InfiToolPickaxe(PropsHelperInfiTools.workedIronPickaxeID+8, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Glowstone, "glowstoneWorkedIronPickaxe");
            iceWorkedIronPickaxe = new InfiToolPickaxe(PropsHelperInfiTools.workedIronPickaxeID+9, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Ice, "iceWorkedIronPickaxe");
            slimeWorkedIronPickaxe = new InfiToolPickaxe(PropsHelperInfiTools.workedIronPickaxeID+10, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Slime, "slimeWorkedIronPickaxe");
            cactusWorkedIronPickaxe = new InfiToolPickaxe(PropsHelperInfiTools.workedIronPickaxeID+11, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Cactus, "cactusWorkedIronPickaxe");
            blazeWorkedIronPickaxe = new InfiToolPickaxe(PropsHelperInfiTools.workedIronPickaxeID+12, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Blaze, "blazeWorkedIronPickaxe");
            copperWorkedIronPickaxe = new InfiToolPickaxe(PropsHelperInfiTools.workedIronPickaxeID+13, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Copper, "copperWorkedIronPickaxe");
            bronzeWorkedIronPickaxe = new InfiToolPickaxe(PropsHelperInfiTools.workedIronPickaxeID+14, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Bronze, "bronzeWorkedIronPickaxe");
            workedWorkedIronPickaxe = new InfiToolPickaxe(PropsHelperInfiTools.workedIronPickaxeID+15, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.WorkedIron, "workedWorkedIronPickaxe");
            steelWorkedIronPickaxe = new InfiToolPickaxe(PropsHelperInfiTools.workedIronPickaxeID+16, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Steel, "steelWorkedIronPickaxe");
            uraniumWorkedIronPickaxe = new InfiToolPickaxe(PropsHelperInfiTools.workedIronPickaxeID+17, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Bronze, "uraniumWorkedIronPickaxe");
            
            MinecraftForge.setToolClass(woodWorkedIronPickaxe, "pickaxe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(stoneWorkedIronPickaxe, "pickaxe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(ironWorkedIronPickaxe, "pickaxe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(diamondWorkedIronPickaxe, "pickaxe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(redstoneWorkedIronPickaxe, "pickaxe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(obsidianWorkedIronPickaxe, "pickaxe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(boneWorkedIronPickaxe, "pickaxe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackWorkedIronPickaxe, "pickaxe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(glowstoneWorkedIronPickaxe, "pickaxe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(iceWorkedIronPickaxe, "pickaxe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(slimeWorkedIronPickaxe, "pickaxe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(cactusWorkedIronPickaxe, "pickaxe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(blazeWorkedIronPickaxe, "pickaxe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(copperWorkedIronPickaxe, "pickaxe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(bronzeWorkedIronPickaxe, "pickaxe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(workedWorkedIronPickaxe, "pickaxe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(steelWorkedIronPickaxe, "pickaxe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(uraniumWorkedIronPickaxe, "pickaxe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
        }
        
        if(PropsHelperInfiTools.enableSteelTools)
        {
        	woodSteelPickaxe = new InfiToolPickaxe(PropsHelperInfiTools.steelPickaxeID+0, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Wood, "woodSteelPickaxe");
            stoneSteelPickaxe = new InfiToolPickaxe(PropsHelperInfiTools.steelPickaxeID+1, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Stone, "stoneSteelPickaxe");
            ironSteelPickaxe = new InfiToolPickaxe(PropsHelperInfiTools.steelPickaxeID+2, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Iron, "ironSteelPickaxe");
            diamondSteelPickaxe = new InfiToolPickaxe(PropsHelperInfiTools.steelPickaxeID+3, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Diamond, "diamondSteelPickaxe");
            redstoneSteelPickaxe = new InfiToolPickaxe(PropsHelperInfiTools.steelPickaxeID+4, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Redstone, "redstoneSteelPickaxe");
            obsidianSteelPickaxe = new InfiToolPickaxe(PropsHelperInfiTools.steelPickaxeID+5, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Obsidian, "obsidianSteelPickaxe");
            boneSteelPickaxe = new InfiToolPickaxe(PropsHelperInfiTools.steelPickaxeID+6, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Bone, "boneSteelPickaxe");
            netherrackSteelPickaxe = new InfiToolPickaxe(PropsHelperInfiTools.steelPickaxeID+7, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Netherrack, "netherrackSteelPickaxe");
            glowstoneSteelPickaxe = new InfiToolPickaxe(PropsHelperInfiTools.steelPickaxeID+8, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Glowstone, "glowstoneSteelPickaxe");
            iceSteelPickaxe = new InfiToolPickaxe(PropsHelperInfiTools.steelPickaxeID+9, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Ice, "iceSteelPickaxe");
            slimeSteelPickaxe = new InfiToolPickaxe(PropsHelperInfiTools.steelPickaxeID+10, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Slime, "slimeSteelPickaxe");
            cactusSteelPickaxe = new InfiToolPickaxe(PropsHelperInfiTools.steelPickaxeID+11, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Cactus, "cactusSteelPickaxe");
            blazeSteelPickaxe = new InfiToolPickaxe(PropsHelperInfiTools.steelPickaxeID+12, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Blaze, "blazeSteelPickaxe");
            copperSteelPickaxe = new InfiToolPickaxe(PropsHelperInfiTools.steelPickaxeID+13, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Copper, "copperSteelPickaxe");
            bronzeSteelPickaxe = new InfiToolPickaxe(PropsHelperInfiTools.steelPickaxeID+14, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Bronze, "bronzeSteelPickaxe");
            workedSteelPickaxe = new InfiToolPickaxe(PropsHelperInfiTools.steelPickaxeID+15, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.WorkedIron, "workedSteelPickaxe");
            steelSteelPickaxe = new InfiToolPickaxe(PropsHelperInfiTools.steelPickaxeID+16, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Steel, "steelSteelPickaxe");
            cobaltSteelPickaxe = new InfiToolPickaxe(PropsHelperInfiTools.steelPickaxeID+17, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Cobalt, "cobaltSteelPickaxe");
            arditeSteelPickaxe = new InfiToolPickaxe(PropsHelperInfiTools.steelPickaxeID+18, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Ardite, "arditeSteelPickaxe");
            uraniumSteelPickaxe = new InfiToolPickaxe(PropsHelperInfiTools.steelPickaxeID+19, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Bronze, "uraniumSteelPickaxe");

            MinecraftForge.setToolClass(woodSteelPickaxe, "pickaxe", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(stoneSteelPickaxe, "pickaxe", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(ironSteelPickaxe, "pickaxe", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(diamondSteelPickaxe, "pickaxe", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(redstoneSteelPickaxe, "pickaxe", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(obsidianSteelPickaxe, "pickaxe", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(boneSteelPickaxe, "pickaxe", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackSteelPickaxe, "pickaxe", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(glowstoneSteelPickaxe, "pickaxe", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(iceSteelPickaxe, "pickaxe", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(slimeSteelPickaxe, "pickaxe", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(cactusSteelPickaxe, "pickaxe", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(blazeSteelPickaxe, "pickaxe", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(copperSteelPickaxe, "pickaxe", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(bronzeSteelPickaxe, "pickaxe", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(workedSteelPickaxe, "pickaxe", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(steelSteelPickaxe, "pickaxe", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(cobaltSteelPickaxe, "pickaxe", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(arditeSteelPickaxe, "pickaxe", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(uraniumSteelPickaxe, "pickaxe", InfiMaterialEnum.Steel.getHarvestLevel());
        }
        
        if(PropsHelperInfiTools.enableCobaltTools)
        {
        	woodCobaltPickaxe = new InfiToolPickaxe(PropsHelperInfiTools.cobaltPickaxeID+0, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Wood, "woodCobaltPickaxe");
            stoneCobaltPickaxe = new InfiToolPickaxe(PropsHelperInfiTools.cobaltPickaxeID+1, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Stone, "stoneCobaltPickaxe");
            ironCobaltPickaxe = new InfiToolPickaxe(PropsHelperInfiTools.cobaltPickaxeID+2, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Iron, "ironCobaltPickaxe");
            diamondCobaltPickaxe = new InfiToolPickaxe(PropsHelperInfiTools.cobaltPickaxeID+3,
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Diamond, "diamondCobaltPickaxe");
            redstoneCobaltPickaxe = new InfiToolPickaxe(PropsHelperInfiTools.cobaltPickaxeID+4, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Redstone, "redstoneCobaltPickaxe");
            obsidianCobaltPickaxe = new InfiToolPickaxe(PropsHelperInfiTools.cobaltPickaxeID+5, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Obsidian, "obsidianCobaltPickaxe");
            boneCobaltPickaxe = new InfiToolPickaxe(PropsHelperInfiTools.cobaltPickaxeID+6, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Bone, "boneCobaltPickaxe");
            slimeCobaltPickaxe = new InfiToolPickaxe(PropsHelperInfiTools.cobaltPickaxeID+7, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Slime, "slimeCobaltPickaxe");
            cactusCobaltPickaxe = new InfiToolPickaxe(PropsHelperInfiTools.cobaltPickaxeID+8, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Cactus, "cactusCobaltPickaxe");
            blazeCobaltPickaxe = new InfiToolPickaxe(PropsHelperInfiTools.cobaltPickaxeID+9, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Blaze, "blazeCobaltPickaxe");
            copperCobaltPickaxe = new InfiToolPickaxe(PropsHelperInfiTools.cobaltPickaxeID+10, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Copper, "copperCobaltPickaxe");
            bronzeCobaltPickaxe = new InfiToolPickaxe(PropsHelperInfiTools.cobaltPickaxeID+11, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Bronze, "bronzeCobaltPickaxe");
            workedCobaltPickaxe = new InfiToolPickaxe(PropsHelperInfiTools.cobaltPickaxeID+12, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.WorkedIron, "workedCobaltPickaxe");
            steelCobaltPickaxe = new InfiToolPickaxe(PropsHelperInfiTools.cobaltPickaxeID+13, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Steel, "steelCobaltPickaxe");
            cobaltCobaltPickaxe = new InfiToolPickaxe(PropsHelperInfiTools.cobaltPickaxeID+14, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Cobalt, "cobaltCobaltPickaxe");
            arditeCobaltPickaxe = new InfiToolPickaxe(PropsHelperInfiTools.cobaltPickaxeID+15, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Ardite, "arditeCobaltPickaxe");
            manyullynCobaltPickaxe = new InfiToolPickaxe(PropsHelperInfiTools.cobaltPickaxeID+16, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Manyullyn, "arditeCobaltPickaxe");
            uraniumCobaltPickaxe = new InfiToolPickaxe(PropsHelperInfiTools.cobaltPickaxeID+17, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Bronze, "uraniumCobaltPickaxe");
            
            MinecraftForge.setToolClass(woodCobaltPickaxe, "pickaxe", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(stoneCobaltPickaxe, "pickaxe", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(ironCobaltPickaxe, "pickaxe", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(diamondCobaltPickaxe, "pickaxe", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(redstoneCobaltPickaxe, "pickaxe", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(obsidianCobaltPickaxe, "pickaxe", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(boneCobaltPickaxe, "pickaxe", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(slimeCobaltPickaxe, "pickaxe", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(cactusCobaltPickaxe, "pickaxe", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(blazeCobaltPickaxe, "pickaxe", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(copperCobaltPickaxe, "pickaxe", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(bronzeCobaltPickaxe, "pickaxe", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(workedCobaltPickaxe, "pickaxe", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(steelCobaltPickaxe, "pickaxe", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(cobaltCobaltPickaxe, "pickaxe", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(arditeCobaltPickaxe, "pickaxe", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(manyullynCobaltPickaxe, "pickaxe", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(uraniumCobaltPickaxe, "pickaxe", InfiMaterialEnum.Cobalt.getHarvestLevel());
        }
        
        if(PropsHelperInfiTools.enableArditeTools)
        {
        	woodArditePickaxe = new InfiToolPickaxe(PropsHelperInfiTools.arditePickaxeID+0, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Wood, "woodArditePickaxe");
            stoneArditePickaxe = new InfiToolPickaxe(PropsHelperInfiTools.arditePickaxeID+1, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Stone, "stoneArditePickaxe");
            ironArditePickaxe = new InfiToolPickaxe(PropsHelperInfiTools.arditePickaxeID+2, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Iron, "ironArditePickaxe");
            diamondArditePickaxe = new InfiToolPickaxe(PropsHelperInfiTools.arditePickaxeID+3,
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Diamond, "diamondArditePickaxe");
            redstoneArditePickaxe = new InfiToolPickaxe(PropsHelperInfiTools.arditePickaxeID+4, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Redstone, "redstoneArditePickaxe");
            obsidianArditePickaxe = new InfiToolPickaxe(PropsHelperInfiTools.arditePickaxeID+5, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Obsidian, "obsidianArditePickaxe");
            boneArditePickaxe = new InfiToolPickaxe(PropsHelperInfiTools.arditePickaxeID+6,
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Bone, "boneArditePickaxe");
            slimeArditePickaxe = new InfiToolPickaxe(PropsHelperInfiTools.arditePickaxeID+7, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Slime, "slimeArditePickaxe");
            cactusArditePickaxe = new InfiToolPickaxe(PropsHelperInfiTools.arditePickaxeID+8, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Cactus, "cactusArditePickaxe");
            blazeArditePickaxe = new InfiToolPickaxe(PropsHelperInfiTools.arditePickaxeID+9, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Blaze, "blazeArditePickaxe");
            copperArditePickaxe = new InfiToolPickaxe(PropsHelperInfiTools.arditePickaxeID+10, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Copper, "copperArditePickaxe");
            bronzeArditePickaxe = new InfiToolPickaxe(PropsHelperInfiTools.arditePickaxeID+11, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Bronze, "bronzeArditePickaxe");
            workedArditePickaxe = new InfiToolPickaxe(PropsHelperInfiTools.arditePickaxeID+12, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.WorkedIron, "workedArditePickaxe");
            steelArditePickaxe = new InfiToolPickaxe(PropsHelperInfiTools.arditePickaxeID+13, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Steel, "steelArditePickaxe");
            cobaltArditePickaxe = new InfiToolPickaxe(PropsHelperInfiTools.arditePickaxeID+14, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Cobalt, "cobaltArditePickaxe");
            arditeArditePickaxe = new InfiToolPickaxe(PropsHelperInfiTools.arditePickaxeID+15, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Ardite, "arditeArditePickaxe");
            manyullynArditePickaxe = new InfiToolPickaxe(PropsHelperInfiTools.arditePickaxeID+16, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Manyullyn, "arditeArditePickaxe");
            uraniumArditePickaxe = new InfiToolPickaxe(PropsHelperInfiTools.arditePickaxeID+17, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Bronze, "uraniumArditePickaxe");
            
            MinecraftForge.setToolClass(woodArditePickaxe, "pickaxe", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(stoneArditePickaxe, "pickaxe", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(ironArditePickaxe, "pickaxe", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(diamondArditePickaxe, "pickaxe", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(redstoneArditePickaxe, "pickaxe", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(obsidianArditePickaxe, "pickaxe", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(boneArditePickaxe, "pickaxe", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(slimeArditePickaxe, "pickaxe", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(cactusArditePickaxe, "pickaxe", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(blazeArditePickaxe, "pickaxe", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(copperArditePickaxe, "pickaxe", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(bronzeArditePickaxe, "pickaxe", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(workedArditePickaxe, "pickaxe", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(steelArditePickaxe, "pickaxe", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(cobaltArditePickaxe, "pickaxe", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(arditeArditePickaxe, "pickaxe", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(manyullynArditePickaxe, "pickaxe", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(uraniumArditePickaxe, "pickaxe", InfiMaterialEnum.Ardite.getHarvestLevel());
        }
        
        if(PropsHelperInfiTools.enableManyullynTools)
        {
        	woodManyullynPickaxe = new InfiToolPickaxe(PropsHelperInfiTools.manyullynPickaxeID+0, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Stone, "woodManyullynPickaxe");
            stoneManyullynPickaxe = new InfiToolPickaxe(PropsHelperInfiTools.manyullynPickaxeID+1, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Stone, "stoneManyullynPickaxe");
            ironManyullynPickaxe = new InfiToolPickaxe(PropsHelperInfiTools.manyullynPickaxeID+2, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Iron, "ironManyullynPickaxe");
            diamondManyullynPickaxe = new InfiToolPickaxe(PropsHelperInfiTools.manyullynPickaxeID+3,
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Diamond, "diamondManyullynPickaxe");
            redstoneManyullynPickaxe = new InfiToolPickaxe(PropsHelperInfiTools.manyullynPickaxeID+4, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Redstone, "redstoneManyullynPickaxe");
            obsidianManyullynPickaxe = new InfiToolPickaxe(PropsHelperInfiTools.manyullynPickaxeID+5, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Obsidian, "obsidianManyullynPickaxe");
            boneManyullynPickaxe = new InfiToolPickaxe(PropsHelperInfiTools.manyullynPickaxeID+6, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Bone, "boneManyullynPickaxe");
            slimeManyullynPickaxe = new InfiToolPickaxe(PropsHelperInfiTools.manyullynPickaxeID+7, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Slime, "slimeManyullynPickaxe");
            cactusManyullynPickaxe = new InfiToolPickaxe(PropsHelperInfiTools.manyullynPickaxeID+8, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Cactus, "cactusManyullynPickaxe");
            blazeManyullynPickaxe = new InfiToolPickaxe(PropsHelperInfiTools.manyullynPickaxeID+9, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Blaze, "blazeManyullynPickaxe");
            copperManyullynPickaxe = new InfiToolPickaxe(PropsHelperInfiTools.manyullynPickaxeID+10, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Copper, "copperManyullynPickaxe");
            bronzeManyullynPickaxe = new InfiToolPickaxe(PropsHelperInfiTools.manyullynPickaxeID+11, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Bronze, "bronzeManyullynPickaxe");
            workedManyullynPickaxe = new InfiToolPickaxe(PropsHelperInfiTools.manyullynPickaxeID+12, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.WorkedIron, "workedManyullynPickaxe");
            steelManyullynPickaxe = new InfiToolPickaxe(PropsHelperInfiTools.manyullynPickaxeID+13, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Steel, "steelManyullynPickaxe");
            cobaltManyullynPickaxe = new InfiToolPickaxe(PropsHelperInfiTools.manyullynPickaxeID+14, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Cobalt, "cobaltManyullynPickaxe");
            arditeManyullynPickaxe = new InfiToolPickaxe(PropsHelperInfiTools.manyullynPickaxeID+15, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Ardite, "arditeManyullynPickaxe");
            manyullynManyullynPickaxe = new InfiToolPickaxe(PropsHelperInfiTools.manyullynPickaxeID+16, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Manyullyn, "arditeManyullynPickaxe");
            uraniumManyullynPickaxe = new InfiToolPickaxe(PropsHelperInfiTools.manyullynPickaxeID+17,
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Bronze, "uraniumManyullynPickaxe");
            
            MinecraftForge.setToolClass(woodManyullynPickaxe, "pickaxe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(stoneManyullynPickaxe, "pickaxe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(ironManyullynPickaxe, "pickaxe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(diamondManyullynPickaxe, "pickaxe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(redstoneManyullynPickaxe, "pickaxe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(obsidianManyullynPickaxe, "pickaxe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(boneManyullynPickaxe, "pickaxe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(slimeManyullynPickaxe, "pickaxe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(cactusManyullynPickaxe, "pickaxe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(blazeManyullynPickaxe, "pickaxe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(copperManyullynPickaxe, "pickaxe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(bronzeManyullynPickaxe, "pickaxe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(workedManyullynPickaxe, "pickaxe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(steelManyullynPickaxe, "pickaxe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(cobaltManyullynPickaxe, "pickaxe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(arditeManyullynPickaxe, "pickaxe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(manyullynManyullynPickaxe, "pickaxe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(uraniumManyullynPickaxe, "pickaxe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
        }
        
        if(PropsHelperInfiTools.enableUraniumTools)
        {
            diamondUraniumPickaxe = new InfiToolPickaxe(PropsHelperInfiTools.uraniumPickaxeID+0, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Diamond, "diamondUraniumPickaxe");
            redstoneUraniumPickaxe = new InfiToolPickaxe(PropsHelperInfiTools.uraniumPickaxeID+1, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Redstone, "redstoneUraniumPickaxe");
            boneUraniumPickaxe = new InfiToolPickaxe(PropsHelperInfiTools.uraniumPickaxeID+2, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Bone, "boneUraniumPickaxe");
            netherrackUraniumPickaxe = new InfiToolPickaxe(PropsHelperInfiTools.uraniumPickaxeID+3, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Netherrack, "netherrackUraniumPickaxe");
            glowstoneUraniumPickaxe = new InfiToolPickaxe(PropsHelperInfiTools.uraniumPickaxeID+4, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Glowstone, "glowstoneUraniumPickaxe");
            lavaUraniumPickaxe = new InfiToolPickaxe(PropsHelperInfiTools.uraniumPickaxeID+5, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Lava, "lavaUraniumPickaxe");
            blazeUraniumPickaxe = new InfiToolPickaxe(PropsHelperInfiTools.uraniumPickaxeID+6, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Blaze, "blazeUraniumPickaxe");
            cobaltUraniumPickaxe = new InfiToolPickaxe(PropsHelperInfiTools.uraniumPickaxeID+7, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Cobalt, "cobaltUraniumPickaxe");
            arditeUraniumPickaxe = new InfiToolPickaxe(PropsHelperInfiTools.uraniumPickaxeID+8, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Ardite, "arditeUraniumPickaxe");
            uraniumUraniumPickaxe = new InfiToolPickaxe(PropsHelperInfiTools.uraniumPickaxeID+9, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Uranium, "uraniumUraniumPickaxe");
            
            MinecraftForge.setToolClass(diamondUraniumPickaxe, "pickaxe", InfiMaterialEnum.Uranium.getHarvestLevel());
            MinecraftForge.setToolClass(redstoneUraniumPickaxe, "pickaxe", InfiMaterialEnum.Uranium.getHarvestLevel());
            MinecraftForge.setToolClass(boneUraniumPickaxe, "pickaxe", InfiMaterialEnum.Uranium.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackUraniumPickaxe, "pickaxe", InfiMaterialEnum.Uranium.getHarvestLevel());
            MinecraftForge.setToolClass(glowstoneUraniumPickaxe, "pickaxe", InfiMaterialEnum.Uranium.getHarvestLevel());
            MinecraftForge.setToolClass(lavaUraniumPickaxe, "pickaxe", InfiMaterialEnum.Uranium.getHarvestLevel());
            MinecraftForge.setToolClass(blazeUraniumPickaxe, "pickaxe", InfiMaterialEnum.Uranium.getHarvestLevel());
            MinecraftForge.setToolClass(cobaltUraniumPickaxe, "pickaxe", InfiMaterialEnum.Uranium.getHarvestLevel());
            MinecraftForge.setToolClass(arditeUraniumPickaxe, "pickaxe", InfiMaterialEnum.Uranium.getHarvestLevel());
            MinecraftForge.setToolClass(uraniumUraniumPickaxe, "pickaxe", InfiMaterialEnum.Uranium.getHarvestLevel());
        }
    }
    
    private static void addNames()
    {
    	ModLoader.addName(woodWoodPickaxe, "Wood Pickaxe");
    	ModLoader.addName(stoneStonePickaxe, "Heavy Pickaxe");
    	ModLoader.addName(ironIronPickaxe, "Ironic Pickaxe");
    	ModLoader.addName(diamondDiamondPickaxe, "Diamondium Pickaxe");
    	ModLoader.addName(redstoneRedstonePickaxe, "Redredred Pickaxe");
    	ModLoader.addName(obsidianObsidianPickaxe, "Ebony Pickaxe");
    	ModLoader.addName(sandstoneSandstonePickaxe, "Fragile Pickaxe");
    	ModLoader.addName(boneBonePickaxe, "Necrotic Pickaxe");
    	ModLoader.addName(paperPaperPickaxe, "Soft Pickaxe");
    	ModLoader.addName(mossyMossyPickaxe, "Living Pickaxe");
    	ModLoader.addName(netherrackNetherrackPickaxe, "Blood Pick");
    	ModLoader.addName(glowstoneGlowstonePickaxe, "Bright Pickaxe");
    	ModLoader.addName(iceIcePickaxe, "Freezing Pickaxe");
    	ModLoader.addName(lavaLavaPickaxe, "Burning Pickaxe");
    	ModLoader.addName(slimeSlimePickaxe, "Toy Pickaxe");
    	ModLoader.addName(cactusCactusPickaxe, "Thorned Pickaxe");
    	ModLoader.addName(flintFlintPickaxe, "Rough-hewn Pickaxe");
    	ModLoader.addName(blazeBlazePickaxe, "Netherite Pickaxe");
        ModLoader.addName(copperCopperPickaxe, "Orange-Tang Pickaxe");
        ModLoader.addName(bronzeBronzePickaxe, "Polished Pickaxe");
        ModLoader.addName(workedWorkedIronPickaxe, "Reworked Iron Pickaxe");
        ModLoader.addName(steelSteelPickaxe, "Forge-Wrought Pickaxe");
        ModLoader.addName(cobaltCobaltPickaxe, "Beautiful Pickaxe");
        ModLoader.addName(arditeArditePickaxe, "Rustic StoneDigger");
        ModLoader.addName(manyullynManyullynPickaxe, "False-Prophetic Pickaxe");
        ModLoader.addName(uraniumUraniumPickaxe, "Cancerous Pickaxe");
    }
    
    public static void registerInfiToolsRecipes()
    {
    	if(PropsHelperInfiTools.enableWoodTools)
        {
            ModLoader.addRecipe(new ItemStack(woodWoodPickaxe), new Object[] 
                    { recipe, '#', Block.planks, '|', Item.stick });
            ModLoader.addRecipe(new ItemStack(sandstoneWoodPickaxe), new Object[] 
                    { recipe, '#', Block.planks, '|', mod_InfiBase.sandstoneRod });
            ModLoader.addRecipe(new ItemStack(boneWoodPickaxe), new Object[] 
                    { recipe, '#', Block.planks, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneWoodPickaxe), new Object[] 
                    { recipe, '#', Block.planks, '|', mod_InfiBase.boneRod });
            ModLoader.addRecipe(new ItemStack(paperWoodPickaxe), new Object[] 
                    { recipe, '#', Block.planks, '|', mod_InfiBase.paperRod });
            ModLoader.addRecipe(new ItemStack(iceWoodPickaxe), new Object[] 
                    { recipe, '#', Block.planks, '|', mod_InfiBase.iceRod });
            ModLoader.addRecipe(new ItemStack(slimeWoodPickaxe), new Object[] 
                    { recipe, '#', Block.planks, '|', mod_InfiBase.slimeRod });
            ModLoader.addRecipe(new ItemStack(cactusWoodPickaxe), new Object[] 
                    { recipe, '#', Block.planks, '|', mod_InfiBase.cactusRod });
        }
    	
        if(PropsHelperInfiTools.enableStoneTools)
        {
        	ModLoader.addRecipe(new ItemStack(woodStonePickaxe), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', Item.stick });
        	ModLoader.addRecipe(new ItemStack(stoneStonePickaxe), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', mod_InfiBase.stoneRod });
            ModLoader.addRecipe(new ItemStack(sandstoneStonePickaxe), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', mod_InfiBase.sandstoneRod });
            ModLoader.addRecipe(new ItemStack(boneStonePickaxe), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneStonePickaxe), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', mod_InfiBase.boneRod });
            ModLoader.addRecipe(new ItemStack(netherrackStonePickaxe), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', mod_InfiBase.netherrackRod });
            ModLoader.addRecipe(new ItemStack(iceStonePickaxe), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', mod_InfiBase.iceRod });
            ModLoader.addRecipe(new ItemStack(slimeStonePickaxe), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', mod_InfiBase.slimeRod });
            ModLoader.addRecipe(new ItemStack(cactusStonePickaxe), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', mod_InfiBase.cactusRod });
            ModLoader.addRecipe(new ItemStack(flintStonePickaxe), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', mod_InfiBase.flintRod });
            
            ModLoader.addRecipe(new ItemStack(woodStonePickaxe), new Object[] 
                    { recipe, '#', Block.stone, '|', Item.stick });
        	ModLoader.addRecipe(new ItemStack(stoneStonePickaxe), new Object[] 
                    { recipe, '#', Block.stone, '|', mod_InfiBase.stoneRod });
            ModLoader.addRecipe(new ItemStack(sandstoneStonePickaxe), new Object[] 
                    { recipe, '#', Block.stone, '|', mod_InfiBase.sandstoneRod });
            ModLoader.addRecipe(new ItemStack(boneStonePickaxe), new Object[] 
                    { recipe, '#', Block.stone, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneStonePickaxe), new Object[] 
                    { recipe, '#', Block.stone, '|', mod_InfiBase.boneRod });
            ModLoader.addRecipe(new ItemStack(netherrackStonePickaxe), new Object[] 
                    { recipe, '#', Block.stone, '|', mod_InfiBase.netherrackRod });
            ModLoader.addRecipe(new ItemStack(iceStonePickaxe), new Object[] 
                    { recipe, '#', Block.stone, '|', mod_InfiBase.iceRod });
            ModLoader.addRecipe(new ItemStack(slimeStonePickaxe), new Object[] 
                    { recipe, '#', Block.stone, '|', mod_InfiBase.slimeRod });
            ModLoader.addRecipe(new ItemStack(cactusStonePickaxe), new Object[] 
                    { recipe, '#', Block.stone, '|', mod_InfiBase.cactusRod });
            ModLoader.addRecipe(new ItemStack(flintStonePickaxe), new Object[] 
                    { recipe, '#', Block.stone, '|', mod_InfiBase.flintRod });
        }
        
        if(PropsHelperInfiTools.enableIronTools)
        {
        	ModLoader.addRecipe(new ItemStack(woodIronPickaxe), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', Item.stick });
        	ModLoader.addRecipe(new ItemStack(stoneIronPickaxe), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', mod_InfiBase.stoneRod });
            ModLoader.addRecipe(new ItemStack(ironIronPickaxe), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', mod_InfiBase.ironRod });
            ModLoader.addRecipe(new ItemStack(boneIronPickaxe), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneIronPickaxe), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', mod_InfiBase.boneRod });
            ModLoader.addRecipe(new ItemStack(netherrackIronPickaxe), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', mod_InfiBase.netherrackRod });
            ModLoader.addRecipe(new ItemStack(glowstoneIronPickaxe), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', mod_InfiBase.glowstoneRod });
            ModLoader.addRecipe(new ItemStack(cactusIronPickaxe), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', mod_InfiBase.cactusRod });
            ModLoader.addRecipe(new ItemStack(copperIronPickaxe), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', mod_InfiBase.copperRod });
            ModLoader.addRecipe(new ItemStack(bronzeIronPickaxe), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', mod_InfiBase.bronzeRod });
        }
        
        if(PropsHelperInfiTools.enableDiamondTools)
        {
        	ModLoader.addRecipe(new ItemStack(woodDiamondPickaxe), new Object[] 
                    { recipe, '#', Item.diamond, '|', Item.stick });
        	ModLoader.addRecipe(new ItemStack(stoneDiamondPickaxe), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.stoneRod });
            ModLoader.addRecipe(new ItemStack(ironDiamondPickaxe), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.ironRod });
            ModLoader.addRecipe(new ItemStack(diamondDiamondPickaxe), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.diamondRod });
            ModLoader.addRecipe(new ItemStack(redstoneDiamondPickaxe), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.redstoneRod });
            ModLoader.addRecipe(new ItemStack(obsidianDiamondPickaxe), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.obsidianRod });
            ModLoader.addRecipe(new ItemStack(boneDiamondPickaxe), new Object[] 
                    { recipe, '#', Item.diamond, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneDiamondPickaxe), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.boneRod });
            ModLoader.addRecipe(new ItemStack(mossyDiamondPickaxe), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.mossyRod });
            ModLoader.addRecipe(new ItemStack(netherrackDiamondPickaxe), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.netherrackRod });
            ModLoader.addRecipe(new ItemStack(glowstoneDiamondPickaxe), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.glowstoneRod });
            ModLoader.addRecipe(new ItemStack(lavaDiamondPickaxe), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.lavaRod });
            ModLoader.addRecipe(new ItemStack(cactusDiamondPickaxe), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.cactusRod });
            ModLoader.addRecipe(new ItemStack(flintDiamondPickaxe), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.flintRod });
            ModLoader.addRecipe(new ItemStack(blazeDiamondPickaxe), new Object[] 
                    { recipe, '#', Item.diamond, '|', Item.blazeRod });
            ModLoader.addRecipe(new ItemStack(copperDiamondPickaxe), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.copperRod });
            ModLoader.addRecipe(new ItemStack(bronzeDiamondPickaxe), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.bronzeRod });
            ModLoader.addRecipe(new ItemStack(workedDiamondPickaxe), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.workedIronRod });
            ModLoader.addRecipe(new ItemStack(steelDiamondPickaxe), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.steelRod });
            ModLoader.addRecipe(new ItemStack(cobaltDiamondPickaxe), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.cobaltRod });
            ModLoader.addRecipe(new ItemStack(arditeDiamondPickaxe), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.arditeRod });
            ModLoader.addRecipe(new ItemStack(manyullynDiamondPickaxe), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.manyullynRod });
            ModLoader.addRecipe(new ItemStack(uraniumDiamondPickaxe), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.uraniumRod });
        }
        
        if(PropsHelperInfiTools.enableRedstoneTools)
        {
        	ModLoader.addRecipe(new ItemStack(woodRedstonePickaxe), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', Item.stick });
        	ModLoader.addRecipe(new ItemStack(stoneRedstonePickaxe), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.stoneRod });
            ModLoader.addRecipe(new ItemStack(ironRedstonePickaxe), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.ironRod });
            ModLoader.addRecipe(new ItemStack(redstoneRedstonePickaxe), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.redstoneRod });
            ModLoader.addRecipe(new ItemStack(obsidianRedstonePickaxe), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.obsidianRod });
            ModLoader.addRecipe(new ItemStack(sandstoneRedstonePickaxe), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.sandstoneRod });
            ModLoader.addRecipe(new ItemStack(boneRedstonePickaxe), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneRedstonePickaxe), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.boneRod });
            ModLoader.addRecipe(new ItemStack(paperRedstonePickaxe), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.paperRod });
            ModLoader.addRecipe(new ItemStack(mossyRedstonePickaxe), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.mossyRod });
            ModLoader.addRecipe(new ItemStack(netherrackRedstonePickaxe), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.netherrackRod });
            ModLoader.addRecipe(new ItemStack(glowstoneRedstonePickaxe), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.glowstoneRod });
            ModLoader.addRecipe(new ItemStack(iceRedstonePickaxe), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.iceRod });
            ModLoader.addRecipe(new ItemStack(lavaRedstonePickaxe), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.lavaRod });
            ModLoader.addRecipe(new ItemStack(slimeRedstonePickaxe), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.slimeRod });
            ModLoader.addRecipe(new ItemStack(cactusRedstonePickaxe), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.cactusRod });
            ModLoader.addRecipe(new ItemStack(flintRedstonePickaxe), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.flintRod });
            ModLoader.addRecipe(new ItemStack(copperRedstonePickaxe), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.copperRod });
            ModLoader.addRecipe(new ItemStack(bronzeRedstonePickaxe), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.bronzeRod });
            ModLoader.addRecipe(new ItemStack(workedRedstonePickaxe), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.workedIronRod });
            ModLoader.addRecipe(new ItemStack(uraniumRedstonePickaxe), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.uraniumRod });
        }
        
        if(PropsHelperInfiTools.enableObsidianTools)
        {
        	ModLoader.addRecipe(new ItemStack(woodObsidianPickaxe), new Object[] 
                    { recipe, '#', Block.obsidian, '|', Item.stick });
        	ModLoader.addRecipe(new ItemStack(stoneObsidianPickaxe), new Object[] 
                    { recipe, '#', Block.obsidian, '|', mod_InfiBase.stoneRod });
            ModLoader.addRecipe(new ItemStack(redstoneObsidianPickaxe), new Object[] 
                    { recipe, '#', Block.obsidian, '|', mod_InfiBase.redstoneRod });
            ModLoader.addRecipe(new ItemStack(obsidianObsidianPickaxe), new Object[] 
                    { recipe, '#', Block.obsidian, '|', mod_InfiBase.obsidianRod });
            ModLoader.addRecipe(new ItemStack(boneObsidianPickaxe), new Object[] 
                    { recipe, '#', Block.obsidian, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneObsidianPickaxe), new Object[] 
                    { recipe, '#', Block.obsidian, '|', mod_InfiBase.boneRod });
            ModLoader.addRecipe(new ItemStack(netherrackObsidianPickaxe), new Object[] 
                    { recipe, '#', Block.obsidian, '|', mod_InfiBase.netherrackRod });
            ModLoader.addRecipe(new ItemStack(glowstoneObsidianPickaxe), new Object[] 
                    { recipe, '#', Block.obsidian, '|', mod_InfiBase.glowstoneRod });
            ModLoader.addRecipe(new ItemStack(iceObsidianPickaxe), new Object[] 
                    { recipe, '#', Block.obsidian, '|', mod_InfiBase.iceRod });
            ModLoader.addRecipe(new ItemStack(lavaObsidianPickaxe), new Object[] 
                    { recipe, '#', Block.obsidian, '|', mod_InfiBase.lavaRod });
            ModLoader.addRecipe(new ItemStack(cactusObsidianPickaxe), new Object[] 
                    { recipe, '#', Block.obsidian, '|', mod_InfiBase.cactusRod });
        }
        
        if(PropsHelperInfiTools.enableSandstoneTools)
        {
            ModLoader.addRecipe(new ItemStack(woodSandstonePickaxe), new Object[] 
                    { recipe, '#', Block.sandStone, '|', Item.stick });
            ModLoader.addRecipe(new ItemStack(sandstoneSandstonePickaxe), new Object[] 
                    { recipe, '#', Block.sandStone, '|', mod_InfiBase.sandstoneRod });
            ModLoader.addRecipe(new ItemStack(boneSandstonePickaxe), new Object[] 
                    { recipe, '#', Block.sandStone, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneSandstonePickaxe), new Object[] 
                    { recipe, '#', Block.sandStone, '|', mod_InfiBase.boneRod });      
            ModLoader.addRecipe(new ItemStack(netherrackSandstonePickaxe), new Object[] 
                    { recipe, '#', Block.sandStone, '|', mod_InfiBase.netherrackRod });
            ModLoader.addRecipe(new ItemStack(iceSandstonePickaxe), new Object[] 
                    { recipe, '#', Block.sandStone, '|', mod_InfiBase.iceRod });
            ModLoader.addRecipe(new ItemStack(slimeSandstonePickaxe), new Object[] 
                    { recipe, '#', Block.sandStone, '|', mod_InfiBase.slimeRod });
            ModLoader.addRecipe(new ItemStack(cactusSandstonePickaxe), new Object[] 
                    { recipe, '#', Block.sandStone, '|', mod_InfiBase.cactusRod });
            ModLoader.addRecipe(new ItemStack(flintSandstonePickaxe), new Object[] 
                    { recipe, '#', Block.sandStone, '|', mod_InfiBase.flintRod });
        }
        
        if(PropsHelperInfiTools.enableBoneTools)
        {
            ModLoader.addRecipe(new ItemStack(woodBonePickaxe), new Object[] 
                    { recipe, '#', Item.bone, '|', Item.stick });
            ModLoader.addRecipe(new ItemStack(stoneBonePickaxe), new Object[] 
                    { recipe, '#', Item.bone, '|', mod_InfiBase.stoneRod });
            ModLoader.addRecipe(new ItemStack(sandstoneBonePickaxe), new Object[] 
                    { recipe, '#', Item.bone, '|', mod_InfiBase.sandstoneRod });
            ModLoader.addRecipe(new ItemStack(boneBonePickaxe), new Object[] 
                    { recipe, '#', Item.bone, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneBonePickaxe), new Object[] 
                    { recipe, '#', Item.bone, '|', mod_InfiBase.boneRod });
            ModLoader.addRecipe(new ItemStack(paperBonePickaxe), new Object[] 
                    { recipe, '#', Item.bone, '|', mod_InfiBase.paperRod });
            ModLoader.addRecipe(new ItemStack(netherrackBonePickaxe), new Object[] 
                    { recipe, '#', Item.bone, '|', mod_InfiBase.netherrackRod });
            ModLoader.addRecipe(new ItemStack(iceBonePickaxe), new Object[] 
                    { recipe, '#', Item.bone, '|', mod_InfiBase.iceRod });
            ModLoader.addRecipe(new ItemStack(cactusBonePickaxe), new Object[] 
                    { recipe, '#', Item.bone, '|', mod_InfiBase.cactusRod });
            ModLoader.addRecipe(new ItemStack(flintBonePickaxe), new Object[] 
                    { recipe, '#', Item.bone, '|', mod_InfiBase.flintRod });
        }
        
        if(PropsHelperInfiTools.enablePaperTools)
        {
            ModLoader.addRecipe(new ItemStack(woodPaperPickaxe), new Object[] 
                    { recipe, '#', mod_InfiBase.paperStack, '|', Item.stick });
            ModLoader.addRecipe(new ItemStack(bonePaperPickaxe), new Object[] 
                    { recipe, '#', mod_InfiBase.paperStack, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(bonePaperPickaxe), new Object[] 
                    { recipe, '#', mod_InfiBase.paperStack, '|', mod_InfiBase.boneRod });
            ModLoader.addRecipe(new ItemStack(paperPaperPickaxe), new Object[] 
                    { recipe, '#', mod_InfiBase.paperStack, '|', mod_InfiBase.paperRod });
            ModLoader.addRecipe(new ItemStack(slimePaperPickaxe), new Object[] 
                    { recipe, '#', mod_InfiBase.paperStack, '|', mod_InfiBase.slimeRod });
            ModLoader.addRecipe(new ItemStack(cactusPaperPickaxe), new Object[] 
                    { recipe, '#', mod_InfiBase.paperStack, '|', mod_InfiBase.cactusRod });
        }
        
        if(PropsHelperInfiTools.enableMossyTools)
        {
        	ModLoader.addRecipe(new ItemStack(woodMossyPickaxe), new Object[] 
                    { recipe, '#', mod_InfiBase.mossyStone, '|', Item.stick });
        	ModLoader.addRecipe(new ItemStack(stoneMossyPickaxe), new Object[] 
                    { recipe, '#', mod_InfiBase.mossyStone, '|', mod_InfiBase.stoneRod });
            ModLoader.addRecipe(new ItemStack(diamondMossyPickaxe), new Object[] 
                    { recipe, '#', mod_InfiBase.mossyStone, '|', mod_InfiBase.diamondRod });
            ModLoader.addRecipe(new ItemStack(redstoneMossyPickaxe), new Object[] 
                    { recipe, '#', mod_InfiBase.mossyStone, '|', mod_InfiBase.redstoneRod });
            ModLoader.addRecipe(new ItemStack(boneMossyPickaxe), new Object[] 
                    { recipe, '#', mod_InfiBase.mossyStone, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneMossyPickaxe), new Object[] 
                    { recipe, '#', mod_InfiBase.mossyStone, '|', mod_InfiBase.boneRod });
            ModLoader.addRecipe(new ItemStack(mossyMossyPickaxe), new Object[] 
                    { recipe, '#', mod_InfiBase.mossyStone, '|', mod_InfiBase.mossyRod });
            ModLoader.addRecipe(new ItemStack(netherrackMossyPickaxe), new Object[] 
                    { recipe, '#', mod_InfiBase.mossyStone, '|', mod_InfiBase.netherrackRod });
            ModLoader.addRecipe(new ItemStack(glowstoneMossyPickaxe), new Object[] 
                    { recipe, '#', mod_InfiBase.mossyStone, '|', mod_InfiBase.glowstoneRod });
            ModLoader.addRecipe(new ItemStack(cactusMossyPickaxe), new Object[] 
                    { recipe, '#', mod_InfiBase.mossyStone, '|', mod_InfiBase.cactusRod });
            ModLoader.addRecipe(new ItemStack(blazeMossyPickaxe), new Object[] 
                    { recipe, '#', mod_InfiBase.mossyStone, '|', Item.blazeRod });
            ModLoader.addRecipe(new ItemStack(manyullynMossyPickaxe), new Object[] 
                    { recipe, '#', mod_InfiBase.mossyStone, '|', mod_InfiBase.manyullynRod });
            ModLoader.addRecipe(new ItemStack(uraniumMossyPickaxe), new Object[] 
                    { recipe, '#', mod_InfiBase.mossyStone, '|', mod_InfiBase.uraniumRod });
        }
        
        if(PropsHelperInfiTools.enableNetherrackTools)
        {
        	ModLoader.addRecipe(new ItemStack(woodNetherrackPickaxe), new Object[] 
                    { recipe, '#', Block.netherrack, '|', Item.stick });
        	ModLoader.addRecipe(new ItemStack(stoneNetherrackPickaxe), new Object[] 
                    { recipe, '#', Block.netherrack, '|', mod_InfiBase.stoneRod });
            ModLoader.addRecipe(new ItemStack(sandstoneNetherrackPickaxe), new Object[] 
                    { recipe, '#', Block.netherrack, '|', mod_InfiBase.sandstoneRod });
            ModLoader.addRecipe(new ItemStack(boneNetherrackPickaxe), new Object[] 
                    { recipe, '#', Block.netherrack, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneNetherrackPickaxe), new Object[] 
                    { recipe, '#', Block.netherrack, '|', mod_InfiBase.boneRod });
            ModLoader.addRecipe(new ItemStack(paperNetherrackPickaxe), new Object[] 
                    { recipe, '#', Block.netherrack, '|', mod_InfiBase.paperRod });
            ModLoader.addRecipe(new ItemStack(mossyNetherrackPickaxe), new Object[] 
                    { recipe, '#', Block.netherrack, '|', mod_InfiBase.mossyRod });
            ModLoader.addRecipe(new ItemStack(netherrackNetherrackPickaxe), new Object[] 
                    { recipe, '#', Block.netherrack, '|', mod_InfiBase.netherrackRod });
            ModLoader.addRecipe(new ItemStack(iceNetherrackPickaxe), new Object[] 
                    { recipe, '#', Block.netherrack, '|', mod_InfiBase.iceRod });
            ModLoader.addRecipe(new ItemStack(slimeNetherrackPickaxe), new Object[] 
                    { recipe, '#', Block.netherrack, '|', mod_InfiBase.slimeRod });
            ModLoader.addRecipe(new ItemStack(cactusNetherrackPickaxe), new Object[] 
                    { recipe, '#', Block.netherrack, '|', mod_InfiBase.cactusRod });
            ModLoader.addRecipe(new ItemStack(flintNetherrackPickaxe), new Object[] 
                    { recipe, '#', Block.netherrack, '|', mod_InfiBase.flintRod });
            ModLoader.addRecipe(new ItemStack(copperNetherrackPickaxe), new Object[] 
                    { recipe, '#', Block.netherrack, '|', mod_InfiBase.copperRod });
            ModLoader.addRecipe(new ItemStack(bronzeNetherrackPickaxe), new Object[] 
                    { recipe, '#', Block.netherrack, '|', mod_InfiBase.bronzeRod });
        }
        
        if(PropsHelperInfiTools.enableGlowstoneTools)
        {
        	ModLoader.addRecipe(new ItemStack(woodGlowstonePickaxe), new Object[] 
                    { recipe, '#', mod_InfiBase.glowstoneCrystal, '|', Item.stick });
        	ModLoader.addRecipe(new ItemStack(redstoneGlowstonePickaxe), new Object[] 
                    { recipe, '#', mod_InfiBase.glowstoneCrystal, '|', mod_InfiBase.glowstoneRod });
        	ModLoader.addRecipe(new ItemStack(obsidianGlowstonePickaxe), new Object[] 
                    { recipe, '#', mod_InfiBase.glowstoneCrystal, '|', mod_InfiBase.obsidianRod });
            ModLoader.addRecipe(new ItemStack(boneGlowstonePickaxe), new Object[] 
                    { recipe, '#', mod_InfiBase.glowstoneCrystal, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneGlowstonePickaxe), new Object[] 
                    { recipe, '#', mod_InfiBase.glowstoneCrystal, '|', mod_InfiBase.boneRod });
            ModLoader.addRecipe(new ItemStack(netherrackGlowstonePickaxe), new Object[] 
                    { recipe, '#', mod_InfiBase.glowstoneCrystal, '|', mod_InfiBase.netherrackRod });
            ModLoader.addRecipe(new ItemStack(iceGlowstonePickaxe), new Object[] 
                    { recipe, '#', mod_InfiBase.glowstoneCrystal, '|', mod_InfiBase.iceRod });
            ModLoader.addRecipe(new ItemStack(slimeGlowstonePickaxe), new Object[] 
                    { recipe, '#', mod_InfiBase.glowstoneCrystal, '|', mod_InfiBase.slimeRod });
            ModLoader.addRecipe(new ItemStack(cactusGlowstonePickaxe), new Object[] 
                    { recipe, '#', mod_InfiBase.glowstoneCrystal, '|', mod_InfiBase.cactusRod });
        }
        
        if(PropsHelperInfiTools.enableIceTools)
        {
            ModLoader.addRecipe(new ItemStack(woodIcePickaxe), new Object[] 
                    { recipe, '#', Block.ice, '|', Item.stick });
            ModLoader.addRecipe(new ItemStack(boneIcePickaxe), new Object[] 
                    { recipe, '#', Block.ice, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneIcePickaxe), new Object[] 
                    { recipe, '#', Block.ice, '|', mod_InfiBase.boneRod });
            ModLoader.addRecipe(new ItemStack(paperIcePickaxe), new Object[] 
                    { recipe, '#', Block.ice, '|', mod_InfiBase.paperRod });
            ModLoader.addRecipe(new ItemStack(iceIcePickaxe), new Object[] 
                    { recipe, '#', Block.ice, '|', mod_InfiBase.iceRod });
            ModLoader.addRecipe(new ItemStack(slimeIcePickaxe), new Object[] 
                    { recipe, '#', Block.ice, '|', mod_InfiBase.slimeRod });
            ModLoader.addRecipe(new ItemStack(cactusIcePickaxe), new Object[] 
                    { recipe, '#', Block.ice, '|', mod_InfiBase.cactusRod });
        }
        
        if(PropsHelperInfiTools.enableLavaTools)
        {
            ModLoader.addRecipe(new ItemStack(diamondLavaPickaxe), new Object[] 
                    { recipe, '#', mod_InfiBase.lavaCrystal, '|', mod_InfiBase.diamondRod });
            ModLoader.addRecipe(new ItemStack(obsidianLavaPickaxe), new Object[] 
                    { recipe, '#', mod_InfiBase.lavaCrystal, '|', mod_InfiBase.obsidianRod });
            ModLoader.addRecipe(new ItemStack(netherrackLavaPickaxe), new Object[] 
                    { recipe, '#', mod_InfiBase.lavaCrystal, '|', mod_InfiBase.netherrackRod });
            ModLoader.addRecipe(new ItemStack(lavaLavaPickaxe), new Object[] 
                    { recipe, '#', mod_InfiBase.lavaCrystal, '|', mod_InfiBase.lavaRod });
            ModLoader.addRecipe(new ItemStack(flintLavaPickaxe), new Object[] 
                    { recipe, '#', mod_InfiBase.lavaCrystal, '|', mod_InfiBase.flintRod });
            ModLoader.addRecipe(new ItemStack(blazeLavaPickaxe), new Object[] 
                    { recipe, '#', mod_InfiBase.lavaCrystal, '|', Item.blazeRod });
            ModLoader.addRecipe(new ItemStack(manyullynLavaPickaxe), new Object[] 
                    { recipe, '#', mod_InfiBase.lavaCrystal, '|', mod_InfiBase.manyullynRod });
            ModLoader.addRecipe(new ItemStack(uraniumLavaPickaxe), new Object[] 
                    { recipe, '#', mod_InfiBase.lavaCrystal, '|', mod_InfiBase.uraniumRod });
        }
        
        if(PropsHelperInfiTools.enableSlimeTools)
        {
            ModLoader.addRecipe(new ItemStack(woodSlimePickaxe), new Object[] 
                    { recipe, '#', mod_InfiBase.slimeCrystal, '|', Item.stick });
            ModLoader.addRecipe(new ItemStack(sandstoneSlimePickaxe), new Object[] 
                    { recipe, '#', mod_InfiBase.slimeCrystal, '|', mod_InfiBase.sandstoneRod });
            ModLoader.addRecipe(new ItemStack(boneSlimePickaxe), new Object[] 
                    { recipe, '#', mod_InfiBase.slimeCrystal, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneSlimePickaxe), new Object[] 
                    { recipe, '#', mod_InfiBase.slimeCrystal, '|', mod_InfiBase.boneRod });
            ModLoader.addRecipe(new ItemStack(paperSlimePickaxe), new Object[] 
                    { recipe, '#', mod_InfiBase.slimeCrystal, '|', mod_InfiBase.paperRod });
            ModLoader.addRecipe(new ItemStack(slimeSlimePickaxe), new Object[] 
                    { recipe, '#', mod_InfiBase.slimeCrystal, '|', mod_InfiBase.slimeRod });
            ModLoader.addRecipe(new ItemStack(cactusSlimePickaxe), new Object[] 
                    { recipe, '#', mod_InfiBase.slimeCrystal, '|', mod_InfiBase.cactusRod });
        }
        
        if(PropsHelperInfiTools.enableCactusTools)
        {
            ModLoader.addRecipe(new ItemStack(woodCactusPickaxe), new Object[] 
                    { recipe, '#', Block.cactus, '|', Item.stick });
            ModLoader.addRecipe(new ItemStack(sandstoneCactusPickaxe), new Object[] 
                    { recipe, '#', Block.cactus, '|', mod_InfiBase.sandstoneRod });
            ModLoader.addRecipe(new ItemStack(boneCactusPickaxe), new Object[] 
                    { recipe, '#', Block.cactus, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneCactusPickaxe), new Object[] 
                    { recipe, '#', Block.cactus, '|', mod_InfiBase.boneRod });
            ModLoader.addRecipe(new ItemStack(netherrackCactusPickaxe), new Object[] 
                    { recipe, '#', Block.cactus, '|', mod_InfiBase.netherrackRod });
            ModLoader.addRecipe(new ItemStack(iceCactusPickaxe), new Object[] 
                    { recipe, '#', Block.cactus, '|', mod_InfiBase.iceRod });
            ModLoader.addRecipe(new ItemStack(slimeCactusPickaxe), new Object[] 
                    { recipe, '#', Block.cactus, '|', mod_InfiBase.slimeRod });
            ModLoader.addRecipe(new ItemStack(cactusCactusPickaxe), new Object[] 
                    { recipe, '#', Block.cactus, '|', mod_InfiBase.cactusRod });
        }
        
        if(PropsHelperInfiTools.enableFlintTools)
        {
        	ModLoader.addRecipe(new ItemStack(woodFlintPickaxe), new Object[] 
                    { recipe, '#', Item.flint, '|', Item.stick });
        	ModLoader.addRecipe(new ItemStack(stoneFlintPickaxe), new Object[] 
                    { recipe, '#', Item.flint, '|', mod_InfiBase.stoneRod });
            ModLoader.addRecipe(new ItemStack(sandstoneFlintPickaxe), new Object[] 
                    { recipe, '#', Item.flint, '|', mod_InfiBase.sandstoneRod });
            ModLoader.addRecipe(new ItemStack(boneFlintPickaxe), new Object[] 
                    { recipe, '#', Item.flint, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneFlintPickaxe), new Object[] 
                    { recipe, '#', Item.flint, '|', mod_InfiBase.boneRod });
            ModLoader.addRecipe(new ItemStack(netherrackFlintPickaxe), new Object[] 
                    { recipe, '#', Item.flint, '|', mod_InfiBase.netherrackRod });
            ModLoader.addRecipe(new ItemStack(slimeFlintPickaxe), new Object[] 
                    { recipe, '#', Item.flint, '|', mod_InfiBase.slimeRod });
            ModLoader.addRecipe(new ItemStack(cactusFlintPickaxe), new Object[] 
                    { recipe, '#', Item.flint, '|', mod_InfiBase.cactusRod });
            ModLoader.addRecipe(new ItemStack(flintFlintPickaxe), new Object[] 
                    { recipe, '#', Item.flint, '|', mod_InfiBase.flintRod });
            ModLoader.addRecipe(new ItemStack(copperFlintPickaxe), new Object[] 
                    { recipe, '#', Block.netherrack, '|', mod_InfiBase.copperRod });
            ModLoader.addRecipe(new ItemStack(bronzeFlintPickaxe), new Object[] 
                    { recipe, '#', Block.netherrack, '|', mod_InfiBase.bronzeRod });
        }
        
        if(PropsHelperInfiTools.enableBlazeTools)
        {
            ModLoader.addRecipe(new ItemStack(diamondBlazePickaxe), new Object[] 
                    { recipe, '#', mod_InfiBase.blazeCrystal, '|', mod_InfiBase.diamondRod });
            ModLoader.addRecipe(new ItemStack(obsidianBlazePickaxe), new Object[] 
                    { recipe, '#', mod_InfiBase.blazeCrystal, '|', mod_InfiBase.obsidianRod });
            ModLoader.addRecipe(new ItemStack(netherrackBlazePickaxe), new Object[] 
                    { recipe, '#', mod_InfiBase.blazeCrystal, '|', mod_InfiBase.netherrackRod });
            ModLoader.addRecipe(new ItemStack(lavaBlazePickaxe), new Object[] 
                    { recipe, '#', mod_InfiBase.blazeCrystal, '|', mod_InfiBase.lavaRod });
            ModLoader.addRecipe(new ItemStack(flintBlazePickaxe), new Object[] 
                    { recipe, '#', mod_InfiBase.blazeCrystal, '|', mod_InfiBase.flintRod });
            ModLoader.addRecipe(new ItemStack(blazeBlazePickaxe), new Object[] 
                    { recipe, '#', mod_InfiBase.blazeCrystal, '|', Item.blazeRod });
            ModLoader.addRecipe(new ItemStack(manyullynBlazePickaxe), new Object[] 
                    { recipe, '#', mod_InfiBase.blazeCrystal, '|', mod_InfiBase.manyullynRod });
            ModLoader.addRecipe(new ItemStack(uraniumBlazePickaxe), new Object[] 
                    { recipe, '#', mod_InfiBase.blazeCrystal, '|', mod_InfiBase.uraniumRod });
        }
    }
    
    public static void addStoneTools(ItemStack stack)
    {
    	ModLoader.addRecipe(new ItemStack(woodStonePickaxe), new Object[] 
                { recipe, '#', stack, '|', Item.stick });
    	ModLoader.addRecipe(new ItemStack(stoneStonePickaxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.stoneRod });
        ModLoader.addRecipe(new ItemStack(sandstoneStonePickaxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.sandstoneRod });
        ModLoader.addRecipe(new ItemStack(boneStonePickaxe), new Object[] 
                { recipe, '#', stack, '|', Item.bone });
        ModLoader.addRecipe(new ItemStack(boneStonePickaxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.boneRod });
        ModLoader.addRecipe(new ItemStack(netherrackStonePickaxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.netherrackRod });
        ModLoader.addRecipe(new ItemStack(iceStonePickaxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.iceRod });
        ModLoader.addRecipe(new ItemStack(slimeStonePickaxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.slimeRod });
        ModLoader.addRecipe(new ItemStack(cactusStonePickaxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.cactusRod });
        ModLoader.addRecipe(new ItemStack(flintStonePickaxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.flintRod });
    }
    
    public static void addCopperTools(ItemStack stack)
    {
    	ModLoader.addRecipe(new ItemStack(woodCopperPickaxe), new Object[] 
                { recipe, '#', stack, '|', Item.stick });
        ModLoader.addRecipe(new ItemStack(stoneCopperPickaxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.stoneRod });
        ModLoader.addRecipe(new ItemStack(boneCopperPickaxe), new Object[] 
                { recipe, '#', stack, '|', Item.bone });
        ModLoader.addRecipe(new ItemStack(boneCopperPickaxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.boneRod });
        ModLoader.addRecipe(new ItemStack(netherrackCopperPickaxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.netherrackRod });
        ModLoader.addRecipe(new ItemStack(slimeCopperPickaxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.slimeRod });
        ModLoader.addRecipe(new ItemStack(cactusCopperPickaxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.cactusRod });
        ModLoader.addRecipe(new ItemStack(flintCopperPickaxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.flintRod });
        ModLoader.addRecipe(new ItemStack(copperCopperPickaxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.copperRod });
    }
    
    public static void addBronzeTools(ItemStack stack)
    {
    	ModLoader.addRecipe(new ItemStack(woodBronzePickaxe), new Object[] 
                { recipe, '#', stack, '|', Item.stick });
        ModLoader.addRecipe(new ItemStack(stoneBronzePickaxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.stoneRod });
        ModLoader.addRecipe(new ItemStack(boneBronzePickaxe), new Object[] 
                { recipe, '#', stack, '|', Item.bone });
        ModLoader.addRecipe(new ItemStack(boneBronzePickaxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.boneRod });
        ModLoader.addRecipe(new ItemStack(netherrackBronzePickaxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.netherrackRod });
        ModLoader.addRecipe(new ItemStack(slimeBronzePickaxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.slimeRod });
        ModLoader.addRecipe(new ItemStack(cactusBronzePickaxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.cactusRod });
        ModLoader.addRecipe(new ItemStack(flintBronzePickaxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.flintRod });
        ModLoader.addRecipe(new ItemStack(copperBronzePickaxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.copperRod });
        ModLoader.addRecipe(new ItemStack(bronzeBronzePickaxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.bronzeRod });
    }
    
    public static void addWorkedIronTools(ItemStack stack)
    {
    	ModLoader.addRecipe(new ItemStack(woodWorkedIronPickaxe), new Object[] 
                { recipe, '#', stack, '|', Item.stick });
        ModLoader.addRecipe(new ItemStack(stoneWorkedIronPickaxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.stoneRod });
        ModLoader.addRecipe(new ItemStack(ironWorkedIronPickaxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.ironRod });
        ModLoader.addRecipe(new ItemStack(diamondWorkedIronPickaxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.diamondRod });
        ModLoader.addRecipe(new ItemStack(redstoneWorkedIronPickaxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.redstoneRod });
        ModLoader.addRecipe(new ItemStack(obsidianWorkedIronPickaxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.obsidianRod });
        ModLoader.addRecipe(new ItemStack(boneWorkedIronPickaxe), new Object[] 
                { recipe, '#', stack, '|', Item.bone });
        ModLoader.addRecipe(new ItemStack(boneWorkedIronPickaxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.boneRod });
        ModLoader.addRecipe(new ItemStack(netherrackWorkedIronPickaxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.netherrackRod });
        ModLoader.addRecipe(new ItemStack(glowstoneWorkedIronPickaxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.glowstoneRod });
        ModLoader.addRecipe(new ItemStack(iceWorkedIronPickaxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.iceRod });
        ModLoader.addRecipe(new ItemStack(slimeWorkedIronPickaxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.slimeRod });
        ModLoader.addRecipe(new ItemStack(cactusWorkedIronPickaxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.cactusRod });
        ModLoader.addRecipe(new ItemStack(blazeWorkedIronPickaxe), new Object[] 
                { recipe, '#', stack, '|', Item.blazeRod });
        ModLoader.addRecipe(new ItemStack(copperWorkedIronPickaxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.copperRod });
        ModLoader.addRecipe(new ItemStack(bronzeWorkedIronPickaxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.bronzeRod });
        ModLoader.addRecipe(new ItemStack(workedWorkedIronPickaxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.workedIronRod });
        ModLoader.addRecipe(new ItemStack(steelWorkedIronPickaxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.steelRod });
        ModLoader.addRecipe(new ItemStack(uraniumWorkedIronPickaxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.uraniumRod });
    }
    
    public static void addSteelTools(ItemStack stack)
    {
    	ModLoader.addRecipe(new ItemStack(woodSteelPickaxe), new Object[] 
                { recipe, '#', stack, '|', Item.stick });
        ModLoader.addRecipe(new ItemStack(stoneSteelPickaxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.stoneRod });
        ModLoader.addRecipe(new ItemStack(ironSteelPickaxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.ironRod });
        ModLoader.addRecipe(new ItemStack(diamondSteelPickaxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.diamondRod });
        ModLoader.addRecipe(new ItemStack(redstoneSteelPickaxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.redstoneRod });
        ModLoader.addRecipe(new ItemStack(obsidianSteelPickaxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.obsidianRod });
        ModLoader.addRecipe(new ItemStack(boneSteelPickaxe), new Object[] 
                { recipe, '#', stack, '|', Item.bone });
        ModLoader.addRecipe(new ItemStack(boneSteelPickaxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.boneRod });
        ModLoader.addRecipe(new ItemStack(netherrackSteelPickaxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.netherrackRod });
        ModLoader.addRecipe(new ItemStack(glowstoneSteelPickaxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.glowstoneRod });
        ModLoader.addRecipe(new ItemStack(iceSteelPickaxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.iceRod });
        ModLoader.addRecipe(new ItemStack(slimeSteelPickaxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.slimeRod });
        ModLoader.addRecipe(new ItemStack(cactusSteelPickaxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.cactusRod });
        ModLoader.addRecipe(new ItemStack(blazeSteelPickaxe), new Object[] 
                { recipe, '#', stack, '|', Item.blazeRod });
        ModLoader.addRecipe(new ItemStack(copperSteelPickaxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.copperRod });
        ModLoader.addRecipe(new ItemStack(bronzeSteelPickaxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.bronzeRod });
        ModLoader.addRecipe(new ItemStack(workedSteelPickaxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.workedIronRod });
        ModLoader.addRecipe(new ItemStack(steelSteelPickaxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.steelRod });
        ModLoader.addRecipe(new ItemStack(cobaltSteelPickaxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.cobaltRod });
        ModLoader.addRecipe(new ItemStack(arditeSteelPickaxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.arditeRod });
        ModLoader.addRecipe(new ItemStack(uraniumSteelPickaxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.uraniumRod });
    }
    
    public static void addCobaltTools(ItemStack stack)
    {
    	ModLoader.addRecipe(new ItemStack(woodCobaltPickaxe), new Object[] 
                { recipe, '#', stack, '|', Item.stick });
        ModLoader.addRecipe(new ItemStack(stoneCobaltPickaxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.stoneRod });
        ModLoader.addRecipe(new ItemStack(ironCobaltPickaxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.ironRod });
        ModLoader.addRecipe(new ItemStack(diamondCobaltPickaxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.diamondRod });
        ModLoader.addRecipe(new ItemStack(redstoneCobaltPickaxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.redstoneRod });
        ModLoader.addRecipe(new ItemStack(obsidianCobaltPickaxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.obsidianRod });
        ModLoader.addRecipe(new ItemStack(boneCobaltPickaxe), new Object[] 
                { recipe, '#', stack, '|', Item.bone });
        ModLoader.addRecipe(new ItemStack(boneCobaltPickaxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.boneRod });
        ModLoader.addRecipe(new ItemStack(slimeCobaltPickaxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.slimeRod });
        ModLoader.addRecipe(new ItemStack(cactusCobaltPickaxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.cactusRod });
        ModLoader.addRecipe(new ItemStack(blazeCobaltPickaxe), new Object[] 
                { recipe, '#', stack, '|', Item.blazeRod });
        ModLoader.addRecipe(new ItemStack(copperCobaltPickaxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.copperRod });
        ModLoader.addRecipe(new ItemStack(bronzeCobaltPickaxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.bronzeRod });
        ModLoader.addRecipe(new ItemStack(workedCobaltPickaxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.workedIronRod });
        ModLoader.addRecipe(new ItemStack(steelCobaltPickaxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.steelRod });
        ModLoader.addRecipe(new ItemStack(cobaltCobaltPickaxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.cobaltRod });
        ModLoader.addRecipe(new ItemStack(arditeCobaltPickaxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.arditeRod });
        ModLoader.addRecipe(new ItemStack(manyullynCobaltPickaxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.manyullynRod });
        ModLoader.addRecipe(new ItemStack(uraniumCobaltPickaxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.uraniumRod });
    }
    
    public static void addArditeTools(ItemStack stack)
    {
    	ModLoader.addRecipe(new ItemStack(woodArditePickaxe), new Object[] 
                { recipe, '#', stack, '|', Item.stick });
        ModLoader.addRecipe(new ItemStack(stoneArditePickaxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.stoneRod });
        ModLoader.addRecipe(new ItemStack(ironArditePickaxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.ironRod });
        ModLoader.addRecipe(new ItemStack(diamondArditePickaxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.diamondRod });
        ModLoader.addRecipe(new ItemStack(redstoneArditePickaxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.redstoneRod });
        ModLoader.addRecipe(new ItemStack(obsidianArditePickaxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.obsidianRod });
        ModLoader.addRecipe(new ItemStack(boneArditePickaxe), new Object[] 
                { recipe, '#', stack, '|', Item.bone });
        ModLoader.addRecipe(new ItemStack(boneArditePickaxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.boneRod });
        ModLoader.addRecipe(new ItemStack(slimeArditePickaxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.slimeRod });
        ModLoader.addRecipe(new ItemStack(cactusArditePickaxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.cactusRod });
        ModLoader.addRecipe(new ItemStack(blazeArditePickaxe), new Object[] 
                { recipe, '#', stack, '|', Item.blazeRod });
        ModLoader.addRecipe(new ItemStack(copperArditePickaxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.copperRod });
        ModLoader.addRecipe(new ItemStack(bronzeArditePickaxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.bronzeRod });
        ModLoader.addRecipe(new ItemStack(workedArditePickaxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.workedIronRod });
        ModLoader.addRecipe(new ItemStack(steelArditePickaxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.steelRod });
        ModLoader.addRecipe(new ItemStack(cobaltArditePickaxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.cobaltRod });
        ModLoader.addRecipe(new ItemStack(arditeArditePickaxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.arditeRod });
        ModLoader.addRecipe(new ItemStack(manyullynArditePickaxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.manyullynRod });
        ModLoader.addRecipe(new ItemStack(uraniumArditePickaxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.uraniumRod });
    }
    
    public static void addManyullynTools(ItemStack stack)
    {
    	ModLoader.addRecipe(new ItemStack(woodManyullynPickaxe), new Object[] 
                { recipe, '#', stack, '|', Item.stick });
        ModLoader.addRecipe(new ItemStack(stoneManyullynPickaxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.stoneRod });
        ModLoader.addRecipe(new ItemStack(ironManyullynPickaxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.ironRod });
        ModLoader.addRecipe(new ItemStack(diamondManyullynPickaxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.diamondRod });
        ModLoader.addRecipe(new ItemStack(redstoneManyullynPickaxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.redstoneRod });
        ModLoader.addRecipe(new ItemStack(obsidianManyullynPickaxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.obsidianRod });
        ModLoader.addRecipe(new ItemStack(boneManyullynPickaxe), new Object[] 
                { recipe, '#', stack, '|', Item.bone });
        ModLoader.addRecipe(new ItemStack(boneManyullynPickaxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.boneRod });
        ModLoader.addRecipe(new ItemStack(slimeManyullynPickaxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.slimeRod });
        ModLoader.addRecipe(new ItemStack(cactusManyullynPickaxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.cactusRod });
        ModLoader.addRecipe(new ItemStack(blazeManyullynPickaxe), new Object[] 
                { recipe, '#', stack, '|', Item.blazeRod });
        ModLoader.addRecipe(new ItemStack(copperManyullynPickaxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.copperRod });
        ModLoader.addRecipe(new ItemStack(bronzeManyullynPickaxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.bronzeRod });
        ModLoader.addRecipe(new ItemStack(workedManyullynPickaxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.workedIronRod });
        ModLoader.addRecipe(new ItemStack(steelManyullynPickaxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.steelRod });
        ModLoader.addRecipe(new ItemStack(cobaltManyullynPickaxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.cobaltRod });
        ModLoader.addRecipe(new ItemStack(arditeManyullynPickaxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.arditeRod });
        ModLoader.addRecipe(new ItemStack(manyullynManyullynPickaxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.manyullynRod });
        ModLoader.addRecipe(new ItemStack(uraniumManyullynPickaxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.uraniumRod });
    }
    
    public static void addUraniumTools(ItemStack stack)
    {
        ModLoader.addRecipe(new ItemStack(diamondUraniumPickaxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.diamondRod });
        ModLoader.addRecipe(new ItemStack(redstoneUraniumPickaxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.redstoneRod });
        ModLoader.addRecipe(new ItemStack(boneUraniumPickaxe), new Object[] 
                { recipe, '#', stack, '|', Item.bone });
        ModLoader.addRecipe(new ItemStack(boneUraniumPickaxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.boneRod });
        ModLoader.addRecipe(new ItemStack(netherrackUraniumPickaxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.netherrackRod });
        ModLoader.addRecipe(new ItemStack(glowstoneUraniumPickaxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.glowstoneRod });
        ModLoader.addRecipe(new ItemStack(lavaUraniumPickaxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.lavaRod });
        ModLoader.addRecipe(new ItemStack(blazeUraniumPickaxe), new Object[] 
                { recipe, '#', stack, '|', Item.blazeRod });
        ModLoader.addRecipe(new ItemStack(cobaltUraniumPickaxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.cobaltRod });
        ModLoader.addRecipe(new ItemStack(arditeUraniumPickaxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.arditeRod });
        ModLoader.addRecipe(new ItemStack(uraniumUraniumPickaxe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.uraniumRod });
    }
    
	public static Item woodWoodPickaxe;
	public static Item sandstoneWoodPickaxe;
	public static Item boneWoodPickaxe;
	public static Item paperWoodPickaxe;
	public static Item iceWoodPickaxe;
	public static Item slimeWoodPickaxe;
	public static Item cactusWoodPickaxe;
	
	public static Item woodStonePickaxe;
	public static Item stoneStonePickaxe;
	public static Item sandstoneStonePickaxe;
	public static Item boneStonePickaxe;
	public static Item netherrackStonePickaxe;
	public static Item iceStonePickaxe;
	public static Item slimeStonePickaxe;
	public static Item cactusStonePickaxe;
	public static Item flintStonePickaxe;
	
	public static Item woodIronPickaxe;
	public static Item stoneIronPickaxe;
	public static Item ironIronPickaxe;
	public static Item boneIronPickaxe;
	public static Item netherrackIronPickaxe;
	public static Item glowstoneIronPickaxe;
	public static Item cactusIronPickaxe;
	public static Item copperIronPickaxe;
	public static Item bronzeIronPickaxe;
	
	public static Item woodDiamondPickaxe;
	public static Item stoneDiamondPickaxe;
	public static Item ironDiamondPickaxe;
	public static Item diamondDiamondPickaxe;
	public static Item redstoneDiamondPickaxe;
	public static Item obsidianDiamondPickaxe;
	public static Item boneDiamondPickaxe;
	public static Item mossyDiamondPickaxe;
	public static Item netherrackDiamondPickaxe;
	public static Item glowstoneDiamondPickaxe;
	public static Item lavaDiamondPickaxe;
	public static Item cactusDiamondPickaxe;
	public static Item flintDiamondPickaxe;
	public static Item blazeDiamondPickaxe;
	public static Item copperDiamondPickaxe;
	public static Item bronzeDiamondPickaxe;
	public static Item workedDiamondPickaxe;
	public static Item steelDiamondPickaxe;
	public static Item cobaltDiamondPickaxe;
	public static Item arditeDiamondPickaxe;
	public static Item manyullynDiamondPickaxe;
	public static Item uraniumDiamondPickaxe;
	
	public static Item woodRedstonePickaxe;
	public static Item stoneRedstonePickaxe;
	public static Item ironRedstonePickaxe;
	public static Item redstoneRedstonePickaxe;
	public static Item obsidianRedstonePickaxe;
	public static Item sandstoneRedstonePickaxe;
	public static Item boneRedstonePickaxe;
	public static Item paperRedstonePickaxe;
	public static Item mossyRedstonePickaxe;
	public static Item netherrackRedstonePickaxe;
	public static Item glowstoneRedstonePickaxe;
	public static Item iceRedstonePickaxe;
	public static Item lavaRedstonePickaxe;
	public static Item slimeRedstonePickaxe;
	public static Item cactusRedstonePickaxe;
	public static Item flintRedstonePickaxe;
	public static Item copperRedstonePickaxe;
	public static Item bronzeRedstonePickaxe;
	public static Item workedRedstonePickaxe;
	public static Item uraniumRedstonePickaxe;
	
	public static Item woodObsidianPickaxe;
	public static Item stoneObsidianPickaxe;
	public static Item redstoneObsidianPickaxe;
	public static Item obsidianObsidianPickaxe;
	public static Item boneObsidianPickaxe;
	public static Item netherrackObsidianPickaxe;
	public static Item glowstoneObsidianPickaxe;
	public static Item iceObsidianPickaxe;
	public static Item lavaObsidianPickaxe;
	public static Item cactusObsidianPickaxe;
	
	public static Item woodSandstonePickaxe;
	public static Item sandstoneSandstonePickaxe;
	public static Item boneSandstonePickaxe;
	public static Item netherrackSandstonePickaxe;
	public static Item iceSandstonePickaxe;
	public static Item slimeSandstonePickaxe;
	public static Item cactusSandstonePickaxe;
	public static Item flintSandstonePickaxe;
	
	public static Item woodBonePickaxe;
	public static Item stoneBonePickaxe;
	public static Item sandstoneBonePickaxe;
	public static Item boneBonePickaxe;
	public static Item paperBonePickaxe;
	public static Item netherrackBonePickaxe;
	public static Item iceBonePickaxe;
	public static Item cactusBonePickaxe;
	public static Item flintBonePickaxe;
	
	public static Item woodPaperPickaxe;
	public static Item bonePaperPickaxe;
	public static Item paperPaperPickaxe;
	public static Item slimePaperPickaxe;
	public static Item cactusPaperPickaxe;
	
	public static Item woodMossyPickaxe;
	public static Item stoneMossyPickaxe;
	public static Item diamondMossyPickaxe;
	public static Item redstoneMossyPickaxe;
	public static Item boneMossyPickaxe;
	public static Item mossyMossyPickaxe;
	public static Item netherrackMossyPickaxe;
	public static Item glowstoneMossyPickaxe;
	public static Item cactusMossyPickaxe;
	public static Item blazeMossyPickaxe;
	public static Item manyullynMossyPickaxe;
	public static Item uraniumMossyPickaxe;
	
	public static Item woodNetherrackPickaxe;
	public static Item stoneNetherrackPickaxe;
	public static Item sandstoneNetherrackPickaxe;
	public static Item boneNetherrackPickaxe;
	public static Item paperNetherrackPickaxe;
	public static Item mossyNetherrackPickaxe;
	public static Item netherrackNetherrackPickaxe;
	public static Item iceNetherrackPickaxe;
	public static Item slimeNetherrackPickaxe;
	public static Item cactusNetherrackPickaxe;
	public static Item flintNetherrackPickaxe;
	public static Item copperNetherrackPickaxe;
	public static Item bronzeNetherrackPickaxe;
	
	public static Item woodGlowstonePickaxe;
	public static Item redstoneGlowstonePickaxe;
	public static Item obsidianGlowstonePickaxe;
	public static Item boneGlowstonePickaxe;
	public static Item netherrackGlowstonePickaxe;
	public static Item glowstoneGlowstonePickaxe;
	public static Item iceGlowstonePickaxe;
	public static Item slimeGlowstonePickaxe;
	public static Item cactusGlowstonePickaxe;
	
	public static Item woodIcePickaxe;
	public static Item boneIcePickaxe;
	public static Item paperIcePickaxe;
	public static Item iceIcePickaxe;
	public static Item slimeIcePickaxe;
	public static Item cactusIcePickaxe;
	
	public static Item diamondLavaPickaxe;
	public static Item obsidianLavaPickaxe;
	public static Item netherrackLavaPickaxe;
	public static Item lavaLavaPickaxe;
	public static Item flintLavaPickaxe;
	public static Item blazeLavaPickaxe;
	public static Item manyullynLavaPickaxe;
	public static Item uraniumLavaPickaxe;
	
	public static Item woodSlimePickaxe;
	public static Item sandstoneSlimePickaxe;
	public static Item boneSlimePickaxe;
	public static Item paperSlimePickaxe;
	public static Item slimeSlimePickaxe;
	public static Item cactusSlimePickaxe;
	
	public static Item woodCactusPickaxe;
	public static Item sandstoneCactusPickaxe;
	public static Item boneCactusPickaxe;
	public static Item netherrackCactusPickaxe;
	public static Item iceCactusPickaxe;
	public static Item slimeCactusPickaxe;
	public static Item cactusCactusPickaxe;
	
	public static Item woodFlintPickaxe;
	public static Item stoneFlintPickaxe;
	public static Item sandstoneFlintPickaxe;
	public static Item boneFlintPickaxe;
	public static Item netherrackFlintPickaxe;
	public static Item slimeFlintPickaxe;
	public static Item cactusFlintPickaxe;
	public static Item flintFlintPickaxe;
	public static Item copperFlintPickaxe;
	public static Item bronzeFlintPickaxe;
	
	public static Item diamondBlazePickaxe;
	public static Item obsidianBlazePickaxe;
	public static Item netherrackBlazePickaxe;
	public static Item lavaBlazePickaxe;
	public static Item flintBlazePickaxe;
	public static Item blazeBlazePickaxe;
	public static Item manyullynBlazePickaxe;
	public static Item uraniumBlazePickaxe;
	
	public static Item woodCopperPickaxe;
	public static Item stoneCopperPickaxe;
    public static Item boneCopperPickaxe;
    public static Item netherrackCopperPickaxe;
    public static Item slimeCopperPickaxe;
    public static Item cactusCopperPickaxe;
    public static Item flintCopperPickaxe;
    public static Item copperCopperPickaxe;
    
    public static Item woodBronzePickaxe;
    public static Item stoneBronzePickaxe;
    public static Item boneBronzePickaxe;
    public static Item netherrackBronzePickaxe;
    public static Item slimeBronzePickaxe;
    public static Item cactusBronzePickaxe;
    public static Item flintBronzePickaxe;
    public static Item copperBronzePickaxe;
    public static Item bronzeBronzePickaxe;
    
    public static Item woodWorkedIronPickaxe;
    public static Item stoneWorkedIronPickaxe;
    public static Item ironWorkedIronPickaxe;
    public static Item diamondWorkedIronPickaxe;
    public static Item redstoneWorkedIronPickaxe;
    public static Item obsidianWorkedIronPickaxe;
    public static Item boneWorkedIronPickaxe;
    public static Item netherrackWorkedIronPickaxe;
    public static Item glowstoneWorkedIronPickaxe;
    public static Item iceWorkedIronPickaxe;
    public static Item slimeWorkedIronPickaxe;
    public static Item cactusWorkedIronPickaxe;
    public static Item blazeWorkedIronPickaxe;
    public static Item copperWorkedIronPickaxe;
    public static Item bronzeWorkedIronPickaxe;
    public static Item workedWorkedIronPickaxe;
    public static Item steelWorkedIronPickaxe;
    public static Item uraniumWorkedIronPickaxe;
    
    public static Item woodSteelPickaxe;
    public static Item stoneSteelPickaxe;
    public static Item ironSteelPickaxe;
    public static Item diamondSteelPickaxe;
    public static Item redstoneSteelPickaxe;
    public static Item obsidianSteelPickaxe;
    public static Item boneSteelPickaxe;
    public static Item netherrackSteelPickaxe;
    public static Item glowstoneSteelPickaxe;
    public static Item iceSteelPickaxe;
    public static Item slimeSteelPickaxe;
    public static Item cactusSteelPickaxe;
    public static Item blazeSteelPickaxe;
    public static Item copperSteelPickaxe;
    public static Item bronzeSteelPickaxe;
    public static Item workedSteelPickaxe;
    public static Item steelSteelPickaxe;
    public static Item cobaltSteelPickaxe;
    public static Item arditeSteelPickaxe;
    public static Item uraniumSteelPickaxe;
    
    public static Item woodCobaltPickaxe;
    public static Item stoneCobaltPickaxe;
    public static Item ironCobaltPickaxe;
    public static Item diamondCobaltPickaxe;
    public static Item redstoneCobaltPickaxe;
    public static Item obsidianCobaltPickaxe;
    public static Item boneCobaltPickaxe;
    public static Item slimeCobaltPickaxe;
    public static Item cactusCobaltPickaxe;
    public static Item blazeCobaltPickaxe;
    public static Item copperCobaltPickaxe;
    public static Item bronzeCobaltPickaxe;
    public static Item workedCobaltPickaxe;
    public static Item steelCobaltPickaxe;
    public static Item cobaltCobaltPickaxe;
    public static Item arditeCobaltPickaxe;
    public static Item manyullynCobaltPickaxe;
    public static Item uraniumCobaltPickaxe;
    
    public static Item woodArditePickaxe;
    public static Item stoneArditePickaxe;
    public static Item ironArditePickaxe;
    public static Item diamondArditePickaxe;
    public static Item redstoneArditePickaxe;
    public static Item obsidianArditePickaxe;
    public static Item boneArditePickaxe;
    public static Item slimeArditePickaxe;
    public static Item cactusArditePickaxe;
    public static Item blazeArditePickaxe;
    public static Item copperArditePickaxe;
    public static Item bronzeArditePickaxe;
    public static Item workedArditePickaxe;
    public static Item steelArditePickaxe;
    public static Item cobaltArditePickaxe;
    public static Item arditeArditePickaxe;
    public static Item manyullynArditePickaxe;
    public static Item uraniumArditePickaxe;
    
    public static Item woodManyullynPickaxe;
    public static Item stoneManyullynPickaxe;
    public static Item ironManyullynPickaxe;
    public static Item diamondManyullynPickaxe;
    public static Item redstoneManyullynPickaxe;
    public static Item obsidianManyullynPickaxe;
    public static Item boneManyullynPickaxe;
    public static Item slimeManyullynPickaxe;
    public static Item cactusManyullynPickaxe;
    public static Item blazeManyullynPickaxe;
    public static Item copperManyullynPickaxe;
    public static Item bronzeManyullynPickaxe;
    public static Item workedManyullynPickaxe;
    public static Item steelManyullynPickaxe;
    public static Item cobaltManyullynPickaxe;
    public static Item arditeManyullynPickaxe;
    public static Item manyullynManyullynPickaxe;
    public static Item uraniumManyullynPickaxe;
    
    public static Item diamondUraniumPickaxe;
    public static Item redstoneUraniumPickaxe;
    public static Item boneUraniumPickaxe;
    public static Item netherrackUraniumPickaxe;
    public static Item glowstoneUraniumPickaxe;
    public static Item lavaUraniumPickaxe;
    public static Item blazeUraniumPickaxe;
    public static Item cobaltUraniumPickaxe;
    public static Item arditeUraniumPickaxe;
    public static Item uraniumUraniumPickaxe;
}
