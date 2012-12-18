package inficraft.infiblocks.client;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.EntityRenderer;
import net.minecraft.client.renderer.RenderBlocks;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.world.IBlockAccess;

import org.lwjgl.opengl.GL11;

public class BlockRenderHelper
{	
	private static BlockRenderHelper instance = new BlockRenderHelper();
	
	public static BlockRenderHelper getInstance(){
		return instance;
	}
	
	double blockMinX;
	double blockMaxX;
	double blockMinY;
	double blockMaxY;
	double blockMinZ;
	double blockMaxZ;
	
	boolean someBoolField = false;
	
	 /**
     * Sets the size and offset of the block to be rendered, ie: half size and rendered center block: 0.25D, 0.75D
     */
    public void setRenderMinMax(double par1, double par3, double par5, double par7, double par9, double par11)
    {
        if (!this.someBoolField)
        {
            this.blockMinX = par1;
            this.blockMaxX = par7;
            this.blockMinY = par3;
            this.blockMaxY = par9;
            this.blockMinZ = par5;
            this.blockMaxZ = par11;
        }
    }

    public void setRenderMinMaxFromBlock(Block par1Block)
    {
        if (!this.someBoolField)
        {
            this.blockMinX = par1Block.getBlockBoundsMinX();
            this.blockMaxX = par1Block.getBlockBoundsMaxX();
            this.blockMinY = par1Block.getBlockBoundsMinY();
            this.blockMaxY = par1Block.getBlockBoundsMaxY();
            this.blockMinZ = par1Block.getBlockBoundsMinZ();
            this.blockMaxZ = par1Block.getBlockBoundsMaxZ();
        }
    }

    public void func_83019_b(double par1, double par3, double par5, double par7, double par9, double par11)
    {
        this.blockMinX = par1;
        this.blockMaxX = par7;
        this.blockMinY = par3;
        this.blockMaxY = par9;
        this.blockMinZ = par5;
        this.blockMaxZ = par11;
        this.someBoolField = true;
    }
    
    public void func_83017_b()
    {
        this.someBoolField = false;
    }
    
	/**
     * Renders a textured cube block at the given coordinates
     */
    public boolean renderTexturedBlock(RenderBlocks render, Block par1Block, 
    		IBlockAccess iblockaccess, int posX, int posY, int posZ, 
    		int textureBottom, int textureTop, int textureEast, 
    		int textureWest, int textureNorth, int textureSouth)
    {
        int var5 = par1Block.colorMultiplier(iblockaccess, posX, posY, posZ);
        float var6 = (float)(var5 >> 16 & 255) / 255.0F;
        float var7 = (float)(var5 >> 8 & 255) / 255.0F;
        float var8 = (float)(var5 & 255) / 255.0F;

        if (EntityRenderer.anaglyphEnable)
        {
            float var9 = (var6 * 30.0F + var7 * 59.0F + var8 * 11.0F) / 100.0F;
            float var10 = (var6 * 30.0F + var7 * 70.0F) / 100.0F;
            float var11 = (var6 * 30.0F + var8 * 70.0F) / 100.0F;
            var6 = var9;
            var7 = var10;
            var8 = var11;
        }
        
        setRenderMinMaxFromBlock(par1Block);

        return Minecraft.isAmbientOcclusionEnabled() && Block.lightValue[par1Block.blockID] == 0 ? 
        		this.renderTexturedBlockAO(render, par1Block, iblockaccess, posX, posY, posZ, var6, var7, var8, 
        				textureBottom, textureTop, textureEast, textureWest, textureNorth, textureSouth) 
        		: this.renderTexturedBlockColor(render, par1Block, iblockaccess, posX, posY, posZ, var6, var7, var8, 
        				textureBottom, textureTop, textureEast, textureWest, textureNorth, textureSouth);
    }

