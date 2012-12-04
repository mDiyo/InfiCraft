package bastion.blocks;
import net.minecraft.src.*;

import java.util.ArrayList;
import java.util.Random;
import org.lwjgl.opengl.GL11;

public class BlockTensile extends Block implements ITensile
{
    public static float swingPosition = 0.0F;
    public static float swingAmplitude = 0.0F;
    public static float swingDecay = 0.9F;
    public double[] crossPieces = new double[] {0.5D};
    public static boolean fallInstantly = false;
    public static int renderType;
    public static double[] heights = new double[] {0.125D, 0.375D, 0.625D, 1.125D};
    public double pixelsWide = 2.0D;
    public double pixelsHigh = 2.0D;
    public double boundingWidth = 0.25D;
    public double boundingHeight = 0.25D;

    public BlockTensile(int var1, int var2, Material var3, int var4)
    {
        super(var1, var2, var3);
        renderType = var4;
    }

    /**
     * Is this block (a) opaque and (b) a full 1m cube?  This determines whether or not to render the shared face of two
     * adjacent blocks and also whether the player can attach torches, redstone wire, etc to this block.
     */
    public boolean isOpaqueCube()
    {
        return false;
    }

    /**
     * Checks to see if its valid to put this block at the specified coordinates. Args: world, x, y, z
     */
    public boolean canPlaceBlockAt(World var1, int var2, int var3, int var4)
    {
        return super.canPlaceBlockAt(var1, var2, var3, var4) && !var1.getBlockMaterial(var2, var3, var4).isLiquid();
    }

    /**
     * If this block doesn't render as an ordinary block it will return False (examples: signs, buttons, stairs, etc)
     */
    public boolean renderAsNormalBlock()
    {
        return false;
    }

    /**
     * The type of render function that is called for this block
     */
    public int getRenderType()
    {
        return renderType;
    }

    /**
     * How many world ticks before ticking
     */
    public int tickRate()
    {
        return 3;
    }

    /**
     * Ticks the block if it's been scheduled
     */
    public void updateTick(World var1, int var2, int var3, int var4, Random var5)
    {
        if (this.tryToFall(var1, var2, var3, var4) && this.tryToLift(var1, var2, var3, var4))
        {
            this.updateMetadata(var1, var2, var3, var4);
        }
    }

    /**
     * Called when a block is placed by using an ItemStack from inventory and passed in who placed it. Args:
     * x,y,z,entityliving
     */
    public void onBlockPlacedBy(World var1, int var2, int var3, int var4, EntityLiving var5)
    {
        int var6 = MathHelper.floor_double((double)(var5.rotationYaw * 4.0F / 360.0F) + 0.5D) & 3;
        byte var7 = 0;

        if (var6 == 0 || var6 == 2)
        {
            var7 = 1;
        }

        if (var6 == 1 || var6 == 3)
        {
            var7 = 0;
        }

        var1.setBlockMetadataWithNotify(var2, var3, var4, var7);
        var1.notifyBlocksOfNeighborChange(var2, var3 + 1, var4, this.blockID);
        var1.notifyBlocksOfNeighborChange(var2, var3, var4, this.blockID);
        var1.notifyBlocksOfNeighborChange(var2, var3 - 1, var4, this.blockID);
    }

    /**
     * Called when the block is clicked by a player. Args: x, y, z, entityPlayer
     */
    public void onBlockClicked(World var1, int var2, int var3, int var4, EntityPlayer var5)
    {
        this.updateTick(var1, var2, var3, var4, (Random)null);
        var1.scheduleBlockUpdate(var2, var3, var4, this.blockID, this.tickRate());
    }

    /**
     * Called upon block activation (left or right click on the block.). The three integers represent x,y,z of the
     * block.
     */
    public boolean blockActivated(World var1, int var2, int var3, int var4, EntityPlayer var5)
    {
        if (var1.isRemote)
        {
            return true;
        }
        else if (var5.ridingEntity != null)
        {
            var5.mountEntity(var5.ridingEntity);
            return true;
        }
        else
        {
            return false;
        }
    }

