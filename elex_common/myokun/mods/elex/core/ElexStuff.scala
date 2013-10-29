package myokun.mods.elex.core

import java.util.Random
import cpw.mods.fml.common.registry.GameRegistry
import myokun.mods.elex.api.ElexAPI
import myokun.mods.elex.block.ElexAlloyStorage
import myokun.mods.elex.block.ElexBrick
import myokun.mods.elex.block.ElexCentrifuge
import myokun.mods.elex.block.ElexCompoundOre
import myokun.mods.elex.block.ElexCompoundOre2
import myokun.mods.elex.block.ElexCompoundOre3
import myokun.mods.elex.block.ElexCompoundOreStorage
import myokun.mods.elex.block.ElexCompoundOreStorage2
import myokun.mods.elex.block.ElexCompoundOreStorage3
import myokun.mods.elex.block.ElexCondensator
import myokun.mods.elex.block.ElexGrinder
import myokun.mods.elex.block.ElexMachineCase
import myokun.mods.elex.block.ElexMetalStorage
import myokun.mods.elex.block.ElexMetalStorage2
import myokun.mods.elex.block.ElexMetalStorage3
import myokun.mods.elex.block.ElexMetalStorage4
import myokun.mods.elex.block.ElexMetalStorage5
import myokun.mods.elex.block.ElexMetalStorage6
import myokun.mods.elex.block.ElexOre
import myokun.mods.elex.block.ElexOre2
import myokun.mods.elex.block.ElexStone
import myokun.mods.elex.block.util.ElexItemBlockAlloyStorage
import myokun.mods.elex.block.util.ElexItemBlockBrick
import myokun.mods.elex.block.util.ElexItemBlockBuildingMaterial
import myokun.mods.elex.block.util.ElexItemBlockCompoundOre
import myokun.mods.elex.block.util.ElexItemBlockCompoundOre2
import myokun.mods.elex.block.util.ElexItemBlockCompoundOre3
import myokun.mods.elex.block.util.ElexItemBlockCompoundOreStorage
import myokun.mods.elex.block.util.ElexItemBlockCompoundOreStorage2
import myokun.mods.elex.block.util.ElexItemBlockCompoundOreStorage3
import myokun.mods.elex.block.util.ElexItemBlockMachineCase
import myokun.mods.elex.block.util.ElexItemBlockMetalStorage
import myokun.mods.elex.block.util.ElexItemBlockMetalStorage2
import myokun.mods.elex.block.util.ElexItemBlockMetalStorage3
import myokun.mods.elex.block.util.ElexItemBlockMetalStorage4
import myokun.mods.elex.block.util.ElexItemBlockMetalStorage5
import myokun.mods.elex.block.util.ElexItemBlockMetalStorage6
import myokun.mods.elex.block.util.ElexItemBlockOre
import myokun.mods.elex.block.util.ElexItemBlockOre2
import myokun.mods.elex.item.ElexAlloyDust
import myokun.mods.elex.item.ElexAlloyIngot
import myokun.mods.elex.item.ElexAlloyNugget
import myokun.mods.elex.item.ElexCarbonBoots
import myokun.mods.elex.item.ElexCarbonHead
import myokun.mods.elex.item.ElexCarbonLegs
import myokun.mods.elex.item.ElexCarbonPlate
import myokun.mods.elex.item.ElexCompoundDust
import myokun.mods.elex.item.ElexIngot
import myokun.mods.elex.item.ElexIronNugget
import myokun.mods.elex.item.ElexItemOre
import myokun.mods.elex.item.ElexMachinePart
import myokun.mods.elex.item.ElexMercuryInjector
import myokun.mods.elex.item.ElexMetalDust
import myokun.mods.elex.item.ElexMetalNugget
import myokun.mods.elex.item.ElexMiscDust
import myokun.mods.elex.item.ElexPureNonmetalDust
import myokun.mods.elex.item.ElexResearchBinder
import myokun.mods.elex.item.ElexSaltedBeef
import myokun.mods.elex.item.ElexSaltedChicken
import myokun.mods.elex.item.ElexSaltedFish
import myokun.mods.elex.item.ElexSaltedPork
import myokun.mods.elex.item.ElexVanillaDust
import myokun.lib.util.CraftingRecipeHandler
import net.minecraft.block.Block
import net.minecraft.item.Item
import net.minecraft.item.ItemStack
import net.minecraft.item.crafting.FurnaceRecipes
import myokun.mods.elex.tileentity.TileEntityGrinder
import myokun.mods.elex.tileentity.TileEntityCondensator
import myokun.mods.elex.tileentity.TileEntityCentrifuge
import net.minecraftforge.fluids.FluidStack
import net.minecraftforge.fluids.FluidRegistry
import myokun.mods.elex.item.ElexGemPlate
import myokun.mods.elex.item.ElexMetalPlate

