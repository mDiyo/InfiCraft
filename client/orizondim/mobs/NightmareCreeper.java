package net.minecraft.src.orizondim.mobs;
import java.util.Random;

import net.minecraft.src.*;

public class NightmareCreeper extends EntityMob
	//implements SparrowAPI
{
    /**
     * The amount of time since the creeper was close enough to the player to ignite
     */
    int timeSinceIgnited;

    /**
     * Time when this creeper was last in an active state (Messed up code here, probably causes creeper animation to go
     * weird)
     */
    int lastActiveTime;
    
    public Random random = new Random();

    public NightmareCreeper(World par1World)
    {
        super(par1World);
        this.texture = "/orizonmobtex/creeper.png";
        this.setSize(1.9F, 3.9F);
        this.experienceValue = 50;
        this.tasks.addTask(1, new EntityAISwimming(this));
        this.tasks.addTask(2, new EntityAINightmareCreeperSwell(this));
        this.tasks.addTask(3, new EntityAIAvoidEntity(this, EntityOcelot.class, 6.0F, 0.25F, 0.3F));
        this.tasks.addTask(4, new EntityAIAttackOnCollide(this, 0.25F, false));
        this.tasks.addTask(5, new EntityAIWander(this, 0.2F));
        this.tasks.addTask(6, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
        this.tasks.addTask(6, new EntityAILookIdle(this));
        this.targetTasks.addTask(1, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 16.0F, 0, true));
        this.targetTasks.addTask(2, new EntityAIHurtByTarget(this, false));
        if (random.nextInt(5) == 0)
        {
        	this.dataWatcher.updateObject(17, Byte.valueOf((byte)1));
        }
    }

    /**
     * Returns true if the newer Entity AI code should be run
     */
    public boolean isAIEnabled()
    {
        return true;
    }

    public int getMaxHealth()
    {
        return 40;
    }

    protected void entityInit()
    {
        super.entityInit();
        this.dataWatcher.addObject(16, Byte.valueOf((byte) - 1));
        this.dataWatcher.addObject(17, Byte.valueOf((byte)0));
    }

    /**
     * (abstract) Protected helper method to write subclass entity data to NBT.
     */
    public void writeEntityToNBT(NBTTagCompound par1NBTTagCompound)
    {
        super.writeEntityToNBT(par1NBTTagCompound);

        if (this.dataWatcher.getWatchableObjectByte(17) == 1)
        {
            par1NBTTagCompound.setBoolean("powered", true);
        }
    }

    /**
     * (abstract) Protected helper method to read subclass entity data from NBT.
     */
    public void readEntityFromNBT(NBTTagCompound par1NBTTagCompound)
    {
        super.readEntityFromNBT(par1NBTTagCompound);
        this.dataWatcher.updateObject(17, Byte.valueOf((byte)(par1NBTTagCompound.getBoolean("powered") ? 1 : 0)));
    }

    /**
     * Called to update the entity's position/logic.
     */
    public void onUpdate()
    {
        if (this.isEntityAlive())
        {
            this.lastActiveTime = this.timeSinceIgnited;
            int var1 = this.getCreeperState();

            if (var1 > 0 && this.timeSinceIgnited == 0)
            {
                this.worldObj.playSoundAtEntity(this, "random.fuse", 1.0F, 0.5F);
            }

            if (!frozen)
            {
                this.timeSinceIgnited += var1;
            }

            if (this.timeSinceIgnited < 0)
            {
                this.timeSinceIgnited = 0;
            }

            if (this.timeSinceIgnited >= 45)
            {
                this.timeSinceIgnited = 45;

                if (!this.worldObj.isRemote)
                {
                    if (this.getPowered())
                    {
                        this.worldObj.createExplosion(this, this.posX, this.posY, this.posZ, 14.0F);
                    }
                    else
                    {
                        this.worldObj.createExplosion(this, this.posX, this.posY, this.posZ, 8.0F);
                    }

                    this.setDead();
                }
            }
        }

        super.onUpdate();
    }

    /**
     * Returns the sound this mob makes when it is hurt.
     */
    protected String getHurtSound()
    {
        return "mob.creeper";
    }

    /**
     * Returns the sound this mob makes on death.
     */
    protected String getDeathSound()
    {
        return "mob.creeperdeath";
    }

    /**
     * Called when the mob's health reaches 0.
     */
    public void onDeath(DamageSource par1DamageSource)
    {
        super.onDeath(par1DamageSource);

        if (par1DamageSource.getEntity() instanceof EntitySkeleton)
        {
            this.dropItem(Item.record13.shiftedIndex + this.rand.nextInt(10), 1);
        }
    }

    public boolean attackEntityAsMob(Entity par1Entity)
    {
        return true;
    }

    /**
     * Returns true if the creeper is powered by a lightning bolt.
     */
    public boolean getPowered()
    {
        return this.dataWatcher.getWatchableObjectByte(17) == 1;
    }

    /**
     * Connects the the creeper flashes to the creeper's color multiplier
     */
    public float setCreeperFlashTime(float par1)
    {
        return ((float)this.lastActiveTime + (float)(this.timeSinceIgnited - this.lastActiveTime) * par1) / 28.0F;
    }

    /**
     * Returns the item ID for the item the mob drops on death.
     */
    protected int getDropItemId()
    {
        return Item.gunpowder.shiftedIndex;
    }

    /**
     * Returns the current state of creeper, -1 is idle, 1 is 'in fuse'
     */
    public int getCreeperState()
    {
        return this.dataWatcher.getWatchableObjectByte(16);
    }

    /**
     * Sets the state of creeper, -1 to idle and 1 to be 'in fuse'
     */
    public void setCreeperState(int par1)
    {
        this.dataWatcher.updateObject(16, Byte.valueOf((byte)par1));
    }

    /**
     * Called when a lightning bolt hits the entity.
     */
    public void onStruckByLightning(EntityLightningBolt par1EntityLightningBolt)
    {
        super.onStruckByLightning(par1EntityLightningBolt);
        this.dataWatcher.updateObject(17, Byte.valueOf((byte)1));
    }

	//@Override
	public boolean isStupidToAttack() 
	{
		return true;
	}

	//@Override
	public boolean doNotVaporize() 
	{
		return false;
	}

	//@Override
	public boolean isPredator() 
	{
		return false;
	}

	//@Override
	public boolean isHostile() 
	{
		return true;
	}

	//@Override
	public boolean isPeaceful() 
	{
		return false;
	}

	//@Override
	public boolean isPrey() 
	{
		return false;
	}

	//@Override
	public boolean isNeutral() 
	{
		return false;
	}

	//@Override
	public boolean isUnkillable()
	{
		return false;
	}

	//@Override
	public boolean isThreatTo(Entity par1entity) 
	{
		return true;
	}

	//@Override
	public boolean isFriendOf(Entity par1entity)
	{
		return false;
	}

	//@Override
	public boolean isNPC() 
	{
		return false;
	}

	//@Override
	public int isPet() 
	{
		return 0;
	}

	//@Override
	public Entity getPetOwner() 
	{
		return null;
	}

	//@Override
	public String getName()
	{
		return "Nightmare Creeper";
	}

	//@Override
	public Entity getAttackingTarget() 
	{
		return this.entityToAttack;
	}

	//@Override
	public float getSize() 
	{
		return 0;
	}

	//@Override
	public String getSpecies() 
	{
		return "Creeper";
	}

	//@Override
	public int getTier() 
	{
		return 4;
	}

	//@Override
	public int getGender() 
	{
		return 0;
	}

	//@Override
	public String customStringAndResponse(String s)
	{
		return null;
	}

	//@Override
	public String getSimplyID()
	{
		return SimplyID.getNextSimplyID(this);
	}
}
