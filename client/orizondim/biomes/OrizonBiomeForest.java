package net.minecraft.src.orizondim.biomes;
import net.minecraft.src.orizondim.*;
import net.minecraft.src.*;
import java.util.*;

public class OrizonBiomeForest extends BiomeGenOrizon
{
    public OrizonBiomeForest(int par1)
    {
        super(par1);
        this.spawnableCreatureList.add(new SpawnListEntry(EntityWolf.class, 5, 4, 4));
        this.orizonDecorator.setTreesPerChunk(10);
        this.orizonDecorator.setGrassPerChunk(2);
    }

    /**
     * Gets a WorldGen appropriate for this biome.
     */
    public WorldGenerator getRandomWorldGenForTrees(Random par1Random)
    {
        return (WorldGenerator)(par1Random.nextInt(5) == 0 ? this.orizonGenForest : (par1Random.nextInt(10) == 0 ? this.orizonGenBigTree : this.orizonGenTrees));
    }
}
