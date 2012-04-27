package net.minecraft.src.infirange;
import net.minecraft.src.Block;
import net.minecraft.src.InfiMaterialEnum;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;
import net.minecraft.src.ModLoader;
import net.minecraft.src.mod_InfiBase;
import net.minecraft.src.mod_InfiRange;
import net.minecraft.src.forge.MinecraftForge;

public class Spears 
{
    public static Spears instance = new Spears();
    
    private static String[] recipe = { "#  ", " | ", "  |" };
    
    public static Spears getInstance()
    {
        return instance;
    }

    public static void init()
    {
        if(mod_InfiRange.infitoolsPresent)
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
    	woodWoodSpear = new InfiToolSpear(PropsHelperInfiRange.woodSpearID+0, 
                InfiMaterialEnum.Wood, InfiMaterialEnum.Wood, "woodWoodSpear");
    	woodStoneSpear = new InfiToolSpear(PropsHelperInfiRange.stoneSpearID+0, 
                InfiMaterialEnum.Stone, InfiMaterialEnum.Wood, "woodStoneSpear");
    	woodIronSpear = new InfiToolSpear(PropsHelperInfiRange.ironSpearID+0, 
                InfiMaterialEnum.Iron, InfiMaterialEnum.Wood, "woodIronSpear");
    	woodDiamondSpear = new InfiToolSpear(PropsHelperInfiRange.diamondSpearID+0, 
                InfiMaterialEnum.Diamond, InfiMaterialEnum.Wood, "woodDiamondSpear");
    	
    	ModLoader.addName(woodWoodSpear, "Wooden Spear");
    }
    
    private static void registerVanillaRecipes()
    {
    	ModLoader.addRecipe(new ItemStack(woodWoodSpear), new Object[] 
                { recipe, '#', Block.planks, '|', Item.stick, });
		ModLoader.addRecipe(new ItemStack(woodStoneSpear), new Object[] 
                { recipe, '#', Block.cobblestone, '|', Item.stick, });
		ModLoader.addRecipe(new ItemStack(woodIronSpear), new Object[] 
                { recipe, '#', Item.ingotIron, '|', Item.stick, });
		ModLoader.addRecipe(new ItemStack(woodDiamondSpear), new Object[] 
                { recipe, '#', Item.diamond, '|', Item.stick, });
    }
    
