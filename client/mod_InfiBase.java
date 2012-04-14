package net.minecraft.src;

import net.minecraft.client.Minecraft;
import net.minecraft.src.infibase.*;
import net.minecraft.src.metals.PropsHelperInfiMetals;

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
		ModLoader.addLocalization("enchantment.frost", "Frost");
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
	
	public static void addEEsupport()
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
    public static Item glassShard;
    public static Item coalBit;
    public static Item flintShard;
    public static Item miniBrick;
    public static Item blazeFragment;
    
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
    public static Item brickRod;
    
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
    	blockMoss = new MossBlock(PropsHelperInfiBase.mossBlockID, 0);
    	
        paperStack = new InfiTexturedItem(PropsHelperInfiBase.paperStackID, 
        		"/infibase/items.png", "Stack of Paper").setIconCoord(0, 0);
        paperDust = new InfiTexturedItem(PropsHelperInfiBase.paperDustID, 
        		"/infibase/items.png", "Dust-filled Paper").setIconCoord(0, 0);
        
        mossBall = new InfiTexturedItem(PropsHelperInfiBase.mossBallID, 
        		"/infibase/items.png", "Ball of Moss").setIconCoord(4, 1);
        mossyPatch = new MossPatchItem(PropsHelperInfiBase.mossyPatchID).setIconCoord(4, 2);
        mossyStone = new InfiTexturedItem(PropsHelperInfiBase.mossyStoneID, 
        		"/infibase/items.png", "Moss-infused Stone").setIconCoord(6, 2);
        
        redstoneCrystal = new InfiTexturedItem(PropsHelperInfiBase.redstoneCrystalID, 
        		"/infibase/items.png", "Redstone Crystal").setIconCoord(0, 2);
        glowstoneCrystal = new InfiTexturedItem(PropsHelperInfiBase.glowstoneCrystalID, 
        		"/infibase/items.png", "Glowstone Crystal").setIconCoord(1, 2);
        obsidianCrystal = new InfiTexturedItem(PropsHelperInfiBase.obsidianCrystalID, 
        		"/infibase/items.png", "Ebony Obelisk").setIconCoord(5, 2);
        lavaCrystal = new InfiTexturedItem(PropsHelperInfiBase.lavaCrystalID, 
        		"/infibase/items.png", "Lava Crystal").setIconCoord(2, 2);
        slimeCrystal = new InfiTexturedItem(PropsHelperInfiBase.slimeCrystalID, 
        		"/infibase/items.png", "Slime Crystal").setIconCoord(3, 2);
        blazeCrystal = new InfiTexturedItem(PropsHelperInfiBase.blazeCrystalID, 
        		"/gui/items.png", "Frozen Blaze Essence").setIconCoord(14, 2);
        
        woodSplinters = new InfiTexturedItem(PropsHelperInfiBase.woodSplintersID, 
        		"/infibase/items.png", "Wood Splinters").setIconCoord(0, 5);
        stoneShard = new InfiTexturedItem(PropsHelperInfiBase.stoneShardID, 
        		"/infibase/items.png", "Stone Shard").setIconCoord(1, 5);
        ironChunk = new InfiTexturedItem(PropsHelperInfiBase.ironChunkID, 
        		"/infibase/items.png", "Chunk of Iron").setIconCoord(2, 1);
        diamondShard = new InfiTexturedItem(PropsHelperInfiBase.diamondShardID, 
        		"/infibase/items.png", "Sliver of Diamond").setIconCoord(2, 5);

        redstoneFragment = new InfiTexturedItem(PropsHelperInfiBase.redstoneFragmentID, 
        		"/infibase/items.png", "Redstone Crystal Fragment").setIconCoord(3, 5);
        obsidianShard = new InfiTexturedItem(PropsHelperInfiBase.obsidianShardID, 
        		"/infibase/items.png", "Obsidian Shard").setIconCoord(4, 5);
        sandstoneShard = new InfiTexturedItem(PropsHelperInfiBase.sandstoneShardID, 
        		"/infibase/items.png", "Sandstone Shard").setIconCoord(5, 5);
        netherrackShard = new InfiTexturedItem(PropsHelperInfiBase.netherrackShardID, 
        		"/infibase/items.png", "Netherrack Shard").setIconCoord(6, 5);
        glowstoneFragment = new InfiTexturedItem(PropsHelperInfiBase.glowstoneFragmentID, 
        		"/infibase/items.png", "Glowstone Crystal Fragment").setIconCoord(7, 5);
        iceShard = new InfiTexturedItem(PropsHelperInfiBase.iceShardID, 
        		"/infibase/items.png", "Shard of Ice").setIconCoord(8, 5);
        lavaFragment = new InfiTexturedItem(PropsHelperInfiBase.lavaFragmentID, 
        		"/infibase/items.png", "Lava Crystal Fragment").setIconCoord(9, 5);
        slimeFragment = new InfiTexturedItem(PropsHelperInfiBase.slimeFragmentID, 
        		"/infibase/items.png", "Slime Crystal Fragment").setIconCoord(10, 5);
        flintShard = new InfiTexturedItem(PropsHelperInfiBase.flintShardID, 
        		"/infibase/items.png", "Piece of Flint").setIconCoord(14, 5);
        miniBrick = new InfiTexturedItem(PropsHelperInfiBase.miniBrickID, 
        		"/infibase/items.png", "Miniature Brick").setIconCoord(15, 5);
        blazeFragment = new InfiTexturedItem(PropsHelperInfiBase.blazeFragmentID,
        		"/infibase/items.png", "Fragmented Blaze Essence").setIconCoord(0, 6);
        
        glassShard = new InfiTexturedItem(PropsHelperInfiBase.glassShardID, 
        		"/infibase/items.png", "Shard of Glass").setIconCoord(11, 5);
        coalBit = new InfiTexturedItem(PropsHelperInfiBase.coalBitID, 
        		"/infibase/items.png", "Tiny Piece of Coal").setIconCoord(12, 5);
    	
        stoneRod = new InfiTexturedItem(PropsHelperInfiBase.stoneRodID, 
        		"/infibase/items.png", "Stone Rod").setIconCoord(1, 0);
        ironRod = new InfiTexturedItem(PropsHelperInfiBase.ironRodID, 
        		"/infibase/items.png", "Iron Rod").setIconCoord(2, 0);
        diamondRod = new InfiTexturedItem(PropsHelperInfiBase.diamondRodID, 
        		"/infibase/items.png", "Diamond Rod").setIconCoord(3, 0);

        redstoneRod = new InfiTexturedItem(PropsHelperInfiBase.redstoneRodID, 
        		"/infibase/items.png", "Redstone Rod").setIconCoord(5, 0);
        obsidianRod = new InfiTexturedItem(PropsHelperInfiBase.obsidianRodID, 
        		"/infibase/items.png", "Obsidian Rod").setIconCoord(6, 0);
        sandstoneRod = new InfiTexturedItem(PropsHelperInfiBase.sandstoneRodID, 
        		"/infibase/items.png", "Sandstone Rod").setIconCoord(7, 0);
        boneRod = new InfiTexturedItem(PropsHelperInfiBase.boneRodID, 
        		"/infibase/items.png", "Bone Rod").setIconCoord(8, 0);
        paperRod = new InfiTexturedItem(PropsHelperInfiBase.paperRodID, 
        		"/infibase/items.png", "Paper Rod").setIconCoord(9, 0);
        mossyRod = new InfiTexturedItem(PropsHelperInfiBase.mossyRodID, 
        		"/infibase/items.png", "Mossy Rod").setIconCoord(10, 0);
        netherrackRod = new InfiTexturedItem(PropsHelperInfiBase.netherrackRodID, 
        		"/infibase/items.png", "Netherrack Rod").setIconCoord(11, 0);
        glowstoneRod = new InfiTexturedItem(PropsHelperInfiBase.glowstoneRodID, 
        		"/infibase/items.png", "Glowstone Rod").setIconCoord(12, 0);
        iceRod = new InfiTexturedItem(PropsHelperInfiBase.iceRodID, 
        		"/infibase/items.png", "Ice Rod").setIconCoord(13, 0);
        lavaRod = new InfiTexturedItem(PropsHelperInfiBase.lavaRodID, 
        		"/infibase/items.png", "Lava Rod").setIconCoord(14, 0);
        slimeRod = new InfiTexturedItem(PropsHelperInfiBase.slimeRodID, 
        		"/infibase/items.png", "Slime Rod").setIconCoord(15, 0);
        cactusRod = new InfiTexturedItem(PropsHelperInfiBase.cactusRodID, 
        		"/infibase/items.png", "Cactus Rod").setIconCoord(0, 1);
        flintRod = new InfiTexturedItem(PropsHelperInfiBase.flintRodID, 
        		"/infibase/items.png", "Flint Rod").setIconCoord(1, 1);
        brickRod = new InfiTexturedItem(PropsHelperInfiBase.brickRodID, 
        		"/infibase/items.png", "Brick Rod").setIconCoord(2, 1);
        
        copperRod = new InfiTexturedItem(PropsHelperInfiMetals.copperRodID, 
        		"/metaltex/rods.png", "Copper Rod").setIconCoord(4, 1);
		bronzeRod = new InfiTexturedItem(PropsHelperInfiMetals.bronzeRodID, 
				"/metaltex/rods.png", "Bronze Rod").setIconCoord(5, 1);
		workedIronRod = new InfiTexturedItem(PropsHelperInfiMetals.workedIronRodID, 
				"/metaltex/rods.png", "Worked Iron Rod").setIconCoord(6, 1);
		steelRod = new InfiTexturedItem(PropsHelperInfiMetals.steelRodID, 
				"/metaltex/rods.png", "Steel Rod").setIconCoord(7, 1);
		cobaltRod = new InfiTexturedItem(PropsHelperInfiMetals.cobaltRodID, 
				"/metaltex/rods.png", "Cobalt Rod").setIconCoord(8, 1);
		arditeRod = new InfiTexturedItem(PropsHelperInfiMetals.arditeRodID, 
				"/metaltex/rods.png", "Ardite Rod").setIconCoord(9, 1);
		manyullynRod = new InfiTexturedItem(PropsHelperInfiMetals.manyullynRodID, 
				"/metaltex/rods.png", "Manyullyn Rod").setIconCoord(10, 1);
		uraniumRod = new InfiTexturedItem(PropsHelperInfiMetals.uraniumRodID, 
				"/metaltex/rods.png", "Uranium Rod").setIconCoord(15, 1);
    }

}
