package net.minecraft.src.mechvent;

import net.minecraft.client.Minecraft;
import net.minecraft.src.*;
import org.lwjgl.opengl.GL11;

public class GrinderGui extends GuiContainer
{
    public GrinderLogic crusherLogic;

    public GrinderGui(InventoryPlayer inventoryplayer, GrinderLogic logic)
    {
        super(new GrinderContainer(inventoryplayer, logic));
        crusherLogic = logic;
    }

    protected void drawGuiContainerForegroundLayer()
    {
        fontRenderer.drawString("Grinder", 67, 6, 0x404040);
        fontRenderer.drawString("Inventory", 8, (ySize - 96) + 2, 0x404040);
    }

    protected void drawGuiContainerBackgroundLayer(float f, int i, int j)
    {
        int k = mc.renderEngine.getTexture("/mechtex/grinder.png");
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        mc.renderEngine.bindTexture(k);
        int l = (width - xSize) / 2;
        int i1 = (height - ySize) / 2;
        drawTexturedModalRect(l, i1, 0, 0, xSize, ySize);
        if (crusherLogic.fuel > 0)
        {
            int j1 = crusherLogic.gaugeFuelScaled(12);
            drawTexturedModalRect(l + 82, (i1 + 36 + 18) - j1, 176, 12 - j1, 14, j1 + 2);
        }
        int k1 = crusherLogic.gaugeProgressScaled(24);
        drawTexturedModalRect(l + 77, i1 + 19, 176, 14, k1, 16);
    }
}
