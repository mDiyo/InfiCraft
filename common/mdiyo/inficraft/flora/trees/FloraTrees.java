package mDiyo.inficraft.flora.trees;
import java.util.Map;
import java.util.Random;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

import mDiyo.inficraft.flora.crops.FloraCrops;
import mDiyo.inficraft.flora.crops.FloraCropsCommonProxy;
import net.minecraft.client.Minecraft;
import net.minecraft.src.BiomeGenBase;
import net.minecraft.src.Block;
import net.minecraft.src.FurnaceRecipes;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;
import net.minecraft.src.Material;
import net.minecraft.src.ModLoader;
import net.minecraft.src.World;
import net.minecraftforge.client.MinecraftForgeClient;
import net.minecraftforge.common.MinecraftForge;

@Mod(modid = "Flora Trees", name = "Flora and Soma Trees", version = "Anachrosim")
public class FloraTrees
{
	/* Proxies for sides, used for graphics processing */
	@SidedProxy(clientSide = "mDiyo.inficraft.flora.trees.client.FloraTreesClientProxy", serverSide = "mDiyo.inficraft.flora.trees.FloraTreesCommonProxy")
	public static FloraTreesCommonProxy proxy;
	
	/* Instance of this mod, used for grabbing prototype fields */
	@Instance("Flora Trees")
	public static FloraTrees instance;

	/* Initial loading, used to define blocks, items, and entities */
	
	@PreInit
	public void preInit(FMLPreInitializationEvent evt)
	{
		PHTrees.initProps();
		
		redwood = new RedwoodBlock(PHTrees.redwoodID);
		floraLeaves = new FloraLeaves(PHTrees.floraLeavesID, 4);
		cherryLeaves = new CherryLeaves(PHTrees.cherryLeavesID, 7);
		floraSapling = new FloraSaplingBlock(PHTrees.floraSaplingID);
		
		redwoodDoorItem = new FloraDoorItem(PHTrees.redwoodDoorItemID, PHTrees.redwoodDoorID).setIconCoord(3, 9).setItemName("redwoodDoorItem");
		redwoodDoor = new FloraDoor(PHTrees.redwoodDoorID, 162, Material.wood, redwoodDoorItem.shiftedIndex);		
				
		floraBoat = new FloraBoat(PHTrees.boatItemID).setIconCoord(0, 3).setItemName("floraBoat");
		
		GameRegistry.registerBlock(redwood, mDiyo.inficraft.flora.trees.RedwoodItem.class);
		GameRegistry.registerBlock(floraLeaves);
		GameRegistry.registerBlock(cherryLeaves);		
		GameRegistry.registerBlock(floraSapling, mDiyo.inficraft.flora.trees.FloraSaplingItem.class);
		
		GameRegistry.registerBlock(redwoodDoor);
	}
	
	@Init
	public void init(FMLInitializationEvent evt)
	{
		proxy.addRecipes();
		proxy.addNames();
		proxy.registerRenderer();
		
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
		MinecraftForgeClient.preloadTexture("/floratex/plantblocks.png");
	}
	
