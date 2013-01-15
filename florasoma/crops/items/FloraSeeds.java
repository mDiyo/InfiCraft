package florasoma.crops.items;

import florasoma.common.FloraSomaTab;
import florasoma.crops.FloraCrops;
import net.minecraft.item.ItemSeedFood;

public class FloraSeeds extends ItemSeedFood
{
    public FloraSeeds(int id, int cropID, int soilID)
    {
        super(id, 0, 0, cropID, soilID);
        this.setCreativeTab(FloraSomaTab.tab);
    }

    /*@Override
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
    }*/

    public String getTextureFile()
    {
        return FloraCrops.cropTexture;
    }
}
