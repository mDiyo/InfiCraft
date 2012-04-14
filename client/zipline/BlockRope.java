package net.minecraft.src.zipline;
import net.minecraft.src.*;

public class BlockRope extends BlockTensile implements IZipline
{
    public BlockRope(int var1, int var2, Material var3, int var4)
    {
        super(var1, var2, var3, var4);
    }

    /**
     * Returns a bounding box from the pool of bounding boxes (this means this box can change after the pool has been
     * cleared to be reused)
     */
    public AxisAlignedBB getCollisionBoundingBoxFromPool(World var1, int var2, int var3, int var4)
    {
        if (ModCollision.updatingEntity instanceof EntityItem)
        {
            return null;
        }
        else
        {
            int var5 = var1.getBlockMetadata(var2, var3, var4);
            return (var5 & 12) == 12 ? null : ((var5 & 12) == 8 && isTensile(var1, var2, var3 - 1, var4) ? null : (ModCollision.updatingEntity instanceof IHandlebar ? null : (ModCollision.updatingEntity != null && ModCollision.updatingEntity.ridingEntity instanceof IHandlebar ? null : super.getCollisionBoundingBoxFromPool(var1, var2, var3, var4))));
        }
    }

    /**
     * Called whenever an entity is walking on top of this block. Args: world, x, y, z, entity
     */
    public void onEntityWalking(World var1, int var2, int var3, int var4, Entity var5)
    {
        this.handleCollision(var1, var2, var3, var4, var5, true);
    }

    /**
     * Triggered whenever an entity collides with this block (enters into the block). Args: world, x, y, z, entity
     */
    public void onEntityCollidedWithBlock(World var1, int var2, int var3, int var4, Entity var5)
    {
        this.handleCollision(var1, var2, var3, var4, var5, false);
    }

