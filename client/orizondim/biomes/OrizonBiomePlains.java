package net.minecraft.src.orizondim.biomes;
import net.minecraft.src.orizondim.*;

public class OrizonBiomePlains extends BiomeGenOrizon
{
    public OrizonBiomePlains(int par1)
    {
        super(par1);
        this.orizonDecorator.setTreesPerChunk(-999);
        this.orizonDecorator.setFlowersPerChunk(4);
        this.orizonDecorator.setGrassPerChunk(10);
    }
}
