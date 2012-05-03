package net.minecraft.src.orizon;

import net.minecraft.src.forge.ITextureProvider;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;

public class MultiIngotNether extends Item
    implements ITextureProvider
{
    public static final String blockType[] =
    {
    	"Bloodbite", "Grudge", "Wistful", "Flamelash", "Tears", "Onyx",
    };

    public MultiIngotNether(int i)
    {
        super(i);
        setHasSubtypes(true);
        setMaxDamage(0);
    }

    public String getTextureFile()
    {
        return "/oretex/orizonitems.png";
    }

    public int getIconFromDamage(int md)
    {
        return iconIndex + md;
    }

    public String getItemNameIS(ItemStack itemstack)
    {
        return (new StringBuilder()).append("ingot").append(blockType[itemstack.getItemDamage()]).toString();
    }
}
