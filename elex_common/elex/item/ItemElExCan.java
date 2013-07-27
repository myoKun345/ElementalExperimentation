package elex.item;

import elex.lib.Reference;
import net.minecraft.item.Item;

/**
 * Elemental Experimentation
 * 
 * ItemElExCan
 * 
 * @author Myo-kun
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */
public class ItemElExCan extends Item {
    
    public ItemElExCan(int par1) {
        super(par1 - Reference.SHIFTED_ID_RANGE_CORRECTION);
    }
    
}
