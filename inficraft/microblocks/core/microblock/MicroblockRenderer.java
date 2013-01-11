package inficraft.microblocks.core.microblock;

import inficraft.microblocks.core.api.microblock.EnumAxisPosition;
import inficraft.microblocks.core.api.microblock.EnumPartClass;
import inficraft.microblocks.core.api.microblock.EnumPosition;
import inficraft.microblocks.core.api.microblock.Part;
import inficraft.microblocks.core.api.microblock.PartType;
import inficraft.microblocks.core.api.util.Dir;
import net.minecraft.client.renderer.RenderBlocks;
import net.minecraft.client.renderer.RenderGlobal;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.util.AxisAlignedBB;
import net.minecraftforge.client.ForgeHooksClient;

import org.lwjgl.opengl.GL11;

public class MicroblockRenderer {
	private static double u, v;
	private static int[] textures;
	private static double size;
	private static void setTex(int tex)
	{
		u = (tex % 16) / 16.0;
		v = ((tex / 16) + 1) / 16.0;
	}
	
	private static void vertXY(Tessellator t, double x, double y, double z) {	
		t.addVertexWithUV(x, y, z, u+x/16.0, v-y/16.0);
	}
	
	private static void vertXZ(Tessellator t, double x, double y, double z) {	
		t.addVertexWithUV(x, y, z, u+x/16.0, v-z/16.0);
	}
	
	private static void vertYZ(Tessellator t, double x, double y, double z) {	
		t.addVertexWithUV(x, y, z, u+z/16.0, v-y/16.0);
	}
	
	public static void renderPartPreview(RenderGlobal render, EnumPosition pos, PartType p) {
		size = p.size; textures = p.textures;
		GL11.glEnable(GL11.GL_BLEND);
		GL11.glColor4f(1.0f, 1.0f, 1.0f, 0.5f);
		
		boolean customTex = !p.texfile.equals("/terrain.png");
		
		if(customTex)
			ForgeHooksClient.bindTexture(p.texfile, 0);

		Tessellator t = Tessellator.instance;
		t.startDrawingQuads();
		
		renderQuads(t, pos, p);
		
		t.draw();
		
		if(customTex)
			ForgeHooksClient.unbindTexture();
		
		GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
		GL11.glDisable(GL11.GL_BLEND);
	}
	
	private static final double HOLLOW_EDGE_SIZE = 0.25;
	
