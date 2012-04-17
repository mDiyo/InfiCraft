package net.minecraft.src.infihybrids;

import net.minecraft.src.forge.ITextureProvider;
import java.util.Random;
import net.minecraft.src.*;

public class InfiToolMattock extends InfiHoeCore
{
    private static Material materialEffectiveAgainst[];
    private static Random random = new Random();

    public InfiToolMattock(int itemID, InfiMaterialEnum head, InfiMaterialEnum handle, String internalName)
    {
    	super(itemID, 1, head, handle, internalName);
    }

    public String getTextureFile()
    {
        return "/infihybrids/mattocks.png";
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
        		InfiToolPowers.searchForBlock(world, Block.wood.blockID, 4, x, y, z) && random.nextInt(100) + 1 <= 20)
        {
        	InfiToolPowers.spawnItem(x, y, z, mod_InfiBase.treeRoot.shiftedIndex, world);
        }
		return super.onBlockDestroyed(itemstack, bID, x, y, z, entityliving);
	}
	
	@Override
	public float getStrVsBlock(ItemStack itemstack, Block block, int meta)
	{
		for (int i = 0; i < materialEffectiveAgainst.length; i++)
		{
			if (materialEffectiveAgainst[i] == block.blockMaterial )
			{
				if (this.headShoddy || this.handleShoddy)
				{
					return efficiencyOnProperMaterial + (float)itemstack.getItemDamage() / 100F;
				}
				else
				{
					return efficiencyOnProperMaterial;
				}
			}
		}
		return 1.0F;
	}
}
