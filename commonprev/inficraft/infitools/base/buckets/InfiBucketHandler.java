package inficraft.infitools.base.buckets;
import inficraft.infitools.base.Items;
import net.minecraft.src.Block;
import net.minecraft.src.ItemStack;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.entity.player.FillBucketEvent;

public class InfiBucketHandler
{
	@ForgeSubscribe
	public ItemStack fillBucketEvent(FillBucketEvent event)
	{
		int x = event.target.blockX;
		int y = event.target.blockY;
		int z = event.target.blockZ;
		
		if (event.world.getBlockId(x, y, z) == Block.sand.blockID) {
			
			event.world.setBlockWithNotify(x, y, z, 0);
			
			return new ItemStack(Items.ironBucketSand);
		} else
			
		if (event.world.getBlockId(x, y, z) == Block.gravel.blockID) {
				
			event.world.setBlockWithNotify(x, y, z, 0);
				
			return new ItemStack(Items.ironBucketGravel);
		} else {
			return null;
		}
	}

}
