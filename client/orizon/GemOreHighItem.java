package net.minecraft.src.orizon;
import net.minecraft.src.forge.*;
import net.minecraft.src.*;

public class GemOreHighItem extends CustomItemBlockGem
{
    public GemOreHighItem(int id)
    {
        super(id);
        setMaxDamage(0);
        setHasSubtypes(true);
        MinecraftForgeClient.registerCustomItemRenderer(mod_Orizon.gemOreHigh.blockID, this);
    }

    public int getIconFromDamage(int md)
    {
        return mod_Orizon.gemOreHigh.getBlockTextureFromSideAndMetadata(0, md);
    }
    
    public static final String blockType[] =
    {
        "Ruby", "Emerald", "Sapphire", "Topaz", "Amethyst", "Quartz", "RoseQuartz", "RockCrystal"
    };

    public String getItemNameIS(ItemStack itemstack)
    {
        return (new StringBuilder()).append("gem").append(blockType[itemstack.getItemDamage()])
        		.append("Ore").toString();
    }
}
