package net.minecraft.src.metals;
import java.io.File;
import java.io.IOException;

import net.minecraft.client.Minecraft;
import net.minecraft.src.Item;
import net.minecraft.src.forge.Configuration;

public class PropsHelperInfiMetals {

    public static void initProps()
    {
        /* Here we will set up the config file for the mod 
         * First: Create a folder inside the config folder
         * Second: Create the actual config file
         * Note: Configs are a pain, but absolutely necessary for every mod.
         */

        File file = new File(Minecraft.getMinecraftDir() + "/config/InfiCraft");
        file.mkdir();
        File newFile = new File(Minecraft.getMinecraftDir() + "/config/InfiCraft/InfiMetals.cfg");

        /* Some basic debugging will go a long way */
        try
        {
            newFile.createNewFile();
            System.out.println("Successfully created/read configuration file");
        }
        catch (IOException e)
        {
            System.out.println("Could not create configuration file for mod_InfiMetals. Reason:");
            System.out.println(e);
        }

        /* [Forge] Configuration class, used as config method */
        Configuration config = new Configuration(newFile);

        /* Load the configuration file */
        config.load();

        /* Define the mod's IDs. 
         * Avoid values below 4096 for items and in the 250-600 range for blocks
         */
        enableCopperTools = config.getOrCreateBooleanProperty("Enable Copper Tools", "general", true).getBoolean(true);
        enableBronzeTools = config.getOrCreateBooleanProperty("Enable Bronze Tools", "general", true).getBoolean(true);
        enableWorkedIronTools = config.getOrCreateBooleanProperty("Enable Worked Iron Tools", "general", true).getBoolean(true);
        enableSteelTools = config.getOrCreateBooleanProperty("Enable Steel Tools", "general", true).getBoolean(true);
        enableCobaltTools = config.getOrCreateBooleanProperty("Enable Cobalt Tools", "general", true).getBoolean(true);
        enableArditeTools = config.getOrCreateBooleanProperty("Enable Ardite Tools", "general", true).getBoolean(true);
        enableManyullynTools = config.getOrCreateBooleanProperty("Enable Manyullyn Tools", "general", true).getBoolean(true);
        enableUraniumTools = config.getOrCreateBooleanProperty("Enable Uranium Tools", "general", true).getBoolean(true);
        enableStoneTools = config.getOrCreateBooleanProperty("Enable Stone Tools", "general", true).getBoolean(true);
        enableIronTools = config.getOrCreateBooleanProperty("Enable Iron Tools", "general", true).getBoolean(true);
        enableDiamondTools = config.getOrCreateBooleanProperty("Enable Diamond Tools", "general", true).getBoolean(true);
        enableRedstoneTools = config.getOrCreateBooleanProperty("Enable Redstone Tools", "general", true).getBoolean(true);
        enableMossyTools = config.getOrCreateBooleanProperty("Enable Mossy Tools", "general", true).getBoolean(true);
        enableNetherrackTools = config.getOrCreateBooleanProperty("Enable Netherrack Tools", "general", true).getBoolean(true);
        enableGlowstoneTools = config.getOrCreateBooleanProperty("Enable Glowstone Tools", "general", true).getBoolean(true);
        enableLavaTools = config.getOrCreateBooleanProperty("Enable Lava Tools", "general", true).getBoolean(true);
        enableSlimeTools = config.getOrCreateBooleanProperty("Enable Slime Tools", "general", true).getBoolean(true);
        enableFlintTools = config.getOrCreateBooleanProperty("Enable Flint Tools", "general", true).getBoolean(true);
        enableBlazeTools = config.getOrCreateBooleanProperty("Enable Blaze Tools", "general", true).getBoolean(true);
        
        copperRodID = config.getOrCreateIntProperty("Copper Rod", "item", 13881).getInt(13881);
        bronzeRodID = config.getOrCreateIntProperty("Bronze Rod", "item", 13882).getInt(13882);
        workedIronRodID = config.getOrCreateIntProperty("Worked Iron Rod", "item", 13883).getInt(13883);
        steelRodID = config.getOrCreateIntProperty("Steel Rod", "item", 13884).getInt(13884);
        cobaltRodID = config.getOrCreateIntProperty("Cobalt Rod", "item", 13885).getInt(13885);
        arditeRodID = config.getOrCreateIntProperty("Ardite Rod", "item", 13886).getInt(13886);
        manyullynRodID = config.getOrCreateIntProperty("Manyullyn Rod", "item", 13887).getInt(13887);
        uraniumRodID = config.getOrCreateIntProperty("Uranium Rod", "item", 13888).getInt(13888);
        
        copperPickaxeID = config.getOrCreateIntProperty("Copper Pickaxes", "item", 19201).getInt(19201);
        bronzePickaxeID = config.getOrCreateIntProperty("Bronze Pickaxes", "item", 19208).getInt(19208);
        workedIronPickaxeID = config.getOrCreateIntProperty("Worked Iron Pickaxes", "item", 19216).getInt(19216);
        steelPickaxeID = config.getOrCreateIntProperty("Steel Pickaxes", "item", 19236).getInt(19236);
        cobaltPickaxeID = config.getOrCreateIntProperty("Cobalt Pickaxes", "item", 19256).getInt(19256);
        arditePickaxeID = config.getOrCreateIntProperty("Ardite Pickaxes", "item", 19276).getInt(19276);
        manyullynPickaxeID = config.getOrCreateIntProperty("Manyullyn Pickaxes", "item", 19296).getInt(19296);
        uraniumPickaxeID = config.getOrCreateIntProperty("Uranium Pickaxes", "item", 19316).getInt(19316);
        stonePickaxeID = config.getOrCreateIntProperty("Stone Pickaxes", "item", 19326).getInt(19326);
        ironPickaxeID = config.getOrCreateIntProperty("Iron Pickaxes", "item", 19327).getInt(19327);
        diamondPickaxeID = config.getOrCreateIntProperty("Diamond Pickaxes", "item", 19330).getInt(19330);
        redstonePickaxeID = config.getOrCreateIntProperty("Redstone Pickaxes", "item", 19338).getInt(19338);
        mossyPickaxeID = config.getOrCreateIntProperty("Mossy Pickaxes", "item", 19341).getInt(19341);
        netherrackPickaxeID = config.getOrCreateIntProperty("Netherrack Pickaxes", "item", 19344).getInt(19344);
        glowstonePickaxeID = config.getOrCreateIntProperty("Glowstone Pickaxes", "item", 19345).getInt(19345);
        lavaPickaxeID = config.getOrCreateIntProperty("Lava Pickaxes", "item", 19349).getInt(19349);
        slimePickaxeID = config.getOrCreateIntProperty("Slime Pickaxes", "item", 19353).getInt(19353);
        flintPickaxeID = config.getOrCreateIntProperty("Flint Pickaxes", "item", 19361).getInt(19361);
        blazePickaxeID = config.getOrCreateIntProperty("Blaze Pickaxes", "item", 19363).getInt(19363);
        
        copperSwordID = config.getOrCreateIntProperty("Copper Swords", "item", 19401).getInt(19401);
        bronzeSwordID = config.getOrCreateIntProperty("Bronze Swords", "item", 19408).getInt(19408);
        workedIronSwordID = config.getOrCreateIntProperty("Worked Iron Swords", "item", 19416).getInt(19416);
        steelSwordID = config.getOrCreateIntProperty("Steel Swords", "item", 19436).getInt(19436);
        cobaltSwordID = config.getOrCreateIntProperty("Cobalt Swords", "item", 19456).getInt(19456);
        arditeSwordID = config.getOrCreateIntProperty("Ardite Swords", "item", 19476).getInt(19476);
        manyullynSwordID = config.getOrCreateIntProperty("Manyullyn Swords", "item", 19496).getInt(19496);
        uraniumSwordID = config.getOrCreateIntProperty("Uranium Swords", "item", 19516).getInt(19516);
        stoneSwordID = config.getOrCreateIntProperty("Stone Swords", "item", 19526).getInt(19526);
        ironSwordID = config.getOrCreateIntProperty("Iron Swords", "item", 19527).getInt(19527);
        diamondSwordID = config.getOrCreateIntProperty("Diamond Swords", "item", 19530).getInt(19530);
        redstoneSwordID = config.getOrCreateIntProperty("Redstone Swords", "item", 19538).getInt(19538);
        mossySwordID = config.getOrCreateIntProperty("Mossy Swords", "item", 19541).getInt(19541);
        netherrackSwordID = config.getOrCreateIntProperty("Netherrack Swords", "item", 19544).getInt(19544);
        glowstoneSwordID = config.getOrCreateIntProperty("Glowstone Swords", "item", 19545).getInt(19545);
        lavaSwordID = config.getOrCreateIntProperty("Lava Swords", "item", 19549).getInt(19549);
        slimeSwordID = config.getOrCreateIntProperty("Slime Swords", "item", 19553).getInt(19553);
        flintSwordID = config.getOrCreateIntProperty("Flint Swords", "item", 19561).getInt(19561);
        blazeSwordID = config.getOrCreateIntProperty("Blaze Swords", "item", 19563).getInt(19563);
        
        copperShovelID = config.getOrCreateIntProperty("Copper Shovels", "item", 19601).getInt(19601);
        bronzeShovelID = config.getOrCreateIntProperty("Bronze Shovels", "item", 19608).getInt(19608);
        workedIronShovelID = config.getOrCreateIntProperty("Worked Iron Shovels", "item", 19616).getInt(19616);
        steelShovelID = config.getOrCreateIntProperty("Steel Shovels", "item", 19636).getInt(19636);
        cobaltShovelID = config.getOrCreateIntProperty("Cobalt Shovels", "item", 19656).getInt(19656);
        arditeShovelID = config.getOrCreateIntProperty("Ardite Shovels", "item", 19676).getInt(19676);
        manyullynShovelID = config.getOrCreateIntProperty("Manyullyn Shovels", "item", 19696).getInt(19696);
        uraniumShovelID = config.getOrCreateIntProperty("Uranium Shovels", "item", 19716).getInt(19716);
        stoneShovelID = config.getOrCreateIntProperty("Stone Shovels", "item", 19726).getInt(19726);
        ironShovelID = config.getOrCreateIntProperty("Iron Shovels", "item", 19727).getInt(19727);
        diamondShovelID = config.getOrCreateIntProperty("Diamond Shovels", "item", 19730).getInt(19730);
        redstoneShovelID = config.getOrCreateIntProperty("Redstone Shovels", "item", 19738).getInt(19738);
        mossyShovelID = config.getOrCreateIntProperty("Mossy Shovels", "item", 19741).getInt(19741);
        netherrackShovelID = config.getOrCreateIntProperty("Netherrack Shovels", "item", 19744).getInt(19744);
        glowstoneShovelID = config.getOrCreateIntProperty("Glowstone Shovels", "item", 19745).getInt(19745);
        lavaShovelID = config.getOrCreateIntProperty("Lava Shovels", "item", 19749).getInt(19749);
        slimeShovelID = config.getOrCreateIntProperty("Slime Shovels", "item", 19753).getInt(19753);
        flintShovelID = config.getOrCreateIntProperty("Flint Shovels", "item", 19761).getInt(19761);
        blazeShovelID = config.getOrCreateIntProperty("Blaze Shovels", "item", 19763).getInt(19763);
        
        copperAxeID = config.getOrCreateIntProperty("Copper Axes", "item", 19801).getInt(19801);
        bronzeAxeID = config.getOrCreateIntProperty("Bronze Axes", "item", 19808).getInt(19808);
        workedIronAxeID = config.getOrCreateIntProperty("Worked Iron Axes", "item", 19816).getInt(19816);
        steelAxeID = config.getOrCreateIntProperty("Steel Axes", "item", 19836).getInt(19836);
        cobaltAxeID = config.getOrCreateIntProperty("Cobalt Axes", "item", 19856).getInt(19856);
        arditeAxeID = config.getOrCreateIntProperty("Ardite Axes", "item", 19876).getInt(19876);
        manyullynAxeID = config.getOrCreateIntProperty("Manyullyn Axes", "item", 19896).getInt(19896);
        uraniumAxeID = config.getOrCreateIntProperty("Uranium Axes", "item", 19916).getInt(19916);
        stoneAxeID = config.getOrCreateIntProperty("Stone Axes", "item", 19926).getInt(19926);
        ironAxeID = config.getOrCreateIntProperty("Iron Axes", "item", 19927).getInt(19927);
        diamondAxeID = config.getOrCreateIntProperty("Diamond Axes", "item", 19930).getInt(19930);
        redstoneAxeID = config.getOrCreateIntProperty("Redstone Axes", "item", 19938).getInt(19938);
        mossyAxeID = config.getOrCreateIntProperty("Mossy Axes", "item", 19941).getInt(19941);
        netherrackAxeID = config.getOrCreateIntProperty("Netherrack Axes", "item", 19944).getInt(19944);
        glowstoneAxeID = config.getOrCreateIntProperty("Glowstone Axes", "item", 19945).getInt(19945);
        lavaAxeID = config.getOrCreateIntProperty("Lava Axes", "item", 19949).getInt(19949);
        slimeAxeID = config.getOrCreateIntProperty("Slime Axes", "item", 19953).getInt(19953);
        flintAxeID = config.getOrCreateIntProperty("Flint Axes", "item", 19961).getInt(19961);
        blazeAxeID = config.getOrCreateIntProperty("Blaze Axes", "item", 19963).getInt(19963);
        
        copperHoeID = config.getOrCreateIntProperty("Copper Hoes", "item", 20001).getInt(20001);
        bronzeHoeID = config.getOrCreateIntProperty("Bronze Hoes", "item", 20008).getInt(20008);
        workedIronHoeID = config.getOrCreateIntProperty("Worked Iron Hoes", "item", 20016).getInt(20016);
        steelHoeID = config.getOrCreateIntProperty("Steel Hoes", "item", 20036).getInt(20036);
        cobaltHoeID = config.getOrCreateIntProperty("Cobalt Hoes", "item", 20056).getInt(20056);
        arditeHoeID = config.getOrCreateIntProperty("Ardite Hoes", "item", 20076).getInt(20076);
        manyullynHoeID = config.getOrCreateIntProperty("Manyullyn Hoes", "item", 20096).getInt(20096);
        uraniumHoeID = config.getOrCreateIntProperty("Uranium Hoes", "item", 20116).getInt(20116);
        stoneHoeID = config.getOrCreateIntProperty("Stone Hoes", "item", 20126).getInt(20126);
        ironHoeID = config.getOrCreateIntProperty("Iron Hoes", "item", 20127).getInt(20127);
        diamondHoeID = config.getOrCreateIntProperty("Diamond Hoes", "item", 20130).getInt(20130);
        redstoneHoeID = config.getOrCreateIntProperty("Redstone Hoes", "item", 20138).getInt(20138);
        mossyHoeID = config.getOrCreateIntProperty("Mossy Hoes", "item", 20141).getInt(20141);
        netherrackHoeID = config.getOrCreateIntProperty("Netherrack Hoes", "item", 20144).getInt(20144);
        glowstoneHoeID = config.getOrCreateIntProperty("Glowstone Hoes", "item", 20145).getInt(20145);
        lavaHoeID = config.getOrCreateIntProperty("Lava Hoes", "item", 20149).getInt(20149);
        slimeHoeID = config.getOrCreateIntProperty("Slime Hoes", "item", 20153).getInt(20153);
        flintHoeID = config.getOrCreateIntProperty("Flint Hoes", "item", 20161).getInt(20161);
        blazeHoeID = config.getOrCreateIntProperty("Blaze Hoes", "item", 20163).getInt(20163);

        /* Save the configuration file */
        config.save();
    }

