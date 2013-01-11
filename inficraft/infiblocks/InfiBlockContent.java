package inficraft.infiblocks;

import inficraft.infiblocks.blocks.Brownstone;
import inficraft.infiblocks.blocks.CarpetBlock;
import inficraft.infiblocks.blocks.StorageBlock;
import inficraft.infiblocks.blocks.StorageBlockMagicSlab;
import inficraft.infiblocks.bricks.BrickBlock;
import inficraft.infiblocks.bricks.BrickBlockMagicSlab;
import inficraft.infiblocks.bricks.BrickFancy;
import inficraft.infiblocks.bricks.BrickFancyMagicSlab;
import inficraft.infiblocks.bricks.BrickIce;
import inficraft.infiblocks.bricks.BrickIceMagicSlab;
import inficraft.infiblocks.glass.InfiGlass;
import inficraft.infiblocks.glass.InfiGlassMagicSlab;
import inficraft.infiblocks.glass.InfiGlassPane;
import inficraft.infiblocks.glass.StainedGlass;
import inficraft.infiblocks.glass.StainedGlassPane;
import inficraft.infiblocks.magicslabs.BrownstoneMagicSlab;
import inficraft.infiblocks.magicslabs.MagicSlabSoil;
import inficraft.infiblocks.magicslabs.MagicSlabStone;
import inficraft.infiblocks.magicslabs.MagicSlabWool;
import inficraft.infiblocks.magicslabs.StainedGlassMagicSlab;
import inficraft.infiblocks.tech.FurnaceBlock;
import inficraft.infiblocks.tech.WorkbenchBlock;

import java.lang.reflect.*;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import cpw.mods.fml.common.registry.GameRegistry;

public class InfiBlockContent
{
	public void init()
	{
		setupBlocks();
		setupItems();
	}
	
