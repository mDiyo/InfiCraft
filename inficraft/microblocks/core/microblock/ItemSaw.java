package inficraft.microblocks.core.microblock;

import inficraft.microblocks.core.api.porting.SidedProxy;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemSaw extends Item {

	protected ItemSaw(int i) {
		super(i);
		iconIndex = 0;
		maxStackSize = 1;
		setItemName("inficraft.microblocks.core.saw");
		SidedProxy.instance.addLocalization("item.inficraft.microblocks.core.saw.name", "Handsaw");
		setCreativeTab(CreativeTabs.tabTools);
	}

	@Override
	public String getTextureFile() {
		return "/infitextures/micro.png";
	}
	
	@Override
	public boolean hasContainerItem() {
		return true;
	}
	
	@Override
	public Item getContainerItem() {
		return this;
	}

	@Override
	public boolean doesContainerItemLeaveCraftingGrid(ItemStack is) {
		return false;
	}
	
}
