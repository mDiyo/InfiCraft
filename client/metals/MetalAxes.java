package net.minecraft.src.metals;

import net.minecraft.src.InfiMaterialEnum;
import net.minecraft.src.Block;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;
import net.minecraft.src.ModLoader;
import net.minecraft.src.mod_InfiMetals;
import net.minecraft.src.mod_InfiTools;

public class MetalAxes 
{
    public static MetalAxes instance = new MetalAxes();
    
    public static MetalAxes getInstance()
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
        if(PropsHelperInfiMetals.enableCopperTools)
        {
            stoneCopperAxe = new MetalToolAxe(PropsHelperInfiMetals.copperAxeID+0, 
                    InfiMaterialEnum.Copper, InfiMaterialEnum.Stone, "stoneCopperAxe");
            boneCopperAxe = new MetalToolAxe(PropsHelperInfiMetals.copperAxeID+1, 
                    InfiMaterialEnum.Copper, InfiMaterialEnum.Bone, "boneCopperAxe");
            netherrackCopperAxe = new MetalToolAxe(PropsHelperInfiMetals.copperAxeID+2, 
                    InfiMaterialEnum.Copper, InfiMaterialEnum.Netherrack, "netherrackCopperAxe");
            slimeCopperAxe = new MetalToolAxe(PropsHelperInfiMetals.copperAxeID+3, 
                    InfiMaterialEnum.Copper, InfiMaterialEnum.Slime, "slimeCopperAxe");
            cactusCopperAxe = new MetalToolAxe(PropsHelperInfiMetals.copperAxeID+4, 
                    InfiMaterialEnum.Copper, InfiMaterialEnum.Cactus, "cactusCopperAxe");
            flintCopperAxe = new MetalToolAxe(PropsHelperInfiMetals.copperAxeID+5, 
                    InfiMaterialEnum.Copper, InfiMaterialEnum.Flint, "flintCopperAxe");
            copperCopperAxe = new MetalToolAxe(PropsHelperInfiMetals.copperAxeID+6, 
                    InfiMaterialEnum.Copper, InfiMaterialEnum.Copper, "copperCopperAxe");
        }
        
        if(PropsHelperInfiMetals.enableBronzeTools)
        {
            stoneBronzeAxe = new MetalToolAxe(PropsHelperInfiMetals.bronzeAxeID+0, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Stone, "stoneBronzeAxe");
            boneBronzeAxe = new MetalToolAxe(PropsHelperInfiMetals.bronzeAxeID+1, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Bone, "boneBronzeAxe");
            netherrackBronzeAxe = new MetalToolAxe(PropsHelperInfiMetals.bronzeAxeID+2, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Netherrack, "netherrackBronzeAxe");
            slimeBronzeAxe = new MetalToolAxe(PropsHelperInfiMetals.bronzeAxeID+3, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Slime, "slimeBronzeAxe");
            cactusBronzeAxe = new MetalToolAxe(PropsHelperInfiMetals.bronzeAxeID+4, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Cactus, "cactusBronzeAxe");
            flintBronzeAxe = new MetalToolAxe(PropsHelperInfiMetals.bronzeAxeID+5, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Flint, "flintBronzeAxe");
            copperBronzeAxe = new MetalToolAxe(PropsHelperInfiMetals.bronzeAxeID+6, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Copper, "copperBronzeAxe");
            bronzeBronzeAxe = new MetalToolAxe(PropsHelperInfiMetals.bronzeAxeID+7, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Bronze, "copperBronzeAxe");
        }
        
        if(PropsHelperInfiMetals.enableWorkedIronTools)
        {
            stoneWorkedIronAxe = new MetalToolAxe(PropsHelperInfiMetals.workedIronAxeID+0, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Stone, "stoneWorkedIronAxe");
            ironWorkedIronAxe = new MetalToolAxe(PropsHelperInfiMetals.workedIronAxeID+1, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Iron, "ironWorkedIronAxe");
            diamondWorkedIronAxe = new MetalToolAxe(PropsHelperInfiMetals.workedIronAxeID+2, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Diamond, "diamondWorkedIronAxe");
            goldWorkedIronAxe = new MetalToolAxe(PropsHelperInfiMetals.workedIronAxeID+3, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Gold, "goldWorkedIronAxe");
            redstoneWorkedIronAxe = new MetalToolAxe(PropsHelperInfiMetals.workedIronAxeID+4, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Redstone, "redstoneWorkedIronAxe");
            obsidianWorkedIronAxe = new MetalToolAxe(PropsHelperInfiMetals.workedIronAxeID+5, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Obsidian, "obsidianWorkedIronAxe");
            boneWorkedIronAxe = new MetalToolAxe(PropsHelperInfiMetals.workedIronAxeID+6, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Bone, "boneWorkedIronAxe");
            netherrackWorkedIronAxe = new MetalToolAxe(PropsHelperInfiMetals.workedIronAxeID+7, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Netherrack, "netherrackWorkedIronAxe");
            glowstoneWorkedIronAxe = new MetalToolAxe(PropsHelperInfiMetals.workedIronAxeID+8, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Glowstone, "glowstoneWorkedIronAxe");
            iceWorkedIronAxe = new MetalToolAxe(PropsHelperInfiMetals.workedIronAxeID+9, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Ice, "iceWorkedIronAxe");
            slimeWorkedIronAxe = new MetalToolAxe(PropsHelperInfiMetals.workedIronAxeID+10, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Slime, "slimeWorkedIronAxe");
            cactusWorkedIronAxe = new MetalToolAxe(PropsHelperInfiMetals.workedIronAxeID+11, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Cactus, "cactusWorkedIronAxe");
            blazeWorkedIronAxe = new MetalToolAxe(PropsHelperInfiMetals.workedIronAxeID+12, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Blaze, "blazeWorkedIronAxe");
            copperWorkedIronAxe = new MetalToolAxe(PropsHelperInfiMetals.workedIronAxeID+13, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Copper, "copperWorkedIronAxe");
            bronzeWorkedIronAxe = new MetalToolAxe(PropsHelperInfiMetals.workedIronAxeID+14, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Bronze, "bronzeWorkedIronAxe");
            workedWorkedIronAxe = new MetalToolAxe(PropsHelperInfiMetals.workedIronAxeID+15, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.WorkedIron, "workedWorkedIronAxe");
            steelWorkedIronAxe = new MetalToolAxe(PropsHelperInfiMetals.workedIronAxeID+16, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Steel, "steelWorkedIronAxe");
            cobaltWorkedIronAxe = new MetalToolAxe(PropsHelperInfiMetals.workedIronAxeID+17, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Cobalt, "cobaltWorkedIronAxe");
            arditeWorkedIronAxe = new MetalToolAxe(PropsHelperInfiMetals.workedIronAxeID+18, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Ardite, "arditeWorkedIronAxe");
            uraniumWorkedIronAxe = new MetalToolAxe(PropsHelperInfiMetals.workedIronAxeID+19, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Bronze, "uraniumWorkedIronAxe");
        }
        
