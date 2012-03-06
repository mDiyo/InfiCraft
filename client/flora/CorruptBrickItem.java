package net.minecraft.src.flora;

import net.minecraft.src.*;

public class CorruptBrickItem extends ItemBlock
{
    public static final String blockType[] =
    {
        "blood", "azure", "envy", "amber", "heart", "dark", "bright", "pure", "bloodbrick", "azurebrick",
        "envybrick", "amberbrick", "heartbrick", "darkbrick", "brightbrick", "purebrick"
    };

    public CorruptBrickItem(int i)
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
        return (new StringBuilder()).append(blockType[itemstack.getItemDamage()]).append("corrupted").toString();
    }
}
