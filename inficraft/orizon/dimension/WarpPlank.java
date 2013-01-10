package inficraft.orizon.dimension;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;

public class WarpPlank extends Block
{

	public WarpPlank(int i)
	{
		super(i, 4, Material.wood);
		setLightValue(1.0F);
	}

	@Override
	public boolean isBlockSolid (IBlockAccess iblockaccess, int i, int j, int k, int l)
	{
		return false;
	}

	@Override
	public AxisAlignedBB getCollisionBoundingBoxFromPool (World world, int i, int j, int k)
	{
		return null;
	}

	@Override
	public void onEntityCollidedWithBlock (World world, int x, int y, int z, Entity entity)
	{
		entity.travelToDimension(42);
	}

	/*private void changeDimension (int dimId, Entity entity)
	{
		TeleporterDreamscape teleporter = new TeleporterDreamscape();

		if (!entity.worldObj.isRemote && !entity.isDead)
		{
			MinecraftServer mcServer = MinecraftServer.getServer();
			Minecraft mc = Minecraft.getMinecraft();
			int oldDim = entity.dimension;
			WorldServer worldOldDim = mcServer.worldServerForDimension(oldDim);
			WorldServer worldNewDim = mcServer.worldServerForDimension(dimId);
			entity.dimension = dimId;
			entity.worldObj.setEntityDead(entity);
			entity.isDead = false;

			if (entity instanceof EntityPlayerMP)
			{
				System.out.println("Transferring EntityPlayerMP");
				mcServer.getConfigurationManager().transferPlayerToDimension((EntityPlayerMP) entity, dimId, teleporter);
			}
			else
				mcServer.getConfigurationManager().func_82448_a(entity, oldDim, worldOldDim, worldNewDim, teleporter);

			Entity tempEntity = EntityList.createEntityByName(EntityList.getEntityString(entity), worldNewDim);

			if (tempEntity != null)
			{
				tempEntity.func_82141_a(entity, true);
				worldNewDim.spawnEntityInWorld(tempEntity);
			}

			entity.isDead = true;
			worldOldDim.func_82742_i();
			worldNewDim.func_82742_i();

			this.hasUsedPortalRecently = true;
		}
	}*/
}
