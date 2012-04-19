package net.minecraft.src.orizon;
import net.minecraft.src.*;
import net.minecraft.src.forge.*;

public class OrizonToolPickaxe extends ItemPickaxe
    implements ITextureProvider
{
    public OrizonToolPickaxe(int itemID, EnumToolMaterial mat)
    {
    	super(itemID, mat);
    }
    
    @Override
	public String getTextureFile() {
		return "/oretex/orizonitems.png";
	}
}