    /**
     * Called whenever the block is removed.
     */
    public void onBlockRemoval(World var1, int var2, int var3, int var4)
    {
        var1.notifyBlocksOfNeighborChange(var2, var3 + 1, var4, this.blockID);
        var1.notifyBlocksOfNeighborChange(var2, var3, var4, this.blockID);
        var1.notifyBlocksOfNeighborChange(var2, var3 - 1, var4, this.blockID);
    }

    /**
     * Lets the block know when one of its neighbor changes. Doesn't know which neighbor changed (coordinates passed are
     * their own) Args: x, y, z, neighbor blockID
     */
    public void onNeighborBlockChange(World var1, int var2, int var3, int var4, int var5)
    {
        var1.scheduleBlockUpdate(var2, var3, var4, this.blockID, this.tickRate());
    }

    /**
     * Triggered whenever an entity collides with this block (enters into the block). Args: world, x, y, z, entity
     */
    public void onEntityCollidedWithBlock(World var1, int var2, int var3, int var4, Entity var5) {}

    /**
     * Adds to the supplied array any colliding bounding boxes with the passed in bounding box. Args: world, x, y, z,
     * axisAlignedBB, arrayList
     */
    /*public void getCollidingBoundingBoxes(World var1, int var2, int var3, int var4, AxisAlignedBB var5, ArrayList var6)
    {
        int var7 = var1.getBlockMetadata(var2, var3, var4);
        int var8 = var7 & 3;
        float var9 = (float)(0.5D - this.boundingWidth / 2.0D);
        float var10 = (float)(0.5D + this.boundingWidth / 2.0D);
        float var11 = 1.0F;

        if ((var7 & 12) == 8)
        {
            float var12 = (float)(0.5D - this.boundingHeight / 2.0D);
            float var13 = (float)(0.5D + this.boundingHeight / 2.0D);
            boolean var14 = isTensile(var1, var2, var3 - 1, var4);

            if (var8 == 0)
            {
                this.setBlockBounds(var14 ? var12 : 0.0F, 0.0F, var9, 0.5F, 0.5F, var10);
                super.getCollidingBoundingBoxes(var1, var2, var3, var4, var5, var6);
                this.setBlockBounds(0.5F, 0.0F, var9, 1.0F, var11, var10);
                super.getCollidingBoundingBoxes(var1, var2, var3, var4, var5, var6);
            }
            else if (var8 == 1)
            {
                this.setBlockBounds(var9, 0.0F, var14 ? var12 : 0.0F, var10, 0.5F, 0.5F);
                super.getCollidingBoundingBoxes(var1, var2, var3, var4, var5, var6);
                this.setBlockBounds(var9, 0.0F, 0.5F, var10, var11, 1.0F);
                super.getCollidingBoundingBoxes(var1, var2, var3, var4, var5, var6);
            }
            else if (var8 == 2)
            {
                this.setBlockBounds(0.0F, 0.0F, var9, 0.5F, var11, var10);
                super.getCollidingBoundingBoxes(var1, var2, var3, var4, var5, var6);
                this.setBlockBounds(0.5F, 0.0F, var9, var14 ? var13 : 1.0F, 0.5F, var10);
                super.getCollidingBoundingBoxes(var1, var2, var3, var4, var5, var6);
            }
            else if (var8 == 3)
            {
                this.setBlockBounds(var9, 0.0F, 0.0F, var10, var11, 0.5F);
                super.getCollidingBoundingBoxes(var1, var2, var3, var4, var5, var6);
                this.setBlockBounds(var9, 0.0F, 0.5F, var10, 0.5F, var14 ? var13 : 1.0F);
                super.getCollidingBoundingBoxes(var1, var2, var3, var4, var5, var6);
            }

            this.setBlockBoundsBasedOnState(var1, var2, var3, var4);
        }
        else
        {
            this.setBlockBoundsBasedOnState(var1, var2, var3, var4);
            super.getCollidingBoundingBoxes(var1, var2, var3, var4, var5, var6);
        }
    }*/

