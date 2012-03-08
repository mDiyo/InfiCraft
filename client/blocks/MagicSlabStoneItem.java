package net.minecraft.src.blocks;

import net.minecraft.src.*;
import net.minecraft.src.forge.MinecraftForgeClient;

public class MagicSlabStoneItem extends CustomItemBlockInfi
{
    public static final String blockType[] =
    {
        "stone", "slabstone", "cobblestone", "stonebrick", "crackedstonebrick", "mossystonebrick",
        "brick", "mossy", "obsidian", "netherrack", "sandstone", "iron", "gold", "diamond",
        "endstone", "netherBrick"
    };

    public MagicSlabStoneItem(int i)
    {
        super(i);
        setMaxDamage(0);
        setHasSubtypes(true);
        MinecraftForgeClient.registerCustomItemRenderer(mod_InfiBlocks.magicSlabStone.blockID, this);
    }

    public int getIconFromDamage(int i)
    {
        return mod_InfiBlocks.magicSlabStone.getBlockTextureFromSideAndMetadata(0, i);
    }

    public String getItemNameIS(ItemStack itemstack)
    {
        return (new StringBuilder()).append(blockType[itemstack.getItemDamage()]).append("MagicSlab").toString();
    }
}
