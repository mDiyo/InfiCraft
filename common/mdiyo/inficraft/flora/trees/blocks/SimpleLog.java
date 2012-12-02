package mDiyo.inficraft.flora.trees.blocks;

import net.minecraft.src.World;

public class SimpleLog extends Planks
{
	public SimpleLog(int id, int texPos, String tex) 
	{
		super(id, texPos, tex);
	}

	@Override
    public boolean canSustainLeaves(World world, int x, int y, int z)
    {
        return true;
    }

    @Override
    public boolean isWood(World world, int x, int y, int z)
    {
        return true;
    }
}
