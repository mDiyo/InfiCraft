package net.minecraft.src.inficore.buckets;
import net.minecraft.src.inficore.*;
import net.minecraft.src.*;
import net.minecraft.src.forge.IBucketHandler;

public class InfiBucketHandler
	implements IBucketHandler 
{
	
	@Override
	public ItemStack fillCustomBucket(World w, int x, int y, int z) {
		if (w.getBlockId(x, y, z) == Block.sand.blockID) {
			
			w.setBlockWithNotify(x, y, z, 0);
			
			return new ItemStack(Items.ironBucketSand);
		} else
			
		if (w.getBlockId(x, y, z) == Block.gravel.blockID) {
				
			w.setBlockWithNotify(x, y, z, 0);
				
			return new ItemStack(Items.ironBucketGravel);
		} else {
			return null;
		}
	}

}
