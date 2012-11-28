package mDiyo.inficraft.orizon.pastelmarble;
import java.util.Random;

import net.minecraft.src.Block;
import net.minecraft.src.Material;

public class ColoredStone extends Block
{
    public ColoredStone(int i, int j)
    {
        super(i, j, Material.rock);
        enableStats = false;
    }
    
	public boolean getEnableStats() {return false;}
    
    public int damageDropped(int md)
    {
        return md;
    }
    
    @Override
    public int idDropped(int par1, Random par2Random, int par3)
    {
    	return PHPastel.cCobbleID;
    }
    
    public int getBlockTextureFromSideAndMetadata(int side, int md)
    {
        return blockIndexInTexture + md;
    }
    
    public String getTextureFile()
    {
        return PastelMarble.texture;
    }
}
