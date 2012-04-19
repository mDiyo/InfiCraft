package net.minecraft.src.infi2x2;

import net.minecraft.src.forge.ITextureProvider;
import java.util.Random;
import net.minecraft.src.*;

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
        DaggerEntity dagger = makeDaggerEntity(itemstack, world, entityplayer);
        if(!world.isRemote)
        {
            world.spawnEntityInWorld(dagger);
        }
        return new ItemStack(this, 0);
        
    }

    public DaggerEntity makeDaggerEntity(ItemStack itemstack, World world, EntityPlayer entityplayer)
    {
    	DaggerEntity dagger = new DaggerEntity(world, entityplayer, 0.75F, 0.8F);
        dagger.returnStackSlot = entityplayer.inventory.currentItem;
        dagger.texID = iconIndex;
        dagger.tex2ID = secondIconIndex;
        dagger.returnStack = itemstack;
        dagger.damageDealt = this.toolDamage - 1;
        return dagger;
    }

    public DaggerEntity makeDaggerEntity(ItemStack itemstack, World world, double d, double d1, double d2)
    {
    	DaggerEntity dagger = new DaggerEntity(world, d, d1, d2);
        dagger.texID = iconIndex;
        dagger.tex2ID = secondIconIndex;
        dagger.returnStack = itemstack;
        dagger.damageDealt = this.toolDamage - 1;
        return dagger;
    }

    public String getTextureFile()
    {
        return "/infi2x2/daggers.png";
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
		return "Dagger";
	}
}