    public void updateMetadata(World var1, int var2, int var3, int var4)
    {
        int var5 = var1.getBlockMetadata(var2, var3, var4);
        int var6;

        if (isTensile(var1, var2, var3 + 1, var4))
        {
            var6 = 12 | var5 & 3;
        }
        else
        {
            int var7 = var5 & 3;
            boolean var8 = (var7 & 1) == 0;
            int var9 = var8 ? 1 : 0;
            int var10 = var8 ? 0 : 1;
            boolean var11 = isTensile(var1, var2 + var9, var3 + 1, var4 + var10);
            boolean var12 = isTensile(var1, var2 - var9, var3 + 1, var4 - var10);
            boolean var13 = isTensile(var1, var2 + var9, var3, var4 + var10);
            boolean var14 = isTensile(var1, var2 - var9, var3, var4 - var10);
            isTensile(var1, var2 + var9, var3 - 1, var4 + var10);
            isTensile(var1, var2 - var9, var3 - 1, var4 - var10);

            if (!var11 && !var12)
            {
                int var17 = getTensileMetadata(var1, var2 + var9, var3, var4 + var10, isTensile(var1, var2 + var9, var3 + 1, var4 + var10) ? 6 : 0);
                int var18 = getTensileMetadata(var1, var2 - var9, var3, var4 - var10, isTensile(var1, var2 - var9, var3 + 1, var4 - var10) ? 6 : 0);
                int var19 = Math.max(var17 & 6, var18 & 6) >> 1;
                int var20 = Math.max(var19 - 1, 0);
                var6 = var5 & -7 | var20 << 1;
                var6 &= -9;
            }
            else if ((!var11 || !var14) && (!var12 || !var13) && (!var11 || !var12))
            {
                var6 = var5 | 8;
                var6 &= -5;

                if (var12)
                {
                    var6 |= 2;
                }
                else
                {
                    var6 &= -3;
                }
            }
            else
            {
                var6 = var5 | 6;
                var6 &= -9;
            }
        }

        if (var6 != var5)
        {
            var1.setBlockMetadata(var2, var3, var4, var6);
            var1.notifyBlocksOfNeighborChange(var2, var3 - 1, var4, this.blockID);
            var1.notifyBlocksOfNeighborChange(var2, var3, var4, this.blockID);
            var1.notifyBlocksOfNeighborChange(var2, var3 + 1, var4, this.blockID);
            //var1.markBlocksDirty(var2, var3, var4, var2, var3, var4);
            var1.scheduleBlockUpdate(var2, var3, var4, this.blockID, this.tickRate());
        }
    }

    public boolean tryToLift(World var1, int var2, int var3, int var4)
    {
        int var5 = var1.getBlockMetadata(var2, var3, var4);
        boolean var6 = (var5 & 1) == 0;
        int var7 = var6 ? 1 : 0;
        int var8 = var6 ? 0 : 1;
        int var9 = getTensileMetadata(var1, var2 - var7, var3, var4 - var8, isTensile(var1, var2 - var7, var3 + 1, var4 - var8) ? 6 : 0);
        int var10 = getTensileMetadata(var1, var2 + var7, var3, var4 + var8, isTensile(var1, var2 + var7, var3 + 1, var4 + var8) ? 6 : 0);

        if (((var9 & 8) == 8 || (var9 & 14) == 6) && ((var10 & 8) == 8 || (var10 & 14) == 6) && (var1.getBlockId(var2 - var7, var3, var4 - var8) != 0 || var1.getBlockId(var2 + var7, var3, var4 + var8) != 0) && (isTensile(var1, var2 - var7, var3 + 1, var4 - var8) || isTensile(var1, var2 + var7, var3 + 1, var4 + var8)))
        {
            if (var1.getBlockId(var2, var3 + 1, var4) != 0)
            {
                var1.setBlockWithNotify(var2, var3, var4, 0);
                this.dropBlockAsItem(var1, var2, var3, var4, var5, 0);
                return false;
            }
            else
            {
                var1.getBlockMetadata(var2, var3, var4);
                var1.setBlockWithNotify(var2, var3, var4, 0);
                var1.setBlockWithNotify(var2, var3 + 1, var4, this.blockID);
                int var12 = var6 ? 0 : 1;
                var1.setBlockMetadata(var2, var3 + 1, var4, var12);
                var1.scheduleBlockUpdate(var2, var3 + 1, var4, this.blockID, this.tickRate());
                return false;
            }
        }
        else
        {
            return true;
        }
    }

