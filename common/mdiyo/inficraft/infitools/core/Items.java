package mDiyo.inficraft.infitools.core;
import mDiyo.inficraft.infitools.core.buckets.*;
import mDiyo.inficraft.infitools.library.InfiLibrary;
import net.minecraft.src.Block;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;
import net.minecraft.src.ModLoader;

public class Items 
{
	private static String[] bucketrecipe = { "# #", "# #", " # " };
	private static String[] bowlrecipe = { "# #", " # " };
	
	private static Items instance = new Items();
	
	public static Items getInstance()
	{
		return instance;
	}
	
	public static void init()
	{
		registerItems();
		addNames();
		createRecipes();
	}
	
	private static void registerItems()
	{
		woodBucketEmpty = new InfiBucketWood(PHInfiTools.woodBucketID + 0, 0).setIconCoord(0, 0);
        woodBucketWater = new InfiBucketWood(PHInfiTools.woodBucketID + 1, Block.waterMoving.blockID).setIconCoord(1, 0);
        woodBucketMilk = new InfiBucketWoodMilk(PHInfiTools.woodBucketID + 2).setIconCoord(2, 0);
        woodBucketSand = new InfiBucketWood(PHInfiTools.woodBucketID + 3, Block.sand.blockID).setIconCoord(3, 0);
        woodBucketGravel = new InfiBucketWood(PHInfiTools.woodBucketID + 4, Block.gravel.blockID).setIconCoord(4, 0);
        cactusBucketEmpty = new InfiBucketCactus(PHInfiTools.cactusBucketID + 0, 0).setIconCoord(5, 0);
        cactusBucketWater = new InfiBucketCactus(PHInfiTools.cactusBucketID + 1, Block.waterMoving.blockID).setIconCoord(6, 0);
        cactusBucketMilk = new InfiBucketCactusMilk(PHInfiTools.cactusBucketID + 2).setIconCoord(7, 0);
        cactusBucketSand = new InfiBucketCactus(PHInfiTools.cactusBucketID + 3, Block.sand.blockID).setIconCoord(8, 0);
        cactusBucketGravel = new InfiBucketCactus(PHInfiTools.cactusBucketID + 4, Block.gravel.blockID).setIconCoord(9, 0);
        goldBucketEmpty = new InfiBucketGold(PHInfiTools.goldBucketID + 0, 0).setIconCoord(10, 0);
        goldBucketWater = new InfiBucketGold(PHInfiTools.goldBucketID + 1, Block.waterMoving.blockID).setIconCoord(11, 0);
        goldBucketMilk = new InfiBucketGoldMilk(PHInfiTools.goldBucketID + 2).setIconCoord(12, 0);
        goldBucketSand = new InfiBucketGold(PHInfiTools.goldBucketID + 3, Block.sand.blockID).setIconCoord(13, 0);
        goldBucketGravel = new InfiBucketGold(PHInfiTools.goldBucketID + 4, Block.gravel.blockID).setIconCoord(14, 0);
        goldBucketLava = new InfiBucketGold(PHInfiTools.goldBucketID + 5, Block.lavaMoving.blockID).setIconCoord(15, 0);
        iceBucketEmpty = new InfiBucketIce(PHInfiTools.iceBucketID + 0, 0).setIconCoord(0, 1);
        iceBucketIce = new InfiBucketIce(PHInfiTools.iceBucketID + 1, Block.ice.blockID).setIconCoord(1, 1);
        iceBucketMilk = new InfiBucketIceMilk(PHInfiTools.iceBucketID + 2).setIconCoord(2, 1);
        iceBucketSand = new InfiBucketIce(PHInfiTools.iceBucketID + 3, Block.sand.blockID).setIconCoord(3, 1);
        iceBucketGravel = new InfiBucketIce(PHInfiTools.iceBucketID + 4, Block.gravel.blockID).setIconCoord(4, 1);
        lavaBucketEmpty = new InfiBucketLava(PHInfiTools.lavaBucketID + 0, 0).setIconCoord(5, 1);
        lavaBucketGlass = new InfiBucketLava(PHInfiTools.lavaBucketID + 1, Block.glass.blockID).setIconCoord(6, 1);
        lavaBucketCobblestone = new InfiBucketLava(PHInfiTools.lavaBucketID + 2, Block.cobblestone.blockID).setIconCoord(7, 1);
        lavaBucketLava = new InfiBucketLava(PHInfiTools.lavaBucketID + 3, Block.lavaMoving.blockID).setIconCoord(8, 1);
        slimeBucketEmpty = new InfiBucketSlime(PHInfiTools.slimeBucketID + 0, 0).setIconCoord(9, 1);
        slimeBucketWater = new InfiBucketSlime(PHInfiTools.slimeBucketID + 1, Block.waterMoving.blockID).setIconCoord(10, 1);
        slimeBucketMilk = new InfiBucketSlimeMilk(PHInfiTools.slimeBucketID + 2).setIconCoord(11, 1);
        slimeBucketSand = new InfiBucketSlime(PHInfiTools.slimeBucketID + 3, Block.sand.blockID).setIconCoord(12, 1);
        slimeBucketGravel = new InfiBucketSlime(PHInfiTools.slimeBucketID + 4, Block.gravel.blockID).setIconCoord(13, 1);
        ironBucketSand = new InfiBucketIron(PHInfiTools.ironBucketID + 0, Block.sand.blockID).setIconCoord(14, 1);
        ironBucketGravel = new InfiBucketIron(PHInfiTools.ironBucketID + 1, Block.gravel.blockID).setIconCoord(15, 1);
        obsidianBucketEmpty = new InfiBucketObsidian(PHInfiTools.obsidianBucketID + 0, 0).setIconCoord(0, 2);
        obsidianBucketWater = new InfiBucketObsidian(PHInfiTools.obsidianBucketID + 1, Block.waterMoving.blockID).setIconCoord(1, 2);
        obsidianBucketMilk = new InfiBucketObsidianMilk(PHInfiTools.obsidianBucketID + 2).setIconCoord(2, 2);
        obsidianBucketSand = new InfiBucketObsidian(PHInfiTools.obsidianBucketID + 3, Block.sand.blockID).setIconCoord(3, 2);
        obsidianBucketGravel = new InfiBucketObsidian(PHInfiTools.obsidianBucketID + 4, Block.gravel.blockID).setIconCoord(4, 2);
        obsidianBucketLava = new InfiBucketObsidian(PHInfiTools.obsidianBucketID + 5, Block.lavaMoving.blockID).setIconCoord(5, 2);
        
        multiBowlEmpty = new EmptyBowl(PHInfiTools.bowlID, "customBowl").setIconCoord(0, 3);
        multiBowlSoup = new SoupBowl(PHInfiTools.soupBowlID, 8, "Mushroom Stew").setIconCoord(0, 4);
	}
	