    private static void createTools()
    {
    	if(PropsHelperInfiRange.enableWoodTools)
    	{
    		woodWoodSpear = new InfiToolSpear(PropsHelperInfiRange.woodSpearID+0, 
                    InfiMaterialEnum.Wood, InfiMaterialEnum.Wood, "woodWoodSpear");
    		sandstoneWoodSpear = new InfiToolSpear(PropsHelperInfiRange.woodSpearID+1, 
                    InfiMaterialEnum.Wood, InfiMaterialEnum.Sandstone, "sandstoneWoodSpear");
    		boneWoodSpear = new InfiToolSpear(PropsHelperInfiRange.woodSpearID+2, 
                    InfiMaterialEnum.Wood, InfiMaterialEnum.Bone, "boneWoodSpear");
    		paperWoodSpear = new InfiToolSpear(PropsHelperInfiRange.woodSpearID+3, 
                    InfiMaterialEnum.Wood, InfiMaterialEnum.Paper, "paperWoodSpear");
    		iceWoodSpear = new InfiToolSpear(PropsHelperInfiRange.woodSpearID+4, 
                    InfiMaterialEnum.Wood, InfiMaterialEnum.Ice, "iceWoodSpear");
    		slimeWoodSpear = new InfiToolSpear(PropsHelperInfiRange.woodSpearID+5, 
                    InfiMaterialEnum.Wood, InfiMaterialEnum.Slime, "slimeWoodSpear");
    		cactusWoodSpear = new InfiToolSpear(PropsHelperInfiRange.woodSpearID+6, 
                    InfiMaterialEnum.Wood, InfiMaterialEnum.Cactus, "cactusWoodSpear");
    	}

        if(PropsHelperInfiRange.enableStoneTools)
        {
        	woodStoneSpear = new InfiToolSpear(PropsHelperInfiRange.stoneSpearID+0, 
                    InfiMaterialEnum.Stone, InfiMaterialEnum.Wood, "woodStoneSpear");
        	stoneStoneSpear = new InfiToolSpear(PropsHelperInfiRange.stoneSpearID+1, 
                    InfiMaterialEnum.Stone, InfiMaterialEnum.Stone, "stoneStoneSpear");
        	sandstoneStoneSpear = new InfiToolSpear(PropsHelperInfiRange.stoneSpearID+2, 
                    InfiMaterialEnum.Stone, InfiMaterialEnum.Sandstone, "sandstoneStoneSpear");
        	boneStoneSpear = new InfiToolSpear(PropsHelperInfiRange.stoneSpearID+3, 
                    InfiMaterialEnum.Stone, InfiMaterialEnum.Bone, "boneStoneSpear");
        	netherrackStoneSpear = new InfiToolSpear(PropsHelperInfiRange.stoneSpearID+4, 
                    InfiMaterialEnum.Stone, InfiMaterialEnum.Netherrack, "netherrackStoneSpear");
        	iceStoneSpear = new InfiToolSpear(PropsHelperInfiRange.stoneSpearID+5, 
                    InfiMaterialEnum.Stone, InfiMaterialEnum.Ice, "iceStoneSpear");
        	slimeStoneSpear = new InfiToolSpear(PropsHelperInfiRange.stoneSpearID+6, 
                    InfiMaterialEnum.Stone, InfiMaterialEnum.Slime, "slimeStoneSpear");
        	cactusStoneSpear = new InfiToolSpear(PropsHelperInfiRange.stoneSpearID+7, 
                    InfiMaterialEnum.Stone, InfiMaterialEnum.Cactus, "cactusStoneSpear");
        	flintStoneSpear = new InfiToolSpear(PropsHelperInfiRange.stoneSpearID+8, 
                    InfiMaterialEnum.Stone, InfiMaterialEnum.Flint, "flintStoneSpear");
        }
        
        if(PropsHelperInfiRange.enableIronTools)
        {
        	woodIronSpear = new InfiToolSpear(PropsHelperInfiRange.ironSpearID+0, 
                    InfiMaterialEnum.Iron, InfiMaterialEnum.Wood, "woodIronSpear");
        	stoneIronSpear = new InfiToolSpear(PropsHelperInfiRange.ironSpearID+1, 
                    InfiMaterialEnum.Iron, InfiMaterialEnum.Stone, "stoneIronSpear");
        	ironIronSpear = new InfiToolSpear(PropsHelperInfiRange.ironSpearID+2, 
                    InfiMaterialEnum.Iron, InfiMaterialEnum.Iron, "ironIronSpear");
        	boneIronSpear = new InfiToolSpear(PropsHelperInfiRange.ironSpearID+3, 
                    InfiMaterialEnum.Iron, InfiMaterialEnum.Bone, "boneIronSpear");
        	netherrackIronSpear = new InfiToolSpear(PropsHelperInfiRange.ironSpearID+4, 
                    InfiMaterialEnum.Iron, InfiMaterialEnum.Netherrack, "netherrackIronSpear");
        	glowstoneIronSpear = new InfiToolSpear(PropsHelperInfiRange.ironSpearID+5, 
                    InfiMaterialEnum.Iron, InfiMaterialEnum.Glowstone, "glowstoneIronSpear");
        	cactusIronSpear = new InfiToolSpear(PropsHelperInfiRange.ironSpearID+6, 
                    InfiMaterialEnum.Iron, InfiMaterialEnum.Cactus, "cactusIronSpear");
        	copperIronSpear = new InfiToolSpear(PropsHelperInfiRange.ironSpearID+7, 
                    InfiMaterialEnum.Iron, InfiMaterialEnum.Copper, "copperIronSpear");
        	bronzeIronSpear = new InfiToolSpear(PropsHelperInfiRange.ironSpearID+8, 
                    InfiMaterialEnum.Iron, InfiMaterialEnum.Bronze, "bronzeIronSpear");
        }
        
        if(PropsHelperInfiRange.enableDiamondTools)
        {
        	woodDiamondSpear = new InfiToolSpear(PropsHelperInfiRange.diamondSpearID+0, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Wood, "woodDiamondSpear");
        	stoneDiamondSpear = new InfiToolSpear(PropsHelperInfiRange.diamondSpearID+1, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Stone, "stoneDiamondSpear");
        	ironDiamondSpear = new InfiToolSpear(PropsHelperInfiRange.diamondSpearID+2, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Iron, "ironDiamondSpear");
        	diamondDiamondSpear = new InfiToolSpear(PropsHelperInfiRange.diamondSpearID+3, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Diamond, "diamondDiamondSpear");
        	redstoneDiamondSpear = new InfiToolSpear(PropsHelperInfiRange.diamondSpearID+4, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Redstone, "redstoneDiamondSpear");
        	obsidianDiamondSpear = new InfiToolSpear(PropsHelperInfiRange.diamondSpearID+5, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Obsidian, "obsidianDiamondSpear");
        	boneDiamondSpear = new InfiToolSpear(PropsHelperInfiRange.diamondSpearID+6, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Bone, "boneDiamondSpear");
        	mossyDiamondSpear = new InfiToolSpear(PropsHelperInfiRange.diamondSpearID+7, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Mossy, "mossyDiamondSpear");
        	netherrackDiamondSpear = new InfiToolSpear(PropsHelperInfiRange.diamondSpearID+8, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Netherrack, "netherrackDiamondSpear");
        	glowstoneDiamondSpear = new InfiToolSpear(PropsHelperInfiRange.diamondSpearID+9, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Glowstone, "glowstoneDiamondSpear");
        	lavaDiamondSpear = new InfiToolSpear(PropsHelperInfiRange.diamondSpearID+10, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Lava, "lavaDiamondSpear");
        	cactusDiamondSpear = new InfiToolSpear(PropsHelperInfiRange.diamondSpearID+11, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Cactus, "cactusDiamondSpear");
        	flintDiamondSpear = new InfiToolSpear(PropsHelperInfiRange.diamondSpearID+12, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Flint, "flintDiamondSpear");
        	blazeDiamondSpear = new InfiToolSpear(PropsHelperInfiRange.diamondSpearID+13, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Blaze, "blazeDiamondSpear");
            copperDiamondSpear = new InfiToolSpear(PropsHelperInfiRange.diamondSpearID+14, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Copper, "copperDiamondSpear");
            bronzeDiamondSpear = new InfiToolSpear(PropsHelperInfiRange.diamondSpearID+15, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Bronze, "bronzeDiamondSpear");
            workedDiamondSpear = new InfiToolSpear(PropsHelperInfiRange.diamondSpearID+16, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.WorkedIron, "workedDiamondSpear");
            steelDiamondSpear = new InfiToolSpear(PropsHelperInfiRange.diamondSpearID+17, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Steel, "steelDiamondSpear");
            cobaltDiamondSpear = new InfiToolSpear(PropsHelperInfiRange.diamondSpearID+18, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Cobalt, "cobaltDiamondSpear");
            arditeDiamondSpear = new InfiToolSpear(PropsHelperInfiRange.diamondSpearID+19, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Ardite, "arditeDiamondSpear");
            manyullynDiamondSpear = new InfiToolSpear(PropsHelperInfiRange.diamondSpearID+20, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Manyullyn, "manyullynDiamondSpear");
            uraniumDiamondSpear = new InfiToolSpear(PropsHelperInfiRange.diamondSpearID+21, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Uranium, "uraniumDiamondSpear");
        }
        
        if(PropsHelperInfiRange.enableRedstoneTools)
        {
        	woodRedstoneSpear = new InfiToolSpear(PropsHelperInfiRange.redstoneSpearID+0, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Wood, "woodRedstoneSpear");
        	stoneRedstoneSpear = new InfiToolSpear(PropsHelperInfiRange.redstoneSpearID+1, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Stone, "stoneRedstoneSpear");
        	ironRedstoneSpear = new InfiToolSpear(PropsHelperInfiRange.redstoneSpearID+2, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Iron, "ironRedstoneSpear");
        	redstoneRedstoneSpear = new InfiToolSpear(PropsHelperInfiRange.redstoneSpearID+3, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Redstone, "redstoneRedstoneSpear");
        	obsidianRedstoneSpear = new InfiToolSpear(PropsHelperInfiRange.redstoneSpearID+4, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Obsidian, "obsidianRedstoneSpear");
        	sandstoneRedstoneSpear = new InfiToolSpear(PropsHelperInfiRange.redstoneSpearID+5, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Sandstone, "sandstoneRedstoneSpear");
        	boneRedstoneSpear = new InfiToolSpear(PropsHelperInfiRange.redstoneSpearID+6, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Bone, "boneRedstoneSpear");
        	paperRedstoneSpear = new InfiToolSpear(PropsHelperInfiRange.redstoneSpearID+7, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Paper, "paperRedstoneSpear");
        	mossyRedstoneSpear = new InfiToolSpear(PropsHelperInfiRange.redstoneSpearID+8, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Mossy, "mossyRedstoneSpear");
        	netherrackRedstoneSpear = new InfiToolSpear(PropsHelperInfiRange.redstoneSpearID+9, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Netherrack, "netherrackRedstoneSpear");
        	glowstoneRedstoneSpear = new InfiToolSpear(PropsHelperInfiRange.redstoneSpearID+10, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Glowstone, "glowstoneRedstoneSpear");
        	iceRedstoneSpear = new InfiToolSpear(PropsHelperInfiRange.redstoneSpearID+11, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Ice, "iceRedstoneSpear");
        	lavaRedstoneSpear = new InfiToolSpear(PropsHelperInfiRange.redstoneSpearID+12,
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Lava, "lavaRedstoneSpear");
        	slimeRedstoneSpear = new InfiToolSpear(PropsHelperInfiRange.redstoneSpearID+13,
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Slime, "slimeRedstoneSpear");
        	cactusRedstoneSpear = new InfiToolSpear(PropsHelperInfiRange.redstoneSpearID+14,
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Cactus, "cactusRedstoneSpear");
        	flintRedstoneSpear = new InfiToolSpear(PropsHelperInfiRange.redstoneSpearID+15,
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Flint, "flintRedstoneSpear");
        	copperRedstoneSpear = new InfiToolSpear(PropsHelperInfiRange.redstoneSpearID+16,
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Copper, "copperRedstoneSpear");
        	bronzeRedstoneSpear = new InfiToolSpear(PropsHelperInfiRange.redstoneSpearID+17,
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Bronze, "bronzeRedstoneSpear");
        	workedRedstoneSpear = new InfiToolSpear(PropsHelperInfiRange.redstoneSpearID+18,
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.WorkedIron, "workedRedstoneSpear");
        	uraniumRedstoneSpear = new InfiToolSpear(PropsHelperInfiRange.redstoneSpearID+19,
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Uranium, "uraniumRedstoneSpear");
        }
        
        if(PropsHelperInfiRange.enableObsidianTools)
        {
        	woodObsidianSpear = new InfiToolSpear(PropsHelperInfiRange.obsidianSpearID+0, 
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Wood, "woodObsidianSpear");
        	stoneObsidianSpear = new InfiToolSpear(PropsHelperInfiRange.obsidianSpearID+1, 
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Stone, "stoneObsidianSpear");
        	redstoneObsidianSpear = new InfiToolSpear(PropsHelperInfiRange.obsidianSpearID+2, 
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Redstone, "redstoneObsidianSpear");
        	obsidianObsidianSpear = new InfiToolSpear(PropsHelperInfiRange.obsidianSpearID+3, 
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Obsidian, "obsidianObsidianSpear");;
        	boneObsidianSpear = new InfiToolSpear(PropsHelperInfiRange.obsidianSpearID+4, 
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Bone, "boneObsidianSpear");
        	netherrackObsidianSpear = new InfiToolSpear(PropsHelperInfiRange.obsidianSpearID+5, 
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Netherrack, "netherrackObsidianSpear");
        	glowstoneObsidianSpear = new InfiToolSpear(PropsHelperInfiRange.obsidianSpearID+6, 
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Glowstone, "glowstoneObsidianSpear");
        	iceObsidianSpear = new InfiToolSpear(PropsHelperInfiRange.obsidianSpearID+7, 
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Ice, "iceObsidianSpear");
        	lavaObsidianSpear = new InfiToolSpear(PropsHelperInfiRange.obsidianSpearID+8,
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Lava, "lavaObsidianSpear");
        	cactusObsidianSpear = new InfiToolSpear(PropsHelperInfiRange.obsidianSpearID+9,
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Cactus, "cactusObsidianSpear");
        }
        
        if(PropsHelperInfiRange.enableSandstoneTools)
        {
        	woodSandstoneSpear = new InfiToolSpear(PropsHelperInfiRange.sandstoneSpearID+0, 
                    InfiMaterialEnum.Sandstone, InfiMaterialEnum.Wood, "woodSandstoneSpear");
        	sandstoneSandstoneSpear = new InfiToolSpear(PropsHelperInfiRange.sandstoneSpearID+1, 
                    InfiMaterialEnum.Sandstone, InfiMaterialEnum.Sandstone, "sandstoneSandstoneSpear");
        	boneSandstoneSpear = new InfiToolSpear(PropsHelperInfiRange.sandstoneSpearID+2, 
                    InfiMaterialEnum.Sandstone, InfiMaterialEnum.Bone, "boneSandstoneSpear");
        	netherrackSandstoneSpear = new InfiToolSpear(PropsHelperInfiRange.sandstoneSpearID+3, 
                    InfiMaterialEnum.Sandstone, InfiMaterialEnum.Netherrack, "netherrackSandstoneSpear");
        	iceSandstoneSpear = new InfiToolSpear(PropsHelperInfiRange.sandstoneSpearID+4, 
                    InfiMaterialEnum.Sandstone, InfiMaterialEnum.Ice, "iceSandstoneSpear");
        	slimeSandstoneSpear = new InfiToolSpear(PropsHelperInfiRange.sandstoneSpearID+5,
                    InfiMaterialEnum.Sandstone, InfiMaterialEnum.Slime, "slimeSandstoneSpear");
        	cactusSandstoneSpear = new InfiToolSpear(PropsHelperInfiRange.sandstoneSpearID+6,
                    InfiMaterialEnum.Sandstone, InfiMaterialEnum.Cactus, "cactusSandstoneSpear");
        	flintSandstoneSpear = new InfiToolSpear(PropsHelperInfiRange.sandstoneSpearID+7,
                    InfiMaterialEnum.Sandstone, InfiMaterialEnum.Flint, "flintSandstoneSpear");
        }
        
        if(PropsHelperInfiRange.enableBoneTools)
        {
        	woodBoneSpear = new InfiToolSpear(PropsHelperInfiRange.boneSpearID+0, 
                    InfiMaterialEnum.Bone, InfiMaterialEnum.Wood, "woodBoneSpear");
        	stoneBoneSpear = new InfiToolSpear(PropsHelperInfiRange.boneSpearID+1, 
                    InfiMaterialEnum.Bone, InfiMaterialEnum.Stone, "stoneBoneSpear");
        	sandstoneBoneSpear = new InfiToolSpear(PropsHelperInfiRange.boneSpearID+2, 
                    InfiMaterialEnum.Bone, InfiMaterialEnum.Sandstone, "sandstoneBoneSpear");
        	boneBoneSpear = new InfiToolSpear(PropsHelperInfiRange.boneSpearID+3, 
                    InfiMaterialEnum.Bone, InfiMaterialEnum.Bone, "boneBoneSpear");
        	paperBoneSpear = new InfiToolSpear(PropsHelperInfiRange.boneSpearID+4, 
                    InfiMaterialEnum.Bone, InfiMaterialEnum.Paper, "paperBoneSpear");
        	netherrackBoneSpear = new InfiToolSpear(PropsHelperInfiRange.boneSpearID+5, 
                    InfiMaterialEnum.Bone, InfiMaterialEnum.Netherrack, "netherrackBoneSpear");
        	iceBoneSpear = new InfiToolSpear(PropsHelperInfiRange.boneSpearID+6, 
                    InfiMaterialEnum.Bone, InfiMaterialEnum.Ice, "iceBoneSpear");
        	cactusBoneSpear = new InfiToolSpear(PropsHelperInfiRange.boneSpearID+7,
                    InfiMaterialEnum.Bone, InfiMaterialEnum.Cactus, "cactusBoneSpear");
        	flintBoneSpear = new InfiToolSpear(PropsHelperInfiRange.boneSpearID+8,
                    InfiMaterialEnum.Bone, InfiMaterialEnum.Flint, "flintBoneSpear");
        }
        
        if(PropsHelperInfiRange.enablePaperTools)
        {
        	woodPaperSpear = new InfiToolSpear(PropsHelperInfiRange.paperSpearID+0, 
                    InfiMaterialEnum.Paper, InfiMaterialEnum.Wood, "woodPaperSpear");
        	bonePaperSpear = new InfiToolSpear(PropsHelperInfiRange.paperSpearID+1, 
                    InfiMaterialEnum.Paper, InfiMaterialEnum.Bone, "bonePaperSpear");
        	paperPaperSpear = new InfiToolSpear(PropsHelperInfiRange.paperSpearID+2, 
                    InfiMaterialEnum.Paper, InfiMaterialEnum.Paper, "paperPaperSpear");
        	slimePaperSpear = new InfiToolSpear(PropsHelperInfiRange.paperSpearID+3,
                    InfiMaterialEnum.Paper, InfiMaterialEnum.Slime, "slimePaperSpear");
        	cactusPaperSpear = new InfiToolSpear(PropsHelperInfiRange.paperSpearID+4,
                    InfiMaterialEnum.Paper, InfiMaterialEnum.Cactus, "cactusPaperSpear");
        }
        
        if(PropsHelperInfiRange.enableMossyTools)
        {
        	woodMossySpear = new InfiToolSpear(PropsHelperInfiRange.mossySpearID+0, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Wood, "woodMossySpear");
        	stoneMossySpear = new InfiToolSpear(PropsHelperInfiRange.mossySpearID+1, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Stone, "stoneMossySpear");
        	diamondMossySpear = new InfiToolSpear(PropsHelperInfiRange.mossySpearID+2, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Diamond, "diamondMossySpear");
        	redstoneMossySpear = new InfiToolSpear(PropsHelperInfiRange.mossySpearID+3, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Redstone, "redstoneMossySpear");
        	boneMossySpear = new InfiToolSpear(PropsHelperInfiRange.mossySpearID+4, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Bone, "boneMossySpear");
        	mossyMossySpear = new InfiToolSpear(PropsHelperInfiRange.mossySpearID+5, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Mossy, "mossyMossySpear");
        	netherrackMossySpear = new InfiToolSpear(PropsHelperInfiRange.mossySpearID+6, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Netherrack, "netherrackMossySpear");
        	glowstoneMossySpear = new InfiToolSpear(PropsHelperInfiRange.mossySpearID+7, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Glowstone, "glowstoneMossySpear");
        	cactusMossySpear = new InfiToolSpear(PropsHelperInfiRange.mossySpearID+8, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Cactus, "cactusMossySpear");
        	blazeMossySpear = new InfiToolSpear(PropsHelperInfiRange.mossySpearID+9, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Blaze, "blazeMossySpear");
        	manyullynMossySpear = new InfiToolSpear(PropsHelperInfiRange.mossySpearID+10, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Manyullyn, "manyullynMossySpear");
        	uraniumMossySpear = new InfiToolSpear(PropsHelperInfiRange.mossySpearID+11, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Uranium, "uraniumMossySpear");
        }
        
        if(PropsHelperInfiRange.enableNetherrackTools)
        {
        	woodNetherrackSpear = new InfiToolSpear(PropsHelperInfiRange.netherrackSpearID+0, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Wood, "woodNetherrackSpear");
        	stoneNetherrackSpear = new InfiToolSpear(PropsHelperInfiRange.netherrackSpearID+1, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Stone, "stoneNetherrackSpear");
        	sandstoneNetherrackSpear = new InfiToolSpear(PropsHelperInfiRange.netherrackSpearID+2, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Sandstone, "sandstoneNetherrackSpear");
        	boneNetherrackSpear = new InfiToolSpear(PropsHelperInfiRange.netherrackSpearID+3, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Bone, "boneNetherrackSpear");
        	paperNetherrackSpear = new InfiToolSpear(PropsHelperInfiRange.netherrackSpearID+4, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Paper, "paperNetherrackSpear");
        	mossyNetherrackSpear = new InfiToolSpear(PropsHelperInfiRange.netherrackSpearID+5, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Mossy, "mossyNetherrackSpear");
        	netherrackNetherrackSpear = new InfiToolSpear(PropsHelperInfiRange.netherrackSpearID+6, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Netherrack, "netherrackNetherrackSpear");
        	iceNetherrackSpear = new InfiToolSpear(PropsHelperInfiRange.netherrackSpearID+7, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Ice, "iceNetherrackSpear");
        	slimeNetherrackSpear = new InfiToolSpear(PropsHelperInfiRange.netherrackSpearID+8, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Slime, "slimeNetherrackSpear");
        	cactusNetherrackSpear = new InfiToolSpear(PropsHelperInfiRange.netherrackSpearID+9, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Cactus, "cactusNetherrackSpear");
        	flintNetherrackSpear = new InfiToolSpear(PropsHelperInfiRange.netherrackSpearID+10, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Flint, "flintNetherrackSpear");
        	copperNetherrackSpear = new InfiToolSpear(PropsHelperInfiRange.netherrackSpearID+11, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Copper, "copperNetherrackSpear");
        	bronzeNetherrackSpear = new InfiToolSpear(PropsHelperInfiRange.netherrackSpearID+12, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Bronze, "bronzeNetherrackSpear");
        }
        
        if(PropsHelperInfiRange.enableGlowstoneTools)
        {
        	woodGlowstoneSpear = new InfiToolSpear(PropsHelperInfiRange.glowstoneSpearID+0, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Wood, "woodGlowstoneSpear");
        	redstoneGlowstoneSpear = new InfiToolSpear(PropsHelperInfiRange.glowstoneSpearID+1, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Redstone, "redstoneGlowstoneSpear");
        	obsidianGlowstoneSpear = new InfiToolSpear(PropsHelperInfiRange.glowstoneSpearID+2, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Obsidian, "obsidianGlowstoneSpear");
        	boneGlowstoneSpear = new InfiToolSpear(PropsHelperInfiRange.glowstoneSpearID+3, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Bone, "boneGlowstoneSpear");
        	netherrackGlowstoneSpear = new InfiToolSpear(PropsHelperInfiRange.glowstoneSpearID+4, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Netherrack, "netherrackGlowstoneSpear");
        	glowstoneGlowstoneSpear = new InfiToolSpear(PropsHelperInfiRange.glowstoneSpearID+5, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Glowstone, "glowstoneGlowstoneSpear");
        	iceGlowstoneSpear = new InfiToolSpear(PropsHelperInfiRange.glowstoneSpearID+6, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Ice, "iceGlowstoneSpear");
        	slimeGlowstoneSpear = new InfiToolSpear(PropsHelperInfiRange.glowstoneSpearID+7, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Slime, "slimeGlowstoneSpear");
        	cactusGlowstoneSpear = new InfiToolSpear(PropsHelperInfiRange.glowstoneSpearID+8, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Cactus, "cactusGlowstoneSpear");
        }
        
        if(PropsHelperInfiRange.enableIceTools)
        {
        	woodIceSpear = new InfiToolSpear(PropsHelperInfiRange.iceSpearID+0, 
                    InfiMaterialEnum.Ice, InfiMaterialEnum.Wood, "woodIceSpear");
        	boneIceSpear = new InfiToolSpear(PropsHelperInfiRange.iceSpearID+1, 
                    InfiMaterialEnum.Ice, InfiMaterialEnum.Bone, "boneIceSpear");
        	paperIceSpear = new InfiToolSpear(PropsHelperInfiRange.iceSpearID+2, 
                    InfiMaterialEnum.Ice, InfiMaterialEnum.Paper, "paperIceSpear");
        	iceIceSpear = new InfiToolSpear(PropsHelperInfiRange.iceSpearID+3, 
                    InfiMaterialEnum.Ice, InfiMaterialEnum.Ice, "iceIceSpear");
        	slimeIceSpear = new InfiToolSpear(PropsHelperInfiRange.iceSpearID+4, 
                    InfiMaterialEnum.Ice, InfiMaterialEnum.Slime, "slimeIceSpear");
        	cactusIceSpear = new InfiToolSpear(PropsHelperInfiRange.iceSpearID+5, 
                    InfiMaterialEnum.Ice, InfiMaterialEnum.Cactus, "cactusIceSpear");
        }
        
        if(PropsHelperInfiRange.enableLavaTools)
        {
        	diamondLavaSpear = new InfiToolSpear(PropsHelperInfiRange.lavaSpearID+0, 
                    InfiMaterialEnum.Lava, InfiMaterialEnum.Diamond, "diamondLavaSpear");
        	obsidianLavaSpear = new InfiToolSpear(PropsHelperInfiRange.lavaSpearID+1, 
                    InfiMaterialEnum.Lava, InfiMaterialEnum.Obsidian, "obsidianLavaSpear");
        	netherrackLavaSpear = new InfiToolSpear(PropsHelperInfiRange.lavaSpearID+2, 
                    InfiMaterialEnum.Lava, InfiMaterialEnum.Netherrack, "netherrackLavaSpear");
        	lavaLavaSpear = new InfiToolSpear(PropsHelperInfiRange.lavaSpearID+3, 
                    InfiMaterialEnum.Lava, InfiMaterialEnum.Lava, "lavaLavaSpear");
        	flintLavaSpear = new InfiToolSpear(PropsHelperInfiRange.lavaSpearID+4, 
                    InfiMaterialEnum.Lava, InfiMaterialEnum.Flint, "flintLavaSpear");
        	blazeLavaSpear = new InfiToolSpear(PropsHelperInfiRange.lavaSpearID+5, 
                    InfiMaterialEnum.Lava, InfiMaterialEnum.Blaze, "blazeLavaSpear");
        	manyullynLavaSpear = new InfiToolSpear(PropsHelperInfiRange.lavaSpearID+6, 
                    InfiMaterialEnum.Lava, InfiMaterialEnum.Manyullyn, "manyullynLavaSpear");
            uraniumLavaSpear = new InfiToolSpear(PropsHelperInfiRange.lavaSpearID+7, 
                    InfiMaterialEnum.Lava, InfiMaterialEnum.Uranium, "uraniumLavaSpear");
        }
        
        if(PropsHelperInfiRange.enableSlimeTools)
        {
        	woodSlimeSpear = new InfiToolSpear(PropsHelperInfiRange.slimeSpearID+0, 
                    InfiMaterialEnum.Slime, InfiMaterialEnum.Wood, "woodSlimeSpear");
        	sandstoneSlimeSpear = new InfiToolSpear(PropsHelperInfiRange.slimeSpearID+1, 
                    InfiMaterialEnum.Slime, InfiMaterialEnum.Sandstone, "sandstoneSlimeSpear");
        	boneSlimeSpear = new InfiToolSpear(PropsHelperInfiRange.slimeSpearID+2, 
                    InfiMaterialEnum.Slime, InfiMaterialEnum.Bone, "boneSlimeSpear");
        	paperSlimeSpear = new InfiToolSpear(PropsHelperInfiRange.slimeSpearID+3, 
                    InfiMaterialEnum.Slime, InfiMaterialEnum.Paper, "paperSlimeSpear");
        	slimeSlimeSpear = new InfiToolSpear(PropsHelperInfiRange.slimeSpearID+4, 
                    InfiMaterialEnum.Slime, InfiMaterialEnum.Slime, "slimeSlimeSpear");
        	cactusSlimeSpear = new InfiToolSpear(PropsHelperInfiRange.slimeSpearID+5, 
                    InfiMaterialEnum.Slime, InfiMaterialEnum.Cactus, "cactusSlimeSpear");
        }
        
        if(PropsHelperInfiRange.enableCactusTools)
        {
        	woodCactusSpear = new InfiToolSpear(PropsHelperInfiRange.cactusSpearID+0, 
                    InfiMaterialEnum.Cactus, InfiMaterialEnum.Wood, "woodCactusSpear");
        	sandstoneCactusSpear = new InfiToolSpear(PropsHelperInfiRange.cactusSpearID+1, 
                    InfiMaterialEnum.Cactus, InfiMaterialEnum.Sandstone, "sandstoneCactusSpear");
        	boneCactusSpear = new InfiToolSpear(PropsHelperInfiRange.cactusSpearID+2, 
                    InfiMaterialEnum.Cactus, InfiMaterialEnum.Bone, "boneCactusSpear");
        	netherrackCactusSpear = new InfiToolSpear(PropsHelperInfiRange.cactusSpearID+3, 
                    InfiMaterialEnum.Cactus, InfiMaterialEnum.Netherrack, "netherrackCactusSpear");
        	iceCactusSpear = new InfiToolSpear(PropsHelperInfiRange.cactusSpearID+4, 
                    InfiMaterialEnum.Cactus, InfiMaterialEnum.Ice, "iceCactusSpear");
        	slimeCactusSpear = new InfiToolSpear(PropsHelperInfiRange.cactusSpearID+5, 
                    InfiMaterialEnum.Cactus, InfiMaterialEnum.Slime, "slimeCactusSpear");
        	cactusCactusSpear = new InfiToolSpear(PropsHelperInfiRange.cactusSpearID+6, 
                    InfiMaterialEnum.Cactus, InfiMaterialEnum.Cactus, "cactusCactusSpear");
            
            
            
            
            
            
            
            
        }
        
        if(PropsHelperInfiRange.enableFlintTools)
        {
        	woodFlintSpear = new InfiToolSpear(PropsHelperInfiRange.flintSpearID+0, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Wood, "woodFlintSpear");
        	stoneFlintSpear = new InfiToolSpear(PropsHelperInfiRange.flintSpearID+1, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Stone, "stoneFlintSpear");
        	sandstoneFlintSpear = new InfiToolSpear(PropsHelperInfiRange.flintSpearID+2, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Sandstone, "sandstoneFlintSpear");
        	boneFlintSpear = new InfiToolSpear(PropsHelperInfiRange.flintSpearID+3, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Bone, "boneFlintSpear");
        	netherrackFlintSpear = new InfiToolSpear(PropsHelperInfiRange.flintSpearID+4, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Netherrack, "netherrackFlintSpear");
        	slimeFlintSpear = new InfiToolSpear(PropsHelperInfiRange.flintSpearID+5, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Slime, "slimeFlintSpear");
        	cactusFlintSpear = new InfiToolSpear(PropsHelperInfiRange.flintSpearID+6, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Cactus, "cactusFlintSpear");
        	flintFlintSpear = new InfiToolSpear(PropsHelperInfiRange.flintSpearID+7, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Flint, "flintFlintSpear");
        	copperFlintSpear = new InfiToolSpear(PropsHelperInfiRange.flintSpearID+8, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Copper, "copperFlintSpear");
        	bronzeFlintSpear = new InfiToolSpear(PropsHelperInfiRange.flintSpearID+9, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Bronze, "bronzeFlintSpear");
        }
        
        if(PropsHelperInfiRange.enableBlazeTools)
        {
        	diamondBlazeSpear = new InfiToolSpear(PropsHelperInfiRange.blazeSpearID+0, 
                    InfiMaterialEnum.Blaze, InfiMaterialEnum.Diamond, "diamondBlazeSpear");
        	obsidianBlazeSpear = new InfiToolSpear(PropsHelperInfiRange.blazeSpearID+1, 
                    InfiMaterialEnum.Blaze, InfiMaterialEnum.Obsidian, "obsidianBlazeSpear");
        	netherrackBlazeSpear = new InfiToolSpear(PropsHelperInfiRange.blazeSpearID+2, 
                    InfiMaterialEnum.Blaze, InfiMaterialEnum.Netherrack, "netherrackBlazeSpear");
        	lavaBlazeSpear = new InfiToolSpear(PropsHelperInfiRange.blazeSpearID+3, 
                    InfiMaterialEnum.Blaze, InfiMaterialEnum.Lava, "lavaBlazeSpear");
        	flintBlazeSpear = new InfiToolSpear(PropsHelperInfiRange.blazeSpearID+4, 
                    InfiMaterialEnum.Blaze, InfiMaterialEnum.Flint, "flintBlazeSpear");
        	blazeBlazeSpear = new InfiToolSpear(PropsHelperInfiRange.blazeSpearID+5, 
                    InfiMaterialEnum.Blaze, InfiMaterialEnum.Blaze, "blazeBlazeSpear");
        	manyullynBlazeSpear = new InfiToolSpear(PropsHelperInfiRange.blazeSpearID+6, 
                    InfiMaterialEnum.Blaze, InfiMaterialEnum.Manyullyn, "manyullynBlazeSpear");
            uraniumBlazeSpear = new InfiToolSpear(PropsHelperInfiRange.blazeSpearID+7, 
                    InfiMaterialEnum.Blaze, InfiMaterialEnum.Uranium, "uraniumBlazeSpear");
        }
    	
        if(PropsHelperInfiRange.enableCopperTools)
        {
        	woodCopperSpear = new InfiToolSpear(PropsHelperInfiRange.copperSpearID+0, 
                    InfiMaterialEnum.Copper, InfiMaterialEnum.Wood, "woodCopperSpear");
            stoneCopperSpear = new InfiToolSpear(PropsHelperInfiRange.copperSpearID+1, 
                    InfiMaterialEnum.Copper, InfiMaterialEnum.Stone, "stoneCopperSpear");
            boneCopperSpear = new InfiToolSpear(PropsHelperInfiRange.copperSpearID+2, 
                    InfiMaterialEnum.Copper, InfiMaterialEnum.Bone, "boneCopperSpear");
            netherrackCopperSpear = new InfiToolSpear(PropsHelperInfiRange.copperSpearID+3, 
                    InfiMaterialEnum.Copper, InfiMaterialEnum.Netherrack, "netherrackCopperSpear");
            slimeCopperSpear = new InfiToolSpear(PropsHelperInfiRange.copperSpearID+4, 
                    InfiMaterialEnum.Copper, InfiMaterialEnum.Slime, "slimeCopperSpear");
            cactusCopperSpear = new InfiToolSpear(PropsHelperInfiRange.copperSpearID+5, 
                    InfiMaterialEnum.Copper, InfiMaterialEnum.Cactus, "cactusCopperSpear");
            flintCopperSpear = new InfiToolSpear(PropsHelperInfiRange.copperSpearID+6, 
                    InfiMaterialEnum.Copper, InfiMaterialEnum.Flint, "flintCopperSpear");
            copperCopperSpear = new InfiToolSpear(PropsHelperInfiRange.copperSpearID+7, 
                    InfiMaterialEnum.Copper, InfiMaterialEnum.Copper, "copperCopperSpear");
        }
        
        if(PropsHelperInfiRange.enableBronzeTools)
        {
        	woodBronzeSpear = new InfiToolSpear(PropsHelperInfiRange.bronzeSpearID+0, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Wood, "woodBronzeSpear");
            stoneBronzeSpear = new InfiToolSpear(PropsHelperInfiRange.bronzeSpearID+1, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Stone, "stoneBronzeSpear");
            boneBronzeSpear = new InfiToolSpear(PropsHelperInfiRange.bronzeSpearID+2, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Bone, "boneBronzeSpear");
            netherrackBronzeSpear = new InfiToolSpear(PropsHelperInfiRange.bronzeSpearID+3, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Netherrack, "netherrackBronzeSpear");
            slimeBronzeSpear = new InfiToolSpear(PropsHelperInfiRange.bronzeSpearID+4, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Slime, "slimeBronzeSpear");
            cactusBronzeSpear = new InfiToolSpear(PropsHelperInfiRange.bronzeSpearID+5, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Cactus, "cactusBronzeSpear");
            flintBronzeSpear = new InfiToolSpear(PropsHelperInfiRange.bronzeSpearID+6, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Flint, "flintBronzeSpear");
            copperBronzeSpear = new InfiToolSpear(PropsHelperInfiRange.bronzeSpearID+7, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Copper, "copperBronzeSpear");
            bronzeBronzeSpear = new InfiToolSpear(PropsHelperInfiRange.bronzeSpearID+8, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Bronze, "copperBronzeSpear");
        }
        
        if(PropsHelperInfiRange.enableWorkedIronTools)
        {
        	woodWorkedIronSpear = new InfiToolSpear(PropsHelperInfiRange.workedIronSpearID+0, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Wood, "woodWorkedIronSpear");
            stoneWorkedIronSpear = new InfiToolSpear(PropsHelperInfiRange.workedIronSpearID+1, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Stone, "stoneWorkedIronSpear");
            ironWorkedIronSpear = new InfiToolSpear(PropsHelperInfiRange.workedIronSpearID+2,
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Iron, "ironWorkedIronSpear");
            diamondWorkedIronSpear = new InfiToolSpear(PropsHelperInfiRange.workedIronSpearID+3, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Diamond, "diamondWorkedIronSpear");
            redstoneWorkedIronSpear = new InfiToolSpear(PropsHelperInfiRange.workedIronSpearID+4, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Redstone, "redstoneWorkedIronSpear");
            obsidianWorkedIronSpear = new InfiToolSpear(PropsHelperInfiRange.workedIronSpearID+5, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Obsidian, "obsidianWorkedIronSpear");
            boneWorkedIronSpear = new InfiToolSpear(PropsHelperInfiRange.workedIronSpearID+6, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Bone, "boneWorkedIronSpear");
            netherrackWorkedIronSpear = new InfiToolSpear(PropsHelperInfiRange.workedIronSpearID+7, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Netherrack, "netherrackWorkedIronSpear");
            glowstoneWorkedIronSpear = new InfiToolSpear(PropsHelperInfiRange.workedIronSpearID+8, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Glowstone, "glowstoneWorkedIronSpear");
            iceWorkedIronSpear = new InfiToolSpear(PropsHelperInfiRange.workedIronSpearID+9, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Ice, "iceWorkedIronSpear");
            slimeWorkedIronSpear = new InfiToolSpear(PropsHelperInfiRange.workedIronSpearID+10, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Slime, "slimeWorkedIronSpear");
            cactusWorkedIronSpear = new InfiToolSpear(PropsHelperInfiRange.workedIronSpearID+11, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Cactus, "cactusWorkedIronSpear");
            blazeWorkedIronSpear = new InfiToolSpear(PropsHelperInfiRange.workedIronSpearID+12, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Blaze, "blazeWorkedIronSpear");
            copperWorkedIronSpear = new InfiToolSpear(PropsHelperInfiRange.workedIronSpearID+13, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Copper, "copperWorkedIronSpear");
            bronzeWorkedIronSpear = new InfiToolSpear(PropsHelperInfiRange.workedIronSpearID+14, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Bronze, "bronzeWorkedIronSpear");
            workedWorkedIronSpear = new InfiToolSpear(PropsHelperInfiRange.workedIronSpearID+15, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.WorkedIron, "workedWorkedIronSpear");
            steelWorkedIronSpear = new InfiToolSpear(PropsHelperInfiRange.workedIronSpearID+16, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Steel, "steelWorkedIronSpear");
            uraniumWorkedIronSpear = new InfiToolSpear(PropsHelperInfiRange.workedIronSpearID+17, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Uranium, "uraniumWorkedIronSpear");
        }
        
        if(PropsHelperInfiRange.enableSteelTools)
        {
        	woodSteelSpear = new InfiToolSpear(PropsHelperInfiRange.steelSpearID+0, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Wood, "woodSteelSpear");
            stoneSteelSpear = new InfiToolSpear(PropsHelperInfiRange.steelSpearID+1, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Stone, "stoneSteelSpear");
            ironSteelSpear = new InfiToolSpear(PropsHelperInfiRange.steelSpearID+2, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Iron, "ironSteelSpear");
            diamondSteelSpear = new InfiToolSpear(PropsHelperInfiRange.steelSpearID+3, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Diamond, "diamondSteelSpear");
            redstoneSteelSpear = new InfiToolSpear(PropsHelperInfiRange.steelSpearID+4, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Redstone, "redstoneSteelSpear");
            obsidianSteelSpear = new InfiToolSpear(PropsHelperInfiRange.steelSpearID+5, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Obsidian, "obsidianSteelSpear");
            boneSteelSpear = new InfiToolSpear(PropsHelperInfiRange.steelSpearID+6, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Bone, "boneSteelSpear");
            netherrackSteelSpear = new InfiToolSpear(PropsHelperInfiRange.steelSpearID+7, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Netherrack, "netherrackSteelSpear");
            glowstoneSteelSpear = new InfiToolSpear(PropsHelperInfiRange.steelSpearID+8, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Glowstone, "glowstoneSteelSpear");
            iceSteelSpear = new InfiToolSpear(PropsHelperInfiRange.steelSpearID+9, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Ice, "iceSteelSpear");
            slimeSteelSpear = new InfiToolSpear(PropsHelperInfiRange.steelSpearID+10, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Slime, "slimeSteelSpear");
            cactusSteelSpear = new InfiToolSpear(PropsHelperInfiRange.steelSpearID+11, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Cactus, "cactusSteelSpear");
            blazeSteelSpear = new InfiToolSpear(PropsHelperInfiRange.steelSpearID+12, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Blaze, "blazeSteelSpear");
            copperSteelSpear = new InfiToolSpear(PropsHelperInfiRange.steelSpearID+13, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Copper, "copperSteelSpear");
            bronzeSteelSpear = new InfiToolSpear(PropsHelperInfiRange.steelSpearID+14, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Bronze, "bronzeSteelSpear");
            workedSteelSpear = new InfiToolSpear(PropsHelperInfiRange.steelSpearID+15, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.WorkedIron, "workedSteelSpear");
            steelSteelSpear = new InfiToolSpear(PropsHelperInfiRange.steelSpearID+16, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Steel, "steelSteelSpear");
            cobaltSteelSpear = new InfiToolSpear(PropsHelperInfiRange.steelSpearID+17, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Cobalt, "cobaltSteelSpear");
            arditeSteelSpear = new InfiToolSpear(PropsHelperInfiRange.steelSpearID+18, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Ardite, "arditeSteelSpear");
            uraniumSteelSpear = new InfiToolSpear(PropsHelperInfiRange.steelSpearID+19, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Uranium, "uraniumSteelSpear");
        }
        
        if(PropsHelperInfiRange.enableCobaltTools)
        {
        	woodCobaltSpear = new InfiToolSpear(PropsHelperInfiRange.cobaltSpearID+0, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Wood, "woodCobaltSpear");
            stoneCobaltSpear = new InfiToolSpear(PropsHelperInfiRange.cobaltSpearID+1, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Stone, "stoneCobaltSpear");
            ironCobaltSpear = new InfiToolSpear(PropsHelperInfiRange.cobaltSpearID+2, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Iron, "ironCobaltSpear");
            diamondCobaltSpear = new InfiToolSpear(PropsHelperInfiRange.cobaltSpearID+3,
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Diamond, "diamondCobaltSpear");
            redstoneCobaltSpear = new InfiToolSpear(PropsHelperInfiRange.cobaltSpearID+4, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Redstone, "redstoneCobaltSpear");
            obsidianCobaltSpear = new InfiToolSpear(PropsHelperInfiRange.cobaltSpearID+5, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Obsidian, "obsidianCobaltSpear");
            boneCobaltSpear = new InfiToolSpear(PropsHelperInfiRange.cobaltSpearID+6, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Bone, "boneCobaltSpear");
            slimeCobaltSpear = new InfiToolSpear(PropsHelperInfiRange.cobaltSpearID+7, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Slime, "slimeCobaltSpear");
            cactusCobaltSpear = new InfiToolSpear(PropsHelperInfiRange.cobaltSpearID+8, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Cactus, "cactusCobaltSpear");
            blazeCobaltSpear = new InfiToolSpear(PropsHelperInfiRange.cobaltSpearID+9, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Blaze, "blazeCobaltSpear");
            copperCobaltSpear = new InfiToolSpear(PropsHelperInfiRange.cobaltSpearID+10, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Copper, "copperCobaltSpear");
            bronzeCobaltSpear = new InfiToolSpear(PropsHelperInfiRange.cobaltSpearID+11, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Bronze, "bronzeCobaltSpear");
            workedCobaltSpear = new InfiToolSpear(PropsHelperInfiRange.cobaltSpearID+12, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.WorkedIron, "workedCobaltSpear");
            steelCobaltSpear = new InfiToolSpear(PropsHelperInfiRange.cobaltSpearID+13, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Steel, "steelCobaltSpear");
            cobaltCobaltSpear = new InfiToolSpear(PropsHelperInfiRange.cobaltSpearID+14, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Cobalt, "cobaltCobaltSpear");
            arditeCobaltSpear = new InfiToolSpear(PropsHelperInfiRange.cobaltSpearID+15, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Ardite, "arditeCobaltSpear");
            manyullynCobaltSpear = new InfiToolSpear(PropsHelperInfiRange.cobaltSpearID+16, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Manyullyn, "arditeCobaltSpear");
            uraniumCobaltSpear = new InfiToolSpear(PropsHelperInfiRange.cobaltSpearID+17, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Uranium, "uraniumCobaltSpear");
        }
        
        if(PropsHelperInfiRange.enableArditeTools)
        {
        	woodArditeSpear = new InfiToolSpear(PropsHelperInfiRange.arditeSpearID+0, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Wood, "woodArditeSpear");
            stoneArditeSpear = new InfiToolSpear(PropsHelperInfiRange.arditeSpearID+1, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Stone, "stoneArditeSpear");
            ironArditeSpear = new InfiToolSpear(PropsHelperInfiRange.arditeSpearID+2, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Iron, "ironArditeSpear");
            diamondArditeSpear = new InfiToolSpear(PropsHelperInfiRange.arditeSpearID+3,
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Diamond, "diamondArditeSpear");
            redstoneArditeSpear = new InfiToolSpear(PropsHelperInfiRange.arditeSpearID+4, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Redstone, "redstoneArditeSpear");
            obsidianArditeSpear = new InfiToolSpear(PropsHelperInfiRange.arditeSpearID+5, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Obsidian, "obsidianArditeSpear");
            boneArditeSpear = new InfiToolSpear(PropsHelperInfiRange.arditeSpearID+6,
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Bone, "boneArditeSpear");
            slimeArditeSpear = new InfiToolSpear(PropsHelperInfiRange.arditeSpearID+7, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Slime, "slimeArditeSpear");
            cactusArditeSpear = new InfiToolSpear(PropsHelperInfiRange.arditeSpearID+8, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Cactus, "cactusArditeSpear");
            blazeArditeSpear = new InfiToolSpear(PropsHelperInfiRange.arditeSpearID+9, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Blaze, "blazeArditeSpear");
            copperArditeSpear = new InfiToolSpear(PropsHelperInfiRange.arditeSpearID+10, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Copper, "copperArditeSpear");
            bronzeArditeSpear = new InfiToolSpear(PropsHelperInfiRange.arditeSpearID+11, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Bronze, "bronzeArditeSpear");
            workedArditeSpear = new InfiToolSpear(PropsHelperInfiRange.arditeSpearID+12, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.WorkedIron, "workedArditeSpear");
            steelArditeSpear = new InfiToolSpear(PropsHelperInfiRange.arditeSpearID+13, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Steel, "steelArditeSpear");
            cobaltArditeSpear = new InfiToolSpear(PropsHelperInfiRange.arditeSpearID+14, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Cobalt, "cobaltArditeSpear");
            arditeArditeSpear = new InfiToolSpear(PropsHelperInfiRange.arditeSpearID+15, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Ardite, "arditeArditeSpear");
            manyullynArditeSpear = new InfiToolSpear(PropsHelperInfiRange.arditeSpearID+16, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Manyullyn, "arditeArditeSpear");
            uraniumArditeSpear = new InfiToolSpear(PropsHelperInfiRange.arditeSpearID+17, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Uranium, "uraniumArditeSpear");
        }
        
        if(PropsHelperInfiRange.enableManyullynTools)
        {
        	woodManyullynSpear = new InfiToolSpear(PropsHelperInfiRange.manyullynSpearID+0, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Wood, "woodManyullynSpear");
            stoneManyullynSpear = new InfiToolSpear(PropsHelperInfiRange.manyullynSpearID+1, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Stone, "stoneManyullynSpear");
            ironManyullynSpear = new InfiToolSpear(PropsHelperInfiRange.manyullynSpearID+2, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Iron, "ironManyullynSpear");
            diamondManyullynSpear = new InfiToolSpear(PropsHelperInfiRange.manyullynSpearID+3,
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Diamond, "diamondManyullynSpear");
            redstoneManyullynSpear = new InfiToolSpear(PropsHelperInfiRange.manyullynSpearID+4, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Redstone, "redstoneManyullynSpear");
            obsidianManyullynSpear = new InfiToolSpear(PropsHelperInfiRange.manyullynSpearID+5, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Obsidian, "obsidianManyullynSpear");
            boneManyullynSpear = new InfiToolSpear(PropsHelperInfiRange.manyullynSpearID+6, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Bone, "boneManyullynSpear");
            slimeManyullynSpear = new InfiToolSpear(PropsHelperInfiRange.manyullynSpearID+7, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Slime, "slimeManyullynSpear");
            cactusManyullynSpear = new InfiToolSpear(PropsHelperInfiRange.manyullynSpearID+8, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Cactus, "cactusManyullynSpear");
            blazeManyullynSpear = new InfiToolSpear(PropsHelperInfiRange.manyullynSpearID+9, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Blaze, "blazeManyullynSpear");
            copperManyullynSpear = new InfiToolSpear(PropsHelperInfiRange.manyullynSpearID+10, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Copper, "copperManyullynSpear");
            bronzeManyullynSpear = new InfiToolSpear(PropsHelperInfiRange.manyullynSpearID+11, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Bronze, "bronzeManyullynSpear");
            workedManyullynSpear = new InfiToolSpear(PropsHelperInfiRange.manyullynSpearID+12, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.WorkedIron, "workedManyullynSpear");
            steelManyullynSpear = new InfiToolSpear(PropsHelperInfiRange.manyullynSpearID+13, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Steel, "steelManyullynSpear");
            cobaltManyullynSpear = new InfiToolSpear(PropsHelperInfiRange.manyullynSpearID+14, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Cobalt, "cobaltManyullynSpear");
            arditeManyullynSpear = new InfiToolSpear(PropsHelperInfiRange.manyullynSpearID+15, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Ardite, "arditeManyullynSpear");
            manyullynManyullynSpear = new InfiToolSpear(PropsHelperInfiRange.manyullynSpearID+16, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Manyullyn, "arditeManyullynSpear");
            uraniumManyullynSpear = new InfiToolSpear(PropsHelperInfiRange.manyullynSpearID+17,
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Bronze, "uraniumManyullynSpear");
        }
        
        if(PropsHelperInfiRange.enableUraniumTools)
        {
            diamondUraniumSpear = new InfiToolSpear(PropsHelperInfiRange.uraniumSpearID+0, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Diamond, "diamondUraniumSpear");
            redstoneUraniumSpear = new InfiToolSpear(PropsHelperInfiRange.uraniumSpearID+1, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Redstone, "redstoneUraniumSpear");
            boneUraniumSpear = new InfiToolSpear(PropsHelperInfiRange.uraniumSpearID+2, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Bone, "boneUraniumSpear");
            netherrackUraniumSpear = new InfiToolSpear(PropsHelperInfiRange.uraniumSpearID+3, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Netherrack, "netherrackUraniumSpear");
            glowstoneUraniumSpear = new InfiToolSpear(PropsHelperInfiRange.uraniumSpearID+4, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Glowstone, "glowstoneUraniumSpear");
            lavaUraniumSpear = new InfiToolSpear(PropsHelperInfiRange.uraniumSpearID+5, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Lava, "lavaUraniumSpear");
            blazeUraniumSpear = new InfiToolSpear(PropsHelperInfiRange.uraniumSpearID+6, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Blaze, "blazeUraniumSpear");
            cobaltUraniumSpear = new InfiToolSpear(PropsHelperInfiRange.uraniumSpearID+7, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Cobalt, "cobaltUraniumSpear");
            arditeUraniumSpear = new InfiToolSpear(PropsHelperInfiRange.uraniumSpearID+8, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Ardite, "arditeUraniumSpear");
            uraniumUraniumSpear = new InfiToolSpear(PropsHelperInfiRange.uraniumSpearID+9, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Uranium, "uraniumUraniumSpear");
        }
    }
    
