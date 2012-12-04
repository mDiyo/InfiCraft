package pchan3;

import java.util.List;
import java.util.Random;

import net.minecraft.src.AxisAlignedBB;
import net.minecraft.src.Block;
import net.minecraft.src.Entity;
import net.minecraft.src.EntityPlayer;
import net.minecraft.src.Item;
import net.minecraft.src.Material;
import net.minecraft.src.NBTTagCompound;
import net.minecraft.src.World;

public class EntitySteamBoat extends Entity
{

    public EntitySteamBoat(World world)
    {
        super(world);
        field_807_a = 0;
        field_806_b = 0;
        field_808_c = 1;
        preventEntitySpawning = true;
        setSize(1.5F, 0.6F);
        yOffset = height / 2.0F;
        
        
    }

    public AxisAlignedBB func_383_b_(Entity entity)
    {
        return entity.boundingBox;
    }

    public AxisAlignedBB func_372_f_()
    {
        return boundingBox;
    }

    public boolean canBePushed()
    {
        return true;
    }

    public EntitySteamBoat(World world, double d, double d1, double d2)
    {
        this(world);
        setPosition(d, d1 + (double)yOffset, d2);
        motionX = 0.0D;
        motionY = 0.0D;
        motionZ = 0.0D;
        prevPosX = d;
        prevPosY = d1;
        prevPosZ = d2;
    }

    public double getMountedYOffset()
    {
        return (double)height * 0.0D - 0.30000001192092896D;
    }

    public boolean attackEntityFrom(Entity entity, int i)
    {
        if(worldObj.isRemote || isDead)
        {
            return true;
        }
        field_808_c = -field_808_c;
        field_806_b = 10;
        field_807_a += i * 10;
        setBeenAttacked();
        if(field_807_a > 80)
        {
            for(int j = 0; j < 5; j++)
            {
                dropItemWithOffset(Block.planks.blockID, 1, 0.0F);
            }

            for(int k = 0; k < 1; k++)
            {
                dropItemWithOffset(Item.ingotIron.shiftedIndex, 1, 0.0f);
            }
            setDead();
        }
        return true;
    }

    public void performHurtAnimation()
    {
        field_808_c = -field_808_c;
        field_806_b = 10;
        field_807_a += field_807_a * 10;
    }

    public boolean canBeCollidedWith()
    {
        return !isDead;
    }

    public void setPositionAndRotation2(double d, double d1, double d2, float f, 
            float f1, int i)
    {
        field_9393_e = d;
        field_9392_f = d1;
        field_9391_g = d2;
        field_9390_h = f;
        field_9389_i = f1;
        field_9394_d = i + 4;
        motionX = field_9388_j;
        motionY = field_9387_k;
        motionZ = field_9386_l;
    }

    public void setVelocity(double d, double d1, double d2)
    {
        field_9388_j = motionX = d;
        field_9387_k = motionY = d1;
        field_9386_l = motionZ = d2;
    }

