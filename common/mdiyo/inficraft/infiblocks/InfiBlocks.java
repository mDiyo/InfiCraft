package mDiyo.inficraft.infiblocks;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.SidedProxy;

/* InfiBlocks!
 * Bringing you a little bit of every block in every flavor.
 * @author: mDiyo
 */

@Mod(modid = "InfiBlocks", name = "InfiBlocks", version = "0.9")
public class InfiBlocks
{
	/* Proxies for sides, used for graphics processing */
	@SidedProxy(clientSide = "mDiyo.inficraft.infiblocks.client.InfiBlocksClientProxy", serverSide = "mDiyo.inficraft.infiblocks.InfiBlocksCommonProxy")
	public static InfiBlocksCommonProxy proxy;
	
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
	}
	
	/* Texture paths */
	public static String bricksImage = "/mDiyo/inficraft/infiblocks/textures/bricks.png";
	public static String blocksImage = "/mDiyo/inficraft/infiblocks/textures/blocks.png";
	public static String techImage = "/mDiyo/inficraft/infiblocks/textures/tech.png";
}