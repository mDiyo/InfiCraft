package net.minecraft.src.inficore;

import net.minecraft.src.forge.ITextureProvider;
import java.util.Random;
import net.minecraft.src.*;

public class InfiToolHoe extends InfiHoeCore
{
    private static Material materialEffectiveAgainst[];

    public InfiToolHoe(int itemID, InfiMaterialEnum head, InfiMaterialEnum handle, String internalName)
    {
    	super(itemID, 0, head, handle, internalName);
    }

    public String getTextureFile()
    {
        return "/inficore/hoes.png";
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
	
	public float getStrVsBlock(ItemStack itemstack, Block block, int meta)
	{
		for (int i = 0; i < materialEffectiveAgainst.length; i++)
		{
			if (materialEffectiveAgainst[i] == block.blockMaterial )
			{
				if (this.headShoddy || this.handleShoddy)
				{
					return efficiencyOnProperMaterial + (float)itemstack.getItemDamage() / 100F;
				}
				else
				{
					return efficiencyOnProperMaterial;
				}
			}
		}
		return 1.0F;
	}
}