        if(PropsHelperInfiMetals.enableSteelTools)
        {
            stoneSteelAxe = new MetalToolAxe(PropsHelperInfiMetals.steelAxeID+0, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Stone, "stoneSteelAxe");
            ironSteelAxe = new MetalToolAxe(PropsHelperInfiMetals.steelAxeID+1, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Iron, "ironSteelAxe");
            diamondSteelAxe = new MetalToolAxe(PropsHelperInfiMetals.steelAxeID+2, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Diamond, "diamondSteelAxe");
            goldSteelAxe = new MetalToolAxe(PropsHelperInfiMetals.steelAxeID+3, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Gold, "goldSteelAxe");
            redstoneSteelAxe = new MetalToolAxe(PropsHelperInfiMetals.steelAxeID+4, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Redstone, "redstoneSteelAxe");
            obsidianSteelAxe = new MetalToolAxe(PropsHelperInfiMetals.steelAxeID+5, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Obsidian, "obsidianSteelAxe");
            boneSteelAxe = new MetalToolAxe(PropsHelperInfiMetals.steelAxeID+6, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Bone, "boneSteelAxe");
            netherrackSteelAxe = new MetalToolAxe(PropsHelperInfiMetals.steelAxeID+7, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Netherrack, "netherrackSteelAxe");
            glowstoneSteelAxe = new MetalToolAxe(PropsHelperInfiMetals.steelAxeID+8, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Glowstone, "glowstoneSteelAxe");
            iceSteelAxe = new MetalToolAxe(PropsHelperInfiMetals.steelAxeID+9, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Ice, "iceSteelAxe");
            slimeSteelAxe = new MetalToolAxe(PropsHelperInfiMetals.steelAxeID+10, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Slime, "slimeSteelAxe");
            cactusSteelAxe = new MetalToolAxe(PropsHelperInfiMetals.steelAxeID+11, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Cactus, "cactusSteelAxe");
            blazeSteelAxe = new MetalToolAxe(PropsHelperInfiMetals.steelAxeID+12, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Blaze, "blazeSteelAxe");
            copperSteelAxe = new MetalToolAxe(PropsHelperInfiMetals.steelAxeID+13, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Copper, "copperSteelAxe");
            bronzeSteelAxe = new MetalToolAxe(PropsHelperInfiMetals.steelAxeID+14, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Bronze, "bronzeSteelAxe");
            workedSteelAxe = new MetalToolAxe(PropsHelperInfiMetals.steelAxeID+15, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.WorkedIron, "workedSteelAxe");
            steelSteelAxe = new MetalToolAxe(PropsHelperInfiMetals.steelAxeID+16, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Steel, "steelSteelAxe");
            cobaltSteelAxe = new MetalToolAxe(PropsHelperInfiMetals.steelAxeID+17, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Cobalt, "cobaltSteelAxe");
            arditeSteelAxe = new MetalToolAxe(PropsHelperInfiMetals.steelAxeID+18, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Ardite, "arditeSteelAxe");
            uraniumSteelAxe = new MetalToolAxe(PropsHelperInfiMetals.steelAxeID+19, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Bronze, "uraniumSteelAxe");
        }
        
        if(PropsHelperInfiMetals.enableCobaltTools)
        {
            stoneCobaltAxe = new MetalToolAxe(PropsHelperInfiMetals.cobaltAxeID+0, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Stone, "stoneCobaltAxe");
            ironCobaltAxe = new MetalToolAxe(PropsHelperInfiMetals.cobaltAxeID+1, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Iron, "ironCobaltAxe");
            diamondCobaltAxe = new MetalToolAxe(PropsHelperInfiMetals.cobaltAxeID+2,
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Gold, "goldCobaltAxe");
            redstoneCobaltAxe = new MetalToolAxe(PropsHelperInfiMetals.cobaltAxeID+4, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Redstone, "redstoneCobaltAxe");
            obsidianCobaltAxe = new MetalToolAxe(PropsHelperInfiMetals.cobaltAxeID+5, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Obsidian, "obsidianCobaltAxe");
            boneCobaltAxe = new MetalToolAxe(PropsHelperInfiMetals.cobaltAxeID+6, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Bone, "boneCobaltAxe");
            slimeCobaltAxe = new MetalToolAxe(PropsHelperInfiMetals.cobaltAxeID+7, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Slime, "slimeCobaltAxe");
            cactusCobaltAxe = new MetalToolAxe(PropsHelperInfiMetals.cobaltAxeID+8, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Cactus, "cactusCobaltAxe");
            blazeCobaltAxe = new MetalToolAxe(PropsHelperInfiMetals.cobaltAxeID+9, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Blaze, "blazeCobaltAxe");
            copperCobaltAxe = new MetalToolAxe(PropsHelperInfiMetals.cobaltAxeID+10, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Copper, "copperCobaltAxe");
            bronzeCobaltAxe = new MetalToolAxe(PropsHelperInfiMetals.cobaltAxeID+11, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Bronze, "bronzeCobaltAxe");
            workedCobaltAxe = new MetalToolAxe(PropsHelperInfiMetals.cobaltAxeID+12, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.WorkedIron, "workedCobaltAxe");
            steelCobaltAxe = new MetalToolAxe(PropsHelperInfiMetals.cobaltAxeID+13, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Steel, "steelCobaltAxe");
            cobaltCobaltAxe = new MetalToolAxe(PropsHelperInfiMetals.cobaltAxeID+14, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Cobalt, "cobaltCobaltAxe");
            arditeCobaltAxe = new MetalToolAxe(PropsHelperInfiMetals.cobaltAxeID+15, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Ardite, "arditeCobaltAxe");
            manyullynCobaltAxe = new MetalToolAxe(PropsHelperInfiMetals.cobaltAxeID+16, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Manyullyn, "arditeCobaltAxe");
            uraniumCobaltAxe = new MetalToolAxe(PropsHelperInfiMetals.cobaltAxeID+17, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Bronze, "uraniumCobaltAxe");
        }
        
        if(PropsHelperInfiMetals.enableArditeTools)
        {
            stoneArditeAxe = new MetalToolAxe(PropsHelperInfiMetals.arditeAxeID+0, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Stone, "stoneArditeAxe");
            ironArditeAxe = new MetalToolAxe(PropsHelperInfiMetals.arditeAxeID+1, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Iron, "ironArditeAxe");
            diamondArditeAxe = new MetalToolAxe(PropsHelperInfiMetals.arditeAxeID+2,
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Gold, "goldArditeAxe");
            redstoneArditeAxe = new MetalToolAxe(PropsHelperInfiMetals.arditeAxeID+4, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Redstone, "redstoneArditeAxe");
            obsidianArditeAxe = new MetalToolAxe(PropsHelperInfiMetals.arditeAxeID+5, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Obsidian, "obsidianArditeAxe");
            boneArditeAxe = new MetalToolAxe(PropsHelperInfiMetals.arditeAxeID+6, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Bone, "boneArditeAxe");
            slimeArditeAxe = new MetalToolAxe(PropsHelperInfiMetals.arditeAxeID+7, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Slime, "slimeArditeAxe");
            cactusArditeAxe = new MetalToolAxe(PropsHelperInfiMetals.arditeAxeID+8, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Cactus, "cactusArditeAxe");
            blazeArditeAxe = new MetalToolAxe(PropsHelperInfiMetals.arditeAxeID+9, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Blaze, "blazeArditeAxe");
            copperArditeAxe = new MetalToolAxe(PropsHelperInfiMetals.arditeAxeID+10, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Copper, "copperArditeAxe");
            bronzeArditeAxe = new MetalToolAxe(PropsHelperInfiMetals.arditeAxeID+11, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Bronze, "bronzeArditeAxe");
            workedArditeAxe = new MetalToolAxe(PropsHelperInfiMetals.arditeAxeID+12, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.WorkedIron, "workedArditeAxe");
            steelArditeAxe = new MetalToolAxe(PropsHelperInfiMetals.arditeAxeID+13, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Steel, "steelArditeAxe");
            cobaltArditeAxe = new MetalToolAxe(PropsHelperInfiMetals.arditeAxeID+14, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Cobalt, "cobaltArditeAxe");
            arditeArditeAxe = new MetalToolAxe(PropsHelperInfiMetals.arditeAxeID+15, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Ardite, "arditeArditeAxe");
            manyullynArditeAxe = new MetalToolAxe(PropsHelperInfiMetals.arditeAxeID+16, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Manyullyn, "arditeArditeAxe");
            uraniumArditeAxe = new MetalToolAxe(PropsHelperInfiMetals.arditeAxeID+17, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Bronze, "uraniumArditeAxe");
        }
        