	private static void addNames()
	{
		ModLoader.addLocalization("item.bucketWood.name", "Wooden Bucket");
		ModLoader.addLocalization("item.bucketCactus.name", "Cactus Bucket");
		ModLoader.addLocalization("item.bucketGold.name", "Gold Bucket");
		ModLoader.addLocalization("item.bucketIce.name", "Ice Bucket");
		ModLoader.addLocalization("item.bucketLava.name", "Fiery Bucket");
		ModLoader.addLocalization("item.bucketSlime.name", "Slime Bucket");
		ModLoader.addLocalization("item.bucketObsidian.name", "Obsidian Bucket");
		
		ModLoader.addLocalization("stoneCustomBowl.name", "Stone Bowl");
		ModLoader.addLocalization("ironCustomBowl.name", "Iron Bowl");
		ModLoader.addLocalization("goldCustomBowl.name", "Gold Bowl");
		ModLoader.addLocalization("netherrackCustomBowl.name", "Netherrack Bowl");
		ModLoader.addLocalization("slimeCustomBowl.name", "Slime Bowl");
		ModLoader.addLocalization("cactusCustomBowl.name", "Cactus Bowl");
		ModLoader.addLocalization("glassCustomBowl.name", "Glass Bowl");
		ModLoader.addLocalization("obsidianCustomBowl.name", "Obsidian Bowl");
	}
	
