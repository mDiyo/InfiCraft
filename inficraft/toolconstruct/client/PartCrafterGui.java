package inficraft.toolconstruct.client;

import inficraft.toolconstruct.blocks.PartCrafterContainer;
import inficraft.toolconstruct.blocks.PartCrafterLogic;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;

import org.lwjgl.opengl.GL11;

public class PartCrafterGui extends GuiContainer
{
	PartCrafterLogic logic;
	String title, body = "";
	
	public PartCrafterGui(InventoryPlayer inventoryplayer, PartCrafterLogic partlogic)
	{
		super(partlogic.getGuiContainer(inventoryplayer));
		logic = partlogic;
		
		title = "\u00A7nTool Part Crafting";
		body = "Place a pattern and a material on the left to get started.\n\nDescriptions not done yet, stay tuned.";
	}

	protected void drawGuiContainerForegroundLayer (int par1, int par2)
	{
		this.fontRenderer.drawString(StatCollector.translateToLocal("crafters.PartBuilder"), 6, 6, 4210752);
		this.fontRenderer.drawString(StatCollector.translateToLocal("container.inventory"), 8, this.ySize - 96 + 2, 4210752);
		
		drawToolInformation();
	}
	
	void drawToolInformation ()
	{
		this.drawCenteredString(fontRenderer, title, xSize + 63, 8, 16777215);
		fontRenderer.drawSplitString(body, xSize + 8, 24, 115, 16777215);
	}

	protected void drawGuiContainerBackgroundLayer (float par1, int par2, int par3)
	{
		// Draw the background
		int texID = this.mc.renderEngine.getTexture("/infitextures/gui/toolparts.png");
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		this.mc.renderEngine.bindTexture(texID);
		int cornerX = (this.width - this.xSize) / 2;
		int cornerY = (this.height - this.ySize) / 2;
		this.drawTexturedModalRect(cornerX, cornerY, 0, 0, this.xSize, this.ySize);

		// Draw Slots
		this.drawTexturedModalRect(cornerX + 39, cornerY + 26, 0, 166, 98, 36);
		if (!logic.isStackInSlot(0))
		{
			this.drawTexturedModalRect(cornerX + 39, cornerY + 26, 176, 0, 18, 18);
		}
		if (!logic.isStackInSlot(1))
		{
			this.drawTexturedModalRect(cornerX + 57, cornerY + 26, 176, 18, 18, 18);
		}
		if (!logic.isStackInSlot(2))
		{
			this.drawTexturedModalRect(cornerX + 39, cornerY + 44, 176, 0, 18, 18);
		}
		if (!logic.isStackInSlot(3))
		{
			this.drawTexturedModalRect(cornerX + 57, cornerY + 44, 176, 36, 18, 18);
		}

		// Draw description
		texID = this.mc.renderEngine.getTexture("/infitextures/gui/description.png");
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		this.mc.renderEngine.bindTexture(texID);
		cornerX = (this.width + this.xSize) / 2;
		cornerY = (this.height - this.ySize) / 2;
		this.drawTexturedModalRect(cornerX, cornerY, 0, 0, this.xSize, this.ySize);
	}

	public void initGui ()
	{
		super.initGui();
		int cornerX = (this.width - this.xSize) / 2;
		int cornerY = (this.height - this.ySize) / 2;

		this.controlList.clear();
		this.controlList.add(new GuiButton(1, cornerX - 120, cornerY, 116, 20, "Build Tool Parts"));
		this.controlList.add(new GuiButton(2, cornerX - 120, cornerY + 20, 116, 20, "Tool Patterns"));
	}
}
