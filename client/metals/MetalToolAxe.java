package net.minecraft.src.metals;

import net.minecraft.src.forge.ITextureProvider;
import java.util.Random;
import net.minecraft.src.*;

public class MetalToolAxe extends InfiToolCore
{
    private static Material materialEffectiveAgainst[];

    public MetalToolAxe(int itemID, InfiMaterialEnum head, InfiMaterialEnum handle, String internalName)
    {
    	super(itemID, 3, head, handle, materialEffectiveAgainst, internalName);
    }

    public String getTextureFile()
    {
        return "/metaltex/axes.png";
    }

    static
    {
        materialEffectiveAgainst = (new Material[]
        {
        	Material.wood, Material.circuits, Material.cactus
        });
    }

	@Override
	public String getInvName() 
	{
		return "Axe";
	}
}
