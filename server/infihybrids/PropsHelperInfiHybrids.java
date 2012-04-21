package net.minecraft.src.infihybrids;
import java.io.File;
import java.io.IOException;

import net.minecraft.src.Item;
import net.minecraft.src.forge.Configuration;

public class PropsHelperInfiHybrids {

    public static void initProps()
    {
        /* Here we will set up the config file for the mod 
         * First: Create a folder inside the config folder
         * Second: Create the actual config file
         * Note: Configs are a pain, but absolutely necessary for every mod.
         */

        File file = new File("./config/InfiCraft");
        file.mkdir();
        File newFile = new File("./config/InfiCraft/Hybrids.txt");

        /* Some basic debugging will go a long way */
        try
        {
            newFile.createNewFile();
            System.out.println("Successfully created/read configuration file");
        }
        catch (IOException e)
        {
            System.out.println("Could not create configuration file for mod_InfiHybrids. Reason:");
            System.out.println(e);
        }

        /* [Forge] Configuration class, used as config method */
        Configuration config = new Configuration(newFile);

        /* Load the configuration file */
        config.load();

        /* Define the mod's IDs. 
         * Avoid values below 4096 for items and in the 250-600 range for blocks
         */
        
        enableWoodTools = config.getOrCreateBooleanProperty("Enable Wooden Tools", "general", true).getBoolean(true);
        enableStoneTools = config.getOrCreateBooleanProperty("Enable Stone Tools", "general", true).getBoolean(true);
        enableIronTools = config.getOrCreateBooleanProperty("Enable Iron Tools", "general", true).getBoolean(true);
        enableDiamondTools = config.getOrCreateBooleanProperty("Enable Diamond Tools", "general", true).getBoolean(true);
        enableRedstoneTools = config.getOrCreateBooleanProperty("Enable Redstone Tools", "general", true).getBoolean(true);
        enableObsidianTools = config.getOrCreateBooleanProperty("Enable Obsidian Tools", "general", true).getBoolean(true);
        enableSandstoneTools = config.getOrCreateBooleanProperty("Enable Sandstone Tools", "general", true).getBoolean(true);
        enableBoneTools = config.getOrCreateBooleanProperty("Enable Bone Tools", "general", true).getBoolean(true);
        enablePaperTools = config.getOrCreateBooleanProperty("Enable Paper Tools", "general", true).getBoolean(true);
        enableMossyTools = config.getOrCreateBooleanProperty("Enable Mossy Tools", "general", true).getBoolean(true);
        enableNetherrackTools = config.getOrCreateBooleanProperty("Enable Netherrack Tools", "general", true).getBoolean(true);
        enableGlowstoneTools = config.getOrCreateBooleanProperty("Enable Glowstone Tools", "general", true).getBoolean(true);
        enableIceTools = config.getOrCreateBooleanProperty("Enable Ice Tools", "general", true).getBoolean(true);
        enableLavaTools = config.getOrCreateBooleanProperty("Enable Lava Tools", "general", true).getBoolean(true);
        enableSlimeTools = config.getOrCreateBooleanProperty("Enable Slime Tools", "general", true).getBoolean(true);
        enableCactusTools = config.getOrCreateBooleanProperty("Enable Cactus Tools", "general", true).getBoolean(true);
        enableFlintTools = config.getOrCreateBooleanProperty("Enable Flint Tools", "general", true).getBoolean(true);
        enableBlazeTools = config.getOrCreateBooleanProperty("Enable Blaze Tools", "general", true).getBoolean(true);
        
        enableCopperTools = config.getOrCreateBooleanProperty("Enable Copper Tools", "general", true).getBoolean(true);
        enableBronzeTools = config.getOrCreateBooleanProperty("Enable Bronze Tools", "general", true).getBoolean(true);
        enableWorkedIronTools = config.getOrCreateBooleanProperty("Enable Worked Iron Tools", "general", true).getBoolean(true);
        enableSteelTools = config.getOrCreateBooleanProperty("Enable Steel Tools", "general", true).getBoolean(true);
        enableCobaltTools = config.getOrCreateBooleanProperty("Enable Cobalt Tools", "general", true).getBoolean(true);
        enableArditeTools = config.getOrCreateBooleanProperty("Enable Ardite Tools", "general", true).getBoolean(true);
        enableManyullynTools = config.getOrCreateBooleanProperty("Enable Manyullyn Tools", "general", true).getBoolean(true);
        enableUraniumTools = config.getOrCreateBooleanProperty("Enable Uranium Tools", "general", true).getBoolean(true);
        
        woodIceAxeID = config.getOrCreateIntProperty("Wooden IceAxes", "item", 19501).getInt(19501);
        stoneIceAxeID = config.getOrCreateIntProperty("Stone IceAxes", "item", 19508).getInt(19508);
        ironIceAxeID = config.getOrCreateIntProperty("Iron IceAxes", "item", 19517).getInt(19517);
        diamondIceAxeID = config.getOrCreateIntProperty("Diamond IceAxes", "item", 19526).getInt(19526);
        redstoneIceAxeID = config.getOrCreateIntProperty("Redstone IceAxes", "item", 19548).getInt(19548);
        obsidianIceAxeID = config.getOrCreateIntProperty("Obsidian IceAxes", "item", 19568).getInt(19568);
        sandstoneIceAxeID = config.getOrCreateIntProperty("Sandstone IceAxes", "item", 19578).getInt(19578);
        boneIceAxeID = config.getOrCreateIntProperty("Bone IceAxes", "item", 19586).getInt(19586);
        paperIceAxeID = config.getOrCreateIntProperty("Paper IceAxes", "item", 19595).getInt(19595);
        mossyIceAxeID = config.getOrCreateIntProperty("Mossy IceAxes", "item", 19600).getInt(19600);
        netherrackIceAxeID = config.getOrCreateIntProperty("Netherrack IceAxes", "item", 19612).getInt(19612);
        glowstoneIceAxeID = config.getOrCreateIntProperty("Glowstone IceAxes", "item", 19625).getInt(19625);
        iceIceAxeID = config.getOrCreateIntProperty("Ice IceAxes", "item", 19634).getInt(19634);
        lavaIceAxeID = config.getOrCreateIntProperty("Lava IceAxes", "item", 19640).getInt(19640);
        slimeIceAxeID = config.getOrCreateIntProperty("Slime IceAxes", "item", 19648).getInt(19648);
        cactusIceAxeID = config.getOrCreateIntProperty("Cactus IceAxes", "item", 19654).getInt(19654);
        flintIceAxeID = config.getOrCreateIntProperty("Flint IceAxes", "item", 19661).getInt(19661);
        blazeIceAxeID = config.getOrCreateIntProperty("Blaze IceAxes", "item", 19671).getInt(19671);
        
        copperIceAxeID = config.getOrCreateIntProperty("Copper IceAxes", "item", 19679).getInt(19679);
        bronzeIceAxeID = config.getOrCreateIntProperty("Bronze IceAxes", "item", 19687).getInt(19687);
        workedIronIceAxeID = config.getOrCreateIntProperty("Worked Iron IceAxes", "item", 19696).getInt(19696);
        steelIceAxeID = config.getOrCreateIntProperty("Steel IceAxes", "item", 19714).getInt(19714);
        cobaltIceAxeID = config.getOrCreateIntProperty("Cobalt IceAxes", "item", 19734).getInt(19734);
        arditeIceAxeID = config.getOrCreateIntProperty("Ardite IceAxes", "item", 19752).getInt(19752);
        manyullynIceAxeID = config.getOrCreateIntProperty("Manyullyn IceAxes", "item", 19770).getInt(19770);
        uraniumIceAxeID = config.getOrCreateIntProperty("Uranium IceAxes", "item", 19788).getInt(19788);
        
        woodMattockID = config.getOrCreateIntProperty("Wooden Mattocks", "item", 19801).getInt(19801);
        stoneMattockID = config.getOrCreateIntProperty("Stone Mattocks", "item", 19808).getInt(19808);
        ironMattockID = config.getOrCreateIntProperty("Iron Mattocks", "item", 19817).getInt(19817);
        diamondMattockID = config.getOrCreateIntProperty("Diamond Mattocks", "item", 19826).getInt(19826);
        redstoneMattockID = config.getOrCreateIntProperty("Redstone Mattocks", "item", 19848).getInt(19848);
        obsidianMattockID = config.getOrCreateIntProperty("Obsidian Mattocks", "item", 19868).getInt(19868);
        sandstoneMattockID = config.getOrCreateIntProperty("Sandstone Mattocks", "item", 19878).getInt(19878);
        boneMattockID = config.getOrCreateIntProperty("Bone Mattocks", "item", 19886).getInt(19886);
        paperMattockID = config.getOrCreateIntProperty("Paper Mattocks", "item", 19895).getInt(19895);
        mossyMattockID = config.getOrCreateIntProperty("Mossy Mattocks", "item", 19900).getInt(19900);
        netherrackMattockID = config.getOrCreateIntProperty("Netherrack Mattocks", "item", 19912).getInt(19912);
        glowstoneMattockID = config.getOrCreateIntProperty("Glowstone Mattocks", "item", 19925).getInt(19925);
        iceMattockID = config.getOrCreateIntProperty("Ice Mattocks", "item", 19934).getInt(19934);
        lavaMattockID = config.getOrCreateIntProperty("Lava Mattocks", "item", 19940).getInt(19940);
        slimeMattockID = config.getOrCreateIntProperty("Slime Mattocks", "item", 19948).getInt(19948);
        cactusMattockID = config.getOrCreateIntProperty("Cactus Mattocks", "item", 19954).getInt(19954);
        flintMattockID = config.getOrCreateIntProperty("Flint Mattocks", "item", 19961).getInt(19961);
        blazeMattockID = config.getOrCreateIntProperty("Blaze Mattocks", "item", 19971).getInt(19971);
        
        copperMattockID = config.getOrCreateIntProperty("Copper Mattocks", "item", 19979).getInt(19979);
        bronzeMattockID = config.getOrCreateIntProperty("Bronze Mattocks", "item", 19987).getInt(19987);
        workedIronMattockID = config.getOrCreateIntProperty("Worked Iron Mattocks", "item", 19996).getInt(19996);
        steelMattockID = config.getOrCreateIntProperty("Steel Mattocks", "item", 20014).getInt(20014);
        cobaltMattockID = config.getOrCreateIntProperty("Cobalt Mattocks", "item", 20034).getInt(20034);
        arditeMattockID = config.getOrCreateIntProperty("Ardite Mattocks", "item", 20052).getInt(20052);
        manyullynMattockID = config.getOrCreateIntProperty("Manyullyn Mattocks", "item", 20070).getInt(20070);
        uraniumMattockID = config.getOrCreateIntProperty("Uranium Mattocks", "item", 20088).getInt(20088);
        
        woodMalletID = config.getOrCreateIntProperty("Wooden Mallets", "item", 20101).getInt(20101);
        stoneMalletID = config.getOrCreateIntProperty("Stone Mallets", "item", 20108).getInt(20108);
        ironMalletID = config.getOrCreateIntProperty("Iron Mallets", "item", 20117).getInt(20117);
        diamondMalletID = config.getOrCreateIntProperty("Diamond Mallets", "item", 20126).getInt(20126);
        redstoneMalletID = config.getOrCreateIntProperty("Redstone Mallets", "item", 20148).getInt(20148);
        obsidianMalletID = config.getOrCreateIntProperty("Obsidian Mallets", "item", 20168).getInt(20168);
        sandstoneMalletID = config.getOrCreateIntProperty("Sandstone Mallets", "item", 20178).getInt(20178);
        boneMalletID = config.getOrCreateIntProperty("Bone Mallets", "item", 20186).getInt(20186);
        paperMalletID = config.getOrCreateIntProperty("Paper Mallets", "item", 20195).getInt(20195);
        mossyMalletID = config.getOrCreateIntProperty("Mossy Mallets", "item", 20200).getInt(20200);
        netherrackMalletID = config.getOrCreateIntProperty("Netherrack Mallets", "item", 20212).getInt(20212);
        glowstoneMalletID = config.getOrCreateIntProperty("Glowstone Mallets", "item", 20225).getInt(20225);
        iceMalletID = config.getOrCreateIntProperty("Ice Mallets", "item", 20234).getInt(20234);
        lavaMalletID = config.getOrCreateIntProperty("Lava Mallets", "item", 20240).getInt(20240);
        slimeMalletID = config.getOrCreateIntProperty("Slime Mallets", "item", 20248).getInt(20248);
        cactusMalletID = config.getOrCreateIntProperty("Cactus Mallets", "item", 20254).getInt(20254);
        flintMalletID = config.getOrCreateIntProperty("Flint Mallets", "item", 20261).getInt(20261);
        blazeMalletID = config.getOrCreateIntProperty("Blaze Mallets", "item", 20271).getInt(20271);
        
        copperMalletID = config.getOrCreateIntProperty("Copper Mallets", "item", 20279).getInt(20279);
        bronzeMalletID = config.getOrCreateIntProperty("Bronze Mallets", "item", 20287).getInt(20287);
        workedIronMalletID = config.getOrCreateIntProperty("Worked Iron Mallets", "item", 20296).getInt(20296);
        steelMalletID = config.getOrCreateIntProperty("Steel Mallets", "item", 20314).getInt(20314);
        cobaltMalletID = config.getOrCreateIntProperty("Cobalt Mallets", "item", 20334).getInt(20334);
        arditeMalletID = config.getOrCreateIntProperty("Ardite Mallets", "item", 20352).getInt(20352);
        manyullynMalletID = config.getOrCreateIntProperty("Manyullyn Mallets", "item", 20370).getInt(20370);
        uraniumMalletID = config.getOrCreateIntProperty("Uranium Mallets", "item", 20388).getInt(20388);
        
        woodMacheteID = config.getOrCreateIntProperty("Wooden Machetes", "item", 20401).getInt(20401);
        stoneMacheteID = config.getOrCreateIntProperty("Stone Machetes", "item", 20408).getInt(20408);
        ironMacheteID = config.getOrCreateIntProperty("Iron Machetes", "item", 20417).getInt(20417);
        diamondMacheteID = config.getOrCreateIntProperty("Diamond Machetes", "item", 20426).getInt(20426);
        redstoneMacheteID = config.getOrCreateIntProperty("Redstone Machetes", "item", 20448).getInt(20448);
        obsidianMacheteID = config.getOrCreateIntProperty("Obsidian Machetes", "item", 20468).getInt(20468);
        sandstoneMacheteID = config.getOrCreateIntProperty("Sandstone Machetes", "item", 20478).getInt(20478);
        boneMacheteID = config.getOrCreateIntProperty("Bone Machetes", "item", 20486).getInt(20486);
        paperMacheteID = config.getOrCreateIntProperty("Paper Machetes", "item", 20495).getInt(20495);
        mossyMacheteID = config.getOrCreateIntProperty("Mossy Machetes", "item", 20500).getInt(20500);
        netherrackMacheteID = config.getOrCreateIntProperty("Netherrack Machetes", "item", 20512).getInt(20512);
        glowstoneMacheteID = config.getOrCreateIntProperty("Glowstone Machetes", "item", 20525).getInt(20525);
        iceMacheteID = config.getOrCreateIntProperty("Ice Machetes", "item", 20534).getInt(20534);
        lavaMacheteID = config.getOrCreateIntProperty("Lava Machetes", "item", 20540).getInt(20540);
        slimeMacheteID = config.getOrCreateIntProperty("Slime Machetes", "item", 20548).getInt(20548);
        cactusMacheteID = config.getOrCreateIntProperty("Cactus Machetes", "item", 20554).getInt(20554);
        flintMacheteID = config.getOrCreateIntProperty("Flint Machetes", "item", 20561).getInt(20561);
        blazeMacheteID = config.getOrCreateIntProperty("Blaze Machetes", "item", 20571).getInt(20571);
        
        copperMacheteID = config.getOrCreateIntProperty("Copper Machetes", "item", 20579).getInt(20579);
        bronzeMacheteID = config.getOrCreateIntProperty("Bronze Machetes", "item", 20587).getInt(20587);
        workedIronMacheteID = config.getOrCreateIntProperty("Worked Iron Machetes", "item", 20596).getInt(20596);
        steelMacheteID = config.getOrCreateIntProperty("Steel Machetes", "item", 20614).getInt(20614);
        cobaltMacheteID = config.getOrCreateIntProperty("Cobalt Machetes", "item", 20634).getInt(20634);
        arditeMacheteID = config.getOrCreateIntProperty("Ardite Machetes", "item", 20652).getInt(20652);
        manyullynMacheteID = config.getOrCreateIntProperty("Manyullyn Machetes", "item", 20670).getInt(20670);
        uraniumMacheteID = config.getOrCreateIntProperty("Uranium Machetes", "item", 20688).getInt(20688);
        
        woodScytheID = config.getOrCreateIntProperty("Wooden Scythes", "item", 20701).getInt(20701);
        stoneScytheID = config.getOrCreateIntProperty("Stone Scythes", "item", 20708).getInt(20708);
        ironScytheID = config.getOrCreateIntProperty("Iron Scythes", "item", 20717).getInt(20717);
        diamondScytheID = config.getOrCreateIntProperty("Diamond Scythes", "item", 20726).getInt(20726);
        redstoneScytheID = config.getOrCreateIntProperty("Redstone Scythes", "item", 20748).getInt(20748);
        obsidianScytheID = config.getOrCreateIntProperty("Obsidian Scythes", "item", 20768).getInt(20768);
        sandstoneScytheID = config.getOrCreateIntProperty("Sandstone Scythes", "item", 20778).getInt(20778);
        boneScytheID = config.getOrCreateIntProperty("Bone Scythes", "item", 20786).getInt(20786);
        paperScytheID = config.getOrCreateIntProperty("Paper Scythes", "item", 20795).getInt(20795);
        mossyScytheID = config.getOrCreateIntProperty("Mossy Scythes", "item", 20800).getInt(20800);
        netherrackScytheID = config.getOrCreateIntProperty("Netherrack Scythes", "item", 20812).getInt(20812);
        glowstoneScytheID = config.getOrCreateIntProperty("Glowstone Scythes", "item", 20825).getInt(20825);
        iceScytheID = config.getOrCreateIntProperty("Ice Scythes", "item", 20834).getInt(20834);
        lavaScytheID = config.getOrCreateIntProperty("Lava Scythes", "item", 20840).getInt(20840);
        slimeScytheID = config.getOrCreateIntProperty("Slime Scythes", "item", 20848).getInt(20848);
        cactusScytheID = config.getOrCreateIntProperty("Cactus Scythes", "item", 20854).getInt(20854);
        flintScytheID = config.getOrCreateIntProperty("Flint Scythes", "item", 20861).getInt(20861);
        blazeScytheID = config.getOrCreateIntProperty("Blaze Scythes", "item", 20871).getInt(20871);
        
        copperScytheID = config.getOrCreateIntProperty("Copper Scythes", "item", 20879).getInt(20879);
        bronzeScytheID = config.getOrCreateIntProperty("Bronze Scythes", "item", 20887).getInt(20887);
        workedIronScytheID = config.getOrCreateIntProperty("Worked Iron Scythes", "item", 20896).getInt(20896);
        steelScytheID = config.getOrCreateIntProperty("Steel Scythes", "item", 20914).getInt(20914);
        cobaltScytheID = config.getOrCreateIntProperty("Cobalt Scythes", "item", 20934).getInt(20934);
        arditeScytheID = config.getOrCreateIntProperty("Ardite Scythes", "item", 20952).getInt(20952);
        manyullynScytheID = config.getOrCreateIntProperty("Manyullyn Scythes", "item", 20970).getInt(20970);
        uraniumScytheID = config.getOrCreateIntProperty("Uranium Scythes", "item", 20988).getInt(20988);

        /* Save the configuration file */
        config.save();
    }

