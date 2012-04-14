package net.minecraft.src.metals;

import net.minecraft.src.InfiMaterialEnum;
import net.minecraft.src.Block;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;
import net.minecraft.src.ModLoader;
import net.minecraft.src.mod_InfiMetals;
import net.minecraft.src.mod_InfiTools;

public class MetalPickaxes 
{
    public static MetalPickaxes instance = new MetalPickaxes();
    
    public static MetalPickaxes getInstance()
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
            stoneCopperPickaxe = new MetalToolPickaxe(PropsHelperInfiMetals.copperPickaxeID+0, 
                    InfiMaterialEnum.Copper, InfiMaterialEnum.Stone, "stoneCopperPickaxe");
            boneCopperPickaxe = new MetalToolPickaxe(PropsHelperInfiMetals.copperPickaxeID+1, 
                    InfiMaterialEnum.Copper, InfiMaterialEnum.Bone, "boneCopperPickaxe");
            netherrackCopperPickaxe = new MetalToolPickaxe(PropsHelperInfiMetals.copperPickaxeID+2, 
                    InfiMaterialEnum.Copper, InfiMaterialEnum.Netherrack, "netherrackCopperPickaxe");
            slimeCopperPickaxe = new MetalToolPickaxe(PropsHelperInfiMetals.copperPickaxeID+3, 
                    InfiMaterialEnum.Copper, InfiMaterialEnum.Slime, "slimeCopperPickaxe");
            cactusCopperPickaxe = new MetalToolPickaxe(PropsHelperInfiMetals.copperPickaxeID+4, 
                    InfiMaterialEnum.Copper, InfiMaterialEnum.Cactus, "cactusCopperPickaxe");
            flintCopperPickaxe = new MetalToolPickaxe(PropsHelperInfiMetals.copperPickaxeID+5, 
                    InfiMaterialEnum.Copper, InfiMaterialEnum.Flint, "flintCopperPickaxe");
            copperCopperPickaxe = new MetalToolPickaxe(PropsHelperInfiMetals.copperPickaxeID+6, 
                    InfiMaterialEnum.Copper, InfiMaterialEnum.Copper, "copperCopperPickaxe");
        }
        
        if(PropsHelperInfiMetals.enableBronzeTools)
        {
            stoneBronzePickaxe = new MetalToolPickaxe(PropsHelperInfiMetals.bronzePickaxeID+0, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Stone, "stoneBronzePickaxe");
            boneBronzePickaxe = new MetalToolPickaxe(PropsHelperInfiMetals.bronzePickaxeID+1, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Bone, "boneBronzePickaxe");
            netherrackBronzePickaxe = new MetalToolPickaxe(PropsHelperInfiMetals.bronzePickaxeID+2, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Netherrack, "netherrackBronzePickaxe");
            slimeBronzePickaxe = new MetalToolPickaxe(PropsHelperInfiMetals.bronzePickaxeID+3, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Slime, "slimeBronzePickaxe");
            cactusBronzePickaxe = new MetalToolPickaxe(PropsHelperInfiMetals.bronzePickaxeID+4, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Cactus, "cactusBronzePickaxe");
            flintBronzePickaxe = new MetalToolPickaxe(PropsHelperInfiMetals.bronzePickaxeID+5, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Flint, "flintBronzePickaxe");
            copperBronzePickaxe = new MetalToolPickaxe(PropsHelperInfiMetals.bronzePickaxeID+6, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Copper, "copperBronzePickaxe");
            bronzeBronzePickaxe = new MetalToolPickaxe(PropsHelperInfiMetals.bronzePickaxeID+7, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Bronze, "copperBronzePickaxe");
        }
        
        if(PropsHelperInfiMetals.enableWorkedIronTools)
        {
            stoneWorkedIronPickaxe = new MetalToolPickaxe(PropsHelperInfiMetals.workedIronPickaxeID+0, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Stone, "stoneWorkedIronPickaxe");
            ironWorkedIronPickaxe = new MetalToolPickaxe(PropsHelperInfiMetals.workedIronPickaxeID+1, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Iron, "ironWorkedIronPickaxe");
            diamondWorkedIronPickaxe = new MetalToolPickaxe(PropsHelperInfiMetals.workedIronPickaxeID+2, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Diamond, "diamondWorkedIronPickaxe");
            goldWorkedIronPickaxe = new MetalToolPickaxe(PropsHelperInfiMetals.workedIronPickaxeID+3, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Gold, "goldWorkedIronPickaxe");
            redstoneWorkedIronPickaxe = new MetalToolPickaxe(PropsHelperInfiMetals.workedIronPickaxeID+4, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Redstone, "redstoneWorkedIronPickaxe");
            obsidianWorkedIronPickaxe = new MetalToolPickaxe(PropsHelperInfiMetals.workedIronPickaxeID+5, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Obsidian, "obsidianWorkedIronPickaxe");
            boneWorkedIronPickaxe = new MetalToolPickaxe(PropsHelperInfiMetals.workedIronPickaxeID+6, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Bone, "boneWorkedIronPickaxe");
            netherrackWorkedIronPickaxe = new MetalToolPickaxe(PropsHelperInfiMetals.workedIronPickaxeID+7, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Netherrack, "netherrackWorkedIronPickaxe");
            glowstoneWorkedIronPickaxe = new MetalToolPickaxe(PropsHelperInfiMetals.workedIronPickaxeID+8, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Glowstone, "glowstoneWorkedIronPickaxe");
            iceWorkedIronPickaxe = new MetalToolPickaxe(PropsHelperInfiMetals.workedIronPickaxeID+9, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Ice, "iceWorkedIronPickaxe");
            slimeWorkedIronPickaxe = new MetalToolPickaxe(PropsHelperInfiMetals.workedIronPickaxeID+10, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Slime, "slimeWorkedIronPickaxe");
            cactusWorkedIronPickaxe = new MetalToolPickaxe(PropsHelperInfiMetals.workedIronPickaxeID+11, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Cactus, "cactusWorkedIronPickaxe");
            blazeWorkedIronPickaxe = new MetalToolPickaxe(PropsHelperInfiMetals.workedIronPickaxeID+12, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Blaze, "blazeWorkedIronPickaxe");
            copperWorkedIronPickaxe = new MetalToolPickaxe(PropsHelperInfiMetals.workedIronPickaxeID+13, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Copper, "copperWorkedIronPickaxe");
            bronzeWorkedIronPickaxe = new MetalToolPickaxe(PropsHelperInfiMetals.workedIronPickaxeID+14, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Bronze, "bronzeWorkedIronPickaxe");
            workedWorkedIronPickaxe = new MetalToolPickaxe(PropsHelperInfiMetals.workedIronPickaxeID+15, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.WorkedIron, "workedWorkedIronPickaxe");
            steelWorkedIronPickaxe = new MetalToolPickaxe(PropsHelperInfiMetals.workedIronPickaxeID+16, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Steel, "steelWorkedIronPickaxe");
            cobaltWorkedIronPickaxe = new MetalToolPickaxe(PropsHelperInfiMetals.workedIronPickaxeID+17, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Cobalt, "cobaltWorkedIronPickaxe");
            arditeWorkedIronPickaxe = new MetalToolPickaxe(PropsHelperInfiMetals.workedIronPickaxeID+18, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Ardite, "arditeWorkedIronPickaxe");
            uraniumWorkedIronPickaxe = new MetalToolPickaxe(PropsHelperInfiMetals.workedIronPickaxeID+19, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Bronze, "uraniumWorkedIronPickaxe");
        }
        
        if(PropsHelperInfiMetals.enableSteelTools)
        {
            stoneSteelPickaxe = new MetalToolPickaxe(PropsHelperInfiMetals.steelPickaxeID+0, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Stone, "stoneSteelPickaxe");
            ironSteelPickaxe = new MetalToolPickaxe(PropsHelperInfiMetals.steelPickaxeID+1, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Iron, "ironSteelPickaxe");
            diamondSteelPickaxe = new MetalToolPickaxe(PropsHelperInfiMetals.steelPickaxeID+2, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Diamond, "diamondSteelPickaxe");
            goldSteelPickaxe = new MetalToolPickaxe(PropsHelperInfiMetals.steelPickaxeID+3, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Gold, "goldSteelPickaxe");
            redstoneSteelPickaxe = new MetalToolPickaxe(PropsHelperInfiMetals.steelPickaxeID+4, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Redstone, "redstoneSteelPickaxe");
            obsidianSteelPickaxe = new MetalToolPickaxe(PropsHelperInfiMetals.steelPickaxeID+5, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Obsidian, "obsidianSteelPickaxe");
            boneSteelPickaxe = new MetalToolPickaxe(PropsHelperInfiMetals.steelPickaxeID+6, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Bone, "boneSteelPickaxe");
            netherrackSteelPickaxe = new MetalToolPickaxe(PropsHelperInfiMetals.steelPickaxeID+7, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Netherrack, "netherrackSteelPickaxe");
            glowstoneSteelPickaxe = new MetalToolPickaxe(PropsHelperInfiMetals.steelPickaxeID+8, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Glowstone, "glowstoneSteelPickaxe");
            iceSteelPickaxe = new MetalToolPickaxe(PropsHelperInfiMetals.steelPickaxeID+9, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Ice, "iceSteelPickaxe");
            slimeSteelPickaxe = new MetalToolPickaxe(PropsHelperInfiMetals.steelPickaxeID+10, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Slime, "slimeSteelPickaxe");
            cactusSteelPickaxe = new MetalToolPickaxe(PropsHelperInfiMetals.steelPickaxeID+11, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Cactus, "cactusSteelPickaxe");
            blazeSteelPickaxe = new MetalToolPickaxe(PropsHelperInfiMetals.steelPickaxeID+12, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Blaze, "blazeSteelPickaxe");
            copperSteelPickaxe = new MetalToolPickaxe(PropsHelperInfiMetals.steelPickaxeID+13, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Copper, "copperSteelPickaxe");
            bronzeSteelPickaxe = new MetalToolPickaxe(PropsHelperInfiMetals.steelPickaxeID+14, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Bronze, "bronzeSteelPickaxe");
            workedSteelPickaxe = new MetalToolPickaxe(PropsHelperInfiMetals.steelPickaxeID+15, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.WorkedIron, "workedSteelPickaxe");
            steelSteelPickaxe = new MetalToolPickaxe(PropsHelperInfiMetals.steelPickaxeID+16, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Steel, "steelSteelPickaxe");
            cobaltSteelPickaxe = new MetalToolPickaxe(PropsHelperInfiMetals.steelPickaxeID+17, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Cobalt, "cobaltSteelPickaxe");
            arditeSteelPickaxe = new MetalToolPickaxe(PropsHelperInfiMetals.steelPickaxeID+18, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Ardite, "arditeSteelPickaxe");
            uraniumSteelPickaxe = new MetalToolPickaxe(PropsHelperInfiMetals.steelPickaxeID+19, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Bronze, "uraniumSteelPickaxe");
        }
        
        if(PropsHelperInfiMetals.enableCobaltTools)
        {
            stoneCobaltPickaxe = new MetalToolPickaxe(PropsHelperInfiMetals.cobaltPickaxeID+0, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Stone, "stoneCobaltPickaxe");
            ironCobaltPickaxe = new MetalToolPickaxe(PropsHelperInfiMetals.cobaltPickaxeID+1, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Iron, "ironCobaltPickaxe");
            diamondCobaltPickaxe = new MetalToolPickaxe(PropsHelperInfiMetals.cobaltPickaxeID+2,
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Gold, "goldCobaltPickaxe");
            redstoneCobaltPickaxe = new MetalToolPickaxe(PropsHelperInfiMetals.cobaltPickaxeID+4, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Redstone, "redstoneCobaltPickaxe");
            obsidianCobaltPickaxe = new MetalToolPickaxe(PropsHelperInfiMetals.cobaltPickaxeID+5, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Obsidian, "obsidianCobaltPickaxe");
            boneCobaltPickaxe = new MetalToolPickaxe(PropsHelperInfiMetals.cobaltPickaxeID+6, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Bone, "boneCobaltPickaxe");
            slimeCobaltPickaxe = new MetalToolPickaxe(PropsHelperInfiMetals.cobaltPickaxeID+7, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Slime, "slimeCobaltPickaxe");
            cactusCobaltPickaxe = new MetalToolPickaxe(PropsHelperInfiMetals.cobaltPickaxeID+8, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Cactus, "cactusCobaltPickaxe");
            blazeCobaltPickaxe = new MetalToolPickaxe(PropsHelperInfiMetals.cobaltPickaxeID+9, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Blaze, "blazeCobaltPickaxe");
            copperCobaltPickaxe = new MetalToolPickaxe(PropsHelperInfiMetals.cobaltPickaxeID+10, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Copper, "copperCobaltPickaxe");
            bronzeCobaltPickaxe = new MetalToolPickaxe(PropsHelperInfiMetals.cobaltPickaxeID+11, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Bronze, "bronzeCobaltPickaxe");
            workedCobaltPickaxe = new MetalToolPickaxe(PropsHelperInfiMetals.cobaltPickaxeID+12, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.WorkedIron, "workedCobaltPickaxe");
            steelCobaltPickaxe = new MetalToolPickaxe(PropsHelperInfiMetals.cobaltPickaxeID+13, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Steel, "steelCobaltPickaxe");
            cobaltCobaltPickaxe = new MetalToolPickaxe(PropsHelperInfiMetals.cobaltPickaxeID+14, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Cobalt, "cobaltCobaltPickaxe");
            arditeCobaltPickaxe = new MetalToolPickaxe(PropsHelperInfiMetals.cobaltPickaxeID+15, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Ardite, "arditeCobaltPickaxe");
            manyullynCobaltPickaxe = new MetalToolPickaxe(PropsHelperInfiMetals.cobaltPickaxeID+16, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Manyullyn, "arditeCobaltPickaxe");
            uraniumCobaltPickaxe = new MetalToolPickaxe(PropsHelperInfiMetals.cobaltPickaxeID+17, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Bronze, "uraniumCobaltPickaxe");
        }
        
        if(PropsHelperInfiMetals.enableArditeTools)
        {
            stoneArditePickaxe = new MetalToolPickaxe(PropsHelperInfiMetals.arditePickaxeID+0, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Stone, "stoneArditePickaxe");
            ironArditePickaxe = new MetalToolPickaxe(PropsHelperInfiMetals.arditePickaxeID+1, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Iron, "ironArditePickaxe");
            diamondArditePickaxe = new MetalToolPickaxe(PropsHelperInfiMetals.arditePickaxeID+2,
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Gold, "goldArditePickaxe");
            redstoneArditePickaxe = new MetalToolPickaxe(PropsHelperInfiMetals.arditePickaxeID+4, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Redstone, "redstoneArditePickaxe");
            obsidianArditePickaxe = new MetalToolPickaxe(PropsHelperInfiMetals.arditePickaxeID+5, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Obsidian, "obsidianArditePickaxe");
            boneArditePickaxe = new MetalToolPickaxe(PropsHelperInfiMetals.arditePickaxeID+6, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Bone, "boneArditePickaxe");
            slimeArditePickaxe = new MetalToolPickaxe(PropsHelperInfiMetals.arditePickaxeID+7, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Slime, "slimeArditePickaxe");
            cactusArditePickaxe = new MetalToolPickaxe(PropsHelperInfiMetals.arditePickaxeID+8, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Cactus, "cactusArditePickaxe");
            blazeArditePickaxe = new MetalToolPickaxe(PropsHelperInfiMetals.arditePickaxeID+9, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Blaze, "blazeArditePickaxe");
            copperArditePickaxe = new MetalToolPickaxe(PropsHelperInfiMetals.arditePickaxeID+10, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Copper, "copperArditePickaxe");
            bronzeArditePickaxe = new MetalToolPickaxe(PropsHelperInfiMetals.arditePickaxeID+11, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Bronze, "bronzeArditePickaxe");
            workedArditePickaxe = new MetalToolPickaxe(PropsHelperInfiMetals.arditePickaxeID+12, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.WorkedIron, "workedArditePickaxe");
            steelArditePickaxe = new MetalToolPickaxe(PropsHelperInfiMetals.arditePickaxeID+13, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Steel, "steelArditePickaxe");
            cobaltArditePickaxe = new MetalToolPickaxe(PropsHelperInfiMetals.arditePickaxeID+14, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Cobalt, "cobaltArditePickaxe");
            arditeArditePickaxe = new MetalToolPickaxe(PropsHelperInfiMetals.arditePickaxeID+15, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Ardite, "arditeArditePickaxe");
            manyullynArditePickaxe = new MetalToolPickaxe(PropsHelperInfiMetals.arditePickaxeID+16, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Manyullyn, "arditeArditePickaxe");
            uraniumArditePickaxe = new MetalToolPickaxe(PropsHelperInfiMetals.arditePickaxeID+17, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Bronze, "uraniumArditePickaxe");
        }
        
        if(PropsHelperInfiMetals.enableManyullynTools)
        {
            stoneManyullynPickaxe = new MetalToolPickaxe(PropsHelperInfiMetals.manyullynPickaxeID+0, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Stone, "stoneManyullynPickaxe");
            ironManyullynPickaxe = new MetalToolPickaxe(PropsHelperInfiMetals.manyullynPickaxeID+1, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Iron, "ironManyullynPickaxe");
            diamondManyullynPickaxe = new MetalToolPickaxe(PropsHelperInfiMetals.manyullynPickaxeID+2,
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Gold, "goldManyullynPickaxe");
            redstoneManyullynPickaxe = new MetalToolPickaxe(PropsHelperInfiMetals.manyullynPickaxeID+4, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Redstone, "redstoneManyullynPickaxe");
            obsidianManyullynPickaxe = new MetalToolPickaxe(PropsHelperInfiMetals.manyullynPickaxeID+5, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Obsidian, "obsidianManyullynPickaxe");
            boneManyullynPickaxe = new MetalToolPickaxe(PropsHelperInfiMetals.manyullynPickaxeID+6, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Bone, "boneManyullynPickaxe");
            slimeManyullynPickaxe = new MetalToolPickaxe(PropsHelperInfiMetals.manyullynPickaxeID+7, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Slime, "slimeManyullynPickaxe");
            cactusManyullynPickaxe = new MetalToolPickaxe(PropsHelperInfiMetals.manyullynPickaxeID+8, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Cactus, "cactusManyullynPickaxe");
            blazeManyullynPickaxe = new MetalToolPickaxe(PropsHelperInfiMetals.manyullynPickaxeID+9, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Blaze, "blazeManyullynPickaxe");
            copperManyullynPickaxe = new MetalToolPickaxe(PropsHelperInfiMetals.manyullynPickaxeID+10, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Copper, "copperManyullynPickaxe");
            bronzeManyullynPickaxe = new MetalToolPickaxe(PropsHelperInfiMetals.manyullynPickaxeID+11, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Bronze, "bronzeManyullynPickaxe");
            workedManyullynPickaxe = new MetalToolPickaxe(PropsHelperInfiMetals.manyullynPickaxeID+12, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.WorkedIron, "workedManyullynPickaxe");
            steelManyullynPickaxe = new MetalToolPickaxe(PropsHelperInfiMetals.manyullynPickaxeID+13, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Steel, "steelManyullynPickaxe");
            cobaltManyullynPickaxe = new MetalToolPickaxe(PropsHelperInfiMetals.manyullynPickaxeID+14, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Cobalt, "cobaltManyullynPickaxe");
            arditeManyullynPickaxe = new MetalToolPickaxe(PropsHelperInfiMetals.manyullynPickaxeID+15, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Ardite, "arditeManyullynPickaxe");
            manyullynManyullynPickaxe = new MetalToolPickaxe(PropsHelperInfiMetals.manyullynPickaxeID+16, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Manyullyn, "arditeManyullynPickaxe");
            uraniumManyullynPickaxe = new MetalToolPickaxe(PropsHelperInfiMetals.manyullynPickaxeID+17, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Bronze, "uraniumManyullynPickaxe");
        }
        
        if(PropsHelperInfiMetals.enableUraniumTools)
        {
            diamondUraniumPickaxe = new MetalToolPickaxe(PropsHelperInfiMetals.uraniumPickaxeID+0, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Diamond, "diamondUraniumPickaxe");
            redstoneUraniumPickaxe = new MetalToolPickaxe(PropsHelperInfiMetals.uraniumPickaxeID+1, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Redstone, "redstoneUraniumPickaxe");
            boneUraniumPickaxe = new MetalToolPickaxe(PropsHelperInfiMetals.uraniumPickaxeID+2, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Bone, "boneUraniumPickaxe");
            netherrackUraniumPickaxe = new MetalToolPickaxe(PropsHelperInfiMetals.uraniumPickaxeID+3, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Netherrack, "netherrackUraniumPickaxe");
            glowstoneUraniumPickaxe = new MetalToolPickaxe(PropsHelperInfiMetals.uraniumPickaxeID+4, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Glowstone, "glowstoneUraniumPickaxe");
            lavaUraniumPickaxe = new MetalToolPickaxe(PropsHelperInfiMetals.uraniumPickaxeID+5, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Lava, "lavaUraniumPickaxe");
            blazeUraniumPickaxe = new MetalToolPickaxe(PropsHelperInfiMetals.uraniumPickaxeID+6, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Blaze, "blazeUraniumPickaxe");
            cobaltUraniumPickaxe = new MetalToolPickaxe(PropsHelperInfiMetals.uraniumPickaxeID+7, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Cobalt, "cobaltUraniumPickaxe");
            arditeUraniumPickaxe = new MetalToolPickaxe(PropsHelperInfiMetals.uraniumPickaxeID+8, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Ardite, "arditeUraniumPickaxe");
            uraniumUraniumPickaxe = new MetalToolPickaxe(PropsHelperInfiMetals.uraniumPickaxeID+9, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Uranium, "uraniumUraniumPickaxe");
        }
        
        if(PropsHelperInfiMetals.enableStoneTools)
        {
            copperStonePickaxe = new MetalToolPickaxe(PropsHelperInfiMetals.stonePickaxeID+0, 
                    InfiMaterialEnum.Stone, InfiMaterialEnum.Copper, "copperStonePickaxe");
        }
        
        if(PropsHelperInfiMetals.enableIronTools)
        {
            copperIronPickaxe = new MetalToolPickaxe(PropsHelperInfiMetals.ironPickaxeID+0, 
                    InfiMaterialEnum.Iron, InfiMaterialEnum.Copper, "copperIronPickaxe");
            bronzeIronPickaxe = new MetalToolPickaxe(PropsHelperInfiMetals.ironPickaxeID+1, 
                    InfiMaterialEnum.Iron, InfiMaterialEnum.Bronze, "bronzeIronPickaxe");
            workedIronPickaxe = new MetalToolPickaxe(PropsHelperInfiMetals.ironPickaxeID+2, 
                    InfiMaterialEnum.Iron, InfiMaterialEnum.WorkedIron, "workedIronPickaxe");
        }
        
        if(PropsHelperInfiMetals.enableDiamondTools)
        {
            copperDiamondPickaxe = new MetalToolPickaxe(PropsHelperInfiMetals.diamondPickaxeID+0, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Copper, "copperDiamondPickaxe");
            bronzeDiamondPickaxe = new MetalToolPickaxe(PropsHelperInfiMetals.diamondPickaxeID+1, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Bronze, "bronzeDiamondPickaxe");
            workedDiamondPickaxe = new MetalToolPickaxe(PropsHelperInfiMetals.diamondPickaxeID+2, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.WorkedIron, "workedDiamondPickaxe");
            steelDiamondPickaxe = new MetalToolPickaxe(PropsHelperInfiMetals.diamondPickaxeID+3, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Steel, "steelDiamondPickaxe");
            cobaltDiamondPickaxe = new MetalToolPickaxe(PropsHelperInfiMetals.diamondPickaxeID+4, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Cobalt, "cobaltDiamondPickaxe");
            arditeDiamondPickaxe = new MetalToolPickaxe(PropsHelperInfiMetals.diamondPickaxeID+5, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Ardite, "arditeDiamondPickaxe");
            manyullynDiamondPickaxe = new MetalToolPickaxe(PropsHelperInfiMetals.diamondPickaxeID+6, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Manyullyn, "manyullynDiamondPickaxe");
            uraniumDiamondPickaxe = new MetalToolPickaxe(PropsHelperInfiMetals.diamondPickaxeID+7, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Uranium, "uraniumDiamondPickaxe");
        }
        
        if(PropsHelperInfiMetals.enableRedstoneTools)
        {
            copperRedstonePickaxe = new MetalToolPickaxe(PropsHelperInfiMetals.redstonePickaxeID+0, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Copper, "copperRedstonePickaxe");
            bronzeRedstonePickaxe = new MetalToolPickaxe(PropsHelperInfiMetals.redstonePickaxeID+1, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Bronze, "bronzeRedstonePickaxe");
            workedRedstonePickaxe = new MetalToolPickaxe(PropsHelperInfiMetals.redstonePickaxeID+2, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.WorkedIron, "workedRedstonePickaxe");
        }
        
        if(PropsHelperInfiMetals.enableMossyTools)
        {
            cobaltMossyPickaxe = new MetalToolPickaxe(PropsHelperInfiMetals.mossyPickaxeID+0, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Cobalt, "cobaltMossyPickaxe");
            arditeMossyPickaxe = new MetalToolPickaxe(PropsHelperInfiMetals.mossyPickaxeID+1, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Ardite, "arditeMossyPickaxe");
            manyullynMossyPickaxe = new MetalToolPickaxe(PropsHelperInfiMetals.mossyPickaxeID+2, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Manyullyn, "manyullynMossyPickaxe");
        }
        
        if(PropsHelperInfiMetals.enableNetherrackTools)
        {
            copperNetherrackPickaxe = new MetalToolPickaxe(PropsHelperInfiMetals.netherrackPickaxeID+0, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Copper, "copperNetherrackPickaxe");
        }
        
        if(PropsHelperInfiMetals.enableGlowstoneTools)
        {
            copperGlowstonePickaxe = new MetalToolPickaxe(PropsHelperInfiMetals.glowstonePickaxeID+0, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Copper, "copperGlowstonePickaxe");
            bronzeGlowstonePickaxe = new MetalToolPickaxe(PropsHelperInfiMetals.glowstonePickaxeID+1, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Bronze, "bronzeGlowstonePickaxe");
            workedGlowstonePickaxe = new MetalToolPickaxe(PropsHelperInfiMetals.glowstonePickaxeID+2, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.WorkedIron, "workedGlowstonePickaxe");
            steelGlowstonePickaxe = new MetalToolPickaxe(PropsHelperInfiMetals.glowstonePickaxeID+3, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Steel, "steelGlowstonePickaxe");
        }
        
        if(PropsHelperInfiMetals.enableLavaTools)
        {
            cobaltLavaPickaxe = new MetalToolPickaxe(PropsHelperInfiMetals.lavaPickaxeID+0, 
                    InfiMaterialEnum.Lava, InfiMaterialEnum.Cobalt, "cobaltLavaPickaxe");
            arditeLavaPickaxe = new MetalToolPickaxe(PropsHelperInfiMetals.lavaPickaxeID+1, 
                    InfiMaterialEnum.Lava, InfiMaterialEnum.Ardite, "arditeLavaPickaxe");
            manyullynLavaPickaxe = new MetalToolPickaxe(PropsHelperInfiMetals.lavaPickaxeID+2, 
                    InfiMaterialEnum.Lava, InfiMaterialEnum.Manyullyn, "manyullynLavaPickaxe");
            uraniumLavaPickaxe = new MetalToolPickaxe(PropsHelperInfiMetals.lavaPickaxeID+3, 
                    InfiMaterialEnum.Lava, InfiMaterialEnum.Uranium, "uraniumLavaPickaxe");
        }
        
        if(PropsHelperInfiMetals.enableSlimeTools)
        {
            copperSlimePickaxe = new MetalToolPickaxe(PropsHelperInfiMetals.slimePickaxeID+0, 
                    InfiMaterialEnum.Slime, InfiMaterialEnum.Copper, "copperSlimePickaxe");
            bronzeSlimePickaxe = new MetalToolPickaxe(PropsHelperInfiMetals.slimePickaxeID+1, 
                    InfiMaterialEnum.Slime, InfiMaterialEnum.Bronze, "bronzeSlimePickaxe");
            workedSlimePickaxe = new MetalToolPickaxe(PropsHelperInfiMetals.slimePickaxeID+2, 
                    InfiMaterialEnum.Slime, InfiMaterialEnum.WorkedIron, "workedSlimePickaxe");
            steelSlimePickaxe = new MetalToolPickaxe(PropsHelperInfiMetals.slimePickaxeID+3, 
                    InfiMaterialEnum.Slime, InfiMaterialEnum.Steel, "steelSlimePickaxe");
            cobaltSlimePickaxe = new MetalToolPickaxe(PropsHelperInfiMetals.slimePickaxeID+4, 
                    InfiMaterialEnum.Slime, InfiMaterialEnum.Cobalt, "cobaltSlimePickaxe");
            arditeSlimePickaxe = new MetalToolPickaxe(PropsHelperInfiMetals.slimePickaxeID+5, 
                    InfiMaterialEnum.Slime, InfiMaterialEnum.Ardite, "arditeSlimePickaxe");
            manyullynSlimePickaxe = new MetalToolPickaxe(PropsHelperInfiMetals.slimePickaxeID+6, 
                    InfiMaterialEnum.Slime, InfiMaterialEnum.Manyullyn, "manyullynSlimePickaxe");
            uraniumSlimePickaxe = new MetalToolPickaxe(PropsHelperInfiMetals.slimePickaxeID+7, 
                    InfiMaterialEnum.Slime, InfiMaterialEnum.Uranium, "uraniumSlimePickaxe");
        }
        
        if(PropsHelperInfiMetals.enableFlintTools)
        {
            copperFlintPickaxe = new MetalToolPickaxe(PropsHelperInfiMetals.flintPickaxeID+0, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Copper, "copperFlintPickaxe");
            bronzeFlintPickaxe = new MetalToolPickaxe(PropsHelperInfiMetals.flintPickaxeID+1, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Bronze, "bronzeFlintPickaxe");
        }
        
        if(PropsHelperInfiMetals.enableBlazeTools)
        {
            cobaltBlazePickaxe = new MetalToolPickaxe(PropsHelperInfiMetals.blazePickaxeID+0, 
                    InfiMaterialEnum.Blaze, InfiMaterialEnum.Cobalt, "cobaltBlazePickaxe");
            arditeBlazePickaxe = new MetalToolPickaxe(PropsHelperInfiMetals.blazePickaxeID+1, 
                    InfiMaterialEnum.Blaze, InfiMaterialEnum.Ardite, "arditeBlazePickaxe");
            manyullynBlazePickaxe = new MetalToolPickaxe(PropsHelperInfiMetals.blazePickaxeID+2, 
                    InfiMaterialEnum.Blaze, InfiMaterialEnum.Manyullyn, "manyullynBlazePickaxe");
            uraniumBlazePickaxe = new MetalToolPickaxe(PropsHelperInfiMetals.blazePickaxeID+3, 
                    InfiMaterialEnum.Blaze, InfiMaterialEnum.Uranium, "uraniumBlazePickaxe");
        }
    }
    
    private static void addNames()
    {
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
        if(PropsHelperInfiMetals.enableStoneTools)
        {
            ModLoader.addRecipe(new ItemStack(copperStonePickaxe), new Object[] 
                    { "###", " | ", " | ", '#', Block.stone, '|', mod_InfiMetals.copperRod });
        }
        if(PropsHelperInfiMetals.enableIronTools)
        {
            ModLoader.addRecipe(new ItemStack(copperIronPickaxe), new Object[] 
                    { "###", " | ", " | ", '#', Item.ingotIron, '|', mod_InfiMetals.copperRod });
            ModLoader.addRecipe(new ItemStack(bronzeIronPickaxe), new Object[] 
                    { "###", " | ", " | ", '#', Item.ingotIron, '|', mod_InfiMetals.bronzeRod });
            ModLoader.addRecipe(new ItemStack(workedIronPickaxe), new Object[] 
                    { "###", " | ", " | ", '#', Item.ingotIron, '|', mod_InfiMetals.workedIronRod });
        }
        if(PropsHelperInfiMetals.enableDiamondTools)
        {
            ModLoader.addRecipe(new ItemStack(copperDiamondPickaxe), new Object[] 
                    { "###", " | ", " | ", '#', Item.diamond, '|', mod_InfiMetals.copperRod });
            ModLoader.addRecipe(new ItemStack(bronzeDiamondPickaxe), new Object[] 
                    { "###", " | ", " | ", '#', Item.diamond, '|', mod_InfiMetals.bronzeRod });
            ModLoader.addRecipe(new ItemStack(workedDiamondPickaxe), new Object[] 
                    { "###", " | ", " | ", '#', Item.diamond, '|', mod_InfiMetals.workedIronRod });
            ModLoader.addRecipe(new ItemStack(steelDiamondPickaxe), new Object[] 
                    { "###", " | ", " | ", '#', Item.diamond, '|', mod_InfiMetals.steelRod });
            ModLoader.addRecipe(new ItemStack(cobaltDiamondPickaxe), new Object[] 
                    { "###", " | ", " | ", '#', Item.diamond, '|', mod_InfiMetals.cobaltRod });
            ModLoader.addRecipe(new ItemStack(arditeDiamondPickaxe), new Object[] 
                    { "###", " | ", " | ", '#', Item.diamond, '|', mod_InfiMetals.arditeRod });
            ModLoader.addRecipe(new ItemStack(manyullynDiamondPickaxe), new Object[] 
                    { "###", " | ", " | ", '#', Item.diamond, '|', mod_InfiMetals.manyullynRod });
            ModLoader.addRecipe(new ItemStack(uraniumDiamondPickaxe), new Object[] 
                    { "###", " | ", " | ", '#', Item.diamond, '|', mod_InfiMetals.uraniumRod });
        }
        if(PropsHelperInfiMetals.enableMossyTools)
        {
            ModLoader.addRecipe(new ItemStack(cobaltMossyPickaxe), new Object[] 
                    { "###", " | ", " | ", '#', mod_InfiTools.mossBallCrafted, '|', mod_InfiMetals.cobaltRod });
            ModLoader.addRecipe(new ItemStack(arditeMossyPickaxe), new Object[] 
                    { "###", " | ", " | ", '#', mod_InfiTools.mossBallCrafted, '|', mod_InfiMetals.arditeRod });
            ModLoader.addRecipe(new ItemStack(manyullynMossyPickaxe), new Object[] 
                    { "###", " | ", " | ", '#', mod_InfiTools.mossBallCrafted, '|', mod_InfiMetals.manyullynRod });
        }
        if(PropsHelperInfiMetals.enableNetherrackTools)
        {
            ModLoader.addRecipe(new ItemStack(copperNetherrackPickaxe), new Object[] 
                    { "###", " | ", " | ", '#', Block.netherrack, '|', mod_InfiMetals.copperRod });
        }
        if(PropsHelperInfiMetals.enableFlintTools)
        {
            ModLoader.addRecipe(new ItemStack(copperFlintPickaxe), new Object[] 
                    { "###", " | ", " | ", '#', Block.netherrack, '|', mod_InfiMetals.copperRod });
            ModLoader.addRecipe(new ItemStack(bronzeFlintPickaxe), new Object[] 
                    { "###", " | ", " | ", '#', Block.netherrack, '|', mod_InfiMetals.bronzeRod });
        }
    }
    
    public static void addCopperTools(ItemStack stack)
    {
        ModLoader.addRecipe(new ItemStack(stoneCopperPickaxe), new Object[] 
                { "###", " | ", " | ", '#', stack, '|', mod_InfiTools.stoneRod });
        ModLoader.addRecipe(new ItemStack(boneCopperPickaxe), new Object[] 
                { "###", " | ", " | ", '#', stack, '|', Item.bone });
        ModLoader.addRecipe(new ItemStack(boneCopperPickaxe), new Object[] 
                { "###", " | ", " | ", '#', stack, '|', mod_InfiTools.boneRod });
        ModLoader.addRecipe(new ItemStack(netherrackCopperPickaxe), new Object[] 
                { "###", " | ", " | ", '#', stack, '|', mod_InfiTools.netherrackRod });
        ModLoader.addRecipe(new ItemStack(slimeCopperPickaxe), new Object[] 
                { "###", " | ", " | ", '#', stack, '|', mod_InfiTools.slimeRod });
        ModLoader.addRecipe(new ItemStack(cactusCopperPickaxe), new Object[] 
                { "###", " | ", " | ", '#', stack, '|', mod_InfiTools.cactusRod });
        ModLoader.addRecipe(new ItemStack(flintCopperPickaxe), new Object[] 
                { "###", " | ", " | ", '#', stack, '|', mod_InfiTools.flintRod });
        ModLoader.addRecipe(new ItemStack(copperCopperPickaxe), new Object[] 
                { "###", " | ", " | ", '#', stack, '|', mod_InfiMetals.copperRod });
    }
    
    public static void addBronzeTools(ItemStack stack)
    {
        ModLoader.addRecipe(new ItemStack(stoneBronzePickaxe), new Object[] 
                { "###", " | ", " | ", '#', stack, '|', mod_InfiTools.stoneRod });
        ModLoader.addRecipe(new ItemStack(boneBronzePickaxe), new Object[] 
                { "###", " | ", " | ", '#', stack, '|', Item.bone });
        ModLoader.addRecipe(new ItemStack(boneBronzePickaxe), new Object[] 
                { "###", " | ", " | ", '#', stack, '|', mod_InfiTools.boneRod });
        ModLoader.addRecipe(new ItemStack(netherrackBronzePickaxe), new Object[] 
                { "###", " | ", " | ", '#', stack, '|', mod_InfiTools.netherrackRod });
        ModLoader.addRecipe(new ItemStack(slimeBronzePickaxe), new Object[] 
                { "###", " | ", " | ", '#', stack, '|', mod_InfiTools.slimeRod });
        ModLoader.addRecipe(new ItemStack(cactusBronzePickaxe), new Object[] 
                { "###", " | ", " | ", '#', stack, '|', mod_InfiTools.cactusRod });
        ModLoader.addRecipe(new ItemStack(flintBronzePickaxe), new Object[] 
                { "###", " | ", " | ", '#', stack, '|', mod_InfiTools.flintRod });
        ModLoader.addRecipe(new ItemStack(copperBronzePickaxe), new Object[] 
                { "###", " | ", " | ", '#', stack, '|', mod_InfiMetals.copperRod });
        ModLoader.addRecipe(new ItemStack(bronzeBronzePickaxe), new Object[] 
                { "###", " | ", " | ", '#', stack, '|', mod_InfiMetals.bronzeRod });
    }
    
    public static void addWorkedIronTools(ItemStack stack)
    {
        ModLoader.addRecipe(new ItemStack(stoneWorkedIronPickaxe), new Object[] 
                { "###", " | ", " | ", '#', stack, '|', mod_InfiTools.stoneRod });
        ModLoader.addRecipe(new ItemStack(ironWorkedIronPickaxe), new Object[] 
                { "###", " | ", " | ", '#', stack, '|', mod_InfiTools.ironRod });
        ModLoader.addRecipe(new ItemStack(diamondWorkedIronPickaxe), new Object[] 
                { "###", " | ", " | ", '#', stack, '|', mod_InfiTools.diamondRod });
        ModLoader.addRecipe(new ItemStack(goldWorkedIronPickaxe), new Object[] 
                { "###", " | ", " | ", '#', stack, '|', mod_InfiTools.goldRod });
        ModLoader.addRecipe(new ItemStack(redstoneWorkedIronPickaxe), new Object[] 
                { "###", " | ", " | ", '#', stack, '|', mod_InfiTools.redstoneRod });
        ModLoader.addRecipe(new ItemStack(obsidianWorkedIronPickaxe), new Object[] 
                { "###", " | ", " | ", '#', stack, '|', mod_InfiTools.obsidianRod });
        ModLoader.addRecipe(new ItemStack(boneWorkedIronPickaxe), new Object[] 
                { "###", " | ", " | ", '#', stack, '|', Item.bone });
        ModLoader.addRecipe(new ItemStack(boneWorkedIronPickaxe), new Object[] 
                { "###", " | ", " | ", '#', stack, '|', mod_InfiTools.boneRod });
        ModLoader.addRecipe(new ItemStack(netherrackWorkedIronPickaxe), new Object[] 
                { "###", " | ", " | ", '#', stack, '|', mod_InfiTools.netherrackRod });
        ModLoader.addRecipe(new ItemStack(glowstoneWorkedIronPickaxe), new Object[] 
                { "###", " | ", " | ", '#', stack, '|', mod_InfiTools.glowstoneRod });
        ModLoader.addRecipe(new ItemStack(iceWorkedIronPickaxe), new Object[] 
                { "###", " | ", " | ", '#', stack, '|', mod_InfiTools.iceRod });
        ModLoader.addRecipe(new ItemStack(slimeWorkedIronPickaxe), new Object[] 
                { "###", " | ", " | ", '#', stack, '|', mod_InfiTools.slimeRod });
        ModLoader.addRecipe(new ItemStack(cactusWorkedIronPickaxe), new Object[] 
                { "###", " | ", " | ", '#', stack, '|', mod_InfiTools.cactusRod });
        ModLoader.addRecipe(new ItemStack(blazeWorkedIronPickaxe), new Object[] 
                { "###", " | ", " | ", '#', stack, '|', Item.blazeRod });
        ModLoader.addRecipe(new ItemStack(copperWorkedIronPickaxe), new Object[] 
                { "###", " | ", " | ", '#', stack, '|', mod_InfiMetals.copperRod });
        ModLoader.addRecipe(new ItemStack(bronzeWorkedIronPickaxe), new Object[] 
                { "###", " | ", " | ", '#', stack, '|', mod_InfiMetals.bronzeRod });
        ModLoader.addRecipe(new ItemStack(workedWorkedIronPickaxe), new Object[] 
                { "###", " | ", " | ", '#', stack, '|', mod_InfiMetals.workedIronRod });
        ModLoader.addRecipe(new ItemStack(steelWorkedIronPickaxe), new Object[] 
                { "###", " | ", " | ", '#', stack, '|', mod_InfiMetals.steelRod });
        ModLoader.addRecipe(new ItemStack(cobaltWorkedIronPickaxe), new Object[] 
                { "###", " | ", " | ", '#', stack, '|', mod_InfiMetals.cobaltRod });
        ModLoader.addRecipe(new ItemStack(arditeWorkedIronPickaxe), new Object[] 
                { "###", " | ", " | ", '#', stack, '|', mod_InfiMetals.arditeRod });
        ModLoader.addRecipe(new ItemStack(uraniumWorkedIronPickaxe), new Object[] 
                { "###", " | ", " | ", '#', stack, '|', mod_InfiMetals.uraniumRod });
    }
    
    public static void addSteelTools(ItemStack stack)
    {
        ModLoader.addRecipe(new ItemStack(stoneSteelPickaxe), new Object[] 
                { "###", " | ", " | ", '#', stack, '|', mod_InfiTools.stoneRod });
        ModLoader.addRecipe(new ItemStack(ironSteelPickaxe), new Object[] 
                { "###", " | ", " | ", '#', stack, '|', mod_InfiTools.ironRod });
        ModLoader.addRecipe(new ItemStack(diamondSteelPickaxe), new Object[] 
                { "###", " | ", " | ", '#', stack, '|', mod_InfiTools.diamondRod });
        ModLoader.addRecipe(new ItemStack(goldSteelPickaxe), new Object[] 
                { "###", " | ", " | ", '#', stack, '|', mod_InfiTools.goldRod });
        ModLoader.addRecipe(new ItemStack(redstoneSteelPickaxe), new Object[] 
                { "###", " | ", " | ", '#', stack, '|', mod_InfiTools.redstoneRod });
        ModLoader.addRecipe(new ItemStack(obsidianSteelPickaxe), new Object[] 
                { "###", " | ", " | ", '#', stack, '|', mod_InfiTools.obsidianRod });
        ModLoader.addRecipe(new ItemStack(boneSteelPickaxe), new Object[] 
                { "###", " | ", " | ", '#', stack, '|', Item.bone });
        ModLoader.addRecipe(new ItemStack(boneSteelPickaxe), new Object[] 
                { "###", " | ", " | ", '#', stack, '|', mod_InfiTools.boneRod });
        ModLoader.addRecipe(new ItemStack(netherrackSteelPickaxe), new Object[] 
                { "###", " | ", " | ", '#', stack, '|', mod_InfiTools.netherrackRod });
        ModLoader.addRecipe(new ItemStack(glowstoneSteelPickaxe), new Object[] 
                { "###", " | ", " | ", '#', stack, '|', mod_InfiTools.glowstoneRod });
        ModLoader.addRecipe(new ItemStack(iceSteelPickaxe), new Object[] 
                { "###", " | ", " | ", '#', stack, '|', mod_InfiTools.iceRod });
        ModLoader.addRecipe(new ItemStack(slimeSteelPickaxe), new Object[] 
                { "###", " | ", " | ", '#', stack, '|', mod_InfiTools.slimeRod });
        ModLoader.addRecipe(new ItemStack(cactusSteelPickaxe), new Object[] 
                { "###", " | ", " | ", '#', stack, '|', mod_InfiTools.cactusRod });
        ModLoader.addRecipe(new ItemStack(blazeSteelPickaxe), new Object[] 
                { "###", " | ", " | ", '#', stack, '|', Item.blazeRod });
        ModLoader.addRecipe(new ItemStack(copperSteelPickaxe), new Object[] 
                { "###", " | ", " | ", '#', stack, '|', mod_InfiMetals.copperRod });
        ModLoader.addRecipe(new ItemStack(bronzeSteelPickaxe), new Object[] 
                { "###", " | ", " | ", '#', stack, '|', mod_InfiMetals.bronzeRod });
        ModLoader.addRecipe(new ItemStack(workedSteelPickaxe), new Object[] 
                { "###", " | ", " | ", '#', stack, '|', mod_InfiMetals.workedIronRod });
        ModLoader.addRecipe(new ItemStack(steelSteelPickaxe), new Object[] 
                { "###", " | ", " | ", '#', stack, '|', mod_InfiMetals.steelRod });
        ModLoader.addRecipe(new ItemStack(cobaltSteelPickaxe), new Object[] 
                { "###", " | ", " | ", '#', stack, '|', mod_InfiMetals.cobaltRod });
        ModLoader.addRecipe(new ItemStack(arditeSteelPickaxe), new Object[] 
                { "###", " | ", " | ", '#', stack, '|', mod_InfiMetals.arditeRod });
        ModLoader.addRecipe(new ItemStack(uraniumSteelPickaxe), new Object[] 
                { "###", " | ", " | ", '#', stack, '|', mod_InfiMetals.uraniumRod });
    }
    
    public static void addCobaltTools(ItemStack stack)
    {
        ModLoader.addRecipe(new ItemStack(stoneCobaltPickaxe), new Object[] 
                { "###", " | ", " | ", '#', stack, '|', mod_InfiTools.stoneRod });
        ModLoader.addRecipe(new ItemStack(ironCobaltPickaxe), new Object[] 
                { "###", " | ", " | ", '#', stack, '|', mod_InfiTools.ironRod });
        ModLoader.addRecipe(new ItemStack(diamondCobaltPickaxe), new Object[] 
                { "###", " | ", " | ", '#', stack, '|', mod_InfiTools.diamondRod });
        ModLoader.addRecipe(new ItemStack(redstoneCobaltPickaxe), new Object[] 
                { "###", " | ", " | ", '#', stack, '|', mod_InfiTools.redstoneRod });
        ModLoader.addRecipe(new ItemStack(obsidianCobaltPickaxe), new Object[] 
                { "###", " | ", " | ", '#', stack, '|', mod_InfiTools.obsidianRod });
        ModLoader.addRecipe(new ItemStack(boneCobaltPickaxe), new Object[] 
                { "###", " | ", " | ", '#', stack, '|', Item.bone });
        ModLoader.addRecipe(new ItemStack(boneCobaltPickaxe), new Object[] 
                { "###", " | ", " | ", '#', stack, '|', mod_InfiTools.boneRod });
        ModLoader.addRecipe(new ItemStack(slimeCobaltPickaxe), new Object[] 
                { "###", " | ", " | ", '#', stack, '|', mod_InfiTools.slimeRod });
        ModLoader.addRecipe(new ItemStack(cactusCobaltPickaxe), new Object[] 
                { "###", " | ", " | ", '#', stack, '|', mod_InfiTools.cactusRod });
        ModLoader.addRecipe(new ItemStack(blazeCobaltPickaxe), new Object[] 
                { "###", " | ", " | ", '#', stack, '|', Item.blazeRod });
        ModLoader.addRecipe(new ItemStack(copperCobaltPickaxe), new Object[] 
                { "###", " | ", " | ", '#', stack, '|', mod_InfiMetals.copperRod });
        ModLoader.addRecipe(new ItemStack(bronzeCobaltPickaxe), new Object[] 
                { "###", " | ", " | ", '#', stack, '|', mod_InfiMetals.bronzeRod });
        ModLoader.addRecipe(new ItemStack(workedCobaltPickaxe), new Object[] 
                { "###", " | ", " | ", '#', stack, '|', mod_InfiMetals.workedIronRod });
        ModLoader.addRecipe(new ItemStack(steelCobaltPickaxe), new Object[] 
                { "###", " | ", " | ", '#', stack, '|', mod_InfiMetals.steelRod });
        ModLoader.addRecipe(new ItemStack(cobaltCobaltPickaxe), new Object[] 
                { "###", " | ", " | ", '#', stack, '|', mod_InfiMetals.cobaltRod });
        ModLoader.addRecipe(new ItemStack(arditeCobaltPickaxe), new Object[] 
                { "###", " | ", " | ", '#', stack, '|', mod_InfiMetals.arditeRod });
        ModLoader.addRecipe(new ItemStack(manyullynCobaltPickaxe), new Object[] 
                { "###", " | ", " | ", '#', stack, '|', mod_InfiMetals.manyullynRod });
        ModLoader.addRecipe(new ItemStack(uraniumCobaltPickaxe), new Object[] 
                { "###", " | ", " | ", '#', stack, '|', mod_InfiMetals.uraniumRod });
    }
    
    public static void addArditeTools(ItemStack stack)
    {
        ModLoader.addRecipe(new ItemStack(stoneArditePickaxe), new Object[] 
                { "###", " | ", " | ", '#', stack, '|', mod_InfiTools.stoneRod });
        ModLoader.addRecipe(new ItemStack(ironArditePickaxe), new Object[] 
                { "###", " | ", " | ", '#', stack, '|', mod_InfiTools.ironRod });
        ModLoader.addRecipe(new ItemStack(diamondArditePickaxe), new Object[] 
                { "###", " | ", " | ", '#', stack, '|', mod_InfiTools.diamondRod });
        ModLoader.addRecipe(new ItemStack(redstoneArditePickaxe), new Object[] 
                { "###", " | ", " | ", '#', stack, '|', mod_InfiTools.redstoneRod });
        ModLoader.addRecipe(new ItemStack(obsidianArditePickaxe), new Object[] 
                { "###", " | ", " | ", '#', stack, '|', mod_InfiTools.obsidianRod });
        ModLoader.addRecipe(new ItemStack(boneArditePickaxe), new Object[] 
                { "###", " | ", " | ", '#', stack, '|', Item.bone });
        ModLoader.addRecipe(new ItemStack(boneArditePickaxe), new Object[] 
                { "###", " | ", " | ", '#', stack, '|', mod_InfiTools.boneRod });
        ModLoader.addRecipe(new ItemStack(slimeArditePickaxe), new Object[] 
                { "###", " | ", " | ", '#', stack, '|', mod_InfiTools.slimeRod });
        ModLoader.addRecipe(new ItemStack(cactusArditePickaxe), new Object[] 
                { "###", " | ", " | ", '#', stack, '|', mod_InfiTools.cactusRod });
        ModLoader.addRecipe(new ItemStack(blazeArditePickaxe), new Object[] 
                { "###", " | ", " | ", '#', stack, '|', Item.blazeRod });
        ModLoader.addRecipe(new ItemStack(copperArditePickaxe), new Object[] 
                { "###", " | ", " | ", '#', stack, '|', mod_InfiMetals.copperRod });
        ModLoader.addRecipe(new ItemStack(bronzeArditePickaxe), new Object[] 
                { "###", " | ", " | ", '#', stack, '|', mod_InfiMetals.bronzeRod });
        ModLoader.addRecipe(new ItemStack(workedArditePickaxe), new Object[] 
                { "###", " | ", " | ", '#', stack, '|', mod_InfiMetals.workedIronRod });
        ModLoader.addRecipe(new ItemStack(steelArditePickaxe), new Object[] 
                { "###", " | ", " | ", '#', stack, '|', mod_InfiMetals.steelRod });
        ModLoader.addRecipe(new ItemStack(cobaltArditePickaxe), new Object[] 
                { "###", " | ", " | ", '#', stack, '|', mod_InfiMetals.cobaltRod });
        ModLoader.addRecipe(new ItemStack(arditeArditePickaxe), new Object[] 
                { "###", " | ", " | ", '#', stack, '|', mod_InfiMetals.arditeRod });
        ModLoader.addRecipe(new ItemStack(manyullynArditePickaxe), new Object[] 
                { "###", " | ", " | ", '#', stack, '|', mod_InfiMetals.manyullynRod });
        ModLoader.addRecipe(new ItemStack(uraniumArditePickaxe), new Object[] 
                { "###", " | ", " | ", '#', stack, '|', mod_InfiMetals.uraniumRod });
    }
    
    public static void addManyullynTools(ItemStack stack)
    {
        ModLoader.addRecipe(new ItemStack(stoneManyullynPickaxe), new Object[] 
                { "###", " | ", " | ", '#', stack, '|', mod_InfiTools.stoneRod });
        ModLoader.addRecipe(new ItemStack(ironManyullynPickaxe), new Object[] 
                { "###", " | ", " | ", '#', stack, '|', mod_InfiTools.ironRod });
        ModLoader.addRecipe(new ItemStack(diamondManyullynPickaxe), new Object[] 
                { "###", " | ", " | ", '#', stack, '|', mod_InfiTools.diamondRod });
        ModLoader.addRecipe(new ItemStack(redstoneManyullynPickaxe), new Object[] 
                { "###", " | ", " | ", '#', stack, '|', mod_InfiTools.redstoneRod });
        ModLoader.addRecipe(new ItemStack(obsidianManyullynPickaxe), new Object[] 
                { "###", " | ", " | ", '#', stack, '|', mod_InfiTools.obsidianRod });
        ModLoader.addRecipe(new ItemStack(boneManyullynPickaxe), new Object[] 
                { "###", " | ", " | ", '#', stack, '|', Item.bone });
        ModLoader.addRecipe(new ItemStack(boneManyullynPickaxe), new Object[] 
                { "###", " | ", " | ", '#', stack, '|', mod_InfiTools.boneRod });
        ModLoader.addRecipe(new ItemStack(slimeManyullynPickaxe), new Object[] 
                { "###", " | ", " | ", '#', stack, '|', mod_InfiTools.slimeRod });
        ModLoader.addRecipe(new ItemStack(cactusManyullynPickaxe), new Object[] 
                { "###", " | ", " | ", '#', stack, '|', mod_InfiTools.cactusRod });
        ModLoader.addRecipe(new ItemStack(blazeManyullynPickaxe), new Object[] 
                { "###", " | ", " | ", '#', stack, '|', Item.blazeRod });
        ModLoader.addRecipe(new ItemStack(copperManyullynPickaxe), new Object[] 
                { "###", " | ", " | ", '#', stack, '|', mod_InfiMetals.copperRod });
        ModLoader.addRecipe(new ItemStack(bronzeManyullynPickaxe), new Object[] 
                { "###", " | ", " | ", '#', stack, '|', mod_InfiMetals.bronzeRod });
        ModLoader.addRecipe(new ItemStack(workedManyullynPickaxe), new Object[] 
                { "###", " | ", " | ", '#', stack, '|', mod_InfiMetals.workedIronRod });
        ModLoader.addRecipe(new ItemStack(steelManyullynPickaxe), new Object[] 
                { "###", " | ", " | ", '#', stack, '|', mod_InfiMetals.steelRod });
        ModLoader.addRecipe(new ItemStack(cobaltManyullynPickaxe), new Object[] 
                { "###", " | ", " | ", '#', stack, '|', mod_InfiMetals.cobaltRod });
        ModLoader.addRecipe(new ItemStack(arditeManyullynPickaxe), new Object[] 
                { "###", " | ", " | ", '#', stack, '|', mod_InfiMetals.arditeRod });
        ModLoader.addRecipe(new ItemStack(manyullynManyullynPickaxe), new Object[] 
                { "###", " | ", " | ", '#', stack, '|', mod_InfiMetals.manyullynRod });
        ModLoader.addRecipe(new ItemStack(uraniumManyullynPickaxe), new Object[] 
                { "###", " | ", " | ", '#', stack, '|', mod_InfiMetals.uraniumRod });
    }
    
    public static void addUraniumTools(ItemStack stack)
    {
        ModLoader.addRecipe(new ItemStack(diamondUraniumPickaxe), new Object[] 
                { "###", " | ", " | ", '#', stack, '|', mod_InfiTools.diamondRod });
        ModLoader.addRecipe(new ItemStack(redstoneUraniumPickaxe), new Object[] 
                { "###", " | ", " | ", '#', stack, '|', mod_InfiTools.redstoneRod });
        ModLoader.addRecipe(new ItemStack(boneUraniumPickaxe), new Object[] 
                { "###", " | ", " | ", '#', stack, '|', Item.bone });
        ModLoader.addRecipe(new ItemStack(boneUraniumPickaxe), new Object[] 
                { "###", " | ", " | ", '#', stack, '|', mod_InfiTools.boneRod });
        ModLoader.addRecipe(new ItemStack(netherrackUraniumPickaxe), new Object[] 
                { "###", " | ", " | ", '#', stack, '|', mod_InfiTools.netherrackRod });
        ModLoader.addRecipe(new ItemStack(glowstoneUraniumPickaxe), new Object[] 
                { "###", " | ", " | ", '#', stack, '|', mod_InfiTools.glowstoneRod });
        ModLoader.addRecipe(new ItemStack(lavaUraniumPickaxe), new Object[] 
                { "###", " | ", " | ", '#', stack, '|', mod_InfiTools.lavaRod });
        ModLoader.addRecipe(new ItemStack(blazeUraniumPickaxe), new Object[] 
                { "###", " | ", " | ", '#', stack, '|', Item.blazeRod });
        ModLoader.addRecipe(new ItemStack(cobaltUraniumPickaxe), new Object[] 
                { "###", " | ", " | ", '#', stack, '|', mod_InfiMetals.cobaltRod });
        ModLoader.addRecipe(new ItemStack(arditeUraniumPickaxe), new Object[] 
                { "###", " | ", " | ", '#', stack, '|', mod_InfiMetals.arditeRod });
        ModLoader.addRecipe(new ItemStack(uraniumUraniumPickaxe), new Object[] 
                { "###", " | ", " | ", '#', stack, '|', mod_InfiMetals.uraniumRod });
    }
    
    public static void addStoneTools(ItemStack stack)
    {
        ModLoader.addRecipe(new ItemStack(copperStonePickaxe), new Object[] 
                { "###", " | ", " | ", '#', stack, '|', mod_InfiMetals.copperRod });
    }
    
    public static void addRedstoneTools(ItemStack stack)
    {
        if(PropsHelperInfiMetals.enableRedstoneTools)
        {
            ModLoader.addRecipe(new ItemStack(copperRedstonePickaxe), new Object[] 
                    { "###", " | ", " | ", '#', stack, '|', mod_InfiMetals.copperRod });
            ModLoader.addRecipe(new ItemStack(bronzeRedstonePickaxe), new Object[] 
                    { "###", " | ", " | ", '#', stack, '|', mod_InfiMetals.bronzeRod });
            ModLoader.addRecipe(new ItemStack(workedRedstonePickaxe), new Object[] 
                    { "###", " | ", " | ", '#', stack, '|', mod_InfiMetals.workedIronRod });
        }
    }
    
    public static void addGlowstoneTools(ItemStack stack)
    {
        if(PropsHelperInfiMetals.enableGlowstoneTools)
        {
            ModLoader.addRecipe(new ItemStack(copperGlowstonePickaxe), new Object[] 
                    { "###", " | ", " | ", '#', stack, '|', mod_InfiMetals.copperRod });
            ModLoader.addRecipe(new ItemStack(bronzeGlowstonePickaxe), new Object[] 
                    { "###", " | ", " | ", '#', stack, '|', mod_InfiMetals.bronzeRod });
            ModLoader.addRecipe(new ItemStack(workedGlowstonePickaxe), new Object[] 
                    { "###", " | ", " | ", '#', stack, '|', mod_InfiMetals.workedIronRod });
            ModLoader.addRecipe(new ItemStack(steelGlowstonePickaxe), new Object[] 
                    { "###", " | ", " | ", '#', stack, '|', mod_InfiMetals.steelRod });
        }
    }
    
    public static void addLavaTools(ItemStack stack)
    {
        ModLoader.addRecipe(new ItemStack(cobaltLavaPickaxe), new Object[] 
                { "###", " | ", " | ", '#', stack, '|', mod_InfiMetals.cobaltRod });
        ModLoader.addRecipe(new ItemStack(arditeLavaPickaxe), new Object[] 
                { "###", " | ", " | ", '#', stack, '|', mod_InfiMetals.arditeRod });
        ModLoader.addRecipe(new ItemStack(manyullynLavaPickaxe), new Object[] 
                { "###", " | ", " | ", '#', stack, '|', mod_InfiMetals.manyullynRod });
        ModLoader.addRecipe(new ItemStack(uraniumLavaPickaxe), new Object[] 
                { "###", " | ", " | ", '#', stack, '|', mod_InfiMetals.uraniumRod });
    }
    
    public static void addSlimeTools(ItemStack stack)
    {
        ModLoader.addRecipe(new ItemStack(copperSlimePickaxe), new Object[] 
                { "###", " | ", " | ", '#', stack, '|', mod_InfiMetals.copperRod });
        ModLoader.addRecipe(new ItemStack(bronzeSlimePickaxe), new Object[] 
                { "###", " | ", " | ", '#', stack, '|', mod_InfiMetals.bronzeRod });
        ModLoader.addRecipe(new ItemStack(workedSlimePickaxe), new Object[] 
                { "###", " | ", " | ", '#', stack, '|', mod_InfiMetals.workedIronRod });
        ModLoader.addRecipe(new ItemStack(steelSlimePickaxe), new Object[] 
                { "###", " | ", " | ", '#', stack, '|', mod_InfiMetals.steelRod });
        ModLoader.addRecipe(new ItemStack(cobaltSlimePickaxe), new Object[] 
                { "###", " | ", " | ", '#', stack, '|', mod_InfiMetals.cobaltRod });
        ModLoader.addRecipe(new ItemStack(arditeSlimePickaxe), new Object[] 
                { "###", " | ", " | ", '#', stack, '|', mod_InfiMetals.arditeRod });
        ModLoader.addRecipe(new ItemStack(manyullynSlimePickaxe), new Object[] 
                { "###", " | ", " | ", '#', stack, '|', mod_InfiMetals.manyullynRod });
        ModLoader.addRecipe(new ItemStack(uraniumSlimePickaxe), new Object[] 
                { "###", " | ", " | ", '#', stack, '|', mod_InfiMetals.uraniumRod });
    }
    
    public static void addBlazeTools(ItemStack stack)
    {
        ModLoader.addRecipe(new ItemStack(cobaltBlazePickaxe), new Object[] 
                { "###", " | ", " | ", '#', stack, '|', mod_InfiMetals.cobaltRod });
        ModLoader.addRecipe(new ItemStack(arditeBlazePickaxe), new Object[] 
                { "###", " | ", " | ", '#', stack, '|', mod_InfiMetals.arditeRod });
        ModLoader.addRecipe(new ItemStack(manyullynBlazePickaxe), new Object[] 
                { "###", " | ", " | ", '#', stack, '|', mod_InfiMetals.manyullynRod });
        ModLoader.addRecipe(new ItemStack(uraniumBlazePickaxe), new Object[] 
                { "###", " | ", " | ", '#', stack, '|', mod_InfiMetals.uraniumRod });
    }
    
    public static Item stoneCopperPickaxe;
    public static Item boneCopperPickaxe;
    public static Item netherrackCopperPickaxe;
    public static Item slimeCopperPickaxe;
    public static Item cactusCopperPickaxe;
    public static Item flintCopperPickaxe;
    public static Item copperCopperPickaxe;
    
    public static Item stoneBronzePickaxe;
    public static Item boneBronzePickaxe;
    public static Item netherrackBronzePickaxe;
    public static Item slimeBronzePickaxe;
    public static Item cactusBronzePickaxe;
    public static Item flintBronzePickaxe;
    public static Item copperBronzePickaxe;
    public static Item bronzeBronzePickaxe;
    
    public static Item stoneWorkedIronPickaxe;
    public static Item ironWorkedIronPickaxe;
    public static Item diamondWorkedIronPickaxe;
    public static Item goldWorkedIronPickaxe;
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
    public static Item cobaltWorkedIronPickaxe;
    public static Item arditeWorkedIronPickaxe;
    public static Item uraniumWorkedIronPickaxe;
    
    public static Item stoneSteelPickaxe;
    public static Item ironSteelPickaxe;
    public static Item diamondSteelPickaxe;
    public static Item goldSteelPickaxe;
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
    
    public static Item copperStonePickaxe;
    
    public static Item copperIronPickaxe;
    public static Item bronzeIronPickaxe;
    public static Item workedIronPickaxe;
    
    public static Item copperDiamondPickaxe;
    public static Item bronzeDiamondPickaxe;
    public static Item workedDiamondPickaxe;
    public static Item steelDiamondPickaxe;
    public static Item cobaltDiamondPickaxe;
    public static Item arditeDiamondPickaxe;
    public static Item manyullynDiamondPickaxe;
    public static Item uraniumDiamondPickaxe;
    
    public static Item copperRedstonePickaxe;
    public static Item bronzeRedstonePickaxe;
    public static Item workedRedstonePickaxe;
    
    public static Item cobaltMossyPickaxe;
    public static Item arditeMossyPickaxe;
    public static Item manyullynMossyPickaxe;
    
    public static Item copperNetherrackPickaxe;
    
    public static Item copperGlowstonePickaxe;
    public static Item bronzeGlowstonePickaxe;
    public static Item workedGlowstonePickaxe;
    public static Item steelGlowstonePickaxe;
    
    public static Item cobaltLavaPickaxe;
    public static Item arditeLavaPickaxe;
    public static Item manyullynLavaPickaxe;
    public static Item uraniumLavaPickaxe;
    
    public static Item copperSlimePickaxe;
    public static Item bronzeSlimePickaxe;
    public static Item workedSlimePickaxe;
    public static Item steelSlimePickaxe;
    public static Item cobaltSlimePickaxe;
    public static Item arditeSlimePickaxe;
    public static Item manyullynSlimePickaxe;
    public static Item uraniumSlimePickaxe;
    
    public static Item copperFlintPickaxe;
    public static Item bronzeFlintPickaxe;
    
    public static Item cobaltBlazePickaxe;
    public static Item arditeBlazePickaxe;
    public static Item manyullynBlazePickaxe;
    public static Item uraniumBlazePickaxe;
}
