package mDiyo.inficraft.infiblocks.client;

import mDiyo.inficraft.infiblocks.InfiBlockContent;
import mDiyo.inficraft.infiblocks.InfiBlocks;
import mDiyo.inficraft.infiblocks.InfiBlocksCommonProxy;
import mDiyo.inficraft.infiblocks.client.tech.FurnaceGui;
import mDiyo.inficraft.infiblocks.client.tech.WorkbenchGui;
import mDiyo.inficraft.infiblocks.tech.FurnaceLogic;
import net.minecraft.src.EntityPlayer;
import net.minecraft.src.World;
import net.minecraftforge.client.MinecraftForgeClient;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class InfiBlocksClientProxy extends InfiBlocksCommonProxy
{
	/* Registers any rendering code. */
	public void registerRenderer() 
	{
		MinecraftForgeClient.preloadTexture(InfiBlocks.blocksImage);
		MinecraftForgeClient.preloadTexture(InfiBlocks.techImage);
		MinecraftForgeClient.preloadTexture(InfiBlocks.bricksImage);
		
		InfiBlocks.getContentInstance().chestModelID = RenderingRegistry.getNextAvailableRenderId();
		InfiBlocks.getContentInstance().magicSlabModel = RenderingRegistry.getNextAvailableRenderId();
		InfiBlocks.getContentInstance().paneModelID = RenderingRegistry.getNextAvailableRenderId();
		InfiBlocks.getContentInstance().brickModelID = RenderingRegistry.getNextAvailableRenderId();
		
		RenderingRegistry.registerBlockHandler(new MagicSlabRender());
		RenderingRegistry.registerBlockHandler(new PaneRender());
		RenderingRegistry.registerBlockHandler(new BrickRender());
		
		//new ChestSpecialRenderer()
	}
	
	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world,
			int x, int y, int z) 
	{
		if (ID == craftingGuiID)
		{
			return new WorkbenchGui(player.inventory, world);
		}
		if (ID == furnaceGuiID)
		{
			return new FurnaceGui(player.inventory, (FurnaceLogic)world.getBlockTileEntity(x, y, z));
		}
		return null;
	}
	
	/* Ties an internal name to a visible one. */
	public void addNames() 
	{
		LanguageRegistry.instance().addStringLocalization("item.chiselIron.name", "Chisel");
		LanguageRegistry.instance().addStringLocalization("item.chiselDiamond.name", "Diamond Chisel");
		
		LanguageRegistry.instance().addStringLocalization("cobblestoneWorkbench.name", "Cobblestone Workbench");
		LanguageRegistry.instance().addStringLocalization("ironWorkbench.name", "Iron Workbench");
		LanguageRegistry.instance().addStringLocalization("redstoneWorkbench.name", "Redstone Workbench");
		LanguageRegistry.instance().addStringLocalization("boneWorkbench.name", "Bone Workbench");
		LanguageRegistry.instance().addStringLocalization("sandstoneWorkbench.name", "Sandstone Workbench");
		LanguageRegistry.instance().addStringLocalization("lapisWorkbench.name", "Lapis Lazuli Workbench");
		LanguageRegistry.instance().addStringLocalization("obsidianWorkbench.name", "Obsidian Workbench");
		LanguageRegistry.instance().addStringLocalization("cactusWorkbench.name", "Cactus Workbench");
		LanguageRegistry.instance().addStringLocalization("netherrackWorkbench.name", "Netherrack Workbench");
		LanguageRegistry.instance().addStringLocalization("iceWorkbench.name", "Ice Workbench");
		LanguageRegistry.instance().addStringLocalization("stoneBrickWorkbench.name", "Brick Workbench");
		
		LanguageRegistry.instance().addStringLocalization("whiteCarpet.name", "Carpet");
		LanguageRegistry.instance().addStringLocalization("orangeCarpet.name", "Orange Carpet");
		LanguageRegistry.instance().addStringLocalization("magentaCarpet.name", "Magenta Carpet");
		LanguageRegistry.instance().addStringLocalization("lightblueCarpet.name", "Light Blue Carpet");
		LanguageRegistry.instance().addStringLocalization("yellowCarpet.name", "Yellow Carpet");
		LanguageRegistry.instance().addStringLocalization("limeCarpet.name", "Lime Carpet");
		LanguageRegistry.instance().addStringLocalization("pinkCarpet.name", "Pink Carpet");
		LanguageRegistry.instance().addStringLocalization("grayCarpet.name", "Gray Carpet");
		LanguageRegistry.instance().addStringLocalization("lightgrayCarpet.name", "Light Gray Carpet");
		LanguageRegistry.instance().addStringLocalization("cyanCarpet.name", "Cyan Carpet");
		LanguageRegistry.instance().addStringLocalization("purpleCarpet.name", "Purple Carpet");
		LanguageRegistry.instance().addStringLocalization("blueCarpet.name", "Blue Carpet");
		LanguageRegistry.instance().addStringLocalization("brownCarpet.name", "Brown Carpet");
		LanguageRegistry.instance().addStringLocalization("greenCarpet.name", "Green Carpet");
		LanguageRegistry.instance().addStringLocalization("redCarpet.name", "Red Carpet");
		LanguageRegistry.instance().addStringLocalization("blackCarpet.name", "Black Carpet");
		
		LanguageRegistry.instance().addStringLocalization("ironFurnaceInfi.name", "Iron Furnace");
		LanguageRegistry.instance().addStringLocalization("brickFurnaceInfi.name", "Brick Furnace");
		LanguageRegistry.instance().addStringLocalization("sandstoneFurnaceInfi.name", "Sandstone Furnace");
		LanguageRegistry.instance().addStringLocalization("obsidianFurnaceInfi.name", "Obsidian Furnace");
		LanguageRegistry.instance().addStringLocalization("redstoneFurnaceInfi.name", "Redstone Furnace");
		LanguageRegistry.instance().addStringLocalization("netherrackFurnaceInfi.name", "Netherrack Furnace");
		LanguageRegistry.instance().addStringLocalization("stonebrickFurnaceInfi.name", "Brick Furnace");
		LanguageRegistry.instance().addStringLocalization("endstoneFurnaceInfi.name", "White Stone Furnace");
		LanguageRegistry.instance().addStringLocalization("glowstoneFurnaceInfi.name", "Glowstone Furnace");
		
		LanguageRegistry.instance().addStringLocalization("stoneMagicSlab.name", "Stone Magic Slab");
		LanguageRegistry.instance().addStringLocalization("slabstoneMagicSlab.name", "Magic Slab o' Stone");
		LanguageRegistry.instance().addStringLocalization("cobblestoneMagicSlab.name", "Cobbled Magic Slab");
		LanguageRegistry.instance().addStringLocalization("stonebrickMagicSlab.name", "Tiled Magic Slab");
		LanguageRegistry.instance().addStringLocalization("crackedstonebrickMagicSlab.name", "Tiled Magic Slab");
		LanguageRegistry.instance().addStringLocalization("mossystonebrickMagicSlab.name", "Tiled Magic Slab");
		LanguageRegistry.instance().addStringLocalization("brickMagicSlab.name", "Brick Magic Slab");
		LanguageRegistry.instance().addStringLocalization("mossyMagicSlab.name", "Mossy Magic Slab");
		LanguageRegistry.instance().addStringLocalization("obsidianMagicSlab.name", "Obsidian Magic Slab");
		LanguageRegistry.instance().addStringLocalization("netherrackMagicSlab.name", "Netherrack Magic Slab");
		LanguageRegistry.instance().addStringLocalization("sandstoneMagicSlab.name", "Sandstone Magic Slab");
		LanguageRegistry.instance().addStringLocalization("ironMagicSlab.name", "Iron Magic Slab");
		LanguageRegistry.instance().addStringLocalization("goldMagicSlab.name", "Gold Magic Slab");
		LanguageRegistry.instance().addStringLocalization("diamondMagicSlab.name", "Diamond Magic Slab");
		LanguageRegistry.instance().addStringLocalization("endstoneMagicSlab.name", "White Magic Slab");
		LanguageRegistry.instance().addStringLocalization("netherBrickMagicSlab.name", "Nether Brick Magic Slab");
		
		LanguageRegistry.instance().addStringLocalization("dirtMagicSlab.name", "Dirt Magic Slab");
		LanguageRegistry.instance().addStringLocalization("grassMagicSlab.name", "Grass Magic Slab");
		LanguageRegistry.instance().addStringLocalization("myceliumMagicSlab.name", "Mycelium Magic Slab");
		LanguageRegistry.instance().addStringLocalization("sandMagicSlab.name", "Sand Magic Slab");
		LanguageRegistry.instance().addStringLocalization("gravelMagicSlab.name", "Gravel Magic Slab");
		LanguageRegistry.instance().addStringLocalization("oakMagicSlab.name", "Oak Magic Slab");
		LanguageRegistry.instance().addStringLocalization("pineMagicSlab.name", "Pine Magic Slab");
		LanguageRegistry.instance().addStringLocalization("birchMagicSlab.name", "Birch Magic Slab");
		LanguageRegistry.instance().addStringLocalization("planksMagicSlab.name", "Plank Magic Slab");
		LanguageRegistry.instance().addStringLocalization("snowMagicSlab.name", "Snow Magic Slab");
		LanguageRegistry.instance().addStringLocalization("soulsandMagicSlab.name", "Soul Sand Magic Slab");
		LanguageRegistry.instance().addStringLocalization("brownMushroomMagicSlab.name", "Brown Mushroom Magic Slab");
		LanguageRegistry.instance().addStringLocalization("redMushroomMagicSlab.name", "Red Mushroom Magic Slab");
		LanguageRegistry.instance().addStringLocalization("glowstoneMagicSlab.name", "Glowstone Magic Slab");
		LanguageRegistry.instance().addStringLocalization("glassMagicSlab.name", "Glass Magic Slab");
		LanguageRegistry.instance().addStringLocalization("oakLeavesMagicSlab.name", "Leaves Magic Slab");
		
		LanguageRegistry.instance().addStringLocalization("whiteMagicSlab.name", "Wool Magic Slab");
		LanguageRegistry.instance().addStringLocalization("orangeMagicSlab.name", "Orange Magic Slab");
		LanguageRegistry.instance().addStringLocalization("magentaMagicSlab.name", "Magenta Magic Slab");
		LanguageRegistry.instance().addStringLocalization("lightblueMagicSlab.name", "Light Blue Magic Slab");
		LanguageRegistry.instance().addStringLocalization("yellowMagicSlab.name", "Yellow Magic Slab");
		LanguageRegistry.instance().addStringLocalization("limeMagicSlab.name", "Lime Magic Slab");
		LanguageRegistry.instance().addStringLocalization("pinkMagicSlab.name", "Pink Magic Slab");
		LanguageRegistry.instance().addStringLocalization("grayMagicSlab.name", "Gray Magic Slab");
		LanguageRegistry.instance().addStringLocalization("lightgrayMagicSlab.name", "Light Gray Magic Slab");
		LanguageRegistry.instance().addStringLocalization("cyanMagicSlab.name", "Cyan Magic Slab");
		LanguageRegistry.instance().addStringLocalization("purpleMagicSlab.name", "Purple Magic Slab");
		LanguageRegistry.instance().addStringLocalization("blueMagicSlab.name", "Blue Magic Slab");
		LanguageRegistry.instance().addStringLocalization("brownMagicSlab.name", "Brown Magic Slab");
		LanguageRegistry.instance().addStringLocalization("greenMagicSlab.name", "Green Magic Slab");
		LanguageRegistry.instance().addStringLocalization("redMagicSlab.name", "Red Magic Slab");
		LanguageRegistry.instance().addStringLocalization("blackMagicSlab.name", "Black Magic Slab");
		
		LanguageRegistry.instance().addStringLocalization("whiteGlass.name", "White Glass");
		LanguageRegistry.instance().addStringLocalization("orangeGlass.name", "Orange Glass");
		LanguageRegistry.instance().addStringLocalization("magentaGlass.name", "Magenta Glass");
		LanguageRegistry.instance().addStringLocalization("lightblueGlass.name", "Light Blue Glass");
		LanguageRegistry.instance().addStringLocalization("yellowGlass.name", "Yellow Glass");
		LanguageRegistry.instance().addStringLocalization("limeGlass.name", "Lime Glass");
		LanguageRegistry.instance().addStringLocalization("pinkGlass.name", "Pink Glass");
		LanguageRegistry.instance().addStringLocalization("grayGlass.name", "Gray Glass");
		LanguageRegistry.instance().addStringLocalization("lightgrayGlass.name", "Light Gray Glass");
		LanguageRegistry.instance().addStringLocalization("cyanGlass.name", "Cyan Glass");
		LanguageRegistry.instance().addStringLocalization("purpleGlass.name", "Purple Glass");
		LanguageRegistry.instance().addStringLocalization("blueGlass.name", "Blue Glass");
		LanguageRegistry.instance().addStringLocalization("brownGlass.name", "Brown Glass");
		LanguageRegistry.instance().addStringLocalization("greenGlass.name", "Green Glass");
		LanguageRegistry.instance().addStringLocalization("redGlass.name", "Red Glass");
		LanguageRegistry.instance().addStringLocalization("blackGlass.name", "Black Glass");
		
		LanguageRegistry.instance().addStringLocalization("whiteGlassPane.name", "White Glass Pane");
		LanguageRegistry.instance().addStringLocalization("orangeGlassPane.name", "Orange Glass Pane");
		LanguageRegistry.instance().addStringLocalization("magentaGlassPane.name", "Magenta Glass Pane");
		LanguageRegistry.instance().addStringLocalization("lightblueGlassPane.name", "Light Blue Glass Pane");
		LanguageRegistry.instance().addStringLocalization("yellowGlassPane.name", "Yellow Glass Pane");
		LanguageRegistry.instance().addStringLocalization("limeGlassPane.name", "Lime Glass Pane");
		LanguageRegistry.instance().addStringLocalization("pinkGlassPane.name", "Pink Glass Pane");
		LanguageRegistry.instance().addStringLocalization("grayGlassPane.name", "Gray Glass Pane");
		LanguageRegistry.instance().addStringLocalization("lightgrayGlassPane.name", "Light Gray Glass Pane");
		LanguageRegistry.instance().addStringLocalization("cyanGlassPane.name", "Cyan Glass Pane");
		LanguageRegistry.instance().addStringLocalization("purpleGlassPane.name", "Purple Glass Pane");
		LanguageRegistry.instance().addStringLocalization("blueGlassPane.name", "Blue Glass Pane");
		LanguageRegistry.instance().addStringLocalization("brownGlassPane.name", "Brown Glass Pane");
		LanguageRegistry.instance().addStringLocalization("greenGlassPane.name", "Green Glass Pane");
		LanguageRegistry.instance().addStringLocalization("redGlassPane.name", "Red Glass Pane");
		LanguageRegistry.instance().addStringLocalization("blackGlassPane.name", "Black Glass Pane");
		
		LanguageRegistry.instance().addStringLocalization("whiteGlassSlab.name", "White Glass Magic Slab");
		LanguageRegistry.instance().addStringLocalization("orangeGlassSlab.name", "Orange Glass Magic Slab");
		LanguageRegistry.instance().addStringLocalization("magentaGlassSlab.name", "Magenta Glass Magic Slab");
		LanguageRegistry.instance().addStringLocalization("lightblueGlassSlab.name", "Light Blue Glass Magic Slab");
		LanguageRegistry.instance().addStringLocalization("yellowGlassSlab.name", "Yellow Glass Magic Slab");
		LanguageRegistry.instance().addStringLocalization("limeGlassSlab.name", "Lime Glass Magic Slab");
		LanguageRegistry.instance().addStringLocalization("pinkGlassSlab.name", "Pink Glass Magic Slab");
		LanguageRegistry.instance().addStringLocalization("grayGlassSlab.name", "Gray Glass Magic Slab");
		LanguageRegistry.instance().addStringLocalization("lightgrayGlassSlab.name", "Light Gray Glass Magic Slab");
		LanguageRegistry.instance().addStringLocalization("cyanGlassSlab.name", "Cyan Glass Magic Slab");
		LanguageRegistry.instance().addStringLocalization("purpleGlassSlab.name", "Purple Glass Magic Slab");
		LanguageRegistry.instance().addStringLocalization("blueGlassSlab.name", "Blue Glass Magic Slab");
		LanguageRegistry.instance().addStringLocalization("brownGlassSlab.name", "Brown Glass Magic Slab");
		LanguageRegistry.instance().addStringLocalization("greenGlassSlab.name", "Green Glass Magic Slab");
		LanguageRegistry.instance().addStringLocalization("redGlassSlab.name", "Red Glass Magic Slab");
		LanguageRegistry.instance().addStringLocalization("blackGlassSlab.name", "Black Glass Magic Slab");
		
		LanguageRegistry.instance().addStringLocalization("whiteGlassStair.name", "White Glass Magic Stair");
		LanguageRegistry.instance().addStringLocalization("orangeGlassStair.name", "Orange Glass Magic Stair");
		LanguageRegistry.instance().addStringLocalization("magentaGlassStair.name", "Magenta Glass Magic Stair");
		LanguageRegistry.instance().addStringLocalization("lightblueGlassStair.name", "Light Blue Glass Magic Stair");
		LanguageRegistry.instance().addStringLocalization("yellowGlassStair.name", "Yellow Glass Magic Stair");
		LanguageRegistry.instance().addStringLocalization("limeGlassStair.name", "Lime Glass Magic Stair");
		LanguageRegistry.instance().addStringLocalization("pinkGlassStair.name", "Pink Glass Magic Stair");
		LanguageRegistry.instance().addStringLocalization("grayGlassStair.name", "Gray Glass Magic Stair");
		LanguageRegistry.instance().addStringLocalization("lightgrayGlassStair.name", "Light Gray Glass Magic Stair");
		LanguageRegistry.instance().addStringLocalization("cyanGlassStair.name", "Cyan Glass Magic Stair");
		LanguageRegistry.instance().addStringLocalization("purpleGlassStair.name", "Purple Glass Magic Stair");
		LanguageRegistry.instance().addStringLocalization("blueGlassStair.name", "Blue Glass Magic Stair");
		LanguageRegistry.instance().addStringLocalization("brownGlassStair.name", "Brown Glass Magic Stair");
		LanguageRegistry.instance().addStringLocalization("greenGlassStair.name", "Green Glass Magic Stair");
		LanguageRegistry.instance().addStringLocalization("redGlassStair.name", "Red Glass Magic Stair");
		LanguageRegistry.instance().addStringLocalization("blackGlassStair.name", "Black Glass Magic Stair");
		
		LanguageRegistry.instance().addStringLocalization("obsidianBrick.name", "Obsidian Brick");
		LanguageRegistry.instance().addStringLocalization("snowBrick.name", "Snow Brick");
		LanguageRegistry.instance().addStringLocalization("sandstoneBrick.name", "Sandstone Brick");
		LanguageRegistry.instance().addStringLocalization("brickBrick.name", "Red Brick");
		LanguageRegistry.instance().addStringLocalization("netherrackBrick.name", "Netherrack Brick");
		LanguageRegistry.instance().addStringLocalization("diamondBrick.name", "Diamond Brick");
		LanguageRegistry.instance().addStringLocalization("goldBrick.name", "Gold Brick");
		LanguageRegistry.instance().addStringLocalization("lapisBrick.name", "Lapis Brick");
		LanguageRegistry.instance().addStringLocalization("slabBrick.name", "Stone Brick");
		LanguageRegistry.instance().addStringLocalization("stoneSmallBrick.name", "Stone Brick");
		LanguageRegistry.instance().addStringLocalization("slabSmallBrick.name", "Stone Brick");
		LanguageRegistry.instance().addStringLocalization("brickTileBrick.name", "Large Brick Tile");
		LanguageRegistry.instance().addStringLocalization("ironBrick.name", "Iron Brick");
		LanguageRegistry.instance().addStringLocalization("redstoneBrick.name", "Redstone Brick");
		LanguageRegistry.instance().addStringLocalization("slimeBrick.name", "Slime Brick");
		LanguageRegistry.instance().addStringLocalization("boneBrick.name", "Bone Brick");
		
		LanguageRegistry.instance().addStringLocalization("obsidianBrickMagicSlab.name", "Obsidian Brick Magic Slab");
		LanguageRegistry.instance().addStringLocalization("snowBrickMagicSlab.name", "Snow Brick Magic Slab");
		LanguageRegistry.instance().addStringLocalization("sandstoneBrickMagicSlab.name", "Sandstone Brick Magic Slab");
		LanguageRegistry.instance().addStringLocalization("brickBrickMagicSlab.name", "Red Brick Magic Slab");
		LanguageRegistry.instance().addStringLocalization("netherrackBrickMagicSlab.name", "Netherrack Brick Magic Slab");
		LanguageRegistry.instance().addStringLocalization("diamondBrickMagicSlab.name", "Diamond Brick Magic Slab");
		LanguageRegistry.instance().addStringLocalization("goldBrickMagicSlab.name", "Gold Brick Magic Slab");
		LanguageRegistry.instance().addStringLocalization("lapisBrickMagicSlab.name", "Lapis Brick Magic Slab");
		LanguageRegistry.instance().addStringLocalization("slabBrickMagicSlab.name", "Stone Brick Magic Slab");
		LanguageRegistry.instance().addStringLocalization("stoneSmallBrickMagicSlab.name", "Stone Brick Magic Slab");
		LanguageRegistry.instance().addStringLocalization("slabSmallBrickMagicSlab.name", "Stone Brick Magic Slab");
		LanguageRegistry.instance().addStringLocalization("brickTileBrickMagicSlab.name", "Large Brick Tile");
		LanguageRegistry.instance().addStringLocalization("ironBrickMagicSlab.name", "Iron Brick Magic Slab");
		LanguageRegistry.instance().addStringLocalization("redstoneBrickMagicSlab.name", "Redstone Brick Magic Slab");
		LanguageRegistry.instance().addStringLocalization("slimeBrickMagicSlab.name", "Slime Brick Magic Slab");
		LanguageRegistry.instance().addStringLocalization("boneBrickMagicSlab.name", "Bone Brick Magic Slab");
		
		LanguageRegistry.instance().addStringLocalization("obsidianFancyBrick.name", "Fancy Obsidian Brick");
		LanguageRegistry.instance().addStringLocalization("snowFancyBrick.name", "Fancy Snow Brick");
		LanguageRegistry.instance().addStringLocalization("sandstoneFancyBrick.name", "Fancy Sandstone Brick");
		LanguageRegistry.instance().addStringLocalization("brickFancyBrick.name", "Fancy Red Brick");
		LanguageRegistry.instance().addStringLocalization("netherrackFancyBrick.name", "Fancy Netherrack Brick");
		LanguageRegistry.instance().addStringLocalization("diamondFancyBrick.name", "Fancy Diamond Brick");
		LanguageRegistry.instance().addStringLocalization("goldFancyBrick.name", "Fancy Gold Brick");
		LanguageRegistry.instance().addStringLocalization("lapisFancyBrick.name", "Fancy Lapis Brick");
		LanguageRegistry.instance().addStringLocalization("slabFancyBrick.name", "Fancy Stone Brick");
		LanguageRegistry.instance().addStringLocalization("stoneFancyBrick.name", "Fancy Stone Brick");
		LanguageRegistry.instance().addStringLocalization("brickTileFancyBrick.name", "Red Brick Tiles");
		LanguageRegistry.instance().addStringLocalization("ironFancyBrick.name", "Fancy Iron Brick");
		LanguageRegistry.instance().addStringLocalization("redstoneFancyBrick.name", "Fancy Redstone Brick");
		LanguageRegistry.instance().addStringLocalization("slimeFancyBrick.name", "Fancy Slime Brick");
		LanguageRegistry.instance().addStringLocalization("boneFancyBrick.name", "Fancy Bone Brick");
		
		LanguageRegistry.instance().addStringLocalization("obsidianFancyBrickMagicSlab.name", "Fancy Obsidian Brick Magic Slab");
		LanguageRegistry.instance().addStringLocalization("snowFancyBrickMagicSlab.name", "Fancy Snow Brick Magic Slab");
		LanguageRegistry.instance().addStringLocalization("sandstoneFancyBrickMagicSlab.name", "Fancy Sandstone Brick Magic Slab");
		LanguageRegistry.instance().addStringLocalization("brickFancyBrickMagicSlab.name", "Fancy Red Brick Magic Slab");
		LanguageRegistry.instance().addStringLocalization("netherrackFancyBrickMagicSlab.name", "Fancy Netherrack Brick Magic Slab");
		LanguageRegistry.instance().addStringLocalization("diamondFancyBrickMagicSlab.name", "Fancy Diamond Brick Magic Slab");
		LanguageRegistry.instance().addStringLocalization("goldFancyBrickMagicSlab.name", "Fancy Gold Brick Magic Slab");
		LanguageRegistry.instance().addStringLocalization("lapisFancyBrickMagicSlab.name", "Fancy Lapis Brick Magic Slab");
		LanguageRegistry.instance().addStringLocalization("slabFancyBrickMagicSlab.name", "Fancy Stone Brick Magic Slab");
		LanguageRegistry.instance().addStringLocalization("stoneFancyBrickMagicSlab.name", "Fancy Stone Brick Magic Slab");
		LanguageRegistry.instance().addStringLocalization("brickTileFancyBrickMagicSlab.name", "Red Brick Tiles Magic Slab");
		LanguageRegistry.instance().addStringLocalization("ironFancyBrickMagicSlab.name", "Fancy Iron Brick Magic Slab");
		LanguageRegistry.instance().addStringLocalization("redstoneFancyBrickMagicSlab.name", "Fancy Redstone Brick Magic Slab");
		LanguageRegistry.instance().addStringLocalization("slimeFancyBrickMagicSlab.name", "Fancy Slime Brick Magic Slab");
		LanguageRegistry.instance().addStringLocalization("boneFancyBrickMagicSlab.name", "Fancy Bone Brick Magic Slab");
		
		LanguageRegistry.instance().addStringLocalization("clearGlass.name", "Clear Glass");
		LanguageRegistry.instance().addStringLocalization("soulGlass.name", "Soul Glass");
		LanguageRegistry.instance().addStringLocalization("clearSoulGlass.name", "Clear Soul Glass");
		
		LanguageRegistry.instance().addStringLocalization("clearGlassPane.name", "Clear Glass Pane");
		LanguageRegistry.instance().addStringLocalization("soulGlassPane.name", "Soul Glass Pane");
		LanguageRegistry.instance().addStringLocalization("clearSoulGlassPane.name", "Clear Soul Glass Pane");
		
		LanguageRegistry.instance().addStringLocalization("clearGlassMagicSlab.name", "Clear Glass Magic Slab");
		LanguageRegistry.instance().addStringLocalization("soulGlassMagicSlab.name", "Soul Glass Magic Slab");
		LanguageRegistry.instance().addStringLocalization("clearSoulGlassMagicSlab.name", "Clear Soul Glass Magic Slab");
		
		LanguageRegistry.instance().addStringLocalization("rawBrownstone.name", "Rough Brownstone");
		LanguageRegistry.instance().addStringLocalization("smeltedBrownstone.name", "Brownstone");
		LanguageRegistry.instance().addStringLocalization("roadBrownstone.name", "Brownstone Road");
		LanguageRegistry.instance().addStringLocalization("brickBrownstone.name", "Brownstone Brick");
		LanguageRegistry.instance().addStringLocalization("brickSmallBrownstone.name", "Small Brownstone Brick");
		LanguageRegistry.instance().addStringLocalization("fancyBrownstone.name", "Fancy Brownstone Brick");
		
		LanguageRegistry.instance().addStringLocalization("rawBrownstoneMagicSlab.name", "Rough Brownstone Magic Slab");
		LanguageRegistry.instance().addStringLocalization("smeltedBrownstoneMagicSlab.name", "Brownstone Magic Slab");
		LanguageRegistry.instance().addStringLocalization("roadBrownstoneMagicSlab.name", "Brownstone Road Magic Slab");
		LanguageRegistry.instance().addStringLocalization("brickBrownstoneMagicSlab.name", "Brownstone Brick Magic Slab");
		LanguageRegistry.instance().addStringLocalization("brickSmallBrownstoneMagicSlab.name", "Small Brownstone Brick Magic Slab");
		LanguageRegistry.instance().addStringLocalization("fancyBrownstoneMagicSlab.name", "Fancy Brownstone Brick Magic Slab");
		
		LanguageRegistry.instance().addStringLocalization("iceBrick.name", "Ice Brick");
		LanguageRegistry.instance().addStringLocalization("smallIceBrick.name", "Fancy Ice Brick");
		LanguageRegistry.instance().addStringLocalization("fancyIceBrick.name", "Fancy Ice Brick");
		
		LanguageRegistry.instance().addStringLocalization("iceBrickMagicSlab.name", "Ice Brick Magic Slab");
		LanguageRegistry.instance().addStringLocalization("smallIceBrickMagicSlab.name", "Fancy Ice Brick Magic Slab");
		LanguageRegistry.instance().addStringLocalization("fancyIceBrickMagicSlab.name", "Fancy Ice Brick Magic Slab");
		
		LanguageRegistry.instance().addStringLocalization("coalStorage.name", "Coal Block");
		LanguageRegistry.instance().addStringLocalization("charcoalStorage.name", "Charcoal Block");
		LanguageRegistry.instance().addStringLocalization("redstoneStorage.name", "Redstone Block");
		LanguageRegistry.instance().addStringLocalization("slimeStorage.name", "Slime Block");
		LanguageRegistry.instance().addStringLocalization("boneStorage.name", "Bone Block");
		LanguageRegistry.instance().addStringLocalization("wheatStorage.name", "Thatching");
		LanguageRegistry.instance().addStringLocalization("netherrackStorage.name", "Smooth Netherrack");
		LanguageRegistry.instance().addStringLocalization("sandstoneStorage.name", "Smooth Sandstone");
		LanguageRegistry.instance().addStringLocalization("slabStorage.name", "Refined Stone");
		LanguageRegistry.instance().addStringLocalization("brickStorage.name", "Brick block");
		
		LanguageRegistry.instance().addStringLocalization("oakChestInfi.name", "Oak Chest");
        LanguageRegistry.instance().addStringLocalization("birchChestInfi.name", "Birch Chest");
        LanguageRegistry.instance().addStringLocalization("pineChestInfi.name", "Pine Chest");
        LanguageRegistry.instance().addStringLocalization("jungleChestInfi.name", "Cecropia Chest");
        LanguageRegistry.instance().addStringLocalization("cactusChestInfi.name", "Cactus Chest");
        LanguageRegistry.instance().addStringLocalization("weatheredChestInfi.name", "Weathered Chest");
        LanguageRegistry.instance().addStringLocalization("ruinedstoneChestInfi.name", "Ruined Chest");
        LanguageRegistry.instance().addStringLocalization("stoneChestInfi.name", "Stone Chest");
        LanguageRegistry.instance().addStringLocalization("stonebrickChestInfi.name", "Stone Brick Chest");
        LanguageRegistry.instance().addStringLocalization("obsidianChestInfi.name", "Obsidian Chest");
        LanguageRegistry.instance().addStringLocalization("iceChestInfi.name", "Ice Chest");
        LanguageRegistry.instance().addStringLocalization("ironChestInfi.name", "Iron Chest");
        LanguageRegistry.instance().addStringLocalization("jeweledChestInfi.name", "Jeweled Chest");
        LanguageRegistry.instance().addStringLocalization("slimeChestInfi.name", "Slime Chest");
        LanguageRegistry.instance().addStringLocalization("endstoneChestInfi.name", "Endstone Chest");
	}
}
