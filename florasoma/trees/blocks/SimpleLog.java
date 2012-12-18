package florasoma.trees.blocks;

import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.ForgeDirection;

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
    
    public int getFlammability(IBlockAccess world, int x, int y, int z, int metadata, ForgeDirection face)
    {
        return blockFlammability[blockID];
    }

    public int getFireSpreadSpeed(World world, int x, int y, int z, int metadata, ForgeDirection face)
    {
        return blockFireSpreadSpeed[blockID];
    }
}
