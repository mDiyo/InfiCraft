package net.minecraft.src.orizondim;
import net.minecraft.src.*;

import java.util.ArrayList;
import java.util.Random;

public class WarpPlank extends Block
{
	
    public WarpPlank(int i)
    {
        super(i, 4, Material.wood);
        setLightValue(1.0F);
    }

    public void getCollidingBoundingBoxes(World world, int i, int j, int k, AxisAlignedBB axisalignedbb, ArrayList arraylist)
    {
    }
}
