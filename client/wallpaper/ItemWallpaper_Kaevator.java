// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

package net.minecraft.src.wallpaper;

import net.minecraft.src.EntityPlayer;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;
import net.minecraft.src.World;


// Referenced classes of package net.minecraft.src:
//            Item, EntityPainting, World, ItemStack, 
//            EntityPlayer

public class ItemWallpaper_Kaevator extends Item
{

    public ItemWallpaper_Kaevator(int i)
    {
        super(i);
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
        EntityWallpaper_Kaevator entitywallpaper = new EntityWallpaper_Kaevator(world, i, j, k, byte0);
        if(entitywallpaper.canStay())
        {
            if(!world.isRemote)
            {
                world.spawnEntityInWorld(entitywallpaper);
            }
            itemstack.stackSize--;
        }
        return true;
    }
}