    /* Prototype fields, used elsewhere */
    
    public static boolean enableCopperTools;
    public static boolean enableBronzeTools;
    public static boolean enableWorkedIronTools;
    public static boolean enableSteelTools;
    public static boolean enableCobaltTools;
    public static boolean enableArditeTools;
    public static boolean enableManyullynTools;
    public static boolean enableUraniumTools;
    public static boolean enableStoneTools;
    public static boolean enableIronTools;
    public static boolean enableDiamondTools;
    public static boolean enableRedstoneTools;
    public static boolean enableMossyTools;
    public static boolean enableNetherrackTools;
    public static boolean enableGlowstoneTools;
    public static boolean enableLavaTools;
    public static boolean enableSlimeTools;
    public static boolean enableFlintTools;
    public static boolean enableBlazeTools;
    
    public static int copperRodID;
    public static int bronzeRodID;
    public static int workedIronRodID;
    public static int steelRodID;
    public static int cobaltRodID;
    public static int arditeRodID;
    public static int manyullynRodID;
    public static int uraniumRodID;

    public static int copperPickaxeID;
    public static int bronzePickaxeID;
    public static int workedIronPickaxeID;
    public static int steelPickaxeID;
    public static int cobaltPickaxeID;
    public static int arditePickaxeID;
    public static int manyullynPickaxeID;
    public static int uraniumPickaxeID;
    public static int stonePickaxeID;
    public static int ironPickaxeID;
    public static int diamondPickaxeID;
    public static int redstonePickaxeID;
    public static int mossyPickaxeID;
    public static int netherrackPickaxeID;
    public static int glowstonePickaxeID;
    public static int lavaPickaxeID;
    public static int slimePickaxeID;
    public static int flintPickaxeID;
    public static int blazePickaxeID;
    
