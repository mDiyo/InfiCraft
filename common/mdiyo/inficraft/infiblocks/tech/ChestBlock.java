package mDiyo.inficraft.infiblocks.tech;

import java.util.Iterator;
import java.util.Random;

import net.minecraft.src.AxisAlignedBB;
import net.minecraft.src.Block;
import net.minecraft.src.Entity;
import net.minecraft.src.EntityItem;
import net.minecraft.src.EntityLiving;
import net.minecraft.src.EntityOcelot;
import net.minecraft.src.EntityPlayer;
import net.minecraft.src.IBlockAccess;
import net.minecraft.src.IInventory;
import net.minecraft.src.InventoryLargeChest;
import net.minecraft.src.ItemStack;
import net.minecraft.src.Material;
import net.minecraft.src.MathHelper;
import net.minecraft.src.NBTTagCompound;
import net.minecraft.src.TileEntity;
import net.minecraft.src.TileEntityChest;
import net.minecraft.src.World;
import net.minecraftforge.common.ForgeDirection;

import mDiyo.inficraft.infiblocks.InfiBlocks;
import mDiyo.shared.machines.BlockLogicBase;
import mDiyo.shared.machines.BlockMachineBase;

public class ChestBlock extends BlockMachineBase
{
    private Random random = new Random();

    public ChestBlock(int var1)
    {
        super(var1, Material.wood);
        this.blockIndexInTexture = 1;
        this.setHardness(2.5F);
        this.setStepSound(Block.soundWoodFootstep);
        this.setBlockName("infiChest");
        this.setRequiresSelfNotify();
    }

    /**
     * Is this block (a) opaque and (b) a full 1m cube?  This determines whether or not to render the shared face of two
     * adjacent blocks and also whether the player can attach torches, redstone wire, etc to this block.
     */
    @Override
    public boolean isOpaqueCube()
    {
        return false;
    }

    /**
     * If this block doesn't render as an ordinary block it will return False (examples: signs, buttons, stairs, etc)
     */
    @Override
    public boolean renderAsNormalBlock()
    {
        return false;
    }

    /**
     * The type of render function that is called for this block
     */
    @Override
    public int getRenderType()
    {
        return InfiBlocks.getContentInstance().chestModelID;
    }

    /**
     * Called whenever the block is added into the world. Args: world, x, y, z
     */
    @Override
    public void onBlockAdded(World var1, int var2, int var3, int var4)
    {
        super.onBlockAdded(var1, var2, var3, var4);
        this.unifyAdjacentChests(var1, var2, var3, var4);
        int var5 = var1.getBlockMetadata(var2, var3, var4);
        int var6 = var1.getBlockId(var2, var3, var4 - 1);
        int var7 = var1.getBlockId(var2, var3, var4 + 1);
        int var8 = var1.getBlockId(var2 - 1, var3, var4);
        int var9 = var1.getBlockId(var2 + 1, var3, var4);
        int var10 = var1.getBlockMetadata(var2, var3, var4 - 1);
        int var11 = var1.getBlockMetadata(var2, var3, var4 + 1);
        int var12 = var1.getBlockMetadata(var2 - 1, var3, var4);
        int var13 = var1.getBlockMetadata(var2 + 1, var3, var4);

        if (var6 == this.blockID && var10 == var5)
        {
            this.unifyAdjacentChests(var1, var2, var3, var4 - 1);
        }

        if (var7 == this.blockID && var11 == var5)
        {
            this.unifyAdjacentChests(var1, var2, var3, var4 + 1);
        }

        if (var8 == this.blockID && var12 == var5)
        {
            this.unifyAdjacentChests(var1, var2 - 1, var3, var4);
        }

        if (var9 == this.blockID && var13 == var5)
        {
            this.unifyAdjacentChests(var1, var2 + 1, var3, var4);
        }
    }

