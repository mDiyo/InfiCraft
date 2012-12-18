package inficraft.infiblocks.blocks;

import inficraft.infiblocks.InfiBlocks;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class CarpetItem extends ItemBlock
{
    public static final String blockType[] =
    {
        "white", "orange", "magenta", "lightblue", "yellow", "lime", "pink", "gray", "lightgray", "cyan",
        "purple", "blue", "brown", "green", "red", "black"
    };

    public CarpetItem(int i)
    {
        super(i);
        setMaxDamage(0);
        setHasSubtypes(true);
    }

    public int getIconFromDamage(int i)
    {
        return InfiBlocks.getContentInstance().woolCarpet.getBlockTextureFromSideAndMetadata(2, CarpetBlock.getBlockFromDye(i));
    }

    public int getMetadata(int i)
    {
        return i;
    }

    public String getItemNameIS(ItemStack itemstack)
    {
        return (new StringBuilder()).append(blockType[itemstack.getItemDamage()]).append("Carpet").toString();
    }
}
