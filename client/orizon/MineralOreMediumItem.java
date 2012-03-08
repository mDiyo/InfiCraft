package net.minecraft.src.orizon;
import net.minecraft.src.forge.*;
import net.minecraft.src.*;

public class MineralOreMediumItem extends CustomItemBlockOre
{
    public static final String blockType[] =
    {
        "Copper", "Turquoise", "Chalcocte", "Cassiterite", "Teallite", "ZincBloom", 
        "Sphalerite", "Cerussite", "Cobalt", "Ardite", "Myuvil", "Galena", "Chrysocolla", "Ivymetal"
    };

    public MineralOreMediumItem(int i)
    {
        super(i);
        setMaxDamage(0);
        setHasSubtypes(true);
        MinecraftForgeClient.registerCustomItemRenderer(mod_Orizon.mineralOreLow1.blockID, this);
    }

    public int getIconFromDamage(int i)
    {
        return mod_Orizon.mineralOreLow1.getBlockTextureFromSideAndMetadata(0, i);
    }

    public String getItemNameIS(ItemStack itemstack)
    {
        return (new StringBuilder()).append("mineral").append(blockType[itemstack.getItemDamage()]).toString();
    }
}
