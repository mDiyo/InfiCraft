package net.minecraft.src.orizondim.biomes;

import net.minecraft.src.orizondim.BiomeGenOrizon;

public class OrizonBiomeRiver extends BiomeGenOrizon
{
    public OrizonBiomeRiver(int par1)
    {
        super(par1);
        this.orizonDecorator.setTreesPerChunk(1);
        this.orizonDecorator.setGrassPerChunk(10);
        this.orizonDecorator.setFlowersPerChunk(4);
    }
}
