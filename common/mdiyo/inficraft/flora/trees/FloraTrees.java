package mDiyo.inficraft.flora.trees;

import mDiyo.inficraft.flora.trees.blocks.FloraDoor;
import mDiyo.inficraft.flora.trees.blocks.FloraDoorItem;
import mDiyo.inficraft.flora.trees.blocks.FloraLeaves;
import mDiyo.inficraft.flora.trees.blocks.FloraLeavesNocolor;
import mDiyo.inficraft.flora.trees.blocks.FloraSaplingBlock;
import mDiyo.inficraft.flora.trees.blocks.LogTwoxTwo;
import mDiyo.inficraft.flora.trees.blocks.SimpleLog;
import mDiyo.inficraft.flora.trees.blocks.TreeBlock;
import mDiyo.inficraft.flora.trees.entities.FloraBoat;
import mDiyo.inficraft.flora.trees.worldgen.TreeWorldgen;
import net.minecraft.src.Block;
import net.minecraft.src.Item;
import net.minecraft.src.Material;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = "Flora Trees", name = "Flora and Soma Trees", version = "1.4.5_2012.12.3")
public class FloraTrees
{
	/* Proxies for sides, used for graphics processing */
	@SidedProxy(clientSide = "mDiyo.inficraft.flora.trees.FloraTreesClientProxy", serverSide = "mDiyo.inficraft.flora.trees.FloraTreesCommonProxy")
	public static FloraTreesCommonProxy proxy;
	
	/* Instance of this mod, used for grabbing prototype fields */
	@Instance("Flora Trees")
	public static FloraTrees instance;

	/* Initial loading, used to define blocks, items, and entities */
	
	@PreInit
	public void preInit(FMLPreInitializationEvent evt)
	{
		PHTrees.initProps();
		
		tree = new TreeBlock(PHTrees.treeID);
		redwood = new SimpleLog(PHTrees.redwoodID, 32, texture);
		floraLeaves = new FloraLeaves(PHTrees.floraLeavesID, 112);
		floraLeavesNoColor = new FloraLeavesNocolor(PHTrees.cherryLeavesID, 115);
		floraSapling = new FloraSaplingBlock(PHTrees.floraSaplingID);
		
		redwoodDoorItem = new FloraDoorItem(PHTrees.redwoodDoorItemID, PHTrees.redwoodDoorID).setIconCoord(3, 9).setItemName("redwoodDoorItem");
		redwoodDoor = new FloraDoor(PHTrees.redwoodDoorID, 162, Material.wood, redwoodDoorItem.shiftedIndex);		
		
		bloodwood = new LogTwoxTwo(2000, 48, texture, 8f).setBlockName("bloodwood");
		
		floraBoat = new FloraBoat(PHTrees.boatItemID).setIconCoord(0, 3).setItemName("floraBoat");
		
		GameRegistry.registerBlock(tree, mDiyo.inficraft.flora.trees.blocks.TreeItem.class);
		GameRegistry.registerBlock(redwood);
		GameRegistry.registerBlock(floraLeaves, mDiyo.inficraft.flora.trees.blocks.FloraLeavesItem.class);
		GameRegistry.registerBlock(floraLeavesNoColor);
		GameRegistry.registerBlock(floraSapling, mDiyo.inficraft.flora.trees.blocks.FloraSaplingItem.class);
		
		GameRegistry.registerBlock(redwoodDoor);
		
		GameRegistry.registerBlock(bloodwood, mDiyo.inficraft.flora.trees.blocks.LogTwoxTwoItem.class);
	}
	

	/* Used for defining blocks and items */	
	@Init
	public void init(FMLInitializationEvent evt)
	{
		//proxy.addRecipes();
		proxy.addNames();
		proxy.registerRenderer();
		
		GameRegistry.registerWorldGenerator(new TreeWorldgen());
		
		/*MinecraftForge.registerEntity(net.minecraft.src.flora.trees.RedwoodBoat.class,
				this, 1, 20, 5, true);
		MinecraftForge.registerEntity(net.minecraft.src.flora.trees.BloodBoat.class,
				this, 2, 20, 5, true);
		MinecraftForge.registerEntity(net.minecraft.src.flora.trees.WhiteWoodBoat.class,
				this, 3, 20, 5, true);
		MinecraftForge.registerEntity(net.minecraft.src.flora.trees.EucalyptusBoat.class,
				this, 4, 20, 5, true);
		
		mc = ModLoader.getMinecraftInstance();
		ModLoader.setInGameHook(this, true, false);*/
	}
	
	/* Renderers for boats */
	/*@Override
	public void addRenderer(Map map)
	{
		map.put(net.minecraft.src.flora.trees.RedwoodBoat.class, new RedwoodBoatRender());
		map.put(net.minecraft.src.flora.trees.BloodBoat.class, new BloodBoatRender());
		map.put(net.minecraft.src.flora.trees.WhiteWoodBoat.class, new WhiteBoatRender());
		map.put(net.minecraft.src.flora.trees.EucalyptusBoat.class, new EucalyptusBoatRender());
	}*/
	
	
	
	/* Used for changing the leaf block's transparency and visible faces */
	//@Override
	/*public boolean onTickInGame(float tick, Minecraft game)
	{
		floraLeaves.setGraphicsLevel(mc.gameSettings.fancyGraphics);
		return true;
	}*/
	
	/* Prototype fields, used elsewhere */
	
	public static Block tree;
	public static Block redwood;
	public static Block planks;
	public static Block bloodwood;
	
	public static FloraLeaves floraLeaves;
	public static FloraLeaves floraLeavesNoColor;
	public static Block floraSapling;
	
	public static Block redwoodDoor;
	public static Item redwoodDoorItem;
	
	public static Item floraBoat;
	
	//private Minecraft mc;
	
	public static String texture = "/infitextures/trees.png";
}