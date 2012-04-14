package net.minecraft.src.metals;

import net.minecraft.src.InfiMaterialEnum;
import net.minecraft.src.Block;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;
import net.minecraft.src.ModLoader;
import net.minecraft.src.mod_InfiMetals;
import net.minecraft.src.mod_InfiTools;
import net.minecraft.src.forge.MinecraftForge;

public class MetalShovels 
{
    public static MetalShovels instance = new MetalShovels();
    
    public static MetalShovels getInstance()
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
            stoneCopperShovel = new MetalToolShovel(PropsHelperInfiMetals.copperShovelID+0, 
                    InfiMaterialEnum.Copper, InfiMaterialEnum.Stone, "stoneCopperShovel");
            boneCopperShovel = new MetalToolShovel(PropsHelperInfiMetals.copperShovelID+1, 
                    InfiMaterialEnum.Copper, InfiMaterialEnum.Bone, "boneCopperShovel");
            netherrackCopperShovel = new MetalToolShovel(PropsHelperInfiMetals.copperShovelID+2, 
                    InfiMaterialEnum.Copper, InfiMaterialEnum.Netherrack, "netherrackCopperShovel");
            slimeCopperShovel = new MetalToolShovel(PropsHelperInfiMetals.copperShovelID+3, 
                    InfiMaterialEnum.Copper, InfiMaterialEnum.Slime, "slimeCopperShovel");
            cactusCopperShovel = new MetalToolShovel(PropsHelperInfiMetals.copperShovelID+4, 
                    InfiMaterialEnum.Copper, InfiMaterialEnum.Cactus, "cactusCopperShovel");
            flintCopperShovel = new MetalToolShovel(PropsHelperInfiMetals.copperShovelID+5, 
                    InfiMaterialEnum.Copper, InfiMaterialEnum.Flint, "flintCopperShovel");
            copperCopperShovel = new MetalToolShovel(PropsHelperInfiMetals.copperShovelID+6, 
                    InfiMaterialEnum.Copper, InfiMaterialEnum.Copper, "copperCopperShovel");
            
