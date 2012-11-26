package mDiyo.inficraft.flora.crops;

import net.minecraft.src.Block;
import net.minecraft.src.EntityPlayer;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;
import net.minecraft.src.World;

public class SeedBag extends Item
{
    private int blockType;
    private int soilBlock;

    public SeedBag(int i)
    {
        super(i);
        blockType = Block.crops.blockID;
        soilBlock = Block.tilledField.blockID;
    }

    @Override
    public boolean onItemUse(ItemStack itemstack, EntityPlayer player, World world, int x, int y, int z, int meta, float par8, float par9, float par10)
    {
        if (meta != 1)
        {
            return false;
        }
        else if (player.canPlayerEdit(x, y, z, meta, itemstack) && player.canPlayerEdit(x, y + 1, z, meta, itemstack))
        {
            return false;
        }
        boolean flag = false;
        for (int i1 = x - 1; i1 <= x + 1; i1++)
        {
            for (int j1 = y + 1; j1 <= y + 1; j1++)
            {
                for (int k1 = z - 1; k1 <= z + 1; k1++)
                {
                    int l1 = world.getBlockId(i1, j1 - 1, k1);
                    if (l1 == soilBlock && world.isAirBlock(x, y + 1, z))
                    {
                        world.setBlockWithNotify(i1, j1, k1, blockType);
                        flag = true;
                    }
                }
            }
        }

        if (flag)
        {
            itemstack.stackSize--;
            return true;
        }
        else
        {
            return false;
        }
    }

    public String getTextureFile()
    {
        return "/floratex/seeds.png";
    }
}
