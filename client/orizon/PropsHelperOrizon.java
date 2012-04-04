package net.minecraft.src.orizon;
import net.minecraft.src.*;

public class PropsHelperOrizon {

	public PropsHelperOrizon() { }
	
	public static InfiProps getProps(InfiProps infiprops)
	{
		mod_Orizon.resolveConflicts = infiprops.readBoolean("Automatically Resolve ID conflicts");
		
		mod_Orizon.mineralOreID = infiprops.readInt("Mineral Ore ID");
		mod_Orizon.mineralOreHighID = infiprops.readInt("Mineral Ore High ID");
		mod_Orizon.mineralOreLow1ID = infiprops.readInt("Mineral Ore Medium ID");
		mod_Orizon.mineralOreLow2ID = infiprops.readInt("Mineral Ore Low ID");
		mod_Orizon.mineralOreLow3ID = infiprops.readInt("Mineral Ore Dark ID");
		
		mod_Orizon.mineralOreAltID = infiprops.readInt("Mineral Ore Alt ID");
		mod_Orizon.mineralOreAltHighID = infiprops.readInt("Mineral Ore Alt High ID");
		mod_Orizon.mineralOreAltLow1ID = infiprops.readInt("Mineral Ore Alt Medium ID");
		mod_Orizon.mineralOreAltLow2ID = infiprops.readInt("Mineral Ore Alt Low ID");
		mod_Orizon.mineralOreAltLow3ID = infiprops.readInt("Mineral Ore Alt Dark ID");
		
		mod_Orizon.gemOreID = infiprops.readInt("Gem Ore ID");
		mod_Orizon.gemOreHighID = infiprops.readInt("Gem Ore High ID");
		mod_Orizon.gemOreLow1ID = infiprops.readInt("Gem Ore Medium ID");
		mod_Orizon.gemOreLow2ID = infiprops.readInt("Gem Ore Low ID");
		mod_Orizon.gemOreLow3ID = infiprops.readInt("Gem Ore Dark ID");
		
		mod_Orizon.cStoneID = infiprops.readInt("Colored Stone ID");
		mod_Orizon.cCobbleID = infiprops.readInt("Colored Cobblestone ID");
		mod_Orizon.cBrickID = infiprops.readInt("Colored Brick ID");
		mod_Orizon.cMossyID = infiprops.readInt("Colored Mossy Brick ID");
		mod_Orizon.cCrackedID = infiprops.readInt("Colored Cracked Brick ID");
		mod_Orizon.cTileID = infiprops.readInt("Colored Brick Tile ID");
		mod_Orizon.cFancyID = infiprops.readInt("Colored Fancy Brick ID");
		mod_Orizon.cSquareID = infiprops.readInt("Colored Square Brick ID");
		
		mod_Orizon.calciteOreID = infiprops.readInt("Calcite Ore ID");
		mod_Orizon.netherOreID = infiprops.readInt("Nether Ore ID");
		
		mod_Orizon.replaceOreID = infiprops.readInt("Replacement Ore ID");
		mod_Orizon.replaceMetalID = infiprops.readInt("Replacement Metal Ore ID");
		
		mod_Orizon.marbleID = infiprops.readInt("Marble ID");
		
		mod_Orizon.slimePoolID = infiprops.readInt("Slime Pool IDs");
		mod_Orizon.slimeGelID = infiprops.readInt("Slime Gel ID");
		//mod_Orizon.acidPoolID = infiprops.readInt("Acid Pool IDs");
		
		/*mod_Orizon.siltID = infiprops.readInt("Silt ID");
		mod_Orizon.siltstoneID = infiprops.readInt("Siltstone ID");*/
		
		mod_Orizon.ingotsID = infiprops.accessInt("Ingots ID", 10998);
	    mod_Orizon.netherIngotsID = infiprops.accessInt("Nether Ingots ID", 10999);
	    mod_Orizon.gemsID = infiprops.accessInt("Gems ID", 11000);
		
		mod_Orizon.copperSwordID = infiprops.accessInt("Copper Sword", 11001);
	    mod_Orizon.copperPickaxeID = infiprops.accessInt("Copper Pickaxe", 11002);
	    mod_Orizon.copperAxeID = infiprops.accessInt("Copper Axe", 11003);
	    mod_Orizon.copperShovelID = infiprops.accessInt("Copper Shovel", 11004);
	    mod_Orizon.copperHoeID = infiprops.accessInt("Copper Hoe", 11005);
	    mod_Orizon.bronzeSwordID = infiprops.accessInt("Bronze Sword", 11006);
	    mod_Orizon.bronzePickaxeID = infiprops.accessInt("Bronze Pickaxe", 11007);
	    mod_Orizon.bronzeAxeID = infiprops.accessInt("Bronze Axe", 11008);
	    mod_Orizon.bronzeShovelID = infiprops.accessInt("Bronze Shovel", 11009);
	    mod_Orizon.bronzeHoeID = infiprops.accessInt("Bronze Hoe", 11010);
	    mod_Orizon.refinedIronSwordID = infiprops.accessInt("Refined Iron Sword", 11011);
	    mod_Orizon.refinedIronPickaxeID = infiprops.accessInt("Refined Iron Pickaxe", 11012);
	    mod_Orizon.refinedIronAxeID = infiprops.accessInt("Refined Iron Axe", 11013);
	    mod_Orizon.refinedIronShovelID = infiprops.accessInt("Refined Iron Shovel", 11014);
	    mod_Orizon.refinedIronHoeID = infiprops.accessInt("Refined Iron Hoe", 11015);
	    mod_Orizon.steelSwordID = infiprops.accessInt("Steel Sword", 11016);
	    mod_Orizon.steelPickaxeID = infiprops.accessInt("Steel Pickaxe", 11017);
	    mod_Orizon.steelAxeID = infiprops.accessInt("Steel Axe", 11018);
	    mod_Orizon.steelShovelID = infiprops.accessInt("Steel Shovel", 11019);
	    mod_Orizon.steelHoeID = infiprops.accessInt("Steel Hoe", 11020);
	    mod_Orizon.cobaltSwordID = infiprops.accessInt("Cobalt Sword", 11021);
	    mod_Orizon.cobaltPickaxeID = infiprops.accessInt("Cobalt Pickaxe", 11022);
	    mod_Orizon.cobaltAxeID = infiprops.accessInt("Cobalt Axe", 11023);
	    mod_Orizon.cobaltShovelID = infiprops.accessInt("Cobalt Shovel", 11024);
	    mod_Orizon.cobaltHoeID = infiprops.accessInt("Cobalt Hoe", 11025);
	    mod_Orizon.arditeSwordID = infiprops.accessInt("Ardite Sword", 11026);
	    mod_Orizon.arditePickaxeID = infiprops.accessInt("Ardite Pickaxe", 11027);
	    mod_Orizon.arditeAxeID = infiprops.accessInt("Ardite Axe", 11028);
	    mod_Orizon.arditeShovelID = infiprops.accessInt("Ardite Shovel", 11029);
	    mod_Orizon.arditeHoeID = infiprops.accessInt("Ardite Hoe", 11030);
	    mod_Orizon.manyullynSwordID = infiprops.accessInt("Manyullyn Sword", 11031);
	    mod_Orizon.manyullynPickaxeID = infiprops.accessInt("Manyullyn Pickaxe", 11032);
	    mod_Orizon.manyullynAxeID = infiprops.accessInt("Manyullyn Axe", 11033);
	    mod_Orizon.manyullynShovelID = infiprops.accessInt("Manyullyn Shovel", 11034);
	    mod_Orizon.manyullynHoeID = infiprops.accessInt("Manyullyn Hoe", 11035);
	    
		return infiprops;
	}