	private static void renderHollowPanelYZ(Tessellator t, AxisAlignedBB aabb) {
		setTex(textures[Dir.NX]);
		t.setNormal(-1, 0, 0);
		
		vertYZ(t, aabb.minX, 0+HOLLOW_EDGE_SIZE, HOLLOW_EDGE_SIZE);
		vertYZ(t, aabb.minX, 1-HOLLOW_EDGE_SIZE, HOLLOW_EDGE_SIZE);
		vertYZ(t, aabb.minX, 1, 0);
		vertYZ(t, aabb.minX, 0, 0);
		
		vertYZ(t, aabb.minX, 0, 1);
		vertYZ(t, aabb.minX, 1, 1);
		vertYZ(t, aabb.minX, 1-HOLLOW_EDGE_SIZE, 1-HOLLOW_EDGE_SIZE);
		vertYZ(t, aabb.minX, HOLLOW_EDGE_SIZE, 1-HOLLOW_EDGE_SIZE);
		
		vertYZ(t, aabb.minX, 0, 1);
		vertYZ(t, aabb.minX, HOLLOW_EDGE_SIZE, 1-HOLLOW_EDGE_SIZE);
		vertYZ(t, aabb.minX, HOLLOW_EDGE_SIZE, HOLLOW_EDGE_SIZE);
		vertYZ(t, aabb.minX, 0, 0);
		
		vertYZ(t, aabb.minX, 1, 0);
		vertYZ(t, aabb.minX, 1-HOLLOW_EDGE_SIZE, HOLLOW_EDGE_SIZE);
		vertYZ(t, aabb.minX, 1-HOLLOW_EDGE_SIZE, 1-HOLLOW_EDGE_SIZE);
		vertYZ(t, aabb.minX, 1, 1);
		
		setTex(textures[Dir.PX]);
		t.setNormal(1, 0, 0);
		
		vertYZ(t, aabb.maxX, 0, 0);
		vertYZ(t, aabb.maxX, 1, 0);
		vertYZ(t, aabb.maxX, 1-HOLLOW_EDGE_SIZE, HOLLOW_EDGE_SIZE);
		vertYZ(t, aabb.maxX, HOLLOW_EDGE_SIZE, HOLLOW_EDGE_SIZE);
		
		vertYZ(t, aabb.maxX, HOLLOW_EDGE_SIZE, 1-HOLLOW_EDGE_SIZE);
		vertYZ(t, aabb.maxX, 1-HOLLOW_EDGE_SIZE, 1-HOLLOW_EDGE_SIZE);
		vertYZ(t, aabb.maxX, 1, 1);
		vertYZ(t, aabb.maxX, 0, 1);
		
		vertYZ(t, aabb.maxX, 0, 0);
		vertYZ(t, aabb.maxX, HOLLOW_EDGE_SIZE, 0+HOLLOW_EDGE_SIZE);
		vertYZ(t, aabb.maxX, HOLLOW_EDGE_SIZE, 1-HOLLOW_EDGE_SIZE);
		vertYZ(t, aabb.maxX, 0, 1);
		
		vertYZ(t, aabb.maxX, 1, 1);
		vertYZ(t, aabb.maxX, 1-HOLLOW_EDGE_SIZE, 1-HOLLOW_EDGE_SIZE);
		vertYZ(t, aabb.maxX, 1-HOLLOW_EDGE_SIZE, HOLLOW_EDGE_SIZE);
		vertYZ(t, aabb.maxX, 1, 0);
		
		setTex(textures[Dir.NY]);
		t.setNormal(0, -1, 0);
		vertXZ(t, aabb.minX, 0, 0);
		vertXZ(t, aabb.maxX, 0, 0);
		vertXZ(t, aabb.maxX, 0, 1);
		vertXZ(t, aabb.minX, 0, 1);
		
		vertXZ(t, aabb.minX, HOLLOW_EDGE_SIZE, 1-HOLLOW_EDGE_SIZE);
		vertXZ(t, aabb.maxX, HOLLOW_EDGE_SIZE, 1-HOLLOW_EDGE_SIZE);
		vertXZ(t, aabb.maxX, HOLLOW_EDGE_SIZE, HOLLOW_EDGE_SIZE);
		vertXZ(t, aabb.minX, HOLLOW_EDGE_SIZE, HOLLOW_EDGE_SIZE);
		
		setTex(textures[Dir.PY]);
		t.setNormal(0, 1, 0);
		vertXZ(t, aabb.minX, 1, 1);
		vertXZ(t, aabb.maxX, 1, 1);
		vertXZ(t, aabb.maxX, 1, 0);
		vertXZ(t, aabb.minX, 1, 0);
		
		vertXZ(t, aabb.minX, 1-HOLLOW_EDGE_SIZE, HOLLOW_EDGE_SIZE);
		vertXZ(t, aabb.maxX, 1-HOLLOW_EDGE_SIZE, HOLLOW_EDGE_SIZE);
		vertXZ(t, aabb.maxX, 1-HOLLOW_EDGE_SIZE, 1-HOLLOW_EDGE_SIZE);
		vertXZ(t, aabb.minX, 1-HOLLOW_EDGE_SIZE, 1-HOLLOW_EDGE_SIZE);
		
		setTex(textures[Dir.NZ]);
		t.setNormal(0, 0, -1);
		vertXY(t, aabb.minX, 0, 0);
		vertXY(t, aabb.minX, 1, 0);
		vertXY(t, aabb.maxX, 1, 0);
		vertXY(t, aabb.maxX, 0, 0);
		
		vertXY(t, aabb.minX, 1-HOLLOW_EDGE_SIZE, HOLLOW_EDGE_SIZE);
		vertXY(t, aabb.minX, HOLLOW_EDGE_SIZE, HOLLOW_EDGE_SIZE);
		vertXY(t, aabb.maxX, HOLLOW_EDGE_SIZE, HOLLOW_EDGE_SIZE);
		vertXY(t, aabb.maxX, 1-HOLLOW_EDGE_SIZE, HOLLOW_EDGE_SIZE);
		
		setTex(textures[Dir.PZ]);
		t.setNormal(0, 0, 1);
		vertXY(t, aabb.minX, 1, 1);
		vertXY(t, aabb.minX, 0, 1);
		vertXY(t, aabb.maxX, 0, 1);
		vertXY(t, aabb.maxX, 1, 1);
		
		vertXY(t, aabb.minX, HOLLOW_EDGE_SIZE, 1-HOLLOW_EDGE_SIZE);
		vertXY(t, aabb.minX, 1-HOLLOW_EDGE_SIZE, 1-HOLLOW_EDGE_SIZE);
		vertXY(t, aabb.maxX, 1-HOLLOW_EDGE_SIZE, 1-HOLLOW_EDGE_SIZE);
		vertXY(t, aabb.maxX, HOLLOW_EDGE_SIZE, 1-HOLLOW_EDGE_SIZE);
	}
	
