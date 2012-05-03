package net.minecraft.src.orizondim;
import java.util.Random;

import net.minecraft.src.orizondim.biomes.*;
import net.minecraft.src.*;

public class BiomeGenOrizon extends BiomeGenBase
{
	protected OrizonGenTrees orizonGenTrees;
    protected OrizonGenBigTree orizonGenBigTree;
    protected OrizonGenForest orizonGenForest;
    protected OrizonGenSwamp orizonGenSwamp;
	
	public BiomeDecoratorOrizon orizonDecorator = new BiomeDecoratorOrizon(this);
	public short topBlockEX = 0;
	public byte topMeta = 0;
	public short fillBlockEX = 0;
	public byte fillMeta = 0;
	
	public BiomeGenOrizon(int biomeID) {
		super(biomeID);
		this.topBlockEX = (short)(mod_Orizon.blueGrass.blockID);
		this.fillBlockEX = (short)(mod_Orizon.blueDirt.blockID);
		
		this.orizonGenTrees = new OrizonGenTrees(false);
        this.orizonGenBigTree = new OrizonGenBigTree(false);
        this.orizonGenForest = new OrizonGenForest(false);
        this.orizonGenSwamp = new OrizonGenSwamp();
	}
	
	public WorldGenerator getRandomWorldGenForTrees(Random par1Random)
    {
        return (WorldGenerator)(par1Random.nextInt(10) == 0 ? this.orizonGenBigTree : this.orizonGenTrees);
    }

    /*public WorldGenerator func_48410_b(Random par1Random)
    {
        return new WorldGenTallGrass(Block.tallGrass.blockID, 1);
    }*/
	
	public short getTopBlockEX()
	{
		return topBlockEX;
	}
	
	public byte getTopMeta()
	{
		return topMeta;
	}
	
	public short getFillBlockEX()
	{
		return fillBlockEX;
	}

	byte getFillMeta()
	{
		return fillMeta;
	}
	
	public void setRainAndTemp(float temp, float rain)
	{
		this.rainfall = rain;
		this.temperature = temp;
	}
	
	public void setHeight(float min, float max)
    {
        this.minHeight = min;
        this.maxHeight = max;
    }
	
	public void decorate(World par1World, Random par2Random, int par3, int par4)
    {
        this.orizonDecorator.decorate(par1World, par2Random, par3, par4);
    }
    
    /*public WorldGenerator getRandomWorldGenForTrees(Random par1Random)
    {
        return (WorldGenerator)(par1Random.nextInt(10) == 0 ? this.worldGenBigTree : this.worldGenTrees);
    }*/

    /*public WorldGenerator func_48410_b(Random par1Random)
    {
        return new WorldGenTallGrass(Block.tallGrass.blockID, 1);
    }*/
}
