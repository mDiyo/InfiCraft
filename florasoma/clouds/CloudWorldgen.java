package florasoma.clouds;

import java.util.Random;

import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.chunk.IChunkProvider;
import cpw.mods.fml.common.IWorldGenerator;

/* Generates clouds in every dimension
 * Current clouds: Normal, Dark, Sulfur, Ash
 * Overworld: Normal
 * Nether: Sulfur, Ash
 * End: Normal, Dark
 */

public class CloudWorldgen implements IWorldGenerator
{
	
	public CloudWorldgen()
	{
		smallcloud = new CloudGen(PHClouds.cloudID, 0, 10, false);
		mediumcloud = new CloudGen(PHClouds.cloudID, 0, 20, false);
		largecloud = new CloudGen(PHClouds.cloudID, 0, 30, false);
		hugecloud = new CloudGen(PHClouds.cloudID, 0, 40, false);
		smalldarkcloud = new CloudGen(PHClouds.cloudID, 1, 10, false);
		mediumdarkcloud = new CloudGen(PHClouds.cloudID, 1, 20, false);
		largedarkcloud = new CloudGen(PHClouds.cloudID, 1, 30, false);
		hugedarkcloud = new CloudGen(PHClouds.cloudID, 1, 40, false);
		tinyashcloud = new CloudGen(PHClouds.cloudID, 2, 3, false);
		smallashcloud = new CloudGen(PHClouds.cloudID, 2, 10, false);
		mediumashcloud = new CloudGen(PHClouds.cloudID, 2, 18, false);
		largeashcloud = new CloudGen(PHClouds.cloudID, 2, 27, false);
		hugeashcloud = new CloudGen(PHClouds.cloudID, 2, 37, false);
		tinysulfurcloud = new CloudGen(PHClouds.cloudID, 3, 3, false);
		smallsulfurcloud = new CloudGen(PHClouds.cloudID, 3, 10, false);
		mediumsulfurcloud = new CloudGen(PHClouds.cloudID, 3, 18, false);
		largesulfurcloud = new CloudGen(PHClouds.cloudID, 3, 27, false);
		hugesulfurcloud = new CloudGen(PHClouds.cloudID, 3, 37, false);
	}

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world,
			IChunkProvider chunkGenerator, IChunkProvider chunkProvider) 
	{
		//Overworld
		int xCh, yCh, zCh;		
		int xChunk = chunkX * 16, zChunk = chunkZ * 16;
		BiomeGenBase biome = world.getWorldChunkManager().getBiomeGenAt(xChunk + 16, zChunk + 16);

		if (biome.rainfall > 0.15f && random.nextInt(PHClouds.cloudSpawnDensity) == 0)
		{
			xCh = xChunk + random.nextInt(16);
			zCh = zChunk + random.nextInt(16);
			yCh = random.nextInt(PHClouds.cloudSpawnRange) + PHClouds.cloudSpawnHeight;
			int size = random.nextInt(12);
			if (size < 5)
			{
				smallcloud.generate(world, random, xCh, yCh, zCh);
			}
			else if (size < 9)
			{
				mediumcloud.generate(world, random, xCh, yCh, zCh);
			}
			else if (size < 11)
			{
				largecloud.generate(world, random, xCh, yCh, zCh);
			}
			else
			{
				hugecloud.generate(world, random, xCh, yCh, zCh);
			}
		}
		
		//End Generation
		if (biome == BiomeGenBase.sky && random.nextInt(4) == 0)
		{
			xCh = xChunk * 16 + random.nextInt(16);
			zCh = zChunk * 16 + random.nextInt(16);
			//for(int iter = 0; iter < PHClouds.darkCloudSpawnDensity; iter++)
			//{
				int height = random.nextInt(PHClouds.darkCloudSpawnRange);
				if (random.nextInt(5) == 0)
				{
					smalldarkcloud.generate(world, random, xCh, height + PHClouds.darkCloudSpawnHeight - 64, zCh);
				}
				else if (random.nextInt(4) == 0)
				{
					mediumcloud.generate(world, random, xCh, height + PHClouds.darkCloudSpawnHeight - 64, zCh);
				}
				else if (random.nextInt(3) == 0)
				{
					largedarkcloud.generate(world, random, xCh, height + PHClouds.darkCloudSpawnHeight - 64, zCh);
				}
				if (random.nextInt(2) == 0)
				{
					hugedarkcloud.generate(world, random, xCh, height + PHClouds.darkCloudSpawnHeight - 64, zCh);
				}
			//}
		}
		
		//Nether
		if (biome == BiomeGenBase.hell)
		{			
			if (random.nextInt(4) == 0)
			{
				//for (int i = 0; i < PHClouds.ashSpawnDensity; i++)
				//{
					xCh = xChunk + random.nextInt(16);
					yCh = random.nextInt(PHClouds.ashSpawnRange) + PHClouds.ashSpawnHeight;
					zCh = zChunk + random.nextInt(16);
					int size = random.nextInt(12);
					if (size < 5)
					{
						tinyashcloud.generate(world, random, xCh, yCh, zCh);
					}
					else if (size < 9)
					{
						smallashcloud.generate(world, random, xCh, yCh, zCh);
					}
					else if (size < 11)
					{
						largeashcloud.generate(world, random, xCh, yCh, zCh);
					}
					else
					{
						hugeashcloud.generate(world, random, xCh, yCh, zCh);
					}
				//}
			}
			
			if (random.nextInt(4) == 0)
			{
				//for (int i = 0; i < PHClouds.sulfurSpawnDensity; i++)
				//{
					xCh = xChunk + random.nextInt(16);
					yCh = random.nextInt(PHClouds.sulfurSpawnRange) + PHClouds.sulfurSpawnHeight;
					zCh = zChunk + random.nextInt(16);
					int size = random.nextInt(12);
					if (size < 5)
					{
						tinysulfurcloud.generate(world, random, xCh, yCh, zCh);
					}
					else if (size < 9)
					{
						smallsulfurcloud.generate(world, random, xCh, yCh, zCh);
					}
					else if (size < 11)
					{
						largesulfurcloud.generate(world, random, xCh, yCh, zCh);
					}
					else
					{
						hugesulfurcloud.generate(world, random, xCh, yCh, zCh);
					}
				//}
			}
		}
	}
	
	CloudGen smallcloud;
	CloudGen mediumcloud;
	CloudGen largecloud;
	CloudGen hugecloud;
	CloudGen smalldarkcloud;
	CloudGen mediumdarkcloud;
	CloudGen largedarkcloud;
	CloudGen hugedarkcloud;
	CloudGen tinyashcloud;
	CloudGen smallashcloud;
	CloudGen mediumashcloud;
	CloudGen largeashcloud;
	CloudGen hugeashcloud;
	CloudGen tinysulfurcloud;
	CloudGen smallsulfurcloud;
	CloudGen mediumsulfurcloud;
	CloudGen largesulfurcloud;
	CloudGen hugesulfurcloud;

}
