package net.minecraft.src.orizon.tools;

import net.minecraft.src.forge.*;
import java.util.*;
import net.minecraft.src.*;

public class OrizonToolShovel extends ItemSpade
    implements ITextureProvider
{
	private static Material materialEffectiveAgainst[];

    public OrizonToolShovel(int itemID, EnumToolMaterial mat)
    {
        super(itemID, mat);
    }
    
    @Override
	public String getTextureFile() {
		return "/oretex/orizonitems.png";
	}
}
