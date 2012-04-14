package net.minecraft.src.metals;

import net.minecraft.src.forge.ITextureProvider;
import java.util.Random;
import net.minecraft.src.*;

public class MetalToolShovel extends InfiToolCore
{
    private static Material materialEffectiveAgainst[];

    public MetalToolShovel(int itemID, InfiMaterialEnum head, InfiMaterialEnum handle, String internalName)
    {
    	super(itemID, 2, head, handle, materialEffectiveAgainst, internalName);
    }

    public String getTextureFile()
    {
        return "/metaltex/shovels.png";
    }

    static
    {
        materialEffectiveAgainst = (new Material[]
        {
        	Material.grass, Material.ground, Material.sand, Material.snow, Material.craftedSnow, Material.clay
        });
    }

	@Override
	public String getInvName() 
	{
		return "Shovel";
	}
	
	public boolean canHarvestBlock(Block block)
    {
        if (block == Block.snow)
        {
            return true;
        }
        else
        {
            return block == Block.blockSnow;
        }
    }
}
