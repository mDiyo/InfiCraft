package inficraft.infitools;

import inficraft.infitools.crafting.ToolBuilder;
import inficraft.infitools.crafting.ToolStationBlock;
import inficraft.infitools.items.Pattern;
import inficraft.infitools.items.ToolPart;
import inficraft.infitools.tools.Pickaxe;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class ToolItems
{	
	public static Item toolRod;
	public static Item toolShard;
	public static Item woodPattern;
	public static Item stonePattern;
	
	public static Item pickaxe;
	public static Item pickaxeHead;
	public static Item shovel;
	public static Item shovelHead;
	public static Item axe;
	public static Item axeHead;
	public static Item sword;
	public static Item swordBlade;
	
	public static Block crafter;
	
	public ToolItems()
	{
		createItems();		
		addToolRecipes();
		addCraftingRecipes();
	}
	
	void createItems()
	{
		crafter = new ToolStationBlock(PHInfiTools.crafter, Material.cactus);
		GameRegistry.registerBlock(crafter, "ToolStationBlock");
		GameRegistry.registerTileEntity(inficraft.infitools.crafting.ToolStationLogic.class, "ToolStation");		

		toolRod = new ToolPart(PHInfiTools.toolRod, 0, craftingTexture).setItemName("infitools.ToolRod");
		toolShard = new ToolPart(PHInfiTools.toolShard, 64, craftingTexture).setItemName("infitools.ToolShard");
		woodPattern = new Pattern(PHInfiTools.woodPattern, 128, craftingTexture).setItemName("WoodPattern");
		//stonePattern = new Pattern(PHInfiTools.stonePattern, 144, craftingTexture).setItemName("StonePattern");
		
		pickaxe = new Pickaxe(PHInfiTools.pickaxe, pickaxeTexture);
		LanguageRegistry.addName(pickaxe, "Pickaxe");		
		pickaxeHead = new ToolPart(PHInfiTools.pickaxeHead, 0, baseHeads).setItemName("infitools.PickaxeHead");
		
		shovel = new Pickaxe(PHInfiTools.shovel, shovelTexture);
		LanguageRegistry.addName(shovel, "Shovel");		
		shovelHead = new ToolPart(PHInfiTools.shovelHead, 64, baseHeads).setItemName("infitools.ShovelHead");
		
		axe = new Pickaxe(PHInfiTools.axe, axeTexture);
		LanguageRegistry.addName(axe, "Axe");		
		axeHead = new ToolPart(PHInfiTools.axeHead, 128, baseHeads).setItemName("infitools.AxeHead");
		
		sword = new Pickaxe(PHInfiTools.sword, swordTexture);
		LanguageRegistry.addName(sword, "Sword");		
		swordBlade = new ToolPart(PHInfiTools.swordBlade, 192, baseHeads).setItemName("infitools.SwordBlade");
	}
	
	void addToolRecipes()
	{
		ToolBuilder.instance.addToolRecipe(pickaxe, pickaxeHead, toolShard);
		ToolBuilder.instance.addToolRecipe(sword, swordBlade, toolShard);
		ToolBuilder.instance.addToolRecipe(axe, axeHead);
		ToolBuilder.instance.addToolRecipe(shovel, shovelHead, toolShard);
	}
	
	void addCraftingRecipes()
	{
		GameRegistry.addRecipe(new ItemStack(crafter), "c", 'c', Block.workbench);
		GameRegistry.addRecipe(new ItemStack(woodPattern, 1, 0), "ps", "sp", 'p', Block.planks, 's', Item.stick);
		GameRegistry.addRecipe(new ItemStack(woodPattern, 1, 1), "c", 'c', new ItemStack(woodPattern, 1, 0));
		GameRegistry.addRecipe(new ItemStack(woodPattern, 1, 3), "c", 'c', new ItemStack(woodPattern, 1, 1));
		GameRegistry.addRecipe(new ItemStack(woodPattern, 1, 4), "c", 'c', new ItemStack(woodPattern, 1, 3));
		GameRegistry.addRecipe(new ItemStack(woodPattern, 1, 5), "c", 'c', new ItemStack(woodPattern, 1, 4));
		GameRegistry.addRecipe(new ItemStack(woodPattern, 1, 6), "c", 'c', new ItemStack(woodPattern, 1, 5));
		
		for (int iter = 0; iter < materialArray.length; iter++)
		{
			GameRegistry.addShapelessRecipe(new ItemStack(swordBlade, 1, iter), new ItemStack(woodPattern, 1, 3), materialArray[iter]);
			GameRegistry.addShapelessRecipe(new ItemStack(pickaxeHead, 1, iter), new ItemStack(woodPattern, 1, 4), materialArray[iter]);
			GameRegistry.addShapelessRecipe(new ItemStack(axeHead, 1, iter), new ItemStack(woodPattern, 1, 5), materialArray[iter]);
			GameRegistry.addShapelessRecipe(new ItemStack(shovelHead, 1, iter), new ItemStack(woodPattern, 1, 6), materialArray[iter]);
			GameRegistry.addShapelessRecipe(new ItemStack(toolShard, 2, iter), new ItemStack(woodPattern, 1, 0), materialArray[iter]);
			GameRegistry.addShapelessRecipe(new ItemStack(toolRod, 2, iter), new ItemStack(woodPattern, 1, 1), materialArray[iter]);
		}
	}
	
	ItemStack[] materialArray = { new ItemStack(Block.planks), new ItemStack(Block.cobblestone), new ItemStack(Item.ingotIron), new ItemStack(Item.flint), 
			new ItemStack(Block.cactus), new ItemStack(Item.bone), new ItemStack(Block.obsidian), new ItemStack(Block.netherrack), new ItemStack(Item.slimeBall), 
			new ItemStack(Item.paper) };
	
	public static String craftingTexture = "/infitextures/materials.png";
	public static String baseHeads = "/infitextures/baseheads.png";
	
	public static String pickaxeTexture = "/infitextures/pickaxes.png";
	public static String swordTexture = "/infitextures/swords.png";
	public static String shovelTexture = "/infitextures/shovels.png";
	public static String axeTexture = "/infitextures/axes.png";
}