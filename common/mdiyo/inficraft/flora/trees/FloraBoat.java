package mDiyo.inficraft.flora.trees;
import java.util.List;

import net.minecraft.src.AxisAlignedBB;
import net.minecraft.src.Block;
import net.minecraft.src.Entity;
import net.minecraft.src.EntityPlayer;
import net.minecraft.src.EnumMovingObjectType;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;
import net.minecraft.src.MathHelper;
import net.minecraft.src.MovingObjectPosition;
import net.minecraft.src.Vec3;
import net.minecraft.src.World;

public class FloraBoat extends Item
{
    public FloraBoat(int i)
    {
        super(i);
        //maxStackSize = 1;
    }
    
    public int getMetadata(int md)
    {
        return md;
    }
    
    public String getItemNameIS(ItemStack itemstack)
    {
        return (new StringBuilder()).append(itemType[itemstack.getItemDamage()]).append("Boat").toString();
    }
    
    public static final String itemType[] =
    {
        "redwood", "blood", "white", "eucalyptus"
    };
    
    public int getIconFromDamage(int md)
    {
        return iconIndex + md;
    }
    
    public String getTextureFile()
    {
        return "/floratex/infifood.png";
    }
}
