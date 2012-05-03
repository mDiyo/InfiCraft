package net.minecraft.src.orizondim;
import net.minecraft.src.*;
import net.minecraft.src.orizondim.layers.*;

public abstract class GenLayerOrizon extends GenLayer
{
    /** seed from World#getWorldSeed that is used in the LCG prng */
    private long worldGenSeed;

    /** parent GenLayer that was provided via the constructor */
    protected GenLayerOrizon parent;

    /**
     * final part of the LCG prng that uses the chunk X, Z coords along with the other two seeds to generate
     * pseudorandom numbers
     */
    private long chunkSeed;

    /** base seed to the LCG prng provided via the constructor */
    private long baseSeed;

    public static GenLayerOrizon[] func_48425_a(long par0, WorldType par2WorldType)
    {
        LayerIsland islandLayer = new LayerIsland(1L);
        LayerFuzzyZoom fuzzyZoom = new LayerFuzzyZoom(2000L, islandLayer);
        LayerAddIsland islandLayerFull = new LayerAddIsland(1L, fuzzyZoom);
        LayerZoom trueZoom = new LayerZoom(2001L, islandLayerFull);
        islandLayerFull = new LayerAddIsland(2L, trueZoom);
        LayerAddSnow var12 = new LayerAddSnow(2L, islandLayerFull);
        trueZoom = new LayerZoom(2002L, var12);
        islandLayerFull = new LayerAddIsland(3L, trueZoom);
        trueZoom = new LayerZoom(2003L, islandLayerFull);
        islandLayerFull = new LayerAddIsland(4L, trueZoom);
        LayerAddMushroomIsland mushroomIslandLayer = new LayerAddMushroomIsland(5L, islandLayerFull);
        byte four = 4;
        GenLayerOrizon secondaryZoom = LayerZoom.func_35515_a(1000L, mushroomIslandLayer, 0);
        LayerRiverInit var13 = new LayerRiverInit(100L, secondaryZoom);
        secondaryZoom = LayerZoom.func_35515_a(1000L, var13, four + 2);
        LayerRiver var14 = new LayerRiver(1L, secondaryZoom);
        LayerSmooth var16 = new LayerSmooth(1000L, var14);
        GenLayerOrizon ternaryZoom = LayerZoom.func_35515_a(1000L, mushroomIslandLayer, 0);
        LayerBiome biomeLayer = new LayerBiome(200L, ternaryZoom, par2WorldType);
        ternaryZoom = LayerZoom.func_35515_a(1000L, biomeLayer, 2);
        Object hillLayer = new LayerHills(1000L, ternaryZoom);

        for (int var7 = 0; var7 < four; ++var7)
        {
            hillLayer = new LayerZoom((long)(1000 + var7), (GenLayerOrizon)hillLayer);

            if (var7 == 0)
            {
                hillLayer = new LayerAddIsland(3L, (GenLayerOrizon)hillLayer);
            }

            if (var7 == 1)
            {
                hillLayer = new LayerShore(1000L, (GenLayerOrizon)hillLayer);
            }

            if (var7 == 1)
            {
                hillLayer = new LayerSwampRivers(1000L, (GenLayerOrizon)hillLayer);
            }
        }

        LayerSmooth var19 = new LayerSmooth(1000L, (GenLayerOrizon)hillLayer);
        LayerRiverMix var20 = new LayerRiverMix(100L, var19, var16);
        LayerVoronoiZoom var8 = new LayerVoronoiZoom(10L, var20);
        var20.initWorldGenSeed(par0);
        var8.initWorldGenSeed(par0);
        return new GenLayerOrizon[] {var20, var8, var20};
    }

    public GenLayerOrizon(long par1)
    {
    	super(par1);
        /*this.baseSeed = par1;
        this.baseSeed *= this.baseSeed * 6364136223846793005L + 1442695040888963407L;
        this.baseSeed += par1;
        this.baseSeed *= this.baseSeed * 6364136223846793005L + 1442695040888963407L;
        this.baseSeed += par1;
        this.baseSeed *= this.baseSeed * 6364136223846793005L + 1442695040888963407L;
        this.baseSeed += par1;*/
    }

    /**
     * Initialize layer's local worldGenSeed based on its own baseSeed and the world's global seed (passed in as an
     * argument).
     */
    public void initWorldGenSeed(long par1)
    {
        this.worldGenSeed = par1;

        if (this.parent != null)
        {
            this.parent.initWorldGenSeed(par1);
        }

        this.worldGenSeed *= this.worldGenSeed * 6364136223846793005L + 1442695040888963407L;
        this.worldGenSeed += this.baseSeed;
        this.worldGenSeed *= this.worldGenSeed * 6364136223846793005L + 1442695040888963407L;
        this.worldGenSeed += this.baseSeed;
        this.worldGenSeed *= this.worldGenSeed * 6364136223846793005L + 1442695040888963407L;
        this.worldGenSeed += this.baseSeed;
    }

    /**
     * Initialize layer's current chunkSeed based on the local worldGenSeed and the (x,z) chunk coordinates.
     */
    public void initChunkSeed(long par1, long par3)
    {
        this.chunkSeed = this.worldGenSeed;
        this.chunkSeed *= this.chunkSeed * 6364136223846793005L + 1442695040888963407L;
        this.chunkSeed += par1;
        this.chunkSeed *= this.chunkSeed * 6364136223846793005L + 1442695040888963407L;
        this.chunkSeed += par3;
        this.chunkSeed *= this.chunkSeed * 6364136223846793005L + 1442695040888963407L;
        this.chunkSeed += par1;
        this.chunkSeed *= this.chunkSeed * 6364136223846793005L + 1442695040888963407L;
        this.chunkSeed += par3;
    }

    /**
     * returns a LCG pseudo random number from [0, x). Args: int x
     */
    protected int nextInt(int par1)
    {
        int var2 = (int)((this.chunkSeed >> 24) % (long)par1);

        if (var2 < 0)
        {
            var2 += par1;
        }

        this.chunkSeed *= this.chunkSeed * 6364136223846793005L + 1442695040888963407L;
        this.chunkSeed += this.worldGenSeed;
        return var2;
    }

    /**
     * Returns a list of integer values generated by this layer. These may be interpreted as temperatures, rainfall
     * amounts, or biomeList[] indices based on the particular GenLayer subclass.
     */
    public abstract int[] getInts(int var1, int var2, int var3, int var4);
}
