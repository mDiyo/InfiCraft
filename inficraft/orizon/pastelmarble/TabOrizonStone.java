package inficraft.orizon.pastelmarble;

import net.minecraft.creativetab.CreativeTabs;
import cpw.mods.fml.common.Side;
import cpw.mods.fml.common.asm.SideOnly;

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
