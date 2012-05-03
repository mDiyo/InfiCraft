package net.minecraft.src.orizon.ore;
import net.minecraft.src.*;

public class NetherOreItem extends ItemBlock
{
    public static final String blockType[] =
    {
        "Bloodbite", "Grudge", "Wistful", "Flamelash", "Tears", "Onyx", "Gold"
    };

    public NetherOreItem(int i)
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
        return (new StringBuilder()).append("nether").append(blockType[itemstack.getItemDamage()])
        		.append("Ore").toString();
    }
}