	public void setupBlocks()
	{
		workbench = (new WorkbenchBlock(PHInfiBlocks.blockCraftingID)).setHardness(0.5F).setBlockName("infiCraftingTable");
		woolCarpet = (new CarpetBlock(PHInfiBlocks.woolCarpetID)).setHardness(0.3F).setStepSound(Block.soundClothFootstep).setBlockName("woolCarpet");
		furnace = (new FurnaceBlock(PHInfiBlocks.blockFurnaceID)).setBlockName("InfiFurnace");
		//chest = new ChestBlock(PHInfiBlocks.blockChestID);
		magicSlabStone = new MagicSlabStone(PHInfiBlocks.magicSlabStoneID, 23).setHardness(0.3F).setBlockName("Magic Slab Stone");
		magicSlabSoil = new MagicSlabSoil(PHInfiBlocks.magicSlabSoilID, 23).setHardness(0.3F).setStepSound(Block.soundWoodFootstep).setBlockName("Magic Slab Soil");
		magicSlabWool = new MagicSlabWool(PHInfiBlocks.magicSlabWoolID, 64).setHardness(0.3F).setStepSound(Block.soundClothFootstep).setBlockName("Magic Slab Wool");
		
		stainedGlass = (new StainedGlass(PHInfiBlocks.stainedGlassID, 128, Material.glass, false)).setHardness(0.3F).setStepSound(Block.soundGlassFootstep).setBlockName("Stained Glass");
		stainedGlassPane = (new StainedGlassPane(PHInfiBlocks.stainedGlassPaneID, 128, 144, Material.glass)).setHardness(0.3F).setStepSound(Block.soundGlassFootstep).setBlockName("Stained Glass Pane");
		stainedGlassMagicSlab = new StainedGlassMagicSlab(PHInfiBlocks.stainedGlassMagicSlabID, 128).setHardness(0.3F).setStepSound(Block.soundGlassFootstep).setBlockName("Stained Glass Magic Slab");
		infiGlass = new InfiGlass(PHInfiBlocks.infiGlassID, 160, Material.glass, false).setHardness(5.0F).setResistance(2000F).setBlockName("InfiGlass");
		infiGlassPane = new InfiGlassPane(PHInfiBlocks.infiGlassPaneID, 160, 176, Material.glass).setHardness(0.3F).setStepSound(Block.soundGlassFootstep).setBlockName("InfiGlass Pane");
		infiGlassMagicSlab = new InfiGlassMagicSlab(PHInfiBlocks.infiGlassMagicSlabID, 160).setHardness(0.3F).setStepSound(Block.soundGlassFootstep).setBlockName("InfiGlass Magic Slab");

		storageBlock = new StorageBlock(PHInfiBlocks.storageBlockID, 0).setHardness(0.3F).setBlockName("InfiStorage Block");
		brick = new BrickBlock(PHInfiBlocks.brickID, 0).setHardness(0.3F).setBlockName("InfiBrick");
		fancyBrick = new BrickFancy(PHInfiBlocks.fancyBrickID, 48).setHardness(0.3F).setStepSound(Block.soundStoneFootstep).setBlockName("InfiBrick Fancy");
		iceBrick = new BrickIce(PHInfiBlocks.iceBrickID, 160).setHardness(Block.ice.getBlockHardness(null, 0, 0, 0)).setStepSound(Block.soundGlassFootstep).setBlockName("Ice Brick");
		brownstone = new Brownstone(PHInfiBlocks.brownstoneID, 176).setHardness(Block.cobblestone.getBlockHardness(null, 0, 0, 0)).setBlockName("Brownstone");
		
		storageBlockMagicSlab = new StorageBlockMagicSlab(PHInfiBlocks.storageBlockMagicSlabID, 0).setHardness(0.3F).setBlockName("Storage Block Magic Slab");
		brickMagicSlab = new BrickBlockMagicSlab(PHInfiBlocks.brickMagicSlabID, 16).setHardness(0.3F).setBlockName("Brick Magic Slab");
		fancyBrickMagicSlab = new BrickFancyMagicSlab(PHInfiBlocks.fancyBrickMagicSlabID, 48).setHardness(0.3F).setBlockName("Fancy Brick Magic Slab");
		iceBrickMagicSlab = new BrickIceMagicSlab(PHInfiBlocks.iceBrickMagicSlabID, 112).setHardness(Block.ice.getBlockHardness(null, 0, 0, 0)).setBlockName("Ice Brick Magic Slab");
		brownstoneMagicSlab = new BrownstoneMagicSlab(PHInfiBlocks.brownstoneMagicSlabID, 96).setHardness(Block.cobblestone.getBlockHardness(null, 0, 0, 0)).setBlockName("Brownstone Magic Slab");
		
		GameRegistry.registerBlock(workbench, inficraft.infiblocks.tech.WorkbenchItem.class, "Workbench");
		GameRegistry.registerBlock(woolCarpet, inficraft.infiblocks.blocks.CarpetItem.class, "Carpet");
		GameRegistry.registerBlock(furnace, inficraft.infiblocks.tech.FurnaceItem.class, "Furnace");
		GameRegistry.registerTileEntity(inficraft.infiblocks.tech.FurnaceLogic.class, "InfiFurnace");
		
		/*GameRegistry.registerBlock(chest, mDiyo.inficraft.infiblocks.tech.ChestItem.class);
		GameRegistry.registerTileEntity(mDiyo.inficraft.infiblocks.tech.ChestLogic.class, "InfiChest");*/
		
		GameRegistry.registerBlock(magicSlabStone, inficraft.infiblocks.magicslabs.MagicSlabStoneItem.class, "MagicSlabStone");
		GameRegistry.registerBlock(magicSlabSoil, inficraft.infiblocks.magicslabs.MagicSlabSoilItem.class, "MagicSlabSoil");
		GameRegistry.registerBlock(magicSlabWool, inficraft.infiblocks.magicslabs.MagicSlabWoolItem.class, "MagicSlabWool");
		
		GameRegistry.registerBlock(stainedGlass, inficraft.infiblocks.glass.StainedGlassItem.class, "StainedGlass");
		GameRegistry.registerBlock(stainedGlassPane, inficraft.infiblocks.glass.StainedGlassPaneItem.class, "StainedGlassPane");
		GameRegistry.registerBlock(stainedGlassMagicSlab, inficraft.infiblocks.magicslabs.StainedGlassMagicSlabItem.class, "StainedGlassMagicSlab");
		GameRegistry.registerBlock(infiGlass, inficraft.infiblocks.glass.InfiGlassItem.class, "ExGlass");
		GameRegistry.registerBlock(infiGlassPane, inficraft.infiblocks.glass.InfiGlassPaneItem.class, "ExGlassPane");
		GameRegistry.registerBlock(infiGlassMagicSlab, inficraft.infiblocks.glass.InfiGlassMagicSlabItem.class, "ExGlassMagicSlab");
		
		GameRegistry.registerBlock(brick, inficraft.infiblocks.bricks.BrickBlockItem.class, "Brick");
		GameRegistry.registerBlock(fancyBrick, inficraft.infiblocks.bricks.BrickFancyItem.class, "BrickFancy");
		GameRegistry.registerBlock(storageBlock, inficraft.infiblocks.blocks.StorageBlockItem.class, "StorageBlock");
		GameRegistry.registerBlock(iceBrick, inficraft.infiblocks.bricks.BrickIceItem.class, "BrickIce");
		GameRegistry.registerBlock(brownstone, inficraft.infiblocks.blocks.BrownstoneItem.class, "Brownstone");
		
		GameRegistry.registerBlock(brickMagicSlab, inficraft.infiblocks.bricks.BrickBlockMagicSlabItem.class, "BrickMagicSlab");
		GameRegistry.registerBlock(fancyBrickMagicSlab, inficraft.infiblocks.bricks.BrickFancyMagicSlabItem.class, "BrickFancyMagicSlab");
		GameRegistry.registerBlock(storageBlockMagicSlab, inficraft.infiblocks.blocks.StorageBlockMagicSlabItem.class, "StorageMagicSlab");
		GameRegistry.registerBlock(iceBrickMagicSlab, inficraft.infiblocks.bricks.BrickIceMagicSlabItem.class, "IceMagicSlab");
		GameRegistry.registerBlock(brownstoneMagicSlab, inficraft.infiblocks.magicslabs.BrownstoneMagicSlabItem.class, "BrownstoneMagicSlab");
		
		//GameRegistry.registerBlock(stoneStairSlab, mDiyo.inficraft.infiblocks.stairs.StairSlabItem.class);
		
		/*crackedBrick = new BrickBlock(crackedBrickID, 176).setHardness(0.3F).setBlockName("Infi-Brick Cracked");
		*/
		//runeBrick = new BrickBlock(brickID, 208).setHardness(0.3F).setBlockName("Infi-Brick Rune");
	}
	
