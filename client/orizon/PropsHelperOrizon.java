package net.minecraft.src.orizon;
import java.io.File;
import java.io.IOException;

import net.minecraft.client.Minecraft;
import net.minecraft.src.Item;
import net.minecraft.src.forge.Configuration;
import net.minecraft.src.mod_Orizon;

public class PropsHelperOrizon {

    public static void initProps()
    {
        /* Here we will set up the config file for the mod 
         * First: Create a folder inside the config folder
         * Second: Create the actual config file
         * Note: Configs are a pain, but absolutely necessary for every mod.
         */
 
        File file = new File(Minecraft.getMinecraftDir() + "/config/InfiCraft");
        file.mkdir();
        File newFile = new File(Minecraft.getMinecraftDir() + "/config/InfiCraft/Orizon.txt");

        /* Some basic debugging will go a long way */
        try
        {
            newFile.createNewFile();
            System.out.println("Successfully created/read configuration file");
        }
        catch (IOException e)
        {
            System.out.println("Could not create configuration file for mod_Orizon. Reason:");
            System.out.println(e);
        }

        /* [Forge] Configuration class, used as config method */
        Configuration config = new Configuration(newFile);

        /* Load the configuration file */
        config.load();

        /* Define the mod's IDs. 
         * Avoid values below 4096 for items and in the 250-450 range for blocks
         */
        
        mod_Orizon.mineralOreID = config.getOrCreateBlockIdProperty("Mineral Ore", 3211).getInt(3211);
        mod_Orizon.mineralOreHighID = config.getOrCreateBlockIdProperty("Mineral Ore High", 3212).getInt(3212);
        mod_Orizon.mineralOreLow1ID = config.getOrCreateBlockIdProperty("Mineral Ore Medium", 3213).getInt(3213);
        mod_Orizon.mineralOreLow2ID = config.getOrCreateBlockIdProperty("Mineral Ore Low", 3214).getInt(3214);
        mod_Orizon.mineralOreLow3ID = config.getOrCreateBlockIdProperty("Mineral Ore Dark", 3215).getInt(3215);
        
        mod_Orizon.mineralOreAltID = config.getOrCreateBlockIdProperty("Mineral Ore Alt", 3216).getInt(3216);
        mod_Orizon.mineralOreAltHighID = config.getOrCreateBlockIdProperty("Mineral Ore Alt High", 3217).getInt(3217);
        mod_Orizon.mineralOreAltLow1ID = config.getOrCreateBlockIdProperty("Mineral Ore Alt Medium", 3218).getInt(3218);
        mod_Orizon.mineralOreAltLow2ID = config.getOrCreateBlockIdProperty("Mineral Ore Alt Low", 3219).getInt(3219);
        mod_Orizon.mineralOreAltLow3ID = config.getOrCreateBlockIdProperty("Mineral Ore Alt Dark", 3220).getInt(3220);
        
        mod_Orizon.gemOreID = config.getOrCreateBlockIdProperty("Gem Ore", 3221).getInt(3221);
        mod_Orizon.gemOreHighID = config.getOrCreateBlockIdProperty("Gem Ore High", 3222).getInt(3222);
        mod_Orizon.gemOreLow1ID = config.getOrCreateBlockIdProperty("Gem Ore Medium", 3223).getInt(3223);
        mod_Orizon.gemOreLow2ID = config.getOrCreateBlockIdProperty("Gem Ore Low", 3224).getInt(3224);
        mod_Orizon.gemOreLow3ID = config.getOrCreateBlockIdProperty("Gem Ore Dark", 3225).getInt(3225);
        
        mod_Orizon.cStoneID = config.getOrCreateBlockIdProperty("Colored Stone", 3226).getInt(3226);
        mod_Orizon.cCobbleID = config.getOrCreateBlockIdProperty("Colored Cobblestone", 3227).getInt(3227);
        mod_Orizon.cBrickID = config.getOrCreateBlockIdProperty("Colored Stone Brick", 3228).getInt(3228);
        mod_Orizon.cMossyID = config.getOrCreateBlockIdProperty("Colored Mossy Brick", 3229).getInt(3229);
        mod_Orizon.cCrackedID = config.getOrCreateBlockIdProperty("Colored Cracked Brick", 3230).getInt(3230);
        mod_Orizon.cTileID = config.getOrCreateBlockIdProperty("Colored Tiled Brick", 3231).getInt(3231);
        mod_Orizon.cFancyID = config.getOrCreateBlockIdProperty("Colored Fancy Brick", 3232).getInt(3232);
        mod_Orizon.cSquareID = config.getOrCreateBlockIdProperty("Colored Square Brick", 3233).getInt(3233);
        
        mod_Orizon.replaceOreID = config.getOrCreateBlockIdProperty("Replacement Ore", 3234).getInt(3234);
        mod_Orizon.replaceMetalID = config.getOrCreateBlockIdProperty("Replacement Metal Ore", 3235).getInt(3235);
        mod_Orizon.calciteOreID = config.getOrCreateBlockIdProperty("Calcite Ore", 3236).getInt(3236);
        mod_Orizon.netherOreID = config.getOrCreateBlockIdProperty("Nether Ore", 3237).getInt(3237);
        mod_Orizon.marbleID = config.getOrCreateBlockIdProperty("Marble", 3238).getInt(3238);
        mod_Orizon.slimeGelID = config.getOrCreateBlockIdProperty("Slime Gel", 3239).getInt(3239);
        mod_Orizon.slimePoolID = config.getOrCreateBlockIdProperty("Slime Pool IDs", 3240).getInt(3240);
        
        mod_Orizon.blueGrassID  = config.getOrCreateBlockIdProperty("Blue Grass", 3242).getInt(3242);
        mod_Orizon.blueDirtID  = config.getOrCreateBlockIdProperty("Blue Dirt", 3243).getInt(3243);
        
        mod_Orizon.ingotsID = config.getOrCreateIntProperty("Ingots", "item", 10998).getInt(10998);
        mod_Orizon.netherIngotsID = config.getOrCreateIntProperty("Nether Ingots", "item", 10999).getInt(10999);
        mod_Orizon.gemsID = config.getOrCreateIntProperty("Gems", "item", 11000).getInt(11000);
        
        mod_Orizon.copperSwordID = config.getOrCreateIntProperty("Copper Sword", "item", 11001).getInt(11001);
	    mod_Orizon.copperPickaxeID = config.getOrCreateIntProperty("Copper Pickaxe", "item", 11002).getInt(11002);
	    mod_Orizon.copperAxeID = config.getOrCreateIntProperty("Copper Axe", "item", 11003).getInt(11003);
	    mod_Orizon.copperShovelID = config.getOrCreateIntProperty("Copper Shovel", "item", 11004).getInt(11004);
	    mod_Orizon.copperHoeID = config.getOrCreateIntProperty("Copper Hoe", "item", 11005).getInt(11005);
	    mod_Orizon.bronzeSwordID = config.getOrCreateIntProperty("Bronze Sword", "item", 11006).getInt(11006);
	    mod_Orizon.bronzePickaxeID = config.getOrCreateIntProperty("Bronze Pickaxe", "item", 11007).getInt(11007);
	    mod_Orizon.bronzeAxeID = config.getOrCreateIntProperty("Bronze Axe", "item", 11008).getInt(11008);
	    mod_Orizon.bronzeShovelID = config.getOrCreateIntProperty("Bronze Shovel", "item", 11009).getInt(11009);
	    mod_Orizon.bronzeHoeID = config.getOrCreateIntProperty("Bronze Hoe", "item", 11010).getInt(11010);
	    mod_Orizon.refinedIronSwordID = config.getOrCreateIntProperty("Worked Iron Sword", "item", 11011).getInt(11011);
	    mod_Orizon.refinedIronPickaxeID = config.getOrCreateIntProperty("Worked Iron Pickaxe", "item", 11012).getInt(11012);
	    mod_Orizon.refinedIronAxeID = config.getOrCreateIntProperty("Worked Iron Axe", "item", 11013).getInt(11013);
	    mod_Orizon.refinedIronShovelID = config.getOrCreateIntProperty("Worked Iron Shovel", "item", 11014).getInt(11014);
	    mod_Orizon.refinedIronHoeID = config.getOrCreateIntProperty("Worked Iron Hoe", "item", 11015).getInt(11015);
	    mod_Orizon.steelSwordID = config.getOrCreateIntProperty("Steel Sword", "item", 11016).getInt(11016);
	    mod_Orizon.steelPickaxeID = config.getOrCreateIntProperty("Steel Pickaxe", "item", 11017).getInt(11017);
	    mod_Orizon.steelAxeID = config.getOrCreateIntProperty("Steel Axe", "item", 11018).getInt(11018);
	    mod_Orizon.steelShovelID = config.getOrCreateIntProperty("Steel Shovel", "item", 11019).getInt(11019);
	    mod_Orizon.steelHoeID = config.getOrCreateIntProperty("Steel Hoe", "item", 11020).getInt(11020);
	    mod_Orizon.cobaltSwordID = config.getOrCreateIntProperty("Cobalt Sword", "item", 11021).getInt(11021);
	    mod_Orizon.cobaltPickaxeID = config.getOrCreateIntProperty("Cobalt Pickaxe", "item", 11022).getInt(11022);
	    mod_Orizon.cobaltAxeID = config.getOrCreateIntProperty("Cobalt Axe", "item", 11023).getInt(11023);
	    mod_Orizon.cobaltShovelID = config.getOrCreateIntProperty("Cobalt Shovel", "item", 11024).getInt(11024);
	    mod_Orizon.cobaltHoeID = config.getOrCreateIntProperty("Cobalt Hoe", "item", 11025).getInt(11025);
	    mod_Orizon.arditeSwordID = config.getOrCreateIntProperty("Ardite Sword", "item", 11026).getInt(11026);
	    mod_Orizon.arditePickaxeID = config.getOrCreateIntProperty("Ardite Pickaxe", "item", 11027).getInt(11027);
	    mod_Orizon.arditeAxeID = config.getOrCreateIntProperty("Ardite Axe", "item", 11028).getInt(11028);
	    mod_Orizon.arditeShovelID = config.getOrCreateIntProperty("Ardite Shovel", "item", 11029).getInt(11029);
	    mod_Orizon.arditeHoeID = config.getOrCreateIntProperty("Ardite Hoe", "item", 11030).getInt(11030);
	    mod_Orizon.manyullynSwordID = config.getOrCreateIntProperty("Manyullyn Sword", "item", 11031).getInt(11031);
	    mod_Orizon.manyullynPickaxeID = config.getOrCreateIntProperty("Manyullyn Pickaxe", "item", 11032).getInt(11032);
	    mod_Orizon.manyullynAxeID = config.getOrCreateIntProperty("Manyullyn Axe", "item", 11033).getInt(11033);
	    mod_Orizon.manyullynShovelID = config.getOrCreateIntProperty("Manyullyn Shovel", "item", 11034).getInt(11034);
	    mod_Orizon.manyullynHoeID = config.getOrCreateIntProperty("Manyullyn Hoe", "item", 11035).getInt(11035);
	    
	    mod_Orizon.superfun = config.getOrCreateBooleanProperty("All the world is Superfun", "general", false).getBoolean(false);
        
	    mod_Orizon.genStratifiedStone = config.getOrCreateBooleanProperty("Generate Stratified Stone", "general", false).getBoolean(false);
		mod_Orizon.genColoredStone = config.getOrCreateBooleanProperty("Generate Colored Stone", "general", true).getBoolean(true);
		mod_Orizon.genCalcite = config.getOrCreateBooleanProperty("Generate Calcite and Calcite Ores", "general", false).getBoolean(false);
		mod_Orizon.genMarble = config.getOrCreateBooleanProperty("Generate Marble", "general", true).getBoolean(true);
		mod_Orizon.genNetherOre = config.getOrCreateBooleanProperty("Generate Nether Ores", "general", true).getBoolean(true);
		mod_Orizon.genSilt = config.getOrCreateBooleanProperty("Generate Silt", "general", true).getBoolean(true);
		mod_Orizon.redoVanillaOres = config.getOrCreateBooleanProperty("Metallurgy Style Spawn", "general", false).getBoolean(false);
		mod_Orizon.replaceOres = config.getOrCreateBooleanProperty("Replace Vanilla Ores", "general", false).getBoolean(false);
		mod_Orizon.genGems = config.getOrCreateBooleanProperty("Generate Gemstones", "general", false).getBoolean(false);
		mod_Orizon.genNonUniqueGems = config.getOrCreateBooleanProperty("Generate Ruby Emerald and Sapphire Gems", "general", false).getBoolean(false);
		mod_Orizon.genSlimePools = config.getOrCreateBooleanProperty("Generate Slime Pools", "general", true).getBoolean(true);
		//mod_Orizon.genAcidPools = config.getOrCreateBooleanProperty("Generate Acid Pools", "general", true).getBoolean(true);
		
		mod_Orizon.genCopper = config.getOrCreateBooleanProperty("Generate Copper Ore", "general", true).getBoolean(true);
		mod_Orizon.genTurquoise = config.getOrCreateBooleanProperty("Generate Turquoise Ore", "general", false).getBoolean(false);
		mod_Orizon.genChalcocite = config.getOrCreateBooleanProperty("Generate Chalcocite Ore", "general", false).getBoolean(false);
		mod_Orizon.genCassiterite = config.getOrCreateBooleanProperty("Generate Cassiterite Ore", "general", true).getBoolean(true);
		mod_Orizon.genTeallite = config.getOrCreateBooleanProperty("Generate Teallite Ore", "general", false).getBoolean(false);
		mod_Orizon.genZinc = config.getOrCreateBooleanProperty("Generate Zinc Bloom Ore", "general", false).getBoolean(false);
		mod_Orizon.genSphalerite = config.getOrCreateBooleanProperty("Generate Sphalerite Ore", "general", false).getBoolean(false);
		mod_Orizon.genCerussite = config.getOrCreateBooleanProperty("Generate Cerussite Ore", "general", false).getBoolean(false);
		mod_Orizon.genCobalt = config.getOrCreateBooleanProperty("Generate Cobalt Ore", "general", false).getBoolean(false);
		mod_Orizon.genArdite = config.getOrCreateBooleanProperty("Generate Ardite Ore", "general", false).getBoolean(false);
		mod_Orizon.genMyuvil = config.getOrCreateBooleanProperty("Generate Myuvil Ore", "general", false).getBoolean(false);
		mod_Orizon.genGalena = config.getOrCreateBooleanProperty("Generate Galena Ore", "general", false).getBoolean(false);
		mod_Orizon.genIvymetal = config.getOrCreateBooleanProperty("Generate Ivymetal Ore", "general", false).getBoolean(false);
		mod_Orizon.genAggregate = config.getOrCreateBooleanProperty("Generate Aggregate Ore", "general", false).getBoolean(false);
		
		mod_Orizon.copperRarity = config.getOrCreateIntProperty("Copper Rarity", "general", 6).getInt(6);
	    mod_Orizon.copperHeight = config.getOrCreateIntProperty("Copper Height", "general", 64).getInt(64);
	    mod_Orizon.turquoiseRarity = config.getOrCreateIntProperty("Turquoise Rarity", "general", 7).getInt(7);
	    mod_Orizon.turquoiseHeight = config.getOrCreateIntProperty("Turquoise Height", "general", 64).getInt(64);
	    mod_Orizon.chalcociteRarity = config.getOrCreateIntProperty("Chalcocite Rarity", "general", 3).getInt(3);
	    mod_Orizon.chalcociteHeight = config.getOrCreateIntProperty("Chalcocite Height", "general", 64).getInt(64);
	    mod_Orizon.cassiteriteRarity = config.getOrCreateIntProperty("Cassiterite Rarity", "general", 6).getInt(6);
	    mod_Orizon.cassiteriteHeight = config.getOrCreateIntProperty("Cassiterite Height", "general", 64).getInt(6);
	    mod_Orizon.tealliteRarity = config.getOrCreateIntProperty("Teallite Rarity", "general", 7).getInt(7);
	    mod_Orizon.tealliteHeight = config.getOrCreateIntProperty("Teallite Height", "general", 64).getInt(64);
	    mod_Orizon.zincBloomRarity = config.getOrCreateIntProperty("Zinc Bloom Rarity", "general", 6).getInt(6);
	    mod_Orizon.zincBloomHeight = config.getOrCreateIntProperty("Zinc Bloom Height", "general", 64).getInt(64);
	    mod_Orizon.sphaleriteRarity = config.getOrCreateIntProperty("Sphalerite Rarity", "general", 5).getInt(5);
	    mod_Orizon.sphaleriteHeight = config.getOrCreateIntProperty("Sphalerite Height", "general", 64).getInt(64);
	    mod_Orizon.cerussiteRarity = config.getOrCreateIntProperty("Cerussite Rarity", "general", 4).getInt(4);
	    mod_Orizon.cerussiteHeight = config.getOrCreateIntProperty("Cerussite Height", "general", 64).getInt(64);
	    mod_Orizon.cobaltRarity = config.getOrCreateIntProperty("Cobalt Rarity", "general", 3).getInt(3);
	    mod_Orizon.cobaltHeight = config.getOrCreateIntProperty("Cobalt Height", "general", 64).getInt(64);
	    mod_Orizon.arditeRarity = config.getOrCreateIntProperty("Ardite Rarity", "general", 3).getInt(3);
	    mod_Orizon.arditeHeight = config.getOrCreateIntProperty("Ardite Height", "general", 64).getInt(64);
	    mod_Orizon.myuvilRarity = config.getOrCreateIntProperty("Myuvil Rarity", "general", 2).getInt(2);
	    mod_Orizon.myuvilHeight = config.getOrCreateIntProperty("Myuvil Height", "general", 64).getInt(64);
	    mod_Orizon.galenaRarity = config.getOrCreateIntProperty("Galena Rarity", "general", 2).getInt(2);
	    mod_Orizon.galenaHeight = config.getOrCreateIntProperty("Galena Height", "general", 64).getInt(64);
	    mod_Orizon.ivymetalRarity = config.getOrCreateIntProperty("Ivymetal Rarity", "general", 1).getInt(1);
	    mod_Orizon.ivymetalHeight = config.getOrCreateIntProperty("Ivymetal Height", "general", 64).getInt(64);
	    mod_Orizon.aggregateRarity = config.getOrCreateIntProperty("Aggregate Rarity", "general", 2).getInt(2);
	    mod_Orizon.aggregateHeight = config.getOrCreateIntProperty("Aggregate Height", "general", 64).getInt(64);
	    
	    mod_Orizon.coalRarity = config.getOrCreateIntProperty("Coal Rarity", "general", 12).getInt(12);
	    mod_Orizon.coalHeight = config.getOrCreateIntProperty("Coal Height", "general", 64).getInt(64); 
	    mod_Orizon.ironRarity = config.getOrCreateIntProperty("Iron Rarity", "general", 12).getInt(12);
	    mod_Orizon.ironHeight = config.getOrCreateIntProperty("Iron Height", "general", 64).getInt(64); 
	    mod_Orizon.goldRarity = config.getOrCreateIntProperty("Gold Rarity", "general", 3).getInt(3);
	    mod_Orizon.goldHeight = config.getOrCreateIntProperty("Gold Height", "general", 64).getInt(64); 
	    mod_Orizon.diamondRarity = config.getOrCreateIntProperty("Diamond Rarity", "general", 1).getInt(1);
	    mod_Orizon.diamondHeight = config.getOrCreateIntProperty("Diamond Height", "general", 64).getInt(64); 
	    mod_Orizon.lapisRarity = config.getOrCreateIntProperty("Lapis Rarity", "general", 2).getInt(2);
	    mod_Orizon.lapisHeight = config.getOrCreateIntProperty("Lapis Height", "general", 64).getInt(64); 
	    mod_Orizon.redstoneRarity = config.getOrCreateIntProperty("Redstone Rarity", "general", 4).getInt(4);
	    mod_Orizon.redstoneHeight = config.getOrCreateIntProperty("Redstone Height", "general", 64).getInt(64);
	    
	    mod_Orizon.bloodbiteRarity = config.getOrCreateIntProperty("Bloodbite Rarity", "general", 13).getInt(13);
	    mod_Orizon.bloodbiteHeight = config.getOrCreateIntProperty("Bloodbite Height", "general", 64).getInt(64);
	    mod_Orizon.grudgestoneRarity = config.getOrCreateIntProperty("Grudgestone Rarity", "general", 12).getInt(12);
	    mod_Orizon.grudgestoneHeight = config.getOrCreateIntProperty("Grudgestone Height", "general", 64).getInt(64);
	    mod_Orizon.wistfulRarity = config.getOrCreateIntProperty("Wistful Ore Rarity", "general", 10).getInt(10);
	    mod_Orizon.wistfulHeight = config.getOrCreateIntProperty("Wistful Ore Height", "general", 64).getInt(64);
	    mod_Orizon.flamelashRarity = config.getOrCreateIntProperty("Flamelash Rarity", "general", 7).getInt(7);
	    mod_Orizon.flamelashHeight = config.getOrCreateIntProperty("Flamelash Height", "general", 64).getInt(64);
	    mod_Orizon.tearsRarity = config.getOrCreateIntProperty("Hardened Teardrop Rarity", "general", 8).getInt(8);
	    mod_Orizon.tearsHeight = config.getOrCreateIntProperty("Hardened Teardrop Height", "general", 64).getInt(64);
	    mod_Orizon.netherGoldRarity = config.getOrCreateIntProperty("Nether Gold Rarity", "general", 10).getInt(10);
	    mod_Orizon.netherGoldHeight = config.getOrCreateIntProperty("Nether Gold Height", "general", 64).getInt(64);
	    
	    mod_Orizon.rubyRarity = config.getOrCreateIntProperty("Ruby Rarity", "general", 2).getInt(2);
	    mod_Orizon.rubyHeight = config.getOrCreateIntProperty("Ruby Height", "general", 64).getInt(64);
	    mod_Orizon.emeraldRarity = config.getOrCreateIntProperty("Emerald Rarity", "general", 2).getInt(2);
	    mod_Orizon.emeraldHeight = config.getOrCreateIntProperty("Emerald Height", "general", 64).getInt(64);
	    mod_Orizon.sapphireRarity = config.getOrCreateIntProperty("Sapphire Rarity", "general", 2).getInt(2);
	    mod_Orizon.sapphireHeight = config.getOrCreateIntProperty("Sapphire Height", "general", 64).getInt(64);
	    mod_Orizon.topazRarity = config.getOrCreateIntProperty("Topaz Rarity", "general", 2).getInt(2);
	    mod_Orizon.topazHeight = config.getOrCreateIntProperty("Topaz Height", "general", 64).getInt(64);
	    mod_Orizon.amethystRarity = config.getOrCreateIntProperty("Amethyst Rarity", "general", 2).getInt(2);
	    mod_Orizon.amethystHeight = config.getOrCreateIntProperty("Amethyst Height", "general", 64).getInt(64);
	    mod_Orizon.quartzRarity = config.getOrCreateIntProperty("Quartz Rarity", "general", 2).getInt(2);
	    mod_Orizon.quartzHeight = config.getOrCreateIntProperty("Quartz Height", "general", 64).getInt(64);
	    mod_Orizon.roseQuartzRarity = config.getOrCreateIntProperty("Rose Quartz Rarity", "general", 2).getInt(2);
	    mod_Orizon.roseQuartzHeight = config.getOrCreateIntProperty("Rose Quartz Height", "general", 64).getInt(64);
	    mod_Orizon.rockCrystalRarity = config.getOrCreateIntProperty("Rock Crystal Rarity", "general", 2).getInt(2);
	    mod_Orizon.rockCrystalHeight = config.getOrCreateIntProperty("Rock Crystal Height", "general", 64).getInt(64);
	    
	    mod_Orizon.marbleRarity = config.getOrCreateIntProperty("Marble Rarity", "general", 22).getInt(22);
	    mod_Orizon.marbleHeight = config.getOrCreateIntProperty("Marble Height", "general", 64).getInt(64);
	    mod_Orizon.siltRarity = config.getOrCreateIntProperty("Silt Rarity", "general", 22).getInt(22);
	    mod_Orizon.siltHeight = config.getOrCreateIntProperty("Silt Height", "general", 64).getInt(64);
	    mod_Orizon.siltstoneRarity = config.getOrCreateIntProperty("Siltstone Rarity", "general", 22).getInt(22);
	    mod_Orizon.siltstoneHeight = config.getOrCreateIntProperty("Siltstone Height", "general", 64).getInt(64);
	    
	    mod_Orizon.slimePoolRarity = config.getOrCreateIntProperty("Slime Pool Rarity", "general", 30).getInt(30);
	    mod_Orizon.slimePoolHeight = config.getOrCreateIntProperty("Slime Pool Height", "general", 64).getInt(64);
	    
		dimensiongenCalcite = config.getOrCreateBooleanProperty("Dimension Generate Calcite and Calcite Ores", "general", true).getBoolean(true);
		dimensiongenMarble = config.getOrCreateBooleanProperty("Dimension Generate Marble", "general", true).getBoolean(true);
		dimensiongenGems = config.getOrCreateBooleanProperty("Dimension Generate Gemstones", "general", true).getBoolean(true);
		dimensiongenNonUniqueGems = config.getOrCreateBooleanProperty("Dimension Generate Ruby Emerald and Sapphire Gems", "general", true).getBoolean(true);
		dimensiongenSlimePools = config.getOrCreateBooleanProperty("Dimension Generate Slime Pools", "general", true).getBoolean(true);
		//dimensiongenAcidPools = config.getOrCreateBooleanProperty("Generate Acid Pools", "general", true).getBoolean(true);
		
		dimensiongenCopper = config.getOrCreateBooleanProperty("Dimension Generate Copper Ore", "general", true).getBoolean(true);
		dimensiongenTurquoise = config.getOrCreateBooleanProperty("Dimension Generate Turquoise Ore", "general", true).getBoolean(true);
		dimensiongenChalcocite = config.getOrCreateBooleanProperty("Dimension Generate Chalcocite Ore", "general", true).getBoolean(true);
		dimensiongenCassiterite = config.getOrCreateBooleanProperty("Dimension Generate Cassiterite Ore", "general", true).getBoolean(true);
		dimensiongenTeallite = config.getOrCreateBooleanProperty("Dimension Generate Teallite Ore", "general", true).getBoolean(true);
		dimensiongenZinc = config.getOrCreateBooleanProperty("Dimension Generate Zinc Bloom Ore", "general", true).getBoolean(true);
		dimensiongenSphalerite = config.getOrCreateBooleanProperty("Dimension enerate Sphalerite Ore", "general", true).getBoolean(true);
		dimensiongenCerussite = config.getOrCreateBooleanProperty("Dimension Generate Cerussite Ore", "general", true).getBoolean(true);
		dimensiongenCobalt = config.getOrCreateBooleanProperty("Dimension Generate Cobalt Ore", "general", true).getBoolean(true);
		dimensiongenArdite = config.getOrCreateBooleanProperty("Dimension Generate Ardite Ore", "general", true).getBoolean(true);
		dimensiongenMyuvil = config.getOrCreateBooleanProperty("Dimension Generate Myuvil Ore", "general", true).getBoolean(true);
		dimensiongenGalena = config.getOrCreateBooleanProperty("Dimension Generate Galena Ore", "general", true).getBoolean(true);
		dimensiongenIvymetal = config.getOrCreateBooleanProperty("Dimension Generate Ivymetal Ore", "general", true).getBoolean(true);
		dimensiongenAggregate = config.getOrCreateBooleanProperty("Dimension Generate Aggregate Ore", "general", true).getBoolean(true);
		
		dimensioncopperRarity = config.getOrCreateIntProperty("Dimension Copper Rarity", "general", 6).getInt(6);
	    dimensioncopperHeight = config.getOrCreateIntProperty("Dimension Copper Height", "general", 100).getInt(100);
	    dimensionturquoiseRarity = config.getOrCreateIntProperty("Dimension Turquoise Rarity", "general", 7).getInt(7);
	    dimensionturquoiseHeight = config.getOrCreateIntProperty("Dimension Turquoise Height", "general", 100).getInt(100);
	    dimensionchalcociteRarity = config.getOrCreateIntProperty("Dimension Chalcocite Rarity", "general", 3).getInt(3);
	    dimensionchalcociteHeight = config.getOrCreateIntProperty("Dimension Chalcocite Height", "general", 100).getInt(100);
	    dimensioncassiteriteRarity = config.getOrCreateIntProperty("Dimension Cassiterite Rarity", "general", 6).getInt(6);
	    dimensioncassiteriteHeight = config.getOrCreateIntProperty("Dimension Cassiterite Height", "general", 100).getInt(6);
	    dimensiontealliteRarity = config.getOrCreateIntProperty("Dimension Teallite Rarity", "general", 7).getInt(7);
	    dimensiontealliteHeight = config.getOrCreateIntProperty("Dimension Teallite Height", "general", 100).getInt(100);
	    dimensionzincBloomRarity = config.getOrCreateIntProperty("Dimension Zinc Bloom Rarity", "general", 6).getInt(6);
	    dimensionzincBloomHeight = config.getOrCreateIntProperty("Dimension Zinc Bloom Height", "general", 100).getInt(100);
	    dimensionsphaleriteRarity = config.getOrCreateIntProperty("Dimension Sphalerite Rarity", "general", 5).getInt(5);
	    dimensionsphaleriteHeight = config.getOrCreateIntProperty("Dimension Sphalerite Height", "general", 100).getInt(100);
	    dimensioncerussiteRarity = config.getOrCreateIntProperty("Dimension Cerussite Rarity", "general", 4).getInt(4);
	    dimensioncerussiteHeight = config.getOrCreateIntProperty("Dimension Cerussite Height", "general", 100).getInt(100);
	    dimensioncobaltRarity = config.getOrCreateIntProperty("Dimension Cobalt Rarity", "general", 3).getInt(3);
	    dimensioncobaltHeight = config.getOrCreateIntProperty("Dimension Cobalt Height", "general", 100).getInt(100);
	    dimensionarditeRarity = config.getOrCreateIntProperty("Dimension Ardite Rarity", "general", 3).getInt(3);
	    dimensionarditeHeight = config.getOrCreateIntProperty("Dimension Ardite Height", "general", 100).getInt(100);
	    dimensionmyuvilRarity = config.getOrCreateIntProperty("Dimension Myuvil Rarity", "general", 2).getInt(2);
	    dimensionmyuvilHeight = config.getOrCreateIntProperty("Dimension Myuvil Height", "general", 100).getInt(100);
	    dimensiongalenaRarity = config.getOrCreateIntProperty("Dimension Galena Rarity", "general", 2).getInt(2);
	    dimensiongalenaHeight = config.getOrCreateIntProperty("Dimension Galena Height", "general", 100).getInt(100);
	    dimensionivymetalRarity = config.getOrCreateIntProperty("Dimension Ivymetal Rarity", "general", 1).getInt(1);
	    dimensionivymetalHeight = config.getOrCreateIntProperty("Dimension Ivymetal Height", "general", 100).getInt(100);
	    dimensionaggregateRarity = config.getOrCreateIntProperty("Dimension Aggregate Rarity", "general", 2).getInt(2);
	    dimensionaggregateHeight = config.getOrCreateIntProperty("Dimension Aggregate Height", "general", 100).getInt(100);
	    
	    dimensioncoalRarity = config.getOrCreateIntProperty("Dimension Coal Rarity", "general", 12).getInt(12);
	    dimensioncoalHeight = config.getOrCreateIntProperty("Dimension Coal Height", "general", 100).getInt(100); 
	    dimensionironRarity = config.getOrCreateIntProperty("Dimension Iron Rarity", "general", 12).getInt(12);
	    dimensionironHeight = config.getOrCreateIntProperty("Dimension Iron Height", "general", 100).getInt(100); 
	    dimensiongoldRarity = config.getOrCreateIntProperty("Dimension Gold Rarity", "general", 3).getInt(3);
	    dimensiongoldHeight = config.getOrCreateIntProperty("Dimension Gold Height", "general", 100).getInt(100); 
	    dimensiondiamondRarity = config.getOrCreateIntProperty("Dimension Diamond Rarity", "general", 1).getInt(1);
	    dimensiondiamondHeight = config.getOrCreateIntProperty("Dimension Diamond Height", "general", 100).getInt(100); 
	    dimensionlapisRarity = config.getOrCreateIntProperty("Dimension Lapis Rarity", "general", 2).getInt(2);
	    dimensionlapisHeight = config.getOrCreateIntProperty("Dimension Lapis Height", "general", 100).getInt(100); 
	    dimensionredstoneRarity = config.getOrCreateIntProperty("Dimension Redstone Rarity", "general", 4).getInt(4);
	    dimensionredstoneHeight = config.getOrCreateIntProperty("Dimension Redstone Height", "general", 100).getInt(100);
	    
	    dimensionrubyRarity = config.getOrCreateIntProperty("Dimension Ruby Rarity", "general", 2).getInt(2);
	    dimensionrubyHeight = config.getOrCreateIntProperty("Dimension Ruby Height", "general", 100).getInt(100);
	    dimensionemeraldRarity = config.getOrCreateIntProperty("Dimension Emerald Rarity", "general", 2).getInt(2);
	    dimensionemeraldHeight = config.getOrCreateIntProperty("Dimension Emerald Height", "general", 100).getInt(100);
	    dimensionsapphireRarity = config.getOrCreateIntProperty("Dimension Sapphire Rarity", "general", 2).getInt(2);
	    dimensionsapphireHeight = config.getOrCreateIntProperty("Dimension Sapphire Height", "general", 100).getInt(100);
	    dimensiontopazRarity = config.getOrCreateIntProperty("Dimension Topaz Rarity", "general", 2).getInt(2);
	    dimensiontopazHeight = config.getOrCreateIntProperty("Dimension Topaz Height", "general", 100).getInt(100);
	    dimensionamethystRarity = config.getOrCreateIntProperty("Dimension Amethyst Rarity", "general", 2).getInt(2);
	    dimensionamethystHeight = config.getOrCreateIntProperty("Dimension Amethyst Height", "general", 100).getInt(100);
	    dimensionquartzRarity = config.getOrCreateIntProperty("Dimension Quartz Rarity", "general", 2).getInt(2);
	    dimensionquartzHeight = config.getOrCreateIntProperty("Dimension Quartz Height", "general", 100).getInt(100);
	    dimensionroseQuartzRarity = config.getOrCreateIntProperty("Dimension Rose Quartz Rarity", "general", 2).getInt(2);
	    dimensionroseQuartzHeight = config.getOrCreateIntProperty("Dimension Rose Quartz Height", "general", 100).getInt(100);
	    dimensionrockCrystalRarity = config.getOrCreateIntProperty("Dimension Rock Crystal Rarity", "general", 2).getInt(2);
	    dimensionrockCrystalHeight = config.getOrCreateIntProperty("Dimension Rock Crystal Height", "general", 100).getInt(100);
	    
	    dimensionmarbleRarity = config.getOrCreateIntProperty("Dimension Marble Rarity", "general", 22).getInt(22);
	    dimensionmarbleHeight = config.getOrCreateIntProperty("Dimension Marble Height", "general", 100).getInt(100);
	    dimensionsiltRarity = config.getOrCreateIntProperty("Dimension Silt Rarity", "general", 22).getInt(22);
	    dimensionsiltHeight = config.getOrCreateIntProperty("Dimension Silt Height", "general", 100).getInt(100);
	    dimensionsiltstoneRarity = config.getOrCreateIntProperty("Dimension Siltstone Rarity", "general", 22).getInt(22);
	    dimensionsiltstoneHeight = config.getOrCreateIntProperty("Dimension Siltstone Height", "general", 100).getInt(100);
	    
	    dimensionSlimePoolRarity = config.getOrCreateIntProperty("Dimension Slime Pool Rarity", "general", 30).getInt(30);
	    dimensionSlimePoolHeight = config.getOrCreateIntProperty("Dimension Slime Pool Height", "general", 100).getInt(100);

        /* Save the configuration file */
        config.save();
    }
    
