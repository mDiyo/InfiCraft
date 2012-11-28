package mDiyo.inficraft.orizon.slimepools;

import java.util.Random;

import net.minecraft.src.EntitySlime;
import net.minecraft.src.IBlockAccess;
import net.minecraft.src.Material;
import net.minecraft.src.World;

public class SlimeBlockStill extends LiquidBlockBase
{
    public SlimeBlockStill(int id, int tex, Material material)
    {
        super(id, material);
        enableStats = false;
        blockIndexInTexture = tex;
    }
    
    public boolean getEnableStats() {return false;}
    
    public void updateTick(World world, int x, int y, int z, Random rand)
    {
    	if (rand.nextInt(100) == 0) {
    		EntitySlime entityslime = new EntitySlime(world);
            entityslime.setPosition((double)x + 0.5D, (double)y + 1.5D, (double)z + 0.5D);
            world.spawnEntityInWorld(entityslime);
    	}
    }
    
    public String getTextureFile()
    {
        return OrizonSlime.texture;
    }    

    public boolean func_48204_b(IBlockAccess par1IBlockAccess, int par2, int par3, int par4)
    {
        return this.blockMaterial != Material.lava;
    }

    /**
     * Lets the block know when one of its neighbor changes. Doesn't know which neighbor changed (coordinates passed are
     * their own) Args: x, y, z, neighbor blockID
     */
    public void onNeighborBlockChange(World par1World, int par2, int par3, int par4, int par5)
    {
        super.onNeighborBlockChange(par1World, par2, par3, par4, par5);

        if (par1World.getBlockId(par2, par3, par4) == this.blockID)
        {
            this.setNotStationary(par1World, par2, par3, par4);
        }
    }

    /**
     * Changes the block ID to that of an updating fluid.
     */
    private void setNotStationary(World par1World, int par2, int par3, int par4)
    {
    	int var5 = par1World.getBlockMetadata(par2, par3, par4);
        par1World.editingBlocks = true;
        par1World.setBlockAndMetadata(par2, par3, par4, this.blockID - 1, var5);
        par1World.markBlockRangeForRenderUpdate(par2, par3, par4, par2, par3, par4);
        par1World.scheduleBlockUpdate(par2, par3, par4, this.blockID - 1, this.tickRate());
        par1World.editingBlocks = false;
    }
}
