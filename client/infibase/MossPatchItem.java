package net.minecraft.src.infibase;

import net.minecraft.src.forge.ITextureProvider;
import net.minecraft.src.*;

public class MossPatchItem extends Item
    implements ITextureProvider
{
    public MossPatchItem(int i)
    {
        super(i);
        setHasSubtypes(true);
        setMaxDamage(0);
        this.setItemName("mossPatchItem");
        ModLoader.addName(this, "Mossy Patch");
    }

    public boolean onItemUse(ItemStack itemstack, EntityPlayer entityplayer, World world, int i, int j, int k, int l)
    {
        if (l != 1)
        {
            return false;
        }
        if (!entityplayer.canPlayerEdit(i, j, k) || !entityplayer.canPlayerEdit(i, j + 1, k))
        {
            return false;
        }
        int i1 = world.getBlockId(i, j, k);
        if (Block.blocksList[i1].renderAsNormalBlock() && world.isAirBlock(i, j + 1, k))
        {
            world.setBlockWithNotify(i, j + 1, k, mod_InfiBase.blockMoss.blockID);
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
        return "/inifbase/items.png";
    }
}
