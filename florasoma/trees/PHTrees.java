package florasoma.trees;

import java.io.File;
import java.io.IOException;

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
		
		File file = new File(FloraTrees.proxy.getMinecraftDir() + "/config/InfiCraft");
        file.mkdir();
        File newFile = new File(FloraTrees.proxy.getMinecraftDir() + "/config/InfiCraft/FloraSoma.txt");
        
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
        
        treeID = config.getBlock("Wood Block", 3251).getInt(3251);
        redwoodID = config.getBlock("Redwood Block", 3261).getInt(3261);
        planksID = config.getBlock("Planks Block", 3262).getInt(3262);
        bloodwoodID = config.getBlock("Bloodwood Block", 3263).getInt(3263);
        floraLeavesID = config.getBlock("Flora Leaves", 3259).getInt(3259); 
        cherryLeavesID = config.getBlock("Sakura Leaves", 3258).getInt(3258);       
        
        floraSaplingID = config.getBlock("Sapling", 3256).getInt(3256);
        
        redwoodDoor = config.getBlock("Redwood Door", 3252).getInt(3252);
        eucalyptusDoor = config.getBlock("Eucalyptus Door", 3264).getInt(3264);
        hopseedDoor = config.getBlock("Hopseed Door", 3265).getInt(3265);
        sakuraDoor = config.getBlock("Sakura Door", 3266).getInt(3266);
        ghostDoor = config.getBlock("Ghostwood Door", 3267).getInt(3267);
        bloodDoor = config.getBlock("Bloodwood Door", 3268).getInt(3268);
        redwoodBarkDoor = config.getBlock("Redwood Bark Door", 3269).getInt(3269);
        
        doorItemID = config.getItem("Door Item", 12406).getInt(12406);        
        boatItemID = config.getItem("Boat Item", "item", 12405).getInt(12405);
        
        generateRedwood = config.get("Trees", "Generate Redwood Trees", true).getBoolean(true);
        generateSakura = config.get("Trees", "Generate Sakura Trees", true).getBoolean(true);
        generateSmallEucalyptus = config.get("Trees", "Generate Small Eucalyptus Trees", true).getBoolean(true);
        generateBush = config.get("Trees", "Generate Hopseed Trees", true).getBoolean(true);
        generateBloodwood = config.get("Trees", "Generate Bloodwood Trees", true).getBoolean(true);
        generateGhost = config.get("Trees", "Generate Ghost Trees", true).getBoolean(true);
        
        redwoodSpawnDensity = config.get("Trees", "Redwood Tree Spawn Density", 60).getInt(60);
        redwoodSpawnHeight = config.get("Trees", "Redwood Tree Spawn Height", 64).getInt(64);
        redwoodSpawnRange = config.get("Trees", "Redwood Tree Spawn Range", 32).getInt(32);
        bloodSpawnDensity = config.get("Trees", "Bloodwood Tree Spawn Density", 5).getInt(5);
        bloodSpawnHeight = config.get("Trees", "Bloodwood Tree Spawn Height", 32).getInt(32);
        bloodSpawnRange = config.get("Trees", "Bloodwood Tree Spawn Range", 64).getInt(64);
        eucalyptusShortSpawnDensity = config.get("Trees", "Small Eucalyptus Tree Spawn Density", 25).getInt(25);
        eucalyptusShortSpawnHeight = config.get("Trees", "Small Eucalyptus Tree Spawn Height", 64).getInt(64);
        eucalyptusShortSpawnRange = config.get("Trees", "Small Eucalyptus Tree Spawn Range", 32).getInt(32);
        sakuraSpawnDensity = config.get("Trees", "Sakura Tree Spawn Density", 10).getInt(10);
        sakuraSpawnHeight = config.get("Trees", "Sakura Tree Spawn Height", 64).getInt(64);
        sakuraSpawnRange = config.get("Trees", "Sakura Tree Spawn Range", 32).getInt(32);
        ghostSpawnDensity = config.get("Trees", "Ghost Tree Spawn Density", 25).getInt(25);
        ghostSpawnHeight = config.get("Trees", "Ghost Tree Spawn Height", 16).getInt(16);
        ghostSpawnRange  = config.get("Trees", "Ghost Tree Spawn Range", 80).getInt(80);
        bushSpawnDensity = config.get("Trees", "Bush Tree Spawn Density", 10).getInt(10);
        bushSpawnHeight = config.get("Trees", "Bush Tree Spawn Height", 64).getInt(64);
        bushSpawnRange = config.get("Trees", "Bush Tree Spawn Range", 20).getInt(20);
        
        seaLevel = config.get("general", "Sea level", 64).getInt(64);
        
        /* Save the configuration file */
        config.save();
    }
	
	public static int treeID;
	public static int redwoodID;
	public static int planksID;
	public static int bloodwoodID;
	
	public static int floraSaplingID;
	public static int floraLeavesID;
	public static int cherryLeavesID;
	
	public static int doorItemID;
	public static int redwoodDoor;
	public static int eucalyptusDoor;
	public static int hopseedDoor;
	public static int sakuraDoor;
	public static int ghostDoor;
	public static int bloodDoor;
	public static int redwoodBarkDoor;

	public static int boatItemID;
	
	public static boolean generateRedwood;
	public static boolean generateSakura;
	public static boolean generateSmallEucalyptus;
	public static boolean generateBloodwood;
	public static boolean generateGhost;
	public static boolean generateBush;
	
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
	public static int ghostSpawnDensity;
	public static int ghostSpawnHeight;
	public static int ghostSpawnRange;
	public static int bushSpawnDensity;
	public static int bushSpawnHeight;
	public static int bushSpawnRange;
	
	public static int seaLevel;
}
