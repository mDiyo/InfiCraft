package net.minecraft.src.flora;

import net.minecraft.src.*;
import net.minecraft.src.forge.MinecraftForgeClient;

public class CorruptBrickItem extends CustomItemBlockFlora
{
    public static final String blockType[] =
    {
        "blood", "azure", "envy", "amber", "heart", "dark", "bright", "pure", "bloodbrick", "azurebrick",
        "envybrick", "amberbrick", "heartbrick", "darkbrick", "brightbrick", "purebrick"
    };

    public CorruptBrickItem(int i)
    {
        super(i);
        setMaxDamage(0);
        setHasSubtypes(true);
        MinecraftForgeClient.registerCustomItemRenderer(mod_FloraSoma.corruptBrick.blockID, this);
    }

    public int getIconFromDamage(int i)
    {
        return mod_FloraSoma.corruptor.getBlockTextureFromSideAndMetadata(0, i);
    }

    public String getItemNameIS(ItemStack itemstack)
    {
        return (new StringBuilder()).append(blockType[itemstack.getItemDamage()]).append("corrupted").toString();
    }
    
    @Override
	public void renderInventory(RenderBlocks render, int itemID, int metadata) {
		MinecraftForgeClient.bindTexture("/floratex/stone.png");
		render.renderBlockAsItem(Block.blocksList[itemID], metadata, 1.0F);
	}
}