object ElexStuff {
	
	def addBlocks {
		
		GameRegistry.registerBlock(ElexCentrifuge, "centrifugeElEx")
		GameRegistry.registerBlock(ElexCondensator, "condensatorElEx")
		GameRegistry.registerBlock(ElexGrinder, "grinderElEx")
		GameRegistry.registerBlock(ElexCompoundOre, classOf[ElexItemBlockCompoundOre], "blockElExCompoundOre")
		GameRegistry.registerBlock(ElexCompoundOre2, classOf[ElexItemBlockCompoundOre2], "blockElExCompoundOre2")
		GameRegistry.registerBlock(ElexCompoundOre3, classOf[ElexItemBlockCompoundOre3], "blockElExCompoundOre3")
		GameRegistry.registerBlock(ElexOre, classOf[ElexItemBlockOre], "blockElExOre")
		GameRegistry.registerBlock(ElexOre2, classOf[ElexItemBlockOre2], "blockElExOre2")
		GameRegistry.registerBlock(ElexCompoundOreStorage, classOf[ElexItemBlockCompoundOreStorage], "blockElExCompoundOreStorage")
		GameRegistry.registerBlock(ElexCompoundOreStorage2, classOf[ElexItemBlockCompoundOreStorage2], "blockElExCompoundOreStorage2")
		GameRegistry.registerBlock(ElexCompoundOreStorage3, classOf[ElexItemBlockCompoundOreStorage3], "blockElExCompoundOreStorage3")
		GameRegistry.registerBlock(ElexMetalStorage, classOf[ElexItemBlockMetalStorage], "blockElExMetalStorage")
		GameRegistry.registerBlock(ElexMetalStorage2, classOf[ElexItemBlockMetalStorage2], "blockElExMetalStorage2")
		GameRegistry.registerBlock(ElexMetalStorage3, classOf[ElexItemBlockMetalStorage3], "blockElExMetalStorage3")
		GameRegistry.registerBlock(ElexMetalStorage4, classOf[ElexItemBlockMetalStorage4], "blockElExMetalStorage4")
		GameRegistry.registerBlock(ElexMetalStorage5, classOf[ElexItemBlockMetalStorage5], "blockElExMetalStorage5")
		GameRegistry.registerBlock(ElexMetalStorage6, classOf[ElexItemBlockMetalStorage6], "blockElExMetalStorage6")
		GameRegistry.registerBlock(ElexAlloyStorage, classOf[ElexItemBlockAlloyStorage], "blockElExAlloyStorage")
		GameRegistry.registerBlock(ElexMachineCase, classOf[ElexItemBlockMachineCase], "blockElExMachineCase")
		GameRegistry.registerBlock(ElexStone, classOf[ElexItemBlockBuildingMaterial], "blockElExStone")
		GameRegistry.registerBlock(ElexBrick, classOf[ElexItemBlockBrick], "blockElExBrick")
		
	}
	
	def addItems {
		
		GameRegistry.registerItem(ElexItemOre, "elexCompoundOre")
		GameRegistry.registerItem(ElexMercuryInjector, "elexMercuryInjector")
		GameRegistry.registerItem(ElexCompoundDust, "elexCompoundDust")
		GameRegistry.registerItem(ElexMetalDust, "elexMetalDust")
		GameRegistry.registerItem(ElexVanillaDust, "elexVanillaDust")
		GameRegistry.registerItem(ElexAlloyDust, "elexAlloyDust")
		GameRegistry.registerItem(ElexMiscDust, "elexMiscDust")
		GameRegistry.registerItem(ElexIngot, "elexMetalIngot")
		GameRegistry.registerItem(ElexAlloyIngot, "elexAlloyIngot")
		GameRegistry.registerItem(ElexMachinePart, "elexMachinePart")
		GameRegistry.registerItem(ElexMetalNugget, "elexMetalNugget")
		GameRegistry.registerItem(ElexAlloyNugget, "elexAlloyNugget")
		GameRegistry.registerItem(ElexIronNugget, "elexIronNugget")
		GameRegistry.registerItem(ElexResearchBinder, "elexResearchBinder")
		GameRegistry.registerItem(ElexCarbonHead, "elexCarbonHelmet")
		GameRegistry.registerItem(ElexCarbonPlate, "elexCarbonPlate")
		GameRegistry.registerItem(ElexCarbonLegs, "elexCarbonLegs")
		GameRegistry.registerItem(ElexCarbonBoots, "elexCarbonBoots")
		GameRegistry.registerItem(ElexSaltedBeef, "elexSaltedBeef")
		GameRegistry.registerItem(ElexSaltedChicken, "elexSaltedChicken")
		GameRegistry.registerItem(ElexSaltedPork, "elexSaltedPork")
		GameRegistry.registerItem(ElexSaltedFish, "elexSaltedFish")
		GameRegistry.registerItem(ElexGemPlate, "elexGemPlate")
		GameRegistry.registerItem(ElexMetalPlate, "elexMetalPlate")
		
	}
	
