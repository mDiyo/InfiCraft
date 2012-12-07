package mDiyo.inficraft.flora.trees.blocks;

import net.minecraft.src.ItemBlock;
import net.minecraft.src.ItemStack;

public class FloraLeavesNoColorItem extends ItemBlock
{
    public static final String blockType[] =
    {
    	 "sakura", "ghost", "", "blood",  "", "", "", "", "", "", "", "", "", "", "", "", ""
    };

    public FloraLeavesNoColorItem(int i)
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
        return (new StringBuilder()).append(blockType[itemstack.getItemDamage()]).append("FloraLeaves").toString();
    }
}
