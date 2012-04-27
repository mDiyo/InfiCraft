package net.minecraft.src;
import java.util.Map;

import net.minecraft.src.forge.*;
import net.minecraft.src.infirange.*;

public class mod_InfiRange extends BaseMod
{
	public static boolean infitoolsPresent = true;
	
	@Override
	public String getVersion() 
	{
		return "1.0pre";
	}

	@Override
	public void load() 
	{
		PropsHelperInfiRange.initProps();
		//checkForInfiTools();
		Spears.init();
		
		oreDictionarySupport();
	}
	
	public static void checkForInfiTools()
    {
        try
        {
        	Class class1 = Class.forName("mod_InfiTools");
        	infitoolsPresent = true;
        }
        catch (Throwable throwable)
        {
        	infitoolsPresent = false;
        }
    }	
	
	private void oreDictionarySupport()
	{
		if (infitoolsPresent)
		{
		    MinecraftForge.registerOreHandler(new IOreHandler()
		    {
		        public void registerOre(String ore, ItemStack itemstack)
		        {
		            if(PropsHelperInfiRange.enableCopperTools && ore.equals("ingotCopper"))
		            {
		            	Spears.addCopperTools(itemstack);
		            	
		            	
		            	
		            	
		            }
		            if(PropsHelperInfiRange.enableBronzeTools && ore.equals("ingotBronze"))
		            {
			            Spears.addBronzeTools(itemstack);
			            
			            
			            
			            
		            }
		            if(PropsHelperInfiRange.enableWorkedIronTools && ore.equals("ingotRefinedIron"))
		            {
			            Spears.addWorkedIronTools(itemstack);
			            
			            
			            
			            
		            }
		            if(PropsHelperInfiRange.enableSteelTools && ore.equals("ingotSteel"))
		            {
			            Spears.addSteelTools(itemstack);
			            
			            
			            
			            
		            }
		            if(PropsHelperInfiRange.enableCobaltTools && ore.equals("ingotCobalt"))
		            {
			            Spears.addCobaltTools(itemstack);
			            
			            
			            
			            
		            }
		            if(PropsHelperInfiRange.enableArditeTools && ore.equals("ingotArdite"))
		            {
			            Spears.addArditeTools(itemstack);
			            
			            
			            
			            
		            }
		            if(PropsHelperInfiRange.enableManyullynTools && ore.equals("ingotManyullyn"))
		            {
		            	Spears.addManyullynTools(itemstack);
		            	
		            	
		            	
		            	
		            }
		            if(PropsHelperInfiRange.enableUraniumTools && ore.equals("ingotUranium"))
		            {
			            Spears.addUraniumTools(itemstack);
			            
			            
			            
			            
		            }
		            if(PropsHelperInfiRange.enableStoneTools && (ore.equals("customCobblestone") || ore.equals("customStone")))
		            {
			            Spears.addStoneTools(itemstack);
			            
			            
			            
			            
		            }
		        }
		    } );
		}
	}
	
	public void addRenderer(Map map)
    {
        map.put(net.minecraft.src.infirange.SpearEntity.class, new SpearRender());
    }

}
