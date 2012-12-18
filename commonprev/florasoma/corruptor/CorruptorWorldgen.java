package florasoma.corruptor;

import java.util.Random;

import net.minecraft.src.IChunkProvider;
import net.minecraft.src.World;
import net.minecraft.src.WorldProviderHell;
import cpw.mods.fml.common.IWorldGenerator;

public class CorruptorWorldgen implements IWorldGenerator
{
	public CorruptorWorldgen()
	{
		corruptred = new CorruptorGen(PHCorruptor.corruptorID, 0, PHCorruptor.corruptorSpawnSize);
		corruptblue = new CorruptorGen(PHCorruptor.corruptorID, 1, PHCorruptor.corruptorSpawnSize);
		corruptgreen = new CorruptorGen(PHCorruptor.corruptorID, 2, PHCorruptor.corruptorSpawnSize);
		corruptamber = new CorruptorGen(PHCorruptor.corruptorID, 3, PHCorruptor.corruptorSpawnSize);
		corruptmagenta = new CorruptorGen(PHCorruptor.corruptorID, 4, PHCorruptor.corruptorSpawnSize);
		corruptpurple = new CorruptorGen(PHCorruptor.corruptorID, 5, PHCorruptor.corruptorSpawnSize);
		corruptyellow = new CorruptorGen(PHCorruptor.corruptorID, 6, PHCorruptor.corruptorSpawnSize);
		corruptsilver = new CorruptorGen(PHCorruptor.corruptorID, 7, PHCorruptor.corruptorSpawnSize);
	}

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world,
			IChunkProvider chunkGenerator, IChunkProvider chunkProvider) 
	{
		if (chunkGenerator == WorldProviderHell.getProviderForDimension(-1))
		{
			int xCor, yCor, zCor;		
			
			xCor = chunkX * 16 + random.nextInt(16) + 8;
			yCor = random.nextInt(PHCorruptor.corruptorSpawnRange) + PHCorruptor.corruptorSpawnHeight;
			zCor = chunkZ * 16 + random.nextInt(16) + 8;
			int color = random.nextInt(8);
			
			for(int iter = 0; iter < PHCorruptor.corruptorSpawnDensity; iter++)
			{
				switch (color)
				{
					case 0:	corruptred.generate(world, random, xCor, yCor, zCor);		break;
					case 1:	corruptblue.generate(world, random, xCor, yCor, zCor);		break;
					case 2:	corruptgreen.generate(world, random, xCor, yCor, zCor);		break;
					case 3:	corruptamber.generate(world, random, xCor, yCor, zCor);		break;
					case 4:	corruptmagenta.generate(world, random, xCor, yCor, zCor);	break;
					case 5:	corruptpurple.generate(world, random, xCor, yCor, zCor);	break;
					case 6:	corruptyellow.generate(world, random, xCor, yCor, zCor);	break;
					case 7:	corruptsilver.generate(world, random, xCor, yCor, zCor);	break;
				}
			}
		}	
		
	}
	
	CorruptorGen corruptred;
	CorruptorGen corruptblue;
	CorruptorGen corruptgreen;
	CorruptorGen corruptamber;
	CorruptorGen corruptmagenta;
	CorruptorGen corruptpurple;
	CorruptorGen corruptyellow;
	CorruptorGen corruptsilver;
}
