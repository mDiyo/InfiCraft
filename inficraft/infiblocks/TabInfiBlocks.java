package inficraft.infiblocks;

import net.minecraft.creativetab.CreativeTabs;
import cpw.mods.fml.common.Side;
import cpw.mods.fml.common.asm.SideOnly;

public class TabInfiBlocks extends CreativeTabs
{

	public TabInfiBlocks(String label) {
		super(label);
		// TODO Auto-generated constructor stub
	}
	
	@SideOnly(Side.CLIENT)
    public int getTabIconItemIndex()
    {
        return InfiBlocks.getContentInstance().furnace.blockID;
    }

}
