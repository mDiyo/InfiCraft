package mDiyo.inficraft.infiblocks;

import cpw.mods.fml.common.Side;
import cpw.mods.fml.common.asm.SideOnly;
import net.minecraft.src.Block;
import net.minecraft.src.CreativeTabs;

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
