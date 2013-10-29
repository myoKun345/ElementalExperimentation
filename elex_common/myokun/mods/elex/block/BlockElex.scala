package myokun.mods.elex.block

import myokun.mods.elex.ElementalExperimentation._
import myokun.mods.elex.core.ElexIDs._
import myokun.mods.elex.core.Reference._
import java.util.List
import net.minecraft.block.Block
import net.minecraft.block.material.Material
import cpw.mods.fml.relauncher.SideOnly
import net.minecraft.util.Icon
import cpw.mods.fml.relauncher.Side
import net.minecraft.client.renderer.texture.IconRegister
import net.minecraft.creativetab.CreativeTabs
import net.minecraft.item.ItemStack
import net.minecraft.block.BlockContainer
import net.minecraft.entity.EntityLivingBase
import net.minecraft.world.World
import net.minecraftforge.common.ForgeDirection
import myokun.mods.elex.core.RenderUtilities
import myokun.mods.elex.core.Position
import net.minecraft.entity.player.EntityPlayer
import myokun.mods.elex.tileentity.TileEntityCentrifuge
import net.minecraft.tileentity.TileEntity
import java.util.Random
import myokun.mods.elex.tileentity.TileEntityGrinder
import cpw.mods.fml.common.network.FMLNetworkHandler
import net.minecraft.inventory.IInventory
import net.minecraft.entity.item.EntityItem
import myokun.mods.elex.tileentity.TileEntityCondensator
import myokun.mods.elex.tileentity.TileEntityCondensator.EnumCondensatorMode
import myokun.mods.elex.core.LogHelper
import net.minecraft.world.biome.BiomeGenBase
import java.util.logging.Level
import cpw.mods.fml.common.network.FMLNetworkHandler
import net.minecraft.block.BlockChest

/**
 * Elemental Experimentation
 *
 * BlockElex
 *
 * @author Myo-kun
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */
class ElexBlock(var arg:Int, var mat:Material) extends Block(arg, mat) {
    
    setCreativeTab(elexTab)

}

abstract class ElexBlockContainer(var arg:Int, var mat:Material) extends BlockContainer(arg, mat) {
    
    setCreativeTab(elexTab)
    
}

class ElexBlockBuildingMaterial(var id:Int, var kind:Int) extends ElexBlock(id, Material.rock) {
    
    @SideOnly(Side.CLIENT)
    var icons:Array[Icon] = new Array[Icon](0)
    
    setStepSound(Block.soundStoneFootstep)
    setHardness(3.0F)
    setResistance(4.5F)
    
    @SideOnly(Side.CLIENT)
    override def registerIcons(register:IconRegister) {
        if (kind == 0) {
            icons = new Array[Icon](BLOCK_BUILDING_MATERIAL_UNLOCALIZED_NAMES.length)
            for (i <- 0 until BLOCK_BUILDING_MATERIAL_UNLOCALIZED_NAMES.length) {
                icons(i) = register.registerIcon(MOD_ID + ":" + BLOCK_BUILDING_MATERIAL_UNLOCALIZED_NAMES(i))
            }
        }
        if (kind == 1) {
            icons = new Array[Icon](BLOCK_BRICK_UNLOCALIZED_NAMES.length)
            for (i <- 0 until BLOCK_BRICK_UNLOCALIZED_NAMES.length) {
                icons(i) = register.registerIcon(MOD_ID + ":" + BLOCK_BRICK_UNLOCALIZED_NAMES(i))
            }
        }
    }
    
    @SideOnly(Side.CLIENT)
    override def getIcon(side:Int, meta:Int):Icon = {
        return icons(meta)
    }
    
    @SideOnly(Side.CLIENT)
    override def getSubBlocks(id:Int, tab:CreativeTabs, list:List[_]) {
        if (kind == 0) {
            for (i <- 0 until BLOCK_BUILDING_MATERIAL_UNLOCALIZED_NAMES.length) {
                list.asInstanceOf[List[ItemStack]].add(new ItemStack(id, 1, i))
            }
        }
        if (kind == 1) {
            for (i <- 0 until BLOCK_BRICK_UNLOCALIZED_NAMES.length) {
                list.asInstanceOf[List[ItemStack]].add(new ItemStack(id, 1, i))
            }
        }
    }
    
    override def damageDropped(meta:Int):Int = {
        return meta
    }
    
}
object ElexStone extends ElexBlockBuildingMaterial(BLOCK_BUILDING_MATERIAL, 0)
object ElexBrick extends ElexBlockBuildingMaterial(BLOCK_BRICK, 1)

object ElexCentrifuge extends ElexBlockContainer(CENTRIFUGE, Material.iron) {
    
