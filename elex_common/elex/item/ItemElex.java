package elex.item;

import elex.ElementalExperimentation;
import elex.lib.Reference;
import net.minecraft.item.Item;

/**
 * Elemental Experimentation
 * 
 * ItemElex
 * 
 * @author Myo-kun
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */
public class ItemElex extends Item {
    
    public ItemElex(int par1) {
        super(par1 - Reference.SHIFTED_ID_RANGE_CORRECTION);
        setCreativeTab(ElementalExperimentation.elexTab);
    }
    
}
