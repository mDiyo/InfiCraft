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
	public short topBlockEX;
	public byte topMeta;
	public short fillBlockEX;
	public byte fillMeta;
	
	public BiomeGenOrizon(int biomeID) {
		super(biomeID);
		this.topBlockEX = (short)(mod_Orizon.blueGrass.blockID);
		this.topMeta = 0;
		this.fillBlockEX = (short)(mod_Orizon.blueDirt.blockID);
		this.fillMeta = 0;
		
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
	
	public WorldGenerator func_48410_b(Random par1Random)
    {
        return new OrizonGenTallGrass(mod_Orizon.dimensionTallGrass.blockID, 1);
    }
	
	public void decorate(World par1World, Random par2Random, int par3, int par4)
    {
        this.orizonDecorator.decorate(par1World, par2Random, par3, par4);
    }
	
	/**
     * Provides the basic grass color based on the biome temperature and rainfall
     */
    public int getBiomeGrassColor()
    {
        double var1 = (double)MathHelper.clamp_float(this.getFloatTemperature(), 0.0F, 1.0F);
        double var3 = (double)MathHelper.clamp_float(this.getFloatRainfall(), 0.0F, 1.0F);
        return OrizonColorizer.getGrassColor(var1, var3);
    }

    /**
     * Provides the basic foliage color based on the biome temperature and rainfall
     */
    public int getBiomeFoliageColor()
    {
        double var1 = (double)MathHelper.clamp_float(this.getFloatTemperature(), 0.0F, 1.0F);
        double var3 = (double)MathHelper.clamp_float(this.getFloatRainfall(), 0.0F, 1.0F);
        return OrizonColorizer.getFoliageColor(var1, var3);
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
