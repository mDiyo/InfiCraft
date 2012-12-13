package inficraft.orizon.pastelmarble;
import net.minecraft.src.ItemBlock;
import net.minecraft.src.ItemStack;

public class MarbleItem extends ItemBlock
{
    public static final String blockType[] =
    {
        "white", "black", "rose", "emerald", "azure", "ruby", "whiteCobble", "blackCobble", "roseCobble", "emeraldCobble", "azureCobble", "rubyCobble"
    };

    public MarbleItem(int i)
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
        return (new StringBuilder()).append(blockType[itemstack.getItemDamage()]).append("Marble").toString();
    }
}
