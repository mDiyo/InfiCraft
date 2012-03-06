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
		mod_Orizon.calciteOreID = infiprops.readInt("Calcite Ore ID");
		
		mod_Orizon.replaceOreID = infiprops.readInt("Replacement Ore ID");
		mod_Orizon.replaceMetalID = infiprops.readInt("Replacement Metal Ore ID");
		
		mod_Orizon.marbleID = infiprops.readInt("Marble ID");
		
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
		
		infiprops.accessInt("Gem Ore ID", 142);
		infiprops.accessInt("Gem Ore High ID", 143);
		infiprops.accessInt("Gem Ore Medium ID", 144);
		infiprops.accessInt("Gem Ore Low ID", 145);
		infiprops.accessInt("Gem Ore Dark ID", 146);
		
		infiprops.accessInt("Colored Stone ID", 141);
		
		infiprops.accessInt("Replacement Ore ID", 149);
		infiprops.accessInt("Replacement Metal Ore ID", 150);
		
		infiprops.accessInt("Calcite Ore ID", 151);
		infiprops.accessInt("Marble ID", 152);
		
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
	    
	    mod_Orizon.goldRarity = infiprops.readInt("Gold Rarity");
	    mod_Orizon.goldHeight = infiprops.readInt("Gold Height"); 
	    mod_Orizon.diamondRarity = infiprops.readInt("Diamond Rarity");
	    mod_Orizon.diamondHeight = infiprops.readInt("Diamond Height"); 
	    mod_Orizon.lapisRarity = infiprops.readInt("Lapis Rarity");
	    mod_Orizon.lapisHeight = infiprops.readInt("Lapis Height"); 
	    mod_Orizon.redstoneRarity = infiprops.readInt("Redstone Rarity");
	    mod_Orizon.redstoneHeight = infiprops.readInt("Redstone Height");
	    
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
		
		return infiprops;
	}

	public static InfiProps InitSpawn(InfiProps infiprops)
	{		
		infiprops.accessBoolean("Generate Stratified Stone", true);
		infiprops.accessBoolean("Generate Colored Stone", true);
		infiprops.accessBoolean("Generate Calcite and Calcite Ores", true);
		infiprops.accessBoolean("Generate Marble", true);
		infiprops.accessBoolean("Generate Nether Ores", true);
		infiprops.accessBoolean("Generate Silt", true);
		infiprops.accessBoolean("Metallurgy Style Spawn", true);
		infiprops.accessBoolean("Replace Vanilla Ores", true);
		
		infiprops.accessInt("Copper Rarity", 10);
	    infiprops.accessInt("Copper Height", 64);
	    infiprops.accessInt("Turquoise Rarity", 12);
	    infiprops.accessInt("Turquoise Height", 64);
	    infiprops.accessInt("Chalcocite Rarity", 4);
	    infiprops.accessInt("Chalcocite Height", 64);
	    infiprops.accessInt("Cassiterite Rarity", 10);
	    infiprops.accessInt("Cassiterite Height", 64);
	    infiprops.accessInt("Teallite Rarity", 10);
	    infiprops.accessInt("Teallite Height", 64);
	    infiprops.accessInt("Zinc Bloom Rarity", 10);
	    infiprops.accessInt("Zinc Bloom Height", 64);
	    infiprops.accessInt("Sphalerite Rarity", 8);
	    infiprops.accessInt("Sphalerite Height", 64);
	    infiprops.accessInt("Cerussite Rarity", 3);
	    infiprops.accessInt("Cerussite Height", 64);
	    infiprops.accessInt("Cobalt Rarity", 8);
	    infiprops.accessInt("Cobalt Height", 64);
	    infiprops.accessInt("Ardite Rarity", 8);
	    infiprops.accessInt("Ardite Height", 64);
	    infiprops.accessInt("Myuvil Rarity", 8);
	    infiprops.accessInt("Myuvil Height", 64);
	    infiprops.accessInt("Galena Rarity", 3);
	    infiprops.accessInt("Galena Height", 64);
	    infiprops.accessInt("Ivymetal Rarity", 2);
	    infiprops.accessInt("Ivymetal Height", 64);
	    infiprops.accessInt("Aggregate Rarity", 8);
	    infiprops.accessInt("Aggregate Height", 64);
	    
	    infiprops.accessInt("Gold Rarity", 5);
	    infiprops.accessInt("Gold Height", 64);
	    infiprops.accessInt("Diamond Rarity", 1);
	    infiprops.accessInt("Diamond Height", 64);
	    infiprops.accessInt("Lapis Rarity", 2);
	    infiprops.accessInt("Lapis Height", 64);
	    infiprops.accessInt("Redstone Rarity", 12);
	    infiprops.accessInt("Redstone Height", 64);
	    
	    infiprops.accessInt("Ruby Rarity", 1);
	    infiprops.accessInt("Ruby Height", 64);
	    infiprops.accessInt("Sapphire Rarity", 1);
	    infiprops.accessInt("Sapphire Height", 64);
	    infiprops.accessInt("Emerald Rarity", 1);
	    infiprops.accessInt("Emerald Height", 64);
	    infiprops.accessInt("Topaz Rarity", 1);
	    infiprops.accessInt("Topaz Height", 64);
	    infiprops.accessInt("Amethyst Rarity", 1);
	    infiprops.accessInt("Amethyst Height", 64);
	    infiprops.accessInt("Quartz Rarity", 1);
	    infiprops.accessInt("Quartz Height", 64);
	    infiprops.accessInt("Rose Quartz Rarity", 1);
	    infiprops.accessInt("Rose Quartz Height", 64);
	    infiprops.accessInt("Rock Crystal Rarity", 1);
	    infiprops.accessInt("Rock Crystal Height", 64);
	    
	    infiprops.accessInt("Marble Rarity", 22);
	    infiprops.accessInt("Marble Height", 64);
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
		mod_Orizon.replaceOreID = changeID(props, mod_Orizon.replaceOreID, 
				"Replacement Ore ID");
		mod_Orizon.replaceMetalID = changeID(props, mod_Orizon.replaceMetalID, 
				"Replacement Metal Ore ID");
		
		mod_Orizon.cStoneID = changeID(props, mod_Orizon.cStoneID, 
				"Colored Stone ID");
		
		props.writeBoolean("Automatically Resolve ID conflicts", false);
		return true;
	}
	
	private static int changeID(InfiProps props, int id, String s)
	{
		if(Block.blocksList[id] != null) {
			for(int i = 130; i < Block.blocksList.length; i++) {
				if(Block.blocksList[i] == null) {
					props.writeInt(s, i);
					return i;
				}
			}
		}
		return id;
	}
}
