package net.minecraft.src.zipline;
import net.minecraft.src.*;

import java.util.List;

public class EntityZiplineArrow extends Entity
{
    private int xTile = -1;
    private int yTile = -1;
    private int zTile = -1;
    private int inTile = 0;
    private int inData = 0;
    private boolean inGround = false;
    public boolean doesArrowBelongToPlayer = false;
    public int arrowShake = 0;
    public Entity shootingEntity;
    private int ticksInGround;
    private int ticksInAir = 0;
    private double damage = 2.0D;
    private int field_46027_au;
    public boolean arrowCritical = false;
    public int ropeCount;
    public static int ropeCountTemp = 0;
    public double startX;
    public double startY;
    public double startZ;
    public static boolean isArrowRope;
    public EntityLiving shootingEntity2;

    public EntityZiplineArrow(World var1)
    {
        super(var1);
        this.setSize(0.5F, 0.5F);
        this.ropeCount = mod_Zipline.ropeLength;
    }

    public EntityZiplineArrow(World var1, double var2, double var4, double var6)
    {
        super(var1);
        this.setSize(0.5F, 0.5F);
        this.setPosition(var2, var4, var6);
        this.yOffset = 0.0F;
        this.ropeCount = mod_Zipline.ropeLength;
        this.startX = var2;
        this.startY = var4;
        this.startZ = var6;
    }

    public EntityZiplineArrow(World var1, EntityLiving var2, float var3)
    {
        super(var1);
        this.shootingEntity = var2;
        this.doesArrowBelongToPlayer = var2 instanceof EntityPlayer;
        this.setSize(0.5F, 0.5F);
        this.setLocationAndAngles(var2.posX, var2.posY + (double)var2.getEyeHeight(), var2.posZ, var2.rotationYaw, var2.rotationPitch);
        this.posX -= (double)(MathHelper.cos(this.rotationYaw / 180.0F * (float)Math.PI) * 0.16F);
        this.posY -= 0.10000000149011612D;
        this.posZ -= (double)(MathHelper.sin(this.rotationYaw / 180.0F * (float)Math.PI) * 0.16F);
        this.setPosition(this.posX, this.posY, this.posZ);
        this.yOffset = 0.0F;
        this.motionX = (double)(-MathHelper.sin(this.rotationYaw / 180.0F * (float)Math.PI) * MathHelper.cos(this.rotationPitch / 180.0F * (float)Math.PI));
        this.motionZ = (double)(MathHelper.cos(this.rotationYaw / 180.0F * (float)Math.PI) * MathHelper.cos(this.rotationPitch / 180.0F * (float)Math.PI));
        this.motionY = (double)(-MathHelper.sin(this.rotationPitch / 180.0F * (float)Math.PI));
        this.setArrowHeading(this.motionX, this.motionY, this.motionZ, var3 * 1.5F, 1.0F);
        this.ropeCount = mod_Zipline.ropeLength;
        this.startX = var2.posX;
        this.startY = var2.posY;
        this.startZ = var2.posZ;
    }

    protected void entityInit() {}

    public void setArrowHeading(double var1, double var3, double var5, float var7, float var8)
    {
        float var9 = MathHelper.sqrt_double(var1 * var1 + var3 * var3 + var5 * var5);
        var1 /= (double)var9;
        var3 /= (double)var9;
        var5 /= (double)var9;
        var1 += this.rand.nextGaussian() * 0.007499999832361937D * (double)var8;
        var3 += this.rand.nextGaussian() * 0.007499999832361937D * (double)var8;
        var5 += this.rand.nextGaussian() * 0.007499999832361937D * (double)var8;
        var1 *= (double)var7;
        var3 *= (double)var7;
        var5 *= (double)var7;
        this.motionX = var1;
        this.motionY = var3;
        this.motionZ = var5;
        float var10 = MathHelper.sqrt_double(var1 * var1 + var5 * var5);
        this.prevRotationYaw = this.rotationYaw = (float)(Math.atan2(var1, var5) * 180.0D / Math.PI);
        this.prevRotationPitch = this.rotationPitch = (float)(Math.atan2(var3, (double)var10) * 180.0D / Math.PI);
        this.ticksInGround = 0;
    }

