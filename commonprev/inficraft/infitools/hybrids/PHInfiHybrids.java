package inficraft.infitools.hybrids;
import java.io.File;
import java.io.IOException;

import net.minecraft.client.Minecraft;
import net.minecraftforge.common.Configuration;

public class PHInfiHybrids {

    public static void initProps()
    {
        /* Here we will set up the config file for the mod 
         * First: Create a folder inside the config folder
         * Second: Create the actual config file
         * Note: Configs are a pain, but absolutely necessary for every mod.
         */

        File file = new File(InfiHybrids.proxy.getMinecraftDir() + "/config/InfiCraft");
        file.mkdir();
        File newFile = new File(InfiHybrids.proxy.getMinecraftDir() + "/config/InfiCraft/Hybrids.txt");

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
        InfiHybrids.infitoolsPresent = config.get("general", "Add InfiTool Combinations", true).getBoolean(true);
        
        enableWoodTools = config.get("general", "Enable Wooden Tools", true).getBoolean(true);
        enableStoneTools = config.get("general", "Enable Stone Tools", true).getBoolean(true);
        enableIronTools = config.get("general", "Enable Iron Tools", true).getBoolean(true);
        enableDiamondTools = config.get("general", "Enable Diamond Tools", true).getBoolean(true);
        enableRedstoneTools = config.get("general", "Enable Redstone Tools", true).getBoolean(true);
        enableObsidianTools = config.get("general", "Enable Obsidian Tools", true).getBoolean(true);
        enableSandstoneTools = config.get("general", "Enable Sandstone Tools", true).getBoolean(true);
        enableBoneTools = config.get("general", "Enable Bone Tools", true).getBoolean(true);
        enablePaperTools = config.get("general", "Enable Paper Tools", true).getBoolean(true);
        enableMossyTools = config.get("general", "Enable Mossy Tools", true).getBoolean(true);
        enableNetherrackTools = config.get("general", "Enable Netherrack Tools", true).getBoolean(true);
        enableGlowstoneTools = config.get("general", "Enable Glowstone Tools", true).getBoolean(true);
        enableIceTools = config.get("general", "Enable Ice Tools", true).getBoolean(true);
        enableLavaTools = config.get("general", "Enable Lava Tools", true).getBoolean(true);
        enableSlimeTools = config.get("general", "Enable Slime Tools", true).getBoolean(true);
        enableCactusTools = config.get("general", "Enable Cactus Tools", true).getBoolean(true);
        enableFlintTools = config.get("general", "Enable Flint Tools", true).getBoolean(true);
        enableBlazeTools = config.get("general", "Enable Blaze Tools", true).getBoolean(true);
        
        enableCopperTools = config.get("general", "Enable Copper Tools", true).getBoolean(true);
        enableBronzeTools = config.get("general", "Enable Bronze Tools", true).getBoolean(true);
        enableWorkedIronTools = config.get("general", "Enable Worked Iron Tools", true).getBoolean(true);
        enableSteelTools = config.get("general", "Enable Steel Tools", true).getBoolean(true);
        enableCobaltTools = config.get("general", "Enable Cobalt Tools", true).getBoolean(true);
        enableArditeTools = config.get("general", "Enable Ardite Tools", true).getBoolean(true);
        enableManyullynTools = config.get("general", "Enable Manyullyn Tools", true).getBoolean(true);
        enableUraniumTools = config.get("general", "Enable Uranium Tools", true).getBoolean(true);
        
        woodIceAxeID = config.getItem("Wooden IceAxes", 19501).getInt(19501);
        stoneIceAxeID = config.getItem("Stone IceAxes", 19508).getInt(19508);
        ironIceAxeID = config.getItem("Iron IceAxes", 19517).getInt(19517);
        diamondIceAxeID = config.getItem("Diamond IceAxes", 19526).getInt(19526);
        redstoneIceAxeID = config.getItem("Redstone IceAxes", 19548).getInt(19548);
        obsidianIceAxeID = config.getItem("Obsidian IceAxes", 19568).getInt(19568);
        sandstoneIceAxeID = config.getItem("Sandstone IceAxes", 19578).getInt(19578);
        boneIceAxeID = config.getItem("Bone IceAxes", 19586).getInt(19586);
        paperIceAxeID = config.getItem("Paper IceAxes", 19595).getInt(19595);
        mossyIceAxeID = config.getItem("Mossy IceAxes", 19600).getInt(19600);
        netherrackIceAxeID = config.getItem("Netherrack IceAxes", 19612).getInt(19612);
        glowstoneIceAxeID = config.getItem("Glowstone IceAxes", 19625).getInt(19625);
        iceIceAxeID = config.getItem("Ice IceAxes", 19634).getInt(19634);
        lavaIceAxeID = config.getItem("Lava IceAxes", 19640).getInt(19640);
        slimeIceAxeID = config.getItem("Slime IceAxes", 19648).getInt(19648);
        cactusIceAxeID = config.getItem("Cactus IceAxes", 19654).getInt(19654);
        flintIceAxeID = config.getItem("Flint IceAxes", 19661).getInt(19661);
        blazeIceAxeID = config.getItem("Blaze IceAxes", 19671).getInt(19671);
        
        copperIceAxeID = config.getItem("Copper IceAxes", 19679).getInt(19679);
        bronzeIceAxeID = config.getItem("Bronze IceAxes", 19687).getInt(19687);
        workedIronIceAxeID = config.getItem("Worked Iron IceAxes", 19696).getInt(19696);
        steelIceAxeID = config.getItem("Steel IceAxes", 19714).getInt(19714);
        cobaltIceAxeID = config.getItem("Cobalt IceAxes", 19734).getInt(19734);
        arditeIceAxeID = config.getItem("Ardite IceAxes", 19752).getInt(19752);
        manyullynIceAxeID = config.getItem("Manyullyn IceAxes", 19770).getInt(19770);
        uraniumIceAxeID = config.getItem("Uranium IceAxes", 19788).getInt(19788);
        
        woodMattockID = config.getItem("Wooden Mattocks", 19801).getInt(19801);
        stoneMattockID = config.getItem("Stone Mattocks", 19808).getInt(19808);
        ironMattockID = config.getItem("Iron Mattocks", 19817).getInt(19817);
        diamondMattockID = config.getItem("Diamond Mattocks", 19826).getInt(19826);
        redstoneMattockID = config.getItem("Redstone Mattocks", 19848).getInt(19848);
        obsidianMattockID = config.getItem("Obsidian Mattocks", 19868).getInt(19868);
        sandstoneMattockID = config.getItem("Sandstone Mattocks", 19878).getInt(19878);
        boneMattockID = config.getItem("Bone Mattocks", 19886).getInt(19886);
        paperMattockID = config.getItem("Paper Mattocks", 19895).getInt(19895);
        mossyMattockID = config.getItem("Mossy Mattocks", 19900).getInt(19900);
        netherrackMattockID = config.getItem("Netherrack Mattocks", 19912).getInt(19912);
        glowstoneMattockID = config.getItem("Glowstone Mattocks", 19925).getInt(19925);
        iceMattockID = config.getItem("Ice Mattocks", 19934).getInt(19934);
        lavaMattockID = config.getItem("Lava Mattocks", 19940).getInt(19940);
        slimeMattockID = config.getItem("Slime Mattocks", 19948).getInt(19948);
        cactusMattockID = config.getItem("Cactus Mattocks", 19954).getInt(19954);
        flintMattockID = config.getItem("Flint Mattocks", 19961).getInt(19961);
        blazeMattockID = config.getItem("Blaze Mattocks", 19971).getInt(19971);
        
        copperMattockID = config.getItem("Copper Mattocks", 19979).getInt(19979);
        bronzeMattockID = config.getItem("Bronze Mattocks", 19987).getInt(19987);
        workedIronMattockID = config.getItem("Worked Iron Mattocks", 19996).getInt(19996);
        steelMattockID = config.getItem("Steel Mattocks", 20014).getInt(20014);
        cobaltMattockID = config.getItem("Cobalt Mattocks", 20034).getInt(20034);
        arditeMattockID = config.getItem("Ardite Mattocks", 20052).getInt(20052);
        manyullynMattockID = config.getItem("Manyullyn Mattocks", 20070).getInt(20070);
        uraniumMattockID = config.getItem("Uranium Mattocks", 20088).getInt(20088);
        
        woodMalletID = config.getItem("Wooden Mallets", 20101).getInt(20101);
        stoneMalletID = config.getItem("Stone Mallets", 20108).getInt(20108);
        ironMalletID = config.getItem("Iron Mallets", 20117).getInt(20117);
        diamondMalletID = config.getItem("Diamond Mallets", 20126).getInt(20126);
        redstoneMalletID = config.getItem("Redstone Mallets", 20148).getInt(20148);
        obsidianMalletID = config.getItem("Obsidian Mallets", 20168).getInt(20168);
        sandstoneMalletID = config.getItem("Sandstone Mallets", 20178).getInt(20178);
        boneMalletID = config.getItem("Bone Mallets", 20186).getInt(20186);
        paperMalletID = config.getItem("Paper Mallets", 20195).getInt(20195);
        mossyMalletID = config.getItem("Mossy Mallets", 20200).getInt(20200);
        netherrackMalletID = config.getItem("Netherrack Mallets", 20212).getInt(20212);
        glowstoneMalletID = config.getItem("Glowstone Mallets", 20225).getInt(20225);
        iceMalletID = config.getItem("Ice Mallets", 20234).getInt(20234);
        lavaMalletID = config.getItem("Lava Mallets", 20240).getInt(20240);
        slimeMalletID = config.getItem("Slime Mallets", 20248).getInt(20248);
        cactusMalletID = config.getItem("Cactus Mallets", 20254).getInt(20254);
        flintMalletID = config.getItem("Flint Mallets", 20261).getInt(20261);
        blazeMalletID = config.getItem("Blaze Mallets", 20271).getInt(20271);
        
        copperMalletID = config.getItem("Copper Mallets", 20279).getInt(20279);
        bronzeMalletID = config.getItem("Bronze Mallets", 20287).getInt(20287);
        workedIronMalletID = config.getItem("Worked Iron Mallets", 20296).getInt(20296);
        steelMalletID = config.getItem("Steel Mallets", 20314).getInt(20314);
        cobaltMalletID = config.getItem("Cobalt Mallets", 20334).getInt(20334);
        arditeMalletID = config.getItem("Ardite Mallets", 20352).getInt(20352);
        manyullynMalletID = config.getItem("Manyullyn Mallets", 20370).getInt(20370);
        uraniumMalletID = config.getItem("Uranium Mallets", 20388).getInt(20388);
        
        woodMacheteID = config.getItem("Wooden Machetes", 20401).getInt(20401);
        stoneMacheteID = config.getItem("Stone Machetes", 20408).getInt(20408);
        ironMacheteID = config.getItem("Iron Machetes", 20417).getInt(20417);
        diamondMacheteID = config.getItem("Diamond Machetes", 20426).getInt(20426);
        redstoneMacheteID = config.getItem("Redstone Machetes", 20448).getInt(20448);
        obsidianMacheteID = config.getItem("Obsidian Machetes", 20468).getInt(20468);
        sandstoneMacheteID = config.getItem("Sandstone Machetes", 20478).getInt(20478);
        boneMacheteID = config.getItem("Bone Machetes", 20486).getInt(20486);
        paperMacheteID = config.getItem("Paper Machetes", 20495).getInt(20495);
        mossyMacheteID = config.getItem("Mossy Machetes", 20500).getInt(20500);
        netherrackMacheteID = config.getItem("Netherrack Machetes", 20512).getInt(20512);
        glowstoneMacheteID = config.getItem("Glowstone Machetes", 20525).getInt(20525);
        iceMacheteID = config.getItem("Ice Machetes", 20534).getInt(20534);
        lavaMacheteID = config.getItem("Lava Machetes", 20540).getInt(20540);
        slimeMacheteID = config.getItem("Slime Machetes", 20548).getInt(20548);
        cactusMacheteID = config.getItem("Cactus Machetes", 20554).getInt(20554);
        flintMacheteID = config.getItem("Flint Machetes", 20561).getInt(20561);
        blazeMacheteID = config.getItem("Blaze Machetes", 20571).getInt(20571);
        
        copperMacheteID = config.getItem("Copper Machetes", 20579).getInt(20579);
        bronzeMacheteID = config.getItem("Bronze Machetes", 20587).getInt(20587);
        workedIronMacheteID = config.getItem("Worked Iron Machetes", 20596).getInt(20596);
        steelMacheteID = config.getItem("Steel Machetes", 20614).getInt(20614);
        cobaltMacheteID = config.getItem("Cobalt Machetes", 20634).getInt(20634);
        arditeMacheteID = config.getItem("Ardite Machetes", 20652).getInt(20652);
        manyullynMacheteID = config.getItem("Manyullyn Machetes", 20670).getInt(20670);
        uraniumMacheteID = config.getItem("Uranium Machetes", 20688).getInt(20688);
        
        woodScytheID = config.getItem("Wooden Scythes", 20701).getInt(20701);
        stoneScytheID = config.getItem("Stone Scythes", 20708).getInt(20708);
        ironScytheID = config.getItem("Iron Scythes", 20717).getInt(20717);
        diamondScytheID = config.getItem("Diamond Scythes", 20726).getInt(20726);
        redstoneScytheID = config.getItem("Redstone Scythes", 20748).getInt(20748);
        obsidianScytheID = config.getItem("Obsidian Scythes", 20768).getInt(20768);
        sandstoneScytheID = config.getItem("Sandstone Scythes", 20778).getInt(20778);
        boneScytheID = config.getItem("Bone Scythes", 20786).getInt(20786);
        paperScytheID = config.getItem("Paper Scythes", 20795).getInt(20795);
        mossyScytheID = config.getItem("Mossy Scythes", 20800).getInt(20800);
        netherrackScytheID = config.getItem("Netherrack Scythes", 20812).getInt(20812);
        glowstoneScytheID = config.getItem("Glowstone Scythes", 20825).getInt(20825);
        iceScytheID = config.getItem("Ice Scythes", 20834).getInt(20834);
        lavaScytheID = config.getItem("Lava Scythes", 20840).getInt(20840);
        slimeScytheID = config.getItem("Slime Scythes", 20848).getInt(20848);
        cactusScytheID = config.getItem("Cactus Scythes", 20854).getInt(20854);
        flintScytheID = config.getItem("Flint Scythes", 20861).getInt(20861);
        blazeScytheID = config.getItem("Blaze Scythes", 20871).getInt(20871);
        
        copperScytheID = config.getItem("Copper Scythes", 20879).getInt(20879);
        bronzeScytheID = config.getItem("Bronze Scythes", 20887).getInt(20887);
        workedIronScytheID = config.getItem("Worked Iron Scythes", 20896).getInt(20896);
        steelScytheID = config.getItem("Steel Scythes", 20914).getInt(20914);
        cobaltScytheID = config.getItem("Cobalt Scythes", 20934).getInt(20934);
        arditeScytheID = config.getItem("Ardite Scythes", 20952).getInt(20952);
        manyullynScytheID = config.getItem("Manyullyn Scythes", 20970).getInt(20970);
        uraniumScytheID = config.getItem("Uranium Scythes", 20988).getInt(20988);

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