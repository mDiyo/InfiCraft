package mDiyo.inficraft.infitools.hybrids;

import mDiyo.inficraft.infitools.library.InfiMaterialEnum;
import mDiyo.inficraft.infitools.library.InfiToolCore;
import mDiyo.inficraft.infitools.library.InfiToolPowers;
import net.minecraft.src.Block;
import net.minecraft.src.EntityPlayer;
import net.minecraft.src.ItemStack;
import net.minecraft.src.Material;
import net.minecraft.src.World;

public class InfiToolIceAxe extends InfiToolCore
{
    private static Material materialEffectiveAgainst[];

    public InfiToolIceAxe(int itemID, InfiMaterialEnum head, InfiMaterialEnum handle, String internalName)
    {
    	super(itemID, 1, head, handle, internalName);
    }
    
    @Override
    public boolean onBlockStartBreak(ItemStack itemstack, int x, int y, int z, EntityPlayer entityplayer)
    {
    	World world = entityplayer.worldObj;
        if (world.isRemote)
        {
            return false;
        }
        int bID = world.getBlockId(x, y, z);
        if (bID == Block.ice.blockID)
        {
        	InfiToolPowers.spawnItem(x, y, z, Block.ice.blockID, 1, 0, world);
        	world.playAuxSFX(2001, x, y, z, bID + (0 << 12));
            world.setBlockWithNotify(x, y, z, 0);
            onBlockDestroyed(itemstack, bID, x, y, z, entityplayer);
            return true;
        }
        else
        {
        	return super.onBlockStartBreak(itemstack, x, y, z, entityplayer);
        }
    }

    public boolean canHarvestBlock(Block block)
    {
        if (block == Block.obsidian)
        {
            return toolHarvestLevel >= 3;
        }
        if (block == Block.blockDiamond || block == Block.oreDiamond)
        {
            return toolHarvestLevel >= 2;
        }
        if (block == Block.blockGold || block == Block.oreGold)
        {
            return toolHarvestLevel >= 2;
        }
        if (block == Block.blockSteel || block == Block.oreIron)
        {
            return toolHarvestLevel >= 1;
        }
        if (block == Block.blockLapis || block == Block.oreLapis)
        {
            return toolHarvestLevel >= 1;
        }
        if (block == Block.oreRedstone || block == Block.oreRedstoneGlowing)
        {
            return toolHarvestLevel >= 2;
        }
        if (block.blockMaterial == Material.rock)
        {
            return true;
        }
        else
        {
            return block.blockMaterial == Material.iron;
        }
    }

    public String getTextureFile()
    {
        return "/infihybrids/iceaxes.png";
    }
    
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

    static
    {
        materialEffectiveAgainst = (new Material[]
        {
            Material.rock, Material.iron, Material.ice, Material.glass, Material.piston
        });
    }

	@Override
	public String getInvName() 
	{
		return "Ice Axe";
	}
}
