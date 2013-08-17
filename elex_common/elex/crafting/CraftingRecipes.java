package elex.crafting;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import cpw.mods.fml.common.registry.GameRegistry;
import elex.block.ModBlocks;
import elex.item.ModItems;
import elex.lib.BlockIds;
import elex.lib.ItemIds;

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
        for (int i = 0; i < ItemIds.ELEX_ORE_REAL_UNLOCALIZED_NAMES.length; i++) {
            GameRegistry.addRecipe(new ItemStack(ModBlocks.blockElExItemOreStorage, 1, i), new Object[] { "XXX", "XXX", "XXX", 'X', new ItemStack(ModItems.itemElExOre, 1, i) });
        }
        // Storage Block Recipes for Metals
        for (int i = 0; i < BlockIds.BLOCK_ELEX_METAL_STORAGE_REAL_UNLOCALIZED_NAMES.size(); i++) {
            GameRegistry.addRecipe(new ItemStack(ModBlocks.blockElExMetalStorage, 1, i), new Object[] { "XXX", "XXX", "XXX", 'X', new ItemStack(ModItems.itemElExIngot, 1, i) });
        }
        for (int i = 0; i < BlockIds.BLOCK_ELEX_METAL_STORAGE_2_REAL_UNLOCALIZED_NAMES.size(); i++) {
            int j = i + BlockIds.BLOCK_ELEX_METAL_STORAGE_REAL_UNLOCALIZED_NAMES.size();
            
            GameRegistry.addRecipe(new ItemStack(ModBlocks.blockElExMetalStorage2, 1, i), new Object[] { "XXX", "XXX", "XXX", 'X', new ItemStack(ModItems.itemElExIngot, 1, j) });
        }
        for (int i = 0; i < BlockIds.BLOCK_ELEX_METAL_STORAGE_3_REAL_UNLOCALIZED_NAMES.size(); i++) {
            int j = i + BlockIds.BLOCK_ELEX_METAL_STORAGE_REAL_UNLOCALIZED_NAMES.size() + BlockIds.BLOCK_ELEX_METAL_STORAGE_2_REAL_UNLOCALIZED_NAMES.size();
            
            GameRegistry.addRecipe(new ItemStack(ModBlocks.blockElExMetalStorage3, 1, i), new Object[] { "XXX", "XXX", "XXX", 'X', new ItemStack(ModItems.itemElExIngot, 1, j) });
        }
        for (int i = 0; i < BlockIds.BLOCK_ELEX_METAL_STORAGE_4_REAL_UNLOCALIZED_NAMES.size(); i++) {
            int j = i + BlockIds.BLOCK_ELEX_METAL_STORAGE_REAL_UNLOCALIZED_NAMES.size() + BlockIds.BLOCK_ELEX_METAL_STORAGE_2_REAL_UNLOCALIZED_NAMES.size() + BlockIds.BLOCK_ELEX_METAL_STORAGE_3_REAL_UNLOCALIZED_NAMES.size();
            
            GameRegistry.addRecipe(new ItemStack(ModBlocks.blockElExMetalStorage4, 1, i), new Object[] { "XXX", "XXX", "XXX", 'X', new ItemStack(ModItems.itemElExIngot, 1, j) });
        }
        for (int i = 0; i < BlockIds.BLOCK_ELEX_METAL_STORAGE_5_REAL_UNLOCALIZED_NAMES.size(); i++) {
            int j = i + BlockIds.BLOCK_ELEX_METAL_STORAGE_REAL_UNLOCALIZED_NAMES.size() + BlockIds.BLOCK_ELEX_METAL_STORAGE_2_REAL_UNLOCALIZED_NAMES.size() + BlockIds.BLOCK_ELEX_METAL_STORAGE_3_REAL_UNLOCALIZED_NAMES.size() + BlockIds.BLOCK_ELEX_METAL_STORAGE_4_REAL_UNLOCALIZED_NAMES.size();
            
            GameRegistry.addRecipe(new ItemStack(ModBlocks.blockElExMetalStorage5, 1, i), new Object[] { "XXX", "XXX", "XXX", 'X', new ItemStack(ModItems.itemElExIngot, 1, j) });
        }
        // Machine Case Recipes
        GameRegistry.addRecipe(new ItemStack(ModBlocks.blockMachineCase, 1, 0), new Object[] { "XXX", "X X", "XXX", 'X', new ItemStack(ModItems.itemAlloyIngot, 1, 0)});
        GameRegistry.addRecipe(new ItemStack(ModBlocks.blockMachineCase, 1, 1), new Object[] { "XXX", "X X", "XXX", 'X', new ItemStack(ModItems.itemAlloyIngot, 1, 4)});
        GameRegistry.addRecipe(new ItemStack(ModBlocks.blockMachineCase, 1, 2), new Object[] { "XXX", "X X", "XXX", 'X', new ItemStack(ModItems.itemAlloyIngot, 1, 5)});
        GameRegistry.addRecipe(new ItemStack(ModBlocks.blockMachineCase, 1, 3), new Object[] { "XXX", "X X", "XXX", 'X', new ItemStack(ModItems.itemElExIngot, 1, 61)});
        // Temporary Alloy Dust Recipes
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.itemAlloyDust, 4, 0), new ItemStack(ModItems.itemVanillaDust, 1, 1), new ItemStack(ModItems.itemVanillaDust, 1, 1), new ItemStack(ModItems.itemVanillaDust, 1, 1), new ItemStack(ModItems.itemVanillaDust, 1, 5));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.itemAlloyDust, 4, 1), new ItemStack(ModItems.itemVanillaDust, 1, 1), new ItemStack(ModItems.itemVanillaDust, 1, 1), new ItemStack(ModItems.itemElExMetalDust, 1, 10), new ItemStack(ModItems.itemVanillaDust, 1, 5));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.itemAlloyDust, 4, 2), new ItemStack(ModItems.itemElExMetalDust, 1, 15), new ItemStack(ModItems.itemElExMetalDust, 1, 15), new ItemStack(ModItems.itemElExMetalDust, 1, 15), new ItemStack(ModItems.itemElExMetalDust, 1, 33));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.itemAlloyDust, 4, 3), new ItemStack(ModItems.itemVanillaDust, 1, 2), new ItemStack(ModItems.itemVanillaDust, 1, 2), new ItemStack(ModItems.itemElExMetalDust, 1, 30), new ItemStack(ModItems.itemElExMetalDust, 1, 30));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.itemAlloyDust, 4, 4), new ItemStack(ModItems.itemElExMetalDust, 1, 4), new ItemStack(ModItems.itemElExMetalDust, 1, 4), new ItemStack(ModItems.itemElExMetalDust, 1, 4), new ItemStack(ModItems.itemElExMetalDust, 1, 8));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.itemAlloyDust, 4, 5), new ItemStack(ModItems.itemElExMetalDust, 1, 57), new ItemStack(ModItems.itemElExMetalDust, 1, 57), new ItemStack(ModItems.itemElExMetalDust, 1, 57), new ItemStack(ModItems.itemElExMetalDust, 1, 58));
        // Research Binder Recipe
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.itemResearchBinder, 1), new ItemStack(Item.leather, 1), new ItemStack(ModItems.itemIronNugget, 1), new ItemStack(Item.paper, 1), new ItemStack(Item.dyePowder, 1, 0));
        
        // Smelting Recipes for Compound Ore Dusts
        for (int i = 0; i < ItemIds.ELEX_ORE_REAL_UNLOCALIZED_NAMES.length; i++) {
            FurnaceRecipes.smelting().addSmelting(ItemIds.ELEX_COMPOUND_DUST, i, new ItemStack(ModItems.itemElExOre, 1, i), 5F);
        }
        // Smelting Recipes for Emerald and Nether Quartz Dust
        FurnaceRecipes.smelting().addSmelting(ItemIds.VANILLA_DUST, 0, new ItemStack(Item.netherQuartz, 1), 5F);
        FurnaceRecipes.smelting().addSmelting(ItemIds.VANILLA_DUST, 3, new ItemStack(Item.emerald, 1), 5F);
        // Smelting Recipes for Metal Dusts
        for (int i = 0; i < ItemIds.ELEX_INGOT_REAL_UNLOCALIZED_NAMES.size(); i++) {
            FurnaceRecipes.smelting().addSmelting(ItemIds.ELEX_METAL_DUST, i, new ItemStack(ModItems.itemElExIngot, 1, i), 5F);
        }
        // Smelting Recipes for Alloy Dusts
        for (int i = 0; i < ItemIds.ALLOY_INGOT_REAL_UNLOCALIZED_NAMES.length; i++) {
            FurnaceRecipes.smelting().addSmelting(ItemIds.ALLOY_DUST, i, new ItemStack(ModItems.itemAlloyIngot, 1, i), 5F);
        }
        // Smelting Recipes for Iron and Gold Dust
        FurnaceRecipes.smelting().addSmelting(ItemIds.VANILLA_DUST, 1, new ItemStack(Item.ingotIron, 1), 5F);
        FurnaceRecipes.smelting().addSmelting(ItemIds.VANILLA_DUST, 2, new ItemStack(Item.ingotGold, 1), 5F);
        // Smelting Recipes for Native Metal Ores
        for (int i = 0; i < BlockIds.BLOCK_ELEX_ORE_REAL_UNLOCALIZED_NAMES.length; i++) {
            FurnaceRecipes.smelting().addSmelting(BlockIds.BLOCK_ELEX_ORE, i, new ItemStack(ModItems.itemElExIngot, 1, ItemIds.METAL_ORE_ELEMENT_IDS.get(i) - 1), 5F);
        }
        for (int i = 0; i < BlockIds.BLOCK_ELEX_ORE_2_REAL_UNLOCALIZED_NAMES.length; i++) {
            int j = i + BlockIds.BLOCK_ELEX_ORE_REAL_UNLOCALIZED_NAMES.length;
            FurnaceRecipes.smelting().addSmelting(BlockIds.BLOCK_ELEX_ORE_2, i, new ItemStack(ModItems.itemElExIngot, 1, ItemIds.METAL_ORE_ELEMENT_IDS.get(j) - 1), 5F);
        }
        // Smelting Recipes for Compound Ores
        for (int i = 0; i < BlockIds.ITEM_ELEX_ORE_REAL_UNLOCALIZED_NAMES.length; i++) {
            FurnaceRecipes.smelting().addSmelting(BlockIds.ITEM_ELEX_ORE, i, new ItemStack(ModItems.itemElExOre, 1, i), 5F);
        }
        for (int i = 0; i < BlockIds.ITEM_ELEX_ORE_2_REAL_UNLOCALIZED_NAMES.length; i++) {
            int j = i + BlockIds.ITEM_ELEX_ORE_REAL_UNLOCALIZED_NAMES.length;
            
            FurnaceRecipes.smelting().addSmelting(BlockIds.ITEM_ELEX_ORE_2, i, new ItemStack(ModItems.itemElExOre, 1, j), 5F);
        }
        for (int i = 0; i < BlockIds.ITEM_ELEX_ORE_3_REAL_UNLOCALIZED_NAMES.length; i++) {
            int j = i + BlockIds.ITEM_ELEX_ORE_REAL_UNLOCALIZED_NAMES.length + BlockIds.ITEM_ELEX_ORE_2_REAL_UNLOCALIZED_NAMES.length;
            
            FurnaceRecipes.smelting().addSmelting(BlockIds.ITEM_ELEX_ORE_3, i, new ItemStack(ModItems.itemElExOre, 1, j), 5F);
        }
    }
}
