package elex.compatibility.ic2;

import ic2.api.item.Items;
import net.minecraft.item.ItemStack;
import elex.api.ElexAPI;
import elex.core.ModItems;
import elex.core.Reference;

/**
 * Elemental Experimentation
 * 
 * GrinderRecipes
 * 
 * @author Myo-kun
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */
public class GrinderRecipes {
    
    public static void addGrinderRecipes() {
        ElexAPI.addGrinderRecipe(Items.getItem("copperOre"), new ItemStack(ModItems.itemElExMetalDust, 2, 14), 100, Reference.MOD_ID + "|IC2Compat");
        ElexAPI.addGrinderRecipe(Items.getItem("tinOre"), new ItemStack(ModItems.itemElExMetalDust, 2, 33), 100, Reference.MOD_ID + "|IC2Compat");
        ElexAPI.addGrinderRecipe(Items.getItem("uraniumOre"), new ItemStack(ModItems.itemElExMetalDust, 2, 69), new ItemStack(ModItems.itemElExMetalDust, 1, 67), 7, 125, Reference.MOD_ID + "|IC2Compat");
        ElexAPI.addGrinderRecipe(Items.getItem("leadOre"), new ItemStack(ModItems.itemElExMetalDust, 2, 61), new ItemStack(ModItems.itemElExMetalDust, 1, 16), 5, 100, Reference.MOD_ID + "|IC2Compat");
    }
    
}
