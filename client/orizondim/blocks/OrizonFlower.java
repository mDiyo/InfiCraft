package net.minecraft.src.orizondim.blocks;

import java.util.Random;

import net.minecraft.src.*;
import net.minecraft.src.forge.ITextureProvider;

public class OrizonFlower extends BlockFlower
	implements ITextureProvider
{
	public OrizonFlower(int par1, int par2, Material material)
    {
        super(par1, par2, material);
    }
	
    public OrizonFlower(int par1, int par2)
    {
        super(par1, par2, Material.plants);
    }
    
    protected boolean canThisPlantGrowOnThisBlockID(int par1)
    {
        return par1 == mod_Orizon.blueGrassID || par1 == mod_Orizon.blueDirtID || par1 == Block.tilledField.blockID;
    }
    
    @Override
	public String getTextureFile() 
	{
		return "/oretex/organics.png";
	}
}
