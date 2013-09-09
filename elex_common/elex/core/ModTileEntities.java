package elex.core;

import cpw.mods.fml.common.registry.GameRegistry;
import elex.tileentity.TileEntityCentrifuge;
import elex.tileentity.TileEntityCondensator;
import elex.tileentity.TileEntityGrinder;

/**
 * Elemental Experimentation
 * 
 * ModTileEntities
 * 
 * @author Myo-kun
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */
public class ModTileEntities {
    
    public static void init() {
        GameRegistry.registerTileEntity(TileEntityGrinder.class, "grinderElEx");
        GameRegistry.registerTileEntity(TileEntityCentrifuge.class, "centrifugeElEx");
        GameRegistry.registerTileEntity(TileEntityCondensator.class, "condensatorElEx");
    }
}