	private static void renderHollowPanelXZ(Tessellator t, AxisAlignedBB aabb) {
		setTex(textures[Dir.NY]);
		t.setNormal(0, -1, 0);
		vertXZ(t, HOLLOW_EDGE_SIZE, aabb.minY, HOLLOW_EDGE_SIZE);
		vertXZ(t, HOLLOW_EDGE_SIZE, aabb.minY, 1-HOLLOW_EDGE_SIZE);
		vertXZ(t, 0, aabb.minY, 1);
		vertXZ(t, 0, aabb.minY, 0);
		
		vertXZ(t, 1-HOLLOW_EDGE_SIZE, aabb.minY, 1-HOLLOW_EDGE_SIZE);
		vertXZ(t, 1-HOLLOW_EDGE_SIZE, aabb.minY, HOLLOW_EDGE_SIZE);
		vertXZ(t, 1, aabb.minY, 0);
		vertXZ(t, 1, aabb.minY, 1);
		
		vertXZ(t, 0, aabb.minY, 0);
		vertXZ(t, 1, aabb.minY, 0);
		vertXZ(t, 1-HOLLOW_EDGE_SIZE, aabb.minY, HOLLOW_EDGE_SIZE);
		vertXZ(t, HOLLOW_EDGE_SIZE, aabb.minY, HOLLOW_EDGE_SIZE);
		
		vertXZ(t, HOLLOW_EDGE_SIZE, aabb.minY, 1-HOLLOW_EDGE_SIZE);
		vertXZ(t, 1-HOLLOW_EDGE_SIZE, aabb.minY, 1-HOLLOW_EDGE_SIZE);
		vertXZ(t, 1, aabb.minY, 1);
		vertXZ(t, 0, aabb.minY, 1);
		
		setTex(textures[Dir.PY]);
		t.setNormal(0, 1, 0);
		vertXZ(t, 0, aabb.maxY, 0);
		vertXZ(t, 0, aabb.maxY, 1);
		vertXZ(t, HOLLOW_EDGE_SIZE, aabb.maxY, 1-HOLLOW_EDGE_SIZE);
		vertXZ(t, HOLLOW_EDGE_SIZE, aabb.maxY, HOLLOW_EDGE_SIZE);
		
		vertXZ(t, 1, aabb.maxY, 1);
		vertXZ(t, 1, aabb.maxY, 0);
		vertXZ(t, 1-HOLLOW_EDGE_SIZE, aabb.maxY, HOLLOW_EDGE_SIZE);
		vertXZ(t, 1-HOLLOW_EDGE_SIZE, aabb.maxY, 1-HOLLOW_EDGE_SIZE);
		
		vertXZ(t, HOLLOW_EDGE_SIZE, aabb.maxY, HOLLOW_EDGE_SIZE);
		vertXZ(t, 1-HOLLOW_EDGE_SIZE, aabb.maxY, HOLLOW_EDGE_SIZE);
		vertXZ(t, 1, aabb.maxY, 0);
		vertXZ(t, 0, aabb.maxY, 0);
		
		vertXZ(t, 0, aabb.maxY, 1);
		vertXZ(t, 1, aabb.maxY, 1);
		vertXZ(t, 1-HOLLOW_EDGE_SIZE, aabb.maxY, 1-HOLLOW_EDGE_SIZE);
		vertXZ(t, HOLLOW_EDGE_SIZE, aabb.maxY, 1-HOLLOW_EDGE_SIZE);
		
		setTex(textures[Dir.NX]);
		t.setNormal(-1, 0, 0);
		vertYZ(t, 0, aabb.minY, 0);
		vertYZ(t, 0, aabb.minY, 1);
		vertYZ(t, 0, aabb.maxY, 1);
		vertYZ(t, 0, aabb.maxY, 0);
		
		vertYZ(t, HOLLOW_EDGE_SIZE, aabb.minY, 1-HOLLOW_EDGE_SIZE);
		vertYZ(t, HOLLOW_EDGE_SIZE, aabb.minY, HOLLOW_EDGE_SIZE);
		vertYZ(t, HOLLOW_EDGE_SIZE, aabb.maxY, HOLLOW_EDGE_SIZE);
		vertYZ(t, HOLLOW_EDGE_SIZE, aabb.maxY, 1-HOLLOW_EDGE_SIZE);
		
		setTex(textures[Dir.PX]);
		t.setNormal(1, 0, 0);
		vertYZ(t, 1, aabb.minY, 1);
		vertYZ(t, 1, aabb.minY, 0);
		vertYZ(t, 1, aabb.maxY, 0);
		vertYZ(t, 1, aabb.maxY, 1);
		
		vertYZ(t, 1-HOLLOW_EDGE_SIZE, aabb.maxY, 1-HOLLOW_EDGE_SIZE);
		vertYZ(t, 1-HOLLOW_EDGE_SIZE, aabb.maxY, HOLLOW_EDGE_SIZE);
		vertYZ(t, 1-HOLLOW_EDGE_SIZE, aabb.minY, HOLLOW_EDGE_SIZE);
		vertYZ(t, 1-HOLLOW_EDGE_SIZE, aabb.minY, 1-HOLLOW_EDGE_SIZE);
		
		setTex(textures[Dir.NZ]);
		t.setNormal(0, 0, -1);
		vertXY(t, 0, aabb.minY, 0);
		vertXY(t, 0, aabb.maxY, 0);
		vertXY(t, 1, aabb.maxY, 0);
		vertXY(t, 1, aabb.minY, 0);
		
		vertXY(t, 1-HOLLOW_EDGE_SIZE, aabb.minY, HOLLOW_EDGE_SIZE);
		vertXY(t, 1-HOLLOW_EDGE_SIZE, aabb.maxY, HOLLOW_EDGE_SIZE);
		vertXY(t, HOLLOW_EDGE_SIZE, aabb.maxY, HOLLOW_EDGE_SIZE);
		vertXY(t, HOLLOW_EDGE_SIZE, aabb.minY, HOLLOW_EDGE_SIZE);
		
		setTex(textures[Dir.PZ]);
		t.setNormal(0, 0, 1);
		vertXY(t, 1, aabb.minY, 1);
		vertXY(t, 1, aabb.maxY, 1);
		vertXY(t, 0, aabb.maxY, 1);
		vertXY(t, 0, aabb.minY, 1);
		
		vertXY(t, HOLLOW_EDGE_SIZE, aabb.minY, 1-HOLLOW_EDGE_SIZE);
		vertXY(t, HOLLOW_EDGE_SIZE, aabb.maxY, 1-HOLLOW_EDGE_SIZE);
		vertXY(t, 1-HOLLOW_EDGE_SIZE, aabb.maxY, 1-HOLLOW_EDGE_SIZE);
		vertXY(t, 1-HOLLOW_EDGE_SIZE, aabb.minY, 1-HOLLOW_EDGE_SIZE);
	}
		
