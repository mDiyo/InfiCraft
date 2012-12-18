package inficraft.infiblocks;

import inficraft.api.detailing.DetailManager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumMovingObjectType;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class Chisel extends Item
{
	
    public Chisel(int id, int durability)
    {
        super(id);
        maxStackSize = 1;
        setMaxDamage(durability);
    }
    
    @Override
    public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer entityplayer)
    {
        if((entityplayer.capabilities.isCreativeMode)) {
        	useItemInCreative(itemstack, world, entityplayer);
        } else {
        	entityplayer.setItemInUse(itemstack, getMaxItemUseDuration(itemstack));
        }
        return itemstack;
    }
    
    @Override
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
            
            boolean damageItem = DetailManager.getInstance().detail(world, x, y, z, bID, md);
            if(damageItem) {
            	itemstack.damageItem(1, entityplayer);
            	world.playAuxSFX(2001, x, y, z, bID + (md >> 12));
            }
        }
        
        return itemstack;
    }
    
    public ItemStack useItemInCreative(ItemStack itemstack, World world, EntityPlayer entityplayer)
    {
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
            
            boolean damageItem = DetailManager.getInstance().detail(world, x, y, z, bID, md);
            if(damageItem) {
            	world.playAuxSFX(2001, x, y, z, bID + (md << 12));
            	entityplayer.swingItem();
            }
        }
        
        return itemstack;
    }
    
    @Override
    public int getMaxItemUseDuration(ItemStack itemstack)
    {
        return 15;
    }
    
    @Override
    public EnumAction getItemUseAction(ItemStack itemstack)
    {
        return EnumAction.bow;
    }
    
    /*public void onUsingItemTick(ItemStack stack, EntityPlayer player, int count) 
    {
    	
    }*/

    /*public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer entityplayer)
    {
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
            
            //boolean damageItem = replaceBlock(world, x, y, z, bID, md);
            boolean damageItem = DetailManager.getInstance().detail(world, x, y, z, bID, md);
            if(damageItem) {
            	itemstack.damageItem(1, entityplayer);
            	world.playAuxSFX(2001, x, y, z, bID + md * 256);
            	entityplayer.swingItem();
            }
        }
        return itemstack;
    }*/
    
    @Override
    public String getTextureFile()
    {
        return InfiBlocks.blocksImage;
    }
}