    /**
     * Sets the velocity to the args. Args: x, y, z
     */
    public void setVelocity(double var1, double var3, double var5)
    {
        this.motionX = var1;
        this.motionY = var3;
        this.motionZ = var5;

        if (this.prevRotationPitch == 0.0F && this.prevRotationYaw == 0.0F)
        {
            float var7 = MathHelper.sqrt_double(var1 * var1 + var5 * var5);
            this.prevRotationYaw = this.rotationYaw = (float)(Math.atan2(var1, var5) * 180.0D / Math.PI);
            this.prevRotationPitch = this.rotationPitch = (float)(Math.atan2(var3, (double)var7) * 180.0D / Math.PI);
            this.prevRotationPitch = this.rotationPitch;
            this.prevRotationYaw = this.rotationYaw;
            this.setLocationAndAngles(this.posX, this.posY, this.posZ, this.rotationYaw, this.rotationPitch);
            this.ticksInGround = 0;
        }
    }

    public ItemStack getItem()
    {
        return new ItemStack(Item.itemsList[mod_Zipline.arrowRopeID.shiftedIndex], 1);
    }

    public void hitGround(int var1, int var2, int var3, MovingObjectPosition var4)
    {
        if (var4 != null && var4.typeOfHit == EnumMovingObjectType.TILE)
        {
            int var5 = var4.sideHit;
            Material var6 = this.worldObj.getBlockMaterial(var4.blockX, var4.blockY, var4.blockZ);
            int var7 = this.worldObj.getBlockId(var1, var2 + 1, var3 + 1);
            int var8 = this.worldObj.getBlockId(var1, var2 + 1, var3 - 1);
            int var9 = this.worldObj.getBlockId(var1 + 1, var2 + 1, var3);
            int var10 = this.worldObj.getBlockId(var1 - 1, var2 + 1, var3);
            int var11 = mod_Zipline.ropeID.blockID;

            if (var7 != var11 && var8 != var11 && var9 != var11 && var10 != var11 && var5 != 0 && var5 != 1 && (var6 == Material.grass || var6 == Material.ground || var6 == Material.leaves || var6 == Material.plants))
            {
                var1 = var4.blockX;
                var2 = var4.blockY;
                var3 = var4.blockZ;
                ModLoader.getMinecraftInstance().playerController.onPlayerDamageBlock(var1, var2, var3, var4.sideHit);
            }
            else
            {
                byte var12 = var5 != 4 ? (byte)(var5 != 5 ? 0 : 1) : -1;
                byte var13 = var5 != 0 ? (byte)(var5 != 1 ? 0 : 1) : -1;
                byte var14 = var5 != 2 ? (byte)(var5 != 3 ? 0 : 1) : -1;
                var1 = var4.blockX + var12;
                var2 = var4.blockY + var13;
                var3 = var4.blockZ + var14;
            }
        }

        TensilePlacer var15;

        if (this.shootingEntity2 != null)
        {
            var15 = new TensilePlacer(var1, var2, var3, (int)this.shootingEntity2.posX, (int)this.shootingEntity2.boundingBox.minY, (int)this.shootingEntity2.posZ);
        }
        else
        {
            var15 = new TensilePlacer(var1, var2, var3, (int)this.startX, (int)this.startY, (int)this.startZ);
        }

        this.ropeCount = var15.place(this.worldObj, mod_Zipline.ropeID.blockID, ropeCountTemp);

        if (this.ropeCount > 0)
        {
            EntityItem var17 = new EntityItem(this.worldObj, (double)((float)var15.currentX + 0.5F), (double)((float)var15.currentY + 0.5F), (double)((float)var15.currentZ + 0.5F), new ItemStack(Block.blocksList[mod_Zipline.ropeID.blockID], this.ropeCount));
            this.worldObj.spawnEntityInWorld(var17);
        }

        EntityZiplineArrow var16 = new EntityZiplineArrow(this.worldObj, (double)((float)var1 + 0.5F), (double)((float)var2 + 0.5F), (double)((float)var3 + 0.5F));
        var16.shootingEntity2 = this.shootingEntity2;
        var16.doesArrowBelongToPlayer = true;
        var16.setVelocity(this.motionX, this.motionY, this.motionZ);
        this.worldObj.spawnEntityInWorld(var16);
        var16.setDead();
    }

