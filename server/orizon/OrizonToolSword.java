package net.minecraft.src.orizon;
import net.minecraft.src.*;
import net.minecraft.src.forge.*;

public class OrizonToolSword extends ItemSword
	implements ITextureProvider
{

    public OrizonToolSword(int par1, EnumToolMaterial mat)
    {
        super(par1, mat);
    }
    
    @Override
	public String getTextureFile() {
		return "/oretex/orizonitems.png";
	}
}
