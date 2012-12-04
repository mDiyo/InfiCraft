package pchan3;

import java.util.Map;

import net.minecraft.src.Block;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;
import net.minecraft.src.ModLoader;


public class mod_steamboat
{

    public mod_steamboat()
    {
        ModLoader.addName(steamBoat, "Steam Boat");
        
        ModLoader.registerEntityID(EntitySteamBoat.class, "SteamBoat", ModLoader
				.getUniqueEntityId());
        ModLoader.addRecipe(new ItemStack(steamBoat, 1), new Object[] {
            "#X#", "###", Character.valueOf('#'), Block.planks, Character.valueOf('X'), Item.ingotIron
        });
    }



    public void AddRenderer(Map map)
    {
        map.put(EntitySteamBoat.class, new RenderSteamBoat());
    }  

    public static Item steamBoat = (new ItemSteamBoat(5154)).setIconIndex(
			ModLoader.addOverride("/gui/items.png", "/gui/steamboat.png"))
			.setItemName("Steamboat");

}
