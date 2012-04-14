package net.minecraft.src.infibase;
import java.io.File;
import java.io.IOException;

import net.minecraft.client.Minecraft;
import net.minecraft.src.Item;
import net.minecraft.src.forge.Configuration;

public class PropsHelperInfiBase {

    public static void initProps()
    {
        /* Here we will set up the config file for the mod 
         * First: Create a folder inside the config folder
         * Second: Create the actual config file
         * Note: Configs are a pain, but absolutely necessary for every mod.
         */

        File file = new File(Minecraft.getMinecraftDir() + "/config/InfiCraft");
        file.mkdir();
        File newFile = new File(Minecraft.getMinecraftDir() + "/config/InfiCraft/InfiBase.cfg");

        /* Some basic debugging will go a long way */
        try
        {
            newFile.createNewFile();
            System.out.println("Successfully created/read configuration file");
        }
        catch (IOException e)
        {
            System.out.println("Could not create configuration file for mod_InfiBase. Reason:");
            System.out.println(e);
        }

        /* [Forge] Configuration class, used as config method */
        Configuration config = new Configuration(newFile);

        /* Load the configuration file */
        config.load();

        /* Define the mod's IDs. 
         * Avoid values below 4096 for items and in the 250-600 range for blocks
         */
        //enableCopperTools = config.getOrCreateBooleanProperty("Enable Copper Tools", "general", true).getBoolean(true);
        
        mossBlockID = config.getOrCreateBlockIdProperty("Moss Block", 252).getInt();
        
        stoneRodID = config.getOrCreateIntProperty("Stone Rod", "item", 13891).getInt();
        ironRodID = config.getOrCreateIntProperty("Iron Rod", "item", 13892).getInt();
        diamondRodID = config.getOrCreateIntProperty("Diamond Rod", "item", 13893).getInt();
        
        redstoneRodID = config.getOrCreateIntProperty("Redstone Rod", "item", 13895).getInt();
        obsidianRodID = config.getOrCreateIntProperty("Obsidian Rod", "item", 13896).getInt();
        sandstoneRodID = config.getOrCreateIntProperty("Sandstone Rod", "item", 13897).getInt();
        boneRodID = config.getOrCreateIntProperty("Bone Rod", "item", 13898).getInt();
        paperRodID = config.getOrCreateIntProperty("Paper Rod", "item", 13899).getInt();
        mossyRodID = config.getOrCreateIntProperty("Mossy Rod", "item", 13900).getInt();
        netherrackRodID = config.getOrCreateIntProperty("Netherrack Rod", "item", 13901).getInt();
        glowstoneRodID = config.getOrCreateIntProperty("Glowstone Rod", "item", 13902).getInt();
        iceRodID = config.getOrCreateIntProperty("Ice Rod", "item", 13903).getInt();
        lavaRodID = config.getOrCreateIntProperty("Lava Rod", "item", 13904).getInt();
        slimeRodID = config.getOrCreateIntProperty("Slime Rod", "item", 13905).getInt();
        cactusRodID = config.getOrCreateIntProperty("Cactus Rod", "item", 13906).getInt();
        flintRodID = config.getOrCreateIntProperty("Flint Rod", "item", 13907).getInt();
        brickRodID = config.getOrCreateIntProperty("Brick Rod", "item", 13908).getInt();
        
        copperRodID = config.getOrCreateIntProperty("Copper Rod", "item", 13881).getInt();
        bronzeRodID = config.getOrCreateIntProperty("Bronze Rod", "item", 13882).getInt();
        workedIronRodID = config.getOrCreateIntProperty("Worked Iron Rod", "item", 13883).getInt();
        steelRodID = config.getOrCreateIntProperty("Steel Rod", "item", 13884).getInt();
        cobaltRodID = config.getOrCreateIntProperty("Cobalt Rod", "item", 13885).getInt();
        arditeRodID = config.getOrCreateIntProperty("Ardite Rod", "item", 13886).getInt();
        manyullynRodID = config.getOrCreateIntProperty("Manyullyn Rod", "item", 13887).getInt();
        uraniumRodID = config.getOrCreateIntProperty("Uranium Rod", "item", 13888).getInt();
        
        paperStackID = config.getOrCreateIntProperty("Stack of Paper", "item", 13917).getInt();
        paperDustID = config.getOrCreateIntProperty("Paper-filled Dust", "item", 13918).getInt();
        
        woodSplintersID = config.getOrCreateIntProperty("Wood Splinters", "item", 14001).getInt();
        stoneShardID = config.getOrCreateIntProperty("Wood Splinters", "item", 14002).getInt();
        ironChunkID = config.getOrCreateIntProperty("Wood Splinters", "item", 14003).getInt();
        diamondShardID = config.getOrCreateIntProperty("Wood Splinters", "item", 14004).getInt();
        redstoneFragmentID = config.getOrCreateIntProperty("Wood Splinters", "item", 14006).getInt();
        obsidianShardID = config.getOrCreateIntProperty("Wood Splinters", "item", 14007).getInt();
        sandstoneShardID = config.getOrCreateIntProperty("Wood Splinters", "item", 14008).getInt();
        netherrackShardID = config.getOrCreateIntProperty("Wood Splinters", "item", 14009).getInt();
        glowstoneFragmentID = config.getOrCreateIntProperty("Wood Splinters", "item", 140010).getInt();
        iceShardID = config.getOrCreateIntProperty("Wood Splinters", "item", 14011).getInt();
        lavaFragmentID = config.getOrCreateIntProperty("Wood Splinters", "item", 14012).getInt();
        slimeFragmentID = config.getOrCreateIntProperty("Wood Splinters", "item", 14013).getInt();
        flintShardID = config.getOrCreateIntProperty("Wood Splinters", "item", 14014).getInt();
        
        miniBrickID = config.getOrCreateIntProperty("Wood Splinters", "item", 14015).getInt();
        blazeFragmentID = config.getOrCreateIntProperty("Wood Splinters", "item", 14016).getInt();
        
        copperShardID = config.getOrCreateIntProperty("Wood Splinters", "item", 14017).getInt();
        bronzeShardID = config.getOrCreateIntProperty("Wood Splinters", "item", 14018).getInt();
        workedIronShardID = config.getOrCreateIntProperty("Wood Splinters", "item", 14019).getInt();
        steelShardID = config.getOrCreateIntProperty("Wood Splinters", "item", 14020).getInt();
        cobaltShardID = config.getOrCreateIntProperty("Wood Splinters", "item", 14021).getInt();
        arditeShardID = config.getOrCreateIntProperty("Wood Splinters", "item", 14022).getInt();
        manyullynShardID = config.getOrCreateIntProperty("Wood Splinters", "item", 14023).getInt();
        uraniumShardID = config.getOrCreateIntProperty("Wood Splinters", "item", 14024).getInt();

        /* Save the configuration file */
        config.save();
    }

