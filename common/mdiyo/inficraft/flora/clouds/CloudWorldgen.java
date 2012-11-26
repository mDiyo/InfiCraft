package mDiyo.inficraft.flora.clouds;

import java.util.Random;

import net.minecraft.src.BiomeGenBase;
import net.minecraft.src.IChunkProvider;
import net.minecraft.src.World;
import cpw.mods.fml.common.IWorldGenerator;
import extrabiomes.api.BiomeManager;

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
		int xChunk = chunkX * 16, zChunk = chunkX * 16;
		BiomeGenBase biome = world.getWorldChunkManager().getBiomeGenAt(xChunk + 16, zChunk + 16);

		if (biome != BiomeGenBase.desert && biome != BiomeGenBase.desertHills 
				&& biome != BiomeManager.mountaindesert && biome != BiomeManager.mountainridge 
				&& random.nextInt(PHClouds.cloudSpawnDensity) == 0)
		{
			xCh = xChunk + random.nextInt(16) + 8;
			zCh = zChunk + random.nextInt(16) + 8;
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
		if (biome == BiomeGenBase.sky && random.nextInt(PHClouds.darkCloudSpawnDensity) < PHClouds.darkCloudSpawnDensity / 4)
		{
			xCh = xChunk + random.nextInt(16) + 8;
			zCh = zChunk + random.nextInt(16) + 8;
			for(int iter = 0; iter < PHClouds.darkCloudSpawnDensity / 4; iter++)
			{
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
			}
		}
		
		//Nether
		if (biome == BiomeGenBase.hell)
		{
			int xCor = xChunk + random.nextInt(16) + 8;
			int yCor = random.nextInt(128);
			int zCor = zChunk + random.nextInt(16) + 8;
			
			if (random.nextInt(PHClouds.ashSpawnDensity) < 5)
			{
				int j1 = xChunk + random.nextInt(16) + 8;
				int i4 = random.nextInt(PHClouds.ashSpawnRange) + PHClouds.ashSpawnHeight;
				int k6 = zChunk + random.nextInt(16) + 8;
				tinyashcloud.generate(world, random, j1, i4, k6);
			}
			if (random.nextInt(PHClouds.ashSpawnDensity) < 4)
			{
				int k1 = xChunk + random.nextInt(16) + 8;
				int j4 = random.nextInt(PHClouds.ashSpawnRange) + PHClouds.ashSpawnHeight;
				int l6 = zChunk + random.nextInt(16) + 8;
				smallashcloud.generate(world, random, k1, j4, l6);
			}
			else if (random.nextInt(PHClouds.ashSpawnDensity) < 3)
			{
				int l1 = xChunk + random.nextInt(16) + 8;
				int k4 = random.nextInt(PHClouds.ashSpawnRange) + PHClouds.ashSpawnHeight;
				int i7 = zChunk + random.nextInt(16) + 8;
				mediumashcloud.generate(world, random, l1, k4, i7);
			}
			else if (random.nextInt(PHClouds.ashSpawnDensity) < 2)
			{
				int i2 = xChunk + random.nextInt(16) + 8;
				int l4 = random.nextInt(PHClouds.ashSpawnRange) + PHClouds.ashSpawnHeight;
				int j7 = zChunk + random.nextInt(16) + 8;
				largeashcloud.generate(world, random, i2, l4, j7);
			}
			else if (random.nextInt(PHClouds.ashSpawnDensity) < 1)
			{
				int j2 = xChunk + random.nextInt(16) + 8;
				int i5 = random.nextInt(PHClouds.ashSpawnRange) + PHClouds.ashSpawnHeight;
				int k7 = zChunk + random.nextInt(16) + 8;
				hugeashcloud.generate(world, random, j2, i5, k7);
			}
			if (random.nextInt(PHClouds.sulfurSpawnDensity) < 5)
			{
				int k2 = xChunk + random.nextInt(16) + 8;
				int j5 = random.nextInt(PHClouds.sulfurSpawnRange) + PHClouds.sulfurSpawnHeight;
				int l7 = zChunk + random.nextInt(16) + 8;
				tinysulfurcloud.generate(world, random, k2, j5, l7);
			}
			if (random.nextInt(PHClouds.sulfurSpawnDensity) < 4)
			{
				int l2 = xChunk + random.nextInt(16) + 8;
				int k5 = random.nextInt(PHClouds.sulfurSpawnRange) + PHClouds.sulfurSpawnHeight;
				int i8 = zChunk + random.nextInt(16) + 8;
				smallsulfurcloud.generate(world, random, l2, k5, i8);
			}
			else if (random.nextInt(PHClouds.sulfurSpawnDensity) < 3)
			{
				int i3 = xChunk + random.nextInt(16) + 8;
				int l5 = random.nextInt(PHClouds.sulfurSpawnRange) + PHClouds.sulfurSpawnHeight;
				int j8 = zChunk + random.nextInt(16) + 8;
				mediumsulfurcloud.generate(world, random, i3, l5, j8);
			}
			else if (random.nextInt(PHClouds.sulfurSpawnDensity) < 2)
			{
				int j3 = xChunk + random.nextInt(16) + 8;
				int i6 = random.nextInt(PHClouds.sulfurSpawnRange) + PHClouds.sulfurSpawnHeight;
				int k8 = zChunk + random.nextInt(16) + 8;
				largesulfurcloud.generate(world, random, j3, i6, k8);
			}
			else if (random.nextInt(PHClouds.sulfurSpawnDensity) < 1)
			{
				int k3 = xChunk + random.nextInt(16) + 8;
				int j6 = random.nextInt(PHClouds.sulfurSpawnRange) + PHClouds.sulfurSpawnHeight;
				int l8 = zChunk + random.nextInt(16) + 8;
				hugesulfurcloud.generate(world, random, k3, j6, l8);
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