    private static void addNames()
    {
    	ModLoader.addName(woodWoodSpear, "Wooden Spear");
    	ModLoader.addName(stoneStoneSpear, "Heavy Spear");
    	ModLoader.addName(ironIronSpear, "Ironic Spear");
    	ModLoader.addName(diamondDiamondSpear, "Diamondium Spear");
    	ModLoader.addName(redstoneRedstoneSpear, "Redredred Spear");
    	ModLoader.addName(obsidianObsidianSpear, "Ebony Spear");
    	ModLoader.addName(sandstoneSandstoneSpear, "Fragile Spear");
    	ModLoader.addName(boneBoneSpear, "Necrotic Spear");
    	ModLoader.addName(paperPaperSpear, "Soft Spear");
    	ModLoader.addName(mossyMossySpear, "Living Spear");
    	ModLoader.addName(netherrackNetherrackSpear, "Blood Spear");
    	ModLoader.addName(glowstoneGlowstoneSpear, "Bright Spear");
    	ModLoader.addName(iceIceSpear, "Freezing Spear");
    	ModLoader.addName(lavaLavaSpear, "Burning Spear");
    	ModLoader.addName(slimeSlimeSpear, "Toy Spear");
    	ModLoader.addName(cactusCactusSpear, "Thorned Spear");
    	ModLoader.addName(flintFlintSpear, "Rough-hewn Spear");
    	ModLoader.addName(blazeBlazeSpear, "Netherite Spear");
        ModLoader.addName(copperCopperSpear, "Orange-Tang Spear");
        ModLoader.addName(bronzeBronzeSpear, "Polished Spear");
        ModLoader.addName(workedWorkedIronSpear, "Reworked Iron Spear");
        ModLoader.addName(steelSteelSpear, "Forge-Wrought Spear");
        ModLoader.addName(cobaltCobaltSpear, "Beautiful Spear");
        ModLoader.addName(arditeArditeSpear, "Rustic StoneDigger");
        ModLoader.addName(manyullynManyullynSpear, "False-Prophetic Spear");
        ModLoader.addName(uraniumUraniumSpear, "Cancerous Spear");
    }
    
