package net.minecraft.src.infibase;
import java.io.File;
import java.io.IOException;

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

        File file = new File("./config/InfiCraft");
        file.mkdir();
        File newFile = new File("./config/InfiCraft/InfiBase.txt");

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
        
        mossBlockID = config.getOrCreateBlockIdProperty("Moss Block", 252).getInt(252);
        slimeSandID = config.getOrCreateBlockIdProperty("Slime Sand", 253).getInt(253);
        treeRootID = config.getOrCreateIntProperty("Tree Root", "item", 14000).getInt(14000);
        
        mossBallID = config.getOrCreateIntProperty("Moss Ball", "item", 13951).getInt(13951);
        mossyPatchID = config.getOrCreateIntProperty("Mossy Patch", "item", 13952).getInt(13952);
        mossyStoneID = config.getOrCreateIntProperty("Moss infused Stone", "item", 13953).getInt(13953);
        
        redstoneCrystalID = config.getOrCreateIntProperty("Redstone Crystal", "item", 13945).getInt(13945);
        glowstoneCrystalID = config.getOrCreateIntProperty("Glowstone Crystal", "item", 13946).getInt(13946);
        obsidianCrystalID = config.getOrCreateIntProperty("Obsidian Crystal", "item", 13947).getInt(13947);
        lavaCrystalID = config.getOrCreateIntProperty("Lava Crystal", "item", 13948).getInt(13948);
        slimeCrystalID = config.getOrCreateIntProperty("Slime Crystal", "item", 13949).getInt(13949);
        blazeCrystalID = config.getOrCreateIntProperty("Blaze Crystal", "item", 13950).getInt(13950);
        
        grindstoneID = config.getOrCreateIntProperty("Grindstone", "item", 13890).getInt(13890);
        stoneRodID = config.getOrCreateIntProperty("Stone Rod", "item", 13891).getInt(13891);
        ironRodID = config.getOrCreateIntProperty("Iron Rod", "item", 13892).getInt(13892);
        diamondRodID = config.getOrCreateIntProperty("Diamond Rod", "item", 13893).getInt(13893);
        
        redstoneRodID = config.getOrCreateIntProperty("Redstone Rod", "item", 13895).getInt(13895);
        obsidianRodID = config.getOrCreateIntProperty("Obsidian Rod", "item", 13896).getInt(13896);
        sandstoneRodID = config.getOrCreateIntProperty("Sandstone Rod", "item", 13897).getInt(13897);
        boneRodID = config.getOrCreateIntProperty("Bone Rod", "item", 13898).getInt(13898);
        paperRodID = config.getOrCreateIntProperty("Paper Rod", "item", 13899).getInt(13899);
        mossyRodID = config.getOrCreateIntProperty("Mossy Rod", "item", 13900).getInt(13900);
        netherrackRodID = config.getOrCreateIntProperty("Netherrack Rod", "item", 13901).getInt(13901);
        glowstoneRodID = config.getOrCreateIntProperty("Glowstone Rod", "item", 13902).getInt(13902);
        iceRodID = config.getOrCreateIntProperty("Ice Rod", "item", 13903).getInt(13903);
        lavaRodID = config.getOrCreateIntProperty("Lava Rod", "item", 13904).getInt(13904);
        slimeRodID = config.getOrCreateIntProperty("Slime Rod", "item", 13905).getInt(13905);
        cactusRodID = config.getOrCreateIntProperty("Cactus Rod", "item", 13906).getInt(13906);
        flintRodID = config.getOrCreateIntProperty("Flint Rod", "item", 13907).getInt(13907);
        
        copperRodID = config.getOrCreateIntProperty("Copper Rod", "item", 13881).getInt(13881);
        bronzeRodID = config.getOrCreateIntProperty("Bronze Rod", "item", 13882).getInt(13882);
        workedIronRodID = config.getOrCreateIntProperty("Worked Iron Rod", "item", 13883).getInt(13883);
        steelRodID = config.getOrCreateIntProperty("Steel Rod", "item", 13884).getInt(13884);
        cobaltRodID = config.getOrCreateIntProperty("Cobalt Rod", "item", 13885).getInt(13885);
        arditeRodID = config.getOrCreateIntProperty("Ardite Rod", "item", 13886).getInt(13886);
        manyullynRodID = config.getOrCreateIntProperty("Manyullyn Rod", "item", 13887).getInt(13887);
        uraniumRodID = config.getOrCreateIntProperty("Uranium Rod", "item", 13888).getInt(13888);
        
        paperStackID = config.getOrCreateIntProperty("Stack of Paper", "item", 13917).getInt(13917);
        paperDustID = config.getOrCreateIntProperty("Paper filled Dust", "item", 13918).getInt(13918);
        
        woodSplintersID = config.getOrCreateIntProperty("Wood Splinters", "item", 13919).getInt(13919);
        stoneShardID = config.getOrCreateIntProperty("Stone Shard", "item", 13920).getInt(13920);
        ironChunkID = config.getOrCreateIntProperty("Iron Chunk", "item", 13921).getInt(13921);
        diamondShardID = config.getOrCreateIntProperty("Diamond Shard", "item", 13922).getInt(13922);
        redstoneFragmentID = config.getOrCreateIntProperty("Redstone Crystal Fragment", "item", 13923).getInt(13923);
        obsidianShardID = config.getOrCreateIntProperty("Obsidian Shard", "item", 13924).getInt(13924);
        sandstoneShardID = config.getOrCreateIntProperty("Sandstone Shard", "item", 13925).getInt(13925);
        netherrackShardID = config.getOrCreateIntProperty("Netherrack Shard", "item", 13926).getInt(13926);
        glowstoneFragmentID = config.getOrCreateIntProperty("Glowstone Crystal Fragment", "item", 13927).getInt(13927);
        iceShardID = config.getOrCreateIntProperty("Ice Shard", "item", 13928).getInt(13928);
        lavaFragmentID = config.getOrCreateIntProperty("Lava Crystal Fragment", "item", 13929).getInt(13929);
        slimeFragmentID = config.getOrCreateIntProperty("Slime Crystal Fragment", "item", 13930).getInt(13930);
        cactusShardID = config.getOrCreateIntProperty("Cactus Spine", "item", 13931).getInt(13931);
        flintShardID = config.getOrCreateIntProperty("Flint Shard", "item", 13932).getInt(13932);
        blazeFragmentID = config.getOrCreateIntProperty("Fragmented Blaze Essence", "item", 13933).getInt(13933);
        
        copperChunkID = config.getOrCreateIntProperty("Copper Chunk", "item", 13934).getInt(13934);
        bronzeChunkID = config.getOrCreateIntProperty("Bronze Chunk", "item", 13935).getInt(13935);
        workedIronChunkID = config.getOrCreateIntProperty("Worked Iron Chunk", "item", 13936).getInt(13936);
        steelChunkID = config.getOrCreateIntProperty("Steel Chunk", "item", 13937).getInt(13937);
        cobaltChunkID = config.getOrCreateIntProperty("Cobalt Chunk", "item", 13938).getInt(13938);
        arditeChunkID = config.getOrCreateIntProperty("Ardite Chunk", "item", 13939).getInt(13939);
        manyullynChunkID = config.getOrCreateIntProperty("Manyullyn Chunk", "item", 13940).getInt(13940);
        uraniumChunkID = config.getOrCreateIntProperty("Uranium Fragment", "item", 13941).getInt(13941);
        
        glassShardID = config.getOrCreateIntProperty("Glass Shard", "item", 13942).getInt(13942);
        coalBitID = config.getOrCreateIntProperty("Coal Bits", "item", 13943).getInt(13943);

        /* Save the configuration file */
        config.save();
    }

    /* Prototype fields, used elsewhere */
    
    public static int mossBlockID;
    public static int slimeSandID;
    public static int treeRootID;
    public static int grindstoneID;
    
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
    public static int cactusShardID;
    public static int flintShardID;
    public static int miniBrickID;
    public static int blazeFragmentID;
    
    public static int copperChunkID;
    public static int bronzeChunkID;
    public static int workedIronChunkID;
    public static int steelChunkID;
    public static int cobaltChunkID;
    public static int arditeChunkID;
    public static int manyullynChunkID;
    public static int uraniumChunkID;
    
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