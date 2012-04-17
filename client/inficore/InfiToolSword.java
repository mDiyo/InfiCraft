package net.minecraft.src.inficore;

import net.minecraft.src.forge.ITextureProvider;
import java.util.Random;
import net.minecraft.src.*;

public class InfiToolSword extends InfiWeaponCore
{
    private static Material materialEffectiveAgainst[];

    public InfiToolSword(int itemID, InfiMaterialEnum head, InfiMaterialEnum handle, String internalName)
    {
    	super(itemID, 4, head, handle, internalName);
    }

    public String getTextureFile()
    {
        return "/inficore/swords.png";
    }
    
    public float getStrVsBlock(ItemStack par1ItemStack, Block par2Block)
    {
        return par2Block.blockID == Block.web.blockID ? 15.0F : 1.5F;
    }
    
    public float getStrVsBlock(ItemStack par1ItemStack, Block par2Block, int md)
    {
        return par2Block.blockID == Block.web.blockID ? 15.0F : 1.5F;
    }

	@Override
	public String getInvName() 
	{
		return "Sword";
	}
}
