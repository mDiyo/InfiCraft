package net.minecraft.src.infi2x2;
import java.io.File;
import java.io.IOException;

import net.minecraft.client.Minecraft;
import net.minecraft.src.Item;
import net.minecraft.src.forge.Configuration;

public class PropsHelperInfi2x2 {

    public static void initProps()
    {
        /* Here we will set up the config file for the mod 
         * First: Create a folder inside the config folder
         * Second: Create the actual config file
         * Note: Configs are a pain, but absolutely necessary for every mod.
         */

        File file = new File(Minecraft.getMinecraftDir() + "/config/InfiCraft");
        file.mkdir();
        File newFile = new File(Minecraft.getMinecraftDir() + "/config/InfiCraft/2x2Extended.txt");

        /* Some basic debugging will go a long way */
        try
        {
            newFile.createNewFile();
            System.out.println("Successfully created/read configuration file");
        }
        catch (IOException e)
        {
            System.out.println("Could not create configuration file for mod_Infi2x2. Reason:");
            System.out.println(e);
        }

        /* [Forge] Configuration class, used as config method */
        Configuration config = new Configuration(newFile);

        /* Load the configuration file */
        config.load();

        /* Define the mod's IDs. 
         * Avoid values below 4096 for items and in the 250-600 range for blocks
         */
        
        enableWoodTools = config.getOrCreateBooleanProperty("Enable Wooden Tools", "general", true).getBoolean(true);
        enableStoneTools = config.getOrCreateBooleanProperty("Enable Stone Tools", "general", true).getBoolean(true);
        enableIronTools = config.getOrCreateBooleanProperty("Enable Iron Tools", "general", true).getBoolean(true);
        enableDiamondTools = config.getOrCreateBooleanProperty("Enable Diamond Tools", "general", true).getBoolean(true);
        enableRedstoneTools = config.getOrCreateBooleanProperty("Enable Redstone Tools", "general", true).getBoolean(true);
        enableObsidianTools = config.getOrCreateBooleanProperty("Enable Obsidian Tools", "general", true).getBoolean(true);
        enableSandstoneTools = config.getOrCreateBooleanProperty("Enable Sandstone Tools", "general", true).getBoolean(true);
        enableBoneTools = config.getOrCreateBooleanProperty("Enable Bone Tools", "general", true).getBoolean(true);
        enablePaperTools = config.getOrCreateBooleanProperty("Enable Paper Tools", "general", true).getBoolean(true);
        enableMossyTools = config.getOrCreateBooleanProperty("Enable Mossy Tools", "general", true).getBoolean(true);
        enableNetherrackTools = config.getOrCreateBooleanProperty("Enable Netherrack Tools", "general", true).getBoolean(true);
        enableGlowstoneTools = config.getOrCreateBooleanProperty("Enable Glowstone Tools", "general", true).getBoolean(true);
        enableIceTools = config.getOrCreateBooleanProperty("Enable Ice Tools", "general", true).getBoolean(true);
        enableLavaTools = config.getOrCreateBooleanProperty("Enable Lava Tools", "general", true).getBoolean(true);
        enableSlimeTools = config.getOrCreateBooleanProperty("Enable Slime Tools", "general", true).getBoolean(true);
        enableCactusTools = config.getOrCreateBooleanProperty("Enable Cactus Tools", "general", true).getBoolean(true);
        enableFlintTools = config.getOrCreateBooleanProperty("Enable Flint Tools", "general", true).getBoolean(true);
        enableBlazeTools = config.getOrCreateBooleanProperty("Enable Blaze Tools", "general", true).getBoolean(true);
        
        enableCopperTools = config.getOrCreateBooleanProperty("Enable Copper Tools", "general", true).getBoolean(true);
        enableBronzeTools = config.getOrCreateBooleanProperty("Enable Bronze Tools", "general", true).getBoolean(true);
        enableWorkedIronTools = config.getOrCreateBooleanProperty("Enable Worked Iron Tools", "general", true).getBoolean(true);
        enableSteelTools = config.getOrCreateBooleanProperty("Enable Steel Tools", "general", true).getBoolean(true);
        enableCobaltTools = config.getOrCreateBooleanProperty("Enable Cobalt Tools", "general", true).getBoolean(true);
        enableArditeTools = config.getOrCreateBooleanProperty("Enable Ardite Tools", "general", true).getBoolean(true);
        enableManyullynTools = config.getOrCreateBooleanProperty("Enable Manyullyn Tools", "general", true).getBoolean(true);
        enableUraniumTools = config.getOrCreateBooleanProperty("Enable Uranium Tools", "general", true).getBoolean(true);
        
        woodHandpickID = config.getOrCreateIntProperty("Wooden Handpicks", "item", 17001).getInt(17001);
        stoneHandpickID = config.getOrCreateIntProperty("Stone Handpicks", "item", 17008).getInt(17008);
        ironHandpickID = config.getOrCreateIntProperty("Iron Handpicks", "item", 17017).getInt(17017);
        diamondHandpickID = config.getOrCreateIntProperty("Diamond Handpicks", "item", 17026).getInt(17026);
        redstoneHandpickID = config.getOrCreateIntProperty("Redstone Handpicks", "item", 17048).getInt(17048);
        obsidianHandpickID = config.getOrCreateIntProperty("Obsidian Handpicks", "item", 17068).getInt(17068);
        sandstoneHandpickID = config.getOrCreateIntProperty("Sandstone Handpicks", "item", 17078).getInt(17078);
        boneHandpickID = config.getOrCreateIntProperty("Bone Handpicks", "item", 17086).getInt(17086);
        paperHandpickID = config.getOrCreateIntProperty("Paper Handpicks", "item", 17095).getInt(17095);
        mossyHandpickID = config.getOrCreateIntProperty("Mossy Handpicks", "item", 17100).getInt(17100);
        netherrackHandpickID = config.getOrCreateIntProperty("Netherrack Handpicks", "item", 17112).getInt(17112);
        glowstoneHandpickID = config.getOrCreateIntProperty("Glowstone Handpicks", "item", 17125).getInt(17125);
        iceHandpickID = config.getOrCreateIntProperty("Ice Handpicks", "item", 17134).getInt(17134);
        lavaHandpickID = config.getOrCreateIntProperty("Lava Handpicks", "item", 17140).getInt(17140);
        slimeHandpickID = config.getOrCreateIntProperty("Slime Handpicks", "item", 17148).getInt(17148);
        cactusHandpickID = config.getOrCreateIntProperty("Cactus Handpicks", "item", 17154).getInt(17154);
        flintHandpickID = config.getOrCreateIntProperty("Flint Handpicks", "item", 17161).getInt(17161);
        blazeHandpickID = config.getOrCreateIntProperty("Blaze Handpicks", "item", 17171).getInt(17171);
        
        copperHandpickID = config.getOrCreateIntProperty("Copper Handpicks", "item", 17179).getInt(17179);
        bronzeHandpickID = config.getOrCreateIntProperty("Bronze Handpicks", "item", 17187).getInt(17187);
        workedIronHandpickID = config.getOrCreateIntProperty("Worked Iron Handpicks", "item", 17196).getInt(17196);
        steelHandpickID = config.getOrCreateIntProperty("Steel Handpicks", "item", 17214).getInt(17214);
        cobaltHandpickID = config.getOrCreateIntProperty("Cobalt Handpicks", "item", 17234).getInt(17234);
        arditeHandpickID = config.getOrCreateIntProperty("Ardite Handpicks", "item", 17252).getInt(17252);
        manyullynHandpickID = config.getOrCreateIntProperty("Manyullyn Handpicks", "item", 17270).getInt(17270);
        uraniumHandpickID = config.getOrCreateIntProperty("Uranium Handpicks", "item", 17288).getInt(17288);
        
        woodDaggerID = config.getOrCreateIntProperty("Wooden Daggers", "item", 17301).getInt(17301);
        stoneDaggerID = config.getOrCreateIntProperty("Stone Daggers", "item", 17308).getInt(17308);
        ironDaggerID = config.getOrCreateIntProperty("Iron Daggers", "item", 17317).getInt(17317);
        diamondDaggerID = config.getOrCreateIntProperty("Diamond Daggers", "item", 17326).getInt(17326);
        redstoneDaggerID = config.getOrCreateIntProperty("Redstone Daggers", "item", 17348).getInt(17348);
        obsidianDaggerID = config.getOrCreateIntProperty("Obsidian Daggers", "item", 17368).getInt(17368);
        sandstoneDaggerID = config.getOrCreateIntProperty("Sandstone Daggers", "item", 17378).getInt(17378);
        boneDaggerID = config.getOrCreateIntProperty("Bone Daggers", "item", 17386).getInt(17386);
        paperDaggerID = config.getOrCreateIntProperty("Paper Daggers", "item", 17395).getInt(17395);
        mossyDaggerID = config.getOrCreateIntProperty("Mossy Daggers", "item", 17400).getInt(17400);
        netherrackDaggerID = config.getOrCreateIntProperty("Netherrack Daggers", "item", 17412).getInt(17412);
        glowstoneDaggerID = config.getOrCreateIntProperty("Glowstone Daggers", "item", 17425).getInt(17425);
        iceDaggerID = config.getOrCreateIntProperty("Ice Daggers", "item", 17434).getInt(17434);
        lavaDaggerID = config.getOrCreateIntProperty("Lava Daggers", "item", 17440).getInt(17440);
        slimeDaggerID = config.getOrCreateIntProperty("Slime Daggers", "item", 17448).getInt(17448);
        cactusDaggerID = config.getOrCreateIntProperty("Cactus Daggers", "item", 17454).getInt(17454);
        flintDaggerID = config.getOrCreateIntProperty("Flint Daggers", "item", 17461).getInt(17461);
        blazeDaggerID = config.getOrCreateIntProperty("Blaze Daggers", "item", 17471).getInt(17471);
        
        copperDaggerID = config.getOrCreateIntProperty("Copper Daggers", "item", 17479).getInt(17479);
        bronzeDaggerID = config.getOrCreateIntProperty("Bronze Daggers", "item", 17487).getInt(17487);
        workedIronDaggerID = config.getOrCreateIntProperty("Worked Iron Daggers", "item", 17496).getInt(17496);
        steelDaggerID = config.getOrCreateIntProperty("Steel Daggers", "item", 17514).getInt(17514);
        cobaltDaggerID = config.getOrCreateIntProperty("Cobalt Daggers", "item", 17534).getInt(17534);
        arditeDaggerID = config.getOrCreateIntProperty("Ardite Daggers", "item", 17552).getInt(17552);
        manyullynDaggerID = config.getOrCreateIntProperty("Manyullyn Daggers", "item", 17570).getInt(17570);
        uraniumDaggerID = config.getOrCreateIntProperty("Uranium Daggers", "item", 17588).getInt(17588);
        
        woodTrowelID = config.getOrCreateIntProperty("Wooden Trowels", "item", 17601).getInt(17601);
        stoneTrowelID = config.getOrCreateIntProperty("Stone Trowels", "item", 17608).getInt(17608);
        ironTrowelID = config.getOrCreateIntProperty("Iron Trowels", "item", 17617).getInt(17617);
        diamondTrowelID = config.getOrCreateIntProperty("Diamond Trowels", "item", 17626).getInt(17626);
        redstoneTrowelID = config.getOrCreateIntProperty("Redstone Trowels", "item", 17648).getInt(17648);
        obsidianTrowelID = config.getOrCreateIntProperty("Obsidian Trowels", "item", 17668).getInt(17668);
        sandstoneTrowelID = config.getOrCreateIntProperty("Sandstone Trowels", "item", 17678).getInt(17678);
        boneTrowelID = config.getOrCreateIntProperty("Bone Trowels", "item", 17686).getInt(17686);
        paperTrowelID = config.getOrCreateIntProperty("Paper Trowels", "item", 17695).getInt(17695);
        mossyTrowelID = config.getOrCreateIntProperty("Mossy Trowels", "item", 17700).getInt(17700);
        netherrackTrowelID = config.getOrCreateIntProperty("Netherrack Trowels", "item", 17712).getInt(17712);
        glowstoneTrowelID = config.getOrCreateIntProperty("Glowstone Trowels", "item", 17725).getInt(17725);
        iceTrowelID = config.getOrCreateIntProperty("Ice Trowels", "item", 17734).getInt(17734);
        lavaTrowelID = config.getOrCreateIntProperty("Lava Trowels", "item", 17740).getInt(17740);
        slimeTrowelID = config.getOrCreateIntProperty("Slime Trowels", "item", 17748).getInt(17748);
        cactusTrowelID = config.getOrCreateIntProperty("Cactus Trowels", "item", 17754).getInt(17754);
        flintTrowelID = config.getOrCreateIntProperty("Flint Trowels", "item", 17761).getInt(17761);
        blazeTrowelID = config.getOrCreateIntProperty("Blaze Trowels", "item", 17771).getInt(17771);
        
        copperTrowelID = config.getOrCreateIntProperty("Copper Trowels", "item", 17779).getInt(17779);
        bronzeTrowelID = config.getOrCreateIntProperty("Bronze Trowels", "item", 17787).getInt(17787);
        workedIronTrowelID = config.getOrCreateIntProperty("Worked Iron Trowels", "item", 17796).getInt(17796);
        steelTrowelID = config.getOrCreateIntProperty("Steel Trowels", "item", 17814).getInt(17814);
        cobaltTrowelID = config.getOrCreateIntProperty("Cobalt Trowels", "item", 17834).getInt(17834);
        arditeTrowelID = config.getOrCreateIntProperty("Ardite Trowels", "item", 17852).getInt(17852);
        manyullynTrowelID = config.getOrCreateIntProperty("Manyullyn Trowels", "item", 17870).getInt(17870);
        uraniumTrowelID = config.getOrCreateIntProperty("Uranium Trowels", "item", 17888).getInt(17888);
        
        woodHatchetID = config.getOrCreateIntProperty("Wooden Hatchets", "item", 17901).getInt(17901);
        stoneHatchetID = config.getOrCreateIntProperty("Stone Hatchets", "item", 17908).getInt(17908);
        ironHatchetID = config.getOrCreateIntProperty("Iron Hatchets", "item", 17917).getInt(17917);
        diamondHatchetID = config.getOrCreateIntProperty("Diamond Hatchets", "item", 17926).getInt(17926);
        redstoneHatchetID = config.getOrCreateIntProperty("Redstone Hatchets", "item", 17948).getInt(17948);
        obsidianHatchetID = config.getOrCreateIntProperty("Obsidian Hatchets", "item", 17968).getInt(17968);
        sandstoneHatchetID = config.getOrCreateIntProperty("Sandstone Hatchets", "item", 17978).getInt(17978);
        boneHatchetID = config.getOrCreateIntProperty("Bone Hatchets", "item", 17986).getInt(17986);
        paperHatchetID = config.getOrCreateIntProperty("Paper Hatchets", "item", 17995).getInt(17995);
        mossyHatchetID = config.getOrCreateIntProperty("Mossy Hatchets", "item", 18000).getInt(18000);
        netherrackHatchetID = config.getOrCreateIntProperty("Netherrack Hatchets", "item", 18012).getInt(18012);
        glowstoneHatchetID = config.getOrCreateIntProperty("Glowstone Hatchets", "item", 18025).getInt(18025);
        iceHatchetID = config.getOrCreateIntProperty("Ice Hatchets", "item", 18034).getInt(18034);
        lavaHatchetID = config.getOrCreateIntProperty("Lava Hatchets", "item", 18040).getInt(18040);
        slimeHatchetID = config.getOrCreateIntProperty("Slime Hatchets", "item", 18048).getInt(18048);
        cactusHatchetID = config.getOrCreateIntProperty("Cactus Hatchets", "item", 18054).getInt(18054);
        flintHatchetID = config.getOrCreateIntProperty("Flint Hatchets", "item", 18061).getInt(18061);
        blazeHatchetID = config.getOrCreateIntProperty("Blaze Hatchets", "item", 18071).getInt(18071);
        
        copperHatchetID = config.getOrCreateIntProperty("Copper Hatchets", "item", 18079).getInt(18079);
        bronzeHatchetID = config.getOrCreateIntProperty("Bronze Hatchets", "item", 18087).getInt(18087);
        workedIronHatchetID = config.getOrCreateIntProperty("Worked Iron Hatchets", "item", 18096).getInt(18096);
        steelHatchetID = config.getOrCreateIntProperty("Steel Hatchets", "item", 18114).getInt(18114);
        cobaltHatchetID = config.getOrCreateIntProperty("Cobalt Hatchets", "item", 18134).getInt(18134);
        arditeHatchetID = config.getOrCreateIntProperty("Ardite Hatchets", "item", 18152).getInt(18152);
        manyullynHatchetID = config.getOrCreateIntProperty("Manyullyn Hatchets", "item", 18170).getInt(18170);
        uraniumHatchetID = config.getOrCreateIntProperty("Uranium Hatchets", "item", 18188).getInt(18188);

        /* Save the configuration file */
        config.save();
    }

