package mDiyo.inficraft.flora.crops;

import mDiyo.inficraft.flora.berries.FloraBerries;
import net.minecraft.src.Block;
import net.minecraft.src.EntityPlayer;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;
import net.minecraft.src.World;
import net.minecraftforge.common.ForgeDirection;
import net.minecraftforge.common.IPlantable;

public class SeedBag extends Item
{
	Block crop;
	int cropMetadata;
    public SeedBag(int id, Block block, int cMD)
    {
        super(id);
        crop = block;
        cropMetadata = cMD;
    }

    @Override
    public boolean onItemUse(ItemStack stack, EntityPlayer player, World world, int x, int y, int z, int side, float par8, float par9, float par10)
    {
        if (side != 1)
            return false;
        
        boolean planted = false;
        for (int posX = x - 1; posX <= x + 1; posX++)
        {
        	for (int posZ = z - 1; posZ <= z + 1; posZ++)
            {
		        if (player.canPlayerEdit(posX, y, posZ, side, stack) && player.canPlayerEdit(posX, y + 1, posZ, side, stack))
		        {
		            Block block = Block.blocksList[world.getBlockId(posX, y, posZ)];
		
		            if (block != null && block.canSustainPlant(world, posX, y, posZ, ForgeDirection.UP, (IPlantable)crop) && world.isAirBlock(posX, y + 1, posZ))
		            {
		                world.setBlockAndMetadataWithNotify(posX, y + 1, posZ, crop.blockID, cropMetadata);
		                planted = true;
		            }
		        }
            }
        }
        if (planted)
        {
        	if (!player.capabilities.isCreativeMode)
            	stack.stackSize--;
            if (!world.isRemote)
            	world.playAuxSFX(2001, x, y, z, crop.blockID);
        }
        return planted;
    }

    public String getTextureFile()
    {
        return FloraCrops.cropTexture;
    }
}
