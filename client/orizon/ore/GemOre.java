package net.minecraft.src.orizon.ore;
import java.util.Random;

import net.minecraft.src.forge.*;
import net.minecraft.src.*;

public class GemOre extends Block
    implements ITextureProvider
{
    public GemOre(int id, int texture)
    {
        super(id, texture, Material.rock);
        enableStats = false;
    }
    
    public boolean getEnableStats() {return false;}
    
    public int idDropped(int md, Random random, int fortune)
    {
        return mod_Orizon.gems.shiftedIndex;
    }

    protected int damageDropped(int md)
    {
        return md;
    }

    public int getBlockTextureFromSideAndMetadata(int side, int md)
    {
        return blockIndexInTexture + md;
    }

    public String getTextureFile()
    {
        return "/oretex/gems.png";
    }
}
