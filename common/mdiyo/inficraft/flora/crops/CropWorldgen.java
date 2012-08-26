package mdiyo.inficraft.flora.crops;

import java.util.Random;

import net.minecraft.src.BiomeGenBase;
import net.minecraft.src.Block;
import net.minecraft.src.BlockFlower;
import net.minecraft.src.IChunkProvider;
import net.minecraft.src.World;
import cpw.mods.fml.common.IWorldGenerator;
import extrabiomes.api.BiomeManager;

/* Adds crops to the overworld
 * Current crops: Barley
 */

public class CropWorldgen implements IWorldGenerator
{
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world,
			IChunkProvider chunkGenerator, IChunkProvider chunkProvider) 
	{
		int xCh = chunkX * 16 + random.nextInt(16) + 8;
		int yCh = random.nextInt(128);
		int zCh = chunkZ * 16 + random.nextInt(16) + 8;
		
		BiomeGenBase biome = world.getWorldChunkManager().getBiomeGenAt(chunkX * 16 + 16, chunkZ * 16 + 16);
		if( random.nextInt(5) < 2 && (biome == BiomeGenBase.plains 
				|| biome == BiomeGenBase.forest || biome == BiomeGenBase.forestHills || 
				biome == BiomeGenBase.extremeHills || biome == BiomeGenBase.extremeHillsEdge ||
				biome == BiomeManager.autumnwoods || biome == BiomeManager.birchforest ||
				biome == BiomeManager.forestedhills || biome == BiomeManager.forestedisland ||
				biome == BiomeManager.greenhills || biome == BiomeManager.meadow ||
				biome == BiomeManager.pineforest || biome == BiomeManager.rainforest ||
				biome == BiomeManager.redwoodforest || biome == BiomeManager.redwoodlush ||
				biome == BiomeManager.savanna || biome == BiomeManager.shrubland ||
				biome == BiomeManager.temperaterainforest || biome == BiomeManager.woodlands))
		{
			generateBarley(world, random, xCh, yCh + PHCrops.barleySpawnHeight - 64, zCh);
			generateBarley(world, random, xCh, yCh + PHCrops.barleySpawnHeight - 64, zCh);
		}
		
	}
	
	public boolean generateBarley(World world, Random random, int x, int y, int z)
    {
        for (int tries = 0; tries < 64; tries++)
        {
            int i1 = (x + random.nextInt(8)) - random.nextInt(8);
            int j1 = (y + random.nextInt(4)) - random.nextInt(4);
            int k1 = (z + random.nextInt(8)) - random.nextInt(8);
            if (world.isAirBlock(i1, j1, k1) && ((BlockFlower)Block.blocksList[Block.plantYellow.blockID]).canBlockStay(world, i1, j1, k1))
            {
                world.setBlockAndMetadata(i1, j1, k1, PHCrops.floraCropsID, 3);
            }
        }

        return true;
    }
}
