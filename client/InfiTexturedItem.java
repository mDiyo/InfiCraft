package net.minecraft.src;

import net.minecraft.src.forge.ITextureProvider;

public class InfiTexturedItem extends Item
    implements ITextureProvider
{
    public String texturePath;

    public InfiTexturedItem(int i, String texture, String itemName)
    {
        super(i);
        texturePath = texture;
        setHasSubtypes(true);
        setMaxDamage(0);
        this.setItemName(itemName);
        ModLoader.addName(this, itemName);
    }

    public String getTextureFile()
    {
        return texturePath;
    }
}