    /* Prototype fields, used elsewhere */
    
    public static boolean enableWoodTools;
    public static boolean enableStoneTools;
    public static boolean enableIronTools;
    public static boolean enableDiamondTools;
    public static boolean enableRedstoneTools;
    public static boolean enableObsidianTools;
    public static boolean enableSandstoneTools;
    public static boolean enableBoneTools;
    public static boolean enablePaperTools;
    public static boolean enableMossyTools;
    public static boolean enableNetherrackTools;
    public static boolean enableGlowstoneTools;
    public static boolean enableIceTools;
    public static boolean enableLavaTools;
    public static boolean enableSlimeTools;
    public static boolean enableCactusTools;
    public static boolean enableFlintTools;
    public static boolean enableBlazeTools;
    
    public static boolean enableCopperTools;
    public static boolean enableBronzeTools;
    public static boolean enableWorkedIronTools;
    public static boolean enableSteelTools;
    public static boolean enableCobaltTools;
    public static boolean enableArditeTools;
    public static boolean enableManyullynTools;
    public static boolean enableUraniumTools;
    
    public static int woodHandpickID;
    public static int stoneHandpickID;
    public static int ironHandpickID;
    public static int diamondHandpickID;
    public static int redstoneHandpickID;
    public static int obsidianHandpickID;
    public static int sandstoneHandpickID;
    public static int boneHandpickID;
    public static int paperHandpickID;
    public static int mossyHandpickID;
    public static int netherrackHandpickID;
    public static int glowstoneHandpickID;
    public static int iceHandpickID;
    public static int lavaHandpickID;
    public static int slimeHandpickID;
    public static int cactusHandpickID;
    public static int flintHandpickID;
    public static int blazeHandpickID;
    
