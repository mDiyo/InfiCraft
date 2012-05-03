package net.minecraft.src.orizondim.blocks;
import net.minecraft.src.forge.*;
import net.minecraft.src.*;

public class BlueDirtItem extends ItemBlock
{
    public BlueDirtItem(int id)
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
        "Dirt", "Sand", "Sand"
    };

    public String getItemNameIS(ItemStack itemstack)
    {
        return (new StringBuilder()).append("orizon").append(blockType[itemstack.getItemDamage()]).toString();
    }
}