    @SideOnly(Side.CLIENT)
    var baseIcon:Icon = null
    @SideOnly(Side.CLIENT)
    var frontIcon:Icon = null
    @SideOnly(Side.CLIENT)
    var topIcon:Icon = null
    
    setHardness(5F)
    setStepSound(Block.soundMetalFootstep)
    setUnlocalizedName(CENTRIFUGE_UNLOCALIZED_NAME)
    
    @SideOnly(Side.CLIENT)
    override def registerIcons(register:IconRegister) {
        baseIcon = register.registerIcon(MOD_ID + ":caseCarbonSteel")
        frontIcon = register.registerIcon(MOD_ID + ":" + CENTRIFUGE_UNLOCALIZED_NAME + "_front")
        topIcon = register.registerIcon(MOD_ID + ":" + CENTRIFUGE_UNLOCALIZED_NAME + "_top")
    }
    
    override def onBlockPlacedBy(world:World, x:Int, y:Int, z:Int, entity:EntityLivingBase, stack:ItemStack) {
        super.onBlockPlacedBy(world, x, y, z, entity, stack)
        
        var orientation:ForgeDirection = RenderUtilities.get2dOrientation(new Position(entity.posX, entity.posY, entity.posZ), new Position(x, y, z))
        
        world.setBlockMetadataWithNotify(x, y, z, orientation.getOpposite().ordinal(), 1)
        if (entity.isInstanceOf[EntityPlayer]) {
            var centrifuge:TileEntityCentrifuge = world.getBlockTileEntity(x, y, z).asInstanceOf[TileEntityCentrifuge]
            centrifuge.placedBy = entity.asInstanceOf[EntityPlayer]
        }
    }
    
    @SideOnly(Side.CLIENT)
    override def getIcon(side:Int, meta:Int):Icon = {
        if (meta == 0 && side == 3) {
            return frontIcon
        }
        if (side == meta && side > 1) {
            return frontIcon;
        }
        if (side == 1) {
            return topIcon
        }
        return baseIcon
    }
    
    override def onBlockActivated(world:World, x:Int, y:Int, z:Int, player:EntityPlayer, side:Int, hitX:Float, hitY:Float, hitZ:Float):Boolean = {
        if (player.isSneaking()) {
            return false
        }
        if (!world.isRemote && !player.isSneaking()) {
            FMLNetworkHandler.openGui(player, instance, 1, world, x, y, z)
        }
        
        return true
    }
    
    override def createNewTileEntity(world:World):TileEntity = {
        return new TileEntityCentrifuge()
    }
    
}

object ElexCondensator extends ElexBlockContainer(CONDENSATOR, Material.iron) {
    
    @SideOnly(Side.CLIENT)
    var baseIcon:Icon = null
    @SideOnly(Side.CLIENT)
    var frontIcon:Icon = null
    @SideOnly(Side.CLIENT)
    var idleIcon:Icon = null
    @SideOnly(Side.CLIENT)
    var topIcon:Icon = null
    
    setHardness(5F)
    setStepSound(Block.soundMetalFootstep)
    setUnlocalizedName(CONDENSATOR_UNLOCALIZED_NAME)
    
    @SideOnly(Side.CLIENT)
    override def registerIcons(register:IconRegister) {
        baseIcon = register.registerIcon(MOD_ID + ":caseCarbonSteel")
        frontIcon = register.registerIcon(MOD_ID + ":" + CONDENSATOR_UNLOCALIZED_NAME + "_front")
        idleIcon = register.registerIcon(MOD_ID + ":" + CONDENSATOR_UNLOCALIZED_NAME + "_idle")
        topIcon = register.registerIcon(MOD_ID + ":" + CONDENSATOR_UNLOCALIZED_NAME + "_top")
    }
    
    override def onBlockPlacedBy(world:World, x:Int, y:Int, z:Int, entity:EntityLivingBase, stack:ItemStack) {
        super.onBlockPlacedBy(world, x, y, z, entity, stack)
        
        var orientation:ForgeDirection = RenderUtilities.get2dOrientation(new Position(entity.posX, entity.posY, entity.posZ), new Position(x, y, z))
        
        world.setBlockMetadataWithNotify(x, y, z, orientation.getOpposite().ordinal(), 1)
        if (entity.isInstanceOf[EntityPlayer]) {
            var condensator:TileEntityCondensator = world.getBlockTileEntity(x, y, z).asInstanceOf[TileEntityCondensator]
            condensator.placedBy = entity.asInstanceOf[EntityPlayer]
        }
        
        setDefaultMode(world, x, y, z)
    }
    
