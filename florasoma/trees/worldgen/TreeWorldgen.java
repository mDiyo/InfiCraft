package florasoma.trees.worldgen;

import java.util.Random;

import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import cpw.mods.fml.common.IWorldGenerator;
import florasoma.trees.PHTrees;

public class TreeWorldgen implements IWorldGenerator
{
	public TreeWorldgen()
	{
		genRedwood = new RedwoodTreeGen(false, PHTrees.redwoodID, 0);
		genBlood = new BloodTreeGen(3, 2);
		bush = new BushTreeGen(false, 2, 3, 2);
		pinkSakura = new SakuraTreeGen(false, 1, 0);
		whiteSakura = new WhiteTreeGen(false, 2, 1);
		eucalyptusShort = new EucalyptusTreeGenShort(0, 1);
	}

	RedwoodTreeGen genRedwood;
	BloodTreeGen genBlood;
	BushTreeGen bush;
	SakuraTreeGen pinkSakura;
	WhiteTreeGen whiteSakura;
	EucalyptusTreeGenShort eucalyptusShort;

	@Override
	public void generate (Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider)
	{
		int xSpawn, ySpawn, zSpawn;
		int xPos = chunkX * 16, zPos = chunkZ * 16;
		String biomeName = world.getWorldChunkManager().getBiomeGenAt(xPos, zPos).biomeName;
		
		if (biomeName == "Forest" || biomeName == "AutumnWoods" || biomeName == "BirchForest" || biomeName == "PineForest" || biomeName == "Rainforest" 
				|| biomeName == "TemperateRainforest" || biomeName == "Woodlands")
		{
			if (random.nextInt((int) (PHTrees.sakuraSpawnDensity * 5)) == 0)
			{
				for (int iter = 0; iter < 3; iter++)
				{
					ySpawn = random.nextInt(PHTrees.sakuraSpawnRange) + PHTrees.sakuraSpawnHeight;
					xSpawn = xPos + random.nextInt(16);
					zSpawn = zPos + random.nextInt(16);
					pinkSakura.generate(world, random, xSpawn, ySpawn, zSpawn);
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
			if (random.nextInt((int) PHTrees.redwoodSpawnDensity) == 0)
			{
				xSpawn = xPos + random.nextInt(16);
				zSpawn = zPos + random.nextInt(16);
				genRedwood.generate(world, random, xSpawn, 80, zSpawn);
			}
			if (random.nextInt((int) (PHTrees.eucalyptusShortSpawnDensity * 1.5)) == 0)
			{
				xSpawn = xPos + random.nextInt(16);
				ySpawn = random.nextInt(32) + PHTrees.seaLevel;
				zSpawn = zPos + random.nextInt(16);
				eucalyptusShort.generate(world, random, xSpawn, ySpawn, zSpawn);
			}
		}
		if (biomeName == "Extreme Hills" || biomeName == "Extreme Hills Edge" || biomeName == "ForestedHills" || biomeName == "GreenHills")
		{
			if (random.nextInt(PHTrees.bushSpawnDensity) == 0)
			{
				xSpawn = xPos + random.nextInt(16) + 8;
				ySpawn = random.nextInt(PHTrees.bushSpawnRange) + PHTrees.bushSpawnHeight;
				zSpawn = zPos + random.nextInt(16) + 8;
				bush.generate(world, random, xSpawn, ySpawn, zSpawn);
			}
			if (random.nextInt(PHTrees.eucalyptusShortSpawnDensity) < 10)
			{
				xSpawn = xPos + random.nextInt(16) + 8;
				ySpawn = random.nextInt(PHTrees.eucalyptusShortSpawnRange) + PHTrees.eucalyptusShortSpawnHeight;
				zSpawn = zPos + random.nextInt(16) + 8;
				eucalyptusShort.generate(world, random, xSpawn, ySpawn, zSpawn);
			}
		}
		if (biomeName == "River")
		{
			if (random.nextInt((int) (PHTrees.sakuraSpawnDensity)) == 0)
			{
				for (int iter = 0; iter < 3; iter++)
				{
					ySpawn = random.nextInt(PHTrees.sakuraSpawnRange) + PHTrees.sakuraSpawnHeight;
					xSpawn = xPos + random.nextInt(16);
					zSpawn = zPos + random.nextInt(16);
					pinkSakura.generate(world, random, xSpawn, ySpawn, zSpawn);
				}
			}
		}
		
		if (biomeName.equals("Hell"))
		{
			if (random.nextInt(PHTrees.bloodSpawnDensity) == 0)
			{
				ySpawn = random.nextInt(PHTrees.bloodSpawnRange) + PHTrees.bloodSpawnHeight;
				xSpawn = xPos + random.nextInt(16);
				zSpawn = zPos + random.nextInt(16);
				genBlood.generate(world, random, xSpawn, ySpawn, zSpawn);
			}
			if (random.nextInt(PHTrees.ghostSpawnDensity) == 0)
			{
				for (int iter = 0; iter < 3; iter++)
				{
					ySpawn = random.nextInt(PHTrees.ghostSpawnRange) + PHTrees.ghostSpawnHeight;
					xSpawn = xPos + random.nextInt(16);
					zSpawn = zPos + random.nextInt(16);
					whiteSakura.generate(world, random, xSpawn, ySpawn, zSpawn);
				}
			}
		}
	}
}
