package net.minecraft.src.orizondim.biomes;
import net.minecraft.src.orizondim.*;
import net.minecraft.src.*;
import java.util.*;

public class OrizonBiomeDesert extends BiomeGenOrizon
{
    public OrizonBiomeDesert(int par1)
    {
        super(par1);
        this.spawnableCreatureList.clear();
        this.topBlockEX = (short)mod_Orizon.blueDirt.blockID;
        this.topMeta = 1;
        this.fillBlockEX = (short)mod_Orizon.blueDirt.blockID;
        this.fillMeta = 2;
        this.orizonDecorator.setTreesPerChunk(-999);
        this.orizonDecorator.setDeadBushPerChunk(2);
        this.orizonDecorator.setReedsPerChunk(50);
        this.orizonDecorator.setCactiPerChunk(10);
    }

    public void decorate(World par1World, Random par2Random, int par3, int par4)
    {
        super.decorate(par1World, par2Random, par3, par4);

        if (par2Random.nextInt(1000) == 0)
        {
            int var5 = par3 + par2Random.nextInt(16) + 8;
            int var6 = par4 + par2Random.nextInt(16) + 8;
            WorldGenDesertWells var7 = new WorldGenDesertWells();
            var7.generate(par1World, par2Random, var5, par1World.getHeightValue(var5, var6) + 1, var6);
        }
    }
}
