package bastion.blocks;

import net.minecraft.src.AxisAlignedBB;
import net.minecraft.src.Entity;
import net.minecraft.src.EntityItem;
import net.minecraft.src.EntityPlayer;
import net.minecraft.src.Material;
import net.minecraft.src.StepSound;
import net.minecraft.src.World;

public class BlockRope extends BlockTensile
{
	public BlockRope(int var1, int var2, Material var3, int var4)
	{
		super(var1, var2, var3, var4);
	}

	public AxisAlignedBB getCollisionBoundingBoxFromPool(World var1, int var2, int var3, int var4)
	{
		if ((ModCollision.updatingEntity instanceof EntityItem))
		{
			return null;
		}

		int var5 = var1.getBlockMetadata(var2, var3, var4);
		return (ModCollision.updatingEntity != null) && ((false)) ? null : (false) ? null : ((var5 & 0xC) == 8) && (isTensile(var1, var2, var3 - 1, var4)) ? null : (var5 & 0xC) == 12 ? null : super.getCollisionBoundingBoxFromPool(var1, var2, var3, var4);
	}

	public void onEntityWalking(World var1, int var2, int var3, int var4, Entity var5)
	{
		handleCollision(var1, var2, var3, var4, var5, true);
	}

	public void onEntityCollidedWithBlock(World var1, int var2, int var3, int var4, Entity var5)
	{
		handleCollision(var1, var2, var3, var4, var5, false);
	}

