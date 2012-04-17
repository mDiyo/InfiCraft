package net.minecraft.src;
import net.minecraft.src.forge.*;
import net.minecraft.src.infihybrids.*;

public class mod_InfiHybrids extends BaseMod
{
	
	public mod_InfiHybrids()
	{
		
	}

	@Override
	public String getVersion() 
	{
		return "2.9.1";
	}

	@Override
	public void load() 
	{
		PropsHelperInfiHybrids.initProps();
		IceAxes.init();
		Mattocks.init();
		Mallets.init();
		Machetes.init();
		Scythes.init();
		oreDictionarySupport();
	}
	
	private void oreDictionarySupport()
	{
	    MinecraftForge.registerOreHandler(new IOreHandler()
	    {
	        public void registerOre(String ore, ItemStack itemstack)
	        {
	            if(PropsHelperInfiHybrids.enableCopperTools && ore.equals("ingotCopper"))
	            {
	            	IceAxes.addCopperTools(itemstack);
	            	Mattocks.addCopperTools(itemstack);
	            	Mallets.addCopperTools(itemstack);
	            	Machetes.addCopperTools(itemstack);
	            	Scythes.addCopperTools(itemstack);
	            }
	            if(PropsHelperInfiHybrids.enableBronzeTools && ore.equals("ingotBronze"))
	            {
		            IceAxes.addBronzeTools(itemstack);
		            Mattocks.addBronzeTools(itemstack);
		            Mallets.addBronzeTools(itemstack);
		            Machetes.addBronzeTools(itemstack);
		            Scythes.addBronzeTools(itemstack);
	            }
	            if(PropsHelperInfiHybrids.enableWorkedIronTools && ore.equals("ingotRefinedIron"))
	            {
		            IceAxes.addWorkedIronTools(itemstack);
		            Mattocks.addWorkedIronTools(itemstack);
		            Mallets.addWorkedIronTools(itemstack);
		            Machetes.addWorkedIronTools(itemstack);
		            Scythes.addWorkedIronTools(itemstack);
	            }
	            if(PropsHelperInfiHybrids.enableSteelTools && ore.equals("ingotSteel"))
	            {
		            IceAxes.addSteelTools(itemstack);
		            Mattocks.addSteelTools(itemstack);
		            Mallets.addSteelTools(itemstack);
		            Machetes.addSteelTools(itemstack);
		            Scythes.addSteelTools(itemstack);
	            }
	            if(PropsHelperInfiHybrids.enableCobaltTools && ore.equals("ingotCobalt"))
	            {
		            IceAxes.addCobaltTools(itemstack);
		            Mattocks.addCobaltTools(itemstack);
		            Mallets.addCobaltTools(itemstack);
		            Machetes.addCobaltTools(itemstack);
		            Scythes.addCobaltTools(itemstack);
	            }
	            if(PropsHelperInfiHybrids.enableArditeTools && ore.equals("ingotArdite"))
	            {
		            IceAxes.addArditeTools(itemstack);
		            Mattocks.addArditeTools(itemstack);
		            Mallets.addArditeTools(itemstack);
		            Machetes.addArditeTools(itemstack);
		            Scythes.addArditeTools(itemstack);
	            }
	            if(PropsHelperInfiHybrids.enableManyullynTools && ore.equals("ingotManyullyn"))
	            {
	            	IceAxes.addManyullynTools(itemstack);
	            	Mattocks.addManyullynTools(itemstack);
	            	Mallets.addManyullynTools(itemstack);
	            	Machetes.addManyullynTools(itemstack);
	            	Scythes.addManyullynTools(itemstack);
	            }
	            if(PropsHelperInfiHybrids.enableUraniumTools && ore.equals("ingotUranium"))
	            {
		            IceAxes.addUraniumTools(itemstack);
		            Mattocks.addUraniumTools(itemstack);
		            Mallets.addUraniumTools(itemstack);
		            Machetes.addUraniumTools(itemstack);
		            Scythes.addUraniumTools(itemstack);
	            }
	            if(PropsHelperInfiHybrids.enableStoneTools && (ore.equals("customCobblestone") || ore.equals("customStone")))
	            {
		            IceAxes.addStoneTools(itemstack);
		            Mattocks.addStoneTools(itemstack);
		            Mallets.addStoneTools(itemstack);
		            Machetes.addStoneTools(itemstack);
		            Scythes.addStoneTools(itemstack);
	            }
	        }
	    } );
	}

}
