package inficraft.armory;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
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
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

/**
 * InfiBlocks: Armory
 * Every good castle has a place to put its tools
 * Armor stands are entites!
 * @author: mDiyo
 */

@Mod(modid = "InfiArmory", name = "InfiTools Armory", version = "1.4.6_A2.1")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class InfiArmory 
{
	/* Proxies for sides, used for client-only processing */
	@SidedProxy(clientSide = "inficraft.armory.ArmoryProxyClient", serverSide = "inficraft.armory.ArmoryProxyCommon")
	public static ArmoryProxyCommon proxy;
	
	/* Instance of this mod, used for grabbing prototype fields */
	@Instance("InfiArmory")
	public static InfiArmory instance;
	
	@PreInit
	public void preInit(FMLPreInitializationEvent evt)
	{
		PHArmory.initProps();
		stoneRack = new Toolrack(PHArmory.rackBlock, Material.rock);
		GameRegistry.registerBlock(stoneRack, inficraft.armory.ToolrackItem.class, "ToolRack");
		GameRegistry.registerTileEntity(inficraft.armory.ToolrackLogic.class, "InfiToolrack");
		/*armorStand = new ArmorStand(1501, Material.rock);
		GameRegistry.registerBlock(armorStand, mDiyo.inficraft.armory.ArmorStandItem.class);
		GameRegistry.registerTileEntity(mDiyo.inficraft.armory.ArmorStandLogic.class, "InfiArmorStand");*/
		
		armorStandItem = new ArmorStandItem(PHArmory.armorItem).setItemName("infiarmorstand");
		LanguageRegistry.instance().addName(armorStandItem, "Armor Stand");
		
		EntityRegistry.registerModEntity(inficraft.armory.ArmorStandEntity.class, "Armor Stand", 0, this, 32, 5, true);
		NetworkRegistry.instance().registerGuiHandler(instance, new GuiHandler());
		
		GameRegistry.addRecipe(new ItemStack(InfiArmory.instance.armorStandItem, 1, 0), " c ", "csc", " b ", 's', Item.stick, 'c', Block.cobblestone, 'b', Block.stoneSingleSlab);
	}

	@Init
	public void init(FMLInitializationEvent evt) 
	{		
		proxy.registerRenderer();
		proxy.addNames();
		proxy.addRecipes();
	}
	
	/* Prototype fields, used elsewhere */
	public static Block stoneRack;
	public static Block woodRack;
	public static Block armorStand;
	public static Block pedestal;
	
	public static Item armorStandItem;
	
	public static String texture = "/tinkertextures/armory.png";
}
