package inficraft.armory;

import net.minecraft.server.MinecraftServer;
import net.minecraft.src.Container;
import net.minecraft.src.DamageSource;
import net.minecraft.src.Entity;
import net.minecraft.src.EntityLiving;
import net.minecraft.src.EntityPlayer;
import net.minecraft.src.IInventory;
import net.minecraft.src.ItemStack;
import net.minecraft.src.MathHelper;
import net.minecraft.src.PotionEffect;
import net.minecraft.src.World;
import net.minecraft.src.WorldServer;

/*
 * Dummy class, used for rendering equipment and nothing else!
 */

public abstract class EntityEquipment extends EntityLiving
	implements IInventory
{
	public EntityEquipment(World par1World) 
	{
		super(par1World);
	}
	
	public abstract Container getContainer(EntityPlayer player);
	
	public String getTexture()
	{
		return this.texture;
	}
	
	protected void kill()
    {
        this.attackEntityFrom(DamageSource.outOfWorld, 1000);
    }
	
	public int getMaxHealth() { return 500; }	
	public boolean canBePushed() { return false; }	
	protected int decreaseAirSupply(int par1) { return 0; }	
	public boolean attackEntityFrom(DamageSource par1DamageSource, int par2) { return false; }	
	protected void damageEntity(DamageSource par1DamageSource, int par2) { super.damageEntity(par1DamageSource, par2); }
	protected void updateFallState(double par1, boolean par3) {}
	public void knockBack(Entity par1Entity, int par2, double par3, double par5) {}
	protected void fall(float par1) {}
	public void moveEntityWithHeading(float par1, float par2) {}
	public boolean canBreatheUnderwater() { return true; }
	public void onLivingUpdate() { super.onLivingUpdate(); }
	public boolean isBlocking() { return true; }
	protected void jump() {}
	protected boolean canDespawn() { return true; }
	protected void despawnEntity() { super.despawnEntity(); }
	protected void updateAITasks() {}
	protected void updateEntityActionState() {}
	protected void updateArmSwingProgress() {}
	public boolean getCanSpawnHere() { return false; }
	protected void updatePotionEffects() {}
	public void addPotionEffect(PotionEffect par1PotionEffect) {}
	public boolean isPotionApplicable(PotionEffect par1PotionEffect) { return false; }
}
