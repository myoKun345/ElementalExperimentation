package myokun.mods.elex.client.gui;

import myokun.mods.elex.ElementalExperimentation;
import myokun.mods.elex.inventory.ContainerCentrifuge;
import myokun.mods.elex.inventory.ContainerCondensator;
import myokun.mods.elex.inventory.ContainerGrinder;
import myokun.mods.elex.tileentity.TileEntityCentrifuge;
import myokun.mods.elex.tileentity.TileEntityCondensator;
import myokun.mods.elex.tileentity.TileEntityGrinder;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.IGuiHandler;
import cpw.mods.fml.common.network.NetworkRegistry;

/**
 * Elemental Experimentation
 * 
 * GUIHandler
 * 
 * @author Myo-kun
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */
public class GUIHandler implements IGuiHandler {
	
	World server;
	World client;
    
    public GUIHandler() {
        NetworkRegistry.instance().registerGuiHandler(ElementalExperimentation.instance, this);
    }
    
    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        TileEntity entity = world.getBlockTileEntity(x, y, z);
        
        switch (ID) {
            case 0:
                if (entity != null && entity instanceof TileEntityGrinder) {
                    return new ContainerGrinder(player.inventory, (TileEntityGrinder)entity);
                }
                break;
            case 1:
            	if (entity != null && entity instanceof TileEntityCentrifuge) {
            		return new ContainerCentrifuge(player.inventory, (TileEntityCentrifuge)entity);
            	}
                break;
            case 2:
                if (entity != null && entity instanceof TileEntityCondensator) {
                	TileEntityCondensator serverEnt = (TileEntityCondensator)entity;
                	this.server = world;
                	if (this.client != null) {
                		TileEntityCondensator clientEnt = (TileEntityCondensator)client.getBlockTileEntity(x, y, z);
                		if (serverEnt.modeAir != clientEnt.modeAir) {
                			if (clientEnt.modeAir) {
                				serverEnt.modeAir = clientEnt.modeAir;
                			}
                			else {
                				clientEnt.modeAir = serverEnt.modeAir;
                			}
                		}
                		if (serverEnt.buttonDisabled != clientEnt.buttonDisabled) {
                			if (!clientEnt.buttonDisabled) {
                				serverEnt.buttonDisabled = clientEnt.buttonDisabled;
                			}
                			else {
                				clientEnt.buttonDisabled = serverEnt.buttonDisabled;
                			}
                		}
                		if (serverEnt.canBeEnabled != clientEnt.canBeEnabled) {
                			if (!clientEnt.canBeEnabled) {
                				serverEnt.canBeEnabled = clientEnt.canBeEnabled;
                			}
                			else {
                				clientEnt.canBeEnabled = serverEnt.canBeEnabled;
                			}
                		}
                		if (serverEnt.isEnabled != clientEnt.isEnabled) {
                			if (!clientEnt.isEnabled) {
                				serverEnt.isEnabled = clientEnt.isEnabled;
                			}
                			else {
                				clientEnt.isEnabled = serverEnt.isEnabled;
                			}
                		}
                	}
                    return new ContainerCondensator(player.inventory, (TileEntityCondensator)entity);
                }
                break;
        }
        
        return null;
    }
    
    
    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
    	TileEntity entity = world.getBlockTileEntity(x, y, z);
    	
        switch (ID) {
            case 0:
                if (entity != null && entity instanceof TileEntityGrinder) {
                    return new GUIGrinder(player.inventory, (TileEntityGrinder)entity);
                }
                break;
            case 1:
                if (entity != null && entity instanceof TileEntityCentrifuge) {
                	GUICentrifuge gui = new GUICentrifuge(player.inventory, (TileEntityCentrifuge)entity);
                	gui.drawGuiContainerBackgroundLayer(8, 8, 8);
                    return gui;
                }
                break;
            case 2:
                if (entity != null && entity instanceof TileEntityCondensator) {
                	TileEntityCondensator clientEnt = (TileEntityCondensator)entity;
                	this.client = world;
                	if (this.server != null) {
                		TileEntityCondensator serverEnt = (TileEntityCondensator)server.getBlockTileEntity(x, y, z);
                		if (serverEnt.modeAir != clientEnt.modeAir) {
                			if (clientEnt.modeAir) {
                				serverEnt.modeAir = clientEnt.modeAir;
                			}
                			else {
                				clientEnt.modeAir = serverEnt.modeAir;
                			}
                		}
                		if (serverEnt.buttonDisabled != clientEnt.buttonDisabled) {
                			if (!clientEnt.buttonDisabled) {
                				serverEnt.buttonDisabled = clientEnt.buttonDisabled;
                			}
                			else {
                				clientEnt.buttonDisabled = serverEnt.buttonDisabled;
                			}
                		}
                		if (serverEnt.canBeEnabled != clientEnt.canBeEnabled) {
                			if (!clientEnt.canBeEnabled) {
                				serverEnt.canBeEnabled = clientEnt.canBeEnabled;
                			}
                			else {
                				clientEnt.canBeEnabled = serverEnt.canBeEnabled;
                			}
                		}
                		if (serverEnt.isEnabled != clientEnt.isEnabled) {
                			if (!clientEnt.isEnabled) {
                				serverEnt.isEnabled = clientEnt.isEnabled;
                			}
                			else {
                				clientEnt.isEnabled = serverEnt.isEnabled;
                			}
                		}
                	}
                    return new GUICondensator(player.inventory, (TileEntityCondensator)entity);
                }
                break;
        }
        
        return null;
    }

}
