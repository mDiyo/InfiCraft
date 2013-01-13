package florasoma.clouds;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import florasoma.common.FloraSomaTab;

/**
 * Flora & Soma: Clouds
 * Build a lofty base in the skies above!
 * @author: Merdiwen Tirelle Diyo
 */

@Mod(modid = "Flora Clouds", name = "Flora and Soma Clouds", version = "1.4.6_2013.1.12")
public class FloraClouds
{
	/* Proxies for sides, used for client-only processing*/
	@SidedProxy(clientSide = "florasoma.clouds.FloraCloudsClientProxy", serverSide = "florasoma.clouds.FloraCloudsCommonProxy")
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
		GameRegistry.registerBlock(cloud, florasoma.clouds.CloudItem.class, "Cloud");
	}
	
	@Init
	public void init(FMLInitializationEvent evt) 
	{
		GameRegistry.registerWorldGenerator(new CloudWorldgen());
		FloraSomaTab.init(cloud.blockID);
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
	public static String texture = "/floratextures/clouds.png";
}
