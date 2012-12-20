package inficraft.infitools.client;

import inficraft.infitools.crafting.ToolStationContainer;
import inficraft.infitools.crafting.ToolStationLogic;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiTextField;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.util.StatCollector;

import org.lwjgl.opengl.GL11;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class ToolStationGui extends GuiContainer
{
    ToolStationLogic logic;
    GuiTextField text;
    String toolName;
    int texSize = 18;

    public ToolStationGui(InventoryPlayer par1InventoryPlayer, ToolStationLogic stationlogic)
    {
        super(new ToolStationContainer(par1InventoryPlayer, stationlogic));
        this.logic = stationlogic;
        text = new GuiTextField(this.fontRenderer, this.xSize/2-5, 8, 30, 12);
        //this.text = new GuiTextField(this.fontRenderer, this.xSize/2-5, 8, 30, this.fontRenderer.FONT_HEIGHT);
        this.text.setMaxStringLength(40);
        this.text.setEnableBackgroundDrawing(false);
        this.text.setVisible(true);
        this.text.setCanLoseFocus(false);
        this.text.setFocused(true);
        this.text.setTextColor(16777215);
        this.text.setText("");
    }
    
    public void updateScreen()
    {
        super.updateScreen();
        this.text.updateCursorCounter();
    }

    /**
     * Draw the foreground layer for the GuiContainer (everything in front of the items)
     */
    protected void drawGuiContainerForegroundLayer(int par1, int par2)
    {
        this.fontRenderer.drawString(StatCollector.translateToLocal("Tool Station"), 6, 6, 4210752);
        this.fontRenderer.drawString(StatCollector.translateToLocal("container.inventory"), 8, this.ySize - 96 + 2, 4210752);
        this.fontRenderer.drawString(toolName, this.xSize/2-5, 8, 0);
    }

    /**
     * Draw the background layer for the GuiContainer (everything behind the items)
     */
    protected void drawGuiContainerBackgroundLayer(float par1, int par2, int par3)
    {
    	//Draw the background
        int texID = this.mc.renderEngine.getTexture("/infitextures/gui/toolstation.png");
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        this.mc.renderEngine.bindTexture(texID);
        int cornerX = (this.width - this.xSize) / 2;
        int cornerY = (this.height - this.ySize) / 2;
        this.drawTexturedModalRect(cornerX, cornerY, 0, 0, this.xSize, this.ySize);
        
        texID = this.mc.renderEngine.getTexture("/infitextures/gui/icons.png");
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        this.mc.renderEngine.bindTexture(texID);
        //Draw the slots
        int[] slotX = { 56, 38, 56 };
        int[] slotY = { 28, 37, 46 };
        int[] iconX = { 0, 0, 0 };
        int[] iconY = { 1, 3, 2 };

        for (int i = 0; i < slotX.length; i++)
        {
	    	this.drawTexturedModalRect(cornerX + slotX[i], cornerY + slotY[i], 36, 0, texSize, texSize);
	        if (!logic.isStackInSlot(i+1))
	        {
	        	this.drawTexturedModalRect(cornerX + slotX[i], cornerY + slotY[i], 18*iconX[i], 18*iconY[i], texSize, texSize);
	        }
        }
        
        //Draw left side
        this.drawTexturedModalRect(cornerX - 50, cornerY, 36, 0, texSize, texSize);
        this.drawTexturedModalRect(cornerX - 50, cornerY, 54, 0, texSize, texSize);
        this.drawTexturedModalRect(cornerX - 26, cornerY, 0, 0, texSize, texSize);
        this.drawTexturedModalRect(cornerX - 26, cornerY, 72, 0, texSize, texSize);
    }
    
    public void setContainer(Container container)
    {
        this.inventorySlots = container;
    }
    
    protected void keyTyped(char par1, int keyCode)
    {
    	text.textboxKeyTyped(par1, keyCode);
    	toolName = text.getText().trim();
    	if (keyCode == 1)
        {
            this.mc.thePlayer.closeScreen();
        }
    }
    
    /*protected void mouseClicked(int par1, int par2, int par3)
    {
        super.mouseClicked(par1, par2, par3);
        text.mouseClicked(par1, par2, par3);
    }*/
}
