package net.minecraft.src.blocks;

import net.minecraft.src.*;
import net.minecraft.src.forge.MinecraftForgeClient;

public class BrickIceItem extends CustomItemBlockInfi
{
	public static final String blockType[] =
	{
	    "ice", "smallIce", "fancyIce"
	};

    public BrickIceItem(int i)
    {
        super(i);
        setMaxDamage(0);
        setHasSubtypes(true);
        MinecraftForgeClient.registerCustomItemRenderer(mod_InfiBlocks.iceBrick.blockID, this);
    }

    public int getIconFromDamage(int i)
    {
        return mod_InfiBlocks.iceBrick.getBlockTextureFromSideAndMetadata(0, i);
    }

    public String getItemNameIS(ItemStack itemstack)
    {
        return (new StringBuilder()).append(blockType[itemstack.getItemDamage()]).append("Brick").toString();
    }
}
