package net.minecraft.src.infirange;

import net.minecraft.src.forge.ITextureProvider;
import java.util.Random;
import net.minecraft.src.*;

public class InfiToolSpear extends InfiWeaponCore
{
    private static Material materialEffectiveAgainst[];

    public InfiToolSpear(int itemID, InfiMaterialEnum head, InfiMaterialEnum handle, String internalName)
    {
    	super(itemID, 1, head, handle, internalName);
    }

    public String getTextureFile()
    {
        return "/infirange/spears.png";
    }

    
    public float getStrVsBlock(ItemStack itemstack, Block block, int md)
    {
    	for (int i = 0; i < materialEffectiveAgainst.length; i++)
		{
			if (materialEffectiveAgainst[i] == block.blockMaterial)
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
        return block.blockID == Block.web.blockID ? 15.0F : 1.5F;
    }

    static
    {
        materialEffectiveAgainst = (new Material[]
        {
        	Material.web, Material.leaves, Material.plants, Material.vine, Material.cloth, Material.cactus, Material.pumpkin
        });
    }

	@Override
	public String getInvName() 
	{
		return "Spear";
	}
	
	@Override
	public boolean onBlockDestroyed(ItemStack itemstack, int bID, int x, int y, int z, EntityLiving entityliving)
    {
        int unbreaking = headUnbreaking;
        if (handleUnbreaking > unbreaking)
        	unbreaking = handleUnbreaking;
        if (random.nextInt(100) + 1 <= 100 - (unbreaking * 10))
        {
            itemstack.damageItem(1, entityliving);
        }
        if (itemstack.stackSize == 0)
        	((EntityPlayer)entityliving).destroyCurrentEquippedItem();
        return true;
    }
	
	public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer entityplayer)
    {
        if((entityplayer.capabilities.isCreativeMode)) {
        	onPlayerStoppedUsing(itemstack, world, entityplayer, 400);
        } else {
        	entityplayer.setItemInUse(itemstack, getMaxItemUseDuration(itemstack));
        }
        return itemstack;
    }
	
	@Override
	public void onPlayerStoppedUsing(ItemStack itemstack, World world, EntityPlayer entityplayer, int useTime)
    {
		System.out.println("UseTime: " + (this.getMaxItemUseDuration(itemstack)-useTime));
		System.out.println("Itemstack size: "+itemstack.stackSize);
		if (this.getMaxItemUseDuration(itemstack) - useTime > 0 && !world.isRemote)
        {
			SpearEntity spear = makeSpearEntity(itemstack.copy(), world, entityplayer);
			entityplayer.destroyCurrentEquippedItem();
	        world.spawnEntityInWorld(spear);
        }        
    }

    public SpearEntity makeSpearEntity(ItemStack itemstack, World world, EntityPlayer entityplayer)
    {
        //entityplayer.worldObj.playSoundAtEntity(entityplayer, "rangecraft.spearThrow", 3F, (E22_Utils.r.nextFloat() - E22_Utils.r.nextFloat()) * 0.2F + 1.0F);
        SpearEntity spear = new SpearEntity(world, entityplayer, 0.75F, 0.7F);
        spear.returnStackSlot = entityplayer.inventory.currentItem;
        spear.texID = iconIndex;
        spear.tex2ID = secondIconIndex;
        spear.returnStack = itemstack;
        spear.damageDealt = 1 + toolDamage;
        //rc_entityspear.isImmuneToFire = fireProof;
        return spear;
    }

    public int getDamageVsEntityWithRange(Entity entity, double d)
    {
        //mod_2by2.print((new StringBuilder()).append("Spear Range ... ").append(d).toString());
        if(d < 2.5D)
        {
            return 1;
        } else
        {
            return getDamageVsEntity(entity);
        }
    }
    
    public int getMaxItemUseDuration(ItemStack itemstack)
    {
        return 32000;
    }
    
    public EnumAction getItemUseAction(ItemStack itemstack)
    {
        return EnumAction.bow;
    }

    public void attackTargetEntityWithCurrentItem(EntityPlayer entityplayer, Entity entity)
    {
        double d = entityplayer.getDistanceToEntity(entity);
        int i = getDamageVsEntityWithRange(entity, d);
        if(i > 0)
        {
            if(entityplayer.motionY < 0.0D)
            {
                i++;
            }
            entity.attackEntityFrom(DamageSource.causePlayerDamage(entityplayer), i);
            if(entity instanceof EntityLiving)
            {
                float f;
                if(d < 3D)
                {
                    f = i;
                } else
                {
                    f = 0.0F;
                }
                //mod_2by2.print((new StringBuilder()).append("Spear knockback ... ").append(f).toString());
                //E22_Utils.AttackEntityFrom(entityplayer, (EntityLiving)entity, i, f);
            } else
            {
                entity.attackEntityFrom(DamageSource.causePlayerDamage(entityplayer), i);
            }
            ItemStack itemstack = entityplayer.getCurrentEquippedItem();
            if(itemstack != null && (entity instanceof EntityLiving))
            {
                itemstack.hitEntity((EntityLiving)entity, entityplayer);
                if(itemstack.stackSize <= 0)
                {
                    entityplayer.destroyCurrentEquippedItem();
                }
            }
            if(entity instanceof EntityLiving)
            {
                if(entity.isEntityAlive())
                {
                    //entityplayer.alertWolves((EntityLiving)entity, true);
                }
                entityplayer.addStat(StatList.damageDealtStat, i);
            }
        }
    }
}