	private static void createRecipes()
	{
		ModLoader.addRecipe(new ItemStack(woodBucketEmpty), new Object[] 
                { bucketrecipe, '#', Block.planks });
		ModLoader.addRecipe(new ItemStack(cactusBucketEmpty), new Object[] 
                { bucketrecipe, '#', Block.cactus });
		ModLoader.addRecipe(new ItemStack(goldBucketEmpty), new Object[] 
                { bucketrecipe, '#', Item.goldNugget });
		ModLoader.addRecipe(new ItemStack(iceBucketEmpty), new Object[] 
                { bucketrecipe, '#', Block.ice });
		ModLoader.addRecipe(new ItemStack(lavaBucketEmpty), new Object[] 
                { bucketrecipe, '#', InfiLibrary.lavaFragment });
		ModLoader.addRecipe(new ItemStack(lavaBucketEmpty), new Object[] 
                { bucketrecipe, '#', Item.bucketLava });
		ModLoader.addRecipe(new ItemStack(lavaBucketEmpty), new Object[] 
                { bucketrecipe, '#', goldBucketLava });
		ModLoader.addRecipe(new ItemStack(lavaBucketEmpty), new Object[] 
                { bucketrecipe, '#', lavaBucketLava });
		ModLoader.addRecipe(new ItemStack(slimeBucketEmpty), new Object[] 
                { bucketrecipe, '#', Item.slimeBall });
		ModLoader.addRecipe(new ItemStack(Item.bucketEmpty), new Object[] 
                { bucketrecipe, '#', Item.ingotIron });
		
		Item[] lavaBuckets = {
			Item.bucketLava, goldBucketLava, lavaBucketLava
		};
		
		Item[] waterBuckets = {
			Item.bucketWater, woodBucketWater, cactusBucketWater, goldBucketWater, slimeBucketWater	
		};
		
		for (int i = 0; i < lavaBuckets.length; i++)
		{
			for (int j = 0; j < waterBuckets.length; j++)
			{
				addBlazeCrystalRecipes(new ItemStack(lavaBuckets[i]), new ItemStack(waterBuckets[j]));
			}
		}
		
		for (int i = 0; i < 8; i++)
		{
			ModLoader.addShapelessRecipe(new ItemStack(multiBowlSoup, 1, i), new Object[] 
	                { new ItemStack(multiBowlEmpty, 1, i), Block.mushroomBrown, Block.mushroomRed });
		}
		
		ModLoader.addRecipe(new ItemStack(multiBowlEmpty, 4, 0), new Object[] 
                { bowlrecipe, '#', Block.cobblestone });
		ModLoader.addRecipe(new ItemStack(multiBowlEmpty, 8, 1), new Object[] 
                { bowlrecipe, '#', Item.ingotIron });
		ModLoader.addRecipe(new ItemStack(multiBowlEmpty, 1, 2), new Object[] 
                { bowlrecipe, '#', Item.goldNugget });
		ModLoader.addRecipe(new ItemStack(multiBowlEmpty, 4, 3), new Object[] 
                { bowlrecipe, '#', Block.netherrack });
		ModLoader.addRecipe(new ItemStack(multiBowlEmpty, 4, 4), new Object[] 
                { bowlrecipe, '#', Item.slimeBall });
		ModLoader.addRecipe(new ItemStack(multiBowlEmpty, 4, 5), new Object[] 
                { bowlrecipe, '#', Block.cactus });
		ModLoader.addRecipe(new ItemStack(multiBowlEmpty, 4, 6), new Object[] 
                { bowlrecipe, '#', Block.glass });
		ModLoader.addRecipe(new ItemStack(multiBowlEmpty, 4, 7), new Object[] 
                { bowlrecipe, '#', Block.obsidian });
	}
	
	private static void addBlazeCrystalRecipes(ItemStack lava, ItemStack water)
	{
		ModLoader.addRecipe(new ItemStack(InfiLibrary.blazeCrystal, 1), new Object[]
	            { "pwp", "ncn", "plp", 'p', Item.blazePowder, 'w', water, 
			'l', lava, 'c', Item.magmaCream, 'n', Block.netherrack });
		ModLoader.addRecipe(new ItemStack(InfiLibrary.blazeCrystal, 1), new Object[]
	            { "plp", "ncn", "pwp", 'p', Item.blazePowder, 'w', water, 
			'l', lava, 'c', Item.magmaCream, 'n', Block.netherrack });
		ModLoader.addRecipe(new ItemStack(InfiLibrary.blazeCrystal, 1), new Object[]
	            { "pnp", "lcw", "pnp", 'p', Item.blazePowder, 'w', water, 
			'l', lava, 'c', Item.magmaCream, 'n', Block.netherrack });
	}
	
	public static void addStoneBowl(ItemStack stack)
	{
		ModLoader.addRecipe(new ItemStack(multiBowlEmpty, 4, 0), new Object[] 
                { bowlrecipe, '#', "customCobblestone" });
	}
	
    public static Item woodBucketEmpty;
    public static Item woodBucketWater;
    public static Item woodBucketMilk;
    public static Item woodBucketSand;
    public static Item woodBucketGravel;
    public static Item cactusBucketEmpty;
    public static Item cactusBucketWater;
    public static Item cactusBucketMilk;
    public static Item cactusBucketSand;
    public static Item cactusBucketGravel;
    public static Item goldBucketEmpty;
    public static Item goldBucketWater;
    public static Item goldBucketMilk;
    public static Item goldBucketSand;
    public static Item goldBucketGravel;
    public static Item goldBucketLava;
    public static Item iceBucketEmpty;
    public static Item iceBucketIce;
    public static Item iceBucketMilk;
    public static Item iceBucketSand;
    public static Item iceBucketGravel;
    public static Item lavaBucketEmpty;
    public static Item lavaBucketGlass;
    public static Item lavaBucketCobblestone;
    public static Item lavaBucketLava;
    public static Item slimeBucketEmpty;
    public static Item slimeBucketWater;
    public static Item slimeBucketMilk;
    public static Item slimeBucketSand;
    public static Item slimeBucketGravel;
    public static Item ironBucketSand;
    public static Item ironBucketGravel;
    public static Item obsidianBucketEmpty;
    public static Item obsidianBucketWater;
    public static Item obsidianBucketMilk;
    public static Item obsidianBucketSand;
    public static Item obsidianBucketGravel;
    public static Item obsidianBucketLava;
    
    public static Item multiBowlEmpty;
    public static Item multiBowlSoup;
}
