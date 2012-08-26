package mdiyo.inficraft.flora.clouds;

import net.minecraft.src.Block;
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

@Mod(modid = "FloraClouds", name = "Flora and Soma Clouds", version = "Anachrosim")
public class FloraClouds
{
	/* Proxies for sides, used for client-only processing*/
	@SidedProxy(clientSide = "mdiyo.inficraft.flora.clouds.client.FloraCloudsClientProxy", serverSide = "mdiyo.inficraft.flora.clouds.FloraCloudsCommonProxy")
	public static FloraCloudsCommonProxy proxy;
	
	/* Instance of this mod, used for grabbing prototype fields */
	@Instance
	public static FloraClouds instance;	
	public static FloraClouds getInstance()
	{
		return instance;
	}
	
	/* Initial loading, used to define blocks, items, and entities */
	
	@PreInit
	public void preInit(FMLPreInitializationEvent evt)
	{
		PHClouds.initProps();
		
		cloud = new CloudBlock(PHClouds.cloudID);
		GameRegistry.registerBlock(cloud, mdiyo.inficraft.flora.clouds.CloudItem.class);
	}
	
	@Init
	public void init(FMLInitializationEvent evt) 
	{
		GameRegistry.registerWorldGenerator(new CloudWorldgen());
		
		proxy.registerRenderer();
		proxy.addNames();
		proxy.addRecipes();
	}
	
	/* Prototype fields, used elsewhere */
	public static Block cloud;
	
	/* Texture locations */
	public static String texture = "/mdiyo/inficraft/flora/clouds/textures/clouds.png";
}
