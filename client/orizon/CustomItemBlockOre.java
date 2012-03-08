package net.minecraft.src.orizon;

import org.lwjgl.opengl.GL11;

import net.minecraft.src.*;
import net.minecraft.src.forge.*;
import net.minecraft.client.Minecraft;

public class CustomItemBlockOre extends ItemBlock
	implements ICustomItemRenderer
{
    public CustomItemBlockOre(int i)
    {
        super(i);
        setMaxDamage(0);
        setHasSubtypes(true);
    }

    public int getMetadata(int i)
    {
        return i;
    }

	@Override
	public void renderInventory(RenderBlocks render, int itemID, int metadata) {
		MinecraftForgeClient.bindTexture("/oretex/ores.png");
		render.renderBlockAsItem(Block.blocksList[itemID], metadata, 1.0F);
	}
}