    public boolean tryToFall(World var1, int var2, int var3, int var4)
    {
        if (isTensile(var1, var2, var3 + 1, var4))
        {
            return true;
        }
        else if (var3 > 0 && canFall(var1, var2, var3, var4))
        {
            int var5 = var1.getBlockMetadata(var2, var3, var4);
            boolean var6 = (var5 & 1) == 0;
            int var7 = var6 ? 1 : 0;
            int var8 = var6 ? 0 : 1;
            byte var9 = 0;

            if (isTensile(var1, var2 + var7, var3 + 1, var4 + var8))
            {
                if (var1.getBlockId(var2 + var7, var3, var4 + var8) != 0 && !isTensile(var1, var2 + var7, var3, var4 + var8) || isTensile(var1, var2 - var7, var3 + 1, var4 - var8) || isTensile(var1, var2 - var7, var3, var4 - var8) || isTensile(var1, var2 - var7, var3 - 1, var4 - var8))
                {
                    return true;
                }

                var9 = 1;
            }

            if (isTensile(var1, var2 - var7, var3 + 1, var4 - var8))
            {
                if (var1.getBlockId(var2 - var7, var3, var4 - var8) != 0 && !isTensile(var1, var2 - var7, var3, var4 - var8) || isTensile(var1, var2 + var7, var3 + 1, var4 + var8) || isTensile(var1, var2 + var7, var3, var4 + var8) || isTensile(var1, var2 + var7, var3 - 1, var4 + var8))
                {
                    return true;
                }

                var9 = -1;
            }

            if (isTensile(var1, var2 + var7, var3, var4 + var8) && isTensile(var1, var2 + var7 * 2, var3 + 1, var4 + var8 * 2) && isTensile(var1, var2 - var7, var3 - 1, var4 - var8))
            {
                return true;
            }
            else if (isTensile(var1, var2 - var7, var3, var4 - var8) && isTensile(var1, var2 - var7 * 2, var3 + 1, var4 - var8 * 2) && isTensile(var1, var2 + var7, var3 - 1, var4 + var8))
            {
                return true;
            }
            else
            {
                int var10 = getTensileMetadata(var1, var2 + var7, var3, var4 + var8, -1);
                int var11 = getTensileMetadata(var1, var2 - var7, var3, var4 - var8, -1);

                if (var10 != -1 && var11 != -1)
                {
                    if ((var10 & 6) != 0)
                    {
                        return true;
                    }

                    if ((var11 & 6) != 0)
                    {
                        return true;
                    }

                    if (var1.getBlockId(var2 + var7, var3 - 1, var4 + var8) != 0 || var1.getBlockId(var2 - var7, var3 - 1, var4 - var8) != 0)
                    {
                        return true;
                    }
                }

                int var12 = var1.getBlockMetadata(var2, var3, var4);

                if (var9 != 0)
                {
                    if (var1.getBlockId(var2 + var7 * var9, var3, var4 + var8 * var9) == 0)
                    {
                        var1.setBlockWithNotify(var2, var3, var4, 0);
                        var2 += var7 * var9;
                        var4 += var8 * var9;
                        var1.setBlockWithNotify(var2, var3, var4, this.blockID);
                        var1.setBlockMetadata(var2, var3, var4, var12 | 12);
                        this.updateMetadata(var1, var2, var3, var4);
                        var1.scheduleBlockUpdate(var2, var3, var4, this.blockID, this.tickRate());
                        return false;
                    }

                    if (var1.getBlockId(var2 + var7 * var9, var3 - 1, var4 + var8 * var9) == 0)
                    {
                        var1.setBlockWithNotify(var2, var3, var4, 0);
                        var2 += var7 * var9;
                        var4 += var8 * var9;
                        var1.setBlockWithNotify(var2, var3 - 1, var4, this.blockID);
                        var1.setBlockMetadata(var2, var3 - 1, var4, var12 | 12);
                        this.updateMetadata(var1, var2, var3 - 1, var4);
                        var1.scheduleBlockUpdate(var2, var3 - 1, var4, this.blockID, this.tickRate());
                        return false;
                    }
                }

                int var13;

                if (var1.getBlockMaterial(var2, var3 - 1, var4) == Material.air)
                {
                    var1.setBlockWithNotify(var2, var3, var4, 0);
                    var1.setBlockWithNotify(var2, var3 - 1, var4, this.blockID);
                    var13 = (var12 & 8) != 0 ? var12 : var12 | 6;
                    var1.setBlockMetadata(var2, var3 - 1, var4, var13);
                    var1.scheduleBlockUpdate(var2, var3 - 1, var4, this.blockID, this.tickRate());
                    return false;
                }
                else if (!isTensile(var1, var2, var3 - 1, var4))
                {
                    var1.setBlockWithNotify(var2, var3, var4, 0);
                    this.dropBlockAsItem(var1, var2, var3, var4, var12, 0);
                    return false;
                }
                else
                {
                    var1.setBlockWithNotify(var2, var3, var4, 0);
                    Block.blocksList[var1.getBlockId(var2, var3 - 1, var4)].dropBlockAsItem(var1, var2, var3 - 1, var4, var1.getBlockMetadata(var2, var3 - 1, var4), 0);
                    var1.setBlockWithNotify(var2, var3 - 1, var4, this.blockID);
                    var13 = (var12 & 12) != 0 ? var12 : var12 | 6;
                    var1.setBlockMetadata(var2, var3 - 1, var4, var13);
                    var1.scheduleBlockUpdate(var2, var3 - 1, var4, this.blockID, this.tickRate());
                    return false;
                }
            }
        }
        else
        {
            return true;
        }
    }

