package elex.item

import cpw.mods.fml.relauncher.SideOnly
import cpw.mods.fml.relauncher.Side
import elex.ElementalExperimentation._
import elex.core.ElexIDs._
import elex.core.Reference._
import elex.core.LogHelper._
import java.util.List
import java.util.ArrayList
import net.minecraft.client.renderer.texture.IconRegister
import net.minecraft.creativetab.CreativeTabs
import net.minecraft.entity.Entity
import net.minecraft.item.EnumArmorMaterial
import net.minecraft.item.Item
import net.minecraft.item.ItemArmor
import net.minecraft.item.ItemStack
import net.minecraft.util.Icon
import net.minecraft.entity.player.EntityPlayer
import net.minecraft.entity.EntityLivingBase
import net.minecraft.util.DamageSource
import cpw.mods.fml.common.registry.LanguageRegistry
import net.minecraft.world.World
import net.minecraft.nbt.NBTTagCompound
import java.util.logging.Level
import net.minecraft.item.ItemFood

/**
 * Elemental Experimentation
 *
 * ItemElex
 *
 * @author Myo-kun
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */
class ElexItem(var par1:Int) extends Item(par1 - SHIFTED_ID_RANGE_CORRECTION) {
    
    setCreativeTab(elexTab)
    
}

class ElexItemArmor(var id:Int, var material:EnumArmorMaterial, var render:Int, var slot:Int, var armor:String) extends ItemArmor(id - SHIFTED_ID_RANGE_CORRECTION, material, render, slot) {
    
    @SideOnly(Side.CLIENT)
    var icons:Array[Icon] = new Array[Icon](ELEX_ARMOR_REAL_UNLOCALIZED_NAMES.length)
    
    setCreativeTab(elexTab)
    
    override def getUnlocalizedName(stack:ItemStack):String = {
        return "item." + ELEX_ARMOR_REAL_UNLOCALIZED_NAMES(slot)
    }
    
    @SideOnly(Side.CLIENT)
    override def registerIcons(register:IconRegister) {
        for (i <- 0 until ELEX_ARMOR_REAL_UNLOCALIZED_NAMES.length) {
            icons(i) = register.registerIcon(MOD_ID + ":" + ELEX_ARMOR_REAL_UNLOCALIZED_NAMES(i))
        }
    }
    
    @SideOnly(Side.CLIENT)
    override def getArmorTexture(stack:ItemStack, entity:Entity, theSlot:Int, layer:Int):String = {
        if (theSlot == 2) {
            return MOD_ID + ":" + armor + "2"
        }
        return MOD_ID + ":" + armor + "1"
    }
    
    @SideOnly(Side.CLIENT)
    override def getIcon(stack:ItemStack, pass:Int):Icon = {
        return icons(slot)
    }
    
}

class ElexItemDust(var id:Int, var kind:Int) extends ElexItem(id) {
    
    @SideOnly(Side.CLIENT)
    var icons:Array[Icon] = new Array[Icon](0)
    
    setHasSubtypes(true)
    
    override def getUnlocalizedName(stack:ItemStack):String = {
        if (kind == 0) {
            return "item." + ELEX_COMPOUND_DUST_REAL_UNLOCALIZED_NAMES(stack.getItemDamage())
        }
        if (kind == 1) {
            return "item." + METAL_DUST_REAL_UNLOCALIZED_NAMES.get(stack.getItemDamage())
        }
        if (kind == 2) {
            return "item." + ELEX_PURE_NONMETAL_DUST_REAL_UNLOCALIZED_NAMES.get(stack.getItemDamage())
        }
        if (kind == 3) {
            return "item." + VANILLA_DUST_REAL_UNLOCALIZED_NAMES(stack.getItemDamage())
        }
        if (kind == 4) {
            return "item." + ALLOY_DUST_REAL_UNLOCALIZED_NAMES(stack.getItemDamage())
        }
        if (kind == 5) {
            return "item." + ARTIFICIAL_COMPOUND_DUST_UNLOCALIZED_NAMES(stack.getItemDamage())
        }
        return "something.went.wrong"
    }
    
