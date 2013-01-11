package inficraft.microblocks.cobaltite;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.inventory.Container;

/**
 * Declares a GUI associated with a tile entity.
 * Apply this to a constant field containing the GUI ID.
 * Example:
 * @TileGUI(container=MyContainer.class, gui=MyGUI.class) public static final int GUI_TEST = 42;
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface TileGUI {
	/**
	 * The container class to be used for this GUI.
	 * Its first constructor must accept an EntityPlayer and a type compatible with the tile entity.
	 * eg: MyContainerClass(EntityPlayer player, MyTileEntity tile)
	 */
	public Class<? extends Container> container() default inficraft.microblocks.core.api.util.BaseContainer.class;
	
	/**
	 * The GUI class to be used for this GUI.
	 * It must have a constructor that has the container class as its only parameter.
	 */
	public Class<? extends GuiContainer> gui();
}