    /**
     * Called to update the entity's position/logic.
     */
    public void onUpdate()
    {
        super.onUpdate();

        if (this.prevRotationPitch == 0.0F && this.prevRotationYaw == 0.0F)
        {
            float var1 = MathHelper.sqrt_double(this.motionX * this.motionX + this.motionZ * this.motionZ);
            this.prevRotationYaw = this.rotationYaw = (float)(Math.atan2(this.motionX, this.motionZ) * 180.0D / Math.PI);
            this.prevRotationPitch = this.rotationPitch = (float)(Math.atan2(this.motionY, (double)var1) * 180.0D / Math.PI);
        }

        int var16 = this.worldObj.getBlockId(this.xTile, this.yTile, this.zTile);

        if (var16 > 0)
        {
            Block.blocksList[var16].setBlockBoundsBasedOnState(this.worldObj, this.xTile, this.yTile, this.zTile);
            AxisAlignedBB var2 = Block.blocksList[var16].getCollisionBoundingBoxFromPool(this.worldObj, this.xTile, this.yTile, this.zTile);

            if (var2 != null && var2.isVecInside(Vec3D.createVector(this.posX, this.posY, this.posZ)))
            {
                this.inGround = true;
            }
        }

        if (this.arrowShake > 0)
        {
            --this.arrowShake;
        }

        if (this.inGround)
        {
            int var18 = this.worldObj.getBlockId(this.xTile, this.yTile, this.zTile);
            int var19 = this.worldObj.getBlockMetadata(this.xTile, this.yTile, this.zTile);

            if (var18 == this.inTile && var19 == this.inData)
            {
                ++this.ticksInGround;

                if (this.ticksInGround == 1200)
                {
                    this.setDead();
                }
            }
            else
            {
                this.inGround = false;
                this.motionX *= (double)(this.rand.nextFloat() * 0.2F);
                this.motionY *= (double)(this.rand.nextFloat() * 0.2F);
                this.motionZ *= (double)(this.rand.nextFloat() * 0.2F);
                this.ticksInGround = 0;
                this.ticksInAir = 0;
            }
        }
        else
        {
            ++this.ticksInAir;
            Vec3D var17 = Vec3D.createVector(this.posX, this.posY, this.posZ);
            Vec3D var3 = Vec3D.createVector(this.posX + this.motionX, this.posY + this.motionY, this.posZ + this.motionZ);
            MovingObjectPosition var4 = this.worldObj.rayTraceBlocks_do_do(var17, var3, false, true);
            var17 = Vec3D.createVector(this.posX, this.posY, this.posZ);
            var3 = Vec3D.createVector(this.posX + this.motionX, this.posY + this.motionY, this.posZ + this.motionZ);

            if (var4 != null)
            {
                var3 = Vec3D.createVector(var4.hitVec.xCoord, var4.hitVec.yCoord, var4.hitVec.zCoord);

                if (isArrowRope && !this.inGround)
                {
                    this.hitGround((int)var4.hitVec.xCoord, (int)var4.hitVec.yCoord, (int)var4.hitVec.zCoord, var4);
                }
            }

            Entity var5 = null;
            List var6 = this.worldObj.getEntitiesWithinAABBExcludingEntity(this, this.boundingBox.addCoord(this.motionX, this.motionY, this.motionZ).expand(1.0D, 1.0D, 1.0D));
            double var7 = 0.0D;
            int var9;
            float var11;

            for (var9 = 0; var9 < var6.size(); ++var9)
            {
                Entity var10 = (Entity)var6.get(var9);

                if (var10.canBeCollidedWith() && (var10 != this.shootingEntity || this.ticksInAir >= 5))
                {
                    var11 = 0.3F;
                    AxisAlignedBB var12 = var10.boundingBox.expand((double)var11, (double)var11, (double)var11);
                    MovingObjectPosition var13 = var12.calculateIntercept(var17, var3);

                    if (var13 != null)
                    {
                        double var14 = var17.distanceTo(var13.hitVec);

                        if (var14 < var7 || var7 == 0.0D)
                        {
                            var5 = var10;
                            var7 = var14;
                        }
                    }
                }
            }

            if (var5 != null)
            {
                var4 = new MovingObjectPosition(var5);
            }

            float var20;

            if (var4 != null)
            {
                if (var4.entityHit != null)
                {
                    var20 = MathHelper.sqrt_double(this.motionX * this.motionX + this.motionY * this.motionY + this.motionZ * this.motionZ);
                    int var23 = (int)Math.ceil((double)var20 * this.damage);

                    if (this.arrowCritical)
                    {
                        var23 += this.rand.nextInt(var23 / 2 + 2);
                    }

                    DamageSource var21 = null;

                    if (this.shootingEntity == null)
                    {
                        var21 = DamageSource.causeThrownDamage(this, this);
                    }
                    else
                    {
                        var21 = DamageSource.causeThrownDamage(this, this.shootingEntity);
                    }

                    if (this.isBurning())
                    {
                        var4.entityHit.setFire(5);
                    }

                    if (var4.entityHit.attackEntityFrom(var21, var23))
                    {
                        if (var4.entityHit instanceof EntityLiving)
                        {
                            ++((EntityLiving)var4.entityHit).arrowHitTempCounter;

                            if (this.field_46027_au > 0)
                            {
                                float var24 = MathHelper.sqrt_double(this.motionX * this.motionX + this.motionZ * this.motionZ);

                                if (var24 > 0.0F)
                                {
                                    var4.entityHit.addVelocity(this.motionX * (double)this.field_46027_au * 0.6000000238418579D / (double)var24, 0.1D, this.motionZ * (double)this.field_46027_au * 0.6000000238418579D / (double)var24);
                                }
                            }
                        }

                        this.worldObj.playSoundAtEntity(this, "random.bowhit", 1.0F, 1.2F / (this.rand.nextFloat() * 0.2F + 0.9F));
                        this.setDead();
                    }
                    else
                    {
                        this.motionX *= -0.10000000149011612D;
                        this.motionY *= -0.10000000149011612D;
                        this.motionZ *= -0.10000000149011612D;
                        this.rotationYaw += 180.0F;
                        this.prevRotationYaw += 180.0F;
                        this.ticksInAir = 0;
                    }
                }
                else
                {
                    this.xTile = var4.blockX;
                    this.yTile = var4.blockY;
                    this.zTile = var4.blockZ;
                    this.inTile = this.worldObj.getBlockId(this.xTile, this.yTile, this.zTile);
                    this.inData = this.worldObj.getBlockMetadata(this.xTile, this.yTile, this.zTile);
                    this.motionX = (double)((float)(var4.hitVec.xCoord - this.posX));
                    this.motionY = (double)((float)(var4.hitVec.yCoord - this.posY));
                    this.motionZ = (double)((float)(var4.hitVec.zCoord - this.posZ));
                    var20 = MathHelper.sqrt_double(this.motionX * this.motionX + this.motionY * this.motionY + this.motionZ * this.motionZ);
                    this.posX -= this.motionX / (double)var20 * 0.05000000074505806D;
                    this.posY -= this.motionY / (double)var20 * 0.05000000074505806D;
                    this.posZ -= this.motionZ / (double)var20 * 0.05000000074505806D;
                    this.worldObj.playSoundAtEntity(this, "random.bowhit", 1.0F, 1.2F / (this.rand.nextFloat() * 0.2F + 0.9F));
                    this.inGround = true;
                    this.arrowShake = 7;
                    this.arrowCritical = false;
                }
            }

            if (this.arrowCritical)
            {
                for (var9 = 0; var9 < 4; ++var9)
                {
                    this.worldObj.spawnParticle("crit", this.posX + this.motionX * (double)var9 / 4.0D, this.posY + this.motionY * (double)var9 / 4.0D, this.posZ + this.motionZ * (double)var9 / 4.0D, -this.motionX, -this.motionY + 0.2D, -this.motionZ);
                }
            }

            this.posX += this.motionX;
            this.posY += this.motionY;
            this.posZ += this.motionZ;
            var20 = MathHelper.sqrt_double(this.motionX * this.motionX + this.motionZ * this.motionZ);
            this.rotationYaw = (float)(Math.atan2(this.motionX, this.motionZ) * 180.0D / Math.PI);

            for (this.rotationPitch = (float)(Math.atan2(this.motionY, (double)var20) * 180.0D / Math.PI); this.rotationPitch - this.prevRotationPitch < -180.0F; this.prevRotationPitch -= 360.0F)
            {
                ;
            }

            while (this.rotationPitch - this.prevRotationPitch >= 180.0F)
            {
                this.prevRotationPitch += 360.0F;
            }

            while (this.rotationYaw - this.prevRotationYaw < -180.0F)
            {
                this.prevRotationYaw -= 360.0F;
            }

            while (this.rotationYaw - this.prevRotationYaw >= 180.0F)
            {
                this.prevRotationYaw += 360.0F;
            }

            this.rotationPitch = this.prevRotationPitch + (this.rotationPitch - this.prevRotationPitch) * 0.2F;
            this.rotationYaw = this.prevRotationYaw + (this.rotationYaw - this.prevRotationYaw) * 0.2F;
            float var22 = 0.99F;
            var11 = 0.05F;

            if (this.isInWater())
            {
                for (int var25 = 0; var25 < 4; ++var25)
                {
                    float var26 = 0.25F;
                    this.worldObj.spawnParticle("bubble", this.posX - this.motionX * (double)var26, this.posY - this.motionY * (double)var26, this.posZ - this.motionZ * (double)var26, this.motionX, this.motionY, this.motionZ);
                }

                var22 = 0.8F;
            }

            this.motionX *= (double)var22;
            this.motionY *= (double)var22;
            this.motionZ *= (double)var22;
            this.motionY -= (double)var11;
            this.setPosition(this.posX, this.posY, this.posZ);
        }
    }