    @SideOnly(Side.CLIENT)
    override def registerIcons(register:IconRegister) {
        if (kind == 0) {
            icons = new Array[Icon](ELEX_COMPOUND_DUST_REAL_UNLOCALIZED_NAMES.length)
            for (i <- 0 until ELEX_COMPOUND_DUST_REAL_UNLOCALIZED_NAMES.length) {
                icons(i) = register.registerIcon(MOD_ID + ":" + ELEX_COMPOUND_DUST_REAL_UNLOCALIZED_NAMES(i))
            }
        }
        if (kind == 1) {
            icons = new Array[Icon](METAL_DUST_REAL_UNLOCALIZED_NAMES.size())
            for (i <- 0 until METAL_DUST_REAL_UNLOCALIZED_NAMES.size()) {
                icons(i) = register.registerIcon(MOD_ID + ":" + METAL_DUST_REAL_UNLOCALIZED_NAMES.get(i))
            }
        }
        if (kind == 2) {
            icons = new Array[Icon](ELEX_PURE_NONMETAL_DUST_REAL_UNLOCALIZED_NAMES.size())
            for (i <- 0 until ELEX_PURE_NONMETAL_DUST_REAL_UNLOCALIZED_NAMES.size()) {
                icons(i) = register.registerIcon(MOD_ID + ":" + ELEX_PURE_NONMETAL_DUST_REAL_UNLOCALIZED_NAMES.get(i))
            }
        }
        if (kind == 3) {
            icons = new Array[Icon](VANILLA_DUST_REAL_UNLOCALIZED_NAMES.length)
            for (i <- 0 until VANILLA_DUST_REAL_UNLOCALIZED_NAMES.length) {
                icons(i) = register.registerIcon(MOD_ID + ":" + VANILLA_DUST_REAL_UNLOCALIZED_NAMES(i))
            }
        }
        if (kind == 4) {
            icons = new Array[Icon](ALLOY_DUST_REAL_UNLOCALIZED_NAMES.length)
            for (i <- 0 until ALLOY_DUST_REAL_UNLOCALIZED_NAMES.length) {
                icons(i) = register.registerIcon(MOD_ID + ":" + ALLOY_DUST_REAL_UNLOCALIZED_NAMES(i))
            }
        }
        if (kind == 5) {
            icons = new Array[Icon](ARTIFICIAL_COMPOUND_DUST_UNLOCALIZED_NAMES.length)
            for (i <- 0 until ARTIFICIAL_COMPOUND_DUST_UNLOCALIZED_NAMES.length) {
                icons(i) = register.registerIcon(MOD_ID + ":" + ARTIFICIAL_COMPOUND_DUST_UNLOCALIZED_NAMES(i))
            }
        }
    }
    
    @SideOnly(Side.CLIENT)
    override def getIconFromDamage(dmg:Int):Icon = {
        return icons(dmg)
    }
    
    @SideOnly(Side.CLIENT)
    override def getSubItems(id:Int, tab:CreativeTabs, list:List[_]) {
        if (kind == 0) {
            for (i <- 0 until ELEX_COMPOUND_DUST_REAL_UNLOCALIZED_NAMES.length) {
                var stack:ItemStack = new ItemStack(id, 1, i)
                list.asInstanceOf[ArrayList[ItemStack]].add(stack)
            }
        }
        if (kind == 1) {
            for (i <- 0 until METAL_DUST_REAL_UNLOCALIZED_NAMES.size()) {
                var stack:ItemStack = new ItemStack(id, 1, i)
                list.asInstanceOf[ArrayList[ItemStack]].add(stack)
            }
        }
        if (kind == 2) {
            for (i <- 0 until ELEX_PURE_NONMETAL_DUST_REAL_UNLOCALIZED_NAMES.size()) {
                var stack:ItemStack = new ItemStack(id, 1, i)
                list.asInstanceOf[ArrayList[ItemStack]].add(stack)
            }
        }
        if (kind == 3) {
            for (i <- 0 until VANILLA_DUST_REAL_UNLOCALIZED_NAMES.length) {
                var stack:ItemStack = new ItemStack(id, 1, i)
                list.asInstanceOf[ArrayList[ItemStack]].add(stack)
            }
        }
        if (kind == 4) {
            for (i <- 0 until ALLOY_DUST_REAL_UNLOCALIZED_NAMES.length) {
                var stack:ItemStack = new ItemStack(id, 1, i)
                list.asInstanceOf[ArrayList[ItemStack]].add(stack)
            }
        }
        if (kind == 5) {
            for (i <- 0 until ARTIFICIAL_COMPOUND_DUST_UNLOCALIZED_NAMES.length) {
                var stack:ItemStack = new ItemStack(id, 1, i)
                list.asInstanceOf[ArrayList[ItemStack]].add(stack)
            }
        }
    }
    
