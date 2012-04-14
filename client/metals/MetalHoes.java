package net.minecraft.src.metals;

import net.minecraft.src.InfiMaterialEnum;
import net.minecraft.src.Block;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;
import net.minecraft.src.ModLoader;
import net.minecraft.src.mod_InfiMetals;
import net.minecraft.src.mod_InfiTools;
import net.minecraft.src.forge.MinecraftForge;

public class MetalHoes 
{
    public static MetalHoes instance = new MetalHoes();
    
    public static MetalHoes getInstance()
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
            stoneCopperHoe = new MetalToolHoe(PropsHelperInfiMetals.copperHoeID+0, 
                    InfiMaterialEnum.Copper, InfiMaterialEnum.Stone, "stoneCopperHoe");
            boneCopperHoe = new MetalToolHoe(PropsHelperInfiMetals.copperHoeID+1, 
                    InfiMaterialEnum.Copper, InfiMaterialEnum.Bone, "boneCopperHoe");
            netherrackCopperHoe = new MetalToolHoe(PropsHelperInfiMetals.copperHoeID+2, 
                    InfiMaterialEnum.Copper, InfiMaterialEnum.Netherrack, "netherrackCopperHoe");
            slimeCopperHoe = new MetalToolHoe(PropsHelperInfiMetals.copperHoeID+3, 
                    InfiMaterialEnum.Copper, InfiMaterialEnum.Slime, "slimeCopperHoe");
            cactusCopperHoe = new MetalToolHoe(PropsHelperInfiMetals.copperHoeID+4, 
                    InfiMaterialEnum.Copper, InfiMaterialEnum.Cactus, "cactusCopperHoe");
            flintCopperHoe = new MetalToolHoe(PropsHelperInfiMetals.copperHoeID+5, 
                    InfiMaterialEnum.Copper, InfiMaterialEnum.Flint, "flintCopperHoe");
            copperCopperHoe = new MetalToolHoe(PropsHelperInfiMetals.copperHoeID+6, 
                    InfiMaterialEnum.Copper, InfiMaterialEnum.Copper, "copperCopperHoe");
            
