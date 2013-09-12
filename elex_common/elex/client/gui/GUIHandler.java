package elex.client.gui;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.IGuiHandler;
import cpw.mods.fml.common.network.NetworkRegistry;
import elex.ElementalExperimentation;
import elex.inventory.ContainerCondensator;
import elex.inventory.ContainerGrinder;
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
