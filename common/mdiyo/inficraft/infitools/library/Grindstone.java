package mDiyo.inficraft.infitools.library;

import net.minecraft.src.Item;
import net.minecraft.src.ModLoader;

public class Grindstone extends Item
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
