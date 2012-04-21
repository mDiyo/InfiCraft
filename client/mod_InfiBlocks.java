package net.minecraft.src;

import net.minecraft.src.blocks.*;
import net.minecraft.src.forge.*;
import net.minecraft.src.mechvent.CrusherLogic;

import java.io.*;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.Minecraft;

public class mod_InfiBlocks extends NetworkMod
{
	public String getVersion()
	{
		return "v0.7.10 Color Bricked";
	}

	public void load()
	{
		//checkInitialized();
	}
	
	public static Minecraft mcInstance()
	{
		return mc;
	}
	
	public void oreDictionarySupport()
    {
        MinecraftForge.registerOreHandler(new IOreHandler()
        {
            public void registerOre(String ore, ItemStack stack)
            {
                if(ore.equals("customCobblestone"))
                {
                	ModLoader.addRecipe(new ItemStack(workbench, 1), new Object[]
            	            { "##", "##", '#', stack });
                }
                if(ore.equals("stoneRod"))
                {
                	addStickRecipe(stack);
                }
                else if(ore.equals("ironRod"))
                {
                	addStickRecipe(stack);
                }
                else if(ore.equals("diamondRod"))
                {
                	addStickRecipe(stack);
                }
                else if(ore.equals("redstoneRod"))
                {
                	addStickRecipe(stack);
                }
                else if(ore.equals("obsidianRod"))
                {
                	addStickRecipe(stack);
                }
                else if(ore.equals("sandstoneRod"))
                {
                	addStickRecipe(stack);
                }
                else if(ore.equals("paperRod"))
                {
                	addStickRecipe(stack);
                }
                else if(ore.equals("mossyRod"))
                {
                	addStickRecipe(stack);
                }
                else if(ore.equals("netherrackRod"))
                {
                	addStickRecipe(stack);
                }
                else if(ore.equals("glowstoneRod"))
                {
                	addStickRecipe(stack);
                }
                else if(ore.equals("lavaRod"))
                {
                	addStickRecipe(stack);
                }
                else if(ore.equals("iceRod"))
                {
                	addStickRecipe(stack);
                }
                else if(ore.equals("slimeRod"))
                {
                	addStickRecipe(stack);
                }
                else if(ore.equals("cactusRod"))
                {
                	addStickRecipe(stack);
                }
                else if(ore.equals("flintRod"))
                {
                	addStickRecipe(stack);
                }
                else if(ore.equals("copperRod"))
                {
                	addStickRecipe(stack);
                }
                else if(ore.equals("bronzeRod"))
                {
                	addStickRecipe(stack);
                }
                else if(ore.equals("workedIronRod"))
                {
                	addStickRecipe(stack);
                }
                else if(ore.equals("steelRod"))
                {
                	addStickRecipe(stack);
                }
                else if(ore.equals("cobaltRod"))
                {
                	addStickRecipe(stack);
                }
                else if(ore.equals("arditeRod"))
                {
                	addStickRecipe(stack);
                }
                else if(ore.equals("manyullynRod"))
                {
                	addStickRecipe(stack);
                }
                else if(ore.equals("uraniumRod"))
                {
                	addStickRecipe(stack);
                }
            }
        } );
    }
	
	private void addStickRecipe(ItemStack stack)
	{
		ModLoader.addRecipe(new ItemStack(Block.torchWood, 4), new Object[]
		{
			"c", "s", 'c', new ItemStack(Item.coal, 1, -1), 's', stack
		});
		ModLoader.addRecipe(new ItemStack(Block.torchRedstoneActive, 1), new Object[]
		{
			"c", "s", 'c', new ItemStack(Item.redstone, 1, 0), 's', stack
		});
		ModLoader.addRecipe(new ItemStack(Block.lever, 1), new Object[]
		{
			"s", "c", 'c', new ItemStack(Block.cobblestone, 1, 0), 's', stack
		});
		ModLoader.addRecipe(new ItemStack(Block.rail, 16), new Object[]
		{
			"c c", "csc", "c c", 'c', new ItemStack(Item.ingotIron, 1, 0), 's', stack
		});
		ModLoader.addRecipe(new ItemStack(Block.railPowered, 6), new Object[]
		{
			"c c", "csc", "crc", 'c', new ItemStack(Item.ingotGold, 1, -1), 
			's', stack, 'r', new ItemStack(Item.redstone, 1, 0)
		});
	}
	
	public void registerGuiHandler()
	{
		MinecraftForge.setGuiHandler(this, guiHandler);
	}
	
