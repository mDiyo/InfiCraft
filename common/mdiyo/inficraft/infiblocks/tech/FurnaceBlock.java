package mdiyo.inficraft.infiblocks.tech;

import java.util.Random;

import mdiyo.inficraft.infiblocks.InfiBlocks;
import mdiyo.inficraft.infiblocks.InfiBlocksCommonProxy;
import mdiyo.shared.machines.BlockLogicBase;
import mdiyo.shared.machines.BlockMachineBase;

import net.minecraft.src.EntityItem;
import net.minecraft.src.EntityLiving;
import net.minecraft.src.EntityPlayer;
import net.minecraft.src.IBlockAccess;
import net.minecraft.src.ItemStack;
import net.minecraft.src.Material;
import net.minecraft.src.MathHelper;
import net.minecraft.src.NBTTagCompound;
import net.minecraft.src.TileEntity;
import net.minecraft.src.TileEntityFurnace;
import net.minecraft.src.World;

public class FurnaceBlock extends BlockMachineBase
{
    int tex;
    Random rand;

    public FurnaceBlock(int i)
    {
        super(i, Material.iron);
        tex = blockIndexInTexture + 48;
        setHardness(1.5F);
        setStepSound(soundMetalFootstep);
        rand = new Random();
    }

    public String getTextureFile()
    {
        return InfiBlocks.techImage;
    }

    public int getBlockTextureFromSideAndMetadata(int side, int meta)
    {
        if (side == 0 || side == 1)
        {
            return tex + 3 + meta * 4;
        }
        if (side == 3)
        {
            return tex + meta * 4;
        }
        else
        {
            return tex + 2 + meta * 4;
        }
    }

    public int getBlockTexture(IBlockAccess iblockaccess, int x, int y, int z, int side)
    {
        TileEntity tileentity = iblockaccess.getBlockTileEntity(x, y, z);
        short word0 = (tileentity instanceof BlockLogicBase) ? ((BlockLogicBase)tileentity).getFacing() : 0;
        int i1 = iblockaccess.getBlockMetadata(x, y, z);
        if (side == 1 || side == 0)
        {
            return tex + 3 + i1 * 4;
        }
        if (side == word0)
        {
            if (isActive(iblockaccess, x, y, z))
            {
                return tex + 1 + i1 * 4;
            }
            else
            {
                return tex + i1 * 4;
            }
        }
        else
        {
            return tex + 2 + i1 * 4;
        }
    }

    protected int damageDropped(int i)
    {
        return i;
    }

    public int quantityDropped(Random random)
    {
        return 1;
    }

    public boolean canProvidePower()
    {
        return true;
    }

    public Integer getGui(World world, int i, int j, int k, EntityPlayer entityplayer)
    {
        return Integer.valueOf(InfiBlocksCommonProxy.furnaceGuiID);
    }

    public BlockLogicBase getBlockEntity(int i)
    {
        return new FurnaceLogic();
    }

    public void onBlockPlacedBy(World world, int x, int y, int z, EntityLiving entityliving)
    {
        BlockLogicBase blocklogicbase = (BlockLogicBase)world.getBlockTileEntity(x, y, z);
        if (entityliving == null)
        {
            blocklogicbase.setFacing((byte)1);
        }
        else
        {
            int l = MathHelper.floor_double((double)((entityliving.rotationYaw * 4F) / 360F) + 0.5D) & 3;
            int i1 = Math.round(entityliving.rotationPitch);
            if (i1 >= 65)
            {
                blocklogicbase.setFacing((byte)1);
            }
            else if (i1 <= -65)
            {
                blocklogicbase.setFacing((byte)0);
            }
            else
            {
                switch (l)
                {
                    case 0:
                        blocklogicbase.setFacing((byte)2);
                        break;

                    case 1:
                        blocklogicbase.setFacing((byte)5);
                        break;

                    case 2:
                        blocklogicbase.setFacing((byte)3);
                        break;

                    case 3:
                        blocklogicbase.setFacing((byte)4);
                        break;
                }
            }
        }
    }

