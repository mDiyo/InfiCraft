package mDiyo.inficraft.infitools.twoxtwo;

import mDiyo.inficraft.infitools.base.InfiMaterialEnum;
import mDiyo.inficraft.infitools.base.InfiToolCore;
import net.minecraft.src.Block;
import net.minecraft.src.ItemStack;
import net.minecraft.src.Material;

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
