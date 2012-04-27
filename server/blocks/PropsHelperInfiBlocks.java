package net.minecraft.src.blocks;
import java.io.File;
import java.io.IOException;

import net.minecraft.src.Item;
import net.minecraft.src.forge.Configuration;
import net.minecraft.src.mod_InfiBlocks;

public class PropsHelperInfiBlocks {

    public static void initProps()
    {
        /* Here we will set up the config file for the mod 
         * First: Create a folder inside the config folder
         * Second: Create the actual config file
         * Note: Configs are a pain, but absolutely necessary for every mod.
         */

        File file = new File("./config/InfiCraft");
        file.mkdir();
        File newFile = new File("./config/InfiCraft/InfiBlocks.txt");

        /* Some basic debugging will go a long way */
        try
        {
            newFile.createNewFile();
            System.out.println("Successfully created/read configuration file for mod_InfiBlocks");
        }
        catch (IOException e)
        {
            System.out.println("Could not create configuration file for mod_InfiBlocks. Reason:");
            System.out.println(e);
        }

        /* [Forge] Configuration class, used as config method */
        Configuration config = new Configuration(newFile);

        /* Load the configuration file */
        config.load();

        /* Define the mod's IDs. 
         * Avoid values below 4096 for items and in the 250-450 range for blocks
         */
        
        mod_InfiBlocks.blockCraftingID = config.getOrCreateBlockIdProperty("Crafting Table", 3271).getInt(3271);
        mod_InfiBlocks.blockChestID = config.getOrCreateBlockIdProperty("Chest", 3272).getInt(3272);
        mod_InfiBlocks.blockFurnaceID = config.getOrCreateBlockIdProperty("Furnace", 3273).getInt(3273);
        mod_InfiBlocks.woolCarpetID = config.getOrCreateBlockIdProperty("Carpet", 3274).getInt(3274);
        
        mod_InfiBlocks.magicSlabStoneID = config.getOrCreateBlockIdProperty("Magic Slab Stone", 3275).getInt(3275);
        mod_InfiBlocks.magicSlabSoilID = config.getOrCreateBlockIdProperty("Magic Slab Soil", 3276).getInt(3276);
        mod_InfiBlocks.magicSlabWoolID = config.getOrCreateBlockIdProperty("Magic Slab Wool", 3277).getInt(3277);        
        
        mod_InfiBlocks.stainedGlassID = config.getOrCreateBlockIdProperty("Stained Glass", 3278).getInt(3278);
        mod_InfiBlocks.stainedGlassPaneID = config.getOrCreateBlockIdProperty("Stained Glass Pane", 3279).getInt(3279);
        mod_InfiBlocks.stainedGlassMagicSlabID = config.getOrCreateBlockIdProperty("Stained Glass Magic Slab", 3280).getInt(32802);
        
        mod_InfiBlocks.storageBlockID = config.getOrCreateBlockIdProperty("Storage Block", 3281).getInt(3281);
        mod_InfiBlocks.storageBlockMagicSlabID = config.getOrCreateBlockIdProperty("Storage Block Magic Slab", 3282).getInt(3282);
        
        mod_InfiBlocks.brickID = config.getOrCreateBlockIdProperty("Brick", 3283).getInt(3283);
        mod_InfiBlocks.brickMagicSlabID = config.getOrCreateBlockIdProperty("Brick Magic Slab", 3284).getInt(3284);
        
        mod_InfiBlocks.crackedBrickID = config.getOrCreateBlockIdProperty("Cracked Brick", 3285).getInt(3285);
        mod_InfiBlocks.crackedBrickMagicSlabID = config.getOrCreateBlockIdProperty("Cracked Brick Magic Slab", 3286).getInt(3286);
        
        mod_InfiBlocks.fancyBrickID = config.getOrCreateBlockIdProperty("Fancy Brick", 3287).getInt(3287);
        mod_InfiBlocks.fancyBrickMagicSlabID = config.getOrCreateBlockIdProperty("Fancy Magic Slab", 3288).getInt(3288);
        System.out.println("IDdef: "+ mod_InfiBlocks.fancyBrickMagicSlabID);
        //mod_InfiBlocks.runeBrickID = config.getOrCreateBlockIdProperty("Chest", 3272).getInt(3272);
        
        mod_InfiBlocks.infiGlassID = config.getOrCreateBlockIdProperty("Glass", 3291).getInt(3291);
        mod_InfiBlocks.infiGlassPaneID = config.getOrCreateBlockIdProperty("Glass Pane", 3292).getInt(3292);
        mod_InfiBlocks.infiGlassMagicSlabID = config.getOrCreateBlockIdProperty("Glass Magic Slab", 3293).getInt(3293);
        
        mod_InfiBlocks.iceBrickID = config.getOrCreateBlockIdProperty("Ice Brick", 3294).getInt(3294);
        mod_InfiBlocks.iceBrickMagicSlabID = config.getOrCreateBlockIdProperty("Ice Brick Magic Slab", 3295).getInt(3295);
        
        mod_InfiBlocks.brownstoneID = config.getOrCreateBlockIdProperty("Brownstone", 3296).getInt(3296);
        mod_InfiBlocks.brownstoneMagicSlabID = config.getOrCreateBlockIdProperty("Brownstone Magic Slab", 3297).getInt(3297);
        
        mod_InfiBlocks.chiselID = config.getOrCreateIntProperty("Iron Chisel", "item", 12101).getInt(12101);
        mod_InfiBlocks.chiselDiamondID = config.getOrCreateIntProperty("Diamond Chisel", "item", 12102).getInt(12102);

        //mod_InfiBlocks.enableCrops = config.getOrCreateBooleanProperty("Enable Crops", "general", true).getBoolean(true);

        /* Save the configuration file */
        config.save();
    }
}