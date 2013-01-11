package inficraft.microblocks.cobaltite;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import net.minecraft.tileentity.TileEntity;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface CobaltiteMod {
	/**
	 * List of tile entities to register.
	 */
	public RegisteredTile[] tiles() default {};
	
	/**
	 * List of textures to preload on the client.
	 */
	public String[] textures() default {};
	
	public static @interface RegisteredTile {
		public String id();
		public Class<? extends TileEntity> tile();
		
		/**
		 * Name of the class to register as the tile entity renderer, if any.
		 * This class must have a public no-argument constructor.
		 */
		public String render() default "";
	}
	
	public String channel() default "";
}
