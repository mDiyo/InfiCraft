// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

package net.minecraft.src.timberframes;


public enum EnumPlanks_Kaevator
{
    // bottom plank 32
	plank_00(2, 2, 14, 2, 16, 0, 0, 0, 0.5F, -0.3F, 4.0F),
	// left plank 32
    plank_01(2, 14, 2, 2, 0, 0, 0, 16, 0.5F, -0.3F, 4.0F),
    // up plank 32
    plank_02(14, 14, 2, 14, 0, 16, 16, 16, 0.5F, -0.3F, 4.0F),
    // right plank 32
    plank_03(14, 2, 14, 14, 16, 16, 16, 0, 0.5F, -0.3F, 4.0F),
    
    // vertical middle plank 32
    plank_04(6, 2, 6, 14, 10, 14, 10, 2, 1.0F, -0.3F, 4.0F),
    // horizontal middle plank 32
    plank_05(2, 10, 14, 10, 14, 6, 2, 6, 1.0F, 0.1F, 3.6F),
    // diagonal up-right down 32
    plank_06(14, 12, 4, 2, 2, 2, 14, 14, 0.5F, -0.3F, 4.0F),
    // diagonal up-right up 32
    plank_07(2, 4, 12, 14, 14, 14, 2, 2, 0.5F, -0.3F, 4.0F),
    // diagonal up-left down 32
    plank_08(12, 2, 2, 12, 2, 14, 14, 2, 0.5F, 0.1F, 3.6F),
    // diagonal up-left up 32
    plank_09(4, 14, 14, 4, 14, 2, 2, 14, 0.5F, 0.1F, 3.6F),
    
    // bottom plank 64
	plank_10(1, 2, 15, 2, 16, 0, 0, 0, 0.5F, -0.3F, 4.0F),
    // left plank 64
    plank_11(1, 14, 1, 2, 0, 0, 0, 16, 0.5F, -0.3F, 4.0F),
    // up plank 64
    plank_12(15, 14, 1, 14, 0, 16, 16, 16, 0.5F, -0.3F, 4.0F),
    // right plank 64
    plank_13(15, 2, 15, 14, 16, 16, 16, 0, 0.5F, -0.3F, 4.0F),
	// diagonal up-right down 64
    plank_14(15, 12, 3, 2, 1, 2, 15, 14, 0.5F, -0.3F, 4.0F),
    // diagonal up-right up 64
    plank_15(1, 4, 13, 14, 15, 14, 1, 2, 0.5F, -0.3F, 4.0F),
    // diagonal up-left down 64
    plank_16(13, 2, 1, 12, 1, 14, 15, 2, 0.5F, 0.1F, 3.6F),
    // diagonal up-left up 64
    plank_17(3, 14, 15, 4, 15, 2, 1, 14, 0.5F, 0.1F, 3.6F),
	
	// diagonal up-right down large 32
    plank_18(14, 10, 6, 2, 2, 2, 14, 14, 1.0F, -0.3F, 4.0F),
    // diagonal up-left down large 32
    plank_19(10, 2, 2, 10, 2, 14, 14, 2, 1.0F, -0.3F, 4.0F),
	
	// bottom plank 16
	plank_20(4, 4, 12, 4, 16, 0, 0, 0, 0.5F, -0.3F, 4.0F),
	// left plank 16
    plank_21(4, 12, 4, 4, 0, 0, 0, 16, 0.5F, -0.3F, 4.0F),
    // up plank 16
    plank_22(12, 12, 4, 12, 0, 16, 16, 16, 0.5F, -0.3F, 4.0F),
    // right plank 16
    plank_23(12, 4, 12, 12, 16, 16, 16, 0, 0.5F, -0.3F, 4.0F),
	
	// bottom plank 32*16
	plank_24(2, 4, 14, 4, 16, 0, 0, 0, 0.5F, -0.3F, 4.0F),
	// left plank 32*16
    plank_25(2, 12, 2, 4, 0, 0, 0, 16, 0.5F, -0.3F, 4.0F),
    // up plank 32*16
    plank_26(14, 12, 2, 12, 0, 16, 16, 16, 0.5F, -0.3F, 4.0F),
    // right plank 32*16
    plank_27(14, 4, 14, 12, 16, 16, 16, 0, 0.5F, -0.3F, 4.0F),
	
	// bottom plank 16*32
	plank_28(4, 2, 12, 2, 16, 0, 0, 0, 0.5F, -0.3F, 4.0F),
	// left plank 16*32
    plank_29(4, 14, 4, 2, 0, 0, 0, 16, 0.5F, -0.3F, 4.0F),
    // up plank 16*32
    plank_30(12, 14, 4, 14, 0, 16, 16, 16, 0.5F, -0.3F, 4.0F),
    // right plank 16*32
    plank_31(12, 2, 12, 14, 16, 16, 16, 0, 0.5F, -0.3F, 4.0F),
	
