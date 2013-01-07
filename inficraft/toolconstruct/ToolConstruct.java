package inficraft.toolconstruct;

import inficraft.toolconstruct.crafting.ToolBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.network.NetworkRegistry;

/* TConstruct, the successor to InfiTools
 * Now with many much more combinations and many much less IDs!
 * @author: mDiyo
 */

@Mod(modid = "TConstruct", name = "Tool Construct", version = "A8")
@NetworkMod(serverSideRequired = false, clientSideRequired = true)
public class ToolConstruct 
{
	/* Instance of this mod, used for grabbing prototype fields */
	@Instance("TConstruct")
	public static ToolConstruct instance;
	/* Proxies for sides, used for graphics processing */
	@SidedProxy(clientSide = "inficraft.toolconstruct.client.TProxyClient", serverSide = "inficraft.toolconstruct.TProxyCommon")
	public static TProxyCommon proxy;
	
	@PreInit
	public void preInit(FMLPreInitializationEvent evt)
	{
		PHTools.initProps();
		materialTab = new TabTools("TConMaterials");
		toolTab = new TabTools("TConstruct");
		items = new ToolItems();
		
		NetworkRegistry.instance().registerGuiHandler(instance, new GuiHandler());
	}
	
	@Init
	public void load(FMLInitializationEvent evt) 
	{
		proxy.registerRenderer();
		proxy.addNames();
	}
	
	ToolItems items;
	
	public static TabTools toolTab;
	public static TabTools materialTab;
}
