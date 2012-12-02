package mDiyo.inficraft.infitools.hybrids;
import java.util.List;

import mDiyo.inficraft.infitools.library.InfiMaterialEnum;
import mDiyo.inficraft.infitools.library.InfiToolCore;
import mDiyo.inficraft.infitools.library.InfiToolPowers;
import mDiyo.shared.detailing.CrackManager;
import net.minecraft.src.Block;
import net.minecraft.src.DamageSource;
import net.minecraft.src.Entity;
import net.minecraft.src.EntityLiving;
import net.minecraft.src.EntityPlayer;
import net.minecraft.src.EnumAction;
import net.minecraft.src.EnumCreatureAttribute;
import net.minecraft.src.EnumMovingObjectType;
import net.minecraft.src.ItemStack;
import net.minecraft.src.Material;
import net.minecraft.src.MovingObjectPosition;
import net.minecraft.src.World;
import net.minecraftforge.common.ForgeHooks;

public class InfiToolMallet extends InfiToolCore
{
    private static Material materialEffectiveAgainst[];
    CrackManager cm;

    public InfiToolMallet(int itemID, InfiMaterialEnum head, InfiMaterialEnum handle, String internalName)
    {
    	super(itemID, 3, head, handle, internalName);
    	cm = CrackManager.getInstance();
    }
    
    public boolean onBlockStartBreak(ItemStack itemstack, int x, int y, int z, EntityPlayer entityplayer)
    {
    	World world = entityplayer.worldObj;
    	if (world.isRemote)
    	{
    		return false;
    	}
    	int blockID = world.getBlockId(x, y, z);
    	int meta = world.getBlockMetadata(x, y, z);
    	boolean headPower = true;
        boolean handlePower = true;
        if (headType == handleType)
        {
            headPower = powers(itemstack, blockID, x, y, z, world, entityplayer, meta, headType);
        }
        else
        {
            if (random.nextInt(100) + 1 <= 80)
            {
                headPower = powers(itemstack, blockID, x, y, z, world, entityplayer, meta, headType);
            }
            if (random.nextInt(100) + 1 <= 20)
            {
                handlePower = powers(itemstack, blockID, x, y, z, world, entityplayer, meta, handleType);
            }
        }
        if (!ForgeHooks.canHarvestBlock(Block.blocksList[blockID], entityplayer, meta))
        {
            headPower = false;
        }
        if (!headPower || !handlePower)
        {
            world.playAuxSFX(2001, x, y, z, blockID + (meta << 12));
            world.setBlockWithNotify(x, y, z, 0);
            onBlockDestroyed(itemstack, blockID, x, y, z, entityplayer);
            return true;
        }
        else
        {
        	ItemStack worldBlock = new ItemStack(blockID, 1, meta);
    		List list = cm.findMatchingCrushRecipe(worldBlock);
    		if (list != null)
    		{
    			for (int i = 0; i < list.size(); i++)
    			{				
    				ItemStack stack = (ItemStack)list.get(i);
    				InfiToolPowers.spawnItem(x, y, z, stack, world);
    			}
    			world.playAuxSFX(2001, x, y, z, blockID + (meta << 12));
                world.setBlockWithNotify(x, y, z, 0);
                onBlockDestroyed(itemstack, blockID, x, y, z, entityplayer);
                return true;
    		}
        }
		
    	return false;   	
    }
    
    public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer entityplayer)
    {
        if((entityplayer.capabilities.isCreativeMode)) {
        	onFoodEaten(itemstack, world, entityplayer);
        } else {
        	entityplayer.setItemInUse(itemstack, getMaxItemUseDuration(itemstack));
        }
        return itemstack;
    }
    
    public void onPlayerStoppedUsing(ItemStack itemstack, World world, EntityPlayer entityplayer, int useTime)
    {
    	MovingObjectPosition movingobjectposition = getMovingObjectPositionFromPlayer(world, entityplayer, true);
        if (movingobjectposition == null || useTime < 10)
        {
            return;
        }
        if (movingobjectposition.typeOfHit == EnumMovingObjectType.TILE)
        {
            int x = movingobjectposition.blockX;
            int y = movingobjectposition.blockY;
            int z = movingobjectposition.blockZ;
            int bID = world.getBlockId(x, y, z);
            int md = world.getBlockMetadata(x, y, z);
            
            boolean damageItem = CrackManager.getInstance().crack(world, x, y, z, bID, md);
            if(damageItem) {
            	itemstack.damageItem(1, entityplayer);
            	world.playAuxSFX(2001, x, y, z, bID + (md >> 12));
            }
        	entityplayer.swingItem();
        }
        if (movingobjectposition.typeOfHit == EnumMovingObjectType.ENTITY)
        {
        	Entity mob = movingobjectposition.entityHit;
        	if (mob instanceof EntityLiving)
        	{
        		int damage = this.getDamageVsEntity(mob) * 2;
        		mob.attackEntityFrom(DamageSource.causePlayerDamage(entityplayer), damage);
        	}
        	entityplayer.swingItem();
        }
    }
    
    @Override
    public int getDamageVsEntity(Entity entity)
    {
    	if (entity instanceof EntityLiving && ((EntityLiving)entity).getCreatureAttribute() == EnumCreatureAttribute.UNDEAD)
    		return toolDamage * 2;
        return toolDamage;
    }
    
    public int getMaxItemUseDuration(ItemStack itemstack)
    {
        return 78000;
    }
    
    public EnumAction getItemUseAction(ItemStack itemstack)
    {
        return EnumAction.bow;
    }

    public String getTextureFile()
    {
        return "/infitextures/mallets.png";
    }
    
    public float getStrVsBlock(ItemStack itemstack, Block block, int meta)
	{
		for (int i = 0; i < materialEffectiveAgainst.length; i++)
		{
			if (materialEffectiveAgainst[i] == block.blockMaterial )
			{
				if (this.headShoddy || this.handleShoddy)
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

    static
    {
        materialEffectiveAgainst = (new Material[]
        {
        	Material.rock, Material.iron, Material.ice, Material.glass, Material.piston
        });
    }

	@Override
	public String getInvName() 
	{
		return "Mallet";
	}
	
	public boolean canHarvestBlock(Block block)
    {
        if (block == Block.obsidian)
        {
            return toolHarvestLevel >= 3;
        }
        if (block == Block.blockDiamond || block == Block.oreDiamond)
        {
            return toolHarvestLevel >= 2;
        }
        if (block == Block.blockGold || block == Block.oreGold)
        {
            return toolHarvestLevel >= 2;
        }
        if (block == Block.blockSteel || block == Block.oreIron)
        {
            return toolHarvestLevel >= 1;
        }
        if (block == Block.blockLapis || block == Block.oreLapis)
        {
            return toolHarvestLevel >= 1;
        }
        if (block == Block.oreRedstone || block == Block.oreRedstoneGlowing)
        {
            return toolHarvestLevel >= 2;
        }
        if (block.blockMaterial == Material.rock)
        {
            return true;
        }
        else
        {
            return block.blockMaterial == Material.iron;
        }
    }
}
