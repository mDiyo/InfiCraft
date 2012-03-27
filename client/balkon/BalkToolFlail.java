package net.minecraft.src.balkon;

import net.minecraft.src.forge.ITextureProvider;
import java.util.Random;
import net.minecraft.src.*;

public class BalkToolFlail extends InfiWeaponBase
	implements ITextureProvider
{
	private int weaponDamage;
    private static Material materialEffectiveAgainst[];
    private static Random random = new Random();
    private BalkFlailEntity ball;
    private boolean flailThrown;
    int dur;

    public BalkToolFlail(int i, int j, int k, int l, int i1)
    {
        super(i, 2, 3, j, 15F, k, true, materialEffectiveAgainst, l, i1);
        weaponDamage = 4 + k * 2;
        dur = j;
    }

    public boolean shouldRotateAroundWhenRendering()
    {
        return true;
    }

    public void onUpdate(ItemStack itemstack, World world, Entity entity, int i, boolean flag)
    {
        if (!(entity instanceof EntityPlayer))
        {
            return;
        }
        ItemStack itemstack1 = ((EntityPlayer)entity).getCurrentEquippedItem();
        if (itemstack1 == null || itemstack1.getItem().shiftedIndex != shiftedIndex)
        {
            if (world.isRemote)
            {
                setThrown(false);
            }
            else if (ball != null)
            {
                ball.pickUpByOwner();
            }
        }
    }

    public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer entityplayer)
    {
        entityplayer.swingItem();
        if (ball != null)
        {
            ball.pickUpByOwner();
        }
        if (!flailThrown)
        {
            itemstack.damageItem(1, entityplayer);
            if (itemstack.stackSize > 0)
            {
                throwBall(itemstack, world, entityplayer);
            }
        }
        return itemstack;
    }

    public void throwBall(ItemStack itemstack, World world, EntityPlayer entityplayer)
    {
        world.playSoundAtEntity(entityplayer, "random.bow", 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));
        if (!world.isRemote)
        {
            ball = new BalkFlailEntity(world, entityplayer, weaponDamage, dur, this, itemstack);
            world.spawnEntityInWorld(ball);
        }
        setThrown(true);
    }

    public void setThrown(boolean flag)
    {
        //setIconIndex(flag ? iconIndexThrown : iconIndexHere);
        flailThrown = flag;
    }

    public boolean getThrown()
    {
        return flailThrown;
    }
    
    public String getTextureFile()
    {
        if (flailThrown)
        {
            return "/infibalkon/balkflailsthrown.png";
        }
        else
        {
            return "/infibalkon/balkflails.png";
        }
    }

    public int getItemEnchantability()
    {
        return mod_InfiTools.enchantBase(type1);
    }

    static
    {
        materialEffectiveAgainst = (new Material[]
        {
            Material.glass
        });
    }
}