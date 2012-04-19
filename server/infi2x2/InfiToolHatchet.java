package net.minecraft.src.infi2x2;

import net.minecraft.src.forge.ITextureProvider;
import java.util.Random;
import net.minecraft.src.*;

public class InfiToolHatchet extends InfiToolCore
{
    private static Material materialEffectiveAgainst[];

    public InfiToolHatchet(int itemID, InfiMaterialEnum head, InfiMaterialEnum handle, String internalName)
    {
    	super(itemID, 2, head, handle, internalName);
    	this.setMaxDamage(this.getMaxDamage()*2/3);
    }

    public String getTextureFile()
    {
        return "/infi2x2/hatchets.png";
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
		return "Hatchet";
	}
}
