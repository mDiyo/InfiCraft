package inficraft.infitools;

import inficraft.infitools.crafting.*;
import inficraft.infitools.tools.*;
import net.minecraft.item.Item;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.LanguageRegistry;

/* InfiTools
 * Now with many much more combinations and many much less IDs!
 * @author: mDiyo
 */

@Mod(modid = "InfiTools", name = "InfiTools", version = "Test")
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
		theOneTool = new Pickaxe(PHInfiTools.pickaxe);
		LanguageRegistry.addName(theOneTool, "Unnamed Sword");
		toolRod = new ToolRod(PHInfiTools.toolRod).setItemName("ToolRod");
		woodPattern = new Pattern(PHInfiTools.woodPattern, 128).setItemName("WoodPattern");
		stonePattern = new Pattern(PHInfiTools.woodPattern, 144).setItemName("StonePattern");
		tab = new TabInfiTools("InfiTools");
	}
	
	public Item theOneTool;
	public Item toolRod;
	public Item woodPattern;
	public Item stonePattern;
	
	public static TabInfiTools tab;
	
	public static String craftingTexture = "/infitextures/baseItems.png";
	public static String pickaxeTexture = "/infitextures/pickaxes.png";
	public static String swordTexture = "/infitextures/swordsinvert.png";
	public static String shovelTexture = "/infitextures/shovels.png";
	public static String axeTexture = "/infitextures/axes.png";
}
