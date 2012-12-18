package florasoma.crops;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockFlower;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.chunk.IChunkProvider;
import cpw.mods.fml.common.IWorldGenerator;

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
		if( random.nextInt(5) < 2 && biome.temperature > 0.1f && biome.rainfall > 0.1f && biome.temperature > 0.35f && biome.temperature <= 1.0f)
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
