package net.minecraft.src.metals;

import net.minecraft.src.forge.ITextureProvider;
import java.util.Random;
import net.minecraft.src.*;

public class MetalToolHoe extends InfiHoeCore
{
    private static Material materialEffectiveAgainst[];

    public MetalToolHoe(int itemID, InfiMaterialEnum head, InfiMaterialEnum handle, String internalName)
    {
    	super(itemID, 0, head, handle, materialEffectiveAgainst, internalName);
    }

    public String getTextureFile()
    {
        return "/metaltex/hoes.png";
    }

    static
    {
        materialEffectiveAgainst = (new Material[]
        {
        	Material.pumpkin, Material.grass, Material.plants
        });
    }

	@Override
	public String getInvName() 
	{
		return "Hoe";
	}
}