    @SideOnly(Side.CLIENT)
    override def getIcon(side:Int, meta:Int):Icon = {
        if (meta == 0 && side == 3) {
            return idleIcon
        }
        if (side == meta && side > 1) {
            return idleIcon;
        }
        if (meta == 10 && side == 3) {
            return frontIcon
        }
        if (side + 10 == meta && side > 1) {
            return frontIcon;
        }
        if (side == 1) {
            return topIcon
        }
        return baseIcon
    }
    
    override def onBlockActivated(world:World, x:Int, y:Int, z:Int, player:EntityPlayer, side:Int, hitX:Float, hitY:Float, hitZ:Float):Boolean = {
        if (player.isSneaking()) {
            return false
        }
        if (!world.isRemote && !player.isSneaking()) {
            FMLNetworkHandler.openGui(player, instance, 2, world, x, y, z)
        }
        
        return true
    }
    
    override def breakBlock(world:World, x:Int, y:Int, z:Int, id:Int, meta:Int) {
        var entity:TileEntity = world.getBlockTileEntity(x, y, z)
        if (entity != null && entity.isInstanceOf[IInventory]) {
            var inventory:IInventory = entity.asInstanceOf[IInventory]
            
            for (i <- 0 until inventory.getSizeInventory()) {
                var stack:ItemStack = inventory.getStackInSlotOnClosing(i)
                
                if (stack != null) {
                    var spawnX:Float = x + world.rand.nextFloat()
                    var spawnY:Float = y + world.rand.nextFloat()
                    var spawnZ:Float = z + world.rand.nextFloat()
                    
                    var droppedItem:EntityItem = new EntityItem(world, spawnX, spawnY, spawnZ, stack)
                    
                    droppedItem.motionX = world.rand.nextFloat() * 0.05F
                    droppedItem.motionY = world.rand.nextFloat() * 0.05F
                    droppedItem.motionZ = world.rand.nextFloat() * 0.05F
                    
                    world.spawnEntityInWorld(droppedItem)
                }
            }
        }
        
        super.breakBlock(world, x, y, z, id, meta)
    }
    
    override def createNewTileEntity(world:World):TileEntity = {
        return new TileEntityCondensator()
    }
    
    def setDefaultMode(world:World, x:Int, y:Int, z:Int) {
        var te:TileEntityCondensator = world.getBlockTileEntity(x, y, z).asInstanceOf[TileEntityCondensator]
        if (world.getBiomeGenForCoords(x, z) != BiomeGenBase.hell) {
            te.modeAir = true
            te.modeWater = true
            te.enableMode(te.modeAir)
            te.enableMode(te.modeWater)
            te.setCurrentMode(EnumCondensatorMode.WATER, te.modeAir)
            LogHelper.log(Level.INFO, "Output: " + te.currentMode.getFluid() + te.modeAir + te.modeWater)
        }
        else if (world.getBiomeGenForCoords(x, z) == BiomeGenBase.hell) {
            te.modeNetherAir = true
            te.enableMode(te.modeNetherAir)
            te.setCurrentMode(EnumCondensatorMode.NETHER, te.modeNetherAir)
        }
    }
    
}

object ElexGrinder extends ElexBlockContainer(GRINDER, Material.iron) {
    
    @SideOnly(Side.CLIENT)
    var baseIcon:Icon = null
    @SideOnly(Side.CLIENT)
    var frontIcon:Icon = null
    @SideOnly(Side.CLIENT)
    var idleIcon:Icon = null
    @SideOnly(Side.CLIENT)
    var topIcon:Icon = null
    
    setHardness(5F)
    setStepSound(Block.soundMetalFootstep)
    setUnlocalizedName(GRINDER_UNLOCALIZED_NAME)
    
    @SideOnly(Side.CLIENT)
    override def registerIcons(register:IconRegister) {
        baseIcon = register.registerIcon(MOD_ID + ":caseCarbonSteel")
        frontIcon = register.registerIcon(MOD_ID + ":" + GRINDER_UNLOCALIZED_NAME + "_front")
        idleIcon = register.registerIcon(MOD_ID + ":" + GRINDER_UNLOCALIZED_NAME + "_idle")
        topIcon = register.registerIcon(MOD_ID + ":" + GRINDER_UNLOCALIZED_NAME + "_top")
    }
    
    override def onBlockPlacedBy(world:World, x:Int, y:Int, z:Int, entity:EntityLivingBase, stack:ItemStack) {
        super.onBlockPlacedBy(world, x, y, z, entity, stack)
        
        var orientation:ForgeDirection = RenderUtilities.get2dOrientation(new Position(entity.posX, entity.posY, entity.posZ), new Position(x, y, z))
        
        world.setBlockMetadataWithNotify(x, y, z, orientation.getOpposite().ordinal(), 1)
        if (entity.isInstanceOf[EntityPlayer]) {
            var grinder:TileEntityGrinder = world.getBlockTileEntity(x, y, z).asInstanceOf[TileEntityGrinder]
            grinder.placedBy = entity.asInstanceOf[EntityPlayer]
        }
    }
    
