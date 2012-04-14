package net.minecraft.src.magicslopes;
import org.lwjgl.opengl.GL11;

import net.minecraft.client.Minecraft;
import net.minecraft.src.*;

public class GenericRenderHelper
{
	
	private static GenericRenderHelper instance = new GenericRenderHelper();
	
	public static GenericRenderHelper getInstance(){
		return instance;
	}
    
	/**
     * Renders a textured cube block at the given coordinates
     */
    public boolean renderSlopedBlock(RenderBlocks render, Block par1Block, 
    		IBlockAccess iblockaccess, int posX, int posY, int posZ)
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

        return Minecraft.isAmbientOcclusionEnabled() && Block.lightValue[par1Block.blockID] == 0 ? 
        		this.renderSlopedBlockAO(render, par1Block, iblockaccess, posX, posY, posZ, var6, var7, var8) 
        		: this.renderSlopedBlockColor(render, par1Block, iblockaccess, posX, posY, posZ, var6, var7, var8);
    }

    public boolean renderSlopedBlockAO(RenderBlocks render, Block par1Block, IBlockAccess iblockaccess, 
    		int posX, int posY, int posZ, float par5, float par6, float par7)
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

        if (par1Block.minY <= 0.0D)
        {
            var21 = par1Block.getMixedBrightnessForBlock(iblockaccess, posX, posY - 1, posZ);
        }

        if (par1Block.maxY >= 1.0D)
        {
            var24 = par1Block.getMixedBrightnessForBlock(iblockaccess, posX, posY + 1, posZ);
        }

        if (par1Block.minX <= 0.0D)
        {
            var20 = par1Block.getMixedBrightnessForBlock(iblockaccess, posX - 1, posY, posZ);
        }

        if (par1Block.maxX >= 1.0D)
        {
            var23 = par1Block.getMixedBrightnessForBlock(iblockaccess, posX + 1, posY, posZ);
        }

        if (par1Block.minZ <= 0.0D)
        {
            var22 = par1Block.getMixedBrightnessForBlock(iblockaccess, posX, posY, posZ - 1);
        }

        if (par1Block.maxZ >= 1.0D)
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
                if (par1Block.minY <= 0.0D)
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

                if (par1Block.minY <= 0.0D)
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
            this.renderBottomFace(par1Block, render, (double)posX, (double)posY, (double)posZ, par1Block.getBlockTexture(iblockaccess, posX, posY, posZ, 0));
            var8 = true;
        }

        if (render.renderAllFaces || par1Block.shouldSideBeRendered(iblockaccess, posX, posY + 1, posZ, 1))
        {
            if (render.aoType > 0)
            {
                if (par1Block.maxY >= 1.0D)
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

                if (par1Block.maxY >= 1.0D)
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
            this.renderTopFace(par1Block, render, (double)posX, (double)posY, (double)posZ, par1Block.getBlockTexture(iblockaccess, posX, posY, posZ, 1));
            var8 = true;
        }

        int var27;

        if (render.renderAllFaces || par1Block.shouldSideBeRendered(iblockaccess, posX, posY, posZ - 1, 2))
        {
            if (render.aoType > 0)
            {
                if (par1Block.minZ <= 0.0D)
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

                if (par1Block.minZ <= 0.0D)
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
            var27 = par1Block.getBlockTexture(iblockaccess, posX, posY, posZ, 2);
            this.renderEastFace(par1Block, render, (double)posX, (double)posY, (double)posZ, var27);

            /*if (Tessellator.instance.defaultTexture && render.cfgGrassFix && var27 == 3)
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
                this.renderEastFace(par1Block, (double)posX, (double)posY, (double)posZ, 38);
            }*/

            var8 = true;
        }

        if (render.renderAllFaces || par1Block.shouldSideBeRendered(iblockaccess, posX, posY, posZ + 1, 3))
        {
            if (render.aoType > 0)
            {
                if (par1Block.maxZ >= 1.0D)
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

                if (par1Block.maxZ >= 1.0D)
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
            var27 = par1Block.getBlockTexture(iblockaccess, posX, posY, posZ, 3);
            this.renderWestFace(par1Block, render, (double)posX, (double)posY, (double)posZ, var27);

            if (Tessellator.instance.defaultTexture && render.cfgGrassFix && var27 == 3)
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
                this.renderWestFace(par1Block, render, (double)posX, (double)posY, (double)posZ, 38);
            }

            var8 = true;
        }

        if (render.renderAllFaces || par1Block.shouldSideBeRendered(iblockaccess, posX - 1, posY, posZ, 4))
        {
            if (render.aoType > 0)
            {
                if (par1Block.minX <= 0.0D)
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

                if (par1Block.minX <= 0.0D)
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
            var27 = par1Block.getBlockTexture(iblockaccess, posX, posY, posZ, 4);
            this.renderNorthFace(par1Block, render, (double)posX, (double)posY, (double)posZ, var27);

            if (Tessellator.instance.defaultTexture && render.cfgGrassFix && var27 == 3)
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
                this.renderNorthFace(par1Block, render, (double)posX, (double)posY, (double)posZ, 38);
            }

            var8 = true;
        }

        if (render.renderAllFaces || par1Block.shouldSideBeRendered(iblockaccess, posX + 1, posY, posZ, 5))
        {
            if (render.aoType > 0)
            {
                if (par1Block.maxX >= 1.0D)
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

                if (par1Block.maxX >= 1.0D)
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
            var27 = par1Block.getBlockTexture(iblockaccess, posX, posY, posZ, 5);
            this.renderSouthFace(par1Block, render, (double)posX, (double)posY, (double)posZ, var27);

            if (Tessellator.instance.defaultTexture && render.cfgGrassFix && var27 == 3)
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
                this.renderSouthFace(par1Block, render, (double)posX, (double)posY, (double)posZ, 38);
            }

            var8 = true;
        }

        render.enableAO = false;
        return var8;
    }
    
    /**
     * Renders a standard cube block at the given coordinates, with a given color ratio.  Args: block, x, y, z, r, g, b
     */
    public boolean renderSlopedBlockColor(RenderBlocks render, Block par1Block, IBlockAccess iblockaccess, 
    		int posX, int posY, int posZ, float par5, float par6, float par7)
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
            var8.setBrightness(par1Block.minY > 0.0D ? var26 : par1Block.getMixedBrightnessForBlock(iblockaccess, posX, posY - 1, posZ));
            var8.setColorOpaque_F(var17, var20, var23);
            this.renderBottomFace(par1Block, render, (double)posX, (double)posY, (double)posZ, par1Block.getBlockTexture(iblockaccess, posX, posY, posZ, 0));
            var9 = true;
        }

        if (render.renderAllFaces || par1Block.shouldSideBeRendered(iblockaccess, posX, posY + 1, posZ, 1))
        {
            var8.setBrightness(par1Block.maxY < 1.0D ? var26 : par1Block.getMixedBrightnessForBlock(iblockaccess, posX, posY + 1, posZ));
            var8.setColorOpaque_F(var14, var15, var16);
            this.renderTopFace(par1Block, render, (double)posX, (double)posY, (double)posZ, par1Block.getBlockTexture(iblockaccess, posX, posY, posZ, 1));
            var9 = true;
        }

        int var27;

        if (render.renderAllFaces || par1Block.shouldSideBeRendered(iblockaccess, posX, posY, posZ - 1, 2))
        {
            var8.setBrightness(par1Block.minZ > 0.0D ? var26 : par1Block.getMixedBrightnessForBlock(iblockaccess, posX, posY, posZ - 1));
            var8.setColorOpaque_F(var18, var21, var24);
            var27 = par1Block.getBlockTexture(iblockaccess, posX, posY, posZ, 2);
            this.renderEastFace(par1Block, render, (double)posX, (double)posY, (double)posZ, var27);

            if (Tessellator.instance.defaultTexture && render.cfgGrassFix && var27 == 3)
            {
                var8.setColorOpaque_F(var18 * par5, var21 * par6, var24 * par7);
                this.renderEastFace(par1Block, render, (double)posX, (double)posY, (double)posZ, 38);
            }

            var9 = true;
        }

        if (render.renderAllFaces || par1Block.shouldSideBeRendered(iblockaccess, posX, posY, posZ + 1, 3))
        {
            var8.setBrightness(par1Block.maxZ < 1.0D ? var26 : par1Block.getMixedBrightnessForBlock(iblockaccess, posX, posY, posZ + 1));
            var8.setColorOpaque_F(var18, var21, var24);
            var27 = par1Block.getBlockTexture(iblockaccess, posX, posY, posZ, 3);
            this.renderWestFace(par1Block, render, (double)posX, (double)posY, (double)posZ, var27);

            if (Tessellator.instance.defaultTexture && render.cfgGrassFix && var27 == 3)
            {
                var8.setColorOpaque_F(var18 * par5, var21 * par6, var24 * par7);
                this.renderWestFace(par1Block, render, (double)posX, (double)posY, (double)posZ, 38);
            }

            var9 = true;
        }

        if (render.renderAllFaces || par1Block.shouldSideBeRendered(iblockaccess, posX - 1, posY, posZ, 4))
        {
            var8.setBrightness(par1Block.minX > 0.0D ? var26 : par1Block.getMixedBrightnessForBlock(iblockaccess, posX - 1, posY, posZ));
            var8.setColorOpaque_F(var19, var22, var25);
            var27 = par1Block.getBlockTexture(iblockaccess, posX, posY, posZ, 4);
            this.renderNorthFace(par1Block, render, (double)posX, (double)posY, (double)posZ, var27);

            if (Tessellator.instance.defaultTexture && render.cfgGrassFix && var27 == 3)
            {
                var8.setColorOpaque_F(var19 * par5, var22 * par6, var25 * par7);
                this.renderNorthFace(par1Block, render, (double)posX, (double)posY, (double)posZ, 38);
            }

            var9 = true;
        }

        if (render.renderAllFaces || par1Block.shouldSideBeRendered(iblockaccess, posX + 1, posY, posZ, 5))
        {
            var8.setBrightness(par1Block.maxX < 1.0D ? var26 : par1Block.getMixedBrightnessForBlock(iblockaccess, posX + 1, posY, posZ));
            var8.setColorOpaque_F(var19, var22, var25);
            var27 = par1Block.getBlockTexture(iblockaccess, posX, posY, posZ, 5);
            this.renderSouthFace(par1Block, render, (double)posX, (double)posY, (double)posZ, var27);

            if (Tessellator.instance.defaultTexture && render.cfgGrassFix && var27 == 3)
            {
                var8.setColorOpaque_F(var19 * par5, var22 * par6, var25 * par7);
                this.renderSouthFace(par1Block, render, (double)posX, (double)posY, (double)posZ, 38);
            }

            var9 = true;
        }

        return var9;
    }
    
    /**
     * Renders the given texture to the bottom face of the block. Args: block, x, y, z, texture
     */
    public void renderBottomFace(Block par1Block, RenderBlocks render, double par2, double par4, double par6, int par8)
    {
        Tessellator var9 = Tessellator.instance;

        int var10 = (par8 & 15) << 4;
        int var11 = par8 & 240;
        double var12 = ((double)var10 + par1Block.minX * 16.0D) / 256.0D;
        double var14 = ((double)var10 + par1Block.maxX * 16.0D - 0.01D) / 256.0D;
        double var16 = ((double)var11 + par1Block.minZ * 16.0D) / 256.0D;
        double var18 = ((double)var11 + par1Block.maxZ * 16.0D - 0.01D) / 256.0D;

        if (par1Block.minX < 0.0D || par1Block.maxX > 1.0D)
        {
            var12 = (double)(((float)var10 + 0.0F) / 256.0F);
            var14 = (double)(((float)var10 + 15.99F) / 256.0F);
        }

        if (par1Block.minZ < 0.0D || par1Block.maxZ > 1.0D)
        {
            var16 = (double)(((float)var11 + 0.0F) / 256.0F);
            var18 = (double)(((float)var11 + 15.99F) / 256.0F);
        }

        double var20 = var14;
        double var22 = var12;
        double var24 = var16;
        double var26 = var18;

        if (render.uvRotateBottom == 2)
        {
            var12 = ((double)var10 + par1Block.minZ * 16.0D) / 256.0D;
            var16 = ((double)(var11 + 16) - par1Block.maxX * 16.0D) / 256.0D;
            var14 = ((double)var10 + par1Block.maxZ * 16.0D) / 256.0D;
            var18 = ((double)(var11 + 16) - par1Block.minX * 16.0D) / 256.0D;
            var24 = var16;
            var26 = var18;
            var20 = var12;
            var22 = var14;
            var16 = var18;
            var18 = var24;
        }
        else if (render.uvRotateBottom == 1)
        {
            var12 = ((double)(var10 + 16) - par1Block.maxZ * 16.0D) / 256.0D;
            var16 = ((double)var11 + par1Block.minX * 16.0D) / 256.0D;
            var14 = ((double)(var10 + 16) - par1Block.minZ * 16.0D) / 256.0D;
            var18 = ((double)var11 + par1Block.maxX * 16.0D) / 256.0D;
            var20 = var14;
            var22 = var12;
            var12 = var14;
            var14 = var22;
            var24 = var18;
            var26 = var16;
        }
        else if (render.uvRotateBottom == 3)
        {
            var12 = ((double)(var10 + 16) - par1Block.minX * 16.0D) / 256.0D;
            var14 = ((double)(var10 + 16) - par1Block.maxX * 16.0D - 0.01D) / 256.0D;
            var16 = ((double)(var11 + 16) - par1Block.minZ * 16.0D) / 256.0D;
            var18 = ((double)(var11 + 16) - par1Block.maxZ * 16.0D - 0.01D) / 256.0D;
            var20 = var14;
            var22 = var12;
            var24 = var16;
            var26 = var18;
        }

        double var28 = par2 + par1Block.minX;
        double var30 = par2 + par1Block.maxX;
        double var32 = par4 + par1Block.minY;
        double var34 = par6 + par1Block.minZ;
        double var36 = par6 + par1Block.maxZ;

        if (render.enableAO)
        {
            var9.setColorOpaque_F(render.colorRedTopLeft, render.colorGreenTopLeft, render.colorBlueTopLeft);
            var9.setBrightness(render.brightnessTopLeft);
            var9.addVertexWithUV(var28, var32, var36, var22, var26);
            var9.setColorOpaque_F(render.colorRedBottomLeft, render.colorGreenBottomLeft, render.colorBlueBottomLeft);
            var9.setBrightness(render.brightnessBottomLeft);
            var9.addVertexWithUV(var28, var32, var34, var12, var16);
            var9.setColorOpaque_F(render.colorRedBottomRight, render.colorGreenBottomRight, render.colorBlueBottomRight);
            var9.setBrightness(render.brightnessBottomRight);
            var9.addVertexWithUV(var30, var32, var34, var20, var24);
            var9.setColorOpaque_F(render.colorRedTopRight, render.colorGreenTopRight, render.colorBlueTopRight);
            var9.setBrightness(render.brightnessTopRight);
            var9.addVertexWithUV(var30, var32, var36, var14, var18);
        }
        else
        {
            var9.addVertexWithUV(var28, var32, var36, var22, var26);
            var9.addVertexWithUV(var28, var32, var34, var12, var16);
            var9.addVertexWithUV(var30, var32, var34, var20, var24);
            var9.addVertexWithUV(var30, var32, var36, var14, var18);
        }
    }

    /**
     * Renders the given texture to the top face of the block. Args: block, x, y, z, texture
     */
    public void renderTopFace(Block par1Block, RenderBlocks render, double par2, double par4, double par6, int par8)
    {
        Tessellator var9 = Tessellator.instance;

        int var10 = (par8 & 15) << 4;
        int var11 = par8 & 240;
        double var12 = ((double)var10 + par1Block.minX * 16.0D) / 256.0D;
        double var14 = ((double)var10 + par1Block.maxX * 16.0D - 0.01D) / 256.0D;
        double var16 = ((double)var11 + par1Block.minZ * 16.0D) / 256.0D;
        double var18 = ((double)var11 + par1Block.maxZ * 16.0D - 0.01D) / 256.0D;

        if (par1Block.minX < 0.0D || par1Block.maxX > 1.0D)
        {
            var12 = (double)(((float)var10 + 0.0F) / 256.0F);
            var14 = (double)(((float)var10 + 15.99F) / 256.0F);
        }

        if (par1Block.minZ < 0.0D || par1Block.maxZ > 1.0D)
        {
            var16 = (double)(((float)var11 + 0.0F) / 256.0F);
            var18 = (double)(((float)var11 + 15.99F) / 256.0F);
        }

        double var20 = var14;
        double var22 = var12;
        double var24 = var16;
        double var26 = var18;

        if (render.uvRotateTop == 1)
        {
            var12 = ((double)var10 + par1Block.minZ * 16.0D) / 256.0D;
            var16 = ((double)(var11 + 16) - par1Block.maxX * 16.0D) / 256.0D;
            var14 = ((double)var10 + par1Block.maxZ * 16.0D) / 256.0D;
            var18 = ((double)(var11 + 16) - par1Block.minX * 16.0D) / 256.0D;
            var24 = var16;
            var26 = var18;
            var20 = var12;
            var22 = var14;
            var16 = var18;
            var18 = var24;
        }
        else if (render.uvRotateTop == 2)
        {
            var12 = ((double)(var10 + 16) - par1Block.maxZ * 16.0D) / 256.0D;
            var16 = ((double)var11 + par1Block.minX * 16.0D) / 256.0D;
            var14 = ((double)(var10 + 16) - par1Block.minZ * 16.0D) / 256.0D;
            var18 = ((double)var11 + par1Block.maxX * 16.0D) / 256.0D;
            var20 = var14;
            var22 = var12;
            var12 = var14;
            var14 = var22;
            var24 = var18;
            var26 = var16;
        }
        else if (render.uvRotateTop == 3)
        {
            var12 = ((double)(var10 + 16) - par1Block.minX * 16.0D) / 256.0D;
            var14 = ((double)(var10 + 16) - par1Block.maxX * 16.0D - 0.01D) / 256.0D;
            var16 = ((double)(var11 + 16) - par1Block.minZ * 16.0D) / 256.0D;
            var18 = ((double)(var11 + 16) - par1Block.maxZ * 16.0D - 0.01D) / 256.0D;
            var20 = var14;
            var22 = var12;
            var24 = var16;
            var26 = var18;
        }

        double var28 = par2 + par1Block.minX;
        double var30 = par2 + par1Block.maxX;
        double var32 = par4 + par1Block.maxY;
        double var34 = par6 + par1Block.minZ;
        double var36 = par6 + par1Block.maxZ;

        if (render.enableAO)
        {
            var9.setColorOpaque_F(render.colorRedTopLeft, render.colorGreenTopLeft, render.colorBlueTopLeft);
            var9.setBrightness(render.brightnessTopLeft);
            var9.addVertexWithUV(var30, var32, var36, var14, var18);
            var9.setColorOpaque_F(render.colorRedBottomLeft, render.colorGreenBottomLeft, render.colorBlueBottomLeft);
            var9.setBrightness(render.brightnessBottomLeft);
            var9.addVertexWithUV(var30, var32, var34, var20, var24);
            var9.setColorOpaque_F(render.colorRedBottomRight, render.colorGreenBottomRight, render.colorBlueBottomRight);
            var9.setBrightness(render.brightnessBottomRight);
            var9.addVertexWithUV(var28, var32, var34, var12, var16);
            var9.setColorOpaque_F(render.colorRedTopRight, render.colorGreenTopRight, render.colorBlueTopRight);
            var9.setBrightness(render.brightnessTopRight);
            var9.addVertexWithUV(var28, var32, var36, var22, var26);
        }
        else
        {
            var9.addVertexWithUV(var30, var32, var36, var14, var18);
            var9.addVertexWithUV(var30, var32, var34, var20, var24);
            var9.addVertexWithUV(var28, var32, var34, var12, var16);
            var9.addVertexWithUV(var28, var32, var36, var22, var26);
        }
    }

    /**
     * Renders the given texture to the east (z-negative) face of the block.  Args: block, x, y, z, texture
     */
    public void renderEastFace(Block par1Block, RenderBlocks render, double par2, double par4, double par6, int par8)
    {
        Tessellator var9 = Tessellator.instance;

        int var10 = (par8 & 15) << 4;
        int var11 = par8 & 240;
        double var12 = ((double)var10 + par1Block.minX * 16.0D) / 256.0D;
        double var14 = ((double)var10 + par1Block.maxX * 16.0D - 0.01D) / 256.0D;
        double var16 = ((double)(var11 + 16) - par1Block.maxY * 16.0D) / 256.0D;
        double var18 = ((double)(var11 + 16) - par1Block.minY * 16.0D - 0.01D) / 256.0D;
        double var20;

        if (render.flipTexture)
        {
            var20 = var12;
            var12 = var14;
            var14 = var20;
        }

        if (par1Block.minX < 0.0D || par1Block.maxX > 1.0D)
        {
            var12 = (double)(((float)var10 + 0.0F) / 256.0F);
            var14 = (double)(((float)var10 + 15.99F) / 256.0F);
        }

        if (par1Block.minY < 0.0D || par1Block.maxY > 1.0D)
        {
            var16 = (double)(((float)var11 + 0.0F) / 256.0F);
            var18 = (double)(((float)var11 + 15.99F) / 256.0F);
        }

        var20 = var14;
        double var22 = var12;
        double var24 = var16;
        double var26 = var18;

        if (render.uvRotateEast == 2)
        {
            var12 = ((double)var10 + par1Block.minY * 16.0D) / 256.0D;
            var16 = ((double)(var11 + 16) - par1Block.minX * 16.0D) / 256.0D;
            var14 = ((double)var10 + par1Block.maxY * 16.0D) / 256.0D;
            var18 = ((double)(var11 + 16) - par1Block.maxX * 16.0D) / 256.0D;
            var24 = var16;
            var26 = var18;
            var20 = var12;
            var22 = var14;
            var16 = var18;
            var18 = var24;
        }
        else if (render.uvRotateEast == 1)
        {
            var12 = ((double)(var10 + 16) - par1Block.maxY * 16.0D) / 256.0D;
            var16 = ((double)var11 + par1Block.maxX * 16.0D) / 256.0D;
            var14 = ((double)(var10 + 16) - par1Block.minY * 16.0D) / 256.0D;
            var18 = ((double)var11 + par1Block.minX * 16.0D) / 256.0D;
            var20 = var14;
            var22 = var12;
            var12 = var14;
            var14 = var22;
            var24 = var18;
            var26 = var16;
        }
        else if (render.uvRotateEast == 3)
        {
            var12 = ((double)(var10 + 16) - par1Block.minX * 16.0D) / 256.0D;
            var14 = ((double)(var10 + 16) - par1Block.maxX * 16.0D - 0.01D) / 256.0D;
            var16 = ((double)var11 + par1Block.maxY * 16.0D) / 256.0D;
            var18 = ((double)var11 + par1Block.minY * 16.0D - 0.01D) / 256.0D;
            var20 = var14;
            var22 = var12;
            var24 = var16;
            var26 = var18;
        }

        double var28 = par2 + par1Block.minX;
        double var30 = par2 + par1Block.maxX;
        double var32 = par4 + par1Block.minY;
        double var34 = par4 + par1Block.maxY;
        double var36 = par6 + par1Block.minZ;

        if (render.enableAO)
        {
            var9.setColorOpaque_F(render.colorRedTopLeft, render.colorGreenTopLeft, render.colorBlueTopLeft);
            var9.setBrightness(render.brightnessTopLeft);
            var9.addVertexWithUV(var28, var34, var36, var20, var24);
            var9.setColorOpaque_F(render.colorRedBottomLeft, render.colorGreenBottomLeft, render.colorBlueBottomLeft);
            var9.setBrightness(render.brightnessBottomLeft);
            var9.addVertexWithUV(var30, var34, var36, var12, var16);
            var9.setColorOpaque_F(render.colorRedBottomRight, render.colorGreenBottomRight, render.colorBlueBottomRight);
            var9.setBrightness(render.brightnessBottomRight);
            var9.addVertexWithUV(var30, var32, var36, var22, var26);
            var9.setColorOpaque_F(render.colorRedTopRight, render.colorGreenTopRight, render.colorBlueTopRight);
            var9.setBrightness(render.brightnessTopRight);
            var9.addVertexWithUV(var28, var32, var36, var14, var18);
        }
        else
        {
            var9.addVertexWithUV(var28, var34, var36, var20, var24);
            var9.addVertexWithUV(var30, var34, var36, var12, var16);
            var9.addVertexWithUV(var30, var32, var36, var22, var26);
            var9.addVertexWithUV(var28, var32, var36, var14, var18);
        }
    }

    /**
     * Renders the given texture to the west (z-positive) face of the block.  Args: block, x, y, z, texture
     */
    public void renderWestFace(Block par1Block, RenderBlocks render, double par2, double par4, double par6, int par8)
    {
        Tessellator var9 = Tessellator.instance;

        int var10 = (par8 & 15) << 4;
        int var11 = par8 & 240;
        double var12 = ((double)var10 + par1Block.minX * 16.0D) / 256.0D;
        double var14 = ((double)var10 + par1Block.maxX * 16.0D - 0.01D) / 256.0D;
        double var16 = ((double)(var11 + 16) - par1Block.maxY * 16.0D) / 256.0D;
        double var18 = ((double)(var11 + 16) - par1Block.minY * 16.0D - 0.01D) / 256.0D;
        double var20;

        if (render.flipTexture)
        {
            var20 = var12;
            var12 = var14;
            var14 = var20;
        }

        if (par1Block.minX < 0.0D || par1Block.maxX > 1.0D)
        {
            var12 = (double)(((float)var10 + 0.0F) / 256.0F);
            var14 = (double)(((float)var10 + 15.99F) / 256.0F);
        }

        if (par1Block.minY < 0.0D || par1Block.maxY > 1.0D)
        {
            var16 = (double)(((float)var11 + 0.0F) / 256.0F);
            var18 = (double)(((float)var11 + 15.99F) / 256.0F);
        }

        var20 = var14;
        double var22 = var12;
        double var24 = var16;
        double var26 = var18;

        if (render.uvRotateWest == 1)
        {
            var12 = ((double)var10 + par1Block.minY * 16.0D) / 256.0D;
            var18 = ((double)(var11 + 16) - par1Block.minX * 16.0D) / 256.0D;
            var14 = ((double)var10 + par1Block.maxY * 16.0D) / 256.0D;
            var16 = ((double)(var11 + 16) - par1Block.maxX * 16.0D) / 256.0D;
            var24 = var16;
            var26 = var18;
            var20 = var12;
            var22 = var14;
            var16 = var18;
            var18 = var24;
        }
        else if (render.uvRotateWest == 2)
        {
            var12 = ((double)(var10 + 16) - par1Block.maxY * 16.0D) / 256.0D;
            var16 = ((double)var11 + par1Block.minX * 16.0D) / 256.0D;
            var14 = ((double)(var10 + 16) - par1Block.minY * 16.0D) / 256.0D;
            var18 = ((double)var11 + par1Block.maxX * 16.0D) / 256.0D;
            var20 = var14;
            var22 = var12;
            var12 = var14;
            var14 = var22;
            var24 = var18;
            var26 = var16;
        }
        else if (render.uvRotateWest == 3)
        {
            var12 = ((double)(var10 + 16) - par1Block.minX * 16.0D) / 256.0D;
            var14 = ((double)(var10 + 16) - par1Block.maxX * 16.0D - 0.01D) / 256.0D;
            var16 = ((double)var11 + par1Block.maxY * 16.0D) / 256.0D;
            var18 = ((double)var11 + par1Block.minY * 16.0D - 0.01D) / 256.0D;
            var20 = var14;
            var22 = var12;
            var24 = var16;
            var26 = var18;
        }

        double var28 = par2 + par1Block.minX;
        double var30 = par2 + par1Block.maxX;
        double var32 = par4 + par1Block.minY;
        double var34 = par4 + par1Block.maxY;
        double var36 = par6 + par1Block.maxZ;

        if (render.enableAO)
        {
            var9.setColorOpaque_F(render.colorRedTopLeft, render.colorGreenTopLeft, render.colorBlueTopLeft);
            var9.setBrightness(render.brightnessTopLeft);
            var9.addVertexWithUV(var28, var34, var36, var12, var16);
            var9.setColorOpaque_F(render.colorRedBottomLeft, render.colorGreenBottomLeft, render.colorBlueBottomLeft);
            var9.setBrightness(render.brightnessBottomLeft);
            var9.addVertexWithUV(var28, var32, var36, var22, var26);
            var9.setColorOpaque_F(render.colorRedBottomRight, render.colorGreenBottomRight, render.colorBlueBottomRight);
            var9.setBrightness(render.brightnessBottomRight);
            var9.addVertexWithUV(var30, var32, var36, var14, var18);
            var9.setColorOpaque_F(render.colorRedTopRight, render.colorGreenTopRight, render.colorBlueTopRight);
            var9.setBrightness(render.brightnessTopRight);
            var9.addVertexWithUV(var30, var34, var36, var20, var24);
        }
        else
        {
            var9.addVertexWithUV(var28, var34, var36, var12, var16);
            var9.addVertexWithUV(var28, var32, var36, var22, var26);
            var9.addVertexWithUV(var30, var32, var36, var14, var18);
            var9.addVertexWithUV(var30, var34, var36, var20, var24);
        }
    }

    /**
     * Renders the given texture to the north (x-negative) face of the block.  Args: block, x, y, z, texture
     */
    public void renderNorthFace(Block par1Block, RenderBlocks render, double par2, double par4, double par6, int par8)
    {
        Tessellator var9 = Tessellator.instance;

        int var10 = (par8 & 15) << 4;
        int var11 = par8 & 240;
        double var12 = ((double)var10 + par1Block.minZ * 16.0D) / 256.0D;
        double var14 = ((double)var10 + par1Block.maxZ * 16.0D - 0.01D) / 256.0D;
        double var16 = ((double)(var11 + 16) - par1Block.maxY * 16.0D) / 256.0D;
        double var18 = ((double)(var11 + 16) - par1Block.minY * 16.0D - 0.01D) / 256.0D;
        double var20;

        if (render.flipTexture)
        {
            var20 = var12;
            var12 = var14;
            var14 = var20;
        }

        if (par1Block.minZ < 0.0D || par1Block.maxZ > 1.0D)
        {
            var12 = (double)(((float)var10 + 0.0F) / 256.0F);
            var14 = (double)(((float)var10 + 15.99F) / 256.0F);
        }

        if (par1Block.minY < 0.0D || par1Block.maxY > 1.0D)
        {
            var16 = (double)(((float)var11 + 0.0F) / 256.0F);
            var18 = (double)(((float)var11 + 15.99F) / 256.0F);
        }

        var20 = var14;
        double var22 = var12;
        double var24 = var16;
        double var26 = var18;

        if (render.uvRotateNorth == 1)
        {
            var12 = ((double)var10 + par1Block.minY * 16.0D) / 256.0D;
            var16 = ((double)(var11 + 16) - par1Block.maxZ * 16.0D) / 256.0D;
            var14 = ((double)var10 + par1Block.maxY * 16.0D) / 256.0D;
            var18 = ((double)(var11 + 16) - par1Block.minZ * 16.0D) / 256.0D;
            var24 = var16;
            var26 = var18;
            var20 = var12;
            var22 = var14;
            var16 = var18;
            var18 = var24;
        }
        else if (render.uvRotateNorth == 2)
        {
            var12 = ((double)(var10 + 16) - par1Block.maxY * 16.0D) / 256.0D;
            var16 = ((double)var11 + par1Block.minZ * 16.0D) / 256.0D;
            var14 = ((double)(var10 + 16) - par1Block.minY * 16.0D) / 256.0D;
            var18 = ((double)var11 + par1Block.maxZ * 16.0D) / 256.0D;
            var20 = var14;
            var22 = var12;
            var12 = var14;
            var14 = var22;
            var24 = var18;
            var26 = var16;
        }
        else if (render.uvRotateNorth == 3)
        {
            var12 = ((double)(var10 + 16) - par1Block.minZ * 16.0D) / 256.0D;
            var14 = ((double)(var10 + 16) - par1Block.maxZ * 16.0D - 0.01D) / 256.0D;
            var16 = ((double)var11 + par1Block.maxY * 16.0D) / 256.0D;
            var18 = ((double)var11 + par1Block.minY * 16.0D - 0.01D) / 256.0D;
            var20 = var14;
            var22 = var12;
            var24 = var16;
            var26 = var18;
        }

        double var28 = par2 + par1Block.minX;
        double var30 = par4 + par1Block.minY;
        double var32 = par4 + par1Block.maxY;
        double var34 = par6 + par1Block.minZ;
        double var36 = par6 + par1Block.maxZ;

        if (render.enableAO)
        {
            var9.setColorOpaque_F(render.colorRedTopLeft, render.colorGreenTopLeft, render.colorBlueTopLeft);
            var9.setBrightness(render.brightnessTopLeft);
            var9.addVertexWithUV(var28, var32, var36, var20, var24);
            var9.setColorOpaque_F(render.colorRedBottomLeft, render.colorGreenBottomLeft, render.colorBlueBottomLeft);
            var9.setBrightness(render.brightnessBottomLeft);
            var9.addVertexWithUV(var28, var32, var34, var12, var16);
            var9.setColorOpaque_F(render.colorRedBottomRight, render.colorGreenBottomRight, render.colorBlueBottomRight);
            var9.setBrightness(render.brightnessBottomRight);
            var9.addVertexWithUV(var28, var30, var34, var22, var26);
            var9.setColorOpaque_F(render.colorRedTopRight, render.colorGreenTopRight, render.colorBlueTopRight);
            var9.setBrightness(render.brightnessTopRight);
            var9.addVertexWithUV(var28, var30, var36, var14, var18);
        }
        else
        {
            var9.addVertexWithUV(var28, var32, var36, var20, var24);
            var9.addVertexWithUV(var28, var32, var34, var12, var16);
            var9.addVertexWithUV(var28, var30, var34, var22, var26);
            var9.addVertexWithUV(var28, var30, var36, var14, var18);
        }
    }

    /**
     * Renders the given texture to the south (x-positive) face of the block.  Args: block, x, y, z, texture
     */
    public void renderSouthFace(Block par1Block, RenderBlocks render, 
    		double posX, double posY, double posZ, int texture)
    {
        Tessellator var9 = Tessellator.instance;

        int texX = (texture & 15) << 4;
        int texY = texture & 240;
        double texBL = ((double)texX + par1Block.minZ * 16.0D) / 256.0D;
        double texTL = ((double)texX + par1Block.maxZ * 16.0D - 0.01D) / 256.0D;
        double texBR = ((double)(texY + 16) - par1Block.maxY * 16.0D) / 256.0D;
        double texTR = ((double)(texY + 16) - par1Block.minY * 16.0D - 0.01D) / 256.0D;
        double temp;

        if (render.flipTexture)
        {
            temp = texBL;
            texBL = texTL;
            texTL = temp;
        }

        if (par1Block.minZ < 0.0D || par1Block.maxZ > 1.0D)
        {
            texBL = (double)(((float)texX + 0.0F) / 256.0F);
            texTL = (double)(((float)texX + 15.99F) / 256.0F);
        }

        if (par1Block.minY < 0.0D || par1Block.maxY > 1.0D)
        {
            texBR = (double)(((float)texY + 0.0F) / 256.0F);
            texTR = (double)(((float)texY + 15.99F) / 256.0F);
        }

        temp = texTL;
        double var22 = texBL;
        double var24 = texBR;
        double var26 = texTR;

        if (render.uvRotateSouth == 2)
        {
            texBL = ((double)texX + par1Block.minY * 16.0D) / 256.0D;
            texBR = ((double)(texY + 16) - par1Block.minZ * 16.0D) / 256.0D;
            texTL = ((double)texX + par1Block.maxY * 16.0D) / 256.0D;
            texTR = ((double)(texY + 16) - par1Block.maxZ * 16.0D) / 256.0D;
            var24 = texBR;
            var26 = texTR;
            temp = texBL;
            var22 = texTL;
            texBR = texTR;
            texTR = var24;
        }
        else if (render.uvRotateSouth == 1)
        {
            texBL = ((double)(texX + 16) - par1Block.maxY * 16.0D) / 256.0D;
            texBR = ((double)texY + par1Block.maxZ * 16.0D) / 256.0D;
            texTL = ((double)(texX + 16) - par1Block.minY * 16.0D) / 256.0D;
            texTR = ((double)texY + par1Block.minZ * 16.0D) / 256.0D;
            temp = texTL;
            var22 = texBL;
            texBL = texTL;
            texTL = var22;
            var24 = texTR;
            var26 = texBR;
        }
        else if (render.uvRotateSouth == 3)
        {
            texBL = ((double)(texX + 16) - par1Block.minZ * 16.0D) / 256.0D;
            texTL = ((double)(texX + 16) - par1Block.maxZ * 16.0D - 0.01D) / 256.0D;
            texBR = ((double)texY + par1Block.maxY * 16.0D) / 256.0D;
            texTR = ((double)texY + par1Block.minY * 16.0D - 0.01D) / 256.0D;
            temp = texTL;
            var22 = texBL;
            var24 = texBR;
            var26 = texTR;
        }

        double xTop = posX + par1Block.maxX;
        double yBot = posY + par1Block.minY;
        double yTop = posY + par1Block.maxY;
        double zBot = posZ + par1Block.minZ;
        double zTop = posZ + par1Block.maxZ;

        if (render.enableAO)
        {
            var9.setColorOpaque_F(render.colorRedTopLeft, render.colorGreenTopLeft, render.colorBlueTopLeft);
            var9.setBrightness(render.brightnessTopLeft);
            var9.addVertexWithUV(xTop, yBot, zTop, var22, var26);
            var9.setColorOpaque_F(render.colorRedBottomLeft, render.colorGreenBottomLeft, render.colorBlueBottomLeft);
            var9.setBrightness(render.brightnessBottomLeft);
            var9.addVertexWithUV(xTop, yBot, zBot, texTL, texTR);
            var9.setColorOpaque_F(render.colorRedBottomRight, render.colorGreenBottomRight, render.colorBlueBottomRight);
            var9.setBrightness(render.brightnessBottomRight);
            var9.addVertexWithUV(xTop, yTop, zBot, temp, var24);
            var9.setColorOpaque_F(render.colorRedTopRight, render.colorGreenTopRight, render.colorBlueTopRight);
            var9.setBrightness(render.brightnessTopRight);
            var9.addVertexWithUV(xTop, yTop, zTop, texBL, texBR);
        }
        else
        {
            var9.addVertexWithUV(xTop, yBot, zTop, var22, var26);
            var9.addVertexWithUV(xTop, yBot, zBot, texTL, texTR);
            var9.addVertexWithUV(xTop, yTop, zBot, temp, var24);
            var9.addVertexWithUV(xTop, yTop, zTop, texBL, texBR);
        }
    }
    
    public static void RenderDo(RenderBlocks renderblocks, Block block, int i)
	{
		Tessellator tessellator = Tessellator.instance;
		GL11.glTranslatef(-0.5F, -0.5F, -0.5F);
		tessellator.startDrawingQuads();
		tessellator.setNormal(0.0F, -1F, 0.0F);
		renderblocks.renderBottomFace(block, 0.0D, 0.0D, 0.0D, block.getBlockTextureFromSideAndMetadata(0, i));
		tessellator.draw();
		tessellator.startDrawingQuads();
		tessellator.setNormal(0.0F, 1.0F, 0.0F);
		renderblocks.renderTopFace(block, 0.0D, 0.0D, 0.0D, block.getBlockTextureFromSideAndMetadata(1, i));
		tessellator.draw();
		tessellator.startDrawingQuads();
		tessellator.setNormal(0.0F, 0.0F, -1F);
		renderblocks.renderEastFace(block, 0.0D, 0.0D, 0.0D, block.getBlockTextureFromSideAndMetadata(2, i));
		tessellator.draw();
		tessellator.startDrawingQuads();
		tessellator.setNormal(0.0F, 0.0F, 1.0F);
		renderblocks.renderWestFace(block, 0.0D, 0.0D, 0.0D, block.getBlockTextureFromSideAndMetadata(3, i));
		tessellator.draw();
		tessellator.startDrawingQuads();
		tessellator.setNormal(-1F, 0.0F, 0.0F);
		renderblocks.renderNorthFace(block, 0.0D, 0.0D, 0.0D, block.getBlockTextureFromSideAndMetadata(4, i));
		tessellator.draw();
		tessellator.startDrawingQuads();
		tessellator.setNormal(1.0F, 0.0F, 0.0F);
		renderblocks.renderSouthFace(block, 0.0D, 0.0D, 0.0D, block.getBlockTextureFromSideAndMetadata(5, i));
		tessellator.draw();
		GL11.glTranslatef(0.5F, 0.5F, 0.5F);
	}
}