package net.minecraft.src.orizon;
import java.io.File;
import java.io.IOException;

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

        File file = new File("./config/InfiCraft");
        file.mkdir();
        File newFile = new File("./config/InfiCraft/Orizon.txt");

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
        
        mod_Orizon.mineralOreID = config.getOrCreateBlockIdProperty("Mineral Ore", 131).getInt(131);
        mod_Orizon.mineralOreHighID = config.getOrCreateBlockIdProperty("Mineral Ore High", 132).getInt(132);
        mod_Orizon.mineralOreLow1ID = config.getOrCreateBlockIdProperty("Mineral Ore Medium", 133).getInt(133);
        mod_Orizon.mineralOreLow2ID = config.getOrCreateBlockIdProperty("Mineral Ore Low", 134).getInt(134);
        mod_Orizon.mineralOreLow3ID = config.getOrCreateBlockIdProperty("Mineral Ore Dark", 135).getInt(135);
        
        mod_Orizon.mineralOreAltID = config.getOrCreateBlockIdProperty("Mineral Ore Alt", 136).getInt(136);
        mod_Orizon.mineralOreAltHighID = config.getOrCreateBlockIdProperty("Mineral Ore Alt High", 137).getInt(137);
        mod_Orizon.mineralOreAltLow1ID = config.getOrCreateBlockIdProperty("Mineral Ore Alt Medium", 138).getInt(138);
        mod_Orizon.mineralOreAltLow2ID = config.getOrCreateBlockIdProperty("Mineral Ore Alt Low", 139).getInt(139);
        mod_Orizon.mineralOreAltLow3ID = config.getOrCreateBlockIdProperty("Mineral Ore Alt Dark", 140).getInt(140);
        
        mod_Orizon.gemOreID = config.getOrCreateBlockIdProperty("Gem Ore", 141).getInt(141);
        mod_Orizon.gemOreHighID = config.getOrCreateBlockIdProperty("Gem Ore High", 142).getInt(142);
        mod_Orizon.gemOreLow1ID = config.getOrCreateBlockIdProperty("Gem Ore Medium", 143).getInt(143);
        mod_Orizon.gemOreLow2ID = config.getOrCreateBlockIdProperty("Gem Ore Low", 144).getInt(144);
        mod_Orizon.gemOreLow3ID = config.getOrCreateBlockIdProperty("Gem Ore Dark", 145).getInt(145);
        
        mod_Orizon.cStoneID = config.getOrCreateBlockIdProperty("Colored Stone", 146).getInt(146);
        mod_Orizon.cCobbleID = config.getOrCreateBlockIdProperty("Colored Cobblestone", 147).getInt(147);
        mod_Orizon.cBrickID = config.getOrCreateBlockIdProperty("Colored Stone Brick", 148).getInt(148);
        mod_Orizon.cMossyID = config.getOrCreateBlockIdProperty("Colored Mossy Brick", 149).getInt(149);
        mod_Orizon.cCrackedID = config.getOrCreateBlockIdProperty("Colored Cracked Brick", 150).getInt(150);
        mod_Orizon.cTileID = config.getOrCreateBlockIdProperty("Colored Tiled Brick", 151).getInt(151);
        mod_Orizon.cFancyID = config.getOrCreateBlockIdProperty("Colored Fancy Brick", 152).getInt(152);
        mod_Orizon.cSquareID = config.getOrCreateBlockIdProperty("Colored Square Brick", 153).getInt(153);
        
        mod_Orizon.replaceOreID = config.getOrCreateBlockIdProperty("Replacement Ore", 154).getInt(154);
        mod_Orizon.replaceMetalID = config.getOrCreateBlockIdProperty("Replacement Metal Ore", 155).getInt(155);
        mod_Orizon.calciteOreID = config.getOrCreateBlockIdProperty("Calcite Ore", 156).getInt(156);
        mod_Orizon.netherOreID = config.getOrCreateBlockIdProperty("Nether Ore", 157).getInt(157);
        mod_Orizon.marbleID = config.getOrCreateBlockIdProperty("Marble", 158).getInt(158);
        mod_Orizon.slimePoolID = config.getOrCreateBlockIdProperty("Slime Pool IDs", 159).getInt(159);        
        mod_Orizon.slimeGelID = config.getOrCreateBlockIdProperty("Slime Gel", 161).getInt(161);
        
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
        
	    mod_Orizon.genStratifiedStone = config.getOrCreateBooleanProperty("Generate Stratified Stone", "general", true).getBoolean(true);
		mod_Orizon.genColoredStone = config.getOrCreateBooleanProperty("Generate Colored Stone", "general", true).getBoolean(true);
		mod_Orizon.genCalcite = config.getOrCreateBooleanProperty("Generate Calcite and Calcite Ores", "general", true).getBoolean(true);
		mod_Orizon.genMarble = config.getOrCreateBooleanProperty("Generate Marble", "general", true).getBoolean(true);
		mod_Orizon.genNetherOre = config.getOrCreateBooleanProperty("Generate Nether Ores", "general", true).getBoolean(true);
		mod_Orizon.genSilt = config.getOrCreateBooleanProperty("Generate Silt", "general", true).getBoolean(true);
		mod_Orizon.redoVanillaOres = config.getOrCreateBooleanProperty("Metallurgy Style Spawn", "general", true).getBoolean(true);
		mod_Orizon.replaceOres = config.getOrCreateBooleanProperty("Replace Vanilla Ores", "general", true).getBoolean(true);
		mod_Orizon.genGems = config.getOrCreateBooleanProperty("Generate Gemstones", "general", true).getBoolean(true);
		mod_Orizon.genNonUniqueGems = config.getOrCreateBooleanProperty("Generate Ruby Emerald and Sapphire Gems", "general", true).getBoolean(true);
		mod_Orizon.genSlimePools = config.getOrCreateBooleanProperty("Generate Slime Pools", "general", true).getBoolean(true);
		//mod_Orizon.genAcidPools = config.getOrCreateBooleanProperty("Generate Acid Pools", "general", true).getBoolean(true);
		
		mod_Orizon.genCopper = config.getOrCreateBooleanProperty("Generate Copper Ore", "general", true).getBoolean(true);
		mod_Orizon.genTurquoise = config.getOrCreateBooleanProperty("Generate Turquoise Ore", "general", true).getBoolean(true);
		mod_Orizon.genChalcocite = config.getOrCreateBooleanProperty("Generate Chalcocite Ore", "general", true).getBoolean(true);
		mod_Orizon.genCassiterite = config.getOrCreateBooleanProperty("Generate Cassiterite Ore", "general", true).getBoolean(true);
		mod_Orizon.genTeallite = config.getOrCreateBooleanProperty("Generate Teallite Ore", "general", true).getBoolean(true);
		mod_Orizon.genZinc = config.getOrCreateBooleanProperty("Generate Zinc Bloom Ore", "general", true).getBoolean(true);
		mod_Orizon.genSphalerite = config.getOrCreateBooleanProperty("Generate Sphalerite Ore", "general", true).getBoolean(true);
		mod_Orizon.genCerussite = config.getOrCreateBooleanProperty("Generate Cerussite Ore", "general", true).getBoolean(true);
		mod_Orizon.genCobalt = config.getOrCreateBooleanProperty("Generate Cobalt Ore", "general", true).getBoolean(true);
		mod_Orizon.genArdite = config.getOrCreateBooleanProperty("Generate Ardite Ore", "general", true).getBoolean(true);
		mod_Orizon.genMyuvil = config.getOrCreateBooleanProperty("Generate Myuvil Ore", "general", true).getBoolean(true);
		mod_Orizon.genGalena = config.getOrCreateBooleanProperty("Generate Galena Ore", "general", true).getBoolean(true);
		mod_Orizon.genIvymetal = config.getOrCreateBooleanProperty("Generate Ivymetal Ore", "general", true).getBoolean(true);
		mod_Orizon.genAggregate = config.getOrCreateBooleanProperty("Generate Aggregate Ore", "general", true).getBoolean(true);
		
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
        
        //mod_Orizon.corruptionSpeed = config.getOrCreateIntProperty("Corruption Speed", "general", 5).getInt(5);

        /* Save the configuration file */
        config.save();
    }
}