	public static InfiProps InitProps(InfiProps infiprops)
	{
		infiprops.accessBoolean("Automatically Resolve ID conflicts", true);
		
		infiprops.accessInt("Mineral Ore ID", 131);
		infiprops.accessInt("Mineral Ore High ID", 132);
		infiprops.accessInt("Mineral Ore Medium ID", 133);
		infiprops.accessInt("Mineral Ore Low ID", 134);
		infiprops.accessInt("Mineral Ore Dark ID", 135);
		
		infiprops.accessInt("Mineral Ore Alt ID", 136);
		infiprops.accessInt("Mineral Ore Alt High ID", 137);
		infiprops.accessInt("Mineral Ore Alt Medium ID", 138);
		infiprops.accessInt("Mineral Ore Alt Low ID", 139);
		infiprops.accessInt("Mineral Ore Alt Dark ID", 140);
		
		infiprops.accessInt("Gem Ore ID", 141);
		infiprops.accessInt("Gem Ore High ID", 142);
		infiprops.accessInt("Gem Ore Medium ID", 143);
		infiprops.accessInt("Gem Ore Low ID", 144);
		infiprops.accessInt("Gem Ore Dark ID", 145);
		
		infiprops.accessInt("Colored Stone ID", 146);
		infiprops.accessInt("Colored Cobblestone ID", 147);
		infiprops.accessInt("Colored Brick ID", 148);
		infiprops.accessInt("Colored Mossy Brick ID", 149);
		infiprops.accessInt("Colored Cracked Brick ID", 150);
		infiprops.accessInt("Colored Brick Tile ID", 151);
		infiprops.accessInt("Colored Fancy Brick ID", 152);
		infiprops.accessInt("Colored Square Brick ID", 153);
		
		infiprops.accessInt("Replacement Ore ID", 154);
		infiprops.accessInt("Replacement Metal Ore ID", 155);
		
		infiprops.accessInt("Calcite Ore ID", 156);
		infiprops.accessInt("Nether Ore ID", 157);
		infiprops.accessInt("Marble ID", 158);
		
		infiprops.accessInt("Slime Pool IDs", 159);
		infiprops.accessInt("Slime Gel ID", 161);
		infiprops.accessInt("Acid Pool IDs", 162);
		
		/*infiprops.accessInt("Silt ID", 164);
		infiprops.accessInt("Siltstone ID", 165);*/
		
		return infiprops;
	}
	
