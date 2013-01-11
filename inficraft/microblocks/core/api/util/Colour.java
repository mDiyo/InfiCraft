package inficraft.microblocks.core.api.util;

// Ordinals are dye item metadata, not wool block metadata
// Subtract from 15 for wool block metadata

public enum Colour {
	BLACK		("black",		0.1F, 0.1F, 0.1F),
	RED			("red",			0.8F, 0.3F, 0.3F),
	GREEN		("green",		0.4F, 0.5F, 0.2F),
	BROWN		("brown",		0.5F, 0.4F, 0.3F),
	BLUE		("blue",		0.2F, 0.4F, 0.8F),
	PURPLE		("purple",		0.7F, 0.4F, 0.9F),
	CYAN		("cyan",		0.3F, 0.6F, 0.7F),
	LIGHT_GREY	("light grey",	0.6F, 0.6F, 0.6F),
	GREY		("grey",		0.3F, 0.3F, 0.3F),
	PINK		("pink",		0.95F, 0.7F, 0.8F),
	LIME		("lime",		0.5F, 0.8F, 0.1F),
	YELLOW		("yellow",		0.9F, 0.9F, 0.2F),
	LIGHT_BLUE	("light blue",	0.6F, 0.7F, 0.95F),
	MAGENTA		("magenta",		0.9F, 0.5F, 0.85F),
	ORANGE		("orange",		0.95F, 0.7F, 0.2F),
	WHITE		("white",		1.0F, 1.0F, 1.0F)
	;

	private Colour(String name, float r, float g, float b) {
		this.r = r;
		this.g = g;
		this.b = b;
		this.name = name;
	}
	
	public int dyeId() {return ordinal();}
	public int woolId() {return 15 - ordinal();}
	
	public final String name;
	public final float r, g, b;
}
