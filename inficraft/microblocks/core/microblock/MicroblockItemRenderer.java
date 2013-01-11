package inficraft.microblocks.core.microblock;

import inficraft.microblocks.core.api.microblock.PartType;
import net.minecraft.client.renderer.RenderBlocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.ForgeHooksClient;
import net.minecraftforge.client.IItemRenderer;

import org.lwjgl.opengl.GL11;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class MicroblockItemRenderer implements IItemRenderer {

	@Override
	public boolean handleRenderType(ItemStack item, ItemRenderType type) {
		switch(type) {
		case ENTITY: return true;
		case EQUIPPED: return true;
		case INVENTORY: return true;
		default: return false;
		}
	}

	@Override
	public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item, ItemRendererHelper helper) {
		switch(helper) {
		case ENTITY_BOBBING: return true;
		case ENTITY_ROTATION: return true;
		case BLOCK_3D: return true;
		case EQUIPPED_BLOCK: return true;
		case INVENTORY_BLOCK: return true;
		default: return false;
		}
	}

	@Override
	public void renderItem(ItemRenderType type, ItemStack item, Object... data) {
		int typen = ItemMicroblock.getPartID(item);
		PartType pt = MicroblockSystem.parts.get(typen);
		//System.out.println(type+", "+typen+", "+pt);
		if(pt == null)
			return;
		
		boolean customTex = !pt.texfile.equals("/terrain.png");
		
		if(customTex)
			ForgeHooksClient.bindTexture(pt.texfile, 0);
		
		switch(type) {
		case INVENTORY:
		case EQUIPPED:
			MicroblockRenderer.renderPartInv((RenderBlocks)data[0], pt);
			break;
		case ENTITY:
			GL11.glTranslatef(-0.5f, -0.5f, -0.5f);
			MicroblockRenderer.renderPartInv((RenderBlocks)data[0], pt);
			GL11.glTranslatef(0.5f, 0.5f, 0.5f);
			break;
		}
		
		if(customTex)
			ForgeHooksClient.unbindTexture();
	}

}
