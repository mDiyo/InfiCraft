package mDiyo.inficraft.infitools.twoxtwo;
import mDiyo.inficraft.infitools.library.InfiLibrary;
import mDiyo.inficraft.infitools.library.InfiMaterialEnum;
import net.minecraft.src.Block;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;
import net.minecraft.src.ModLoader;

public class Daggers 
{
    public static Daggers instance = new Daggers();
    
    private static String[] recipe = { " #", "| " };
    
    public static Daggers getInstance()
    {
        return instance;
    }

    public static void init()
    {
        if(Infi2x2.infitoolsPresent)
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
        woodWoodDagger = new InfiToolDagger(PropsHelperInfi2x2.woodDaggerID+0, 
                InfiMaterialEnum.Wood, InfiMaterialEnum.Wood, "woodWoodDagger");
        woodStoneDagger = new InfiToolDagger(PropsHelperInfi2x2.stoneDaggerID+0, 
                InfiMaterialEnum.Stone, InfiMaterialEnum.Wood, "woodStoneDagger");
        woodIronDagger = new InfiToolDagger(PropsHelperInfi2x2.ironDaggerID+0, 
                InfiMaterialEnum.Iron, InfiMaterialEnum.Wood, "woodIronDagger");
        woodDiamondDagger = new InfiToolDagger(PropsHelperInfi2x2.diamondDaggerID+0, 
                InfiMaterialEnum.Diamond, InfiMaterialEnum.Wood, "woodDiamondDagger");
        
        ModLoader.addName(woodWoodDagger, "Wooden Dagger");
    }
    
    private static void registerVanillaRecipes()
    {
        ModLoader.addRecipe(new ItemStack(woodWoodDagger), new Object[] 
                { recipe, '#', Block.planks, '|', Item.stick, });
        ModLoader.addRecipe(new ItemStack(woodStoneDagger), new Object[] 
                { recipe, '#', Block.cobblestone, '|', Item.stick, });
        ModLoader.addRecipe(new ItemStack(woodIronDagger), new Object[] 
                { recipe, '#', Item.ingotIron, '|', Item.stick, });
        ModLoader.addRecipe(new ItemStack(woodDiamondDagger), new Object[] 
                { recipe, '#', Item.diamond, '|', Item.stick, });
    }
    
