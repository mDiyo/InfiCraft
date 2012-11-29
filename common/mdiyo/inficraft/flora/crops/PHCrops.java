package mDiyo.inficraft.flora.crops;

import java.io.File;
import java.io.IOException;

import net.minecraft.client.Minecraft;
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
        File newFile = new File(FloraCrops.proxy.getMinecraftDir() + "/config/InfiCraft/FloraCrops.txt");
        
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
        
        seedBagID = config.getItem("Seed Bag", 12401).getInt(12401);
        barleySeedID = config.getItem("Barley Seed", 12403).getInt(12403);
        foodID = config.getItem("Food Items", 12404).getInt(12404);
        ingredientsID = config.getItem("Ingredients", 12407).getInt(12407);

        barleySpawnDensity = config.get("general", "Barley Spawn Density", 64).getInt(64);
        barleySpawnHeight = config.get("general", "Barley Spawn Height", 64).getInt(64);        
       
        /* Save the configuration file */
        config.save();
    }
	
	/* Prototype fields, used elsewhere */
	
	public static int seedBagID;
	
	public static int barleySeedID;

	public static int floraCropsID;
	public static int foodID;
	
	public static int saguaroID;
	
	public static int barleySpawnDensity;
	public static int barleySpawnHeight;

	public static int saguaroSpawnDensity;
	public static int saguaroSpawnHeight;
	public static int saguaroSpawnRange;
	public static int saguaroSpawnSize;
	
	public static int ingredientsID;
	
}
