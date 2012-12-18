package florasoma.crops;

import java.util.ArrayList;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockFlower;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.common.EnumPlantType;
import cpw.mods.fml.common.Side;
import cpw.mods.fml.common.asm.SideOnly;

public class FloraCropBlock extends BlockFlower
{
    protected FloraCropBlock(int id, int tex)
    {
        super(id, tex);
        this.setTickRandomly(true);
        float var3 = 0.5F;
        this.setBlockBounds(0.5F - var3, 0.0F, 0.5F - var3, 0.5F + var3, 0.25F, 0.5F + var3);
        this.setCreativeTab((CreativeTabs)null);
        this.setHardness(0.0F);
        this.setStepSound(soundGrassFootstep);
        this.disableStats();
        this.setRequiresSelfNotify();
    }

    /**
     * Ticks the block if it's been scheduled
     */
    public void updateTick(World world, int x, int y, int z, Random random)
    {
        super.updateTick(world, x, y, z, random);

        int light = world.getBlockLightValue(x, y, z);
        if (light >= 8)
        {
            int meta = world.getBlockMetadata(x, y, z);

            if (meta % 4 != 3)
            {
                float grow = this.getGrowthRate(world, x, y, z, meta, light);

                if (random.nextInt((int)(50.0F / grow) + 1) == 0)
                {
                    meta++;
                    world.setBlockMetadataWithNotify(x, y, z, meta);
                }
            }
        }
    }

    /**
     * Apply bonemeal to the crops.
     */
    public void fertilize(World world, int x, int y, int z)
    {
    	int meta = world.getBlockMetadata(x, y, z);
        world.setBlockMetadataWithNotify(x, y, z, 3);
    }

    /**
     * Gets the growth rate for the crop. Setup to encourage rows by halving growth rate if there is diagonals, crops on
     * different sides that aren't opposing, and by adding growth for every crop next to this one (and for crop below
     * this one). Args: x, y, z
     */
    private float getGrowthRate(World world, int x, int y, int z, int meta, int light)
    {
    	float growth = 0.25f * (light - 7);
    	Block soil = blocksList[world.getBlockId(x, y - 1, z)];
    	
    	if (world.canBlockSeeTheSky(x, y, z) || !requiresSun(meta))
    		growth += 2f;
    	
    	if (soil.isFertile(world, x, y, z))
    		growth *= 2f;
    	
    	return 1f + growth;
    }
    
    boolean requiresSun(int meta)
    {
    	return true;
    }

    /**
     * From the specified side and block metadata retrieves the blocks texture. Args: side, metadata
     */
    public int getBlockTextureFromSideAndMetadata(int side, int meta)
    {
        return this.blockIndexInTexture + meta;
    }

    /**
     * The type of render function that is called for this block
     */
    public int getRenderType()
    {
        return 6;
    }
    
    public int idDropped(int meta, Random random, int fortune)
    {
        return meta % 4 == 3 ? this.getCropItem(meta) : this.getSeedItem(meta);
    }
    
    protected int getCropItem(int meta)
    {
        return FloraCrops.instance.barleyItem.shiftedIndex;
    }

    protected int getSeedItem(int meta)
    {
        return FloraCrops.instance.barleySeed.shiftedIndex;
    }
    
    public int damageDropped(int meta)
    {
        return 0;
    }


    /**
     * Drops the block items with a specified chance of dropping the specified items
     */
    public void dropBlockAsItemWithChance(World par1World, int par2, int par3, int par4, int par5, float par6, int par7)
    {
        super.dropBlockAsItemWithChance(par1World, par2, par3, par4, par5, par6, 0);
    }

    @Override 
    public ArrayList<ItemStack> getBlockDropped(World world, int x, int y, int z, int metadata, int fortune)
    {
    	ArrayList<ItemStack> ret = new ArrayList<ItemStack>();
        
        int count = quantityDropped(metadata, fortune, world.rand);
        for(int i = 0; i < count; i++)
        {
            int id = idDropped(metadata, world.rand, 0);
            if (id > 0)
            {
                ret.add(new ItemStack(id, 1, damageDropped(metadata)));
            }
        }

        if (metadata % 4 == 3)
        {
            for (int n = 0; n < 3 + fortune; n++)
            {
                if (world.rand.nextInt(15) <= (metadata % 4 * 2))
                {
                    ret.add(new ItemStack(this.getSeedItem(metadata), 1, 0));
                }
            }
        }

        return ret;
    }

    /**
     * Returns the ID of the items to drop on destruction.
     */

    @SideOnly(Side.CLIENT)

    /**
     * only called by clickMiddleMouseButton , and passed to inventory.setCurrentItem (along with isCreative)
     */
    public int idPicked(World world, int x, int y, int z)
    {
        return this.getSeedItem(world.getBlockMetadata(x, y, z));
    }
    
    @Override
    public EnumPlantType getPlantType(World world, int x, int y, int z)
    {
    	return EnumPlantType.Crop;
    }
    
    /**
     * Can this block stay at this position.  Similar to canPlaceBlockAt except gets checked often with plants.
     */
    @Override
    public boolean canBlockStay(World world, int x, int y, int z)
    {
    	int meta = world.getBlockMetadata(x, y, z) % 4; //Wild crops can stay
    	if (meta == 3)
    		return true;
    	
    	return super.canBlockStay(world, x, y, z);
    }
    
    public String getTextureFile()
    {
        return FloraCrops.cropTexture;
    }
}
