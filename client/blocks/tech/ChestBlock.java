package net.minecraft.src.blocks.tech;
import net.minecraft.src.*;
import net.minecraft.src.blocks.BlockLogicBase;
import net.minecraft.src.blocks.BlockMachineBase;

import java.util.*;

public class ChestBlock extends BlockMachineBase
{
    private Random random = new Random();

    public ChestBlock(int par1)
    {
        super(par1, Material.wood);
        this.blockIndexInTexture = 1;
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
        return mod_InfiBlocks.chestModelID;
    }

    /**
     * Called whenever the block is added into the world. Args: world, x, y, z
     */
    public void onBlockAdded(World world, int x, int y, int z)
    {
        super.onBlockAdded(world, x, y, z);
        this.unifyAdjacentChests(world, x, y, z);
        int meta = world.getBlockMetadata(x, y, z);
        
        int bIDeast = world.getBlockId(x, y, z - 1);
        int bIDwest = world.getBlockId(x, y, z + 1);
        int bIDsouth = world.getBlockId(x - 1, y, z);
        int bIDnorth = world.getBlockId(x + 1, y, z);
        
        int metaEast = world.getBlockMetadata(x, y, z - 1);
        int metaWest = world.getBlockMetadata(x, y, z + 1);
        int metaSouth = world.getBlockMetadata(x - 1, y, z);
        int metaNorth = world.getBlockMetadata(x + 1, y, z);

        if (bIDeast == this.blockID && metaEast == meta)
        {
            this.unifyAdjacentChests(world, x, y, z - 1);
        }

        if (bIDwest == this.blockID && metaWest == meta)
        {
            this.unifyAdjacentChests(world, x, y, z + 1);
        }

        if (bIDsouth == this.blockID && metaSouth == meta)
        {
            this.unifyAdjacentChests(world, x - 1, y, z);
        }

        if (bIDnorth == this.blockID && metaNorth == meta)
        {
            this.unifyAdjacentChests(world, x + 1, y, z);
        }
    }

    /**
     * Called when the block is placed in the world.
     */
    public void onBlockPlacedBy(World world, int x, int y, int z, EntityLiving par5EntityLiving)
    {
        int bIDeast = world.getBlockId(x, y, z - 1);
        int bIDwest = world.getBlockId(x, y, z + 1);
        int bIDsouth = world.getBlockId(x - 1, y, z);
        int bIDnorth = world.getBlockId(x + 1, y, z);
        byte tempMeta = 0;
        int facing = MathHelper.floor_double((double)(par5EntityLiving.rotationYaw * 4.0F / 360.0F) + 0.5D) & 3;
        BlockLogicBase logic = (BlockLogicBase)world.getBlockTileEntity(x, y, z);

        if (facing == 0)
        {
            tempMeta = 2;
        }

        if (facing == 1)
        {
            tempMeta = 5;
        }

        if (facing == 2)
        {
            tempMeta = 3;
        }

        if (facing == 3)
        {
            tempMeta = 4;
        }

        if (bIDeast != this.blockID && bIDwest != this.blockID && bIDsouth != this.blockID && bIDnorth != this.blockID)
        {
        	logic.setFacing((short)tempMeta);
        }
        else
        {
            if ((bIDeast == this.blockID || bIDwest == this.blockID) && (tempMeta == 4 || tempMeta == 5))
            {
                if (bIDeast == this.blockID)
                {
                	BlockLogicBase nearbyLogic = (BlockLogicBase)world.getBlockTileEntity(x, y, z-1);
                	nearbyLogic.setFacing((short)tempMeta);
                }
                else
                {
                	BlockLogicBase nearbyLogic = (BlockLogicBase)world.getBlockTileEntity(x, y, z+1);
                	nearbyLogic.setFacing((short)tempMeta);
                }

                logic.setFacing((short)tempMeta);
            }

            if ((bIDsouth == this.blockID || bIDnorth == this.blockID) && (tempMeta == 2 || tempMeta == 3))
            {
            	if (bIDeast == this.blockID)
                {
                	BlockLogicBase nearbyLogic = (BlockLogicBase)world.getBlockTileEntity(x-1, y, z);
                	nearbyLogic.setFacing((short)tempMeta);
                }
                else if (bIDwest == this.blockID)
                {
                	BlockLogicBase nearbyLogic = (BlockLogicBase)world.getBlockTileEntity(x-1, y, z);
                	nearbyLogic.setFacing((short)tempMeta);
                }

                logic.setFacing((short)tempMeta);
            }
        }
    }

