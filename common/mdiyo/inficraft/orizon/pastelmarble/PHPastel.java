package mDiyo.inficraft.orizon.pastelmarble;

import java.io.File;
import java.io.IOException;

import net.minecraft.client.Minecraft;
import net.minecraftforge.common.Configuration;

public class PHPastel 
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
        File newFile = new File(Minecraft.getMinecraftDir() + "/config/InfiCraft/OrizonPastels.txt");
        
        /* Some basic debugging will go a long way */
        try
        {
            newFile.createNewFile();
            System.out.println("Pastels and Marble loaded successfully!");
        }
        catch (IOException e)
        {
            System.out.println("Could not read configuration file for Pastels and Marble. Reason:");
            System.out.println(e);
        }

        /* [Forge] Configuration class, used as config method */
        Configuration config = new Configuration(newFile);

        /* Load the configuration file */
        config.load();

        /* Define the mod's IDs. 
         * Avoid values below 4096 for items and in the 250-450 range for blocks
         */
        
        superfun = config.get("general", "All the world is Superfun", false).getBoolean(false);
        
        cStoneID = config.getBlock("Colored Stone", 3226).getInt(3226);
        cCobbleID = config.getBlock("Colored Cobblestone", 3227).getInt(3227);
        cBrickID = config.getBlock("Colored Stone Brick", 3228).getInt(3228);
        cMossyID = config.getBlock("Colored Mossy Brick", 3229).getInt(3229);
        cCrackedID = config.getBlock("Colored Cracked Brick", 3230).getInt(3230);
        cTileID = config.getBlock("Colored Tiled Brick", 3231).getInt(3231);
        cFancyID = config.getBlock("Colored Fancy Brick", 3232).getInt(3232);
        cSquareID = config.getBlock("Colored Square Brick", 3233).getInt(3233);
        marbleID = config.getBlock("Marble", 3238).getInt(3238);
        
        genStratifiedStone = config.get("general", "Generate Stratified Stone", true).getBoolean(true);
		genColoredStone = config.get("general", "Generate Colored Stone", true).getBoolean(true);
		genMarble = config.get("general", "Generate Marble", true).getBoolean(true);
		
		marbleRarity = config.get("general", "Marble Rarity", 22).getInt(22);
	    marbleHeight = config.get("general", "Marble Height", 64).getInt(64);
	    coloredStoneChance = config.get("general", "Colored Stone Chance", 7).getInt(7);
	    coloredStoneHeight = config.get("general", "Colored Stone Height", 64).getInt(64);
        
        /* Save the configuration file */
        config.save();
    }
	public static boolean superfun;
	
	public static int cStoneID;
    public static int cCobbleID;
    public static int cBrickID;
    public static int cMossyID;
    public static int cCrackedID;
    public static int cTileID;
    public static int cFancyID;
    public static int cSquareID;
	public static int calciteOreID;
    public static int marbleID;
    
    public static boolean genStratifiedStone;
    public static boolean genMarble;
    public static boolean genColoredStone;
    
    public static int marbleRarity;
    public static int marbleHeight;
    public static int coloredStoneChance;
    public static int coloredStoneHeight;
}
