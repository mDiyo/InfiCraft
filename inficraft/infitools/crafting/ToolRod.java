package inficraft.infitools.crafting;

import cpw.mods.fml.common.Side;
import cpw.mods.fml.common.asm.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;

public class ToolRod extends CraftingItem
{

	public ToolRod(int id)
	{
		super(id);
		this.setHasSubtypes(true);
		this.setMaxDamage(0);
		this.setCreativeTab(CreativeTabs.tabMaterials);
	}

	@SideOnly(Side.CLIENT)
	public int getIconFromDamage(int meta)
	{
		return meta;
	}

	public String getItemNameIS(ItemStack stack)
	{
		int var2 = MathHelper.clamp_int(stack.getItemDamage(), 0, 15);
		return super.getItemName() + "." + rodNames[var2];
	}

	public static final String[] rodNames = new String[] { 
		"", "stone", "iron", "flint", "cactus", "", "obsidian", "netherrack", "slime", "paper", "cobalt", "ardite", "manyullyn"		
	};
}