    /**
     * Called when the block is placed in the world.
     */
    @Override
    public void onBlockPlacedBy(World var1, int var2, int var3, int var4, EntityLiving var5)
    {
        int var6 = var1.getBlockId(var2, var3, var4 - 1);
        int var7 = var1.getBlockId(var2, var3, var4 + 1);
        int var8 = var1.getBlockId(var2 - 1, var3, var4);
        int var9 = var1.getBlockId(var2 + 1, var3, var4);
        byte var10 = 0;
        int var11 = MathHelper.floor_double((double)(var5.rotationYaw * 4.0F / 360.0F) + 0.5D) & 3;
        BlockLogicBase var12 = (BlockLogicBase)var1.getBlockTileEntity(var2, var3, var4);

        if (var11 == 0)
        {
            var10 = 2;
        }

        if (var11 == 1)
        {
            var10 = 5;
        }

        if (var11 == 2)
        {
            var10 = 3;
        }

        if (var11 == 3)
        {
            var10 = 4;
        }

        if (var6 != this.blockID && var7 != this.blockID && var8 != this.blockID && var9 != this.blockID)
        {
            var12.setFacing((byte)var10);
        }
        else
        {
            BlockLogicBase var13;

            if ((var6 == this.blockID || var7 == this.blockID) && (var10 == 4 || var10 == 5))
            {
                if (var6 == this.blockID)
                {
                    var13 = (BlockLogicBase)var1.getBlockTileEntity(var2, var3, var4 - 1);
                    var13.setFacing((byte)var10);
                }
                else
                {
                    var13 = (BlockLogicBase)var1.getBlockTileEntity(var2, var3, var4 + 1);
                    var13.setFacing((byte)var10);
                }

                var12.setFacing((byte)var10);
            }

            if ((var8 == this.blockID || var9 == this.blockID) && (var10 == 2 || var10 == 3))
            {
                if (var6 == this.blockID)
                {
                    var13 = (BlockLogicBase)var1.getBlockTileEntity(var2 - 1, var3, var4);
                    var13.setFacing((byte)var10);
                }
                else if (var7 == this.blockID)
                {
                    var13 = (BlockLogicBase)var1.getBlockTileEntity(var2 - 1, var3, var4);
                    var13.setFacing((byte)var10);
                }

                var12.setFacing((byte)var10);
            }
        }
    }

