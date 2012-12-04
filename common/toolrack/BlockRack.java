package net.minecraft.src;

import java.util.List;

public class BlockRack extends BlockContainer
{
    protected int modelID;

    protected BlockRack(int var1, Block var2)
    {
        super(var1, var2.blockIndexInTexture, var2.blockMaterial);
        this.blockHardness = var2.blockHardness;
        this.blockResistance = var2.blockResistance;
        this.setCreativeTab(CreativeTabs.tabDeco);
    }

    public void setRenderer(RenderRack var1)
    {
        this.modelID = var1.getRenderId();
    }

    /**
     * returns a list of blocks with the same ID, but different meta (eg: wood returns 4 blocks)
     */
    public void getSubBlocks(int var1, CreativeTabs var2, List var3)
    {
        for (int var4 = 0; var4 < mod_ToolRack.skins.length; ++var4)
        {
            var3.add(new ItemStack(var1, 1, var4 << 2));
        }
    }

    /**
     * If this block doesn't render as an ordinary block it will return False (examples: signs, buttons, stairs, etc)
     */
    public boolean renderAsNormalBlock()
    {
        return false;
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
     * The type of render function that is called for this block
     */
    public int getRenderType()
    {
        return this.modelID;
    }

    /**
     * each class overrdies this to return a new <className>
     */
    public TileEntity createNewTileEntity(World var1)
    {
        return new TileEntityRack();
    }

    /**
     * From the specified side and block metadata retrieves the blocks texture. Args: side, metadata
     */
    public int getBlockTextureFromSideAndMetadata(int var1, int var2)
    {
        return mod_ToolRack.skins[var2 >> 2].getBlockTextureFromSide(var1);
    }

    /**
     * if the specified block is in the given AABB, add its collision bounding box to the given list
     */
    public void addCollidingBlockToList(World var1, int var2, int var3, int var4, AxisAlignedBB var5, List var6, Entity var7)
    {
        this.calcBounds(var1.getBlockMetadata(var2, var3, var4));
        super.addCollidingBlockToList(var1, var2, var3, var4, var5, var6, var7);
    }

    /**
     * Updates the blocks bounds based on its current state. Args: world, x, y, z
     */
    public void setBlockBoundsBasedOnState(IBlockAccess var1, int var2, int var3, int var4)
    {
        int var5 = var1.getBlockMetadata(var2, var3, var4);
        this.calcBounds(var5);
    }

    /**
     * Called upon block activation (right click on the block.)
     */
    public boolean onBlockActivated(World var1, int var2, int var3, int var4, EntityPlayer var5, int var6, float var7, float var8, float var9)
    {
        if (var1.isRemote)
        {
            return true;
        }
        else
        {
            TileEntityRack var10 = (TileEntityRack)var1.getBlockTileEntity(var2, var3, var4);

            if (var10 != null && var5 instanceof EntityPlayerMP)
            {
                int var11 = var1.getBlockMetadata(var2, var3, var4) & 3;
                byte var12 = 0;
                double var13 = (double)var2 + 0.5D - var5.posX;
                double var15 = (double)var4 + 0.5D - var5.posZ;

                if (var11 == 0)
                {
                    var15 -= 0.25D;
                }
                else if (var11 == 1)
                {
                    var13 -= 0.25D;
                }
                else if (var11 == 2)
                {
                    var15 += 0.25D;
                }
                else if (var11 == 3)
                {
                    var13 += 0.25D;
                }

                double var17 = var13 + var15 * Math.tan(Math.toRadians((double)var5.rotationYaw));
                double var19 = var15 - var13 * Math.tan(Math.toRadians((double)(var5.rotationYaw + 90.0F)));

                if (var11 == 0 && var17 < 0.0D || var11 == 1 && var19 > 0.0D || var11 == 2 && var17 > 0.0D || var11 == 3 && var19 < 0.0D)
                {
                    var12 = 2;
                }

                ItemStack var21 = var5.inventory.getCurrentItem();

                if (!var10.isItemInColumn(var12) && var21 != null && var10.canHoldItem(var21))
                {
                    var21 = var5.inventory.decrStackSize(var5.inventory.currentItem, 1);
                    var10.setInventorySlotContents(var12, var21);
                }
                else
                {
                    ItemStack var22 = var10.takeItemInColumn(var12);

                    if (var22 == null)
                    {
                        var22 = var10.takeItemInColumn(2 - var12);
                    }

                    if (var22 != null)
                    {
                        this.dropBlockAsItem_do(var1, var2, var3, var4, var22);
                    }
                }

                var1.markBlockNeedsUpdate(var2, var3, var4);
            }

            return true;
        }
    }

    /**
     * Spawns EntityItem in the world for the given ItemStack if the world is not remote.
     */
    protected void dropBlockAsItem_do(World var1, int var2, int var3, int var4, ItemStack var5)
    {
        if (!var1.isRemote)
        {
            EntityItem var6 = new EntityItem(var1, (double)var2 + 0.5D, (double)var3 + 0.5D, (double)var4 + 0.5D, var5);
            var6.delayBeforeCanPickup = 5;
            int var7 = var1.getBlockMetadata(var2, var3, var4) & 3;
            var6.motionX = var6.motionY = var6.motionZ = 0.0D;

            if (var7 == 0)
            {
                var6.motionZ = 0.05D;
            }
            else if (var7 == 1)
            {
                var6.motionX = 0.05D;
            }
            else if (var7 == 2)
            {
                var6.motionZ = -0.05D;
            }
            else if (var7 == 3)
            {
                var6.motionX = -0.05D;
            }

            var1.spawnEntityInWorld(var6);
        }
    }

    /**
     * Lets the block know when one of its neighbor changes. Doesn't know which neighbor changed (coordinates passed are
     * their own) Args: x, y, z, neighbor blockID
     */
    public void onNeighborBlockChange(World var1, int var2, int var3, int var4, int var5)
    {
        int var6 = var1.getBlockMetadata(var2, var3, var4);
        int var7 = var6 & 3;
        boolean var8 = false;

        if (var7 == 2 && !var1.isBlockNormalCubeDefault(var2, var3, var4 + 1, true))
        {
            var8 = true;
        }

        if (var7 == 0 && !var1.isBlockNormalCubeDefault(var2, var3, var4 - 1, true))
        {
            var8 = true;
        }

        if (var7 == 3 && !var1.isBlockNormalCubeDefault(var2 + 1, var3, var4, true))
        {
            var8 = true;
        }

        if (var7 == 1 && !var1.isBlockNormalCubeDefault(var2 - 1, var3, var4, true))
        {
            var8 = true;
        }

        if (var8)
        {
            this.dropBlockAsItem(var1, var2, var3, var4, var6, 0);
            var1.setBlockWithNotify(var2, var3, var4, 0);
        }
    }

    /**
     * ejects contained items into the world, and notifies neighbours of an update, as appropriate
     */
    public void breakBlock(World var1, int var2, int var3, int var4, int var5, int var6)
    {
        TileEntityRack var7 = (TileEntityRack)var1.getBlockTileEntity(var2, var3, var4);

        if (var7 != null)
        {
            for (int var8 = 0; var8 < var7.getSizeInventory(); ++var8)
            {
                ItemStack var9 = var7.takeItemInColumn(var8);

                if (var9 != null)
                {
                    super.dropBlockAsItem_do(var1, var2, var3, var4, var9);
                }
            }
        }

        super.breakBlock(var1, var2, var3, var4, var5, var6);
    }

    /**
     * Determines the damage on the item the block drops. Used in cloth and wood.
     */
    public int damageDropped(int var1)
    {
        return var1 & 12;
    }

    /**
     * called before onBlockPlacedBy by ItemBlock and ItemReed
     */
    public void updateBlockMetadata(World var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8)
    {
        int var9 = var1.getBlockMetadata(var2, var3, var4) & 12;

        if (var5 == 2 && var1.isBlockNormalCubeDefault(var2, var3, var4 + 1, true))
        {
            var9 |= 2;
        }

        if (var5 == 3 && var1.isBlockNormalCubeDefault(var2, var3, var4 - 1, true))
        {
            var9 |= 0;
        }

        if (var5 == 4 && var1.isBlockNormalCubeDefault(var2 + 1, var3, var4, true))
        {
            var9 |= 3;
        }

        if (var5 == 5 && var1.isBlockNormalCubeDefault(var2 - 1, var3, var4, true))
        {
            var9 |= 1;
        }

        var1.setBlockMetadataWithNotify(var2, var3, var4, var9);
    }

    /**
     * Checks to see if its valid to put this block at the specified coordinates. Args: world, x, y, z
     */
    public boolean canPlaceBlockAt(World var1, int var2, int var3, int var4)
    {
        return var1.isBlockNormalCubeDefault(var2 - 1, var3, var4, true) ? true : (var1.isBlockNormalCubeDefault(var2 + 1, var3, var4, true) ? true : (var1.isBlockNormalCubeDefault(var2, var3, var4 - 1, true) ? true : var1.isBlockNormalCubeDefault(var2, var3, var4 + 1, true)));
    }

    public void calcBounds(int var1)
    {
        int var2 = var1 & 3;

        if (var2 == 0)
        {
            this.setBlockBounds(0.0F, 0.2F, 0.0F, 1.0F, 0.9F, 0.25F);
        }
        else if (var2 == 1)
        {
            this.setBlockBounds(0.0F, 0.2F, 0.0F, 0.25F, 0.9F, 1.0F);
        }
        else if (var2 == 2)
        {
            this.setBlockBounds(0.0F, 0.2F, 0.75F, 1.0F, 0.9F, 1.0F);
        }
        else if (var2 == 3)
        {
            this.setBlockBounds(0.75F, 0.2F, 0.0F, 1.0F, 0.9F, 1.0F);
        }
    }
}
