package net.minecraft.src;

public enum InfiMaterialEnum
{
    Wood(0, 59, 2.0F, 0, 15, 1, 1.0F, 0, false),
    Stone(1, 131, 4.0F, 1, 5, 2, 1.2F, 0, true),
    Iron(2, 250, 6.0F, 2, 14, 3, 1.5F, 1, false),
    Diamond(3, 1561, 8.0F, 3, 10, 4, 2.0F, 2, false),
    Gold(0, 32, 12.0F, 0, 22, 5, 0.5F, 0, false),
    Redstone(3, 71, 12F, 3, 18, 6, 1.0F, 0, false),
    Obsidian(3, 89, 8F, 2, 14, 7, 1.8F, 5, false),
    Sandstone(0, 48, 2.5F, 0, 5, 8, 0.9F, 0, true),
    Bone(1, 200, 5.0F, 2, 13, 9, 1.5F, 0, false),
    Paper(0, 131, 2.0F, 0, 0, 10, 1.0F, 0, true),
    Mossy(4, 1000, 8.0F, 3, 22, 11, 1.8F, 0, false),
    Netherrack(1, 131, 4.0F, 1, 8, 12, 1.2F, 0, true),
    Glowstone(2, 849, 6.0F, 1, 12, 13, 1.3F, 0, false),
    Ice(0, 49, 4.0F, 0, 18, 14, 1.0F, 0, false),
    Lava(3, 636, 4.0F, 3, 13, 15, 2.4F, 0, true),
    Slime(6, 9001, 2.0F, 0, 15, 16, 1.0F, 0, false),
    Cactus(1, 150, 5.0F, 2, 14, 17, 1.2F, 0, true),
    Flint(1, 171, 5.0F, 2, 5, 18, 1.2F, 0, false),
    Brick(0, 82, 4.0F, 0, 5, 19, 0.7F, 0, true),
    Blaze(4, 1231, 4.0F, 5, 12, 20, 1.58F, 0, true),
    Copper(1, 180, 5.0F, 1, 7, 21, 1.3F, 1, false),
    Bronze(2, 350, 5.0F, 1, 8, 22, 1.4F, 1, false),
    WorkedIron(2, 400, 6.5F, 2, 14, 23, 1.5F, 2, false),
    Steel(3, 550, 7.0F, 2, 14, 24, 1.6F, 2, false),
    Cobalt(4, 800, 8.0F, 3, 12, 25, 1.8F, 1, false),
    Ardite(4, 800, 8.0F, 3, 12, 26, 1.8F, 1, false),
    Manyullyn(5, 1200, 12.0F, 4, 8, 27, 2.5F, 2, false),
    Demonite(6, 1790, 13.0F, 5, 27, 28, 2.2F, 0, false),
    Holystone(5, 2500, 9.0F, 3, 18, 29, 2.0F, 0, false),
    Holyshell(5, 1000, 7.0F, 2, 18, 30, 1.5F, 0, false),
    Uranium(3, 450, 5.0F, 3, 22, 31, 1.5F, 1, true);

    private final int harvestLevel;
    private final int durability;
    private final float miningspeed;
    private final int damageVsEntity;
    private final int enchantability;    
    private final int materialType;    
    private final float durabilityBonus;    
    private final int unbreakingLevel;    
    private final boolean isShoddy;

    private InfiMaterialEnum(int level, int dur, float speed, int damage, int enchantibility, int type, 
    		float bonus, int unbreaking, boolean shoddy)
    {
        this.harvestLevel = level;
        this.durability = dur;
        this.miningspeed = speed;
        this.damageVsEntity = damage;
        this.enchantability = enchantibility;
        this.materialType = type;
        this.durabilityBonus = bonus;
        this.unbreakingLevel = unbreaking;
        this.isShoddy = shoddy;
    }

    /**
     * The number of uses this material allows. (wood = 59, stone = 131, iron = 250, diamond = 1561, gold = 32)
     */
    public int getDurability()
    {
        return this.durability;
    }

    /**
     * The strength of this tool material against blocks which it is effective against.
     */
    public float getSpeed()
    {
        return this.miningspeed;
    }

    /**
     * Damage versus entities.
     */
    public int getDamage()
    {
        return this.damageVsEntity;
    }

    /**
     * The level of material this tool can harvest (3 = DIAMOND, 2 = IRON, 1 = STONE, 0 = IRON/GOLD)
     */
    public int getHarvestLevel()
    {
        return this.harvestLevel;
    }

    /**
     * Return the natural enchantability factor of the material.
     */
    public int getEnchantability()
    {
        return this.enchantability;
    }
    
    public int getMaterialType()
    {
    	return this.materialType;
    }
    
    public float getDurabilityBonus()
    {
    	return this.durabilityBonus;
    }
    
    public int getUnbreakingLevel()
    {
    	return this.unbreakingLevel;
    }
    
    public boolean getShoddy()
    {
    	return isShoddy;
    }
}
