package net.minecraft.src.flora;

import net.minecraft.src.*;
import net.minecraft.src.forge.*;

public class FloraLeavesItem extends CustomItemBlockFlora
{
    /*public static final String blockType[] =
    {
        "normal", "dark", "ash", "sulfur"
    };*/

    public FloraLeavesItem(int i)
    {
        super(i);
        setMaxDamage(0);
        setHasSubtypes(true);
    }

    public int getIconFromDamage(int i)
    {
        return mod_FloraSoma.cloud.getBlockTextureFromSideAndMetadata(0, i);
    }

    /*public String getItemNameIS(ItemStack itemstack)
    {
        return (new StringBuilder()).append(blockType[itemstack.getItemDamage()]).append("cloud").toString();
    }*/
}
