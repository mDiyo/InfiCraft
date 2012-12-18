package inficraft.orizon.slimepools;

import net.minecraft.entity.monster.EntitySlime;
import net.minecraft.world.World;

public class AirwaterSlimeEntity extends EntitySlime
{

	public AirwaterSlimeEntity(World par1World) {
		super(par1World);
	}

	@Override
	public boolean handleWaterMovement()
	{
		return true;
	}
	
	@Override
	public boolean canBreatheUnderwater()
	{
		return true;
	}
	
	@Override
	public boolean isInWater()
	{
		return false;
	}
	
	@Override
	protected int decreaseAirSupply(int par1)
	{
		return 0;
	}
	
	protected boolean canDespawn()
	{
		return true;
	}
	
	@Override
	public void onEntityUpdate()
    {
        super.onEntityUpdate();
        setAir(300);
    }
}