    @SideOnly(Side.CLIENT)
    override def getIcon(side:Int, meta:Int):Icon = {
        if (meta == 0 && side == 3) {
            return idleIcon
        }
        if (side == meta && side > 1) {
            return idleIcon;
        }
        if (meta == 10 && side == 3) {
            return frontIcon
        }
        if (side + 10 == meta && side > 1) {
            return frontIcon;
        }
        if (side == 1) {
            return topIcon
        }
        return baseIcon
    }
    
    override def onBlockActivated(world:World, x:Int, y:Int, z:Int, player:EntityPlayer, side:Int, hitX:Float, hitY:Float, hitZ:Float):Boolean = {
        if (player.isSneaking()) {
            return false
        }
        if (!world.isRemote && !player.isSneaking()) {
            FMLNetworkHandler.openGui(player, instance, 0, world, x, y, z)
        }
        
        return true
    }
    
    override def breakBlock(world:World, x:Int, y:Int, z:Int, id:Int, meta:Int) {
        var entity:TileEntity = world.getBlockTileEntity(x, y, z)
        if (entity != null && entity.isInstanceOf[IInventory]) {
            var inventory:IInventory = entity.asInstanceOf[IInventory]
            
            for (i <- 0 until inventory.getSizeInventory()) {
                var stack:ItemStack = inventory.getStackInSlotOnClosing(i)
                
                if (stack != null) {
                    var spawnX:Float = x + world.rand.nextFloat()
                    var spawnY:Float = y + world.rand.nextFloat()
                    var spawnZ:Float = z + world.rand.nextFloat()
                    
                    var droppedItem:EntityItem = new EntityItem(world, spawnX, spawnY, spawnZ, stack)
                    
                    droppedItem.motionX = world.rand.nextFloat() * 0.05F
                    droppedItem.motionY = world.rand.nextFloat() * 0.05F
                    droppedItem.motionZ = world.rand.nextFloat() * 0.05F
                    
                    world.spawnEntityInWorld(droppedItem)
                }
            }
        }
        
        super.breakBlock(world, x, y, z, id, meta)
    }
    
    override def createNewTileEntity(world:World):TileEntity = {
        return new TileEntityGrinder();
    }
    
}

class ElexBlockCompoundOre(var id:Int, var kind:Int) extends ElexBlock(id, Material.rock) {
    
    @SideOnly(Side.CLIENT)
    var icons:Array[Icon] = new Array[Icon](0)
    
    setHardness(3.0F)
    setResistance(5.0F)
    setStepSound(Block.soundStoneFootstep)
    
    @SideOnly(Side.CLIENT)
    override def registerIcons(register:IconRegister) {
        if (kind == 0) {
            icons = new Array[Icon](ITEM_ELEX_ORE_REAL_UNLOCALIZED_NAMES.length)
            for (i <- 0 until ITEM_ELEX_ORE_REAL_UNLOCALIZED_NAMES.length) {
                icons(i) = register.registerIcon(MOD_ID + ":" + ITEM_ELEX_ORE_REAL_UNLOCALIZED_NAMES(i))
            }
        }
        if (kind == 1) {
            icons = new Array[Icon](ITEM_ELEX_ORE_2_REAL_UNLOCALIZED_NAMES.length)
            for (i <- 0 until ITEM_ELEX_ORE_2_REAL_UNLOCALIZED_NAMES.length) {
                icons(i) = register.registerIcon(MOD_ID + ":" + ITEM_ELEX_ORE_2_REAL_UNLOCALIZED_NAMES(i))
            }
        }
        if (kind == 2) {
            icons = new Array[Icon](ITEM_ELEX_ORE_3_REAL_UNLOCALIZED_NAMES.length)
            for (i <- 0 until ITEM_ELEX_ORE_3_REAL_UNLOCALIZED_NAMES.length) {
                icons(i) = register.registerIcon(MOD_ID + ":" + ITEM_ELEX_ORE_3_REAL_UNLOCALIZED_NAMES(i))
            }
        }
    }
    
