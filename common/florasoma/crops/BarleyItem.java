package florasoma.crops;

import java.util.List;

import cpw.mods.fml.common.Side;
import cpw.mods.fml.common.asm.SideOnly;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;

public class BarleyItem extends Item
{
    public static final String blockType[] =
    {
        "item", "flour", "dough"
    };

    public BarleyItem(int i)
    {
        super(i);
        setHasSubtypes(true);
        setMaxDamage(0);
        setCreativeTab(CreativeTabs.tabFood);
    }

    public String getTextureFile()
    {
        return FloraCrops.seedTexture;
    }

    public int getMetadata(int i)
    {
        return i;
    }

    public int getIconFromDamage(int i)
    {
        return iconIndex + i;
    }

    public String getItemNameIS(ItemStack itemstack)
    {
        return (new StringBuilder()).append("item.").append(blockType[itemstack.getItemDamage()]).append("Barley").toString();
    }
    
    @SideOnly(Side.CLIENT)
    public void getSubItems(int par1, CreativeTabs par2CreativeTabs, List par3List)
    {
        for (int var4 = 0; var4 < 3; ++var4)
        {
            par3List.add(new ItemStack(par1, 1, var4));
        }
    }
}
