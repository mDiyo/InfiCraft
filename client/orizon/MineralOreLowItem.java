package net.minecraft.src.orizon;
import net.minecraft.src.forge.*;
import net.minecraft.src.*;

public class MineralOreLowItem extends CustomItemBlockOre
{
    public static final String blockType[] =
    {
        "Copper", "Turquoise", "Chalcocte", "Cassiterite", "Teallite", "ZincBloom", 
        "Sphalerite", "Cerussite", "Cobalt", "Ardite", "Myuvil", "Galena", "Chrysocolla", "Ivymetal"
    };

    public MineralOreLowItem(int i)
    {
        super(i);
        setMaxDamage(0);
        setHasSubtypes(true);        
        MinecraftForgeClient.registerCustomItemRenderer(mod_Orizon.mineralOreLow2.blockID, this);
    }

    public int getIconFromDamage(int i)
    {
        return mod_Orizon.mineralOreLow2.getBlockTextureFromSideAndMetadata(0, i);
    }

    public String getItemNameIS(ItemStack itemstack)
    {
        return (new StringBuilder()).append("mineral").append(blockType[itemstack.getItemDamage()]).toString();
    }
}