	@Override
	public boolean renderWorldBlock(RenderBlocks renderblocks, 
			IBlockAccess iblockaccess, int i, int j, int k, Block block, int modelID)
	{
		if (modelID == magicSlabModel)
		{
			return InfiBlockRenders.RenderMagicWorld(renderblocks, iblockaccess, i, j, k, (MagicSlabBase)block);
		}
		else
		
		if (modelID == paneModelID)
		{
			return InfiBlockRenders.RenderPaneInWorld(renderblocks, iblockaccess, i, j, k, (PaneBase)block);
		} else
		
		if (modelID == brickModelID)
		{
			return InfiBlockRenders.renderBrickWorld(renderblocks, iblockaccess, i, j, k, block);
		} else
		{	  	
			return false;
		}
	}
	
	public void renderInvBlock(RenderBlocks renderblocks, Block block, int i, int modelID)
	{
		if (modelID == magicSlabModel)
		{
			InfiBlockRenders.RenderMagicInv(renderblocks, block, i);
		}
		
		if (modelID == paneModelID)
		{
			InfiBlockRenders.RenderPaneInv(renderblocks, block, i);
		}
		
		if (modelID == brickModelID)
		{
			InfiBlockRenders.RenderBrickInv(renderblocks, block, i);
		}
	}
	
	private static void setupCraftHook()
    {
        ICraftingHandler icraftinghandler = new ICraftingHandler()
        {
            public void onTakenFromCrafting(EntityPlayer entityplayer, ItemStack itemstack, IInventory iinventory)
            {
                for (int i = 0; i < iinventory.getSizeInventory(); i++)
                {
                    ItemStack itemstack1 = iinventory.getStackInSlot(i);
                    if (itemstack1 == null || !DetailManager.damageOnCraft.contains(Integer.valueOf(itemstack1.itemID)))
                    {
                        continue;
                    }
                    itemstack1.stackSize++;
                    itemstack1.damageItem(1, entityplayer);
                    if (itemstack1.stackSize != 1)
                    {
                        continue;
                    }
                    Integer integer = (Integer)DetailManager.damageContainer.get(Integer.valueOf(itemstack1.itemID));
                    if (integer != null)
                    {
                        iinventory.setInventorySlotContents(i, new ItemStack(integer.intValue(), 1, 0));
                    }
                }
            }
        };
        
        MinecraftForge.registerCraftingHandler(icraftinghandler);
    }
	
	private static IGuiHandler guiHandler;
	
	public static IGuiHandler getGuiHandler()
	{
		return guiHandler;
	}
	
    private static mod_InfiBlocks instance;
	
	public static mod_InfiBlocks getInstance()
	{
		return instance;
	}

