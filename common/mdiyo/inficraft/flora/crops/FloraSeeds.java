package mDiyo.inficraft.flora.crops;

import net.minecraft.src.EntityPlayer;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;
import net.minecraft.src.World;

public class FloraSeeds extends Item
{
    private int blockType;
    private int plantableBlock;

    public FloraSeeds(int i, int j, int k)
    {
        super(i);
        blockType = j;
        plantableBlock = k;
    }

    @Override
    public boolean onItemUseFirst(ItemStack stack, EntityPlayer player, World world, int x, int y, int z, int side, float hitX, float hitY, float hitZ)
    {
        if (side != 1)
        {
            return false;
        }
        if (!player.canPlayerEdit(x, y, z, x, stack) || !player.canPlayerEdit(x, y + 1, z, x, stack))
        {
            return false;
        }
        int i1 = world.getBlockId(x, y, z);
        if (i1 == plantableBlock && world.isAirBlock(x, y + 1, z))
        {
            world.setBlockWithNotify(x, y + 1, z, blockType);
            stack.stackSize--;
            return true;
        }
        else
        {
            return false;
        }
    }

    public String getTextureFile()
    {
        return FloraCrops.seedTexture;
    }
}
