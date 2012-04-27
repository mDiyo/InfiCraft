package net.minecraft.src.orizondim;
import net.minecraft.src.*;

import java.util.ArrayList;
import java.util.Random;
import net.minecraft.client.Minecraft;

public class WarpPlank extends Block
{
	Minecraft mc;
	
    public WarpPlank(int i)
    {
        super(i, 4, Material.wood);
        setLightValue(1.0F);
    }

    public void getCollidingBoundingBoxes(World world, int i, int j, int k, AxisAlignedBB axisalignedbb, ArrayList arraylist)
    {
    }

    public void onEntityCollidedWithBlock(World world, int i, int j, int k, Entity entity)
    {
		if(entity.ridingEntity == null && entity.riddenByEntity == null && (entity instanceof EntityPlayer) && !world.isRemote)
        {
			mc = ModLoader.getMinecraftInstance();
			mc.usePortal(47);
			/** mc.usePortal(2) leads to the plank dimension directly upon touching it.
				mc.usePortal can also use a custom teleporter class. F.E. mc.usePortal(3, aetherportal) **/
		}
    }
}
