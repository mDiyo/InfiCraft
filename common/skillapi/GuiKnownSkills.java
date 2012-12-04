package skillapi;

import java.util.ArrayList;
import java.util.List;
import net.minecraft.client.Minecraft;
import net.minecraft.src.GuiScreen;

import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.GL11;

public class GuiKnownSkills extends GuiScreen
{
	private PlayerSkills player;
	private String[] skillKeys = new String[5];
	private boolean isScrollPressed = false;
	private int scrollPos = 0;
	private Skill heldSkill;

	public GuiKnownSkills(PlayerSkills player)
	{
		this.player = player;
		this.allowUserInput = true;
		for (int i = 0; i < this.skillKeys.length; i++)
			this.skillKeys[i] = Keyboard.getKeyName(mod_SkillsAPI.getSkillsAPIInstance().skillKeyBindings[i].keyCode);
	}

	public void initGui()
	{
		this.controlList.clear();
	}

	public void drawScreen(int mouseX, int mouseY, float partialTicks)
	{
		GL11.glEnable(3042);

		drawGUIBackground();
		drawScroll(mouseY);
		drawSkillBar(mouseX, mouseY);
		drawSkillList(mouseX, mouseY);
		drawHeldSkill(mouseX, mouseY);
		GL11.glDisable(3042);
	}

	private void drawGUIBackground() {
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		this.mc.renderEngine.bindTexture(this.mc.renderEngine.getTexture("/skillsgui.png"));
		drawTexturedModalRect((this.width - 185) / 2, (this.height - 176) / 2, 0, 0, 206, 155);
		this.fontRenderer.drawStringWithShadow("Known Skills", this.width / 2 - 85, this.height / 2 - 82, 16579712);
	}

	private void drawSkillBar(int mouseX, int mouseY)
	{
		for (int i = 0; i < this.player.skillBar.length; i++)
		{
			int posX = 2 + 18 * i;
			int posY = 2;
			if (this.player.skillBar[i] != null)
			{
				GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
				this.mc.renderEngine.bindTexture(this.mc.renderEngine.getTexture(this.player.skillBar[i].getTexturePath()));
				GL11.glScalef(0.0625F, 0.0625F, 1.0F);

				drawTexturedModalRect(posX * 16, posY * 16, 0, 0, 256, 256);
				GL11.glScalef(16.0F, 16.0F, 1.0F);
				if ((!Mouse.isButtonDown(0)) && (isMouseOverArea(mouseX, mouseY, posX, posY, 16, 16)))
					drawGradientRect(posX, posY, posX + 16, posY + 16, -2135112496, -2144783291);
			}
			else
			{
				drawGradientRect(posX, posY, posX + 16, posY + 16, -2135112496, -2144783291);
			}
		}
	}

	private void drawSkillList(int mouseX, int mouseY)
	{
		int offset = Math.round(this.scrollPos * (this.player.knownSkills.size() - 6) / 93);
		offset = offset < 0 ? 0 : offset;

		for (int i = offset; (i < offset + 6) && (i < this.player.knownSkills.size()); i++)
		{
			int posX;
			int posY;
			drawSkillInfo((Skill)this.player.knownSkills.get(i), posX = this.width / 2 - 81, posY = this.height / 2 - 66 + 21 * (i - offset));

			if ((!Mouse.isButtonDown(0)) && (isMouseOverArea(mouseX, mouseY, posX, posY, 16, 16))) {
				drawGradientRect(posX, posY, posX + 16, posY + 16, -2135112496, -2144783291);
			}
		}

		for (int i = offset; (i < offset + 6) && (i < this.player.knownSkills.size()); i++)
			if ((!Mouse.isButtonDown(0)) && (isMouseOverArea(mouseX, mouseY, this.width / 2 - 81, this.height / 2 - 66 + 21 * (i - offset), 16, 16)))
				drawToolTip((Skill)this.player.knownSkills.get(i), mouseX, mouseY);
	}