    /**
     * Turns the adjacent chests to a double chest.
     */
    public void unifyAdjacentChests(World world, int x, int y, int z)
    {
        if (!world.isRemote)
        {
        	int meta = world.getBlockMetadata(x, y, z);
            
            int bIDeast = world.getBlockId(x, y, z - 1);
            int bIDwest = world.getBlockId(x, y, z + 1);
            int bIDsouth = world.getBlockId(x - 1, y, z);
            int bIDnorth = world.getBlockId(x + 1, y, z);
            
            int metaEast = world.getBlockMetadata(x, y, z - 1);
            int metaWest = world.getBlockMetadata(x, y, z + 1);
            int metaSouth = world.getBlockMetadata(x - 1, y, z);
            int metaNorth = world.getBlockMetadata(x + 1, y, z);
            
            boolean var9 = true;
            int var10;
            int var11;
            boolean var12;
            byte facing;
            int nearbyFacing = 0;

            if (bIDeast != this.blockID && bIDwest != this.blockID && metaEast != meta && metaWest != meta)
            {
                if (bIDsouth != this.blockID && bIDnorth != this.blockID && metaSouth != meta && metaNorth != meta)
                {
                    facing = 3;

                    if (Block.opaqueCubeLookup[bIDeast] && !Block.opaqueCubeLookup[bIDwest])
                    {
                        facing = 3;
                    }

                    if (Block.opaqueCubeLookup[bIDwest] && !Block.opaqueCubeLookup[bIDeast])
                    {
                        facing = 2;
                    }

                    if (Block.opaqueCubeLookup[bIDsouth] && !Block.opaqueCubeLookup[bIDnorth])
                    {
                        facing = 5;
                    }

                    if (Block.opaqueCubeLookup[bIDnorth] && !Block.opaqueCubeLookup[bIDsouth])
                    {
                        facing = 4;
                    }
                }
                else
                {
                    var10 = world.getBlockId(bIDsouth == this.blockID ? x - 1 : x + 1, y, z - 1);
                    var11 = world.getBlockId(bIDsouth == this.blockID ? x - 1 : x + 1, y, z + 1);
                    facing = 3;
                    var12 = true;

                    if (bIDsouth == this.blockID)
                    {
                    	BlockLogicBase nearbyLogic = (BlockLogicBase)world.getBlockTileEntity(x-1, y, z);
                        nearbyFacing = nearbyLogic.getFacing();
                    }
                    else
                    {
                    	BlockLogicBase nearbyLogic = (BlockLogicBase)world.getBlockTileEntity(x+1, y, z);
                        nearbyFacing = nearbyLogic.getFacing();
                    }

                    if (nearbyFacing == 2)
                    {
                        facing = 2;
                    }

                    if ((Block.opaqueCubeLookup[bIDeast] || Block.opaqueCubeLookup[var10]) && !Block.opaqueCubeLookup[bIDwest] && !Block.opaqueCubeLookup[var11])
                    {
                        facing = 3;
                    }

                    if ((Block.opaqueCubeLookup[bIDwest] || Block.opaqueCubeLookup[var11]) && !Block.opaqueCubeLookup[bIDeast] && !Block.opaqueCubeLookup[var10])
                    {
                        facing = 2;
                    }
                }
            }
            else
            {
                var10 = world.getBlockId(x - 1, y, bIDeast == this.blockID ? z - 1 : z + 1);
                var11 = world.getBlockId(x + 1, y, bIDeast == this.blockID ? z - 1 : z + 1);
                facing = 5;
                var12 = true;

                if (bIDeast == this.blockID)
                {
                	BlockLogicBase nearbyLogic = (BlockLogicBase)world.getBlockTileEntity(x, y, z-1);
                	nearbyFacing = nearbyLogic.getFacing();
                }
                else if (bIDwest == this.blockID)
                {
                	BlockLogicBase nearbyLogic = (BlockLogicBase)world.getBlockTileEntity(x, y, z+1);
                	nearbyFacing = nearbyLogic.getFacing();
                }

                if (nearbyFacing == 4)
                {
                    facing = 4;
                }

                if ((Block.opaqueCubeLookup[bIDsouth] || Block.opaqueCubeLookup[var10]) && !Block.opaqueCubeLookup[bIDnorth] && !Block.opaqueCubeLookup[var11])
                {
                    facing = 5;
                }

                if ((Block.opaqueCubeLookup[bIDnorth] || Block.opaqueCubeLookup[var11]) && !Block.opaqueCubeLookup[bIDsouth] && !Block.opaqueCubeLookup[var10])
                {
                    facing = 4;
                }
            }

            BlockLogicBase logic = (BlockLogicBase)world.getBlockTileEntity(x, y, z);
            logic.setFacing(facing);
        }
    }

