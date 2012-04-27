package net.minecraft.src.infirange;
import java.io.File;
import java.io.IOException;

import net.minecraft.client.Minecraft;
import net.minecraft.src.Item;
import net.minecraft.src.forge.Configuration;

public class PropsHelperInfiRange {

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
        
        woodSpearID = config.getOrCreateIntProperty("Wooden Spears", "item", 22501).getInt(22501);
        stoneSpearID = config.getOrCreateIntProperty("Stone Spears", "item", 22508).getInt(22508);
        ironSpearID = config.getOrCreateIntProperty("Iron Spears", "item", 22517).getInt(22517);
        diamondSpearID = config.getOrCreateIntProperty("Diamond Spears", "item", 22526).getInt(22526);
        redstoneSpearID = config.getOrCreateIntProperty("Redstone Spears", "item", 22548).getInt(22548);
        obsidianSpearID = config.getOrCreateIntProperty("Obsidian Spears", "item", 22568).getInt(22568);
        sandstoneSpearID = config.getOrCreateIntProperty("Sandstone Spears", "item", 22578).getInt(22578);
        boneSpearID = config.getOrCreateIntProperty("Bone Spears", "item", 22586).getInt(22586);
        paperSpearID = config.getOrCreateIntProperty("Paper Spears", "item", 22595).getInt(22595);
        mossySpearID = config.getOrCreateIntProperty("Mossy Spears", "item", 22600).getInt(22600);
        netherrackSpearID = config.getOrCreateIntProperty("Netherrack Spears", "item", 22612).getInt(22612);
        glowstoneSpearID = config.getOrCreateIntProperty("Glowstone Spears", "item", 22625).getInt(22625);
        iceSpearID = config.getOrCreateIntProperty("Ice Spears", "item", 22634).getInt(22634);
        lavaSpearID = config.getOrCreateIntProperty("Lava Spears", "item", 22640).getInt(22640);
        slimeSpearID = config.getOrCreateIntProperty("Slime Spears", "item", 22648).getInt(22648);
        cactusSpearID = config.getOrCreateIntProperty("Cactus Spears", "item", 22654).getInt(22654);
        flintSpearID = config.getOrCreateIntProperty("Flint Spears", "item", 22661).getInt(22661);
        blazeSpearID = config.getOrCreateIntProperty("Blaze Spears", "item", 22671).getInt(22671);
        
        copperSpearID = config.getOrCreateIntProperty("Copper Spears", "item", 22679).getInt(22679);
        bronzeSpearID = config.getOrCreateIntProperty("Bronze Spears", "item", 22687).getInt(22687);
        workedIronSpearID = config.getOrCreateIntProperty("Worked Iron Spears", "item", 22696).getInt(22696);
        steelSpearID = config.getOrCreateIntProperty("Steel Spears", "item", 22714).getInt(22714);
        cobaltSpearID = config.getOrCreateIntProperty("Cobalt Spears", "item", 22734).getInt(22734);
        arditeSpearID = config.getOrCreateIntProperty("Ardite Spears", "item", 22752).getInt(22752);
        manyullynSpearID = config.getOrCreateIntProperty("Manyullyn Spears", "item", 22770).getInt(22770);
        uraniumSpearID = config.getOrCreateIntProperty("Uranium Spears", "item", 22788).getInt(22788);
        
        

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
    
    public static int woodSpearID;
    public static int stoneSpearID;
    public static int ironSpearID;
    public static int diamondSpearID;
    public static int redstoneSpearID;
    public static int obsidianSpearID;
    public static int sandstoneSpearID;
    public static int boneSpearID;
    public static int paperSpearID;
    public static int mossySpearID;
    public static int netherrackSpearID;
    public static int glowstoneSpearID;
    public static int iceSpearID;
    public static int lavaSpearID;
    public static int slimeSpearID;
    public static int cactusSpearID;
    public static int flintSpearID;
    public static int blazeSpearID;
    
    public static int copperSpearID;
    public static int bronzeSpearID;
    public static int workedIronSpearID;
    public static int steelSpearID;
    public static int cobaltSpearID;
    public static int arditeSpearID;
    public static int manyullynSpearID;
    public static int uraniumSpearID;
}