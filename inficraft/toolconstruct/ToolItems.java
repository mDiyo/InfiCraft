package inficraft.toolconstruct;

import inficraft.toolconstruct.blocks.ToolStationBlock;
import inficraft.toolconstruct.crafting.PatternBuilder;
import inficraft.toolconstruct.crafting.ToolBuilder;
import inficraft.toolconstruct.items.Pattern;
import inficraft.toolconstruct.items.ToolPart;
import inficraft.toolconstruct.tools.Axe;
import inficraft.toolconstruct.tools.Broadsword;
import inficraft.toolconstruct.tools.Pickaxe;
import inficraft.toolconstruct.tools.Shovel;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import cpw.mods.fml.common.registry.GameRegistry;

public class ToolItems
{
	//Patterns and other materials
	public static Item materials;
	public static Item toolRod;
	public static Item toolShard;
	public static Item woodPattern;
	public static Item stonePattern;
	
	//Tools
	public static Item pickaxe;
	public static Item shovel;
	public static Item axe;
	public static Item broadsword;
	public static Item fencingSword;
	public static Item rapier;
	
	//Tool parts
	public static Item pickaxeHead;
	public static Item shovelHead;
	public static Item axeHead;
	public static Item swordBlade;
	public static Item largeGuard;
	public static Item medGuard;
	public static Item crossbar;
	public static Item binding;
	
	//Crafting blocks
	public static Block woodCrafter;
	public static Block stoneCrafter;
	
	public ToolItems()
	{
		createItems();
		registerMaterials();
		addToolRecipes();
		addCraftingRecipes();
		setupToolTabs();
	}
	
	void createItems ()
	{
		woodCrafter = new ToolStationBlock(PHTools.woodCrafter, Material.wood);
		GameRegistry.registerBlock(woodCrafter, inficraft.toolconstruct.blocks.ToolStationItemBlock.class, "ToolStationBlock");
		GameRegistry.registerTileEntity(inficraft.toolconstruct.blocks.ToolStationLogic.class, "ToolStation");
		GameRegistry.registerTileEntity(inficraft.toolconstruct.blocks.PartCrafterLogic.class, "PartCrafter");

		materials = new ToolPart(PHTools.materials, 0, craftingTexture).setItemName("tconstruct.ToolRod");
		toolRod = new ToolPart(PHTools.toolRod, 0, craftingTexture).setItemName("tconstruct.ToolRod");
		toolShard = new ToolPart(PHTools.toolShard, 64, craftingTexture).setItemName("tconstruct.ToolShard");
		woodPattern = new Pattern(PHTools.woodPattern, 0, patternTexture).setItemName("tconstruct.WoodPattern");
		
		pickaxe = new Pickaxe(PHTools.pickaxe, pickaxeTexture);
		shovel = new Shovel(PHTools.shovel, shovelTexture);
		axe = new Axe(PHTools.axe, axeTexture);
		broadsword = new Broadsword(PHTools.broadsword, broadswordTexture);		
				
		pickaxeHead = new ToolPart(PHTools.pickaxeHead, 0, baseHeads).setItemName("tconstruct.PickaxeHead");
		shovelHead = new ToolPart(PHTools.shovelHead, 64, baseHeads).setItemName("tconstruct.ShovelHead");
		axeHead = new ToolPart(PHTools.axeHead, 128, baseHeads).setItemName("tconstruct.AxeHead");
		swordBlade = new ToolPart(PHTools.swordBlade, 0, swordparts).setItemName("tconstruct.SwordBlade");
		largeGuard = new ToolPart(PHTools.largeGuard, 64, swordparts).setItemName("tconstruct.LargeGuard");
		medGuard = new ToolPart(PHTools.medGuard, 128, swordparts).setItemName("tconstruct.MediumGuard");
		crossbar = new ToolPart(PHTools.crossbar, 192, swordparts).setItemName("tconstruct.Crossbar");
		binding = new ToolPart(PHTools.binding, 192, baseHeads).setItemName("tconstruct.Binding");
	}
	
