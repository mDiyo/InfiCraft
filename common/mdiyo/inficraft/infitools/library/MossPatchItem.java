package mDiyo.inficraft.infitools.library;

import mDiyo.inficraft.flora.berries.FloraBerries;
import net.minecraft.src.Block;
import net.minecraft.src.EntityPlayer;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;
import net.minecraft.src.ModLoader;
import net.minecraft.src.World;
import net.minecraftforge.common.ForgeDirection;
import net.minecraftforge.common.IPlantable;

public class MossPatchItem extends Item
{
    public MossPatchItem(int i)
    {
        super(i);
        setHasSubtypes(true);
        setMaxDamage(0);
        this.setItemName("mossPatchItem");
        ModLoader.addName(this, "Mossy Patch");
    }
    
    @Override    
    public boolean onItemUse(ItemStack stack, EntityPlayer player, World world, int x, int y, int z, int side, float par8, float par9, float par10)
    {
        if (side != 1)
            return false;
        
        else if (player.canPlayerEdit(x, y, z, side, stack) && player.canPlayerEdit(x, y + 1, z, side, stack))
        {
            int bID = world.getBlockId(x, y, z);
            Block block = Block.blocksList[world.getBlockId(x, y, z)];

            if (block != null && block.renderAsNormalBlock() && world.isAirBlock(x, y + 1, z))
            {
                world.setBlockAndMetadataWithNotify(x, y + 1, z, FloraBerries.berryBush.blockID, stack.getItemDamage());
                if (!player.capabilities.isCreativeMode)
                	stack.stackSize--;
                if (!world.isRemote)
                	world.playAuxSFX(2001, x, y, z, InfiLibrary.blockMoss.blockID);
                return true;
            }
            else
                return false;
        }
        else
            return false;
    }

    @Override
    public String getTextureFile()
    {
        return InfiLibrary.itemTexture;
    }
}
