package myokun.mods.elex.core;

import myokun.mods.elex.api.Element;
import myokun.mods.elex.api.IStorageBlockHandler;

/**
 * Elemental Experimentation
 * 
 * VanillaStorageBlockHandler
 * 
 * @author Myo-kun
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */
public class VanillaStorageBlockHandler implements IStorageBlockHandler {
    
    @Override
    public void addStorageBlocks(Element element) {
        
        if (ElexIDs.BLOCK_ELEX_METAL_STORAGE_REAL_UNLOCALIZED_NAMES.size() < 16) {
            ElexIDs.BLOCK_ELEX_METAL_STORAGE_REAL_UNLOCALIZED_NAMES.add("block" + element.name);
        }else
        if (ElexIDs.BLOCK_ELEX_METAL_STORAGE_2_REAL_UNLOCALIZED_NAMES.size() < 16) {
            ElexIDs.BLOCK_ELEX_METAL_STORAGE_2_REAL_UNLOCALIZED_NAMES.add("block" + element.name);
        }else
        if (ElexIDs.BLOCK_ELEX_METAL_STORAGE_3_REAL_UNLOCALIZED_NAMES.size() < 16) {
            ElexIDs.BLOCK_ELEX_METAL_STORAGE_3_REAL_UNLOCALIZED_NAMES.add("block" + element.name);
        }else
        if (ElexIDs.BLOCK_ELEX_METAL_STORAGE_4_REAL_UNLOCALIZED_NAMES.size() < 16) {
            ElexIDs.BLOCK_ELEX_METAL_STORAGE_4_REAL_UNLOCALIZED_NAMES.add("block" + element.name);
        }else
        if (ElexIDs.BLOCK_ELEX_METAL_STORAGE_5_REAL_UNLOCALIZED_NAMES.size() < 16) {
            ElexIDs.BLOCK_ELEX_METAL_STORAGE_5_REAL_UNLOCALIZED_NAMES.add("block" + element.name);
        }else
        if (ElexIDs.BLOCK_ELEX_METAL_STORAGE_6_REAL_UNLOCALIZED_NAMES.size() < 16) {
            ElexIDs.BLOCK_ELEX_METAL_STORAGE_6_REAL_UNLOCALIZED_NAMES.add("block" + element.name);
        }
        
    }

}