    // up plank door 16*32
    plank_32(14, 15, 2, 15, 0, 16, 16, 16, 0.5F, -0.3F, 9.0F),
	// left plank door 16*32
    plank_33(2, 15, 2, 0, 0, 0, 0, 16, 0.5F, -0.3F, 9.0F),   
    // right plank door 16*32
    plank_34(14, 0, 14, 15, 16, 16, 16, 0, 0.5F, -0.3F, 9.0F),
    
    // up plank door 32*32
    plank_35(15, 15, 1, 15, 0, 16, 16, 16, 0.5F, -0.3F, 9.0F),
    // left plank door 32*32
    plank_36(1, 15, 1, 0, 0, 0, 0, 16, 0.5F, -0.3F, 9.0F),  
    // right plank door 32*32
    plank_37(15, 0, 15, 15, 16, 16, 16, 0, 0.5F, -0.3F, 9.0F),  
    
    // Vertical beam 16*16
    plank_38(4, 0, 4, 16, 12, 16, 12, 0, 1.0F, -0.3F, 7.7F),
	// horizontal beam 16*16
    plank_39(16, 4, 0, 4, 0, 12, 16, 12, 1.0F, 0.1F, 7.3F),
	
	// diagonal up-right up large 32
    plank_40(2, 6, 10, 14, 14, 14, 2, 2, 1.0F, -0.3F, 4.0F),
    // diagonal up-left up large 32
    plank_41(6, 14, 14, 6, 14, 2, 2, 14, 1.0F, -0.3F, 4.0F),
    
    // diagonal up-right large down 16
    plank_42(12, 8, 8, 4, 4, 4, 12, 12, 0.5F, -0.3F, 4.0F),
    // diagonal up-right large up 16
    plank_43(4, 8, 8, 12, 12, 12, 4, 4, 0.5F, -0.3F, 4.0F),
    // diagonal up-left large down 16
    plank_44(8, 4, 4, 8, 4, 12, 12, 4, 0.5F, -0.3F, 4.0F),
    // diagonal up-left large up 16
    plank_45(8, 12, 12, 8, 12, 4, 4, 12, 0.5F, -0.3F, 4.0F),
	
	// diagonal up-right long down 16
    plank_46(16, 12, 4, 0, 0, 0, 16, 16, 0.5F, -0.3F, 4.0F),
    // diagonal up-right long up 16
    plank_47(0, 4, 12, 16, 16, 16, 0, 0, 0.5F, -0.3F, 4.0F),
    // diagonal up-left long down 16
    plank_48(12, 0, 0, 12, 0, 16, 16, 0, 0.5F, 0.1F, 3.6F),
    // diagonal up-left long up 16
    plank_49(4, 16, 16, 4, 16, 0, 0, 16, 0.5F, 0.1F, 3.6F),
    
    // Up 16
    plank_50(16, 12, 0, 12, 0, 16, 16, 16, 0.5F, -0.3F, 4.0F),
    // Down 16
    plank_51(0, 4, 16, 4, 16, 0, 0, 0, 0.5F, -0.3F, 4.0F),
    // Left 16
    plank_52(4, 16, 4, 0, 0, 0, 0, 16, 0.5F, -0.3F, 4.0F),
    // Right 16
    plank_53(12, 0, 12, 16, 16, 16, 16, 0, 0.5F, -0.3F, 4.0F),
	
	// diagonal up-right long down 32
    plank_54(16, 14, 2, 0, 0, 0, 16, 16, 0.5F, -0.3F, 4.0F),
    // diagonal up-right long up 32
    plank_55(0, 2, 14, 16, 16, 16, 0, 0, 0.5F, -0.3F, 4.0F),
    // diagonal up-left long down 32
    plank_56(14, 0, 0, 14, 0, 16, 16, 0, 0.5F, 0.1F, 3.6F),
    // diagonal up-left long up 32
    plank_57(2, 16, 16, 2, 16, 0, 0, 16, 0.5F, 0.1F, 3.6F);
	

    private EnumPlanks_Kaevator(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4, float pTexSize, float pZfront, float pZback)
    {
    	X1 = x1;
    	X2 = x2;
    	X3 = x3;
    	X4 = x4;
    	Y1 = y1;
    	Y2 = y2;
    	Y3 = y3;
    	Y4 = y4;
    	TexSize = pTexSize;
    	Zfront = pZfront;
    	Zback = pZback;    	
    	
    }

    public final int X1;
    public final int X2;
    public final int X3;
    public final int X4;
    public final int Y1;
    public final int Y2;
    public final int Y3;
    public final int Y4;
    public final float TexSize;
    public final float Zfront;
    public final float Zback;
    //public final float TexWrap;
   // public final float TexHeight;
}
