package pchan3;

import java.util.Random;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import net.minecraft.client.Minecraft;
import net.minecraft.src.AxisAlignedBB;
import net.minecraft.src.Block;
import net.minecraft.src.Entity;
import net.minecraft.src.EntityArrow;
import net.minecraft.src.EntityItem;
import net.minecraft.src.EntityPlayer;
import net.minecraft.src.GuiIngame;
import net.minecraft.src.IInventory;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;
import net.minecraft.src.Material;
import net.minecraft.src.ModLoader;
import net.minecraft.src.NBTTagCompound;
import net.minecraft.src.NBTTagList;
import net.minecraft.src.Vec3;
import net.minecraft.src.World;

import org.lwjgl.input.Keyboard;

import java.awt.geom.Point2D;

import java.lang.reflect.*;

public class EntityAirship extends Entity implements IInventory {
	boolean hasOpened = false;

	Minecraft mc;
	protected static Random rando = new Random();

	int fuelTime = 0;
	int maxProxies = 1024;

	public EntityAirship(World world) {
		super(world);
		field_807_a = 0;
		field_806_b = 0;
		field_808_c = 1;
		preventEntitySpawning = true;
		setSize(1.5F, 1.7F);
		yOffset = height / 2.0F;

		cargoItems = new ItemStack[36];
		mc = ModLoader.getMinecraftInstance();

	}

	protected void fall(float f) {

	}

	public EntityAirship(World world, double d, double d1, double d2) {
		this(world);
		setPosition(d, d1 + (double) yOffset, d2);
		motionX = 0.0D;
		motionY = 0.0D;
		motionZ = 0.0D;
		prevPosX = d;
		prevPosY = d1;
		prevPosZ = d2;
	}

