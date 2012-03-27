package net.minecraft.src.core;

import net.minecraft.src.DamageSource;
import net.minecraft.src.InfiToolPowers;
import net.minecraft.src.ItemStack;
import net.minecraft.src.Entity;
import net.minecraft.src.EntityLiving;
import net.minecraft.src.EntityPlayer;
import net.minecraft.src.forge.IEntityInteractHandler;
import java.util.*;

public class FreezeHandler
	implements IEntityInteractHandler 
{
	Random rand = new Random();
	@Override
	public boolean onEntityInteract(EntityPlayer player,
			Entity entity,  boolean isAttack) 
	{
		
		if (entity instanceof EntityLiving) 
		{
			ItemStack stack = player.getCurrentEquippedItem();
			if(stack != null && ! player.worldObj.isRemote &&
					InfiToolPowers.freezingEnchant(stack, (EntityLiving)entity) ) {
				//entity.worldObj.playSoundAtEntity(entity, "random.glass", 1.0F, this.rand.nextFloat() - this.rand.nextFloat() * 0.2F + 1.0F);
				entity.attackEntityFrom(DamageSource.causePlayerDamage(player), stack.getDamageVsEntity(entity) );
				((EntityLiving) entity).freeze(500);
				return false;
			} else
			{ 
				return true;
			}
		} else
		{
			return true;
		}
		
	}
}

