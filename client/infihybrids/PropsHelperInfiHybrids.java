package net.minecraft.src.infihybrids;
import java.io.File;
import java.io.IOException;

import net.minecraft.client.Minecraft;
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

        File file = new File(Minecraft.getMinecraftDir() + "/config/InfiCraft");
        file.mkdir();
        File newFile = new File(Minecraft.getMinecraftDir() + "/config/InfiCraft/Hybrids.txt");

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
        
        woodIceAxeID = config.getOrCreateIntProperty("Wooden IceAxes", "item", 15501).getInt(15501);
        stoneIceAxeID = config.getOrCreateIntProperty("Stone IceAxes", "item", 15508).getInt(15508);
        ironIceAxeID = config.getOrCreateIntProperty("Iron IceAxes", "item", 15517).getInt(15517);
        diamondIceAxeID = config.getOrCreateIntProperty("Diamond IceAxes", "item", 15526).getInt(15526);
        redstoneIceAxeID = config.getOrCreateIntProperty("Redstone IceAxes", "item", 15548).getInt(15548);
        obsidianIceAxeID = config.getOrCreateIntProperty("Obsidian IceAxes", "item", 15568).getInt(15568);
        sandstoneIceAxeID = config.getOrCreateIntProperty("Sandstone IceAxes", "item", 15578).getInt(15578);
        boneIceAxeID = config.getOrCreateIntProperty("Bone IceAxes", "item", 15586).getInt(15586);
        paperIceAxeID = config.getOrCreateIntProperty("Paper IceAxes", "item", 15595).getInt(15595);
        mossyIceAxeID = config.getOrCreateIntProperty("Mossy IceAxes", "item", 15600).getInt(15600);
        netherrackIceAxeID = config.getOrCreateIntProperty("Netherrack IceAxes", "item", 15612).getInt(15612);
        glowstoneIceAxeID = config.getOrCreateIntProperty("Glowstone IceAxes", "item", 15625).getInt(15625);
        iceIceAxeID = config.getOrCreateIntProperty("Ice IceAxes", "item", 15634).getInt(15634);
        lavaIceAxeID = config.getOrCreateIntProperty("Lava IceAxes", "item", 15640).getInt(15640);
        slimeIceAxeID = config.getOrCreateIntProperty("Slime IceAxes", "item", 15648).getInt(15648);
        cactusIceAxeID = config.getOrCreateIntProperty("Cactus IceAxes", "item", 15654).getInt(15654);
        flintIceAxeID = config.getOrCreateIntProperty("Flint IceAxes", "item", 15661).getInt(15661);
        blazeIceAxeID = config.getOrCreateIntProperty("Blaze IceAxes", "item", 15671).getInt(15671);
        
        copperIceAxeID = config.getOrCreateIntProperty("Copper IceAxes", "item", 15679).getInt(15679);
        bronzeIceAxeID = config.getOrCreateIntProperty("Bronze IceAxes", "item", 15687).getInt(15687);
        workedIronIceAxeID = config.getOrCreateIntProperty("Worked Iron IceAxes", "item", 15696).getInt(15696);
        steelIceAxeID = config.getOrCreateIntProperty("Steel IceAxes", "item", 15714).getInt(15714);
        cobaltIceAxeID = config.getOrCreateIntProperty("Cobalt IceAxes", "item", 15734).getInt(15734);
        arditeIceAxeID = config.getOrCreateIntProperty("Ardite IceAxes", "item", 15752).getInt(15752);
        manyullynIceAxeID = config.getOrCreateIntProperty("Manyullyn IceAxes", "item", 15770).getInt(15770);
        uraniumIceAxeID = config.getOrCreateIntProperty("Uranium IceAxes", "item", 15788).getInt(15788);
        
        woodMattockID = config.getOrCreateIntProperty("Wooden Mattocks", "item", 15801).getInt(15801);
        stoneMattockID = config.getOrCreateIntProperty("Stone Mattocks", "item", 15808).getInt(15808);
        ironMattockID = config.getOrCreateIntProperty("Iron Mattocks", "item", 15817).getInt(15817);
        diamondMattockID = config.getOrCreateIntProperty("Diamond Mattocks", "item", 15826).getInt(15826);
        redstoneMattockID = config.getOrCreateIntProperty("Redstone Mattocks", "item", 15848).getInt(15848);
        obsidianMattockID = config.getOrCreateIntProperty("Obsidian Mattocks", "item", 15868).getInt(15868);
        sandstoneMattockID = config.getOrCreateIntProperty("Sandstone Mattocks", "item", 15878).getInt(15878);
        boneMattockID = config.getOrCreateIntProperty("Bone Mattocks", "item", 15886).getInt(15886);
        paperMattockID = config.getOrCreateIntProperty("Paper Mattocks", "item", 15895).getInt(15895);
        mossyMattockID = config.getOrCreateIntProperty("Mossy Mattocks", "item", 15900).getInt(15900);
        netherrackMattockID = config.getOrCreateIntProperty("Netherrack Mattocks", "item", 15912).getInt(15912);
        glowstoneMattockID = config.getOrCreateIntProperty("Glowstone Mattocks", "item", 15925).getInt(15925);
        iceMattockID = config.getOrCreateIntProperty("Ice Mattocks", "item", 15934).getInt(15934);
        lavaMattockID = config.getOrCreateIntProperty("Lava Mattocks", "item", 15940).getInt(15940);
        slimeMattockID = config.getOrCreateIntProperty("Slime Mattocks", "item", 15948).getInt(15948);
        cactusMattockID = config.getOrCreateIntProperty("Cactus Mattocks", "item", 15954).getInt(15954);
        flintMattockID = config.getOrCreateIntProperty("Flint Mattocks", "item", 15961).getInt(15961);
        blazeMattockID = config.getOrCreateIntProperty("Blaze Mattocks", "item", 15971).getInt(15971);
        
        copperMattockID = config.getOrCreateIntProperty("Copper Mattocks", "item", 15979).getInt(15979);
        bronzeMattockID = config.getOrCreateIntProperty("Bronze Mattocks", "item", 15987).getInt(15987);
        workedIronMattockID = config.getOrCreateIntProperty("Worked Iron Mattocks", "item", 15996).getInt(15996);
        steelMattockID = config.getOrCreateIntProperty("Steel Mattocks", "item", 16014).getInt(16014);
        cobaltMattockID = config.getOrCreateIntProperty("Cobalt Mattocks", "item", 16034).getInt(16034);
        arditeMattockID = config.getOrCreateIntProperty("Ardite Mattocks", "item", 16052).getInt(16052);
        manyullynMattockID = config.getOrCreateIntProperty("Manyullyn Mattocks", "item", 16070).getInt(16070);
        uraniumMattockID = config.getOrCreateIntProperty("Uranium Mattocks", "item", 16088).getInt(16088);
        
        woodMalletID = config.getOrCreateIntProperty("Wooden Mallets", "item", 16101).getInt(16101);
        stoneMalletID = config.getOrCreateIntProperty("Stone Mallets", "item", 16108).getInt(16108);
        ironMalletID = config.getOrCreateIntProperty("Iron Mallets", "item", 16117).getInt(16117);
        diamondMalletID = config.getOrCreateIntProperty("Diamond Mallets", "item", 16126).getInt(16126);
        redstoneMalletID = config.getOrCreateIntProperty("Redstone Mallets", "item", 16148).getInt(16148);
        obsidianMalletID = config.getOrCreateIntProperty("Obsidian Mallets", "item", 16168).getInt(16168);
        sandstoneMalletID = config.getOrCreateIntProperty("Sandstone Mallets", "item", 16178).getInt(16178);
        boneMalletID = config.getOrCreateIntProperty("Bone Mallets", "item", 16186).getInt(16186);
        paperMalletID = config.getOrCreateIntProperty("Paper Mallets", "item", 16195).getInt(16195);
        mossyMalletID = config.getOrCreateIntProperty("Mossy Mallets", "item", 16200).getInt(16200);
        netherrackMalletID = config.getOrCreateIntProperty("Netherrack Mallets", "item", 16212).getInt(16212);
        glowstoneMalletID = config.getOrCreateIntProperty("Glowstone Mallets", "item", 16225).getInt(16225);
        iceMalletID = config.getOrCreateIntProperty("Ice Mallets", "item", 16234).getInt(16234);
        lavaMalletID = config.getOrCreateIntProperty("Lava Mallets", "item", 16240).getInt(16240);
        slimeMalletID = config.getOrCreateIntProperty("Slime Mallets", "item", 16248).getInt(16248);
        cactusMalletID = config.getOrCreateIntProperty("Cactus Mallets", "item", 16254).getInt(16254);
        flintMalletID = config.getOrCreateIntProperty("Flint Mallets", "item", 16261).getInt(16261);
        blazeMalletID = config.getOrCreateIntProperty("Blaze Mallets", "item", 16271).getInt(16271);
        
        copperMalletID = config.getOrCreateIntProperty("Copper Mallets", "item", 16279).getInt(16279);
        bronzeMalletID = config.getOrCreateIntProperty("Bronze Mallets", "item", 16287).getInt(16287);
        workedIronMalletID = config.getOrCreateIntProperty("Worked Iron Mallets", "item", 16296).getInt(16296);
        steelMalletID = config.getOrCreateIntProperty("Steel Mallets", "item", 16314).getInt(16314);
        cobaltMalletID = config.getOrCreateIntProperty("Cobalt Mallets", "item", 16334).getInt(16334);
        arditeMalletID = config.getOrCreateIntProperty("Ardite Mallets", "item", 16352).getInt(16352);
        manyullynMalletID = config.getOrCreateIntProperty("Manyullyn Mallets", "item", 16370).getInt(16370);
        uraniumMalletID = config.getOrCreateIntProperty("Uranium Mallets", "item", 16388).getInt(16388);
        
        woodMacheteID = config.getOrCreateIntProperty("Wooden Machetes", "item", 16401).getInt(16401);
        stoneMacheteID = config.getOrCreateIntProperty("Stone Machetes", "item", 16408).getInt(16408);
        ironMacheteID = config.getOrCreateIntProperty("Iron Machetes", "item", 16417).getInt(16417);
        diamondMacheteID = config.getOrCreateIntProperty("Diamond Machetes", "item", 16426).getInt(16426);
        redstoneMacheteID = config.getOrCreateIntProperty("Redstone Machetes", "item", 16448).getInt(16448);
        obsidianMacheteID = config.getOrCreateIntProperty("Obsidian Machetes", "item", 16468).getInt(16468);
        sandstoneMacheteID = config.getOrCreateIntProperty("Sandstone Machetes", "item", 16478).getInt(16478);
        boneMacheteID = config.getOrCreateIntProperty("Bone Machetes", "item", 16486).getInt(16486);
        paperMacheteID = config.getOrCreateIntProperty("Paper Machetes", "item", 16495).getInt(16495);
        mossyMacheteID = config.getOrCreateIntProperty("Mossy Machetes", "item", 16500).getInt(16500);
        netherrackMacheteID = config.getOrCreateIntProperty("Netherrack Machetes", "item", 16512).getInt(16512);
        glowstoneMacheteID = config.getOrCreateIntProperty("Glowstone Machetes", "item", 16525).getInt(16525);
        iceMacheteID = config.getOrCreateIntProperty("Ice Machetes", "item", 16534).getInt(16534);
        lavaMacheteID = config.getOrCreateIntProperty("Lava Machetes", "item", 16540).getInt(16540);
        slimeMacheteID = config.getOrCreateIntProperty("Slime Machetes", "item", 16548).getInt(16548);
        cactusMacheteID = config.getOrCreateIntProperty("Cactus Machetes", "item", 16554).getInt(16554);
        flintMacheteID = config.getOrCreateIntProperty("Flint Machetes", "item", 16561).getInt(16561);
        blazeMacheteID = config.getOrCreateIntProperty("Blaze Machetes", "item", 16571).getInt(16571);
        
        copperMacheteID = config.getOrCreateIntProperty("Copper Machetes", "item", 16579).getInt(16579);
        bronzeMacheteID = config.getOrCreateIntProperty("Bronze Machetes", "item", 16587).getInt(16587);
        workedIronMacheteID = config.getOrCreateIntProperty("Worked Iron Machetes", "item", 16596).getInt(16596);
        steelMacheteID = config.getOrCreateIntProperty("Steel Machetes", "item", 16614).getInt(16614);
        cobaltMacheteID = config.getOrCreateIntProperty("Cobalt Machetes", "item", 16634).getInt(16634);
        arditeMacheteID = config.getOrCreateIntProperty("Ardite Machetes", "item", 16652).getInt(16652);
        manyullynMacheteID = config.getOrCreateIntProperty("Manyullyn Machetes", "item", 16670).getInt(16670);
        uraniumMacheteID = config.getOrCreateIntProperty("Uranium Machetes", "item", 16688).getInt(16688);
        
        woodScytheID = config.getOrCreateIntProperty("Wooden Scythes", "item", 16701).getInt(16701);
        stoneScytheID = config.getOrCreateIntProperty("Stone Scythes", "item", 16708).getInt(16708);
        ironScytheID = config.getOrCreateIntProperty("Iron Scythes", "item", 16717).getInt(16717);
        diamondScytheID = config.getOrCreateIntProperty("Diamond Scythes", "item", 16726).getInt(16726);
        redstoneScytheID = config.getOrCreateIntProperty("Redstone Scythes", "item", 16748).getInt(16748);
        obsidianScytheID = config.getOrCreateIntProperty("Obsidian Scythes", "item", 16768).getInt(16768);
        sandstoneScytheID = config.getOrCreateIntProperty("Sandstone Scythes", "item", 16778).getInt(16778);
        boneScytheID = config.getOrCreateIntProperty("Bone Scythes", "item", 16786).getInt(16786);
        paperScytheID = config.getOrCreateIntProperty("Paper Scythes", "item", 16795).getInt(16795);
        mossyScytheID = config.getOrCreateIntProperty("Mossy Scythes", "item", 16800).getInt(16800);
        netherrackScytheID = config.getOrCreateIntProperty("Netherrack Scythes", "item", 16812).getInt(16812);
        glowstoneScytheID = config.getOrCreateIntProperty("Glowstone Scythes", "item", 16825).getInt(16825);
        iceScytheID = config.getOrCreateIntProperty("Ice Scythes", "item", 16834).getInt(16834);
        lavaScytheID = config.getOrCreateIntProperty("Lava Scythes", "item", 16840).getInt(16840);
        slimeScytheID = config.getOrCreateIntProperty("Slime Scythes", "item", 16848).getInt(16848);
        cactusScytheID = config.getOrCreateIntProperty("Cactus Scythes", "item", 16854).getInt(16854);
        flintScytheID = config.getOrCreateIntProperty("Flint Scythes", "item", 16861).getInt(16861);
        blazeScytheID = config.getOrCreateIntProperty("Blaze Scythes", "item", 16871).getInt(16871);
        
        copperScytheID = config.getOrCreateIntProperty("Copper Scythes", "item", 16879).getInt(16879);
        bronzeScytheID = config.getOrCreateIntProperty("Bronze Scythes", "item", 16887).getInt(16887);
        workedIronScytheID = config.getOrCreateIntProperty("Worked Iron Scythes", "item", 16896).getInt(16896);
        steelScytheID = config.getOrCreateIntProperty("Steel Scythes", "item", 16914).getInt(16914);
        cobaltScytheID = config.getOrCreateIntProperty("Cobalt Scythes", "item", 16934).getInt(16934);
        arditeScytheID = config.getOrCreateIntProperty("Ardite Scythes", "item", 16952).getInt(16952);
        manyullynScytheID = config.getOrCreateIntProperty("Manyullyn Scythes", "item", 16970).getInt(16970);
        uraniumScytheID = config.getOrCreateIntProperty("Uranium Scythes", "item", 16988).getInt(16988);

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