    @SideOnly(Side.CLIENT)
    override def addInformation(stack:ItemStack, player:EntityPlayer, info:List[_], useExtra:Boolean) {
        if (kind == 0) {
            info.asInstanceOf[ArrayList[String]].add(COMPOUND_DUST_MOLECULE_STRINGS(stack.getItemDamage()));
        }
        if (kind == 1) {
            info.asInstanceOf[ArrayList[String]].add(METAL_DUST_MOLECULE_STRINGS.get(stack.getItemDamage()));
        }
        if (kind == 2) {
            info.asInstanceOf[ArrayList[String]].add(PURE_NONMETAL_DUST_MOLECULE_STRINGS.get(stack.getItemDamage()));
        }
        if (kind == 3) {
            info.asInstanceOf[ArrayList[String]].add(VANILLA_DUST_MOLECULE_STRINGS(stack.getItemDamage()));
        }
        if (kind == 4) {
            info.asInstanceOf[ArrayList[String]].add(ALLOY_DUST_MOLECULE_STRINGS(stack.getItemDamage()));
        }
        if (kind == 5) {
            info.asInstanceOf[ArrayList[String]].add(ARTIFICIAL_COMPOUND_DUST_MOLECULE_STRINGS(stack.getItemDamage()));
        }
    }
    
}

class ElexItemIngot(var id:Int, var kind:Int) extends ElexItem(id) {
    
    @SideOnly(Side.CLIENT)
    var icons:Array[Icon] = new Array[Icon](0)
    
    setHasSubtypes(true)
    
    override def getUnlocalizedName(stack:ItemStack):String = {
        if (kind == 0) {
            return "item." + ELEX_INGOT_REAL_UNLOCALIZED_NAMES.get(stack.getItemDamage())
        }
        if (kind == 1) {
            return "item." + ALLOY_INGOT_REAL_UNLOCALIZED_NAMES(stack.getItemDamage())
        }
        return "something.went.wrong"
    }
    
    @SideOnly(Side.CLIENT)
    override def registerIcons(register:IconRegister) {
        if (kind == 0) {
            icons = new Array[Icon](ELEX_INGOT_REAL_UNLOCALIZED_NAMES.size())
            for (i <- 0 until ELEX_INGOT_REAL_UNLOCALIZED_NAMES.size()) {
                icons(i) = register.registerIcon(MOD_ID + ":" + ELEX_INGOT_REAL_UNLOCALIZED_NAMES.get(i))
            }
        }
        if (kind == 1) {
            icons = new Array[Icon](ALLOY_INGOT_REAL_UNLOCALIZED_NAMES.length)
            for (i <- 0 until ALLOY_INGOT_REAL_UNLOCALIZED_NAMES.length) {
                icons(i) = register.registerIcon(MOD_ID + ":" + ALLOY_INGOT_REAL_UNLOCALIZED_NAMES(i))
            }
        }
    }
    
    @SideOnly(Side.CLIENT)
    override def getIconFromDamage(dmg:Int):Icon = {
        return icons(dmg)
    }
    
    @SideOnly(Side.CLIENT)
    override def getSubItems(id:Int, tab:CreativeTabs, list:List[_]) {
        if (kind == 0) {
            for (i <- 0 until ELEX_INGOT_REAL_UNLOCALIZED_NAMES.size()) {
                var stack:ItemStack = new ItemStack(id, 1, i)
                list.asInstanceOf[List[ItemStack]].add(stack)
            }
        }
        if (kind == 1) {
            for (i <- 0 until ALLOY_INGOT_REAL_UNLOCALIZED_NAMES.length) {
                var stack:ItemStack = new ItemStack(id, 1, i)
                list.asInstanceOf[List[ItemStack]].add(stack)
            }
        }
    }
    
}

class ElexItemNugget(var id:Int, var kind:Int) extends ElexItem(id) {
    
    @SideOnly(Side.CLIENT)
    var icons:Array[Icon] = new Array[Icon](0)
    
    setHasSubtypes(true)
    
    override def getUnlocalizedName(stack:ItemStack):String = {
        if (kind == 0) {
            return "item." + METAL_NUGGET_REAL_UNLOCALIZED_NAMES.get(stack.getItemDamage())
        }
        if (kind == 1) {
            return "item." + ALLOY_NUGGET_REAL_UNLOCALIZED_NAMES(stack.getItemDamage())
        }
        if (kind == 2) {
            return "item." + IRON_NUGGET_UNLOCALIZED_NAME
        }
        return "something.went.wrong"
    }
    