    /* Prototype fields, used elsewhere */
    
    public static boolean enableWoodTools;
    public static boolean enableStoneTools;
    public static boolean enableIronTools;
    public static boolean enableDiamondTools;
    public static boolean enableRedstoneTools;
    public static boolean enableObsidianTools;
    public static boolean enableSandstoneTools;
    public static boolean enableBoneTools;
    public static boolean enablePaperTools;
    public static boolean enableMossyTools;
    public static boolean enableNetherrackTools;
    public static boolean enableGlowstoneTools;
    public static boolean enableIceTools;
    public static boolean enableLavaTools;
    public static boolean enableSlimeTools;
    public static boolean enableCactusTools;
    public static boolean enableFlintTools;
    public static boolean enableBlazeTools;
    
    public static boolean enableCopperTools;
    public static boolean enableBronzeTools;
    public static boolean enableWorkedIronTools;
    public static boolean enableSteelTools;
    public static boolean enableCobaltTools;
    public static boolean enableArditeTools;
    public static boolean enableManyullynTools;
    public static boolean enableUraniumTools;
    
    public static int woodIceAxeID;
    public static int stoneIceAxeID;
    public static int ironIceAxeID;
    public static int diamondIceAxeID;
    public static int redstoneIceAxeID;
    public static int obsidianIceAxeID;
    public static int sandstoneIceAxeID;
    public static int boneIceAxeID;
    public static int paperIceAxeID;
    public static int mossyIceAxeID;
    public static int netherrackIceAxeID;
    public static int glowstoneIceAxeID;
    public static int iceIceAxeID;
    public static int lavaIceAxeID;
    public static int slimeIceAxeID;
    public static int cactusIceAxeID;
    public static int flintIceAxeID;
    public static int blazeIceAxeID;
    
