package net.minecraft.src.orizondim.blocks;
import net.minecraft.src.forge.*;
import net.minecraft.src.*;

public class OrizonLogsItem extends ItemBlock
{
    public OrizonLogsItem(int id)
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
        "OakLog", "PineLog", "BirchLog", "JungleLog", "OakPlanks", "PinePlanks", "BirchPlanks", "JunglePlanks"
    };

    public String getItemNameIS(ItemStack itemstack)
    {
        return (new StringBuilder()).append("orizon").append(blockType[itemstack.getItemDamage()]).toString();
    }
}
