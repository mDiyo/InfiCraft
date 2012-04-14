package net.minecraft.src.metals;

import net.minecraft.src.InfiMaterialEnum;
import net.minecraft.src.Block;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;
import net.minecraft.src.ModLoader;
import net.minecraft.src.mod_InfiMetals;
import net.minecraft.src.mod_InfiTools;

public class MetalSwords 
{
    public static MetalSwords instance = new MetalSwords();
    
    public static MetalSwords getInstance()
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
            stoneCopperSword = new MetalToolSword(PropsHelperInfiMetals.copperSwordID+0, 
                    InfiMaterialEnum.Copper, InfiMaterialEnum.Stone, "stoneCopperSword");
            boneCopperSword = new MetalToolSword(PropsHelperInfiMetals.copperSwordID+1, 
                    InfiMaterialEnum.Copper, InfiMaterialEnum.Bone, "boneCopperSword");
            netherrackCopperSword = new MetalToolSword(PropsHelperInfiMetals.copperSwordID+2, 
                    InfiMaterialEnum.Copper, InfiMaterialEnum.Netherrack, "netherrackCopperSword");
            slimeCopperSword = new MetalToolSword(PropsHelperInfiMetals.copperSwordID+3, 
                    InfiMaterialEnum.Copper, InfiMaterialEnum.Slime, "slimeCopperSword");
            cactusCopperSword = new MetalToolSword(PropsHelperInfiMetals.copperSwordID+4, 
                    InfiMaterialEnum.Copper, InfiMaterialEnum.Cactus, "cactusCopperSword");
            flintCopperSword = new MetalToolSword(PropsHelperInfiMetals.copperSwordID+5, 
                    InfiMaterialEnum.Copper, InfiMaterialEnum.Flint, "flintCopperSword");
            copperCopperSword = new MetalToolSword(PropsHelperInfiMetals.copperSwordID+6, 
                    InfiMaterialEnum.Copper, InfiMaterialEnum.Copper, "copperCopperSword");
        }
        
        if(PropsHelperInfiMetals.enableBronzeTools)
        {
            stoneBronzeSword = new MetalToolSword(PropsHelperInfiMetals.bronzeSwordID+0, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Stone, "stoneBronzeSword");
            boneBronzeSword = new MetalToolSword(PropsHelperInfiMetals.bronzeSwordID+1, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Bone, "boneBronzeSword");
            netherrackBronzeSword = new MetalToolSword(PropsHelperInfiMetals.bronzeSwordID+2, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Netherrack, "netherrackBronzeSword");
            slimeBronzeSword = new MetalToolSword(PropsHelperInfiMetals.bronzeSwordID+3, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Slime, "slimeBronzeSword");
            cactusBronzeSword = new MetalToolSword(PropsHelperInfiMetals.bronzeSwordID+4, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Cactus, "cactusBronzeSword");
            flintBronzeSword = new MetalToolSword(PropsHelperInfiMetals.bronzeSwordID+5, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Flint, "flintBronzeSword");
            copperBronzeSword = new MetalToolSword(PropsHelperInfiMetals.bronzeSwordID+6, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Copper, "copperBronzeSword");
            bronzeBronzeSword = new MetalToolSword(PropsHelperInfiMetals.bronzeSwordID+7, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Bronze, "copperBronzeSword");
        }
        
        if(PropsHelperInfiMetals.enableWorkedIronTools)
        {
            stoneWorkedIronSword = new MetalToolSword(PropsHelperInfiMetals.workedIronSwordID+0, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Stone, "stoneWorkedIronSword");
            ironWorkedIronSword = new MetalToolSword(PropsHelperInfiMetals.workedIronSwordID+1, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Iron, "ironWorkedIronSword");
            diamondWorkedIronSword = new MetalToolSword(PropsHelperInfiMetals.workedIronSwordID+2, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Diamond, "diamondWorkedIronSword");
            goldWorkedIronSword = new MetalToolSword(PropsHelperInfiMetals.workedIronSwordID+3, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Gold, "goldWorkedIronSword");
            redstoneWorkedIronSword = new MetalToolSword(PropsHelperInfiMetals.workedIronSwordID+4, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Redstone, "redstoneWorkedIronSword");
            obsidianWorkedIronSword = new MetalToolSword(PropsHelperInfiMetals.workedIronSwordID+5, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Obsidian, "obsidianWorkedIronSword");
            boneWorkedIronSword = new MetalToolSword(PropsHelperInfiMetals.workedIronSwordID+6, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Bone, "boneWorkedIronSword");
            netherrackWorkedIronSword = new MetalToolSword(PropsHelperInfiMetals.workedIronSwordID+7, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Netherrack, "netherrackWorkedIronSword");
            glowstoneWorkedIronSword = new MetalToolSword(PropsHelperInfiMetals.workedIronSwordID+8, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Glowstone, "glowstoneWorkedIronSword");
            iceWorkedIronSword = new MetalToolSword(PropsHelperInfiMetals.workedIronSwordID+9, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Ice, "iceWorkedIronSword");
            slimeWorkedIronSword = new MetalToolSword(PropsHelperInfiMetals.workedIronSwordID+10, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Slime, "slimeWorkedIronSword");
            cactusWorkedIronSword = new MetalToolSword(PropsHelperInfiMetals.workedIronSwordID+11, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Cactus, "cactusWorkedIronSword");
            blazeWorkedIronSword = new MetalToolSword(PropsHelperInfiMetals.workedIronSwordID+12, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Blaze, "blazeWorkedIronSword");
            copperWorkedIronSword = new MetalToolSword(PropsHelperInfiMetals.workedIronSwordID+13, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Copper, "copperWorkedIronSword");
            bronzeWorkedIronSword = new MetalToolSword(PropsHelperInfiMetals.workedIronSwordID+14, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Bronze, "bronzeWorkedIronSword");
            workedWorkedIronSword = new MetalToolSword(PropsHelperInfiMetals.workedIronSwordID+15, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.WorkedIron, "workedWorkedIronSword");
            steelWorkedIronSword = new MetalToolSword(PropsHelperInfiMetals.workedIronSwordID+16, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Steel, "steelWorkedIronSword");
            cobaltWorkedIronSword = new MetalToolSword(PropsHelperInfiMetals.workedIronSwordID+17, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Cobalt, "cobaltWorkedIronSword");
            arditeWorkedIronSword = new MetalToolSword(PropsHelperInfiMetals.workedIronSwordID+18, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Ardite, "arditeWorkedIronSword");
            uraniumWorkedIronSword = new MetalToolSword(PropsHelperInfiMetals.workedIronSwordID+19, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Bronze, "uraniumWorkedIronSword");
        }
        
        if(PropsHelperInfiMetals.enableSteelTools)
        {
            stoneSteelSword = new MetalToolSword(PropsHelperInfiMetals.steelSwordID+0, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Stone, "stoneSteelSword");
            ironSteelSword = new MetalToolSword(PropsHelperInfiMetals.steelSwordID+1, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Iron, "ironSteelSword");
            diamondSteelSword = new MetalToolSword(PropsHelperInfiMetals.steelSwordID+2, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Diamond, "diamondSteelSword");
            goldSteelSword = new MetalToolSword(PropsHelperInfiMetals.steelSwordID+3, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Gold, "goldSteelSword");
            redstoneSteelSword = new MetalToolSword(PropsHelperInfiMetals.steelSwordID+4, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Redstone, "redstoneSteelSword");
            obsidianSteelSword = new MetalToolSword(PropsHelperInfiMetals.steelSwordID+5, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Obsidian, "obsidianSteelSword");
            boneSteelSword = new MetalToolSword(PropsHelperInfiMetals.steelSwordID+6, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Bone, "boneSteelSword");
            netherrackSteelSword = new MetalToolSword(PropsHelperInfiMetals.steelSwordID+7, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Netherrack, "netherrackSteelSword");
            glowstoneSteelSword = new MetalToolSword(PropsHelperInfiMetals.steelSwordID+8, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Glowstone, "glowstoneSteelSword");
            iceSteelSword = new MetalToolSword(PropsHelperInfiMetals.steelSwordID+9, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Ice, "iceSteelSword");
            slimeSteelSword = new MetalToolSword(PropsHelperInfiMetals.steelSwordID+10, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Slime, "slimeSteelSword");
            cactusSteelSword = new MetalToolSword(PropsHelperInfiMetals.steelSwordID+11, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Cactus, "cactusSteelSword");
            blazeSteelSword = new MetalToolSword(PropsHelperInfiMetals.steelSwordID+12, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Blaze, "blazeSteelSword");
            copperSteelSword = new MetalToolSword(PropsHelperInfiMetals.steelSwordID+13, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Copper, "copperSteelSword");
            bronzeSteelSword = new MetalToolSword(PropsHelperInfiMetals.steelSwordID+14, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Bronze, "bronzeSteelSword");
            workedSteelSword = new MetalToolSword(PropsHelperInfiMetals.steelSwordID+15, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.WorkedIron, "workedSteelSword");
            steelSteelSword = new MetalToolSword(PropsHelperInfiMetals.steelSwordID+16, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Steel, "steelSteelSword");
            cobaltSteelSword = new MetalToolSword(PropsHelperInfiMetals.steelSwordID+17, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Cobalt, "cobaltSteelSword");
            arditeSteelSword = new MetalToolSword(PropsHelperInfiMetals.steelSwordID+18, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Ardite, "arditeSteelSword");
            uraniumSteelSword = new MetalToolSword(PropsHelperInfiMetals.steelSwordID+19, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Bronze, "uraniumSteelSword");
        }
        
        if(PropsHelperInfiMetals.enableCobaltTools)
        {
            stoneCobaltSword = new MetalToolSword(PropsHelperInfiMetals.cobaltSwordID+0, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Stone, "stoneCobaltSword");
            ironCobaltSword = new MetalToolSword(PropsHelperInfiMetals.cobaltSwordID+1, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Iron, "ironCobaltSword");
            diamondCobaltSword = new MetalToolSword(PropsHelperInfiMetals.cobaltSwordID+2,
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Gold, "goldCobaltSword");
            redstoneCobaltSword = new MetalToolSword(PropsHelperInfiMetals.cobaltSwordID+4, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Redstone, "redstoneCobaltSword");
            obsidianCobaltSword = new MetalToolSword(PropsHelperInfiMetals.cobaltSwordID+5, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Obsidian, "obsidianCobaltSword");
            boneCobaltSword = new MetalToolSword(PropsHelperInfiMetals.cobaltSwordID+6, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Bone, "boneCobaltSword");
            slimeCobaltSword = new MetalToolSword(PropsHelperInfiMetals.cobaltSwordID+7, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Slime, "slimeCobaltSword");
            cactusCobaltSword = new MetalToolSword(PropsHelperInfiMetals.cobaltSwordID+8, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Cactus, "cactusCobaltSword");
            blazeCobaltSword = new MetalToolSword(PropsHelperInfiMetals.cobaltSwordID+9, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Blaze, "blazeCobaltSword");
            copperCobaltSword = new MetalToolSword(PropsHelperInfiMetals.cobaltSwordID+10, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Copper, "copperCobaltSword");
            bronzeCobaltSword = new MetalToolSword(PropsHelperInfiMetals.cobaltSwordID+11, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Bronze, "bronzeCobaltSword");
            workedCobaltSword = new MetalToolSword(PropsHelperInfiMetals.cobaltSwordID+12, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.WorkedIron, "workedCobaltSword");
            steelCobaltSword = new MetalToolSword(PropsHelperInfiMetals.cobaltSwordID+13, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Steel, "steelCobaltSword");
            cobaltCobaltSword = new MetalToolSword(PropsHelperInfiMetals.cobaltSwordID+14, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Cobalt, "cobaltCobaltSword");
            arditeCobaltSword = new MetalToolSword(PropsHelperInfiMetals.cobaltSwordID+15, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Ardite, "arditeCobaltSword");
            manyullynCobaltSword = new MetalToolSword(PropsHelperInfiMetals.cobaltSwordID+16, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Manyullyn, "arditeCobaltSword");
            uraniumCobaltSword = new MetalToolSword(PropsHelperInfiMetals.cobaltSwordID+17, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Bronze, "uraniumCobaltSword");
        }
        
        if(PropsHelperInfiMetals.enableArditeTools)
        {
            stoneArditeSword = new MetalToolSword(PropsHelperInfiMetals.arditeSwordID+0, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Stone, "stoneArditeSword");
            ironArditeSword = new MetalToolSword(PropsHelperInfiMetals.arditeSwordID+1, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Iron, "ironArditeSword");
            diamondArditeSword = new MetalToolSword(PropsHelperInfiMetals.arditeSwordID+2,
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Gold, "goldArditeSword");
            redstoneArditeSword = new MetalToolSword(PropsHelperInfiMetals.arditeSwordID+4, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Redstone, "redstoneArditeSword");
            obsidianArditeSword = new MetalToolSword(PropsHelperInfiMetals.arditeSwordID+5, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Obsidian, "obsidianArditeSword");
            boneArditeSword = new MetalToolSword(PropsHelperInfiMetals.arditeSwordID+6, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Bone, "boneArditeSword");
            slimeArditeSword = new MetalToolSword(PropsHelperInfiMetals.arditeSwordID+7, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Slime, "slimeArditeSword");
            cactusArditeSword = new MetalToolSword(PropsHelperInfiMetals.arditeSwordID+8, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Cactus, "cactusArditeSword");
            blazeArditeSword = new MetalToolSword(PropsHelperInfiMetals.arditeSwordID+9, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Blaze, "blazeArditeSword");
            copperArditeSword = new MetalToolSword(PropsHelperInfiMetals.arditeSwordID+10, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Copper, "copperArditeSword");
            bronzeArditeSword = new MetalToolSword(PropsHelperInfiMetals.arditeSwordID+11, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Bronze, "bronzeArditeSword");
            workedArditeSword = new MetalToolSword(PropsHelperInfiMetals.arditeSwordID+12, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.WorkedIron, "workedArditeSword");
            steelArditeSword = new MetalToolSword(PropsHelperInfiMetals.arditeSwordID+13, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Steel, "steelArditeSword");
            cobaltArditeSword = new MetalToolSword(PropsHelperInfiMetals.arditeSwordID+14, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Cobalt, "cobaltArditeSword");
            arditeArditeSword = new MetalToolSword(PropsHelperInfiMetals.arditeSwordID+15, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Ardite, "arditeArditeSword");
            manyullynArditeSword = new MetalToolSword(PropsHelperInfiMetals.arditeSwordID+16, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Manyullyn, "arditeArditeSword");
            uraniumArditeSword = new MetalToolSword(PropsHelperInfiMetals.arditeSwordID+17, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Bronze, "uraniumArditeSword");
        }
        
        if(PropsHelperInfiMetals.enableManyullynTools)
        {
            stoneManyullynSword = new MetalToolSword(PropsHelperInfiMetals.manyullynSwordID+0, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Stone, "stoneManyullynSword");
            ironManyullynSword = new MetalToolSword(PropsHelperInfiMetals.manyullynSwordID+1, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Iron, "ironManyullynSword");
            diamondManyullynSword = new MetalToolSword(PropsHelperInfiMetals.manyullynSwordID+2,
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Gold, "goldManyullynSword");
            redstoneManyullynSword = new MetalToolSword(PropsHelperInfiMetals.manyullynSwordID+4, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Redstone, "redstoneManyullynSword");
            obsidianManyullynSword = new MetalToolSword(PropsHelperInfiMetals.manyullynSwordID+5, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Obsidian, "obsidianManyullynSword");
            boneManyullynSword = new MetalToolSword(PropsHelperInfiMetals.manyullynSwordID+6, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Bone, "boneManyullynSword");
            slimeManyullynSword = new MetalToolSword(PropsHelperInfiMetals.manyullynSwordID+7, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Slime, "slimeManyullynSword");
            cactusManyullynSword = new MetalToolSword(PropsHelperInfiMetals.manyullynSwordID+8, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Cactus, "cactusManyullynSword");
            blazeManyullynSword = new MetalToolSword(PropsHelperInfiMetals.manyullynSwordID+9, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Blaze, "blazeManyullynSword");
            copperManyullynSword = new MetalToolSword(PropsHelperInfiMetals.manyullynSwordID+10, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Copper, "copperManyullynSword");
            bronzeManyullynSword = new MetalToolSword(PropsHelperInfiMetals.manyullynSwordID+11, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Bronze, "bronzeManyullynSword");
            workedManyullynSword = new MetalToolSword(PropsHelperInfiMetals.manyullynSwordID+12, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.WorkedIron, "workedManyullynSword");
            steelManyullynSword = new MetalToolSword(PropsHelperInfiMetals.manyullynSwordID+13, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Steel, "steelManyullynSword");
            cobaltManyullynSword = new MetalToolSword(PropsHelperInfiMetals.manyullynSwordID+14, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Cobalt, "cobaltManyullynSword");
            arditeManyullynSword = new MetalToolSword(PropsHelperInfiMetals.manyullynSwordID+15, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Ardite, "arditeManyullynSword");
            manyullynManyullynSword = new MetalToolSword(PropsHelperInfiMetals.manyullynSwordID+16, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Manyullyn, "arditeManyullynSword");
            uraniumManyullynSword = new MetalToolSword(PropsHelperInfiMetals.manyullynSwordID+17, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Bronze, "uraniumManyullynSword");
        }
        
        if(PropsHelperInfiMetals.enableUraniumTools)
        {
            diamondUraniumSword = new MetalToolSword(PropsHelperInfiMetals.uraniumSwordID+0, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Diamond, "diamondUraniumSword");
            redstoneUraniumSword = new MetalToolSword(PropsHelperInfiMetals.uraniumSwordID+1, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Redstone, "redstoneUraniumSword");
            boneUraniumSword = new MetalToolSword(PropsHelperInfiMetals.uraniumSwordID+2, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Bone, "boneUraniumSword");
            netherrackUraniumSword = new MetalToolSword(PropsHelperInfiMetals.uraniumSwordID+3, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Netherrack, "netherrackUraniumSword");
            glowstoneUraniumSword = new MetalToolSword(PropsHelperInfiMetals.uraniumSwordID+4, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Glowstone, "glowstoneUraniumSword");
            lavaUraniumSword = new MetalToolSword(PropsHelperInfiMetals.uraniumSwordID+5, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Lava, "lavaUraniumSword");
            blazeUraniumSword = new MetalToolSword(PropsHelperInfiMetals.uraniumSwordID+6, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Blaze, "blazeUraniumSword");
            cobaltUraniumSword = new MetalToolSword(PropsHelperInfiMetals.uraniumSwordID+7, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Cobalt, "cobaltUraniumSword");
            arditeUraniumSword = new MetalToolSword(PropsHelperInfiMetals.uraniumSwordID+8, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Ardite, "arditeUraniumSword");
            uraniumUraniumSword = new MetalToolSword(PropsHelperInfiMetals.uraniumSwordID+9, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Uranium, "uraniumUraniumSword");
        }
        
        if(PropsHelperInfiMetals.enableStoneTools)
        {
            copperStoneSword = new MetalToolSword(PropsHelperInfiMetals.stoneSwordID+0, 
                    InfiMaterialEnum.Stone, InfiMaterialEnum.Copper, "copperStoneSword");
        }
        
        if(PropsHelperInfiMetals.enableIronTools)
        {
            copperIronSword = new MetalToolSword(PropsHelperInfiMetals.ironSwordID+0, 
                    InfiMaterialEnum.Iron, InfiMaterialEnum.Copper, "copperIronSword");
            bronzeIronSword = new MetalToolSword(PropsHelperInfiMetals.ironSwordID+1, 
                    InfiMaterialEnum.Iron, InfiMaterialEnum.Bronze, "bronzeIronSword");
            workedIronSword = new MetalToolSword(PropsHelperInfiMetals.ironSwordID+2, 
                    InfiMaterialEnum.Iron, InfiMaterialEnum.WorkedIron, "workedIronSword");
        }
        
        if(PropsHelperInfiMetals.enableDiamondTools)
        {
            copperDiamondSword = new MetalToolSword(PropsHelperInfiMetals.diamondSwordID+0, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Copper, "copperDiamondSword");
            bronzeDiamondSword = new MetalToolSword(PropsHelperInfiMetals.diamondSwordID+1, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Bronze, "bronzeDiamondSword");
            workedDiamondSword = new MetalToolSword(PropsHelperInfiMetals.diamondSwordID+2, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.WorkedIron, "workedDiamondSword");
            steelDiamondSword = new MetalToolSword(PropsHelperInfiMetals.diamondSwordID+3, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Steel, "steelDiamondSword");
            cobaltDiamondSword = new MetalToolSword(PropsHelperInfiMetals.diamondSwordID+4, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Cobalt, "cobaltDiamondSword");
            arditeDiamondSword = new MetalToolSword(PropsHelperInfiMetals.diamondSwordID+5, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Ardite, "arditeDiamondSword");
            manyullynDiamondSword = new MetalToolSword(PropsHelperInfiMetals.diamondSwordID+6, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Manyullyn, "manyullynDiamondSword");
            uraniumDiamondSword = new MetalToolSword(PropsHelperInfiMetals.diamondSwordID+7, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Uranium, "uraniumDiamondSword");
        }
        
        if(PropsHelperInfiMetals.enableRedstoneTools)
        {
            copperRedstoneSword = new MetalToolSword(PropsHelperInfiMetals.redstoneSwordID+0, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Copper, "copperRedstoneSword");
            bronzeRedstoneSword = new MetalToolSword(PropsHelperInfiMetals.redstoneSwordID+1, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Bronze, "bronzeRedstoneSword");
            workedRedstoneSword = new MetalToolSword(PropsHelperInfiMetals.redstoneSwordID+2, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.WorkedIron, "workedRedstoneSword");
        }
        
        if(PropsHelperInfiMetals.enableMossyTools)
        {
            cobaltMossySword = new MetalToolSword(PropsHelperInfiMetals.mossySwordID+0, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Cobalt, "cobaltMossySword");
            arditeMossySword = new MetalToolSword(PropsHelperInfiMetals.mossySwordID+1, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Ardite, "arditeMossySword");
            manyullynMossySword = new MetalToolSword(PropsHelperInfiMetals.mossySwordID+2, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Manyullyn, "manyullynMossySword");
        }
        
        if(PropsHelperInfiMetals.enableNetherrackTools)
        {
            copperNetherrackSword = new MetalToolSword(PropsHelperInfiMetals.netherrackSwordID+0, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Copper, "copperNetherrackSword");
        }
        
        if(PropsHelperInfiMetals.enableGlowstoneTools)
        {
            copperGlowstoneSword = new MetalToolSword(PropsHelperInfiMetals.glowstoneSwordID+0, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Copper, "copperGlowstoneSword");
            bronzeGlowstoneSword = new MetalToolSword(PropsHelperInfiMetals.glowstoneSwordID+1, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Bronze, "bronzeGlowstoneSword");
            workedGlowstoneSword = new MetalToolSword(PropsHelperInfiMetals.glowstoneSwordID+2, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.WorkedIron, "workedGlowstoneSword");
            steelGlowstoneSword = new MetalToolSword(PropsHelperInfiMetals.glowstoneSwordID+3, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Steel, "steelGlowstoneSword");
        }
        
        if(PropsHelperInfiMetals.enableLavaTools)
        {
            cobaltLavaSword = new MetalToolSword(PropsHelperInfiMetals.lavaSwordID+0, 
                    InfiMaterialEnum.Lava, InfiMaterialEnum.Cobalt, "cobaltLavaSword");
            arditeLavaSword = new MetalToolSword(PropsHelperInfiMetals.lavaSwordID+1, 
                    InfiMaterialEnum.Lava, InfiMaterialEnum.Ardite, "arditeLavaSword");
            manyullynLavaSword = new MetalToolSword(PropsHelperInfiMetals.lavaSwordID+2, 
                    InfiMaterialEnum.Lava, InfiMaterialEnum.Manyullyn, "manyullynLavaSword");
            uraniumLavaSword = new MetalToolSword(PropsHelperInfiMetals.lavaSwordID+3, 
                    InfiMaterialEnum.Lava, InfiMaterialEnum.Uranium, "uraniumLavaSword");
        }
        
        if(PropsHelperInfiMetals.enableSlimeTools)
        {
            copperSlimeSword = new MetalToolSword(PropsHelperInfiMetals.slimeSwordID+0, 
                    InfiMaterialEnum.Slime, InfiMaterialEnum.Copper, "copperSlimeSword");
            bronzeSlimeSword = new MetalToolSword(PropsHelperInfiMetals.slimeSwordID+1, 
                    InfiMaterialEnum.Slime, InfiMaterialEnum.Bronze, "bronzeSlimeSword");
            workedSlimeSword = new MetalToolSword(PropsHelperInfiMetals.slimeSwordID+2, 
                    InfiMaterialEnum.Slime, InfiMaterialEnum.WorkedIron, "workedSlimeSword");
            steelSlimeSword = new MetalToolSword(PropsHelperInfiMetals.slimeSwordID+3, 
                    InfiMaterialEnum.Slime, InfiMaterialEnum.Steel, "steelSlimeSword");
            cobaltSlimeSword = new MetalToolSword(PropsHelperInfiMetals.slimeSwordID+4, 
                    InfiMaterialEnum.Slime, InfiMaterialEnum.Cobalt, "cobaltSlimeSword");
            arditeSlimeSword = new MetalToolSword(PropsHelperInfiMetals.slimeSwordID+5, 
                    InfiMaterialEnum.Slime, InfiMaterialEnum.Ardite, "arditeSlimeSword");
            manyullynSlimeSword = new MetalToolSword(PropsHelperInfiMetals.slimeSwordID+6, 
                    InfiMaterialEnum.Slime, InfiMaterialEnum.Manyullyn, "manyullynSlimeSword");
            uraniumSlimeSword = new MetalToolSword(PropsHelperInfiMetals.slimeSwordID+7, 
                    InfiMaterialEnum.Slime, InfiMaterialEnum.Uranium, "uraniumSlimeSword");
        }
        
        if(PropsHelperInfiMetals.enableFlintTools)
        {
            copperFlintSword = new MetalToolSword(PropsHelperInfiMetals.flintSwordID+0, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Copper, "copperFlintSword");
            bronzeFlintSword = new MetalToolSword(PropsHelperInfiMetals.flintSwordID+1, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Bronze, "bronzeFlintSword");
        }
        
        if(PropsHelperInfiMetals.enableBlazeTools)
        {
            cobaltBlazeSword = new MetalToolSword(PropsHelperInfiMetals.blazeSwordID+0, 
                    InfiMaterialEnum.Blaze, InfiMaterialEnum.Cobalt, "cobaltBlazeSword");
            arditeBlazeSword = new MetalToolSword(PropsHelperInfiMetals.blazeSwordID+1, 
                    InfiMaterialEnum.Blaze, InfiMaterialEnum.Ardite, "arditeBlazeSword");
            manyullynBlazeSword = new MetalToolSword(PropsHelperInfiMetals.blazeSwordID+2, 
                    InfiMaterialEnum.Blaze, InfiMaterialEnum.Manyullyn, "manyullynBlazeSword");
            uraniumBlazeSword = new MetalToolSword(PropsHelperInfiMetals.blazeSwordID+3, 
                    InfiMaterialEnum.Blaze, InfiMaterialEnum.Uranium, "uraniumBlazeSword");
        }
    }
    
    private static void addNames()
    {
        ModLoader.addName(copperCopperSword, "Orange-Tang Sword");
        ModLoader.addName(bronzeBronzeSword, "Polished Sword");
        ModLoader.addName(workedWorkedIronSword, "Reworked Iron Sword");
        ModLoader.addName(steelSteelSword, "Forge-Wrought Sword");
        ModLoader.addName(cobaltCobaltSword, "Beautiful Sword");
        ModLoader.addName(arditeArditeSword, "Rustic StoneDigger");
        ModLoader.addName(manyullynManyullynSword, "False-Prophetic Sword");
        ModLoader.addName(uraniumUraniumSword, "Cancerous Sword");
    }
    
    public static void registerInfiToolsRecipes()
    {
        if(PropsHelperInfiMetals.enableStoneTools)
        {
            ModLoader.addRecipe(new ItemStack(copperStoneSword), new Object[] 
                    { "#", "#", "|", '#', Block.stone, '|', mod_InfiMetals.copperRod });
        }
        if(PropsHelperInfiMetals.enableIronTools)
        {
            ModLoader.addRecipe(new ItemStack(copperIronSword), new Object[] 
                    { "#", "#", "|", '#', Item.ingotIron, '|', mod_InfiMetals.copperRod });
            ModLoader.addRecipe(new ItemStack(bronzeIronSword), new Object[] 
                    { "#", "#", "|", '#', Item.ingotIron, '|', mod_InfiMetals.bronzeRod });
            ModLoader.addRecipe(new ItemStack(workedIronSword), new Object[] 
                    { "#", "#", "|", '#', Item.ingotIron, '|', mod_InfiMetals.workedIronRod });
        }
        if(PropsHelperInfiMetals.enableDiamondTools)
        {
            ModLoader.addRecipe(new ItemStack(copperDiamondSword), new Object[] 
                    { "#", "#", "|", '#', Item.diamond, '|', mod_InfiMetals.copperRod });
            ModLoader.addRecipe(new ItemStack(bronzeDiamondSword), new Object[] 
                    { "#", "#", "|", '#', Item.diamond, '|', mod_InfiMetals.bronzeRod });
            ModLoader.addRecipe(new ItemStack(workedDiamondSword), new Object[] 
                    { "#", "#", "|", '#', Item.diamond, '|', mod_InfiMetals.workedIronRod });
            ModLoader.addRecipe(new ItemStack(steelDiamondSword), new Object[] 
                    { "#", "#", "|", '#', Item.diamond, '|', mod_InfiMetals.steelRod });
            ModLoader.addRecipe(new ItemStack(cobaltDiamondSword), new Object[] 
                    { "#", "#", "|", '#', Item.diamond, '|', mod_InfiMetals.cobaltRod });
            ModLoader.addRecipe(new ItemStack(arditeDiamondSword), new Object[] 
                    { "#", "#", "|", '#', Item.diamond, '|', mod_InfiMetals.arditeRod });
            ModLoader.addRecipe(new ItemStack(manyullynDiamondSword), new Object[] 
                    { "#", "#", "|", '#', Item.diamond, '|', mod_InfiMetals.manyullynRod });
            ModLoader.addRecipe(new ItemStack(uraniumDiamondSword), new Object[] 
                    { "#", "#", "|", '#', Item.diamond, '|', mod_InfiMetals.uraniumRod });
        }
        if(PropsHelperInfiMetals.enableMossyTools)
        {
            ModLoader.addRecipe(new ItemStack(cobaltMossySword), new Object[] 
                    { "#", "#", "|", '#', mod_InfiTools.mossBallCrafted, '|', mod_InfiMetals.cobaltRod });
            ModLoader.addRecipe(new ItemStack(arditeMossySword), new Object[] 
                    { "#", "#", "|", '#', mod_InfiTools.mossBallCrafted, '|', mod_InfiMetals.arditeRod });
            ModLoader.addRecipe(new ItemStack(manyullynMossySword), new Object[] 
                    { "#", "#", "|", '#', mod_InfiTools.mossBallCrafted, '|', mod_InfiMetals.manyullynRod });
        }
        if(PropsHelperInfiMetals.enableNetherrackTools)
        {
            ModLoader.addRecipe(new ItemStack(copperNetherrackSword), new Object[] 
                    { "#", "#", "|", '#', Block.netherrack, '|', mod_InfiMetals.copperRod });
        }
        if(PropsHelperInfiMetals.enableFlintTools)
        {
            ModLoader.addRecipe(new ItemStack(copperFlintSword), new Object[] 
                    { "#", "#", "|", '#', Block.netherrack, '|', mod_InfiMetals.copperRod });
            ModLoader.addRecipe(new ItemStack(bronzeFlintSword), new Object[] 
                    { "#", "#", "|", '#', Block.netherrack, '|', mod_InfiMetals.bronzeRod });
        }
    }
    
    public static void addCopperTools(ItemStack stack)
    {
        ModLoader.addRecipe(new ItemStack(stoneCopperSword), new Object[] 
                { "#", "#", "|", '#', stack, '|', mod_InfiTools.stoneRod });
        ModLoader.addRecipe(new ItemStack(boneCopperSword), new Object[] 
                { "#", "#", "|", '#', stack, '|', Item.bone });
        ModLoader.addRecipe(new ItemStack(boneCopperSword), new Object[] 
                { "#", "#", "|", '#', stack, '|', mod_InfiTools.boneRod });
        ModLoader.addRecipe(new ItemStack(netherrackCopperSword), new Object[] 
                { "#", "#", "|", '#', stack, '|', mod_InfiTools.netherrackRod });
        ModLoader.addRecipe(new ItemStack(slimeCopperSword), new Object[] 
                { "#", "#", "|", '#', stack, '|', mod_InfiTools.slimeRod });
        ModLoader.addRecipe(new ItemStack(cactusCopperSword), new Object[] 
                { "#", "#", "|", '#', stack, '|', mod_InfiTools.cactusRod });
        ModLoader.addRecipe(new ItemStack(flintCopperSword), new Object[] 
                { "#", "#", "|", '#', stack, '|', mod_InfiTools.flintRod });
        ModLoader.addRecipe(new ItemStack(copperCopperSword), new Object[] 
                { "#", "#", "|", '#', stack, '|', mod_InfiMetals.copperRod });
    }
    
    public static void addBronzeTools(ItemStack stack)
    {
        ModLoader.addRecipe(new ItemStack(stoneBronzeSword), new Object[] 
                { "#", "#", "|", '#', stack, '|', mod_InfiTools.stoneRod });
        ModLoader.addRecipe(new ItemStack(boneBronzeSword), new Object[] 
                { "#", "#", "|", '#', stack, '|', Item.bone });
        ModLoader.addRecipe(new ItemStack(boneBronzeSword), new Object[] 
                { "#", "#", "|", '#', stack, '|', mod_InfiTools.boneRod });
        ModLoader.addRecipe(new ItemStack(netherrackBronzeSword), new Object[] 
                { "#", "#", "|", '#', stack, '|', mod_InfiTools.netherrackRod });
        ModLoader.addRecipe(new ItemStack(slimeBronzeSword), new Object[] 
                { "#", "#", "|", '#', stack, '|', mod_InfiTools.slimeRod });
        ModLoader.addRecipe(new ItemStack(cactusBronzeSword), new Object[] 
                { "#", "#", "|", '#', stack, '|', mod_InfiTools.cactusRod });
        ModLoader.addRecipe(new ItemStack(flintBronzeSword), new Object[] 
                { "#", "#", "|", '#', stack, '|', mod_InfiTools.flintRod });
        ModLoader.addRecipe(new ItemStack(copperBronzeSword), new Object[] 
                { "#", "#", "|", '#', stack, '|', mod_InfiMetals.copperRod });
        ModLoader.addRecipe(new ItemStack(bronzeBronzeSword), new Object[] 
                { "#", "#", "|", '#', stack, '|', mod_InfiMetals.bronzeRod });
    }
    
    public static void addWorkedIronTools(ItemStack stack)
    {
        ModLoader.addRecipe(new ItemStack(stoneWorkedIronSword), new Object[] 
                { "#", "#", "|", '#', stack, '|', mod_InfiTools.stoneRod });
        ModLoader.addRecipe(new ItemStack(ironWorkedIronSword), new Object[] 
                { "#", "#", "|", '#', stack, '|', mod_InfiTools.ironRod });
        ModLoader.addRecipe(new ItemStack(diamondWorkedIronSword), new Object[] 
                { "#", "#", "|", '#', stack, '|', mod_InfiTools.diamondRod });
        ModLoader.addRecipe(new ItemStack(goldWorkedIronSword), new Object[] 
                { "#", "#", "|", '#', stack, '|', mod_InfiTools.goldRod });
        ModLoader.addRecipe(new ItemStack(redstoneWorkedIronSword), new Object[] 
                { "#", "#", "|", '#', stack, '|', mod_InfiTools.redstoneRod });
        ModLoader.addRecipe(new ItemStack(obsidianWorkedIronSword), new Object[] 
                { "#", "#", "|", '#', stack, '|', mod_InfiTools.obsidianRod });
        ModLoader.addRecipe(new ItemStack(boneWorkedIronSword), new Object[] 
                { "#", "#", "|", '#', stack, '|', Item.bone });
        ModLoader.addRecipe(new ItemStack(boneWorkedIronSword), new Object[] 
                { "#", "#", "|", '#', stack, '|', mod_InfiTools.boneRod });
        ModLoader.addRecipe(new ItemStack(netherrackWorkedIronSword), new Object[] 
                { "#", "#", "|", '#', stack, '|', mod_InfiTools.netherrackRod });
        ModLoader.addRecipe(new ItemStack(glowstoneWorkedIronSword), new Object[] 
                { "#", "#", "|", '#', stack, '|', mod_InfiTools.glowstoneRod });
        ModLoader.addRecipe(new ItemStack(iceWorkedIronSword), new Object[] 
                { "#", "#", "|", '#', stack, '|', mod_InfiTools.iceRod });
        ModLoader.addRecipe(new ItemStack(slimeWorkedIronSword), new Object[] 
                { "#", "#", "|", '#', stack, '|', mod_InfiTools.slimeRod });
        ModLoader.addRecipe(new ItemStack(cactusWorkedIronSword), new Object[] 
                { "#", "#", "|", '#', stack, '|', mod_InfiTools.cactusRod });
        ModLoader.addRecipe(new ItemStack(blazeWorkedIronSword), new Object[] 
                { "#", "#", "|", '#', stack, '|', Item.blazeRod });
        ModLoader.addRecipe(new ItemStack(copperWorkedIronSword), new Object[] 
                { "#", "#", "|", '#', stack, '|', mod_InfiMetals.copperRod });
        ModLoader.addRecipe(new ItemStack(bronzeWorkedIronSword), new Object[] 
                { "#", "#", "|", '#', stack, '|', mod_InfiMetals.bronzeRod });
        ModLoader.addRecipe(new ItemStack(workedWorkedIronSword), new Object[] 
                { "#", "#", "|", '#', stack, '|', mod_InfiMetals.workedIronRod });
        ModLoader.addRecipe(new ItemStack(steelWorkedIronSword), new Object[] 
                { "#", "#", "|", '#', stack, '|', mod_InfiMetals.steelRod });
        ModLoader.addRecipe(new ItemStack(cobaltWorkedIronSword), new Object[] 
                { "#", "#", "|", '#', stack, '|', mod_InfiMetals.cobaltRod });
        ModLoader.addRecipe(new ItemStack(arditeWorkedIronSword), new Object[] 
                { "#", "#", "|", '#', stack, '|', mod_InfiMetals.arditeRod });
        ModLoader.addRecipe(new ItemStack(uraniumWorkedIronSword), new Object[] 
                { "#", "#", "|", '#', stack, '|', mod_InfiMetals.uraniumRod });
    }
    
    public static void addSteelTools(ItemStack stack)
    {
        ModLoader.addRecipe(new ItemStack(stoneSteelSword), new Object[] 
                { "#", "#", "|", '#', stack, '|', mod_InfiTools.stoneRod });
        ModLoader.addRecipe(new ItemStack(ironSteelSword), new Object[] 
                { "#", "#", "|", '#', stack, '|', mod_InfiTools.ironRod });
        ModLoader.addRecipe(new ItemStack(diamondSteelSword), new Object[] 
                { "#", "#", "|", '#', stack, '|', mod_InfiTools.diamondRod });
        ModLoader.addRecipe(new ItemStack(goldSteelSword), new Object[] 
                { "#", "#", "|", '#', stack, '|', mod_InfiTools.goldRod });
        ModLoader.addRecipe(new ItemStack(redstoneSteelSword), new Object[] 
                { "#", "#", "|", '#', stack, '|', mod_InfiTools.redstoneRod });
        ModLoader.addRecipe(new ItemStack(obsidianSteelSword), new Object[] 
                { "#", "#", "|", '#', stack, '|', mod_InfiTools.obsidianRod });
        ModLoader.addRecipe(new ItemStack(boneSteelSword), new Object[] 
                { "#", "#", "|", '#', stack, '|', Item.bone });
        ModLoader.addRecipe(new ItemStack(boneSteelSword), new Object[] 
                { "#", "#", "|", '#', stack, '|', mod_InfiTools.boneRod });
        ModLoader.addRecipe(new ItemStack(netherrackSteelSword), new Object[] 
                { "#", "#", "|", '#', stack, '|', mod_InfiTools.netherrackRod });
        ModLoader.addRecipe(new ItemStack(glowstoneSteelSword), new Object[] 
                { "#", "#", "|", '#', stack, '|', mod_InfiTools.glowstoneRod });
        ModLoader.addRecipe(new ItemStack(iceSteelSword), new Object[] 
                { "#", "#", "|", '#', stack, '|', mod_InfiTools.iceRod });
        ModLoader.addRecipe(new ItemStack(slimeSteelSword), new Object[] 
                { "#", "#", "|", '#', stack, '|', mod_InfiTools.slimeRod });
        ModLoader.addRecipe(new ItemStack(cactusSteelSword), new Object[] 
                { "#", "#", "|", '#', stack, '|', mod_InfiTools.cactusRod });
        ModLoader.addRecipe(new ItemStack(blazeSteelSword), new Object[] 
                { "#", "#", "|", '#', stack, '|', Item.blazeRod });
        ModLoader.addRecipe(new ItemStack(copperSteelSword), new Object[] 
                { "#", "#", "|", '#', stack, '|', mod_InfiMetals.copperRod });
        ModLoader.addRecipe(new ItemStack(bronzeSteelSword), new Object[] 
                { "#", "#", "|", '#', stack, '|', mod_InfiMetals.bronzeRod });
        ModLoader.addRecipe(new ItemStack(workedSteelSword), new Object[] 
                { "#", "#", "|", '#', stack, '|', mod_InfiMetals.workedIronRod });
        ModLoader.addRecipe(new ItemStack(steelSteelSword), new Object[] 
                { "#", "#", "|", '#', stack, '|', mod_InfiMetals.steelRod });
        ModLoader.addRecipe(new ItemStack(cobaltSteelSword), new Object[] 
                { "#", "#", "|", '#', stack, '|', mod_InfiMetals.cobaltRod });
        ModLoader.addRecipe(new ItemStack(arditeSteelSword), new Object[] 
                { "#", "#", "|", '#', stack, '|', mod_InfiMetals.arditeRod });
        ModLoader.addRecipe(new ItemStack(uraniumSteelSword), new Object[] 
                { "#", "#", "|", '#', stack, '|', mod_InfiMetals.uraniumRod });
    }
    
    public static void addCobaltTools(ItemStack stack)
    {
        ModLoader.addRecipe(new ItemStack(stoneCobaltSword), new Object[] 
                { "#", "#", "|", '#', stack, '|', mod_InfiTools.stoneRod });
        ModLoader.addRecipe(new ItemStack(ironCobaltSword), new Object[] 
                { "#", "#", "|", '#', stack, '|', mod_InfiTools.ironRod });
        ModLoader.addRecipe(new ItemStack(diamondCobaltSword), new Object[] 
                { "#", "#", "|", '#', stack, '|', mod_InfiTools.diamondRod });
        ModLoader.addRecipe(new ItemStack(redstoneCobaltSword), new Object[] 
                { "#", "#", "|", '#', stack, '|', mod_InfiTools.redstoneRod });
        ModLoader.addRecipe(new ItemStack(obsidianCobaltSword), new Object[] 
                { "#", "#", "|", '#', stack, '|', mod_InfiTools.obsidianRod });
        ModLoader.addRecipe(new ItemStack(boneCobaltSword), new Object[] 
                { "#", "#", "|", '#', stack, '|', Item.bone });
        ModLoader.addRecipe(new ItemStack(boneCobaltSword), new Object[] 
                { "#", "#", "|", '#', stack, '|', mod_InfiTools.boneRod });
        ModLoader.addRecipe(new ItemStack(slimeCobaltSword), new Object[] 
                { "#", "#", "|", '#', stack, '|', mod_InfiTools.slimeRod });
        ModLoader.addRecipe(new ItemStack(cactusCobaltSword), new Object[] 
                { "#", "#", "|", '#', stack, '|', mod_InfiTools.cactusRod });
        ModLoader.addRecipe(new ItemStack(blazeCobaltSword), new Object[] 
                { "#", "#", "|", '#', stack, '|', Item.blazeRod });
        ModLoader.addRecipe(new ItemStack(copperCobaltSword), new Object[] 
                { "#", "#", "|", '#', stack, '|', mod_InfiMetals.copperRod });
        ModLoader.addRecipe(new ItemStack(bronzeCobaltSword), new Object[] 
                { "#", "#", "|", '#', stack, '|', mod_InfiMetals.bronzeRod });
        ModLoader.addRecipe(new ItemStack(workedCobaltSword), new Object[] 
                { "#", "#", "|", '#', stack, '|', mod_InfiMetals.workedIronRod });
        ModLoader.addRecipe(new ItemStack(steelCobaltSword), new Object[] 
                { "#", "#", "|", '#', stack, '|', mod_InfiMetals.steelRod });
        ModLoader.addRecipe(new ItemStack(cobaltCobaltSword), new Object[] 
                { "#", "#", "|", '#', stack, '|', mod_InfiMetals.cobaltRod });
        ModLoader.addRecipe(new ItemStack(arditeCobaltSword), new Object[] 
                { "#", "#", "|", '#', stack, '|', mod_InfiMetals.arditeRod });
        ModLoader.addRecipe(new ItemStack(manyullynCobaltSword), new Object[] 
                { "#", "#", "|", '#', stack, '|', mod_InfiMetals.manyullynRod });
        ModLoader.addRecipe(new ItemStack(uraniumCobaltSword), new Object[] 
                { "#", "#", "|", '#', stack, '|', mod_InfiMetals.uraniumRod });
    }
    
    public static void addArditeTools(ItemStack stack)
    {
        ModLoader.addRecipe(new ItemStack(stoneArditeSword), new Object[] 
                { "#", "#", "|", '#', stack, '|', mod_InfiTools.stoneRod });
        ModLoader.addRecipe(new ItemStack(ironArditeSword), new Object[] 
                { "#", "#", "|", '#', stack, '|', mod_InfiTools.ironRod });
        ModLoader.addRecipe(new ItemStack(diamondArditeSword), new Object[] 
                { "#", "#", "|", '#', stack, '|', mod_InfiTools.diamondRod });
        ModLoader.addRecipe(new ItemStack(redstoneArditeSword), new Object[] 
                { "#", "#", "|", '#', stack, '|', mod_InfiTools.redstoneRod });
        ModLoader.addRecipe(new ItemStack(obsidianArditeSword), new Object[] 
                { "#", "#", "|", '#', stack, '|', mod_InfiTools.obsidianRod });
        ModLoader.addRecipe(new ItemStack(boneArditeSword), new Object[] 
                { "#", "#", "|", '#', stack, '|', Item.bone });
        ModLoader.addRecipe(new ItemStack(boneArditeSword), new Object[] 
                { "#", "#", "|", '#', stack, '|', mod_InfiTools.boneRod });
        ModLoader.addRecipe(new ItemStack(slimeArditeSword), new Object[] 
                { "#", "#", "|", '#', stack, '|', mod_InfiTools.slimeRod });
        ModLoader.addRecipe(new ItemStack(cactusArditeSword), new Object[] 
                { "#", "#", "|", '#', stack, '|', mod_InfiTools.cactusRod });
        ModLoader.addRecipe(new ItemStack(blazeArditeSword), new Object[] 
                { "#", "#", "|", '#', stack, '|', Item.blazeRod });
        ModLoader.addRecipe(new ItemStack(copperArditeSword), new Object[] 
                { "#", "#", "|", '#', stack, '|', mod_InfiMetals.copperRod });
        ModLoader.addRecipe(new ItemStack(bronzeArditeSword), new Object[] 
                { "#", "#", "|", '#', stack, '|', mod_InfiMetals.bronzeRod });
        ModLoader.addRecipe(new ItemStack(workedArditeSword), new Object[] 
                { "#", "#", "|", '#', stack, '|', mod_InfiMetals.workedIronRod });
        ModLoader.addRecipe(new ItemStack(steelArditeSword), new Object[] 
                { "#", "#", "|", '#', stack, '|', mod_InfiMetals.steelRod });
        ModLoader.addRecipe(new ItemStack(cobaltArditeSword), new Object[] 
                { "#", "#", "|", '#', stack, '|', mod_InfiMetals.cobaltRod });
        ModLoader.addRecipe(new ItemStack(arditeArditeSword), new Object[] 
                { "#", "#", "|", '#', stack, '|', mod_InfiMetals.arditeRod });
        ModLoader.addRecipe(new ItemStack(manyullynArditeSword), new Object[] 
                { "#", "#", "|", '#', stack, '|', mod_InfiMetals.manyullynRod });
        ModLoader.addRecipe(new ItemStack(uraniumArditeSword), new Object[] 
                { "#", "#", "|", '#', stack, '|', mod_InfiMetals.uraniumRod });
    }
    
    public static void addManyullynTools(ItemStack stack)
    {
        ModLoader.addRecipe(new ItemStack(stoneManyullynSword), new Object[] 
                { "#", "#", "|", '#', stack, '|', mod_InfiTools.stoneRod });
        ModLoader.addRecipe(new ItemStack(ironManyullynSword), new Object[] 
                { "#", "#", "|", '#', stack, '|', mod_InfiTools.ironRod });
        ModLoader.addRecipe(new ItemStack(diamondManyullynSword), new Object[] 
                { "#", "#", "|", '#', stack, '|', mod_InfiTools.diamondRod });
        ModLoader.addRecipe(new ItemStack(redstoneManyullynSword), new Object[] 
                { "#", "#", "|", '#', stack, '|', mod_InfiTools.redstoneRod });
        ModLoader.addRecipe(new ItemStack(obsidianManyullynSword), new Object[] 
                { "#", "#", "|", '#', stack, '|', mod_InfiTools.obsidianRod });
        ModLoader.addRecipe(new ItemStack(boneManyullynSword), new Object[] 
                { "#", "#", "|", '#', stack, '|', Item.bone });
        ModLoader.addRecipe(new ItemStack(boneManyullynSword), new Object[] 
                { "#", "#", "|", '#', stack, '|', mod_InfiTools.boneRod });
        ModLoader.addRecipe(new ItemStack(slimeManyullynSword), new Object[] 
                { "#", "#", "|", '#', stack, '|', mod_InfiTools.slimeRod });
        ModLoader.addRecipe(new ItemStack(cactusManyullynSword), new Object[] 
                { "#", "#", "|", '#', stack, '|', mod_InfiTools.cactusRod });
        ModLoader.addRecipe(new ItemStack(blazeManyullynSword), new Object[] 
                { "#", "#", "|", '#', stack, '|', Item.blazeRod });
        ModLoader.addRecipe(new ItemStack(copperManyullynSword), new Object[] 
                { "#", "#", "|", '#', stack, '|', mod_InfiMetals.copperRod });
        ModLoader.addRecipe(new ItemStack(bronzeManyullynSword), new Object[] 
                { "#", "#", "|", '#', stack, '|', mod_InfiMetals.bronzeRod });
        ModLoader.addRecipe(new ItemStack(workedManyullynSword), new Object[] 
                { "#", "#", "|", '#', stack, '|', mod_InfiMetals.workedIronRod });
        ModLoader.addRecipe(new ItemStack(steelManyullynSword), new Object[] 
                { "#", "#", "|", '#', stack, '|', mod_InfiMetals.steelRod });
        ModLoader.addRecipe(new ItemStack(cobaltManyullynSword), new Object[] 
                { "#", "#", "|", '#', stack, '|', mod_InfiMetals.cobaltRod });
        ModLoader.addRecipe(new ItemStack(arditeManyullynSword), new Object[] 
                { "#", "#", "|", '#', stack, '|', mod_InfiMetals.arditeRod });
        ModLoader.addRecipe(new ItemStack(manyullynManyullynSword), new Object[] 
                { "#", "#", "|", '#', stack, '|', mod_InfiMetals.manyullynRod });
        ModLoader.addRecipe(new ItemStack(uraniumManyullynSword), new Object[] 
                { "#", "#", "|", '#', stack, '|', mod_InfiMetals.uraniumRod });
    }
    
    public static void addUraniumTools(ItemStack stack)
    {
        ModLoader.addRecipe(new ItemStack(diamondUraniumSword), new Object[] 
                { "#", "#", "|", '#', stack, '|', mod_InfiTools.diamondRod });
        ModLoader.addRecipe(new ItemStack(redstoneUraniumSword), new Object[] 
                { "#", "#", "|", '#', stack, '|', mod_InfiTools.redstoneRod });
        ModLoader.addRecipe(new ItemStack(boneUraniumSword), new Object[] 
                { "#", "#", "|", '#', stack, '|', Item.bone });
        ModLoader.addRecipe(new ItemStack(boneUraniumSword), new Object[] 
                { "#", "#", "|", '#', stack, '|', mod_InfiTools.boneRod });
        ModLoader.addRecipe(new ItemStack(netherrackUraniumSword), new Object[] 
                { "#", "#", "|", '#', stack, '|', mod_InfiTools.netherrackRod });
        ModLoader.addRecipe(new ItemStack(glowstoneUraniumSword), new Object[] 
                { "#", "#", "|", '#', stack, '|', mod_InfiTools.glowstoneRod });
        ModLoader.addRecipe(new ItemStack(lavaUraniumSword), new Object[] 
                { "#", "#", "|", '#', stack, '|', mod_InfiTools.lavaRod });
        ModLoader.addRecipe(new ItemStack(blazeUraniumSword), new Object[] 
                { "#", "#", "|", '#', stack, '|', Item.blazeRod });
        ModLoader.addRecipe(new ItemStack(cobaltUraniumSword), new Object[] 
                { "#", "#", "|", '#', stack, '|', mod_InfiMetals.cobaltRod });
        ModLoader.addRecipe(new ItemStack(arditeUraniumSword), new Object[] 
                { "#", "#", "|", '#', stack, '|', mod_InfiMetals.arditeRod });
        ModLoader.addRecipe(new ItemStack(uraniumUraniumSword), new Object[] 
                { "#", "#", "|", '#', stack, '|', mod_InfiMetals.uraniumRod });
    }
    
    public static void addStoneTools(ItemStack stack)
    {
        ModLoader.addRecipe(new ItemStack(copperStoneSword), new Object[] 
                { "#", "#", "|", '#', stack, '|', mod_InfiMetals.copperRod });
    }
    
    public static void addRedstoneTools(ItemStack stack)
    {
        if(PropsHelperInfiMetals.enableRedstoneTools)
        {
            ModLoader.addRecipe(new ItemStack(copperRedstoneSword), new Object[] 
                    { "#", "#", "|", '#', stack, '|', mod_InfiMetals.copperRod });
            ModLoader.addRecipe(new ItemStack(bronzeRedstoneSword), new Object[] 
                    { "#", "#", "|", '#', stack, '|', mod_InfiMetals.bronzeRod });
            ModLoader.addRecipe(new ItemStack(workedRedstoneSword), new Object[] 
                    { "#", "#", "|", '#', stack, '|', mod_InfiMetals.workedIronRod });
        }
    }
    
    public static void addGlowstoneTools(ItemStack stack)
    {
        if(PropsHelperInfiMetals.enableGlowstoneTools)
        {
            ModLoader.addRecipe(new ItemStack(copperGlowstoneSword), new Object[] 
                    { "#", "#", "|", '#', stack, '|', mod_InfiMetals.copperRod });
            ModLoader.addRecipe(new ItemStack(bronzeGlowstoneSword), new Object[] 
                    { "#", "#", "|", '#', stack, '|', mod_InfiMetals.bronzeRod });
            ModLoader.addRecipe(new ItemStack(workedGlowstoneSword), new Object[] 
                    { "#", "#", "|", '#', stack, '|', mod_InfiMetals.workedIronRod });
            ModLoader.addRecipe(new ItemStack(steelGlowstoneSword), new Object[] 
                    { "#", "#", "|", '#', stack, '|', mod_InfiMetals.steelRod });
        }
    }
    
    public static void addLavaTools(ItemStack stack)
    {
        ModLoader.addRecipe(new ItemStack(cobaltLavaSword), new Object[] 
                { "#", "#", "|", '#', stack, '|', mod_InfiMetals.cobaltRod });
        ModLoader.addRecipe(new ItemStack(arditeLavaSword), new Object[] 
                { "#", "#", "|", '#', stack, '|', mod_InfiMetals.arditeRod });
        ModLoader.addRecipe(new ItemStack(manyullynLavaSword), new Object[] 
                { "#", "#", "|", '#', stack, '|', mod_InfiMetals.manyullynRod });
        ModLoader.addRecipe(new ItemStack(uraniumLavaSword), new Object[] 
                { "#", "#", "|", '#', stack, '|', mod_InfiMetals.uraniumRod });
    }
    
    public static void addSlimeTools(ItemStack stack)
    {
        ModLoader.addRecipe(new ItemStack(copperSlimeSword), new Object[] 
                { "#", "#", "|", '#', stack, '|', mod_InfiMetals.copperRod });
        ModLoader.addRecipe(new ItemStack(bronzeSlimeSword), new Object[] 
                { "#", "#", "|", '#', stack, '|', mod_InfiMetals.bronzeRod });
        ModLoader.addRecipe(new ItemStack(workedSlimeSword), new Object[] 
                { "#", "#", "|", '#', stack, '|', mod_InfiMetals.workedIronRod });
        ModLoader.addRecipe(new ItemStack(steelSlimeSword), new Object[] 
                { "#", "#", "|", '#', stack, '|', mod_InfiMetals.steelRod });
        ModLoader.addRecipe(new ItemStack(cobaltSlimeSword), new Object[] 
                { "#", "#", "|", '#', stack, '|', mod_InfiMetals.cobaltRod });
        ModLoader.addRecipe(new ItemStack(arditeSlimeSword), new Object[] 
                { "#", "#", "|", '#', stack, '|', mod_InfiMetals.arditeRod });
        ModLoader.addRecipe(new ItemStack(manyullynSlimeSword), new Object[] 
                { "#", "#", "|", '#', stack, '|', mod_InfiMetals.manyullynRod });
        ModLoader.addRecipe(new ItemStack(uraniumSlimeSword), new Object[] 
                { "#", "#", "|", '#', stack, '|', mod_InfiMetals.uraniumRod });
    }
    
    public static void addBlazeTools(ItemStack stack)
    {
        ModLoader.addRecipe(new ItemStack(cobaltBlazeSword), new Object[] 
                { "#", "#", "|", '#', stack, '|', mod_InfiMetals.cobaltRod });
        ModLoader.addRecipe(new ItemStack(arditeBlazeSword), new Object[] 
                { "#", "#", "|", '#', stack, '|', mod_InfiMetals.arditeRod });
        ModLoader.addRecipe(new ItemStack(manyullynBlazeSword), new Object[] 
                { "#", "#", "|", '#', stack, '|', mod_InfiMetals.manyullynRod });
        ModLoader.addRecipe(new ItemStack(uraniumBlazeSword), new Object[] 
                { "#", "#", "|", '#', stack, '|', mod_InfiMetals.uraniumRod });
    }
    
    public static Item stoneCopperSword;
    public static Item boneCopperSword;
    public static Item netherrackCopperSword;
    public static Item slimeCopperSword;
    public static Item cactusCopperSword;
    public static Item flintCopperSword;
    public static Item copperCopperSword;
    
    public static Item stoneBronzeSword;
    public static Item boneBronzeSword;
    public static Item netherrackBronzeSword;
    public static Item slimeBronzeSword;
    public static Item cactusBronzeSword;
    public static Item flintBronzeSword;
    public static Item copperBronzeSword;
    public static Item bronzeBronzeSword;
    
    public static Item stoneWorkedIronSword;
    public static Item ironWorkedIronSword;
    public static Item diamondWorkedIronSword;
    public static Item goldWorkedIronSword;
    public static Item redstoneWorkedIronSword;
    public static Item obsidianWorkedIronSword;
    public static Item boneWorkedIronSword;
    public static Item netherrackWorkedIronSword;
    public static Item glowstoneWorkedIronSword;
    public static Item iceWorkedIronSword;
    public static Item slimeWorkedIronSword;
    public static Item cactusWorkedIronSword;
    public static Item blazeWorkedIronSword;
    public static Item copperWorkedIronSword;
    public static Item bronzeWorkedIronSword;
    public static Item workedWorkedIronSword;
    public static Item steelWorkedIronSword;
    public static Item cobaltWorkedIronSword;
    public static Item arditeWorkedIronSword;
    public static Item uraniumWorkedIronSword;
    
    public static Item stoneSteelSword;
    public static Item ironSteelSword;
    public static Item diamondSteelSword;
    public static Item goldSteelSword;
    public static Item redstoneSteelSword;
    public static Item obsidianSteelSword;
    public static Item boneSteelSword;
    public static Item netherrackSteelSword;
    public static Item glowstoneSteelSword;
    public static Item iceSteelSword;
    public static Item slimeSteelSword;
    public static Item cactusSteelSword;
    public static Item blazeSteelSword;
    public static Item copperSteelSword;
    public static Item bronzeSteelSword;
    public static Item workedSteelSword;
    public static Item steelSteelSword;
    public static Item cobaltSteelSword;
    public static Item arditeSteelSword;
    public static Item uraniumSteelSword;
    
    public static Item stoneCobaltSword;
    public static Item ironCobaltSword;
    public static Item diamondCobaltSword;
    public static Item redstoneCobaltSword;
    public static Item obsidianCobaltSword;
    public static Item boneCobaltSword;
    public static Item slimeCobaltSword;
    public static Item cactusCobaltSword;
    public static Item blazeCobaltSword;
    public static Item copperCobaltSword;
    public static Item bronzeCobaltSword;
    public static Item workedCobaltSword;
    public static Item steelCobaltSword;
    public static Item cobaltCobaltSword;
    public static Item arditeCobaltSword;
    public static Item manyullynCobaltSword;
    public static Item uraniumCobaltSword;
    
    public static Item stoneArditeSword;
    public static Item ironArditeSword;
    public static Item diamondArditeSword;
    public static Item redstoneArditeSword;
    public static Item obsidianArditeSword;
    public static Item boneArditeSword;
    public static Item slimeArditeSword;
    public static Item cactusArditeSword;
    public static Item blazeArditeSword;
    public static Item copperArditeSword;
    public static Item bronzeArditeSword;
    public static Item workedArditeSword;
    public static Item steelArditeSword;
    public static Item cobaltArditeSword;
    public static Item arditeArditeSword;
    public static Item manyullynArditeSword;
    public static Item uraniumArditeSword;
    
    public static Item stoneManyullynSword;
    public static Item ironManyullynSword;
    public static Item diamondManyullynSword;
    public static Item redstoneManyullynSword;
    public static Item obsidianManyullynSword;
    public static Item boneManyullynSword;
    public static Item slimeManyullynSword;
    public static Item cactusManyullynSword;
    public static Item blazeManyullynSword;
    public static Item copperManyullynSword;
    public static Item bronzeManyullynSword;
    public static Item workedManyullynSword;
    public static Item steelManyullynSword;
    public static Item cobaltManyullynSword;
    public static Item arditeManyullynSword;
    public static Item manyullynManyullynSword;
    public static Item uraniumManyullynSword;
    
    public static Item diamondUraniumSword;
    public static Item redstoneUraniumSword;
    public static Item boneUraniumSword;
    public static Item netherrackUraniumSword;
    public static Item glowstoneUraniumSword;
    public static Item lavaUraniumSword;
    public static Item blazeUraniumSword;
    public static Item cobaltUraniumSword;
    public static Item arditeUraniumSword;
    public static Item uraniumUraniumSword;
    
    public static Item copperStoneSword;
    
    public static Item copperIronSword;
    public static Item bronzeIronSword;
    public static Item workedIronSword;
    
    public static Item copperDiamondSword;
    public static Item bronzeDiamondSword;
    public static Item workedDiamondSword;
    public static Item steelDiamondSword;
    public static Item cobaltDiamondSword;
    public static Item arditeDiamondSword;
    public static Item manyullynDiamondSword;
    public static Item uraniumDiamondSword;
    
    public static Item copperRedstoneSword;
    public static Item bronzeRedstoneSword;
    public static Item workedRedstoneSword;
    
    public static Item cobaltMossySword;
    public static Item arditeMossySword;
    public static Item manyullynMossySword;
    
    public static Item copperNetherrackSword;
    
    public static Item copperGlowstoneSword;
    public static Item bronzeGlowstoneSword;
    public static Item workedGlowstoneSword;
    public static Item steelGlowstoneSword;
    
    public static Item cobaltLavaSword;
    public static Item arditeLavaSword;
    public static Item manyullynLavaSword;
    public static Item uraniumLavaSword;
    
    public static Item copperSlimeSword;
    public static Item bronzeSlimeSword;
    public static Item workedSlimeSword;
    public static Item steelSlimeSword;
    public static Item cobaltSlimeSword;
    public static Item arditeSlimeSword;
    public static Item manyullynSlimeSword;
    public static Item uraniumSlimeSword;
    
    public static Item copperFlintSword;
    public static Item bronzeFlintSword;
    
    public static Item cobaltBlazeSword;
    public static Item arditeBlazeSword;
    public static Item manyullynBlazeSword;
    public static Item uraniumBlazeSword;
}
