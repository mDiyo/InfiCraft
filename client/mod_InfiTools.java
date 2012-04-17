package net.minecraft.src;
import net.minecraft.src.forge.*;
import net.minecraft.src.inficore.*;

public class mod_InfiTools extends BaseMod
{
	
	public mod_InfiTools()
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
		PropsHelperInfiTools.initProps();
		Pickaxes.init();
		Swords.init();
		Shovels.init();
		Axes.init();
		Hoes.init();
		oreDictionarySupport();
	}
	
	private void oreDictionarySupport()
	{
	    MinecraftForge.registerOreHandler(new IOreHandler()
	    {
	        public void registerOre(String ore, ItemStack itemstack)
	        {
	            if(PropsHelperInfiTools.enableCopperTools && ore.equals("ingotCopper"))
	            {
	            	Pickaxes.addCopperTools(itemstack);
	            	Swords.addCopperTools(itemstack);
	            	Shovels.addCopperTools(itemstack);
	            	Axes.addCopperTools(itemstack);
	            	Hoes.addCopperTools(itemstack);
	            }
	            if(PropsHelperInfiTools.enableBronzeTools && ore.equals("ingotBronze"))
	            {
		            Pickaxes.addBronzeTools(itemstack);
		            Swords.addBronzeTools(itemstack);
		            Shovels.addBronzeTools(itemstack);
		            Axes.addBronzeTools(itemstack);
		            Hoes.addBronzeTools(itemstack);
	            }
	            if(PropsHelperInfiTools.enableWorkedIronTools && ore.equals("ingotRefinedIron"))
	            {
		            Pickaxes.addWorkedIronTools(itemstack);
		            Swords.addWorkedIronTools(itemstack);
		            Shovels.addWorkedIronTools(itemstack);
		            Axes.addWorkedIronTools(itemstack);
		            Hoes.addWorkedIronTools(itemstack);
	            }
	            if(PropsHelperInfiTools.enableSteelTools && ore.equals("ingotSteel"))
	            {
	            	System.out.println("Adding steel tools");
		            Pickaxes.addSteelTools(itemstack);
		            Swords.addSteelTools(itemstack);
		            Shovels.addSteelTools(itemstack);
		            Axes.addSteelTools(itemstack);
		            Hoes.addSteelTools(itemstack);
	            }
	            if(PropsHelperInfiTools.enableCobaltTools && ore.equals("ingotCobalt"))
	            {
		            Pickaxes.addCobaltTools(itemstack);
		            Swords.addCobaltTools(itemstack);
		            Shovels.addCobaltTools(itemstack);
		            Axes.addCobaltTools(itemstack);
		            Hoes.addCobaltTools(itemstack);
	            }
	            if(PropsHelperInfiTools.enableArditeTools && ore.equals("ingotArdite"))
	            {
		            Pickaxes.addArditeTools(itemstack);
		            Swords.addArditeTools(itemstack);
		            Shovels.addArditeTools(itemstack);
		            Axes.addArditeTools(itemstack);
		            Hoes.addArditeTools(itemstack);
	            }
	            if(PropsHelperInfiTools.enableManyullynTools && ore.equals("ingotManyullyn"))
	            {
	            	Pickaxes.addManyullynTools(itemstack);
	            	Swords.addManyullynTools(itemstack);
	            	Shovels.addManyullynTools(itemstack);
	            	Axes.addManyullynTools(itemstack);
	            	Hoes.addManyullynTools(itemstack);
	            }
	            if(PropsHelperInfiTools.enableUraniumTools && ore.equals("ingotUranium"))
	            {
		            Pickaxes.addUraniumTools(itemstack);
		            Swords.addUraniumTools(itemstack);
		            Shovels.addUraniumTools(itemstack);
		            Axes.addUraniumTools(itemstack);
		            Hoes.addUraniumTools(itemstack);
	            }
	            if(PropsHelperInfiTools.enableStoneTools && (ore.equals("customCobblestone") || ore.equals("customStone")))
	            {
		            Pickaxes.addStoneTools(itemstack);
		            Swords.addStoneTools(itemstack);
		            Shovels.addStoneTools(itemstack);
		            Axes.addStoneTools(itemstack);
		            Hoes.addStoneTools(itemstack);
	            }
	        }
	    } );
	}

}
