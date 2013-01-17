package florasoma.crops.worldgen;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockFlower;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.chunk.IChunkProvider;
import cpw.mods.fml.common.IWorldGenerator;
import florasoma.crops.PHCrops;

/* Adds crops to the overworld
 * Current crops: Barley, Berry bushes
 */

public class CropBaseWorldgen implements IWorldGenerator
{
	
	public CropBaseWorldgen()
	{
		raspgen = new BerryBushGen(0, PHCrops.seaLevel + PHCrops.raspSpawnRange);
		bluegen = new BerryBushGen(1, PHCrops.seaLevel + PHCrops.blueSpawnRange);
		blackgen = new BerryBushGen(2, PHCrops.seaLevel + PHCrops.blackSpawnRange);
		geogen = new BerryBushGen(3, PHCrops.seaLevel + PHCrops.geoSpawnRange);
	}
	
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) 
	{
		final int xChunk = chunkX * 16, zChunk = chunkZ * 16;
		int xCh = chunkX * 16 + random.nextInt(16);
		int yCh = random.nextInt(128);
		int zCh = chunkZ * 16 + random.nextInt(16);
		
		BiomeGenBase biome = world.getWorldChunkManager().getBiomeGenAt(chunkX * 16 + 16, chunkZ * 16 + 16);

		//Barley
		if (PHCrops.enableBarley && random.nextInt(5) == 0 && goodClimate(biome, 0.11f, 1.0f, 0.11f, 2f))
		{
			generateBarley(world, random, xCh, yCh + PHCrops.barleySpawnRange - 64, zCh);
			generateBarley(world, random, xCh, yCh + PHCrops.barleySpawnRange - 64, zCh);
		}
		
		//Berry bushes
		if (PHCrops.enableBerries)
		{
			if(random.nextInt(PHCrops.raspSpawnDensity) == 0 && goodClimate(biome, 0.5f, 2.0f, 0.2f, 0.4f))
			{				
				xCh = xChunk + random.nextInt(16);
				yCh = random.nextInt(PHCrops.raspSpawnRange) + PHCrops.seaLevel;
				zCh = zChunk + random.nextInt(16);
				raspgen.generate(world, random, xCh, yCh, zCh);
			}
			
			if (random.nextInt(PHCrops.blueSpawnDensity) == 0 && goodClimate(biome, 0.3f, 0.81f, 0.3f, 0.8f))
			{
				xCh = xChunk + random.nextInt(16);
				yCh = random.nextInt(PHCrops.blueSpawnRange) + PHCrops.seaLevel;
				zCh = zChunk + random.nextInt(16);
				bluegen.generate(world, random, xCh, yCh, zCh);
			}
			
			if (random.nextInt(PHCrops.blackSpawnDensity) == 0 && goodClimate(biome, 0.5f, 5.0f, 0.7f, 3.0f))
			{
				xCh = xChunk + random.nextInt(16);
				yCh = random.nextInt(PHCrops.blackSpawnRange) + PHCrops.seaLevel;
				zCh = zChunk + random.nextInt(16);
				blackgen.generate(world, random, xCh, yCh, zCh);
			}
			
			if (random.nextInt(PHCrops.geoSpawnDensity) == 0 && goodClimate(biome, 0.0f, 0.3f, 0.0f, 5.0f))
			{
				xCh = xChunk + random.nextInt(16);
				yCh = random.nextInt(PHCrops.geoSpawnRange) + PHCrops.seaLevel;
				zCh = zChunk + random.nextInt(16);
				geogen.generate(world, random, xCh, yCh, zCh);
			}
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
	
	public boolean goodClimate(BiomeGenBase biome, float minTemp, float maxTemp, float minRain, float maxRain)
	{
		float temp = biome.temperature;
		float rain = biome.rainfall;
		//System.out.println("Biome: "+biome.biomeName+", temp: "+temp+", rain: "+rain);
		if (minTemp <= temp && temp <= maxTemp && minRain <= rain && rain <= maxRain)
			return true;
		/*{
			System.out.println("Biome: "+biome.biomeName+", temp: "+temp+", rain: "+rain);
			System.out.println("minTemp: "+minTemp+", maxTemp: "+maxTemp+", minRain: "+minRain+", maxRain: "+maxRain);
			return true;
		}*/
		return false;
	}
	
	BerryBushGen raspgen;
	BerryBushGen bluegen;
	BerryBushGen blackgen;
	BerryBushGen geogen;
}
