package florasoma.crops;

import java.util.ArrayList;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockFlower;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.common.EnumPlantType;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class HerbBlock extends FloraCropBlock
{
    protected HerbBlock(int id, int tex)
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
     * Apply bonemeal to the crops.
     */
    /*public void fertilize(World world, int x, int y, int z)
    {
    	int meta = world.getBlockMetadata(x, y, z) / 4;
        world.setBlockMetadataWithNotify(x, y, z, meta + 3);
    }*/
    
    boolean requiresSun(int meta)
    {
    	return false;
    }

    /**
     * The type of render function that is called for this block
     */
    public int getRenderType()
    {
        return 1;
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
    
    @Override
    public EnumPlantType getPlantType(World world, int x, int y, int z)
    {
    	return EnumPlantType.Plains;
    }
    
    /**
     * Can this block stay at this position.  Similar to canPlaceBlockAt except gets checked often with plants.
     */
    @Override
    public boolean canBlockStay(World world, int x, int y, int z)
    {
    	return true;
    }
}
