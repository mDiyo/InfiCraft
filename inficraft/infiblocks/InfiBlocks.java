package inficraft.infiblocks;

import net.minecraft.creativetab.CreativeTabs;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.network.NetworkRegistry;

/* InfiBlocks!
 * Bringing you a little bit of every block in every flavor.
 * @author: mDiyo
 */

@Mod(modid = "InfiBlocks", name = "InfiBlocks", version = "1.4.5_2012.12.12")
@NetworkMod(serverSideRequired = false, clientSideRequired = true)
public class InfiBlocks
{
	/* Proxies for sides, used for graphics processing */
	@SidedProxy(clientSide = "inficraft.infiblocks.client.InfiBlocksClientProxy", serverSide = "inficraft.infiblocks.InfiBlocksCommonProxy")
	public static InfiBlocksCommonProxy proxy;
	
	@Instance("InfiBlocks")
	public static InfiBlocks instance;
	
	public static CreativeTabs infiBlockTab = new TabInfiBlocks("InfiBlocks");
	
	/* Instance of the content, used to grab blocks and such. */
    private static InfiBlockContent contentInstance;
	public static InfiBlockContent getContentInstance()
	{
		return contentInstance;
	}
	
	@PreInit
	public void preInit(FMLPreInitializationEvent evt)
	{
		PHInfiBlocks.initProps();		
		contentInstance = new InfiBlockContent();
		contentInstance.init();
	}
	
	@Init
	public void load(FMLInitializationEvent evt) 
	{
		proxy.registerRenderer();
		proxy.addNames();
		InfiBlockRecipes.recipeStorm();
		InfiBlockRecipes.magicSlabFrenzy();
		InfiBlockRecipes.furnaceBlaze();
		InfiBlockRecipes.initDetails();
		
		NetworkRegistry.instance().registerGuiHandler(instance, proxy);
	}
	
	/* Texture paths */
	public static String bricksImage = "/infitextures/bricks.png";
	public static String blocksImage = "/infitextures/infiblocks.png";
	public static String techImage = "/infitextures/tech.png";
}