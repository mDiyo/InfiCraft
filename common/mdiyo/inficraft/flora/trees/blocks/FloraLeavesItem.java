package mDiyo.inficraft.flora.trees.blocks;

import net.minecraft.src.ItemBlock;
import net.minecraft.src.ItemStack;

public class FloraLeavesItem extends ItemBlock
{
    public static final String blockType[] =
    {
        "redwood", "eucalyptus", "", "", "", "", "", "", "", "", "", "", "", "", "", ""
    };

	//TODO: Have names tied to this item
    public FloraLeavesItem(int i)
    {
        super(i);
        setMaxDamage(0);
        setHasSubtypes(true);
        //MinecraftForgeClient.registerCustomItemRenderer(mod_FloraSoma.floraLeaves.blockID, this);
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
