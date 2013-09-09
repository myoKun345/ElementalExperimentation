package elex.core;

import java.util.logging.Level;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import cpw.mods.fml.common.registry.GameRegistry;
import elex.api.ElexAPI;
import elex.api.GrinderRecipe;
import elex.lib.ElexIDs;

/**
 * Elemental Experimentation
 * 
 * CraftingRecipes
 * 
 * @author Myo-kun
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */
public class CraftingRecipes {
    public static void registerRecipes() {
        // Mercury Injector Recipe
        GameRegistry.addRecipe(new ItemStack(ModItems.mercuryInjector, 1), new Object[] { "X", "Z", "Y", 'X', Item.ingotIron, 'Z', Item.slimeBall, 'Y', Item.stick });
        // Storage Block Recipes for Compound Ores
        for (int i = 0; i < ElexIDs.BLOCK_ELEX_ITEM_ORE_STORAGE_REAL_UNLOCALIZED_NAMES.length; i++) {
            GameRegistry.addRecipe(new ItemStack(ModBlocks.blockElExItemOreStorage, 1, i), new Object[] { "XXX", "XXX", "XXX", 'X', new ItemStack(ModItems.itemElExOre, 1, i) });
        }
        // Storage Block Recipes for Metals
        for (int i = 0; i < ElexIDs.BLOCK_ELEX_METAL_STORAGE_REAL_UNLOCALIZED_NAMES.size(); i++) {
            GameRegistry.addRecipe(new ItemStack(ModBlocks.blockElExMetalStorage, 1, i), new Object[] { "XXX", "XXX", "XXX", 'X', new ItemStack(ModItems.itemElExIngot, 1, i) });
        }
        for (int i = 0; i < ElexIDs.BLOCK_ELEX_METAL_STORAGE_2_REAL_UNLOCALIZED_NAMES.size(); i++) {
            int j = i + ElexIDs.BLOCK_ELEX_METAL_STORAGE_REAL_UNLOCALIZED_NAMES.size();
            
            GameRegistry.addRecipe(new ItemStack(ModBlocks.blockElExMetalStorage2, 1, i), new Object[] { "XXX", "XXX", "XXX", 'X', new ItemStack(ModItems.itemElExIngot, 1, j) });
        }
        for (int i = 0; i < ElexIDs.BLOCK_ELEX_METAL_STORAGE_3_REAL_UNLOCALIZED_NAMES.size(); i++) {
            int j = i + ElexIDs.BLOCK_ELEX_METAL_STORAGE_REAL_UNLOCALIZED_NAMES.size() + ElexIDs.BLOCK_ELEX_METAL_STORAGE_2_REAL_UNLOCALIZED_NAMES.size();
            
            GameRegistry.addRecipe(new ItemStack(ModBlocks.blockElExMetalStorage3, 1, i), new Object[] { "XXX", "XXX", "XXX", 'X', new ItemStack(ModItems.itemElExIngot, 1, j) });
        }
        for (int i = 0; i < ElexIDs.BLOCK_ELEX_METAL_STORAGE_4_REAL_UNLOCALIZED_NAMES.size(); i++) {
            int j = i + ElexIDs.BLOCK_ELEX_METAL_STORAGE_REAL_UNLOCALIZED_NAMES.size() + ElexIDs.BLOCK_ELEX_METAL_STORAGE_2_REAL_UNLOCALIZED_NAMES.size() + ElexIDs.BLOCK_ELEX_METAL_STORAGE_3_REAL_UNLOCALIZED_NAMES.size();
            
            GameRegistry.addRecipe(new ItemStack(ModBlocks.blockElExMetalStorage4, 1, i), new Object[] { "XXX", "XXX", "XXX", 'X', new ItemStack(ModItems.itemElExIngot, 1, j) });
        }
        for (int i = 0; i < ElexIDs.BLOCK_ELEX_METAL_STORAGE_5_REAL_UNLOCALIZED_NAMES.size(); i++) {
            int j = i + ElexIDs.BLOCK_ELEX_METAL_STORAGE_REAL_UNLOCALIZED_NAMES.size() + ElexIDs.BLOCK_ELEX_METAL_STORAGE_2_REAL_UNLOCALIZED_NAMES.size() + ElexIDs.BLOCK_ELEX_METAL_STORAGE_3_REAL_UNLOCALIZED_NAMES.size() + ElexIDs.BLOCK_ELEX_METAL_STORAGE_4_REAL_UNLOCALIZED_NAMES.size();
            
            GameRegistry.addRecipe(new ItemStack(ModBlocks.blockElExMetalStorage5, 1, i), new Object[] { "XXX", "XXX", "XXX", 'X', new ItemStack(ModItems.itemElExIngot, 1, j) });
        }
        for (int i = 0; i < ElexIDs.BLOCK_ELEX_METAL_STORAGE_6_REAL_UNLOCALIZED_NAMES.size(); i++) {
            int j = i + ElexIDs.BLOCK_ELEX_METAL_STORAGE_REAL_UNLOCALIZED_NAMES.size() + ElexIDs.BLOCK_ELEX_METAL_STORAGE_2_REAL_UNLOCALIZED_NAMES.size() + ElexIDs.BLOCK_ELEX_METAL_STORAGE_3_REAL_UNLOCALIZED_NAMES.size() + ElexIDs.BLOCK_ELEX_METAL_STORAGE_4_REAL_UNLOCALIZED_NAMES.size() + ElexIDs.BLOCK_ELEX_METAL_STORAGE_5_REAL_UNLOCALIZED_NAMES.size();
            
            GameRegistry.addRecipe(new ItemStack(ModBlocks.blockElExMetalStorage6, 1, i), new Object[] { "XXX", "XXX", "XXX", 'X', new ItemStack(ModItems.itemElExIngot, 1, j) });
        }
        // Machine Case Recipes
        GameRegistry.addRecipe(new ItemStack(ModBlocks.blockMachineCase, 1, 0), new Object[] { "XXX", "X X", "XXX", 'X', new ItemStack(ModItems.itemAlloyIngot, 1, 0)});
        GameRegistry.addRecipe(new ItemStack(ModBlocks.blockMachineCase, 1, 1), new Object[] { "XXX", "X X", "XXX", 'X', new ItemStack(ModItems.itemAlloyIngot, 1, 4)});
        GameRegistry.addRecipe(new ItemStack(ModBlocks.blockMachineCase, 1, 2), new Object[] { "XXX", "X X", "XXX", 'X', new ItemStack(ModItems.itemAlloyIngot, 1, 5)});
        GameRegistry.addRecipe(new ItemStack(ModBlocks.blockMachineCase, 1, 3), new Object[] { "XXX", "X X", "XXX", 'X', new ItemStack(ModItems.itemElExIngot, 1, 61)});
        // Building Materials Recipes
        for (int i = 0; i < ElexIDs.BLOCK_BUILDING_MATERIAL_UNLOCALIZED_NAMES.length; i++) {
            GameRegistry.addRecipe(new ItemStack(ModBlocks.blockBrick, 1, i), new Object[] { "XX", "XX", 'X', new ItemStack(ModBlocks.blockBuildingMaterial, 1, i)});
        }
        GameRegistry.addRecipe(new ItemStack(ModBlocks.blockBuildingMaterial, 8, 5), new Object[] { "YYY", "YXY", "YYY", 'X', new ItemStack(Item.dyePowder, 1, 1), 'Y', new ItemStack(Block.stone) });
        GameRegistry.addRecipe(new ItemStack(ModBlocks.blockBuildingMaterial, 8, 6), new Object[] { "YYY", "YXY", "YYY", 'X', new ItemStack(Item.dyePowder, 1, 4), 'Y', new ItemStack(Block.stone) });
        GameRegistry.addRecipe(new ItemStack(ModBlocks.blockBuildingMaterial, 8, 7), new Object[] { "YYY", "YXY", "YYY", 'X', new ItemStack(Item.dyePowder, 1, 2), 'Y', new ItemStack(Block.stone) });
        GameRegistry.addRecipe(new ItemStack(ModBlocks.blockBuildingMaterial, 8, 8), new Object[] { "YYY", "YXY", "YYY", 'X', new ItemStack(Item.dyePowder, 1, 11), 'Y', new ItemStack(Block.stone) });
        // Nugget Recipes
        for (int i = 0; i < ElexIDs.ELEX_INGOT_REAL_UNLOCALIZED_NAMES.size(); i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(ModItems.itemMetalNugget, 9, i), new ItemStack(ModItems.itemElExIngot, 1, i));
        }
        for (int i = 0; i < ElexIDs.ALLOY_INGOT_REAL_UNLOCALIZED_NAMES.length; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(ModItems.itemAlloyNugget, 9, i), new ItemStack(ModItems.itemAlloyIngot, 1, i));
        }
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.itemIronNugget, 9), new ItemStack(Item.ingotIron));
        // Temporary Alloy Dust Recipes
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.itemAlloyDust, 4, 0), new ItemStack(ModItems.itemVanillaDust, 1, 1), new ItemStack(ModItems.itemVanillaDust, 1, 1), new ItemStack(ModItems.itemVanillaDust, 1, 1), new ItemStack(ModItems.itemVanillaDust, 1, 5));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.itemAlloyDust, 4, 1), new ItemStack(ModItems.itemVanillaDust, 1, 1), new ItemStack(ModItems.itemVanillaDust, 1, 1), new ItemStack(ModItems.itemElExMetalDust, 1, 10), new ItemStack(ModItems.itemVanillaDust, 1, 5));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.itemAlloyDust, 4, 2), new ItemStack(ModItems.itemElExMetalDust, 1, 15), new ItemStack(ModItems.itemElExMetalDust, 1, 15), new ItemStack(ModItems.itemElExMetalDust, 1, 15), new ItemStack(ModItems.itemElExMetalDust, 1, 33));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.itemAlloyDust, 4, 3), new ItemStack(ModItems.itemVanillaDust, 1, 2), new ItemStack(ModItems.itemVanillaDust, 1, 2), new ItemStack(ModItems.itemElExMetalDust, 1, 30), new ItemStack(ModItems.itemElExMetalDust, 1, 30));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.itemAlloyDust, 4, 4), new ItemStack(ModItems.itemElExMetalDust, 1, 4), new ItemStack(ModItems.itemElExMetalDust, 1, 4), new ItemStack(ModItems.itemElExMetalDust, 1, 4), new ItemStack(ModItems.itemElExMetalDust, 1, 8));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.itemAlloyDust, 4, 5), new ItemStack(ModItems.itemElExMetalDust, 1, 57), new ItemStack(ModItems.itemElExMetalDust, 1, 57), new ItemStack(ModItems.itemElExMetalDust, 1, 57), new ItemStack(ModItems.itemElExMetalDust, 1, 58));
        // Salted Meat Recipes
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.foodSaltedBeef), new ItemStack(Item.beefCooked), new ItemStack(ModItems.itemElExCompoundDust, 1, 7));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.foodSaltedChicken), new ItemStack(Item.chickenCooked), new ItemStack(ModItems.itemElExCompoundDust, 1, 7));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.foodSaltedPork), new ItemStack(Item.porkCooked), new ItemStack(ModItems.itemElExCompoundDust, 1, 7));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.foodSaltedFish), new ItemStack(Item.fishCooked), new ItemStack(ModItems.itemElExCompoundDust, 1, 7));
        // Research Binder Recipe
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.itemResearchBinder, 1), new ItemStack(Item.leather, 1), new ItemStack(ModItems.itemIronNugget, 1), new ItemStack(Item.paper, 1), new ItemStack(Item.dyePowder, 1, 0));
        
        // Smelting Recipes for Compound Ore Dusts
        Loop.loopFurnaceItem(ElexIDs.ELEX_ORE_REAL_UNLOCALIZED_NAMES, ElexIDs.ELEX_COMPOUND_DUST, ModItems.itemElExOre, 0.7F);
        // Smelting Recipes for Emerald and Nether Quartz Dust
        FurnaceRecipes.smelting().addSmelting(ElexIDs.VANILLA_DUST, 0, new ItemStack(Item.netherQuartz, 1), 5F);
        FurnaceRecipes.smelting().addSmelting(ElexIDs.VANILLA_DUST, 3, new ItemStack(Item.emerald, 1), 5F);
        // Smelting Recipes for Metal Dusts
        Loop.loopFurnaceItemList(ElexIDs.ELEX_INGOT_REAL_UNLOCALIZED_NAMES, ElexIDs.ELEX_METAL_DUST, ModItems.itemElExIngot, 0.8F);
        // Smelting Recipes for Alloy Dusts
        for (int i = 0; i < ElexIDs.ALLOY_INGOT_REAL_UNLOCALIZED_NAMES.length; i++) {
            FurnaceRecipes.smelting().addSmelting(ElexIDs.ALLOY_DUST, i, new ItemStack(ModItems.itemAlloyIngot, 1, i), 5F);
        }
        // Smelting Recipes for Iron and Gold Dust
        FurnaceRecipes.smelting().addSmelting(ElexIDs.VANILLA_DUST, 1, new ItemStack(Item.ingotIron, 1), 5F);
        FurnaceRecipes.smelting().addSmelting(ElexIDs.VANILLA_DUST, 2, new ItemStack(Item.ingotGold, 1), 5F);
        // Smelting Recipes for Native Metal Ores
        for (int i = 0; i < ElexIDs.BLOCK_ELEX_ORE_REAL_UNLOCALIZED_NAMES.length; i++) {
            FurnaceRecipes.smelting().addSmelting(ElexIDs.BLOCK_ELEX_ORE, i, new ItemStack(ModItems.itemElExIngot, 1, ElexIDs.METAL_ORE_ELEMENT_IDS.get(i) - 1), 5F);
        }
        for (int i = 0; i < ElexIDs.BLOCK_ELEX_ORE_2_REAL_UNLOCALIZED_NAMES.length; i++) {
            int j = i + ElexIDs.BLOCK_ELEX_ORE_REAL_UNLOCALIZED_NAMES.length;
            FurnaceRecipes.smelting().addSmelting(ElexIDs.BLOCK_ELEX_ORE_2, i, new ItemStack(ModItems.itemElExIngot, 1, ElexIDs.METAL_ORE_ELEMENT_IDS.get(j) - 1), 5F);
        }
        // Smelting Recipes for Compound Ores
        for (int i = 0; i < ElexIDs.ITEM_ELEX_ORE_REAL_UNLOCALIZED_NAMES.length; i++) {
            FurnaceRecipes.smelting().addSmelting(ElexIDs.ITEM_ELEX_ORE, i, new ItemStack(ModItems.itemElExOre, 1, i), 5F);
        }
        for (int i = 0; i < ElexIDs.ITEM_ELEX_ORE_2_REAL_UNLOCALIZED_NAMES.length; i++) {
            int j = i + ElexIDs.ITEM_ELEX_ORE_REAL_UNLOCALIZED_NAMES.length;
            
            FurnaceRecipes.smelting().addSmelting(ElexIDs.ITEM_ELEX_ORE_2, i, new ItemStack(ModItems.itemElExOre, 1, j), 5F);
        }
        for (int i = 0; i < ElexIDs.ITEM_ELEX_ORE_3_REAL_UNLOCALIZED_NAMES.length; i++) {
            int j = i + ElexIDs.ITEM_ELEX_ORE_REAL_UNLOCALIZED_NAMES.length + ElexIDs.ITEM_ELEX_ORE_2_REAL_UNLOCALIZED_NAMES.length;
            
            FurnaceRecipes.smelting().addSmelting(ElexIDs.ITEM_ELEX_ORE_3, i, new ItemStack(ModItems.itemElExOre, 1, j), 5F);
        }
        
        // Grinder Recipes for Native Ore Dusts
        ElexIDs.NATIVE_ORE_BONUS_IDS = 
            new ItemStack[]{ null, new ItemStack(ModItems.itemVanillaDust, 1, 1), new ItemStack(ModItems.itemElExMetalDust, 1, 14),
            new ItemStack(ModItems.itemElExPureNonmetalDust, 1, 3), null, new ItemStack(ModItems.itemElExPureNonmetalDust, 1, 3),
            new ItemStack(ModItems.itemElExMetalDust, 1, 61), new ItemStack(ModItems.itemElExMetalDust, 1, 58), new ItemStack(ModItems.itemElExMetalDust, 1, 29),
            new ItemStack(ModItems.itemVanillaDust, 1, 2), new ItemStack(ModItems.itemElExMetalDust, 1, 34), new ItemStack(ModItems.itemElExPureNonmetalDust, 1, 3),
            new ItemStack(ModItems.itemVanillaDust, 1, 1), null, new ItemStack(ModItems.itemElExMetalDust, 1, 30),
            new ItemStack(ModItems.itemVanillaDust, 1, 2), new ItemStack(ModItems.itemElExMetalDust, 1, 24), new ItemStack(ModItems.itemElExMetalDust, 1, 58),
            new ItemStack(ModItems.itemElExMetalDust, 1, 57), new ItemStack(ModItems.itemElExMetalDust, 1, 58), new ItemStack(ModItems.itemElExMetalDust, 1, 16),
            new ItemStack(ModItems.itemElExMetalDust, 1, 61) };
        ElexIDs.NATIVE_ORE_BONUS_CHANCES =
            new int[]{ 0, 10, 6,
            5, 0, 5,
            7, 15, 12,
            8, 5, 5,
            7, 0, 7,
            8, 9, 15,
            14, 15, 5,
            7 };
        for (int i = 0; i < ElexIDs.BLOCK_ELEX_ORE_REAL_UNLOCALIZED_NAMES.length; i++) {
            if (ElexIDs.NATIVE_ORE_BONUS_IDS[i] != null) {
                ElexAPI.addGrinderRecipe(new ItemStack(ModBlocks.blockElExOre, 1, i), new ItemStack(ModItems.itemElExMetalDust, 2, ElexIDs.METAL_ORE_ELEMENT_IDS.get(i) - 1), ElexIDs.NATIVE_ORE_BONUS_IDS[i], ElexIDs.NATIVE_ORE_BONUS_CHANCES[i], 100);
            }
            if (ElexIDs.NATIVE_ORE_BONUS_IDS[i] == null) {
                ElexAPI.addGrinderRecipe(new ItemStack(ModBlocks.blockElExOre, 1, i), new ItemStack(ModItems.itemElExMetalDust, 2, ElexIDs.METAL_ORE_ELEMENT_IDS.get(i) - 1), 100);
            }
        }
        for (int i = 0; i < ElexIDs.BLOCK_ELEX_ORE_2_REAL_UNLOCALIZED_NAMES.length; i++) {
            int j = i + ElexIDs.BLOCK_ELEX_ORE_REAL_UNLOCALIZED_NAMES.length;
            
            ElexAPI.addGrinderRecipe(new ItemStack(ModBlocks.blockElExOre2, 1, i), new ItemStack(ModItems.itemElExMetalDust, 2, ElexIDs.METAL_ORE_ELEMENT_IDS.get(j) - 1), ElexIDs.NATIVE_ORE_BONUS_IDS[j], ElexIDs.NATIVE_ORE_BONUS_CHANCES[j], 100);
        }
    }
}
