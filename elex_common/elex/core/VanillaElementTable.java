package elex.core;

import elex.api.ElementTable;
import elex.lib.ElexIDs;
import elex.lib.ElexIDs;

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
            ElexIDs.METAL_DUST_REAL_UNLOCALIZED_NAMES, ElexIDs.METAL_DUST_MOLECULE_STRINGS, ElexIDs.ELEX_INGOT_REAL_UNLOCALIZED_NAMES, 
            ElexIDs.METAL_NUGGET_REAL_UNLOCALIZED_NAMES, new VanillaStorageBlockHandler(), ElexIDs.METAL_ORE_ELEMENT_IDS, 
            new int[]{0, 12, 10, 4, 8, 8, 2, 2}, ElexIDs.ELEX_PURE_NONMETAL_DUST_REAL_UNLOCALIZED_NAMES, ElexIDs.PURE_NONMETAL_DUST_MOLECULE_STRINGS, 
            ElexIDs.ELEMENTAL_GAS_UNLOCALIZED_NAMES);
    }

}