    public void onUpdate()
    {
        super.onUpdate();
        if(field_806_b > 0)
        {
            field_806_b--;
        }
        if(field_807_a > 0)
        {
            field_807_a--;
        }
        prevPosX = posX;
        prevPosY = posY;
        prevPosZ = posZ;
        int i = 5;
        double d = 0.0D;
        for(int j = 0; j < i; j++)
        {
            double d4 = (boundingBox.minY + ((boundingBox.maxY - boundingBox.minY) * (double)(j + 0)) / (double)i) - 0.125D;
            double d8 = (boundingBox.minY + ((boundingBox.maxY - boundingBox.minY) * (double)(j + 1)) / (double)i) - 0.125D;
            AxisAlignedBB axisalignedbb = AxisAlignedBB.getBoundingBox(boundingBox.minX, d4, boundingBox.minZ, boundingBox.maxX, d8, boundingBox.maxZ);
            if(worldObj.isAABBInMaterial(axisalignedbb, Material.water))
            {
                d += 1.0D / (double)i;
            }
        }

        if(worldObj.isRemote)
        {
            if(field_9394_d > 0)
            {
                double d1 = posX + (field_9393_e - posX) / (double)field_9394_d;
                double d5 = posY + (field_9392_f - posY) / (double)field_9394_d;
                double d9 = posZ + (field_9391_g - posZ) / (double)field_9394_d;
                double d12;
                for(d12 = field_9390_h - (double)rotationYaw; d12 < -180D; d12 += 360D) { }
                for(; d12 >= 180D; d12 -= 360D) { }
                rotationYaw += d12 / (double)field_9394_d;
                rotationPitch += (field_9389_i - (double)rotationPitch) / (double)field_9394_d;
                field_9394_d--;
                setPosition(d1, d5, d9);
                setRotation(rotationYaw, rotationPitch);
            } else
            {
                double d2 = posX + motionX;
                double d6 = posY + motionY;
                double d10 = posZ + motionZ;
                setPosition(d2, d6, d10);
                if(onGround)
                {
                    motionX *= 0.5D;
                    motionY *= 0.5D;
                    motionZ *= 0.5D;
                }
                motionX *= 0.99000000953674316D;
                motionY *= 0.94999998807907104D;
                motionZ *= 0.99000000953674316D;
            }
            return;
        }
        double d3 = d * 2D - 1.0D;
        motionY += 0.039999999105930328D * d3;
        if(riddenByEntity != null)
        {
            motionX += riddenByEntity.motionX * 0.40000000000000001D;
            motionZ += riddenByEntity.motionZ * 0.40000000000000001D;
        }
        double d7 = 1D;
        if(motionX < -d7)
        {
            motionX = -d7;
        }
        if(motionX > d7)
        {
            motionX = d7;
        }
        if(motionZ < -d7)
        {
            motionZ = -d7;
        }
        if(motionZ > d7)
        {
            motionZ = d7;
        }
        if(onGround)
        {
            motionX *= 0.5D;
            motionY *= 0.5D;
            motionZ *= 0.5D;
        }
        moveEntity(motionX, motionY, motionZ);
        double d11 = Math.sqrt(motionX * motionX + motionZ * motionZ);
        if(d11 > 0.14999999999999999D)
        {
            double d13 = Math.cos(((double)rotationYaw * 3.1415926535897931D) / 180D);
            double d15 = Math.sin(((double)rotationYaw * 3.1415926535897931D) / 180D);
            for(int i1 = 0; (double)i1 < 1.0D + d11 * 60D; i1++)
            {
                double d18 = rand.nextFloat() * 2.0F - 1.0F;
                double d20 = (double)(rand.nextInt(2) * 2 - 1) * 0.69999999999999996D;
                if(rand.nextBoolean())
                {
                    double d21 = (posX - d13 * d18 * 0.80000000000000004D) + d15 * d20;
                    double d23 = posZ - d15 * d18 * 0.80000000000000004D - d13 * d20;
                    worldObj.spawnParticle("splash", d21, posY - 0.125D, d23, motionX, motionY, motionZ);
                } else
                {
                    double d22 = posX + d13 + d15 * d18 * 0.69999999999999996D;
                    double d24 = (posZ + d15) - d13 * d18 * 0.69999999999999996D;
                    worldObj.spawnParticle("splash", d22, posY - 0.125D, d24, motionX, motionY, motionZ);
                }
            }
            
        }
        double smoke = rand.nextFloat() * 2.0f - 1.0f;
        if (smoke > 0.65f) {
           worldObj.spawnParticle("smoke", posX, posY+0.9D, posZ, 0.0D, 0.0D, 0.0D);
        }
        if(isCollidedHorizontally && d11 > 0.14999999999999999D)
        {
            if(!worldObj.isRemote)
            {
                setDead();
                
                for(int k = 0; k < 5; k++)
                {
                    dropItemWithOffset(Block.planks.blockID, 1, 0.0F);
                }

                for(int l = 0; l < 1; l++)
                {
                    dropItemWithOffset(Item.ingotIron.shiftedIndex, 1, 0.0F);
                }

            }
        } else
        {
            motionX *= 0.99000000953674316D;
            motionY *= 0.94999998807907104D;
            motionZ *= 0.99000000953674316D;
        }
        rotationPitch = 0.0F;
        double d14 = rotationYaw;
        double d16 = prevPosX - posX;
        double d17 = prevPosZ - posZ;
        if(d16 * d16 + d17 * d17 > 0.001D)
        {
            d14 = (float)((Math.atan2(d17, d16) * 180D) / 3.1415926535897931D);
        }
        double d19;
        for(d19 = d14 - (double)rotationYaw; d19 >= 180D; d19 -= 360D) { }
        for(; d19 < -180D; d19 += 360D) { }
        if(d19 > 30D)
        {
            d19 = 30D;
        }
        if(d19 < -30D)
        {
            d19 = -30D;
        }
        rotationYaw += d19;
        setRotation(rotationYaw, rotationPitch);
        List list = worldObj.getEntitiesWithinAABBExcludingEntity(this, boundingBox.expand(0.20000000298023224D, 0.0D, 0.20000000298023224D));
        if(list != null && list.size() > 0)
        {
            for(int j1 = 0; j1 < list.size(); j1++)
            {
                Entity entity = (Entity)list.get(j1);
                if(entity != riddenByEntity && entity.canBePushed() && (entity instanceof EntitySteamBoat))
                {
                    entity.applyEntityCollision(this);
                }
            }

        }
        if(riddenByEntity != null && riddenByEntity.isDead)
        {
            riddenByEntity = null;
        }
    }

    public void updateRiderPosition() {
		if (riddenByEntity == null) {
			return;
		} else {
			double d = Math
					.cos(((double) rotationYaw * 3.1415926535897931D) / 180D) * 0.40000000000000002D;
			double d1 = Math
					.sin(((double) rotationYaw * 3.1415926535897931D) / 180D) * 0.40000000000000002D;
			riddenByEntity.setPosition(posX + d, posY + getMountedYOffset()
					+ riddenByEntity.getYOffset(), posZ + d1);
			return;
		}
	}

    protected void writeEntityToNBT(NBTTagCompound nbttagcompound)
    {
    }

    protected void readEntityFromNBT(NBTTagCompound nbttagcompound)
    {
    }

    public float func_392_h_()
    {
        return 0.0F;
    }

    public boolean interact(EntityPlayer entityplayer)
    {
        if(riddenByEntity != null && (riddenByEntity instanceof EntityPlayer) && riddenByEntity != entityplayer)
        {
            return true;
        }
        if(!worldObj.isRemote)
        {
            entityplayer.mountEntity(this);
        }
        return true;
    }
    
   

    public int field_807_a;
    public int field_806_b;
    public int field_808_c;
    private int field_9394_d;
    private double field_9393_e;
    private double field_9392_f;
    private double field_9391_g;
    private double field_9390_h;
    private double field_9389_i;
    private double field_9388_j;
    private double field_9387_k;
    private double field_9386_l;

	@Override
	protected void entityInit() {
		// TODO Auto-generated method stub
		
	}
}
