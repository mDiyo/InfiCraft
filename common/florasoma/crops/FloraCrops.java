package florasoma.crops;
import inficraft.api.InfiTexturedItem;

import java.util.Random;

import net.minecraft.src.BiomeGenBase;
import net.minecraft.src.Block;
import net.minecraft.src.IBlockAccess;
import net.minecraft.src.Item;
import net.minecraft.src.ModLoader;
import net.minecraft.src.RenderBlocks;
import net.minecraft.src.Tessellator;
import net.minecraft.src.World;

import org.lwjgl.opengl.GL11;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = "Flora Crops", name = "Flora and Soma Crops", version = "1.4.5_2012.12.13")
public class FloraCrops
{
	/* Proxies for sides, used for graphics processing */
	@SidedProxy(clientSide = "florasoma.crops.FloraCropsClientProxy", serverSide = "florasoma.crops.FloraCropsCommonProxy")
	public static FloraCropsCommonProxy proxy;
	
	/* Instance of this mod, used for grabbing prototype fields */
	@Instance("Flora Crops")
	public static FloraCrops instance;
	
	@PreInit
	public void preInit(FMLPreInitializationEvent evt)
	{
		PHCrops.initProps();
		
		barleyItem = new BarleyItem(PHCrops.foodID).setIconCoord(0, 3).setItemName("barleyFood");
		floraCrops = new FloraCropBlock(PHCrops.floraCropsID, 80);
		barleySeed = new FloraSeeds(PHCrops.barleySeedID, floraCrops.blockID, Block.tilledField.blockID).setIconCoord(1, 2).setItemName("barleySeed");
		
		waterDrop = new CactusJuice(PHCrops.ingredientsID + 0, 2, false, 16).setIconCoord(3, 4).setItemName("waterDrop");
		
		wheatFlour = new InfiTexturedItem(PHCrops.ingredientsID + 2, "/infitextures/food.png", "Wheat Flour").setIconCoord(1, 0);
		wheatDough = new InfiTexturedItem(PHCrops.ingredientsID + 3, "/infitextures/food.png", "Wheat Dough").setIconCoord(2, 0);
		
		wheatBag = new SeedBag(PHCrops.wheatBagID, Block.crops, 0).setItemName("wheatBag").setIconIndex(0);
		barleyBag = new SeedBag(PHCrops.barleyBagID, floraCrops, 0).setItemName("barleyBag").setIconIndex(1);
		potatoBag = new SeedBag(PHCrops.potatoBagID, Block.potato, 0).setItemName("barleyBag").setIconIndex(2);
		carrotBag = new SeedBag(PHCrops.carrotBagID, Block.carrot, 0).setItemName("barleyBag").setIconIndex(5);
		netherWartBag = new SeedBag(PHCrops.netherWartBagID, Block.netherStalk, 0).setItemName("barleyBag").setIconIndex(6);
		
		ModLoader.registerBlock(floraCrops);
	}

	@Init
	public void init(FMLInitializationEvent evt)
	{
		GameRegistry.registerWorldGenerator(new CropWorldgen());

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

	public Item waterDrop;
	public Item wheatFlour;
	public Item wheatDough;	
	
	public Block floraCrops;
	
	public static int saguaroModel;

	public static String cropTexture = "/infitextures/crops.png";
	public static String seedTexture = "/infitextures/crops.png";
	public static String foodTexture = "/infitextures/crops.png";
}
