package net.minecraft.src.mechvent;

import net.minecraft.src.*;

public class CrusherItem extends ItemBlock
{
    public static final String blockType[] =
    {
        "crusher", "grinder"
    };

    public CrusherItem(int i)
    {
        super(i);
        setMaxDamage(0);
        setHasSubtypes(true);
    }

    @Override
    public int getMetadata(int md)
    {
        return md;
    }
    
    public String getItemNameIS(ItemStack itemstack)
    {
        return (new StringBuilder()).append(blockType[itemstack.getItemDamage()]).append("Prototype").toString();
    }
}
