package mdiyo.inficraft.flora.trees;
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

import mdiyo.inficraft.flora.crops.FloraCrops;
import mdiyo.inficraft.flora.crops.FloraCropsCommonProxy;
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
import extrabiomes.api.BiomeManager;

@Mod(modid = "Flora Trees", name = "Flora and Soma Trees", version = "Anachrosim")
public class FloraTrees
{
	/* Proxies for sides, used for graphics processing */
	@SidedProxy(clientSide = "mdiyo.inficraft.flora.trees.client.FloraCropsClientProxy", serverSide = "mdiyo.inficraft.flora.trees.FloraCropsCommonProxy")
	public static FloraTreesCommonProxy proxy;
	
	/* Instance of this mod, used for grabbing prototype fields */
	@Instance
	public static FloraTrees instance;
	public static FloraTrees getInstance()
	{
		return instance;
	}

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
		
		GameRegistry.registerBlock(redwood, mdiyo.inficraft.flora.trees.RedwoodItem.class);
		GameRegistry.registerBlock(floraLeaves);
		GameRegistry.registerBlock(cherryLeaves);		
		GameRegistry.registerBlock(floraSapling, mdiyo.inficraft.flora.trees.FloraSaplingItem.class);
		
		GameRegistry.registerBlock(redwoodDoor);
	}
	
	@Init
	public void init(FMLInitializationEvent evt)
	{
		addWoodRecipes();
		addNames();
		
		MinecraftForge.registerEntity(net.minecraft.src.flora.trees.RedwoodBoat.class,
				this, 1, 20, 5, true);
		MinecraftForge.registerEntity(net.minecraft.src.flora.trees.BloodBoat.class,
				this, 2, 20, 5, true);
		MinecraftForge.registerEntity(net.minecraft.src.flora.trees.WhiteWoodBoat.class,
				this, 3, 20, 5, true);
		MinecraftForge.registerEntity(net.minecraft.src.flora.trees.EucalyptusBoat.class,
				this, 4, 20, 5, true);
		
		addEEsupport();
		mc = ModLoader.getMinecraftInstance();
		ModLoader.setInGameHook(this, true, false);
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
	
	/* Equivalent Exchange support, direct plug-in */
	public void addEEsupport()
    {
        try
        {
            Class class1 = Class.forName("mod_EE");
            Class class2 = Class.forName("EEProxy");
            System.out.println("Equivalent Exchange integration for Flora Trees activated");
            
	        int wood = 32;
	        EEProxy.setEMC(new ItemStack(redwood, 1, 0), wood);
	        EEProxy.setEMC(new ItemStack(redwood, 1, 1), wood);
	        EEProxy.setEMC(new ItemStack(redwood, 1, 2), wood / 4);
	        EEProxy.setEMC(new ItemStack(redwood, 1, 3), wood);
	        EEProxy.setEMC(new ItemStack(redwood, 1, 4), wood / 4);
	        EEProxy.setEMC(new ItemStack(redwood, 1, 5), wood);
	        EEProxy.setEMC(new ItemStack(redwood, 1, 6), wood / 4);
	        EEProxy.setEMC(new ItemStack(redwood, 1, 7), wood);
	        EEProxy.setEMC(new ItemStack(redwood, 1, 8), wood / 4);
	        EEProxy.setEMC(redwoodDoorItem.shiftedIndex, 48);
	            
	        EEProxy.setEMC(floraLeaves.blockID, 0, 1);
	        EEProxy.setEMC(floraLeaves.blockID, 1, 1);
	        EEProxy.setEMC(floraLeaves.blockID, 2, 1);
	        EEProxy.setEMC(cherryLeaves.blockID, 0, 1);
	        EEProxy.setEMC(cherryLeaves.blockID, 1, 1);
        }
        catch (Throwable throwable)
        {
            System.out.println("Equivalent Exchange integration for Flora Trees failed! Reason:");
            System.out.println(throwable);
        }
    }
	
	
	/* Renderers for boats */
	@Override
	public void addRenderer(Map map)
	{
		map.put(net.minecraft.src.flora.trees.RedwoodBoat.class, new RedwoodBoatRender());
		map.put(net.minecraft.src.flora.trees.BloodBoat.class, new BloodBoatRender());
		map.put(net.minecraft.src.flora.trees.WhiteWoodBoat.class, new WhiteBoatRender());
		map.put(net.minecraft.src.flora.trees.EucalyptusBoat.class, new EucalyptusBoatRender());
	}
	
	/* Temporary recipes for making custom wood behave like vanilla wood */
	public void addWoodRecipes()
	{
		int[] woodmeta = { 2, 4, 6, 8 }; //Full range of planks
		int[] shortwoodmeta = { 2, 6, 8 }; //No bloodwood
		for(int iter = 0; iter < woodmeta.length; iter++)
		{
			ModLoader.addRecipe(new ItemStack(redwood, 4, woodmeta[iter]), new Object[]
				{ "w", 'w', new ItemStack(redwood, 1, woodmeta[iter] - 1) });
			ModLoader.addRecipe(new ItemStack(Block.workbench), new Object[]
				{ "ww", "ww", 'w', new ItemStack(redwood, 1, woodmeta[iter]) });
			ModLoader.addRecipe(new ItemStack(Block.fenceGate, 1), new Object[]
				{ "#W#", "#W#", '#', Item.stick, Character.valueOf('W'), new ItemStack(redwood, 1, woodmeta[iter]) });
			ModLoader.addRecipe(new ItemStack(Block.jukebox, 1), new Object[]
			    { "###", "#X#", "###", '#', new ItemStack(redwood, 1, woodmeta[iter]), 'X', Item.diamond });
			ModLoader.addRecipe(new ItemStack(Block.music, 1), new Object[]
			    { "###", "#X#", "###", '#', new ItemStack(redwood, 1, woodmeta[iter]), 'X', Item.redstone });
			ModLoader.addRecipe(new ItemStack(Block.stairSingle, 3, 2), new Object[]
			    { "###", '#', new ItemStack(redwood, 1, woodmeta[iter]) });
			/*ModLoader.addRecipe(new ItemStack(Item.doorWood, 1), new Object[]
			    { "##", "##", "##", '#', new ItemStack(redwood, 1, woodmeta[iter]) });*/
			ModLoader.addRecipe(new ItemStack(Block.trapdoor, 2), new Object[]
			    { "###", "###", '#', new ItemStack(redwood, 1, woodmeta[iter]) });
			ModLoader.addRecipe(new ItemStack(Item.sign, 1), new Object[]
			    { "###", "###", " X ", '#', new ItemStack(redwood, 1, woodmeta[iter]), 'X', Item.stick });
			ModLoader.addRecipe(new ItemStack(Item.bowlEmpty, 4), new Object[]
			    { "# #", " # ", '#', new ItemStack(redwood, 1, woodmeta[iter]) });
			ModLoader.addRecipe(new ItemStack(Block.stairCompactPlanks, 4), new Object[]
			    { "#  ", "## ", "###", '#', new ItemStack(redwood, 1, woodmeta[iter]) });
			ModLoader.addRecipe(new ItemStack(Block.chest), new Object[]
					{ "###", "# #", "###", '#', new ItemStack(redwood, 1, woodmeta[iter]) });
			ModLoader.addRecipe(new ItemStack(Block.pressurePlatePlanks, 1), new Object[]
			    { "##", '#', new ItemStack(redwood, 1, woodmeta[iter]) });
			ModLoader.addRecipe(new ItemStack(Block.pistonBase, 1), new Object[]
			{ "TTT", "#X#", "#R#", '#', Block.cobblestone, 'X', Item.ingotIron, 'R', Item.redstone, 'T',
				new ItemStack(redwood, 1, woodmeta[iter]) });
			ModLoader.addRecipe(new ItemStack(Item.bed, 1), new Object[]
			{ "###", "XXX", '#', Block.cloth, 'X', new ItemStack(redwood, 1, woodmeta[iter]) });
			ModLoader.addRecipe(new ItemStack(floraBoat, 1, iter), new Object[]
			{ "# #", "###", '#', new ItemStack(redwood, 1, woodmeta[iter]) });
		}
		for(int iter = 0; iter < shortwoodmeta.length; iter++)
		{
			ModLoader.addRecipe(new ItemStack(Item.stick, 4, 0), new Object[]
			{ "w", "w", 'w', new ItemStack(redwood, 8, shortwoodmeta[iter]) });
			ModLoader.addRecipe(new ItemStack(Item.pickaxeWood), new Object[]
			{ "www", " | ", " | ", 'w', new ItemStack(redwood, 1, woodmeta[iter]), '|', Item.stick });
			ModLoader.addRecipe(new ItemStack(Item.shovelWood), new Object[]
			{ "w", "|", "|", 'w', new ItemStack(redwood, 1, woodmeta[iter]), '|', Item.stick });
			ModLoader.addRecipe(new ItemStack(Item.axeWood), new Object[]
			{ "ww ", "w| ", " | ", 'w', new ItemStack(redwood, 1, woodmeta[iter]), '|', Item.stick });
			ModLoader.addRecipe(new ItemStack(Item.swordWood), new Object[]
			{ "w", "w", "|", 'w', new ItemStack(redwood, 1, woodmeta[iter]), '|', Item.stick });
			ModLoader.addRecipe(new ItemStack(Item.hoeWood), new Object[]
			{ "ww", "| ", "| ", 'w', new ItemStack(redwood, 1, woodmeta[iter]), '|', Item.stick });
		}
		ModLoader.addRecipe(new ItemStack(redwoodDoorItem, 1), new Object[]
		{ "##", "##", "##", '#', new ItemStack(redwood, 1, woodmeta[0]) });
		ModLoader.addRecipe(new ItemStack(Item.doorWood, 1), new Object[]
		{ "##", "##", "##", '#', new ItemStack(redwood, 1, woodmeta[1]) });
		ModLoader.addRecipe(new ItemStack(Item.doorWood, 1), new Object[]
		{ "##", "##", "##", '#', new ItemStack(redwood, 1, woodmeta[2]) });
		ModLoader.addRecipe(new ItemStack(Item.doorWood, 1), new Object[]
		{ "##", "##", "##", '#', new ItemStack(redwood, 1, woodmeta[3]) });
		
		//Turn loags into charcoal
		FurnaceRecipes.smelting().addSmelting(redwood.blockID, 0, new ItemStack(Item.coal, 1, 1));
		FurnaceRecipes.smelting().addSmelting(redwood.blockID, 1, new ItemStack(Item.coal, 1, 1));
		FurnaceRecipes.smelting().addSmelting(redwood.blockID, 5, new ItemStack(Item.coal, 1, 1));
		FurnaceRecipes.smelting().addSmelting(redwood.blockID, 7, new ItemStack(Item.coal, 1, 1));
	}
	
	/* Ties a visible name to an internal name */
	private void addNames()
	{
		ModLoader.addName(floraSapling, "Sapling");
		ModLoader.addName(floraLeaves, "Leaves");
		ModLoader.addName(cherryLeaves, "Blossoms");
		ModLoader.addName(redwoodDoorItem, "Redwood Door");
		
		ModLoader.addLocalization("barkRedwood.name", "Redwood Bark");
		ModLoader.addLocalization("heartRedwood.name", "Redwood");
		ModLoader.addLocalization("planksRedwood.name", "Redwood Planks");
		ModLoader.addLocalization("bloodbarkRedwood.name", "Bloodbark");
		ModLoader.addLocalization("bloodplanksRedwood.name", "Bloodplanks");
		ModLoader.addLocalization("sakurabarkRedwood.name", "Wood");
		ModLoader.addLocalization("sakuraplanksRedwood.name", "White Planks");
		ModLoader.addLocalization("eucalyptusbarkRedwood.name", "Eucalyptus Wood");
		ModLoader.addLocalization("eucalyptusplanksRedwood.name", "Eucalyptus Planks");
		
		ModLoader.addLocalization("redwoodBoat.name", "Redwood Boat");
		ModLoader.addLocalization("bloodBoat.name", "Bloodwood Boat");
		ModLoader.addLocalization("whiteBoat.name", "White Boat");
		ModLoader.addLocalization("eucalyptusBoat.name", "Eucalyptus Boat");
	}
	
	/* Generates trees in the overworld 
	 * Current trees: Redwood, Sakura, Small Eucalyptus
	 */
	@Override
	public void generateSurface(World world, Random random, int xChunk, int zChunk)
	{
		int xCh, yCh, zCh;
		BiomeGenBase biome = world.getWorldChunkManager().getBiomeGenAt(xChunk + 16, zChunk + 16);
		
		if (biome == BiomeGenBase.forest || biome == BiomeManager.autumnwoods ||
				biome == BiomeManager.birchforest || biome == BiomeManager.pineforest ||
				biome == BiomeManager.rainforest || biome == BiomeManager.rainforest ||
				biome == BiomeManager.temperaterainforest || biome == BiomeManager.woodlands)
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
		
		if (biome == BiomeGenBase.plains || biome == BiomeManager.meadow)
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
		
		if (biome == BiomeGenBase.extremeHills || biome == BiomeManager.forestedhills
				|| biome == BiomeManager.greenhills)
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
	
	@Override
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
	@Override
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
}