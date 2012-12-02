package mDiyo.inficraft.infitools.core.buckets;
import mDiyo.inficraft.infitools.core.InfiCore;
import mDiyo.inficraft.infitools.core.Items;
import net.minecraft.src.EntityPlayer;
import net.minecraft.src.EnumAction;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;
import net.minecraft.src.World;

public class InfiBucketGoldMilk extends Item
{
    public InfiBucketGoldMilk(int i)
    {
        super(i);
        setMaxStackSize(1);
        this.setItemName("bucketGold");
    }

    public ItemStack onFoodEaten(ItemStack itemstack, World world, EntityPlayer entityplayer)
    {
        itemstack.stackSize--;
        if (!world.isRemote)
        {
            entityplayer.clearActivePotions();
        }
        if (itemstack.stackSize <= 0)
        {
            return new ItemStack(Items.goldBucketEmpty);
        }
        else
        {
            return itemstack;
        }
    }

    public int getMaxItemUseDuration(ItemStack itemstack)
    {
        return 32;
    }

    public EnumAction getItemUseAction(ItemStack itemstack)
    {
        return EnumAction.drink;
    }

    public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer entityplayer)
    {
        entityplayer.setItemInUse(itemstack, getMaxItemUseDuration(itemstack));
        return itemstack;
    }
    
    public String getTextureFile()
    {
        return InfiCore.itemTexture;
    }
}
