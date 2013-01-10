package florasoma.trees.blocks;

import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import florasoma.trees.FloraTrees;

public class FloraSaplingItem extends ItemBlock
{
	public static final String blockType[] =
	{
	    "redwood", "eucalyptus", "bush", "sakura", "ghost", "blood", "", "", "", "", "", "", "", "", "", ""
	};
	
    public FloraSaplingItem(int i)
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

    public int getIconFromDamage(int i)
    {
        return FloraTrees.floraSapling.getBlockTextureFromSideAndMetadata(0, i);
    }
    
    public String getItemNameIS(ItemStack itemstack)
    {
        return (new StringBuilder()).append(blockType[itemstack.getItemDamage()]).append("FloraSapling").toString();
    }
}
