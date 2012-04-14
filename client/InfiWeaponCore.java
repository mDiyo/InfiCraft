package net.minecraft.src;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import net.minecraft.src.forge.ForgeHooks;
import net.minecraft.src.forge.ITextureProvider;

public abstract class InfiWeaponCore extends ItemSword
	implements ITextureProvider
{
    private static Random random = new Random();
    protected static InfiMaterialEnum headMaterial;
    protected static InfiMaterialEnum handleMaterial;
    protected int secondIconIndex;
    
    private String[] namePrefix = {
    	"", "Stony ", "Hard ", "Jeweled ", "Expensive ", "Red ", "Glassy ", "Sandy ", "Occult ", "Fibery ",
    	"Mossy ", "Bloody ", "Glowing ", "Cold ", "Fiery ", "Slimy ", "Spiny ", "Rough ", "Baked ", "Hot ",
    	"Cupric ", "Bronzed ", "Worked ", "Forged ", "Blue ", "Rustic ", "Exotic ", "", "", "", "", "Poisonous"
    };
    
    private String[] nameSuffix = {
    	"Wooden", "Stone", "Iron", "Diamond", "Gold", "Redstone", "Obsidian", "Sandstone", "Bone", "Paper",
    	"Mossy", "Netherrack", "Glowstone", "Ice", "Lava", "Slime", "Cactus", "Flint", "Brick", "Blaze",
    	"Copper", "Bronze", "Worked Iron", "Steel", "Cobalt", "Ardite", "Manyullyn", "", "", "", "", "Uranium"
    };
	
	public InfiWeaponCore(int itemID, int damageBase, InfiMaterialEnum head, InfiMaterialEnum handle, Material[] material, String internalName)
	{
		super(itemID, EnumToolMaterial.WOOD);
				
		this.materialEffectiveAgainst = material;
		this.toolHarvestLevel = head.getHarvestLevel();
		this.maxStackSize = 1;		
        this.efficiencyOnProperMaterial = head.getSpeed();
        this.damageVsEntity = damageBase + head.getDamage();
        this.durability = (int)(head.getDurability() * handle.getDurabilityBonus());
        this.headMaterial = head;
        this.handleMaterial = handle;
        setMaxDamage(durability);
        int handleMaterial = handle.getMaterialType();
        int headMaterial = head.getMaterialType();
        this.setIconIndex(handleMaterial - 1);
        this.setSecondIconIndex(headMaterial + 127);
        this.setItemName(internalName);
        if(headMaterial != handleMaterial)
        {
        	ModLoader.addName(this, namePrefix[handleMaterial - 1] + nameSuffix[headMaterial-1] + " " + getInvName());
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
        if (headMaterial.getMaterialType() == handleMaterial.getMaterialType())
        {
            flag = powers(itemstack, bID, x, y, z, world, entityplayer, md, headMaterial.getMaterialType());
        }
        else
        {
            if (random.nextInt(100) + 1 <= 80)
            {
                flag = powers(itemstack, bID, x, y, z, world, entityplayer, md, headMaterial.getMaterialType());
            }
            if (random.nextInt(100) + 1 <= 20)
            {
                flag1 = powers(itemstack, bID, x, y, z, world, entityplayer, md, handleMaterial.getMaterialType());
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
        int unbreaking = headMaterial.getUnbreakingLevel();
        if (handleMaterial.getUnbreakingLevel() > unbreaking)
        	unbreaking = handleMaterial.getUnbreakingLevel();
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
        int type1 = headMaterial.getMaterialType();
        int type2 = handleMaterial.getMaterialType();
        if (type1 == type2)
        {
            attacks(itemstack, world, entityliving1, entityliving, type1);
        }
        else
        {
            if (random.nextInt(100) + 1 <= 80)
            {
                attacks(itemstack, world, entityliving1, entityliving, type1);
            }
            if (random.nextInt(100) + 1 <= 20)
            {
                attacks(itemstack, world, entityliving1, entityliving, type2);
            }
        }
        
        int unbreaking = headMaterial.getUnbreakingLevel();
        if (handleMaterial.getUnbreakingLevel() > unbreaking)
        	unbreaking = handleMaterial.getUnbreakingLevel();
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
            case 1:
                InfiToolPowers.splintering(x, y, z, mod_InfiTools.woodSplinters, world);
                break;

            case 2:
                InfiToolPowers.splintering(x, y, z, mod_InfiTools.stoneShard, world);
                break;

            case 7:
                InfiToolPowers.splintering(x, y, z, mod_InfiTools.obsidianShard, world);
                break;

            case 8:
                InfiToolPowers.splintering(x, y, z, mod_InfiTools.sandstoneShard, world);
                break;

            case 12:
                InfiToolPowers.splintering(x, y, z, mod_InfiTools.netherrackShard, world);
                break;

            case 13:
                InfiToolPowers.splintering(x, y, z, Item.lightStoneDust, world);
                break;

            case 14:
                InfiToolPowers.freezing(x, y, z, blockID, metadata, world, entityliving);
                break;

            case 15:
                InfiToolPowers.burning(x, y, z, blockID, metadata, world, entityliving);
                break;

            case 16:
                InfiToolPowers.slimePower(x, y, z, world);
                break;
        }
        return materialType != 14 && materialType != 15;
    }

    public void attacks(ItemStack itemstack, World world, EntityLiving entityliving, EntityLiving entityliving1, int i)
    {
        switch (i)
        {
            case 1:
                InfiToolPowers.splinterAttack(entityliving, mod_InfiTools.woodSplinters, world);
                break;

            case 2:
                InfiToolPowers.splinterAttack(entityliving, mod_InfiTools.stoneShard, world);
                break;

            case 7:
                InfiToolPowers.splinterAttack(entityliving, mod_InfiTools.obsidianShard, world);
                break;

            case 8:
                InfiToolPowers.splinterAttack(entityliving, mod_InfiTools.sandstoneShard, world);
                break;

            case 12:
                InfiToolPowers.splinterAttack(entityliving, mod_InfiTools.netherrackShard, world);
                break;

            case 13:
                InfiToolPowers.splinterAttack(entityliving, Item.lightStoneDust, world);
                break;

            case 14:
                entityliving1.freeze();
                break;

            case 15:
                entityliving1.setFire(100);
                break;

            case 20:
                entityliving1.setFire(100);
                break;
        }
    }
    
    public float getStrVsBlock(ItemStack itemstack, Block block, int md)
	{
		for (int i = 0; i < materialEffectiveAgainst.length; i++)
		{
			if (materialEffectiveAgainst[i] == block.blockMaterial)
			{
				if (headMaterial.getShoddy() || handleMaterial.getShoddy())
				{
					return efficiencyOnProperMaterial + (float)itemstack.getItemDamage() / 100F;
				}
				else
				{
					return efficiencyOnProperMaterial;
				}
			}
		}

		return 1.0F;
	}

    public int getDamageVsEntity(Entity entity)
    {
        return damageVsEntity;
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
        return headMaterial.getEnchantability();
    }
    
    public int getHeadType() {
    	return headMaterial.getMaterialType();
    }
    
    public int getHandleType() {
    	return handleMaterial.getMaterialType();
    }

    private static Material materialEffectiveAgainst[];
    public float efficiencyOnProperMaterial;
    public int toolHarvestLevel;
    public boolean toolIsPick;
    private int damageVsEntity;
	public int durability;
}