    public boolean renderTexturedBlockAO(RenderBlocks render, Block par1Block, IBlockAccess iblockaccess, 
    		int posX, int posY, int posZ, float par5, float par6, float par7, 
    		int textureBottom, int textureTop, int textureEast, 
    		int textureWest, int textureNorth, int textureSouth)
    {
    	render.enableAO = true;
        boolean var8 = false;
        float var9 = render.lightValueOwn;
        float var10 = render.lightValueOwn;
        float var11 = render.lightValueOwn;
        float var12 = render.lightValueOwn;
        boolean var13 = true;
        boolean var14 = true;
        boolean var15 = true;
        boolean var16 = true;
        boolean var17 = true;
        boolean var18 = true;
        render.lightValueOwn = par1Block.getAmbientOcclusionLightValue(iblockaccess, posX, posY, posZ);
        render.aoLightValueXNeg = par1Block.getAmbientOcclusionLightValue(iblockaccess, posX - 1, posY, posZ);
        render.aoLightValueYNeg = par1Block.getAmbientOcclusionLightValue(iblockaccess, posX, posY - 1, posZ);
        render.aoLightValueZNeg = par1Block.getAmbientOcclusionLightValue(iblockaccess, posX, posY, posZ - 1);
        render.aoLightValueXPos = par1Block.getAmbientOcclusionLightValue(iblockaccess, posX + 1, posY, posZ);
        render.aoLightValueYPos = par1Block.getAmbientOcclusionLightValue(iblockaccess, posX, posY + 1, posZ);
        render.aoLightValueZPos = par1Block.getAmbientOcclusionLightValue(iblockaccess, posX, posY, posZ + 1);
        int var19 = par1Block.getMixedBrightnessForBlock(iblockaccess, posX, posY, posZ);
        int var20 = var19;
        int var21 = var19;
        int var22 = var19;
        int var23 = var19;
        int var24 = var19;
        int var25 = var19;

        if (blockMinY <= 0.0D)
        {
            var21 = par1Block.getMixedBrightnessForBlock(iblockaccess, posX, posY - 1, posZ);
        }

        if (blockMaxY >= 1.0D)
        {
            var24 = par1Block.getMixedBrightnessForBlock(iblockaccess, posX, posY + 1, posZ);
        }

        if (blockMinX <= 0.0D)
        {
            var20 = par1Block.getMixedBrightnessForBlock(iblockaccess, posX - 1, posY, posZ);
        }

        if (blockMaxX >= 1.0D)
        {
            var23 = par1Block.getMixedBrightnessForBlock(iblockaccess, posX + 1, posY, posZ);
        }

        if (blockMinZ <= 0.0D)
        {
            var22 = par1Block.getMixedBrightnessForBlock(iblockaccess, posX, posY, posZ - 1);
        }

        if (blockMaxZ >= 1.0D)
        {
            var25 = par1Block.getMixedBrightnessForBlock(iblockaccess, posX, posY, posZ + 1);
        }

        Tessellator var26 = Tessellator.instance;
        var26.setBrightness(983055);
        render.aoGrassXYZPPC = Block.canBlockGrass[iblockaccess.getBlockId(posX + 1, posY + 1, posZ)];
        render.aoGrassXYZPNC = Block.canBlockGrass[iblockaccess.getBlockId(posX + 1, posY - 1, posZ)];
        render.aoGrassXYZPCP = Block.canBlockGrass[iblockaccess.getBlockId(posX + 1, posY, posZ + 1)];
        render.aoGrassXYZPCN = Block.canBlockGrass[iblockaccess.getBlockId(posX + 1, posY, posZ - 1)];
        render.aoGrassXYZNPC = Block.canBlockGrass[iblockaccess.getBlockId(posX - 1, posY + 1, posZ)];
        render.aoGrassXYZNNC = Block.canBlockGrass[iblockaccess.getBlockId(posX - 1, posY - 1, posZ)];
        render.aoGrassXYZNCN = Block.canBlockGrass[iblockaccess.getBlockId(posX - 1, posY, posZ - 1)];
        render.aoGrassXYZNCP = Block.canBlockGrass[iblockaccess.getBlockId(posX - 1, posY, posZ + 1)];
        render.aoGrassXYZCPP = Block.canBlockGrass[iblockaccess.getBlockId(posX, posY + 1, posZ + 1)];
        render.aoGrassXYZCPN = Block.canBlockGrass[iblockaccess.getBlockId(posX, posY + 1, posZ - 1)];
        render.aoGrassXYZCNP = Block.canBlockGrass[iblockaccess.getBlockId(posX, posY - 1, posZ + 1)];
        render.aoGrassXYZCNN = Block.canBlockGrass[iblockaccess.getBlockId(posX, posY - 1, posZ - 1)];

        if (render.renderAllFaces || par1Block.shouldSideBeRendered(iblockaccess, posX, posY - 1, posZ, 0))
        {
            if (render.aoType > 0)
            {
                if (blockMinY <= 0.0D)
                {
                    --posY;
                }

                render.aoBrightnessXYNN = par1Block.getMixedBrightnessForBlock(iblockaccess, posX - 1, posY, posZ);
                render.aoBrightnessYZNN = par1Block.getMixedBrightnessForBlock(iblockaccess, posX, posY, posZ - 1);
                render.aoBrightnessYZNP = par1Block.getMixedBrightnessForBlock(iblockaccess, posX, posY, posZ + 1);
                render.aoBrightnessXYPN = par1Block.getMixedBrightnessForBlock(iblockaccess, posX + 1, posY, posZ);
                render.aoLightValueScratchXYNN = par1Block.getAmbientOcclusionLightValue(iblockaccess, posX - 1, posY, posZ);
                render.aoLightValueScratchYZNN = par1Block.getAmbientOcclusionLightValue(iblockaccess, posX, posY, posZ - 1);
                render.aoLightValueScratchYZNP = par1Block.getAmbientOcclusionLightValue(iblockaccess, posX, posY, posZ + 1);
                render.aoLightValueScratchXYPN = par1Block.getAmbientOcclusionLightValue(iblockaccess, posX + 1, posY, posZ);

                if (!render.aoGrassXYZCNN && !render.aoGrassXYZNNC)
                {
                    render.aoLightValueScratchXYZNNN = render.aoLightValueScratchXYNN;
                    render.aoBrightnessXYZNNN = render.aoBrightnessXYNN;
                }
                else
                {
                    render.aoLightValueScratchXYZNNN = par1Block.getAmbientOcclusionLightValue(iblockaccess, posX - 1, posY, posZ - 1);
                    render.aoBrightnessXYZNNN = par1Block.getMixedBrightnessForBlock(iblockaccess, posX - 1, posY, posZ - 1);
                }

                if (!render.aoGrassXYZCNP && !render.aoGrassXYZNNC)
                {
                    render.aoLightValueScratchXYZNNP = render.aoLightValueScratchXYNN;
                    render.aoBrightnessXYZNNP = render.aoBrightnessXYNN;
                }
                else
                {
                    render.aoLightValueScratchXYZNNP = par1Block.getAmbientOcclusionLightValue(iblockaccess, posX - 1, posY, posZ + 1);
                    render.aoBrightnessXYZNNP = par1Block.getMixedBrightnessForBlock(iblockaccess, posX - 1, posY, posZ + 1);
                }

                if (!render.aoGrassXYZCNN && !render.aoGrassXYZPNC)
                {
                    render.aoLightValueScratchXYZPNN = render.aoLightValueScratchXYPN;
                    render.aoBrightnessXYZPNN = render.aoBrightnessXYPN;
                }
                else
                {
                    render.aoLightValueScratchXYZPNN = par1Block.getAmbientOcclusionLightValue(iblockaccess, posX + 1, posY, posZ - 1);
                    render.aoBrightnessXYZPNN = par1Block.getMixedBrightnessForBlock(iblockaccess, posX + 1, posY, posZ - 1);
                }

                if (!render.aoGrassXYZCNP && !render.aoGrassXYZPNC)
                {
                    render.aoLightValueScratchXYZPNP = render.aoLightValueScratchXYPN;
                    render.aoBrightnessXYZPNP = render.aoBrightnessXYPN;
                }
                else
                {
                    render.aoLightValueScratchXYZPNP = par1Block.getAmbientOcclusionLightValue(iblockaccess, posX + 1, posY, posZ + 1);
                    render.aoBrightnessXYZPNP = par1Block.getMixedBrightnessForBlock(iblockaccess, posX + 1, posY, posZ + 1);
                }

                if (blockMinY <= 0.0D)
                {
                    ++posY;
                }

                var9 = (render.aoLightValueScratchXYZNNP + render.aoLightValueScratchXYNN + render.aoLightValueScratchYZNP + render.aoLightValueYNeg) / 4.0F;
                var12 = (render.aoLightValueScratchYZNP + render.aoLightValueYNeg + render.aoLightValueScratchXYZPNP + render.aoLightValueScratchXYPN) / 4.0F;
                var11 = (render.aoLightValueYNeg + render.aoLightValueScratchYZNN + render.aoLightValueScratchXYPN + render.aoLightValueScratchXYZPNN) / 4.0F;
                var10 = (render.aoLightValueScratchXYNN + render.aoLightValueScratchXYZNNN + render.aoLightValueYNeg + render.aoLightValueScratchYZNN) / 4.0F;
                render.brightnessTopLeft = render.getAoBrightness(render.aoBrightnessXYZNNP, render.aoBrightnessXYNN, render.aoBrightnessYZNP, var21);
                render.brightnessTopRight = render.getAoBrightness(render.aoBrightnessYZNP, render.aoBrightnessXYZPNP, render.aoBrightnessXYPN, var21);
                render.brightnessBottomRight = render.getAoBrightness(render.aoBrightnessYZNN, render.aoBrightnessXYPN, render.aoBrightnessXYZPNN, var21);
                render.brightnessBottomLeft = render.getAoBrightness(render.aoBrightnessXYNN, render.aoBrightnessXYZNNN, render.aoBrightnessYZNN, var21);
            }
            else
            {
                var12 = render.aoLightValueYNeg;
                var11 = render.aoLightValueYNeg;
                var10 = render.aoLightValueYNeg;
                var9 = render.aoLightValueYNeg;
                render.brightnessTopLeft = render.brightnessBottomLeft = render.brightnessBottomRight = render.brightnessTopRight = render.aoBrightnessXYNN;
            }

            render.colorRedTopLeft = render.colorRedBottomLeft = render.colorRedBottomRight = render.colorRedTopRight = (var13 ? par5 : 1.0F) * 0.5F;
            render.colorGreenTopLeft = render.colorGreenBottomLeft = render.colorGreenBottomRight = render.colorGreenTopRight = (var13 ? par6 : 1.0F) * 0.5F;
            render.colorBlueTopLeft = render.colorBlueBottomLeft = render.colorBlueBottomRight = render.colorBlueTopRight = (var13 ? par7 : 1.0F) * 0.5F;
            render.colorRedTopLeft *= var9;
            render.colorGreenTopLeft *= var9;
            render.colorBlueTopLeft *= var9;
            render.colorRedBottomLeft *= var10;
            render.colorGreenBottomLeft *= var10;
            render.colorBlueBottomLeft *= var10;
            render.colorRedBottomRight *= var11;
            render.colorGreenBottomRight *= var11;
            render.colorBlueBottomRight *= var11;
            render.colorRedTopRight *= var12;
            render.colorGreenTopRight *= var12;
            render.colorBlueTopRight *= var12;
            render.renderBottomFace(par1Block, (double)posX, (double)posY, (double)posZ, textureBottom);
            var8 = true;
        }

        if (render.renderAllFaces || par1Block.shouldSideBeRendered(iblockaccess, posX, posY + 1, posZ, 1))
        {
            if (render.aoType > 0)
            {
                if (blockMaxY >= 1.0D)
                {
                    ++posY;
                }

                render.aoBrightnessXYNP = par1Block.getMixedBrightnessForBlock(iblockaccess, posX - 1, posY, posZ);
                render.aoBrightnessXYPP = par1Block.getMixedBrightnessForBlock(iblockaccess, posX + 1, posY, posZ);
                render.aoBrightnessYZPN = par1Block.getMixedBrightnessForBlock(iblockaccess, posX, posY, posZ - 1);
                render.aoBrightnessYZPP = par1Block.getMixedBrightnessForBlock(iblockaccess, posX, posY, posZ + 1);
                render.aoLightValueScratchXYNP = par1Block.getAmbientOcclusionLightValue(iblockaccess, posX - 1, posY, posZ);
                render.aoLightValueScratchXYPP = par1Block.getAmbientOcclusionLightValue(iblockaccess, posX + 1, posY, posZ);
                render.aoLightValueScratchYZPN = par1Block.getAmbientOcclusionLightValue(iblockaccess, posX, posY, posZ - 1);
                render.aoLightValueScratchYZPP = par1Block.getAmbientOcclusionLightValue(iblockaccess, posX, posY, posZ + 1);

                if (!render.aoGrassXYZCPN && !render.aoGrassXYZNPC)
                {
                    render.aoLightValueScratchXYZNPN = render.aoLightValueScratchXYNP;
                    render.aoBrightnessXYZNPN = render.aoBrightnessXYNP;
                }
                else
                {
                    render.aoLightValueScratchXYZNPN = par1Block.getAmbientOcclusionLightValue(iblockaccess, posX - 1, posY, posZ - 1);
                    render.aoBrightnessXYZNPN = par1Block.getMixedBrightnessForBlock(iblockaccess, posX - 1, posY, posZ - 1);
                }

                if (!render.aoGrassXYZCPN && !render.aoGrassXYZPPC)
                {
                    render.aoLightValueScratchXYZPPN = render.aoLightValueScratchXYPP;
                    render.aoBrightnessXYZPPN = render.aoBrightnessXYPP;
                }
                else
                {
                    render.aoLightValueScratchXYZPPN = par1Block.getAmbientOcclusionLightValue(iblockaccess, posX + 1, posY, posZ - 1);
                    render.aoBrightnessXYZPPN = par1Block.getMixedBrightnessForBlock(iblockaccess, posX + 1, posY, posZ - 1);
                }

                if (!render.aoGrassXYZCPP && !render.aoGrassXYZNPC)
                {
                    render.aoLightValueScratchXYZNPP = render.aoLightValueScratchXYNP;
                    render.aoBrightnessXYZNPP = render.aoBrightnessXYNP;
                }
                else
                {
                    render.aoLightValueScratchXYZNPP = par1Block.getAmbientOcclusionLightValue(iblockaccess, posX - 1, posY, posZ + 1);
                    render.aoBrightnessXYZNPP = par1Block.getMixedBrightnessForBlock(iblockaccess, posX - 1, posY, posZ + 1);
                }

                if (!render.aoGrassXYZCPP && !render.aoGrassXYZPPC)
                {
                    render.aoLightValueScratchXYZPPP = render.aoLightValueScratchXYPP;
                    render.aoBrightnessXYZPPP = render.aoBrightnessXYPP;
                }
                else
                {
                    render.aoLightValueScratchXYZPPP = par1Block.getAmbientOcclusionLightValue(iblockaccess, posX + 1, posY, posZ + 1);
                    render.aoBrightnessXYZPPP = par1Block.getMixedBrightnessForBlock(iblockaccess, posX + 1, posY, posZ + 1);
                }

                if (blockMaxY >= 1.0D)
                {
                    --posY;
                }

                var12 = (render.aoLightValueScratchXYZNPP + render.aoLightValueScratchXYNP + render.aoLightValueScratchYZPP + render.aoLightValueYPos) / 4.0F;
                var9 = (render.aoLightValueScratchYZPP + render.aoLightValueYPos + render.aoLightValueScratchXYZPPP + render.aoLightValueScratchXYPP) / 4.0F;
                var10 = (render.aoLightValueYPos + render.aoLightValueScratchYZPN + render.aoLightValueScratchXYPP + render.aoLightValueScratchXYZPPN) / 4.0F;
                var11 = (render.aoLightValueScratchXYNP + render.aoLightValueScratchXYZNPN + render.aoLightValueYPos + render.aoLightValueScratchYZPN) / 4.0F;
                render.brightnessTopRight = render.getAoBrightness(render.aoBrightnessXYZNPP, render.aoBrightnessXYNP, render.aoBrightnessYZPP, var24);
                render.brightnessTopLeft = render.getAoBrightness(render.aoBrightnessYZPP, render.aoBrightnessXYZPPP, render.aoBrightnessXYPP, var24);
                render.brightnessBottomLeft = render.getAoBrightness(render.aoBrightnessYZPN, render.aoBrightnessXYPP, render.aoBrightnessXYZPPN, var24);
                render.brightnessBottomRight = render.getAoBrightness(render.aoBrightnessXYNP, render.aoBrightnessXYZNPN, render.aoBrightnessYZPN, var24);
            }
            else
            {
                var12 = render.aoLightValueYPos;
                var11 = render.aoLightValueYPos;
                var10 = render.aoLightValueYPos;
                var9 = render.aoLightValueYPos;
                render.brightnessTopLeft = render.brightnessBottomLeft = render.brightnessBottomRight = render.brightnessTopRight = var24;
            }

            render.colorRedTopLeft = render.colorRedBottomLeft = render.colorRedBottomRight = render.colorRedTopRight = var14 ? par5 : 1.0F;
            render.colorGreenTopLeft = render.colorGreenBottomLeft = render.colorGreenBottomRight = render.colorGreenTopRight = var14 ? par6 : 1.0F;
            render.colorBlueTopLeft = render.colorBlueBottomLeft = render.colorBlueBottomRight = render.colorBlueTopRight = var14 ? par7 : 1.0F;
            render.colorRedTopLeft *= var9;
            render.colorGreenTopLeft *= var9;
            render.colorBlueTopLeft *= var9;
            render.colorRedBottomLeft *= var10;
            render.colorGreenBottomLeft *= var10;
            render.colorBlueBottomLeft *= var10;
            render.colorRedBottomRight *= var11;
            render.colorGreenBottomRight *= var11;
            render.colorBlueBottomRight *= var11;
            render.colorRedTopRight *= var12;
            render.colorGreenTopRight *= var12;
            render.colorBlueTopRight *= var12;
            render.renderTopFace(par1Block, (double)posX, (double)posY, (double)posZ, textureTop);
            var8 = true;
        }

        int var27;

        if (render.renderAllFaces || par1Block.shouldSideBeRendered(iblockaccess, posX, posY, posZ - 1, 2))
        {
            if (render.aoType > 0)
            {
                if (blockMinZ <= 0.0D)
                {
                    --posZ;
                }

                render.aoLightValueScratchXZNN = par1Block.getAmbientOcclusionLightValue(iblockaccess, posX - 1, posY, posZ);
                render.aoLightValueScratchYZNN = par1Block.getAmbientOcclusionLightValue(iblockaccess, posX, posY - 1, posZ);
                render.aoLightValueScratchYZPN = par1Block.getAmbientOcclusionLightValue(iblockaccess, posX, posY + 1, posZ);
                render.aoLightValueScratchXZPN = par1Block.getAmbientOcclusionLightValue(iblockaccess, posX + 1, posY, posZ);
                render.aoBrightnessXZNN = par1Block.getMixedBrightnessForBlock(iblockaccess, posX - 1, posY, posZ);
                render.aoBrightnessYZNN = par1Block.getMixedBrightnessForBlock(iblockaccess, posX, posY - 1, posZ);
                render.aoBrightnessYZPN = par1Block.getMixedBrightnessForBlock(iblockaccess, posX, posY + 1, posZ);
                render.aoBrightnessXZPN = par1Block.getMixedBrightnessForBlock(iblockaccess, posX + 1, posY, posZ);

                if (!render.aoGrassXYZNCN && !render.aoGrassXYZCNN)
                {
                    render.aoLightValueScratchXYZNNN = render.aoLightValueScratchXZNN;
                    render.aoBrightnessXYZNNN = render.aoBrightnessXZNN;
                }
                else
                {
                    render.aoLightValueScratchXYZNNN = par1Block.getAmbientOcclusionLightValue(iblockaccess, posX - 1, posY - 1, posZ);
                    render.aoBrightnessXYZNNN = par1Block.getMixedBrightnessForBlock(iblockaccess, posX - 1, posY - 1, posZ);
                }

                if (!render.aoGrassXYZNCN && !render.aoGrassXYZCPN)
                {
                    render.aoLightValueScratchXYZNPN = render.aoLightValueScratchXZNN;
                    render.aoBrightnessXYZNPN = render.aoBrightnessXZNN;
                }
                else
                {
                    render.aoLightValueScratchXYZNPN = par1Block.getAmbientOcclusionLightValue(iblockaccess, posX - 1, posY + 1, posZ);
                    render.aoBrightnessXYZNPN = par1Block.getMixedBrightnessForBlock(iblockaccess, posX - 1, posY + 1, posZ);
                }

                if (!render.aoGrassXYZPCN && !render.aoGrassXYZCNN)
                {
                    render.aoLightValueScratchXYZPNN = render.aoLightValueScratchXZPN;
                    render.aoBrightnessXYZPNN = render.aoBrightnessXZPN;
                }
                else
                {
                    render.aoLightValueScratchXYZPNN = par1Block.getAmbientOcclusionLightValue(iblockaccess, posX + 1, posY - 1, posZ);
                    render.aoBrightnessXYZPNN = par1Block.getMixedBrightnessForBlock(iblockaccess, posX + 1, posY - 1, posZ);
                }

                if (!render.aoGrassXYZPCN && !render.aoGrassXYZCPN)
                {
                    render.aoLightValueScratchXYZPPN = render.aoLightValueScratchXZPN;
                    render.aoBrightnessXYZPPN = render.aoBrightnessXZPN;
                }
                else
                {
                    render.aoLightValueScratchXYZPPN = par1Block.getAmbientOcclusionLightValue(iblockaccess, posX + 1, posY + 1, posZ);
                    render.aoBrightnessXYZPPN = par1Block.getMixedBrightnessForBlock(iblockaccess, posX + 1, posY + 1, posZ);
                }

                if (blockMinZ <= 0.0D)
                {
                    ++posZ;
                }

                var9 = (render.aoLightValueScratchXZNN + render.aoLightValueScratchXYZNPN + render.aoLightValueZNeg + render.aoLightValueScratchYZPN) / 4.0F;
                var10 = (render.aoLightValueZNeg + render.aoLightValueScratchYZPN + render.aoLightValueScratchXZPN + render.aoLightValueScratchXYZPPN) / 4.0F;
                var11 = (render.aoLightValueScratchYZNN + render.aoLightValueZNeg + render.aoLightValueScratchXYZPNN + render.aoLightValueScratchXZPN) / 4.0F;
                var12 = (render.aoLightValueScratchXYZNNN + render.aoLightValueScratchXZNN + render.aoLightValueScratchYZNN + render.aoLightValueZNeg) / 4.0F;
                render.brightnessTopLeft = render.getAoBrightness(render.aoBrightnessXZNN, render.aoBrightnessXYZNPN, render.aoBrightnessYZPN, var22);
                render.brightnessBottomLeft = render.getAoBrightness(render.aoBrightnessYZPN, render.aoBrightnessXZPN, render.aoBrightnessXYZPPN, var22);
                render.brightnessBottomRight = render.getAoBrightness(render.aoBrightnessYZNN, render.aoBrightnessXYZPNN, render.aoBrightnessXZPN, var22);
                render.brightnessTopRight = render.getAoBrightness(render.aoBrightnessXYZNNN, render.aoBrightnessXZNN, render.aoBrightnessYZNN, var22);
            }
            else
            {
                var12 = render.aoLightValueZNeg;
                var11 = render.aoLightValueZNeg;
                var10 = render.aoLightValueZNeg;
                var9 = render.aoLightValueZNeg;
                render.brightnessTopLeft = render.brightnessBottomLeft = render.brightnessBottomRight = render.brightnessTopRight = var22;
            }

            render.colorRedTopLeft = render.colorRedBottomLeft = render.colorRedBottomRight = render.colorRedTopRight = (var15 ? par5 : 1.0F) * 0.8F;
            render.colorGreenTopLeft = render.colorGreenBottomLeft = render.colorGreenBottomRight = render.colorGreenTopRight = (var15 ? par6 : 1.0F) * 0.8F;
            render.colorBlueTopLeft = render.colorBlueBottomLeft = render.colorBlueBottomRight = render.colorBlueTopRight = (var15 ? par7 : 1.0F) * 0.8F;
            render.colorRedTopLeft *= var9;
            render.colorGreenTopLeft *= var9;
            render.colorBlueTopLeft *= var9;
            render.colorRedBottomLeft *= var10;
            render.colorGreenBottomLeft *= var10;
            render.colorBlueBottomLeft *= var10;
            render.colorRedBottomRight *= var11;
            render.colorGreenBottomRight *= var11;
            render.colorBlueBottomRight *= var11;
            render.colorRedTopRight *= var12;
            render.colorGreenTopRight *= var12;
            render.colorBlueTopRight *= var12;
            var27 = textureEast;
            render.renderEastFace(par1Block, (double)posX, (double)posY, (double)posZ, var27);

            /*if (Tessellator.instance.defaultTexture && render.fancyGrass && var27 == 3)
            {
                render.colorRedTopLeft *= par5;
                render.colorRedBottomLeft *= par5;
                render.colorRedBottomRight *= par5;
                render.colorRedTopRight *= par5;
                render.colorGreenTopLeft *= par6;
                render.colorGreenBottomLeft *= par6;
                render.colorGreenBottomRight *= par6;
                render.colorGreenTopRight *= par6;
                render.colorBlueTopLeft *= par7;
                render.colorBlueBottomLeft *= par7;
                render.colorBlueBottomRight *= par7;
                render.colorBlueTopRight *= par7;
                render.renderEastFace(par1Block, (double)posX, (double)posY, (double)posZ, 38);
            }*/

            var8 = true;
        }

        if (render.renderAllFaces || par1Block.shouldSideBeRendered(iblockaccess, posX, posY, posZ + 1, 3))
        {
            if (render.aoType > 0)
            {
                if (blockMaxZ >= 1.0D)
                {
                    ++posZ;
                }

                render.aoLightValueScratchXZNP = par1Block.getAmbientOcclusionLightValue(iblockaccess, posX - 1, posY, posZ);
                render.aoLightValueScratchXZPP = par1Block.getAmbientOcclusionLightValue(iblockaccess, posX + 1, posY, posZ);
                render.aoLightValueScratchYZNP = par1Block.getAmbientOcclusionLightValue(iblockaccess, posX, posY - 1, posZ);
                render.aoLightValueScratchYZPP = par1Block.getAmbientOcclusionLightValue(iblockaccess, posX, posY + 1, posZ);
                render.aoBrightnessXZNP = par1Block.getMixedBrightnessForBlock(iblockaccess, posX - 1, posY, posZ);
                render.aoBrightnessXZPP = par1Block.getMixedBrightnessForBlock(iblockaccess, posX + 1, posY, posZ);
                render.aoBrightnessYZNP = par1Block.getMixedBrightnessForBlock(iblockaccess, posX, posY - 1, posZ);
                render.aoBrightnessYZPP = par1Block.getMixedBrightnessForBlock(iblockaccess, posX, posY + 1, posZ);

                if (!render.aoGrassXYZNCP && !render.aoGrassXYZCNP)
                {
                    render.aoLightValueScratchXYZNNP = render.aoLightValueScratchXZNP;
                    render.aoBrightnessXYZNNP = render.aoBrightnessXZNP;
                }
                else
                {
                    render.aoLightValueScratchXYZNNP = par1Block.getAmbientOcclusionLightValue(iblockaccess, posX - 1, posY - 1, posZ);
                    render.aoBrightnessXYZNNP = par1Block.getMixedBrightnessForBlock(iblockaccess, posX - 1, posY - 1, posZ);
                }

                if (!render.aoGrassXYZNCP && !render.aoGrassXYZCPP)
                {
                    render.aoLightValueScratchXYZNPP = render.aoLightValueScratchXZNP;
                    render.aoBrightnessXYZNPP = render.aoBrightnessXZNP;
                }
                else
                {
                    render.aoLightValueScratchXYZNPP = par1Block.getAmbientOcclusionLightValue(iblockaccess, posX - 1, posY + 1, posZ);
                    render.aoBrightnessXYZNPP = par1Block.getMixedBrightnessForBlock(iblockaccess, posX - 1, posY + 1, posZ);
                }

                if (!render.aoGrassXYZPCP && !render.aoGrassXYZCNP)
                {
                    render.aoLightValueScratchXYZPNP = render.aoLightValueScratchXZPP;
                    render.aoBrightnessXYZPNP = render.aoBrightnessXZPP;
                }
                else
                {
                    render.aoLightValueScratchXYZPNP = par1Block.getAmbientOcclusionLightValue(iblockaccess, posX + 1, posY - 1, posZ);
                    render.aoBrightnessXYZPNP = par1Block.getMixedBrightnessForBlock(iblockaccess, posX + 1, posY - 1, posZ);
                }

                if (!render.aoGrassXYZPCP && !render.aoGrassXYZCPP)
                {
                    render.aoLightValueScratchXYZPPP = render.aoLightValueScratchXZPP;
                    render.aoBrightnessXYZPPP = render.aoBrightnessXZPP;
                }
                else
                {
                    render.aoLightValueScratchXYZPPP = par1Block.getAmbientOcclusionLightValue(iblockaccess, posX + 1, posY + 1, posZ);
                    render.aoBrightnessXYZPPP = par1Block.getMixedBrightnessForBlock(iblockaccess, posX + 1, posY + 1, posZ);
                }

                if (blockMaxZ >= 1.0D)
                {
                    --posZ;
                }

                var9 = (render.aoLightValueScratchXZNP + render.aoLightValueScratchXYZNPP + render.aoLightValueZPos + render.aoLightValueScratchYZPP) / 4.0F;
                var12 = (render.aoLightValueZPos + render.aoLightValueScratchYZPP + render.aoLightValueScratchXZPP + render.aoLightValueScratchXYZPPP) / 4.0F;
                var11 = (render.aoLightValueScratchYZNP + render.aoLightValueZPos + render.aoLightValueScratchXYZPNP + render.aoLightValueScratchXZPP) / 4.0F;
                var10 = (render.aoLightValueScratchXYZNNP + render.aoLightValueScratchXZNP + render.aoLightValueScratchYZNP + render.aoLightValueZPos) / 4.0F;
                render.brightnessTopLeft = render.getAoBrightness(render.aoBrightnessXZNP, render.aoBrightnessXYZNPP, render.aoBrightnessYZPP, var25);
                render.brightnessTopRight = render.getAoBrightness(render.aoBrightnessYZPP, render.aoBrightnessXZPP, render.aoBrightnessXYZPPP, var25);
                render.brightnessBottomRight = render.getAoBrightness(render.aoBrightnessYZNP, render.aoBrightnessXYZPNP, render.aoBrightnessXZPP, var25);
                render.brightnessBottomLeft = render.getAoBrightness(render.aoBrightnessXYZNNP, render.aoBrightnessXZNP, render.aoBrightnessYZNP, var25);
            }
            else
            {
                var12 = render.aoLightValueZPos;
                var11 = render.aoLightValueZPos;
                var10 = render.aoLightValueZPos;
                var9 = render.aoLightValueZPos;
                render.brightnessTopLeft = render.brightnessBottomLeft = render.brightnessBottomRight = render.brightnessTopRight = var25;
            }

            render.colorRedTopLeft = render.colorRedBottomLeft = render.colorRedBottomRight = render.colorRedTopRight = (var16 ? par5 : 1.0F) * 0.8F;
            render.colorGreenTopLeft = render.colorGreenBottomLeft = render.colorGreenBottomRight = render.colorGreenTopRight = (var16 ? par6 : 1.0F) * 0.8F;
            render.colorBlueTopLeft = render.colorBlueBottomLeft = render.colorBlueBottomRight = render.colorBlueTopRight = (var16 ? par7 : 1.0F) * 0.8F;
            render.colorRedTopLeft *= var9;
            render.colorGreenTopLeft *= var9;
            render.colorBlueTopLeft *= var9;
            render.colorRedBottomLeft *= var10;
            render.colorGreenBottomLeft *= var10;
            render.colorBlueBottomLeft *= var10;
            render.colorRedBottomRight *= var11;
            render.colorGreenBottomRight *= var11;
            render.colorBlueBottomRight *= var11;
            render.colorRedTopRight *= var12;
            render.colorGreenTopRight *= var12;
            render.colorBlueTopRight *= var12;
            var27 = textureWest;
            render.renderWestFace(par1Block, (double)posX, (double)posY, (double)posZ, textureWest);

            if (Tessellator.instance.defaultTexture && render.fancyGrass && var27 == 3)
            {
                render.colorRedTopLeft *= par5;
                render.colorRedBottomLeft *= par5;
                render.colorRedBottomRight *= par5;
                render.colorRedTopRight *= par5;
                render.colorGreenTopLeft *= par6;
                render.colorGreenBottomLeft *= par6;
                render.colorGreenBottomRight *= par6;
                render.colorGreenTopRight *= par6;
                render.colorBlueTopLeft *= par7;
                render.colorBlueBottomLeft *= par7;
                render.colorBlueBottomRight *= par7;
                render.colorBlueTopRight *= par7;
                render.renderWestFace(par1Block, (double)posX, (double)posY, (double)posZ, 38);
            }

            var8 = true;
        }

        if (render.renderAllFaces || par1Block.shouldSideBeRendered(iblockaccess, posX - 1, posY, posZ, 4))
        {
            if (render.aoType > 0)
            {
                if (blockMinX <= 0.0D)
                {
                    --posX;
                }

                render.aoLightValueScratchXYNN = par1Block.getAmbientOcclusionLightValue(iblockaccess, posX, posY - 1, posZ);
                render.aoLightValueScratchXZNN = par1Block.getAmbientOcclusionLightValue(iblockaccess, posX, posY, posZ - 1);
                render.aoLightValueScratchXZNP = par1Block.getAmbientOcclusionLightValue(iblockaccess, posX, posY, posZ + 1);
                render.aoLightValueScratchXYNP = par1Block.getAmbientOcclusionLightValue(iblockaccess, posX, posY + 1, posZ);
                render.aoBrightnessXYNN = par1Block.getMixedBrightnessForBlock(iblockaccess, posX, posY - 1, posZ);
                render.aoBrightnessXZNN = par1Block.getMixedBrightnessForBlock(iblockaccess, posX, posY, posZ - 1);
                render.aoBrightnessXZNP = par1Block.getMixedBrightnessForBlock(iblockaccess, posX, posY, posZ + 1);
                render.aoBrightnessXYNP = par1Block.getMixedBrightnessForBlock(iblockaccess, posX, posY + 1, posZ);

                if (!render.aoGrassXYZNCN && !render.aoGrassXYZNNC)
                {
                    render.aoLightValueScratchXYZNNN = render.aoLightValueScratchXZNN;
                    render.aoBrightnessXYZNNN = render.aoBrightnessXZNN;
                }
                else
                {
                    render.aoLightValueScratchXYZNNN = par1Block.getAmbientOcclusionLightValue(iblockaccess, posX, posY - 1, posZ - 1);
                    render.aoBrightnessXYZNNN = par1Block.getMixedBrightnessForBlock(iblockaccess, posX, posY - 1, posZ - 1);
                }

                if (!render.aoGrassXYZNCP && !render.aoGrassXYZNNC)
                {
                    render.aoLightValueScratchXYZNNP = render.aoLightValueScratchXZNP;
                    render.aoBrightnessXYZNNP = render.aoBrightnessXZNP;
                }
                else
                {
                    render.aoLightValueScratchXYZNNP = par1Block.getAmbientOcclusionLightValue(iblockaccess, posX, posY - 1, posZ + 1);
                    render.aoBrightnessXYZNNP = par1Block.getMixedBrightnessForBlock(iblockaccess, posX, posY - 1, posZ + 1);
                }

                if (!render.aoGrassXYZNCN && !render.aoGrassXYZNPC)
                {
                    render.aoLightValueScratchXYZNPN = render.aoLightValueScratchXZNN;
                    render.aoBrightnessXYZNPN = render.aoBrightnessXZNN;
                }
                else
                {
                    render.aoLightValueScratchXYZNPN = par1Block.getAmbientOcclusionLightValue(iblockaccess, posX, posY + 1, posZ - 1);
                    render.aoBrightnessXYZNPN = par1Block.getMixedBrightnessForBlock(iblockaccess, posX, posY + 1, posZ - 1);
                }

                if (!render.aoGrassXYZNCP && !render.aoGrassXYZNPC)
                {
                    render.aoLightValueScratchXYZNPP = render.aoLightValueScratchXZNP;
                    render.aoBrightnessXYZNPP = render.aoBrightnessXZNP;
                }
                else
                {
                    render.aoLightValueScratchXYZNPP = par1Block.getAmbientOcclusionLightValue(iblockaccess, posX, posY + 1, posZ + 1);
                    render.aoBrightnessXYZNPP = par1Block.getMixedBrightnessForBlock(iblockaccess, posX, posY + 1, posZ + 1);
                }

                if (blockMinX <= 0.0D)
                {
                    ++posX;
                }

                var12 = (render.aoLightValueScratchXYNN + render.aoLightValueScratchXYZNNP + render.aoLightValueXNeg + render.aoLightValueScratchXZNP) / 4.0F;
                var9 = (render.aoLightValueXNeg + render.aoLightValueScratchXZNP + render.aoLightValueScratchXYNP + render.aoLightValueScratchXYZNPP) / 4.0F;
                var10 = (render.aoLightValueScratchXZNN + render.aoLightValueXNeg + render.aoLightValueScratchXYZNPN + render.aoLightValueScratchXYNP) / 4.0F;
                var11 = (render.aoLightValueScratchXYZNNN + render.aoLightValueScratchXYNN + render.aoLightValueScratchXZNN + render.aoLightValueXNeg) / 4.0F;
                render.brightnessTopRight = render.getAoBrightness(render.aoBrightnessXYNN, render.aoBrightnessXYZNNP, render.aoBrightnessXZNP, var20);
                render.brightnessTopLeft = render.getAoBrightness(render.aoBrightnessXZNP, render.aoBrightnessXYNP, render.aoBrightnessXYZNPP, var20);
                render.brightnessBottomLeft = render.getAoBrightness(render.aoBrightnessXZNN, render.aoBrightnessXYZNPN, render.aoBrightnessXYNP, var20);
                render.brightnessBottomRight = render.getAoBrightness(render.aoBrightnessXYZNNN, render.aoBrightnessXYNN, render.aoBrightnessXZNN, var20);
            }
            else
            {
                var12 = render.aoLightValueXNeg;
                var11 = render.aoLightValueXNeg;
                var10 = render.aoLightValueXNeg;
                var9 = render.aoLightValueXNeg;
                render.brightnessTopLeft = render.brightnessBottomLeft = render.brightnessBottomRight = render.brightnessTopRight = var20;
            }

            render.colorRedTopLeft = render.colorRedBottomLeft = render.colorRedBottomRight = render.colorRedTopRight = (var17 ? par5 : 1.0F) * 0.6F;
            render.colorGreenTopLeft = render.colorGreenBottomLeft = render.colorGreenBottomRight = render.colorGreenTopRight = (var17 ? par6 : 1.0F) * 0.6F;
            render.colorBlueTopLeft = render.colorBlueBottomLeft = render.colorBlueBottomRight = render.colorBlueTopRight = (var17 ? par7 : 1.0F) * 0.6F;
            render.colorRedTopLeft *= var9;
            render.colorGreenTopLeft *= var9;
            render.colorBlueTopLeft *= var9;
            render.colorRedBottomLeft *= var10;
            render.colorGreenBottomLeft *= var10;
            render.colorBlueBottomLeft *= var10;
            render.colorRedBottomRight *= var11;
            render.colorGreenBottomRight *= var11;
            render.colorBlueBottomRight *= var11;
            render.colorRedTopRight *= var12;
            render.colorGreenTopRight *= var12;
            render.colorBlueTopRight *= var12;
            var27 = textureNorth;
            render.renderNorthFace(par1Block, (double)posX, (double)posY, (double)posZ, var27);

            if (Tessellator.instance.defaultTexture && render.fancyGrass && var27 == 3)
            {
                render.colorRedTopLeft *= par5;
                render.colorRedBottomLeft *= par5;
                render.colorRedBottomRight *= par5;
                render.colorRedTopRight *= par5;
                render.colorGreenTopLeft *= par6;
                render.colorGreenBottomLeft *= par6;
                render.colorGreenBottomRight *= par6;
                render.colorGreenTopRight *= par6;
                render.colorBlueTopLeft *= par7;
                render.colorBlueBottomLeft *= par7;
                render.colorBlueBottomRight *= par7;
                render.colorBlueTopRight *= par7;
                render.renderNorthFace(par1Block, (double)posX, (double)posY, (double)posZ, 38);
            }

            var8 = true;
        }

        if (render.renderAllFaces || par1Block.shouldSideBeRendered(iblockaccess, posX + 1, posY, posZ, 5))
        {
            if (render.aoType > 0)
            {
                if (blockMaxX >= 1.0D)
                {
                    ++posX;
                }

                render.aoLightValueScratchXYPN = par1Block.getAmbientOcclusionLightValue(iblockaccess, posX, posY - 1, posZ);
                render.aoLightValueScratchXZPN = par1Block.getAmbientOcclusionLightValue(iblockaccess, posX, posY, posZ - 1);
                render.aoLightValueScratchXZPP = par1Block.getAmbientOcclusionLightValue(iblockaccess, posX, posY, posZ + 1);
                render.aoLightValueScratchXYPP = par1Block.getAmbientOcclusionLightValue(iblockaccess, posX, posY + 1, posZ);
                render.aoBrightnessXYPN = par1Block.getMixedBrightnessForBlock(iblockaccess, posX, posY - 1, posZ);
                render.aoBrightnessXZPN = par1Block.getMixedBrightnessForBlock(iblockaccess, posX, posY, posZ - 1);
                render.aoBrightnessXZPP = par1Block.getMixedBrightnessForBlock(iblockaccess, posX, posY, posZ + 1);
                render.aoBrightnessXYPP = par1Block.getMixedBrightnessForBlock(iblockaccess, posX, posY + 1, posZ);

                if (!render.aoGrassXYZPNC && !render.aoGrassXYZPCN)
                {
                    render.aoLightValueScratchXYZPNN = render.aoLightValueScratchXZPN;
                    render.aoBrightnessXYZPNN = render.aoBrightnessXZPN;
                }
                else
                {
                    render.aoLightValueScratchXYZPNN = par1Block.getAmbientOcclusionLightValue(iblockaccess, posX, posY - 1, posZ - 1);
                    render.aoBrightnessXYZPNN = par1Block.getMixedBrightnessForBlock(iblockaccess, posX, posY - 1, posZ - 1);
                }

                if (!render.aoGrassXYZPNC && !render.aoGrassXYZPCP)
                {
                    render.aoLightValueScratchXYZPNP = render.aoLightValueScratchXZPP;
                    render.aoBrightnessXYZPNP = render.aoBrightnessXZPP;
                }
                else
                {
                    render.aoLightValueScratchXYZPNP = par1Block.getAmbientOcclusionLightValue(iblockaccess, posX, posY - 1, posZ + 1);
                    render.aoBrightnessXYZPNP = par1Block.getMixedBrightnessForBlock(iblockaccess, posX, posY - 1, posZ + 1);
                }

                if (!render.aoGrassXYZPPC && !render.aoGrassXYZPCN)
                {
                    render.aoLightValueScratchXYZPPN = render.aoLightValueScratchXZPN;
                    render.aoBrightnessXYZPPN = render.aoBrightnessXZPN;
                }
                else
                {
                    render.aoLightValueScratchXYZPPN = par1Block.getAmbientOcclusionLightValue(iblockaccess, posX, posY + 1, posZ - 1);
                    render.aoBrightnessXYZPPN = par1Block.getMixedBrightnessForBlock(iblockaccess, posX, posY + 1, posZ - 1);
                }

                if (!render.aoGrassXYZPPC && !render.aoGrassXYZPCP)
                {
                    render.aoLightValueScratchXYZPPP = render.aoLightValueScratchXZPP;
                    render.aoBrightnessXYZPPP = render.aoBrightnessXZPP;
                }
                else
                {
                    render.aoLightValueScratchXYZPPP = par1Block.getAmbientOcclusionLightValue(iblockaccess, posX, posY + 1, posZ + 1);
                    render.aoBrightnessXYZPPP = par1Block.getMixedBrightnessForBlock(iblockaccess, posX, posY + 1, posZ + 1);
                }

                if (blockMaxX >= 1.0D)
                {
                    --posX;
                }

                var9 = (render.aoLightValueScratchXYPN + render.aoLightValueScratchXYZPNP + render.aoLightValueXPos + render.aoLightValueScratchXZPP) / 4.0F;
                var12 = (render.aoLightValueXPos + render.aoLightValueScratchXZPP + render.aoLightValueScratchXYPP + render.aoLightValueScratchXYZPPP) / 4.0F;
                var11 = (render.aoLightValueScratchXZPN + render.aoLightValueXPos + render.aoLightValueScratchXYZPPN + render.aoLightValueScratchXYPP) / 4.0F;
                var10 = (render.aoLightValueScratchXYZPNN + render.aoLightValueScratchXYPN + render.aoLightValueScratchXZPN + render.aoLightValueXPos) / 4.0F;
                render.brightnessTopLeft = render.getAoBrightness(render.aoBrightnessXYPN, render.aoBrightnessXYZPNP, render.aoBrightnessXZPP, var23);
                render.brightnessTopRight = render.getAoBrightness(render.aoBrightnessXZPP, render.aoBrightnessXYPP, render.aoBrightnessXYZPPP, var23);
                render.brightnessBottomRight = render.getAoBrightness(render.aoBrightnessXZPN, render.aoBrightnessXYZPPN, render.aoBrightnessXYPP, var23);
                render.brightnessBottomLeft = render.getAoBrightness(render.aoBrightnessXYZPNN, render.aoBrightnessXYPN, render.aoBrightnessXZPN, var23);
            }
            else
            {
                var12 = render.aoLightValueXPos;
                var11 = render.aoLightValueXPos;
                var10 = render.aoLightValueXPos;
                var9 = render.aoLightValueXPos;
                render.brightnessTopLeft = render.brightnessBottomLeft = render.brightnessBottomRight = render.brightnessTopRight = var23;
            }

            render.colorRedTopLeft = render.colorRedBottomLeft = render.colorRedBottomRight = render.colorRedTopRight = (var18 ? par5 : 1.0F) * 0.6F;
            render.colorGreenTopLeft = render.colorGreenBottomLeft = render.colorGreenBottomRight = render.colorGreenTopRight = (var18 ? par6 : 1.0F) * 0.6F;
            render.colorBlueTopLeft = render.colorBlueBottomLeft = render.colorBlueBottomRight = render.colorBlueTopRight = (var18 ? par7 : 1.0F) * 0.6F;
            render.colorRedTopLeft *= var9;
            render.colorGreenTopLeft *= var9;
            render.colorBlueTopLeft *= var9;
            render.colorRedBottomLeft *= var10;
            render.colorGreenBottomLeft *= var10;
            render.colorBlueBottomLeft *= var10;
            render.colorRedBottomRight *= var11;
            render.colorGreenBottomRight *= var11;
            render.colorBlueBottomRight *= var11;
            render.colorRedTopRight *= var12;
            render.colorGreenTopRight *= var12;
            render.colorBlueTopRight *= var12;
            var27 = textureSouth;
            render.renderSouthFace(par1Block, (double)posX, (double)posY, (double)posZ, var27);

            if (Tessellator.instance.defaultTexture && render.fancyGrass && var27 == 3)
            {
                render.colorRedTopLeft *= par5;
                render.colorRedBottomLeft *= par5;
                render.colorRedBottomRight *= par5;
                render.colorRedTopRight *= par5;
                render.colorGreenTopLeft *= par6;
                render.colorGreenBottomLeft *= par6;
                render.colorGreenBottomRight *= par6;
                render.colorGreenTopRight *= par6;
                render.colorBlueTopLeft *= par7;
                render.colorBlueBottomLeft *= par7;
                render.colorBlueBottomRight *= par7;
                render.colorBlueTopRight *= par7;
                render.renderSouthFace(par1Block, (double)posX, (double)posY, (double)posZ, 38);
            }

            var8 = true;
        }

        render.enableAO = false;
        return var8;
    }
    
