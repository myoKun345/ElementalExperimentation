package myokun.mods.elex.core;

import myokun.mods.elex.api.Alloy;
import myokun.mods.elex.api.ElexAPI;

/**
 * Elemental Experimentation
 * 
 * ModAlloys
 * 
 * @author Myo-kun
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */
public class ModAlloys {
    
    public static Alloy carbonSteel = new Alloy("CarbonSteel", ModElements.carbon, ModElements.iron, ElexIDs.ALLOY_ARMOR_MATERIAL_HASH_MAP, ElexIDs.ALLOY_TOOL_MATERIAL_HASH_MAP);
    public static Alloy vanadiumSteel = new Alloy("VanadiumSteel", ModElements.vanadium, ModElements.iron, ElexIDs.ALLOY_ARMOR_MATERIAL_HASH_MAP, ElexIDs.ALLOY_TOOL_MATERIAL_HASH_MAP);
    public static Alloy bronze = new Alloy("Bronze", ModElements.copper, ModElements.tin, ElexIDs.ALLOY_ARMOR_MATERIAL_HASH_MAP, ElexIDs.ALLOY_TOOL_MATERIAL_HASH_MAP);
    public static Alloy electrum = new Alloy("Electrum", ModElements.gold, ModElements.silver, ElexIDs.ALLOY_ARMOR_MATERIAL_HASH_MAP, ElexIDs.ALLOY_TOOL_MATERIAL_HASH_MAP);
    public static Alloy scandinium = new Alloy("Scandinium", ModElements.scandium, ModElements.aluminium, ElexIDs.ALLOY_ARMOR_MATERIAL_HASH_MAP, ElexIDs.ALLOY_TOOL_MATERIAL_HASH_MAP);
    public static Alloy osmiridium = new Alloy("Osmiridium", ModElements.osmium, ModElements.iridium, ElexIDs.ALLOY_ARMOR_MATERIAL_HASH_MAP, ElexIDs.ALLOY_TOOL_MATERIAL_HASH_MAP);
    
    public static void addAlloys() {
        ElexAPI.addAlloy(carbonSteel, 2, 750, new int[]{3, 6, 5, 3}, 6.5F, 2.2F, 14);
        ElexAPI.addAlloy(vanadiumSteel, 2, 800, new int[]{3, 7, 6, 3}, 7.0F, 2.5F, 13);
        ElexAPI.addAlloy(bronze, 1, 300, new int[]{2, 5, 4, 1}, 10.0F, 0.0F, 20);
        ElexAPI.addAlloy(electrum, 2, 300, new int[]{2, 6, 5, 2}, 5.0F, 1.0F, 15);
        ElexAPI.addAlloy(scandinium, 3, 600, new int[]{3, 7, 6, 2}, 8.0F, 3.0F, 7);
        ElexAPI.addAlloy(osmiridium, 3, 800, new int[]{4, 7, 6, 3}, 8.5F, 3.5F, 6);
    }
    
}
