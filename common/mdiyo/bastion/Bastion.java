package mDiyo.bastion;

import mDiyo.api.detailing.DetailManager;
import net.minecraft.src.Block;
import net.minecraft.src.CreativeTabs;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

/* Bastion, the fortress of bulwark and garrisons!
 * @author: mDiyo
 */

@Mod(modid = "Bastion", name = "Bastion", version = "Test")
//@NetworkMod(serverSideRequired = false, clientSideRequired = true)
public class Bastion
{
	/* Proxies for sides, used for graphics processing */
	@SidedProxy(clientSide = "mDiyo.bastion.BastionProxyClient", serverSide = "mDiyo.bastion.BastionProxyCommon")
	public static BastionProxyCommon proxy;
	
	@Instance("Bastion")
	public static Bastion instance;
	public static BastionContent contentInstance;
	public static CreativeTabs bastionTab = new TabBastion("Bastion");    
	
	@PreInit
	public void preInit(FMLPreInitializationEvent evt)
	{
		PHBastion.initProps();		
		contentInstance = new BastionContent();
	}
	
	@Init
	public void load(FMLInitializationEvent evt) 
	{
		proxy.registerRenderer();
		proxy.addNames();
		
		DetailManager.getInstance().addDrilling(Block.stone, Block.cobblestone);
	}
	
	/* Texture paths */
	public static String bricksImage = "/bastion/bricks.png";
	public static String blocksImage = "/bastion/infiblocks.png";
	public static String techImage = "/bastion/tech.png";
}