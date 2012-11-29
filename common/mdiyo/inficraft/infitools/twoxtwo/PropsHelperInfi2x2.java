package mDiyo.inficraft.infitools.twoxtwo;
import java.io.File;
import java.io.IOException;

import net.minecraft.client.Minecraft;
import net.minecraftforge.common.Configuration;

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
        Infi2x2.infitoolsPresent = config.get("general", "Add InfiTool Combinations", true).getBoolean(true);
        
        enableWoodTools = config.get("general", "Enable Wooden Tools", true).getBoolean(true);
        enableStoneTools = config.get("general", "Enable Stone Tools", true).getBoolean(true);
        enableIronTools = config.get("general", "Enable Iron Tools", true).getBoolean(true);
        enableDiamondTools = config.get("general", "Enable Diamond Tools", true).getBoolean(true);
        enableRedstoneTools = config.get("general", "Enable Redstone Tools", true).getBoolean(true);
        enableObsidianTools = config.get("general", "Enable Obsidian Tools", true).getBoolean(true);
        enableSandstoneTools = config.get("general", "Enable Sandstone Tools", true).getBoolean(true);
        enableBoneTools = config.get("general", "Enable Bone Tools", true).getBoolean(true);
        enablePaperTools = config.get("general", "Enable Paper Tools", true).getBoolean(true);
        enableMossyTools = config.get("general", "Enable Mossy Tools", true).getBoolean(true);
        enableNetherrackTools = config.get("general", "Enable Netherrack Tools", true).getBoolean(true);
        enableGlowstoneTools = config.get("general", "Enable Glowstone Tools", true).getBoolean(true);
        enableIceTools = config.get("general", "Enable Ice Tools", true).getBoolean(true);
        enableLavaTools = config.get("general", "Enable Lava Tools", true).getBoolean(true);
        enableSlimeTools = config.get("general", "Enable Slime Tools", true).getBoolean(true);
        enableCactusTools = config.get("general", "Enable Cactus Tools", true).getBoolean(true);
        enableFlintTools = config.get("general", "Enable Flint Tools", true).getBoolean(true);
        enableBlazeTools = config.get("general", "Enable Blaze Tools", true).getBoolean(true);
        
        enableCopperTools = config.get("general", "Enable Copper Tools", true).getBoolean(true);
        enableBronzeTools = config.get("general", "Enable Bronze Tools", true).getBoolean(true);
        enableWorkedIronTools = config.get("general", "Enable Worked Iron Tools", true).getBoolean(true);
        enableSteelTools = config.get("general", "Enable Steel Tools", true).getBoolean(true);
        enableCobaltTools = config.get("general", "Enable Cobalt Tools", true).getBoolean(true);
        enableArditeTools = config.get("general", "Enable Ardite Tools", true).getBoolean(true);
        enableManyullynTools = config.get("general", "Enable Manyullyn Tools", true).getBoolean(true);
        enableUraniumTools = config.get("general", "Enable Uranium Tools", true).getBoolean(true);
        
        woodHandpickID = config.getItem("Wooden Handpicks", 21001).getInt(21001);
        stoneHandpickID = config.getItem("Stone Handpicks", 21008).getInt(21008);
        ironHandpickID = config.getItem("Iron Handpicks", 21017).getInt(21017);
        diamondHandpickID = config.getItem("Diamond Handpicks", 21026).getInt(21026);
        redstoneHandpickID = config.getItem("Redstone Handpicks", 21048).getInt(21048);
        obsidianHandpickID = config.getItem("Obsidian Handpicks", 21068).getInt(21068);
        sandstoneHandpickID = config.getItem("Sandstone Handpicks", 21078).getInt(21078);
        boneHandpickID = config.getItem("Bone Handpicks", 21086).getInt(21086);
        paperHandpickID = config.getItem("Paper Handpicks", 21095).getInt(21095);
        mossyHandpickID = config.getItem("Mossy Handpicks", 21100).getInt(21100);
        netherrackHandpickID = config.getItem("Netherrack Handpicks", 21112).getInt(21112);
        glowstoneHandpickID = config.getItem("Glowstone Handpicks", 21125).getInt(21125);
        iceHandpickID = config.getItem("Ice Handpicks", 21134).getInt(21134);
        lavaHandpickID = config.getItem("Lava Handpicks", 21140).getInt(21140);
        slimeHandpickID = config.getItem("Slime Handpicks", 21148).getInt(21148);
        cactusHandpickID = config.getItem("Cactus Handpicks", 21154).getInt(21154);
        flintHandpickID = config.getItem("Flint Handpicks", 21161).getInt(21161);
        blazeHandpickID = config.getItem("Blaze Handpicks", 21171).getInt(21171);
        
        copperHandpickID = config.getItem("Copper Handpicks", 21179).getInt(21179);
        bronzeHandpickID = config.getItem("Bronze Handpicks", 21187).getInt(21187);
        workedIronHandpickID = config.getItem("Worked Iron Handpicks", 21196).getInt(21196);
        steelHandpickID = config.getItem("Steel Handpicks", 21214).getInt(21214);
        cobaltHandpickID = config.getItem("Cobalt Handpicks", 21234).getInt(21234);
        arditeHandpickID = config.getItem("Ardite Handpicks", 21252).getInt(21252);
        manyullynHandpickID = config.getItem("Manyullyn Handpicks", 21270).getInt(21270);
        uraniumHandpickID = config.getItem("Uranium Handpicks", 21288).getInt(21288);
        
        woodDaggerID = config.getItem("Wooden Daggers", 21301).getInt(21301);
        stoneDaggerID = config.getItem("Stone Daggers", 21308).getInt(21308);
        ironDaggerID = config.getItem("Iron Daggers", 21317).getInt(21317);
        diamondDaggerID = config.getItem("Diamond Daggers", 21326).getInt(21326);
        redstoneDaggerID = config.getItem("Redstone Daggers", 21348).getInt(21348);
        obsidianDaggerID = config.getItem("Obsidian Daggers", 21368).getInt(21368);
        sandstoneDaggerID = config.getItem("Sandstone Daggers", 21378).getInt(21378);
        boneDaggerID = config.getItem("Bone Daggers", 21386).getInt(21386);
        paperDaggerID = config.getItem("Paper Daggers", 21395).getInt(21395);
        mossyDaggerID = config.getItem("Mossy Daggers", 21400).getInt(21400);
        netherrackDaggerID = config.getItem("Netherrack Daggers", 21412).getInt(21412);
        glowstoneDaggerID = config.getItem("Glowstone Daggers", 21425).getInt(21425);
        iceDaggerID = config.getItem("Ice Daggers", 21434).getInt(21434);
        lavaDaggerID = config.getItem("Lava Daggers", 21440).getInt(21440);
        slimeDaggerID = config.getItem("Slime Daggers", 21448).getInt(21448);
        cactusDaggerID = config.getItem("Cactus Daggers", 21454).getInt(21454);
        flintDaggerID = config.getItem("Flint Daggers", 21461).getInt(21461);
        blazeDaggerID = config.getItem("Blaze Daggers", 21471).getInt(21471);
        
        copperDaggerID = config.getItem("Copper Daggers", 21479).getInt(21479);
        bronzeDaggerID = config.getItem("Bronze Daggers", 21487).getInt(21487);
        workedIronDaggerID = config.getItem("Worked Iron Daggers", 21496).getInt(21496);
        steelDaggerID = config.getItem("Steel Daggers", 21514).getInt(21514);
        cobaltDaggerID = config.getItem("Cobalt Daggers", 21534).getInt(21534);
        arditeDaggerID = config.getItem("Ardite Daggers", 21552).getInt(21552);
        manyullynDaggerID = config.getItem("Manyullyn Daggers", 21570).getInt(21570);
        uraniumDaggerID = config.getItem("Uranium Daggers", 21588).getInt(21588);
        
        woodTrowelID = config.getItem("Wooden Trowels", 21601).getInt(21601);
        stoneTrowelID = config.getItem("Stone Trowels", 21608).getInt(21608);
        ironTrowelID = config.getItem("Iron Trowels", 21617).getInt(21617);
        diamondTrowelID = config.getItem("Diamond Trowels", 21626).getInt(21626);
        redstoneTrowelID = config.getItem("Redstone Trowels", 21648).getInt(21648);
        obsidianTrowelID = config.getItem("Obsidian Trowels", 21668).getInt(21668);
        sandstoneTrowelID = config.getItem("Sandstone Trowels", 21678).getInt(21678);
        boneTrowelID = config.getItem("Bone Trowels", 21686).getInt(21686);
        paperTrowelID = config.getItem("Paper Trowels", 21695).getInt(21695);
        mossyTrowelID = config.getItem("Mossy Trowels", 21700).getInt(21700);
        netherrackTrowelID = config.getItem("Netherrack Trowels", 21712).getInt(21712);
        glowstoneTrowelID = config.getItem("Glowstone Trowels", 21725).getInt(21725);
        iceTrowelID = config.getItem("Ice Trowels", 21734).getInt(21734);
        lavaTrowelID = config.getItem("Lava Trowels", 21740).getInt(21740);
        slimeTrowelID = config.getItem("Slime Trowels", 21748).getInt(21748);
        cactusTrowelID = config.getItem("Cactus Trowels", 21754).getInt(21754);
        flintTrowelID = config.getItem("Flint Trowels", 21761).getInt(21761);
        blazeTrowelID = config.getItem("Blaze Trowels", 21771).getInt(21771);
        
        copperTrowelID = config.getItem("Copper Trowels", 21779).getInt(21779);
        bronzeTrowelID = config.getItem("Bronze Trowels", 21787).getInt(21787);
        workedIronTrowelID = config.getItem("Worked Iron Trowels", 21796).getInt(21796);
        steelTrowelID = config.getItem("Steel Trowels", 21814).getInt(21814);
        cobaltTrowelID = config.getItem("Cobalt Trowels", 21834).getInt(21834);
        arditeTrowelID = config.getItem("Ardite Trowels", 21852).getInt(21852);
        manyullynTrowelID = config.getItem("Manyullyn Trowels", 21870).getInt(21870);
        uraniumTrowelID = config.getItem("Uranium Trowels", 21888).getInt(21888);
        
        woodHatchetID = config.getItem("Wooden Hatchets", 21901).getInt(21901);
        stoneHatchetID = config.getItem("Stone Hatchets", 21908).getInt(21908);
        ironHatchetID = config.getItem("Iron Hatchets", 21917).getInt(21917);
        diamondHatchetID = config.getItem("Diamond Hatchets", 21926).getInt(21926);
        redstoneHatchetID = config.getItem("Redstone Hatchets", 21948).getInt(21948);
        obsidianHatchetID = config.getItem("Obsidian Hatchets", 21968).getInt(21968);
        sandstoneHatchetID = config.getItem("Sandstone Hatchets", 21978).getInt(21978);
        boneHatchetID = config.getItem("Bone Hatchets", 21986).getInt(21986);
        paperHatchetID = config.getItem("Paper Hatchets", 21995).getInt(21995);
        mossyHatchetID = config.getItem("Mossy Hatchets", 22000).getInt(22000);
        netherrackHatchetID = config.getItem("Netherrack Hatchets", 22012).getInt(22012);
        glowstoneHatchetID = config.getItem("Glowstone Hatchets", 22025).getInt(22025);
        iceHatchetID = config.getItem("Ice Hatchets", 22034).getInt(22034);
        lavaHatchetID = config.getItem("Lava Hatchets", 22040).getInt(22040);
        slimeHatchetID = config.getItem("Slime Hatchets", 22048).getInt(22048);
        cactusHatchetID = config.getItem("Cactus Hatchets", 22054).getInt(22054);
        flintHatchetID = config.getItem("Flint Hatchets", 22061).getInt(22061);
        blazeHatchetID = config.getItem("Blaze Hatchets", 22071).getInt(22071);
        
        copperHatchetID = config.getItem("Copper Hatchets", 22079).getInt(22079);
        bronzeHatchetID = config.getItem("Bronze Hatchets", 22087).getInt(22087);
        workedIronHatchetID = config.getItem("Worked Iron Hatchets", 22096).getInt(22096);
        steelHatchetID = config.getItem("Steel Hatchets", 22114).getInt(22114);
        cobaltHatchetID = config.getItem("Cobalt Hatchets", 22134).getInt(22134);
        arditeHatchetID = config.getItem("Ardite Hatchets", 22152).getInt(22152);
        manyullynHatchetID = config.getItem("Manyullyn Hatchets", 22170).getInt(22170);
        uraniumHatchetID = config.getItem("Uranium Hatchets", 22188).getInt(22188);

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