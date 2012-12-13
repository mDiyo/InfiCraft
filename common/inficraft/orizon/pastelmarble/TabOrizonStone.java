package inficraft.orizon.pastelmarble;

import cpw.mods.fml.common.Side;
import cpw.mods.fml.common.asm.SideOnly;
import net.minecraft.src.Block;
import net.minecraft.src.CreativeTabs;

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