    /**
     * (abstract) Protected helper method to write subclass entity data to NBT.
     */
    public void writeEntityToNBT(NBTTagCompound var1)
    {
        var1.setShort("xTile", (short)this.xTile);
        var1.setShort("yTile", (short)this.yTile);
        var1.setShort("zTile", (short)this.zTile);
        var1.setByte("inTile", (byte)this.inTile);
        var1.setByte("inData", (byte)this.inData);
        var1.setByte("shake", (byte)this.arrowShake);
        var1.setByte("inGround", (byte)(this.inGround ? 1 : 0));
        var1.setBoolean("player", this.doesArrowBelongToPlayer);
        var1.setDouble("damage", this.damage);
        var1.setInteger("RopeCount", this.ropeCount);
    }

    /**
     * (abstract) Protected helper method to read subclass entity data from NBT.
     */
    public void readEntityFromNBT(NBTTagCompound var1)
    {
        this.ropeCount = var1.getInteger("RopeCount");
        this.xTile = var1.getShort("xTile");
        this.yTile = var1.getShort("yTile");
        this.zTile = var1.getShort("zTile");
        this.inTile = var1.getByte("inTile") & 255;
        this.inData = var1.getByte("inData") & 255;
        this.arrowShake = var1.getByte("shake") & 255;
        this.inGround = var1.getByte("inGround") == 1;
        this.doesArrowBelongToPlayer = var1.getBoolean("player");

        if (var1.hasKey("damage"))
        {
            this.damage = var1.getDouble("damage");
        }
    }

    /**
     * Called by a player entity when they collide with an entity
     */
    public void onCollideWithPlayer(EntityPlayer var1)
    {
        if (!this.worldObj.isRemote)
        {
            if (this.inGround && this.doesArrowBelongToPlayer && this.arrowShake <= 0 && var1.inventory.addItemStackToInventory(new ItemStack(Item.arrow, 1)))
            {
                this.worldObj.playSoundAtEntity(this, "random.pop", 0.2F, ((this.rand.nextFloat() - this.rand.nextFloat()) * 0.7F + 1.0F) * 2.0F);
                var1.onItemPickup(this, 1);
                this.setDead();
            }
        }
    }

    public float getShadowSize()
    {
        return 0.0F;
    }

    public void setDamage(double var1)
    {
        this.damage = var1;
    }

    public double getDamage()
    {
        return this.damage;
    }

    public void func_46023_b(int var1)
    {
        this.field_46027_au = var1;
    }

    /**
     * If returns false, the item will not inflict any damage against entities.
     */
    public boolean canAttackWithItem()
    {
        return false;
    }
}