	public void handleCollision(World var1, int var2, int var3, int var4, Entity var5, boolean var6)
	{
		int var7 = var1.getBlockMetadata(var2, var3, var4);

		if (((var7 & 0x8) != 0) && (((var7 & 0xC) != 8) || (isTensile(var1, var2, var3 - 1, var4))))
		{
			if (!var6)
			{
				if (((var7 & 0xC) == 8) && (isTensile(var1, var2, var3 - 1, var4)))
				{
					var5.fallDistance = 0.0F;

					if (var5.isSneaking())
					{
						var5.motionY = 0.081D;
						var5.posY = var5.lastTickPosY;
					}

					switch (var7 & 0x3)
					{
					case 0:
						if (var5.isSneaking())
						{
							var5.motionZ = ((var4 + 0.5D - var5.posZ) / 10.0D);
						}
						else if (var5.boundingBox.maxX > var2 + 0.9D)
						{
							var5.setPosition(var2 + 0.9D - var5.width / 2.0D, var5.boundingBox.minY <= var3 + 0.9D ? var5.posY : var3 + 1.5D + var5.height, var5.posZ);
							var5.motionX = 0.0D;
							var5.motionY = 0.15D; } break;
					case 1:
						if (var5.isSneaking())
						{
							var5.motionX = ((var2 + 0.5D - var5.posX) / 10.0D);
						}
						else if (var5.boundingBox.maxZ > var4 + 0.9D)
						{
							var5.setPosition(var5.posX, var5.boundingBox.minY <= var3 + 0.9D ? var5.posY : var3 + 1.5D + var5.height, var4 + 0.9D - var5.width / 2.0D);
							var5.motionZ = 0.0D;
							var5.motionY = 0.15D; } break;
					case 2:
						if (var5.isSneaking())
						{
							var5.motionZ = ((var4 + 0.5D - var5.posZ) / 10.0D);
						}
						else if (var5.boundingBox.minX < var2 + 0.1D)
						{
							var5.setPosition(var2 + 0.1D + var5.width / 2.0D, var5.boundingBox.minY <= var3 + 0.9D ? var5.posY : var3 + 1.5D + var5.height, var5.posZ);
							var5.motionX = 0.0D;
							var5.motionY = 0.15D; } break;
					case 3:
						if (var5.isSneaking())
						{
							var5.motionX = ((var2 + 0.5D - var5.posX) / 10.0D);
						}
						else if (var5.boundingBox.minZ < var4 + 0.1D)
						{
							var5.setPosition(var5.posX, var5.boundingBox.minY <= var3 + 0.9D ? var5.posY : var3 + 1.5D + var5.height, var4 + 0.1D + var5.width / 2.0D);
							var5.motionZ = 0.0D;
							var5.motionY = 0.15D;
						}
						break;
					}
				} else if ((var7 & 0xC) == 12)
				{
					double var8 = var5.posX - (var2 + 0.5F);
					double var10 = var5.posZ - (var4 + 0.5F);
					double var12 = Math.sqrt(var8 * var8 + var10 * var10);
					double var14 = (var5.rotationYaw - 90.0F) / 180.0F * 3.141593F;
					double var16 = Math.atan2(var10, var8);
					boolean var18 = (var14 - var16 + 7.068584203720093D) % 6.283185307179586D < 1.570796326794897D;
					boolean var19 = (var18) && (var12 < 0.5D) && ((Math.abs(var5.motionX) > 0.01D) || (Math.abs(var5.motionZ) > 0.01D));

					if ((var5.isSneaking()) || (var18))
					{
						var5.fallDistance = 0.0F;

						if (var5.motionY < -0.15D)
						{
							var5.motionY = -0.15D;
						}
					}

					if ((var5.isSneaking()) || (var19))
					{
						if (var5.isSneaking())
						{
							var5.motionY = 0.081D;
							var5.posY = var5.lastTickPosY;
						}

						double var20 = Math.min(Math.abs(var16 - var14), 1.0D) * (var16 <= var14 ? -1 : 1);

						if (Math.abs(var16 - var14) < 0.03D)
						{
							var20 = 0.0D;
						}

						double var22 = (var14 - var16 <= 0.1D ? 0.0D : Math.cos(var16 - 0.1D) * 0.1000000014901161D) + (var14 - var16 <= 0.1D ? 0.0D : Math.cos(var16 - 0.1D) * 0.1000000014901161D);
						double var24 = (var16 - var14 <= 0.1D ? 0.0D : Math.sin(var16 + 0.1D) * 0.1000000014901161D) + (var14 - var16 <= 0.1D ? 0.0D : Math.sin(var16 + 0.1D) * 0.1000000014901161D);

						if ((var12 >= 0.21D) || (!var19))
						{
							var20 = 0.0D;
						}

						var5.setPosition(var2 + 0.5F + Math.cos(var16 - var20) * Math.max(var12, 0.21D), var5.posY, var4 + 0.5F + Math.sin(var16 - var20) * Math.max(var12, 0.21D));

						if ((var12 < 0.21D) && (var19))
						{
							var5.motionX *= 0.75D;
							var5.motionY = 0.2D;
							var5.motionZ *= 0.75D;
							Float var26 = Float.valueOf((float)(var16 - var20) * 180.0F / 3.141593F + 90.0F);
							Float var27 = Float.valueOf((var26.floatValue() - var5.rotationYaw + 720.0F + 720.0F) % 360.0F - 180.0F);

							if (Math.abs(var27.floatValue()) > 160.0F)
							{
								var26 = Float.valueOf(var5.rotationYaw);
							}

							var5.rotationYaw = var26.floatValue();
						}
					}
				}

				if (((var5 instanceof EntityPlayer)) && (var5.lastTickPosY % 1.0D < 0.5D) && (var5.posY % 1.0D > 0.5D))
				{
					var1.playSoundAtEntity(var5, this.stepSound.getBreakSound(), this.stepSound.getVolume() * 0.5F, this.stepSound.getPitch() * 0.75F);
				}
			}
		}
	}

