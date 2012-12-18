package pchan3;

import net.minecraft.client.Minecraft;
import net.minecraft.src.GuiContainer;
import net.minecraft.src.InventoryPlayer;

import org.lwjgl.opengl.GL11;

public class GuiAirship extends GuiContainer
{

    public GuiAirship(InventoryPlayer inventoryplayer,EntityAirship air)
    {
        super(new ContainerAirship(inventoryplayer, air));
        airship = air;
    }

    protected void drawGuiContainerForegroundLayer()
    {
        fontRenderer.drawString("Airship Inventory", 8, 4, 0x404040);
        fontRenderer.drawString("Arrows:", 89, 55, 0x404040);
        fontRenderer.drawString("Fuel:", 105, 20, 0x404040);
        fontRenderer.drawString("Inventory", 8, (ySize - 96) + 2, 0x404040);
    }

    protected void drawGuiContainerBackgroundLayer(float f,int b,int r)
    {
        int i = mc.renderEngine.getTexture("/gui/airshipgui.png");
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        mc.renderEngine.bindTexture(i);
        int j = (width - xSize) / 2;
        int k = (height - ySize) / 2;
        drawTexturedModalRect(j, k, 0, 0, xSize, ySize);        
        
      
        int x = airship.getFuelScaled(10);//32 = Empty, 0 = Full, Work Out Fuel level.
        drawTexturedModalRect(j+156,k+15,176,32 - x,12,32);
        //drawTexturedModalRect(j + 79, k + 34, 176, 14, i1 + 1, 16);
    }

    private EntityAirship airship;
}
