package net.minecraft.src.orizon;
import net.minecraft.src.forge.*;
import net.minecraft.src.*;

public class ColoredCobblestoneItem extends CustomItemBlockStone
{
    public static final String blockType[] =
    {
        "medium", "low", "dark", "high", "red", "blue", "yellow", "purple",
        "aqua", "darkgreen", "orange", "pink", "bluegray", "mint", "violet", "cyan"
    };

    public ColoredCobblestoneItem(int i)
    {
        super(i);
        setMaxDamage(0);
        setHasSubtypes(true);
        MinecraftForgeClient.registerCustomItemRenderer(mod_Orizon.cCobble.blockID, this);
    }

    public int getIconFromDamage(int i)
    {
        return mod_Orizon.cCobble.getBlockTextureFromSideAndMetadata(0, i);
    }

    public String getItemNameIS(ItemStack itemstack)
    {
        return (new StringBuilder()).append(blockType[itemstack.getItemDamage()]).append("Cobblestone").toString();
    }
}