    public void unifyAdjacentChests(World var1, int var2, int var3, int var4)
    {
        if (!var1.isRemote)
        {
            int var5 = var1.getBlockMetadata(var2, var3, var4);
            int var6 = var1.getBlockId(var2, var3, var4 - 1);
            int var7 = var1.getBlockId(var2, var3, var4 + 1);
            int var8 = var1.getBlockId(var2 - 1, var3, var4);
            int var9 = var1.getBlockId(var2 + 1, var3, var4);
            int var10 = var1.getBlockMetadata(var2, var3, var4 - 1);
            int var11 = var1.getBlockMetadata(var2, var3, var4 + 1);
            int var12 = var1.getBlockMetadata(var2 - 1, var3, var4);
            int var13 = var1.getBlockMetadata(var2 + 1, var3, var4);
            boolean var14 = true;
            short var19 = 0;
            int var15;
            boolean var17;
            int var16;
            byte var18;
            BlockLogicBase var20;

            if (var6 != this.blockID && var7 != this.blockID && var10 != var5 && var11 != var5)
            {
                if (var8 != this.blockID && var9 != this.blockID && var12 != var5 && var13 != var5)
                {
                    var18 = 3;

                    if (Block.opaqueCubeLookup[var6] && !Block.opaqueCubeLookup[var7])
                    {
                        var18 = 3;
                    }

                    if (Block.opaqueCubeLookup[var7] && !Block.opaqueCubeLookup[var6])
                    {
                        var18 = 2;
                    }

                    if (Block.opaqueCubeLookup[var8] && !Block.opaqueCubeLookup[var9])
                    {
                        var18 = 5;
                    }

                    if (Block.opaqueCubeLookup[var9] && !Block.opaqueCubeLookup[var8])
                    {
                        var18 = 4;
                    }
                }
                else
                {
                    var15 = var1.getBlockId(var8 == this.blockID ? var2 - 1 : var2 + 1, var3, var4 - 1);
                    var16 = var1.getBlockId(var8 == this.blockID ? var2 - 1 : var2 + 1, var3, var4 + 1);
                    var18 = 3;
                    var17 = true;

                    if (var8 == this.blockID)
                    {
                        var20 = (BlockLogicBase)var1.getBlockTileEntity(var2 - 1, var3, var4);
                        var19 = var20.getFacing();
                    }
                    else
                    {
                        var20 = (BlockLogicBase)var1.getBlockTileEntity(var2 + 1, var3, var4);
                        var19 = var20.getFacing();
                    }

                    if (var19 == 2)
                    {
                        var18 = 2;
                    }

                    if ((Block.opaqueCubeLookup[var6] || Block.opaqueCubeLookup[var15]) && !Block.opaqueCubeLookup[var7] && !Block.opaqueCubeLookup[var16])
                    {
                        var18 = 3;
                    }

                    if ((Block.opaqueCubeLookup[var7] || Block.opaqueCubeLookup[var16]) && !Block.opaqueCubeLookup[var6] && !Block.opaqueCubeLookup[var15])
                    {
                        var18 = 2;
                    }
                }
            }
            else
            {
                var15 = var1.getBlockId(var2 - 1, var3, var6 == this.blockID ? var4 - 1 : var4 + 1);
                var16 = var1.getBlockId(var2 + 1, var3, var6 == this.blockID ? var4 - 1 : var4 + 1);
                var18 = 5;
                var17 = true;

                if (var6 == this.blockID)
                {
                    var20 = (BlockLogicBase)var1.getBlockTileEntity(var2, var3, var4 - 1);
                    var19 = var20.getFacing();
                }
                else if (var7 == this.blockID)
                {
                    var20 = (BlockLogicBase)var1.getBlockTileEntity(var2, var3, var4 + 1);
                    var19 = var20.getFacing();
                }

                if (var19 == 4)
                {
                    var18 = 4;
                }

                if ((Block.opaqueCubeLookup[var8] || Block.opaqueCubeLookup[var15]) && !Block.opaqueCubeLookup[var9] && !Block.opaqueCubeLookup[var16])
                {
                    var18 = 5;
                }

                if ((Block.opaqueCubeLookup[var9] || Block.opaqueCubeLookup[var16]) && !Block.opaqueCubeLookup[var8] && !Block.opaqueCubeLookup[var15])
                {
                    var18 = 4;
                }
            }

            var20 = (BlockLogicBase)var1.getBlockTileEntity(var2, var3, var4);
            var20.setFacing((byte)var18);
        }
    }

    /**
     * Retrieves the block texture to use based on the display side. Args: iBlockAccess, x, y, z, side
     */
    public int getBlockTexture(IBlockAccess var1, int var2, int var3, int var4, int var5)
    {
        return 0;
    }

    /**
     * Returns the block texture based on the side being looked at.  Args: side
     */
    public int getBlockTextureFromSide(int var1)
    {
        return 0;
    }

    /**
     * Checks to see if its valid to put this block at the specified coordinates. Args: world, x, y, z
     */
    public boolean canPlaceBlockAt(World var1, int var2, int var3, int var4)
    {
        int var5 = 0;
        int var6 = var1.getBlockMetadata(var2, var3, var4);

        if (var1.getBlockId(var2 - 1, var3, var4) == this.blockID && var1.getBlockMetadata(var2 - 1, var3, var4) == var6)
        {
            ++var5;
        }

        if (var1.getBlockId(var2 + 1, var3, var4) == this.blockID && var1.getBlockMetadata(var2 + 1, var3, var4) == var6)
        {
            ++var5;
        }

        if (var1.getBlockId(var2, var3, var4 - 1) == this.blockID && var1.getBlockMetadata(var2, var3, var4 - 1) == var6)
        {
            ++var5;
        }

        if (var1.getBlockId(var2, var3, var4 + 1) == this.blockID && var1.getBlockMetadata(var2, var3, var4 + 1) == var6)
        {
            ++var5;
        }

        System.out.println("Nearbychests:" + var5);
        return var5 > 1 ? false : (this.isThereANeighborChest(var1, var2 - 1, var3, var4) ? false : (this.isThereANeighborChest(var1, var2 + 1, var3, var4) ? false : (this.isThereANeighborChest(var1, var2, var3, var4 - 1) ? false : !this.isThereANeighborChest(var1, var2, var3, var4 + 1))));
    }

