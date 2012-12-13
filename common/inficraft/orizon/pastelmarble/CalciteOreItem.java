package inficraft.orizon.pastelmarble;
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
    
    public int getMetadata(int i)
    {
        return i;
    }

    public String getItemNameIS(ItemStack itemstack)
    {
        return (new StringBuilder()).append("calcite").append(blockType[itemstack.getItemDamage()]).toString();
    }
}