	public mod_InfiBlocks()
	{
		//InfiBlockRecipes.recipeStorm();
		instance = this;
		
		guiHandler = new IGuiHandler()
		{
			@Override
			public Object getGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
			{
				if (ID == craftingGuiID)
				{
					return new WorkbenchGui(player.inventory, world);
				}
				if (ID == furnaceGuiID)
				{
					return new FurnaceGui(player.inventory, (FurnaceLogic)world.getBlockTileEntity(x, y, z));
				}
				else
				{
					return null;
				}
			}
		};
		
		ModLoader.registerBlock(workbench, net.minecraft.src.blocks.WorkbenchItem.class);
		ModLoader.registerBlock(woolCarpet, net.minecraft.src.blocks.CarpetItem.class);
		ModLoader.registerBlock(furnace, net.minecraft.src.blocks.FurnaceItem.class);
		ModLoader.registerTileEntity(net.minecraft.src.blocks.FurnaceLogic.class, "InfiFurnace");
		
		ModLoader.registerBlock(magicSlabStone, net.minecraft.src.blocks.MagicSlabStoneItem.class);
		ModLoader.registerBlock(magicSlabSoil, net.minecraft.src.blocks.MagicSlabSoilItem.class);
		ModLoader.registerBlock(magicSlabWool, net.minecraft.src.blocks.MagicSlabWoolItem.class);
		
		ModLoader.registerBlock(stainedGlass, net.minecraft.src.blocks.StainedGlassItem.class);
		ModLoader.registerBlock(stainedGlassPane, net.minecraft.src.blocks.StainedGlassPaneItem.class);
		ModLoader.registerBlock(stainedGlassMagicSlab, net.minecraft.src.blocks.StainedGlassMagicSlabItem.class);
		ModLoader.registerBlock(infiGlass, net.minecraft.src.blocks.InfiGlassItem.class);
		ModLoader.registerBlock(infiGlassPane, net.minecraft.src.blocks.InfiGlassPaneItem.class);
		ModLoader.registerBlock(infiGlassMagicSlab, net.minecraft.src.blocks.InfiGlassMagicSlabItem.class);
		
		ModLoader.registerBlock(brick, net.minecraft.src.blocks.BrickBlockItem.class);
		ModLoader.registerBlock(fancyBrick, net.minecraft.src.blocks.BrickFancyItem.class);
		ModLoader.registerBlock(storageBlock, net.minecraft.src.blocks.StorageBlockItem.class);
		ModLoader.registerBlock(iceBrick, net.minecraft.src.blocks.BrickIceItem.class);
		ModLoader.registerBlock(brownstone, net.minecraft.src.blocks.BrownstoneItem.class);
		
		ModLoader.registerBlock(brickMagicSlab, net.minecraft.src.blocks.BrickBlockMagicSlabItem.class);
		ModLoader.registerBlock(fancyBrickMagicSlab, net.minecraft.src.blocks.BrickFancyMagicSlabItem.class);
		ModLoader.registerBlock(storageBlockMagicSlab, net.minecraft.src.blocks.StorageBlockMagicSlabItem.class);
		ModLoader.registerBlock(iceBrickMagicSlab, net.minecraft.src.blocks.BrickIceMagicSlabItem.class);
		ModLoader.registerBlock(brownstoneMagicSlab, net.minecraft.src.blocks.BrownstoneMagicSlabItem.class);
		
		magicSlabModel = ModLoader.getUniqueBlockModelID(this, true);
		paneModelID = ModLoader.getUniqueBlockModelID(this, true);
		brickModelID = ModLoader.getUniqueBlockModelID(this, true);
		InfiBlockRecipes.addNames();
		InfiBlockRecipes.recipeStorm();
		InfiBlockRecipes.magicSlabFrenzy();
		InfiBlockRecipes.furnaceBlaze();
		//checkInitialized();
		MinecraftForgeClient.preloadTexture("/infiblocks/infiblocks.png");
		MinecraftForgeClient.preloadTexture("/infiblocks/infimachines.png");
		MinecraftForgeClient.preloadTexture("/infiblocks/bricks.png");
		
		setupCraftHook();
		oreDictionarySupport();
		registerGuiHandler();
	}
	
	public static int blockCraftingID;
	public static int woolCarpetID;
	public static int blockChestID;
	public static int blockFurnaceID;
	public static int magicSlabStoneID;
	public static int magicSlabSoilID;
	public static int magicSlabWoolID;
	
	public static int stainedGlassID;
	public static int stainedGlassPaneID;
	public static int stainedGlassMagicSlabID;
	public static int infiGlassID;
	public static int infiGlassPaneID;
	
	public static int storageBlockID;
	public static int brickID;
	public static int crackedBrickID;
	public static int fancyBrickID;
	public static int runeBrickID;
	public static int brownstoneID;
	public static int iceBrickID;
	
	public static int infiGlassMagicSlabID;
	public static int storageBlockMagicSlabID;
	public static int brickMagicSlabID;
	public static int crackedBrickMagicSlabID;
	public static int fancyBrickMagicSlabID;
	public static int runeBrickMagicSlabID;
	public static int brownstoneMagicSlabID;
	public static int iceBrickMagicSlabID;
	
	public static int chiselID;
	
	public static Block workbench;
	public static Block woolCarpet;
	public static Block furnace;
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
	
	public static int craftingGuiID;
	public static int furnaceGuiID;
	public static int magicSlabModel;
	public static int paneModelID;
	public static int brickModelID;
	
	public static boolean resolveConflicts;
	
	public static InfiProps props;
	public static Minecraft mc;