	void registerMaterials ()
	{
		PatternBuilder pb = PatternBuilder.instance;
		pb.registerFullMaterial(Block.planks, 2, "wood", new ItemStack(Item.stick), new ItemStack(Item.stick), 0);
		pb.registerFullMaterial(Block.stone, 2, "stone", 1);
		pb.registerMaterial(Block.cobblestone, 2, "stone");
		pb.registerFullMaterial(Item.ingotIron, 2, "iron", 2);
		pb.registerFullMaterial(Item.flint, 2, "flint", 3);
		pb.registerFullMaterial(Block.cactus, 2, "cactus", 4);
		pb.registerFullMaterial(Item.bone, 2, "bone", new ItemStack(toolShard, 1, 5), new ItemStack(Item.bone), 5);
		pb.registerFullMaterial(Block.obsidian, 2, "obsidian", 6);
		pb.registerFullMaterial(Block.netherrack, 2, "netherrack", 7);
		pb.registerFullMaterial(Item.slimeBall, 2, "slime", 8); //TODO: Register a better material
		pb.registerFullMaterial(Item.paper, 2, "paper", new ItemStack(Item.paper), new ItemStack(toolRod, 1, 9), 9); //TODO: Register a better material
		
		Item[] items = { toolRod, pickaxeHead, shovelHead, axeHead, swordBlade, largeGuard, medGuard, crossbar, binding };
		for (int iter = 0; iter < items.length-1; iter++)
		{
			pb.addToolPattern(new ItemStack(woodPattern, 1, iter+1), items[iter]);
		}
	}
	
	void addToolRecipes ()
	{
		ToolBuilder tb = ToolBuilder.instance;
		tb.addToolRecipe(pickaxe, pickaxeHead, binding);
		tb.addToolRecipe(broadsword, swordBlade, largeGuard);
		tb.addToolRecipe(axe, axeHead);
		tb.addToolRecipe(shovel, shovelHead);
	}
	
	void addCraftingRecipes ()
	{
		GameRegistry.addRecipe(new ItemStack(woodCrafter), "c", 'c', Block.workbench);
		GameRegistry.addRecipe(new ItemStack(woodPattern, 1, 0), "ps", "sp", 'p', Block.planks, 's', Item.stick);
	}
	
	void setupToolTabs ()
	{
		ToolConstruct.materialTab.init(new ItemStack(ToolItems.woodPattern, 1, 127));
		ItemStack tool = new ItemStack(pickaxe, 1, 0);

		NBTTagCompound compound = new NBTTagCompound();
		compound.setCompoundTag("InfiTool", new NBTTagCompound());
		compound.getCompoundTag("InfiTool").setInteger("Head", 11);
		compound.getCompoundTag("InfiTool").setInteger("Handle", 0);
		compound.getCompoundTag("InfiTool").setInteger("Accessory", 4);
		tool.setTagCompound(compound);

		ToolConstruct.toolTab.init(tool);
	}
	
	ItemStack[] materialArray = { new ItemStack(Block.planks), new ItemStack(Block.cobblestone), new ItemStack(Item.ingotIron), new ItemStack(Item.flint), 
			new ItemStack(Block.cactus), new ItemStack(Item.bone), new ItemStack(Block.obsidian), new ItemStack(Block.netherrack), new ItemStack(Item.slimeBall), 
			new ItemStack(Item.paper) };
	
	public static String craftingTexture = "/infitextures/tools/materials.png";
	public static String patternTexture = "/infitextures/tools/patterns.png";
	public static String baseHeads = "/infitextures/tools/baseheads.png";
	public static String swordparts = "/infitextures/tools/swordparts.png";

	public static String pickaxeTexture = "/infitextures/tools/pickaxes.png";
	public static String broadswordTexture = "/infitextures/tools/swordbroad.png";
	public static String shovelTexture = "/infitextures/tools/shovels.png";
	public static String axeTexture = "/infitextures/tools/axes.png";
}