        if(PropsHelperInfiMetals.enableManyullynTools)
        {
            stoneManyullynAxe = new MetalToolAxe(PropsHelperInfiMetals.manyullynAxeID+0, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Stone, "stoneManyullynAxe");
            ironManyullynAxe = new MetalToolAxe(PropsHelperInfiMetals.manyullynAxeID+1, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Iron, "ironManyullynAxe");
            diamondManyullynAxe = new MetalToolAxe(PropsHelperInfiMetals.manyullynAxeID+2,
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Gold, "goldManyullynAxe");
            redstoneManyullynAxe = new MetalToolAxe(PropsHelperInfiMetals.manyullynAxeID+4, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Redstone, "redstoneManyullynAxe");
            obsidianManyullynAxe = new MetalToolAxe(PropsHelperInfiMetals.manyullynAxeID+5, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Obsidian, "obsidianManyullynAxe");
            boneManyullynAxe = new MetalToolAxe(PropsHelperInfiMetals.manyullynAxeID+6, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Bone, "boneManyullynAxe");
            slimeManyullynAxe = new MetalToolAxe(PropsHelperInfiMetals.manyullynAxeID+7, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Slime, "slimeManyullynAxe");
            cactusManyullynAxe = new MetalToolAxe(PropsHelperInfiMetals.manyullynAxeID+8, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Cactus, "cactusManyullynAxe");
            blazeManyullynAxe = new MetalToolAxe(PropsHelperInfiMetals.manyullynAxeID+9, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Blaze, "blazeManyullynAxe");
            copperManyullynAxe = new MetalToolAxe(PropsHelperInfiMetals.manyullynAxeID+10, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Copper, "copperManyullynAxe");
            bronzeManyullynAxe = new MetalToolAxe(PropsHelperInfiMetals.manyullynAxeID+11, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Bronze, "bronzeManyullynAxe");
            workedManyullynAxe = new MetalToolAxe(PropsHelperInfiMetals.manyullynAxeID+12, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.WorkedIron, "workedManyullynAxe");
            steelManyullynAxe = new MetalToolAxe(PropsHelperInfiMetals.manyullynAxeID+13, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Steel, "steelManyullynAxe");
            cobaltManyullynAxe = new MetalToolAxe(PropsHelperInfiMetals.manyullynAxeID+14, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Cobalt, "cobaltManyullynAxe");
            arditeManyullynAxe = new MetalToolAxe(PropsHelperInfiMetals.manyullynAxeID+15, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Ardite, "arditeManyullynAxe");
            manyullynManyullynAxe = new MetalToolAxe(PropsHelperInfiMetals.manyullynAxeID+16, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Manyullyn, "arditeManyullynAxe");
            uraniumManyullynAxe = new MetalToolAxe(PropsHelperInfiMetals.manyullynAxeID+17, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Bronze, "uraniumManyullynAxe");
        }
        
        if(PropsHelperInfiMetals.enableUraniumTools)
        {
            diamondUraniumAxe = new MetalToolAxe(PropsHelperInfiMetals.uraniumAxeID+0, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Diamond, "diamondUraniumAxe");
            redstoneUraniumAxe = new MetalToolAxe(PropsHelperInfiMetals.uraniumAxeID+1, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Redstone, "redstoneUraniumAxe");
            boneUraniumAxe = new MetalToolAxe(PropsHelperInfiMetals.uraniumAxeID+2, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Bone, "boneUraniumAxe");
            netherrackUraniumAxe = new MetalToolAxe(PropsHelperInfiMetals.uraniumAxeID+3, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Netherrack, "netherrackUraniumAxe");
            glowstoneUraniumAxe = new MetalToolAxe(PropsHelperInfiMetals.uraniumAxeID+4, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Glowstone, "glowstoneUraniumAxe");
            lavaUraniumAxe = new MetalToolAxe(PropsHelperInfiMetals.uraniumAxeID+5, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Lava, "lavaUraniumAxe");
            blazeUraniumAxe = new MetalToolAxe(PropsHelperInfiMetals.uraniumAxeID+6, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Blaze, "blazeUraniumAxe");
            cobaltUraniumAxe = new MetalToolAxe(PropsHelperInfiMetals.uraniumAxeID+7, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Cobalt, "cobaltUraniumAxe");
            arditeUraniumAxe = new MetalToolAxe(PropsHelperInfiMetals.uraniumAxeID+8, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Ardite, "arditeUraniumAxe");
            uraniumUraniumAxe = new MetalToolAxe(PropsHelperInfiMetals.uraniumAxeID+9, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Uranium, "uraniumUraniumAxe");
        }
        
        if(PropsHelperInfiMetals.enableStoneTools)
        {
            copperStoneAxe = new MetalToolAxe(PropsHelperInfiMetals.stoneAxeID+0, 
                    InfiMaterialEnum.Stone, InfiMaterialEnum.Copper, "copperStoneAxe");
        }
        
        if(PropsHelperInfiMetals.enableIronTools)
        {
            copperIronAxe = new MetalToolAxe(PropsHelperInfiMetals.ironAxeID+0, 
                    InfiMaterialEnum.Iron, InfiMaterialEnum.Copper, "copperIronAxe");
            bronzeIronAxe = new MetalToolAxe(PropsHelperInfiMetals.ironAxeID+1, 
                    InfiMaterialEnum.Iron, InfiMaterialEnum.Bronze, "bronzeIronAxe");
            workedIronAxe = new MetalToolAxe(PropsHelperInfiMetals.ironAxeID+2, 
                    InfiMaterialEnum.Iron, InfiMaterialEnum.WorkedIron, "workedIronAxe");
        }
        
        if(PropsHelperInfiMetals.enableDiamondTools)
        {
            copperDiamondAxe = new MetalToolAxe(PropsHelperInfiMetals.diamondAxeID+0, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Copper, "copperDiamondAxe");
            bronzeDiamondAxe = new MetalToolAxe(PropsHelperInfiMetals.diamondAxeID+1, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Bronze, "bronzeDiamondAxe");
            workedDiamondAxe = new MetalToolAxe(PropsHelperInfiMetals.diamondAxeID+2, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.WorkedIron, "workedDiamondAxe");
            steelDiamondAxe = new MetalToolAxe(PropsHelperInfiMetals.diamondAxeID+3, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Steel, "steelDiamondAxe");
            cobaltDiamondAxe = new MetalToolAxe(PropsHelperInfiMetals.diamondAxeID+4, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Cobalt, "cobaltDiamondAxe");
            arditeDiamondAxe = new MetalToolAxe(PropsHelperInfiMetals.diamondAxeID+5, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Ardite, "arditeDiamondAxe");
            manyullynDiamondAxe = new MetalToolAxe(PropsHelperInfiMetals.diamondAxeID+6, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Manyullyn, "manyullynDiamondAxe");
            uraniumDiamondAxe = new MetalToolAxe(PropsHelperInfiMetals.diamondAxeID+7, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Uranium, "uraniumDiamondAxe");
        }
        
        if(PropsHelperInfiMetals.enableRedstoneTools)
        {
            copperRedstoneAxe = new MetalToolAxe(PropsHelperInfiMetals.redstoneAxeID+0, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Copper, "copperRedstoneAxe");
            bronzeRedstoneAxe = new MetalToolAxe(PropsHelperInfiMetals.redstoneAxeID+1, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Bronze, "bronzeRedstoneAxe");
            workedRedstoneAxe = new MetalToolAxe(PropsHelperInfiMetals.redstoneAxeID+2, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.WorkedIron, "workedRedstoneAxe");
        }
        
        if(PropsHelperInfiMetals.enableMossyTools)
        {
            cobaltMossyAxe = new MetalToolAxe(PropsHelperInfiMetals.mossyAxeID+0, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Cobalt, "cobaltMossyAxe");
            arditeMossyAxe = new MetalToolAxe(PropsHelperInfiMetals.mossyAxeID+1, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Ardite, "arditeMossyAxe");
            manyullynMossyAxe = new MetalToolAxe(PropsHelperInfiMetals.mossyAxeID+2, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Manyullyn, "manyullynMossyAxe");
        }
        
        if(PropsHelperInfiMetals.enableNetherrackTools)
        {
            copperNetherrackAxe = new MetalToolAxe(PropsHelperInfiMetals.netherrackAxeID+0, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Copper, "copperNetherrackAxe");
        }
        
        if(PropsHelperInfiMetals.enableGlowstoneTools)
        {
            copperGlowstoneAxe = new MetalToolAxe(PropsHelperInfiMetals.glowstoneAxeID+0, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Copper, "copperGlowstoneAxe");
            bronzeGlowstoneAxe = new MetalToolAxe(PropsHelperInfiMetals.glowstoneAxeID+1, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Bronze, "bronzeGlowstoneAxe");
            workedGlowstoneAxe = new MetalToolAxe(PropsHelperInfiMetals.glowstoneAxeID+2, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.WorkedIron, "workedGlowstoneAxe");
            steelGlowstoneAxe = new MetalToolAxe(PropsHelperInfiMetals.glowstoneAxeID+3, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Steel, "steelGlowstoneAxe");
        }
        
