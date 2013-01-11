package inficraft.microblocks.cobaltite;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Works on int, boolean and String fields in classes extending BaseMod.
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Configurable {
	/**
	 * The name of this setting in the configuration file. Must be unique within the mod.
	 */
	public String value();
}
