package elex.item;

import net.minecraftforge.fluids.ItemFluidContainer;
import elex.ElementalExperimentation;
import elex.core.Reference;

/**
 * Elemental Experimentation
 * 
 * ItemElExFluidCan
 * 
 * @author Myo-kun
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */
public class ItemElExFluidCan extends ItemFluidContainer {

    private int canType;
    
    public ItemElExFluidCan(int id, int type) {
        super(id - Reference.SHIFTED_ID_RANGE_CORRECTION);
        setCreativeTab(ElementalExperimentation.elexTab);
        this.canType = type;
    }
    
}
