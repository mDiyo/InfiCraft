package net.minecraft.src;

import java.util.Map;
import java.io.File;
import net.minecraft.client.Minecraft;
import net.minecraft.src.forge.NetworkMod;
import net.minecraft.src.wallpaper.EntityWallpaper_Kaevator;
import net.minecraft.src.wallpaper.ItemWallpaper_Kaevator;
import net.minecraft.src.wallpaper.RenderWallpaper_Kaevator;
import net.minecraft.src.wallpaper.Wallpaper_Props;

public class mod_Kaevator_Wallpaper extends BaseMod
{
    public static void prepareProps()
    { 
		props.getInt("wallpaperID", 1510);
		props.getInt("nb_motives", 24);
    }    
	
    public mod_Kaevator_Wallpaper()
    {  		
		wallpaperItem = new ItemWallpaper_Kaevator(props.getInt("wallpaperID", 1510)).setIconIndex(ModLoader.addOverride("/gui/items.png", "/kaevator/itemWallpaper.png")).setItemName("wallpaper");
		nb_motives = props.getInt("nb_motives");
			
		ModLoader.registerEntityID(EntityWallpaper_Kaevator.class, "Wallpaper", ModLoader.getUniqueEntityId());
		        
		ModLoader.addName(wallpaperItem, "Wallpaper");	
        
		ModLoader.addRecipe(new ItemStack(wallpaperItem, 6), new Object[] {
            "#A","#A","#A", Character.valueOf('#'), Item.paper, Character.valueOf('A'), Block.cloth
        });  		
    }    

	public void addRenderer(Map map)
    {
		map.put(EntityWallpaper_Kaevator.class, new RenderWallpaper_Kaevator());
    }    
   
	public static Item wallpaperItem;  
	public static int nb_motives;  
    private static Wallpaper_Props props;   	

    static 
    {
        props = new Wallpaper_Props((new File((new StringBuilder()).append(Minecraft.getMinecraftDir()).append("/").append("/config/mod_Wallpaper.props").toString())).getPath());
        prepareProps();        
    }

	@Override
	public String getVersion() {
		return "1.2.4 Infi";
	}

	@Override
	public void load() {
		// TODO Auto-generated method stub
		
	}
	
	//@Override
	public boolean clientSideRequired() 
	{
		return true;
	}

	//@Override
	public boolean serverSideRequired() 
	{
		return true;
	}
}
