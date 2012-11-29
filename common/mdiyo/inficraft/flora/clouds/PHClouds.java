package mDiyo.inficraft.flora.clouds;

import java.io.File;
import java.io.IOException;

import net.minecraft.client.Minecraft;
import net.minecraftforge.common.Configuration;

public class PHClouds 
{

	public static void initProps()
    {
        /* Here we will set up the config file for the mod 
         * First: Create a folder inside the config folder
         * Second: Create the actual config file
         * Note: Configs are a pain, but absolutely necessary for every mod.
         */
		
		File file = new File(FloraClouds.proxy.getMinecraftDir() + "/config/InfiCraft");
        file.mkdir();
        File newFile = new File(FloraClouds.proxy.getMinecraftDir() + "/config/InfiCraft/FloraClouds.txt");
        
        /* Some basic debugging will go a long way */
        try
        {
            newFile.createNewFile();
            System.out.println("Successfully read configuration file for mod_FloraClouds for mod_FloraClouds");
        }
        catch (IOException e)
        {
            System.out.println("Could not read configuration file for mod_FloraClouds. Reason:");
            System.out.println(e);
        }

        /* [Forge] Configuration class, used as config method */
        Configuration config = new Configuration(newFile);

        /* Load the configuration file */
        config.load();

        /* Define the mod's IDs. 
         * Avoid values below 4096 for items and in the 250-450 range for blocks
         */
        
        cloudID = config.getBlock("Cloud Block", 3253).getInt(3253);
        
        cloudSpawnDensity = config.get("general", "Cloud Spawn Density", 10).getInt(10);
        cloudSpawnHeight = config.get("general", "Cloud Spawn Height", 192).getInt(192);
        cloudSpawnRange = config.get("general", "Cloud Spawn Range", 48).getInt(48);
        darkCloudSpawnDensity = config.get("general", "Dark Cloud Spawn Density", 10).getInt(10);
        darkCloudSpawnHeight = config.get("general", "Dark Cloud Spawn Height", 64).getInt(64);
        darkCloudSpawnRange = config.get("general", "Dark Cloud Spawn Range", 128).getInt(128);
        sulfurSpawnDensity = config.get("general", "Sulfur Cloud Spawn Density", 20).getInt(20);
        sulfurSpawnHeight = config.get("general", "Sulfur Cloud Spawn Height", 40).getInt(40);
        sulfurSpawnRange = config.get("general", "Sulfur Cloud Spawn Range", 78).getInt(78);
        ashSpawnDensity = config.get("general", "Ash Cloud Spawn Density", 20).getInt(20);
        ashSpawnHeight = config.get("general", "Ash Cloud Spawn Height", 40).getInt(40);
        ashSpawnRange = config.get("general", "Ash Cloud Spawn Range", 78).getInt(78);
        
        /* Save the configuration file */
        config.save();
    }
	
	/* Prototype fields, used elsewhere */
	public static int cloudID;
	
	public static int cloudSpawnDensity;
	public static int cloudSpawnHeight;
	public static int cloudSpawnRange;
	public static int darkCloudSpawnDensity;
	public static int darkCloudSpawnHeight;
	public static int darkCloudSpawnRange;
	public static int sulfurSpawnDensity;
	public static int sulfurSpawnHeight;
	public static int sulfurSpawnRange;
	public static int ashSpawnDensity;
	public static int ashSpawnHeight;
	public static int ashSpawnRange;
	
}
