package net.minecraft.src.orizondim;
import net.minecraft.src.*;

public class WorldProviderOrizon extends WorldProviderSurface
{
    /**
     * creates a new world chunk manager for WorldProvider
     */
	public static BiomeGenBase[] biomes = {
			mod_Orizon.plains, mod_Orizon.desert, mod_Orizon.ocean,
			mod_Orizon.forest, mod_Orizon.swampland, mod_Orizon.taiga,
			mod_Orizon.frozenOcean, mod_Orizon.frozenRiver, mod_Orizon.icePlains,
			
			mod_Orizon.forestHills, mod_Orizon.taigaHills,
			mod_Orizon.jungle, mod_Orizon.jungleHills, mod_Orizon.desertHills
			//mod_Orizon.river
    	};
	
	private float[] colorsSunriseSunsetOrizon = new float[4];
	
    public void registerWorldChunkManager()
    {    	
    	this.worldChunkMgr = new WorldChunkManagerOrizon(biomes, WorldType.DEFAULT, 1.0F, 0.0F);
        /*this.isHellWorld = false;
        this.hasNoSky = false;*/
        this.worldType = 47;
    }

    /**
     * Return Vec3D with biome specific fog color
     */
    public Vec3D getFogColor(float par1, float par2)
    {
    	float var3 = MathHelper.cos(par1 * (float)Math.PI * 2.0F) * 2.0F + 0.5F;

        if (var3 < 0.0F)
        {
            var3 = 0.0F;
        }

        if (var3 > 1.0F)
        {
            var3 = 1.0F;
        }

        float var4 = 0.5F;
        float var5 = 1F;
        float var6 = 1F;
        var4 *= var3 * 0.94F + 0.06F;
        var5 *= var3 * 0.94F + 0.06F;
        var6 *= var3 * 0.91F + 0.09F;
        return Vec3D.createVector((double)var4, (double)var5, (double)var6);
    }
    
    /*public int getAverageGroundLevel()
    {
        return 128;
    }*/
    
    public float getCloudHeight()
    {
        return 0.0F;
    }

    /*public boolean isSkyColored()
    {
        return true;
    }*/

    /**
     * Creates the light to brightness table
     */
    /*protected void generateLightBrightnessTable()
    {
        float var1 = 0.0F;

        for (int var2 = 0; var2 <= 15; ++var2)
        {
            float var3 = 1.0F - (float)var2 / 15.0F;
            this.lightBrightnessTable[var2] = (1.0F - var3) / (var3 * 3.0F + 1.0F) + var1;
        }
    }*/

    /**
     * Returns the chunk provider back for the world provider
     */
    public IChunkProvider getChunkProvider()
    {
        return new ChunkProviderOrizon(this.worldObj, this.worldObj.getSeed(), false, biomes);
    }
    
    public float[] calcSunriseSunsetColors(float par1, float par2)
    {
        float var3 = 0.4F;
        float var4 = MathHelper.cos(par1 * (float)Math.PI * 2.0F) - 0.0F;
        float var5 = -0.0F;

        if (var4 >= var5 - var3 && var4 <= var5 + var3)
        {
            float var6 = (var4 - var5) / var3 * 0.5F + 0.5F;
            float var7 = 1.0F - (1.0F - MathHelper.sin(var6 * (float)Math.PI)) * 0.99F;
            var7 *= var7;
            this.colorsSunriseSunsetOrizon[0] = var6 * 0.3F + 0.7F;
            this.colorsSunriseSunsetOrizon[1] = var6 * var6 * 0.7F + 0.2F;
            this.colorsSunriseSunsetOrizon[2] = var6 * var6 * 2.0F + 0.2F;
            this.colorsSunriseSunsetOrizon[3] = var7;
            return this.colorsSunriseSunsetOrizon;
        }
        else
        {
            return null;
        }
    }
    
    /*public int getMoonPhase(long par1, float par3)
    {
        return 0;
    }*/
    
    public double getVoidFogYFactor()
    {
        return 1.0D;
    }
    
    /*protected void generateLightBrightnessTable()
    {
        float var1 = 0.0F;

        for (int var2 = 0; var2 <= 15; ++var2)
        {
            float var3 = 1.0F - (float)var2 / 15.0F;
            this.lightBrightnessTable[var2] = (1.0F - var3) / (var3 * 3.0F + 1.0F) * (1.0F - var1) + var1;
        }
    }*/

    /*public boolean func_48217_e()
    {
        return false;
    }*/

    /**
     * Will check if the x, z position specified is alright to be set as the map spawn point
     */
    /*public boolean canCoordinateBeSpawn(int par1, int par2)
    {
        return false;
    }*/

    /**
     * Calculates the angle of sun and moon in the sky relative to a specified time (usually worldTime)
     */
    /*public float calculateCelestialAngle(long par1, float par3)
    {
        int var4 = (int)(par1 % 24000L);
        float var5 = ((float)var4 + par3) / 24000.0F - 0.25F;

        if (var5 < 0.0F)
        {
            ++var5;
        }

        if (var5 > 1.0F)
        {
            --var5;
        }

        float var6 = var5;
        var5 = 1.0F - (float)((Math.cos((double)var5 * Math.PI) + 1.0D) / 2.0D);
        var5 = var6 + (var5 - var6) / 3.0F;
        return var5;
    }*/

    /**
     * True if the player can respawn in this dimension (true = overworld, false = nether).
     */
    /*public boolean canRespawnHere()
    {
        return true;
    }*/

    /*public boolean func_48218_b(int par1, int par2) //Fog
    {
        return true;
    }*/

    @Override
    public String getSaveFolder() 
    {
        return "DIM-Orizon";
    }

    @Override
    public String getWelcomeMessage() 
    {
        return "Sweet Dreams";
    }

    @Override
    public String getDepartMessage() 
    {
        return "Leaving Orizon";
    }
    
    @Override
    public double getMovementFactor()
    {
        return 2.0;
    }
}
