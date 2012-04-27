package net.minecraft.src.infirange;
import net.minecraft.src.*;
import net.minecraft.src.forge.*;
import java.util.*;

public class InfiToolSpearOld extends Item
    implements ITextureProvider
{

    protected InfiToolSpearOld(int i, EnumToolMaterial enumtoolmaterial)
    {
        super(i);
        maxStackSize = 1;
        setMaxDamage(enumtoolmaterial.getMaxUses());
        damageVsEntity = 2 + enumtoolmaterial.getDamageVsEntity();
        fireProof = enumtoolmaterial != EnumToolMaterial.WOOD;
    }

    public static boolean IsHoldingSpear(EntityPlayer entityplayer)
    {
        ItemStack itemstack = entityplayer.inventory.getCurrentItem();
        if(itemstack == null)
        {
            return false;
        }
        Item item = itemstack.getItem();
        if(item == null)
        {
            return false;
        }
        return item instanceof InfiToolSpearOld;
    }

    public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer entityplayer)
    {
        SpearEntity spear = makeSpearEntity(itemstack, world, entityplayer);
        if(!world.isRemote)
        {
            world.spawnEntityInWorld(spear);
        }
        return new ItemStack(this, 0);
    }

    public SpearEntity makeSpearEntity(ItemStack itemstack, World world, EntityPlayer entityplayer)
    {
        //entityplayer.worldObj.playSoundAtEntity(entityplayer, "rangecraft.spearThrow", 3F, (E22_Utils.r.nextFloat() - E22_Utils.r.nextFloat()) * 0.2F + 1.0F);
        SpearEntity rc_entityspear = new SpearEntity(world, entityplayer, 0.75F, 0.7F);
        rc_entityspear.returnStackSlot = entityplayer.inventory.currentItem;
        rc_entityspear.texID = iconIndex;
        rc_entityspear.returnStack = itemstack;
        rc_entityspear.damageDealt = damageVsEntity;
        //rc_entityspear.isImmuneToFire = fireProof;
        return rc_entityspear;
    }

    public int getDamageVsEntity(Entity entity)
    {
        return 0;
    }

    public int getDamageVsEntityWithRange(Entity entity, double d)
    {
        //mod_2by2.print((new StringBuilder()).append("Spear Range ... ").append(d).toString());
        if(d < 2.5D)
        {
            return 1;
        } else
        {
            return damageVsEntity;
        }
    }

    public void attackTargetEntityWithCurrentItem(EntityPlayer entityplayer, Entity entity)
    {
        double d = entityplayer.getDistanceToEntity(entity);
        int i = getDamageVsEntityWithRange(entity, d);
        if(i > 0)
        {
            if(entityplayer.motionY < 0.0D)
            {
                i++;
            }
            entity.attackEntityFrom(DamageSource.causePlayerDamage(entityplayer), i);
            if(entity instanceof EntityLiving)
            {
                float f;
                if(d < 3D)
                {
                    f = i;
                } else
                {
                    f = 0.0F;
                }
                //mod_2by2.print((new StringBuilder()).append("Spear knockback ... ").append(f).toString());
                //E22_Utils.AttackEntityFrom(entityplayer, (EntityLiving)entity, i, f);
            } else
            {
                entity.attackEntityFrom(DamageSource.causePlayerDamage(entityplayer), i);
            }
            ItemStack itemstack = entityplayer.getCurrentEquippedItem();
            if(itemstack != null && (entity instanceof EntityLiving))
            {
                itemstack.hitEntity((EntityLiving)entity, entityplayer);
                if(itemstack.stackSize <= 0)
                {
                    //itemstack.func_1097_a(entityplayer);
                    entityplayer.destroyCurrentEquippedItem();
                }
            }
            if(entity instanceof EntityLiving)
            {
                if(entity.isEntityAlive())
                {
                    //entityplayer.alertWolves((EntityLiving)entity, true);
                }
                entityplayer.addStat(StatList.damageDealtStat, i);
            }
        }
    }

    public boolean isFull3D()
    {
        return true;
    }

    public String getTextureFile()
    {
        return "/RANGECRAFT/RC_items.png";
    }

    private int damageVsEntity;
    public boolean fireProof;
}