	def addCrafting {
		
		CraftingRecipeHandler.addShapedRecipe(new ItemStack(ElexMercuryInjector, 1), "X", "Y", "Z", Array(new ItemStack(Item.ingotIron, 1), new ItemStack(Item.slimeBall, 1), new ItemStack(Item.stick, 1)), Array('X', 'Y', 'Z'))
		
		for (i <- 0 until ElexIDs.BLOCK_ELEX_ITEM_ORE_STORAGE_REAL_UNLOCALIZED_NAMES.length) {
			CraftingRecipeHandler.addShapedRecipe(new ItemStack(ElexCompoundOreStorage, 1, i), "XXX", "XXX", "XXX", Array(new ItemStack(ElexItemOre, 1, i)), Array('X'))
		}
		for (i <- 0 until ElexIDs.BLOCK_ELEX_ITEM_ORE_STORAGE_2_REAL_UNLOCALIZED_NAMES.length) {
			var j:Int = i + ElexIDs.BLOCK_ELEX_ITEM_ORE_STORAGE_REAL_UNLOCALIZED_NAMES.length
			
			CraftingRecipeHandler.addShapedRecipe(new ItemStack(ElexCompoundOreStorage2, 1, i), "XXX", "XXX", "XXX", Array(new ItemStack(ElexItemOre, 1, j)), Array('X'))
		}
		for (i <- 0 until ElexIDs.BLOCK_ELEX_ITEM_ORE_STORAGE_3_REAL_UNLOCALIZED_NAMES.length) {
			var j:Int = i + ElexIDs.BLOCK_ELEX_ITEM_ORE_STORAGE_REAL_UNLOCALIZED_NAMES.length + ElexIDs.BLOCK_ELEX_ITEM_ORE_STORAGE_2_REAL_UNLOCALIZED_NAMES.length
			
			CraftingRecipeHandler.addShapedRecipe(new ItemStack(ElexCompoundOreStorage3, 1, i), "XXX", "XXX", "XXX", Array(new ItemStack(ElexItemOre, 1, j)), Array('X'))
		}
		
		for (i <- 0 until ElexIDs.BLOCK_ELEX_METAL_STORAGE_REAL_UNLOCALIZED_NAMES.size()) {
			CraftingRecipeHandler.addShapedRecipe(new ItemStack(ElexMetalStorage, 1, i), "XXX", "XXX", "XXX", Array(new ItemStack(ElexIngot, 1, i)), Array('X'))
		}
		for (i <- 0 until ElexIDs.BLOCK_ELEX_METAL_STORAGE_2_REAL_UNLOCALIZED_NAMES.size()) {
			var j:Int = i + ElexIDs.BLOCK_ELEX_METAL_STORAGE_REAL_UNLOCALIZED_NAMES.size()
			
			CraftingRecipeHandler.addShapedRecipe(new ItemStack(ElexMetalStorage2, 1, i), "XXX", "XXX", "XXX", Array(new ItemStack(ElexIngot, 1, j)), Array('X'))
		}
		for (i <- 0 until ElexIDs.BLOCK_ELEX_METAL_STORAGE_3_REAL_UNLOCALIZED_NAMES.size()) {
			var j:Int = i + ElexIDs.BLOCK_ELEX_METAL_STORAGE_REAL_UNLOCALIZED_NAMES.size() + ElexIDs.BLOCK_ELEX_METAL_STORAGE_2_REAL_UNLOCALIZED_NAMES.size()
			
			CraftingRecipeHandler.addShapedRecipe(new ItemStack(ElexMetalStorage3, 1, i), "XXX", "XXX", "XXX", Array(new ItemStack(ElexIngot, 1, j)), Array('X'))
		}
		for (i <- 0 until ElexIDs.BLOCK_ELEX_METAL_STORAGE_4_REAL_UNLOCALIZED_NAMES.size()) {
			var j:Int = i + ElexIDs.BLOCK_ELEX_METAL_STORAGE_REAL_UNLOCALIZED_NAMES.size() + ElexIDs.BLOCK_ELEX_METAL_STORAGE_2_REAL_UNLOCALIZED_NAMES.size() + ElexIDs.BLOCK_ELEX_METAL_STORAGE_3_REAL_UNLOCALIZED_NAMES.size()
			
			CraftingRecipeHandler.addShapedRecipe(new ItemStack(ElexMetalStorage4, 1, i), "XXX", "XXX", "XXX", Array(new ItemStack(ElexIngot, 1, j)), Array('X'))
		}
		for (i <- 0 until ElexIDs.BLOCK_ELEX_METAL_STORAGE_5_REAL_UNLOCALIZED_NAMES.size()) {
			var j:Int = i + ElexIDs.BLOCK_ELEX_METAL_STORAGE_REAL_UNLOCALIZED_NAMES.size() + ElexIDs.BLOCK_ELEX_METAL_STORAGE_2_REAL_UNLOCALIZED_NAMES.size() + ElexIDs.BLOCK_ELEX_METAL_STORAGE_3_REAL_UNLOCALIZED_NAMES.size() + ElexIDs.BLOCK_ELEX_METAL_STORAGE_4_REAL_UNLOCALIZED_NAMES.size()
			
			CraftingRecipeHandler.addShapedRecipe(new ItemStack(ElexMetalStorage5, 1, i), "XXX", "XXX", "XXX", Array(new ItemStack(ElexIngot, 1, j)), Array('X'))
		}
		for (i <- 0 until ElexIDs.BLOCK_ELEX_METAL_STORAGE_6_REAL_UNLOCALIZED_NAMES.size()) {
			var j:Int = i + ElexIDs.BLOCK_ELEX_METAL_STORAGE_REAL_UNLOCALIZED_NAMES.size() + ElexIDs.BLOCK_ELEX_METAL_STORAGE_2_REAL_UNLOCALIZED_NAMES.size() + ElexIDs.BLOCK_ELEX_METAL_STORAGE_3_REAL_UNLOCALIZED_NAMES.size() + ElexIDs.BLOCK_ELEX_METAL_STORAGE_4_REAL_UNLOCALIZED_NAMES.size() + ElexIDs.BLOCK_ELEX_METAL_STORAGE_5_REAL_UNLOCALIZED_NAMES.size()
			
			CraftingRecipeHandler.addShapedRecipe(new ItemStack(ElexMetalStorage6, 1, i), "XXX", "XXX", "XXX", Array(new ItemStack(ElexIngot, 1, j)), Array('X'))
		}
		
		for (i <- 0 until ElexIDs.BLOCK_ALLOY_STORAGE_REAL_UNLOCALIZED_NAMES.length) {
			CraftingRecipeHandler.addShapedRecipe(new ItemStack(ElexAlloyStorage, 1, i), "XXX", "XXX", "XXX", Array(new ItemStack(ElexAlloyIngot, 1, i)), Array('X'))
		}
		
		CraftingRecipeHandler.addShapedRecipe(new ItemStack(ElexMachineCase, 1, 0), "XXX", "X X", "XXX", Array(new ItemStack(ElexAlloyIngot, 1, 0)), Array('X'))
		CraftingRecipeHandler.addShapedRecipe(new ItemStack(ElexMachineCase, 1, 1), "XXX", "X X", "XXX", Array(new ItemStack(ElexAlloyIngot, 1, 4)), Array('X'))
		CraftingRecipeHandler.addShapedRecipe(new ItemStack(ElexMachineCase, 1, 2), "XXX", "X X", "XXX", Array(new ItemStack(ElexAlloyIngot, 1, 5)), Array('X'))
		CraftingRecipeHandler.addShapedRecipe(new ItemStack(ElexMachineCase, 1, 3), "XXX", "X X", "XXX", Array(new ItemStack(ElexIngot, 1, 61)), Array('X'))
		
		for (i <- 0 until ElexIDs.BLOCK_BUILDING_MATERIAL_UNLOCALIZED_NAMES.length) {
			CraftingRecipeHandler.addShapedRecipe(new ItemStack(ElexBrick, 1, i), "XX", "XX", null, Array(new ItemStack(ElexStone, 1, i)), Array('X'))
		}
		CraftingRecipeHandler.addShapedRecipe(new ItemStack(ElexStone, 8, 0), "XXX", "XYX", "XXX", Array(new ItemStack(Block.stone, 1), new ItemStack(Item.dyePowder, 1, 1)), Array('X', 'Y'))
		CraftingRecipeHandler.addShapedRecipe(new ItemStack(ElexStone, 8, 1), "XXX", "XYX", "XXX", Array(new ItemStack(Block.stone, 1), new ItemStack(Item.dyePowder, 1, 4)), Array('X', 'Y'))
		CraftingRecipeHandler.addShapedRecipe(new ItemStack(ElexStone, 8, 2), "XXX", "XYX", "XXX", Array(new ItemStack(Block.stone, 1), new ItemStack(Item.dyePowder, 1, 2)), Array('X', 'Y'))
		CraftingRecipeHandler.addShapedRecipe(new ItemStack(ElexStone, 8, 3), "XXX", "XYX", "XXX", Array(new ItemStack(Block.stone, 1), new ItemStack(Item.dyePowder, 1, 11)), Array('X', 'Y'))
		
		CraftingRecipeHandler.addShapedRecipe(new ItemStack(ElexMachinePart, 1, 0), "XY", null, null, Array(new ItemStack(Item.ingotIron, 1), new ItemStack(ElexIngot, 1, 15)), Array('X', 'Y'))
		CraftingRecipeHandler.addShapedRecipe(new ItemStack(ElexMachinePart, 1, 1), "Y", "X", "Y", Array(new ItemStack(Item.ingotIron, 1), new ItemStack(ElexIngot, 1, 15)), Array('X', 'Y'))
		CraftingRecipeHandler.addShapedRecipe(new ItemStack(ElexMachinePart, 1, 2), "XYX", null, null, Array(new ItemStack(Item.flint, 1), new ItemStack(Item.ingotIron, 1)), Array('X', 'Y'))
		
        CraftingRecipeHandler.addShapedRecipe(new ItemStack(ElexGrinder, 1), "X", "Y", "Z", Array(new ItemStack(ElexMachinePart, 1, 2), new ItemStack(ElexMachineCase, 1, 0), new ItemStack(ElexMachinePart, 1, 1)), Array('X', 'Y', 'Z'))
        CraftingRecipeHandler.addShapedRecipe(new ItemStack(ElexCentrifuge, 1),  "X", "Y", "Z", Array(new ItemStack(ElexMachinePart, 1, 0), new ItemStack(ElexMachineCase, 1, 0), new ItemStack(ElexMachinePart, 1, 1)), Array('X', 'Y', 'Z'))
        
        CraftingRecipeHandler.addShapedRecipe(new ItemStack(ElexGemPlate, 1, 0), "XX", "XX", null, Array(new ItemStack(Item.emerald)), Array('X'))
        CraftingRecipeHandler.addShapedRecipe(new ItemStack(Block.endPortalFrame, 1), "XYX", "YZY", "ZZZ", Array(new ItemStack(ElexVanillaDust, 1, 9), new ItemStack(ElexGemPlate, 1, 0), new ItemStack(Block.whiteStone)), Array('X', 'Y', 'Z'))
        
        for (i <- 0 until ElexIDs.ELEX_INGOT_REAL_UNLOCALIZED_NAMES.size()) {
            GameRegistry.addShapelessRecipe(new ItemStack(ElexMetalNugget, 9, i), new ItemStack(ElexIngot, 1, i))
        }
        for (i <- 0 until ElexIDs.ALLOY_INGOT_REAL_UNLOCALIZED_NAMES.length) {
            GameRegistry.addShapelessRecipe(new ItemStack(ElexAlloyNugget, 9, i), new ItemStack(ElexAlloyIngot, 1, i))
        }
        GameRegistry.addShapelessRecipe(new ItemStack(ElexIronNugget, 9), new ItemStack(Item.ingotIron))
        
        GameRegistry.addShapelessRecipe(new ItemStack(ElexAlloyDust, 4, 0), new ItemStack(ElexVanillaDust, 1, 1), new ItemStack(ElexVanillaDust, 1, 1), new ItemStack(ElexVanillaDust, 1, 1), new ItemStack(ElexVanillaDust, 1, 5))
        GameRegistry.addShapelessRecipe(new ItemStack(ElexAlloyDust, 4, 1), new ItemStack(ElexVanillaDust, 1, 1), new ItemStack(ElexVanillaDust, 1, 1), new ItemStack(ElexMetalDust, 1, 10), new ItemStack(ElexVanillaDust, 1, 5))
        GameRegistry.addShapelessRecipe(new ItemStack(ElexAlloyDust, 4, 2), new ItemStack(ElexMetalDust, 1, 15), new ItemStack(ElexMetalDust, 1, 15), new ItemStack(ElexMetalDust, 1, 15), new ItemStack(ElexMetalDust, 1, 33))
        GameRegistry.addShapelessRecipe(new ItemStack(ElexAlloyDust, 4, 3), new ItemStack(ElexVanillaDust, 1, 2), new ItemStack(ElexVanillaDust, 1, 2), new ItemStack(ElexMetalDust, 1, 30), new ItemStack(ElexMetalDust, 1, 30))
        GameRegistry.addShapelessRecipe(new ItemStack(ElexAlloyDust, 4, 4), new ItemStack(ElexMetalDust, 1, 4), new ItemStack(ElexMetalDust, 1, 4), new ItemStack(ElexMetalDust, 1, 4), new ItemStack(ElexMetalDust, 1, 8))
        GameRegistry.addShapelessRecipe(new ItemStack(ElexAlloyDust, 4, 5), new ItemStack(ElexMetalDust, 1, 57), new ItemStack(ElexMetalDust, 1, 57), new ItemStack(ElexMetalDust, 1, 57), new ItemStack(ElexMetalDust, 1, 58))
        // Salted Meat Recipes
        GameRegistry.addShapelessRecipe(new ItemStack(ElexSaltedBeef), new ItemStack(Item.beefCooked), new ItemStack(ElexCompoundDust, 1, 7))
        GameRegistry.addShapelessRecipe(new ItemStack(ElexSaltedChicken), new ItemStack(Item.chickenCooked), new ItemStack(ElexCompoundDust, 1, 7))
        GameRegistry.addShapelessRecipe(new ItemStack(ElexSaltedPork), new ItemStack(Item.porkCooked), new ItemStack(ElexCompoundDust, 1, 7))
        GameRegistry.addShapelessRecipe(new ItemStack(ElexSaltedFish), new ItemStack(Item.fishCooked), new ItemStack(ElexCompoundDust, 1, 7))
        // Research Binder Recipe
        GameRegistry.addShapelessRecipe(new ItemStack(ElexResearchBinder, 1), new ItemStack(Item.leather, 1), new ItemStack(ElexIronNugget, 1), new ItemStack(Item.paper, 1), new ItemStack(Item.dyePowder, 1, 0))
        
        // Smelting Recipes for Compound Ore Dusts
        Loop.loopFurnaceItem(ElexIDs.ELEX_ORE_REAL_UNLOCALIZED_NAMES, ElexIDs.ELEX_COMPOUND_DUST, ElexItemOre, 0.7F)
        // Smelting Recipes for Emerald and Nether Quartz Dust
        FurnaceRecipes.smelting().addSmelting(ElexIDs.VANILLA_DUST, 0, new ItemStack(Item.netherQuartz, 1), 5F)
        FurnaceRecipes.smelting().addSmelting(ElexIDs.VANILLA_DUST, 3, new ItemStack(Item.emerald, 1), 5F)
        // Smelting Recipes for Metal Dusts
        Loop.loopFurnaceItemList(ElexIDs.ELEX_INGOT_REAL_UNLOCALIZED_NAMES, ElexIDs.ELEX_METAL_DUST, ElexIngot, 0.8F)
        // Smelting Recipes for Alloy Dusts
        for (i <- 0 until ElexIDs.ALLOY_INGOT_REAL_UNLOCALIZED_NAMES.length) {
            FurnaceRecipes.smelting().addSmelting(ElexIDs.ALLOY_DUST, i, new ItemStack(ElexAlloyIngot, 1, i), 5F)
        }
        // Smelting Recipes for Iron and Gold Dust
        FurnaceRecipes.smelting().addSmelting(ElexIDs.VANILLA_DUST, 1, new ItemStack(Item.ingotIron, 1), 5F)
        FurnaceRecipes.smelting().addSmelting(ElexIDs.VANILLA_DUST, 2, new ItemStack(Item.ingotGold, 1), 5F)
        // Smelting Recipes for Native Metal Ores
        for (i <- 0 until ElexIDs.BLOCK_ELEX_ORE_REAL_UNLOCALIZED_NAMES.length) {
            FurnaceRecipes.smelting().addSmelting(ElexIDs.BLOCK_ELEX_ORE, i, new ItemStack(ElexIngot, 1, ElexIDs.METAL_ORE_ELEMENT_IDS.get(i) - 1), 5F)
        }
        for (i <- 0 until ElexIDs.BLOCK_ELEX_ORE_2_REAL_UNLOCALIZED_NAMES.length) {
            var j:Int = i + ElexIDs.BLOCK_ELEX_ORE_REAL_UNLOCALIZED_NAMES.length
            FurnaceRecipes.smelting().addSmelting(ElexIDs.BLOCK_ELEX_ORE_2, i, new ItemStack(ElexIngot, 1, ElexIDs.METAL_ORE_ELEMENT_IDS.get(j) - 1), 5F)
        }
        // Smelting Recipes for Compound Ores
        for (i <- 0 until ElexIDs.ITEM_ELEX_ORE_REAL_UNLOCALIZED_NAMES.length) {
            FurnaceRecipes.smelting().addSmelting(ElexIDs.ITEM_ELEX_ORE, i, new ItemStack(ElexItemOre, 1, i), 5F)
        }
        for (i <- 0 until ElexIDs.ITEM_ELEX_ORE_2_REAL_UNLOCALIZED_NAMES.length) {
            var j:Int = i + ElexIDs.ITEM_ELEX_ORE_REAL_UNLOCALIZED_NAMES.length
            
            FurnaceRecipes.smelting().addSmelting(ElexIDs.ITEM_ELEX_ORE_2, i, new ItemStack(ElexItemOre, 1, j), 5F)
        }
        for (i <- 0 until ElexIDs.ITEM_ELEX_ORE_3_REAL_UNLOCALIZED_NAMES.length) {
            var j:Int = i + ElexIDs.ITEM_ELEX_ORE_REAL_UNLOCALIZED_NAMES.length + ElexIDs.ITEM_ELEX_ORE_2_REAL_UNLOCALIZED_NAMES.length
            
            FurnaceRecipes.smelting().addSmelting(ElexIDs.ITEM_ELEX_ORE_3, i, new ItemStack(ElexItemOre, 1, j), 5F)
        }
        
        // Grinder Recipes for Native Ore Dusts
        ElexIDs.NATIVE_ORE_BONUS_IDS = 
            Array( null, new ItemStack(ElexVanillaDust, 1, 1), new ItemStack(ElexMetalDust, 1, 14),
            new ItemStack(ElexPureNonmetalDust, 1, 3), null, new ItemStack(ElexPureNonmetalDust, 1, 3),
            new ItemStack(ElexMetalDust, 1, 61), new ItemStack(ElexMetalDust, 1, 58), new ItemStack(ElexMetalDust, 1, 29),
            new ItemStack(ElexVanillaDust, 1, 2), new ItemStack(ElexMetalDust, 1, 34), new ItemStack(ElexPureNonmetalDust, 1, 3),
            new ItemStack(ElexVanillaDust, 1, 1), null, new ItemStack(ElexMetalDust, 1, 30),
            new ItemStack(ElexVanillaDust, 1, 2), new ItemStack(ElexMetalDust, 1, 24), new ItemStack(ElexMetalDust, 1, 58),
            new ItemStack(ElexMetalDust, 1, 57), new ItemStack(ElexMetalDust, 1, 58), new ItemStack(ElexMetalDust, 1, 16),
            new ItemStack(ElexMetalDust, 1, 61) )
        ElexIDs.NATIVE_ORE_BONUS_CHANCES =
            Array( 0, 10, 6,
            5, 0, 5,
            7, 15, 12,
            8, 5, 5,
            7, 0, 7,
            8, 9, 15,
            14, 15, 5,
            7 )
        for (i <- 0 until ElexIDs.BLOCK_ELEX_ORE_REAL_UNLOCALIZED_NAMES.length) {
            if (ElexIDs.NATIVE_ORE_BONUS_IDS(i) != null) {
                ElexAPI.addGrinderRecipe(new ItemStack(ElexOre, 1, i), new ItemStack(ElexMetalDust, 2, ElexIDs.METAL_ORE_ELEMENT_IDS.get(i) - 1), ElexIDs.NATIVE_ORE_BONUS_IDS(i), ElexIDs.NATIVE_ORE_BONUS_CHANCES(i), 100, Reference.MOD_ID)
            }
            if (ElexIDs.NATIVE_ORE_BONUS_IDS(i) == null) {
                ElexAPI.addGrinderRecipe(new ItemStack(ElexOre, 1, i), new ItemStack(ElexMetalDust, 2, ElexIDs.METAL_ORE_ELEMENT_IDS.get(i) - 1), 100, Reference.MOD_ID)
            }
        }
        for (i <- 0 until ElexIDs.BLOCK_ELEX_ORE_2_REAL_UNLOCALIZED_NAMES.length) {
            var j:Int = i + ElexIDs.BLOCK_ELEX_ORE_REAL_UNLOCALIZED_NAMES.length
            
            ElexAPI.addGrinderRecipe(new ItemStack(ElexOre2, 1, i), new ItemStack(ElexMetalDust, 2, ElexIDs.METAL_ORE_ELEMENT_IDS.get(j) - 1), ElexIDs.NATIVE_ORE_BONUS_IDS(j), ElexIDs.NATIVE_ORE_BONUS_CHANCES(j), 100, Reference.MOD_ID)
        }
        // Grinder Recipes for Compound Ores
        for (i <- 0 until ElexIDs.ITEM_ELEX_ORE_REAL_UNLOCALIZED_NAMES.length) {
            ElexAPI.addGrinderRecipe(new ItemStack(ElexCompoundOre, 1, i), new ItemStack(ElexCompoundDust, 2, i), 100, Reference.MOD_ID)
        }
        for (i <- 0 until ElexIDs.ITEM_ELEX_ORE_2_REAL_UNLOCALIZED_NAMES.length) {
            var j:Int = i + ElexIDs.ITEM_ELEX_ORE_REAL_UNLOCALIZED_NAMES.length
            
            ElexAPI.addGrinderRecipe(new ItemStack(ElexCompoundOre2, 1, i), new ItemStack(ElexCompoundDust, 2, j), 100, Reference.MOD_ID)
        }
        for (i <- 0 until ElexIDs.ITEM_ELEX_ORE_3_REAL_UNLOCALIZED_NAMES.length) {
            var j:Int = i + ElexIDs.ITEM_ELEX_ORE_REAL_UNLOCALIZED_NAMES.length + ElexIDs.ITEM_ELEX_ORE_2_REAL_UNLOCALIZED_NAMES.length
            
            ElexAPI.addGrinderRecipe(new ItemStack(ElexCompoundOre3, 1, i), new ItemStack(ElexCompoundDust, 2, j), 100, Reference.MOD_ID)
        }
        
        val rand:Random = new Random
        
        // Grinder Recipes for Vanilla Blocks
        ElexAPI.addGrinderRecipe(new ItemStack(Block.oreNetherQuartz, 1), new ItemStack(ElexVanillaDust, 2, 0), 100, Reference.MOD_ID)
        ElexAPI.addGrinderRecipe(new ItemStack(Block.oreIron, 1), new ItemStack(ElexVanillaDust, 2, 1), 100, Reference.MOD_ID)
        ElexAPI.addGrinderRecipe(new ItemStack(Block.oreGold, 1), new ItemStack(ElexVanillaDust, 2, 2), 100, Reference.MOD_ID)
        ElexAPI.addGrinderRecipe(new ItemStack(Block.oreEmerald, 1), new ItemStack(ElexVanillaDust, 2, 3), 100, Reference.MOD_ID)
        ElexAPI.addGrinderRecipe(new ItemStack(Block.oreCoal, 1), new ItemStack(ElexVanillaDust, 2, 4), 100, Reference.MOD_ID)
        ElexAPI.addGrinderRecipe(new ItemStack(Block.oreDiamond, 1), new ItemStack(ElexVanillaDust, 2, 6), 150, Reference.MOD_ID)
        ElexAPI.addGrinderRecipe(new ItemStack(Block.oreLapis, 1), new ItemStack(ElexVanillaDust, 2 + rand.nextInt(4), 7), 100, Reference.MOD_ID)
        ElexAPI.addGrinderRecipe(new ItemStack(Block.oreRedstone, 1), new ItemStack(Item.redstone, 2), 100, Reference.MOD_ID)
        ElexAPI.addGrinderRecipe(new ItemStack(Block.obsidian, 1), new ItemStack(ElexVanillaDust, 1, 8), 300, Reference.MOD_ID)
        ElexAPI.addGrinderRecipe(new ItemStack(Item.enderPearl, 1), new ItemStack(ElexVanillaDust, 2, 9), 150, Reference.MOD_ID)
        
        // Centrifuge Recipes for Compound Dusts
        ElexAPI.addCentrifugeRecipe(new ItemStack(ElexCompoundDust, 16, 0), Array(new ItemStack(ElexMetalDust, 3, 1), new ItemStack(ElexMetalDust, 2, 4), new ItemStack(ElexMiscDust, 6, 0)), 240, Reference.MOD_ID)
        ElexAPI.addCentrifugeRecipe(new ItemStack(ElexCompoundDust, 16, 1), Array(new ItemStack(ElexMetalDust, 2, 2), new ItemStack(ElexPureNonmetalDust, 4, 0)), new FluidStack(FluidRegistry.WATER, 200), 220, Reference.MOD_ID)
		
	}
	
	def addTileEntities {
		
		GameRegistry.registerTileEntity(classOf[TileEntityGrinder], "grinderElEx")
		GameRegistry.registerTileEntity(classOf[TileEntityCentrifuge], "centrifugeElEx")
		GameRegistry.registerTileEntity(classOf[TileEntityCondensator], "condensatorElEx")
		
	}
	
}