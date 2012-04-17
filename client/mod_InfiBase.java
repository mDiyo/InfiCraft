package net.minecraft.src;

import net.minecraft.client.Minecraft;
import net.minecraft.src.infibase.*;
import net.minecraft.src.forge.*;
import java.util.*;

    /* Notes
     * 
     * Each shard is worth 1/3 of its respective material. 
     * 2 shards can make 2 rods, while 2 material makes 4 rods.
     * Freezing enchants and abilities require base edits
     * Poison enchants have a chance to wear off when hitting mobs
     */

public class mod_InfiBase extends BaseMod
{
	Random rand = new Random();
	InfiEnchantFreezing freeze = new InfiEnchantFreezing(42, 2);
	
	public mod_InfiBase()
	{
		ModLoader.setInGameHook(this, true, true);
		ModLoader.registerBlock(blockMoss);
		ModLoader.registerBlock(slimeSand);
		ModLoader.addLocalization("enchantment.frost", "Frost");
		this.addBaseRecipes();
		this.addMaterialRecipes();
		this.oreDictionarySupport();
		this.addEEsupport();
	}
	
	public void addCustomName(ItemStack stack, Enchantment par1Enchantment, String name)
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
		FurnaceRecipes.smelting().addSmelting(slimeSand.blockID, new ItemStack(slimeCrystal, 1));
		ModLoader.addRecipe(new ItemStack(blazeCrystal, 1), new Object[]
                { "pwp", "ncn", "plp", 'p', Item.blazePowder, 'w', new ItemStack(Item.bucketWater, 1, -1), 
			'l', new ItemStack(Item.bucketLava, 1, -1), 'c', Item.magmaCream, 'n', Block.netherrack  });
		ModLoader.addRecipe(new ItemStack(blazeCrystal, 1), new Object[]
                { "plp", "ncn", "pwp", 'p', Item.blazePowder, 'w', new ItemStack(Item.bucketWater, 1, -1), 
			'l', new ItemStack(Item.bucketLava, 1, -1), 'c', Item.magmaCream, 'n', Block.netherrack  });
		ModLoader.addRecipe(new ItemStack(blazeCrystal, 1), new Object[]
                { "pnp", "lcw", "pnp", 'p', Item.blazePowder, 'w', new ItemStack(Item.bucketWater, 1, -1), 
			'l', new ItemStack(Item.bucketLava, 1, -1), 'c', Item.magmaCream, 'n', Block.netherrack  });
		
		//Chainmail
		ModLoader.addRecipe(new ItemStack(Item.helmetChain, 1), new Object[] {"###", "# #", '#', this.ironChunk});
		ModLoader.addRecipe(new ItemStack(Item.plateChain, 1), new Object[] {"# #", "###", "###", '#', this.ironChunk});
		ModLoader.addRecipe(new ItemStack(Item.legsChain, 1), new Object[] {"###", "# #", "# #", '#', this.ironChunk});
		ModLoader.addRecipe(new ItemStack(Item.bootsChain, 1), new Object[] {"# #", "# #", '#', this.ironChunk});
		
		//Brewing stand
		ModLoader.addRecipe(new ItemStack(Item.brewingStand, 1), new Object[]
		        { "##", "##", '#', Item.paper });
		      
