package net.minecraft.src.flora;

import net.minecraft.src.*;

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

    public int getIconFromDamage(int i)
    {
        return mod_FloraSoma.corruptor.getBlockTextureFromSideAndMetadata(0, i);
    }

    public int getMetadata(int i)
    {
        return i;
    }

    public String getItemNameIS(ItemStack itemstack)
    {
        return (new StringBuilder()).append(blockType[itemstack.getItemDamage()]).append("corruptor").toString();
    }
}
