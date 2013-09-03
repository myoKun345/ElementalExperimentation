package elex.block.util;

import elex.lib.ElexIDs;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

/**
 * Elemental Experimentation
 * 
 * ItemBlockElExOre
 * 
 * @author Myo-kun
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */
public class ItemBlockElExOre extends ItemBlock {
    
    public ItemBlockElExOre(int par1) {
        super(par1);
        setHasSubtypes(true);
    }
    
    @Override
    public String getUnlocalizedName(ItemStack stack) {
        return "tile." + ElexIDs.BLOCK_ELEX_ORE_REAL_UNLOCALIZED_NAMES[stack.getItemDamage()];
    }
    
    @Override
    public int getMetadata(int meta) {
        return meta;
    }

}
