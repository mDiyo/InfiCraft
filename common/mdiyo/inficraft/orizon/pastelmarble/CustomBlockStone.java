package mDiyo.inficraft.orizon.pastelmarble;
import java.util.List;

import net.minecraft.src.Block;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.ItemStack;
import net.minecraft.src.Material;

public class CustomBlockStone extends Block
{
    public CustomBlockStone(int id, int texture)
    {
        super(id, texture, Material.rock);
        enableStats = false;
        setCreativeTab(PastelMarble.stonetab);
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
        return PastelMarble.texture;
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
