package florasoma.trees.blocks;

import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class FloraLeavesItem extends ItemBlock
{
    public static final String blockType[] =
    {
        "redwood", "eucalyptus", "bush", "", "", "", "", "", "", "", "", "", "", "", "", ""
    };

	//TODO: Have names tied to this item
    public FloraLeavesItem(int i)
    {
        super(i);
        setMaxDamage(0);
        setHasSubtypes(true);
        //MinecraftForgeClient.registerCustomItemRenderer(mod_FloraSoma.floraLeaves.blockID, this);
    }

    @Override
    public int getMetadata(int md)
    {
        return md;
    }

    public String getItemNameIS(ItemStack itemstack)
    {
        return (new StringBuilder()).append(blockType[itemstack.getItemDamage()]).append("FloraLeaves").toString();
    }
}
