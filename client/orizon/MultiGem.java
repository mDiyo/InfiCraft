package net.minecraft.src.orizon;

import net.minecraft.src.forge.ITextureProvider;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;

public class MultiGem extends Item
    implements ITextureProvider
{
	String gemNames[] = {
        	"gemRuby", "gemEmerald", "gemSapphire", "gemTopaz",
        	"gemAmethyst", "gemQuartz", "gemRoseQuartz", "gemRockCrystal"
        };

    public MultiGem(int i)
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
        return (new StringBuilder()).append(gemNames[itemstack.getItemDamage()]).toString();
    }
}