    public void randomDisplayTick(World world, int i, int j, int k, Random random)
    {
        if (isActive(world, i, j, k))
        {
            TileEntity tileentity = world.getBlockTileEntity(i, j, k);
            short word0 = (tileentity instanceof BlockLogicBase) ? ((BlockLogicBase)tileentity).getFacing() : 0;
            float f = (float)i + 0.5F;
            float f1 = (float)j + 0.0F + (random.nextFloat() * 6F) / 16F;
            float f2 = (float)k + 0.5F;
            float f3 = 0.52F;
            float f4 = random.nextFloat() * 0.6F - 0.3F;
            switch (word0)
            {
                case 4:
                    world.spawnParticle("smoke", f - f3, f1, f2 + f4, 0.0D, 0.0D, 0.0D);
                    world.spawnParticle("flame", f - f3, f1, f2 + f4, 0.0D, 0.0D, 0.0D);
                    break;

                case 5:
                    world.spawnParticle("smoke", f + f3, f1, f2 + f4, 0.0D, 0.0D, 0.0D);
                    world.spawnParticle("flame", f + f3, f1, f2 + f4, 0.0D, 0.0D, 0.0D);
                    break;

                case 2:
                    world.spawnParticle("smoke", f + f4, f1, f2 - f3, 0.0D, 0.0D, 0.0D);
                    world.spawnParticle("flame", f + f4, f1, f2 - f3, 0.0D, 0.0D, 0.0D);
                    break;

                case 3:
                    world.spawnParticle("smoke", f + f4, f1, f2 + f3, 0.0D, 0.0D, 0.0D);
                    world.spawnParticle("flame", f + f4, f1, f2 + f3, 0.0D, 0.0D, 0.0D);
                    break;
            }
        }
    }

    public int getLightValue(IBlockAccess iblockaccess, int i, int j, int k)
    {
        return !isActive(iblockaccess, i, j, k) ? 0 : 13;
    }
    
    /*@Override
    public void onBlockRemoval(World world, int i, int j, int k)
    {
            FurnaceLogic furnaceLogic = (FurnaceLogic)world.getBlockTileEntity(i, j, k);
            if (furnaceLogic != null)
            {
                label0:
                for (int l = 0; l < furnaceLogic.getSizeInventory(); l++)
                {
                    ItemStack itemstack = furnaceLogic.getStackInSlot(l);
                    if (itemstack == null)
                    {
                        continue;
                    }
                    float f = rand.nextFloat() * 0.8F + 0.1F;
                    float f1 = rand.nextFloat() * 0.8F + 0.1F;
                    float f2 = rand.nextFloat() * 0.8F + 0.1F;
                    do
                    {
                        if (itemstack.stackSize <= 0)
                        {
                            continue label0;
                        }
                        int i1 = rand.nextInt(21) + 10;
                        if (i1 > itemstack.stackSize)
                        {
                            i1 = itemstack.stackSize;
                        }
                        itemstack.stackSize -= i1;
                        EntityItem entityitem = new EntityItem(world, (float)i + f, (float)j + f1, (float)k + f2, new ItemStack(itemstack.itemID, i1, itemstack.getItemDamage()));
                        float f3 = 0.05F;
                        entityitem.motionX = (float)rand.nextGaussian() * f3;
                        entityitem.motionY = (float)rand.nextGaussian() * f3 + 0.2F;
                        entityitem.motionZ = (float)rand.nextGaussian() * f3;
                        world.spawnEntityInWorld(entityitem);
                    }
                    while (true);
                }
            }
        super.onBlockRemoval(world, i, j, k);
    }*/
    
    public void breakBlock(World par1World, int par2, int par3, int par4, int par5, int par6)
    {
            TileEntityFurnace var7 = (TileEntityFurnace)par1World.getBlockTileEntity(par2, par3, par4);

            if (var7 != null)
            {
                for (int var8 = 0; var8 < var7.getSizeInventory(); ++var8)
                {
                    ItemStack var9 = var7.getStackInSlot(var8);

                    if (var9 != null)
                    {
                        float var10 = this.rand.nextFloat() * 0.8F + 0.1F;
                        float var11 = this.rand.nextFloat() * 0.8F + 0.1F;
                        float var12 = this.rand.nextFloat() * 0.8F + 0.1F;

                        while (var9.stackSize > 0)
                        {
                            int var13 = this.rand.nextInt(21) + 10;

                            if (var13 > var9.stackSize)
                            {
                                var13 = var9.stackSize;
                            }

                            var9.stackSize -= var13;
                            EntityItem var14 = new EntityItem(par1World, (double)((float)par2 + var10), (double)((float)par3 + var11), (double)((float)par4 + var12), new ItemStack(var9.itemID, var13, var9.getItemDamage()));

                            if (var9.hasTagCompound())
                            {
                                var14.item.setTagCompound((NBTTagCompound)var9.getTagCompound().copy());
                            }

                            float var15 = 0.05F;
                            var14.motionX = (double)((float)this.rand.nextGaussian() * var15);
                            var14.motionY = (double)((float)this.rand.nextGaussian() * var15 + 0.2F);
                            var14.motionZ = (double)((float)this.rand.nextGaussian() * var15);
                            par1World.spawnEntityInWorld(var14);
                        }
                    }
                }
        }

        super.breakBlock(par1World, par2, par3, par4, par5, par6);
    }

	@Override
	public TileEntity createNewTileEntity(World var1) {
		// TODO Auto-generated method stub
		return null;
	}
}
