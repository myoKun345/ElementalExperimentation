package elex.compatibility.ic2;

import ic2.api.item.Items;

import java.util.logging.Level;

import net.minecraft.item.ItemStack;
import elex.api.ElexAPI;
import elex.core.LogHelper;
import elex.core.ModItems;
import elex.lib.Reference;

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
        ElexAPI.addGrinderRecipe(Items.getItem("copperOre"), new ItemStack(ModItems.itemElExMetalDust, 2, 15), 100, Reference.MOD_ID + "|IC2Compat");
        LogHelper.log(Level.INFO, Items.getItem("copperOre")
                .getUnlocalizedName());
    }
    
}
