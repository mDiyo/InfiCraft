package mdiyo.inficraft.flora.trees;

import net.minecraft.src.ItemBlock;

public class FloraLeavesItem extends ItemBlock
{
    /*public static final String blockType[] =
    {
        "normal", "dark", "ash", "sulfur"
    };*/

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

    /*public String getItemNameIS(ItemStack itemstack)
    {
        return (new StringBuilder()).append(blockType[itemstack.getItemDamage()]).append("cloud").toString();
    }*/
}
