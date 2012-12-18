package florasoma.corruptor;

import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class CorruptorItem extends ItemBlock
{
    public static final String blockType[] =
    {
        "blood", "azure", "envy", "amber", "heart", "dark", "bright", "pure", "bloodgrass", "azuregrass",
        "envygrass", "ambergrass", "heartgrass", "darkgrass", "brightgrass", "puregrass"
    };

    public CorruptorItem(int i)
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
        return (new StringBuilder()).append(blockType[itemstack.getItemDamage()]).append("corruptor").toString();
    }
}