    public static boolean canFall(World var0, int var1, int var2, int var3)
    {
        Material var4 = var0.getBlockMaterial(var1, var2 - 1, var3);
        return var4 == Material.air || isTensile(var0, var1, var2 - 1, var3) || var4 == Material.water || var4 == Material.lava || var4 == Material.fire;
    }

    /**
     * Updates the blocks bounds based on its current state. Args: world, x, y, z
     */
    public void setBlockBoundsBasedOnState(IBlockAccess var1, int var2, int var3, int var4)
    {
        int var5 = var1.getBlockMetadata(var2, var3, var4);
        int var6 = var5 & 3;
        float var7 = (float)(0.5D - this.boundingWidth / 2.0D);
        float var8 = (float)(0.5D + this.boundingWidth / 2.0D);
        float var9 = (float)(0.5D - this.boundingHeight / 2.0D);
        float var10 = (float)(0.5D + this.boundingHeight / 2.0D);
        float var11 = 1.0F;
        boolean var12;

        if ((var5 & 12) == 12)
        {
            var12 = (var5 & 1) == 1;

            if (var12)
            {
                this.setBlockBounds(var7, 0.0F, var9, var8, 1.0F, var10);
            }
            else
            {
                this.setBlockBounds(var9, 0.0F, var7, var10, 1.0F, var8);
            }
        }
        else if ((var5 & 12) == 8)
        {
            var12 = isTensile(var1, var2, var3 - 1, var4);

            if (var6 == 0)
            {
                this.setBlockBounds(var12 ? var9 : 0.0F, 0.0F, var7, 1.0F, var11, var8);
            }
            else if (var6 == 1)
            {
                this.setBlockBounds(var7, 0.0F, var12 ? var9 : 0.0F, var8, var11, 1.0F);
            }
            else if (var6 == 2)
            {
                this.setBlockBounds(0.0F, 0.0F, var7, var12 ? var10 : 1.0F, var11, var8);
            }
            else if (var6 == 3)
            {
                this.setBlockBounds(var7, 0.0F, 0.0F, var8, var11, var12 ? var10 : 1.0F);
            }
        }
        else
        {
            int var16 = var5 & 1;
            int var13 = (var5 & 6) >> 1;
            float var14 = var13 != 3 ? (var13 != 2 ? 0.0F : 0.125F) : 0.5F;
            float var15 = var13 != 3 ? (var13 != 2 ? (var13 != 0 ? 0.5F : 0.25F) : 0.5F) : 1.0F;

            if (var16 == 0)
            {
                this.setBlockBounds(0.0F, var14, var7, 1.0F, var15, var8);
            }
            else
            {
                this.setBlockBounds(var7, var14, 0.0F, var8, var15, 1.0F);
            }
        }
    }

