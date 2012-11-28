package mDiyo.inficraft.infitools.base;

import java.util.Random;

import mDiyo.shared.items.InfiTexturedItem;
import net.minecraft.src.Block;
import net.minecraft.src.Enchantment;
import net.minecraft.src.EntityPlayer;
import net.minecraft.src.FurnaceRecipes;
import net.minecraft.src.IInventory;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;
import net.minecraft.src.ModLoader;
import net.minecraft.src.NBTTagCompound;
import net.minecraft.src.NBTTagList;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;
import cpw.mods.fml.common.ICraftingHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

    /* Notes
     * 
     * Each shard is worth 1/3 of its respective material. 
     * 2 shards can make 2 rods, while 2 material makes 4 rods.
     * The grindstone can be used to gain a shard of many kinds.
     * Freezing enchants and abilities require base edits
     * Poison enchants have a chance to wear off when hitting mobs
     */

@Mod(modid = "InfiBase", name = "InfiBase", version = "1.1 for 1.3.2")
public class mod_InfiBase
{
	Random rand = new Random();
	InfiEnchantPoison poison = new InfiEnchantPoison(41, 2);
	InfiEnchantFreezing freeze = new InfiEnchantFreezing(42, 2);
	
	@Instance("InfiBase")
	public static mod_InfiBase instance;
	
	@Init
	public void load(FMLInitializationEvent event)
	{
		GameRegistry.registerBlock(blockMoss);
		GameRegistry.registerBlock(slimeSand);
		ModLoader.addLocalization("enchantment.frost", "Frost");
		ModLoader.addLocalization("enchantment.poison", "Poison");
		this.addBaseRecipes();
		this.addMaterialRecipes();
		this.oreDictionarySupport();
		//this.addOrizonSupport();
		this.setupCraftHook();
        MinecraftForge.EVENT_BUS.register(new EnchantHandler());
        GameRegistry.registerFuelHandler(new InfiFuelHandler());
	}
	
	public void addCustomName(ItemStack stack, String name)
    {
        if (stack.stackTagCompound == null)
        {
        	stack.setTagCompound(new NBTTagCompound());
        }

        if (!stack.stackTagCompound.hasKey("customName"))
        {
        	stack.stackTagCompound.setTag("customName", new NBTTagList("customName"));
        }

        NBTTagList var3 = (NBTTagList)stack.stackTagCompound.getTag("customName");
        NBTTagCompound var4 = new NBTTagCompound();
        var4.setString("customName", name);
        var3.appendTag(var4);
    }
	
	private void addBaseRecipes()
	{
		ModLoader.addRecipe(new ItemStack(redstoneCrystal, 1), new Object[]
		        { " # ", "#m#", " # ", '#', Item.redstone, 'm', ironChunk });
		ModLoader.addRecipe(new ItemStack(glowstoneCrystal, 1), new Object[]
		        { " # ", "#m#", " # ", '#', Item.lightStoneDust, 'm', ironChunk });
		
		ModLoader.addShapelessRecipe(new ItemStack(lavaCrystal, 1), new Object[]
		        { this.obsidianCrystal, Item.bucketLava, Item.bucketLava, Item.bucketLava });
		ModLoader.addRecipe(new ItemStack(glowstoneCrystal, 1), new Object[]
		        { " r ", "gpg", " r ", 'r', Item.redstone, 'g', Item.lightStoneDust, 'm', Item.paper });
		ModLoader.addRecipe(new ItemStack(glowstoneCrystal, 1), new Object[]
		        { " g ", "rpr", " g ", 'r', Item.redstone, 'g', Item.lightStoneDust, 'm', Item.paper });
		ModLoader.addShapelessRecipe(new ItemStack(obsidianCrystal, 1), new Object[]
		        { Block.obsidian, this.paperDust, this.paperDust, this.paperDust });
		ModLoader.addShapelessRecipe(new ItemStack(paperDust, 1), new Object[]
		        { Item.paper, Item.redstone, Item.redstone, Item.lightStoneDust, Item.lightStoneDust });
		
		ModLoader.addRecipe(new ItemStack(grindstone, 1), new Object[]
		        { "#", '#', Block.stone });
		
		ModLoader.addShapelessRecipe(new ItemStack(slimeSand, 1), new Object[]
		        { Item.slimeBall, Block.sand });
		FurnaceRecipes.smelting().addSmelting(slimeSand.blockID, 0, new ItemStack(slimeCrystal, 1), 0);
		ModLoader.addRecipe(new ItemStack(blazeCrystal, 1), new Object[]
                { "pwp", "ncn", "plp", 'p', Item.blazePowder, 'w', new ItemStack(Item.bucketWater, 1, -1), 
			'l', new ItemStack(Item.bucketLava, 1, -1), 'c', Item.magmaCream, 'n', Block.netherrack });
		ModLoader.addRecipe(new ItemStack(blazeCrystal, 1), new Object[]
                { "plp", "ncn", "pwp", 'p', Item.blazePowder, 'w', new ItemStack(Item.bucketWater, 1, -1), 
			'l', new ItemStack(Item.bucketLava, 1, -1), 'c', Item.magmaCream, 'n', Block.netherrack });
		ModLoader.addRecipe(new ItemStack(blazeCrystal, 1), new Object[]
                { "pnp", "lcw", "pnp", 'p', Item.blazePowder, 'w', new ItemStack(Item.bucketWater, 1, -1), 
			'l', new ItemStack(Item.bucketLava, 1, -1), 'c', Item.magmaCream, 'n', Block.netherrack });
		
		//Chainmail
		ModLoader.addRecipe(new ItemStack(Item.helmetChain, 1), new Object[] {"###", "# #", '#', this.ironChunk});
		ModLoader.addRecipe(new ItemStack(Item.plateChain, 1), new Object[] {"# #", "###", "###", '#', this.ironChunk});
		ModLoader.addRecipe(new ItemStack(Item.legsChain, 1), new Object[] {"###", "# #", "# #", '#', this.ironChunk});
		ModLoader.addRecipe(new ItemStack(Item.bootsChain, 1), new Object[] {"# #", "# #", '#', this.ironChunk});
		
		//Paper
		ModLoader.addRecipe(new ItemStack(this.paperStack, 1), new Object[]
		        { "##", "##", '#', Item.paper });
		ModLoader.addRecipe(new ItemStack(Item.paper, 4), new Object[]
		        { "#", '#', this.paperStack });
		      
		//Cactus greens to charcoal
	    FurnaceRecipes.smelting().addSmelting(Item.dyePowder.shiftedIndex, 2, new ItemStack(Item.coal, 1, 1), 0.15f);
	    
	    //Mossy materials
	    ModLoader.addRecipe(new ItemStack(mossBall, 4), new Object[]
                { "m", 'm', Block.cobblestoneMossy });
        ModLoader.addRecipe(new ItemStack(mossBall, 4), new Object[]
                { "m", 'm', new ItemStack(Block.stoneBrick, 1, 1) });
        
	    ModLoader.addShapelessRecipe(new ItemStack(Block.cobblestoneMossy, 1, 0), new Object[]
                { mossyPatch, Block.cobblestone });
        ModLoader.addShapelessRecipe(new ItemStack(Block.stoneBrick, 1, 1), new Object[]
                { mossyPatch, Block.stoneBrick  });
        
        ModLoader.addRecipe(new ItemStack(mossyPatch, 1), new Object[]
                {
                    "mm", "mm", 'm', mossBall
                });
        ModLoader.addRecipe(new ItemStack(mossBall, 4), new Object[]
                {
                	"m", 'm', mossyPatch
                });
        ModLoader.addRecipe(new ItemStack(mossyStone, 1), new Object[]
                { " m ", "msm", " m ", 'm', mossyPatch, 's', Block.stone });
	}
	