    public static int copperHandpickID;
    public static int bronzeHandpickID;
    public static int workedIronHandpickID;
    public static int steelHandpickID;
    public static int cobaltHandpickID;
    public static int arditeHandpickID;
    public static int manyullynHandpickID;
    public static int uraniumHandpickID;
    
    public static int woodDaggerID;
    public static int stoneDaggerID;
    public static int ironDaggerID;
    public static int diamondDaggerID;
    public static int redstoneDaggerID;
    public static int obsidianDaggerID;
    public static int sandstoneDaggerID;
    public static int boneDaggerID;
    public static int paperDaggerID;
    public static int mossyDaggerID;
    public static int netherrackDaggerID;
    public static int glowstoneDaggerID;
    public static int iceDaggerID;
    public static int lavaDaggerID;
    public static int slimeDaggerID;
    public static int cactusDaggerID;
    public static int flintDaggerID;
    public static int blazeDaggerID;
    
    public static int copperDaggerID;
    public static int bronzeDaggerID;
    public static int workedIronDaggerID;
    public static int steelDaggerID;
    public static int cobaltDaggerID;
    public static int arditeDaggerID;
    public static int manyullynDaggerID;
    public static int uraniumDaggerID;
    
    public static int woodTrowelID;
    public static int stoneTrowelID;
    public static int ironTrowelID;
    public static int diamondTrowelID;
    public static int redstoneTrowelID;
    public static int obsidianTrowelID;
    public static int sandstoneTrowelID;
    public static int boneTrowelID;
    public static int paperTrowelID;
    public static int mossyTrowelID;
    public static int netherrackTrowelID;
    public static int glowstoneTrowelID;
    public static int iceTrowelID;
    public static int lavaTrowelID;
    public static int slimeTrowelID;
    public static int cactusTrowelID;
    public static int flintTrowelID;
    public static int blazeTrowelID;
    
    public static int copperTrowelID;
    public static int bronzeTrowelID;
    public static int workedIronTrowelID;
    public static int steelTrowelID;
    public static int cobaltTrowelID;
    public static int arditeTrowelID;
    public static int manyullynTrowelID;
    public static int uraniumTrowelID;
    
    public static int woodHatchetID;
    public static int stoneHatchetID;
    public static int ironHatchetID;
    public static int diamondHatchetID;
    public static int redstoneHatchetID;
    public static int obsidianHatchetID;
    public static int sandstoneHatchetID;
    public static int boneHatchetID;
    public static int paperHatchetID;
    public static int mossyHatchetID;
    public static int netherrackHatchetID;
    public static int glowstoneHatchetID;
    public static int iceHatchetID;
    public static int lavaHatchetID;
    public static int slimeHatchetID;
    public static int cactusHatchetID;
    public static int flintHatchetID;
    public static int blazeHatchetID;
    
    public static int copperHatchetID;
    public static int bronzeHatchetID;
    public static int workedIronHatchetID;
    public static int steelHatchetID;
    public static int cobaltHatchetID;
    public static int arditeHatchetID;
    public static int manyullynHatchetID;
    public static int uraniumHatchetID;
}