    private static void createTools()
    {
        if(PropsHelperInfi2x2.enableWoodTools)
        {
            woodWoodDagger = new InfiToolDagger(PropsHelperInfi2x2.woodDaggerID+0, 
                    InfiMaterialEnum.Wood, InfiMaterialEnum.Wood, "woodWoodDagger");
            sandstoneWoodDagger = new InfiToolDagger(PropsHelperInfi2x2.woodDaggerID+1, 
                    InfiMaterialEnum.Wood, InfiMaterialEnum.Sandstone, "sandstoneWoodDagger");
            boneWoodDagger = new InfiToolDagger(PropsHelperInfi2x2.woodDaggerID+2, 
                    InfiMaterialEnum.Wood, InfiMaterialEnum.Bone, "boneWoodDagger");
            paperWoodDagger = new InfiToolDagger(PropsHelperInfi2x2.woodDaggerID+3, 
                    InfiMaterialEnum.Wood, InfiMaterialEnum.Paper, "paperWoodDagger");
            iceWoodDagger = new InfiToolDagger(PropsHelperInfi2x2.woodDaggerID+4, 
                    InfiMaterialEnum.Wood, InfiMaterialEnum.Ice, "iceWoodDagger");
            slimeWoodDagger = new InfiToolDagger(PropsHelperInfi2x2.woodDaggerID+5, 
                    InfiMaterialEnum.Wood, InfiMaterialEnum.Slime, "slimeWoodDagger");
            cactusWoodDagger = new InfiToolDagger(PropsHelperInfi2x2.woodDaggerID+6, 
                    InfiMaterialEnum.Wood, InfiMaterialEnum.Cactus, "cactusWoodDagger");
        }

        if(PropsHelperInfi2x2.enableStoneTools)
        {
            woodStoneDagger = new InfiToolDagger(PropsHelperInfi2x2.stoneDaggerID+0, 
                    InfiMaterialEnum.Stone, InfiMaterialEnum.Wood, "woodStoneDagger");
            stoneStoneDagger = new InfiToolDagger(PropsHelperInfi2x2.stoneDaggerID+1, 
                    InfiMaterialEnum.Stone, InfiMaterialEnum.Stone, "stoneStoneDagger");
            sandstoneStoneDagger = new InfiToolDagger(PropsHelperInfi2x2.stoneDaggerID+2, 
                    InfiMaterialEnum.Stone, InfiMaterialEnum.Sandstone, "sandstoneStoneDagger");
            boneStoneDagger = new InfiToolDagger(PropsHelperInfi2x2.stoneDaggerID+3, 
                    InfiMaterialEnum.Stone, InfiMaterialEnum.Bone, "boneStoneDagger");
            netherrackStoneDagger = new InfiToolDagger(PropsHelperInfi2x2.stoneDaggerID+4, 
                    InfiMaterialEnum.Stone, InfiMaterialEnum.Netherrack, "netherrackStoneDagger");
            iceStoneDagger = new InfiToolDagger(PropsHelperInfi2x2.stoneDaggerID+5, 
                    InfiMaterialEnum.Stone, InfiMaterialEnum.Ice, "iceStoneDagger");
            slimeStoneDagger = new InfiToolDagger(PropsHelperInfi2x2.stoneDaggerID+6, 
                    InfiMaterialEnum.Stone, InfiMaterialEnum.Slime, "slimeStoneDagger");
            cactusStoneDagger = new InfiToolDagger(PropsHelperInfi2x2.stoneDaggerID+7, 
                    InfiMaterialEnum.Stone, InfiMaterialEnum.Cactus, "cactusStoneDagger");
            flintStoneDagger = new InfiToolDagger(PropsHelperInfi2x2.stoneDaggerID+8, 
                    InfiMaterialEnum.Stone, InfiMaterialEnum.Flint, "flintStoneDagger");
        }
        
        if(PropsHelperInfi2x2.enableIronTools)
        {
            woodIronDagger = new InfiToolDagger(PropsHelperInfi2x2.ironDaggerID+0, 
                    InfiMaterialEnum.Iron, InfiMaterialEnum.Wood, "woodIronDagger");
            stoneIronDagger = new InfiToolDagger(PropsHelperInfi2x2.ironDaggerID+1, 
                    InfiMaterialEnum.Iron, InfiMaterialEnum.Stone, "stoneIronDagger");
            ironIronDagger = new InfiToolDagger(PropsHelperInfi2x2.ironDaggerID+2, 
                    InfiMaterialEnum.Iron, InfiMaterialEnum.Iron, "ironIronDagger");
            boneIronDagger = new InfiToolDagger(PropsHelperInfi2x2.ironDaggerID+3, 
                    InfiMaterialEnum.Iron, InfiMaterialEnum.Bone, "boneIronDagger");
            netherrackIronDagger = new InfiToolDagger(PropsHelperInfi2x2.ironDaggerID+4, 
                    InfiMaterialEnum.Iron, InfiMaterialEnum.Netherrack, "netherrackIronDagger");
            glowstoneIronDagger = new InfiToolDagger(PropsHelperInfi2x2.ironDaggerID+5, 
                    InfiMaterialEnum.Iron, InfiMaterialEnum.Glowstone, "glowstoneIronDagger");
            cactusIronDagger = new InfiToolDagger(PropsHelperInfi2x2.ironDaggerID+6, 
                    InfiMaterialEnum.Iron, InfiMaterialEnum.Cactus, "cactusIronDagger");
            copperIronDagger = new InfiToolDagger(PropsHelperInfi2x2.ironDaggerID+7, 
                    InfiMaterialEnum.Iron, InfiMaterialEnum.Copper, "copperIronDagger");
            bronzeIronDagger = new InfiToolDagger(PropsHelperInfi2x2.ironDaggerID+8, 
                    InfiMaterialEnum.Iron, InfiMaterialEnum.Bronze, "bronzeIronDagger");
        }
        
        if(PropsHelperInfi2x2.enableDiamondTools)
        {
            woodDiamondDagger = new InfiToolDagger(PropsHelperInfi2x2.diamondDaggerID+0, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Wood, "woodDiamondDagger");
            stoneDiamondDagger = new InfiToolDagger(PropsHelperInfi2x2.diamondDaggerID+1, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Stone, "stoneDiamondDagger");
            ironDiamondDagger = new InfiToolDagger(PropsHelperInfi2x2.diamondDaggerID+2, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Iron, "ironDiamondDagger");
            diamondDiamondDagger = new InfiToolDagger(PropsHelperInfi2x2.diamondDaggerID+3, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Diamond, "diamondDiamondDagger");
            redstoneDiamondDagger = new InfiToolDagger(PropsHelperInfi2x2.diamondDaggerID+4, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Redstone, "redstoneDiamondDagger");
            obsidianDiamondDagger = new InfiToolDagger(PropsHelperInfi2x2.diamondDaggerID+5, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Obsidian, "obsidianDiamondDagger");
            boneDiamondDagger = new InfiToolDagger(PropsHelperInfi2x2.diamondDaggerID+6, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Bone, "boneDiamondDagger");
            mossyDiamondDagger = new InfiToolDagger(PropsHelperInfi2x2.diamondDaggerID+7, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Mossy, "mossyDiamondDagger");
            netherrackDiamondDagger = new InfiToolDagger(PropsHelperInfi2x2.diamondDaggerID+8, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Netherrack, "netherrackDiamondDagger");
            glowstoneDiamondDagger = new InfiToolDagger(PropsHelperInfi2x2.diamondDaggerID+9, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Glowstone, "glowstoneDiamondDagger");
            lavaDiamondDagger = new InfiToolDagger(PropsHelperInfi2x2.diamondDaggerID+10, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Lava, "lavaDiamondDagger");
            cactusDiamondDagger = new InfiToolDagger(PropsHelperInfi2x2.diamondDaggerID+11, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Cactus, "cactusDiamondDagger");
            flintDiamondDagger = new InfiToolDagger(PropsHelperInfi2x2.diamondDaggerID+12, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Flint, "flintDiamondDagger");
            blazeDiamondDagger = new InfiToolDagger(PropsHelperInfi2x2.diamondDaggerID+13, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Blaze, "blazeDiamondDagger");
            copperDiamondDagger = new InfiToolDagger(PropsHelperInfi2x2.diamondDaggerID+14, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Copper, "copperDiamondDagger");
            bronzeDiamondDagger = new InfiToolDagger(PropsHelperInfi2x2.diamondDaggerID+15, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Bronze, "bronzeDiamondDagger");
            workedDiamondDagger = new InfiToolDagger(PropsHelperInfi2x2.diamondDaggerID+16, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.WorkedIron, "workedDiamondDagger");
            steelDiamondDagger = new InfiToolDagger(PropsHelperInfi2x2.diamondDaggerID+17, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Steel, "steelDiamondDagger");
            cobaltDiamondDagger = new InfiToolDagger(PropsHelperInfi2x2.diamondDaggerID+18, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Cobalt, "cobaltDiamondDagger");
            arditeDiamondDagger = new InfiToolDagger(PropsHelperInfi2x2.diamondDaggerID+19, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Ardite, "arditeDiamondDagger");
            manyullynDiamondDagger = new InfiToolDagger(PropsHelperInfi2x2.diamondDaggerID+20, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Manyullyn, "manyullynDiamondDagger");
            uraniumDiamondDagger = new InfiToolDagger(PropsHelperInfi2x2.diamondDaggerID+21, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Uranium, "uraniumDiamondDagger");
        }
        
        if(PropsHelperInfi2x2.enableRedstoneTools)
        {
            woodRedstoneDagger = new InfiToolDagger(PropsHelperInfi2x2.redstoneDaggerID+0, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Wood, "woodRedstoneDagger");
            stoneRedstoneDagger = new InfiToolDagger(PropsHelperInfi2x2.redstoneDaggerID+1, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Stone, "stoneRedstoneDagger");
            ironRedstoneDagger = new InfiToolDagger(PropsHelperInfi2x2.redstoneDaggerID+2, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Iron, "ironRedstoneDagger");
            redstoneRedstoneDagger = new InfiToolDagger(PropsHelperInfi2x2.redstoneDaggerID+3, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Redstone, "redstoneRedstoneDagger");
            obsidianRedstoneDagger = new InfiToolDagger(PropsHelperInfi2x2.redstoneDaggerID+4, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Obsidian, "obsidianRedstoneDagger");
            sandstoneRedstoneDagger = new InfiToolDagger(PropsHelperInfi2x2.redstoneDaggerID+5, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Sandstone, "sandstoneRedstoneDagger");
            boneRedstoneDagger = new InfiToolDagger(PropsHelperInfi2x2.redstoneDaggerID+6, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Bone, "boneRedstoneDagger");
            paperRedstoneDagger = new InfiToolDagger(PropsHelperInfi2x2.redstoneDaggerID+7, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Paper, "paperRedstoneDagger");
            mossyRedstoneDagger = new InfiToolDagger(PropsHelperInfi2x2.redstoneDaggerID+8, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Mossy, "mossyRedstoneDagger");
            netherrackRedstoneDagger = new InfiToolDagger(PropsHelperInfi2x2.redstoneDaggerID+9, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Netherrack, "netherrackRedstoneDagger");
            glowstoneRedstoneDagger = new InfiToolDagger(PropsHelperInfi2x2.redstoneDaggerID+10, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Glowstone, "glowstoneRedstoneDagger");
            iceRedstoneDagger = new InfiToolDagger(PropsHelperInfi2x2.redstoneDaggerID+11, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Ice, "iceRedstoneDagger");
            lavaRedstoneDagger = new InfiToolDagger(PropsHelperInfi2x2.redstoneDaggerID+12,
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Lava, "lavaRedstoneDagger");
            slimeRedstoneDagger = new InfiToolDagger(PropsHelperInfi2x2.redstoneDaggerID+13,
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Slime, "slimeRedstoneDagger");
            cactusRedstoneDagger = new InfiToolDagger(PropsHelperInfi2x2.redstoneDaggerID+14,
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Cactus, "cactusRedstoneDagger");
            flintRedstoneDagger = new InfiToolDagger(PropsHelperInfi2x2.redstoneDaggerID+15,
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Flint, "flintRedstoneDagger");
            copperRedstoneDagger = new InfiToolDagger(PropsHelperInfi2x2.redstoneDaggerID+16,
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Copper, "copperRedstoneDagger");
            bronzeRedstoneDagger = new InfiToolDagger(PropsHelperInfi2x2.redstoneDaggerID+17,
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Bronze, "bronzeRedstoneDagger");
            workedRedstoneDagger = new InfiToolDagger(PropsHelperInfi2x2.redstoneDaggerID+18,
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.WorkedIron, "workedRedstoneDagger");
            uraniumRedstoneDagger = new InfiToolDagger(PropsHelperInfi2x2.redstoneDaggerID+19,
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Uranium, "uraniumRedstoneDagger");
        }
        
        if(PropsHelperInfi2x2.enableObsidianTools)
        {
            woodObsidianDagger = new InfiToolDagger(PropsHelperInfi2x2.obsidianDaggerID+0, 
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Wood, "woodObsidianDagger");
            stoneObsidianDagger = new InfiToolDagger(PropsHelperInfi2x2.obsidianDaggerID+1, 
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Stone, "stoneObsidianDagger");
            redstoneObsidianDagger = new InfiToolDagger(PropsHelperInfi2x2.obsidianDaggerID+2, 
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Redstone, "redstoneObsidianDagger");
            obsidianObsidianDagger = new InfiToolDagger(PropsHelperInfi2x2.obsidianDaggerID+3, 
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Obsidian, "obsidianObsidianDagger");;
            boneObsidianDagger = new InfiToolDagger(PropsHelperInfi2x2.obsidianDaggerID+4, 
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Bone, "boneObsidianDagger");
            netherrackObsidianDagger = new InfiToolDagger(PropsHelperInfi2x2.obsidianDaggerID+5, 
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Netherrack, "netherrackObsidianDagger");
            glowstoneObsidianDagger = new InfiToolDagger(PropsHelperInfi2x2.obsidianDaggerID+6, 
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Glowstone, "glowstoneObsidianDagger");
            iceObsidianDagger = new InfiToolDagger(PropsHelperInfi2x2.obsidianDaggerID+7, 
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Ice, "iceObsidianDagger");
            lavaObsidianDagger = new InfiToolDagger(PropsHelperInfi2x2.obsidianDaggerID+8,
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Lava, "lavaObsidianDagger");
            cactusObsidianDagger = new InfiToolDagger(PropsHelperInfi2x2.obsidianDaggerID+9,
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Cactus, "cactusObsidianDagger");
        }
        
        if(PropsHelperInfi2x2.enableSandstoneTools)
        {
            woodSandstoneDagger = new InfiToolDagger(PropsHelperInfi2x2.sandstoneDaggerID+0, 
                    InfiMaterialEnum.Sandstone, InfiMaterialEnum.Wood, "woodSandstoneDagger");
            sandstoneSandstoneDagger = new InfiToolDagger(PropsHelperInfi2x2.sandstoneDaggerID+1, 
                    InfiMaterialEnum.Sandstone, InfiMaterialEnum.Sandstone, "sandstoneSandstoneDagger");
            boneSandstoneDagger = new InfiToolDagger(PropsHelperInfi2x2.sandstoneDaggerID+2, 
                    InfiMaterialEnum.Sandstone, InfiMaterialEnum.Bone, "boneSandstoneDagger");
            netherrackSandstoneDagger = new InfiToolDagger(PropsHelperInfi2x2.sandstoneDaggerID+3, 
                    InfiMaterialEnum.Sandstone, InfiMaterialEnum.Netherrack, "netherrackSandstoneDagger");
            iceSandstoneDagger = new InfiToolDagger(PropsHelperInfi2x2.sandstoneDaggerID+4, 
                    InfiMaterialEnum.Sandstone, InfiMaterialEnum.Ice, "iceSandstoneDagger");
            slimeSandstoneDagger = new InfiToolDagger(PropsHelperInfi2x2.sandstoneDaggerID+5,
                    InfiMaterialEnum.Sandstone, InfiMaterialEnum.Slime, "slimeSandstoneDagger");
            cactusSandstoneDagger = new InfiToolDagger(PropsHelperInfi2x2.sandstoneDaggerID+6,
                    InfiMaterialEnum.Sandstone, InfiMaterialEnum.Cactus, "cactusSandstoneDagger");
            flintSandstoneDagger = new InfiToolDagger(PropsHelperInfi2x2.sandstoneDaggerID+7,
                    InfiMaterialEnum.Sandstone, InfiMaterialEnum.Flint, "flintSandstoneDagger");
        }
        
        if(PropsHelperInfi2x2.enableBoneTools)
        {
            woodBoneDagger = new InfiToolDagger(PropsHelperInfi2x2.boneDaggerID+0, 
                    InfiMaterialEnum.Bone, InfiMaterialEnum.Bone, "woodBoneDagger");
            stoneBoneDagger = new InfiToolDagger(PropsHelperInfi2x2.boneDaggerID+1, 
                    InfiMaterialEnum.Bone, InfiMaterialEnum.Stone, "stoneBoneDagger");
            sandstoneBoneDagger = new InfiToolDagger(PropsHelperInfi2x2.boneDaggerID+2, 
                    InfiMaterialEnum.Bone, InfiMaterialEnum.Sandstone, "sandstoneBoneDagger");
            boneBoneDagger = new InfiToolDagger(PropsHelperInfi2x2.boneDaggerID+3, 
                    InfiMaterialEnum.Bone, InfiMaterialEnum.Bone, "boneBoneDagger");
            paperBoneDagger = new InfiToolDagger(PropsHelperInfi2x2.boneDaggerID+4, 
                    InfiMaterialEnum.Bone, InfiMaterialEnum.Paper, "paperBoneDagger");
            netherrackBoneDagger = new InfiToolDagger(PropsHelperInfi2x2.boneDaggerID+5, 
                    InfiMaterialEnum.Bone, InfiMaterialEnum.Netherrack, "netherrackBoneDagger");
            iceBoneDagger = new InfiToolDagger(PropsHelperInfi2x2.boneDaggerID+6, 
                    InfiMaterialEnum.Bone, InfiMaterialEnum.Ice, "iceBoneDagger");
            cactusBoneDagger = new InfiToolDagger(PropsHelperInfi2x2.boneDaggerID+7,
                    InfiMaterialEnum.Bone, InfiMaterialEnum.Cactus, "cactusBoneDagger");
            flintBoneDagger = new InfiToolDagger(PropsHelperInfi2x2.boneDaggerID+8,
                    InfiMaterialEnum.Bone, InfiMaterialEnum.Flint, "flintBoneDagger");
        }
        
        if(PropsHelperInfi2x2.enablePaperTools)
        {
            woodPaperDagger = new InfiToolDagger(PropsHelperInfi2x2.paperDaggerID+0, 
                    InfiMaterialEnum.Paper, InfiMaterialEnum.Wood, "woodPaperDagger");
            bonePaperDagger = new InfiToolDagger(PropsHelperInfi2x2.paperDaggerID+1, 
                    InfiMaterialEnum.Paper, InfiMaterialEnum.Bone, "bonePaperDagger");
            paperPaperDagger = new InfiToolDagger(PropsHelperInfi2x2.paperDaggerID+2, 
                    InfiMaterialEnum.Paper, InfiMaterialEnum.Paper, "paperPaperDagger");
            slimePaperDagger = new InfiToolDagger(PropsHelperInfi2x2.paperDaggerID+3,
                    InfiMaterialEnum.Paper, InfiMaterialEnum.Slime, "slimePaperDagger");
            cactusPaperDagger = new InfiToolDagger(PropsHelperInfi2x2.paperDaggerID+4,
                    InfiMaterialEnum.Paper, InfiMaterialEnum.Cactus, "cactusPaperDagger");
        }
        
        if(PropsHelperInfi2x2.enableMossyTools)
        {
            woodMossyDagger = new InfiToolDagger(PropsHelperInfi2x2.mossyDaggerID+0, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Wood, "woodMossyDagger");
            stoneMossyDagger = new InfiToolDagger(PropsHelperInfi2x2.mossyDaggerID+1, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Stone, "stoneMossyDagger");
            diamondMossyDagger = new InfiToolDagger(PropsHelperInfi2x2.mossyDaggerID+2, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Diamond, "diamondMossyDagger");
            redstoneMossyDagger = new InfiToolDagger(PropsHelperInfi2x2.mossyDaggerID+3, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Redstone, "redstoneMossyDagger");
            boneMossyDagger = new InfiToolDagger(PropsHelperInfi2x2.mossyDaggerID+4, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Bone, "boneMossyDagger");
            mossyMossyDagger = new InfiToolDagger(PropsHelperInfi2x2.mossyDaggerID+5, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Mossy, "mossyMossyDagger");
            netherrackMossyDagger = new InfiToolDagger(PropsHelperInfi2x2.mossyDaggerID+6, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Netherrack, "netherrackMossyDagger");
            glowstoneMossyDagger = new InfiToolDagger(PropsHelperInfi2x2.mossyDaggerID+7, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Glowstone, "glowstoneMossyDagger");
            cactusMossyDagger = new InfiToolDagger(PropsHelperInfi2x2.mossyDaggerID+8, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Cactus, "cactusMossyDagger");
            blazeMossyDagger = new InfiToolDagger(PropsHelperInfi2x2.mossyDaggerID+9, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Blaze, "blazeMossyDagger");
            manyullynMossyDagger = new InfiToolDagger(PropsHelperInfi2x2.mossyDaggerID+10, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Manyullyn, "manyullynMossyDagger");
            uraniumMossyDagger = new InfiToolDagger(PropsHelperInfi2x2.mossyDaggerID+11, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Uranium, "uraniumMossyDagger");
        }
        
        if(PropsHelperInfi2x2.enableNetherrackTools)
        {
            woodNetherrackDagger = new InfiToolDagger(PropsHelperInfi2x2.netherrackDaggerID+0, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Wood, "woodNetherrackDagger");
            stoneNetherrackDagger = new InfiToolDagger(PropsHelperInfi2x2.netherrackDaggerID+1, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Stone, "stoneNetherrackDagger");
            sandstoneNetherrackDagger = new InfiToolDagger(PropsHelperInfi2x2.netherrackDaggerID+2, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Sandstone, "sandstoneNetherrackDagger");
            boneNetherrackDagger = new InfiToolDagger(PropsHelperInfi2x2.netherrackDaggerID+3, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Bone, "boneNetherrackDagger");
            paperNetherrackDagger = new InfiToolDagger(PropsHelperInfi2x2.netherrackDaggerID+4, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Paper, "paperNetherrackDagger");
            mossyNetherrackDagger = new InfiToolDagger(PropsHelperInfi2x2.netherrackDaggerID+5, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Mossy, "mossyNetherrackDagger");
            netherrackNetherrackDagger = new InfiToolDagger(PropsHelperInfi2x2.netherrackDaggerID+6, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Netherrack, "netherrackNetherrackDagger");
            iceNetherrackDagger = new InfiToolDagger(PropsHelperInfi2x2.netherrackDaggerID+7, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Ice, "iceNetherrackDagger");
            slimeNetherrackDagger = new InfiToolDagger(PropsHelperInfi2x2.netherrackDaggerID+8, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Slime, "slimeNetherrackDagger");
            cactusNetherrackDagger = new InfiToolDagger(PropsHelperInfi2x2.netherrackDaggerID+9, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Cactus, "cactusNetherrackDagger");
            flintNetherrackDagger = new InfiToolDagger(PropsHelperInfi2x2.netherrackDaggerID+10, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Flint, "flintNetherrackDagger");
            copperNetherrackDagger = new InfiToolDagger(PropsHelperInfi2x2.netherrackDaggerID+11, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Copper, "copperNetherrackDagger");
            bronzeNetherrackDagger = new InfiToolDagger(PropsHelperInfi2x2.netherrackDaggerID+12, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Bronze, "bronzeNetherrackDagger");
            
            
            
            
            
            
            
            
            
            
            
            
            
            
        }
        
        if(PropsHelperInfi2x2.enableGlowstoneTools)
        {
            woodGlowstoneDagger = new InfiToolDagger(PropsHelperInfi2x2.glowstoneDaggerID+0, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Wood, "woodGlowstoneDagger");
            redstoneGlowstoneDagger = new InfiToolDagger(PropsHelperInfi2x2.glowstoneDaggerID+1, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Redstone, "redstoneGlowstoneDagger");
            obsidianGlowstoneDagger = new InfiToolDagger(PropsHelperInfi2x2.glowstoneDaggerID+2, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Obsidian, "obsidianGlowstoneDagger");
            boneGlowstoneDagger = new InfiToolDagger(PropsHelperInfi2x2.glowstoneDaggerID+3, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Bone, "boneGlowstoneDagger");
            netherrackGlowstoneDagger = new InfiToolDagger(PropsHelperInfi2x2.glowstoneDaggerID+4, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Netherrack, "netherrackGlowstoneDagger");
            glowstoneGlowstoneDagger = new InfiToolDagger(PropsHelperInfi2x2.glowstoneDaggerID+5, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Glowstone, "glowstoneGlowstoneDagger");
            iceGlowstoneDagger = new InfiToolDagger(PropsHelperInfi2x2.glowstoneDaggerID+6, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Ice, "iceGlowstoneDagger");
            slimeGlowstoneDagger = new InfiToolDagger(PropsHelperInfi2x2.glowstoneDaggerID+7, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Slime, "slimeGlowstoneDagger");
            cactusGlowstoneDagger = new InfiToolDagger(PropsHelperInfi2x2.glowstoneDaggerID+8, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Cactus, "cactusGlowstoneDagger");
            
            
            
            
            
            
            
            
            
            
            
        }
        
        if(PropsHelperInfi2x2.enableIceTools)
        {
            woodIceDagger = new InfiToolDagger(PropsHelperInfi2x2.iceDaggerID+0, 
                    InfiMaterialEnum.Ice, InfiMaterialEnum.Wood, "woodIceDagger");
            boneIceDagger = new InfiToolDagger(PropsHelperInfi2x2.iceDaggerID+1, 
                    InfiMaterialEnum.Ice, InfiMaterialEnum.Bone, "boneIceDagger");
            paperIceDagger = new InfiToolDagger(PropsHelperInfi2x2.iceDaggerID+2, 
                    InfiMaterialEnum.Ice, InfiMaterialEnum.Paper, "paperIceDagger");
            iceIceDagger = new InfiToolDagger(PropsHelperInfi2x2.iceDaggerID+3, 
                    InfiMaterialEnum.Ice, InfiMaterialEnum.Ice, "iceIceDagger");
            slimeIceDagger = new InfiToolDagger(PropsHelperInfi2x2.iceDaggerID+4, 
                    InfiMaterialEnum.Ice, InfiMaterialEnum.Slime, "slimeIceDagger");
            cactusIceDagger = new InfiToolDagger(PropsHelperInfi2x2.iceDaggerID+5, 
                    InfiMaterialEnum.Ice, InfiMaterialEnum.Cactus, "cactusIceDagger");
            
            
            
            
            
            
            
            
        }
        
        if(PropsHelperInfi2x2.enableLavaTools)
        {
            diamondLavaDagger = new InfiToolDagger(PropsHelperInfi2x2.lavaDaggerID+0, 
                    InfiMaterialEnum.Lava, InfiMaterialEnum.Diamond, "diamondLavaDagger");
            obsidianLavaDagger = new InfiToolDagger(PropsHelperInfi2x2.lavaDaggerID+1, 
                    InfiMaterialEnum.Lava, InfiMaterialEnum.Obsidian, "obsidianLavaDagger");
            netherrackLavaDagger = new InfiToolDagger(PropsHelperInfi2x2.lavaDaggerID+2, 
                    InfiMaterialEnum.Lava, InfiMaterialEnum.Netherrack, "netherrackLavaDagger");
            lavaLavaDagger = new InfiToolDagger(PropsHelperInfi2x2.lavaDaggerID+3, 
                    InfiMaterialEnum.Lava, InfiMaterialEnum.Lava, "lavaLavaDagger");
            flintLavaDagger = new InfiToolDagger(PropsHelperInfi2x2.lavaDaggerID+4, 
                    InfiMaterialEnum.Lava, InfiMaterialEnum.Flint, "flintLavaDagger");
            blazeLavaDagger = new InfiToolDagger(PropsHelperInfi2x2.lavaDaggerID+5, 
                    InfiMaterialEnum.Lava, InfiMaterialEnum.Blaze, "blazeLavaDagger");
            manyullynLavaDagger = new InfiToolDagger(PropsHelperInfi2x2.lavaDaggerID+6, 
                    InfiMaterialEnum.Lava, InfiMaterialEnum.Manyullyn, "manyullynLavaDagger");
            uraniumLavaDagger = new InfiToolDagger(PropsHelperInfi2x2.lavaDaggerID+7, 
                    InfiMaterialEnum.Lava, InfiMaterialEnum.Uranium, "uraniumLavaDagger");
            
            
            
            
            
            
            
            
            
        }
        
        if(PropsHelperInfi2x2.enableSlimeTools)
        {
            woodSlimeDagger = new InfiToolDagger(PropsHelperInfi2x2.slimeDaggerID+0, 
                    InfiMaterialEnum.Slime, InfiMaterialEnum.Wood, "woodSlimeDagger");
            sandstoneSlimeDagger = new InfiToolDagger(PropsHelperInfi2x2.slimeDaggerID+1, 
                    InfiMaterialEnum.Slime, InfiMaterialEnum.Sandstone, "sandstoneSlimeDagger");
            boneSlimeDagger = new InfiToolDagger(PropsHelperInfi2x2.slimeDaggerID+2, 
                    InfiMaterialEnum.Slime, InfiMaterialEnum.Bone, "boneSlimeDagger");
            paperSlimeDagger = new InfiToolDagger(PropsHelperInfi2x2.slimeDaggerID+3, 
                    InfiMaterialEnum.Slime, InfiMaterialEnum.Paper, "paperSlimeDagger");
            slimeSlimeDagger = new InfiToolDagger(PropsHelperInfi2x2.slimeDaggerID+4, 
                    InfiMaterialEnum.Slime, InfiMaterialEnum.Slime, "slimeSlimeDagger");
            cactusSlimeDagger = new InfiToolDagger(PropsHelperInfi2x2.slimeDaggerID+5, 
                    InfiMaterialEnum.Slime, InfiMaterialEnum.Cactus, "cactusSlimeDagger");
            
            
            
            
            
            
            
        }
        
        if(PropsHelperInfi2x2.enableCactusTools)
        {
            woodCactusDagger = new InfiToolDagger(PropsHelperInfi2x2.cactusDaggerID+0, 
                    InfiMaterialEnum.Cactus, InfiMaterialEnum.Wood, "woodCactusDagger");
            sandstoneCactusDagger = new InfiToolDagger(PropsHelperInfi2x2.cactusDaggerID+1, 
                    InfiMaterialEnum.Cactus, InfiMaterialEnum.Sandstone, "sandstoneCactusDagger");
            boneCactusDagger = new InfiToolDagger(PropsHelperInfi2x2.cactusDaggerID+2, 
                    InfiMaterialEnum.Cactus, InfiMaterialEnum.Bone, "boneCactusDagger");
            netherrackCactusDagger = new InfiToolDagger(PropsHelperInfi2x2.cactusDaggerID+3, 
                    InfiMaterialEnum.Cactus, InfiMaterialEnum.Netherrack, "netherrackCactusDagger");
            iceCactusDagger = new InfiToolDagger(PropsHelperInfi2x2.cactusDaggerID+4, 
                    InfiMaterialEnum.Cactus, InfiMaterialEnum.Ice, "iceCactusDagger");
            slimeCactusDagger = new InfiToolDagger(PropsHelperInfi2x2.cactusDaggerID+5, 
                    InfiMaterialEnum.Cactus, InfiMaterialEnum.Slime, "slimeCactusDagger");
            cactusCactusDagger = new InfiToolDagger(PropsHelperInfi2x2.cactusDaggerID+6, 
                    InfiMaterialEnum.Cactus, InfiMaterialEnum.Cactus, "cactusCactusDagger");
            
            
            
            
            
            
            
            
        }
        
        if(PropsHelperInfi2x2.enableFlintTools)
        {
            woodFlintDagger = new InfiToolDagger(PropsHelperInfi2x2.flintDaggerID+0, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Wood, "woodFlintDagger");
            stoneFlintDagger = new InfiToolDagger(PropsHelperInfi2x2.flintDaggerID+1, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Stone, "stoneFlintDagger");
            sandstoneFlintDagger = new InfiToolDagger(PropsHelperInfi2x2.flintDaggerID+2, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Sandstone, "sandstoneFlintDagger");
            boneFlintDagger = new InfiToolDagger(PropsHelperInfi2x2.flintDaggerID+3, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Bone, "boneFlintDagger");
            netherrackFlintDagger = new InfiToolDagger(PropsHelperInfi2x2.flintDaggerID+4, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Flint, "netherrackFlintDagger");
            slimeFlintDagger = new InfiToolDagger(PropsHelperInfi2x2.flintDaggerID+5, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Slime, "slimeFlintDagger");
            cactusFlintDagger = new InfiToolDagger(PropsHelperInfi2x2.flintDaggerID+6, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Cactus, "cactusFlintDagger");
            flintFlintDagger = new InfiToolDagger(PropsHelperInfi2x2.flintDaggerID+7, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Flint, "flintFlintDagger");
            copperFlintDagger = new InfiToolDagger(PropsHelperInfi2x2.flintDaggerID+8, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Copper, "copperFlintDagger");
            bronzeFlintDagger = new InfiToolDagger(PropsHelperInfi2x2.flintDaggerID+9, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Bronze, "bronzeFlintDagger");
            
            
            
            
            
            
            
            
            
            
            
        }
        
        if(PropsHelperInfi2x2.enableBlazeTools)
        {
            diamondBlazeDagger = new InfiToolDagger(PropsHelperInfi2x2.blazeDaggerID+0, 
                    InfiMaterialEnum.Blaze, InfiMaterialEnum.Diamond, "diamondBlazeDagger");
            obsidianBlazeDagger = new InfiToolDagger(PropsHelperInfi2x2.blazeDaggerID+1, 
                    InfiMaterialEnum.Blaze, InfiMaterialEnum.Obsidian, "obsidianBlazeDagger");
            netherrackBlazeDagger = new InfiToolDagger(PropsHelperInfi2x2.blazeDaggerID+2, 
                    InfiMaterialEnum.Blaze, InfiMaterialEnum.Netherrack, "netherrackBlazeDagger");
            lavaBlazeDagger = new InfiToolDagger(PropsHelperInfi2x2.blazeDaggerID+3, 
                    InfiMaterialEnum.Blaze, InfiMaterialEnum.Lava, "lavaBlazeDagger");
            flintBlazeDagger = new InfiToolDagger(PropsHelperInfi2x2.blazeDaggerID+4, 
                    InfiMaterialEnum.Blaze, InfiMaterialEnum.Flint, "flintBlazeDagger");
            blazeBlazeDagger = new InfiToolDagger(PropsHelperInfi2x2.blazeDaggerID+5, 
                    InfiMaterialEnum.Blaze, InfiMaterialEnum.Blaze, "blazeBlazeDagger");
            manyullynBlazeDagger = new InfiToolDagger(PropsHelperInfi2x2.blazeDaggerID+6, 
                    InfiMaterialEnum.Blaze, InfiMaterialEnum.Manyullyn, "manyullynBlazeDagger");
            uraniumBlazeDagger = new InfiToolDagger(PropsHelperInfi2x2.blazeDaggerID+7, 
                    InfiMaterialEnum.Blaze, InfiMaterialEnum.Uranium, "uraniumBlazeDagger");
            
            
            
            
            
            
            
            
            
        }
        
        if(PropsHelperInfi2x2.enableCopperTools)
        {
            woodCopperDagger = new InfiToolDagger(PropsHelperInfi2x2.copperDaggerID+0, 
                    InfiMaterialEnum.Copper, InfiMaterialEnum.Wood, "woodCopperDagger");
            stoneCopperDagger = new InfiToolDagger(PropsHelperInfi2x2.copperDaggerID+1, 
                    InfiMaterialEnum.Copper, InfiMaterialEnum.Stone, "stoneCopperDagger");
            boneCopperDagger = new InfiToolDagger(PropsHelperInfi2x2.copperDaggerID+2, 
                    InfiMaterialEnum.Copper, InfiMaterialEnum.Bone, "boneCopperDagger");
            netherrackCopperDagger = new InfiToolDagger(PropsHelperInfi2x2.copperDaggerID+3, 
                    InfiMaterialEnum.Copper, InfiMaterialEnum.Netherrack, "netherrackCopperDagger");
            slimeCopperDagger = new InfiToolDagger(PropsHelperInfi2x2.copperDaggerID+4, 
                    InfiMaterialEnum.Copper, InfiMaterialEnum.Slime, "slimeCopperDagger");
            cactusCopperDagger = new InfiToolDagger(PropsHelperInfi2x2.copperDaggerID+5, 
                    InfiMaterialEnum.Copper, InfiMaterialEnum.Cactus, "cactusCopperDagger");
            flintCopperDagger = new InfiToolDagger(PropsHelperInfi2x2.copperDaggerID+6, 
                    InfiMaterialEnum.Copper, InfiMaterialEnum.Flint, "flintCopperDagger");
            copperCopperDagger = new InfiToolDagger(PropsHelperInfi2x2.copperDaggerID+7, 
                    InfiMaterialEnum.Copper, InfiMaterialEnum.Copper, "copperCopperDagger");
            
            
            
            
            
            
            
            
            
        }
        
        if(PropsHelperInfi2x2.enableBronzeTools)
        {
            woodBronzeDagger = new InfiToolDagger(PropsHelperInfi2x2.bronzeDaggerID+0, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Wood, "woodBronzeDagger");
            stoneBronzeDagger = new InfiToolDagger(PropsHelperInfi2x2.bronzeDaggerID+1, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Stone, "stoneBronzeDagger");
            boneBronzeDagger = new InfiToolDagger(PropsHelperInfi2x2.bronzeDaggerID+2, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Bone, "boneBronzeDagger");
            netherrackBronzeDagger = new InfiToolDagger(PropsHelperInfi2x2.bronzeDaggerID+3, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Netherrack, "netherrackBronzeDagger");
            slimeBronzeDagger = new InfiToolDagger(PropsHelperInfi2x2.bronzeDaggerID+4, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Slime, "slimeBronzeDagger");
            cactusBronzeDagger = new InfiToolDagger(PropsHelperInfi2x2.bronzeDaggerID+5, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Cactus, "cactusBronzeDagger");
            flintBronzeDagger = new InfiToolDagger(PropsHelperInfi2x2.bronzeDaggerID+6, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Flint, "flintBronzeDagger");
            copperBronzeDagger = new InfiToolDagger(PropsHelperInfi2x2.bronzeDaggerID+7, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Copper, "copperBronzeDagger");
            bronzeBronzeDagger = new InfiToolDagger(PropsHelperInfi2x2.bronzeDaggerID+8, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Bronze, "bronzeBronzeDagger");
        }
        
        if(PropsHelperInfi2x2.enableWorkedIronTools)
        {
            woodWorkedIronDagger = new InfiToolDagger(PropsHelperInfi2x2.workedIronDaggerID+0, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Wood, "woodWorkedIronDagger");
            stoneWorkedIronDagger = new InfiToolDagger(PropsHelperInfi2x2.workedIronDaggerID+1, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Stone, "stoneWorkedIronDagger");
            ironWorkedIronDagger = new InfiToolDagger(PropsHelperInfi2x2.workedIronDaggerID+2,
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Iron, "ironWorkedIronDagger");
            diamondWorkedIronDagger = new InfiToolDagger(PropsHelperInfi2x2.workedIronDaggerID+3, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Diamond, "diamondWorkedIronDagger");
            redstoneWorkedIronDagger = new InfiToolDagger(PropsHelperInfi2x2.workedIronDaggerID+4, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Redstone, "redstoneWorkedIronDagger");
            obsidianWorkedIronDagger = new InfiToolDagger(PropsHelperInfi2x2.workedIronDaggerID+5, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Obsidian, "obsidianWorkedIronDagger");
            boneWorkedIronDagger = new InfiToolDagger(PropsHelperInfi2x2.workedIronDaggerID+6, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Bone, "boneWorkedIronDagger");
            netherrackWorkedIronDagger = new InfiToolDagger(PropsHelperInfi2x2.workedIronDaggerID+7, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Netherrack, "netherrackWorkedIronDagger");
            glowstoneWorkedIronDagger = new InfiToolDagger(PropsHelperInfi2x2.workedIronDaggerID+8, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Glowstone, "glowstoneWorkedIronDagger");
            iceWorkedIronDagger = new InfiToolDagger(PropsHelperInfi2x2.workedIronDaggerID+9, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Ice, "iceWorkedIronDagger");
            slimeWorkedIronDagger = new InfiToolDagger(PropsHelperInfi2x2.workedIronDaggerID+10, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Slime, "slimeWorkedIronDagger");
            cactusWorkedIronDagger = new InfiToolDagger(PropsHelperInfi2x2.workedIronDaggerID+11, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Cactus, "cactusWorkedIronDagger");
            blazeWorkedIronDagger = new InfiToolDagger(PropsHelperInfi2x2.workedIronDaggerID+12, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Blaze, "blazeWorkedIronDagger");
            copperWorkedIronDagger = new InfiToolDagger(PropsHelperInfi2x2.workedIronDaggerID+13, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Copper, "copperWorkedIronDagger");
            bronzeWorkedIronDagger = new InfiToolDagger(PropsHelperInfi2x2.workedIronDaggerID+14, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Bronze, "bronzeWorkedIronDagger");
            workedWorkedIronDagger = new InfiToolDagger(PropsHelperInfi2x2.workedIronDaggerID+15, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.WorkedIron, "workedWorkedIronDagger");
            steelWorkedIronDagger = new InfiToolDagger(PropsHelperInfi2x2.workedIronDaggerID+16, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Steel, "steelWorkedIronDagger");
            uraniumWorkedIronDagger = new InfiToolDagger(PropsHelperInfi2x2.workedIronDaggerID+17, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Bronze, "uraniumWorkedIronDagger");
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
        }
        
        if(PropsHelperInfi2x2.enableSteelTools)
        {
            woodSteelDagger = new InfiToolDagger(PropsHelperInfi2x2.steelDaggerID+0, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Wood, "woodSteelDagger");
            stoneSteelDagger = new InfiToolDagger(PropsHelperInfi2x2.steelDaggerID+1, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Stone, "stoneSteelDagger");
            ironSteelDagger = new InfiToolDagger(PropsHelperInfi2x2.steelDaggerID+2, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Iron, "ironSteelDagger");
            diamondSteelDagger = new InfiToolDagger(PropsHelperInfi2x2.steelDaggerID+3, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Diamond, "diamondSteelDagger");
            redstoneSteelDagger = new InfiToolDagger(PropsHelperInfi2x2.steelDaggerID+4, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Redstone, "redstoneSteelDagger");
            obsidianSteelDagger = new InfiToolDagger(PropsHelperInfi2x2.steelDaggerID+5, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Obsidian, "obsidianSteelDagger");
            boneSteelDagger = new InfiToolDagger(PropsHelperInfi2x2.steelDaggerID+6, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Bone, "boneSteelDagger");
            netherrackSteelDagger = new InfiToolDagger(PropsHelperInfi2x2.steelDaggerID+7, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Netherrack, "netherrackSteelDagger");
            glowstoneSteelDagger = new InfiToolDagger(PropsHelperInfi2x2.steelDaggerID+8, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Glowstone, "glowstoneSteelDagger");
            iceSteelDagger = new InfiToolDagger(PropsHelperInfi2x2.steelDaggerID+9, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Ice, "iceSteelDagger");
            slimeSteelDagger = new InfiToolDagger(PropsHelperInfi2x2.steelDaggerID+10, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Slime, "slimeSteelDagger");
            cactusSteelDagger = new InfiToolDagger(PropsHelperInfi2x2.steelDaggerID+11, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Cactus, "cactusSteelDagger");
            blazeSteelDagger = new InfiToolDagger(PropsHelperInfi2x2.steelDaggerID+12, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Blaze, "blazeSteelDagger");
            copperSteelDagger = new InfiToolDagger(PropsHelperInfi2x2.steelDaggerID+13, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Copper, "copperSteelDagger");
            bronzeSteelDagger = new InfiToolDagger(PropsHelperInfi2x2.steelDaggerID+14, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Bronze, "bronzeSteelDagger");
            workedSteelDagger = new InfiToolDagger(PropsHelperInfi2x2.steelDaggerID+15, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.WorkedIron, "workedSteelDagger");
            steelSteelDagger = new InfiToolDagger(PropsHelperInfi2x2.steelDaggerID+16, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Steel, "steelSteelDagger");
            cobaltSteelDagger = new InfiToolDagger(PropsHelperInfi2x2.steelDaggerID+17, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Cobalt, "cobaltSteelDagger");
            arditeSteelDagger = new InfiToolDagger(PropsHelperInfi2x2.steelDaggerID+18, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Ardite, "arditeSteelDagger");
            uraniumSteelDagger = new InfiToolDagger(PropsHelperInfi2x2.steelDaggerID+19, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Bronze, "uraniumSteelDagger");

            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
        }
        
        if(PropsHelperInfi2x2.enableCobaltTools)
        {
            woodCobaltDagger = new InfiToolDagger(PropsHelperInfi2x2.cobaltDaggerID+0, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Wood, "woodCobaltDagger");
            stoneCobaltDagger = new InfiToolDagger(PropsHelperInfi2x2.cobaltDaggerID+1, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Stone, "stoneCobaltDagger");
            ironCobaltDagger = new InfiToolDagger(PropsHelperInfi2x2.cobaltDaggerID+2, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Iron, "ironCobaltDagger");
            diamondCobaltDagger = new InfiToolDagger(PropsHelperInfi2x2.cobaltDaggerID+3,
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Diamond, "diamondCobaltDagger");
            redstoneCobaltDagger = new InfiToolDagger(PropsHelperInfi2x2.cobaltDaggerID+4, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Redstone, "redstoneCobaltDagger");
            obsidianCobaltDagger = new InfiToolDagger(PropsHelperInfi2x2.cobaltDaggerID+5, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Obsidian, "obsidianCobaltDagger");
            boneCobaltDagger = new InfiToolDagger(PropsHelperInfi2x2.cobaltDaggerID+6, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Bone, "boneCobaltDagger");
            slimeCobaltDagger = new InfiToolDagger(PropsHelperInfi2x2.cobaltDaggerID+7, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Slime, "slimeCobaltDagger");
            cactusCobaltDagger = new InfiToolDagger(PropsHelperInfi2x2.cobaltDaggerID+8, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Cactus, "cactusCobaltDagger");
            blazeCobaltDagger = new InfiToolDagger(PropsHelperInfi2x2.cobaltDaggerID+9, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Blaze, "blazeCobaltDagger");
            copperCobaltDagger = new InfiToolDagger(PropsHelperInfi2x2.cobaltDaggerID+10, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Copper, "copperCobaltDagger");
            bronzeCobaltDagger = new InfiToolDagger(PropsHelperInfi2x2.cobaltDaggerID+11, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Bronze, "bronzeCobaltDagger");
            workedCobaltDagger = new InfiToolDagger(PropsHelperInfi2x2.cobaltDaggerID+12, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.WorkedIron, "workedCobaltDagger");
            steelCobaltDagger = new InfiToolDagger(PropsHelperInfi2x2.cobaltDaggerID+13, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Steel, "steelCobaltDagger");
            cobaltCobaltDagger = new InfiToolDagger(PropsHelperInfi2x2.cobaltDaggerID+14, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Cobalt, "cobaltCobaltDagger");
            arditeCobaltDagger = new InfiToolDagger(PropsHelperInfi2x2.cobaltDaggerID+15, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Ardite, "arditeCobaltDagger");
            manyullynCobaltDagger = new InfiToolDagger(PropsHelperInfi2x2.cobaltDaggerID+16, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Manyullyn, "manyullynCobaltDagger");
            uraniumCobaltDagger = new InfiToolDagger(PropsHelperInfi2x2.cobaltDaggerID+17, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Bronze, "uraniumCobaltDagger");
        }
        
        if(PropsHelperInfi2x2.enableArditeTools)
        {
            woodArditeDagger = new InfiToolDagger(PropsHelperInfi2x2.arditeDaggerID+0, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Wood, "woodArditeDagger");
            stoneArditeDagger = new InfiToolDagger(PropsHelperInfi2x2.arditeDaggerID+1, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Stone, "stoneArditeDagger");
            ironArditeDagger = new InfiToolDagger(PropsHelperInfi2x2.arditeDaggerID+2, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Iron, "ironArditeDagger");
            diamondArditeDagger = new InfiToolDagger(PropsHelperInfi2x2.arditeDaggerID+3,
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Diamond, "diamondArditeDagger");
            redstoneArditeDagger = new InfiToolDagger(PropsHelperInfi2x2.arditeDaggerID+4, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Redstone, "redstoneArditeDagger");
            obsidianArditeDagger = new InfiToolDagger(PropsHelperInfi2x2.arditeDaggerID+5, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Obsidian, "obsidianArditeDagger");
            boneArditeDagger = new InfiToolDagger(PropsHelperInfi2x2.arditeDaggerID+6,
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Bone, "boneArditeDagger");
            slimeArditeDagger = new InfiToolDagger(PropsHelperInfi2x2.arditeDaggerID+7, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Slime, "slimeArditeDagger");
            cactusArditeDagger = new InfiToolDagger(PropsHelperInfi2x2.arditeDaggerID+8, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Cactus, "cactusArditeDagger");
            blazeArditeDagger = new InfiToolDagger(PropsHelperInfi2x2.arditeDaggerID+9, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Blaze, "blazeArditeDagger");
            copperArditeDagger = new InfiToolDagger(PropsHelperInfi2x2.arditeDaggerID+10, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Copper, "copperArditeDagger");
            bronzeArditeDagger = new InfiToolDagger(PropsHelperInfi2x2.arditeDaggerID+11, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Bronze, "bronzeArditeDagger");
            workedArditeDagger = new InfiToolDagger(PropsHelperInfi2x2.arditeDaggerID+12, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.WorkedIron, "workedArditeDagger");
            steelArditeDagger = new InfiToolDagger(PropsHelperInfi2x2.arditeDaggerID+13, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Steel, "steelArditeDagger");
            cobaltArditeDagger = new InfiToolDagger(PropsHelperInfi2x2.arditeDaggerID+14, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Cobalt, "cobaltArditeDagger");
            arditeArditeDagger = new InfiToolDagger(PropsHelperInfi2x2.arditeDaggerID+15, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Ardite, "arditeArditeDagger");
            manyullynArditeDagger = new InfiToolDagger(PropsHelperInfi2x2.arditeDaggerID+16, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Manyullyn, "manyullynArditeDagger");
            uraniumArditeDagger = new InfiToolDagger(PropsHelperInfi2x2.arditeDaggerID+17, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Bronze, "uraniumArditeDagger");
        }
        
        if(PropsHelperInfi2x2.enableManyullynTools)
        {
            woodManyullynDagger = new InfiToolDagger(PropsHelperInfi2x2.manyullynDaggerID+0, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Stone, "woodManyullynDagger");
            stoneManyullynDagger = new InfiToolDagger(PropsHelperInfi2x2.manyullynDaggerID+1, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Stone, "stoneManyullynDagger");
            ironManyullynDagger = new InfiToolDagger(PropsHelperInfi2x2.manyullynDaggerID+2, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Iron, "ironManyullynDagger");
            diamondManyullynDagger = new InfiToolDagger(PropsHelperInfi2x2.manyullynDaggerID+3,
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Diamond, "diamondManyullynDagger");
            redstoneManyullynDagger = new InfiToolDagger(PropsHelperInfi2x2.manyullynDaggerID+4, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Redstone, "redstoneManyullynDagger");
            obsidianManyullynDagger = new InfiToolDagger(PropsHelperInfi2x2.manyullynDaggerID+5, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Obsidian, "obsidianManyullynDagger");
            boneManyullynDagger = new InfiToolDagger(PropsHelperInfi2x2.manyullynDaggerID+6, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Bone, "boneManyullynDagger");
            slimeManyullynDagger = new InfiToolDagger(PropsHelperInfi2x2.manyullynDaggerID+7, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Slime, "slimeManyullynDagger");
            cactusManyullynDagger = new InfiToolDagger(PropsHelperInfi2x2.manyullynDaggerID+8, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Cactus, "cactusManyullynDagger");
            blazeManyullynDagger = new InfiToolDagger(PropsHelperInfi2x2.manyullynDaggerID+9, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Blaze, "blazeManyullynDagger");
            copperManyullynDagger = new InfiToolDagger(PropsHelperInfi2x2.manyullynDaggerID+10, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Copper, "copperManyullynDagger");
            bronzeManyullynDagger = new InfiToolDagger(PropsHelperInfi2x2.manyullynDaggerID+11, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Bronze, "bronzeManyullynDagger");
            workedManyullynDagger = new InfiToolDagger(PropsHelperInfi2x2.manyullynDaggerID+12, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.WorkedIron, "workedManyullynDagger");
            steelManyullynDagger = new InfiToolDagger(PropsHelperInfi2x2.manyullynDaggerID+13, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Steel, "steelManyullynDagger");
            cobaltManyullynDagger = new InfiToolDagger(PropsHelperInfi2x2.manyullynDaggerID+14, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Cobalt, "cobaltManyullynDagger");
            arditeManyullynDagger = new InfiToolDagger(PropsHelperInfi2x2.manyullynDaggerID+15, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Ardite, "arditeManyullynDagger");
            manyullynManyullynDagger = new InfiToolDagger(PropsHelperInfi2x2.manyullynDaggerID+16, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Manyullyn, "manyullynManyullynDagger");
            uraniumManyullynDagger = new InfiToolDagger(PropsHelperInfi2x2.manyullynDaggerID+17,
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Bronze, "uraniumManyullynDagger");
        }
        
        if(PropsHelperInfi2x2.enableUraniumTools)
        {
            diamondUraniumDagger = new InfiToolDagger(PropsHelperInfi2x2.uraniumDaggerID+0, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Diamond, "diamondUraniumDagger");
            redstoneUraniumDagger = new InfiToolDagger(PropsHelperInfi2x2.uraniumDaggerID+1, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Redstone, "redstoneUraniumDagger");
            boneUraniumDagger = new InfiToolDagger(PropsHelperInfi2x2.uraniumDaggerID+2, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Bone, "boneUraniumDagger");
            netherrackUraniumDagger = new InfiToolDagger(PropsHelperInfi2x2.uraniumDaggerID+3, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Netherrack, "netherrackUraniumDagger");
            glowstoneUraniumDagger = new InfiToolDagger(PropsHelperInfi2x2.uraniumDaggerID+4, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Glowstone, "glowstoneUraniumDagger");
            lavaUraniumDagger = new InfiToolDagger(PropsHelperInfi2x2.uraniumDaggerID+5, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Lava, "lavaUraniumDagger");
            blazeUraniumDagger = new InfiToolDagger(PropsHelperInfi2x2.uraniumDaggerID+6, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Blaze, "blazeUraniumDagger");
            cobaltUraniumDagger = new InfiToolDagger(PropsHelperInfi2x2.uraniumDaggerID+7, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Cobalt, "cobaltUraniumDagger");
            arditeUraniumDagger = new InfiToolDagger(PropsHelperInfi2x2.uraniumDaggerID+8, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Ardite, "arditeUraniumDagger");
            uraniumUraniumDagger = new InfiToolDagger(PropsHelperInfi2x2.uraniumDaggerID+9, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Uranium, "uraniumUraniumDagger");
        }
    }
    
