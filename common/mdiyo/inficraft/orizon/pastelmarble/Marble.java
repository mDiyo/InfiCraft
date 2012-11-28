package mDiyo.inficraft.orizon.pastelmarble;
import net.minecraft.src.Block;
import net.minecraft.src.Material;

public class Marble extends Block
{
    public Marble(int i, int j)
    {
        super(i, j, Material.rock);
        enableStats = false;
    }
    
    public boolean getEnableStats() {return false;}

    public int damageDropped(int md)
    {
        return md;
    }

    public int getBlockTextureFromSideAndMetadata(int side, int md)
    {
        return blockIndexInTexture + md;
    }

    public String getTextureFile()
    {
        return "/oretex/ores.png";
    }
}
