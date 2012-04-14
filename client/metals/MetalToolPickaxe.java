package net.minecraft.src.metals;

import net.minecraft.src.forge.ITextureProvider;
import java.util.Random;
import net.minecraft.src.*;

public class MetalToolPickaxe extends InfiToolCore
{
    private static Material materialEffectiveAgainst[];

    public MetalToolPickaxe(int itemID, InfiMaterialEnum head, InfiMaterialEnum handle, String internalName)
    {
    	super(itemID, 1, head, handle, materialEffectiveAgainst, internalName);
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
        return "/metaltex/pickaxes.png";
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
		return "Pickaxe";
	}
}
