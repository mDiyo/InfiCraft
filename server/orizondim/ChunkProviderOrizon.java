package net.minecraft.src.orizondim;
import net.minecraft.src.*;

import java.util.List;
import java.util.Random;

public class ChunkProviderOrizon implements IChunkProvider
{
    /** RNG. */
    private Random rand;

    /** A NoiseGeneratorOctaves used in generating terrain */
    private NoiseGeneratorOctaves noiseGen1;

    /** A NoiseGeneratorOctaves used in generating terrain */
    private NoiseGeneratorOctaves noiseGen2;

    /** A NoiseGeneratorOctaves used in generating terrain */
    private NoiseGeneratorOctaves noiseGen3;

    /** A NoiseGeneratorOctaves used in generating terrain */
    private NoiseGeneratorOctaves noiseGen4;

    /** A NoiseGeneratorOctaves used in generating terrain */
    public NoiseGeneratorOctaves noiseGen5;

    /** A NoiseGeneratorOctaves used in generating terrain */
    public NoiseGeneratorOctaves noiseGen6;
    public NoiseGeneratorOctaves mobSpawnerNoise;

    /** Reference to the World object. */
    private World worldObj;

    /** are map structures going to be generated (e.g. strongholds) */
    private final boolean mapFeaturesEnabled;

    /** Holds the overall noise array used in chunk generation */
    private double[] noiseArray;
    private double[] stoneNoise = new double[256];
    private GenBaseOrizon caveGenerator = new CaveGenOrizon();

    /** Holds Stronghold Generator */
    private MapGenStronghold strongholdGenerator = new MapGenStronghold();

    /** Holds Village Generator */
    //private MapGenVillage villageGenerator = new MapGenVillage(0);

    /** Holds Mineshaft Generator */
    //private MapGenMineshaft mineshaftGenerator = new MapGenMineshaft();

    /** Holds ravine generator */
    private GenBaseOrizon ravineGenerator = new RavineGenOrizon();

    /** The biomes that are used to generate the chunk */
    private BiomeGenBase[] biomesForGenerationOrizon;

    /** A double array that hold terrain noise from noiseGen3 */
    double[] noise3;

    /** A double array that hold terrain noise */
    double[] noise1;

    /** A double array that hold terrain noise from noiseGen2 */
    double[] noise2;

    /** A double array that hold terrain noise from noiseGen5 */
    double[] noise5;

    /** A double array that holds terrain noise from noiseGen6 */
    double[] noise6;
    float[] field_35388_l;
    int[][] field_914_i = new int[32][32];
    
    byte waterHeight = 54;

    public ChunkProviderOrizon(World par1World, long par2, boolean par4, BiomeGenBase[] biomes)
    {
        this.worldObj = par1World;
        this.mapFeaturesEnabled = par4;
        this.rand = new Random(par2);
        this.noiseGen1 = new NoiseGeneratorOctaves(this.rand, 14);
        this.noiseGen2 = new NoiseGeneratorOctaves(this.rand, 19);
        this.noiseGen3 = new NoiseGeneratorOctaves(this.rand, 6);
        this.noiseGen4 = new NoiseGeneratorOctaves(this.rand, 6);
        this.noiseGen5 = new NoiseGeneratorOctaves(this.rand, 11);
        this.noiseGen6 = new NoiseGeneratorOctaves(this.rand, 12);
        this.mobSpawnerNoise = new NoiseGeneratorOctaves(this.rand, 8);
        this.biomesForGenerationOrizon = biomes;
    }