    private static void addNames()
    {
        if(PropsHelperInfi2x2.enableWoodTools)
            ModLoader.addName(woodWoodDagger, "Wooden Dagger");
        if(PropsHelperInfi2x2.enableStoneTools)
            ModLoader.addName(stoneStoneDagger, "Heavy Dagger");
        if(PropsHelperInfi2x2.enableIronTools)
            ModLoader.addName(ironIronDagger, "Ironic Dagger");
        if(PropsHelperInfi2x2.enableDiamondTools)
            ModLoader.addName(diamondDiamondDagger, "Diamondium Dagger");
        if(PropsHelperInfi2x2.enableRedstoneTools)
            ModLoader.addName(redstoneRedstoneDagger, "Redredred Dagger");
        if(PropsHelperInfi2x2.enableObsidianTools)
            ModLoader.addName(obsidianObsidianDagger, "Ebony Dagger");
        if(PropsHelperInfi2x2.enableSandstoneTools)
            ModLoader.addName(sandstoneSandstoneDagger, "Fragile Dagger");
        if(PropsHelperInfi2x2.enableNetherrackTools)
            ModLoader.addName(boneBoneDagger, "Necrotic Dagger");
        if(PropsHelperInfi2x2.enablePaperTools)
            ModLoader.addName(paperPaperDagger, "Soft Dagger");
        if(PropsHelperInfi2x2.enableMossyTools)
            ModLoader.addName(mossyMossyDagger, "Living Dagger");
        if(PropsHelperInfi2x2.enableNetherrackTools)
            ModLoader.addName(netherrackNetherrackDagger, "Bloodsoaked Dagger");
        if(PropsHelperInfi2x2.enableGlowstoneTools)
            ModLoader.addName(glowstoneGlowstoneDagger, "Bright Dagger");
        if(PropsHelperInfi2x2.enableIceTools)
            ModLoader.addName(iceIceDagger, "Freezing Dagger");
        if(PropsHelperInfi2x2.enableLavaTools)
            ModLoader.addName(lavaLavaDagger, "Burning Dagger");
        if(PropsHelperInfi2x2.enableSlimeTools)
            ModLoader.addName(slimeSlimeDagger, "Toy Dagger");
        if(PropsHelperInfi2x2.enableCactusTools)
            ModLoader.addName(cactusCactusDagger, "Thorned Dagger");
        if(PropsHelperInfi2x2.enableFlintTools)
            ModLoader.addName(flintFlintDagger, "Rough-hewn Dagger");
        if(PropsHelperInfi2x2.enableBlazeTools)
            ModLoader.addName(blazeBlazeDagger, "Netherite Dagger");
        if(PropsHelperInfi2x2.enableCopperTools)
            ModLoader.addName(copperCopperDagger, "Orange-Tang Dagger");
        if(PropsHelperInfi2x2.enableBronzeTools)
            ModLoader.addName(bronzeBronzeDagger, "Polished Dagger");
        if(PropsHelperInfi2x2.enableWorkedIronTools)
            ModLoader.addName(workedWorkedIronDagger, "Reworked Iron Dagger");
        if(PropsHelperInfi2x2.enableSteelTools)
            ModLoader.addName(steelSteelDagger, "Forge-Wrought Dagger");
        if(PropsHelperInfi2x2.enableCobaltTools)
            ModLoader.addName(cobaltCobaltDagger, "Beautiful Dagger");
        if(PropsHelperInfi2x2.enableArditeTools)
            ModLoader.addName(arditeArditeDagger, "Rustic Dagger");
        if(PropsHelperInfi2x2.enableManyullynTools)
            ModLoader.addName(manyullynManyullynDagger, "False-Prophetic Dagger");
        if(PropsHelperInfi2x2.enableUraniumTools)
            ModLoader.addName(uraniumUraniumDagger, "Cancerous Dagger");
    }
    