	/* Used for defining blocks and items */
	public void init()
	{
		genRedwood = new RedwoodTreeGen(false);
		genBlood = new BloodTreeGen(3, 1);
		sakura = new CherryTreeGen(false, redwood.blockID, 0);
		whiteSakura = new WhiteTreeGen(false, redwood.blockID, 1);
		eucalyptusShort = new EucalyptusTreeGenShort(7, 2);
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
	
	/* Ties a visible name to an internal name */
	private void addNames()
	{
		
	}
	
	/* Generates trees in the overworld 
	 * Current trees: Redwood, Sakura, Small Eucalyptus
	 */
	//@Override
	public void generateSurface(World world, Random random, int xChunk, int zChunk)
	{
		int xCh, yCh, zCh;
		BiomeGenBase biome = world.getWorldChunkManager().getBiomeGenAt(xChunk + 16, zChunk + 16);
		String name = biome.biomeName;
		
		if (name == "Forest" || name == "AutumnWoods" ||
				name == "BirchForest" || name == "PineForest" ||
				name == "Rainforest" || 
				name == "TemperateRainforest" || name == "Woodlands")
		{
			if(PHTrees.generateSakura && random.nextInt((int)(PHTrees.sakuraSpawnDensity * 1.4)) == 0)
			{
				for (int iter = 0; iter < PHTrees.sakuraSpawnDensity; iter++)
				{
					yCh = random.nextInt(PHTrees.sakuraSpawnRange) + PHTrees.sakuraSpawnHeight;
					xCh = xChunk + random.nextInt(16) + 8;
					zCh = zChunk + random.nextInt(16) + 8;
					sakura.generate(world, random, xCh, yCh, zCh);
				}
			}

			if (PHTrees.generateSmallEucalyptus && random.nextInt(PHTrees.eucalyptusShortSpawnDensity) == 0)
			{
				yCh = random.nextInt(PHTrees.eucalyptusShortSpawnRange) + PHTrees.eucalyptusShortSpawnHeight;
				xCh = xChunk + random.nextInt(16) + 8;
				zCh = zChunk + random.nextInt(16) + 8;
				eucalyptusShort.generate(world, random, xCh, yCh, zCh);
			}
		}
		
		if (name == "Plains" || name == "Meadow")
		{
			if(PHTrees.generateRedwood && random.nextInt((int)(PHTrees.redwoodSpawnDensity / 2)) == 0)
			{
				xCh = xChunk + random.nextInt(16) + 8;
				yCh = random.nextInt(PHTrees.redwoodSpawnRange) + PHTrees.redwoodSpawnHeight;
				zCh = zChunk + random.nextInt(16) + 8;
				genRedwood.generate(world, random, xCh, yCh, zCh);
			}
			
			if (PHTrees.generateSakura)
            {
				for (int iter = 0; iter < (int)(PHTrees.sakuraSpawnDensity * 0.1); iter++)
				{
					xCh = xChunk + random.nextInt(16) + 8;
					yCh = random.nextInt(PHTrees.sakuraSpawnRange) + PHTrees.sakuraSpawnHeight;
					zCh = zChunk + random.nextInt(16) + 8;
					sakura.generate(world, random, xCh, yCh, zCh);
				}
            }
			
			if (PHTrees.generateSmallEucalyptus && random.nextInt((int)(PHTrees.eucalyptusShortSpawnDensity * 2)) == 0)
			{
				xCh = xChunk + random.nextInt(16) + 8;
				yCh = random.nextInt(32) + 64;
				zCh = zChunk + random.nextInt(16) + 8;
				eucalyptusShort.generate(world, random, xCh, yCh, zCh);
			}
		}
		
		if (name == "ExtremeHills" || name == "ForestedHills"
				|| name == "GreenHills")
		{
			if(PHTrees.generateSakura && random.nextInt(PHTrees.sakuraSpawnDensity) == 0) 
			{
				for (int iter = 0; iter < PHTrees.sakuraSpawnDensity / 3; iter++)
				{
					xCh = xChunk + random.nextInt(16) + 8;
					yCh = random.nextInt(PHTrees.sakuraSpawnRange) + PHTrees.sakuraSpawnHeight + 16;
					zCh = zChunk + random.nextInt(16) + 8;
					sakura.generate(world, random, xCh, yCh, zCh);
				}
			}
			
			if (PHTrees.generateSmallEucalyptus && random.nextInt(PHTrees.eucalyptusShortSpawnDensity) < 10)
			{
				xCh = xChunk + random.nextInt(16) + 8;
				yCh = random.nextInt(PHTrees.eucalyptusShortSpawnRange) + PHTrees.eucalyptusShortSpawnHeight + 16;
				zCh = zChunk + random.nextInt(16) + 8;
				eucalyptusShort.generate(world, random, xCh, yCh, zCh);
			}
		}
		if (biome == BiomeGenBase.river && PHTrees.generateSakura)
		{
			for (int iter = 0; iter < PHTrees.sakuraSpawnDensity; iter++) 
			{
				xCh = xChunk + random.nextInt(16) + 8;
				yCh = random.nextInt(PHTrees.sakuraSpawnRange) + PHTrees.sakuraSpawnHeight;
				zCh = zChunk + random.nextInt(16) + 8;
				sakura.generate(world, random, xCh, yCh, zCh);
			}
		}
	}
	
	/* Generate trees in the Nether
	 * Current trees: Bloodwood, Ghost
	 */
	
	//@Override
	public void generateNether(World world, Random random, int i, int j)
	{
		int xCor = i + random.nextInt(16) + 8;
		int yCor = random.nextInt(PHTrees.bloodSpawnRange) + PHTrees.bloodSpawnHeight;
		int zCor = j + random.nextInt(16) + 8;
		if (PHTrees.generateBloodwood && random.nextInt(PHTrees.bloodSpawnDensity) == 0)
		{
			genBlood.generate(world, random, xCor, yCor, zCor);
			
			for (int iter = 0; iter < PHTrees.whiteSpawnDensity; iter++)
			{
				int xDo = i + random.nextInt(16) + 8;
				int yDo = random.nextInt(PHTrees.whiteSpawnRange) + PHTrees.whiteSpawnHeight;
				int zDo = j + random.nextInt(16) + 8;
				whiteSakura.generate(world, random, xDo, yDo, zDo);
			}
		}
		
		if (PHTrees.generateGhost)
		{
			for (int iter = 0; iter < PHTrees.whiteSpawnDensity; iter++)
			{
				int xDo = i + random.nextInt(16) + 8;
				int yDo = random.nextInt(PHTrees.whiteSpawnRange) + PHTrees.whiteSpawnHeight;
				int zDo = j + random.nextInt(16) + 8;
				whiteSakura.generate(world, random, xDo, yDo, zDo);
			}
		}
	}
	
	/* Used for changing the leaf block's transparency and visible faces */
	//@Override
	public boolean onTickInGame(float tick, Minecraft game)
	{
		((CherryLeaves) cherryLeaves).setGraphicsLevel(mc.gameSettings.fancyGraphics);
		((FloraLeaves) floraLeaves).setGraphicsLevel(mc.gameSettings.fancyGraphics);
		return true;
	}
	
	/* Prototype fields, used elsewhere */
	
	RedwoodTreeGen genRedwood;
	BloodTreeGen genBlood;
	CherryTreeGen sakura;
	WhiteTreeGen whiteSakura;
	EucalyptusTreeGenShort eucalyptusShort;
	
	public static Block redwood;
	public static Block floraLeaves;
	public static Block cherryLeaves;
	public static Block floraSapling;
	
	public static Block redwoodDoor;
	public static Item redwoodDoorItem;
	
	public static Item floraBoat;
	
	private Minecraft mc;
	
	public static String texture = "/mDiyo/inficraft/flora/textures/trees.png";
}