package elex.client.gui;

import java.util.logging.Level;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.Icon;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidStack;

import org.lwjgl.opengl.GL11;

import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import elex.core.LogHelper;
import elex.core.Reference;
import elex.inventory.ContainerCondensator;
import elex.tileentity.TileEntityCondensator;

/**
 * Elemental Experimentation
 * 
 * GUICondensator
 * 
 * @author Myo-kun
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */

@SideOnly(Side.CLIENT)
public class GUICondensator extends GuiContainer {
	
	private static final ResourceLocation BLOCK_TEXTURE = TextureMap.locationBlocksTexture;
	
	private TileEntityCondensator te;
    
    public GUICondensator(InventoryPlayer player, TileEntityCondensator condensator) {
        super(new ContainerCondensator(player, condensator));
        this.te = condensator;
        xSize = 176;
        ySize = 166;
    }
    
    private static final ResourceLocation texture = new ResourceLocation(Reference.MOD_ID.toLowerCase(), "textures/gui/condensator.png");
    
    @Override
    protected void drawGuiContainerBackgroundLayer(float f, int i, int j) {
        GL11.glColor4f(1, 1, 1, 1);
        
        try {
            Minecraft.getMinecraft().renderEngine.bindTexture(texture);
        } catch (Exception e) {
            LogHelper.log(Level.INFO, e.toString());
        }
        drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);
        
        if (!te.getFluid().getFluid().isGaseous()) {
        	if (te.getScaledTankLiquid(58) > 0) {
        		drawFluidGauge(guiLeft, guiTop, 108, 16, te.getScaledTankLiquid(58), te.getFluid());
        	}
        }
        else {
        	if (te.getScaledTankGas() > 0) {
        		
        	}
        }
    }
    
    @Override
    protected void drawGuiContainerForegroundLayer(int x, int y) {
        fontRenderer.drawString(LanguageRegistry.instance().getStringLocalization("container.condensator.name"), 8, 6, 0x404040);
    }
    
    private void drawFluidGauge(int i, int j, int k, int l, int scaled, FluidStack stack) {
    	
    	if (stack == null) {
    		return;
    	}
    	int start = 0;
    	
    	Icon fluidIcon = null;
    	Fluid fluid = stack.getFluid();
    	if (fluid != null && fluid.getStillIcon() != null) {
    		fluidIcon = fluid.getStillIcon();
    	}
    	Minecraft.getMinecraft().renderEngine.bindTexture(BLOCK_TEXTURE);
    	
    	if (fluidIcon != null) {
    		while (true) {
    			int x;
    			
    			if (scaled > 16) {
    				x = 16;
    				scaled -= 16;
    			}
    			else {
    				x = scaled;
    				scaled = 0;
    			}
    			
    			drawTexturedModelRectFromIcon(i + k, j + l + 58 - x - start, fluidIcon, 16, 16 - (16 - x));
    			start = start + 16;
    			
    			if (x == 0 || scaled == 0) {
    				break;
    			}
    		}
    	}
    	
    }
}