    @SideOnly(Side.CLIENT)
    override def getIcon(side:Int, meta:Int):Icon = {
        var fixedMeta:Int = 0
        
        if (kind == 0) {
            fixedMeta = meta
            
            return icons(fixedMeta)
        }
        if (kind == 1) {
            fixedMeta = meta - 16
            
            if (fixedMeta < 0) {
                fixedMeta = fixedMeta + 16
            }
            
            return icons(fixedMeta)
        }
        if (kind == 2) {
            fixedMeta = meta - 32
            
            if (fixedMeta < 0) {
                fixedMeta = fixedMeta + 32
            }
            
            return icons(fixedMeta)
        }
        else {
            LogHelper.log(Level.SEVERE, "Block list number is out of range. Notify Myo-kun immediately!")
            return icons(0)
        }
    }
    
    @SideOnly(Side.CLIENT)
    override def getSubBlocks(id:Int, tab:CreativeTabs, list:List[_]) {
        if (kind == 0) {
            for (i <- 0 until ITEM_ELEX_ORE_REAL_UNLOCALIZED_NAMES.length) {
                list.asInstanceOf[List[ItemStack]].add(new ItemStack(id, 1, i))
            }
        }
        if (kind == 1) {
            for (i <- 0 until ITEM_ELEX_ORE_2_REAL_UNLOCALIZED_NAMES.length) {
                list.asInstanceOf[List[ItemStack]].add(new ItemStack(id, 1, i))
            }
        }
        if (kind == 2) {
            for (i <- 0 until ITEM_ELEX_ORE_3_REAL_UNLOCALIZED_NAMES.length) {
                list.asInstanceOf[List[ItemStack]].add(new ItemStack(id, 1, i))
            }
        }
    }
    
    override def idDropped(i:Int, random:Random, j:Int):Int = {
        return ELEX_ORE
    }
    
    override def quantityDropped(meta:Int, fortune:Int, random:Random):Int = {
        return quantityDroppedWithBonus(fortune, random)
    }
    
    override def quantityDroppedWithBonus(fortune:Int, random:Random):Int = {
        var output:Int = 0
        
        if (fortune != 0) {
            var rnd:Int = random.nextInt(fortune * 3) + 1
            
            if (rnd <= 0) {
                LogHelper.log(Level.INFO, rnd + ", so 1")
                
                output = 1
            }
            if (rnd > 9) {
                LogHelper.log(Level.INFO, rnd + ", so 9")
                
                output = 9
            }
            else {
                LogHelper.log(Level.INFO, rnd + "")
                
                output = rnd
            }
        }
        else {
            output = 1
        }
        
        return output
    }
    
    override def damageDropped(meta:Int):Int = {
        if (kind == 0) {
            return meta
        }
        if (kind == 1) {
            return meta + 16
        }
        if (kind == 2) {
            return meta + 32
        }
        else {
            return 0
        }
    }
    
}
object ElexCompoundOre extends ElexBlockCompoundOre(ITEM_ELEX_ORE, 0)
object ElexCompoundOre2 extends ElexBlockCompoundOre(ITEM_ELEX_ORE_2, 1)
object ElexCompoundOre3 extends ElexBlockCompoundOre(ITEM_ELEX_ORE_3, 2)

class ElexBlockCompoundOreStorage(var id:Int, var kind:Int) extends ElexBlock(id, Material.iron) {
    
    @SideOnly(Side.CLIENT)
    var icons:Array[Icon] = new Array[Icon](0)
    
    setHardness(5.0F)
    setResistance(10.0F)
    setStepSound(Block.soundMetalFootstep)
    
    @SideOnly(Side.CLIENT)
    override def registerIcons(register:IconRegister) {
        if (kind == 0) {
            icons = new Array[Icon](BLOCK_ELEX_ITEM_ORE_STORAGE_REAL_UNLOCALIZED_NAMES.length)
            for (i <- 0 until BLOCK_ELEX_ITEM_ORE_STORAGE_REAL_UNLOCALIZED_NAMES.length) {
                icons(i) = register.registerIcon(MOD_ID + ":" + BLOCK_ELEX_ITEM_ORE_STORAGE_REAL_UNLOCALIZED_NAMES(i))
            }
        }
        if (kind == 1) {
            icons = new Array[Icon](BLOCK_ELEX_ITEM_ORE_STORAGE_2_REAL_UNLOCALIZED_NAMES.length)
            for (i <- 0 until BLOCK_ELEX_ITEM_ORE_STORAGE_2_REAL_UNLOCALIZED_NAMES.length) {
                icons(i) = register.registerIcon(MOD_ID + ":" + BLOCK_ELEX_ITEM_ORE_STORAGE_2_REAL_UNLOCALIZED_NAMES(i))
            }
        }
        if (kind == 2) {
            icons = new Array[Icon](BLOCK_ELEX_ITEM_ORE_STORAGE_3_REAL_UNLOCALIZED_NAMES.length)
            for (i <- 0 until BLOCK_ELEX_ITEM_ORE_STORAGE_3_REAL_UNLOCALIZED_NAMES.length) {
                icons(i) = register.registerIcon(MOD_ID + ":" + BLOCK_ELEX_ITEM_ORE_STORAGE_3_REAL_UNLOCALIZED_NAMES(i))
            }
        }
    }
    
