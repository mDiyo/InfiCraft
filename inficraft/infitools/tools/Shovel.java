package inficraft.infitools.tools;

import net.minecraft.block.material.Material;

public class Shovel extends HarvestTool
{

	public Shovel(int itemID, int baseDamage, String tex)
	{
		super(itemID, baseDamage, tex);
	}

	@Override
	protected Material[] getEffectiveMaterials()
	{
		return materials;
	}

	@Override
	protected String getHarvestType()
	{
		return "shovel";
	}
	
	static Material[] materials = { Material.grass, Material.ground, Material.sand, Material.snow, Material.craftedSnow, Material.clay };

}
