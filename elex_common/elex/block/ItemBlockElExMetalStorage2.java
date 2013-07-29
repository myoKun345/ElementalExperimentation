package elex.block;

import elex.lib.BlockIds;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

/**
 * Elemental Experimentation
 * 
 * ItemBlockElExMetalStorage2
 * 
 * @author Myo-kun
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */
public class ItemBlockElExMetalStorage2 extends ItemBlock {
    
    public ItemBlockElExMetalStorage2(int par1) {
        super(par1);
        setHasSubtypes(true);
    }
    
    @Override
    public String getUnlocalizedName(ItemStack stack) {
        return "tile." + BlockIds.BLOCK_ELEX_METAL_STORAGE_2_UNLOCALIZED_NAME + "." + stack.getItemDamage();
    }
    
    @Override
    public int getMetadata(int meta) {
        return meta;
    }

}