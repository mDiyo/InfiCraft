package net.minecraft.src;
import net.minecraft.src.forge.NetworkMod;

public class mod_4096Fix extends NetworkMod
{
	@Override
	public String getVersion() 
	{
		return "v4 for 1.2.5";
	}
	
	public void load() {}
	
	@Override
	public boolean clientSideRequired()
    {
        return true;
    }

	@Override
    public boolean serverSideRequired()
    {
        return true;
    }
	
	public static boolean hasIDResolver;
	 
    static {
            try {
                    Class<?> class1 = Class.forName("net.minecraft.src.IDResolver");
                    hasIDResolver = true;
            } catch (Exception e) {
                    try {
                            Class<?> class1 = Class.forName("IDResolver");
                            hasIDResolver = true;
                    } catch (Exception e2) {
                    }
            }
    }

}