    /**
     * Renders a standard cube block at the given coordinates, with a given color ratio.  Args: block, x, y, z, r, g, b
     */
    public boolean renderTexturedBlockColor(RenderBlocks render, Block par1Block, IBlockAccess iblockaccess, 
    		int posX, int posY, int posZ, float par5, float par6, float par7, 
    		int textureBottom, int textureTop, int textureEast, 
    		int textureWest, int textureNorth, int textureSouth)
    {
        render.enableAO = false;
        Tessellator var8 = Tessellator.instance;
        boolean var9 = false;
        float var10 = 0.5F;
        float var11 = 1.0F;
        float var12 = 0.8F;
        float var13 = 0.6F;
        float var14 = var11 * par5;
        float var15 = var11 * par6;
        float var16 = var11 * par7;
        float var17 = var10;
        float var18 = var12;
        float var19 = var13;
        float var20 = var10;
        float var21 = var12;
        float var22 = var13;
        float var23 = var10;
        float var24 = var12;
        float var25 = var13;

        if (par1Block != Block.grass)
        {
            var17 = var10 * par5;
            var18 = var12 * par5;
            var19 = var13 * par5;
            var20 = var10 * par6;
            var21 = var12 * par6;
            var22 = var13 * par6;
            var23 = var10 * par7;
            var24 = var12 * par7;
            var25 = var13 * par7;
        }

        int var26 = par1Block.getMixedBrightnessForBlock(iblockaccess, posX, posY, posZ);

        if (render.renderAllFaces || par1Block.shouldSideBeRendered(iblockaccess, posX, posY - 1, posZ, 0))
        {
            var8.setBrightness(blockMinY > 0.0D ? var26 : par1Block.getMixedBrightnessForBlock(iblockaccess, posX, posY - 1, posZ));
            var8.setColorOpaque_F(var17, var20, var23);
            render.renderBottomFace(par1Block, (double)posX, (double)posY, (double)posZ, textureBottom);
            var9 = true;
        }

        if (render.renderAllFaces || par1Block.shouldSideBeRendered(iblockaccess, posX, posY + 1, posZ, 1))
        {
            var8.setBrightness(blockMaxY < 1.0D ? var26 : par1Block.getMixedBrightnessForBlock(iblockaccess, posX, posY + 1, posZ));
            var8.setColorOpaque_F(var14, var15, var16);
            render.renderTopFace(par1Block, (double)posX, (double)posY, (double)posZ, textureTop);
            var9 = true;
        }

        int var27;

        if (render.renderAllFaces || par1Block.shouldSideBeRendered(iblockaccess, posX, posY, posZ - 1, 2))
        {
            var8.setBrightness(blockMinZ > 0.0D ? var26 : par1Block.getMixedBrightnessForBlock(iblockaccess, posX, posY, posZ - 1));
            var8.setColorOpaque_F(var18, var21, var24);
            var27 = textureEast;
            render.renderEastFace(par1Block, (double)posX, (double)posY, (double)posZ, var27);

            if (Tessellator.instance.defaultTexture && render.fancyGrass && var27 == 3)
            {
                var8.setColorOpaque_F(var18 * par5, var21 * par6, var24 * par7);
                render.renderEastFace(par1Block, (double)posX, (double)posY, (double)posZ, 38);
            }

            var9 = true;
        }

        if (render.renderAllFaces || par1Block.shouldSideBeRendered(iblockaccess, posX, posY, posZ + 1, 3))
        {
            var8.setBrightness(blockMaxZ < 1.0D ? var26 : par1Block.getMixedBrightnessForBlock(iblockaccess, posX, posY, posZ + 1));
            var8.setColorOpaque_F(var18, var21, var24);
            var27 = textureWest;
            render.renderWestFace(par1Block, (double)posX, (double)posY, (double)posZ, var27);

            if (Tessellator.instance.defaultTexture && render.fancyGrass && var27 == 3)
            {
                var8.setColorOpaque_F(var18 * par5, var21 * par6, var24 * par7);
                render.renderWestFace(par1Block, (double)posX, (double)posY, (double)posZ, 38);
            }

            var9 = true;
        }

        if (render.renderAllFaces || par1Block.shouldSideBeRendered(iblockaccess, posX - 1, posY, posZ, 4))
        {
            var8.setBrightness(blockMinX > 0.0D ? var26 : par1Block.getMixedBrightnessForBlock(iblockaccess, posX - 1, posY, posZ));
            var8.setColorOpaque_F(var19, var22, var25);
            var27 = textureNorth;
            render.renderNorthFace(par1Block, (double)posX, (double)posY, (double)posZ, var27);

            if (Tessellator.instance.defaultTexture && render.fancyGrass && var27 == 3)
            {
                var8.setColorOpaque_F(var19 * par5, var22 * par6, var25 * par7);
                render.renderNorthFace(par1Block, (double)posX, (double)posY, (double)posZ, 38);
            }

            var9 = true;
        }

        if (render.renderAllFaces || par1Block.shouldSideBeRendered(iblockaccess, posX + 1, posY, posZ, 5))
        {
            var8.setBrightness(blockMaxX < 1.0D ? var26 : par1Block.getMixedBrightnessForBlock(iblockaccess, posX + 1, posY, posZ));
            var8.setColorOpaque_F(var19, var22, var25);
            var27 = textureSouth;
            render.renderSouthFace(par1Block, (double)posX, (double)posY, (double)posZ, var27);

            if (Tessellator.instance.defaultTexture && render.fancyGrass && var27 == 3)
            {
                var8.setColorOpaque_F(var19 * par5, var22 * par6, var25 * par7);
                render.renderSouthFace(par1Block, (double)posX, (double)posY, (double)posZ, 38);
            }

            var9 = true;
        }

        return var9;
    }
    
