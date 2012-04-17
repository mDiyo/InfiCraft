package net.minecraft.src;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import net.minecraft.src.forge.ForgeHooks;
import net.minecraft.src.forge.ITextureProvider;

public abstract class InfiToolCore extends ItemTool
	implements ITextureProvider
{
    private static Random random = new Random();
    protected int secondIconIndex;
    
    private String[] namePrefix = {
        	"", "Stony ", "Hard ", "Jeweled ", "Red ", "Glassy ", "Sandy ", "Occult ", "Fibery ",
        	"Mossy ", "Bloody ", "Glowing ", "Cold ", "Fiery ", "Slimy ", "Spiny ", "Rough ", "Hot ",
        	"Cupric ", "Bronzed ", "Worked ", "Forged ", "Blue ", "Rustic ", "Exotic ", "Poisonous"
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
        this.durability = (int)(head.getDurability() * handle.getDurabilityBonus());        
        setMaxDamage(durability);
        this.headType = head.getMaterialType();
        this.handleType = handle.getMaterialType();
        this.enchantibility = (head.getEnchantability() + handle.getEnchantability()) / 2;
        this.headUnbreaking = head.getUnbreakingLevel();
        this.handleUnbreaking = handle.getUnbreakingLevel();
        this.headShoddy = head.getShoddy();
        this.handleShoddy = handle.getShoddy();
        this.setIconIndex(handleType - 1);
        this.setSecondIconIndex(headType + 127);
        this.setItemName(internalName);
        if(headType != handleType)
        {
        	ModLoader.addName(this, namePrefix[handleType - 1] + nameSuffix[headType-1] + " " + getInvName());
        }
	}
	
	public abstract String getInvName();

    public boolean onBlockStartBreak(ItemStack itemstack, int x, int y, int z, EntityPlayer entityplayer)
    {
        World world = entityplayer.worldObj;
        if (world.isRemote)
        {
            return false;
        }
        int bID = world.getBlockId(x, y, z);
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
        if (!ForgeHooks.canHarvestBlock(Block.blocksList[bID], entityplayer, md))
        {
            flag = false;
        }
        if (!flag || !flag1)
        {
            world.playAuxSFX(2001, x, y, z, bID + (md << 12));
            world.setBlockWithNotify(x, y, z, 0);
            onBlockDestroyed(itemstack, bID, x, y, z, entityplayer);
            return true;
        }
        else
        {
            return false;
        }
    }

    public boolean onBlockDestroyed(ItemStack itemstack, int i, int j, int k, int l, EntityLiving entityliving)
    {
        int i1 = itemstack.getItemDamage();
        if (i1 >= durability)
        {
            itemstack.stackSize = 0;
        }
        int unbreaking = headUnbreaking;
        if (handleUnbreaking > unbreaking)
        	unbreaking = handleUnbreaking;
        if (random.nextInt(100) + 1 <= 100 - (unbreaking * 10))
        {
            itemstack.damageItem(2, entityliving);
        }
        if (i >= durability)
        {
            itemstack.stackSize = 0;
            itemstack = null;
        }
        return true;
    }

    public boolean hitEntity(ItemStack itemstack, EntityLiving entityliving, EntityLiving entityliving1)
    {
        World world = entityliving1.worldObj;
        if (headType == handleType)
        {
            attacks(itemstack, world, entityliving1, entityliving, headType);
        }
        else
        {
            if (random.nextInt(100) + 1 <= 80)
            {
                attacks(itemstack, world, entityliving1, entityliving, headType);
            }
            if (random.nextInt(100) + 1 <= 20)
            {
                attacks(itemstack, world, entityliving1, entityliving, handleType);
            }
        }
        
        int unbreaking = headUnbreaking;
        if (handleUnbreaking > unbreaking)
        	unbreaking = handleUnbreaking;
        if (random.nextInt(100) + 1 <= 100 - (unbreaking * 10))
        {
            itemstack.damageItem(1, entityliving);
        }
        int i = itemstack.getItemDamage();
        if (i >= durability)
        {
            itemstack.stackSize = 0;
            itemstack = null;
        }
        return true;
    }

    public boolean powers(ItemStack itemstack, int blockID, int x, int y, int z, World world, EntityLiving entityliving,
            int metadata, int materialType)
    {
        switch (materialType)
        {
            case 1: InfiToolPowers.splintering(x, y, z, mod_InfiBase.woodSplinters, world); break;
            case 2: InfiToolPowers.splintering(x, y, z, mod_InfiBase.stoneShard, world); break;
            case 6: InfiToolPowers.splintering(x, y, z, mod_InfiBase.obsidianShard, world); break;
            case 7: InfiToolPowers.splintering(x, y, z, mod_InfiBase.sandstoneShard, world); break;
            case 11: InfiToolPowers.splintering(x, y, z, mod_InfiBase.netherrackShard, world); break;
            case 12: InfiToolPowers.splintering(x, y, z, Item.lightStoneDust, world); break;
            case 13: InfiToolPowers.freezing(x, y, z, blockID, metadata, world, entityliving); break;
            case 14: InfiToolPowers.burning(x, y, z, blockID, metadata, world, entityliving); break;
            case 15: InfiToolPowers.slimePower(x, y, z, world); break;
        }
        return materialType != 13 && materialType != 14;
    }

    public void attacks(ItemStack itemstack, World world, EntityLiving entityliving, EntityLiving entityliving1, int materialType)
    {
        switch (materialType)
        {
            case 1: InfiToolPowers.splinterAttack(entityliving, mod_InfiBase.woodSplinters, world); break;
            case 2: InfiToolPowers.splinterAttack(entityliving, mod_InfiBase.stoneShard, world); break;
            case 6: InfiToolPowers.splinterAttack(entityliving, mod_InfiBase.obsidianShard, world); break;
            case 7: InfiToolPowers.splinterAttack(entityliving, mod_InfiBase.sandstoneShard, world); break;
            case 11: InfiToolPowers.splinterAttack(entityliving, mod_InfiBase.netherrackShard, world); break;
            case 12: InfiToolPowers.splinterAttack(entityliving, Item.lightStoneDust, world); break;
            case 13: entityliving1.freeze(); break;
            case 14: entityliving1.setFire(100); break;
            case 18: entityliving1.setFire(100); break;
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
    
    public Item setSecondIconIndex(int par1)
    {
        this.secondIconIndex = par1;
        return this;
    }
    
    public Item setSecondIconCoord(int par1, int par2)
    {
        this.secondIconIndex = par1 + par2 * 16;
        return this;
    }
    
    public int getSecondIconFromDamage(int par1)
    {
        return this.secondIconIndex;
    }
    
    @Override public int func_46057_a(int meta, int pass)
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
        
    @Override public boolean func_46058_c()
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

    protected float efficiencyOnProperMaterial;
    protected int toolHarvestLevel;
    protected int toolDamage;
    protected int durability;
	protected int enchantibility;
	protected int headType;
	protected int handleType;
	protected int headUnbreaking;
	protected int handleUnbreaking;
	protected boolean headShoddy;
	protected boolean handleShoddy;
}