        if(PropsHelperInfiMetals.enableLavaTools)
        {
            cobaltLavaAxe = new MetalToolAxe(PropsHelperInfiMetals.lavaAxeID+0, 
                    InfiMaterialEnum.Lava, InfiMaterialEnum.Cobalt, "cobaltLavaAxe");
            arditeLavaAxe = new MetalToolAxe(PropsHelperInfiMetals.lavaAxeID+1, 
                    InfiMaterialEnum.Lava, InfiMaterialEnum.Ardite, "arditeLavaAxe");
            manyullynLavaAxe = new MetalToolAxe(PropsHelperInfiMetals.lavaAxeID+2, 
                    InfiMaterialEnum.Lava, InfiMaterialEnum.Manyullyn, "manyullynLavaAxe");
            uraniumLavaAxe = new MetalToolAxe(PropsHelperInfiMetals.lavaAxeID+3, 
                    InfiMaterialEnum.Lava, InfiMaterialEnum.Uranium, "uraniumLavaAxe");
        }
        
        if(PropsHelperInfiMetals.enableSlimeTools)
        {
            copperSlimeAxe = new MetalToolAxe(PropsHelperInfiMetals.slimeAxeID+0, 
                    InfiMaterialEnum.Slime, InfiMaterialEnum.Copper, "copperSlimeAxe");
            bronzeSlimeAxe = new MetalToolAxe(PropsHelperInfiMetals.slimeAxeID+1, 
                    InfiMaterialEnum.Slime, InfiMaterialEnum.Bronze, "bronzeSlimeAxe");
            workedSlimeAxe = new MetalToolAxe(PropsHelperInfiMetals.slimeAxeID+2, 
                    InfiMaterialEnum.Slime, InfiMaterialEnum.WorkedIron, "workedSlimeAxe");
            steelSlimeAxe = new MetalToolAxe(PropsHelperInfiMetals.slimeAxeID+3, 
                    InfiMaterialEnum.Slime, InfiMaterialEnum.Steel, "steelSlimeAxe");
            cobaltSlimeAxe = new MetalToolAxe(PropsHelperInfiMetals.slimeAxeID+4, 
                    InfiMaterialEnum.Slime, InfiMaterialEnum.Cobalt, "cobaltSlimeAxe");
            arditeSlimeAxe = new MetalToolAxe(PropsHelperInfiMetals.slimeAxeID+5, 
                    InfiMaterialEnum.Slime, InfiMaterialEnum.Ardite, "arditeSlimeAxe");
            manyullynSlimeAxe = new MetalToolAxe(PropsHelperInfiMetals.slimeAxeID+6, 
                    InfiMaterialEnum.Slime, InfiMaterialEnum.Manyullyn, "manyullynSlimeAxe");
            uraniumSlimeAxe = new MetalToolAxe(PropsHelperInfiMetals.slimeAxeID+7, 
                    InfiMaterialEnum.Slime, InfiMaterialEnum.Uranium, "uraniumSlimeAxe");
        }
        
        if(PropsHelperInfiMetals.enableFlintTools)
        {
            copperFlintAxe = new MetalToolAxe(PropsHelperInfiMetals.flintAxeID+0, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Copper, "copperFlintAxe");
            bronzeFlintAxe = new MetalToolAxe(PropsHelperInfiMetals.flintAxeID+1, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Bronze, "bronzeFlintAxe");
        }
        
