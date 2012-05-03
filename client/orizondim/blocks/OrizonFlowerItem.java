package net.minecraft.src.orizondim.blocks;
import net.minecraft.src.forge.*;
import net.minecraft.src.*;

public class OrizonFlowerItem extends ItemBlock
{
    public OrizonFlowerItem(int id)
    {
        super(id);
        setMaxDamage(0);
        setHasSubtypes(true);
    }

    @Override
    public int getMetadata(int md)
    {
        return md;
    }
    
    public static final String blockType[] =
    {
        "Rose", "Dandelion", "Nightbloom", "Daisy"
    };

    public String getItemNameIS(ItemStack itemstack)
    {
        return (new StringBuilder()).append("orizon").append(blockType[itemstack.getItemDamage()]).toString();
    }
}