    /**
     * Retrieves the block texture to use based on the display side. Args: iBlockAccess, x, y, z, side
     */
    public int getBlockTexture(IBlockAccess par1IBlockAccess, int par2, int par3, int par4, int par5)
    {
        /*if (par5 == 1)
        {
            return this.blockIndexInTexture - 1;
        }
        else if (par5 == 0)
        {
            return this.blockIndexInTexture - 1;
        }
        else
        {
            int var6 = par1IBlockAccess.getBlockId(par2, par3, par4 - 1);
            int var7 = par1IBlockAccess.getBlockId(par2, par3, par4 + 1);
            int var8 = par1IBlockAccess.getBlockId(par2 - 1, par3, par4);
            int var9 = par1IBlockAccess.getBlockId(par2 + 1, par3, par4);
            int var10;
            int var11;
            int var12;
            byte var13;

            if (var6 != this.blockID && var7 != this.blockID)
            {
                if (var8 != this.blockID && var9 != this.blockID)
                {
                    byte var14 = 3;

                    if (Block.opaqueCubeLookup[var6] && !Block.opaqueCubeLookup[var7])
                    {
                        var14 = 3;
                    }

                    if (Block.opaqueCubeLookup[var7] && !Block.opaqueCubeLookup[var6])
                    {
                        var14 = 2;
                    }

                    if (Block.opaqueCubeLookup[var8] && !Block.opaqueCubeLookup[var9])
                    {
                        var14 = 5;
                    }

                    if (Block.opaqueCubeLookup[var9] && !Block.opaqueCubeLookup[var8])
                    {
                        var14 = 4;
                    }

                    return par5 == var14 ? this.blockIndexInTexture + 1 : this.blockIndexInTexture;
                }
                else if (par5 != 4 && par5 != 5)
                {
                    var10 = 0;

                    if (var8 == this.blockID)
                    {
                        var10 = -1;
                    }

                    var11 = par1IBlockAccess.getBlockId(var8 == this.blockID ? par2 - 1 : par2 + 1, par3, par4 - 1);
                    var12 = par1IBlockAccess.getBlockId(var8 == this.blockID ? par2 - 1 : par2 + 1, par3, par4 + 1);

                    if (par5 == 3)
                    {
                        var10 = -1 - var10;
                    }

                    var13 = 3;

                    if ((Block.opaqueCubeLookup[var6] || Block.opaqueCubeLookup[var11]) && !Block.opaqueCubeLookup[var7] && !Block.opaqueCubeLookup[var12])
                    {
                        var13 = 3;
                    }

                    if ((Block.opaqueCubeLookup[var7] || Block.opaqueCubeLookup[var12]) && !Block.opaqueCubeLookup[var6] && !Block.opaqueCubeLookup[var11])
                    {
                        var13 = 2;
                    }

                    return (par5 == var13 ? this.blockIndexInTexture + 16 : this.blockIndexInTexture + 32) + var10;
                }
                else
                {
                    return this.blockIndexInTexture;
                }
            }
            else if (par5 != 2 && par5 != 3)
            {
                var10 = 0;

                if (var6 == this.blockID)
                {
                    var10 = -1;
                }

                var11 = par1IBlockAccess.getBlockId(par2 - 1, par3, var6 == this.blockID ? par4 - 1 : par4 + 1);
                var12 = par1IBlockAccess.getBlockId(par2 + 1, par3, var6 == this.blockID ? par4 - 1 : par4 + 1);

                if (par5 == 4)
                {
                    var10 = -1 - var10;
                }

                var13 = 5;

                if ((Block.opaqueCubeLookup[var8] || Block.opaqueCubeLookup[var11]) && !Block.opaqueCubeLookup[var9] && !Block.opaqueCubeLookup[var12])
                {
                    var13 = 5;
                }

                if ((Block.opaqueCubeLookup[var9] || Block.opaqueCubeLookup[var12]) && !Block.opaqueCubeLookup[var8] && !Block.opaqueCubeLookup[var11])
                {
                    var13 = 4;
                }

                return (par5 == var13 ? this.blockIndexInTexture + 16 : this.blockIndexInTexture + 32) + var10;
            }
            else
            {
                return this.blockIndexInTexture;
            }
        }*/
    	return 0;
    }

