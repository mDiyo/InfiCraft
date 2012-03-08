package net.minecraft.src.blocks;

import net.minecraft.src.Block;
import net.minecraft.src.ItemBlock;
import net.minecraft.src.ItemStack;
import net.minecraft.src.RenderBlocks;
import net.minecraft.src.mod_InfiBlocks;
import net.minecraft.src.forge.ICustomItemRenderer;
import net.minecraft.src.forge.MinecraftForgeClient;

public class FurnaceItem extends CustomItemBlockInfi
{
    public static final String blockType[] =
    {
        "iron", "brick", "sandstone", "obsidian", "redstone", "netherrack", 
        "stonebrick", "endstone", "glowstone"
    };

    public FurnaceItem(int i)
    {
        super(i);
        setMaxDamage(0);
        setHasSubtypes(true);
        MinecraftForgeClient.registerCustomItemRenderer(mod_InfiBlocks.furnace.blockID, this);
    }

    public String getItemNameIS(ItemStack itemstack)
    {
        return (new StringBuilder()).append(blockType[itemstack.getItemDamage()]).append("FurnaceInfi").toString();
    }
    
    @Override
	public void renderInventory(RenderBlocks render, int itemID, int metadata) {
		MinecraftForgeClient.bindTexture("/infiblocks/infimachines.png");
		render.renderBlockAsItem(Block.blocksList[itemID], metadata, 1.0F);
	}
}
