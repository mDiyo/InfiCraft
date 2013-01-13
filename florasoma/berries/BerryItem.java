package florasoma.berries;

import java.util.List;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import florasoma.common.FloraSomaTab;

public class BerryItem extends ItemFood
{
    public BerryItem(int i, int j)
    {
        super(i, j, 0.1F, false);
        setHasSubtypes(true);
        setMaxDamage(0);
        iconIndex = 16;
        this.setCreativeTab(FloraSomaTab.tab);
    }

    @Override
    public int getMaxItemUseDuration(ItemStack itemstack)
    {
        return 12;
    }

    @Override
    public int getIconFromDamage(int meta)
    {
        return iconIndex + meta;
    }

    /* Name override */
    @Override
    public String getItemNameIS(ItemStack itemstack)
    {
        return (new StringBuilder()).append("item.").append(blockType[itemstack.getItemDamage()]).append("berry").toString();
    }
    public static final String blockType[] =
    {
        "rasp", "blue", "black", "geo"
    };

    @Override
    public String getTextureFile()
    {
        return FloraBerries.seedTexture;
    }
    
    /**
     * returns a list of items with the same ID, but different meta (eg: dye returns 16 items)
     */
    @SideOnly(Side.CLIENT)
    @Override
    public void getSubItems(int par1, CreativeTabs par2CreativeTabs, List par3List)
    {
        for (int var4 = 0; var4 < 3; ++var4)
        {
            par3List.add(new ItemStack(par1, 1, var4));
        }
    }
}