	private static void renderHollowPanelXY(Tessellator t, AxisAlignedBB aabb) {
		setTex(textures[Dir.NZ]);
		t.setNormal(0, 0, -1);
		vertXY(t, 0, 0, aabb.minZ);
		vertXY(t, 0, 1, aabb.minZ);
		vertXY(t, HOLLOW_EDGE_SIZE, 1-HOLLOW_EDGE_SIZE, aabb.minZ);
		vertXY(t, HOLLOW_EDGE_SIZE, HOLLOW_EDGE_SIZE, aabb.minZ);
		
		vertXY(t, 1, 1, aabb.minZ);
		vertXY(t, 1, 0, aabb.minZ);
		vertXY(t, 1-HOLLOW_EDGE_SIZE, HOLLOW_EDGE_SIZE, aabb.minZ);
		vertXY(t, 1-HOLLOW_EDGE_SIZE, 1-HOLLOW_EDGE_SIZE, aabb.minZ);
		
		vertXY(t, HOLLOW_EDGE_SIZE, HOLLOW_EDGE_SIZE, aabb.minZ);
		vertXY(t, 1-HOLLOW_EDGE_SIZE, HOLLOW_EDGE_SIZE, aabb.minZ);
		vertXY(t, 1, 0, aabb.minZ);
		vertXY(t, 0, 0, aabb.minZ);
		
		vertXY(t, 0, 1, aabb.minZ);
		vertXY(t, 1, 1, aabb.minZ);
		vertXY(t, 1-HOLLOW_EDGE_SIZE, 1-HOLLOW_EDGE_SIZE, aabb.minZ);
		vertXY(t, HOLLOW_EDGE_SIZE, 1-HOLLOW_EDGE_SIZE, aabb.minZ);
		
		setTex(textures[Dir.PZ]);
		t.setNormal(0, 0, 1);
		vertXY(t, HOLLOW_EDGE_SIZE, HOLLOW_EDGE_SIZE, aabb.maxZ);
		vertXY(t, HOLLOW_EDGE_SIZE, 1-HOLLOW_EDGE_SIZE, aabb.maxZ);
		vertXY(t, 0, 1, aabb.maxZ);
		vertXY(t, 0, 0, aabb.maxZ);
		
		vertXY(t, 1-HOLLOW_EDGE_SIZE, 1-HOLLOW_EDGE_SIZE, aabb.maxZ);
		vertXY(t, 1-HOLLOW_EDGE_SIZE, HOLLOW_EDGE_SIZE, aabb.maxZ);
		vertXY(t, 1, 0, aabb.maxZ);
		vertXY(t, 1, 1, aabb.maxZ);
		
		vertXY(t, 0, 0, aabb.maxZ);
		vertXY(t, 1, 0, aabb.maxZ);
		vertXY(t, 1-HOLLOW_EDGE_SIZE, HOLLOW_EDGE_SIZE, aabb.maxZ);
		vertXY(t, HOLLOW_EDGE_SIZE, HOLLOW_EDGE_SIZE, aabb.maxZ);
		
		vertXY(t, HOLLOW_EDGE_SIZE, 1-HOLLOW_EDGE_SIZE, aabb.maxZ);
		vertXY(t, 1-HOLLOW_EDGE_SIZE, 1-HOLLOW_EDGE_SIZE, aabb.maxZ);
		vertXY(t, 1, 1, aabb.maxZ);
		vertXY(t, 0, 1, aabb.maxZ);
		
		setTex(textures[Dir.NX]);
		t.setNormal(-1, 0, 0);
		vertYZ(t, 0, 1, aabb.minZ);
		vertYZ(t, 0, 0, aabb.minZ);
		vertYZ(t, 0, 0, aabb.maxZ);
		vertYZ(t, 0, 1, aabb.maxZ);
		
		vertYZ(t, HOLLOW_EDGE_SIZE, HOLLOW_EDGE_SIZE, aabb.minZ);
		vertYZ(t, HOLLOW_EDGE_SIZE, 1-HOLLOW_EDGE_SIZE, aabb.minZ);
		vertYZ(t, HOLLOW_EDGE_SIZE, 1-HOLLOW_EDGE_SIZE, aabb.maxZ);
		vertYZ(t, HOLLOW_EDGE_SIZE, HOLLOW_EDGE_SIZE, aabb.maxZ);
		
		setTex(textures[Dir.PX]);
		t.setNormal(1, 0, 0);
		vertYZ(t, 1, 0, aabb.minZ);
		vertYZ(t, 1, 1, aabb.minZ);
		vertYZ(t, 1, 1, aabb.maxZ);
		vertYZ(t, 1, 0, aabb.maxZ);
		
		vertYZ(t, 1-HOLLOW_EDGE_SIZE, HOLLOW_EDGE_SIZE, aabb.maxZ);
		vertYZ(t, 1-HOLLOW_EDGE_SIZE, 1-HOLLOW_EDGE_SIZE, aabb.maxZ);
		vertYZ(t, 1-HOLLOW_EDGE_SIZE, 1-HOLLOW_EDGE_SIZE, aabb.minZ);
		vertYZ(t, 1-HOLLOW_EDGE_SIZE, HOLLOW_EDGE_SIZE, aabb.minZ);
		
		setTex(textures[Dir.NY]);
		t.setNormal(0, -1, 0);
		vertXZ(t, 1, 0, aabb.minZ);
		vertXZ(t, 1, 0, aabb.maxZ);
		vertXZ(t, 0, 0, aabb.maxZ);
		vertXZ(t, 0, 0, aabb.minZ);
		
		vertXZ(t, HOLLOW_EDGE_SIZE, HOLLOW_EDGE_SIZE, aabb.minZ);
		vertXZ(t, HOLLOW_EDGE_SIZE, HOLLOW_EDGE_SIZE, aabb.maxZ);
		vertXZ(t, 1-HOLLOW_EDGE_SIZE, HOLLOW_EDGE_SIZE, aabb.maxZ);
		vertXZ(t, 1-HOLLOW_EDGE_SIZE, HOLLOW_EDGE_SIZE, aabb.minZ);
		
		setTex(textures[Dir.PY]);
		t.setNormal(0, 1, 0);
		vertXZ(t, 0, 1, aabb.minZ);
		vertXZ(t, 0, 1, aabb.maxZ);
		vertXZ(t, 1, 1, aabb.maxZ);
		vertXZ(t, 1, 1, aabb.minZ);
		
		vertXZ(t, 1-HOLLOW_EDGE_SIZE, 1-HOLLOW_EDGE_SIZE, aabb.minZ);
		vertXZ(t, 1-HOLLOW_EDGE_SIZE, 1-HOLLOW_EDGE_SIZE, aabb.maxZ);
		vertXZ(t, HOLLOW_EDGE_SIZE, 1-HOLLOW_EDGE_SIZE, aabb.maxZ);
		vertXZ(t, HOLLOW_EDGE_SIZE, 1-HOLLOW_EDGE_SIZE, aabb.minZ);
	}
	
