package mDiyo.inficraft.flora.trees.blocks;

import net.minecraft.src.ItemBlock;
import net.minecraft.src.ItemStack;

public class RedwoodItem extends ItemBlock
{
    public static final String blockType[] =
    {
        "bark", "heart", "root", "", "", "", "", "", "", "", "", "", "", "", "", ""
    };

    public RedwoodItem(int i)
    {
        super(i);
        setMaxDamage(0);
        setHasSubtypes(true);
    }

    @Override
    public int getMetadata(int md)
    {
        return md;
    }

    public String getItemNameIS(ItemStack itemstack)
    {
        return (new StringBuilder()).append(blockType[itemstack.getItemDamage()]).append("Redwood").toString();
    }
}