    /**
     * Generates the shape of the terrain for the chunk though its all stone though the water is frozen if the
     * temperature is low enough
     */
    public void generateTerrain(int par1, int par2, short[] blockIDs, byte[] metadata)
    {
        byte four = 4;
        byte sixteen = 16;
        int fourplusonefirst = four + 1;
        byte seventeen = 17;
        int fourplusonesecond = four + 1;
        this.biomesForGenerationOrizon = ((WorldChunkManagerOrizon) this.worldObj.getWorldChunkManager()).getOrizonBiomesForGeneration(
        		this.biomesForGenerationOrizon, par1 * 4 - 2, par2 * 4 - 2, fourplusonefirst + 5, fourplusonesecond + 5);
        this.noiseArray = this.initializeNoiseField(this.noiseArray, par1 * four, 0, par2 * four, fourplusonefirst, seventeen, fourplusonesecond);

        for (int iterx = 0; iterx < four; ++iterx)
        {
            for (int iterz = 0; iterz < four; ++iterz)
            {
                for (int iterY = 0; iterY < sixteen; ++iterY)
                {
                    double oneeighth = 0.125D;
                    double var15 = this.noiseArray[((iterx + 0) * fourplusonesecond + iterz + 0) * seventeen + iterY + 0];
                    double var17 = this.noiseArray[((iterx + 0) * fourplusonesecond + iterz + 1) * seventeen + iterY + 0];
                    double var19 = this.noiseArray[((iterx + 1) * fourplusonesecond + iterz + 0) * seventeen + iterY + 0];
                    double var21 = this.noiseArray[((iterx + 1) * fourplusonesecond + iterz + 1) * seventeen + iterY + 0];
                    double var23 = (this.noiseArray[((iterx + 0) * fourplusonesecond + iterz + 0) * seventeen + iterY + 1] - var15) * oneeighth;
                    double var25 = (this.noiseArray[((iterx + 0) * fourplusonesecond + iterz + 1) * seventeen + iterY + 1] - var17) * oneeighth;
                    double var27 = (this.noiseArray[((iterx + 1) * fourplusonesecond + iterz + 0) * seventeen + iterY + 1] - var19) * oneeighth;
                    double var29 = (this.noiseArray[((iterx + 1) * fourplusonesecond + iterz + 1) * seventeen + iterY + 1] - var21) * oneeighth;

                    for (int itereight = 0; itereight < 8; ++itereight)
                    {
                        double var32 = 0.375D;
                        double var34 = var15;
                        double var36 = var17;
                        double var38 = (var19 - var15) * var32;
                        double var40 = (var21 - var17) * var32;

                        for (int iterfour = 0; iterfour < 4; ++iterfour)
                        {
                            int stonebase = iterfour + iterx * 4 << 11 | 0 + iterz * 4 << 7 | iterY * 8 + itereight;
                            short var44 = 128;
                            stonebase -= var44;
                            double var45 = 0.275D;
                            double var49 = (var36 - var34) * var45;
                            double var47 = var34 - var49;

                            for (int var51 = 0; var51 < 4; ++var51)
                            {
                                if ((var47 += var49) > 0.0D)
                                {
                                    //blockIDs[stonebase += var44] = (short)Block.stone.blockID;
                                	blockIDs[stonebase += var44] = getBlockIDforHeight(iterY*8+itereight);
                                	metadata[stonebase] = getBlockMetadataForHeight(iterY*8+itereight, blockIDs[stonebase]);
                                }
                                else if (iterY * 8 + itereight < waterHeight)
                                {
                                	blockIDs[stonebase += var44] = (short)Block.waterStill.blockID;
                                }
                                else
                                {
                                	blockIDs[stonebase += var44] = 0;
                                }
                            }

                            var34 += var38;
                            var36 += var40;
                        }

                        var15 += var23;
                        var17 += var25;
                        var19 += var27;
                        var21 += var29;
                    }
                }
            }
        }
    }
    
    public short getBlockIDforHeight(int height)
    {
    	if (height >= 73 && height <= 82)    	{
    		return (rand.nextInt(4) == 0 ? (short)Block.stone.blockID : (short)mod_Orizon.cStone.blockID);
    	} 
    	else if (height >= 73 && height <= 90)
    	{
    		return (rand.nextInt(3) == 0 ? (short)Block.stone.blockID : (short)mod_Orizon.cStone.blockID);
    	}
    	else if (height >= 57)
    	{
    		return (rand.nextInt(3) == 0 ? (short)mod_Orizon.cStone.blockID : (short)Block.stone.blockID);
    	}
    	return (short)mod_Orizon.cStone.blockID;
    }
    
