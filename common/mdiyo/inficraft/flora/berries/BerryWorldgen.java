package mDiyo.inficraft.flora.berries;

import java.util.Random;

import net.minecraft.src.BiomeGenBase;
import net.minecraft.src.IChunkProvider;
import net.minecraft.src.World;
import cpw.mods.fml.common.IWorldGenerator;
import extrabiomes.api.BiomeManager;

/* Generates berry bushes in the overworld 
 * Current bushes: Blueberry, Blackberry, Raspberry, Geoberry
 */

public class BerryWorldgen implements IWorldGenerator
{
	
	public BerryWorldgen()
	{
		raspgen = new BerryBushGen(0);
		bluegen = new BerryBushGen(1);
		blackgen = new BerryBushGen(2);
		geogen = new BerryBushGen(3);
	}

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world,
			IChunkProvider chunkGenerator, IChunkProvider chunkProvider) 
	{
		// Chunks are fed in as raw numbers. Multiply by 16 to get the block
		int xPos = chunkX * 16;
		int zPos = chunkZ * 16;
		int xCh, yCh, zCh;
		BiomeGenBase biome = world.getWorldChunkManager().getBiomeGenAt(chunkX, chunkZ);
		
		if (biome == BiomeGenBase.forest || biome == BiomeManager.autumnwoods ||
				biome == BiomeManager.birchforest || biome == BiomeManager.pineforest ||
				biome == BiomeManager.rainforest || biome == BiomeManager.rainforest ||
				biome == BiomeManager.temperaterainforest || biome == BiomeManager.woodlands)
		{
			if(random.nextInt(PHBerries.raspSpawnDensity) == 0)
			{				
				xCh = xPos + random.nextInt(16) + 8;
				yCh = random.nextInt(PHBerries.raspSpawnRange) + PHBerries.raspSpawnHeight - 64;
				zCh = zPos + random.nextInt(16) + 8;
				raspgen.generate(world, random, xCh, yCh, zCh);
				System.out.println("Raspberry bush generated at: " + xCh + " " + yCh + " " + zCh);
			}
		}
		
		if (biome == BiomeGenBase.plains || biome == BiomeManager.meadow)
		{
			if (random.nextInt(PHBerries.blueSpawnDensity) == 0)
			{
				xCh = xPos + random.nextInt(16) + 8;
				yCh = random.nextInt(PHBerries.blueSpawnRange) + PHBerries.blueSpawnHeight - 64;
				zCh = zPos + random.nextInt(16) + 8;
				bluegen.generate(world, random, xCh, yCh, zCh);
				System.out.println("Blueberry bush generated at: " + xCh + " " + yCh + " " + zCh);
			}
		}
		
		if (biome == BiomeGenBase.extremeHills || biome == BiomeManager.forestedhills
				|| biome == BiomeManager.greenhills)
		{
			if(random.nextInt(PHBerries.raspSpawnDensity / 2) == 0) 
			{				
				xCh = xPos + random.nextInt(16) + 8;
				yCh = random.nextInt(PHBerries.raspSpawnRange) + PHBerries.raspSpawnHeight - 64;
				zCh = zPos + random.nextInt(16) + 8;
				raspgen.generate(world, random, xCh, yCh, zCh);
				System.out.println("Raspberry bush generated at: " + xCh + " " + yCh + " " + zCh);
			}
		}
		
		if (biome == BiomeGenBase.taiga || biome == BiomeManager.snowforest
				|| biome == BiomeManager.snowyrainforest)
		{
			if (random.nextInt(PHBerries.geoSpawnDensity) == 0)
			{
				xCh = xPos + random.nextInt(16) + 8;
				yCh = random.nextInt(PHBerries.geoSpawnRange) + PHBerries.geoSpawnHeight - 64;
				zCh = zPos + random.nextInt(16) + 8;
				geogen.generate(world, random, xCh, yCh, zCh);
				System.out.println("Geoberry bush generated at: " + xCh + " " + yCh + " " + zCh);
			}
		}
		
		if (biome == BiomeGenBase.swampland || biome == BiomeManager.greenswamp)
		{
			for (int iter = 0; iter < (int)(PHBerries.blackSpawnDensity / 5); iter++)
			{				
				xCh = xPos + random.nextInt(16) + 8;
				yCh = random.nextInt(PHBerries.blackSpawnRange) + PHBerries.blackSpawnHeight - 64;
				zCh = zPos + random.nextInt(16) + 8;
				blackgen.generate(world, random, xCh, yCh, zCh);
				System.out.println("Blackberry bush generated at: " + xCh + " " + yCh + " " + zCh);
			}
		}
		
		if (biome == BiomeGenBase.river)
		{
			if (random.nextInt(PHBerries.blackSpawnDensity * 2) == 0)
			{
				xCh = xPos + random.nextInt(16) + 8;
				yCh = random.nextInt(PHBerries.blackSpawnRange) + PHBerries.blackSpawnHeight - 64;
				zCh = zPos + random.nextInt(16) + 8;
				blackgen.generate(world, random, xCh, yCh, zCh);
				System.out.println("Blackberry bush generated at: " + xCh + " " + yCh + " " + zCh);
			}
		}		
	}
	
	BerryBushGen raspgen;
	BerryBushGen bluegen;
	BerryBushGen blackgen;
	BerryBushGen geogen;
}
