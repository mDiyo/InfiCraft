// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

package net.minecraft.src.timberframes;


public enum EnumBeams_Kaevator
{
	// Simple frame
    beam_01("beam_01", 32, 32, new int[] {0,1,2,3}, true),    
    // Simple door frame 32*32
    beam_19("beam_19", 32, 32, new int[] {35,36,37}, false),   
    // Simple frame 64
    beam_07("beam_07", 64, 32, new int[] {10,11,12,13}, true),
    // Frame with diagonal to up-right 64
    beam_10("beam_10", 64, 32, new int[] {14,15,10,11,12,13}, true),
    // Frame with diagonal to up-left 64
    beam_11("beam_11", 64, 32, new int[] {16,17,10,11,12,13}, true),
    // Simple frame 48
    beam_37("beam_37", 48, 32, new int[] {10,11,12,13}, true),
    // Frame with diagonal to up-right 48
    beam_12("beam_12", 48, 32, new int[] {14,15,10,11,12,13}, true),
    // Frame with diagonal to up-right 48
    beam_13("beam_13", 48, 32, new int[] {16,17,10,11,12,13}, true),
    // Frame with a cross
    beam_14("beam_14", 32, 32, new int[] {0,1,2,3,4,5}, true),
    // Frame with vertical beam
    beam_02("beam_02", 32, 32, new int[] {0,1,2,3,4}, true),
    // Frame with horizontal beam
    beam_03("beam_03", 32, 32, new int[] {0,1,2,3,5}, true),
    // Frame with diagonal to up-right
    beam_04("beam_04", 32, 32, new int[] {6,7,0,1,2,3}, true),
    // Frame with diagonal to up-left
    beam_05("beam_05", 32, 32, new int[] {8,9,0,1,2,3}, true),
    // Frame with both diagonal
    beam_06("beam_06", 32, 32, new int[] {6,7,8,9,0,1,2,3}, true),    
    // Corner left 32
    beam_08("beam_08", 32, 32, new int[] {18,0,3}, true),
    // Corner right 32
    beam_09("beam_09", 32, 32, new int[] {19,0,1}, true),
    // Corner left reversed 32
    beam_23("beam_23", 32, 32, new int[] {40,1,2}, true),
    // Corner right reversed 32
    beam_24("beam_24", 32, 32, new int[] {41,2,3}, true),   
    // Diagonal to up-right 32*32
    beam_31("beam_31", 32, 32, new int[] {54,55}, true),
    // Diagonal to up-left 32*32
    beam_32("beam_32", 32, 32, new int[] {56,57}, true),
    // Diagonal to up-left 32*32
    beam_39("beam_39", 32, 32, new int[] {54,55,56,57}, true),
    // Simple frame 16
    beam_15("beam_15", 16, 16, new int[] {20,21,22,23}, true),
    // Simple frame 32*16
    beam_16("beam_16", 32, 16, new int[] {24,25,26,27}, true),
    // Simple frame 16*32
    beam_17("beam_17", 16, 32, new int[] {28,29,30,31}, true),
    // Simple door frame 16*32
    beam_18("beam_18", 16, 32, new int[] {32,33,34}, false),    
    // Diagonal to up-right 16*32
    beam_40("beam_40", 16, 32, new int[] {46,47}, true),
    // Diagonal to up-left 16*32
    beam_41("beam_41", 16, 32, new int[] {48,49}, true),
    // Cross Diagonal  16*32
    beam_42("beam_42", 16, 32, new int[] {46,47,48,49}, true),
    // Diagonal to up-right 16
    beam_29("beam_29", 16, 16, new int[] {46,47}, true),
    // Diagonal to up-left 16
    beam_30("beam_30", 16, 16, new int[] {48,49}, true),
    // Cross Diagonal  16
    beam_38("beam_38", 16, 16, new int[] {46,47,48,49}, true),
    // Corner left 16
    beam_25("beam_25", 16, 16, new int[] {42,20,23}, true),
    // Corner right reversed 16
    beam_28("beam_28", 16, 16, new int[] {45,22,23}, true), 
    // Corner right 16
    beam_26("beam_26", 16, 16, new int[] {44,20,21}, true),  
    // Corner left reversed 16
    beam_27("beam_27", 16, 16, new int[] {43,21,22}, true),    
    // Vertical beam 16*16
    beam_20("beam_20", 16, 16, new int[] {38}, true),
    // Horizontal beam 16*16
    beam_21("beam_21", 16, 16, new int[] {39}, true),
    // Mix beam 16*16
    beam_22("beam_22", 16, 16, new int[] {38,39}, true),
    // Up beam 16*16
    beam_33("beam_33", 16, 16, new int[] {50}, false),
    // Left beam 16*16
    beam_35("beam_35", 16, 16, new int[] {52}, false),
    // Down beam 16*16
    beam_34("beam_34", 16, 16, new int[] {51}, false),    
    // Right beam 16*16
    beam_36("beam_36", 16, 16, new int[] {53}, false);    

    private EnumBeams_Kaevator(String s, int j, int k, int lPlanks[], boolean pIsCollidable)
    {
        title = s;
        sizeX = j;
        sizeY = k;       
        planks = lPlanks;         
        isCollidable = pIsCollidable;
    }

    public static final int maxArtTitleLength = "beam_01".length();
    public final String title;
    public final int sizeX;
    public final int sizeY;       
    public final int planks[];
    public final boolean isCollidable;
}
