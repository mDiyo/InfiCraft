package net.minecraft.src.mechvent;

import net.minecraft.src.forge.ITextureProvider;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;

public class OreChunkLarge extends Item
    implements ITextureProvider
{
    public static final String blockType[] =
    {
        "iron", "gold", "copper", "turquoise", "chalcocite", "cassiterite", "teallite", "zincBloom",
        "sphalerite", "cerussite", "cobalt", "ardite", "myuvil", "galena", "stone"
    };

    public OreChunkLarge(int i)
    {
        super(i);
        setHasSubtypes(true);
        setMaxDamage(0);
    }

    public String getTextureFile()
    {
        return "/mechtex/orechunks.png";
    }

    public int getIconFromDamage(int meta)
    {
        return iconIndex + meta;
    }

    public String getItemNameIS(ItemStack itemstack)
    {
        return (new StringBuilder()).append(blockType[itemstack.getItemDamage()]).append("ChunkLarge").toString();
    }
}
