package mDiyo.inficraft.flora.clouds;

import net.minecraft.src.Block;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Flora & Soma: Clouds
 * Build a lofty base in the skies above!
 * @author: Merdiwen Tirelle Diyo
 */

@Mod(modid = "Flora Clouds", name = "Flora and Soma Clouds", version = "1.4.5_2012.11.29")
public class FloraClouds
{
	/* Proxies for sides, used for client-only processing*/
	@SidedProxy(clientSide = "mDiyo.inficraft.flora.clouds.client.FloraCloudsClientProxy", serverSide = "mDiyo.inficraft.flora.clouds.FloraCloudsCommonProxy")
	public static FloraCloudsCommonProxy proxy;
	
	/* Instance of this mod, used for grabbing prototype fields */
	@Instance("Flora Clouds")
	public static FloraClouds instance;
	
	/* Initial loading, used to define blocks, items, and entities */
	
	@PreInit
	public void preInit(FMLPreInitializationEvent evt)
	{
		PHClouds.initProps();
		
		cloud = new CloudBlock(PHClouds.cloudID);
		GameRegistry.registerBlock(cloud, mDiyo.inficraft.flora.clouds.CloudItem.class);
	}
	
	@Init
	public void init(FMLInitializationEvent evt) 
	{
		GameRegistry.registerWorldGenerator(new CloudWorldgen());
		
		proxy.registerRenderer();
		proxy.addNames();
		addRecipes();
	}
	
	/* Recipes, no better place to put them */
	
	public void addRecipes()
	{
		GameRegistry.addRecipe(new ItemStack(Item.coal, 1, 1), "cc", "cc", 'c', new ItemStack(FloraClouds.instance.cloud, 1, 2) );
		GameRegistry.addRecipe(new ItemStack(Item.gunpowder, 1, 0), "cc", "cc", 'c', new ItemStack(FloraClouds.instance.cloud, 1, 3) );
	}
	
	/* Prototype fields, used elsewhere */
	public static Block cloud;
	
	/* Texture locations */
	public static String texture = "/mDiyo/inficraft/flora/textures/clouds.png";
}
