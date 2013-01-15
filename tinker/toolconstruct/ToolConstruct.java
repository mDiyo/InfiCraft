package tinker.toolconstruct;

import java.util.Random;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.oredict.OreDictionary.OreRegisterEvent;
import tinker.toolconstruct.worldgen.TBaseWorldGenerator;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;

/* TConstruct, the successor to InfiTools
 * Now with many much more combinations and many much less IDs!
 * @author: mDiyo
 */

@Mod(modid = "TConstruct", name = "Tool Construct", version = "A12")
@NetworkMod(serverSideRequired = false, clientSideRequired = true)
public class ToolConstruct 
{
	/* Instance of this mod, used for grabbing prototype fields */
	@Instance("TConstruct")
	public static ToolConstruct instance;
	/* Proxies for sides, used for graphics processing */
	@SidedProxy(clientSide = "tinker.toolconstruct.client.TProxyClient", serverSide = "tinker.toolconstruct.TProxyCommon")
	public static TProxyCommon proxy;
	
	@PreInit
	public void preInit(FMLPreInitializationEvent evt)
	{
		MinecraftForge.EVENT_BUS.register(this);
		PHTools.initProps();
		materialTab = new TabTools("TConMaterials");
		toolTab = new TabTools("TConstruct");
		blockTab = new TabTools("TConstructBlocks");
		content = new TConstructContent();
		
		NetworkRegistry.instance().registerGuiHandler(instance, new GuiHandler());
	}
	
	@Init
	public void load(FMLInitializationEvent evt) 
	{
		proxy.registerRenderer();
		proxy.addNames();
		GameRegistry.registerWorldGenerator(new TBaseWorldGenerator());
	}
	
	@ForgeSubscribe
    public void registerOre(OreRegisterEvent evt)
	{
		if (evt.Name == "battery")
			content.modE.batteries.add(evt.Ore);
		
		if (evt.Name == "basicCircuit")
			content.modE.circuits.add(evt.Ore);
	}
	
	TConstructContent content;
	
	public static Random tRand = new Random();
	public static TabTools toolTab;
	public static TabTools materialTab;
	public static TabTools blockTab;
}