	public static InfiProps getSpawn(InfiProps infiprops)
	{
		mod_Orizon.genStratifiedStone = infiprops.readBoolean("Generate Stratified Stone");
		mod_Orizon.genColoredStone = infiprops.readBoolean("Generate Colored Stone");
		mod_Orizon.genCalcite = infiprops.readBoolean("Generate Calcite and Calcite Ores");
		mod_Orizon.genMarble = infiprops.readBoolean("Generate Marble");
		mod_Orizon.genNetherOre = infiprops.readBoolean("Generate Nether Ores");
		mod_Orizon.genSilt = infiprops.readBoolean("Generate Silt");
		mod_Orizon.redoVanillaOres = infiprops.readBoolean("Metallurgy Style Spawn");
		mod_Orizon.replaceOres = infiprops.readBoolean("Replace Vanilla Ores");
		mod_Orizon.genGems = infiprops.readBoolean("Generate Gemstones");
		mod_Orizon.genNonUniqueGems = infiprops.readBoolean("Generate Ruby, Emerald, and Sapphire Gems");
		mod_Orizon.genSlimePools = infiprops.readBoolean("Generate Slime Pools");
		mod_Orizon.genAcidPools = infiprops.readBoolean("Generate Acid Pools");
		
		mod_Orizon.copperRarity = infiprops.readInt("Copper Rarity");
	    mod_Orizon.copperHeight = infiprops.readInt("Copper Height");
	    mod_Orizon.turquoiseRarity = infiprops.readInt("Turquoise Rarity");
	    mod_Orizon.turquoiseHeight = infiprops.readInt("Turquoise Height");
	    mod_Orizon.chalcociteRarity = infiprops.readInt("Chalcocite Rarity");
	    mod_Orizon.chalcociteHeight = infiprops.readInt("Chalcocite Height");
	    mod_Orizon.cassiteriteRarity = infiprops.readInt("Cassiterite Rarity");
	    mod_Orizon.cassiteriteHeight = infiprops.readInt("Cassiterite Height");
	    mod_Orizon.tealliteRarity = infiprops.readInt("Teallite Rarity");
	    mod_Orizon.tealliteHeight = infiprops.readInt("Teallite Height");
	    mod_Orizon.zincBloomRarity = infiprops.readInt("Zinc Bloom Rarity");
	    mod_Orizon.zincBloomHeight = infiprops.readInt("Zinc Bloom Height");
	    mod_Orizon.sphaleriteRarity = infiprops.readInt("Sphalerite Rarity");
	    mod_Orizon.sphaleriteHeight = infiprops.readInt("Sphalerite Height");
	    mod_Orizon.cerussiteRarity = infiprops.readInt("Cerussite Rarity");
	    mod_Orizon.cerussiteHeight = infiprops.readInt("Cerussite Height");
	    mod_Orizon.cobaltRarity = infiprops.readInt("Cobalt Rarity");
	    mod_Orizon.cobaltHeight = infiprops.readInt("Cobalt Height");
	    mod_Orizon.arditeRarity = infiprops.readInt("Ardite Rarity");
	    mod_Orizon.arditeHeight = infiprops.readInt("Ardite Height");
	    mod_Orizon.myuvilRarity = infiprops.readInt("Myuvil Rarity");
	    mod_Orizon.myuvilHeight = infiprops.readInt("Myuvil Height");
	    mod_Orizon.galenaRarity = infiprops.readInt("Galena Rarity");
	    mod_Orizon.galenaHeight = infiprops.readInt("Galena Height");
	    mod_Orizon.ivymetalRarity = infiprops.readInt("Ivymetal Rarity");
	    mod_Orizon.ivymetalHeight = infiprops.readInt("Ivymetal Height");
	    mod_Orizon.aggregateRarity = infiprops.readInt("Aggregate Rarity");
	    mod_Orizon.aggregateHeight = infiprops.readInt("Aggregate Height");
	    
	    mod_Orizon.coalRarity = infiprops.readInt("Coal Rarity");
	    mod_Orizon.coalHeight = infiprops.readInt("Coal Height"); 
	    mod_Orizon.ironRarity = infiprops.readInt("Iron Rarity");
	    mod_Orizon.ironHeight = infiprops.readInt("Iron Height"); 
	    mod_Orizon.goldRarity = infiprops.readInt("Gold Rarity");
	    mod_Orizon.goldHeight = infiprops.readInt("Gold Height"); 
	    mod_Orizon.diamondRarity = infiprops.readInt("Diamond Rarity");
	    mod_Orizon.diamondHeight = infiprops.readInt("Diamond Height"); 
	    mod_Orizon.lapisRarity = infiprops.readInt("Lapis Rarity");
	    mod_Orizon.lapisHeight = infiprops.readInt("Lapis Height"); 
	    mod_Orizon.redstoneRarity = infiprops.readInt("Redstone Rarity");
	    mod_Orizon.redstoneHeight = infiprops.readInt("Redstone Height");
	    
	    mod_Orizon.bloodbiteRarity = infiprops.readInt("Bloodbite Rarity");
	    mod_Orizon.bloodbiteHeight = infiprops.readInt("Bloodbite Height");
	    mod_Orizon.grudgestoneRarity = infiprops.readInt("Grudgestone Rarity");
	    mod_Orizon.grudgestoneHeight = infiprops.readInt("Grudgestone Height");
	    mod_Orizon.wistfulRarity = infiprops.readInt("Wistful Ore Rarity");
	    mod_Orizon.wistfulHeight = infiprops.readInt("Wistful Ore Height");
	    mod_Orizon.flamelashRarity = infiprops.readInt("Flamelash Rarity");
	    mod_Orizon.flamelashHeight = infiprops.readInt("Flamelash Height");
	    mod_Orizon.tearsRarity = infiprops.readInt("Hardened Teardrop Rarity");
	    mod_Orizon.tearsHeight = infiprops.readInt("Hardened Teardrop Height");
	    mod_Orizon.netherGoldRarity = infiprops.readInt("Nether Gold Rarity");
	    mod_Orizon.netherGoldHeight = infiprops.readInt("Nether Gold Height");
	    
	    mod_Orizon.rubyRarity = infiprops.readInt("Ruby Rarity");
	    mod_Orizon.rubyHeight = infiprops.readInt("Ruby Height");
	    mod_Orizon.emeraldRarity = infiprops.readInt("Emerald Rarity");
	    mod_Orizon.emeraldHeight = infiprops.readInt("Emerald Height");
	    mod_Orizon.sapphireRarity = infiprops.readInt("Sapphire Rarity");
	    mod_Orizon.sapphireHeight = infiprops.readInt("Sapphire Height");
	    mod_Orizon.topazRarity = infiprops.readInt("Topaz Rarity");
	    mod_Orizon.topazHeight = infiprops.readInt("Topaz Height");
	    mod_Orizon.amethystRarity = infiprops.readInt("Amethyst Rarity");
	    mod_Orizon.amethystHeight = infiprops.readInt("Amethyst Height");
	    mod_Orizon.quartzRarity = infiprops.readInt("Quartz Rarity");
	    mod_Orizon.quartzHeight = infiprops.readInt("Quartz Height");
	    mod_Orizon.roseQuartzRarity = infiprops.readInt("Rose Quartz Rarity");
	    mod_Orizon.roseQuartzHeight = infiprops.readInt("Rose Quartz Height");
	    mod_Orizon.rockCrystalRarity = infiprops.readInt("Rock Crystal Rarity");
	    mod_Orizon.rockCrystalHeight = infiprops.readInt("Rock Crystal Height");
	    
	    mod_Orizon.marbleRarity = infiprops.readInt("Marble Rarity");
	    mod_Orizon.marbleHeight = infiprops.readInt("Marble Height");
	    mod_Orizon.siltRarity = infiprops.readInt("Silt Rarity");
	    mod_Orizon.siltHeight = infiprops.readInt("Silt Height");
	    mod_Orizon.siltstoneRarity = infiprops.readInt("Siltstone Rarity");
	    mod_Orizon.siltstoneHeight = infiprops.readInt("Siltstone Height");
	    
	    mod_Orizon.slimePoolRarity = infiprops.readInt("Slime Pool Rarity");
	    mod_Orizon.slimePoolHeight = infiprops.readInt("Slime Pool Height");
	    /*mod_Orizon.acidPoolRarity = infiprops.readInt("Acid Pool Rarity");
	    mod_Orizon.acidPoolHeight = infiprops.readInt("Acid Pool Height");*/
		
		return infiprops;
	}

