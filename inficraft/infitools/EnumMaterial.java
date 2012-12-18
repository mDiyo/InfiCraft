package inficraft.infitools;

public enum EnumMaterial
{
	//Mining level, durabilit, mining speed, enchantibility, material type, handle modifier, durability quantity, shoddy
	Wood(0, 59, 2.0F, 0, 1.0F),
    Stone(1, 131, 4.0F, 1, 0.5F),
    Iron(2, 250, 6.0F, 2, 1.3F),
    Flint(1, 171, 5.25F, 2, 0.7F),
    Cactus(1, 150, 5.0F, 2, 1.0F),
    Obsidian(3, 89, 8F, 2, 0.8F),
    Bone(1, 200, 5.0F, 2, 1.0F),
    Slime(3, 1500, 1.5F, 0, 5.0F),
    Paper(0, 131, 2.0F, 0, 0.1F ),
    Netherrack(2, 131, 4.0F, 1, 1.2F),
    Cobalt(4, 800, 8.0F, 3, 1.8F),
    Ardite(4, 800, 8.0F, 3, 1.8F),
    Manyullyn(5, 1200, 12.0F, 4, 2.5F),
    Demonite(5, 1790, 9.0F, 5, 1.66F),
    Holyshell(5, 1000, 7.0F, 1, 1.5F);
    
    //mining level, durability, mining speed, baseDamage, handle modifier
    
    private final int harvestLevel;
    private final int durability;
    private final float miningspeed;
    private final int damageVsEntity;
    private final float handleDurability;

    private EnumMaterial(int level, int dur, float speed, int damage, float handle)
    {
        this.harvestLevel = level;
        this.durability = dur;
        this.miningspeed = speed;
        this.damageVsEntity = damage;
        this.handleDurability = handle;
    }
    
    /**
     * The number of uses this material allows. (wood = 59, stone = 131, iron = 250, diamond = 1561, gold = 32)
     */
    public int durability()
    {
        return this.durability;
    }

    /**
     * The strength of this tool material against blocks which it is effective against.
     */
    public float toolSpeed()
    {
        return this.miningspeed;
    }
    
    public static float toolSpeed(int type)
    {
    	return getEnumByType(type).toolSpeed();
    }

    /**
     * Damage versus entities.
     */
    public int damage()
    {
        return this.damageVsEntity;
    }
    
    public int harvestLevel()
    {
        return this.harvestLevel;
    }
    
    public static float harvestLevel(int type)
    {
    	return getEnumByType(type).harvestLevel();
    }
    
    public float handleDurability()
    {
    	return this.handleDurability;
    }
    
    static EnumMaterial getEnumByType(int type)
    {
    	switch (type)
    	{
    	case 0: return Wood;
    	case 1: return Stone;
    	case 2: return Iron;
    	case 3: return Flint;
    	case 4: return Cactus;
    	case 5: return Obsidian;
    	case 6: return Bone;
    	case 7: return Slime;
    	case 8: return Paper;
    	case 9: return Netherrack;
    	case 10: return Cobalt;
    	case 11: return Ardite;
    	case 12: return Manyullyn;
    	case 13: return Demonite;
    	case 14: return Holyshell;
    	}
    	return null;
    }
}