        if(PropsHelperInfiMetals.enableBlazeTools)
        {
            cobaltBlazeAxe = new MetalToolAxe(PropsHelperInfiMetals.blazeAxeID+0, 
                    InfiMaterialEnum.Blaze, InfiMaterialEnum.Cobalt, "cobaltBlazeAxe");
            arditeBlazeAxe = new MetalToolAxe(PropsHelperInfiMetals.blazeAxeID+1, 
                    InfiMaterialEnum.Blaze, InfiMaterialEnum.Ardite, "arditeBlazeAxe");
            manyullynBlazeAxe = new MetalToolAxe(PropsHelperInfiMetals.blazeAxeID+2, 
                    InfiMaterialEnum.Blaze, InfiMaterialEnum.Manyullyn, "manyullynBlazeAxe");
            uraniumBlazeAxe = new MetalToolAxe(PropsHelperInfiMetals.blazeAxeID+3, 
                    InfiMaterialEnum.Blaze, InfiMaterialEnum.Uranium, "uraniumBlazeAxe");
        }
    }
    
    private static void addNames()
    {
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
        if(PropsHelperInfiMetals.enableStoneTools)
        {
            ModLoader.addRecipe(new ItemStack(copperStoneAxe), new Object[] 
                    { "##", "#|", " |", '#', Block.stone, '|', mod_InfiMetals.copperRod });
        }
        if(PropsHelperInfiMetals.enableIronTools)
        {
            ModLoader.addRecipe(new ItemStack(copperIronAxe), new Object[] 
                    { "##", "#|", " |", '#', Item.ingotIron, '|', mod_InfiMetals.copperRod });
            ModLoader.addRecipe(new ItemStack(bronzeIronAxe), new Object[] 
                    { "##", "#|", " |", '#', Item.ingotIron, '|', mod_InfiMetals.bronzeRod });
            ModLoader.addRecipe(new ItemStack(workedIronAxe), new Object[] 
                    { "##", "#|", " |", '#', Item.ingotIron, '|', mod_InfiMetals.workedIronRod });
        }
        if(PropsHelperInfiMetals.enableDiamondTools)
        {
            ModLoader.addRecipe(new ItemStack(copperDiamondAxe), new Object[] 
                    { "##", "#|", " |", '#', Item.diamond, '|', mod_InfiMetals.copperRod });
            ModLoader.addRecipe(new ItemStack(bronzeDiamondAxe), new Object[] 
                    { "##", "#|", " |", '#', Item.diamond, '|', mod_InfiMetals.bronzeRod });
            ModLoader.addRecipe(new ItemStack(workedDiamondAxe), new Object[] 
                    { "##", "#|", " |", '#', Item.diamond, '|', mod_InfiMetals.workedIronRod });
            ModLoader.addRecipe(new ItemStack(steelDiamondAxe), new Object[] 
                    { "##", "#|", " |", '#', Item.diamond, '|', mod_InfiMetals.steelRod });
            ModLoader.addRecipe(new ItemStack(cobaltDiamondAxe), new Object[] 
                    { "##", "#|", " |", '#', Item.diamond, '|', mod_InfiMetals.cobaltRod });
            ModLoader.addRecipe(new ItemStack(arditeDiamondAxe), new Object[] 
                    { "##", "#|", " |", '#', Item.diamond, '|', mod_InfiMetals.arditeRod });
            ModLoader.addRecipe(new ItemStack(manyullynDiamondAxe), new Object[] 
                    { "##", "#|", " |", '#', Item.diamond, '|', mod_InfiMetals.manyullynRod });
            ModLoader.addRecipe(new ItemStack(uraniumDiamondAxe), new Object[] 
                    { "##", "#|", " |", '#', Item.diamond, '|', mod_InfiMetals.uraniumRod });
        }
        if(PropsHelperInfiMetals.enableMossyTools)
        {
            ModLoader.addRecipe(new ItemStack(cobaltMossyAxe), new Object[] 
                    { "##", "#|", " |", '#', mod_InfiTools.mossBallCrafted, '|', mod_InfiMetals.cobaltRod });
            ModLoader.addRecipe(new ItemStack(arditeMossyAxe), new Object[] 
                    { "##", "#|", " |", '#', mod_InfiTools.mossBallCrafted, '|', mod_InfiMetals.arditeRod });
            ModLoader.addRecipe(new ItemStack(manyullynMossyAxe), new Object[] 
                    { "##", "#|", " |", '#', mod_InfiTools.mossBallCrafted, '|', mod_InfiMetals.manyullynRod });
        }
        if(PropsHelperInfiMetals.enableNetherrackTools)
        {
            ModLoader.addRecipe(new ItemStack(copperNetherrackAxe), new Object[] 
                    { "##", "#|", " |", '#', Block.netherrack, '|', mod_InfiMetals.copperRod });
        }
        if(PropsHelperInfiMetals.enableFlintTools)
        {
            ModLoader.addRecipe(new ItemStack(copperFlintAxe), new Object[] 
                    { "##", "#|", " |", '#', Block.netherrack, '|', mod_InfiMetals.copperRod });
            ModLoader.addRecipe(new ItemStack(bronzeFlintAxe), new Object[] 
                    { "##", "#|", " |", '#', Block.netherrack, '|', mod_InfiMetals.bronzeRod });
        }
    }
    
    public static void addCopperTools(ItemStack stack)
    {
        ModLoader.addRecipe(new ItemStack(stoneCopperAxe), new Object[] 
                { "##", "#|", " |", '#', stack, '|', mod_InfiTools.stoneRod });
        ModLoader.addRecipe(new ItemStack(boneCopperAxe), new Object[] 
                { "##", "#|", " |", '#', stack, '|', Item.bone });
        ModLoader.addRecipe(new ItemStack(boneCopperAxe), new Object[] 
                { "##", "#|", " |", '#', stack, '|', mod_InfiTools.boneRod });
        ModLoader.addRecipe(new ItemStack(netherrackCopperAxe), new Object[] 
                { "##", "#|", " |", '#', stack, '|', mod_InfiTools.netherrackRod });
        ModLoader.addRecipe(new ItemStack(slimeCopperAxe), new Object[] 
                { "##", "#|", " |", '#', stack, '|', mod_InfiTools.slimeRod });
        ModLoader.addRecipe(new ItemStack(cactusCopperAxe), new Object[] 
                { "##", "#|", " |", '#', stack, '|', mod_InfiTools.cactusRod });
        ModLoader.addRecipe(new ItemStack(flintCopperAxe), new Object[] 
                { "##", "#|", " |", '#', stack, '|', mod_InfiTools.flintRod });
        ModLoader.addRecipe(new ItemStack(copperCopperAxe), new Object[] 
                { "##", "#|", " |", '#', stack, '|', mod_InfiMetals.copperRod });
    }
    
    public static void addBronzeTools(ItemStack stack)
    {
        ModLoader.addRecipe(new ItemStack(stoneBronzeAxe), new Object[] 
                { "##", "#|", " |", '#', stack, '|', mod_InfiTools.stoneRod });
        ModLoader.addRecipe(new ItemStack(boneBronzeAxe), new Object[] 
                { "##", "#|", " |", '#', stack, '|', Item.bone });
        ModLoader.addRecipe(new ItemStack(boneBronzeAxe), new Object[] 
                { "##", "#|", " |", '#', stack, '|', mod_InfiTools.boneRod });
        ModLoader.addRecipe(new ItemStack(netherrackBronzeAxe), new Object[] 
                { "##", "#|", " |", '#', stack, '|', mod_InfiTools.netherrackRod });
        ModLoader.addRecipe(new ItemStack(slimeBronzeAxe), new Object[] 
                { "##", "#|", " |", '#', stack, '|', mod_InfiTools.slimeRod });
        ModLoader.addRecipe(new ItemStack(cactusBronzeAxe), new Object[] 
                { "##", "#|", " |", '#', stack, '|', mod_InfiTools.cactusRod });
        ModLoader.addRecipe(new ItemStack(flintBronzeAxe), new Object[] 
                { "##", "#|", " |", '#', stack, '|', mod_InfiTools.flintRod });
        ModLoader.addRecipe(new ItemStack(copperBronzeAxe), new Object[] 
                { "##", "#|", " |", '#', stack, '|', mod_InfiMetals.copperRod });
        ModLoader.addRecipe(new ItemStack(bronzeBronzeAxe), new Object[] 
                { "##", "#|", " |", '#', stack, '|', mod_InfiMetals.bronzeRod });
    }
    
    public static void addWorkedIronTools(ItemStack stack)
    {
        ModLoader.addRecipe(new ItemStack(stoneWorkedIronAxe), new Object[] 
                { "##", "#|", " |", '#', stack, '|', mod_InfiTools.stoneRod });
        ModLoader.addRecipe(new ItemStack(ironWorkedIronAxe), new Object[] 
                { "##", "#|", " |", '#', stack, '|', mod_InfiTools.ironRod });
        ModLoader.addRecipe(new ItemStack(diamondWorkedIronAxe), new Object[] 
                { "##", "#|", " |", '#', stack, '|', mod_InfiTools.diamondRod });
        ModLoader.addRecipe(new ItemStack(goldWorkedIronAxe), new Object[] 
                { "##", "#|", " |", '#', stack, '|', mod_InfiTools.goldRod });
        ModLoader.addRecipe(new ItemStack(redstoneWorkedIronAxe), new Object[] 
                { "##", "#|", " |", '#', stack, '|', mod_InfiTools.redstoneRod });
        ModLoader.addRecipe(new ItemStack(obsidianWorkedIronAxe), new Object[] 
                { "##", "#|", " |", '#', stack, '|', mod_InfiTools.obsidianRod });
        ModLoader.addRecipe(new ItemStack(boneWorkedIronAxe), new Object[] 
                { "##", "#|", " |", '#', stack, '|', Item.bone });
        ModLoader.addRecipe(new ItemStack(boneWorkedIronAxe), new Object[] 
                { "##", "#|", " |", '#', stack, '|', mod_InfiTools.boneRod });
        ModLoader.addRecipe(new ItemStack(netherrackWorkedIronAxe), new Object[] 
                { "##", "#|", " |", '#', stack, '|', mod_InfiTools.netherrackRod });
        ModLoader.addRecipe(new ItemStack(glowstoneWorkedIronAxe), new Object[] 
                { "##", "#|", " |", '#', stack, '|', mod_InfiTools.glowstoneRod });
        ModLoader.addRecipe(new ItemStack(iceWorkedIronAxe), new Object[] 
                { "##", "#|", " |", '#', stack, '|', mod_InfiTools.iceRod });
        ModLoader.addRecipe(new ItemStack(slimeWorkedIronAxe), new Object[] 
                { "##", "#|", " |", '#', stack, '|', mod_InfiTools.slimeRod });
        ModLoader.addRecipe(new ItemStack(cactusWorkedIronAxe), new Object[] 
                { "##", "#|", " |", '#', stack, '|', mod_InfiTools.cactusRod });
        ModLoader.addRecipe(new ItemStack(blazeWorkedIronAxe), new Object[] 
                { "##", "#|", " |", '#', stack, '|', Item.blazeRod });
        ModLoader.addRecipe(new ItemStack(copperWorkedIronAxe), new Object[] 
                { "##", "#|", " |", '#', stack, '|', mod_InfiMetals.copperRod });
        ModLoader.addRecipe(new ItemStack(bronzeWorkedIronAxe), new Object[] 
                { "##", "#|", " |", '#', stack, '|', mod_InfiMetals.bronzeRod });
        ModLoader.addRecipe(new ItemStack(workedWorkedIronAxe), new Object[] 
                { "##", "#|", " |", '#', stack, '|', mod_InfiMetals.workedIronRod });
        ModLoader.addRecipe(new ItemStack(steelWorkedIronAxe), new Object[] 
                { "##", "#|", " |", '#', stack, '|', mod_InfiMetals.steelRod });
        ModLoader.addRecipe(new ItemStack(cobaltWorkedIronAxe), new Object[] 
                { "##", "#|", " |", '#', stack, '|', mod_InfiMetals.cobaltRod });
        ModLoader.addRecipe(new ItemStack(arditeWorkedIronAxe), new Object[] 
                { "##", "#|", " |", '#', stack, '|', mod_InfiMetals.arditeRod });
        ModLoader.addRecipe(new ItemStack(uraniumWorkedIronAxe), new Object[] 
                { "##", "#|", " |", '#', stack, '|', mod_InfiMetals.uraniumRod });
    }
    
    public static void addSteelTools(ItemStack stack)
    {
        ModLoader.addRecipe(new ItemStack(stoneSteelAxe), new Object[] 
                { "##", "#|", " |", '#', stack, '|', mod_InfiTools.stoneRod });
        ModLoader.addRecipe(new ItemStack(ironSteelAxe), new Object[] 
                { "##", "#|", " |", '#', stack, '|', mod_InfiTools.ironRod });
        ModLoader.addRecipe(new ItemStack(diamondSteelAxe), new Object[] 
                { "##", "#|", " |", '#', stack, '|', mod_InfiTools.diamondRod });
        ModLoader.addRecipe(new ItemStack(goldSteelAxe), new Object[] 
                { "##", "#|", " |", '#', stack, '|', mod_InfiTools.goldRod });
        ModLoader.addRecipe(new ItemStack(redstoneSteelAxe), new Object[] 
                { "##", "#|", " |", '#', stack, '|', mod_InfiTools.redstoneRod });
        ModLoader.addRecipe(new ItemStack(obsidianSteelAxe), new Object[] 
                { "##", "#|", " |", '#', stack, '|', mod_InfiTools.obsidianRod });
        ModLoader.addRecipe(new ItemStack(boneSteelAxe), new Object[] 
                { "##", "#|", " |", '#', stack, '|', Item.bone });
        ModLoader.addRecipe(new ItemStack(boneSteelAxe), new Object[] 
                { "##", "#|", " |", '#', stack, '|', mod_InfiTools.boneRod });
        ModLoader.addRecipe(new ItemStack(netherrackSteelAxe), new Object[] 
                { "##", "#|", " |", '#', stack, '|', mod_InfiTools.netherrackRod });
        ModLoader.addRecipe(new ItemStack(glowstoneSteelAxe), new Object[] 
                { "##", "#|", " |", '#', stack, '|', mod_InfiTools.glowstoneRod });
        ModLoader.addRecipe(new ItemStack(iceSteelAxe), new Object[] 
                { "##", "#|", " |", '#', stack, '|', mod_InfiTools.iceRod });
        ModLoader.addRecipe(new ItemStack(slimeSteelAxe), new Object[] 
                { "##", "#|", " |", '#', stack, '|', mod_InfiTools.slimeRod });
        ModLoader.addRecipe(new ItemStack(cactusSteelAxe), new Object[] 
                { "##", "#|", " |", '#', stack, '|', mod_InfiTools.cactusRod });
        ModLoader.addRecipe(new ItemStack(blazeSteelAxe), new Object[] 
                { "##", "#|", " |", '#', stack, '|', Item.blazeRod });
        ModLoader.addRecipe(new ItemStack(copperSteelAxe), new Object[] 
                { "##", "#|", " |", '#', stack, '|', mod_InfiMetals.copperRod });
        ModLoader.addRecipe(new ItemStack(bronzeSteelAxe), new Object[] 
                { "##", "#|", " |", '#', stack, '|', mod_InfiMetals.bronzeRod });
        ModLoader.addRecipe(new ItemStack(workedSteelAxe), new Object[] 
                { "##", "#|", " |", '#', stack, '|', mod_InfiMetals.workedIronRod });
        ModLoader.addRecipe(new ItemStack(steelSteelAxe), new Object[] 
                { "##", "#|", " |", '#', stack, '|', mod_InfiMetals.steelRod });
        ModLoader.addRecipe(new ItemStack(cobaltSteelAxe), new Object[] 
                { "##", "#|", " |", '#', stack, '|', mod_InfiMetals.cobaltRod });
        ModLoader.addRecipe(new ItemStack(arditeSteelAxe), new Object[] 
                { "##", "#|", " |", '#', stack, '|', mod_InfiMetals.arditeRod });
        ModLoader.addRecipe(new ItemStack(uraniumSteelAxe), new Object[] 
                { "##", "#|", " |", '#', stack, '|', mod_InfiMetals.uraniumRod });
    }
    
    public static void addCobaltTools(ItemStack stack)
    {
        ModLoader.addRecipe(new ItemStack(stoneCobaltAxe), new Object[] 
                { "##", "#|", " |", '#', stack, '|', mod_InfiTools.stoneRod });
        ModLoader.addRecipe(new ItemStack(ironCobaltAxe), new Object[] 
                { "##", "#|", " |", '#', stack, '|', mod_InfiTools.ironRod });
        ModLoader.addRecipe(new ItemStack(diamondCobaltAxe), new Object[] 
                { "##", "#|", " |", '#', stack, '|', mod_InfiTools.diamondRod });
        ModLoader.addRecipe(new ItemStack(redstoneCobaltAxe), new Object[] 
                { "##", "#|", " |", '#', stack, '|', mod_InfiTools.redstoneRod });
        ModLoader.addRecipe(new ItemStack(obsidianCobaltAxe), new Object[] 
                { "##", "#|", " |", '#', stack, '|', mod_InfiTools.obsidianRod });
        ModLoader.addRecipe(new ItemStack(boneCobaltAxe), new Object[] 
                { "##", "#|", " |", '#', stack, '|', Item.bone });
        ModLoader.addRecipe(new ItemStack(boneCobaltAxe), new Object[] 
                { "##", "#|", " |", '#', stack, '|', mod_InfiTools.boneRod });
        ModLoader.addRecipe(new ItemStack(slimeCobaltAxe), new Object[] 
                { "##", "#|", " |", '#', stack, '|', mod_InfiTools.slimeRod });
        ModLoader.addRecipe(new ItemStack(cactusCobaltAxe), new Object[] 
                { "##", "#|", " |", '#', stack, '|', mod_InfiTools.cactusRod });
        ModLoader.addRecipe(new ItemStack(blazeCobaltAxe), new Object[] 
                { "##", "#|", " |", '#', stack, '|', Item.blazeRod });
        ModLoader.addRecipe(new ItemStack(copperCobaltAxe), new Object[] 
                { "##", "#|", " |", '#', stack, '|', mod_InfiMetals.copperRod });
        ModLoader.addRecipe(new ItemStack(bronzeCobaltAxe), new Object[] 
                { "##", "#|", " |", '#', stack, '|', mod_InfiMetals.bronzeRod });
        ModLoader.addRecipe(new ItemStack(workedCobaltAxe), new Object[] 
                { "##", "#|", " |", '#', stack, '|', mod_InfiMetals.workedIronRod });
        ModLoader.addRecipe(new ItemStack(steelCobaltAxe), new Object[] 
                { "##", "#|", " |", '#', stack, '|', mod_InfiMetals.steelRod });
        ModLoader.addRecipe(new ItemStack(cobaltCobaltAxe), new Object[] 
                { "##", "#|", " |", '#', stack, '|', mod_InfiMetals.cobaltRod });
        ModLoader.addRecipe(new ItemStack(arditeCobaltAxe), new Object[] 
                { "##", "#|", " |", '#', stack, '|', mod_InfiMetals.arditeRod });
        ModLoader.addRecipe(new ItemStack(manyullynCobaltAxe), new Object[] 
                { "##", "#|", " |", '#', stack, '|', mod_InfiMetals.manyullynRod });
        ModLoader.addRecipe(new ItemStack(uraniumCobaltAxe), new Object[] 
                { "##", "#|", " |", '#', stack, '|', mod_InfiMetals.uraniumRod });
    }
    
    public static void addArditeTools(ItemStack stack)
    {
        ModLoader.addRecipe(new ItemStack(stoneArditeAxe), new Object[] 
                { "##", "#|", " |", '#', stack, '|', mod_InfiTools.stoneRod });
        ModLoader.addRecipe(new ItemStack(ironArditeAxe), new Object[] 
                { "##", "#|", " |", '#', stack, '|', mod_InfiTools.ironRod });
        ModLoader.addRecipe(new ItemStack(diamondArditeAxe), new Object[] 
                { "##", "#|", " |", '#', stack, '|', mod_InfiTools.diamondRod });
        ModLoader.addRecipe(new ItemStack(redstoneArditeAxe), new Object[] 
                { "##", "#|", " |", '#', stack, '|', mod_InfiTools.redstoneRod });
        ModLoader.addRecipe(new ItemStack(obsidianArditeAxe), new Object[] 
                { "##", "#|", " |", '#', stack, '|', mod_InfiTools.obsidianRod });
        ModLoader.addRecipe(new ItemStack(boneArditeAxe), new Object[] 
                { "##", "#|", " |", '#', stack, '|', Item.bone });
        ModLoader.addRecipe(new ItemStack(boneArditeAxe), new Object[] 
                { "##", "#|", " |", '#', stack, '|', mod_InfiTools.boneRod });
        ModLoader.addRecipe(new ItemStack(slimeArditeAxe), new Object[] 
                { "##", "#|", " |", '#', stack, '|', mod_InfiTools.slimeRod });
        ModLoader.addRecipe(new ItemStack(cactusArditeAxe), new Object[] 
                { "##", "#|", " |", '#', stack, '|', mod_InfiTools.cactusRod });
        ModLoader.addRecipe(new ItemStack(blazeArditeAxe), new Object[] 
                { "##", "#|", " |", '#', stack, '|', Item.blazeRod });
        ModLoader.addRecipe(new ItemStack(copperArditeAxe), new Object[] 
                { "##", "#|", " |", '#', stack, '|', mod_InfiMetals.copperRod });
        ModLoader.addRecipe(new ItemStack(bronzeArditeAxe), new Object[] 
                { "##", "#|", " |", '#', stack, '|', mod_InfiMetals.bronzeRod });
        ModLoader.addRecipe(new ItemStack(workedArditeAxe), new Object[] 
                { "##", "#|", " |", '#', stack, '|', mod_InfiMetals.workedIronRod });
        ModLoader.addRecipe(new ItemStack(steelArditeAxe), new Object[] 
                { "##", "#|", " |", '#', stack, '|', mod_InfiMetals.steelRod });
        ModLoader.addRecipe(new ItemStack(cobaltArditeAxe), new Object[] 
                { "##", "#|", " |", '#', stack, '|', mod_InfiMetals.cobaltRod });
        ModLoader.addRecipe(new ItemStack(arditeArditeAxe), new Object[] 
                { "##", "#|", " |", '#', stack, '|', mod_InfiMetals.arditeRod });
        ModLoader.addRecipe(new ItemStack(manyullynArditeAxe), new Object[] 
                { "##", "#|", " |", '#', stack, '|', mod_InfiMetals.manyullynRod });
        ModLoader.addRecipe(new ItemStack(uraniumArditeAxe), new Object[] 
                { "##", "#|", " |", '#', stack, '|', mod_InfiMetals.uraniumRod });
    }
    
    public static void addManyullynTools(ItemStack stack)
    {
        ModLoader.addRecipe(new ItemStack(stoneManyullynAxe), new Object[] 
                { "##", "#|", " |", '#', stack, '|', mod_InfiTools.stoneRod });
        ModLoader.addRecipe(new ItemStack(ironManyullynAxe), new Object[] 
                { "##", "#|", " |", '#', stack, '|', mod_InfiTools.ironRod });
        ModLoader.addRecipe(new ItemStack(diamondManyullynAxe), new Object[] 
                { "##", "#|", " |", '#', stack, '|', mod_InfiTools.diamondRod });
        ModLoader.addRecipe(new ItemStack(redstoneManyullynAxe), new Object[] 
                { "##", "#|", " |", '#', stack, '|', mod_InfiTools.redstoneRod });
        ModLoader.addRecipe(new ItemStack(obsidianManyullynAxe), new Object[] 
                { "##", "#|", " |", '#', stack, '|', mod_InfiTools.obsidianRod });
        ModLoader.addRecipe(new ItemStack(boneManyullynAxe), new Object[] 
                { "##", "#|", " |", '#', stack, '|', Item.bone });
        ModLoader.addRecipe(new ItemStack(boneManyullynAxe), new Object[] 
                { "##", "#|", " |", '#', stack, '|', mod_InfiTools.boneRod });
        ModLoader.addRecipe(new ItemStack(slimeManyullynAxe), new Object[] 
                { "##", "#|", " |", '#', stack, '|', mod_InfiTools.slimeRod });
        ModLoader.addRecipe(new ItemStack(cactusManyullynAxe), new Object[] 
                { "##", "#|", " |", '#', stack, '|', mod_InfiTools.cactusRod });
        ModLoader.addRecipe(new ItemStack(blazeManyullynAxe), new Object[] 
                { "##", "#|", " |", '#', stack, '|', Item.blazeRod });
        ModLoader.addRecipe(new ItemStack(copperManyullynAxe), new Object[] 
                { "##", "#|", " |", '#', stack, '|', mod_InfiMetals.copperRod });
        ModLoader.addRecipe(new ItemStack(bronzeManyullynAxe), new Object[] 
                { "##", "#|", " |", '#', stack, '|', mod_InfiMetals.bronzeRod });
        ModLoader.addRecipe(new ItemStack(workedManyullynAxe), new Object[] 
                { "##", "#|", " |", '#', stack, '|', mod_InfiMetals.workedIronRod });
        ModLoader.addRecipe(new ItemStack(steelManyullynAxe), new Object[] 
                { "##", "#|", " |", '#', stack, '|', mod_InfiMetals.steelRod });
        ModLoader.addRecipe(new ItemStack(cobaltManyullynAxe), new Object[] 
                { "##", "#|", " |", '#', stack, '|', mod_InfiMetals.cobaltRod });
        ModLoader.addRecipe(new ItemStack(arditeManyullynAxe), new Object[] 
                { "##", "#|", " |", '#', stack, '|', mod_InfiMetals.arditeRod });
        ModLoader.addRecipe(new ItemStack(manyullynManyullynAxe), new Object[] 
                { "##", "#|", " |", '#', stack, '|', mod_InfiMetals.manyullynRod });
        ModLoader.addRecipe(new ItemStack(uraniumManyullynAxe), new Object[] 
                { "##", "#|", " |", '#', stack, '|', mod_InfiMetals.uraniumRod });
    }
    
    public static void addUraniumTools(ItemStack stack)
    {
        ModLoader.addRecipe(new ItemStack(diamondUraniumAxe), new Object[] 
                { "##", "#|", " |", '#', stack, '|', mod_InfiTools.diamondRod });
        ModLoader.addRecipe(new ItemStack(redstoneUraniumAxe), new Object[] 
                { "##", "#|", " |", '#', stack, '|', mod_InfiTools.redstoneRod });
        ModLoader.addRecipe(new ItemStack(boneUraniumAxe), new Object[] 
                { "##", "#|", " |", '#', stack, '|', Item.bone });
        ModLoader.addRecipe(new ItemStack(boneUraniumAxe), new Object[] 
                { "##", "#|", " |", '#', stack, '|', mod_InfiTools.boneRod });
        ModLoader.addRecipe(new ItemStack(netherrackUraniumAxe), new Object[] 
                { "##", "#|", " |", '#', stack, '|', mod_InfiTools.netherrackRod });
        ModLoader.addRecipe(new ItemStack(glowstoneUraniumAxe), new Object[] 
                { "##", "#|", " |", '#', stack, '|', mod_InfiTools.glowstoneRod });
        ModLoader.addRecipe(new ItemStack(lavaUraniumAxe), new Object[] 
                { "##", "#|", " |", '#', stack, '|', mod_InfiTools.lavaRod });
        ModLoader.addRecipe(new ItemStack(blazeUraniumAxe), new Object[] 
                { "##", "#|", " |", '#', stack, '|', Item.blazeRod });
        ModLoader.addRecipe(new ItemStack(cobaltUraniumAxe), new Object[] 
                { "##", "#|", " |", '#', stack, '|', mod_InfiMetals.cobaltRod });
        ModLoader.addRecipe(new ItemStack(arditeUraniumAxe), new Object[] 
                { "##", "#|", " |", '#', stack, '|', mod_InfiMetals.arditeRod });
        ModLoader.addRecipe(new ItemStack(uraniumUraniumAxe), new Object[] 
                { "##", "#|", " |", '#', stack, '|', mod_InfiMetals.uraniumRod });
    }
    
    public static void addStoneTools(ItemStack stack)
    {
        ModLoader.addRecipe(new ItemStack(copperStoneAxe), new Object[] 
                { "##", "#|", " |", '#', stack, '|', mod_InfiMetals.copperRod });
    }
    
    public static void addRedstoneTools(ItemStack stack)
    {
        if(PropsHelperInfiMetals.enableRedstoneTools)
        {
            ModLoader.addRecipe(new ItemStack(copperRedstoneAxe), new Object[] 
                    { "##", "#|", " |", '#', stack, '|', mod_InfiMetals.copperRod });
            ModLoader.addRecipe(new ItemStack(bronzeRedstoneAxe), new Object[] 
                    { "##", "#|", " |", '#', stack, '|', mod_InfiMetals.bronzeRod });
            ModLoader.addRecipe(new ItemStack(workedRedstoneAxe), new Object[] 
                    { "##", "#|", " |", '#', stack, '|', mod_InfiMetals.workedIronRod });
        }
    }
    
    public static void addGlowstoneTools(ItemStack stack)
    {
        if(PropsHelperInfiMetals.enableGlowstoneTools)
        {
            ModLoader.addRecipe(new ItemStack(copperGlowstoneAxe), new Object[] 
                    { "##", "#|", " |", '#', stack, '|', mod_InfiMetals.copperRod });
            ModLoader.addRecipe(new ItemStack(bronzeGlowstoneAxe), new Object[] 
                    { "##", "#|", " |", '#', stack, '|', mod_InfiMetals.bronzeRod });
            ModLoader.addRecipe(new ItemStack(workedGlowstoneAxe), new Object[] 
                    { "##", "#|", " |", '#', stack, '|', mod_InfiMetals.workedIronRod });
            ModLoader.addRecipe(new ItemStack(steelGlowstoneAxe), new Object[] 
                    { "##", "#|", " |", '#', stack, '|', mod_InfiMetals.steelRod });
        }
    }
    
    public static void addLavaTools(ItemStack stack)
    {
        ModLoader.addRecipe(new ItemStack(cobaltLavaAxe), new Object[] 
                { "##", "#|", " |", '#', stack, '|', mod_InfiMetals.cobaltRod });
        ModLoader.addRecipe(new ItemStack(arditeLavaAxe), new Object[] 
                { "##", "#|", " |", '#', stack, '|', mod_InfiMetals.arditeRod });
        ModLoader.addRecipe(new ItemStack(manyullynLavaAxe), new Object[] 
                { "##", "#|", " |", '#', stack, '|', mod_InfiMetals.manyullynRod });
        ModLoader.addRecipe(new ItemStack(uraniumLavaAxe), new Object[] 
                { "##", "#|", " |", '#', stack, '|', mod_InfiMetals.uraniumRod });
    }
    
    public static void addSlimeTools(ItemStack stack)
    {
        ModLoader.addRecipe(new ItemStack(copperSlimeAxe), new Object[] 
                { "##", "#|", " |", '#', stack, '|', mod_InfiMetals.copperRod });
        ModLoader.addRecipe(new ItemStack(bronzeSlimeAxe), new Object[] 
                { "##", "#|", " |", '#', stack, '|', mod_InfiMetals.bronzeRod });
        ModLoader.addRecipe(new ItemStack(workedSlimeAxe), new Object[] 
                { "##", "#|", " |", '#', stack, '|', mod_InfiMetals.workedIronRod });
        ModLoader.addRecipe(new ItemStack(steelSlimeAxe), new Object[] 
                { "##", "#|", " |", '#', stack, '|', mod_InfiMetals.steelRod });
        ModLoader.addRecipe(new ItemStack(cobaltSlimeAxe), new Object[] 
                { "##", "#|", " |", '#', stack, '|', mod_InfiMetals.cobaltRod });
        ModLoader.addRecipe(new ItemStack(arditeSlimeAxe), new Object[] 
                { "##", "#|", " |", '#', stack, '|', mod_InfiMetals.arditeRod });
        ModLoader.addRecipe(new ItemStack(manyullynSlimeAxe), new Object[] 
                { "##", "#|", " |", '#', stack, '|', mod_InfiMetals.manyullynRod });
        ModLoader.addRecipe(new ItemStack(uraniumSlimeAxe), new Object[] 
                { "##", "#|", " |", '#', stack, '|', mod_InfiMetals.uraniumRod });
    }
    
    public static void addBlazeTools(ItemStack stack)
    {
        ModLoader.addRecipe(new ItemStack(cobaltBlazeAxe), new Object[] 
                { "##", "#|", " |", '#', stack, '|', mod_InfiMetals.cobaltRod });
        ModLoader.addRecipe(new ItemStack(arditeBlazeAxe), new Object[] 
                { "##", "#|", " |", '#', stack, '|', mod_InfiMetals.arditeRod });
        ModLoader.addRecipe(new ItemStack(manyullynBlazeAxe), new Object[] 
                { "##", "#|", " |", '#', stack, '|', mod_InfiMetals.manyullynRod });
        ModLoader.addRecipe(new ItemStack(uraniumBlazeAxe), new Object[] 
                { "##", "#|", " |", '#', stack, '|', mod_InfiMetals.uraniumRod });
    }
    
    public static Item stoneCopperAxe;
    public static Item boneCopperAxe;
    public static Item netherrackCopperAxe;
    public static Item slimeCopperAxe;
    public static Item cactusCopperAxe;
    public static Item flintCopperAxe;
    public static Item copperCopperAxe;
    
    public static Item stoneBronzeAxe;
    public static Item boneBronzeAxe;
    public static Item netherrackBronzeAxe;
    public static Item slimeBronzeAxe;
    public static Item cactusBronzeAxe;
    public static Item flintBronzeAxe;
    public static Item copperBronzeAxe;
    public static Item bronzeBronzeAxe;
    
    public static Item stoneWorkedIronAxe;
    public static Item ironWorkedIronAxe;
    public static Item diamondWorkedIronAxe;
    public static Item goldWorkedIronAxe;
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
    public static Item cobaltWorkedIronAxe;
    public static Item arditeWorkedIronAxe;
    public static Item uraniumWorkedIronAxe;
    
    public static Item stoneSteelAxe;
    public static Item ironSteelAxe;
    public static Item diamondSteelAxe;
    public static Item goldSteelAxe;
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
    
    public static Item copperStoneAxe;
    
    public static Item copperIronAxe;
    public static Item bronzeIronAxe;
    public static Item workedIronAxe;
    
    public static Item copperDiamondAxe;
    public static Item bronzeDiamondAxe;
    public static Item workedDiamondAxe;
    public static Item steelDiamondAxe;
    public static Item cobaltDiamondAxe;
    public static Item arditeDiamondAxe;
    public static Item manyullynDiamondAxe;
    public static Item uraniumDiamondAxe;
    
    public static Item copperRedstoneAxe;
    public static Item bronzeRedstoneAxe;
    public static Item workedRedstoneAxe;
    
    public static Item cobaltMossyAxe;
    public static Item arditeMossyAxe;
    public static Item manyullynMossyAxe;
    
    public static Item copperNetherrackAxe;
    
    public static Item copperGlowstoneAxe;
    public static Item bronzeGlowstoneAxe;
    public static Item workedGlowstoneAxe;
    public static Item steelGlowstoneAxe;
    
    public static Item cobaltLavaAxe;
    public static Item arditeLavaAxe;
    public static Item manyullynLavaAxe;
    public static Item uraniumLavaAxe;
    
    public static Item copperSlimeAxe;
    public static Item bronzeSlimeAxe;
    public static Item workedSlimeAxe;
    public static Item steelSlimeAxe;
    public static Item cobaltSlimeAxe;
    public static Item arditeSlimeAxe;
    public static Item manyullynSlimeAxe;
    public static Item uraniumSlimeAxe;
    
    public static Item copperFlintAxe;
    public static Item bronzeFlintAxe;
    
    public static Item cobaltBlazeAxe;
    public static Item arditeBlazeAxe;
    public static Item manyullynBlazeAxe;
    public static Item uraniumBlazeAxe;
}
