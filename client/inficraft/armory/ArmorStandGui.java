package inficraft.armory;

import inficraft.armory.EntityEquipment;
import net.minecraft.src.EntityPlayer;
import net.minecraft.src.GuiContainer;

import org.lwjgl.opengl.GL11;

import cpw.mods.fml.common.Side;
import cpw.mods.fml.common.asm.SideOnly;

@SideOnly(Side.CLIENT)
public class ArmorStandGui extends GuiContainer
{
    public ArmorStandGui(EntityPlayer player, EntityEquipment equipment)
	{
    	super(player.inventoryContainer);
        this.allowUserInput = true;
	}
    
    /**
     * Draw the foreground layer for the GuiContainer (everything in front of the items)
     */
    protected void drawGuiContainerForegroundLayer(int par1, int par2)
    {
        this.fontRenderer.drawString("Armor Stand", 86, 16, 4210752);
    }

	@Override
	protected void drawGuiContainerBackgroundLayer(float var1, int var2, int var3)
	{
		int var4 = this.mc.renderEngine.getTexture("/infitextures/gui/armorstand.png");
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        this.mc.renderEngine.bindTexture(var4);
        int var5 = this.guiLeft;
        int var6 = this.guiTop;
        this.drawTexturedModalRect(var5, var6, 0, 0, this.xSize, this.ySize);
        System.out.println("Rendering armor stand gui");
	}
}
