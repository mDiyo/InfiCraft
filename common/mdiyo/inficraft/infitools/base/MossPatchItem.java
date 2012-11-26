package mDiyo.inficraft.infitools.base;

import net.minecraft.src.Block;
import net.minecraft.src.EntityPlayer;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;
import net.minecraft.src.ModLoader;
import net.minecraft.src.World;

public class MossPatchItem extends Item
{
    public MossPatchItem(int i)
    {
        super(i);
        setHasSubtypes(true);
        setMaxDamage(0);
        this.setItemName("mossPatchItem");
        ModLoader.addName(this, "Mossy Patch");
    }

    public boolean onItemUseFirst(ItemStack stack, EntityPlayer player, World world, int x, int y, int z, int side, float hitX, float hitY, float hitZ)
    {
        if (side != 1)
        {
            return false;
        }
        if (!player.canPlayerEdit(x, y, z, side, stack) || !player.canPlayerEdit(x, y + 1, z, side, stack))
        {
            return false;
        }
        int i1 = world.getBlockId(x, y, z);
        if (Block.blocksList[i1].renderAsNormalBlock() && world.isAirBlock(x, y + 1, z))
        {
            world.setBlockWithNotify(x, y + 1, z, mod_InfiBase.blockMoss.blockID);
            stack.stackSize--;
            return true;
        }
        else
        {
            return false;
        }
    }

    @Override
    public String getTextureFile()
    {
        return "/infibase/items.png";
    }
}
