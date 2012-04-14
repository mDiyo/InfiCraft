package net.minecraft.src.metals;

import net.minecraft.src.forge.ITextureProvider;
import java.util.Random;
import net.minecraft.src.*;

public class MetalToolMattock extends InfiHoeCore
{
    private static Material materialEffectiveAgainst[];
    private static Random random = new Random();

    public MetalToolMattock(int itemID, InfiMaterialEnum head, InfiMaterialEnum handle, String internalName)
    {
    	super(itemID, 1, head, handle, materialEffectiveAgainst, internalName);
    }

    public String getTextureFile()
    {
        return "/metaltex/mattocks.png";
    }

    static
    {
        materialEffectiveAgainst = (new Material[]
        {
        		Material.wood, Material.circuits, Material.cactus, Material.grass, Material.ground, Material.sand, Material.clay
        });
    }

	@Override
	public String getInvName() 
	{
		return "Mattock";
	}
	
	@Override
	public boolean onBlockDestroyed(ItemStack itemstack, int bID, int x, int y, int z, EntityLiving entityliving)
	{
		World world = entityliving.worldObj;
        if ((bID == Block.dirt.blockID || bID == Block.grass.blockID) && 
        		InfiHybridPowers.searchForBlock(world, Block.wood.blockID, 4, x, y, z) && random.nextInt(100) + 1 <= 20)
        {
            InfiHybridPowers.spawnItem(x, y, z, world, mod_InfiHybrids.treeRoot.shiftedIndex, 1);
        }
		return super.onBlockDestroyed(itemstack, bID, x, y, z, entityliving);
	}
	
	@Override
	public float getStrVsBlock(ItemStack itemstack, Block block, int md)
	{
		for (int i = 0; i < materialEffectiveAgainst.length; i++)
		{
			if (materialEffectiveAgainst[i] == block.blockMaterial)
			{
				if (headMaterial.getShoddy() || handleMaterial.getShoddy())
				{
					return (efficiencyOnProperMaterial + (float)itemstack.getItemDamage() / 100F) * 0.8F;
				}
				else
				{
					return efficiencyOnProperMaterial * 0.8F;
				}
			}
		}

		return 1.0F;
	}
}