    public void handleCollision(World var1, int var2, int var3, int var4, Entity var5, boolean var6)
    {
        int var7 = var1.getBlockMetadata(var2, var3, var4);

        if ((var7 & 8) != 0 && ((var7 & 12) != 8 || isTensile(var1, var2, var3 - 1, var4)))
        {
            if (!var6)
            {
                if ((var7 & 12) == 8 && isTensile(var1, var2, var3 - 1, var4))
                {
                    var5.fallDistance = 0.0F;

                    if (var5.isSneaking())
                    {
                        var5.motionY = 0.081D;
                        var5.posY = var5.lastTickPosY;
                    }

                    switch (var7 & 3)
                    {
                        case 0:
                            if (var5.isSneaking())
                            {
                                var5.motionZ = ((double)var4 + 0.5D - var5.posZ) / 10.0D;
                            }
                            else if (var5.boundingBox.maxX > (double)var2 + 0.9D)
                            {
                                var5.setPosition((double)var2 + 0.9D - (double)var5.width / 2.0D, var5.boundingBox.minY <= (double)var3 + 0.9D ? var5.posY : (double)var3 + 1.5D + (double)var5.height, var5.posZ);
                                var5.motionX = 0.0D;
                                var5.motionY = 0.15D;
                            }

                            break;

                        case 1:
                            if (var5.isSneaking())
                            {
                                var5.motionX = ((double)var2 + 0.5D - var5.posX) / 10.0D;
                            }
                            else if (var5.boundingBox.maxZ > (double)var4 + 0.9D)
                            {
                                var5.setPosition(var5.posX, var5.boundingBox.minY <= (double)var3 + 0.9D ? var5.posY : (double)var3 + 1.5D + (double)var5.height, (double)var4 + 0.9D - (double)var5.width / 2.0D);
                                var5.motionZ = 0.0D;
                                var5.motionY = 0.15D;
                            }

                            break;

                        case 2:
                            if (var5.isSneaking())
                            {
                                var5.motionZ = ((double)var4 + 0.5D - var5.posZ) / 10.0D;
                            }
                            else if (var5.boundingBox.minX < (double)var2 + 0.1D)
                            {
                                var5.setPosition((double)var2 + 0.1D + (double)var5.width / 2.0D, var5.boundingBox.minY <= (double)var3 + 0.9D ? var5.posY : (double)var3 + 1.5D + (double)var5.height, var5.posZ);
                                var5.motionX = 0.0D;
                                var5.motionY = 0.15D;
                            }

                            break;

                        case 3:
                            if (var5.isSneaking())
                            {
                                var5.motionX = ((double)var2 + 0.5D - var5.posX) / 10.0D;
                            }
                            else if (var5.boundingBox.minZ < (double)var4 + 0.1D)
                            {
                                var5.setPosition(var5.posX, var5.boundingBox.minY <= (double)var3 + 0.9D ? var5.posY : (double)var3 + 1.5D + (double)var5.height, (double)var4 + 0.1D + (double)var5.width / 2.0D);
                                var5.motionZ = 0.0D;
                                var5.motionY = 0.15D;
                            }
                    }
                }
                else if ((var7 & 12) == 12)
                {
                    double var8 = var5.posX - (double)((float)var2 + 0.5F);
                    double var10 = var5.posZ - (double)((float)var4 + 0.5F);
                    double var12 = Math.sqrt(var8 * var8 + var10 * var10);
                    double var14 = (double)((var5.rotationYaw - 90.0F) / 180.0F * (float)Math.PI);
                    double var16 = Math.atan2(var10, var8);
                    boolean var18 = (var14 - var16 + 7.068584203720093D) % (Math.PI * 2D) < (Math.PI / 2D);
                    boolean var19 = var18 && var12 < 0.5D && (Math.abs(var5.motionX) > 0.01D || Math.abs(var5.motionZ) > 0.01D);

                    if (var5.isSneaking() || var18)
                    {
                        var5.fallDistance = 0.0F;

                        if (var5.motionY < -0.15D)
                        {
                            var5.motionY = -0.15D;
                        }
                    }

                    if (var5.isSneaking() || var19)
                    {
                        if (var5.isSneaking())
                        {
                            var5.motionY = 0.081D;
                            var5.posY = var5.lastTickPosY;
                        }

                        double var20 = Math.min(Math.abs(var16 - var14), 1.0D) * (double)(var16 <= var14 ? -1 : 1);

                        if (Math.abs(var16 - var14) < 0.03D)
                        {
                            var20 = 0.0D;
                        }

                        double var22 = (var14 - var16 <= 0.1D ? 0.0D : Math.cos(var16 - 0.1D) * 0.10000000149011612D) + (var14 - var16 <= 0.1D ? 0.0D : Math.cos(var16 - 0.1D) * 0.10000000149011612D);
                        double var24 = (var16 - var14 <= 0.1D ? 0.0D : Math.sin(var16 + 0.1D) * 0.10000000149011612D) + (var14 - var16 <= 0.1D ? 0.0D : Math.sin(var16 + 0.1D) * 0.10000000149011612D);

                        if (var12 >= 0.21D || !var19)
                        {
                            var20 = 0.0D;
                        }

                        var5.setPosition((double)((float)var2 + 0.5F) + Math.cos(var16 - var20) * Math.max(var12, 0.21D), var5.posY, (double)((float)var4 + 0.5F) + Math.sin(var16 - var20) * Math.max(var12, 0.21D));

                        if (var12 < 0.21D && var19)
                        {
                            var5.motionX *= 0.75D;
                            var5.motionY = 0.2D;
                            var5.motionZ *= 0.75D;
                            Float var26 = Float.valueOf((float)(var16 - var20) * 180.0F / (float)Math.PI + 90.0F);
                            Float var27 = Float.valueOf((var26.floatValue() - var5.rotationYaw + 720.0F + 720.0F) % 360.0F - 180.0F);

                            if (Math.abs(var27.floatValue()) > 160.0F)
                            {
                                var26 = Float.valueOf(var5.rotationYaw);
                            }

                            var5.rotationYaw = var26.floatValue();
                        }
                    }
                }

                if (var5 instanceof EntityPlayer && var5.lastTickPosY % 1.0D < 0.5D && var5.posY % 1.0D > 0.5D)
                {
                    var1.playSoundAtEntity(var5, this.stepSound.getBreakSound(), this.stepSound.getVolume() * 0.5F, this.stepSound.getPitch() * 0.75F);
                }
            }
        }
    }

    public boolean mountZipline(ItemStack var1, EntityLiving var2, World var3, int var4, int var5, int var6, int var7)
    {
        if (var3.getBlockMaterial(var4, var5 - 1, var6) == Material.air && var3.getBlockMaterial(var4, var5 - 2, var6) == Material.air)
        {
            int var8 = var3.getBlockMetadata(var4, var5, var6);

            if ((var8 & 12) == 12)
            {
                return false;
            }
            else
            {
                EntityHandlebar var9 = new EntityHandlebar(var3, (double)var4 + 0.5D, (double)var5 + 0.5D, (double)var6 + 0.5D, var2);
                var9.setPosition((double)var4 + 0.5D, (double)var5 + 0.5D - (double)var9.height, (double)var6 + 0.5D);
                double var10 = (double)var4 - var2.posX;
                double var12 = (double)var5 - var2.boundingBox.minY - 0.5D;
                double var14 = (double)var6 - var2.posZ;
                var9.motionX = var2.motionX;
                var9.motionZ = var2.motionZ;
                double var16 = (double)MathHelper.sqrt_double(var10 * var10 + var12 * var12 + var14 * var14);

                if (var16 < 4.0D)
                {
                    var9.owner = var2;
                    var3.spawnEntityInWorld(var9);
                    var2.mountEntity(var9);
                    --var1.stackSize;

                    if (var2 instanceof EntityPlayer)
                    {
                        ((EntityPlayer)var2).triggerAchievement(mod_Zipline.achievementRideZipline);
                    }

                    return true;
                }
                else
                {
                    return false;
                }
            }
        }
        else
        {
            return false;
        }
    }