	private void drawSkillInfo(Skill skill, int x, int y)
	{
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		this.mc.renderEngine.bindTexture(this.mc.renderEngine.getTexture(skill.getTexturePath()));
		GL11.glScalef(0.0625F, 0.0625F, 1.0F);
		drawTexturedModalRect(x * 16, y * 16, 0, 0, 256, 256);
		GL11.glScalef(16.0F, 16.0F, 1.0F);
		this.fontRenderer.drawStringWithShadow(skill.getName(), x + 20, y, skill.getNameColour());
		drawSkillStats(skill, x + 20, y + 9);
	}

	private void drawSkillStats(Skill skill, int x, int y)
	{
		if (skill.getManaCost() > 0)
		{
			GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
			this.mc.renderEngine.bindTexture(this.mc.renderEngine.getTexture("/skillsgui.png"));
			drawTexturedModalRect(x, y, 104, 155, 9, 9);
			this.fontRenderer.drawString(String.valueOf(skill.getManaCost()), x + 10, y + 1, 13631455);
			x += 25;
		}
		if (skill.getChargeupTime() > 0.0F)
		{
			GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
			this.mc.renderEngine.bindTexture(this.mc.renderEngine.getTexture("/skillsgui.png"));
			drawTexturedModalRect(x, y, 113, 155, 9, 9);
			this.fontRenderer.drawString(String.valueOf(skill.getChargeupTime()), x + 10, y + 1, 13631455);
			x += 34;
		}
		if (skill.getCooldownTime() > 0.0F)
		{
			GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
			this.mc.renderEngine.bindTexture(this.mc.renderEngine.getTexture("/skillsgui.png"));
			drawTexturedModalRect(x, y, 122, 155, 9, 9);
			this.fontRenderer.drawString(String.valueOf(skill.getCooldownTime()), x + 10, y + 1, 13631455);
			x += 34;
		}
		if (skill.getDuration() > 0.0F)
		{
			GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
			this.mc.renderEngine.bindTexture(this.mc.renderEngine.getTexture("/skillsgui.png"));
			drawTexturedModalRect(x, y, 131, 155, 9, 9);
			this.fontRenderer.drawString(String.valueOf(skill.getDuration()), x + 10, y + 1, 13631455);
		}
	}