    public void drawTensile(int var1, int var2, int var3, double var4, double var6, double var8, double var10, double var12, double var14, int var16, int var17, int var18, int var19, double var20)
    {
        Tessellator var22 = Tessellator.instance;
        ModModel var23 = new ModModel(var1, var2, var3, var16);
        double var24 = var20 * (double)(var17 != 0 ? 0 : 1);
        double var26 = var20 * (double)(var17 != 1 ? 0 : 1);
        double var28 = var20 * (double)(var17 != 2 ? 0 : 1);
        double var30 = var20 * (double)(var18 != 0 ? 0 : 1);
        double var32 = var20 * (double)(var18 != 1 ? 0 : 1);
        double var34 = var20 * (double)(var18 != 2 ? 0 : 1);
        double var36 = 0.0D;
        double var38 = 0.0D;

        if (var6 > 1.0D && var12 > 1.0D && (var19 & 1) == 1)
        {
            var36 = -0.5D;
        }

        var23.addVertexWithUV(var4 + var24, var6 + var26, var8 + var28, var19, var36, var38);
        var23.addVertexWithUV(var4 - var24, var6 - var26, var8 - var28, var19, var36, var38);
        var23.addVertexWithUV(var10 - var30, var12 - var32, var14 - var34, var19, var36, var38);
        var23.addVertexWithUV(var10 + var30, var12 + var32, var14 + var34, var19, var36, var38);
        var23.render(false);
        var23.render(true, true);
    }

    public static int getTensileMetadata(IBlockAccess var0, int var1, int var2, int var3)
    {
        return getTensileMetadata(var0, var1, var2, var3, -1);
    }

    public static int getTensileMetadata(IBlockAccess var0, int var1, int var2, int var3, int var4)
    {
        return !(Block.blocksList[var0.getBlockId(var1, var2, var3)] instanceof ITensile) ? var4 : var0.getBlockMetadata(var1, var2, var3);
    }

    public static boolean isTensile(IBlockAccess var0, int var1, int var2, int var3)
    {
        return Block.blocksList[var0.getBlockId(var1, var2, var3)] instanceof ITensile;
    }

