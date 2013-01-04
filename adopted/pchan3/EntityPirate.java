package pchan3;

import java.util.Random;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityFlying;
import net.minecraft.entity.monster.IMob;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.item.Item;
import net.minecraft.src.BaseMod;
import net.minecraft.src.ModLoader;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class EntityPirate extends EntityFlying implements IMob {
	Minecraft mc;

	public EntityPirate(World world) {
		super(world);
		courseChangeCooldown = 0;
		targetedEntity = null;
		aggroCooldown = 0;
		prevAttackCounter = 0;
		attackCounter = 0;
		setSize(4F, 4F);
		isImmuneToFire = false;
		texture = "/mob/airship.png";
		mc = ModLoader.getMinecraftInstance();
		this.health = 60;
	}
boolean playedWeigh = false;
boolean playedPrep = false;
	protected void updatePlayerActionState() {
		if (worldObj.difficultySetting == 0) {
			setEntityDead();
		}
		prevAttackCounter = attackCounter;
		double d = waypointX - posX;
		double d1 = waypointY - posY;
		double d2 = waypointZ - posZ;
		double d3 = MathHelper.sqrt_double(d * d + d1 * d1 + d2 * d2);
		if (d3 < 1.0D || d3 > 60D) {
			waypointX = posX
					+ (double) ((rand.nextFloat() * 2.0F - 1.0F) * 16F);
			waypointY = posY
					+ (double) ((rand.nextFloat() * 2.0F - 1.0F) * 16F);
			waypointZ = posZ
					+ (double) ((rand.nextFloat() * 2.0F - 1.0F) * 16F);
		}
		if (courseChangeCooldown-- <= 0) {
			courseChangeCooldown += rand.nextInt(5) + 2;
			if (isCourseTraversable(waypointX, waypointY, waypointZ, d3)) {
				motionX += (d / d3) * 0.04000000000000001D;
				motionY += (d1 / d3) * 0.04000000000000001D;
				motionZ += (d2 / d3) * 0.04000000000000001D;
			} else {
				waypointX = posX;
				waypointY = posY;
				waypointZ = posZ;
			}
		}
		if (targetedEntity != null && targetedEntity.isDead) {
			targetedEntity = null;
		}
		if (targetedEntity == null || aggroCooldown-- <= 0) {
			targetedEntity = worldObj.getClosestPlayerToEntity(this, 100D);
			
			if (targetedEntity != null) {
				
				aggroCooldown = 20;
				
				
			}
			
		
		}

		if (targetedEntity != null
				&& targetedEntity.getDistanceSqToEntity(this) < 64 * 64) {

			if (canEntityBeSeen(targetedEntity)) 
			{
				if(attackCounter == 0 && playedWeigh == false)
				{
					worldObj.playSoundAtEntity(this, "mob.pirate.weighanchor",
							getSoundVolume(), (rand.nextFloat() - rand
									.nextFloat()) * 0.2F + 1.0F);
					playedWeigh = true;
				}
				
				
				
				if (attackCounter == 5 && playedPrep == false) 
				{
					worldObj.playSoundAtEntity(this, "mob.pirate.prepare",
							getSoundVolume(), (rand.nextFloat() - rand
									.nextFloat()) * 0.2F + 1.0F);
					playedPrep = true;
				}
				
				attackCounter++;
				if (attackCounter == 60) 
				{
					double b = targetedEntity.posX - posX + 1.200D;
					double b1 = targetedEntity.posZ - posZ + 1.200D;
					
						EntityArrow entityarrow = new EntityArrow(worldObj,
								this,1.0f);
						entityarrow.posY += 1.3999999761581421D;
						double b2 = targetedEntity.posY - 0.20000000298023224D
								- entityarrow.posY;
						float f1 = MathHelper.sqrt_double(b * b + b1 * b1) * 0.3F;
						
						worldObj.playSoundAtEntity(this, "mob.pirate.fire", 10.0F,(rand.nextFloat() - rand
								.nextFloat()) * 0.2F + 1.0F);
						worldObj.spawnEntityInWorld(entityarrow);
						
						entityarrow.setThrowableHeading(b, b2 + (double) f1, b1,
								1.25F, 12F);
						attackCounter = -80;	
				}
			} 			
			else if (attackCounter > 0) 
			{
				attackCounter--;
			}
		
		}
		else
        {
            renderYawOffset = rotationYaw = (-(float)Math.atan2(motionX, motionZ) * 180F) / 3.141593F;
            if(attackCounter > 0)
            {
                attackCounter--;
            }
        }

	}

	private boolean isCourseTraversable(double d, double d1, double d2,
			double d3) {
		double d4 = (waypointX - posX) / d3;
		double d5 = (waypointY - posY) / d3;
		double d6 = (waypointZ - posZ) / d3;
		AxisAlignedBB axisalignedbb = boundingBox.copy();
		for (int i = 1; (double) i < d3; i++) {
			axisalignedbb.offset(d4, d5, d6);
			if (worldObj.getCollidingBoundingBoxes(this, axisalignedbb).size() > 0) {
				return false;
			}
		}

		return true;
	}


	protected String getLivingSound() {
		return "";
	}

	protected String getHurtSound() {
		return "mob.pirate.blowmedown";
	}

	protected String getDeathSound() {
		return "mob.pirate.avastyescurvydog";
	}

	protected void func_21066_o() {
		boolean canDropEngine = false;
		for (int i = 0; i < ModLoader.getLoadedMods().size(); i++) {
			BaseMod mod = (BaseMod) ModLoader.getLoadedMods().get(i);

			if (mod.toString() == "Airship") {
				canDropEngine = true;
			}
		}
		Random rand = new Random();
		if (rand.nextInt(100) < 5 && canDropEngine) {
			dropItem(mod_airship.engine.shiftedIndex, 1);
		} else if (rand.nextBoolean() == true) {
			dropItem(Item.arrow.shiftedIndex, 4);
		} else {
			dropItem(Item.leather.shiftedIndex, 4);
		}
	}

	protected int getDropItemId() {
		return Item.arrow.shiftedIndex;
	}

	protected float getSoundVolume() {
		return 10F;
	}

	public boolean getCanSpawnHere() {
		return rand.nextInt(15) == 0 && super.getCanSpawnHere()
				&& worldObj.difficultySetting > 0;
	}

	public void setEntityDead() {
		Random random = new Random();
		for (int i = 1; i < 30; i++) {
			if (i % 2 == 0) {
				mc.effectRenderer.addEffect(new EntitySteamExplode(worldObj,
						posX + (random.nextInt(i) / 8), posY, posZ
								- (random.nextInt(i) / 8), 0D, 0D, 0D));
				mc.effectRenderer.addEffect(new EntitySteamExplode(worldObj,
						posX + (random.nextInt(i) / 8), posY, posZ
								+ (random.nextInt(i) / 8), 0D, 0D, 0D));
			} else {
				mc.effectRenderer.addEffect(new EntitySteamExplode(worldObj,
						posX - (random.nextInt(i) / 8), posY, posZ
								+ (random.nextInt(i) / 8), 0D, 0D, 0D));
				mc.effectRenderer.addEffect(new EntitySteamExplode(worldObj,
						posX - (random.nextInt(i) / 8), posY, posZ
								- (random.nextInt(i) / 8), 0D, 0D, 0D));
			}
		}

		super.setDead();
	}

	public int getMaxSpawnedInChunk() {
		return 1;
	}

	public int courseChangeCooldown;
	public double waypointX;
	public double waypointY;
	public double waypointZ;
	private Entity targetedEntity;
	private int aggroCooldown;
	public int prevAttackCounter;
	public int attackCounter;

	@Override
	public int getMaxHealth() {
		// TODO Auto-generated method stub
		return 0;
	}
}