    public static void registerInfiToolsRecipes()
    {
        if(PropsHelperInfi2x2.enableWoodTools)
        {
            ModLoader.addRecipe(new ItemStack(woodWoodDagger), new Object[] 
                    { recipe, '#', Block.planks, '|', Item.stick });
            ModLoader.addRecipe(new ItemStack(sandstoneWoodDagger), new Object[] 
                    { recipe, '#', Block.planks, '|', InfiLibrary.sandstoneRod });
            ModLoader.addRecipe(new ItemStack(boneWoodDagger), new Object[] 
                    { recipe, '#', Block.planks, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneWoodDagger), new Object[] 
                    { recipe, '#', Block.planks, '|', InfiLibrary.boneRod });
            ModLoader.addRecipe(new ItemStack(paperWoodDagger), new Object[] 
                    { recipe, '#', Block.planks, '|', InfiLibrary.paperRod });
            ModLoader.addRecipe(new ItemStack(iceWoodDagger), new Object[] 
                    { recipe, '#', Block.planks, '|', InfiLibrary.iceRod });
            ModLoader.addRecipe(new ItemStack(slimeWoodDagger), new Object[] 
                    { recipe, '#', Block.planks, '|', InfiLibrary.slimeRod });
            ModLoader.addRecipe(new ItemStack(cactusWoodDagger), new Object[] 
                    { recipe, '#', Block.planks, '|', InfiLibrary.cactusRod });
        }
        
        if(PropsHelperInfi2x2.enableStoneTools)
        {
            ModLoader.addRecipe(new ItemStack(woodStoneDagger), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', Item.stick });
            ModLoader.addRecipe(new ItemStack(stoneStoneDagger), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', InfiLibrary.stoneRod });
            ModLoader.addRecipe(new ItemStack(sandstoneStoneDagger), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', InfiLibrary.sandstoneRod });
            ModLoader.addRecipe(new ItemStack(boneStoneDagger), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneStoneDagger), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', InfiLibrary.boneRod });
            ModLoader.addRecipe(new ItemStack(netherrackStoneDagger), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', InfiLibrary.netherrackRod });
            ModLoader.addRecipe(new ItemStack(iceStoneDagger), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', InfiLibrary.iceRod });
            ModLoader.addRecipe(new ItemStack(slimeStoneDagger), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', InfiLibrary.slimeRod });
            ModLoader.addRecipe(new ItemStack(cactusStoneDagger), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', InfiLibrary.cactusRod });
            ModLoader.addRecipe(new ItemStack(flintStoneDagger), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', InfiLibrary.flintRod });
            
            ModLoader.addRecipe(new ItemStack(woodStoneDagger), new Object[] 
                    { recipe, '#', Block.stone, '|', Item.stick });
            ModLoader.addRecipe(new ItemStack(stoneStoneDagger), new Object[] 
                    { recipe, '#', Block.stone, '|', InfiLibrary.stoneRod });
            ModLoader.addRecipe(new ItemStack(sandstoneStoneDagger), new Object[] 
                    { recipe, '#', Block.stone, '|', InfiLibrary.sandstoneRod });
            ModLoader.addRecipe(new ItemStack(boneStoneDagger), new Object[] 
                    { recipe, '#', Block.stone, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneStoneDagger), new Object[] 
                    { recipe, '#', Block.stone, '|', InfiLibrary.boneRod });
            ModLoader.addRecipe(new ItemStack(netherrackStoneDagger), new Object[] 
                    { recipe, '#', Block.stone, '|', InfiLibrary.netherrackRod });
            ModLoader.addRecipe(new ItemStack(iceStoneDagger), new Object[] 
                    { recipe, '#', Block.stone, '|', InfiLibrary.iceRod });
            ModLoader.addRecipe(new ItemStack(slimeStoneDagger), new Object[] 
                    { recipe, '#', Block.stone, '|', InfiLibrary.slimeRod });
            ModLoader.addRecipe(new ItemStack(cactusStoneDagger), new Object[] 
                    { recipe, '#', Block.stone, '|', InfiLibrary.cactusRod });
            ModLoader.addRecipe(new ItemStack(flintStoneDagger), new Object[] 
                    { recipe, '#', Block.stone, '|', InfiLibrary.flintRod });
        }
        
        if(PropsHelperInfi2x2.enableIronTools)
        {
            ModLoader.addRecipe(new ItemStack(woodIronDagger), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', Item.stick });
            ModLoader.addRecipe(new ItemStack(stoneIronDagger), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', InfiLibrary.stoneRod });
            ModLoader.addRecipe(new ItemStack(ironIronDagger), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', InfiLibrary.ironRod });
            ModLoader.addRecipe(new ItemStack(boneIronDagger), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneIronDagger), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', InfiLibrary.boneRod });
            ModLoader.addRecipe(new ItemStack(netherrackIronDagger), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', InfiLibrary.netherrackRod });
            ModLoader.addRecipe(new ItemStack(glowstoneIronDagger), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', InfiLibrary.glowstoneRod });
            ModLoader.addRecipe(new ItemStack(cactusIronDagger), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', InfiLibrary.cactusRod });
            ModLoader.addRecipe(new ItemStack(copperIronDagger), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', InfiLibrary.copperRod });
            ModLoader.addRecipe(new ItemStack(bronzeIronDagger), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', InfiLibrary.bronzeRod });
        }
        
        if(PropsHelperInfi2x2.enableDiamondTools)
        {
            ModLoader.addRecipe(new ItemStack(woodDiamondDagger), new Object[] 
                    { recipe, '#', Item.diamond, '|', Item.stick });
            ModLoader.addRecipe(new ItemStack(stoneDiamondDagger), new Object[] 
                    { recipe, '#', Item.diamond, '|', InfiLibrary.stoneRod });
            ModLoader.addRecipe(new ItemStack(ironDiamondDagger), new Object[] 
                    { recipe, '#', Item.diamond, '|', InfiLibrary.ironRod });
            ModLoader.addRecipe(new ItemStack(diamondDiamondDagger), new Object[] 
                    { recipe, '#', Item.diamond, '|', InfiLibrary.diamondRod });
            ModLoader.addRecipe(new ItemStack(redstoneDiamondDagger), new Object[] 
                    { recipe, '#', Item.diamond, '|', InfiLibrary.redstoneRod });
            ModLoader.addRecipe(new ItemStack(obsidianDiamondDagger), new Object[] 
                    { recipe, '#', Item.diamond, '|', InfiLibrary.obsidianRod });
            ModLoader.addRecipe(new ItemStack(boneDiamondDagger), new Object[] 
                    { recipe, '#', Item.diamond, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneDiamondDagger), new Object[] 
                    { recipe, '#', Item.diamond, '|', InfiLibrary.boneRod });
            ModLoader.addRecipe(new ItemStack(mossyDiamondDagger), new Object[] 
                    { recipe, '#', Item.diamond, '|', InfiLibrary.mossyRod });
            ModLoader.addRecipe(new ItemStack(netherrackDiamondDagger), new Object[] 
                    { recipe, '#', Item.diamond, '|', InfiLibrary.netherrackRod });
            ModLoader.addRecipe(new ItemStack(glowstoneDiamondDagger), new Object[] 
                    { recipe, '#', Item.diamond, '|', InfiLibrary.glowstoneRod });
            ModLoader.addRecipe(new ItemStack(lavaDiamondDagger), new Object[] 
                    { recipe, '#', Item.diamond, '|', InfiLibrary.lavaRod });
            ModLoader.addRecipe(new ItemStack(cactusDiamondDagger), new Object[] 
                    { recipe, '#', Item.diamond, '|', InfiLibrary.cactusRod });
            ModLoader.addRecipe(new ItemStack(flintDiamondDagger), new Object[] 
                    { recipe, '#', Item.diamond, '|', InfiLibrary.flintRod });
            ModLoader.addRecipe(new ItemStack(blazeDiamondDagger), new Object[] 
                    { recipe, '#', Item.diamond, '|', Item.blazeRod });
            ModLoader.addRecipe(new ItemStack(copperDiamondDagger), new Object[] 
                    { recipe, '#', Item.diamond, '|', InfiLibrary.copperRod });
            ModLoader.addRecipe(new ItemStack(bronzeDiamondDagger), new Object[] 
                    { recipe, '#', Item.diamond, '|', InfiLibrary.bronzeRod });
            ModLoader.addRecipe(new ItemStack(workedDiamondDagger), new Object[] 
                    { recipe, '#', Item.diamond, '|', InfiLibrary.workedIronRod });
            ModLoader.addRecipe(new ItemStack(steelDiamondDagger), new Object[] 
                    { recipe, '#', Item.diamond, '|', InfiLibrary.steelRod });
            ModLoader.addRecipe(new ItemStack(cobaltDiamondDagger), new Object[] 
                    { recipe, '#', Item.diamond, '|', InfiLibrary.cobaltRod });
            ModLoader.addRecipe(new ItemStack(arditeDiamondDagger), new Object[] 
                    { recipe, '#', Item.diamond, '|', InfiLibrary.arditeRod });
            ModLoader.addRecipe(new ItemStack(manyullynDiamondDagger), new Object[] 
                    { recipe, '#', Item.diamond, '|', InfiLibrary.manyullynRod });
            ModLoader.addRecipe(new ItemStack(uraniumDiamondDagger), new Object[] 
                    { recipe, '#', Item.diamond, '|', InfiLibrary.uraniumRod });
        }
        
        if(PropsHelperInfi2x2.enableRedstoneTools)
        {
            ModLoader.addRecipe(new ItemStack(woodRedstoneDagger), new Object[] 
                    { recipe, '#', InfiLibrary.redstoneCrystal, '|', Item.stick });
            ModLoader.addRecipe(new ItemStack(stoneRedstoneDagger), new Object[] 
                    { recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.stoneRod });
            ModLoader.addRecipe(new ItemStack(ironRedstoneDagger), new Object[] 
                    { recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.ironRod });
            ModLoader.addRecipe(new ItemStack(redstoneRedstoneDagger), new Object[] 
                    { recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.redstoneRod });
            ModLoader.addRecipe(new ItemStack(obsidianRedstoneDagger), new Object[] 
                    { recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.obsidianRod });
            ModLoader.addRecipe(new ItemStack(sandstoneRedstoneDagger), new Object[] 
                    { recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.sandstoneRod });
            ModLoader.addRecipe(new ItemStack(boneRedstoneDagger), new Object[] 
                    { recipe, '#', InfiLibrary.redstoneCrystal, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneRedstoneDagger), new Object[] 
                    { recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.boneRod });
            ModLoader.addRecipe(new ItemStack(paperRedstoneDagger), new Object[] 
                    { recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.paperRod });
            ModLoader.addRecipe(new ItemStack(mossyRedstoneDagger), new Object[] 
                    { recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.mossyRod });
            ModLoader.addRecipe(new ItemStack(netherrackRedstoneDagger), new Object[] 
                    { recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.netherrackRod });
            ModLoader.addRecipe(new ItemStack(glowstoneRedstoneDagger), new Object[] 
                    { recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.glowstoneRod });
            ModLoader.addRecipe(new ItemStack(iceRedstoneDagger), new Object[] 
                    { recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.iceRod });
            ModLoader.addRecipe(new ItemStack(lavaRedstoneDagger), new Object[] 
                    { recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.lavaRod });
            ModLoader.addRecipe(new ItemStack(slimeRedstoneDagger), new Object[] 
                    { recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.slimeRod });
            ModLoader.addRecipe(new ItemStack(cactusRedstoneDagger), new Object[] 
                    { recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.cactusRod });
            ModLoader.addRecipe(new ItemStack(flintRedstoneDagger), new Object[] 
                    { recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.flintRod });
            ModLoader.addRecipe(new ItemStack(copperRedstoneDagger), new Object[] 
                    { recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.copperRod });
            ModLoader.addRecipe(new ItemStack(bronzeRedstoneDagger), new Object[] 
                    { recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.bronzeRod });
            ModLoader.addRecipe(new ItemStack(workedRedstoneDagger), new Object[] 
                    { recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.workedIronRod });
            ModLoader.addRecipe(new ItemStack(uraniumRedstoneDagger), new Object[] 
                    { recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.uraniumRod });
        }
        
        if(PropsHelperInfi2x2.enableObsidianTools)
        {
            ModLoader.addRecipe(new ItemStack(woodObsidianDagger), new Object[] 
                    { recipe, '#', Block.obsidian, '|', Item.stick });
            ModLoader.addRecipe(new ItemStack(stoneObsidianDagger), new Object[] 
                    { recipe, '#', Block.obsidian, '|', InfiLibrary.stoneRod });
            ModLoader.addRecipe(new ItemStack(redstoneObsidianDagger), new Object[] 
                    { recipe, '#', Block.obsidian, '|', InfiLibrary.redstoneRod });
            ModLoader.addRecipe(new ItemStack(obsidianObsidianDagger), new Object[] 
                    { recipe, '#', Block.obsidian, '|', InfiLibrary.obsidianRod });
            ModLoader.addRecipe(new ItemStack(boneObsidianDagger), new Object[] 
                    { recipe, '#', Block.obsidian, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneObsidianDagger), new Object[] 
                    { recipe, '#', Block.obsidian, '|', InfiLibrary.boneRod });
            ModLoader.addRecipe(new ItemStack(netherrackObsidianDagger), new Object[] 
                    { recipe, '#', Block.obsidian, '|', InfiLibrary.netherrackRod });
            ModLoader.addRecipe(new ItemStack(glowstoneObsidianDagger), new Object[] 
                    { recipe, '#', Block.obsidian, '|', InfiLibrary.glowstoneRod });
            ModLoader.addRecipe(new ItemStack(iceObsidianDagger), new Object[] 
                    { recipe, '#', Block.obsidian, '|', InfiLibrary.iceRod });
            ModLoader.addRecipe(new ItemStack(lavaObsidianDagger), new Object[] 
                    { recipe, '#', Block.obsidian, '|', InfiLibrary.lavaRod });
            ModLoader.addRecipe(new ItemStack(cactusObsidianDagger), new Object[] 
                    { recipe, '#', Block.obsidian, '|', InfiLibrary.cactusRod });
        }
        
        if(PropsHelperInfi2x2.enableSandstoneTools)
        {
            ModLoader.addRecipe(new ItemStack(woodSandstoneDagger), new Object[] 
                    { recipe, '#', Block.sandStone, '|', Item.stick });
            ModLoader.addRecipe(new ItemStack(sandstoneSandstoneDagger), new Object[] 
                    { recipe, '#', Block.sandStone, '|', InfiLibrary.sandstoneRod });
            ModLoader.addRecipe(new ItemStack(boneSandstoneDagger), new Object[] 
                    { recipe, '#', Block.sandStone, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneSandstoneDagger), new Object[] 
                    { recipe, '#', Block.sandStone, '|', InfiLibrary.boneRod });      
            ModLoader.addRecipe(new ItemStack(netherrackSandstoneDagger), new Object[] 
                    { recipe, '#', Block.sandStone, '|', InfiLibrary.netherrackRod });
            ModLoader.addRecipe(new ItemStack(iceSandstoneDagger), new Object[] 
                    { recipe, '#', Block.sandStone, '|', InfiLibrary.iceRod });
            ModLoader.addRecipe(new ItemStack(slimeSandstoneDagger), new Object[] 
                    { recipe, '#', Block.sandStone, '|', InfiLibrary.slimeRod });
            ModLoader.addRecipe(new ItemStack(cactusSandstoneDagger), new Object[] 
                    { recipe, '#', Block.sandStone, '|', InfiLibrary.cactusRod });
            ModLoader.addRecipe(new ItemStack(flintSandstoneDagger), new Object[] 
                    { recipe, '#', Block.sandStone, '|', InfiLibrary.flintRod });
        }
        
        if(PropsHelperInfi2x2.enableBoneTools)
        {
            ModLoader.addRecipe(new ItemStack(woodBoneDagger), new Object[] 
                    { recipe, '#', Item.bone, '|', Item.stick });
            ModLoader.addRecipe(new ItemStack(stoneBoneDagger), new Object[] 
                    { recipe, '#', Item.bone, '|', InfiLibrary.stoneRod });
            ModLoader.addRecipe(new ItemStack(sandstoneBoneDagger), new Object[] 
                    { recipe, '#', Item.bone, '|', InfiLibrary.sandstoneRod });
            ModLoader.addRecipe(new ItemStack(boneBoneDagger), new Object[] 
                    { recipe, '#', Item.bone, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneBoneDagger), new Object[] 
                    { recipe, '#', Item.bone, '|', InfiLibrary.boneRod });
            ModLoader.addRecipe(new ItemStack(paperBoneDagger), new Object[] 
                    { recipe, '#', Item.bone, '|', InfiLibrary.paperRod });
            ModLoader.addRecipe(new ItemStack(netherrackBoneDagger), new Object[] 
                    { recipe, '#', Item.bone, '|', InfiLibrary.netherrackRod });
            ModLoader.addRecipe(new ItemStack(iceBoneDagger), new Object[] 
                    { recipe, '#', Item.bone, '|', InfiLibrary.iceRod });
            ModLoader.addRecipe(new ItemStack(cactusBoneDagger), new Object[] 
                    { recipe, '#', Item.bone, '|', InfiLibrary.cactusRod });
            ModLoader.addRecipe(new ItemStack(flintBoneDagger), new Object[] 
                    { recipe, '#', Item.bone, '|', InfiLibrary.flintRod });
        }
        
        if(PropsHelperInfi2x2.enablePaperTools)
        {
            ModLoader.addRecipe(new ItemStack(woodPaperDagger), new Object[] 
                    { recipe, '#', InfiLibrary.paperStack, '|', Item.stick });
            ModLoader.addRecipe(new ItemStack(bonePaperDagger), new Object[] 
                    { recipe, '#', InfiLibrary.paperStack, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(bonePaperDagger), new Object[] 
                    { recipe, '#', InfiLibrary.paperStack, '|', InfiLibrary.boneRod });
            ModLoader.addRecipe(new ItemStack(paperPaperDagger), new Object[] 
                    { recipe, '#', InfiLibrary.paperStack, '|', InfiLibrary.paperRod });
            ModLoader.addRecipe(new ItemStack(slimePaperDagger), new Object[] 
                    { recipe, '#', InfiLibrary.paperStack, '|', InfiLibrary.slimeRod });
            ModLoader.addRecipe(new ItemStack(cactusPaperDagger), new Object[] 
                    { recipe, '#', InfiLibrary.paperStack, '|', InfiLibrary.cactusRod });
        }
        
        if(PropsHelperInfi2x2.enableMossyTools)
        {
            ModLoader.addRecipe(new ItemStack(woodMossyDagger), new Object[] 
                    { recipe, '#', InfiLibrary.mossyStone, '|', Item.stick });
            ModLoader.addRecipe(new ItemStack(stoneMossyDagger), new Object[] 
                    { recipe, '#', InfiLibrary.mossyStone, '|', InfiLibrary.stoneRod });
            ModLoader.addRecipe(new ItemStack(diamondMossyDagger), new Object[] 
                    { recipe, '#', InfiLibrary.mossyStone, '|', InfiLibrary.diamondRod });
            ModLoader.addRecipe(new ItemStack(redstoneMossyDagger), new Object[] 
                    { recipe, '#', InfiLibrary.mossyStone, '|', InfiLibrary.redstoneRod });
            ModLoader.addRecipe(new ItemStack(boneMossyDagger), new Object[] 
                    { recipe, '#', InfiLibrary.mossyStone, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneMossyDagger), new Object[] 
                    { recipe, '#', InfiLibrary.mossyStone, '|', InfiLibrary.boneRod });
            ModLoader.addRecipe(new ItemStack(mossyMossyDagger), new Object[] 
                    { recipe, '#', InfiLibrary.mossyStone, '|', InfiLibrary.mossyRod });
            ModLoader.addRecipe(new ItemStack(netherrackMossyDagger), new Object[] 
                    { recipe, '#', InfiLibrary.mossyStone, '|', InfiLibrary.netherrackRod });
            ModLoader.addRecipe(new ItemStack(glowstoneMossyDagger), new Object[] 
                    { recipe, '#', InfiLibrary.mossyStone, '|', InfiLibrary.glowstoneRod });
            ModLoader.addRecipe(new ItemStack(cactusMossyDagger), new Object[] 
                    { recipe, '#', InfiLibrary.mossyStone, '|', InfiLibrary.cactusRod });
            ModLoader.addRecipe(new ItemStack(blazeMossyDagger), new Object[] 
                    { recipe, '#', InfiLibrary.mossyStone, '|', Item.blazeRod });
            ModLoader.addRecipe(new ItemStack(manyullynMossyDagger), new Object[] 
                    { recipe, '#', InfiLibrary.mossyStone, '|', InfiLibrary.manyullynRod });
            ModLoader.addRecipe(new ItemStack(uraniumMossyDagger), new Object[] 
                    { recipe, '#', InfiLibrary.mossyStone, '|', InfiLibrary.uraniumRod });
        }
        
        if(PropsHelperInfi2x2.enableNetherrackTools)
        {
            ModLoader.addRecipe(new ItemStack(woodNetherrackDagger), new Object[] 
                    { recipe, '#', Block.netherrack, '|', Item.stick });
            ModLoader.addRecipe(new ItemStack(stoneNetherrackDagger), new Object[] 
                    { recipe, '#', Block.netherrack, '|', InfiLibrary.stoneRod });
            ModLoader.addRecipe(new ItemStack(sandstoneNetherrackDagger), new Object[] 
                    { recipe, '#', Block.netherrack, '|', InfiLibrary.sandstoneRod });
            ModLoader.addRecipe(new ItemStack(boneNetherrackDagger), new Object[] 
                    { recipe, '#', Block.netherrack, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneNetherrackDagger), new Object[] 
                    { recipe, '#', Block.netherrack, '|', InfiLibrary.boneRod });
            ModLoader.addRecipe(new ItemStack(paperNetherrackDagger), new Object[] 
                    { recipe, '#', Block.netherrack, '|', InfiLibrary.paperRod });
            ModLoader.addRecipe(new ItemStack(mossyNetherrackDagger), new Object[] 
                    { recipe, '#', Block.netherrack, '|', InfiLibrary.mossyRod });
            ModLoader.addRecipe(new ItemStack(netherrackNetherrackDagger), new Object[] 
                    { recipe, '#', Block.netherrack, '|', InfiLibrary.netherrackRod });
            ModLoader.addRecipe(new ItemStack(iceNetherrackDagger), new Object[] 
                    { recipe, '#', Block.netherrack, '|', InfiLibrary.iceRod });
            ModLoader.addRecipe(new ItemStack(slimeNetherrackDagger), new Object[] 
                    { recipe, '#', Block.netherrack, '|', InfiLibrary.slimeRod });
            ModLoader.addRecipe(new ItemStack(cactusNetherrackDagger), new Object[] 
                    { recipe, '#', Block.netherrack, '|', InfiLibrary.cactusRod });
            ModLoader.addRecipe(new ItemStack(flintNetherrackDagger), new Object[] 
                    { recipe, '#', Block.netherrack, '|', InfiLibrary.flintRod });
            ModLoader.addRecipe(new ItemStack(copperNetherrackDagger), new Object[] 
                    { recipe, '#', Block.netherrack, '|', InfiLibrary.copperRod });
            ModLoader.addRecipe(new ItemStack(bronzeNetherrackDagger), new Object[] 
                    { recipe, '#', Block.netherrack, '|', InfiLibrary.bronzeRod });
        }
        
        if(PropsHelperInfi2x2.enableGlowstoneTools)
        {
            ModLoader.addRecipe(new ItemStack(woodGlowstoneDagger), new Object[] 
                    { recipe, '#', InfiLibrary.glowstoneCrystal, '|', Item.stick });
            ModLoader.addRecipe(new ItemStack(redstoneGlowstoneDagger), new Object[] 
                    { recipe, '#', InfiLibrary.glowstoneCrystal, '|', InfiLibrary.redstoneRod });
            ModLoader.addRecipe(new ItemStack(obsidianGlowstoneDagger), new Object[] 
                    { recipe, '#', InfiLibrary.glowstoneCrystal, '|', InfiLibrary.obsidianRod });
            ModLoader.addRecipe(new ItemStack(boneGlowstoneDagger), new Object[] 
                    { recipe, '#', InfiLibrary.glowstoneCrystal, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneGlowstoneDagger), new Object[] 
                    { recipe, '#', InfiLibrary.glowstoneCrystal, '|', InfiLibrary.boneRod });
            ModLoader.addRecipe(new ItemStack(netherrackGlowstoneDagger), new Object[] 
                    { recipe, '#', InfiLibrary.glowstoneCrystal, '|', InfiLibrary.netherrackRod });
            ModLoader.addRecipe(new ItemStack(glowstoneGlowstoneDagger), new Object[] 
                    { recipe, '#', InfiLibrary.glowstoneCrystal, '|', InfiLibrary.glowstoneRod });
            ModLoader.addRecipe(new ItemStack(iceGlowstoneDagger), new Object[] 
                    { recipe, '#', InfiLibrary.glowstoneCrystal, '|', InfiLibrary.iceRod });
            ModLoader.addRecipe(new ItemStack(slimeGlowstoneDagger), new Object[] 
                    { recipe, '#', InfiLibrary.glowstoneCrystal, '|', InfiLibrary.slimeRod });
            ModLoader.addRecipe(new ItemStack(cactusGlowstoneDagger), new Object[] 
                    { recipe, '#', InfiLibrary.glowstoneCrystal, '|', InfiLibrary.cactusRod });
        }
        
        if(PropsHelperInfi2x2.enableIceTools)
        {
            ModLoader.addRecipe(new ItemStack(woodIceDagger), new Object[] 
                    { recipe, '#', Block.ice, '|', Item.stick });
            ModLoader.addRecipe(new ItemStack(boneIceDagger), new Object[] 
                    { recipe, '#', Block.ice, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneIceDagger), new Object[] 
                    { recipe, '#', Block.ice, '|', InfiLibrary.boneRod });
            ModLoader.addRecipe(new ItemStack(paperIceDagger), new Object[] 
                    { recipe, '#', Block.ice, '|', InfiLibrary.paperRod });
            ModLoader.addRecipe(new ItemStack(iceIceDagger), new Object[] 
                    { recipe, '#', Block.ice, '|', InfiLibrary.iceRod });
            ModLoader.addRecipe(new ItemStack(slimeIceDagger), new Object[] 
                    { recipe, '#', Block.ice, '|', InfiLibrary.slimeRod });
            ModLoader.addRecipe(new ItemStack(cactusIceDagger), new Object[] 
                    { recipe, '#', Block.ice, '|', InfiLibrary.cactusRod });
        }
        
        if(PropsHelperInfi2x2.enableLavaTools)
        {
            ModLoader.addRecipe(new ItemStack(diamondLavaDagger), new Object[] 
                    { recipe, '#', InfiLibrary.lavaCrystal, '|', InfiLibrary.diamondRod });
            ModLoader.addRecipe(new ItemStack(obsidianLavaDagger), new Object[] 
                    { recipe, '#', InfiLibrary.lavaCrystal, '|', InfiLibrary.obsidianRod });
            ModLoader.addRecipe(new ItemStack(netherrackLavaDagger), new Object[] 
                    { recipe, '#', InfiLibrary.lavaCrystal, '|', InfiLibrary.netherrackRod });
            ModLoader.addRecipe(new ItemStack(lavaLavaDagger), new Object[] 
                    { recipe, '#', InfiLibrary.lavaCrystal, '|', InfiLibrary.lavaRod });
            ModLoader.addRecipe(new ItemStack(flintLavaDagger), new Object[] 
                    { recipe, '#', InfiLibrary.lavaCrystal, '|', InfiLibrary.flintRod });
            ModLoader.addRecipe(new ItemStack(blazeLavaDagger), new Object[] 
                    { recipe, '#', InfiLibrary.lavaCrystal, '|', Item.blazeRod });
            ModLoader.addRecipe(new ItemStack(manyullynLavaDagger), new Object[] 
                    { recipe, '#', InfiLibrary.lavaCrystal, '|', InfiLibrary.manyullynRod });
            ModLoader.addRecipe(new ItemStack(uraniumLavaDagger), new Object[] 
                    { recipe, '#', InfiLibrary.lavaCrystal, '|', InfiLibrary.uraniumRod });
        }
        
        if(PropsHelperInfi2x2.enableSlimeTools)
        {
            ModLoader.addRecipe(new ItemStack(woodSlimeDagger), new Object[] 
                    { recipe, '#', InfiLibrary.slimeCrystal, '|', Item.stick });
            ModLoader.addRecipe(new ItemStack(sandstoneSlimeDagger), new Object[] 
                    { recipe, '#', InfiLibrary.slimeCrystal, '|', InfiLibrary.sandstoneRod });
            ModLoader.addRecipe(new ItemStack(boneSlimeDagger), new Object[] 
                    { recipe, '#', InfiLibrary.slimeCrystal, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneSlimeDagger), new Object[] 
                    { recipe, '#', InfiLibrary.slimeCrystal, '|', InfiLibrary.boneRod });
            ModLoader.addRecipe(new ItemStack(paperSlimeDagger), new Object[] 
                    { recipe, '#', InfiLibrary.slimeCrystal, '|', InfiLibrary.paperRod });
            ModLoader.addRecipe(new ItemStack(slimeSlimeDagger), new Object[] 
                    { recipe, '#', InfiLibrary.slimeCrystal, '|', InfiLibrary.slimeRod });
            ModLoader.addRecipe(new ItemStack(cactusSlimeDagger), new Object[] 
                    { recipe, '#', InfiLibrary.slimeCrystal, '|', InfiLibrary.cactusRod });
        }
        
        if(PropsHelperInfi2x2.enableCactusTools)
        {
            ModLoader.addRecipe(new ItemStack(woodCactusDagger), new Object[] 
                    { recipe, '#', Block.cactus, '|', Item.stick });
            ModLoader.addRecipe(new ItemStack(sandstoneCactusDagger), new Object[] 
                    { recipe, '#', Block.cactus, '|', InfiLibrary.sandstoneRod });
            ModLoader.addRecipe(new ItemStack(boneCactusDagger), new Object[] 
                    { recipe, '#', Block.cactus, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneCactusDagger), new Object[] 
                    { recipe, '#', Block.cactus, '|', InfiLibrary.boneRod });
            ModLoader.addRecipe(new ItemStack(netherrackCactusDagger), new Object[] 
                    { recipe, '#', Block.cactus, '|', InfiLibrary.netherrackRod });
            ModLoader.addRecipe(new ItemStack(iceCactusDagger), new Object[] 
                    { recipe, '#', Block.cactus, '|', InfiLibrary.iceRod });
            ModLoader.addRecipe(new ItemStack(slimeCactusDagger), new Object[] 
                    { recipe, '#', Block.cactus, '|', InfiLibrary.slimeRod });
            ModLoader.addRecipe(new ItemStack(cactusCactusDagger), new Object[] 
                    { recipe, '#', Block.cactus, '|', InfiLibrary.cactusRod });
        }
        
        if(PropsHelperInfi2x2.enableFlintTools)
        {
            ModLoader.addRecipe(new ItemStack(woodFlintDagger), new Object[] 
                    { recipe, '#', Item.flint, '|', Item.stick });
            ModLoader.addRecipe(new ItemStack(stoneFlintDagger), new Object[] 
                    { recipe, '#', Item.flint, '|', InfiLibrary.stoneRod });
            ModLoader.addRecipe(new ItemStack(sandstoneFlintDagger), new Object[] 
                    { recipe, '#', Item.flint, '|', InfiLibrary.sandstoneRod });
            ModLoader.addRecipe(new ItemStack(boneFlintDagger), new Object[] 
                    { recipe, '#', Item.flint, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneFlintDagger), new Object[] 
                    { recipe, '#', Item.flint, '|', InfiLibrary.boneRod });
            ModLoader.addRecipe(new ItemStack(netherrackFlintDagger), new Object[] 
                    { recipe, '#', Item.flint, '|', InfiLibrary.netherrackRod });
            ModLoader.addRecipe(new ItemStack(slimeFlintDagger), new Object[] 
                    { recipe, '#', Item.flint, '|', InfiLibrary.slimeRod });
            ModLoader.addRecipe(new ItemStack(cactusFlintDagger), new Object[] 
                    { recipe, '#', Item.flint, '|', InfiLibrary.cactusRod });
            ModLoader.addRecipe(new ItemStack(flintFlintDagger), new Object[] 
                    { recipe, '#', Item.flint, '|', InfiLibrary.flintRod });
            ModLoader.addRecipe(new ItemStack(copperFlintDagger), new Object[] 
                    { recipe, '#', Item.flint, '|', InfiLibrary.copperRod });
            ModLoader.addRecipe(new ItemStack(bronzeFlintDagger), new Object[] 
                    { recipe, '#', Item.flint, '|', InfiLibrary.bronzeRod });
        }
        
        if(PropsHelperInfi2x2.enableBlazeTools)
        {
            ModLoader.addRecipe(new ItemStack(diamondBlazeDagger), new Object[] 
                    { recipe, '#', InfiLibrary.blazeCrystal, '|', InfiLibrary.diamondRod });
            ModLoader.addRecipe(new ItemStack(obsidianBlazeDagger), new Object[] 
                    { recipe, '#', InfiLibrary.blazeCrystal, '|', InfiLibrary.obsidianRod });
            ModLoader.addRecipe(new ItemStack(netherrackBlazeDagger), new Object[] 
                    { recipe, '#', InfiLibrary.blazeCrystal, '|', InfiLibrary.netherrackRod });
            ModLoader.addRecipe(new ItemStack(lavaBlazeDagger), new Object[] 
                    { recipe, '#', InfiLibrary.blazeCrystal, '|', InfiLibrary.lavaRod });
            ModLoader.addRecipe(new ItemStack(flintBlazeDagger), new Object[] 
                    { recipe, '#', InfiLibrary.blazeCrystal, '|', InfiLibrary.flintRod });
            ModLoader.addRecipe(new ItemStack(blazeBlazeDagger), new Object[] 
                    { recipe, '#', InfiLibrary.blazeCrystal, '|', Item.blazeRod });
            ModLoader.addRecipe(new ItemStack(manyullynBlazeDagger), new Object[] 
                    { recipe, '#', InfiLibrary.blazeCrystal, '|', InfiLibrary.manyullynRod });
            ModLoader.addRecipe(new ItemStack(uraniumBlazeDagger), new Object[] 
                    { recipe, '#', InfiLibrary.blazeCrystal, '|', InfiLibrary.uraniumRod });
        }
    }
    
    public static void addStoneTools(ItemStack stack)
    {
        ModLoader.addRecipe(new ItemStack(woodStoneDagger), new Object[] 
                { recipe, '#', stack, '|', Item.stick });
        ModLoader.addRecipe(new ItemStack(stoneStoneDagger), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.stoneRod });
        ModLoader.addRecipe(new ItemStack(sandstoneStoneDagger), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.sandstoneRod });
        ModLoader.addRecipe(new ItemStack(boneStoneDagger), new Object[] 
                { recipe, '#', stack, '|', Item.bone });
        ModLoader.addRecipe(new ItemStack(boneStoneDagger), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.boneRod });
        ModLoader.addRecipe(new ItemStack(netherrackStoneDagger), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.netherrackRod });
        ModLoader.addRecipe(new ItemStack(iceStoneDagger), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.iceRod });
        ModLoader.addRecipe(new ItemStack(slimeStoneDagger), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.slimeRod });
        ModLoader.addRecipe(new ItemStack(cactusStoneDagger), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.cactusRod });
        ModLoader.addRecipe(new ItemStack(flintStoneDagger), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.flintRod });
    }
    
    public static void addCopperTools(ItemStack stack)
    {
        ModLoader.addRecipe(new ItemStack(woodCopperDagger), new Object[] 
                { recipe, '#', stack, '|', Item.stick });
        ModLoader.addRecipe(new ItemStack(stoneCopperDagger), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.stoneRod });
        ModLoader.addRecipe(new ItemStack(boneCopperDagger), new Object[] 
                { recipe, '#', stack, '|', Item.bone });
        ModLoader.addRecipe(new ItemStack(boneCopperDagger), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.boneRod });
        ModLoader.addRecipe(new ItemStack(netherrackCopperDagger), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.netherrackRod });
        ModLoader.addRecipe(new ItemStack(slimeCopperDagger), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.slimeRod });
        ModLoader.addRecipe(new ItemStack(cactusCopperDagger), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.cactusRod });
        ModLoader.addRecipe(new ItemStack(flintCopperDagger), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.flintRod });
        ModLoader.addRecipe(new ItemStack(copperCopperDagger), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.copperRod });
    }
    
    public static void addBronzeTools(ItemStack stack)
    {
        ModLoader.addRecipe(new ItemStack(woodBronzeDagger), new Object[] 
                { recipe, '#', stack, '|', Item.stick });
        ModLoader.addRecipe(new ItemStack(stoneBronzeDagger), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.stoneRod });
        ModLoader.addRecipe(new ItemStack(boneBronzeDagger), new Object[] 
                { recipe, '#', stack, '|', Item.bone });
        ModLoader.addRecipe(new ItemStack(boneBronzeDagger), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.boneRod });
        ModLoader.addRecipe(new ItemStack(netherrackBronzeDagger), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.netherrackRod });
        ModLoader.addRecipe(new ItemStack(slimeBronzeDagger), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.slimeRod });
        ModLoader.addRecipe(new ItemStack(cactusBronzeDagger), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.cactusRod });
        ModLoader.addRecipe(new ItemStack(flintBronzeDagger), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.flintRod });
        ModLoader.addRecipe(new ItemStack(copperBronzeDagger), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.copperRod });
        ModLoader.addRecipe(new ItemStack(bronzeBronzeDagger), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.bronzeRod });
    }
    
    public static void addWorkedIronTools(ItemStack stack)
    {
        ModLoader.addRecipe(new ItemStack(woodWorkedIronDagger), new Object[] 
                { recipe, '#', stack, '|', Item.stick });
        ModLoader.addRecipe(new ItemStack(stoneWorkedIronDagger), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.stoneRod });
        ModLoader.addRecipe(new ItemStack(ironWorkedIronDagger), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.ironRod });
        ModLoader.addRecipe(new ItemStack(diamondWorkedIronDagger), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.diamondRod });
        ModLoader.addRecipe(new ItemStack(redstoneWorkedIronDagger), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.redstoneRod });
        ModLoader.addRecipe(new ItemStack(obsidianWorkedIronDagger), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.obsidianRod });
        ModLoader.addRecipe(new ItemStack(boneWorkedIronDagger), new Object[] 
                { recipe, '#', stack, '|', Item.bone });
        ModLoader.addRecipe(new ItemStack(boneWorkedIronDagger), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.boneRod });
        ModLoader.addRecipe(new ItemStack(netherrackWorkedIronDagger), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.netherrackRod });
        ModLoader.addRecipe(new ItemStack(glowstoneWorkedIronDagger), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.glowstoneRod });
        ModLoader.addRecipe(new ItemStack(iceWorkedIronDagger), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.iceRod });
        ModLoader.addRecipe(new ItemStack(slimeWorkedIronDagger), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.slimeRod });
        ModLoader.addRecipe(new ItemStack(cactusWorkedIronDagger), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.cactusRod });
        ModLoader.addRecipe(new ItemStack(blazeWorkedIronDagger), new Object[] 
                { recipe, '#', stack, '|', Item.blazeRod });
        ModLoader.addRecipe(new ItemStack(copperWorkedIronDagger), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.copperRod });
        ModLoader.addRecipe(new ItemStack(bronzeWorkedIronDagger), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.bronzeRod });
        ModLoader.addRecipe(new ItemStack(workedWorkedIronDagger), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.workedIronRod });
        ModLoader.addRecipe(new ItemStack(steelWorkedIronDagger), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.steelRod });
        ModLoader.addRecipe(new ItemStack(uraniumWorkedIronDagger), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.uraniumRod });
    }
    
    public static void addSteelTools(ItemStack stack)
    {
        ModLoader.addRecipe(new ItemStack(woodSteelDagger), new Object[] 
                { recipe, '#', stack, '|', Item.stick });
        ModLoader.addRecipe(new ItemStack(stoneSteelDagger), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.stoneRod });
        ModLoader.addRecipe(new ItemStack(ironSteelDagger), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.ironRod });
        ModLoader.addRecipe(new ItemStack(diamondSteelDagger), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.diamondRod });
        ModLoader.addRecipe(new ItemStack(redstoneSteelDagger), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.redstoneRod });
        ModLoader.addRecipe(new ItemStack(obsidianSteelDagger), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.obsidianRod });
        ModLoader.addRecipe(new ItemStack(boneSteelDagger), new Object[] 
                { recipe, '#', stack, '|', Item.bone });
        ModLoader.addRecipe(new ItemStack(boneSteelDagger), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.boneRod });
        ModLoader.addRecipe(new ItemStack(netherrackSteelDagger), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.netherrackRod });
        ModLoader.addRecipe(new ItemStack(glowstoneSteelDagger), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.glowstoneRod });
        ModLoader.addRecipe(new ItemStack(iceSteelDagger), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.iceRod });
        ModLoader.addRecipe(new ItemStack(slimeSteelDagger), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.slimeRod });
        ModLoader.addRecipe(new ItemStack(cactusSteelDagger), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.cactusRod });
        ModLoader.addRecipe(new ItemStack(blazeSteelDagger), new Object[] 
                { recipe, '#', stack, '|', Item.blazeRod });
        ModLoader.addRecipe(new ItemStack(copperSteelDagger), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.copperRod });
        ModLoader.addRecipe(new ItemStack(bronzeSteelDagger), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.bronzeRod });
        ModLoader.addRecipe(new ItemStack(workedSteelDagger), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.workedIronRod });
        ModLoader.addRecipe(new ItemStack(steelSteelDagger), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.steelRod });
        ModLoader.addRecipe(new ItemStack(cobaltSteelDagger), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.cobaltRod });
        ModLoader.addRecipe(new ItemStack(arditeSteelDagger), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.arditeRod });
        ModLoader.addRecipe(new ItemStack(uraniumSteelDagger), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.uraniumRod });
    }
    
    public static void addCobaltTools(ItemStack stack)
    {
        ModLoader.addRecipe(new ItemStack(woodCobaltDagger), new Object[] 
                { recipe, '#', stack, '|', Item.stick });
        ModLoader.addRecipe(new ItemStack(stoneCobaltDagger), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.stoneRod });
        ModLoader.addRecipe(new ItemStack(ironCobaltDagger), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.ironRod });
        ModLoader.addRecipe(new ItemStack(diamondCobaltDagger), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.diamondRod });
        ModLoader.addRecipe(new ItemStack(redstoneCobaltDagger), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.redstoneRod });
        ModLoader.addRecipe(new ItemStack(obsidianCobaltDagger), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.obsidianRod });
        ModLoader.addRecipe(new ItemStack(boneCobaltDagger), new Object[] 
                { recipe, '#', stack, '|', Item.bone });
        ModLoader.addRecipe(new ItemStack(boneCobaltDagger), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.boneRod });
        ModLoader.addRecipe(new ItemStack(slimeCobaltDagger), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.slimeRod });
        ModLoader.addRecipe(new ItemStack(cactusCobaltDagger), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.cactusRod });
        ModLoader.addRecipe(new ItemStack(blazeCobaltDagger), new Object[] 
                { recipe, '#', stack, '|', Item.blazeRod });
        ModLoader.addRecipe(new ItemStack(copperCobaltDagger), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.copperRod });
        ModLoader.addRecipe(new ItemStack(bronzeCobaltDagger), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.bronzeRod });
        ModLoader.addRecipe(new ItemStack(workedCobaltDagger), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.workedIronRod });
        ModLoader.addRecipe(new ItemStack(steelCobaltDagger), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.steelRod });
        ModLoader.addRecipe(new ItemStack(cobaltCobaltDagger), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.cobaltRod });
        ModLoader.addRecipe(new ItemStack(arditeCobaltDagger), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.arditeRod });
        ModLoader.addRecipe(new ItemStack(manyullynCobaltDagger), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.manyullynRod });
        ModLoader.addRecipe(new ItemStack(uraniumCobaltDagger), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.uraniumRod });
    }
    
    public static void addArditeTools(ItemStack stack)
    {
        ModLoader.addRecipe(new ItemStack(woodArditeDagger), new Object[] 
                { recipe, '#', stack, '|', Item.stick });
        ModLoader.addRecipe(new ItemStack(stoneArditeDagger), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.stoneRod });
        ModLoader.addRecipe(new ItemStack(ironArditeDagger), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.ironRod });
        ModLoader.addRecipe(new ItemStack(diamondArditeDagger), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.diamondRod });
        ModLoader.addRecipe(new ItemStack(redstoneArditeDagger), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.redstoneRod });
        ModLoader.addRecipe(new ItemStack(obsidianArditeDagger), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.obsidianRod });
        ModLoader.addRecipe(new ItemStack(boneArditeDagger), new Object[] 
                { recipe, '#', stack, '|', Item.bone });
        ModLoader.addRecipe(new ItemStack(boneArditeDagger), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.boneRod });
        ModLoader.addRecipe(new ItemStack(slimeArditeDagger), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.slimeRod });
        ModLoader.addRecipe(new ItemStack(cactusArditeDagger), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.cactusRod });
        ModLoader.addRecipe(new ItemStack(blazeArditeDagger), new Object[] 
                { recipe, '#', stack, '|', Item.blazeRod });
        ModLoader.addRecipe(new ItemStack(copperArditeDagger), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.copperRod });
        ModLoader.addRecipe(new ItemStack(bronzeArditeDagger), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.bronzeRod });
        ModLoader.addRecipe(new ItemStack(workedArditeDagger), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.workedIronRod });
        ModLoader.addRecipe(new ItemStack(steelArditeDagger), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.steelRod });
        ModLoader.addRecipe(new ItemStack(cobaltArditeDagger), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.cobaltRod });
        ModLoader.addRecipe(new ItemStack(arditeArditeDagger), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.arditeRod });
        ModLoader.addRecipe(new ItemStack(manyullynArditeDagger), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.manyullynRod });
        ModLoader.addRecipe(new ItemStack(uraniumArditeDagger), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.uraniumRod });
    }
    
    public static void addManyullynTools(ItemStack stack)
    {
        ModLoader.addRecipe(new ItemStack(woodManyullynDagger), new Object[] 
                { recipe, '#', stack, '|', Item.stick });
        ModLoader.addRecipe(new ItemStack(stoneManyullynDagger), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.stoneRod });
        ModLoader.addRecipe(new ItemStack(ironManyullynDagger), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.ironRod });
        ModLoader.addRecipe(new ItemStack(diamondManyullynDagger), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.diamondRod });
        ModLoader.addRecipe(new ItemStack(redstoneManyullynDagger), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.redstoneRod });
        ModLoader.addRecipe(new ItemStack(obsidianManyullynDagger), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.obsidianRod });
        ModLoader.addRecipe(new ItemStack(boneManyullynDagger), new Object[] 
                { recipe, '#', stack, '|', Item.bone });
        ModLoader.addRecipe(new ItemStack(boneManyullynDagger), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.boneRod });
        ModLoader.addRecipe(new ItemStack(slimeManyullynDagger), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.slimeRod });
        ModLoader.addRecipe(new ItemStack(cactusManyullynDagger), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.cactusRod });
        ModLoader.addRecipe(new ItemStack(blazeManyullynDagger), new Object[] 
                { recipe, '#', stack, '|', Item.blazeRod });
        ModLoader.addRecipe(new ItemStack(copperManyullynDagger), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.copperRod });
        ModLoader.addRecipe(new ItemStack(bronzeManyullynDagger), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.bronzeRod });
        ModLoader.addRecipe(new ItemStack(workedManyullynDagger), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.workedIronRod });
        ModLoader.addRecipe(new ItemStack(steelManyullynDagger), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.steelRod });
        ModLoader.addRecipe(new ItemStack(cobaltManyullynDagger), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.cobaltRod });
        ModLoader.addRecipe(new ItemStack(arditeManyullynDagger), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.arditeRod });
        ModLoader.addRecipe(new ItemStack(manyullynManyullynDagger), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.manyullynRod });
        ModLoader.addRecipe(new ItemStack(uraniumManyullynDagger), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.uraniumRod });
    }
    
    public static void addUraniumTools(ItemStack stack)
    {
        ModLoader.addRecipe(new ItemStack(diamondUraniumDagger), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.diamondRod });
        ModLoader.addRecipe(new ItemStack(redstoneUraniumDagger), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.redstoneRod });
        ModLoader.addRecipe(new ItemStack(boneUraniumDagger), new Object[] 
                { recipe, '#', stack, '|', Item.bone });
        ModLoader.addRecipe(new ItemStack(boneUraniumDagger), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.boneRod });
        ModLoader.addRecipe(new ItemStack(netherrackUraniumDagger), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.netherrackRod });
        ModLoader.addRecipe(new ItemStack(glowstoneUraniumDagger), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.glowstoneRod });
        ModLoader.addRecipe(new ItemStack(lavaUraniumDagger), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.lavaRod });
        ModLoader.addRecipe(new ItemStack(blazeUraniumDagger), new Object[] 
                { recipe, '#', stack, '|', Item.blazeRod });
        ModLoader.addRecipe(new ItemStack(cobaltUraniumDagger), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.cobaltRod });
        ModLoader.addRecipe(new ItemStack(arditeUraniumDagger), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.arditeRod });
        ModLoader.addRecipe(new ItemStack(uraniumUraniumDagger), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.uraniumRod });
    }
    
    public static Item woodWoodDagger;
    public static Item sandstoneWoodDagger;
    public static Item boneWoodDagger;
    public static Item paperWoodDagger;
    public static Item iceWoodDagger;
    public static Item slimeWoodDagger;
    public static Item cactusWoodDagger;
    
    public static Item woodStoneDagger;
    public static Item stoneStoneDagger;
    public static Item sandstoneStoneDagger;
    public static Item boneStoneDagger;
    public static Item netherrackStoneDagger;
    public static Item iceStoneDagger;
    public static Item slimeStoneDagger;
    public static Item cactusStoneDagger;
    public static Item flintStoneDagger;
    
    public static Item woodIronDagger;
    public static Item stoneIronDagger;
    public static Item ironIronDagger;
    public static Item boneIronDagger;
    public static Item netherrackIronDagger;
    public static Item glowstoneIronDagger;
    public static Item cactusIronDagger;
    public static Item copperIronDagger;
    public static Item bronzeIronDagger;
    
    public static Item woodDiamondDagger;
    public static Item stoneDiamondDagger;
    public static Item ironDiamondDagger;
    public static Item diamondDiamondDagger;
    public static Item redstoneDiamondDagger;
    public static Item obsidianDiamondDagger;
    public static Item boneDiamondDagger;
    public static Item mossyDiamondDagger;
    public static Item netherrackDiamondDagger;
    public static Item glowstoneDiamondDagger;
    public static Item lavaDiamondDagger;
    public static Item cactusDiamondDagger;
    public static Item flintDiamondDagger;
    public static Item blazeDiamondDagger;
    public static Item copperDiamondDagger;
    public static Item bronzeDiamondDagger;
    public static Item workedDiamondDagger;
    public static Item steelDiamondDagger;
    public static Item cobaltDiamondDagger;
    public static Item arditeDiamondDagger;
    public static Item manyullynDiamondDagger;
    public static Item uraniumDiamondDagger;
    
    public static Item woodRedstoneDagger;
    public static Item stoneRedstoneDagger;
    public static Item ironRedstoneDagger;
    public static Item redstoneRedstoneDagger;
    public static Item obsidianRedstoneDagger;
    public static Item sandstoneRedstoneDagger;
    public static Item boneRedstoneDagger;
    public static Item paperRedstoneDagger;
    public static Item mossyRedstoneDagger;
    public static Item netherrackRedstoneDagger;
    public static Item glowstoneRedstoneDagger;
    public static Item iceRedstoneDagger;
    public static Item lavaRedstoneDagger;
    public static Item slimeRedstoneDagger;
    public static Item cactusRedstoneDagger;
    public static Item flintRedstoneDagger;
    public static Item copperRedstoneDagger;
    public static Item bronzeRedstoneDagger;
    public static Item workedRedstoneDagger;
    public static Item uraniumRedstoneDagger;
    
    public static Item woodObsidianDagger;
    public static Item stoneObsidianDagger;
    public static Item redstoneObsidianDagger;
    public static Item obsidianObsidianDagger;
    public static Item boneObsidianDagger;
    public static Item netherrackObsidianDagger;
    public static Item glowstoneObsidianDagger;
    public static Item iceObsidianDagger;
    public static Item lavaObsidianDagger;
    public static Item cactusObsidianDagger;
    
    public static Item woodSandstoneDagger;
    public static Item sandstoneSandstoneDagger;
    public static Item boneSandstoneDagger;
    public static Item netherrackSandstoneDagger;
    public static Item iceSandstoneDagger;
    public static Item slimeSandstoneDagger;
    public static Item cactusSandstoneDagger;
    public static Item flintSandstoneDagger;
    
    public static Item woodBoneDagger;
    public static Item stoneBoneDagger;
    public static Item sandstoneBoneDagger;
    public static Item boneBoneDagger;
    public static Item paperBoneDagger;
    public static Item netherrackBoneDagger;
    public static Item iceBoneDagger;
    public static Item cactusBoneDagger;
    public static Item flintBoneDagger;
    
    public static Item woodPaperDagger;
    public static Item bonePaperDagger;
    public static Item paperPaperDagger;
    public static Item slimePaperDagger;
    public static Item cactusPaperDagger;
    
    public static Item woodMossyDagger;
    public static Item stoneMossyDagger;
    public static Item diamondMossyDagger;
    public static Item redstoneMossyDagger;
    public static Item boneMossyDagger;
    public static Item mossyMossyDagger;
    public static Item netherrackMossyDagger;
    public static Item glowstoneMossyDagger;
    public static Item cactusMossyDagger;
    public static Item blazeMossyDagger;
    public static Item manyullynMossyDagger;
    public static Item uraniumMossyDagger;
    
    public static Item woodNetherrackDagger;
    public static Item stoneNetherrackDagger;
    public static Item sandstoneNetherrackDagger;
    public static Item boneNetherrackDagger;
    public static Item paperNetherrackDagger;
    public static Item mossyNetherrackDagger;
    public static Item netherrackNetherrackDagger;
    public static Item iceNetherrackDagger;
    public static Item slimeNetherrackDagger;
    public static Item cactusNetherrackDagger;
    public static Item flintNetherrackDagger;
    public static Item copperNetherrackDagger;
    public static Item bronzeNetherrackDagger;
    
    public static Item woodGlowstoneDagger;
    public static Item redstoneGlowstoneDagger;
    public static Item obsidianGlowstoneDagger;
    public static Item boneGlowstoneDagger;
    public static Item netherrackGlowstoneDagger;
    public static Item glowstoneGlowstoneDagger;
    public static Item iceGlowstoneDagger;
    public static Item slimeGlowstoneDagger;
    public static Item cactusGlowstoneDagger;
    
    public static Item woodIceDagger;
    public static Item boneIceDagger;
    public static Item paperIceDagger;
    public static Item iceIceDagger;
    public static Item slimeIceDagger;
    public static Item cactusIceDagger;
    
    public static Item diamondLavaDagger;
    public static Item obsidianLavaDagger;
    public static Item netherrackLavaDagger;
    public static Item lavaLavaDagger;
    public static Item flintLavaDagger;
    public static Item blazeLavaDagger;
    public static Item manyullynLavaDagger;
    public static Item uraniumLavaDagger;
    
    public static Item woodSlimeDagger;
    public static Item sandstoneSlimeDagger;
    public static Item boneSlimeDagger;
    public static Item paperSlimeDagger;
    public static Item slimeSlimeDagger;
    public static Item cactusSlimeDagger;
    
    public static Item woodCactusDagger;
    public static Item sandstoneCactusDagger;
    public static Item boneCactusDagger;
    public static Item netherrackCactusDagger;
    public static Item iceCactusDagger;
    public static Item slimeCactusDagger;
    public static Item cactusCactusDagger;
    
    public static Item woodFlintDagger;
    public static Item stoneFlintDagger;
    public static Item sandstoneFlintDagger;
    public static Item boneFlintDagger;
    public static Item netherrackFlintDagger;
    public static Item slimeFlintDagger;
    public static Item cactusFlintDagger;
    public static Item flintFlintDagger;
    public static Item copperFlintDagger;
    public static Item bronzeFlintDagger;
    
    public static Item diamondBlazeDagger;
    public static Item obsidianBlazeDagger;
    public static Item netherrackBlazeDagger;
    public static Item lavaBlazeDagger;
    public static Item flintBlazeDagger;
    public static Item blazeBlazeDagger;
    public static Item manyullynBlazeDagger;
    public static Item uraniumBlazeDagger;
    
    public static Item woodCopperDagger;
    public static Item stoneCopperDagger;
    public static Item boneCopperDagger;
    public static Item netherrackCopperDagger;
    public static Item slimeCopperDagger;
    public static Item cactusCopperDagger;
    public static Item flintCopperDagger;
    public static Item copperCopperDagger;
    
    public static Item woodBronzeDagger;
    public static Item stoneBronzeDagger;
    public static Item boneBronzeDagger;
    public static Item netherrackBronzeDagger;
    public static Item slimeBronzeDagger;
    public static Item cactusBronzeDagger;
    public static Item flintBronzeDagger;
    public static Item copperBronzeDagger;
    public static Item bronzeBronzeDagger;
    
    public static Item woodWorkedIronDagger;
    public static Item stoneWorkedIronDagger;
    public static Item ironWorkedIronDagger;
    public static Item diamondWorkedIronDagger;
    public static Item redstoneWorkedIronDagger;
    public static Item obsidianWorkedIronDagger;
    public static Item boneWorkedIronDagger;
    public static Item netherrackWorkedIronDagger;
    public static Item glowstoneWorkedIronDagger;
    public static Item iceWorkedIronDagger;
    public static Item slimeWorkedIronDagger;
    public static Item cactusWorkedIronDagger;
    public static Item blazeWorkedIronDagger;
    public static Item copperWorkedIronDagger;
    public static Item bronzeWorkedIronDagger;
    public static Item workedWorkedIronDagger;
    public static Item steelWorkedIronDagger;
    public static Item uraniumWorkedIronDagger;
    
    public static Item woodSteelDagger;
    public static Item stoneSteelDagger;
    public static Item ironSteelDagger;
    public static Item diamondSteelDagger;
    public static Item redstoneSteelDagger;
    public static Item obsidianSteelDagger;
    public static Item boneSteelDagger;
    public static Item netherrackSteelDagger;
    public static Item glowstoneSteelDagger;
    public static Item iceSteelDagger;
    public static Item slimeSteelDagger;
    public static Item cactusSteelDagger;
    public static Item blazeSteelDagger;
    public static Item copperSteelDagger;
    public static Item bronzeSteelDagger;
    public static Item workedSteelDagger;
    public static Item steelSteelDagger;
    public static Item cobaltSteelDagger;
    public static Item arditeSteelDagger;
    public static Item uraniumSteelDagger;
    
    public static Item woodCobaltDagger;
    public static Item stoneCobaltDagger;
    public static Item ironCobaltDagger;
    public static Item diamondCobaltDagger;
    public static Item redstoneCobaltDagger;
    public static Item obsidianCobaltDagger;
    public static Item boneCobaltDagger;
    public static Item slimeCobaltDagger;
    public static Item cactusCobaltDagger;
    public static Item blazeCobaltDagger;
    public static Item copperCobaltDagger;
    public static Item bronzeCobaltDagger;
    public static Item workedCobaltDagger;
    public static Item steelCobaltDagger;
    public static Item cobaltCobaltDagger;
    public static Item arditeCobaltDagger;
    public static Item manyullynCobaltDagger;
    public static Item uraniumCobaltDagger;
    
    public static Item woodArditeDagger;
    public static Item stoneArditeDagger;
    public static Item ironArditeDagger;
    public static Item diamondArditeDagger;
    public static Item redstoneArditeDagger;
    public static Item obsidianArditeDagger;
    public static Item boneArditeDagger;
    public static Item slimeArditeDagger;
    public static Item cactusArditeDagger;
    public static Item blazeArditeDagger;
    public static Item copperArditeDagger;
    public static Item bronzeArditeDagger;
    public static Item workedArditeDagger;
    public static Item steelArditeDagger;
    public static Item cobaltArditeDagger;
    public static Item arditeArditeDagger;
    public static Item manyullynArditeDagger;
    public static Item uraniumArditeDagger;
    
    public static Item woodManyullynDagger;
    public static Item stoneManyullynDagger;
    public static Item ironManyullynDagger;
    public static Item diamondManyullynDagger;
    public static Item redstoneManyullynDagger;
    public static Item obsidianManyullynDagger;
    public static Item boneManyullynDagger;
    public static Item slimeManyullynDagger;
    public static Item cactusManyullynDagger;
    public static Item blazeManyullynDagger;
    public static Item copperManyullynDagger;
    public static Item bronzeManyullynDagger;
    public static Item workedManyullynDagger;
    public static Item steelManyullynDagger;
    public static Item cobaltManyullynDagger;
    public static Item arditeManyullynDagger;
    public static Item manyullynManyullynDagger;
    public static Item uraniumManyullynDagger;
    
    public static Item diamondUraniumDagger;
    public static Item redstoneUraniumDagger;
    public static Item boneUraniumDagger;
    public static Item netherrackUraniumDagger;
    public static Item glowstoneUraniumDagger;
    public static Item lavaUraniumDagger;
    public static Item blazeUraniumDagger;
    public static Item cobaltUraniumDagger;
    public static Item arditeUraniumDagger;
    public static Item uraniumUraniumDagger;
}