    public byte getBlockMetadataForHeight(int height, int blockID)
    {
    	if (blockID != mod_Orizon.cStone.blockID)
    		return 0;
    	if (height <= 10)
    		return 2;
    	if (height <= 17)
    		return (byte)(rand.nextInt(3) == 0 ? 1 : 2);
    	if (height <= 24)
    		return (byte)(rand.nextInt(3) == 0 ? 2 : 1);
    	if (height <= 34)
    		return (byte)(rand.nextInt(4) == 0 ? 1 : (rand.nextInt(2) == 0 ? 2 : 0));
    	if (height <= 42)
    		return (byte)(rand.nextInt(3) == 0 ? 0 : 1);
    	if (height <= 50)
    		return (byte)(rand.nextInt(3) == 0 ? 1 : 0);
    	if (height <= 72)
    		return (byte)(rand.nextInt(3) == 0 ? 1 : 0);
    	if (height <= 82 && blockID == mod_Orizon.cStone.blockID)
    		return (byte)(rand.nextInt(2) == 0 ? 0 : 3);
    	return 3;
    }

    /**
     * Replaces the stone that was placed in with blocks that match the biome
     */
    public void replaceBlocksForBiome(int par1, int par2, short[] blockIDs, byte[] metadata, BiomeGenBase[] par4ArrayOfBiomeGenBase)
    {
        double var6 = 0.03125D;
        this.stoneNoise = this.noiseGen4.generateNoiseOctaves(this.stoneNoise, par1 * 16, par2 * 16, 0, 16, 16, 1, var6 * 2.0D, var6 * 2.0D, var6 * 2.0D);

        for (int var8 = 0; var8 < 16; ++var8)
        {
            for (int var9 = 0; var9 < 16; ++var9)
            {
                BiomeGenBase var10 = par4ArrayOfBiomeGenBase[var9 + var8 * 16];
                float var11 = var10.getFloatTemperature();
                int var12 = (int)(this.stoneNoise[var8 + var9 * 16] / 3.0D + 3.0D + this.rand.nextDouble() * 0.25D);
                int var13 = -1;
                short topID = var10.topBlock;
                byte topMeta = 0;
                short fillID = var10.fillerBlock;
                byte fillMeta = 0;
                if (topID == Block.grass.blockID)
                {
                	topID = (short)mod_Orizon.blueGrass.blockID;
                }
                if (fillID == Block.dirt.blockID)
                {
                	fillID = (short)mod_Orizon.blueDirt.blockID;
                }
                if (var10 instanceof BiomeGenOrizon)
                {
                	topID = ((BiomeGenOrizon)var10).getTopBlockEX();
                	topMeta = ((BiomeGenOrizon)var10).getTopMeta();
                	fillID = ((BiomeGenOrizon)var10).getFillBlockEX();
                	fillMeta = ((BiomeGenOrizon)var10).getFillMeta();
                }

                for (int height = 127; height >= 0; --height)
                {
                    int var17 = (var9 * 16 + var8) * 128 + height;

                    if (height == 0)
                    {
                        blockIDs[var17] = (short)Block.bedrock.blockID;
                    }
                    else
                    {
                        short var18 = blockIDs[var17];
                        

                        if (var18 == 0)
                        {
                            var13 = -1;
                        }
                        else if (var18 == Block.stone.blockID || var18 == mod_Orizon.cStone.blockID)
                        {
                            if (var13 == -1)
                            {
                                if (var12 <= 0)
                                {
                                    topID = 0;
                                    fillID = (short)Block.stone.blockID;
                                }
                                else if (height >= waterHeight - 4 && height <= waterHeight + 1)
                                {
                                    topID = var10.topBlock;
                                    fillID = var10.fillerBlock;
                                }

                                if (height < waterHeight && topID == 0)
                                {
                                    if (var11 < 0.15F)
                                    {
                                        topID = (short)Block.ice.blockID;
                                        topMeta = 0;
                                    }
                                    else
                                    {
                                        topID = (short)Block.waterStill.blockID;
                                        topMeta = 0;
                                    }
                                }

                                var13 = var12;

                                if (height >= waterHeight - 1)
                                {
                                    blockIDs[var17] = topID;
                                    metadata[var17] = topMeta;
                                }
                                else
                                {
                                    blockIDs[var17] = fillID;
                                    metadata[var17] = fillMeta;
                                }
                            }
                            else if (var13 > 0)
                            {
                                --var13;
                                blockIDs[var17] = fillID;

                                if (var13 == 0 && fillID == Block.sand.blockID)
                                {
                                    var13 = this.rand.nextInt(4);
                                    fillID = (short)Block.sandStone.blockID;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /**
     * loads or generates the chunk at the chunk location specified
     */
    public Chunk loadChunk(int par1, int par2)
    {
        return this.provideChunk(par1, par2);
    }

    /**
     * Will return back a chunk, if it doesn't exist and its not a MP client it will generates all the blocks for the
     * specified chunk from the map seed and chunk seed
     */
    public Chunk provideChunk(int par1, int par2)
    {
        this.rand.setSeed((long)par1 * 341873128712L + (long)par2 * 132897987541L);
        short[] blockIDs = new short[32768];
        byte[] metadata = new byte[32768];
        this.generateTerrain(par1, par2, blockIDs, metadata);
        this.biomesForGenerationOrizon = this.worldObj.getWorldChunkManager().loadBlockGeneratorData(this.biomesForGenerationOrizon, par1 * 16, par2 * 16, 16, 16);
        this.replaceBlocksForBiome(par1, par2, blockIDs, metadata, this.biomesForGenerationOrizon);
        this.caveGenerator.generate(this, this.worldObj, par1, par2, blockIDs, metadata);
        this.ravineGenerator.generate(this, this.worldObj, par1, par2, blockIDs, metadata);

        /*if (this.mapFeaturesEnabled)
        {
            this.mineshaftGenerator.generate(this, this.worldObj, par1, par2, blockIDs);
            this.villageGenerator.generate(this, this.worldObj, par1, par2, blockIDs);
            this.strongholdGenerator.generate(this, this.worldObj, par1, par2, blockIDs);
        }*/

        Chunk var4 = new ChunkOrizon(this.worldObj, blockIDs, metadata, par1, par2);
        byte[] var5 = var4.getBiomeArray();

        for (int var6 = 0; var6 < var5.length; ++var6)
        {
            var5[var6] = (byte)this.biomesForGenerationOrizon[var6].biomeID;
        }

        var4.generateSkylightMap();
        return var4;
    }

    /**
     * generates a subset of the level's terrain data. Takes 7 arguments: the [empty] noise array, the position, and the
     * size.
     */
    private double[] initializeNoiseField(double[] par1ArrayOfDouble, int par2, int par3, int par4, int par5, int par6, int par7)
    {
        if (par1ArrayOfDouble == null)
        {
            par1ArrayOfDouble = new double[par5 * par6 * par7];
        }

        if (this.field_35388_l == null)
        {
            this.field_35388_l = new float[25];

            for (int var8 = -2; var8 <= 2; ++var8)
            {
                for (int var9 = -2; var9 <= 2; ++var9)
                {
                    float var10 = 10.0F / MathHelper.sqrt_float((float)(var8 * var8 + var9 * var9) + 0.2F);
                    this.field_35388_l[var8 + 2 + (var9 + 2) * 5] = var10;
                }
            }
        }

        double var44 = 684.412D;
        double var45 = 684.412D;
        this.noise5 = this.noiseGen5.generateNoiseOctaves(this.noise5, par2, par4, par5, par7, 1.121D, 1.121D, 0.5D);
        this.noise6 = this.noiseGen6.generateNoiseOctaves(this.noise6, par2, par4, par5, par7, 200.0D, 200.0D, 0.5D);
        this.noise3 = this.noiseGen3.generateNoiseOctaves(this.noise3, par2, par3, par4, par5, par6, par7, var44 / 80.0D, var45 / 160.0D, var44 / 80.0D);
        this.noise1 = this.noiseGen1.generateNoiseOctaves(this.noise1, par2, par3, par4, par5, par6, par7, var44, var45, var44);
        this.noise2 = this.noiseGen2.generateNoiseOctaves(this.noise2, par2, par3, par4, par5, par6, par7, var44, var45, var44);
        boolean var43 = false;
        boolean var42 = false;
        int var12 = 0;
        int var13 = 0;

        for (int var14 = 0; var14 < par5; ++var14)
        {
            for (int var15 = 0; var15 < par7; ++var15)
            {
                float var16 = 0.0F;
                float var17 = 0.0F;
                float var18 = 0.0F;
                byte var19 = 2;
                BiomeGenBase var20 = this.biomesForGenerationOrizon[var14 + 2 + (var15 + 2) * (par5 + 5)];

                for (int var21 = -var19; var21 <= var19; ++var21)
                {
                    for (int var22 = -var19; var22 <= var19; ++var22)
                    {
                        BiomeGenBase var23 = this.biomesForGenerationOrizon[var14 + var21 + 2 + (var15 + var22 + 2) * (par5 + 5)];
                        float var24 = this.field_35388_l[var21 + 2 + (var22 + 2) * 5] / (var23.minHeight + 2.0F);

                        if (var23.minHeight > var20.minHeight)
                        {
                            var24 /= 2.0F;
                        }

                        var16 += var23.maxHeight * var24;
                        var17 += var23.minHeight * var24;
                        var18 += var24;
                    }
                }

                var16 /= var18;
                var17 /= var18;
                var16 = var16 * 0.9F + 0.1F;
                var17 = (var17 * 4.0F - 1.0F) / 8.0F;
                double var47 = this.noise6[var13] / 8000.0D;

                if (var47 < 0.0D)
                {
                    var47 = -var47 * 0.3D;
                }

                var47 = var47 * 3.0D - 2.0D;

                if (var47 < 0.0D)
                {
                    var47 /= 2.0D;

                    if (var47 < -1.0D)
                    {
                        var47 = -1.0D;
                    }

                    var47 /= 1.4D;
                    var47 /= 2.0D;
                }
                else
                {
                    if (var47 > 1.0D)
                    {
                        var47 = 1.0D;
                    }

                    var47 /= 8.0D;
                }

                ++var13;

                for (int var46 = 0; var46 < par6; ++var46)
                {
                    double var48 = (double)var17;
                    double var26 = (double)var16;
                    var48 += var47 * 0.2D;
                    var48 = var48 * (double)par6 / 16.0D;
                    double var28 = (double)par6 / 2.0D + var48 * 4.0D;
                    double var30 = 0.0D;
                    double var32 = ((double)var46 - var28) * 12.0D * 128.0D / 128.0D / var26;

                    if (var32 < 0.0D)
                    {
                        var32 *= 4.0D;
                    }

                    double var34 = this.noise1[var12] / 512.0D;
                    double var36 = this.noise2[var12] / 512.0D;
                    double var38 = (this.noise3[var12] / 10.0D + 1.0D) / 2.0D;

                    if (var38 < 0.0D)
                    {
                        var30 = var34;
                    }
                    else if (var38 > 1.0D)
                    {
                        var30 = var36;
                    }
                    else
                    {
                        var30 = var34 + (var36 - var34) * var38;
                    }

                    var30 -= var32;

                    if (var46 > par6 - 4)
                    {
                        double var40 = (double)((float)(var46 - (par6 - 4)) / 3.0F);
                        var30 = var30 * (1.0D - var40) + -10.0D * var40;
                    }

                    par1ArrayOfDouble[var12] = var30;
                    ++var12;
                }
            }
        }

        return par1ArrayOfDouble;
    }

    /**
     * Checks to see if a chunk exists at x, y
     */
    public boolean chunkExists(int par1, int par2)
    {
        return true;
    }

    /**
     * Populates chunk with ores etc etc
     */
    public void populate(IChunkProvider par1IChunkProvider, int par2, int par3)
    {
        BlockSand.fallInstantly = true;
        int var4 = par2 * 16;
        int var5 = par3 * 16;
        BiomeGenBase biome = this.worldObj.getBiomeGenForCoords(var4 + 16, var5 + 16);
        this.rand.setSeed(this.worldObj.getSeed());
        long var7 = this.rand.nextLong() / 2L * 2L + 1L;
        long var9 = this.rand.nextLong() / 2L * 2L + 1L;
        this.rand.setSeed((long)par2 * var7 + (long)par3 * var9 ^ this.worldObj.getSeed());
        boolean var11 = false;

        /*if (this.mapFeaturesEnabled)
        {
            this.mineshaftGenerator.generateStructuresInChunk(this.worldObj, this.rand, par2, par3);
            var11 = this.villageGenerator.generateStructuresInChunk(this.worldObj, this.rand, par2, par3);
            this.strongholdGenerator.generateStructuresInChunk(this.worldObj, this.rand, par2, par3);
        }*/

        int var12;
        int var13;
        int var14;

        if (!var11 && this.rand.nextInt(4) == 0)
        {
            var12 = var4 + this.rand.nextInt(16) + 8;
            var13 = this.rand.nextInt(128);
            var14 = var5 + this.rand.nextInt(16) + 8;
            (new WorldGenLakes(Block.waterStill.blockID)).generate(this.worldObj, this.rand, var12, var13, var14);
        }

        if (!var11 && this.rand.nextInt(8) == 0)
        {
            var12 = var4 + this.rand.nextInt(16) + 8;
            var13 = this.rand.nextInt(this.rand.nextInt(120) + 8);
            var14 = var5 + this.rand.nextInt(16) + 8;

            if (var13 < 63 || this.rand.nextInt(10) == 0)
            {
                (new WorldGenLakes(Block.lavaStill.blockID)).generate(this.worldObj, this.rand, var12, var13, var14);
            }
        }

        for (var12 = 0; var12 < 8; ++var12)
        {
            var13 = var4 + this.rand.nextInt(16) + 8;
            var14 = this.rand.nextInt(128);
            int var15 = var5 + this.rand.nextInt(16) + 8;

            if ((new WorldGenDungeons()).generate(this.worldObj, this.rand, var13, var14, var15))
            {
                ;
            }
        }

        if (biome instanceof BiomeGenOrizon)
        	biome.decorate(this.worldObj, this.rand, var4, var5);
        SpawnerAnimals.performWorldGenSpawning(this.worldObj, biome, var4 + 8, var5 + 8, 16, 16, this.rand);
        var4 += 8;
        var5 += 8;

        for (var12 = 0; var12 < 16; ++var12)
        {
            for (var13 = 0; var13 < 16; ++var13)
            {
                var14 = this.worldObj.getPrecipitationHeight(var4 + var12, var5 + var13);

                if (this.worldObj.isBlockFreezable(var12 + var4, var14 - 1, var13 + var5))
                {
                    this.worldObj.setBlockWithNotify(var12 + var4, var14 - 1, var13 + var5, Block.ice.blockID);
                }

                if (this.worldObj.canSnowAt(var12 + var4, var14, var13 + var5))
                {
                    this.worldObj.setBlockWithNotify(var12 + var4, var14, var13 + var5, Block.snow.blockID);
                }
            }
        }

        BlockSand.fallInstantly = false;
    }

    /**
     * Two modes of operation: if passed true, save all Chunks in one go.  If passed false, save up to two chunks.
     * Return true if all chunks have been saved.
     */
    public boolean saveChunks(boolean par1, IProgressUpdate par2IProgressUpdate)
    {
        return true;
    }

    /**
     * Unloads the 100 oldest chunks from memory, due to a bug with chunkSet.add() never being called it thinks the list
     * is always empty and will not remove any chunks.
     */
    public boolean unload100OldestChunks()
    {
        return false;
    }

    /**
     * Returns if the IChunkProvider supports saving.
     */
    public boolean canSave()
    {
        return true;
    }

    /**
     * Converts the instance data to a readable string.
     */
    public String makeString()
    {
        return "OrizonRandomLevelSource";
    }

    /**
     * Returns a list of creatures of the specified type that can spawn at the given location.
     */
    public List getPossibleCreatures(EnumCreatureType par1EnumCreatureType, int par2, int par3, int par4)
    {
        BiomeGenBase var5 = this.worldObj.getBiomeGenForCoords(par2, par4);
        return var5 == null ? null : var5.getSpawnableList(par1EnumCreatureType);
    }

    /**
     * Returns the location of the closest structure of the specified type. If not found returns null.
     */
    public ChunkPosition findClosestStructure(World par1World, String par2Str, int par3, int par4, int par5)
    {
        return "Stronghold".equals(par2Str) && this.strongholdGenerator != null ? this.strongholdGenerator.getNearestInstance(par1World, par3, par4, par5) : null;
    }
}
