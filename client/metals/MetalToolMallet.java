package net.minecraft.src.metals;

import net.minecraft.src.forge.ITextureProvider;
import java.util.Random;
import net.minecraft.src.*;

public class MetalToolMallet extends InfiToolCore
{
    private static Material materialEffectiveAgainst[];

    public MetalToolMallet(int itemID, InfiMaterialEnum head, InfiMaterialEnum handle, String internalName)
    {
    	super(itemID, 3, head, handle, materialEffectiveAgainst, internalName);
    }
    
    public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer entityplayer)
    {
        if((entityplayer.capabilities.isCreativeMode)) {
        	onFoodEaten(itemstack, world, entityplayer);
        } else {
        	entityplayer.setItemInUse(itemstack, getMaxItemUseDuration(itemstack));
        }
        return itemstack;
    }
    
    public ItemStack onFoodEaten(ItemStack itemstack, World world, EntityPlayer entityplayer)
    {
    	entityplayer.swingItem();
    	MovingObjectPosition movingobjectposition = getMovingObjectPositionFromPlayer(world, entityplayer, true);
        if (movingobjectposition == null)
        {
            return itemstack;
        }
        if (movingobjectposition.typeOfHit == EnumMovingObjectType.TILE)
        {
            int x = movingobjectposition.blockX;
            int y = movingobjectposition.blockY;
            int z = movingobjectposition.blockZ;
            int bID = world.getBlockId(x, y, z);
            int md = world.getBlockMetadata(x, y, z);
            
            boolean damageItem = CrackManager.getInstance().crack(world, x, y, z, bID, md);
            if(damageItem) {
            	itemstack.damageItem(1, entityplayer);
            	world.playAuxSFX(2001, x, y, z, bID + (md >> 12));
            }
        }
        
        return itemstack;
    }
    
    public int getMaxItemUseDuration(ItemStack itemstack)
    {
        return 25;
    }
    
    public EnumAction getItemUseAction(ItemStack itemstack)
    {
        return EnumAction.bow;
    }

    public String getTextureFile()
    {
        return "/metaltex/mallets.png";
    }

    static
    {
        materialEffectiveAgainst = (new Material[]
        {
        	Material.rock, Material.iron, Material.ice, Material.glass, Material.piston
        });
    }

	@Override
	public String getInvName() 
	{
		return "Mallet";
	}
}
