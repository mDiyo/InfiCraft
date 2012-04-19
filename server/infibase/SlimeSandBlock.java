package net.minecraft.src.infibase;
import net.minecraft.src.*;
import net.minecraft.src.forge.ITextureProvider;

public class SlimeSandBlock extends Block
	implements ITextureProvider
{
    public SlimeSandBlock(int par1, int par2)
    {
        super(par1, par2, Material.sand);
        this.setBlockName("slimeSand");
        ModLoader.addName(this, "Slime Sand");
        blockIndexInTexture = 240;
        this.setHardness(1.0F);
        this.setStepSound(Block.soundSandFootstep);
    }

    /**
     * Returns a bounding box from the pool of bounding boxes (this means this box can change after the pool has been
     * cleared to be reused)
     */
    public AxisAlignedBB getCollisionBoundingBoxFromPool(World par1World, int par2, int par3, int par4)
    {
        float var5 = 0.125F;
        return AxisAlignedBB.getBoundingBoxFromPool((double)par2, (double)par3, (double)par4, (double)(par2 + 1), (double)((float)(par3 + 1) - var5), (double)(par4 + 1));
    }

    /**
     * Triggered whenever an entity collides with this block (enters into the block). Args: world, x, y, z, entity
     */
    public void onEntityCollidedWithBlock(World par1World, int x, int y, int z, Entity par5Entity)
    {
    	if (par1World.getBlockMetadata(x, y, z) == 0)
    	{
            par5Entity.motionX *= 0.4D;
            par5Entity.motionZ *= 0.4D;
    	}
    }
    
    @Override
	public String getTextureFile() {
		return "/infibase/items.png";
	}
}
