package myokun.mods.elex.core;

import myokun.mods.elex.tileentity.TileEntityCentrifuge;
import myokun.mods.elex.tileentity.TileEntityCondensator;
import myokun.mods.elex.tileentity.TileEntityGrinder;
import cpw.mods.fml.common.registry.GameRegistry;

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
