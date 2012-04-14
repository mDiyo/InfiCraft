// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

package net.minecraft.src.timberframes;

import net.minecraft.src.EntityPlayer;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;
import net.minecraft.src.World;
import net.minecraft.src.mod_Kaevator_Beams;


// Referenced classes of package net.minecraft.src:
//            Item, EntityPainting, World, ItemStack, 
//            EntityPlayer

public class ItemBeams_Kaevator extends Item
{

    public ItemBeams_Kaevator(int i)
    {
        super(i);
        setHasSubtypes(true);
    }
    
    public int getIconFromDamage(int i)
    {    	
		if(i == 1){
			return mod_Kaevator_Beams.steelBeamItemIndex;
		}
    	return mod_Kaevator_Beams.woodBeamItemIndex;
    }

    public boolean onItemUse(ItemStack itemstack, EntityPlayer entityplayer, World world, int i, int j, int k, int l)
    {
        if(l == 0)
        {
            return false;
        }
        if(l == 1)
        {
            return false;
        }
        byte byte0 = 0;
        if(l == 4)
        {
            byte0 = 1;
        }
        if(l == 3)
        {
            byte0 = 2;
        }
        if(l == 5)
        {
            byte0 = 3;
        }
        EntityBeams_Kaevator entitybeams = new EntityBeams_Kaevator(world, i, j, k, byte0, itemstack.getItemDamage());
        if(entitybeams.canStay())
        {
            if(!world.isRemote)
            {
                world.spawnEntityInWorld(entitybeams);
            }
            itemstack.stackSize--;
        }
        return true;
    }
}