    /**
     * Returns the block texture based on the side being looked at.  Args: side
     */
    public int getBlockTextureFromSide(int par1)
    {
        return 0;
    	//return par1 == 1 ? this.blockIndexInTexture - 1 : (par1 == 0 ? this.blockIndexInTexture - 1 : (par1 == 3 ? this.blockIndexInTexture + 1 : this.blockIndexInTexture));
    }

    /**
     * Checks to see if its valid to put this block at the specified coordinates. Args: world, x, y, z
     */
    public boolean canPlaceBlockAt(World world, int x, int y, int z)
    {
        int var5 = 0;
        int meta = world.getBlockMetadata(x, y, z);

        if (world.getBlockId(x - 1, y, z) == this.blockID && world.getBlockMetadata(x-1, y, z) == meta)
        {
            ++var5;
        }

        if (world.getBlockId(x + 1, y, z) == this.blockID && world.getBlockMetadata(x+1, y, z) == meta)
        {
            ++var5;
        }

        if (world.getBlockId(x, y, z - 1) == this.blockID && world.getBlockMetadata(x, y, z-1) == meta)
        {
            ++var5;
        }

        if (world.getBlockId(x, y, z + 1) == this.blockID && world.getBlockMetadata(x, y, z+1) == meta)
        {
            ++var5;
        }

        return var5 > 1 ? false : (this.isThereANeighborChest(world, x - 1, y, z) ? false : (this.isThereANeighborChest(world, x + 1, y, z) ? false : (this.isThereANeighborChest(world, x, y, z - 1) ? false : !this.isThereANeighborChest(world, x, y, z + 1))));
    }

    /**
     * Checks the neighbor blocks to see if there is a chest there. Args: world, x, y, z
     */
    private boolean isThereANeighborChest(World par1World, int x, int y, int z)
    {
        return par1World.getBlockId(x, y, z) != this.blockID ? false : (par1World.getBlockId(x - 1, y, z) == this.blockID ? true : (par1World.getBlockId(x + 1, y, z) == this.blockID ? true : (par1World.getBlockId(x, y, z - 1) == this.blockID ? true : par1World.getBlockId(x, y, z + 1) == this.blockID)));
    }

    /**
     * Lets the block know when one of its neighbor changes. Doesn't know which neighbor changed (coordinates passed are
     * their own) Args: x, y, z, neighbor blockID
     */
    public void onNeighborBlockChange(World par1World, int par2, int par3, int par4, int par5)
    {
        super.onNeighborBlockChange(par1World, par2, par3, par4, par5);
        ChestLogic var6 = (ChestLogic)par1World.getBlockTileEntity(par2, par3, par4);

        if (var6 != null)
        {
            var6.updateContainingBlockInfo();
        }
    }

    /**
     * Called whenever the block is removed.
     */
    public void onBlockRemoval(World par1World, int par2, int par3, int par4)
    {
        ChestLogic var5 = (ChestLogic)par1World.getBlockTileEntity(par2, par3, par4);

        if (var5 != null)
        {
            for (int var6 = 0; var6 < var5.getSizeInventory(); ++var6)
            {
                ItemStack var7 = var5.getStackInSlot(var6);

                if (var7 != null)
                {
                    float var8 = this.random.nextFloat() * 0.8F + 0.1F;
                    float var9 = this.random.nextFloat() * 0.8F + 0.1F;
                    EntityItem var12;

                    for (float var10 = this.random.nextFloat() * 0.8F + 0.1F; var7.stackSize > 0; par1World.spawnEntityInWorld(var12))
                    {
                        int var11 = this.random.nextInt(21) + 10;

                        if (var11 > var7.stackSize)
                        {
                            var11 = var7.stackSize;
                        }

                        var7.stackSize -= var11;
                        var12 = new EntityItem(par1World, (double)((float)par2 + var8), (double)((float)par3 + var9), (double)((float)par4 + var10), new ItemStack(var7.itemID, var11, var7.getItemDamage()));
                        float var13 = 0.05F;
                        var12.motionX = (double)((float)this.random.nextGaussian() * var13);
                        var12.motionY = (double)((float)this.random.nextGaussian() * var13 + 0.2F);
                        var12.motionZ = (double)((float)this.random.nextGaussian() * var13);

                        if (var7.hasTagCompound())
                        {
                            var12.item.setTagCompound((NBTTagCompound)var7.getTagCompound().copy());
                        }
                    }
                }
            }
        }

        super.onBlockRemoval(par1World, par2, par3, par4);
    }