    @SideOnly(Side.CLIENT)
    override def registerIcons(register:IconRegister) {
        if (kind == 0) {
            icons = new Array[Icon](METAL_NUGGET_REAL_UNLOCALIZED_NAMES.size())
            for (i <- 0 until METAL_NUGGET_REAL_UNLOCALIZED_NAMES.size()) {
                icons(i) = register.registerIcon(MOD_ID + ":" + METAL_NUGGET_REAL_UNLOCALIZED_NAMES.get(i))
            }
        }
        if (kind == 1) {
            icons = new Array[Icon](ALLOY_NUGGET_REAL_UNLOCALIZED_NAMES.length)
            for (i <- 0 until ALLOY_NUGGET_REAL_UNLOCALIZED_NAMES.length) {
                icons(i) = register.registerIcon(MOD_ID + ":" + ALLOY_NUGGET_REAL_UNLOCALIZED_NAMES(i))
            }
        }
        if (kind == 2) {
            itemIcon = register.registerIcon(MOD_ID + ":" + IRON_NUGGET_UNLOCALIZED_NAME)
        }
    }
    
    @SideOnly(Side.CLIENT)
    override def getIconFromDamage(dmg:Int):Icon = {
        if (kind == 2) {
            return itemIcon
        }
        return icons(dmg)
    }
    
    @SideOnly(Side.CLIENT)
    override def getSubItems(id:Int, tab:CreativeTabs, list:List[_]) {
        if (kind == 0) {
            for (i <- 0 until METAL_NUGGET_REAL_UNLOCALIZED_NAMES.size()) {
                var stack:ItemStack = new ItemStack(id, 1, i)
                list.asInstanceOf[List[ItemStack]].add(stack)
            }
        }
        if (kind == 1) {
            for (i <- 0 until ALLOY_NUGGET_REAL_UNLOCALIZED_NAMES.length) {
                var stack:ItemStack = new ItemStack(id, 1, i)
                list.asInstanceOf[List[ItemStack]].add(stack)
            }
        }
        if (kind == 2) {
            var stack:ItemStack = new ItemStack(id, 1, 0)
            list.asInstanceOf[List[ItemStack]].add(stack)
        }
    }
    
}

class ElexItemOre(var id:Int) extends ElexItem(id) {
    
    @SideOnly(Side.CLIENT)
    var icons:Array[Icon] = new Array[Icon](0)
    
    setHasSubtypes(true)
    
    override def getUnlocalizedName(stack:ItemStack):String = {
        return "item." + ELEX_ORE_REAL_UNLOCALIZED_NAMES(stack.getItemDamage())
    }
    
    @SideOnly(Side.CLIENT)
    override def registerIcons(register:IconRegister) {
        icons = new Array[Icon](ELEX_ORE_REAL_UNLOCALIZED_NAMES.length)
        for (i <- 0 until ELEX_ORE_REAL_UNLOCALIZED_NAMES.length) {
            icons(i) = register.registerIcon(MOD_ID + ":" + ELEX_ORE_REAL_UNLOCALIZED_NAMES(i))
        }
    }
    
    @SideOnly(Side.CLIENT)
    override def getIconFromDamage(dmg:Int):Icon = {
        return icons(dmg)
    }
    
    @SideOnly(Side.CLIENT)
    override def getSubItems(id:Int, tab:CreativeTabs, list:List[_]) {
        for (i <- 0 until ELEX_ORE_REAL_UNLOCALIZED_NAMES.length) {
            var stack:ItemStack = new ItemStack(id, 1, i)
            list.asInstanceOf[List[ItemStack]].add(stack)
        }
    }
    
}

class ElexItemMachinePart(var id:Int) extends ElexItem(id) {
    
    @SideOnly(Side.CLIENT)
    var icons:Array[Icon] = new Array[Icon](0)
    
    setHasSubtypes(true)
    
    override def getUnlocalizedName(stack:ItemStack):String = {
        return "item." + MACHINE_PART_REAL_UNLOCALIZED_NAMES(stack.getItemDamage())
    }
    
    @SideOnly(Side.CLIENT)
    override def registerIcons(register:IconRegister) {
        icons = new Array[Icon](MACHINE_PART_REAL_UNLOCALIZED_NAMES.length)
        for (i <- 0 until MACHINE_PART_REAL_UNLOCALIZED_NAMES.length) {
            icons(i) = register.registerIcon(MOD_ID + ":" + MACHINE_PART_REAL_UNLOCALIZED_NAMES(i))
        }
    }
    
    @SideOnly(Side.CLIENT)
    override def getIconFromDamage(dmg:Int):Icon = {
        return icons(dmg)
    }
    
    @SideOnly(Side.CLIENT)
    override def getSubItems(id:Int, tab:CreativeTabs, list:List[_]) {
        for (i <- 0 until MACHINE_PART_REAL_UNLOCALIZED_NAMES.length) {
            var stack:ItemStack = new ItemStack(id, 1, i)
            list.asInstanceOf[List[ItemStack]].add(stack)
        }
    }
    
}

