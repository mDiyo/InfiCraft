package inficraft.microblocks.core.multipart;

import inficraft.microblocks.core.api.multipart.ICoverSystem;
import inficraft.microblocks.core.api.multipart.IMultipartTile;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.RenderBlocks;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.client.registry.ISimpleBlockRenderingHandler;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class ClientProxy {
	
	public static void RenderWorldBlock(RenderBlocks render, IBlockAccess world, int x, int y, int z, Block block) {
		TileEntity te = world.getBlockTileEntity(x, y, z);
		
		if(!(te instanceof IMultipartTile))
			return;
		
		IMultipartTile imt = (IMultipartTile)te;
		
		ICoverSystem ci = imt.getCoverSystem();
		
		boolean damageLayer = render.overrideBlockTexture >= 0;
		
		if(!damageLayer) {
			imt.render(render);
		
			if(ci != null)
				ci.render(render);
		}
		else {
			PartCoordinates breaking = BlockMultipartBase.getBreakingPart(Minecraft.getMinecraft().thePlayer);
			if(breaking.x == x && breaking.y == y && breaking.z == z) {
				if(!breaking.isCoverSystemPart)
					imt.renderPart(render, breaking.part);
				else if(ci != null)
					ci.renderPart(render, breaking.part);
			}
		}
	}
	
	public static void RenderInvBlock(RenderBlocks render, Block block, int meta) {
		((BlockMultipartBase)block).renderInvBlock(render, meta);
	}
	
	
	
	public ClientProxy() {
		MinecraftForge.EVENT_BUS.register(new MultipartHighlightHandler());
		
		RenderingRegistry.registerBlockHandler(new ISimpleBlockRenderingHandler() {
			@Override
			public boolean shouldRender3DInInventory() {
				return true;
			}
			
			@Override
			public boolean renderWorldBlock(IBlockAccess world, int x, int y, int z, Block block, int modelId, RenderBlocks renderer) {
				ClientProxy.RenderWorldBlock(renderer, world, x, y, z, block);
				return true;
			}
			
			@Override
			public void renderInventoryBlock(Block block, int metadata, int modelID, RenderBlocks renderer) {
				ClientProxy.RenderInvBlock(renderer, block, metadata);
			}
			
			@Override
			public int getRenderId() {
				return MultipartSystem.multipartRenderType;
			}
		});
	}
}
