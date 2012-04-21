package net.minecraft.src.infibase;
import net.minecraft.src.*;

import net.minecraft.src.forge.ITextureProvider;

public class Grindstone extends Item
    implements ITextureProvider
{
    public String texturePath;

    public Grindstone(int i, String texture, String itemName)
    {
        super(i);
        texturePath = texture;
        setHasSubtypes(false);
        setMaxDamage(5);
        this.setMaxStackSize(1);
        this.setItemName(itemName);
        ModLoader.addName(this, itemName);
    }

    public String getTextureFile()
    {
        return texturePath;
    }
}
