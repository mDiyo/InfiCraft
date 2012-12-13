package inficraft.infiblocks.glass;

import net.minecraft.src.*;

public class InfiGlassMagicSlabItem extends ItemBlock
{
	public static final String blockType[] =
	    {
	        "clear", "soul", "clearSoul"
	    };

    public InfiGlassMagicSlabItem(int i)
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
        return (new StringBuilder()).append(blockType[itemstack.getItemDamage()]).append("GlassMagicSlab").toString();
    }
}