	public void setDead() {
		label0: for (int i = 0; i < getSizeInventory(); i++) {
			ItemStack itemstack = getStackInSlot(i);
			if (itemstack == null) {
				continue;
			}
			float f = rand.nextFloat() * 0.8F + 0.1F;
			float f1 = rand.nextFloat() * 0.8F + 0.1F;
			float f2 = rand.nextFloat() * 0.8F + 0.1F;
			do {
				if (itemstack.stackSize <= 0) {
					continue label0;
				}
				int j = rand.nextInt(21) + 10;
				if (j > itemstack.stackSize) {
					j = itemstack.stackSize;
				}
				itemstack.stackSize -= j;
				EntityItem entityitem = new EntityItem(worldObj, posX
						+ (double) f, posY + (double) f1, posZ + (double) f2,
						new ItemStack(itemstack.itemID, j,
								itemstack.getItemDamage()));
				float f3 = 0.05F;
				entityitem.motionX = (float) rand.nextGaussian() * f3;
				entityitem.motionY = (float) rand.nextGaussian() * f3 + 0.2F;
				entityitem.motionZ = (float) rand.nextGaussian() * f3;
				worldObj.spawnEntityInWorld(entityitem);
			} while (true);
		}

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

	public AxisAlignedBB func_383_b_(Entity entity) {
		return entity.boundingBox;
	}

	public AxisAlignedBB func_372_f_() {
		return boundingBox;
	}

	public boolean canBePushed() {
		return true;
	}

	public String getInvName() {
		return "Airship";
	}

	public void onInventoryChanged() {
	}

	public double getMountedYOffset() {
		return (double) height * 0.0D - 0.30000001192092896D;
	}

	public boolean attackEntityFrom(Entity entity, int i) {

		if (entity == null) {
			return true;
		}

		if (worldObj.isRemote || isDead) {
			return true;
		}
		double d1 = entity.posX - this.posX;
		double d2 = entity.posY - this.posY;
		double d3 = entity.posZ - this.posZ;
		double d4 = entity.posX - d1 / 2;
		double d5 = entity.posY - d2 / 2;
		double d6 = entity.posZ - d3 / 2;

		mc.effectRenderer.addEffect(new EntitySteamExplode(worldObj, d4, d5,
				d6, 0.0D, 0.0D, 0.0D));

		field_808_c = -field_808_c;
		field_806_b = 1;
		field_807_a += i * 10;
		setBeenAttacked();

		if (field_807_a > 300) {
			dropItemWithOffset(mod_airship.airShip.shiftedIndex, 1, 0.0F);
			setDead();
		}
		return true;
	}

	public void performHurtAnimation() {
		field_808_c = -field_808_c;
		field_806_b = 1;
		field_807_a += field_807_a * 2;
	}

	public boolean canBeCollidedWith() {

		return !isDead;
	}

	public void setPositionAndRotation2(double d, double d1, double d2,
			float f, float f1, int i) {
		field_9393_e = d;
		field_9392_f = d1;
		field_9391_g = d2;
		field_9390_h = f;
		field_9389_i = f1;
		field_9394_d = i + 4;
		motionX = field_9388_j;
		motionY = field_9387_k;
		motionZ = field_9386_l;

	}

	public void setVelocity(double d, double d1, double d2) {
		field_9388_j = motionX = d;
		field_9387_k = motionY = d1;
		field_9386_l = motionZ = d2;
	}

	boolean checked = false;

	private int getFuelTime(ItemStack itemstack) {
		if (itemstack == null) {
			return 0;
		}
		int i = itemstack.getItem().shiftedIndex;
		if (i < 256 && Block.blocksList[i].blockMaterial == Material.wood) {
			return 300;
		}
		if (i == Item.stick.shiftedIndex) {
			return 100;
		}
		if (i == Item.coal.shiftedIndex) {
			return 1600;
		}
		if (i == Item.bucketLava.shiftedIndex) {
			return 20000;
		}
		if (i == Block.sapling.blockID) {
			return 100;
		}
		if (i == Item.gunpowder.shiftedIndex) {
			return 200;
		} else {
			return ModLoader.addAllFuel(i,0);
		}
	}

	int currentFuelTime;

	public int getFuelScaled(int i) {
		return (fuelTime * i) / 600;
	}

	public void onUpdate() {
		super.onUpdate();
		boolean boost = false;

		if (fuelTime > 0) {
			fuelTime--;
		}
		if (!worldObj.isRemote) {
			if (fuelTime == 0) {

				if (cargoItems[13] != null) {
					if (cargoItems[13].getItem().shiftedIndex == Item.gunpowder.shiftedIndex)
						boost = true;
					else
						boost = false;

				}

				currentFuelTime = fuelTime = getFuelTime(cargoItems[13]);
				if (fuelTime > 0) {

					if (cargoItems[13] != null) {
						if (cargoItems[13].getItem().hasContainerItem()) {
							cargoItems[13] = new ItemStack(cargoItems[13]
									.getItem().getContainerItem());
						} else {
							cargoItems[13].stackSize--;
						}
						if (cargoItems[13].stackSize == 0) {
							cargoItems[13] = null;
						}
					}
				}
			}

		}

		if (boost) {
			motionX += riddenByEntity.motionX * 18D;
			motionZ += riddenByEntity.motionZ * 18D;
		}

		if (field_806_b > 0) {
			field_806_b--;
		}
		if (field_807_a > 0) {
			field_807_a--;
		}
		prevPosX = posX;
		prevPosY = posY;
		prevPosZ = posZ;
		int i = 5;
		double d = 0.0D;
		for (int j = 0; j < i; j++) {
			double d5 = (boundingBox.minY + ((boundingBox.maxY - boundingBox.minY) * (double) (j + 0))
					/ (double) i) - 0.125D;
			double d9 = (boundingBox.minY + ((boundingBox.maxY - boundingBox.minY) * (double) (j + 1))
					/ (double) i) - 0.125D;
			AxisAlignedBB axisalignedbb = AxisAlignedBB.getBoundingBox(
					boundingBox.minX, d5, boundingBox.minZ, boundingBox.maxX,
					d9, boundingBox.maxZ);
			if (worldObj.isAABBInMaterial(axisalignedbb, Material.water)) {
				d += 1.0D / (double) i;
			}
		}

		if (worldObj.isRemote) {
			if (field_9394_d > 0) {
				double d1 = posX + (field_9393_e - posX)
						/ (double) field_9394_d;
				double d5 = posY + (field_9392_f - posY)
						/ (double) field_9394_d;
				double d9 = posZ + (field_9391_g - posZ)
						/ (double) field_9394_d;
				double d12;
				for (d12 = field_9390_h - (double) rotationYaw; d12 < -180D; d12 += 360D) {
				}
				for (; d12 >= 180D; d12 -= 360D) {
				}
				rotationYaw += d12 / (double) field_9394_d;
				rotationPitch += (field_9389_i - (double) rotationPitch)
						/ (double) field_9394_d;
				field_9394_d--;
				setPosition(d1, d5, d9);
				setRotation(rotationYaw, rotationPitch);

			} else {
				double d2 = posX + motionX;
				double d6 = posY + motionY;
				double d10 = posZ + motionZ;
				setPosition(d2, d6, d10);

				if (onGround) {
					motionX *= 0.5D;
					motionY *= 0.5D;
					motionZ *= 0.5D;
					posY += 3D;
				}
				motionX *= 0.99000000953674316D;
				motionY *= 0.94999998807907104D;
				motionZ *= 0.99000000953674316D;
			}
			return;
		}

		if (riddenByEntity != null) {
			motionX += riddenByEntity.motionX * 0.25000000000000001D;
			motionZ += riddenByEntity.motionZ * 0.25000000000000001D;

			if (Keyboard.isKeyDown(mod_airship.KEY_UP)) {
				motionY -= riddenByEntity.motionY * 0.04000000000000001D;
			}
			if (Keyboard.isKeyDown(mod_airship.KEY_DOWN)) {
				for (int j = 0; j < i; j++) {
					double d4 = (boundingBox.minY + ((boundingBox.maxY - boundingBox.minY) * (double) (j - 2))
							/ (double) i) - 0.125D;
					double d8 = (boundingBox.minY + ((boundingBox.maxY - boundingBox.minY) * (double) (j - 4))
							/ (double) i) - 0.125D;
					AxisAlignedBB axisalignedbb = AxisAlignedBB
							.getBoundingBox(boundingBox.minX, d4,
									boundingBox.minZ, boundingBox.maxX, d8,
									boundingBox.maxZ);
					if (!worldObj.isAABBInMaterial(axisalignedbb,
							Material.water)) {
						motionY += riddenByEntity.motionY * 0.01000000000000001D;
					} else {
						posY += 5D;
						motionY = 0;
					}
				}

			}

		}

		if (riddenByEntity == null || fuelTime == 0) {
			motionY -= (0.01D * 10) / 15; // Gravity :P
		}
		double d7 = 1D;
		if (motionX < -d7) {
			motionX = -d7;
		}
		if (motionX > d7) {
			motionX = d7;
		}
		if (motionZ < -d7) {
			motionZ = -d7;
		}
		if (motionZ > d7) {
			motionZ = d7;
		}
		if (onGround) {
			motionX *= 0.5D;
			motionY *= 0.5D;
			motionZ *= 0.5D;
		}
		moveEntity(motionX, motionY, motionZ);

		double d11 = Math.sqrt(motionX * motionX + motionZ * motionZ);
		if (d11 > 0.14999999999999999D) {
			double d13 = Math
					.cos(((double) rotationYaw * 3.1415926535897931D) / 180D);
			double d15 = Math
					.sin(((double) rotationYaw * 3.1415926535897931D) / 180D);
			for (int i1 = 0; (double) i1 < 1.0D + d11 * 60D; i1++) {
				double d18 = rand.nextFloat() * 2.0F - 1.0F;
				double d20 = (double) (rand.nextInt(2) * 2 - 1) * 0.69999999999999996D;

				double d4 = (boundingBox.minY + ((boundingBox.maxY - boundingBox.minY) * (double) (i1 + 0))
						/ (double) i) - 0.125D;
				double d8 = (boundingBox.minY + ((boundingBox.maxY - boundingBox.minY) * (double) (i1 + 1))
						/ (double) i) - 0.125D;
				AxisAlignedBB axisalignedbb = AxisAlignedBB
						.getBoundingBox(boundingBox.minX, d4,
								boundingBox.minZ, boundingBox.maxX, d8,
								boundingBox.maxZ);

				if (rand.nextBoolean()) {
					double d21 = (posX - d13 * d18 * 0.80000000000000004D)
							+ d15 * d20;
					double d23 = posZ - d15 * d18 * 0.80000000000000004D - d13
							* d20;

					if (worldObj
							.isAABBInMaterial(axisalignedbb, Material.water))
						worldObj.spawnParticle("splash", d21, posY - 0.125D,
								d23, motionX, motionY, motionZ);
				} else {
					double d22 = posX + d13 + d15 * d18 * 0.69999999999999996D;
					double d24 = (posZ + d15) - d13 * d18
							* 0.69999999999999996D;
					if (worldObj
							.isAABBInMaterial(axisalignedbb, Material.water))
						worldObj.spawnParticle("splash", d22, posY - 0.125D,
								d24, motionX, motionY, motionZ);
				}
			}
		}
		if (mod_airship.SHOW_BOILER) {
			double smoke = rand.nextFloat() * 2.0f - 1.0f;
			if (smoke > 0.65f) {
				mc.effectRenderer.addEffect(new EntitySteamFX(worldObj, posX,
						posY + 0.9D, posZ, 0.0D, 0.0D, 0.0D));
			}
		}

		if (isCollidedHorizontally && d11 > 0.14999999999999999D) {

		} else {
			motionX *= 0.99000000953674316D;
			motionY *= 0.94999998807907104D;
			motionZ *= 0.99000000953674316D;
		}
		rotationPitch = 0.0F;
		double d14 = rotationYaw;
		double d16 = prevPosX - posX;
		double d17 = prevPosZ - posZ;
		if (d16 * d16 + d17 * d17 > 0.001D) {
			d14 = (float) ((Math.atan2(d17, d16) * 180D) / 3.1415926535897931D);
		}
		double d19;
		for (d19 = d14 - (double) rotationYaw; d19 >= 180D; d19 -= 360D) {
		}
		for (; d19 < -180D; d19 += 360D) {
		}
		if (d19 > 30D) {
			d19 = 30D;
		}
		if (d19 < -30D) {
			d19 = -30D;
		}
		rotationYaw += d19;
		setRotation(rotationYaw, rotationPitch);

		List<?> list = worldObj.getEntitiesWithinAABBExcludingEntity(this,
				boundingBox.expand(0.20000000298023224D, 0.0D,
						0.20000000298023224D));
		if (list != null && list.size() > 0) {
			for (int j1 = 0; j1 < list.size(); j1++) {
				Entity entity = (Entity) list.get(j1);
				if (entity != riddenByEntity && entity.canBePushed()
						&& (entity instanceof EntityAirship)) {
					entity.applyEntityCollision(this);
				}
			}
		}
		if (riddenByEntity != null && riddenByEntity.isDead) {
			riddenByEntity = null;
		}

		if (count == 20)
			hasFired = false;

		count++;

		if (Keyboard.isKeyDown(mod_airship.KEY_FIRE) && riddenByEntity != null
				&& !hasFired) {
			EntityPlayer player = (EntityPlayer) riddenByEntity;
			this.FireArrow(player);
			count = 0;
		}

	}

	int count = 0;

	public void updateRiderPosition() {
		if (riddenByEntity == null) {
			return;
		} else {
			double d = Math
					.cos(((double) rotationYaw * 3.1415926535897931D) / 180D) * 0.40000000000000002D;
			double d1 = Math
					.sin(((double) rotationYaw * 3.1415926535897931D) / 180D) * 0.40000000000000002D;
			riddenByEntity.setPosition(posX + d, posY + getMountedYOffset()
					+ riddenByEntity.getYOffset(), posZ + d1);
			return;
		}
	}

	 protected void writeEntityToNBT(NBTTagCompound par1NBTTagCompound)
	    {
	       // par1NBTTagCompound.setTag("Type", "Airship");

	     
	            NBTTagList var2 = new NBTTagList();

	            for (int var3 = 0; var3 < this.cargoItems.length; ++var3)
	            {
	                if (this.cargoItems[var3] != null)
	                {
	                    NBTTagCompound var4 = new NBTTagCompound();
	                    var4.setByte("Slot", (byte)var3);
	                    this.cargoItems[var3].writeToNBT(var4);
	                    var2.appendTag(var4);
	                }
	            }

	            par1NBTTagCompound.setTag("Items", var2);
	        
	    }

	protected void readEntityFromNBT(NBTTagCompound par1NBTTagCompound) {

		 NBTTagList var2 = par1NBTTagCompound.getTagList("Items");
         this.cargoItems = new ItemStack[this.getSizeInventory()];

         for (int var3 = 0; var3 < var2.tagCount(); ++var3)
         {
             NBTTagCompound var4 = (NBTTagCompound)var2.tagAt(var3);
             int var5 = var4.getByte("Slot") & 255;

             if (var5 >= 0 && var5 < this.cargoItems.length)
             {
                 this.cargoItems[var5] = ItemStack.loadItemStackFromNBT(var4);
             }
         }
		// PetrolFuel = nbttagcompound.getShort("Fuel");

	}

	public int getSizeInventory() {
		return 14;
	}

	public ItemStack getStackInSlot(int i) {
		return cargoItems[i];
	}

	public ItemStack decrStackSize(int i, int j) {
		if (cargoItems[i] != null) {
			if (cargoItems[i].stackSize <= j) {
				ItemStack itemstack = cargoItems[i];
				cargoItems[i] = null;
				return itemstack;
			}
			ItemStack itemstack1 = cargoItems[i].splitStack(j);
			if (cargoItems[i].stackSize == 0) {
				cargoItems[i] = null;
			}
			return itemstack1;
		} else {
			return null;
		}
	}

	public void setInventorySlotContents(int i, ItemStack itemstack) {
		cargoItems[i] = itemstack;
		if (itemstack != null && itemstack.stackSize > getInventoryStackLimit()) {
			itemstack.stackSize = getInventoryStackLimit();
		}
	}

	public int getInventoryStackLimit() {
		return 64;
	}

	public float getShadowSize() {
		return 0.0F;
	}

	public boolean interact(EntityPlayer entityplayer) {

		if (riddenByEntity != null && (riddenByEntity instanceof EntityPlayer)
				&& riddenByEntity != entityplayer) {
			return true;
		}
		if (!worldObj.isRemote) {
			ItemStack itemstack = entityplayer.inventory.getCurrentItem();
			if (itemstack != null && itemstack.itemID == Item.bow.shiftedIndex) {
				return false;
			} else {
				entityplayer.mountEntity(this);
			}
		}

		return true;

	}

	private ItemStack cargoItems[];
	private int field_9394_d;
	private double field_9393_e;
	private double field_9392_f;
	private double field_9391_g;
	private double field_9390_h;
	private double field_9389_i;
	private double field_9388_j;
	private double field_9387_k;
	private double field_9386_l;
	public int field_807_a;
	public int field_806_b;
	public int field_808_c;
	public int PetrolFuel = 0;

	public GuiIngame chat;

	protected void entityInit() {
		// TODO Auto-generated method stub

	}

	public boolean canInteractWith(EntityPlayer entityplayer) {
		if (isDead) {
			return false;
		}

		return entityplayer.getDistanceSqToEntity(this) <= 64D;
	}

	private void FireArrow(EntityPlayer entityplayer) {

		World world = this.worldObj;

		ItemStack itemstack = getStackInSlot(12);
		
		if (itemstack != null && hasFired == false) {
			if (itemstack.getItem().getItemName() == Item.arrow.getItemName())

			{

				Vec3 vec = entityplayer.getLook(1.0F);
				double d8 = 4D;
				double d1 = posX + vec.xCoord * d8;
				double d2 = posY + (double) (height / 4.0F);
				double d3 = posZ + vec.zCoord * d8;
				EntityArrow round = new EntityArrow(world, d1, d2, d3);
				this.decrStackSize(12, 1);
				world.playSoundAtEntity(entityplayer, "random.bow", 1.0F,
						1.0F / (rando.nextFloat() * 0.4F + 0.8F));
				round.setThrowableHeading(vec.xCoord, vec.yCoord, vec.zCoord, 2.6F,
						6F);
				
				world.spawnEntityInWorld(round);
				hasFired = true;
			}
		}

		if (itemstack != null && hasFired == false	&& ModLoader.isModLoaded("mod_Arrows")) 
		{
			
			if (itemstack.getItem().shiftedIndex == 384) {
					
				
				try{
									
				Class<?> Arrow = Class.forName("EntityArrowExplosive");
								
				Class[] args2 = new Class[] {World.class, double.class,double.class,double.class};
				Class[] args3 = new Class[] {double.class,double.class,double.class,float.class,float.class};
				
				Constructor<?> constructor = Arrow.getConstructor(args2);				
				
				Vec3 vec = entityplayer.getLook(1.0F);
				double d8 = 4D;
				double d1 = posX + vec.xCoord * d8;
				double d2 = posY + (double) (height / 4.0F);
				double d3 = posZ + vec.zCoord * d8;
				Object[] args = new Object[] {world, d1, d2, d3};
								
				Object arrow = constructor.newInstance(args);
				
				this.decrStackSize(12, 1);
				
				world.playSoundAtEntity(entityplayer, "random.bow", 1.0F,
						1.0F / (rando.nextFloat() * 0.4F + 0.8F));
				
				Object[] argshead = new Object[] {vec.xCoord, vec.yCoord, vec.zCoord, 2.6F,	6F};
						
				
				Method setHeading = Arrow.getMethod("a",args3);

				setHeading.invoke(arrow, argshead);
				
				world.spawnEntityInWorld((Entity)arrow);
				hasFired = true;
				
				
				}
				
				catch(Throwable e)
				{
				System.out.println(e);	
				}
				
				
				
			}

			if (itemstack.getItem().shiftedIndex ==385) {
			
				
				
				try{
									
				Class<?> Arrow = Class.forName("EntityArrowFire");
								
				Class[] args2 = new Class[] {World.class, double.class,double.class,double.class};
				Class[] args3 = new Class[] {double.class,double.class,double.class,float.class,float.class};
				
				Constructor<?> constructor = Arrow.getConstructor(args2);				
				
				Vec3 vec = entityplayer.getLook(1.0F);
				double d8 = 4D;
				double d1 = posX + vec.xCoord * d8;
				double d2 = posY + (double) (height / 4.0F);
				double d3 = posZ + vec.zCoord * d8;
				Object[] args = new Object[] {world, d1, d2, d3};
								
				Object arrow = constructor.newInstance(args);
				
				this.decrStackSize(12, 1);
				
				world.playSoundAtEntity(entityplayer, "random.bow", 1.0F,
						1.0F / (rando.nextFloat() * 0.4F + 0.8F));
				
				Object[] argshead = new Object[] {vec.xCoord, vec.yCoord, vec.zCoord, 2.6F,	6F};
						
				
				Method setHeading = Arrow.getMethod("a",args3);

				setHeading.invoke(arrow, argshead);
				
				world.spawnEntityInWorld((Entity)arrow);
				hasFired = true;
				
				
				}
				
				catch(Throwable e)
				{
				System.out.println(e);	
				}
				
			}

			if (itemstack.getItem().shiftedIndex ==386) {
				
				try{
									
				Class<?> Arrow = Class.forName("EntityArrowIce");
								
				Class[] args2 = new Class[] {World.class, double.class,double.class,double.class};
				Class[] args3 = new Class[] {double.class,double.class,double.class,float.class,float.class};
				
				Constructor<?> constructor = Arrow.getConstructor(args2);				
				
				Vec3 vec = entityplayer.getLook(1.0F);
				double d8 = 4D;
				double d1 = posX + vec.xCoord * d8;
				double d2 = posY + (double) (height / 4.0F);
				double d3 = posZ + vec.zCoord * d8;
				Object[] args = new Object[] {world, d1, d2, d3};
								
				Object arrow = constructor.newInstance(args);
				
				this.decrStackSize(12, 1);
				
				world.playSoundAtEntity(entityplayer, "random.bow", 1.0F,
						1.0F / (rando.nextFloat() * 0.4F + 0.8F));
				
				Object[] argshead = new Object[] {vec.xCoord, vec.yCoord, vec.zCoord, 2.6F,	6F};
						
				
				Method setHeading = Arrow.getMethod("a",args3);

				setHeading.invoke(arrow, argshead);
				
				world.spawnEntityInWorld((Entity)arrow);
				hasFired = true;
				
				
				}
				
				catch(Throwable e)
				{
				System.out.println(e);	
				}
			}

			if (itemstack.getItem().shiftedIndex == 387) {
				 
				try{
									
				Class<?> Arrow = Class.forName("EntityArrowEgg");
								
				Class[] args2 = new Class[] {World.class, double.class,double.class,double.class};
				Class[] args3 = new Class[] {double.class,double.class,double.class,float.class,float.class};
				
				Constructor<?> constructor = Arrow.getConstructor(args2);				
				
				Vec3 vec = entityplayer.getLook(1.0F);
				double d8 = 4D;
				double d1 = posX + vec.xCoord * d8;
				double d2 = posY + (double) (height / 4.0F);
				double d3 = posZ + vec.zCoord * d8;
				Object[] args = new Object[] {world, d1, d2, d3};
								
				Object arrow = constructor.newInstance(args);
				
				this.decrStackSize(12, 1);
				
				world.playSoundAtEntity(entityplayer, "random.bow", 1.0F,
						1.0F / (rando.nextFloat() * 0.4F + 0.8F));
				
				Object[] argshead = new Object[] {vec.xCoord, vec.yCoord, vec.zCoord, 2.6F,	6F};
						
				
				Method setHeading = Arrow.getMethod("a",args3);

				setHeading.invoke(arrow, argshead);
				
				world.spawnEntityInWorld((Entity)arrow);
				hasFired = true;
				
				
				}
				
				catch(Throwable e)
				{
				System.out.println(e);	
				}
			}

			if (itemstack.getItem().shiftedIndex == 388) {
				
				try{
									
				Class<?> Arrow = Class.forName("EntityArrowLightning");
								
				Class[] args2 = new Class[] {World.class, double.class,double.class,double.class};
				Class[] args3 = new Class[] {double.class,double.class,double.class,float.class,float.class};
				
				Constructor<?> constructor = Arrow.getConstructor(args2);				
				
				Vec3 vec = entityplayer.getLook(1.0F);
				double d8 = 4D;
				double d1 = posX + vec.xCoord * d8;
				double d2 = posY + (double) (height / 4.0F);
				double d3 = posZ + vec.zCoord * d8;
				Object[] args = new Object[] {world, d1, d2, d3};
								
				Object arrow = constructor.newInstance(args);
				
				this.decrStackSize(12, 1);
				
				world.playSoundAtEntity(entityplayer, "random.bow", 1.0F,
						1.0F / (rando.nextFloat() * 0.4F + 0.8F));
				
				Object[] argshead = new Object[] {vec.xCoord, vec.yCoord, vec.zCoord, 2.6F,	6F};
						
				
				Method setHeading = Arrow.getMethod("a",args3);

				setHeading.invoke(arrow, argshead);
				
				world.spawnEntityInWorld((Entity)arrow);
				hasFired = true;
				
				
				}
				
				catch(Throwable e)
				{
				System.out.println(e);	
				}
			}

		}

	}

	boolean hasFired = false;

	@Override
	public ItemStack getStackInSlotOnClosing(int var1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isUseableByPlayer(EntityPlayer var1) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void openChest() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void closeChest() {
		// TODO Auto-generated method stub
		
	}

}
