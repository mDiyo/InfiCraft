package inficraft.infitools.crafting;

import cpw.mods.fml.common.Side;
import cpw.mods.fml.common.asm.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;

public class Pattern extends CraftingItem
{

	public Pattern(int id, int tex)
	{
		super(id);
		this.setHasSubtypes(true);
		this.setMaxDamage(0);
		this.setCreativeTab(CreativeTabs.tabMaterials);
		this.iconIndex = tex;
	}

	@SideOnly(Side.CLIENT)
	public int getIconFromDamage(int meta)
	{
		return this.iconIndex + meta;
	}

	public String getItemNameIS(ItemStack stack)
	{
		int var2 = MathHelper.clamp_int(stack.getItemDamage(), 0, 11);
		return super.getItemName() + "." + patternName[var2];
	}

	public static final String[] patternName = new String[] { 
		"blank", "rod", "guard", "blade", "pickaxe", "axe", "shovel", "iceaxe", "machete", "hammer", "mattock", "scythe"
	};
}
