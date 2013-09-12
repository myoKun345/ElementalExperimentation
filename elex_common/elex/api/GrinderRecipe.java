package elex.api;

import java.util.HashMap;

import net.minecraft.item.ItemStack;

/**
 * Elemental Experimentation
 * 
 * GrinderRecipe
 * 
 * @author Myo-kun
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */
public class GrinderRecipe {
    
    public static HashMap<String, GrinderRecipe> grinderRecipes = new HashMap<String, GrinderRecipe>();
    
    public ItemStack input;
    public ItemStack mainOutput;
    public ItemStack bonusOutput;
    public int bonusChance;
    public int time;
    
    public GrinderRecipe(ItemStack input, ItemStack main, ItemStack bonus, int chance, int time) {
        this.input = input;
        this.mainOutput = main;
        this.bonusOutput = bonus;
        this.bonusChance = chance;
        this.time = time;
    }
    
    public static boolean canBeDone(ItemStack input) {
        if (input != null) {
            if (grinderRecipes.containsKey(input.getUnlocalizedName())) {
                return true;
            }
            else {
                return false;
            }
        }
        else {
            return false;
        }
    }
    
    @Override
    public String toString() {
        return "Input: " + this.input.getUnlocalizedName() + " Output: " + this.mainOutput.getUnlocalizedName() + " Bonus: " + this.bonusOutput.getUnlocalizedName();
    }
    
}
