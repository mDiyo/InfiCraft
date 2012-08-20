package mdiyo.inficraft.flora.berries;

import net.minecraft.src.Block;
import net.minecraft.src.Item;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Flora & Soma: Berries
 * Bringing hunger to its knees with accessable food.
 * @author: Merdiwen Tirelle Diyo
 */

@Mod(modid = "FloraBerries", name = "Flora and Soma Berries", version = "Anachrosim")
public class FloraBerries
{
	/* Proxies for sides, used for graphics processing */
	@SidedProxy(clientSide = "mdiyo.inficraft.flora.berries.client.FloraBerryClientProxy", serverSide = "mdiyo.inficraft.flora.berries.FloraBerryCommonProxy")
	public static FloraBerryCommonProxy proxy;
	
	/* Instance of this mod, used for grabbing prototype fields */
	@Instance
	public static FloraBerries instance;	
	public static FloraBerries getInstance()
	{
		return instance;
	}
	
	@PreInit
	public void preInit(FMLPreInitializationEvent evt)
	{
		PHBerries.initProps();		
		berryItem = new BerryItem(PHBerries.berryItemID, 2).setItemName("berry");
		berryBush = new BerryBush(PHBerries.berryBlockID, 0);
		GameRegistry.registerBlock(berryBush, mdiyo.inficraft.flora.berries.BerryBushItem.class);
	}

	@Init
	public void init(FMLInitializationEvent evt) 
	{		
		GameRegistry.registerWorldGenerator(new BerryWorldgen());
		
		proxy.registerRenderer();
		proxy.addNames();
		proxy.addEESupport();
	}
	
	/* Prototype fields, used elsewhere */
	public static Item berryItem;
	public static Block berryBush;

	public static int berryModelID;
}
