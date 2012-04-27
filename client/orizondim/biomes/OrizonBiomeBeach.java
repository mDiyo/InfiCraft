package net.minecraft.src.orizondim.biomes;
import net.minecraft.src.orizondim.*;
import net.minecraft.src.*;

import java.util.*;

public class OrizonBiomeBeach extends BiomeGenOrizon
{
    public OrizonBiomeBeach(int par1)
    {
        super(par1);
        this.topBlockEX = (short)mod_Orizon.blueDirt.blockID;
        this.topMeta = 1;
        this.fillBlockEX = (short)mod_Orizon.blueDirt.blockID;
        this.fillMeta = 2;
        this.orizonDecorator.setTreesPerChunk(-999);
        this.orizonDecorator.setDeadBushPerChunk(0);
        this.orizonDecorator.setReedsPerChunk(0);
        this.orizonDecorator.setCactiPerChunk(0);
    }
}
