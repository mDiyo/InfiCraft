package florasoma.trees.blocks;

import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

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
