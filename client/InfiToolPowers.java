package net.minecraft.src;

import java.util.Random;

import net.minecraft.src.forge.ForgeHooks;

public class InfiToolPowers
{
    private static Random random = new Random();

    public static void splintering(int x, int y, int z, Item item, World world)
    {
        if (random.nextInt(100) + 1 <= 5)
        {
            EntityItem entityitem = new EntityItem(world, x, y, z, new ItemStack(item.shiftedIndex, 1, 0));
            entityitem.delayBeforeCanPickup = 10;
            world.spawnEntityInWorld(entityitem);
        }
    }

    public static void splinterAttack(EntityLiving entityliving, Item item, World world)
    {
        if (random.nextInt(100) + 1 <= 2)
        {
            EntityItem entityitem = new EntityItem(world, entityliving.posX, entityliving.posY - 1.0D, entityliving.posZ, new ItemStack(item.shiftedIndex, 1, 0));
            world.spawnEntityInWorld(entityitem);
        }
    }
    
    public static boolean searchForBlock(World world, int bID, int x, int y, int z, int radius)
    {
        for (int xIter = y - x; xIter <= y + x; xIter++)
        {
            for (int yIter = z - x; yIter <= z + x; yIter++)
            {
                for (int zIter = radius - x; zIter <= radius + x; zIter++)
                {
                    if (world.getBlockId(xIter, yIter, zIter) == bID)
                    {
                        return true;
                    }
                }
            }
        }

        return false;
    }

    public static void freezing(int x, int y, int z, int blockID, int meta, World world, EntityLiving entityliving)
    {
        for (int xIter = x - 1; xIter <= x + 1; xIter++)
        {
            for (int yIter = y - 1; yIter <= y + 1; yIter++)
            {
                for (int zIter = z - 1; zIter <= z + 1; zIter++)
                {
                    if (world.getBlockId(xIter, yIter, zIter) == Block.waterStill.blockID || world.getBlockId(xIter, yIter, zIter) == Block.waterMoving.blockID)
                    {
                        world.setBlockWithNotify(xIter, yIter, zIter, Block.ice.blockID);
                    }
                }
            }
        }

        if (blockID != Block.ice.blockID && ForgeHooks.canHarvestBlock(Block.blocksList[blockID], (EntityPlayer) entityliving, meta))
        {
            Block.blocksList[blockID].harvestBlock(world, (EntityPlayer)entityliving, x, y, z, meta);
        }
    }

    public static void burning(int x, int y, int z, int l, int i1, World world, EntityLiving entityliving)
    {
        int id = burn(l);
        int md = burnMd(l);
        if (l == id)
        {
            Block.blocksList[l].harvestBlock(world, (EntityPlayer)entityliving, x, y, z, i1);
        }
        else if (id == Item.brick.shiftedIndex)
        {
            spawnItem(x, y, z, id, 1, md, world);
            spawnItem(x, y, z, id, 1, md, world);
            spawnItem(x, y, z, id, 1, md, world);
            spawnItem(x, y, z, id, 1, md, world);
        }
        else
        {
            if (id == mod_InfiBase.stoneShard.shiftedIndex)
            {
                id = Block.stone.blockID;
            }
            spawnItem(x, y, z, id, 1, md, world);
        }
    }

    private static int burn(int i)
    {
        int j = i;
        switch (i)
        {
            case 1:
                j = mod_InfiBase.stoneShard.shiftedIndex;
                break;

            case 4:
                j = Block.stone.blockID;
                break;

            case 12:
                j = Block.glass.blockID;
                break;

            case 14:
                j = Item.ingotGold.shiftedIndex;
                break;

            case 15:
                j = Item.ingotIron.shiftedIndex;
                break;

            case 17:
                j = Item.coal.shiftedIndex;
                break;

            case 82:
                j = Item.brick.shiftedIndex;
                break;
        }
        return j;
    }

    private static int burnMd(int i)
    {
        int j = i;
        switch (i)
        {
            case 17:
                j = 1;
                break;

            default:
                j = 0;
                break;
        }
        return j;
    }

    public static void slimePower(int x, int y, int z, World world)
    {
        if (random.nextInt(100) + 1 <= 12)
        {
            int id = 0;
            switch (random.nextInt(5) + 1)
            {
                case 1:
                    id = Item.slimeBall.shiftedIndex;
                    break;

                case 2:
                    id = Item.slimeBall.shiftedIndex;
                    break;

                case 3:
                    id = Block.plantYellow.blockID;
                    break;

                case 4:
                    id = Block.plantRed.blockID;
                    break;

                case 5:
                    id = Item.seeds.shiftedIndex;
                    break;
            }
            spawnItem(x, y, z, id, 1, 0, world);
        }
        if (random.nextInt(100) + 1 <= 5)
        {
            EntitySlime entityslime = new EntitySlime(world);
            entityslime.setSlimeSize(1);
            entityslime.setPosition((double)x + 0.5D, (double)y + 0.5D, (double)z + 0.5D);
            world.spawnEntityInWorld(entityslime);
        }
    }
    
    /*public static void spawnItem(int x, int y, int z, int id, World world)
    {
    	spawnItem(x, y, z, id, 1, 0, world);
    }*/

    public static void spawnItem(int x, int y, int z, int id, int num, int md, World world)
    {
        EntityItem entityitem = new EntityItem(world, (double)x + 0.5D, (double)y + 0.5D, (double)z + 0.5D, new ItemStack(id, num, md));
        entityitem.delayBeforeCanPickup = 10;
        world.spawnEntityInWorld(entityitem);
    }
    
    /*public static void spawnItem(int x, int y, int z, ItemStack stack, World world)
    {
        spawnItem(x, y, z, stack, world);
    }*/
    
    public static void spawnItem(double x, double y, double z, ItemStack stack, World world)
    {
        EntityItem entityitem = new EntityItem(world, x + 0.5D, y + 0.5D, z + 0.5D, stack);
        entityitem.delayBeforeCanPickup = 10;
        world.spawnEntityInWorld(entityitem);
    }
}
