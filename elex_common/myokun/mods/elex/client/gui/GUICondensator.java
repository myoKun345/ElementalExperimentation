package myokun.mods.elex.client.gui;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.util.logging.Level;

import myokun.mods.elex.core.LogHelper;
import myokun.mods.elex.core.Reference;
import myokun.mods.elex.inventory.ContainerCondensator;
import myokun.mods.elex.tileentity.TileEntityCondensator;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.network.packet.Packet250CustomPayload;
import net.minecraft.util.Icon;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidStack;

import org.lwjgl.opengl.GL11;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.network.PacketDispatcher;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

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
		
        drawFluidGauge(guiLeft, guiTop, 108, 16, te.getScaledTankLiquid(58), te.getFluid());
    }
    
    @Override
    protected void drawGuiContainerForegroundLayer(int x, int y) {
        fontRenderer.drawString(LanguageRegistry.instance().getStringLocalization("container.condensator.name"), 8, 6, 0x404040);
    }
    
    @Override
    public void initGui() {
    	super.initGui();
    	buttonList.clear();
    	
    	GuiButton waterButton = new GuiButton(0, guiLeft + 25, guiTop + 15, 22, 12, "H2O");
    	waterButton.enabled = te.modeWater;
    	GuiButton airButton = new GuiButton(1, guiLeft + 47, guiTop + 15, 22, 12, "Air");
    	airButton.enabled = te.modeAir;
    	GuiButton hydrogenButton = new GuiButton(2, guiLeft + 25, guiTop + 27, 22, 12, "H");
    	hydrogenButton.enabled = te.modeHydrogen;
    	GuiButton heliumButton = new GuiButton(3, guiLeft + 47, guiTop + 27, 22, 12, "He");
    	heliumButton.enabled = te.modeHelium;
    	GuiButton nitrogenButton = new GuiButton(4, guiLeft + 25, guiTop + 39, 22, 12, "N");
    	nitrogenButton.enabled = te.modeNitrogen;
    	GuiButton oxygenButton = new GuiButton(5, guiLeft + 47, guiTop + 39, 22, 12, "O");
    	oxygenButton.enabled = te.modeOxygen;
    	GuiButton neonButton = new GuiButton(6, guiLeft + 25, guiTop + 51, 22, 12, "Ne");
    	neonButton.enabled = te.modeNeon;
    	GuiButton argonButton = new GuiButton(7, guiLeft + 47, guiTop + 51, 22, 12, "Ar");
    	argonButton.enabled = te.modeArgon;
    	GuiButton kryptonButton = new GuiButton(8, guiLeft + 25, guiTop + 63, 22, 12, "Kr");
    	kryptonButton.enabled = te.modeKrypton;
    	GuiButton xenonButton = new GuiButton(9, guiLeft + 47, guiTop + 63, 22, 12, "Xe");
    	xenonButton.enabled = te.modeXenon;
    	GuiButton enableButton = new GuiButton(12, guiLeft + 128, guiTop + 56, 40, 20, "Start");
    	enableButton.enabled = !te.buttonDisabled;
    	
    	buttonList.add(waterButton);
    	buttonList.add(airButton);
    	buttonList.add(hydrogenButton);
    	buttonList.add(heliumButton);
    	buttonList.add(nitrogenButton);
    	buttonList.add(oxygenButton);
    	buttonList.add(neonButton);
    	buttonList.add(argonButton);
    	buttonList.add(kryptonButton);
    	buttonList.add(xenonButton);
    	buttonList.add(enableButton);
    }
    
    @Override
    protected void actionPerformed(GuiButton button) {
    	if (button.id == 12) {
    		LogHelper.log(Level.INFO, "" + 12);
    		if (te != null) {
    			LogHelper.log(Level.INFO, "!null");
				LogHelper.log(Level.INFO, "" + te.canBeEnabled);
				te.isEnabled = true;
				this.sendButtonPacket(12, (byte)0);
    			if (te.canBeEnabled) {
    			}
    		}
    	}
    	LogHelper.log(Level.INFO, "" + te.isEnabled);
    }
    
    protected void sendButtonPacket(int buttonId, byte packetId) {

		ByteArrayOutputStream bos = new ByteArrayOutputStream(8);
		DataOutputStream outputStream = new DataOutputStream(bos);
		
    	switch (buttonId) {
    	case 12:
    		try {
    			outputStream.writeByte(packetId);
    			outputStream.writeInt(buttonId);
    			outputStream.writeInt(te.xCoord);
    			outputStream.writeInt(te.yCoord);
    			outputStream.writeInt(te.zCoord);
    			outputStream.writeBoolean(te.canBeEnabled);
    			outputStream.writeBoolean(te.buttonDisabled);
    			outputStream.writeBoolean(te.isEnabled);
    		} catch (Exception ex) {
    	        ex.printStackTrace();
    		}
    		break;
    	}
    	
		Packet250CustomPayload packet = new Packet250CustomPayload();
		packet.channel = Reference.CHANNEL_MAIN;
		packet.data = bos.toByteArray();
		packet.length = bos.size();
		
		Side side = FMLCommonHandler.instance().getEffectiveSide();
		if (side == Side.CLIENT) {
			PacketDispatcher.sendPacketToServer(packet);
		}
		else if (side == Side.SERVER) {
			PacketDispatcher.sendPacketToAllPlayers(packet);
		}
		else {
			LogHelper.log(Level.WARNING, "What side is this?!? I don't understand the side " + side.toString() + "!");
		}
    }
    
    private void drawFluidGauge(int i, int j, int k, int l, int scaled, FluidStack stack) {
		GL11.glColor4f(1, 1, 1, 0.5F);
    	
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
    	
    	GL11.glColor4f(1, 1, 1, 1);
    	
    	Minecraft.getMinecraft().renderEngine.bindTexture(texture);
    	drawTexturedModalRect(i + k, j + l, 0, 166, 16, 58);
    	
    }
}
