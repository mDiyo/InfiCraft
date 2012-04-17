package net.minecraft.src.infi2x2;

import net.minecraft.src.forge.ForgeHooks;
import net.minecraft.src.forge.ITextureProvider;
import java.util.Random;
import net.minecraft.src.*;

public class InfiToolTrowel extends InfiToolCore
{
    private static Material materialEffectiveAgainst[];

    public InfiToolTrowel(int itemID, InfiMaterialEnum head, InfiMaterialEnum handle, String internalName)
    {
    	super(itemID, 2, head, handle, internalName);
    	this.setMaxDamage(this.getMaxDamage()/2);
    }

    public String getTextureFile()
    {
        return "/infi2x2/trowels.png";
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
		return "Trowel";
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
	
	public boolean onItemUse(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, World par3World, int par4, int par5, int par6, int par7)
    {
        if (!par2EntityPlayer.canPlayerEdit(par4, par5, par6))
        {
            return false;
        }
        else
        {
            if (ForgeHooks.onUseHoe(par1ItemStack, par2EntityPlayer, par3World, par4, par5, par6))
            {
                par1ItemStack.damageItem(1, par2EntityPlayer);
                return true;
            }
            int var8 = par3World.getBlockId(par4, par5, par6);
            int var9 = par3World.getBlockId(par4, par5 + 1, par6);

            if ((par7 == 0 || var9 != 0 || var8 != Block.grass.blockID) && var8 != Block.dirt.blockID)
            {
                return false;
            }
            else
            {
                Block var10 = Block.tilledField;
                par3World.playSoundEffect((double)((float)par4 + 0.5F), (double)((float)par5 + 0.5F), (double)((float)par6 + 0.5F), var10.stepSound.getStepSound(), (var10.stepSound.getVolume() + 1.0F) / 2.0F, var10.stepSound.getPitch() * 0.8F);

                if (par3World.isRemote)
                {
                    return true;
                }
                else
                {
                    par3World.setBlockWithNotify(par4, par5, par6, var10.blockID);
                    par1ItemStack.damageItem(2, par2EntityPlayer);
                    return true;
                }
            }
        }
    }
}
