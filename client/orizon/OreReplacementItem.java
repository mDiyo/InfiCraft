package net.minecraft.src.orizon;
import net.minecraft.src.forge.*;
import net.minecraft.src.*;

public class OreReplacementItem extends CustomItemBlockOre
{
    public static final String blockType[] =
    {
        "Coal", "Coal", "Coal", "Coal", "Diamond", "Diamond", "Diamond", "Diamond", 
        "Lapis", "Lapis", "Lapis", "Lapis", "Redstone", "Redstone", "Redstone", "Redstone"
    };

    public OreReplacementItem(int i)
    {
        super(i);
        setMaxDamage(0);
        setHasSubtypes(true);
        MinecraftForgeClient.registerCustomItemRenderer(mod_Orizon.replaceOre.blockID, this);
    }

    public int getIconFromDamage(int i)
    {
        return mod_Orizon.replaceOre.getBlockTextureFromSideAndMetadata(0, i);
    }

    public String getItemNameIS(ItemStack itemstack)
    {
        return (new StringBuilder()).append("ore").append(blockType[itemstack.getItemDamage()]).toString();
    }
}
