package florasoma.crops;
import inficraft.api.InfiTexturedItem;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.src.ModLoader;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import florasoma.common.FloraSomaTab;
import florasoma.crops.blocks.BerryBush;
import florasoma.crops.blocks.FloraCropBlock;
import florasoma.crops.items.BarleyItem;
import florasoma.crops.items.BerryItem;
import florasoma.crops.items.CactusJuice;
import florasoma.crops.items.FloraSeeds;
import florasoma.crops.items.SeedBag;
import florasoma.crops.worldgen.CropBaseWorldgen;

/**
 * Flora & Soma: Crops
 * Bringing hunger to its knees with accessable food.
 * @author: mDiyo
 */

@Mod(modid = "Flora Crops", name = "Flora and Soma Crops", version = "1.4.6_2013.1.12")
public class FloraCrops
{
	/* Proxies for sides, used for graphics processing */
	@SidedProxy(clientSide = "florasoma.crops.client.FloraCropsClientProxy", serverSide = "florasoma.crops.FloraCropsCommonProxy")
	public static FloraCropsCommonProxy proxy;
	
	/* Instance of this mod, used for grabbing prototype fields */
	@Instance("Flora Crops")
	public static FloraCrops instance;
	
	@PreInit
	public void preInit(FMLPreInitializationEvent evt)
	{
		PHCrops.initProps();
		
		barleyItem = new BarleyItem(PHCrops.foodID).setIconCoord(0, 3).setItemName("barleyFood");
		crops = new FloraCropBlock(PHCrops.floraCropsID, 80);
		barleySeed = new FloraSeeds(PHCrops.barleySeedID, crops.blockID, Block.tilledField.blockID).setIconCoord(1, 2).setItemName("barleySeed");
		
		waterDrop = new CactusJuice(PHCrops.ingredientsID + 0, 2, false, 16).setIconCoord(3, 4).setItemName("waterDrop");
		
		wheatFlour = new InfiTexturedItem(PHCrops.ingredientsID + 2, "/infitextures/food.png", "Wheat Flour", CreativeTabs.tabFood).setIconCoord(1, 0);
		wheatDough = new InfiTexturedItem(PHCrops.ingredientsID + 3, "/infitextures/food.png", "Wheat Dough", CreativeTabs.tabFood).setIconCoord(2, 0);
		
		wheatBag = new SeedBag(PHCrops.wheatBagID, Block.crops, 0).setItemName("wheatBag").setIconIndex(0);
		barleyBag = new SeedBag(PHCrops.barleyBagID, crops, 0).setItemName("barleyBag").setIconIndex(1);
		potatoBag = new SeedBag(PHCrops.potatoBagID, Block.potato, 0).setItemName("potatoBag").setIconIndex(2);
		carrotBag = new SeedBag(PHCrops.carrotBagID, Block.carrot, 0).setItemName("carrotBag").setIconIndex(5);
		netherWartBag = new SeedBag(PHCrops.netherWartBagID, Block.netherStalk, 0).setItemName("wartBag").setIconIndex(6);		

		berryItem = new BerryItem(PHCrops.berryItemID, 1).setItemName("berry");
		berryBush = new BerryBush(PHCrops.berryBlockID, 0);
		GameRegistry.registerBlock(berryBush, florasoma.crops.blocks.BerryBushItem.class, "BerryBush");
		
		GameRegistry.registerBlock(crops, "Flora Crops");
	}

	@Init
	public void init(FMLInitializationEvent evt)
	{
		GameRegistry.registerWorldGenerator(new CropBaseWorldgen());
		FloraSomaTab.init(wheatBag.itemID);
		proxy.registerRenderer();
		proxy.addRecipes();
		proxy.addNames();
	}
	
	/* Prototype fields, used elsewhere */
	
	public Item wheatBag;
	public Item barleyBag;
	public Item potatoBag;
	public Item carrotBag;
	public Item netherWartBag;
	
	public Item barleySeed;
	public Item barleyItem;
	public Item berryItem;

	public Item waterDrop;
	public Item wheatFlour;
	public Item wheatDough;	
	
	public Block crops;
	public BerryBush berryBush;
	
	public Block baseHerb;
	public Block bloodyHerb;
	public Block manaHerb;
	public Block whiteHerb;
	public Block poisonHerb;
	public Block leafyHerb;
	public Block orangeHerb;
	
	public static int berryModelID;

	public static String bushTexture = "/floratextures/bushes.png";
	public static String seedTexture = "/floratextures/seeds.png";
	public static String cropTexture = "/floratextures/crops.png";
}
