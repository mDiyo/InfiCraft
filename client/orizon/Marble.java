package net.minecraft.src.orizon;
import net.minecraft.src.forge.*;
import net.minecraft.src.*;

public class Marble extends Block
    implements ITextureProvider
{
    public Marble(int i, int j)
    {
        super(i, j, Material.rock);
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
        return "/oretex/ores.png";
    }
}
