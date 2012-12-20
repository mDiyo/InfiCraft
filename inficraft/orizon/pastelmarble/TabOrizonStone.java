package inficraft.orizon.pastelmarble;

import net.minecraft.creativetab.CreativeTabs;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class TabOrizonStone extends CreativeTabs
{

	public TabOrizonStone(String label) {
		super(label);
	}
	
	@SideOnly(Side.CLIENT)
    public int getTabIconItemIndex()
    {
        return PastelMarble.instance.marble.blockID;
    }

}
