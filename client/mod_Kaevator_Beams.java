package net.minecraft.src;

import java.util.Map;
import java.io.File;
import net.minecraft.client.Minecraft;
import net.minecraft.src.forge.NetworkMod;
import net.minecraft.src.timberframes.Beams_Props;
import net.minecraft.src.timberframes.EntityBeams_Kaevator;
import net.minecraft.src.timberframes.ItemBeams_Kaevator;
import net.minecraft.src.timberframes.RenderBeams_Kaevator;

public class mod_Kaevator_Beams extends BaseMod
{
    public static void prepareProps()
    { 
		props.getInt("beamsID", 1501);
    }    
	
    public mod_Kaevator_Beams()
    {  		
    	woodBeamItemIndex = ModLoader.addOverride("/gui/items.png", "/kaevator/itemWoodBeams.png");
    	steelBeamItemIndex = ModLoader.addOverride("/gui/items.png", "/kaevator/itemSteelBeams.png");
    	
		beamsItem = new ItemBeams_Kaevator(props.getInt("beamsID", 1501)).setIconIndex(woodBeamItemIndex).setItemName("beams");
        		
		ModLoader.registerEntityID(EntityBeams_Kaevator.class, "Beams", ModLoader.getUniqueEntityId());
		        
		ModLoader.addName(beamsItem, "Beams");	
        
		ModLoader.addRecipe(new ItemStack(beamsItem, 2, 0), new Object[] {
            "  #"," # ","#  ", Character.valueOf('#'), Block.planks
        });  	
		ModLoader.addRecipe(new ItemStack(beamsItem, 2, 1), new Object[] {
            "  #"," # ","#  ", Character.valueOf('#'), Item.ingotIron
        }); 
    }    

	public void addRenderer(Map map)
    {
		map.put(EntityBeams_Kaevator.class, new RenderBeams_Kaevator());
    }    
   
	public static int woodBeamItemIndex;
	public static int steelBeamItemIndex;
	public static Item beamsItem;   
    private static Beams_Props props;    
	public static String TextureName;	

    static 
    {
        props = new Beams_Props((new File((new StringBuilder()).append(Minecraft.getMinecraftDir()).append("/").append("/config/mod_Beams.props").toString())).getPath());
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
