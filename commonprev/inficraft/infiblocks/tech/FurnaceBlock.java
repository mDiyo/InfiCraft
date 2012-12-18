package inficraft.infiblocks.tech;

import inficraft.api.machines.BlockLogicBase;
import inficraft.api.machines.BlockMachineBase;
import inficraft.infiblocks.InfiBlocks;
import inficraft.infiblocks.InfiBlocksCommonProxy;

import java.util.List;
import java.util.Random;

import cpw.mods.fml.common.network.NetworkMod;


import net.minecraft.src.CreativeTabs;
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
        setCreativeTab(InfiBlocks.infiBlockTab);
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

    public int damageDropped(int i)
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

    public Integer getGui(World world, int x, int y, int z, EntityPlayer entityplayer)
    {
        return Integer.valueOf(InfiBlocksCommonProxy.furnaceGuiID);
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
    
    @Override
    public void breakBlock(World par1World, int par2, int par3, int par4, int par5, int par6)
    {
    	FurnaceLogic var7 = (FurnaceLogic)par1World.getBlockTileEntity(par2, par3, par4);

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
		return new FurnaceLogic();
	}
	
	@Override
    public void getSubBlocks(int id, CreativeTabs tab, List list)
    {
    	for (int iter = 0; iter < 9; iter++)
    	{
    		list.add(new ItemStack(id, 1, iter));
    	}
    }

	@Override
	public Object getModInstance()
	{
		return InfiBlocks.instance;
	}
}
