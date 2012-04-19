package net.minecraft.src.inficore;
import java.io.File;
import java.io.IOException;

import net.minecraft.src.Item;
import net.minecraft.src.forge.Configuration;

public class PropsHelperInfiTools {

    public static void initProps()
    {
        /* Here we will set up the config file for the mod 
         * First: Create a folder inside the config folder
         * Second: Create the actual config file
         * Note: Configs are a pain, but absolutely necessary for every mod.
         */

        File file = new File("./config/InfiCraft");
        file.mkdir();
        File newFile = new File("./config/InfiCraft/InfiTools.txt");

        /* Some basic debugging will go a long way */
        try
        {
            newFile.createNewFile();
            System.out.println("Successfully created/read configuration file");
        }
        catch (IOException e)
        {
            System.out.println("Could not create configuration file for mod_InfiTools. Reason:");
            System.out.println(e);
        }

        /* [Forge] Configuration class, used as config method */
        Configuration config = new Configuration(newFile);

        /* Load the configuration file */
        config.load();

        /* Define the mod's IDs. 
         * Avoid values below 4096 for items and in the 256-385 range for blocks
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
        
        woodBucketID = config.getOrCreateIntProperty("Wooden Bucket", "item", 13954).getInt(13954);
        cactusBucketID = config.getOrCreateIntProperty("Cactus Bucket", "item", 13959).getInt(13959);
        goldBucketID = config.getOrCreateIntProperty("Gold Bucket", "item", 13964).getInt(13964);
        iceBucketID = config.getOrCreateIntProperty("Ice Bucket", "item", 13970).getInt(13970);
        lavaBucketID = config.getOrCreateIntProperty("Lava Bucket", "item", 13975).getInt(13975);
        slimeBucketID = config.getOrCreateIntProperty("Slime Bucket", "item", 13979).getInt(13979);
        ironBucketID = config.getOrCreateIntProperty("Iron Bucket", "item", 13984).getInt(13984);
        obsidianBucketID = config.getOrCreateIntProperty("Obsidian Bucket", "item", 13986).getInt(13986);
        
        bowlID = config.getOrCreateIntProperty("Bowls", "item", 13992).getInt(13992);
        soupBowlID = config.getOrCreateIntProperty("Soup Bowls", "item", 13993).getInt(13993);
        
        woodPickaxeID = config.getOrCreateIntProperty("Wooden Pickaxes", "item", 14001).getInt(14001);
        stonePickaxeID = config.getOrCreateIntProperty("Stone Pickaxes", "item", 14008).getInt(14008);
        ironPickaxeID = config.getOrCreateIntProperty("Iron Pickaxes", "item", 14017).getInt(14017);
        diamondPickaxeID = config.getOrCreateIntProperty("Diamond Pickaxes", "item", 14026).getInt(14026);
        redstonePickaxeID = config.getOrCreateIntProperty("Redstone Pickaxes", "item", 14048).getInt(14048);
        obsidianPickaxeID = config.getOrCreateIntProperty("Obsidian Pickaxes", "item", 14068).getInt(14068);
        sandstonePickaxeID = config.getOrCreateIntProperty("Sandstone Pickaxes", "item", 14078).getInt(14078);
        bonePickaxeID = config.getOrCreateIntProperty("Bone Pickaxes", "item", 14086).getInt(14086);
        paperPickaxeID = config.getOrCreateIntProperty("Paper Pickaxes", "item", 14095).getInt(14095);
        mossyPickaxeID = config.getOrCreateIntProperty("Mossy Pickaxes", "item", 14100).getInt(14100);
        netherrackPickaxeID = config.getOrCreateIntProperty("Netherrack Pickaxes", "item", 14112).getInt(14112);
        glowstonePickaxeID = config.getOrCreateIntProperty("Glowstone Pickaxes", "item", 14125).getInt(14125);
        icePickaxeID = config.getOrCreateIntProperty("Ice Pickaxes", "item", 14134).getInt(14134);
        lavaPickaxeID = config.getOrCreateIntProperty("Lava Pickaxes", "item", 14140).getInt(14140);
        slimePickaxeID = config.getOrCreateIntProperty("Slime Pickaxes", "item", 14148).getInt(14148);
        cactusPickaxeID = config.getOrCreateIntProperty("Cactus Pickaxes", "item", 14154).getInt(14154);
        flintPickaxeID = config.getOrCreateIntProperty("Flint Pickaxes", "item", 14161).getInt(14161);
        blazePickaxeID = config.getOrCreateIntProperty("Blaze Pickaxes", "item", 14171).getInt(14171);
        
        copperPickaxeID = config.getOrCreateIntProperty("Copper Pickaxes", "item", 14179).getInt(14179);
        bronzePickaxeID = config.getOrCreateIntProperty("Bronze Pickaxes", "item", 14187).getInt(14187);
        workedIronPickaxeID = config.getOrCreateIntProperty("Worked Iron Pickaxes", "item", 14196).getInt(14196);
        steelPickaxeID = config.getOrCreateIntProperty("Steel Pickaxes", "item", 14214).getInt(14214);
        cobaltPickaxeID = config.getOrCreateIntProperty("Cobalt Pickaxes", "item", 14234).getInt(14234);
        arditePickaxeID = config.getOrCreateIntProperty("Ardite Pickaxes", "item", 14252).getInt(14252);
        manyullynPickaxeID = config.getOrCreateIntProperty("Manyullyn Pickaxes", "item", 14270).getInt(14270);
        uraniumPickaxeID = config.getOrCreateIntProperty("Uranium Pickaxes", "item", 14288).getInt(14288);
        
        woodSwordID = config.getOrCreateIntProperty("Wooden Swords", "item", 14301).getInt(14301);
        stoneSwordID = config.getOrCreateIntProperty("Stone Swords", "item", 14308).getInt(14308);
        ironSwordID = config.getOrCreateIntProperty("Iron Swords", "item", 14317).getInt(14317);
        diamondSwordID = config.getOrCreateIntProperty("Diamond Swords", "item", 14326).getInt(14326);
        redstoneSwordID = config.getOrCreateIntProperty("Redstone Swords", "item", 14348).getInt(14348);
        obsidianSwordID = config.getOrCreateIntProperty("Obsidian Swords", "item", 14368).getInt(14368);
        sandstoneSwordID = config.getOrCreateIntProperty("Sandstone Swords", "item", 14378).getInt(14378);
        boneSwordID = config.getOrCreateIntProperty("Bone Swords", "item", 14386).getInt(14386);
        paperSwordID = config.getOrCreateIntProperty("Paper Swords", "item", 14395).getInt(14395);
        mossySwordID = config.getOrCreateIntProperty("Mossy Swords", "item", 14400).getInt(14400);
        netherrackSwordID = config.getOrCreateIntProperty("Netherrack Swords", "item", 14412).getInt(14412);
        glowstoneSwordID = config.getOrCreateIntProperty("Glowstone Swords", "item", 14425).getInt(14425);
        iceSwordID = config.getOrCreateIntProperty("Ice Swords", "item", 14434).getInt(14434);
        lavaSwordID = config.getOrCreateIntProperty("Lava Swords", "item", 14440).getInt(14440);
        slimeSwordID = config.getOrCreateIntProperty("Slime Swords", "item", 14448).getInt(14448);
        cactusSwordID = config.getOrCreateIntProperty("Cactus Swords", "item", 14454).getInt(14454);
        flintSwordID = config.getOrCreateIntProperty("Flint Swords", "item", 14461).getInt(14461);
        blazeSwordID = config.getOrCreateIntProperty("Blaze Swords", "item", 14471).getInt(14471);
        
        copperSwordID = config.getOrCreateIntProperty("Copper Swords", "item", 14479).getInt(14479);
        bronzeSwordID = config.getOrCreateIntProperty("Bronze Swords", "item", 14487).getInt(14487);
        workedIronSwordID = config.getOrCreateIntProperty("Worked Iron Swords", "item", 14496).getInt(14496);
        steelSwordID = config.getOrCreateIntProperty("Steel Swords", "item", 14514).getInt(14514);
        cobaltSwordID = config.getOrCreateIntProperty("Cobalt Swords", "item", 14534).getInt(14534);
        arditeSwordID = config.getOrCreateIntProperty("Ardite Swords", "item", 14552).getInt(14552);
        manyullynSwordID = config.getOrCreateIntProperty("Manyullyn Swords", "item", 14570).getInt(14570);
        uraniumSwordID = config.getOrCreateIntProperty("Uranium Swords", "item", 14588).getInt(14588);
        
        woodShovelID = config.getOrCreateIntProperty("Wooden Shovels", "item", 14601).getInt(14601);
        stoneShovelID = config.getOrCreateIntProperty("Stone Shovels", "item", 14608).getInt(14608);
        ironShovelID = config.getOrCreateIntProperty("Iron Shovels", "item", 14617).getInt(14617);
        diamondShovelID = config.getOrCreateIntProperty("Diamond Shovels", "item", 14626).getInt(14626);
        redstoneShovelID = config.getOrCreateIntProperty("Redstone Shovels", "item", 14648).getInt(14648);
        obsidianShovelID = config.getOrCreateIntProperty("Obsidian Shovels", "item", 14668).getInt(14668);
        sandstoneShovelID = config.getOrCreateIntProperty("Sandstone Shovels", "item", 14678).getInt(14678);
        boneShovelID = config.getOrCreateIntProperty("Bone Shovels", "item", 14686).getInt(14686);
        paperShovelID = config.getOrCreateIntProperty("Paper Shovels", "item", 14695).getInt(14695);
        mossyShovelID = config.getOrCreateIntProperty("Mossy Shovels", "item", 14700).getInt(14700);
        netherrackShovelID = config.getOrCreateIntProperty("Netherrack Shovels", "item", 14712).getInt(14712);
        glowstoneShovelID = config.getOrCreateIntProperty("Glowstone Shovels", "item", 14725).getInt(14725);
        iceShovelID = config.getOrCreateIntProperty("Ice Shovels", "item", 14734).getInt(14734);
        lavaShovelID = config.getOrCreateIntProperty("Lava Shovels", "item", 14740).getInt(14740);
        slimeShovelID = config.getOrCreateIntProperty("Slime Shovels", "item", 14748).getInt(14748);
        cactusShovelID = config.getOrCreateIntProperty("Cactus Shovels", "item", 14754).getInt(14754);
        flintShovelID = config.getOrCreateIntProperty("Flint Shovels", "item", 14761).getInt(14761);
        blazeShovelID = config.getOrCreateIntProperty("Blaze Shovels", "item", 14771).getInt(14771);
        
        copperShovelID = config.getOrCreateIntProperty("Copper Shovels", "item", 14779).getInt(14779);
        bronzeShovelID = config.getOrCreateIntProperty("Bronze Shovels", "item", 14787).getInt(14787);
        workedIronShovelID = config.getOrCreateIntProperty("Worked Iron Shovels", "item", 14796).getInt(14796);
        steelShovelID = config.getOrCreateIntProperty("Steel Shovels", "item", 14814).getInt(14814);
        cobaltShovelID = config.getOrCreateIntProperty("Cobalt Shovels", "item", 14834).getInt(14834);
        arditeShovelID = config.getOrCreateIntProperty("Ardite Shovels", "item", 14852).getInt(14852);
        manyullynShovelID = config.getOrCreateIntProperty("Manyullyn Shovels", "item", 14870).getInt(14870);
        uraniumShovelID = config.getOrCreateIntProperty("Uranium Shovels", "item", 14888).getInt(14888);
        
        woodAxeID = config.getOrCreateIntProperty("Wooden Axes", "item", 14901).getInt(14901);
        stoneAxeID = config.getOrCreateIntProperty("Stone Axes", "item", 14908).getInt(14908);
        ironAxeID = config.getOrCreateIntProperty("Iron Axes", "item", 14917).getInt(14917);
        diamondAxeID = config.getOrCreateIntProperty("Diamond Axes", "item", 14926).getInt(14926);
        redstoneAxeID = config.getOrCreateIntProperty("Redstone Axes", "item", 14948).getInt(14948);
        obsidianAxeID = config.getOrCreateIntProperty("Obsidian Axes", "item", 14968).getInt(14968);
        sandstoneAxeID = config.getOrCreateIntProperty("Sandstone Axes", "item", 14978).getInt(14978);
        boneAxeID = config.getOrCreateIntProperty("Bone Axes", "item", 14986).getInt(14986);
        paperAxeID = config.getOrCreateIntProperty("Paper Axes", "item", 14995).getInt(14995);
        mossyAxeID = config.getOrCreateIntProperty("Mossy Axes", "item", 15000).getInt(15000);
        netherrackAxeID = config.getOrCreateIntProperty("Netherrack Axes", "item", 15012).getInt(15012);
        glowstoneAxeID = config.getOrCreateIntProperty("Glowstone Axes", "item", 15025).getInt(15025);
        iceAxeID = config.getOrCreateIntProperty("Ice Axes", "item", 15034).getInt(15034);
        lavaAxeID = config.getOrCreateIntProperty("Lava Axes", "item", 15040).getInt(15040);
        slimeAxeID = config.getOrCreateIntProperty("Slime Axes", "item", 15048).getInt(15048);
        cactusAxeID = config.getOrCreateIntProperty("Cactus Axes", "item", 15054).getInt(15054);
        flintAxeID = config.getOrCreateIntProperty("Flint Axes", "item", 15061).getInt(15061);
        blazeAxeID = config.getOrCreateIntProperty("Blaze Axes", "item", 15071).getInt(15071);
        
        copperAxeID = config.getOrCreateIntProperty("Copper Axes", "item", 15079).getInt(15079);
        bronzeAxeID = config.getOrCreateIntProperty("Bronze Axes", "item", 15087).getInt(15087);
        workedIronAxeID = config.getOrCreateIntProperty("Worked Iron Axes", "item", 15096).getInt(15096);
        steelAxeID = config.getOrCreateIntProperty("Steel Axes", "item", 15114).getInt(15114);
        cobaltAxeID = config.getOrCreateIntProperty("Cobalt Axes", "item", 15134).getInt(15134);
        arditeAxeID = config.getOrCreateIntProperty("Ardite Axes", "item", 15152).getInt(15152);
        manyullynAxeID = config.getOrCreateIntProperty("Manyullyn Axes", "item", 15170).getInt(15170);
        uraniumAxeID = config.getOrCreateIntProperty("Uranium Axes", "item", 15188).getInt(15188);
        
        woodHoeID = config.getOrCreateIntProperty("Wooden Hoes", "item", 15201).getInt(15201);
        stoneHoeID = config.getOrCreateIntProperty("Stone Hoes", "item", 15208).getInt(15208);
        ironHoeID = config.getOrCreateIntProperty("Iron Hoes", "item", 15217).getInt(15217);
        diamondHoeID = config.getOrCreateIntProperty("Diamond Hoes", "item", 15226).getInt(15226);
        redstoneHoeID = config.getOrCreateIntProperty("Redstone Hoes", "item", 15248).getInt(15248);
        obsidianHoeID = config.getOrCreateIntProperty("Obsidian Hoes", "item", 15268).getInt(15268);
        sandstoneHoeID = config.getOrCreateIntProperty("Sandstone Hoes", "item", 15278).getInt(15278);
        boneHoeID = config.getOrCreateIntProperty("Bone Hoes", "item", 15286).getInt(15286);
        paperHoeID = config.getOrCreateIntProperty("Paper Hoes", "item", 15295).getInt(15295);
        mossyHoeID = config.getOrCreateIntProperty("Mossy Hoes", "item", 15300).getInt(15300);
        netherrackHoeID = config.getOrCreateIntProperty("Netherrack Hoes", "item", 15312).getInt(15312);
        glowstoneHoeID = config.getOrCreateIntProperty("Glowstone Hoes", "item", 15325).getInt(15325);
        iceHoeID = config.getOrCreateIntProperty("Ice Hoes", "item", 15334).getInt(15334);
        lavaHoeID = config.getOrCreateIntProperty("Lava Hoes", "item", 15340).getInt(15340);
        slimeHoeID = config.getOrCreateIntProperty("Slime Hoes", "item", 15348).getInt(15348);
        cactusHoeID = config.getOrCreateIntProperty("Cactus Hoes", "item", 15354).getInt(15354);
        flintHoeID = config.getOrCreateIntProperty("Flint Hoes", "item", 15361).getInt(15361);
        blazeHoeID = config.getOrCreateIntProperty("Blaze Hoes", "item", 15371).getInt(15371);
        
        copperHoeID = config.getOrCreateIntProperty("Copper Hoes", "item", 15379).getInt(15379);
        bronzeHoeID = config.getOrCreateIntProperty("Bronze Hoes", "item", 15387).getInt(15387);
        workedIronHoeID = config.getOrCreateIntProperty("Worked Iron Hoes", "item", 15396).getInt(15396);
        steelHoeID = config.getOrCreateIntProperty("Steel Hoes", "item", 15414).getInt(15414);
        cobaltHoeID = config.getOrCreateIntProperty("Cobalt Hoes", "item", 15434).getInt(15434);
        arditeHoeID = config.getOrCreateIntProperty("Ardite Hoes", "item", 15452).getInt(15452);
        manyullynHoeID = config.getOrCreateIntProperty("Manyullyn Hoes", "item", 15470).getInt(15470);
        uraniumHoeID = config.getOrCreateIntProperty("Uranium Hoes", "item", 15488).getInt(15488);

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
    
    public static int woodPickaxeID;
    public static int stonePickaxeID;
    public static int ironPickaxeID;
    public static int diamondPickaxeID;
    public static int redstonePickaxeID;
    public static int obsidianPickaxeID;
    public static int sandstonePickaxeID;
    public static int bonePickaxeID;
    public static int paperPickaxeID;
    public static int mossyPickaxeID;
    public static int netherrackPickaxeID;
    public static int glowstonePickaxeID;
    public static int icePickaxeID;
    public static int lavaPickaxeID;
    public static int slimePickaxeID;
    public static int cactusPickaxeID;
    public static int flintPickaxeID;
    public static int blazePickaxeID;
    
    public static int copperPickaxeID;
    public static int bronzePickaxeID;
    public static int workedIronPickaxeID;
    public static int steelPickaxeID;
    public static int cobaltPickaxeID;
    public static int arditePickaxeID;
    public static int manyullynPickaxeID;
    public static int uraniumPickaxeID;
    
    public static int woodSwordID;
    public static int stoneSwordID;
    public static int ironSwordID;
    public static int diamondSwordID;
    public static int redstoneSwordID;
    public static int obsidianSwordID;
    public static int sandstoneSwordID;
    public static int boneSwordID;
    public static int paperSwordID;
    public static int mossySwordID;
    public static int netherrackSwordID;
    public static int glowstoneSwordID;
    public static int iceSwordID;
    public static int lavaSwordID;
    public static int slimeSwordID;
    public static int cactusSwordID;
    public static int flintSwordID;
    public static int blazeSwordID;
    
    public static int copperSwordID;
    public static int bronzeSwordID;
    public static int workedIronSwordID;
    public static int steelSwordID;
    public static int cobaltSwordID;
    public static int arditeSwordID;
    public static int manyullynSwordID;
    public static int uraniumSwordID;
    
    public static int woodShovelID;
    public static int stoneShovelID;
    public static int ironShovelID;
    public static int diamondShovelID;
    public static int redstoneShovelID;
    public static int obsidianShovelID;
    public static int sandstoneShovelID;
    public static int boneShovelID;
    public static int paperShovelID;
    public static int mossyShovelID;
    public static int netherrackShovelID;
    public static int glowstoneShovelID;
    public static int iceShovelID;
    public static int lavaShovelID;
    public static int slimeShovelID;
    public static int cactusShovelID;
    public static int flintShovelID;
    public static int blazeShovelID;
    
    public static int copperShovelID;
    public static int bronzeShovelID;
    public static int workedIronShovelID;
    public static int steelShovelID;
    public static int cobaltShovelID;
    public static int arditeShovelID;
    public static int manyullynShovelID;
    public static int uraniumShovelID;
    
    public static int woodAxeID;
    public static int stoneAxeID;
    public static int ironAxeID;
    public static int diamondAxeID;
    public static int redstoneAxeID;
    public static int obsidianAxeID;
    public static int sandstoneAxeID;
    public static int boneAxeID;
    public static int paperAxeID;
    public static int mossyAxeID;
    public static int netherrackAxeID;
    public static int glowstoneAxeID;
    public static int iceAxeID;
    public static int lavaAxeID;
    public static int slimeAxeID;
    public static int cactusAxeID;
    public static int flintAxeID;
    public static int blazeAxeID;
    
    public static int copperAxeID;
    public static int bronzeAxeID;
    public static int workedIronAxeID;
    public static int steelAxeID;
    public static int cobaltAxeID;
    public static int arditeAxeID;
    public static int manyullynAxeID;
    public static int uraniumAxeID;
    
    public static int woodHoeID;
    public static int stoneHoeID;
    public static int ironHoeID;
    public static int diamondHoeID;
    public static int redstoneHoeID;
    public static int obsidianHoeID;
    public static int sandstoneHoeID;
    public static int boneHoeID;
    public static int paperHoeID;
    public static int mossyHoeID;
    public static int netherrackHoeID;
    public static int glowstoneHoeID;
    public static int iceHoeID;
    public static int lavaHoeID;
    public static int slimeHoeID;
    public static int cactusHoeID;
    public static int flintHoeID;
    public static int blazeHoeID;
    
    public static int copperHoeID;
    public static int bronzeHoeID;
    public static int workedIronHoeID;
    public static int steelHoeID;
    public static int cobaltHoeID;
    public static int arditeHoeID;
    public static int manyullynHoeID;
    public static int uraniumHoeID;
    
    public static int woodBucketID;
    public static int cactusBucketID;
    public static int goldBucketID;
    public static int iceBucketID;
    public static int lavaBucketID;
    public static int slimeBucketID;
    public static int ironBucketID;
    public static int obsidianBucketID;
    
    public static int bowlID;
    public static int soupBowlID;
}