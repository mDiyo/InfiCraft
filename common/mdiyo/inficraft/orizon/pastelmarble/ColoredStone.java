package mDiyo.inficraft.orizon.pastelmarble;
import java.util.List;
import java.util.Random;

import net.minecraft.src.Block;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.ItemStack;
import net.minecraft.src.Material;
import net.minecraft.src.World;

public class ColoredStone extends Block
{
    public ColoredStone(int i, int j)
    {
        super(i, j, Material.rock);
        enableStats = false;
        setCreativeTab(PastelMarble.stonetab);
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
    
    @Override
    public boolean isGenMineableReplaceable(World world, int x, int y, int z)
    {
        return true;
    }
    
    @Override
    public void getSubBlocks(int id, CreativeTabs tab, List list)
    {
    	for (int iter = 0; iter < 16; iter++)
    	{
    		list.add(new ItemStack(id, 1, iter));
    	}
    }
}