	public static InfiProps InitSpawn(InfiProps infiprops)
	{	
		mod_Orizon.flatBedrock = infiprops.accessBoolean("Make Bedrock Flat", true);
		infiprops.accessBoolean("Generate Stratified Stone", true);
		infiprops.accessBoolean("Generate Colored Stone", true);
		infiprops.accessBoolean("Generate Calcite and Calcite Ores", true);
		infiprops.accessBoolean("Generate Marble", true);
		infiprops.accessBoolean("Generate Nether Ores", true);
		infiprops.accessBoolean("Generate Silt", true);
		infiprops.accessBoolean("Metallurgy Style Spawn", true);
		infiprops.accessBoolean("Replace Vanilla Ores", true);
		infiprops.accessBoolean("Generate Gemstones", true);
		infiprops.accessBoolean("Generate Ruby, Emerald, and Sapphire Gems", true);
		infiprops.accessBoolean("Generate Slime Pools", true);
		infiprops.accessBoolean("Generate Acid Pools", true);
		
		mod_Orizon.genCopper = infiprops.accessBoolean("Generate Copper Ore", true);
		mod_Orizon.genTurquoise = infiprops.accessBoolean("Generate Turquoise Ore", true);
		mod_Orizon.genChalcocite = infiprops.accessBoolean("Generate Chalcocite Ore", true);
		mod_Orizon.genCassiterite = infiprops.accessBoolean("Generate Cassiterite Ore", true);
		mod_Orizon.genTeallite = infiprops.accessBoolean("Generate Teallite Ore", true);
		mod_Orizon.genZinc = infiprops.accessBoolean("Generate Zinc Bloom Ore", true);
		mod_Orizon.genSphalerite = infiprops.accessBoolean("Generate Sphalerite Ore", true);
		mod_Orizon.genCerussite = infiprops.accessBoolean("Generate Cerussite Ore", true);
		mod_Orizon.genCobalt = infiprops.accessBoolean("Generate Cobalt Ore", true);
		mod_Orizon.genArdite = infiprops.accessBoolean("Generate Ardite Ore", true);
		mod_Orizon.genMyuvil = infiprops.accessBoolean("Generate Myuvil Ore", true);
		//mod_Orizon.genIvymetal = infiprops.accessBoolean("Generate Ivymetal Ore", true);
		mod_Orizon.genAggregate = infiprops.accessBoolean("Generate Aggregate Ore", true);
		
		infiprops.accessInt("Copper Rarity", 6);
	    infiprops.accessInt("Copper Height", 64);
	    infiprops.accessInt("Turquoise Rarity", 7);
	    infiprops.accessInt("Turquoise Height", 64);
	    infiprops.accessInt("Chalcocite Rarity", 3);
	    infiprops.accessInt("Chalcocite Height", 64);
	    infiprops.accessInt("Cassiterite Rarity", 6);
	    infiprops.accessInt("Cassiterite Height", 64);
	    infiprops.accessInt("Teallite Rarity", 6);
	    infiprops.accessInt("Teallite Height", 64);
	    infiprops.accessInt("Zinc Bloom Rarity", 6);
	    infiprops.accessInt("Zinc Bloom Height", 64);
	    infiprops.accessInt("Sphalerite Rarity", 5);
	    infiprops.accessInt("Sphalerite Height", 64);
	    infiprops.accessInt("Cerussite Rarity", 2);
	    infiprops.accessInt("Cerussite Height", 64);
	    infiprops.accessInt("Cobalt Rarity", 3);
	    infiprops.accessInt("Cobalt Height", 64);
	    infiprops.accessInt("Ardite Rarity", 3);
	    infiprops.accessInt("Ardite Height", 64);
	    infiprops.accessInt("Myuvil Rarity", 2);
	    infiprops.accessInt("Myuvil Height", 64);
	    infiprops.accessInt("Galena Rarity", 2);
	    infiprops.accessInt("Galena Height", 64);
	    infiprops.accessInt("Ivymetal Rarity", 1);
	    infiprops.accessInt("Ivymetal Height", 64);
	    infiprops.accessInt("Aggregate Rarity", 2);
	    infiprops.accessInt("Aggregate Height", 64);
	    
	    infiprops.accessInt("Coal Rarity", 12);
	    infiprops.accessInt("Coal Height", 128);
	    infiprops.accessInt("Iron Rarity", 12);
	    infiprops.accessInt("Iron Height", 64);
	    infiprops.accessInt("Gold Rarity", 3);
	    infiprops.accessInt("Gold Height", 64);
	    infiprops.accessInt("Diamond Rarity", 1);
	    infiprops.accessInt("Diamond Height", 64);
	    infiprops.accessInt("Lapis Rarity", 2);
	    infiprops.accessInt("Lapis Height", 64);
	    infiprops.accessInt("Redstone Rarity", 6);
	    infiprops.accessInt("Redstone Height", 64);
	    
	    infiprops.accessInt("Ruby Rarity", 2);
	    infiprops.accessInt("Ruby Height", 64);
	    infiprops.accessInt("Sapphire Rarity", 2);
	    infiprops.accessInt("Sapphire Height", 64);
	    infiprops.accessInt("Emerald Rarity", 2);
	    infiprops.accessInt("Emerald Height", 64);
	    infiprops.accessInt("Topaz Rarity", 2);
	    infiprops.accessInt("Topaz Height", 64);
	    infiprops.accessInt("Amethyst Rarity", 2);
	    infiprops.accessInt("Amethyst Height", 64);
	    infiprops.accessInt("Quartz Rarity", 2);
	    infiprops.accessInt("Quartz Height", 64);
	    infiprops.accessInt("Rose Quartz Rarity", 2);
	    infiprops.accessInt("Rose Quartz Height", 64);
	    infiprops.accessInt("Rock Crystal Rarity", 2);
	    infiprops.accessInt("Rock Crystal Height", 64);
	    
	    infiprops.accessInt("Bloodbite Rarity", 13);
	    infiprops.accessInt("Bloodbite Height", 128);
	    infiprops.accessInt("Grudgestone Rarity", 12);
	    infiprops.accessInt("Grudgestone Height", 128);
	    infiprops.accessInt("Wistful Ore Rarity", 10);
	    infiprops.accessInt("Wistful Ore Height", 128);
	    infiprops.accessInt("Flamelash Rarity", 7);
	    infiprops.accessInt("Flamelash Height", 128);
	    infiprops.accessInt("Hardened Teardrop Rarity", 8);
	    infiprops.accessInt("Hardened Teardrop Height", 128);
	    infiprops.accessInt("Nether Gold Rarity", 10);
	    infiprops.accessInt("Nether Gold Height", 128);
	    
	    infiprops.accessInt("Marble Rarity", 22);
	    infiprops.accessInt("Marble Height", 64);
	    infiprops.accessInt("Silt Rarity", 22);
	    infiprops.accessInt("Silt Height", 64);
	    infiprops.accessInt("Siltstone Rarity", 22);
	    infiprops.accessInt("Siltstone Height", 64);
	    
	    infiprops.accessInt("Slime Pool Rarity", 30);
	    infiprops.accessInt("Slime Pool Height", 40);
	    infiprops.accessInt("Acid Pool Rarity", 30);
	    infiprops.accessInt("Acid Pool Height", 128);
	    
	    mod_Orizon.coloredStoneChance = infiprops.accessInt("Colored Stone Chance", 7);
	    mod_Orizon.coloredStoneHeight = infiprops.accessInt("Colored Stone Height", 80);
	    
		return infiprops;
	}
	
