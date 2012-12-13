package inficraft.infitools.library;

import inficraft.infitools.base.Swords;
import cpw.mods.fml.common.Side;
import cpw.mods.fml.common.asm.SideOnly;
import net.minecraft.src.Block;
import net.minecraft.src.CreativeTabs;

public class TabInfiTools extends CreativeTabs
{

	public TabInfiTools(String label) {
		super(label);
		// TODO Auto-generated constructor stub
	}
	
	@SideOnly(Side.CLIENT)
    public int getTabIconItemIndex()
    {
        return Swords.mossyMossySword.shiftedIndex;
    }

}