    @SideOnly(Side.CLIENT)
    override def getIcon(side:Int, meta:Int):Icon = {
        return icons(meta)
    }
    
    @SideOnly(Side.CLIENT)
    override def getSubBlocks(id:Int, tab:CreativeTabs, list:List[_]) {
        if (kind == 0) {
            for (i <- 0 until BLOCK_ELEX_ITEM_ORE_STORAGE_REAL_UNLOCALIZED_NAMES.length) {
                list.asInstanceOf[List[ItemStack]].add(new ItemStack(id, 1, i))
            }
        }
        if (kind == 1) {
            for (i <- 0 until BLOCK_ELEX_ITEM_ORE_STORAGE_2_REAL_UNLOCALIZED_NAMES.length) {
                list.asInstanceOf[List[ItemStack]].add(new ItemStack(id, 1, i))
            }
        }
        if (kind == 2) {
            for (i <- 0 until BLOCK_ELEX_ITEM_ORE_STORAGE_3_REAL_UNLOCALIZED_NAMES.length) {
                list.asInstanceOf[List[ItemStack]].add(new ItemStack(id, 1, i))
            }
        }
    }
    
    override def damageDropped(meta:Int):Int = {
        return meta
    }
    
    override def isBeaconBase(world:World, x:Int, y:Int, z:Int, beaconX:Int, beaconY:Int, beaconZ:Int):Boolean = {
        return true
    }
    
}
object ElexCompoundOreStorage extends ElexBlockCompoundOreStorage(BLOCK_ELEX_ITEM_ORE_STORAGE, 0)
object ElexCompoundOreStorage2 extends ElexBlockCompoundOreStorage(BLOCK_ELEX_ITEM_ORE_STORAGE_2, 1)
object ElexCompoundOreStorage3 extends ElexBlockCompoundOreStorage(BLOCK_ELEX_ITEM_ORE_STORAGE_3, 2)

class ElexBlockMetalStorage(var id:Int, var kind:Int) extends ElexBlock(id, Material.iron) {
    
    @SideOnly(Side.CLIENT)
    var icons:Array[Icon] = new Array[Icon](0)
    
    setHardness(5.0F)
    setResistance(10.0F)
    setStepSound(Block.soundMetalFootstep)
    
    @SideOnly(Side.CLIENT)
    override def registerIcons(register:IconRegister) {
        if (kind == 0) {
            icons = new Array[Icon](BLOCK_ELEX_METAL_STORAGE_REAL_UNLOCALIZED_NAMES.size())
            for (i <- 0 until BLOCK_ELEX_METAL_STORAGE_REAL_UNLOCALIZED_NAMES.size()) {
                icons(i) = register.registerIcon(MOD_ID + ":" + BLOCK_ELEX_METAL_STORAGE_REAL_UNLOCALIZED_NAMES.get(i))
            }
        }
        if (kind == 1) {
            icons = new Array[Icon](BLOCK_ELEX_METAL_STORAGE_2_REAL_UNLOCALIZED_NAMES.size())
            for (i <- 0 until BLOCK_ELEX_METAL_STORAGE_2_REAL_UNLOCALIZED_NAMES.size()) {
                icons(i) = register.registerIcon(MOD_ID + ":" + BLOCK_ELEX_METAL_STORAGE_2_REAL_UNLOCALIZED_NAMES.get(i))
            }
        }
        if (kind == 2) {
            icons = new Array[Icon](BLOCK_ELEX_METAL_STORAGE_3_REAL_UNLOCALIZED_NAMES.size())
            for (i <- 0 until BLOCK_ELEX_METAL_STORAGE_3_REAL_UNLOCALIZED_NAMES.size()) {
                icons(i) = register.registerIcon(MOD_ID + ":" + BLOCK_ELEX_METAL_STORAGE_3_REAL_UNLOCALIZED_NAMES.get(i))
            }
        }
        if (kind == 3) {
            icons = new Array[Icon](BLOCK_ELEX_METAL_STORAGE_4_REAL_UNLOCALIZED_NAMES.size())
            for (i <- 0 until BLOCK_ELEX_METAL_STORAGE_4_REAL_UNLOCALIZED_NAMES.size()) {
                icons(i) = register.registerIcon(MOD_ID + ":" + BLOCK_ELEX_METAL_STORAGE_4_REAL_UNLOCALIZED_NAMES.get(i))
            }
        }
        if (kind == 4) {
            icons = new Array[Icon](BLOCK_ELEX_METAL_STORAGE_5_REAL_UNLOCALIZED_NAMES.size())
            for (i <- 0 until BLOCK_ELEX_METAL_STORAGE_5_REAL_UNLOCALIZED_NAMES.size()) {
                icons(i) = register.registerIcon(MOD_ID + ":" + BLOCK_ELEX_METAL_STORAGE_5_REAL_UNLOCALIZED_NAMES.get(i))
            }
        }
        if (kind == 5) {
            icons = new Array[Icon](BLOCK_ELEX_METAL_STORAGE_6_REAL_UNLOCALIZED_NAMES.size())
            for (i <- 0 until BLOCK_ELEX_METAL_STORAGE_6_REAL_UNLOCALIZED_NAMES.size()) {
                icons(i) = register.registerIcon(MOD_ID + ":" + BLOCK_ELEX_METAL_STORAGE_6_REAL_UNLOCALIZED_NAMES.get(i))
            }
        }
        if (kind == 6) {
            icons = new Array[Icon](BLOCK_ALLOY_STORAGE_REAL_UNLOCALIZED_NAMES.length)
            for (i <- 0 until BLOCK_ALLOY_STORAGE_REAL_UNLOCALIZED_NAMES.length) {
                icons(i) = register.registerIcon(MOD_ID + ":" + BLOCK_ALLOY_STORAGE_REAL_UNLOCALIZED_NAMES(i))
            }
        }
    }
    
