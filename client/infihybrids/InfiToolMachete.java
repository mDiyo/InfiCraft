package net.minecraft.src.infihybrids;

import net.minecraft.src.forge.ITextureProvider;
import java.util.Random;
import net.minecraft.src.*;

public class InfiToolMachete extends InfiWeaponCore
{
    private static Material materialEffectiveAgainst[];

    public InfiToolMachete(int itemID, InfiMaterialEnum head, InfiMaterialEnum handle, String internalName)
    {
    	super(itemID, 4, head, handle, internalName);
    }

    public String getTextureFile()
    {
        return "/infihybrids/machetes.png";
    }

    
    public float getStrVsBlock(ItemStack itemstack, Block block, int md)
    {
    	for (int i = 0; i < materialEffectiveAgainst.length; i++)
		{
			if (materialEffectiveAgainst[i] == block.blockMaterial)
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
        return block.blockID == Block.web.blockID ? 15.0F : 1.5F;
    }

    static
    {
        materialEffectiveAgainst = (new Material[]
        {
        	Material.web, Material.leaves, Material.plants, Material.vine, Material.cloth, Material.cactus, Material.pumpkin
        });
    }

	@Override
	public String getInvName() 
	{
		return "Machete";
	}
}