    /* Prototype fields, used elsewhere */
    
    public static int mossBlockID;
    
    public static int stoneRodID;
    public static int ironRodID;
    public static int diamondRodID;
    
    public static int redstoneRodID;
    public static int obsidianRodID;
    public static int sandstoneRodID;
    public static int boneRodID;
    public static int paperRodID;
    public static int mossyRodID;
    public static int netherrackRodID;
    public static int glowstoneRodID;
    public static int iceRodID;
    public static int lavaRodID;
    public static int slimeRodID;
    public static int cactusRodID;
    public static int flintRodID;
    public static int brickRodID;
    
    public static int copperRodID;
    public static int bronzeRodID;
    public static int workedIronRodID;
    public static int steelRodID;
    public static int cobaltRodID;
    public static int arditeRodID;
    public static int manyullynRodID;
    public static int uraniumRodID;
    
    public static int woodSplintersID;
    public static int stoneShardID;
    public static int ironChunkID;
    public static int diamondShardID;
    public static int goldChunkID;
    public static int redstoneFragmentID;
    public static int obsidianShardID;
    public static int sandstoneShardID;
    public static int netherrackShardID;
    public static int glowstoneFragmentID;
    public static int iceShardID;
    public static int lavaFragmentID;
    public static int slimeFragmentID;
    public static int flintShardID;
    public static int miniBrickID;
    public static int blazeFragmentID;
    
    public static int copperShardID;
    public static int bronzeShardID;
    public static int workedIronShardID;
    public static int steelShardID;
    public static int cobaltShardID;
    public static int arditeShardID;
    public static int manyullynShardID;
    public static int uraniumShardID;
    
    public static int glassShardID;
    public static int coalBitID;
    
    public static int paperStackID;
    public static int paperDustID;
    
    public static int mossBallID;
    public static int mossyPatchID;
    public static int mossyStoneID;
    
    public static int redstoneCrystalID;
    public static int glowstoneCrystalID;
    public static int obsidianCrystalID;
    public static int lavaCrystalID;
    public static int slimeCrystalID;
    public static int blazeCrystalID;
}