package inficraft.infitools.crafting;

import inficraft.infitools.InfiTools;
import net.minecraft.item.Item;

public class CraftingItem extends Item
{

	public CraftingItem(int id)
	{
		super(id);
	}

	/* Texture */
	@Override
	public String getTextureFile()
	{
		return InfiTools.craftingTexture;
	}

}