        	MinecraftForge.setToolClass(stoneCopperHoe, "hoe", InfiMaterialEnum.Copper.getHarvestLevel());
            MinecraftForge.setToolClass(boneCopperHoe, "hoe", InfiMaterialEnum.Copper.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackCopperHoe, "hoe", InfiMaterialEnum.Copper.getHarvestLevel());
            MinecraftForge.setToolClass(slimeCopperHoe, "hoe", InfiMaterialEnum.Copper.getHarvestLevel());
            MinecraftForge.setToolClass(cactusCopperHoe, "hoe", InfiMaterialEnum.Copper.getHarvestLevel());
            MinecraftForge.setToolClass(flintCopperHoe, "hoe", InfiMaterialEnum.Copper.getHarvestLevel());
            MinecraftForge.setToolClass(copperCopperHoe, "hoe", InfiMaterialEnum.Copper.getHarvestLevel());
        }
        
        if(PropsHelperInfiMetals.enableBronzeTools)
        {
            stoneBronzeHoe = new MetalToolHoe(PropsHelperInfiMetals.bronzeHoeID+0, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Stone, "stoneBronzeHoe");
            boneBronzeHoe = new MetalToolHoe(PropsHelperInfiMetals.bronzeHoeID+1, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Bone, "boneBronzeHoe");
            netherrackBronzeHoe = new MetalToolHoe(PropsHelperInfiMetals.bronzeHoeID+2, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Netherrack, "netherrackBronzeHoe");
            slimeBronzeHoe = new MetalToolHoe(PropsHelperInfiMetals.bronzeHoeID+3, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Slime, "slimeBronzeHoe");
            cactusBronzeHoe = new MetalToolHoe(PropsHelperInfiMetals.bronzeHoeID+4, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Cactus, "cactusBronzeHoe");
            flintBronzeHoe = new MetalToolHoe(PropsHelperInfiMetals.bronzeHoeID+5, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Flint, "flintBronzeHoe");
            copperBronzeHoe = new MetalToolHoe(PropsHelperInfiMetals.bronzeHoeID+6, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Copper, "copperBronzeHoe");
            bronzeBronzeHoe = new MetalToolHoe(PropsHelperInfiMetals.bronzeHoeID+7, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Bronze, "copperBronzeHoe");
            
            MinecraftForge.setToolClass(stoneBronzeHoe, "hoe", InfiMaterialEnum.Bronze.getHarvestLevel());
            MinecraftForge.setToolClass(boneBronzeHoe, "hoe", InfiMaterialEnum.Bronze.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackBronzeHoe, "hoe", InfiMaterialEnum.Bronze.getHarvestLevel());
            MinecraftForge.setToolClass(slimeBronzeHoe, "hoe", InfiMaterialEnum.Bronze.getHarvestLevel());
            MinecraftForge.setToolClass(cactusBronzeHoe, "hoe", InfiMaterialEnum.Bronze.getHarvestLevel());
            MinecraftForge.setToolClass(flintBronzeHoe, "hoe", InfiMaterialEnum.Bronze.getHarvestLevel());
            MinecraftForge.setToolClass(copperBronzeHoe, "hoe", InfiMaterialEnum.Bronze.getHarvestLevel());
            MinecraftForge.setToolClass(bronzeBronzeHoe, "hoe", InfiMaterialEnum.Bronze.getHarvestLevel());
        }
        
        if(PropsHelperInfiMetals.enableWorkedIronTools)
        {
            stoneWorkedIronHoe = new MetalToolHoe(PropsHelperInfiMetals.workedIronHoeID+0, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Stone, "stoneWorkedIronHoe");
            ironWorkedIronHoe = new MetalToolHoe(PropsHelperInfiMetals.workedIronHoeID+1, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Iron, "ironWorkedIronHoe");
            diamondWorkedIronHoe = new MetalToolHoe(PropsHelperInfiMetals.workedIronHoeID+2, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Diamond, "diamondWorkedIronHoe");
            goldWorkedIronHoe = new MetalToolHoe(PropsHelperInfiMetals.workedIronHoeID+3, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Gold, "goldWorkedIronHoe");
            redstoneWorkedIronHoe = new MetalToolHoe(PropsHelperInfiMetals.workedIronHoeID+4, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Redstone, "redstoneWorkedIronHoe");
            obsidianWorkedIronHoe = new MetalToolHoe(PropsHelperInfiMetals.workedIronHoeID+5, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Obsidian, "obsidianWorkedIronHoe");
            boneWorkedIronHoe = new MetalToolHoe(PropsHelperInfiMetals.workedIronHoeID+6, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Bone, "boneWorkedIronHoe");
            netherrackWorkedIronHoe = new MetalToolHoe(PropsHelperInfiMetals.workedIronHoeID+7, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Netherrack, "netherrackWorkedIronHoe");
            glowstoneWorkedIronHoe = new MetalToolHoe(PropsHelperInfiMetals.workedIronHoeID+8, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Glowstone, "glowstoneWorkedIronHoe");
            iceWorkedIronHoe = new MetalToolHoe(PropsHelperInfiMetals.workedIronHoeID+9, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Ice, "iceWorkedIronHoe");
            slimeWorkedIronHoe = new MetalToolHoe(PropsHelperInfiMetals.workedIronHoeID+10, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Slime, "slimeWorkedIronHoe");
            cactusWorkedIronHoe = new MetalToolHoe(PropsHelperInfiMetals.workedIronHoeID+11, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Cactus, "cactusWorkedIronHoe");
            blazeWorkedIronHoe = new MetalToolHoe(PropsHelperInfiMetals.workedIronHoeID+12, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Blaze, "blazeWorkedIronHoe");
            copperWorkedIronHoe = new MetalToolHoe(PropsHelperInfiMetals.workedIronHoeID+13, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Copper, "copperWorkedIronHoe");
            bronzeWorkedIronHoe = new MetalToolHoe(PropsHelperInfiMetals.workedIronHoeID+14, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Bronze, "bronzeWorkedIronHoe");
            workedWorkedIronHoe = new MetalToolHoe(PropsHelperInfiMetals.workedIronHoeID+15, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.WorkedIron, "workedWorkedIronHoe");
            steelWorkedIronHoe = new MetalToolHoe(PropsHelperInfiMetals.workedIronHoeID+16, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Steel, "steelWorkedIronHoe");
            cobaltWorkedIronHoe = new MetalToolHoe(PropsHelperInfiMetals.workedIronHoeID+17, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Cobalt, "cobaltWorkedIronHoe");
            arditeWorkedIronHoe = new MetalToolHoe(PropsHelperInfiMetals.workedIronHoeID+18, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Ardite, "arditeWorkedIronHoe");
            uraniumWorkedIronHoe = new MetalToolHoe(PropsHelperInfiMetals.workedIronHoeID+19, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Bronze, "uraniumWorkedIronHoe");
            
            MinecraftForge.setToolClass(stoneWorkedIronHoe, "hoe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(ironWorkedIronHoe, "hoe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(diamondWorkedIronHoe, "hoe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(goldWorkedIronHoe, "hoe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(redstoneWorkedIronHoe, "hoe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(obsidianWorkedIronHoe, "hoe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(boneWorkedIronHoe, "hoe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackWorkedIronHoe, "hoe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(glowstoneWorkedIronHoe, "hoe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(iceWorkedIronHoe, "hoe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(slimeWorkedIronHoe, "hoe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(cactusWorkedIronHoe, "hoe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(blazeWorkedIronHoe, "hoe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(copperWorkedIronHoe, "hoe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(bronzeWorkedIronHoe, "hoe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(workedWorkedIronHoe, "hoe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(steelWorkedIronHoe, "hoe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(cobaltWorkedIronHoe, "hoe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(arditeWorkedIronHoe, "hoe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(uraniumWorkedIronHoe, "hoe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
        }
        
        if(PropsHelperInfiMetals.enableSteelTools)
        {
            stoneSteelHoe = new MetalToolHoe(PropsHelperInfiMetals.steelHoeID+0, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Stone, "stoneSteelHoe");
            ironSteelHoe = new MetalToolHoe(PropsHelperInfiMetals.steelHoeID+1, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Iron, "ironSteelHoe");
            diamondSteelHoe = new MetalToolHoe(PropsHelperInfiMetals.steelHoeID+2, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Diamond, "diamondSteelHoe");
            goldSteelHoe = new MetalToolHoe(PropsHelperInfiMetals.steelHoeID+3, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Gold, "goldSteelHoe");
            redstoneSteelHoe = new MetalToolHoe(PropsHelperInfiMetals.steelHoeID+4, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Redstone, "redstoneSteelHoe");
            obsidianSteelHoe = new MetalToolHoe(PropsHelperInfiMetals.steelHoeID+5, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Obsidian, "obsidianSteelHoe");
            boneSteelHoe = new MetalToolHoe(PropsHelperInfiMetals.steelHoeID+6, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Bone, "boneSteelHoe");
            netherrackSteelHoe = new MetalToolHoe(PropsHelperInfiMetals.steelHoeID+7, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Netherrack, "netherrackSteelHoe");
            glowstoneSteelHoe = new MetalToolHoe(PropsHelperInfiMetals.steelHoeID+8, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Glowstone, "glowstoneSteelHoe");
            iceSteelHoe = new MetalToolHoe(PropsHelperInfiMetals.steelHoeID+9, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Ice, "iceSteelHoe");
            slimeSteelHoe = new MetalToolHoe(PropsHelperInfiMetals.steelHoeID+10, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Slime, "slimeSteelHoe");
            cactusSteelHoe = new MetalToolHoe(PropsHelperInfiMetals.steelHoeID+11, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Cactus, "cactusSteelHoe");
            blazeSteelHoe = new MetalToolHoe(PropsHelperInfiMetals.steelHoeID+12, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Blaze, "blazeSteelHoe");
            copperSteelHoe = new MetalToolHoe(PropsHelperInfiMetals.steelHoeID+13, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Copper, "copperSteelHoe");
            bronzeSteelHoe = new MetalToolHoe(PropsHelperInfiMetals.steelHoeID+14, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Bronze, "bronzeSteelHoe");
            workedSteelHoe = new MetalToolHoe(PropsHelperInfiMetals.steelHoeID+15, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.WorkedIron, "workedSteelHoe");
            steelSteelHoe = new MetalToolHoe(PropsHelperInfiMetals.steelHoeID+16, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Steel, "steelSteelHoe");
            cobaltSteelHoe = new MetalToolHoe(PropsHelperInfiMetals.steelHoeID+17, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Cobalt, "cobaltSteelHoe");
            arditeSteelHoe = new MetalToolHoe(PropsHelperInfiMetals.steelHoeID+18, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Ardite, "arditeSteelHoe");
            uraniumSteelHoe = new MetalToolHoe(PropsHelperInfiMetals.steelHoeID+19, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Bronze, "uraniumSteelHoe");

            MinecraftForge.setToolClass(stoneSteelHoe, "hoe", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(ironSteelHoe, "hoe", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(diamondSteelHoe, "hoe", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(goldSteelHoe, "hoe", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(redstoneSteelHoe, "hoe", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(obsidianSteelHoe, "hoe", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(boneSteelHoe, "hoe", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackSteelHoe, "hoe", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(glowstoneSteelHoe, "hoe", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(iceSteelHoe, "hoe", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(slimeSteelHoe, "hoe", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(cactusSteelHoe, "hoe", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(blazeSteelHoe, "hoe", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(copperSteelHoe, "hoe", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(bronzeSteelHoe, "hoe", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(workedSteelHoe, "hoe", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(steelSteelHoe, "hoe", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(cobaltSteelHoe, "hoe", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(arditeSteelHoe, "hoe", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(uraniumSteelHoe, "hoe", InfiMaterialEnum.Steel.getHarvestLevel());
        }
        
        if(PropsHelperInfiMetals.enableCobaltTools)
        {
            stoneCobaltHoe = new MetalToolHoe(PropsHelperInfiMetals.cobaltHoeID+0, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Stone, "stoneCobaltHoe");
            ironCobaltHoe = new MetalToolHoe(PropsHelperInfiMetals.cobaltHoeID+1, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Iron, "ironCobaltHoe");
            diamondCobaltHoe = new MetalToolHoe(PropsHelperInfiMetals.cobaltHoeID+2,
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Gold, "goldCobaltHoe");
            redstoneCobaltHoe = new MetalToolHoe(PropsHelperInfiMetals.cobaltHoeID+4, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Redstone, "redstoneCobaltHoe");
            obsidianCobaltHoe = new MetalToolHoe(PropsHelperInfiMetals.cobaltHoeID+5, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Obsidian, "obsidianCobaltHoe");
            boneCobaltHoe = new MetalToolHoe(PropsHelperInfiMetals.cobaltHoeID+6, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Bone, "boneCobaltHoe");
            slimeCobaltHoe = new MetalToolHoe(PropsHelperInfiMetals.cobaltHoeID+7, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Slime, "slimeCobaltHoe");
            cactusCobaltHoe = new MetalToolHoe(PropsHelperInfiMetals.cobaltHoeID+8, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Cactus, "cactusCobaltHoe");
            blazeCobaltHoe = new MetalToolHoe(PropsHelperInfiMetals.cobaltHoeID+9, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Blaze, "blazeCobaltHoe");
            copperCobaltHoe = new MetalToolHoe(PropsHelperInfiMetals.cobaltHoeID+10, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Copper, "copperCobaltHoe");
            bronzeCobaltHoe = new MetalToolHoe(PropsHelperInfiMetals.cobaltHoeID+11, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Bronze, "bronzeCobaltHoe");
            workedCobaltHoe = new MetalToolHoe(PropsHelperInfiMetals.cobaltHoeID+12, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.WorkedIron, "workedCobaltHoe");
            steelCobaltHoe = new MetalToolHoe(PropsHelperInfiMetals.cobaltHoeID+13, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Steel, "steelCobaltHoe");
            cobaltCobaltHoe = new MetalToolHoe(PropsHelperInfiMetals.cobaltHoeID+14, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Cobalt, "cobaltCobaltHoe");
            arditeCobaltHoe = new MetalToolHoe(PropsHelperInfiMetals.cobaltHoeID+15, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Ardite, "arditeCobaltHoe");
            manyullynCobaltHoe = new MetalToolHoe(PropsHelperInfiMetals.cobaltHoeID+16, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Manyullyn, "arditeCobaltHoe");
            uraniumCobaltHoe = new MetalToolHoe(PropsHelperInfiMetals.cobaltHoeID+17, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Bronze, "uraniumCobaltHoe");
            
            MinecraftForge.setToolClass(stoneCobaltHoe, "hoe", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(ironCobaltHoe, "hoe", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(diamondCobaltHoe, "hoe", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(redstoneCobaltHoe, "hoe", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(obsidianCobaltHoe, "hoe", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(boneCobaltHoe, "hoe", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(slimeCobaltHoe, "hoe", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(cactusCobaltHoe, "hoe", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(blazeCobaltHoe, "hoe", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(copperCobaltHoe, "hoe", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(bronzeCobaltHoe, "hoe", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(workedCobaltHoe, "hoe", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(steelCobaltHoe, "hoe", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(cobaltCobaltHoe, "hoe", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(arditeCobaltHoe, "hoe", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(manyullynCobaltHoe, "hoe", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(uraniumCobaltHoe, "hoe", InfiMaterialEnum.Cobalt.getHarvestLevel());
        }
        
        if(PropsHelperInfiMetals.enableArditeTools)
        {
            stoneArditeHoe = new MetalToolHoe(PropsHelperInfiMetals.arditeHoeID+0, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Stone, "stoneArditeHoe");
            ironArditeHoe = new MetalToolHoe(PropsHelperInfiMetals.arditeHoeID+1, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Iron, "ironArditeHoe");
            diamondArditeHoe = new MetalToolHoe(PropsHelperInfiMetals.arditeHoeID+2,
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Gold, "goldArditeHoe");
            redstoneArditeHoe = new MetalToolHoe(PropsHelperInfiMetals.arditeHoeID+4, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Redstone, "redstoneArditeHoe");
            obsidianArditeHoe = new MetalToolHoe(PropsHelperInfiMetals.arditeHoeID+5, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Obsidian, "obsidianArditeHoe");
            boneArditeHoe = new MetalToolHoe(PropsHelperInfiMetals.arditeHoeID+6, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Bone, "boneArditeHoe");
            slimeArditeHoe = new MetalToolHoe(PropsHelperInfiMetals.arditeHoeID+7, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Slime, "slimeArditeHoe");
            cactusArditeHoe = new MetalToolHoe(PropsHelperInfiMetals.arditeHoeID+8, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Cactus, "cactusArditeHoe");
            blazeArditeHoe = new MetalToolHoe(PropsHelperInfiMetals.arditeHoeID+9, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Blaze, "blazeArditeHoe");
            copperArditeHoe = new MetalToolHoe(PropsHelperInfiMetals.arditeHoeID+10, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Copper, "copperArditeHoe");
            bronzeArditeHoe = new MetalToolHoe(PropsHelperInfiMetals.arditeHoeID+11, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Bronze, "bronzeArditeHoe");
            workedArditeHoe = new MetalToolHoe(PropsHelperInfiMetals.arditeHoeID+12, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.WorkedIron, "workedArditeHoe");
            steelArditeHoe = new MetalToolHoe(PropsHelperInfiMetals.arditeHoeID+13, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Steel, "steelArditeHoe");
            cobaltArditeHoe = new MetalToolHoe(PropsHelperInfiMetals.arditeHoeID+14, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Cobalt, "cobaltArditeHoe");
            arditeArditeHoe = new MetalToolHoe(PropsHelperInfiMetals.arditeHoeID+15, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Ardite, "arditeArditeHoe");
            manyullynArditeHoe = new MetalToolHoe(PropsHelperInfiMetals.arditeHoeID+16, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Manyullyn, "arditeArditeHoe");
            uraniumArditeHoe = new MetalToolHoe(PropsHelperInfiMetals.arditeHoeID+17, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Bronze, "uraniumArditeHoe");
            
            MinecraftForge.setToolClass(stoneArditeHoe, "hoe", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(ironArditeHoe, "hoe", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(diamondArditeHoe, "hoe", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(redstoneArditeHoe, "hoe", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(obsidianArditeHoe, "hoe", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(boneArditeHoe, "hoe", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(slimeArditeHoe, "hoe", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(cactusArditeHoe, "hoe", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(blazeArditeHoe, "hoe", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(copperArditeHoe, "hoe", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(bronzeArditeHoe, "hoe", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(workedArditeHoe, "hoe", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(steelArditeHoe, "hoe", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(cobaltArditeHoe, "hoe", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(arditeArditeHoe, "hoe", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(manyullynArditeHoe, "hoe", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(uraniumArditeHoe, "hoe", InfiMaterialEnum.Ardite.getHarvestLevel());
        }
        
        if(PropsHelperInfiMetals.enableManyullynTools)
        {
            stoneManyullynHoe = new MetalToolHoe(PropsHelperInfiMetals.manyullynHoeID+0, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Stone, "stoneManyullynHoe");
            ironManyullynHoe = new MetalToolHoe(PropsHelperInfiMetals.manyullynHoeID+1, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Iron, "ironManyullynHoe");
            diamondManyullynHoe = new MetalToolHoe(PropsHelperInfiMetals.manyullynHoeID+2,
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Gold, "goldManyullynHoe");
            redstoneManyullynHoe = new MetalToolHoe(PropsHelperInfiMetals.manyullynHoeID+4, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Redstone, "redstoneManyullynHoe");
            obsidianManyullynHoe = new MetalToolHoe(PropsHelperInfiMetals.manyullynHoeID+5, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Obsidian, "obsidianManyullynHoe");
            boneManyullynHoe = new MetalToolHoe(PropsHelperInfiMetals.manyullynHoeID+6, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Bone, "boneManyullynHoe");
            slimeManyullynHoe = new MetalToolHoe(PropsHelperInfiMetals.manyullynHoeID+7, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Slime, "slimeManyullynHoe");
            cactusManyullynHoe = new MetalToolHoe(PropsHelperInfiMetals.manyullynHoeID+8, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Cactus, "cactusManyullynHoe");
            blazeManyullynHoe = new MetalToolHoe(PropsHelperInfiMetals.manyullynHoeID+9, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Blaze, "blazeManyullynHoe");
            copperManyullynHoe = new MetalToolHoe(PropsHelperInfiMetals.manyullynHoeID+10, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Copper, "copperManyullynHoe");
            bronzeManyullynHoe = new MetalToolHoe(PropsHelperInfiMetals.manyullynHoeID+11, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Bronze, "bronzeManyullynHoe");
            workedManyullynHoe = new MetalToolHoe(PropsHelperInfiMetals.manyullynHoeID+12, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.WorkedIron, "workedManyullynHoe");
            steelManyullynHoe = new MetalToolHoe(PropsHelperInfiMetals.manyullynHoeID+13, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Steel, "steelManyullynHoe");
            cobaltManyullynHoe = new MetalToolHoe(PropsHelperInfiMetals.manyullynHoeID+14, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Cobalt, "cobaltManyullynHoe");
            arditeManyullynHoe = new MetalToolHoe(PropsHelperInfiMetals.manyullynHoeID+15, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Ardite, "arditeManyullynHoe");
            manyullynManyullynHoe = new MetalToolHoe(PropsHelperInfiMetals.manyullynHoeID+16, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Manyullyn, "arditeManyullynHoe");
            uraniumManyullynHoe = new MetalToolHoe(PropsHelperInfiMetals.manyullynHoeID+17,
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Bronze, "uraniumManyullynHoe");
            
            MinecraftForge.setToolClass(stoneManyullynHoe, "hoe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(ironManyullynHoe, "hoe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(diamondManyullynHoe, "hoe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(redstoneManyullynHoe, "hoe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(obsidianManyullynHoe, "hoe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(boneManyullynHoe, "hoe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(slimeManyullynHoe, "hoe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(cactusManyullynHoe, "hoe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(blazeManyullynHoe, "hoe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(copperManyullynHoe, "hoe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(bronzeManyullynHoe, "hoe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(workedManyullynHoe, "hoe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(steelManyullynHoe, "hoe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(cobaltManyullynHoe, "hoe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(arditeManyullynHoe, "hoe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(manyullynManyullynHoe, "hoe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(uraniumManyullynHoe, "hoe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
        }
        
        if(PropsHelperInfiMetals.enableUraniumTools)
        {
            diamondUraniumHoe = new MetalToolHoe(PropsHelperInfiMetals.uraniumHoeID+0, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Diamond, "diamondUraniumHoe");
            redstoneUraniumHoe = new MetalToolHoe(PropsHelperInfiMetals.uraniumHoeID+1, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Redstone, "redstoneUraniumHoe");
            boneUraniumHoe = new MetalToolHoe(PropsHelperInfiMetals.uraniumHoeID+2, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Bone, "boneUraniumHoe");
            netherrackUraniumHoe = new MetalToolHoe(PropsHelperInfiMetals.uraniumHoeID+3, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Netherrack, "netherrackUraniumHoe");
            glowstoneUraniumHoe = new MetalToolHoe(PropsHelperInfiMetals.uraniumHoeID+4, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Glowstone, "glowstoneUraniumHoe");
            lavaUraniumHoe = new MetalToolHoe(PropsHelperInfiMetals.uraniumHoeID+5, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Lava, "lavaUraniumHoe");
            blazeUraniumHoe = new MetalToolHoe(PropsHelperInfiMetals.uraniumHoeID+6, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Blaze, "blazeUraniumHoe");
            cobaltUraniumHoe = new MetalToolHoe(PropsHelperInfiMetals.uraniumHoeID+7, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Cobalt, "cobaltUraniumHoe");
            arditeUraniumHoe = new MetalToolHoe(PropsHelperInfiMetals.uraniumHoeID+8, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Ardite, "arditeUraniumHoe");
            uraniumUraniumHoe = new MetalToolHoe(PropsHelperInfiMetals.uraniumHoeID+9, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Uranium, "uraniumUraniumHoe");
            
            MinecraftForge.setToolClass(diamondUraniumHoe, "hoe", InfiMaterialEnum.Uranium.getHarvestLevel());
            MinecraftForge.setToolClass(redstoneUraniumHoe, "hoe", InfiMaterialEnum.Uranium.getHarvestLevel());
            MinecraftForge.setToolClass(boneUraniumHoe, "hoe", InfiMaterialEnum.Uranium.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackUraniumHoe, "hoe", InfiMaterialEnum.Uranium.getHarvestLevel());
            MinecraftForge.setToolClass(glowstoneUraniumHoe, "hoe", InfiMaterialEnum.Uranium.getHarvestLevel());
            MinecraftForge.setToolClass(lavaUraniumHoe, "hoe", InfiMaterialEnum.Uranium.getHarvestLevel());
            MinecraftForge.setToolClass(blazeUraniumHoe, "hoe", InfiMaterialEnum.Uranium.getHarvestLevel());
            MinecraftForge.setToolClass(cobaltUraniumHoe, "hoe", InfiMaterialEnum.Uranium.getHarvestLevel());
            MinecraftForge.setToolClass(arditeUraniumHoe, "hoe", InfiMaterialEnum.Uranium.getHarvestLevel());
            MinecraftForge.setToolClass(uraniumUraniumHoe, "hoe", InfiMaterialEnum.Uranium.getHarvestLevel());
        }
        
        if(PropsHelperInfiMetals.enableStoneTools)
        {
            copperStoneHoe = new MetalToolHoe(PropsHelperInfiMetals.stoneHoeID+0, 
                    InfiMaterialEnum.Stone, InfiMaterialEnum.Copper, "copperStoneHoe");
            
            MinecraftForge.setToolClass(copperStoneHoe, "hoe", InfiMaterialEnum.Stone.getHarvestLevel());
        }
        
        if(PropsHelperInfiMetals.enableIronTools)
        {
            copperIronHoe = new MetalToolHoe(PropsHelperInfiMetals.ironHoeID+0, 
                    InfiMaterialEnum.Iron, InfiMaterialEnum.Copper, "copperIronHoe");
            bronzeIronHoe = new MetalToolHoe(PropsHelperInfiMetals.ironHoeID+1, 
                    InfiMaterialEnum.Iron, InfiMaterialEnum.Bronze, "bronzeIronHoe");
            workedIronHoe = new MetalToolHoe(PropsHelperInfiMetals.ironHoeID+2, 
                    InfiMaterialEnum.Iron, InfiMaterialEnum.WorkedIron, "workedIronHoe");
            
            MinecraftForge.setToolClass(copperIronHoe, "hoe", InfiMaterialEnum.Iron.getHarvestLevel());
            MinecraftForge.setToolClass(bronzeIronHoe, "hoe", InfiMaterialEnum.Iron.getHarvestLevel());
            MinecraftForge.setToolClass(workedIronHoe, "hoe", InfiMaterialEnum.Iron.getHarvestLevel());
        }
        
        if(PropsHelperInfiMetals.enableDiamondTools)
        {
            copperDiamondHoe = new MetalToolHoe(PropsHelperInfiMetals.diamondHoeID+0, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Copper, "copperDiamondHoe");
            bronzeDiamondHoe = new MetalToolHoe(PropsHelperInfiMetals.diamondHoeID+1, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Bronze, "bronzeDiamondHoe");
            workedDiamondHoe = new MetalToolHoe(PropsHelperInfiMetals.diamondHoeID+2, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.WorkedIron, "workedDiamondHoe");
            steelDiamondHoe = new MetalToolHoe(PropsHelperInfiMetals.diamondHoeID+3, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Steel, "steelDiamondHoe");
            cobaltDiamondHoe = new MetalToolHoe(PropsHelperInfiMetals.diamondHoeID+4, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Cobalt, "cobaltDiamondHoe");
            arditeDiamondHoe = new MetalToolHoe(PropsHelperInfiMetals.diamondHoeID+5, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Ardite, "arditeDiamondHoe");
            manyullynDiamondHoe = new MetalToolHoe(PropsHelperInfiMetals.diamondHoeID+6, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Manyullyn, "manyullynDiamondHoe");
            uraniumDiamondHoe = new MetalToolHoe(PropsHelperInfiMetals.diamondHoeID+7, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Uranium, "uraniumDiamondHoe");
            
            MinecraftForge.setToolClass(copperDiamondHoe, "hoe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(bronzeDiamondHoe, "hoe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(workedDiamondHoe, "hoe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(steelDiamondHoe, "hoe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(cobaltDiamondHoe, "hoe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(arditeDiamondHoe, "hoe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(manyullynDiamondHoe, "hoe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(uraniumDiamondHoe, "hoe", InfiMaterialEnum.Diamond.getHarvestLevel());
        }
        
        if(PropsHelperInfiMetals.enableRedstoneTools)
        {
            copperRedstoneHoe = new MetalToolHoe(PropsHelperInfiMetals.redstoneHoeID+0, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Copper, "copperRedstoneHoe");
            bronzeRedstoneHoe = new MetalToolHoe(PropsHelperInfiMetals.redstoneHoeID+1, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Bronze, "bronzeRedstoneHoe");
            workedRedstoneHoe = new MetalToolHoe(PropsHelperInfiMetals.redstoneHoeID+2, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.WorkedIron, "workedRedstoneHoe");
            
            MinecraftForge.setToolClass(copperRedstoneHoe, "hoe", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(bronzeRedstoneHoe, "hoe", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(workedRedstoneHoe, "hoe", InfiMaterialEnum.Redstone.getHarvestLevel());
        }
        
        if(PropsHelperInfiMetals.enableMossyTools)
        {
            cobaltMossyHoe = new MetalToolHoe(PropsHelperInfiMetals.mossyHoeID+0, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Cobalt, "cobaltMossyHoe");
            arditeMossyHoe = new MetalToolHoe(PropsHelperInfiMetals.mossyHoeID+1, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Ardite, "arditeMossyHoe");
            manyullynMossyHoe = new MetalToolHoe(PropsHelperInfiMetals.mossyHoeID+2, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Manyullyn, "manyullynMossyHoe");
            
            MinecraftForge.setToolClass(cobaltMossyHoe, "hoe", InfiMaterialEnum.Mossy.getHarvestLevel());
            MinecraftForge.setToolClass(arditeMossyHoe, "hoe", InfiMaterialEnum.Mossy.getHarvestLevel());
            MinecraftForge.setToolClass(manyullynMossyHoe, "hoe", InfiMaterialEnum.Mossy.getHarvestLevel());
        }
        
        if(PropsHelperInfiMetals.enableNetherrackTools)
        {
            copperNetherrackHoe = new MetalToolHoe(PropsHelperInfiMetals.netherrackHoeID+0, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Copper, "copperNetherrackHoe");
            
            MinecraftForge.setToolClass(copperNetherrackHoe, "hoe", InfiMaterialEnum.Netherrack.getHarvestLevel());
        }
        
        if(PropsHelperInfiMetals.enableGlowstoneTools)
        {
            copperGlowstoneHoe = new MetalToolHoe(PropsHelperInfiMetals.glowstoneHoeID+0, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Copper, "copperGlowstoneHoe");
            bronzeGlowstoneHoe = new MetalToolHoe(PropsHelperInfiMetals.glowstoneHoeID+1, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Bronze, "bronzeGlowstoneHoe");
            workedGlowstoneHoe = new MetalToolHoe(PropsHelperInfiMetals.glowstoneHoeID+2, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.WorkedIron, "workedGlowstoneHoe");
            steelGlowstoneHoe = new MetalToolHoe(PropsHelperInfiMetals.glowstoneHoeID+3, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Steel, "steelGlowstoneHoe");
            
            MinecraftForge.setToolClass(copperGlowstoneHoe, "hoe", InfiMaterialEnum.Glowstone.getHarvestLevel());
            MinecraftForge.setToolClass(bronzeGlowstoneHoe, "hoe", InfiMaterialEnum.Glowstone.getHarvestLevel());
            MinecraftForge.setToolClass(workedGlowstoneHoe, "hoe", InfiMaterialEnum.Glowstone.getHarvestLevel());
            MinecraftForge.setToolClass(steelGlowstoneHoe, "hoe", InfiMaterialEnum.Glowstone.getHarvestLevel());
        }
        
        if(PropsHelperInfiMetals.enableLavaTools)
        {
            cobaltLavaHoe = new MetalToolHoe(PropsHelperInfiMetals.lavaHoeID+0, 
                    InfiMaterialEnum.Lava, InfiMaterialEnum.Cobalt, "cobaltLavaHoe");
            arditeLavaHoe = new MetalToolHoe(PropsHelperInfiMetals.lavaHoeID+1, 
                    InfiMaterialEnum.Lava, InfiMaterialEnum.Ardite, "arditeLavaHoe");
            manyullynLavaHoe = new MetalToolHoe(PropsHelperInfiMetals.lavaHoeID+2, 
                    InfiMaterialEnum.Lava, InfiMaterialEnum.Manyullyn, "manyullynLavaHoe");
            uraniumLavaHoe = new MetalToolHoe(PropsHelperInfiMetals.lavaHoeID+3, 
                    InfiMaterialEnum.Lava, InfiMaterialEnum.Uranium, "uraniumLavaHoe");
            
            MinecraftForge.setToolClass(cobaltLavaHoe, "hoe", InfiMaterialEnum.Lava.getHarvestLevel());
            MinecraftForge.setToolClass(arditeLavaHoe, "hoe", InfiMaterialEnum.Lava.getHarvestLevel());
            MinecraftForge.setToolClass(manyullynLavaHoe, "hoe", InfiMaterialEnum.Lava.getHarvestLevel());
            MinecraftForge.setToolClass(uraniumLavaHoe, "hoe", InfiMaterialEnum.Lava.getHarvestLevel());
        }
        
        if(PropsHelperInfiMetals.enableSlimeTools)
        {
            copperSlimeHoe = new MetalToolHoe(PropsHelperInfiMetals.slimeHoeID+0, 
                    InfiMaterialEnum.Slime, InfiMaterialEnum.Copper, "copperSlimeHoe");
            bronzeSlimeHoe = new MetalToolHoe(PropsHelperInfiMetals.slimeHoeID+1, 
                    InfiMaterialEnum.Slime, InfiMaterialEnum.Bronze, "bronzeSlimeHoe");
            workedSlimeHoe = new MetalToolHoe(PropsHelperInfiMetals.slimeHoeID+2, 
                    InfiMaterialEnum.Slime, InfiMaterialEnum.WorkedIron, "workedSlimeHoe");
            steelSlimeHoe = new MetalToolHoe(PropsHelperInfiMetals.slimeHoeID+3, 
                    InfiMaterialEnum.Slime, InfiMaterialEnum.Steel, "steelSlimeHoe");
            cobaltSlimeHoe = new MetalToolHoe(PropsHelperInfiMetals.slimeHoeID+4, 
                    InfiMaterialEnum.Slime, InfiMaterialEnum.Cobalt, "cobaltSlimeHoe");
            arditeSlimeHoe = new MetalToolHoe(PropsHelperInfiMetals.slimeHoeID+5, 
                    InfiMaterialEnum.Slime, InfiMaterialEnum.Ardite, "arditeSlimeHoe");
            manyullynSlimeHoe = new MetalToolHoe(PropsHelperInfiMetals.slimeHoeID+6, 
                    InfiMaterialEnum.Slime, InfiMaterialEnum.Manyullyn, "manyullynSlimeHoe");
            uraniumSlimeHoe = new MetalToolHoe(PropsHelperInfiMetals.slimeHoeID+7, 
                    InfiMaterialEnum.Slime, InfiMaterialEnum.Uranium, "uraniumSlimeHoe");
            
            MinecraftForge.setToolClass(copperSlimeHoe, "hoe", InfiMaterialEnum.Slime.getHarvestLevel());
            MinecraftForge.setToolClass(bronzeSlimeHoe, "hoe", InfiMaterialEnum.Slime.getHarvestLevel());
            MinecraftForge.setToolClass(workedSlimeHoe, "hoe", InfiMaterialEnum.Slime.getHarvestLevel());
            MinecraftForge.setToolClass(steelSlimeHoe, "hoe", InfiMaterialEnum.Slime.getHarvestLevel());
            MinecraftForge.setToolClass(cobaltSlimeHoe, "hoe", InfiMaterialEnum.Slime.getHarvestLevel());
            MinecraftForge.setToolClass(arditeSlimeHoe, "hoe", InfiMaterialEnum.Slime.getHarvestLevel());
            MinecraftForge.setToolClass(manyullynSlimeHoe, "hoe", InfiMaterialEnum.Slime.getHarvestLevel());
            MinecraftForge.setToolClass(uraniumSlimeHoe, "hoe", InfiMaterialEnum.Slime.getHarvestLevel());
        }
        
        if(PropsHelperInfiMetals.enableFlintTools)
        {
            copperFlintHoe = new MetalToolHoe(PropsHelperInfiMetals.flintHoeID+0, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Copper, "copperFlintHoe");
            bronzeFlintHoe = new MetalToolHoe(PropsHelperInfiMetals.flintHoeID+1, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Bronze, "bronzeFlintHoe");
            
            MinecraftForge.setToolClass(copperFlintHoe, "hoe", InfiMaterialEnum.Flint.getHarvestLevel());
            MinecraftForge.setToolClass(bronzeFlintHoe, "hoe", InfiMaterialEnum.Flint.getHarvestLevel());
        }
        
        if(PropsHelperInfiMetals.enableBlazeTools)
        {
            cobaltBlazeHoe = new MetalToolHoe(PropsHelperInfiMetals.blazeHoeID+0, 
                    InfiMaterialEnum.Blaze, InfiMaterialEnum.Cobalt, "cobaltBlazeHoe");
            arditeBlazeHoe = new MetalToolHoe(PropsHelperInfiMetals.blazeHoeID+1, 
                    InfiMaterialEnum.Blaze, InfiMaterialEnum.Ardite, "arditeBlazeHoe");
            manyullynBlazeHoe = new MetalToolHoe(PropsHelperInfiMetals.blazeHoeID+2, 
                    InfiMaterialEnum.Blaze, InfiMaterialEnum.Manyullyn, "manyullynBlazeHoe");
            uraniumBlazeHoe = new MetalToolHoe(PropsHelperInfiMetals.blazeHoeID+3, 
                    InfiMaterialEnum.Blaze, InfiMaterialEnum.Uranium, "uraniumBlazeHoe");
            
            MinecraftForge.setToolClass(cobaltBlazeHoe, "hoe", InfiMaterialEnum.Blaze.getHarvestLevel());
            MinecraftForge.setToolClass(arditeBlazeHoe, "hoe", InfiMaterialEnum.Blaze.getHarvestLevel());
            MinecraftForge.setToolClass(manyullynBlazeHoe, "hoe", InfiMaterialEnum.Blaze.getHarvestLevel());
            MinecraftForge.setToolClass(uraniumBlazeHoe, "hoe", InfiMaterialEnum.Blaze.getHarvestLevel());
        }
    }
    
    private static void addNames()
    {
        ModLoader.addName(copperCopperHoe, "Orange-Tang Hoe");
        ModLoader.addName(bronzeBronzeHoe, "Polished Hoe");
        ModLoader.addName(workedWorkedIronHoe, "Reworked Iron Hoe");
        ModLoader.addName(steelSteelHoe, "Forge-Wrought Hoe");
        ModLoader.addName(cobaltCobaltHoe, "Beautiful Hoe");
        ModLoader.addName(arditeArditeHoe, "Rustic StoneDigger");
        ModLoader.addName(manyullynManyullynHoe, "False-Prophetic Hoe");
        ModLoader.addName(uraniumUraniumHoe, "Cancerous Hoe");
    }
    
    public static void registerInfiToolsRecipes()
    {
        if(PropsHelperInfiMetals.enableStoneTools)
        {
            ModLoader.addRecipe(new ItemStack(copperStoneHoe), new Object[] 
                    { "##", " |", " |", '#', Block.stone, '|', mod_InfiMetals.copperRod });
        }
        if(PropsHelperInfiMetals.enableIronTools)
        {
            ModLoader.addRecipe(new ItemStack(copperIronHoe), new Object[] 
                    { "##", " |", " |", '#', Item.ingotIron, '|', mod_InfiMetals.copperRod });
            ModLoader.addRecipe(new ItemStack(bronzeIronHoe), new Object[] 
                    { "##", " |", " |", '#', Item.ingotIron, '|', mod_InfiMetals.bronzeRod });
            ModLoader.addRecipe(new ItemStack(workedIronHoe), new Object[] 
                    { "##", " |", " |", '#', Item.ingotIron, '|', mod_InfiMetals.workedIronRod });
        }
        if(PropsHelperInfiMetals.enableDiamondTools)
        {
            ModLoader.addRecipe(new ItemStack(copperDiamondHoe), new Object[] 
                    { "##", " |", " |", '#', Item.diamond, '|', mod_InfiMetals.copperRod });
            ModLoader.addRecipe(new ItemStack(bronzeDiamondHoe), new Object[] 
                    { "##", " |", " |", '#', Item.diamond, '|', mod_InfiMetals.bronzeRod });
            ModLoader.addRecipe(new ItemStack(workedDiamondHoe), new Object[] 
                    { "##", " |", " |", '#', Item.diamond, '|', mod_InfiMetals.workedIronRod });
            ModLoader.addRecipe(new ItemStack(steelDiamondHoe), new Object[] 
                    { "##", " |", " |", '#', Item.diamond, '|', mod_InfiMetals.steelRod });
            ModLoader.addRecipe(new ItemStack(cobaltDiamondHoe), new Object[] 
                    { "##", " |", " |", '#', Item.diamond, '|', mod_InfiMetals.cobaltRod });
            ModLoader.addRecipe(new ItemStack(arditeDiamondHoe), new Object[] 
                    { "##", " |", " |", '#', Item.diamond, '|', mod_InfiMetals.arditeRod });
            ModLoader.addRecipe(new ItemStack(manyullynDiamondHoe), new Object[] 
                    { "##", " |", " |", '#', Item.diamond, '|', mod_InfiMetals.manyullynRod });
            ModLoader.addRecipe(new ItemStack(uraniumDiamondHoe), new Object[] 
                    { "##", " |", " |", '#', Item.diamond, '|', mod_InfiMetals.uraniumRod });
        }
        if(PropsHelperInfiMetals.enableMossyTools)
        {
            ModLoader.addRecipe(new ItemStack(cobaltMossyHoe), new Object[] 
                    { "##", " |", " |", '#', mod_InfiTools.mossBallCrafted, '|', mod_InfiMetals.cobaltRod });
            ModLoader.addRecipe(new ItemStack(arditeMossyHoe), new Object[] 
                    { "##", " |", " |", '#', mod_InfiTools.mossBallCrafted, '|', mod_InfiMetals.arditeRod });
            ModLoader.addRecipe(new ItemStack(manyullynMossyHoe), new Object[] 
                    { "##", " |", " |", '#', mod_InfiTools.mossBallCrafted, '|', mod_InfiMetals.manyullynRod });
        }
        if(PropsHelperInfiMetals.enableNetherrackTools)
        {
            ModLoader.addRecipe(new ItemStack(copperNetherrackHoe), new Object[] 
                    { "##", " |", " |", '#', Block.netherrack, '|', mod_InfiMetals.copperRod });
        }
        if(PropsHelperInfiMetals.enableFlintTools)
        {
            ModLoader.addRecipe(new ItemStack(copperFlintHoe), new Object[] 
                    { "##", " |", " |", '#', Block.netherrack, '|', mod_InfiMetals.copperRod });
            ModLoader.addRecipe(new ItemStack(bronzeFlintHoe), new Object[] 
                    { "##", " |", " |", '#', Block.netherrack, '|', mod_InfiMetals.bronzeRod });
        }
    }
    
    public static void addCopperTools(ItemStack stack)
    {
        ModLoader.addRecipe(new ItemStack(stoneCopperHoe), new Object[] 
                { "##", " |", " |", '#', stack, '|', mod_InfiTools.stoneRod });
        ModLoader.addRecipe(new ItemStack(boneCopperHoe), new Object[] 
                { "##", " |", " |", '#', stack, '|', Item.bone });
        ModLoader.addRecipe(new ItemStack(boneCopperHoe), new Object[] 
                { "##", " |", " |", '#', stack, '|', mod_InfiTools.boneRod });
        ModLoader.addRecipe(new ItemStack(netherrackCopperHoe), new Object[] 
                { "##", " |", " |", '#', stack, '|', mod_InfiTools.netherrackRod });
        ModLoader.addRecipe(new ItemStack(slimeCopperHoe), new Object[] 
                { "##", " |", " |", '#', stack, '|', mod_InfiTools.slimeRod });
        ModLoader.addRecipe(new ItemStack(cactusCopperHoe), new Object[] 
                { "##", " |", " |", '#', stack, '|', mod_InfiTools.cactusRod });
        ModLoader.addRecipe(new ItemStack(flintCopperHoe), new Object[] 
                { "##", " |", " |", '#', stack, '|', mod_InfiTools.flintRod });
        ModLoader.addRecipe(new ItemStack(copperCopperHoe), new Object[] 
                { "##", " |", " |", '#', stack, '|', mod_InfiMetals.copperRod });
    }
    
    public static void addBronzeTools(ItemStack stack)
    {
        ModLoader.addRecipe(new ItemStack(stoneBronzeHoe), new Object[] 
                { "##", " |", " |", '#', stack, '|', mod_InfiTools.stoneRod });
        ModLoader.addRecipe(new ItemStack(boneBronzeHoe), new Object[] 
                { "##", " |", " |", '#', stack, '|', Item.bone });
        ModLoader.addRecipe(new ItemStack(boneBronzeHoe), new Object[] 
                { "##", " |", " |", '#', stack, '|', mod_InfiTools.boneRod });
        ModLoader.addRecipe(new ItemStack(netherrackBronzeHoe), new Object[] 
                { "##", " |", " |", '#', stack, '|', mod_InfiTools.netherrackRod });
        ModLoader.addRecipe(new ItemStack(slimeBronzeHoe), new Object[] 
                { "##", " |", " |", '#', stack, '|', mod_InfiTools.slimeRod });
        ModLoader.addRecipe(new ItemStack(cactusBronzeHoe), new Object[] 
                { "##", " |", " |", '#', stack, '|', mod_InfiTools.cactusRod });
        ModLoader.addRecipe(new ItemStack(flintBronzeHoe), new Object[] 
                { "##", " |", " |", '#', stack, '|', mod_InfiTools.flintRod });
        ModLoader.addRecipe(new ItemStack(copperBronzeHoe), new Object[] 
                { "##", " |", " |", '#', stack, '|', mod_InfiMetals.copperRod });
        ModLoader.addRecipe(new ItemStack(bronzeBronzeHoe), new Object[] 
                { "##", " |", " |", '#', stack, '|', mod_InfiMetals.bronzeRod });
    }
    
    public static void addWorkedIronTools(ItemStack stack)
    {
        ModLoader.addRecipe(new ItemStack(stoneWorkedIronHoe), new Object[] 
                { "##", " |", " |", '#', stack, '|', mod_InfiTools.stoneRod });
        ModLoader.addRecipe(new ItemStack(ironWorkedIronHoe), new Object[] 
                { "##", " |", " |", '#', stack, '|', mod_InfiTools.ironRod });
        ModLoader.addRecipe(new ItemStack(diamondWorkedIronHoe), new Object[] 
                { "##", " |", " |", '#', stack, '|', mod_InfiTools.diamondRod });
        ModLoader.addRecipe(new ItemStack(goldWorkedIronHoe), new Object[] 
                { "##", " |", " |", '#', stack, '|', mod_InfiTools.goldRod });
        ModLoader.addRecipe(new ItemStack(redstoneWorkedIronHoe), new Object[] 
                { "##", " |", " |", '#', stack, '|', mod_InfiTools.redstoneRod });
        ModLoader.addRecipe(new ItemStack(obsidianWorkedIronHoe), new Object[] 
                { "##", " |", " |", '#', stack, '|', mod_InfiTools.obsidianRod });
        ModLoader.addRecipe(new ItemStack(boneWorkedIronHoe), new Object[] 
                { "##", " |", " |", '#', stack, '|', Item.bone });
        ModLoader.addRecipe(new ItemStack(boneWorkedIronHoe), new Object[] 
                { "##", " |", " |", '#', stack, '|', mod_InfiTools.boneRod });
        ModLoader.addRecipe(new ItemStack(netherrackWorkedIronHoe), new Object[] 
                { "##", " |", " |", '#', stack, '|', mod_InfiTools.netherrackRod });
        ModLoader.addRecipe(new ItemStack(glowstoneWorkedIronHoe), new Object[] 
                { "##", " |", " |", '#', stack, '|', mod_InfiTools.glowstoneRod });
        ModLoader.addRecipe(new ItemStack(iceWorkedIronHoe), new Object[] 
                { "##", " |", " |", '#', stack, '|', mod_InfiTools.iceRod });
        ModLoader.addRecipe(new ItemStack(slimeWorkedIronHoe), new Object[] 
                { "##", " |", " |", '#', stack, '|', mod_InfiTools.slimeRod });
        ModLoader.addRecipe(new ItemStack(cactusWorkedIronHoe), new Object[] 
                { "##", " |", " |", '#', stack, '|', mod_InfiTools.cactusRod });
        ModLoader.addRecipe(new ItemStack(blazeWorkedIronHoe), new Object[] 
                { "##", " |", " |", '#', stack, '|', Item.blazeRod });
        ModLoader.addRecipe(new ItemStack(copperWorkedIronHoe), new Object[] 
                { "##", " |", " |", '#', stack, '|', mod_InfiMetals.copperRod });
        ModLoader.addRecipe(new ItemStack(bronzeWorkedIronHoe), new Object[] 
                { "##", " |", " |", '#', stack, '|', mod_InfiMetals.bronzeRod });
        ModLoader.addRecipe(new ItemStack(workedWorkedIronHoe), new Object[] 
                { "##", " |", " |", '#', stack, '|', mod_InfiMetals.workedIronRod });
        ModLoader.addRecipe(new ItemStack(steelWorkedIronHoe), new Object[] 
                { "##", " |", " |", '#', stack, '|', mod_InfiMetals.steelRod });
        ModLoader.addRecipe(new ItemStack(cobaltWorkedIronHoe), new Object[] 
                { "##", " |", " |", '#', stack, '|', mod_InfiMetals.cobaltRod });
        ModLoader.addRecipe(new ItemStack(arditeWorkedIronHoe), new Object[] 
                { "##", " |", " |", '#', stack, '|', mod_InfiMetals.arditeRod });
        ModLoader.addRecipe(new ItemStack(uraniumWorkedIronHoe), new Object[] 
                { "##", " |", " |", '#', stack, '|', mod_InfiMetals.uraniumRod });
    }
    
    public static void addSteelTools(ItemStack stack)
    {
        ModLoader.addRecipe(new ItemStack(stoneSteelHoe), new Object[] 
                { "##", " |", " |", '#', stack, '|', mod_InfiTools.stoneRod });
        ModLoader.addRecipe(new ItemStack(ironSteelHoe), new Object[] 
                { "##", " |", " |", '#', stack, '|', mod_InfiTools.ironRod });
        ModLoader.addRecipe(new ItemStack(diamondSteelHoe), new Object[] 
                { "##", " |", " |", '#', stack, '|', mod_InfiTools.diamondRod });
        ModLoader.addRecipe(new ItemStack(goldSteelHoe), new Object[] 
                { "##", " |", " |", '#', stack, '|', mod_InfiTools.goldRod });
        ModLoader.addRecipe(new ItemStack(redstoneSteelHoe), new Object[] 
                { "##", " |", " |", '#', stack, '|', mod_InfiTools.redstoneRod });
        ModLoader.addRecipe(new ItemStack(obsidianSteelHoe), new Object[] 
                { "##", " |", " |", '#', stack, '|', mod_InfiTools.obsidianRod });
        ModLoader.addRecipe(new ItemStack(boneSteelHoe), new Object[] 
                { "##", " |", " |", '#', stack, '|', Item.bone });
        ModLoader.addRecipe(new ItemStack(boneSteelHoe), new Object[] 
                { "##", " |", " |", '#', stack, '|', mod_InfiTools.boneRod });
        ModLoader.addRecipe(new ItemStack(netherrackSteelHoe), new Object[] 
                { "##", " |", " |", '#', stack, '|', mod_InfiTools.netherrackRod });
        ModLoader.addRecipe(new ItemStack(glowstoneSteelHoe), new Object[] 
                { "##", " |", " |", '#', stack, '|', mod_InfiTools.glowstoneRod });
        ModLoader.addRecipe(new ItemStack(iceSteelHoe), new Object[] 
                { "##", " |", " |", '#', stack, '|', mod_InfiTools.iceRod });
        ModLoader.addRecipe(new ItemStack(slimeSteelHoe), new Object[] 
                { "##", " |", " |", '#', stack, '|', mod_InfiTools.slimeRod });
        ModLoader.addRecipe(new ItemStack(cactusSteelHoe), new Object[] 
                { "##", " |", " |", '#', stack, '|', mod_InfiTools.cactusRod });
        ModLoader.addRecipe(new ItemStack(blazeSteelHoe), new Object[] 
                { "##", " |", " |", '#', stack, '|', Item.blazeRod });
        ModLoader.addRecipe(new ItemStack(copperSteelHoe), new Object[] 
                { "##", " |", " |", '#', stack, '|', mod_InfiMetals.copperRod });
        ModLoader.addRecipe(new ItemStack(bronzeSteelHoe), new Object[] 
                { "##", " |", " |", '#', stack, '|', mod_InfiMetals.bronzeRod });
        ModLoader.addRecipe(new ItemStack(workedSteelHoe), new Object[] 
                { "##", " |", " |", '#', stack, '|', mod_InfiMetals.workedIronRod });
        ModLoader.addRecipe(new ItemStack(steelSteelHoe), new Object[] 
                { "##", " |", " |", '#', stack, '|', mod_InfiMetals.steelRod });
        ModLoader.addRecipe(new ItemStack(cobaltSteelHoe), new Object[] 
                { "##", " |", " |", '#', stack, '|', mod_InfiMetals.cobaltRod });
        ModLoader.addRecipe(new ItemStack(arditeSteelHoe), new Object[] 
                { "##", " |", " |", '#', stack, '|', mod_InfiMetals.arditeRod });
        ModLoader.addRecipe(new ItemStack(uraniumSteelHoe), new Object[] 
                { "##", " |", " |", '#', stack, '|', mod_InfiMetals.uraniumRod });
    }
    
    public static void addCobaltTools(ItemStack stack)
    {
        ModLoader.addRecipe(new ItemStack(stoneCobaltHoe), new Object[] 
                { "##", " |", " |", '#', stack, '|', mod_InfiTools.stoneRod });
        ModLoader.addRecipe(new ItemStack(ironCobaltHoe), new Object[] 
                { "##", " |", " |", '#', stack, '|', mod_InfiTools.ironRod });
        ModLoader.addRecipe(new ItemStack(diamondCobaltHoe), new Object[] 
                { "##", " |", " |", '#', stack, '|', mod_InfiTools.diamondRod });
        ModLoader.addRecipe(new ItemStack(redstoneCobaltHoe), new Object[] 
                { "##", " |", " |", '#', stack, '|', mod_InfiTools.redstoneRod });
        ModLoader.addRecipe(new ItemStack(obsidianCobaltHoe), new Object[] 
                { "##", " |", " |", '#', stack, '|', mod_InfiTools.obsidianRod });
        ModLoader.addRecipe(new ItemStack(boneCobaltHoe), new Object[] 
                { "##", " |", " |", '#', stack, '|', Item.bone });
        ModLoader.addRecipe(new ItemStack(boneCobaltHoe), new Object[] 
                { "##", " |", " |", '#', stack, '|', mod_InfiTools.boneRod });
        ModLoader.addRecipe(new ItemStack(slimeCobaltHoe), new Object[] 
                { "##", " |", " |", '#', stack, '|', mod_InfiTools.slimeRod });
        ModLoader.addRecipe(new ItemStack(cactusCobaltHoe), new Object[] 
                { "##", " |", " |", '#', stack, '|', mod_InfiTools.cactusRod });
        ModLoader.addRecipe(new ItemStack(blazeCobaltHoe), new Object[] 
                { "##", " |", " |", '#', stack, '|', Item.blazeRod });
        ModLoader.addRecipe(new ItemStack(copperCobaltHoe), new Object[] 
                { "##", " |", " |", '#', stack, '|', mod_InfiMetals.copperRod });
        ModLoader.addRecipe(new ItemStack(bronzeCobaltHoe), new Object[] 
                { "##", " |", " |", '#', stack, '|', mod_InfiMetals.bronzeRod });
        ModLoader.addRecipe(new ItemStack(workedCobaltHoe), new Object[] 
                { "##", " |", " |", '#', stack, '|', mod_InfiMetals.workedIronRod });
        ModLoader.addRecipe(new ItemStack(steelCobaltHoe), new Object[] 
                { "##", " |", " |", '#', stack, '|', mod_InfiMetals.steelRod });
        ModLoader.addRecipe(new ItemStack(cobaltCobaltHoe), new Object[] 
                { "##", " |", " |", '#', stack, '|', mod_InfiMetals.cobaltRod });
        ModLoader.addRecipe(new ItemStack(arditeCobaltHoe), new Object[] 
                { "##", " |", " |", '#', stack, '|', mod_InfiMetals.arditeRod });
        ModLoader.addRecipe(new ItemStack(manyullynCobaltHoe), new Object[] 
                { "##", " |", " |", '#', stack, '|', mod_InfiMetals.manyullynRod });
        ModLoader.addRecipe(new ItemStack(uraniumCobaltHoe), new Object[] 
                { "##", " |", " |", '#', stack, '|', mod_InfiMetals.uraniumRod });
    }
    
    public static void addArditeTools(ItemStack stack)
    {
        ModLoader.addRecipe(new ItemStack(stoneArditeHoe), new Object[] 
                { "##", " |", " |", '#', stack, '|', mod_InfiTools.stoneRod });
        ModLoader.addRecipe(new ItemStack(ironArditeHoe), new Object[] 
                { "##", " |", " |", '#', stack, '|', mod_InfiTools.ironRod });
        ModLoader.addRecipe(new ItemStack(diamondArditeHoe), new Object[] 
                { "##", " |", " |", '#', stack, '|', mod_InfiTools.diamondRod });
        ModLoader.addRecipe(new ItemStack(redstoneArditeHoe), new Object[] 
                { "##", " |", " |", '#', stack, '|', mod_InfiTools.redstoneRod });
        ModLoader.addRecipe(new ItemStack(obsidianArditeHoe), new Object[] 
                { "##", " |", " |", '#', stack, '|', mod_InfiTools.obsidianRod });
        ModLoader.addRecipe(new ItemStack(boneArditeHoe), new Object[] 
                { "##", " |", " |", '#', stack, '|', Item.bone });
        ModLoader.addRecipe(new ItemStack(boneArditeHoe), new Object[] 
                { "##", " |", " |", '#', stack, '|', mod_InfiTools.boneRod });
        ModLoader.addRecipe(new ItemStack(slimeArditeHoe), new Object[] 
                { "##", " |", " |", '#', stack, '|', mod_InfiTools.slimeRod });
        ModLoader.addRecipe(new ItemStack(cactusArditeHoe), new Object[] 
                { "##", " |", " |", '#', stack, '|', mod_InfiTools.cactusRod });
        ModLoader.addRecipe(new ItemStack(blazeArditeHoe), new Object[] 
                { "##", " |", " |", '#', stack, '|', Item.blazeRod });
        ModLoader.addRecipe(new ItemStack(copperArditeHoe), new Object[] 
                { "##", " |", " |", '#', stack, '|', mod_InfiMetals.copperRod });
        ModLoader.addRecipe(new ItemStack(bronzeArditeHoe), new Object[] 
                { "##", " |", " |", '#', stack, '|', mod_InfiMetals.bronzeRod });
        ModLoader.addRecipe(new ItemStack(workedArditeHoe), new Object[] 
                { "##", " |", " |", '#', stack, '|', mod_InfiMetals.workedIronRod });
        ModLoader.addRecipe(new ItemStack(steelArditeHoe), new Object[] 
                { "##", " |", " |", '#', stack, '|', mod_InfiMetals.steelRod });
        ModLoader.addRecipe(new ItemStack(cobaltArditeHoe), new Object[] 
                { "##", " |", " |", '#', stack, '|', mod_InfiMetals.cobaltRod });
        ModLoader.addRecipe(new ItemStack(arditeArditeHoe), new Object[] 
                { "##", " |", " |", '#', stack, '|', mod_InfiMetals.arditeRod });
        ModLoader.addRecipe(new ItemStack(manyullynArditeHoe), new Object[] 
                { "##", " |", " |", '#', stack, '|', mod_InfiMetals.manyullynRod });
        ModLoader.addRecipe(new ItemStack(uraniumArditeHoe), new Object[] 
                { "##", " |", " |", '#', stack, '|', mod_InfiMetals.uraniumRod });
    }
    
    public static void addManyullynTools(ItemStack stack)
    {
        ModLoader.addRecipe(new ItemStack(stoneManyullynHoe), new Object[] 
                { "##", " |", " |", '#', stack, '|', mod_InfiTools.stoneRod });
        ModLoader.addRecipe(new ItemStack(ironManyullynHoe), new Object[] 
                { "##", " |", " |", '#', stack, '|', mod_InfiTools.ironRod });
        ModLoader.addRecipe(new ItemStack(diamondManyullynHoe), new Object[] 
                { "##", " |", " |", '#', stack, '|', mod_InfiTools.diamondRod });
        ModLoader.addRecipe(new ItemStack(redstoneManyullynHoe), new Object[] 
                { "##", " |", " |", '#', stack, '|', mod_InfiTools.redstoneRod });
        ModLoader.addRecipe(new ItemStack(obsidianManyullynHoe), new Object[] 
                { "##", " |", " |", '#', stack, '|', mod_InfiTools.obsidianRod });
        ModLoader.addRecipe(new ItemStack(boneManyullynHoe), new Object[] 
                { "##", " |", " |", '#', stack, '|', Item.bone });
        ModLoader.addRecipe(new ItemStack(boneManyullynHoe), new Object[] 
                { "##", " |", " |", '#', stack, '|', mod_InfiTools.boneRod });
        ModLoader.addRecipe(new ItemStack(slimeManyullynHoe), new Object[] 
                { "##", " |", " |", '#', stack, '|', mod_InfiTools.slimeRod });
        ModLoader.addRecipe(new ItemStack(cactusManyullynHoe), new Object[] 
                { "##", " |", " |", '#', stack, '|', mod_InfiTools.cactusRod });
        ModLoader.addRecipe(new ItemStack(blazeManyullynHoe), new Object[] 
                { "##", " |", " |", '#', stack, '|', Item.blazeRod });
        ModLoader.addRecipe(new ItemStack(copperManyullynHoe), new Object[] 
                { "##", " |", " |", '#', stack, '|', mod_InfiMetals.copperRod });
        ModLoader.addRecipe(new ItemStack(bronzeManyullynHoe), new Object[] 
                { "##", " |", " |", '#', stack, '|', mod_InfiMetals.bronzeRod });
        ModLoader.addRecipe(new ItemStack(workedManyullynHoe), new Object[] 
                { "##", " |", " |", '#', stack, '|', mod_InfiMetals.workedIronRod });
        ModLoader.addRecipe(new ItemStack(steelManyullynHoe), new Object[] 
                { "##", " |", " |", '#', stack, '|', mod_InfiMetals.steelRod });
        ModLoader.addRecipe(new ItemStack(cobaltManyullynHoe), new Object[] 
                { "##", " |", " |", '#', stack, '|', mod_InfiMetals.cobaltRod });
        ModLoader.addRecipe(new ItemStack(arditeManyullynHoe), new Object[] 
                { "##", " |", " |", '#', stack, '|', mod_InfiMetals.arditeRod });
        ModLoader.addRecipe(new ItemStack(manyullynManyullynHoe), new Object[] 
                { "##", " |", " |", '#', stack, '|', mod_InfiMetals.manyullynRod });
        ModLoader.addRecipe(new ItemStack(uraniumManyullynHoe), new Object[] 
                { "##", " |", " |", '#', stack, '|', mod_InfiMetals.uraniumRod });
    }
    
    public static void addUraniumTools(ItemStack stack)
    {
        ModLoader.addRecipe(new ItemStack(diamondUraniumHoe), new Object[] 
                { "##", " |", " |", '#', stack, '|', mod_InfiTools.diamondRod });
        ModLoader.addRecipe(new ItemStack(redstoneUraniumHoe), new Object[] 
                { "##", " |", " |", '#', stack, '|', mod_InfiTools.redstoneRod });
        ModLoader.addRecipe(new ItemStack(boneUraniumHoe), new Object[] 
                { "##", " |", " |", '#', stack, '|', Item.bone });
        ModLoader.addRecipe(new ItemStack(boneUraniumHoe), new Object[] 
                { "##", " |", " |", '#', stack, '|', mod_InfiTools.boneRod });
        ModLoader.addRecipe(new ItemStack(netherrackUraniumHoe), new Object[] 
                { "##", " |", " |", '#', stack, '|', mod_InfiTools.netherrackRod });
        ModLoader.addRecipe(new ItemStack(glowstoneUraniumHoe), new Object[] 
                { "##", " |", " |", '#', stack, '|', mod_InfiTools.glowstoneRod });
        ModLoader.addRecipe(new ItemStack(lavaUraniumHoe), new Object[] 
                { "##", " |", " |", '#', stack, '|', mod_InfiTools.lavaRod });
        ModLoader.addRecipe(new ItemStack(blazeUraniumHoe), new Object[] 
                { "##", " |", " |", '#', stack, '|', Item.blazeRod });
        ModLoader.addRecipe(new ItemStack(cobaltUraniumHoe), new Object[] 
                { "##", " |", " |", '#', stack, '|', mod_InfiMetals.cobaltRod });
        ModLoader.addRecipe(new ItemStack(arditeUraniumHoe), new Object[] 
                { "##", " |", " |", '#', stack, '|', mod_InfiMetals.arditeRod });
        ModLoader.addRecipe(new ItemStack(uraniumUraniumHoe), new Object[] 
                { "##", " |", " |", '#', stack, '|', mod_InfiMetals.uraniumRod });
    }
    
    public static void addStoneTools(ItemStack stack)
    {
        ModLoader.addRecipe(new ItemStack(copperStoneHoe), new Object[] 
                { "##", " |", " |", '#', stack, '|', mod_InfiMetals.copperRod });
    }
    
    public static void addRedstoneTools(ItemStack stack)
    {
        if(PropsHelperInfiMetals.enableRedstoneTools)
        {
            ModLoader.addRecipe(new ItemStack(copperRedstoneHoe), new Object[] 
                    { "##", " |", " |", '#', stack, '|', mod_InfiMetals.copperRod });
            ModLoader.addRecipe(new ItemStack(bronzeRedstoneHoe), new Object[] 
                    { "##", " |", " |", '#', stack, '|', mod_InfiMetals.bronzeRod });
            ModLoader.addRecipe(new ItemStack(workedRedstoneHoe), new Object[] 
                    { "##", " |", " |", '#', stack, '|', mod_InfiMetals.workedIronRod });
        }
    }
    
    public static void addGlowstoneTools(ItemStack stack)
    {
        if(PropsHelperInfiMetals.enableGlowstoneTools)
        {
            ModLoader.addRecipe(new ItemStack(copperGlowstoneHoe), new Object[] 
                    { "##", " |", " |", '#', stack, '|', mod_InfiMetals.copperRod });
            ModLoader.addRecipe(new ItemStack(bronzeGlowstoneHoe), new Object[] 
                    { "##", " |", " |", '#', stack, '|', mod_InfiMetals.bronzeRod });
            ModLoader.addRecipe(new ItemStack(workedGlowstoneHoe), new Object[] 
                    { "##", " |", " |", '#', stack, '|', mod_InfiMetals.workedIronRod });
            ModLoader.addRecipe(new ItemStack(steelGlowstoneHoe), new Object[] 
                    { "##", " |", " |", '#', stack, '|', mod_InfiMetals.steelRod });
        }
    }
    
    public static void addLavaTools(ItemStack stack)
    {
        ModLoader.addRecipe(new ItemStack(cobaltLavaHoe), new Object[] 
                { "##", " |", " |", '#', stack, '|', mod_InfiMetals.cobaltRod });
        ModLoader.addRecipe(new ItemStack(arditeLavaHoe), new Object[] 
                { "##", " |", " |", '#', stack, '|', mod_InfiMetals.arditeRod });
        ModLoader.addRecipe(new ItemStack(manyullynLavaHoe), new Object[] 
                { "##", " |", " |", '#', stack, '|', mod_InfiMetals.manyullynRod });
        ModLoader.addRecipe(new ItemStack(uraniumLavaHoe), new Object[] 
                { "##", " |", " |", '#', stack, '|', mod_InfiMetals.uraniumRod });
    }
    
    public static void addSlimeTools(ItemStack stack)
    {
        ModLoader.addRecipe(new ItemStack(copperSlimeHoe), new Object[] 
                { "##", " |", " |", '#', stack, '|', mod_InfiMetals.copperRod });
        ModLoader.addRecipe(new ItemStack(bronzeSlimeHoe), new Object[] 
                { "##", " |", " |", '#', stack, '|', mod_InfiMetals.bronzeRod });
        ModLoader.addRecipe(new ItemStack(workedSlimeHoe), new Object[] 
                { "##", " |", " |", '#', stack, '|', mod_InfiMetals.workedIronRod });
        ModLoader.addRecipe(new ItemStack(steelSlimeHoe), new Object[] 
                { "##", " |", " |", '#', stack, '|', mod_InfiMetals.steelRod });
        ModLoader.addRecipe(new ItemStack(cobaltSlimeHoe), new Object[] 
                { "##", " |", " |", '#', stack, '|', mod_InfiMetals.cobaltRod });
        ModLoader.addRecipe(new ItemStack(arditeSlimeHoe), new Object[] 
                { "##", " |", " |", '#', stack, '|', mod_InfiMetals.arditeRod });
        ModLoader.addRecipe(new ItemStack(manyullynSlimeHoe), new Object[] 
                { "##", " |", " |", '#', stack, '|', mod_InfiMetals.manyullynRod });
        ModLoader.addRecipe(new ItemStack(uraniumSlimeHoe), new Object[] 
                { "##", " |", " |", '#', stack, '|', mod_InfiMetals.uraniumRod });
    }
    
    public static void addBlazeTools(ItemStack stack)
    {
        ModLoader.addRecipe(new ItemStack(cobaltBlazeHoe), new Object[] 
                { "##", " |", " |", '#', stack, '|', mod_InfiMetals.cobaltRod });
        ModLoader.addRecipe(new ItemStack(arditeBlazeHoe), new Object[] 
                { "##", " |", " |", '#', stack, '|', mod_InfiMetals.arditeRod });
        ModLoader.addRecipe(new ItemStack(manyullynBlazeHoe), new Object[] 
                { "##", " |", " |", '#', stack, '|', mod_InfiMetals.manyullynRod });
        ModLoader.addRecipe(new ItemStack(uraniumBlazeHoe), new Object[] 
                { "##", " |", " |", '#', stack, '|', mod_InfiMetals.uraniumRod });
    }
    
    public static Item stoneCopperHoe;
    public static Item boneCopperHoe;
    public static Item netherrackCopperHoe;
    public static Item slimeCopperHoe;
    public static Item cactusCopperHoe;
    public static Item flintCopperHoe;
    public static Item copperCopperHoe;
    
    public static Item stoneBronzeHoe;
    public static Item boneBronzeHoe;
    public static Item netherrackBronzeHoe;
    public static Item slimeBronzeHoe;
    public static Item cactusBronzeHoe;
    public static Item flintBronzeHoe;
    public static Item copperBronzeHoe;
    public static Item bronzeBronzeHoe;
    
    public static Item stoneWorkedIronHoe;
    public static Item ironWorkedIronHoe;
    public static Item diamondWorkedIronHoe;
    public static Item goldWorkedIronHoe;
    public static Item redstoneWorkedIronHoe;
    public static Item obsidianWorkedIronHoe;
    public static Item boneWorkedIronHoe;
    public static Item netherrackWorkedIronHoe;
    public static Item glowstoneWorkedIronHoe;
    public static Item iceWorkedIronHoe;
    public static Item slimeWorkedIronHoe;
    public static Item cactusWorkedIronHoe;
    public static Item blazeWorkedIronHoe;
    public static Item copperWorkedIronHoe;
    public static Item bronzeWorkedIronHoe;
    public static Item workedWorkedIronHoe;
    public static Item steelWorkedIronHoe;
    public static Item cobaltWorkedIronHoe;
    public static Item arditeWorkedIronHoe;
    public static Item uraniumWorkedIronHoe;
    
    public static Item stoneSteelHoe;
    public static Item ironSteelHoe;
    public static Item diamondSteelHoe;
    public static Item goldSteelHoe;
    public static Item redstoneSteelHoe;
    public static Item obsidianSteelHoe;
    public static Item boneSteelHoe;
    public static Item netherrackSteelHoe;
    public static Item glowstoneSteelHoe;
    public static Item iceSteelHoe;
    public static Item slimeSteelHoe;
    public static Item cactusSteelHoe;
    public static Item blazeSteelHoe;
    public static Item copperSteelHoe;
    public static Item bronzeSteelHoe;
    public static Item workedSteelHoe;
    public static Item steelSteelHoe;
    public static Item cobaltSteelHoe;
    public static Item arditeSteelHoe;
    public static Item uraniumSteelHoe;
    
    public static Item stoneCobaltHoe;
    public static Item ironCobaltHoe;
    public static Item diamondCobaltHoe;
    public static Item redstoneCobaltHoe;
    public static Item obsidianCobaltHoe;
    public static Item boneCobaltHoe;
    public static Item slimeCobaltHoe;
    public static Item cactusCobaltHoe;
    public static Item blazeCobaltHoe;
    public static Item copperCobaltHoe;
    public static Item bronzeCobaltHoe;
    public static Item workedCobaltHoe;
    public static Item steelCobaltHoe;
    public static Item cobaltCobaltHoe;
    public static Item arditeCobaltHoe;
    public static Item manyullynCobaltHoe;
    public static Item uraniumCobaltHoe;
    
    public static Item stoneArditeHoe;
    public static Item ironArditeHoe;
    public static Item diamondArditeHoe;
    public static Item redstoneArditeHoe;
    public static Item obsidianArditeHoe;
    public static Item boneArditeHoe;
    public static Item slimeArditeHoe;
    public static Item cactusArditeHoe;
    public static Item blazeArditeHoe;
    public static Item copperArditeHoe;
    public static Item bronzeArditeHoe;
    public static Item workedArditeHoe;
    public static Item steelArditeHoe;
    public static Item cobaltArditeHoe;
    public static Item arditeArditeHoe;
    public static Item manyullynArditeHoe;
    public static Item uraniumArditeHoe;
    
    public static Item stoneManyullynHoe;
    public static Item ironManyullynHoe;
    public static Item diamondManyullynHoe;
    public static Item redstoneManyullynHoe;
    public static Item obsidianManyullynHoe;
    public static Item boneManyullynHoe;
    public static Item slimeManyullynHoe;
    public static Item cactusManyullynHoe;
    public static Item blazeManyullynHoe;
    public static Item copperManyullynHoe;
    public static Item bronzeManyullynHoe;
    public static Item workedManyullynHoe;
    public static Item steelManyullynHoe;
    public static Item cobaltManyullynHoe;
    public static Item arditeManyullynHoe;
    public static Item manyullynManyullynHoe;
    public static Item uraniumManyullynHoe;
    
    public static Item diamondUraniumHoe;
    public static Item redstoneUraniumHoe;
    public static Item boneUraniumHoe;
    public static Item netherrackUraniumHoe;
    public static Item glowstoneUraniumHoe;
    public static Item lavaUraniumHoe;
    public static Item blazeUraniumHoe;
    public static Item cobaltUraniumHoe;
    public static Item arditeUraniumHoe;
    public static Item uraniumUraniumHoe;
    
    public static Item copperStoneHoe;
    
    public static Item copperIronHoe;
    public static Item bronzeIronHoe;
    public static Item workedIronHoe;
    
    public static Item copperDiamondHoe;
    public static Item bronzeDiamondHoe;
    public static Item workedDiamondHoe;
    public static Item steelDiamondHoe;
    public static Item cobaltDiamondHoe;
    public static Item arditeDiamondHoe;
    public static Item manyullynDiamondHoe;
    public static Item uraniumDiamondHoe;
    
    public static Item copperRedstoneHoe;
    public static Item bronzeRedstoneHoe;
    public static Item workedRedstoneHoe;
    
    public static Item cobaltMossyHoe;
    public static Item arditeMossyHoe;
    public static Item manyullynMossyHoe;
    
    public static Item copperNetherrackHoe;
    
    public static Item copperGlowstoneHoe;
    public static Item bronzeGlowstoneHoe;
    public static Item workedGlowstoneHoe;
    public static Item steelGlowstoneHoe;
    
    public static Item cobaltLavaHoe;
    public static Item arditeLavaHoe;
    public static Item manyullynLavaHoe;
    public static Item uraniumLavaHoe;
    
    public static Item copperSlimeHoe;
    public static Item bronzeSlimeHoe;
    public static Item workedSlimeHoe;
    public static Item steelSlimeHoe;
    public static Item cobaltSlimeHoe;
    public static Item arditeSlimeHoe;
    public static Item manyullynSlimeHoe;
    public static Item uraniumSlimeHoe;
    
    public static Item copperFlintHoe;
    public static Item bronzeFlintHoe;
    
    public static Item cobaltBlazeHoe;
    public static Item arditeBlazeHoe;
    public static Item manyullynBlazeHoe;
    public static Item uraniumBlazeHoe;
}
