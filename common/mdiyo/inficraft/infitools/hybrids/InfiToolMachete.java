package mDiyo.inficraft.infitools.hybrids;

import mDiyo.inficraft.infitools.library.InfiMaterialEnum;
import mDiyo.inficraft.infitools.library.InfiWeaponCore;
import net.minecraft.src.Block;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.EntityLiving;
import net.minecraft.src.EntityPlayer;
import net.minecraft.src.ItemStack;
import net.minecraft.src.Material;

public class InfiToolMachete extends InfiWeaponCore
{
    private static Material materialEffectiveAgainst[];

    public InfiToolMachete(int itemID, InfiMaterialEnum head, InfiMaterialEnum handle, String internalName)
    {
    	super(itemID, 4, head, handle, internalName);
    	//this.setCreativeTab(CreativeTabs.tabTools);
    }

    public String getTextureFile()
    {
        return "/infitextures/machetes.png";
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
	
	@Override
	public boolean onBlockDestroyed(ItemStack itemstack, int bID, int x, int y, int z, EntityLiving entityliving)
    {
        int unbreaking = headUnbreaking;
        if (handleUnbreaking > unbreaking)
        	unbreaking = handleUnbreaking;
        if (random.nextInt(100) + 1 <= 100 - (unbreaking * 10))
        {
            itemstack.damageItem(1, entityliving);
        }
        if (itemstack.stackSize == 0)
        	((EntityPlayer)entityliving).destroyCurrentEquippedItem();
        return true;
    }
}
