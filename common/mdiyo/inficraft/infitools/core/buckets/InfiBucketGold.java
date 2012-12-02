package mDiyo.inficraft.infitools.core.buckets;

import mDiyo.inficraft.infitools.core.InfiCore;
import mDiyo.inficraft.infitools.core.Items;
import net.minecraft.src.Block;
import net.minecraft.src.EntityCow;
import net.minecraft.src.EntityPlayer;
import net.minecraft.src.EnumMovingObjectType;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;
import net.minecraft.src.MovingObjectPosition;
import net.minecraft.src.World;

public class InfiBucketGold extends Item
{
    private int isFull;

    public InfiBucketGold(int i, int j)
    {
        super(i);
        maxStackSize = 1;
        isFull = j;
        this.setItemName("bucketGold");
    }

    public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer player)
    {
    	float var4 = 1.0F;
        double var5 = player.prevPosX + (player.posX - player.prevPosX) * (double)var4;
        double var7 = player.prevPosY + (player.posY - player.prevPosY) * (double)var4 + 1.62D - (double)player.yOffset;
        double var9 = player.prevPosZ + (player.posZ - player.prevPosZ) * (double)var4;
        boolean var11 = this.isFull == 0;
        MovingObjectPosition mop = this.getMovingObjectPositionFromPlayer(world, player, var11);

        if (mop == null)
        {
            return itemstack;
        }
        if (mop.typeOfHit == EnumMovingObjectType.TILE)
        {
            int x = mop.blockX;
            int y = mop.blockY;
            int z = mop.blockZ;
            if (!world.canMineBlock(player, x, y, z))
            {
                return itemstack;
            }
            if (isFull == 0)
            {
            	int bID = world.getBlockId(x, y, z);
                if ((bID == Block.waterMoving.blockID || bID == Block.waterStill.blockID)
                		&& world.getBlockMetadata(x, y, z) == 0)
                {
                    world.setBlockWithNotify(x, y, z, 0);
                    return new ItemStack(Items.goldBucketWater);
                }
                if ((bID == Block.lavaMoving.blockID || bID == Block.lavaStill.blockID)
                		&& world.getBlockMetadata(x, y, z) == 0)
                {
                    world.setBlockWithNotify(x, y, z, 0);
                    return new ItemStack(Items.goldBucketLava);
                }
                if (bID == Block.sand.blockID)
                {
                    world.setBlockWithNotify(x, y, z, 0);
                    return new ItemStack(Items.goldBucketSand);
                }
                if (bID == Block.gravel.blockID)
                {
                    world.setBlockWithNotify(x, y, z, 0);
                    return new ItemStack(Items.goldBucketGravel);
                }
            }
            else
            {
                if (isFull < 0)
                {
                    return new ItemStack(Items.goldBucketEmpty);
                }
                if (mop.sideHit == 0)
                {
                    y--;
                }
                if (mop.sideHit == 1)
                {
                    y++;
                }
                if (mop.sideHit == 2)
                {
                    z--;
                }
                if (mop.sideHit == 3)
                {
                    z++;
                }
                if (mop.sideHit == 4)
                {
                    x--;
                }
                if (mop.sideHit == 5)
                {
                    x++;
                }
                if (world.isAirBlock(x, y, z) || !world.getBlockMaterial(x, y, z).isSolid())
                {
                    if (world.provider.isHellWorld && isFull == Block.waterMoving.blockID)
                    {
                        world.playSoundEffect(x + 0.5D, y + 0.5D, z + 0.5D, "random.fizz", 0.5F, 2.6F + (world.rand.nextFloat() - world.rand.nextFloat()) * 0.8F);
                        for (int l = 0; l < 8; l++)
                        {
                            world.spawnParticle("largesmoke", (double)x + Math.random(), (double)y + Math.random(), (double)z + Math.random(), 0.0D, 0.0D, 0.0D);
                        }
                    }
                    else
                    {
                        world.setBlockAndMetadataWithNotify(x, y, z, isFull, 0);
                    }
                    return new ItemStack(Items.goldBucketEmpty);
                }
            }
        }
        else if (isFull == 0 && (mop.entityHit instanceof EntityCow))
        {
            return new ItemStack(Items.goldBucketMilk);
        }
        return itemstack;
    }

    public String getTextureFile()
    {
        return InfiCore.itemTexture;
    }
}
