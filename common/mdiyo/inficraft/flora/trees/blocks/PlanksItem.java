package mDiyo.inficraft.flora.trees.blocks;

import net.minecraft.src.ItemBlock;
import net.minecraft.src.ItemStack;

public class PlanksItem extends ItemBlock
{
    public static final String blockType[] =
    {
        "eucalyptus", "sakura", "ghost", "redwood", "blood", "", "", "", "", "", "", "", "", "", "", ""
    };

    public PlanksItem(int i)
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
        return (new StringBuilder()).append(blockType[itemstack.getItemDamage()]).append("FloraPlanks").toString();
    }
}
