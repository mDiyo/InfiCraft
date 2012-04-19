package net.minecraft.src.inficore.buckets;

import net.minecraft.src.*;
import net.minecraft.src.forge.*;

public class InfiBucketIron extends ItemBucket 
	implements ITextureProvider {

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
