package mDiyo.inficraft.infitools.library;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import net.minecraft.src.Block;
import net.minecraft.src.Entity;
import net.minecraft.src.EntityLiving;
import net.minecraft.src.EntityPlayer;
import net.minecraft.src.EnumToolMaterial;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;
import net.minecraft.src.ItemTool;
import net.minecraft.src.ModLoader;
import net.minecraft.src.Potion;
import net.minecraft.src.PotionEffect;
import net.minecraft.src.World;
import net.minecraftforge.common.ForgeHooks;

public abstract class InfiToolCore extends ItemTool
{
    protected static Random random = new Random();
    protected int secondIconIndex;
    
    private String[] namePrefix = {
        	"", "Stony ", "Hard ", "Jeweled ", "Red ", "Glassy ", "Sandy ", "Occult ", "Fibery ",
        	"Mossy ", "Bloody ", "Glowing ", "Cold ", "Fiery ", "Slimy ", "Spiny ", "Rough ", "Hot ",
        	"Cupric ", "Bronzed ", "Worked ", "Forged ", "Blue ", "Rustic ", "Exotic ", "Poisonous "
        };
        
        private String[] nameSuffix = {
        	"Wooden", "Stone", "Iron", "Diamond", "Redstone", "Obsidian", "Sandstone", "Bone", "Paper",
        	"Mossy", "Netherrack", "Glowstone", "Ice", "Lava", "Slime", "Cactus", "Flint", "Blaze",
        	"Copper", "Bronze", "Worked Iron", "Steel", "Cobalt", "Ardite", "Manyullyn", "Uranium"
        };
	
	public InfiToolCore(int itemID, int damageBase, InfiMaterialEnum head, InfiMaterialEnum handle, String internalName)
	{
		super(itemID, damageBase, EnumToolMaterial.WOOD, null);

		this.toolHarvestLevel = head.getHarvestLevel();
		this.maxStackSize = 1;		
        this.efficiencyOnProperMaterial = head.getSpeed();
        this.toolDamage = damageBase + head.getDamage();
        int durability = (int)(head.getDurability() * handle.getDurabilityBonus());        
        setMaxDamage(durability);
        this.headType = head.getMaterialType();
        this.handleType = handle.getMaterialType();
        this.enchantibility = (head.getEnchantability() + handle.getEnchantability()) / 2;
        this.headUnbreaking = head.getUnbreakingLevel();
        this.handleUnbreaking = handle.getUnbreakingLevel();
        this.headShoddy = head.getShoddy();
        this.handleShoddy = handle.getShoddy();
        this.setIconIndex(handleType - 1);
        this.setSecondIconIndex(headType + 47);
        this.setItemName(internalName);
        if(headType != handleType)
        {
        	ModLoader.addName(this, namePrefix[handleType - 1] + nameSuffix[headType-1] + " " + getInvName());
        }
        this.setCreativeTab(InfiLibrary.infitools);
	}
	
	public abstract String getInvName();

    public boolean onBlockStartBreak(ItemStack itemstack, int x, int y, int z, EntityPlayer entityplayer)
    {
        World world = entityplayer.worldObj;
        int bID = world.getBlockId(x, y, z);
        Block block = Block.blocksList[bID];
        if (world.isRemote || bID == 0 || block == null)
        {
            return false;
        }
        int md = world.getBlockMetadata(x, y, z);
        boolean flag = true;
        boolean flag1 = true;
        if (headType == handleType)
        {
            flag = powers(itemstack, bID, x, y, z, world, entityplayer, md, headType);
        }
        else
        {
            if (random.nextInt(100) + 1 <= 80)
            {
                flag = powers(itemstack, bID, x, y, z, world, entityplayer, md, headType);
            }
            if (random.nextInt(100) + 1 <= 20)
            {
                flag1 = powers(itemstack, bID, x, y, z, world, entityplayer, md, handleType);
            }
        }
        if (!ForgeHooks.canHarvestBlock(block, entityplayer, md))
        {
            flag = false;
        }
        if (!flag || !flag1)
        {
            //world.playAuxSFX(2001, x, y, z, bID + (md << 12));
            world.setBlockWithNotify(x, y, z, 0);
            onBlockDestroyed(itemstack, bID, x, y, z, entityplayer);
            return true;
        }
        else
        {
            return false;
        }
    }

    public boolean onBlockDestroyed(ItemStack itemstack, int bID, int x, int y, int z, EntityLiving player)
    {
        int unbreaking = headUnbreaking;
        if (handleUnbreaking > unbreaking)
        	unbreaking = handleUnbreaking;
        if (random.nextInt(100) + 1 <= 100 - (unbreaking * 10))
        {
        	if (itemstack.getItemDamage() + 1 >= itemstack.getMaxDamage())
        		((EntityPlayer)player).destroyCurrentEquippedItem();
        	else
        		itemstack.damageItem(1, player);
        }
        return true;
    }

    public boolean hitEntity(ItemStack itemstack, EntityLiving mob, EntityLiving player)
    {
        World world = player.worldObj;
        if (headType == handleType)
        {
            attacks(itemstack, world, player, mob, headType);
        }
        else
        {
            if (random.nextInt(100) + 1 <= 80)
            {
                attacks(itemstack, world, player, mob, headType);
            }
            if (random.nextInt(100) + 1 <= 20)
            {
                attacks(itemstack, world, player, mob, handleType);
            }
        }
        
        int unbreaking = headUnbreaking;
        if (handleUnbreaking > unbreaking)
        	unbreaking = handleUnbreaking;
        if (random.nextInt(100) + 1 <= 100 - (unbreaking * 10))
        {
        	if (itemstack.getItemDamage() + 2 >= itemstack.getMaxDamage())
        		((EntityPlayer)player).destroyCurrentEquippedItem();
        	else
        		itemstack.damageItem(2, mob);
        }
        	
        return true;
    }

