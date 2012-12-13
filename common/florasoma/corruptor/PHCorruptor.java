package florasoma.corruptor;

import java.io.File;
import java.io.IOException;

import net.minecraft.client.Minecraft;
import net.minecraftforge.common.Configuration;

public class PHCorruptor 
{

	public static void initProps()
    {
        /* Here we will set up the config file for the mod 
         * First: Create a folder inside the config folder
         * Second: Create the actual config file
         * Note: Configs are a pain, but absolutely necessary for every mod.
         */
		
		File file = new File(FloraCorruptor.proxy.getMinecraftDir() + "/config/InfiCraft");
        file.mkdir();
        File newFile = new File(FloraCorruptor.proxy.getMinecraftDir() + "/config/InfiCraft/FloraCorruptor.txt");
        
        /* Some basic debugging will go a long way */
        try
        {
            newFile.createNewFile();
            System.out.println("Successfully read configuration file for mod_FloraCorruptor");
        }
        catch (IOException e)
        {
            System.out.println("Could not read configuration file for mod_FloraCorruptor. Reason:");
            System.out.println(e);
        }

        /* [Forge] Configuration class, used as config method */
        Configuration config = new Configuration(newFile);

        /* Load the configuration file */
        config.load();

        /* Define the mod's IDs. 
         * Avoid values below 4096 for items and in the 250-450 range for blocks
         */        

        corruptorID = config.getBlock("Corruptor", 3254).getInt(3254);
        corruptBrickID = config.getBlock("Corrupt Brick", 3255).getInt(3255);        

        corruptorSpawnDensity = config.get("general", "Corruptor Spawn Density", 1).getInt(1);
        corruptorSpawnHeight = config.get("general", "Corruptor Spawn Height", 0).getInt(0);
        corruptorSpawnRange = config.get("general", "Corruptor Spawn Range", 128).getInt(128);
        corruptorSpawnSize = config.get("general", "Corruptor Spawn Slize", 8).getInt(8);
        corruptionSpeed = config.get("general", "Corruption Speed", 5).getInt(5);
        corruptionSpread = config.get("general", "Spread Corruption", true).getBoolean(true);
        
        /* Save the configuration file */
        config.save();
    }
	
	/* Prototype fields, used elsewhere */
	public static int corruptorID;
	public static int corruptBrickID;
	
	public static int corruptorSpawnDensity;
	public static int corruptorSpawnHeight;
	public static int corruptorSpawnRange;
	public static int corruptorSpawnSize;
	public static int corruptionSpeed;	
	public static boolean corruptionSpread;
}