    private boolean isThereANeighborChest(World var1, int var2, int var3, int var4)
    {
        int var5 = var1.getBlockMetadata(var2, var3, var4);
        return var1.getBlockId(var2, var3, var4) != this.blockID ? false : (var1.getBlockId(var2 - 1, var3, var4) == this.blockID && var1.getBlockMetadata(var2 - 1, var3, var4) == var5 ? true : (var1.getBlockId(var2 + 1, var3, var4) == this.blockID && var1.getBlockMetadata(var2 + 1, var3, var4) == var5 ? true : (var1.getBlockId(var2, var3, var4 - 1) == this.blockID && var1.getBlockMetadata(var2, var3, var4 - 1) == var5 ? true : var1.getBlockId(var2, var3, var4 + 1) == this.blockID && var1.getBlockMetadata(var2, var3, var4 + 1) == var5)));
    }

    /**
     * Lets the block know when one of its neighbor changes. Doesn't know which neighbor changed (coordinates passed are
     * their own) Args: x, y, z, neighbor blockID
     */
    public void onNeighborBlockChange(World var1, int var2, int var3, int var4, int var5)
    {
        super.onNeighborBlockChange(var1, var2, var3, var4, var5);
        ChestLogic var6 = (ChestLogic)var1.getBlockTileEntity(var2, var3, var4);

        if (var6 != null)
        {
            var6.updateContainingBlockInfo();
        }
    }

    /**
     * Called whenever the block is removed.
     */
    @Override
    public void breakBlock(World par1World, int par2, int par3, int par4, int par5, int par6)
    {
        TileEntityChest var7 = (TileEntityChest)par1World.getBlockTileEntity(par2, par3, par4);

        if (var7 != null)
        {
            for (int var8 = 0; var8 < var7.getSizeInventory(); ++var8)
            {
                ItemStack var9 = var7.getStackInSlot(var8);

                if (var9 != null)
                {
                    float var10 = this.random.nextFloat() * 0.8F + 0.1F;
                    float var11 = this.random.nextFloat() * 0.8F + 0.1F;
                    EntityItem var14;

                    for (float var12 = this.random.nextFloat() * 0.8F + 0.1F; var9.stackSize > 0; par1World.spawnEntityInWorld(var14))
                    {
                        int var13 = this.random.nextInt(21) + 10;

                        if (var13 > var9.stackSize)
                        {
                            var13 = var9.stackSize;
                        }

                        var9.stackSize -= var13;
                        var14 = new EntityItem(par1World, (double)((float)par2 + var10), (double)((float)par3 + var11), (double)((float)par4 + var12), new ItemStack(var9.itemID, var13, var9.getItemDamage()));
                        float var15 = 0.05F;
                        var14.motionX = (double)((float)this.random.nextGaussian() * var15);
                        var14.motionY = (double)((float)this.random.nextGaussian() * var15 + 0.2F);
                        var14.motionZ = (double)((float)this.random.nextGaussian() * var15);

                        if (var9.hasTagCompound())
                        {
                            var14.item.setTagCompound((NBTTagCompound)var9.getTagCompound().copy());
                        }
                    }
                }
            }
        }

        super.breakBlock(par1World, par2, par3, par4, par5, par6);
    }
    