    @SideOnly(Side.CLIENT)
    override def getIcon(side:Int, meta:Int):Icon = {
        return icons(meta)
    }
    
    @SideOnly(Side.CLIENT)
    override def getSubBlocks(id:Int, tab:CreativeTabs, list:List[_]) {
        if (kind == 0) {
            for (i <- 0 until BLOCK_ELEX_METAL_STORAGE_REAL_UNLOCALIZED_NAMES.size()) {
                list.asInstanceOf[List[ItemStack]].add(new ItemStack(id, 1, i))
            }
        }
        if (kind == 1) {
            for (i <- 0 until BLOCK_ELEX_METAL_STORAGE_2_REAL_UNLOCALIZED_NAMES.size()) {
                list.asInstanceOf[List[ItemStack]].add(new ItemStack(id, 1, i))
            }
        }
        if (kind == 2) {
            for (i <- 0 until BLOCK_ELEX_METAL_STORAGE_3_REAL_UNLOCALIZED_NAMES.size()) {
                list.asInstanceOf[List[ItemStack]].add(new ItemStack(id, 1, i))
            }
        }
        if (kind == 3) {
            for (i <- 0 until BLOCK_ELEX_METAL_STORAGE_4_REAL_UNLOCALIZED_NAMES.size()) {
                list.asInstanceOf[List[ItemStack]].add(new ItemStack(id, 1, i))
            }
        }
        if (kind == 4) {
            for (i <- 0 until BLOCK_ELEX_METAL_STORAGE_5_REAL_UNLOCALIZED_NAMES.size()) {
                list.asInstanceOf[List[ItemStack]].add(new ItemStack(id, 1, i))
            }
        }
        if (kind == 5) {
            for (i <- 0 until BLOCK_ELEX_METAL_STORAGE_6_REAL_UNLOCALIZED_NAMES.size()) {
                list.asInstanceOf[List[ItemStack]].add(new ItemStack(id, 1, i))
            }
        }
        if (kind == 6) {
            for (i <- 0 until BLOCK_ALLOY_STORAGE_REAL_UNLOCALIZED_NAMES.length) {
                list.asInstanceOf[List[ItemStack]].add(new ItemStack(id, 1, i))
            }
        }
    }
    
    override def damageDropped(meta:Int):Int = {
        return meta
    }
    
    override def isBeaconBase(world:World, x:Int, y:Int, z:Int, beaconX:Int, beaconY:Int, beaconZ:Int):Boolean = {
        return true
    }
    
}
object ElexMetalStorage extends ElexBlockMetalStorage(BLOCK_ELEX_METAL_STORAGE, 0)
object ElexMetalStorage2 extends ElexBlockMetalStorage(BLOCK_ELEX_METAL_STORAGE_2, 1)
object ElexMetalStorage3 extends ElexBlockMetalStorage(BLOCK_ELEX_METAL_STORAGE_3, 2)
object ElexMetalStorage4 extends ElexBlockMetalStorage(BLOCK_ELEX_METAL_STORAGE_4, 3)
object ElexMetalStorage5 extends ElexBlockMetalStorage(BLOCK_ELEX_METAL_STORAGE_5, 4)
object ElexMetalStorage6 extends ElexBlockMetalStorage(BLOCK_ELEX_METAL_STORAGE_6, 5)
object ElexAlloyStorage extends ElexBlockMetalStorage(BLOCK_ALLOY_STORAGE, 6)