	public static boolean resolveIDs(InfiProps props)
	{
		mod_Orizon.mineralOreID = changeID(props, mod_Orizon.mineralOreID, 
				"Mineral Ore ID");
		mod_Orizon.mineralOreHighID = changeID(props, mod_Orizon.mineralOreHighID, 
				"Mineral Ore High ID");
		mod_Orizon.mineralOreLow1ID = changeID(props, mod_Orizon.mineralOreLow1ID, 
				"Mineral Ore Medium ID");
		mod_Orizon.mineralOreLow2ID = changeID(props, mod_Orizon.mineralOreLow2ID, 
				"Mineral Ore Low ID");
		mod_Orizon.mineralOreLow3ID = changeID(props, mod_Orizon.mineralOreLow3ID, 
				"Mineral Ore Dark ID");
		
		mod_Orizon.mineralOreAltID = changeID(props, mod_Orizon.mineralOreAltID, 
				"Mineral Ore Alt ID");
		mod_Orizon.mineralOreAltHighID = changeID(props, mod_Orizon.mineralOreAltHighID, 
				"Mineral Ore Alt High ID");
		mod_Orizon.mineralOreAltLow1ID = changeID(props, mod_Orizon.mineralOreAltLow1ID, 
				"Mineral Ore Alt Medium ID");
		mod_Orizon.mineralOreAltLow2ID = changeID(props, mod_Orizon.mineralOreAltLow2ID, 
				"Mineral Ore Alt Low ID");
		mod_Orizon.mineralOreAltLow3ID = changeID(props, mod_Orizon.mineralOreAltLow3ID, 
				"Mineral Ore Alt Dark ID");
		
		mod_Orizon.gemOreID = changeID(props, mod_Orizon.gemOreID, 
				"Gem Ore ID");
		mod_Orizon.gemOreHighID = changeID(props, mod_Orizon.gemOreHighID, 
				"Gem Ore High ID");
		mod_Orizon.gemOreLow1ID = changeID(props, mod_Orizon.gemOreLow1ID, 
				"Gem Ore Medium ID");
		mod_Orizon.gemOreLow2ID = changeID(props, mod_Orizon.gemOreLow2ID, 
				"Gem Ore Low ID");
		mod_Orizon.gemOreLow3ID = changeID(props, mod_Orizon.gemOreLow3ID, 
				"Gem Ore Dark ID");
		
		mod_Orizon.marbleID = changeID(props, mod_Orizon.marbleID, 
				"Marble ID");
		mod_Orizon.calciteOreID = changeID(props, mod_Orizon.calciteOreID, 
				"Calcite Ore ID");
		mod_Orizon.netherOreID = changeID(props, mod_Orizon.netherOreID, 
				"Nether Ore ID");
		mod_Orizon.replaceOreID = changeID(props, mod_Orizon.replaceOreID, 
				"Replacement Ore ID");
		mod_Orizon.replaceMetalID = changeID(props, mod_Orizon.replaceMetalID, 
				"Replacement Metal Ore ID");
		
		mod_Orizon.cStoneID = changeID(props, mod_Orizon.cStoneID, 
				"Colored Stone ID");
		mod_Orizon.cCobbleID = changeID(props, mod_Orizon.cCobbleID, 
				"Colored Cobblestone ID");
		mod_Orizon.cBrickID = changeID(props, mod_Orizon.cBrickID, 
				"Colored Brick ID");
		mod_Orizon.cMossyID = changeID(props, mod_Orizon.cMossyID, 
				"Colored Mossy Brick ID");
		mod_Orizon.cCrackedID = changeID(props, mod_Orizon.cCrackedID, 
				"Colored Cracked Brick ID");
		mod_Orizon.cTileID = changeID(props, mod_Orizon.cTileID, 
				"Colored Brick Tile ID");
		mod_Orizon.cFancyID = changeID(props, mod_Orizon.cFancyID, 
				"Colored Fancy Brick ID");
		mod_Orizon.cSquareID = changeID(props, mod_Orizon.cSquareID, 
				"Colored Square Brick ID");
		
		props.writeBoolean("Automatically Resolve ID conflicts", false);
		return true;
	}
	
	private static int idStart = 130;
	
	public static int changeID(InfiProps props, int id, String s)
	{
		if(Block.blocksList[id] != null) {
			for(int i = idStart; i < Block.blocksList.length; i++) {
				if(Block.blocksList[i] == null) {
					props.writeInt(s, i);
					idStart = i + 1;
					return i;
				}
			}
		}
		return id;
	}
}
