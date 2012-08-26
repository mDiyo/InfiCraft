package mdiyo.inficraft.flora.trees;

import java.io.File;
import java.io.IOException;

import net.minecraft.client.Minecraft;
import net.minecraftforge.common.Configuration;

public class PHTrees 
{

	public static void initProps()
    {
        /* Here we will set up the config file for the mod 
         * First: Create a folder inside the config folder
         * Second: Create the actual config file
         * Note: Configs are a pain, but absolutely necessary for every mod.
         */
		
		File file = new File(Minecraft.getMinecraftDir() + "/config/InfiCraft");
        file.mkdir();
        File newFile = new File(Minecraft.getMinecraftDir() + "/config/InfiCraft/FloraTrees.txt");
        
        /* Some basic debugging will go a long way */
        try
        {
            newFile.createNewFile();
            System.out.println("Successfully read configuration file for mod_FloraTrees");
        }
        catch (IOException e)
        {
            System.out.println("Could not read configuration file for mod_FloraTrees. Reason:");
            System.out.println(e);
        }

        /* [Forge] Configuration class, used as config method */
        Configuration config = new Configuration(newFile);

        /* Load the configuration file */
        config.load();

        /* Define the mod's IDs. 
         * Avoid values below 4096 for items and in the 250-450 range for blocks
         */
        
        redwoodID = config.getOrCreateBlockIdProperty("Wood Block", 3251).getInt(3251);
        floraLeavesID = config.getOrCreateBlockIdProperty("Flora Leaves", 3259).getInt(3259); 
        cherryLeavesID = config.getOrCreateBlockIdProperty("Sakura Leaves", 3258).getInt(3258);       
        
        floraSaplingID = config.getOrCreateBlockIdProperty("Sapling", 3256).getInt(3256);
        
        redwoodDoorID = config.getOrCreateBlockIdProperty("Redwood Door", 3252).getInt(3252);
        redwoodDoorItemID = config.getOrCreateIntProperty("Redwood Door", "item", 12406).getInt(12406);
        
        boatItemID = config.getOrCreateIntProperty("Boat Item", "item", 12405).getInt(12405);
        
        generateRedwood = config.getOrCreateBooleanProperty("Generate Redwood Trees", "general", true).getBoolean(true);
        generateSakura = config.getOrCreateBooleanProperty("Generate Sakura Trees", "general", true).getBoolean(true);
        generateSmallEucalyptus = config.getOrCreateBooleanProperty("Generate Small Eucalyptus Trees", "general", true).getBoolean(true);
        generateBloodwood = config.getOrCreateBooleanProperty("Generate Bloodwood Trees", "general", true).getBoolean(true);
        generateGhost = config.getOrCreateBooleanProperty("Generate Ghost Trees", "general", true).getBoolean(true);
        
        redwoodSpawnDensity = config.getOrCreateIntProperty("Redwood Tree Spawn Density", "general", 6).getInt(6);
        redwoodSpawnHeight = config.getOrCreateIntProperty("Redwood Tree Spawn Height", "general", 64).getInt(64);
        redwoodSpawnRange = config.getOrCreateIntProperty("Redwood Tree Spawn Range", "general", 32).getInt(32);
        bloodSpawnDensity = config.getOrCreateIntProperty("Bloodwood Tree Spawn Density", "general", 5).getInt(5);
        bloodSpawnHeight = config.getOrCreateIntProperty("Bloodwood Tree Spawn Height", "general", 32).getInt(32);
        bloodSpawnRange = config.getOrCreateIntProperty("Bloodwood Tree Spawn Range", "general", 64).getInt(64);
        eucalyptusShortSpawnDensity = config.getOrCreateIntProperty("Small Eucalyptus Tree Spawn Density", "general", 25).getInt(25);
        eucalyptusShortSpawnHeight = config.getOrCreateIntProperty("Small Eucalyptus Tree Spawn Height", "general", 64).getInt(64);
        eucalyptusShortSpawnRange = config.getOrCreateIntProperty("Small Eucalyptus Tree Spawn Range", "general", 32).getInt(32);
        sakuraSpawnDensity = config.getOrCreateIntProperty("Sakura Tree Spawn Density", "general", 10).getInt(10);
        sakuraSpawnHeight = config.getOrCreateIntProperty("Sakura Tree Spawn Height", "general", 64).getInt(64);
        sakuraSpawnRange = config.getOrCreateIntProperty("Sakura Tree Spawn Range", "general", 32).getInt(32);
        whiteSpawnDensity = config.getOrCreateIntProperty("Ghost Tree Spawn Density", "general", 25).getInt(25);
        whiteSpawnHeight = config.getOrCreateIntProperty("Ghost Tree Spawn Height", "general", 16).getInt(16);
        whiteSpawnRange  = config.getOrCreateIntProperty("Ghost Tree Spawn Range", "general", 80).getInt(80);
        
        /* Save the configuration file */
        config.save();
    }
	
	public static int redwoodID;
	public static int cherryLeavesID;
	
	public static int floraSaplingID;
	public static int floraLeavesID;
	
	public static int redwoodDoorID;
	public static int redwoodDoorItemID;

	public static int boatItemID;
	
	public static boolean generateRedwood;
	public static boolean generateSakura;
	public static boolean generateSmallEucalyptus;
	public static boolean generateBloodwood;
	public static boolean generateGhost;
	
	public static int redwoodSpawnDensity;
	public static int redwoodSpawnHeight;
	public static int redwoodSpawnRange;
	public static int bloodSpawnDensity;
	public static int bloodSpawnHeight;
	public static int bloodSpawnRange;
	public static int eucalyptusShortSpawnDensity;
	public static int eucalyptusShortSpawnHeight;
	public static int eucalyptusShortSpawnRange;
	public static int sakuraSpawnDensity;
	public static int sakuraSpawnHeight;
	public static int sakuraSpawnRange;
	public static int whiteSpawnDensity;
	public static int whiteSpawnHeight;
	public static int whiteSpawnRange;
}