    public static boolean dimensiongenCopper;
    public static boolean dimensiongenTurquoise;
    public static boolean dimensiongenChalcocite;
    public static boolean dimensiongenCassiterite;
    public static boolean dimensiongenTeallite;
    public static boolean dimensiongenZinc;
    public static boolean dimensiongenSphalerite;
    public static boolean dimensiongenCerussite;
    public static boolean dimensiongenCobalt;
    public static boolean dimensiongenArdite;
    public static boolean dimensiongenMyuvil;
    public static boolean dimensiongenGalena;
    public static boolean dimensiongenIvymetal;
    public static boolean dimensiongenAggregate;
    
    public static boolean dimensiongenSlimePools;
    public static int dimensionSlimePoolRarity;
    public static int dimensionSlimePoolHeight;
    
    public static boolean dimensiongenAcidPools;
    public static int dimensionacidPoolRarity;
    public static int dimensionacidPoolHeight;
    
    public static int dimensioncopperRarity;
    public static int dimensioncopperHeight;
    public static int dimensionturquoiseRarity;
    public static int dimensionturquoiseHeight;
    public static int dimensionchalcociteRarity;
    public static int dimensionchalcociteHeight;
    public static int dimensioncassiteriteRarity;
    public static int dimensioncassiteriteHeight;
    public static int dimensiontealliteRarity;
    public static int dimensiontealliteHeight;
    public static int dimensionzincBloomRarity;
    public static int dimensionzincBloomHeight;
    public static int dimensionsphaleriteRarity;
    public static int dimensionsphaleriteHeight;
    public static int dimensioncerussiteRarity;
    public static int dimensioncerussiteHeight;
    public static int dimensioncobaltRarity;
    public static int dimensioncobaltHeight;
    public static int dimensionarditeRarity;
    public static int dimensionarditeHeight;
    public static int dimensionmyuvilRarity;
    public static int dimensionmyuvilHeight;
    public static int dimensiongalenaRarity;
    public static int dimensiongalenaHeight;
    public static int dimensionivymetalRarity;
    public static int dimensionivymetalHeight;
    public static int dimensionaggregateRarity;
    public static int dimensionaggregateHeight;
    
