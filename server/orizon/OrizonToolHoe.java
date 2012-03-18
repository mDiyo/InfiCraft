package net.minecraft.src.orizon;

import net.minecraft.src.forge.ITextureProvider;
import java.util.Random;
import net.minecraft.src.*;

public class OrizonToolHoe extends ItemHoe
    implements ITextureProvider
{
    public OrizonToolHoe(int itemID, EnumToolMaterial mat)
    {
        super(itemID, mat);
    }
    
    @Override
	public String getTextureFile() {
		return "/oretex/orizonitems.png";
	}
}
