package elex.tileentity;

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
    }
}
