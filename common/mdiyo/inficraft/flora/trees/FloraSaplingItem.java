package mdiyo.inficraft.flora.trees;

import net.minecraft.src.ItemBlock;

public class FloraSaplingItem extends ItemBlock
{
    public FloraSaplingItem(int i)
    {
        super(i);
        setMaxDamage(0);
        setHasSubtypes(true);
    }
    
    //TODO: Add names to these saplings

    @Override
    public int getMetadata(int md)
    {
        return md;
    }

    public int getIconFromDamage(int i)
    {
        return FloraTrees.floraSapling.getBlockTextureFromSideAndMetadata(0, i);
    }
}
