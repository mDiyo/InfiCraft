package mDiyo.inficraft.infitools.twoxtwo;

import mDiyo.inficraft.infitools.library.InfiMaterialEnum;
import mDiyo.inficraft.infitools.library.InfiWeaponCore;
import net.minecraft.src.Block;
import net.minecraft.src.EntityPlayer;
import net.minecraft.src.ItemStack;
import net.minecraft.src.Material;
import net.minecraft.src.World;

public class InfiToolDagger extends InfiWeaponCore
{
    private static Material materialEffectiveAgainst[];

    public InfiToolDagger(int itemID, InfiMaterialEnum head, InfiMaterialEnum handle, String internalName)
    {
    	super(itemID, 3, head, handle, internalName);
    	this.setMaxDamage(this.getMaxDamage()/2);
    }
    
    public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer entityplayer)
    {
    	System.out.println("check " + this.headType);
        DaggerEntity dagger = new DaggerEntity(itemstack, world, entityplayer);
        if(!world.isRemote)
        {
            world.spawnEntityInWorld(dagger);
        }
        ItemStack is = itemstack.copy();
        is.stackSize--;
        return is;
        
    }
    
    public String getTextureFile()
    {
        return "/infitextures/daggers.png";
    }

    @Override
    public float getStrVsBlock(ItemStack par1ItemStack, Block par2Block)
    {
        return par2Block.blockID == Block.web.blockID ? 15.0F : 1.5F;
    }
    
    @Override
    public float getStrVsBlock(ItemStack par1ItemStack, Block par2Block, int md)
    {
        return getStrVsBlock(par1ItemStack, par2Block);
    }

	@Override
	public String getInvName() 
	{
		return "Dagger";
	}
}
