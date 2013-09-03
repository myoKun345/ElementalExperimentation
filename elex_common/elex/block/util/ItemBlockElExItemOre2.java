package elex.block.util;

import elex.lib.ElexIDs;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

/**
 * Elemental Experimentation
 * 
 * ItemBlockElExItemOre2
 * 
 * @author Myo-kun
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */
public class ItemBlockElExItemOre2 extends ItemBlock {
    
    public ItemBlockElExItemOre2(int par1) {
        super(par1);
        setHasSubtypes(true);
    }
    
    @Override
    public String getUnlocalizedName(ItemStack stack) {
        if (stack.getItemDamage() > 15) {
            return "tile." + ElexIDs.ITEM_ELEX_ORE_2_REAL_UNLOCALIZED_NAMES[stack.getItemDamage() - 16];
        }
        else {
            return "tile." + ElexIDs.ITEM_ELEX_ORE_2_REAL_UNLOCALIZED_NAMES[stack.getItemDamage()];
        }
    }
    
    @Override
    public int getMetadata(int meta) {
        return meta;
    }

}