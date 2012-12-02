package mDiyo.inficraft.orizon.pastelmarble;

import java.io.File;

import cpw.mods.fml.common.registry.LanguageRegistry;


import net.minecraft.client.Minecraft;
import net.minecraftforge.client.MinecraftForgeClient;

public class PastelProxyClient extends PastelProxyCommon
{
	public void registerRenderer() 
	{
		MinecraftForgeClient.preloadTexture(PastelMarble.texture);
	}
	public void addNames() 
	{
		LanguageRegistry.instance().addStringLocalization("itemGroup.orizonStone", "en_US", "Pastel Stone");
		
		LanguageRegistry.instance().addStringLocalization("whiteMarble.name", "en_US", "White Marble");
		LanguageRegistry.instance().addStringLocalization("blackMarble.name", "en_US", "Black Marble");
		LanguageRegistry.instance().addStringLocalization("roseMarble.name", "en_US", "Rose Marble");
		LanguageRegistry.instance().addStringLocalization("emeraldMarble.name", "en_US", "Emerald Marble");
		LanguageRegistry.instance().addStringLocalization("azureMarble.name", "en_US", "Azure Marble");
		LanguageRegistry.instance().addStringLocalization("rubyMarble.name", "en_US", "Ruby Marble");
		
		LanguageRegistry.instance().addStringLocalization("whiteCobbleMarble.name", "en_US", "White Marble Cobblestone");
		LanguageRegistry.instance().addStringLocalization("blackCobbleMarble.name", "en_US", "Black Marble Cobblestone");
		LanguageRegistry.instance().addStringLocalization("roseCobbleMarble.name", "en_US", "Rose Marble Cobblestone");
		LanguageRegistry.instance().addStringLocalization("emeraldCobbleMarble.name", "en_US", "Emerald Marble Cobblestone");
		LanguageRegistry.instance().addStringLocalization("azureCobbleMarble.name", "en_US", "Azure Marble Cobblestone");
		LanguageRegistry.instance().addStringLocalization("rubyCobbleMarble.name", "en_US", "Ruby Marble Cobblestone");
		
		String namePrefixArray[] = { "high", "medium", "low", "dark", "red", "blue", "yellow", "purple",
	    	"aqua", "darkgreen", "orange", "pink", "bluegray", "mint", "violet", "cyan"	
	    };
	    	
	    String nameSuffixArray[] = { "Stone", "Cobblestone", "Brick", 
	    	"Mossy", "Cracked", "Tile", "Fancy", "Square"    			
	    };
	    	
	    String prefixArray[] = { "High", "Tinged", "Low", "Dark", "Roman", "Seawashed", "Sunny", "Lilac",
	    	"Aqua", "Emerald", "Bronzed", "Rose", "Bluegrass", "Mint", "Violet", "Cyan"    			
	    };
	    	
	    String suffixArray[] = { "Stone", "Cobblestone", "Stone Brick", "Mossy Brick", 
	    	"Cracked Brick", "Brick Tile", "Fancy Brick", "Square Brick"    			
	    };
	    	
	    for (int i = 0; i < namePrefixArray.length; i++) {
	    	for (int j = 0; j < nameSuffixArray.length; j++) {
	    		LanguageRegistry.instance().addStringLocalization(
	    			new StringBuilder().append(namePrefixArray[i]).append(nameSuffixArray[j]).append(".name").toString(), "en_US",
	    			new StringBuilder().append(prefixArray[i]).append(" ").append(suffixArray[j]).toString()
	    		);
	    	}
	    }
	}
	
	public File getMinecraftDir()
	{
		return Minecraft.getMinecraftDir();
	}
}
