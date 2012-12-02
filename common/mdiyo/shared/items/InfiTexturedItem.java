package mDiyo.shared.items;

import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Item;
import net.minecraft.src.ModLoader;

public class InfiTexturedItem extends Item
{
    public String texturePath;

    public InfiTexturedItem(int id, String texture, String itemName)
    {
        this(id, texture, itemName, CreativeTabs.tabMisc);
    }
    
    public InfiTexturedItem(int id, String texture, String itemName, CreativeTabs tab)
    {
        super(id);
        setHasSubtypes(true);
        setMaxDamage(0);
        this.setItemName(itemName);
        LanguageRegistry.instance().addStringLocalization(this.getItemName(), "en_US", itemName);
        texturePath = texture;
        setCreativeTab(tab);
    }

    public String getTextureFile()
    {
        return texturePath;
    }
}