    public boolean powers(ItemStack itemstack, int blockID, int x, int y, int z, World world, EntityLiving entityliving,
            int metadata, int materialType)
    {
        switch (materialType)
        {
            case 1: InfiToolPowers.splintering(x, y, z, InfiLibrary.woodSplinters, world); break;
            case 2: InfiToolPowers.splintering(x, y, z, InfiLibrary.stoneShard, world); break;
            case 6: InfiToolPowers.splintering(x, y, z, InfiLibrary.obsidianShard, world); break;
            case 7: InfiToolPowers.splintering(x, y, z, InfiLibrary.sandstoneShard, world); break;
            case 11: InfiToolPowers.splintering(x, y, z, InfiLibrary.netherrackShard, world); break;
            case 12: InfiToolPowers.splintering(x, y, z, Item.lightStoneDust, world); break;
            case 13: InfiToolPowers.freezing(x, y, z, blockID, metadata, world, entityliving); break;
            case 14: InfiToolPowers.burning(x, y, z, blockID, metadata, world, entityliving); break;
            case 15: InfiToolPowers.slimePower(x, y, z, world); break;
        }
        return materialType != 13 && materialType != 14;
    }

    public void attacks(ItemStack itemstack, World world, EntityLiving player, EntityLiving mob, int materialType)
    {
        switch (materialType)
        {
            case 1: InfiToolPowers.splinterAttack(player, InfiLibrary.woodSplinters, world); break;
            case 2: InfiToolPowers.splinterAttack(player, InfiLibrary.stoneShard, world); break;
            case 6: InfiToolPowers.splinterAttack(player, InfiLibrary.obsidianShard, world); break;
            case 7: InfiToolPowers.splinterAttack(player, InfiLibrary.sandstoneShard, world); break;
            case 11: InfiToolPowers.splinterAttack(player, InfiLibrary.netherrackShard, world); break;
            case 12: InfiToolPowers.splinterAttack(player, Item.lightStoneDust, world); break;
            case 13: InfiToolPowers.freezeMob(mob, 35); break;
            case 14: mob.setFire(40); break;
            case 15: InfiToolPowers.splinterAttack(player, Item.slimeBall, world); break;
            case 18: mob.setFire(100); break;
            case 26: mob.addPotionEffect(new PotionEffect(Potion.poison.id, 3 * 20, 0));
        }
    }

    public int getDamageVsEntity(Entity entity)
    {
        return toolDamage;
    }

    public boolean isFull3D()
    {
        return true;
    }
    
    public Item setSecondIconIndex(int index)
    {
        this.secondIconIndex = index;
        return this;
    }
    
    public Item setSecondIconCoord(int posX, int posY)
    {
        this.secondIconIndex = posX + posY * 16;
        return this;
    }
    
    public int getSecondIconFromDamage(int meta)
    {
    	if (meta < this.getMaxDamage() * 4 / 10)
    		return this.secondIconIndex;
    	else if (meta < this.getMaxDamage() * 7 / 10)
    		return this.secondIconIndex + 48;
    	else if (meta < this.getMaxDamage() * 9 / 10)
    		return this.secondIconIndex + 96;
    	else
    		return this.secondIconIndex + 144;
    }
    
    @Override public int getIconFromDamageForRenderPass(int meta, int pass)
    {
    	if (pass == 0)
    	{
    		return this.getIconFromDamage(meta);
    	}
    	else
    		return this.getSecondIconFromDamage(meta);
    }

    public final int getSecondIconIndex(ItemStack par1ItemStack)
    {
        return this.getSecondIconFromDamage(par1ItemStack.getItemDamage());
    }
    
    public int getRenderPasses(int metadata)
    {
    	return 2;
    }
        
    @Override public boolean requiresMultipleRenderPasses()
    {
    	return true;
    }

    public int getItemEnchantability()
    {
        return enchantibility;
    }
    
    public int getHeadType() {
    	return headType;
    }
    
    public int getHandleType() {
    	return handleType;
    }
    
    @Override
    public void onUpdate(ItemStack stack, World par2World, Entity par3Entity, int par4, boolean par5) 
    {

    	Random rand = new Random();
    	if(!(par3Entity instanceof EntityLiving))
    		return;
    	if(rand.nextInt(100) > 0)
    		return;
		if(stack.getItemDamage() > 0) {
			int heal = 0;
			if(getHeadType() == 10)
				heal += 4;
			if(getHandleType() == 10)
				heal += 1;
			if(heal > 0 && rand.nextInt(5) < heal)
				stack.damageItem(-1, (EntityLiving) par3Entity);
		}
		int poison = 0;
		if(getHeadType() == 26)
		{
			poison += 20;
		}
		if(getHandleType() == 26)
		{
			poison += 5;
		}
		if (poison > 0 && rand.nextInt(4) == 0)
		{
			((EntityLiving) par3Entity).addPotionEffect(new PotionEffect(Potion.poison.id, poison, 0));
		}
    }

    protected float efficiencyOnProperMaterial;
    protected int toolHarvestLevel;
    protected int toolDamage;
	protected int enchantibility;
	protected int headType;
	protected int handleType;
	protected int headUnbreaking;
	protected int handleUnbreaking;
	protected boolean headShoddy;
	protected boolean handleShoddy;
}