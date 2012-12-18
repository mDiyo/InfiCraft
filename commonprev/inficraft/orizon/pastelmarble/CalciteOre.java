package inficraft.orizon.pastelmarble;
import net.minecraft.src.Block;
import net.minecraft.src.Material;

public class CalciteOre extends Block
{
    public CalciteOre(int i, int j)
    {
        super(i, j, Material.rock);
        enableStats = false;
    }
    
    public boolean getEnableStats() {return false;}

    public int damageDropped(int i)
    {
        return i;
    }

    public int getBlockTextureFromSideAndMetadata(int i, int j)
    {
        return blockIndexInTexture + j;
    }
}
