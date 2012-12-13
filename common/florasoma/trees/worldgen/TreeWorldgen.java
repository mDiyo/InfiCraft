package florasoma.trees.worldgen;

import florasoma.trees.PHTrees;

import java.util.Random;

import net.minecraft.src.IChunkProvider;
import net.minecraft.src.World;
import cpw.mods.fml.common.IWorldGenerator;

public class TreeWorldgen implements IWorldGenerator
{
	public TreeWorldgen()
	{
		genRedwood = new RedwoodTreeGen(false, PHTrees.redwoodID, 0);
		genBlood = new BloodTreeGen(3, 1);
		sakura = new CherryTreeGen(false);
		whiteSakura = new WhiteTreeGen(false, PHTrees.treeID, 1);
		eucalyptusShort = new EucalyptusTreeGenShort(0, 1);
	}
	
	RedwoodTreeGen genRedwood;
	BloodTreeGen genBlood;
	CherryTreeGen sakura;
	WhiteTreeGen whiteSakura;
	EucalyptusTreeGenShort eucalyptusShort;
	
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world,
			IChunkProvider chunkGenerator, IChunkProvider chunkProvider) 
	{
		int xSpawn, ySpawn, zSpawn;
		int xPos = chunkX * 16, zPos = chunkZ * 16;
		String biomeName = world.getWorldChunkManager().getBiomeGenAt(xPos, zPos).biomeName;
		//System.out.println("Biome name: "+biomeName);
		
		/*if(random.nextInt((int)PHTrees.redwoodSpawnDensity) == 0)
		{
			xSpawn = xPos + random.nextInt(16);
			zSpawn = zPos + random.nextInt(16);
			genRedwood.generate(world, random, xSpawn, 80, zSpawn);
		}*/
		/*if (true)
		{
			xSpawn = xChunk + random.nextInt(16) + 8;
			ySpawn = random.nextInt(48) + 64;
			zSpawn = zChunk + random.nextInt(16) + 8;
			sakura.generate(world, random, xSpawn, ySpawn, zSpawn);
		}*/
		if (biomeName == "Forest" || biomeName == "AutumnWoods" || biomeName == "BirchForest" || biomeName == "PineForest"
			 || biomeName == "Rainforest" || biomeName == "TemperateRainforest" || biomeName == "Woodlands")
		{
			if(random.nextInt((int)(PHTrees.sakuraSpawnDensity * 1.4)) == 0)
			{
				for (int iter = 0; iter < PHTrees.sakuraSpawnDensity; iter++)
				{
					ySpawn = random.nextInt(PHTrees.sakuraSpawnRange) + PHTrees.sakuraSpawnHeight;
					xSpawn = xPos + random.nextInt(16);
					zSpawn = zPos + random.nextInt(16);
					sakura.generate(world, random, xSpawn, ySpawn, zSpawn);
				}
			}
			if (random.nextInt(PHTrees.eucalyptusShortSpawnDensity) == 0)
			{
				ySpawn = random.nextInt(PHTrees.eucalyptusShortSpawnRange) + PHTrees.eucalyptusShortSpawnHeight;
				xSpawn = xPos + random.nextInt(16);
				zSpawn = zPos + random.nextInt(16);
				eucalyptusShort.generate(world, random, xSpawn, ySpawn, zSpawn);
			}
		}
		if (biomeName == "Plains" || biomeName == "Meadow")
		{
			if(random.nextInt((int)PHTrees.redwoodSpawnDensity) == 0)
			{
				xSpawn = xPos + random.nextInt(16);
				zSpawn = zPos + random.nextInt(16);
				genRedwood.generate(world, random, xSpawn, 80, zSpawn);
			}
			if (random.nextInt((int)(PHTrees.eucalyptusShortSpawnDensity * 1.5)) == 0)
			{
				xSpawn = xPos + random.nextInt(16);
				ySpawn = random.nextInt(32) + PHTrees.seaLevel;
				zSpawn = zPos + random.nextInt(16);
				eucalyptusShort.generate(world, random, xSpawn, ySpawn, zSpawn);
			}
		}
		if (biomeName == "Extreme Hills" || biomeName == "Extreme Hills Edge" || biomeName == "ForestedHills" || biomeName == "GreenHills")
		{
			if(random.nextInt(PHTrees.sakuraSpawnDensity) == 0) 
			{
				xSpawn = xPos + random.nextInt(16) + 8;
				ySpawn = random.nextInt(48) + 64;
				zSpawn = zPos + random.nextInt(16) + 8;
				sakura.generate(world, random, xSpawn, ySpawn, zSpawn);
			}
			if (random.nextInt(PHTrees.eucalyptusShortSpawnDensity) < 10)
			{
				xSpawn = xPos + random.nextInt(16) + 8;
				ySpawn = random.nextInt(PHTrees.eucalyptusShortSpawnRange) + PHTrees.eucalyptusShortSpawnHeight;
				zSpawn = zPos + random.nextInt(16) + 8;
				eucalyptusShort.generate(world, random, xSpawn, ySpawn, zSpawn);
			}
		}
		
	}
}
