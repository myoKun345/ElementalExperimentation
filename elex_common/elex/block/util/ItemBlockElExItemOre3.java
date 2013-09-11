package elex.block.util;

import elex.core.ElexIDs;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

/**
 * Elemental Experimentation
 * 
 * ItemBlockElExItemOre3
 * 
 * @author Myo-kun
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */
public class ItemBlockElExItemOre3 extends ItemBlock {
    
    public ItemBlockElExItemOre3(int par1) {
        super(par1);
        setHasSubtypes(true);
    }
    
    @Override
    public String getUnlocalizedName(ItemStack stack) {
        if (stack.getItemDamage() > 31) {
            return "tile." + ElexIDs.ITEM_ELEX_ORE_3_REAL_UNLOCALIZED_NAMES[stack.getItemDamage() - 32];
        }
        else {
            return "tile." + ElexIDs.ITEM_ELEX_ORE_3_REAL_UNLOCALIZED_NAMES[stack.getItemDamage()];
        }
    }
    
    @Override
    public int getMetadata(int meta) {
        return meta;
    }

}