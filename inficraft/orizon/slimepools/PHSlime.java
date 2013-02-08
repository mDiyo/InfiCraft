package inficraft.orizon.slimepools;

import java.io.File;
import java.io.IOException;

import net.minecraftforge.common.Configuration;

public class PHSlime {

	public static void initProps()
    {
        /* Here we will set up the config file for the mod 
         * First: Create a folder inside the config folder
         * Second: Create the actual config file
         * Note: Configs are a pain, but absolutely necessary for every mod.
         */

        File file = new File(OrizonSlime.proxy.getMinecraftDir() + "/config/InfiCraft");
        file.mkdir();
        File newFile = new File(OrizonSlime.proxy.getMinecraftDir() + "/config/InfiCraft/OrizonSlime.txt");

        /* Some basic debugging will go a long way */
        try
        {
            newFile.createNewFile();
            System.out.println("Orizon Slime config read complete!");
        }
        catch (IOException e)
        {
            System.out.println("Could not create configuration file for Orizon Slime. Reason:");
            System.out.println(e);
        }

        /* [Forge] Configuration class, used as config method */
        Configuration config = new Configuration(newFile);

        /* Load the configuration file */
        config.load();

        /* Define the mod's IDs. 
         * Avoid values below 4096 for items and in the 250-450 range for blocks
         */
        
        slimeGelID = config.getBlock("Slime Gel", 3239).getInt(3239);
        slimePoolID = config.getBlock("Slime Pool IDs", 3240).getInt(3240);

		genSlimePools = config.get("general", "Generate Slime Pools", true).getBoolean(true);
		dimensionGen = config.get("general", "Generate in other dimensions", true).getBoolean(true);
		slimePoolRarity = config.get("general", "Slime Pool Rarity", 30).getInt(30);
	    slimePoolHeight = config.get("general", "Slime Pool Height", 64).getInt(64);

        /* Save the configuration file */
        config.save();
    }
	
	public static int slimePoolID;
    public static int slimeGelID;
    public static int acidPoolID;
    
    public static boolean genSlimePools;
    public static boolean dimensionGen;
    public static int slimePoolRarity;
    public static int slimePoolHeight;
    
    public static boolean genAcidPools;
    public static int acidPoolRarity;
    public static int acidPoolHeight;
}
