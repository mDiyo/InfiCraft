package net.minecraft.src.mechvent;

import net.minecraft.client.Minecraft;
import net.minecraft.src.*;
import org.lwjgl.opengl.GL11;

public class DissassemblyGui extends GuiContainer
{
    public DissassemblyGui(InventoryPlayer inventoryplayer, World world)
    {
        super(new DissassemblyContainer(inventoryplayer, world));
    }

    public void onGuiClosed()
    {
        super.onGuiClosed();
    }

    protected void drawGuiContainerForegroundLayer()
    {
        fontRenderer.drawString("Crafting", 28, 6, 0x404040);
        fontRenderer.drawString("Inventory", 8, (ySize - 96) + 2, 0x404040);
    }

    protected void drawGuiContainerBackgroundLayer(float f, int i, int j)
    {
        int k = mc.renderEngine.getTexture("/prototex/uncrafting.png");
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        mc.renderEngine.bindTexture(k);
        int l = (width - xSize) / 2;
        int i1 = (height - ySize) / 2;
        drawTexturedModalRect(l, i1, 0, 0, xSize, ySize);
    }
}
