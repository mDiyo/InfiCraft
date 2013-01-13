package florasoma.berries;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
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
 * Flora & Soma: Berries
 * Bringing hunger to its knees with accessable food.
 * @author: mDiyo
 */

@Mod(modid = "Flora Berries", name = "Flora and Soma Berries", version = "1.4.6_2013.1.12")
public class FloraBerries
{
	/* Proxies for sides, used for client-only processing */
	@SidedProxy(clientSide = "florasoma.berries.FloraBerryClientProxy", serverSide = "florasoma.berries.FloraBerryCommonProxy")
	public static FloraBerryCommonProxy proxy;

	/* Instance of this mod, used for grabbing prototype fields */
	@Instance("FloraBerries")
	public static FloraBerries instance;

	@PreInit
	public void preInit(FMLPreInitializationEvent evt)
	{
		PHBerries.initProps();
		berryItem = new BerryItem(PHBerries.berryItemID, 2).setItemName("berry");
		berryBush = new BerryBush(PHBerries.berryBlockID, 0);
		GameRegistry.registerBlock(berryBush, florasoma.berries.BerryBushItem.class, "BerryBush");
	}

	@Init
	public void init(FMLInitializationEvent evt)
	{
		GameRegistry.registerWorldGenerator(new BerryWorldgen());
		FloraSomaTab.init(berryItem.itemID);
		proxy.registerRenderer();
		proxy.addNames();
	}

	/* Prototype fields, used elsewhere */
	public static Item berryItem;
	public static Block berryBush;

	public static int berryModelID;

	public static String bushTexture = "/floratextures/bushes.png";
	public static String seedTexture = "/floratextures/seeds.png";
}