    /**
     * Called upon block activation (left or right click on the block.). The three integers represent x,y,z of the
     * block.
     */
    public boolean blockActivated(World par1World, int par2, int par3, int par4, EntityPlayer par5EntityPlayer)
    {
        Object var6 = (ChestLogic)par1World.getBlockTileEntity(par2, par3, par4);

        if (var6 == null)
        {
            return true;
        }
        else if (par1World.isBlockSolidOnSide(par2, par3 + 1, par4, 0))
        {
            return true;
        }
        else if (func_50075_j(par1World, par2, par3, par4))
        {
            return true;
        }
        else if (par1World.getBlockId(par2 - 1, par3, par4) == this.blockID && (par1World.isBlockSolidOnSide(par2 - 1, par3 + 1, par4, 0) || func_50075_j(par1World, par2 - 1, par3, par4)))
        {
            return true;
        }
        else if (par1World.getBlockId(par2 + 1, par3, par4) == this.blockID && (par1World.isBlockSolidOnSide(par2 + 1, par3 + 1, par4, 0) || func_50075_j(par1World, par2 + 1, par3, par4)))
        {
            return true;
        }
        else if (par1World.getBlockId(par2, par3, par4 - 1) == this.blockID && (par1World.isBlockSolidOnSide(par2, par3 + 1, par4 - 1, 0) || func_50075_j(par1World, par2, par3, par4 - 1)))
        {
            return true;
        }
        else if (par1World.getBlockId(par2, par3, par4 + 1) == this.blockID && (par1World.isBlockSolidOnSide(par2, par3 + 1, par4 + 1, 0) || func_50075_j(par1World, par2, par3, par4 + 1)))
        {
            return true;
        }
        else
        {
            if (par1World.getBlockId(par2 - 1, par3, par4) == this.blockID)
            {
                var6 = new InventoryLargeChest("Large chest", (ChestLogic)par1World.getBlockTileEntity(par2 - 1, par3, par4), (IInventory)var6);
            }

            if (par1World.getBlockId(par2 + 1, par3, par4) == this.blockID)
            {
                var6 = new InventoryLargeChest("Large chest", (IInventory)var6, (ChestLogic)par1World.getBlockTileEntity(par2 + 1, par3, par4));
            }

            if (par1World.getBlockId(par2, par3, par4 - 1) == this.blockID)
            {
                var6 = new InventoryLargeChest("Large chest", (ChestLogic)par1World.getBlockTileEntity(par2, par3, par4 - 1), (IInventory)var6);
            }

            if (par1World.getBlockId(par2, par3, par4 + 1) == this.blockID)
            {
                var6 = new InventoryLargeChest("Large chest", (IInventory)var6, (ChestLogic)par1World.getBlockTileEntity(par2, par3, par4 + 1));
            }

            if (par1World.isRemote)
            {
                return true;
            }
            else
            {
                par5EntityPlayer.displayGUIChest((IInventory)var6);
                return true;
            }
        }
    }

    /**
     * Returns the TileEntity used by this block.
     */
    public TileEntity getBlockEntity()
    {
        return null;
    }

    private static boolean func_50075_j(World par0World, int par1, int par2, int par3)
    {
        Iterator var4 = par0World.getEntitiesWithinAABB(EntityOcelot.class, AxisAlignedBB.getBoundingBoxFromPool((double)par1, (double)(par2 + 1), (double)par3, (double)(par1 + 1), (double)(par2 + 2), (double)(par3 + 1))).iterator();
        EntityOcelot var6;

        do
        {
            if (!var4.hasNext())
            {
                return false;
            }

            Entity var5 = (Entity)var4.next();
            var6 = (EntityOcelot)var5;
        }
        while (!var6.isSitting());

        return true;
    }

	@Override
	public Integer getGui(World world, int x, int y, int z,
			EntityPlayer entityplayer) 
	{
		return null;
	}

	@Override
	public BlockLogicBase getBlockEntity(int metadata) 
	{
		return new ChestLogic();
	}
}
