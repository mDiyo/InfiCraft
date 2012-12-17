package inficraft.infitools.library;
import java.io.File;
import java.io.IOException;

import net.minecraft.client.Minecraft;
import net.minecraft.src.Item;
import net.minecraftforge.common.Configuration;

public class PHInfiLibrary {

    public static void initProps()
    {
        /* Here we will set up the config file for the mod 
         * First: Create a folder inside the config folder
         * Second: Create the actual config file
         * Note: Configs are a pain, but absolutely necessary for every mod.
         */

        File file = new File(InfiLibrary.proxy.getMinecraftDir() + "/config/InfiCraft");
        file.mkdir();
        File newFile = new File(InfiLibrary.proxy.getMinecraftDir() + "/config/InfiCraft/InfiBase.txt");

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
         * Avoid values below 4096 for items and in the 250-450 range for blocks
         */
        
        mossBlockID = config.getBlock("Moss Block", 1401).getInt(1401);
        slimeSandID = config.getBlock("Slime Sand", 1402).getInt(1402);
        //lightBlockID = config.getBlock("Light", 1403).getInt(1403);
        treeRootID = config.getItem("Tree Root", 14000).getInt(14000);
        
        mossBallID = config.getItem("Moss Ball", 13951).getInt(13951);
        mossyPatchID = config.getItem("Mossy Patch", 13952).getInt(13952);
        mossyStoneID = config.getItem("Moss infused Stone", 13953).getInt(13953);
        
        redstoneCrystalID = config.getItem("Redstone Crystal", 13945).getInt(13945);
        glowstoneCrystalID = config.getItem("Glowstone Crystal", 13946).getInt(13946);
        obsidianCrystalID = config.getItem("Obsidian Crystal", 13947).getInt(13947);
        lavaCrystalID = config.getItem("Lava Crystal", 13948).getInt(13948);
        slimeCrystalID = config.getItem("Slime Crystal", 13949).getInt(13949);
        blazeCrystalID = config.getItem("Blaze Crystal", 13950).getInt(13950);
        
        grindstoneID = config.getItem("Grindstone", 13890).getInt(13890);
        stoneRodID = config.getItem("Stone Rod", 13891).getInt(13891);
        ironRodID = config.getItem("Iron Rod", 13892).getInt(13892);
        diamondRodID = config.getItem("Diamond Rod", 13893).getInt(13893);
        
        redstoneRodID = config.getItem("Redstone Rod", 13895).getInt(13895);
        obsidianRodID = config.getItem("Obsidian Rod", 13896).getInt(13896);
        sandstoneRodID = config.getItem("Sandstone Rod", 13897).getInt(13897);
        boneRodID = config.getItem("Bone Rod", 13898).getInt(13898);
        paperRodID = config.getItem("Paper Rod", 13899).getInt(13899);
        mossyRodID = config.getItem("Mossy Rod", 13900).getInt(13900);
        netherrackRodID = config.getItem("Netherrack Rod", 13901).getInt(13901);
        glowstoneRodID = config.getItem("Glowstone Rod", 13902).getInt(13902);
        iceRodID = config.getItem("Ice Rod", 13903).getInt(13903);
        lavaRodID = config.getItem("Lava Rod", 13904).getInt(13904);
        slimeRodID = config.getItem("Slime Rod", 13905).getInt(13905);
        cactusRodID = config.getItem("Cactus Rod", 13906).getInt(13906);
        flintRodID = config.getItem("Flint Rod", 13907).getInt(13907);
        
        copperRodID = config.getItem("Copper Rod", 13881).getInt(13881);
        bronzeRodID = config.getItem("Bronze Rod", 13882).getInt(13882);
        workedIronRodID = config.getItem("Worked Iron Rod", 13883).getInt(13883);
        steelRodID = config.getItem("Steel Rod", 13884).getInt(13884);
        cobaltRodID = config.getItem("Cobalt Rod", 13885).getInt(13885);
        arditeRodID = config.getItem("Ardite Rod", 13886).getInt(13886);
        manyullynRodID = config.getItem("Manyullyn Rod", 13887).getInt(13887);
        uraniumRodID = config.getItem("Uranium Rod", 13888).getInt(13888);
        
        paperStackID = config.getItem("Stack of Paper", 13917).getInt(13917);
        paperDustID = config.getItem("Paper filled Dust", 13918).getInt(13918);
        
        woodSplintersID = config.getItem("Wood Splinters", 13919).getInt(13919);
        stoneShardID = config.getItem("Stone Shard", 13920).getInt(13920);
        ironChunkID = config.getItem("Iron Chunk", 13921).getInt(13921);
        diamondShardID = config.getItem("Diamond Shard", 13922).getInt(13922);
        redstoneFragmentID = config.getItem("Redstone Crystal Fragment", 13923).getInt(13923);
        obsidianShardID = config.getItem("Obsidian Shard", 13924).getInt(13924);
        sandstoneShardID = config.getItem("Sandstone Shard", 13925).getInt(13925);
        netherrackShardID = config.getItem("Netherrack Shard", 13926).getInt(13926);
        glowstoneFragmentID = config.getItem("Glowstone Crystal Fragment", 13927).getInt(13927);
        iceShardID = config.getItem("Ice Shard", 13928).getInt(13928);
        lavaFragmentID = config.getItem("Lava Crystal Fragment", 13929).getInt(13929);
        slimeFragmentID = config.getItem("Slime Crystal Fragment", 13930).getInt(13930);
        cactusShardID = config.getItem("Cactus Spine", 13931).getInt(13931);
        flintShardID = config.getItem("Flint Shard", 13932).getInt(13932);
        blazeFragmentID = config.getItem("Fragmented Blaze Essence", 13933).getInt(13933);
        
        copperChunkID = config.getItem("Copper Chunk", 13934).getInt(13934);
        bronzeChunkID = config.getItem("Bronze Chunk", 13935).getInt(13935);
        workedIronChunkID = config.getItem("Worked Iron Chunk", 13936).getInt(13936);
        steelChunkID = config.getItem("Steel Chunk", 13937).getInt(13937);
        cobaltChunkID = config.getItem("Cobalt Chunk", 13938).getInt(13938);
        arditeChunkID = config.getItem("Ardite Chunk", 13939).getInt(13939);
        manyullynChunkID = config.getItem("Manyullyn Chunk", 13940).getInt(13940);
        uraniumChunkID = config.getItem("Uranium Fragment", 13941).getInt(13941);
        
        glassShardID = config.getItem("Glass Shard", 13942).getInt(13942);
        coalBitID = config.getItem("Coal Bits", 13943).getInt(13943);

        /* Save the configuration file */
        config.save();
    }

    /* Prototype fields, used elsewhere */
    
    public static int mossBlockID;
    public static int slimeSandID;
    public static int lightBlockID;
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