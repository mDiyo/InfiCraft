package net.minecraft.src.blocks;

import net.minecraft.src.*;
import net.minecraft.src.forge.MinecraftForgeClient;

public class BrickFancyMagicSlabItem extends CustomItemBlockInfi
{
	public static final String blockType[] =
		{
		    "obsidian", "snow", "sandstone", "brick", "netherrack", "diamond", "gold", "lapis", 
		    "slab", "stone", "", "brickTile", "iron", "redstone", "slime", "bone"
		};

    public BrickFancyMagicSlabItem(int i)
    {
        super(i);
        setMaxDamage(0);
        setHasSubtypes(true);
        MinecraftForgeClient.registerCustomItemRenderer(mod_InfiBlocks.fancyBrickMagicSlab.blockID, this);
    }

    public int getIconFromDamage(int i)
    {
        return mod_InfiBlocks.fancyBrickMagicSlab.getBlockTextureFromSideAndMetadata(0, i);
    }

    public String getItemNameIS(ItemStack itemstack)
    {
        return (new StringBuilder()).append(blockType[itemstack.getItemDamage()]).append("FancyBrickMagicSlab").toString();
    }
}
