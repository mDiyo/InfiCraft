package net.minecraft.src.orizon;
import net.minecraft.src.forge.*;
import net.minecraft.src.*;

public class MarbleItem extends CustomItemBlockOre
{
    public static final String blockType[] =
    {
        "white", "black", "rose", "emerald", "azure", "ruby"
    };

    public MarbleItem(int i)
    {
        super(i);
        setMaxDamage(0);
        setHasSubtypes(true);
        MinecraftForgeClient.registerCustomItemRenderer(mod_Orizon.marble.blockID, this);
    }

    public int getIconFromDamage(int i)
    {
        return mod_Orizon.marble.getBlockTextureFromSideAndMetadata(0, i);
    }

    public String getItemNameIS(ItemStack itemstack)
    {
        return (new StringBuilder()).append(blockType[itemstack.getItemDamage()]).append("Marble").toString();
    }
}