    public double getZiplineFriction(Entity var1, World var2, int var3, int var4, int var5, int var6)
    {
        double var7 = var1.motionX * var1.motionX + var1.motionZ * var1.motionZ;
        return var7 == 0.0D ? 1.0D : 1.0D - 0.015D * Math.min(1.0D, 1.0D / var7);
    }

    public Vec3D getZiplineMotion(Entity var1, World var2, int var3, int var4, int var5, int var6)
    {
        IHandlebar var7 = (IHandlebar)var1;

        if ((var6 & 12) != 12 && ((var6 & 12) != 8 || !isTensile(var2, var3, var4 - 1, var5)))
        {
            boolean var8 = (var6 & 1) == 0;
            int var9 = var8 ? 1 : 0;
            int var10 = var8 ? 0 : 1;
            int var11 = (getTensileMetadata(var2, var3 + var9, var4, var5 + var10, isTensile(var2, var3 + var9, var4 + 1, var5 + var10) ? 6 : 0) & 6) >> 1;
            int var12 = (getTensileMetadata(var2, var3 - var9, var4, var5 - var10, isTensile(var2, var3 - var9, var4 + 1, var5 - var10) ? 6 : 0) & 6) >> 1;

            if ((var6 & 8) == 0)
            {
                if (var11 <= var12)
                {
                    var12 = (var6 & 6) >> 1;
                }

                if (var11 >= var12)
                {
                    var11 = (var6 & 6) >> 1;
                }
            }

            Vec3D var13 = null;
            double var14 = heights[var11] - heights[var12];

            if (var14 == 0.0D)
            {
                var13 = Vec3D.createVector(0.0D, 0.0D, 0.0D);
            }
            else
            {
                double var16 = Math.min(heights[var11], heights[var12]);
                double var18 = 0.05D * Math.max(0.0D, var1.posY + (double)var1.height - (double)var4 - var16) * (double)(var14 <= 0.0D ? -1 : 1);
                var13 = Vec3D.createVector((double)(-var9) * var18, 0.0D, (double)(-var10) * var18);
            }

            return var13;
        }
        else
        {
            if (var7 != null)
            {
                var7.dismount();
            }

            return null;
        }
    }

    public void conformToZipline(Entity var1, World var2, int var3, int var4, int var5, int var6)
    {
        if ((var6 & 12) != 12 && ((var6 & 12) != 8 || !isTensile(var2, var3, var4 - 1, var5)))
        {
            boolean var7 = (var6 & 1) == 0;
            int var8 = var7 ? 1 : 0;
            int var9 = var7 ? 0 : 1;
            int var10 = (getTensileMetadata(var2, var3 + var8, var4, var5 + var9, isTensile(var2, var3 + var8, var4 + 1, var5 + var9) ? 6 : 0) & 6) >> 1;
            int var11 = (getTensileMetadata(var2, var3 - var8, var4, var5 - var9, isTensile(var2, var3 - var8, var4 + 1, var5 - var9) ? 6 : 0) & 6) >> 1;

            if ((var6 & 8) == 0)
            {
                if (var10 <= var11)
                {
                    var11 = (var6 & 6) >> 1;
                }

                if (var10 >= var11)
                {
                    var10 = (var6 & 6) >> 1;
                }
            }

            double var12 = var7 ? var1.posX : var1.posZ;
            double var14 = heights[var10] - heights[var11];
            double var16 = heights[var11] + (double)var4 - (double)(var7 ? var3 : var5) * var14;
            var1.posY = var12 * var14 + var16 - (double)var1.height;

            if (var7)
            {
                var1.posZ = (double)var5 + 0.5D;
                var1.motionZ = 0.0D;
            }
            else
            {
                var1.posX = (double)var3 + 0.5D;
                var1.motionX = 0.0D;
            }
        }
    }

    public StepSound getStepSound(Entity var1, World var2, int var3, int var4, int var5, int var6)
    {
        return this.stepSound;
    }
}
