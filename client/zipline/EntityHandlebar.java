package net.minecraft.src.zipline;
import net.minecraft.src.*;

import java.util.List;

public class EntityHandlebar extends Entity implements IHandlebar
{
    public double pushX;
    public double pushZ;
    public int lastSoundPosX2;
    public int lastSoundPosZ2;
    public EntityLiving owner;
    public String texture;

    public EntityHandlebar(World var1, double var2, double var4, double var6, EntityLiving var8)
    {
        super(var1);
        this.setSize(0.6F, 1.8F);
        this.setPosition(var2, var4, var6);
        this.owner = var8;
        this.texture = "/zipline/handlebar.png";
    }

    /**
     * Returns the Y offset from the entity's position for any entity riding this one.
     */
    public double getMountedYOffset()
    {
        return 0.0D;
    }

    /**
     * Returns true if other Entities should be prevented from moving through this Entity.
     */
    public boolean canBeCollidedWith()
    {
        return false;
    }

    /**
     * returns the bounding box for this entity
     */
    public AxisAlignedBB getBoundingBox()
    {
        return this.riddenByEntity == null ? this.boundingBox : this.riddenByEntity.getBoundingBox();
    }

    /**
     * returns the directory and filename as a String
     */
    public String getEntityTexture()
    {
        return this.texture;
    }

    /**
     * Called when a player interacts with a mob. e.g. gets milk from a cow, gets into the saddle on a pig.
     */
    public boolean interact(EntityPlayer var1)
    {
        this.dismount();
        return true;
    }

    /**
     * Called to update the entity's position/logic.
     */
    public void onUpdate()
    {
        super.onUpdate();

        if (this.riddenByEntity == null || this.riddenByEntity.isDead)
        {
            this.dismount();
        }

        int var1 = (int)Math.floor(this.posX);
        int var2 = (int)Math.floor(this.posY + (double)this.height);
        int var3 = (int)Math.floor(this.posZ);
        Block var4 = Block.blocksList[this.worldObj.getBlockId(var1, var2, var3)];

        if (!(var4 instanceof IZipline))
        {
            --var2;
            var4 = Block.blocksList[this.worldObj.getBlockId(var1, var2, var3)];
        }

        if (!(var4 instanceof IZipline))
        {
            var2 += 2;
            var4 = Block.blocksList[this.worldObj.getBlockId(var1, var2, var3)];
        }

        if (!(var4 instanceof IZipline))
        {
            this.dismount();
            this.setDead();
        }
        else
        {
            IZipline var5 = (IZipline)var4;
            int var6 = this.worldObj.getBlockMetadata(var1, var2, var3);
            double var7 = var5.getZiplineFriction(this, this.worldObj, var1, var2, var3, var6);
            this.motionX *= var7;
            this.motionY *= var7;
            this.motionZ *= var7;
            Vec3D var9 = var5.getZiplineMotion(this, this.worldObj, var1, var2, var3, var6);
            int var11;

            if (var9 != null)
            {
                int var10 = (int)Math.floor(this.posX + this.motionX + var9.xCoord);
                var11 = (int)Math.floor(this.posY + (double)this.height + this.motionY + var9.yCoord);
                int var12 = (int)Math.floor(this.posZ + this.motionZ + var9.zCoord);

                if ((this.worldObj.getBlockId(var10, var11, var12) == 0 || Block.blocksList[this.worldObj.getBlockId(var10, var11, var12)] instanceof IZipline) && (this.worldObj.getBlockId(var10, var11 - 1, var12) == 0 || Block.blocksList[this.worldObj.getBlockId(var10, var11 - 1, var12)] instanceof IZipline) && (this.worldObj.getBlockId(var10, var11 - 2, var12) == 0 || Block.blocksList[this.worldObj.getBlockId(var10, var11 - 2, var12)] instanceof IZipline))
                {
                    if (this.riddenByEntity != null && this.riddenByEntity.isSneaking())
                    {
                        this.motionX *= 0.9D;
                        this.motionZ *= 0.9D;
                        int var13 = (int)(this.posX * 2.0D);
                        int var14 = (int)(this.posZ * 2.0D);

                        if (var13 != this.lastSoundPosX2 || var14 != this.lastSoundPosZ2)
                        {
                            this.lastSoundPosX2 = var13;
                            this.lastSoundPosZ2 = var14;
                            StepSound var15 = var5.getStepSound(this, this.worldObj, var1, var2, var3, var6);
                            this.worldObj.playSoundAtEntity(this, var15.getBreakSound(), var15.getVolume() * 0.5F, var15.getPitch() * 0.75F);
                        }
                    }
                    else
                    {
                        this.addVelocity(var9.xCoord, var9.yCoord, var9.zCoord);
                    }

                    if (this.riddenByEntity != null)
                    {
                        this.addVelocity(this.riddenByEntity.motionX, 0.0D, this.riddenByEntity.motionZ);
                    }

                    List var18 = this.worldObj.getCollidingBoundingBoxes(this, this.boundingBox.addCoord(this.motionX, this.motionY, this.motionZ));

                    if (var18 == null || var18.size() == 0)
                    {
                        this.setPosition(this.posX + this.motionX, this.posY + this.motionY, this.posZ + this.motionZ);
                    }
                }
                else
                {
                    this.motionX = this.motionY = this.motionZ = 0.0D;
                    this.prevPosX = this.lastTickPosX = this.posX;
                    this.prevPosY = this.lastTickPosY = this.posY;
                    this.prevPosZ = this.lastTickPosZ = this.posZ;
                }
            }

            if (this.riddenByEntity != null)
            {
                List var16 = this.worldObj.getEntitiesWithinAABBExcludingEntity(this, this.boundingBox);

                if (var16 != null && var16.size() > 0)
                {
                    for (var11 = 0; var11 < var16.size(); ++var11)
                    {
                        Entity var17 = (Entity)var16.get(var11);

                        if (var17 != this.riddenByEntity && var17.canBePushed())
                        {
                            var17.applyEntityCollision(this);
                        }
                    }
                }
            }

            var5.conformToZipline(this, this.worldObj, var1, var2, var3, var6);
        }
    }

