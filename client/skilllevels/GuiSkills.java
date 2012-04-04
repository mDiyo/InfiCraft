package net.minecraft.src.skilllevels;
import net.minecraft.src.*;

import org.lwjgl.opengl.GL11;

public class GuiSkills extends GuiScreen
{
    /**
     * A reference to the screen object that created this. Used for navigating between screens.
     */
    //private GuiScreen parentScreen;

    /** The title string that is displayed in the top-center of the screen. */
    protected String screenTitle = "Skills";
    
    /** The X size of the inventory window in pixels. */
    protected int xSize = 256;

    /** The Y size of the inventory window in pixels. */
    protected int ySize = 196;
    
    /**
     * Starting X position for the Gui. Inconsistent use for Gui backgrounds.
     */
    protected int guiLeft;

    /**
     * Starting Y position for the Gui. Inconsistent use for Gui backgrounds.
     */
    protected int guiTop;

    int[] skillLevels;
    int[] skillExperience;

    /**
     * An array of options that can be changed directly from the options GUI.
     */
    private static EnumOptions[] relevantOptions = new EnumOptions[] {EnumOptions.MUSIC, EnumOptions.SOUND, EnumOptions.INVERT_MOUSE, EnumOptions.SENSITIVITY, EnumOptions.FOV, EnumOptions.DIFFICULTY};

    public GuiSkills(PlayerSkills skills)
    {
        /*this.skillLevels = skills.getSkillLevels();
        this.skillExperience = skills.getSkillExperience();*/
    }

    /**
     * Adds the buttons (and other controls) to the screen in question.
     */
    public void initGui()
    {
    	super.initGui();
        this.guiLeft = (this.width - this.xSize) / 2;
        this.guiTop = (this.height - this.ySize) / 2;
    }

    /**
     * Draws the screen and all the components in it.
     */
    public void drawScreen(int par1, int par2, float par3)
    {
        this.drawDefaultBackground();
        this.drawCenteredString(this.fontRenderer, this.screenTitle, this.width / 2, 8, 16777215);
        super.drawScreen(par1, par2, par3);
        this.drawGuiBackgroundLayer(par3, par1, par2);
        this.drawGuiForegroundLayer(par3, par1, par2);        
    }
    
    /**
     * Draw the background layer
     */
    protected void drawGuiBackgroundLayer(float var1, int var2, int var3)
    {
    	int k = mc.renderEngine.getTexture("/domtex/skillblank.png");
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        mc.renderEngine.bindTexture(k);
        int l = (width - xSize) / 2;
        int i1 = (height - ySize) / 2;
        drawTexturedModalRect(l, i1, 0, 0, xSize, ySize);
    }
    
    /**
     * Draw the foreground layer
     */
    protected void drawGuiForegroundLayer(float var1, int var2, int var3) 
    {
    	for (int i = 0; i < 6; i++)
    	{
    		drawStatValues(0, 32 * i, i);
    	}
    	for (int i = 6; i < 12; i++)
    	{
    		drawStatValues(120, 32 * (i-6), i);
    	}
    }
    
    protected void drawStatValues(int xOffset, int yOffset, int skillType) 
    { //TODO: Redo everything here
    	/*this.fontRenderer.drawString(new StringBuilder().append(EntityPlayer.getSkillName(skillType))
    			.toString(),
    			8 + guiLeft + xOffset, 6 + guiTop + yOffset, 0x404040);
    	this.fontRenderer.drawString(new StringBuilder().append("Lv ").append(skillLevels[skillType])
    			.append(" - ").append(skillExperience[skillType])
    			.append("/").append(EntityPlayer.getExperienceToLevel(skillType))
    			.append(" Exp").toString(),
    			8 + guiLeft + xOffset, 18 + guiTop + yOffset, 0x404040);*/
    }
    
    /**
     * Returns true if this GUI should pause the game when it is displayed in single-player
     */
    @Override
    public boolean doesGuiPauseGame()
    {
        return true;
    }
}
