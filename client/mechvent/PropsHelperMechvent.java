package net.minecraft.src.mechvent;
import java.io.File;
import java.io.IOException;

import net.minecraft.client.Minecraft;
import net.minecraft.src.Item;
import net.minecraft.src.forge.Configuration;

public class PropsHelperMechvent {

    public static void initProps()
    {
        /* Here we will set up the config file for the mod 
         * First: Create a folder inside the config folder
         * Second: Create the actual config file
         * Note: Configs are a pain, but absolutely necessary for every mod.
         */

        File file = new File(Minecraft.getMinecraftDir() + "/config/InfiCraft");
        file.mkdir();
        File newFile = new File(Minecraft.getMinecraftDir() + "/config/InfiCraft/Mechvent.cfg");

        /* Some basic debugging will go a long way */
        try
        {
            newFile.createNewFile();
            System.out.println("Successfully created/read configuration file");
        }
        catch (IOException e)
        {
            System.out.println("Could not create configuration file for mod_Mechvent. Reason:");
            System.out.println(e);
        }

        /* [Forge] Configuration class, used as config method */
        Configuration config = new Configuration(newFile);

        /* Load the configuration file */
        config.load();

        /* Define the mod's IDs. 
         * Avoid values below 4096 for items and in the 250-600 range for blocks
         */
        protoCrusherID = config.getOrCreateBlockIdProperty("Prototype Machines", 130).getInt(130);
        largeChunkID = config.getOrCreateIntProperty("Large Chunk", "item", 7341).getInt(7341);
        mediumChunkID = config.getOrCreateIntProperty("Medium Chunk", "item", 7342).getInt(7342);
        smallChunkID = config.getOrCreateIntProperty("Small Chunk", "item", 7343).getInt(7343);
        oreDustID = config.getOrCreateIntProperty("Ore Dust", "item", 7344).getInt(7344);
        oreDustSmallID = config.getOrCreateIntProperty("Small Ore Dust", "item", 7345).getInt(7345);
        oreDustAlloyID = config.getOrCreateIntProperty("Alloy Ore Dust", "item", 7346).getInt(7346);

        /* Save the configuration file */
        config.save();
    }

    /* Prototype fields, used elsewhere */

    public static int protoCrusherID;
    public static int largeChunkID;
	public static int mediumChunkID;
	public static int smallChunkID;
	public static int oreDustID;
	public static int oreDustSmallID;
	public static int oreDustAlloyID;
}