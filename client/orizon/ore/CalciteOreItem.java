package net.minecraft.src.orizon.ore;
import net.minecraft.src.*;

public class CalciteOreItem extends ItemBlock
{
    public static final String blockType[] =
    {
        "Calcite", "Galena", "Cassiterite", "ZincBloom", "Sphalerite", "Chalcocite"
    };

    public CalciteOreItem(int i)
    {
        super(i);
        setMaxDamage(0);
        setHasSubtypes(true);
    }

    public int getIconFromDamage(int i)
    {
        return mod_Orizon.mineralOre.getBlockTextureFromSideAndMetadata(0, i);
    }

    public int getMetadata(int i)
    {
        return i;
    }

    public String getItemNameIS(ItemStack itemstack)
    {
        return (new StringBuilder()).append("calcite").append(blockType[itemstack.getItemDamage()]).toString();
    }
}
