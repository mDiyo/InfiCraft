package florasoma.common;

import net.minecraft.creativetab.CreativeTabs;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class FloraSomaTab extends CreativeTabs
{
	public static FloraSomaTab tab = new FloraSomaTab();
	static boolean hasInit;
	static int icon;
	
	public FloraSomaTab()
	{
		super("floraSomaTab");
		LanguageRegistry.instance().addStringLocalization("itemGroup.floraSomaTab", "Flora & Soma");
	}
	
	public static void init(int index)
	{
		if (!hasInit)
		{
			hasInit = true;
			icon = index;
		}
	}
	
	public int getTabIconItemIndex()
    {
        return icon;
    }
}
