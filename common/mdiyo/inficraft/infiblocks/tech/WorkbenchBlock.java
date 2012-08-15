package mdiyo.inficraft.infiblocks.tech;

import net.minecraft.src.Block;
import net.minecraft.src.EntityPlayer;
import net.minecraft.src.Material;
import net.minecraft.src.World;

import mdiyo.inficraft.infiblocks.InfiBlocks;
import mdiyo.inficraft.infiblocks.InfiBlocksCommonProxy;

public class WorkbenchBlock extends Block
{
    public WorkbenchBlock(int i)
    {
        super(i, 1, Material.wood);
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

    public boolean blockActivated(World world, int x, int y, int z, EntityPlayer player)
    {
        if (world.isRemote)
        {
            return true;
        }
        else
        {
        	player.openGui(InfiBlocks.getContentInstance(), InfiBlocksCommonProxy.craftingGuiID, world, x, y, z);
            return true;
        }
    }

    protected int damageDropped(int i)
    {
        return i;
    }

    public String getTextureFile()
    {
        return InfiBlocks.techImage;
    }
}
