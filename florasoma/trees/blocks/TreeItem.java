package florasoma.trees.blocks;

import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class TreeItem extends ItemBlock
{
    public static final String blockType[] =
    {
    	 "eucalyptus", "sakura", "ghost", ""
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
        return (new StringBuilder()).append(blockType[itemstack.getItemDamage()]).append("Log").toString();
    }
}
