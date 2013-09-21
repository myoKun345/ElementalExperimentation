package elex.client.gui;

import myokun.lib.gui.DynamicGUIHandler;
import myokun.lib.gui.VanillaSlices;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.IGuiHandler;
import cpw.mods.fml.common.network.NetworkRegistry;
import elex.ElementalExperimentation;
import elex.inventory.ContainerCentrifuge;
import elex.inventory.ContainerCondensator;
import elex.inventory.ContainerGrinder;
import elex.tileentity.TileEntityCentrifuge;
import elex.tileentity.TileEntityCondensator;
import elex.tileentity.TileEntityGrinder;

/**
 * Elemental Experimentation
 * 
 * GUIHandler
 * 
 * @author Myo-kun
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */
public class GUIHandler implements IGuiHandler {
    
    public GUIHandler() {
        NetworkRegistry.instance().registerGuiHandler(ElementalExperimentation.instance, this);
    }
    
    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        switch (ID) {
            case 0:
                TileEntity entity0 = world.getBlockTileEntity(x, y, z);
                if (entity0 != null && entity0 instanceof TileEntityGrinder) {
                    return new ContainerGrinder(player.inventory, (TileEntityGrinder)entity0);
                }
                break;
            case 1:
            	TileEntity entity1 = world.getBlockTileEntity(x, y, z);
            	if (entity1 != null && entity1 instanceof TileEntityCentrifuge) {
            		return new ContainerCentrifuge(player.inventory, (TileEntityCentrifuge)entity1);
            	}
                break;
            case 2:
                TileEntity entity2 = world.getBlockTileEntity(x, y, z);
                if (entity2 != null && entity2 instanceof TileEntityCondensator) {
                    return new ContainerCondensator(player.inventory, (TileEntityCondensator)entity2);
                }
                break;
        }
        
        return null;
    }
    
    
    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        switch (ID) {
            case 0:
                TileEntity entity0 = world.getBlockTileEntity(x, y, z);
                if (entity0 != null && entity0 instanceof TileEntityGrinder) {
                    return new GUIGrinder(player.inventory, (TileEntityGrinder)entity0);
                }
                break;
            case 1:
            	TileEntity entity1 = world.getBlockTileEntity(x, y, z);
                if (entity1 != null && entity1 instanceof TileEntityCentrifuge) {
                	GUICentrifuge gui = new GUICentrifuge(player.inventory, (TileEntityCentrifuge)entity1);
                	gui.drawGuiContainerBackgroundLayer(8, 8, 8);
                    return gui;
                }
                break;
            case 2:
                TileEntity entity2 = world.getBlockTileEntity(x, y, z);
                if (entity2 != null && entity2 instanceof TileEntityCondensator) {
                    return new GUICondensator(player.inventory, (TileEntityCondensator)entity2);
                }
                break;
        }
        
        return null;
    }

}
