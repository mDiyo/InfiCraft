package inficraft.infitools.base;
import java.io.File;
import java.io.IOException;

import net.minecraft.client.Minecraft;
import net.minecraft.src.Item;
import net.minecraftforge.common.Configuration;

public class PHInfiTools {

    public static void initProps()
    {
        /* Here we will set up the config file for the mod 
         * First: Create a folder inside the config folder
         * Second: Create the actual config file
         * Note: Configs are a pain, but absolutely necessary for every mod.
         */

        File file = new File(InfiBase.proxy.getMinecraftDir() + "/config/InfiCraft");
        file.mkdir();
        File newFile = new File(InfiBase.proxy.getMinecraftDir() + "/config/InfiCraft/InfiTools.txt");

        /* Some basic debugging will go a long way */
        try
        {
            newFile.createNewFile();
            System.out.println("InfiBase configuration file read!");
        }
        catch (IOException e)
        {
            System.out.println("Could not create configuration file for InfiBase. Reason:");
            System.out.println(e);
        }

        /* [Forge] Configuration class, used as config method */
        Configuration config = new Configuration(newFile);

        /* Load the configuration file */
        config.load();

        /* Define the mod's IDs. 
         * Avoid values below 4096 for items and in the 256-385 range for blocks
         */
        addInfiTools = config.get("general", "Add InfiTool Combinations", true).getBoolean(true);
        overwriteVanillaTools = config.get("general", "Overwrite Vanilla Tools", false).getBoolean(false);
        
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
        
        woodBucketID = config.getItem("Wooden Bucket", 13954).getInt(13954);
        cactusBucketID = config.getItem("Cactus Bucket", 13959).getInt(13959);
        goldBucketID = config.getItem("Gold Bucket", 13964).getInt(13964);
        iceBucketID = config.getItem("Ice Bucket", 13970).getInt(13970);
        lavaBucketID = config.getItem("Lava Bucket", 13975).getInt(13975);
        slimeBucketID = config.getItem("Slime Bucket", 13979).getInt(13979);
        ironBucketID = config.getItem("Iron Bucket", 13984).getInt(13984);
        obsidianBucketID = config.getItem("Obsidian Bucket", 13986).getInt(13986);
        
        bowlID = config.getItem("Bowls", 13992).getInt(13992);
        soupBowlID = config.getItem("Soup Bowls", 13993).getInt(13993);
        
        woodPickaxeID = config.getItem("Wooden Pickaxes", 14001).getInt(14001);
        stonePickaxeID = config.getItem("Stone Pickaxes", 14008).getInt(14008);
        ironPickaxeID = config.getItem("Iron Pickaxes", 14017).getInt(14017);
        diamondPickaxeID = config.getItem("Diamond Pickaxes", 14026).getInt(14026);
        redstonePickaxeID = config.getItem("Redstone Pickaxes", 14048).getInt(14048);
        obsidianPickaxeID = config.getItem("Obsidian Pickaxes", 14068).getInt(14068);
        sandstonePickaxeID = config.getItem("Sandstone Pickaxes", 14078).getInt(14078);
        bonePickaxeID = config.getItem("Bone Pickaxes", 14086).getInt(14086);
        paperPickaxeID = config.getItem("Paper Pickaxes", 14095).getInt(14095);
        mossyPickaxeID = config.getItem("Mossy Pickaxes", 14100).getInt(14100);
        netherrackPickaxeID = config.getItem("Netherrack Pickaxes", 14112).getInt(14112);
        glowstonePickaxeID = config.getItem("Glowstone Pickaxes", 14125).getInt(14125);
        icePickaxeID = config.getItem("Ice Pickaxes", 14134).getInt(14134);
        lavaPickaxeID = config.getItem("Lava Pickaxes", 14140).getInt(14140);
        slimePickaxeID = config.getItem("Slime Pickaxes", 14148).getInt(14148);
        cactusPickaxeID = config.getItem("Cactus Pickaxes", 14154).getInt(14154);
        flintPickaxeID = config.getItem("Flint Pickaxes", 14161).getInt(14161);
        blazePickaxeID = config.getItem("Blaze Pickaxes", 14171).getInt(14171);
        
        copperPickaxeID = config.getItem("Copper Pickaxes", 14179).getInt(14179);
        bronzePickaxeID = config.getItem("Bronze Pickaxes", 14187).getInt(14187);
        workedIronPickaxeID = config.getItem("Worked Iron Pickaxes", 14196).getInt(14196);
        steelPickaxeID = config.getItem("Steel Pickaxes", 14214).getInt(14214);
        cobaltPickaxeID = config.getItem("Cobalt Pickaxes", 14234).getInt(14234);
        arditePickaxeID = config.getItem("Ardite Pickaxes", 14252).getInt(14252);
        manyullynPickaxeID = config.getItem("Manyullyn Pickaxes", 14270).getInt(14270);
        uraniumPickaxeID = config.getItem("Uranium Pickaxes", 14288).getInt(14288);
        
        woodSwordID = config.getItem("Wooden Swords", 14301).getInt(14301);
        stoneSwordID = config.getItem("Stone Swords", 14308).getInt(14308);
        ironSwordID = config.getItem("Iron Swords", 14317).getInt(14317);
        diamondSwordID = config.getItem("Diamond Swords", 14326).getInt(14326);
        redstoneSwordID = config.getItem("Redstone Swords", 14348).getInt(14348);
        obsidianSwordID = config.getItem("Obsidian Swords", 14368).getInt(14368);
        sandstoneSwordID = config.getItem("Sandstone Swords", 14378).getInt(14378);
        boneSwordID = config.getItem("Bone Swords", 14386).getInt(14386);
        paperSwordID = config.getItem("Paper Swords", 14395).getInt(14395);
        mossySwordID = config.getItem("Mossy Swords", 14400).getInt(14400);
        netherrackSwordID = config.getItem("Netherrack Swords", 14412).getInt(14412);
        glowstoneSwordID = config.getItem("Glowstone Swords", 14425).getInt(14425);
        iceSwordID = config.getItem("Ice Swords", 14434).getInt(14434);
        lavaSwordID = config.getItem("Lava Swords", 14440).getInt(14440);
        slimeSwordID = config.getItem("Slime Swords", 14448).getInt(14448);
        cactusSwordID = config.getItem("Cactus Swords", 14454).getInt(14454);
        flintSwordID = config.getItem("Flint Swords", 14461).getInt(14461);
        blazeSwordID = config.getItem("Blaze Swords", 14471).getInt(14471);
        
        copperSwordID = config.getItem("Copper Swords", 14479).getInt(14479);
        bronzeSwordID = config.getItem("Bronze Swords", 14487).getInt(14487);
        workedIronSwordID = config.getItem("Worked Iron Swords", 14496).getInt(14496);
        steelSwordID = config.getItem("Steel Swords", 14514).getInt(14514);
        cobaltSwordID = config.getItem("Cobalt Swords", 14534).getInt(14534);
        arditeSwordID = config.getItem("Ardite Swords", 14552).getInt(14552);
        manyullynSwordID = config.getItem("Manyullyn Swords", 14570).getInt(14570);
        uraniumSwordID = config.getItem("Uranium Swords", 14588).getInt(14588);
        
        woodShovelID = config.getItem("Wooden Shovels", 14601).getInt(14601);
        stoneShovelID = config.getItem("Stone Shovels", 14608).getInt(14608);
        ironShovelID = config.getItem("Iron Shovels", 14617).getInt(14617);
        diamondShovelID = config.getItem("Diamond Shovels", 14626).getInt(14626);
        redstoneShovelID = config.getItem("Redstone Shovels", 14648).getInt(14648);
        obsidianShovelID = config.getItem("Obsidian Shovels", 14668).getInt(14668);
        sandstoneShovelID = config.getItem("Sandstone Shovels", 14678).getInt(14678);
        boneShovelID = config.getItem("Bone Shovels", 14686).getInt(14686);
        paperShovelID = config.getItem("Paper Shovels", 14695).getInt(14695);
        mossyShovelID = config.getItem("Mossy Shovels", 14700).getInt(14700);
        netherrackShovelID = config.getItem("Netherrack Shovels", 14712).getInt(14712);
        glowstoneShovelID = config.getItem("Glowstone Shovels", 14725).getInt(14725);
        iceShovelID = config.getItem("Ice Shovels", 14734).getInt(14734);
        lavaShovelID = config.getItem("Lava Shovels", 14740).getInt(14740);
        slimeShovelID = config.getItem("Slime Shovels", 14748).getInt(14748);
        cactusShovelID = config.getItem("Cactus Shovels", 14754).getInt(14754);
        flintShovelID = config.getItem("Flint Shovels", 14761).getInt(14761);
        blazeShovelID = config.getItem("Blaze Shovels", 14771).getInt(14771);
        
        copperShovelID = config.getItem("Copper Shovels", 14779).getInt(14779);
        bronzeShovelID = config.getItem("Bronze Shovels", 14787).getInt(14787);
        workedIronShovelID = config.getItem("Worked Iron Shovels", 14796).getInt(14796);
        steelShovelID = config.getItem("Steel Shovels", 14814).getInt(14814);
        cobaltShovelID = config.getItem("Cobalt Shovels", 14834).getInt(14834);
        arditeShovelID = config.getItem("Ardite Shovels", 14852).getInt(14852);
        manyullynShovelID = config.getItem("Manyullyn Shovels", 14870).getInt(14870);
        uraniumShovelID = config.getItem("Uranium Shovels", 14888).getInt(14888);
        
        woodAxeID = config.getItem("Wooden Axes", 14901).getInt(14901);
        stoneAxeID = config.getItem("Stone Axes", 14908).getInt(14908);
        ironAxeID = config.getItem("Iron Axes", 14917).getInt(14917);
        diamondAxeID = config.getItem("Diamond Axes", 14926).getInt(14926);
        redstoneAxeID = config.getItem("Redstone Axes", 14948).getInt(14948);
        obsidianAxeID = config.getItem("Obsidian Axes", 14968).getInt(14968);
        sandstoneAxeID = config.getItem("Sandstone Axes", 14978).getInt(14978);
        boneAxeID = config.getItem("Bone Axes", 14986).getInt(14986);
        paperAxeID = config.getItem("Paper Axes", 14995).getInt(14995);
        mossyAxeID = config.getItem("Mossy Axes", 15000).getInt(15000);
        netherrackAxeID = config.getItem("Netherrack Axes", 15012).getInt(15012);
        glowstoneAxeID = config.getItem("Glowstone Axes", 15025).getInt(15025);
        iceAxeID = config.getItem("Ice Axes", 15034).getInt(15034);
        lavaAxeID = config.getItem("Lava Axes", 15040).getInt(15040);
        slimeAxeID = config.getItem("Slime Axes", 15048).getInt(15048);
        cactusAxeID = config.getItem("Cactus Axes", 15054).getInt(15054);
        flintAxeID = config.getItem("Flint Axes", 15061).getInt(15061);
        blazeAxeID = config.getItem("Blaze Axes", 15071).getInt(15071);
        
        copperAxeID = config.getItem("Copper Axes", 15079).getInt(15079);
        bronzeAxeID = config.getItem("Bronze Axes", 15087).getInt(15087);
        workedIronAxeID = config.getItem("Worked Iron Axes", 15096).getInt(15096);
        steelAxeID = config.getItem("Steel Axes", 15114).getInt(15114);
        cobaltAxeID = config.getItem("Cobalt Axes", 15134).getInt(15134);
        arditeAxeID = config.getItem("Ardite Axes", 15152).getInt(15152);
        manyullynAxeID = config.getItem("Manyullyn Axes", 15170).getInt(15170);
        uraniumAxeID = config.getItem("Uranium Axes", 15188).getInt(15188);
        
        woodHoeID = config.getItem("Wooden Hoes", 15201).getInt(15201);
        stoneHoeID = config.getItem("Stone Hoes", 15208).getInt(15208);
        ironHoeID = config.getItem("Iron Hoes", 15217).getInt(15217);
        diamondHoeID = config.getItem("Diamond Hoes", 15226).getInt(15226);
        redstoneHoeID = config.getItem("Redstone Hoes", 15248).getInt(15248);
        obsidianHoeID = config.getItem("Obsidian Hoes", 15268).getInt(15268);
        sandstoneHoeID = config.getItem("Sandstone Hoes", 15278).getInt(15278);
        boneHoeID = config.getItem("Bone Hoes", 15286).getInt(15286);
        paperHoeID = config.getItem("Paper Hoes", 15295).getInt(15295);
        mossyHoeID = config.getItem("Mossy Hoes", 15300).getInt(15300);
        netherrackHoeID = config.getItem("Netherrack Hoes", 15312).getInt(15312);
        glowstoneHoeID = config.getItem("Glowstone Hoes", 15325).getInt(15325);
        iceHoeID = config.getItem("Ice Hoes", 15334).getInt(15334);
        lavaHoeID = config.getItem("Lava Hoes", 15340).getInt(15340);
        slimeHoeID = config.getItem("Slime Hoes", 15348).getInt(15348);
        cactusHoeID = config.getItem("Cactus Hoes", 15354).getInt(15354);
        flintHoeID = config.getItem("Flint Hoes", 15361).getInt(15361);
        blazeHoeID = config.getItem("Blaze Hoes", 15371).getInt(15371);
        
        copperHoeID = config.getItem("Copper Hoes", 15379).getInt(15379);
        bronzeHoeID = config.getItem("Bronze Hoes", 15387).getInt(15387);
        workedIronHoeID = config.getItem("Worked Iron Hoes", 15396).getInt(15396);
        steelHoeID = config.getItem("Steel Hoes", 15414).getInt(15414);
        cobaltHoeID = config.getItem("Cobalt Hoes", 15434).getInt(15434);
        arditeHoeID = config.getItem("Ardite Hoes", 15452).getInt(15452);
        manyullynHoeID = config.getItem("Manyullyn Hoes", 15470).getInt(15470);
        uraniumHoeID = config.getItem("Uranium Hoes", 15488).getInt(15488);

        /* Save the configuration file */
        config.save();
    }

    /* Prototype fields, used elsewhere */
    
    public static boolean overwriteVanillaTools;
    public static boolean addInfiTools;
    
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