package elex.block;

import elex.lib.ElexIDs;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

/**
 * Elemental Experimentation
 * 
 * ItemBlockMachineCase
 * 
 * @author Myo-kun
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */
public class ItemBlockMachineCase extends ItemBlock {
    
    public ItemBlockMachineCase(int par1) {
        super(par1);
        setHasSubtypes(true);
    }
    
    @Override
    public String getUnlocalizedName(ItemStack stack) {
        return "tile." + ElexIDs.BLOCK_MACHINE_CASE_REAL_UNLOCALIZED_NAMES[stack.getItemDamage()];
    }
    
    @Override
    public int getMetadata(int meta) {
        return meta;
    }

}