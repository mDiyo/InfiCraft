package net.minecraft.src.infi2x2;
import net.minecraft.src.*;
import net.minecraft.src.forge.ForgeHooks;

public class DaggerEntity extends InfiEntityRotating
{
	public void damageBoomerang(int i, boolean flag)
    {
        /*if(returnStack.itemID == mod_2by2.daggerWood.shiftedIndex && fire > 0)
        {
            i *= 6;
        }
        super.damageBoomerang(i, flag);*/
    }

    public DaggerEntity(World world)
    {
        super(world);
    }

    public DaggerEntity(World world, double d, double d1, double d2)
    {
        super(world, d, d1, d2);
    }

    public DaggerEntity(World world, EntityLiving entityliving, float f, float f1)
    {
        super(world, entityliving, f, f1);
    }

    public void onHit(MovingObjectPosition movingobjectposition)
    {
    	if(worldObj.isRemote)
    	{
    		return;
    	}
        if(movingobjectposition.entityHit != null)
        {
            if(movingobjectposition.entityHit.attackEntityFrom(DamageSource.causeMobDamage(owner), damageDealt))
            {
                worldObj.playSoundAtEntity(this, "random.drr", 1.0F, 1.2F / (rand.nextFloat() * 0.2F + 0.9F));
                motionX *= -0.10000000149011612D;
                motionY *= -0.10000000149011612D;
                motionZ *= -0.10000000149011612D;
                rotationYaw += 180F;
                prevRotationYaw += 180F;
                ticksInAir = 0;
                if (movingobjectposition.entityHit instanceof EntityLiving)
                {
	                InfiToolDagger dagger = (InfiToolDagger) returnStack.getItem();
	                this.hitEntity(returnStack, (EntityLiving) movingobjectposition.entityHit, owner, dagger);
	                if (returnStack.getItemDamage() >= returnStack.getMaxDamage())
	                	returnStack.stackSize--;
                }
            }
        } else
        {
            xTile = movingobjectposition.blockX;
            yTile = movingobjectposition.blockY;
            zTile = movingobjectposition.blockZ;
            inTile = worldObj.getBlockId(xTile, yTile, zTile);
            motionX = (float)(movingobjectposition.hitVec.xCoord - posX);
            motionY = (float)(movingobjectposition.hitVec.yCoord - posY);
            motionZ = (float)(movingobjectposition.hitVec.zCoord - posZ);
            float f = MathHelper.sqrt_double(motionX * motionX + motionY * motionY + motionZ * motionZ);
            posX -= (motionX / (double)f) * 0.05000000074505806D;
            posY -= (motionY / (double)f) * 0.05000000074505806D;
            posZ -= (motionZ / (double)f) * 0.05000000074505806D;
            worldObj.playSoundAtEntity(this, "random.drr", 1.0F, 1.2F / (rand.nextFloat() * 0.2F + 0.9F));
            inGround = true;
            arrowShake = 7;
            returnStack.damageItem(1, owner);
            /*if((Block.fire.abilityToCatchFire[inTile] != 0 || BlockFire.infiniteBurnList.contains(Integer.valueOf(inTile))) && fire > 0)
            {
                int i = MathHelper.floor_double(posX);
                int j = MathHelper.floor_double(posY);
                int k = MathHelper.floor_double(posZ);
                if(worldObj.isAirBlock(i, j, k))
                {
                    worldObj.setBlockWithNotify(i, j, k, Block.fire.blockID);
                }
            }*/
        }
    }
    