    public void dismount()
    {
        Object var1 = this.riddenByEntity != null && !this.riddenByEntity.isDead ? this.riddenByEntity : this;

        if (this.riddenByEntity != null)
        {
            Entity var2 = this.riddenByEntity;
            double var3 = Math.floor(this.posX) + 0.5D;
            double var5 = this.posY + this.getMountedYOffset() + var2.getYOffset() + 0.5D;
            double var7 = Math.floor(this.posZ) + 0.5D;
            var2.mountEntity((Entity)null);
            var2.setPosition(var3, var5, var7);
            var2.lastTickPosX = var2.prevPosX = var2.posX;
            var2.lastTickPosY = var2.prevPosY = var2.posY;
            var2.lastTickPosZ = var2.prevPosZ = var2.posZ;
            var2.motionX = 0.0D;
            var2.motionY = 0.0D;
            var2.motionZ = 0.0D;
            var2.addVelocity(this.motionX, 0.0D, this.motionZ);
        }

        new EntityItem(this.worldObj, ((Entity)var1).posX, ((Entity)var1).posY, ((Entity)var1).posZ, new ItemStack(Item.itemsList[mod_Zipline.handlebarID.shiftedIndex]));
        this.setDead();
    }

    /**
     * (abstract) Protected helper method to write subclass entity data to NBT.
     */
    public void writeEntityToNBT(NBTTagCompound var1) {}

    /**
     * (abstract) Protected helper method to read subclass entity data from NBT.
     */
    public void readEntityFromNBT(NBTTagCompound var1) {}

    protected void entityInit() {}
}
