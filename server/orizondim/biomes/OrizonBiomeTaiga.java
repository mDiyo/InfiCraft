package net.minecraft.src.orizondim.biomes;
import net.minecraft.src.orizondim.*;
import net.minecraft.src.*;
import java.util.*;

public class OrizonBiomeTaiga extends BiomeGenOrizon
{
    public OrizonBiomeTaiga(int par1)
    {
        super(par1);
        this.spawnableCreatureList.add(new SpawnListEntry(EntityWolf.class, 8, 4, 4));
        this.orizonDecorator.setTreesPerChunk(10);
        this.orizonDecorator.setGrassPerChunk(1);
    }

    /**
     * Gets a WorldGen appropriate for this biome.
     */
    public WorldGenerator getRandomWorldGenForTrees(Random par1Random)
    {
        return (WorldGenerator)(new OrizonGenTaiga(false));
    }
}
