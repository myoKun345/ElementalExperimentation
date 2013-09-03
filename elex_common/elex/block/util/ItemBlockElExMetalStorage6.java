package elex.block.util;

import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import elex.lib.ElexIDs;

/**
 * Elemental Experimentation
 * 
 * ItemBlockElExMetalStorage6
 * 
 * @author Myo-kun
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */
public class ItemBlockElExMetalStorage6 extends ItemBlock {
    
    public ItemBlockElExMetalStorage6(int par1) {
        super(par1);
        setHasSubtypes(true);
    }
    
    @Override
    public String getUnlocalizedName(ItemStack stack) {
        return "tile." + ElexIDs.BLOCK_ELEX_METAL_STORAGE_6_REAL_UNLOCALIZED_NAMES.get(stack.getItemDamage());
    }
    
    @Override
    public int getMetadata(int meta) {
        return meta;
    }

}