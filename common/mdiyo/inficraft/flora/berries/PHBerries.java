package mdiyo.inficraft.flora.berries;

import java.io.File;
import java.io.IOException;

import net.minecraftforge.common.Configuration;

public class PHBerries 
{

	public static void initProps()
    {
        /* Here we will set up the config file for the mod 
         * First: Create a folder inside the config folder
         * Second: Create the actual config file
         * Note: Configs are a pain, but absolutely necessary for every mod.
         */
		
		File file = new File(FloraBerries.proxy.getMinecraftDir() + "/config/InfiCraft");
        file.mkdir();
        File newFile = new File(FloraBerries.proxy.getMinecraftDir() + "/config/InfiCraft/FloraBerries.txt");
        
        /* Some basic debugging will go a long way */
        try
        {
            newFile.createNewFile();
            System.out.println("Successfully read configuration file for mod_FloraBerries");
        }
        catch (IOException e)
        {
            System.out.println("Could not read configuration file for mod_FloraBerries. Reason:");
            System.out.println(e);
        }

        /* [Forge] Configuration class, used as config method */
        Configuration config = new Configuration(newFile);

        /* Load the configuration file */
        config.load();

        /* Define the mod's IDs. 
         * Avoid values below 4096 for items and in the 250-450 and 2216-2226 range for blocks
         */
        
        berryBlockID = config.getOrCreateBlockIdProperty("Berry_Bush", 3257).getInt(3257);
        berryItemID = config.getOrCreateIntProperty("Berry_Food", "item", 12402).getInt(12402);
        
        raspSpawnDensity = config.getOrCreateIntProperty("Raspberry_Spawn_Density", "general", 14).getInt(14);
        raspSpawnHeight = config.getOrCreateIntProperty("Raspberry_Spawn_Height", "general", 64).getInt(64);
        raspSpawnRange = config.getOrCreateIntProperty("Raspberry_Spawn_Range", "general", 128).getInt(128);
        blueSpawnDensity = config.getOrCreateIntProperty("Blueberry_Spawn_Density", "general", 12).getInt(12);
        blueSpawnHeight = config.getOrCreateIntProperty("Blueberry_Spawn_Height", "general", 64).getInt(64);
        blueSpawnRange = config.getOrCreateIntProperty("Blueberry_Spawn_Range", "general", 128).getInt(128);
        blackSpawnDensity = config.getOrCreateIntProperty("Blackberry_Spawn_Density", "general", 10).getInt(10);
        blackSpawnHeight = config.getOrCreateIntProperty("Blackberry_Spawn_Height", "general", 64).getInt(64);
        blackSpawnRange = config.getOrCreateIntProperty("Blackberry_Spawn_Range", "general", 128).getInt(128);
        geoSpawnDensity = config.getOrCreateIntProperty("Geoberry_Spawn_Density", "general", 14).getInt(14);
        geoSpawnHeight = config.getOrCreateIntProperty("Geoberry_Spawn_Height", "general", 64).getInt(64);
        geoSpawnRange = config.getOrCreateIntProperty("Geoberry_Spawn_Range", "general", 128).getInt(128);
        
        /* Save the configuration file */
        config.save();
    }
	
	/* Prototype fields, used elsewhere */
	public static int raspSpawnDensity;
	public static int raspSpawnHeight;
	public static int raspSpawnRange;
	public static int blueSpawnDensity;
	public static int blueSpawnHeight;
	public static int blueSpawnRange;
	public static int blackSpawnDensity;
	public static int blackSpawnHeight;
	public static int blackSpawnRange;
	public static int geoSpawnDensity;
	public static int geoSpawnHeight;
	public static int geoSpawnRange;
	
	public static int berryItemID;
	public static int berryBlockID;
	
}
