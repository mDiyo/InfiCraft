package florasoma.crops;

import java.io.File;
import java.io.IOException;

import net.minecraftforge.common.Configuration;

public class PHCrops 
{

	public static void initProps()
    {
        /* Here we will set up the config file for the mod 
         * First: Create a folder inside the config folder
         * Second: Create the actual config file
         * Note: Configs are a pain, but absolutely necessary for every mod.
         */
		
		File file = new File(FloraCrops.proxy.getMinecraftDir() + "/config/InfiCraft");
        file.mkdir();
        File newFile = new File(FloraCrops.proxy.getMinecraftDir() + "/config/InfiCraft/FloraSoma.txt");
        
        /* Some basic debugging will go a long way */
        try
        {
            newFile.createNewFile();
            System.out.println("Successfully read configuration file for mod_FloraCrops");
        }
        catch (IOException e)
        {
            System.out.println("Could not read configuration file for mod_FloraCrops. Reason:");
            System.out.println(e);
        }

        /* [Forge] Configuration class, used as config method */
        Configuration config = new Configuration(newFile);

        /* Load the configuration file */
        config.load();

        /* Define the mod's IDs. 
         * Avoid values below 4096 for items and in the 250-450 range for blocks
         */
        
        floraCropsID = config.getBlock("Crops", 3260).getInt(3260); 
        
        barleySeedID = config.getItem("Barley Seed", 12403).getInt(12403);
        foodID = config.getItem("Food Items", 12404).getInt(12404);
        ingredientsID = config.getItem("Ingredients", 12407).getInt(12407);
        
        wheatBagID = config.getItem("Wheat Bag", 12411).getInt(12411);
        barleyBagID = config.getItem("Barley Bag", 12412).getInt(12412);
        potatoBagID = config.getItem("Potato Bag", 12413).getInt(12413);
        carrotBagID = config.getItem("Carrot Bag", 12414).getInt(12414);
        netherWartBagID = config.getItem("Nether Wart Bag", 12415).getInt(12415);
        
        berryBlockID = config.getBlock("Berry_Bush", 3257).getInt(3257);
        berryItemID = config.getItem("Berry_Food", 12402).getInt(12402);

        barleySpawnDensity = config.get("Crops", "Barley Spawn Density", 64).getInt(64);
        barleySpawnRange = config.get("Crops", "Barley Spawn Range", 64).getInt(64);     
        
        raspSpawnDensity = config.get("Berries", "Raspberry Spawn Rarity", 14).getInt(14);
        raspSpawnRange = config.get("Berries", "Raspberry Spawn Range", 128).getInt(128);
        blueSpawnDensity = config.get("Berries", "Blueberry Spawn Rarity", 12).getInt(12);
        blueSpawnRange = config.get("Berries", "Blueberry Spawn Range", 128).getInt(128);
        blackSpawnDensity = config.get("Berries", "Blackberry Spawn Rarity", 10).getInt(10);
        blackSpawnRange = config.get("Berries", "Blackberry Spawn Range", 128).getInt(128);
        geoSpawnDensity = config.get("Berries", "Geoberry Spawn Rarity", 14).getInt(14);
        geoSpawnRange = config.get("Berries", "Geoberry Spawn Range", 128).getInt(128);
        
        seaLevel = config.get("general", "Sea level", 64).getInt(64);
       
        /* Save the configuration file */
        config.save();
    }
	
	/* Prototype fields, used elsewhere */
	
	public static int seaLevel;
	
	public static int wheatBagID;
	public static int barleyBagID;
	public static int potatoBagID;
	public static int carrotBagID;
	public static int netherWartBagID;
	
	public static int barleySeedID;

	public static int floraCropsID;
	public static int foodID;
	
	public static int saguaroID;
	
	public static int barleySpawnDensity;
	public static int barleySpawnRange;

	public static int saguaroSpawnDensity;
	public static int saguaroSpawnHeight;
	public static int saguaroSpawnRange;
	public static int saguaroSpawnSize;
	
	public static int ingredientsID;
	
	public static int raspSpawnDensity;
	public static int raspSpawnRange;
	public static int blueSpawnDensity;
	public static int blueSpawnRange;
	public static int blackSpawnDensity;
	public static int blackSpawnRange;
	public static int geoSpawnDensity;
	public static int geoSpawnRange;
	
	public static int berryItemID;
	public static int berryBlockID;
}
