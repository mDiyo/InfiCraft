package mDiyo.inficraft.flora.berries;

import net.minecraft.src.*;
import net.minecraftforge.common.ForgeDirection;
import net.minecraftforge.common.IPlantable;

public class BerryBushItem extends ItemBlock
{

    public BerryBushItem(int i)
    {
        super(i);
        //setMaxDamage(0);
        setHasSubtypes(true);
    }
    
    @Override
    public int getMetadata(int md)
    {
        return md;
    }
    
    /* Place bushes on dirt, grass, or other bushes only */
    @Override    
    public boolean onItemUse(ItemStack stack, EntityPlayer player, World world, int x, int y, int z, int side, float par8, float par9, float par10)
    {
        if (side != 1)
            return false;
        
        else if (player.canPlayerEdit(x, y, z, side, stack) && player.canPlayerEdit(x, y + 1, z, side, stack))
        {
            Block block = Block.blocksList[world.getBlockId(x, y, z)];

            if (block != null && block.canSustainPlant(world, x, y, z, ForgeDirection.UP, (IPlantable) FloraBerries.instance.berryBush) && world.isAirBlock(x, y + 1, z))
            {
                world.setBlockAndMetadataWithNotify(x, y + 1, z, FloraBerries.berryBush.blockID, stack.getItemDamage());
                if (!player.capabilities.isCreativeMode)
                	stack.stackSize--;
                if (!world.isRemote)
                	world.playAuxSFX(2001, x, y, z, Block.grass.blockID);
                return true;
            }
            else
                return false;
        }
        else
            return false;
    }

    /* Block name in inventory */
    @Override
    public String getItemNameIS(ItemStack itemstack)
    {
        return (new StringBuilder()).append("block.").append(blockType[itemstack.getItemDamage()]).append("berryBush").toString();
    }
    public static final String blockType[] =
    {
        "rasp", "blue", "black", "geo", "rasp", "blue", "black", "geo",
        "rasp", "blue", "black", "geo", "rasp", "blue", "black", "geo"
    };
}