class ElexItemMercuryInjector(var id:Int) extends ElexItem(id) {
    
    @SideOnly(Side.CLIENT)
    var empty:Icon = null
    
    @SideOnly(Side.CLIENT)
    var half:Icon = null
    
    setMaxStackSize(1)
    setUnlocalizedName(MERCURY_INJECTOR_UNLOCALIZED_NAME)
    setMaxDamage(125)
    
    override def itemInteractionForEntity(stack:ItemStack, player:EntityPlayer, target:EntityLivingBase):Boolean = {
        target.attackEntityFrom(DamageSource.causePlayerDamage(player), 20.0F)
        stack.damageItem(1, target)
        
        return false
    }
    
    @SideOnly(Side.CLIENT)
    override def registerIcons(register:IconRegister) {
        itemIcon = register.registerIcon(MOD_ID + ":" + MERCURY_INJECTOR_UNLOCALIZED_NAME)
        half = register.registerIcon(MOD_ID + ":" + MERCURY_INJECTOR_UNLOCALIZED_NAME + "_half")
        empty = register.registerIcon(MOD_ID + ":" + MERCURY_INJECTOR_UNLOCALIZED_NAME + "_empty")
    }
    
    @SideOnly(Side.CLIENT)
    override def getIconFromDamage(dmg:Int):Icon = {
        if (dmg >= 120) {
            return empty
        }
        if (dmg >= 62) {
            return half
        }
        return itemIcon
    }
    
    @SideOnly(Side.CLIENT)
    override def addInformation(stack:ItemStack, player:EntityPlayer, info:List[_], useExtra:Boolean) {
        var millibuckets:Int = (125 - stack.getItemDamage()) * 8;
        
        if (0 == stack.getItemDamage()) {
            info.asInstanceOf[List[String]].add("1000 mB " + LanguageRegistry.instance().getStringLocalization("string.millibuckets.remaining"))
        }
        else {
            info.asInstanceOf[List[String]].add(millibuckets + " mB " + LanguageRegistry.instance().getStringLocalization("string.millibuckets.remaining"))
        }
    }
    
}

class ElexItemResearchBinder(var id:Int) extends ElexItem(id) {
    
    setMaxStackSize(1)
    
    override def getUnlocalizedName(stack:ItemStack):String = {
        return "item." + RESEARCH_BINDER_UNLOCALIZED_NAME
    }
    
    @SideOnly(Side.CLIENT)
    override def registerIcons(register:IconRegister) {
        itemIcon = register.registerIcon(MOD_ID + ":" + RESEARCH_BINDER_UNLOCALIZED_NAME)
    }
    
    override def onCreated(stack:ItemStack, world:World, player:EntityPlayer) {
        if (!stack.hasTagCompound()) {
            log(Level.INFO, "nbtlol")
            stack.setTagCompound(new NBTTagCompound())
            stack.stackTagCompound.setString("Owner", player.username)
        }
    }
    
    @SideOnly(Side.CLIENT)
    override def addInformation(stack:ItemStack, player:EntityPlayer, info:List[_], useExtra:Boolean) {
        if (stack.hasTagCompound()) {
            log(Level.INFO, "nbtlel")
            info.asInstanceOf[List[String]].add("Owner: " + stack.stackTagCompound.getString("Owner"))
        }
    }
    
}

class ElexItemSaltedMeat(var id:Int, var base:ItemFood, var kind:Int) extends ItemFood(id - SHIFTED_ID_RANGE_CORRECTION, base.getHealAmount() + 1, base.getSaturationModifier() - 0.1F, true) {
    
    @SideOnly(Side.CLIENT)
    var icons:Array[Icon] = new Array[Icon](0)
    
    setCreativeTab(elexTab)
    
    override def getUnlocalizedName(stack:ItemStack):String = {
        return "item." + SALTED_MEAT_UNLOCALIZED_NAMES(kind)
    }
    
    @SideOnly(Side.CLIENT)
    override def registerIcons(register:IconRegister) {
        icons = new Array[Icon](SALTED_MEAT_UNLOCALIZED_NAMES.length)
        for (i <- 0 until SALTED_MEAT_UNLOCALIZED_NAMES.length) {
            icons(i) = register.registerIcon(MOD_ID + ":" + SALTED_MEAT_UNLOCALIZED_NAMES(i))
        }
    }
    
    @SideOnly(Side.CLIENT)
    override def getIcon(stack:ItemStack, pass:Int):Icon = {
        return icons(kind)
    }
    
}
