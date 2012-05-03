package net.minecraft.src.orizondim.blocks;
import net.minecraft.src.forge.*;
import net.minecraft.src.*;

public class OrizonLeavesItem extends ItemBlock
{
    public OrizonLeavesItem(int id)
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
        "OakLeaves", "PineLeaves", "BirchLeaves", "JungleLeaves"
    };

    public String getItemNameIS(ItemStack itemstack)
    {
        return (new StringBuilder()).append("orizon").append(blockType[itemstack.getItemDamage()]).toString();
    }
}