	public void setupItems()
	{
		chiselIron = new Chisel(PHInfiBlocks.chiselID, 256).setIconCoord(14, 15).setItemName("chiselIron");
		chiselDiamond = new Chisel(PHInfiBlocks.chiselID+1, 2048).setIconCoord(15, 15).setItemName("chiselDiamond");	
	}
	
	public void resolveModConflicts()
	{
		FurnaceRecipes.smelting().addSmelting(Block.stone.blockID, new ItemStack(InfiBlockContent.storageBlock, 1, 14), 0.1F);
		FurnaceRecipes.smelting().addSmelting(Block.stone.blockID, 0, new ItemStack(InfiBlockContent.storageBlock, 1, 14), 0.1F);
		try
		{
			Class c = Class.forName("com.eloraam.redpower.RedPowerLogic");
			GameRegistry.addRecipe(new ItemStack(com.eloraam.redpower.RedPowerLogic.itemWafer.getItem(), 2, 0), "#",  '#', new ItemStack(storageBlock, 1, 14) );
		}
		catch (Exception e)
		{
		}
	}
	
	public void addMicroBlocks()
	{
		try
		{
			Class clazz = Class.forName("inficraft.microblocks.core.microblock.MicroblockSystem");
			Method method = clazz.getMethod("registerManualParts", int.class, Block.class, int.class);
			
			//Block ID multiplied by 16 (metadata), then add all the relevant metadata
			for (int iter = 0; iter < 16; iter++) 
				method.invoke(null, brick.blockID*16 + iter, brick, iter);
			
			for (int iter = 0; iter < 10; iter++) 
				method.invoke(null, fancyBrick.blockID*16 + iter, fancyBrick, iter);
			
			for (int iter = 11; iter < 14; iter++) 
				method.invoke(null, fancyBrick.blockID*16 + iter, fancyBrick, iter);
			
			for (int iter = 0; iter < 5; iter++)
				method.invoke(null, storageBlock.blockID*16 + iter, storageBlock, iter);
	    	
	    	for (int iter = 12; iter < 16; iter++)
	    		method.invoke(null, storageBlock.blockID*16 + iter, storageBlock, iter);
	    	
	    	for (int iter = 0; iter < 6; iter++)
	    		method.invoke(null, brownstone.blockID*16 + iter, brownstone, iter);
	    	
	    	for (int iter = 0; iter < 3; iter++)
	    		method.invoke(null, infiGlass.blockID*16 + iter, infiGlass, iter);
		}
		catch (Exception e)
		{
			System.out.println("Microblock api was missing for InfiBlocks");
			e.printStackTrace();
		}
	}

	public static Block workbench;
	public static Block woolCarpet;
	public static Block furnace;
	public static Block chest;
	
	public static Block magicSlabStone;
	public static Block magicSlabSoil;
	public static Block magicSlabWool;
	
	public static Block stainedGlass;
	public static Block stainedGlassPane;
	public static Block stainedGlassMagicSlab;
	public static Block infiGlass;
	public static Block infiGlassPane;
	
	public static Block storageBlock;
	public static Block brick;
	public static Block crackedBrick;
	public static Block fancyBrick;
	public static Block runeBrick;
	public static Block brownstone;
	public static Block iceBrick;
	
	public static Block infiGlassMagicSlab;
	public static Block storageBlockMagicSlab;
	public static Block brickMagicSlab;
	public static Block crackedBrickMagicSlab;
	public static Block fancyBrickMagicSlab;
	public static Block runeBrickMagicSlab;
	public static Block brownstoneMagicSlab;
	public static Block iceBrickMagicSlab;
	
	public static Item chiselIron;
	public static Item chiselDiamond;
	
	public static Block stoneStairSlab;
	
	public static int chestModelID;
	public static int magicSlabModel;
	public static int paneModelID;
	public static int brickModelID;
}