    public void render(int var1, int var2, int var3, int var4, IBlockAccess var5, RenderBlocks var6)
    {
        double[] var7 = heights;
        int var8 = this.getBlockTextureFromSideAndMetadata(0, var1);

        if (var6.overrideBlockTexture >= 0)
        {
            var8 = var6.overrideBlockTexture;
        }

        boolean var9 = (var1 & 1) == 0;
        byte var14;
        byte var15;
        double var17;
        byte var16;

        if ((var1 & 12) == 12)
        {
            boolean var24 = isTensile(var5, var9 ? var2 + 1 : var2, var3 - 1, var9 ? var4 : var4 + 1);
            boolean var23 = isTensile(var5, var9 ? var2 - 1 : var2, var3 - 1, var9 ? var4 : var4 - 1);
            double var25 = var24 ? 1.0D : (var23 ? 0.0D : 0.5D);
            var14 = (byte)(var9 ? 0 : 2);
            var15 = !var24 && !var23 ? var14 : 1;
            var16 = (byte)(var9 ? 2 : 0);
            var17 = !var24 && !var23 ? 0.0D : var7[0];
            this.drawTensile(var2, var3, var4, 0.5D, 1.0D, 0.5D, var9 ? var25 : 0.5D, var17, var9 ? 0.5D : var25, var8, var16, var16, var9 ? 17 : 1, this.pixelsWide / 32.0D);

            for (int var27 = 0; var27 < this.crossPieces.length; ++var27)
            {
                this.drawTensile(var2, var3, var4, var9 ? 0.5D : this.crossPieces[var27], 1.0D, var9 ? this.crossPieces[var27] : 0.5D, var9 ? var25 : this.crossPieces[var27], var17, var9 ? this.crossPieces[var27] : var25, var8, var14, var15, var9 ? 1 : 17, this.pixelsHigh / 32.0D);
            }
        }
        else
        {
            int var10 = var9 ? 1 : 0;
            int var11 = var9 ? 0 : 1;
            int var12 = ((isTensile(var5, var2 + var10, var3 + 1, var4 + var11) ? 6 : getTensileMetadata(var5, var2 + var10, var3, var4 + var11, 0)) & 6) >> 1;
            int var13 = ((isTensile(var5, var2 - var10, var3 + 1, var4 - var11) ? 6 : getTensileMetadata(var5, var2 - var10, var3, var4 - var11, 0)) & 6) >> 1;
            var14 = (byte)(var9 ? 2 : 0);
            var15 = 1;
            var16 = 1;
            var17 = 0.0D;
            double var19 = 1.0D;
            boolean var21 = false;

            if ((var1 & 8) == 0)
            {
                if (var12 <= var13)
                {
                    var13 = (var1 & 6) >> 1;
                }

                if (var12 >= var13)
                {
                    var12 = (var1 & 6) >> 1;
                }

                if (var12 == 3 && var13 == 3)
                {
                    if (isTensile(var5, var2 + var10, var3 + 1, var4 + var11))
                    {
                        var13 = 2;
                    }
                    else
                    {
                        var12 = 2;
                    }
                }
            }
            else
            {
                byte var22 = (byte)(var12 >= var13 ? -1 : 1);

                if (isTensile(var5, var2, var3 - 1, var4) && !isTensile(var5, var2 + var10 * var22, var3 - 1, var4 + var11 * var22))
                {
                    var7 = (double[])((double[])var7.clone());
                    var7[0] = 0.0D;

                    if (var12 < var13)
                    {
                        var12 = 0;
                        var19 = 0.5D;
                        var21 = true;
                        var16 = (byte)(var9 ? 0 : 2);
                    }

                    if (var12 > var13)
                    {
                        var17 = 0.5D;
                        var13 = 0;
                        var21 = true;
                        var15 = (byte)(var9 ? 0 : 2);
                    }
                }
            }

            this.drawTensile(var2, var3, var4, var9 ? var17 : 0.5D, var7[var13], var9 ? 0.5D : var17, var9 ? var19 : 0.5D, var7[var12], var9 ? 0.5D : var19, var8, var14, var14, var21 ? (var9 ? 17 : 1) : (var9 ? 16 : 2), this.pixelsWide / 32.0D);

            for (int var26 = 0; var26 < this.crossPieces.length; ++var26)
            {
                this.drawTensile(var2, var3, var4, var9 ? var17 : this.crossPieces[var26], var7[var13], var9 ? this.crossPieces[var26] : var17, var9 ? var19 : this.crossPieces[var26], var7[var12], var9 ? this.crossPieces[var26] : var19, var8, var15, var16, var21 ? (var9 ? 1 : 17) : (var9 ? 8 : 10), this.pixelsHigh / 32.0D);
            }
        }
    }

    public void modifyCamera(Entity var1, int var2, int var3, int var4, int var5, float var6)
    {
        World var7 = var1.worldObj;
        int var8 = var7.getBlockMetadata(var3, var4, var5);
        float var9 = 25.0F;
        swingDecay = 0.9F;

        if ((var8 & 8) != 0 && ((var8 & 12) != 8 || isTensile(var7, var3, var4 - 1, var5)))
        {
            swingAmplitude = 0.0F;
        }
        else if (var1.boundingBox.minY > (double)var4 + 0.1D && var7.getBlockId(var3, var4 - 1, var5) == 0 && !isTensile(var7, var3, var4 - 1, var5))
        {
            if (var1.onGround)
            {
                var9 = 3.0F;
                swingDecay = 0.94F;
            }
        }
        else
        {
            swingAmplitude = 0.0F;
        }

        boolean var10 = (var8 & 1) == 0;
        float var11 = (float)Math.sin((double)System.currentTimeMillis() / 250.0D) * 11.0F * swingAmplitude;
        swingPosition += (var11 - swingPosition) / var9;
        double var12 = (double)(var1.rotationYaw + (var10 ? 0.0F : 90.0F)) / 180.0D * Math.PI;
        GL11.glRotatef(swingPosition, (float)Math.cos(var12), -((float)Math.sin(var12)), (float)Math.sin(var12));
    }
}