    public static int copperSwordID;
    public static int bronzeSwordID;
    public static int workedIronSwordID;
    public static int steelSwordID;
    public static int cobaltSwordID;
    public static int arditeSwordID;
    public static int manyullynSwordID;
    public static int uraniumSwordID;
    public static int stoneSwordID;
    public static int ironSwordID;
    public static int diamondSwordID;
    public static int redstoneSwordID;
    public static int mossySwordID;
    public static int netherrackSwordID;
    public static int glowstoneSwordID;
    public static int lavaSwordID;
    public static int slimeSwordID;
    public static int flintSwordID;
    public static int blazeSwordID;
    
    public static int copperShovelID;
    public static int bronzeShovelID;
    public static int workedIronShovelID;
    public static int steelShovelID;
    public static int cobaltShovelID;
    public static int arditeShovelID;
    public static int manyullynShovelID;
    public static int uraniumShovelID;
    public static int stoneShovelID;
    public static int ironShovelID;
    public static int diamondShovelID;
    public static int redstoneShovelID;
    public static int mossyShovelID;
    public static int netherrackShovelID;
    public static int glowstoneShovelID;
    public static int lavaShovelID;
    public static int slimeShovelID;
    public static int flintShovelID;
    public static int blazeShovelID;
    
    public static int copperAxeID;
    public static int bronzeAxeID;
    public static int workedIronAxeID;
    public static int steelAxeID;
    public static int cobaltAxeID;
    public static int arditeAxeID;
    public static int manyullynAxeID;
    public static int uraniumAxeID;
    public static int stoneAxeID;
    public static int ironAxeID;
    public static int diamondAxeID;
    public static int redstoneAxeID;
    public static int mossyAxeID;
    public static int netherrackAxeID;
    public static int glowstoneAxeID;
    public static int lavaAxeID;
    public static int slimeAxeID;
    public static int flintAxeID;
    public static int blazeAxeID;
    
    public static int copperHoeID;
    public static int bronzeHoeID;
    public static int workedIronHoeID;
    public static int steelHoeID;
    public static int cobaltHoeID;
    public static int arditeHoeID;
    public static int manyullynHoeID;
    public static int uraniumHoeID;
    public static int stoneHoeID;
    public static int ironHoeID;
    public static int diamondHoeID;
    public static int redstoneHoeID;
    public static int mossyHoeID;
    public static int netherrackHoeID;
    public static int glowstoneHoeID;
    public static int lavaHoeID;
    public static int slimeHoeID;
    public static int flintHoeID;
    public static int blazeHoeID;
}