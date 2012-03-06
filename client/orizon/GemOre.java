package net.minecraft.src.orizon;
import net.minecraft.src.forge.*;
import net.minecraft.src.*;

public class GemOre extends Block
    implements ITextureProvider
{
    public GemOre(int id, int texture)
    {
        super(id, texture, Material.rock);
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
        return "/steamtex/gems.png";
    }
}
