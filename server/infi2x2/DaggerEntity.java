package net.minecraft.src.infi2x2;
import net.minecraft.src.*;

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
    
    public boolean hitEntity(ItemStack itemstack, EntityLiving entityliving, EntityLiving entityliving1, InfiWeaponCore weapon)
    {
        World world = entityliving1.worldObj;
        if (weapon.headType == weapon.handleType)
        {
        	weapon.attacks(itemstack, world, entityliving1, entityliving, weapon.getHeadType());
        }
        else
        {
            if (weapon.random.nextInt(100) + 1 <= 80)
            {
            	weapon.attacks(itemstack, world, entityliving1, entityliving, weapon.getHeadType());
            }
            if (weapon.random.nextInt(100) + 1 <= 20)
            {
            	weapon.attacks(itemstack, world, entityliving1, entityliving, weapon.getHandleType());
            }
        }
        
        int unbreaking = weapon.headUnbreaking;
        if (weapon.handleUnbreaking > unbreaking)
        	unbreaking = weapon.handleUnbreaking;
        if (weapon.random.nextInt(100) + 1 <= 100 - (unbreaking * 10))
        {
            itemstack.damageItem(1, entityliving);
        }
        return true;
    }

    protected void dealFireDamage(int i)
    {
    }

    public void onUpdate()
    {
        super.onUpdate();
    }
}
