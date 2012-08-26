package mdiyo.shared.items;

import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.src.Item;
import net.minecraft.src.ModLoader;

public class InfiTexturedItem extends Item
{
    public String texturePath;

    public InfiTexturedItem(int i, String texture, String itemName)
    {
        super(i);
        setHasSubtypes(true);
        setMaxDamage(0);
        this.setItemName(itemName);
        LanguageRegistry.instance().addStringLocalization(this.getItemName(), "en_US", itemName);
        texturePath = texture;
    }

    public String getTextureFile()
    {
        return texturePath;
    }
}
