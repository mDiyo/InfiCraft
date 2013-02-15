package inficraft.orizon.pastelmarble;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;

public class PastelGenerator implements IWorldGenerator
{
	public PastelGenerator()
	{
		marbleWhite = new WorldGenMinable(PastelMarble.instance.marble.blockID, 0, 40);
		marbleBlack = new WorldGenMinable(PastelMarble.instance.marble.blockID, 1, 40);
		marbleRose = new WorldGenMinable(PastelMarble.instance.marble.blockID, 2, 40);
		marbleEmerald = new WorldGenMinable(PastelMarble.instance.marble.blockID, 3, 40);
		marbleAzure = new WorldGenMinable(PastelMarble.instance.marble.blockID, 4, 40);
		
		coloredStone = new StoneGenColor(PastelMarble.instance.cStone.blockID, 20);
	}
	
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world,
			IChunkProvider chunkGenerator, IChunkProvider chunkProvider) 
	{
		if(PHPastel.superfun)
    	{
    		for(int iterX = chunkX*16; iterX < chunkX*16 + 16; iterX++) {
    			for (int iterZ = chunkZ*16; iterZ < chunkZ*16 + 16; iterZ++) {
    				for(int iterY = 0; iterY < 121; iterY++) 
    				{
    					int bID = world.getBlockId(iterX, iterY, iterZ);
    					if (bID == Block.waterStill.blockID)
    						world.setBlock(iterX, iterY, iterZ, Block.oreEmerald.blockID);
    					else if (bID != 0)
    						world.setBlock(iterX, iterY, iterZ, Block.oreDiamond.blockID);
    				}
    			}
    		}
    	}
    	else
    	{
	        if(PHPastel.genMarble)
	            generateMarble(world, random, chunkX*16, chunkZ*16);
	        if(PHPastel.genColoredStone)
	        	generateColoredStone(world, random, chunkX*16, chunkZ*16);
	        if(PHPastel.genStratifiedStone)
	            generateStratifiedStone(world, random, chunkX*16, chunkZ*16);	        
    	}
	}
	
	public void generateStratifiedStone(World world, Random rand, int chunkX, int chunkZ)
	{
		for(int x = chunkX; x < chunkX + 16; x++) {
			for(int z = chunkZ; z < chunkZ + 16; z++) {
				
				for(int y = 0; y < 16; y++) {
					int bID = world.getBlockId(x, y, z);
					if(bID == Block.stone.blockID)
						world.setBlockAndMetadata(x, y, z, PHPastel.cStoneID, 2);
				}
				for(int y = 16; y < 32; y++) {
					int bID = world.getBlockId(x, y, z);
					if(bID == Block.stone.blockID)
						world.setBlockAndMetadata(x, y, z, PHPastel.cStoneID, 1);
				}
				for(int y = 32; y < 48; y++) {
					int bID = world.getBlockId(x, y, z);
					if(bID == Block.stone.blockID)
						world.setBlockAndMetadata(x, y, z, PHPastel.cStoneID, 0);
				}
				for(int y = 64; y < 128; y++) {
					int bID = world.getBlockId(x, y, z);
					if(bID == Block.stone.blockID)
						world.setBlockAndMetadata(x, y, z, PHPastel.cStoneID, 3);
				}
			}
		}
	}
	
	public void generateColoredStone(World world, Random rand, int chunkX, int chunkZ) {
		for (int i = 0; i < PHPastel.coloredStoneChance; i++) {
			int hi = rand.nextInt(PHPastel.coloredStoneHeight);
		    int randX = chunkX + rand.nextInt(16);
		    int randZ = chunkZ + rand.nextInt(16);
		    coloredStone.generate(world, rand, randX, hi, randZ);
		}
	}
	
	public void generateMarble(World world, Random rand, int chunkX, int chunkZ) 
	{
		if(rand.nextInt(PHPastel.marbleRarity) == 0)
	    {
			int hi = rand.nextInt(PHPastel.marbleHeight);
	        int randX = chunkX + rand.nextInt(16);
	        int randZ = chunkZ + rand.nextInt(16);
	        marbleWhite.generate(world, rand, randX, hi, randZ);
	        hi = hi + rand.nextInt(8) - 4;
	        randX = randX + rand.nextInt(32) - 16;
	        randZ = randZ + rand.nextInt(32) - 16;
	        marbleWhite.generate(world, rand, randX, hi, randZ);
	        hi = hi + rand.nextInt(8) - 4;
	        randX = randX + rand.nextInt(32) - 16;
	        randZ = randZ + rand.nextInt(32) - 16;
	        marbleWhite.generate(world, rand, randX, hi, randZ);
	        hi = hi + rand.nextInt(8) - 4;
	        randX = randX + rand.nextInt(32) - 16;
	        randZ = randZ + rand.nextInt(32) - 16;
	        marbleWhite.generate(world, rand, randX, hi, randZ);
	    }
		if(rand.nextInt(PHPastel.marbleRarity) == 0)
	    {
			int hi = rand.nextInt(PHPastel.marbleHeight);
	        int randX = chunkX + rand.nextInt(16);
	        int randZ = chunkZ + rand.nextInt(16);
	        marbleBlack.generate(world, rand, randX, hi, randZ);
	        hi = hi + rand.nextInt(8) - 4;
	        randX = randX + rand.nextInt(32) - 16;
	        randZ = randZ + rand.nextInt(32) - 16;
	        marbleBlack.generate(world, rand, randX, hi, randZ);
	        hi = hi + rand.nextInt(8) - 4;
	        randX = randX + rand.nextInt(32) - 16;
	        randZ = randZ + rand.nextInt(32) - 16;
	        marbleBlack.generate(world, rand, randX, hi, randZ);
	        hi = hi + rand.nextInt(8) - 4;
	        randX = randX + rand.nextInt(32) - 16;
	        randZ = randZ + rand.nextInt(32) - 16;
	        marbleBlack.generate(world, rand, randX, hi, randZ);
	    }
		if(rand.nextInt(PHPastel.marbleRarity) == 0)
	    {
			int hi = rand.nextInt(PHPastel.marbleHeight);
	        int randX = chunkX + rand.nextInt(16);
	        int randZ = chunkZ + rand.nextInt(16);
	        marbleRose.generate(world, rand, randX, hi, randZ);
	        hi = hi + rand.nextInt(8) - 4;
	        randX = randX + rand.nextInt(32) - 16;
	        randZ = randZ + rand.nextInt(32) - 16;
	        marbleRose.generate(world, rand, randX, hi, randZ);
	        hi = hi + rand.nextInt(8) - 4;
	        randX = randX + rand.nextInt(32) - 16;
	        randZ = randZ + rand.nextInt(32) - 16;
	        marbleRose.generate(world, rand, randX, hi, randZ);
	        hi = hi + rand.nextInt(8) - 4;
	        randX = randX + rand.nextInt(32) - 16;
	        randZ = randZ + rand.nextInt(32) - 16;
	        marbleRose.generate(world, rand, randX, hi, randZ);
	    }
		if(rand.nextInt(PHPastel.marbleRarity) == 0)
	    {
			int hi = rand.nextInt(PHPastel.marbleHeight);
	        int randX = chunkX + rand.nextInt(16);
	        int randZ = chunkZ + rand.nextInt(16);
	        marbleEmerald.generate(world, rand, randX, hi, randZ);
	        hi = hi + rand.nextInt(8) - 4;
	        randX = randX + rand.nextInt(32) - 16;
	        randZ = randZ + rand.nextInt(32) - 16;
	        marbleEmerald.generate(world, rand, randX, hi, randZ);
	        hi = hi + rand.nextInt(8) - 4;
	        randX = randX + rand.nextInt(32) - 16;
	        randZ = randZ + rand.nextInt(32) - 16;
	        marbleEmerald.generate(world, rand, randX, hi, randZ);
	        hi = hi + rand.nextInt(8) - 4;
	        randX = randX + rand.nextInt(32) - 16;
	        randZ = randZ + rand.nextInt(32) - 16;
	        marbleEmerald.generate(world, rand, randX, hi, randZ);
	    }
		if(rand.nextInt(PHPastel.marbleRarity) == 0)
	    {
			int hi = rand.nextInt(PHPastel.marbleHeight);
	        int randX = chunkX + rand.nextInt(16);
	        int randZ = chunkZ + rand.nextInt(16);
	        marbleAzure.generate(world, rand, randX, hi, randZ);
	        hi = hi + rand.nextInt(8) - 4;
	        randX = randX + rand.nextInt(32) - 16;
	        randZ = randZ + rand.nextInt(32) - 16;
	        marbleAzure.generate(world, rand, randX, hi, randZ);
	        hi = hi + rand.nextInt(8) - 4;
	        randX = randX + rand.nextInt(32) - 16;
	        randZ = randZ + rand.nextInt(32) - 16;
	        marbleAzure.generate(world, rand, randX, hi, randZ);
	        hi = hi + rand.nextInt(8) - 4;
	        randX = randX + rand.nextInt(32) - 16;
	        randZ = randZ + rand.nextInt(32) - 16;
	        marbleAzure.generate(world, rand, randX, hi, randZ);
	    }
	}
	
	StoneGenColor coloredStone;
	
	WorldGenMinable marbleWhite;
	WorldGenMinable marbleBlack;
    WorldGenMinable marbleRose;
    WorldGenMinable marbleEmerald;
    WorldGenMinable marbleAzure;
}