	static
	{
		File me = new File( (new StringBuilder().append(Minecraft.getMinecraftDir().getPath())
        		.append('/').append("config").append('/').append("InfiCraft").toString() ) );
        me.mkdir();
        props = new InfiProps((new File((new StringBuilder()).append(Minecraft.getMinecraftDir().getPath())
        		.append('/').append("config").append('/').append("InfiCraft")
        		.append('/').append("InfiBlocks.cfg").toString())).getPath());
		props = PropsHelperInfiBlocks.InitProps(props);
		PropsHelperInfiBlocks.getProps(props);
		
		if(resolveConflicts)
			PropsHelperInfiBlocks.resolveIDs(props);
		
		workbench = (new WorkbenchBlock(blockCraftingID)).setHardness(0.5F).setBlockName("infiCraftingTable");
		woolCarpet = (new CarpetBlock(woolCarpetID)).setHardness(0.3F).setStepSound(Block.soundClothFootstep).setBlockName("woolCarpet");
		furnace = (new FurnaceBlock(blockFurnaceID)).setBlockName("InfiFurnace");
		magicSlabStone = new MagicSlabStone(magicSlabStoneID, 23).setHardness(0.3F).setBlockName("Magic Slab Stone");
		magicSlabSoil = new MagicSlabSoil(magicSlabSoilID, 23).setHardness(0.3F).setStepSound(Block.soundWoodFootstep).setBlockName("Magic Slab Soil");
		magicSlabWool = new MagicSlabWool(magicSlabWoolID, 64).setHardness(0.3F).setStepSound(Block.soundClothFootstep).setBlockName("Magic Slab Wool");
		
		stainedGlass = (new StainedGlass(stainedGlassID, 128, Material.glass, false)).setHardness(0.3F).setStepSound(Block.soundGlassFootstep).setBlockName("Stained Glass");
		stainedGlassPane = (new StainedGlassPane(stainedGlassPaneID, 128, 144, Material.glass)).setHardness(0.3F).setStepSound(Block.soundGlassFootstep).setBlockName("Stained Glass Pane");
		stainedGlassMagicSlab = new StainedGlassMagicSlab(stainedGlassMagicSlabID, 128).setHardness(0.3F).setStepSound(Block.soundGlassFootstep).setBlockName("Stained Glass Magic Slab");
		infiGlass = new InfiGlass(infiGlassID, 160, Material.glass, false).setHardness(5.0F).setResistance(2000F).setBlockName("InfiGlass");
		infiGlassPane = new InfiGlassPane(infiGlassPaneID, 160, 176, Material.glass).setHardness(0.3F).setStepSound(Block.soundGlassFootstep).setBlockName("InfiGlass Pane");
		infiGlassMagicSlab = new InfiGlassMagicSlab(infiGlassMagicSlabID, 160).setHardness(0.3F).setStepSound(Block.soundGlassFootstep).setBlockName("InfiGlass Magic Slab");

		storageBlock = new StorageBlock(storageBlockID, 0).setHardness(0.3F).setBlockName("InfiStorage Block");
		brick = new BrickBlock(brickID, 0).setHardness(0.3F).setBlockName("InfiBrick");
		fancyBrick = new BrickFancy(fancyBrickID, 48).setHardness(0.3F).setStepSound(Block.soundStoneFootstep).setBlockName("InfiBrick Fancy");
		iceBrick = new BrickIce(iceBrickID, 160).setHardness(Block.ice.getHardness()).setStepSound(Block.soundGlassFootstep).setBlockName("Ice Brick");
		brownstone = new Brownstone(brownstoneID, 176).setHardness(Block.cobblestone.getHardness()).setBlockName("Brownstone");
		
		storageBlockMagicSlab = new StorageBlockMagicSlab(storageBlockMagicSlabID, 0).setHardness(0.3F).setBlockName("Storage Block Magic Slab");
		brickMagicSlab = new BrickBlockMagicSlab(brickMagicSlabID, 16).setHardness(0.3F).setBlockName("Brick Magic Slab");
		fancyBrickMagicSlab = new BrickFancyMagicSlab(fancyBrickMagicSlabID, 48).setHardness(0.3F).setBlockName("Fancy Brick Magic Slab");
		iceBrickMagicSlab = new BrickIceMagicSlab(iceBrickMagicSlabID, 112).setHardness(Block.ice.getHardness()).setBlockName("Ice Brick Magic Slab");
		brownstoneMagicSlab = new BrownstoneMagicSlab(brownstoneMagicSlabID, 96).setHardness(Block.cobblestone.getHardness()).setBlockName("Brownstone Magic Slab");
		
		chiselIron = new Chisel(chiselID, 250).setIconCoord(14, 15).setItemName("Iron Chisel");
		chiselDiamond = new Chisel(chiselID+1, 2000).setIconCoord(15, 15).setItemName("Diamond Chisel");
		/*crackedBrick = new BrickBlock(crackedBrickID, 176).setHardness(0.3F).setBlockName("Infi-Brick Cracked");
		*/
		//runeBrick = new BrickBlock(brickID, 208).setHardness(0.3F).setBlockName("Infi-Brick Rune");
	}

	@Override
	public boolean clientSideRequired() {
		return true;
	}

	@Override
	public boolean serverSideRequired() {
		return false;
	}
}
