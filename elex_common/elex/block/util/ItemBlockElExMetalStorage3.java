package elex.block.util;

import elex.lib.ElexIDs;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

/**
 * Elemental Experimentation
 * 
 * ItemBlockElExMetalStorage3
 * 
 * @author Myo-kun
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */
public class ItemBlockElExMetalStorage3 extends ItemBlock {
    
    public ItemBlockElExMetalStorage3(int par1) {
        super(par1);
        setHasSubtypes(true);
    }
    
    @Override
    public String getUnlocalizedName(ItemStack stack) {
        return "tile." + ElexIDs.BLOCK_ELEX_METAL_STORAGE_3_REAL_UNLOCALIZED_NAMES.get(stack.getItemDamage());
    }
    
    @Override
    public int getMetadata(int meta) {
        return meta;
    }

}