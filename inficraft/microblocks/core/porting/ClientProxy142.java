package inficraft.microblocks.core.porting;

import inficraft.microblocks.core.api.porting.PortableBlockRenderer;

import java.io.File;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.RenderBlocks;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.client.IItemRenderer;
import net.minecraftforge.client.MinecraftForgeClient;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.ISimpleBlockRenderingHandler;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class ClientProxy142 extends CommonProxy142 {

	@Override
	public File getMinecraftDir() {
		return Minecraft.getMinecraft().mcDataDir;
	}

	@Override
	public double getPlayerReach(EntityPlayer ply) {
		return Minecraft.getMinecraft().playerController.getBlockReachDistance();
	}

	@Override
	public EntityPlayer getThePlayer() {
		return Minecraft.getMinecraft().thePlayer;
	}

	@Override
	public int getUniqueBlockModelID(String renderClass, final boolean b) {
		try {
			final PortableBlockRenderer r = (PortableBlockRenderer)Class.forName(renderClass).getConstructor().newInstance();
			final int model = RenderingRegistry.getNextAvailableRenderId();
			RenderingRegistry.registerBlockHandler(model, new ISimpleBlockRenderingHandler() {
				@Override
				public boolean shouldRender3DInInventory() {
					return b;
				}
				
				@Override
				public boolean renderWorldBlock(IBlockAccess world, int x, int y, int z,
						Block block, int modelId, RenderBlocks renderer) {
					return r.renderWorldBlock(renderer, world, x, y, z, block, modelId);
				}
				
				@Override
				public void renderInventoryBlock(Block block, int metadata, int modelID,
						RenderBlocks renderer) {
					r.renderInvBlock(renderer, block, metadata, modelID);
				}
				
				@Override
				public int getRenderId() {
					return model;
				}
			});
			return model;
		} catch(Exception e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public boolean isOp(String player) {
		return player.equalsIgnoreCase(Minecraft.getMinecraft().thePlayer.username);
	}

	@Override
	public void preloadTexture(String texfile) {
		MinecraftForgeClient.preloadTexture(texfile);
	}

	@Override
	public void registerTileEntity(Class<? extends TileEntity> clazz, String id, String rclass) {
		try {
			TileEntitySpecialRenderer r = Class.forName(rclass).asSubclass(TileEntitySpecialRenderer.class).getConstructor().newInstance();
			GameRegistry.registerTileEntity(clazz, id);
			ClientRegistry.bindTileEntitySpecialRenderer(clazz, r);
		} catch(Exception e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public boolean isWorldCurrent(World w) {
		return w == Minecraft.getMinecraft().theWorld || super.isWorldCurrent(w);
	}

	@Override
	public void registerItemRenderer(int itemID, String renderClassName) {
		try {
			IItemRenderer r = Class.forName(renderClassName).asSubclass(IItemRenderer.class).getConstructor().newInstance();
			MinecraftForgeClient.registerItemRenderer(itemID, r);
		} catch(Exception e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public boolean isDedicatedServer() {
		return false;
	}
	
	@Override
	public Object createSidedObject(String clientClass, String serverClass) {
		try {
			if(clientClass == null)
				return null;
			return Class.forName(clientClass).newInstance();
		} catch(Throwable e) {
			if(e instanceof Error)
				throw (Error)e;
			if(e instanceof RuntimeException)
				throw (RuntimeException)e;
			throw new RuntimeException(e);
		}
	}

}
