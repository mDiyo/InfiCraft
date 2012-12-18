package florasoma.clouds;

import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class CloudItem extends ItemBlock
{
    public static final String blockType[] =
    {
        "normal", "dark", "ash", "sulfur"
    };

    public CloudItem(int i)
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
        return (new StringBuilder()).append(blockType[itemstack.getItemDamage()]).append("cloud").toString();
    }
}