    public static int dimensioncoalRarity;
    public static int dimensioncoalHeight;
    public static int dimensionironRarity;
    public static int dimensionironHeight;
    public static int dimensiongoldRarity;
    public static int dimensiongoldHeight;
    public static int dimensiondiamondRarity;
    public static int dimensiondiamondHeight;
    public static int dimensionlapisRarity;
    public static int dimensionlapisHeight;
    public static int dimensionredstoneRarity;
    public static int dimensionredstoneHeight;
    
    public static int dimensionrubyRarity;
    public static int dimensionrubyHeight;
    public static int dimensionemeraldRarity;
    public static int dimensionemeraldHeight;
    public static int dimensionsapphireRarity;
    public static int dimensionsapphireHeight;
    public static int dimensionamethystRarity;
    public static int dimensionamethystHeight;
    public static int dimensiontopazRarity;
    public static int dimensiontopazHeight;
    public static int dimensionquartzRarity;
    public static int dimensionquartzHeight;
    public static int dimensionroseQuartzRarity;
    public static int dimensionroseQuartzHeight;
    public static int dimensionrockCrystalRarity;
    public static int dimensionrockCrystalHeight;
    
    public static int dimensionmarbleRarity;
    public static int dimensionmarbleHeight;
    public static int dimensionsiltRarity;
    public static int dimensionsiltHeight;
    public static int dimensionsiltstoneRarity;
    public static int dimensionsiltstoneHeight;
    
    public static int dimensionbloodbiteRarity;
    public static int dimensionbloodbiteHeight;
    public static int dimensiongrudgestoneRarity;
    public static int dimensiongrudgestoneHeight;
    public static int dimensionwistfulRarity;
    public static int dimensionwistfulHeight;
    public static int dimensionflamelashRarity;
    public static int dimensionflamelashHeight;
    public static int dimensiontearsRarity;
    public static int dimensiontearsHeight;
    public static int dimensionnetherGoldRarity;
    public static int dimensionnetherGoldHeight;
    
    public static boolean dimensiongenStratifiedStone;
    public static boolean dimensiongenColoredStone;
    public static boolean dimensiongenCalcite;
    public static boolean dimensiongenMarble;
    public static boolean dimensiongenNetherOre;
    public static boolean dimensiongenSilt;
    public static boolean redoVanillaOres;
    public static boolean replaceOres;
    public static boolean dimensiongenGems;
    public static boolean dimensiongenNonUniqueGems;
    public static boolean flatBedrock;
}