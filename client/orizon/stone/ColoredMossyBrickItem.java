package net.minecraft.src.orizon.stone;
import net.minecraft.src.forge.*;
import net.minecraft.src.*;

public class ColoredMossyBrickItem extends ItemBlock
{
    public static final String blockType[] =
    {
        "medium", "low", "dark", "high", "red", "blue", "yellow", "purple",
        "aqua", "darkgreen", "orange", "pink", "bluegray", "mint", "violet", "cyan"
    };

    public ColoredMossyBrickItem(int i)
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
        return (new StringBuilder()).append(blockType[itemstack.getItemDamage()]).append("Stone").toString();
    }
}
