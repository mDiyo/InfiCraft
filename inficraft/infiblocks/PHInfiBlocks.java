package inficraft.infiblocks;

import java.io.File;
import java.io.IOException;

import net.minecraftforge.common.Configuration;

public class PHInfiBlocks {

    public static void initProps()
    {
        /* Here we will set up the config file for the mod 
         * First: Create a folder inside the config folder
         * Second: Create the actual config file
         * Note: Configs are a pain, but absolutely necessary for every mod.
         */

        File file = new File(InfiBlocks.proxy.getMinecraftDir() + "/config/InfiCraft");
        file.mkdir();
        File newFile = new File(InfiBlocks.proxy.getMinecraftDir() + "/config/InfiCraft/InfiBlocks.txt");

        /* Some basic debugging will go a long way */
        try
        {
            newFile.createNewFile();
            System.out.println("Successfully created/read configuration file");
        }
        catch (IOException e)
        {
            System.out.println("Could not create configuration file for mod_FloraSoma. Reason:");
            System.out.println(e);
        }

        /* [Forge] Configuration class, used as config method */
        Configuration config = new Configuration(newFile);

        /* Load the configuration file */
        config.load();

        /* Define the mod's IDs. 
         * Avoid values below 4096 for items and in the 250-450 range for blocks
         */
        
        blockCraftingID = config.getBlock("Crafting_Table", 3271).getInt(3271);
        blockChestID = config.getBlock("Chest", 3272).getInt(3272);
        blockFurnaceID = config.getBlock("Furnace", 3273).getInt(3273);
        woolCarpetID = config.getBlock("Carpet", 3274).getInt(3274);
        
        magicSlabStoneID = config.getBlock("Magic_Slab_Stone", 3275).getInt(3275);
        magicSlabSoilID = config.getBlock("Magic_Slab_Soil", 3276).getInt(3276);
        magicSlabWoolID = config.getBlock("Magic_Slab_Wool", 3277).getInt(3277);        
        
        stainedGlassID = config.getBlock("Stained_Glass", 3278).getInt(3278);
        stainedGlassPaneID = config.getBlock("Stained_Glass_Pane", 3279).getInt(3279);
        stainedGlassMagicSlabID = config.getBlock("Stained_Glass_Magic_Slab", 3280).getInt(32802);
        
        storageBlockID = config.getBlock("Storage_Block", 3281).getInt(3281);
        storageBlockMagicSlabID = config.getBlock("Storage_Block_Magic_Slab", 3282).getInt(3282);
        
        brickID = config.getBlock("Brick", 3283).getInt(3283);
        brickMagicSlabID = config.getBlock("Brick_Magic_Slab", 3284).getInt(3284);
        
        crackedBrickID = config.getBlock("Cracked_Brick", 3285).getInt(3285);
        crackedBrickMagicSlabID = config.getBlock("Cracked_Brick_Magic_Slab", 3286).getInt(3286);
        
        fancyBrickID = config.getBlock("Fancy_Brick", 3287).getInt(3287);
        fancyBrickMagicSlabID = config.getBlock("Fancy_Brick_Magic_Slab", 3288).getInt(3288);
        
        infiGlassID = config.getBlock("Glass", 3291).getInt(3291);
        infiGlassPaneID = config.getBlock("Glass_Pane", 3292).getInt(3292);
        infiGlassMagicSlabID = config.getBlock("Glass_Magic_Slab", 3293).getInt(3293);
        
        iceBrickID = config.getBlock("Ice_Brick", 3294).getInt(3294);
        iceBrickMagicSlabID = config.getBlock("Ice_Brick_Magic_Slab", 3295).getInt(3295);
        
        brownstoneID = config.getBlock("Brownstone", 3296).getInt(3296);
        brownstoneMagicSlabID = config.getBlock("Brownstone_Magic_Slab", 3297).getInt(3297);
        
        stoneStairSlabID = config.getBlock("Stone_Stair_Slab_Pillar", 3298).getInt(3298);
        
        chiselID = config.getItem("Iron_Chisel", 12101).getInt(12101);
        chiselDiamondID = config.getItem("Diamond_Chisel", 12102).getInt(12102);

        /* Save the configuration file */
        config.save();
    }
    

	
	public static int blockCraftingID;
	public static int woolCarpetID;
	public static int blockChestID;
	public static int blockFurnaceID;
	public static int magicSlabStoneID;
	public static int magicSlabSoilID;
	public static int magicSlabWoolID;
	
	public static int stainedGlassID;
	public static int stainedGlassPaneID;
	public static int stainedGlassMagicSlabID;
	public static int infiGlassID;
	public static int infiGlassPaneID;
	
	public static int storageBlockID;
	public static int brickID;
	public static int crackedBrickID;
	public static int fancyBrickID;
	public static int runeBrickID;
	public static int brownstoneID;
	public static int iceBrickID;
	
	public static int infiGlassMagicSlabID;
	public static int storageBlockMagicSlabID;
	public static int brickMagicSlabID;
	public static int crackedBrickMagicSlabID;
	public static int fancyBrickMagicSlabID;
	public static int runeBrickMagicSlabID;
	public static int brownstoneMagicSlabID;
	public static int iceBrickMagicSlabID;
	
	public static int stoneStairSlabID;
	
	public static int chiselID;
	public static int chiselDiamondID;
	
	
}