	private void addMaterialRecipes()
	{
		ModLoader.addRecipe(new ItemStack(stoneRod, 4), new Object[] 
                { "#", "#", '#', Block.cobblestone });
		ModLoader.addRecipe(new ItemStack(ironRod, 4), new Object[] 
                { "#", "#", '#', Item.ingotIron });
		ModLoader.addRecipe(new ItemStack(diamondRod, 4), new Object[] 
                { "#", "#", '#', Item.diamond });
		ModLoader.addRecipe(new ItemStack(redstoneRod, 4), new Object[] 
                { "#", "#", '#', this.redstoneCrystal });
		ModLoader.addRecipe(new ItemStack(obsidianRod, 4), new Object[] 
                { "#", "#", '#', Block.obsidian });
		ModLoader.addRecipe(new ItemStack(sandstoneRod, 4), new Object[] 
                { "#", "#", '#', Block.sandStone });
		ModLoader.addRecipe(new ItemStack(boneRod, 2), new Object[] 
                { "#", "#", '#', Item.bone });
		ModLoader.addRecipe(new ItemStack(paperRod, 4), new Object[] 
                { "#", "#", '#', this.paperStack });
		ModLoader.addRecipe(new ItemStack(mossyRod, 4), new Object[] 
                { "#", "#", '#', this.mossyStone });
		ModLoader.addRecipe(new ItemStack(netherrackRod, 4), new Object[] 
                { "#", "#", '#', Block.netherrack });
		ModLoader.addRecipe(new ItemStack(glowstoneRod, 4), new Object[] 
                { "#", "#", '#', this.glowstoneCrystal });
		ModLoader.addRecipe(new ItemStack(iceRod, 4), new Object[] 
                { "#", "#", '#', Block.ice });
		ModLoader.addRecipe(new ItemStack(lavaRod, 4), new Object[] 
                { "#", "#", '#', this.lavaCrystal });
		ModLoader.addRecipe(new ItemStack(slimeRod, 4), new Object[] 
                { "#", "#", '#', this.slimeCrystal });
		ModLoader.addRecipe(new ItemStack(cactusRod, 4), new Object[] 
                { "#", "#", '#', Block.cactus });
		ModLoader.addRecipe(new ItemStack(flintRod, 4), new Object[] 
                { "#", "#", '#', Item.flint });
		
		ModLoader.addRecipe(new ItemStack(Item.stick, 1), new Object[] 
                { "#", "#", "#", '#', this.woodSplinters });
		ModLoader.addRecipe(new ItemStack(stoneRod, 2), new Object[] 
                { "#", "#", '#', this.stoneShard });
		ModLoader.addRecipe(new ItemStack(ironRod, 2), new Object[] 
                { "#", "#", '#', this.ironChunk });
		ModLoader.addRecipe(new ItemStack(diamondRod, 2), new Object[] 
                { "#", "#", '#', this.diamondShard });
		ModLoader.addRecipe(new ItemStack(redstoneRod, 2), new Object[] 
                { "#", "#", '#', this.redstoneFragment });
		ModLoader.addRecipe(new ItemStack(obsidianRod, 2), new Object[] 
                { "#", "#", '#', this.obsidianShard });
		ModLoader.addRecipe(new ItemStack(sandstoneRod, 2), new Object[] 
                { "#", "#", '#', this.sandstoneShard });
		/*ModLoader.addRecipe(new ItemStack(boneRod, 2), new Object[] 
                { "#", "#", '#', Item.bone });*/
		ModLoader.addRecipe(new ItemStack(paperRod, 2), new Object[] 
                { "#", "#", '#', Item.paper });
		ModLoader.addRecipe(new ItemStack(mossyRod, 2), new Object[] 
                { "#", "#", '#', this.mossyPatch });
		ModLoader.addRecipe(new ItemStack(netherrackRod, 2), new Object[] 
                { "#", "#", '#', this.netherrackShard });
		ModLoader.addRecipe(new ItemStack(glowstoneRod, 2), new Object[] 
                { "#", "#", '#', this.glowstoneFragment });
		ModLoader.addRecipe(new ItemStack(iceRod, 2), new Object[] 
                { "#", "#", '#', this.iceShard });
		ModLoader.addRecipe(new ItemStack(lavaRod, 2), new Object[] 
                { "#", "#", '#', this.lavaFragment });
		ModLoader.addRecipe(new ItemStack(slimeRod, 2), new Object[] 
                { "#", "#", '#', this.slimeFragment });
		ModLoader.addRecipe(new ItemStack(cactusRod, 2), new Object[] 
                { "#", "#", '#', this.cactusShard });
		ModLoader.addRecipe(new ItemStack(flintRod, 2), new Object[] 
                { "#", "#", '#', this.flintShard });
		
		ModLoader.addShapelessRecipe(new ItemStack(stoneShard, 3), new Object[] 
                { new ItemStack(grindstone, 1, -1), Block.cobblestone });
		ModLoader.addShapelessRecipe(new ItemStack(ironChunk, 3), new Object[] 
                { new ItemStack(grindstone, 1, -1), Item.ingotIron });
		ModLoader.addShapelessRecipe(new ItemStack(diamondShard, 3), new Object[] 
                { new ItemStack(grindstone, 1, -1), Item.diamond });
		ModLoader.addShapelessRecipe(new ItemStack(redstoneFragment, 3), new Object[] 
                { new ItemStack(grindstone, 1, -1), this.redstoneCrystal });
		ModLoader.addShapelessRecipe(new ItemStack(obsidianShard, 3), new Object[] 
                { new ItemStack(grindstone, 1, -1), Block.obsidian });
		ModLoader.addShapelessRecipe(new ItemStack(sandstoneShard, 3), new Object[] 
                { new ItemStack(grindstone, 1, -1), Block.sandStone });
		ModLoader.addShapelessRecipe(new ItemStack(netherrackShard, 3), new Object[] 
                { new ItemStack(grindstone, 1, -1), Block.netherrack });
		ModLoader.addShapelessRecipe(new ItemStack(glowstoneFragment, 3), new Object[] 
                { new ItemStack(grindstone, 1, -1), this.glowstoneCrystal });
		ModLoader.addShapelessRecipe(new ItemStack(iceShard, 3), new Object[] 
                { new ItemStack(grindstone, 1, -1), Block.ice });
		ModLoader.addShapelessRecipe(new ItemStack(lavaFragment, 3), new Object[] 
                { new ItemStack(grindstone, 1, -1), this.lavaCrystal });
		ModLoader.addShapelessRecipe(new ItemStack(slimeFragment, 3), new Object[] 
                { new ItemStack(grindstone, 1, -1), this.slimeCrystal });
		ModLoader.addShapelessRecipe(new ItemStack(cactusShard, 3), new Object[] 
                { new ItemStack(grindstone, 1, -1), Block.cactus });
		ModLoader.addShapelessRecipe(new ItemStack(flintShard, 3), new Object[] 
                { new ItemStack(grindstone, 1, -1), Item.flint });
		ModLoader.addShapelessRecipe(new ItemStack(Item.flint, 1), new Object[] 
                { new ItemStack(grindstone, 1, -1), Block.gravel });
		ModLoader.addShapelessRecipe(new ItemStack(this.coalBit, 4), new Object[] 
                { new ItemStack(grindstone, 1, -1), new ItemStack(Item.coal, 1, 0) });
		ModLoader.addShapelessRecipe(new ItemStack(this.glassShard, 1), new Object[] 
                { new ItemStack(grindstone, 1, -1), Block.glass });
		
		Item[] stickArray = { 
	    		stoneRod, ironRod, diamondRod, redstoneRod, obsidianRod,
	    		sandstoneRod, Item.bone, paperRod, mossyRod, netherrackRod, glowstoneRod, lavaRod, 
	    		iceRod, slimeRod, cactusRod, flintRod, Item.blazeRod
	    	};
	        
	        Item[] shardArrayShort = {
	        	stoneShard, ironChunk, diamondShard, redstoneFragment, obsidianShard,
	        	sandstoneShard, netherrackShard, glowstoneFragment, iceShard, lavaFragment, slimeFragment,
	        	blazeFragment
	        };
	        
	    for (int stickIter = 0; stickIter < stickArray.length; stickIter++)
		{
	        ModLoader.addRecipe(new ItemStack(Item.bow, 1), new Object[]
	            { "s| ", "s |", "s| ", Character.valueOf('s'), Item.silk, Character.valueOf('|'), stickArray[stickIter] });
			ModLoader.addRecipe(new ItemStack(Block.lever, 1), new Object[]
			    { "s", "c", 'c', new ItemStack(Block.cobblestone, 1, 0), 's', stickArray[stickIter] });
			ModLoader.addRecipe(new ItemStack(Block.rail, 16), new Object[]
			    { "c c", "csc", "c c", 'c', new ItemStack(Item.ingotIron, 1, 0), 's', stickArray[stickIter] });
			ModLoader.addRecipe(new ItemStack(Block.railPowered, 6), new Object[]
			    { "c c", "csc", "crc", 'c', new ItemStack(Item.ingotGold, 1, -1), 
				's', stickArray[stickIter], 'r', new ItemStack(Item.redstone, 1, 0) });
			ModLoader.addRecipe(new ItemStack(Block.rail, 16), new Object[]
			    { "c c", "csc", "c c", 'c', new ItemStack(Item.ingotIron, 1, 0), 's', stickArray[stickIter] });
			ModLoader.addRecipe(new ItemStack(Item.feather, 4), new Object[]
			    { " | ", "s|s", "s|s", '|', stickArray[stickIter], 's', Item.silk });
			ModLoader.addRecipe(new ItemStack(Item.feather, 4), new Object[]
			{ "s|s", "s|s", " | ", '|', stickArray[stickIter], 's', Item.silk });
			
			for(int shardIter = 0; shardIter < shardArrayShort.length; shardIter++) {
	       		ModLoader.addRecipe(new ItemStack(Item.arrow, 1), new Object[]
	       		    { "s", "|", 's', shardArrayShort[shardIter], '|', stickArray[stickIter] });
	      		ModLoader.addRecipe(new ItemStack(Item.arrow, 4), new Object[]
	                { "s", "|", "f", 's', shardArrayShort[shardIter], '|', stickArray[stickIter], 'f', Item.feather });
	       	}
		}
	        
	    ModLoader.addRecipe(new ItemStack(Item.feather, 4), new Object[]
	        { " | ", "s|s", "s|s", '|', Item.stick, 's', Item.silk });
	    ModLoader.addRecipe(new ItemStack(Item.feather, 4), new Object[]
	        { "s|s", "s|s", " | ", '|', Item.stick, 's', Item.silk });
	    
	    ModLoader.addRecipe(new ItemStack(Item.brewingStand, 1), new Object[]
		        { "|||", " g ", "ccc", '|', ironRod, 'g', Item.ingotGold, 'c', Block.cobblestone });
	}
	