    public static int copperIceAxeID;
    public static int bronzeIceAxeID;
    public static int workedIronIceAxeID;
    public static int steelIceAxeID;
    public static int cobaltIceAxeID;
    public static int arditeIceAxeID;
    public static int manyullynIceAxeID;
    public static int uraniumIceAxeID;
    
    public static int woodMattockID;
    public static int stoneMattockID;
    public static int ironMattockID;
    public static int diamondMattockID;
    public static int redstoneMattockID;
    public static int obsidianMattockID;
    public static int sandstoneMattockID;
    public static int boneMattockID;
    public static int paperMattockID;
    public static int mossyMattockID;
    public static int netherrackMattockID;
    public static int glowstoneMattockID;
    public static int iceMattockID;
    public static int lavaMattockID;
    public static int slimeMattockID;
    public static int cactusMattockID;
    public static int flintMattockID;
    public static int blazeMattockID;
    
    public static int copperMattockID;
    public static int bronzeMattockID;
    public static int workedIronMattockID;
    public static int steelMattockID;
    public static int cobaltMattockID;
    public static int arditeMattockID;
    public static int manyullynMattockID;
    public static int uraniumMattockID;
    
    public static int woodMalletID;
    public static int stoneMalletID;
    public static int ironMalletID;
    public static int diamondMalletID;
    public static int redstoneMalletID;
    public static int obsidianMalletID;
    public static int sandstoneMalletID;
    public static int boneMalletID;
    public static int paperMalletID;
    public static int mossyMalletID;
    public static int netherrackMalletID;
    public static int glowstoneMalletID;
    public static int iceMalletID;
    public static int lavaMalletID;
    public static int slimeMalletID;
    public static int cactusMalletID;
    public static int flintMalletID;
    public static int blazeMalletID;
    
