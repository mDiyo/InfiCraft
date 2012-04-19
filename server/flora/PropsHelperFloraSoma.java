package net.minecraft.src.flora;
import java.io.File;
import java.io.IOException;

import net.minecraft.src.Item;
import net.minecraft.src.forge.Configuration;
import net.minecraft.src.mod_FloraSoma;

public class PropsHelperFloraSoma {

    public static void initProps()
    {
        /* Here we will set up the config file for the mod 
         * First: Create a folder inside the config folder
         * Second: Create the actual config file
         * Note: Configs are a pain, but absolutely necessary for every mod.
         */

        File file = new File("./config/InfiCraft");
        file.mkdir();
        File newFile = new File("./config/InfiCraft/FloraSoma.txt");

        /* Some basic debugging will go a long way */
        try
        {
            newFile.createNewFile();
            System.out.println("Successfully created/read configuration file");
        }
        catch (IOException e)
        {
            System.out.println("Could not create configuration file for mod_FloraSoma. Reason:");
            System.out.println(e);
        }

        /* [Forge] Configuration class, used as config method */
        Configuration config = new Configuration(newFile);

        /* Load the configuration file */
        config.load();

        /* Define the mod's IDs. 
         * Avoid values below 4096 for items and in the 250-450 range for blocks
         */
        
        mod_FloraSoma.redwoodID = config.getOrCreateBlockIdProperty("Wood Block", 168).getInt(168);
        mod_FloraSoma.redwoodDoorID = config.getOrCreateBlockIdProperty("Redwood Door", 176).getInt(176);
        mod_FloraSoma.cloudID = config.getOrCreateBlockIdProperty("Cloud Block", 171).getInt(171);
        mod_FloraSoma.corruptorID = config.getOrCreateBlockIdProperty("Corruptor", 172).getInt(172);
        mod_FloraSoma.corruptBrickID = config.getOrCreateBlockIdProperty("Corrupt Brick", 173).getInt(173);
        mod_FloraSoma.floraSaplingID = config.getOrCreateBlockIdProperty("Sapling", 174).getInt(174);
        mod_FloraSoma.berryBlockID = config.getOrCreateBlockIdProperty("Berry Bush", 167).getInt(167);
        mod_FloraSoma.cherryLeavesID = config.getOrCreateBlockIdProperty("Sakura Leaves", 175).getInt(175);        
        mod_FloraSoma.floraLeavesID = config.getOrCreateBlockIdProperty("Flora Leaves", 171).getInt(171); 
        mod_FloraSoma.floraCropsID = config.getOrCreateBlockIdProperty("Crops", 170).getInt(170); 
        //saguaroID = config.getOrCreateBlockIdProperty("Cloud Block", 171).getInt(171);
        
        mod_FloraSoma.seedBagID = config.getOrCreateIntProperty("Seed Bag", "item", 12401).getInt(12401);
        mod_FloraSoma.berryID = config.getOrCreateIntProperty("Berry Food", "item", 12402).getInt(12402);
        mod_FloraSoma.barleySeedID = config.getOrCreateIntProperty("Barley Seed", "item", 12403).getInt(12403);
        mod_FloraSoma.foodID = config.getOrCreateIntProperty("Food Items", "item", 12404).getInt(12404);
        mod_FloraSoma.boatItemID = config.getOrCreateIntProperty("Boat Item", "item", 12405).getInt(12405);
        mod_FloraSoma.ingredientsID = config.getOrCreateIntProperty("Ingredients", "item", 12407).getInt(12407);
        mod_FloraSoma.redwoodDoorItemID = config.getOrCreateIntProperty("Redwood Door", "item", 12406).getInt(12406);

        mod_FloraSoma.enableCrops = config.getOrCreateBooleanProperty("Enable Crops", "general", true).getBoolean(true);
        mod_FloraSoma.barleySpawnDensity = config.getOrCreateIntProperty("Barley Spawn Density", "general", 64).getInt(64);
        mod_FloraSoma.barleySpawnHeight = config.getOrCreateIntProperty("Barley Spawn Height", "general", 64).getInt(64);
        
        mod_FloraSoma.enableBerryBush = config.getOrCreateBooleanProperty("Enable Berry Bushes", "general", true).getBoolean(true);
        mod_FloraSoma.raspSpawnDensity = config.getOrCreateIntProperty("Raspberry Spawn Density", "general", 14).getInt(14);
        mod_FloraSoma.raspSpawnHeight = config.getOrCreateIntProperty("Raspberry Spawn Height", "general", 64).getInt(64);
        mod_FloraSoma.raspSpawnRange = config.getOrCreateIntProperty("Raspberry Spawn Range", "general", 128).getInt(128);
        mod_FloraSoma.blueSpawnDensity = config.getOrCreateIntProperty("Blueberry Spawn Density", "general", 12).getInt(12);
        mod_FloraSoma.blueSpawnHeight = config.getOrCreateIntProperty("Blueberry Spawn Height", "general", 64).getInt(64);
        mod_FloraSoma.blueSpawnRange = config.getOrCreateIntProperty("Blueberry Spawn Range", "general", 128).getInt(128);
        mod_FloraSoma.blackSpawnDensity = config.getOrCreateIntProperty("Blackberry Spawn Density", "general", 10).getInt(10);
        mod_FloraSoma.blackSpawnHeight = config.getOrCreateIntProperty("Blackberry Spawn Height", "general", 64).getInt(64);
        mod_FloraSoma.blackSpawnRange = config.getOrCreateIntProperty("Blackberry Spawn Range", "general", 128).getInt(128);
        mod_FloraSoma.geoSpawnDensity = config.getOrCreateIntProperty("Geoberry Spawn Density", "general", 14).getInt(14);
        mod_FloraSoma.geoSpawnHeight = config.getOrCreateIntProperty("Geoberry Spawn Height", "general", 64).getInt(64);
        mod_FloraSoma.geoSpawnRange = config.getOrCreateIntProperty("Geoberry Spawn Range", "general", 128).getInt(128);
        
        mod_FloraSoma.enableTrees = config.getOrCreateBooleanProperty("Enable Trees", "general", true).getBoolean(true);
        mod_FloraSoma.redwoodSpawnDensity = config.getOrCreateIntProperty("Redwood Tree Spawn Density", "general", 6).getInt(6);
        mod_FloraSoma.redwoodSpawnHeight = config.getOrCreateIntProperty("Redwood Tree Spawn Height", "general", 64).getInt(64);
        mod_FloraSoma.redwoodSpawnRange = config.getOrCreateIntProperty("Redwood Tree Spawn Range", "general", 32).getInt(32);
        mod_FloraSoma.bloodSpawnDensity = config.getOrCreateIntProperty("Bloodwood Tree Spawn Density", "general", 5).getInt(5);
        mod_FloraSoma.bloodSpawnHeight = config.getOrCreateIntProperty("Bloodwood Tree Spawn Height", "general", 32).getInt(32);
        mod_FloraSoma.bloodSpawnRange = config.getOrCreateIntProperty("Bloodwood Tree Spawn Range", "general", 64).getInt(64);
        mod_FloraSoma.eucalyptusShortSpawnDensity = config.getOrCreateIntProperty("Small Eucalyptus Tree Spawn Density", "general", 25).getInt(25);
        mod_FloraSoma.eucalyptusShortSpawnHeight = config.getOrCreateIntProperty("Small Eucalyptus Tree Spawn Height", "general", 64).getInt(64);
        mod_FloraSoma.eucalyptusShortSpawnRange = config.getOrCreateIntProperty("Small Eucalyptus Tree Spawn Range", "general", 32).getInt(32);
        mod_FloraSoma.sakuraSpawnDensity = config.getOrCreateIntProperty("Sakura Tree Spawn Density", "general", 10).getInt(10);
        mod_FloraSoma.sakuraSpawnHeight = config.getOrCreateIntProperty("Sakura Tree Spawn Height", "general", 64).getInt(64);
        mod_FloraSoma.sakuraSpawnRange = config.getOrCreateIntProperty("Sakura Tree Spawn Range", "general", 32).getInt(32);
        mod_FloraSoma.whiteSpawnDensity = config.getOrCreateIntProperty("Ghost Tree Spawn Density", "general", 25).getInt(25);
        mod_FloraSoma.whiteSpawnHeight = config.getOrCreateIntProperty("Ghost Tree Spawn Height", "general", 16).getInt(16);
        mod_FloraSoma.whiteSpawnRange  = config.getOrCreateIntProperty("Ghost Tree Spawn Range", "general", 80).getInt(80);
        
        mod_FloraSoma.enableClouds = config.getOrCreateBooleanProperty("Enable Clouds", "general", true).getBoolean(true);
        mod_FloraSoma.cloudSpawnDensity = config.getOrCreateIntProperty("Cloud Spawn Density", "general", 10).getInt(10);
        mod_FloraSoma.cloudSpawnHeight = config.getOrCreateIntProperty("Cloud Spawn Height", "general", 192).getInt(192);
        mod_FloraSoma.cloudSpawnRange = config.getOrCreateIntProperty("Cloud Spawn Range", "general", 48).getInt(48);
        mod_FloraSoma.darkCloudSpawnDensity = config.getOrCreateIntProperty("Dark Cloud Spawn Density", "general", 10).getInt(10);
        mod_FloraSoma.darkCloudSpawnHeight = config.getOrCreateIntProperty("Dark Cloud Spawn Height", "general", 64).getInt(64);
        mod_FloraSoma.darkCloudSpawnRange = config.getOrCreateIntProperty("Dark Cloud Spawn Range", "general", 128).getInt(128);
        mod_FloraSoma.sulfurSpawnDensity = config.getOrCreateIntProperty("Sulfur Cloud Spawn Density", "general", 20).getInt(20);
        mod_FloraSoma.sulfurSpawnHeight = config.getOrCreateIntProperty("Sulfur Cloud Spawn Height", "general", 40).getInt(40);
        mod_FloraSoma.sulfurSpawnRange = config.getOrCreateIntProperty("Sulfur Cloud Spawn Range", "general", 78).getInt(78);
        mod_FloraSoma.ashSpawnDensity = config.getOrCreateIntProperty("Ash Cloud Spawn Density", "general", 20).getInt(20);
        mod_FloraSoma.ashSpawnHeight = config.getOrCreateIntProperty("Ash Cloud Spawn Height", "general", 40).getInt(40);
        mod_FloraSoma.ashSpawnRange = config.getOrCreateIntProperty("Ash Cloud Spawn Range", "general", 78).getInt(78);
        
        mod_FloraSoma.enableCorruptor = config.getOrCreateBooleanProperty("Enable Clouds", "general", true).getBoolean(true);
        mod_FloraSoma.corruptorSpawnDensity = config.getOrCreateIntProperty("Corruptor Spawn Density", "general", 1).getInt(1);
        mod_FloraSoma.corruptorSpawnHeight = config.getOrCreateIntProperty("Corruptor Spawn Height", "general", 0).getInt(0);
        mod_FloraSoma.corruptorSpawnRange = config.getOrCreateIntProperty("Corruptor Spawn Range", "general", 128).getInt(128);
        mod_FloraSoma.corruptorSpawnSize = config.getOrCreateIntProperty("Corruptor Spawn Slize", "general", 8).getInt(8);
        mod_FloraSoma.corruptionSpeed = config.getOrCreateIntProperty("Corruption Speed", "general", 5).getInt(5);

        /* Save the configuration file */
        config.save();
    }
}