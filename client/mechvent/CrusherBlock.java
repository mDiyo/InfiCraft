package net.minecraft.src.mechvent;

import net.minecraft.src.forge.ITextureProvider;
import java.util.Random;
import net.minecraft.src.*;

public class CrusherBlock extends BlockPrototypeBase
    implements ITextureProvider
{
    int tex;
    Random rand;

    public CrusherBlock(int i)
    {
        super(i, Material.iron);
        tex = 0;
        setHardness(1.5F);
        setStepSound(soundMetalFootstep);
        rand = new Random();
    }

    public String getTextureFile()
    {
        return "/mechtex/prototype.png";
    }

    public int getBlockTextureFromSideAndMetadata(int i, int j)
    {
        if (i == 0 || i == 1)
        {
            return tex + 3 + j * 4;
        }
        if (i == 3)
        {
            return tex + j * 4;
        }
        else
        {
            return tex + 2 + j * 4;
        }
    }

    public int getBlockTexture(IBlockAccess iblockaccess, int x, int y, int z, int side)
    {
        TileEntity tileentity = iblockaccess.getBlockTileEntity(x, y, z);
        short word0 = (tileentity instanceof BlockLogicBase) ? ((BlockLogicBase)tileentity).getFacing() : 0;
        int meta = iblockaccess.getBlockMetadata(x, y, z);
        if (side == 1 || side == 0)
        {
            return tex + 3 + meta * 4;
        }
        if (side == word0)
        {
            if (isActive(iblockaccess, x, y, z))
            {
                return tex + 1 + meta * 4;
            }
            else
            {
                return tex + meta * 4;
            }
        }
        else
        {
            return tex + 2 + meta * 4;
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

    public Integer getGui(World world, int x, int y, int z, EntityPlayer entityplayer)
    {
    	int meta = world.getBlockMetadata(x, y, z) + 1;
        return Integer.valueOf(meta);
    }
    
    public boolean blockActivated(World world, int x, int y, int z, EntityPlayer player)
    {
        if (player.isSneaking())
        {
            return false;
        }
        Integer integer = getGui(world, x, y, z, player);
        if (integer == null)
        {
            return false;
        }
        else
        {
        	player.openGui(mod_Mechvent.getInstance(), integer, world, x, y, z);
            return true;
        }
    }

    public BlockLogicBase getBlockEntity(int meta)
    {
    	switch (meta)
    	{
    	case 0: return new CrusherLogic();
    	case 1: return new GrinderLogic();
    	default: return null;
    	}
        
    }

    public void onBlockPlacedBy(World world, int x, int y, int z, EntityLiving entityliving)
    {
        BlockLogicBase blocklogicbase = (BlockLogicBase)world.getBlockTileEntity(x, y, z);
        if (entityliving == null)
        {
            blocklogicbase.setFacing((short)1);
        }
        else
        {
            int l = MathHelper.floor_double((double)((entityliving.rotationYaw * 4F) / 360F) + 0.5D) & 3;
            int i1 = Math.round(entityliving.rotationPitch);
            if (i1 >= 65)
            {
                blocklogicbase.setFacing((short)1);
            }
            else if (i1 <= -65)
            {
                blocklogicbase.setFacing((short)0);
            }
            else
            {
                switch (l)
                {
                    case 0:
                        blocklogicbase.setFacing((short)2);
                        break;

                    case 1:
                        blocklogicbase.setFacing((short)5);
                        break;

                    case 2:
                        blocklogicbase.setFacing((short)3);
                        break;

                    case 3:
                        blocklogicbase.setFacing((short)4);
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
    
    public void onBlockRemoval(World world, int i, int j, int k)
    {
            BlockLogicPrototype furnaceLogic = (BlockLogicPrototype)world.getBlockTileEntity(i, j, k);
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
    }
}
