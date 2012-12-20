package inficraft.infiblocks.tech;

import inficraft.infiblocks.InfiBlocks;
import inficraft.infiblocks.InfiBlocksCommonProxy;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;


public class WorkbenchBlock extends Block
{
    public WorkbenchBlock(int i)
    {
        super(i, 1, Material.cactus);
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
