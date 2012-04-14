package net.minecraft.src.zipline;
import net.minecraft.src.*;

public interface IZipline
{
    boolean mountZipline(ItemStack var1, EntityLiving var2, World var3, int var4, int var5, int var6, int var7);

    double getZiplineFriction(Entity var1, World var2, int var3, int var4, int var5, int var6);

    Vec3D getZiplineMotion(Entity var1, World var2, int var3, int var4, int var5, int var6);

    void conformToZipline(Entity var1, World var2, int var3, int var4, int var5, int var6);

    StepSound getStepSound(Entity var1, World var2, int var3, int var4, int var5, int var6);
}
