package net.minecraft.src.metals;

import net.minecraft.src.forge.ITextureProvider;
import java.util.Random;
import net.minecraft.src.*;

public class MetalToolIceAxe extends InfiToolCore
{
    private static Material materialEffectiveAgainst[];

    public MetalToolIceAxe(int itemID, InfiMaterialEnum head, InfiMaterialEnum handle, String internalName)
    {
    	super(itemID, 1, head, handle, materialEffectiveAgainst, internalName);
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
        	InfiToolPowers.spawnItemBlock(x, y, z, Block.ice.blockID, 0, world);
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
        if (InfiGather.isDeclared(block))
        {
            return InfiGather.getBlockLevel(block) <= toolHarvestLevel;
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
        return "/metaltex/iceaxes.png";
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
