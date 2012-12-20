package inficraft.infitools.client;

import inficraft.infitools.InfiTools;
import inficraft.infitools.TProxyCommon;
import inficraft.infitools.ToolItems;

import java.io.File;

import net.minecraft.client.Minecraft;
import net.minecraftforge.client.MinecraftForgeClient;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class TProxyClient extends TProxyCommon
{
	/* Registers any rendering code. */
	public void registerRenderer() 
	{
		MinecraftForgeClient.preloadTexture(ToolItems.craftingTexture);
		MinecraftForgeClient.preloadTexture(ToolItems.pickaxeTexture);
		MinecraftForgeClient.preloadTexture(ToolItems.swordTexture);
		MinecraftForgeClient.preloadTexture(ToolItems.shovelTexture);
		MinecraftForgeClient.preloadTexture(ToolItems.axeTexture);
	}
	
	
	/* Ties an internal name to a visible one. */
	public void addNames() 
	{
		LanguageRegistry.instance().addStringLocalization("itemGroup.InfiTools", "InfiTools");
		LanguageRegistry.instance().addStringLocalization("itemGroup.InfiMaterials", "InfiTools Materials");
		
		for (int mat = 0; mat < materialTypes.length; mat++)
		{
			for (int type = 0; type < toolMaterialNames.length; type++)
			{
				String internalName = new StringBuilder().append("item.").append(materialTypes[mat]).append(".").append(toolMaterialNames[type]).append(".name").toString();
				String visibleName = new StringBuilder().append(toolMaterialNames[type]).append(materialNames[mat]).toString();
				LanguageRegistry.instance().addStringLocalization(internalName, "en_US", visibleName);
			}			
		}
	}
	
	@Override
	public File getLocation()
	{
		return Minecraft.getMinecraftDir();
	}
	
	
	public static final String[] toolMaterialNames = new String[] { 
		"Wood", "Stone", "Iron", "Flint", "Cactus", "Bone", "Obsidian", "Slime", "Paper", "Netherrack", "Cobalt", "Ardite", "Manyullyn"
	};
	
	public static final String[] materialTypes = new String[] {
		"infitools.ToolRod", "infitools.PickaxeHead", "infitools.ToolShard", "infitools.ShovelHead", "infitools.AxeHead", "infitools.SwordBlade"
	};
	
	public static final String[] materialNames = new String[] {
		" Rod", " Pickaxe Head", " Shard", " Shovel Head", " Axe Head", " Sword Blade"
	};
}
