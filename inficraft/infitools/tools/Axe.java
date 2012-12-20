package inficraft.infitools.tools;

import inficraft.infitools.AbilityHelper;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityLiving;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class Axe extends HarvestTool
{

	public Axe(int itemID, String tex)
	{
		super(itemID, 3, tex);
	}

	@Override
	protected Material[] getEffectiveMaterials()
	{
		return materials;
	}

	@Override
	protected String getHarvestType()
	{
		return "axe";
	}
	
	@Override
	public boolean onBlockDestroyed(ItemStack itemstack, World world, int bID, int x, int y, int z, EntityLiving player)
	{
		Block block = Block.blocksList[bID];
		if (block != null && block.blockMaterial == Material.leaves)
			return false;
		
		return AbilityHelper.onBlockDestroyed(itemstack, world, bID, x, y, z, player, random);
	}
	
	static Material[] materials = { Material.wood, Material.circuits, Material.cactus, Material.pumpkin, Material.leaves };

}
