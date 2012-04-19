package net.minecraft.src.inficore;

import net.minecraft.src.forge.ITextureProvider;
import java.util.Random;
import net.minecraft.src.*;

public class InfiToolSword extends InfiWeaponCore
{
    private static Material materialEffectiveAgainst[];

    public InfiToolSword(int itemID, InfiMaterialEnum head, InfiMaterialEnum handle, String internalName)
    {
    	super(itemID, 4, head, handle, internalName);
    }

    public String getTextureFile()
    {
        return "/inficore/swords.png";
    }
    
    public float getStrVsBlock(ItemStack par1ItemStack, Block par2Block)
    {
        return par2Block.blockID == Block.web.blockID ? 15.0F : 1.5F;
    }
    
    public float getStrVsBlock(ItemStack par1ItemStack, Block par2Block, int md)
    {
        return par2Block.blockID == Block.web.blockID ? 15.0F : 1.5F;
    }

	@Override
	public String getInvName() 
	{
		return "Sword";
	}
	
	/**
     * Called whenever this item is equipped and the right mouse button is pressed. Args: itemStack, world, entityPlayer
     */
    public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
    {
        par3EntityPlayer.setItemInUse(par1ItemStack, this.getMaxItemUseDuration(par1ItemStack));
        return par1ItemStack;
    }
}
