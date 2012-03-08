package net.minecraft.src.orizon;
import net.minecraft.src.forge.*;
import net.minecraft.src.*;

public class MineralOreItem extends CustomItemBlockOre
{
    public static final String blockType[] =
    {
        "Copper", "Turquoise", "Chalcocte", "Cassiterite", "Teallite", "ZincBloom", 
        "Sphalerite", "Cerussite", "Cobalt", "Ardite", "Myuvil", "Galena", "Chrysocolla", "Ivymetal"
    };

    public MineralOreItem(int i)
    {
        super(i);
        setMaxDamage(0);
        setHasSubtypes(true);
        MinecraftForgeClient.registerCustomItemRenderer(mod_Orizon.mineralOre.blockID, this);
    }

    public int getIconFromDamage(int i)
    {
        return mod_Orizon.mineralOre.getBlockTextureFromSideAndMetadata(0, i);
    }

    public String getItemNameIS(ItemStack itemstack)
    {
        return (new StringBuilder()).append("mineral").append(blockType[itemstack.getItemDamage()]).toString();
    }
}