    public static void registerInfiToolsRecipes()
    {
    	if(PropsHelperInfiRange.enableWoodTools)
        {
            ModLoader.addRecipe(new ItemStack(woodWoodSpear), new Object[] 
                    { recipe, '#', Block.planks, '|', Item.stick });
            ModLoader.addRecipe(new ItemStack(sandstoneWoodSpear), new Object[] 
                    { recipe, '#', Block.planks, '|', mod_InfiBase.sandstoneRod });
            ModLoader.addRecipe(new ItemStack(boneWoodSpear), new Object[] 
                    { recipe, '#', Block.planks, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneWoodSpear), new Object[] 
                    { recipe, '#', Block.planks, '|', mod_InfiBase.boneRod });
            ModLoader.addRecipe(new ItemStack(paperWoodSpear), new Object[] 
                    { recipe, '#', Block.planks, '|', mod_InfiBase.paperRod });
            ModLoader.addRecipe(new ItemStack(iceWoodSpear), new Object[] 
                    { recipe, '#', Block.planks, '|', mod_InfiBase.iceRod });
            ModLoader.addRecipe(new ItemStack(slimeWoodSpear), new Object[] 
                    { recipe, '#', Block.planks, '|', mod_InfiBase.slimeRod });
            ModLoader.addRecipe(new ItemStack(cactusWoodSpear), new Object[] 
                    { recipe, '#', Block.planks, '|', mod_InfiBase.cactusRod });
        }
    	
        if(PropsHelperInfiRange.enableStoneTools)
        {
        	ModLoader.addRecipe(new ItemStack(woodStoneSpear), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', Item.stick });
        	ModLoader.addRecipe(new ItemStack(stoneStoneSpear), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', mod_InfiBase.stoneRod });
            ModLoader.addRecipe(new ItemStack(sandstoneStoneSpear), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', mod_InfiBase.sandstoneRod });
            ModLoader.addRecipe(new ItemStack(boneStoneSpear), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneStoneSpear), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', mod_InfiBase.boneRod });
            ModLoader.addRecipe(new ItemStack(netherrackStoneSpear), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', mod_InfiBase.netherrackRod });
            ModLoader.addRecipe(new ItemStack(iceStoneSpear), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', mod_InfiBase.iceRod });
            ModLoader.addRecipe(new ItemStack(slimeStoneSpear), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', mod_InfiBase.slimeRod });
            ModLoader.addRecipe(new ItemStack(cactusStoneSpear), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', mod_InfiBase.cactusRod });
            ModLoader.addRecipe(new ItemStack(flintStoneSpear), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', mod_InfiBase.flintRod });
            
            ModLoader.addRecipe(new ItemStack(woodStoneSpear), new Object[] 
                    { recipe, '#', Block.stone, '|', Item.stick });
        	ModLoader.addRecipe(new ItemStack(stoneStoneSpear), new Object[] 
                    { recipe, '#', Block.stone, '|', mod_InfiBase.stoneRod });
            ModLoader.addRecipe(new ItemStack(sandstoneStoneSpear), new Object[] 
                    { recipe, '#', Block.stone, '|', mod_InfiBase.sandstoneRod });
            ModLoader.addRecipe(new ItemStack(boneStoneSpear), new Object[] 
                    { recipe, '#', Block.stone, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneStoneSpear), new Object[] 
                    { recipe, '#', Block.stone, '|', mod_InfiBase.boneRod });
            ModLoader.addRecipe(new ItemStack(netherrackStoneSpear), new Object[] 
                    { recipe, '#', Block.stone, '|', mod_InfiBase.netherrackRod });
            ModLoader.addRecipe(new ItemStack(iceStoneSpear), new Object[] 
                    { recipe, '#', Block.stone, '|', mod_InfiBase.iceRod });
            ModLoader.addRecipe(new ItemStack(slimeStoneSpear), new Object[] 
                    { recipe, '#', Block.stone, '|', mod_InfiBase.slimeRod });
            ModLoader.addRecipe(new ItemStack(cactusStoneSpear), new Object[] 
                    { recipe, '#', Block.stone, '|', mod_InfiBase.cactusRod });
            ModLoader.addRecipe(new ItemStack(flintStoneSpear), new Object[] 
                    { recipe, '#', Block.stone, '|', mod_InfiBase.flintRod });
        }
        
        if(PropsHelperInfiRange.enableIronTools)
        {
        	ModLoader.addRecipe(new ItemStack(woodIronSpear), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', Item.stick });
        	ModLoader.addRecipe(new ItemStack(stoneIronSpear), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', mod_InfiBase.stoneRod });
            ModLoader.addRecipe(new ItemStack(ironIronSpear), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', mod_InfiBase.ironRod });
            ModLoader.addRecipe(new ItemStack(boneIronSpear), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneIronSpear), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', mod_InfiBase.boneRod });
            ModLoader.addRecipe(new ItemStack(netherrackIronSpear), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', mod_InfiBase.netherrackRod });
            ModLoader.addRecipe(new ItemStack(glowstoneIronSpear), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', mod_InfiBase.glowstoneRod });
            ModLoader.addRecipe(new ItemStack(cactusIronSpear), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', mod_InfiBase.cactusRod });
            ModLoader.addRecipe(new ItemStack(copperIronSpear), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', mod_InfiBase.copperRod });
            ModLoader.addRecipe(new ItemStack(bronzeIronSpear), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', mod_InfiBase.bronzeRod });
        }
        
        if(PropsHelperInfiRange.enableDiamondTools)
        {
        	ModLoader.addRecipe(new ItemStack(woodDiamondSpear), new Object[] 
                    { recipe, '#', Item.diamond, '|', Item.stick });
        	ModLoader.addRecipe(new ItemStack(stoneDiamondSpear), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.stoneRod });
            ModLoader.addRecipe(new ItemStack(ironDiamondSpear), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.ironRod });
            ModLoader.addRecipe(new ItemStack(diamondDiamondSpear), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.diamondRod });
            ModLoader.addRecipe(new ItemStack(redstoneDiamondSpear), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.redstoneRod });
            ModLoader.addRecipe(new ItemStack(obsidianDiamondSpear), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.obsidianRod });
            ModLoader.addRecipe(new ItemStack(boneDiamondSpear), new Object[] 
                    { recipe, '#', Item.diamond, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneDiamondSpear), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.boneRod });
            ModLoader.addRecipe(new ItemStack(mossyDiamondSpear), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.mossyRod });
            ModLoader.addRecipe(new ItemStack(netherrackDiamondSpear), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.netherrackRod });
            ModLoader.addRecipe(new ItemStack(glowstoneDiamondSpear), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.glowstoneRod });
            ModLoader.addRecipe(new ItemStack(lavaDiamondSpear), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.lavaRod });
            ModLoader.addRecipe(new ItemStack(cactusDiamondSpear), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.cactusRod });
            ModLoader.addRecipe(new ItemStack(flintDiamondSpear), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.flintRod });
            ModLoader.addRecipe(new ItemStack(blazeDiamondSpear), new Object[] 
                    { recipe, '#', Item.diamond, '|', Item.blazeRod });
            ModLoader.addRecipe(new ItemStack(copperDiamondSpear), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.copperRod });
            ModLoader.addRecipe(new ItemStack(bronzeDiamondSpear), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.bronzeRod });
            ModLoader.addRecipe(new ItemStack(workedDiamondSpear), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.workedIronRod });
            ModLoader.addRecipe(new ItemStack(steelDiamondSpear), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.steelRod });
            ModLoader.addRecipe(new ItemStack(cobaltDiamondSpear), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.cobaltRod });
            ModLoader.addRecipe(new ItemStack(arditeDiamondSpear), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.arditeRod });
            ModLoader.addRecipe(new ItemStack(manyullynDiamondSpear), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.manyullynRod });
            ModLoader.addRecipe(new ItemStack(uraniumDiamondSpear), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.uraniumRod });
        }
        
        if(PropsHelperInfiRange.enableRedstoneTools)
        {
        	ModLoader.addRecipe(new ItemStack(woodRedstoneSpear), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', Item.stick });
        	ModLoader.addRecipe(new ItemStack(stoneRedstoneSpear), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.stoneRod });
            ModLoader.addRecipe(new ItemStack(ironRedstoneSpear), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.ironRod });
            ModLoader.addRecipe(new ItemStack(redstoneRedstoneSpear), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.redstoneRod });
            ModLoader.addRecipe(new ItemStack(obsidianRedstoneSpear), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.obsidianRod });
            ModLoader.addRecipe(new ItemStack(sandstoneRedstoneSpear), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.sandstoneRod });
            ModLoader.addRecipe(new ItemStack(boneRedstoneSpear), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneRedstoneSpear), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.boneRod });
            ModLoader.addRecipe(new ItemStack(paperRedstoneSpear), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.paperRod });
            ModLoader.addRecipe(new ItemStack(mossyRedstoneSpear), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.mossyRod });
            ModLoader.addRecipe(new ItemStack(netherrackRedstoneSpear), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.netherrackRod });
            ModLoader.addRecipe(new ItemStack(glowstoneRedstoneSpear), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.glowstoneRod });
            ModLoader.addRecipe(new ItemStack(iceRedstoneSpear), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.iceRod });
            ModLoader.addRecipe(new ItemStack(lavaRedstoneSpear), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.lavaRod });
            ModLoader.addRecipe(new ItemStack(slimeRedstoneSpear), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.slimeRod });
            ModLoader.addRecipe(new ItemStack(cactusRedstoneSpear), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.cactusRod });
            ModLoader.addRecipe(new ItemStack(flintRedstoneSpear), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.flintRod });
            ModLoader.addRecipe(new ItemStack(copperRedstoneSpear), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.copperRod });
            ModLoader.addRecipe(new ItemStack(bronzeRedstoneSpear), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.bronzeRod });
            ModLoader.addRecipe(new ItemStack(workedRedstoneSpear), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.workedIronRod });
            ModLoader.addRecipe(new ItemStack(uraniumRedstoneSpear), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.uraniumRod });
        }
        
        if(PropsHelperInfiRange.enableObsidianTools)
        {
        	ModLoader.addRecipe(new ItemStack(woodObsidianSpear), new Object[] 
                    { recipe, '#', Block.obsidian, '|', Item.stick });
        	ModLoader.addRecipe(new ItemStack(stoneObsidianSpear), new Object[] 
                    { recipe, '#', Block.obsidian, '|', mod_InfiBase.stoneRod });
            ModLoader.addRecipe(new ItemStack(redstoneObsidianSpear), new Object[] 
                    { recipe, '#', Block.obsidian, '|', mod_InfiBase.redstoneRod });
            ModLoader.addRecipe(new ItemStack(obsidianObsidianSpear), new Object[] 
                    { recipe, '#', Block.obsidian, '|', mod_InfiBase.obsidianRod });
            ModLoader.addRecipe(new ItemStack(boneObsidianSpear), new Object[] 
                    { recipe, '#', Block.obsidian, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneObsidianSpear), new Object[] 
                    { recipe, '#', Block.obsidian, '|', mod_InfiBase.boneRod });
            ModLoader.addRecipe(new ItemStack(netherrackObsidianSpear), new Object[] 
                    { recipe, '#', Block.obsidian, '|', mod_InfiBase.netherrackRod });
            ModLoader.addRecipe(new ItemStack(glowstoneObsidianSpear), new Object[] 
                    { recipe, '#', Block.obsidian, '|', mod_InfiBase.glowstoneRod });
            ModLoader.addRecipe(new ItemStack(iceObsidianSpear), new Object[] 
                    { recipe, '#', Block.obsidian, '|', mod_InfiBase.iceRod });
            ModLoader.addRecipe(new ItemStack(lavaObsidianSpear), new Object[] 
                    { recipe, '#', Block.obsidian, '|', mod_InfiBase.lavaRod });
            ModLoader.addRecipe(new ItemStack(cactusObsidianSpear), new Object[] 
                    { recipe, '#', Block.obsidian, '|', mod_InfiBase.cactusRod });
        }
        
        if(PropsHelperInfiRange.enableSandstoneTools)
        {
            ModLoader.addRecipe(new ItemStack(woodSandstoneSpear), new Object[] 
                    { recipe, '#', Block.sandStone, '|', Item.stick });
            ModLoader.addRecipe(new ItemStack(sandstoneSandstoneSpear), new Object[] 
                    { recipe, '#', Block.sandStone, '|', mod_InfiBase.sandstoneRod });
            ModLoader.addRecipe(new ItemStack(boneSandstoneSpear), new Object[] 
                    { recipe, '#', Block.sandStone, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneSandstoneSpear), new Object[] 
                    { recipe, '#', Block.sandStone, '|', mod_InfiBase.boneRod });      
            ModLoader.addRecipe(new ItemStack(netherrackSandstoneSpear), new Object[] 
                    { recipe, '#', Block.sandStone, '|', mod_InfiBase.netherrackRod });
            ModLoader.addRecipe(new ItemStack(iceSandstoneSpear), new Object[] 
                    { recipe, '#', Block.sandStone, '|', mod_InfiBase.iceRod });
            ModLoader.addRecipe(new ItemStack(slimeSandstoneSpear), new Object[] 
                    { recipe, '#', Block.sandStone, '|', mod_InfiBase.slimeRod });
            ModLoader.addRecipe(new ItemStack(cactusSandstoneSpear), new Object[] 
                    { recipe, '#', Block.sandStone, '|', mod_InfiBase.cactusRod });
            ModLoader.addRecipe(new ItemStack(flintSandstoneSpear), new Object[] 
                    { recipe, '#', Block.sandStone, '|', mod_InfiBase.flintRod });
        }
        
        if(PropsHelperInfiRange.enableBoneTools)
        {
            ModLoader.addRecipe(new ItemStack(woodBoneSpear), new Object[] 
                    { recipe, '#', Item.bone, '|', Item.stick });
            ModLoader.addRecipe(new ItemStack(stoneBoneSpear), new Object[] 
                    { recipe, '#', Item.bone, '|', mod_InfiBase.stoneRod });
            ModLoader.addRecipe(new ItemStack(sandstoneBoneSpear), new Object[] 
                    { recipe, '#', Item.bone, '|', mod_InfiBase.sandstoneRod });
            ModLoader.addRecipe(new ItemStack(boneBoneSpear), new Object[] 
                    { recipe, '#', Item.bone, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneBoneSpear), new Object[] 
                    { recipe, '#', Item.bone, '|', mod_InfiBase.boneRod });
            ModLoader.addRecipe(new ItemStack(paperBoneSpear), new Object[] 
                    { recipe, '#', Item.bone, '|', mod_InfiBase.paperRod });
            ModLoader.addRecipe(new ItemStack(netherrackBoneSpear), new Object[] 
                    { recipe, '#', Item.bone, '|', mod_InfiBase.netherrackRod });
            ModLoader.addRecipe(new ItemStack(iceBoneSpear), new Object[] 
                    { recipe, '#', Item.bone, '|', mod_InfiBase.iceRod });
            ModLoader.addRecipe(new ItemStack(cactusBoneSpear), new Object[] 
                    { recipe, '#', Item.bone, '|', mod_InfiBase.cactusRod });
            ModLoader.addRecipe(new ItemStack(flintBoneSpear), new Object[] 
                    { recipe, '#', Item.bone, '|', mod_InfiBase.flintRod });
        }
        
        if(PropsHelperInfiRange.enablePaperTools)
        {
            ModLoader.addRecipe(new ItemStack(woodPaperSpear), new Object[] 
                    { recipe, '#', mod_InfiBase.paperStack, '|', Item.stick });
            ModLoader.addRecipe(new ItemStack(bonePaperSpear), new Object[] 
                    { recipe, '#', mod_InfiBase.paperStack, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(bonePaperSpear), new Object[] 
                    { recipe, '#', mod_InfiBase.paperStack, '|', mod_InfiBase.boneRod });
            ModLoader.addRecipe(new ItemStack(paperPaperSpear), new Object[] 
                    { recipe, '#', mod_InfiBase.paperStack, '|', mod_InfiBase.paperRod });
            ModLoader.addRecipe(new ItemStack(slimePaperSpear), new Object[] 
                    { recipe, '#', mod_InfiBase.paperStack, '|', mod_InfiBase.slimeRod });
            ModLoader.addRecipe(new ItemStack(cactusPaperSpear), new Object[] 
                    { recipe, '#', mod_InfiBase.paperStack, '|', mod_InfiBase.cactusRod });
        }
        
        if(PropsHelperInfiRange.enableMossyTools)
        {
        	ModLoader.addRecipe(new ItemStack(woodMossySpear), new Object[] 
                    { recipe, '#', mod_InfiBase.mossyStone, '|', Item.stick });
        	ModLoader.addRecipe(new ItemStack(stoneMossySpear), new Object[] 
                    { recipe, '#', mod_InfiBase.mossyStone, '|', mod_InfiBase.stoneRod });
            ModLoader.addRecipe(new ItemStack(diamondMossySpear), new Object[] 
                    { recipe, '#', mod_InfiBase.mossyStone, '|', mod_InfiBase.diamondRod });
            ModLoader.addRecipe(new ItemStack(redstoneMossySpear), new Object[] 
                    { recipe, '#', mod_InfiBase.mossyStone, '|', mod_InfiBase.redstoneRod });
            ModLoader.addRecipe(new ItemStack(boneMossySpear), new Object[] 
                    { recipe, '#', mod_InfiBase.mossyStone, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneMossySpear), new Object[] 
                    { recipe, '#', mod_InfiBase.mossyStone, '|', mod_InfiBase.boneRod });
            ModLoader.addRecipe(new ItemStack(mossyMossySpear), new Object[] 
                    { recipe, '#', mod_InfiBase.mossyStone, '|', mod_InfiBase.mossyRod });
            ModLoader.addRecipe(new ItemStack(netherrackMossySpear), new Object[] 
                    { recipe, '#', mod_InfiBase.mossyStone, '|', mod_InfiBase.netherrackRod });
            ModLoader.addRecipe(new ItemStack(glowstoneMossySpear), new Object[] 
                    { recipe, '#', mod_InfiBase.mossyStone, '|', mod_InfiBase.glowstoneRod });
            ModLoader.addRecipe(new ItemStack(cactusMossySpear), new Object[] 
                    { recipe, '#', mod_InfiBase.mossyStone, '|', mod_InfiBase.cactusRod });
            ModLoader.addRecipe(new ItemStack(blazeMossySpear), new Object[] 
                    { recipe, '#', mod_InfiBase.mossyStone, '|', Item.blazeRod });
            ModLoader.addRecipe(new ItemStack(manyullynMossySpear), new Object[] 
                    { recipe, '#', mod_InfiBase.mossyStone, '|', mod_InfiBase.manyullynRod });
            ModLoader.addRecipe(new ItemStack(uraniumMossySpear), new Object[] 
                    { recipe, '#', mod_InfiBase.mossyStone, '|', mod_InfiBase.uraniumRod });
        }
        
        if(PropsHelperInfiRange.enableNetherrackTools)
        {
        	ModLoader.addRecipe(new ItemStack(woodNetherrackSpear), new Object[] 
                    { recipe, '#', Block.netherrack, '|', Item.stick });
        	ModLoader.addRecipe(new ItemStack(stoneNetherrackSpear), new Object[] 
                    { recipe, '#', Block.netherrack, '|', mod_InfiBase.stoneRod });
            ModLoader.addRecipe(new ItemStack(sandstoneNetherrackSpear), new Object[] 
                    { recipe, '#', Block.netherrack, '|', mod_InfiBase.sandstoneRod });
            ModLoader.addRecipe(new ItemStack(boneNetherrackSpear), new Object[] 
                    { recipe, '#', Block.netherrack, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneNetherrackSpear), new Object[] 
                    { recipe, '#', Block.netherrack, '|', mod_InfiBase.boneRod });
            ModLoader.addRecipe(new ItemStack(paperNetherrackSpear), new Object[] 
                    { recipe, '#', Block.netherrack, '|', mod_InfiBase.paperRod });
            ModLoader.addRecipe(new ItemStack(mossyNetherrackSpear), new Object[] 
                    { recipe, '#', Block.netherrack, '|', mod_InfiBase.mossyRod });
            ModLoader.addRecipe(new ItemStack(netherrackNetherrackSpear), new Object[] 
                    { recipe, '#', Block.netherrack, '|', mod_InfiBase.netherrackRod });
            ModLoader.addRecipe(new ItemStack(iceNetherrackSpear), new Object[] 
                    { recipe, '#', Block.netherrack, '|', mod_InfiBase.iceRod });
            ModLoader.addRecipe(new ItemStack(slimeNetherrackSpear), new Object[] 
                    { recipe, '#', Block.netherrack, '|', mod_InfiBase.slimeRod });
            ModLoader.addRecipe(new ItemStack(cactusNetherrackSpear), new Object[] 
                    { recipe, '#', Block.netherrack, '|', mod_InfiBase.cactusRod });
            ModLoader.addRecipe(new ItemStack(flintNetherrackSpear), new Object[] 
                    { recipe, '#', Block.netherrack, '|', mod_InfiBase.flintRod });
            ModLoader.addRecipe(new ItemStack(copperNetherrackSpear), new Object[] 
                    { recipe, '#', Block.netherrack, '|', mod_InfiBase.copperRod });
            ModLoader.addRecipe(new ItemStack(bronzeNetherrackSpear), new Object[] 
                    { recipe, '#', Block.netherrack, '|', mod_InfiBase.bronzeRod });
        }
        
        if(PropsHelperInfiRange.enableGlowstoneTools)
        {
        	ModLoader.addRecipe(new ItemStack(woodGlowstoneSpear), new Object[] 
                    { recipe, '#', mod_InfiBase.glowstoneCrystal, '|', Item.stick });
        	ModLoader.addRecipe(new ItemStack(redstoneGlowstoneSpear), new Object[] 
                    { recipe, '#', mod_InfiBase.glowstoneCrystal, '|', mod_InfiBase.glowstoneRod });
        	ModLoader.addRecipe(new ItemStack(obsidianGlowstoneSpear), new Object[] 
                    { recipe, '#', mod_InfiBase.glowstoneCrystal, '|', mod_InfiBase.obsidianRod });
            ModLoader.addRecipe(new ItemStack(boneGlowstoneSpear), new Object[] 
                    { recipe, '#', mod_InfiBase.glowstoneCrystal, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneGlowstoneSpear), new Object[] 
                    { recipe, '#', mod_InfiBase.glowstoneCrystal, '|', mod_InfiBase.boneRod });
            ModLoader.addRecipe(new ItemStack(netherrackGlowstoneSpear), new Object[] 
                    { recipe, '#', mod_InfiBase.glowstoneCrystal, '|', mod_InfiBase.netherrackRod });
            ModLoader.addRecipe(new ItemStack(iceGlowstoneSpear), new Object[] 
                    { recipe, '#', mod_InfiBase.glowstoneCrystal, '|', mod_InfiBase.iceRod });
            ModLoader.addRecipe(new ItemStack(slimeGlowstoneSpear), new Object[] 
                    { recipe, '#', mod_InfiBase.glowstoneCrystal, '|', mod_InfiBase.slimeRod });
            ModLoader.addRecipe(new ItemStack(cactusGlowstoneSpear), new Object[] 
                    { recipe, '#', mod_InfiBase.glowstoneCrystal, '|', mod_InfiBase.cactusRod });
        }
        
        if(PropsHelperInfiRange.enableIceTools)
        {
            ModLoader.addRecipe(new ItemStack(woodIceSpear), new Object[] 
                    { recipe, '#', Block.ice, '|', Item.stick });
            ModLoader.addRecipe(new ItemStack(boneIceSpear), new Object[] 
                    { recipe, '#', Block.ice, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneIceSpear), new Object[] 
                    { recipe, '#', Block.ice, '|', mod_InfiBase.boneRod });
            ModLoader.addRecipe(new ItemStack(paperIceSpear), new Object[] 
                    { recipe, '#', Block.ice, '|', mod_InfiBase.paperRod });
            ModLoader.addRecipe(new ItemStack(iceIceSpear), new Object[] 
                    { recipe, '#', Block.ice, '|', mod_InfiBase.iceRod });
            ModLoader.addRecipe(new ItemStack(slimeIceSpear), new Object[] 
                    { recipe, '#', Block.ice, '|', mod_InfiBase.slimeRod });
            ModLoader.addRecipe(new ItemStack(cactusIceSpear), new Object[] 
                    { recipe, '#', Block.ice, '|', mod_InfiBase.cactusRod });
        }
        
        if(PropsHelperInfiRange.enableLavaTools)
        {
            ModLoader.addRecipe(new ItemStack(diamondLavaSpear), new Object[] 
                    { recipe, '#', mod_InfiBase.lavaCrystal, '|', mod_InfiBase.diamondRod });
            ModLoader.addRecipe(new ItemStack(obsidianLavaSpear), new Object[] 
                    { recipe, '#', mod_InfiBase.lavaCrystal, '|', mod_InfiBase.obsidianRod });
            ModLoader.addRecipe(new ItemStack(netherrackLavaSpear), new Object[] 
                    { recipe, '#', mod_InfiBase.lavaCrystal, '|', mod_InfiBase.netherrackRod });
            ModLoader.addRecipe(new ItemStack(lavaLavaSpear), new Object[] 
                    { recipe, '#', mod_InfiBase.lavaCrystal, '|', mod_InfiBase.lavaRod });
            ModLoader.addRecipe(new ItemStack(flintLavaSpear), new Object[] 
                    { recipe, '#', mod_InfiBase.lavaCrystal, '|', mod_InfiBase.flintRod });
            ModLoader.addRecipe(new ItemStack(blazeLavaSpear), new Object[] 
                    { recipe, '#', mod_InfiBase.lavaCrystal, '|', Item.blazeRod });
            ModLoader.addRecipe(new ItemStack(manyullynLavaSpear), new Object[] 
                    { recipe, '#', mod_InfiBase.lavaCrystal, '|', mod_InfiBase.manyullynRod });
            ModLoader.addRecipe(new ItemStack(uraniumLavaSpear), new Object[] 
                    { recipe, '#', mod_InfiBase.lavaCrystal, '|', mod_InfiBase.uraniumRod });
        }
        
        if(PropsHelperInfiRange.enableSlimeTools)
        {
            ModLoader.addRecipe(new ItemStack(woodSlimeSpear), new Object[] 
                    { recipe, '#', mod_InfiBase.slimeCrystal, '|', Item.stick });
            ModLoader.addRecipe(new ItemStack(sandstoneSlimeSpear), new Object[] 
                    { recipe, '#', mod_InfiBase.slimeCrystal, '|', mod_InfiBase.sandstoneRod });
            ModLoader.addRecipe(new ItemStack(boneSlimeSpear), new Object[] 
                    { recipe, '#', mod_InfiBase.slimeCrystal, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneSlimeSpear), new Object[] 
                    { recipe, '#', mod_InfiBase.slimeCrystal, '|', mod_InfiBase.boneRod });
            ModLoader.addRecipe(new ItemStack(paperSlimeSpear), new Object[] 
                    { recipe, '#', mod_InfiBase.slimeCrystal, '|', mod_InfiBase.paperRod });
            ModLoader.addRecipe(new ItemStack(slimeSlimeSpear), new Object[] 
                    { recipe, '#', mod_InfiBase.slimeCrystal, '|', mod_InfiBase.slimeRod });
            ModLoader.addRecipe(new ItemStack(cactusSlimeSpear), new Object[] 
                    { recipe, '#', mod_InfiBase.slimeCrystal, '|', mod_InfiBase.cactusRod });
        }
        
        if(PropsHelperInfiRange.enableCactusTools)
        {
            ModLoader.addRecipe(new ItemStack(woodCactusSpear), new Object[] 
                    { recipe, '#', Block.cactus, '|', Item.stick });
            ModLoader.addRecipe(new ItemStack(sandstoneCactusSpear), new Object[] 
                    { recipe, '#', Block.cactus, '|', mod_InfiBase.sandstoneRod });
            ModLoader.addRecipe(new ItemStack(boneCactusSpear), new Object[] 
                    { recipe, '#', Block.cactus, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneCactusSpear), new Object[] 
                    { recipe, '#', Block.cactus, '|', mod_InfiBase.boneRod });
            ModLoader.addRecipe(new ItemStack(netherrackCactusSpear), new Object[] 
                    { recipe, '#', Block.cactus, '|', mod_InfiBase.netherrackRod });
            ModLoader.addRecipe(new ItemStack(iceCactusSpear), new Object[] 
                    { recipe, '#', Block.cactus, '|', mod_InfiBase.iceRod });
            ModLoader.addRecipe(new ItemStack(slimeCactusSpear), new Object[] 
                    { recipe, '#', Block.cactus, '|', mod_InfiBase.slimeRod });
            ModLoader.addRecipe(new ItemStack(cactusCactusSpear), new Object[] 
                    { recipe, '#', Block.cactus, '|', mod_InfiBase.cactusRod });
        }
        
        if(PropsHelperInfiRange.enableFlintTools)
        {
        	ModLoader.addRecipe(new ItemStack(woodFlintSpear), new Object[] 
                    { recipe, '#', Item.flint, '|', Item.stick });
        	ModLoader.addRecipe(new ItemStack(stoneFlintSpear), new Object[] 
                    { recipe, '#', Item.flint, '|', mod_InfiBase.stoneRod });
            ModLoader.addRecipe(new ItemStack(sandstoneFlintSpear), new Object[] 
                    { recipe, '#', Item.flint, '|', mod_InfiBase.sandstoneRod });
            ModLoader.addRecipe(new ItemStack(boneFlintSpear), new Object[] 
                    { recipe, '#', Item.flint, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneFlintSpear), new Object[] 
                    { recipe, '#', Item.flint, '|', mod_InfiBase.boneRod });
            ModLoader.addRecipe(new ItemStack(netherrackFlintSpear), new Object[] 
                    { recipe, '#', Item.flint, '|', mod_InfiBase.netherrackRod });
            ModLoader.addRecipe(new ItemStack(slimeFlintSpear), new Object[] 
                    { recipe, '#', Item.flint, '|', mod_InfiBase.slimeRod });
            ModLoader.addRecipe(new ItemStack(cactusFlintSpear), new Object[] 
                    { recipe, '#', Item.flint, '|', mod_InfiBase.cactusRod });
            ModLoader.addRecipe(new ItemStack(flintFlintSpear), new Object[] 
                    { recipe, '#', Item.flint, '|', mod_InfiBase.flintRod });
            ModLoader.addRecipe(new ItemStack(copperFlintSpear), new Object[] 
                    { recipe, '#', Block.netherrack, '|', mod_InfiBase.copperRod });
            ModLoader.addRecipe(new ItemStack(bronzeFlintSpear), new Object[] 
                    { recipe, '#', Block.netherrack, '|', mod_InfiBase.bronzeRod });
        }
        
        if(PropsHelperInfiRange.enableBlazeTools)
        {
            ModLoader.addRecipe(new ItemStack(diamondBlazeSpear), new Object[] 
                    { recipe, '#', mod_InfiBase.blazeCrystal, '|', mod_InfiBase.diamondRod });
            ModLoader.addRecipe(new ItemStack(obsidianBlazeSpear), new Object[] 
                    { recipe, '#', mod_InfiBase.blazeCrystal, '|', mod_InfiBase.obsidianRod });
            ModLoader.addRecipe(new ItemStack(netherrackBlazeSpear), new Object[] 
                    { recipe, '#', mod_InfiBase.blazeCrystal, '|', mod_InfiBase.netherrackRod });
            ModLoader.addRecipe(new ItemStack(lavaBlazeSpear), new Object[] 
                    { recipe, '#', mod_InfiBase.blazeCrystal, '|', mod_InfiBase.lavaRod });
            ModLoader.addRecipe(new ItemStack(flintBlazeSpear), new Object[] 
                    { recipe, '#', mod_InfiBase.blazeCrystal, '|', mod_InfiBase.flintRod });
            ModLoader.addRecipe(new ItemStack(blazeBlazeSpear), new Object[] 
                    { recipe, '#', mod_InfiBase.blazeCrystal, '|', Item.blazeRod });
            ModLoader.addRecipe(new ItemStack(manyullynBlazeSpear), new Object[] 
                    { recipe, '#', mod_InfiBase.blazeCrystal, '|', mod_InfiBase.manyullynRod });
            ModLoader.addRecipe(new ItemStack(uraniumBlazeSpear), new Object[] 
                    { recipe, '#', mod_InfiBase.blazeCrystal, '|', mod_InfiBase.uraniumRod });
        }
    }
    
    public static void addStoneTools(ItemStack stack)
    {
    	ModLoader.addRecipe(new ItemStack(woodStoneSpear), new Object[] 
                { recipe, '#', stack, '|', Item.stick });
    	ModLoader.addRecipe(new ItemStack(stoneStoneSpear), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.stoneRod });
        ModLoader.addRecipe(new ItemStack(sandstoneStoneSpear), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.sandstoneRod });
        ModLoader.addRecipe(new ItemStack(boneStoneSpear), new Object[] 
                { recipe, '#', stack, '|', Item.bone });
        ModLoader.addRecipe(new ItemStack(boneStoneSpear), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.boneRod });
        ModLoader.addRecipe(new ItemStack(netherrackStoneSpear), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.netherrackRod });
        ModLoader.addRecipe(new ItemStack(iceStoneSpear), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.iceRod });
        ModLoader.addRecipe(new ItemStack(slimeStoneSpear), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.slimeRod });
        ModLoader.addRecipe(new ItemStack(cactusStoneSpear), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.cactusRod });
        ModLoader.addRecipe(new ItemStack(flintStoneSpear), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.flintRod });
    }
    
    public static void addCopperTools(ItemStack stack)
    {
    	ModLoader.addRecipe(new ItemStack(woodCopperSpear), new Object[] 
                { recipe, '#', stack, '|', Item.stick });
        ModLoader.addRecipe(new ItemStack(stoneCopperSpear), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.stoneRod });
        ModLoader.addRecipe(new ItemStack(boneCopperSpear), new Object[] 
                { recipe, '#', stack, '|', Item.bone });
        ModLoader.addRecipe(new ItemStack(boneCopperSpear), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.boneRod });
        ModLoader.addRecipe(new ItemStack(netherrackCopperSpear), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.netherrackRod });
        ModLoader.addRecipe(new ItemStack(slimeCopperSpear), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.slimeRod });
        ModLoader.addRecipe(new ItemStack(cactusCopperSpear), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.cactusRod });
        ModLoader.addRecipe(new ItemStack(flintCopperSpear), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.flintRod });
        ModLoader.addRecipe(new ItemStack(copperCopperSpear), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.copperRod });
    }
    
    public static void addBronzeTools(ItemStack stack)
    {
    	ModLoader.addRecipe(new ItemStack(woodBronzeSpear), new Object[] 
                { recipe, '#', stack, '|', Item.stick });
        ModLoader.addRecipe(new ItemStack(stoneBronzeSpear), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.stoneRod });
        ModLoader.addRecipe(new ItemStack(boneBronzeSpear), new Object[] 
                { recipe, '#', stack, '|', Item.bone });
        ModLoader.addRecipe(new ItemStack(boneBronzeSpear), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.boneRod });
        ModLoader.addRecipe(new ItemStack(netherrackBronzeSpear), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.netherrackRod });
        ModLoader.addRecipe(new ItemStack(slimeBronzeSpear), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.slimeRod });
        ModLoader.addRecipe(new ItemStack(cactusBronzeSpear), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.cactusRod });
        ModLoader.addRecipe(new ItemStack(flintBronzeSpear), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.flintRod });
        ModLoader.addRecipe(new ItemStack(copperBronzeSpear), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.copperRod });
        ModLoader.addRecipe(new ItemStack(bronzeBronzeSpear), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.bronzeRod });
    }
    
    public static void addWorkedIronTools(ItemStack stack)
    {
    	ModLoader.addRecipe(new ItemStack(woodWorkedIronSpear), new Object[] 
                { recipe, '#', stack, '|', Item.stick });
        ModLoader.addRecipe(new ItemStack(stoneWorkedIronSpear), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.stoneRod });
        ModLoader.addRecipe(new ItemStack(ironWorkedIronSpear), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.ironRod });
        ModLoader.addRecipe(new ItemStack(diamondWorkedIronSpear), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.diamondRod });
        ModLoader.addRecipe(new ItemStack(redstoneWorkedIronSpear), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.redstoneRod });
        ModLoader.addRecipe(new ItemStack(obsidianWorkedIronSpear), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.obsidianRod });
        ModLoader.addRecipe(new ItemStack(boneWorkedIronSpear), new Object[] 
                { recipe, '#', stack, '|', Item.bone });
        ModLoader.addRecipe(new ItemStack(boneWorkedIronSpear), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.boneRod });
        ModLoader.addRecipe(new ItemStack(netherrackWorkedIronSpear), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.netherrackRod });
        ModLoader.addRecipe(new ItemStack(glowstoneWorkedIronSpear), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.glowstoneRod });
        ModLoader.addRecipe(new ItemStack(iceWorkedIronSpear), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.iceRod });
        ModLoader.addRecipe(new ItemStack(slimeWorkedIronSpear), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.slimeRod });
        ModLoader.addRecipe(new ItemStack(cactusWorkedIronSpear), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.cactusRod });
        ModLoader.addRecipe(new ItemStack(blazeWorkedIronSpear), new Object[] 
                { recipe, '#', stack, '|', Item.blazeRod });
        ModLoader.addRecipe(new ItemStack(copperWorkedIronSpear), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.copperRod });
        ModLoader.addRecipe(new ItemStack(bronzeWorkedIronSpear), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.bronzeRod });
        ModLoader.addRecipe(new ItemStack(workedWorkedIronSpear), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.workedIronRod });
        ModLoader.addRecipe(new ItemStack(steelWorkedIronSpear), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.steelRod });
        ModLoader.addRecipe(new ItemStack(uraniumWorkedIronSpear), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.uraniumRod });
    }
    
    public static void addSteelTools(ItemStack stack)
    {
    	ModLoader.addRecipe(new ItemStack(woodSteelSpear), new Object[] 
                { recipe, '#', stack, '|', Item.stick });
        ModLoader.addRecipe(new ItemStack(stoneSteelSpear), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.stoneRod });
        ModLoader.addRecipe(new ItemStack(ironSteelSpear), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.ironRod });
        ModLoader.addRecipe(new ItemStack(diamondSteelSpear), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.diamondRod });
        ModLoader.addRecipe(new ItemStack(redstoneSteelSpear), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.redstoneRod });
        ModLoader.addRecipe(new ItemStack(obsidianSteelSpear), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.obsidianRod });
        ModLoader.addRecipe(new ItemStack(boneSteelSpear), new Object[] 
                { recipe, '#', stack, '|', Item.bone });
        ModLoader.addRecipe(new ItemStack(boneSteelSpear), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.boneRod });
        ModLoader.addRecipe(new ItemStack(netherrackSteelSpear), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.netherrackRod });
        ModLoader.addRecipe(new ItemStack(glowstoneSteelSpear), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.glowstoneRod });
        ModLoader.addRecipe(new ItemStack(iceSteelSpear), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.iceRod });
        ModLoader.addRecipe(new ItemStack(slimeSteelSpear), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.slimeRod });
        ModLoader.addRecipe(new ItemStack(cactusSteelSpear), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.cactusRod });
        ModLoader.addRecipe(new ItemStack(blazeSteelSpear), new Object[] 
                { recipe, '#', stack, '|', Item.blazeRod });
        ModLoader.addRecipe(new ItemStack(copperSteelSpear), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.copperRod });
        ModLoader.addRecipe(new ItemStack(bronzeSteelSpear), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.bronzeRod });
        ModLoader.addRecipe(new ItemStack(workedSteelSpear), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.workedIronRod });
        ModLoader.addRecipe(new ItemStack(steelSteelSpear), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.steelRod });
        ModLoader.addRecipe(new ItemStack(cobaltSteelSpear), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.cobaltRod });
        ModLoader.addRecipe(new ItemStack(arditeSteelSpear), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.arditeRod });
        ModLoader.addRecipe(new ItemStack(uraniumSteelSpear), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.uraniumRod });
    }
    
    public static void addCobaltTools(ItemStack stack)
    {
    	ModLoader.addRecipe(new ItemStack(woodCobaltSpear), new Object[] 
                { recipe, '#', stack, '|', Item.stick });
        ModLoader.addRecipe(new ItemStack(stoneCobaltSpear), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.stoneRod });
        ModLoader.addRecipe(new ItemStack(ironCobaltSpear), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.ironRod });
        ModLoader.addRecipe(new ItemStack(diamondCobaltSpear), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.diamondRod });
        ModLoader.addRecipe(new ItemStack(redstoneCobaltSpear), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.redstoneRod });
        ModLoader.addRecipe(new ItemStack(obsidianCobaltSpear), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.obsidianRod });
        ModLoader.addRecipe(new ItemStack(boneCobaltSpear), new Object[] 
                { recipe, '#', stack, '|', Item.bone });
        ModLoader.addRecipe(new ItemStack(boneCobaltSpear), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.boneRod });
        ModLoader.addRecipe(new ItemStack(slimeCobaltSpear), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.slimeRod });
        ModLoader.addRecipe(new ItemStack(cactusCobaltSpear), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.cactusRod });
        ModLoader.addRecipe(new ItemStack(blazeCobaltSpear), new Object[] 
                { recipe, '#', stack, '|', Item.blazeRod });
        ModLoader.addRecipe(new ItemStack(copperCobaltSpear), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.copperRod });
        ModLoader.addRecipe(new ItemStack(bronzeCobaltSpear), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.bronzeRod });
        ModLoader.addRecipe(new ItemStack(workedCobaltSpear), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.workedIronRod });
        ModLoader.addRecipe(new ItemStack(steelCobaltSpear), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.steelRod });
        ModLoader.addRecipe(new ItemStack(cobaltCobaltSpear), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.cobaltRod });
        ModLoader.addRecipe(new ItemStack(arditeCobaltSpear), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.arditeRod });
        ModLoader.addRecipe(new ItemStack(manyullynCobaltSpear), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.manyullynRod });
        ModLoader.addRecipe(new ItemStack(uraniumCobaltSpear), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.uraniumRod });
    }
    
    public static void addArditeTools(ItemStack stack)
    {
    	ModLoader.addRecipe(new ItemStack(woodArditeSpear), new Object[] 
                { recipe, '#', stack, '|', Item.stick });
        ModLoader.addRecipe(new ItemStack(stoneArditeSpear), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.stoneRod });
        ModLoader.addRecipe(new ItemStack(ironArditeSpear), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.ironRod });
        ModLoader.addRecipe(new ItemStack(diamondArditeSpear), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.diamondRod });
        ModLoader.addRecipe(new ItemStack(redstoneArditeSpear), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.redstoneRod });
        ModLoader.addRecipe(new ItemStack(obsidianArditeSpear), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.obsidianRod });
        ModLoader.addRecipe(new ItemStack(boneArditeSpear), new Object[] 
                { recipe, '#', stack, '|', Item.bone });
        ModLoader.addRecipe(new ItemStack(boneArditeSpear), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.boneRod });
        ModLoader.addRecipe(new ItemStack(slimeArditeSpear), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.slimeRod });
        ModLoader.addRecipe(new ItemStack(cactusArditeSpear), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.cactusRod });
        ModLoader.addRecipe(new ItemStack(blazeArditeSpear), new Object[] 
                { recipe, '#', stack, '|', Item.blazeRod });
        ModLoader.addRecipe(new ItemStack(copperArditeSpear), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.copperRod });
        ModLoader.addRecipe(new ItemStack(bronzeArditeSpear), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.bronzeRod });
        ModLoader.addRecipe(new ItemStack(workedArditeSpear), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.workedIronRod });
        ModLoader.addRecipe(new ItemStack(steelArditeSpear), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.steelRod });
        ModLoader.addRecipe(new ItemStack(cobaltArditeSpear), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.cobaltRod });
        ModLoader.addRecipe(new ItemStack(arditeArditeSpear), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.arditeRod });
        ModLoader.addRecipe(new ItemStack(manyullynArditeSpear), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.manyullynRod });
        ModLoader.addRecipe(new ItemStack(uraniumArditeSpear), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.uraniumRod });
    }
    
    public static void addManyullynTools(ItemStack stack)
    {
    	ModLoader.addRecipe(new ItemStack(woodManyullynSpear), new Object[] 
                { recipe, '#', stack, '|', Item.stick });
        ModLoader.addRecipe(new ItemStack(stoneManyullynSpear), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.stoneRod });
        ModLoader.addRecipe(new ItemStack(ironManyullynSpear), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.ironRod });
        ModLoader.addRecipe(new ItemStack(diamondManyullynSpear), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.diamondRod });
        ModLoader.addRecipe(new ItemStack(redstoneManyullynSpear), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.redstoneRod });
        ModLoader.addRecipe(new ItemStack(obsidianManyullynSpear), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.obsidianRod });
        ModLoader.addRecipe(new ItemStack(boneManyullynSpear), new Object[] 
                { recipe, '#', stack, '|', Item.bone });
        ModLoader.addRecipe(new ItemStack(boneManyullynSpear), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.boneRod });
        ModLoader.addRecipe(new ItemStack(slimeManyullynSpear), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.slimeRod });
        ModLoader.addRecipe(new ItemStack(cactusManyullynSpear), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.cactusRod });
        ModLoader.addRecipe(new ItemStack(blazeManyullynSpear), new Object[] 
                { recipe, '#', stack, '|', Item.blazeRod });
        ModLoader.addRecipe(new ItemStack(copperManyullynSpear), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.copperRod });
        ModLoader.addRecipe(new ItemStack(bronzeManyullynSpear), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.bronzeRod });
        ModLoader.addRecipe(new ItemStack(workedManyullynSpear), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.workedIronRod });
        ModLoader.addRecipe(new ItemStack(steelManyullynSpear), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.steelRod });
        ModLoader.addRecipe(new ItemStack(cobaltManyullynSpear), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.cobaltRod });
        ModLoader.addRecipe(new ItemStack(arditeManyullynSpear), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.arditeRod });
        ModLoader.addRecipe(new ItemStack(manyullynManyullynSpear), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.manyullynRod });
        ModLoader.addRecipe(new ItemStack(uraniumManyullynSpear), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.uraniumRod });
    }
    
    public static void addUraniumTools(ItemStack stack)
    {
        ModLoader.addRecipe(new ItemStack(diamondUraniumSpear), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.diamondRod });
        ModLoader.addRecipe(new ItemStack(redstoneUraniumSpear), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.redstoneRod });
        ModLoader.addRecipe(new ItemStack(boneUraniumSpear), new Object[] 
                { recipe, '#', stack, '|', Item.bone });
        ModLoader.addRecipe(new ItemStack(boneUraniumSpear), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.boneRod });
        ModLoader.addRecipe(new ItemStack(netherrackUraniumSpear), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.netherrackRod });
        ModLoader.addRecipe(new ItemStack(glowstoneUraniumSpear), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.glowstoneRod });
        ModLoader.addRecipe(new ItemStack(lavaUraniumSpear), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.lavaRod });
        ModLoader.addRecipe(new ItemStack(blazeUraniumSpear), new Object[] 
                { recipe, '#', stack, '|', Item.blazeRod });
        ModLoader.addRecipe(new ItemStack(cobaltUraniumSpear), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.cobaltRod });
        ModLoader.addRecipe(new ItemStack(arditeUraniumSpear), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.arditeRod });
        ModLoader.addRecipe(new ItemStack(uraniumUraniumSpear), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.uraniumRod });
    }
    
	public static Item woodWoodSpear;
	public static Item sandstoneWoodSpear;
	public static Item boneWoodSpear;
	public static Item paperWoodSpear;
	public static Item iceWoodSpear;
	public static Item slimeWoodSpear;
	public static Item cactusWoodSpear;
	
	public static Item woodStoneSpear;
	public static Item stoneStoneSpear;
	public static Item sandstoneStoneSpear;
	public static Item boneStoneSpear;
	public static Item netherrackStoneSpear;
	public static Item iceStoneSpear;
	public static Item slimeStoneSpear;
	public static Item cactusStoneSpear;
	public static Item flintStoneSpear;
	
	public static Item woodIronSpear;
	public static Item stoneIronSpear;
	public static Item ironIronSpear;
	public static Item boneIronSpear;
	public static Item netherrackIronSpear;
	public static Item glowstoneIronSpear;
	public static Item cactusIronSpear;
	public static Item copperIronSpear;
	public static Item bronzeIronSpear;
	
	public static Item woodDiamondSpear;
	public static Item stoneDiamondSpear;
	public static Item ironDiamondSpear;
	public static Item diamondDiamondSpear;
	public static Item redstoneDiamondSpear;
	public static Item obsidianDiamondSpear;
	public static Item boneDiamondSpear;
	public static Item mossyDiamondSpear;
	public static Item netherrackDiamondSpear;
	public static Item glowstoneDiamondSpear;
	public static Item lavaDiamondSpear;
	public static Item cactusDiamondSpear;
	public static Item flintDiamondSpear;
	public static Item blazeDiamondSpear;
	public static Item copperDiamondSpear;
	public static Item bronzeDiamondSpear;
	public static Item workedDiamondSpear;
	public static Item steelDiamondSpear;
	public static Item cobaltDiamondSpear;
	public static Item arditeDiamondSpear;
	public static Item manyullynDiamondSpear;
	public static Item uraniumDiamondSpear;
	
	public static Item woodRedstoneSpear;
	public static Item stoneRedstoneSpear;
	public static Item ironRedstoneSpear;
	public static Item redstoneRedstoneSpear;
	public static Item obsidianRedstoneSpear;
	public static Item sandstoneRedstoneSpear;
	public static Item boneRedstoneSpear;
	public static Item paperRedstoneSpear;
	public static Item mossyRedstoneSpear;
	public static Item netherrackRedstoneSpear;
	public static Item glowstoneRedstoneSpear;
	public static Item iceRedstoneSpear;
	public static Item lavaRedstoneSpear;
	public static Item slimeRedstoneSpear;
	public static Item cactusRedstoneSpear;
	public static Item flintRedstoneSpear;
	public static Item copperRedstoneSpear;
	public static Item bronzeRedstoneSpear;
	public static Item workedRedstoneSpear;
	public static Item uraniumRedstoneSpear;
	
	public static Item woodObsidianSpear;
	public static Item stoneObsidianSpear;
	public static Item redstoneObsidianSpear;
	public static Item obsidianObsidianSpear;
	public static Item boneObsidianSpear;
	public static Item netherrackObsidianSpear;
	public static Item glowstoneObsidianSpear;
	public static Item iceObsidianSpear;
	public static Item lavaObsidianSpear;
	public static Item cactusObsidianSpear;
	
	public static Item woodSandstoneSpear;
	public static Item sandstoneSandstoneSpear;
	public static Item boneSandstoneSpear;
	public static Item netherrackSandstoneSpear;
	public static Item iceSandstoneSpear;
	public static Item slimeSandstoneSpear;
	public static Item cactusSandstoneSpear;
	public static Item flintSandstoneSpear;
	
	public static Item woodBoneSpear;
	public static Item stoneBoneSpear;
	public static Item sandstoneBoneSpear;
	public static Item boneBoneSpear;
	public static Item paperBoneSpear;
	public static Item netherrackBoneSpear;
	public static Item iceBoneSpear;
	public static Item cactusBoneSpear;
	public static Item flintBoneSpear;
	
	public static Item woodPaperSpear;
	public static Item bonePaperSpear;
	public static Item paperPaperSpear;
	public static Item slimePaperSpear;
	public static Item cactusPaperSpear;
	
	public static Item woodMossySpear;
	public static Item stoneMossySpear;
	public static Item diamondMossySpear;
	public static Item redstoneMossySpear;
	public static Item boneMossySpear;
	public static Item mossyMossySpear;
	public static Item netherrackMossySpear;
	public static Item glowstoneMossySpear;
	public static Item cactusMossySpear;
	public static Item blazeMossySpear;
	public static Item manyullynMossySpear;
	public static Item uraniumMossySpear;
	
	public static Item woodNetherrackSpear;
	public static Item stoneNetherrackSpear;
	public static Item sandstoneNetherrackSpear;
	public static Item boneNetherrackSpear;
	public static Item paperNetherrackSpear;
	public static Item mossyNetherrackSpear;
	public static Item netherrackNetherrackSpear;
	public static Item iceNetherrackSpear;
	public static Item slimeNetherrackSpear;
	public static Item cactusNetherrackSpear;
	public static Item flintNetherrackSpear;
	public static Item copperNetherrackSpear;
	public static Item bronzeNetherrackSpear;
	
	public static Item woodGlowstoneSpear;
	public static Item redstoneGlowstoneSpear;
	public static Item obsidianGlowstoneSpear;
	public static Item boneGlowstoneSpear;
	public static Item netherrackGlowstoneSpear;
	public static Item glowstoneGlowstoneSpear;
	public static Item iceGlowstoneSpear;
	public static Item slimeGlowstoneSpear;
	public static Item cactusGlowstoneSpear;
	
	public static Item woodIceSpear;
	public static Item boneIceSpear;
	public static Item paperIceSpear;
	public static Item iceIceSpear;
	public static Item slimeIceSpear;
	public static Item cactusIceSpear;
	
	public static Item diamondLavaSpear;
	public static Item obsidianLavaSpear;
	public static Item netherrackLavaSpear;
	public static Item lavaLavaSpear;
	public static Item flintLavaSpear;
	public static Item blazeLavaSpear;
	public static Item manyullynLavaSpear;
	public static Item uraniumLavaSpear;
	
	public static Item woodSlimeSpear;
	public static Item sandstoneSlimeSpear;
	public static Item boneSlimeSpear;
	public static Item paperSlimeSpear;
	public static Item slimeSlimeSpear;
	public static Item cactusSlimeSpear;
	
	public static Item woodCactusSpear;
	public static Item sandstoneCactusSpear;
	public static Item boneCactusSpear;
	public static Item netherrackCactusSpear;
	public static Item iceCactusSpear;
	public static Item slimeCactusSpear;
	public static Item cactusCactusSpear;
	
	public static Item woodFlintSpear;
	public static Item stoneFlintSpear;
	public static Item sandstoneFlintSpear;
	public static Item boneFlintSpear;
	public static Item netherrackFlintSpear;
	public static Item slimeFlintSpear;
	public static Item cactusFlintSpear;
	public static Item flintFlintSpear;
	public static Item copperFlintSpear;
	public static Item bronzeFlintSpear;
	
	public static Item diamondBlazeSpear;
	public static Item obsidianBlazeSpear;
	public static Item netherrackBlazeSpear;
	public static Item lavaBlazeSpear;
	public static Item flintBlazeSpear;
	public static Item blazeBlazeSpear;
	public static Item manyullynBlazeSpear;
	public static Item uraniumBlazeSpear;
	
	public static Item woodCopperSpear;
	public static Item stoneCopperSpear;
    public static Item boneCopperSpear;
    public static Item netherrackCopperSpear;
    public static Item slimeCopperSpear;
    public static Item cactusCopperSpear;
    public static Item flintCopperSpear;
    public static Item copperCopperSpear;
    
    public static Item woodBronzeSpear;
    public static Item stoneBronzeSpear;
    public static Item boneBronzeSpear;
    public static Item netherrackBronzeSpear;
    public static Item slimeBronzeSpear;
    public static Item cactusBronzeSpear;
    public static Item flintBronzeSpear;
    public static Item copperBronzeSpear;
    public static Item bronzeBronzeSpear;
    
    public static Item woodWorkedIronSpear;
    public static Item stoneWorkedIronSpear;
    public static Item ironWorkedIronSpear;
    public static Item diamondWorkedIronSpear;
    public static Item redstoneWorkedIronSpear;
    public static Item obsidianWorkedIronSpear;
    public static Item boneWorkedIronSpear;
    public static Item netherrackWorkedIronSpear;
    public static Item glowstoneWorkedIronSpear;
    public static Item iceWorkedIronSpear;
    public static Item slimeWorkedIronSpear;
    public static Item cactusWorkedIronSpear;
    public static Item blazeWorkedIronSpear;
    public static Item copperWorkedIronSpear;
    public static Item bronzeWorkedIronSpear;
    public static Item workedWorkedIronSpear;
    public static Item steelWorkedIronSpear;
    public static Item uraniumWorkedIronSpear;
    
    public static Item woodSteelSpear;
    public static Item stoneSteelSpear;
    public static Item ironSteelSpear;
    public static Item diamondSteelSpear;
    public static Item redstoneSteelSpear;
    public static Item obsidianSteelSpear;
    public static Item boneSteelSpear;
    public static Item netherrackSteelSpear;
    public static Item glowstoneSteelSpear;
    public static Item iceSteelSpear;
    public static Item slimeSteelSpear;
    public static Item cactusSteelSpear;
    public static Item blazeSteelSpear;
    public static Item copperSteelSpear;
    public static Item bronzeSteelSpear;
    public static Item workedSteelSpear;
    public static Item steelSteelSpear;
    public static Item cobaltSteelSpear;
    public static Item arditeSteelSpear;
    public static Item uraniumSteelSpear;
    
    public static Item woodCobaltSpear;
    public static Item stoneCobaltSpear;
    public static Item ironCobaltSpear;
    public static Item diamondCobaltSpear;
    public static Item redstoneCobaltSpear;
    public static Item obsidianCobaltSpear;
    public static Item boneCobaltSpear;
    public static Item slimeCobaltSpear;
    public static Item cactusCobaltSpear;
    public static Item blazeCobaltSpear;
    public static Item copperCobaltSpear;
    public static Item bronzeCobaltSpear;
    public static Item workedCobaltSpear;
    public static Item steelCobaltSpear;
    public static Item cobaltCobaltSpear;
    public static Item arditeCobaltSpear;
    public static Item manyullynCobaltSpear;
    public static Item uraniumCobaltSpear;
    
    public static Item woodArditeSpear;
    public static Item stoneArditeSpear;
    public static Item ironArditeSpear;
    public static Item diamondArditeSpear;
    public static Item redstoneArditeSpear;
    public static Item obsidianArditeSpear;
    public static Item boneArditeSpear;
    public static Item slimeArditeSpear;
    public static Item cactusArditeSpear;
    public static Item blazeArditeSpear;
    public static Item copperArditeSpear;
    public static Item bronzeArditeSpear;
    public static Item workedArditeSpear;
    public static Item steelArditeSpear;
    public static Item cobaltArditeSpear;
    public static Item arditeArditeSpear;
    public static Item manyullynArditeSpear;
    public static Item uraniumArditeSpear;
    
    public static Item woodManyullynSpear;
    public static Item stoneManyullynSpear;
    public static Item ironManyullynSpear;
    public static Item diamondManyullynSpear;
    public static Item redstoneManyullynSpear;
    public static Item obsidianManyullynSpear;
    public static Item boneManyullynSpear;
    public static Item slimeManyullynSpear;
    public static Item cactusManyullynSpear;
    public static Item blazeManyullynSpear;
    public static Item copperManyullynSpear;
    public static Item bronzeManyullynSpear;
    public static Item workedManyullynSpear;
    public static Item steelManyullynSpear;
    public static Item cobaltManyullynSpear;
    public static Item arditeManyullynSpear;
    public static Item manyullynManyullynSpear;
    public static Item uraniumManyullynSpear;
    
    public static Item diamondUraniumSpear;
    public static Item redstoneUraniumSpear;
    public static Item boneUraniumSpear;
    public static Item netherrackUraniumSpear;
    public static Item glowstoneUraniumSpear;
    public static Item lavaUraniumSpear;
    public static Item blazeUraniumSpear;
    public static Item cobaltUraniumSpear;
    public static Item arditeUraniumSpear;
    public static Item uraniumUraniumSpear;
}
