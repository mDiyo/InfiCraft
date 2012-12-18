package inficraft.infitools.tools;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class Pickaxe extends HarvestTool
{

	public Pickaxe(int itemID)
	{
		super(itemID);
	}

	@Override
	protected Material[] getEffectiveMaterials()
	{
		return materials;
	}
	
	public boolean canHarvestBlock(Block block)
    {
		return true;
    }

	static Material[] materials = new Material[] { Material.rock, Material.iron, Material.ice, Material.glass, Material.piston };
}
