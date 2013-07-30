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
        GameRegistry.addRecipe(new ItemStack(ModItems.mercuryInjector, 1), new Object[] { "X", "Z", "Y", 'X', Item.ingotIron, 'Z', Item.slimeBall, 'Y', Item.stick });
        //GameRegistry.addRecipe(new ItemStack(ModItems.mercuryInjector, 1), new Object[] { "X", "Z", "Y", 'X', Item.ingotIron, 'Z', "molecule_1hg", 'Y', Item.stick });
        /*for (int i = 0; i < ItemIds.ELEX_ORE_REAL_UNLOCALIZED_NAMES.length; i++) {
            GameRegistry.addRecipe(new ItemStack(ModBlocks.blockElExItemOreStorage, 1, i), new Object[] { "XXX", "XXX", "XXX", 'X', new ItemStack(ModItems.itemElExOre, 1, i) });
            //GameRegistry.addRecipe(new ItemStack(ModBlocks.blockElExItemOreStorage, 1, i), new Object[] { "XXX", "XXX", "XXX", 'X', ItemIds.ELEX_ORE_REAL_UNLOCALIZED_NAMES[i] });
        }
        for (int i = 0; i < BlockIds.BLOCK_ELEX_METAL_STORAGE_REAL_UNLOCALIZED_NAMES.length; i++) {
            GameRegistry.addRecipe(new ItemStack(ModBlocks.blockElExMetalStorage, 1, i), new Object[] { "XXX", "XXX", "XXX", 'X', new ItemStack(ModItems.itemElExIngot, 1, i) });
            //GameRegistry.addRecipe(new ItemStack(ModBlocks.blockElExMetalStorage, 1, i), new Object[] { "XXX", "XXX", "XXX", 'X', ItemIds.ELEX_INGOT_REAL_UNLOCALIZED_NAMES[i] });
        }
        for (int i = 0; i < BlockIds.BLOCK_ELEX_METAL_STORAGE_2_REAL_UNLOCALIZED_NAMES.length; i++) {
            int j = i + BlockIds.BLOCK_ELEX_METAL_STORAGE_REAL_UNLOCALIZED_NAMES.length;
            
            GameRegistry.addRecipe(new ItemStack(ModBlocks.blockElExMetalStorage2, 1, i), new Object[] { "XXX", "XXX", "XXX", 'X', new ItemStack(ModItems.itemElExIngot, 1, j) });
            //GameRegistry.addRecipe(new ItemStack(ModBlocks.blockElExMetalStorage2, 1, i), new Object[] { "XXX", "XXX", "XXX", 'X', ItemIds.ELEX_INGOT_REAL_UNLOCALIZED_NAMES[j] });
        }
        
        for (int i = 0; i < ItemIds.ELEX_ORE_REAL_UNLOCALIZED_NAMES.length; i++) {
            FurnaceRecipes.smelting().addSmelting(ItemIds.ELEX_COMPOUND_DUST, i, new ItemStack(ModItems.itemElExOre, 1, i), 5F);
        }
        FurnaceRecipes.smelting().addSmelting(ItemIds.VANILLA_DUST, 0, new ItemStack(Item.netherQuartz, 1), 5F);
        for (int i = 0; i < ItemIds.ELEX_INGOT_REAL_UNLOCALIZED_NAMES.length; i++) {
            FurnaceRecipes.smelting().addSmelting(ItemIds.ELEX_METAL_DUST, i, new ItemStack(ModItems.itemElExIngot, 1, i), 5F);
        }
        FurnaceRecipes.smelting().addSmelting(ItemIds.VANILLA_DUST, 1, new ItemStack(Item.ingotIron, 1), 5F);
        FurnaceRecipes.smelting().addSmelting(ItemIds.VANILLA_DUST, 2, new ItemStack(Item.ingotGold, 1), 5F);
        for (int i = 0; i < BlockIds.BLOCK_ELEX_ORE_REAL_UNLOCALIZED_NAMES.length; i++) {
            FurnaceRecipes.smelting().addSmelting(BlockIds.BLOCK_ELEX_ORE, i, new ItemStack(ModItems.itemElExIngot, 1, i), 5F);
        }
        for (int i = 0; i < BlockIds.BLOCK_ELEX_ORE_2_REAL_UNLOCALIZED_NAMES.length; i++) {
            int j = i + BlockIds.BLOCK_ELEX_ORE_REAL_UNLOCALIZED_NAMES.length;
            FurnaceRecipes.smelting().addSmelting(BlockIds.BLOCK_ELEX_ORE_2, i, new ItemStack(ModItems.itemElExIngot, 1, j), 5F);
        }*/
    }
}
