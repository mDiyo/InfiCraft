package inficraft.api;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import cpw.mods.fml.common.registry.LanguageRegistry;

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
        LanguageRegistry.instance().addNameForObject(this, "en_US", itemName);
        texturePath = texture;
        setCreativeTab(tab);
        
    }

    public String getTextureFile()
    {
        return texturePath;
    }
}
