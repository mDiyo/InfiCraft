package net.minecraft.src.orizon.tools;

import net.minecraft.src.forge.ForgeHooks;
import net.minecraft.src.forge.ITextureProvider;
import java.util.Random;
import net.minecraft.src.*;

public class OrizonToolAxe extends ItemAxe
    implements ITextureProvider
{

    public OrizonToolAxe(int itemID, EnumToolMaterial mat)
    {
        super(itemID, mat);
    }
    
    @Override
	public String getTextureFile() {
		return "/oretex/orizonitems.png";
	}

}
