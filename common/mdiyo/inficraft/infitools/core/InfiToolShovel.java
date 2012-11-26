package mDiyo.inficraft.infitools.core;

import mDiyo.inficraft.infitools.base.InfiMaterialEnum;
import mDiyo.inficraft.infitools.base.InfiToolCore;
import net.minecraft.src.Block;
import net.minecraft.src.ItemStack;
import net.minecraft.src.Material;

public class InfiToolShovel extends InfiToolCore
{
    private static Material materialEffectiveAgainst[];

    public InfiToolShovel(int itemID, InfiMaterialEnum head, InfiMaterialEnum handle, String internalName)
    {
    	super(itemID, 2, head, handle, internalName);
    }

    public String getTextureFile()
    {
        return "/inficore/shovels.png";
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
