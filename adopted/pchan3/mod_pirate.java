package pchan3;

import java.util.Map;

import net.minecraft.entity.EnumCreatureType;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.src.ModLoader;
import net.minecraft.world.biome.BiomeGenBase;


public class mod_pirate
{


	public mod_pirate() {
  
		ModLoader.registerEntityID(EntityPirate.class, "Pirate", ModLoader.getUniqueEntityId());    
	     
	    ModLoader.addSpawn(EntityPirate.class, 6,5,5, EnumCreatureType.monster, new BiomeGenBase[]{BiomeGenBase.swampland,BiomeGenBase.plains,BiomeGenBase.taiga,BiomeGenBase.sky});
	   
	}

	public void AddRecipes(CraftingManager craftingmanager) {
	
		
	}


	public void AddRenderer(Map map) {
		map.put(EntityPirate.class, new RenderPirate(new ModelPirate(), new ModelBalloon(), 1.0f));
	}


}


