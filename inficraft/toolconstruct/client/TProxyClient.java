package inficraft.toolconstruct.client;

import inficraft.toolconstruct.ToolConstruct;
import inficraft.toolconstruct.TProxyCommon;
import inficraft.toolconstruct.ToolItems;

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
		MinecraftForgeClient.preloadTexture(ToolItems.baseHeads);
		MinecraftForgeClient.preloadTexture(ToolItems.swordparts);
		
		MinecraftForgeClient.preloadTexture(ToolItems.pickaxeTexture);
		MinecraftForgeClient.preloadTexture(ToolItems.broadswordTexture);
		MinecraftForgeClient.preloadTexture(ToolItems.shovelTexture);
		MinecraftForgeClient.preloadTexture(ToolItems.axeTexture);
		MinecraftForgeClient.preloadTexture(ToolItems.longswordTexture);
		MinecraftForgeClient.preloadTexture(ToolItems.rapierTexture);
	}
	
	
	/* Ties an internal name to a visible one. */
	public void addNames() 
	{
		LanguageRegistry.instance().addStringLocalization("itemGroup.TConstruct", "TConstruct Tools");
		LanguageRegistry.instance().addStringLocalization("itemGroup.TConMaterials", "TConstruct Materials");
		
		LanguageRegistry.instance().addStringLocalization("crafters.ToolStation", "Tool Station");
		LanguageRegistry.instance().addStringLocalization("crafters.PartBuilder", "Part Builder");
		
		for (int mat = 0; mat < materialTypes.length; mat++)
		{
			for (int type = 0; type < toolMaterialNames.length; type++)
			{
				String internalName = new StringBuilder().append("item.tconstruct.").append(materialTypes[mat]).append(".").append(toolMaterialNames[type]).append(".name").toString();
				String visibleName = new StringBuilder().append(toolMaterialNames[type]).append(materialNames[mat]).toString();
				LanguageRegistry.instance().addStringLocalization(internalName, "en_US", visibleName);
			}			
		}
		
		for (int i = 0; i < patterns.length; i++)
		{
			String internalName = "item.tconstruct.WoodPattern."+patterns[i]+".name"; //Remember the .name dammit!
			String visibleName = patternNames[i]+" Pattern";
			System.out.println("Internal Name: "+internalName+" Visible Name: "+visibleName);
			LanguageRegistry.instance().addStringLocalization(internalName, "en_US", visibleName);
		}
		
		LanguageRegistry.addName(ToolItems.pickaxe, "Pickaxe");
		LanguageRegistry.addName(ToolItems.shovel, "Shovel");
		LanguageRegistry.addName(ToolItems.axe, "Axe");
		LanguageRegistry.addName(ToolItems.broadsword, "Broadsword");
		LanguageRegistry.addName(ToolItems.longsword, "Longsword");
		LanguageRegistry.addName(ToolItems.rapier, "Rapier");
	}
	
	@Override
	public File getLocation()
	{
		return Minecraft.getMinecraftDir();
	}
	
	
	public static final String[] toolMaterialNames = new String[] { 
		"Wood", "Stone", "Iron", "Flint", "Cactus", "Bone", "Obsidian", "Netherrack", "Slime", "Paper", "Cobalt", "Ardite", "Manyullyn" };
	
	public static final String[] materialTypes = new String[] {
		"ToolRod", "PickaxeHead", "ToolShard", "ShovelHead", "AxeHead", "SwordBlade", "LargeGuard", "MediumGuard", "Crossbar", "Binding" };
	
	public static final String[] materialNames = new String[] {
		" Rod", " Pickaxe Head", " Shard", " Shovel Head", " Axe Head", " Sword Blade", " Wide Guard", " Cover", " Crossbar", " Binding" };
	
	public static final String[] patterns = new String[] {
		"blank", "rod", "pickaxe", "shovel", "axe", "blade", "largeguard", "medguard", "crossbar", "binding" };
	
	public static final String[] patternNames = new String[] {
		"Blank", "Tool Rod","Pickaxe Head", "Shovel Head", "Axe Head", "Sword Blade", "Large Guard", "Medium Guard", "Crossbar", "Tool Binding" };
}
