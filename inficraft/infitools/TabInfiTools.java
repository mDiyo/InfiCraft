package inficraft.infitools;

import net.minecraft.creativetab.CreativeTabs;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class TabInfiTools extends CreativeTabs
{
	int index;
	public TabInfiTools(String label, int i) 
	{
		super(label);
		index = i;
	}
	
	@SideOnly(Side.CLIENT)
    public int getTabIconItemIndex()
    {
        return index;
    }

}