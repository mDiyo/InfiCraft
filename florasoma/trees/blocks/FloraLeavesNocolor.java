package florasoma.trees.blocks;

import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.ForgeDirection;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class FloraLeavesNocolor extends FloraLeaves
{

	public FloraLeavesNocolor(int id, int tex) 
	{
		super(id, tex);
	}
	
	@SideOnly(Side.CLIENT)
    public int getBlockColor()
    {
        return 16777215;
    }

    @SideOnly(Side.CLIENT)

    /**
     * Returns the color this block should be rendered. Used by leaves.
     */
    public int getRenderColor(int par1)
    {
        return 16777215;
    }

    @SideOnly(Side.CLIENT)

    /**
     * Returns a integer with hex for 0xrrggbb with this color multiplied against the blocks color. Note only called
     * when first determining what to render.
     */
    public int colorMultiplier(IBlockAccess par1IBlockAccess, int par2, int par3, int par4)
    {
        return 16777215;
    }

    public int getFlammability(IBlockAccess world, int x, int y, int z, int metadata, ForgeDirection face)
    {
        return metadata % 4 == 0 ? blockFlammability[blockID] : 0;
    }

    public int getFireSpreadSpeed(World world, int x, int y, int z, int metadata, ForgeDirection face)
    {
        return metadata % 4 == 0 ? blockFireSpreadSpeed[blockID] : 0;
    }
    
    public int damageDropped(int par1)
    {
        return (par1 & 3)+3;
    }
}