	/*public boolean mountZipline(ItemStack var1, EntityLiving var2, World var3, int var4, int var5, int var6, int var7)
	{
		if ((var3.getBlockMaterial(var4, var5 - 1, var6) == Material.air) && (var3.getBlockMaterial(var4, var5 - 2, var6) == Material.air))
		{
			int var8 = var3.getBlockMetadata(var4, var5, var6);

			if ((var8 & 0xC) == 12)
			{
				return false;
			}

			EntityHandlebar var9 = new EntityHandlebar(var3, var4 + 0.5D, var5 + 0.5D, var6 + 0.5D, var2);
			var9.setPosition(var4 + 0.5D, var5 + 0.5D - var9.height, var6 + 0.5D);
			double var10 = var4 - var2.posX;
			double var12 = var5 - var2.boundingBox.minY - 0.5D;
			double var14 = var6 - var2.posZ;
			var9.motionX = var2.motionX;
			var9.motionZ = var2.motionZ;
			double var16 = MathHelper.sqrt_double(var10 * var10 + var12 * var12 + var14 * var14);

			if (var16 < 4.0D)
			{
				var9.owner = var2;
				var3.spawnEntityInWorld(var9);
				var2.mountEntity(var9);
				var1.stackSize -= 1;

				if ((var2 instanceof EntityPlayer))
				{
					((EntityPlayer)var2).triggerAchievement(mod_Zipline.achievementRideZipline);
				}

				return true;
			}

			return false;
		}

		return false;
	}

	public double getZiplineFriction(Entity var1, World var2, int var3, int var4, int var5, int var6)
	{
		double var7 = var1.motionX * var1.motionX + var1.motionZ * var1.motionZ;
		return var7 == 0.0D ? 1.0D : 1.0D - 0.015D * Math.min(1.0D, 1.0D / var7);
	}

	public Vec3D getZiplineMotion(Entity var1, World var2, int var3, int var4, int var5, int var6)
	{
		IHandlebar var7 = (IHandlebar)var1;

		if (((var6 & 0xC) != 12) && (((var6 & 0xC) != 8) || (!isTensile(var2, var3, var4 - 1, var5))))
		{
			boolean var8 = (var6 & 0x1) == 0;
			int var9 = var8 ? 1 : 0;
			int var10 = var8 ? 0 : 1;
			int var11 = (getTensileMetadata(var2, var3 + var9, var4, var5 + var10, isTensile(var2, var3 + var9, var4 + 1, var5 + var10) ? 6 : 0) & 0x6) >> 1;
			int var12 = (getTensileMetadata(var2, var3 - var9, var4, var5 - var10, isTensile(var2, var3 - var9, var4 + 1, var5 - var10) ? 6 : 0) & 0x6) >> 1;

			if ((var6 & 0x8) == 0)
			{
				if (var11 <= var12)
				{
					var12 = (var6 & 0x6) >> 1;
				}

				if (var11 >= var12)
				{
					var11 = (var6 & 0x6) >> 1;
				}
			}

			Vec3D var13 = null;
			double var14 = heights[var11] - heights[var12];

			if (var14 == 0.0D)
			{
				var13 = Vec3D.createVector(0.0D, 0.0D, 0.0D);
			}
			else
			{
				double var16 = Math.min(heights[var11], heights[var12]);
				double var18 = 0.05D * Math.max(0.0D, var1.posY + var1.height - var4 - var16) * (var14 <= 0.0D ? -1 : 1);
				var13 = Vec3D.createVector(-var9 * var18, 0.0D, -var10 * var18);
			}

			return var13;
		}

		if (var7 != null)
		{
			var7.dismount();
		}

		return null;
	}

	public void conformToZipline(Entity var1, World var2, int var3, int var4, int var5, int var6)
	{
		if (((var6 & 0xC) != 12) && (((var6 & 0xC) != 8) || (!isTensile(var2, var3, var4 - 1, var5))))
		{
			boolean var7 = (var6 & 0x1) == 0;
			int var8 = var7 ? 1 : 0;
			int var9 = var7 ? 0 : 1;
			int var10 = (getTensileMetadata(var2, var3 + var8, var4, var5 + var9, isTensile(var2, var3 + var8, var4 + 1, var5 + var9) ? 6 : 0) & 0x6) >> 1;
			int var11 = (getTensileMetadata(var2, var3 - var8, var4, var5 - var9, isTensile(var2, var3 - var8, var4 + 1, var5 - var9) ? 6 : 0) & 0x6) >> 1;

			if ((var6 & 0x8) == 0)
			{
				if (var10 <= var11)
				{
					var11 = (var6 & 0x6) >> 1;
				}

				if (var10 >= var11)
				{
					var10 = (var6 & 0x6) >> 1;
				}
			}

			double var12 = var7 ? var1.posX : var1.posZ;
			double var14 = heights[var10] - heights[var11];
			double var16 = heights[var11] + var4 - (var7 ? var3 : var5) * var14;
			var1.posY = (var12 * var14 + var16 - var1.height);

			if (var7)
			{
				var1.posZ = (var5 + 0.5D);
				var1.motionZ = 0.0D;
			}
			else
			{
				var1.posX = (var3 + 0.5D);
				var1.motionX = 0.0D;
			}
		}
	}*/

	public StepSound getStepSound(Entity var1, World var2, int var3, int var4, int var5, int var6)
	{
		return this.stepSound;
	}
}