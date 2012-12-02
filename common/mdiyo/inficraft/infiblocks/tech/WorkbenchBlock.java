package mDiyo.inficraft.infiblocks.tech;

import java.util.List;

import net.minecraft.src.Block;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.EntityPlayer;
import net.minecraft.src.ItemStack;
import net.minecraft.src.Material;
import net.minecraft.src.World;

import mDiyo.inficraft.infiblocks.InfiBlocks;
import mDiyo.inficraft.infiblocks.InfiBlocksCommonProxy;

public class WorkbenchBlock extends Block
{
    public WorkbenchBlock(int i)
    {
        super(i, 1, Material.wood);
        setCreativeTab(InfiBlocks.infiBlockTab);
    }

    public int getBlockTextureFromSideAndMetadata(int side, int meta)
    {
        if (side == 1)
        {
            return (blockIndexInTexture - 1) + meta * 4;
        }
        if (side == 0)
        {
            return blockIndexInTexture + 2 + meta * 4;
        }
        if (side == 2 || side == 4)
        {
            return blockIndexInTexture + 1 + meta * 4;
        }
        else
        {
            return blockIndexInTexture + meta * 4;
        }
    }

    @Override
    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int par6, float par7, float par8, float par9)
    {
        if (world.isRemote)
        {
            return true;
        }
        else
        {
        	player.openGui(InfiBlocks.instance, InfiBlocksCommonProxy.craftingGuiID, world, x, y, z);
            return true;
        }
    }

    public int damageDropped(int i)
    {
        return i;
    }

    public String getTextureFile()
    {
        return InfiBlocks.techImage;
    }
    
    @Override
    public void getSubBlocks(int id, CreativeTabs tab, List list)
    {
    	for (int iter = 0; iter < 11; iter++)
    	{
    		list.add(new ItemStack(id, 1, iter));
    	}
    }
}
