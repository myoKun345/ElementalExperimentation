package elex.block.util

import elex.ElementalExperimentation._
import elex.core.ElexIDs._
import elex.core.Reference._
import net.minecraft.item.ItemBlock
import net.minecraft.item.ItemStack

/**
 * Elemental Experimentation
 *
 * ItemBlockElex
 *
 * @author Myo-kun
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */
class ElexItemBlock(var arg:Int) extends ItemBlock(arg) {
    
    setHasSubtypes(true)
    
}

class ElexItemBlockCompoundOreStorage(var id:Int) extends ElexItemBlock(id) {
    
    override def getUnlocalizedName(stack:ItemStack):String = {
        return "tile." + BLOCK_ELEX_ITEM_ORE_STORAGE_REAL_UNLOCALIZED_NAMES(stack.getItemDamage())
    }
    
    override def getMetadata(meta:Int):Int = {
        return meta
    }
    
}

class ElexItemBlockCompoundOreStorage2(var id:Int) extends ElexItemBlock(id) {
    
    override def getUnlocalizedName(stack:ItemStack):String = {
        return "tile." + BLOCK_ELEX_ITEM_ORE_STORAGE_2_REAL_UNLOCALIZED_NAMES(stack.getItemDamage())
    }
    
    override def getMetadata(meta:Int):Int = {
        return meta
    }
    
}

class ElexItemBlockCompoundOreStorage3(var id:Int) extends ElexItemBlock(id) {
    
    override def getUnlocalizedName(stack:ItemStack):String = {
        return "tile." + BLOCK_ELEX_ITEM_ORE_STORAGE_3_REAL_UNLOCALIZED_NAMES(stack.getItemDamage())
    }
    
    override def getMetadata(meta:Int):Int = {
        return meta
    }
    
}
