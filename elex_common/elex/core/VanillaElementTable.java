package elex.core;

import elex.api.ElementTable;
import elex.lib.FluidIds;
import elex.lib.ItemIds;

/**
 * Elemental Experimentation
 * 
 * VanillaElementTable
 * 
 * @author Myo-kun
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */
public class VanillaElementTable extends ElementTable {
    
    public VanillaElementTable(String name, String modid) {
        super(name, modid, 118, 
                ItemIds.ELEX_METAL_DUST_REAL_UNLOCALIZED_NAMES, ItemIds.METAL_DUST_MOLECULE_STRINGS, ItemIds.ELEX_INGOT_REAL_UNLOCALIZED_NAMES, 
                ItemIds.METAL_NUGGET_REAL_UNLOCALIZED_NAMES, new VanillaStorageBlockHandler(), ItemIds.METAL_ORE_ELEMENT_IDS, 
                new int[]{0, 12, 10, 4, 8, 8, 2, 2}, ItemIds.ELEX_PURE_NONMETAL_DUST_REAL_UNLOCALIZED_NAMES, ItemIds.PURE_NONMETAL_DUST_MOLECULE_STRINGS, 
                FluidIds.ELEMENTAL_GAS_UNLOCALIZED_NAMES);
    }

}
