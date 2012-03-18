package net.minecraft.src.orizon;
import net.minecraft.src.forge.*;
import net.minecraft.src.*;

public class NetherOre extends Block
    implements ITextureProvider
{
    public NetherOre(int i, int j)
    {
        super(i, j, Material.rock);
        enableStats = false;
    }
    
    public boolean getEnableStats() {return false;}

    protected int damageDropped(int md)
    {
        return md;
    }
    
    @Override
    public float getHardness(int md) {
    	switch (md) {
    	case 0: return 2.0F;
    	case 1: return 5.0F;
    	case 2: return 3.0F;
    	case 3: return 8.0F;
    	case 4: return 12.0F;
    	case 5: return 3.0F;
    	default: return 1.0F;
    	}
    }

    public int getBlockTextureFromSideAndMetadata(int i, int j)
    {
        return blockIndexInTexture + j;
    }

    public String getTextureFile()
    {
        return "/oretex/ores.png";
    }
}
