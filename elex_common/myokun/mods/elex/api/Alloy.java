package myokun.mods.elex.api;

import java.util.HashMap;

import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.EnumToolMaterial;

/**
 * Elemental Experimentation
 * 
 * Alloy
 * 
 * @author Myo-kun
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */
public class Alloy {
    
    public String alloyName;
    
    public Element component1;
    public Element component2;
    
    public HashMap<String, EnumArmorMaterial> armorMaterialStorage;
    public HashMap<String, EnumToolMaterial> toolMaterialStorage;
    
    public Alloy(String name, Element element1, Element element2, HashMap<String, EnumArmorMaterial> armorMaterialStorage, HashMap<String, EnumToolMaterial> toolMaterialStorage) {
        this.alloyName = name;
        this.component1 = element1;
        this.component2 = element2;
        this.armorMaterialStorage = armorMaterialStorage;
        this.toolMaterialStorage = toolMaterialStorage;
    }
    
}
