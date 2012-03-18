package net.minecraft.src.orizon;
import net.minecraft.src.*;
import net.minecraft.src.forge.*;

public class OrizonToolPickaxe extends ItemPickaxe
    implements ITextureProvider
{
    private static Material materialEffectiveAgainst[];

    public OrizonToolPickaxe(int itemID, EnumToolMaterial mat)
    {
        //super(itemID, mat, 1, materialEffectiveAgainst);
    	super(itemID, mat);
    }
    
    @Override
	public String getTextureFile() {
		return "/oretex/orizonitems.png";
	}

    /*static
    {
        materialEffectiveAgainst = (new Material[]
        {
            Material.rock, Material.iron, Material.ice, Material.glass, Material.piston
        });
    }*/
}