    public static int copperMalletID;
    public static int bronzeMalletID;
    public static int workedIronMalletID;
    public static int steelMalletID;
    public static int cobaltMalletID;
    public static int arditeMalletID;
    public static int manyullynMalletID;
    public static int uraniumMalletID;
    
    public static int woodMacheteID;
    public static int stoneMacheteID;
    public static int ironMacheteID;
    public static int diamondMacheteID;
    public static int redstoneMacheteID;
    public static int obsidianMacheteID;
    public static int sandstoneMacheteID;
    public static int boneMacheteID;
    public static int paperMacheteID;
    public static int mossyMacheteID;
    public static int netherrackMacheteID;
    public static int glowstoneMacheteID;
    public static int iceMacheteID;
    public static int lavaMacheteID;
    public static int slimeMacheteID;
    public static int cactusMacheteID;
    public static int flintMacheteID;
    public static int blazeMacheteID;
    
    public static int copperMacheteID;
    public static int bronzeMacheteID;
    public static int workedIronMacheteID;
    public static int steelMacheteID;
    public static int cobaltMacheteID;
    public static int arditeMacheteID;
    public static int manyullynMacheteID;
    public static int uraniumMacheteID;
    
    public static int woodScytheID;
    public static int stoneScytheID;
    public static int ironScytheID;
    public static int diamondScytheID;
    public static int redstoneScytheID;
    public static int obsidianScytheID;
    public static int sandstoneScytheID;
    public static int boneScytheID;
    public static int paperScytheID;
    public static int mossyScytheID;
    public static int netherrackScytheID;
    public static int glowstoneScytheID;
    public static int iceScytheID;
    public static int lavaScytheID;
    public static int slimeScytheID;
    public static int cactusScytheID;
    public static int flintScytheID;
    public static int blazeScytheID;
    
    public static int copperScytheID;
    public static int bronzeScytheID;
    public static int workedIronScytheID;
    public static int steelScytheID;
    public static int cobaltScytheID;
    public static int arditeScytheID;
    public static int manyullynScytheID;
    public static int uraniumScytheID;
}