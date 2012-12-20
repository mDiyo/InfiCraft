package inficraft.infitools;

import inficraft.infitools.crafting.*;
import inficraft.infitools.tools.*;
import net.minecraft.item.Item;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

/* InfiTools
 * Now with many much more combinations and many much less IDs!
 * @author: mDiyo
 */

@Mod(modid = "InfiTools", name = "InfiTools", version = "Test")
@NetworkMod(serverSideRequired = false, clientSideRequired = true)
public class InfiTools 
{
	/* Instance of this mod, used for grabbing prototype fields */
	@Instance("InfiTools")
	public static InfiTools instance;
	/* Proxies for sides, used for graphics processing */
	@SidedProxy(clientSide = "inficraft.infitools.client.TProxyClient", serverSide = "inficraft.infitools.TProxyCommon")
	public static TProxyCommon proxy;
	
	@PreInit
	public void preInit(FMLPreInitializationEvent evt)
	{
		PHInfiTools.initProps();
		items = new ToolItems();
		materialTab = new TabInfiTools("InfiMaterials", ToolItems.pickaxeHead.shiftedIndex);
		toolTab = new TabInfiTools("InfiTools", ToolItems.pickaxe.shiftedIndex);
		
		NetworkRegistry.instance().registerGuiHandler(instance, new GuiHandler());
	}
	
	@Init
	public void load(FMLInitializationEvent evt) 
	{
		proxy.registerRenderer();
		proxy.addNames();
	}
	
	ToolItems items;
	
	public static TabInfiTools toolTab;
	public static TabInfiTools materialTab;
}
