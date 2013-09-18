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
    
    override def getMetadata(meta:Int):Int = {
        return meta
    }
    
}

class ElexItemBlockCompoundOreStorage(var id:Int) extends ElexItemBlock(id) {
    
    override def getUnlocalizedName(stack:ItemStack):String = {
        return "tile." + BLOCK_ELEX_ITEM_ORE_STORAGE_REAL_UNLOCALIZED_NAMES(stack.getItemDamage())
    }
    
}

class ElexItemBlockCompoundOreStorage2(var id:Int) extends ElexItemBlock(id) {
    
    override def getUnlocalizedName(stack:ItemStack):String = {
        return "tile." + BLOCK_ELEX_ITEM_ORE_STORAGE_2_REAL_UNLOCALIZED_NAMES(stack.getItemDamage())
    }
    
}

class ElexItemBlockCompoundOreStorage3(var id:Int) extends ElexItemBlock(id) {
    
    override def getUnlocalizedName(stack:ItemStack):String = {
        return "tile." + BLOCK_ELEX_ITEM_ORE_STORAGE_3_REAL_UNLOCALIZED_NAMES(stack.getItemDamage())
    }
    
}

class ElexItemBlockAlloyStorage(var id:Int) extends ElexItemBlock(id) {
    
    override def getUnlocalizedName(stack:ItemStack):String = {
        return "tile." + BLOCK_ALLOY_STORAGE_REAL_UNLOCALIZED_NAMES(stack.getItemDamage())
    }
    
}

class ElexItemBlockBrick(var id:Int) extends ElexItemBlock(id) {
    
    override def getUnlocalizedName(stack:ItemStack):String = {
        return "tile." + BLOCK_BRICK_UNLOCALIZED_NAMES(stack.getItemDamage())
    }
    
}

class ElexItemBlockBuildingMaterial(var id:Int) extends ElexItemBlock(id) {
    
    override def getUnlocalizedName(stack:ItemStack):String = {
        return "tile." + BLOCK_BUILDING_MATERIAL_UNLOCALIZED_NAMES(stack.getItemDamage())
    }
    
}

class ElexItemBlockCompoundOre(var id:Int) extends ElexItemBlock(id) {
    
    override def getUnlocalizedName(stack:ItemStack):String = {
        return "tile." + ITEM_ELEX_ORE_REAL_UNLOCALIZED_NAMES(stack.getItemDamage())
    }
    
}

class ElexItemBlockCompoundOre2(var id:Int) extends ElexItemBlock(id) {
    
    override def getUnlocalizedName(stack:ItemStack):String = {
    	if (stack.getItemDamage() > 15) {
    		return "tile." + ITEM_ELEX_ORE_2_REAL_UNLOCALIZED_NAMES(stack.getItemDamage() - 16)
    	}
    	else {
    		return "tile." + ITEM_ELEX_ORE_2_REAL_UNLOCALIZED_NAMES(stack.getItemDamage())
    	}
    }
    
}

class ElexItemBlockCompoundOre3(var id:Int) extends ElexItemBlock(id) {
    
    override def getUnlocalizedName(stack:ItemStack):String = {
    	if (stack.getItemDamage() > 31) {
    		return "tile." + ITEM_ELEX_ORE_3_REAL_UNLOCALIZED_NAMES(stack.getItemDamage() - 32)
    	}
    	else {
    		return "tile." + ITEM_ELEX_ORE_3_REAL_UNLOCALIZED_NAMES(stack.getItemDamage())
    	}
    }
    
}

class ElexItemBlockMetalStorage(var id:Int) extends ElexItemBlock(id) {
    
    override def getUnlocalizedName(stack:ItemStack):String = {
        return "tile." + BLOCK_ELEX_METAL_STORAGE_REAL_UNLOCALIZED_NAMES.get(stack.getItemDamage())
    }
    
}

class ElexItemBlockMetalStorage2(var id:Int) extends ElexItemBlock(id) {
    
    override def getUnlocalizedName(stack:ItemStack):String = {
        return "tile." + BLOCK_ELEX_METAL_STORAGE_2_REAL_UNLOCALIZED_NAMES.get(stack.getItemDamage())
    }
    
}

class ElexItemBlockMetalStorage3(var id:Int) extends ElexItemBlock(id) {
    
    override def getUnlocalizedName(stack:ItemStack):String = {
        return "tile." + BLOCK_ELEX_METAL_STORAGE_3_REAL_UNLOCALIZED_NAMES.get(stack.getItemDamage())
    }
    
}

class ElexItemBlockMetalStorage4(var id:Int) extends ElexItemBlock(id) {
    
    override def getUnlocalizedName(stack:ItemStack):String = {
        return "tile." + BLOCK_ELEX_METAL_STORAGE_4_REAL_UNLOCALIZED_NAMES.get(stack.getItemDamage())
    }
    
}

class ElexItemBlockMetalStorage5(var id:Int) extends ElexItemBlock(id) {
    
    override def getUnlocalizedName(stack:ItemStack):String = {
        return "tile." + BLOCK_ELEX_METAL_STORAGE_5_REAL_UNLOCALIZED_NAMES.get(stack.getItemDamage())
    }
    
}

class ElexItemBlockMetalStorage6(var id:Int) extends ElexItemBlock(id) {
    
    override def getUnlocalizedName(stack:ItemStack):String = {
        return "tile." + BLOCK_ELEX_METAL_STORAGE_6_REAL_UNLOCALIZED_NAMES.get(stack.getItemDamage())
    }
    
}

class ElexItemBlockOre(var id:Int) extends ElexItemBlock(id) {
    
    override def getUnlocalizedName(stack:ItemStack):String = {
        return "tile." + BLOCK_ELEX_ORE_REAL_UNLOCALIZED_NAMES(stack.getItemDamage())
    }
    
}

class ElexItemBlockOre2(var id:Int) extends ElexItemBlock(id) {
    
    override def getUnlocalizedName(stack:ItemStack):String = {
        return "tile." + BLOCK_ELEX_ORE_2_REAL_UNLOCALIZED_NAMES(stack.getItemDamage())
    }
    
}

class ElexItemBlockMachineCase(var id:Int) extends ElexItemBlock(id) {
    
    override def getUnlocalizedName(stack:ItemStack):String = {
        return "tile." + BLOCK_MACHINE_CASE_REAL_UNLOCALIZED_NAMES(stack.getItemDamage())
    }
    
}
