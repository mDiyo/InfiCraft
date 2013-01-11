package inficraft.microblocks.core.microblock;

import inficraft.microblocks.core.BlockMetaPair;
import inficraft.microblocks.core.Config;
import inficraft.microblocks.core.ImmibisCore;
import inficraft.microblocks.core.api.APILocator;
import inficraft.microblocks.core.api.IIDCallback;
import inficraft.microblocks.core.api.microblock.EnumPartClass;
import inficraft.microblocks.core.api.microblock.IMicroblockCoverSystem;
import inficraft.microblocks.core.api.microblock.IMicroblockSupporterTile;
import inficraft.microblocks.core.api.microblock.IMicroblockSystem;
import inficraft.microblocks.core.api.microblock.PartType;
import inficraft.microblocks.core.api.net.IPacket;
import inficraft.microblocks.core.api.net.IPacketMap;
import inficraft.microblocks.core.api.porting.SidedProxy;
import inficraft.microblocks.core.microblock.recipes.RecipeCombineSeveral;
import inficraft.microblocks.core.microblock.recipes.RecipeCombineTwo;
import inficraft.microblocks.core.microblock.recipes.RecipeHollowCover;
import inficraft.microblocks.core.microblock.recipes.RecipeHorizontalCut;
import inficraft.microblocks.core.microblock.recipes.RecipeUnHollowCover;
import inficraft.microblocks.core.microblock.recipes.RecipeVerticalCut;
import inficraft.microblocks.core.multipart.BlockMultipartBase;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.util.StringTranslate;
import net.minecraftforge.client.MinecraftForgeClient;
import net.minecraftforge.common.ConfigCategory;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.Property;
import net.minecraftforge.oredict.ShapedOreRecipe;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class MicroblockSystem implements IMicroblockSystem {
	/**
	 * Part IDs are bitfields.
	 * 
	 * Bits 20-31 are block ID. (12 bits)
	 * If block ID is nonzero, part is an auto-detected or third-party one.
	 * 		10-19 are ID-specific. (10 bits)
	 * 		bit 9 is 1 for parts added by the system, 0 for other parts.
	 * 		bits 5-8 are reserved.
	 * 		bits 3-4 are part type.
	 * 		bits 0-2 are part size. 
	 * 
	 * If block ID is zero, part is one that was manually added in postinit.
	 * 		bits 5-19 are manually chosen ID.
	 * 		bits 3-4 are part type.
	 * 		bits 0-2 are part size.
	 * 
	 * All vanilla-based parts are manually added in postinit.
	 */
	public final static HashMap<Integer, PartType> parts = new HashMap<Integer, PartType>();
	
	public static BlockMultipartBase microblockContainerBlock;
	public static ItemSaw itemSaw;
	
	public static final String CHANNEL = "InfiMicro";
	public static final byte PKT_S2C_MICROBLOCK_CONTAINER_DESCRIPTION = 0;
	public static MicroblockSystem INSTANCE;
	
	public static ArrayList<Integer> neiDamageValues = new ArrayList<Integer>();
	public static int neiMaxDamage = 0;
	
	public void postinit() {
		registerManualParts(1, Block.stone);
		//registerLegacyParts(2, Block.grass);
		registerManualParts(3, Block.dirt);
		registerManualParts(4, Block.cobblestone);
		registerManualParts(5, Block.planks, 0);
		registerManualParts(6, Block.planks, 1);
		registerManualParts(7, Block.planks, 2);
		registerManualParts(8, Block.planks, 3);
		registerManualParts(9, Block.bedrock);
		registerManualParts(10, Block.sand);
		registerManualParts(11, Block.gravel);
		registerManualParts(12, Block.oreGold);
		registerManualParts(13, Block.oreIron);
		registerManualParts(14, Block.oreCoal);
		registerManualParts(15, Block.wood, 0);
		registerManualParts(16, Block.wood, 1);
		registerManualParts(17, Block.wood, 2);
		registerManualParts(18, Block.wood, 3);
		//registerLegacyParts(19, Block.leaves, 0);
		//registerLegacyParts(20, Block.leaves, 1);
		//registerLegacyParts(21, Block.leaves, 2);
		//registerLegacyParts(22, Block.leaves, 3);
		registerManualParts(23, Block.sponge);
		registerManualParts(24, Block.glass);
		registerManualParts(25, Block.oreLapis);
		registerManualParts(26, Block.blockLapis);
		//registerManualParts(27, Block.dispenser);
		registerManualParts(28, Block.sandStone);
		//registerManualParts(29, Block.music);
		//registerManualParts(30, Block.pistonStickyBase);
		//registerManualParts(31, Block.pistonBase);
		registerManualParts(32, Block.cloth, 0);
		registerManualParts(33, Block.cloth, 1);
		registerManualParts(34, Block.cloth, 2);
		registerManualParts(35, Block.cloth, 3);
		registerManualParts(36, Block.cloth, 4);
		registerManualParts(37, Block.cloth, 5);
		registerManualParts(38, Block.cloth, 6);
		registerManualParts(39, Block.cloth, 7);
		registerManualParts(40, Block.cloth, 8);
		registerManualParts(41, Block.cloth, 9);
		registerManualParts(42, Block.cloth, 10);
		registerManualParts(43, Block.cloth, 11);
		registerManualParts(44, Block.cloth, 12);
		registerManualParts(45, Block.cloth, 13);
		registerManualParts(46, Block.cloth, 14);
		registerManualParts(47, Block.cloth, 15);
		registerManualParts(48, Block.blockGold);
		registerManualParts(49, Block.blockSteel);
		registerManualParts(50, Block.brick);
		//registerManualParts(51, Block.tnt);
		registerManualParts(52, Block.bookShelf);
		registerManualParts(53, Block.cobblestoneMossy);
		registerManualParts(54, Block.obsidian);
		//registerManualParts(55, Block.mobSpawner);
		registerManualParts(56, Block.oreDiamond);
		registerManualParts(57, Block.blockDiamond);
		//registerManualParts(58, Block.workbench);
		//registerManualParts(59, Block.stoneOvenIdle);
		registerManualParts(60, Block.oreRedstone);
		registerManualParts(61, Block.blockSnow);
		registerManualParts(62, Block.blockClay);
		//registerManualParts(63, Block.jukebox);
		registerManualParts(64, Block.pumpkin);
		registerManualParts(65, Block.netherrack);
		registerManualParts(66, Block.slowSand);
		registerManualParts(67, Block.glowStone);
		registerManualParts(68, Block.pumpkinLantern);
		registerManualParts(69, Block.stoneBrick);
		registerManualParts(70, Block.melon);
		registerManualParts(71, Block.mycelium);
		registerManualParts(72, Block.netherBrick);
		registerManualParts(73, Block.whiteStone, 0);
		registerManualParts(74, Block.whiteStone, 1);
		registerManualParts(75, Block.oreEmerald);
		registerManualParts(76, Block.blockEmerald);
		registerManualParts(77, Block.commandBlock);
		registerManualParts(78, Block.sandStone, 1);
		registerManualParts(79, Block.sandStone, 2);
		//registerManualParts(80, Block.redstoneLampIdle);
		
		
		//autoDetectParts();
	}
	
	private boolean isSanelyTexturedBlock(ItemStack is) {
		if(is.itemID >= Block.blocksList.length)
			return false;
		Block b = Block.blocksList[is.itemID];
		if(b == null || b.blockID != is.itemID)
			return false;
		
		String nameKey = is.getItem().getItemNameIS(is);
		if(nameKey == null || nameKey.equals("") || nameKey.equals("item."))
			return false;
		
		for(int k = 0; k < 6; k++) {
			if(b.getBlockTextureFromSideAndMetadata(k, is.getItemDamage()) != 0)
				return true;
		}
		if(!b.getTextureFile().equals("/terrain.png"))
			return true;
		return false;
	}
	
	private void autoDetectParts() {
		List<ItemStack> itemList = new ArrayList<ItemStack>();
		for(Item i : Item.itemsList) {
			if(i != null)
				i.getSubItems(i.itemID, null, itemList);
		}
		
		for(ItemStack is : itemList) {
			int meta = is.getItemDamage();
			if(meta > 1023 || meta < 0 || !isSanelyTexturedBlock(is))
				continue;
			
			Block b = Block.blocksList[is.itemID];
			if(!b.isOpaqueCube())
				continue;
			
			addCuttableBlock(b, meta);
		}
	}
	
	public void preinit() {
		// compatibility start
		{
			ConfigCategory category = Config.config.getCategory(Configuration.CATEGORY_ITEM);
			if(category.containsKey("itemSaw.id")) {
				Property prop = category.remove("itemSaw.id");
				Config.config.get(Configuration.CATEGORY_ITEM, "itemSaw", prop.getInt()).value = prop.value;
				Config.save();
			}
		}
		// compatibility end
		
		APILocator.getIDAllocator().requestBlock(ImmibisCore.instance, "blockMultipart", new IIDCallback() {
			@Override
			public void register(int id) {
				microblockContainerBlock = new BlockMicroblockContainer(id, Material.rock);
				microblockContainerBlock.setBlockName("inficraft.microblocks.microblock.container");
				LanguageRegistry.addName(microblockContainerBlock, "Microblock Container");
				GameRegistry.registerBlock(microblockContainerBlock, ItemMicroblock.class, "MicroblockContainer");
				
				if(!SidedProxy.instance.isDedicatedServer())
					MinecraftForgeClient.registerItemRenderer(microblockContainerBlock.blockID, new MicroblockItemRenderer());
			}
		});
		APILocator.getIDAllocator().requestItem(ImmibisCore.instance, "itemSaw", new IIDCallback() {
			@Override
			public void register(int id) {
				itemSaw = new ItemSaw(id - 256);
			}
		});
		APILocator.getIDAllocator().addRecipes(new Runnable() {
			@Override
			public void run() {
				@SuppressWarnings("unchecked")
				List<IRecipe> recipes = CraftingManager.getInstance().getRecipeList();
				
				recipes.add(new RecipeHollowCover());
				recipes.add(new RecipeUnHollowCover());
				recipes.add(new RecipeVerticalCut());
				recipes.add(new RecipeHorizontalCut());
				recipes.add(new RecipeCombineTwo());
				recipes.add(new RecipeCombineSeveral());
				
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(itemSaw), "IIP", "IIs", 'I', Item.ingotIron, 'p', "plankWood", 's', Item.stick));
			}
		});
	}
	
	public void init() {
		APILocator.getNetManager().listen(new IPacketMap() {
			@Override
			public String getChannel() {return CHANNEL;}

			@Override
			public IPacket createS2CPacket(byte id) {
				if(id == PKT_S2C_MICROBLOCK_CONTAINER_DESCRIPTION)
					return new PacketMicroblockContainerDescription();
				return null;
			}
			
			@Override
			public IPacket createC2SPacket(byte id) {
				return null;
			}
		});
		
		GameRegistry.registerTileEntity(TileMicroblockContainer.class, "inficraft.microblocks.multipart");
		
		if(!SidedProxy.instance.isDedicatedServer()) {
			MinecraftForge.EVENT_BUS.register(new MicroblockPlacementHighlightHandler());
		}
	}
	
	public static void registerManualParts(int n, Block block) {
		registerManualParts(n, block, 0);
	}
	
	private static class Info {
		public EnumPartClass clazz;
		public double size;
		public String prefix, suffix;
		public Info(EnumPartClass c, double s, String pr, String su)
		{
			clazz = c;
			size = s;
			prefix = pr;
			suffix = su;
		}
	}
	
	private static Info blockparts[] = new Info[] {
		new Info(EnumPartClass.Panel, 1.0/8.0, "", " Cover"),
		new Info(EnumPartClass.Panel, 2.0/8.0, "", " Panel"),
		new Info(EnumPartClass.Panel, 3.0/8.0, "", " Triple Cover"),
		new Info(EnumPartClass.Panel, 4.0/8.0, "", " Slab"),
		new Info(EnumPartClass.Panel, 5.0/8.0, "", " Cover Slab"),
		new Info(EnumPartClass.Panel, 6.0/8.0, "", " Triple Panel"),
		new Info(EnumPartClass.Panel, 7.0/8.0, "", " Anticover"),
		null,
		new Info(EnumPartClass.Strip, 1.0/8.0, "", " Cover Strip"),
		new Info(EnumPartClass.Strip, 2.0/8.0, "", " Panel Strip"),
		new Info(EnumPartClass.Strip, 3.0/8.0, "", " Triple Cover Strip"),
		new Info(EnumPartClass.Strip, 4.0/8.0, "", " Slab Strip"),
		new Info(EnumPartClass.Strip, 5.0/8.0, "", " Cover Slab Strip"),
		new Info(EnumPartClass.Strip, 6.0/8.0, "", " Triple Panel Strip"),
		new Info(EnumPartClass.Strip, 7.0/8.0, "", " Anticover Strip"),
		null,
		new Info(EnumPartClass.Corner, 1.0/8.0, "", " Cover Corner"),
		new Info(EnumPartClass.Corner, 2.0/8.0, "", " Panel Corner"),
		new Info(EnumPartClass.Corner, 3.0/8.0, "", " Triple Cover Corner"),
		new Info(EnumPartClass.Corner, 4.0/8.0, "", " Slab Corner"),
		new Info(EnumPartClass.Corner, 5.0/8.0, "", " Cover Slab Corner"),
		new Info(EnumPartClass.Corner, 6.0/8.0, "", " Triple Panel Corner"),
		new Info(EnumPartClass.Corner, 7.0/8.0, "", " Anticover Corner"),
		null,
		new Info(EnumPartClass.HollowPanel, 1.0/8.0, "Hollow ", " Cover"),
		new Info(EnumPartClass.HollowPanel, 2.0/8.0, "Hollow ", " Panel"),
		new Info(EnumPartClass.HollowPanel, 3.0/8.0, "Hollow ", " Triple Cover"),
		new Info(EnumPartClass.HollowPanel, 4.0/8.0, "Hollow ", " Slab"),
		new Info(EnumPartClass.HollowPanel, 5.0/8.0, "Hollow ", " Cover Slab"),
		new Info(EnumPartClass.HollowPanel, 6.0/8.0, "Hollow ", " Triple Panel"),
		new Info(EnumPartClass.HollowPanel, 7.0/8.0, "Hollow ", " Anticover"),
		null,
	};
	
	public static void registerManualParts(int n, Block block, int meta) {
		System.out.println("Registering a part with ID "+n);
		registerParts(n*64, block, meta);
	}
	
	private static void registerParts(int partIDBase, Block block, int meta) {
		assert(blockparts.length == 32);
		
		String nameKey = Item.itemsList[block.blockID].getItemNameIS(new ItemStack(block.blockID, 1, meta))+".name";
		String name = StringTranslate.getInstance().translateKey(nameKey);
		
		if(name.equals(nameKey)) {
			name = LanguageRegistry.instance().getStringLocalization(nameKey);
			if(name == null)
				name = LanguageRegistry.instance().getStringLocalization(nameKey, "en_US");
			if(name == null)
				return;
		}
		
		float hardness;
		try {
			hardness = block.getBlockHardness(null, 0, 0, 0);
		} catch(Throwable e) {
			e.printStackTrace();
			return;
		}
		
		int[] texindices = new int[6];
		for(int k = 0; k < 6; k++)
			texindices[k] = block.getBlockTextureFromSideAndMetadata(k, meta);
		
		for(int k = 0; k < 7; k++)
		{
			// making hollow covers
			RecipeHollowCover.addMap(partIDBase + k, partIDBase + k + 24);
			// reverting hollow covers
			RecipeUnHollowCover.addMap(partIDBase + k + 24, partIDBase + k);
			
			// cutting panels into strips
			RecipeHorizontalCut.addMap(new BlockMetaPair(microblockContainerBlock.blockID, partIDBase + k), ItemMicroblock.getStackWithPartID(partIDBase + k + 8, 2));
			
			// cutting strips into corners
			RecipeHorizontalCut.addMap(new BlockMetaPair(microblockContainerBlock.blockID, partIDBase + k + 8), ItemMicroblock.getStackWithPartID(partIDBase + k + 16, 2));
			
			// combining corners into strips
			RecipeCombineTwo.addMap(partIDBase + k + 16, partIDBase + k + 8);
			
			// combining strips into panels
			RecipeCombineTwo.addMap(partIDBase + k + 8, partIDBase + k);
		}
		
		// combining multiple panels
		RecipeCombineSeveral.addMap(partIDBase, new ItemStack(block, 1, meta));
		
		// combining multiple hollow panels
		RecipeCombineSeveral.addMap(partIDBase + 24, new ItemStack(block, 1, meta));
		
		// cutting full blocks/slabs/panels
		RecipeVerticalCut.addMap(new BlockMetaPair(block.blockID, meta), ItemMicroblock.getStackWithPartID(partIDBase+3, 2));
		RecipeVerticalCut.addMap(new BlockMetaPair(microblockContainerBlock.blockID, partIDBase+3), ItemMicroblock.getStackWithPartID(partIDBase+1, 2));
		RecipeVerticalCut.addMap(new BlockMetaPair(microblockContainerBlock.blockID, partIDBase+1), ItemMicroblock.getStackWithPartID(partIDBase+0, 2));
		
		// cutting hollow slabs/panels
		RecipeVerticalCut.addMap(new BlockMetaPair(microblockContainerBlock.blockID, partIDBase+27), ItemMicroblock.getStackWithPartID(partIDBase+25, 2));
		RecipeVerticalCut.addMap(new BlockMetaPair(microblockContainerBlock.blockID, partIDBase+25), ItemMicroblock.getStackWithPartID(partIDBase+24, 2));
		
		for(int k = 0; k < blockparts.length; k++)
			if(blockparts[k] != null)
			{
				PartType type = new PartType(
					blockparts[k].clazz,
					blockparts[k].size,
					blockparts[k].prefix+name+blockparts[k].suffix,
					hardness,
					block,
					meta
				);
				type.texfile = block.getTextureFile();
				type.textures = texindices;
				RegisterPartType(partIDBase+k, type);
			}
	}
	
	public static void RegisterPartType(int id, PartType type) {
		if(parts.containsKey(id))
			throw new PartIDInUseException(id, parts.get(id), type);
		parts.put(id, type);
		neiDamageValues.add(id);
		if(id >= neiMaxDamage)
			neiMaxDamage = id + 1;
		type.id = id;
		SidedProxy.instance.addLocalization("inficraft.microblocks.core.multipart."+id+".name", type.name);
	}

	@Override
	public IMicroblockCoverSystem createMicroblockCoverSystem(IMicroblockSupporterTile tile) {
		return new MicroblockCoverSystem(tile);
	}

	@Override
	public void addCuttableBlock(Block block, int meta) {
		if(block.blockID < 1 || block.blockID > 4095)
			throw new IllegalArgumentException("BlockID must be between 1 and 4095 inclusive");
		if(meta < 0 || meta > 1023)
			throw new IllegalArgumentException("meta must be between 0 and 1023 inclusive");
		registerParts(((block.blockID & 4095) << 20) | ((meta & 1023) << 10), block, meta);
	}
}
