package inficraft.infitools;

import net.minecraft.creativetab.CreativeTabs;
import cpw.mods.fml.common.Side;
import cpw.mods.fml.common.asm.SideOnly;

public class TabInfiTools extends CreativeTabs
{

	public TabInfiTools(String label) {
		super(label);
	}
	
	@SideOnly(Side.CLIENT)
    public int getTabIconItemIndex()
    {
        return InfiTools.instance.theOneTool.shiftedIndex;
    }

}