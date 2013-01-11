package inficraft.microblocks.core.api.util;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.inventory.Container;

import org.lwjgl.opengl.GL11;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class BaseGuiContainer<ContainerType extends Container> extends GuiContainer {
	public ContainerType container;
	private String texPath;
	public BaseGuiContainer(ContainerType container, int xSize, int ySize, String texPath) {
		super(container);
		this.container = container;
		this.xSize = xSize;
		this.ySize = ySize;
		this.texPath = texPath;
	}
	
	@Override
	protected void drawGuiContainerBackgroundLayer(float var1, int var2, int var3) {
		GL11.glBindTexture(GL11.GL_TEXTURE_2D, mc.renderEngine.getTexture(texPath));
		drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);
	}
	
	protected void drawString(String s, int x, int y, int colour) {
		fontRenderer.drawStringWithShadow(s, x + guiLeft, y + guiTop, colour);
	}
}