	protected static void renderQuads(Tessellator t, EnumPosition pos, PartType pt) {
		AxisAlignedBB aabb = Part.getBoundingBoxFromPool(pos, size);
		
		if(pt.clazz == EnumPartClass.HollowPanel)
		{
			if(pos.x != EnumAxisPosition.Span)
				renderHollowPanelYZ(t, aabb);
			else if(pos.y != EnumAxisPosition.Span)
				renderHollowPanelXZ(t, aabb);
			else if(pos.z != EnumAxisPosition.Span)
				renderHollowPanelXY(t, aabb);
			return;
		}
		
		renderAABB(t, aabb, textures);
	}
	
	static void renderAABB(Tessellator t, AxisAlignedBB aabb, int[] textures) {
		int tex;
		setTex(textures[Dir.NZ]);
		t.setNormal(0, 0, -1);
		vertXY(t, aabb.minX, aabb.minY, aabb.minZ);
		vertXY(t, aabb.minX, aabb.maxY, aabb.minZ);
		vertXY(t, aabb.maxX, aabb.maxY, aabb.minZ);
		vertXY(t, aabb.maxX, aabb.minY, aabb.minZ);
		
		tex = textures[Dir.NY]; u = (tex % 16) / 16.0; v = ((tex / 16) + 1) / 16.0;
		t.setNormal(0, -1, 0);
		t.addVertexWithUV(aabb.maxX, aabb.minY, aabb.minZ, u+aabb.maxX/16.0, v-aabb.minZ/16.0);
		t.addVertexWithUV(aabb.maxX, aabb.minY, aabb.maxZ, u+aabb.maxX/16.0, v-aabb.maxZ/16.0);
		t.addVertexWithUV(aabb.minX, aabb.minY, aabb.maxZ, u+aabb.minX/16.0, v-aabb.maxZ/16.0);
		t.addVertexWithUV(aabb.minX, aabb.minY, aabb.minZ, u+aabb.minX/16.0, v-aabb.minZ/16.0);
		
		tex = textures[Dir.NX]; u = (tex % 16) / 16.0; v = ((tex / 16) + 1) / 16.0;
		t.setNormal(-1, 0, 0);
		t.addVertexWithUV(aabb.minX, aabb.minY, aabb.minZ, u+aabb.minZ/16.0, v-aabb.minY/16.0);
		t.addVertexWithUV(aabb.minX, aabb.minY, aabb.maxZ, u+aabb.maxZ/16.0, v-aabb.minY/16.0);
		t.addVertexWithUV(aabb.minX, aabb.maxY, aabb.maxZ, u+aabb.maxZ/16.0, v-aabb.maxY/16.0);
		t.addVertexWithUV(aabb.minX, aabb.maxY, aabb.minZ, u+aabb.minZ/16.0, v-aabb.maxY/16.0);
		
		tex = textures[Dir.PZ]; u = (tex % 16) / 16.0; v = ((tex / 16) + 1) / 16.0;
		t.setNormal(0, 0, 1);
		t.addVertexWithUV(aabb.maxX, aabb.minY, aabb.maxZ, u+aabb.maxX/16.0, v-aabb.minY/16.0);
		t.addVertexWithUV(aabb.maxX, aabb.maxY, aabb.maxZ, u+aabb.maxX/16.0, v-aabb.maxY/16.0);
		t.addVertexWithUV(aabb.minX, aabb.maxY, aabb.maxZ, u+aabb.minX/16.0, v-aabb.maxY/16.0);
		t.addVertexWithUV(aabb.minX, aabb.minY, aabb.maxZ, u+aabb.minX/16.0, v-aabb.minY/16.0);
		
		tex = textures[Dir.PY]; u = (tex % 16) / 16.0; v = ((tex / 16) + 1) / 16.0;
		t.setNormal(0, 1, 0);
		t.addVertexWithUV(aabb.minX, aabb.maxY, aabb.minZ, u+aabb.minX/16.0, v-aabb.minZ/16.0);
		t.addVertexWithUV(aabb.minX, aabb.maxY, aabb.maxZ, u+aabb.minX/16.0, v-aabb.maxZ/16.0);
		t.addVertexWithUV(aabb.maxX, aabb.maxY, aabb.maxZ, u+aabb.maxX/16.0, v-aabb.maxZ/16.0);
		t.addVertexWithUV(aabb.maxX, aabb.maxY, aabb.minZ, u+aabb.maxX/16.0, v-aabb.minZ/16.0);
		
		tex = textures[Dir.PX]; u = (tex % 16) / 16.0; v = ((tex / 16) + 1) / 16.0;
		t.setNormal(1, 0, 0);
		t.addVertexWithUV(aabb.maxX, aabb.maxY, aabb.minZ, u+aabb.minZ/16.0, v-aabb.maxY/16.0);
		t.addVertexWithUV(aabb.maxX, aabb.maxY, aabb.maxZ, u+aabb.maxZ/16.0, v-aabb.maxY/16.0);
		t.addVertexWithUV(aabb.maxX, aabb.minY, aabb.maxZ, u+aabb.maxZ/16.0, v-aabb.minY/16.0);
		t.addVertexWithUV(aabb.maxX, aabb.minY, aabb.minZ, u+aabb.minZ/16.0, v-aabb.minY/16.0);
	}
	
