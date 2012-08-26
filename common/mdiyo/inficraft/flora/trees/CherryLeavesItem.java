package mdiyo.inficraft.flora.trees;

import net.minecraft.src.ItemBlock;

public class CherryLeavesItem extends ItemBlock
{
    /*public static final String blockType[] =
    {
    };*/

	//TODO: Make this have actual names
    public CherryLeavesItem(int i)
    {
        super(i);
        setMaxDamage(0);
        setHasSubtypes(true);
    }

    public int getIconFromDamage(int i)
    {
        return FloraTrees.cherryLeaves.getBlockTextureFromSideAndMetadata(0, i);
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