	private void drawToolTip(Skill skill, int mouseX, int mouseY)
	{
		mouseX += 9;
		String[] desc = skill.getDescription().split("\n");
		GL11.glEnable(3042);
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 0.8F);
		this.mc.renderEngine.bindTexture(this.mc.renderEngine.getTexture("/skillsgui.png"));
		drawTexturedModalRect(mouseX, mouseY, 0, 205, 175, 15);
		for (int i = 0; i < desc.length; i++)
			drawTexturedModalRect(mouseX, mouseY + 15 + 9 * i, 0, 209, 175, 9);
		drawTexturedModalRect(mouseX, mouseY + 15 + 9 * desc.length, 0, 219, 175, 3);
		GL11.glDisable(3042);
		this.mc.fontRenderer.drawStringWithShadow(skill.getType(), mouseX + 5, mouseY + 5, 14728248);
		for (int i = 0; i < desc.length; i++)
			this.mc.fontRenderer.drawString(desc[i], mouseX + 5, mouseY + 15 + 9 * i, 9414911);
	}

	private void drawScroll(int mouseY)
	{
		if (this.isScrollPressed)
		{
			this.scrollPos = (mouseY - 7 - (this.height / 2 - 70));
			this.scrollPos = (this.scrollPos < 0 ? 0 : this.scrollPos);
			this.scrollPos = (this.scrollPos > 114 ? 114 : this.scrollPos);
		}
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		this.mc.renderEngine.bindTexture(this.mc.renderEngine.getTexture("/skillsgui.png"));
		drawTexturedModalRect(this.width / 2 + 73, this.height / 2 - 70 + this.scrollPos, 206, 0, 12, 15);
	}

	private void drawHeldSkill(int mouseX, int mouseY)
	{
		if (this.heldSkill != null)
		{
			GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
			this.mc.renderEngine.bindTexture(this.mc.renderEngine.getTexture(this.heldSkill.getTexturePath()));
			GL11.glScalef(0.0625F, 0.0625F, 1.0F);
			drawTexturedModalRect((mouseX - 8) * 16, (mouseY - 8) * 16, 0, 0, 256, 256);
			GL11.glScalef(16.0F, 16.0F, 1.0F);
		}
	}

	private boolean isMouseOverArea(int mouseX, int mouseY, int posX, int posY, int sizeX, int sizeY) {
		return (mouseX >= posX) && (mouseX < posX + sizeX) && (mouseY >= posY) && (mouseY < posY + sizeY);
	}

	public void handleMouseInput()
	{
		super.handleMouseInput();
		int wheelState = Mouse.getEventDWheel();
		if (wheelState != 0)
		{
			this.scrollPos += (wheelState > 0 ? -8 : 8);
			this.scrollPos = (this.scrollPos < 0 ? 0 : this.scrollPos);
			this.scrollPos = (this.scrollPos > 114 ? 114 : this.scrollPos);
		}
	}

	protected void mouseClicked(int mouseX, int mouseY, int button)
	{
		if (button != 0) {
			return;
		}

		if (isMouseOverArea(mouseX, mouseY, this.width / 2 + 73, this.height / 2 - 70, 12, 129))
		{
			this.isScrollPressed = true;
			return;
		}

		for (int i = 0; i < this.player.skillBar.length; i++)
		{
			int posX = 2 + 18 * i;
			int posY = 2;
			if ((this.player.skillBar[i] != null) && (isMouseOverArea(mouseX, mouseY, posX, posY, 16, 16)))
			{
				this.heldSkill = this.player.skillBar[i];
				this.player.skillBar[i] = null;
				mod_SkillsAPI.getSkillsAPIInstance().updateKeyBindingTypes();
				return;
			}
		}

		int offset = Math.round(this.scrollPos * (this.player.knownSkills.size() - 5) / 93);
		offset = offset < 0 ? 0 : offset;

		for (int i = offset; (i < offset + 6) && (i < this.player.knownSkills.size()); i++)
		{
			if ((isMouseOverArea(mouseX, mouseY, this.width / 2 - 82, this.height / 2 - 66 + 21 * (i - offset), 16, 16)) && (this.player.knownSkills.get(i) != null))
			{
				if ((Keyboard.isKeyDown(42)) || (Keyboard.isKeyDown(54)))
				{
					for (int j = 0; j < this.player.skillBar.length; j++)
					{
						if (this.player.skillBar[j] == null)
						{
							this.player.skillBar[j] = ((Skill)this.player.knownSkills.get(i));
							mod_SkillsAPI.getSkillsAPIInstance().updateKeyBindingTypes();
							return;
						}
					}
				}
				this.heldSkill = ((Skill)this.player.knownSkills.get(i));
				return;
			}
		}
	}

	protected void mouseMovedOrUp(int mouseX, int mouseY, int button)
	{
		if (!Mouse.isButtonDown(0))
		{
			this.isScrollPressed = false;
			if (this.heldSkill != null)
			{
				for (int i = 0; i < this.player.skillBar.length; i++)
				{
					int posX = 2 + 18 * i;
					int posY = 2;
					if (isMouseOverArea(mouseX, mouseY, posX, posY, 16, 16))
					{
						this.player.skillBar[i] = this.heldSkill;
						mod_SkillsAPI.getSkillsAPIInstance().updateKeyBindingTypes();
						break;
					}
				}
				this.heldSkill = null;
			}
		}
	}

	protected void keyTyped(char key, int keyCode)
	{
		if ((keyCode == 1) || (keyCode == this.mc.gameSettings.keyBindInventory.keyCode))
			this.mc.thePlayer.closeScreen();
	}

	public void onGuiClosed()
	{
		this.heldSkill = null;
	}

	public boolean doesGuiPauseGame()
	{
		return false;
	}	
}