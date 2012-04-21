package net.minecraft.src.infihybrids;
import net.minecraft.src.Block;
import net.minecraft.src.InfiMaterialEnum;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;
import net.minecraft.src.ModLoader;
import net.minecraft.src.mod_InfiBase;
import net.minecraft.src.mod_InfiHybrids;
import net.minecraft.src.forge.MinecraftForge;

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
    	woodWoodScythe = new InfiToolScythe(PropsHelperInfiHybrids.woodScytheID+0, 
                InfiMaterialEnum.Wood, InfiMaterialEnum.Wood, "woodWoodScythe");
    	woodStoneScythe = new InfiToolScythe(PropsHelperInfiHybrids.stoneScytheID+0, 
                InfiMaterialEnum.Stone, InfiMaterialEnum.Wood, "woodStoneScythe");
    	woodIronScythe = new InfiToolScythe(PropsHelperInfiHybrids.ironScytheID+0, 
                InfiMaterialEnum.Iron, InfiMaterialEnum.Wood, "woodIronScythe");
    	woodDiamondScythe = new InfiToolScythe(PropsHelperInfiHybrids.diamondScytheID+0, 
                InfiMaterialEnum.Diamond, InfiMaterialEnum.Wood, "woodDiamondScythe");
    	
    	ModLoader.addName(woodWoodScythe, "Wooden Scythe");
    }
    
    private static void registerVanillaRecipes()
    {
    	ModLoader.addRecipe(new ItemStack(woodWoodScythe), new Object[] 
                { recipe, '#', Block.planks, '|', Item.stick, });
		ModLoader.addRecipe(new ItemStack(woodStoneScythe), new Object[] 
                { recipe, '#', Block.cobblestone, '|', Item.stick, });
		ModLoader.addRecipe(new ItemStack(woodIronScythe), new Object[] 
                { recipe, '#', Item.ingotIron, '|', Item.stick, });
		ModLoader.addRecipe(new ItemStack(woodDiamondScythe), new Object[] 
                { recipe, '#', Item.diamond, '|', Item.stick, });
    }
    
    private static void createTools()
    {
    	if(PropsHelperInfiHybrids.enableWoodTools)
    	{
    		woodWoodScythe = new InfiToolScythe(PropsHelperInfiHybrids.woodScytheID+0, 
                    InfiMaterialEnum.Wood, InfiMaterialEnum.Wood, "woodWoodScythe");
    		sandstoneWoodScythe = new InfiToolScythe(PropsHelperInfiHybrids.woodScytheID+1, 
                    InfiMaterialEnum.Wood, InfiMaterialEnum.Sandstone, "sandstoneWoodScythe");
    		boneWoodScythe = new InfiToolScythe(PropsHelperInfiHybrids.woodScytheID+2, 
                    InfiMaterialEnum.Wood, InfiMaterialEnum.Bone, "boneWoodScythe");
    		paperWoodScythe = new InfiToolScythe(PropsHelperInfiHybrids.woodScytheID+3, 
                    InfiMaterialEnum.Wood, InfiMaterialEnum.Paper, "paperWoodScythe");
    		iceWoodScythe = new InfiToolScythe(PropsHelperInfiHybrids.woodScytheID+4, 
                    InfiMaterialEnum.Wood, InfiMaterialEnum.Ice, "iceWoodScythe");
    		slimeWoodScythe = new InfiToolScythe(PropsHelperInfiHybrids.woodScytheID+5, 
                    InfiMaterialEnum.Wood, InfiMaterialEnum.Slime, "slimeWoodScythe");
    		cactusWoodScythe = new InfiToolScythe(PropsHelperInfiHybrids.woodScytheID+6, 
                    InfiMaterialEnum.Wood, InfiMaterialEnum.Cactus, "cactusWoodScythe");
    	}

        if(PropsHelperInfiHybrids.enableStoneTools)
        {
        	woodStoneScythe = new InfiToolScythe(PropsHelperInfiHybrids.stoneScytheID+0, 
                    InfiMaterialEnum.Stone, InfiMaterialEnum.Wood, "woodStoneScythe");
        	stoneStoneScythe = new InfiToolScythe(PropsHelperInfiHybrids.stoneScytheID+1, 
                    InfiMaterialEnum.Stone, InfiMaterialEnum.Stone, "stoneStoneScythe");
        	sandstoneStoneScythe = new InfiToolScythe(PropsHelperInfiHybrids.stoneScytheID+2, 
                    InfiMaterialEnum.Stone, InfiMaterialEnum.Sandstone, "sandstoneStoneScythe");
        	boneStoneScythe = new InfiToolScythe(PropsHelperInfiHybrids.stoneScytheID+3, 
                    InfiMaterialEnum.Stone, InfiMaterialEnum.Bone, "boneStoneScythe");
        	netherrackStoneScythe = new InfiToolScythe(PropsHelperInfiHybrids.stoneScytheID+4, 
                    InfiMaterialEnum.Stone, InfiMaterialEnum.Netherrack, "netherrackStoneScythe");
        	iceStoneScythe = new InfiToolScythe(PropsHelperInfiHybrids.stoneScytheID+5, 
                    InfiMaterialEnum.Stone, InfiMaterialEnum.Ice, "iceStoneScythe");
        	slimeStoneScythe = new InfiToolScythe(PropsHelperInfiHybrids.stoneScytheID+6, 
                    InfiMaterialEnum.Stone, InfiMaterialEnum.Slime, "slimeStoneScythe");
        	cactusStoneScythe = new InfiToolScythe(PropsHelperInfiHybrids.stoneScytheID+7, 
                    InfiMaterialEnum.Stone, InfiMaterialEnum.Cactus, "cactusStoneScythe");
        	flintStoneScythe = new InfiToolScythe(PropsHelperInfiHybrids.stoneScytheID+8, 
                    InfiMaterialEnum.Stone, InfiMaterialEnum.Flint, "flintStoneScythe");
        }
        
        if(PropsHelperInfiHybrids.enableIronTools)
        {
        	woodIronScythe = new InfiToolScythe(PropsHelperInfiHybrids.ironScytheID+0, 
                    InfiMaterialEnum.Iron, InfiMaterialEnum.Wood, "woodIronScythe");
        	stoneIronScythe = new InfiToolScythe(PropsHelperInfiHybrids.ironScytheID+1, 
                    InfiMaterialEnum.Iron, InfiMaterialEnum.Stone, "stoneIronScythe");
        	ironIronScythe = new InfiToolScythe(PropsHelperInfiHybrids.ironScytheID+2, 
                    InfiMaterialEnum.Iron, InfiMaterialEnum.Iron, "ironIronScythe");
        	boneIronScythe = new InfiToolScythe(PropsHelperInfiHybrids.ironScytheID+3, 
                    InfiMaterialEnum.Iron, InfiMaterialEnum.Bone, "boneIronScythe");
        	netherrackIronScythe = new InfiToolScythe(PropsHelperInfiHybrids.ironScytheID+4, 
                    InfiMaterialEnum.Iron, InfiMaterialEnum.Netherrack, "netherrackIronScythe");
        	glowstoneIronScythe = new InfiToolScythe(PropsHelperInfiHybrids.ironScytheID+5, 
                    InfiMaterialEnum.Iron, InfiMaterialEnum.Glowstone, "glowstoneIronScythe");
        	cactusIronScythe = new InfiToolScythe(PropsHelperInfiHybrids.ironScytheID+6, 
                    InfiMaterialEnum.Iron, InfiMaterialEnum.Cactus, "cactusIronScythe");
        	copperIronScythe = new InfiToolScythe(PropsHelperInfiHybrids.ironScytheID+7, 
                    InfiMaterialEnum.Iron, InfiMaterialEnum.Copper, "copperIronScythe");
        	bronzeIronScythe = new InfiToolScythe(PropsHelperInfiHybrids.ironScytheID+8, 
                    InfiMaterialEnum.Iron, InfiMaterialEnum.Bronze, "bronzeIronScythe");
        }
        
        if(PropsHelperInfiHybrids.enableDiamondTools)
        {
        	woodDiamondScythe = new InfiToolScythe(PropsHelperInfiHybrids.diamondScytheID+0, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Wood, "woodDiamondScythe");
        	stoneDiamondScythe = new InfiToolScythe(PropsHelperInfiHybrids.diamondScytheID+1, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Stone, "stoneDiamondScythe");
        	ironDiamondScythe = new InfiToolScythe(PropsHelperInfiHybrids.diamondScytheID+2, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Iron, "ironDiamondScythe");
        	diamondDiamondScythe = new InfiToolScythe(PropsHelperInfiHybrids.diamondScytheID+3, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Diamond, "diamondDiamondScythe");
        	redstoneDiamondScythe = new InfiToolScythe(PropsHelperInfiHybrids.diamondScytheID+4, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Redstone, "redstoneDiamondScythe");
        	obsidianDiamondScythe = new InfiToolScythe(PropsHelperInfiHybrids.diamondScytheID+5, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Obsidian, "obsidianDiamondScythe");
        	boneDiamondScythe = new InfiToolScythe(PropsHelperInfiHybrids.diamondScytheID+6, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Bone, "boneDiamondScythe");
        	mossyDiamondScythe = new InfiToolScythe(PropsHelperInfiHybrids.diamondScytheID+7, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Mossy, "mossyDiamondScythe");
        	netherrackDiamondScythe = new InfiToolScythe(PropsHelperInfiHybrids.diamondScytheID+8, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Netherrack, "netherrackDiamondScythe");
        	glowstoneDiamondScythe = new InfiToolScythe(PropsHelperInfiHybrids.diamondScytheID+9, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Glowstone, "glowstoneDiamondScythe");
        	lavaDiamondScythe = new InfiToolScythe(PropsHelperInfiHybrids.diamondScytheID+10, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Lava, "lavaDiamondScythe");
        	cactusDiamondScythe = new InfiToolScythe(PropsHelperInfiHybrids.diamondScytheID+11, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Cactus, "cactusDiamondScythe");
        	flintDiamondScythe = new InfiToolScythe(PropsHelperInfiHybrids.diamondScytheID+12, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Flint, "flintDiamondScythe");
        	blazeDiamondScythe = new InfiToolScythe(PropsHelperInfiHybrids.diamondScytheID+13, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Blaze, "blazeDiamondScythe");
            copperDiamondScythe = new InfiToolScythe(PropsHelperInfiHybrids.diamondScytheID+14, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Copper, "copperDiamondScythe");
            bronzeDiamondScythe = new InfiToolScythe(PropsHelperInfiHybrids.diamondScytheID+15, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Bronze, "bronzeDiamondScythe");
            workedDiamondScythe = new InfiToolScythe(PropsHelperInfiHybrids.diamondScytheID+16, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.WorkedIron, "workedDiamondScythe");
            steelDiamondScythe = new InfiToolScythe(PropsHelperInfiHybrids.diamondScytheID+17, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Steel, "steelDiamondScythe");
            cobaltDiamondScythe = new InfiToolScythe(PropsHelperInfiHybrids.diamondScytheID+18, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Cobalt, "cobaltDiamondScythe");
            arditeDiamondScythe = new InfiToolScythe(PropsHelperInfiHybrids.diamondScytheID+19, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Ardite, "arditeDiamondScythe");
            manyullynDiamondScythe = new InfiToolScythe(PropsHelperInfiHybrids.diamondScytheID+20, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Manyullyn, "manyullynDiamondScythe");
            uraniumDiamondScythe = new InfiToolScythe(PropsHelperInfiHybrids.diamondScytheID+21, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Uranium, "uraniumDiamondScythe");
        }
        
        if(PropsHelperInfiHybrids.enableRedstoneTools)
        {
        	woodRedstoneScythe = new InfiToolScythe(PropsHelperInfiHybrids.redstoneScytheID+0, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Wood, "woodRedstoneScythe");
        	stoneRedstoneScythe = new InfiToolScythe(PropsHelperInfiHybrids.redstoneScytheID+1, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Stone, "stoneRedstoneScythe");
        	ironRedstoneScythe = new InfiToolScythe(PropsHelperInfiHybrids.redstoneScytheID+2, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Iron, "ironRedstoneScythe");
        	redstoneRedstoneScythe = new InfiToolScythe(PropsHelperInfiHybrids.redstoneScytheID+3, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Redstone, "redstoneRedstoneScythe");
        	obsidianRedstoneScythe = new InfiToolScythe(PropsHelperInfiHybrids.redstoneScytheID+4, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Obsidian, "obsidianRedstoneScythe");
        	sandstoneRedstoneScythe = new InfiToolScythe(PropsHelperInfiHybrids.redstoneScytheID+5, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Sandstone, "sandstoneRedstoneScythe");
        	boneRedstoneScythe = new InfiToolScythe(PropsHelperInfiHybrids.redstoneScytheID+6, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Bone, "boneRedstoneScythe");
        	paperRedstoneScythe = new InfiToolScythe(PropsHelperInfiHybrids.redstoneScytheID+7, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Paper, "paperRedstoneScythe");
        	mossyRedstoneScythe = new InfiToolScythe(PropsHelperInfiHybrids.redstoneScytheID+8, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Mossy, "mossyRedstoneScythe");
        	netherrackRedstoneScythe = new InfiToolScythe(PropsHelperInfiHybrids.redstoneScytheID+9, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Netherrack, "netherrackRedstoneScythe");
        	glowstoneRedstoneScythe = new InfiToolScythe(PropsHelperInfiHybrids.redstoneScytheID+10, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Glowstone, "glowstoneRedstoneScythe");
        	iceRedstoneScythe = new InfiToolScythe(PropsHelperInfiHybrids.redstoneScytheID+11, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Ice, "iceRedstoneScythe");
        	lavaRedstoneScythe = new InfiToolScythe(PropsHelperInfiHybrids.redstoneScytheID+12,
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Lava, "lavaRedstoneScythe");
        	slimeRedstoneScythe = new InfiToolScythe(PropsHelperInfiHybrids.redstoneScytheID+13,
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Slime, "slimeRedstoneScythe");
        	cactusRedstoneScythe = new InfiToolScythe(PropsHelperInfiHybrids.redstoneScytheID+14,
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Cactus, "cactusRedstoneScythe");
        	flintRedstoneScythe = new InfiToolScythe(PropsHelperInfiHybrids.redstoneScytheID+15,
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Flint, "flintRedstoneScythe");
        	copperRedstoneScythe = new InfiToolScythe(PropsHelperInfiHybrids.redstoneScytheID+16,
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Copper, "copperRedstoneScythe");
        	bronzeRedstoneScythe = new InfiToolScythe(PropsHelperInfiHybrids.redstoneScytheID+17,
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Bronze, "bronzeRedstoneScythe");
        	workedRedstoneScythe = new InfiToolScythe(PropsHelperInfiHybrids.redstoneScytheID+18,
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.WorkedIron, "workedRedstoneScythe");
        	uraniumRedstoneScythe = new InfiToolScythe(PropsHelperInfiHybrids.redstoneScytheID+19,
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Uranium, "uraniumRedstoneScythe");
        }
        
        if(PropsHelperInfiHybrids.enableObsidianTools)
        {
        	woodObsidianScythe = new InfiToolScythe(PropsHelperInfiHybrids.obsidianScytheID+0, 
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Wood, "woodObsidianScythe");
        	stoneObsidianScythe = new InfiToolScythe(PropsHelperInfiHybrids.obsidianScytheID+1, 
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Stone, "stoneObsidianScythe");
        	redstoneObsidianScythe = new InfiToolScythe(PropsHelperInfiHybrids.obsidianScytheID+2, 
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Redstone, "redstoneObsidianScythe");
        	obsidianObsidianScythe = new InfiToolScythe(PropsHelperInfiHybrids.obsidianScytheID+3, 
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Obsidian, "obsidianObsidianScythe");;
        	boneObsidianScythe = new InfiToolScythe(PropsHelperInfiHybrids.obsidianScytheID+4, 
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Bone, "boneObsidianScythe");
        	netherrackObsidianScythe = new InfiToolScythe(PropsHelperInfiHybrids.obsidianScytheID+5, 
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Netherrack, "netherrackObsidianScythe");
        	glowstoneObsidianScythe = new InfiToolScythe(PropsHelperInfiHybrids.obsidianScytheID+6, 
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Glowstone, "glowstoneObsidianScythe");
        	iceObsidianScythe = new InfiToolScythe(PropsHelperInfiHybrids.obsidianScytheID+7, 
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Ice, "iceObsidianScythe");
        	lavaObsidianScythe = new InfiToolScythe(PropsHelperInfiHybrids.obsidianScytheID+8,
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Lava, "lavaObsidianScythe");
        	cactusObsidianScythe = new InfiToolScythe(PropsHelperInfiHybrids.obsidianScytheID+9,
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Cactus, "cactusObsidianScythe");
        }
        
        if(PropsHelperInfiHybrids.enableSandstoneTools)
        {
        	woodSandstoneScythe = new InfiToolScythe(PropsHelperInfiHybrids.sandstoneScytheID+0, 
                    InfiMaterialEnum.Sandstone, InfiMaterialEnum.Wood, "woodSandstoneScythe");
        	sandstoneSandstoneScythe = new InfiToolScythe(PropsHelperInfiHybrids.sandstoneScytheID+1, 
                    InfiMaterialEnum.Sandstone, InfiMaterialEnum.Sandstone, "sandstoneSandstoneScythe");
        	boneSandstoneScythe = new InfiToolScythe(PropsHelperInfiHybrids.sandstoneScytheID+2, 
                    InfiMaterialEnum.Sandstone, InfiMaterialEnum.Bone, "boneSandstoneScythe");
        	netherrackSandstoneScythe = new InfiToolScythe(PropsHelperInfiHybrids.sandstoneScytheID+3, 
                    InfiMaterialEnum.Sandstone, InfiMaterialEnum.Netherrack, "netherrackSandstoneScythe");
        	iceSandstoneScythe = new InfiToolScythe(PropsHelperInfiHybrids.sandstoneScytheID+4, 
                    InfiMaterialEnum.Sandstone, InfiMaterialEnum.Ice, "iceSandstoneScythe");
        	slimeSandstoneScythe = new InfiToolScythe(PropsHelperInfiHybrids.sandstoneScytheID+5,
                    InfiMaterialEnum.Sandstone, InfiMaterialEnum.Slime, "slimeSandstoneScythe");
        	cactusSandstoneScythe = new InfiToolScythe(PropsHelperInfiHybrids.sandstoneScytheID+6,
                    InfiMaterialEnum.Sandstone, InfiMaterialEnum.Cactus, "cactusSandstoneScythe");
        	flintSandstoneScythe = new InfiToolScythe(PropsHelperInfiHybrids.sandstoneScytheID+7,
                    InfiMaterialEnum.Sandstone, InfiMaterialEnum.Flint, "flintSandstoneScythe");
        }
        
        if(PropsHelperInfiHybrids.enableBoneTools)
        {
        	woodBoneScythe = new InfiToolScythe(PropsHelperInfiHybrids.boneScytheID+0, 
                    InfiMaterialEnum.Bone, InfiMaterialEnum.Wood, "woodBoneScythe");
        	stoneBoneScythe = new InfiToolScythe(PropsHelperInfiHybrids.boneScytheID+1, 
                    InfiMaterialEnum.Bone, InfiMaterialEnum.Stone, "stoneBoneScythe");
        	sandstoneBoneScythe = new InfiToolScythe(PropsHelperInfiHybrids.boneScytheID+2, 
                    InfiMaterialEnum.Bone, InfiMaterialEnum.Sandstone, "sandstoneBoneScythe");
        	boneBoneScythe = new InfiToolScythe(PropsHelperInfiHybrids.boneScytheID+3, 
                    InfiMaterialEnum.Bone, InfiMaterialEnum.Bone, "boneBoneScythe");
        	paperBoneScythe = new InfiToolScythe(PropsHelperInfiHybrids.boneScytheID+4, 
                    InfiMaterialEnum.Bone, InfiMaterialEnum.Paper, "paperBoneScythe");
        	netherrackBoneScythe = new InfiToolScythe(PropsHelperInfiHybrids.boneScytheID+5, 
                    InfiMaterialEnum.Bone, InfiMaterialEnum.Netherrack, "netherrackBoneScythe");
        	iceBoneScythe = new InfiToolScythe(PropsHelperInfiHybrids.boneScytheID+6, 
                    InfiMaterialEnum.Bone, InfiMaterialEnum.Ice, "iceBoneScythe");
        	cactusBoneScythe = new InfiToolScythe(PropsHelperInfiHybrids.boneScytheID+7,
                    InfiMaterialEnum.Bone, InfiMaterialEnum.Cactus, "cactusBoneScythe");
        	flintBoneScythe = new InfiToolScythe(PropsHelperInfiHybrids.boneScytheID+8,
                    InfiMaterialEnum.Bone, InfiMaterialEnum.Flint, "flintBoneScythe");
        }
        
        if(PropsHelperInfiHybrids.enablePaperTools)
        {
        	woodPaperScythe = new InfiToolScythe(PropsHelperInfiHybrids.paperScytheID+0, 
                    InfiMaterialEnum.Paper, InfiMaterialEnum.Wood, "woodPaperScythe");
        	bonePaperScythe = new InfiToolScythe(PropsHelperInfiHybrids.paperScytheID+1, 
                    InfiMaterialEnum.Paper, InfiMaterialEnum.Bone, "bonePaperScythe");
        	paperPaperScythe = new InfiToolScythe(PropsHelperInfiHybrids.paperScytheID+2, 
                    InfiMaterialEnum.Paper, InfiMaterialEnum.Paper, "paperPaperScythe");
        	slimePaperScythe = new InfiToolScythe(PropsHelperInfiHybrids.paperScytheID+3,
                    InfiMaterialEnum.Paper, InfiMaterialEnum.Slime, "slimePaperScythe");
        	cactusPaperScythe = new InfiToolScythe(PropsHelperInfiHybrids.paperScytheID+4,
                    InfiMaterialEnum.Paper, InfiMaterialEnum.Cactus, "cactusPaperScythe");
        }
        
        if(PropsHelperInfiHybrids.enableMossyTools)
        {
        	woodMossyScythe = new InfiToolScythe(PropsHelperInfiHybrids.mossyScytheID+0, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Wood, "woodMossyScythe");
        	stoneMossyScythe = new InfiToolScythe(PropsHelperInfiHybrids.mossyScytheID+1, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Stone, "stoneMossyScythe");
        	diamondMossyScythe = new InfiToolScythe(PropsHelperInfiHybrids.mossyScytheID+2, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Diamond, "diamondMossyScythe");
        	redstoneMossyScythe = new InfiToolScythe(PropsHelperInfiHybrids.mossyScytheID+3, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Redstone, "redstoneMossyScythe");
        	boneMossyScythe = new InfiToolScythe(PropsHelperInfiHybrids.mossyScytheID+4, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Bone, "boneMossyScythe");
        	mossyMossyScythe = new InfiToolScythe(PropsHelperInfiHybrids.mossyScytheID+5, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Mossy, "mossyMossyScythe");
        	netherrackMossyScythe = new InfiToolScythe(PropsHelperInfiHybrids.mossyScytheID+6, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Netherrack, "netherrackMossyScythe");
        	glowstoneMossyScythe = new InfiToolScythe(PropsHelperInfiHybrids.mossyScytheID+7, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Glowstone, "glowstoneMossyScythe");
        	cactusMossyScythe = new InfiToolScythe(PropsHelperInfiHybrids.mossyScytheID+8, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Cactus, "cactusMossyScythe");
        	blazeMossyScythe = new InfiToolScythe(PropsHelperInfiHybrids.mossyScytheID+9, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Blaze, "blazeMossyScythe");
        	manyullynMossyScythe = new InfiToolScythe(PropsHelperInfiHybrids.mossyScytheID+10, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Manyullyn, "manyullynMossyScythe");
        	uraniumMossyScythe = new InfiToolScythe(PropsHelperInfiHybrids.mossyScytheID+11, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Uranium, "uraniumMossyScythe");
        }
        
        if(PropsHelperInfiHybrids.enableNetherrackTools)
        {
        	woodNetherrackScythe = new InfiToolScythe(PropsHelperInfiHybrids.netherrackScytheID+0, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Wood, "woodNetherrackScythe");
        	stoneNetherrackScythe = new InfiToolScythe(PropsHelperInfiHybrids.netherrackScytheID+1, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Stone, "stoneNetherrackScythe");
        	sandstoneNetherrackScythe = new InfiToolScythe(PropsHelperInfiHybrids.netherrackScytheID+2, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Sandstone, "sandstoneNetherrackScythe");
        	boneNetherrackScythe = new InfiToolScythe(PropsHelperInfiHybrids.netherrackScytheID+3, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Bone, "boneNetherrackScythe");
        	paperNetherrackScythe = new InfiToolScythe(PropsHelperInfiHybrids.netherrackScytheID+4, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Paper, "paperNetherrackScythe");
        	mossyNetherrackScythe = new InfiToolScythe(PropsHelperInfiHybrids.netherrackScytheID+5, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Mossy, "mossyNetherrackScythe");
        	netherrackNetherrackScythe = new InfiToolScythe(PropsHelperInfiHybrids.netherrackScytheID+6, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Netherrack, "netherrackNetherrackScythe");
        	iceNetherrackScythe = new InfiToolScythe(PropsHelperInfiHybrids.netherrackScytheID+7, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Ice, "iceNetherrackScythe");
        	slimeNetherrackScythe = new InfiToolScythe(PropsHelperInfiHybrids.netherrackScytheID+8, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Slime, "slimeNetherrackScythe");
        	cactusNetherrackScythe = new InfiToolScythe(PropsHelperInfiHybrids.netherrackScytheID+9, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Cactus, "cactusNetherrackScythe");
        	flintNetherrackScythe = new InfiToolScythe(PropsHelperInfiHybrids.netherrackScytheID+10, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Flint, "flintNetherrackScythe");
        	copperNetherrackScythe = new InfiToolScythe(PropsHelperInfiHybrids.netherrackScytheID+11, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Copper, "copperNetherrackScythe");
        	bronzeNetherrackScythe = new InfiToolScythe(PropsHelperInfiHybrids.netherrackScytheID+12, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Bronze, "bronzeNetherrackScythe");
        }
        
        if(PropsHelperInfiHybrids.enableGlowstoneTools)
        {
        	woodGlowstoneScythe = new InfiToolScythe(PropsHelperInfiHybrids.glowstoneScytheID+0, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Wood, "woodGlowstoneScythe");
        	redstoneGlowstoneScythe = new InfiToolScythe(PropsHelperInfiHybrids.glowstoneScytheID+1, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Redstone, "redstoneGlowstoneScythe");
        	obsidianGlowstoneScythe = new InfiToolScythe(PropsHelperInfiHybrids.glowstoneScytheID+2, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Obsidian, "obsidianGlowstoneScythe");
        	boneGlowstoneScythe = new InfiToolScythe(PropsHelperInfiHybrids.glowstoneScytheID+3, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Bone, "boneGlowstoneScythe");
        	netherrackGlowstoneScythe = new InfiToolScythe(PropsHelperInfiHybrids.glowstoneScytheID+4, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Netherrack, "netherrackGlowstoneScythe");
        	glowstoneGlowstoneScythe = new InfiToolScythe(PropsHelperInfiHybrids.glowstoneScytheID+5, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Glowstone, "glowstoneGlowstoneScythe");
        	iceGlowstoneScythe = new InfiToolScythe(PropsHelperInfiHybrids.glowstoneScytheID+6, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Ice, "iceGlowstoneScythe");
        	slimeGlowstoneScythe = new InfiToolScythe(PropsHelperInfiHybrids.glowstoneScytheID+7, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Slime, "slimeGlowstoneScythe");
        	cactusGlowstoneScythe = new InfiToolScythe(PropsHelperInfiHybrids.glowstoneScytheID+8, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Cactus, "cactusGlowstoneScythe");
        }
        
        if(PropsHelperInfiHybrids.enableIceTools)
        {
        	woodIceScythe = new InfiToolScythe(PropsHelperInfiHybrids.iceScytheID+0, 
                    InfiMaterialEnum.Ice, InfiMaterialEnum.Wood, "woodIceScythe");
        	boneIceScythe = new InfiToolScythe(PropsHelperInfiHybrids.iceScytheID+1, 
                    InfiMaterialEnum.Ice, InfiMaterialEnum.Bone, "boneIceScythe");
        	paperIceScythe = new InfiToolScythe(PropsHelperInfiHybrids.iceScytheID+2, 
                    InfiMaterialEnum.Ice, InfiMaterialEnum.Paper, "paperIceScythe");
        	iceIceScythe = new InfiToolScythe(PropsHelperInfiHybrids.iceScytheID+3, 
                    InfiMaterialEnum.Ice, InfiMaterialEnum.Ice, "iceIceScythe");
        	slimeIceScythe = new InfiToolScythe(PropsHelperInfiHybrids.iceScytheID+4, 
                    InfiMaterialEnum.Ice, InfiMaterialEnum.Slime, "slimeIceScythe");
        	cactusIceScythe = new InfiToolScythe(PropsHelperInfiHybrids.iceScytheID+5, 
                    InfiMaterialEnum.Ice, InfiMaterialEnum.Cactus, "cactusIceScythe");
        }
        
        if(PropsHelperInfiHybrids.enableLavaTools)
        {
        	diamondLavaScythe = new InfiToolScythe(PropsHelperInfiHybrids.lavaScytheID+0, 
                    InfiMaterialEnum.Lava, InfiMaterialEnum.Diamond, "diamondLavaScythe");
        	obsidianLavaScythe = new InfiToolScythe(PropsHelperInfiHybrids.lavaScytheID+1, 
                    InfiMaterialEnum.Lava, InfiMaterialEnum.Obsidian, "obsidianLavaScythe");
        	netherrackLavaScythe = new InfiToolScythe(PropsHelperInfiHybrids.lavaScytheID+2, 
                    InfiMaterialEnum.Lava, InfiMaterialEnum.Netherrack, "netherrackLavaScythe");
        	lavaLavaScythe = new InfiToolScythe(PropsHelperInfiHybrids.lavaScytheID+3, 
                    InfiMaterialEnum.Lava, InfiMaterialEnum.Lava, "lavaLavaScythe");
        	flintLavaScythe = new InfiToolScythe(PropsHelperInfiHybrids.lavaScytheID+4, 
                    InfiMaterialEnum.Lava, InfiMaterialEnum.Flint, "flintLavaScythe");
        	blazeLavaScythe = new InfiToolScythe(PropsHelperInfiHybrids.lavaScytheID+5, 
                    InfiMaterialEnum.Lava, InfiMaterialEnum.Blaze, "blazeLavaScythe");
        	manyullynLavaScythe = new InfiToolScythe(PropsHelperInfiHybrids.lavaScytheID+6, 
                    InfiMaterialEnum.Lava, InfiMaterialEnum.Manyullyn, "manyullynLavaScythe");
            uraniumLavaScythe = new InfiToolScythe(PropsHelperInfiHybrids.lavaScytheID+7, 
                    InfiMaterialEnum.Lava, InfiMaterialEnum.Uranium, "uraniumLavaScythe");
        }
        
        if(PropsHelperInfiHybrids.enableSlimeTools)
        {
        	woodSlimeScythe = new InfiToolScythe(PropsHelperInfiHybrids.slimeScytheID+0, 
                    InfiMaterialEnum.Slime, InfiMaterialEnum.Wood, "woodSlimeScythe");
        	sandstoneSlimeScythe = new InfiToolScythe(PropsHelperInfiHybrids.slimeScytheID+1, 
                    InfiMaterialEnum.Slime, InfiMaterialEnum.Sandstone, "sandstoneSlimeScythe");
        	boneSlimeScythe = new InfiToolScythe(PropsHelperInfiHybrids.slimeScytheID+2, 
                    InfiMaterialEnum.Slime, InfiMaterialEnum.Bone, "boneSlimeScythe");
        	paperSlimeScythe = new InfiToolScythe(PropsHelperInfiHybrids.slimeScytheID+3, 
                    InfiMaterialEnum.Slime, InfiMaterialEnum.Paper, "paperSlimeScythe");
        	slimeSlimeScythe = new InfiToolScythe(PropsHelperInfiHybrids.slimeScytheID+4, 
                    InfiMaterialEnum.Slime, InfiMaterialEnum.Slime, "slimeSlimeScythe");
        	cactusSlimeScythe = new InfiToolScythe(PropsHelperInfiHybrids.slimeScytheID+5, 
                    InfiMaterialEnum.Slime, InfiMaterialEnum.Cactus, "cactusSlimeScythe");
        }
        
        if(PropsHelperInfiHybrids.enableCactusTools)
        {
        	woodCactusScythe = new InfiToolScythe(PropsHelperInfiHybrids.cactusScytheID+0, 
                    InfiMaterialEnum.Cactus, InfiMaterialEnum.Wood, "woodCactusScythe");
        	sandstoneCactusScythe = new InfiToolScythe(PropsHelperInfiHybrids.cactusScytheID+1, 
                    InfiMaterialEnum.Cactus, InfiMaterialEnum.Sandstone, "sandstoneCactusScythe");
        	boneCactusScythe = new InfiToolScythe(PropsHelperInfiHybrids.cactusScytheID+2, 
                    InfiMaterialEnum.Cactus, InfiMaterialEnum.Bone, "boneCactusScythe");
        	netherrackCactusScythe = new InfiToolScythe(PropsHelperInfiHybrids.cactusScytheID+3, 
                    InfiMaterialEnum.Cactus, InfiMaterialEnum.Netherrack, "netherrackCactusScythe");
        	iceCactusScythe = new InfiToolScythe(PropsHelperInfiHybrids.cactusScytheID+4, 
                    InfiMaterialEnum.Cactus, InfiMaterialEnum.Ice, "iceCactusScythe");
        	slimeCactusScythe = new InfiToolScythe(PropsHelperInfiHybrids.cactusScytheID+5, 
                    InfiMaterialEnum.Cactus, InfiMaterialEnum.Slime, "slimeCactusScythe");
        	cactusCactusScythe = new InfiToolScythe(PropsHelperInfiHybrids.cactusScytheID+6, 
                    InfiMaterialEnum.Cactus, InfiMaterialEnum.Cactus, "cactusCactusScythe");
        }
        
        if(PropsHelperInfiHybrids.enableFlintTools)
        {
        	woodFlintScythe = new InfiToolScythe(PropsHelperInfiHybrids.flintScytheID+0, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Wood, "woodFlintScythe");
        	stoneFlintScythe = new InfiToolScythe(PropsHelperInfiHybrids.flintScytheID+1, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Stone, "stoneFlintScythe");
        	sandstoneFlintScythe = new InfiToolScythe(PropsHelperInfiHybrids.flintScytheID+2, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Sandstone, "sandstoneFlintScythe");
        	boneFlintScythe = new InfiToolScythe(PropsHelperInfiHybrids.flintScytheID+3, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Bone, "boneFlintScythe");
        	netherrackFlintScythe = new InfiToolScythe(PropsHelperInfiHybrids.flintScytheID+4, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Netherrack, "netherrackFlintScythe");
        	slimeFlintScythe = new InfiToolScythe(PropsHelperInfiHybrids.flintScytheID+5, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Slime, "slimeFlintScythe");
        	cactusFlintScythe = new InfiToolScythe(PropsHelperInfiHybrids.flintScytheID+6, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Cactus, "cactusFlintScythe");
        	flintFlintScythe = new InfiToolScythe(PropsHelperInfiHybrids.flintScytheID+7, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Flint, "flintFlintScythe");
        	copperFlintScythe = new InfiToolScythe(PropsHelperInfiHybrids.flintScytheID+8, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Copper, "copperFlintScythe");
        	bronzeFlintScythe = new InfiToolScythe(PropsHelperInfiHybrids.flintScytheID+9, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Bronze, "bronzeFlintScythe");
        }
        
        if(PropsHelperInfiHybrids.enableBlazeTools)
        {
        	diamondBlazeScythe = new InfiToolScythe(PropsHelperInfiHybrids.blazeScytheID+0, 
                    InfiMaterialEnum.Blaze, InfiMaterialEnum.Diamond, "diamondBlazeScythe");
        	obsidianBlazeScythe = new InfiToolScythe(PropsHelperInfiHybrids.blazeScytheID+1, 
                    InfiMaterialEnum.Blaze, InfiMaterialEnum.Obsidian, "obsidianBlazeScythe");
        	netherrackBlazeScythe = new InfiToolScythe(PropsHelperInfiHybrids.blazeScytheID+2, 
                    InfiMaterialEnum.Blaze, InfiMaterialEnum.Netherrack, "netherrackBlazeScythe");
        	lavaBlazeScythe = new InfiToolScythe(PropsHelperInfiHybrids.blazeScytheID+3, 
                    InfiMaterialEnum.Blaze, InfiMaterialEnum.Lava, "lavaBlazeScythe");
        	flintBlazeScythe = new InfiToolScythe(PropsHelperInfiHybrids.blazeScytheID+4, 
                    InfiMaterialEnum.Blaze, InfiMaterialEnum.Flint, "flintBlazeScythe");
        	blazeBlazeScythe = new InfiToolScythe(PropsHelperInfiHybrids.blazeScytheID+5, 
                    InfiMaterialEnum.Blaze, InfiMaterialEnum.Blaze, "blazeBlazeScythe");
        	manyullynBlazeScythe = new InfiToolScythe(PropsHelperInfiHybrids.blazeScytheID+6, 
                    InfiMaterialEnum.Blaze, InfiMaterialEnum.Manyullyn, "manyullynBlazeScythe");
            uraniumBlazeScythe = new InfiToolScythe(PropsHelperInfiHybrids.blazeScytheID+7, 
                    InfiMaterialEnum.Blaze, InfiMaterialEnum.Uranium, "uraniumBlazeScythe");
        }
    	
        if(PropsHelperInfiHybrids.enableCopperTools)
        {
        	woodCopperScythe = new InfiToolScythe(PropsHelperInfiHybrids.copperScytheID+0, 
                    InfiMaterialEnum.Copper, InfiMaterialEnum.Wood, "woodCopperScythe");
            stoneCopperScythe = new InfiToolScythe(PropsHelperInfiHybrids.copperScytheID+1, 
                    InfiMaterialEnum.Copper, InfiMaterialEnum.Stone, "stoneCopperScythe");
            boneCopperScythe = new InfiToolScythe(PropsHelperInfiHybrids.copperScytheID+2, 
                    InfiMaterialEnum.Copper, InfiMaterialEnum.Bone, "boneCopperScythe");
            netherrackCopperScythe = new InfiToolScythe(PropsHelperInfiHybrids.copperScytheID+3, 
                    InfiMaterialEnum.Copper, InfiMaterialEnum.Netherrack, "netherrackCopperScythe");
            slimeCopperScythe = new InfiToolScythe(PropsHelperInfiHybrids.copperScytheID+4, 
                    InfiMaterialEnum.Copper, InfiMaterialEnum.Slime, "slimeCopperScythe");
            cactusCopperScythe = new InfiToolScythe(PropsHelperInfiHybrids.copperScytheID+5, 
                    InfiMaterialEnum.Copper, InfiMaterialEnum.Cactus, "cactusCopperScythe");
            flintCopperScythe = new InfiToolScythe(PropsHelperInfiHybrids.copperScytheID+6, 
                    InfiMaterialEnum.Copper, InfiMaterialEnum.Flint, "flintCopperScythe");
            copperCopperScythe = new InfiToolScythe(PropsHelperInfiHybrids.copperScytheID+7, 
                    InfiMaterialEnum.Copper, InfiMaterialEnum.Copper, "copperCopperScythe");
        }
        
        if(PropsHelperInfiHybrids.enableBronzeTools)
        {
        	woodBronzeScythe = new InfiToolScythe(PropsHelperInfiHybrids.bronzeScytheID+0, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Wood, "woodBronzeScythe");
            stoneBronzeScythe = new InfiToolScythe(PropsHelperInfiHybrids.bronzeScytheID+1, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Stone, "stoneBronzeScythe");
            boneBronzeScythe = new InfiToolScythe(PropsHelperInfiHybrids.bronzeScytheID+2, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Bone, "boneBronzeScythe");
            netherrackBronzeScythe = new InfiToolScythe(PropsHelperInfiHybrids.bronzeScytheID+3, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Netherrack, "netherrackBronzeScythe");
            slimeBronzeScythe = new InfiToolScythe(PropsHelperInfiHybrids.bronzeScytheID+4, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Slime, "slimeBronzeScythe");
            cactusBronzeScythe = new InfiToolScythe(PropsHelperInfiHybrids.bronzeScytheID+5, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Cactus, "cactusBronzeScythe");
            flintBronzeScythe = new InfiToolScythe(PropsHelperInfiHybrids.bronzeScytheID+6, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Flint, "flintBronzeScythe");
            copperBronzeScythe = new InfiToolScythe(PropsHelperInfiHybrids.bronzeScytheID+7, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Copper, "copperBronzeScythe");
            bronzeBronzeScythe = new InfiToolScythe(PropsHelperInfiHybrids.bronzeScytheID+8, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Bronze, "copperBronzeScythe");
        }
        
        if(PropsHelperInfiHybrids.enableWorkedIronTools)
        {
        	woodWorkedIronScythe = new InfiToolScythe(PropsHelperInfiHybrids.workedIronScytheID+0, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Wood, "woodWorkedIronScythe");
            stoneWorkedIronScythe = new InfiToolScythe(PropsHelperInfiHybrids.workedIronScytheID+1, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Stone, "stoneWorkedIronScythe");
            ironWorkedIronScythe = new InfiToolScythe(PropsHelperInfiHybrids.workedIronScytheID+2,
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Iron, "ironWorkedIronScythe");
            diamondWorkedIronScythe = new InfiToolScythe(PropsHelperInfiHybrids.workedIronScytheID+3, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Diamond, "diamondWorkedIronScythe");
            redstoneWorkedIronScythe = new InfiToolScythe(PropsHelperInfiHybrids.workedIronScytheID+4, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Redstone, "redstoneWorkedIronScythe");
            obsidianWorkedIronScythe = new InfiToolScythe(PropsHelperInfiHybrids.workedIronScytheID+5, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Obsidian, "obsidianWorkedIronScythe");
            boneWorkedIronScythe = new InfiToolScythe(PropsHelperInfiHybrids.workedIronScytheID+6, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Bone, "boneWorkedIronScythe");
            netherrackWorkedIronScythe = new InfiToolScythe(PropsHelperInfiHybrids.workedIronScytheID+7, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Netherrack, "netherrackWorkedIronScythe");
            glowstoneWorkedIronScythe = new InfiToolScythe(PropsHelperInfiHybrids.workedIronScytheID+8, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Glowstone, "glowstoneWorkedIronScythe");
            iceWorkedIronScythe = new InfiToolScythe(PropsHelperInfiHybrids.workedIronScytheID+9, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Ice, "iceWorkedIronScythe");
            slimeWorkedIronScythe = new InfiToolScythe(PropsHelperInfiHybrids.workedIronScytheID+10, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Slime, "slimeWorkedIronScythe");
            cactusWorkedIronScythe = new InfiToolScythe(PropsHelperInfiHybrids.workedIronScytheID+11, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Cactus, "cactusWorkedIronScythe");
            blazeWorkedIronScythe = new InfiToolScythe(PropsHelperInfiHybrids.workedIronScytheID+12, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Blaze, "blazeWorkedIronScythe");
            copperWorkedIronScythe = new InfiToolScythe(PropsHelperInfiHybrids.workedIronScytheID+13, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Copper, "copperWorkedIronScythe");
            bronzeWorkedIronScythe = new InfiToolScythe(PropsHelperInfiHybrids.workedIronScytheID+14, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Bronze, "bronzeWorkedIronScythe");
            workedWorkedIronScythe = new InfiToolScythe(PropsHelperInfiHybrids.workedIronScytheID+15, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.WorkedIron, "workedWorkedIronScythe");
            steelWorkedIronScythe = new InfiToolScythe(PropsHelperInfiHybrids.workedIronScytheID+16, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Steel, "steelWorkedIronScythe");
            uraniumWorkedIronScythe = new InfiToolScythe(PropsHelperInfiHybrids.workedIronScytheID+17, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Uranium, "uraniumWorkedIronScythe");
        }
        
        if(PropsHelperInfiHybrids.enableSteelTools)
        {
        	woodSteelScythe = new InfiToolScythe(PropsHelperInfiHybrids.steelScytheID+0, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Wood, "woodSteelScythe");
            stoneSteelScythe = new InfiToolScythe(PropsHelperInfiHybrids.steelScytheID+1, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Stone, "stoneSteelScythe");
            ironSteelScythe = new InfiToolScythe(PropsHelperInfiHybrids.steelScytheID+2, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Iron, "ironSteelScythe");
            diamondSteelScythe = new InfiToolScythe(PropsHelperInfiHybrids.steelScytheID+3, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Diamond, "diamondSteelScythe");
            redstoneSteelScythe = new InfiToolScythe(PropsHelperInfiHybrids.steelScytheID+4, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Redstone, "redstoneSteelScythe");
            obsidianSteelScythe = new InfiToolScythe(PropsHelperInfiHybrids.steelScytheID+5, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Obsidian, "obsidianSteelScythe");
            boneSteelScythe = new InfiToolScythe(PropsHelperInfiHybrids.steelScytheID+6, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Bone, "boneSteelScythe");
            netherrackSteelScythe = new InfiToolScythe(PropsHelperInfiHybrids.steelScytheID+7, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Netherrack, "netherrackSteelScythe");
            glowstoneSteelScythe = new InfiToolScythe(PropsHelperInfiHybrids.steelScytheID+8, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Glowstone, "glowstoneSteelScythe");
            iceSteelScythe = new InfiToolScythe(PropsHelperInfiHybrids.steelScytheID+9, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Ice, "iceSteelScythe");
            slimeSteelScythe = new InfiToolScythe(PropsHelperInfiHybrids.steelScytheID+10, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Slime, "slimeSteelScythe");
            cactusSteelScythe = new InfiToolScythe(PropsHelperInfiHybrids.steelScytheID+11, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Cactus, "cactusSteelScythe");
            blazeSteelScythe = new InfiToolScythe(PropsHelperInfiHybrids.steelScytheID+12, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Blaze, "blazeSteelScythe");
            copperSteelScythe = new InfiToolScythe(PropsHelperInfiHybrids.steelScytheID+13, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Copper, "copperSteelScythe");
            bronzeSteelScythe = new InfiToolScythe(PropsHelperInfiHybrids.steelScytheID+14, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Bronze, "bronzeSteelScythe");
            workedSteelScythe = new InfiToolScythe(PropsHelperInfiHybrids.steelScytheID+15, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.WorkedIron, "workedSteelScythe");
            steelSteelScythe = new InfiToolScythe(PropsHelperInfiHybrids.steelScytheID+16, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Steel, "steelSteelScythe");
            cobaltSteelScythe = new InfiToolScythe(PropsHelperInfiHybrids.steelScytheID+17, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Cobalt, "cobaltSteelScythe");
            arditeSteelScythe = new InfiToolScythe(PropsHelperInfiHybrids.steelScytheID+18, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Ardite, "arditeSteelScythe");
            uraniumSteelScythe = new InfiToolScythe(PropsHelperInfiHybrids.steelScytheID+19, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Uranium, "uraniumSteelScythe");
        }
        
        if(PropsHelperInfiHybrids.enableCobaltTools)
        {
        	woodCobaltScythe = new InfiToolScythe(PropsHelperInfiHybrids.cobaltScytheID+0, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Wood, "woodCobaltScythe");
            stoneCobaltScythe = new InfiToolScythe(PropsHelperInfiHybrids.cobaltScytheID+1, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Stone, "stoneCobaltScythe");
            ironCobaltScythe = new InfiToolScythe(PropsHelperInfiHybrids.cobaltScytheID+2, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Iron, "ironCobaltScythe");
            diamondCobaltScythe = new InfiToolScythe(PropsHelperInfiHybrids.cobaltScytheID+3,
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Diamond, "diamondCobaltScythe");
            redstoneCobaltScythe = new InfiToolScythe(PropsHelperInfiHybrids.cobaltScytheID+4, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Redstone, "redstoneCobaltScythe");
            obsidianCobaltScythe = new InfiToolScythe(PropsHelperInfiHybrids.cobaltScytheID+5, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Obsidian, "obsidianCobaltScythe");
            boneCobaltScythe = new InfiToolScythe(PropsHelperInfiHybrids.cobaltScytheID+6, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Bone, "boneCobaltScythe");
            slimeCobaltScythe = new InfiToolScythe(PropsHelperInfiHybrids.cobaltScytheID+7, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Slime, "slimeCobaltScythe");
            cactusCobaltScythe = new InfiToolScythe(PropsHelperInfiHybrids.cobaltScytheID+8, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Cactus, "cactusCobaltScythe");
            blazeCobaltScythe = new InfiToolScythe(PropsHelperInfiHybrids.cobaltScytheID+9, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Blaze, "blazeCobaltScythe");
            copperCobaltScythe = new InfiToolScythe(PropsHelperInfiHybrids.cobaltScytheID+10, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Copper, "copperCobaltScythe");
            bronzeCobaltScythe = new InfiToolScythe(PropsHelperInfiHybrids.cobaltScytheID+11, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Bronze, "bronzeCobaltScythe");
            workedCobaltScythe = new InfiToolScythe(PropsHelperInfiHybrids.cobaltScytheID+12, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.WorkedIron, "workedCobaltScythe");
            steelCobaltScythe = new InfiToolScythe(PropsHelperInfiHybrids.cobaltScytheID+13, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Steel, "steelCobaltScythe");
            cobaltCobaltScythe = new InfiToolScythe(PropsHelperInfiHybrids.cobaltScytheID+14, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Cobalt, "cobaltCobaltScythe");
            arditeCobaltScythe = new InfiToolScythe(PropsHelperInfiHybrids.cobaltScytheID+15, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Ardite, "arditeCobaltScythe");
            manyullynCobaltScythe = new InfiToolScythe(PropsHelperInfiHybrids.cobaltScytheID+16, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Manyullyn, "arditeCobaltScythe");
            uraniumCobaltScythe = new InfiToolScythe(PropsHelperInfiHybrids.cobaltScytheID+17, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Uranium, "uraniumCobaltScythe");
        }
        
        if(PropsHelperInfiHybrids.enableArditeTools)
        {
        	woodArditeScythe = new InfiToolScythe(PropsHelperInfiHybrids.arditeScytheID+0, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Wood, "woodArditeScythe");
            stoneArditeScythe = new InfiToolScythe(PropsHelperInfiHybrids.arditeScytheID+1, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Stone, "stoneArditeScythe");
            ironArditeScythe = new InfiToolScythe(PropsHelperInfiHybrids.arditeScytheID+2, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Iron, "ironArditeScythe");
            diamondArditeScythe = new InfiToolScythe(PropsHelperInfiHybrids.arditeScytheID+3,
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Diamond, "diamondArditeScythe");
            redstoneArditeScythe = new InfiToolScythe(PropsHelperInfiHybrids.arditeScytheID+4, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Redstone, "redstoneArditeScythe");
            obsidianArditeScythe = new InfiToolScythe(PropsHelperInfiHybrids.arditeScytheID+5, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Obsidian, "obsidianArditeScythe");
            boneArditeScythe = new InfiToolScythe(PropsHelperInfiHybrids.arditeScytheID+6,
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Bone, "boneArditeScythe");
            slimeArditeScythe = new InfiToolScythe(PropsHelperInfiHybrids.arditeScytheID+7, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Slime, "slimeArditeScythe");
            cactusArditeScythe = new InfiToolScythe(PropsHelperInfiHybrids.arditeScytheID+8, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Cactus, "cactusArditeScythe");
            blazeArditeScythe = new InfiToolScythe(PropsHelperInfiHybrids.arditeScytheID+9, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Blaze, "blazeArditeScythe");
            copperArditeScythe = new InfiToolScythe(PropsHelperInfiHybrids.arditeScytheID+10, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Copper, "copperArditeScythe");
            bronzeArditeScythe = new InfiToolScythe(PropsHelperInfiHybrids.arditeScytheID+11, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Bronze, "bronzeArditeScythe");
            workedArditeScythe = new InfiToolScythe(PropsHelperInfiHybrids.arditeScytheID+12, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.WorkedIron, "workedArditeScythe");
            steelArditeScythe = new InfiToolScythe(PropsHelperInfiHybrids.arditeScytheID+13, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Steel, "steelArditeScythe");
            cobaltArditeScythe = new InfiToolScythe(PropsHelperInfiHybrids.arditeScytheID+14, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Cobalt, "cobaltArditeScythe");
            arditeArditeScythe = new InfiToolScythe(PropsHelperInfiHybrids.arditeScytheID+15, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Ardite, "arditeArditeScythe");
            manyullynArditeScythe = new InfiToolScythe(PropsHelperInfiHybrids.arditeScytheID+16, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Manyullyn, "arditeArditeScythe");
            uraniumArditeScythe = new InfiToolScythe(PropsHelperInfiHybrids.arditeScytheID+17, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Uranium, "uraniumArditeScythe");
        }
        
        if(PropsHelperInfiHybrids.enableManyullynTools)
        {
        	woodManyullynScythe = new InfiToolScythe(PropsHelperInfiHybrids.manyullynScytheID+0, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Wood, "woodManyullynScythe");
            stoneManyullynScythe = new InfiToolScythe(PropsHelperInfiHybrids.manyullynScytheID+1, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Stone, "stoneManyullynScythe");
            ironManyullynScythe = new InfiToolScythe(PropsHelperInfiHybrids.manyullynScytheID+2, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Iron, "ironManyullynScythe");
            diamondManyullynScythe = new InfiToolScythe(PropsHelperInfiHybrids.manyullynScytheID+3,
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Diamond, "diamondManyullynScythe");
            redstoneManyullynScythe = new InfiToolScythe(PropsHelperInfiHybrids.manyullynScytheID+4, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Redstone, "redstoneManyullynScythe");
            obsidianManyullynScythe = new InfiToolScythe(PropsHelperInfiHybrids.manyullynScytheID+5, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Obsidian, "obsidianManyullynScythe");
            boneManyullynScythe = new InfiToolScythe(PropsHelperInfiHybrids.manyullynScytheID+6, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Bone, "boneManyullynScythe");
            slimeManyullynScythe = new InfiToolScythe(PropsHelperInfiHybrids.manyullynScytheID+7, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Slime, "slimeManyullynScythe");
            cactusManyullynScythe = new InfiToolScythe(PropsHelperInfiHybrids.manyullynScytheID+8, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Cactus, "cactusManyullynScythe");
            blazeManyullynScythe = new InfiToolScythe(PropsHelperInfiHybrids.manyullynScytheID+9, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Blaze, "blazeManyullynScythe");
            copperManyullynScythe = new InfiToolScythe(PropsHelperInfiHybrids.manyullynScytheID+10, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Copper, "copperManyullynScythe");
            bronzeManyullynScythe = new InfiToolScythe(PropsHelperInfiHybrids.manyullynScytheID+11, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Bronze, "bronzeManyullynScythe");
            workedManyullynScythe = new InfiToolScythe(PropsHelperInfiHybrids.manyullynScytheID+12, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.WorkedIron, "workedManyullynScythe");
            steelManyullynScythe = new InfiToolScythe(PropsHelperInfiHybrids.manyullynScytheID+13, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Steel, "steelManyullynScythe");
            cobaltManyullynScythe = new InfiToolScythe(PropsHelperInfiHybrids.manyullynScytheID+14, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Cobalt, "cobaltManyullynScythe");
            arditeManyullynScythe = new InfiToolScythe(PropsHelperInfiHybrids.manyullynScytheID+15, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Ardite, "arditeManyullynScythe");
            manyullynManyullynScythe = new InfiToolScythe(PropsHelperInfiHybrids.manyullynScytheID+16, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Manyullyn, "arditeManyullynScythe");
            uraniumManyullynScythe = new InfiToolScythe(PropsHelperInfiHybrids.manyullynScytheID+17,
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Uranium, "uraniumManyullynScythe");
        }
        
        if(PropsHelperInfiHybrids.enableUraniumTools)
        {
            diamondUraniumScythe = new InfiToolScythe(PropsHelperInfiHybrids.uraniumScytheID+0, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Diamond, "diamondUraniumScythe");
            redstoneUraniumScythe = new InfiToolScythe(PropsHelperInfiHybrids.uraniumScytheID+1, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Redstone, "redstoneUraniumScythe");
            boneUraniumScythe = new InfiToolScythe(PropsHelperInfiHybrids.uraniumScytheID+2, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Bone, "boneUraniumScythe");
            netherrackUraniumScythe = new InfiToolScythe(PropsHelperInfiHybrids.uraniumScytheID+3, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Netherrack, "netherrackUraniumScythe");
            glowstoneUraniumScythe = new InfiToolScythe(PropsHelperInfiHybrids.uraniumScytheID+4, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Glowstone, "glowstoneUraniumScythe");
            lavaUraniumScythe = new InfiToolScythe(PropsHelperInfiHybrids.uraniumScytheID+5, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Lava, "lavaUraniumScythe");
            blazeUraniumScythe = new InfiToolScythe(PropsHelperInfiHybrids.uraniumScytheID+6, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Blaze, "blazeUraniumScythe");
            cobaltUraniumScythe = new InfiToolScythe(PropsHelperInfiHybrids.uraniumScytheID+7, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Cobalt, "cobaltUraniumScythe");
            arditeUraniumScythe = new InfiToolScythe(PropsHelperInfiHybrids.uraniumScytheID+8, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Ardite, "arditeUraniumScythe");
            uraniumUraniumScythe = new InfiToolScythe(PropsHelperInfiHybrids.uraniumScytheID+9, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Uranium, "uraniumUraniumScythe");
        }
    }
    
    private static void addNames()
    {
    	ModLoader.addName(woodWoodScythe, "Wooden Scythe");
    	ModLoader.addName(stoneStoneScythe, "Heavy Scythe");
    	ModLoader.addName(ironIronScythe, "Ironic Scythe");
    	ModLoader.addName(diamondDiamondScythe, "Diamondium Scythe");
    	ModLoader.addName(redstoneRedstoneScythe, "Redredred Scythe");
    	ModLoader.addName(obsidianObsidianScythe, "Ebony Scythe");
    	ModLoader.addName(sandstoneSandstoneScythe, "Fragile Scythe");
    	ModLoader.addName(boneBoneScythe, "Necrotic Scythe");
    	ModLoader.addName(paperPaperScythe, "Soft Scythe");
    	ModLoader.addName(mossyMossyScythe, "Living Scythe");
    	ModLoader.addName(netherrackNetherrackScythe, "Blood Scythe");
    	ModLoader.addName(glowstoneGlowstoneScythe, "Bright Scythe");
    	ModLoader.addName(iceIceScythe, "Freezing Scythe");
    	ModLoader.addName(lavaLavaScythe, "Burning Scythe");
    	ModLoader.addName(slimeSlimeScythe, "Toy Scythe");
    	ModLoader.addName(cactusCactusScythe, "Thorned Scythe");
    	ModLoader.addName(flintFlintScythe, "Rough-hewn Scythe");
    	ModLoader.addName(blazeBlazeScythe, "Netherite Scythe");
        ModLoader.addName(copperCopperScythe, "Orange-Tang Scythe");
        ModLoader.addName(bronzeBronzeScythe, "Polished Scythe");
        ModLoader.addName(workedWorkedIronScythe, "Reworked Iron Scythe");
        ModLoader.addName(steelSteelScythe, "Forge-Wrought Scythe");
        ModLoader.addName(cobaltCobaltScythe, "Beautiful Scythe");
        ModLoader.addName(arditeArditeScythe, "Rustic StoneDigger");
        ModLoader.addName(manyullynManyullynScythe, "False-Prophetic Scythe");
        ModLoader.addName(uraniumUraniumScythe, "Cancerous Scythe");
    }
    
    public static void registerInfiToolsRecipes()
    {
    	if(PropsHelperInfiHybrids.enableWoodTools)
        {
            ModLoader.addRecipe(new ItemStack(woodWoodScythe), new Object[] 
                    { recipe, '#', Block.planks, '|', Item.stick });
            ModLoader.addRecipe(new ItemStack(sandstoneWoodScythe), new Object[] 
                    { recipe, '#', Block.planks, '|', mod_InfiBase.sandstoneRod });
            ModLoader.addRecipe(new ItemStack(boneWoodScythe), new Object[] 
                    { recipe, '#', Block.planks, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneWoodScythe), new Object[] 
                    { recipe, '#', Block.planks, '|', mod_InfiBase.boneRod });
            ModLoader.addRecipe(new ItemStack(paperWoodScythe), new Object[] 
                    { recipe, '#', Block.planks, '|', mod_InfiBase.paperRod });
            ModLoader.addRecipe(new ItemStack(iceWoodScythe), new Object[] 
                    { recipe, '#', Block.planks, '|', mod_InfiBase.iceRod });
            ModLoader.addRecipe(new ItemStack(slimeWoodScythe), new Object[] 
                    { recipe, '#', Block.planks, '|', mod_InfiBase.slimeRod });
            ModLoader.addRecipe(new ItemStack(cactusWoodScythe), new Object[] 
                    { recipe, '#', Block.planks, '|', mod_InfiBase.cactusRod });
        }
    	
        if(PropsHelperInfiHybrids.enableStoneTools)
        {
        	ModLoader.addRecipe(new ItemStack(woodStoneScythe), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', Item.stick });
        	ModLoader.addRecipe(new ItemStack(stoneStoneScythe), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', mod_InfiBase.stoneRod });
            ModLoader.addRecipe(new ItemStack(sandstoneStoneScythe), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', mod_InfiBase.sandstoneRod });
            ModLoader.addRecipe(new ItemStack(boneStoneScythe), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneStoneScythe), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', mod_InfiBase.boneRod });
            ModLoader.addRecipe(new ItemStack(netherrackStoneScythe), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', mod_InfiBase.netherrackRod });
            ModLoader.addRecipe(new ItemStack(iceStoneScythe), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', mod_InfiBase.iceRod });
            ModLoader.addRecipe(new ItemStack(slimeStoneScythe), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', mod_InfiBase.slimeRod });
            ModLoader.addRecipe(new ItemStack(cactusStoneScythe), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', mod_InfiBase.cactusRod });
            ModLoader.addRecipe(new ItemStack(flintStoneScythe), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', mod_InfiBase.flintRod });
            
            ModLoader.addRecipe(new ItemStack(woodStoneScythe), new Object[] 
                    { recipe, '#', Block.stone, '|', Item.stick });
        	ModLoader.addRecipe(new ItemStack(stoneStoneScythe), new Object[] 
                    { recipe, '#', Block.stone, '|', mod_InfiBase.stoneRod });
            ModLoader.addRecipe(new ItemStack(sandstoneStoneScythe), new Object[] 
                    { recipe, '#', Block.stone, '|', mod_InfiBase.sandstoneRod });
            ModLoader.addRecipe(new ItemStack(boneStoneScythe), new Object[] 
                    { recipe, '#', Block.stone, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneStoneScythe), new Object[] 
                    { recipe, '#', Block.stone, '|', mod_InfiBase.boneRod });
            ModLoader.addRecipe(new ItemStack(netherrackStoneScythe), new Object[] 
                    { recipe, '#', Block.stone, '|', mod_InfiBase.netherrackRod });
            ModLoader.addRecipe(new ItemStack(iceStoneScythe), new Object[] 
                    { recipe, '#', Block.stone, '|', mod_InfiBase.iceRod });
            ModLoader.addRecipe(new ItemStack(slimeStoneScythe), new Object[] 
                    { recipe, '#', Block.stone, '|', mod_InfiBase.slimeRod });
            ModLoader.addRecipe(new ItemStack(cactusStoneScythe), new Object[] 
                    { recipe, '#', Block.stone, '|', mod_InfiBase.cactusRod });
            ModLoader.addRecipe(new ItemStack(flintStoneScythe), new Object[] 
                    { recipe, '#', Block.stone, '|', mod_InfiBase.flintRod });
        }
        
        if(PropsHelperInfiHybrids.enableIronTools)
        {
        	ModLoader.addRecipe(new ItemStack(woodIronScythe), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', Item.stick });
        	ModLoader.addRecipe(new ItemStack(stoneIronScythe), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', mod_InfiBase.stoneRod });
            ModLoader.addRecipe(new ItemStack(ironIronScythe), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', mod_InfiBase.ironRod });
            ModLoader.addRecipe(new ItemStack(boneIronScythe), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneIronScythe), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', mod_InfiBase.boneRod });
            ModLoader.addRecipe(new ItemStack(netherrackIronScythe), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', mod_InfiBase.netherrackRod });
            ModLoader.addRecipe(new ItemStack(glowstoneIronScythe), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', mod_InfiBase.glowstoneRod });
            ModLoader.addRecipe(new ItemStack(cactusIronScythe), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', mod_InfiBase.cactusRod });
            ModLoader.addRecipe(new ItemStack(copperIronScythe), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', mod_InfiBase.copperRod });
            ModLoader.addRecipe(new ItemStack(bronzeIronScythe), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', mod_InfiBase.bronzeRod });
        }
        
        if(PropsHelperInfiHybrids.enableDiamondTools)
        {
        	ModLoader.addRecipe(new ItemStack(woodDiamondScythe), new Object[] 
                    { recipe, '#', Item.diamond, '|', Item.stick });
        	ModLoader.addRecipe(new ItemStack(stoneDiamondScythe), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.stoneRod });
            ModLoader.addRecipe(new ItemStack(ironDiamondScythe), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.ironRod });
            ModLoader.addRecipe(new ItemStack(diamondDiamondScythe), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.diamondRod });
            ModLoader.addRecipe(new ItemStack(redstoneDiamondScythe), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.redstoneRod });
            ModLoader.addRecipe(new ItemStack(obsidianDiamondScythe), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.obsidianRod });
            ModLoader.addRecipe(new ItemStack(boneDiamondScythe), new Object[] 
                    { recipe, '#', Item.diamond, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneDiamondScythe), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.boneRod });
            ModLoader.addRecipe(new ItemStack(mossyDiamondScythe), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.mossyRod });
            ModLoader.addRecipe(new ItemStack(netherrackDiamondScythe), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.netherrackRod });
            ModLoader.addRecipe(new ItemStack(glowstoneDiamondScythe), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.glowstoneRod });
            ModLoader.addRecipe(new ItemStack(lavaDiamondScythe), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.lavaRod });
            ModLoader.addRecipe(new ItemStack(cactusDiamondScythe), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.cactusRod });
            ModLoader.addRecipe(new ItemStack(flintDiamondScythe), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.flintRod });
            ModLoader.addRecipe(new ItemStack(blazeDiamondScythe), new Object[] 
                    { recipe, '#', Item.diamond, '|', Item.blazeRod });
            ModLoader.addRecipe(new ItemStack(copperDiamondScythe), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.copperRod });
            ModLoader.addRecipe(new ItemStack(bronzeDiamondScythe), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.bronzeRod });
            ModLoader.addRecipe(new ItemStack(workedDiamondScythe), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.workedIronRod });
            ModLoader.addRecipe(new ItemStack(steelDiamondScythe), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.steelRod });
            ModLoader.addRecipe(new ItemStack(cobaltDiamondScythe), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.cobaltRod });
            ModLoader.addRecipe(new ItemStack(arditeDiamondScythe), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.arditeRod });
            ModLoader.addRecipe(new ItemStack(manyullynDiamondScythe), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.manyullynRod });
            ModLoader.addRecipe(new ItemStack(uraniumDiamondScythe), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.uraniumRod });
        }
        
        if(PropsHelperInfiHybrids.enableRedstoneTools)
        {
        	ModLoader.addRecipe(new ItemStack(woodRedstoneScythe), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', Item.stick });
        	ModLoader.addRecipe(new ItemStack(stoneRedstoneScythe), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.stoneRod });
            ModLoader.addRecipe(new ItemStack(ironRedstoneScythe), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.ironRod });
            ModLoader.addRecipe(new ItemStack(redstoneRedstoneScythe), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.redstoneRod });
            ModLoader.addRecipe(new ItemStack(obsidianRedstoneScythe), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.obsidianRod });
            ModLoader.addRecipe(new ItemStack(sandstoneRedstoneScythe), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.sandstoneRod });
            ModLoader.addRecipe(new ItemStack(boneRedstoneScythe), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneRedstoneScythe), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.boneRod });
            ModLoader.addRecipe(new ItemStack(paperRedstoneScythe), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.paperRod });
            ModLoader.addRecipe(new ItemStack(mossyRedstoneScythe), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.mossyRod });
            ModLoader.addRecipe(new ItemStack(netherrackRedstoneScythe), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.netherrackRod });
            ModLoader.addRecipe(new ItemStack(glowstoneRedstoneScythe), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.glowstoneRod });
            ModLoader.addRecipe(new ItemStack(iceRedstoneScythe), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.iceRod });
            ModLoader.addRecipe(new ItemStack(lavaRedstoneScythe), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.lavaRod });
            ModLoader.addRecipe(new ItemStack(slimeRedstoneScythe), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.slimeRod });
            ModLoader.addRecipe(new ItemStack(cactusRedstoneScythe), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.cactusRod });
            ModLoader.addRecipe(new ItemStack(flintRedstoneScythe), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.flintRod });
            ModLoader.addRecipe(new ItemStack(copperRedstoneScythe), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.copperRod });
            ModLoader.addRecipe(new ItemStack(bronzeRedstoneScythe), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.bronzeRod });
            ModLoader.addRecipe(new ItemStack(workedRedstoneScythe), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.workedIronRod });
            ModLoader.addRecipe(new ItemStack(uraniumRedstoneScythe), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.uraniumRod });
        }
        
        if(PropsHelperInfiHybrids.enableObsidianTools)
        {
        	ModLoader.addRecipe(new ItemStack(woodObsidianScythe), new Object[] 
                    { recipe, '#', Block.obsidian, '|', Item.stick });
        	ModLoader.addRecipe(new ItemStack(stoneObsidianScythe), new Object[] 
                    { recipe, '#', Block.obsidian, '|', mod_InfiBase.stoneRod });
            ModLoader.addRecipe(new ItemStack(redstoneObsidianScythe), new Object[] 
                    { recipe, '#', Block.obsidian, '|', mod_InfiBase.redstoneRod });
            ModLoader.addRecipe(new ItemStack(obsidianObsidianScythe), new Object[] 
                    { recipe, '#', Block.obsidian, '|', mod_InfiBase.obsidianRod });
            ModLoader.addRecipe(new ItemStack(boneObsidianScythe), new Object[] 
                    { recipe, '#', Block.obsidian, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneObsidianScythe), new Object[] 
                    { recipe, '#', Block.obsidian, '|', mod_InfiBase.boneRod });
            ModLoader.addRecipe(new ItemStack(netherrackObsidianScythe), new Object[] 
                    { recipe, '#', Block.obsidian, '|', mod_InfiBase.netherrackRod });
            ModLoader.addRecipe(new ItemStack(glowstoneObsidianScythe), new Object[] 
                    { recipe, '#', Block.obsidian, '|', mod_InfiBase.glowstoneRod });
            ModLoader.addRecipe(new ItemStack(iceObsidianScythe), new Object[] 
                    { recipe, '#', Block.obsidian, '|', mod_InfiBase.iceRod });
            ModLoader.addRecipe(new ItemStack(lavaObsidianScythe), new Object[] 
                    { recipe, '#', Block.obsidian, '|', mod_InfiBase.lavaRod });
            ModLoader.addRecipe(new ItemStack(cactusObsidianScythe), new Object[] 
                    { recipe, '#', Block.obsidian, '|', mod_InfiBase.cactusRod });
        }
        
        if(PropsHelperInfiHybrids.enableSandstoneTools)
        {
            ModLoader.addRecipe(new ItemStack(woodSandstoneScythe), new Object[] 
                    { recipe, '#', Block.sandStone, '|', Item.stick });
            ModLoader.addRecipe(new ItemStack(sandstoneSandstoneScythe), new Object[] 
                    { recipe, '#', Block.sandStone, '|', mod_InfiBase.sandstoneRod });
            ModLoader.addRecipe(new ItemStack(boneSandstoneScythe), new Object[] 
                    { recipe, '#', Block.sandStone, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneSandstoneScythe), new Object[] 
                    { recipe, '#', Block.sandStone, '|', mod_InfiBase.boneRod });      
            ModLoader.addRecipe(new ItemStack(netherrackSandstoneScythe), new Object[] 
                    { recipe, '#', Block.sandStone, '|', mod_InfiBase.netherrackRod });
            ModLoader.addRecipe(new ItemStack(iceSandstoneScythe), new Object[] 
                    { recipe, '#', Block.sandStone, '|', mod_InfiBase.iceRod });
            ModLoader.addRecipe(new ItemStack(slimeSandstoneScythe), new Object[] 
                    { recipe, '#', Block.sandStone, '|', mod_InfiBase.slimeRod });
            ModLoader.addRecipe(new ItemStack(cactusSandstoneScythe), new Object[] 
                    { recipe, '#', Block.sandStone, '|', mod_InfiBase.cactusRod });
            ModLoader.addRecipe(new ItemStack(flintSandstoneScythe), new Object[] 
                    { recipe, '#', Block.sandStone, '|', mod_InfiBase.flintRod });
        }
        
        if(PropsHelperInfiHybrids.enableBoneTools)
        {
            ModLoader.addRecipe(new ItemStack(woodBoneScythe), new Object[] 
                    { recipe, '#', Item.bone, '|', Item.stick });
            ModLoader.addRecipe(new ItemStack(stoneBoneScythe), new Object[] 
                    { recipe, '#', Item.bone, '|', mod_InfiBase.stoneRod });
            ModLoader.addRecipe(new ItemStack(sandstoneBoneScythe), new Object[] 
                    { recipe, '#', Item.bone, '|', mod_InfiBase.sandstoneRod });
            ModLoader.addRecipe(new ItemStack(boneBoneScythe), new Object[] 
                    { recipe, '#', Item.bone, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneBoneScythe), new Object[] 
                    { recipe, '#', Item.bone, '|', mod_InfiBase.boneRod });
            ModLoader.addRecipe(new ItemStack(paperBoneScythe), new Object[] 
                    { recipe, '#', Item.bone, '|', mod_InfiBase.paperRod });
            ModLoader.addRecipe(new ItemStack(netherrackBoneScythe), new Object[] 
                    { recipe, '#', Item.bone, '|', mod_InfiBase.netherrackRod });
            ModLoader.addRecipe(new ItemStack(iceBoneScythe), new Object[] 
                    { recipe, '#', Item.bone, '|', mod_InfiBase.iceRod });
            ModLoader.addRecipe(new ItemStack(cactusBoneScythe), new Object[] 
                    { recipe, '#', Item.bone, '|', mod_InfiBase.cactusRod });
            ModLoader.addRecipe(new ItemStack(flintBoneScythe), new Object[] 
                    { recipe, '#', Item.bone, '|', mod_InfiBase.flintRod });
        }
        
        if(PropsHelperInfiHybrids.enablePaperTools)
        {
            ModLoader.addRecipe(new ItemStack(woodPaperScythe), new Object[] 
                    { recipe, '#', mod_InfiBase.paperStack, '|', Item.stick });
            ModLoader.addRecipe(new ItemStack(bonePaperScythe), new Object[] 
                    { recipe, '#', mod_InfiBase.paperStack, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(bonePaperScythe), new Object[] 
                    { recipe, '#', mod_InfiBase.paperStack, '|', mod_InfiBase.boneRod });
            ModLoader.addRecipe(new ItemStack(paperPaperScythe), new Object[] 
                    { recipe, '#', mod_InfiBase.paperStack, '|', mod_InfiBase.paperRod });
            ModLoader.addRecipe(new ItemStack(slimePaperScythe), new Object[] 
                    { recipe, '#', mod_InfiBase.paperStack, '|', mod_InfiBase.slimeRod });
            ModLoader.addRecipe(new ItemStack(cactusPaperScythe), new Object[] 
                    { recipe, '#', mod_InfiBase.paperStack, '|', mod_InfiBase.cactusRod });
        }
        
        if(PropsHelperInfiHybrids.enableMossyTools)
        {
        	ModLoader.addRecipe(new ItemStack(woodMossyScythe), new Object[] 
                    { recipe, '#', mod_InfiBase.mossyStone, '|', Item.stick });
        	ModLoader.addRecipe(new ItemStack(stoneMossyScythe), new Object[] 
                    { recipe, '#', mod_InfiBase.mossyStone, '|', mod_InfiBase.stoneRod });
            ModLoader.addRecipe(new ItemStack(diamondMossyScythe), new Object[] 
                    { recipe, '#', mod_InfiBase.mossyStone, '|', mod_InfiBase.diamondRod });
            ModLoader.addRecipe(new ItemStack(redstoneMossyScythe), new Object[] 
                    { recipe, '#', mod_InfiBase.mossyStone, '|', mod_InfiBase.redstoneRod });
            ModLoader.addRecipe(new ItemStack(boneMossyScythe), new Object[] 
                    { recipe, '#', mod_InfiBase.mossyStone, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneMossyScythe), new Object[] 
                    { recipe, '#', mod_InfiBase.mossyStone, '|', mod_InfiBase.boneRod });
            ModLoader.addRecipe(new ItemStack(mossyMossyScythe), new Object[] 
                    { recipe, '#', mod_InfiBase.mossyStone, '|', mod_InfiBase.mossyRod });
            ModLoader.addRecipe(new ItemStack(netherrackMossyScythe), new Object[] 
                    { recipe, '#', mod_InfiBase.mossyStone, '|', mod_InfiBase.netherrackRod });
            ModLoader.addRecipe(new ItemStack(glowstoneMossyScythe), new Object[] 
                    { recipe, '#', mod_InfiBase.mossyStone, '|', mod_InfiBase.glowstoneRod });
            ModLoader.addRecipe(new ItemStack(cactusMossyScythe), new Object[] 
                    { recipe, '#', mod_InfiBase.mossyStone, '|', mod_InfiBase.cactusRod });
            ModLoader.addRecipe(new ItemStack(blazeMossyScythe), new Object[] 
                    { recipe, '#', mod_InfiBase.mossyStone, '|', Item.blazeRod });
            ModLoader.addRecipe(new ItemStack(manyullynMossyScythe), new Object[] 
                    { recipe, '#', mod_InfiBase.mossyStone, '|', mod_InfiBase.manyullynRod });
            ModLoader.addRecipe(new ItemStack(uraniumMossyScythe), new Object[] 
                    { recipe, '#', mod_InfiBase.mossyStone, '|', mod_InfiBase.uraniumRod });
        }
        
        if(PropsHelperInfiHybrids.enableNetherrackTools)
        {
        	ModLoader.addRecipe(new ItemStack(woodNetherrackScythe), new Object[] 
                    { recipe, '#', Block.netherrack, '|', Item.stick });
        	ModLoader.addRecipe(new ItemStack(stoneNetherrackScythe), new Object[] 
                    { recipe, '#', Block.netherrack, '|', mod_InfiBase.stoneRod });
            ModLoader.addRecipe(new ItemStack(sandstoneNetherrackScythe), new Object[] 
                    { recipe, '#', Block.netherrack, '|', mod_InfiBase.sandstoneRod });
            ModLoader.addRecipe(new ItemStack(boneNetherrackScythe), new Object[] 
                    { recipe, '#', Block.netherrack, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneNetherrackScythe), new Object[] 
                    { recipe, '#', Block.netherrack, '|', mod_InfiBase.boneRod });
            ModLoader.addRecipe(new ItemStack(paperNetherrackScythe), new Object[] 
                    { recipe, '#', Block.netherrack, '|', mod_InfiBase.paperRod });
            ModLoader.addRecipe(new ItemStack(mossyNetherrackScythe), new Object[] 
                    { recipe, '#', Block.netherrack, '|', mod_InfiBase.mossyRod });
            ModLoader.addRecipe(new ItemStack(netherrackNetherrackScythe), new Object[] 
                    { recipe, '#', Block.netherrack, '|', mod_InfiBase.netherrackRod });
            ModLoader.addRecipe(new ItemStack(iceNetherrackScythe), new Object[] 
                    { recipe, '#', Block.netherrack, '|', mod_InfiBase.iceRod });
            ModLoader.addRecipe(new ItemStack(slimeNetherrackScythe), new Object[] 
                    { recipe, '#', Block.netherrack, '|', mod_InfiBase.slimeRod });
            ModLoader.addRecipe(new ItemStack(cactusNetherrackScythe), new Object[] 
                    { recipe, '#', Block.netherrack, '|', mod_InfiBase.cactusRod });
            ModLoader.addRecipe(new ItemStack(flintNetherrackScythe), new Object[] 
                    { recipe, '#', Block.netherrack, '|', mod_InfiBase.flintRod });
            ModLoader.addRecipe(new ItemStack(copperNetherrackScythe), new Object[] 
                    { recipe, '#', Block.netherrack, '|', mod_InfiBase.copperRod });
            ModLoader.addRecipe(new ItemStack(bronzeNetherrackScythe), new Object[] 
                    { recipe, '#', Block.netherrack, '|', mod_InfiBase.bronzeRod });
        }
        
        if(PropsHelperInfiHybrids.enableGlowstoneTools)
        {
        	ModLoader.addRecipe(new ItemStack(woodGlowstoneScythe), new Object[] 
                    { recipe, '#', mod_InfiBase.glowstoneCrystal, '|', Item.stick });
        	ModLoader.addRecipe(new ItemStack(redstoneGlowstoneScythe), new Object[] 
                    { recipe, '#', mod_InfiBase.glowstoneCrystal, '|', mod_InfiBase.glowstoneRod });
        	ModLoader.addRecipe(new ItemStack(obsidianGlowstoneScythe), new Object[] 
                    { recipe, '#', mod_InfiBase.glowstoneCrystal, '|', mod_InfiBase.obsidianRod });
            ModLoader.addRecipe(new ItemStack(boneGlowstoneScythe), new Object[] 
                    { recipe, '#', mod_InfiBase.glowstoneCrystal, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneGlowstoneScythe), new Object[] 
                    { recipe, '#', mod_InfiBase.glowstoneCrystal, '|', mod_InfiBase.boneRod });
            ModLoader.addRecipe(new ItemStack(netherrackGlowstoneScythe), new Object[] 
                    { recipe, '#', mod_InfiBase.glowstoneCrystal, '|', mod_InfiBase.netherrackRod });
            ModLoader.addRecipe(new ItemStack(iceGlowstoneScythe), new Object[] 
                    { recipe, '#', mod_InfiBase.glowstoneCrystal, '|', mod_InfiBase.iceRod });
            ModLoader.addRecipe(new ItemStack(slimeGlowstoneScythe), new Object[] 
                    { recipe, '#', mod_InfiBase.glowstoneCrystal, '|', mod_InfiBase.slimeRod });
            ModLoader.addRecipe(new ItemStack(cactusGlowstoneScythe), new Object[] 
                    { recipe, '#', mod_InfiBase.glowstoneCrystal, '|', mod_InfiBase.cactusRod });
        }
        
        if(PropsHelperInfiHybrids.enableIceTools)
        {
            ModLoader.addRecipe(new ItemStack(woodIceScythe), new Object[] 
                    { recipe, '#', Block.ice, '|', Item.stick });
            ModLoader.addRecipe(new ItemStack(boneIceScythe), new Object[] 
                    { recipe, '#', Block.ice, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneIceScythe), new Object[] 
                    { recipe, '#', Block.ice, '|', mod_InfiBase.boneRod });
            ModLoader.addRecipe(new ItemStack(paperIceScythe), new Object[] 
                    { recipe, '#', Block.ice, '|', mod_InfiBase.paperRod });
            ModLoader.addRecipe(new ItemStack(iceIceScythe), new Object[] 
                    { recipe, '#', Block.ice, '|', mod_InfiBase.iceRod });
            ModLoader.addRecipe(new ItemStack(slimeIceScythe), new Object[] 
                    { recipe, '#', Block.ice, '|', mod_InfiBase.slimeRod });
            ModLoader.addRecipe(new ItemStack(cactusIceScythe), new Object[] 
                    { recipe, '#', Block.ice, '|', mod_InfiBase.cactusRod });
        }
        
        if(PropsHelperInfiHybrids.enableLavaTools)
        {
            ModLoader.addRecipe(new ItemStack(diamondLavaScythe), new Object[] 
                    { recipe, '#', mod_InfiBase.lavaCrystal, '|', mod_InfiBase.diamondRod });
            ModLoader.addRecipe(new ItemStack(obsidianLavaScythe), new Object[] 
                    { recipe, '#', mod_InfiBase.lavaCrystal, '|', mod_InfiBase.obsidianRod });
            ModLoader.addRecipe(new ItemStack(netherrackLavaScythe), new Object[] 
                    { recipe, '#', mod_InfiBase.lavaCrystal, '|', mod_InfiBase.netherrackRod });
            ModLoader.addRecipe(new ItemStack(lavaLavaScythe), new Object[] 
                    { recipe, '#', mod_InfiBase.lavaCrystal, '|', mod_InfiBase.lavaRod });
            ModLoader.addRecipe(new ItemStack(flintLavaScythe), new Object[] 
                    { recipe, '#', mod_InfiBase.lavaCrystal, '|', mod_InfiBase.flintRod });
            ModLoader.addRecipe(new ItemStack(blazeLavaScythe), new Object[] 
                    { recipe, '#', mod_InfiBase.lavaCrystal, '|', Item.blazeRod });
            ModLoader.addRecipe(new ItemStack(manyullynLavaScythe), new Object[] 
                    { recipe, '#', mod_InfiBase.lavaCrystal, '|', mod_InfiBase.manyullynRod });
            ModLoader.addRecipe(new ItemStack(uraniumLavaScythe), new Object[] 
                    { recipe, '#', mod_InfiBase.lavaCrystal, '|', mod_InfiBase.uraniumRod });
        }
        
        if(PropsHelperInfiHybrids.enableSlimeTools)
        {
            ModLoader.addRecipe(new ItemStack(woodSlimeScythe), new Object[] 
                    { recipe, '#', mod_InfiBase.slimeCrystal, '|', Item.stick });
            ModLoader.addRecipe(new ItemStack(sandstoneSlimeScythe), new Object[] 
                    { recipe, '#', mod_InfiBase.slimeCrystal, '|', mod_InfiBase.sandstoneRod });
            ModLoader.addRecipe(new ItemStack(boneSlimeScythe), new Object[] 
                    { recipe, '#', mod_InfiBase.slimeCrystal, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneSlimeScythe), new Object[] 
                    { recipe, '#', mod_InfiBase.slimeCrystal, '|', mod_InfiBase.boneRod });
            ModLoader.addRecipe(new ItemStack(paperSlimeScythe), new Object[] 
                    { recipe, '#', mod_InfiBase.slimeCrystal, '|', mod_InfiBase.paperRod });
            ModLoader.addRecipe(new ItemStack(slimeSlimeScythe), new Object[] 
                    { recipe, '#', mod_InfiBase.slimeCrystal, '|', mod_InfiBase.slimeRod });
            ModLoader.addRecipe(new ItemStack(cactusSlimeScythe), new Object[] 
                    { recipe, '#', mod_InfiBase.slimeCrystal, '|', mod_InfiBase.cactusRod });
        }
        
        if(PropsHelperInfiHybrids.enableCactusTools)
        {
            ModLoader.addRecipe(new ItemStack(woodCactusScythe), new Object[] 
                    { recipe, '#', Block.cactus, '|', Item.stick });
            ModLoader.addRecipe(new ItemStack(sandstoneCactusScythe), new Object[] 
                    { recipe, '#', Block.cactus, '|', mod_InfiBase.sandstoneRod });
            ModLoader.addRecipe(new ItemStack(boneCactusScythe), new Object[] 
                    { recipe, '#', Block.cactus, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneCactusScythe), new Object[] 
                    { recipe, '#', Block.cactus, '|', mod_InfiBase.boneRod });
            ModLoader.addRecipe(new ItemStack(netherrackCactusScythe), new Object[] 
                    { recipe, '#', Block.cactus, '|', mod_InfiBase.netherrackRod });
            ModLoader.addRecipe(new ItemStack(iceCactusScythe), new Object[] 
                    { recipe, '#', Block.cactus, '|', mod_InfiBase.iceRod });
            ModLoader.addRecipe(new ItemStack(slimeCactusScythe), new Object[] 
                    { recipe, '#', Block.cactus, '|', mod_InfiBase.slimeRod });
            ModLoader.addRecipe(new ItemStack(cactusCactusScythe), new Object[] 
                    { recipe, '#', Block.cactus, '|', mod_InfiBase.cactusRod });
        }
        
        if(PropsHelperInfiHybrids.enableFlintTools)
        {
        	ModLoader.addRecipe(new ItemStack(woodFlintScythe), new Object[] 
                    { recipe, '#', Item.flint, '|', Item.stick });
        	ModLoader.addRecipe(new ItemStack(stoneFlintScythe), new Object[] 
                    { recipe, '#', Item.flint, '|', mod_InfiBase.stoneRod });
            ModLoader.addRecipe(new ItemStack(sandstoneFlintScythe), new Object[] 
                    { recipe, '#', Item.flint, '|', mod_InfiBase.sandstoneRod });
            ModLoader.addRecipe(new ItemStack(boneFlintScythe), new Object[] 
                    { recipe, '#', Item.flint, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneFlintScythe), new Object[] 
                    { recipe, '#', Item.flint, '|', mod_InfiBase.boneRod });
            ModLoader.addRecipe(new ItemStack(netherrackFlintScythe), new Object[] 
                    { recipe, '#', Item.flint, '|', mod_InfiBase.netherrackRod });
            ModLoader.addRecipe(new ItemStack(slimeFlintScythe), new Object[] 
                    { recipe, '#', Item.flint, '|', mod_InfiBase.slimeRod });
            ModLoader.addRecipe(new ItemStack(cactusFlintScythe), new Object[] 
                    { recipe, '#', Item.flint, '|', mod_InfiBase.cactusRod });
            ModLoader.addRecipe(new ItemStack(flintFlintScythe), new Object[] 
                    { recipe, '#', Item.flint, '|', mod_InfiBase.flintRod });
            ModLoader.addRecipe(new ItemStack(copperFlintScythe), new Object[] 
                    { recipe, '#', Block.netherrack, '|', mod_InfiBase.copperRod });
            ModLoader.addRecipe(new ItemStack(bronzeFlintScythe), new Object[] 
                    { recipe, '#', Block.netherrack, '|', mod_InfiBase.bronzeRod });
        }
        
        if(PropsHelperInfiHybrids.enableBlazeTools)
        {
            ModLoader.addRecipe(new ItemStack(diamondBlazeScythe), new Object[] 
                    { recipe, '#', mod_InfiBase.blazeCrystal, '|', mod_InfiBase.diamondRod });
            ModLoader.addRecipe(new ItemStack(obsidianBlazeScythe), new Object[] 
                    { recipe, '#', mod_InfiBase.blazeCrystal, '|', mod_InfiBase.obsidianRod });
            ModLoader.addRecipe(new ItemStack(netherrackBlazeScythe), new Object[] 
                    { recipe, '#', mod_InfiBase.blazeCrystal, '|', mod_InfiBase.netherrackRod });
            ModLoader.addRecipe(new ItemStack(lavaBlazeScythe), new Object[] 
                    { recipe, '#', mod_InfiBase.blazeCrystal, '|', mod_InfiBase.lavaRod });
            ModLoader.addRecipe(new ItemStack(flintBlazeScythe), new Object[] 
                    { recipe, '#', mod_InfiBase.blazeCrystal, '|', mod_InfiBase.flintRod });
            ModLoader.addRecipe(new ItemStack(blazeBlazeScythe), new Object[] 
                    { recipe, '#', mod_InfiBase.blazeCrystal, '|', Item.blazeRod });
            ModLoader.addRecipe(new ItemStack(manyullynBlazeScythe), new Object[] 
                    { recipe, '#', mod_InfiBase.blazeCrystal, '|', mod_InfiBase.manyullynRod });
            ModLoader.addRecipe(new ItemStack(uraniumBlazeScythe), new Object[] 
                    { recipe, '#', mod_InfiBase.blazeCrystal, '|', mod_InfiBase.uraniumRod });
        }
    }
    
    public static void addStoneTools(ItemStack stack)
    {
    	ModLoader.addRecipe(new ItemStack(woodStoneScythe), new Object[] 
                { recipe, '#', stack, '|', Item.stick });
    	ModLoader.addRecipe(new ItemStack(stoneStoneScythe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.stoneRod });
        ModLoader.addRecipe(new ItemStack(sandstoneStoneScythe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.sandstoneRod });
        ModLoader.addRecipe(new ItemStack(boneStoneScythe), new Object[] 
                { recipe, '#', stack, '|', Item.bone });
        ModLoader.addRecipe(new ItemStack(boneStoneScythe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.boneRod });
        ModLoader.addRecipe(new ItemStack(netherrackStoneScythe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.netherrackRod });
        ModLoader.addRecipe(new ItemStack(iceStoneScythe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.iceRod });
        ModLoader.addRecipe(new ItemStack(slimeStoneScythe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.slimeRod });
        ModLoader.addRecipe(new ItemStack(cactusStoneScythe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.cactusRod });
        ModLoader.addRecipe(new ItemStack(flintStoneScythe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.flintRod });
    }
    
    public static void addCopperTools(ItemStack stack)
    {
    	ModLoader.addRecipe(new ItemStack(woodCopperScythe), new Object[] 
                { recipe, '#', stack, '|', Item.stick });
        ModLoader.addRecipe(new ItemStack(stoneCopperScythe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.stoneRod });
        ModLoader.addRecipe(new ItemStack(boneCopperScythe), new Object[] 
                { recipe, '#', stack, '|', Item.bone });
        ModLoader.addRecipe(new ItemStack(boneCopperScythe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.boneRod });
        ModLoader.addRecipe(new ItemStack(netherrackCopperScythe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.netherrackRod });
        ModLoader.addRecipe(new ItemStack(slimeCopperScythe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.slimeRod });
        ModLoader.addRecipe(new ItemStack(cactusCopperScythe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.cactusRod });
        ModLoader.addRecipe(new ItemStack(flintCopperScythe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.flintRod });
        ModLoader.addRecipe(new ItemStack(copperCopperScythe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.copperRod });
    }
    
    public static void addBronzeTools(ItemStack stack)
    {
    	ModLoader.addRecipe(new ItemStack(woodBronzeScythe), new Object[] 
                { recipe, '#', stack, '|', Item.stick });
        ModLoader.addRecipe(new ItemStack(stoneBronzeScythe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.stoneRod });
        ModLoader.addRecipe(new ItemStack(boneBronzeScythe), new Object[] 
                { recipe, '#', stack, '|', Item.bone });
        ModLoader.addRecipe(new ItemStack(boneBronzeScythe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.boneRod });
        ModLoader.addRecipe(new ItemStack(netherrackBronzeScythe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.netherrackRod });
        ModLoader.addRecipe(new ItemStack(slimeBronzeScythe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.slimeRod });
        ModLoader.addRecipe(new ItemStack(cactusBronzeScythe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.cactusRod });
        ModLoader.addRecipe(new ItemStack(flintBronzeScythe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.flintRod });
        ModLoader.addRecipe(new ItemStack(copperBronzeScythe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.copperRod });
        ModLoader.addRecipe(new ItemStack(bronzeBronzeScythe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.bronzeRod });
    }
    
    public static void addWorkedIronTools(ItemStack stack)
    {
    	ModLoader.addRecipe(new ItemStack(woodWorkedIronScythe), new Object[] 
                { recipe, '#', stack, '|', Item.stick });
        ModLoader.addRecipe(new ItemStack(stoneWorkedIronScythe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.stoneRod });
        ModLoader.addRecipe(new ItemStack(ironWorkedIronScythe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.ironRod });
        ModLoader.addRecipe(new ItemStack(diamondWorkedIronScythe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.diamondRod });
        ModLoader.addRecipe(new ItemStack(redstoneWorkedIronScythe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.redstoneRod });
        ModLoader.addRecipe(new ItemStack(obsidianWorkedIronScythe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.obsidianRod });
        ModLoader.addRecipe(new ItemStack(boneWorkedIronScythe), new Object[] 
                { recipe, '#', stack, '|', Item.bone });
        ModLoader.addRecipe(new ItemStack(boneWorkedIronScythe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.boneRod });
        ModLoader.addRecipe(new ItemStack(netherrackWorkedIronScythe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.netherrackRod });
        ModLoader.addRecipe(new ItemStack(glowstoneWorkedIronScythe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.glowstoneRod });
        ModLoader.addRecipe(new ItemStack(iceWorkedIronScythe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.iceRod });
        ModLoader.addRecipe(new ItemStack(slimeWorkedIronScythe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.slimeRod });
        ModLoader.addRecipe(new ItemStack(cactusWorkedIronScythe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.cactusRod });
        ModLoader.addRecipe(new ItemStack(blazeWorkedIronScythe), new Object[] 
                { recipe, '#', stack, '|', Item.blazeRod });
        ModLoader.addRecipe(new ItemStack(copperWorkedIronScythe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.copperRod });
        ModLoader.addRecipe(new ItemStack(bronzeWorkedIronScythe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.bronzeRod });
        ModLoader.addRecipe(new ItemStack(workedWorkedIronScythe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.workedIronRod });
        ModLoader.addRecipe(new ItemStack(steelWorkedIronScythe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.steelRod });
        ModLoader.addRecipe(new ItemStack(uraniumWorkedIronScythe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.uraniumRod });
    }
    
    public static void addSteelTools(ItemStack stack)
    {
    	ModLoader.addRecipe(new ItemStack(woodSteelScythe), new Object[] 
                { recipe, '#', stack, '|', Item.stick });
        ModLoader.addRecipe(new ItemStack(stoneSteelScythe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.stoneRod });
        ModLoader.addRecipe(new ItemStack(ironSteelScythe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.ironRod });
        ModLoader.addRecipe(new ItemStack(diamondSteelScythe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.diamondRod });
        ModLoader.addRecipe(new ItemStack(redstoneSteelScythe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.redstoneRod });
        ModLoader.addRecipe(new ItemStack(obsidianSteelScythe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.obsidianRod });
        ModLoader.addRecipe(new ItemStack(boneSteelScythe), new Object[] 
                { recipe, '#', stack, '|', Item.bone });
        ModLoader.addRecipe(new ItemStack(boneSteelScythe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.boneRod });
        ModLoader.addRecipe(new ItemStack(netherrackSteelScythe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.netherrackRod });
        ModLoader.addRecipe(new ItemStack(glowstoneSteelScythe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.glowstoneRod });
        ModLoader.addRecipe(new ItemStack(iceSteelScythe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.iceRod });
        ModLoader.addRecipe(new ItemStack(slimeSteelScythe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.slimeRod });
        ModLoader.addRecipe(new ItemStack(cactusSteelScythe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.cactusRod });
        ModLoader.addRecipe(new ItemStack(blazeSteelScythe), new Object[] 
                { recipe, '#', stack, '|', Item.blazeRod });
        ModLoader.addRecipe(new ItemStack(copperSteelScythe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.copperRod });
        ModLoader.addRecipe(new ItemStack(bronzeSteelScythe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.bronzeRod });
        ModLoader.addRecipe(new ItemStack(workedSteelScythe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.workedIronRod });
        ModLoader.addRecipe(new ItemStack(steelSteelScythe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.steelRod });
        ModLoader.addRecipe(new ItemStack(cobaltSteelScythe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.cobaltRod });
        ModLoader.addRecipe(new ItemStack(arditeSteelScythe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.arditeRod });
        ModLoader.addRecipe(new ItemStack(uraniumSteelScythe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.uraniumRod });
    }
    
    public static void addCobaltTools(ItemStack stack)
    {
    	ModLoader.addRecipe(new ItemStack(woodCobaltScythe), new Object[] 
                { recipe, '#', stack, '|', Item.stick });
        ModLoader.addRecipe(new ItemStack(stoneCobaltScythe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.stoneRod });
        ModLoader.addRecipe(new ItemStack(ironCobaltScythe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.ironRod });
        ModLoader.addRecipe(new ItemStack(diamondCobaltScythe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.diamondRod });
        ModLoader.addRecipe(new ItemStack(redstoneCobaltScythe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.redstoneRod });
        ModLoader.addRecipe(new ItemStack(obsidianCobaltScythe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.obsidianRod });
        ModLoader.addRecipe(new ItemStack(boneCobaltScythe), new Object[] 
                { recipe, '#', stack, '|', Item.bone });
        ModLoader.addRecipe(new ItemStack(boneCobaltScythe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.boneRod });
        ModLoader.addRecipe(new ItemStack(slimeCobaltScythe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.slimeRod });
        ModLoader.addRecipe(new ItemStack(cactusCobaltScythe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.cactusRod });
        ModLoader.addRecipe(new ItemStack(blazeCobaltScythe), new Object[] 
                { recipe, '#', stack, '|', Item.blazeRod });
        ModLoader.addRecipe(new ItemStack(copperCobaltScythe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.copperRod });
        ModLoader.addRecipe(new ItemStack(bronzeCobaltScythe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.bronzeRod });
        ModLoader.addRecipe(new ItemStack(workedCobaltScythe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.workedIronRod });
        ModLoader.addRecipe(new ItemStack(steelCobaltScythe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.steelRod });
        ModLoader.addRecipe(new ItemStack(cobaltCobaltScythe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.cobaltRod });
        ModLoader.addRecipe(new ItemStack(arditeCobaltScythe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.arditeRod });
        ModLoader.addRecipe(new ItemStack(manyullynCobaltScythe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.manyullynRod });
        ModLoader.addRecipe(new ItemStack(uraniumCobaltScythe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.uraniumRod });
    }
    
    public static void addArditeTools(ItemStack stack)
    {
    	ModLoader.addRecipe(new ItemStack(woodArditeScythe), new Object[] 
                { recipe, '#', stack, '|', Item.stick });
        ModLoader.addRecipe(new ItemStack(stoneArditeScythe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.stoneRod });
        ModLoader.addRecipe(new ItemStack(ironArditeScythe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.ironRod });
        ModLoader.addRecipe(new ItemStack(diamondArditeScythe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.diamondRod });
        ModLoader.addRecipe(new ItemStack(redstoneArditeScythe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.redstoneRod });
        ModLoader.addRecipe(new ItemStack(obsidianArditeScythe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.obsidianRod });
        ModLoader.addRecipe(new ItemStack(boneArditeScythe), new Object[] 
                { recipe, '#', stack, '|', Item.bone });
        ModLoader.addRecipe(new ItemStack(boneArditeScythe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.boneRod });
        ModLoader.addRecipe(new ItemStack(slimeArditeScythe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.slimeRod });
        ModLoader.addRecipe(new ItemStack(cactusArditeScythe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.cactusRod });
        ModLoader.addRecipe(new ItemStack(blazeArditeScythe), new Object[] 
                { recipe, '#', stack, '|', Item.blazeRod });
        ModLoader.addRecipe(new ItemStack(copperArditeScythe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.copperRod });
        ModLoader.addRecipe(new ItemStack(bronzeArditeScythe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.bronzeRod });
        ModLoader.addRecipe(new ItemStack(workedArditeScythe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.workedIronRod });
        ModLoader.addRecipe(new ItemStack(steelArditeScythe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.steelRod });
        ModLoader.addRecipe(new ItemStack(cobaltArditeScythe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.cobaltRod });
        ModLoader.addRecipe(new ItemStack(arditeArditeScythe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.arditeRod });
        ModLoader.addRecipe(new ItemStack(manyullynArditeScythe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.manyullynRod });
        ModLoader.addRecipe(new ItemStack(uraniumArditeScythe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.uraniumRod });
    }
    
    public static void addManyullynTools(ItemStack stack)
    {
    	ModLoader.addRecipe(new ItemStack(woodManyullynScythe), new Object[] 
                { recipe, '#', stack, '|', Item.stick });
        ModLoader.addRecipe(new ItemStack(stoneManyullynScythe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.stoneRod });
        ModLoader.addRecipe(new ItemStack(ironManyullynScythe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.ironRod });
        ModLoader.addRecipe(new ItemStack(diamondManyullynScythe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.diamondRod });
        ModLoader.addRecipe(new ItemStack(redstoneManyullynScythe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.redstoneRod });
        ModLoader.addRecipe(new ItemStack(obsidianManyullynScythe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.obsidianRod });
        ModLoader.addRecipe(new ItemStack(boneManyullynScythe), new Object[] 
                { recipe, '#', stack, '|', Item.bone });
        ModLoader.addRecipe(new ItemStack(boneManyullynScythe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.boneRod });
        ModLoader.addRecipe(new ItemStack(slimeManyullynScythe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.slimeRod });
        ModLoader.addRecipe(new ItemStack(cactusManyullynScythe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.cactusRod });
        ModLoader.addRecipe(new ItemStack(blazeManyullynScythe), new Object[] 
                { recipe, '#', stack, '|', Item.blazeRod });
        ModLoader.addRecipe(new ItemStack(copperManyullynScythe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.copperRod });
        ModLoader.addRecipe(new ItemStack(bronzeManyullynScythe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.bronzeRod });
        ModLoader.addRecipe(new ItemStack(workedManyullynScythe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.workedIronRod });
        ModLoader.addRecipe(new ItemStack(steelManyullynScythe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.steelRod });
        ModLoader.addRecipe(new ItemStack(cobaltManyullynScythe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.cobaltRod });
        ModLoader.addRecipe(new ItemStack(arditeManyullynScythe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.arditeRod });
        ModLoader.addRecipe(new ItemStack(manyullynManyullynScythe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.manyullynRod });
        ModLoader.addRecipe(new ItemStack(uraniumManyullynScythe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.uraniumRod });
    }
    
    public static void addUraniumTools(ItemStack stack)
    {
        ModLoader.addRecipe(new ItemStack(diamondUraniumScythe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.diamondRod });
        ModLoader.addRecipe(new ItemStack(redstoneUraniumScythe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.redstoneRod });
        ModLoader.addRecipe(new ItemStack(boneUraniumScythe), new Object[] 
                { recipe, '#', stack, '|', Item.bone });
        ModLoader.addRecipe(new ItemStack(boneUraniumScythe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.boneRod });
        ModLoader.addRecipe(new ItemStack(netherrackUraniumScythe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.netherrackRod });
        ModLoader.addRecipe(new ItemStack(glowstoneUraniumScythe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.glowstoneRod });
        ModLoader.addRecipe(new ItemStack(lavaUraniumScythe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.lavaRod });
        ModLoader.addRecipe(new ItemStack(blazeUraniumScythe), new Object[] 
                { recipe, '#', stack, '|', Item.blazeRod });
        ModLoader.addRecipe(new ItemStack(cobaltUraniumScythe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.cobaltRod });
        ModLoader.addRecipe(new ItemStack(arditeUraniumScythe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.arditeRod });
        ModLoader.addRecipe(new ItemStack(uraniumUraniumScythe), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.uraniumRod });
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
