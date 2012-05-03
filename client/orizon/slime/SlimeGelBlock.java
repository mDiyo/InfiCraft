package net.minecraft.src.orizon.slime;
import java.util.ArrayList;
import java.util.Random;

import net.minecraft.src.*;
import net.minecraft.src.forge.ITextureProvider;

public class SlimeGelBlock extends BlockBreakable
	implements ITextureProvider
{
    public SlimeGelBlock(int i, int j)
    {
        super(i, j, Material.sponge, false);
        enableStats = false;
    }
    
	public boolean getEnableStats() {return false;}
	
	public int getMobilityFlag()
    {
        return 0;
    }
    
    protected int damageDropped(int md)
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
    public AxisAlignedBB getCollisionBoundingBoxFromPool(World world, int i, int j, int k)
    {
        return AxisAlignedBB.getBoundingBoxFromPool(i, j, k, (double)i + 1.0D, (double)j + 0.625D, (double)k + 1.0D);
    }
    
    public void addCreativeItems(ArrayList arraylist)
    {
        arraylist.add(new ItemStack(mod_Orizon.slimeGelBlock, 1, 0));
    }
    
    public String getTextureFile()
    {
        return "/oretex/slime.png";
    }
}