    //Previous version
    /*public void onBlockRemoval(World var1, int var2, int var3, int var4)
    {
        ChestLogic var5 = (ChestLogic)var1.getBlockTileEntity(var2, var3, var4);

        if (var5 != null)
        {
            for (int var6 = 0; var6 < var5.getSizeInventory(); ++var6)
            {
                ItemStack var7 = var5.getStackInSlot(var6);

                if (var7 != null)
                {
                    float var8 = this.random.nextFloat() * 0.8F + 0.1F;
                    float var9 = this.random.nextFloat() * 0.8F + 0.1F;
                    EntityItem var10;

                    for (float var11 = this.random.nextFloat() * 0.8F + 0.1F; var7.stackSize > 0; var1.spawnEntityInWorld(var10))
                    {
                        int var12 = this.random.nextInt(21) + 10;

                        if (var12 > var7.stackSize)
                        {
                            var12 = var7.stackSize;
                        }

                        var7.stackSize -= var12;
                        var10 = new EntityItem(var1, (double)((float)var2 + var8), (double)((float)var3 + var9), (double)((float)var4 + var11), new ItemStack(var7.itemID, var12, var7.getItemDamage()));
                        float var13 = 0.05F;
                        var10.motionX = (double)((float)this.random.nextGaussian() * var13);
                        var10.motionY = (double)((float)this.random.nextGaussian() * var13 + 0.2F);
                        var10.motionZ = (double)((float)this.random.nextGaussian() * var13);

                        if (var7.hasTagCompound())
                        {
                            var10.item.setTagCompound((NBTTagCompound)var7.getTagCompound().copy());
                        }
                    }
                }
            }
        }

        super.onBlockRemoval(var1, var2, var3, var4);
    }*/

    /**
     * Called upon block activation (left or right click on the block.). The three integers represent x,y,z of the
     * block.
     */
    @Override
    public boolean onBlockActivated(World par1World, int par2, int par3, int par4, EntityPlayer par5EntityPlayer, int par6, float par7, float par8, float par9)
    {
        Object var10 = (TileEntityChest)par1World.getBlockTileEntity(par2, par3, par4);

        if (var10 == null)
        {
            return true;
        }
        else if (par1World.isBlockSolidOnSide(par2, par3 + 1, par4, ForgeDirection.DOWN))
        {
            return true;
        }
        else if (isOcelotBlockingChest(par1World, par2, par3, par4))
        {
            return true;
        }
        else if (par1World.getBlockId(par2 - 1, par3, par4) == this.blockID && (par1World.isBlockSolidOnSide(par2 - 1, par3 + 1, par4, ForgeDirection.DOWN) || isOcelotBlockingChest(par1World, par2 - 1, par3, par4)))
        {
            return true;
        }
        else if (par1World.getBlockId(par2 + 1, par3, par4) == this.blockID && (par1World.isBlockSolidOnSide(par2 + 1, par3 + 1, par4, ForgeDirection.DOWN) || isOcelotBlockingChest(par1World, par2 + 1, par3, par4)))
        {
            return true;
        }
        else if (par1World.getBlockId(par2, par3, par4 - 1) == this.blockID && (par1World.isBlockSolidOnSide(par2, par3 + 1, par4 - 1, ForgeDirection.DOWN) || isOcelotBlockingChest(par1World, par2, par3, par4 - 1)))
        {
            return true;
        }
        else if (par1World.getBlockId(par2, par3, par4 + 1) == this.blockID && (par1World.isBlockSolidOnSide(par2, par3 + 1, par4 + 1, ForgeDirection.DOWN) || isOcelotBlockingChest(par1World, par2, par3, par4 + 1)))
        {
            return true;
        }
        else
        {
            if (par1World.getBlockId(par2 - 1, par3, par4) == this.blockID)
            {
                var10 = new InventoryLargeChest("container.chestDouble", (TileEntityChest)par1World.getBlockTileEntity(par2 - 1, par3, par4), (IInventory)var10);
            }

            if (par1World.getBlockId(par2 + 1, par3, par4) == this.blockID)
            {
                var10 = new InventoryLargeChest("container.chestDouble", (IInventory)var10, (TileEntityChest)par1World.getBlockTileEntity(par2 + 1, par3, par4));
            }

            if (par1World.getBlockId(par2, par3, par4 - 1) == this.blockID)
            {
                var10 = new InventoryLargeChest("container.chestDouble", (TileEntityChest)par1World.getBlockTileEntity(par2, par3, par4 - 1), (IInventory)var10);
            }

            if (par1World.getBlockId(par2, par3, par4 + 1) == this.blockID)
            {
                var10 = new InventoryLargeChest("container.chestDouble", (IInventory)var10, (TileEntityChest)par1World.getBlockTileEntity(par2, par3, par4 + 1));
            }

            if (par1World.isRemote)
            {
                return true;
            }
            else
            {
                par5EntityPlayer.displayGUIChest((IInventory)var10);
                return true;
            }
        }
    }
    