		//Cactus greens to charcoal
	    FurnaceRecipes.smelting().addSmelting(Item.dyePowder.shiftedIndex, 2, new ItemStack(Item.coal, 1, 1));
	    
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
                {
                    " m ", "msm", " m ", 'm', mossyPatch, 's', Block.stone
                });
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
	       	MinecraftForge.registerOre(stickNames[stickIter], new ItemStack(materialArray[stickIter]));
		}
	    
        MinecraftForge.registerOreHandler(new IOreHandler()
        {
            public void registerOre(String ore, ItemStack itemstack)
            {
                if(ore.equals("customCobblestone") || ore.equals("customStone"))
                {
                	ModLoader.addRecipe(new ItemStack(stoneRod, 4), new Object[] 
                            { "#", "#", '#', itemstack });
                }
                if(ore.equals("ingotCopper"))
                {
                	ModLoader.addRecipe(new ItemStack(copperRod, 4), new Object[] 
                            { "#", "#", '#', itemstack });
                }
                if(ore.equals("ingotBronze"))
                {
                	ModLoader.addRecipe(new ItemStack(bronzeRod, 4), new Object[] 
                            { "#", "#", '#', itemstack });
                }
                if(ore.equals("ingotRefinedIron"))
                {
                	ModLoader.addRecipe(new ItemStack(workedIronRod, 4), new Object[] 
                            { "#", "#", '#', itemstack });
                }
                if(ore.equals("ingotSteel"))
                {
                	ModLoader.addRecipe(new ItemStack(steelRod, 4), new Object[] 
                            { "#", "#", '#', itemstack });
                }
                if(ore.equals("ingotCobalt"))
                {
                	ModLoader.addRecipe(new ItemStack(cobaltRod, 4), new Object[] 
                            { "#", "#", '#', itemstack });
                }
                if(ore.equals("ingotArdite"))
                {
                	ModLoader.addRecipe(new ItemStack(arditeRod, 4), new Object[] 
                            { "#", "#", '#', itemstack });
                }
                if(ore.equals("ingotManyullyn"))
                {
                	ModLoader.addRecipe(new ItemStack(manyullynRod, 4), new Object[] 
                            { "#", "#", '#', itemstack });
                }
                if(ore.equals("ingotUranium"))
                {
                	ModLoader.addRecipe(new ItemStack(uraniumRod, 4), new Object[] 
                            { "#", "#", '#', itemstack });
                }
            }
        } );
    }
	
	@Override
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
			    			if(tool.getHeadType() == 11)
			    				heal += 4;
			    			if(tool.getHandleType() == 11)
			    				heal += 1;
			    			if(heal > 0 && rand.nextInt(5) < heal)
			    				is.damageItem(-1, player);
			    		}
			    		if(tool.getHeadType() == 11 && is.getItemDamage() > 0) {
			    			is.damageItem(-1, player);
			    		}
		    		}
		    		if(item instanceof InfiWeaponCore) {
			    		InfiWeaponCore weapon = (InfiWeaponCore)item;
			    		if(is.getItemDamage() > 0) {
			    			int heal = 0;
			    			if(weapon.getHeadType() == 11)
			    				heal += 4;
			    			if(weapon.getHandleType() == 11)
			    				heal += 1;
			    			if(heal > 0 && rand.nextInt(5) < heal)
			    				is.damageItem(-1, player);
			    		}
			    		if(weapon.getHeadType() == 11 && is.getItemDamage() > 0) {
			    			is.damageItem(-1, player);
			    		}
		    		}
		    		if(item instanceof InfiHoeCore) {
		    			InfiHoeCore weapon = (InfiHoeCore)item;
			    		if(is.getItemDamage() > 0) {
			    			int heal = 0;
			    			if(weapon.getHeadType() == 11)
			    				heal += 4;
			    			if(weapon.getHandleType() == 11)
			    				heal += 1;
			    			if(heal > 0 && rand.nextInt(5) < heal)
			    				is.damageItem(-1, player);
			    		}
			    		if(weapon.getHeadType() == 11 && is.getItemDamage() > 0) {
			    			is.damageItem(-1, player);
			    		}
		    		}
		    	}
    		}
    	}
    	return true;
    }
	
	@Override
    public void takenFromCrafting(EntityPlayer player, ItemStack stack, IInventory iinventory) 
    {
    	if (stack.getItem() instanceof InfiToolCore && ((InfiToolCore)stack.getItem()).getHeadType() == 10)
    	{
    		stack.addEnchantment(Enchantment.silkTouch, 1);
    	}
    }
	
	@Override
	public int addFuel(int i, int j)
    {
        if (i == Block.cactus.blockID)
        {
            return 100;
        }
        if(i == coalBit.shiftedIndex)
        {
        	return 600;
        }
        return 0;
    }
	
	public void addEEsupport()
    {
        try
        {
            Class class1 = Class.forName("mod_EE");
            Class class2 = Class.forName("EEProxy");
            System.out.println("Equivalent Exchange integration for InfiTools activated");
            EEProxy.setEMC(redstoneCrystal.shiftedIndex, 405);
            EEProxy.setEMC(glowstoneCrystal.shiftedIndex, 3754);
            EEProxy.setEMC(lavaCrystal.shiftedIndex, 3104);
            EEProxy.setEMC(slimeCrystal.shiftedIndex, 88);
            EEProxy.setEMC(blazeCrystal.shiftedIndex, 3930);
            EEProxy.setEMC(paperDust.shiftedIndex, 928);
            EEProxy.setEMC(obsidianCrystal.shiftedIndex, 2848);
            EEProxy.setEMC(mossyPatch.shiftedIndex, 145);
            EEProxy.setEMC(mossyStone.shiftedIndex, 581);
            System.out.println("EMC values set!");
        }
        catch (Throwable throwable)
        {
            System.out.println("Equivalent Exchange integration failed! Reason:");
            System.out.println(throwable);
        }
    }

	@Override
	public String getVersion() 
	{
		return "1.2.5";
	}

	@Override
	public void load() {}
	
	public static Block blockMoss;
	public static Block slimeSand;
	public static Item treeRoot;
    
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
    
    static
    { //Icons not set yet
    	PropsHelperInfiBase.initProps();
    	
    	blockMoss = new MossBlock(PropsHelperInfiBase.mossBlockID, 0);
    	slimeSand = new SlimeSandBlock(PropsHelperInfiBase.slimeSandID, 240);
    	treeRoot = new InfiTexturedItem(PropsHelperInfiBase.treeRootID, 
    			"/infibase/items.png", "Tree Root").setIconCoord(3, 4);
    	
        paperStack = new InfiTexturedItem(PropsHelperInfiBase.paperStackID, 
        		"/infibase/items.png", "Stack of Paper").setIconCoord(4, 0);
        paperDust = new InfiTexturedItem(PropsHelperInfiBase.paperDustID, 
        		"/infibase/items.png", "Dust-filled Paper").setIconCoord(4, 1);
        
        mossBall = new InfiTexturedItem(PropsHelperInfiBase.mossBallID, 
        		"/infibase/items.png", "Ball of Moss").setIconCoord(4, 2);
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
        		"/gui/items.png", "Frozen Blaze Essence").setIconCoord(6, 3);
        
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
        		"/metaltex/rods.png", "Copper Rod").setIconCoord(2, 1);
		bronzeRod = new InfiTexturedItem(PropsHelperInfiBase.bronzeRodID, 
				"/metaltex/rods.png", "Bronze Rod").setIconCoord(3, 1);
		workedIronRod = new InfiTexturedItem(PropsHelperInfiBase.workedIronRodID, 
				"/metaltex/rods.png", "Worked Iron Rod").setIconCoord(4, 1);
		steelRod = new InfiTexturedItem(PropsHelperInfiBase.steelRodID, 
				"/metaltex/rods.png", "Steel Rod").setIconCoord(5, 1);
		cobaltRod = new InfiTexturedItem(PropsHelperInfiBase.cobaltRodID, 
				"/metaltex/rods.png", "Cobalt Rod").setIconCoord(6, 1);
		arditeRod = new InfiTexturedItem(PropsHelperInfiBase.arditeRodID, 
				"/metaltex/rods.png", "Ardite Rod").setIconCoord(7, 1);
		manyullynRod = new InfiTexturedItem(PropsHelperInfiBase.manyullynRodID, 
				"/metaltex/rods.png", "Manyullyn Rod").setIconCoord(8, 1);
		uraniumRod = new InfiTexturedItem(PropsHelperInfiBase.uraniumRodID, 
				"/metaltex/rods.png", "Uranium Rod").setIconCoord(9, 1);
    }

}
