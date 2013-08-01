package elex.block;

import elex.lib.BlockIds;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

/**
 * Elemental Experimentation
 * 
 * ItemBlockElExMetalStorage
 * 
 * @author Myo-kun
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */
public class ItemBlockElExMetalStorage extends ItemBlock {
    
    public ItemBlockElExMetalStorage(int par1) {
        super(par1);
        setHasSubtypes(true);
    }
    
    @Override
    public String getUnlocalizedName(ItemStack stack) {
        return "tile." + BlockIds.BLOCK_ELEX_METAL_STORAGE_REAL_UNLOCALIZED_NAMES.get(stack.getItemDamage());
    }
    
    @Override
    public int getMetadata(int meta) {
        return meta;
    }

}