    //PrevioiusVersion
    /*public boolean blockActivated(World world, int var2, int var3, int var4, EntityPlayer var5)
    {
        Object var6 = (ChestLogic)world.getBlockTileEntity(var2, var3, var4);

        if (var6 == null)
        {
            return true;
        }
        else if (world.isBlockSolidOnSide(var2, var3 + 1, var4, 0))
        {
            return true;
        }
        else if (isOcelotBlockingChest(world, var2, var3, var4))
        {
            return true;
        }
        else if (world.getBlockId(var2 - 1, var3, var4) == this.blockID && (world.isBlockSolidOnSide(var2 - 1, var3 + 1, var4, 0) || isOcelotBlockingChest(world, var2 - 1, var3, var4)))
        {
            return true;
        }
        else if (world.getBlockId(var2 + 1, var3, var4) == this.blockID && (world.isBlockSolidOnSide(var2 + 1, var3 + 1, var4, 0) || isOcelotBlockingChest(world, var2 + 1, var3, var4)))
        {
            return true;
        }
        else if (world.getBlockId(var2, var3, var4 - 1) == this.blockID && (world.isBlockSolidOnSide(var2, var3 + 1, var4 - 1, 0) || isOcelotBlockingChest(world, var2, var3, var4 - 1)))
        {
            return true;
        }
        else if (world.getBlockId(var2, var3, var4 + 1) == this.blockID && (world.isBlockSolidOnSide(var2, var3 + 1, var4 + 1, 0) || isOcelotBlockingChest(world, var2, var3, var4 + 1)))
        {
            return true;
        }
        else
        {
            if (world.getBlockId(var2 - 1, var3, var4) == this.blockID)
            {
                var6 = new InventoryLargeChest("Large chest", (ChestLogic)world.getBlockTileEntity(var2 - 1, var3, var4), (IInventory)var6);
            }

            if (world.getBlockId(var2 + 1, var3, var4) == this.blockID)
            {
                var6 = new InventoryLargeChest("Large chest", (IInventory)var6, (ChestLogic)world.getBlockTileEntity(var2 + 1, var3, var4));
            }

            if (world.getBlockId(var2, var3, var4 - 1) == this.blockID)
            {
                var6 = new InventoryLargeChest("Large chest", (ChestLogic)world.getBlockTileEntity(var2, var3, var4 - 1), (IInventory)var6);
            }

            if (world.getBlockId(var2, var3, var4 + 1) == this.blockID)
            {
                var6 = new InventoryLargeChest("Large chest", (IInventory)var6, (ChestLogic)world.getBlockTileEntity(var2, var3, var4 + 1));
            }

            if (world.isRemote)
            {
                return true;
            }
            else
            {
                var5.displayGUIChest((IInventory)var6);
                return true;
            }
        }
    }*/

    /**
     * Returns the TileEntity used by this block.
     */
    public TileEntity getBlockEntity()
    {
        return null;
    }

    /**
     * Looks for a sitting ocelot within certain bounds. Such an ocelot is considered to be blocking access to the
     * chest.
     */
    private static boolean isOcelotBlockingChest(World var0, int var1, int var2, int var3)
    {
        Iterator var4 = var0.getEntitiesWithinAABB(EntityOcelot.class, AxisAlignedBB.getBoundingBox((double)var1, (double)(var2 + 1), (double)var3, (double)(var1 + 1), (double)(var2 + 2), (double)(var3 + 1))).iterator();

        while (var4.hasNext())
        {
            Entity var6 = (Entity)var4.next();
            EntityOcelot var5 = (EntityOcelot)var6;

            if (var5.isSitting())
            {
                return true;
            }
        }

        return false;
    }

    public Integer getGui(World var1, int var2, int var3, int var4, EntityPlayer var5)
    {
        return null;
    }

    /*@Override
    public TileEntity getBlockEntity(int var1)
    {
        return this.getBlockEntity(var1);
    }*/

	@Override
	public TileEntity createNewTileEntity(World var1) {
		// TODO Auto-generated method stub
		return null;
	}
}
