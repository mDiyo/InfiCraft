package inficraft.orizon.slimepools;
import java.util.ArrayList;

import net.minecraft.block.BlockBreakable;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;

public class SlimeGelBlock extends BlockBreakable
{
    public SlimeGelBlock(int i, int j)
    {
        super(i, j, Material.sponge, false);
        enableStats = false;
        this.setBlockName("SlimeGel");
        setCreativeTab(CreativeTabs.tabDecorations);
    }
    
	public boolean getEnableStats() {return false;}
	
	public int getMobilityFlag()
    {
        return 0;
    }
    
    public int damageDropped(int md)
    {
        return md;
    }
    
    public int getBlockTextureFromSideAndMetadata(int side, int md)
    {
        return blockIndexInTexture + md;
    }
    
    @Override
    public void onEntityCollidedWithBlock(World world, int x, int y, int z, Entity entity) {
    	if (entity.motionY < 0)
    		entity.motionY *= -1.2F;
    	entity.fallDistance = 0;
    }
    
    @Override
    public AxisAlignedBB getCollisionBoundingBoxFromPool(World world, int x, int y, int z)
    {
        return AxisAlignedBB.getBoundingBox(x, y, z, (double)x + 1.0D, (double)y + 0.625D, (double)z + 1.0D);
    }
    
    public void addCreativeItems(ArrayList arraylist)
    {
        arraylist.add(new ItemStack(OrizonSlime.slimeGelBlock, 1, 0));
    }
    
    public String getTextureFile()
    {
        return OrizonSlime.texture;
    }
}
