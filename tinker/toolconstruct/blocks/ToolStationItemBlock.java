package tinker.toolconstruct.blocks;

import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ToolStationItemBlock extends ItemBlock
{
    public static final String blockType[] =
    {
        "Crafter", "Parts", "Parts", "Parts", "Parts"
    };

    public ToolStationItemBlock(int id)
    {
        super(id);
        setMaxDamage(0);
        setHasSubtypes(true);
    }

    public int getMetadata(int meta)
    {
        return meta;
    }

    public String getItemNameIS(ItemStack itemstack)
    {
        return (new StringBuilder()).append("ToolStation.").append(blockType[itemstack.getItemDamage()]).toString();
    }
}