    public boolean hitEntity(ItemStack stack, EntityLiving mob, EntityLiving player, InfiWeaponCore weapon)
    {    	
        if (player.canAttackWithItem())
        {
            int var2 = ((EntityPlayer)player).inventory.getDamageVsEntity(mob);

            if (player.isPotionActive(Potion.damageBoost))
            {
                var2 += 3 << player.getActivePotionEffect(Potion.damageBoost).getAmplifier();
            }

            if (player.isPotionActive(Potion.weakness))
            {
                var2 -= 2 << mob.getActivePotionEffect(Potion.weakness).getAmplifier();
            }

            int var3 = 0;
            int var4 = 0;

            if (mob instanceof EntityLiving)
            {
                var4 = EnchantmentHelper.getEnchantmentModifierLiving(((EntityPlayer)player).inventory, mob);
                var3 += EnchantmentHelper.getKnockbackModifier(((EntityPlayer)player).inventory, mob);
            }

            if (this.isSprinting())
            {
                ++var3;
            }

            if (var2 > 0 || var4 > 0)
            {
                boolean var5 = this.fallDistance > 0.0F && !this.onGround && !mob.isOnLadder() && !this.isInWater() && !mob.isPotionActive(Potion.blindness) && this.ridingEntity == null && player instanceof EntityLiving;

                if (var5)
                {
                    var2 += this.rand.nextInt(var2 / 2 + 2);
                }

                var2 += var4;
                boolean var6 = mob.attackEntityFrom(DamageSource.causePlayerDamage((EntityPlayer)player), var2);

                if (var6)
                {
                    if (var3 > 0)
                    {
                        mob.addVelocity((double)(-MathHelper.sin(this.rotationYaw * (float)Math.PI / 180.0F) * (float)var3 * 0.5F), 0.1D, (double)(MathHelper.cos(this.rotationYaw * (float)Math.PI / 180.0F) * (float)var3 * 0.5F));
                        this.motionX *= 0.6D;
                        this.motionZ *= 0.6D;
                        this.setSprinting(false);
                    }

                    if (var5)
                    {
                    	((EntityPlayer)player).onCriticalHit(mob);
                    }

                    if (var4 > 0)
                    {
                    	((EntityPlayer)player).onEnchantmentCritical(mob);
                    }

                    if (var2 >= 18)
                    {
                    	((EntityPlayer)player).triggerAchievement(AchievementList.overkill);
                    }

                    ((EntityPlayer)player).setLastAttackingEntity(mob);
                }

                ItemStack var7 = ((EntityPlayer)player).getCurrentEquippedItem();

                if (mob instanceof EntityLiving)
                {

                	((EntityPlayer)player).addStat(StatList.damageDealtStat, var2);
                    int var8 = EnchantmentHelper.getFireAspectModifier(((EntityPlayer)player).inventory, mob);

                    if (var8 > 0)
                    {
                        mob.setFire(var8 * 4);
                    }
                }
            }
            
            World world = player.worldObj;
            if (weapon.headType == weapon.handleType)
            {
            	weapon.attacks(stack, world, player, mob, weapon.getHeadType());
            }
            else
            {
                if (weapon.random.nextInt(100) + 1 <= 80)
                {
                	weapon.attacks(stack, world, player, mob, weapon.getHeadType());
                }
                if (weapon.random.nextInt(100) + 1 <= 20)
                {
                	weapon.attacks(stack, world, player, mob, weapon.getHandleType());
                }
            }
            
            int unbreaking = weapon.headUnbreaking;
            if (weapon.handleUnbreaking > unbreaking)
            	unbreaking = weapon.handleUnbreaking;
            if (weapon.random.nextInt(100) + 1 <= 100 - (unbreaking * 10))
            {
                stack.damageItem(1, mob);
            }
        }
    	
        this.checkEnchants(stack, mob);
        
        return true;
    }
    
    public boolean checkEnchants(ItemStack itemstack, EntityLiving mob)
	{
		int freezeCheck = 0;
		int poisonCheck = 0;
		NBTTagList nbttaglist = itemstack.getEnchantmentTagList();
        if(nbttaglist == null)
        {
            return false;
        }
        for(int j = 0; j < nbttaglist.tagCount(); j++)
        {
            short word0 = ((NBTTagCompound)nbttaglist.tagAt(j)).getShort("id");
            short word1 = ((NBTTagCompound)nbttaglist.tagAt(j)).getShort("lvl");
            if(word0 == 42)
            {
                freezeCheck = word1;
            }
            else if (word0 == 41)
            {
            	poisonCheck = word1;
            	if(rand.nextInt(5) == 0)
            	{
            		if(poisonCheck > 0)
            			((NBTTagCompound)nbttaglist.tagAt(j)).setInteger("lvl", poisonCheck - 1);
            	}
            }
        }
		if(freezeCheck > 0)
        {
            mob.freeze(freezeCheck * 50);
        }
		if(poisonCheck > 0)
		{
			mob.addPotionEffect(new PotionEffect(Potion.poison.id, poisonCheck * 5, 0));
		}
		return false;
	}

    protected void dealFireDamage(int i)
    {
    }

    public void onUpdate()
    {
        super.onUpdate();
    }
}
