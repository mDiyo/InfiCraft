package net.minecraft.src.flora;

import net.minecraft.src.*;

public class CloudItem extends ItemBlock
{
    public static final String blockType[] =
    {
        "normal", "dark", "ash", "sulfur"
    };

    public CloudItem(int i)
    {
        super(i);
        setMaxDamage(0);
        setHasSubtypes(true);
    }

    public int getIconFromDamage(int i)
    {
        return mod_FloraSoma.cloud.getBlockTextureFromSideAndMetadata(0, i);
    }

    public int getMetadata(int i)
    {
        return i;
    }

    public String getItemNameIS(ItemStack itemstack)
    {
        return (new StringBuilder()).append(blockType[itemstack.getItemDamage()]).append("cloud").toString();
    }
}