        	MinecraftForge.setToolClass(stoneCopperShovel, "shovel", InfiMaterialEnum.Copper.getHarvestLevel());
            MinecraftForge.setToolClass(boneCopperShovel, "shovel", InfiMaterialEnum.Copper.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackCopperShovel, "shovel", InfiMaterialEnum.Copper.getHarvestLevel());
            MinecraftForge.setToolClass(slimeCopperShovel, "shovel", InfiMaterialEnum.Copper.getHarvestLevel());
            MinecraftForge.setToolClass(cactusCopperShovel, "shovel", InfiMaterialEnum.Copper.getHarvestLevel());
            MinecraftForge.setToolClass(flintCopperShovel, "shovel", InfiMaterialEnum.Copper.getHarvestLevel());
            MinecraftForge.setToolClass(copperCopperShovel, "shovel", InfiMaterialEnum.Copper.getHarvestLevel());
        }
        
        if(PropsHelperInfiMetals.enableBronzeTools)
        {
            stoneBronzeShovel = new MetalToolShovel(PropsHelperInfiMetals.bronzeShovelID+0, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Stone, "stoneBronzeShovel");
            boneBronzeShovel = new MetalToolShovel(PropsHelperInfiMetals.bronzeShovelID+1, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Bone, "boneBronzeShovel");
            netherrackBronzeShovel = new MetalToolShovel(PropsHelperInfiMetals.bronzeShovelID+2, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Netherrack, "netherrackBronzeShovel");
            slimeBronzeShovel = new MetalToolShovel(PropsHelperInfiMetals.bronzeShovelID+3, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Slime, "slimeBronzeShovel");
            cactusBronzeShovel = new MetalToolShovel(PropsHelperInfiMetals.bronzeShovelID+4, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Cactus, "cactusBronzeShovel");
            flintBronzeShovel = new MetalToolShovel(PropsHelperInfiMetals.bronzeShovelID+5, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Flint, "flintBronzeShovel");
            copperBronzeShovel = new MetalToolShovel(PropsHelperInfiMetals.bronzeShovelID+6, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Copper, "copperBronzeShovel");
            bronzeBronzeShovel = new MetalToolShovel(PropsHelperInfiMetals.bronzeShovelID+7, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Bronze, "copperBronzeShovel");
            
            MinecraftForge.setToolClass(stoneBronzeShovel, "shovel", InfiMaterialEnum.Bronze.getHarvestLevel());
            MinecraftForge.setToolClass(boneBronzeShovel, "shovel", InfiMaterialEnum.Bronze.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackBronzeShovel, "shovel", InfiMaterialEnum.Bronze.getHarvestLevel());
            MinecraftForge.setToolClass(slimeBronzeShovel, "shovel", InfiMaterialEnum.Bronze.getHarvestLevel());
            MinecraftForge.setToolClass(cactusBronzeShovel, "shovel", InfiMaterialEnum.Bronze.getHarvestLevel());
            MinecraftForge.setToolClass(flintBronzeShovel, "shovel", InfiMaterialEnum.Bronze.getHarvestLevel());
            MinecraftForge.setToolClass(copperBronzeShovel, "shovel", InfiMaterialEnum.Bronze.getHarvestLevel());
            MinecraftForge.setToolClass(bronzeBronzeShovel, "shovel", InfiMaterialEnum.Bronze.getHarvestLevel());
        }
        
        if(PropsHelperInfiMetals.enableWorkedIronTools)
        {
            stoneWorkedIronShovel = new MetalToolShovel(PropsHelperInfiMetals.workedIronShovelID+0, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Stone, "stoneWorkedIronShovel");
            ironWorkedIronShovel = new MetalToolShovel(PropsHelperInfiMetals.workedIronShovelID+1, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Iron, "ironWorkedIronShovel");
            diamondWorkedIronShovel = new MetalToolShovel(PropsHelperInfiMetals.workedIronShovelID+2, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Diamond, "diamondWorkedIronShovel");
            goldWorkedIronShovel = new MetalToolShovel(PropsHelperInfiMetals.workedIronShovelID+3, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Gold, "goldWorkedIronShovel");
            redstoneWorkedIronShovel = new MetalToolShovel(PropsHelperInfiMetals.workedIronShovelID+4, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Redstone, "redstoneWorkedIronShovel");
            obsidianWorkedIronShovel = new MetalToolShovel(PropsHelperInfiMetals.workedIronShovelID+5, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Obsidian, "obsidianWorkedIronShovel");
            boneWorkedIronShovel = new MetalToolShovel(PropsHelperInfiMetals.workedIronShovelID+6, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Bone, "boneWorkedIronShovel");
            netherrackWorkedIronShovel = new MetalToolShovel(PropsHelperInfiMetals.workedIronShovelID+7, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Netherrack, "netherrackWorkedIronShovel");
            glowstoneWorkedIronShovel = new MetalToolShovel(PropsHelperInfiMetals.workedIronShovelID+8, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Glowstone, "glowstoneWorkedIronShovel");
            iceWorkedIronShovel = new MetalToolShovel(PropsHelperInfiMetals.workedIronShovelID+9, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Ice, "iceWorkedIronShovel");
            slimeWorkedIronShovel = new MetalToolShovel(PropsHelperInfiMetals.workedIronShovelID+10, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Slime, "slimeWorkedIronShovel");
            cactusWorkedIronShovel = new MetalToolShovel(PropsHelperInfiMetals.workedIronShovelID+11, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Cactus, "cactusWorkedIronShovel");
            blazeWorkedIronShovel = new MetalToolShovel(PropsHelperInfiMetals.workedIronShovelID+12, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Blaze, "blazeWorkedIronShovel");
            copperWorkedIronShovel = new MetalToolShovel(PropsHelperInfiMetals.workedIronShovelID+13, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Copper, "copperWorkedIronShovel");
            bronzeWorkedIronShovel = new MetalToolShovel(PropsHelperInfiMetals.workedIronShovelID+14, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Bronze, "bronzeWorkedIronShovel");
            workedWorkedIronShovel = new MetalToolShovel(PropsHelperInfiMetals.workedIronShovelID+15, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.WorkedIron, "workedWorkedIronShovel");
            steelWorkedIronShovel = new MetalToolShovel(PropsHelperInfiMetals.workedIronShovelID+16, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Steel, "steelWorkedIronShovel");
            cobaltWorkedIronShovel = new MetalToolShovel(PropsHelperInfiMetals.workedIronShovelID+17, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Cobalt, "cobaltWorkedIronShovel");
            arditeWorkedIronShovel = new MetalToolShovel(PropsHelperInfiMetals.workedIronShovelID+18, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Ardite, "arditeWorkedIronShovel");
            uraniumWorkedIronShovel = new MetalToolShovel(PropsHelperInfiMetals.workedIronShovelID+19, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Bronze, "uraniumWorkedIronShovel");
            
            MinecraftForge.setToolClass(stoneWorkedIronShovel, "shovel", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(ironWorkedIronShovel, "shovel", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(diamondWorkedIronShovel, "shovel", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(goldWorkedIronShovel, "shovel", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(redstoneWorkedIronShovel, "shovel", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(obsidianWorkedIronShovel, "shovel", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(boneWorkedIronShovel, "shovel", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackWorkedIronShovel, "shovel", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(glowstoneWorkedIronShovel, "shovel", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(iceWorkedIronShovel, "shovel", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(slimeWorkedIronShovel, "shovel", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(cactusWorkedIronShovel, "shovel", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(blazeWorkedIronShovel, "shovel", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(copperWorkedIronShovel, "shovel", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(bronzeWorkedIronShovel, "shovel", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(workedWorkedIronShovel, "shovel", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(steelWorkedIronShovel, "shovel", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(cobaltWorkedIronShovel, "shovel", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(arditeWorkedIronShovel, "shovel", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(uraniumWorkedIronShovel, "shovel", InfiMaterialEnum.WorkedIron.getHarvestLevel());
        }
        
        if(PropsHelperInfiMetals.enableSteelTools)
        {
            stoneSteelShovel = new MetalToolShovel(PropsHelperInfiMetals.steelShovelID+0, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Stone, "stoneSteelShovel");
            ironSteelShovel = new MetalToolShovel(PropsHelperInfiMetals.steelShovelID+1, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Iron, "ironSteelShovel");
            diamondSteelShovel = new MetalToolShovel(PropsHelperInfiMetals.steelShovelID+2, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Diamond, "diamondSteelShovel");
            goldSteelShovel = new MetalToolShovel(PropsHelperInfiMetals.steelShovelID+3, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Gold, "goldSteelShovel");
            redstoneSteelShovel = new MetalToolShovel(PropsHelperInfiMetals.steelShovelID+4, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Redstone, "redstoneSteelShovel");
            obsidianSteelShovel = new MetalToolShovel(PropsHelperInfiMetals.steelShovelID+5, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Obsidian, "obsidianSteelShovel");
            boneSteelShovel = new MetalToolShovel(PropsHelperInfiMetals.steelShovelID+6, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Bone, "boneSteelShovel");
            netherrackSteelShovel = new MetalToolShovel(PropsHelperInfiMetals.steelShovelID+7, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Netherrack, "netherrackSteelShovel");
            glowstoneSteelShovel = new MetalToolShovel(PropsHelperInfiMetals.steelShovelID+8, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Glowstone, "glowstoneSteelShovel");
            iceSteelShovel = new MetalToolShovel(PropsHelperInfiMetals.steelShovelID+9, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Ice, "iceSteelShovel");
            slimeSteelShovel = new MetalToolShovel(PropsHelperInfiMetals.steelShovelID+10, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Slime, "slimeSteelShovel");
            cactusSteelShovel = new MetalToolShovel(PropsHelperInfiMetals.steelShovelID+11, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Cactus, "cactusSteelShovel");
            blazeSteelShovel = new MetalToolShovel(PropsHelperInfiMetals.steelShovelID+12, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Blaze, "blazeSteelShovel");
            copperSteelShovel = new MetalToolShovel(PropsHelperInfiMetals.steelShovelID+13, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Copper, "copperSteelShovel");
            bronzeSteelShovel = new MetalToolShovel(PropsHelperInfiMetals.steelShovelID+14, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Bronze, "bronzeSteelShovel");
            workedSteelShovel = new MetalToolShovel(PropsHelperInfiMetals.steelShovelID+15, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.WorkedIron, "workedSteelShovel");
            steelSteelShovel = new MetalToolShovel(PropsHelperInfiMetals.steelShovelID+16, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Steel, "steelSteelShovel");
            cobaltSteelShovel = new MetalToolShovel(PropsHelperInfiMetals.steelShovelID+17, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Cobalt, "cobaltSteelShovel");
            arditeSteelShovel = new MetalToolShovel(PropsHelperInfiMetals.steelShovelID+18, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Ardite, "arditeSteelShovel");
            uraniumSteelShovel = new MetalToolShovel(PropsHelperInfiMetals.steelShovelID+19, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Bronze, "uraniumSteelShovel");

            MinecraftForge.setToolClass(stoneSteelShovel, "shovel", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(ironSteelShovel, "shovel", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(diamondSteelShovel, "shovel", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(goldSteelShovel, "shovel", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(redstoneSteelShovel, "shovel", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(obsidianSteelShovel, "shovel", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(boneSteelShovel, "shovel", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackSteelShovel, "shovel", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(glowstoneSteelShovel, "shovel", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(iceSteelShovel, "shovel", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(slimeSteelShovel, "shovel", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(cactusSteelShovel, "shovel", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(blazeSteelShovel, "shovel", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(copperSteelShovel, "shovel", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(bronzeSteelShovel, "shovel", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(workedSteelShovel, "shovel", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(steelSteelShovel, "shovel", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(cobaltSteelShovel, "shovel", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(arditeSteelShovel, "shovel", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(uraniumSteelShovel, "shovel", InfiMaterialEnum.Steel.getHarvestLevel());
        }
        
        if(PropsHelperInfiMetals.enableCobaltTools)
        {
            stoneCobaltShovel = new MetalToolShovel(PropsHelperInfiMetals.cobaltShovelID+0, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Stone, "stoneCobaltShovel");
            ironCobaltShovel = new MetalToolShovel(PropsHelperInfiMetals.cobaltShovelID+1, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Iron, "ironCobaltShovel");
            diamondCobaltShovel = new MetalToolShovel(PropsHelperInfiMetals.cobaltShovelID+2,
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Gold, "goldCobaltShovel");
            redstoneCobaltShovel = new MetalToolShovel(PropsHelperInfiMetals.cobaltShovelID+4, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Redstone, "redstoneCobaltShovel");
            obsidianCobaltShovel = new MetalToolShovel(PropsHelperInfiMetals.cobaltShovelID+5, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Obsidian, "obsidianCobaltShovel");
            boneCobaltShovel = new MetalToolShovel(PropsHelperInfiMetals.cobaltShovelID+6, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Bone, "boneCobaltShovel");
            slimeCobaltShovel = new MetalToolShovel(PropsHelperInfiMetals.cobaltShovelID+7, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Slime, "slimeCobaltShovel");
            cactusCobaltShovel = new MetalToolShovel(PropsHelperInfiMetals.cobaltShovelID+8, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Cactus, "cactusCobaltShovel");
            blazeCobaltShovel = new MetalToolShovel(PropsHelperInfiMetals.cobaltShovelID+9, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Blaze, "blazeCobaltShovel");
            copperCobaltShovel = new MetalToolShovel(PropsHelperInfiMetals.cobaltShovelID+10, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Copper, "copperCobaltShovel");
            bronzeCobaltShovel = new MetalToolShovel(PropsHelperInfiMetals.cobaltShovelID+11, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Bronze, "bronzeCobaltShovel");
            workedCobaltShovel = new MetalToolShovel(PropsHelperInfiMetals.cobaltShovelID+12, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.WorkedIron, "workedCobaltShovel");
            steelCobaltShovel = new MetalToolShovel(PropsHelperInfiMetals.cobaltShovelID+13, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Steel, "steelCobaltShovel");
            cobaltCobaltShovel = new MetalToolShovel(PropsHelperInfiMetals.cobaltShovelID+14, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Cobalt, "cobaltCobaltShovel");
            arditeCobaltShovel = new MetalToolShovel(PropsHelperInfiMetals.cobaltShovelID+15, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Ardite, "arditeCobaltShovel");
            manyullynCobaltShovel = new MetalToolShovel(PropsHelperInfiMetals.cobaltShovelID+16, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Manyullyn, "arditeCobaltShovel");
            uraniumCobaltShovel = new MetalToolShovel(PropsHelperInfiMetals.cobaltShovelID+17, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Bronze, "uraniumCobaltShovel");
            
            MinecraftForge.setToolClass(stoneCobaltShovel, "shovel", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(ironCobaltShovel, "shovel", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(diamondCobaltShovel, "shovel", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(redstoneCobaltShovel, "shovel", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(obsidianCobaltShovel, "shovel", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(boneCobaltShovel, "shovel", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(slimeCobaltShovel, "shovel", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(cactusCobaltShovel, "shovel", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(blazeCobaltShovel, "shovel", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(copperCobaltShovel, "shovel", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(bronzeCobaltShovel, "shovel", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(workedCobaltShovel, "shovel", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(steelCobaltShovel, "shovel", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(cobaltCobaltShovel, "shovel", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(arditeCobaltShovel, "shovel", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(manyullynCobaltShovel, "shovel", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(uraniumCobaltShovel, "shovel", InfiMaterialEnum.Cobalt.getHarvestLevel());
        }
        
        if(PropsHelperInfiMetals.enableArditeTools)
        {
            stoneArditeShovel = new MetalToolShovel(PropsHelperInfiMetals.arditeShovelID+0, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Stone, "stoneArditeShovel");
            ironArditeShovel = new MetalToolShovel(PropsHelperInfiMetals.arditeShovelID+1, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Iron, "ironArditeShovel");
            diamondArditeShovel = new MetalToolShovel(PropsHelperInfiMetals.arditeShovelID+2,
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Gold, "goldArditeShovel");
            redstoneArditeShovel = new MetalToolShovel(PropsHelperInfiMetals.arditeShovelID+4, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Redstone, "redstoneArditeShovel");
            obsidianArditeShovel = new MetalToolShovel(PropsHelperInfiMetals.arditeShovelID+5, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Obsidian, "obsidianArditeShovel");
            boneArditeShovel = new MetalToolShovel(PropsHelperInfiMetals.arditeShovelID+6, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Bone, "boneArditeShovel");
            slimeArditeShovel = new MetalToolShovel(PropsHelperInfiMetals.arditeShovelID+7, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Slime, "slimeArditeShovel");
            cactusArditeShovel = new MetalToolShovel(PropsHelperInfiMetals.arditeShovelID+8, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Cactus, "cactusArditeShovel");
            blazeArditeShovel = new MetalToolShovel(PropsHelperInfiMetals.arditeShovelID+9, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Blaze, "blazeArditeShovel");
            copperArditeShovel = new MetalToolShovel(PropsHelperInfiMetals.arditeShovelID+10, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Copper, "copperArditeShovel");
            bronzeArditeShovel = new MetalToolShovel(PropsHelperInfiMetals.arditeShovelID+11, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Bronze, "bronzeArditeShovel");
            workedArditeShovel = new MetalToolShovel(PropsHelperInfiMetals.arditeShovelID+12, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.WorkedIron, "workedArditeShovel");
            steelArditeShovel = new MetalToolShovel(PropsHelperInfiMetals.arditeShovelID+13, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Steel, "steelArditeShovel");
            cobaltArditeShovel = new MetalToolShovel(PropsHelperInfiMetals.arditeShovelID+14, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Cobalt, "cobaltArditeShovel");
            arditeArditeShovel = new MetalToolShovel(PropsHelperInfiMetals.arditeShovelID+15, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Ardite, "arditeArditeShovel");
            manyullynArditeShovel = new MetalToolShovel(PropsHelperInfiMetals.arditeShovelID+16, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Manyullyn, "arditeArditeShovel");
            uraniumArditeShovel = new MetalToolShovel(PropsHelperInfiMetals.arditeShovelID+17, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Bronze, "uraniumArditeShovel");
            
            MinecraftForge.setToolClass(stoneArditeShovel, "shovel", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(ironArditeShovel, "shovel", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(diamondArditeShovel, "shovel", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(redstoneArditeShovel, "shovel", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(obsidianArditeShovel, "shovel", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(boneArditeShovel, "shovel", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(slimeArditeShovel, "shovel", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(cactusArditeShovel, "shovel", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(blazeArditeShovel, "shovel", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(copperArditeShovel, "shovel", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(bronzeArditeShovel, "shovel", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(workedArditeShovel, "shovel", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(steelArditeShovel, "shovel", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(cobaltArditeShovel, "shovel", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(arditeArditeShovel, "shovel", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(manyullynArditeShovel, "shovel", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(uraniumArditeShovel, "shovel", InfiMaterialEnum.Ardite.getHarvestLevel());
        }
        
        if(PropsHelperInfiMetals.enableManyullynTools)
        {
            stoneManyullynShovel = new MetalToolShovel(PropsHelperInfiMetals.manyullynShovelID+0, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Stone, "stoneManyullynShovel");
            ironManyullynShovel = new MetalToolShovel(PropsHelperInfiMetals.manyullynShovelID+1, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Iron, "ironManyullynShovel");
            diamondManyullynShovel = new MetalToolShovel(PropsHelperInfiMetals.manyullynShovelID+2,
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Gold, "goldManyullynShovel");
            redstoneManyullynShovel = new MetalToolShovel(PropsHelperInfiMetals.manyullynShovelID+4, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Redstone, "redstoneManyullynShovel");
            obsidianManyullynShovel = new MetalToolShovel(PropsHelperInfiMetals.manyullynShovelID+5, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Obsidian, "obsidianManyullynShovel");
            boneManyullynShovel = new MetalToolShovel(PropsHelperInfiMetals.manyullynShovelID+6, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Bone, "boneManyullynShovel");
            slimeManyullynShovel = new MetalToolShovel(PropsHelperInfiMetals.manyullynShovelID+7, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Slime, "slimeManyullynShovel");
            cactusManyullynShovel = new MetalToolShovel(PropsHelperInfiMetals.manyullynShovelID+8, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Cactus, "cactusManyullynShovel");
            blazeManyullynShovel = new MetalToolShovel(PropsHelperInfiMetals.manyullynShovelID+9, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Blaze, "blazeManyullynShovel");
            copperManyullynShovel = new MetalToolShovel(PropsHelperInfiMetals.manyullynShovelID+10, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Copper, "copperManyullynShovel");
            bronzeManyullynShovel = new MetalToolShovel(PropsHelperInfiMetals.manyullynShovelID+11, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Bronze, "bronzeManyullynShovel");
            workedManyullynShovel = new MetalToolShovel(PropsHelperInfiMetals.manyullynShovelID+12, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.WorkedIron, "workedManyullynShovel");
            steelManyullynShovel = new MetalToolShovel(PropsHelperInfiMetals.manyullynShovelID+13, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Steel, "steelManyullynShovel");
            cobaltManyullynShovel = new MetalToolShovel(PropsHelperInfiMetals.manyullynShovelID+14, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Cobalt, "cobaltManyullynShovel");
            arditeManyullynShovel = new MetalToolShovel(PropsHelperInfiMetals.manyullynShovelID+15, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Ardite, "arditeManyullynShovel");
            manyullynManyullynShovel = new MetalToolShovel(PropsHelperInfiMetals.manyullynShovelID+16, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Manyullyn, "arditeManyullynShovel");
            uraniumManyullynShovel = new MetalToolShovel(PropsHelperInfiMetals.manyullynShovelID+17,
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Bronze, "uraniumManyullynShovel");
            
            MinecraftForge.setToolClass(stoneManyullynShovel, "shovel", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(ironManyullynShovel, "shovel", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(diamondManyullynShovel, "shovel", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(redstoneManyullynShovel, "shovel", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(obsidianManyullynShovel, "shovel", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(boneManyullynShovel, "shovel", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(slimeManyullynShovel, "shovel", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(cactusManyullynShovel, "shovel", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(blazeManyullynShovel, "shovel", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(copperManyullynShovel, "shovel", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(bronzeManyullynShovel, "shovel", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(workedManyullynShovel, "shovel", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(steelManyullynShovel, "shovel", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(cobaltManyullynShovel, "shovel", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(arditeManyullynShovel, "shovel", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(manyullynManyullynShovel, "shovel", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(uraniumManyullynShovel, "shovel", InfiMaterialEnum.Manyullyn.getHarvestLevel());
        }
        
        if(PropsHelperInfiMetals.enableUraniumTools)
        {
            diamondUraniumShovel = new MetalToolShovel(PropsHelperInfiMetals.uraniumShovelID+0, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Diamond, "diamondUraniumShovel");
            redstoneUraniumShovel = new MetalToolShovel(PropsHelperInfiMetals.uraniumShovelID+1, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Redstone, "redstoneUraniumShovel");
            boneUraniumShovel = new MetalToolShovel(PropsHelperInfiMetals.uraniumShovelID+2, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Bone, "boneUraniumShovel");
            netherrackUraniumShovel = new MetalToolShovel(PropsHelperInfiMetals.uraniumShovelID+3, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Netherrack, "netherrackUraniumShovel");
            glowstoneUraniumShovel = new MetalToolShovel(PropsHelperInfiMetals.uraniumShovelID+4, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Glowstone, "glowstoneUraniumShovel");
            lavaUraniumShovel = new MetalToolShovel(PropsHelperInfiMetals.uraniumShovelID+5, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Lava, "lavaUraniumShovel");
            blazeUraniumShovel = new MetalToolShovel(PropsHelperInfiMetals.uraniumShovelID+6, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Blaze, "blazeUraniumShovel");
            cobaltUraniumShovel = new MetalToolShovel(PropsHelperInfiMetals.uraniumShovelID+7, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Cobalt, "cobaltUraniumShovel");
            arditeUraniumShovel = new MetalToolShovel(PropsHelperInfiMetals.uraniumShovelID+8, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Ardite, "arditeUraniumShovel");
            uraniumUraniumShovel = new MetalToolShovel(PropsHelperInfiMetals.uraniumShovelID+9, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Uranium, "uraniumUraniumShovel");
            
            MinecraftForge.setToolClass(diamondUraniumShovel, "shovel", InfiMaterialEnum.Uranium.getHarvestLevel());
            MinecraftForge.setToolClass(redstoneUraniumShovel, "shovel", InfiMaterialEnum.Uranium.getHarvestLevel());
            MinecraftForge.setToolClass(boneUraniumShovel, "shovel", InfiMaterialEnum.Uranium.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackUraniumShovel, "shovel", InfiMaterialEnum.Uranium.getHarvestLevel());
            MinecraftForge.setToolClass(glowstoneUraniumShovel, "shovel", InfiMaterialEnum.Uranium.getHarvestLevel());
            MinecraftForge.setToolClass(lavaUraniumShovel, "shovel", InfiMaterialEnum.Uranium.getHarvestLevel());
            MinecraftForge.setToolClass(blazeUraniumShovel, "shovel", InfiMaterialEnum.Uranium.getHarvestLevel());
            MinecraftForge.setToolClass(cobaltUraniumShovel, "shovel", InfiMaterialEnum.Uranium.getHarvestLevel());
            MinecraftForge.setToolClass(arditeUraniumShovel, "shovel", InfiMaterialEnum.Uranium.getHarvestLevel());
            MinecraftForge.setToolClass(uraniumUraniumShovel, "shovel", InfiMaterialEnum.Uranium.getHarvestLevel());
        }
        
        if(PropsHelperInfiMetals.enableStoneTools)
        {
            copperStoneShovel = new MetalToolShovel(PropsHelperInfiMetals.stoneShovelID+0, 
                    InfiMaterialEnum.Stone, InfiMaterialEnum.Copper, "copperStoneShovel");
            
            MinecraftForge.setToolClass(copperStoneShovel, "shovel", InfiMaterialEnum.Stone.getHarvestLevel());
        }
        
        if(PropsHelperInfiMetals.enableIronTools)
        {
            copperIronShovel = new MetalToolShovel(PropsHelperInfiMetals.ironShovelID+0, 
                    InfiMaterialEnum.Iron, InfiMaterialEnum.Copper, "copperIronShovel");
            bronzeIronShovel = new MetalToolShovel(PropsHelperInfiMetals.ironShovelID+1, 
                    InfiMaterialEnum.Iron, InfiMaterialEnum.Bronze, "bronzeIronShovel");
            workedIronShovel = new MetalToolShovel(PropsHelperInfiMetals.ironShovelID+2, 
                    InfiMaterialEnum.Iron, InfiMaterialEnum.WorkedIron, "workedIronShovel");
            
            MinecraftForge.setToolClass(copperIronShovel, "shovel", InfiMaterialEnum.Iron.getHarvestLevel());
            MinecraftForge.setToolClass(bronzeIronShovel, "shovel", InfiMaterialEnum.Iron.getHarvestLevel());
            MinecraftForge.setToolClass(workedIronShovel, "shovel", InfiMaterialEnum.Iron.getHarvestLevel());
        }
        
        if(PropsHelperInfiMetals.enableDiamondTools)
        {
            copperDiamondShovel = new MetalToolShovel(PropsHelperInfiMetals.diamondShovelID+0, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Copper, "copperDiamondShovel");
            bronzeDiamondShovel = new MetalToolShovel(PropsHelperInfiMetals.diamondShovelID+1, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Bronze, "bronzeDiamondShovel");
            workedDiamondShovel = new MetalToolShovel(PropsHelperInfiMetals.diamondShovelID+2, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.WorkedIron, "workedDiamondShovel");
            steelDiamondShovel = new MetalToolShovel(PropsHelperInfiMetals.diamondShovelID+3, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Steel, "steelDiamondShovel");
            cobaltDiamondShovel = new MetalToolShovel(PropsHelperInfiMetals.diamondShovelID+4, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Cobalt, "cobaltDiamondShovel");
            arditeDiamondShovel = new MetalToolShovel(PropsHelperInfiMetals.diamondShovelID+5, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Ardite, "arditeDiamondShovel");
            manyullynDiamondShovel = new MetalToolShovel(PropsHelperInfiMetals.diamondShovelID+6, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Manyullyn, "manyullynDiamondShovel");
            uraniumDiamondShovel = new MetalToolShovel(PropsHelperInfiMetals.diamondShovelID+7, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Uranium, "uraniumDiamondShovel");
            
            MinecraftForge.setToolClass(copperDiamondShovel, "shovel", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(bronzeDiamondShovel, "shovel", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(workedDiamondShovel, "shovel", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(steelDiamondShovel, "shovel", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(cobaltDiamondShovel, "shovel", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(arditeDiamondShovel, "shovel", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(manyullynDiamondShovel, "shovel", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(uraniumDiamondShovel, "shovel", InfiMaterialEnum.Diamond.getHarvestLevel());
        }
        
        if(PropsHelperInfiMetals.enableRedstoneTools)
        {
            copperRedstoneShovel = new MetalToolShovel(PropsHelperInfiMetals.redstoneShovelID+0, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Copper, "copperRedstoneShovel");
            bronzeRedstoneShovel = new MetalToolShovel(PropsHelperInfiMetals.redstoneShovelID+1, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Bronze, "bronzeRedstoneShovel");
            workedRedstoneShovel = new MetalToolShovel(PropsHelperInfiMetals.redstoneShovelID+2, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.WorkedIron, "workedRedstoneShovel");
            
            MinecraftForge.setToolClass(copperRedstoneShovel, "shovel", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(bronzeRedstoneShovel, "shovel", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(workedRedstoneShovel, "shovel", InfiMaterialEnum.Redstone.getHarvestLevel());
        }
        
        if(PropsHelperInfiMetals.enableMossyTools)
        {
            cobaltMossyShovel = new MetalToolShovel(PropsHelperInfiMetals.mossyShovelID+0, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Cobalt, "cobaltMossyShovel");
            arditeMossyShovel = new MetalToolShovel(PropsHelperInfiMetals.mossyShovelID+1, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Ardite, "arditeMossyShovel");
            manyullynMossyShovel = new MetalToolShovel(PropsHelperInfiMetals.mossyShovelID+2, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Manyullyn, "manyullynMossyShovel");
            
            MinecraftForge.setToolClass(cobaltMossyShovel, "shovel", InfiMaterialEnum.Mossy.getHarvestLevel());
            MinecraftForge.setToolClass(arditeMossyShovel, "shovel", InfiMaterialEnum.Mossy.getHarvestLevel());
            MinecraftForge.setToolClass(manyullynMossyShovel, "shovel", InfiMaterialEnum.Mossy.getHarvestLevel());
        }
        
        if(PropsHelperInfiMetals.enableNetherrackTools)
        {
            copperNetherrackShovel = new MetalToolShovel(PropsHelperInfiMetals.netherrackShovelID+0, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Copper, "copperNetherrackShovel");
            
            MinecraftForge.setToolClass(copperNetherrackShovel, "shovel", InfiMaterialEnum.Netherrack.getHarvestLevel());
        }
        
        if(PropsHelperInfiMetals.enableGlowstoneTools)
        {
            copperGlowstoneShovel = new MetalToolShovel(PropsHelperInfiMetals.glowstoneShovelID+0, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Copper, "copperGlowstoneShovel");
            bronzeGlowstoneShovel = new MetalToolShovel(PropsHelperInfiMetals.glowstoneShovelID+1, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Bronze, "bronzeGlowstoneShovel");
            workedGlowstoneShovel = new MetalToolShovel(PropsHelperInfiMetals.glowstoneShovelID+2, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.WorkedIron, "workedGlowstoneShovel");
            steelGlowstoneShovel = new MetalToolShovel(PropsHelperInfiMetals.glowstoneShovelID+3, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Steel, "steelGlowstoneShovel");
            
            MinecraftForge.setToolClass(copperGlowstoneShovel, "shovel", InfiMaterialEnum.Glowstone.getHarvestLevel());
            MinecraftForge.setToolClass(bronzeGlowstoneShovel, "shovel", InfiMaterialEnum.Glowstone.getHarvestLevel());
            MinecraftForge.setToolClass(workedGlowstoneShovel, "shovel", InfiMaterialEnum.Glowstone.getHarvestLevel());
            MinecraftForge.setToolClass(steelGlowstoneShovel, "shovel", InfiMaterialEnum.Glowstone.getHarvestLevel());
        }
        
        if(PropsHelperInfiMetals.enableLavaTools)
        {
            cobaltLavaShovel = new MetalToolShovel(PropsHelperInfiMetals.lavaShovelID+0, 
                    InfiMaterialEnum.Lava, InfiMaterialEnum.Cobalt, "cobaltLavaShovel");
            arditeLavaShovel = new MetalToolShovel(PropsHelperInfiMetals.lavaShovelID+1, 
                    InfiMaterialEnum.Lava, InfiMaterialEnum.Ardite, "arditeLavaShovel");
            manyullynLavaShovel = new MetalToolShovel(PropsHelperInfiMetals.lavaShovelID+2, 
                    InfiMaterialEnum.Lava, InfiMaterialEnum.Manyullyn, "manyullynLavaShovel");
            uraniumLavaShovel = new MetalToolShovel(PropsHelperInfiMetals.lavaShovelID+3, 
                    InfiMaterialEnum.Lava, InfiMaterialEnum.Uranium, "uraniumLavaShovel");
            
            MinecraftForge.setToolClass(cobaltLavaShovel, "shovel", InfiMaterialEnum.Lava.getHarvestLevel());
            MinecraftForge.setToolClass(arditeLavaShovel, "shovel", InfiMaterialEnum.Lava.getHarvestLevel());
            MinecraftForge.setToolClass(manyullynLavaShovel, "shovel", InfiMaterialEnum.Lava.getHarvestLevel());
            MinecraftForge.setToolClass(uraniumLavaShovel, "shovel", InfiMaterialEnum.Lava.getHarvestLevel());
        }
        
        if(PropsHelperInfiMetals.enableSlimeTools)
        {
            copperSlimeShovel = new MetalToolShovel(PropsHelperInfiMetals.slimeShovelID+0, 
                    InfiMaterialEnum.Slime, InfiMaterialEnum.Copper, "copperSlimeShovel");
            bronzeSlimeShovel = new MetalToolShovel(PropsHelperInfiMetals.slimeShovelID+1, 
                    InfiMaterialEnum.Slime, InfiMaterialEnum.Bronze, "bronzeSlimeShovel");
            workedSlimeShovel = new MetalToolShovel(PropsHelperInfiMetals.slimeShovelID+2, 
                    InfiMaterialEnum.Slime, InfiMaterialEnum.WorkedIron, "workedSlimeShovel");
            steelSlimeShovel = new MetalToolShovel(PropsHelperInfiMetals.slimeShovelID+3, 
                    InfiMaterialEnum.Slime, InfiMaterialEnum.Steel, "steelSlimeShovel");
            cobaltSlimeShovel = new MetalToolShovel(PropsHelperInfiMetals.slimeShovelID+4, 
                    InfiMaterialEnum.Slime, InfiMaterialEnum.Cobalt, "cobaltSlimeShovel");
            arditeSlimeShovel = new MetalToolShovel(PropsHelperInfiMetals.slimeShovelID+5, 
                    InfiMaterialEnum.Slime, InfiMaterialEnum.Ardite, "arditeSlimeShovel");
            manyullynSlimeShovel = new MetalToolShovel(PropsHelperInfiMetals.slimeShovelID+6, 
                    InfiMaterialEnum.Slime, InfiMaterialEnum.Manyullyn, "manyullynSlimeShovel");
            uraniumSlimeShovel = new MetalToolShovel(PropsHelperInfiMetals.slimeShovelID+7, 
                    InfiMaterialEnum.Slime, InfiMaterialEnum.Uranium, "uraniumSlimeShovel");
            
            MinecraftForge.setToolClass(copperSlimeShovel, "shovel", InfiMaterialEnum.Slime.getHarvestLevel());
            MinecraftForge.setToolClass(bronzeSlimeShovel, "shovel", InfiMaterialEnum.Slime.getHarvestLevel());
            MinecraftForge.setToolClass(workedSlimeShovel, "shovel", InfiMaterialEnum.Slime.getHarvestLevel());
            MinecraftForge.setToolClass(steelSlimeShovel, "shovel", InfiMaterialEnum.Slime.getHarvestLevel());
            MinecraftForge.setToolClass(cobaltSlimeShovel, "shovel", InfiMaterialEnum.Slime.getHarvestLevel());
            MinecraftForge.setToolClass(arditeSlimeShovel, "shovel", InfiMaterialEnum.Slime.getHarvestLevel());
            MinecraftForge.setToolClass(manyullynSlimeShovel, "shovel", InfiMaterialEnum.Slime.getHarvestLevel());
            MinecraftForge.setToolClass(uraniumSlimeShovel, "shovel", InfiMaterialEnum.Slime.getHarvestLevel());
        }
        
        if(PropsHelperInfiMetals.enableFlintTools)
        {
            copperFlintShovel = new MetalToolShovel(PropsHelperInfiMetals.flintShovelID+0, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Copper, "copperFlintShovel");
            bronzeFlintShovel = new MetalToolShovel(PropsHelperInfiMetals.flintShovelID+1, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Bronze, "bronzeFlintShovel");
            
            MinecraftForge.setToolClass(copperFlintShovel, "shovel", InfiMaterialEnum.Flint.getHarvestLevel());
            MinecraftForge.setToolClass(bronzeFlintShovel, "shovel", InfiMaterialEnum.Flint.getHarvestLevel());
        }
        
        if(PropsHelperInfiMetals.enableBlazeTools)
        {
            cobaltBlazeShovel = new MetalToolShovel(PropsHelperInfiMetals.blazeShovelID+0, 
                    InfiMaterialEnum.Blaze, InfiMaterialEnum.Cobalt, "cobaltBlazeShovel");
            arditeBlazeShovel = new MetalToolShovel(PropsHelperInfiMetals.blazeShovelID+1, 
                    InfiMaterialEnum.Blaze, InfiMaterialEnum.Ardite, "arditeBlazeShovel");
            manyullynBlazeShovel = new MetalToolShovel(PropsHelperInfiMetals.blazeShovelID+2, 
                    InfiMaterialEnum.Blaze, InfiMaterialEnum.Manyullyn, "manyullynBlazeShovel");
            uraniumBlazeShovel = new MetalToolShovel(PropsHelperInfiMetals.blazeShovelID+3, 
                    InfiMaterialEnum.Blaze, InfiMaterialEnum.Uranium, "uraniumBlazeShovel");
            
            MinecraftForge.setToolClass(cobaltBlazeShovel, "shovel", InfiMaterialEnum.Blaze.getHarvestLevel());
            MinecraftForge.setToolClass(arditeBlazeShovel, "shovel", InfiMaterialEnum.Blaze.getHarvestLevel());
            MinecraftForge.setToolClass(manyullynBlazeShovel, "shovel", InfiMaterialEnum.Blaze.getHarvestLevel());
            MinecraftForge.setToolClass(uraniumBlazeShovel, "shovel", InfiMaterialEnum.Blaze.getHarvestLevel());
        }
    }
    
    private static void addNames()
    {
        ModLoader.addName(copperCopperShovel, "Orange-Tang Shovel");
        ModLoader.addName(bronzeBronzeShovel, "Polished Shovel");
        ModLoader.addName(workedWorkedIronShovel, "Reworked Iron Shovel");
        ModLoader.addName(steelSteelShovel, "Forge-Wrought Shovel");
        ModLoader.addName(cobaltCobaltShovel, "Beautiful Shovel");
        ModLoader.addName(arditeArditeShovel, "Rustic StoneDigger");
        ModLoader.addName(manyullynManyullynShovel, "False-Prophetic Shovel");
        ModLoader.addName(uraniumUraniumShovel, "Cancerous Shovel");
    }
    
    public static void registerInfiToolsRecipes()
    {
        if(PropsHelperInfiMetals.enableStoneTools)
        {
            ModLoader.addRecipe(new ItemStack(copperStoneShovel), new Object[] 
                    { "#", "|", "|", '#', Block.stone, '|', mod_InfiMetals.copperRod });
        }
        if(PropsHelperInfiMetals.enableIronTools)
        {
            ModLoader.addRecipe(new ItemStack(copperIronShovel), new Object[] 
                    { "#", "|", "|", '#', Item.ingotIron, '|', mod_InfiMetals.copperRod });
            ModLoader.addRecipe(new ItemStack(bronzeIronShovel), new Object[] 
                    { "#", "|", "|", '#', Item.ingotIron, '|', mod_InfiMetals.bronzeRod });
            ModLoader.addRecipe(new ItemStack(workedIronShovel), new Object[] 
                    { "#", "|", "|", '#', Item.ingotIron, '|', mod_InfiMetals.workedIronRod });
        }
        if(PropsHelperInfiMetals.enableDiamondTools)
        {
            ModLoader.addRecipe(new ItemStack(copperDiamondShovel), new Object[] 
                    { "#", "|", "|", '#', Item.diamond, '|', mod_InfiMetals.copperRod });
            ModLoader.addRecipe(new ItemStack(bronzeDiamondShovel), new Object[] 
                    { "#", "|", "|", '#', Item.diamond, '|', mod_InfiMetals.bronzeRod });
            ModLoader.addRecipe(new ItemStack(workedDiamondShovel), new Object[] 
                    { "#", "|", "|", '#', Item.diamond, '|', mod_InfiMetals.workedIronRod });
            ModLoader.addRecipe(new ItemStack(steelDiamondShovel), new Object[] 
                    { "#", "|", "|", '#', Item.diamond, '|', mod_InfiMetals.steelRod });
            ModLoader.addRecipe(new ItemStack(cobaltDiamondShovel), new Object[] 
                    { "#", "|", "|", '#', Item.diamond, '|', mod_InfiMetals.cobaltRod });
            ModLoader.addRecipe(new ItemStack(arditeDiamondShovel), new Object[] 
                    { "#", "|", "|", '#', Item.diamond, '|', mod_InfiMetals.arditeRod });
            ModLoader.addRecipe(new ItemStack(manyullynDiamondShovel), new Object[] 
                    { "#", "|", "|", '#', Item.diamond, '|', mod_InfiMetals.manyullynRod });
            ModLoader.addRecipe(new ItemStack(uraniumDiamondShovel), new Object[] 
                    { "#", "|", "|", '#', Item.diamond, '|', mod_InfiMetals.uraniumRod });
        }
        if(PropsHelperInfiMetals.enableMossyTools)
        {
            ModLoader.addRecipe(new ItemStack(cobaltMossyShovel), new Object[] 
                    { "#", "|", "|", '#', mod_InfiTools.mossBallCrafted, '|', mod_InfiMetals.cobaltRod });
            ModLoader.addRecipe(new ItemStack(arditeMossyShovel), new Object[] 
                    { "#", "|", "|", '#', mod_InfiTools.mossBallCrafted, '|', mod_InfiMetals.arditeRod });
            ModLoader.addRecipe(new ItemStack(manyullynMossyShovel), new Object[] 
                    { "#", "|", "|", '#', mod_InfiTools.mossBallCrafted, '|', mod_InfiMetals.manyullynRod });
        }
        if(PropsHelperInfiMetals.enableNetherrackTools)
        {
            ModLoader.addRecipe(new ItemStack(copperNetherrackShovel), new Object[] 
                    { "#", "|", "|", '#', Block.netherrack, '|', mod_InfiMetals.copperRod });
        }
        if(PropsHelperInfiMetals.enableFlintTools)
        {
            ModLoader.addRecipe(new ItemStack(copperFlintShovel), new Object[] 
                    { "#", "|", "|", '#', Block.netherrack, '|', mod_InfiMetals.copperRod });
            ModLoader.addRecipe(new ItemStack(bronzeFlintShovel), new Object[] 
                    { "#", "|", "|", '#', Block.netherrack, '|', mod_InfiMetals.bronzeRod });
        }
    }
    
    public static void addCopperTools(ItemStack stack)
    {
        ModLoader.addRecipe(new ItemStack(stoneCopperShovel), new Object[] 
                { "#", "|", "|", '#', stack, '|', mod_InfiTools.stoneRod });
        ModLoader.addRecipe(new ItemStack(boneCopperShovel), new Object[] 
                { "#", "|", "|", '#', stack, '|', Item.bone });
        ModLoader.addRecipe(new ItemStack(boneCopperShovel), new Object[] 
                { "#", "|", "|", '#', stack, '|', mod_InfiTools.boneRod });
        ModLoader.addRecipe(new ItemStack(netherrackCopperShovel), new Object[] 
                { "#", "|", "|", '#', stack, '|', mod_InfiTools.netherrackRod });
        ModLoader.addRecipe(new ItemStack(slimeCopperShovel), new Object[] 
                { "#", "|", "|", '#', stack, '|', mod_InfiTools.slimeRod });
        ModLoader.addRecipe(new ItemStack(cactusCopperShovel), new Object[] 
                { "#", "|", "|", '#', stack, '|', mod_InfiTools.cactusRod });
        ModLoader.addRecipe(new ItemStack(flintCopperShovel), new Object[] 
                { "#", "|", "|", '#', stack, '|', mod_InfiTools.flintRod });
        ModLoader.addRecipe(new ItemStack(copperCopperShovel), new Object[] 
                { "#", "|", "|", '#', stack, '|', mod_InfiMetals.copperRod });
    }
    
    public static void addBronzeTools(ItemStack stack)
    {
        ModLoader.addRecipe(new ItemStack(stoneBronzeShovel), new Object[] 
                { "#", "|", "|", '#', stack, '|', mod_InfiTools.stoneRod });
        ModLoader.addRecipe(new ItemStack(boneBronzeShovel), new Object[] 
                { "#", "|", "|", '#', stack, '|', Item.bone });
        ModLoader.addRecipe(new ItemStack(boneBronzeShovel), new Object[] 
                { "#", "|", "|", '#', stack, '|', mod_InfiTools.boneRod });
        ModLoader.addRecipe(new ItemStack(netherrackBronzeShovel), new Object[] 
                { "#", "|", "|", '#', stack, '|', mod_InfiTools.netherrackRod });
        ModLoader.addRecipe(new ItemStack(slimeBronzeShovel), new Object[] 
                { "#", "|", "|", '#', stack, '|', mod_InfiTools.slimeRod });
        ModLoader.addRecipe(new ItemStack(cactusBronzeShovel), new Object[] 
                { "#", "|", "|", '#', stack, '|', mod_InfiTools.cactusRod });
        ModLoader.addRecipe(new ItemStack(flintBronzeShovel), new Object[] 
                { "#", "|", "|", '#', stack, '|', mod_InfiTools.flintRod });
        ModLoader.addRecipe(new ItemStack(copperBronzeShovel), new Object[] 
                { "#", "|", "|", '#', stack, '|', mod_InfiMetals.copperRod });
        ModLoader.addRecipe(new ItemStack(bronzeBronzeShovel), new Object[] 
                { "#", "|", "|", '#', stack, '|', mod_InfiMetals.bronzeRod });
    }
    
    public static void addWorkedIronTools(ItemStack stack)
    {
        ModLoader.addRecipe(new ItemStack(stoneWorkedIronShovel), new Object[] 
                { "#", "|", "|", '#', stack, '|', mod_InfiTools.stoneRod });
        ModLoader.addRecipe(new ItemStack(ironWorkedIronShovel), new Object[] 
                { "#", "|", "|", '#', stack, '|', mod_InfiTools.ironRod });
        ModLoader.addRecipe(new ItemStack(diamondWorkedIronShovel), new Object[] 
                { "#", "|", "|", '#', stack, '|', mod_InfiTools.diamondRod });
        ModLoader.addRecipe(new ItemStack(goldWorkedIronShovel), new Object[] 
                { "#", "|", "|", '#', stack, '|', mod_InfiTools.goldRod });
        ModLoader.addRecipe(new ItemStack(redstoneWorkedIronShovel), new Object[] 
                { "#", "|", "|", '#', stack, '|', mod_InfiTools.redstoneRod });
        ModLoader.addRecipe(new ItemStack(obsidianWorkedIronShovel), new Object[] 
                { "#", "|", "|", '#', stack, '|', mod_InfiTools.obsidianRod });
        ModLoader.addRecipe(new ItemStack(boneWorkedIronShovel), new Object[] 
                { "#", "|", "|", '#', stack, '|', Item.bone });
        ModLoader.addRecipe(new ItemStack(boneWorkedIronShovel), new Object[] 
                { "#", "|", "|", '#', stack, '|', mod_InfiTools.boneRod });
        ModLoader.addRecipe(new ItemStack(netherrackWorkedIronShovel), new Object[] 
                { "#", "|", "|", '#', stack, '|', mod_InfiTools.netherrackRod });
        ModLoader.addRecipe(new ItemStack(glowstoneWorkedIronShovel), new Object[] 
                { "#", "|", "|", '#', stack, '|', mod_InfiTools.glowstoneRod });
        ModLoader.addRecipe(new ItemStack(iceWorkedIronShovel), new Object[] 
                { "#", "|", "|", '#', stack, '|', mod_InfiTools.iceRod });
        ModLoader.addRecipe(new ItemStack(slimeWorkedIronShovel), new Object[] 
                { "#", "|", "|", '#', stack, '|', mod_InfiTools.slimeRod });
        ModLoader.addRecipe(new ItemStack(cactusWorkedIronShovel), new Object[] 
                { "#", "|", "|", '#', stack, '|', mod_InfiTools.cactusRod });
        ModLoader.addRecipe(new ItemStack(blazeWorkedIronShovel), new Object[] 
                { "#", "|", "|", '#', stack, '|', Item.blazeRod });
        ModLoader.addRecipe(new ItemStack(copperWorkedIronShovel), new Object[] 
                { "#", "|", "|", '#', stack, '|', mod_InfiMetals.copperRod });
        ModLoader.addRecipe(new ItemStack(bronzeWorkedIronShovel), new Object[] 
                { "#", "|", "|", '#', stack, '|', mod_InfiMetals.bronzeRod });
        ModLoader.addRecipe(new ItemStack(workedWorkedIronShovel), new Object[] 
                { "#", "|", "|", '#', stack, '|', mod_InfiMetals.workedIronRod });
        ModLoader.addRecipe(new ItemStack(steelWorkedIronShovel), new Object[] 
                { "#", "|", "|", '#', stack, '|', mod_InfiMetals.steelRod });
        ModLoader.addRecipe(new ItemStack(cobaltWorkedIronShovel), new Object[] 
                { "#", "|", "|", '#', stack, '|', mod_InfiMetals.cobaltRod });
        ModLoader.addRecipe(new ItemStack(arditeWorkedIronShovel), new Object[] 
                { "#", "|", "|", '#', stack, '|', mod_InfiMetals.arditeRod });
        ModLoader.addRecipe(new ItemStack(uraniumWorkedIronShovel), new Object[] 
                { "#", "|", "|", '#', stack, '|', mod_InfiMetals.uraniumRod });
    }
    
    public static void addSteelTools(ItemStack stack)
    {
        ModLoader.addRecipe(new ItemStack(stoneSteelShovel), new Object[] 
                { "#", "|", "|", '#', stack, '|', mod_InfiTools.stoneRod });
        ModLoader.addRecipe(new ItemStack(ironSteelShovel), new Object[] 
                { "#", "|", "|", '#', stack, '|', mod_InfiTools.ironRod });
        ModLoader.addRecipe(new ItemStack(diamondSteelShovel), new Object[] 
                { "#", "|", "|", '#', stack, '|', mod_InfiTools.diamondRod });
        ModLoader.addRecipe(new ItemStack(goldSteelShovel), new Object[] 
                { "#", "|", "|", '#', stack, '|', mod_InfiTools.goldRod });
        ModLoader.addRecipe(new ItemStack(redstoneSteelShovel), new Object[] 
                { "#", "|", "|", '#', stack, '|', mod_InfiTools.redstoneRod });
        ModLoader.addRecipe(new ItemStack(obsidianSteelShovel), new Object[] 
                { "#", "|", "|", '#', stack, '|', mod_InfiTools.obsidianRod });
        ModLoader.addRecipe(new ItemStack(boneSteelShovel), new Object[] 
                { "#", "|", "|", '#', stack, '|', Item.bone });
        ModLoader.addRecipe(new ItemStack(boneSteelShovel), new Object[] 
                { "#", "|", "|", '#', stack, '|', mod_InfiTools.boneRod });
        ModLoader.addRecipe(new ItemStack(netherrackSteelShovel), new Object[] 
                { "#", "|", "|", '#', stack, '|', mod_InfiTools.netherrackRod });
        ModLoader.addRecipe(new ItemStack(glowstoneSteelShovel), new Object[] 
                { "#", "|", "|", '#', stack, '|', mod_InfiTools.glowstoneRod });
        ModLoader.addRecipe(new ItemStack(iceSteelShovel), new Object[] 
                { "#", "|", "|", '#', stack, '|', mod_InfiTools.iceRod });
        ModLoader.addRecipe(new ItemStack(slimeSteelShovel), new Object[] 
                { "#", "|", "|", '#', stack, '|', mod_InfiTools.slimeRod });
        ModLoader.addRecipe(new ItemStack(cactusSteelShovel), new Object[] 
                { "#", "|", "|", '#', stack, '|', mod_InfiTools.cactusRod });
        ModLoader.addRecipe(new ItemStack(blazeSteelShovel), new Object[] 
                { "#", "|", "|", '#', stack, '|', Item.blazeRod });
        ModLoader.addRecipe(new ItemStack(copperSteelShovel), new Object[] 
                { "#", "|", "|", '#', stack, '|', mod_InfiMetals.copperRod });
        ModLoader.addRecipe(new ItemStack(bronzeSteelShovel), new Object[] 
                { "#", "|", "|", '#', stack, '|', mod_InfiMetals.bronzeRod });
        ModLoader.addRecipe(new ItemStack(workedSteelShovel), new Object[] 
                { "#", "|", "|", '#', stack, '|', mod_InfiMetals.workedIronRod });
        ModLoader.addRecipe(new ItemStack(steelSteelShovel), new Object[] 
                { "#", "|", "|", '#', stack, '|', mod_InfiMetals.steelRod });
        ModLoader.addRecipe(new ItemStack(cobaltSteelShovel), new Object[] 
                { "#", "|", "|", '#', stack, '|', mod_InfiMetals.cobaltRod });
        ModLoader.addRecipe(new ItemStack(arditeSteelShovel), new Object[] 
                { "#", "|", "|", '#', stack, '|', mod_InfiMetals.arditeRod });
        ModLoader.addRecipe(new ItemStack(uraniumSteelShovel), new Object[] 
                { "#", "|", "|", '#', stack, '|', mod_InfiMetals.uraniumRod });
    }
    
    public static void addCobaltTools(ItemStack stack)
    {
        ModLoader.addRecipe(new ItemStack(stoneCobaltShovel), new Object[] 
                { "#", "|", "|", '#', stack, '|', mod_InfiTools.stoneRod });
        ModLoader.addRecipe(new ItemStack(ironCobaltShovel), new Object[] 
                { "#", "|", "|", '#', stack, '|', mod_InfiTools.ironRod });
        ModLoader.addRecipe(new ItemStack(diamondCobaltShovel), new Object[] 
                { "#", "|", "|", '#', stack, '|', mod_InfiTools.diamondRod });
        ModLoader.addRecipe(new ItemStack(redstoneCobaltShovel), new Object[] 
                { "#", "|", "|", '#', stack, '|', mod_InfiTools.redstoneRod });
        ModLoader.addRecipe(new ItemStack(obsidianCobaltShovel), new Object[] 
                { "#", "|", "|", '#', stack, '|', mod_InfiTools.obsidianRod });
        ModLoader.addRecipe(new ItemStack(boneCobaltShovel), new Object[] 
                { "#", "|", "|", '#', stack, '|', Item.bone });
        ModLoader.addRecipe(new ItemStack(boneCobaltShovel), new Object[] 
                { "#", "|", "|", '#', stack, '|', mod_InfiTools.boneRod });
        ModLoader.addRecipe(new ItemStack(slimeCobaltShovel), new Object[] 
                { "#", "|", "|", '#', stack, '|', mod_InfiTools.slimeRod });
        ModLoader.addRecipe(new ItemStack(cactusCobaltShovel), new Object[] 
                { "#", "|", "|", '#', stack, '|', mod_InfiTools.cactusRod });
        ModLoader.addRecipe(new ItemStack(blazeCobaltShovel), new Object[] 
                { "#", "|", "|", '#', stack, '|', Item.blazeRod });
        ModLoader.addRecipe(new ItemStack(copperCobaltShovel), new Object[] 
                { "#", "|", "|", '#', stack, '|', mod_InfiMetals.copperRod });
        ModLoader.addRecipe(new ItemStack(bronzeCobaltShovel), new Object[] 
                { "#", "|", "|", '#', stack, '|', mod_InfiMetals.bronzeRod });
        ModLoader.addRecipe(new ItemStack(workedCobaltShovel), new Object[] 
                { "#", "|", "|", '#', stack, '|', mod_InfiMetals.workedIronRod });
        ModLoader.addRecipe(new ItemStack(steelCobaltShovel), new Object[] 
                { "#", "|", "|", '#', stack, '|', mod_InfiMetals.steelRod });
        ModLoader.addRecipe(new ItemStack(cobaltCobaltShovel), new Object[] 
                { "#", "|", "|", '#', stack, '|', mod_InfiMetals.cobaltRod });
        ModLoader.addRecipe(new ItemStack(arditeCobaltShovel), new Object[] 
                { "#", "|", "|", '#', stack, '|', mod_InfiMetals.arditeRod });
        ModLoader.addRecipe(new ItemStack(manyullynCobaltShovel), new Object[] 
                { "#", "|", "|", '#', stack, '|', mod_InfiMetals.manyullynRod });
        ModLoader.addRecipe(new ItemStack(uraniumCobaltShovel), new Object[] 
                { "#", "|", "|", '#', stack, '|', mod_InfiMetals.uraniumRod });
    }
    
    public static void addArditeTools(ItemStack stack)
    {
        ModLoader.addRecipe(new ItemStack(stoneArditeShovel), new Object[] 
                { "#", "|", "|", '#', stack, '|', mod_InfiTools.stoneRod });
        ModLoader.addRecipe(new ItemStack(ironArditeShovel), new Object[] 
                { "#", "|", "|", '#', stack, '|', mod_InfiTools.ironRod });
        ModLoader.addRecipe(new ItemStack(diamondArditeShovel), new Object[] 
                { "#", "|", "|", '#', stack, '|', mod_InfiTools.diamondRod });
        ModLoader.addRecipe(new ItemStack(redstoneArditeShovel), new Object[] 
                { "#", "|", "|", '#', stack, '|', mod_InfiTools.redstoneRod });
        ModLoader.addRecipe(new ItemStack(obsidianArditeShovel), new Object[] 
                { "#", "|", "|", '#', stack, '|', mod_InfiTools.obsidianRod });
        ModLoader.addRecipe(new ItemStack(boneArditeShovel), new Object[] 
                { "#", "|", "|", '#', stack, '|', Item.bone });
        ModLoader.addRecipe(new ItemStack(boneArditeShovel), new Object[] 
                { "#", "|", "|", '#', stack, '|', mod_InfiTools.boneRod });
        ModLoader.addRecipe(new ItemStack(slimeArditeShovel), new Object[] 
                { "#", "|", "|", '#', stack, '|', mod_InfiTools.slimeRod });
        ModLoader.addRecipe(new ItemStack(cactusArditeShovel), new Object[] 
                { "#", "|", "|", '#', stack, '|', mod_InfiTools.cactusRod });
        ModLoader.addRecipe(new ItemStack(blazeArditeShovel), new Object[] 
                { "#", "|", "|", '#', stack, '|', Item.blazeRod });
        ModLoader.addRecipe(new ItemStack(copperArditeShovel), new Object[] 
                { "#", "|", "|", '#', stack, '|', mod_InfiMetals.copperRod });
        ModLoader.addRecipe(new ItemStack(bronzeArditeShovel), new Object[] 
                { "#", "|", "|", '#', stack, '|', mod_InfiMetals.bronzeRod });
        ModLoader.addRecipe(new ItemStack(workedArditeShovel), new Object[] 
                { "#", "|", "|", '#', stack, '|', mod_InfiMetals.workedIronRod });
        ModLoader.addRecipe(new ItemStack(steelArditeShovel), new Object[] 
                { "#", "|", "|", '#', stack, '|', mod_InfiMetals.steelRod });
        ModLoader.addRecipe(new ItemStack(cobaltArditeShovel), new Object[] 
                { "#", "|", "|", '#', stack, '|', mod_InfiMetals.cobaltRod });
        ModLoader.addRecipe(new ItemStack(arditeArditeShovel), new Object[] 
                { "#", "|", "|", '#', stack, '|', mod_InfiMetals.arditeRod });
        ModLoader.addRecipe(new ItemStack(manyullynArditeShovel), new Object[] 
                { "#", "|", "|", '#', stack, '|', mod_InfiMetals.manyullynRod });
        ModLoader.addRecipe(new ItemStack(uraniumArditeShovel), new Object[] 
                { "#", "|", "|", '#', stack, '|', mod_InfiMetals.uraniumRod });
    }
    
    public static void addManyullynTools(ItemStack stack)
    {
        ModLoader.addRecipe(new ItemStack(stoneManyullynShovel), new Object[] 
                { "#", "|", "|", '#', stack, '|', mod_InfiTools.stoneRod });
        ModLoader.addRecipe(new ItemStack(ironManyullynShovel), new Object[] 
                { "#", "|", "|", '#', stack, '|', mod_InfiTools.ironRod });
        ModLoader.addRecipe(new ItemStack(diamondManyullynShovel), new Object[] 
                { "#", "|", "|", '#', stack, '|', mod_InfiTools.diamondRod });
        ModLoader.addRecipe(new ItemStack(redstoneManyullynShovel), new Object[] 
                { "#", "|", "|", '#', stack, '|', mod_InfiTools.redstoneRod });
        ModLoader.addRecipe(new ItemStack(obsidianManyullynShovel), new Object[] 
                { "#", "|", "|", '#', stack, '|', mod_InfiTools.obsidianRod });
        ModLoader.addRecipe(new ItemStack(boneManyullynShovel), new Object[] 
                { "#", "|", "|", '#', stack, '|', Item.bone });
        ModLoader.addRecipe(new ItemStack(boneManyullynShovel), new Object[] 
                { "#", "|", "|", '#', stack, '|', mod_InfiTools.boneRod });
        ModLoader.addRecipe(new ItemStack(slimeManyullynShovel), new Object[] 
                { "#", "|", "|", '#', stack, '|', mod_InfiTools.slimeRod });
        ModLoader.addRecipe(new ItemStack(cactusManyullynShovel), new Object[] 
                { "#", "|", "|", '#', stack, '|', mod_InfiTools.cactusRod });
        ModLoader.addRecipe(new ItemStack(blazeManyullynShovel), new Object[] 
                { "#", "|", "|", '#', stack, '|', Item.blazeRod });
        ModLoader.addRecipe(new ItemStack(copperManyullynShovel), new Object[] 
                { "#", "|", "|", '#', stack, '|', mod_InfiMetals.copperRod });
        ModLoader.addRecipe(new ItemStack(bronzeManyullynShovel), new Object[] 
                { "#", "|", "|", '#', stack, '|', mod_InfiMetals.bronzeRod });
        ModLoader.addRecipe(new ItemStack(workedManyullynShovel), new Object[] 
                { "#", "|", "|", '#', stack, '|', mod_InfiMetals.workedIronRod });
        ModLoader.addRecipe(new ItemStack(steelManyullynShovel), new Object[] 
                { "#", "|", "|", '#', stack, '|', mod_InfiMetals.steelRod });
        ModLoader.addRecipe(new ItemStack(cobaltManyullynShovel), new Object[] 
                { "#", "|", "|", '#', stack, '|', mod_InfiMetals.cobaltRod });
        ModLoader.addRecipe(new ItemStack(arditeManyullynShovel), new Object[] 
                { "#", "|", "|", '#', stack, '|', mod_InfiMetals.arditeRod });
        ModLoader.addRecipe(new ItemStack(manyullynManyullynShovel), new Object[] 
                { "#", "|", "|", '#', stack, '|', mod_InfiMetals.manyullynRod });
        ModLoader.addRecipe(new ItemStack(uraniumManyullynShovel), new Object[] 
                { "#", "|", "|", '#', stack, '|', mod_InfiMetals.uraniumRod });
    }
    
    public static void addUraniumTools(ItemStack stack)
    {
        ModLoader.addRecipe(new ItemStack(diamondUraniumShovel), new Object[] 
                { "#", "|", "|", '#', stack, '|', mod_InfiTools.diamondRod });
        ModLoader.addRecipe(new ItemStack(redstoneUraniumShovel), new Object[] 
                { "#", "|", "|", '#', stack, '|', mod_InfiTools.redstoneRod });
        ModLoader.addRecipe(new ItemStack(boneUraniumShovel), new Object[] 
                { "#", "|", "|", '#', stack, '|', Item.bone });
        ModLoader.addRecipe(new ItemStack(boneUraniumShovel), new Object[] 
                { "#", "|", "|", '#', stack, '|', mod_InfiTools.boneRod });
        ModLoader.addRecipe(new ItemStack(netherrackUraniumShovel), new Object[] 
                { "#", "|", "|", '#', stack, '|', mod_InfiTools.netherrackRod });
        ModLoader.addRecipe(new ItemStack(glowstoneUraniumShovel), new Object[] 
                { "#", "|", "|", '#', stack, '|', mod_InfiTools.glowstoneRod });
        ModLoader.addRecipe(new ItemStack(lavaUraniumShovel), new Object[] 
                { "#", "|", "|", '#', stack, '|', mod_InfiTools.lavaRod });
        ModLoader.addRecipe(new ItemStack(blazeUraniumShovel), new Object[] 
                { "#", "|", "|", '#', stack, '|', Item.blazeRod });
        ModLoader.addRecipe(new ItemStack(cobaltUraniumShovel), new Object[] 
                { "#", "|", "|", '#', stack, '|', mod_InfiMetals.cobaltRod });
        ModLoader.addRecipe(new ItemStack(arditeUraniumShovel), new Object[] 
                { "#", "|", "|", '#', stack, '|', mod_InfiMetals.arditeRod });
        ModLoader.addRecipe(new ItemStack(uraniumUraniumShovel), new Object[] 
                { "#", "|", "|", '#', stack, '|', mod_InfiMetals.uraniumRod });
    }
    
    public static void addStoneTools(ItemStack stack)
    {
        ModLoader.addRecipe(new ItemStack(copperStoneShovel), new Object[] 
                { "#", "|", "|", '#', stack, '|', mod_InfiMetals.copperRod });
    }
    
    public static void addRedstoneTools(ItemStack stack)
    {
        if(PropsHelperInfiMetals.enableRedstoneTools)
        {
            ModLoader.addRecipe(new ItemStack(copperRedstoneShovel), new Object[] 
                    { "#", "|", "|", '#', stack, '|', mod_InfiMetals.copperRod });
            ModLoader.addRecipe(new ItemStack(bronzeRedstoneShovel), new Object[] 
                    { "#", "|", "|", '#', stack, '|', mod_InfiMetals.bronzeRod });
            ModLoader.addRecipe(new ItemStack(workedRedstoneShovel), new Object[] 
                    { "#", "|", "|", '#', stack, '|', mod_InfiMetals.workedIronRod });
        }
    }
    
    public static void addGlowstoneTools(ItemStack stack)
    {
        if(PropsHelperInfiMetals.enableGlowstoneTools)
        {
            ModLoader.addRecipe(new ItemStack(copperGlowstoneShovel), new Object[] 
                    { "#", "|", "|", '#', stack, '|', mod_InfiMetals.copperRod });
            ModLoader.addRecipe(new ItemStack(bronzeGlowstoneShovel), new Object[] 
                    { "#", "|", "|", '#', stack, '|', mod_InfiMetals.bronzeRod });
            ModLoader.addRecipe(new ItemStack(workedGlowstoneShovel), new Object[] 
                    { "#", "|", "|", '#', stack, '|', mod_InfiMetals.workedIronRod });
            ModLoader.addRecipe(new ItemStack(steelGlowstoneShovel), new Object[] 
                    { "#", "|", "|", '#', stack, '|', mod_InfiMetals.steelRod });
        }
    }
    
    public static void addLavaTools(ItemStack stack)
    {
        ModLoader.addRecipe(new ItemStack(cobaltLavaShovel), new Object[] 
                { "#", "|", "|", '#', stack, '|', mod_InfiMetals.cobaltRod });
        ModLoader.addRecipe(new ItemStack(arditeLavaShovel), new Object[] 
                { "#", "|", "|", '#', stack, '|', mod_InfiMetals.arditeRod });
        ModLoader.addRecipe(new ItemStack(manyullynLavaShovel), new Object[] 
                { "#", "|", "|", '#', stack, '|', mod_InfiMetals.manyullynRod });
        ModLoader.addRecipe(new ItemStack(uraniumLavaShovel), new Object[] 
                { "#", "|", "|", '#', stack, '|', mod_InfiMetals.uraniumRod });
    }
    
    public static void addSlimeTools(ItemStack stack)
    {
        ModLoader.addRecipe(new ItemStack(copperSlimeShovel), new Object[] 
                { "#", "|", "|", '#', stack, '|', mod_InfiMetals.copperRod });
        ModLoader.addRecipe(new ItemStack(bronzeSlimeShovel), new Object[] 
                { "#", "|", "|", '#', stack, '|', mod_InfiMetals.bronzeRod });
        ModLoader.addRecipe(new ItemStack(workedSlimeShovel), new Object[] 
                { "#", "|", "|", '#', stack, '|', mod_InfiMetals.workedIronRod });
        ModLoader.addRecipe(new ItemStack(steelSlimeShovel), new Object[] 
                { "#", "|", "|", '#', stack, '|', mod_InfiMetals.steelRod });
        ModLoader.addRecipe(new ItemStack(cobaltSlimeShovel), new Object[] 
                { "#", "|", "|", '#', stack, '|', mod_InfiMetals.cobaltRod });
        ModLoader.addRecipe(new ItemStack(arditeSlimeShovel), new Object[] 
                { "#", "|", "|", '#', stack, '|', mod_InfiMetals.arditeRod });
        ModLoader.addRecipe(new ItemStack(manyullynSlimeShovel), new Object[] 
                { "#", "|", "|", '#', stack, '|', mod_InfiMetals.manyullynRod });
        ModLoader.addRecipe(new ItemStack(uraniumSlimeShovel), new Object[] 
                { "#", "|", "|", '#', stack, '|', mod_InfiMetals.uraniumRod });
    }
    
    public static void addBlazeTools(ItemStack stack)
    {
        ModLoader.addRecipe(new ItemStack(cobaltBlazeShovel), new Object[] 
                { "#", "|", "|", '#', stack, '|', mod_InfiMetals.cobaltRod });
        ModLoader.addRecipe(new ItemStack(arditeBlazeShovel), new Object[] 
                { "#", "|", "|", '#', stack, '|', mod_InfiMetals.arditeRod });
        ModLoader.addRecipe(new ItemStack(manyullynBlazeShovel), new Object[] 
                { "#", "|", "|", '#', stack, '|', mod_InfiMetals.manyullynRod });
        ModLoader.addRecipe(new ItemStack(uraniumBlazeShovel), new Object[] 
                { "#", "|", "|", '#', stack, '|', mod_InfiMetals.uraniumRod });
    }
    
    public static Item stoneCopperShovel;
    public static Item boneCopperShovel;
    public static Item netherrackCopperShovel;
    public static Item slimeCopperShovel;
    public static Item cactusCopperShovel;
    public static Item flintCopperShovel;
    public static Item copperCopperShovel;
    
    public static Item stoneBronzeShovel;
    public static Item boneBronzeShovel;
    public static Item netherrackBronzeShovel;
    public static Item slimeBronzeShovel;
    public static Item cactusBronzeShovel;
    public static Item flintBronzeShovel;
    public static Item copperBronzeShovel;
    public static Item bronzeBronzeShovel;
    
    public static Item stoneWorkedIronShovel;
    public static Item ironWorkedIronShovel;
    public static Item diamondWorkedIronShovel;
    public static Item goldWorkedIronShovel;
    public static Item redstoneWorkedIronShovel;
    public static Item obsidianWorkedIronShovel;
    public static Item boneWorkedIronShovel;
    public static Item netherrackWorkedIronShovel;
    public static Item glowstoneWorkedIronShovel;
    public static Item iceWorkedIronShovel;
    public static Item slimeWorkedIronShovel;
    public static Item cactusWorkedIronShovel;
    public static Item blazeWorkedIronShovel;
    public static Item copperWorkedIronShovel;
    public static Item bronzeWorkedIronShovel;
    public static Item workedWorkedIronShovel;
    public static Item steelWorkedIronShovel;
    public static Item cobaltWorkedIronShovel;
    public static Item arditeWorkedIronShovel;
    public static Item uraniumWorkedIronShovel;
    
    public static Item stoneSteelShovel;
    public static Item ironSteelShovel;
    public static Item diamondSteelShovel;
    public static Item goldSteelShovel;
    public static Item redstoneSteelShovel;
    public static Item obsidianSteelShovel;
    public static Item boneSteelShovel;
    public static Item netherrackSteelShovel;
    public static Item glowstoneSteelShovel;
    public static Item iceSteelShovel;
    public static Item slimeSteelShovel;
    public static Item cactusSteelShovel;
    public static Item blazeSteelShovel;
    public static Item copperSteelShovel;
    public static Item bronzeSteelShovel;
    public static Item workedSteelShovel;
    public static Item steelSteelShovel;
    public static Item cobaltSteelShovel;
    public static Item arditeSteelShovel;
    public static Item uraniumSteelShovel;
    
    public static Item stoneCobaltShovel;
    public static Item ironCobaltShovel;
    public static Item diamondCobaltShovel;
    public static Item redstoneCobaltShovel;
    public static Item obsidianCobaltShovel;
    public static Item boneCobaltShovel;
    public static Item slimeCobaltShovel;
    public static Item cactusCobaltShovel;
    public static Item blazeCobaltShovel;
    public static Item copperCobaltShovel;
    public static Item bronzeCobaltShovel;
    public static Item workedCobaltShovel;
    public static Item steelCobaltShovel;
    public static Item cobaltCobaltShovel;
    public static Item arditeCobaltShovel;
    public static Item manyullynCobaltShovel;
    public static Item uraniumCobaltShovel;
    
    public static Item stoneArditeShovel;
    public static Item ironArditeShovel;
    public static Item diamondArditeShovel;
    public static Item redstoneArditeShovel;
    public static Item obsidianArditeShovel;
    public static Item boneArditeShovel;
    public static Item slimeArditeShovel;
    public static Item cactusArditeShovel;
    public static Item blazeArditeShovel;
    public static Item copperArditeShovel;
    public static Item bronzeArditeShovel;
    public static Item workedArditeShovel;
    public static Item steelArditeShovel;
    public static Item cobaltArditeShovel;
    public static Item arditeArditeShovel;
    public static Item manyullynArditeShovel;
    public static Item uraniumArditeShovel;
    
    public static Item stoneManyullynShovel;
    public static Item ironManyullynShovel;
    public static Item diamondManyullynShovel;
    public static Item redstoneManyullynShovel;
    public static Item obsidianManyullynShovel;
    public static Item boneManyullynShovel;
    public static Item slimeManyullynShovel;
    public static Item cactusManyullynShovel;
    public static Item blazeManyullynShovel;
    public static Item copperManyullynShovel;
    public static Item bronzeManyullynShovel;
    public static Item workedManyullynShovel;
    public static Item steelManyullynShovel;
    public static Item cobaltManyullynShovel;
    public static Item arditeManyullynShovel;
    public static Item manyullynManyullynShovel;
    public static Item uraniumManyullynShovel;
    
    public static Item diamondUraniumShovel;
    public static Item redstoneUraniumShovel;
    public static Item boneUraniumShovel;
    public static Item netherrackUraniumShovel;
    public static Item glowstoneUraniumShovel;
    public static Item lavaUraniumShovel;
    public static Item blazeUraniumShovel;
    public static Item cobaltUraniumShovel;
    public static Item arditeUraniumShovel;
    public static Item uraniumUraniumShovel;
    
    public static Item copperStoneShovel;
    
    public static Item copperIronShovel;
    public static Item bronzeIronShovel;
    public static Item workedIronShovel;
    
    public static Item copperDiamondShovel;
    public static Item bronzeDiamondShovel;
    public static Item workedDiamondShovel;
    public static Item steelDiamondShovel;
    public static Item cobaltDiamondShovel;
    public static Item arditeDiamondShovel;
    public static Item manyullynDiamondShovel;
    public static Item uraniumDiamondShovel;
    
    public static Item copperRedstoneShovel;
    public static Item bronzeRedstoneShovel;
    public static Item workedRedstoneShovel;
    
    public static Item cobaltMossyShovel;
    public static Item arditeMossyShovel;
    public static Item manyullynMossyShovel;
    
    public static Item copperNetherrackShovel;
    
    public static Item copperGlowstoneShovel;
    public static Item bronzeGlowstoneShovel;
    public static Item workedGlowstoneShovel;
    public static Item steelGlowstoneShovel;
    
    public static Item cobaltLavaShovel;
    public static Item arditeLavaShovel;
    public static Item manyullynLavaShovel;
    public static Item uraniumLavaShovel;
    
    public static Item copperSlimeShovel;
    public static Item bronzeSlimeShovel;
    public static Item workedSlimeShovel;
    public static Item steelSlimeShovel;
    public static Item cobaltSlimeShovel;
    public static Item arditeSlimeShovel;
    public static Item manyullynSlimeShovel;
    public static Item uraniumSlimeShovel;
    
    public static Item copperFlintShovel;
    public static Item bronzeFlintShovel;
    
    public static Item cobaltBlazeShovel;
    public static Item arditeBlazeShovel;
    public static Item manyullynBlazeShovel;
    public static Item uraniumBlazeShovel;
}
