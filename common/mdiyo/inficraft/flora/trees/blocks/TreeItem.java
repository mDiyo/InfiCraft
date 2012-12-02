package mDiyo.inficraft.flora.trees.blocks;

import net.minecraft.src.ItemBlock;
import net.minecraft.src.ItemStack;

public class TreeItem extends ItemBlock
{
    public static final String blockType[] =
    {
    	 "eucalyptusLog", "sakuraLog", "ghostLog", ""
        /*"bark", "heart", "planks", "bloodbark", "bloodplanks", "sakurabark", "sakuraplanks", 
        "eucalyptusbark", "eucalyptusplanks"*/
    };

    public TreeItem(int i)
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
