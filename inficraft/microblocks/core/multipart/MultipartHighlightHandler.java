package inficraft.microblocks.core.multipart;

import inficraft.microblocks.core.api.multipart.ICoverSystem;
import inficraft.microblocks.core.api.multipart.IMultipartTile;
import net.minecraft.client.renderer.RenderGlobal;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.EnumMovingObjectType;
import net.minecraft.util.MovingObjectPosition;
import net.minecraftforge.client.event.DrawBlockHighlightEvent;
import net.minecraftforge.event.ForgeSubscribe;

import org.lwjgl.opengl.GL11;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class MultipartHighlightHandler {

	@ForgeSubscribe(receiveCanceled = true)
	public void onBlockHighlightEvent(DrawBlockHighlightEvent evt) {
		if(onBlockHighlight(evt.context, evt.player, evt.target, evt.subID, evt.currentItem, evt.partialTicks))
			evt.setCanceled(true);
	}
	
	public boolean onBlockHighlight(RenderGlobal rg,
			EntityPlayer ply,
			MovingObjectPosition pos, int pass,
			ItemStack holding, float partialTick) {

		if(pos.typeOfHit != EnumMovingObjectType.TILE)
			return false;
		
		if(pass != 0)
			return false;
		
		boolean override = false;
		
		TileEntity te = ply.worldObj.getBlockTileEntity(pos.blockX, pos.blockY, pos.blockZ);
		AxisAlignedBB hitBB = null;
		ICoverSystem ci = null;
		if(te instanceof IMultipartTile)
		{
			IMultipartTile ict = (IMultipartTile)te;
			ci = ict.getCoverSystem();
			if(pos.subHit >= 0)
			{
				hitBB = ict.getPartAABBFromPool(pos.subHit);
			
			} else if(ci != null) {
				hitBB = ci.getPartAABBFromPool(-1 - pos.subHit);
			}
		}
		
		
		if(hitBB != null)
		{
			drawSelectionBox(ply, pos, 0, holding, partialTick, hitBB.offset(pos.blockX, pos.blockY, pos.blockZ));
			//drawBlockBreaking(rg, ply, pos, 0, holding, partialTick, hitBB);
			override = true;
		}
		
		return override;
	}
	
	private void drawOutlinedBoundingBox(AxisAlignedBB par1AxisAlignedBB)
    {
        Tessellator var2 = Tessellator.instance;
        var2.startDrawing(3);
        var2.addVertex(par1AxisAlignedBB.minX, par1AxisAlignedBB.minY, par1AxisAlignedBB.minZ);
        var2.addVertex(par1AxisAlignedBB.maxX, par1AxisAlignedBB.minY, par1AxisAlignedBB.minZ);
        var2.addVertex(par1AxisAlignedBB.maxX, par1AxisAlignedBB.minY, par1AxisAlignedBB.maxZ);
        var2.addVertex(par1AxisAlignedBB.minX, par1AxisAlignedBB.minY, par1AxisAlignedBB.maxZ);
        var2.addVertex(par1AxisAlignedBB.minX, par1AxisAlignedBB.minY, par1AxisAlignedBB.minZ);
        var2.draw();
        var2.startDrawing(3);
        var2.addVertex(par1AxisAlignedBB.minX, par1AxisAlignedBB.maxY, par1AxisAlignedBB.minZ);
        var2.addVertex(par1AxisAlignedBB.maxX, par1AxisAlignedBB.maxY, par1AxisAlignedBB.minZ);
        var2.addVertex(par1AxisAlignedBB.maxX, par1AxisAlignedBB.maxY, par1AxisAlignedBB.maxZ);
        var2.addVertex(par1AxisAlignedBB.minX, par1AxisAlignedBB.maxY, par1AxisAlignedBB.maxZ);
        var2.addVertex(par1AxisAlignedBB.minX, par1AxisAlignedBB.maxY, par1AxisAlignedBB.minZ);
        var2.draw();
        var2.startDrawing(1);
        var2.addVertex(par1AxisAlignedBB.minX, par1AxisAlignedBB.minY, par1AxisAlignedBB.minZ);
        var2.addVertex(par1AxisAlignedBB.minX, par1AxisAlignedBB.maxY, par1AxisAlignedBB.minZ);
        var2.addVertex(par1AxisAlignedBB.maxX, par1AxisAlignedBB.minY, par1AxisAlignedBB.minZ);
        var2.addVertex(par1AxisAlignedBB.maxX, par1AxisAlignedBB.maxY, par1AxisAlignedBB.minZ);
        var2.addVertex(par1AxisAlignedBB.maxX, par1AxisAlignedBB.minY, par1AxisAlignedBB.maxZ);
        var2.addVertex(par1AxisAlignedBB.maxX, par1AxisAlignedBB.maxY, par1AxisAlignedBB.maxZ);
        var2.addVertex(par1AxisAlignedBB.minX, par1AxisAlignedBB.minY, par1AxisAlignedBB.maxZ);
        var2.addVertex(par1AxisAlignedBB.minX, par1AxisAlignedBB.maxY, par1AxisAlignedBB.maxZ);
        var2.draw();
    }
	
	public void drawSelectionBox(EntityPlayer par1EntityPlayer, MovingObjectPosition par2MovingObjectPosition, int par3, ItemStack par4ItemStack, float par5, AxisAlignedBB box)
    {
        if (par3 == 0 && par2MovingObjectPosition.typeOfHit == EnumMovingObjectType.TILE)
        {
            GL11.glEnable(GL11.GL_BLEND);
            GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
            GL11.glColor4f(0.0F, 0.0F, 0.0F, 0.4F);
            GL11.glLineWidth(2.0F);
            GL11.glDisable(GL11.GL_TEXTURE_2D);
            GL11.glDepthMask(false);
            float var6 = 0.002F;
            
            double var8 = par1EntityPlayer.lastTickPosX + (par1EntityPlayer.posX - par1EntityPlayer.lastTickPosX) * (double)par5;
            double var10 = par1EntityPlayer.lastTickPosY + (par1EntityPlayer.posY - par1EntityPlayer.lastTickPosY) * (double)par5;
            double var12 = par1EntityPlayer.lastTickPosZ + (par1EntityPlayer.posZ - par1EntityPlayer.lastTickPosZ) * (double)par5;
            drawOutlinedBoundingBox(box.expand((double)var6, (double)var6, (double)var6).getOffsetBoundingBox(-var8, -var10, -var12));

            GL11.glDepthMask(true);
            GL11.glEnable(GL11.GL_TEXTURE_2D);
            GL11.glDisable(GL11.GL_BLEND);
        }
    }
	
	/*static void drawBlockBreaking(RenderGlobal rg, EntityPlayer ply, MovingObjectPosition pos, int pass, ItemStack holding, float f, AxisAlignedBB aabb)
	{
		Tessellator tessellator = Tessellator.instance;
        GL11.glEnable(GL11.GL_BLEND);
        if (rg.globalRenderBlocks.overrideBlockTexture > 0.0F)
        {
            GL11.glBlendFunc(774, 768);
            int j = rg.renderEngine.getTexture("/terrain.png");
            GL11.glBindTexture(GL11.GL_TEXTURE_2D, j);
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 0.5F);
            GL11.glPushMatrix();
            GL11.glPolygonOffset(-3F, -3F);
            GL11.glEnable(GL11.GL_POLYGON_OFFSET_FILL);
            double d = ply.lastTickPosX + (ply.posX - ply.lastTickPosX) * (double)f;
            double d1 = ply.lastTickPosY + (ply.posY - ply.lastTickPosY) * (double)f;
            double d2 = ply.lastTickPosZ + (ply.posZ - ply.lastTickPosZ) * (double)f;
            GL11.glEnable(GL11.GL_ALPHA_TEST);
            tessellator.startDrawingQuads();
            tessellator.setTranslation(pos.blockX-d, pos.blockY-d1, pos.blockZ-d2);
            tessellator.disableColor();
            int tex = 240 + (int)(rg.damagePartialTime * 10F);
            CoversNonSharedProxy.renderAABB(tessellator, aabb, new int[] {tex, tex, tex, tex, tex, tex});
            tessellator.draw();
            tessellator.setTranslation(0.0D, 0.0D, 0.0D);
            GL11.glDisable(GL11.GL_ALPHA_TEST);
            GL11.glPolygonOffset(0.0F, 0.0F);
            GL11.glDisable(GL11.GL_POLYGON_OFFSET_FILL);
            GL11.glPopMatrix();
        }
        GL11.glDisable(GL11.GL_BLEND);
	}*/
}
