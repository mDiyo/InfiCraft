package net.minecraft.src.orizondim.biomes;
import net.minecraft.src.orizondim.*;
import net.minecraft.src.*;
import java.util.*;

public class OrizonBiomeSwamp extends BiomeGenOrizon
{
    public OrizonBiomeSwamp(int par1)
    {
        super(par1);
        this.orizonDecorator.setTreesPerChunk(2);
        this.orizonDecorator.setFlowersPerChunk(-999);
        this.orizonDecorator.setDeadBushPerChunk(1);
        this.orizonDecorator.setMushroomsPerChunk(8);
        this.orizonDecorator.setReedsPerChunk(10);
        this.orizonDecorator.setClayPerChunk(1);
        this.orizonDecorator.setWaterlilyPerChunk(4);
        this.waterColorMultiplier = 14745518;
    }

    /**
     * Gets a WorldGen appropriate for this biome.
     */
    public WorldGenerator getRandomWorldGenForTrees(Random par1Random)
    {
        return this.orizonGenSwamp;
    }
}
