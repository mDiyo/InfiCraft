package net.minecraft.src.infibase;

import net.minecraft.src.DamageSource;
import net.minecraft.src.InfiToolPowers;
import net.minecraft.src.ItemStack;
import net.minecraft.src.Entity;
import net.minecraft.src.EntityLiving;
import net.minecraft.src.EntityPlayer;
import net.minecraft.src.NBTTagCompound;
import net.minecraft.src.NBTTagList;
import net.minecraft.src.Potion;
import net.minecraft.src.PotionEffect;
import net.minecraft.src.forge.IEntityInteractHandler;
import java.util.*;

public class EnchantHandler
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
			if(stack != null && ! player.worldObj.isRemote 
					&& this.checkEnchants(stack, (EntityLiving)entity, player) ) 
			{
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
    
    public boolean checkEnchants(ItemStack itemstack, EntityLiving mob, EntityPlayer player)
	{
		int freezeCheck = 0;
		int poisonCheck = 0;
		NBTTagList nbttaglist = itemstack.getEnchantmentTagList();
        if(nbttaglist == null)
        {
            return false;
        }
        for(int j = 0; j < nbttaglist.tagCount(); j++)
        {
            short word0 = ((NBTTagCompound)nbttaglist.tagAt(j)).getShort("id");
            short word1 = ((NBTTagCompound)nbttaglist.tagAt(j)).getShort("lvl");
            if(word0 == 42)
            {
                freezeCheck = word1;
            }
            else if (word0 == 41)
            {
            	poisonCheck = word1;
            	if(rand.nextInt(5) == 0)
            	{
            		if(poisonCheck > 0)
            			((NBTTagCompound)nbttaglist.tagAt(j)).setInteger("lvl", poisonCheck - 1);
            	}
            }
        }
		if(freezeCheck > 0)
        {
			mob.attackEntityFrom(DamageSource.causePlayerDamage(player), itemstack.getDamageVsEntity(mob) );
            mob.freeze(freezeCheck * 50);
        }
		if(poisonCheck > 0)
		{
			mob.attackEntityFrom(DamageSource.causePlayerDamage(player), itemstack.getDamageVsEntity(mob) );
			mob.addPotionEffect(new PotionEffect(Potion.poison.id, poisonCheck * 5, 0));
		}
		return false;
	}
}

