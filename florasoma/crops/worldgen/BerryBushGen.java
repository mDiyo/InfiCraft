package florasoma.crops.worldgen;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;
import florasoma.crops.FloraCrops;
import florasoma.crops.PHCrops;

public class BerryBushGen extends WorldGenerator
{
    private int metadata;
    private int spawnHeight;

    public BerryBushGen(int meta, int range)
    {
        metadata = meta;
        spawnHeight = range;
    }

    public boolean generate(World world, Random random, int x, int y, int z)
    {
        int height = findGround(world, x, y, z);
        if (height != -1)
        {
        	/*System.out.println("Base point: "+x+" "+height+" "+z);
        	switch(metadata)
        	{
        	case 0: System.out.println("Bush type: Raspberry"); break;
        	case 1: System.out.println("Bush type: Blueberry"); break;
        	case 2: System.out.println("Bush type: Blackberry"); break;
        	case 3: System.out.println("Bush type: Geoberry"); break;
        	}*/
            generateNode(world, random, x, height, z);
        }
        return true;
    }

    int findCloseGround(World world, int x, int y, int z)
    {
        int l = 0;
        int i1 = world.getBlockId(x, y - 1, z);
        if (!Block.opaqueCubeLookup[world.getBlockId(x, y, z)] && (i1 == Block.dirt.blockID || i1 == Block.grass.blockID))
        {
            return y;
        }
        int k1 = y + 2;
        do
        {
            if (k1 < y - 2)
            {
                break;
            }
            int j1 = world.getBlockId(x, k1, z);
            if (j1 == Block.dirt.blockID || j1 == Block.grass.blockID)
            {
                if (!Block.opaqueCubeLookup[world.getBlockId(x, k1 + 1, z)])
                {
                    l = k1 + 1;
                }
                break;
            }
            k1--;
        }
        while (true);
        return l;
    }

    int findGround(World world, int x, int y, int z)
    {
        int returnHeight = -1;
        int blockID = world.getBlockId(x, y - 1, z);
        if (!Block.opaqueCubeLookup[world.getBlockId(x, y, z)] && (blockID == Block.dirt.blockID || blockID == Block.grass.blockID))
        {
            return y;
        }
        int height = spawnHeight;
        do
        {
            if (height < PHCrops.seaLevel)
            {
                break;
            }
            int j1 = world.getBlockId(x, height, z);
            if (j1 == Block.dirt.blockID || j1 == Block.grass.blockID)
            {
                if (!Block.opaqueCubeLookup[world.getBlockId(x, height + 1, z)])
                {
                    returnHeight = height + 1;
                }
                break;
            }
            height--;
        }
        while (true);
        return returnHeight;
    }

    public boolean generateNode(World world, Random random, int x, int y, int z)
    {
        for (int l = x - 2; l <= x + 2; l++)
        {
            for (int l1 = z - 1; l1 <= z + 1; l1++)
            {
                for (int l2 = y - 1; l2 <= y; l2++)
                {
                    if (Block.opaqueCubeLookup[world.getBlockId(l, l2, l1)])
                    {
                        continue;
                    }
                    int l3 = random.nextInt(5);
                    int l4 = 0;
                    if (l3 == 4)
                    {
                        l4 = 1;
                    }
                    setBlockAndMetadata(world, l, l2, l1, FloraCrops.instance.berryBush.blockID, metadata + 8 + l4 * 4);
                }
            }
        }

        for (int i1 = x - 1; i1 <= x + 1; i1++)
        {
            for (int i2 = z - 2; i2 <= z - 2; i2++)
            {
                for (int i3 = y - 1; i3 <= y; i3++)
                {
                    if (Block.opaqueCubeLookup[world.getBlockId(i1, i3, i2)])
                    {
                        continue;
                    }
                    int i4 = random.nextInt(5);
                    int i5 = 0;
                    if (i4 == 4)
                    {
                        i5 = 1;
                    }
                    setBlockAndMetadata(world, i1, i3, i2, FloraCrops.instance.berryBush.blockID, metadata + 8 + i5 * 4);
                }
            }
        }

        for (int j1 = x - 1; j1 <= x + 1; j1++)
        {
            for (int j2 = z + 2; j2 <= z + 2; j2++)
            {
                for (int j3 = y - 1; j3 <= y; j3++)
                {
                    if (Block.opaqueCubeLookup[world.getBlockId(j1, j3, j2)])
                    {
                        continue;
                    }
                    int j4 = random.nextInt(5);
                    int j5 = 0;
                    if (j4 == 4)
                    {
                        j5 = 1;
                    }
                    setBlockAndMetadata(world, j1, j3, j2, FloraCrops.instance.berryBush.blockID, metadata + 8 + j5 * 4);
                }
            }
        }

        for (int k1 = x - 1; k1 <= x + 1; k1++)
        {
            for (int k2 = z - 1; k2 <= z + 1; k2++)
            {
                int k3 = y + 1;
                if (Block.opaqueCubeLookup[world.getBlockId(k1, k3, k2)])
                {
                    continue;
                }
                int k4 = random.nextInt(5);
                int k5 = 0;
                if (k4 == 4)
                {
                    k5 = 1;
                }
                setBlockAndMetadata(world, k1, k3, k2, FloraCrops.instance.berryBush.blockID, metadata + 8 + k5 * 4);
            }
        }

        return true;
    }
}