	// renders centred on 0.5,0.5,0.5
	public static void renderPartInv(RenderBlocks render, PartType p) {
		size = p.size; textures = p.textures;
		GL11.glDisable(GL11.GL_BLEND);
		GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
		GL11.glPushMatrix();
		
		EnumPosition pos;
		switch(p.clazz)
		{
		case Centre:
			pos = EnumPosition.Centre;
			break;
		case Panel: case HollowPanel:
			pos = EnumPosition.FaceNZ;
			GL11.glTranslatef(0, 0, 0.5f-(float)size/2);
			break;
		case Strip:
			pos = EnumPosition.EdgeNXNZ;
			GL11.glTranslatef(0.5f-(float)size/2, 0, 0.5f-(float)size/2);
			break;
		case Corner:
			pos = EnumPosition.CornerNXNYNZ;
			GL11.glTranslatef(0.5f-(float)size/2, 0.5f-(float)size/2, 0.5f-(float)size/2);
			break;
		default:
			pos = EnumPosition.Centre;
		}
		
		Tessellator t = Tessellator.instance;
		t.startDrawingQuads();
		
		renderQuads(t, pos, p);
		
		t.draw();
		GL11.glPopMatrix();
		GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
		GL11.glDisable(GL11.GL_BLEND);
	}
}
