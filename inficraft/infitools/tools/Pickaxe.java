package inficraft.infitools.tools;

import inficraft.infitools.ToolItems;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class Pickaxe extends HarvestTool
{

	public Pickaxe(int itemID, String tex)
	{
		super(itemID, 1, tex);
	}
	
	@Override
	protected String getHarvestType()
	{
		return "pickaxe";
	}

	@Override
	protected Material[] getEffectiveMaterials()
	{
		return materials;
	}

	static Material[] materials = new Material[] { Material.rock, Material.iron, Material.ice, Material.glass, Material.piston };

	
}