	private void oreDictionarySupport()
    {
		Item[] materialArray = { 
	       		stoneRod, ironRod, diamondRod, redstoneRod, obsidianRod,
	       		sandstoneRod, paperRod, mossyRod, netherrackRod, glowstoneRod, lavaRod, 
	       		iceRod, slimeRod, cactusRod, flintRod,
	       		copperRod, bronzeRod, workedIronRod, steelRod,
	       		cobaltRod, arditeRod, manyullynRod, uraniumRod,
	        		
	       		woodSplinters, stoneShard, ironChunk, diamondShard, redstoneFragment,
	       		obsidianShard, sandstoneShard, netherrackShard, glowstoneFragment, iceShard,
	       		lavaFragment, slimeFragment, flintShard, blazeFragment,
	       		glassShard, coalBit, 
	       		
	       		copperChunk, bronzeChunk, workedIronChunk, steelChunk,
	       		cobaltChunk, arditeChunk, manyullynChunk, uraniumChunk,
	       		
	       		redstoneCrystal, glowstoneCrystal, lavaCrystal, blazeCrystal,
	       		slimeCrystal,
	       		
	       		mossyPatch, mossyStone
	    	};
	        
	    String[] stickNames = {
	        "stoneRod", "ironRod", "diamondRod", "redstoneRod", "obsidianRod",
	        "sandstoneRod", "paperRod", "mossyRod", "netherrackRod", "glowstoneRod", "lavaRod",
	        "iceRod", "slimeRod", "cactusRod", "flintRod",
	        
	        "copperRod", "bronzeRod", "workedIronRod", "steelRod",
	        "cobaltRod", "arditeRod", "manyullynRod", "uraniumRod",
	        
	        "woodShard", "stoneShard", "ironShard", "diamondShard", "redstoneShard",
	        "obsidianShard", "sandstoneShard", "netherrackShard", "glowstoneShard", "iceShard",
	        "lavaShard", "slimeShard", "flintShard", "blazeShard",
	        "glassShard", "coalShard", 
	        
	        "copperShard", "bronzeShard", "refinedIronShard", "steelShard",
	        "cobaltShard", "arditeShard", "manyullynShard", "uraniumShard",
	        	
	        "redstoneCrystal", "glowstoneCrystal", "lavaCrystal", "blazeCrystal",
	        "slimeCrystal",
	        
	        "mossyPatch", "mossyStone"
	    };
	        
	    for (int stickIter = 0; stickIter < materialArray.length; stickIter++)
		{
	       	OreDictionary.registerOre(stickNames[stickIter], new ItemStack(materialArray[stickIter]));
		}
	    
	    GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(stoneRod, 4), "#", "#", '#', "customCobblestone"));
	    GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(grindstone, 1), "#", '#', "customStone"));
	    GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(copperRod, 4), "#", "#", '#', "ingotCopper"));
	    GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(copperChunk, 3), new ItemStack(grindstone, 1, -1), "ingotCopper"));
	    GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(bronzeRod, 4), "#", "#", '#', "ingotBronze"));
	    GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(bronzeChunk, 3), new ItemStack(grindstone, 1, -1), "ingotBronze"));
	    GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(workedIronRod, 4), "#", "#", '#', "ingotRefinedIron"));
	    GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(workedIronChunk, 3), new ItemStack(grindstone, 1, -1), "ingotRefinedIron"));
	    GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(steelRod, 4), "#", "#", '#', "ingotSteel"));
	    GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(steelChunk, 3), new ItemStack(grindstone, 1, -1), "ingotSteel"));
	    GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(cobaltRod, 4), "#", "#", '#', "ingotCobalt"));
	    GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(cobaltChunk, 3), new ItemStack(grindstone, 1, -1), "ingotCobalt"));
	    GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(arditeRod, 4), "#", "#", '#', "ingotArdite"));
	    GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(arditeChunk, 3), new ItemStack(grindstone, 1, -1), "ingotArdite"));
	    GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(manyullynRod, 4), "#", "#", '#', "ingotManyullyn"));
	    GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(manyullynChunk, 3), new ItemStack(grindstone, 1, -1), "ingotManyullyn"));
	    GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(uraniumRod, 4), "#", "#", '#', "ingotUranium"));
	    GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(uraniumChunk, 3), new ItemStack(grindstone, 1, -1), "ingotUranium"));
    }
	
	/*
    public boolean onTickInGame(float tick, Minecraft mc)
    {
    	if(rand.nextInt(100) == 0) {
    		EntityPlayer player = mc.thePlayer;
    		InventoryPlayer inv = player.inventory;
    		for(int i = 0; i < inv.mainInventory.length; i++) {    			
		    	if(inv.mainInventory[i] != null) {
		    		ItemStack is = inv.mainInventory[i];
		    		Item item = is.getItem();
		    		if(item instanceof InfiToolCore) {
			    		InfiToolCore tool = (InfiToolCore)item;
			    		if(is.getItemDamage() > 0) {
			    			int heal = 0;
			    			if(tool.getHeadType() == 10)
			    				heal += 4;
			    			if(tool.getHandleType() == 10)
			    				heal += 1;
			    			if(heal > 0 && rand.nextInt(5) < heal)
			    				is.damageItem(-1, player);
			    		}
			    		int poison = 0;
			    		if(tool.getHeadType() == 26)
			    		{
			    			poison += 20;
			    		}
			    		if(tool.getHandleType() == 26)
			    		{
			    			poison += 5;
			    		}
			    		if (poison > 0 && rand.nextInt(4) == 0)
			    		{
			    			player.addPotionEffect(new PotionEffect(Potion.poison.id, poison, 0));
			    		}
		    		}
		    		if(item instanceof InfiWeaponCore) {
			    		InfiWeaponCore weapon = (InfiWeaponCore)item;
			    		if(is.getItemDamage() > 0) {
			    			int heal = 0;
			    			if(weapon.getHeadType() == 10)
			    				heal += 4;
			    			if(weapon.getHandleType() == 10)
			    				heal += 1;
			    			if(heal > 0 && rand.nextInt(5) < heal)
			    				is.damageItem(-1, player);
			    		}
			    		int poison = 0;
			    		if(weapon.getHeadType() == 26)
			    		{
			    			poison += 20;
			    		}
			    		if(weapon.getHandleType() == 26)
			    		{
			    			poison += 5;
			    		}
			    		if (poison > 0 && rand.nextInt(4) == 0)
			    		{
			    			player.addPotionEffect(new PotionEffect(Potion.poison.id, poison, 0));
			    		}
		    		}
		    		if(item instanceof InfiHoeCore) {
		    			InfiHoeCore hoe = (InfiHoeCore)item;
			    		if(is.getItemDamage() > 0) {
			    			int heal = 0;
			    			if(hoe.getHeadType() == 10)
			    				heal += 4;
			    			if(hoe.getHandleType() == 10)
			    				heal += 1;
			    			if(heal > 0 && rand.nextInt(5) < heal)
			    				is.damageItem(-1, player);
			    		}
			    		int poison = 0;
			    		if(hoe.getHeadType() == 26)
			    		{
			    			poison += 20;
			    		}
			    		if(hoe.getHandleType() == 26)
			    		{
			    			poison += 5;
			    		}
			    		if (poison > 0 && rand.nextInt(4) == 0)
			    		{
			    			player.addPotionEffect(new PotionEffect(Potion.poison.id, poison, 0));
			    		}
		    		}
		    	}
    		}
    	}
    	return true;
    }
	*/
	
	/*
	public void addOrizonSupport()
    {
        try
        {
            Class class1 = Class.forName("mod_Mechvent");
            mod_Mechvent.addCrushingRecipe(new ItemStack(stoneShard, 3), new Object[] 
                    { Block.cobblestone });
    		mod_Mechvent.addCrushingRecipe(new ItemStack(ironChunk, 3), new Object[] 
                    { Item.ingotIron });
    		mod_Mechvent.addCrushingRecipe(new ItemStack(diamondShard, 3), new Object[] 
                    { Item.diamond });
    		mod_Mechvent.addCrushingRecipe(new ItemStack(redstoneFragment, 3), new Object[] 
                    { this.redstoneCrystal });
    		mod_Mechvent.addCrushingRecipe(new ItemStack(obsidianShard, 3), new Object[] 
                    { Block.obsidian });
    		mod_Mechvent.addCrushingRecipe(new ItemStack(sandstoneShard, 3), new Object[] 
                    { Block.sandStone });
    		mod_Mechvent.addCrushingRecipe(new ItemStack(netherrackShard, 3), new Object[] 
                    { Block.netherrack });
    		mod_Mechvent.addCrushingRecipe(new ItemStack(glowstoneFragment, 3), new Object[] 
                    { this.glowstoneCrystal });
    		mod_Mechvent.addCrushingRecipe(new ItemStack(iceShard, 3), new Object[] 
                    { Block.ice });
    		mod_Mechvent.addCrushingRecipe(new ItemStack(lavaFragment, 3), new Object[] 
                    { this.lavaCrystal });
    		mod_Mechvent.addCrushingRecipe(new ItemStack(slimeFragment, 3), new Object[] 
                    { this.slimeCrystal });
    		mod_Mechvent.addCrushingRecipe(new ItemStack(cactusShard, 3), new Object[] 
                    { Block.cactus });
    		mod_Mechvent.addCrushingRecipe(new ItemStack(flintShard, 3), new Object[] 
                    { Item.flint });
    		mod_Mechvent.addCrushingRecipe(new ItemStack(Item.flint, 1), new Object[] 
                    { Block.gravel });
        }
        catch (Throwable throwable)
        {
        }
    }
    */
	
	private void setupCraftHook()
    {
		System.out.println("setting up crafting handler");
        ICraftingHandler icraftinghandler = new ICraftingHandler()
        {
            public void onCrafting(EntityPlayer entityplayer, ItemStack itemstack, IInventory iinventory)
            {
            	System.out.println("item crafted");
            	if (itemstack.getItem() instanceof InfiToolCore && ((InfiToolCore)itemstack.getItem()).getHeadType() == 9)
            	{
            		itemstack.addEnchantment(Enchantment.silkTouch, 1);
            	}
            	
                for (int i = 0; i < iinventory.getSizeInventory(); i++)
                {
                    ItemStack itemstack1 = iinventory.getStackInSlot(i);
                    if (itemstack1 != null && itemstack1.itemID == grindstone.shiftedIndex)
                    {
                    	System.out.println("used grindstone");
                    	itemstack1.stackSize++;
                        System.out.println("damage now " + itemstack1.getItemDamage());
                        if (itemstack1.stackSize != 1)
                        {
                            continue;
                        }
                        /*Integer integer = (Integer)DetailManager.damageContainer.get(Integer.valueOf(itemstack1.itemID));
                        if (integer != null)
                        {
                            iinventory.setInventorySlotContents(i, new ItemStack(integer.intValue(), 1, 0));
                        }*/
                    }                    
                }
            }

			@Override
			public void onSmelting(EntityPlayer player, ItemStack item) {}
        };
        
        GameRegistry.registerCraftingHandler(icraftinghandler);
    }

	public static Block blockMoss;
	public static Block slimeSand;
	public static Item treeRoot;
	public static Item grindstone;
    
	public static Item paperStack;
    public static Item paperDust;
    public static Item ironChunk;
    
    public static Item mossBall;
    public static Item mossyPatch;
    public static Item mossyStone;
    
    public static Item redstoneCrystal;
    public static Item glowstoneCrystal;
    public static Item lavaCrystal;
    public static Item slimeCrystal;
    public static Item obsidianCrystal;
    public static Item blazeCrystal;
    
    public static Item woodSplinters;
    public static Item stoneShard;
    public static Item diamondShard;
    public static Item redstoneFragment;
    public static Item obsidianShard;
    public static Item sandstoneShard;
    public static Item netherrackShard;
    public static Item glowstoneFragment;
    public static Item iceShard;
    public static Item lavaFragment;
    public static Item slimeFragment;
    public static Item cactusShard;
    public static Item glassShard;
    public static Item coalBit;
    public static Item flintShard;
    public static Item blazeFragment;
    
    public static Item copperChunk;
	public static Item bronzeChunk;
	public static Item workedIronChunk;
	public static Item steelChunk;
	public static Item cobaltChunk;
	public static Item arditeChunk;
	public static Item manyullynChunk;
	public static Item uraniumChunk;
    
    public static Item stoneRod;
    public static Item ironRod;
    public static Item diamondRod;

    public static Item redstoneRod;
    public static Item obsidianRod;
    public static Item sandstoneRod;
    public static Item boneRod;
    public static Item paperRod;
    public static Item mossyRod;
    public static Item netherrackRod;
    public static Item glowstoneRod;
    public static Item iceRod;
    public static Item lavaRod;
    public static Item slimeRod;
    public static Item cactusRod;
    public static Item flintRod;
    
    public static Item copperRod;
	public static Item bronzeRod;
	public static Item workedIronRod;
	public static Item steelRod;
	public static Item cobaltRod;
	public static Item arditeRod;
	public static Item manyullynRod;
	public static Item uraniumRod;
    
    @PreInit
    public void preInit(FMLPreInitializationEvent event)
    { //Icons not set yet
    	PropsHelperInfiBase.initProps();
    	
    	blockMoss = new MossBlock(PropsHelperInfiBase.mossBlockID, 0);
    	slimeSand = new SlimeSandBlock(PropsHelperInfiBase.slimeSandID, 240);
    	treeRoot = new InfiTexturedItem(PropsHelperInfiBase.treeRootID,
    			"/infibase/items.png", "Tree Root").setIconCoord(3, 4);
    	
    	grindstone = new Grindstone(PropsHelperInfiBase.grindstoneID,
    			"/infibase/items.png", "Grindstone").setIconCoord(0, 9);
    	
        paperStack = new InfiTexturedItem(PropsHelperInfiBase.paperStackID, 
        		"/infibase/items.png", "Stack of Paper").setIconCoord(0, 4);
        paperDust = new InfiTexturedItem(PropsHelperInfiBase.paperDustID, 
        		"/infibase/items.png", "Dust-filled Paper").setIconCoord(1, 4);
        
        mossBall = new InfiTexturedItem(PropsHelperInfiBase.mossBallID, 
        		"/infibase/items.png", "Ball of Moss").setIconCoord(2, 4);
        mossyPatch = new MossPatchItem(PropsHelperInfiBase.mossyPatchID).setIconCoord(9, 6);
        mossyStone = new InfiTexturedItem(PropsHelperInfiBase.mossyStoneID, 
        		"/infibase/items.png", "Moss-infused Stone").setIconCoord(5, 3);
        
        redstoneCrystal = new InfiTexturedItem(PropsHelperInfiBase.redstoneCrystalID, 
        		"/infibase/items.png", "Redstone Crystal").setIconCoord(0, 3);
        glowstoneCrystal = new InfiTexturedItem(PropsHelperInfiBase.glowstoneCrystalID, 
        		"/infibase/items.png", "Glowstone Crystal").setIconCoord(1, 3);
        obsidianCrystal = new InfiTexturedItem(PropsHelperInfiBase.obsidianCrystalID, 
        		"/infibase/items.png", "Ebony Obelisk").setIconCoord(4, 3);
        lavaCrystal = new InfiTexturedItem(PropsHelperInfiBase.lavaCrystalID, 
        		"/infibase/items.png", "Lava Crystal").setIconCoord(2, 3);
        slimeCrystal = new InfiTexturedItem(PropsHelperInfiBase.slimeCrystalID, 
        		"/infibase/items.png", "Slime Crystal").setIconCoord(3, 3);
        blazeCrystal = new InfiTexturedItem(PropsHelperInfiBase.blazeCrystalID, 
        		"/infibase/items.png", "Frozen Blaze Essence").setIconCoord(6, 3);
        
        woodSplinters = new InfiTexturedItem(PropsHelperInfiBase.woodSplintersID, 
        		"/infibase/items.png", "Wood Splinters").setIconCoord(0, 6);
        stoneShard = new InfiTexturedItem(PropsHelperInfiBase.stoneShardID, 
        		"/infibase/items.png", "Stone Shard").setIconCoord(1, 6);
        ironChunk = new InfiTexturedItem(PropsHelperInfiBase.ironChunkID, 
        		"/infibase/items.png", "Chunk of Iron").setIconCoord(2, 6);
        diamondShard = new InfiTexturedItem(PropsHelperInfiBase.diamondShardID, 
        		"/infibase/items.png", "Sliver of Diamond").setIconCoord(3, 6);

        redstoneFragment = new InfiTexturedItem(PropsHelperInfiBase.redstoneFragmentID, 
        		"/infibase/items.png", "Redstone Crystal Fragment").setIconCoord(4, 6);
        obsidianShard = new InfiTexturedItem(PropsHelperInfiBase.obsidianShardID, 
        		"/infibase/items.png", "Obsidian Shard").setIconCoord(5, 6);
        sandstoneShard = new InfiTexturedItem(PropsHelperInfiBase.sandstoneShardID, 
        		"/infibase/items.png", "Sandstone Shard").setIconCoord(6, 6);
        netherrackShard = new InfiTexturedItem(PropsHelperInfiBase.netherrackShardID, 
        		"/infibase/items.png", "Netherrack Shard").setIconCoord(10, 6);
        glowstoneFragment = new InfiTexturedItem(PropsHelperInfiBase.glowstoneFragmentID, 
        		"/infibase/items.png", "Glowstone Crystal Fragment").setIconCoord(11, 6);
        iceShard = new InfiTexturedItem(PropsHelperInfiBase.iceShardID, 
        		"/infibase/items.png", "Shard of Ice").setIconCoord(12, 6);
        lavaFragment = new InfiTexturedItem(PropsHelperInfiBase.lavaFragmentID, 
        		"/infibase/items.png", "Lava Crystal Fragment").setIconCoord(13, 6);
        slimeFragment = new InfiTexturedItem(PropsHelperInfiBase.slimeFragmentID, 
        		"/infibase/items.png", "Slime Crystal Fragment").setIconCoord(14, 6);
        cactusShard = new InfiTexturedItem(PropsHelperInfiBase.cactusShardID, 
        		"/infibase/items.png", "Cactus Spine").setIconCoord(15, 6);
        flintShard = new InfiTexturedItem(PropsHelperInfiBase.flintShardID, 
        		"/infibase/items.png", "Piece of Flint").setIconCoord(0, 7);
        blazeFragment = new InfiTexturedItem(PropsHelperInfiBase.blazeFragmentID,
        		"/infibase/items.png", "Fragmented Blaze Essence").setIconCoord(1, 7);
        
        copperChunk = new InfiTexturedItem(PropsHelperInfiBase.copperChunkID,
        		"/infibase/items.png", "Copper Chunk").setIconCoord(2, 7);
        bronzeChunk = new InfiTexturedItem(PropsHelperInfiBase.bronzeChunkID,
        		"/infibase/items.png", "Bronze Chunk").setIconCoord(3, 7);
        workedIronChunk = new InfiTexturedItem(PropsHelperInfiBase.workedIronChunkID,
        		"/infibase/items.png", "Worked Iron Chunk").setIconCoord(4, 7);
        steelChunk = new InfiTexturedItem(PropsHelperInfiBase.steelChunkID,
        		"/infibase/items.png", "Steel Chunk").setIconCoord(5, 7);
        cobaltChunk = new InfiTexturedItem(PropsHelperInfiBase.cobaltChunkID,
        		"/infibase/items.png", "Cobalt Chunk").setIconCoord(6, 7);
        arditeChunk = new InfiTexturedItem(PropsHelperInfiBase.arditeChunkID,
        		"/infibase/items.png", "Ardite Chunk").setIconCoord(7, 7);
        manyullynChunk = new InfiTexturedItem(PropsHelperInfiBase.manyullynChunkID,
        		"/infibase/items.png", "Manyullyn Chunk").setIconCoord(8, 7);
        uraniumChunk = new InfiTexturedItem(PropsHelperInfiBase.uraniumChunkID,
        		"/infibase/items.png", "Uranium Chunk").setIconCoord(9, 7);
        
        glassShard = new InfiTexturedItem(PropsHelperInfiBase.glassShardID, 
        		"/infibase/items.png", "Shard of Glass").setIconCoord(0, 8);
        coalBit = new InfiTexturedItem(PropsHelperInfiBase.coalBitID, 
        		"/infibase/items.png", "Tiny Piece of Coal").setIconCoord(1, 8);
    	
        stoneRod = new InfiTexturedItem(PropsHelperInfiBase.stoneRodID, 
        		"/infibase/items.png", "Stone Rod").setIconCoord(1, 0);
        ironRod = new InfiTexturedItem(PropsHelperInfiBase.ironRodID, 
        		"/infibase/items.png", "Iron Rod").setIconCoord(2, 0);
        diamondRod = new InfiTexturedItem(PropsHelperInfiBase.diamondRodID, 
        		"/infibase/items.png", "Diamond Rod").setIconCoord(3, 0);

        redstoneRod = new InfiTexturedItem(PropsHelperInfiBase.redstoneRodID, 
        		"/infibase/items.png", "Redstone Rod").setIconCoord(4, 0);
        obsidianRod = new InfiTexturedItem(PropsHelperInfiBase.obsidianRodID, 
        		"/infibase/items.png", "Obsidian Rod").setIconCoord(5, 0);
        sandstoneRod = new InfiTexturedItem(PropsHelperInfiBase.sandstoneRodID, 
        		"/infibase/items.png", "Sandstone Rod").setIconCoord(6, 0);
        boneRod = new InfiTexturedItem(PropsHelperInfiBase.boneRodID, 
        		"/infibase/items.png", "Bone Rod").setIconCoord(7, 0);
        paperRod = new InfiTexturedItem(PropsHelperInfiBase.paperRodID, 
        		"/infibase/items.png", "Paper Rod").setIconCoord(8, 0);
        mossyRod = new InfiTexturedItem(PropsHelperInfiBase.mossyRodID, 
        		"/infibase/items.png", "Mossy Rod").setIconCoord(9, 0);
        netherrackRod = new InfiTexturedItem(PropsHelperInfiBase.netherrackRodID, 
        		"/infibase/items.png", "Netherrack Rod").setIconCoord(10, 0);
        glowstoneRod = new InfiTexturedItem(PropsHelperInfiBase.glowstoneRodID, 
        		"/infibase/items.png", "Glowstone Rod").setIconCoord(11, 0);
        iceRod = new InfiTexturedItem(PropsHelperInfiBase.iceRodID, 
        		"/infibase/items.png", "Ice Rod").setIconCoord(12, 0);
        lavaRod = new InfiTexturedItem(PropsHelperInfiBase.lavaRodID, 
        		"/infibase/items.png", "Lava Rod").setIconCoord(13, 0);
        slimeRod = new InfiTexturedItem(PropsHelperInfiBase.slimeRodID, 
        		"/infibase/items.png", "Slime Rod").setIconCoord(14, 0);
        cactusRod = new InfiTexturedItem(PropsHelperInfiBase.cactusRodID, 
        		"/infibase/items.png", "Cactus Rod").setIconCoord(15, 0);
        flintRod = new InfiTexturedItem(PropsHelperInfiBase.flintRodID, 
        		"/infibase/items.png", "Flint Rod").setIconCoord(0, 1);
        
        copperRod = new InfiTexturedItem(PropsHelperInfiBase.copperRodID, 
        		"/infibase/items.png", "Copper Rod").setIconCoord(2, 1);
		bronzeRod = new InfiTexturedItem(PropsHelperInfiBase.bronzeRodID, 
				"/infibase/items.png", "Bronze Rod").setIconCoord(3, 1);
		workedIronRod = new InfiTexturedItem(PropsHelperInfiBase.workedIronRodID, 
				"/infibase/items.png", "Worked Iron Rod").setIconCoord(4, 1);
		steelRod = new InfiTexturedItem(PropsHelperInfiBase.steelRodID, 
				"/infibase/items.png", "Steel Rod").setIconCoord(5, 1);
		cobaltRod = new InfiTexturedItem(PropsHelperInfiBase.cobaltRodID, 
				"/infibase/items.png", "Cobalt Rod").setIconCoord(6, 1);
		arditeRod = new InfiTexturedItem(PropsHelperInfiBase.arditeRodID, 
				"/infibase/items.png", "Ardite Rod").setIconCoord(7, 1);
		manyullynRod = new InfiTexturedItem(PropsHelperInfiBase.manyullynRodID, 
				"/infibase/items.png", "Manyullyn Rod").setIconCoord(8, 1);
		uraniumRod = new InfiTexturedItem(PropsHelperInfiBase.uraniumRodID, 
				"/infibase/items.png", "Uranium Rod").setIconCoord(9, 1);
    }
}
