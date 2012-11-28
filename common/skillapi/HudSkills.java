package skillapi;

import java.util.Iterator;
import java.util.LinkedList;
import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

public class HudSkills
{
	private Minecraft game;
	public int skillGetTimer = 0;

	public HudSkills(Minecraft game) {
		this.game = game;
	}

	public void drawHUD(PlayerSkills player, int scaledWidth, int scaledHeight, float partialTicks) {
		GL11.glEnable(3042);
		GL11.glBlendFunc(770, 771);
		drawManaBar(player, scaledWidth, scaledHeight);
		drawSkillBar(player, scaledWidth, scaledHeight);
		drawChargeup(player, scaledWidth, scaledHeight);
		drawActiveSkills(player, scaledWidth, scaledHeight);
		drawSkillGet(player, scaledWidth, scaledHeight);
		GL11.glDisable(3042);
	}

	private void drawManaBar(PlayerSkills player, int scaledWidth, int scaledHeight)
	{
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		this.game.renderEngine.bindTexture(this.game.renderEngine.getTexture("/skillsgui.png"));
		for (int manaPip = 0; manaPip < 10; manaPip++) {
			int posY = scaledHeight - 39 - 10;
			int posX = scaledWidth / 2 + 10 + manaPip * 8;
			this.game.ingameGUI.drawTexturedModalRect(posX, posY, 104, 164, 9, 9);
			if (player.mana < player.prevMana) {
				if (manaPip * 2 + 1 < player.prevMana)
					this.game.ingameGUI.drawTexturedModalRect(posX, posY, 131, 164, 9, 9);
				if (manaPip * 2 + 1 == player.prevMana)
					this.game.ingameGUI.drawTexturedModalRect(posX, posY, 140, 164, 9, 9);
			}
			if (player.mana > 0)
			{
				if (manaPip * 2 + 1 < player.mana)
					this.game.ingameGUI.drawTexturedModalRect(posX, posY, 113, 164, 9, 9);
				if (manaPip * 2 + 1 == player.mana)
					this.game.ingameGUI.drawTexturedModalRect(posX, posY, 122, 164, 9, 9);
			}
		}
	}

	private void drawSkillBar(PlayerSkills player, int scaledWidth, int scaledHeight) {
		boolean isBarEmpty = true;
		for (Skill skill : player.skillBar)
			if (skill != null) {
				isBarEmpty = false;
				break;
			}
		if (isBarEmpty) {
			return;
		}

		for (int i = 0; i < player.skillBar.length; i++)
			if (player.skillBar[i] != null) {
				this.game.renderEngine.bindTexture(this.game.renderEngine.getTexture(player.skillBar[i].getTexturePath()));
				GL11.glScalef(0.0625F, 0.0625F, 1.0F);
				if (!player.skillBar[i].canPlayerUseSkill(player))
					GL11.glColor4f(0.4F, 0.4F, 0.4F, 1.0F);
				this.game.ingameGUI.drawTexturedModalRect((2 + 18 * i) * 16, 32, 0, 0, 256, 256);
				GL11.glScalef(16.0F, 16.0F, 1.0F);
				GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);

				this.game.renderEngine.bindTexture(this.game.renderEngine.getTexture("/skillsgui.png"));
				if (player.skillBar[i].cooldownFrame < 8)
					this.game.ingameGUI.drawTexturedModalRect(3 + 18 * i, 3, 240, player.skillBar[i].cooldownFrame * 14, 14, 14);
			}
	}

	private void drawChargeup(PlayerSkills player, int scaledWidth, int scaledHeight) {
		if (player.chargingSkill != null) {
			GL11.glBindTexture(3553, this.game.renderEngine.getTexture("/skillsgui.png"));
			this.game.ingameGUI.drawTexturedModalRect((scaledWidth - 104) / 2, scaledHeight - 70, 0, 155, 104, 10);
			this.game.ingameGUI.drawTexturedModalRect((scaledWidth - 100) / 2, scaledHeight - 69, 0, 165, player.chargeupFrame + 1, 8);
			this.game.fontRenderer.drawStringWithShadow(player.chargingSkill.getName(), (scaledWidth - this.game.fontRenderer.getStringWidth(player.chargingSkill.getName())) / 2, scaledHeight - 69, player.chargingSkill.getNameColour());
		}
	}

	private void drawActiveSkills(PlayerSkills player, int scaledWidth, int scaledHeight) {
		if (player.activeSkills.isEmpty()) {
			return;
		}

		Iterator itr = player.activeSkills.iterator();
		for (int i = 0; itr.hasNext(); i++) {
			int xOffset = (scaledWidth - 22 - (player.activeSkills.size() - 1) * 22) / 2 + 22 * i;
			Skill skill = (Skill)itr.next();
			GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
			GL11.glBindTexture(3553, this.game.renderEngine.getTexture("/skillsgui.png"));
			this.game.ingameGUI.drawTexturedModalRect(xOffset, 0, 218, 102, 22, 20);
			GL11.glBindTexture(3553, this.game.renderEngine.getTexture(skill.getTexturePath()));
			GL11.glScalef(0.0625F, 0.0625F, 1.0F);
			this.game.ingameGUI.drawTexturedModalRect((xOffset + 3) * 16, 32, 0, 0, 256, 256);
			GL11.glScalef(16.0F, 16.0F, 1.0F);
			this.game.fontRenderer.drawStringWithShadow(String.valueOf(skill.timeLeft), xOffset + 19 - this.game.fontRenderer.getStringWidth(String.valueOf(skill.timeLeft)), 10, 16777215);
		}
	}

	private void drawSkillGet(PlayerSkills player, int scaledWidth, int scaledHeight) 
	{
		if (player.skillJustLearnt != null)
			if (this.skillGetTimer-- > 0) {
				GL11.glColor4f(1.0F, 1.0F, 1.0F, 0.8F);
				GL11.glBindTexture(3553, this.game.renderEngine.getTexture("/skillsgui.png"));
				this.game.ingameGUI.drawTexturedModalRect(scaledWidth - 150, (scaledHeight - 32) / 2 + this.skillGetTimer % 50 - 50, 0, 173, 104, 32);
				GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
				GL11.glBindTexture(3553, this.game.renderEngine.getTexture(player.skillJustLearnt.getTexturePath()));
				GL11.glScalef(0.0625F, 0.0625F, 1.0F);
				this.game.ingameGUI.drawTexturedModalRect((scaledWidth - 140) * 16, ((scaledHeight - 16) / 2 + this.skillGetTimer % 50 - 50) * 16, 0, 0, 256, 256);
				GL11.glScalef(16.0F, 16.0F, 1.0F);
				this.game.fontRenderer.drawStringWithShadow("Skill Acquired:", scaledWidth - 120, (scaledHeight - 17) / 2 + this.skillGetTimer % 50 - 50, -256);
				this.game.fontRenderer.drawStringWithShadow(player.skillJustLearnt.getName(), scaledWidth - 120, (scaledHeight + 3) / 2 + this.skillGetTimer % 50 - 50, player.skillJustLearnt.getNameColour());
			} else {
				player.skillJustLearnt = null;
			}
	}
}