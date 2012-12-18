package inficraft.infiblocks.magicslabs;

import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class MagicSlabStoneItem extends ItemBlock
{
    public static final String blockType[] =
    {
        "stone", "slabstone", "cobblestone", "stonebrick", "crackedstonebrick", "mossystonebrick",
        "brick", "mossy", "obsidian", "netherrack", "sandstone", "iron", "gold", "diamond",
        "endstone", "netherBrick"
    };

    public MagicSlabStoneItem(int i)
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
        return (new StringBuilder()).append(blockType[itemstack.getItemDamage()]).append("MagicSlab").toString();
    }
}
