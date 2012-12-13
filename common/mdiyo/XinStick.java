package mDiyo;

import inficraft.armory.ArmorStandEntity;
import mDiyo.simplebackground.SimpleBGM;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Entity;
import net.minecraft.src.EntityItem;
import net.minecraft.src.EntityPlayer;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;
import net.minecraft.src.World;

/*
 * mDiyo's development testing mod
 * Does everything on right-click!
 */

public class XinStick extends Item
{
	public XinStick(int id) { 
		super(id);
		setCreativeTab(CreativeTabs.tabMisc);
		}

	@Override
	public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player)
    {
		//System.out.println("Click2");
		//SimpleBGM.instance.playBGM();
		//world.playSound(player.posX, player.posY, player.posZ, SimpleBGM.jar, 1f, 1f);
		//SimpleBGM.playBackgroundMusic(SimpleBGM.alaflair);
		spawnEntity(player.posX, player.posY, player.posZ, new ArmorStandEntity(world), world);
        return stack;
    }
	
	public static void spawnItem(double x, double y, double z, ItemStack stack, World world)
    {
    	if (!world.isRemote)
    	{
	        EntityItem entityitem = new EntityItem(world, x + 0.5D, y + 0.5D, z + 0.5D, stack);
	        entityitem.delayBeforeCanPickup = 10;
	        world.spawnEntityInWorld(entityitem);
    	}
    }
	
	public static void spawnEntity(double x, double y, double z, Entity entity, World world)
    {
    	if (!world.isRemote)
    	{
    		entity.setPosition(x, y, z);
	        world.spawnEntityInWorld(entity);
    	}
    }
}
