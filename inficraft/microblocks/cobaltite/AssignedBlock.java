package inficraft.microblocks.cobaltite;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import net.minecraft.item.ItemBlock;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface AssignedBlock {
	public String id();
	public Class<? extends ItemBlock> item() default ItemBlock.class;
}
