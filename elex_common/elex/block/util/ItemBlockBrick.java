package elex.block.util;

import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import elex.core.ElexIDs;

/**
 * Elemental Experimentation
 * 
 * ItemBlockBrick
 * 
 * @author Myo-kun
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */
public class ItemBlockBrick extends ItemBlock{
    
    public ItemBlockBrick(int par1) {
        super(par1);
        setHasSubtypes(true);
    }
    
    @Override
    public String getUnlocalizedName(ItemStack stack) {
        return "tile." + ElexIDs.BLOCK_BRICK_UNLOCALIZED_NAMES[stack.getItemDamage()];
    }
    
    @Override
    public int getMetadata(int meta) {
        return meta;
    }
    
}