class ElexBlockOre(var id:Int, var kind:Int) extends ElexBlock(id, Material.rock) {
    
    @SideOnly(Side.CLIENT)
    var icons:Array[Icon] = new Array[Icon](0)
    
    setHardness(3.0F)
    setResistance(5.0F)
    setStepSound(Block.soundStoneFootstep)
    
    @SideOnly(Side.CLIENT)
    override def registerIcons(register:IconRegister) {
        if (kind == 0) {
            icons = new Array[Icon](BLOCK_ELEX_ORE_REAL_UNLOCALIZED_NAMES.length)
            for (i <- 0 until BLOCK_ELEX_ORE_REAL_UNLOCALIZED_NAMES.length) {
                icons(i) = register.registerIcon(MOD_ID + ":" + BLOCK_ELEX_ORE_REAL_UNLOCALIZED_NAMES(i))
            }
        }
        if (kind == 1) {
            icons = new Array[Icon](BLOCK_ELEX_ORE_2_REAL_UNLOCALIZED_NAMES.length)
            for (i <- 0 until BLOCK_ELEX_ORE_2_REAL_UNLOCALIZED_NAMES.length) {
                icons(i) = register.registerIcon(MOD_ID + ":" + BLOCK_ELEX_ORE_2_REAL_UNLOCALIZED_NAMES(i))
            }
        }
    }
    
    @SideOnly(Side.CLIENT)
    override def getIcon(side:Int, meta:Int):Icon = {
        return icons(meta)
    }
    
    @SideOnly(Side.CLIENT)
    override def getSubBlocks(id:Int, tab:CreativeTabs, list:List[_]) {
        if (kind == 0) {
            for (i <- 0 until BLOCK_ELEX_ORE_REAL_UNLOCALIZED_NAMES.length) {
                list.asInstanceOf[List[ItemStack]].add(new ItemStack(id, 1, i))
            }
        }
        if (kind == 1) {
            for (i <- 0 until BLOCK_ELEX_ORE_2_REAL_UNLOCALIZED_NAMES.length) {
                list.asInstanceOf[List[ItemStack]].add(new ItemStack(id, 1, i))
            }
        }
    }
    
    override def damageDropped(meta:Int):Int = {
        return meta
    }
    
}
object ElexOre extends ElexBlockOre(BLOCK_ELEX_ORE, 0)
object ElexOre2 extends ElexBlockOre(BLOCK_ELEX_ORE_2, 1)

object ElexMachineCase extends ElexBlock(BLOCK_MACHINE_CASE, Material.iron) {
    
    @SideOnly(Side.CLIENT)
    var icons:Array[Icon] = new Array[Icon](0)
    
    setHardness(5.0F)
    setResistance(10.0F)
    setStepSound(Block.soundMetalFootstep)
    
    @SideOnly(Side.CLIENT)
    override def registerIcons(register:IconRegister) {
        icons = new Array[Icon](BLOCK_MACHINE_CASE_REAL_UNLOCALIZED_NAMES.length)
        for (i <- 0 until BLOCK_MACHINE_CASE_REAL_UNLOCALIZED_NAMES.length) {
            icons(i) = register.registerIcon(MOD_ID + ":" + BLOCK_MACHINE_CASE_REAL_UNLOCALIZED_NAMES(i))
        }
    }
    
    @SideOnly(Side.CLIENT)
    override def getIcon(side:Int, meta:Int):Icon = {
        return icons(meta)
    }
    
    @SideOnly(Side.CLIENT)
    override def getSubBlocks(id:Int, tab:CreativeTabs, list:List[_]) {
        for (i <- 0 until BLOCK_MACHINE_CASE_REAL_UNLOCALIZED_NAMES.length) {
            list.asInstanceOf[List[ItemStack]].add(new ItemStack(id, 1, i))
        }
    }
    
    override def damageDropped(meta:Int):Int = {
        return meta
    }
    
}

object QuartzChest extends ElexBlockContainer(QUARTZ_CHEST, Material.iron) {
	
    setBlockBounds(0.0625F, 0.0F, 0.0625F, 0.9375F, 0.875F, 0.9375F)
	
    override def isOpaqueCube:Boolean = false
    
    override def renderAsNormalBlock:Boolean = false
    
    override def getRenderType:Int = 22
    
	override def createNewTileEntity(world:World):TileEntity = {
		return null
	}
	
}
