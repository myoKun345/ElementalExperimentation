package elex.item;

import net.minecraftforge.fluids.ItemFluidContainer;
import elex.lib.Reference;

/**
 * Elemental Experimentation
 * 
 * ItemElExCan
 * 
 * @author Myo-kun
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */
public class ItemElExCan extends ItemFluidContainer {
    
    public ItemElExCan(int par1) {
        super(par1 - Reference.SHIFTED_ID_RANGE_CORRECTION);
    }
    
}
