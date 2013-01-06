package inficraft.toolconstruct.client;

import inficraft.toolconstruct.EnumMaterial;
import inficraft.toolconstruct.blocks.ToolStationContainer;
import inficraft.toolconstruct.blocks.ToolStationLogic;
import inficraft.toolconstruct.tools.ToolCore;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiTextField;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.StatCollector;

import org.lwjgl.opengl.GL11;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class ToolStationGui extends GuiContainer
{
	ToolStationLogic logic;
	ToolStationContainer toolSlots;
	GuiTextField text;
	String toolName;
	int guiType;
	int[] slotX, slotY, iconX, iconY;
	String title, body = "";

	public ToolStationGui(InventoryPlayer inventoryplayer, ToolStationLogic stationlogic)
	{
		super(stationlogic.getGuiContainer(inventoryplayer));
		this.logic = stationlogic;
		toolSlots = (ToolStationContainer) inventorySlots;
		text = new GuiTextField(this.fontRenderer, this.xSize / 2 - 5, 8, 30, 12);
		this.text.setMaxStringLength(40);
		this.text.setEnableBackgroundDrawing(false);
		this.text.setVisible(true);
		this.text.setCanLoseFocus(false);
		this.text.setFocused(true);
		this.text.setTextColor(16777215);

		resetGui();
	}

	void resetGui ()
	{
		this.text.setText("");
		toolSlots.setToolName("");
		guiType = 1;
		setSlotType(1);
		iconX = new int[] { 0, 1, 2 };
		iconY = new int[] { 13, 13, 13 };
		title = "\u00A7nRepair and Modification";
		body = "The main way to repair or change your tools. Place a tool in the large slot to get started.\n\nThis window not done yet, stay tuned.";
	}

	public void initGui ()
	{
		super.initGui();
		int cornerX = (this.width - this.xSize) / 2;
		int cornerY = (this.height - this.ySize) / 2;

		this.controlList.clear();
		GuiButtonTool button = new GuiButtonTool(1, cornerX - 110, cornerY, 3, 0); // Repair
		button.enabled = false;
		this.controlList.add(button);

		this.controlList.add(new GuiButtonTool(2, cornerX - 88, cornerY, 4, 0)); //Pickaxe
		this.controlList.add(new GuiButtonTool(3, cornerX - 66, cornerY, 5, 0)); //Shovel
		this.controlList.add(new GuiButtonTool(4, cornerX - 44, cornerY, 6, 0)); //Axe
		this.controlList.add(new GuiButtonTool(5, cornerX - 22, cornerY, 7, 0)); //Ice Axe
		this.controlList.add(new GuiButtonTool(6, cornerX - 110, cornerY + 22, 8, 0)); //Mattock
		this.controlList.add(new GuiButtonTool(7, cornerX - 88, cornerY + 22, 0, 1)); //Broadsword
		this.controlList.add(new GuiButtonTool(8, cornerX - 66, cornerY + 22, 1, 1)); //Longsword
		this.controlList.add(new GuiButtonTool(9, cornerX - 44, cornerY + 22, 2, 1)); //Rapier
		this.controlList.add(new GuiButtonTool(10, cornerX - 22, cornerY + 22, 3, 1)); //Frypan
		this.controlList.add(new GuiButtonTool(11, cornerX - 110, cornerY + 44, 4, 1)); //Battlesign
	}

	protected void actionPerformed (GuiButton button)
	{
		((GuiButton) this.controlList.get(guiType - 1)).enabled = true;
		guiType = button.id;
		button.enabled = false;

		switch (button.id)
		{
		case 1: // Repair
			setSlotType(1);
			iconX = new int[] { 0, 1, 2 };
			iconY = new int[] { 13, 13, 13 };
			title = "\u00A7nRepair and Modification";
			body = "The main way to repair or change your tools. Place a tool and a material on the left to get started.";
			break;
		case 2: // Pickaxe
			setSlotType(2);
			iconX = new int[] { 0, 0, 1 };
			iconY = new int[] { 2, 3, 3 };
			title = "\u00A7nPickaxe";
			body = "The Pickaxe is a basic stone mining tool. It is effective on stone and ores.\n\nRequired parts:\n- Pickaxe Head\n- Tool Binding\n- Handle";
			break;
		case 3: // Shovel
			setSlotType(3);
			iconX = new int[] { 3, 0, 13 };
			iconY = new int[] { 2, 3, 13 };
			title = "\u00A7nShovel";
			body = "The Shovel is a basic digging tool. It is effective on dirt and sand.\n\nRequired parts:\n- Shovel Head\n- Handle";
			break;
		case 4: // Axe
			setSlotType(3);
			iconX = new int[] { 2, 0, 13 };
			iconY = new int[] { 2, 3, 13 };
			title = "\u00A7nAxe";
			body = "The Axe is a basic chopping tool. It is effective on wood and leaves.\n\nRequired parts:\n- Axe Head\n- Handle";
			break;
		case 5: // Ice Axe
			setSlotType(2);
			iconX = new int[] { 0, 0, 5 };
			iconY = new int[] { 2, 3, 3 };
			title = "\u00A7nIce Axe";
			body = "The Ice Axe is a tool for harvesting ice, mining, and attacking foes.\n\n<Not available>";
			//body = "The Ice Axe is a tool for harvesting ice, mining, and attacking foes.\n\nSpecial Ability:\n- Wall Climb\nNatural Ability:\n- Ice Harvest\nDamage: Moderate\n\nRequired parts:\n- Pickaxe Head\n- Spike\n- Handle";
			break;
		case 6: // Mattock
			setSlotType(4);
			iconX = new int[] { 2, 0, 3 };
			iconY = new int[] { 2, 3, 2 };
			title = "\u00A7nMattock";
			body = "The Cutter Mattock is a multi-use tool.\n\n<Not available>";
			//body = "The Cutter Mattock is a multi-use tool. It is effective on wood, leaves, dirt, and sand.\n\nSpecial Ability: Hoe\n\nRequired parts:\n- Axe Head\n- Shovel Head\n- Handle";
			break;
		case 7: // Broadsword
			setSlotType(2);
			iconX = new int[] { 1, 0, 2 };
			iconY = new int[] { 2, 3, 3 };
			title = "\u00A7nBroadsword";
			body = "The Broadsword is a defensive weapon. Blocking cuts damage in half.\n\nSpecial Ability: Block\nDamage: Moderate\nDurability: High\n\nRequired parts:\n- Sword Blade\n- Large Guard\n- Handle";
			break;
		case 8: // Fencing Sword
			setSlotType(2);
			iconX = new int[] { 1, 0, 3 };
			iconY = new int[] { 2, 3, 3 };
			title = "\u00A7nLongsword";
			body = "The Longsword is a balanced weapon. It is useful for knocking enemies away or getting in and out of battle quickly.\n\nSpecial Ability: Lunge\nDamage: Moderate\nDurability: Moderate\n\nRequired parts:\n- Sword Blade\n- Medium Guard\n- Handle";
			break;
		case 9: // Rapier
			setSlotType(2);
			iconX = new int[] { 1, 0, 4 };
			iconY = new int[] { 2, 3, 3 };
			title = "\u00A7nRapier";
			body = "The Rapier is an offensive weapon that relies on quick strikes to defeat foes.\n\nNatural Abilities:\n- Armor Pierce\n- Zero damage delay\nDamage: High\nDurability: Low\n\nRequired parts:\n- Sword Blade\n- Crossbar\n- Handle";
			break;
		case 10: // Frypan
			setSlotType(3);
			iconX = new int[] { 4, 0, 13 };
			iconY = new int[] { 2, 3, 13 };
			title = "\u00A7nFrying Pan";
			body = "The Frying is a heavy weapon that uses sheer weight to stun foes.\n\nSpecial Ability: Block\nNatural Ability: Bash\nDamage: High\nDurability: High\n\nRequired parts:\n- Pan\n- Handle";
			break;
		case 11: // Battlesign
			setSlotType(3);
			iconX = new int[] { 5, 0, 13 };
			iconY = new int[] { 2, 3, 13 };
			title = "\u00A7nBattlesign";
			body = "The Battlesign is an advance in weapon technology worthy of Zombie Pigmen everywhere.\n\nSpecial Ability: Block\nShift-rClick: Place sign\nDamage: Low\nDurability: Average\n\nRequired parts:\n- Board\n- Handle";
			break;
		}
	}

	void setSlotType (int type)
	{
		switch (type)
		{
		case 1:
			slotX = new int[] { 56, 38, 38 }; // Repair
			slotY = new int[] { 37, 28, 46 };
			break;
		case 2:
			slotX = new int[] { 56, 56, 56 }; // Three parts
			slotY = new int[] { 19, 55, 37 };
			break;
		case 3:
			slotX = new int[] { 56, 56, 14 }; // Two parts
			slotY = new int[] { 28, 46, 37 };
			break;
		case 4:
			slotX = new int[] { 38, 47, 56 }; // Double head
			slotY = new int[] { 28, 46, 28 };
			break;
		case 5:
			slotX = new int[] { 47, 47, 38, 56 }; // Four parts
			slotY = new int[] { 19, 55, 37, 37 };
			break;
		}
		toolSlots.resetSlots(slotX, slotY);
	}

	public void updateScreen ()
	{
		super.updateScreen();
		this.text.updateCursorCounter();
	}

	/**
	 * Draw the foreground layer for the GuiContainer (everything in front of the items)
	 */
	protected void drawGuiContainerForegroundLayer (int par1, int par2)
	{
		this.fontRenderer.drawString(StatCollector.translateToLocal("crafters.ToolStation"), 6, 6, 4210752);
		this.fontRenderer.drawString(StatCollector.translateToLocal("container.inventory"), 8, this.ySize - 96 + 2, 4210752);
		this.fontRenderer.drawString(toolName, this.xSize / 2 - 5, 8, 0);

		if (logic.isStackInSlot(0))
			drawToolStats();
		else
			drawToolInformation();
	}

	void drawToolStats ()
	{
		ItemStack stack = logic.getStackInSlot(0);
		ToolCore tool = (ToolCore) stack.getItem();
		NBTTagCompound tags = stack.getTagCompound().getCompoundTag("InfiTool");
		this.drawCenteredString(fontRenderer, "\u00A7n"+tool.getToolName(), xSize + 63, 8, 16777215);
		int dur = tags.getInteger("Damage");
		int maxDur = tags.getInteger("TotalDurability");
		dur = maxDur - dur;
		fontRenderer.drawString("Durability: " + dur + "/" + maxDur, xSize + 8, 24, 16777215);
		int damage = tags.getInteger("Attack");
		fontRenderer.drawString("Damage: " + damage, xSize + 8, 36, 16777215);
		int head = tags.getInteger("Head");
		fontRenderer.drawString("Mining Speed: " + tags.getFloat("MiningSpeed"), xSize + 8, 48, 16777215);
		fontRenderer.drawString("Mining Level: " + getHarvestLevelName(tags.getInteger("HarvestLevel")), xSize + 8, 60, 16777215);

		fontRenderer.drawString("Modifiers remaining: " + tags.getInteger("Modifiers"), xSize + 8, 80, 16777215);
	}

	void drawToolInformation ()
	{
		this.drawCenteredString(fontRenderer, title, xSize + 63, 8, 16777215);
		fontRenderer.drawSplitString(body, xSize + 8, 24, 115, 16777215);
	}

	String getHarvestLevelName (int num)
	{
		switch (num)
		{
		case 0:
			return "Stone";
		case 1:
			return "Iron";
		case 2:
			return "Redstone";
		case 3:
			return "Obsidian";
		default:
			return String.valueOf(num);
			//return "More data required";
		}
	}

	/**
	 * Draw the background layer for the GuiContainer (everything behind the items)
	 */
	protected void drawGuiContainerBackgroundLayer (float par1, int par2, int par3)
	{
		// Draw the background
		int texID = this.mc.renderEngine.getTexture("/infitextures/gui/toolstation.png");
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		this.mc.renderEngine.bindTexture(texID);
		int cornerX = (this.width - this.xSize) / 2;
		int cornerY = (this.height - this.ySize) / 2;
		this.drawTexturedModalRect(cornerX, cornerY, 0, 0, this.xSize, this.ySize);

		texID = this.mc.renderEngine.getTexture("/infitextures/gui/icons.png");
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		this.mc.renderEngine.bindTexture(texID);
		// Draw the slots

		for (int i = 0; i < slotX.length; i++)
		{
			this.drawTexturedModalRect(cornerX + slotX[i], cornerY + slotY[i], 0, 0, 18, 18);
			if (!logic.isStackInSlot(i + 1))
			{
				this.drawTexturedModalRect(cornerX + slotX[i], cornerY + slotY[i], 18 * iconX[i], 18 * iconY[i], 18, 18);
			}
		}

		// Draw description
		texID = this.mc.renderEngine.getTexture("/infitextures/gui/description.png");
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		this.mc.renderEngine.bindTexture(texID);
		cornerX = (this.width + this.xSize) / 2;
		cornerY = (this.height - this.ySize) / 2;
		this.drawTexturedModalRect(cornerX, cornerY, 0, 0, this.xSize, this.ySize);
	}

	protected void keyTyped (char par1, int keyCode)
	{
		text.textboxKeyTyped(par1, keyCode);
		toolName = text.getText().trim();
		toolSlots.setToolName(toolName);

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
