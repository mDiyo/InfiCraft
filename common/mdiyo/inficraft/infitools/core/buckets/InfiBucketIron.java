package mDiyo.inficraft.infitools.core.buckets;

import net.minecraft.src.*;

public class InfiBucketIron extends ItemBucket 
{

	int ij;
	public InfiBucketIron(int i, int j) {
		super(i, j);
		ij = i + j;
		this.setItemName("bucket");
	}

	@Override
	public String getTextureFile()
    {
        return "/inficore/items.png";
    }

}