    public static void renderDo(RenderBlocks renderblocks, Block block, int meta)
	{
		Tessellator tessellator = Tessellator.instance;
		GL11.glTranslatef(-0.5F, -0.5F, -0.5F);
		tessellator.startDrawingQuads();
		tessellator.setNormal(0.0F, -1F, 0.0F);
		renderblocks.renderBottomFace(block, 0.0D, 0.0D, 0.0D, block.getBlockTextureFromSideAndMetadata(0, meta));
		tessellator.draw();
		tessellator.startDrawingQuads();
		tessellator.setNormal(0.0F, 1.0F, 0.0F);
		renderblocks.renderTopFace(block, 0.0D, 0.0D, 0.0D, block.getBlockTextureFromSideAndMetadata(1, meta));
		tessellator.draw();
		tessellator.startDrawingQuads();
		tessellator.setNormal(0.0F, 0.0F, -1F);
		renderblocks.renderEastFace(block, 0.0D, 0.0D, 0.0D, block.getBlockTextureFromSideAndMetadata(2, meta));
		tessellator.draw();
		tessellator.startDrawingQuads();
		tessellator.setNormal(0.0F, 0.0F, 1.0F);
		renderblocks.renderWestFace(block, 0.0D, 0.0D, 0.0D, block.getBlockTextureFromSideAndMetadata(3, meta));
		tessellator.draw();
		tessellator.startDrawingQuads();
		tessellator.setNormal(-1F, 0.0F, 0.0F);
		renderblocks.renderNorthFace(block, 0.0D, 0.0D, 0.0D, block.getBlockTextureFromSideAndMetadata(4, meta));
		tessellator.draw();
		tessellator.startDrawingQuads();
		tessellator.setNormal(1.0F, 0.0F, 0.0F);
		renderblocks.renderSouthFace(block, 0.0D, 0.0D, 0.0D, block.getBlockTextureFromSideAndMetadata(5, meta));
		tessellator.draw();
		GL11.glTranslatef(0.5F, 0.5F, 0.5F);
	}
}