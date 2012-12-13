package florasoma.trees.blocks;

import florasoma.trees.FloraTrees;

import java.util.ArrayList;
import java.util.Random;

import net.minecraft.src.Block;
import net.minecraft.src.BlockLeaves;
import net.minecraft.src.BlockLeavesBase;
import net.minecraft.src.ColorizerFoliage;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Entity;
import net.minecraft.src.EntityPlayer;
import net.minecraft.src.IBlockAccess;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;
import net.minecraft.src.Material;
import net.minecraft.src.StatList;
import net.minecraft.src.World;

public class FloraLeaves extends BlockLeaves
{
    private int baseIndexInPNG;
    int[] adjacentTreeBlocks;

    public FloraLeaves(int id, int tex)
    {
        super(id, tex);
        this.baseIndexInPNG = tex;
        this.setTickRandomly(true);
        this.setHardness(0.2F);
        this.setLightOpacity(1);
        this.setStepSound(Block.soundGrassFootstep);
        this.setBlockName("floraLeaves");
        this.setRequiresSelfNotify();
        setCreativeTab(CreativeTabs.tabDecorations);
		setBurnProperties(this.blockID, 30, 60);
    }

    public int getBlockColor()
    {
        double var1 = 0.5D;
        double var3 = 1.0D;
        return ColorizerFoliage.getFoliageColor(var1, var3);
    }

    /**
     * How many world ticks before ticking
     */
    public int tickRate()
    {
        return 20;
    }

    /**
     * Returns the color this block should be rendered. Used by leaves.
     */
    public int getRenderColor(int var1)
    {
        return ColorizerFoliage.getFoliageColorBasic();
    }

    /**
     * Returns a integer with hex for 0xrrggbb with this color multiplied against the blocks color. Note only called
     * when first determining what to render.
     */
    public int colorMultiplier(IBlockAccess var1, int x, int y, int z)
    {
        int meta = var1.getBlockMetadata(x, y, z);

        /*if (meta == 1)
        {
            return 16777215;
        }
        else if (meta == 2)
        {
            return 7579477;
        }
        else
        {*/
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;

            for (int var9 = -1; var9 <= 1; ++var9)
            {
                for (int var10 = -1; var10 <= 1; ++var10)
                {
                    int var11 = var1.getBiomeGenForCoords(x + var10, z + var9).getBiomeFoliageColor();
                    var6 += (var11 & 16711680) >> 16;
                    var7 += (var11 & 65280) >> 8;
                    var8 += var11 & 255;
                }
            }

            return (var6 / 9 & 255) << 16 | (var7 / 9 & 255) << 8 | var8 / 9 & 255;
        //}
    }

    /**
     * Returns the quantity of items to drop on block destruction.
     */
    @Override
    public int quantityDropped(Random var1)
    {
        return var1.nextInt(20) == 0 ? 1 : 0;
    }

    /**
     * Returns the ID of the items to drop on destruction.
     */
    @Override
    public int idDropped(int var1, Random var2, int var3)
    {
        return FloraTrees.floraSapling.blockID;
    }

    public int getBlockTextureFromSideAndMetadata(int side, int metadata)
    {
        //return (var2) == 1 ? this.blockIndexInTexture + 1 : ((var2) == 2 ? this.blockIndexInTexture + 2 : this.blockIndexInTexture);
    	return (metadata & 3) == 1 ? this.blockIndexInTexture + 1 : ((metadata & 3) == 3 ? this.blockIndexInTexture + 2 : this.blockIndexInTexture);
    	//return super.getBlockTextureFromSideAndMetadata(side, metadata);
    }

    public void setGraphicsLevel(boolean var1)
    {
        this.graphicsLevel = var1;
        this.blockIndexInTexture = this.baseIndexInPNG + (var1 ? 0 : 16);
    }

    /**
     * Called whenever an entity is walking on top of this block. Args: world, x, y, z, entity
     */
    /*public void onEntityWalking(World var1, int var2, int var3, int var4, Entity var5)
    {
        super.onEntityWalking(var1, var2, var3, var4, var5);
    }*/

    public String getTextureFile()
    {
        return FloraTrees.texture;
    }

    /**
     * Returns true if the given side of this block type should be rendered, if the adjacent block is at the given
     * coordinates.  Args: blockAccess, x, y, z, side
     */
    
    public boolean shouldSideBeRendered(IBlockAccess par1IBlockAccess, int par2, int par3, int par4, int par5)
    {
        return par5 == 0 && this.minY > 0.0D ? true : (par5 == 1 && this.maxY < 1.0D ? true : (par5 == 2 && this.minZ > 0.0D ? true : (par5 == 3 && this.maxZ < 1.0D ? true : (par5 == 4 && this.minX > 0.0D ? true : (par5 == 5 && this.maxX < 1.0D ? true : !par1IBlockAccess.isBlockOpaqueCube(par2, par3, par4))))));
    }
    /*@Override
    public boolean shouldSideBeRendered(IBlockAccess var1, int var2, int var3, int var4, int var5)
    {
        return this.graphicsLevel ? super.shouldSideBeRendered(var1, var2, var3, var4, var5) : true;
    }*/

    /*public void addCreativeItems(ArrayList var1)
    {
        var1.add(new ItemStack(FloraTrees.floraLeaves, 1, 0));
        var1.add(new ItemStack(FloraTrees.floraLeaves, 1, 1));
        var1.add(new ItemStack(FloraTrees.floraLeaves, 1, 2));
    }*/
}
