package mDiyo.inficraft.orizon.pastelmarble;

import java.util.Random;

import cpw.mods.fml.common.IWorldGenerator;

import net.minecraft.src.Block;
import net.minecraft.src.IChunkProvider;
import net.minecraft.src.World;

public class PastelGenerator implements IWorldGenerator
{
	public PastelGenerator()
	{
		marbleWhite = new StoneGen(PHPastel.marbleID, 0, 40);
		marbleBlack = new StoneGen(PHPastel.marbleID, 1, 40);
		marbleRose = new StoneGen(PHPastel.marbleID, 2, 40);
		marbleEmerald = new StoneGen(PHPastel.marbleID, 3, 40);
		marbleAzure = new StoneGen(PHPastel.marbleID, 4, 40);
	}
	
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world,
			IChunkProvider chunkGenerator, IChunkProvider chunkProvider) 
	{
		if(PHPastel.superfun)
    	{
    		for(int iterX = chunkX; iterX < chunkX + 16; iterX++) {
    			for (int iterZ = chunkZ; iterZ < chunkZ + 16; iterZ++) {
    				for(int iterY = 0; iterY < 121; iterY++) {
    					world.setBlock(iterX, iterY, iterZ, Block.oreDiamond.blockID);
    				}
    			}
    		}
    	}
    	else
    	{
	        if(PHPastel.genMarble)
	            generateMarble(world, random, chunkX*16, chunkZ*16);
	        if(PHPastel.genStratifiedStone)
	            generateStratifiedStone(world, random, chunkX*16, chunkZ*16);
	        if(PHPastel.genColoredStone)
	        	generateColoredStone(world, random, chunkX*16, chunkZ*16);
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
	
	StoneGen marbleWhite;
    StoneGen marbleBlack;
    StoneGen marbleRose;
    StoneGen marbleEmerald;
    StoneGen marbleAzure;
}
